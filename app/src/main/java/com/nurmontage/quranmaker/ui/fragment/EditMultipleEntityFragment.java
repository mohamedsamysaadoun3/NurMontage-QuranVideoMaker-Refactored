package com.nurmontage.quranmaker.ui.fragment;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.databinding.FragmentEditMediaMultipleBinding;
import com.nurmontage.quranmaker.model.timeline.Entity;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public class EditMultipleEntityFragment extends Fragment {
    public static EditMultipleEntityFragment instance;
    private LinearLayout btn_cut;
    private int count_select;
    private FragmentEditMediaMultipleBinding fragmentBinding;
    private IEditMultipleCallback iEditMediaCallback;
    private ImageView iv_cut;
    private Resources resources;
    private TextCustomFont tv_cut;
    private TextCustomFont tv_delete;

    public interface IEditMultipleCallback {
        void onDelete();
    }

    public void setCount_select(int i) {
    }

    public static EditMultipleEntityFragment getInstance(IEditMultipleCallback iEditMultipleCallback, Resources resources, int i) {
        if (instance == null) {
            instance = new EditMultipleEntityFragment(iEditMultipleCallback, resources, i);
        }
        return instance;
    }

    public EditMultipleEntityFragment(IEditMultipleCallback iEditMultipleCallback, Resources resources, int i) {
        this.iEditMediaCallback = iEditMultipleCallback;
        this.resources = resources;
        this.count_select = i;
    }

    public EditMultipleEntityFragment() {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentEditMediaMultipleBinding inflate = FragmentEditMediaMultipleBinding.inflate(layoutInflater, viewGroup, false);
        this.fragmentBinding = inflate;
        RelativeLayout root = inflate.getRoot();
        if (this.iEditMediaCallback != null && this.resources != null) {
            ImageView imageView = (ImageView) root.findViewById(R.id.iv_cut);
            this.iv_cut = imageView;
            imageView.setColorFilter(-8355712, PorterDuff.Mode.SRC_IN);
            TextCustomFont textCustomFont = (TextCustomFont) root.findViewById(R.id.tv_delete);
            this.tv_delete = textCustomFont;
            textCustomFont.setText(this.resources.getString(R.string.delete));
            TextCustomFont textCustomFont2 = (TextCustomFont) root.findViewById(R.id.tv_cut);
            this.tv_cut = textCustomFont2;
            textCustomFont2.setText(this.resources.getString(R.string.cut));
            this.tv_cut.setTextColor(-8355712);
            root.findViewById(R.id.btn_delete).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.fragment.EditMultipleEntityFragment.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (EditMultipleEntityFragment.this.iEditMediaCallback != null) {
                        EditMultipleEntityFragment.this.iEditMediaCallback.onDelete();
                    }
                }
            });
        }
        return root;
    }

    public void checkSplit(Entity entity, float f) {
        if (entity == null) {
            return;
        }
        try {
            if (entity.getRect().left <= f && entity.getRect().right >= f) {
                this.btn_cut.setClickable(true);
                this.tv_cut.setTextColor(-1);
                this.iv_cut.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
            this.tv_cut.setTextColor(-8355712);
            this.iv_cut.setColorFilter(-8355712, PorterDuff.Mode.SRC_IN);
            this.btn_cut.setClickable(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.fragmentBinding = null;
        instance = null;
        this.iEditMediaCallback = null;
        super.onDestroyView();
    }
}
