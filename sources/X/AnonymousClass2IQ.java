package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2IQ  reason: invalid class name */
public final class AnonymousClass2IQ extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2IQ A08;
    public static volatile C47872Kz A09;
    public int A00;
    public int A01 = 0;
    public int A02;
    public AnonymousClass1XE A03 = AnonymousClass2NE.A01;
    public Object A04;
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";

    static {
        AnonymousClass2IQ r0 = new AnonymousClass2IQ();
        A08 = r0;
        r0.A0W();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d0, code lost:
        if (r10.A01 == 1) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d5, code lost:
        if (r10.A01 == 6) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01d7, code lost:
        r4 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r10 = this;
            int r0 = r11.ordinal()
            r3 = 6
            r5 = 0
            r4 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x01f9;
                case 1: goto L_0x012d;
                case 2: goto L_0x002d;
                case 3: goto L_0x01f2;
                case 4: goto L_0x01fc;
                case 5: goto L_0x01ec;
                case 6: goto L_0x010c;
                case 7: goto L_0x0011;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0011:
            X.2Kz r0 = A09
            if (r0 != 0) goto L_0x002a
            java.lang.Class<X.2IQ> r2 = X.AnonymousClass2IQ.class
            monitor-enter(r2)
            X.2Kz r0 = A09     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0025
            X.2IQ r1 = A08     // Catch:{ all -> 0x0027 }
            X.2Kz r0 = new X.2Kz     // Catch:{ all -> 0x0027 }
            r0.<init>(r1)     // Catch:{ all -> 0x0027 }
            A09 = r0     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            goto L_0x002a
        L_0x0027:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r0
        L_0x002a:
            X.2Kz r0 = A09
            return r0
        L_0x002d:
            X.2Kx r12 = (X.C47852Kx) r12
            X.2Ky r13 = (X.C47862Ky) r13
        L_0x0031:
            int r1 = r12.A03()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            if (r1 == 0) goto L_0x010c
            r0 = 10
            if (r1 == r0) goto L_0x00de
            r0 = 18
            if (r1 == r0) goto L_0x00d0
            r0 = 24
            if (r1 == r0) goto L_0x00c2
            r0 = 34
            if (r1 == r0) goto L_0x00a2
            r0 = 42
            if (r1 == r0) goto L_0x0095
            r0 = 50
            if (r1 == r0) goto L_0x0068
            r0 = 58
            if (r1 == r0) goto L_0x005b
            boolean r0 = r10.A0a(r12, r1)     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            if (r0 != 0) goto L_0x0031
            goto L_0x010c
        L_0x005b:
            java.lang.String r1 = r12.A0A()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            int r0 = r10.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 32
            r10.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r10.A06 = r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0031
        L_0x0068:
            int r0 = r10.A01     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            if (r0 != r3) goto L_0x0083
            java.lang.Object r0 = r10.A04     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.2te r0 = (X.C58532te) r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.3dG r1 = (X.C68333dG) r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
        L_0x0076:
            X.2te r0 = X.C58532te.A04     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.1Wo r0 = r12.A09(r13, r0)     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r10.A04 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0085
        L_0x0083:
            r1 = r5
            goto L_0x0076
        L_0x0085:
            if (r1 == 0) goto L_0x0092
            X.2te r0 = (X.C58532te) r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r1.A04(r0)     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r10.A04 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
        L_0x0092:
            r10.A01 = r3     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0031
        L_0x0095:
            java.lang.String r1 = r12.A0A()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            int r0 = r10.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 4
            r10.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r10.A05 = r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0031
        L_0x00a2:
            X.1XE r1 = r10.A03     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            boolean r0 = r0.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            if (r0 != 0) goto L_0x00b1
            X.1XE r1 = X.C28541Wm.A0G(r1)     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r10.A03 = r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
        L_0x00b1:
            X.2tI r0 = X.C58312tI.A03     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.1Wo r0 = r12.A09(r13, r0)     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.2tI r0 = (X.C58312tI) r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r1.add(r0)     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0031
        L_0x00c2:
            int r0 = r10.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 2
            r10.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            int r0 = r12.A02()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r10.A02 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0031
        L_0x00d0:
            java.lang.String r1 = r12.A0A()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            int r0 = r10.A00     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r0 = r0 | 1
            r10.A00 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r10.A07 = r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0031
        L_0x00de:
            int r0 = r10.A01     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            if (r0 != r2) goto L_0x00f9
            java.lang.Object r0 = r10.A04     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.2IR r0 = (X.AnonymousClass2IR) r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.3dK r1 = (X.C68373dK) r1     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
        L_0x00ec:
            X.2IR r0 = X.AnonymousClass2IR.A09     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.1Wo r0 = r12.A09(r13, r0)     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r10.A04 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x00fb
        L_0x00f9:
            r1 = r5
            goto L_0x00ec
        L_0x00fb:
            if (r1 == 0) goto L_0x0108
            X.2IR r0 = (X.AnonymousClass2IR) r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r1.A04(r0)     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            r10.A04 = r0     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
        L_0x0108:
            r10.A01 = r2     // Catch:{ 1bD -> 0x0111, IOException -> 0x010f }
            goto L_0x0031
        L_0x010c:
            X.2IQ r0 = A08
            return r0
        L_0x010f:
            r0 = move-exception
            goto L_0x011a
        L_0x0111:
            r0 = move-exception
            r0.unfinishedMessage = r10     // Catch:{ all -> 0x012b }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x012b }
            r1.<init>(r0)     // Catch:{ all -> 0x012b }
            goto L_0x012a
        L_0x011a:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x012b }
            X.1bD r0 = new X.1bD     // Catch:{ all -> 0x012b }
            r0.<init>(r1)     // Catch:{ all -> 0x012b }
            r0.unfinishedMessage = r10     // Catch:{ all -> 0x012b }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x012b }
            r1.<init>(r0)     // Catch:{ all -> 0x012b }
        L_0x012a:
            throw r1     // Catch:{ all -> 0x012b }
        L_0x012b:
            r0 = move-exception
            throw r0
        L_0x012d:
            X.2L6 r12 = (X.AnonymousClass2L6) r12
            X.2IQ r13 = (X.AnonymousClass2IQ) r13
            int r8 = r10.A00
            r7 = 1
            r0 = r8 & 1
            if (r0 == r2) goto L_0x0139
            r7 = 0
        L_0x0139:
            java.lang.String r6 = r10.A07
            int r5 = r13.A00
            r1 = 1
            r0 = r5 & 1
            if (r0 == r2) goto L_0x0143
            r1 = 0
        L_0x0143:
            java.lang.String r0 = r13.A07
            java.lang.String r0 = r12.Ahz(r6, r0, r7, r1)
            r10.A07 = r0
            r1 = 2
            r0 = r8 & 2
            r7 = 0
            if (r0 != r1) goto L_0x0152
            r7 = 1
        L_0x0152:
            int r6 = r10.A02
            r5 = r5 & 2
            r0 = 2
            r1 = 0
            if (r5 != r0) goto L_0x015b
            r1 = 1
        L_0x015b:
            int r0 = r13.A02
            int r0 = r12.Ahq(r6, r0, r7, r1)
            r10.A02 = r0
            X.1XE r1 = r10.A03
            X.1XE r0 = r13.A03
            X.1XE r0 = r12.Ahs(r1, r0)
            r10.A03 = r0
            int r9 = r10.A00
            r1 = 4
            r0 = r9 & 4
            r7 = 0
            if (r0 != r1) goto L_0x0176
            r7 = 1
        L_0x0176:
            java.lang.String r6 = r10.A05
            int r8 = r13.A00
            r5 = r8 & 4
            r0 = 4
            r1 = 0
            if (r5 != r0) goto L_0x0181
            r1 = 1
        L_0x0181:
            java.lang.String r0 = r13.A05
            java.lang.String r0 = r12.Ahz(r6, r0, r7, r1)
            r10.A05 = r0
            r1 = 32
            r0 = r9 & 32
            r7 = 0
            if (r0 != r1) goto L_0x0191
            r7 = 1
        L_0x0191:
            java.lang.String r6 = r10.A06
            r5 = r8 & 32
            r0 = 32
            r1 = 0
            if (r5 != r0) goto L_0x019b
            r1 = 1
        L_0x019b:
            java.lang.String r0 = r13.A06
            java.lang.String r0 = r12.Ahz(r6, r0, r7, r1)
            r10.A06 = r0
            int r0 = r13.A01
            if (r0 == 0) goto L_0x01e9
            if (r0 == r2) goto L_0x01e6
            if (r0 == r3) goto L_0x01e3
            r0 = 0
        L_0x01ac:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x01ce;
                case 1: goto L_0x01d3;
                case 2: goto L_0x01c5;
                default: goto L_0x01b3;
            }
        L_0x01b3:
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r12 != r0) goto L_0x01c4
            int r0 = r13.A01
            if (r0 == 0) goto L_0x01bd
            r10.A01 = r0
        L_0x01bd:
            int r1 = r10.A00
            int r0 = r13.A00
            r1 = r1 | r0
            r10.A00 = r1
        L_0x01c4:
            return r10
        L_0x01c5:
            int r0 = r10.A01
            if (r0 == 0) goto L_0x01ca
            r4 = 1
        L_0x01ca:
            r12.Ahx(r4)
            goto L_0x01b3
        L_0x01ce:
            int r0 = r10.A01
            if (r0 != r2) goto L_0x01d8
            goto L_0x01d7
        L_0x01d3:
            int r0 = r10.A01
            if (r0 != r3) goto L_0x01d8
        L_0x01d7:
            r4 = 1
        L_0x01d8:
            java.lang.Object r1 = r10.A04
            java.lang.Object r0 = r13.A04
            java.lang.Object r0 = r12.Ahw(r1, r0, r4)
            r10.A04 = r0
            goto L_0x01b3
        L_0x01e3:
            X.42Q r0 = X.AnonymousClass42Q.A01
            goto L_0x01ac
        L_0x01e6:
            X.42Q r0 = X.AnonymousClass42Q.A03
            goto L_0x01ac
        L_0x01e9:
            X.42Q r0 = X.AnonymousClass42Q.A02
            goto L_0x01ac
        L_0x01ec:
            X.3dF r0 = new X.3dF
            r0.<init>()
            return r0
        L_0x01f2:
            X.1XE r0 = r10.A03
            X.1XF r0 = (X.AnonymousClass1XF) r0
            r0.A00 = r4
            return r5
        L_0x01f9:
            X.2IQ r0 = A08
            return r0
        L_0x01fc:
            X.2IQ r0 = new X.2IQ
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IQ.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public C58532te A0c() {
        return this.A01 == 6 ? (C58532te) this.A04 : C58532te.A04;
    }

    public AnonymousClass2IR A0d() {
        return this.A01 == 1 ? (AnonymousClass2IR) this.A04 : AnonymousClass2IR.A09;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A052 = this.A01 == 1 ? CodedOutputStream.A05((C28551Wn) this.A04, 1) : 0;
        if ((this.A00 & 1) == 1) {
            A052 += CodedOutputStream.A06(this.A07) + 1;
        }
        if ((this.A00 & 2) == 2) {
            A052 += CodedOutputStream.A02(3, this.A02);
        }
        for (int i3 = 0; i3 < this.A03.size(); i3++) {
            A052 += CodedOutputStream.A05((AnonymousClass1Wo) this.A03.get(i3), 4);
        }
        if ((this.A00 & 4) == 4) {
            A052 += CodedOutputStream.A06(this.A05) + 1;
        }
        if (this.A01 == 6) {
            A052 += CodedOutputStream.A05((C28551Wn) this.A04, 6);
        }
        if ((this.A00 & 32) == 32) {
            A052 += 1 + CodedOutputStream.A06(this.A06);
        }
        int A002 = A052 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if (this.A01 == 1) {
            codedOutputStream.A0G((C28551Wn) this.A04, 1);
        }
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(2, this.A07);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0A(3, this.A02);
        }
        for (int i2 = 0; i2 < this.A03.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A03.get(i2), 4);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(5, this.A05);
        }
        if (this.A01 == 6) {
            codedOutputStream.A0G((C28551Wn) this.A04, 6);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0D(7, this.A06);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
