package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2uY  reason: invalid class name and case insensitive filesystem */
public final class C59022uY extends C28541Wm implements C28561Wp {
    public static final C59022uY A06;
    public static volatile C47872Kz A07;
    public int A00;
    public int A01 = 0;
    public AnonymousClass21S A02;
    public C59032uZ A03;
    public Object A04;
    public String A05 = "";

    static {
        C59022uY r0 = new C59022uY();
        A06 = r0;
        r0.A0W();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01ac, code lost:
        if (r8.A01 == 2) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01b1, code lost:
        if (r8.A01 == 1) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01b6, code lost:
        if (r8.A01 == 5) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01b8, code lost:
        r5 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            int r0 = r9.ordinal()
            r4 = 5
            r3 = 2
            r5 = 0
            r6 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x01d7;
                case 1: goto L_0x0145;
                case 2: goto L_0x002c;
                case 3: goto L_0x01d6;
                case 4: goto L_0x01da;
                case 5: goto L_0x01d0;
                case 6: goto L_0x0133;
                case 7: goto L_0x0011;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0011:
            X.2Kz r0 = A07
            if (r0 != 0) goto L_0x0029
            java.lang.Class<X.2uY> r1 = X.C59022uY.class
            monitor-enter(r1)
            X.2Kz r0 = A07     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0024
            X.2uY r0 = A06     // Catch:{ all -> 0x0026 }
            X.2Kz r0 = X.C28541Wm.A09(r0)     // Catch:{ all -> 0x0026 }
            A07 = r0     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            goto L_0x0029
        L_0x0026:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r0
        L_0x0029:
            X.2Kz r0 = A07
            return r0
        L_0x002c:
            X.2Kx r10 = (X.C47852Kx) r10
            X.2Ky r11 = (X.C47862Ky) r11
        L_0x0030:
            int r1 = r10.A03()     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            if (r1 == 0) goto L_0x0133
            r0 = 10
            if (r1 == r0) goto L_0x010c
            r0 = 18
            if (r1 == r0) goto L_0x00e5
            r0 = 26
            if (r1 == r0) goto L_0x00a9
            r0 = 34
            if (r1 == r0) goto L_0x0089
            r0 = 42
            if (r1 == r0) goto L_0x0063
            r0 = 74
            if (r1 == r0) goto L_0x0056
            boolean r0 = r8.A0a(r10, r1)     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            if (r0 != 0) goto L_0x0030
            goto L_0x0133
        L_0x0056:
            java.lang.String r1 = r10.A0A()     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            int r0 = r8.A00     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r0 = r0 | 32
            r8.A00 = r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r8.A05 = r1     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            goto L_0x0030
        L_0x0063:
            int r0 = r8.A01     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            if (r0 != r4) goto L_0x007a
            java.lang.Object r0 = r8.A04     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.220 r0 = (X.AnonymousClass220) r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.3fB r1 = (X.C69523fB) r1     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
        L_0x0071:
            X.220 r0 = X.AnonymousClass220.A07     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.1Wo r0 = X.C28541Wm.A0H(r10, r11, r0)     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r8.A04 = r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            goto L_0x007c
        L_0x007a:
            r1 = r6
            goto L_0x0071
        L_0x007c:
            if (r1 == 0) goto L_0x0086
            X.220 r0 = (X.AnonymousClass220) r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r8.A04 = r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
        L_0x0086:
            r8.A01 = r4     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            goto L_0x0030
        L_0x0089:
            int r0 = r8.A00     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r1 = 16
            r0 = r0 & 16
            if (r0 != r1) goto L_0x00a4
            X.2uZ r0 = r8.A03     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.3fH r1 = (X.C69583fH) r1     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
        L_0x0099:
            X.2uZ r0 = X.C59032uZ.A07     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.1Wo r0 = X.C28541Wm.A0H(r10, r11, r0)     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.2uZ r0 = (X.C59032uZ) r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r8.A03 = r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            goto L_0x00a6
        L_0x00a4:
            r1 = r6
            goto L_0x0099
        L_0x00a6:
            if (r1 == 0) goto L_0x00dd
            goto L_0x00d5
        L_0x00a9:
            int r0 = r8.A00     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x00c4
            X.21S r0 = r8.A02     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.21T r1 = (X.AnonymousClass21T) r1     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
        L_0x00b9:
            X.21S r0 = X.AnonymousClass21S.A0R     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.1Wo r0 = X.C28541Wm.A0H(r10, r11, r0)     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.21S r0 = (X.AnonymousClass21S) r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r8.A02 = r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            goto L_0x00c6
        L_0x00c4:
            r1 = r6
            goto L_0x00b9
        L_0x00c6:
            if (r1 == 0) goto L_0x00d0
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.21S r0 = (X.AnonymousClass21S) r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r8.A02 = r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
        L_0x00d0:
            int r0 = r8.A00     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r0 = r0 | 8
            goto L_0x00e1
        L_0x00d5:
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.2uZ r0 = (X.C59032uZ) r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r8.A03 = r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
        L_0x00dd:
            int r0 = r8.A00     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r0 = r0 | 16
        L_0x00e1:
            r8.A00 = r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            goto L_0x0030
        L_0x00e5:
            int r0 = r8.A01     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            if (r0 != r3) goto L_0x00fc
            java.lang.Object r0 = r8.A04     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.2uZ r0 = (X.C59032uZ) r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.3fH r1 = (X.C69583fH) r1     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
        L_0x00f3:
            X.2uZ r0 = X.C59032uZ.A07     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.1Wo r0 = X.C28541Wm.A0H(r10, r11, r0)     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r8.A04 = r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            goto L_0x00fe
        L_0x00fc:
            r1 = r6
            goto L_0x00f3
        L_0x00fe:
            if (r1 == 0) goto L_0x0108
            X.2uZ r0 = (X.C59032uZ) r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r8.A04 = r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
        L_0x0108:
            r8.A01 = r3     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            goto L_0x0030
        L_0x010c:
            int r0 = r8.A01     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            if (r0 != r2) goto L_0x0123
            java.lang.Object r0 = r8.A04     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.2uX r0 = (X.C59012uX) r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.3ef r1 = (X.C69203ef) r1     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
        L_0x011a:
            X.2uX r0 = X.C59012uX.A06     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.1Wo r0 = X.C28541Wm.A0H(r10, r11, r0)     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r8.A04 = r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            goto L_0x0125
        L_0x0123:
            r1 = r6
            goto L_0x011a
        L_0x0125:
            if (r1 == 0) goto L_0x012f
            X.2uX r0 = (X.C59012uX) r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            r8.A04 = r0     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
        L_0x012f:
            r8.A01 = r2     // Catch:{ 1bD -> 0x0138, IOException -> 0x0136 }
            goto L_0x0030
        L_0x0133:
            X.2uY r0 = A06
            return r0
        L_0x0136:
            r0 = move-exception
            goto L_0x013e
        L_0x0138:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C28541Wm.A0J(r0, r8)     // Catch:{ all -> 0x0143 }
            goto L_0x0142
        L_0x013e:
            java.lang.RuntimeException r0 = X.C28541Wm.A0K(r8, r0)     // Catch:{ all -> 0x0143 }
        L_0x0142:
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x0143:
            r0 = move-exception
            throw r0
        L_0x0145:
            X.2L6 r10 = (X.AnonymousClass2L6) r10
            X.2uY r11 = (X.C59022uY) r11
            X.21S r1 = r8.A02
            X.21S r0 = r11.A02
            X.1Wo r0 = r10.Ahu(r1, r0)
            X.21S r0 = (X.AnonymousClass21S) r0
            r8.A02 = r0
            X.2uZ r1 = r8.A03
            X.2uZ r0 = r11.A03
            X.1Wo r0 = r10.Ahu(r1, r0)
            X.2uZ r0 = (X.C59032uZ) r0
            r8.A03 = r0
            int r0 = r8.A00
            r1 = 32
            r0 = r0 & 32
            boolean r7 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r6 = r8.A05
            int r0 = r11.A00
            r0 = r0 & 32
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r0 = r11.A05
            java.lang.String r0 = r10.Ahz(r6, r0, r7, r1)
            r8.A05 = r0
            int r0 = r11.A01
            if (r0 == 0) goto L_0x01cd
            if (r0 == r2) goto L_0x01ca
            if (r0 == r3) goto L_0x01c7
            if (r0 == r4) goto L_0x01c4
            r0 = 0
        L_0x0188:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x01af;
                case 1: goto L_0x01aa;
                case 2: goto L_0x01b4;
                case 3: goto L_0x01a1;
                default: goto L_0x018f;
            }
        L_0x018f:
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r10 != r0) goto L_0x01a0
            int r0 = r11.A01
            if (r0 == 0) goto L_0x0199
            r8.A01 = r0
        L_0x0199:
            int r1 = r8.A00
            int r0 = r11.A00
            r1 = r1 | r0
            r8.A00 = r1
        L_0x01a0:
            return r8
        L_0x01a1:
            int r0 = r8.A01
            if (r0 == 0) goto L_0x01a6
            r5 = 1
        L_0x01a6:
            r10.Ahx(r5)
            goto L_0x018f
        L_0x01aa:
            int r0 = r8.A01
            if (r0 != r3) goto L_0x01b9
            goto L_0x01b8
        L_0x01af:
            int r0 = r8.A01
            if (r0 != r2) goto L_0x01b9
            goto L_0x01b8
        L_0x01b4:
            int r0 = r8.A01
            if (r0 != r4) goto L_0x01b9
        L_0x01b8:
            r5 = 1
        L_0x01b9:
            java.lang.Object r1 = r8.A04
            java.lang.Object r0 = r11.A04
            java.lang.Object r0 = r10.Ahw(r1, r0, r5)
            r8.A04 = r0
            goto L_0x018f
        L_0x01c4:
            X.42e r0 = X.C800042e.A04
            goto L_0x0188
        L_0x01c7:
            X.42e r0 = X.C800042e.A03
            goto L_0x0188
        L_0x01ca:
            X.42e r0 = X.C800042e.A02
            goto L_0x0188
        L_0x01cd:
            X.42e r0 = X.C800042e.A01
            goto L_0x0188
        L_0x01d0:
            X.3fM r0 = new X.3fM
            r0.<init>()
            return r0
        L_0x01d6:
            return r6
        L_0x01d7:
            X.2uY r0 = A06
            return r0
        L_0x01da:
            X.2uY r0 = new X.2uY
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59022uY.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public C59012uX A0c() {
        return this.A01 == 1 ? (C59012uX) this.A04 : C59012uX.A06;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (this.A01 == 1) {
            i3 = C28541Wm.A06((C28551Wn) this.A04, 1, 0);
        }
        if (this.A01 == 2) {
            i3 = C28541Wm.A06((C28551Wn) this.A04, 2, i3);
        }
        if ((this.A00 & 8) == 8) {
            AnonymousClass21S r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            i3 = C28541Wm.A06(r0, 3, i3);
        }
        if ((this.A00 & 16) == 16) {
            C59032uZ r02 = this.A03;
            if (r02 == null) {
                r02 = C59032uZ.A07;
            }
            i3 = C28541Wm.A06(r02, 4, i3);
        }
        if (this.A01 == 5) {
            i3 = C28541Wm.A06((C28551Wn) this.A04, 5, i3);
        }
        if ((this.A00 & 32) == 32) {
            i3 = C28541Wm.A07(this.A05, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if (this.A01 == 1) {
            C28541Wm.A0O(codedOutputStream, this.A04, 1);
        }
        if (this.A01 == 2) {
            C28541Wm.A0O(codedOutputStream, this.A04, 2);
        }
        if ((this.A00 & 8) == 8) {
            AnonymousClass21S r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 3);
        }
        if ((this.A00 & 16) == 16) {
            C59032uZ r02 = this.A03;
            if (r02 == null) {
                r02 = C59032uZ.A07;
            }
            codedOutputStream.A0G(r02, 4);
        }
        if (this.A01 == 5) {
            C28541Wm.A0O(codedOutputStream, this.A04, 5);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0D(9, this.A05);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
