package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.ButtonCustomFontBilling;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFontBold;
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* loaded from: classes2.dex */
public final class ActivityProVersionBinding implements ViewBinding {
    public final LinearLayout btn;
    public final ButtonCustomFontBilling btnContinue;
    public final ImageButton btnOnBack;
    public final ImageButton btnShowPro;
    public final FrameLayout containerProgress;
    public final TextCustomFont hintReview;
    public final KonfettiView konfettiView;
    public final LayoutPriceBinding layoutPrice;
    public final RelativeLayout main;
    public final TextCustomFontBold mtittle;
    public final Button restore;
    private final RelativeLayout rootView;
    public final RecyclerView rvImg;
    public final TextCustomFont tvHintAr;
    public final TextCustomFont tvHintEn;
    public final TextCustomFont tvThanks;

    private ActivityProVersionBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, ButtonCustomFontBilling buttonCustomFontBilling, ImageButton imageButton, ImageButton imageButton2, FrameLayout frameLayout, TextCustomFont textCustomFont, KonfettiView konfettiView, LayoutPriceBinding layoutPriceBinding, RelativeLayout relativeLayout2, TextCustomFontBold textCustomFontBold, Button button, RecyclerView recyclerView, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3, TextCustomFont textCustomFont4) {
        this.rootView = relativeLayout;
        this.btn = linearLayout;
        this.btnContinue = buttonCustomFontBilling;
        this.btnOnBack = imageButton;
        this.btnShowPro = imageButton2;
        this.containerProgress = frameLayout;
        this.hintReview = textCustomFont;
        this.konfettiView = konfettiView;
        this.layoutPrice = layoutPriceBinding;
        this.main = relativeLayout2;
        this.mtittle = textCustomFontBold;
        this.restore = button;
        this.rvImg = recyclerView;
        this.tvHintAr = textCustomFont2;
        this.tvHintEn = textCustomFont3;
        this.tvThanks = textCustomFont4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityProVersionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityProVersionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_pro_version, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityProVersionBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btn;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btn_continue;
            ButtonCustomFontBilling buttonCustomFontBilling = (ButtonCustomFontBilling) ViewBindings.findChildViewById(view, i);
            if (buttonCustomFontBilling != null) {
                i = R.id.btn_on_back;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton != null) {
                    i = R.id.btn_show_pro;
                    ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                    if (imageButton2 != null) {
                        i = R.id.container_progress;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.hint_review;
                            TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                            if (textCustomFont != null) {
                                i = R.id.konfettiView;
                                KonfettiView konfettiView = (KonfettiView) ViewBindings.findChildViewById(view, i);
                                if (konfettiView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layout_price))) != null) {
                                    LayoutPriceBinding bind = LayoutPriceBinding.bind(findChildViewById);
                                    RelativeLayout relativeLayout = (RelativeLayout) view;
                                    i = R.id.mtittle;
                                    TextCustomFontBold textCustomFontBold = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
                                    if (textCustomFontBold != null) {
                                        i = R.id.restore;
                                        Button button = (Button) ViewBindings.findChildViewById(view, i);
                                        if (button != null) {
                                            i = R.id.rv_img;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (recyclerView != null) {
                                                i = R.id.tv_hint_ar;
                                                TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                if (textCustomFont2 != null) {
                                                    i = R.id.tv_hint_en;
                                                    TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                    if (textCustomFont3 != null) {
                                                        i = R.id.tv_thanks;
                                                        TextCustomFont textCustomFont4 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                        if (textCustomFont4 != null) {
                                                            return new ActivityProVersionBinding(relativeLayout, linearLayout, buttonCustomFontBilling, imageButton, imageButton2, frameLayout, textCustomFont, konfettiView, bind, relativeLayout, textCustomFontBold, button, recyclerView, textCustomFont2, textCustomFont3, textCustomFont4);
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
