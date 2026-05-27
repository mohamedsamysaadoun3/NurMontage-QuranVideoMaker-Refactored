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

/* loaded from: classes2.dex */
public final class RatingBottomSheetBinding implements ViewBinding {
    public final ButtonCustomFont laterButton;
    public final ButtonCustomFont neverButton;
    public final ButtonCustomFont rateButton;
    private final LinearLayout rootView;
    public final TextCustomFont tvSubtittle;
    public final TextCustomFont tvTittle;

    private RatingBottomSheetBinding(LinearLayout linearLayout, ButtonCustomFont buttonCustomFont, ButtonCustomFont buttonCustomFont2, ButtonCustomFont buttonCustomFont3, TextCustomFont textCustomFont, TextCustomFont textCustomFont2) {
        this.rootView = linearLayout;
        this.laterButton = buttonCustomFont;
        this.neverButton = buttonCustomFont2;
        this.rateButton = buttonCustomFont3;
        this.tvSubtittle = textCustomFont;
        this.tvTittle = textCustomFont2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static RatingBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RatingBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.rating_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RatingBottomSheetBinding bind(View view) {
        int i = R.id.laterButton;
        ButtonCustomFont buttonCustomFont = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
        if (buttonCustomFont != null) {
            i = R.id.neverButton;
            ButtonCustomFont buttonCustomFont2 = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
            if (buttonCustomFont2 != null) {
                i = R.id.rateButton;
                ButtonCustomFont buttonCustomFont3 = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
                if (buttonCustomFont3 != null) {
                    i = R.id.tv_subtittle;
                    TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                    if (textCustomFont != null) {
                        i = R.id.tv_tittle;
                        TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                        if (textCustomFont2 != null) {
                            return new RatingBottomSheetBinding((LinearLayout) view, buttonCustomFont, buttonCustomFont2, buttonCustomFont3, textCustomFont, textCustomFont2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
