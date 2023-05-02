package X;

import android.graphics.Color;
import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;

/* renamed from: X.4ea  reason: invalid class name and case insensitive filesystem */
public final class C90664ea {
    public static final Map A00;
    public static final Map A01;
    public static final Pattern A02 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern A03 = Pattern.compile("(\\S+?):(\\S+)");

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("white", Integer.valueOf(Color.rgb(MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK)));
        A0x.put("lime", Integer.valueOf(Color.rgb(0, MotionEventCompat.ACTION_MASK, 0)));
        A0x.put("cyan", Integer.valueOf(Color.rgb(0, MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK)));
        A0x.put("red", Integer.valueOf(Color.rgb(MotionEventCompat.ACTION_MASK, 0, 0)));
        A0x.put("yellow", Integer.valueOf(Color.rgb(MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK, 0)));
        A0x.put("magenta", Integer.valueOf(Color.rgb(MotionEventCompat.ACTION_MASK, 0, MotionEventCompat.ACTION_MASK)));
        A0x.put("blue", Integer.valueOf(Color.rgb(0, 0, MotionEventCompat.ACTION_MASK)));
        A0x.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        A01 = Collections.unmodifiableMap(A0x);
        HashMap A0x2 = AnonymousClass000.A0x();
        A0x2.put("bg_white", Integer.valueOf(Color.rgb(MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK)));
        A0x2.put("bg_lime", Integer.valueOf(Color.rgb(0, MotionEventCompat.ACTION_MASK, 0)));
        A0x2.put("bg_cyan", Integer.valueOf(Color.rgb(0, MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK)));
        A0x2.put("bg_red", Integer.valueOf(Color.rgb(MotionEventCompat.ACTION_MASK, 0, 0)));
        A0x2.put("bg_yellow", Integer.valueOf(Color.rgb(MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK, 0)));
        A0x2.put("bg_magenta", Integer.valueOf(Color.rgb(MotionEventCompat.ACTION_MASK, 0, MotionEventCompat.ACTION_MASK)));
        A0x2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, MotionEventCompat.ACTION_MASK)));
        A0x2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        A00 = Collections.unmodifiableMap(A0x2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013d, code lost:
        r7 = X.AnonymousClass000.A0r("ignoring unsupported entity: '&");
        r7.append(r6);
        android.util.Log.w("WebvttCueParser", X.AnonymousClass000.A0h(";'", r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0151, code lost:
        if (r5 != r3) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0153, code lost:
        r4.append(" ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0158, code lost:
        r6 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0187, code lost:
        r4.append(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannedString A00(java.lang.String r12, java.lang.String r13, java.util.List r14) {
        /*
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()
            r6 = 0
        L_0x000f:
            int r5 = r13.length()
            if (r6 >= r5) goto L_0x0197
            char r7 = r13.charAt(r6)
            r0 = 38
            if (r7 == r0) goto L_0x011e
            r0 = 60
            if (r7 == r0) goto L_0x0027
            r4.append(r7)
            int r6 = r6 + 1
            goto L_0x000f
        L_0x0027:
            int r9 = r6 + 1
            if (r9 >= r5) goto L_0x0080
            char r0 = r13.charAt(r9)
            r7 = 47
            r11 = 1
            boolean r10 = X.AnonymousClass000.A1R(r0, r7)
            r0 = 62
            int r3 = r13.indexOf(r0, r9)
            r0 = -1
            if (r3 == r0) goto L_0x0041
            int r5 = r3 + 1
        L_0x0041:
            r9 = r5
            int r3 = r5 + -2
            char r0 = r13.charAt(r3)
            boolean r8 = X.AnonymousClass000.A1R(r0, r7)
            if (r10 == 0) goto L_0x004f
            r11 = 2
        L_0x004f:
            int r6 = r6 + r11
            if (r8 != 0) goto L_0x0054
            int r3 = r5 + -1
        L_0x0054:
            java.lang.String r7 = r13.substring(r6, r3)
            java.lang.String r0 = r7.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0080
            java.lang.String r5 = r7.trim()
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            X.C90524eJ.A03(r0)
            java.lang.String r3 = "[ \\.]"
            r0 = 2
            java.lang.String[] r3 = r5.split(r3, r0)
            r0 = 0
            r6 = r3[r0]
            int r0 = r6.hashCode()
            switch(r0) {
                case 98: goto L_0x0082;
                case 99: goto L_0x0085;
                case 105: goto L_0x0088;
                case 117: goto L_0x008b;
                case 118: goto L_0x008e;
                case 3650: goto L_0x0091;
                case 3314158: goto L_0x0094;
                case 3511770: goto L_0x0097;
                default: goto L_0x0080;
            }
        L_0x0080:
            r6 = r9
            goto L_0x000f
        L_0x0082:
            java.lang.String r0 = "b"
            goto L_0x0099
        L_0x0085:
            java.lang.String r0 = "c"
            goto L_0x0099
        L_0x0088:
            java.lang.String r0 = "i"
            goto L_0x0099
        L_0x008b:
            java.lang.String r0 = "u"
            goto L_0x0099
        L_0x008e:
            java.lang.String r0 = "v"
            goto L_0x0099
        L_0x0091:
            java.lang.String r0 = "rt"
            goto L_0x0099
        L_0x0094:
            java.lang.String r0 = "lang"
            goto L_0x0099
        L_0x0097:
            java.lang.String r0 = "ruby"
        L_0x0099:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0080
            if (r10 != 0) goto L_0x00ef
            if (r8 != 0) goto L_0x0080
            int r8 = r4.length()
            java.lang.String r6 = r7.trim()
            boolean r0 = r6.isEmpty()
            r10 = 1
            r0 = r0 ^ 1
            X.C90524eJ.A03(r0)
            java.lang.String r0 = " "
            int r3 = r6.indexOf(r0)
            r0 = -1
            r5 = 0
            if (r3 != r0) goto L_0x00d9
            java.lang.String r7 = ""
        L_0x00c1:
            java.lang.String r3 = "\\."
            r0 = -1
            java.lang.String[] r6 = r6.split(r3, r0)
            r5 = r6[r5]
            java.util.HashSet r3 = X.C13680ns.A0o()
        L_0x00ce:
            int r0 = r6.length
            if (r10 >= r0) goto L_0x00e6
            r0 = r6[r10]
            r3.add(r0)
            int r10 = r10 + 1
            goto L_0x00ce
        L_0x00d9:
            java.lang.String r0 = r6.substring(r3)
            java.lang.String r7 = r0.trim()
            java.lang.String r6 = r6.substring(r5, r3)
            goto L_0x00c1
        L_0x00e6:
            X.1jy r0 = new X.1jy
            r0.<init>(r5, r7, r3, r8)
            r2.push(r0)
            goto L_0x0080
        L_0x00ef:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0080
            java.lang.Object r5 = r2.pop()
            X.1jy r5 = (X.C34261jy) r5
            A03(r4, r5, r12, r1, r14)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x011a
            int r3 = r4.length()
            X.1jx r0 = new X.1jx
            r0.<init>(r5, r3)
            r1.add(r0)
        L_0x0110:
            java.lang.String r0 = r5.A01
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00ef
            goto L_0x0080
        L_0x011a:
            r1.clear()
            goto L_0x0110
        L_0x011e:
            r0 = 59
            int r6 = r6 + 1
            int r5 = r13.indexOf(r0, r6)
            r0 = 32
            int r3 = r13.indexOf(r0, r6)
            r0 = -1
            if (r5 != r0) goto L_0x018b
            r5 = r3
        L_0x0130:
            if (r5 == r0) goto L_0x0192
            java.lang.String r6 = r13.substring(r6, r5)
            int r0 = r6.hashCode()
            switch(r0) {
                case 3309: goto L_0x015c;
                case 3464: goto L_0x0167;
                case 96708: goto L_0x0172;
                case 3374865: goto L_0x017d;
                default: goto L_0x013d;
            }
        L_0x013d:
            java.lang.String r0 = "ignoring unsupported entity: '&"
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0r(r0)
            r7.append(r6)
            java.lang.String r0 = ";'"
            java.lang.String r6 = X.AnonymousClass000.A0h(r0, r7)
            java.lang.String r0 = "WebvttCueParser"
            android.util.Log.w(r0, r6)
        L_0x0151:
            if (r5 != r3) goto L_0x0158
            java.lang.String r0 = " "
            r4.append(r0)
        L_0x0158:
            int r6 = r5 + 1
            goto L_0x000f
        L_0x015c:
            java.lang.String r0 = "gt"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x013d
            r0 = 62
            goto L_0x0187
        L_0x0167:
            java.lang.String r0 = "lt"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x013d
            r0 = 60
            goto L_0x0187
        L_0x0172:
            java.lang.String r0 = "amp"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x013d
            r0 = 38
            goto L_0x0187
        L_0x017d:
            java.lang.String r0 = "nbsp"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x013d
            r0 = 32
        L_0x0187:
            r4.append(r0)
            goto L_0x0151
        L_0x018b:
            if (r3 == r0) goto L_0x0130
            int r5 = java.lang.Math.min(r5, r3)
            goto L_0x0130
        L_0x0192:
            r4.append(r7)
            goto L_0x000f
        L_0x0197:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x01a7
            java.lang.Object r0 = r2.pop()
            X.1jy r0 = (X.C34261jy) r0
            A03(r4, r0, r12, r1, r14)
            goto L_0x0197
        L_0x01a7:
            java.util.Set r3 = java.util.Collections.emptySet()
            java.lang.String r2 = ""
            r0 = 0
            X.1jy r1 = new X.1jy
            r1.<init>(r2, r2, r3, r0)
            java.util.List r0 = java.util.Collections.emptyList()
            A03(r4, r1, r12, r0, r14)
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90664ea.A00(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static C34241jw A01(C90504eH r5, String str, List list, Matcher matcher) {
        AnonymousClass4SH r3 = new AnonymousClass4SH();
        try {
            r3.A09 = C89664cd.A01(matcher.group(1));
            r3.A08 = C89664cd.A01(matcher.group(2));
            A04(r3, matcher.group(3));
            StringBuilder A0o = AnonymousClass000.A0o();
            while (true) {
                String A0L = r5.A0L();
                if (!TextUtils.isEmpty(A0L)) {
                    if (A0o.length() > 0) {
                        A0o.append(IOUtils.LINE_SEPARATOR_UNIX);
                    }
                    A0o.append(A0L.trim());
                } else {
                    r3.A0A = A00(str, A0o.toString(), list);
                    return new C34241jw(r3.A00().A00(), r3.A09, r3.A08);
                }
            }
        } catch (NumberFormatException unused) {
            Log.w("WebvttCueParser", AnonymousClass000.A0h(matcher.group(), AnonymousClass000.A0r("Skipping cue with bad header: ")));
            return null;
        }
    }

    public static List A02(C34261jy r10, String str, List list) {
        int size;
        ArrayList A0u = AnonymousClass000.A0u();
        for (int i2 = 0; i2 < list.size(); i2++) {
            AnonymousClass4P7 r2 = (AnonymousClass4P7) list.get(i2);
            String str2 = r10.A01;
            Set set = r10.A03;
            String str3 = r10.A02;
            if (!r2.A07.isEmpty() || !r2.A08.isEmpty() || !r2.A0A.isEmpty() || !r2.A09.isEmpty()) {
                String str4 = r2.A07;
                int i3 = 0;
                if (!str4.isEmpty()) {
                    i3 = -1;
                    if (str4.equals(str)) {
                        i3 = 1073741824;
                    }
                }
                String str5 = r2.A08;
                if (!str5.isEmpty()) {
                    int i4 = -1;
                    if (i3 != -1) {
                        if (str5.equals(str2)) {
                            i4 = i3 + 2;
                        }
                        i3 = i4;
                    }
                }
                String str6 = r2.A09;
                if (!str6.isEmpty()) {
                    if (i3 != -1 && str6.equals(str3)) {
                        i3 += 4;
                    }
                }
                if (i3 != -1 && set.containsAll(r2.A0A)) {
                    size = i3 + (r2.A0A.size() << 2);
                }
            } else {
                size = TextUtils.isEmpty(str2);
            }
            if (size > 0) {
                A0u.add(new C1043254w(r2, size));
            }
        }
        Collections.sort(A0u);
        return A0u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e9, code lost:
        if (r1.equals(r0) != false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f7, code lost:
        switch(r0) {
            case 1: goto L_0x01c6;
            case 2: goto L_0x0182;
            case 3: goto L_0x0179;
            default: goto L_0x00fa;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fa, code lost:
        r14.setSpan(new android.text.style.UnderlineSpan(), r5, r4, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0102, code lost:
        r7 = A02(r8, r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010a, code lost:
        if (r3 >= r7.size()) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010c, code lost:
        r8 = ((X.C1043254w) r7.get(r3)).A01;
        r10 = r8.A01;
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0117, code lost:
        if (r10 != -1) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011b, code lost:
        if (r8.A03 != -1) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0120, code lost:
        if (r1 == -1) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0122, code lost:
        X.AnonymousClass455.A00(r9, new android.text.style.StyleSpan(r1), r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012c, code lost:
        if (r8.A05 != 1) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012e, code lost:
        r9.setSpan(new android.text.style.UnderlineSpan(), r5, r4, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0138, code lost:
        if (r8.A0D == false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013a, code lost:
        X.AnonymousClass455.A00(r9, new android.text.style.ForegroundColorSpan(r8.A02), r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0146, code lost:
        if (r8.A0C == false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0148, code lost:
        X.AnonymousClass455.A00(r9, new android.text.style.BackgroundColorSpan(r8.A00), r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0152, code lost:
        r1 = r8.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0154, code lost:
        if (r1 == null) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0156, code lost:
        X.AnonymousClass455.A00(r9, new android.text.style.TypefaceSpan(r1), r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0160, code lost:
        if (r8.A0B == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0162, code lost:
        r9.setSpan(new X.AnonymousClass454(), r5, r4, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016a, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016d, code lost:
        r6 = 0;
        r1 = X.AnonymousClass000.A1R(r10, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0174, code lost:
        if (r8.A03 != 1) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0176, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0177, code lost:
        r1 = r1 | r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0179, code lost:
        r14.setSpan(new android.text.style.StyleSpan(2), r5, r4, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0182, code lost:
        r12 = r15.A03.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018c, code lost:
        if (r12.hasNext() == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018e, code lost:
        r11 = r12.next();
        r1 = A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019a, code lost:
        if (r1.containsKey(r11) == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x019c, code lost:
        r14.setSpan(new android.text.style.ForegroundColorSpan(X.AnonymousClass000.A0D(r1.get(r11))), r5, r4, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ad, code lost:
        r1 = A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b3, code lost:
        if (r1.containsKey(r11) == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b5, code lost:
        r14.setSpan(new android.text.style.BackgroundColorSpan(X.AnonymousClass000.A0D(r1.get(r11))), r5, r4, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c6, code lost:
        r14.setSpan(new android.text.style.StyleSpan(1), r5, r4, 33);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.text.SpannableStringBuilder r14, X.C34261jy r15, java.lang.String r16, java.util.List r17, java.util.List r18) {
        /*
            r8 = r15
            int r5 = r15.A00
            r9 = r14
            int r4 = r14.length()
            java.lang.String r1 = r15.A01
            int r0 = r1.hashCode()
            r10 = 2
            r3 = 0
            r2 = 1
            r7 = r16
            r6 = r18
            switch(r0) {
                case 0: goto L_0x00e3;
                case 98: goto L_0x00ec;
                case 99: goto L_0x00da;
                case 105: goto L_0x00d0;
                case 117: goto L_0x0019;
                case 118: goto L_0x00cd;
                case 3314158: goto L_0x00ca;
                case 3511770: goto L_0x0024;
                default: goto L_0x0018;
            }
        L_0x0018:
            return
        L_0x0019:
            java.lang.String r0 = "u"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 4
            goto L_0x00f5
        L_0x0024:
            java.lang.String r0 = "ruby"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.util.List r11 = A02(r15, r7, r6)
            r10 = 0
        L_0x0031:
            int r0 = r11.size()
            r1 = -1
            if (r10 >= r0) goto L_0x0047
            java.lang.Object r0 = r11.get(r10)
            X.54w r0 = (X.C1043254w) r0
            X.4P7 r0 = r0.A01
            int r13 = r0.A04
            if (r13 != r1) goto L_0x0048
            int r10 = r10 + 1
            goto L_0x0031
        L_0x0047:
            r13 = -1
        L_0x0048:
            r1 = r17
            int r0 = r1.size()
            java.util.ArrayList r12 = X.C13690nt.A0i(r0)
            r12.addAll(r1)
            java.util.Comparator r0 = X.C34251jx.A02
            java.util.Collections.sort(r12, r0)
            r18 = r5
            r11 = 0
            r17 = 0
        L_0x005f:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x0102
            java.lang.Object r0 = r12.get(r11)
            X.1jx r0 = (X.C34251jx) r0
            X.1jy r0 = r0.A01
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "rt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r15 = r12.get(r11)
            X.1jx r15 = (X.C34251jx) r15
            X.1jy r14 = r15.A01
            java.util.List r16 = A02(r14, r7, r6)
            r10 = 0
        L_0x0084:
            int r0 = r16.size()
            r1 = -1
            if (r10 >= r0) goto L_0x009c
            r0 = r16
            java.lang.Object r0 = r0.get(r10)
            X.54w r0 = (X.C1043254w) r0
            X.4P7 r0 = r0.A01
            int r0 = r0.A04
            if (r0 != r1) goto L_0x00a0
            int r10 = r10 + 1
            goto L_0x0084
        L_0x009c:
            r0 = 1
            if (r13 == r1) goto L_0x00a0
            r0 = r13
        L_0x00a0:
            int r1 = r14.A00
            int r1 = r1 - r17
            int r10 = r15.A00
            int r10 = r10 - r17
            java.lang.CharSequence r15 = r9.subSequence(r1, r10)
            r9.delete(r1, r10)
            java.lang.String r10 = r15.toString()
            X.4GJ r14 = new X.4GJ
            r14.<init>(r10, r0)
            r10 = 33
            r0 = r18
            r9.setSpan(r14, r0, r1, r10)
            int r0 = r15.length()
            int r17 = r17 + r0
            r18 = r1
        L_0x00c7:
            int r11 = r11 + 1
            goto L_0x005f
        L_0x00ca:
            java.lang.String r0 = "lang"
            goto L_0x00e5
        L_0x00cd:
            java.lang.String r0 = "v"
            goto L_0x00e5
        L_0x00d0:
            java.lang.String r0 = "i"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 3
            goto L_0x00f5
        L_0x00da:
            java.lang.String r0 = "c"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0182
            return
        L_0x00e3:
            java.lang.String r0 = ""
        L_0x00e5:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0102
            return
        L_0x00ec:
            java.lang.String r0 = "b"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 1
        L_0x00f5:
            r1 = 33
            switch(r0) {
                case 1: goto L_0x01c6;
                case 2: goto L_0x0182;
                case 3: goto L_0x0179;
                default: goto L_0x00fa;
            }
        L_0x00fa:
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r14.setSpan(r0, r5, r4, r1)
        L_0x0102:
            java.util.List r7 = A02(r8, r7, r6)
        L_0x0106:
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x0018
            java.lang.Object r0 = r7.get(r3)
            X.54w r0 = (X.C1043254w) r0
            X.4P7 r8 = r0.A01
            int r10 = r8.A01
            r1 = -1
            if (r10 != r1) goto L_0x016d
            int r0 = r8.A03
            if (r0 != r1) goto L_0x016d
        L_0x011d:
            r0 = -1
            r6 = 33
            if (r1 == r0) goto L_0x012a
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            X.AnonymousClass455.A00(r9, r0, r5, r4)
        L_0x012a:
            int r0 = r8.A05
            if (r0 != r2) goto L_0x0136
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r9.setSpan(r0, r5, r4, r6)
        L_0x0136:
            boolean r0 = r8.A0D
            if (r0 == 0) goto L_0x0144
            int r1 = r8.A02
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            X.AnonymousClass455.A00(r9, r0, r5, r4)
        L_0x0144:
            boolean r0 = r8.A0C
            if (r0 == 0) goto L_0x0152
            int r1 = r8.A00
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r1)
            X.AnonymousClass455.A00(r9, r0, r5, r4)
        L_0x0152:
            java.lang.String r1 = r8.A06
            if (r1 == 0) goto L_0x015e
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r1)
            X.AnonymousClass455.A00(r9, r0, r5, r4)
        L_0x015e:
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x016a
            X.454 r0 = new X.454
            r0.<init>()
            r9.setSpan(r0, r5, r4, r6)
        L_0x016a:
            int r3 = r3 + 1
            goto L_0x0106
        L_0x016d:
            r6 = 0
            boolean r1 = X.AnonymousClass000.A1R(r10, r2)
            int r0 = r8.A03
            if (r0 != r2) goto L_0x0177
            r6 = 2
        L_0x0177:
            r1 = r1 | r6
            goto L_0x011d
        L_0x0179:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r10)
            r14.setSpan(r0, r5, r4, r1)
            goto L_0x0102
        L_0x0182:
            java.util.Set r0 = r15.A03
            java.util.Iterator r12 = r0.iterator()
        L_0x0188:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0102
            java.lang.Object r11 = r12.next()
            java.util.Map r1 = A01
            boolean r0 = r1.containsKey(r11)
            r10 = 33
            if (r0 == 0) goto L_0x01ad
            java.lang.Object r0 = r1.get(r11)
            int r1 = X.AnonymousClass000.A0D(r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r14.setSpan(r0, r5, r4, r10)
            goto L_0x0188
        L_0x01ad:
            java.util.Map r1 = A00
            boolean r0 = r1.containsKey(r11)
            if (r0 == 0) goto L_0x0188
            java.lang.Object r0 = r1.get(r11)
            int r1 = X.AnonymousClass000.A0D(r0)
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r1)
            r14.setSpan(r0, r5, r4, r10)
            goto L_0x0188
        L_0x01c6:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r2)
            r14.setSpan(r0, r5, r4, r1)
            goto L_0x0102
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90664ea.A03(android.text.SpannableStringBuilder, X.1jy, java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r6.equals(r0) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r7.A03 = r0;
        r4 = r4.substring(0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        android.util.Log.w("WebvttCueParser", X.AnonymousClass000.A0h(r4, X.AnonymousClass000.A0r("Invalid alignment value: ")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d8, code lost:
        if (r4.equals(r0) != false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e3, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e4, code lost:
        r7.A06 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0123, code lost:
        if (r5.equals(r0) == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012c, code lost:
        if (r5.equals(r0) == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0135, code lost:
        if (r5.equals(r0) == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013b, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013d, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x013f, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0140, code lost:
        r7.A05 = r0;
        r4 = r4.substring(0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass4SH r7, java.lang.String r8) {
        /*
            java.lang.String r2 = "WebvttCueParser"
            java.util.regex.Pattern r0 = A03
            java.util.regex.Matcher r3 = r0.matcher(r8)
        L_0x0008:
            boolean r0 = r3.find()
            if (r0 == 0) goto L_0x01bb
            r0 = 1
            java.lang.String r5 = r3.group(r0)
            r0 = 2
            java.lang.String r4 = r3.group(r0)
            java.lang.String r0 = "line"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x008e
            r0 = 44
            int r5 = r4.indexOf(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            r1 = 0
            r0 = -1
            if (r5 == r0) goto L_0x0071
            int r0 = r5 + 1
            java.lang.String r6 = r4.substring(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            int r0 = r6.hashCode()     // Catch:{ NumberFormatException -> 0x01a8 }
            switch(r0) {
                case -1364013995: goto L_0x0045;
                case -1074341483: goto L_0x0048;
                case 100571: goto L_0x0051;
                case 109757538: goto L_0x005a;
                default: goto L_0x0037;
            }     // Catch:{ NumberFormatException -> 0x01a8 }
        L_0x0037:
            java.lang.String r0 = "Invalid anchor value: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            android.util.Log.w(r2, r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            goto L_0x0063
        L_0x0045:
            java.lang.String r0 = "center"
            goto L_0x004a
        L_0x0048:
            java.lang.String r0 = "middle"
        L_0x004a:
            boolean r0 = r6.equals(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x0037
            goto L_0x0066
        L_0x0051:
            java.lang.String r0 = "end"
            boolean r0 = r6.equals(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x0037
            goto L_0x0068
        L_0x005a:
            java.lang.String r0 = "start"
            boolean r0 = r6.equals(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x0037
            goto L_0x006a
        L_0x0063:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x006b
        L_0x0066:
            r0 = 1
            goto L_0x006b
        L_0x0068:
            r0 = 2
            goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            r7.A03 = r0     // Catch:{ NumberFormatException -> 0x01a8 }
            java.lang.String r4 = r4.substring(r1, r5)     // Catch:{ NumberFormatException -> 0x01a8 }
        L_0x0071:
            java.lang.String r0 = "%"
            boolean r0 = r4.endsWith(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x0082
            float r0 = X.C89664cd.A00(r4)     // Catch:{ NumberFormatException -> 0x01a8 }
            r7.A00 = r0     // Catch:{ NumberFormatException -> 0x01a8 }
            r7.A04 = r1     // Catch:{ NumberFormatException -> 0x01a8 }
            goto L_0x0008
        L_0x0082:
            int r0 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x01a8 }
            float r0 = (float) r0     // Catch:{ NumberFormatException -> 0x01a8 }
            r7.A00 = r0     // Catch:{ NumberFormatException -> 0x01a8 }
            r0 = 1
            r7.A04 = r0     // Catch:{ NumberFormatException -> 0x01a8 }
            goto L_0x0008
        L_0x008e:
            java.lang.String r0 = "align"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x00e8
            int r0 = r4.hashCode()     // Catch:{ NumberFormatException -> 0x01a8 }
            switch(r0) {
                case -1364013995: goto L_0x00d2;
                case -1074341483: goto L_0x00cf;
                case 100571: goto L_0x00c6;
                case 3317767: goto L_0x00bd;
                case 108511772: goto L_0x00b4;
                case 109757538: goto L_0x00ab;
                default: goto L_0x009d;
            }     // Catch:{ NumberFormatException -> 0x01a8 }
        L_0x009d:
            java.lang.String r0 = "Invalid alignment value: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            android.util.Log.w(r2, r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            goto L_0x00e3
        L_0x00ab:
            java.lang.String r0 = "start"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x009d
            goto L_0x00db
        L_0x00b4:
            java.lang.String r0 = "right"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x009d
            goto L_0x00dd
        L_0x00bd:
            java.lang.String r0 = "left"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x009d
            goto L_0x00df
        L_0x00c6:
            java.lang.String r0 = "end"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x009d
            goto L_0x00e1
        L_0x00cf:
            java.lang.String r0 = "middle"
            goto L_0x00d4
        L_0x00d2:
            java.lang.String r0 = "center"
        L_0x00d4:
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 != 0) goto L_0x00e3
            goto L_0x009d
        L_0x00db:
            r0 = 1
            goto L_0x00e4
        L_0x00dd:
            r0 = 5
            goto L_0x00e4
        L_0x00df:
            r0 = 4
            goto L_0x00e4
        L_0x00e1:
            r0 = 3
            goto L_0x00e4
        L_0x00e3:
            r0 = 2
        L_0x00e4:
            r7.A06 = r0     // Catch:{ NumberFormatException -> 0x01a8 }
            goto L_0x0008
        L_0x00e8:
            java.lang.String r0 = "position"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x014f
            r0 = 44
            int r1 = r4.indexOf(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            r0 = -1
            if (r1 == r0) goto L_0x0147
            int r0 = r1 + 1
            java.lang.String r5 = r4.substring(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            int r0 = r5.hashCode()     // Catch:{ NumberFormatException -> 0x01a8 }
            switch(r0) {
                case -1842484672: goto L_0x0114;
                case -1364013995: goto L_0x0117;
                case -1276788989: goto L_0x011a;
                case -1074341483: goto L_0x011d;
                case 100571: goto L_0x0126;
                case 109757538: goto L_0x012f;
                default: goto L_0x0106;
            }     // Catch:{ NumberFormatException -> 0x01a8 }
        L_0x0106:
            java.lang.String r0 = "Invalid anchor value: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            android.util.Log.w(r2, r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            goto L_0x0138
        L_0x0114:
            java.lang.String r0 = "line-left"
            goto L_0x0131
        L_0x0117:
            java.lang.String r0 = "center"
            goto L_0x011f
        L_0x011a:
            java.lang.String r0 = "line-right"
            goto L_0x0128
        L_0x011d:
            java.lang.String r0 = "middle"
        L_0x011f:
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x0106
            goto L_0x013b
        L_0x0126:
            java.lang.String r0 = "end"
        L_0x0128:
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x0106
            goto L_0x013d
        L_0x012f:
            java.lang.String r0 = "start"
        L_0x0131:
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x0106
            goto L_0x013f
        L_0x0138:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0140
        L_0x013b:
            r0 = 1
            goto L_0x0140
        L_0x013d:
            r0 = 2
            goto L_0x0140
        L_0x013f:
            r0 = 0
        L_0x0140:
            r7.A05 = r0     // Catch:{ NumberFormatException -> 0x01a8 }
            r0 = 0
            java.lang.String r4 = r4.substring(r0, r1)     // Catch:{ NumberFormatException -> 0x01a8 }
        L_0x0147:
            float r0 = X.C89664cd.A00(r4)     // Catch:{ NumberFormatException -> 0x01a8 }
            r7.A01 = r0     // Catch:{ NumberFormatException -> 0x01a8 }
            goto L_0x0008
        L_0x014f:
            java.lang.String r0 = "size"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x015f
            float r0 = X.C89664cd.A00(r4)     // Catch:{ NumberFormatException -> 0x01a8 }
            r7.A02 = r0     // Catch:{ NumberFormatException -> 0x01a8 }
            goto L_0x0008
        L_0x015f:
            java.lang.String r0 = "vertical"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 == 0) goto L_0x018e
            java.lang.String r0 = "lr"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 != 0) goto L_0x0189
            java.lang.String r0 = "rl"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            if (r0 != 0) goto L_0x0187
            java.lang.String r0 = "Invalid 'vertical' value: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            android.util.Log.w(r2, r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x018a
        L_0x0187:
            r0 = 1
            goto L_0x018a
        L_0x0189:
            r0 = 2
        L_0x018a:
            r7.A07 = r0     // Catch:{ NumberFormatException -> 0x01a8 }
            goto L_0x0008
        L_0x018e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ NumberFormatException -> 0x01a8 }
            java.lang.String r0 = "Unknown cue setting "
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            r1.append(r5)     // Catch:{ NumberFormatException -> 0x01a8 }
            java.lang.String r0 = ":"
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r1)     // Catch:{ NumberFormatException -> 0x01a8 }
            android.util.Log.w(r2, r0)     // Catch:{ NumberFormatException -> 0x01a8 }
            goto L_0x0008
        L_0x01a8:
            java.lang.String r0 = "Skipping bad cue setting: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r3.group()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.util.Log.w(r2, r0)
            goto L_0x0008
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90664ea.A04(X.4SH, java.lang.String):void");
    }
}
