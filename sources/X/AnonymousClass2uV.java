package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2uV  reason: invalid class name */
public final class AnonymousClass2uV extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2uV A0G;
    public static volatile C47872Kz A0H;
    public byte A00 = -1;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public C59002uW A06;
    public String A07 = "";
    public String A08 = "";
    public String A09 = "";
    public String A0A = "";
    public String A0B = "";
    public String A0C = "";
    public String A0D = "";
    public String A0E = "";
    public String A0F = "";

    static {
        AnonymousClass2uV r0 = new AnonymousClass2uV();
        A0G = r0;
        r0.A0W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0153, code lost:
        return A0G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r14 = this;
            r0 = r17
            r7 = r16
            int r1 = r15.ordinal()
            r5 = 0
            r4 = 0
            r3 = 1
            switch(r1) {
                case 0: goto L_0x012b;
                case 1: goto L_0x0154;
                case 2: goto L_0x002e;
                case 3: goto L_0x014c;
                case 4: goto L_0x02ac;
                case 5: goto L_0x02a6;
                case 6: goto L_0x0151;
                case 7: goto L_0x0013;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0013:
            X.2Kz r0 = A0H
            if (r0 != 0) goto L_0x002b
            java.lang.Class<X.2uV> r1 = X.AnonymousClass2uV.class
            monitor-enter(r1)
            X.2Kz r0 = A0H     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            X.2uV r0 = A0G     // Catch:{ all -> 0x0028 }
            X.2Kz r0 = X.C28541Wm.A09(r0)     // Catch:{ all -> 0x0028 }
            A0H = r0     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            X.2Kz r0 = A0H
            return r0
        L_0x002e:
            X.2Kx r7 = (X.C47852Kx) r7
            X.2Ky r0 = (X.C47862Ky) r0
        L_0x0032:
            int r1 = r7.A03()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            switch(r1) {
                case 0: goto L_0x0151;
                case 8: goto L_0x0041;
                case 18: goto L_0x004e;
                case 26: goto L_0x005b;
                case 34: goto L_0x0068;
                case 42: goto L_0x0075;
                case 50: goto L_0x0082;
                case 58: goto L_0x008f;
                case 66: goto L_0x009c;
                case 74: goto L_0x00a9;
                case 80: goto L_0x00b7;
                case 88: goto L_0x00c5;
                case 98: goto L_0x00d3;
                case 104: goto L_0x00e1;
                case 114: goto L_0x00ef;
                default: goto L_0x0039;
            }     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
        L_0x0039:
            boolean r1 = r14.A0a(r7, r1)     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            if (r1 != 0) goto L_0x0032
            goto L_0x0151
        L_0x0041:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | 1
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            long r1 = r7.A06()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A03 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x004e:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | 2
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A07 = r2     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x005b:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | 4
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A08 = r2     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x0068:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | 8
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A09 = r2     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x0075:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | 16
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A0A = r2     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x0082:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | 32
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A0B = r2     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x008f:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | 64
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A0C = r2     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x009c:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | 128(0x80, float:1.794E-43)
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A0D = r2     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x00a9:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | 256(0x100, float:3.59E-43)
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A0E = r2     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x00b7:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | 512(0x200, float:7.175E-43)
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            long r1 = r7.A06()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A04 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x00c5:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            long r1 = r7.A06()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A05 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x00d3:
            java.lang.String r2 = r7.A0A()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | 2048(0x800, float:2.87E-42)
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A0F = r2     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x00e1:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            int r1 = r7.A02()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A02 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x00ef:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r3 = 8192(0x2000, float:1.14794E-41)
            r1 = r1 & r3
            if (r1 != r3) goto L_0x0109
            X.2uW r1 = r14.A06     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            X.1Wr r2 = r1.A0U()     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            X.3ex r2 = (X.C69383ex) r2     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
        L_0x00fe:
            X.2uW r1 = X.C59002uW.A0K     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            X.1Wo r1 = X.C28541Wm.A0H(r7, r0, r1)     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            X.2uW r1 = (X.C59002uW) r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A06 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x010b
        L_0x0109:
            r2 = r4
            goto L_0x00fe
        L_0x010b:
            if (r2 == 0) goto L_0x0115
            X.1Wm r1 = X.C28541Wm.A0C(r2, r1)     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            X.2uW r1 = (X.C59002uW) r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r14.A06 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
        L_0x0115:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            r1 = r1 | r3
            r14.A01 = r1     // Catch:{ 1bD -> 0x011e, IOException -> 0x011c }
            goto L_0x0032
        L_0x011c:
            r0 = move-exception
            goto L_0x0124
        L_0x011e:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C28541Wm.A0J(r0, r14)     // Catch:{ all -> 0x0129 }
            goto L_0x0128
        L_0x0124:
            java.lang.RuntimeException r0 = X.C28541Wm.A0K(r14, r0)     // Catch:{ all -> 0x0129 }
        L_0x0128:
            throw r0     // Catch:{ all -> 0x0129 }
        L_0x0129:
            r0 = move-exception
            throw r0
        L_0x012b:
            byte r0 = r14.A00
            if (r0 == r3) goto L_0x0151
            if (r0 == 0) goto L_0x014c
            boolean r2 = X.AnonymousClass000.A1X(r7)
            int r1 = r14.A01
            r0 = 8192(0x2000, float:1.14794E-41)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x014d
            X.2uW r0 = r14.A06
            if (r0 != 0) goto L_0x0142
            X.2uW r0 = X.C59002uW.A0K
        L_0x0142:
            boolean r0 = r0.A0Z()
            if (r0 != 0) goto L_0x014d
            if (r2 == 0) goto L_0x014c
            r14.A00 = r5
        L_0x014c:
            return r4
        L_0x014d:
            if (r2 == 0) goto L_0x0151
            r14.A00 = r3
        L_0x0151:
            X.2uV r0 = A0G
            return r0
        L_0x0154:
            X.2L6 r7 = (X.AnonymousClass2L6) r7
            X.2uV r0 = (X.AnonymousClass2uV) r0
            int r2 = r14.A01
            r12 = 1
            r1 = r2 & 1
            if (r1 == r3) goto L_0x0160
            r12 = 0
        L_0x0160:
            long r8 = r14.A03
            int r1 = r0.A01
            r13 = 1
            r4 = r1 & 1
            if (r4 == r3) goto L_0x016a
            r13 = 0
        L_0x016a:
            long r10 = r0.A03
            long r3 = r7.Aht(r8, r10, r12, r13)
            r14.A03 = r3
            r4 = 2
            r3 = r2 & 2
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A07
            r3 = r1 & 2
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r0.A07
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A07 = r3
            r4 = 4
            r3 = r2 & 4
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A08
            r3 = r1 & 4
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r0.A08
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A08 = r3
            r4 = 8
            r3 = r2 & 8
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A09
            r3 = r1 & 8
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r0.A09
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A09 = r3
            r4 = 16
            r3 = r2 & 16
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A0A
            r3 = r1 & 16
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r0.A0A
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A0A = r3
            r4 = 32
            r3 = r2 & 32
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A0B
            r3 = r1 & 32
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r0.A0B
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A0B = r3
            r4 = 64
            r3 = r2 & 64
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A0C
            r3 = r1 & 64
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r0.A0C
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A0C = r3
            r4 = 128(0x80, float:1.794E-43)
            r3 = r2 & r4
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A0D
            r3 = r1 & r4
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r0.A0D
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A0D = r3
            r4 = 256(0x100, float:3.59E-43)
            r3 = r2 & r4
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A0E
            r3 = r1 & r4
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r0.A0E
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A0E = r3
            r4 = 512(0x200, float:7.175E-43)
            r3 = r2 & r4
            boolean r12 = X.AnonymousClass000.A1R(r3, r4)
            long r8 = r14.A04
            r3 = r1 & r4
            boolean r13 = X.AnonymousClass000.A1R(r3, r4)
            long r10 = r0.A04
            long r3 = r7.Aht(r8, r10, r12, r13)
            r14.A04 = r3
            r4 = 1024(0x400, float:1.435E-42)
            r3 = r2 & r4
            boolean r12 = X.AnonymousClass000.A1R(r3, r4)
            long r8 = r14.A05
            r3 = r1 & r4
            boolean r13 = X.AnonymousClass000.A1R(r3, r4)
            long r10 = r0.A05
            long r3 = r7.Aht(r8, r10, r12, r13)
            r14.A05 = r3
            r4 = 2048(0x800, float:2.87E-42)
            r3 = r2 & r4
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A0F
            r3 = r1 & r4
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r0.A0F
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A0F = r3
            r5 = 4096(0x1000, float:5.74E-42)
            r2 = r2 & r5
            boolean r4 = X.AnonymousClass000.A1R(r2, r5)
            int r3 = r14.A02
            r1 = r1 & r5
            boolean r2 = X.AnonymousClass000.A1R(r1, r5)
            int r1 = r0.A02
            int r1 = r7.Ahq(r3, r1, r4, r2)
            r14.A02 = r1
            X.2uW r2 = r14.A06
            X.2uW r1 = r0.A06
            X.1Wo r1 = r7.Ahu(r2, r1)
            X.2uW r1 = (X.C59002uW) r1
            r14.A06 = r1
            X.2L7 r1 = X.AnonymousClass2L7.A00
            if (r7 != r1) goto L_0x02a5
            int r1 = r14.A01
            int r0 = r0.A01
            r1 = r1 | r0
            r14.A01 = r1
        L_0x02a5:
            return r14
        L_0x02a6:
            X.3f7 r0 = new X.3f7
            r0.<init>()
            return r0
        L_0x02ac:
            X.2uV r0 = new X.2uV
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2uV.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A01;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A03(this.A03) + 1;
        }
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A06(this.A07) + 1;
        }
        if ((this.A01 & 4) == 4) {
            i3 = C28541Wm.A08(this.A08, 1, i3);
        }
        if ((this.A01 & 8) == 8) {
            i3 = C28541Wm.A07(this.A09, i3);
        }
        if ((this.A01 & 16) == 16) {
            i3 = C28541Wm.A07(this.A0A, i3);
        }
        if ((this.A01 & 32) == 32) {
            i3 = C28541Wm.A07(this.A0B, i3);
        }
        if ((this.A01 & 64) == 64) {
            i3 = C28541Wm.A07(this.A0C, i3);
        }
        if ((this.A01 & 128) == 128) {
            i3 = C28541Wm.A07(this.A0D, i3);
        }
        if ((this.A01 & 256) == 256) {
            i3 = C28541Wm.A07(this.A0E, i3);
        }
        int i5 = this.A01;
        if ((i5 & 512) == 512) {
            i3 = C28541Wm.A02(i3, this.A04);
        }
        if ((i5 & 1024) == 1024) {
            i3 = C28541Wm.A02(i3, this.A05);
        }
        if ((i5 & 2048) == 2048) {
            i3 = C28541Wm.A07(this.A0F, i3);
        }
        int i6 = this.A01;
        if ((i6 & 4096) == 4096) {
            i3 += CodedOutputStream.A01(13, this.A02);
        }
        if ((i6 & 8192) == 8192) {
            C59002uW r0 = this.A06;
            if (r0 == null) {
                r0 = C59002uW.A0K;
            }
            i3 = C28541Wm.A06(r0, 14, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A0C(1, this.A03);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0D(2, this.A07);
        }
        if ((this.A01 & 4) == 4) {
            codedOutputStream.A0D(3, this.A08);
        }
        if ((this.A01 & 8) == 8) {
            codedOutputStream.A0D(4, this.A09);
        }
        if ((this.A01 & 16) == 16) {
            codedOutputStream.A0D(5, this.A0A);
        }
        if ((this.A01 & 32) == 32) {
            codedOutputStream.A0D(6, this.A0B);
        }
        if ((this.A01 & 64) == 64) {
            codedOutputStream.A0D(7, this.A0C);
        }
        if ((this.A01 & 128) == 128) {
            codedOutputStream.A0D(8, this.A0D);
        }
        if ((this.A01 & 256) == 256) {
            codedOutputStream.A0D(9, this.A0E);
        }
        if ((this.A01 & 512) == 512) {
            codedOutputStream.A0C(10, this.A04);
        }
        if ((this.A01 & 1024) == 1024) {
            codedOutputStream.A0C(11, this.A05);
        }
        if ((this.A01 & 2048) == 2048) {
            codedOutputStream.A0D(12, this.A0F);
        }
        if ((this.A01 & 4096) == 4096) {
            codedOutputStream.A09(13, this.A02);
        }
        if ((this.A01 & 8192) == 8192) {
            C59002uW r0 = this.A06;
            if (r0 == null) {
                r0 = C59002uW.A0K;
            }
            codedOutputStream.A0G(r0, 14);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
