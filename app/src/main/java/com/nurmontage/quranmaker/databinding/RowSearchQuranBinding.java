package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFontAR;

/* loaded from: classes2.dex */
public final class RowSearchQuranBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextCustomFontAR tvSurah;
    public final TextCustomFontAR tvSurahNameAndNumber;

    private RowSearchQuranBinding(LinearLayout linearLayout, TextCustomFontAR textCustomFontAR, TextCustomFontAR textCustomFontAR2) {
        this.rootView = linearLayout;
        this.tvSurah = textCustomFontAR;
        this.tvSurahNameAndNumber = textCustomFontAR2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static RowSearchQuranBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowSearchQuranBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.row_search_quran, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RowSearchQuranBinding bind(View view) {
        int i = R.id.tv_surah;
        TextCustomFontAR textCustomFontAR = (TextCustomFontAR) ViewBindings.findChildViewById(view, i);
        if (textCustomFontAR != null) {
            i = R.id.tv_surah_name_and_number;
            TextCustomFontAR textCustomFontAR2 = (TextCustomFontAR) ViewBindings.findChildViewById(view, i);
            if (textCustomFontAR2 != null) {
                return new RowSearchQuranBinding((LinearLayout) view, textCustomFontAR, textCustomFontAR2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
