package com.nurmontage.quranmaker.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.databinding.FragmentProgressViewBinding;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public class ProgressViewFragment extends Fragment {
    public static ProgressViewFragment instance;
    private FragmentProgressViewBinding binding;
    private TextCustomFont tv_progress;

    public static ProgressViewFragment getInstance() {
        if (instance == null) {
            instance = new ProgressViewFragment();
        }
        return instance;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentProgressViewBinding inflate = FragmentProgressViewBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        FrameLayout root = inflate.getRoot();
        this.tv_progress = (TextCustomFont) root.findViewById(R.id.tv_progress);
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        instance = null;
    }

    public void update(int i, int i2) {
        TextCustomFont textCustomFont = this.tv_progress;
        if (textCustomFont != null) {
            textCustomFont.setText(i + "/" + i2);
        }
    }
}
