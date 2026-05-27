package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFontBold;

/* loaded from: classes2.dex */
public final class LayoutProDoneBinding implements ViewBinding {
    public final ImageButton dialogNo;
    public final TextCustomFontBold dialogTitle;
    private final LinearLayout rootView;
    public final TextCustomFont tvMsj;

    private LayoutProDoneBinding(LinearLayout linearLayout, ImageButton imageButton, TextCustomFontBold textCustomFontBold, TextCustomFont textCustomFont) {
        this.rootView = linearLayout;
        this.dialogNo = imageButton;
        this.dialogTitle = textCustomFontBold;
        this.tvMsj = textCustomFont;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutProDoneBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutProDoneBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_pro_done, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutProDoneBinding bind(View view) {
        int i = R.id.dialog_no;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.dialog_title;
            TextCustomFontBold textCustomFontBold = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
            if (textCustomFontBold != null) {
                i = R.id.tv_msj;
                TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                if (textCustomFont != null) {
                    return new LayoutProDoneBinding((LinearLayout) view, imageButton, textCustomFontBold, textCustomFont);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
