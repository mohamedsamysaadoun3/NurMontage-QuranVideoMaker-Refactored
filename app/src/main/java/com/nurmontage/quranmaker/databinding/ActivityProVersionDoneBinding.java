package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFontBold;
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* loaded from: classes2.dex */
public final class ActivityProVersionDoneBinding implements ViewBinding {
    public final LinearLayout btn;
    public final ImageButton btnOnBack;
    public final ImageButton btnShowPro;
    public final TextCustomFont hintReview;
    public final KonfettiView konfettiView;
    public final RelativeLayout main;
    public final TextCustomFontBold mtittle;
    public final Button restore;
    private final RelativeLayout rootView;
    public final RecyclerView rvImg;
    public final TextCustomFont tvThanks;

    private ActivityProVersionDoneBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, TextCustomFont textCustomFont, KonfettiView konfettiView, RelativeLayout relativeLayout2, TextCustomFontBold textCustomFontBold, Button button, RecyclerView recyclerView, TextCustomFont textCustomFont2) {
        this.rootView = relativeLayout;
        this.btn = linearLayout;
        this.btnOnBack = imageButton;
        this.btnShowPro = imageButton2;
        this.hintReview = textCustomFont;
        this.konfettiView = konfettiView;
        this.main = relativeLayout2;
        this.mtittle = textCustomFontBold;
        this.restore = button;
        this.rvImg = recyclerView;
        this.tvThanks = textCustomFont2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityProVersionDoneBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityProVersionDoneBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_pro_version_done, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityProVersionDoneBinding bind(View view) {
        int i = R.id.btn;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btn_on_back;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                i = R.id.btn_show_pro;
                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton2 != null) {
                    i = R.id.hint_review;
                    TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                    if (textCustomFont != null) {
                        i = R.id.konfettiView;
                        KonfettiView konfettiView = (KonfettiView) ViewBindings.findChildViewById(view, i);
                        if (konfettiView != null) {
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
                                        i = R.id.tv_thanks;
                                        TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                        if (textCustomFont2 != null) {
                                            return new ActivityProVersionDoneBinding(relativeLayout, linearLayout, imageButton, imageButton2, textCustomFont, konfettiView, relativeLayout, textCustomFontBold, button, recyclerView, textCustomFont2);
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
