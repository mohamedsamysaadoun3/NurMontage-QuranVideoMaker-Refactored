package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class LayoutBtnShareBinding implements ViewBinding {
    private final RelativeLayout rootView;
    public final TextCustomFont tvShare;

    private LayoutBtnShareBinding(RelativeLayout relativeLayout, TextCustomFont textCustomFont) {
        this.rootView = relativeLayout;
        this.tvShare = textCustomFont;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static LayoutBtnShareBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutBtnShareBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_btn_share, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutBtnShareBinding bind(View view) {
        int i = R.id.tv_share;
        TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
        if (textCustomFont != null) {
            return new LayoutBtnShareBinding((RelativeLayout) view, textCustomFont);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
