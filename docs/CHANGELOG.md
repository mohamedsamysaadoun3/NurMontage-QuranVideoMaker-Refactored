# 📋 سجل التغييرات | Change Log

> توثيق كامل لجميع التغييرات التي تمت أثناء عملية إعادة الهيكلة

---

## [6.7.1-refactored] — إعادة الهيكلة الشاملة

---

### 1. إعادة هيكلة الحزم | Package Restructuring

تم نقل جميع الملفات من package مسطح إلى بنية هرمية منظمة:

| الحزمة القديمة | الحزمة الجديدة | الوصف |
|---------------|---------------|-------|
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.ui.activity` | جميع Activities |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.ui.fragment` | جميع Fragments |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.ui.fragment.audio_effect` | تأثيرات الصوت |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.ui.adapter` | محولات RecyclerView |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.ui.view` | عروض مخصصة |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.ui.gesture` | كاشفات الإيماءات |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.model.entity` | نماذج الكيانات |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.model.template` | نماذج القوالب |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.model.timeline` | نماذج الجدول الزمني |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.util.audio` | أدوات الصوت |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.util.bitmap` | أدوات الصور |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.util.file` | أدوات الملفات |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.util.waveform` | أدوات شكل الموجة |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.util.render` | أدوات التصيير |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.common` | بيانات مشتركة |
| `com.nurmontage.quranmaker` (مسطح) | `com.nurmontage.quranmaker.constant` | ثوابت و Enums |

---

### 2. تغيير أسماء الملفات | File Renames

لم يتم تغيير أسماء الملفات نفسها (الأنواع) — تم فقط نقلها إلى حزم جديدة. جميع أسماء الملفات حُفظت كما هي من الكود الأصلي المفكوك.

| الملف | الموقع القديم | الموقع الجديد |
|-------|-------------|-------------|
| جميع Activity (28 ملف) | `quranmaker/` | `quranmaker/ui/activity/` |
| جميع Fragment (26 ملف) | `quranmaker/` | `quranmaker/ui/fragment/` |
| 9 ملفات تأثير صوتي | `quranmaker/` | `quranmaker/ui/fragment/audio_effect/` |
| جميع Adapter (24 ملف) | `quranmaker/` | `quranmaker/ui/adapter/` |
| جميع View مخصص (30 ملف) | `quranmaker/` | `quranmaker/ui/view/` |
| 5 ملفات إيماءات | `quranmaker/` | `quranmaker/ui/gesture/` |
| 10 نماذج كيان | `quranmaker/` | `quranmaker/model/entity/` |
| 6 نماذج قالب | `quranmaker/` | `quranmaker/model/template/` |
| 5 نماذج جدول زمني | `quranmaker/` | `quranmaker/model/timeline/` |
| 3 أدوات صوت | `quranmaker/` | `quranmaker/util/audio/` |
| 9 أدوات صور | `quranmaker/` | `quranmaker/util/bitmap/` |
| 9 أدوات ملفات | `quranmaker/` | `quranmaker/util/file/` |
| 10 أدوات موجة | `quranmaker/` | `quranmaker/util/waveform/` |
| 5 أدوات تصيير | `quranmaker/` | `quranmaker/util/render/` |
| 4 ملفات مشتركة | `quranmaker/` | `quranmaker/common/` |
| 7 ثوابت/Enums | `quranmaker/` | `quranmaker/constant/` |
| 83 ملف DataBinding | `quranmaker/databinding/` | `quranmaker/databinding/` (بدون تغيير) |
| 1 ملف R.java | `quranmaker/` | `quranmaker/` (بدون تغيير) |

---

### 3. تصحيح أسماء الفئات | Class Name Fixes (Typos)

> ⚠️ **ملاحظة مهمة**: هذه الأخطاء الإملائية تم توثيقها فقط ولم يتم تعديلها في الكود فعليًا.
> يجب تعديلها يدويًا في مرحلة لاحقة لأن التغيير يتطلب تحديث جميع المراجع.

| الاسم الحالي (خاطئ) | الاسم الصحيح المقترح | الملف | نوع الخطأ |
|---------------------|---------------------|-------|-----------|
| `wakeLockAquire()` | `wakeLockAcquire()` | `Base.java` | خطأ إملائي: Aquire → Acquire |
| `isProbablyLArabic()` | `isProbablyArabic()` | `Utils.java` | حرف L زائد في الاسم |

**الملفات المتأثرة بخطأ `wakeLockAquire`:**
- `Base.java` (التعريف)
- `EngineActivity.java` (الاستدعاء)
- `ProVersionActivity.java` (الاستدعاء)
- `ProVersionActivityDone.java` (الاستدعاء)
- `ProVersionActivityLast.java` (الاستدعاء)
- `ProgressViewActivity.java` (الاستدعاء)
- `SupportBillingActivity.java` (الاستدعاء)

**الملفات المتأثرة بخطأ `isProbablyLArabic`:**
- `Utils.java` (التعريف)
- `BlurredImageView.java` (3 استدعاءات)
- `QuranSearchActivity.java` (1 استدعاء)
- `VideoViewActivity.java` (1 استدعاء)

---

### 4. تصحيح أسماء الطرق | Method Name Corrections

| الطريقة الحالية | التصحيح المقترح | الملاحظة |
|----------------|----------------|----------|
| `wakeLockAquire()` | `wakeLockAcquire()` | تستخدم في 7 Activity |
| `isProbablyLArabic(String)` | `isProbablyArabic(String)` | تستخدم في 4 ملفات |

---

### 5. ملفات مولّدة من R8/D8 | R8/D8 Generated Files (Dead Code)

هذه الملفات مولّدة من عملية desugaring وتعتبر كود ميت:

| الملف | الوصف | الإجراء |
|-------|-------|---------|
| `ProVersionActivity$$ExternalSyntheticBackport0.java` | ملف مولّد من R8 backport | محفوظ حسب القواعد |
| `ProgressViewActivity$$ExternalSyntheticLambda6.java` | ملف مولّد من R8 lambda | محفوظ حسب القواعد |

---

### 6. إضافات خارجية | External Additions

| الإضافة | الملف | المبرر |
|---------|-------|--------|
| `app/build.gradle` | `app/build.gradle` | ملف بناء مطلوب لتجميع المشروع |
| `build.gradle` (project) | `build.gradle` | ملف بناء المشروع الرئيسي |
| `settings.gradle` | `settings.gradle` | إعدادات Gradle |
| `.gitignore` | `.gitignore` | استبعاد ملفات Git غير المرغوبة |
| `README.md` | `README.md` | توثيق المشروع |
| `docs/FILE_MAP.md` | `docs/FILE_MAP.md` | خريطة الملفات |
| `docs/DEPENDENCY_ANALYSIS.md` | `docs/DEPENDENCY_ANALYSIS.md` | تحليل التبعيات |
| `docs/CHANGELOG.md` | `docs/CHANGELOG.md` | سجل التغييرات (هذا الملف) |

---

### 7. كود ميت محفوظ | Dead Code Identified & Preserved

حسب قواعد إعادة الهيكلة، لم يتم حذف أي كود ميت بل تم توثيقه فقط:

| النوع | الملف/المكان | الوصف |
|-------|-------------|-------|
| ملفات R8 مولّدة | `$$ExternalSyntheticBackport0`, `$$ExternalSyntheticLambda6` | ملفات مولّدة من desugaring |
| تعليقات JADX | `/* loaded from: classes2.dex */` | تعليقات أداة فك التحويل |
| تعليقات JADX | `/* JADX INFO: Added by JADX */` | تعليقات إضافية من أداة فك التحويل |
| ثوابت غير مستخدمة محتملة | `Common.java` | ثوابت لونية وأبعاد قد لا تكون مستخدمة كلها |
| فئات DataBinding مولّدة | `databinding/` (83 ملف) | مولّدة من XML layouts — تحتاج مراجعة |

---

### 8. مشاكل معروفة | Known Issues

| المشكلة | الوصف | الأولوية |
|---------|-------|---------|
| **أخطاء إملائية** | `wakeLockAquire` و `isProbablyLArabic` | عالية |
| **Package declarations** | جميع الملفات تحتاج تحديث `package` statement بعد النقل | عالية |
| **Import statements** | جميع الملفات تحتاج تحديث imports بعد النقل | عالية |
| **AndroidManifest** | أسماء Activity في Manifest تستخدم package قديم | عالية |
| **res/ مفقود** | مجلد `res/` (layouts, drawables, values) غير متوفر | حرجة |
| **ABI وحيد** | فقط `arm64-v8a` متوفر — يحتاج `armeabi-v7a`, `x86_64` | متوسطة |
| **PairIP License** | مكتبة حماية الترخيص مفقودة كتبعية | متوسطة |
| **Kotlin stdlib** | الكود يستخدم `kotlin.Pair` لكن لا تبعية Kotlin واضحة | منخفضة |
| **LayoutPremuim** | خطأ إملائي في اسم Layout: `Premuim` بدلاً من `Premium` | منخفضة |
| **SeettingActivity** | خطأ إملائي في AndroidManifest: `SeettingActivity` بدلاً من `SettingsActivity` | منخفضة |

---

### 9. إحصائيات | Statistics

| المقياس | القيمة |
|---------|--------|
| **إجمالي ملفات Java** | 161 |
| **ملفات Activity** | 28 (+ 2 ملفات R8 مولّدة) |
| **ملفات Fragment** | 26 (+ 9 audio_effect) |
| **ملفات Adapter** | 24 |
| **ملفات View مخصص** | 30 |
| **ملفات Gesture** | 5 |
| **ملفات Model** | 34 |
| **ملفات Utility** | 42 |
| **ملفات Common/Constant** | 11 |
| **ملفات DataBinding** | 83 |
| **خطوط عربية** | 40+ |
| **خطوط أساسية** | 11 |
| **ملفات ترجمة قرآن** | 10 |
| **Native Libraries** | 10 |
| **أخطاء إملائية موثقة** | 2 |
| **API URLs** | 10+ |
