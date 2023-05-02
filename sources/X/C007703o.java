package X;

import android.os.Build;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: X.03o  reason: invalid class name and case insensitive filesystem */
public class C007703o {
    public static SimpleDateFormat A0I;
    public static SimpleDateFormat A0J;
    public static final Charset A0K;
    public static final HashMap A0L = new HashMap();
    public static final HashSet A0M = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final List A0N = Arrays.asList(new Integer[]{2, 7, 4, 5});
    public static final List A0O = Arrays.asList(new Integer[]{1, 6, 3, 8});
    public static final Pattern A0P = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0Q = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0R = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0S = Pattern.compile(".*[1-9].*");
    public static final boolean A0T = Log.isLoggable("ExifInterface", 3);
    public static final byte[] A0U = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final byte[] A0V = {104, 101, 105, 99};
    public static final byte[] A0W = {109, 105, 102, 49};
    public static final byte[] A0X = {102, 116, 121, 112};
    public static final byte[] A0Y;
    public static final byte[] A0Z;
    public static final byte[] A0a = {-1, -40, -1};
    public static final byte[] A0b = {79, 76, 89, 77, 80, 0};
    public static final byte[] A0c = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] A0d = {101, 88, 73, 102};
    public static final byte[] A0e = {73, 69, 78, 68};
    public static final byte[] A0f = {73, 72, 68, 82};
    public static final byte[] A0g = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] A0h = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] A0i = "ANMF".getBytes(Charset.defaultCharset());
    public static final byte[] A0j = {69, 88, 73, 70};
    public static final byte[] A0k = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] A0l = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] A0m = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] A0n = {82, 73, 70, 70};
    public static final byte[] A0o = {87, 69, 66, 80};
    public static final byte[] A0p = {-99, 1, 42};
    public static final int[] A0q = {8};
    public static final int[] A0r = {8, 8, 8};
    public static final int[] A0s = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final AnonymousClass0U6[] A0t = {new AnonymousClass0U6(330, "SubIFDPointer", 4), new AnonymousClass0U6(34665, "ExifIFDPointer", 4), new AnonymousClass0U6(34853, "GPSInfoIFDPointer", 4), new AnonymousClass0U6(40965, "InteroperabilityIFDPointer", 4), new AnonymousClass0U6(8224, "CameraSettingsIFDPointer", 1), new AnonymousClass0U6(8256, "ImageProcessingIFDPointer", 1)};
    public static final AnonymousClass0U6[] A0u;
    public static final AnonymousClass0U6[] A0v;
    public static final AnonymousClass0U6[] A0w;
    public static final AnonymousClass0U6[] A0x;
    public static final AnonymousClass0U6[] A0y;
    public static final AnonymousClass0U6[] A0z;
    public static final AnonymousClass0U6[] A10;
    public static final AnonymousClass0U6[] A11;
    public static final AnonymousClass0U6[] A12;
    public static final String[] A13 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final HashMap[] A14 = new HashMap[10];
    public static final HashMap[] A15 = new HashMap[10];
    public static final AnonymousClass0U6[][] A16;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public FileDescriptor A08;
    public String A09;
    public ByteOrder A0A;
    public Set A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public byte[] A0G;
    public final HashMap[] A0H;

    static {
        AnonymousClass0U6[] r6 = {new AnonymousClass0U6(254, "NewSubfileType", 4), new AnonymousClass0U6(MotionEventCompat.ACTION_MASK, "SubfileType", 4), new AnonymousClass0U6("ImageWidth", 256, 3, 4), new AnonymousClass0U6("ImageLength", 257, 3, 4), new AnonymousClass0U6(258, "BitsPerSample", 3), new AnonymousClass0U6(259, "Compression", 3), new AnonymousClass0U6(262, "PhotometricInterpretation", 3), new AnonymousClass0U6(270, "ImageDescription", 2), new AnonymousClass0U6(271, "Make", 2), new AnonymousClass0U6(272, "Model", 2), new AnonymousClass0U6("StripOffsets", 273, 3, 4), new AnonymousClass0U6(274, "Orientation", 3), new AnonymousClass0U6(277, "SamplesPerPixel", 3), new AnonymousClass0U6("RowsPerStrip", 278, 3, 4), new AnonymousClass0U6("StripByteCounts", 279, 3, 4), new AnonymousClass0U6(282, "XResolution", 5), new AnonymousClass0U6(283, "YResolution", 5), new AnonymousClass0U6(284, "PlanarConfiguration", 3), new AnonymousClass0U6(296, "ResolutionUnit", 3), new AnonymousClass0U6(301, "TransferFunction", 3), new AnonymousClass0U6(305, "Software", 2), new AnonymousClass0U6(306, "DateTime", 2), new AnonymousClass0U6(315, "Artist", 2), new AnonymousClass0U6(318, "WhitePoint", 5), new AnonymousClass0U6(319, "PrimaryChromaticities", 5), new AnonymousClass0U6(330, "SubIFDPointer", 4), new AnonymousClass0U6(513, "JPEGInterchangeFormat", 4), new AnonymousClass0U6(514, "JPEGInterchangeFormatLength", 4), new AnonymousClass0U6(529, "YCbCrCoefficients", 5), new AnonymousClass0U6(530, "YCbCrSubSampling", 3), new AnonymousClass0U6(531, "YCbCrPositioning", 3), new AnonymousClass0U6(532, "ReferenceBlackWhite", 5), new AnonymousClass0U6(33432, "Copyright", 2), new AnonymousClass0U6(34665, "ExifIFDPointer", 4), new AnonymousClass0U6(34853, "GPSInfoIFDPointer", 4), new AnonymousClass0U6(4, "SensorTopBorder", 4), new AnonymousClass0U6(5, "SensorLeftBorder", 4), new AnonymousClass0U6(6, "SensorBottomBorder", 4), new AnonymousClass0U6(7, "SensorRightBorder", 4), new AnonymousClass0U6(23, "ISO", 3), new AnonymousClass0U6(46, "JpgFromRaw", 7), new AnonymousClass0U6(700, "Xmp", 1)};
        A0y = r6;
        AnonymousClass0U6[] r4 = {new AnonymousClass0U6(33434, "ExposureTime", 5), new AnonymousClass0U6(33437, "FNumber", 5), new AnonymousClass0U6(34850, "ExposureProgram", 3), new AnonymousClass0U6(34852, "SpectralSensitivity", 2), new AnonymousClass0U6(34855, "PhotographicSensitivity", 3), new AnonymousClass0U6(34856, "OECF", 7), new AnonymousClass0U6(34864, "SensitivityType", 3), new AnonymousClass0U6(34865, "StandardOutputSensitivity", 4), new AnonymousClass0U6(34866, "RecommendedExposureIndex", 4), new AnonymousClass0U6(34867, "ISOSpeed", 4), new AnonymousClass0U6(34868, "ISOSpeedLatitudeyyy", 4), new AnonymousClass0U6(34869, "ISOSpeedLatitudezzz", 4), new AnonymousClass0U6(36864, "ExifVersion", 2), new AnonymousClass0U6(36867, "DateTimeOriginal", 2), new AnonymousClass0U6(36868, "DateTimeDigitized", 2), new AnonymousClass0U6(36880, "OffsetTime", 2), new AnonymousClass0U6(36881, "OffsetTimeOriginal", 2), new AnonymousClass0U6(36882, "OffsetTimeDigitized", 2), new AnonymousClass0U6(37121, "ComponentsConfiguration", 7), new AnonymousClass0U6(37122, "CompressedBitsPerPixel", 5), new AnonymousClass0U6(37377, "ShutterSpeedValue", 10), new AnonymousClass0U6(37378, "ApertureValue", 5), new AnonymousClass0U6(37379, "BrightnessValue", 10), new AnonymousClass0U6(37380, "ExposureBiasValue", 10), new AnonymousClass0U6(37381, "MaxApertureValue", 5), new AnonymousClass0U6(37382, "SubjectDistance", 5), new AnonymousClass0U6(37383, "MeteringMode", 3), new AnonymousClass0U6(37384, "LightSource", 3), new AnonymousClass0U6(37385, "Flash", 3), new AnonymousClass0U6(37386, "FocalLength", 5), new AnonymousClass0U6(37396, "SubjectArea", 3), new AnonymousClass0U6(37500, "MakerNote", 7), new AnonymousClass0U6(37510, "UserComment", 7), new AnonymousClass0U6(37520, "SubSecTime", 2), new AnonymousClass0U6(37521, "SubSecTimeOriginal", 2), new AnonymousClass0U6(37522, "SubSecTimeDigitized", 2), new AnonymousClass0U6(40960, "FlashpixVersion", 7), new AnonymousClass0U6(40961, "ColorSpace", 3), new AnonymousClass0U6("PixelXDimension", 40962, 3, 4), new AnonymousClass0U6("PixelYDimension", 40963, 3, 4), new AnonymousClass0U6(40964, "RelatedSoundFile", 2), new AnonymousClass0U6(40965, "InteroperabilityIFDPointer", 4), new AnonymousClass0U6(41483, "FlashEnergy", 5), new AnonymousClass0U6(41484, "SpatialFrequencyResponse", 7), new AnonymousClass0U6(41486, "FocalPlaneXResolution", 5), new AnonymousClass0U6(41487, "FocalPlaneYResolution", 5), new AnonymousClass0U6(41488, "FocalPlaneResolutionUnit", 3), new AnonymousClass0U6(41492, "SubjectLocation", 3), new AnonymousClass0U6(41493, "ExposureIndex", 5), new AnonymousClass0U6(41495, "SensingMethod", 3), new AnonymousClass0U6(41728, "FileSource", 7), new AnonymousClass0U6(41729, "SceneType", 7), new AnonymousClass0U6(41730, "CFAPattern", 7), new AnonymousClass0U6(41985, "CustomRendered", 3), new AnonymousClass0U6(41986, "ExposureMode", 3), new AnonymousClass0U6(41987, "WhiteBalance", 3), new AnonymousClass0U6(41988, "DigitalZoomRatio", 5), new AnonymousClass0U6(41989, "FocalLengthIn35mmFilm", 3), new AnonymousClass0U6(41990, "SceneCaptureType", 3), new AnonymousClass0U6(41991, "GainControl", 3), new AnonymousClass0U6(41992, "Contrast", 3), new AnonymousClass0U6(41993, "Saturation", 3), new AnonymousClass0U6(41994, "Sharpness", 3), new AnonymousClass0U6(41995, "DeviceSettingDescription", 7), new AnonymousClass0U6(41996, "SubjectDistanceRange", 3), new AnonymousClass0U6(42016, "ImageUniqueID", 2), new AnonymousClass0U6(42032, "CameraOwnerName", 2), new AnonymousClass0U6(42033, "BodySerialNumber", 2), new AnonymousClass0U6(42034, "LensSpecification", 5), new AnonymousClass0U6(42035, "LensMake", 2), new AnonymousClass0U6(42036, "LensModel", 2), new AnonymousClass0U6(42240, "Gamma", 5), new AnonymousClass0U6(50706, "DNGVersion", 1), new AnonymousClass0U6("DefaultCropSize", 50720, 3, 4)};
        A0u = r4;
        AnonymousClass0U6[] r3 = {new AnonymousClass0U6(0, "GPSVersionID", 1), new AnonymousClass0U6(1, "GPSLatitudeRef", 2), new AnonymousClass0U6("GPSLatitude", 2, 5, 10), new AnonymousClass0U6(3, "GPSLongitudeRef", 2), new AnonymousClass0U6("GPSLongitude", 4, 5, 10), new AnonymousClass0U6(5, "GPSAltitudeRef", 1), new AnonymousClass0U6(6, "GPSAltitude", 5), new AnonymousClass0U6(7, "GPSTimeStamp", 5), new AnonymousClass0U6(8, "GPSSatellites", 2), new AnonymousClass0U6(9, "GPSStatus", 2), new AnonymousClass0U6(10, "GPSMeasureMode", 2), new AnonymousClass0U6(11, "GPSDOP", 5), new AnonymousClass0U6(12, "GPSSpeedRef", 2), new AnonymousClass0U6(13, "GPSSpeed", 5), new AnonymousClass0U6(14, "GPSTrackRef", 2), new AnonymousClass0U6(15, "GPSTrack", 5), new AnonymousClass0U6(16, "GPSImgDirectionRef", 2), new AnonymousClass0U6(17, "GPSImgDirection", 5), new AnonymousClass0U6(18, "GPSMapDatum", 2), new AnonymousClass0U6(19, "GPSDestLatitudeRef", 2), new AnonymousClass0U6(20, "GPSDestLatitude", 5), new AnonymousClass0U6(21, "GPSDestLongitudeRef", 2), new AnonymousClass0U6(22, "GPSDestLongitude", 5), new AnonymousClass0U6(23, "GPSDestBearingRef", 2), new AnonymousClass0U6(24, "GPSDestBearing", 5), new AnonymousClass0U6(25, "GPSDestDistanceRef", 2), new AnonymousClass0U6(26, "GPSDestDistance", 5), new AnonymousClass0U6(27, "GPSProcessingMethod", 7), new AnonymousClass0U6(28, "GPSAreaInformation", 7), new AnonymousClass0U6(29, "GPSDateStamp", 2), new AnonymousClass0U6(30, "GPSDifferential", 3), new AnonymousClass0U6(31, "GPSHPositioningError", 5)};
        A0v = r3;
        AnonymousClass0U6[] r9 = {new AnonymousClass0U6(1, "InteroperabilityIndex", 2)};
        A0w = r9;
        AnonymousClass0U6[] r2 = {new AnonymousClass0U6(254, "NewSubfileType", 4), new AnonymousClass0U6(MotionEventCompat.ACTION_MASK, "SubfileType", 4), new AnonymousClass0U6("ThumbnailImageWidth", 256, 3, 4), new AnonymousClass0U6("ThumbnailImageLength", 257, 3, 4), new AnonymousClass0U6(258, "BitsPerSample", 3), new AnonymousClass0U6(259, "Compression", 3), new AnonymousClass0U6(262, "PhotometricInterpretation", 3), new AnonymousClass0U6(270, "ImageDescription", 2), new AnonymousClass0U6(271, "Make", 2), new AnonymousClass0U6(272, "Model", 2), new AnonymousClass0U6("StripOffsets", 273, 3, 4), new AnonymousClass0U6(274, "ThumbnailOrientation", 3), new AnonymousClass0U6(277, "SamplesPerPixel", 3), new AnonymousClass0U6("RowsPerStrip", 278, 3, 4), new AnonymousClass0U6("StripByteCounts", 279, 3, 4), new AnonymousClass0U6(282, "XResolution", 5), new AnonymousClass0U6(283, "YResolution", 5), new AnonymousClass0U6(284, "PlanarConfiguration", 3), new AnonymousClass0U6(296, "ResolutionUnit", 3), new AnonymousClass0U6(301, "TransferFunction", 3), new AnonymousClass0U6(305, "Software", 2), new AnonymousClass0U6(306, "DateTime", 2), new AnonymousClass0U6(315, "Artist", 2), new AnonymousClass0U6(318, "WhitePoint", 5), new AnonymousClass0U6(319, "PrimaryChromaticities", 5), new AnonymousClass0U6(330, "SubIFDPointer", 4), new AnonymousClass0U6(513, "JPEGInterchangeFormat", 4), new AnonymousClass0U6(514, "JPEGInterchangeFormatLength", 4), new AnonymousClass0U6(529, "YCbCrCoefficients", 5), new AnonymousClass0U6(530, "YCbCrSubSampling", 3), new AnonymousClass0U6(531, "YCbCrPositioning", 3), new AnonymousClass0U6(532, "ReferenceBlackWhite", 5), new AnonymousClass0U6(700, "Xmp", 1), new AnonymousClass0U6(33432, "Copyright", 2), new AnonymousClass0U6(34665, "ExifIFDPointer", 4), new AnonymousClass0U6(34853, "GPSInfoIFDPointer", 4), new AnonymousClass0U6(50706, "DNGVersion", 1), new AnonymousClass0U6("DefaultCropSize", 50720, 3, 4)};
        A0x = r2;
        AnonymousClass0U6[] r12 = {new AnonymousClass0U6(256, "ThumbnailImage", 7), new AnonymousClass0U6(8224, "CameraSettingsIFDPointer", 4), new AnonymousClass0U6(8256, "ImageProcessingIFDPointer", 4)};
        A11 = r12;
        AnonymousClass0U6[] r14 = {new AnonymousClass0U6(257, "PreviewImageStart", 4), new AnonymousClass0U6(258, "PreviewImageLength", 4)};
        A0z = r14;
        AnonymousClass0U6[] r13 = {new AnonymousClass0U6(4371, "AspectFrame", 3)};
        A10 = r13;
        AnonymousClass0U6[] r10 = {new AnonymousClass0U6(55, "ColorSpace", 3)};
        A12 = r10;
        A16 = new AnonymousClass0U6[][]{r6, r4, r3, r9, r2, r6, r12, r14, r13, r10};
        Charset forName = Charset.forName("US-ASCII");
        A0K = forName;
        A0Y = "Exif\u0000\u0000".getBytes(forName);
        A0Z = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        A0I = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        A0J = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            AnonymousClass0U6[][] r22 = A16;
            if (i2 < r22.length) {
                A14[i2] = new HashMap();
                A15[i2] = new HashMap();
                for (AnonymousClass0U6 r23 : r22[i2]) {
                    A14[i2].put(Integer.valueOf(r23.A00), r23);
                    A15[i2].put(r23.A03, r23);
                }
                i2++;
            } else {
                HashMap hashMap = A0L;
                AnonymousClass0U6[] r32 = A0t;
                hashMap.put(Integer.valueOf(r32[0].A00), 5);
                hashMap.put(Integer.valueOf(r32[1].A00), 1);
                hashMap.put(Integer.valueOf(r32[2].A00), 2);
                hashMap.put(Integer.valueOf(r32[3].A00), 3);
                hashMap.put(Integer.valueOf(r32[4].A00), 7);
                hashMap.put(Integer.valueOf(r32[5].A00), 8);
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0148, code lost:
        r1 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x014a, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r9 = new X.AnonymousClass0JA(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r0 = A02(r9);
        r5.A0A = r0;
        r9.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x015e, code lost:
        if (r9.readShort() == 85) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0160, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0165, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0166, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x016b, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x016f, code lost:
        if (r8 != false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0171, code lost:
        r1 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0174, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r8 = A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0178, code lost:
        if (r9 >= r8.length) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x017e, code lost:
        if (r6[r9] != r8[r9]) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0181, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0184, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0185, code lost:
        r0 = A0n;
        r11 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0188, code lost:
        if (r8 < r11) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x018e, code lost:
        if (r6[r8] == r0[r8]) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0190, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0193, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0194, code lost:
        r8 = A0o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0197, code lost:
        if (r9 < r8.length) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01a1, code lost:
        if (r6[(r11 + r9) + 4] == r8[r9]) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01a3, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01a6, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01a8, code lost:
        r1 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01ab, code lost:
        r1 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01ae, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01b1, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01b2, code lost:
        if (r9 == null) goto L_0x0705;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01b6, code lost:
        r1 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        r11 = "FUJIFILMCCD-RAW".getBytes(java.nio.charset.Charset.defaultCharset());
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x056e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:?, code lost:
        r1 = new java.io.IOException("Encountered corrupt PNG file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        if (r9 >= r11.length) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0084, code lost:
        r8 = r6[r9];
        r0 = r11[r9];
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r8 == r0) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:?, code lost:
        r1 = new java.io.IOException("Encountered corrupt WebP file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0702, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0706, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:?, code lost:
        r2 = A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0709, code lost:
        if (r2 != false) goto L_0x070b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x070b, code lost:
        android.util.Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:?, code lost:
        A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0715, code lost:
        if (r2 != false) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x071d, code lost:
        if (A0T != false) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x071f, code lost:
        A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0722, code lost:
        A03(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0725, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0726, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x072c, code lost:
        if (A0T != false) goto L_0x072e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x072e, code lost:
        A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0731, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r11 = new X.AnonymousClass0JA(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r8 = (long) r11.readInt();
        r13 = new byte[4];
        r11.read(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a7, code lost:
        if (java.util.Arrays.equals(r13, A0X) == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        r16 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b1, code lost:
        if (r8 != 1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b3, code lost:
        r8 = r11.readLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        if (r8 >= 16) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bc, code lost:
        r16 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00be, code lost:
        r0 = (long) 5000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c1, code lost:
        if (r8 <= r0) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c3, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c4, code lost:
        r8 = r8 - r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c8, code lost:
        if (r8 < 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        r1 = new byte[4];
        r17 = 0;
        r16 = false;
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d7, code lost:
        if (r17 >= (r8 / 4)) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00dd, code lost:
        if (r11.read(r1) != 4) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e1, code lost:
        if (r17 == 1) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e9, code lost:
        if (java.util.Arrays.equals(r1, A0W) == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f2, code lost:
        if (java.util.Arrays.equals(r1, A0V) == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f4, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f5, code lost:
        if (r16 == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f8, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00fa, code lost:
        if (r15 == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fd, code lost:
        r17 = r17 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r11.close();
        r1 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0107, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010c, code lost:
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x010f, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0110, code lost:
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0112, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0115, code lost:
        if (A0T != false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0117, code lost:
        android.util.Log.d("ExifInterface", "Exception parsing HEIF file type box.", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x011e, code lost:
        if (r9 != null) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0123, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r9 = new X.AnonymousClass0JA(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r0 = A02(r9);
        r5.A0A = r0;
        r9.A01 = r0;
        r1 = r9.readShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x013d, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0142, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0146, code lost:
        if (r8 != false) goto L_0x0148;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0160 A[Catch:{ Exception -> 0x016b, all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0165 A[Catch:{ IOException | UnsupportedOperationException -> 0x0706 }, ExcHandler: all (th java.lang.Throwable), PHI: r9 
      PHI: (r9v17 X.0JA) = (r9v24 X.0JA), (r9v25 X.0JA) binds: [B:104:0x0150, B:88:0x0129] A[DONT_GENERATE, DONT_INLINE], Splitter:B:88:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x017a A[Catch:{ IOException | UnsupportedOperationException -> 0x0706 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01ae A[ExcHandler: all (th java.lang.Throwable), Splitter:B:86:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01cb A[Catch:{ IOException | UnsupportedOperationException -> 0x0706 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c A[SYNTHETIC, Splitter:B:20:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03b9 A[Catch:{ IOException | UnsupportedOperationException -> 0x0706 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070 A[Catch:{ IOException | UnsupportedOperationException -> 0x0706 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0482 A[Catch:{ IOException | UnsupportedOperationException -> 0x0706 }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0706 A[ExcHandler: IOException | UnsupportedOperationException (r3v28 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:94:0x013e] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x01b9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x01ab A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0117 A[Catch:{ all -> 0x01b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0120 A[SYNTHETIC, Splitter:B:83:0x0120] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C007703o(java.lang.String r22) {
        /*
            r21 = this;
            r5 = r21
            r5.<init>()
            X.0U6[][] r0 = A16
            int r8 = r0.length
            java.util.HashMap[] r0 = new java.util.HashMap[r8]
            r5.A0H = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r8)
            r5.A0B = r0
            java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN
            r5.A0A = r7
            r0 = r22
            if (r22 == 0) goto L_0x073a
            r3 = 0
            r5.A09 = r0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0732 }
            r4.<init>(r0)     // Catch:{ all -> 0x0732 }
            java.io.FileDescriptor r6 = r4.getFD()     // Catch:{ all -> 0x0734 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0734 }
            r0 = 21
            if (r1 < r0) goto L_0x0046
            r0 = 0
            int r2 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x003b }
            X.AnonymousClass0VU.A02(r6, r2, r0)     // Catch:{ Exception -> 0x003b }
            java.io.FileDescriptor r0 = r4.getFD()     // Catch:{ all -> 0x0734 }
            r5.A08 = r0     // Catch:{ all -> 0x0734 }
            goto L_0x0048
        L_0x003b:
            boolean r0 = A0T     // Catch:{ all -> 0x0734 }
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0734 }
        L_0x0046:
            r5.A08 = r3     // Catch:{ all -> 0x0734 }
        L_0x0048:
            r2 = 0
            r6 = 0
        L_0x004a:
            if (r6 >= r8) goto L_0x0058
            java.util.HashMap[] r1 = r5.A0H     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0.<init>()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1[r6] = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r6 = r6 + 1
            goto L_0x004a
        L_0x0058:
            r1 = 5000(0x1388, float:7.006E-42)
            java.io.BufferedInputStream r10 = new java.io.BufferedInputStream     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r10.<init>(r4, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r10.mark(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte[] r6 = new byte[r1]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r10.read(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r10.reset()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r11 = 0
        L_0x006b:
            byte[] r9 = A0a     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r9.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r11 >= r0) goto L_0x01b9
            byte r8 = r6[r11]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte r0 = r9[r11]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r8 == r0) goto L_0x008d
            java.nio.charset.Charset r8 = java.nio.charset.Charset.defaultCharset()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "FUJIFILMCCD-RAW"
            byte[] r11 = r0.getBytes(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r9 = 0
        L_0x0081:
            int r0 = r11.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r9 >= r0) goto L_0x01b6
            byte r8 = r6[r9]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte r0 = r11[r9]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r9 = r9 + 1
            if (r8 == r0) goto L_0x0081
            goto L_0x0090
        L_0x008d:
            int r11 = r11 + 1
            goto L_0x006b
        L_0x0090:
            r9 = 0
            X.0JA r11 = new X.0JA     // Catch:{ Exception -> 0x0112 }
            r11.<init>(r6)     // Catch:{ Exception -> 0x0112 }
            int r0 = r11.readInt()     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            long r8 = (long) r0     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            r12 = 4
            byte[] r13 = new byte[r12]     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            r11.read(r13)     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            byte[] r0 = A0X     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            boolean r0 = java.util.Arrays.equals(r13, r0)     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            if (r0 == 0) goto L_0x0107
            r16 = 16
            r14 = 8
            r19 = 1
            int r0 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            long r8 = r11.readLong()     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
            goto L_0x0107
        L_0x00bc:
            r16 = 8
        L_0x00be:
            long r0 = (long) r1     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            int r13 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x00c4
            r8 = r0
        L_0x00c4:
            long r8 = r8 - r16
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0107
            byte[] r1 = new byte[r12]     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            r17 = 0
            r16 = 0
            r15 = 0
        L_0x00d1:
            r13 = 4
            long r13 = r8 / r13
            int r0 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0107
            int r0 = r11.read(r1)     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            if (r0 != r12) goto L_0x0107
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x00fd
            byte[] r0 = A0W     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            if (r0 == 0) goto L_0x00ec
            goto L_0x00f8
        L_0x00ec:
            byte[] r0 = A0V     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ Exception -> 0x010f, all -> 0x010b }
            if (r0 == 0) goto L_0x00f5
            r15 = 1
        L_0x00f5:
            if (r16 == 0) goto L_0x00fd
            goto L_0x00fa
        L_0x00f8:
            r16 = 1
        L_0x00fa:
            if (r15 == 0) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            long r17 = r17 + r19
            goto L_0x00d1
        L_0x0100:
            r11.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1 = 12
            goto L_0x01ba
        L_0x0107:
            r11.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0123
        L_0x010b:
            r1 = move-exception
            r9 = r11
            goto L_0x0702
        L_0x010f:
            r8 = move-exception
            r9 = r11
            goto L_0x0113
        L_0x0112:
            r8 = move-exception
        L_0x0113:
            boolean r0 = A0T     // Catch:{ all -> 0x01b1 }
            if (r0 == 0) goto L_0x011e
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "Exception parsing HEIF file type box."
            android.util.Log.d(r1, r0, r8)     // Catch:{ all -> 0x01b1 }
        L_0x011e:
            if (r9 == 0) goto L_0x0123
            r9.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
        L_0x0123:
            r8 = 0
            X.0JA r9 = new X.0JA     // Catch:{ Exception -> 0x0146, all -> 0x01ae }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0146, all -> 0x01ae }
            java.nio.ByteOrder r0 = A02(r9)     // Catch:{ Exception -> 0x0142, all -> 0x0165 }
            r5.A0A = r0     // Catch:{ Exception -> 0x0142, all -> 0x0165 }
            r9.A01 = r0     // Catch:{ Exception -> 0x0142, all -> 0x0165 }
            short r1 = r9.readShort()     // Catch:{ Exception -> 0x0142, all -> 0x0165 }
            r0 = 20306(0x4f52, float:2.8455E-41)
            if (r1 == r0) goto L_0x013d
            r0 = 21330(0x5352, float:2.989E-41)
            if (r1 != r0) goto L_0x013e
        L_0x013d:
            r8 = 1
        L_0x013e:
            r9.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0146
        L_0x0142:
            r9.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x014a
        L_0x0146:
            if (r8 == 0) goto L_0x014a
            r1 = 7
            goto L_0x01ba
        L_0x014a:
            r8 = 0
            X.0JA r9 = new X.0JA     // Catch:{ Exception -> 0x016f, all -> 0x01ae }
            r9.<init>(r6)     // Catch:{ Exception -> 0x016f, all -> 0x01ae }
            java.nio.ByteOrder r0 = A02(r9)     // Catch:{ Exception -> 0x016b, all -> 0x0165 }
            r5.A0A = r0     // Catch:{ Exception -> 0x016b, all -> 0x0165 }
            r9.A01 = r0     // Catch:{ Exception -> 0x016b, all -> 0x0165 }
            short r1 = r9.readShort()     // Catch:{ Exception -> 0x016b, all -> 0x0165 }
            r0 = 85
            if (r1 != r0) goto L_0x0161
            r8 = 1
        L_0x0161:
            r9.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x016f
        L_0x0165:
            r1 = move-exception
            r9.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0705
        L_0x016b:
            r9.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0174
        L_0x016f:
            if (r8 == 0) goto L_0x0174
            r1 = 10
            goto L_0x01ba
        L_0x0174:
            r9 = 0
        L_0x0175:
            byte[] r8 = A0g     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r8.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r9 >= r0) goto L_0x01ab
            byte r1 = r6[r9]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte r0 = r8[r9]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r1 == r0) goto L_0x0181
            goto L_0x0184
        L_0x0181:
            int r9 = r9 + 1
            goto L_0x0175
        L_0x0184:
            r8 = 0
        L_0x0185:
            byte[] r0 = A0n     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r11 = r0.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r8 >= r11) goto L_0x0193
            byte r1 = r6[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte r0 = r0[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r1 != r0) goto L_0x01a6
            int r8 = r8 + 1
            goto L_0x0185
        L_0x0193:
            r9 = 0
        L_0x0194:
            byte[] r8 = A0o     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r8.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r9 >= r0) goto L_0x01a8
            int r0 = r11 + r9
            int r0 = r0 + 4
            byte r1 = r6[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte r0 = r8[r9]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r1 != r0) goto L_0x01a6
            int r9 = r9 + 1
            goto L_0x0194
        L_0x01a6:
            r1 = 0
            goto L_0x01ba
        L_0x01a8:
            r1 = 14
            goto L_0x01ba
        L_0x01ab:
            r1 = 13
            goto L_0x01ba
        L_0x01ae:
            r1 = move-exception
            goto L_0x0705
        L_0x01b1:
            r1 = move-exception
            if (r9 == 0) goto L_0x0705
            goto L_0x0702
        L_0x01b6:
            r1 = 9
            goto L_0x01ba
        L_0x01b9:
            r1 = 4
        L_0x01ba:
            r5.A00 = r1     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0 = 4
            if (r1 == r0) goto L_0x0482
            r0 = 9
            if (r1 == r0) goto L_0x0482
            r0 = 13
            if (r1 == r0) goto L_0x0482
            r0 = 14
            if (r1 == r0) goto L_0x0482
            X.0Eo r6 = new X.0Eo     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r6.<init>((java.io.InputStream) r10)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r1 = r5.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0 = 12
            if (r1 != r0) goto L_0x033b
            java.lang.String r8 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0 = 28
            if (r1 < r0) goto L_0x0332
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r2.<init>()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            X.0Ap r0 = new X.0Ap     // Catch:{ RuntimeException -> 0x0324 }
            r0.<init>(r6, r5)     // Catch:{ RuntimeException -> 0x0324 }
            X.AnonymousClass0M0.A00(r0, r2)     // Catch:{ RuntimeException -> 0x0324 }
            r0 = 33
            java.lang.String r15 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0324 }
            r0 = 34
            java.lang.String r14 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0324 }
            r0 = 26
            java.lang.String r7 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0324 }
            r0 = 17
            java.lang.String r1 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0324 }
            boolean r0 = r8.equals(r7)     // Catch:{ RuntimeException -> 0x0324 }
            r9 = 0
            if (r0 == 0) goto L_0x021d
            r0 = 29
            java.lang.String r9 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0324 }
            r0 = 30
            java.lang.String r3 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0324 }
            r0 = 31
            java.lang.String r8 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0324 }
            goto L_0x0237
        L_0x021d:
            boolean r0 = r8.equals(r1)     // Catch:{ RuntimeException -> 0x0324 }
            if (r0 == 0) goto L_0x0236
            r0 = 18
            java.lang.String r9 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0324 }
            r0 = 19
            java.lang.String r3 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0324 }
            r0 = 24
            java.lang.String r8 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0324 }
            goto L_0x0237
        L_0x0236:
            r8 = r3
        L_0x0237:
            r10 = 0
            if (r9 == 0) goto L_0x0252
            java.util.HashMap[] r0 = r5.A0H     // Catch:{ RuntimeException -> 0x0324 }
            r12 = r0[r10]     // Catch:{ RuntimeException -> 0x0324 }
            java.lang.String r11 = "ImageWidth"
            int r7 = java.lang.Integer.parseInt(r9)     // Catch:{ RuntimeException -> 0x0324 }
            java.nio.ByteOrder r1 = r5.A0A     // Catch:{ RuntimeException -> 0x0324 }
            r0 = 1
            int[] r0 = new int[r0]     // Catch:{ RuntimeException -> 0x0324 }
            r0[r10] = r7     // Catch:{ RuntimeException -> 0x0324 }
            X.0Ww r0 = X.C06590Ww.A01(r1, r0)     // Catch:{ RuntimeException -> 0x0324 }
            r12.put(r11, r0)     // Catch:{ RuntimeException -> 0x0324 }
        L_0x0252:
            if (r3 == 0) goto L_0x026c
            java.util.HashMap[] r0 = r5.A0H     // Catch:{ RuntimeException -> 0x0324 }
            r12 = r0[r10]     // Catch:{ RuntimeException -> 0x0324 }
            java.lang.String r11 = "ImageLength"
            int r7 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x0324 }
            java.nio.ByteOrder r1 = r5.A0A     // Catch:{ RuntimeException -> 0x0324 }
            r0 = 1
            int[] r0 = new int[r0]     // Catch:{ RuntimeException -> 0x0324 }
            r0[r10] = r7     // Catch:{ RuntimeException -> 0x0324 }
            X.0Ww r0 = X.C06590Ww.A01(r1, r0)     // Catch:{ RuntimeException -> 0x0324 }
            r12.put(r11, r0)     // Catch:{ RuntimeException -> 0x0324 }
        L_0x026c:
            r12 = 6
            if (r8 == 0) goto L_0x029a
            r13 = 1
            int r1 = java.lang.Integer.parseInt(r8)     // Catch:{ RuntimeException -> 0x0324 }
            r0 = 90
            if (r1 == r0) goto L_0x0285
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L_0x0283
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L_0x0286
            r13 = 8
            goto L_0x0286
        L_0x0283:
            r13 = 3
            goto L_0x0286
        L_0x0285:
            r13 = 6
        L_0x0286:
            java.util.HashMap[] r0 = r5.A0H     // Catch:{ RuntimeException -> 0x0324 }
            r11 = r0[r10]     // Catch:{ RuntimeException -> 0x0324 }
            java.lang.String r7 = "Orientation"
            java.nio.ByteOrder r1 = r5.A0A     // Catch:{ RuntimeException -> 0x0324 }
            r0 = 1
            int[] r0 = new int[r0]     // Catch:{ RuntimeException -> 0x0324 }
            r0[r10] = r13     // Catch:{ RuntimeException -> 0x0324 }
            X.0Ww r0 = X.C06590Ww.A01(r1, r0)     // Catch:{ RuntimeException -> 0x0324 }
            r11.put(r7, r0)     // Catch:{ RuntimeException -> 0x0324 }
        L_0x029a:
            if (r15 == 0) goto L_0x02d5
            if (r14 == 0) goto L_0x02d5
            int r11 = java.lang.Integer.parseInt(r15)     // Catch:{ RuntimeException -> 0x0324 }
            int r7 = java.lang.Integer.parseInt(r14)     // Catch:{ RuntimeException -> 0x0324 }
            if (r7 <= r12) goto L_0x0314
            long r0 = (long) r11     // Catch:{ RuntimeException -> 0x0324 }
            r6.A01(r0)     // Catch:{ RuntimeException -> 0x0324 }
            byte[] r1 = new byte[r12]     // Catch:{ RuntimeException -> 0x0324 }
            int r0 = r6.read(r1)     // Catch:{ RuntimeException -> 0x0324 }
            if (r0 != r12) goto L_0x030c
            int r11 = r11 + 6
            int r7 = r7 + -6
            byte[] r0 = A0Y     // Catch:{ RuntimeException -> 0x0324 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ RuntimeException -> 0x0324 }
            if (r0 == 0) goto L_0x0304
            byte[] r1 = new byte[r7]     // Catch:{ RuntimeException -> 0x0324 }
            int r0 = r6.read(r1)     // Catch:{ RuntimeException -> 0x0324 }
            if (r0 != r7) goto L_0x031c
            r5.A01 = r11     // Catch:{ RuntimeException -> 0x0324 }
            X.0Eo r0 = new X.0Eo     // Catch:{ RuntimeException -> 0x0324 }
            r0.<init>((byte[]) r1)     // Catch:{ RuntimeException -> 0x0324 }
            r5.A0G(r0)     // Catch:{ RuntimeException -> 0x0324 }
            r5.A0M(r0, r10)     // Catch:{ RuntimeException -> 0x0324 }
        L_0x02d5:
            boolean r0 = A0T     // Catch:{ RuntimeException -> 0x0324 }
            if (r0 == 0) goto L_0x02ff
            java.lang.String r7 = "ExifInterface"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0324 }
            r1.<init>()     // Catch:{ RuntimeException -> 0x0324 }
            java.lang.String r0 = "Heif meta: "
            r1.append(r0)     // Catch:{ RuntimeException -> 0x0324 }
            r1.append(r9)     // Catch:{ RuntimeException -> 0x0324 }
            java.lang.String r0 = "x"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x0324 }
            r1.append(r3)     // Catch:{ RuntimeException -> 0x0324 }
            java.lang.String r0 = ", rotation "
            r1.append(r0)     // Catch:{ RuntimeException -> 0x0324 }
            r1.append(r8)     // Catch:{ RuntimeException -> 0x0324 }
            java.lang.String r0 = r1.toString()     // Catch:{ RuntimeException -> 0x0324 }
            android.util.Log.d(r7, r0)     // Catch:{ RuntimeException -> 0x0324 }
        L_0x02ff:
            r2.release()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0477
        L_0x0304:
            java.lang.String r0 = "Invalid identifier"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0324 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0324 }
            goto L_0x0323
        L_0x030c:
            java.lang.String r0 = "Can't read identifier"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0324 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0324 }
            goto L_0x0323
        L_0x0314:
            java.lang.String r0 = "Invalid exif length"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0324 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0324 }
            goto L_0x0323
        L_0x031c:
            java.lang.String r0 = "Can't read exif"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0324 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0324 }
        L_0x0323:
            throw r1     // Catch:{ RuntimeException -> 0x0324 }
        L_0x0324:
            java.lang.String r1 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x032c }
            r0.<init>(r1)     // Catch:{ all -> 0x032c }
            throw r0     // Catch:{ all -> 0x032c }
        L_0x032c:
            r1 = move-exception
            r2.release()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0705
        L_0x0332:
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0705
        L_0x033b:
            r3 = 7
            if (r1 != r3) goto L_0x03fb
            r5.A0L(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.util.HashMap[] r7 = r5.A0H     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r8 = 1
            r1 = r7[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "MakerNote"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            X.0Ww r0 = (X.C06590Ww) r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 == 0) goto L_0x0477
            byte[] r0 = r0.A03     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            X.0Eo r2 = new X.0Eo     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r2.<init>((byte[]) r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.nio.ByteOrder r0 = r5.A0A     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r2.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte[] r11 = A0b     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r11.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte[] r10 = new byte[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r2.readFully(r10)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0 = 0
            r2.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte[] r9 = A0c     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r9.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte[] r1 = new byte[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r2.readFully(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            boolean r0 = java.util.Arrays.equals(r10, r11)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 == 0) goto L_0x0379
            r0 = 8
            goto L_0x0381
        L_0x0379:
            boolean r0 = java.util.Arrays.equals(r1, r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 == 0) goto L_0x0384
            r0 = 12
        L_0x0381:
            r2.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
        L_0x0384:
            r0 = 6
            r5.A0M(r2, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1 = r7[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "PreviewImageStart"
            java.lang.Object r9 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1 = r7[r3]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "PreviewImageLength"
            java.lang.Object r3 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r9 == 0) goto L_0x03ab
            if (r3 == 0) goto L_0x03ab
            r2 = 5
            r1 = r7[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "JPEGInterchangeFormat"
            r1.put(r0, r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1 = r7[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "JPEGInterchangeFormatLength"
            r1.put(r0, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
        L_0x03ab:
            r0 = 8
            r1 = r7[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "AspectFrame"
            java.lang.Object r1 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            X.0Ww r1 = (X.C06590Ww) r1     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r1 == 0) goto L_0x0477
            java.nio.ByteOrder r0 = r5.A0A     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.Object r10 = r1.A05(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int[] r10 = (int[]) r10     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r10 == 0) goto L_0x03e3
            int r1 = r10.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0 = 4
            if (r1 != r0) goto L_0x03e3
            r0 = 2
            r3 = r10[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r9 = 0
            r2 = r10[r9]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r3 <= r2) goto L_0x0477
            r0 = 3
            r1 = r10[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0 = r10[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r1 <= r0) goto L_0x0477
            int r3 = r3 - r2
            int r3 = r3 + 1
            int r1 = r1 - r0
            int r2 = r1 + 1
            if (r3 >= r2) goto L_0x0455
            int r3 = r3 + r2
            int r2 = r3 - r2
            int r3 = r3 - r2
            goto L_0x0455
        L_0x03e3:
            java.lang.String r0 = "Invalid aspect frame values. frame="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = java.util.Arrays.toString(r10)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1.append(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0477
        L_0x03fb:
            r0 = 10
            if (r1 != r0) goto L_0x0451
            boolean r0 = A0T     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 == 0) goto L_0x0416
            java.lang.String r1 = "getRw2Attributes starting with: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0.<init>(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0.append(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r1 = r0.toString()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
        L_0x0416:
            r5.A0L(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.util.HashMap[] r8 = r5.A0H     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r9 = 0
            r1 = r8[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "JpgFromRaw"
            java.lang.Object r1 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            X.0Ww r1 = (X.C06590Ww) r1     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r1 == 0) goto L_0x0436
            byte[] r0 = r1.A03     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            X.0JA r7 = new X.0JA     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r7.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            long r2 = r1.A02     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r1 = (int) r2     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0 = 5
            r5.A0I(r7, r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
        L_0x0436:
            r1 = r8[r9]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "ISO"
            java.lang.Object r3 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r2 = 1
            r0 = r8[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r1 = "PhotographicSensitivity"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r3 == 0) goto L_0x0477
            if (r0 != 0) goto L_0x0477
            r0 = r8[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0.put(r1, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0477
        L_0x0451:
            r5.A0L(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0477
        L_0x0455:
            java.nio.ByteOrder r1 = r5.A0A     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int[] r0 = new int[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0[r9] = r3     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            X.0Ww r3 = X.C06590Ww.A01(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.nio.ByteOrder r1 = r5.A0A     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int[] r0 = new int[r8]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0[r9] = r2     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            X.0Ww r2 = X.C06590Ww.A01(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1 = r7[r9]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "ImageWidth"
            r1.put(r0, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1 = r7[r9]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "ImageLength"
            r1.put(r0, r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
        L_0x0477:
            int r0 = r5.A01     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            long r0 = (long) r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r6.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r5.A0H(r6)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0718
        L_0x0482:
            X.0JA r8 = new X.0JA     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r8.<init>(r10, r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r1 = r5.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r9 = 4
            if (r1 != r9) goto L_0x0491
            r5.A0I(r8, r2, r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0718
        L_0x0491:
            r0 = 13
            if (r1 != r0) goto L_0x0578
            boolean r0 = A0T     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 == 0) goto L_0x04ac
            java.lang.String r1 = "getPngAttributes starting with: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0.<init>(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0.append(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r1 = r0.toString()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
        L_0x04ac:
            r8.A01 = r7     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte[] r0 = A0g     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r10 = r0.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r8.A00(r10)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
        L_0x04b4:
            int r1 = r8.readInt()     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            int r3 = r10 + 4
            byte[] r2 = new byte[r9]     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r8.read(r2)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 != r9) goto L_0x0567
            int r10 = r3 + 4
            r0 = 16
            if (r10 != r0) goto L_0x04d9
            byte[] r0 = A0f     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 != 0) goto L_0x04d9
            java.lang.String r0 = "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>(r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x056e
        L_0x04d9:
            byte[] r0 = A0e     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 != 0) goto L_0x0718
            byte[] r0 = A0d     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 == 0) goto L_0x0522
            byte[] r7 = new byte[r1]     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r8.read(r7)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 != r1) goto L_0x054c
            int r6 = r8.readInt()     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r3.<init>()     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r3.update(r2)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r3.update(r7)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            long r1 = r3.getValue()     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = (int) r1     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 != r6) goto L_0x0529
            r5.A01 = r10     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r1 = 0
            X.0Eo r0 = new X.0Eo     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r0.<init>((byte[]) r7)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r5.A0G(r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r5.A0M(r0, r1)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r5.A0D()     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            X.0JA r0 = new X.0JA     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r0.<init>(r7)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r5.A0H(r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0718
        L_0x0522:
            int r0 = r1 + 4
            r8.A00(r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            int r10 = r10 + r0
            goto L_0x04b4
        L_0x0529:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r2.<init>()     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "
            r2.append(r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r2.append(r6)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = ", calculated CRC value: "
            r2.append(r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            long r0 = r3.getValue()     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r2.append(r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r1 = r2.toString()     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r0.<init>(r1)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            throw r0     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
        L_0x054c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>()     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "Failed to read given length for given PNG chunk type: "
            r1.append(r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = A01(r2)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r1.append(r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = r1.toString()     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>(r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x056e
        L_0x0567:
            java.lang.String r0 = "Encountered invalid length while parsing PNG chunktype"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>(r0)     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
        L_0x056e:
            throw r1     // Catch:{ EOFException -> 0x056f, IOException | UnsupportedOperationException -> 0x0706 }
        L_0x056f:
            java.lang.String r0 = "Encountered corrupt PNG file."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0705
        L_0x0578:
            r0 = 9
            if (r1 != r0) goto L_0x0655
            boolean r11 = A0T     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r6 = "ExifInterface"
            if (r11 == 0) goto L_0x0593
            java.lang.String r1 = "getRafAttributes starting with: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0.<init>(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0.append(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            android.util.Log.d(r6, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
        L_0x0593:
            r0 = 84
            r8.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte[] r0 = new byte[r9]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte[] r1 = new byte[r9]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte[] r2 = new byte[r9]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r8.read(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r8.read(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r8.read(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r9 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r1 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r3 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte[] r2 = new byte[r1]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r8.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r9 - r0
            r8.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r8.read(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            X.0JA r1 = new X.0JA     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0 = 5
            r5.A0I(r1, r9, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r8.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r3 = r3 - r0
            r8.A00(r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r8.A01 = r7     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r7 = r8.readInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r11 == 0) goto L_0x05f3
            java.lang.String r1 = "numberOfDirectoryEntry: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0.<init>(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0.append(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            android.util.Log.d(r6, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
        L_0x05f3:
            r10 = 0
            r3 = 0
        L_0x05f5:
            if (r3 >= r7) goto L_0x0718
            int r2 = r8.readUnsignedShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r1 = r8.readUnsignedShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0 = 273(0x111, float:3.83E-43)
            if (r2 != r0) goto L_0x0632
            short r9 = r8.readShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            short r7 = r8.readShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.nio.ByteOrder r1 = r5.A0A     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0 = 1
            int[] r0 = new int[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0[r10] = r9     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            X.0Ww r8 = X.C06590Ww.A01(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.nio.ByteOrder r1 = r5.A0A     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0 = 1
            int[] r0 = new int[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0[r10] = r7     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            X.0Ww r3 = X.C06590Ww.A01(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.util.HashMap[] r2 = r5.A0H     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1 = r2[r10]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "ImageLength"
            r1.put(r0, r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1 = r2[r10]     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "ImageWidth"
            r1.put(r0, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0638
        L_0x0632:
            r8.A00(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r3 = r3 + 1
            goto L_0x05f5
        L_0x0638:
            if (r11 == 0) goto L_0x0718
            java.lang.String r0 = "Updated to length: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1.append(r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = ", width: "
            r1.append(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1.append(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            android.util.Log.d(r6, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0718
        L_0x0655:
            r0 = 14
            if (r1 != r0) goto L_0x0718
            boolean r0 = A0T     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 == 0) goto L_0x0670
            java.lang.String r1 = "getWebpAttributes starting with: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0.<init>(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r0.append(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r1 = r0.toString()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
        L_0x0670:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r8.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            byte[] r0 = A0n     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r0.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r8.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r8.readInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r2 = r0 + 8
            byte[] r0 = A0o     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r0.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r8.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            int r3 = r0 + 8
        L_0x0688:
            byte[] r7 = new byte[r9]     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r8.read(r7)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 != r9) goto L_0x06d7
            int r0 = r3 + 4
            int r6 = r8.readInt()     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            int r3 = r0 + 4
            byte[] r0 = A0j     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            boolean r0 = java.util.Arrays.equals(r0, r7)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 == 0) goto L_0x06bf
            byte[] r2 = new byte[r6]     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            int r0 = r8.read(r2)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            if (r0 != r6) goto L_0x06df
            r5.A01 = r3     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            r1 = 0
            X.0Eo r0 = new X.0Eo     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            r0.<init>((byte[]) r2)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            r5.A0G(r0)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            r5.A0M(r0, r1)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            X.0JA r0 = new X.0JA     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            r0.<init>(r2)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            r5.A0H(r0)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0718
        L_0x06bf:
            int r1 = r6 % 2
            r0 = 1
            if (r1 != r0) goto L_0x06c6
            int r6 = r6 + 1
        L_0x06c6:
            int r3 = r3 + r6
            if (r3 == r2) goto L_0x0718
            if (r3 > r2) goto L_0x06cf
            r8.A00(r6)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0688
        L_0x06cf:
            java.lang.String r0 = "Encountered WebP file with invalid chunk size"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>(r0)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x06f9
        L_0x06d7:
            java.lang.String r0 = "Encountered invalid length while parsing WebP chunktype"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>(r0)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x06f9
        L_0x06df:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>()     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = "Failed to read given length for given PNG chunk type: "
            r1.append(r0)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = A01(r7)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            r1.append(r0)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            java.lang.String r0 = r1.toString()     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>(r0)     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
        L_0x06f9:
            throw r1     // Catch:{ EOFException -> 0x06fa, IOException | UnsupportedOperationException -> 0x0706 }
        L_0x06fa:
            java.lang.String r0 = "Encountered corrupt WebP file."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            r1.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
            goto L_0x0705
        L_0x0702:
            r9.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
        L_0x0705:
            throw r1     // Catch:{ IOException | UnsupportedOperationException -> 0x0706 }
        L_0x0706:
            r3 = move-exception
            boolean r2 = A0T     // Catch:{ all -> 0x0726 }
            if (r2 == 0) goto L_0x0712
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r0, r3)     // Catch:{ all -> 0x0726 }
        L_0x0712:
            r5.A0B()     // Catch:{ all -> 0x0734 }
            if (r2 == 0) goto L_0x0722
            goto L_0x071f
        L_0x0718:
            r5.A0B()     // Catch:{ all -> 0x0734 }
            boolean r0 = A0T     // Catch:{ all -> 0x0734 }
            if (r0 == 0) goto L_0x0722
        L_0x071f:
            r5.A0C()     // Catch:{ all -> 0x0734 }
        L_0x0722:
            A03(r4)
            return
        L_0x0726:
            r1 = move-exception
            r5.A0B()     // Catch:{ all -> 0x0734 }
            boolean r0 = A0T     // Catch:{ all -> 0x0734 }
            if (r0 == 0) goto L_0x0731
            r5.A0C()     // Catch:{ all -> 0x0734 }
        L_0x0731:
            throw r1     // Catch:{ all -> 0x0734 }
        L_0x0732:
            r1 = move-exception
            goto L_0x0736
        L_0x0734:
            r1 = move-exception
            r3 = r4
        L_0x0736:
            A03(r3)
            throw r1
        L_0x073a:
            java.lang.String r0 = "filename cannot be null"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007703o.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:63|64|65) */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        java.lang.Double.parseDouble(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0133, code lost:
        return new android.util.Pair(12, -1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0125 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A00(java.lang.String r13) {
        /*
            java.lang.String r1 = ","
            boolean r0 = r13.contains(r1)
            r9 = 0
            r6 = 1
            r8 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L_0x0095
            java.lang.String[] r7 = r13.split(r1, r4)
            r0 = r7[r9]
            android.util.Pair r2 = A00(r0)
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x0029
        L_0x0028:
            return r2
        L_0x0029:
            int r0 = r7.length
            if (r6 >= r0) goto L_0x0028
            r0 = r7[r6]
            android.util.Pair r9 = A00(r0)
            java.lang.Object r10 = r9.first
            java.lang.Object r0 = r2.first
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x008c
            java.lang.Object r1 = r9.second
            java.lang.Object r0 = r2.first
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008c
            r8 = -1
        L_0x0047:
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x008a
            java.lang.Object r0 = r2.second
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0063
            java.lang.Object r1 = r9.second
            java.lang.Object r0 = r2.second
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008a
        L_0x0063:
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L_0x006b:
            if (r8 != r4) goto L_0x0075
            if (r0 != r4) goto L_0x0075
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r5, r3)
            return r1
        L_0x0075:
            if (r8 != r4) goto L_0x0083
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x007b:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r0, r3)
        L_0x0080:
            int r6 = r6 + 1
            goto L_0x0029
        L_0x0083:
            if (r0 != r4) goto L_0x0080
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x007b
        L_0x008a:
            r0 = -1
            goto L_0x006b
        L_0x008c:
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            goto L_0x0047
        L_0x0095:
            java.lang.String r1 = "/"
            boolean r0 = r13.contains(r1)
            r11 = 0
            if (r0 == 0) goto L_0x00ec
            java.lang.String[] r2 = r13.split(r1, r4)
            int r0 = r2.length
            if (r0 != r8) goto L_0x0134
            r0 = r2[r9]     // Catch:{ NumberFormatException -> 0x0134 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0134 }
            long r7 = (long) r0     // Catch:{ NumberFormatException -> 0x0134 }
            r0 = r2[r6]     // Catch:{ NumberFormatException -> 0x0134 }
            double r9 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0134 }
            long r1 = (long) r9     // Catch:{ NumberFormatException -> 0x0134 }
            r6 = 10
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00e2
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00e2
            r4 = 5
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00d8
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00d8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0134 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0134 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0134 }
            r2.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x0134 }
            return r2
        L_0x00d8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0134 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0134 }
            r1.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x0134 }
            return r1
        L_0x00e2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0134 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0134 }
            r2.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x0134 }
            return r2
        L_0x00ec:
            long r6 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x0125 }
            r4 = 4
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x010b
            r1 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x010b
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0125 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0125 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0125 }
            r2.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x0125 }
            return r2
        L_0x010b:
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x011b
            r0 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0125 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0125 }
            r2.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x0125 }
            return r2
        L_0x011b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0125 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0125 }
            r2.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x0125 }
            return r2
        L_0x0125:
            java.lang.Double.parseDouble(r13)     // Catch:{ NumberFormatException -> 0x0134 }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0134 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0134 }
            r1.<init>(r0, r3)     // Catch:{ NumberFormatException -> 0x0134 }
            return r1
        L_0x0134:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r5, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007703o.A00(java.lang.String):android.util.Pair");
    }

    public static String A01(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i2])}));
        }
        return sb.toString();
    }

    public static final ByteOrder A02(AnonymousClass0JA r2) {
        short readShort = r2.readShort();
        if (readShort == 18761) {
            if (A0T) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (A0T) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(Integer.toHexString(readShort));
            throw new IOException(sb.toString());
        }
    }

    public static void A03(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void A04(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                AnonymousClass0VU.A01(fileDescriptor);
            } catch (Exception unused) {
                Log.e("ExifInterfaceUtils", "Error closing fd.");
            }
        } else {
            Log.e("ExifInterfaceUtils", "closeFileDescriptor is called in API < 21, which must be wrong.");
        }
    }

    public static void A05(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void A06(InputStream inputStream, OutputStream outputStream, int i2) {
        byte[] bArr = new byte[8192];
        while (i2 > 0) {
            int min = Math.min(i2, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i2 -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    public int A07(int i2) {
        C06590Ww A082 = A08("Orientation");
        if (A082 == null) {
            return i2;
        }
        try {
            return A082.A04(this.A0A);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public final C06590Ww A08(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (A0T) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < A16.length; i2++) {
            C06590Ww r0 = (C06590Ww) this.A0H[i2].get(str);
            if (r0 != null) {
                return r0;
            }
        }
        return null;
    }

    public String A09(String str) {
        NumberFormatException numberFormatException;
        double d2;
        String obj;
        C06590Ww A082 = A08(str);
        if (A082 != null) {
            if (!A0M.contains(str)) {
                return A082.A06(this.A0A);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = A082.A00;
                if (i2 == 5 || i2 == 10) {
                    AnonymousClass0PQ[] r6 = (AnonymousClass0PQ[]) A082.A05(this.A0A);
                    if (r6 == null || r6.length != 3) {
                        StringBuilder sb = new StringBuilder("Invalid GPS Timestamp array. array=");
                        sb.append(Arrays.toString(r6));
                        obj = sb.toString();
                    } else {
                        AnonymousClass0PQ r2 = r6[0];
                        AnonymousClass0PQ r22 = r6[1];
                        AnonymousClass0PQ r23 = r6[2];
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) r2.A01) / ((float) r2.A00))), Integer.valueOf((int) (((float) r22.A01) / ((float) r22.A00))), Integer.valueOf((int) (((float) r23.A01) / ((float) r23.A00)))});
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("GPS Timestamp format is not rational. format=");
                    sb2.append(i2);
                    obj = sb2.toString();
                }
                Log.w("ExifInterface", obj);
                return null;
            }
            try {
                Object A052 = A082.A05(this.A0A);
                if (A052 != null) {
                    if (A052 instanceof String) {
                        d2 = Double.parseDouble((String) A052);
                    } else if (A052 instanceof long[]) {
                        long[] jArr = (long[]) A052;
                        if (jArr.length == 1) {
                            d2 = (double) jArr[0];
                        } else {
                            numberFormatException = new NumberFormatException("There are more than one component");
                        }
                    } else if (A052 instanceof int[]) {
                        int[] iArr = (int[]) A052;
                        if (iArr.length == 1) {
                            d2 = (double) iArr[0];
                        } else {
                            numberFormatException = new NumberFormatException("There are more than one component");
                        }
                    } else if (A052 instanceof double[]) {
                        double[] dArr = (double[]) A052;
                        if (dArr.length == 1) {
                            d2 = dArr[0];
                        } else {
                            numberFormatException = new NumberFormatException("There are more than one component");
                        }
                    } else if (A052 instanceof AnonymousClass0PQ[]) {
                        AnonymousClass0PQ[] r4 = (AnonymousClass0PQ[]) A052;
                        if (r4.length == 1) {
                            AnonymousClass0PQ r24 = r4[0];
                            d2 = ((double) r24.A01) / ((double) r24.A00);
                        } else {
                            numberFormatException = new NumberFormatException("There are more than one component");
                        }
                    } else {
                        numberFormatException = new NumberFormatException("Couldn't find a double value");
                    }
                    return Double.toString(d2);
                }
                numberFormatException = new NumberFormatException("NULL can't be converted to a double value");
                throw numberFormatException;
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v12, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v13, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r0v24, types: [java.io.OutputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04ce, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04cf, code lost:
        r2 = null;
        r1 = null;
        r26 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04d5, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04d6, code lost:
        r2 = null;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04d9, code lost:
        r22 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04e8, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 21) goto L_0x04ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04ea, code lost:
        r0 = r27;
        X.AnonymousClass0VU.A02(r0, android.system.OsConstants.SEEK_SET, 0);
        r4 = new java.io.FileOutputStream(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04f9, code lost:
        r4 = new java.io.FileOutputStream(r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0515, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0516, code lost:
        r26 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0519, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x054a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x054b, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0555, code lost:
        r24.delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x04e4 A[SYNTHETIC, Splitter:B:244:0x04e4] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x04f9 A[Catch:{ Exception -> 0x0519, all -> 0x0515 }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x054a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:46:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0555  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:218:0x0493=Splitter:B:218:0x0493, B:135:0x028a=Splitter:B:135:0x028a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r29 = this;
            r4 = r29
            int r1 = r4.A00
            r0 = 4
            if (r1 == r0) goto L_0x001c
            r0 = 13
            if (r1 == r0) goto L_0x001c
            r0 = 14
            if (r1 == r0) goto L_0x001c
            r0 = 3
            if (r1 == r0) goto L_0x001c
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = "ExifInterface only supports saving attributes for JPEG, PNG, WebP, and DNG formats."
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x001c:
            java.io.FileDescriptor r0 = r4.A08
            r27 = r0
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = r4.A09
            if (r0 != 0) goto L_0x002e
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x002e:
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x0042
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x0042
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x0042
            java.lang.String r1 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0042:
            r5 = 1
            int r1 = r4.A05
            r0 = 6
            if (r1 == r0) goto L_0x0051
            r0 = 7
            if (r1 == r0) goto L_0x0051
            r0 = 0
        L_0x004c:
            r4.A0G = r0
            r26 = 0
            goto L_0x0056
        L_0x0051:
            byte[] r0 = r4.A0R()
            goto L_0x004c
        L_0x0056:
            java.lang.String r1 = "temp"
            java.lang.String r0 = "tmp"
            java.io.File r24 = java.io.File.createTempFile(r1, r0)     // Catch:{ Exception -> 0x0567, all -> 0x0563 }
            java.lang.String r0 = r4.A09     // Catch:{ Exception -> 0x0567, all -> 0x0563 }
            r25 = r0
            if (r0 == 0) goto L_0x006a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0567, all -> 0x0563 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0567, all -> 0x0563 }
            goto L_0x0081
        L_0x006a:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0567, all -> 0x0563 }
            r0 = 21
            if (r1 < r0) goto L_0x007f
            int r3 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0567, all -> 0x0563 }
            r1 = 0
            r0 = r27
            X.AnonymousClass0VU.A02(r0, r3, r1)     // Catch:{ Exception -> 0x0567, all -> 0x0563 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0567, all -> 0x0563 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0567, all -> 0x0563 }
            goto L_0x0081
        L_0x007f:
            r1 = r26
        L_0x0081:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x055d, all -> 0x0574 }
            r0 = r24
            r3.<init>(r0)     // Catch:{ Exception -> 0x055d, all -> 0x0574 }
            A05(r1, r3)     // Catch:{ Exception -> 0x055b, all -> 0x0559 }
            A03(r1)
            A03(r3)
            r3 = 0
            java.io.FileInputStream r23 = new java.io.FileInputStream     // Catch:{ Exception -> 0x04d5, all -> 0x054a }
            r1 = r23
            r1.<init>(r0)     // Catch:{ Exception -> 0x04d5, all -> 0x054a }
            if (r25 == 0) goto L_0x00a5
            java.io.FileOutputStream r22 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x04ce, all -> 0x054a }
            r1 = r22
            r0 = r25
            r1.<init>(r0)     // Catch:{ Exception -> 0x04ce, all -> 0x054a }
            goto L_0x00be
        L_0x00a5:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x04ce, all -> 0x054a }
            r0 = 21
            if (r1 < r0) goto L_0x00bc
            int r6 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x04ce, all -> 0x054a }
            r1 = 0
            r0 = r27
            X.AnonymousClass0VU.A02(r0, r6, r1)     // Catch:{ Exception -> 0x04ce, all -> 0x054a }
            java.io.FileOutputStream r22 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x04ce, all -> 0x054a }
            r1 = r22
            r1.<init>(r0)     // Catch:{ Exception -> 0x04ce, all -> 0x054a }
            goto L_0x00be
        L_0x00bc:
            r22 = r26
        L_0x00be:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x04c7, all -> 0x054a }
            r0 = r23
            r2.<init>(r0)     // Catch:{ Exception -> 0x04c7, all -> 0x054a }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x04bf, all -> 0x04ba }
            r0 = r22
            r1.<init>(r0)     // Catch:{ Exception -> 0x04bf, all -> 0x04ba }
            int r6 = r4.A00     // Catch:{ Exception -> 0x04c3 }
            r0 = 4
            if (r6 != r0) goto L_0x01f4
            boolean r0 = A0T     // Catch:{ Exception -> 0x04c3 }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "saveJpegAttributes starting with (inputStream: "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04c3 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x04c3 }
            r5.append(r2)     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r0 = ", outputStream: "
            r5.append(r0)     // Catch:{ Exception -> 0x04c3 }
            r5.append(r1)     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r5)     // Catch:{ Exception -> 0x04c3 }
        L_0x00f5:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x04c3 }
            X.0JA r13 = new X.0JA     // Catch:{ Exception -> 0x04c3 }
            r13.<init>(r2, r0)     // Catch:{ Exception -> 0x04c3 }
            X.0J7 r12 = new X.0J7     // Catch:{ Exception -> 0x04c3 }
            r12.<init>(r1, r0)     // Catch:{ Exception -> 0x04c3 }
            byte r0 = r13.readByte()     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r11 = "Invalid marker"
            r10 = -1
            if (r0 != r10) goto L_0x01e8
            java.io.OutputStream r9 = r12.A01     // Catch:{ Exception -> 0x04c3 }
            r9.write(r10)     // Catch:{ Exception -> 0x04c3 }
            byte r5 = r13.readByte()     // Catch:{ Exception -> 0x04c3 }
            r0 = -40
            if (r5 != r0) goto L_0x01e2
            r9.write(r0)     // Catch:{ Exception -> 0x04c3 }
            r6 = 0
            java.lang.String r5 = "Xmp"
            java.lang.String r0 = r4.A09(r5)     // Catch:{ Exception -> 0x04c3 }
            if (r0 == 0) goto L_0x012f
            boolean r0 = r4.A0F     // Catch:{ Exception -> 0x04c3 }
            if (r0 == 0) goto L_0x012f
            java.util.HashMap[] r0 = r4.A0H     // Catch:{ Exception -> 0x04c3 }
            r0 = r0[r3]     // Catch:{ Exception -> 0x04c3 }
            java.lang.Object r6 = r0.remove(r5)     // Catch:{ Exception -> 0x04c3 }
        L_0x012f:
            r9.write(r10)     // Catch:{ Exception -> 0x04c3 }
            r8 = -31
            r9.write(r8)     // Catch:{ Exception -> 0x04c3 }
            r4.A0K(r12)     // Catch:{ Exception -> 0x04c3 }
            if (r6 == 0) goto L_0x0143
            java.util.HashMap[] r0 = r4.A0H     // Catch:{ Exception -> 0x04c3 }
            r0 = r0[r3]     // Catch:{ Exception -> 0x04c3 }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x04c3 }
        L_0x0143:
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r7]     // Catch:{ Exception -> 0x04c3 }
        L_0x0147:
            byte r0 = r13.readByte()     // Catch:{ Exception -> 0x04c3 }
            if (r0 != r10) goto L_0x01ee
            byte r5 = r13.readByte()     // Catch:{ Exception -> 0x04c3 }
            r0 = -39
            if (r5 == r0) goto L_0x01d7
            r0 = -38
            if (r5 == r0) goto L_0x01d7
            java.lang.String r14 = "Invalid length"
            if (r5 == r8) goto L_0x0182
            r9.write(r10)     // Catch:{ Exception -> 0x04c3 }
            r9.write(r5)     // Catch:{ Exception -> 0x04c3 }
            int r5 = r13.readUnsignedShort()     // Catch:{ Exception -> 0x04c3 }
            short r0 = (short) r5     // Catch:{ Exception -> 0x04c3 }
            r12.A01(r0)     // Catch:{ Exception -> 0x04c3 }
            int r5 = r5 + -2
            if (r5 >= 0) goto L_0x0171
            goto L_0x0497
        L_0x0171:
            if (r5 <= 0) goto L_0x0147
            int r0 = java.lang.Math.min(r5, r7)     // Catch:{ Exception -> 0x04c3 }
            int r0 = r13.read(r6, r3, r0)     // Catch:{ Exception -> 0x04c3 }
            if (r0 < 0) goto L_0x0147
            r12.write(r6, r3, r0)     // Catch:{ Exception -> 0x04c3 }
            int r5 = r5 - r0
            goto L_0x0171
        L_0x0182:
            int r0 = r13.readUnsignedShort()     // Catch:{ Exception -> 0x04c3 }
            int r5 = r0 + -2
            if (r5 < 0) goto L_0x01d0
            r15 = 6
            byte[] r14 = new byte[r15]     // Catch:{ Exception -> 0x04c3 }
            if (r5 < r15) goto L_0x01a3
            int r0 = r13.read(r14)     // Catch:{ Exception -> 0x04c3 }
            if (r0 != r15) goto L_0x01c7
            byte[] r0 = A0Y     // Catch:{ Exception -> 0x04c3 }
            boolean r0 = java.util.Arrays.equals(r14, r0)     // Catch:{ Exception -> 0x04c3 }
            if (r0 == 0) goto L_0x01a3
            int r0 = r5 + -6
            r13.A00(r0)     // Catch:{ Exception -> 0x04c3 }
            goto L_0x0147
        L_0x01a3:
            r9.write(r10)     // Catch:{ Exception -> 0x04c3 }
            r9.write(r8)     // Catch:{ Exception -> 0x04c3 }
            int r0 = r5 + 2
            short r0 = (short) r0     // Catch:{ Exception -> 0x04c3 }
            r12.A01(r0)     // Catch:{ Exception -> 0x04c3 }
            if (r5 < r15) goto L_0x01b6
            int r5 = r5 + -6
            r12.write(r14)     // Catch:{ Exception -> 0x04c3 }
        L_0x01b6:
            if (r5 <= 0) goto L_0x0147
            int r0 = java.lang.Math.min(r5, r7)     // Catch:{ Exception -> 0x04c3 }
            int r0 = r13.read(r6, r3, r0)     // Catch:{ Exception -> 0x04c3 }
            if (r0 < 0) goto L_0x0147
            r12.write(r6, r3, r0)     // Catch:{ Exception -> 0x04c3 }
            int r5 = r5 - r0
            goto L_0x01b6
        L_0x01c7:
            java.lang.String r0 = "Invalid exif"
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x04c3 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x04c3 }
            goto L_0x049c
        L_0x01d0:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x04c3 }
            r4.<init>(r14)     // Catch:{ Exception -> 0x04c3 }
            goto L_0x049c
        L_0x01d7:
            r9.write(r10)     // Catch:{ Exception -> 0x04c3 }
            r9.write(r5)     // Catch:{ Exception -> 0x04c3 }
            A05(r13, r12)     // Catch:{ Exception -> 0x04c3 }
            goto L_0x04ac
        L_0x01e2:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x04c3 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x04c3 }
            goto L_0x01f3
        L_0x01e8:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x04c3 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x04c3 }
            goto L_0x01f3
        L_0x01ee:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x04c3 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x04c3 }
        L_0x01f3:
            throw r0     // Catch:{ Exception -> 0x04c3 }
        L_0x01f4:
            r0 = 13
            if (r6 != r0) goto L_0x028f
            boolean r0 = A0T     // Catch:{ Exception -> 0x04c3 }
            if (r0 == 0) goto L_0x021c
            java.lang.String r0 = "savePngAttributes starting with (inputStream: "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04c3 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x04c3 }
            r5.append(r2)     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r0 = ", outputStream: "
            r5.append(r0)     // Catch:{ Exception -> 0x04c3 }
            r5.append(r1)     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r5)     // Catch:{ Exception -> 0x04c3 }
        L_0x021c:
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x04c3 }
            X.0JA r9 = new X.0JA     // Catch:{ Exception -> 0x04c3 }
            r9.<init>(r2, r5)     // Catch:{ Exception -> 0x04c3 }
            X.0J7 r8 = new X.0J7     // Catch:{ Exception -> 0x04c3 }
            r8.<init>(r1, r5)     // Catch:{ Exception -> 0x04c3 }
            byte[] r0 = A0g     // Catch:{ Exception -> 0x04c3 }
            int r6 = r0.length     // Catch:{ Exception -> 0x04c3 }
            A06(r9, r8, r6)     // Catch:{ Exception -> 0x04c3 }
            int r0 = r4.A01     // Catch:{ Exception -> 0x04c3 }
            r10 = 4
            if (r0 != 0) goto L_0x0242
            int r0 = r9.readInt()     // Catch:{ Exception -> 0x04c3 }
            r8.A00(r0)     // Catch:{ Exception -> 0x04c3 }
            int r0 = r0 + 4
            int r0 = r0 + 4
            A06(r9, r8, r0)     // Catch:{ Exception -> 0x04c3 }
            goto L_0x0253
        L_0x0242:
            int r0 = r0 - r6
            int r0 = r0 - r10
            int r0 = r0 - r10
            A06(r9, r8, r0)     // Catch:{ Exception -> 0x04c3 }
            int r0 = r9.readInt()     // Catch:{ Exception -> 0x04c3 }
            int r0 = r0 + 4
            int r0 = r0 + 4
            r9.A00(r0)     // Catch:{ Exception -> 0x04c3 }
        L_0x0253:
            r0 = 0
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0289 }
            r7.<init>()     // Catch:{ all -> 0x0289 }
            X.0J7 r0 = new X.0J7     // Catch:{ all -> 0x0286 }
            r0.<init>(r7, r5)     // Catch:{ all -> 0x0286 }
            r4.A0K(r0)     // Catch:{ all -> 0x0286 }
            java.io.OutputStream r0 = r0.A01     // Catch:{ all -> 0x0286 }
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0     // Catch:{ all -> 0x0286 }
            byte[] r6 = r0.toByteArray()     // Catch:{ all -> 0x0286 }
            r8.write(r6)     // Catch:{ all -> 0x0286 }
            java.util.zip.CRC32 r5 = new java.util.zip.CRC32     // Catch:{ all -> 0x0286 }
            r5.<init>()     // Catch:{ all -> 0x0286 }
            int r0 = r6.length     // Catch:{ all -> 0x0286 }
            int r0 = r0 - r10
            r5.update(r6, r10, r0)     // Catch:{ all -> 0x0286 }
            long r5 = r5.getValue()     // Catch:{ all -> 0x0286 }
            int r0 = (int) r5     // Catch:{ all -> 0x0286 }
            r8.A00(r0)     // Catch:{ all -> 0x0286 }
            A03(r7)     // Catch:{ Exception -> 0x04c3 }
            A05(r9, r8)     // Catch:{ Exception -> 0x04c3 }
            goto L_0x04ac
        L_0x0286:
            r4 = move-exception
            r0 = r7
            goto L_0x028a
        L_0x0289:
            r4 = move-exception
        L_0x028a:
            A03(r0)     // Catch:{ Exception -> 0x04c3 }
            goto L_0x049c
        L_0x028f:
            r0 = 14
            if (r6 != r0) goto L_0x049d
            boolean r0 = A0T     // Catch:{ Exception -> 0x04c3 }
            if (r0 == 0) goto L_0x02b7
            java.lang.String r0 = "saveWebpAttributes starting with (inputStream: "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04c3 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x04c3 }
            r6.append(r2)     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r0 = ", outputStream: "
            r6.append(r0)     // Catch:{ Exception -> 0x04c3 }
            r6.append(r1)     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r0 = ")"
            r6.append(r0)     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r6)     // Catch:{ Exception -> 0x04c3 }
        L_0x02b7:
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x04c3 }
            X.0JA r7 = new X.0JA     // Catch:{ Exception -> 0x04c3 }
            r7.<init>(r2, r9)     // Catch:{ Exception -> 0x04c3 }
            X.0J7 r6 = new X.0J7     // Catch:{ Exception -> 0x04c3 }
            r6.<init>(r1, r9)     // Catch:{ Exception -> 0x04c3 }
            byte[] r0 = A0n     // Catch:{ Exception -> 0x04c3 }
            int r10 = r0.length     // Catch:{ Exception -> 0x04c3 }
            A06(r7, r6, r10)     // Catch:{ Exception -> 0x04c3 }
            byte[] r21 = A0o     // Catch:{ Exception -> 0x04c3 }
            r0 = r21
            int r0 = r0.length     // Catch:{ Exception -> 0x04c3 }
            r20 = r0
            r11 = 4
            int r0 = r0 + 4
            r7.A00(r0)     // Catch:{ Exception -> 0x04c3 }
            r8 = 0
            java.io.ByteArrayOutputStream r19 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0489 }
            r19.<init>()     // Catch:{ Exception -> 0x0489 }
            X.0J7 r8 = new X.0J7     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r0 = r19
            r8.<init>(r0, r9)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r9 = r4.A01     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            if (r9 == 0) goto L_0x0316
            int r0 = r10 + 4
            int r0 = r0 + r20
            int r9 = r9 - r0
            int r9 = r9 - r11
            int r9 = r9 - r11
            A06(r7, r8, r9)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r7.A00(r11)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r0 = r7.readInt()     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r7.A00(r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
        L_0x02fb:
            r4.A0K(r8)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
        L_0x02fe:
            A05(r7, r8)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r0 = r19.size()     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r0 = r0 + r20
            r6.A00(r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r0 = r21
            r6.write(r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r0 = r19
            r0.writeTo(r6)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            goto L_0x0465
        L_0x0316:
            byte[] r10 = new byte[r11]     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r0 = r7.read(r10)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            if (r0 != r11) goto L_0x0471
            byte[] r13 = A0m     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            boolean r0 = java.util.Arrays.equals(r10, r13)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r12 = 8
            r14 = 1
            if (r0 == 0) goto L_0x0381
            int r10 = r7.readInt()     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r9 = r10 % 2
            r0 = r10
            if (r9 != r5) goto L_0x0334
            int r0 = r10 + 1
        L_0x0334:
            byte[] r9 = new byte[r0]     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r7.read(r9)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            byte r0 = r9[r3]     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r12 = r12 | r0
            byte r0 = (byte) r12     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r9[r3] = r0     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r0 = r0 >> r5
            r0 = r0 & 1
            if (r0 == r5) goto L_0x0345
            r14 = 0
        L_0x0345:
            r8.write(r13)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r8.A00(r10)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r8.write(r9)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            if (r14 == 0) goto L_0x0378
            byte[] r9 = A0h     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r0 = r26
            r4.A0J(r7, r8, r9, r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
        L_0x0357:
            byte[] r10 = new byte[r11]     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r2.read(r10)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            byte[] r0 = A0i     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            boolean r0 = java.util.Arrays.equals(r10, r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            if (r0 == 0) goto L_0x02fb
            int r9 = r7.readInt()     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r8.write(r10)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r8.A00(r9)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r0 = r9 % 2
            if (r0 != r5) goto L_0x0374
            int r9 = r9 + 1
        L_0x0374:
            A06(r7, r8, r9)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            goto L_0x0357
        L_0x0378:
            byte[] r5 = A0k     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            byte[] r0 = A0l     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r4.A0J(r7, r8, r5, r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            goto L_0x02fb
        L_0x0381:
            byte[] r12 = A0k     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            boolean r0 = java.util.Arrays.equals(r10, r12)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            if (r0 != 0) goto L_0x0391
            byte[] r0 = A0l     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            boolean r0 = java.util.Arrays.equals(r10, r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            if (r0 == 0) goto L_0x02fe
        L_0x0391:
            int r11 = r7.readInt()     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r0 = r11 % 2
            r9 = r11
            if (r0 != r5) goto L_0x039c
            int r9 = r11 + 1
        L_0x039c:
            r14 = 3
            byte[] r0 = new byte[r14]     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r28 = r0
            boolean r0 = java.util.Arrays.equals(r10, r12)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r5 = 47
            if (r0 == 0) goto L_0x03ce
            r0 = r28
            r7.read(r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            byte[] r5 = new byte[r14]     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r0 = r7.read(r5)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            if (r0 != r14) goto L_0x0469
            byte[] r0 = A0p     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            boolean r0 = java.util.Arrays.equals(r0, r5)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            if (r0 == 0) goto L_0x0469
            int r5 = r7.readInt()     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r0 = r5 << 18
            int r18 = r0 >> 18
            int r0 = r5 << 2
            int r17 = r0 >> 18
            int r9 = r9 + -10
            goto L_0x0463
        L_0x03ce:
            byte[] r0 = A0l     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            boolean r0 = java.util.Arrays.equals(r10, r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            if (r0 == 0) goto L_0x045e
            byte r0 = r7.readByte()     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            if (r0 != r5) goto L_0x0479
            int r5 = r7.readInt()     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r0 = r5 << 18
            int r0 = r0 >> 18
            int r18 = r0 + 1
            int r0 = r5 << 4
            int r0 = r0 >> 18
            int r17 = r0 + 1
            r15 = r5 & 8
            int r9 = r9 + -5
        L_0x03f0:
            r8.write(r13)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r0 = 10
            r8.A00(r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            byte[] r14 = new byte[r0]     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            byte r0 = r14[r3]     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r0 = r0 | 8
            byte r13 = (byte) r0     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r14[r3] = r13     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r16 = 4
            int r0 = r15 << 4
            r13 = r13 | r0
            byte r0 = (byte) r13     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r14[r3] = r0     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r0 = r18 + -1
            int r15 = r17 + -1
            byte r13 = (byte) r0     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r14[r16] = r13     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r16 = 5
            int r13 = r0 >> 8
            byte r13 = (byte) r13     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r14[r16] = r13     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r13 = 6
            int r0 = r0 >> 16
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r14[r13] = r0     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r13 = 7
            byte r0 = (byte) r15     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r14[r13] = r0     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            int r0 = r15 >> 8
            byte r13 = (byte) r0     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r0 = 8
            r14[r0] = r13     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r13 = 9
            int r0 = r15 >> 16
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r14[r13] = r0     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r8.write(r14)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r8.write(r10)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r8.A00(r11)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            boolean r0 = java.util.Arrays.equals(r10, r12)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            if (r0 == 0) goto L_0x0450
            r0 = r28
            r8.write(r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            byte[] r0 = A0p     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r8.write(r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
        L_0x0448:
            r8.A00(r5)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
        L_0x044b:
            A06(r7, r8, r9)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            goto L_0x02fb
        L_0x0450:
            byte[] r0 = A0l     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            boolean r0 = java.util.Arrays.equals(r10, r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            if (r0 == 0) goto L_0x044b
            r0 = 47
            r8.write(r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            goto L_0x0448
        L_0x045e:
            r5 = 0
            r18 = 0
            r17 = 0
        L_0x0463:
            r15 = 0
            goto L_0x03f0
        L_0x0465:
            A03(r19)     // Catch:{ Exception -> 0x04c3 }
            goto L_0x04ac
        L_0x0469:
            java.lang.String r0 = "Encountered error while checking VP8 signature"
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            goto L_0x0480
        L_0x0471:
            java.lang.String r0 = "Encountered invalid length while parsing WebP chunk type"
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            goto L_0x0480
        L_0x0479:
            java.lang.String r0 = "Encountered error while checking VP8L signature"
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
        L_0x0480:
            throw r4     // Catch:{ Exception -> 0x0485, all -> 0x0481 }
        L_0x0481:
            r4 = move-exception
            r8 = r19
            goto L_0x0493
        L_0x0485:
            r5 = move-exception
            r8 = r19
            goto L_0x048a
        L_0x0489:
            r5 = move-exception
        L_0x048a:
            java.lang.String r4 = "Failed to save WebP file"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0492 }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x0492 }
            throw r0     // Catch:{ all -> 0x0492 }
        L_0x0492:
            r4 = move-exception
        L_0x0493:
            A03(r8)     // Catch:{ Exception -> 0x04c3 }
            goto L_0x049c
        L_0x0497:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x04c3 }
            r4.<init>(r14)     // Catch:{ Exception -> 0x04c3 }
        L_0x049c:
            throw r4     // Catch:{ Exception -> 0x04c3 }
        L_0x049d:
            r0 = 3
            if (r6 == r0) goto L_0x04a2
            if (r6 != 0) goto L_0x04ac
        L_0x04a2:
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x04c3 }
            X.0J7 r0 = new X.0J7     // Catch:{ Exception -> 0x04c3 }
            r0.<init>(r1, r5)     // Catch:{ Exception -> 0x04c3 }
            r4.A0K(r0)     // Catch:{ Exception -> 0x04c3 }
        L_0x04ac:
            A03(r2)
            A03(r1)
            r24.delete()
            r0 = r26
            r4.A0G = r0
            return
        L_0x04ba:
            r0 = move-exception
            r1 = r26
            goto L_0x0547
        L_0x04bf:
            r8 = move-exception
            r1 = r26
            goto L_0x04c4
        L_0x04c3:
            r8 = move-exception
        L_0x04c4:
            r26 = r23
            goto L_0x04db
        L_0x04c7:
            r8 = move-exception
            r1 = r26
            r26 = r23
            r2 = r1
            goto L_0x04db
        L_0x04ce:
            r8 = move-exception
            r2 = r26
            r1 = r2
            r26 = r23
            goto L_0x04d9
        L_0x04d5:
            r8 = move-exception
            r2 = r26
            r1 = r2
        L_0x04d9:
            r22 = r2
        L_0x04db:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x051d, all -> 0x051b }
            r0 = r24
            r6.<init>(r0)     // Catch:{ Exception -> 0x051d, all -> 0x051b }
            if (r25 != 0) goto L_0x04f9
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0519, all -> 0x0515 }
            r0 = 21
            if (r4 < r0) goto L_0x0502
            int r7 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0519, all -> 0x0515 }
            r4 = 0
            r0 = r27
            X.AnonymousClass0VU.A02(r0, r7, r4)     // Catch:{ Exception -> 0x0519, all -> 0x0515 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0519, all -> 0x0515 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0519, all -> 0x0515 }
            goto L_0x0500
        L_0x04f9:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0519, all -> 0x0515 }
            r0 = r25
            r4.<init>(r0)     // Catch:{ Exception -> 0x0519, all -> 0x0515 }
        L_0x0500:
            r22 = r4
        L_0x0502:
            r0 = r22
            A05(r6, r0)     // Catch:{ Exception -> 0x0519, all -> 0x0515 }
            A03(r6)     // Catch:{ all -> 0x0546 }
            A03(r22)     // Catch:{ all -> 0x0546 }
            java.lang.String r0 = "Failed to save new file"
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0546 }
            r4.<init>(r0, r8)     // Catch:{ all -> 0x0546 }
            goto L_0x0545
        L_0x0515:
            r4 = move-exception
            r26 = r6
            goto L_0x053f
        L_0x0519:
            r4 = move-exception
            goto L_0x0520
        L_0x051b:
            r4 = move-exception
            goto L_0x053f
        L_0x051d:
            r4 = move-exception
            r6 = r26
        L_0x0520:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x053b }
            r3.<init>()     // Catch:{ all -> 0x053b }
            java.lang.String r0 = "Failed to save new file. Original file is stored in "
            r3.append(r0)     // Catch:{ all -> 0x053b }
            java.lang.String r0 = r24.getAbsolutePath()     // Catch:{ all -> 0x053b }
            r3.append(r0)     // Catch:{ all -> 0x053b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x053b }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x053b }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x053b }
            throw r0     // Catch:{ all -> 0x053b }
        L_0x053b:
            r4 = move-exception
            r26 = r6
            r3 = 1
        L_0x053f:
            A03(r26)     // Catch:{ all -> 0x0546 }
            A03(r22)     // Catch:{ all -> 0x0546 }
        L_0x0545:
            throw r4     // Catch:{ all -> 0x0546 }
        L_0x0546:
            r0 = move-exception
        L_0x0547:
            r26 = r2
            goto L_0x054d
        L_0x054a:
            r0 = move-exception
            r1 = r26
        L_0x054d:
            A03(r26)
            A03(r1)
            if (r3 != 0) goto L_0x0558
            r24.delete()
        L_0x0558:
            throw r0
        L_0x0559:
            r0 = move-exception
            goto L_0x0577
        L_0x055b:
            r2 = move-exception
            goto L_0x0560
        L_0x055d:
            r2 = move-exception
            r3 = r26
        L_0x0560:
            r26 = r1
            goto L_0x056a
        L_0x0563:
            r0 = move-exception
            r3 = r26
            goto L_0x0579
        L_0x0567:
            r2 = move-exception
            r3 = r26
        L_0x056a:
            java.lang.String r1 = "Failed to copy original file to temp file"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0572 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0572 }
            throw r0     // Catch:{ all -> 0x0572 }
        L_0x0572:
            r0 = move-exception
            goto L_0x0579
        L_0x0574:
            r0 = move-exception
            r3 = r26
        L_0x0577:
            r26 = r1
        L_0x0579:
            A03(r26)
            A03(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007703o.A0A():void");
    }

    public final void A0B() {
        String A092 = A09("DateTimeOriginal");
        if (A092 != null && A09("DateTime") == null) {
            this.A0H[0].put("DateTime", C06590Ww.A00(A092));
        }
        if (A09("ImageWidth") == null) {
            this.A0H[0].put("ImageWidth", C06590Ww.A02(this.A0A, new long[]{0}));
        }
        if (A09("ImageLength") == null) {
            this.A0H[0].put("ImageLength", C06590Ww.A02(this.A0A, new long[]{0}));
        }
        if (A09("Orientation") == null) {
            this.A0H[0].put("Orientation", C06590Ww.A02(this.A0A, new long[]{0}));
        }
        if (A09("LightSource") == null) {
            this.A0H[1].put("LightSource", C06590Ww.A02(this.A0A, new long[]{0}));
        }
    }

    public final void A0C() {
        int i2 = 0;
        while (true) {
            HashMap[] hashMapArr = this.A0H;
            if (i2 < hashMapArr.length) {
                StringBuilder sb = new StringBuilder("The size of tag group[");
                sb.append(i2);
                sb.append("]: ");
                sb.append(hashMapArr[i2].size());
                Log.d("ExifInterface", sb.toString());
                for (Map.Entry entry : hashMapArr[i2].entrySet()) {
                    C06590Ww r2 = (C06590Ww) entry.getValue();
                    StringBuilder sb2 = new StringBuilder("tagName: ");
                    sb2.append((String) entry.getKey());
                    sb2.append(", tagType: ");
                    sb2.append(r2.toString());
                    sb2.append(", tagValue: '");
                    sb2.append(r2.A06(this.A0A));
                    sb2.append("'");
                    Log.d("ExifInterface", sb2.toString());
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void A0D() {
        A0E(0, 5);
        A0E(0, 4);
        A0E(5, 4);
        HashMap[] hashMapArr = this.A0H;
        Object obj = hashMapArr[1].get("PixelXDimension");
        Object obj2 = hashMapArr[1].get("PixelYDimension");
        if (!(obj == null || obj2 == null)) {
            hashMapArr[0].put("ImageWidth", obj);
            hashMapArr[0].put("ImageLength", obj2);
        }
        if (hashMapArr[4].isEmpty() && A0Q(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!A0Q(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        A0F(0, "ThumbnailOrientation", "Orientation");
        A0F(0, "ThumbnailImageLength", "ImageLength");
        A0F(0, "ThumbnailImageWidth", "ImageWidth");
        A0F(5, "ThumbnailOrientation", "Orientation");
        A0F(5, "ThumbnailImageLength", "ImageLength");
        A0F(5, "ThumbnailImageWidth", "ImageWidth");
        A0F(4, "Orientation", "ThumbnailOrientation");
        A0F(4, "ImageLength", "ThumbnailImageLength");
        A0F(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void A0E(int i2, int i3) {
        String str;
        HashMap[] hashMapArr = this.A0H;
        HashMap hashMap = hashMapArr[i2];
        if (!hashMap.isEmpty() && !hashMapArr[i3].isEmpty()) {
            C06590Ww r6 = (C06590Ww) hashMap.get("ImageLength");
            C06590Ww r2 = (C06590Ww) hashMapArr[i2].get("ImageWidth");
            C06590Ww r1 = (C06590Ww) hashMapArr[i3].get("ImageLength");
            C06590Ww r4 = (C06590Ww) hashMapArr[i3].get("ImageWidth");
            if (r6 == null || r2 == null) {
                if (A0T) {
                    str = "First image does not contain valid size information";
                } else {
                    return;
                }
            } else if (r1 != null && r4 != null) {
                int A042 = r6.A04(this.A0A);
                int A043 = r2.A04(this.A0A);
                int A044 = r1.A04(this.A0A);
                int A045 = r4.A04(this.A0A);
                if (A042 < A044 && A043 < A045) {
                    HashMap hashMap2 = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap2;
                    return;
                }
                return;
            } else if (A0T) {
                str = "Second image does not contain valid size information";
            } else {
                return;
            }
        } else if (A0T) {
            str = "Cannot perform swap since only one image data exists";
        } else {
            return;
        }
        Log.d("ExifInterface", str);
    }

    public final void A0F(int i2, String str, String str2) {
        HashMap[] hashMapArr = this.A0H;
        HashMap hashMap = hashMapArr[i2];
        if (!hashMap.isEmpty() && hashMap.get(str) != null) {
            HashMap hashMap2 = hashMapArr[i2];
            hashMap2.put(str2, hashMap2.get(str));
            hashMapArr[i2].remove(str);
        }
    }

    public final void A0G(AnonymousClass0JA r4) {
        ByteOrder A022 = A02(r4);
        this.A0A = A022;
        r4.A01 = A022;
        int readUnsignedShort = r4.readUnsignedShort();
        int i2 = this.A00;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = r4.readInt();
            if (readInt >= 8) {
                int i3 = readInt - 8;
                if (i3 > 0) {
                    r4.A00(i3);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Invalid first Ifd offset: ");
            sb.append(readInt);
            throw new IOException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Invalid start code: ");
        sb2.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(sb2.toString());
    }

    public final void A0H(AnonymousClass0JA r22) {
        String str;
        String str2;
        long[] jArr;
        long[] jArr2;
        String str3;
        int length;
        int length2;
        StringBuilder sb;
        C06590Ww r1;
        int A042;
        HashMap hashMap = this.A0H[4];
        C06590Ww r12 = (C06590Ww) hashMap.get("Compression");
        AnonymousClass0JA r11 = r22;
        if (r12 != null) {
            int A043 = r12.A04(this.A0A);
            this.A05 = A043;
            if (A043 != 1) {
                if (A043 != 6) {
                    if (A043 != 7) {
                        return;
                    }
                }
            }
            C06590Ww r13 = (C06590Ww) hashMap.get("BitsPerSample");
            if (r13 != null) {
                int[] iArr = (int[]) r13.A05(this.A0A);
                int[] iArr2 = A0r;
                if (Arrays.equals(iArr2, iArr) || (this.A00 == 3 && (r1 = (C06590Ww) hashMap.get("PhotometricInterpretation")) != null && ((A042 = r1.A04(this.A0A)) != 1 ? !(A042 != 6 || !Arrays.equals(iArr, iArr2)) : Arrays.equals(iArr, A0q)))) {
                    C06590Ww r14 = (C06590Ww) hashMap.get("StripOffsets");
                    C06590Ww r5 = (C06590Ww) hashMap.get("StripByteCounts");
                    if (r14 != null && r5 != null) {
                        Object A052 = r14.A05(this.A0A);
                        if (A052 instanceof int[]) {
                            int[] iArr3 = (int[]) A052;
                            int length3 = iArr3.length;
                            jArr = new long[length3];
                            for (int i2 = 0; i2 < length3; i2++) {
                                jArr[i2] = (long) iArr3[i2];
                            }
                        } else {
                            jArr = A052 instanceof long[] ? (long[]) A052 : null;
                        }
                        Object A053 = r5.A05(this.A0A);
                        if (A053 instanceof int[]) {
                            int[] iArr4 = (int[]) A053;
                            int length4 = iArr4.length;
                            jArr2 = new long[length4];
                            for (int i3 = 0; i3 < length4; i3++) {
                                jArr2[i3] = (long) iArr4[i3];
                            }
                        } else {
                            jArr2 = A053 instanceof long[] ? (long[]) A053 : null;
                        }
                        str = "ExifInterface";
                        if (jArr == null || (length = jArr.length) == 0) {
                            str3 = "stripOffsets should not be null or have zero length.";
                        } else if (jArr2 == null || (length2 = jArr2.length) == 0) {
                            str3 = "stripByteCounts should not be null or have zero length.";
                        } else if (length != length2) {
                            str3 = "stripOffsets and stripByteCounts should have same length.";
                        } else {
                            long j2 = 0;
                            int i4 = 0;
                            do {
                                j2 += jArr2[i4];
                                i4++;
                            } while (i4 < length2);
                            int i5 = (int) j2;
                            int i6 = i5;
                            byte[] bArr = new byte[i5];
                            this.A0C = true;
                            this.A0E = true;
                            this.A0D = true;
                            int i7 = 0;
                            int i8 = 0;
                            int i9 = 0;
                            do {
                                int i10 = (int) jArr[i7];
                                int i11 = (int) jArr2[i7];
                                if (i7 < length - 1 && ((long) (i10 + i11)) != jArr[i7 + 1]) {
                                    this.A0C = false;
                                }
                                int i12 = i10 - i8;
                                if (i12 < 0) {
                                    str2 = "Invalid strip offset value";
                                } else {
                                    long j3 = (long) i12;
                                    if (r11.skip(j3) != j3) {
                                        sb = new StringBuilder("Failed to skip ");
                                        sb.append(i12);
                                    } else {
                                        int i13 = i8 + i12;
                                        byte[] bArr2 = new byte[i11];
                                        if (r11.read(bArr2) != i11) {
                                            sb = new StringBuilder("Failed to read ");
                                            sb.append(i11);
                                        } else {
                                            i8 = i13 + i11;
                                            System.arraycopy(bArr2, 0, bArr, i9, i11);
                                            i9 += i11;
                                            i7++;
                                        }
                                    }
                                    sb.append(" bytes.");
                                    str2 = sb.toString();
                                }
                                Log.d(str, str2);
                            } while (i7 < length);
                            this.A0G = bArr;
                            if (this.A0C) {
                                this.A07 = (int) jArr[0];
                                this.A06 = i6;
                                return;
                            }
                            return;
                        }
                        Log.w(str, str3);
                        return;
                    }
                    return;
                }
            }
            if (A0T) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        this.A05 = 6;
        C06590Ww r2 = (C06590Ww) hashMap.get("JPEGInterchangeFormat");
        C06590Ww r15 = (C06590Ww) hashMap.get("JPEGInterchangeFormatLength");
        if (r2 != null && r15 != null) {
            int A044 = r2.A04(this.A0A);
            int A045 = r15.A04(this.A0A);
            if (this.A00 == 7) {
                A044 += this.A02;
            }
            if (A044 > 0 && A045 > 0) {
                this.A0D = true;
                if (this.A09 == null && this.A08 == null) {
                    byte[] bArr3 = new byte[A045];
                    r11.skip((long) A044);
                    r11.read(bArr3);
                    this.A0G = bArr3;
                }
                this.A07 = A044;
                this.A06 = A045;
            }
            if (A0T) {
                StringBuilder sb2 = new StringBuilder("Setting thumbnail attributes with offset: ");
                sb2.append(A044);
                sb2.append(", length: ");
                sb2.append(A045);
                str2 = sb2.toString();
                str = "ExifInterface";
                Log.d(str, str2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00ef A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00ab A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(X.AnonymousClass0JA r25, int r26, int r27) {
        /*
            r24 = this;
            boolean r17 = A0T
            java.lang.String r8 = "ExifInterface"
            r9 = r25
            if (r17 == 0) goto L_0x0019
            java.lang.String r1 = "getJpegAttributes starting with: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r8, r0)
        L_0x0019:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r9.A01 = r0
            byte r0 = r9.readByte()
            java.lang.String r2 = "Invalid marker: "
            r7 = -1
            if (r0 != r7) goto L_0x01db
            byte r1 = r9.readByte()
            r0 = -40
            if (r1 != r0) goto L_0x01c0
            r5 = 2
            r11 = 2
        L_0x0030:
            byte r2 = r9.readByte()
            if (r2 != r7) goto L_0x01a6
            r3 = 1
            int r4 = r11 + 1
            byte r1 = r9.readByte()
            if (r17 == 0) goto L_0x0056
            java.lang.String r0 = "Found JPEG segment indicator: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r8, r0)
        L_0x0056:
            int r2 = r4 + 1
            r0 = -39
            r6 = r24
            if (r1 == r0) goto L_0x01a1
            r0 = -38
            if (r1 == r0) goto L_0x01a1
            int r12 = r9.readUnsignedShort()
            int r12 = r12 - r5
            int r11 = r2 + 2
            if (r17 == 0) goto L_0x0091
            java.lang.String r0 = "JPEG segment: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r2.append(r0)
            java.lang.String r0 = " (length: "
            r2.append(r0)
            int r0 = r12 + 2
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r8, r0)
        L_0x0091:
            java.lang.String r10 = "Invalid length"
            if (r12 < 0) goto L_0x019b
            r0 = -31
            r15 = 0
            r14 = r27
            if (r1 == r0) goto L_0x00fb
            r0 = -2
            if (r1 == r0) goto L_0x016e
            switch(r1) {
                case -64: goto L_0x00b1;
                case -63: goto L_0x00b1;
                case -62: goto L_0x00b1;
                case -61: goto L_0x00b1;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            switch(r1) {
                case -59: goto L_0x00b1;
                case -58: goto L_0x00b1;
                case -57: goto L_0x00b1;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            switch(r1) {
                case -55: goto L_0x00b1;
                case -54: goto L_0x00b1;
                case -53: goto L_0x00b1;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            switch(r1) {
                case -51: goto L_0x00b1;
                case -50: goto L_0x00b1;
                case -49: goto L_0x00b1;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r9.A00(r12)
            int r11 = r11 + r12
            r5 = 2
            goto L_0x0030
        L_0x00b1:
            r9.A00(r3)
            java.util.HashMap[] r13 = r6.A0H
            r15 = r13[r27]
            r5 = 4
            if (r14 == r5) goto L_0x00f8
            java.lang.String r4 = "ImageLength"
        L_0x00bd:
            int r0 = r9.readUnsignedShort()
            long r2 = (long) r0
            java.nio.ByteOrder r1 = r6.A0A
            r0 = 1
            long[] r0 = new long[r0]
            r16 = 0
            r0[r16] = r2
            X.0Ww r0 = X.C06590Ww.A02(r1, r0)
            r15.put(r4, r0)
            r3 = r13[r27]
            if (r14 == r5) goto L_0x00f5
            java.lang.String r5 = "ImageWidth"
        L_0x00d8:
            int r0 = r9.readUnsignedShort()
            long r0 = (long) r0
            java.nio.ByteOrder r4 = r6.A0A
            r2 = 1
            long[] r2 = new long[r2]
            r2[r16] = r0
            X.0Ww r0 = X.C06590Ww.A02(r4, r2)
            r3.put(r5, r0)
            int r12 = r12 + -5
            if (r12 >= 0) goto L_0x00ab
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r10)
            throw r0
        L_0x00f5:
            java.lang.String r5 = "ThumbnailImageWidth"
            goto L_0x00d8
        L_0x00f8:
            java.lang.String r4 = "ThumbnailImageLength"
            goto L_0x00bd
        L_0x00fb:
            byte[] r5 = new byte[r12]
            r9.readFully(r5)
            int r13 = r11 + r12
            byte[] r10 = A0Y
            if (r10 == 0) goto L_0x0115
            int r4 = r10.length
            if (r12 < r4) goto L_0x0115
            r2 = 0
        L_0x010a:
            if (r2 >= r4) goto L_0x0150
            byte r1 = r5[r2]
            byte r0 = r10[r2]
            if (r1 != r0) goto L_0x0115
            int r2 = r2 + 1
            goto L_0x010a
        L_0x0115:
            byte[] r10 = A0Z
            if (r10 == 0) goto L_0x016c
            int r4 = r10.length
            if (r12 < r4) goto L_0x016c
            r2 = 0
        L_0x011d:
            if (r2 >= r4) goto L_0x0128
            byte r1 = r5[r2]
            byte r0 = r10[r2]
            if (r1 != r0) goto L_0x016c
            int r2 = r2 + 1
            goto L_0x011d
        L_0x0128:
            int r11 = r11 + r4
            byte[] r12 = java.util.Arrays.copyOfRange(r5, r4, r12)
            java.lang.String r10 = "Xmp"
            java.lang.String r0 = r6.A09(r10)
            if (r0 != 0) goto L_0x016c
            java.util.HashMap[] r0 = r6.A0H
            r5 = r0[r15]
            int r4 = r12.length
            long r0 = (long) r11
            X.0Ww r2 = new X.0Ww
            r22 = 1
            r18 = r2
            r19 = r0
            r21 = r12
            r23 = r4
            r18.<init>(r19, r21, r22, r23)
            r5.put(r10, r2)
            r6.A0F = r3
            goto L_0x016c
        L_0x0150:
            byte[] r1 = java.util.Arrays.copyOfRange(r5, r4, r12)
            int r0 = r26 + r11
            int r0 = r0 + r4
            r6.A01 = r0
            X.0Eo r0 = new X.0Eo
            r0.<init>((byte[]) r1)
            r6.A0G(r0)
            r6.A0M(r0, r14)
            X.0JA r0 = new X.0JA
            r0.<init>(r1)
            r6.A0H(r0)
        L_0x016c:
            r11 = r13
            goto L_0x0190
        L_0x016e:
            byte[] r5 = new byte[r12]
            int r0 = r9.read(r5)
            if (r0 != r12) goto L_0x0193
            java.lang.String r4 = "UserComment"
            java.lang.String r0 = r6.A09(r4)
            if (r0 != 0) goto L_0x0190
            java.util.HashMap[] r0 = r6.A0H
            r2 = r0[r3]
            java.nio.charset.Charset r1 = A0K
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r1)
            X.0Ww r0 = X.C06590Ww.A00(r0)
            r2.put(r4, r0)
        L_0x0190:
            r12 = 0
            goto L_0x00ab
        L_0x0193:
            java.lang.String r1 = "Invalid exif"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x019b:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r10)
            throw r0
        L_0x01a1:
            java.nio.ByteOrder r0 = r6.A0A
            r9.A01 = r0
            return
        L_0x01a6:
            java.lang.String r0 = "Invalid marker:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x01c0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x01db:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007703o.A0I(X.0JA, int, int):void");
    }

    public final void A0J(AnonymousClass0JA r5, AnonymousClass0J7 r6, byte[] bArr, byte[] bArr2) {
        String obj;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (r5.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = A0K;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    obj = "";
                } else {
                    StringBuilder sb2 = new StringBuilder(" or ");
                    sb2.append(new String(bArr2, charset));
                    obj = sb2.toString();
                }
                sb.append(obj);
                throw new IOException(sb.toString());
            }
            int readInt = r5.readInt();
            r6.write(bArr3);
            r6.A00(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            A06(r5, r6, readInt);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public final void A0K(AnonymousClass0J7 r20) {
        HashMap[] hashMapArr;
        byte[] bArr;
        int length = A16.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        AnonymousClass0U6[] r10 = A0t;
        int length2 = r10.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            A0P(r10[i2].A03);
            i2++;
        }
        if (this.A0D) {
            if (this.A0E) {
                A0P("StripOffsets");
                A0P("StripByteCounts");
            } else {
                A0P("JPEGInterchangeFormat");
                A0P("JPEGInterchangeFormatLength");
            }
        }
        int i3 = 0;
        while (true) {
            hashMapArr = this.A0H;
            if (i3 >= length) {
                break;
            }
            for (Object obj : hashMapArr[i3].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    hashMapArr[i3].remove(entry.getKey());
                }
            }
            i3++;
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(r10[1].A03, C06590Ww.A02(this.A0A, new long[]{0}));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(r10[2].A03, C06590Ww.A02(this.A0A, new long[]{0}));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(r10[3].A03, C06590Ww.A02(this.A0A, new long[]{0}));
        }
        if (this.A0D) {
            boolean z2 = this.A0E;
            HashMap hashMap = hashMapArr[4];
            if (z2) {
                hashMap.put("StripOffsets", C06590Ww.A01(this.A0A, new int[]{0}));
                hashMapArr[4].put("StripByteCounts", C06590Ww.A01(this.A0A, new int[]{this.A06}));
            } else {
                hashMap.put("JPEGInterchangeFormat", C06590Ww.A02(this.A0A, new long[]{0}));
                hashMapArr[4].put("JPEGInterchangeFormatLength", C06590Ww.A02(this.A0A, new long[]{(long) this.A06}));
            }
        }
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = 0;
            for (Map.Entry value : hashMapArr[i4].entrySet()) {
                C06590Ww r14 = (C06590Ww) value.getValue();
                int i6 = A0s[r14.A00] * r14.A01;
                if (i6 > 4) {
                    i5 += i6;
                }
            }
            iArr2[i4] = iArr2[i4] + i5;
        }
        int i7 = 8;
        for (int i8 = 0; i8 < length; i8++) {
            if (!hashMapArr[i8].isEmpty()) {
                iArr[i8] = i7;
                i7 += (hashMapArr[i8].size() * 12) + 2 + 4 + iArr2[i8];
            }
        }
        if (this.A0D) {
            boolean z3 = this.A0E;
            HashMap hashMap2 = hashMapArr[4];
            if (z3) {
                hashMap2.put("StripOffsets", C06590Ww.A01(this.A0A, new int[]{i7}));
            } else {
                hashMap2.put("JPEGInterchangeFormat", C06590Ww.A02(this.A0A, new long[]{(long) i7}));
            }
            this.A07 = i7;
            i7 += this.A06;
        }
        if (this.A00 == 4) {
            i7 += 8;
        }
        if (A0T) {
            for (int i9 = 0; i9 < length; i9++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i9), Integer.valueOf(iArr[i9]), Integer.valueOf(hashMapArr[i9].size()), Integer.valueOf(iArr2[i9]), Integer.valueOf(i7)}));
            }
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(r10[1].A03, C06590Ww.A02(this.A0A, new long[]{(long) iArr[1]}));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(r10[2].A03, C06590Ww.A02(this.A0A, new long[]{(long) iArr[2]}));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(r10[3].A03, C06590Ww.A02(this.A0A, new long[]{(long) iArr[3]}));
        }
        int i10 = this.A00;
        AnonymousClass0J7 r102 = r20;
        if (i10 == 4) {
            r102.A01((short) i7);
            bArr = A0Y;
            r102.write(bArr);
        } else if (i10 == 13) {
            r102.A00(i7);
            bArr = A0d;
            r102.write(bArr);
        } else if (i10 == 14) {
            r102.write(A0j);
            r102.A00(i7);
        }
        ByteOrder byteOrder = this.A0A;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        short s2 = 18761;
        if (byteOrder == byteOrder2) {
            s2 = 19789;
        }
        r102.A01(s2);
        r102.A00 = this.A0A;
        r102.A01((short) 42);
        r102.A00((int) 8);
        int i11 = 0;
        while (i11 < length) {
            if (!hashMapArr[i11].isEmpty()) {
                r102.A01((short) hashMapArr[i11].size());
                HashMap hashMap3 = hashMapArr[i11];
                int size = iArr[i11] + 2 + (hashMap3.size() * 12) + 4;
                for (Map.Entry entry2 : hashMap3.entrySet()) {
                    int i12 = ((AnonymousClass0U6) A15[i11].get(entry2.getKey())).A00;
                    C06590Ww r142 = (C06590Ww) entry2.getValue();
                    int[] iArr3 = A0s;
                    int i13 = r142.A00;
                    int i14 = iArr3[i13];
                    int i15 = r142.A01;
                    int i16 = i14 * i15;
                    r102.A01((short) i12);
                    r102.A01((short) i13);
                    r102.A00(i15);
                    if (i16 > 4) {
                        r102.A00((int) ((long) size));
                        size += i16;
                    } else {
                        r102.write(r142.A03);
                        while (i16 < 4) {
                            r102.A01.write(0);
                            i16++;
                        }
                    }
                }
                r102.A00((int) ((i11 != 0 || hashMapArr[4].isEmpty()) ? 0 : (long) iArr[4]));
                for (Map.Entry value2 : hashMapArr[i11].entrySet()) {
                    byte[] bArr2 = ((C06590Ww) value2.getValue()).A03;
                    int length3 = bArr2.length;
                    if (length3 > 4) {
                        r102.write(bArr2, 0, length3);
                    }
                }
            }
            i11++;
        }
        if (this.A0D) {
            r102.write(A0R());
        }
        if (this.A00 == 14 && i7 % 2 == 1) {
            r102.A01.write(0);
        }
        r102.A00 = byteOrder2;
    }

    public final void A0L(C02720Eo r6) {
        A0G(r6);
        A0M(r6, 0);
        A0N(r6, 0);
        A0N(r6, 5);
        A0N(r6, 4);
        A0D();
        if (this.A00 == 8) {
            HashMap[] hashMapArr = this.A0H;
            C06590Ww r0 = (C06590Ww) hashMapArr[1].get("MakerNote");
            if (r0 != null) {
                C02720Eo r1 = new C02720Eo(r0.A03);
                r1.A01 = this.A0A;
                r1.A00(6);
                A0M(r1, 9);
                Object obj = hashMapArr[9].get("ColorSpace");
                if (obj != null) {
                    hashMapArr[1].put("ColorSpace", obj);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01fc, code lost:
        if (r7 == 7) goto L_0x01fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.C02720Eo r32, int r33) {
        /*
            r31 = this;
            r9 = r31
            java.util.Set r0 = r9.A0B
            r30 = r0
            r10 = r32
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r30
            r0.add(r1)
            short r23 = r10.readShort()
            boolean r22 = A0T
            java.lang.String r8 = "ExifInterface"
            if (r22 == 0) goto L_0x0030
            java.lang.String r0 = "numberOfDirectoryEntry: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r23
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r8, r0)
        L_0x0030:
            if (r23 <= 0) goto L_0x0341
            r13 = 0
            r21 = 0
        L_0x0035:
            r4 = 5
            r1 = r21
            r0 = r23
            if (r1 >= r0) goto L_0x02d8
            int r5 = r10.readUnsignedShort()
            int r7 = r10.readUnsignedShort()
            int r15 = r10.readInt()
            int r0 = r10.A00
            long r2 = (long) r0
            r16 = 4
            long r2 = r2 + r16
            java.util.HashMap[] r0 = A14
            r0 = r0[r33]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r0.get(r11)
            X.0U6 r6 = (X.AnonymousClass0U6) r6
            r12 = 3
            if (r22 == 0) goto L_0x0088
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r33)
            r4[r13] = r0
            r0 = 1
            r4[r0] = r11
            if (r6 == 0) goto L_0x02d5
            java.lang.String r1 = r6.A03
        L_0x006f:
            r0 = 2
            r4[r0] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r4[r12] = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0 = 4
            r4[r0] = r1
            java.lang.String r0 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            android.util.Log.d(r8, r0)
        L_0x0088:
            r12 = 7
            if (r6 != 0) goto L_0x00a8
            if (r22 == 0) goto L_0x009e
            java.lang.String r0 = "Skip the tag entry since tag number is not defined: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
        L_0x0097:
            java.lang.String r0 = r1.toString()
        L_0x009b:
            android.util.Log.d(r8, r0)
        L_0x009e:
            r10.A01(r2)
        L_0x00a1:
            int r0 = r21 + 1
            short r0 = (short) r0
            r21 = r0
            r13 = 0
            goto L_0x0035
        L_0x00a8:
            if (r7 <= 0) goto L_0x02c7
            int[] r1 = A0s
            int r0 = r1.length
            if (r7 >= r0) goto L_0x02c7
            int r5 = r6.A01
            if (r5 == r12) goto L_0x01fc
            if (r7 == r12) goto L_0x01fe
            if (r5 == r7) goto L_0x01fc
            int r4 = r6.A02
            if (r4 == r7) goto L_0x01fc
            r0 = 4
            if (r5 == r0) goto L_0x00c0
            if (r4 != r0) goto L_0x01f0
        L_0x00c0:
            r0 = 3
            if (r7 != r0) goto L_0x01f0
        L_0x00c3:
            long r4 = (long) r15
            r0 = r1[r7]
            long r0 = (long) r0
            long r4 = r4 * r0
            r12 = 0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x029d
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x029d
            java.lang.String r20 = "Compression"
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0107
            int r12 = r10.readInt()
            if (r22 == 0) goto L_0x00f2
            java.lang.String r1 = "seek to data offset: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r8, r0)
        L_0x00f2:
            int r1 = r9.A00
            r0 = 7
            if (r1 != r0) goto L_0x0103
            java.lang.String r1 = r6.A03
            java.lang.String r0 = "MakerNote"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0195
            r9.A02 = r12
        L_0x0103:
            long r0 = (long) r12
            r10.A01(r0)
        L_0x0107:
            java.util.HashMap r0 = A0L
            java.lang.Object r12 = r0.get(r11)
            java.lang.Number r12 = (java.lang.Number) r12
            if (r22 == 0) goto L_0x012a
            java.lang.String r0 = "nextIfdType: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = " byteCount: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r8, r0)
        L_0x012a:
            r11 = 8
            if (r12 == 0) goto L_0x0232
            r0 = -1
            r4 = 3
            if (r7 == r4) goto L_0x018a
            r4 = 4
            if (r7 == r4) goto L_0x017e
            if (r7 == r11) goto L_0x018f
            r4 = 9
            if (r7 == r4) goto L_0x0179
            r4 = 13
            if (r7 == r4) goto L_0x0179
        L_0x0140:
            if (r22 == 0) goto L_0x015a
            r4 = 2
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r4 = 0
            r7[r4] = r5
            java.lang.String r5 = r6.A03
            r4 = 1
            r7[r4] = r5
            java.lang.String r4 = "Offset: %d, tagName: %s"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            android.util.Log.d(r8, r4)
        L_0x015a:
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0220
            int r4 = (int) r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r4 = r30
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L_0x0201
            r10.A01(r0)
            int r0 = r12.intValue()
            r9.A0M(r10, r0)
            goto L_0x009e
        L_0x0179:
            int r0 = r10.readInt()
            goto L_0x0193
        L_0x017e:
            int r0 = r10.readInt()
            long r0 = (long) r0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            goto L_0x0140
        L_0x018a:
            int r0 = r10.readUnsignedShort()
            goto L_0x0193
        L_0x018f:
            short r0 = r10.readShort()
        L_0x0193:
            long r0 = (long) r0
            goto L_0x0140
        L_0x0195:
            r13 = 6
            r0 = r33
            if (r0 != r13) goto L_0x0103
            java.lang.String r0 = "ThumbnailImage"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0103
            r9.A04 = r12
            r9.A03 = r15
            java.nio.ByteOrder r1 = r9.A0A
            r0 = 1
            int[] r0 = new int[r0]
            r16 = 0
            r0[r16] = r13
            X.0Ww r19 = X.C06590Ww.A01(r1, r0)
            int r0 = r9.A04
            long r0 = (long) r0
            java.nio.ByteOrder r14 = r9.A0A
            r13 = 1
            long[] r13 = new long[r13]
            r13[r16] = r0
            X.0Ww r18 = X.C06590Ww.A02(r14, r13)
            int r0 = r9.A03
            long r0 = (long) r0
            java.nio.ByteOrder r14 = r9.A0A
            r13 = 1
            long[] r13 = new long[r13]
            r13[r16] = r0
            X.0Ww r17 = X.C06590Ww.A02(r14, r13)
            java.util.HashMap[] r13 = r9.A0H
            r16 = 4
            r14 = r13[r16]
            r1 = r20
            r0 = r19
            r14.put(r1, r0)
            r14 = r13[r16]
            java.lang.String r1 = "JPEGInterchangeFormat"
            r0 = r18
            r14.put(r1, r0)
            r13 = r13[r16]
            java.lang.String r1 = "JPEGInterchangeFormatLength"
            r0 = r17
            r13.put(r1, r0)
            goto L_0x0103
        L_0x01f0:
            r0 = 9
            if (r5 == r0) goto L_0x01f6
            if (r4 != r0) goto L_0x02ab
        L_0x01f6:
            r0 = 8
            if (r7 != r0) goto L_0x02ab
            goto L_0x00c3
        L_0x01fc:
            if (r7 != r12) goto L_0x00c3
        L_0x01fe:
            r7 = r5
            goto L_0x00c3
        L_0x0201:
            if (r22 == 0) goto L_0x009e
            java.lang.String r4 = "Skip jump into the IFD since it has already been read: IfdType "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r12)
            java.lang.String r4 = " (at "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = ")"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            goto L_0x009b
        L_0x0220:
            if (r22 == 0) goto L_0x009e
            java.lang.String r5 = "Skip jump into the IFD since its offset is invalid: "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto L_0x009b
        L_0x0232:
            int r1 = r10.A00
            int r0 = r9.A01
            int r1 = r1 + r0
            int r0 = (int) r4
            byte[] r5 = new byte[r0]
            r10.readFully(r5)
            long r0 = (long) r1
            X.0Ww r4 = new X.0Ww
            r24 = r4
            r25 = r0
            r27 = r5
            r28 = r7
            r29 = r15
            r24.<init>(r25, r27, r28, r29)
            java.util.HashMap[] r0 = r9.A0H
            r0 = r0[r33]
            java.lang.String r5 = r6.A03
            r0.put(r5, r4)
            java.lang.String r0 = "DNGVersion"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0261
            r0 = 3
            r9.A00 = r0
        L_0x0261:
            java.lang.String r0 = "Make"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0271
            java.lang.String r0 = "Model"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x027f
        L_0x0271:
            java.nio.ByteOrder r0 = r9.A0A
            java.lang.String r1 = r4.A06(r0)
            java.lang.String r0 = "PENTAX"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0292
        L_0x027f:
            r0 = r20
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0294
            java.nio.ByteOrder r0 = r9.A0A
            int r1 = r4.A04(r0)
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L_0x0294
        L_0x0292:
            r9.A00 = r11
        L_0x0294:
            int r0 = r10.A00
            long r0 = (long) r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a1
            goto L_0x009e
        L_0x029d:
            if (r22 == 0) goto L_0x009e
            java.lang.String r0 = "Skip the tag entry since the number of components is invalid: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r15)
            goto L_0x0097
        L_0x02ab:
            if (r22 == 0) goto L_0x009e
            java.lang.String r0 = "Skip the tag entry since data format ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String[] r0 = A13
            r0 = r0[r7]
            r1.append(r0)
            java.lang.String r0 = ") is unexpected for tag: "
            r1.append(r0)
            java.lang.String r0 = r6.A03
            r1.append(r0)
            goto L_0x0097
        L_0x02c7:
            if (r22 == 0) goto L_0x009e
            java.lang.String r0 = "Skip the tag entry since data format is invalid: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            goto L_0x0097
        L_0x02d5:
            r1 = 0
            goto L_0x006f
        L_0x02d8:
            int r7 = r10.readInt()
            if (r22 == 0) goto L_0x02f0
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2[r13] = r1
            java.lang.String r0 = "nextIfdOffset: %d"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            android.util.Log.d(r8, r0)
        L_0x02f0:
            long r1 = (long) r7
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x032b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r0 = r30
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0321
            r10.A01(r1)
            java.util.HashMap[] r2 = r9.A0H
            r1 = 4
            r0 = r2[r1]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0315
            r9.A0M(r10, r1)
            return
        L_0x0315:
            r0 = r2[r4]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0341
            r9.A0M(r10, r4)
            return
        L_0x0321:
            if (r22 == 0) goto L_0x0341
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x0334
        L_0x032b:
            if (r22 == 0) goto L_0x0341
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x0334:
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r8, r0)
        L_0x0341:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007703o.A0M(X.0Eo, int):void");
    }

    public final void A0N(C02720Eo r13, int i2) {
        StringBuilder sb;
        String str;
        C06590Ww A012;
        C06590Ww A013;
        HashMap[] hashMapArr = this.A0H;
        C06590Ww r8 = (C06590Ww) hashMapArr[i2].get("DefaultCropSize");
        C06590Ww r7 = (C06590Ww) hashMapArr[i2].get("SensorTopBorder");
        C06590Ww r9 = (C06590Ww) hashMapArr[i2].get("SensorLeftBorder");
        C06590Ww r2 = (C06590Ww) hashMapArr[i2].get("SensorBottomBorder");
        C06590Ww r4 = (C06590Ww) hashMapArr[i2].get("SensorRightBorder");
        if (r8 != null) {
            int i3 = r8.A00;
            Object A052 = r8.A05(this.A0A);
            if (i3 == 5) {
                AnonymousClass0PQ[] r82 = (AnonymousClass0PQ[]) A052;
                if (r82 == null || r82.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    str = Arrays.toString(r82);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                AnonymousClass0PQ r22 = r82[0];
                A012 = C06590Ww.A03(this.A0A, new AnonymousClass0PQ[]{r22});
                AnonymousClass0PQ r23 = r82[1];
                A013 = C06590Ww.A03(this.A0A, new AnonymousClass0PQ[]{r23});
            } else {
                int[] iArr = (int[]) A052;
                if (iArr == null || iArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    str = Arrays.toString(iArr);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                int i4 = iArr[0];
                A012 = C06590Ww.A01(this.A0A, new int[]{i4});
                int i5 = iArr[1];
                A013 = C06590Ww.A01(this.A0A, new int[]{i5});
            }
            hashMapArr[i2].put("ImageWidth", A012);
            hashMapArr[i2].put("ImageLength", A013);
        } else if (r7 == null || r9 == null || r2 == null || r4 == null) {
            Object obj = hashMapArr[i2].get("ImageLength");
            Object obj2 = hashMapArr[i2].get("ImageWidth");
            if (obj == null || obj2 == null) {
                C06590Ww r24 = (C06590Ww) hashMapArr[i2].get("JPEGInterchangeFormat");
                Object obj3 = hashMapArr[i2].get("JPEGInterchangeFormatLength");
                if (r24 != null && obj3 != null) {
                    int A042 = r24.A04(this.A0A);
                    int A043 = r24.A04(this.A0A);
                    r13.A01((long) A042);
                    byte[] bArr = new byte[A043];
                    r13.read(bArr);
                    A0I(new AnonymousClass0JA(bArr), A042, i2);
                }
            }
        } else {
            int A044 = r7.A04(this.A0A);
            int A045 = r2.A04(this.A0A);
            int A046 = r4.A04(this.A0A);
            int A047 = r9.A04(this.A0A);
            if (A045 > A044 && A046 > A047) {
                int i6 = A045 - A044;
                int i7 = A046 - A047;
                C06590Ww A014 = C06590Ww.A01(this.A0A, new int[]{i6});
                C06590Ww A015 = C06590Ww.A01(this.A0A, new int[]{i7});
                hashMapArr[i2].put("ImageLength", A014);
                hashMapArr[i2].put("ImageWidth", A015);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0316, code lost:
        r3.put(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r4 == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005f, code lost:
        if (r4 != false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(java.lang.String r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r2 = "Orientation"
            java.lang.String r1 = "DateTime"
            boolean r1 = r1.equals(r2)
            java.lang.String r9 = " : "
            java.lang.String r8 = "Invalid value for "
            java.lang.String r16 = "ExifInterface"
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = "DateTimeOriginal"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = "DateTimeDigitized"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0069
        L_0x0022:
            if (r24 == 0) goto L_0x0069
            java.util.regex.Pattern r1 = A0P
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r5 = r1.find()
            java.util.regex.Pattern r1 = A0Q
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r4 = r1.find()
            int r3 = r0.length()
            r1 = 19
            if (r3 != r1) goto L_0x0044
            if (r5 != 0) goto L_0x005f
            if (r4 != 0) goto L_0x0061
        L_0x0044:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r2)
            r1.append(r9)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = r16
            android.util.Log.w(r0, r1)
        L_0x005e:
            return
        L_0x005f:
            if (r4 == 0) goto L_0x0069
        L_0x0061:
            java.lang.String r3 = "-"
            java.lang.String r1 = ":"
            java.lang.String r0 = r0.replaceAll(r3, r1)
        L_0x0069:
            java.lang.String r1 = "ISOSpeedRatings"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007e
            boolean r1 = A0T
            if (r1 == 0) goto L_0x007c
            java.lang.String r2 = "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            r1 = r16
            android.util.Log.d(r1, r2)
        L_0x007c:
            java.lang.String r2 = "PhotographicSensitivity"
        L_0x007e:
            r13 = 2
            r7 = 1
            if (r0 == 0) goto L_0x00d6
            java.util.HashSet r1 = A0M
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x00d6
            java.lang.String r1 = "GPSTimeStamp"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x031b
            java.util.regex.Pattern r1 = A0R
            java.util.regex.Matcher r4 = r1.matcher(r0)
            boolean r1 = r4.find()
            if (r1 == 0) goto L_0x0044
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = r4.group(r7)
            int r0 = java.lang.Integer.parseInt(r0)
            r3.append(r0)
            java.lang.String r1 = "/1,"
            r3.append(r1)
            java.lang.String r0 = r4.group(r13)
            int r0 = java.lang.Integer.parseInt(r0)
            r3.append(r0)
            r3.append(r1)
            r0 = 3
            java.lang.String r0 = r4.group(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            r3.append(r0)
            java.lang.String r0 = "/1"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x00d6:
            r4 = 0
            r1 = 0
        L_0x00d8:
            X.0U6[][] r3 = A16
            int r3 = r3.length
            if (r1 >= r3) goto L_0x005e
            r3 = 4
            r9 = r23
            if (r1 != r3) goto L_0x00ec
            boolean r3 = r9.A0D
            if (r3 != 0) goto L_0x00ec
        L_0x00e6:
            int r1 = r1 + 1
            r13 = 2
            r4 = 0
            r7 = 1
            goto L_0x00d8
        L_0x00ec:
            java.util.HashMap[] r3 = A15
            r3 = r3[r1]
            java.lang.Object r14 = r3.get(r2)
            X.0U6 r14 = (X.AnonymousClass0U6) r14
            if (r14 == 0) goto L_0x00e6
            if (r0 != 0) goto L_0x0102
            java.util.HashMap[] r3 = r9.A0H
            r3 = r3[r1]
            r3.remove(r2)
            goto L_0x00e6
        L_0x0102:
            android.util.Pair r6 = A00(r0)
            int r11 = r14.A01
            r5 = r11
            java.lang.Object r3 = r6.first
            java.lang.Number r3 = (java.lang.Number) r3
            int r10 = r3.intValue()
            r12 = -1
            if (r11 == r10) goto L_0x0126
            java.lang.Object r3 = r6.second
            java.lang.Number r3 = (java.lang.Number) r3
            int r8 = r3.intValue()
            if (r11 == r8) goto L_0x0126
            int r11 = r14.A02
            if (r11 == r12) goto L_0x0145
            if (r11 == r10) goto L_0x0126
            if (r11 != r8) goto L_0x0145
        L_0x0126:
            java.lang.String r15 = "/"
            java.lang.String r3 = ","
            switch(r11) {
                case 1: goto L_0x01af;
                case 2: goto L_0x01ef;
                case 3: goto L_0x01f9;
                case 4: goto L_0x0219;
                case 5: goto L_0x023a;
                case 6: goto L_0x012d;
                case 7: goto L_0x01ef;
                case 8: goto L_0x012d;
                case 9: goto L_0x0270;
                case 10: goto L_0x02a5;
                default: goto L_0x012d;
            }
        L_0x012d:
            boolean r3 = A0T
            if (r3 == 0) goto L_0x00e6
            java.lang.String r4 = "Data format isn't one of expected formats: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r11)
            java.lang.String r4 = r3.toString()
        L_0x013f:
            r3 = r16
            android.util.Log.d(r3, r4)
            goto L_0x00e6
        L_0x0145:
            if (r5 == r7) goto L_0x01ac
            r3 = 7
            if (r5 == r3) goto L_0x01ac
            if (r5 == r13) goto L_0x01ac
            boolean r3 = A0T
            if (r3 == 0) goto L_0x00e6
            java.lang.String r3 = "Given tag ("
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r3)
            r7.append(r2)
            java.lang.String r3 = ") value didn't match with one of expected formats: "
            r7.append(r3)
            java.lang.String[] r9 = A13
            r3 = r9[r5]
            r7.append(r3)
            java.lang.String r6 = ""
            java.lang.String r5 = ", "
            if (r11 != r12) goto L_0x019a
            r3 = r6
        L_0x016d:
            r7.append(r3)
            java.lang.String r3 = " (guess: "
            r7.append(r3)
            r3 = r9[r10]
            r7.append(r3)
            if (r8 == r12) goto L_0x018d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r3 = r9[r8]
            r4.append(r3)
            java.lang.String r6 = r4.toString()
        L_0x018d:
            r7.append(r6)
            java.lang.String r3 = ")"
            r7.append(r3)
            java.lang.String r4 = r7.toString()
            goto L_0x013f
        L_0x019a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r3 = r9[r11]
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L_0x016d
        L_0x01ac:
            r11 = r5
            goto L_0x0126
        L_0x01af:
            java.util.HashMap[] r3 = r9.A0H
            r3 = r3[r1]
            int r5 = r0.length()
            if (r5 != r7) goto L_0x01de
            char r5 = r0.charAt(r4)
            r8 = 48
            if (r5 < r8) goto L_0x01de
            char r6 = r0.charAt(r4)
            r5 = 49
            if (r6 > r5) goto L_0x01de
            byte[] r7 = new byte[r7]
            char r5 = r0.charAt(r4)
            int r5 = r5 - r8
            byte r5 = (byte) r5
            r7[r4] = r5
            r5 = -1
            r8 = 1
            r9 = 1
            X.0Ww r4 = new X.0Ww
            r4.<init>(r5, r7, r8, r9)
            goto L_0x0316
        L_0x01de:
            java.nio.charset.Charset r4 = A0K
            byte[] r7 = r0.getBytes(r4)
            int r9 = r7.length
            r5 = -1
            r8 = 1
            X.0Ww r4 = new X.0Ww
            r4.<init>(r5, r7, r8, r9)
            goto L_0x0316
        L_0x01ef:
            java.util.HashMap[] r3 = r9.A0H
            r3 = r3[r1]
            X.0Ww r4 = X.C06590Ww.A00(r0)
            goto L_0x0316
        L_0x01f9:
            java.lang.String[] r7 = r0.split(r3, r12)
            int r6 = r7.length
            int[] r5 = new int[r6]
        L_0x0200:
            if (r4 >= r6) goto L_0x020d
            r3 = r7[r4]
            int r3 = java.lang.Integer.parseInt(r3)
            r5[r4] = r3
            int r4 = r4 + 1
            goto L_0x0200
        L_0x020d:
            java.util.HashMap[] r3 = r9.A0H
            r3 = r3[r1]
            java.nio.ByteOrder r4 = r9.A0A
            X.0Ww r4 = X.C06590Ww.A01(r4, r5)
            goto L_0x0316
        L_0x0219:
            java.lang.String[] r8 = r0.split(r3, r12)
            int r7 = r8.length
            long[] r6 = new long[r7]
            r5 = 0
        L_0x0221:
            if (r5 >= r7) goto L_0x022e
            r3 = r8[r5]
            long r3 = java.lang.Long.parseLong(r3)
            r6[r5] = r3
            int r5 = r5 + 1
            goto L_0x0221
        L_0x022e:
            java.util.HashMap[] r3 = r9.A0H
            r3 = r3[r1]
            java.nio.ByteOrder r4 = r9.A0A
            X.0Ww r4 = X.C06590Ww.A02(r4, r6)
            goto L_0x0316
        L_0x023a:
            java.lang.String[] r13 = r0.split(r3, r12)
            int r11 = r13.length
            X.0PQ[] r14 = new X.AnonymousClass0PQ[r11]
            r10 = 0
        L_0x0242:
            if (r10 >= r11) goto L_0x0264
            r3 = r13[r10]
            java.lang.String[] r5 = r3.split(r15, r12)
            r3 = 0
            r3 = r5[r3]
            double r3 = java.lang.Double.parseDouble(r3)
            long r7 = (long) r3
            r3 = 1
            r3 = r5[r3]
            double r5 = java.lang.Double.parseDouble(r3)
            long r3 = (long) r5
            X.0PQ r5 = new X.0PQ
            r5.<init>(r7, r3)
            r14[r10] = r5
            int r10 = r10 + 1
            goto L_0x0242
        L_0x0264:
            java.util.HashMap[] r3 = r9.A0H
            r3 = r3[r1]
            java.nio.ByteOrder r4 = r9.A0A
            X.0Ww r4 = X.C06590Ww.A03(r4, r14)
            goto L_0x0316
        L_0x0270:
            java.lang.String[] r5 = r0.split(r3, r12)
            int r7 = r5.length
            int[] r8 = new int[r7]
        L_0x0277:
            if (r4 >= r7) goto L_0x0284
            r3 = r5[r4]
            int r3 = java.lang.Integer.parseInt(r3)
            r8[r4] = r3
            int r4 = r4 + 1
            goto L_0x0277
        L_0x0284:
            java.util.HashMap[] r3 = r9.A0H
            r3 = r3[r1]
            java.nio.ByteOrder r5 = r9.A0A
            int[] r4 = A0s
            r12 = 9
            r4 = r4[r12]
            int r4 = r4 * r7
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r4)
            r6.order(r5)
            r5 = 0
        L_0x029b:
            if (r5 >= r7) goto L_0x0309
            r4 = r8[r5]
            r6.putInt(r4)
            int r5 = r5 + 1
            goto L_0x029b
        L_0x02a5:
            java.lang.String[] r13 = r0.split(r3, r12)
            int r10 = r13.length
            X.0PQ[] r14 = new X.AnonymousClass0PQ[r10]
            r11 = 0
        L_0x02ad:
            if (r11 >= r10) goto L_0x02cf
            r3 = r13[r11]
            java.lang.String[] r8 = r3.split(r15, r12)
            r3 = r8[r4]
            double r3 = java.lang.Double.parseDouble(r3)
            long r5 = (long) r3
            r3 = r8[r7]
            double r7 = java.lang.Double.parseDouble(r3)
            long r3 = (long) r7
            X.0PQ r7 = new X.0PQ
            r7.<init>(r5, r3)
            r14[r11] = r7
            int r11 = r11 + 1
            r4 = 0
            r7 = 1
            goto L_0x02ad
        L_0x02cf:
            java.util.HashMap[] r3 = r9.A0H
            r3 = r3[r1]
            java.nio.ByteOrder r5 = r9.A0A
            int[] r4 = A0s
            r21 = 10
            r4 = r4[r21]
            int r4 = r4 * r10
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r4)
            r9.order(r5)
            r8 = 0
        L_0x02e6:
            if (r8 >= r10) goto L_0x02f9
            r7 = r14[r8]
            long r4 = r7.A01
            int r6 = (int) r4
            r9.putInt(r6)
            long r4 = r7.A00
            int r6 = (int) r4
            r9.putInt(r6)
            int r8 = r8 + 1
            goto L_0x02e6
        L_0x02f9:
            byte[] r20 = r9.array()
            r18 = -1
            X.0Ww r4 = new X.0Ww
            r17 = r4
            r22 = r10
            r17.<init>(r18, r20, r21, r22)
            goto L_0x0316
        L_0x0309:
            byte[] r11 = r6.array()
            r9 = -1
            X.0Ww r4 = new X.0Ww
            r8 = r4
            r13 = r7
            r8.<init>(r9, r11, r12, r13)
        L_0x0316:
            r3.put(r2, r4)
            goto L_0x00e6
        L_0x031b:
            double r3 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0333 }
            r5 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r3 = r3 * r5
            long r5 = (long) r3     // Catch:{ NumberFormatException -> 0x0333 }
            r3 = 10000(0x2710, double:4.9407E-320)
            X.0PQ r1 = new X.0PQ     // Catch:{ NumberFormatException -> 0x0333 }
            r1.<init>(r5, r3)     // Catch:{ NumberFormatException -> 0x0333 }
            java.lang.String r0 = r1.toString()     // Catch:{ NumberFormatException -> 0x0333 }
            goto L_0x00d6
        L_0x0333:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r2)
            r1.append(r9)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = r16
            android.util.Log.w(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007703o.A0O(java.lang.String):void");
    }

    public final void A0P(String str) {
        for (int i2 = 0; i2 < A16.length; i2++) {
            this.A0H[i2].remove(str);
        }
    }

    public final boolean A0Q(HashMap hashMap) {
        C06590Ww r1 = (C06590Ww) hashMap.get("ImageLength");
        C06590Ww r2 = (C06590Ww) hashMap.get("ImageWidth");
        if (!(r1 == null || r2 == null)) {
            return r1.A04(this.A0A) <= 512 && r2.A04(this.A0A) <= 512;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A0R() {
        /*
            r10 = this;
            java.lang.String r6 = "ExifInterface"
            boolean r0 = r10.A0D
            r9 = 0
            if (r0 == 0) goto L_0x0099
            byte[] r0 = r10.A0G
            if (r0 == 0) goto L_0x000c
            return r0
        L_0x000c:
            java.lang.String r0 = r10.A09     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            if (r0 == 0) goto L_0x0017
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r4 = r9
            goto L_0x0035
        L_0x0017:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r0 = 21
            if (r1 < r0) goto L_0x0033
            java.io.FileDescriptor r0 = r10.A08     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            java.io.FileDescriptor r4 = X.AnonymousClass0VU.A00(r0)     // Catch:{ Exception -> 0x007b, all -> 0x0078 }
            r1 = 0
            int r0 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0030, all -> 0x008f }
            X.AnonymousClass0VU.A02(r4, r0, r1)     // Catch:{ Exception -> 0x0030, all -> 0x008f }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0030, all -> 0x008f }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0030, all -> 0x008f }
            goto L_0x0035
        L_0x0030:
            r1 = move-exception
            r5 = r9
            goto L_0x007e
        L_0x0033:
            r5 = r9
            r4 = r9
        L_0x0035:
            if (r5 == 0) goto L_0x006a
            int r1 = r10.A07     // Catch:{ Exception -> 0x0076 }
            int r0 = r10.A01     // Catch:{ Exception -> 0x0076 }
            int r1 = r1 + r0
            long r0 = (long) r1     // Catch:{ Exception -> 0x0076 }
            long r7 = r5.skip(r0)     // Catch:{ Exception -> 0x0076 }
            int r1 = r10.A07     // Catch:{ Exception -> 0x0076 }
            int r0 = r10.A01     // Catch:{ Exception -> 0x0076 }
            int r1 = r1 + r0
            long r1 = (long) r1
            java.lang.String r3 = "Corrupted image"
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0070
            int r0 = r10.A06     // Catch:{ Exception -> 0x0076 }
            byte[] r2 = new byte[r0]     // Catch:{ Exception -> 0x0076 }
            int r1 = r5.read(r2)     // Catch:{ Exception -> 0x0076 }
            int r0 = r10.A06     // Catch:{ Exception -> 0x0076 }
            if (r1 != r0) goto L_0x0064
            r10.A0G = r2     // Catch:{ Exception -> 0x0076 }
            A03(r5)
            if (r4 == 0) goto L_0x0063
            A04(r4)
        L_0x0063:
            return r2
        L_0x0064:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0076 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0075
        L_0x006a:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ Exception -> 0x0076 }
            r0.<init>()     // Catch:{ Exception -> 0x0076 }
            goto L_0x0075
        L_0x0070:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0076 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0076 }
        L_0x0075:
            throw r0     // Catch:{ Exception -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            goto L_0x007e
        L_0x0078:
            r0 = move-exception
            r4 = r9
            goto L_0x0090
        L_0x007b:
            r1 = move-exception
            r5 = r9
            r4 = r9
        L_0x007e:
            java.lang.String r0 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r6, r0, r1)     // Catch:{ all -> 0x008c }
            A03(r5)
            if (r4 == 0) goto L_0x0099
            A04(r4)
            return r9
        L_0x008c:
            r0 = move-exception
            r9 = r5
            goto L_0x0090
        L_0x008f:
            r0 = move-exception
        L_0x0090:
            A03(r9)
            if (r4 == 0) goto L_0x0098
            A04(r4)
        L_0x0098:
            throw r0
        L_0x0099:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007703o.A0R():byte[]");
    }
}
