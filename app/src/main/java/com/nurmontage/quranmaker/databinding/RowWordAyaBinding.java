package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class RowWordAyaBinding implements ViewBinding {
    private final TextCustomFont rootView;
    public final TextCustomFont wordAya;

    private RowWordAyaBinding(TextCustomFont textCustomFont, TextCustomFont textCustomFont2) {
        this.rootView = textCustomFont;
        this.wordAya = textCustomFont2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextCustomFont getRoot() {
        return this.rootView;
    }

    public static RowWordAyaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowWordAyaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.row_word_aya, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RowWordAyaBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextCustomFont textCustomFont = (TextCustomFont) view;
        return new RowWordAyaBinding(textCustomFont, textCustomFont);
    }
}
