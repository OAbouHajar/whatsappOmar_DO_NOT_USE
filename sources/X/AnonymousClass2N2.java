package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2N2  reason: invalid class name */
public final class AnonymousClass2N2 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2N2 A08;
    public static volatile C47872Kz A09;
    public byte A00 = -1;
    public int A01;
    public long A02;
    public C58942uP A03;
    public C58912uM A04;
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";

    static {
        AnonymousClass2N2 r0 = new AnonymousClass2N2();
        A08 = r0;
        r0.A0W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0137, code lost:
        if (r0.A0Z() == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0139, code lost:
        if (r4 == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x013b, code lost:
        r15.A00 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0150, code lost:
        if (r0.A0Z() == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0159, code lost:
        return A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r4 = r18
            r8 = r17
            int r0 = r16.ordinal()
            r2 = 0
            r3 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L_0x0119;
                case 1: goto L_0x015a;
                case 2: goto L_0x0030;
                case 3: goto L_0x013d;
                case 4: goto L_0x01eb;
                case 5: goto L_0x01e5;
                case 6: goto L_0x0157;
                case 7: goto L_0x0014;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0014:
            X.2Kz r0 = A09
            if (r0 != 0) goto L_0x002d
            java.lang.Class<X.2N2> r2 = X.AnonymousClass2N2.class
            monitor-enter(r2)
            X.2Kz r0 = A09     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0028
            X.2N2 r1 = A08     // Catch:{ all -> 0x002a }
            X.2Kz r0 = new X.2Kz     // Catch:{ all -> 0x002a }
            r0.<init>(r1)     // Catch:{ all -> 0x002a }
            A09 = r0     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            goto L_0x002d
        L_0x002a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002d:
            X.2Kz r0 = A09
            return r0
        L_0x0030:
            X.2Kx r8 = (X.C47852Kx) r8
            X.2Ky r4 = (X.C47862Ky) r4
        L_0x0034:
            int r1 = r8.A03()     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            if (r1 == 0) goto L_0x0157
            r2 = 8
            if (r1 == r2) goto L_0x00ed
            r0 = 18
            if (r1 == r0) goto L_0x00df
            r0 = 26
            if (r1 == r0) goto L_0x00d1
            r0 = 34
            if (r1 == r0) goto L_0x00c4
            r0 = 42
            if (r1 == r0) goto L_0x007e
            r0 = 50
            if (r1 == r0) goto L_0x005a
            boolean r0 = r15.A0a(r8, r1)     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            if (r0 != 0) goto L_0x0034
            goto L_0x0157
        L_0x005a:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r1 = 32
            r0 = r0 & 32
            if (r0 != r1) goto L_0x0079
            X.2uM r0 = r15.A04     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.3ez r1 = (X.C69403ez) r1     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
        L_0x006a:
            X.2uM r0 = X.C58912uM.A0A     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.1Wo r0 = r8.A09(r4, r0)     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.2uM r0 = (X.C58912uM) r0     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r15.A04 = r0     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            goto L_0x007b
        L_0x0079:
            r1 = r5
            goto L_0x006a
        L_0x007b:
            if (r1 == 0) goto L_0x00bc
            goto L_0x00b1
        L_0x007e:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r1 = 16
            r0 = r0 & 16
            if (r0 != r1) goto L_0x009d
            X.2uP r0 = r15.A03     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.3ey r1 = (X.C69393ey) r1     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
        L_0x008e:
            X.2uP r0 = X.C58942uP.A0B     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.1Wo r0 = r8.A09(r4, r0)     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.2uP r0 = (X.C58942uP) r0     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r15.A03 = r0     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            goto L_0x009f
        L_0x009d:
            r1 = r5
            goto L_0x008e
        L_0x009f:
            if (r1 == 0) goto L_0x00ac
            r1.A04(r0)     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.2uP r0 = (X.C58942uP) r0     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r15.A03 = r0     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
        L_0x00ac:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r0 = r0 | 16
            goto L_0x00c0
        L_0x00b1:
            r1.A04(r0)     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            X.2uM r0 = (X.C58912uM) r0     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r15.A04 = r0     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
        L_0x00bc:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r0 = r0 | 32
        L_0x00c0:
            r15.A01 = r0     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            goto L_0x0034
        L_0x00c4:
            java.lang.String r1 = r8.A0A()     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            int r0 = r15.A01     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r2 = r2 | r0
            r15.A01 = r2     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r15.A05 = r1     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            goto L_0x0034
        L_0x00d1:
            java.lang.String r1 = r8.A0A()     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            int r0 = r15.A01     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r0 = r0 | 4
            r15.A01 = r0     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r15.A07 = r1     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            goto L_0x0034
        L_0x00df:
            java.lang.String r1 = r8.A0A()     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            int r0 = r15.A01     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r0 = r0 | 2
            r15.A01 = r0     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r15.A06 = r1     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            goto L_0x0034
        L_0x00ed:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r0 = r0 | 1
            r15.A01 = r0     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            long r0 = r8.A06()     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            r15.A02 = r0     // Catch:{ 1bD -> 0x00fd, IOException -> 0x00fb }
            goto L_0x0034
        L_0x00fb:
            r0 = move-exception
            goto L_0x0106
        L_0x00fd:
            r0 = move-exception
            r0.unfinishedMessage = r15     // Catch:{ all -> 0x0117 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0117 }
            r1.<init>(r0)     // Catch:{ all -> 0x0117 }
            goto L_0x0116
        L_0x0106:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0117 }
            X.1bD r0 = new X.1bD     // Catch:{ all -> 0x0117 }
            r0.<init>(r1)     // Catch:{ all -> 0x0117 }
            r0.unfinishedMessage = r15     // Catch:{ all -> 0x0117 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0117 }
            r1.<init>(r0)     // Catch:{ all -> 0x0117 }
        L_0x0116:
            throw r1     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            throw r0
        L_0x0119:
            byte r0 = r15.A00
            if (r0 == r3) goto L_0x0157
            if (r0 == 0) goto L_0x013d
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r4 = r8.booleanValue()
            int r0 = r15.A01
            r1 = 16
            r0 = r0 & 16
            if (r0 != r1) goto L_0x013e
            X.2uP r0 = r15.A03
            if (r0 != 0) goto L_0x0133
            X.2uP r0 = X.C58942uP.A0B
        L_0x0133:
            boolean r0 = r0.A0Z()
            if (r0 != 0) goto L_0x013e
        L_0x0139:
            if (r4 == 0) goto L_0x013d
            r15.A00 = r2
        L_0x013d:
            return r5
        L_0x013e:
            int r0 = r15.A01
            r1 = 32
            r0 = r0 & 32
            if (r0 != r1) goto L_0x0153
            X.2uM r0 = r15.A04
            if (r0 != 0) goto L_0x014c
            X.2uM r0 = X.C58912uM.A0A
        L_0x014c:
            boolean r0 = r0.A0Z()
            if (r0 != 0) goto L_0x0153
            goto L_0x0139
        L_0x0153:
            if (r4 == 0) goto L_0x0157
            r15.A00 = r3
        L_0x0157:
            X.2N2 r0 = A08
            return r0
        L_0x015a:
            X.2L6 r8 = (X.AnonymousClass2L6) r8
            X.2N2 r4 = (X.AnonymousClass2N2) r4
            int r5 = r15.A01
            r13 = 1
            r0 = r5 & 1
            if (r0 == r3) goto L_0x0166
            r13 = 0
        L_0x0166:
            long r9 = r15.A02
            int r6 = r4.A01
            r14 = 1
            r0 = r6 & 1
            if (r0 == r3) goto L_0x0170
            r14 = 0
        L_0x0170:
            long r11 = r4.A02
            long r0 = r8.Aht(r9, r11, r13, r14)
            r15.A02 = r0
            r1 = 2
            r0 = r5 & 2
            if (r0 != r1) goto L_0x017e
            r2 = 1
        L_0x017e:
            java.lang.String r7 = r15.A06
            r3 = r6 & 2
            r0 = 2
            r1 = 0
            if (r3 != r0) goto L_0x0187
            r1 = 1
        L_0x0187:
            java.lang.String r0 = r4.A06
            java.lang.String r0 = r8.Ahz(r7, r0, r2, r1)
            r15.A06 = r0
            r1 = 4
            r0 = r5 & 4
            r7 = 0
            if (r0 != r1) goto L_0x0196
            r7 = 1
        L_0x0196:
            java.lang.String r3 = r15.A07
            r2 = r6 & 4
            r0 = 4
            r1 = 0
            if (r2 != r0) goto L_0x019f
            r1 = 1
        L_0x019f:
            java.lang.String r0 = r4.A07
            java.lang.String r0 = r8.Ahz(r3, r0, r7, r1)
            r15.A07 = r0
            r1 = 8
            r0 = r5 & 8
            r5 = 0
            if (r0 != r1) goto L_0x01af
            r5 = 1
        L_0x01af:
            java.lang.String r3 = r15.A05
            r2 = r6 & 8
            r0 = 8
            r1 = 0
            if (r2 != r0) goto L_0x01b9
            r1 = 1
        L_0x01b9:
            java.lang.String r0 = r4.A05
            java.lang.String r0 = r8.Ahz(r3, r0, r5, r1)
            r15.A05 = r0
            X.2uP r1 = r15.A03
            X.2uP r0 = r4.A03
            X.1Wo r0 = r8.Ahu(r1, r0)
            X.2uP r0 = (X.C58942uP) r0
            r15.A03 = r0
            X.2uM r1 = r15.A04
            X.2uM r0 = r4.A04
            X.1Wo r0 = r8.Ahu(r1, r0)
            X.2uM r0 = (X.C58912uM) r0
            r15.A04 = r0
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r8 != r0) goto L_0x01e4
            int r1 = r15.A01
            int r0 = r4.A01
            r1 = r1 | r0
            r15.A01 = r1
        L_0x01e4:
            return r15
        L_0x01e5:
            X.2N3 r0 = new X.2N3
            r0.<init>()
            return r0
        L_0x01eb:
            X.2N2 r0 = new X.2N2
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2N2.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A01;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A03(this.A02) + 1;
        }
        if ((i4 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A06);
        }
        if ((this.A01 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A06(this.A07);
        }
        if ((this.A01 & 8) == 8) {
            i3 += 1 + CodedOutputStream.A06(this.A05);
        }
        if ((this.A01 & 16) == 16) {
            C58942uP r0 = this.A03;
            if (r0 == null) {
                r0 = C58942uP.A0B;
            }
            i3 += CodedOutputStream.A05(r0, 5);
        }
        if ((this.A01 & 32) == 32) {
            C58912uM r02 = this.A04;
            if (r02 == null) {
                r02 = C58912uM.A0A;
            }
            i3 += CodedOutputStream.A05(r02, 6);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A0C(1, this.A02);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0D(2, this.A06);
        }
        if ((this.A01 & 4) == 4) {
            codedOutputStream.A0D(3, this.A07);
        }
        if ((this.A01 & 8) == 8) {
            codedOutputStream.A0D(4, this.A05);
        }
        if ((this.A01 & 16) == 16) {
            C58942uP r0 = this.A03;
            if (r0 == null) {
                r0 = C58942uP.A0B;
            }
            codedOutputStream.A0G(r0, 5);
        }
        if ((this.A01 & 32) == 32) {
            C58912uM r02 = this.A04;
            if (r02 == null) {
                r02 = C58912uM.A0A;
            }
            codedOutputStream.A0G(r02, 6);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
