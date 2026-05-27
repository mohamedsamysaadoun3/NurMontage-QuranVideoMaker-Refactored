package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.ButtonCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class ActivitySupportBillingBinding implements ViewBinding {
    public final ImageButton btnBilling;
    public final ButtonCustomFont btnLaunch;
    public final ImageButton btnOnBack;
    public final CardView card;
    public final ImageView ivBilling;
    public final LinearLayout main;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    public final TextCustomFont tvAya;
    public final ButtonCustomFont view10;
    public final ButtonCustomFont view100;
    public final ButtonCustomFont view1000;
    public final ButtonCustomFont view50;

    private ActivitySupportBillingBinding(LinearLayout linearLayout, ImageButton imageButton, ButtonCustomFont buttonCustomFont, ImageButton imageButton2, CardView cardView, ImageView imageView, LinearLayout linearLayout2, RecyclerView recyclerView, TextCustomFont textCustomFont, ButtonCustomFont buttonCustomFont2, ButtonCustomFont buttonCustomFont3, ButtonCustomFont buttonCustomFont4, ButtonCustomFont buttonCustomFont5) {
        this.rootView = linearLayout;
        this.btnBilling = imageButton;
        this.btnLaunch = buttonCustomFont;
        this.btnOnBack = imageButton2;
        this.card = cardView;
        this.ivBilling = imageView;
        this.main = linearLayout2;
        this.rv = recyclerView;
        this.tvAya = textCustomFont;
        this.view10 = buttonCustomFont2;
        this.view100 = buttonCustomFont3;
        this.view1000 = buttonCustomFont4;
        this.view50 = buttonCustomFont5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySupportBillingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySupportBillingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_support_billing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySupportBillingBinding bind(View view) {
        int i = R.id.btn_billing;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.btn_launch;
            ButtonCustomFont buttonCustomFont = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
            if (buttonCustomFont != null) {
                i = R.id.btn_on_back;
                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton2 != null) {
                    i = R.id.card;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null) {
                        i = R.id.iv_billing;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            LinearLayout linearLayout = (LinearLayout) view;
                            i = R.id.rv;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.tv_aya;
                                TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                if (textCustomFont != null) {
                                    i = R.id.view_10;
                                    ButtonCustomFont buttonCustomFont2 = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
                                    if (buttonCustomFont2 != null) {
                                        i = R.id.view_100;
                                        ButtonCustomFont buttonCustomFont3 = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
                                        if (buttonCustomFont3 != null) {
                                            i = R.id.view_1000;
                                            ButtonCustomFont buttonCustomFont4 = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
                                            if (buttonCustomFont4 != null) {
                                                i = R.id.view_50;
                                                ButtonCustomFont buttonCustomFont5 = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
                                                if (buttonCustomFont5 != null) {
                                                    return new ActivitySupportBillingBinding(linearLayout, imageButton, buttonCustomFont, imageButton2, cardView, imageView, linearLayout, recyclerView, textCustomFont, buttonCustomFont2, buttonCustomFont3, buttonCustomFont4, buttonCustomFont5);
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
