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
import com.nurmontage.quranmaker.ui.view.ButtonCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFontBold;

/* loaded from: classes2.dex */
public final class ActivityChoiceLangBinding implements ViewBinding {
    public final ButtonCustomFont btnConfirm;
    public final TextCustomFont iconAr;
    public final TextCustomFont iconEn;
    public final RelativeLayout layoutArabic;
    public final RelativeLayout layoutEnglish;
    public final LinearLayout main;
    public final ImageView radioArabic;
    public final ImageView radioEnglish;
    private final LinearLayout rootView;
    public final TextCustomFont tvCancel;
    public final TextCustomFont tvSubTittle;
    public final TextCustomFontBold tvTittle;

    private ActivityChoiceLangBinding(LinearLayout linearLayout, ButtonCustomFont buttonCustomFont, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout2, ImageView imageView, ImageView imageView2, TextCustomFont textCustomFont3, TextCustomFont textCustomFont4, TextCustomFontBold textCustomFontBold) {
        this.rootView = linearLayout;
        this.btnConfirm = buttonCustomFont;
        this.iconAr = textCustomFont;
        this.iconEn = textCustomFont2;
        this.layoutArabic = relativeLayout;
        this.layoutEnglish = relativeLayout2;
        this.main = linearLayout2;
        this.radioArabic = imageView;
        this.radioEnglish = imageView2;
        this.tvCancel = textCustomFont3;
        this.tvSubTittle = textCustomFont4;
        this.tvTittle = textCustomFontBold;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityChoiceLangBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityChoiceLangBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_choice_lang, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityChoiceLangBinding bind(View view) {
        int i = R.id.btn_confirm;
        ButtonCustomFont buttonCustomFont = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
        if (buttonCustomFont != null) {
            i = R.id.icon_ar;
            TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
            if (textCustomFont != null) {
                i = R.id.icon_en;
                TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                if (textCustomFont2 != null) {
                    i = R.id.layout_arabic;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.layout_english;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout2 != null) {
                            LinearLayout linearLayout = (LinearLayout) view;
                            i = R.id.radio_arabic;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.radio_english;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.tv_cancel;
                                    TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                    if (textCustomFont3 != null) {
                                        i = R.id.tv_subTittle;
                                        TextCustomFont textCustomFont4 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                        if (textCustomFont4 != null) {
                                            i = R.id.tv_tittle;
                                            TextCustomFontBold textCustomFontBold = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
                                            if (textCustomFontBold != null) {
                                                return new ActivityChoiceLangBinding(linearLayout, buttonCustomFont, textCustomFont, textCustomFont2, relativeLayout, relativeLayout2, linearLayout, imageView, imageView2, textCustomFont3, textCustomFont4, textCustomFontBold);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
