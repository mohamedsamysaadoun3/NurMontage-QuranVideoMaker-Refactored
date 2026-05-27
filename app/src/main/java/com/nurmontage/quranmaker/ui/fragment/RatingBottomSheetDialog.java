package com.nurmontage.quranmaker.ui.fragment;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.nurmontage.quranmaker.R;
import com.nurmontage.quranmaker.ui.view.ButtonCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;

/* loaded from: classes2.dex */
public class RatingBottomSheetDialog extends BottomSheetDialogFragment {
    private static final String KEY_NEVER_ASK_AGAIN = "never_ask_again_new";
    private static final String PREFS_NAME = "app_prefs_new_mars";
    private Resources res;

    public RatingBottomSheetDialog(Resources resources) {
        this.res = resources;
    }

    public RatingBottomSheetDialog() {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.rating_bottom_sheet, viewGroup, false);
        if (this.res == null) {
            return inflate;
        }
        ButtonCustomFont buttonCustomFont = (ButtonCustomFont) inflate.findViewById(R.id.rateButton);
        ButtonCustomFont buttonCustomFont2 = (ButtonCustomFont) inflate.findViewById(R.id.laterButton);
        ButtonCustomFont buttonCustomFont3 = (ButtonCustomFont) inflate.findViewById(R.id.neverButton);
        buttonCustomFont.setText(this.res.getString(R.string.rate_now));
        buttonCustomFont2.setText(this.res.getString(R.string.later));
        buttonCustomFont3.setText(this.res.getString(R.string.no_thanks));
        TextCustomFont textCustomFont = (TextCustomFont) inflate.findViewById(R.id.tv_tittle);
        TextCustomFont textCustomFont2 = (TextCustomFont) inflate.findViewById(R.id.tv_subtittle);
        textCustomFont.setText(this.res.getString(R.string.enjoying_the_app));
        textCustomFont2.setText(this.res.getString(R.string.moment_to_rate));
        buttonCustomFont.setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.fragment.RatingBottomSheetDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RatingBottomSheetDialog ratingBottomSheetDialog = RatingBottomSheetDialog.this;
                ratingBottomSheetDialog.openPlayStore(ratingBottomSheetDialog.getContext());
                RatingBottomSheetDialog.setNeverAskAgain(RatingBottomSheetDialog.this.getContext(), true);
                RatingBottomSheetDialog.this.dismiss();
            }
        });
        buttonCustomFont2.setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.fragment.RatingBottomSheetDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RatingBottomSheetDialog.this.dismiss();
            }
        });
        buttonCustomFont3.setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.fragment.RatingBottomSheetDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RatingBottomSheetDialog.setNeverAskAgain(RatingBottomSheetDialog.this.getContext(), true);
                RatingBottomSheetDialog.this.dismiss();
            }
        });
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openPlayStore(Context context) {
        String packageName = context.getPackageName();
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
        }
    }

    public static void setNeverAskAgain(Context context, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences(PREFS_NAME, 0).edit();
        edit.putBoolean(KEY_NEVER_ASK_AGAIN, z);
        edit.apply();
    }

    public static boolean shouldShowRatingDialog(Context context) {
        return !context.getSharedPreferences(PREFS_NAME, 0).getBoolean(KEY_NEVER_ASK_AGAIN, false);
    }
}
