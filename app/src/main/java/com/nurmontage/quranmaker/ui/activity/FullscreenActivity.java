package com.nurmontage.quranmaker.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.nurmontage.quranmaker.util.file.LocalPersistence;
import com.nurmontage.quranmaker.util.LocaleHelper;
import com.nurmontage.quranmaker.common.Common;
import com.nurmontage.quranmaker.databinding.ActivityFullscreenBinding;
import java.util.Map;

/* loaded from: classes2.dex */
public class FullscreenActivity extends Base {
    private ActivityFullscreenBinding binding;

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(LocaleHelper.onAttach(context));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        SplashScreen.installSplashScreen(this);
        super.onCreate(bundle);
        ActivityFullscreenBinding inflate = ActivityFullscreenBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        setStatusBarColor(-1);
        setNavigationBarColor(-1);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(true);
        insetsController.setAppearanceLightNavigationBars(true);
        final Map<String, ?> all = getSharedPreferences("MTemplate", 0).getAll();
        new Handler().postDelayed(new Runnable() { // from class: com.nurmontage.quranmaker.ui.activity.FullscreenActivity.1
            @Override // java.lang.Runnable
            public void run() {
                Intent intent;
                Map map;
                if (FullscreenActivity.this.getIntent() != null && FullscreenActivity.this.getIntent().getBooleanExtra("from_setting", false)) {
                    FullscreenActivity.this.startActivity(new Intent(FullscreenActivity.this, (Class<?>) SettingsActivity.class));
                    FullscreenActivity.this.finish();
                    return;
                }
                if (LocalPersistence.readObjectFromFile(FullscreenActivity.this, Common.TEMPLATE_TMP) == null && (map = all) != null && !map.isEmpty()) {
                    intent = new Intent(FullscreenActivity.this, (Class<?>) WorkUserActivity.class);
                } else {
                    intent = new Intent(FullscreenActivity.this, (Class<?>) EngineActivity.class);
                }
                FullscreenActivity.this.startActivity(intent);
                FullscreenActivity.this.finish();
            }
        }, 1200L);
    }
}
