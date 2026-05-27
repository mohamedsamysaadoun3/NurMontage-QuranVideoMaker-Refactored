package com.nurmontage.quranmaker.ui.adapter;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.nurmontage.quranmaker.R;

/* loaded from: classes2.dex */
public class ColorAdapter extends RecyclerView.Adapter<ViewHolder> {
    private int[] colors;
    private boolean enabled = true;
    public IColor iColorCallback;
    private int pos_select;

    public interface IColor {
        void onColor(int i, int i2);
    }

    public ColorAdapter(IColor iColor, int[] iArr, int i) {
        this.colors = iArr;
        this.iColorCallback = iColor;
        this.pos_select = i;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view.findViewById(R.id.image);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.adapter.ColorAdapter.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (ColorAdapter.this.iColorCallback == null || ColorAdapter.this.pos_select == ViewHolder.this.getAdapterPosition() || !ColorAdapter.this.enabled) {
                        return;
                    }
                    int i = ColorAdapter.this.pos_select;
                    ColorAdapter.this.pos_select = ViewHolder.this.getAdapterPosition();
                    ColorAdapter.this.notifyItemChanged(i);
                    ColorAdapter.this.notifyItemChanged(ColorAdapter.this.pos_select);
                    ColorAdapter.this.iColorCallback.onColor(ColorAdapter.this.colors[ViewHolder.this.getAdapterPosition()], ViewHolder.this.getAdapterPosition());
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_color, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        setGradientBackground(viewHolder.imageView, viewHolder.itemView, this.colors[i], i == this.pos_select);
    }

    public void setGradientBackground(View view, View view2, int i, boolean z) {
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(100.0f);
            gradientDrawable.setStroke(3, -1);
            view2.setBackground(gradientDrawable);
        } else {
            view2.setBackground(null);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(100.0f);
        gradientDrawable2.setColor(i);
        view.setBackground(gradientDrawable2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int[] iArr = this.colors;
        if (iArr == null) {
            return 0;
        }
        return iArr.length;
    }

    public int getPos_select() {
        return this.pos_select;
    }
}
