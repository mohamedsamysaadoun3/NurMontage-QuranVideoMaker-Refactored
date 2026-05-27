package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.ButtonCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class LayoutBillingDialogBinding implements ViewBinding {
    public final ImageButton btnOnBack;
    public final ButtonCustomFont dialogMaybeLater;
    public final RelativeLayout dialogNo;
    public final TextCustomFont dialogTitle;
    public final RelativeLayout dialogYes;
    public final ImageView img;
    public final ImageView ivIcon;
    public final ProgressBar progress;
    private final LinearLayout rootView;
    public final TextCustomFont tvSubscribe;
    public final TextCustomFont tvWattermark;

    private LayoutBillingDialogBinding(LinearLayout linearLayout, ImageButton imageButton, ButtonCustomFont buttonCustomFont, RelativeLayout relativeLayout, TextCustomFont textCustomFont, RelativeLayout relativeLayout2, ImageView imageView, ImageView imageView2, ProgressBar progressBar, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3) {
        this.rootView = linearLayout;
        this.btnOnBack = imageButton;
        this.dialogMaybeLater = buttonCustomFont;
        this.dialogNo = relativeLayout;
        this.dialogTitle = textCustomFont;
        this.dialogYes = relativeLayout2;
        this.img = imageView;
        this.ivIcon = imageView2;
        this.progress = progressBar;
        this.tvSubscribe = textCustomFont2;
        this.tvWattermark = textCustomFont3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutBillingDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutBillingDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_billing_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutBillingDialogBinding bind(View view) {
        int i = R.id.btn_on_back;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.dialog_maybe_later;
            ButtonCustomFont buttonCustomFont = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
            if (buttonCustomFont != null) {
                i = R.id.dialog_no;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.dialog_title;
                    TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                    if (textCustomFont != null) {
                        i = R.id.dialog_yes;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout2 != null) {
                            i = R.id.img;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.iv_icon;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.progress;
                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                    if (progressBar != null) {
                                        i = R.id.tv_subscribe;
                                        TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                        if (textCustomFont2 != null) {
                                            i = R.id.tv_wattermark;
                                            TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                            if (textCustomFont3 != null) {
                                                return new LayoutBillingDialogBinding((LinearLayout) view, imageButton, buttonCustomFont, relativeLayout, textCustomFont, relativeLayout2, imageView, imageView2, progressBar, textCustomFont2, textCustomFont3);
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
