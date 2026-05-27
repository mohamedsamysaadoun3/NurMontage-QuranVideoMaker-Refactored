package com.nurmontage.quranmaker.ui.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public class TextCustomFont extends AppCompatTextView {
    private Typeface typeface;

    public TextCustomFont(Context context) {
        super(context);
        init(context);
    }

    public TextCustomFont(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public TextCustomFont(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        if (this.typeface == null) {
            Typeface createFromAsset = Typeface.createFromAsset(getResources().getAssets(), "fonts/ReadexPro_Medium.ttf");
            this.typeface = createFromAsset;
            setTypeface(createFromAsset);
        }
    }
}
