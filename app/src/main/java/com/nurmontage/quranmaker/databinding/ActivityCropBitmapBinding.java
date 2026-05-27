package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.ButtonCustomFont;
import com.nurmontage.quranmaker.ui.view.CropView;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class ActivityCropBitmapBinding implements ViewBinding {
    public final ImageButton btnCancel;
    public final ButtonCustomFont btnDone;
    public final CropView cropView;
    public final RelativeLayout main;
    private final RelativeLayout rootView;
    public final TextCustomFont tvTittleFragment;

    private ActivityCropBitmapBinding(RelativeLayout relativeLayout, ImageButton imageButton, ButtonCustomFont buttonCustomFont, CropView cropView, RelativeLayout relativeLayout2, TextCustomFont textCustomFont) {
        this.rootView = relativeLayout;
        this.btnCancel = imageButton;
        this.btnDone = buttonCustomFont;
        this.cropView = cropView;
        this.main = relativeLayout2;
        this.tvTittleFragment = textCustomFont;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCropBitmapBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCropBitmapBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_crop_bitmap, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityCropBitmapBinding bind(View view) {
        int i = R.id.btn_cancel;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.btn_done;
            ButtonCustomFont buttonCustomFont = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
            if (buttonCustomFont != null) {
                i = R.id.crop_view;
                CropView cropView = (CropView) ViewBindings.findChildViewById(view, i);
                if (cropView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R.id.tv_tittle_fragment;
                    TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                    if (textCustomFont != null) {
                        return new ActivityCropBitmapBinding(relativeLayout, imageButton, buttonCustomFont, cropView, relativeLayout, textCustomFont);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
