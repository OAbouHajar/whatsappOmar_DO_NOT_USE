package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2gg  reason: invalid class name and case insensitive filesystem */
public final class C54022gg extends C28541Wm implements C28561Wp {
    public static final C54022gg A0E;
    public static volatile C47872Kz A0F;
    public int A00;
    public int A01;
    public int A02;
    public C48072Lt A03;
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";
    public String A08 = "";
    public String A09 = "";
    public String A0A = "";
    public String A0B = "";
    public String A0C = "";
    public String A0D = "";

    static {
        C54022gg r0 = new C54022gg();
        A0E = r0;
        r0.A0W();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0056, code lost:
        super.A0X(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r7 = this;
            int r0 = r8.ordinal()
            r3 = 0
            switch(r0) {
                case 0: goto L_0x02a4;
                case 1: goto L_0x014b;
                case 2: goto L_0x002a;
                case 3: goto L_0x02a3;
                case 4: goto L_0x02a7;
                case 5: goto L_0x029d;
                case 6: goto L_0x012a;
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
            java.lang.Class<X.2gg> r2 = X.C54022gg.class
            monitor-enter(r2)
            X.2Kz r0 = A0F     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            X.2gg r1 = A0E     // Catch:{ all -> 0x0024 }
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
            int r0 = r9.A03()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r2 = 1
            switch(r0) {
                case 0: goto L_0x012a;
                case 8: goto L_0x004f;
                case 18: goto L_0x006b;
                case 26: goto L_0x009f;
                case 34: goto L_0x00ac;
                case 42: goto L_0x00ba;
                case 50: goto L_0x00c8;
                case 58: goto L_0x00d6;
                case 66: goto L_0x00e4;
                case 74: goto L_0x00f2;
                case 80: goto L_0x003e;
                case 90: goto L_0x0100;
                case 98: goto L_0x010e;
                case 106: goto L_0x011c;
                default: goto L_0x0036;
            }     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
        L_0x0036:
            boolean r0 = r7.A0a(r9, r0)     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            if (r0 != 0) goto L_0x002e
            goto L_0x012a
        L_0x003e:
            int r1 = r9.A02()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            if (r1 == 0) goto L_0x0062
            if (r1 == r2) goto L_0x0062
            r0 = 2
            if (r1 == r0) goto L_0x0062
            r0 = 3
            if (r1 == r0) goto L_0x0062
            r2 = 10
            goto L_0x0056
        L_0x004f:
            int r1 = r9.A02()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            switch(r1) {
                case 0: goto L_0x005a;
                case 1: goto L_0x005a;
                case 2: goto L_0x005a;
                case 3: goto L_0x005a;
                case 4: goto L_0x005a;
                case 5: goto L_0x005a;
                case 6: goto L_0x005a;
                case 7: goto L_0x005a;
                case 8: goto L_0x005a;
                case 9: goto L_0x005a;
                case 10: goto L_0x005a;
                case 11: goto L_0x005a;
                case 12: goto L_0x005a;
                case 13: goto L_0x005a;
                case 14: goto L_0x005a;
                case 15: goto L_0x005a;
                case 16: goto L_0x005a;
                case 17: goto L_0x005a;
                case 18: goto L_0x005a;
                case 19: goto L_0x005a;
                case 20: goto L_0x005a;
                case 21: goto L_0x005a;
                case 22: goto L_0x005a;
                case 23: goto L_0x005a;
                case 24: goto L_0x005a;
                case 25: goto L_0x005a;
                case 26: goto L_0x005a;
                case 27: goto L_0x005a;
                case 28: goto L_0x005a;
                default: goto L_0x0056;
            }     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
        L_0x0056:
            super.A0X(r2, r1)     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x005a:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r2 = r2 | r0
            r7.A00 = r2     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A01 = r1     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x0062:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r0 = r0 | 512(0x200, float:7.175E-43)
            r7.A00 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A02 = r1     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x006b:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x0089
            X.2Lt r0 = r7.A03     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            X.2Lu r1 = (X.C48082Lu) r1     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
        L_0x007a:
            X.2Lt r0 = X.C48072Lt.A06     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            X.1Wo r0 = r9.A09(r10, r0)     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            X.2Lt r0 = (X.C48072Lt) r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A03 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x008b
        L_0x0089:
            r1 = r3
            goto L_0x007a
        L_0x008b:
            if (r1 == 0) goto L_0x0098
            r1.A04(r0)     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            X.2Lt r0 = (X.C48072Lt) r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A03 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
        L_0x0098:
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r0 = r0 | 2
            r7.A00 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x009f:
            java.lang.String r1 = r9.A0A()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r0 = r0 | 4
            r7.A00 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A09 = r1     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x00ac:
            java.lang.String r1 = r9.A0A()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r0 = r0 | 8
            r7.A00 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A0A = r1     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x00ba:
            java.lang.String r1 = r9.A0A()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r0 = r0 | 16
            r7.A00 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A0C = r1     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x00c8:
            java.lang.String r1 = r9.A0A()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r0 = r0 | 32
            r7.A00 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A08 = r1     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x00d6:
            java.lang.String r1 = r9.A0A()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r0 = r0 | 64
            r7.A00 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A05 = r1     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x00e4:
            java.lang.String r1 = r9.A0A()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r7.A00 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A0B = r1     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x00f2:
            java.lang.String r1 = r9.A0A()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r0 = r0 | 256(0x100, float:3.59E-43)
            r7.A00 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A0D = r1     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x0100:
            java.lang.String r1 = r9.A0A()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r7.A00 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A07 = r1     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x010e:
            java.lang.String r1 = r9.A0A()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r7.A00 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A06 = r1     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x011c:
            java.lang.String r1 = r9.A0A()     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            int r0 = r7.A00     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r7.A00 = r0     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            r7.A04 = r1     // Catch:{ 1bD -> 0x012f, IOException -> 0x012d }
            goto L_0x002e
        L_0x012a:
            X.2gg r0 = A0E
            return r0
        L_0x012d:
            r0 = move-exception
            goto L_0x0138
        L_0x012f:
            r0 = move-exception
            r0.unfinishedMessage = r7     // Catch:{ all -> 0x0149 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0149 }
            r1.<init>(r0)     // Catch:{ all -> 0x0149 }
            goto L_0x0148
        L_0x0138:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0149 }
            X.1bD r0 = new X.1bD     // Catch:{ all -> 0x0149 }
            r0.<init>(r1)     // Catch:{ all -> 0x0149 }
            r0.unfinishedMessage = r7     // Catch:{ all -> 0x0149 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0149 }
            r1.<init>(r0)     // Catch:{ all -> 0x0149 }
        L_0x0148:
            throw r1     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r0 = move-exception
            throw r0
        L_0x014b:
            X.2L6 r9 = (X.AnonymousClass2L6) r9
            X.2gg r10 = (X.C54022gg) r10
            int r0 = r7.A00
            r3 = 1
            r0 = r0 & 1
            if (r0 == r3) goto L_0x0157
            r3 = 0
        L_0x0157:
            int r2 = r7.A01
            int r0 = r10.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 == r1) goto L_0x0161
            r1 = 0
        L_0x0161:
            int r0 = r10.A01
            int r0 = r9.Ahq(r2, r0, r3, r1)
            r7.A01 = r0
            X.2Lt r1 = r7.A03
            X.2Lt r0 = r10.A03
            X.1Wo r0 = r9.Ahu(r1, r0)
            X.2Lt r0 = (X.C48072Lt) r0
            r7.A03 = r0
            int r6 = r7.A00
            r1 = 4
            r0 = r6 & 4
            r4 = 0
            if (r0 != r1) goto L_0x017e
            r4 = 1
        L_0x017e:
            java.lang.String r3 = r7.A09
            int r5 = r10.A00
            r2 = r5 & 4
            r0 = 4
            r1 = 0
            if (r2 != r0) goto L_0x0189
            r1 = 1
        L_0x0189:
            java.lang.String r0 = r10.A09
            java.lang.String r0 = r9.Ahz(r3, r0, r4, r1)
            r7.A09 = r0
            r1 = 8
            r0 = r6 & 8
            r4 = 0
            if (r0 != r1) goto L_0x0199
            r4 = 1
        L_0x0199:
            java.lang.String r3 = r7.A0A
            r2 = r5 & 8
            r0 = 8
            r1 = 0
            if (r2 != r0) goto L_0x01a3
            r1 = 1
        L_0x01a3:
            java.lang.String r0 = r10.A0A
            java.lang.String r0 = r9.Ahz(r3, r0, r4, r1)
            r7.A0A = r0
            r1 = 16
            r0 = r6 & 16
            r4 = 0
            if (r0 != r1) goto L_0x01b3
            r4 = 1
        L_0x01b3:
            java.lang.String r3 = r7.A0C
            r2 = r5 & 16
            r0 = 16
            r1 = 0
            if (r2 != r0) goto L_0x01bd
            r1 = 1
        L_0x01bd:
            java.lang.String r0 = r10.A0C
            java.lang.String r0 = r9.Ahz(r3, r0, r4, r1)
            r7.A0C = r0
            r1 = 32
            r0 = r6 & 32
            r4 = 0
            if (r0 != r1) goto L_0x01cd
            r4 = 1
        L_0x01cd:
            java.lang.String r3 = r7.A08
            r2 = r5 & 32
            r0 = 32
            r1 = 0
            if (r2 != r0) goto L_0x01d7
            r1 = 1
        L_0x01d7:
            java.lang.String r0 = r10.A08
            java.lang.String r0 = r9.Ahz(r3, r0, r4, r1)
            r7.A08 = r0
            r1 = 64
            r0 = r6 & 64
            r4 = 0
            if (r0 != r1) goto L_0x01e7
            r4 = 1
        L_0x01e7:
            java.lang.String r3 = r7.A05
            r2 = r5 & 64
            r0 = 64
            r1 = 0
            if (r2 != r0) goto L_0x01f1
            r1 = 1
        L_0x01f1:
            java.lang.String r0 = r10.A05
            java.lang.String r0 = r9.Ahz(r3, r0, r4, r1)
            r7.A05 = r0
            r1 = 128(0x80, float:1.794E-43)
            r0 = r6 & r1
            r4 = 0
            if (r0 != r1) goto L_0x0201
            r4 = 1
        L_0x0201:
            java.lang.String r3 = r7.A0B
            r2 = r5 & r1
            r0 = 128(0x80, float:1.794E-43)
            r1 = 0
            if (r2 != r0) goto L_0x020b
            r1 = 1
        L_0x020b:
            java.lang.String r0 = r10.A0B
            java.lang.String r0 = r9.Ahz(r3, r0, r4, r1)
            r7.A0B = r0
            r1 = 256(0x100, float:3.59E-43)
            r0 = r6 & r1
            r4 = 0
            if (r0 != r1) goto L_0x021b
            r4 = 1
        L_0x021b:
            java.lang.String r3 = r7.A0D
            r2 = r5 & r1
            r0 = 256(0x100, float:3.59E-43)
            r1 = 0
            if (r2 != r0) goto L_0x0225
            r1 = 1
        L_0x0225:
            java.lang.String r0 = r10.A0D
            java.lang.String r0 = r9.Ahz(r3, r0, r4, r1)
            r7.A0D = r0
            r1 = 512(0x200, float:7.175E-43)
            r0 = r6 & r1
            r4 = 0
            if (r0 != r1) goto L_0x0235
            r4 = 1
        L_0x0235:
            int r3 = r7.A02
            r2 = r5 & r1
            r0 = 512(0x200, float:7.175E-43)
            r1 = 0
            if (r2 != r0) goto L_0x023f
            r1 = 1
        L_0x023f:
            int r0 = r10.A02
            int r0 = r9.Ahq(r3, r0, r4, r1)
            r7.A02 = r0
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r6 & r1
            r4 = 0
            if (r0 != r1) goto L_0x024f
            r4 = 1
        L_0x024f:
            java.lang.String r3 = r7.A07
            r2 = r5 & r1
            r0 = 1024(0x400, float:1.435E-42)
            r1 = 0
            if (r2 != r0) goto L_0x0259
            r1 = 1
        L_0x0259:
            java.lang.String r0 = r10.A07
            java.lang.String r0 = r9.Ahz(r3, r0, r4, r1)
            r7.A07 = r0
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r6 & r1
            r4 = 0
            if (r0 != r1) goto L_0x0269
            r4 = 1
        L_0x0269:
            java.lang.String r3 = r7.A06
            r2 = r5 & r1
            r0 = 2048(0x800, float:2.87E-42)
            r1 = 0
            if (r2 != r0) goto L_0x0273
            r1 = 1
        L_0x0273:
            java.lang.String r0 = r10.A06
            java.lang.String r0 = r9.Ahz(r3, r0, r4, r1)
            r7.A06 = r0
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r6 & r1
            r4 = 0
            if (r0 != r1) goto L_0x0283
            r4 = 1
        L_0x0283:
            java.lang.String r3 = r7.A04
            r2 = r5 & r1
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 0
            if (r2 != r0) goto L_0x028d
            r1 = 1
        L_0x028d:
            java.lang.String r0 = r10.A04
            java.lang.String r0 = r9.Ahz(r3, r0, r4, r1)
            r7.A04 = r0
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r9 != r0) goto L_0x029c
            r6 = r6 | r5
            r7.A00 = r6
        L_0x029c:
            return r7
        L_0x029d:
            X.2gh r0 = new X.2gh
            r0.<init>()
            return r0
        L_0x02a3:
            return r3
        L_0x02a4:
            X.2gg r0 = A0E
            return r0
        L_0x02a7:
            X.2gg r0 = new X.2gg
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54022gg.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A00(1, this.A01);
        }
        if ((i4 & 2) == 2) {
            C48072Lt r0 = this.A03;
            if (r0 == null) {
                r0 = C48072Lt.A06;
            }
            i3 += CodedOutputStream.A05(r0, 2);
        }
        if ((this.A00 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A06(this.A09);
        }
        if ((this.A00 & 8) == 8) {
            i3 += 1 + CodedOutputStream.A06(this.A0A);
        }
        if ((this.A00 & 16) == 16) {
            i3 += 1 + CodedOutputStream.A06(this.A0C);
        }
        if ((this.A00 & 32) == 32) {
            i3 += 1 + CodedOutputStream.A06(this.A08);
        }
        if ((this.A00 & 64) == 64) {
            i3 += 1 + CodedOutputStream.A06(this.A05);
        }
        if ((this.A00 & 128) == 128) {
            i3 += 1 + CodedOutputStream.A06(this.A0B);
        }
        if ((this.A00 & 256) == 256) {
            i3 += 1 + CodedOutputStream.A06(this.A0D);
        }
        int i5 = this.A00;
        if ((i5 & 512) == 512) {
            i3 += CodedOutputStream.A00(10, this.A02);
        }
        if ((i5 & 1024) == 1024) {
            i3 += 1 + CodedOutputStream.A06(this.A07);
        }
        if ((this.A00 & 2048) == 2048) {
            i3 += 1 + CodedOutputStream.A06(this.A06);
        }
        if ((this.A00 & 4096) == 4096) {
            i3 += 1 + CodedOutputStream.A06(this.A04);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A09(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            C48072Lt r0 = this.A03;
            if (r0 == null) {
                r0 = C48072Lt.A06;
            }
            codedOutputStream.A0G(r0, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(3, this.A09);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0D(4, this.A0A);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0D(5, this.A0C);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0D(6, this.A08);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0D(7, this.A05);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0D(8, this.A0B);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0D(9, this.A0D);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A09(10, this.A02);
        }
        if ((this.A00 & 1024) == 1024) {
            codedOutputStream.A0D(11, this.A07);
        }
        if ((this.A00 & 2048) == 2048) {
            codedOutputStream.A0D(12, this.A06);
        }
        if ((this.A00 & 4096) == 4096) {
            codedOutputStream.A0D(13, this.A04);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
