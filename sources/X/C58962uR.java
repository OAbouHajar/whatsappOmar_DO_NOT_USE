package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2uR  reason: invalid class name and case insensitive filesystem */
public final class C58962uR extends C28541Wm implements C28561Wp {
    public static final C58962uR A0C;
    public static volatile C47872Kz A0D;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C58792u7 A04;
    public C58792u7 A05;
    public C58792u7 A06;
    public C58512tc A07;
    public C58522td A08;
    public C58522td A09;
    public boolean A0A;
    public boolean A0B;

    static {
        C58962uR r0 = new C58962uR();
        A0C = r0;
        r0.A0W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0196, code lost:
        r14.A00 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r14 = this;
            r3 = r17
            r7 = r16
            int r0 = r15.ordinal()
            r4 = 0
            switch(r0) {
                case 0: goto L_0x0288;
                case 1: goto L_0x01ac;
                case 2: goto L_0x002c;
                case 3: goto L_0x0287;
                case 4: goto L_0x028b;
                case 5: goto L_0x0281;
                case 6: goto L_0x019a;
                case 7: goto L_0x0011;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0011:
            X.2Kz r0 = A0D
            if (r0 != 0) goto L_0x0029
            java.lang.Class<X.2uR> r1 = X.C58962uR.class
            monitor-enter(r1)
            X.2Kz r0 = A0D     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0024
            X.2uR r0 = A0C     // Catch:{ all -> 0x0026 }
            X.2Kz r0 = X.C28541Wm.A09(r0)     // Catch:{ all -> 0x0026 }
            A0D = r0     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            goto L_0x0029
        L_0x0026:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r0
        L_0x0029:
            X.2Kz r0 = A0D
            return r0
        L_0x002c:
            X.2Kx r7 = (X.C47852Kx) r7
            X.2Ky r3 = (X.C47862Ky) r3
        L_0x0030:
            int r0 = r7.A03()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r1 = 1
            switch(r0) {
                case 0: goto L_0x019a;
                case 10: goto L_0x0058;
                case 16: goto L_0x0040;
                case 26: goto L_0x0083;
                case 34: goto L_0x00af;
                case 42: goto L_0x00dc;
                case 50: goto L_0x0109;
                case 56: goto L_0x0135;
                case 64: goto L_0x0143;
                case 72: goto L_0x0151;
                case 80: goto L_0x015f;
                case 90: goto L_0x016d;
                default: goto L_0x0038;
            }     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x0038:
            boolean r0 = r14.A0a(r7, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            if (r0 != 0) goto L_0x0030
            goto L_0x019a
        L_0x0040:
            int r2 = r7.A02()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.430 r1 = X.AnonymousClass430.A00(r2)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = 2
            if (r1 != 0) goto L_0x004f
            super.A0X(r0, r2)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0030
        L_0x004f:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 | 2
            r14.A00 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A02 = r2     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0030
        L_0x0058:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0071
            X.2td r0 = r14.A09     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.3ew r1 = (X.C69373ew) r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x0066:
            X.2td r0 = X.C58522td.A03     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r7, r3, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2td r0 = (X.C58522td) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A09 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0073
        L_0x0071:
            r1 = r4
            goto L_0x0066
        L_0x0073:
            if (r1 == 0) goto L_0x007d
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2td r0 = (X.C58522td) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A09 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x007d:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 | 1
            goto L_0x0196
        L_0x0083:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L_0x009d
            X.2td r0 = r14.A08     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.3ew r1 = (X.C69373ew) r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x0092:
            X.2td r0 = X.C58522td.A03     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r7, r3, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2td r0 = (X.C58522td) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A08 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x009f
        L_0x009d:
            r1 = r4
            goto L_0x0092
        L_0x009f:
            if (r1 == 0) goto L_0x00a9
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2td r0 = (X.C58522td) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A08 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x00a9:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 | 4
            goto L_0x0196
        L_0x00af:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x00ca
            X.2u7 r0 = r14.A06     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.3eo r1 = (X.C69293eo) r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x00bf:
            X.2u7 r0 = X.C58792u7.A05     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r7, r3, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2u7 r0 = (X.C58792u7) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A06 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x00cc
        L_0x00ca:
            r1 = r4
            goto L_0x00bf
        L_0x00cc:
            if (r1 == 0) goto L_0x00d6
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2u7 r0 = (X.C58792u7) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A06 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x00d6:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 | 8
            goto L_0x0196
        L_0x00dc:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r1 = 16
            r0 = r0 & 16
            if (r0 != r1) goto L_0x00f7
            X.2u7 r0 = r14.A04     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.3eo r1 = (X.C69293eo) r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x00ec:
            X.2u7 r0 = X.C58792u7.A05     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r7, r3, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2u7 r0 = (X.C58792u7) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A04 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x00f9
        L_0x00f7:
            r1 = r4
            goto L_0x00ec
        L_0x00f9:
            if (r1 == 0) goto L_0x0103
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2u7 r0 = (X.C58792u7) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A04 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x0103:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 | 16
            goto L_0x0196
        L_0x0109:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r1 = 32
            r0 = r0 & 32
            if (r0 != r1) goto L_0x0124
            X.2u7 r0 = r14.A05     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.3eo r1 = (X.C69293eo) r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x0119:
            X.2u7 r0 = X.C58792u7.A05     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r7, r3, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2u7 r0 = (X.C58792u7) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A05 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0126
        L_0x0124:
            r1 = r4
            goto L_0x0119
        L_0x0126:
            if (r1 == 0) goto L_0x0130
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2u7 r0 = (X.C58792u7) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A05 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x0130:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 | 32
            goto L_0x0196
        L_0x0135:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 | 64
            r14.A00 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            boolean r0 = r7.A0F()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A0B = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0030
        L_0x0143:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r14.A00 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            boolean r0 = r7.A0F()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A0A = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0030
        L_0x0151:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 | 256(0x100, float:3.59E-43)
            r14.A00 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            int r0 = r7.A02()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A01 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0030
        L_0x015f:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 | 512(0x200, float:7.175E-43)
            r14.A00 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            long r0 = r7.A06()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A03 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0030
        L_0x016d:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r2 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r2
            if (r0 != r2) goto L_0x0187
            X.2tc r0 = r14.A07     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.3ep r1 = (X.C69303ep) r1     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x017c:
            X.2tc r0 = X.C58512tc.A03     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.1Wo r0 = X.C28541Wm.A0H(r7, r3, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2tc r0 = (X.C58512tc) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A07 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0189
        L_0x0187:
            r1 = r4
            goto L_0x017c
        L_0x0189:
            if (r1 == 0) goto L_0x0193
            X.1Wm r0 = X.C28541Wm.A0C(r1, r0)     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            X.2tc r0 = (X.C58512tc) r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r14.A07 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
        L_0x0193:
            int r0 = r14.A00     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            r0 = r0 | r2
        L_0x0196:
            r14.A00 = r0     // Catch:{ 1bD -> 0x019f, IOException -> 0x019d }
            goto L_0x0030
        L_0x019a:
            X.2uR r0 = A0C
            return r0
        L_0x019d:
            r0 = move-exception
            goto L_0x01a5
        L_0x019f:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C28541Wm.A0J(r0, r14)     // Catch:{ all -> 0x01aa }
            goto L_0x01a9
        L_0x01a5:
            java.lang.RuntimeException r0 = X.C28541Wm.A0K(r14, r0)     // Catch:{ all -> 0x01aa }
        L_0x01a9:
            throw r0     // Catch:{ all -> 0x01aa }
        L_0x01aa:
            r0 = move-exception
            throw r0
        L_0x01ac:
            X.2L6 r7 = (X.AnonymousClass2L6) r7
            X.2uR r3 = (X.C58962uR) r3
            X.2td r1 = r14.A09
            X.2td r0 = r3.A09
            X.1Wo r0 = r7.Ahu(r1, r0)
            X.2td r0 = (X.C58522td) r0
            r14.A09 = r0
            int r0 = r14.A00
            r1 = 2
            r0 = r0 & 2
            boolean r4 = X.AnonymousClass000.A1R(r0, r1)
            int r2 = r14.A02
            int r0 = r3.A00
            r0 = r0 & 2
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            int r0 = r3.A02
            int r0 = r7.Ahq(r2, r0, r4, r1)
            r14.A02 = r0
            X.2td r1 = r14.A08
            X.2td r0 = r3.A08
            X.1Wo r0 = r7.Ahu(r1, r0)
            X.2td r0 = (X.C58522td) r0
            r14.A08 = r0
            X.2u7 r1 = r14.A06
            X.2u7 r0 = r3.A06
            X.1Wo r0 = r7.Ahu(r1, r0)
            X.2u7 r0 = (X.C58792u7) r0
            r14.A06 = r0
            X.2u7 r1 = r14.A04
            X.2u7 r0 = r3.A04
            X.1Wo r0 = r7.Ahu(r1, r0)
            X.2u7 r0 = (X.C58792u7) r0
            r14.A04 = r0
            X.2u7 r1 = r14.A05
            X.2u7 r0 = r3.A05
            X.1Wo r0 = r7.Ahu(r1, r0)
            X.2u7 r0 = (X.C58792u7) r0
            r14.A05 = r0
            int r6 = r14.A00
            r1 = 64
            r0 = r6 & 64
            boolean r4 = X.AnonymousClass000.A1R(r0, r1)
            boolean r2 = r14.A0B
            int r5 = r3.A00
            r0 = r5 & 64
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            boolean r0 = r3.A0B
            boolean r0 = r7.Ahm(r4, r2, r1, r0)
            r14.A0B = r0
            r1 = 128(0x80, float:1.794E-43)
            r0 = r6 & r1
            boolean r4 = X.AnonymousClass000.A1R(r0, r1)
            boolean r2 = r14.A0A
            r0 = r5 & r1
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            boolean r0 = r3.A0A
            boolean r0 = r7.Ahm(r4, r2, r1, r0)
            r14.A0A = r0
            r1 = 256(0x100, float:3.59E-43)
            r0 = r6 & r1
            boolean r4 = X.AnonymousClass000.A1R(r0, r1)
            int r2 = r14.A01
            r0 = r5 & r1
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            int r0 = r3.A01
            int r0 = r7.Ahq(r2, r0, r4, r1)
            r14.A01 = r0
            r0 = 512(0x200, float:7.175E-43)
            r6 = r6 & r0
            boolean r12 = X.AnonymousClass000.A1R(r6, r0)
            long r8 = r14.A03
            r5 = r5 & r0
            boolean r13 = X.AnonymousClass000.A1R(r5, r0)
            long r10 = r3.A03
            long r0 = r7.Aht(r8, r10, r12, r13)
            r14.A03 = r0
            X.2tc r1 = r14.A07
            X.2tc r0 = r3.A07
            X.1Wo r0 = r7.Ahu(r1, r0)
            X.2tc r0 = (X.C58512tc) r0
            r14.A07 = r0
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r7 != r0) goto L_0x0280
            int r1 = r14.A00
            int r0 = r3.A00
            r1 = r1 | r0
            r14.A00 = r1
        L_0x0280:
            return r14
        L_0x0281:
            X.3eq r0 = new X.3eq
            r0.<init>()
            return r0
        L_0x0287:
            return r4
        L_0x0288:
            X.2uR r0 = A0C
            return r0
        L_0x028b:
            X.2uR r0 = new X.2uR
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58962uR.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C58522td r0 = this.A09;
            if (r0 == null) {
                r0 = C58522td.A03;
            }
            i3 = C28541Wm.A06(r0, 1, 0);
        }
        int i4 = this.A00;
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A01(2, this.A02, i3);
        }
        if ((i4 & 4) == 4) {
            C58522td r02 = this.A08;
            if (r02 == null) {
                r02 = C58522td.A03;
            }
            i3 = C28541Wm.A06(r02, 3, i3);
        }
        if ((this.A00 & 8) == 8) {
            C58792u7 r03 = this.A06;
            if (r03 == null) {
                r03 = C58792u7.A05;
            }
            i3 = C28541Wm.A06(r03, 4, i3);
        }
        if ((this.A00 & 16) == 16) {
            C58792u7 r04 = this.A04;
            if (r04 == null) {
                r04 = C58792u7.A05;
            }
            i3 = C28541Wm.A06(r04, 5, i3);
        }
        if ((this.A00 & 32) == 32) {
            C58792u7 r05 = this.A05;
            if (r05 == null) {
                r05 = C58792u7.A05;
            }
            i3 = C28541Wm.A06(r05, 6, i3);
        }
        int i5 = this.A00;
        if ((i5 & 64) == 64) {
            i3 += 2;
        }
        if ((i5 & 128) == 128) {
            i3 += 2;
        }
        if ((i5 & 256) == 256) {
            i3 += CodedOutputStream.A01(9, this.A01);
        }
        if ((i5 & 512) == 512) {
            i3 = C28541Wm.A02(i3, this.A03);
        }
        if ((i5 & 1024) == 1024) {
            C58512tc r06 = this.A07;
            if (r06 == null) {
                r06 = C58512tc.A03;
            }
            i3 = C28541Wm.A06(r06, 11, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C58522td r0 = this.A09;
            if (r0 == null) {
                r0 = C58522td.A03;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A09(2, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            C58522td r02 = this.A08;
            if (r02 == null) {
                r02 = C58522td.A03;
            }
            codedOutputStream.A0G(r02, 3);
        }
        if ((this.A00 & 8) == 8) {
            C58792u7 r03 = this.A06;
            if (r03 == null) {
                r03 = C58792u7.A05;
            }
            codedOutputStream.A0G(r03, 4);
        }
        if ((this.A00 & 16) == 16) {
            C58792u7 r04 = this.A04;
            if (r04 == null) {
                r04 = C58792u7.A05;
            }
            codedOutputStream.A0G(r04, 5);
        }
        if ((this.A00 & 32) == 32) {
            C58792u7 r05 = this.A05;
            if (r05 == null) {
                r05 = C58792u7.A05;
            }
            codedOutputStream.A0G(r05, 6);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0E(7, this.A0B);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0E(8, this.A0A);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A09(9, this.A01);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A0C(10, this.A03);
        }
        if ((this.A00 & 1024) == 1024) {
            C58512tc r06 = this.A07;
            if (r06 == null) {
                r06 = C58512tc.A03;
            }
            codedOutputStream.A0G(r06, 11);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
