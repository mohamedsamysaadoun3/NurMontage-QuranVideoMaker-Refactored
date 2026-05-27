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
public final class FragmentEditEntityBinding implements ViewBinding {
    public final LinearLayout btnAnim;
    public final LinearLayout btnColor;
    public final LinearLayout btnCut;
    public final LinearLayout btnDelete;
    public final LinearLayout btnDuplicate;
    public final LinearLayout btnEdit;
    public final LinearLayout btnFont;
    public final LinearLayout btnFromNow;
    public final LinearLayout btnFromTheStart;
    public final LinearLayout btnIcon;
    public final ImageView btnShowLeft;
    public final ImageView btnShowRight;
    public final LinearLayout btnUntilNow;
    public final LinearLayout btnUntilTheEnd;
    public final ImageView ivCut;
    public final ImageView ivFromNow;
    public final ImageView ivIcon;
    public final ImageView ivUntilNow;
    private final RelativeLayout rootView;
    public final HorizontalScrollView scrollMenu;
    public final TextCustomFont tvAnim;
    public final TextCustomFont tvColor;
    public final TextCustomFont tvCut;
    public final TextCustomFont tvDelete;
    public final TextCustomFont tvDuplicate;
    public final TextCustomFont tvEdit;
    public final TextCustomFont tvFont;
    public final TextCustomFont tvFromNow;
    public final TextCustomFont tvFromTheStart;
    public final TextCustomFont tvIcon;
    public final TextCustomFont tvUntilNow;
    public final TextCustomFont tvUntilTheEnd;
    public final View view;
    public final LinearLayout viewTime;

    private FragmentEditEntityBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, ImageView imageView, ImageView imageView2, LinearLayout linearLayout11, LinearLayout linearLayout12, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, HorizontalScrollView horizontalScrollView, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3, TextCustomFont textCustomFont4, TextCustomFont textCustomFont5, TextCustomFont textCustomFont6, TextCustomFont textCustomFont7, TextCustomFont textCustomFont8, TextCustomFont textCustomFont9, TextCustomFont textCustomFont10, TextCustomFont textCustomFont11, TextCustomFont textCustomFont12, View view, LinearLayout linearLayout13) {
        this.rootView = relativeLayout;
        this.btnAnim = linearLayout;
        this.btnColor = linearLayout2;
        this.btnCut = linearLayout3;
        this.btnDelete = linearLayout4;
        this.btnDuplicate = linearLayout5;
        this.btnEdit = linearLayout6;
        this.btnFont = linearLayout7;
        this.btnFromNow = linearLayout8;
        this.btnFromTheStart = linearLayout9;
        this.btnIcon = linearLayout10;
        this.btnShowLeft = imageView;
        this.btnShowRight = imageView2;
        this.btnUntilNow = linearLayout11;
        this.btnUntilTheEnd = linearLayout12;
        this.ivCut = imageView3;
        this.ivFromNow = imageView4;
        this.ivIcon = imageView5;
        this.ivUntilNow = imageView6;
        this.scrollMenu = horizontalScrollView;
        this.tvAnim = textCustomFont;
        this.tvColor = textCustomFont2;
        this.tvCut = textCustomFont3;
        this.tvDelete = textCustomFont4;
        this.tvDuplicate = textCustomFont5;
        this.tvEdit = textCustomFont6;
        this.tvFont = textCustomFont7;
        this.tvFromNow = textCustomFont8;
        this.tvFromTheStart = textCustomFont9;
        this.tvIcon = textCustomFont10;
        this.tvUntilNow = textCustomFont11;
        this.tvUntilTheEnd = textCustomFont12;
        this.view = view;
        this.viewTime = linearLayout13;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEditEntityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEditEntityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_entity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentEditEntityBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btn_anim;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btn_color;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.btn_cut;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout3 != null) {
                    i = R.id.btn_delete;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout4 != null) {
                        i = R.id.btn_duplicate;
                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout5 != null) {
                            i = R.id.btn_edit;
                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout6 != null) {
                                i = R.id.btn_font;
                                LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout7 != null) {
                                    i = R.id.btn_from_now;
                                    LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout8 != null) {
                                        i = R.id.btn_from_the_start;
                                        LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout9 != null) {
                                            i = R.id.btn_icon;
                                            LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout10 != null) {
                                                i = R.id.btn_show_left;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView != null) {
                                                    i = R.id.btn_show_right;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView2 != null) {
                                                        i = R.id.btn_until_now;
                                                        LinearLayout linearLayout11 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout11 != null) {
                                                            i = R.id.btn_until_the_end;
                                                            LinearLayout linearLayout12 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout12 != null) {
                                                                i = R.id.iv_cut;
                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView3 != null) {
                                                                    i = R.id.iv_from_now;
                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                    if (imageView4 != null) {
                                                                        i = R.id.iv_icon;
                                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                        if (imageView5 != null) {
                                                                            i = R.id.iv_until_now;
                                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                            if (imageView6 != null) {
                                                                                i = R.id.scroll_menu;
                                                                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                                                                                if (horizontalScrollView != null) {
                                                                                    i = R.id.tv_anim;
                                                                                    TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                    if (textCustomFont != null) {
                                                                                        i = R.id.tv_color;
                                                                                        TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                        if (textCustomFont2 != null) {
                                                                                            i = R.id.tv_cut;
                                                                                            TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                            if (textCustomFont3 != null) {
                                                                                                i = R.id.tv_delete;
                                                                                                TextCustomFont textCustomFont4 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                if (textCustomFont4 != null) {
                                                                                                    i = R.id.tv_duplicate;
                                                                                                    TextCustomFont textCustomFont5 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textCustomFont5 != null) {
                                                                                                        i = R.id.tv_edit;
                                                                                                        TextCustomFont textCustomFont6 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textCustomFont6 != null) {
                                                                                                            i = R.id.tv_font;
                                                                                                            TextCustomFont textCustomFont7 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textCustomFont7 != null) {
                                                                                                                i = R.id.tv_from_now;
                                                                                                                TextCustomFont textCustomFont8 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textCustomFont8 != null) {
                                                                                                                    i = R.id.tv_from_the_start;
                                                                                                                    TextCustomFont textCustomFont9 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (textCustomFont9 != null) {
                                                                                                                        i = R.id.tv_icon;
                                                                                                                        TextCustomFont textCustomFont10 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (textCustomFont10 != null) {
                                                                                                                            i = R.id.tv_until_now;
                                                                                                                            TextCustomFont textCustomFont11 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (textCustomFont11 != null) {
                                                                                                                                i = R.id.tv_until_the_end;
                                                                                                                                TextCustomFont textCustomFont12 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (textCustomFont12 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view))) != null) {
                                                                                                                                    i = R.id.view_time;
                                                                                                                                    LinearLayout linearLayout13 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (linearLayout13 != null) {
                                                                                                                                        return new FragmentEditEntityBinding((RelativeLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, imageView, imageView2, linearLayout11, linearLayout12, imageView3, imageView4, imageView5, imageView6, horizontalScrollView, textCustomFont, textCustomFont2, textCustomFont3, textCustomFont4, textCustomFont5, textCustomFont6, textCustomFont7, textCustomFont8, textCustomFont9, textCustomFont10, textCustomFont11, textCustomFont12, findChildViewById, linearLayout13);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
