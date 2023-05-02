package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.google.common.base.Strings;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3VZ  reason: invalid class name */
public final class AnonymousClass3VZ extends C65323Ui {
    public static final Pattern A05 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public float A00;
    public float A01;
    public Map A02;
    public final C88234aA A03;
    public final boolean A04;

    public AnonymousClass3VZ() {
        this((List) null);
    }

    public AnonymousClass3VZ(List list) {
        super("SsaDecoder");
        this.A01 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.A04 = false;
            this.A03 = null;
            return;
        }
        this.A04 = true;
        String str = new String((byte[]) list.get(0), AnonymousClass4BH.A05);
        C90524eJ.A03(str.startsWith("Format:"));
        this.A03 = C88234aA.A00(str);
        A08(new C90504eH((byte[]) list.get(1)));
    }

    public static int A01(long j2) {
        int i2 = (int) j2;
        if (AnonymousClass000.A1P((((long) i2) > j2 ? 1 : (((long) i2) == j2 ? 0 : -1)))) {
            return i2;
        }
        Object[] A1b = C13680ns.A1b();
        C13690nt.A1Q(A1b, 0, j2);
        throw AnonymousClass000.A0T(Strings.A00("Out of range: %s", A1b));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r0 = X.AnonymousClass000.A0u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r5.add(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r0 = X.C13680ns.A0n((java.util.Collection) r5.get(r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r4.add(r3, java.lang.Long.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r3 != 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(java.util.List r4, java.util.List r5, long r6) {
        /*
            int r3 = r4.size()
        L_0x0004:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0038
            long r1 = X.C13690nt.A0A(r4, r3)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            long r1 = X.C13690nt.A0A(r4, r3)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0004
            int r3 = r3 + 1
        L_0x001a:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r4.add(r3, r0)
            if (r3 != 0) goto L_0x002b
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
        L_0x0027:
            r5.add(r3, r0)
        L_0x002a:
            return r3
        L_0x002b:
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = X.C13680ns.A0n(r0)
            goto L_0x0027
        L_0x0038:
            r3 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VZ.A02(java.util.List, java.util.List, long):int");
    }

    public static long A03(String str) {
        Matcher matcher = A05.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (C65323Ui.A00(matcher, 1) * 60 * 60 * SearchActionVerificationClientService.MS_TO_NS) + (C65323Ui.A00(matcher, 2) * 60 * SearchActionVerificationClientService.MS_TO_NS) + (C65323Ui.A00(matcher, 3) * SearchActionVerificationClientService.MS_TO_NS) + (C65323Ui.A00(matcher, 4) * 10000);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: X.4dC} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0247, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0256, code lost:
        android.util.Log.w("SsaDecoder", X.C13680ns.A0c(r9, "Unknown alignment: "));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        r1 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c2, code lost:
        switch(r9) {
            case -1: goto L_0x0242;
            case 0: goto L_0x0239;
            case 1: goto L_0x0247;
            case 2: goto L_0x0247;
            case 3: goto L_0x0247;
            case 4: goto L_0x0245;
            case 5: goto L_0x0245;
            case 6: goto L_0x0245;
            default: goto L_0x01c5;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c5, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c6, code lost:
        if (r8 == null) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ca, code lost:
        if (r7 == -3.4028235E38f) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ce, code lost:
        if (r14 == -3.4028235E38f) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d0, code lost:
        r1 = r8.x / r14;
        r0 = r8.y / r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d6, code lost:
        r24 = new X.C88444aV((android.graphics.Bitmap) null, r26, r13, r0, r1, r30, -3.4028235E38f, -3.4028235E38f, 0.0f, 0, r2, r3, r37, -16777216, Integer.MIN_VALUE, false);
        r2 = r23;
        r3 = A02(r2, r6, r18);
        r1 = A02(r2, r6, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0202, code lost:
        if (r3 >= r1) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0204, code lost:
        ((java.util.List) r6.get(r3)).add(r24);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0210, code lost:
        if (r3 == 0) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0213, code lost:
        if (r3 == 1) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0215, code lost:
        r1 = 0.95f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0219, code lost:
        if (r3 == 2) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x021b, code lost:
        r1 = -3.4028235E38f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x021e, code lost:
        r0 = 0.05f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0221, code lost:
        if (r2 == 0) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0223, code lost:
        r0 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0226, code lost:
        if (r2 == 1) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0228, code lost:
        r0 = 0.95f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022c, code lost:
        if (r2 == 2) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x022e, code lost:
        r0 = -3.4028235E38f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0232, code lost:
        r1 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0235, code lost:
        r1 = 0.05f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0239, code lost:
        android.util.Log.w("SsaDecoder", X.C13680ns.A0c(r9, "Unknown alignment: "));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0242, code lost:
        r2 = Integer.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0245, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0115 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C109535Sn A07(byte[] r42, int r43, boolean r44) {
        /*
            r41 = this;
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
            java.util.ArrayList r23 = X.AnonymousClass000.A0u()
            X.4eH r22 = new X.4eH
            r2 = r42
            r1 = r43
            r0 = r22
            r0.<init>(r2, r1)
            r5 = r41
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x0273
            r0 = r22
            r5.A08(r0)
            r4 = 0
        L_0x001f:
            java.lang.String r1 = r22.A0L()
            if (r1 == 0) goto L_0x0277
            java.lang.String r0 = "Format:"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0032
            X.4aA r4 = X.C88234aA.A00(r1)
            goto L_0x001f
        L_0x0032:
            java.lang.String r0 = "Dialogue:"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x001f
            if (r4 != 0) goto L_0x004c
            java.lang.String r0 = "Skipping dialogue line before complete format: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r0)
            java.lang.String r0 = "SsaDecoder"
            android.util.Log.w(r0, r1)
            goto L_0x001f
        L_0x004c:
            r0 = 9
            java.lang.String r2 = r1.substring(r0)
            int r3 = r4.A01
            java.lang.String r0 = ","
            java.lang.String[] r2 = r2.split(r0, r3)
            int r0 = r2.length
            java.lang.String r10 = "SsaDecoder"
            if (r0 == r3) goto L_0x006d
            java.lang.String r0 = "Skipping dialogue line with fewer columns than format: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
        L_0x0065:
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            android.util.Log.w(r10, r0)
            goto L_0x001f
        L_0x006d:
            int r0 = r4.A02
            r0 = r2[r0]
            long r18 = A03(r0)
            java.lang.String r3 = "Skipping invalid timing: "
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0132
            int r0 = r4.A00
            r0 = r2[r0]
            long r16 = A03(r0)
            int r0 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0132
            java.util.Map r3 = r5.A02
            if (r3 == 0) goto L_0x012e
            int r1 = r4.A03
            r0 = -1
            if (r1 == r0) goto L_0x012e
            r0 = r2[r1]
            java.lang.String r0 = r0.trim()
            java.lang.Object r21 = r3.get(r0)
            r0 = r21
            X.4dC r0 = (X.C89944dC) r0
            r21 = r0
        L_0x00a5:
            int r0 = r4.A04
            r13 = r2[r0]
            java.util.regex.Pattern r12 = X.AnonymousClass4B3.A01
            java.util.regex.Matcher r7 = r12.matcher(r13)
            r11 = -1
            r8 = 0
            r9 = -1
        L_0x00b2:
            boolean r0 = r7.find()
            if (r0 == 0) goto L_0x0138
            r0 = 1
            java.lang.String r3 = r7.group(r0)
            java.util.regex.Pattern r0 = X.AnonymousClass4B3.A03     // Catch:{ RuntimeException -> 0x0115 }
            java.util.regex.Matcher r15 = r0.matcher(r3)     // Catch:{ RuntimeException -> 0x0115 }
            java.util.regex.Pattern r0 = X.AnonymousClass4B3.A02     // Catch:{ RuntimeException -> 0x0115 }
            java.util.regex.Matcher r0 = r0.matcher(r3)     // Catch:{ RuntimeException -> 0x0115 }
            boolean r20 = r15.find()     // Catch:{ RuntimeException -> 0x0115 }
            boolean r1 = r0.find()     // Catch:{ RuntimeException -> 0x0115 }
            r14 = 2
            r2 = 1
            if (r20 == 0) goto L_0x00d8
            if (r1 == 0) goto L_0x00f7
            goto L_0x00e3
        L_0x00d8:
            if (r1 == 0) goto L_0x0115
            java.lang.String r2 = r0.group(r2)     // Catch:{ RuntimeException -> 0x0115 }
            java.lang.String r1 = r0.group(r14)     // Catch:{ RuntimeException -> 0x0115 }
            goto L_0x00ff
        L_0x00e3:
            java.lang.String r0 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ RuntimeException -> 0x0115 }
            r1.append(r3)     // Catch:{ RuntimeException -> 0x0115 }
            java.lang.String r0 = "'"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ RuntimeException -> 0x0115 }
            java.lang.String r0 = "SsaStyle.Overrides"
            android.util.Log.i(r0, r1)     // Catch:{ RuntimeException -> 0x0115 }
        L_0x00f7:
            java.lang.String r2 = r15.group(r2)     // Catch:{ RuntimeException -> 0x0115 }
            java.lang.String r1 = r15.group(r14)     // Catch:{ RuntimeException -> 0x0115 }
        L_0x00ff:
            java.lang.String r0 = r2.trim()     // Catch:{ RuntimeException -> 0x0115 }
            float r2 = java.lang.Float.parseFloat(r0)     // Catch:{ RuntimeException -> 0x0115 }
            java.lang.String r0 = r1.trim()     // Catch:{ RuntimeException -> 0x0115 }
            float r1 = java.lang.Float.parseFloat(r0)     // Catch:{ RuntimeException -> 0x0115 }
            android.graphics.PointF r0 = new android.graphics.PointF     // Catch:{ RuntimeException -> 0x0115 }
            r0.<init>(r2, r1)     // Catch:{ RuntimeException -> 0x0115 }
            r8 = r0
        L_0x0115:
            java.util.regex.Pattern r0 = X.AnonymousClass4B3.A00     // Catch:{ RuntimeException -> 0x00b2 }
            java.util.regex.Matcher r1 = r0.matcher(r3)     // Catch:{ RuntimeException -> 0x00b2 }
            boolean r0 = r1.find()     // Catch:{ RuntimeException -> 0x00b2 }
            if (r0 == 0) goto L_0x00b2
            r0 = 1
            java.lang.String r0 = r1.group(r0)     // Catch:{ RuntimeException -> 0x00b2 }
            int r0 = X.C89944dC.A00(r0)     // Catch:{ RuntimeException -> 0x00b2 }
            if (r0 == r11) goto L_0x00b2
            r9 = r0
            goto L_0x00b2
        L_0x012e:
            r21 = 0
            goto L_0x00a5
        L_0x0132:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r3)
            goto L_0x0065
        L_0x0138:
            java.util.regex.Matcher r1 = r12.matcher(r13)
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r0)
            java.lang.String r0 = "\\N"
            java.lang.String r2 = "\n"
            java.lang.String r1 = r1.replace(r0, r2)
            java.lang.String r0 = "\\n"
            java.lang.String r2 = r1.replace(r0, r2)
            java.lang.String r1 = "\\h"
            java.lang.String r0 = " "
            java.lang.String r0 = r2.replace(r1, r0)
            float r14 = r5.A01
            float r7 = r5.A00
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r0)
            r25 = 0
            r37 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r31 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = 0
            if (r21 == 0) goto L_0x01af
            r0 = r21
            java.lang.Integer r0 = r0.A02
            r2 = 33
            if (r0 == 0) goto L_0x0186
            int r0 = r0.intValue()
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r13.length()
            r13.setSpan(r1, r3, r0, r2)
        L_0x0186:
            r0 = r21
            float r0 = r0.A00
            r1 = 1
            int r12 = (r0 > r30 ? 1 : (r0 == r30 ? 0 : -1))
            if (r12 == 0) goto L_0x0198
            int r12 = (r7 > r30 ? 1 : (r7 == r30 ? 0 : -1))
            if (r12 == 0) goto L_0x0198
            float r0 = r0 / r7
            r30 = r0
            r37 = 1
        L_0x0198:
            r0 = r21
            boolean r12 = r0.A04
            boolean r0 = r0.A05
            if (r12 == 0) goto L_0x026e
            if (r0 == 0) goto L_0x01a3
            r1 = 3
        L_0x01a3:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            int r1 = r13.length()
            r13.setSpan(r0, r3, r1, r2)
        L_0x01af:
            if (r9 != r11) goto L_0x01b7
            if (r21 == 0) goto L_0x026b
            r0 = r21
            int r9 = r0.A01
        L_0x01b7:
            r26 = 0
            switch(r9) {
                case -1: goto L_0x025f;
                case 0: goto L_0x024d;
                case 1: goto L_0x0267;
                case 2: goto L_0x0263;
                case 3: goto L_0x01bc;
                case 4: goto L_0x0267;
                case 5: goto L_0x0263;
                case 6: goto L_0x01bc;
                case 7: goto L_0x0267;
                case 8: goto L_0x0263;
                default: goto L_0x01bc;
            }
        L_0x01bc:
            android.text.Layout$Alignment r26 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x01be:
            switch(r9) {
                case -1: goto L_0x025f;
                case 0: goto L_0x0256;
                case 1: goto L_0x01c2;
                case 2: goto L_0x024a;
                case 3: goto L_0x01c1;
                case 4: goto L_0x01c2;
                case 5: goto L_0x024a;
                case 6: goto L_0x01c1;
                case 7: goto L_0x01c2;
                case 8: goto L_0x024a;
                default: goto L_0x01c1;
            }
        L_0x01c1:
            r3 = 2
        L_0x01c2:
            switch(r9) {
                case -1: goto L_0x0242;
                case 0: goto L_0x0239;
                case 1: goto L_0x0247;
                case 2: goto L_0x0247;
                case 3: goto L_0x0247;
                case 4: goto L_0x0245;
                case 5: goto L_0x0245;
                case 6: goto L_0x0245;
                default: goto L_0x01c5;
            }
        L_0x01c5:
            r2 = 0
        L_0x01c6:
            if (r8 == 0) goto L_0x0210
            int r0 = (r7 > r31 ? 1 : (r7 == r31 ? 0 : -1))
            if (r0 == 0) goto L_0x0210
            int r0 = (r14 > r31 ? 1 : (r14 == r31 ? 0 : -1))
            if (r0 == 0) goto L_0x0210
            float r1 = r8.x
            float r1 = r1 / r14
            float r0 = r8.y
            float r0 = r0 / r7
        L_0x01d6:
            r33 = 0
            r39 = -2147483648(0xffffffff80000000, float:-0.0)
            r38 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.4aV r7 = new X.4aV
            r32 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r34 = 0
            r40 = 0
            r27 = r13
            r28 = r0
            r29 = r1
            r35 = r2
            r36 = r3
            r24 = r7
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r2 = r23
            r0 = r18
            int r3 = A02(r2, r6, r0)
            r0 = r16
            int r1 = A02(r2, r6, r0)
        L_0x0202:
            if (r3 >= r1) goto L_0x001f
            java.lang.Object r0 = r6.get(r3)
            java.util.List r0 = (java.util.List) r0
            r0.add(r7)
            int r3 = r3 + 1
            goto L_0x0202
        L_0x0210:
            if (r3 == 0) goto L_0x0235
            r0 = 1
            if (r3 == r0) goto L_0x0232
            r0 = 2
            r1 = 1064514355(0x3f733333, float:0.95)
            if (r3 == r0) goto L_0x021e
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x021e:
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            if (r2 == 0) goto L_0x01d6
            r7 = 1
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r2 == r7) goto L_0x01d6
            r7 = 2
            r0 = 1064514355(0x3f733333, float:0.95)
            if (r2 == r7) goto L_0x01d6
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x01d6
        L_0x0232:
            r1 = 1056964608(0x3f000000, float:0.5)
            goto L_0x021e
        L_0x0235:
            r1 = 1028443341(0x3d4ccccd, float:0.05)
            goto L_0x021e
        L_0x0239:
            java.lang.String r0 = "Unknown alignment: "
            java.lang.String r0 = X.C13680ns.A0c(r9, r0)
            android.util.Log.w(r10, r0)
        L_0x0242:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01c6
        L_0x0245:
            r2 = 1
            goto L_0x01c6
        L_0x0247:
            r2 = 2
            goto L_0x01c6
        L_0x024a:
            r3 = 1
            goto L_0x01c2
        L_0x024d:
            java.lang.String r0 = "Unknown alignment: "
            java.lang.String r0 = X.C13680ns.A0c(r9, r0)
            android.util.Log.w(r10, r0)
        L_0x0256:
            java.lang.String r0 = "Unknown alignment: "
            java.lang.String r0 = X.C13680ns.A0c(r9, r0)
            android.util.Log.w(r10, r0)
        L_0x025f:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01c2
        L_0x0263:
            android.text.Layout$Alignment r26 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x01be
        L_0x0267:
            android.text.Layout$Alignment r26 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x01be
        L_0x026b:
            r9 = -1
            goto L_0x01b7
        L_0x026e:
            if (r0 == 0) goto L_0x01af
            r1 = 2
            goto L_0x01a3
        L_0x0273:
            X.4aA r4 = r5.A03
            goto L_0x001f
        L_0x0277:
            X.4q3 r1 = new X.4q3
            r0 = r23
            r1.<init>(r6, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VZ.A07(byte[], int, boolean):X.5Sn");
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ab A[Catch:{ RuntimeException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b9 A[Catch:{ RuntimeException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01cd A[Catch:{ RuntimeException -> 0x01d7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C90504eH r26) {
        /*
            r25 = this;
        L_0x0000:
            r4 = r26
            java.lang.String r1 = r4.A0L()
            if (r1 == 0) goto L_0x0260
            java.lang.String r0 = "[Script Info]"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r3 = r25
            if (r0 != 0) goto L_0x0201
            java.lang.String r0 = "[V4+ Styles]"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x01f0
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L_0x001f:
            r1 = 0
        L_0x0020:
            java.lang.String r8 = r4.A0L()
            if (r8 == 0) goto L_0x01ec
            int r0 = r4.A00
            int r5 = r4.A01
            int r0 = r0 - r5
            if (r0 == 0) goto L_0x0037
            byte[] r0 = r4.A02
            byte r0 = r0[r5]
            r5 = r0 & 255(0xff, float:3.57E-43)
            r0 = 91
            if (r5 == r0) goto L_0x01ec
        L_0x0037:
            java.lang.String r0 = "Format:"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x00b1
            r0 = 7
            java.lang.String r1 = r8.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r7 = android.text.TextUtils.split(r1, r0)
            r6 = -1
            r1 = 0
            r5 = -1
            r9 = -1
            r10 = -1
            r11 = -1
            r12 = -1
            r13 = -1
        L_0x0052:
            int r0 = r7.length
            if (r1 >= r0) goto L_0x00a5
            r0 = r7[r1]
            java.lang.String r0 = r0.trim()
            java.lang.String r8 = X.AnonymousClass3K4.A0a(r0)
            int r0 = r8.hashCode()
            switch(r0) {
                case -1178781136: goto L_0x0069;
                case -70925746: goto L_0x0073;
                case 3029637: goto L_0x007d;
                case 3373707: goto L_0x0087;
                case 366554320: goto L_0x0091;
                case 1767875043: goto L_0x009b;
                default: goto L_0x0066;
            }
        L_0x0066:
            int r1 = r1 + 1
            goto L_0x0052
        L_0x0069:
            java.lang.String r0 = "italic"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0066
            r13 = r1
            goto L_0x0066
        L_0x0073:
            java.lang.String r0 = "primarycolour"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0066
            r10 = r1
            goto L_0x0066
        L_0x007d:
            java.lang.String r0 = "bold"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0066
            r12 = r1
            goto L_0x0066
        L_0x0087:
            java.lang.String r0 = "name"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0066
            r5 = r1
            goto L_0x0066
        L_0x0091:
            java.lang.String r0 = "fontsize"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0066
            r11 = r1
            goto L_0x0066
        L_0x009b:
            java.lang.String r0 = "alignment"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0066
            r9 = r1
            goto L_0x0066
        L_0x00a5:
            if (r5 == r6) goto L_0x001f
            X.4Nz r1 = new X.4Nz
            r8 = r5
            r14 = r0
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0020
        L_0x00b1:
            java.lang.String r0 = "Style:"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x0020
            if (r1 != 0) goto L_0x00cc
            java.lang.String r0 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r5 = X.AnonymousClass000.A0h(r8, r0)
            java.lang.String r0 = "SsaDecoder"
            android.util.Log.w(r0, r5)
            goto L_0x0020
        L_0x00cc:
            r0 = 6
            java.lang.String r5 = r8.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r9 = android.text.TextUtils.split(r5, r0)
            int r11 = r9.length
            int r10 = r1.A04
            java.lang.String r7 = "SsaStyle"
            r19 = 0
            r6 = 0
            if (r11 == r10) goto L_0x00f9
            r0 = 3
            java.lang.Object[] r5 = new java.lang.Object[r0]
            X.AnonymousClass000.A1M(r5, r10, r6)
            r0 = 1
            X.AnonymousClass000.A1M(r5, r11, r0)
            r0 = 2
            r5[r0] = r8
            java.lang.String r0 = "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'"
            java.lang.String r0 = X.AnonymousClass3K4.A0b(r0, r5)
            android.util.Log.w(r7, r0)
            goto L_0x0020
        L_0x00f9:
            int r0 = r1.A05     // Catch:{ RuntimeException -> 0x01d7 }
            r0 = r9[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r20 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            int r0 = r1.A00     // Catch:{ RuntimeException -> 0x01d7 }
            r5 = -1
            if (r0 == r5) goto L_0x011b
            r0 = r9[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            int r22 = X.C89944dC.A00(r0)     // Catch:{ RuntimeException -> 0x01d7 }
        L_0x0110:
            int r0 = r1.A06     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == r5) goto L_0x0182
            r0 = r9[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r12 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            goto L_0x011e
        L_0x011b:
            r22 = -1
            goto L_0x0110
        L_0x011e:
            java.lang.String r0 = "&H"
            boolean r10 = r12.startsWith(r0)     // Catch:{ IllegalArgumentException -> 0x016f }
            r0 = 16
            if (r10 == 0) goto L_0x0132
            r10 = 2
            java.lang.String r10 = r12.substring(r10)     // Catch:{ IllegalArgumentException -> 0x016f }
            long r17 = java.lang.Long.parseLong(r10, r0)     // Catch:{ IllegalArgumentException -> 0x016f }
            goto L_0x0136
        L_0x0132:
            long r17 = java.lang.Long.parseLong(r12)     // Catch:{ IllegalArgumentException -> 0x016f }
        L_0x0136:
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r10 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            boolean r10 = X.AnonymousClass3K4.A18(r10)
            X.C90524eJ.A03(r10)     // Catch:{ IllegalArgumentException -> 0x016f }
            r10 = 24
            long r10 = r17 >> r10
            r15 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r15
            long r10 = r10 ^ r15
            int r12 = A01(r10)     // Catch:{ RuntimeException -> 0x01d7 }
            long r10 = r17 >> r0
            long r10 = r10 & r15
            int r11 = A01(r10)     // Catch:{ RuntimeException -> 0x01d7 }
            r0 = 8
            long r13 = r17 >> r0
            long r13 = r13 & r15
            int r10 = A01(r13)     // Catch:{ RuntimeException -> 0x01d7 }
            long r17 = r17 & r15
            int r0 = A01(r17)     // Catch:{ RuntimeException -> 0x01d7 }
            int r0 = android.graphics.Color.argb(r12, r0, r10, r11)     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x01d7 }
            goto L_0x0182
        L_0x016f:
            r11 = move-exception
            java.lang.String r0 = "Failed to parse color expression: '"
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0r(r0)     // Catch:{ RuntimeException -> 0x01d7 }
            r10.append(r12)     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = "'"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r10)     // Catch:{ RuntimeException -> 0x01d7 }
            X.C89504cL.A02(r7, r0, r11)     // Catch:{ RuntimeException -> 0x01d7 }
        L_0x0182:
            int r0 = r1.A02     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == r5) goto L_0x01a4
            r0 = r9[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r12 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            float r21 = java.lang.Float.parseFloat(r12)     // Catch:{ NumberFormatException -> 0x0191 }
            goto L_0x01a7
        L_0x0191:
            r11 = move-exception
            java.lang.String r0 = "Failed to parse font size: '"
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0r(r0)     // Catch:{ RuntimeException -> 0x01d7 }
            r10.append(r12)     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = "'"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r10)     // Catch:{ RuntimeException -> 0x01d7 }
            X.C89504cL.A02(r7, r0, r11)     // Catch:{ RuntimeException -> 0x01d7 }
        L_0x01a4:
            r21 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x01a7:
            int r0 = r1.A01     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == r5) goto L_0x01cd
            r0 = r9[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            boolean r23 = X.C89944dC.A01(r0)     // Catch:{ RuntimeException -> 0x01d7 }
        L_0x01b5:
            int r0 = r1.A03     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == r5) goto L_0x01c3
            r0 = r9[r0]     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x01d7 }
            boolean r6 = X.C89944dC.A01(r0)     // Catch:{ RuntimeException -> 0x01d7 }
        L_0x01c3:
            X.4dC r5 = new X.4dC     // Catch:{ RuntimeException -> 0x01d7 }
            r18 = r5
            r24 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ RuntimeException -> 0x01d7 }
            goto L_0x01d0
        L_0x01cd:
            r23 = 0
            goto L_0x01b5
        L_0x01d0:
            java.lang.String r0 = r5.A03
            r2.put(r0, r5)
            goto L_0x0020
        L_0x01d7:
            r6 = move-exception
            java.lang.String r0 = "Skipping malformed 'Style:' line: '"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r0)
            r5.append(r8)
            java.lang.String r0 = "'"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r5)
            X.C89504cL.A02(r7, r0, r6)
            goto L_0x0020
        L_0x01ec:
            r3.A02 = r2
            goto L_0x0000
        L_0x01f0:
            java.lang.String r0 = "[V4 Styles]"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0258
            java.lang.String r1 = "SsaDecoder"
            java.lang.String r0 = "[V4 Styles] are not supported"
            android.util.Log.i(r1, r0)
            goto L_0x0000
        L_0x0201:
            java.lang.String r2 = r4.A0L()
            if (r2 == 0) goto L_0x0000
            int r0 = r4.A00
            int r1 = r4.A01
            int r0 = r0 - r1
            if (r0 == 0) goto L_0x0218
            byte[] r0 = r4.A02
            byte r0 = r0[r1]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 91
            if (r1 == r0) goto L_0x0000
        L_0x0218:
            java.lang.String r0 = ":"
            java.lang.String[] r5 = r2.split(r0)
            int r1 = r5.length
            r0 = 2
            if (r1 != r0) goto L_0x0201
            r0 = 0
            r0 = r5[r0]
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = X.AnonymousClass3K4.A0a(r0)
            java.lang.String r0 = "playresx"
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x024b
            java.lang.String r0 = "playresy"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0201
            r0 = r5[r1]     // Catch:{ NumberFormatException -> 0x0201 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0201 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0201 }
            r3.A00 = r0     // Catch:{ NumberFormatException -> 0x0201 }
            goto L_0x0201
        L_0x024b:
            r0 = r5[r1]     // Catch:{ NumberFormatException -> 0x0201 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0201 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0201 }
            r3.A01 = r0     // Catch:{ NumberFormatException -> 0x0201 }
            goto L_0x0201
        L_0x0258:
            java.lang.String r0 = "[Events]"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0000
        L_0x0260:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VZ.A08(X.4eH):void");
    }
}
