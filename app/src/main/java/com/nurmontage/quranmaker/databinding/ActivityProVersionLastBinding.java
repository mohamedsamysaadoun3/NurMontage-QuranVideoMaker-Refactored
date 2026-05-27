package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.ButtonCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* loaded from: classes2.dex */
public final class ActivityProVersionLastBinding implements ViewBinding {
    public final TextCustomFont appName;
    public final ButtonCustomFont btnDone;
    public final ImageButton btnOnBack;
    public final ButtonCustomFont btnTry;
    public final LayoutContactUsBinding contactLayout;
    public final FrameLayout container;
    public final FrameLayout containerProgress;
    public final ImageView imgAr;
    public final ImageView imgResize;
    public final ImageView imgType;
    public final ImageView imgWattermark;
    public final KonfettiView konfettiView;
    public final LayoutPriceBinding layoutPrice;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final RelativeLayout toolbar;
    public final RelativeLayout toolbarTittleFeature;
    public final TextCustomFont tvFree;
    public final TextCustomFont tvFreeAr;
    public final TextCustomFont tvNoInternet;
    public final TextCustomFont tvPro;
    public final TextCustomFont tvProAr;
    public final TextCustomFont tvThanks;
    public final TextCustomFont tvTittleBilling;
    public final LinearLayout viewNoInternet;
    public final LinearLayout viewSuccess;
    public final ImageView ytbLayout;

    private ActivityProVersionLastBinding(RelativeLayout relativeLayout, TextCustomFont textCustomFont, ButtonCustomFont buttonCustomFont, ImageButton imageButton, ButtonCustomFont buttonCustomFont2, LayoutContactUsBinding layoutContactUsBinding, FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, KonfettiView konfettiView, LayoutPriceBinding layoutPriceBinding, RelativeLayout relativeLayout2, RecyclerView recyclerView, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3, TextCustomFont textCustomFont4, TextCustomFont textCustomFont5, TextCustomFont textCustomFont6, TextCustomFont textCustomFont7, TextCustomFont textCustomFont8, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView5) {
        this.rootView = relativeLayout;
        this.appName = textCustomFont;
        this.btnDone = buttonCustomFont;
        this.btnOnBack = imageButton;
        this.btnTry = buttonCustomFont2;
        this.contactLayout = layoutContactUsBinding;
        this.container = frameLayout;
        this.containerProgress = frameLayout2;
        this.imgAr = imageView;
        this.imgResize = imageView2;
        this.imgType = imageView3;
        this.imgWattermark = imageView4;
        this.konfettiView = konfettiView;
        this.layoutPrice = layoutPriceBinding;
        this.main = relativeLayout2;
        this.rv = recyclerView;
        this.toolbar = relativeLayout3;
        this.toolbarTittleFeature = relativeLayout4;
        this.tvFree = textCustomFont2;
        this.tvFreeAr = textCustomFont3;
        this.tvNoInternet = textCustomFont4;
        this.tvPro = textCustomFont5;
        this.tvProAr = textCustomFont6;
        this.tvThanks = textCustomFont7;
        this.tvTittleBilling = textCustomFont8;
        this.viewNoInternet = linearLayout;
        this.viewSuccess = linearLayout2;
        this.ytbLayout = imageView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityProVersionLastBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityProVersionLastBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_pro_version_last, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityProVersionLastBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.app_name;
        TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
        if (textCustomFont != null) {
            i = R.id.btn_done;
            ButtonCustomFont buttonCustomFont = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
            if (buttonCustomFont != null) {
                i = R.id.btn_on_back;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton != null) {
                    i = R.id.btn_try;
                    ButtonCustomFont buttonCustomFont2 = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
                    if (buttonCustomFont2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.contact_layout))) != null) {
                        LayoutContactUsBinding bind = LayoutContactUsBinding.bind(findChildViewById);
                        i = R.id.container;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.container_progress;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout2 != null) {
                                i = R.id.img_ar;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = R.id.img_resize;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = R.id.img_type;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView3 != null) {
                                            i = R.id.img_wattermark;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView4 != null) {
                                                i = R.id.konfettiView;
                                                KonfettiView konfettiView = (KonfettiView) ViewBindings.findChildViewById(view, i);
                                                if (konfettiView != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.layout_price))) != null) {
                                                    LayoutPriceBinding bind2 = LayoutPriceBinding.bind(findChildViewById2);
                                                    RelativeLayout relativeLayout = (RelativeLayout) view;
                                                    i = R.id.rv;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                    if (recyclerView != null) {
                                                        i = R.id.toolbar;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                        if (relativeLayout2 != null) {
                                                            i = R.id.toolbar_tittle_feature;
                                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                            if (relativeLayout3 != null) {
                                                                i = R.id.tv_free;
                                                                TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                if (textCustomFont2 != null) {
                                                                    i = R.id.tv_free_ar;
                                                                    TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                    if (textCustomFont3 != null) {
                                                                        i = R.id.tv_no_internet;
                                                                        TextCustomFont textCustomFont4 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                        if (textCustomFont4 != null) {
                                                                            i = R.id.tv_pro;
                                                                            TextCustomFont textCustomFont5 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                            if (textCustomFont5 != null) {
                                                                                i = R.id.tv_pro_ar;
                                                                                TextCustomFont textCustomFont6 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                if (textCustomFont6 != null) {
                                                                                    i = R.id.tv_thanks;
                                                                                    TextCustomFont textCustomFont7 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                    if (textCustomFont7 != null) {
                                                                                        i = R.id.tv_tittle_billing;
                                                                                        TextCustomFont textCustomFont8 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                        if (textCustomFont8 != null) {
                                                                                            i = R.id.view_no_internet;
                                                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (linearLayout != null) {
                                                                                                i = R.id.view_success;
                                                                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                if (linearLayout2 != null) {
                                                                                                    i = R.id.ytb_layout;
                                                                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (imageView5 != null) {
                                                                                                        return new ActivityProVersionLastBinding(relativeLayout, textCustomFont, buttonCustomFont, imageButton, buttonCustomFont2, bind, frameLayout, frameLayout2, imageView, imageView2, imageView3, imageView4, konfettiView, bind2, relativeLayout, recyclerView, relativeLayout2, relativeLayout3, textCustomFont2, textCustomFont3, textCustomFont4, textCustomFont5, textCustomFont6, textCustomFont7, textCustomFont8, linearLayout, linearLayout2, imageView5);
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
