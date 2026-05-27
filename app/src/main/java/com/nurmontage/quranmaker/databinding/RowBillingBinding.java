package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class RowBillingBinding implements ViewBinding {
    public final ImageView img;
    private final LinearLayout rootView;
    public final TextCustomFont tv;

    private RowBillingBinding(LinearLayout linearLayout, ImageView imageView, TextCustomFont textCustomFont) {
        this.rootView = linearLayout;
        this.img = imageView;
        this.tv = textCustomFont;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static RowBillingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowBillingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.row_billing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RowBillingBinding bind(View view) {
        int i = R.id.img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tv;
            TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
            if (textCustomFont != null) {
                return new RowBillingBinding((LinearLayout) view, imageView, textCustomFont);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
