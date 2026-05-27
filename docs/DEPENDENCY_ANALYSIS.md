# 📊 تحليل التبعيات | Dependency Analysis

> تحليل شامل لجميع التبعيات الخارجية والداخلية للمشروع

---

## 1. مكتبات الطرف الثالث | Third-Party Libraries

### FFmpegKit — معالجة الفيديو والصوت

| التفصيل | القيمة |
|---------|--------|
| **Package** | `com.arthenica.ffmpegkit` |
| **الاستخدام** | تصيير الفيديو، تحويل الصوت، تطبيق الفلاتر، دمج الوسائط |
| **Classes مستخدمة** | `FFmpegKit`, `FFmpegSession`, `FFmpegSessionCompleteCallback`, `ReturnCode`, `StreamInformation` |
| **Native Libraries** | `libavcodec.so`, `libavformat.so`, `libavfilter.so`, `libavdevice.so`, `libavutil.so`, `libswresample.so`, `libswscale.so`, `libffmpegkit.so`, `libffmpegkit_abidetect.so` |
| **ABI** | arm64-v8a فقط |
| **الإصدار التقديري** | 6.0+ |

**أوامر FFmpeg المستخدمة في الكود:**
- `equalizer`, `compand` — تحسين الصوت (ENHANCE_CMD)
- دمج الصوت مع الفيديو
- استخراج الصوت من الفيديو
- تطبيق تأثيرات: echo, reverb, speed, pitch, noise reduction

---

### Glide — تحميل وعرض الصور

| التفصيل | القيمة |
|---------|--------|
| **Package** | `com.bumptech.glide` |
| **الاستخدام** | تحميل الصور، التخزين المؤقت، تحويلات الصور |
| **Classes مستخدمة** | `Glide`, `DiskCacheStrategy`, `FutureTarget`, `ObjectKey` |
| **الملفات المستخدمة فيه** | `EngineActivity`, `CropViewHint`, `EyeView`, `BeforeAfterView`, `ImageLoader`, `StoryCropTransformation` |

---

### Gson — تسلسل JSON

| التفصيل | القيمة |
|---------|--------|
| **Package** | `com.google.gson` |
| **الاستخدام** | تسلسل/إلغاء تسلسل كائنات Template إلى/من JSON |
| **Classes مستخدمة** | `Gson`, `GsonBuilder` |
| **الملف المستخدم فيه** | `LocalPersistence.java` (حفظ/تحميل القوالب) |

---

### Google Play Billing Library — نظام المدفوعات

| التفصيل | القيمة |
|---------|--------|
| **Package** | `com.android.billingclient.api` |
| **الإصدار** | 7.1.1 (من AndroidManifest meta-data) |
| **الاستخدام** | اشتراكات Pro، عمليات الشراء داخل التطبيق |
| **Components من Manifest** | `ProxyBillingActivity`, `ProxyBillingActivityV2` |
| **الملفات المرتبطة** | `BillingPreferences.java`, `SupportBillingActivity.java`, `ProVersionActivity*.java` |

---

## 2. مكتبات AndroidX | AndroidX Dependencies

### Core & AppCompat

| المكتبة | Classes مستخدمة |
|---------|----------------|
| `androidx.appcompat:appcompat` | `AppCompatDelegate`, `AppCompatSeekBar`, `SwitchCompat` |
| `androidx.core:core` | `ContextCompat`, `ActivityCompat`, `FileProvider`, `ViewCompat`, `WindowCompat`, `WindowInsetsCompat`, `WindowInsetsControllerCompat`, `ColorUtils`, `Insets` |
| `androidx.activity:activity` | `EdgeToEdge`, `OnBackPressedCallback`, `ActivityResultLauncher`, `ActivityResultContracts` |
| `androidx.fragment:fragment` | `Fragment`, `FragmentManager`, `FragmentTransaction` |
| `androidx.core.splashscreen:splashscreen` | `SplashScreen` (FullscreenActivity) |

### UI Components

| المكتبة | Classes مستخدمة |
|---------|----------------|
| `androidx.recyclerview:recyclerview` | `RecyclerView`, `LinearLayoutManager`, `GridLayoutManager` |
| `androidx.viewbinding:viewbinding` | `ViewBinding`, `ViewBindings` |
| `androidx.constraintlayout:constraintlayout` | `ConstraintLayout` |
| `androidx.cardview:cardview` | `CardView` |
| `com.google.android.material:material` | `TabLayout`, `MaterialCardView` |

### Media3 (ExoPlayer)

| المكتبة | Classes مستخدمة |
|---------|----------------|
| `androidx.media3:media3-exoplayer` | `ExoPlayer`, `DefaultRenderersFactory`, `CmcdData` |
| `androidx.media3:media3-common` | `MediaItem`, `PlaybackException`, `Player`, `MimeTypes`, `C` |
| `androidx.media3:media3-ui` | `PlayerView`, `DefaultTimeBar` |
| `androidx.media3:media3-extractor` | `Renderer`, `IcyHeaders` |

### Lifecycle & Startup

| المكتبة | الوصف |
|---------|-------|
| `androidx.lifecycle:lifecycle` | `ProcessLifecycleInitializer` |
| `androidx.startup:startup` | `InitializationProvider` |
| `androidx.emoji2:emoji2` | `EmojiCompatInitializer` |
| `androidx.profileinstaller:profileinstaller` | `ProfileInstallerInitializer`, `ProfileInstallReceiver` |
| `androidx.window:window` | `extensions`, `sidecar` libraries |

### Data Transport (Firebase-related)

| المكتبة | الوصف |
|---------|-------|
| `com.google.android.datatransport:transport` | `TransportBackendDiscovery`, `JobInfoSchedulerService`, `AlarmManagerSchedulerBroadcastReceiver` |

---

## 3. مكتبات النظام | System Dependencies

| المكتبة | الوصف |
|---------|-------|
| `com.google.android.gms:play-services-base` | `GoogleApiActivity` |
| `com.google.android.gms:play-services-billing` | Billing integration |
| `com.pairip:licensecheck` | حماية الترخيص (PairIP) — `LicenseActivity`, `LicenseContentProvider` |
| `com.google.android.play:core` | `PlayCoreDialogWrapperActivity` |

---

## 4. Native Libraries | المكتبات الأصلية

### FFmpeg Libraries (arm64-v8a)

```
libavcodec.so      — ترميز/فك ترميز الفيديو والصوت
libavformat.so     — قراءة/كتابة تنسيقات الحاوية
libavfilter.so     — فلاتر الفيديو والصوت
libavdevice.so     — أجهزة الإدخال/الإخراج
libavutil.so       — أدوات مساعدة عامة
libswresample.so   — إعادة عينات الصوت
libswscale.so      — تحجيم وتحويل ألوان الصور
libffmpegkit.so    — واجهة FFmpegKit الأصلية
libffmpegkit_abidetect.so — كشف ABI
libc++_shared.so   — C++ Standard Library
```

**ملاحظة:** فقط ABI `arm64-v8a` متوفر حاليًا. يجب إضافة `armeabi-v7a` و `x86_64` لدعم أجهزة أكثر.

---

## 5. تبعيات الموارد | Asset Dependencies

### خطوط التطبيق (9 خطوط أساسية + 40+ عربي)

```
assets/fonts/
├── ReadexPro_Bold.ttf          # خط التطبيق العريض
├── ReadexPro_Medium.ttf        # خط التطبيق المتوسط
├── ReadexPro-Regular.ttf       # خط التطبيق العادي
├── Poppins-Regular.ttf         # خط إنجليزي
├── Poppins-SemiBold.ttf        # خط إنجليزي شبه عريض
├── Rubik-SemiBold.ttf          # خط شبه عريض
├── Alegreya-Regular.ttf        # خط Alegreya
├── NotoSans.ttf                # خط Noto Sans
├── خط البسملة.ttf              # خط البسملة
├── خط الاستعاذه.ttf            # خط الاستعاذة
├── surah_name.otf              # خط اسم السورة
└── arabic/                     # 40+ خط عربي
    ├── عثماني.otf               # الخط الرئيسي للقرآن
    ├── خط الإبل.otf             # خط اسم السورة
    ├── المصحف.ttf
    ├── كوفي.ttf
    ├── نسخ.ttf
    ├── نستعليق.otf
    ├── قالون.ttf
    ├── خط ورش.ttf
    ├── الثلث.ttf
    ├── NotoNaskhArabic.ttf
    └── ... (30+ خط آخر)
```

### نصوص القرآن والترجمات (10 ملفات)

```
assets/quran/
├── quran-simple.txt            # النص القرآني البسيط
├── ar.muyassar.txt             # التفسير الميسر (عربي)
├── en.hilali.txt               # ترجمة هلالي (إنجليزي)
├── fr.hamidullah.txt           # ترجمة حميد الله (فرنسي)
├── de.bubenheim.txt            # ترجمة بوبنهايم (ألماني)
├── id.indonesian.txt           # ترجمة إندونيسية
├── ur.maududi.txt              # ترجمة مودودي (أردو)
├── tr.ozturk.txt               # ترجمة أوزترك (تركي)
├── fa.fooladvand.txt           # ترجمة فولادفند (فارسي)
└── bn.bengali.txt              # ترجمة بنغالية
```

### Baseline Profiles

```
assets/dexopt/
├── baseline.prof               # ملف Profile لتحسين الأداء
└── baseline.profm              # ملف Metadata للـ Profile
```

---

## 6. الرسم البياني للتبعيات الداخلية | Internal Dependency Graph

```
┌─────────────────────────────────────────────────────────────┐
│                        UI Layer                              │
│                                                              │
│  Activity ──────► Fragment ──────► Adapter                   │
│     │                │                  │                     │
│     │                │                  ▼                     │
│     │                │             Model (entity/template)    │
│     │                │                  │                     │
│     ▼                ▼                  ▼                     │
│  ┌──────────────────────────────────────────┐               │
│  │              View Layer                   │               │
│  │  BlurredImageView, TrackEntityView,      │               │
│  │  CropView, WaveformView, ...             │               │
│  └──────────────────────────────────────────┘               │
│     │                │                                        │
│     ▼                ▼                                        │
│  ┌──────────────────────────────────────────┐               │
│  │           Utility Layer                   │               │
│  │  audio/ bitmap/ file/ waveform/ render/   │               │
│  └──────────────────────────────────────────┘               │
│     │                │                                        │
│     ▼                ▼                                        │
│  ┌──────────────────────────────────────────┐               │
│  │        Common & Constants                 │               │
│  │  Common.java, Enums, DataDimension        │               │
│  └──────────────────────────────────────────┘               │
└─────────────────────────────────────────────────────────────┘
```

### تبعيات الحزم المفصلة:

```
ui.activity ──► ui.fragment, ui.adapter, ui.view, model.*, util.*, common.*, constant.*
ui.fragment ──► ui.adapter, model.*, util.*, common.*, constant.*
ui.adapter ──► model.*, common.*
ui.view ──► model.entity, util.*, common.*
ui.gesture ──► (مستقل — لا تبعيات داخلية)

model.entity ──► constant.*, common.Common
model.template ──► model.entity, common.Common
model.timeline ──► model.entity, constant.*

util.audio ──► common.Common
util.bitmap ──► common.Common, util.file.*
util.file ──► model.template, common.Common (Gson)
util.waveform ──► common.Common
util.render ──► model.*, common.Common, constant.*

common ──► model.Gradient, model.GallerySelected
constant ──► (مستقل — لا تبعيات داخلية)
databinding ──► R, ui.view.* (custom views)
```

---

## 7. عناوين API | API URLs Found in Code

### APIs لتلاوات القرآن

| URL | الوصف | الملف |
|-----|-------|-------|
| `https://audio-cdn.tarteel.ai/quran/{identifier}/{surah}{aya}.mp3` | Tarteel AI CDN لتلاوات القرآن | `EngineActivity.java` |
| `https://everyayah.com/data/{identifier}/{surah}{aya}.mp3` | EveryAyah CDN لتلاوات القرآن | `EngineActivity.java` |

**منطق الاختيار:**
```java
if (recitersModel.isTarteel()) {
    url = "https://audio-cdn.tarteel.ai/quran/...";
} else {
    url = "https://everyayah.com/data/...";
}
```

### روابط التواصل الاجتماعي والدعم

| URL | الوصف | الملف |
|-----|-------|-------|
| `https://chat.whatsapp.com/F0kqOjZS1VuBAvoiOG4XEZ` | مجموعة WhatsApp للدعم | SettingsActivity, VideoViewActivity, ProVersionActivity, ProVersionActivityDone |
| `https://chat.whatsapp.com/DDdUegENpg83easzYDba2K?mode=wwt` | مجموعة WhatsApp أخرى | AboutActivity |
| `https://www.instagram.com/nurmontage.app/` | حساب Instagram | SettingsActivity |
| `https://www.youtube.com/@NurMontageApp/` | قناة YouTube | SettingsActivity |
| `https://www.tiktok.com/@nurmontagesupport` | حساب TikTok | SettingsActivity |
| `https://youtu.be/{videoId}` | فيديو YouTube | YoutuberActivity |
| `https://youtu.be/3xtsWfMQ5KM` | فيديو تعليمي | ProVersionActivityLast |

### روابط Google Play

| URL | الوصف | الملف |
|-----|-------|-------|
| `https://play.google.com/store/apps/details?id=hazem.nurmontage.videoquran` | صفحة التطبيق | SettingsActivity |
| `https://play.google.com/store/apps/dev?id=8943620497392395895` | صفحة المطور | SettingsActivity |
| `http://play.google.com/store/apps/details?id={packageName}` | تقييم التطبيق | SettingsActivity, VideoViewActivity, WorkUserActivity |
| `http://play.google.com/store/apps/details?id=hazem.tuffah.quranaudio` | تطبيق تُفّاح القرآن | AdsTuffahActivity, VideoViewActivity |

---

## 8. الأذونات المطلوبة | Required Permissions

| الإذن | المستوى | الوصف |
|-------|---------|-------|
| `READ_EXTERNAL_STORAGE` | maxSdkVersion=32 | قراءة التخزين الخارجي |
| `WRITE_EXTERNAL_STORAGE` | maxSdkVersion=32 | كتابة التخزين الخارجي |
| `READ_MEDIA_VIDEO` | Android 13+ | قراءة ملفات الفيديو |
| `READ_MEDIA_IMAGES` | Android 13+ | قراءة ملفات الصور |
| `READ_MEDIA_AUDIO` | Android 13+ | قراءة ملفات الصوت |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | اختيار الصور/الفيديو |
| `INTERNET` | عادي | الوصول للإنترنت |
| `ACCESS_NETWORK_STATE` | عادي | فحص حالة الشبكة |
| `VIBRATE` | عادي | الاهتزاز |
| `POST_NOTIFICATIONS` | Android 13+ | إشعارات |
| `com.android.vending.BILLING` | عادي | عمليات الشراء |
| `com.android.vending.CHECK_LICENSE` | عادي | فحص الترخيص |
| `com.google.android.gms.permission.AD_ID` | عادي | معرف الإعلانات |

---

## 9. اقتراحات لتبعيات مفقودة | Missing Dependency Suggestions

| التبعية | السبب |
|---------|-------|
| `androidx.media3:media3-effect` | للتأثيرات السينمائية المذكورة في `CinematicProcessor` |
| `org.jetbrains.kotlin:kotlin-stdlib` | بعض الملفات تستخدم `kotlin.Pair` |
| AARs لـ `pairip.licensecheck` | مفقود من المشروع — يحتاج إضافة يدوية |
