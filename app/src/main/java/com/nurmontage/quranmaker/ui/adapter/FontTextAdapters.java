package com.nurmontage.quranmaker.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.util.FontProvider;
import com.nurmontage.quranmaker.ui.fragment.FontFragment;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import java.util.List;

/* loaded from: classes2.dex */
public class FontTextAdapters extends RecyclerView.Adapter<ViewHolder> {
    private List<String> fontList;
    private final FontProvider fontProvider;
    private FontFragment.IFontCallback iFontCallback;
    private int selected;

    public FontTextAdapters(FontProvider fontProvider, FontFragment.IFontCallback iFontCallback, List<String> list, int i) {
        this.iFontCallback = iFontCallback;
        this.fontList = list;
        this.fontProvider = fontProvider;
        this.selected = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_font, viewGroup, false));
    }

    public void setSelected(int i) {
        try {
            int i2 = this.selected;
            this.selected = i;
            notifyItemChanged(i2);
            notifyItemChanged(this.selected);
            List<String> list = this.fontList;
            if (list != null) {
                String str = list.get(i);
                this.iFontCallback.onAdd(this.fontProvider.getFullName(str), this.fontProvider.getTypeface(str));
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String str = this.fontList.get(i);
        viewHolder.nameFont.setText(str);
        viewHolder.tvNumber.setText(String.valueOf(i + 1));
        try {
            viewHolder.nameFont.setTypeface(this.fontProvider.getTypeface(str));
            if (this.selected == i) {
                viewHolder.nameFont.setTextColor(-14540254);
                viewHolder.nameFont.setBackgroundResource(R.drawable.btn_item_font_state);
            } else {
                viewHolder.nameFont.setTextColor(-1);
                viewHolder.nameFont.setBackground(null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> list = this.fontList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextCustomFont nameFont;
        TextCustomFont tvNumber;

        public ViewHolder(View view) {
            super(view);
            this.nameFont = (TextCustomFont) view.findViewById(R.id.tv_font);
            this.tvNumber = (TextCustomFont) view.findViewById(R.id.tv_number);
            this.nameFont.setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.adapter.FontTextAdapters.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (FontTextAdapters.this.iFontCallback == null || FontTextAdapters.this.selected == ViewHolder.this.getAdapterPosition()) {
                        return;
                    }
                    int i = FontTextAdapters.this.selected;
                    FontTextAdapters.this.selected = ViewHolder.this.getAdapterPosition();
                    FontTextAdapters.this.notifyItemChanged(i);
                    FontTextAdapters.this.notifyItemChanged(FontTextAdapters.this.selected);
                    String str = (String) FontTextAdapters.this.fontList.get(FontTextAdapters.this.selected);
                    FontTextAdapters.this.iFontCallback.onAdd(FontTextAdapters.this.fontProvider.getFullName(str), FontTextAdapters.this.fontProvider.getTypeface(str));
                }
            });
        }
    }

    public void clear() {
        this.iFontCallback = null;
    }
}
