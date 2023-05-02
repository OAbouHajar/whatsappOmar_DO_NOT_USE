package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2uG  reason: invalid class name and case insensitive filesystem */
public final class C58852uG extends C28541Wm implements C28561Wp {
    public static final C58852uG A08;
    public static volatile C47872Kz A09;
    public int A00;
    public int A01 = 0;
    public int A02;
    public AnonymousClass1XE A03 = AnonymousClass2NE.A01;
    public AnonymousClass21S A04;
    public Object A05;
    public String A06 = "";
    public String A07 = "";

    static {
        C58852uG r0 = new C58852uG();
        A08 = r0;
        r0.A0W();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f8, code lost:
        if (r0 == 0) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01fa, code lost:
        r12.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01fc, code lost:
        r12.A00 |= r15.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0203, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x020f, code lost:
        if (r12.A01 == 4) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0214, code lost:
        if (r12.A01 == 3) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0219, code lost:
        if (r12.A01 == 2) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x022c, code lost:
        if (r12.A01 == 5) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x022e, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x022f, code lost:
        r0 = r14.Ahw(r12.A05, r15.A05, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0237, code lost:
        r12.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f4, code lost:
        if (r14 != X.AnonymousClass2L7.A00) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f6, code lost:
        r0 = r15.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.ordinal()
            r6 = 5
            r5 = 4
            r4 = 3
            r3 = 2
            r8 = 0
            r7 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0259;
                case 1: goto L_0x0174;
                case 2: goto L_0x002e;
                case 3: goto L_0x0252;
                case 4: goto L_0x025c;
                case 5: goto L_0x024c;
                case 6: goto L_0x0162;
                case 7: goto L_0x0013;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0013:
            X.2Kz r0 = A09
            if (r0 != 0) goto L_0x002b
            java.lang.Class<X.2uG> r1 = X.C58852uG.class
            monitor-enter(r1)
            X.2Kz r0 = A09     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            X.2uG r0 = A08     // Catch:{ all -> 0x0028 }
            X.2Kz r0 = X.C28541Wm.A09(r0)     // Catch:{ all -> 0x0028 }
            A09 = r0     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            X.2Kz r0 = A09
            return r0
        L_0x002e:
            X.2Kx r14 = (X.C47852Kx) r14
            X.2Ky r15 = (X.C47862Ky) r15
        L_0x0032:
            int r0 = r14.A03()     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            switch(r0) {
                case 0: goto L_0x0162;
                case 10: goto L_0x005a;
                case 18: goto L_0x0063;
                case 26: goto L_0x0089;
                case 34: goto L_0x00af;
                case 42: goto L_0x00d6;
                case 50: goto L_0x00fd;
                case 58: goto L_0x010b;
                case 66: goto L_0x0119;
                case 74: goto L_0x0146;
                case 80: goto L_0x0041;
                default: goto L_0x0039;
            }     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
        L_0x0039:
            boolean r0 = r12.A0a(r14, r0)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            if (r0 != 0) goto L_0x0032
            goto L_0x0162
        L_0x0041:
            int r1 = r14.A02()     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.438 r0 = X.AnonymousClass438.A00(r1)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            if (r0 != 0) goto L_0x0051
            r0 = 10
            super.A0X(r0, r1)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x0032
        L_0x0051:
            int r0 = r12.A00     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r0 = r0 | 256(0x100, float:3.59E-43)
            r12.A00 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A02 = r1     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x0032
        L_0x005a:
            java.lang.String r0 = r14.A0A()     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A01 = r2     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A05 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x0032
        L_0x0063:
            int r0 = r12.A01     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            if (r0 != r3) goto L_0x007a
            java.lang.Object r0 = r12.A05     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.24l r0 = (X.C445324l) r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.3dr r1 = (X.C68703dr) r1     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
        L_0x0071:
            X.24l r0 = X.C445324l.A0L     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wo r0 = X.C28541Wm.A0H(r14, r15, r0)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A05 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x007c
        L_0x007a:
            r1 = r8
            goto L_0x0071
        L_0x007c:
            if (r1 == 0) goto L_0x0086
            X.24l r0 = (X.C445324l) r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A05 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
        L_0x0086:
            r12.A01 = r3     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x0032
        L_0x0089:
            int r0 = r12.A01     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            if (r0 != r4) goto L_0x00a0
            java.lang.Object r0 = r12.A05     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.24k r0 = (X.C445224k) r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.3e1 r1 = (X.C68803e1) r1     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
        L_0x0097:
            X.24k r0 = X.C445224k.A0R     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wo r0 = X.C28541Wm.A0H(r14, r15, r0)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A05 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x00a2
        L_0x00a0:
            r1 = r8
            goto L_0x0097
        L_0x00a2:
            if (r1 == 0) goto L_0x00ac
            X.24k r0 = (X.C445224k) r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A05 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
        L_0x00ac:
            r12.A01 = r4     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x0032
        L_0x00af:
            int r0 = r12.A01     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            if (r0 != r5) goto L_0x00c6
            java.lang.Object r0 = r12.A05     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.24n r0 = (X.C445524n) r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.3fI r1 = (X.C69593fI) r1     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
        L_0x00bd:
            X.24n r0 = X.C445524n.A0O     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wo r0 = X.C28541Wm.A0H(r14, r15, r0)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A05 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x00c8
        L_0x00c6:
            r1 = r8
            goto L_0x00bd
        L_0x00c8:
            if (r1 == 0) goto L_0x00d2
            X.24n r0 = (X.C445524n) r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A05 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
        L_0x00d2:
            r12.A01 = r5     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x0032
        L_0x00d6:
            int r0 = r12.A01     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            if (r0 != r6) goto L_0x00ed
            java.lang.Object r0 = r12.A05     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.2uT r0 = (X.C58982uT) r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.3eM r1 = (X.C69013eM) r1     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
        L_0x00e4:
            X.2uT r0 = X.C58982uT.A0D     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wo r0 = X.C28541Wm.A0H(r14, r15, r0)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A05 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x00ef
        L_0x00ed:
            r1 = r8
            goto L_0x00e4
        L_0x00ef:
            if (r1 == 0) goto L_0x00f9
            X.2uT r0 = (X.C58982uT) r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A05 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
        L_0x00f9:
            r12.A01 = r6     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x0032
        L_0x00fd:
            java.lang.String r1 = r14.A0A()     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            int r0 = r12.A00     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r0 = r0 | 32
            r12.A00 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A06 = r1     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x0032
        L_0x010b:
            java.lang.String r1 = r14.A0A()     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            int r0 = r12.A00     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r0 = r0 | 64
            r12.A00 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A07 = r1     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x0032
        L_0x0119:
            int r0 = r12.A00     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r7 = 128(0x80, float:1.794E-43)
            r0 = r0 & r7
            if (r0 != r7) goto L_0x0133
            X.21S r0 = r12.A04     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.21T r1 = (X.AnonymousClass21T) r1     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
        L_0x0128:
            X.21S r0 = X.AnonymousClass21S.A0R     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wo r0 = X.C28541Wm.A0H(r14, r15, r0)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.21S r0 = (X.AnonymousClass21S) r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A04 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x0135
        L_0x0133:
            r1 = r8
            goto L_0x0128
        L_0x0135:
            if (r1 == 0) goto L_0x013f
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.21S r0 = (X.AnonymousClass21S) r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A04 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
        L_0x013f:
            int r0 = r12.A00     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r0 = r0 | r7
            r12.A00 = r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x0032
        L_0x0146:
            X.1XE r1 = r12.A03     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            boolean r0 = r0.A00     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            if (r0 != 0) goto L_0x0155
            X.1XE r1 = X.C28541Wm.A0G(r1)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r12.A03 = r1     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
        L_0x0155:
            X.2u3 r0 = X.AnonymousClass2u3.A05     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.1Wo r0 = X.C28541Wm.A0H(r14, r15, r0)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            X.2u3 r0 = (X.AnonymousClass2u3) r0     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            r1.add(r0)     // Catch:{ 1bD -> 0x0167, IOException -> 0x0165 }
            goto L_0x0032
        L_0x0162:
            X.2uG r0 = A08
            return r0
        L_0x0165:
            r0 = move-exception
            goto L_0x016d
        L_0x0167:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C28541Wm.A0J(r0, r12)     // Catch:{ all -> 0x0172 }
            goto L_0x0171
        L_0x016d:
            java.lang.RuntimeException r0 = X.C28541Wm.A0K(r12, r0)     // Catch:{ all -> 0x0172 }
        L_0x0171:
            throw r0     // Catch:{ all -> 0x0172 }
        L_0x0172:
            r0 = move-exception
            throw r0
        L_0x0174:
            X.2L6 r14 = (X.AnonymousClass2L6) r14
            X.2uG r15 = (X.C58852uG) r15
            int r8 = r12.A00
            r1 = 32
            r0 = r8 & 32
            boolean r11 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r9 = r12.A06
            int r10 = r15.A00
            r0 = r10 & 32
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r0 = r15.A06
            java.lang.String r0 = r14.Ahz(r9, r0, r11, r1)
            r12.A06 = r0
            r1 = 64
            r0 = r8 & 64
            boolean r9 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r8 = r12.A07
            r0 = r10 & 64
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            java.lang.String r0 = r15.A07
            java.lang.String r0 = r14.Ahz(r8, r0, r9, r1)
            r12.A07 = r0
            X.21S r1 = r12.A04
            X.21S r0 = r15.A04
            X.1Wo r0 = r14.Ahu(r1, r0)
            X.21S r0 = (X.AnonymousClass21S) r0
            r12.A04 = r0
            X.1XE r1 = r12.A03
            X.1XE r0 = r15.A03
            X.1XE r0 = r14.Ahs(r1, r0)
            r12.A03 = r0
            int r0 = r12.A00
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            boolean r9 = X.AnonymousClass000.A1R(r0, r1)
            int r8 = r12.A02
            int r0 = r15.A00
            r0 = r0 & r1
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            int r0 = r15.A02
            int r0 = r14.Ahq(r8, r0, r9, r1)
            r12.A02 = r0
            int r0 = r15.A01
            if (r0 == 0) goto L_0x0249
            if (r0 == r2) goto L_0x0246
            if (r0 == r3) goto L_0x0243
            if (r0 == r4) goto L_0x0240
            if (r0 == r5) goto L_0x023d
            if (r0 == r6) goto L_0x023a
            r0 = 0
        L_0x01eb:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x021c;
                case 1: goto L_0x0217;
                case 2: goto L_0x0212;
                case 3: goto L_0x020d;
                case 4: goto L_0x022a;
                case 5: goto L_0x0204;
                default: goto L_0x01f2;
            }
        L_0x01f2:
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r14 != r0) goto L_0x0203
            int r0 = r15.A01
            if (r0 == 0) goto L_0x01fc
            r12.A01 = r0
        L_0x01fc:
            int r1 = r12.A00
            int r0 = r15.A00
            r1 = r1 | r0
            r12.A00 = r1
        L_0x0203:
            return r12
        L_0x0204:
            int r0 = r12.A01
            if (r0 == 0) goto L_0x0209
            r7 = 1
        L_0x0209:
            r14.Ahx(r7)
            goto L_0x01f2
        L_0x020d:
            int r0 = r12.A01
            if (r0 != r5) goto L_0x022f
            goto L_0x022e
        L_0x0212:
            int r0 = r12.A01
            if (r0 != r4) goto L_0x022f
            goto L_0x022e
        L_0x0217:
            int r0 = r12.A01
            if (r0 != r3) goto L_0x022f
            goto L_0x022e
        L_0x021c:
            int r0 = r12.A01
            if (r0 != r2) goto L_0x0221
            r7 = 1
        L_0x0221:
            java.lang.Object r1 = r12.A05
            java.lang.Object r0 = r15.A05
            java.lang.Object r0 = r14.Ahy(r1, r0, r7)
            goto L_0x0237
        L_0x022a:
            int r0 = r12.A01
            if (r0 != r6) goto L_0x022f
        L_0x022e:
            r7 = 1
        L_0x022f:
            java.lang.Object r1 = r12.A05
            java.lang.Object r0 = r15.A05
            java.lang.Object r0 = r14.Ahw(r1, r0, r7)
        L_0x0237:
            r12.A05 = r0
            goto L_0x01f2
        L_0x023a:
            X.42j r0 = X.C800542j.A04
            goto L_0x01eb
        L_0x023d:
            X.42j r0 = X.C800542j.A06
            goto L_0x01eb
        L_0x0240:
            X.42j r0 = X.C800542j.A03
            goto L_0x01eb
        L_0x0243:
            X.42j r0 = X.C800542j.A01
            goto L_0x01eb
        L_0x0246:
            X.42j r0 = X.C800542j.A05
            goto L_0x01eb
        L_0x0249:
            X.42j r0 = X.C800542j.A02
            goto L_0x01eb
        L_0x024c:
            X.3f9 r0 = new X.3f9
            r0.<init>()
            return r0
        L_0x0252:
            X.1XE r0 = r12.A03
            X.1XF r0 = (X.AnonymousClass1XF) r0
            r0.A00 = r7
            return r8
        L_0x0259:
            X.2uG r0 = A08
            return r0
        L_0x025c:
            X.2uG r0 = new X.2uG
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58852uG.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A062 = this.A01 == 1 ? 1 + CodedOutputStream.A06((String) this.A05) : 0;
        if (this.A01 == 2) {
            A062 = C28541Wm.A06((C28551Wn) this.A05, 2, A062);
        }
        if (this.A01 == 3) {
            A062 = C28541Wm.A06((C28551Wn) this.A05, 3, A062);
        }
        if (this.A01 == 4) {
            A062 = C28541Wm.A06((C28551Wn) this.A05, 4, A062);
        }
        if (this.A01 == 5) {
            A062 = C28541Wm.A06((C28551Wn) this.A05, 5, A062);
        }
        if ((this.A00 & 32) == 32) {
            A062 = C28541Wm.A07(this.A06, A062);
        }
        if ((this.A00 & 64) == 64) {
            A062 = C28541Wm.A07(this.A07, A062);
        }
        if ((this.A00 & 128) == 128) {
            AnonymousClass21S r0 = this.A04;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            A062 = C28541Wm.A06(r0, 8, A062);
        }
        for (int i3 = 0; i3 < this.A03.size(); i3++) {
            A062 = C28541Wm.A06((AnonymousClass1Wo) this.A03.get(i3), 9, A062);
        }
        if ((this.A00 & 256) == 256) {
            A062 = C28541Wm.A01(10, this.A02, A062);
        }
        return C28541Wm.A05(this, A062);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if (this.A01 == 1) {
            codedOutputStream.A0D(1, (String) this.A05);
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
            codedOutputStream.A0D(6, this.A06);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0D(7, this.A07);
        }
        if ((this.A00 & 128) == 128) {
            AnonymousClass21S r0 = this.A04;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 8);
        }
        int i2 = 0;
        while (i2 < this.A03.size()) {
            i2 = C28541Wm.A04(codedOutputStream, this.A03, i2, 9);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A09(10, this.A02);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
