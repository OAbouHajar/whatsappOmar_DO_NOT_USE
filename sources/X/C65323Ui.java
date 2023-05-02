package X;

import java.util.regex.Matcher;

/* renamed from: X.3Ui  reason: invalid class name and case insensitive filesystem */
public abstract class C65323Ui extends C96364oD implements AnonymousClass5UP {
    public final String A00;

    public C65323Ui(String str) {
        super(new AnonymousClass3Uc[2], new C65303Uf[2]);
        this.A00 = str;
        int i2 = this.A00;
        C90524eJ.A04(AnonymousClass000.A1R(i2, r2));
        for (AnonymousClass3UX A01 : this.A0B) {
            A01.A01(1024);
        }
    }

    public static long A00(Matcher matcher, int i2) {
        return Long.parseLong(matcher.group(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x034d, code lost:
        switch(r14) {
            case -685620710: goto L_0x0397;
            case -685620679: goto L_0x039c;
            case -685620648: goto L_0x03a1;
            case -685620524: goto L_0x03a7;
            case -685620493: goto L_0x03ac;
            case -685620462: goto L_0x03b1;
            default: goto L_0x0350;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0350, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0351, code lost:
        if (r1 == 0) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0353, code lost:
        r19 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0356, code lost:
        if (r1 == 1) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0358, code lost:
        r19 = 0.92f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x035b, code lost:
        if (r2 == 0) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x035d, code lost:
        r18 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0360, code lost:
        if (r2 == 1) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0362, code lost:
        r18 = 0.92f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0365, code lost:
        r24 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x038f, code lost:
        r18 = 0.08f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0393, code lost:
        r19 = 0.08f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0397, code lost:
        r7 = r9.equals("{\\an1}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x039c, code lost:
        r7 = r9.equals("{\\an2}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03a1, code lost:
        r7 = r9.equals("{\\an3}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03a5, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03a7, code lost:
        r7 = r9.equals("{\\an7}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03ac, code lost:
        r7 = r9.equals("{\\an8}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03b1, code lost:
        r7 = r9.equals("{\\an9}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03b5, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03b6, code lost:
        if (r7 != false) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03d1, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03d7, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03d8, code lost:
        if (r2 != false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00da, code lost:
        r2 = (char) X.AnonymousClass3K3.A0K(r10.A02, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C109535Sn A07(byte[] r32, int r33, boolean r34) {
        /*
            r31 = this;
            r0 = r31
            boolean r1 = r0 instanceof X.AnonymousClass3VT
            r8 = r32
            r2 = r33
            if (r1 == 0) goto L_0x00b0
            X.3VT r0 = (X.AnonymousClass3VT) r0
            X.4eH r7 = r0.A00
            r7.A0U(r8, r2)
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
        L_0x0015:
            int r1 = X.C90504eH.A00(r7)
            if (r1 <= 0) goto L_0x00aa
            r0 = 8
            if (r1 < r0) goto L_0x00a2
            int r2 = r7.A07()
            int r1 = r7.A07()
            r0 = 1987343459(0x76747463, float:1.2395323E33)
            int r4 = r2 + -8
            if (r1 != r0) goto L_0x0095
            r10 = 0
            r11 = r10
            r9 = r10
        L_0x0031:
            if (r4 <= 0) goto L_0x0075
            r0 = 8
            if (r4 < r0) goto L_0x009a
            int r8 = r7.A07()
            int r5 = r7.A07()
            int r4 = r4 + -8
            int r8 = r8 - r0
            byte[] r3 = r7.A02
            int r2 = r7.A01
            java.nio.charset.Charset r0 = X.AnonymousClass4BH.A05
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3, r2, r8, r0)
            r7.A0T(r8)
            int r4 = r4 - r8
            r0 = 1937011815(0x73747467, float:1.9367696E31)
            if (r5 != r0) goto L_0x0063
            X.4SH r0 = new X.4SH
            r0.<init>()
            X.C90664ea.A04(r0, r1)
            X.4b6 r9 = r0.A00()
            goto L_0x0031
        L_0x0063:
            r0 = 1885436268(0x7061796c, float:2.7912367E29)
            if (r5 != r0) goto L_0x0031
            java.lang.String r1 = r1.trim()
            java.util.List r0 = java.util.Collections.emptyList()
            android.text.SpannedString r11 = X.C90664ea.A00(r10, r1, r0)
            goto L_0x0031
        L_0x0075:
            if (r11 != 0) goto L_0x0079
            java.lang.String r11 = ""
        L_0x0079:
            if (r9 == 0) goto L_0x0085
            r9.A0E = r11
            X.4aV r0 = r9.A00()
        L_0x0081:
            r6.add(r0)
            goto L_0x0015
        L_0x0085:
            X.4SH r0 = new X.4SH
            r0.<init>()
            r0.A0A = r11
            X.4b6 r0 = r0.A00()
            X.4aV r0 = r0.A00()
            goto L_0x0081
        L_0x0095:
            r7.A0T(r4)
            goto L_0x0015
        L_0x009a:
            java.lang.String r1 = "Incomplete vtt cue box header found."
            X.3Ua r0 = new X.3Ua
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00a2:
            java.lang.String r1 = "Incomplete Mp4Webvtt Top Level box header found."
            X.3Ua r0 = new X.3Ua
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00aa:
            X.4q2 r0 = new X.4q2
            r0.<init>(r6)
            return r0
        L_0x00b0:
            boolean r1 = r0 instanceof X.AnonymousClass3VW
            if (r1 == 0) goto L_0x0249
            X.3VW r0 = (X.AnonymousClass3VW) r0
            X.4eH r10 = r0.A04
            r10.A0U(r8, r2)
            int r4 = r10.A00
            int r1 = r10.A01
            int r2 = r4 - r1
            r1 = 2
            if (r2 < r1) goto L_0x0241
            int r5 = r10.A0F()
            if (r5 != 0) goto L_0x00d5
            java.lang.String r4 = ""
        L_0x00cc:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x00fd
            X.4q7 r1 = X.C97514q7.A01
            return r1
        L_0x00d5:
            int r3 = r10.A01
            int r4 = r4 - r3
            if (r4 < r1) goto L_0x00fa
            byte[] r1 = r10.A02
            int r1 = X.AnonymousClass3K3.A0K(r1, r3)
            char r2 = (char) r1
            r1 = 65279(0xfeff, float:9.1475E-41)
            if (r2 == r1) goto L_0x00eb
            r1 = 65534(0xfffe, float:9.1833E-41)
            if (r2 != r1) goto L_0x00fa
        L_0x00eb:
            java.nio.charset.Charset r2 = X.AnonymousClass4BH.A02
        L_0x00ed:
            byte[] r1 = r10.A02
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1, r3, r5, r2)
            int r1 = r10.A01
            int r1 = r1 + r5
            r10.A01 = r1
            goto L_0x00cc
        L_0x00fa:
            java.nio.charset.Charset r2 = X.AnonymousClass4BH.A05
            goto L_0x00ed
        L_0x00fd:
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r4)
            int r15 = r0.A03
            int r6 = r9.length()
            r7 = 16711680(0xff0000, float:2.3418052E-38)
            r4 = 0
            r5 = 0
            r3 = r15
            r2 = r9
            X.AnonymousClass3VW.A01(r2, r3, r4, r5, r6, r7)
            int r13 = r0.A02
            int r3 = r9.length()
            r1 = -1
            if (r13 == r1) goto L_0x012c
            r1 = r13 & 255(0xff, float:3.57E-43)
            int r2 = r1 << 24
            int r1 = r13 >>> 8
            r1 = r1 | r2
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r1)
            r1 = 16711713(0xff0021, float:2.3418098E-38)
            r9.setSpan(r2, r4, r3, r1)
        L_0x012c:
            java.lang.String r4 = r0.A05
            int r3 = r9.length()
            java.lang.String r1 = "sans-serif"
            if (r4 == r1) goto L_0x0141
            android.text.style.TypefaceSpan r2 = new android.text.style.TypefaceSpan
            r2.<init>(r4)
            r1 = 16711713(0xff0021, float:2.3418098E-38)
            r9.setSpan(r2, r5, r3, r1)
        L_0x0141:
            float r12 = r0.A00
        L_0x0143:
            int r3 = r10.A00
            int r11 = r10.A01
            int r2 = r3 - r11
            r1 = 8
            if (r2 < r1) goto L_0x0229
            int r16 = r10.A07()
            int r2 = r10.A07()
            r1 = 1937013100(0x7374796c, float:1.936925E31)
            r8 = 2
            if (r2 != r1) goto L_0x01eb
            int r1 = r10.A01
            int r3 = r3 - r1
            if (r3 < r8) goto L_0x0219
            int r7 = r10.A0F()
            r6 = 0
        L_0x0165:
            if (r6 >= r7) goto L_0x020a
            int r3 = X.C90504eH.A00(r10)
            r2 = 1
            r1 = 12
            if (r3 < r1) goto L_0x0211
            int r5 = r10.A0F()
            int r4 = r10.A0F()
            int r18 = X.C90504eH.A01(r10, r8)
            r10.A0T(r2)
            int r3 = r10.A07()
            int r1 = r9.length()
            java.lang.String r14 = ")."
            java.lang.String r2 = "Tx3gDecoder"
            if (r4 <= r1) goto L_0x01ad
            java.lang.String r1 = "Truncating styl end ("
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)
            r1.append(r4)
            java.lang.String r4 = ") to cueText.length() ("
            r1.append(r4)
            int r4 = r9.length()
            r1.append(r4)
            java.lang.String r1 = X.AnonymousClass000.A0h(r14, r1)
            android.util.Log.w(r2, r1)
            int r4 = r9.length()
        L_0x01ad:
            if (r5 < r4) goto L_0x01ca
            java.lang.String r1 = "Ignoring styl with start ("
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r1)
            r3.append(r5)
            java.lang.String r1 = ") >= end ("
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = X.AnonymousClass000.A0h(r14, r3)
            android.util.Log.w(r2, r1)
        L_0x01c7:
            int r6 = r6 + 1
            goto L_0x0165
        L_0x01ca:
            r22 = 0
            r17 = r9
            r19 = r15
            r20 = r5
            r21 = r4
            X.AnonymousClass3VW.A01(r17, r18, r19, r20, r21, r22)
            if (r3 == r13) goto L_0x01c7
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r1 << 24
            int r1 = r3 >>> 8
            r1 = r1 | r2
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r1)
            r1 = 33
            r9.setSpan(r2, r5, r4, r1)
            goto L_0x01c7
        L_0x01eb:
            r1 = 1952608120(0x74626f78, float:7.176025E31)
            if (r2 != r1) goto L_0x020a
            boolean r1 = r0.A06
            if (r1 == 0) goto L_0x020a
            int r1 = r10.A01
            int r3 = r3 - r1
            if (r3 < r8) goto L_0x0221
            int r1 = r10.A0F()
            float r3 = (float) r1
            int r1 = r0.A01
            float r1 = (float) r1
            float r3 = r3 / r1
            r2 = 0
            r1 = 1064514355(0x3f733333, float:0.95)
            float r12 = X.AnonymousClass000.A02(r3, r1, r2)
        L_0x020a:
            int r11 = r11 + r16
            r10.A0S(r11)
            goto L_0x0143
        L_0x0211:
            java.lang.String r1 = "Unexpected subtitle format."
            X.3Ua r0 = new X.3Ua
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0219:
            java.lang.String r1 = "Unexpected subtitle format."
            X.3Ua r0 = new X.3Ua
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0221:
            java.lang.String r1 = "Unexpected subtitle format."
            X.3Ua r0 = new X.3Ua
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0229:
            X.4b6 r1 = new X.4b6
            r1.<init>()
            r1.A0E = r9
            r0 = 0
            r1.A01 = r12
            r1.A07 = r0
            r1.A06 = r0
            X.4aV r0 = r1.A00()
            X.4q7 r1 = new X.4q7
            r1.<init>(r0)
            return r1
        L_0x0241:
            java.lang.String r1 = "Unexpected subtitle format."
            X.3Ua r0 = new X.3Ua
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0249:
            X.3VX r0 = (X.AnonymousClass3VX) r0
            java.lang.String r5 = "SubripDecoder"
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            X.4TJ r3 = new X.4TJ
            r3.<init>()
            X.4eH r6 = new X.4eH
            r6.<init>(r8, r2)
        L_0x025b:
            java.lang.String r2 = r6.A0L()
            r7 = 0
            if (r2 == 0) goto L_0x0285
            int r1 = r2.length()
            if (r1 == 0) goto L_0x025b
            java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x026c }
            goto L_0x027a
        L_0x026c:
            java.lang.String r1 = "Skipping invalid index: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            android.util.Log.w(r5, r1)
            goto L_0x025b
        L_0x027a:
            java.lang.String r2 = r6.A0L()
            if (r2 != 0) goto L_0x029b
            java.lang.String r0 = "Unexpected end"
            android.util.Log.w(r5, r0)
        L_0x0285:
            X.4aV[] r0 = new X.C88444aV[r7]
            java.lang.Object[] r2 = r4.toArray(r0)
            X.4aV[] r2 = (X.C88444aV[]) r2
            long[] r1 = r3.A01
            int r0 = r3.A00
            long[] r1 = java.util.Arrays.copyOf(r1, r0)
            X.4q4 r0 = new X.4q4
            r0.<init>(r1, r2)
            return r0
        L_0x029b:
            java.util.regex.Pattern r1 = X.AnonymousClass3VX.A03
            java.util.regex.Matcher r8 = r1.matcher(r2)
            boolean r1 = r8.matches()
            if (r1 == 0) goto L_0x03e0
            r1 = 1
            long r1 = X.AnonymousClass3VX.A01(r8, r1)
            r3.A01(r1)
            r1 = 6
            long r1 = X.AnonymousClass3VX.A01(r8, r1)
            r3.A01(r1)
            java.lang.StringBuilder r13 = r0.A00
            r13.setLength(r7)
            java.util.ArrayList r8 = r0.A01
            r8.clear()
        L_0x02c1:
            java.lang.String r2 = r6.A0L()
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0308
            int r1 = r13.length()
            if (r1 <= 0) goto L_0x02d6
            java.lang.String r1 = "<br>"
            r13.append(r1)
        L_0x02d6:
            java.lang.String r2 = r2.trim()
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0r(r2)
            java.util.regex.Pattern r1 = X.AnonymousClass3VX.A02
            java.util.regex.Matcher r14 = r1.matcher(r2)
            r11 = 0
        L_0x02e5:
            boolean r1 = r14.find()
            if (r1 == 0) goto L_0x0304
            java.lang.String r1 = r14.group()
            r8.add(r1)
            int r10 = r14.start()
            int r10 = r10 - r11
            int r9 = r1.length()
            int r2 = r10 + r9
            java.lang.String r1 = ""
            r12.replace(r10, r2, r1)
            int r11 = r11 + r9
            goto L_0x02e5
        L_0x0304:
            X.AnonymousClass000.A1I(r12, r13)
            goto L_0x02c1
        L_0x0308:
            java.lang.String r1 = r13.toString()
            android.text.Spanned r17 = android.text.Html.fromHtml(r1)
            r9 = 0
        L_0x0311:
            int r1 = r8.size()
            if (r7 >= r1) goto L_0x0326
            java.lang.Object r2 = r8.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = "\\{\\\\an[1-9]\\}"
            boolean r1 = r2.matches(r1)
            if (r1 == 0) goto L_0x03dc
            r9 = r2
        L_0x0326:
            r15 = 0
            r18 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r24 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == 0) goto L_0x0367
            int r14 = r9.hashCode()
            java.lang.String r13 = "{\\an9}"
            java.lang.String r12 = "{\\an8}"
            java.lang.String r11 = "{\\an7}"
            java.lang.String r2 = "{\\an6}"
            java.lang.String r1 = "{\\an4}"
            java.lang.String r10 = "{\\an3}"
            java.lang.String r8 = "{\\an2}"
            java.lang.String r7 = "{\\an1}"
            switch(r14) {
                case -685620710: goto L_0x03b9;
                case -685620648: goto L_0x03be;
                case -685620617: goto L_0x03c3;
                case -685620555: goto L_0x03c8;
                case -685620524: goto L_0x03cd;
                case -685620462: goto L_0x03d3;
                default: goto L_0x034c;
            }
        L_0x034c:
            r1 = 1
        L_0x034d:
            switch(r14) {
                case -685620710: goto L_0x0397;
                case -685620679: goto L_0x039c;
                case -685620648: goto L_0x03a1;
                case -685620524: goto L_0x03a7;
                case -685620493: goto L_0x03ac;
                case -685620462: goto L_0x03b1;
                default: goto L_0x0350;
            }
        L_0x0350:
            r2 = 1
        L_0x0351:
            if (r1 == 0) goto L_0x0393
            r7 = 1
            r19 = 1056964608(0x3f000000, float:0.5)
            if (r1 == r7) goto L_0x035b
            r19 = 1064011039(0x3f6b851f, float:0.92)
        L_0x035b:
            if (r2 == 0) goto L_0x038f
            r7 = 1
            r18 = 1056964608(0x3f000000, float:0.5)
            if (r2 == r7) goto L_0x0365
            r18 = 1064011039(0x3f6b851f, float:0.92)
        L_0x0365:
            r24 = 0
        L_0x0367:
            r23 = 0
            r27 = -2147483648(0xffffffff80000000, float:-0.0)
            r28 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r30 = 0
            r20 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r21 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r22 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r29 = -2147483648(0xffffffff80000000, float:-0.0)
            X.4aV r14 = new X.4aV
            r16 = r15
            r25 = r2
            r26 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r4.add(r14)
            X.4aV r1 = X.C88444aV.A0G
            r4.add(r1)
            goto L_0x025b
        L_0x038f:
            r18 = 1034147594(0x3da3d70a, float:0.08)
            goto L_0x0365
        L_0x0393:
            r19 = 1034147594(0x3da3d70a, float:0.08)
            goto L_0x035b
        L_0x0397:
            boolean r7 = r9.equals(r7)
            goto L_0x03a5
        L_0x039c:
            boolean r7 = r9.equals(r8)
            goto L_0x03a5
        L_0x03a1:
            boolean r7 = r9.equals(r10)
        L_0x03a5:
            r2 = 2
            goto L_0x03b6
        L_0x03a7:
            boolean r7 = r9.equals(r11)
            goto L_0x03b5
        L_0x03ac:
            boolean r7 = r9.equals(r12)
            goto L_0x03b5
        L_0x03b1:
            boolean r7 = r9.equals(r13)
        L_0x03b5:
            r2 = 0
        L_0x03b6:
            if (r7 != 0) goto L_0x0351
            goto L_0x0350
        L_0x03b9:
            boolean r2 = r9.equals(r7)
            goto L_0x03d1
        L_0x03be:
            boolean r2 = r9.equals(r10)
            goto L_0x03d7
        L_0x03c3:
            boolean r2 = r9.equals(r1)
            goto L_0x03d1
        L_0x03c8:
            boolean r2 = r9.equals(r2)
            goto L_0x03d7
        L_0x03cd:
            boolean r2 = r9.equals(r11)
        L_0x03d1:
            r1 = 0
            goto L_0x03d8
        L_0x03d3:
            boolean r2 = r9.equals(r13)
        L_0x03d7:
            r1 = 2
        L_0x03d8:
            if (r2 != 0) goto L_0x034d
            goto L_0x034c
        L_0x03dc:
            int r7 = r7 + 1
            goto L_0x0311
        L_0x03e0:
            java.lang.String r1 = "Skipping invalid timing: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            android.util.Log.w(r5, r1)
            goto L_0x025b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65323Ui.A07(byte[], int, boolean):X.5Sn");
    }

    public void AeO(long j2) {
    }

    public final String getName() {
        return this.A00;
    }
}
