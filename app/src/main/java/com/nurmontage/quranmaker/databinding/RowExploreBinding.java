package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.SquareImageViewSimple;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class RowExploreBinding implements ViewBinding {
    public final SquareImageViewSimple img;
    private final LinearLayout rootView;
    public final TextCustomFont tvName;
    public final TextCustomFont tvSize;

    private RowExploreBinding(LinearLayout linearLayout, SquareImageViewSimple squareImageViewSimple, TextCustomFont textCustomFont, TextCustomFont textCustomFont2) {
        this.rootView = linearLayout;
        this.img = squareImageViewSimple;
        this.tvName = textCustomFont;
        this.tvSize = textCustomFont2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static RowExploreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowExploreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.row_explore, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RowExploreBinding bind(View view) {
        int i = R.id.img;
        SquareImageViewSimple squareImageViewSimple = (SquareImageViewSimple) ViewBindings.findChildViewById(view, i);
        if (squareImageViewSimple != null) {
            i = R.id.tv_name;
            TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
            if (textCustomFont != null) {
                i = R.id.tv_size;
                TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                if (textCustomFont2 != null) {
                    return new RowExploreBinding((LinearLayout) view, squareImageViewSimple, textCustomFont, textCustomFont2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
