# 🕌 QuranMaker-Refactored

> تطبيق صانع فيديوهات القرآن الكريم — إعادة هيكلة شاملة

---

## 📋 نبذة عن المشروع | Project Overview

**QuranMaker** (يُعرف أيضًا باسم **NurMontage**) هو تطبيق Android متقدم لإنشاء فيديوهات قرآنية احترافية. يتيح التطبيق للمستخدمين:

- 📖 إضافة آيات قرآنية مع تلاوات صوتية متعددة
- 🎨 تخصيص التصميم: الخطوط، الألوان، الخلفيات، التدرجات اللونية
- 🎬 تحرير الفيديو: القص، الدمج، تأثيرات الانتقال
- 🔊 معالجة الصوت: صدى، ريفيرب، سرعة، حدة الصوت، إزالة الضوضاء
- 📱 تصدير بأبعاد متعددة: عمودي، أفقي، مربع
- 💳 نظام اشتراك Pro عبر Google Play Billing

---

## 🏗️ هيكل المشروع | Architecture

```
┌─────────────────────────────────────────────────┐
│                   Android App                    │
├─────────────────────────────────────────────────┤
│  UI Layer                                        │
│  ┌──────────┬──────────┬──────────┬───────────┐ │
│  │ Activity │ Fragment │ Adapter  │   View    │ │
│  │          │          │          │           │ │
│  │ Engine ◄─┤ AddQuran │ Recycler │ Blurred   │ │
│  │ Timeline │ AudioFX  │ Gallery  │ Track     │ │
│  │ Settings │ Edit     │ Color    │ Crop      │ │
│  │ Billing  │ Bg       │ Font     │ Gesture   │ │
│  └──────────┴──────────┴──────────┴───────────┘ │
├─────────────────────────────────────────────────┤
│  Model Layer                                     │
│  ┌──────────┬──────────┬──────────┐             │
│  │ Entity   │ Template │ Timeline │             │
│  │ Quran    │ Quran    │ Quran    │             │
│  │ Media    │ Bismilah │ Audio    │             │
│  │ Bismilah │ Surah    │ Trsl     │             │
│  └──────────┴──────────┴──────────┘             │
├─────────────────────────────────────────────────┤
│  Utility Layer                                   │
│  ┌──────┬───────┬──────┬──────┬──────┐         │
│  │Audio │Bitmap │ File │Wave  │Render│         │
│  │Utils │Utils  │Utils │Form  │Utils │         │
│  └──────┴───────┴──────┴──────┴──────┘         │
├─────────────────────────────────────────────────┤
│  Common & Constants                              │
│  ┌──────────┬──────────┐                        │
│  │ Common   │ Constant │                        │
│  │ Provider │ Enums    │                        │
│  └──────────┴──────────┘                        │
├─────────────────────────────────────────────────┤
│  Native Libraries (FFmpeg)                       │
│  ┌──────────────────────────────────┐           │
│  │ libavcodec, libavformat, ...    │           │
│  │ libffmpegkit.so                 │           │
│  └──────────────────────────────────┘           │
└─────────────────────────────────────────────────┘
```

---

## 📁 هيكل الملفات الجديد | New Project Structure

```
QuranMaker-Refactored/
├── app/
│   ├── build.gradle
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── assets/
│       │   └── assets/
│       │       ├── dexopt/           # Baseline profiles
│       │       ├── fonts/            # خطوط التطبيق (9 خطوط أساسية)
│       │       │   └── arabic/       # خطوط عربية (40+ خط)
│       │       └── quran/            # نصوص القرآن والترجمات (10 ملفات)
│       ├── jniLibs/
│       │   └── arm64-v8a/           # Native libraries (FFmpeg)
│       └── java/com/nurmontage/quranmaker/
│           ├── R.java               # Resource IDs
│           ├── common/              # Shared constants & data
│           ├── constant/            # Enums & constants
│           ├── databinding/         # Generated databinding classes
│           ├── model/
│           │   ├── entity/          # Data entity models
│           │   ├── template/        # Template models
│           │   └── timeline/        # Timeline entity models
│           ├── ui/
│           │   ├── activity/        # All Activity classes
│           │   ├── adapter/         # RecyclerView adapters
│           │   ├── fragment/        # Fragment classes
│           │   │   └── audio_effect/# Audio effect fragments
│           │   ├── gesture/         # Multi-touch gesture detectors
│           │   └── view/            # Custom views
│           └── util/
│               ├── audio/           # Audio processing utilities
│               ├── bitmap/          # Bitmap/image utilities
│               ├── file/            # File management utilities
│               ├── waveform/        # Waveform extraction/rendering
│               └── render/          # Video rendering utilities
├── build.gradle                     # Project-level
├── settings.gradle
├── .gitignore
├── README.md
└── docs/
    ├── FILE_MAP.md
    ├── DEPENDENCY_ANALYSIS.md
    └── CHANGELOG.md
```

---

## 🔄 ملخص إعادة الهيكلة | Refactoring Summary

تمت إعادة هيكلة المشروع بالكامل من كود مفكك إلى بنية منظمة قابلة للصيانة:

### التغييرات الرئيسية:

| الجانب | قبل | بعد |
|--------|------|------|
| **Package Structure** | ملفات مسطحة في package واحد | تنظيم هرمي: `ui/`, `model/`, `util/`, `common/`, `constant/` |
| **File Organization** | عدم فصل حسب المسؤولية | فصل واضح: Activity, Fragment, Adapter, View, Model, Utility |
| **Naming** | أخطاء إملائية في الأسماء | تصحيح: `wakeLockAquire` → `wakeLockAcquire`, `isProbablyLArabic` → `isProbablyArabic` |
| **Audio Effects** | Fragments مختلطة | مجموعة مستقلة: `audio_effect/` sub-package |
| **Utilities** | أدوات مساعدة في ملف واحد | تقسيم: `audio/`, `bitmap/`, `file/`, `waveform/`, `render/` |
| **Models** | نماذج مختلطة | تقسيم: `entity/`, `template/`, `timeline/` |

---

## 📊 تحليل التبعيات | Dependencies Analysis

### مكتبات الطرف الثالث:

| المكتبة | الاستخدام |
|---------|-----------|
| **FFmpegKit** | معالجة الفيديو والصوت |
| **Glide** | تحميل وعرض الصور |
| **Gson** | تسلسل/إلغاء تسلسل JSON |
| **Google Play Billing** | نظام الاشتراكات والمدفوعات |
| **Media3 (ExoPlayer)** | تشغيل الفيديو والصوت |

### مكتبات AndroidX المستخدمة:
- `appcompat`, `core`, `activity`, `fragment`
- `recyclerview`, `viewbinding`, `constraintlayout`
- `splashscreen`, `emoji2`, `profileinstaller`
- `window` (extensions + sidecar)

---

## 📝 سجل التغييرات | Change Log

راجع [CHANGELOG.md](docs/CHANGELOG.md) للتفاصيل الكاملة.

---

## 🔗 روابط مهمة | Important Links

- **Google Play**: `hazem.nurmontage.videoquran`
- **QuranAudio App**: `hazem.tuffah.quranaudio`
- **API - Tarteel**: `https://audio-cdn.tarteel.ai/quran/`
- **API - EveryAyah**: `https://everyayah.com/data/`
- **Instagram**: `@nurmontage.app`
- **YouTube**: `@NurMontageApp`
- **TikTok**: `@nurmontagesupport`

---

## 📋 معلومات البناء | Build Information

| الخاصية | القيمة |
|---------|--------|
| **applicationId** | `com.nurmontage.quranmaker` |
| **minSdk** | 24 |
| **targetSdk** | 35 |
| **compileSdk** | 35 |
| **versionCode** | 21000106 |
| **versionName** | `6.7.1-refactored` |
| **Billing Library** | 7.1.1 |
| **Native Libs ABI** | arm64-v8a |

---

## ⚠️ ملاحظات مهمة | Important Notes

1. **هذا المشروع منسوخ من APK مفكوك (decompiled)** — يحتوي على `R.java` و `databinding/` مُولَّدَين يدويًا
2. **الخطوط العربية** مفقود بعض الأسماء أو المراجع — تحتاج مراجعة
3. **كود ميت محفوظ** — حسب القواعد، لم يتم حذف أي كود ميت بل تم توثيقه فقط
4. **الملفات `$$ExternalSynthetic*`** هي ملفات مُولَّدة من R8/D8 desugaring
5. **مطلوب استكمال** ملفات `res/` (layouts, drawables, values) لتتمكن من البناء

---

*تم إنشاء هذا التوثيق كجزء من عملية إعادة هيكلة المشروع.*
