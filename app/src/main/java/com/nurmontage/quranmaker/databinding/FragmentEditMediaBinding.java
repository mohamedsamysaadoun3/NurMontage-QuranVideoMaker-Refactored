package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class FragmentEditMediaBinding implements ViewBinding {
    public final LinearLayout btnCut;
    public final LinearLayout btnDelete;
    public final LinearLayout btnDuplicate;
    public final LinearLayout btnEcho;
    public final LinearLayout btnEnhanceVoice;
    public final LinearLayout btnFade;
    public final LinearLayout btnPitch;
    public final LinearLayout btnRemoveNoise;
    public final LinearLayout btnReplace;
    public final LinearLayout btnReverb;
    public final ImageView btnShowLeft;
    public final ImageView btnShowRight;
    public final LinearLayout btnSpeed;
    public final LinearLayout btnVolume;
    public final ImageView ivCut;
    private final RelativeLayout rootView;
    public final TextCustomFont tvCut;
    public final TextCustomFont tvDelete;
    public final TextCustomFont tvDuplicate;
    public final TextCustomFont tvEcho;
    public final TextCustomFont tvEnhance;
    public final TextCustomFont tvFade;
    public final TextCustomFont tvNoice;
    public final TextCustomFont tvPitch;
    public final TextCustomFont tvReplace;
    public final TextCustomFont tvReverb;
    public final TextCustomFont tvSpeed;
    public final TextCustomFont tvVolume;
    public final HorizontalScrollView viewScroll;

    private FragmentEditMediaBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, ImageView imageView, ImageView imageView2, LinearLayout linearLayout11, LinearLayout linearLayout12, ImageView imageView3, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3, TextCustomFont textCustomFont4, TextCustomFont textCustomFont5, TextCustomFont textCustomFont6, TextCustomFont textCustomFont7, TextCustomFont textCustomFont8, TextCustomFont textCustomFont9, TextCustomFont textCustomFont10, TextCustomFont textCustomFont11, TextCustomFont textCustomFont12, HorizontalScrollView horizontalScrollView) {
        this.rootView = relativeLayout;
        this.btnCut = linearLayout;
        this.btnDelete = linearLayout2;
        this.btnDuplicate = linearLayout3;
        this.btnEcho = linearLayout4;
        this.btnEnhanceVoice = linearLayout5;
        this.btnFade = linearLayout6;
        this.btnPitch = linearLayout7;
        this.btnRemoveNoise = linearLayout8;
        this.btnReplace = linearLayout9;
        this.btnReverb = linearLayout10;
        this.btnShowLeft = imageView;
        this.btnShowRight = imageView2;
        this.btnSpeed = linearLayout11;
        this.btnVolume = linearLayout12;
        this.ivCut = imageView3;
        this.tvCut = textCustomFont;
        this.tvDelete = textCustomFont2;
        this.tvDuplicate = textCustomFont3;
        this.tvEcho = textCustomFont4;
        this.tvEnhance = textCustomFont5;
        this.tvFade = textCustomFont6;
        this.tvNoice = textCustomFont7;
        this.tvPitch = textCustomFont8;
        this.tvReplace = textCustomFont9;
        this.tvReverb = textCustomFont10;
        this.tvSpeed = textCustomFont11;
        this.tvVolume = textCustomFont12;
        this.viewScroll = horizontalScrollView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEditMediaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEditMediaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_media, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentEditMediaBinding bind(View view) {
        int i = R.id.btn_cut;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btn_delete;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.btn_duplicate;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout3 != null) {
                    i = R.id.btn_echo;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout4 != null) {
                        i = R.id.btn_enhance_voice;
                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout5 != null) {
                            i = R.id.btn_fade;
                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout6 != null) {
                                i = R.id.btn_pitch;
                                LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout7 != null) {
                                    i = R.id.btn_remove_noice;
                                    LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout8 != null) {
                                        i = R.id.btn_replace;
                                        LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout9 != null) {
                                            i = R.id.btn_reverb;
                                            LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout10 != null) {
                                                i = R.id.btn_show_left;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView != null) {
                                                    i = R.id.btn_show_right;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView2 != null) {
                                                        i = R.id.btn_speed;
                                                        LinearLayout linearLayout11 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout11 != null) {
                                                            i = R.id.btn_volume;
                                                            LinearLayout linearLayout12 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout12 != null) {
                                                                i = R.id.iv_cut;
                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView3 != null) {
                                                                    i = R.id.tv_cut;
                                                                    TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                    if (textCustomFont != null) {
                                                                        i = R.id.tv_delete;
                                                                        TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                        if (textCustomFont2 != null) {
                                                                            i = R.id.tv_duplicate;
                                                                            TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                            if (textCustomFont3 != null) {
                                                                                i = R.id.tv_echo;
                                                                                TextCustomFont textCustomFont4 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                if (textCustomFont4 != null) {
                                                                                    i = R.id.tv_enhance;
                                                                                    TextCustomFont textCustomFont5 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                    if (textCustomFont5 != null) {
                                                                                        i = R.id.tv_fade;
                                                                                        TextCustomFont textCustomFont6 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                        if (textCustomFont6 != null) {
                                                                                            i = R.id.tv_noice;
                                                                                            TextCustomFont textCustomFont7 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                            if (textCustomFont7 != null) {
                                                                                                i = R.id.tv_pitch;
                                                                                                TextCustomFont textCustomFont8 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                if (textCustomFont8 != null) {
                                                                                                    i = R.id.tv_replace;
                                                                                                    TextCustomFont textCustomFont9 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textCustomFont9 != null) {
                                                                                                        i = R.id.tv_reverbe;
                                                                                                        TextCustomFont textCustomFont10 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textCustomFont10 != null) {
                                                                                                            i = R.id.tv_speed;
                                                                                                            TextCustomFont textCustomFont11 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textCustomFont11 != null) {
                                                                                                                i = R.id.tv_volume;
                                                                                                                TextCustomFont textCustomFont12 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textCustomFont12 != null) {
                                                                                                                    i = R.id.view_scroll;
                                                                                                                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (horizontalScrollView != null) {
                                                                                                                        return new FragmentEditMediaBinding((RelativeLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, imageView, imageView2, linearLayout11, linearLayout12, imageView3, textCustomFont, textCustomFont2, textCustomFont3, textCustomFont4, textCustomFont5, textCustomFont6, textCustomFont7, textCustomFont8, textCustomFont9, textCustomFont10, textCustomFont11, textCustomFont12, horizontalScrollView);
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
