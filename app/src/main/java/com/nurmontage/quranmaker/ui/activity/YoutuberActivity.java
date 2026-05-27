package com.nurmontage.quranmaker.ui.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nurmontage.quranmaker.util.AppUtils;
import com.nurmontage.quranmaker.util.LocaleHelper;
import com.nurmontage.quranmaker.util.ScreenUtils;
import com.nurmontage.quranmaker.ui.adapter.YoutuberAdapter;
import com.nurmontage.quranmaker.model.YoutuberModel;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class YoutuberActivity extends Base {
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(true) { // from class: com.nurmontage.quranmaker.ui.activity.YoutuberActivity.1
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            YoutuberActivity.this.finish();
        }
    };
    private YoutuberAdapter.IYoutuber iYoutuber = new YoutuberAdapter.IYoutuber() { // from class: com.nurmontage.quranmaker.ui.activity.YoutuberActivity.2
        @Override // com.nurmontage.quranmaker.ui.adapter.YoutuberAdapter.IYoutuber
        public void onClick(String str) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("vnd.youtube:" + str));
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/" + str));
            try {
                try {
                    YoutuberActivity.this.startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (ActivityNotFoundException unused) {
                YoutuberActivity.this.startActivity(intent2);
            }
        }
    };

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(LocaleHelper.onAttach(context));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        this.iYoutuber = null;
        super.onDestroy();
    }

    private void init() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new YoutuberModel("AjFCfILaEI8", R.drawable.hilal_ytb));
        arrayList.add(new YoutuberModel("vMgFSEE2hmg", R.drawable.gasadi_ytb));
        arrayList.add(new YoutuberModel("dr1LTEvCEHk", R.drawable.hicham_ytb));
        arrayList.add(new YoutuberModel("cRNG62W8ZLk", R.drawable.pakestain));
        arrayList.add(new YoutuberModel("tkPEq4qz2OQ", R.drawable.sajad_ytb));
        arrayList.add(new YoutuberModel("5IQzSF0wqJE", R.drawable.noor_ytb));
        arrayList.add(new YoutuberModel("E9cVRHeDzeU", R.drawable.ytb_yesser));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);
        YoutuberAdapter youtuberAdapter = new YoutuberAdapter(this.iYoutuber, arrayList, AppUtils.getAppVersionName(this), ScreenUtils.getScreenWidth(this), (int) (ScreenUtils.getScreenHeight(this) * 0.35f));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(youtuberAdapter);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_youtuber);
        getOnBackPressedDispatcher().addCallback(this, this.onBackPressedCallback);
        setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
        setNavigationBarColor(ViewCompat.MEASURED_STATE_MASK);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.nurmontage.quranmaker.ui.activity.YoutuberActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return YoutuberActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        Resources resources = getResources();
        this.mResources = resources;
        if (resources == null) {
            finish();
        }
        findViewById(R.id.btn_on_back).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.YoutuberActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                YoutuberActivity.this.onBackPressedCallback.handleOnBackPressed();
            }
        });
        init();
        findViewById(R.id.btn_send_lnk).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.YoutuberActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                YoutuberActivity youtuberActivity = YoutuberActivity.this;
                youtuberActivity.youtuberLnk(youtuberActivity);
            }
        });
        ((TextCustomFont) findViewById(R.id.tv_tutorial)).setText(this.mResources.getString(R.string.my_tutorial));
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    private boolean isGmailAvailable(Context context) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.setPackage("com.google.android.gm");
        return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public void youtuberLnk(Context context) {
        String string = this.mResources.getString(R.string.i_m_youtuber);
        String[] strArr = {"hazemourari08@gmail.com"};
        if (isGmailAvailable(context)) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.EMAIL", strArr);
            intent.putExtra("android.intent.extra.BCC", strArr);
            intent.putExtra("android.intent.extra.SUBJECT", string);
            intent.putExtra("android.intent.extra.TEXT", this.mResources.getString(R.string.link));
            intent.setType("message/rfc822");
            intent.setPackage("com.google.android.gm");
            try {
                startActivity(intent);
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.putExtra("android.intent.extra.EMAIL", strArr);
            intent2.putExtra("android.intent.extra.BCC", strArr);
            intent2.putExtra("android.intent.extra.SUBJECT", string);
            intent2.putExtra("android.intent.extra.TEXT", this.mResources.getString(R.string.link));
            intent2.setType("message/rfc822");
            startActivity(Intent.createChooser(intent2, "Send email using"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
