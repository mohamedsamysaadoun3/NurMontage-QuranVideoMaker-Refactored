package com.nurmontage.quranmaker.ui.activity;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.nurmontage.quranmaker.util.BillingPreferences;
import com.nurmontage.quranmaker.util.LocaleHelper;
import com.nurmontage.quranmaker.util.MyPreferences;
import com.nurmontage.quranmaker.ui.view.TextCustomFont;
import com.nurmontage.quranmaker.ui.view.TextCustomFontBold;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class SettingsActivity extends Base implements PurchasesUpdatedListener {
    private static String PRODUCT_ID_FOREIVER = "sku.nurmontage.foreiver";
    private BillingClient billingClient;
    private Dialog dialog;
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(true) { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.1
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            SettingsActivity.this.startActivity(new Intent(SettingsActivity.this, (Class<?>) WorkUserActivity.class));
            SettingsActivity.this.overridePendingTransition(0, 0);
            SettingsActivity.this.finish();
        }
    };
    private boolean hasPurchasedForever = false;

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(LocaleHelper.onAttach(context));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seetting);
        getOnBackPressedDispatcher().addCallback(this, this.onBackPressedCallback);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), true);
        setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
        setNavigationBarColor(ViewCompat.MEASURED_STATE_MASK);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SettingsActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        Resources resources = getResources();
        this.mResources = resources;
        if (resources == null) {
            finish();
        }
        init();
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPro() {
        ((TextCustomFontBold) findViewById(R.id.tv_your_pro)).setText(this.mResources.getString(R.string.you_are_premium));
        ((LinearLayout) findViewById(R.id.btn_to_pro)).setBackgroundResource(R.drawable.bg_your_pro);
        findViewById(R.id.btn_restore).setVisibility(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (BillingPreferences.isSubscribed(this)) {
            setPro();
        } else {
            findViewById(R.id.btn_restore).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SettingsActivity.this.findViewById(R.id.progress).setVisibility(0);
                    SettingsActivity.this.restoreSubscribe();
                }
            });
        }
    }

    private void init() {
        findViewById(R.id.btn_on_back).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.onBackPressedCallback.handleOnBackPressed();
            }
        });
        TextCustomFont textCustomFont = (TextCustomFont) findViewById(R.id.tv_version);
        try {
            String str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            if (str != null) {
                str = str.replace("-nurmontage4kb", "").replace("-nurmontage16kb", "");
            }
            if (LocaleHelper.getLanguage(this).equals("ar")) {
                textCustomFont.setText("إصدار : " + str);
            } else {
                textCustomFont.setText("Version : " + str);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        findViewById(R.id.btn_rate_app).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.openPlayStoreForRating();
            }
        });
        findViewById(R.id.btn_more_app).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.openMoreApps();
            }
        });
        findViewById(R.id.btn_share).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.shareApp();
            }
        });
        findViewById(R.id.btn_lang).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.changeLang();
            }
        });
        findViewById(R.id.btn_copyRight).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.dialogCopyRight();
            }
        });
        findViewById(R.id.btn_to_pro).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.toPro();
            }
        });
        findViewById(R.id.btn_about).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.toAbout();
            }
        });
        findViewById(R.id.btn_im_bloger).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.toYoutuber();
            }
        });
        findViewById(R.id.btn_instagram).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.openInstagramPage();
            }
        });
        findViewById(R.id.btn_youtbe).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.openYouTubePage();
            }
        });
        findViewById(R.id.btn_ticktock).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.openTikTokPage();
            }
        });
        findViewById(R.id.btn_whatsap).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.help();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void help() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://chat.whatsapp.com/F0kqOjZS1VuBAvoiOG4XEZ"));
            intent.setPackage("com.whatsapp");
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toYoutuber() {
        startActivity(new Intent(this, (Class<?>) YoutuberActivity.class));
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        cancelDialog();
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeLang() {
        Intent intent = new Intent(this, (Class<?>) ChoiceLangActivity.class);
        intent.putExtra("from_setting", true);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openMoreApps() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://dev?id=8943620497392395895"));
        intent.setPackage("com.android.vending");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=8943620497392395895")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openPlayStoreForRating() {
        String packageName = getPackageName();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName));
        intent.setPackage("com.android.vending");
        intent.addFlags(1476395008);
        try {
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(this, "Unable to open app store or browser.", 1).show();
            }
        } catch (ActivityNotFoundException unused2) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + packageName)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toPro() {
        Intent intent;
        if (BillingPreferences.isSubscribed(this)) {
            intent = new Intent(this, (Class<?>) ProVersionActivityDone.class);
        } else {
            intent = new Intent(this, (Class<?>) ProVersionActivity.class);
        }
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toAbout() {
        MyPreferences.putVueAbout(this);
        startActivity(new Intent(this, (Class<?>) AboutActivity.class));
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shareApp() {
        String str;
        if (LocaleHelper.getLanguage(this).equals("ar")) {
            str = "أنشئ ريلز قرآنية جميلة بسهولة 🎧✨\nجرّب NurMontage:\nhttps://play.google.com/store/apps/details?id=hazem.nurmontage.videoquran";
        } else {
            str = "Create beautiful Quran Reels easily 🎧✨\nTry NurMontage:\nhttps://play.google.com/store/apps/details?id=hazem.nurmontage.videoquran";
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "Check out this app!");
        intent.putExtra("android.intent.extra.TEXT", str);
        startActivity(Intent.createChooser(intent, "Share via"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openInstagramPage() {
        Uri parse = Uri.parse("https://www.instagram.com/nurmontage.app/");
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.setPackage("com.instagram.android");
        try {
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                startActivity(new Intent("android.intent.action.VIEW", parse));
            }
        } catch (ActivityNotFoundException unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openYouTubePage() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/@NurMontageApp/"));
        intent.setPackage("com.google.android.youtube");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/@NurMontageApp/")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openTikTokPage() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tiktok.com/@nurmontagesupport"));
        intent.setPackage("com.zhiliaoapp.musically");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.tiktok.com/@nurmontagesupport")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelDialog() {
        Dialog dialog = this.dialog;
        if (dialog != null && dialog.isShowing()) {
            this.dialog.dismiss();
        }
        this.dialog = null;
    }

    public void dialogCopyRight() {
        try {
            Dialog dialog = new Dialog(this);
            this.dialog = dialog;
            dialog.setCancelable(true);
            this.dialog.requestWindowFeature(1);
            this.dialog.getWindow().setLayout(-1, -2);
            this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            View inflate = LayoutInflater.from(this).inflate(R.layout.layout_dialog_copyright, (ViewGroup) null);
            this.dialog.setContentView(inflate);
            TextCustomFontBold textCustomFontBold = (TextCustomFontBold) inflate.findViewById(R.id.dialog_title);
            TextCustomFont textCustomFont = (TextCustomFont) inflate.findViewById(R.id.tv_msj);
            inflate.findViewById(R.id.dialog_no).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.16
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SettingsActivity.this.cancelDialog();
                }
            });
            if (LocaleHelper.getLanguage(this).equals("ar")) {
                textCustomFontBold.setText("تنبيه حقوق الاستخدام ⚠️");
                textCustomFont.setText("بعض تسجيلات تلاوات القرّاء محمية بحقوق النشر، وهي مخصّصة للاستخدام الشخصي فقط.\n\nقد تسمح بعض المنصات باستخدام هذه الأصوات دون مشاكل، لكن ذلك لا يُعدّ تصريحًا بالنشر أو الاستخدام التجاري.\n\nللنشر الآمن، يُرجى اختيار قارئ مذكور على أنه مسموح بالنشر أو استخدام صوتك الخاص.\n\nالمستخدم مسؤول بالكامل عن الالتزام بسياسات حقوق النشر الخاصة بكل منصة.");
            } else {
                textCustomFontBold.setText("⚠️ Copyright Notice");
                textCustomFont.setText("Some reciters’ audio recordings are protected by copyright and are intended for personal use only.\n\nCertain platforms may allow these sounds without issues, but this does not constitute permission to publish or use them commercially.\n\nFor safe publishing, please select a reciter marked as allowed for publishing or use your own audio.\n\nThe user is solely responsible for complying with the copyright policies of each platform.");
            }
            this.dialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startBillingConnection() {
        BillingClient build = BillingClient.newBuilder(this).setListener(this).enablePendingPurchases().build();
        this.billingClient = build;
        build.startConnection(new BillingClientStateListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.17
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(BillingResult billingResult) {
                if (billingResult.getResponseCode() == 0) {
                    SettingsActivity.this.checkUserSubscriptionStatus();
                }
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
                SettingsActivity.this.startBillingConnection();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreSubscribe() {
        startBillingConnection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUserSubscriptionStatus() {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), new PurchasesResponseListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.18
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
                if (billingResult.getResponseCode() == 0) {
                    if (!list.isEmpty()) {
                        SettingsActivity.this.handleSubscriptionPurchases(list);
                        return;
                    } else {
                        SettingsActivity.this.checkInAppPurchases();
                        return;
                    }
                }
                SettingsActivity.this.checkInAppPurchases();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSubscriptionPurchases(List<Purchase> list) {
        Iterator<Purchase> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getPurchaseState() == 1) {
                BillingPreferences.saveSubscriptionStatus(getApplicationContext(), true);
                dialogStateSubscribe(true);
                return;
            }
        }
        BillingPreferences.saveSubscriptionStatus(getApplicationContext(), false);
        checkInAppPurchases();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkInAppPurchases() {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity$$ExternalSyntheticLambda1
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                SettingsActivity.this.m872xa8c03944(billingResult, list);
            }
        });
    }

    /* renamed from: lambda$checkInAppPurchases$1$com-nurmontage-quranmaker-ui-activity-SettingsActivity, reason: not valid java name */
    /* synthetic */ void m872xa8c03944(BillingResult billingResult, List list) {
        if (billingResult.getResponseCode() == 0) {
            this.hasPurchasedForever = false;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Purchase purchase = (Purchase) it.next();
                if (purchase.getProducts().contains(PRODUCT_ID_FOREIVER) && purchase.getPurchaseState() == 1) {
                    this.hasPurchasedForever = true;
                    break;
                }
            }
        }
        if (!this.hasPurchasedForever) {
            dialogStateSubscribe(false);
        } else {
            BillingPreferences.saveSubscriptionStatus(getApplicationContext(), true);
            dialogStateSubscribe(true);
        }
    }

    private void dialogStateSubscribe(final boolean z) {
        runOnUiThread(new Runnable() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.19
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SettingsActivity.this.dialog = new Dialog(SettingsActivity.this);
                    SettingsActivity.this.dialog.setCancelable(false);
                    SettingsActivity.this.dialog.requestWindowFeature(1);
                    SettingsActivity.this.dialog.getWindow().setLayout(-1, -2);
                    SettingsActivity.this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    if (z) {
                        View inflate = LayoutInflater.from(SettingsActivity.this).inflate(R.layout.layout_pro_done, (ViewGroup) null);
                        SettingsActivity.this.dialog.setContentView(inflate);
                        ((TextCustomFontBold) inflate.findViewById(R.id.dialog_title)).setText(SettingsActivity.this.mResources.getString(R.string.premium_activated));
                        ((TextCustomFont) inflate.findViewById(R.id.tv_msj)).setText(SettingsActivity.this.mResources.getString(R.string.subscription_restored));
                        inflate.findViewById(R.id.dialog_no).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.19.1
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                SettingsActivity.this.setPro();
                                SettingsActivity.this.cancelDialog();
                            }
                        });
                    } else {
                        View inflate2 = LayoutInflater.from(SettingsActivity.this).inflate(R.layout.layout_pro_not_found, (ViewGroup) null);
                        SettingsActivity.this.dialog.setContentView(inflate2);
                        ((TextCustomFontBold) inflate2.findViewById(R.id.dialog_title)).setText(SettingsActivity.this.mResources.getString(R.string.nothing_to_restore));
                        ((TextCustomFont) inflate2.findViewById(R.id.tv_msj)).setText(SettingsActivity.this.mResources.getString(R.string.msj_no_found_subscribe));
                        Typeface createFromAsset = Typeface.createFromAsset(SettingsActivity.this.getResources().getAssets(), "fonts/ReadexPro_Medium.ttf");
                        Button button = (Button) inflate2.findViewById(R.id.contact_us);
                        button.setTypeface(createFromAsset);
                        button.setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.19.2
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                SettingsActivity.this.contact();
                                SettingsActivity.this.cancelDialog();
                            }
                        });
                        inflate2.findViewById(R.id.dialog_no).setOnClickListener(new View.OnClickListener() { // from class: com.nurmontage.quranmaker.ui.activity.SettingsActivity.19.3
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                SettingsActivity.this.cancelDialog();
                            }
                        });
                    }
                    SettingsActivity.this.dialog.show();
                    SettingsActivity.this.findViewById(R.id.progress).setVisibility(8);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void contact() {
        String string = this.mResources.getString(R.string.support_team);
        if (BillingPreferences.isSubscribed(this)) {
            string = string + " : ";
        }
        String[] strArr = {"nurmontage.contact@gmail.com"};
        if (isGmailAvailable(this)) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.EMAIL", strArr);
            intent.putExtra("android.intent.extra.BCC", strArr);
            intent.putExtra("android.intent.extra.SUBJECT", string);
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
            intent2.setType("message/rfc822");
            startActivity(Intent.createChooser(intent2, "Send email using"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private boolean isGmailAvailable(Context context) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.setPackage("com.google.android.gm");
        return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
