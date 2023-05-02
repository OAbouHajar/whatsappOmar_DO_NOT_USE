package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.22R  reason: invalid class name */
public final class AnonymousClass22R extends C28541Wm implements C28561Wp {
    public static final AnonymousClass22R A06;
    public static volatile C47872Kz A07;
    public int A00;
    public int A01 = 0;
    public Object A02;
    public String A03 = "";
    public String A04 = "";
    public boolean A05;

    static {
        AnonymousClass22R r0 = new AnonymousClass22R();
        A06 = r0;
        r0.A0W();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x019a, code lost:
        r0 = r14.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x019c, code lost:
        if (r0 == 0) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x019e, code lost:
        r11.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a0, code lost:
        r11.A00 |= r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a7, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c1, code lost:
        if (r11.A01 == 4) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01c6, code lost:
        if (r11.A01 == 3) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01cb, code lost:
        if (r11.A01 == 7) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01cd, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01ce, code lost:
        r0 = r13.Ahw(r11.A02, r14.A02, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01d6, code lost:
        r11.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0198, code lost:
        if (r13 != X.AnonymousClass2L7.A00) goto L_0x01a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            r11 = this;
            int r0 = r12.ordinal()
            r5 = 6
            r4 = 7
            r3 = 4
            r2 = 3
            r7 = 0
            r6 = 0
            switch(r0) {
                case 0: goto L_0x01e0;
                case 1: goto L_0x0139;
                case 2: goto L_0x002f;
                case 3: goto L_0x01df;
                case 4: goto L_0x01e3;
                case 5: goto L_0x01d9;
                case 6: goto L_0x0118;
                case 7: goto L_0x0013;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0013:
            X.2Kz r0 = A07
            if (r0 != 0) goto L_0x002c
            java.lang.Class<X.22R> r2 = X.AnonymousClass22R.class
            monitor-enter(r2)
            X.2Kz r0 = A07     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            X.22R r1 = A06     // Catch:{ all -> 0x0029 }
            X.2Kz r0 = new X.2Kz     // Catch:{ all -> 0x0029 }
            r0.<init>(r1)     // Catch:{ all -> 0x0029 }
            A07 = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            goto L_0x002c
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r0
        L_0x002c:
            X.2Kz r0 = A07
            return r0
        L_0x002f:
            X.2Kx r13 = (X.C47852Kx) r13
            X.2Ky r14 = (X.C47862Ky) r14
        L_0x0033:
            int r1 = r13.A03()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            if (r1 == 0) goto L_0x0118
            r0 = 10
            if (r1 == r0) goto L_0x010a
            r0 = 18
            if (r1 == r0) goto L_0x00fc
            r0 = 26
            if (r1 == r0) goto L_0x00ce
            r0 = 34
            if (r1 == r0) goto L_0x00a0
            r0 = 40
            if (r1 == r0) goto L_0x0093
            r0 = 50
            if (r1 == r0) goto L_0x008a
            r0 = 58
            if (r1 == r0) goto L_0x005d
            boolean r0 = r11.A0a(r13, r1)     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            if (r0 != 0) goto L_0x0033
            goto L_0x0118
        L_0x005d:
            int r0 = r11.A01     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            if (r0 != r4) goto L_0x0078
            java.lang.Object r0 = r11.A02     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.24n r0 = (X.C445524n) r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.3fI r1 = (X.C69593fI) r1     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
        L_0x006b:
            X.24n r0 = X.C445524n.A0O     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.1Wo r0 = r13.A09(r14, r0)     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r11.A02 = r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            goto L_0x007a
        L_0x0078:
            r1 = r7
            goto L_0x006b
        L_0x007a:
            if (r1 == 0) goto L_0x0087
            X.24n r0 = (X.C445524n) r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r1.A04(r0)     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r11.A02 = r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
        L_0x0087:
            r11.A01 = r4     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            goto L_0x0033
        L_0x008a:
            r11.A01 = r5     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.1Ww r0 = r13.A08()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r11.A02 = r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            goto L_0x0033
        L_0x0093:
            int r0 = r11.A00     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r0 = r0 | 64
            r11.A00 = r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            boolean r0 = r13.A0F()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r11.A05 = r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            goto L_0x0033
        L_0x00a0:
            int r0 = r11.A01     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            if (r0 != r3) goto L_0x00bb
            java.lang.Object r0 = r11.A02     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.24k r0 = (X.C445224k) r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.3e1 r1 = (X.C68803e1) r1     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
        L_0x00ae:
            X.24k r0 = X.C445224k.A0R     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.1Wo r0 = r13.A09(r14, r0)     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r11.A02 = r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            goto L_0x00bd
        L_0x00bb:
            r1 = r7
            goto L_0x00ae
        L_0x00bd:
            if (r1 == 0) goto L_0x00ca
            X.24k r0 = (X.C445224k) r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r1.A04(r0)     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r11.A02 = r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
        L_0x00ca:
            r11.A01 = r3     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            goto L_0x0033
        L_0x00ce:
            int r0 = r11.A01     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            if (r0 != r2) goto L_0x00e9
            java.lang.Object r0 = r11.A02     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.24l r0 = (X.C445324l) r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.3dr r1 = (X.C68703dr) r1     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
        L_0x00dc:
            X.24l r0 = X.C445324l.A0L     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.1Wo r0 = r13.A09(r14, r0)     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r11.A02 = r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            goto L_0x00eb
        L_0x00e9:
            r1 = r7
            goto L_0x00dc
        L_0x00eb:
            if (r1 == 0) goto L_0x00f8
            X.24l r0 = (X.C445324l) r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r1.A04(r0)     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r11.A02 = r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
        L_0x00f8:
            r11.A01 = r2     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            goto L_0x0033
        L_0x00fc:
            java.lang.String r1 = r13.A0A()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            int r0 = r11.A00     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r0 = r0 | 2
            r11.A00 = r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r11.A03 = r1     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            goto L_0x0033
        L_0x010a:
            java.lang.String r1 = r13.A0A()     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            int r0 = r11.A00     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r0 = r0 | 1
            r11.A00 = r0     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            r11.A04 = r1     // Catch:{ 1bD -> 0x011d, IOException -> 0x011b }
            goto L_0x0033
        L_0x0118:
            X.22R r0 = A06
            return r0
        L_0x011b:
            r0 = move-exception
            goto L_0x0126
        L_0x011d:
            r0 = move-exception
            r0.unfinishedMessage = r11     // Catch:{ all -> 0x0137 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0137 }
            r1.<init>(r0)     // Catch:{ all -> 0x0137 }
            goto L_0x0136
        L_0x0126:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0137 }
            X.1bD r0 = new X.1bD     // Catch:{ all -> 0x0137 }
            r0.<init>(r1)     // Catch:{ all -> 0x0137 }
            r0.unfinishedMessage = r11     // Catch:{ all -> 0x0137 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0137 }
            r1.<init>(r0)     // Catch:{ all -> 0x0137 }
        L_0x0136:
            throw r1     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r0 = move-exception
            throw r0
        L_0x0139:
            X.2L6 r13 = (X.AnonymousClass2L6) r13
            X.22R r14 = (X.AnonymousClass22R) r14
            int r9 = r11.A00
            r10 = 1
            r0 = r9 & 1
            if (r0 == r10) goto L_0x0145
            r10 = 0
        L_0x0145:
            java.lang.String r8 = r11.A04
            int r7 = r14.A00
            r1 = 1
            r0 = r7 & 1
            if (r0 == r1) goto L_0x014f
            r1 = 0
        L_0x014f:
            java.lang.String r0 = r14.A04
            java.lang.String r0 = r13.Ahz(r8, r0, r10, r1)
            r11.A04 = r0
            r1 = 2
            r0 = r9 & 2
            r9 = 0
            if (r0 != r1) goto L_0x015e
            r9 = 1
        L_0x015e:
            java.lang.String r8 = r11.A03
            r7 = r7 & 2
            r0 = 2
            r1 = 0
            if (r7 != r0) goto L_0x0167
            r1 = 1
        L_0x0167:
            java.lang.String r0 = r14.A03
            java.lang.String r0 = r13.Ahz(r8, r0, r9, r1)
            r11.A03 = r0
            int r0 = r11.A00
            r9 = 64
            r0 = r0 & 64
            r8 = 0
            if (r0 != r9) goto L_0x0179
            r8 = 1
        L_0x0179:
            boolean r7 = r11.A05
            int r0 = r14.A00
            r0 = r0 & 64
            r1 = 0
            if (r0 != r9) goto L_0x0183
            r1 = 1
        L_0x0183:
            boolean r0 = r14.A05
            boolean r0 = r13.Ahm(r8, r7, r1, r0)
            r11.A05 = r0
            X.42h r0 = r14.A0c()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x01c4;
                case 1: goto L_0x01bf;
                case 2: goto L_0x01b1;
                case 3: goto L_0x01c9;
                case 4: goto L_0x01a8;
                default: goto L_0x0196;
            }
        L_0x0196:
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r13 != r0) goto L_0x01a7
            int r0 = r14.A01
            if (r0 == 0) goto L_0x01a0
            r11.A01 = r0
        L_0x01a0:
            int r1 = r11.A00
            int r0 = r14.A00
            r1 = r1 | r0
            r11.A00 = r1
        L_0x01a7:
            return r11
        L_0x01a8:
            int r0 = r11.A01
            if (r0 == 0) goto L_0x01ad
            r6 = 1
        L_0x01ad:
            r13.Ahx(r6)
            goto L_0x0196
        L_0x01b1:
            int r0 = r11.A01
            if (r0 != r5) goto L_0x01b6
            r6 = 1
        L_0x01b6:
            java.lang.Object r1 = r11.A02
            java.lang.Object r0 = r14.A02
            java.lang.Object r0 = r13.Ahv(r1, r0, r6)
            goto L_0x01d6
        L_0x01bf:
            int r0 = r11.A01
            if (r0 != r3) goto L_0x01ce
            goto L_0x01cd
        L_0x01c4:
            int r0 = r11.A01
            if (r0 != r2) goto L_0x01ce
            goto L_0x01cd
        L_0x01c9:
            int r0 = r11.A01
            if (r0 != r4) goto L_0x01ce
        L_0x01cd:
            r6 = 1
        L_0x01ce:
            java.lang.Object r1 = r11.A02
            java.lang.Object r0 = r14.A02
            java.lang.Object r0 = r13.Ahw(r1, r0, r6)
        L_0x01d6:
            r11.A02 = r0
            goto L_0x0196
        L_0x01d9:
            X.3fC r0 = new X.3fC
            r0.<init>()
            return r0
        L_0x01df:
            return r7
        L_0x01e0:
            X.22R r0 = A06
            return r0
        L_0x01e3:
            X.22R r0 = new X.22R
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass22R.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public C800342h A0c() {
        int i2 = this.A01;
        if (i2 == 0) {
            return C800342h.A04;
        }
        if (i2 == 3) {
            return C800342h.A01;
        }
        if (i2 == 4) {
            return C800342h.A02;
        }
        if (i2 == 6) {
            return C800342h.A03;
        }
        if (i2 != 7) {
            return null;
        }
        return C800342h.A05;
    }

    public int AFw() {
        int A052;
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A04);
        }
        if ((this.A00 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A03);
        }
        if (this.A01 == 3) {
            i3 += CodedOutputStream.A05((C28551Wn) this.A02, 3);
        }
        if (this.A01 == 4) {
            i3 += CodedOutputStream.A05((C28551Wn) this.A02, 4);
        }
        if ((this.A00 & 64) == 64) {
            i3 += 2;
        }
        int i4 = this.A01;
        if (i4 == 6) {
            A052 = CodedOutputStream.A04((C28631Ww) this.A02, 6);
        } else {
            if (i4 == 7) {
                A052 = CodedOutputStream.A05((C28551Wn) this.A02, 7);
            }
            int A002 = i3 + this.unknownFields.A00();
            this.A00 = A002;
            return A002;
        }
        i3 += A052;
        int A0022 = i3 + this.unknownFields.A00();
        this.A00 = A0022;
        return A0022;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A03);
        }
        if (this.A01 == 3) {
            codedOutputStream.A0G((C28551Wn) this.A02, 3);
        }
        if (this.A01 == 4) {
            codedOutputStream.A0G((C28551Wn) this.A02, 4);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0E(5, this.A05);
        }
        if (this.A01 == 6) {
            codedOutputStream.A0F((C28631Ww) this.A02, 6);
        }
        if (this.A01 == 7) {
            codedOutputStream.A0G((C28551Wn) this.A02, 7);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
