package X;

import android.content.res.Resources;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import com.AssemMods.translator.Language;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.1WH  reason: invalid class name */
public abstract class AnonymousClass1WH {
    public static HashSet A00;
    public static final Object A01 = new Object();
    public static final Pattern A02 = Pattern.compile("[a-z]{2,3}");
    public static final Pattern A03 = Pattern.compile("[A-Z]{2}|[0-9]{3}");
    public static final String[] A04 = A0D('0');

    public AnonymousClass1WH() {
        throw null;
    }

    public static int A00(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append("-");
            sb.append(country);
            language = sb.toString();
        }
        AnonymousClass00O r1 = C49542To.A00;
        Number number = (Number) r1.get(language);
        if (number == null && (number = (Number) r1.get(country)) == null) {
            return 1;
        }
        return number.intValue();
    }

    public static String A01(Locale locale) {
        String language = locale.getLanguage();
        return "zh".equals(language) ? "Hans".equals(A02(locale)) ? "zh-Hans" : "zh-Hant" : language;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r0 == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if ("CN".equals(r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if ("SG".equals(r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (r1.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        return "Hant";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if ("ME".equals(r1) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        return "Latn";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        if ("AF".equals(r1) != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        if ("CN".equals(r1) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        return "Arab";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        r1 = r7.getCountry();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        switch(r1.hashCode()) {
            case 2344: goto L_0x009a;
            case 2345: goto L_0x009d;
            case 2627: goto L_0x00b1;
            default: goto L_0x0099;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        return "Latn";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        r0 = "IQ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        r0 = "IR";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a3, code lost:
        if (r1.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
        return "Latn";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        if ("PK".equals(r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ae, code lost:
        return "Guru";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        if (r1.equals("RU") != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        return "Latn";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        return "Cyrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return "Hans";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return "Hans";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return "Hans";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return "Arab";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return "Arab";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        switch(r6) {
            case 0: goto L_0x008e;
            case 1: goto L_0x00a6;
            case 2: goto L_0x0076;
            case 3: goto L_0x007f;
            case 4: goto L_0x005c;
            default: goto L_0x002c;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(java.util.Locale r7) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0011
            java.lang.String r1 = r7.getScript()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0011
            return r1
        L_0x0011:
            java.lang.String r1 = r7.getCountry()
            java.lang.String r2 = r7.getLanguage()
            int r0 = r2.hashCode()
            switch(r0) {
                case 3129: goto L_0x002f;
                case 3569: goto L_0x0037;
                case 3679: goto L_0x003f;
                case 3749: goto L_0x0048;
                case 3886: goto L_0x0051;
                default: goto L_0x0020;
            }
        L_0x0020:
            r6 = -1
        L_0x0021:
            java.lang.String r5 = "Cyrl"
            java.lang.String r4 = "CN"
            java.lang.String r3 = "Latn"
            java.lang.String r2 = "Arab"
            switch(r6) {
                case 0: goto L_0x008e;
                case 1: goto L_0x00a6;
                case 2: goto L_0x0076;
                case 3: goto L_0x007f;
                case 4: goto L_0x005c;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.String r0 = ""
            return r0
        L_0x002f:
            java.lang.String r0 = "az"
            boolean r0 = r2.equals(r0)
            r6 = 0
            goto L_0x0059
        L_0x0037:
            java.lang.String r0 = "pa"
            boolean r0 = r2.equals(r0)
            r6 = 1
            goto L_0x0059
        L_0x003f:
            java.lang.String r0 = "sr"
            boolean r0 = r2.equals(r0)
            r6 = 2
            goto L_0x0059
        L_0x0048:
            java.lang.String r0 = "uz"
            boolean r0 = r2.equals(r0)
            r6 = 3
            goto L_0x0059
        L_0x0051:
            java.lang.String r0 = "zh"
            boolean r0 = r2.equals(r0)
            r6 = 4
        L_0x0059:
            if (r0 != 0) goto L_0x0021
            goto L_0x0020
        L_0x005c:
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = "SG"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0073
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = "Hant"
            return r0
        L_0x0073:
            java.lang.String r0 = "Hans"
            return r0
        L_0x0076:
            java.lang.String r0 = "ME"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ba
            return r3
        L_0x007f:
            java.lang.String r0 = "AF"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x008d
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x0099
        L_0x008d:
            return r2
        L_0x008e:
            java.lang.String r1 = r7.getCountry()
            int r0 = r1.hashCode()
            switch(r0) {
                case 2344: goto L_0x009a;
                case 2345: goto L_0x009d;
                case 2627: goto L_0x00b1;
                default: goto L_0x0099;
            }
        L_0x0099:
            return r3
        L_0x009a:
            java.lang.String r0 = "IQ"
            goto L_0x009f
        L_0x009d:
            java.lang.String r0 = "IR"
        L_0x009f:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00b0
            return r3
        L_0x00a6:
            java.lang.String r0 = "PK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b0
            java.lang.String r2 = "Guru"
        L_0x00b0:
            return r2
        L_0x00b1:
            java.lang.String r0 = "RU"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ba
            return r3
        L_0x00ba:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WH.A02(java.util.Locale):java.lang.String");
    }

    public static String A03(Locale locale) {
        char c2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance(locale);
            if (i2 >= 28) {
                return instance.getDigitStrings()[0];
            }
            c2 = instance.getZeroDigit();
        } else {
            c2 = java.text.DecimalFormatSymbols.getInstance(locale).getZeroDigit();
        }
        return Character.toString(c2);
    }

    public static String A04(Locale locale) {
        String language = locale.getLanguage();
        switch (language.hashCode()) {
            case 3365:
                if (language.equals("in")) {
                    return "id";
                }
                break;
            case 3374:
                if (language.equals("iw")) {
                    return "he";
                }
                break;
            case 3588:
                if (language.equals(Language.PORTUGUESE)) {
                    return C33171i9.A00.contains(locale.getCountry()) ? "pt-PT" : "pt-BR";
                }
                break;
            case 3704:
                if (language.equals("tl")) {
                    return "fil";
                }
                break;
            case 3886:
                if (language.equals("zh")) {
                    return "Hans".equals(A02(locale)) ? "zh-Hans" : "zh-Hant";
                }
                break;
        }
        return language;
    }

    public static String A05(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            return locale.toLanguageTag();
        }
        return C012606e.A02(locale).A00.Agt();
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0012 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A06(java.util.Locale r5) {
        /*
            java.lang.String r1 = r5.getLanguage()
            int r0 = r1.hashCode()
            r4 = -1
            switch(r0) {
                case 3129: goto L_0x002c;
                case 3325: goto L_0x0036;
                case 3355: goto L_0x0040;
                case 3569: goto L_0x004a;
                case 3672: goto L_0x0054;
                case 3679: goto L_0x005f;
                case 3749: goto L_0x006a;
                case 3886: goto L_0x0075;
                case 101385: goto L_0x0080;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.String r3 = "Latn"
            r2 = 0
            switch(r4) {
                case 0: goto L_0x0021;
                case 1: goto L_0x008b;
                case 2: goto L_0x008e;
                case 3: goto L_0x0013;
                case 4: goto L_0x0091;
                case 5: goto L_0x001a;
                case 6: goto L_0x0021;
                case 7: goto L_0x0098;
                case 8: goto L_0x0094;
                default: goto L_0x0012;
            }
        L_0x0012:
            return r1
        L_0x0013:
            java.lang.String r0 = A02(r5)
            java.lang.String r3 = "Guru"
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = A02(r5)
            java.lang.String r3 = "Cyrl"
            goto L_0x0025
        L_0x0021:
            java.lang.String r0 = A02(r5)
        L_0x0025:
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0012
            return r2
        L_0x002c:
            java.lang.String r0 = "az"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            r4 = 0
            goto L_0x000c
        L_0x0036:
            java.lang.String r0 = "he"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            r4 = 1
            goto L_0x000c
        L_0x0040:
            java.lang.String r0 = "id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            r4 = 2
            goto L_0x000c
        L_0x004a:
            java.lang.String r0 = "pa"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            r4 = 3
            goto L_0x000c
        L_0x0054:
            java.lang.String r0 = "sk"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            r4 = 4
            goto L_0x000c
        L_0x005f:
            java.lang.String r0 = "sr"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            r4 = 5
            goto L_0x000c
        L_0x006a:
            java.lang.String r0 = "uz"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            r4 = 6
            goto L_0x000c
        L_0x0075:
            java.lang.String r0 = "zh"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            r4 = 7
            goto L_0x000c
        L_0x0080:
            java.lang.String r0 = "fil"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            r4 = 8
            goto L_0x000c
        L_0x008b:
            java.lang.String r0 = "iw"
            return r0
        L_0x008e:
            java.lang.String r0 = "in"
            return r0
        L_0x0091:
            java.lang.String r0 = "cs"
            return r0
        L_0x0094:
            java.lang.String r0 = "tl"
            return r0
        L_0x0098:
            java.lang.String r1 = r5.getCountry()
            java.lang.String r0 = "HK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = "zh-rHK"
            return r0
        L_0x00a8:
            java.lang.String r1 = A02(r5)
            java.lang.String r0 = "Hans"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = "zh-rCN"
            return r0
        L_0x00b8:
            java.lang.String r0 = "zh-rTW"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WH.A06(java.util.Locale):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r1 = r8.charAt(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A07(java.util.Locale r9, java.lang.String r10) {
        /*
            X.00O r1 = X.AnonymousClass28f.A01
            java.lang.String r0 = r9.getLanguage()
            java.lang.Object r7 = r1.get(r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            if (r7 == 0) goto L_0x009b
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r2 < r0) goto L_0x011a
            android.icu.text.DecimalFormatSymbols r1 = android.icu.text.DecimalFormatSymbols.getInstance(r9)
            r0 = 28
            if (r2 < r0) goto L_0x0104
            java.lang.String[] r6 = r1.getDigitStrings()
        L_0x0020:
            boolean r0 = java.util.Arrays.equals(r7, r6)
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = "[0-9]"
        L_0x0028:
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r9 = r0.matcher(r10)
            boolean r0 = r9.find()
            if (r0 == 0) goto L_0x009b
            int r5 = r10.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r3 = 0
            r1 = 0
        L_0x0041:
            int r0 = r9.start()
            if (r1 >= r0) goto L_0x004e
            java.lang.String r0 = r10.substring(r1, r0)
            r4.append(r0)
        L_0x004e:
            java.lang.String r8 = r9.group()
            int r1 = r8.length()
            r0 = 1
            if (r1 != r0) goto L_0x00a3
            char r1 = r8.charAt(r3)
            r0 = 48
            if (r0 > r1) goto L_0x00a3
            r0 = 57
            if (r1 > r0) goto L_0x00a3
            int r0 = r1 + -48
            r2 = r6[r0]
        L_0x0069:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x007a
            r1 = 0
        L_0x0070:
            r0 = r7[r1]
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x009c
            r2 = r6[r1]
        L_0x007a:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0081
            r8 = r2
        L_0x0081:
            r4.append(r8)
            int r1 = r9.end()
            boolean r0 = r9.find()
            if (r0 != 0) goto L_0x0041
            if (r1 >= r5) goto L_0x0097
            java.lang.String r0 = r10.substring(r1)
            r4.append(r0)
        L_0x0097:
            java.lang.String r10 = r4.toString()
        L_0x009b:
            return r10
        L_0x009c:
            int r1 = r1 + 1
            r0 = 10
            if (r1 >= r0) goto L_0x007a
            goto L_0x0070
        L_0x00a3:
            java.lang.String r2 = ""
            goto L_0x0069
        L_0x00a6:
            java.lang.String[] r0 = A04
            boolean r0 = java.util.Arrays.equals(r0, r6)
            if (r0 == 0) goto L_0x00d2
            r0 = 19
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = 0
            r0 = r7[r0]
            r2.append(r0)
            r1 = 1
        L_0x00bc:
            r0 = 124(0x7c, float:1.74E-43)
            r2.append(r0)
            r0 = r7[r1]
            r2.append(r0)
            int r1 = r1 + 1
            r0 = 10
            if (r1 < r0) goto L_0x00bc
            java.lang.String r0 = r2.toString()
            goto L_0x0028
        L_0x00d2:
            java.lang.String r0 = "[0-9]|"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r0 = 19
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = 0
            r0 = r7[r0]
            r2.append(r0)
            r1 = 1
        L_0x00e7:
            r0 = 124(0x7c, float:1.74E-43)
            r2.append(r0)
            r0 = r7[r1]
            r2.append(r0)
            int r1 = r1 + 1
            r0 = 10
            if (r1 < r0) goto L_0x00e7
            java.lang.String r0 = r2.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x0028
        L_0x0104:
            char[] r3 = r1.getDigits()
            r2 = 10
            java.lang.String[] r6 = new java.lang.String[r2]
            r1 = 0
        L_0x010d:
            char r0 = r3[r1]
            java.lang.String r0 = java.lang.Character.toString(r0)
            r6[r1] = r0
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0020
            goto L_0x010d
        L_0x011a:
            java.text.DecimalFormatSymbols r0 = java.text.DecimalFormatSymbols.getInstance(r9)
            char r0 = r0.getZeroDigit()
            java.lang.String[] r6 = A0D(r0)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WH.A07(java.util.Locale, java.lang.String):java.lang.String");
    }

    public static String A08(Locale[] localeArr) {
        int length = localeArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(length * 6);
        sb.append(A05(localeArr[0]));
        for (int i2 = 1; i2 < length; i2++) {
            sb.append(',');
            sb.append(A05(localeArr[i2]));
        }
        return sb.toString();
    }

    public static Locale A09(String str) {
        return Build.VERSION.SDK_INT >= 21 ? Locale.forLanguageTag(str) : C012606e.A01(str).A00.A9b(0);
    }

    public static boolean A0A(String str) {
        return str != null && A02.matcher(str).matches();
    }

    public static boolean A0B(String str) {
        return str != null && A03.matcher(str).matches();
    }

    public static boolean A0C(String str) {
        boolean z2;
        Object obj = A01;
        synchronized (obj) {
            if (A00 == null) {
                String[] locales = Resources.getSystem().getAssets().getLocales();
                if (Build.VERSION.SDK_INT >= 21) {
                    A00 = new HashSet(Arrays.asList(locales));
                } else {
                    A00 = new HashSet(r5);
                    for (String replace : locales) {
                        A00.add(replace.replace('_', '-'));
                    }
                }
            }
        }
        synchronized (obj) {
            if (A00.contains(str)) {
                z2 = true;
            } else {
                z2 = A00.contains(A09(str).getLanguage());
            }
        }
        return z2;
    }

    public static String[] A0D(char c2) {
        String[] strArr = new String[10];
        int i2 = 0;
        do {
            strArr[i2] = Character.toString((char) (c2 + i2));
            i2++;
        } while (i2 < 10);
        return strArr;
    }
}
