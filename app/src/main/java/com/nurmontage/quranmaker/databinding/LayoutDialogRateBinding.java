package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.ButtonCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFontBold;

/* loaded from: classes2.dex */
public final class LayoutDialogRateBinding implements ViewBinding {
    public final ButtonCustomFont btnRate;
    public final ButtonCustomFont btnRateNotNow;
    private final LinearLayout rootView;
    public final TextCustomFont tvSubtittle;
    public final TextCustomFontBold tvTittle;

    private LayoutDialogRateBinding(LinearLayout linearLayout, ButtonCustomFont buttonCustomFont, ButtonCustomFont buttonCustomFont2, TextCustomFont textCustomFont, TextCustomFontBold textCustomFontBold) {
        this.rootView = linearLayout;
        this.btnRate = buttonCustomFont;
        this.btnRateNotNow = buttonCustomFont2;
        this.tvSubtittle = textCustomFont;
        this.tvTittle = textCustomFontBold;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutDialogRateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutDialogRateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_dialog_rate, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutDialogRateBinding bind(View view) {
        int i = R.id.btn_rate;
        ButtonCustomFont buttonCustomFont = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
        if (buttonCustomFont != null) {
            i = R.id.btn_rate_not_now;
            ButtonCustomFont buttonCustomFont2 = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
            if (buttonCustomFont2 != null) {
                i = R.id.tv_subtittle;
                TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                if (textCustomFont != null) {
                    i = R.id.tv_tittle;
                    TextCustomFontBold textCustomFontBold = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
                    if (textCustomFontBold != null) {
                        return new LayoutDialogRateBinding((LinearLayout) view, buttonCustomFont, buttonCustomFont2, textCustomFont, textCustomFontBold);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
