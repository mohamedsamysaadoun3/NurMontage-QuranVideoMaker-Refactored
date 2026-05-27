package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.CheckboxCustomFont;
import com.nurmontage.quranmaker.ui.view.EditTextCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFontBold;

/* loaded from: classes2.dex */
public final class ActivityEditSnameBinding implements ViewBinding {
    public final ImageButton btnDone;
    public final ImageButton btnOnBack;
    public final CheckboxCustomFont checkboxBg;
    public final EditTextCustomFont edtReader;
    public final LinearLayout layoutBg;
    public final ConstraintLayout main;
    private final ConstraintLayout rootView;
    public final RecyclerView rvColor;
    public final TextCustomFontBold tvAddBg;
    public final TextCustomFont tvOption1;
    public final TextCustomFont tvOption2;
    public final TextCustomFontBold tvReaderName;
    public final TextCustomFontBold tvTittle;

    private ActivityEditSnameBinding(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, CheckboxCustomFont checkboxCustomFont, EditTextCustomFont editTextCustomFont, LinearLayout linearLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, TextCustomFontBold textCustomFontBold, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, TextCustomFontBold textCustomFontBold2, TextCustomFontBold textCustomFontBold3) {
        this.rootView = constraintLayout;
        this.btnDone = imageButton;
        this.btnOnBack = imageButton2;
        this.checkboxBg = checkboxCustomFont;
        this.edtReader = editTextCustomFont;
        this.layoutBg = linearLayout;
        this.main = constraintLayout2;
        this.rvColor = recyclerView;
        this.tvAddBg = textCustomFontBold;
        this.tvOption1 = textCustomFont;
        this.tvOption2 = textCustomFont2;
        this.tvReaderName = textCustomFontBold2;
        this.tvTittle = textCustomFontBold3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityEditSnameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityEditSnameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_edit_sname, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityEditSnameBinding bind(View view) {
        int i = R.id.btn_done;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.btn_on_back;
            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton2 != null) {
                i = R.id.checkbox_bg;
                CheckboxCustomFont checkboxCustomFont = (CheckboxCustomFont) ViewBindings.findChildViewById(view, i);
                if (checkboxCustomFont != null) {
                    i = R.id.edt_reader;
                    EditTextCustomFont editTextCustomFont = (EditTextCustomFont) ViewBindings.findChildViewById(view, i);
                    if (editTextCustomFont != null) {
                        i = R.id.layout_bg;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i = R.id.rv_color;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.tv_add_bg;
                                TextCustomFontBold textCustomFontBold = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
                                if (textCustomFontBold != null) {
                                    i = R.id.tv_option_1;
                                    TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                    if (textCustomFont != null) {
                                        i = R.id.tv_option_2;
                                        TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                        if (textCustomFont2 != null) {
                                            i = R.id.tv_reader_name;
                                            TextCustomFontBold textCustomFontBold2 = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
                                            if (textCustomFontBold2 != null) {
                                                i = R.id.tv_tittle;
                                                TextCustomFontBold textCustomFontBold3 = (TextCustomFontBold) ViewBindings.findChildViewById(view, i);
                                                if (textCustomFontBold3 != null) {
                                                    return new ActivityEditSnameBinding(constraintLayout, imageButton, imageButton2, checkboxCustomFont, editTextCustomFont, linearLayout, constraintLayout, recyclerView, textCustomFontBold, textCustomFont, textCustomFont2, textCustomFontBold2, textCustomFontBold3);
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
