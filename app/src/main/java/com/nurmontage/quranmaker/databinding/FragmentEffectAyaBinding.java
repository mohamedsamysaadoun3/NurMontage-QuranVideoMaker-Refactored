package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class FragmentEffectAyaBinding implements ViewBinding {
    public final LinearLayout btnApplAll;
    public final ImageButton btnClose;
    public final ImageButton btnUnEffect;
    public final ImageView ivApplyAll;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    public final SeekBar seekbar;
    public final TextCustomFont statusDuration;
    public final TabLayout tabLayout;
    public final TextCustomFont tvApplyAll;

    private FragmentEffectAyaBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, ImageButton imageButton2, ImageView imageView, RecyclerView recyclerView, SeekBar seekBar, TextCustomFont textCustomFont, TabLayout tabLayout, TextCustomFont textCustomFont2) {
        this.rootView = linearLayout;
        this.btnApplAll = linearLayout2;
        this.btnClose = imageButton;
        this.btnUnEffect = imageButton2;
        this.ivApplyAll = imageView;
        this.rv = recyclerView;
        this.seekbar = seekBar;
        this.statusDuration = textCustomFont;
        this.tabLayout = tabLayout;
        this.tvApplyAll = textCustomFont2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEffectAyaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEffectAyaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_effect_aya, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentEffectAyaBinding bind(View view) {
        int i = R.id.btn_appl_all;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btn_close;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                i = R.id.btn_unEffect;
                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton2 != null) {
                    i = R.id.iv_apply_all;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.rv;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.seekbar;
                            SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, i);
                            if (seekBar != null) {
                                i = R.id.status_duration;
                                TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                if (textCustomFont != null) {
                                    i = R.id.tab_layout;
                                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
                                    if (tabLayout != null) {
                                        i = R.id.tv_apply_all;
                                        TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                        if (textCustomFont2 != null) {
                                            return new FragmentEffectAyaBinding((LinearLayout) view, linearLayout, imageButton, imageButton2, imageView, recyclerView, seekBar, textCustomFont, tabLayout, textCustomFont2);
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
