package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2tS  reason: invalid class name and case insensitive filesystem */
public final class C58412tS extends C28541Wm implements C28561Wp {
    public static final C58412tS A03;
    public static volatile C47872Kz A04;
    public int A00;
    public int A01 = 0;
    public Object A02;

    static {
        C58412tS r0 = new C58412tS();
        A03 = r0;
        r0.A0W();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d3, code lost:
        if (r6.A01 == 1) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d8, code lost:
        if (r6.A01 == 2) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00da, code lost:
        r4 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r6 = this;
            int r0 = r7.ordinal()
            r5 = 0
            r4 = 0
            r3 = 2
            r2 = 1
            switch(r0) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00a2;
                case 2: goto L_0x002b;
                case 3: goto L_0x00f5;
                case 4: goto L_0x00f9;
                case 5: goto L_0x00ef;
                case 6: goto L_0x0090;
                case 7: goto L_0x0010;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0010:
            X.2Kz r0 = A04
            if (r0 != 0) goto L_0x0028
            java.lang.Class<X.2tS> r1 = X.C58412tS.class
            monitor-enter(r1)
            X.2Kz r0 = A04     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0023
            X.2tS r0 = A03     // Catch:{ all -> 0x0025 }
            X.2Kz r0 = X.C28541Wm.A09(r0)     // Catch:{ all -> 0x0025 }
            A04 = r0     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            goto L_0x0028
        L_0x0025:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            throw r0
        L_0x0028:
            X.2Kz r0 = A04
            return r0
        L_0x002b:
            X.2Kx r8 = (X.C47852Kx) r8
            X.2Ky r9 = (X.C47862Ky) r9
        L_0x002f:
            int r1 = r8.A03()     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            if (r1 == 0) goto L_0x0090
            r0 = 10
            if (r1 == r0) goto L_0x006a
            r0 = 18
            if (r1 == r0) goto L_0x0044
            boolean r0 = r6.A0a(r8, r1)     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            if (r0 != 0) goto L_0x002f
            goto L_0x0090
        L_0x0044:
            int r0 = r6.A01     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            if (r0 != r3) goto L_0x005b
            java.lang.Object r0 = r6.A02     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            X.2t5 r0 = (X.C58182t5) r0     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            X.3dz r1 = (X.C68783dz) r1     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
        L_0x0052:
            X.2t5 r0 = X.C58182t5.A02     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            X.1Wo r0 = X.C28541Wm.A0H(r8, r9, r0)     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            r6.A02 = r0     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            goto L_0x005d
        L_0x005b:
            r1 = r5
            goto L_0x0052
        L_0x005d:
            if (r1 == 0) goto L_0x0067
            X.2t5 r0 = (X.C58182t5) r0     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            r6.A02 = r0     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
        L_0x0067:
            r6.A01 = r3     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            goto L_0x002f
        L_0x006a:
            int r0 = r6.A01     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            if (r0 != r2) goto L_0x0081
            java.lang.Object r0 = r6.A02     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            X.2uH r0 = (X.C58862uH) r0     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            X.3dy r1 = (X.C68773dy) r1     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
        L_0x0078:
            X.2uH r0 = X.C58862uH.A08     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            X.1Wo r0 = X.C28541Wm.A0H(r8, r9, r0)     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            r6.A02 = r0     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            goto L_0x0083
        L_0x0081:
            r1 = r5
            goto L_0x0078
        L_0x0083:
            if (r1 == 0) goto L_0x008d
            X.2uH r0 = (X.C58862uH) r0     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            r6.A02 = r0     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
        L_0x008d:
            r6.A01 = r2     // Catch:{ 1bD -> 0x0095, IOException -> 0x0093 }
            goto L_0x002f
        L_0x0090:
            X.2tS r0 = A03
            return r0
        L_0x0093:
            r0 = move-exception
            goto L_0x009b
        L_0x0095:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C28541Wm.A0J(r0, r6)     // Catch:{ all -> 0x00a0 }
            goto L_0x009f
        L_0x009b:
            java.lang.RuntimeException r0 = X.C28541Wm.A0K(r6, r0)     // Catch:{ all -> 0x00a0 }
        L_0x009f:
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            throw r0
        L_0x00a2:
            X.2L6 r8 = (X.AnonymousClass2L6) r8
            X.2tS r9 = (X.C58412tS) r9
            int r0 = r9.A01
            if (r0 == 0) goto L_0x00ec
            if (r0 == r2) goto L_0x00e9
            if (r0 == r3) goto L_0x00e6
            r0 = 0
        L_0x00af:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x00d1;
                case 1: goto L_0x00d6;
                case 2: goto L_0x00c8;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r8 != r0) goto L_0x00c7
            int r0 = r9.A01
            if (r0 == 0) goto L_0x00c0
            r6.A01 = r0
        L_0x00c0:
            int r1 = r6.A00
            int r0 = r9.A00
            r1 = r1 | r0
            r6.A00 = r1
        L_0x00c7:
            return r6
        L_0x00c8:
            int r0 = r6.A01
            if (r0 == 0) goto L_0x00cd
            r4 = 1
        L_0x00cd:
            r8.Ahx(r4)
            goto L_0x00b6
        L_0x00d1:
            int r0 = r6.A01
            if (r0 != r2) goto L_0x00db
            goto L_0x00da
        L_0x00d6:
            int r0 = r6.A01
            if (r0 != r3) goto L_0x00db
        L_0x00da:
            r4 = 1
        L_0x00db:
            java.lang.Object r1 = r6.A02
            java.lang.Object r0 = r9.A02
            java.lang.Object r0 = r8.Ahw(r1, r0, r4)
            r6.A02 = r0
            goto L_0x00b6
        L_0x00e6:
            X.42S r0 = X.AnonymousClass42S.A03
            goto L_0x00af
        L_0x00e9:
            X.42S r0 = X.AnonymousClass42S.A01
            goto L_0x00af
        L_0x00ec:
            X.42S r0 = X.AnonymousClass42S.A02
            goto L_0x00af
        L_0x00ef:
            X.3dx r0 = new X.3dx
            r0.<init>()
            return r0
        L_0x00f5:
            return r5
        L_0x00f6:
            X.2tS r0 = A03
            return r0
        L_0x00f9:
            X.2tS r0 = new X.2tS
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58412tS.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (this.A01 == 1) {
            i3 = C28541Wm.A06((C28551Wn) this.A02, 1, 0);
        }
        if (this.A01 == 2) {
            i3 = C28541Wm.A06((C28551Wn) this.A02, 2, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if (this.A01 == 1) {
            C28541Wm.A0O(codedOutputStream, this.A02, 1);
        }
        if (this.A01 == 2) {
            C28541Wm.A0O(codedOutputStream, this.A02, 2);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
