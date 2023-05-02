package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2uZ  reason: invalid class name and case insensitive filesystem */
public final class C59032uZ extends C28541Wm implements C28561Wp {
    public static final C59032uZ A07;
    public static volatile C47872Kz A08;
    public int A00;
    public int A01 = 0;
    public AnonymousClass1XE A02 = AnonymousClass2NE.A01;
    public Object A03;
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";

    static {
        C59032uZ r0 = new C59032uZ();
        A07 = r0;
        r0.A0W();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01cd, code lost:
        r12.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cf, code lost:
        r12.A00 |= r15.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d6, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01e2, code lost:
        if (r12.A01 == 4) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01e7, code lost:
        if (r12.A01 == 3) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01fa, code lost:
        if (r12.A01 == 1) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01ff, code lost:
        if (r12.A01 == 5) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0201, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0202, code lost:
        r0 = r14.Ahw(r12.A03, r15.A03, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x020a, code lost:
        r12.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c7, code lost:
        if (r14 != X.AnonymousClass2L7.A00) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c9, code lost:
        r0 = r15.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01cb, code lost:
        if (r0 == 0) goto L_0x01cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.ordinal()
            r6 = 2
            r5 = 5
            r4 = 4
            r3 = 3
            r8 = 0
            r7 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x021a;
                case 1: goto L_0x015e;
                case 2: goto L_0x002e;
                case 3: goto L_0x0213;
                case 4: goto L_0x021d;
                case 5: goto L_0x020d;
                case 6: goto L_0x014c;
                case 7: goto L_0x0013;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0013:
            X.2Kz r0 = A08
            if (r0 != 0) goto L_0x002b
            java.lang.Class<X.2uZ> r1 = X.C59032uZ.class
            monitor-enter(r1)
            X.2Kz r0 = A08     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            X.2uZ r0 = A07     // Catch:{ all -> 0x0028 }
            X.2Kz r0 = X.C28541Wm.A09(r0)     // Catch:{ all -> 0x0028 }
            A08 = r0     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            X.2Kz r0 = A08
            return r0
        L_0x002e:
            X.2Kx r14 = (X.C47852Kx) r14
            X.2Ky r15 = (X.C47862Ky) r15
        L_0x0032:
            int r1 = r14.A03()     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            if (r1 == 0) goto L_0x014c
            r0 = 10
            if (r1 == r0) goto L_0x0125
            r0 = 18
            if (r1 == r0) goto L_0x011b
            r0 = 26
            if (r1 == r0) goto L_0x00f4
            r0 = 34
            if (r1 == r0) goto L_0x00cd
            r0 = 42
            if (r1 == r0) goto L_0x00a6
            r0 = 50
            if (r1 == r0) goto L_0x0099
            r0 = 58
            if (r1 == r0) goto L_0x008c
            r0 = 66
            if (r1 == r0) goto L_0x0071
            r0 = 74
            if (r1 == r0) goto L_0x0064
            boolean r0 = r12.A0a(r14, r1)     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            if (r0 != 0) goto L_0x0032
            goto L_0x014c
        L_0x0064:
            java.lang.String r1 = r14.A0A()     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            int r0 = r12.A00     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r12.A00 = r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A06 = r1     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            goto L_0x0032
        L_0x0071:
            X.1XE r1 = r12.A02     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            boolean r0 = r0.A00     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            if (r0 != 0) goto L_0x0080
            X.1XE r1 = X.C28541Wm.A0G(r1)     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A02 = r1     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
        L_0x0080:
            X.2tg r0 = X.C58552tg.A04     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.1Wo r0 = X.C28541Wm.A0H(r14, r15, r0)     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.2tg r0 = (X.C58552tg) r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r1.add(r0)     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            goto L_0x0032
        L_0x008c:
            java.lang.String r1 = r14.A0A()     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            int r0 = r12.A00     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r0 = r0 | 64
            r12.A00 = r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A05 = r1     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            goto L_0x0032
        L_0x0099:
            java.lang.String r1 = r14.A0A()     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            int r0 = r12.A00     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r0 = r0 | 32
            r12.A00 = r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A04 = r1     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            goto L_0x0032
        L_0x00a6:
            int r0 = r12.A01     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            if (r0 != r5) goto L_0x00bd
            java.lang.Object r0 = r12.A03     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.2uT r0 = (X.C58982uT) r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.3eM r1 = (X.C69013eM) r1     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
        L_0x00b4:
            X.2uT r0 = X.C58982uT.A0D     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.1Wo r0 = X.C28541Wm.A0H(r14, r15, r0)     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A03 = r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            goto L_0x00bf
        L_0x00bd:
            r1 = r8
            goto L_0x00b4
        L_0x00bf:
            if (r1 == 0) goto L_0x00c9
            X.2uT r0 = (X.C58982uT) r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A03 = r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
        L_0x00c9:
            r12.A01 = r5     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            goto L_0x0032
        L_0x00cd:
            int r0 = r12.A01     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            if (r0 != r4) goto L_0x00e4
            java.lang.Object r0 = r12.A03     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.24n r0 = (X.C445524n) r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.3fI r1 = (X.C69593fI) r1     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
        L_0x00db:
            X.24n r0 = X.C445524n.A0O     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.1Wo r0 = X.C28541Wm.A0H(r14, r15, r0)     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A03 = r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            goto L_0x00e6
        L_0x00e4:
            r1 = r8
            goto L_0x00db
        L_0x00e6:
            if (r1 == 0) goto L_0x00f0
            X.24n r0 = (X.C445524n) r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A03 = r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
        L_0x00f0:
            r12.A01 = r4     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            goto L_0x0032
        L_0x00f4:
            int r0 = r12.A01     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            if (r0 != r3) goto L_0x010b
            java.lang.Object r0 = r12.A03     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.24k r0 = (X.C445224k) r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.3e1 r1 = (X.C68803e1) r1     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
        L_0x0102:
            X.24k r0 = X.C445224k.A0R     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.1Wo r0 = X.C28541Wm.A0H(r14, r15, r0)     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A03 = r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            goto L_0x010d
        L_0x010b:
            r1 = r8
            goto L_0x0102
        L_0x010d:
            if (r1 == 0) goto L_0x0117
            X.24k r0 = (X.C445224k) r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A03 = r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
        L_0x0117:
            r12.A01 = r3     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            goto L_0x0032
        L_0x011b:
            java.lang.String r0 = r14.A0A()     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A01 = r6     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A03 = r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            goto L_0x0032
        L_0x0125:
            int r0 = r12.A01     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            if (r0 != r2) goto L_0x013c
            java.lang.Object r0 = r12.A03     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.24l r0 = (X.C445324l) r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.3dr r1 = (X.C68703dr) r1     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
        L_0x0133:
            X.24l r0 = X.C445324l.A0L     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.1Wo r0 = X.C28541Wm.A0H(r14, r15, r0)     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A03 = r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            goto L_0x013e
        L_0x013c:
            r1 = r8
            goto L_0x0133
        L_0x013e:
            if (r1 == 0) goto L_0x0148
            X.24l r0 = (X.C445324l) r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            r12.A03 = r0     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
        L_0x0148:
            r12.A01 = r2     // Catch:{ 1bD -> 0x0151, IOException -> 0x014f }
            goto L_0x0032
        L_0x014c:
            X.2uZ r0 = A07
            return r0
        L_0x014f:
            r0 = move-exception
            goto L_0x0157
        L_0x0151:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C28541Wm.A0J(r0, r12)     // Catch:{ all -> 0x015c }
            goto L_0x015b
        L_0x0157:
            java.lang.RuntimeException r0 = X.C28541Wm.A0K(r12, r0)     // Catch:{ all -> 0x015c }
        L_0x015b:
            throw r0     // Catch:{ all -> 0x015c }
        L_0x015c:
            r0 = move-exception
            throw r0
        L_0x015e:
            X.2L6 r14 = (X.AnonymousClass2L6) r14
            X.2uZ r15 = (X.C59032uZ) r15
            int r8 = r12.A00
            r1 = 32
            r0 = r8 & 32
            boolean r11 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r9 = r12.A04
            int r10 = r15.A00
            r0 = r10 & 32
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r0 = r15.A04
            java.lang.String r0 = r14.Ahz(r9, r0, r11, r1)
            r12.A04 = r0
            r1 = 64
            r0 = r8 & 64
            boolean r9 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r8 = r12.A05
            r0 = r10 & 64
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r0 = r15.A05
            java.lang.String r0 = r14.Ahz(r8, r0, r9, r1)
            r12.A05 = r0
            X.1XE r1 = r12.A02
            X.1XE r0 = r15.A02
            X.1XE r0 = r14.Ahs(r1, r0)
            r12.A02 = r0
            int r0 = r12.A00
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            boolean r9 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r8 = r12.A06
            int r0 = r15.A00
            r0 = r0 & r1
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r0 = r15.A06
            java.lang.String r0 = r14.Ahz(r8, r0, r9, r1)
            r12.A06 = r0
            X.42l r0 = r15.A0c()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x01f8;
                case 1: goto L_0x01ea;
                case 2: goto L_0x01e5;
                case 3: goto L_0x01e0;
                case 4: goto L_0x01fd;
                case 5: goto L_0x01d7;
                default: goto L_0x01c5;
            }
        L_0x01c5:
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r14 != r0) goto L_0x01d6
            int r0 = r15.A01
            if (r0 == 0) goto L_0x01cf
            r12.A01 = r0
        L_0x01cf:
            int r1 = r12.A00
            int r0 = r15.A00
            r1 = r1 | r0
            r12.A00 = r1
        L_0x01d6:
            return r12
        L_0x01d7:
            int r0 = r12.A01
            if (r0 == 0) goto L_0x01dc
            r7 = 1
        L_0x01dc:
            r14.Ahx(r7)
            goto L_0x01c5
        L_0x01e0:
            int r0 = r12.A01
            if (r0 != r4) goto L_0x0202
            goto L_0x0201
        L_0x01e5:
            int r0 = r12.A01
            if (r0 != r3) goto L_0x0202
            goto L_0x0201
        L_0x01ea:
            int r0 = r12.A01
            if (r0 != r6) goto L_0x01ef
            r7 = 1
        L_0x01ef:
            java.lang.Object r1 = r12.A03
            java.lang.Object r0 = r15.A03
            java.lang.Object r0 = r14.Ahy(r1, r0, r7)
            goto L_0x020a
        L_0x01f8:
            int r0 = r12.A01
            if (r0 != r2) goto L_0x0202
            goto L_0x0201
        L_0x01fd:
            int r0 = r12.A01
            if (r0 != r5) goto L_0x0202
        L_0x0201:
            r7 = 1
        L_0x0202:
            java.lang.Object r1 = r12.A03
            java.lang.Object r0 = r15.A03
            java.lang.Object r0 = r14.Ahw(r1, r0, r7)
        L_0x020a:
            r12.A03 = r0
            goto L_0x01c5
        L_0x020d:
            X.3fH r0 = new X.3fH
            r0.<init>()
            return r0
        L_0x0213:
            X.1XE r0 = r12.A02
            X.1XF r0 = (X.AnonymousClass1XF) r0
            r0.A00 = r7
            return r8
        L_0x021a:
            X.2uZ r0 = A07
            return r0
        L_0x021d:
            X.2uZ r0 = new X.2uZ
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59032uZ.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public C800742l A0c() {
        int i2 = this.A01;
        if (i2 == 0) {
            return C800742l.A05;
        }
        if (i2 == 1) {
            return C800742l.A01;
        }
        if (i2 == 2) {
            return C800742l.A02;
        }
        if (i2 == 3) {
            return C800742l.A03;
        }
        if (i2 == 4) {
            return C800742l.A06;
        }
        if (i2 != 5) {
            return null;
        }
        return C800742l.A04;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A052 = this.A01 == 1 ? CodedOutputStream.A05((C28551Wn) this.A03, 1) : 0;
        if (this.A01 == 2) {
            A052 = C28541Wm.A07((String) this.A03, A052);
        }
        if (this.A01 == 3) {
            A052 = C28541Wm.A06((C28551Wn) this.A03, 3, A052);
        }
        if (this.A01 == 4) {
            A052 = C28541Wm.A06((C28551Wn) this.A03, 4, A052);
        }
        if (this.A01 == 5) {
            A052 = C28541Wm.A06((C28551Wn) this.A03, 5, A052);
        }
        if ((this.A00 & 32) == 32) {
            A052 = C28541Wm.A07(this.A04, A052);
        }
        if ((this.A00 & 64) == 64) {
            A052 = C28541Wm.A07(this.A05, A052);
        }
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            A052 = C28541Wm.A06((AnonymousClass1Wo) this.A02.get(i3), 8, A052);
        }
        if ((this.A00 & 128) == 128) {
            A052 = C28541Wm.A07(this.A06, A052);
        }
        return C28541Wm.A05(this, A052);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if (this.A01 == 1) {
            C28541Wm.A0O(codedOutputStream, this.A03, 1);
        }
        if (this.A01 == 2) {
            codedOutputStream.A0D(2, (String) this.A03);
        }
        if (this.A01 == 3) {
            C28541Wm.A0O(codedOutputStream, this.A03, 3);
        }
        if (this.A01 == 4) {
            C28541Wm.A0O(codedOutputStream, this.A03, 4);
        }
        if (this.A01 == 5) {
            C28541Wm.A0O(codedOutputStream, this.A03, 5);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0D(6, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0D(7, this.A05);
        }
        int i2 = 0;
        while (i2 < this.A02.size()) {
            i2 = C28541Wm.A04(codedOutputStream, this.A02, i2, 8);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0D(9, this.A06);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
