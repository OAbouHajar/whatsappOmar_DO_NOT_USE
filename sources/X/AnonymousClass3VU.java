package X;

/* renamed from: X.3VU  reason: invalid class name */
public final class AnonymousClass3VU extends C65323Ui {
    public final C90624eT A00 = new C90624eT();
    public final C90504eH A01 = new C90504eH();

    public AnonymousClass3VU() {
        super("WebvttDecoder");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f5, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f6, code lost:
        r8.A0B = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0200, code lost:
        if ("text-decoration".equals(r13) == false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0208, code lost:
        if ("underline".equals(r12) == false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x020a, code lost:
        r8.A05 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0214, code lost:
        if ("font-family".equals(r13) == false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0216, code lost:
        r8.A06 = r12.toLowerCase(java.util.Locale.US);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0226, code lost:
        if ("font-weight".equals(r13) == false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x022e, code lost:
        if ("bold".equals(r12) == false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0230, code lost:
        r8.A01 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x023a, code lost:
        if ("font-style".equals(r13) == false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0242, code lost:
        if ("italic".equals(r12) == false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0244, code lost:
        r8.A03 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0175, code lost:
        if (r12 == null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017b, code lost:
        if ("".equals(r12) != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017d, code lost:
        r14 = r7.A01;
        r1 = X.C90624eT.A01(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0189, code lost:
        if (";".equals(r1) != false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018f, code lost:
        if ("}".equals(r1) == false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0191, code lost:
        r7.A0S(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019a, code lost:
        if ("color".equals(r13) == false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019c, code lost:
        r8.A02 = X.AnonymousClass4ZA.A00(r12, true);
        r8.A0D = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ae, code lost:
        if ("background-color".equals(r13) == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b0, code lost:
        r8.A00 = X.AnonymousClass4ZA.A00(r12, true);
        r8.A0C = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01bc, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c3, code lost:
        if ("ruby-position".equals(r13) == false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01cb, code lost:
        if ("over".equals(r12) == false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01cd, code lost:
        r8.A04 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d7, code lost:
        if ("under".equals(r12) == false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d9, code lost:
        r8.A04 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e3, code lost:
        if ("text-combine-upright".equals(r13) == false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01eb, code lost:
        if ("all".equals(r12) != false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f3, code lost:
        if (r12.startsWith("digits") != false) goto L_0x01f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C109535Sn A07(byte[] r20, int r21, boolean r22) {
        /*
            r19 = this;
            r18 = r19
            r0 = r18
            X.4eH r0 = r0.A01
            r17 = r0
            r2 = r20
            r1 = r21
            r0.A0U(r2, r1)
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            int r2 = r0.A01     // Catch:{ 40M -> 0x031f }
            java.lang.String r1 = r17.A0L()     // Catch:{ 40M -> 0x031f }
            if (r1 == 0) goto L_0x0307
            java.lang.String r0 = "WEBVTT"
            boolean r0 = r1.startsWith(r0)     // Catch:{ 40M -> 0x031f }
            if (r0 == 0) goto L_0x0307
        L_0x0023:
            java.lang.String r0 = r17.A0L()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0023
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
        L_0x0031:
            r0 = r17
            int r4 = r0.A01
            java.lang.String r1 = r17.A0L()
            if (r1 != 0) goto L_0x02e2
            r1 = 0
        L_0x003c:
            r0 = r17
            r0.A0S(r4)
            if (r1 == 0) goto L_0x0301
            r0 = 1
            if (r1 == r0) goto L_0x02d7
            r5 = 2
            if (r1 != r5) goto L_0x029c
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x02f9
            r17.A0L()
            r0 = r18
            X.4eT r1 = r0.A00
            java.lang.StringBuilder r6 = r1.A01
            r4 = 0
            r6.setLength(r4)
            r0 = r17
            int r8 = r0.A01
        L_0x0060:
            java.lang.String r0 = r17.A0L()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0060
            X.4eH r7 = r1.A00
            r0 = r17
            byte[] r1 = r0.A02
            int r0 = r0.A01
            r7.A0U(r1, r0)
            r7.A0S(r8)
            java.util.ArrayList r9 = X.AnonymousClass000.A0u()
        L_0x007c:
            X.C90624eT.A02(r7)
            int r1 = X.C90504eH.A00(r7)
            r0 = 5
            r11 = 0
            if (r1 < r0) goto L_0x0297
            java.lang.String r1 = r7.A0O(r0)
            java.lang.String r0 = "::cue"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0297
            int r10 = r7.A01
            java.lang.String r1 = X.C90624eT.A01(r7, r6)
            if (r1 == 0) goto L_0x0297
            java.lang.String r8 = "{"
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x025b
            r7.A0S(r10)
            java.lang.String r11 = ""
        L_0x00a8:
            java.lang.String r0 = X.C90624eT.A01(r7, r6)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0297
            X.4P7 r8 = new X.4P7
            r8.<init>()
            java.lang.String r10 = ""
            boolean r0 = r10.equals(r11)
            if (r0 != 0) goto L_0x011a
            r0 = 91
            int r13 = r11.indexOf(r0)
            r14 = -1
            r12 = 1
            if (r13 == r14) goto L_0x00e3
            java.util.regex.Pattern r1 = X.C90624eT.A02
            java.lang.String r0 = r11.substring(r13)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = r1.group(r12)
            r8.A09 = r0
        L_0x00df:
            java.lang.String r11 = r11.substring(r4, r13)
        L_0x00e3:
            java.lang.String r0 = "\\."
            java.lang.String[] r11 = r11.split(r0, r14)
            r13 = r11[r4]
            r0 = 35
            int r1 = r13.indexOf(r0)
            if (r1 == r14) goto L_0x0257
            java.lang.String r0 = r13.substring(r4, r1)
            r8.A08 = r0
            int r0 = r1 + 1
            java.lang.String r0 = r13.substring(r0)
            r8.A07 = r0
        L_0x0101:
            int r1 = r11.length
            if (r1 <= r12) goto L_0x011a
            r0 = 1
            if (r1 <= r1) goto L_0x0108
            r0 = 0
        L_0x0108:
            X.C90524eJ.A03(r0)
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r11, r12, r1)
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r8.A0A = r0
        L_0x011a:
            r11 = 0
            r16 = 0
        L_0x011d:
            java.lang.String r15 = "}"
            if (r16 != 0) goto L_0x024c
            int r1 = r7.A01
            java.lang.String r11 = X.C90624eT.A01(r7, r6)
            if (r11 == 0) goto L_0x0248
            boolean r0 = r15.equals(r11)
            if (r0 != 0) goto L_0x0248
            r16 = 0
            r7.A0S(r1)
            X.C90624eT.A02(r7)
            java.lang.String r13 = X.C90624eT.A00(r7, r6)
            boolean r0 = r10.equals(r13)
            if (r0 != 0) goto L_0x011d
            java.lang.String r1 = X.C90624eT.A01(r7, r6)
            java.lang.String r0 = ":"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011d
            X.C90624eT.A02(r7)
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0o()
        L_0x0154:
            int r12 = r7.A01
            java.lang.String r1 = X.C90624eT.A01(r7, r6)
            if (r1 == 0) goto L_0x011d
            boolean r0 = r15.equals(r1)
            if (r0 != 0) goto L_0x016e
            java.lang.String r0 = ";"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x016e
            r14.append(r1)
            goto L_0x0154
        L_0x016e:
            r7.A0S(r12)
            java.lang.String r12 = r14.toString()
            if (r12 == 0) goto L_0x011d
            boolean r0 = r10.equals(r12)
            if (r0 != 0) goto L_0x011d
            int r14 = r7.A01
            java.lang.String r1 = X.C90624eT.A01(r7, r6)
            java.lang.String r0 = ";"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0194
            boolean r0 = r15.equals(r1)
            if (r0 == 0) goto L_0x011d
            r7.A0S(r14)
        L_0x0194:
            java.lang.String r0 = "color"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x01a8
            r0 = 1
            int r0 = X.AnonymousClass4ZA.A00(r12, r0)
            r8.A02 = r0
            r0 = 1
            r8.A0D = r0
            goto L_0x011d
        L_0x01a8:
            java.lang.String r0 = "background-color"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x01bc
            r0 = 1
            int r0 = X.AnonymousClass4ZA.A00(r12, r0)
            r8.A00 = r0
            r0 = 1
            r8.A0C = r0
            goto L_0x011d
        L_0x01bc:
            java.lang.String r0 = "ruby-position"
            boolean r0 = r0.equals(r13)
            r1 = 1
            if (r0 == 0) goto L_0x01dd
            java.lang.String r0 = "over"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x01d1
            r8.A04 = r1
            goto L_0x011d
        L_0x01d1:
            java.lang.String r0 = "under"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x011d
            r8.A04 = r5
            goto L_0x011d
        L_0x01dd:
            java.lang.String r0 = "text-combine-upright"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x01fa
            java.lang.String r0 = "all"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x01f6
            java.lang.String r0 = "digits"
            boolean r0 = r12.startsWith(r0)
            if (r0 != 0) goto L_0x01f6
            r1 = 0
        L_0x01f6:
            r8.A0B = r1
            goto L_0x011d
        L_0x01fa:
            java.lang.String r0 = "text-decoration"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x020e
            java.lang.String r0 = "underline"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x011d
            r8.A05 = r1
            goto L_0x011d
        L_0x020e:
            java.lang.String r0 = "font-family"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0220
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r12.toLowerCase(r0)
            r8.A06 = r0
            goto L_0x011d
        L_0x0220:
            java.lang.String r0 = "font-weight"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0234
            java.lang.String r0 = "bold"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x011d
            r8.A01 = r1
            goto L_0x011d
        L_0x0234:
            java.lang.String r0 = "font-style"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x011d
            java.lang.String r0 = "italic"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x011d
            r8.A03 = r1
            goto L_0x011d
        L_0x0248:
            r16 = 1
            goto L_0x011d
        L_0x024c:
            boolean r0 = r15.equals(r11)
            if (r0 == 0) goto L_0x007c
            r9.add(r8)
            goto L_0x007c
        L_0x0257:
            r8.A08 = r13
            goto L_0x0101
        L_0x025b:
            java.lang.String r0 = "("
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0287
            int r1 = r7.A01
            r12 = r1
            int r11 = r7.A00
            r0 = 0
        L_0x0269:
            if (r1 >= r11) goto L_0x027c
            if (r0 != 0) goto L_0x027c
            byte[] r0 = r7.A02
            int r10 = r1 + 1
            byte r0 = r0[r1]
            char r1 = (char) r0
            r0 = 41
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)
            r1 = r10
            goto L_0x0269
        L_0x027c:
            int r0 = r1 + -1
            int r0 = r0 - r12
            java.lang.String r0 = r7.A0O(r0)
            java.lang.String r11 = r0.trim()
        L_0x0287:
            java.lang.String r1 = X.C90624eT.A01(r7, r6)
            java.lang.String r0 = ")"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0297
            if (r11 == 0) goto L_0x0297
            goto L_0x00a8
        L_0x0297:
            r3.addAll(r9)
            goto L_0x0031
        L_0x029c:
            java.lang.String r6 = r17.A0L()
            r5 = 0
            if (r6 == 0) goto L_0x0031
            java.util.regex.Pattern r4 = X.C90664ea.A02
            java.util.regex.Matcher r1 = r4.matcher(r6)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x02bc
            r0 = r17
            X.1jw r0 = X.C90664ea.A01(r0, r5, r3, r1)
        L_0x02b5:
            if (r0 == 0) goto L_0x0031
            r2.add(r0)
            goto L_0x0031
        L_0x02bc:
            java.lang.String r0 = r17.A0L()
            if (r0 == 0) goto L_0x0031
            java.util.regex.Matcher r4 = r4.matcher(r0)
            boolean r0 = r4.matches()
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = r6.trim()
            r0 = r17
            X.1jw r0 = X.C90664ea.A01(r0, r1, r3, r4)
            goto L_0x02b5
        L_0x02d7:
            java.lang.String r0 = r17.A0L()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0031
            goto L_0x02d7
        L_0x02e2:
            java.lang.String r0 = "STYLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02ed
            r1 = 2
            goto L_0x003c
        L_0x02ed:
            java.lang.String r0 = "NOTE"
            boolean r0 = r1.startsWith(r0)
            r1 = 3
            if (r0 == 0) goto L_0x003c
            r1 = 1
            goto L_0x003c
        L_0x02f9:
            java.lang.String r1 = "A style block was found after the first cue."
            X.3Ua r0 = new X.3Ua
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0301:
            X.4q5 r0 = new X.4q5
            r0.<init>(r2)
            return r0
        L_0x0307:
            r0 = r17
            r0.A0S(r2)     // Catch:{ 40M -> 0x031f }
            java.lang.String r0 = "Expected WEBVTT. Got "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 40M -> 0x031f }
            java.lang.String r0 = r17.A0L()     // Catch:{ 40M -> 0x031f }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 40M -> 0x031f }
            X.40M r0 = X.AnonymousClass40M.A00(r0)     // Catch:{ 40M -> 0x031f }
            throw r0     // Catch:{ 40M -> 0x031f }
        L_0x031f:
            r1 = move-exception
            X.3Ua r0 = new X.3Ua
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VU.A07(byte[], int, boolean):X.5Sn");
    }
}
