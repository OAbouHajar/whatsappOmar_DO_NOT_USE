package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2uU  reason: invalid class name and case insensitive filesystem */
public final class C58992uU extends C28541Wm implements C28561Wp {
    public static final C58992uU A0D;
    public static volatile C47872Kz A0E;
    public int A00;
    public int A01;
    public int A02 = 1;
    public int A03 = 1;
    public long A04;
    public C28631Ww A05 = C28631Ww.A01;
    public AnonymousClass21S A06;
    public String A07 = "";
    public String A08 = "";
    public String A09 = "";
    public String A0A = "";
    public String A0B = "";
    public String A0C = "";

    static {
        C58992uU r0 = new C58992uU();
        A0D = r0;
        r0.A0W();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        super.A0X(r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r14 = this;
            r2 = r17
            r7 = r16
            int r0 = r15.ordinal()
            r4 = 0
            switch(r0) {
                case 0: goto L_0x0247;
                case 1: goto L_0x011e;
                case 2: goto L_0x002c;
                case 3: goto L_0x0246;
                case 4: goto L_0x024a;
                case 5: goto L_0x0240;
                case 6: goto L_0x010c;
                case 7: goto L_0x0011;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0011:
            X.2Kz r0 = A0E
            if (r0 != 0) goto L_0x0029
            java.lang.Class<X.2uU> r1 = X.C58992uU.class
            monitor-enter(r1)
            X.2Kz r0 = A0E     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0024
            X.2uU r0 = A0D     // Catch:{ all -> 0x0026 }
            X.2Kz r0 = X.C28541Wm.A09(r0)     // Catch:{ all -> 0x0026 }
            A0E = r0     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            goto L_0x0029
        L_0x0026:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r0
        L_0x0029:
            X.2Kz r0 = A0E
            return r0
        L_0x002c:
            X.2Kx r7 = (X.C47852Kx) r7
            X.2Ky r2 = (X.C47862Ky) r2
        L_0x0030:
            int r0 = r7.A03()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r3 = 4
            switch(r0) {
                case 0: goto L_0x010c;
                case 10: goto L_0x0066;
                case 18: goto L_0x0073;
                case 24: goto L_0x0080;
                case 32: goto L_0x0052;
                case 40: goto L_0x0040;
                case 50: goto L_0x008d;
                case 58: goto L_0x009a;
                case 66: goto L_0x00a7;
                case 74: goto L_0x00b5;
                case 80: goto L_0x00c3;
                case 90: goto L_0x00d1;
                case 138: goto L_0x00df;
                default: goto L_0x0038;
            }     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
        L_0x0038:
            boolean r0 = r14.A0a(r7, r0)     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            if (r0 != 0) goto L_0x0030
            goto L_0x010c
        L_0x0040:
            int r1 = r7.A02()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = 1
            if (r1 == r0) goto L_0x0049
            r3 = 5
            goto L_0x0062
        L_0x0049:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 16
            r14.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r14.A03 = r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0030
        L_0x0052:
            int r1 = r7.A02()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = 1
            if (r1 != r0) goto L_0x0062
            int r0 = r14.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 8
            r14.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r14.A02 = r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0030
        L_0x0062:
            super.A0X(r3, r1)     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0030
        L_0x0066:
            java.lang.String r1 = r7.A0A()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            int r0 = r14.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 1
            r14.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r14.A08 = r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0030
        L_0x0073:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 2
            r14.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.1Ww r0 = r7.A08()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r14.A05 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0030
        L_0x0080:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 4
            r14.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            int r0 = r7.A02()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r14.A01 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0030
        L_0x008d:
            java.lang.String r1 = r7.A0A()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            int r0 = r14.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 32
            r14.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r14.A07 = r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0030
        L_0x009a:
            java.lang.String r1 = r7.A0A()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            int r0 = r14.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 64
            r14.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r14.A09 = r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0030
        L_0x00a7:
            java.lang.String r1 = r7.A0A()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            int r0 = r14.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r14.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r14.A0A = r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0030
        L_0x00b5:
            java.lang.String r1 = r7.A0A()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            int r0 = r14.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 256(0x100, float:3.59E-43)
            r14.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r14.A0B = r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0030
        L_0x00c3:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 512(0x200, float:7.175E-43)
            r14.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            long r0 = r7.A06()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r14.A04 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0030
        L_0x00d1:
            java.lang.String r1 = r7.A0A()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            int r0 = r14.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r14.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r14.A0C = r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0030
        L_0x00df:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r3 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r3
            if (r0 != r3) goto L_0x00f9
            X.21S r0 = r14.A06     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.21T r1 = (X.AnonymousClass21T) r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
        L_0x00ee:
            X.21S r0 = X.AnonymousClass21S.A0R     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.1Wo r0 = X.C28541Wm.A0H(r7, r2, r0)     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.21S r0 = (X.AnonymousClass21S) r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r14.A06 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x00fb
        L_0x00f9:
            r1 = r4
            goto L_0x00ee
        L_0x00fb:
            if (r1 == 0) goto L_0x0105
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.21S r0 = (X.AnonymousClass21S) r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r14.A06 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
        L_0x0105:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | r3
            r14.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0030
        L_0x010c:
            X.2uU r0 = A0D
            return r0
        L_0x010f:
            r0 = move-exception
            goto L_0x0117
        L_0x0111:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C28541Wm.A0J(r0, r14)     // Catch:{ all -> 0x011c }
            goto L_0x011b
        L_0x0117:
            java.lang.RuntimeException r0 = X.C28541Wm.A0K(r14, r0)     // Catch:{ all -> 0x011c }
        L_0x011b:
            throw r0     // Catch:{ all -> 0x011c }
        L_0x011c:
            r0 = move-exception
            throw r0
        L_0x011e:
            X.2L6 r7 = (X.AnonymousClass2L6) r7
            X.2uU r2 = (X.C58992uU) r2
            int r6 = r14.A00
            boolean r4 = X.C28541Wm.A0T(r6)
            java.lang.String r3 = r14.A08
            int r5 = r2.A00
            boolean r1 = X.C28541Wm.A0T(r5)
            java.lang.String r0 = r2.A08
            java.lang.String r0 = r7.Ahz(r3, r0, r4, r1)
            r14.A08 = r0
            r1 = 2
            r0 = r6 & 2
            boolean r4 = X.AnonymousClass000.A1R(r0, r1)
            X.1Ww r3 = r14.A05
            r0 = r5 & 2
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            X.1Ww r0 = r2.A05
            X.1Ww r0 = r7.Ahn(r3, r0, r4, r1)
            r14.A05 = r0
            int r3 = r14.A00
            r1 = 4
            r0 = r3 & 4
            boolean r6 = X.AnonymousClass000.A1R(r0, r1)
            int r4 = r14.A01
            int r5 = r2.A00
            r0 = r5 & 4
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            int r0 = r2.A01
            int r0 = r7.Ahq(r4, r0, r6, r1)
            r14.A01 = r0
            r1 = 8
            r0 = r3 & 8
            boolean r6 = X.AnonymousClass000.A1R(r0, r1)
            int r4 = r14.A02
            r0 = r5 & 8
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            int r0 = r2.A02
            int r0 = r7.Ahq(r4, r0, r6, r1)
            r14.A02 = r0
            r1 = 16
            r0 = r3 & 16
            boolean r6 = X.AnonymousClass000.A1R(r0, r1)
            int r4 = r14.A03
            r0 = r5 & 16
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            int r0 = r2.A03
            int r0 = r7.Ahq(r4, r0, r6, r1)
            r14.A03 = r0
            r1 = 32
            r0 = r3 & 32
            boolean r6 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r4 = r14.A07
            r0 = r5 & 32
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r0 = r2.A07
            java.lang.String r0 = r7.Ahz(r4, r0, r6, r1)
            r14.A07 = r0
            r1 = 64
            r0 = r3 & 64
            boolean r6 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r4 = r14.A09
            r0 = r5 & 64
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r0 = r2.A09
            java.lang.String r0 = r7.Ahz(r4, r0, r6, r1)
            r14.A09 = r0
            r1 = 128(0x80, float:1.794E-43)
            r0 = r3 & r1
            boolean r6 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r4 = r14.A0A
            r0 = r5 & r1
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r0 = r2.A0A
            java.lang.String r0 = r7.Ahz(r4, r0, r6, r1)
            r14.A0A = r0
            r1 = 256(0x100, float:3.59E-43)
            r0 = r3 & r1
            boolean r6 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r4 = r14.A0B
            r0 = r5 & r1
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r0 = r2.A0B
            java.lang.String r0 = r7.Ahz(r4, r0, r6, r1)
            r14.A0B = r0
            r1 = 512(0x200, float:7.175E-43)
            r0 = r3 & r1
            boolean r12 = X.AnonymousClass000.A1R(r0, r1)
            long r8 = r14.A04
            r0 = r5 & r1
            boolean r13 = X.AnonymousClass000.A1R(r0, r1)
            long r10 = r2.A04
            long r0 = r7.Aht(r8, r10, r12, r13)
            r14.A04 = r0
            r0 = 1024(0x400, float:1.435E-42)
            r3 = r3 & r0
            boolean r4 = X.AnonymousClass000.A1R(r3, r0)
            java.lang.String r3 = r14.A0C
            r5 = r5 & r0
            boolean r1 = X.AnonymousClass000.A1R(r5, r0)
            java.lang.String r0 = r2.A0C
            java.lang.String r0 = r7.Ahz(r3, r0, r4, r1)
            r14.A0C = r0
            X.21S r1 = r14.A06
            X.21S r0 = r2.A06
            X.1Wo r0 = r7.Ahu(r1, r0)
            X.21S r0 = (X.AnonymousClass21S) r0
            r14.A06 = r0
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r7 != r0) goto L_0x023f
            int r1 = r14.A00
            int r0 = r2.A00
            r1 = r1 | r0
            r14.A00 = r1
        L_0x023f:
            return r14
        L_0x0240:
            X.3eN r0 = new X.3eN
            r0.<init>()
            return r0
        L_0x0246:
            return r4
        L_0x0247:
            X.2uU r0 = A0D
            return r0
        L_0x024a:
            X.2uU r0 = new X.2uU
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58992uU.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = C28541Wm.A08(this.A08, 1, 0);
        }
        int i4 = this.A00;
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A03(this.A05, 2, i3);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A01(3, this.A01);
        }
        if ((i4 & 8) == 8) {
            i3 = C28541Wm.A01(4, this.A02, i3);
        }
        if ((i4 & 16) == 16) {
            i3 = C28541Wm.A01(5, this.A03, i3);
        }
        if ((i4 & 32) == 32) {
            i3 = C28541Wm.A07(this.A07, i3);
        }
        if ((this.A00 & 64) == 64) {
            i3 = C28541Wm.A07(this.A09, i3);
        }
        if ((this.A00 & 128) == 128) {
            i3 = C28541Wm.A07(this.A0A, i3);
        }
        if ((this.A00 & 256) == 256) {
            i3 = C28541Wm.A07(this.A0B, i3);
        }
        int i5 = this.A00;
        if ((i5 & 512) == 512) {
            i3 = C28541Wm.A02(i3, this.A04);
        }
        if ((i5 & 1024) == 1024) {
            i3 = C28541Wm.A07(this.A0C, i3);
        }
        if ((this.A00 & 2048) == 2048) {
            AnonymousClass21S r0 = this.A06;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            i3 = C28541Wm.A06(r0, 17, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A08);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A05, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A09(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A09(4, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A09(5, this.A03);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0D(6, this.A07);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0D(7, this.A09);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0D(8, this.A0A);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0D(9, this.A0B);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A0C(10, this.A04);
        }
        if ((this.A00 & 1024) == 1024) {
            codedOutputStream.A0D(11, this.A0C);
        }
        if ((this.A00 & 2048) == 2048) {
            AnonymousClass21S r0 = this.A06;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 17);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
