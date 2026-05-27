package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.ButtonCustomFont;
import com.nurmontage.quranmaker.ui.view.EditTextCustomFont;

/* loaded from: classes2.dex */
public final class ActivityTextEditBinding implements ViewBinding {
    public final ImageButton btnCancel;
    public final ButtonCustomFont btnDone;
    public final EditTextCustomFont edtReader;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final View view;

    private ActivityTextEditBinding(RelativeLayout relativeLayout, ImageButton imageButton, ButtonCustomFont buttonCustomFont, EditTextCustomFont editTextCustomFont, RelativeLayout relativeLayout2, RecyclerView recyclerView, View view) {
        this.rootView = relativeLayout;
        this.btnCancel = imageButton;
        this.btnDone = buttonCustomFont;
        this.edtReader = editTextCustomFont;
        this.main = relativeLayout2;
        this.rv = recyclerView;
        this.view = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTextEditBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTextEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_text_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityTextEditBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btn_cancel;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.btn_done;
            ButtonCustomFont buttonCustomFont = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
            if (buttonCustomFont != null) {
                i = R.id.edt_reader;
                EditTextCustomFont editTextCustomFont = (EditTextCustomFont) ViewBindings.findChildViewById(view, i);
                if (editTextCustomFont != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R.id.rv;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view))) != null) {
                        return new ActivityTextEditBinding(relativeLayout, imageButton, buttonCustomFont, editTextCustomFont, relativeLayout, recyclerView, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
