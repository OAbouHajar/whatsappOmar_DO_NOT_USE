package X;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.3VY  reason: invalid class name */
public final class AnonymousClass3VY extends C65323Ui {
    public static final AnonymousClass4Bx A01 = new AnonymousClass4Bx(15);
    public static final C84074Jd A02 = new C84074Jd(1, 1, 30.0f);
    public static final Pattern A03 = Pattern.compile("^(\\d+) (\\d+)$");
    public static final Pattern A04 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern A05 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern A06 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern A07 = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern A08 = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern A09 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public final XmlPullParserFactory A00;

    public AnonymousClass3VY() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.A00 = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        r1 = r1 * r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c9, code lost:
        r1 = r1 / r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A01(X.C84074Jd r12, java.lang.String r13) {
        /*
            java.util.regex.Pattern r0 = A04
            java.util.regex.Matcher r4 = r0.matcher(r13)
            boolean r0 = r4.matches()
            r10 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r7 = 4
            r9 = 3
            r8 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0068
            long r0 = X.C65323Ui.A00(r4, r1)
            r2 = 3600(0xe10, double:1.7786E-320)
            long r0 = r0 * r2
            double r5 = (double) r0
            long r2 = X.C65323Ui.A00(r4, r8)
            r0 = 60
            long r2 = r2 * r0
            double r0 = (double) r2
            double r5 = r5 + r0
            long r2 = X.C65323Ui.A00(r4, r9)
            double r0 = (double) r2
            double r5 = r5 + r0
            java.lang.String r0 = r4.group(r7)
            r2 = 0
            if (r0 == 0) goto L_0x0065
            double r0 = java.lang.Double.parseDouble(r0)
        L_0x0038:
            double r5 = r5 + r0
            r0 = 5
            java.lang.String r0 = r4.group(r0)
            if (r0 == 0) goto L_0x0062
            long r7 = java.lang.Long.parseLong(r0)
            float r1 = (float) r7
            float r0 = r12.A00
            float r1 = r1 / r0
            double r0 = (double) r1
        L_0x0049:
            double r5 = r5 + r0
            r0 = 6
            java.lang.String r0 = r4.group(r0)
            if (r0 == 0) goto L_0x005e
            long r0 = java.lang.Long.parseLong(r0)
            double r2 = (double) r0
            int r0 = r12.A01
            double r0 = (double) r0
            double r2 = r2 / r0
            float r0 = r12.A00
            double r0 = (double) r0
            double r2 = r2 / r0
        L_0x005e:
            double r5 = r5 + r2
            double r5 = r5 * r10
            long r3 = (long) r5
            return r3
        L_0x0062:
            r0 = 0
            goto L_0x0049
        L_0x0065:
            r0 = 0
            goto L_0x0038
        L_0x0068:
            java.util.regex.Pattern r0 = A06
            java.util.regex.Matcher r3 = r0.matcher(r13)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = r3.group(r1)
            double r1 = java.lang.Double.parseDouble(r0)
            java.lang.String r3 = r3.group(r8)
            int r0 = r3.hashCode()
            switch(r0) {
                case 102: goto L_0x008a;
                case 104: goto L_0x0096;
                case 109: goto L_0x00a4;
                case 116: goto L_0x00b0;
                case 3494: goto L_0x00bc;
                default: goto L_0x0087;
            }
        L_0x0087:
            double r1 = r1 * r10
            long r3 = (long) r1
            return r3
        L_0x008a:
            java.lang.String r0 = "f"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0087
            float r0 = r12.A00
            double r3 = (double) r0
            goto L_0x00c9
        L_0x0096:
            java.lang.String r0 = "h"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0087
            r3 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            goto L_0x00ae
        L_0x00a4:
            java.lang.String r0 = "m"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0087
            r3 = 4633641066610819072(0x404e000000000000, double:60.0)
        L_0x00ae:
            double r1 = r1 * r3
            goto L_0x0087
        L_0x00b0:
            java.lang.String r0 = "t"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0087
            int r0 = r12.A02
            double r3 = (double) r0
            goto L_0x00c9
        L_0x00bc:
            java.lang.String r0 = "ms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0087
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00c9:
            double r1 = r1 / r3
            goto L_0x0087
        L_0x00cb:
            java.lang.String r0 = "Malformed time expression: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r13, r0)
            X.3Ua r0 = new X.3Ua
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VY.A01(X.4Jd, java.lang.String):long");
    }

    public static AnonymousClass4SK A02(AnonymousClass4SK r0) {
        return r0 == null ? new AnonymousClass4SK() : r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0209, code lost:
        if (r1.equals("container") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020b, code lost:
        r11 = A02(r11);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0211, code lost:
        r0 = "baseContainer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0217, code lost:
        if (r1.equals(r0) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0219, code lost:
        r11 = A02(r11);
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021e, code lost:
        r11.A09 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0222, code lost:
        r11 = A02(r11);
        r11.A03 = "bold".equalsIgnoreCase(r2) ? 1 : 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0230, code lost:
        r1 = X.AnonymousClass3K4.A0a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r11.A02 = X.AnonymousClass4ZA.A00(r2, false);
        r11.A0G = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0238, code lost:
        switch(r1.hashCode()) {
            case -1461280213: goto L_0x026a;
            case -1026963764: goto L_0x025c;
            case 913457136: goto L_0x024b;
            case 1679736913: goto L_0x023d;
            default: goto L_0x023b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0243, code lost:
        if (r1.equals("linethrough") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0245, code lost:
        r11 = A02(r11);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0251, code lost:
        if (r1.equals("nolinethrough") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0253, code lost:
        r11 = A02(r11);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0258, code lost:
        r11.A07 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0262, code lost:
        if (r1.equals("underline") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        r1 = X.AnonymousClass000.A0o();
        r0 = "Failed parsing background value: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0264, code lost:
        r11 = A02(r11);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0270, code lost:
        if (r1.equals("nounderline") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0272, code lost:
        r11 = A02(r11);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0277, code lost:
        r11.A0B = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x027b, code lost:
        r1 = X.AnonymousClass3K4.A0a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0283, code lost:
        switch(r1.hashCode()) {
            case -1364013995: goto L_0x02ac;
            case 100571: goto L_0x029d;
            case 3317767: goto L_0x028e;
            case 108511772: goto L_0x028b;
            case 109757538: goto L_0x0288;
            default: goto L_0x0286;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0288, code lost:
        r0 = "start";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x028b, code lost:
        r0 = "right";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x028e, code lost:
        r0 = "left";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0294, code lost:
        if (r1.equals(r0) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0296, code lost:
        r11 = A02(r11);
        r0 = android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x029d, code lost:
        r0 = "end";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02a3, code lost:
        if (r1.equals(r0) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a5, code lost:
        r11 = A02(r11);
        r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b2, code lost:
        if (r1.equals("center") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02b4, code lost:
        r11 = A02(r11);
        r0 = android.text.Layout.Alignment.ALIGN_CENTER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r1 = X.AnonymousClass3K4.A0a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02ba, code lost:
        r11.A0C = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02be, code lost:
        r11 = A02(r11);
        r11.A0E = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02c6, code lost:
        r11 = A02(r11);
        r11.A06 = "italic".equalsIgnoreCase(r2) ? 1 : 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02d4, code lost:
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d5, code lost:
        if (r11 != null) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r0 = new X.AnonymousClass4SK();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02dc, code lost:
        r11 = r0;
        r0 = r2.split("\\s+", -1);
        r7 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02e7, code lost:
        if (r7 != 1) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02e9, code lost:
        r7 = A05.matcher(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r1.equals("before") != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02f5, code lost:
        if (r7.matches() == false) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02f7, code lost:
        r8 = r7.group(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0300, code lost:
        switch(r8.hashCode()) {
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_show_animation :int: goto L_0x0316;
            case 3240: goto L_0x0321;
            case 3592: goto L_0x032c;
            default: goto L_0x0303;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0303, code lost:
        r0 = X.AnonymousClass000.A0r("Invalid unit for fontSize: '");
        r0.append(r8);
        r1 = new X.C65283Ua(X.AnonymousClass000.A0h("'.", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0315, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x031c, code lost:
        if (r8.equals("%") == false) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x031e, code lost:
        r11.A05 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0327, code lost:
        if (r8.equals("em") == false) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0329, code lost:
        r11.A05 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0332, code lost:
        if (r8.equals("px") == false) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0334, code lost:
        r11.A05 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0336, code lost:
        r11.A00 = java.lang.Float.parseFloat(r7.group(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0342, code lost:
        r0 = X.AnonymousClass000.A0r("Invalid expression for fontSize: '");
        r0.append(r2);
        r1 = new X.C65283Ua(X.AnonymousClass000.A0h("'.", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0355, code lost:
        if (r7 != 2) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0357, code lost:
        r7 = A05.matcher(r0[1]);
        android.util.Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0365, code lost:
        r1 = X.AnonymousClass000.A0r("Invalid number of entries for fontSize: ");
        r1.append(r7);
        r1 = new X.C65283Ua(X.AnonymousClass000.A0h(".", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r1.equals("after") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x037a, code lost:
        r1 = X.AnonymousClass000.A0o();
        r0 = "Failed parsing fontSize value: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0380, code lost:
        r1.append(r0);
        android.util.Log.w("TtmlDecoder", X.AnonymousClass000.A0h(r2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0396, code lost:
        if ("style".equals(r12.getName()) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0398, code lost:
        r11 = A02(r11);
        r11.A0F = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r11 = A02(r11);
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        r11.A08 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0415, code lost:
        if (r0 == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        r11 = A02(r11);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        r11 = A02(r11);
        r0 = X.AnonymousClass3K4.A0a(r2);
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r0 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        r1 = r0.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r1.isEmpty() != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r7 = X.C17380uz.copyOf((java.lang.Object[]) android.text.TextUtils.split(r1, X.C88134a0.A07));
        r5 = (java.lang.String) X.C90804eq.getFirst(X.C90734ei.intersection(X.C88134a0.A05, r7), "outside");
        r1 = r5.hashCode();
        r6 = 2;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        if (r1 == -1392885889) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        if (r1 == -1106037339) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        if (r1 != 92734940) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r0 = r5.equals("after");
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
        if (r0 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        r1 = X.C90734ei.intersection(X.C88134a0.A06, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
        if (r1.isEmpty() != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        r6 = X.AnonymousClass000.A0m(r1.iterator());
        r1 = r6.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        if (r1 == 3005871) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        if (r1 != 3387192) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cd, code lost:
        if (r6.equals("none") == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r7 = new X.C88134a0(r8, 0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d5, code lost:
        r11.A0D = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d9, code lost:
        r1 = X.C90734ei.intersection(X.C88134a0.A03, r7);
        r7 = X.C90734ei.intersection(X.C88134a0.A04, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e9, code lost:
        if (r1.isEmpty() == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ef, code lost:
        if (r7.isEmpty() == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f2, code lost:
        r2 = (java.lang.String) X.C90804eq.getFirst(r1, "filled");
        r1 = r2.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0101, code lost:
        if (r1 == -1274499742) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0106, code lost:
        if (r1 != 3417674) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0108, code lost:
        r0 = r2.equals("open");
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010f, code lost:
        if (r0 != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0111, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0112, code lost:
        r7 = (java.lang.String) X.C90804eq.getFirst(r7, "circle");
        r1 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0121, code lost:
        if (r1 == -1360216880) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0126, code lost:
        if (r1 == -905816648) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012b, code lost:
        if (r1 != 99657) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0133, code lost:
        if (r7.equals("dot") == false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0135, code lost:
        r7 = new X.C88134a0(r6, r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013b, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0142, code lost:
        if (r7.equals("sesame") != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0144, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0146, code lost:
        r0 = r5.equals("outside");
        r5 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014d, code lost:
        r1 = X.AnonymousClass3K4.A0a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0157, code lost:
        if (r1.equals("all") != false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        switch(r1) {
            case 0: goto L_0x02c6;
            case 1: goto L_0x02be;
            case 2: goto L_0x027b;
            case 3: goto L_0x0230;
            case 4: goto L_0x0222;
            case 5: goto L_0x038c;
            case 6: goto L_0x01d4;
            case 7: goto L_0x01bc;
            case 8: goto L_0x0170;
            case 9: goto L_0x014d;
            case 10: goto L_0x02d4;
            case 11: goto L_0x0058;
            case 12: goto L_0x0036;
            case 13: goto L_0x001f;
            default: goto L_0x001c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        if (r1.equals("none") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0161, code lost:
        r11 = A02(r11);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0166, code lost:
        r11.A0A = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016a, code lost:
        r11 = A02(r11);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0170, code lost:
        r11 = A02(r11);
        r1 = A09.matcher(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017e, code lost:
        if (r1.matches() != false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0180, code lost:
        android.util.Log.w("TtmlDecoder", X.AnonymousClass000.A0h(r2, X.AnonymousClass000.A0r("Invalid value for shear: ")));
        r0 = Float.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r0 = java.lang.Math.min(100.0f, java.lang.Math.max(-100.0f, java.lang.Float.parseFloat(r1.group(1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01aa, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ab, code lost:
        X.C89504cL.A02("TtmlDecoder", X.AnonymousClass000.A0h(r2, X.AnonymousClass000.A0r("Failed to parse shear: ")), r1);
        r0 = Float.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bc, code lost:
        r11 = A02(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r11.A04 = X.AnonymousClass4ZA.A00(r2, false);
        r11.A0H = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01cc, code lost:
        r1 = X.AnonymousClass000.A0o();
        r0 = "Failed parsing color value: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d4, code lost:
        r1 = X.AnonymousClass3K4.A0a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r11 = A02(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01dc, code lost:
        switch(r1.hashCode()) {
            case -618561360: goto L_0x0211;
            case -410956671: goto L_0x0203;
            case -250518009: goto L_0x01f5;
            case -136074796: goto L_0x01e7;
            case 3016401: goto L_0x01e4;
            case 3556653: goto L_0x01e1;
            default: goto L_0x01df;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e1, code lost:
        r0 = "text";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e4, code lost:
        r0 = "base";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e7, code lost:
        r0 = "textContainer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ed, code lost:
        if (r1.equals(r0) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ef, code lost:
        r11 = A02(r11);
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01fb, code lost:
        if (r1.equals("delimiter") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01fd, code lost:
        r11 = A02(r11);
        r0 = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4SK A03(X.AnonymousClass4SK r11, org.xmlpull.v1.XmlPullParser r12) {
        /*
            int r4 = r12.getAttributeCount()
            r3 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x0419
            java.lang.String r2 = r12.getAttributeValue(r3)
            java.lang.String r1 = r12.getAttributeName(r3)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1550943582: goto L_0x040e;
                case -1224696685: goto L_0x0406;
                case -1065511464: goto L_0x03fe;
                case -879295043: goto L_0x03f6;
                case -734428249: goto L_0x03ee;
                case 3355: goto L_0x03e6;
                case 3511770: goto L_0x03de;
                case 94842723: goto L_0x03d6;
                case 109403361: goto L_0x03cd;
                case 110138194: goto L_0x03c4;
                case 365601008: goto L_0x03bb;
                case 921125321: goto L_0x03b2;
                case 1115953443: goto L_0x03a9;
                case 1287124693: goto L_0x03a0;
                default: goto L_0x0016;
            }
        L_0x0016:
            r1 = -1
        L_0x0017:
            java.lang.String r5 = "TtmlDecoder"
            switch(r1) {
                case 0: goto L_0x02c6;
                case 1: goto L_0x02be;
                case 2: goto L_0x027b;
                case 3: goto L_0x0230;
                case 4: goto L_0x0222;
                case 5: goto L_0x038c;
                case 6: goto L_0x01d4;
                case 7: goto L_0x01bc;
                case 8: goto L_0x0170;
                case 9: goto L_0x014d;
                case 10: goto L_0x02d4;
                case 11: goto L_0x0058;
                case 12: goto L_0x0036;
                case 13: goto L_0x001f;
                default: goto L_0x001c;
            }
        L_0x001c:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x001f:
            X.4SK r11 = A02(r11)
            r0 = 0
            int r0 = X.AnonymousClass4ZA.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x002e }
            r11.A02 = r0     // Catch:{ IllegalArgumentException -> 0x002e }
            r0 = 1
            r11.A0G = r0     // Catch:{ IllegalArgumentException -> 0x002e }
            goto L_0x001c
        L_0x002e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "Failed parsing background value: "
            goto L_0x0380
        L_0x0036:
            java.lang.String r1 = X.AnonymousClass3K4.A0a(r2)
            java.lang.String r0 = "before"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "after"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            r0 = 2
        L_0x004f:
            r11.A08 = r0
            goto L_0x001c
        L_0x0052:
            X.4SK r11 = A02(r11)
            r0 = 1
            goto L_0x004f
        L_0x0058:
            X.4SK r11 = A02(r11)
            java.lang.String r0 = X.AnonymousClass3K4.A0a(r2)
            r7 = 0
            if (r0 == 0) goto L_0x00d5
            java.lang.String r1 = r0.trim()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00d5
            java.util.regex.Pattern r0 = X.C88134a0.A07
            java.lang.String[] r0 = android.text.TextUtils.split(r1, r0)
            X.0uz r7 = X.C17380uz.copyOf((java.lang.Object[]) r0)
            X.0uz r0 = X.C88134a0.A05
            X.5By r0 = X.C90734ei.intersection(r0, r7)
            java.lang.String r9 = "outside"
            java.lang.Object r5 = X.C90804eq.getFirst(r0, r9)
            java.lang.String r5 = (java.lang.String) r5
            int r1 = r5.hashCode()
            r0 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            r6 = 2
            r8 = -1
            r2 = 0
            if (r1 == r0) goto L_0x00a4
            r0 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r1 == r0) goto L_0x0146
            r0 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r1 != r0) goto L_0x00a4
            java.lang.String r0 = "after"
            boolean r0 = r5.equals(r0)
            r5 = 2
        L_0x00a2:
            if (r0 != 0) goto L_0x00a5
        L_0x00a4:
            r5 = 1
        L_0x00a5:
            X.0uz r0 = X.C88134a0.A06
            X.5By r1 = X.C90734ei.intersection(r0, r7)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00d9
            java.util.Iterator r0 = r1.iterator()
            java.lang.String r6 = X.AnonymousClass000.A0m(r0)
            int r1 = r6.hashCode()
            r0 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r0) goto L_0x00d0
            r0 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 != r0) goto L_0x00d0
            java.lang.String r0 = "none"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00d0
            r8 = 0
        L_0x00d0:
            X.4a0 r7 = new X.4a0
            r7.<init>(r8, r2, r5)
        L_0x00d5:
            r11.A0D = r7
            goto L_0x001c
        L_0x00d9:
            X.0uz r0 = X.C88134a0.A03
            X.5By r1 = X.C90734ei.intersection(r0, r7)
            X.0uz r0 = X.C88134a0.A04
            X.5By r7 = X.C90734ei.intersection(r0, r7)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x00f2
            goto L_0x00d0
        L_0x00f2:
            java.lang.String r0 = "filled"
            java.lang.Object r2 = X.C90804eq.getFirst(r1, r0)
            java.lang.String r2 = (java.lang.String) r2
            int r1 = r2.hashCode()
            r0 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r1 == r0) goto L_0x0111
            r0 = 3417674(0x34264a, float:4.789181E-39)
            if (r1 != r0) goto L_0x0111
            java.lang.String r0 = "open"
            boolean r0 = r2.equals(r0)
            r2 = 2
            if (r0 != 0) goto L_0x0112
        L_0x0111:
            r2 = 1
        L_0x0112:
            java.lang.String r0 = "circle"
            java.lang.Object r7 = X.C90804eq.getFirst(r7, r0)
            java.lang.String r7 = (java.lang.String) r7
            int r1 = r7.hashCode()
            r0 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r1 == r0) goto L_0x0144
            r0 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r1 == r0) goto L_0x013b
            r0 = 99657(0x18549, float:1.39649E-40)
            if (r1 != r0) goto L_0x0144
            java.lang.String r0 = "dot"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0144
        L_0x0135:
            X.4a0 r7 = new X.4a0
            r7.<init>(r6, r2, r5)
            goto L_0x00d5
        L_0x013b:
            java.lang.String r0 = "sesame"
            boolean r0 = r7.equals(r0)
            r6 = 3
            if (r0 != 0) goto L_0x0135
        L_0x0144:
            r6 = 1
            goto L_0x0135
        L_0x0146:
            boolean r0 = r5.equals(r9)
            r5 = -2
            goto L_0x00a2
        L_0x014d:
            java.lang.String r1 = X.AnonymousClass3K4.A0a(r2)
            java.lang.String r0 = "all"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x016a
            java.lang.String r0 = "none"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            r0 = 0
        L_0x0166:
            r11.A0A = r0
            goto L_0x001c
        L_0x016a:
            X.4SK r11 = A02(r11)
            r0 = 1
            goto L_0x0166
        L_0x0170:
            X.4SK r11 = A02(r11)
            java.util.regex.Pattern r0 = A09
            java.util.regex.Matcher r1 = r0.matcher(r2)
            boolean r0 = r1.matches()
            if (r0 != 0) goto L_0x0194
            java.lang.String r0 = "Invalid value for shear: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r0)
            android.util.Log.w(r5, r0)
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0190:
            r11.A01 = r0
            goto L_0x001c
        L_0x0194:
            r0 = 1
            java.lang.String r0 = r1.group(r0)     // Catch:{ NumberFormatException -> 0x01aa }
            float r1 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x01aa }
            r0 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r1 = java.lang.Math.max(r0, r1)     // Catch:{ NumberFormatException -> 0x01aa }
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = java.lang.Math.min(r0, r1)     // Catch:{ NumberFormatException -> 0x01aa }
            goto L_0x0190
        L_0x01aa:
            r1 = move-exception
            java.lang.String r0 = "Failed to parse shear: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r0)
            X.C89504cL.A02(r5, r0, r1)
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L_0x0190
        L_0x01bc:
            X.4SK r11 = A02(r11)
            r0 = 0
            int r0 = X.AnonymousClass4ZA.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x01cc }
            r11.A04 = r0     // Catch:{ IllegalArgumentException -> 0x01cc }
            r0 = 1
            r11.A0H = r0     // Catch:{ IllegalArgumentException -> 0x01cc }
            goto L_0x001c
        L_0x01cc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "Failed parsing color value: "
            goto L_0x0380
        L_0x01d4:
            java.lang.String r1 = X.AnonymousClass3K4.A0a(r2)
            int r0 = r1.hashCode()
            switch(r0) {
                case -618561360: goto L_0x0211;
                case -410956671: goto L_0x0203;
                case -250518009: goto L_0x01f5;
                case -136074796: goto L_0x01e7;
                case 3016401: goto L_0x01e4;
                case 3556653: goto L_0x01e1;
                default: goto L_0x01df;
            }
        L_0x01df:
            goto L_0x001c
        L_0x01e1:
            java.lang.String r0 = "text"
            goto L_0x01e9
        L_0x01e4:
            java.lang.String r0 = "base"
            goto L_0x0213
        L_0x01e7:
            java.lang.String r0 = "textContainer"
        L_0x01e9:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            r0 = 3
            goto L_0x021e
        L_0x01f5:
            java.lang.String r0 = "delimiter"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            r0 = 4
            goto L_0x021e
        L_0x0203:
            java.lang.String r0 = "container"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            r0 = 1
            goto L_0x021e
        L_0x0211:
            java.lang.String r0 = "baseContainer"
        L_0x0213:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            r0 = 2
        L_0x021e:
            r11.A09 = r0
            goto L_0x001c
        L_0x0222:
            X.4SK r11 = A02(r11)
            java.lang.String r0 = "bold"
            boolean r0 = r0.equalsIgnoreCase(r2)
            r11.A03 = r0
            goto L_0x001c
        L_0x0230:
            java.lang.String r1 = X.AnonymousClass3K4.A0a(r2)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1461280213: goto L_0x026a;
                case -1026963764: goto L_0x025c;
                case 913457136: goto L_0x024b;
                case 1679736913: goto L_0x023d;
                default: goto L_0x023b;
            }
        L_0x023b:
            goto L_0x001c
        L_0x023d:
            java.lang.String r0 = "linethrough"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            r0 = 1
            goto L_0x0258
        L_0x024b:
            java.lang.String r0 = "nolinethrough"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            r0 = 0
        L_0x0258:
            r11.A07 = r0
            goto L_0x001c
        L_0x025c:
            java.lang.String r0 = "underline"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            r0 = 1
            goto L_0x0277
        L_0x026a:
            java.lang.String r0 = "nounderline"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            r0 = 0
        L_0x0277:
            r11.A0B = r0
            goto L_0x001c
        L_0x027b:
            java.lang.String r1 = X.AnonymousClass3K4.A0a(r2)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1364013995: goto L_0x02ac;
                case 100571: goto L_0x029d;
                case 3317767: goto L_0x028e;
                case 108511772: goto L_0x028b;
                case 109757538: goto L_0x0288;
                default: goto L_0x0286;
            }
        L_0x0286:
            goto L_0x001c
        L_0x0288:
            java.lang.String r0 = "start"
            goto L_0x0290
        L_0x028b:
            java.lang.String r0 = "right"
            goto L_0x029f
        L_0x028e:
            java.lang.String r0 = "left"
        L_0x0290:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x02ba
        L_0x029d:
            java.lang.String r0 = "end"
        L_0x029f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x02ba
        L_0x02ac:
            java.lang.String r0 = "center"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x02ba:
            r11.A0C = r0
            goto L_0x001c
        L_0x02be:
            X.4SK r11 = A02(r11)
            r11.A0E = r2
            goto L_0x001c
        L_0x02c6:
            X.4SK r11 = A02(r11)
            java.lang.String r0 = "italic"
            boolean r0 = r0.equalsIgnoreCase(r2)
            r11.A06 = r0
            goto L_0x001c
        L_0x02d4:
            r0 = r11
            if (r11 != 0) goto L_0x02dc
            X.4SK r0 = new X.4SK     // Catch:{ 3Ua -> 0x037a }
            r0.<init>()     // Catch:{ 3Ua -> 0x037a }
        L_0x02dc:
            r11 = r0
            java.lang.String r1 = "\\s+"
            r0 = -1
            java.lang.String[] r0 = r2.split(r1, r0)     // Catch:{ 3Ua -> 0x037a }
            int r7 = r0.length     // Catch:{ 3Ua -> 0x037a }
            r9 = 2
            r6 = 1
            if (r7 != r6) goto L_0x0355
            java.util.regex.Pattern r0 = A05     // Catch:{ 3Ua -> 0x037a }
            java.util.regex.Matcher r7 = r0.matcher(r2)     // Catch:{ 3Ua -> 0x037a }
        L_0x02ef:
            boolean r0 = r7.matches()     // Catch:{ 3Ua -> 0x037a }
            java.lang.String r1 = "'."
            if (r0 == 0) goto L_0x0342
            r10 = 3
            java.lang.String r8 = r7.group(r10)     // Catch:{ 3Ua -> 0x037a }
            int r0 = r8.hashCode()     // Catch:{ 3Ua -> 0x037a }
            switch(r0) {
                case 37: goto L_0x0316;
                case 3240: goto L_0x0321;
                case 3592: goto L_0x032c;
                default: goto L_0x0303;
            }     // Catch:{ 3Ua -> 0x037a }
        L_0x0303:
            java.lang.String r0 = "Invalid unit for fontSize: '"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ 3Ua -> 0x037a }
            r0.append(r8)     // Catch:{ 3Ua -> 0x037a }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ 3Ua -> 0x037a }
            X.3Ua r1 = new X.3Ua     // Catch:{ 3Ua -> 0x037a }
            r1.<init>((java.lang.String) r0)     // Catch:{ 3Ua -> 0x037a }
        L_0x0315:
            throw r1     // Catch:{ 3Ua -> 0x037a }
        L_0x0316:
            java.lang.String r0 = "%"
            boolean r0 = r8.equals(r0)     // Catch:{ 3Ua -> 0x037a }
            if (r0 == 0) goto L_0x0303
            r11.A05 = r10     // Catch:{ 3Ua -> 0x037a }
            goto L_0x0336
        L_0x0321:
            java.lang.String r0 = "em"
            boolean r0 = r8.equals(r0)     // Catch:{ 3Ua -> 0x037a }
            if (r0 == 0) goto L_0x0303
            r11.A05 = r9     // Catch:{ 3Ua -> 0x037a }
            goto L_0x0336
        L_0x032c:
            java.lang.String r0 = "px"
            boolean r0 = r8.equals(r0)     // Catch:{ 3Ua -> 0x037a }
            if (r0 == 0) goto L_0x0303
            r11.A05 = r6     // Catch:{ 3Ua -> 0x037a }
        L_0x0336:
            java.lang.String r0 = r7.group(r6)     // Catch:{ 3Ua -> 0x037a }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ 3Ua -> 0x037a }
            r11.A00 = r0     // Catch:{ 3Ua -> 0x037a }
            goto L_0x001c
        L_0x0342:
            java.lang.String r0 = "Invalid expression for fontSize: '"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ 3Ua -> 0x037a }
            r0.append(r2)     // Catch:{ 3Ua -> 0x037a }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ 3Ua -> 0x037a }
            X.3Ua r1 = new X.3Ua     // Catch:{ 3Ua -> 0x037a }
            r1.<init>((java.lang.String) r0)     // Catch:{ 3Ua -> 0x037a }
            goto L_0x0315
        L_0x0355:
            if (r7 != r9) goto L_0x0365
            java.util.regex.Pattern r1 = A05     // Catch:{ 3Ua -> 0x037a }
            r0 = r0[r6]     // Catch:{ 3Ua -> 0x037a }
            java.util.regex.Matcher r7 = r1.matcher(r0)     // Catch:{ 3Ua -> 0x037a }
            java.lang.String r0 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."
            android.util.Log.w(r5, r0)     // Catch:{ 3Ua -> 0x037a }
            goto L_0x02ef
        L_0x0365:
            java.lang.String r0 = "Invalid number of entries for fontSize: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 3Ua -> 0x037a }
            r1.append(r7)     // Catch:{ 3Ua -> 0x037a }
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 3Ua -> 0x037a }
            X.3Ua r1 = new X.3Ua     // Catch:{ 3Ua -> 0x037a }
            r1.<init>((java.lang.String) r0)     // Catch:{ 3Ua -> 0x037a }
            goto L_0x0315
        L_0x037a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "Failed parsing fontSize value: "
        L_0x0380:
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)
            android.util.Log.w(r5, r0)
            goto L_0x001c
        L_0x038c:
            java.lang.String r1 = r12.getName()
            java.lang.String r0 = "style"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001c
            X.4SK r11 = A02(r11)
            r11.A0F = r2
            goto L_0x001c
        L_0x03a0:
            java.lang.String r0 = "backgroundColor"
            boolean r0 = r1.equals(r0)
            r1 = 13
            goto L_0x0415
        L_0x03a9:
            java.lang.String r0 = "rubyPosition"
            boolean r0 = r1.equals(r0)
            r1 = 12
            goto L_0x0415
        L_0x03b2:
            java.lang.String r0 = "textEmphasis"
            boolean r0 = r1.equals(r0)
            r1 = 11
            goto L_0x0415
        L_0x03bb:
            java.lang.String r0 = "fontSize"
            boolean r0 = r1.equals(r0)
            r1 = 10
            goto L_0x0415
        L_0x03c4:
            java.lang.String r0 = "textCombine"
            boolean r0 = r1.equals(r0)
            r1 = 9
            goto L_0x0415
        L_0x03cd:
            java.lang.String r0 = "shear"
            boolean r0 = r1.equals(r0)
            r1 = 8
            goto L_0x0415
        L_0x03d6:
            java.lang.String r0 = "color"
            boolean r0 = r1.equals(r0)
            r1 = 7
            goto L_0x0415
        L_0x03de:
            java.lang.String r0 = "ruby"
            boolean r0 = r1.equals(r0)
            r1 = 6
            goto L_0x0415
        L_0x03e6:
            java.lang.String r0 = "id"
            boolean r0 = r1.equals(r0)
            r1 = 5
            goto L_0x0415
        L_0x03ee:
            java.lang.String r0 = "fontWeight"
            boolean r0 = r1.equals(r0)
            r1 = 4
            goto L_0x0415
        L_0x03f6:
            java.lang.String r0 = "textDecoration"
            boolean r0 = r1.equals(r0)
            r1 = 3
            goto L_0x0415
        L_0x03fe:
            java.lang.String r0 = "textAlign"
            boolean r0 = r1.equals(r0)
            r1 = 2
            goto L_0x0415
        L_0x0406:
            java.lang.String r0 = "fontFamily"
            boolean r0 = r1.equals(r0)
            r1 = 1
            goto L_0x0415
        L_0x040e:
            java.lang.String r0 = "fontStyle"
            boolean r0 = r1.equals(r0)
            r1 = 0
        L_0x0415:
            if (r0 != 0) goto L_0x0017
            goto L_0x0016
        L_0x0419:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VY.A03(X.4SK, org.xmlpull.v1.XmlPullParser):X.4SK");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02ef, code lost:
        if (r1 != r12) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04fc, code lost:
        r1 = r12.equals(r1);
        r35 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x050b, code lost:
        if (r1 != false) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0594, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        android.util.Log.w("TtmlDecoder", X.AnonymousClass000.A0h(r8, X.AnonymousClass000.A0q("Ignoring malformed cell resolution: ")));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0123 */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x030b A[Catch:{ 3Ua -> 0x031a }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x04e9 A[Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x03aa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0139 A[Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f9 A[SYNTHETIC, Splitter:B:90:0x01f9] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x020f A[Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C109535Sn A07(byte[] r39, int r40, boolean r41) {
        /*
            r38 = this;
            java.lang.String r20 = ""
            r0 = r38
            org.xmlpull.v1.XmlPullParserFactory r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.util.HashMap r22 = X.AnonymousClass000.A0x()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.util.HashMap r11 = X.AnonymousClass000.A0x()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.util.HashMap r21 = X.AnonymousClass000.A0x()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r25 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r30 = -2147483648(0xffffffff80000000, float:-0.0)
            X.4Oh r2 = new X.4Oh     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r26 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r27 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r28 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r29 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r31 = -2147483648(0xffffffff80000000, float:-0.0)
            r32 = -2147483648(0xffffffff80000000, float:-0.0)
            r33 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = r2
            r24 = r20
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r1 = r20
            r11.put(r1, r2)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r2 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r4 = r39
            r3 = r40
            r1.<init>(r4, r2, r3)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r3 = 0
            r0.setInput(r1, r3)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.util.ArrayDeque r23 = new java.util.ArrayDeque     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r23.<init>()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            X.4Jd r5 = A02     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            X.4Bx r15 = A01     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r37 = r15
            r10 = r3
            r24 = 0
        L_0x005b:
            r1 = 1
            if (r2 == r1) goto L_0x0582
            java.lang.Object r4 = r23.peek()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            X.4dd r4 = (X.C90174dd) r4     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r13 = 2
            if (r24 != 0) goto L_0x0390
            java.lang.String r7 = r0.getName()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r6 = "tt"
            if (r2 != r13) goto L_0x0324
            boolean r1 = r6.equals(r7)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x0154
            java.lang.String r8 = "http://www.w3.org/ns/ttml#parameter"
            java.lang.String r1 = "frameRate"
            java.lang.String r1 = r0.getAttributeValue(r8, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x00ed
            int r9 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x0083:
            r5 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = "frameRateMultiplier"
            java.lang.String r2 = r0.getAttributeValue(r8, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r2 == 0) goto L_0x00a8
            java.lang.String r3 = " "
            r1 = -1
            java.lang.String[] r1 = r2.split(r3, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            int r2 = r1.length     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r2 != r13) goto L_0x058d
            r2 = 0
            r2 = r1[r2]     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            float r5 = (float) r2     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r2 = 1
            r1 = r1[r2]     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            float r1 = (float) r1     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            float r5 = r5 / r1
        L_0x00a8:
            r3 = 1
            java.lang.String r1 = "subFrameRate"
            java.lang.String r1 = r0.getAttributeValue(r8, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x00b5
            int r3 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x00b5:
            r2 = 1
            java.lang.String r1 = "tickRate"
            java.lang.String r1 = r0.getAttributeValue(r8, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x00c2
            int r2 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x00c2:
            float r1 = (float) r9     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            float r1 = r1 * r5
            X.4Jd r5 = new X.4Jd     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r5.<init>(r3, r2, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = "cellResolution"
            java.lang.String r8 = r0.getAttributeValue(r8, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r8 == 0) goto L_0x012e
            java.util.regex.Pattern r1 = A03     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.util.regex.Matcher r2 = r1.matcher(r8)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            boolean r1 = r2.matches()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r14 = "Ignoring malformed cell resolution: "
            java.lang.String r3 = "TtmlDecoder"
            if (r1 != 0) goto L_0x00f0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r14)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r8, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            android.util.Log.w(r3, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            goto L_0x012e
        L_0x00ed:
            r9 = 30
            goto L_0x0083
        L_0x00f0:
            r1 = 1
            java.lang.String r1 = r2.group(r1)     // Catch:{ NumberFormatException -> 0x0123 }
            int r12 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0123 }
            java.lang.String r1 = r2.group(r13)     // Catch:{ NumberFormatException -> 0x0123 }
            int r9 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0123 }
            if (r12 == 0) goto L_0x010b
            if (r9 == 0) goto L_0x010b
            X.4Bx r15 = new X.4Bx     // Catch:{ NumberFormatException -> 0x0123 }
            r15.<init>(r9)     // Catch:{ NumberFormatException -> 0x0123 }
            goto L_0x0130
        L_0x010b:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ NumberFormatException -> 0x0123 }
            java.lang.String r1 = "Invalid cell resolution "
            r2.append(r1)     // Catch:{ NumberFormatException -> 0x0123 }
            r2.append(r12)     // Catch:{ NumberFormatException -> 0x0123 }
            java.lang.String r1 = " "
            java.lang.String r2 = X.C13680ns.A0i(r1, r2, r9)     // Catch:{ NumberFormatException -> 0x0123 }
            X.3Ua r1 = new X.3Ua     // Catch:{ NumberFormatException -> 0x0123 }
            r1.<init>((java.lang.String) r2)     // Catch:{ NumberFormatException -> 0x0123 }
            throw r1     // Catch:{ NumberFormatException -> 0x0123 }
        L_0x0123:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r14)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r8, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            android.util.Log.w(r3, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x012e:
            r15 = r37
        L_0x0130:
            java.lang.String r1 = "extent"
            java.lang.String r9 = X.C89514cM.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r3 = 0
            if (r9 == 0) goto L_0x0154
            java.util.regex.Pattern r1 = A08     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.util.regex.Matcher r2 = r1.matcher(r9)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            boolean r1 = r2.matches()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r8 = "TtmlDecoder"
            if (r1 != 0) goto L_0x01cc
            java.lang.String r1 = "Ignoring non-pixel tts extent: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r9, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            android.util.Log.w(r8, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x0154:
            boolean r1 = r7.equals(r6)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "head"
            boolean r1 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "body"
            boolean r1 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "div"
            boolean r1 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "p"
            boolean r1 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "span"
            boolean r1 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "br"
            boolean r1 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "style"
            boolean r1 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "styling"
            boolean r1 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "layout"
            boolean r1 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "region"
            boolean r1 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "metadata"
            boolean r1 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "image"
            boolean r1 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "data"
            boolean r1 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x01f4
            java.lang.String r1 = "information"
            boolean r2 = r7.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r1 = 0
            if (r2 == 0) goto L_0x01f5
            goto L_0x01f4
        L_0x01cc:
            r1 = 1
            java.lang.String r1 = r2.group(r1)     // Catch:{ NumberFormatException -> 0x01e5 }
            int r12 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x01e5 }
            java.lang.String r1 = r2.group(r13)     // Catch:{ NumberFormatException -> 0x01e5 }
            int r2 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x01e5 }
            X.4GK r1 = new X.4GK     // Catch:{ NumberFormatException -> 0x01e5 }
            r1.<init>(r12, r2)     // Catch:{ NumberFormatException -> 0x01e5 }
            r3 = r1
            goto L_0x0154
        L_0x01e5:
            java.lang.String r1 = "Ignoring malformed tts extent: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r9, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            android.util.Log.w(r8, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            goto L_0x0154
        L_0x01f4:
            r1 = 1
        L_0x01f5:
            java.lang.String r6 = "TtmlDecoder"
            if (r1 != 0) goto L_0x020f
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = "Ignoring unsupported tag: "
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = r0.getName()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            android.util.Log.i(r6, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            goto L_0x0320
        L_0x020f:
            java.lang.String r8 = "head"
            boolean r1 = r8.equals(r7)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x03b3
            int r9 = r0.getAttributeCount()     // Catch:{ 3Ua -> 0x031a }
            r7 = 0
            X.4SK r27 = A03(r7, r0)     // Catch:{ 3Ua -> 0x031a }
            r30 = r20
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r32 = r7
            r8 = 0
        L_0x0234:
            if (r8 >= r9) goto L_0x02bb
            java.lang.String r12 = r0.getAttributeName(r8)     // Catch:{ 3Ua -> 0x031a }
            java.lang.String r2 = r0.getAttributeValue(r8)     // Catch:{ 3Ua -> 0x031a }
            int r1 = r12.hashCode()     // Catch:{ 3Ua -> 0x031a }
            switch(r1) {
                case -934795532: goto L_0x02a7;
                case 99841: goto L_0x029a;
                case 100571: goto L_0x028d;
                case 93616297: goto L_0x0280;
                case 109780401: goto L_0x025c;
                case 1292595405: goto L_0x0246;
                default: goto L_0x0245;
            }     // Catch:{ 3Ua -> 0x031a }
        L_0x0245:
            goto L_0x02b7
        L_0x0246:
            java.lang.String r1 = "backgroundImage"
            boolean r1 = r12.equals(r1)     // Catch:{ 3Ua -> 0x031a }
            if (r1 == 0) goto L_0x02b7
            java.lang.String r1 = "#"
            boolean r1 = r2.startsWith(r1)     // Catch:{ 3Ua -> 0x031a }
            if (r1 == 0) goto L_0x02b7
            r1 = 1
            java.lang.String r7 = r2.substring(r1)     // Catch:{ 3Ua -> 0x031a }
            goto L_0x02b7
        L_0x025c:
            java.lang.String r1 = "style"
            boolean r1 = r12.equals(r1)     // Catch:{ 3Ua -> 0x031a }
            if (r1 == 0) goto L_0x02b7
            java.lang.String r12 = r2.trim()     // Catch:{ 3Ua -> 0x031a }
            boolean r1 = r12.isEmpty()     // Catch:{ 3Ua -> 0x031a }
            if (r1 == 0) goto L_0x0275
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ 3Ua -> 0x031a }
        L_0x0271:
            int r1 = r2.length     // Catch:{ 3Ua -> 0x031a }
            if (r1 <= 0) goto L_0x02b7
            goto L_0x027d
        L_0x0275:
            java.lang.String r2 = "\\s+"
            r1 = -1
            java.lang.String[] r2 = r12.split(r2, r1)     // Catch:{ 3Ua -> 0x031a }
            goto L_0x0271
        L_0x027d:
            r32 = r2
            goto L_0x02b7
        L_0x0280:
            java.lang.String r1 = "begin"
            boolean r1 = r12.equals(r1)     // Catch:{ 3Ua -> 0x031a }
            if (r1 == 0) goto L_0x02b7
            long r33 = A01(r5, r2)     // Catch:{ 3Ua -> 0x031a }
            goto L_0x02b7
        L_0x028d:
            java.lang.String r1 = "end"
            boolean r1 = r12.equals(r1)     // Catch:{ 3Ua -> 0x031a }
            if (r1 == 0) goto L_0x02b7
            long r18 = A01(r5, r2)     // Catch:{ 3Ua -> 0x031a }
            goto L_0x02b7
        L_0x029a:
            java.lang.String r1 = "dur"
            boolean r1 = r12.equals(r1)     // Catch:{ 3Ua -> 0x031a }
            if (r1 == 0) goto L_0x02b7
            long r16 = A01(r5, r2)     // Catch:{ 3Ua -> 0x031a }
            goto L_0x02b7
        L_0x02a7:
            java.lang.String r1 = "region"
            boolean r1 = r12.equals(r1)     // Catch:{ 3Ua -> 0x031a }
            if (r1 == 0) goto L_0x02b7
            boolean r1 = r11.containsKey(r2)     // Catch:{ 3Ua -> 0x031a }
            if (r1 == 0) goto L_0x02b7
            r30 = r2
        L_0x02b7:
            int r8 = r8 + 1
            goto L_0x0234
        L_0x02bb:
            if (r4 == 0) goto L_0x02d5
            long r1 = r4.A02     // Catch:{ 3Ua -> 0x031a }
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x02da
            int r8 = (r33 > r12 ? 1 : (r33 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x02ce
            long r33 = r33 + r1
        L_0x02ce:
            int r8 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x02da
            long r18 = r18 + r1
            goto L_0x02da
        L_0x02d5:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x02da:
            int r1 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x02e8
            int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x02e5
            long r1 = r33 + r16
            goto L_0x02f1
        L_0x02e5:
            if (r4 == 0) goto L_0x02e8
            goto L_0x02eb
        L_0x02e8:
            r1 = r18
            goto L_0x02f1
        L_0x02eb:
            long r1 = r4.A01     // Catch:{ 3Ua -> 0x031a }
            int r8 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x02e8
        L_0x02f1:
            java.lang.String r28 = r0.getName()     // Catch:{ 3Ua -> 0x031a }
            r29 = 0
            X.4dd r8 = new X.4dd     // Catch:{ 3Ua -> 0x031a }
            r25 = r8
            r26 = r4
            r31 = r7
            r35 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r35)     // Catch:{ 3Ua -> 0x031a }
            r1 = r23
            r1.push(r8)     // Catch:{ 3Ua -> 0x031a }
            if (r4 == 0) goto L_0x03aa
            java.util.List r1 = r4.A00     // Catch:{ 3Ua -> 0x031a }
            if (r1 != 0) goto L_0x0315
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()     // Catch:{ 3Ua -> 0x031a }
            r4.A00 = r1     // Catch:{ 3Ua -> 0x031a }
        L_0x0315:
            r1.add(r8)     // Catch:{ 3Ua -> 0x031a }
            goto L_0x03aa
        L_0x031a:
            r2 = move-exception
            java.lang.String r1 = "Suppressing parser error"
            X.C89504cL.A02(r6, r1, r2)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x0320:
            r24 = 1
            goto L_0x03aa
        L_0x0324:
            r1 = 4
            if (r2 != r1) goto L_0x0370
            java.lang.String r2 = r0.getText()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = "\r\n"
            java.lang.String r7 = "\n"
            java.lang.String r2 = r2.replaceAll(r1, r7)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = " *\n *"
            java.lang.String r1 = r2.replaceAll(r1, r7)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r6 = " "
            java.lang.String r2 = r1.replaceAll(r7, r6)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = "[ \t\\x0B\f\r]+"
            java.lang.String r29 = r2.replaceAll(r1, r6)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r26 = 0
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.4dd r2 = new X.4dd     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r28 = r26
            r31 = r26
            r32 = r26
            r35 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25 = r2
            r27 = r26
            r30 = r20
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r35)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.util.List r1 = r4.A00     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x036c
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r4.A00 = r1     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x036c:
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            goto L_0x03aa
        L_0x0370:
            r1 = 3
            if (r2 != r1) goto L_0x03aa
            java.lang.String r1 = r0.getName()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            boolean r1 = r1.equals(r6)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x038c
            java.lang.Object r4 = r23.peek()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            X.4dd r4 = (X.C90174dd) r4     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            X.4q6 r10 = new X.4q6     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r2 = r22
            r1 = r21
            r10.<init>(r4, r2, r11, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x038c:
            r23.pop()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            goto L_0x03aa
        L_0x0390:
            if (r2 != r13) goto L_0x0395
            int r24 = r24 + 1
            goto L_0x03aa
        L_0x0395:
            r1 = 3
            if (r2 != r1) goto L_0x03aa
            int r24 = r24 + -1
            goto L_0x03aa
        L_0x039b:
            java.lang.String r2 = r4.A0F     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r2 == 0) goto L_0x03a4
            r1 = r22
            r1.put(r2, r4)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x03a4:
            boolean r1 = X.C89514cM.A01(r8, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x03b3
        L_0x03aa:
            r0.next()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            goto L_0x005b
        L_0x03b3:
            r0.next()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r2 = "style"
            boolean r1 = X.C89514cM.A02(r2, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x03f7
            java.lang.String r2 = X.C89514cM.A00(r2, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            X.4SK r1 = new X.4SK     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            X.4SK r4 = A03(r1, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r2 == 0) goto L_0x039b
            java.lang.String r7 = r2.trim()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            boolean r1 = r7.isEmpty()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x03dd
            r1 = 0
            java.lang.String[] r12 = new java.lang.String[r1]     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x03da:
            int r9 = r12.length     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r7 = 0
            goto L_0x03e5
        L_0x03dd:
            java.lang.String r2 = "\\s+"
            r1 = -1
            java.lang.String[] r12 = r7.split(r2, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            goto L_0x03da
        L_0x03e5:
            if (r7 >= r9) goto L_0x039b
            r2 = r12[r7]     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r1 = r22
            java.lang.Object r1 = r1.get(r2)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            X.4SK r1 = (X.AnonymousClass4SK) r1     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r4.A00(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            int r7 = r7 + 1
            goto L_0x03e5
        L_0x03f7:
            java.lang.String r1 = "region"
            boolean r1 = X.C89514cM.A02(r1, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x0556
            java.lang.String r1 = "id"
            java.lang.String r26 = X.C89514cM.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r26 == 0) goto L_0x03a4
            java.lang.String r1 = "origin"
            java.lang.String r12 = X.C89514cM.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r12 == 0) goto L_0x0541
            java.util.regex.Pattern r1 = A07     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.util.regex.Matcher r2 = r1.matcher(r12)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.util.regex.Pattern r14 = A08     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.util.regex.Matcher r7 = r14.matcher(r12)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            boolean r9 = r2.matches()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r18 = "Ignoring region with malformed origin: "
            java.lang.String r17 = "Ignoring region with missing tts:extent: "
            r16 = 1120403456(0x42c80000, float:100.0)
            r4 = 1
            if (r9 == 0) goto L_0x043d
            java.lang.String r7 = r2.group(r4)     // Catch:{ NumberFormatException -> 0x052c }
            float r9 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x052c }
            float r9 = r9 / r16
            java.lang.String r2 = r2.group(r13)     // Catch:{ NumberFormatException -> 0x052c }
            float r7 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x052c }
            float r7 = r7 / r16
            goto L_0x045f
        L_0x043d:
            boolean r2 = r7.matches()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r2 == 0) goto L_0x053a
            if (r3 == 0) goto L_0x0535
            java.lang.String r2 = r7.group(r4)     // Catch:{ NumberFormatException -> 0x052c }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x052c }
            java.lang.String r7 = r7.group(r13)     // Catch:{ NumberFormatException -> 0x052c }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x052c }
            float r9 = (float) r2     // Catch:{ NumberFormatException -> 0x052c }
            int r2 = r3.A01     // Catch:{ NumberFormatException -> 0x052c }
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x052c }
            float r9 = r9 / r2
            float r7 = (float) r7     // Catch:{ NumberFormatException -> 0x052c }
            int r2 = r3.A00     // Catch:{ NumberFormatException -> 0x052c }
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x052c }
            float r7 = r7 / r2
        L_0x045f:
            java.lang.String r2 = "extent"
            java.lang.String r2 = X.C89514cM.A00(r2, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r2 == 0) goto L_0x0529
            java.util.regex.Matcher r1 = r1.matcher(r2)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.util.regex.Matcher r2 = r14.matcher(r2)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            boolean r14 = r1.matches()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r18 = "Ignoring region with malformed extent: "
            if (r14 == 0) goto L_0x048c
            java.lang.String r2 = r1.group(r4)     // Catch:{ NumberFormatException -> 0x052c }
            float r4 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x052c }
            float r4 = r4 / r16
            java.lang.String r1 = r1.group(r13)     // Catch:{ NumberFormatException -> 0x052c }
            float r2 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x052c }
            float r2 = r2 / r16
            goto L_0x04ae
        L_0x048c:
            boolean r1 = r2.matches()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x0544
            if (r3 == 0) goto L_0x0535
            java.lang.String r1 = r2.group(r4)     // Catch:{ NumberFormatException -> 0x052c }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x052c }
            java.lang.String r2 = r2.group(r13)     // Catch:{ NumberFormatException -> 0x052c }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x052c }
            float r4 = (float) r1     // Catch:{ NumberFormatException -> 0x052c }
            int r1 = r3.A01     // Catch:{ NumberFormatException -> 0x052c }
            float r1 = (float) r1     // Catch:{ NumberFormatException -> 0x052c }
            float r4 = r4 / r1
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x052c }
            int r1 = r3.A00     // Catch:{ NumberFormatException -> 0x052c }
            float r1 = (float) r1     // Catch:{ NumberFormatException -> 0x052c }
            float r2 = r2 / r1
        L_0x04ae:
            java.lang.String r1 = "displayAlign"
            java.lang.String r12 = X.C89514cM.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r12 == 0) goto L_0x04d8
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r12 = r12.toLowerCase(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = "center"
            boolean r1 = r12.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 != 0) goto L_0x04d0
            java.lang.String r1 = "after"
            boolean r1 = r12.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x04d8
            float r7 = r7 + r2
            r33 = 2
            goto L_0x04da
        L_0x04d0:
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r2 / r1
            float r7 = r7 + r1
            r33 = 1
            goto L_0x04da
        L_0x04d8:
            r33 = 0
        L_0x04da:
            r31 = 1065353216(0x3f800000, float:1.0)
            int r1 = r15.A00     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            float r1 = (float) r1     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            float r31 = r31 / r1
            java.lang.String r1 = "writingMode"
            java.lang.String r12 = X.C89514cM.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r12 == 0) goto L_0x050d
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r12 = r12.toLowerCase(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            int r1 = r12.hashCode()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            switch(r1) {
                case 3694: goto L_0x04f7;
                case 3553396: goto L_0x04fa;
                case 3553576: goto L_0x0503;
                default: goto L_0x04f6;
            }     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x04f6:
            goto L_0x050d
        L_0x04f7:
            java.lang.String r1 = "tb"
            goto L_0x04fc
        L_0x04fa:
            java.lang.String r1 = "tblr"
        L_0x04fc:
            boolean r1 = r12.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r35 = 2
            goto L_0x050b
        L_0x0503:
            java.lang.String r1 = "tbrl"
            boolean r1 = r12.equals(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r35 = 1
        L_0x050b:
            if (r1 != 0) goto L_0x050f
        L_0x050d:
            r35 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x050f:
            r32 = 0
            X.4Oh r1 = new X.4Oh     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r34 = 1
            r25 = r1
            r27 = r9
            r28 = r7
            r29 = r4
            r30 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r2 = r1.A09     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r11.put(r2, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            goto L_0x03a4
        L_0x0529:
            java.lang.String r1 = "Ignoring region without an extent"
            goto L_0x0551
        L_0x052c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r18)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r12, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            goto L_0x0551
        L_0x0535:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r17)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            goto L_0x054d
        L_0x053a:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = "Ignoring region with unsupported origin: "
            goto L_0x054a
        L_0x0541:
            java.lang.String r1 = "Ignoring region without an origin"
            goto L_0x0551
        L_0x0544:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = "Ignoring region with unsupported extent: "
        L_0x054a:
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x054d:
            java.lang.String r1 = X.AnonymousClass000.A0h(r12, r2)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x0551:
            android.util.Log.w(r6, r1)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            goto L_0x03a4
        L_0x0556:
            java.lang.String r7 = "metadata"
            boolean r1 = X.C89514cM.A02(r7, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x03a4
        L_0x055e:
            r0.next()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            java.lang.String r1 = "image"
            boolean r1 = X.C89514cM.A02(r1, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x057a
            java.lang.String r1 = "id"
            java.lang.String r4 = X.C89514cM.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r4 == 0) goto L_0x057a
            java.lang.String r2 = r0.nextText()     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r1 = r21
            r1.put(r4, r2)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x057a:
            boolean r1 = X.C89514cM.A01(r7, r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            if (r1 == 0) goto L_0x055e
            goto L_0x03a4
        L_0x0582:
            if (r10 == 0) goto L_0x0585
            return r10
        L_0x0585:
            java.lang.String r0 = "No TTML subtitles found"
            X.3Ua r1 = new X.3Ua     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r1.<init>((java.lang.String) r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            goto L_0x0594
        L_0x058d:
            java.lang.String r0 = "frameRateMultiplier doesn't have 2 parts"
            X.3Ua r1 = new X.3Ua     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
            r1.<init>((java.lang.String) r0)     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x0594:
            throw r1     // Catch:{ XmlPullParserException -> 0x059e, IOException -> 0x0595 }
        L_0x0595:
            r2 = move-exception
            java.lang.String r1 = "Unexpected error when reading input."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x059e:
            r2 = move-exception
            java.lang.String r1 = "Unable to decode source"
            X.3Ua r0 = new X.3Ua
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VY.A07(byte[], int, boolean):X.5Sn");
    }
}
