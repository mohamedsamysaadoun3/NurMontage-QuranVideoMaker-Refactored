package com.nurmontage.quranmaker.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.model.ModelFeatures;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import java.util.List;

/* loaded from: classes2.dex */
public class FeaturesAdapter extends RecyclerView.Adapter<ViewHolder> {
    private boolean isSubscibe;
    private List<ModelFeatures> list;

    public void setSubscribe(boolean z) {
        this.isSubscibe = z;
        notifyDataSetChanged();
    }

    public FeaturesAdapter(List<ModelFeatures> list) {
        this.list = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextCustomFont text;

        public ViewHolder(View view) {
            super(view);
            this.text = (TextCustomFont) view.findViewById(R.id.tv_feature);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_feature, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.text.setText(this.list.get(i).getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<ModelFeatures> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
