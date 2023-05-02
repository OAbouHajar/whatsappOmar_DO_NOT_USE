package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2uM  reason: invalid class name and case insensitive filesystem */
public final class C58912uM extends C28541Wm implements C28561Wp {
    public static final C58912uM A0A;
    public static volatile C47872Kz A0B;
    public byte A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public C58742tz A06;
    public String A07 = "";
    public String A08 = "";
    public String A09 = "";

    static {
        C58912uM r0 = new C58912uM();
        A0A = r0;
        r0.A0W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010b, code lost:
        return A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0110, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r14 = this;
            r1 = r17
            r7 = r16
            int r0 = r15.ordinal()
            r6 = 0
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x0120;
                case 2: goto L_0x002e;
                case 3: goto L_0x0110;
                case 4: goto L_0x01ea;
                case 5: goto L_0x01e4;
                case 6: goto L_0x0109;
                case 7: goto L_0x0013;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0013:
            X.2Kz r0 = A0B
            if (r0 != 0) goto L_0x002b
            java.lang.Class<X.2uM> r1 = X.C58912uM.class
            monitor-enter(r1)
            X.2Kz r0 = A0B     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            X.2uM r0 = A0A     // Catch:{ all -> 0x0028 }
            X.2Kz r0 = X.C28541Wm.A09(r0)     // Catch:{ all -> 0x0028 }
            A0B = r0     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            X.2Kz r0 = A0B
            return r0
        L_0x002e:
            X.2Kx r7 = (X.C47852Kx) r7
            X.2Ky r1 = (X.C47862Ky) r1
        L_0x0032:
            int r3 = r7.A03()     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            if (r3 == 0) goto L_0x0109
            r0 = 8
            if (r3 == r0) goto L_0x00dc
            r0 = 18
            if (r3 == r0) goto L_0x00ae
            r0 = 24
            if (r3 == r0) goto L_0x00a1
            r0 = 32
            if (r3 == r0) goto L_0x0094
            r0 = 42
            if (r3 == r0) goto L_0x0087
            r0 = 50
            if (r3 == r0) goto L_0x007a
            r2 = 58
            r0 = 64
            if (r3 == r2) goto L_0x006d
            if (r3 == r0) goto L_0x0060
            boolean r0 = r14.A0a(r7, r3)     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            if (r0 != 0) goto L_0x0032
            goto L_0x0109
        L_0x0060:
            int r0 = r14.A03     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r14.A03 = r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            int r0 = r7.A02()     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r14.A04 = r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            goto L_0x0032
        L_0x006d:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            int r0 = r14.A03     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r0 = r0 | 64
            r14.A03 = r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r14.A08 = r2     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            goto L_0x0032
        L_0x007a:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            int r0 = r14.A03     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r0 = r0 | 32
            r14.A03 = r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r14.A09 = r2     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            goto L_0x0032
        L_0x0087:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            int r0 = r14.A03     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r0 = r0 | 16
            r14.A03 = r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r14.A07 = r2     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            goto L_0x0032
        L_0x0094:
            int r0 = r14.A03     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r0 = r0 | 8
            r14.A03 = r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            int r0 = r7.A02()     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r14.A02 = r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            goto L_0x0032
        L_0x00a1:
            int r0 = r14.A03     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r0 = r0 | 4
            r14.A03 = r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            long r2 = r7.A06()     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r14.A05 = r2     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            goto L_0x0032
        L_0x00ae:
            int r0 = r14.A03     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r2 = 2
            r0 = r0 & 2
            if (r0 != r2) goto L_0x00c8
            X.2tz r0 = r14.A06     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            X.1Wr r2 = r0.A0U()     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            X.3fN r2 = (X.C69643fN) r2     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
        L_0x00bd:
            X.2tz r0 = X.C58742tz.A04     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            X.1Wo r0 = X.C28541Wm.A0H(r7, r1, r0)     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            X.2tz r0 = (X.C58742tz) r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r14.A06 = r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            goto L_0x00ca
        L_0x00c8:
            r2 = r5
            goto L_0x00bd
        L_0x00ca:
            if (r2 == 0) goto L_0x00d4
            X.1Wm r0 = X.C28541Wm.A0C(r2, r0)     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            X.2tz r0 = (X.C58742tz) r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r14.A06 = r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
        L_0x00d4:
            int r0 = r14.A03     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r0 = r0 | 2
            r14.A03 = r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            goto L_0x0032
        L_0x00dc:
            int r0 = r14.A03     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r0 = r0 | 1
            r14.A03 = r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            int r0 = r7.A02()     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            r14.A01 = r0     // Catch:{ 1bD -> 0x0113, IOException -> 0x0111 }
            goto L_0x0032
        L_0x00ea:
            byte r0 = r14.A00
            if (r0 == r4) goto L_0x0109
            if (r0 == 0) goto L_0x0110
            boolean r3 = X.AnonymousClass000.A1X(r7)
            int r2 = r14.A03
            r0 = r2 & 1
            if (r0 != r4) goto L_0x010c
            r1 = 8
            r0 = r2 & 8
            if (r0 != r1) goto L_0x010c
            r0 = 128(0x80, float:1.794E-43)
            r2 = r2 & r0
            if (r2 != r0) goto L_0x010c
            if (r3 == 0) goto L_0x0109
            r14.A00 = r4
        L_0x0109:
            X.2uM r0 = A0A
            return r0
        L_0x010c:
            if (r3 == 0) goto L_0x0110
            r14.A00 = r6
        L_0x0110:
            return r5
        L_0x0111:
            r0 = move-exception
            goto L_0x0119
        L_0x0113:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C28541Wm.A0J(r0, r14)     // Catch:{ all -> 0x011e }
            goto L_0x011d
        L_0x0119:
            java.lang.RuntimeException r0 = X.C28541Wm.A0K(r14, r0)     // Catch:{ all -> 0x011e }
        L_0x011d:
            throw r0     // Catch:{ all -> 0x011e }
        L_0x011e:
            r0 = move-exception
            throw r0
        L_0x0120:
            X.2L6 r7 = (X.AnonymousClass2L6) r7
            X.2uM r1 = (X.C58912uM) r1
            int r0 = r14.A03
            r5 = 1
            r0 = r0 & 1
            if (r0 == r4) goto L_0x012c
            r5 = 0
        L_0x012c:
            int r3 = r14.A01
            int r0 = r1.A03
            r2 = 1
            r0 = r0 & 1
            if (r0 == r4) goto L_0x0136
            r2 = 0
        L_0x0136:
            int r0 = r1.A01
            int r0 = r7.Ahq(r3, r0, r5, r2)
            r14.A01 = r0
            X.2tz r2 = r14.A06
            X.2tz r0 = r1.A06
            X.1Wo r0 = r7.Ahu(r2, r0)
            X.2tz r0 = (X.C58742tz) r0
            r14.A06 = r0
            int r6 = r14.A03
            r2 = 4
            r0 = r6 & 4
            boolean r12 = X.AnonymousClass000.A1R(r0, r2)
            long r8 = r14.A05
            int r5 = r1.A03
            r0 = r5 & 4
            boolean r13 = X.AnonymousClass000.A1R(r0, r2)
            long r10 = r1.A05
            long r2 = r7.Aht(r8, r10, r12, r13)
            r14.A05 = r2
            r2 = 8
            r0 = r6 & 8
            if (r0 == r2) goto L_0x016c
            r4 = 0
        L_0x016c:
            int r3 = r14.A02
            r0 = r5 & 8
            boolean r2 = X.AnonymousClass000.A1R(r0, r2)
            int r0 = r1.A02
            int r0 = r7.Ahq(r3, r0, r4, r2)
            r14.A02 = r0
            r2 = 16
            r0 = r6 & 16
            boolean r4 = X.AnonymousClass000.A1R(r0, r2)
            java.lang.String r3 = r14.A07
            r0 = r5 & 16
            boolean r2 = X.AnonymousClass000.A1R(r0, r2)
            java.lang.String r0 = r1.A07
            java.lang.String r0 = r7.Ahz(r3, r0, r4, r2)
            r14.A07 = r0
            r2 = 32
            r0 = r6 & 32
            boolean r4 = X.AnonymousClass000.A1R(r0, r2)
            java.lang.String r3 = r14.A09
            r0 = r5 & 32
            boolean r2 = X.AnonymousClass000.A1R(r0, r2)
            java.lang.String r0 = r1.A09
            java.lang.String r0 = r7.Ahz(r3, r0, r4, r2)
            r14.A09 = r0
            r2 = 64
            r0 = r6 & 64
            boolean r4 = X.AnonymousClass000.A1R(r0, r2)
            java.lang.String r3 = r14.A08
            r0 = r5 & 64
            boolean r2 = X.AnonymousClass000.A1R(r0, r2)
            java.lang.String r0 = r1.A08
            java.lang.String r0 = r7.Ahz(r3, r0, r4, r2)
            r14.A08 = r0
            r2 = 128(0x80, float:1.794E-43)
            r0 = r6 & r2
            boolean r4 = X.AnonymousClass000.A1R(r0, r2)
            int r3 = r14.A04
            r0 = r5 & r2
            boolean r2 = X.AnonymousClass000.A1R(r0, r2)
            int r0 = r1.A04
            int r0 = r7.Ahq(r3, r0, r4, r2)
            r14.A04 = r0
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r7 != r0) goto L_0x01e3
            r6 = r6 | r5
            r14.A03 = r6
        L_0x01e3:
            return r14
        L_0x01e4:
            X.3ez r0 = new X.3ez
            r0.<init>()
            return r0
        L_0x01ea:
            X.2uM r0 = new X.2uM
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58912uM.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A03;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A01(1, this.A01);
        }
        if ((i4 & 2) == 2) {
            C58742tz r0 = this.A06;
            if (r0 == null) {
                r0 = C58742tz.A04;
            }
            i3 = C28541Wm.A06(r0, 2, i3);
        }
        int i5 = this.A03;
        if ((i5 & 4) == 4) {
            i3 = C28541Wm.A02(i3, this.A05);
        }
        if ((i5 & 8) == 8) {
            i3 += CodedOutputStream.A01(4, this.A02);
        }
        if ((i5 & 16) == 16) {
            i3 = C28541Wm.A07(this.A07, i3);
        }
        if ((this.A03 & 32) == 32) {
            i3 = C28541Wm.A07(this.A09, i3);
        }
        if ((this.A03 & 64) == 64) {
            i3 = C28541Wm.A07(this.A08, i3);
        }
        if ((this.A03 & 128) == 128) {
            i3 += CodedOutputStream.A01(8, this.A04);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A03 & 1) == 1) {
            codedOutputStream.A09(1, this.A01);
        }
        if ((this.A03 & 2) == 2) {
            C58742tz r0 = this.A06;
            if (r0 == null) {
                r0 = C58742tz.A04;
            }
            codedOutputStream.A0G(r0, 2);
        }
        if ((this.A03 & 4) == 4) {
            codedOutputStream.A0C(3, this.A05);
        }
        if ((this.A03 & 8) == 8) {
            codedOutputStream.A09(4, this.A02);
        }
        if ((this.A03 & 16) == 16) {
            codedOutputStream.A0D(5, this.A07);
        }
        if ((this.A03 & 32) == 32) {
            codedOutputStream.A0D(6, this.A09);
        }
        if ((this.A03 & 64) == 64) {
            codedOutputStream.A0D(7, this.A08);
        }
        if ((this.A03 & 128) == 128) {
            codedOutputStream.A09(8, this.A04);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
