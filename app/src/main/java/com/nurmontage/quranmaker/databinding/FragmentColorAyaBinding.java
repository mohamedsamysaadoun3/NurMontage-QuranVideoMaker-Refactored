package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class FragmentColorAyaBinding implements ViewBinding {
    public final ImageButton btnDone;
    public final TextCustomFont btnGlow;
    public final TextCustomFont btnNone;
    public final TextCustomFont btnOutline;
    public final TextCustomFont btnShadow;
    public final LinearLayout presetContainer;
    private final LinearLayout rootView;
    public final RecyclerView rvColor;
    public final TabLayout tabLayout;

    private FragmentColorAyaBinding(LinearLayout linearLayout, ImageButton imageButton, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3, TextCustomFont textCustomFont4, LinearLayout linearLayout2, RecyclerView recyclerView, TabLayout tabLayout) {
        this.rootView = linearLayout;
        this.btnDone = imageButton;
        this.btnGlow = textCustomFont;
        this.btnNone = textCustomFont2;
        this.btnOutline = textCustomFont3;
        this.btnShadow = textCustomFont4;
        this.presetContainer = linearLayout2;
        this.rvColor = recyclerView;
        this.tabLayout = tabLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentColorAyaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentColorAyaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_color_aya, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentColorAyaBinding bind(View view) {
        int i = R.id.btn_done;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.btnGlow;
            TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
            if (textCustomFont != null) {
                i = R.id.btnNone;
                TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                if (textCustomFont2 != null) {
                    i = R.id.btnOutline;
                    TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                    if (textCustomFont3 != null) {
                        i = R.id.btnShadow;
                        TextCustomFont textCustomFont4 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                        if (textCustomFont4 != null) {
                            i = R.id.presetContainer;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.rv_color;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = R.id.tab_layout;
                                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
                                    if (tabLayout != null) {
                                        return new FragmentColorAyaBinding((LinearLayout) view, imageButton, textCustomFont, textCustomFont2, textCustomFont3, textCustomFont4, linearLayout, recyclerView, tabLayout);
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
