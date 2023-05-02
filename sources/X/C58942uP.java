package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2uP  reason: invalid class name and case insensitive filesystem */
public final class C58942uP extends C28541Wm implements C28561Wp {
    public static final C58942uP A0B;
    public static volatile C47872Kz A0C;
    public byte A00 = -1;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C58742tz A05;
    public String A06 = "";
    public String A07 = "";
    public String A08 = "";
    public String A09 = "";
    public boolean A0A;

    static {
        C58942uP r0 = new C58942uP();
        A0B = r0;
        r0.A0W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0128, code lost:
        return A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x012d, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r14 = this;
            r1 = r17
            r7 = r16
            int r0 = r15.ordinal()
            r3 = 1
            r5 = 0
            r6 = 0
            switch(r0) {
                case 0: goto L_0x00fd;
                case 1: goto L_0x013d;
                case 2: goto L_0x002e;
                case 3: goto L_0x012d;
                case 4: goto L_0x021d;
                case 5: goto L_0x0217;
                case 6: goto L_0x0126;
                case 7: goto L_0x0013;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0013:
            X.2Kz r0 = A0C
            if (r0 != 0) goto L_0x002b
            java.lang.Class<X.2uP> r1 = X.C58942uP.class
            monitor-enter(r1)
            X.2Kz r0 = A0C     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            X.2uP r0 = A0B     // Catch:{ all -> 0x0028 }
            X.2Kz r0 = X.C28541Wm.A09(r0)     // Catch:{ all -> 0x0028 }
            A0C = r0     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            X.2Kz r0 = A0C
            return r0
        L_0x002e:
            X.2Kx r7 = (X.C47852Kx) r7
            X.2Ky r1 = (X.C47862Ky) r1
        L_0x0032:
            int r2 = r7.A03()     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            if (r2 == 0) goto L_0x0126
            r3 = 8
            if (r2 == r3) goto L_0x00ef
            r0 = 16
            if (r2 == r0) goto L_0x00e1
            r0 = 24
            if (r2 == r0) goto L_0x00d3
            r0 = 34
            if (r2 == r0) goto L_0x00c6
            r0 = 42
            if (r2 == r0) goto L_0x00b8
            r0 = 48
            if (r2 == r0) goto L_0x00aa
            r0 = 58
            if (r2 == r0) goto L_0x009d
            r0 = 66
            if (r2 == r0) goto L_0x0090
            r0 = 74
            if (r2 == r0) goto L_0x0064
            boolean r0 = r14.A0a(r7, r2)     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            if (r0 != 0) goto L_0x0032
            goto L_0x0126
        L_0x0064:
            int r0 = r14.A02     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r3 = 256(0x100, float:3.59E-43)
            r0 = r0 & r3
            if (r0 != r3) goto L_0x007e
            X.2tz r0 = r14.A05     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            X.1Wr r2 = r0.A0U()     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            X.3fN r2 = (X.C69643fN) r2     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
        L_0x0073:
            X.2tz r0 = X.C58742tz.A04     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            X.1Wo r0 = X.C28541Wm.A0H(r7, r1, r0)     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            X.2tz r0 = (X.C58742tz) r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r14.A05 = r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            goto L_0x0080
        L_0x007e:
            r2 = r6
            goto L_0x0073
        L_0x0080:
            if (r2 == 0) goto L_0x008a
            X.1Wm r0 = X.C28541Wm.A0C(r2, r0)     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            X.2tz r0 = (X.C58742tz) r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r14.A05 = r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
        L_0x008a:
            int r0 = r14.A02     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r0 = r0 | r3
            r14.A02 = r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            goto L_0x0032
        L_0x0090:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            int r0 = r14.A02     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r14.A02 = r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r14.A09 = r2     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            goto L_0x0032
        L_0x009d:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            int r0 = r14.A02     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r0 = r0 | 64
            r14.A02 = r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r14.A08 = r2     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            goto L_0x0032
        L_0x00aa:
            int r0 = r14.A02     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r0 = r0 | 32
            r14.A02 = r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            boolean r0 = r7.A0F()     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r14.A0A = r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            goto L_0x0032
        L_0x00b8:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            int r0 = r14.A02     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r0 = r0 | 16
            r14.A02 = r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r14.A07 = r2     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            goto L_0x0032
        L_0x00c6:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            int r0 = r14.A02     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r3 = r3 | r0
            r14.A02 = r3     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r14.A06 = r2     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            goto L_0x0032
        L_0x00d3:
            int r0 = r14.A02     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r0 = r0 | 4
            r14.A02 = r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            int r0 = r7.A02()     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r14.A01 = r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            goto L_0x0032
        L_0x00e1:
            int r0 = r14.A02     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r0 = r0 | 2
            r14.A02 = r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            long r2 = r7.A06()     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r14.A04 = r2     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            goto L_0x0032
        L_0x00ef:
            int r0 = r14.A02     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r0 = r0 | 1
            r14.A02 = r0     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            long r2 = r7.A06()     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            r14.A03 = r2     // Catch:{ 1bD -> 0x0130, IOException -> 0x012e }
            goto L_0x0032
        L_0x00fd:
            byte r0 = r14.A00
            if (r0 == r3) goto L_0x0126
            if (r0 == 0) goto L_0x012d
            boolean r4 = X.AnonymousClass000.A1X(r7)
            int r2 = r14.A02
            r0 = r2 & 1
            if (r0 != r3) goto L_0x0129
            r1 = 2
            r0 = r2 & 2
            if (r0 != r1) goto L_0x0129
            r1 = 4
            r0 = r2 & 4
            if (r0 != r1) goto L_0x0129
            r1 = 32
            r0 = r2 & 32
            if (r0 != r1) goto L_0x0129
            r0 = 256(0x100, float:3.59E-43)
            r2 = r2 & r0
            if (r2 != r0) goto L_0x0129
            if (r4 == 0) goto L_0x0126
            r14.A00 = r3
        L_0x0126:
            X.2uP r0 = A0B
            return r0
        L_0x0129:
            if (r4 == 0) goto L_0x012d
            r14.A00 = r5
        L_0x012d:
            return r6
        L_0x012e:
            r0 = move-exception
            goto L_0x0136
        L_0x0130:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C28541Wm.A0J(r0, r14)     // Catch:{ all -> 0x013b }
            goto L_0x013a
        L_0x0136:
            java.lang.RuntimeException r0 = X.C28541Wm.A0K(r14, r0)     // Catch:{ all -> 0x013b }
        L_0x013a:
            throw r0     // Catch:{ all -> 0x013b }
        L_0x013b:
            r0 = move-exception
            throw r0
        L_0x013d:
            X.2L6 r7 = (X.AnonymousClass2L6) r7
            X.2uP r1 = (X.C58942uP) r1
            int r2 = r14.A02
            r12 = 1
            r0 = r2 & 1
            if (r0 == r3) goto L_0x0149
            r12 = 0
        L_0x0149:
            long r8 = r14.A03
            int r0 = r1.A02
            r13 = 1
            r4 = r0 & 1
            if (r4 == r3) goto L_0x0153
            r13 = 0
        L_0x0153:
            long r10 = r1.A03
            long r3 = r7.Aht(r8, r10, r12, r13)
            r14.A03 = r3
            r4 = 2
            r3 = r2 & 2
            boolean r12 = X.AnonymousClass000.A1R(r3, r4)
            long r8 = r14.A04
            r3 = r0 & 2
            boolean r13 = X.AnonymousClass000.A1R(r3, r4)
            long r10 = r1.A04
            long r3 = r7.Aht(r8, r10, r12, r13)
            r14.A04 = r3
            r4 = 4
            r3 = r2 & 4
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            int r5 = r14.A01
            r3 = r0 & 4
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            int r3 = r1.A01
            int r3 = r7.Ahq(r5, r3, r6, r4)
            r14.A01 = r3
            r4 = 8
            r3 = r2 & 8
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A06
            r3 = r0 & 8
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r1.A06
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A06 = r3
            r4 = 16
            r3 = r2 & 16
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A07
            r3 = r0 & 16
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r1.A07
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A07 = r3
            r4 = 32
            r3 = r2 & 32
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            boolean r5 = r14.A0A
            r3 = r0 & 32
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            boolean r3 = r1.A0A
            boolean r3 = r7.Ahm(r6, r5, r4, r3)
            r14.A0A = r3
            r4 = 64
            r3 = r2 & 64
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A08
            r3 = r0 & 64
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r1.A08
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A08 = r3
            r5 = 128(0x80, float:1.794E-43)
            r2 = r2 & r5
            boolean r4 = X.AnonymousClass000.A1R(r2, r5)
            java.lang.String r3 = r14.A09
            r0 = r0 & r5
            boolean r2 = X.AnonymousClass000.A1R(r0, r5)
            java.lang.String r0 = r1.A09
            java.lang.String r0 = r7.Ahz(r3, r0, r4, r2)
            r14.A09 = r0
            X.2tz r2 = r14.A05
            X.2tz r0 = r1.A05
            X.1Wo r0 = r7.Ahu(r2, r0)
            X.2tz r0 = (X.C58742tz) r0
            r14.A05 = r0
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r7 != r0) goto L_0x0216
            int r2 = r14.A02
            int r0 = r1.A02
            r2 = r2 | r0
            r14.A02 = r2
        L_0x0216:
            return r14
        L_0x0217:
            X.3ey r0 = new X.3ey
            r0.<init>()
            return r0
        L_0x021d:
            X.2uP r0 = new X.2uP
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58942uP.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A02;
        if ((i4 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A03(this.A03);
        }
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A02(i3, this.A04);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A01(3, this.A01);
        }
        if ((i4 & 8) == 8) {
            i3 = C28541Wm.A07(this.A06, i3);
        }
        if ((this.A02 & 16) == 16) {
            i3 = C28541Wm.A07(this.A07, i3);
        }
        int i5 = this.A02;
        if ((i5 & 32) == 32) {
            i3 += 2;
        }
        if ((i5 & 64) == 64) {
            i3 = C28541Wm.A07(this.A08, i3);
        }
        if ((this.A02 & 128) == 128) {
            i3 = C28541Wm.A07(this.A09, i3);
        }
        if ((this.A02 & 256) == 256) {
            C58742tz r0 = this.A05;
            if (r0 == null) {
                r0 = C58742tz.A04;
            }
            i3 = C28541Wm.A06(r0, 9, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A02 & 1) == 1) {
            codedOutputStream.A0C(1, this.A03);
        }
        if ((this.A02 & 2) == 2) {
            codedOutputStream.A0C(2, this.A04);
        }
        if ((this.A02 & 4) == 4) {
            codedOutputStream.A09(3, this.A01);
        }
        if ((this.A02 & 8) == 8) {
            codedOutputStream.A0D(4, this.A06);
        }
        if ((this.A02 & 16) == 16) {
            codedOutputStream.A0D(5, this.A07);
        }
        if ((this.A02 & 32) == 32) {
            codedOutputStream.A0E(6, this.A0A);
        }
        if ((this.A02 & 64) == 64) {
            codedOutputStream.A0D(7, this.A08);
        }
        if ((this.A02 & 128) == 128) {
            codedOutputStream.A0D(8, this.A09);
        }
        if ((this.A02 & 256) == 256) {
            C58742tz r0 = this.A05;
            if (r0 == null) {
                r0 = C58742tz.A04;
            }
            codedOutputStream.A0G(r0, 9);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
