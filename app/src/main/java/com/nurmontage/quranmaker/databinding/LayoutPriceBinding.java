package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFontBold;

/* loaded from: classes2.dex */
public final class LayoutPriceBinding implements ViewBinding {
    public final MaterialCardView btnForeiver;
    public final MaterialCardView btnMonth;
    public final ImageView btnRadioForeiver;
    public final ImageView btnRadioMonth;
    public final ImageView btnRadioYear;
    public final MaterialCardView btnYear;
    public final LinearLayout foreiverPriceBox;
    public final LinearLayout monthPriceBox;
    private final RelativeLayout rootView;
    public final TextCustomFont tvBestValue;
    public final TextCustomFontBold tvForeiver;
    public final TextCustomFont tvForeiverSubtitle;
    public final TextCustomFontBold tvPriceForeiver;
    public final TextCustomFontBold tvPriceMonth;
    public final TextCustomFontBold tvPriceYear;
    public final TextCustomFont tvYearBymonth;
    public final LinearLayout yearlyPriceBox;

    private LayoutPriceBinding(RelativeLayout relativeLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, ImageView imageView2, ImageView imageView3, MaterialCardView materialCardView3, LinearLayout linearLayout, LinearLayout linearLayout2, TextCustomFont textCustomFont, TextCustomFontBold textCustomFontBold, TextCustomFont textCustomFont2, TextCustomFontBold textCustomFontBold2, TextCustomFontBold textCustomFontBold3, TextCustomFontBold textCustomFontBold4, TextCustomFont textCustomFont3, LinearLayout linearLayout3) {
        this.rootView = relativeLayout;
        this.btnForeiver = materialCardView;
        this.btnMonth = materialCardView2;
        this.btnRadioForeiver = imageView;
        this.btnRadioMonth = imageView2;
        this.btnRadioYear = imageView3;
        this.btnYear = materialCardView3;
        this.foreiverPriceBox = linearLayout;
        this.monthPriceBox = linearLayout2;
        this.tvBestValue = textCustomFont;
        this.tvForeiver = textCustomFontBold;
        this.tvForeiverSubtitle = textCustomFont2;
        this.tvPriceForeiver = textCustomFontBold2;
        this.tvPriceMonth = textCustomFontBold3;
        this.tvPriceYear = textCustomFontBold4;
        this.tvYearBymonth = textCustomFont3;
        this.yearlyPriceBox = linearLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static LayoutPriceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutPriceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_price, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutPriceBinding bind(View view) {
        int i = R.id.btn_foreiver;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i);
        if (materialCardView != null) {
            i = R.id.btn_month;
            MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, i);
            if (materialCardView2 != null) {
                i = R.id.btn_radio_foreiver;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.btn_radio_month;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.btn_radio_year;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = R.id.btn_year;
                            MaterialCardView materialCardView3 = (MaterialCardView) ViewBindings.findChildViewById(view, i);
                            if (materialCardView3 != null) {
                                i = R.id.foreiverPriceBox;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = R.id.monthPriceBox;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        i = R.id.tv_best_value;
                                        TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                        if (textCustomFont != null) {
                                            i = R.id.tv_foreiver;
                                            TextCustomFontBold textCustomFontBold = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
                                            if (textCustomFontBold != null) {
                                                i = R.id.tvForeiverSubtitle;
                                                TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                if (textCustomFont2 != null) {
                                                    i = R.id.tv_price_foreiver;
                                                    TextCustomFontBold textCustomFontBold2 = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
                                                    if (textCustomFontBold2 != null) {
                                                        i = R.id.tv_price_month;
                                                        TextCustomFontBold textCustomFontBold3 = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
                                                        if (textCustomFontBold3 != null) {
                                                            i = R.id.tv_price_year;
                                                            TextCustomFontBold textCustomFontBold4 = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
                                                            if (textCustomFontBold4 != null) {
                                                                i = R.id.tv_year_bymonth;
                                                                TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                if (textCustomFont3 != null) {
                                                                    i = R.id.yearlyPriceBox;
                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayout3 != null) {
                                                                        return new LayoutPriceBinding((RelativeLayout) view, materialCardView, materialCardView2, imageView, imageView2, imageView3, materialCardView3, linearLayout, linearLayout2, textCustomFont, textCustomFontBold, textCustomFont2, textCustomFontBold2, textCustomFontBold3, textCustomFontBold4, textCustomFont3, linearLayout3);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
