package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class RowFeatureBinding implements ViewBinding {
    public final ImageView btnRadioYear;
    public final ImageView ivCheck;
    public final ImageView ivCheckFree;
    public final View line;
    private final LinearLayout rootView;
    public final TextCustomFont tvFeature;
    public final RelativeLayout view;

    private RowFeatureBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, View view, TextCustomFont textCustomFont, RelativeLayout relativeLayout) {
        this.rootView = linearLayout;
        this.btnRadioYear = imageView;
        this.ivCheck = imageView2;
        this.ivCheckFree = imageView3;
        this.line = view;
        this.tvFeature = textCustomFont;
        this.view = relativeLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static RowFeatureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowFeatureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.row_feature, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RowFeatureBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btn_radio_year;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_check;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.iv_check_free;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
                    i = R.id.tv_feature;
                    TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                    if (textCustomFont != null) {
                        i = R.id.view;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            return new RowFeatureBinding((LinearLayout) view, imageView, imageView2, imageView3, findChildViewById, textCustomFont, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
