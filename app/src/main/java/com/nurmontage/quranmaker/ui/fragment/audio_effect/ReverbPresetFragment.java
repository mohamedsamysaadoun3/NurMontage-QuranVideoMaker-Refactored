package com.nurmontage.quranmaker.ui.fragment.audio_effect;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.adapter.ReverbAdapter;
import com.nurmontage.quranmaker.common.Common;
import com.nurmontage.quranmaker.constant.EffectAudioType;
import com.nurmontage.quranmaker.databinding.FragmentReverbPresetBinding;
import com.nurmontage.quranmaker.model.timeline.EntityAudio;
import com.nurmontage.quranmaker.ui.fragment.EditMediaFragment;
import com.nurmontage.quranmaker.model.EffectAudio;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class ReverbPresetFragment extends Fragment {
    public static ReverbPresetFragment instance;
    private FragmentReverbPresetBinding binding;
    private EntityAudio entityAudio;
    private EditMediaFragment.IEditMediaCallback iEditMediaCallback;
    private ReverbAdapter.IReverbPresetCallback iReverbPresetCallback = new ReverbAdapter.IReverbPresetCallback() { // from class: com.nurmontage.quranmaker.ui.fragment.audio_effect.ReverbPresetFragment.2
        @Override // com.nurmontage.quranmaker.ui.adapter.ReverbAdapter.IReverbPresetCallback
        public void cmd(String str, int i) {
            if (ReverbPresetFragment.this.iEditMediaCallback != null) {
                EffectAudio effectAudio = ReverbPresetFragment.this.entityAudio.getEffectAudio();
                if (str == null && ReverbPresetFragment.this.entityAudio.getEffectAudio().getReverbPreset() == null) {
                    ReverbPresetFragment.this.iEditMediaCallback.startPreview();
                    return;
                }
                effectAudio.setReverbPreset(str);
                effectAudio.setReverbPreset_index_list(i);
                float start = effectAudio.getStart() / 1000.0f;
                float end = effectAudio.getEnd() / 1000.0f;
                float f = end - start;
                ArrayList arrayList = new ArrayList();
                arrayList.add(String.format(Locale.US, "atrim=start=%.2f:end=%.2f", Float.valueOf(start), Float.valueOf(end)));
                arrayList.add("asetpts=N/SR/TB");
                if (effectAudio.isRemoveNoise()) {
                    arrayList.add("afftdn=nf=-25");
                }
                arrayList.add(String.format(Locale.US, "volume=%.2f", Float.valueOf(effectAudio.getVolume())));
                if (effectAudio.getFade_in() > 0) {
                    arrayList.add(String.format(Locale.US, "afade=t=in:st=0:d=%.2f", Float.valueOf(effectAudio.getFade_in() / 1000.0f)));
                }
                if (effectAudio.getFade_out() > 0) {
                    float fade_out = effectAudio.getFade_out() / 1000.0f;
                    arrayList.add(String.format(Locale.US, "afade=t=out:st=%.2f:d=%.2f", Float.valueOf(f - fade_out), Float.valueOf(fade_out)));
                }
                if (effectAudio.isEnhance()) {
                    arrayList.add(Common.ENHANCE_CMD);
                }
                if (effectAudio.getReverbPreset() != null) {
                    arrayList.add(effectAudio.getReverbPreset());
                }
                if (effectAudio.getDecays() > 0) {
                    arrayList.add(String.format(Locale.US, "aecho=%.2f:%.2f:%s:%s", Float.valueOf(1.0f), Float.valueOf(effectAudio.getOutGain()), effectAudio.getDelays_cmd(), effectAudio.getDecays_cmd()));
                }
                if (effectAudio.getSpeed() != 1.0f) {
                    arrayList.addAll(ReverbPresetFragment.this.buildSpeedFilters(effectAudio.getSpeed()));
                }
                ReverbPresetFragment.this.iEditMediaCallback.onCmdPlay(TextUtils.join(",", arrayList));
            }
        }

        @Override // com.nurmontage.quranmaker.ui.adapter.ReverbAdapter.IReverbPresetCallback
        public void pause() {
            if (ReverbPresetFragment.this.iEditMediaCallback != null) {
                ReverbPresetFragment.this.iEditMediaCallback.pausePreview();
            }
        }
    };

    public static ReverbPresetFragment getInstance(EditMediaFragment.IEditMediaCallback iEditMediaCallback, EntityAudio entityAudio) {
        if (instance == null) {
            instance = new ReverbPresetFragment(iEditMediaCallback, entityAudio);
        }
        return instance;
    }

    public ReverbPresetFragment(EditMediaFragment.IEditMediaCallback iEditMediaCallback, EntityAudio entityAudio) {
        this.iEditMediaCallback = iEditMediaCallback;
        this.entityAudio = entityAudio;
    }

    public ReverbPresetFragment() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentReverbPresetBinding inflate = FragmentReverbPresetBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        LinearLayout root = inflate.getRoot();
        if (this.iEditMediaCallback != null && this.entityAudio != null) {
            RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.rv);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setHasFixedSize(true);
            recyclerView.setItemAnimator(null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Reverb(getResources().getString(R.string.reverb_normal), null));
            arrayList.add(new Reverb(getResources().getString(R.string.reverb_masjid), "aecho=0.9:0.4:900|1800:0.20|0.15"));
            arrayList.add(new Reverb(getResources().getString(R.string.reverb_masjid_2), "aecho=0.9:0.4:900:0.18"));
            arrayList.add(new Reverb(getResources().getString(R.string.reverb_studio), "aecho=0.8:0.35:400|700:0.20|0.15"));
            arrayList.add(new Reverb(getResources().getString(R.string.reverb_quiet_room), "aecho=0.6:0.3:300:0.12"));
            arrayList.add(new Reverb(getResources().getString(R.string.reverb_tiled_room), "aecho=0.9:0.4:600|1200:0.20|0.15"));
            arrayList.add(new Reverb(getResources().getString(R.string.reverb_deep), "aecho=0.6:0.35:1000:0.20"));
            recyclerView.setAdapter(new ReverbAdapter(arrayList, this.iReverbPresetCallback, this.entityAudio.getEffectAudio().getReverbPreset_index_list()));
            root.findViewById(R.id.btn_done).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.fragment.audio_effect.ReverbPresetFragment.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ReverbPresetFragment.this.iEditMediaCallback != null) {
                        ReverbPresetFragment.this.iEditMediaCallback.pausePreview();
                        ReverbPresetFragment.this.iEditMediaCallback.onDone();
                    }
                }
            });
            root.findViewById(R.id.btn_appl_all).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.fragment.audio_effect.ReverbPresetFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ReverbPresetFragment.this.m1191x99ad9501(view);
                }
            });
        }
        return root;
    }

    /* renamed from: lambda$onCreateView$0$com-nurmontage-quranmaker-ui-fragment-audio_effect-ReverbPresetFragment, reason: not valid java name */
    /* synthetic */ void m1191x99ad9501(View view) {
        applyAll();
    }

    private void applyAll() {
        EffectAudio effectAudio = this.entityAudio.getEffectAudio();
        float start = effectAudio.getStart() / 1000.0f;
        float end = effectAudio.getEnd() / 1000.0f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format(Locale.US, "atrim=start=%.2f:end=%.2f", Float.valueOf(start), Float.valueOf(end)));
        arrayList.add("asetpts=N/SR/TB");
        if (effectAudio.isRemoveNoise()) {
            arrayList.add("afftdn=nf=-25");
        }
        arrayList.add(String.format(Locale.US, "volume=%.2f", Float.valueOf(effectAudio.getVolume())));
        if (effectAudio.getFade_in() > 0) {
            arrayList.add("afade=t=in:st=0:d=" + effectAudio.getFade_in());
        }
        if (effectAudio.getFade_out() > 0) {
            float fade_out = effectAudio.getFade_out();
            arrayList.add("afade=t=out:st=" + ((end - start) - fade_out) + ":d=" + fade_out);
        }
        if (effectAudio.isEnhance()) {
            arrayList.add(Common.ENHANCE_CMD);
        }
        if (effectAudio.getReverbPreset() != null) {
            arrayList.add(effectAudio.getReverbPreset());
        }
        if (effectAudio.getDecays() > 0) {
            arrayList.add(String.format(Locale.US, "aecho=%.2f:%.2f:%s:%s", Float.valueOf(1.0f), Float.valueOf(effectAudio.getOutGain()), effectAudio.getDelays_cmd(), effectAudio.getDecays_cmd()));
        }
        if (effectAudio.getSpeed() != 1.0f) {
            arrayList.addAll(buildSpeedFilters(effectAudio.getSpeed()));
        }
        this.iEditMediaCallback.updateEntity(EffectAudioType.REVERB, this.entityAudio);
        this.iEditMediaCallback.onCmdAll(effectAudio);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> buildSpeedFilters(float f) {
        ArrayList arrayList = new ArrayList();
        if (f < 0.5f) {
            while (f < 0.5f) {
                arrayList.add("atempo=0.5");
                f /= 0.5f;
            }
            arrayList.add(String.format(Locale.US, "atempo=%.2f", Float.valueOf(f)));
        } else if (f > 2.0f) {
            while (f > 2.0f) {
                arrayList.add("atempo=2.0");
                f /= 2.0f;
            }
            arrayList.add(String.format(Locale.US, "atempo=%.2f", Float.valueOf(f)));
        } else {
            arrayList.add(String.format(Locale.US, "atempo=%.2f", Float.valueOf(f)));
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        EditMediaFragment.IEditMediaCallback iEditMediaCallback = this.iEditMediaCallback;
        if (iEditMediaCallback != null) {
            iEditMediaCallback.pausePreview();
        }
        this.iReverbPresetCallback = null;
        super.onDestroyView();
        instance = null;
        this.binding = null;
    }
}
