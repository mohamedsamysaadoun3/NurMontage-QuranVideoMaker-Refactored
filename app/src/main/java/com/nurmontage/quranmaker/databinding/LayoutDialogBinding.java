package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.ButtonCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class LayoutDialogBinding implements ViewBinding {
    public final TextCustomFont dialogMessage;
    public final ButtonCustomFont dialogNo;
    public final TextCustomFont dialogTitle;
    public final ButtonCustomFont dialogYes;
    public final ImageView img;
    public final ImageView imgPro;
    private final LinearLayout rootView;

    private LayoutDialogBinding(LinearLayout linearLayout, TextCustomFont textCustomFont, ButtonCustomFont buttonCustomFont, TextCustomFont textCustomFont2, ButtonCustomFont buttonCustomFont2, ImageView imageView, ImageView imageView2) {
        this.rootView = linearLayout;
        this.dialogMessage = textCustomFont;
        this.dialogNo = buttonCustomFont;
        this.dialogTitle = textCustomFont2;
        this.dialogYes = buttonCustomFont2;
        this.img = imageView;
        this.imgPro = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutDialogBinding bind(View view) {
        int i = R.id.dialog_message;
        TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
        if (textCustomFont != null) {
            i = R.id.dialog_no;
            ButtonCustomFont buttonCustomFont = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
            if (buttonCustomFont != null) {
                i = R.id.dialog_title;
                TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                if (textCustomFont2 != null) {
                    i = R.id.dialog_yes;
                    ButtonCustomFont buttonCustomFont2 = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
                    if (buttonCustomFont2 != null) {
                        i = R.id.img;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.img_pro;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                return new LayoutDialogBinding((LinearLayout) view, textCustomFont, buttonCustomFont, textCustomFont2, buttonCustomFont2, imageView, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
