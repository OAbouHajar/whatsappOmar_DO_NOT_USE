package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1mt  reason: invalid class name and case insensitive filesystem */
public final class C36031mt extends C28541Wm implements C28561Wp {
    public static final C36031mt A0E;
    public static volatile C47872Kz A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C28631Ww A05;
    public C28631Ww A06;
    public C28631Ww A07;
    public C28631Ww A08;
    public AnonymousClass1XE A09 = AnonymousClass2NE.A01;
    public AnonymousClass2L8 A0A;
    public C58882uJ A0B;
    public C36621nq A0C;
    public boolean A0D;

    static {
        C36031mt r0 = new C36031mt();
        A0E = r0;
        r0.A0W();
    }

    public C36031mt() {
        C28631Ww r1 = C28631Ww.A01;
        this.A06 = r1;
        this.A07 = r1;
        this.A08 = r1;
        this.A05 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0128, code lost:
        r7.A00 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r7 = this;
            int r0 = r8.ordinal()
            r3 = 0
            switch(r0) {
                case 0: goto L_0x02d0;
                case 1: goto L_0x0192;
                case 2: goto L_0x002a;
                case 3: goto L_0x02c8;
                case 4: goto L_0x02d3;
                case 5: goto L_0x02c2;
                case 6: goto L_0x0172;
                case 7: goto L_0x000e;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x000e:
            X.2Kz r0 = A0F
            if (r0 != 0) goto L_0x0027
            java.lang.Class<X.1mt> r2 = X.C36031mt.class
            monitor-enter(r2)
            X.2Kz r0 = A0F     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            X.1mt r1 = A0E     // Catch:{ all -> 0x0024 }
            X.2Kz r0 = new X.2Kz     // Catch:{ all -> 0x0024 }
            r0.<init>(r1)     // Catch:{ all -> 0x0024 }
            A0F = r0     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            goto L_0x0027
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            throw r0
        L_0x0027:
            X.2Kz r0 = A0F
            return r0
        L_0x002a:
            X.2Kx r9 = (X.C47852Kx) r9
            X.2Ky r10 = (X.C47862Ky) r10
        L_0x002e:
            int r0 = r9.A03()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            switch(r0) {
                case 0: goto L_0x0172;
                case 8: goto L_0x0164;
                case 18: goto L_0x0156;
                case 26: goto L_0x0148;
                case 34: goto L_0x013a;
                case 40: goto L_0x012c;
                case 50: goto L_0x00f6;
                case 58: goto L_0x00d6;
                case 66: goto L_0x00a3;
                case 74: goto L_0x0071;
                case 80: goto L_0x0064;
                case 88: goto L_0x0057;
                case 96: goto L_0x004a;
                case 106: goto L_0x003d;
                default: goto L_0x0035;
            }     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
        L_0x0035:
            boolean r0 = r7.A0a(r9, r0)     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            if (r0 != 0) goto L_0x002e
            goto L_0x0172
        L_0x003d:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r7.A00 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Ww r0 = r9.A08()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A05 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x002e
        L_0x004a:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r7.A00 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            boolean r0 = r9.A0F()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A0D = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x002e
        L_0x0057:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r0 = r0 | 512(0x200, float:7.175E-43)
            r7.A00 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            int r0 = r9.A02()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A01 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x002e
        L_0x0064:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r0 = r0 | 256(0x100, float:3.59E-43)
            r7.A00 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            int r0 = r9.A02()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A03 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x002e
        L_0x0071:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r2 = 128(0x80, float:1.794E-43)
            r0 = r0 & r2
            if (r0 != r2) goto L_0x008f
            X.1nq r0 = r7.A0C     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1nr r1 = (X.C36631nr) r1     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
        L_0x0080:
            X.1nq r0 = X.C36621nq.A04     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Wo r0 = r9.A09(r10, r0)     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1nq r0 = (X.C36621nq) r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A0C = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x0091
        L_0x008f:
            r1 = r3
            goto L_0x0080
        L_0x0091:
            if (r1 == 0) goto L_0x009e
            r1.A04(r0)     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1nq r0 = (X.C36621nq) r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A0C = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
        L_0x009e:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r0 = r0 | r2
            goto L_0x0128
        L_0x00a3:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x00c2
            X.2uJ r0 = r7.A0B     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.3f8 r1 = (X.C69493f8) r1     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
        L_0x00b3:
            X.2uJ r0 = X.C58882uJ.A08     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Wo r0 = r9.A09(r10, r0)     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.2uJ r0 = (X.C58882uJ) r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A0B = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x00c4
        L_0x00c2:
            r1 = r3
            goto L_0x00b3
        L_0x00c4:
            if (r1 == 0) goto L_0x00d1
            r1.A04(r0)     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.2uJ r0 = (X.C58882uJ) r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A0B = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
        L_0x00d1:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r0 = r0 | 64
            goto L_0x0128
        L_0x00d6:
            X.1XE r1 = r7.A09     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            boolean r0 = r0.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            if (r0 != 0) goto L_0x00e5
            X.1XE r1 = X.C28541Wm.A0G(r1)     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A09 = r1     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
        L_0x00e5:
            X.2L8 r0 = X.AnonymousClass2L8.A05     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Wo r0 = r9.A09(r10, r0)     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.2L8 r0 = (X.AnonymousClass2L8) r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r1.add(r0)     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x002e
        L_0x00f6:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r1 = 32
            r0 = r0 & 32
            if (r0 != r1) goto L_0x0115
            X.2L8 r0 = r7.A0A     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.2LC r1 = (X.AnonymousClass2LC) r1     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
        L_0x0106:
            X.2L8 r0 = X.AnonymousClass2L8.A05     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Wo r0 = r9.A09(r10, r0)     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.2L8 r0 = (X.AnonymousClass2L8) r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A0A = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x0117
        L_0x0115:
            r1 = r3
            goto L_0x0106
        L_0x0117:
            if (r1 == 0) goto L_0x0124
            r1.A04(r0)     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.2L8 r0 = (X.AnonymousClass2L8) r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A0A = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
        L_0x0124:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r0 = r0 | 32
        L_0x0128:
            r7.A00 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x002e
        L_0x012c:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r0 = r0 | 16
            r7.A00 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            int r0 = r9.A02()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A02 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x002e
        L_0x013a:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r0 = r0 | 8
            r7.A00 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Ww r0 = r9.A08()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A08 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x002e
        L_0x0148:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r0 = r0 | 4
            r7.A00 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Ww r0 = r9.A08()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A07 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x002e
        L_0x0156:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r0 = r0 | 2
            r7.A00 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            X.1Ww r0 = r9.A08()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A06 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x002e
        L_0x0164:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r0 = r0 | 1
            r7.A00 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            int r0 = r9.A02()     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            r7.A04 = r0     // Catch:{ 1bD -> 0x0187, IOException -> 0x0175 }
            goto L_0x002e
        L_0x0172:
            X.1mt r0 = A0E
            return r0
        L_0x0175:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0190 }
            X.1bD r0 = new X.1bD     // Catch:{ all -> 0x0190 }
            r0.<init>(r1)     // Catch:{ all -> 0x0190 }
            r0.unfinishedMessage = r7     // Catch:{ all -> 0x0190 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0190 }
            r1.<init>(r0)     // Catch:{ all -> 0x0190 }
            goto L_0x018f
        L_0x0187:
            r0 = move-exception
            r0.unfinishedMessage = r7     // Catch:{ all -> 0x0190 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0190 }
            r1.<init>(r0)     // Catch:{ all -> 0x0190 }
        L_0x018f:
            throw r1     // Catch:{ all -> 0x0190 }
        L_0x0190:
            r0 = move-exception
            throw r0
        L_0x0192:
            X.2L6 r9 = (X.AnonymousClass2L6) r9
            X.1mt r10 = (X.C36031mt) r10
            int r5 = r7.A00
            r4 = 1
            r0 = r5 & 1
            if (r0 == r4) goto L_0x019e
            r4 = 0
        L_0x019e:
            int r3 = r7.A04
            int r2 = r10.A00
            r1 = 1
            r0 = r2 & 1
            if (r0 == r1) goto L_0x01a8
            r1 = 0
        L_0x01a8:
            int r0 = r10.A04
            int r0 = r9.Ahq(r3, r0, r4, r1)
            r7.A04 = r0
            r1 = 2
            r0 = r5 & 2
            r4 = 0
            if (r0 != r1) goto L_0x01b7
            r4 = 1
        L_0x01b7:
            X.1Ww r3 = r7.A06
            r2 = r2 & 2
            r0 = 2
            r1 = 0
            if (r2 != r0) goto L_0x01c0
            r1 = 1
        L_0x01c0:
            X.1Ww r0 = r10.A06
            X.1Ww r0 = r9.Ahn(r3, r0, r4, r1)
            r7.A06 = r0
            int r0 = r7.A00
            r1 = 4
            r0 = r0 & 4
            r4 = 0
            if (r0 != r1) goto L_0x01d1
            r4 = 1
        L_0x01d1:
            X.1Ww r3 = r7.A07
            int r0 = r10.A00
            r2 = r0 & 4
            r0 = 4
            r1 = 0
            if (r2 != r0) goto L_0x01dc
            r1 = 1
        L_0x01dc:
            X.1Ww r0 = r10.A07
            X.1Ww r0 = r9.Ahn(r3, r0, r4, r1)
            r7.A07 = r0
            int r0 = r7.A00
            r1 = 8
            r0 = r0 & 8
            r4 = 0
            if (r0 != r1) goto L_0x01ee
            r4 = 1
        L_0x01ee:
            X.1Ww r3 = r7.A08
            int r0 = r10.A00
            r2 = r0 & 8
            r0 = 8
            r1 = 0
            if (r2 != r0) goto L_0x01fa
            r1 = 1
        L_0x01fa:
            X.1Ww r0 = r10.A08
            X.1Ww r0 = r9.Ahn(r3, r0, r4, r1)
            r7.A08 = r0
            int r0 = r7.A00
            r1 = 16
            r0 = r0 & 16
            r4 = 0
            if (r0 != r1) goto L_0x020c
            r4 = 1
        L_0x020c:
            int r3 = r7.A02
            int r0 = r10.A00
            r2 = r0 & 16
            r0 = 16
            r1 = 0
            if (r2 != r0) goto L_0x0218
            r1 = 1
        L_0x0218:
            int r0 = r10.A02
            int r0 = r9.Ahq(r3, r0, r4, r1)
            r7.A02 = r0
            X.2L8 r1 = r7.A0A
            X.2L8 r0 = r10.A0A
            X.1Wo r0 = r9.Ahu(r1, r0)
            X.2L8 r0 = (X.AnonymousClass2L8) r0
            r7.A0A = r0
            X.1XE r1 = r7.A09
            X.1XE r0 = r10.A09
            X.1XE r0 = r9.Ahs(r1, r0)
            r7.A09 = r0
            X.2uJ r1 = r7.A0B
            X.2uJ r0 = r10.A0B
            X.1Wo r0 = r9.Ahu(r1, r0)
            X.2uJ r0 = (X.C58882uJ) r0
            r7.A0B = r0
            X.1nq r1 = r7.A0C
            X.1nq r0 = r10.A0C
            X.1Wo r0 = r9.Ahu(r1, r0)
            X.1nq r0 = (X.C36621nq) r0
            r7.A0C = r0
            int r6 = r7.A00
            r1 = 256(0x100, float:3.59E-43)
            r0 = r6 & r1
            r4 = 0
            if (r0 != r1) goto L_0x0258
            r4 = 1
        L_0x0258:
            int r3 = r7.A03
            int r5 = r10.A00
            r2 = r5 & r1
            r0 = 256(0x100, float:3.59E-43)
            r1 = 0
            if (r2 != r0) goto L_0x0264
            r1 = 1
        L_0x0264:
            int r0 = r10.A03
            int r0 = r9.Ahq(r3, r0, r4, r1)
            r7.A03 = r0
            r1 = 512(0x200, float:7.175E-43)
            r0 = r6 & r1
            r4 = 0
            if (r0 != r1) goto L_0x0274
            r4 = 1
        L_0x0274:
            int r3 = r7.A01
            r2 = r5 & r1
            r0 = 512(0x200, float:7.175E-43)
            r1 = 0
            if (r2 != r0) goto L_0x027e
            r1 = 1
        L_0x027e:
            int r0 = r10.A01
            int r0 = r9.Ahq(r3, r0, r4, r1)
            r7.A01 = r0
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r6 & r1
            r4 = 0
            if (r0 != r1) goto L_0x028e
            r4 = 1
        L_0x028e:
            boolean r3 = r7.A0D
            r2 = r5 & r1
            r0 = 1024(0x400, float:1.435E-42)
            r1 = 0
            if (r2 != r0) goto L_0x0298
            r1 = 1
        L_0x0298:
            boolean r0 = r10.A0D
            boolean r0 = r9.Ahm(r4, r3, r1, r0)
            r7.A0D = r0
            r0 = 2048(0x800, float:2.87E-42)
            r6 = r6 & r0
            r3 = 0
            if (r6 != r0) goto L_0x02a7
            r3 = 1
        L_0x02a7:
            X.1Ww r2 = r7.A05
            r5 = r5 & r0
            r1 = 0
            if (r5 != r0) goto L_0x02ae
            r1 = 1
        L_0x02ae:
            X.1Ww r0 = r10.A05
            X.1Ww r0 = r9.Ahn(r2, r0, r3, r1)
            r7.A05 = r0
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r9 != r0) goto L_0x02c1
            int r1 = r7.A00
            int r0 = r10.A00
            r1 = r1 | r0
            r7.A00 = r1
        L_0x02c1:
            return r7
        L_0x02c2:
            X.1ns r0 = new X.1ns
            r0.<init>()
            return r0
        L_0x02c8:
            X.1XE r1 = r7.A09
            X.1XF r1 = (X.AnonymousClass1XF) r1
            r0 = 0
            r1.A00 = r0
            return r3
        L_0x02d0:
            X.1mt r0 = A0E
            return r0
        L_0x02d3:
            X.1mt r0 = new X.1mt
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36031mt.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        int A022 = (i3 & 1) == 1 ? CodedOutputStream.A02(1, this.A04) : 0;
        if ((i3 & 2) == 2) {
            A022 += CodedOutputStream.A04(this.A06, 2);
        }
        if ((i3 & 4) == 4) {
            A022 += CodedOutputStream.A04(this.A07, 3);
        }
        if ((i3 & 8) == 8) {
            A022 += CodedOutputStream.A04(this.A08, 4);
        }
        if ((i3 & 16) == 16) {
            A022 += CodedOutputStream.A02(5, this.A02);
        }
        if ((i3 & 32) == 32) {
            AnonymousClass2L8 r0 = this.A0A;
            if (r0 == null) {
                r0 = AnonymousClass2L8.A05;
            }
            A022 += CodedOutputStream.A05(r0, 6);
        }
        for (int i4 = 0; i4 < this.A09.size(); i4++) {
            A022 += CodedOutputStream.A05((AnonymousClass1Wo) this.A09.get(i4), 7);
        }
        if ((this.A00 & 64) == 64) {
            C58882uJ r02 = this.A0B;
            if (r02 == null) {
                r02 = C58882uJ.A08;
            }
            A022 += CodedOutputStream.A05(r02, 8);
        }
        if ((this.A00 & 128) == 128) {
            C36621nq r03 = this.A0C;
            if (r03 == null) {
                r03 = C36621nq.A04;
            }
            A022 += CodedOutputStream.A05(r03, 9);
        }
        int i5 = this.A00;
        if ((i5 & 256) == 256) {
            A022 += CodedOutputStream.A02(10, this.A03);
        }
        if ((i5 & 512) == 512) {
            A022 += CodedOutputStream.A02(11, this.A01);
        }
        if ((i5 & 1024) == 1024) {
            A022 += 2;
        }
        if ((i5 & 2048) == 2048) {
            A022 += CodedOutputStream.A04(this.A05, 13);
        }
        int A002 = A022 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A06, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A07, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A08, 4);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0A(5, this.A02);
        }
        if ((this.A00 & 32) == 32) {
            AnonymousClass2L8 r0 = this.A0A;
            if (r0 == null) {
                r0 = AnonymousClass2L8.A05;
            }
            codedOutputStream.A0G(r0, 6);
        }
        for (int i2 = 0; i2 < this.A09.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A09.get(i2), 7);
        }
        if ((this.A00 & 64) == 64) {
            C58882uJ r02 = this.A0B;
            if (r02 == null) {
                r02 = C58882uJ.A08;
            }
            codedOutputStream.A0G(r02, 8);
        }
        if ((this.A00 & 128) == 128) {
            C36621nq r03 = this.A0C;
            if (r03 == null) {
                r03 = C36621nq.A04;
            }
            codedOutputStream.A0G(r03, 9);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0A(10, this.A03);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A0A(11, this.A01);
        }
        if ((this.A00 & 1024) == 1024) {
            codedOutputStream.A0E(12, this.A0D);
        }
        if ((this.A00 & 2048) == 2048) {
            codedOutputStream.A0F(this.A05, 13);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
