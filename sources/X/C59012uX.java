package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2uX  reason: invalid class name and case insensitive filesystem */
public final class C59012uX extends C28541Wm implements C28561Wp {
    public static final C59012uX A06;
    public static volatile C47872Kz A07;
    public int A00;
    public int A01 = 0;
    public AnonymousClass1XE A02 = AnonymousClass2NE.A01;
    public C455029b A03;
    public C455029b A04;
    public Object A05;

    static {
        C59012uX r0 = new C59012uX();
        A06 = r0;
        r0.A0W();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01fa, code lost:
        if (r9.A01 == 4) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01ff, code lost:
        if (r9.A01 == 3) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0204, code lost:
        if (r9.A01 == 2) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0209, code lost:
        if (r9.A01 == 1) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x020e, code lost:
        if (r9.A01 == 5) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0210, code lost:
        r7 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = this;
            int r0 = r10.ordinal()
            r6 = 5
            r5 = 4
            r4 = 3
            r3 = 2
            r7 = 0
            r8 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0229;
                case 1: goto L_0x01ac;
                case 2: goto L_0x002e;
                case 3: goto L_0x0222;
                case 4: goto L_0x022c;
                case 5: goto L_0x021c;
                case 6: goto L_0x019a;
                case 7: goto L_0x0013;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0013:
            X.2Kz r0 = A07
            if (r0 != 0) goto L_0x002b
            java.lang.Class<X.2uX> r1 = X.C59012uX.class
            monitor-enter(r1)
            X.2Kz r0 = A07     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            X.2uX r0 = A06     // Catch:{ all -> 0x0028 }
            X.2Kz r0 = X.C28541Wm.A09(r0)     // Catch:{ all -> 0x0028 }
            A07 = r0     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            X.2Kz r0 = A07
            return r0
        L_0x002e:
            X.2Kx r11 = (X.C47852Kx) r11
            X.2Ky r12 = (X.C47862Ky) r12
        L_0x0032:
            int r1 = r11.A03()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            if (r1 == 0) goto L_0x019a
            r0 = 10
            if (r1 == r0) goto L_0x0173
            r0 = 18
            if (r1 == r0) goto L_0x014c
            r0 = 26
            if (r1 == r0) goto L_0x0125
            r0 = 34
            if (r1 == r0) goto L_0x00fe
            r0 = 42
            if (r1 == r0) goto L_0x00d7
            r0 = 50
            if (r1 == r0) goto L_0x009b
            r0 = 58
            if (r1 == r0) goto L_0x007b
            r0 = 66
            if (r1 == r0) goto L_0x0060
            boolean r0 = r9.A0a(r11, r1)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            if (r0 != 0) goto L_0x0032
            goto L_0x019a
        L_0x0060:
            X.1XE r1 = r9.A02     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            boolean r0 = r0.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            if (r0 != 0) goto L_0x006f
            X.1XE r1 = X.C28541Wm.A0G(r1)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A02 = r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x006f:
            X.2u0 r0 = X.AnonymousClass2u0.A04     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r11, r12, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2u0 r0 = (X.AnonymousClass2u0) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r1.add(r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0032
        L_0x007b:
            int r0 = r9.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x0096
            X.29b r0 = r9.A04     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.3du r1 = (X.C68733du) r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x008b:
            X.29b r0 = X.C455029b.A0A     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r11, r12, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.29b r0 = (X.C455029b) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A04 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0098
        L_0x0096:
            r1 = r8
            goto L_0x008b
        L_0x0098:
            if (r1 == 0) goto L_0x00cf
            goto L_0x00c7
        L_0x009b:
            int r0 = r9.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r1 = 32
            r0 = r0 & 32
            if (r0 != r1) goto L_0x00b6
            X.29b r0 = r9.A03     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.3du r1 = (X.C68733du) r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x00ab:
            X.29b r0 = X.C455029b.A0A     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r11, r12, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.29b r0 = (X.C455029b) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A03 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x00b8
        L_0x00b6:
            r1 = r8
            goto L_0x00ab
        L_0x00b8:
            if (r1 == 0) goto L_0x00c2
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.29b r0 = (X.C455029b) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A03 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x00c2:
            int r0 = r9.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 | 32
            goto L_0x00d3
        L_0x00c7:
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.29b r0 = (X.C455029b) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A04 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x00cf:
            int r0 = r9.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 | 64
        L_0x00d3:
            r9.A00 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0032
        L_0x00d7:
            int r0 = r9.A01     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            if (r0 != r6) goto L_0x00ee
            java.lang.Object r0 = r9.A05     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2uT r0 = (X.C58982uT) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.3eM r1 = (X.C69013eM) r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x00e5:
            X.2uT r0 = X.C58982uT.A0D     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r11, r12, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A05 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x00f0
        L_0x00ee:
            r1 = r8
            goto L_0x00e5
        L_0x00f0:
            if (r1 == 0) goto L_0x00fa
            X.2uT r0 = (X.C58982uT) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A05 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x00fa:
            r9.A01 = r6     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0032
        L_0x00fe:
            int r0 = r9.A01     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            if (r0 != r5) goto L_0x0115
            java.lang.Object r0 = r9.A05     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.24n r0 = (X.C445524n) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.3fI r1 = (X.C69593fI) r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x010c:
            X.24n r0 = X.C445524n.A0O     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r11, r12, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A05 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0117
        L_0x0115:
            r1 = r8
            goto L_0x010c
        L_0x0117:
            if (r1 == 0) goto L_0x0121
            X.24n r0 = (X.C445524n) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A05 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x0121:
            r9.A01 = r5     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0032
        L_0x0125:
            int r0 = r9.A01     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            if (r0 != r4) goto L_0x013c
            java.lang.Object r0 = r9.A05     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.24k r0 = (X.C445224k) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.3e1 r1 = (X.C68803e1) r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x0133:
            X.24k r0 = X.C445224k.A0R     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r11, r12, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A05 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x013e
        L_0x013c:
            r1 = r8
            goto L_0x0133
        L_0x013e:
            if (r1 == 0) goto L_0x0148
            X.24k r0 = (X.C445224k) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A05 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x0148:
            r9.A01 = r4     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0032
        L_0x014c:
            int r0 = r9.A01     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            if (r0 != r3) goto L_0x0163
            java.lang.Object r0 = r9.A05     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.29b r0 = (X.C455029b) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.3du r1 = (X.C68733du) r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x015a:
            X.29b r0 = X.C455029b.A0A     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r11, r12, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A05 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0165
        L_0x0163:
            r1 = r8
            goto L_0x015a
        L_0x0165:
            if (r1 == 0) goto L_0x016f
            X.29b r0 = (X.C455029b) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A05 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x016f:
            r9.A01 = r3     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0032
        L_0x0173:
            int r0 = r9.A01     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            if (r0 != r2) goto L_0x018a
            java.lang.Object r0 = r9.A05     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.24l r0 = (X.C445324l) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.3dr r1 = (X.C68703dr) r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x0181:
            X.24l r0 = X.C445324l.A0L     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r11, r12, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A05 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x018c
        L_0x018a:
            r1 = r8
            goto L_0x0181
        L_0x018c:
            if (r1 == 0) goto L_0x0196
            X.24l r0 = (X.C445324l) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r9.A05 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x0196:
            r9.A01 = r2     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0032
        L_0x019a:
            X.2uX r0 = A06
            return r0
        L_0x019d:
            r0 = move-exception
            goto L_0x01a5
        L_0x019f:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C28541Wm.A0J(r0, r9)     // Catch:{ all -> 0x01aa }
            goto L_0x01a9
        L_0x01a5:
            java.lang.RuntimeException r0 = X.C28541Wm.A0K(r9, r0)     // Catch:{ all -> 0x01aa }
        L_0x01a9:
            throw r0     // Catch:{ all -> 0x01aa }
        L_0x01aa:
            r0 = move-exception
            throw r0
        L_0x01ac:
            X.2L6 r11 = (X.AnonymousClass2L6) r11
            X.2uX r12 = (X.C59012uX) r12
            X.29b r1 = r9.A03
            X.29b r0 = r12.A03
            X.1Wo r0 = r11.Ahu(r1, r0)
            X.29b r0 = (X.C455029b) r0
            r9.A03 = r0
            X.29b r1 = r9.A04
            X.29b r0 = r12.A04
            X.1Wo r0 = r11.Ahu(r1, r0)
            X.29b r0 = (X.C455029b) r0
            r9.A04 = r0
            X.1XE r1 = r9.A02
            X.1XE r0 = r12.A02
            X.1XE r0 = r11.Ahs(r1, r0)
            r9.A02 = r0
            X.42k r0 = r12.A0c()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0207;
                case 1: goto L_0x0202;
                case 2: goto L_0x01fd;
                case 3: goto L_0x01f8;
                case 4: goto L_0x020c;
                case 5: goto L_0x01ef;
                default: goto L_0x01dd;
            }
        L_0x01dd:
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r11 != r0) goto L_0x01ee
            int r0 = r12.A01
            if (r0 == 0) goto L_0x01e7
            r9.A01 = r0
        L_0x01e7:
            int r1 = r9.A00
            int r0 = r12.A00
            r1 = r1 | r0
            r9.A00 = r1
        L_0x01ee:
            return r9
        L_0x01ef:
            int r0 = r9.A01
            if (r0 == 0) goto L_0x01f4
            r7 = 1
        L_0x01f4:
            r11.Ahx(r7)
            goto L_0x01dd
        L_0x01f8:
            int r0 = r9.A01
            if (r0 != r5) goto L_0x0211
            goto L_0x0210
        L_0x01fd:
            int r0 = r9.A01
            if (r0 != r4) goto L_0x0211
            goto L_0x0210
        L_0x0202:
            int r0 = r9.A01
            if (r0 != r3) goto L_0x0211
            goto L_0x0210
        L_0x0207:
            int r0 = r9.A01
            if (r0 != r2) goto L_0x0211
            goto L_0x0210
        L_0x020c:
            int r0 = r9.A01
            if (r0 != r6) goto L_0x0211
        L_0x0210:
            r7 = 1
        L_0x0211:
            java.lang.Object r1 = r9.A05
            java.lang.Object r0 = r12.A05
            java.lang.Object r0 = r11.Ahw(r1, r0, r7)
            r9.A05 = r0
            goto L_0x01dd
        L_0x021c:
            X.3ef r0 = new X.3ef
            r0.<init>()
            return r0
        L_0x0222:
            X.1XE r0 = r9.A02
            X.1XF r0 = (X.AnonymousClass1XF) r0
            r0.A00 = r7
            return r8
        L_0x0229:
            X.2uX r0 = A06
            return r0
        L_0x022c:
            X.2uX r0 = new X.2uX
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59012uX.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public C800642k A0c() {
        int i2 = this.A01;
        if (i2 == 0) {
            return C800642k.A05;
        }
        if (i2 == 1) {
            return C800642k.A01;
        }
        if (i2 == 2) {
            return C800642k.A02;
        }
        if (i2 == 3) {
            return C800642k.A03;
        }
        if (i2 == 4) {
            return C800642k.A06;
        }
        if (i2 != 5) {
            return null;
        }
        return C800642k.A04;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A052 = this.A01 == 1 ? CodedOutputStream.A05((C28551Wn) this.A05, 1) : 0;
        if (this.A01 == 2) {
            A052 = C28541Wm.A06((C28551Wn) this.A05, 2, A052);
        }
        if (this.A01 == 3) {
            A052 = C28541Wm.A06((C28551Wn) this.A05, 3, A052);
        }
        if (this.A01 == 4) {
            A052 = C28541Wm.A06((C28551Wn) this.A05, 4, A052);
        }
        if (this.A01 == 5) {
            A052 = C28541Wm.A06((C28551Wn) this.A05, 5, A052);
        }
        if ((this.A00 & 32) == 32) {
            C455029b r0 = this.A03;
            if (r0 == null) {
                r0 = C455029b.A0A;
            }
            A052 = C28541Wm.A06(r0, 6, A052);
        }
        if ((this.A00 & 64) == 64) {
            C455029b r02 = this.A04;
            if (r02 == null) {
                r02 = C455029b.A0A;
            }
            A052 = C28541Wm.A06(r02, 7, A052);
        }
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            A052 = C28541Wm.A06((AnonymousClass1Wo) this.A02.get(i3), 8, A052);
        }
        return C28541Wm.A05(this, A052);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if (this.A01 == 1) {
            C28541Wm.A0O(codedOutputStream, this.A05, 1);
        }
        if (this.A01 == 2) {
            C28541Wm.A0O(codedOutputStream, this.A05, 2);
        }
        if (this.A01 == 3) {
            C28541Wm.A0O(codedOutputStream, this.A05, 3);
        }
        if (this.A01 == 4) {
            C28541Wm.A0O(codedOutputStream, this.A05, 4);
        }
        if (this.A01 == 5) {
            C28541Wm.A0O(codedOutputStream, this.A05, 5);
        }
        if ((this.A00 & 32) == 32) {
            C455029b r0 = this.A03;
            if (r0 == null) {
                r0 = C455029b.A0A;
            }
            codedOutputStream.A0G(r0, 6);
        }
        if ((this.A00 & 64) == 64) {
            C455029b r02 = this.A04;
            if (r02 == null) {
                r02 = C455029b.A0A;
            }
            codedOutputStream.A0G(r02, 7);
        }
        int i2 = 0;
        while (i2 < this.A02.size()) {
            i2 = C28541Wm.A04(codedOutputStream, this.A02, i2, 8);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
