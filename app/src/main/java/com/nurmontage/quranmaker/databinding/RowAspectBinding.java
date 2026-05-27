package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class RowAspectBinding implements ViewBinding {
    public final TextCustomFont aspectName;
    public final TextCustomFont aspectSize;
    public final RelativeLayout container;
    public final ImageView icon;
    public final FrameLayout layout;
    private final LinearLayout rootView;

    private RowAspectBinding(LinearLayout linearLayout, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, RelativeLayout relativeLayout, ImageView imageView, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.aspectName = textCustomFont;
        this.aspectSize = textCustomFont2;
        this.container = relativeLayout;
        this.icon = imageView;
        this.layout = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static RowAspectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowAspectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.row_aspect, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RowAspectBinding bind(View view) {
        int i = R.id.aspect_name;
        TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
        if (textCustomFont != null) {
            i = R.id.aspect_size;
            TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
            if (textCustomFont2 != null) {
                i = R.id.container;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.layout;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            return new RowAspectBinding((LinearLayout) view, textCustomFont, textCustomFont2, relativeLayout, imageView, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
