package com.nurmontage.quranmaker.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.fragment.audio_effect.Reverb;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import java.util.List;

/* loaded from: classes2.dex */
public class ReverbAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final IReverbPresetCallback iReverbCallback;
    private List<Reverb> list;
    private int select;

    public interface IReverbPresetCallback {
        void cmd(String str, int i);

        void pause();
    }

    public ReverbAdapter(List<Reverb> list, IReverbPresetCallback iReverbPresetCallback, int i) {
        this.list = list;
        this.select = i;
        this.iReverbCallback = iReverbPresetCallback;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_btn_play;
        private TextCustomFont text;

        public ViewHolder(View view) {
            super(view);
            this.text = (TextCustomFont) view.findViewById(R.id.word_aya);
            this.iv_btn_play = (ImageView) view.findViewById(R.id.iv_btn_play);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.adapter.ReverbAdapter.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (ReverbAdapter.this.iReverbCallback != null) {
                        ReverbAdapter.this.iReverbCallback.pause();
                        if (ReverbAdapter.this.select == ViewHolder.this.getAdapterPosition()) {
                            int i = ReverbAdapter.this.select;
                            ReverbAdapter.this.select = -1;
                            ReverbAdapter.this.notifyItemChanged(i);
                            ReverbAdapter.this.notifyItemChanged(ViewHolder.this.getAdapterPosition());
                            return;
                        }
                        int i2 = ReverbAdapter.this.select;
                        ReverbAdapter.this.select = ViewHolder.this.getAdapterPosition();
                        ReverbAdapter.this.notifyItemChanged(i2);
                        ReverbAdapter.this.notifyItemChanged(ReverbAdapter.this.select);
                        ReverbAdapter.this.iReverbCallback.cmd(((Reverb) ReverbAdapter.this.list.get(ViewHolder.this.getAdapterPosition())).getCmd_ffmpeg(), ViewHolder.this.getAdapterPosition());
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_reverbe, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.text.setText(this.list.get(i).getName());
        if (this.select == i) {
            viewHolder.itemView.setBackgroundResource(R.drawable.item_reverb_select);
            viewHolder.iv_btn_play.setImageResource(R.drawable.pause_24px);
        } else {
            viewHolder.itemView.setBackgroundResource(R.drawable.round_btn_in_dark);
            viewHolder.iv_btn_play.setImageResource(R.drawable.play_arrow_24px);
        }
    }

    public List<Reverb> getList() {
        return this.list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Reverb> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
