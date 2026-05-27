package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.ButtonCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFontBold;

/* loaded from: classes2.dex */
public final class ActivityWorkUserBinding implements ViewBinding {
    public final ImageButton btnMenu;
    public final ButtonCustomFont btnToStudio;
    public final RelativeLayout card;
    public final ImageView iv;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final TextCustomFont tvAya;
    public final TextCustomFontBold tvSecret;

    private ActivityWorkUserBinding(RelativeLayout relativeLayout, ImageButton imageButton, ButtonCustomFont buttonCustomFont, RelativeLayout relativeLayout2, ImageView imageView, RelativeLayout relativeLayout3, RecyclerView recyclerView, TextCustomFont textCustomFont, TextCustomFontBold textCustomFontBold) {
        this.rootView = relativeLayout;
        this.btnMenu = imageButton;
        this.btnToStudio = buttonCustomFont;
        this.card = relativeLayout2;
        this.iv = imageView;
        this.main = relativeLayout3;
        this.rv = recyclerView;
        this.tvAya = textCustomFont;
        this.tvSecret = textCustomFontBold;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityWorkUserBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWorkUserBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_work_user, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityWorkUserBinding bind(View view) {
        int i = R.id.btn_menu;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.btn_to_studio;
            ButtonCustomFont buttonCustomFont = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
            if (buttonCustomFont != null) {
                i = R.id.card;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.iv;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        RelativeLayout relativeLayout2 = (RelativeLayout) view;
                        i = R.id.rv;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.tv_aya;
                            TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                            if (textCustomFont != null) {
                                i = R.id.tv_secret;
                                TextCustomFontBold textCustomFontBold = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
                                if (textCustomFontBold != null) {
                                    return new ActivityWorkUserBinding(relativeLayout2, imageButton, buttonCustomFont, relativeLayout, imageView, relativeLayout2, recyclerView, textCustomFont, textCustomFontBold);
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
