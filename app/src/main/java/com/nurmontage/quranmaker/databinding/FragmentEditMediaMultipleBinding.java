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
public final class FragmentEditMediaMultipleBinding implements ViewBinding {
    public final LinearLayout btnCut;
    public final LinearLayout btnDelete;
    public final ImageView ivCut;
    private final RelativeLayout rootView;
    public final TextCustomFont tvCut;
    public final TextCustomFont tvDelete;

    private FragmentEditMediaMultipleBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextCustomFont textCustomFont, TextCustomFont textCustomFont2) {
        this.rootView = relativeLayout;
        this.btnCut = linearLayout;
        this.btnDelete = linearLayout2;
        this.ivCut = imageView;
        this.tvCut = textCustomFont;
        this.tvDelete = textCustomFont2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEditMediaMultipleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEditMediaMultipleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_media_multiple, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentEditMediaMultipleBinding bind(View view) {
        int i = R.id.btn_cut;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btn_delete;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.iv_cut;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.tv_cut;
                    TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                    if (textCustomFont != null) {
                        i = R.id.tv_delete;
                        TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                        if (textCustomFont2 != null) {
                            return new FragmentEditMediaMultipleBinding((RelativeLayout) view, linearLayout, linearLayout2, imageView, textCustomFont, textCustomFont2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
