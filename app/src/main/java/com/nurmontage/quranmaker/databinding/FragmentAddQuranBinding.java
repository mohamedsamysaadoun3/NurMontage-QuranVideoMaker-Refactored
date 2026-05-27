package com.nurmontage.quranmaker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.ButtonCustomFont;
import com.nurmontage.quranmaker.ui.view.CheckboxCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public final class FragmentAddQuranBinding implements ViewBinding {
    public final LinearLayout addBismilah;
    public final Spinner ayaFrom;
    public final Spinner ayaTo;
    public final ImageButton btnCancel;
    public final ButtonCustomFont btnDone;
    public final ImageButton btnSearch;
    public final ButtonCustomFont btnUpload;
    public final CheckboxCustomFont checkbox;
    public final FrameLayout frameLayout;
    public final LinearLayout hintNoInternet;
    public final ImageView ivDone;
    public final LinearLayout nameReader;
    private final RelativeLayout rootView;
    public final RecyclerView rv;
    public final Spinner spinnerReciters;
    public final Spinner spinnerTranslation;
    public final Spinner suraName;
    public final TextCustomFont tvAddBismilah;
    public final TextCustomFont tvEndAyah;
    public final TextCustomFont tvHintReader;
    public final TextCustomFont tvIcon;
    public final TextCustomFont tvNumber;
    public final TextCustomFont tvOr;
    public final TextCustomFont tvReader;
    public final TextCustomFont tvSurah;
    public final TextCustomFont tvTranslation;
    public final View v;
    public final LinearLayout viewAya;
    public final View viewSurah;
    public final RelativeLayout viewTolbar;

    private FragmentAddQuranBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, Spinner spinner, Spinner spinner2, ImageButton imageButton, ButtonCustomFont buttonCustomFont, ImageButton imageButton2, ButtonCustomFont buttonCustomFont2, CheckboxCustomFont checkboxCustomFont, FrameLayout frameLayout, LinearLayout linearLayout2, ImageView imageView, LinearLayout linearLayout3, RecyclerView recyclerView, Spinner spinner3, Spinner spinner4, Spinner spinner5, TextCustomFont textCustomFont, TextCustomFont textCustomFont2, TextCustomFont textCustomFont3, TextCustomFont textCustomFont4, TextCustomFont textCustomFont5, TextCustomFont textCustomFont6, TextCustomFont textCustomFont7, TextCustomFont textCustomFont8, TextCustomFont textCustomFont9, View view, LinearLayout linearLayout4, View view2, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.addBismilah = linearLayout;
        this.ayaFrom = spinner;
        this.ayaTo = spinner2;
        this.btnCancel = imageButton;
        this.btnDone = buttonCustomFont;
        this.btnSearch = imageButton2;
        this.btnUpload = buttonCustomFont2;
        this.checkbox = checkboxCustomFont;
        this.frameLayout = frameLayout;
        this.hintNoInternet = linearLayout2;
        this.ivDone = imageView;
        this.nameReader = linearLayout3;
        this.rv = recyclerView;
        this.spinnerReciters = spinner3;
        this.spinnerTranslation = spinner4;
        this.suraName = spinner5;
        this.tvAddBismilah = textCustomFont;
        this.tvEndAyah = textCustomFont2;
        this.tvHintReader = textCustomFont3;
        this.tvIcon = textCustomFont4;
        this.tvNumber = textCustomFont5;
        this.tvOr = textCustomFont6;
        this.tvReader = textCustomFont7;
        this.tvSurah = textCustomFont8;
        this.tvTranslation = textCustomFont9;
        this.v = view;
        this.viewAya = linearLayout4;
        this.viewSurah = view2;
        this.viewTolbar = relativeLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAddQuranBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAddQuranBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_add_quran, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentAddQuranBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.add_bismilah;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.aya_from;
            Spinner spinner = (Spinner) ViewBindings.findChildViewById(view, i);
            if (spinner != null) {
                i = R.id.aya_to;
                Spinner spinner2 = (Spinner) ViewBindings.findChildViewById(view, i);
                if (spinner2 != null) {
                    i = R.id.btn_cancel;
                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                    if (imageButton != null) {
                        i = R.id.btn_done;
                        ButtonCustomFont buttonCustomFont = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
                        if (buttonCustomFont != null) {
                            i = R.id.btn_search;
                            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                            if (imageButton2 != null) {
                                i = R.id.btn_upload;
                                ButtonCustomFont buttonCustomFont2 = (ButtonCustomFont) ViewBindings.findChildViewById(view, i);
                                if (buttonCustomFont2 != null) {
                                    i = R.id.checkbox;
                                    CheckboxCustomFont checkboxCustomFont = (CheckboxCustomFont) ViewBindings.findChildViewById(view, i);
                                    if (checkboxCustomFont != null) {
                                        i = R.id.frame_layout;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout != null) {
                                            i = R.id.hint_no_internet;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout2 != null) {
                                                i = R.id.iv_done;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView != null) {
                                                    i = R.id.name_reader;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.rv;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                        if (recyclerView != null) {
                                                            i = R.id.spinner_reciters;
                                                            Spinner spinner3 = (Spinner) ViewBindings.findChildViewById(view, i);
                                                            if (spinner3 != null) {
                                                                i = R.id.spinner_translation;
                                                                Spinner spinner4 = (Spinner) ViewBindings.findChildViewById(view, i);
                                                                if (spinner4 != null) {
                                                                    i = R.id.sura_name;
                                                                    Spinner spinner5 = (Spinner) ViewBindings.findChildViewById(view, i);
                                                                    if (spinner5 != null) {
                                                                        i = R.id.tv_add_bismilah;
                                                                        TextCustomFont textCustomFont = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                        if (textCustomFont != null) {
                                                                            i = R.id.tv_end_ayah;
                                                                            TextCustomFont textCustomFont2 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                            if (textCustomFont2 != null) {
                                                                                i = R.id.tv_hint_reader;
                                                                                TextCustomFont textCustomFont3 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                if (textCustomFont3 != null) {
                                                                                    i = R.id.tv_icon;
                                                                                    TextCustomFont textCustomFont4 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                    if (textCustomFont4 != null) {
                                                                                        i = R.id.tv_number;
                                                                                        TextCustomFont textCustomFont5 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                        if (textCustomFont5 != null) {
                                                                                            i = R.id.tv_or;
                                                                                            TextCustomFont textCustomFont6 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                            if (textCustomFont6 != null) {
                                                                                                i = R.id.tv_reader;
                                                                                                TextCustomFont textCustomFont7 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                if (textCustomFont7 != null) {
                                                                                                    i = R.id.tv_surah;
                                                                                                    TextCustomFont textCustomFont8 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textCustomFont8 != null) {
                                                                                                        i = R.id.tv_translation;
                                                                                                        TextCustomFont textCustomFont9 = (TextCustomFont) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textCustomFont9 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.v))) != null) {
                                                                                                            i = R.id.view_aya;
                                                                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                            if (linearLayout4 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.view_surah))) != null) {
                                                                                                                i = R.id.view_tolbar;
                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                if (relativeLayout != null) {
                                                                                                                    return new FragmentAddQuranBinding((RelativeLayout) view, linearLayout, spinner, spinner2, imageButton, buttonCustomFont, imageButton2, buttonCustomFont2, checkboxCustomFont, frameLayout, linearLayout2, imageView, linearLayout3, recyclerView, spinner3, spinner4, spinner5, textCustomFont, textCustomFont2, textCustomFont3, textCustomFont4, textCustomFont5, textCustomFont6, textCustomFont7, textCustomFont8, textCustomFont9, findChildViewById, linearLayout4, findChildViewById2, relativeLayout);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
