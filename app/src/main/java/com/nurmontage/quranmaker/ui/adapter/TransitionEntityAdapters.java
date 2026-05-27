package com.nurmontage.quranmaker.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.model.timeline.EntityQuranTimeline;
import com.nurmontage.quranmaker.ui.fragment.EffectAyaFragment;
import java.util.List;

/* loaded from: classes2.dex */
public class TransitionEntityAdapters extends RecyclerView.Adapter<ViewHolder> {
    private EntityQuranTimeline entityQuranTimeline;
    private EffectAyaFragment.ITransition iTransition;
    private boolean isSubscribe;
    private List<TransitionItem> list;
    private int max;
    private int select;
    private String type = "in";

    public TransitionEntityAdapters(boolean z, EffectAyaFragment.ITransition iTransition, List<TransitionItem> list, int i, EntityQuranTimeline entityQuranTimeline) {
        this.iTransition = iTransition;
        this.select = i;
        this.list = list;
        this.max = list.size();
        this.isSubscribe = z;
        this.entityQuranTimeline = entityQuranTimeline;
    }

    public int getSelect() {
        return this.select;
    }

    public void update(List<TransitionItem> list, String str, int i) {
        this.select = i;
        this.list = list;
        this.type = str;
        this.max = list.size();
        notifyDataSetChanged();
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
        if (!this.isSubscribe) {
            if (i > 10) {
                viewHolder.disableView.setVisibility(0);
            } else {
                viewHolder.disableView.setVisibility(8);
            }
        }
        viewHolder.animationItem.setRotation(this.list.get(i).getAngle());
        viewHolder.animationItem.setImageResource(this.list.get(i).getId_ressource());
        if (i == this.select) {
            viewHolder.animationItem.setBackgroundResource(R.drawable.circle_item_menu_select);
        } else {
            viewHolder.animationItem.setBackgroundResource(R.drawable.circle_effect);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.max;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView animationItem;
        public ImageView disableView;

        public ViewHolder(View view) {
            super(view);
            this.animationItem = (ImageView) view.findViewById(R.id.anim_item);
            this.disableView = (ImageView) view.findViewById(R.id.iv_disable);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.adapter.TransitionEntityAdapters.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TransitionEntityAdapters.this.iTransition != null) {
                        if (!TransitionEntityAdapters.this.isSubscribe && ViewHolder.this.getAdapterPosition() > 10) {
                            TransitionEntityAdapters.this.iTransition.toSubscribe();
                            return;
                        }
                        if (TransitionEntityAdapters.this.select == ViewHolder.this.getAdapterPosition()) {
                            return;
                        }
                        int i = TransitionEntityAdapters.this.select;
                        TransitionEntityAdapters.this.select = ViewHolder.this.getAdapterPosition();
                        TransitionEntityAdapters.this.notifyItemChanged(i);
                        TransitionEntityAdapters.this.notifyItemChanged(TransitionEntityAdapters.this.select);
                        if (TransitionEntityAdapters.this.type != null) {
                            if (TransitionEntityAdapters.this.type.equals("in")) {
                                TransitionEntityAdapters.this.iTransition.in(((TransitionItem) TransitionEntityAdapters.this.list.get(ViewHolder.this.getAdapterPosition())).getType(), TransitionEntityAdapters.this.entityQuranTimeline);
                            } else if (TransitionEntityAdapters.this.type.equals("out")) {
                                TransitionEntityAdapters.this.iTransition.out(((TransitionItem) TransitionEntityAdapters.this.list.get(ViewHolder.this.getAdapterPosition())).getType(), TransitionEntityAdapters.this.entityQuranTimeline);
                            }
                        }
                    }
                }
            });
        }
    }

    public static class TransitionItem {
        private int angle;
        private int id_ressource;
        private String type;

        public TransitionItem(String str, int i, int i2) {
            this.type = str;
            this.id_ressource = i;
            this.angle = i2;
        }

        public int getAngle() {
            return this.angle;
        }

        public int getId_ressource() {
            return this.id_ressource;
        }

        public String getType() {
            return this.type;
        }
    }
}
