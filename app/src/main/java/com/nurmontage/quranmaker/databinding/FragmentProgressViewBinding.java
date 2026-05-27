package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class FragmentProgressViewBinding implements ViewBinding {
    public final ProgressBar progressHorizontal;
    private final FrameLayout rootView;
    public final TextCustomFont tvProgress;
    public final FrameLayout view1;
    public final FrameLayout view2;
    public final FrameLayout viewProgress;

    private FragmentProgressViewBinding(FrameLayout frameLayout, ProgressBar progressBar, TextCustomFont textCustomFont, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4) {
        this.rootView = frameLayout;
        this.progressHorizontal = progressBar;
        this.tvProgress = textCustomFont;
        this.view1 = frameLayout2;
        this.view2 = frameLayout3;
        this.viewProgress = frameLayout4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentProgressViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentProgressViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_progress_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentProgressViewBinding bind(View view) {
        int i = R.id.progress_horizontal;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            i = R.id.tv_progress;
            TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
            if (textCustomFont != null) {
                i = R.id.view_1;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.view_2;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout2 != null) {
                        FrameLayout frameLayout3 = (FrameLayout) view;
                        return new FragmentProgressViewBinding(frameLayout3, progressBar, textCustomFont, frameLayout, frameLayout2, frameLayout3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
