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
public final class FragmentEchoEffectBinding implements ViewBinding {
    public final LinearLayout btnApplAll;
    public final ImageButton btnDone;
    public final ImageButton btnPlay;
    public final AppCompatSeekBar delaySeekBar;
    public final ImageView ivApplyAll;
    public final AppCompatSeekBar repeatSeekBar;
    private final LinearLayout rootView;
    public final TextCustomFont tvApplyAll;
    public final TextCustomFont tvDelaySize;
    public final TextCustomFont tvDeley;
    public final TextCustomFont tvRepeat;
    public final TextCustomFont tvRepeatSize;
    public final TextCustomFont tvVolume;
    public final TextCustomFont tvVolumeSize;
    public final AppCompatSeekBar volumeSeekBar;

    private FragmentEchoEffectBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, ImageButton imageButton2, AppCompatSeekBar appCompatSeekBar, ImageView imageView, AppCompatSeekBar appCompatSeekBar2, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3, TextCustomFont textCustomFont4, TextCustomFont textCustomFont5, TextCustomFont textCustomFont6, TextCustomFont textCustomFont7, AppCompatSeekBar appCompatSeekBar3) {
        this.rootView = linearLayout;
        this.btnApplAll = linearLayout2;
        this.btnDone = imageButton;
        this.btnPlay = imageButton2;
        this.delaySeekBar = appCompatSeekBar;
        this.ivApplyAll = imageView;
        this.repeatSeekBar = appCompatSeekBar2;
        this.tvApplyAll = textCustomFont;
        this.tvDelaySize = textCustomFont2;
        this.tvDeley = textCustomFont3;
        this.tvRepeat = textCustomFont4;
        this.tvRepeatSize = textCustomFont5;
        this.tvVolume = textCustomFont6;
        this.tvVolumeSize = textCustomFont7;
        this.volumeSeekBar = appCompatSeekBar3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEchoEffectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEchoEffectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_echo_effect, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentEchoEffectBinding bind(View view) {
        int i = R.id.btn_appl_all;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btn_done;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                i = R.id.btn_play;
                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton2 != null) {
                    i = R.id.delaySeekBar;
                    AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) ViewBindings.findChildViewById(view, i);
                    if (appCompatSeekBar != null) {
                        i = R.id.iv_apply_all;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.repeatSeekBar;
                            AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) ViewBindings.findChildViewById(view, i);
                            if (appCompatSeekBar2 != null) {
                                i = R.id.tv_apply_all;
                                TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                if (textCustomFont != null) {
                                    i = R.id.tv_delay_size;
                                    TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                    if (textCustomFont2 != null) {
                                        i = R.id.tv_deley;
                                        TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                        if (textCustomFont3 != null) {
                                            i = R.id.tv_repeat;
                                            TextCustomFont textCustomFont4 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                            if (textCustomFont4 != null) {
                                                i = R.id.tv_repeat_size;
                                                TextCustomFont textCustomFont5 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                if (textCustomFont5 != null) {
                                                    i = R.id.tv_volume;
                                                    TextCustomFont textCustomFont6 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                    if (textCustomFont6 != null) {
                                                        i = R.id.tv_volume_size;
                                                        TextCustomFont textCustomFont7 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                        if (textCustomFont7 != null) {
                                                            i = R.id.volumeSeekBar;
                                                            AppCompatSeekBar appCompatSeekBar3 = (AppCompatSeekBar) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatSeekBar3 != null) {
                                                                return new FragmentEchoEffectBinding((LinearLayout) view, linearLayout, imageButton, imageButton2, appCompatSeekBar, imageView, appCompatSeekBar2, textCustomFont, textCustomFont2, textCustomFont3, textCustomFont4, textCustomFont5, textCustomFont6, textCustomFont7, appCompatSeekBar3);
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
