package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class FragmentAddAudioBinding implements ViewBinding {
    public final ImageButton btnClose;
    public final LinearLayout btnExtract;
    public final RelativeLayout btnUpload;
    public final ImageView img;
    public final ImageView ivDataDisable;
    private final LinearLayout rootView;
    public final TextCustomFont tvAudio;
    public final TextCustomFont tvExtract;

    private FragmentAddAudioBinding(LinearLayout linearLayout, ImageButton imageButton, LinearLayout linearLayout2, RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, TextCustomFont textCustomFont, TextCustomFont textCustomFont2) {
        this.rootView = linearLayout;
        this.btnClose = imageButton;
        this.btnExtract = linearLayout2;
        this.btnUpload = relativeLayout;
        this.img = imageView;
        this.ivDataDisable = imageView2;
        this.tvAudio = textCustomFont;
        this.tvExtract = textCustomFont2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAddAudioBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAddAudioBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_add_audio, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentAddAudioBinding bind(View view) {
        int i = R.id.btn_close;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.btn_extract;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.btn_upload;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.iv_data_disable;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.tv_audio;
                            TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                            if (textCustomFont != null) {
                                i = R.id.tv_extract;
                                TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                if (textCustomFont2 != null) {
                                    return new FragmentAddAudioBinding((LinearLayout) view, imageButton, linearLayout, relativeLayout, imageView, imageView2, textCustomFont, textCustomFont2);
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
