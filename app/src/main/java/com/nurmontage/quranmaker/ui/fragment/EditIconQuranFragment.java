package com.nurmontage.quranmaker.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.adapter.IconQuranAdapters;
import com.nurmontage.quranmaker.databinding.FragmentFontBinding;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class EditIconQuranFragment extends Fragment {
    public static EditIconQuranFragment instance;
    private FragmentFontBinding fragmentBinding;
    private IQuranIconCallback iQuranIconCallback;
    private String icon;
    private IconQuranAdapters.IIconQuranCallback iconQuranCallback = new IconQuranAdapters.IIconQuranCallback() { // from class: com.nurmontage.quranmaker.ui.fragment.EditIconQuranFragment.3
        @Override // com.nurmontage.quranmaker.ui.adapter.IconQuranAdapters.IIconQuranCallback
        public void onIcon(String str) {
            EditIconQuranFragment.this.icon = str;
            if (EditIconQuranFragment.this.iQuranIconCallback != null) {
                EditIconQuranFragment.this.iQuranIconCallback.add(EditIconQuranFragment.this.icon);
            }
        }
    };
    private String last_icon;

    public interface IQuranIconCallback {
        void add(String str);

        void onCancel(String str);

        void onDone(String str);
    }

    public static EditIconQuranFragment getInstance(IQuranIconCallback iQuranIconCallback, String str) {
        if (instance == null) {
            instance = new EditIconQuranFragment(iQuranIconCallback, str);
        }
        return instance;
    }

    public EditIconQuranFragment() {
    }

    public EditIconQuranFragment(IQuranIconCallback iQuranIconCallback, String str) {
        this.iQuranIconCallback = iQuranIconCallback;
        this.icon = str;
        this.last_icon = str;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentFontBinding inflate = FragmentFontBinding.inflate(layoutInflater, viewGroup, false);
        this.fragmentBinding = inflate;
        LinearLayout root = inflate.getRoot();
        try {
            RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.rv);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            recyclerView.setItemAnimator(null);
            recyclerView.setHasFixedSize(true);
            ArrayList arrayList = new ArrayList();
            arrayList.add("hafes");
            arrayList.add("shamerli");
            arrayList.add("nour_hode");
            arrayList.add("amiri");
            IconQuranAdapters iconQuranAdapters = new IconQuranAdapters(this.iconQuranCallback, arrayList, arrayList.indexOf(this.icon));
            if (iconQuranAdapters.getSelect() != -1) {
                this.icon = (String) arrayList.get(iconQuranAdapters.getSelect());
            }
            recyclerView.setAdapter(iconQuranAdapters);
            root.findViewById(R.id.btn_done).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.fragment.EditIconQuranFragment.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (EditIconQuranFragment.this.iQuranIconCallback != null) {
                        EditIconQuranFragment.this.iQuranIconCallback.onDone(EditIconQuranFragment.this.icon);
                    }
                }
            });
            root.findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.fragment.EditIconQuranFragment.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (EditIconQuranFragment.this.iQuranIconCallback != null) {
                        EditIconQuranFragment.this.iQuranIconCallback.onCancel(EditIconQuranFragment.this.last_icon);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.iconQuranCallback = null;
        this.fragmentBinding = null;
        this.iQuranIconCallback = null;
        instance = null;
    }
}
