package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class RowFontBinding implements ViewBinding {
    private final RelativeLayout rootView;
    public final TextCustomFont tvFont;
    public final TextCustomFont tvNumber;

    private RowFontBinding(RelativeLayout relativeLayout, TextCustomFont textCustomFont, TextCustomFont textCustomFont2) {
        this.rootView = relativeLayout;
        this.tvFont = textCustomFont;
        this.tvNumber = textCustomFont2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static RowFontBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowFontBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.row_font, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RowFontBinding bind(View view) {
        int i = R.id.tv_font;
        TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
        if (textCustomFont != null) {
            i = R.id.tv_number;
            TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
            if (textCustomFont2 != null) {
                return new RowFontBinding((RelativeLayout) view, textCustomFont, textCustomFont2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
