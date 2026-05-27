package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class LayoutBtnUnlockBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextCustomFont tvUnlock;

    private LayoutBtnUnlockBinding(LinearLayout linearLayout, TextCustomFont textCustomFont) {
        this.rootView = linearLayout;
        this.tvUnlock = textCustomFont;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutBtnUnlockBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutBtnUnlockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_btn_unlock, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutBtnUnlockBinding bind(View view) {
        int i = R.id.tv_unlock;
        TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
        if (textCustomFont != null) {
            return new LayoutBtnUnlockBinding((LinearLayout) view, textCustomFont);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
