package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFontBold;

/* loaded from: classes2.dex */
public final class RowWorkUserBinding implements ViewBinding {
    public final ImageButton btnMenu;
    public final MaterialCardView crdIv;
    public final ImageView imageView;
    public final ImageView ivRatio;
    private final RelativeLayout rootView;
    public final TextCustomFont tvDate;
    public final TextCustomFontBold tvName;

    private RowWorkUserBinding(RelativeLayout relativeLayout, ImageButton imageButton, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, TextCustomFont textCustomFont, TextCustomFontBold textCustomFontBold) {
        this.rootView = relativeLayout;
        this.btnMenu = imageButton;
        this.crdIv = materialCardView;
        this.imageView = imageView;
        this.ivRatio = imageView2;
        this.tvDate = textCustomFont;
        this.tvName = textCustomFontBold;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static RowWorkUserBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowWorkUserBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.row_work_user, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RowWorkUserBinding bind(View view) {
        int i = R.id.btn_menu;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.crd_iv;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i);
            if (materialCardView != null) {
                i = R.id.imageView;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.iv_ratio;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.tv_date;
                        TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                        if (textCustomFont != null) {
                            i = R.id.tv_name;
                            TextCustomFontBold textCustomFontBold = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
                            if (textCustomFontBold != null) {
                                return new RowWorkUserBinding((RelativeLayout) view, imageButton, materialCardView, imageView, imageView2, textCustomFont, textCustomFontBold);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
