package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class LayoutDialogPremuimBinding implements ViewBinding {
    public final ImageView btnRadioYear;
    public final TextCustomFont dialogMessage;
    public final ImageButton dialogNo;
    public final TextCustomFont dialogTitle;
    public final RelativeLayout dialogYes;
    public final ImageView img;
    private final LinearLayout rootView;
    public final TextCustomFont tvFeature;
    public final TextCustomFont tvSubscribe;

    private LayoutDialogPremuimBinding(LinearLayout linearLayout, ImageView imageView, TextCustomFont textCustomFont, ImageButton imageButton, TextCustomFont textCustomFont2, RelativeLayout relativeLayout, ImageView imageView2, TextCustomFont textCustomFont3, TextCustomFont textCustomFont4) {
        this.rootView = linearLayout;
        this.btnRadioYear = imageView;
        this.dialogMessage = textCustomFont;
        this.dialogNo = imageButton;
        this.dialogTitle = textCustomFont2;
        this.dialogYes = relativeLayout;
        this.img = imageView2;
        this.tvFeature = textCustomFont3;
        this.tvSubscribe = textCustomFont4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutDialogPremuimBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutDialogPremuimBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_dialog_premuim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutDialogPremuimBinding bind(View view) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.btn_radio_year);
        int i = R.id.dialog_message;
        TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
        if (textCustomFont != null) {
            i = R.id.dialog_no;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                i = R.id.dialog_title;
                TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                if (textCustomFont2 != null) {
                    i = R.id.dialog_yes;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.img;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, R.id.tv_feature);
                            i = R.id.tv_subscribe;
                            TextCustomFont textCustomFont4 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                            if (textCustomFont4 != null) {
                                return new LayoutDialogPremuimBinding((LinearLayout) view, imageView, textCustomFont, imageButton, textCustomFont2, relativeLayout, imageView2, textCustomFont3, textCustomFont4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
