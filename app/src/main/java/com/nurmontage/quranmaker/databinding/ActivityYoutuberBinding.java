package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class ActivityYoutuberBinding implements ViewBinding {
    public final TextCustomFont btnGasadi;
    public final TextCustomFont btnHecham;
    public final TextCustomFont btnHilal;
    public final ImageButton btnOnBack;
    public final TextCustomFont btnPakistain;
    public final LinearLayout btnSendLnk;
    public final ImageView btnToAbout;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final TextCustomFont tvHintSendLnk;
    public final TextCustomFont tvTutorial;

    private ActivityYoutuberBinding(RelativeLayout relativeLayout, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3, ImageButton imageButton, TextCustomFont textCustomFont4, LinearLayout linearLayout, ImageView imageView, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextCustomFont textCustomFont5, TextCustomFont textCustomFont6) {
        this.rootView = relativeLayout;
        this.btnGasadi = textCustomFont;
        this.btnHecham = textCustomFont2;
        this.btnHilal = textCustomFont3;
        this.btnOnBack = imageButton;
        this.btnPakistain = textCustomFont4;
        this.btnSendLnk = linearLayout;
        this.btnToAbout = imageView;
        this.main = relativeLayout2;
        this.rv = recyclerView;
        this.tvHintSendLnk = textCustomFont5;
        this.tvTutorial = textCustomFont6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityYoutuberBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityYoutuberBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_youtuber, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityYoutuberBinding bind(View view) {
        int i = R.id.btn_gasadi;
        TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
        if (textCustomFont != null) {
            i = R.id.btn_hecham;
            TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
            if (textCustomFont2 != null) {
                i = R.id.btn_hilal;
                TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                if (textCustomFont3 != null) {
                    i = R.id.btn_on_back;
                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                    if (imageButton != null) {
                        i = R.id.btn_pakistain;
                        TextCustomFont textCustomFont4 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                        if (textCustomFont4 != null) {
                            i = R.id.btn_send_lnk;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.btn_to_about;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) view;
                                    i = R.id.rv;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        i = R.id.tv_hint_send_lnk;
                                        TextCustomFont textCustomFont5 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                        if (textCustomFont5 != null) {
                                            i = R.id.tv_tutorial;
                                            TextCustomFont textCustomFont6 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                            if (textCustomFont6 != null) {
                                                return new ActivityYoutuberBinding(relativeLayout, textCustomFont, textCustomFont2, textCustomFont3, imageButton, textCustomFont4, linearLayout, imageView, relativeLayout, recyclerView, textCustomFont5, textCustomFont6);
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
