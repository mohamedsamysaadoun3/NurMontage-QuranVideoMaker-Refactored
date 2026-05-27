package com.nurmontage.quranmaker.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.util.bitmap.DrawableHelper;
import java.util.List;

/* loaded from: classes2.dex */
public class IconQuranAdapters extends RecyclerView.Adapter<ViewHolder> {
    private IIconQuranCallback iconQuranCallback;
    private List<String> list;
    private int select;

    public interface IIconQuranCallback {
        void onIcon(String str);
    }

    public IconQuranAdapters(IIconQuranCallback iIconQuranCallback, List<String> list, int i) {
        this.iconQuranCallback = iIconQuranCallback;
        this.list = list;
        this.select = i;
        if (i >= list.size()) {
            this.select = 0;
        }
    }

    public int getSelect() {
        return this.select;
    }

    public boolean isHaveSelect() {
        return this.select != -1;
    }

    public void unselect() {
        int i = this.select;
        if (i == -1) {
            return;
        }
        this.select = -1;
        notifyItemChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_anim, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.animationItem.setImageResource(DrawableHelper.getIDDrawableIconByName(this.list.get(i)));
        if (i == this.select) {
            viewHolder.animationItem.setBackgroundResource(R.drawable.circle_item_menu_select);
        } else {
            viewHolder.animationItem.setBackgroundResource(R.drawable.circle_effect);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> list = this.list;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView animationItem;
        public ImageView disableView;

        public ViewHolder(View view) {
            super(view);
            this.animationItem = (ImageView) view.findViewById(R.id.anim_item);
            this.disableView = (ImageView) view.findViewById(R.id.iv_disable);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.adapter.IconQuranAdapters.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (IconQuranAdapters.this.iconQuranCallback == null || IconQuranAdapters.this.select == ViewHolder.this.getAdapterPosition()) {
                        return;
                    }
                    int i = IconQuranAdapters.this.select;
                    IconQuranAdapters.this.select = ViewHolder.this.getAdapterPosition();
                    IconQuranAdapters.this.notifyItemChanged(i);
                    IconQuranAdapters.this.notifyItemChanged(IconQuranAdapters.this.select);
                    IconQuranAdapters.this.iconQuranCallback.onIcon((String) IconQuranAdapters.this.list.get(ViewHolder.this.getAdapterPosition()));
                }
            });
        }
    }
}
