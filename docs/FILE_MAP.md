# 📁 خريطة الملفات الكاملة | Complete File Map

> هذا المستند يوضح موقع كل ملف في المشروع الجديد مع التخطيط القديم → الجديد

---

## البنية الرئيسية

```
app/src/main/java/com/nurmontage/quranmaker/
├── R.java                          # Resource IDs (مولّد)
├── common/                         # بيانات وثوابت مشتركة
├── constant/                       # Enums وثوابت
├── databinding/                    # فئات DataBinding مولّدة
├── model/
│   ├── entity/                     # نماذج الكيانات
│   ├── template/                   # نماذج القوالب
│   └── timeline/                   # نماذج الجدول الزمني
├── ui/
│   ├── activity/                   # فئات Activity
│   ├── adapter/                    # محولات RecyclerView
│   ├── fragment/                   # فئات Fragment
│   │   └── audio_effect/           # فئات تأثيرات الصوت
│   ├── gesture/                    # كاشفات الإيماءات
│   └── view/                       # عروض مخصصة
└── util/
    ├── audio/                      # أدوات معالجة الصوت
    ├── bitmap/                     # أدوات الصور
    ├── file/                       # أدوات إدارة الملفات
    ├── waveform/                   # أدوات استخراج/رسم الموجة
    └── render/                     # أدوات تصيير الفيديو
```

---

## 🔵 `common/` — البيانات والثوابت المشتركة

| الملف الجديد | الوصف | الملاحظات |
|-------------|-------|----------|
| `Common.java` | ثوابت مشتركة (ألوان، أبعاد، أسماء خطوط) | يحتوي على بيانات ثابتة عالمية |
| `DataDimension.java` | بيانات الأبعاد والمقاسات | — |
| `MyProvider.java` | ContentProvider لمشاركة الملفات | extends FileProvider |
| `StackEntity.java` | كومة Undo/Redo للكيانات | — |

---

## 🟢 `constant/` — الـ Enums والثوابت

| الملف الجديد | الوصف |
|-------------|-------|
| `AyaTextPreset.java` | أنماط نص الآية المسبقة |
| `EffectAudioType.java` | أنواع تأثيرات الصوت |
| `EntityAction.java` | إجراءات الكيان (إضافة، حذف، تعديل) |
| `IpadType.java` | أنواع إطار iPad (لون، تدرج، كاسيت، إلخ) |
| `ResizeType.java` | أنواع تغيير الحجم |
| `SurahNameStyle.java` | أنماط اسم السورة |
| `TransitionType.java` | أنواع الانتقالات |

---

## 🟡 `databinding/` — فئات DataBinding المولّدة (83 ملف)

> هذه الملفات مولّدة تلقائيًا من layouts XML. لم يتم تعديل أسمائها.

| الملف | النوع |
|-------|-------|
| `ActivityAboutBinding.java` | Activity |
| `ActivityAddReaderNameBinding.java` | Activity |
| `ActivityAdsTuufahBinding.java` | Activity |
| `ActivityChoiceBgFromVideoBinding.java` | Activity |
| `ActivityChoiceLangBinding.java` | Activity |
| `ActivityCropBitmapBinding.java` | Activity |
| `ActivityEditSnameBinding.java` | Activity |
| `ActivityEditTrslBinding.java` | Activity |
| `ActivityFullscreenBinding.java` | Activity |
| `ActivityGalleryPickerVideoBinding.java` | Activity |
| `ActivityPlayVideoBinding.java` | Activity |
| `ActivityProgressViewBinding.java` | Activity |
| `ActivityProVersionBinding.java` | Activity |
| `ActivityProVersionDoneBinding.java` | Activity |
| `ActivityProVersionLastBinding.java` | Activity |
| `ActivityQuranSearchBinding.java` | Activity |
| `ActivitySettingsBinding.java` | Activity |
| `ActivityShareWithMeBinding.java` | Activity |
| `ActivitySupportBillingBinding.java` | Activity |
| `ActivityThanksYouBinding.java` | Activity |
| `ActivityTextEditBinding.java` | Activity |
| `ActivityTimeLineBinding.java` | Activity |
| `ActivityVideoPlayerBinding.java` | Activity |
| `ActivityVideoViewBinding.java` | Activity |
| `ActivityWorkUserBinding.java` | Activity |
| `ActivityYoutuberBinding.java` | Activity |
| `ControllerQuranMinimalBinding.java` | Controller |
| `FragmentAddAudioBinding.java` | Fragment |
| `FragmentAddQuranBinding.java` | Fragment |
| `FragmentChangeBgBinding.java` | Fragment |
| `FragmentColorAyaBinding.java` | Fragment |
| `FragmentColorsBinding.java` | Fragment |
| `FragmentEditEntityBinding.java` | Fragment |
| `FragmentEditIpadBinding.java` | Fragment |
| `FragmentEditMediaBinding.java` | Fragment |
| `FragmentEditMediaMultipleBinding.java` | Fragment |
| `FragmentEditSNameBinding.java` | Fragment |
| `FragmentEditTextBinding.java` | Fragment |
| `FragmentEffectAyaBinding.java` | Fragment |
| `FragmentEchoEffectBinding.java` | Fragment |
| `FragmentFadeInOutBinding.java` | Fragment |
| `FragmentFontBinding.java` | Fragment |
| `FragmentGalleryVideoBinding.java` | Fragment |
| `FragmentProgressViewBinding.java` | Fragment |
| `FragmentRemoveNoiseBinding.java` | Fragment |
| `FragmentReverbPresetBinding.java` | Fragment |
| `FragmentResizeBinding.java` | Fragment |
| `FragmentVolumeBinding.java` | Fragment |
| `LayoutAddImgVideoBinding.java` | Layout |
| `LayoutBillingDialogBinding.java` | Layout |
| `LayoutBtnShareBinding.java` | Layout |
| `LayoutBtnUnlockBinding.java` | Layout |
| `LayoutContactUsBinding.java` | Layout |
| `LayoutDialogBinding.java` | Layout |
| `LayoutDialogCopyrightBinding.java` | Layout |
| `LayoutDialogPremuimBinding.java` | Layout |
| `LayoutDialogRateBinding.java` | Layout |
| `LayoutEditGradientBinding.java` | Layout |
| `LayoutHelpWhatsappBinding.java` | Layout |
| `LayoutPermissionLimetedBinding.java` | Layout |
| `LayoutPriceBinding.java` | Layout |
| `LayoutProDoneBinding.java` | Layout |
| `LayoutProNotFoundBinding.java` | Layout |
| `LayoutResolutionBinding.java` | Layout |
| `LayoutTablayoutBinding.java` | Layout |
| `LayoutTittleProActBinding.java` | Layout |
| `LayoutTutoFeaturesBinding.java` | Layout |
| `LayoutWorkSetupBinding.java` | Layout |
| `RatingBottomSheetBinding.java` | BottomSheet |
| `RowAnimBinding.java` | Row |
| `RowAspectBinding.java` | Row |
| `RowBillingBinding.java` | Row |
| `RowColorBinding.java` | Row |
| `RowExploreBinding.java` | Row |
| `RowFeatureBinding.java` | Row |
| `RowFontBinding.java` | Row |
| `RowGalleryBinding.java` | Row |
| `RowGallerySelectBinding.java` | Row |
| `RowIpadBinding.java` | Row |
| `RowImgBgBinding.java` | Row |
| `RowReverbBinding.java` | Row |
| `RowSearchQuranBinding.java` | Row |
| `RowSpinnerAyaBinding.java` | Row |
| `RowSurahBinding.java` | Row |
| `RowWordAyaBinding.java` | Row |
| `RowWorkUserBinding.java` | Row |

---

## 🔴 `model/` — النماذج

### `model/entity/` — نماذج الكيانات

| الملف الجديد | الوصف |
|-------------|-------|
| `BismilahEntity.java` | كيان البسملة |
| `EntityMedia.java` | كيان الوسائط (صور/فيديو) |
| `EntitySelectTool.java` | أداة اختيار الكيان |
| `EntityView.java` | عرض الكيان على الشاشة |
| `MRectF.java` | مستطيل معدّل (RectF مخصص) |
| `QuranEntity.java` | كيان آية القرآن |
| `SquareBitmapModel.java` | نموذج الصورة المربعة |
| `SurahNameEntity.java` | كيان اسم السورة |
| `TextEntity.java` | كيان النص العام |
| `TranslationQuranEntity.java` | كيان ترجمة القرآن |

### `model/template/` — نماذج القوالب

| الملف الجديد | الوصف |
|-------------|-------|
| `EntityBismilahTemplate.java` | قالب البسملة |
| `EntityProgressTemplate.java` | قالب شريط التقدم |
| `EntityQuranTemplate.java` | قالب آية القرآن |
| `EntitySurahTemplate.java` | قالب اسم السورة |
| `EntityTranslationTemplate.java` | قالب الترجمة |
| `Template.java` | القالب الرئيسي (يحتوي كل القوالب الفرعية) |

### `model/timeline/` — نماذج الجدول الزمني

| الملف الجديد | الوصف |
|-------------|-------|
| `Entity.java` | الكيان الأساسي للجدول الزمني |
| `EntityAudio.java` | كيان الصوت في الجدول |
| `EntityBismilahTimeline.java` | كيان البسملة في الجدول |
| `EntityQuranTimeline.java` | كيان الآية في الجدول |
| `EntityTrslTimeline.java` | كيان الترجمة في الجدول |

### `model/` — نماذج عامة (جذر model)

| الملف الجديد | الوصف |
|-------------|-------|
| `BgItem.java` | عنصر الخلفية |
| `EffectAudio.java` | تأثير صوتي |
| `ExploreItem.java` | عنصر الاستكشاف |
| `GallerySelected.java` | عنصر المعرض المحدد |
| `Gradient.java` | تدرج لوني |
| `IpadItem.java` | عنصر إطار iPad |
| `ItemDimension.java` | عنصر الأبعاد |
| `ItemQuranSearch.java` | عنصر بحث القرآن |
| `ModelFeatures.java` | نموذج الميزات |
| `PhotoItem.java` | عنصر الصورة |
| `RecitersModel.java` | نموذج القراء |
| `RenderManager.java` | مدير التصيير |
| `RenderTask.java` | مهمة التصيير |
| `TimeModel.java` | نموذج الوقت |
| `Transition.java` | انتقال |
| `VideoItem.java` | عنصر الفيديو |
| `WordModel.java` | نموذج الكلمة |
| `YoutuberModel.java` | نموذج اليوتيوبر |

---

## 🟣 `ui/activity/` — فئات Activity

| الملف الجديد | الوصف | ملاحظات |
|-------------|-------|---------|
| `AboutActivity.java` | شاشة حول التطبيق | — |
| `AddReaderNameActivity.java` | شاشة إضافة اسم القارئ | — |
| `AdsTuffahActivity.java` | شاشة إعلان تطبيق تُفّاح | — |
| `Base.java` | Activity أساسي | يحتوي على `wakeLockAquire()` (خطأ إملائي) |
| `ChoiceBgFromVideoActivity.java` | اختيار خلفية من فيديو | — |
| `ChoiceLangActivity.java` | اختيار اللغة | — |
| `CropBitmapActivity.java` | قص الصورة | — |
| `EditS_NameActivity.java` | تعديل اسم السورة | — |
| `EditTrslTxtActivity.java` | تعديل نص الترجمة | — |
| `EngineActivity.java` | **المحرك الرئيسي** | أهم Activity، يحتوي على Timeline |
| `FullscreenActivity.java` | شاشة البداية (Splash) | Launcher Activity |
| `GalleryPickerOneImage.java` | اختيار صورة من المعرض | — |
| `GalleryPickerVideo.java` | اختيار فيديو من المعرض | — |
| `PlayVideoActivity.java` | تشغيل الفيديو | — |
| `ProgressViewActivity.java` | شاشة تقدم التصدير | — |
| `ProVersionActivity.java` | شاشة النسخة المدفوعة | — |
| `ProVersionActivity$$ExternalSyntheticBackport0.java` | ملف مولّد R8/D8 | كود ميت/مولّد |
| `ProVersionActivityDone.java` | شاشة اكتمال الشراء | — |
| `ProVersionActivityLast.java` | شاشة النسخة المدفوعة (أخيرة) | — |
| `ProgressViewActivity$$ExternalSyntheticLambda6.java` | ملف مولّد R8/D8 | كود ميت/مولّد |
| `QuranSearchActivity.java` | البحث في القرآن | — |
| `SettingsActivity.java` | الإعدادات | — |
| `ShareWithMeActivity.java` | مشاركة مع التطبيق | intent-filter: audio/*, video/*, image/* |
| `SplashscreenActivity.java` | شاشة البداية | — |
| `SupportBillingActivity.java` | شاشة دعم الفواتير | — |
| `ThanksYouActivity.java` | شاشة شكر | — |
| `TextEditActivity.java` | تعديل النص | — |
| `VideoPlayerActivity.java` | مشغل الفيديو | يستخدم Media3/ExoPlayer |
| `VideoViewActivity.java` | عرض الفيديو | — |
| `WorkUserActivity.java` | شاشة أعمال المستخدم | — |
| `YoutuberActivity.java` | شاشة اليوتيوبر | — |

---

## 🟠 `ui/adapter/` — محولات RecyclerView

| الملف الجديد | الوصف |
|-------------|-------|
| `AboutAdapters.java` | محول شاشة حول |
| `BgAdapter.java` | محول الخلفيات |
| `BgAdapterL.java` | محول الخلفيات (نسخة L) |
| `ColorAdapter.java` | محول الألوان |
| `ColorBgAdapter.java` | محول ألوان الخلفية |
| `DimensionAdapters.java` | محول الأبعاد |
| `ExploreAdapters.java` | محول الاستكشاف |
| `FeaturesAdapter.java` | محول الميزات |
| `FontTextAdapters.java` | محول الخطوط |
| `GalleryPickerAdapters.java` | محول اختيار المعرض |
| `GallerySelectedAdapters.java` | محول العناصر المحددة |
| `GalleryVideoAdapters.java` | محول معرض الفيديو |
| `GradientAdapter.java` | محول التدرجات |
| `IconQuranAdapters.java` | محول أيقونات القرآن |
| `ImgAdapter.java` | محول الصور |
| `IpadAdapter.java` | محول إطار iPad |
| `ReverbAdapter.java` | محول تأثير Reverb |
| `SearchQuranAdapters.java` | محول البحث في القرآن |
| `SurahSpinnerAdapter.java` | محول Spinner السور |
| `TransitionBismilahAdapters.java` | محول انتقالات البسملة |
| `TransitionEntityAdapters.java` | محول انتقالات الكيانات |
| `WordAyaAdapter.java` | محول كلمات الآية |
| `WorkUserAdapter.java` | محول أعمال المستخدم |
| `YoutuberAdapter.java` | محول اليوتيوبر |

---

## 🔵 `ui/fragment/` — فئات Fragment

| الملف الجديد | الوصف |
|-------------|-------|
| `AddAudioFragment.java` | إضافة صوت |
| `AddQuranFragment.java` | إضافة آية قرآنية |
| `ChangeBgFragment.java` | تغيير الخلفية |
| `ColorAyaFragment.java` | ألوان الآية |
| `ColorBismilahFragment.java` | ألوان البسملة |
| `ColorS_NameFragment.java` | ألوان اسم السورة |
| `ColorTrslAyaFragment.java` | ألوان الترجمة |
| `ColorsFragment.java` | الألوان العامة |
| `EditBismilahEntityFragment.java` | تعديل البسملة |
| `EditEntityFragment.java` | تعديل الكيان |
| `EditIconQuranFragment.java` | تعديل أيقونة القرآن |
| `EditIpadFragment.java` | تعديل إطار iPad |
| `EditMediaFragment.java` | تعديل الوسائط |
| `EditMultipleEntityFragment.java` | تعديل كيانات متعددة |
| `EditS_NameFragment.java` | تعديل اسم السورة |
| `EditTextFragment.java` | تعديل النص |
| `EditTrslEntityFragment.java` | تعديل ترجمة الكيان |
| `EffectAyaFragment.java` | تأثيرات الآية |
| `EffectBismilahFragment.java` | تأثيرات البسملة |
| `FontFragment.java` | الخطوط |
| `GalleryPhotosFragment.java` | معرض الصور |
| `GalleryVideoFragment.java` | معرض الفيديو |
| `GradientFragment.java` | التدرجات |
| `ProgressViewFragment.java` | عرض التقدم |
| `RatingBottomSheetDialog.java` | حوار التقييم |
| `ResizeFragment.java` | تغيير الحجم |
| `SimpleProgressViewFragment.java` | عرض تقدم بسيط |

### `ui/fragment/audio_effect/` — تأثيرات الصوت

| الملف الجديد | الوصف |
|-------------|-------|
| `EchoEffectFragment.java` | تأثير الصدى |
| `EnhanceVoiceFragment.java` | تحسين الصوت |
| `FadeInOutFragment.java` | تأثير التلاشي |
| `PitchFragment.java` | حدة الصوت |
| `RemoveNoiseFragment.java` | إزالة الضوضاء |
| `Reverb.java` | تأثير Reverb |
| `ReverbPresetFragment.java` | إعدادات Reverb المسبقة |
| `SpeedFragment.java` | سرعة الصوت |
| `VolumeFragment.java` | مستوى الصوت |

---

## 🟤 `ui/gesture/` — كاشفات الإيماءات

| الملف الجديد | الوصف |
|-------------|-------|
| `BaseGestureDetector.java` | كاشف الإيماءات الأساسي |
| `MoveGestureDetector.java` | كاشف إيماءة التحريك |
| `RotateGestureDetector.java` | كاشف إيماءة الدوران |
| `ShoveGestureDetector.java` | كاشف إيماءة الدفع |
| `TwoFingerGestureDetector.java` | كاشف إيماءة الإصبعين |

---

## 🟡 `ui/view/` — عروض مخصصة

| الملف الجديد | الوصف |
|-------------|-------|
| `ArrowOverlayDecoration.java` | زخرفة سهم فوق العرض |
| `AyaCircleBg.java` | خلفية دائرية للآية |
| `AyaCustomFont.java` | نص آية بخط مخصص |
| `BeforeAfterView.java` | عرض قبل/بعد |
| `BlurredImageView.java` | عرض الصورة الضبابية (**العرض الرئيسي**) |
| `ButtonCustomFont.java` | زر بخط مخصص |
| `ButtonCustomFontBilling.java` | زر الفواتير بخط مخصص |
| `CassetteView.java` | عرض الكاسيت |
| `CheckboxCustomFont.java` | مربع اختيار بخط مخصص |
| `CropView.java` | عرض القص |
| `CropViewHint.java` | تلميح القص |
| `CustomDiscreteSeekBar.java` | شريط بحث منفصل مخصص |
| `EditTextCustomFont.java` | حقل نص بخط مخصص |
| `EyeOpenView.java` | عرض العين المفتوحة |
| `EyeView.java` | عرض العين |
| `GradientProgressBar.java` | شريط تقدم متدرج |
| `NeumorphicRectView.java` | عرض نيومورفيك مستطيل |
| `NeumorphicView.java` | عرض نيومورفيك |
| `NurMontageFont.java` | خط NurMontage |
| `RadioBtnCustomFont.java` | زر راديو بخط مخصص |
| `ScrollFadeDecoration.java` | زخرفة التلاشي عند التمرير |
| `SquareImageView.java` | عرض صورة مربع |
| `SquareImageViewSimple.java` | عرض صورة مربع بسيط |
| `SquareOutlineProgressBar.java` | شريط تقدم مربع |
| `TextCustomFont.java` | نص بخط مخصص |
| `TextCustomFontAR.java` | نص عربي بخط مخصص |
| `TextCustomFontBold.java` | نص عريض بخط مخصص |
| `TrackEntityView.java` | عرض مسار الكيانات (**Timeline**) |
| `VideoFrameSelectorView.java` | عرض اختيار إطارات الفيديو |
| `WaveformView.java` | عرض شكل الموجة |

---

## 🔧 `util/` — أدوات مساعدة

### `util/` — أدوات عامة (جذر util)

| الملف الجديد | الوصف |
|-------------|-------|
| `AppSettingsHelper.java` | مساعد إعدادات التطبيق |
| `AppUtils.java` | أدوات عامة للتطبيق |
| `AspectRatioCalculator.java` | حاسبة نسبة العرض للارتفاع |
| `ArtistLightEffect.java` | تأثير الضوء الفني |
| `BillingPreferences.java` | تفضيلات الفواتير |
| `ColorSchemeGenerator.java` | مولّد مخططات الألوان |
| `ColorUtils.java` | أدوات الألوان |
| `CustomTypefaceSpan.java` | Span لنوع خط مخصص |
| `EndOfAyaSpan.java` | Span لنهاية الآية |
| `Feedback.java` | ملاحظات/تقييم |
| `FontProvider.java` | مزوّد الخطوط |
| `FontUtils.java` | أدوات الخطوط |
| `ItemAdapterJson.java` | محول JSON للعناصر |
| `LocaleHelper.java` | مساعد اللغة |
| `MyPreferences.java` | التفضيلات |
| `MyVibrationHelper.java` | مساعد الاهتزاز |
| `NetworkUtils.java` | أدوات الشبكة |
| `NonScrollableLinearLayoutManager.java` | مدير تخطيط غير قابل للتمرير |
| `PriceFormatter.java` | منسق الأسعار |
| `QuranReader.java` | قارئ القرآن |
| `RemoveTashkeel.java` | إزالة التشكيل |
| `ScreenUtils.java` | أدوات الشاشة |
| `TimeFormatter.java` | منسق الوقت |
| `TranslationExtractor.java` | مستخرج الترجمات |
| `Utils.java` | أدوات مساعدة عامة |
| `WordProcessor.java` | معالج الكلمات |

### `util/audio/` — أدوات الصوت

| الملف الجديد | الوصف |
|-------------|-------|
| `AmplitudeExtract.java` | استخراج سعة الصوت |
| `AudioUploadHelper.java` | مساعد رفع الصوت |
| `AudioUtils.java` | أدوات الصوت العامة |

### `util/bitmap/` — أدوات الصور

| الملف الجديد | الوصف |
|-------------|-------|
| `BitmapCropper.java` | قص الصور النقطية |
| `BitmapSaver.java` | حفظ الصور النقطية |
| `CanvasUtils.java` | أدوات Canvas |
| `CreateGradient.java` | إنشاء تدرجات لونية |
| `DrawableHelper.java` | مساعد Drawable |
| `ImageLoader.java` | محمّل الصور |
| `JavaBM.java` | معالجة Bitmap بـ Java |
| `StoryCropTransformation.java` | تحويل قص Story (Glide) |
| `UtilsBitmap.java` | أدوات Bitmap العامة |

### `util/file/` — أدوات الملفات

| الملف الجديد | الوصف |
|-------------|-------|
| `FileHelper.java` | مساعد الملفات |
| `FileMediaScanner.java` | ماسح ملفات الوسائط |
| `FileUtils.java` | أدوات الملفات العامة |
| `LocalPersistence.java` | حفظ/تحميل القوالب محليًا (Gson) |
| `MFileUtils.java` | أدوات ملفات إضافية |
| `QuranFileUtils.java` | أدوات ملفات القرآن |
| `QuranPreference.java` | تفضيلات القرآن |
| `UtilsFile.java` | أدوات ملفات مساعدة |
| `UtilsFileLast.java` | أدوات ملفات إضافية |

### `util/waveform/` — أدوات شكل الموجة

| الملف الجديد | الوصف |
|-------------|-------|
| `FastWaveform.java` | شكل موجة سريع |
| `FastWaveformExtractor.java` | مستخرج شكل موجة سريع |
| `FastWaveformExtractorOptimized.java` | مستخرج محسّن |
| `FastWaveformExtractorPro.java` | مستخرج النسخة المدفوعة |
| `PCMWaveformExtractor.java` | مستخرج PCM |
| `UltraFastWaveform.java` | شكل موجة فائق السرعة |
| `UltraFastWaveformOptimized.java` | محسّن فائق السرعة |
| `WaveformBitmapRenderer.java` | مُصيّر شكل الموجة Bitmap |
| `WaveformExtractor.java` | مستخرج شكل الموجة الأساسي |
| `WaveformRendererPro.java` | مُصيّر النسخة المدفوعة |

### `util/render/` — أدوات التصيير

| الملف الجديد | الوصف |
|-------------|-------|
| `CinematicProcessor.java` | معالج التأثيرات السينمائية |
| `FfmpegCodecChecker.java` | فاحص ترميز FFmpeg |
| `SmoothTimelineAnimator.java` | مُحرك الجدول الزمني السلس |
| `SmoothVideoAnimator.java` | مُحرك الفيديو السلس |
| `TimelineAnimator.java` | مُحرك الجدول الزمني |

---

## 📦 Native Libraries — `jniLibs/arm64-v8a/`

| الملف | الحجم التقريبي | الوصف |
|-------|---------------|-------|
| `libavcodec.so` | ~8MB | FFmpeg - ترميز/فك ترميز |
| `libavdevice.so` | ~0.5MB | FFmpeg - أجهزة الإدخال/الإخراج |
| `libavfilter.so` | ~3MB | FFmpeg - فلاتر |
| `libavformat.so` | ~3MB | FFmpeg - تنسيقات الحاوية |
| `libavutil.so` | ~1MB | FFmpeg - أدوات مساعدة |
| `libswresample.so` | ~0.5MB | FFmpeg - إعادة عينات الصوت |
| `libswscale.so` | ~0.5MB | FFmpeg - تحجيم الصور |
| `libffmpegkit.so` | ~1MB | FFmpegKit - واجهة Java |
| `libffmpegkit_abidetect.so` | ~0.1MB | FFmpegKit - كشف ABI |
| `libc++_shared.so` | ~1MB | C++ Runtime |

---

## 🎨 Assets — الموارد

### `assets/fonts/` — خطوط أساسية (9)

| الملف | الوصف |
|-------|-------|
| `ReadexPro_Bold.ttf` | خط التطبيق العريض |
| `ReadexPro_Medium.ttf` | خط التطبيق المتوسط |
| `ReadexPro-Regular.ttf` | خط التطبيق العادي |
| `Poppins-Regular.ttf` | خط إنجليزي |
| `Poppins-SemiBold.ttf` | خط إنجليزي شبه عريض |
| `Rubik-SemiBold.ttf` | خط Rubik شبه عريض |
| `Alegreya-Regular.ttf` | خط Alegreya |
| `NotoSans.ttf` | خط Noto Sans |
| `خط البسملة.ttf` | خط البسملة |
| `خط الاستعاذه.ttf` | خط الاستعاذة |
| `surah_name.otf` | خط اسم السورة |

### `assets/fonts/arabic/` — خطوط عربية (40+)

تشمل: عثماني، خط الإبل، المصحف، كوفي، نسخ، نستعليق، قالون، ورش، الثلث، الأقصى، بيسان، جنة، فسيح، نون، شمائل، وغيرها...

### `assets/quran/` — نصوص القرآن والترجمات (10)

| الملف | اللغة |
|-------|-------|
| `quran-simple.txt` | نص القرآن البسيط |
| `ar.muyassar.txt` | التفسير الميسر (عربي) |
| `en.hilali.txt` | ترجمة هلالي (إنجليزي) |
| `fr.hamidullah.txt` | ترجمة حميد الله (فرنسي) |
| `de.bubenheim.txt` | ترجمة بوبنهايم (ألماني) |
| `id.indonesian.txt` | ترجمة إندونيسية |
| `ur.maududi.txt` | ترجمة مودودي (أردو) |
| `tr.ozturk.txt` | ترجمة أوزترك (تركي) |
| `fa.fooladvand.txt` | ترجمة فولادفند (فارسي) |
| `bn.bengali.txt` | ترجمة بنغالية |

### `assets/dexopt/` — Baseline Profiles

| الملف | الوصف |
|-------|-------|
| `baseline.prof` | ملف Profile لتحسين الأداء |
| `baseline.profm` | ملف Metadata للـ Profile |
