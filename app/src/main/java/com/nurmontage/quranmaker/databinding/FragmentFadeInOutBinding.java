package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class FragmentFadeInOutBinding implements ViewBinding {
    public final LinearLayout btnApplAll;
    public final ImageButton btnDone;
    public final ImageButton btnPlay;
    public final AppCompatSeekBar fadeInSeekBar;
    public final AppCompatSeekBar fadeOutSeekBar;
    public final TextCustomFont hintFadeIn;
    public final TextCustomFont hintFadeOut;
    public final ImageView ivApplyAll;
    private final LinearLayout rootView;
    public final TextCustomFont tvApplyAll;
    public final TextCustomFont tvDeley;
    public final TextCustomFont tvRepeat;

    private FragmentFadeInOutBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, ImageButton imageButton2, AppCompatSeekBar appCompatSeekBar, AppCompatSeekBar appCompatSeekBar2, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, ImageView imageView, TextCustomFont textCustomFont3, TextCustomFont textCustomFont4, TextCustomFont textCustomFont5) {
        this.rootView = linearLayout;
        this.btnApplAll = linearLayout2;
        this.btnDone = imageButton;
        this.btnPlay = imageButton2;
        this.fadeInSeekBar = appCompatSeekBar;
        this.fadeOutSeekBar = appCompatSeekBar2;
        this.hintFadeIn = textCustomFont;
        this.hintFadeOut = textCustomFont2;
        this.ivApplyAll = imageView;
        this.tvApplyAll = textCustomFont3;
        this.tvDeley = textCustomFont4;
        this.tvRepeat = textCustomFont5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFadeInOutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFadeInOutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_fade_in_out, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentFadeInOutBinding bind(View view) {
        int i = R.id.btn_appl_all;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btn_done;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                i = R.id.btn_play;
                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton2 != null) {
                    i = R.id.fadeInSeekBar;
                    AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) ViewBindings.findChildViewById(view, i);
                    if (appCompatSeekBar != null) {
                        i = R.id.fadeOutSeekBar;
                        AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) ViewBindings.findChildViewById(view, i);
                        if (appCompatSeekBar2 != null) {
                            i = R.id.hint_fade_in;
                            TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                            if (textCustomFont != null) {
                                i = R.id.hint_fade_out;
                                TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                if (textCustomFont2 != null) {
                                    i = R.id.iv_apply_all;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = R.id.tv_apply_all;
                                        TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                        if (textCustomFont3 != null) {
                                            i = R.id.tv_deley;
                                            TextCustomFont textCustomFont4 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                            if (textCustomFont4 != null) {
                                                i = R.id.tv_repeat;
                                                TextCustomFont textCustomFont5 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                if (textCustomFont5 != null) {
                                                    return new FragmentFadeInOutBinding((LinearLayout) view, linearLayout, imageButton, imageButton2, appCompatSeekBar, appCompatSeekBar2, textCustomFont, textCustomFont2, imageView, textCustomFont3, textCustomFont4, textCustomFont5);
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
