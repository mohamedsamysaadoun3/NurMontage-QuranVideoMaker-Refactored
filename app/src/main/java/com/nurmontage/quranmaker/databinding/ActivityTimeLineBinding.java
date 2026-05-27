package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.BlurredImageView;
import com.nurmontage.quranmaker.ui.view.ButtonCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import com.nurmontage.quranmaker.ui.view.TrackEntityView;

/* loaded from: classes2.dex */
public final class ActivityTimeLineBinding implements ViewBinding {
    public final LinearLayout btnAddQuran;
    public final LinearLayout btnBg;
    public final ImageButton btnCancel;
    public final LinearLayout btnChangeAspect;
    public final ButtonCustomFont btnExport;
    public final LinearLayout btnIpad;
    public final ImageButton btnPlayPause;
    public final ImageButton btnRedo;
    public final LinearLayout btnSetupFps;
    public final ImageButton btnToEnd;
    public final ImageButton btnToStart;
    public final ImageButton btnUndo;
    public final FrameLayout containerProgress;
    public final ImageView ivIpod;
    public final ImageView ivRatio;
    public final LinearLayout layoutMenu;
    public final LayoutResolutionBinding layoutResolution;
    public final RelativeLayout layoutTime;
    public final FrameLayout mContainer;
    public final FrameLayout main;
    private final FrameLayout rootView;
    public final TrackEntityView timeLineView;
    public final ImageButton toPro;
    public final TextCustomFont tvBg;
    public final TextCustomFont tvCurrentTime;
    public final TextCustomFont tvEndTime;
    public final TextCustomFont tvIpad;
    public final TextCustomFont tvQuran;
    public final TextCustomFont tvRatio;
    public final TextCustomFont tvResolution;
    public final TextCustomFont tvTittleFragment;
    public final BlurredImageView view;

    private ActivityTimeLineBinding(FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, LinearLayout linearLayout3, ButtonCustomFont buttonCustomFont, LinearLayout linearLayout4, ImageButton imageButton2, ImageButton imageButton3, LinearLayout linearLayout5, ImageButton imageButton4, ImageButton imageButton5, ImageButton imageButton6, FrameLayout frameLayout2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout6, LayoutResolutionBinding layoutResolutionBinding, RelativeLayout relativeLayout, FrameLayout frameLayout3, FrameLayout frameLayout4, TrackEntityView trackEntityView, ImageButton imageButton7, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3, TextCustomFont textCustomFont4, TextCustomFont textCustomFont5, TextCustomFont textCustomFont6, TextCustomFont textCustomFont7, TextCustomFont textCustomFont8, BlurredImageView blurredImageView) {
        this.rootView = frameLayout;
        this.btnAddQuran = linearLayout;
        this.btnBg = linearLayout2;
        this.btnCancel = imageButton;
        this.btnChangeAspect = linearLayout3;
        this.btnExport = buttonCustomFont;
        this.btnIpad = linearLayout4;
        this.btnPlayPause = imageButton2;
        this.btnRedo = imageButton3;
        this.btnSetupFps = linearLayout5;
        this.btnToEnd = imageButton4;
        this.btnToStart = imageButton5;
        this.btnUndo = imageButton6;
        this.containerProgress = frameLayout2;
        this.ivIpod = imageView;
        this.ivRatio = imageView2;
        this.layoutMenu = linearLayout6;
        this.layoutResolution = layoutResolutionBinding;
        this.layoutTime = relativeLayout;
        this.mContainer = frameLayout3;
        this.main = frameLayout4;
        this.timeLineView = trackEntityView;
        this.toPro = imageButton7;
        this.tvBg = textCustomFont;
        this.tvCurrentTime = textCustomFont2;
        this.tvEndTime = textCustomFont3;
        this.tvIpad = textCustomFont4;
        this.tvQuran = textCustomFont5;
        this.tvRatio = textCustomFont6;
        this.tvResolution = textCustomFont7;
        this.tvTittleFragment = textCustomFont8;
        this.view = blurredImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTimeLineBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTimeLineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_time_line, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityTimeLineBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btn_add_quran;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btn_bg;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.btn_cancel;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton != null) {
                    i = R.id.btn_change_aspect;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.btn_export;
                        ButtonCustomFont buttonCustomFont = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
                        if (buttonCustomFont != null) {
                            i = R.id.btn_ipad;
                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout4 != null) {
                                i = R.id.btn_play_pause;
                                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                                if (imageButton2 != null) {
                                    i = R.id.btn_redo;
                                    ImageButton imageButton3 = (ImageButton) ViewBindings.findChildViewById(view, i);
                                    if (imageButton3 != null) {
                                        i = R.id.btn_setup_fps;
                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout5 != null) {
                                            i = R.id.btn_to_end;
                                            ImageButton imageButton4 = (ImageButton) ViewBindings.findChildViewById(view, i);
                                            if (imageButton4 != null) {
                                                i = R.id.btn_to_start;
                                                ImageButton imageButton5 = (ImageButton) ViewBindings.findChildViewById(view, i);
                                                if (imageButton5 != null) {
                                                    i = R.id.btn_undo;
                                                    ImageButton imageButton6 = (ImageButton) ViewBindings.findChildViewById(view, i);
                                                    if (imageButton6 != null) {
                                                        i = R.id.container_progress;
                                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                        if (frameLayout != null) {
                                                            i = R.id.iv_ipod;
                                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView != null) {
                                                                i = R.id.iv_ratio;
                                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView2 != null) {
                                                                    i = R.id.layout_menu;
                                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayout6 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layout_resolution))) != null) {
                                                                        LayoutResolutionBinding bind = LayoutResolutionBinding.bind(findChildViewById);
                                                                        i = R.id.layout_time;
                                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (relativeLayout != null) {
                                                                            i = R.id.m_container;
                                                                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (frameLayout2 != null) {
                                                                                FrameLayout frameLayout3 = (FrameLayout) view;
                                                                                i = R.id.time_line_view;
                                                                                TrackEntityView trackEntityView = (TrackEntityView) ViewBindings.findChildViewById(view, i);
                                                                                if (trackEntityView != null) {
                                                                                    i = R.id.to_pro;
                                                                                    ImageButton imageButton7 = (ImageButton) ViewBindings.findChildViewById(view, i);
                                                                                    if (imageButton7 != null) {
                                                                                        i = R.id.tv_bg;
                                                                                        TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                        if (textCustomFont != null) {
                                                                                            i = R.id.tv_current_time;
                                                                                            TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                            if (textCustomFont2 != null) {
                                                                                                i = R.id.tv_end_time;
                                                                                                TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                if (textCustomFont3 != null) {
                                                                                                    i = R.id.tv_ipad;
                                                                                                    TextCustomFont textCustomFont4 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textCustomFont4 != null) {
                                                                                                        i = R.id.tv_quran;
                                                                                                        TextCustomFont textCustomFont5 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textCustomFont5 != null) {
                                                                                                            i = R.id.tv_ratio;
                                                                                                            TextCustomFont textCustomFont6 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textCustomFont6 != null) {
                                                                                                                i = R.id.tv_resolution;
                                                                                                                TextCustomFont textCustomFont7 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textCustomFont7 != null) {
                                                                                                                    i = R.id.tv_tittle_fragment;
                                                                                                                    TextCustomFont textCustomFont8 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (textCustomFont8 != null) {
                                                                                                                        i = R.id.view;
                                                                                                                        BlurredImageView blurredImageView = (BlurredImageView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (blurredImageView != null) {
                                                                                                                            return new ActivityTimeLineBinding(frameLayout3, linearLayout, linearLayout2, imageButton, linearLayout3, buttonCustomFont, linearLayout4, imageButton2, imageButton3, linearLayout5, imageButton4, imageButton5, imageButton6, frameLayout, imageView, imageView2, linearLayout6, bind, relativeLayout, frameLayout2, frameLayout3, trackEntityView, imageButton7, textCustomFont, textCustomFont2, textCustomFont3, textCustomFont4, textCustomFont5, textCustomFont6, textCustomFont7, textCustomFont8, blurredImageView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
