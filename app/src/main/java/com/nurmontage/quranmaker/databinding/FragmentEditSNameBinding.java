package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class FragmentEditSNameBinding implements ViewBinding {
    public final LinearLayout btnColor;
    public final LinearLayout btnEdit;
    public final LinearLayout btnFont;
    private final LinearLayout rootView;
    public final TextCustomFont tvColor;
    public final TextCustomFont tvEdit;
    public final TextCustomFont tvFont;

    private FragmentEditSNameBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3) {
        this.rootView = linearLayout;
        this.btnColor = linearLayout2;
        this.btnEdit = linearLayout3;
        this.btnFont = linearLayout4;
        this.tvColor = textCustomFont;
        this.tvEdit = textCustomFont2;
        this.tvFont = textCustomFont3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEditSNameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEditSNameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_s__name, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentEditSNameBinding bind(View view) {
        int i = R.id.btn_color;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btn_edit;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.btn_font;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout3 != null) {
                    i = R.id.tv_color;
                    TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                    if (textCustomFont != null) {
                        i = R.id.tv_edit;
                        TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                        if (textCustomFont2 != null) {
                            i = R.id.tv_font;
                            TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                            if (textCustomFont3 != null) {
                                return new FragmentEditSNameBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, textCustomFont, textCustomFont2, textCustomFont3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
