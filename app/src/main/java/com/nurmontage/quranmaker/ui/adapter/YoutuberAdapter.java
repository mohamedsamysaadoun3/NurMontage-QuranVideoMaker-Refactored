package com.nurmontage.quranmaker.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.signature.ObjectKey;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.model.YoutuberModel;
import java.util.List;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

/* loaded from: classes2.dex */
public class YoutuberAdapter extends RecyclerView.Adapter<ViewHolder> {
    private String APP_VERSION;
    private int h;
    private IYoutuber iYoutuber;
    private List<YoutuberModel> images;
    private int w;

    public interface IYoutuber {
        void onClick(String str);
    }

    public YoutuberAdapter(IYoutuber iYoutuber, List<YoutuberModel> list, String str, int i, int i2) {
        this.images = list;
        this.APP_VERSION = str;
        this.iYoutuber = iYoutuber;
        this.w = i;
        this.h = i2;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view.findViewById(R.id.img);
            view.findViewById(R.id.thumbnail_ytb).setVisibility(0);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.adapter.YoutuberAdapter.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (YoutuberAdapter.this.iYoutuber != null) {
                        YoutuberAdapter.this.iYoutuber.onClick(((YoutuberModel) YoutuberAdapter.this.images.get(ViewHolder.this.getAdapterPosition())).getLnk());
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_img_bg, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Glide.with(viewHolder.imageView).asBitmap().load(Integer.valueOf(this.images.get(i).getImg())).override(this.w, this.h).signature(new ObjectKey(this.APP_VERSION)).diskCacheStrategy(DiskCacheStrategy.NONE).transform(new MultiTransformation(new RoundedCornersTransformation(8, 0, RoundedCornersTransformation.CornerType.ALL))).into(viewHolder.imageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<YoutuberModel> list = this.images;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
