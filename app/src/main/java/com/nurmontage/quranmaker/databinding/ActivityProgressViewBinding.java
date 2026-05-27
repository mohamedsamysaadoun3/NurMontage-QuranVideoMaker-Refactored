package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.ButtonCustomFont;
import com.nurmontage.quranmaker.ui.view.SquareOutlineProgressBar;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class ActivityProgressViewBinding implements ViewBinding {
    public final ImageButton btnCancel;
    public final ButtonCustomFont btnSupportTeam;
    public final LinearLayout layoutError;
    public final FrameLayout main;
    public final ProgressBar progress;
    public final SquareOutlineProgressBar progressHorizontal;
    private final FrameLayout rootView;
    public final TextCustomFont tvError;
    public final TextCustomFont tvHint;
    public final TextCustomFont tvProgress;

    private ActivityProgressViewBinding(FrameLayout frameLayout, ImageButton imageButton, ButtonCustomFont buttonCustomFont, LinearLayout linearLayout, FrameLayout frameLayout2, ProgressBar progressBar, SquareOutlineProgressBar squareOutlineProgressBar, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3) {
        this.rootView = frameLayout;
        this.btnCancel = imageButton;
        this.btnSupportTeam = buttonCustomFont;
        this.layoutError = linearLayout;
        this.main = frameLayout2;
        this.progress = progressBar;
        this.progressHorizontal = squareOutlineProgressBar;
        this.tvError = textCustomFont;
        this.tvHint = textCustomFont2;
        this.tvProgress = textCustomFont3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityProgressViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityProgressViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_progress_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityProgressViewBinding bind(View view) {
        int i = R.id.btn_cancel;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.btn_support_team;
            ButtonCustomFont buttonCustomFont = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
            if (buttonCustomFont != null) {
                i = R.id.layout_error;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i = R.id.progress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                    if (progressBar != null) {
                        i = R.id.progress_horizontal;
                        SquareOutlineProgressBar squareOutlineProgressBar = (SquareOutlineProgressBar) ViewBindings.findChildViewById(view, i);
                        if (squareOutlineProgressBar != null) {
                            i = R.id.tv_error;
                            TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                            if (textCustomFont != null) {
                                i = R.id.tv_hint;
                                TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                if (textCustomFont2 != null) {
                                    i = R.id.tv_progress;
                                    TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                    if (textCustomFont3 != null) {
                                        return new ActivityProgressViewBinding(frameLayout, imageButton, buttonCustomFont, linearLayout, frameLayout, progressBar, squareOutlineProgressBar, textCustomFont, textCustomFont2, textCustomFont3);
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
