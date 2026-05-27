package com.nurmontage.quranmaker.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.model.WordModel;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import java.util.List;

/* loaded from: classes2.dex */
public class WordAyaAdapter extends RecyclerView.Adapter<ViewHolder> {
    private IWordAya iWordAya;
    private List<WordModel> list;

    public interface IWordAya {
        void onClick();
    }

    public WordAyaAdapter(List<WordModel> list) {
        this.list = list;
    }

    public WordAyaAdapter(IWordAya iWordAya, List<WordModel> list) {
        this.list = list;
        this.iWordAya = iWordAya;
    }

    public void setList(List<WordModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextCustomFont text;

        public ViewHolder(View view) {
            super(view);
            TextCustomFont textCustomFont = (TextCustomFont) view.findViewById(R.id.word_aya);
            this.text = textCustomFont;
            textCustomFont.setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.adapter.WordAyaAdapter.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    ((WordModel) WordAyaAdapter.this.list.get(ViewHolder.this.getAdapterPosition())).setSelected(!r2.isSelected());
                    WordAyaAdapter.this.notifyItemChanged(ViewHolder.this.getAdapterPosition());
                    if (WordAyaAdapter.this.iWordAya != null) {
                        WordAyaAdapter.this.iWordAya.onClick();
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_word_aya, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        WordModel wordModel = this.list.get(i);
        viewHolder.text.setText(wordModel.getW());
        if (wordModel.isSelected()) {
            viewHolder.text.setBackgroundResource(R.drawable.round_btn_quran_select);
            viewHolder.text.setTextColor(-12434878);
        } else {
            viewHolder.text.setBackgroundResource(R.drawable.round_btn_in_dark);
            viewHolder.text.setTextColor(-1);
        }
    }

    public List<WordModel> getList() {
        return this.list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<WordModel> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
