package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2to  reason: invalid class name and case insensitive filesystem */
public final class C58632to extends C28541Wm implements C28561Wp {
    public static final C58632to A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01 = 0;
    public Object A02;
    public String A03 = "";

    static {
        C58632to r0 = new C58632to();
        A04 = r0;
        r0.A0W();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00fa, code lost:
        if (r7.A01 == 2) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ff, code lost:
        if (r7.A01 == 3) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0101, code lost:
        r4 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r7 = this;
            int r0 = r8.ordinal()
            r5 = 0
            r4 = 0
            r3 = 3
            r2 = 2
            switch(r0) {
                case 0: goto L_0x011d;
                case 1: goto L_0x00b3;
                case 2: goto L_0x002b;
                case 3: goto L_0x011c;
                case 4: goto L_0x0120;
                case 5: goto L_0x0116;
                case 6: goto L_0x00a1;
                case 7: goto L_0x0010;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0010:
            X.2Kz r0 = A05
            if (r0 != 0) goto L_0x0028
            java.lang.Class<X.2to> r1 = X.C58632to.class
            monitor-enter(r1)
            X.2Kz r0 = A05     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0023
            X.2to r0 = A04     // Catch:{ all -> 0x0025 }
            X.2Kz r0 = X.C28541Wm.A09(r0)     // Catch:{ all -> 0x0025 }
            A05 = r0     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            goto L_0x0028
        L_0x0025:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            throw r0
        L_0x0028:
            X.2Kz r0 = A05
            return r0
        L_0x002b:
            X.2Kx r9 = (X.C47852Kx) r9
            X.2Ky r10 = (X.C47862Ky) r10
        L_0x002f:
            int r1 = r9.A03()     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            if (r1 == 0) goto L_0x00a1
            r0 = 10
            if (r1 == r0) goto L_0x0094
            r0 = 18
            if (r1 == r0) goto L_0x006e
            r0 = 26
            if (r1 == r0) goto L_0x0048
            boolean r0 = r7.A0a(r9, r1)     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            if (r0 != 0) goto L_0x002f
            goto L_0x00a1
        L_0x0048:
            int r0 = r7.A01     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            if (r0 != r3) goto L_0x005f
            java.lang.Object r0 = r7.A02     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            X.2tS r0 = (X.C58412tS) r0     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            X.3dx r1 = (X.C68763dx) r1     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
        L_0x0056:
            X.2tS r0 = X.C58412tS.A03     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            X.1Wo r0 = X.C28541Wm.A0H(r9, r10, r0)     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            r7.A02 = r0     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            goto L_0x0061
        L_0x005f:
            r1 = r5
            goto L_0x0056
        L_0x0061:
            if (r1 == 0) goto L_0x006b
            X.2tS r0 = (X.C58412tS) r0     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            r7.A02 = r0     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
        L_0x006b:
            r7.A01 = r3     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            goto L_0x002f
        L_0x006e:
            int r0 = r7.A01     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            if (r0 != r2) goto L_0x0085
            java.lang.Object r0 = r7.A02     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            X.2tR r0 = (X.C58402tR) r0     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            X.3dw r1 = (X.C68753dw) r1     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
        L_0x007c:
            X.2tR r0 = X.C58402tR.A03     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            X.1Wo r0 = X.C28541Wm.A0H(r9, r10, r0)     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            r7.A02 = r0     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            goto L_0x0087
        L_0x0085:
            r1 = r5
            goto L_0x007c
        L_0x0087:
            if (r1 == 0) goto L_0x0091
            X.2tR r0 = (X.C58402tR) r0     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            r7.A02 = r0     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
        L_0x0091:
            r7.A01 = r2     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            goto L_0x002f
        L_0x0094:
            java.lang.String r1 = r9.A0A()     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            int r0 = r7.A00     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            r0 = r0 | 1
            r7.A00 = r0     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            r7.A03 = r1     // Catch:{ 1bD -> 0x00a6, IOException -> 0x00a4 }
            goto L_0x002f
        L_0x00a1:
            X.2to r0 = A04
            return r0
        L_0x00a4:
            r0 = move-exception
            goto L_0x00ac
        L_0x00a6:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C28541Wm.A0J(r0, r7)     // Catch:{ all -> 0x00b1 }
            goto L_0x00b0
        L_0x00ac:
            java.lang.RuntimeException r0 = X.C28541Wm.A0K(r7, r0)     // Catch:{ all -> 0x00b1 }
        L_0x00b0:
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            throw r0
        L_0x00b3:
            X.2L6 r9 = (X.AnonymousClass2L6) r9
            X.2to r10 = (X.C58632to) r10
            int r0 = r7.A00
            boolean r6 = X.C28541Wm.A0T(r0)
            java.lang.String r5 = r7.A03
            int r0 = r10.A00
            boolean r1 = X.C28541Wm.A0T(r0)
            java.lang.String r0 = r10.A03
            java.lang.String r0 = r9.Ahz(r5, r0, r6, r1)
            r7.A03 = r0
            int r0 = r10.A01
            if (r0 == 0) goto L_0x0113
            if (r0 == r2) goto L_0x0110
            if (r0 == r3) goto L_0x010d
            r0 = 0
        L_0x00d6:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x00f8;
                case 1: goto L_0x00fd;
                case 2: goto L_0x00ef;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r9 != r0) goto L_0x00ee
            int r0 = r10.A01
            if (r0 == 0) goto L_0x00e7
            r7.A01 = r0
        L_0x00e7:
            int r1 = r7.A00
            int r0 = r10.A00
            r1 = r1 | r0
            r7.A00 = r1
        L_0x00ee:
            return r7
        L_0x00ef:
            int r0 = r7.A01
            if (r0 == 0) goto L_0x00f4
            r4 = 1
        L_0x00f4:
            r9.Ahx(r4)
            goto L_0x00dd
        L_0x00f8:
            int r0 = r7.A01
            if (r0 != r2) goto L_0x0102
            goto L_0x0101
        L_0x00fd:
            int r0 = r7.A01
            if (r0 != r3) goto L_0x0102
        L_0x0101:
            r4 = 1
        L_0x0102:
            java.lang.Object r1 = r7.A02
            java.lang.Object r0 = r10.A02
            java.lang.Object r0 = r9.Ahw(r1, r0, r4)
            r7.A02 = r0
            goto L_0x00dd
        L_0x010d:
            X.42T r0 = X.AnonymousClass42T.A02
            goto L_0x00d6
        L_0x0110:
            X.42T r0 = X.AnonymousClass42T.A01
            goto L_0x00d6
        L_0x0113:
            X.42T r0 = X.AnonymousClass42T.A03
            goto L_0x00d6
        L_0x0116:
            X.3dv r0 = new X.3dv
            r0.<init>()
            return r0
        L_0x011c:
            return r5
        L_0x011d:
            X.2to r0 = A04
            return r0
        L_0x0120:
            X.2to r0 = new X.2to
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58632to.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = C28541Wm.A08(this.A03, 1, 0);
        }
        if (this.A01 == 2) {
            i3 = C28541Wm.A06((C28551Wn) this.A02, 2, i3);
        }
        if (this.A01 == 3) {
            i3 = C28541Wm.A06((C28551Wn) this.A02, 3, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A03);
        }
        if (this.A01 == 2) {
            C28541Wm.A0O(codedOutputStream, this.A02, 2);
        }
        if (this.A01 == 3) {
            C28541Wm.A0O(codedOutputStream, this.A02, 3);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
