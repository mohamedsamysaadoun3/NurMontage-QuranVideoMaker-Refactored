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
public final class FragmentVolumeBinding implements ViewBinding {
    public final LinearLayout btnApplAll;
    public final ImageButton btnDone;
    public final ImageButton btnPlay;
    public final ImageView ivApplyAll;
    private final LinearLayout rootView;
    public final TextCustomFont tvApplyAll;
    public final TextCustomFont tvVolume;
    public final TextCustomFont tvVolumeSize;
    public final AppCompatSeekBar volumeSeekBar;

    private FragmentVolumeBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, ImageButton imageButton2, ImageView imageView, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3, AppCompatSeekBar appCompatSeekBar) {
        this.rootView = linearLayout;
        this.btnApplAll = linearLayout2;
        this.btnDone = imageButton;
        this.btnPlay = imageButton2;
        this.ivApplyAll = imageView;
        this.tvApplyAll = textCustomFont;
        this.tvVolume = textCustomFont2;
        this.tvVolumeSize = textCustomFont3;
        this.volumeSeekBar = appCompatSeekBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentVolumeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVolumeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_volume, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentVolumeBinding bind(View view) {
        int i = R.id.btn_appl_all;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btn_done;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                i = R.id.btn_play;
                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton2 != null) {
                    i = R.id.iv_apply_all;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.tv_apply_all;
                        TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                        if (textCustomFont != null) {
                            i = R.id.tv_volume;
                            TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                            if (textCustomFont2 != null) {
                                i = R.id.tv_volume_size;
                                TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                if (textCustomFont3 != null) {
                                    i = R.id.volumeSeekBar;
                                    AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) ViewBindings.findChildViewById(view, i);
                                    if (appCompatSeekBar != null) {
                                        return new FragmentVolumeBinding((LinearLayout) view, linearLayout, imageButton, imageButton2, imageView, textCustomFont, textCustomFont2, textCustomFont3, appCompatSeekBar);
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
