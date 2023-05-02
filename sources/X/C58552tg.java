package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2tg  reason: invalid class name and case insensitive filesystem */
public final class C58552tg extends C28541Wm implements C28561Wp {
    public static final C58552tg A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01 = 0;
    public int A02;
    public Object A03;

    static {
        C58552tg r0 = new C58552tg();
        A04 = r0;
        r0.A0W();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x012f, code lost:
        if (r8.A01 == 2) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0134, code lost:
        if (r8.A01 == 1) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0139, code lost:
        if (r8.A01 == 3) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x013b, code lost:
        r5 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            int r0 = r9.ordinal()
            r4 = 3
            r3 = 2
            r6 = 0
            r5 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x015a;
                case 1: goto L_0x00e0;
                case 2: goto L_0x002c;
                case 3: goto L_0x0159;
                case 4: goto L_0x015d;
                case 5: goto L_0x0153;
                case 6: goto L_0x00ce;
                case 7: goto L_0x0011;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0011:
            X.2Kz r0 = A05
            if (r0 != 0) goto L_0x0029
            java.lang.Class<X.2tg> r1 = X.C58552tg.class
            monitor-enter(r1)
            X.2Kz r0 = A05     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0024
            X.2tg r0 = A04     // Catch:{ all -> 0x0026 }
            X.2Kz r0 = X.C28541Wm.A09(r0)     // Catch:{ all -> 0x0026 }
            A05 = r0     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            goto L_0x0029
        L_0x0026:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r0
        L_0x0029:
            X.2Kz r0 = A05
            return r0
        L_0x002c:
            X.2Kx r10 = (X.C47852Kx) r10
            X.2Ky r11 = (X.C47862Ky) r11
        L_0x0030:
            int r1 = r10.A03()     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            if (r1 == 0) goto L_0x00ce
            r0 = 10
            if (r1 == r0) goto L_0x00a7
            r0 = 18
            if (r1 == r0) goto L_0x0081
            r0 = 26
            if (r1 == r0) goto L_0x005b
            r0 = 32
            if (r1 == r0) goto L_0x004e
            boolean r0 = r8.A0a(r10, r1)     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            if (r0 != 0) goto L_0x0030
            goto L_0x00ce
        L_0x004e:
            int r0 = r8.A00     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            r0 = r0 | 8
            r8.A00 = r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            int r0 = r10.A02()     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            r8.A02 = r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            goto L_0x0030
        L_0x005b:
            int r0 = r8.A01     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            if (r0 != r4) goto L_0x0072
            java.lang.Object r0 = r8.A03     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.2tL r0 = (X.C58342tL) r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.3dU r1 = (X.C68473dU) r1     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
        L_0x0069:
            X.2tL r0 = X.C58342tL.A03     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.1Wo r0 = X.C28541Wm.A0H(r10, r11, r0)     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            r8.A03 = r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            goto L_0x0074
        L_0x0072:
            r1 = r6
            goto L_0x0069
        L_0x0074:
            if (r1 == 0) goto L_0x007e
            X.2tL r0 = (X.C58342tL) r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            r8.A03 = r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
        L_0x007e:
            r8.A01 = r4     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            goto L_0x0030
        L_0x0081:
            int r0 = r8.A01     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            if (r0 != r3) goto L_0x0098
            java.lang.Object r0 = r8.A03     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.2tN r0 = (X.C58362tN) r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.3dW r1 = (X.C68493dW) r1     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
        L_0x008f:
            X.2tN r0 = X.C58362tN.A03     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.1Wo r0 = X.C28541Wm.A0H(r10, r11, r0)     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            r8.A03 = r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            goto L_0x009a
        L_0x0098:
            r1 = r6
            goto L_0x008f
        L_0x009a:
            if (r1 == 0) goto L_0x00a4
            X.2tN r0 = (X.C58362tN) r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            r8.A03 = r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
        L_0x00a4:
            r8.A01 = r3     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            goto L_0x0030
        L_0x00a7:
            int r0 = r8.A01     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            if (r0 != r2) goto L_0x00be
            java.lang.Object r0 = r8.A03     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.2tM r0 = (X.C58352tM) r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.3dV r1 = (X.C68483dV) r1     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
        L_0x00b5:
            X.2tM r0 = X.C58352tM.A03     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.1Wo r0 = X.C28541Wm.A0H(r10, r11, r0)     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            r8.A03 = r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            goto L_0x00c0
        L_0x00be:
            r1 = r6
            goto L_0x00b5
        L_0x00c0:
            if (r1 == 0) goto L_0x00ca
            X.2tM r0 = (X.C58352tM) r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            r8.A03 = r0     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
        L_0x00ca:
            r8.A01 = r2     // Catch:{ 1bD -> 0x00d3, IOException -> 0x00d1 }
            goto L_0x0030
        L_0x00ce:
            X.2tg r0 = A04
            return r0
        L_0x00d1:
            r0 = move-exception
            goto L_0x00d9
        L_0x00d3:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C28541Wm.A0J(r0, r8)     // Catch:{ all -> 0x00de }
            goto L_0x00dd
        L_0x00d9:
            java.lang.RuntimeException r0 = X.C28541Wm.A0K(r8, r0)     // Catch:{ all -> 0x00de }
        L_0x00dd:
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            throw r0
        L_0x00e0:
            X.2L6 r10 = (X.AnonymousClass2L6) r10
            X.2tg r11 = (X.C58552tg) r11
            int r0 = r8.A00
            r1 = 8
            r0 = r0 & 8
            boolean r7 = X.AnonymousClass000.A1R(r0, r1)
            int r6 = r8.A02
            int r0 = r11.A00
            r0 = r0 & 8
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            int r0 = r11.A02
            int r0 = r10.Ahq(r6, r0, r7, r1)
            r8.A02 = r0
            int r0 = r11.A01
            if (r0 == 0) goto L_0x0150
            if (r0 == r2) goto L_0x014d
            if (r0 == r3) goto L_0x014a
            if (r0 == r4) goto L_0x0147
            r0 = 0
        L_0x010b:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0132;
                case 1: goto L_0x012d;
                case 2: goto L_0x0137;
                case 3: goto L_0x0124;
                default: goto L_0x0112;
            }
        L_0x0112:
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r10 != r0) goto L_0x0123
            int r0 = r11.A01
            if (r0 == 0) goto L_0x011c
            r8.A01 = r0
        L_0x011c:
            int r1 = r8.A00
            int r0 = r11.A00
            r1 = r1 | r0
            r8.A00 = r1
        L_0x0123:
            return r8
        L_0x0124:
            int r0 = r8.A01
            if (r0 == 0) goto L_0x0129
            r5 = 1
        L_0x0129:
            r10.Ahx(r5)
            goto L_0x0112
        L_0x012d:
            int r0 = r8.A01
            if (r0 != r3) goto L_0x013c
            goto L_0x013b
        L_0x0132:
            int r0 = r8.A01
            if (r0 != r2) goto L_0x013c
            goto L_0x013b
        L_0x0137:
            int r0 = r8.A01
            if (r0 != r4) goto L_0x013c
        L_0x013b:
            r5 = 1
        L_0x013c:
            java.lang.Object r1 = r8.A03
            java.lang.Object r0 = r11.A03
            java.lang.Object r0 = r10.Ahw(r1, r0, r5)
            r8.A03 = r0
            goto L_0x0112
        L_0x0147:
            X.42b r0 = X.C799742b.A01
            goto L_0x010b
        L_0x014a:
            X.42b r0 = X.C799742b.A04
            goto L_0x010b
        L_0x014d:
            X.42b r0 = X.C799742b.A03
            goto L_0x010b
        L_0x0150:
            X.42b r0 = X.C799742b.A02
            goto L_0x010b
        L_0x0153:
            X.3dT r0 = new X.3dT
            r0.<init>()
            return r0
        L_0x0159:
            return r6
        L_0x015a:
            X.2tg r0 = A04
            return r0
        L_0x015d:
            X.2tg r0 = new X.2tg
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58552tg.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (this.A01 == 1) {
            i3 = C28541Wm.A06((C28551Wn) this.A03, 1, 0);
        }
        if (this.A01 == 2) {
            i3 = C28541Wm.A06((C28551Wn) this.A03, 2, i3);
        }
        if (this.A01 == 3) {
            i3 = C28541Wm.A06((C28551Wn) this.A03, 3, i3);
        }
        if ((this.A00 & 8) == 8) {
            i3 = C28541Wm.A00(4, this.A02, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if (this.A01 == 1) {
            C28541Wm.A0O(codedOutputStream, this.A03, 1);
        }
        if (this.A01 == 2) {
            C28541Wm.A0O(codedOutputStream, this.A03, 2);
        }
        if (this.A01 == 3) {
            C28541Wm.A0O(codedOutputStream, this.A03, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0A(4, this.A02);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
