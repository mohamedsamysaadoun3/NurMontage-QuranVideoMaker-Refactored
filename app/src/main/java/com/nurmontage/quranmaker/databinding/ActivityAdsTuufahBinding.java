package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFontBold;
import com.nurmontage.quranmaker.ui.view.WaveformView;

/* loaded from: classes2.dex */
public final class ActivityAdsTuufahBinding implements ViewBinding {
    public final RelativeLayout btnBefore;
    public final ImageButton btnOnBack;
    public final ImageButton btnPlayPause;
    public final ImageButton btnPlayPauseAfter;
    public final MaterialCardView btnTuffah;
    public final ImageView ivAr;
    public final ImageView ivEn;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final TextCustomFont tvAfter;
    public final TextCustomFont tvBefore;
    public final TextCustomFont tvDownload;
    public final TextCustomFontBold tvTittle;
    public final WaveformView waveformView;
    public final WaveformView waveformViewAfter;

    private ActivityAdsTuufahBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout3, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3, TextCustomFontBold textCustomFontBold, WaveformView waveformView, WaveformView waveformView2) {
        this.rootView = relativeLayout;
        this.btnBefore = relativeLayout2;
        this.btnOnBack = imageButton;
        this.btnPlayPause = imageButton2;
        this.btnPlayPauseAfter = imageButton3;
        this.btnTuffah = materialCardView;
        this.ivAr = imageView;
        this.ivEn = imageView2;
        this.main = relativeLayout3;
        this.tvAfter = textCustomFont;
        this.tvBefore = textCustomFont2;
        this.tvDownload = textCustomFont3;
        this.tvTittle = textCustomFontBold;
        this.waveformView = waveformView;
        this.waveformViewAfter = waveformView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAdsTuufahBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAdsTuufahBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_ads_tuufah, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityAdsTuufahBinding bind(View view) {
        int i = R.id.btn_before;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.btn_on_back;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                i = R.id.btnPlayPause;
                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton2 != null) {
                    i = R.id.btnPlayPause_after;
                    ImageButton imageButton3 = (ImageButton) ViewBindings.findChildViewById(view, i);
                    if (imageButton3 != null) {
                        i = R.id.btn_tuffah;
                        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i);
                        if (materialCardView != null) {
                            i = R.id.iv_ar;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.iv_en;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                    i = R.id.tv_after;
                                    TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                    if (textCustomFont != null) {
                                        i = R.id.tv_before;
                                        TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                        if (textCustomFont2 != null) {
                                            i = R.id.tv_download;
                                            TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                            if (textCustomFont3 != null) {
                                                i = R.id.tv_tittle;
                                                TextCustomFontBold textCustomFontBold = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
                                                if (textCustomFontBold != null) {
                                                    i = R.id.waveformView;
                                                    WaveformView waveformView = (WaveformView) ViewBindings.findChildViewById(view, i);
                                                    if (waveformView != null) {
                                                        i = R.id.waveformView_after;
                                                        WaveformView waveformView2 = (WaveformView) ViewBindings.findChildViewById(view, i);
                                                        if (waveformView2 != null) {
                                                            return new ActivityAdsTuufahBinding(relativeLayout2, relativeLayout, imageButton, imageButton2, imageButton3, materialCardView, imageView, imageView2, relativeLayout2, textCustomFont, textCustomFont2, textCustomFont3, textCustomFontBold, waveformView, waveformView2);
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
