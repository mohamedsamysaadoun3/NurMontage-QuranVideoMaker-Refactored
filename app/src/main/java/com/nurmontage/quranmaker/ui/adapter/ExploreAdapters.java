package com.nurmontage.quranmaker.ui.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.model.ExploreItem;
import com.nurmontage.quranmaker.ui.view.SquareImageViewSimple;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public class ExploreAdapters extends RecyclerView.Adapter<MyViewHolder> {
    private final List<ExploreItem> exploreItems;
    private String folder_select;
    private IExplore iExplore;
    private final int size;

    public interface IExplore {
        void done();

        void folder(File file, String str, String str2);
    }

    public ExploreAdapters(List<ExploreItem> list, int i, IExplore iExplore, String str) {
        this.exploreItems = list;
        this.size = i;
        this.iExplore = iExplore;
        this.folder_select = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_explore, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        RequestBuilder<Drawable> load = Glide.with(myViewHolder.itemView).load(this.exploreItems.get(i).getFirstFilePath());
        int i2 = this.size;
        load.override(i2, i2).centerCrop().placeholder(R.drawable.image_24px).into(myViewHolder.imageView);
        myViewHolder.tv_name.setText(this.exploreItems.get(i).getName());
        myViewHolder.tv_size.setText(this.exploreItems.get(i).getSize());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<ExploreItem> list = this.exploreItems;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private SquareImageViewSimple imageView;
        private TextCustomFont tv_name;
        private TextCustomFont tv_size;

        public MyViewHolder(View view) {
            super(view);
            this.imageView = (SquareImageViewSimple) view.findViewById(R.id.img);
            this.tv_name = (TextCustomFont) view.findViewById(R.id.tv_name);
            this.tv_size = (TextCustomFont) view.findViewById(R.id.tv_size);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.adapter.ExploreAdapters.MyViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (ExploreAdapters.this.iExplore != null) {
                        ExploreItem exploreItem = (ExploreItem) ExploreAdapters.this.exploreItems.get(MyViewHolder.this.getAdapterPosition());
                        ExploreAdapters.this.iExplore.folder(exploreItem.getFolder(), exploreItem.getName(), exploreItem.getPath());
                    }
                }
            });
        }
    }
}
