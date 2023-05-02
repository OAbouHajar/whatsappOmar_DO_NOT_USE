package X;

import java.util.List;

/* renamed from: X.3Vd  reason: invalid class name and case insensitive filesystem */
public final class C65533Vd extends C97524q8 {
    public int A00;
    public int A01 = -1;
    public C90114dW A02;
    public AnonymousClass4LU A03;
    public List A04;
    public List A05;
    public final int A06;
    public final C90204dh A07 = new C90204dh();
    public final C90504eH A08 = new C90504eH();
    public final C90114dW[] A09;

    public C65533Vd(List list, int i2) {
        this.A06 = i2 == -1 ? 1 : i2;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            list.get(0);
        }
        this.A09 = new C90114dW[8];
        int i3 = 0;
        do {
            this.A09[i3] = new C90114dW();
            i3++;
        } while (i3 < 8);
        this.A02 = this.A09[0];
    }

    public static int A00(C90204dh r4) {
        return C90114dW.A00(r4.A04(2), r4.A04(2), r4.A04(2), r4.A04(2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A02() {
        /*
            r17 = this;
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            r2 = 0
            r1 = 0
        L_0x0006:
            r0 = r17
            X.4dW[] r5 = r0.A09
            r4 = r5[r1]
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0020
            java.util.List r0 = r4.A0L
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0047
            android.text.SpannableStringBuilder r0 = r4.A0K
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0047
        L_0x0020:
            int r1 = r1 + 1
            r0 = 8
            if (r1 < r0) goto L_0x0006
            java.util.Comparator r0 = X.C34271jz.A02
            java.util.Collections.sort(r3, r0)
            int r0 = r3.size()
            java.util.ArrayList r1 = X.C13690nt.A0i(r0)
        L_0x0033:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x00f7
            java.lang.Object r0 = r3.get(r2)
            X.1jz r0 = (X.C34271jz) r0
            X.4aV r0 = r0.A01
            r1.add(r0)
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0047:
            r0 = r5[r1]
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x0020
            r4 = r5[r1]
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0020
            java.util.List r6 = r4.A0L
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0064
            android.text.SpannableStringBuilder r0 = r4.A0K
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0064
            goto L_0x0020
        L_0x0064:
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>()
            r16 = 0
            r5 = 0
        L_0x006c:
            int r0 = r6.size()
            if (r5 >= r0) goto L_0x0083
            java.lang.Object r0 = r6.get(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            r0 = 10
            r9.append(r0)
            int r5 = r5 + 1
            goto L_0x006c
        L_0x0083:
            android.text.SpannableString r0 = r4.A01()
            r9.append(r0)
            int r7 = r4.A07
            r0 = 2
            r6 = 3
            r5 = 1
            if (r7 == 0) goto L_0x00a5
            if (r7 == r5) goto L_0x00a2
            if (r7 == r0) goto L_0x00a8
            if (r7 == r6) goto L_0x00a5
            java.lang.String r0 = "Unexpected justification value: "
            java.lang.String r0 = X.C13680ns.A0c(r7, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x00a2:
            android.text.Layout$Alignment r8 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x00aa
        L_0x00a5:
            android.text.Layout$Alignment r8 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x00aa
        L_0x00a8:
            android.text.Layout$Alignment r8 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00aa:
            boolean r7 = r4.A0H
            int r0 = r4.A05
            float r11 = (float) r0
            if (r7 == 0) goto L_0x00ed
            r7 = 1120272384(0x42c60000, float:99.0)
            float r11 = r11 / r7
            int r0 = r4.A0D
            float r10 = (float) r0
            float r10 = r10 / r7
        L_0x00b8:
            r7 = 1063675494(0x3f666666, float:0.9)
            float r11 = r11 * r7
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            float r11 = r11 + r0
            float r10 = r10 * r7
            float r10 = r10 + r0
            int r7 = r4.A00
            int r0 = r7 / 3
            if (r0 != 0) goto L_0x00e8
            r12 = 0
        L_0x00c9:
            int r0 = r7 % 3
            if (r0 != 0) goto L_0x00e2
            r13 = 0
        L_0x00ce:
            int r14 = r4.A0E
            int r0 = X.C90114dW.A0M
            if (r14 == r0) goto L_0x00d6
            r16 = 1
        L_0x00d6:
            int r15 = r4.A09
            X.1jz r7 = new X.1jz
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.add(r7)
            goto L_0x0020
        L_0x00e2:
            int r7 = r7 % r6
            r13 = 2
            if (r7 != r5) goto L_0x00ce
            r13 = 1
            goto L_0x00ce
        L_0x00e8:
            r12 = 2
            if (r0 != r5) goto L_0x00c9
            r12 = 1
            goto L_0x00c9
        L_0x00ed:
            r0 = 1129381888(0x43510000, float:209.0)
            float r11 = r11 / r0
            int r0 = r4.A0D
            float r10 = (float) r0
            r0 = 1116995584(0x42940000, float:74.0)
            float r10 = r10 / r0
            goto L_0x00b8
        L_0x00f7:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65533Vd.A02():java.util.List");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x030b, code lost:
        r2.A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x034a, code lost:
        if (r2.A0C() == false) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x034c, code lost:
        r1 = r4.A09[8 - r6];
        r1.A0J = !r1.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0358, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0381, code lost:
        if (r8 <= 23) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x038d, code lost:
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03c3, code lost:
        android.util.Log.w("Cea708Decoder", X.C13680ns.A0c(r8, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0175, code lost:
        if (r2.A0C() == false) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0177, code lost:
        r4.A09[8 - r6].A0J = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017f, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0188, code lost:
        if (r2.A0C() == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018a, code lost:
        r1 = r4.A09[8 - r6];
        r1.A0L.clear();
        r1.A0K.clear();
        r1.A06 = -1;
        r1.A0C = -1;
        r1.A04 = -1;
        r1.A02 = -1;
        r1.A0A = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a6, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01af, code lost:
        if (r2.A0C() == false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b1, code lost:
        r4.A09[8 - r6].A0J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ba, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c3, code lost:
        if (r2.A0C() == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c5, code lost:
        r4.A09[8 - r6].A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ce, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0230, code lost:
        if (r4.A00 == r8) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0232, code lost:
        r4.A00 = r8;
        r4.A02 = r4.A09[r8];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r17 = this;
            r4 = r17
            X.4LU r7 = r4.A03
            if (r7 == 0) goto L_0x0081
            int r6 = r7.A00
            int r0 = r7.A01
            r8 = 2
            int r2 = r0 << 1
            r5 = 1
            int r2 = r2 - r5
            java.lang.String r3 = "Cea708Decoder"
            if (r6 == r2) goto L_0x0037
            java.lang.String r0 = "DtvCcPacket ended prematurely; size is "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = ", but current index is "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " (sequence number "
            r1.append(r0)
            int r0 = r7.A02
            r1.append(r0)
            java.lang.String r0 = ");"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.util.Log.d(r3, r0)
        L_0x0037:
            X.4dh r2 = r4.A07
            X.4LU r1 = r4.A03
            byte[] r0 = r1.A03
            int r1 = r1.A00
            r2.A03 = r0
            r0 = 0
            r2.A02 = r0
            r2.A00 = r0
            r2.A01 = r1
            r0 = 3
            int r7 = r2.A04(r0)
            r0 = 5
            int r6 = r2.A04(r0)
            r1 = 7
            if (r7 != r1) goto L_0x0068
            r2.A08(r8)
            r0 = 6
            int r7 = r2.A04(r0)
            if (r7 >= r1) goto L_0x0068
            java.lang.String r0 = "Invalid extended service number: "
            java.lang.String r0 = X.C13680ns.A0c(r7, r0)
            android.util.Log.w(r3, r0)
        L_0x0068:
            if (r6 != 0) goto L_0x0082
            if (r7 == 0) goto L_0x007e
            java.lang.String r0 = "serviceNumber is non-zero ("
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r7)
            java.lang.String r0 = ") when blockSize is 0"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.util.Log.w(r3, r0)
        L_0x007e:
            r0 = 0
            r4.A03 = r0
        L_0x0081:
            return
        L_0x0082:
            int r0 = r4.A06
            if (r7 != r0) goto L_0x007e
            r11 = 0
        L_0x0087:
            int r0 = X.C90204dh.A00(r2)
            if (r0 <= 0) goto L_0x0498
            r7 = 8
            int r8 = r2.A04(r7)
            r10 = 16
            r9 = 255(0xff, float:3.57E-43)
            r6 = 159(0x9f, float:2.23E-43)
            r1 = 127(0x7f, float:1.78E-43)
            r0 = 31
            if (r8 == r10) goto L_0x036e
            if (r8 > r0) goto L_0x00ed
            if (r8 == 0) goto L_0x0087
            r0 = 3
            if (r8 == r0) goto L_0x00e6
            r1 = 8
            if (r8 == r7) goto L_0x00d6
            switch(r8) {
                case 12: goto L_0x00ca;
                case 13: goto L_0x00ce;
                case 14: goto L_0x0087;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            r0 = 17
            if (r8 < r0) goto L_0x00c2
            r0 = 23
            if (r8 > r0) goto L_0x0384
            java.lang.String r0 = "Currently unsupported COMMAND_EXT1 Command: "
            java.lang.String r0 = X.C13680ns.A0c(r8, r0)
            android.util.Log.w(r3, r0)
        L_0x00be:
            r2.A08(r1)
            goto L_0x0087
        L_0x00c2:
            java.lang.String r0 = "Invalid C0 command: "
            java.lang.String r0 = X.C13680ns.A0c(r8, r0)
            goto L_0x0493
        L_0x00ca:
            r4.A04()
            goto L_0x0087
        L_0x00ce:
            X.4dW r1 = r4.A02
            r0 = 10
            r1.A03(r0)
            goto L_0x0087
        L_0x00d6:
            X.4dW r0 = r4.A02
            android.text.SpannableStringBuilder r6 = r0.A0K
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x0087
            int r0 = r1 + -1
            r6.delete(r0, r1)
            goto L_0x0087
        L_0x00e6:
            java.util.List r0 = r4.A02()
            r4.A04 = r0
            goto L_0x0087
        L_0x00ed:
            if (r8 > r1) goto L_0x00f7
            if (r8 != r1) goto L_0x0367
            X.4dW r1 = r4.A02
            r0 = 9835(0x266b, float:1.3782E-41)
            goto L_0x0476
        L_0x00f7:
            if (r8 > r6) goto L_0x035d
            r1 = 16
            r6 = 1
            switch(r8) {
                case 128: goto L_0x01d3;
                case 129: goto L_0x01d3;
                case 130: goto L_0x01d3;
                case 131: goto L_0x01d3;
                case 132: goto L_0x01d3;
                case 133: goto L_0x01d3;
                case 134: goto L_0x01d3;
                case 135: goto L_0x01d3;
                case 136: goto L_0x0184;
                case 137: goto L_0x0171;
                case 138: goto L_0x01ab;
                case 139: goto L_0x0346;
                case 140: goto L_0x01bf;
                case 141: goto L_0x023c;
                case 142: goto L_0x03ca;
                case 143: goto L_0x0241;
                case 144: goto L_0x0273;
                case 145: goto L_0x0246;
                case 146: goto L_0x02e0;
                case 147: goto L_0x0343;
                case 148: goto L_0x0343;
                case 149: goto L_0x0343;
                case 150: goto L_0x0343;
                case 151: goto L_0x0303;
                default: goto L_0x00ff;
            }
        L_0x00ff:
            int r8 = r8 + -152
            X.4dW[] r0 = r4.A09
            r9 = r0[r8]
            r13 = 2
            r2.A08(r13)
            boolean r15 = r2.A0C()
            boolean r14 = r2.A0C()
            r2.A05()
            r12 = 3
            int r11 = r2.A04(r12)
            boolean r10 = r2.A0C()
            r0 = 7
            int r6 = r2.A04(r0)
            int r7 = r2.A04(r7)
            r0 = 4
            int r1 = r2.A04(r0)
            int r16 = r2.A04(r0)
            r2.A08(r13)
            r0 = 6
            r2.A04(r0)
            int r0 = X.C90204dh.A01(r2, r13, r12)
            int r12 = r2.A04(r12)
            r9.A0G = r5
            r9.A0J = r15
            r9.A0I = r14
            r9.A09 = r11
            r9.A0H = r10
            r9.A0D = r6
            r9.A05 = r7
            r9.A00 = r1
            int r6 = r9.A0B
            int r1 = r16 + 1
            if (r6 == r1) goto L_0x01d6
            r9.A0B = r1
        L_0x0156:
            if (r14 == 0) goto L_0x0162
            java.util.List r7 = r9.A0L
            int r6 = r7.size()
            int r1 = r9.A0B
            if (r6 >= r1) goto L_0x016c
        L_0x0162:
            java.util.List r7 = r9.A0L
            int r6 = r7.size()
            r1 = 15
            if (r6 < r1) goto L_0x01d6
        L_0x016c:
            r1 = 0
            r7.remove(r1)
            goto L_0x0156
        L_0x0171:
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x017f
            X.4dW[] r1 = r4.A09
            int r0 = 8 - r6
            r0 = r1[r0]
            r0.A0J = r5
        L_0x017f:
            int r6 = r6 + 1
            if (r6 > r7) goto L_0x03ca
            goto L_0x0171
        L_0x0184:
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x01a6
            X.4dW[] r1 = r4.A09
            int r0 = 8 - r6
            r1 = r1[r0]
            java.util.List r0 = r1.A0L
            r0.clear()
            android.text.SpannableStringBuilder r0 = r1.A0K
            r0.clear()
            r0 = -1
            r1.A06 = r0
            r1.A0C = r0
            r1.A04 = r0
            r1.A02 = r0
            r0 = 0
            r1.A0A = r0
        L_0x01a6:
            int r6 = r6 + 1
            if (r6 > r7) goto L_0x03ca
            goto L_0x0184
        L_0x01ab:
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x01ba
            X.4dW[] r1 = r4.A09
            int r0 = 8 - r6
            r1 = r1[r0]
            r0 = 0
            r1.A0J = r0
        L_0x01ba:
            int r6 = r6 + 1
            if (r6 > r7) goto L_0x03ca
            goto L_0x01ab
        L_0x01bf:
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x01ce
            X.4dW[] r1 = r4.A09
            int r0 = 8 - r6
            r0 = r1[r0]
            r0.A02()
        L_0x01ce:
            int r6 = r6 + 1
            if (r6 > r7) goto L_0x03ca
            goto L_0x01bf
        L_0x01d3:
            int r8 = r8 + -128
            goto L_0x022e
        L_0x01d6:
            if (r0 == 0) goto L_0x01ec
            int r1 = r9.A0F
            if (r1 == r0) goto L_0x01ec
            r9.A0F = r0
            int r6 = r0 + -1
            int[] r0 = X.C90114dW.A0P
            r1 = r0[r6]
            int[] r0 = X.C90114dW.A0Q
            r0 = r0[r6]
            r9.A0E = r1
            r9.A07 = r0
        L_0x01ec:
            if (r12 == 0) goto L_0x022e
            int r0 = r9.A08
            if (r0 == r12) goto L_0x022e
            r9.A08 = r12
            int r12 = r12 + -1
            int r0 = r9.A06
            r11 = 33
            r10 = -1
            if (r0 == r10) goto L_0x020f
            android.text.SpannableStringBuilder r7 = r9.A0K
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r13)
            int r1 = r9.A06
            int r0 = r7.length()
            r7.setSpan(r6, r1, r0, r11)
            r9.A06 = r10
        L_0x020f:
            int r0 = r9.A0C
            if (r0 == r10) goto L_0x0225
            android.text.SpannableStringBuilder r7 = r9.A0K
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            int r1 = r9.A0C
            int r0 = r7.length()
            r7.setSpan(r6, r1, r0, r11)
            r9.A0C = r10
        L_0x0225:
            int r1 = X.C90114dW.A0N
            int[] r0 = X.C90114dW.A0O
            r0 = r0[r12]
            r9.A04(r1, r0)
        L_0x022e:
            int r0 = r4.A00
            if (r0 == r8) goto L_0x03ca
            r4.A00 = r8
            X.4dW[] r0 = r4.A09
            r0 = r0[r8]
            r4.A02 = r0
            goto L_0x03ca
        L_0x023c:
            r2.A08(r7)
            goto L_0x03ca
        L_0x0241:
            r4.A04()
            goto L_0x03ca
        L_0x0246:
            X.4dW r0 = r4.A02
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x0250
            r1 = 24
            goto L_0x030b
        L_0x0250:
            r0 = 2
            int r9 = A00(r2)
            int r8 = A00(r2)
            r2.A08(r0)
            int r7 = r2.A04(r0)
            int r6 = r2.A04(r0)
            int r1 = r2.A04(r0)
            r0 = 0
            X.C90114dW.A00(r7, r6, r1, r0)
            X.4dW r0 = r4.A02
            r0.A04(r9, r8)
            goto L_0x03ca
        L_0x0273:
            X.4dW r8 = r4.A02
            boolean r0 = r8.A0G
            if (r0 == 0) goto L_0x030b
            r0 = 4
            r2.A04(r0)
            r0 = 2
            r2.A04(r0)
            r2.A04(r0)
            boolean r1 = r2.A0C()
            boolean r11 = r2.A0C()
            r0 = 3
            r2.A04(r0)
            r2.A04(r0)
            int r0 = r8.A06
            r10 = 33
            r9 = -1
            if (r0 == r9) goto L_0x02c9
            if (r1 != 0) goto L_0x02af
            android.text.SpannableStringBuilder r7 = r8.A0K
            r0 = 2
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            int r1 = r8.A06
            int r0 = r7.length()
            r7.setSpan(r6, r1, r0, r10)
            r8.A06 = r9
        L_0x02af:
            int r0 = r8.A0C
            if (r0 == r9) goto L_0x02d4
            if (r11 != 0) goto L_0x03ca
            android.text.SpannableStringBuilder r7 = r8.A0K
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            int r1 = r8.A0C
            int r0 = r7.length()
            r7.setSpan(r6, r1, r0, r10)
            r8.A0C = r9
            goto L_0x03ca
        L_0x02c9:
            if (r1 == 0) goto L_0x02af
            android.text.SpannableStringBuilder r0 = r8.A0K
            int r0 = r0.length()
            r8.A06 = r0
            goto L_0x02af
        L_0x02d4:
            if (r11 == 0) goto L_0x03ca
            android.text.SpannableStringBuilder r0 = r8.A0K
            int r0 = r0.length()
            r8.A0C = r0
            goto L_0x03ca
        L_0x02e0:
            X.4dW r6 = r4.A02
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x030b
            r0 = 4
            r2.A08(r0)
            int r1 = r2.A04(r0)
            r0 = 2
            r2.A08(r0)
            r0 = 6
            r2.A04(r0)
            int r0 = r6.A0A
            if (r0 == r1) goto L_0x02ff
            r0 = 10
            r6.A03(r0)
        L_0x02ff:
            r6.A0A = r1
            goto L_0x03ca
        L_0x0303:
            X.4dW r0 = r4.A02
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x0310
            r1 = 32
        L_0x030b:
            r2.A08(r1)
            goto L_0x03ca
        L_0x0310:
            r10 = 2
            int r9 = A00(r2)
            r2.A04(r10)
            int r8 = r2.A04(r10)
            int r6 = r2.A04(r10)
            int r1 = r2.A04(r10)
            r0 = 0
            X.C90114dW.A00(r8, r6, r1, r0)
            r2.A05()
            r2.A05()
            r2.A04(r10)
            r2.A04(r10)
            int r1 = r2.A04(r10)
            r2.A08(r7)
            X.4dW r0 = r4.A02
            r0.A0E = r9
            r0.A07 = r1
            goto L_0x03ca
        L_0x0343:
            java.lang.String r0 = "Invalid C1 command: "
            goto L_0x03c3
        L_0x0346:
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x0358
            X.4dW[] r1 = r4.A09
            int r0 = 8 - r6
            r1 = r1[r0]
            boolean r0 = r1.A0J
            r0 = r0 ^ 1
            r1.A0J = r0
        L_0x0358:
            int r6 = r6 + 1
            if (r6 > r7) goto L_0x03ca
            goto L_0x0346
        L_0x035d:
            if (r8 <= r9) goto L_0x0367
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "Invalid base command: "
            goto L_0x048f
        L_0x0367:
            X.4dW r1 = r4.A02
            r0 = r8 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            goto L_0x0476
        L_0x036e:
            int r8 = r2.A04(r7)
            if (r8 > r0) goto L_0x0391
            r0 = 7
            if (r8 <= r0) goto L_0x0087
            r0 = 15
            r1 = 8
            if (r8 <= r0) goto L_0x00be
            r0 = 23
            r1 = 24
            if (r8 > r0) goto L_0x00be
            goto L_0x038d
        L_0x0384:
            java.lang.String r0 = "Currently unsupported COMMAND_P16 Command: "
            java.lang.String r0 = X.C13680ns.A0c(r8, r0)
            android.util.Log.w(r3, r0)
        L_0x038d:
            r1 = 16
            goto L_0x00be
        L_0x0391:
            if (r8 > r1) goto L_0x0451
            r1 = 32
            if (r8 == r1) goto L_0x0445
            r0 = 33
            if (r8 == r0) goto L_0x0440
            r0 = 37
            if (r8 == r0) goto L_0x043b
            r0 = 42
            if (r8 == r0) goto L_0x0436
            r0 = 44
            if (r8 == r0) goto L_0x0431
            r0 = 63
            if (r8 == r0) goto L_0x042c
            r0 = 57
            if (r8 == r0) goto L_0x0427
            r0 = 58
            if (r8 == r0) goto L_0x0422
            r0 = 60
            if (r8 == r0) goto L_0x041d
            r0 = 61
            if (r8 == r0) goto L_0x0418
            switch(r8) {
                case 48: goto L_0x03fa;
                case 49: goto L_0x03ff;
                case 50: goto L_0x0404;
                case 51: goto L_0x0409;
                case 52: goto L_0x040e;
                case 53: goto L_0x0413;
                default: goto L_0x03be;
            }
        L_0x03be:
            switch(r8) {
                case 118: goto L_0x03cd;
                case 119: goto L_0x03d2;
                case 120: goto L_0x03d7;
                case 121: goto L_0x03dc;
                case 122: goto L_0x03e1;
                case 123: goto L_0x03e6;
                case 124: goto L_0x03eb;
                case 125: goto L_0x03f0;
                case 126: goto L_0x03f5;
                case 127: goto L_0x0448;
                default: goto L_0x03c1;
            }
        L_0x03c1:
            java.lang.String r0 = "Invalid G2 character: "
        L_0x03c3:
            java.lang.String r0 = X.C13680ns.A0c(r8, r0)
            android.util.Log.w(r3, r0)
        L_0x03ca:
            r11 = 1
            goto L_0x0087
        L_0x03cd:
            X.4dW r0 = r4.A02
            r1 = 8539(0x215b, float:1.1966E-41)
            goto L_0x044c
        L_0x03d2:
            X.4dW r0 = r4.A02
            r1 = 8540(0x215c, float:1.1967E-41)
            goto L_0x044c
        L_0x03d7:
            X.4dW r0 = r4.A02
            r1 = 8541(0x215d, float:1.1968E-41)
            goto L_0x044c
        L_0x03dc:
            X.4dW r0 = r4.A02
            r1 = 8542(0x215e, float:1.197E-41)
            goto L_0x044c
        L_0x03e1:
            X.4dW r0 = r4.A02
            r1 = 9474(0x2502, float:1.3276E-41)
            goto L_0x044c
        L_0x03e6:
            X.4dW r0 = r4.A02
            r1 = 9488(0x2510, float:1.3296E-41)
            goto L_0x044c
        L_0x03eb:
            X.4dW r0 = r4.A02
            r1 = 9492(0x2514, float:1.3301E-41)
            goto L_0x044c
        L_0x03f0:
            X.4dW r0 = r4.A02
            r1 = 9472(0x2500, float:1.3273E-41)
            goto L_0x044c
        L_0x03f5:
            X.4dW r0 = r4.A02
            r1 = 9496(0x2518, float:1.3307E-41)
            goto L_0x044c
        L_0x03fa:
            X.4dW r0 = r4.A02
            r1 = 9608(0x2588, float:1.3464E-41)
            goto L_0x044c
        L_0x03ff:
            X.4dW r0 = r4.A02
            r1 = 8216(0x2018, float:1.1513E-41)
            goto L_0x044c
        L_0x0404:
            X.4dW r0 = r4.A02
            r1 = 8217(0x2019, float:1.1514E-41)
            goto L_0x044c
        L_0x0409:
            X.4dW r0 = r4.A02
            r1 = 8220(0x201c, float:1.1519E-41)
            goto L_0x044c
        L_0x040e:
            X.4dW r0 = r4.A02
            r1 = 8221(0x201d, float:1.152E-41)
            goto L_0x044c
        L_0x0413:
            X.4dW r0 = r4.A02
            r1 = 8226(0x2022, float:1.1527E-41)
            goto L_0x044c
        L_0x0418:
            X.4dW r0 = r4.A02
            r1 = 8480(0x2120, float:1.1883E-41)
            goto L_0x044c
        L_0x041d:
            X.4dW r0 = r4.A02
            r1 = 339(0x153, float:4.75E-43)
            goto L_0x044c
        L_0x0422:
            X.4dW r0 = r4.A02
            r1 = 353(0x161, float:4.95E-43)
            goto L_0x044c
        L_0x0427:
            X.4dW r0 = r4.A02
            r1 = 8482(0x2122, float:1.1886E-41)
            goto L_0x044c
        L_0x042c:
            X.4dW r0 = r4.A02
            r1 = 376(0x178, float:5.27E-43)
            goto L_0x044c
        L_0x0431:
            X.4dW r0 = r4.A02
            r1 = 338(0x152, float:4.74E-43)
            goto L_0x044c
        L_0x0436:
            X.4dW r0 = r4.A02
            r1 = 352(0x160, float:4.93E-43)
            goto L_0x044c
        L_0x043b:
            X.4dW r0 = r4.A02
            r1 = 8230(0x2026, float:1.1533E-41)
            goto L_0x044c
        L_0x0440:
            X.4dW r0 = r4.A02
            r1 = 160(0xa0, float:2.24E-43)
            goto L_0x044c
        L_0x0445:
            X.4dW r0 = r4.A02
            goto L_0x044c
        L_0x0448:
            X.4dW r0 = r4.A02
            r1 = 9484(0x250c, float:1.329E-41)
        L_0x044c:
            r0.A03(r1)
            goto L_0x03ca
        L_0x0451:
            if (r8 > r6) goto L_0x046c
            r0 = 135(0x87, float:1.89E-43)
            r1 = 32
            if (r8 <= r0) goto L_0x00be
            r0 = 143(0x8f, float:2.0E-43)
            r1 = 40
            if (r8 <= r0) goto L_0x00be
            r0 = 2
            r2.A08(r0)
            r0 = 6
            int r0 = r2.A04(r0)
            int r1 = r0 << 3
            goto L_0x00be
        L_0x046c:
            if (r8 > r9) goto L_0x0489
            r0 = 160(0xa0, float:2.24E-43)
            if (r8 != r0) goto L_0x047b
            X.4dW r1 = r4.A02
            r0 = 13252(0x33c4, float:1.857E-41)
        L_0x0476:
            r1.A03(r0)
            goto L_0x03ca
        L_0x047b:
            java.lang.String r0 = "Invalid G3 character: "
            java.lang.String r0 = X.C13680ns.A0c(r8, r0)
            android.util.Log.w(r3, r0)
            X.4dW r1 = r4.A02
            r0 = 95
            goto L_0x0476
        L_0x0489:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "Invalid extended command: "
        L_0x048f:
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r8)
        L_0x0493:
            android.util.Log.w(r3, r0)
            goto L_0x0087
        L_0x0498:
            if (r11 == 0) goto L_0x007e
            java.util.List r0 = r4.A02()
            r4.A04 = r0
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65533Vd.A03():void");
    }

    public final void A04() {
        int i2 = 0;
        do {
            this.A09[i2].A02();
            i2++;
        } while (i2 < 8);
    }

    public void flush() {
        super.flush();
        this.A04 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A02 = this.A09[0];
        A04();
        this.A03 = null;
    }
}
