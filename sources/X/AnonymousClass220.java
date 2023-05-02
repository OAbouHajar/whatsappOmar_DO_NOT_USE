package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.220  reason: invalid class name */
public final class AnonymousClass220 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass220 A07;
    public static volatile C47872Kz A08;
    public int A00;
    public int A01 = 0;
    public AnonymousClass21S A02;
    public C58202t7 A03;
    public C58212t8 A04;
    public AnonymousClass22R A05;
    public Object A06;

    static {
        AnonymousClass220 r0 = new AnonymousClass220();
        A07 = r0;
        r0.A0W();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x022f, code lost:
        if (r9.A01 == 5) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0234, code lost:
        if (r9.A01 == 4) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0239, code lost:
        if (r9.A01 == 6) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x023b, code lost:
        r7 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = this;
            int r0 = r10.ordinal()
            r6 = 6
            r5 = 5
            r4 = 2
            r7 = 0
            r3 = 4
            r8 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x024e;
                case 1: goto L_0x01d3;
                case 2: goto L_0x0030;
                case 3: goto L_0x024d;
                case 4: goto L_0x0251;
                case 5: goto L_0x0247;
                case 6: goto L_0x01b2;
                case 7: goto L_0x0014;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0014:
            X.2Kz r0 = A08
            if (r0 != 0) goto L_0x002d
            java.lang.Class<X.220> r2 = X.AnonymousClass220.class
            monitor-enter(r2)
            X.2Kz r0 = A08     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0028
            X.220 r1 = A07     // Catch:{ all -> 0x002a }
            X.2Kz r0 = new X.2Kz     // Catch:{ all -> 0x002a }
            r0.<init>(r1)     // Catch:{ all -> 0x002a }
            A08 = r0     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            goto L_0x002d
        L_0x002a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002d:
            X.2Kz r0 = A08
            return r0
        L_0x0030:
            X.2Kx r11 = (X.C47852Kx) r11
            X.2Ky r12 = (X.C47862Ky) r12
        L_0x0034:
            int r1 = r11.A03()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            if (r1 == 0) goto L_0x01b2
            r0 = 10
            if (r1 == r0) goto L_0x016e
            r0 = 18
            if (r1 == r0) goto L_0x013d
            r0 = 26
            if (r1 == r0) goto L_0x010c
            r0 = 34
            if (r1 == r0) goto L_0x00de
            r0 = 42
            if (r1 == r0) goto L_0x00b0
            r0 = 50
            if (r1 == r0) goto L_0x0083
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L_0x005e
            boolean r0 = r9.A0a(r11, r1)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            if (r0 != 0) goto L_0x0034
            goto L_0x01b2
        L_0x005e:
            int r0 = r9.A00     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x007d
            X.21S r0 = r9.A02     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.21T r1 = (X.AnonymousClass21T) r1     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x006e:
            X.21S r0 = X.AnonymousClass21S.A0R     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wo r0 = r11.A09(r12, r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.21S r0 = (X.AnonymousClass21S) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A02 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            goto L_0x007f
        L_0x007d:
            r1 = r8
            goto L_0x006e
        L_0x007f:
            if (r1 == 0) goto L_0x01aa
            goto L_0x019f
        L_0x0083:
            int r0 = r9.A01     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            if (r0 != r6) goto L_0x009e
            java.lang.Object r0 = r9.A06     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.221 r0 = (X.AnonymousClass221) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.3e6 r1 = (X.C68853e6) r1     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x0091:
            X.221 r0 = X.AnonymousClass221.A03     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wo r0 = r11.A09(r12, r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A06 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            goto L_0x00a0
        L_0x009e:
            r1 = r8
            goto L_0x0091
        L_0x00a0:
            if (r1 == 0) goto L_0x00ad
            X.221 r0 = (X.AnonymousClass221) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r1.A04(r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A06 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x00ad:
            r9.A01 = r6     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            goto L_0x0034
        L_0x00b0:
            int r0 = r9.A01     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            if (r0 != r5) goto L_0x00cb
            java.lang.Object r0 = r9.A06     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.2tp r0 = (X.C58642tp) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.3e4 r1 = (X.C68833e4) r1     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x00be:
            X.2tp r0 = X.C58642tp.A04     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wo r0 = r11.A09(r12, r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A06 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            goto L_0x00cd
        L_0x00cb:
            r1 = r8
            goto L_0x00be
        L_0x00cd:
            if (r1 == 0) goto L_0x00da
            X.2tp r0 = (X.C58642tp) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r1.A04(r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A06 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x00da:
            r9.A01 = r5     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            goto L_0x0034
        L_0x00de:
            int r0 = r9.A01     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            if (r0 != r3) goto L_0x00f9
            java.lang.Object r0 = r9.A06     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.2tq r0 = (X.C58652tq) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.3e8 r1 = (X.C68873e8) r1     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x00ec:
            X.2tq r0 = X.C58652tq.A04     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wo r0 = r11.A09(r12, r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A06 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            goto L_0x00fb
        L_0x00f9:
            r1 = r8
            goto L_0x00ec
        L_0x00fb:
            if (r1 == 0) goto L_0x0108
            X.2tq r0 = (X.C58652tq) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r1.A04(r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A06 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x0108:
            r9.A01 = r3     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            goto L_0x0034
        L_0x010c:
            int r0 = r9.A00     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r0 = r0 & 4
            if (r0 != r3) goto L_0x0129
            X.2t8 r0 = r9.A04     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.3e5 r1 = (X.C68843e5) r1     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x011a:
            X.2t8 r0 = X.C58212t8.A02     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wo r0 = r11.A09(r12, r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.2t8 r0 = (X.C58212t8) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A04 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            goto L_0x012b
        L_0x0129:
            r1 = r8
            goto L_0x011a
        L_0x012b:
            if (r1 == 0) goto L_0x0138
            r1.A04(r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.2t8 r0 = (X.C58212t8) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A04 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x0138:
            int r0 = r9.A00     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r0 = r0 | 4
            goto L_0x01ae
        L_0x013d:
            int r0 = r9.A00     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r0 = r0 & 2
            if (r0 != r4) goto L_0x015a
            X.2t7 r0 = r9.A03     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.3e3 r1 = (X.C68823e3) r1     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x014b:
            X.2t7 r0 = X.C58202t7.A02     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wo r0 = r11.A09(r12, r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.2t7 r0 = (X.C58202t7) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A03 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            goto L_0x015c
        L_0x015a:
            r1 = r8
            goto L_0x014b
        L_0x015c:
            if (r1 == 0) goto L_0x0169
            r1.A04(r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.2t7 r0 = (X.C58202t7) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A03 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x0169:
            int r0 = r9.A00     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r0 = r0 | 2
            goto L_0x01ae
        L_0x016e:
            int r0 = r9.A00     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r0 = r0 & 1
            if (r0 != r2) goto L_0x018b
            X.22R r0 = r9.A05     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.3fC r1 = (X.C69533fC) r1     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x017c:
            X.22R r0 = X.AnonymousClass22R.A06     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wo r0 = r11.A09(r12, r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.22R r0 = (X.AnonymousClass22R) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A05 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            goto L_0x018d
        L_0x018b:
            r1 = r8
            goto L_0x017c
        L_0x018d:
            if (r1 == 0) goto L_0x019a
            r1.A04(r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.22R r0 = (X.AnonymousClass22R) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A05 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x019a:
            int r0 = r9.A00     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r0 = r0 | 1
            goto L_0x01ae
        L_0x019f:
            r1.A04(r0)     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            X.21S r0 = (X.AnonymousClass21S) r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r9.A02 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
        L_0x01aa:
            int r0 = r9.A00     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            r0 = r0 | 64
        L_0x01ae:
            r9.A00 = r0     // Catch:{ 1bD -> 0x01b7, IOException -> 0x01b5 }
            goto L_0x0034
        L_0x01b2:
            X.220 r0 = A07
            return r0
        L_0x01b5:
            r0 = move-exception
            goto L_0x01c0
        L_0x01b7:
            r0 = move-exception
            r0.unfinishedMessage = r9     // Catch:{ all -> 0x01d1 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x01d1 }
            r1.<init>(r0)     // Catch:{ all -> 0x01d1 }
            goto L_0x01d0
        L_0x01c0:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x01d1 }
            X.1bD r0 = new X.1bD     // Catch:{ all -> 0x01d1 }
            r0.<init>(r1)     // Catch:{ all -> 0x01d1 }
            r0.unfinishedMessage = r9     // Catch:{ all -> 0x01d1 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x01d1 }
            r1.<init>(r0)     // Catch:{ all -> 0x01d1 }
        L_0x01d0:
            throw r1     // Catch:{ all -> 0x01d1 }
        L_0x01d1:
            r0 = move-exception
            throw r0
        L_0x01d3:
            X.2L6 r11 = (X.AnonymousClass2L6) r11
            X.220 r12 = (X.AnonymousClass220) r12
            X.22R r1 = r9.A05
            X.22R r0 = r12.A05
            X.1Wo r0 = r11.Ahu(r1, r0)
            X.22R r0 = (X.AnonymousClass22R) r0
            r9.A05 = r0
            X.2t7 r1 = r9.A03
            X.2t7 r0 = r12.A03
            X.1Wo r0 = r11.Ahu(r1, r0)
            X.2t7 r0 = (X.C58202t7) r0
            r9.A03 = r0
            X.2t8 r1 = r9.A04
            X.2t8 r0 = r12.A04
            X.1Wo r0 = r11.Ahu(r1, r0)
            X.2t8 r0 = (X.C58212t8) r0
            r9.A04 = r0
            X.21S r1 = r9.A02
            X.21S r0 = r12.A02
            X.1Wo r0 = r11.Ahu(r1, r0)
            X.21S r0 = (X.AnonymousClass21S) r0
            r9.A02 = r0
            X.42c r0 = r12.A0c()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0232;
                case 1: goto L_0x022d;
                case 2: goto L_0x0237;
                case 3: goto L_0x0224;
                default: goto L_0x0212;
            }
        L_0x0212:
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r11 != r0) goto L_0x0223
            int r0 = r12.A01
            if (r0 == 0) goto L_0x021c
            r9.A01 = r0
        L_0x021c:
            int r1 = r9.A00
            int r0 = r12.A00
            r1 = r1 | r0
            r9.A00 = r1
        L_0x0223:
            return r9
        L_0x0224:
            int r0 = r9.A01
            if (r0 == 0) goto L_0x0229
            r7 = 1
        L_0x0229:
            r11.Ahx(r7)
            goto L_0x0212
        L_0x022d:
            int r0 = r9.A01
            if (r0 != r5) goto L_0x023c
            goto L_0x023b
        L_0x0232:
            int r0 = r9.A01
            if (r0 != r3) goto L_0x023c
            goto L_0x023b
        L_0x0237:
            int r0 = r9.A01
            if (r0 != r6) goto L_0x023c
        L_0x023b:
            r7 = 1
        L_0x023c:
            java.lang.Object r1 = r9.A06
            java.lang.Object r0 = r12.A06
            java.lang.Object r0 = r11.Ahw(r1, r0, r7)
            r9.A06 = r0
            goto L_0x0212
        L_0x0247:
            X.3fB r0 = new X.3fB
            r0.<init>()
            return r0
        L_0x024d:
            return r8
        L_0x024e:
            X.220 r0 = A07
            return r0
        L_0x0251:
            X.220 r0 = new X.220
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass220.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public C799842c A0c() {
        int i2 = this.A01;
        if (i2 == 0) {
            return C799842c.A02;
        }
        if (i2 == 4) {
            return C799842c.A04;
        }
        if (i2 == 5) {
            return C799842c.A01;
        }
        if (i2 != 6) {
            return null;
        }
        return C799842c.A03;
    }

    public AnonymousClass221 A0d() {
        return this.A01 == 6 ? (AnonymousClass221) this.A06 : AnonymousClass221.A03;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            AnonymousClass22R r0 = this.A05;
            if (r0 == null) {
                r0 = AnonymousClass22R.A06;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            C58202t7 r02 = this.A03;
            if (r02 == null) {
                r02 = C58202t7.A02;
            }
            i3 += CodedOutputStream.A05(r02, 2);
        }
        if ((this.A00 & 4) == 4) {
            C58212t8 r03 = this.A04;
            if (r03 == null) {
                r03 = C58212t8.A02;
            }
            i3 += CodedOutputStream.A05(r03, 3);
        }
        if (this.A01 == 4) {
            i3 += CodedOutputStream.A05((C28551Wn) this.A06, 4);
        }
        if (this.A01 == 5) {
            i3 += CodedOutputStream.A05((C28551Wn) this.A06, 5);
        }
        if (this.A01 == 6) {
            i3 += CodedOutputStream.A05((C28551Wn) this.A06, 6);
        }
        if ((this.A00 & 64) == 64) {
            AnonymousClass21S r04 = this.A02;
            if (r04 == null) {
                r04 = AnonymousClass21S.A0R;
            }
            i3 += CodedOutputStream.A05(r04, 15);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            AnonymousClass22R r0 = this.A05;
            if (r0 == null) {
                r0 = AnonymousClass22R.A06;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            C58202t7 r02 = this.A03;
            if (r02 == null) {
                r02 = C58202t7.A02;
            }
            codedOutputStream.A0G(r02, 2);
        }
        if ((this.A00 & 4) == 4) {
            C58212t8 r03 = this.A04;
            if (r03 == null) {
                r03 = C58212t8.A02;
            }
            codedOutputStream.A0G(r03, 3);
        }
        if (this.A01 == 4) {
            codedOutputStream.A0G((C28551Wn) this.A06, 4);
        }
        if (this.A01 == 5) {
            codedOutputStream.A0G((C28551Wn) this.A06, 5);
        }
        if (this.A01 == 6) {
            codedOutputStream.A0G((C28551Wn) this.A06, 6);
        }
        if ((this.A00 & 64) == 64) {
            AnonymousClass21S r04 = this.A02;
            if (r04 == null) {
                r04 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r04, 15);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
