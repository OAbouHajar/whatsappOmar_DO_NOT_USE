package X;

import android.support.v4.view.GravityCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2ge  reason: invalid class name and case insensitive filesystem */
public final class C54002ge extends C28541Wm implements C28561Wp {
    public static final C54002ge A0R;
    public static volatile C47872Kz A0S;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public C28631Ww A0E;
    public C28631Ww A0F;
    public C28631Ww A0G;
    public C28631Ww A0H;
    public AnonymousClass27P A0I = C58132sw.A02;
    public C54062gk A0J;
    public C54082gm A0K;
    public C54022gg A0L;
    public C54202gy A0M;
    public String A0N = "";
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    static {
        C54002ge r0 = new C54002ge();
        A0R = r0;
        r0.A0W();
    }

    public C54002ge() {
        C28631Ww r0 = C28631Ww.A01;
        this.A0E = r0;
        this.A0G = r0;
        this.A0F = r0;
        this.A0H = r0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009d, code lost:
        super.A0X(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r1 = r18
            r8 = r17
            int r0 = r16.ordinal()
            r5 = 0
            switch(r0) {
                case 0: goto L_0x0562;
                case 1: goto L_0x02eb;
                case 2: goto L_0x002e;
                case 3: goto L_0x055a;
                case 4: goto L_0x0565;
                case 5: goto L_0x0554;
                case 6: goto L_0x02ca;
                case 7: goto L_0x0012;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0012:
            X.2Kz r0 = A0S
            if (r0 != 0) goto L_0x002b
            java.lang.Class<X.2ge> r2 = X.C54002ge.class
            monitor-enter(r2)
            X.2Kz r0 = A0S     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            X.2ge r1 = A0R     // Catch:{ all -> 0x0028 }
            X.2Kz r0 = new X.2Kz     // Catch:{ all -> 0x0028 }
            r0.<init>(r1)     // Catch:{ all -> 0x0028 }
            A0S = r0     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            X.2Kz r0 = A0S
            return r0
        L_0x002e:
            X.2Kx r8 = (X.C47852Kx) r8
            X.2Ky r1 = (X.C47862Ky) r1
        L_0x0032:
            int r0 = r8.A03()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            switch(r0) {
                case 0: goto L_0x02ca;
                case 8: goto L_0x00ab;
                case 24: goto L_0x00b9;
                case 42: goto L_0x00c7;
                case 50: goto L_0x00fc;
                case 58: goto L_0x0132;
                case 77: goto L_0x0140;
                case 80: goto L_0x014e;
                case 96: goto L_0x0041;
                case 104: goto L_0x0059;
                case 112: goto L_0x015c;
                case 114: goto L_0x0178;
                case 122: goto L_0x01b0;
                case 128: goto L_0x01e4;
                case 136: goto L_0x01f2;
                case 144: goto L_0x0200;
                case 154: goto L_0x020e;
                case 160: goto L_0x007a;
                case 170: goto L_0x0242;
                case 178: goto L_0x0252;
                case 184: goto L_0x0261;
                case 192: goto L_0x0270;
                case 240: goto L_0x008f;
                case 248: goto L_0x027f;
                case 258: goto L_0x028e;
                case 274: goto L_0x029d;
                case 288: goto L_0x02ac;
                case 296: goto L_0x02bb;
                default: goto L_0x0039;
            }     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
        L_0x0039:
            boolean r0 = r15.A0a(r8, r0)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            if (r0 != 0) goto L_0x0032
            goto L_0x02ca
        L_0x0041:
            int r2 = r8.A02()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            if (r2 == 0) goto L_0x0050
            r0 = 1
            if (r2 == r0) goto L_0x0050
            switch(r2) {
                case 100: goto L_0x0050;
                case 101: goto L_0x0050;
                case 102: goto L_0x0050;
                case 103: goto L_0x0050;
                case 104: goto L_0x0050;
                case 105: goto L_0x0050;
                case 106: goto L_0x0050;
                case 107: goto L_0x0050;
                case 108: goto L_0x0050;
                case 109: goto L_0x0050;
                case 110: goto L_0x0050;
                case 111: goto L_0x0050;
                case 112: goto L_0x0050;
                default: goto L_0x004d;
            }     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
        L_0x004d:
            r0 = 12
            goto L_0x009d
        L_0x0050:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A04 = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x0059:
            int r2 = r8.A02()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            if (r2 == 0) goto L_0x0071
            r0 = 1
            if (r2 == r0) goto L_0x0071
            r0 = 2
            if (r2 == r0) goto L_0x0071
            r0 = 3
            if (r2 == r0) goto L_0x0071
            r0 = 4
            if (r2 == r0) goto L_0x0071
            r0 = 5
            if (r2 == r0) goto L_0x0071
            r0 = 13
            goto L_0x009d
        L_0x0071:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | 256(0x100, float:3.59E-43)
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A03 = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x007a:
            int r2 = r8.A02()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            if (r2 == 0) goto L_0x0086
            r0 = 1
            if (r2 == r0) goto L_0x0086
            r0 = 20
            goto L_0x009d
        L_0x0086:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A09 = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x008f:
            int r2 = r8.A02()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            if (r2 == 0) goto L_0x00a1
            r0 = 1
            if (r2 == r0) goto L_0x00a1
            r0 = 2
            if (r2 == r0) goto L_0x00a1
            r0 = 30
        L_0x009d:
            super.A0X(r0, r2)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x00a1:
            int r3 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r0
            r15.A01 = r3     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A06 = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x00ab:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | 1
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            long r2 = r8.A06()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0D = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x00b9:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | 2
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            boolean r0 = r8.A0F()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0P = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x00c7:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r2 = 4
            r0 = r0 & 4
            if (r0 != r2) goto L_0x00e5
            X.2gg r0 = r15.A0L     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Wr r2 = r0.A0U()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2gh r2 = (X.C54032gh) r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
        L_0x00d6:
            X.2gg r0 = X.C54022gg.A0E     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Wo r0 = r8.A09(r1, r0)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2gg r0 = (X.C54022gg) r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0L = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x00e7
        L_0x00e5:
            r2 = r5
            goto L_0x00d6
        L_0x00e7:
            if (r2 == 0) goto L_0x00f4
            r2.A04(r0)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Wm r0 = r2.A01()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2gg r0 = (X.C54022gg) r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0L = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
        L_0x00f4:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | 4
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x00fc:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r2 = 8
            r0 = r0 & 8
            if (r0 != r2) goto L_0x011b
            X.2gy r0 = r15.A0M     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Wr r2 = r0.A0U()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.3f3 r2 = (X.C69443f3) r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
        L_0x010c:
            X.2gy r0 = X.C54202gy.A05     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Wo r0 = r8.A09(r1, r0)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2gy r0 = (X.C54202gy) r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0M = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x011d
        L_0x011b:
            r2 = r5
            goto L_0x010c
        L_0x011d:
            if (r2 == 0) goto L_0x012a
            r2.A04(r0)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Wm r0 = r2.A01()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2gy r0 = (X.C54202gy) r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0M = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
        L_0x012a:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | 8
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x0132:
            java.lang.String r2 = r8.A0A()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | 16
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0N = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x0140:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | 32
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            int r0 = r8.A01()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0A = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x014e:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | 64
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            boolean r0 = r8.A0F()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0Q = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x015c:
            X.27P r3 = r15.A0I     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r3
            X.1XF r0 = (X.AnonymousClass1XF) r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            boolean r0 = r0.A00     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            if (r0 != 0) goto L_0x016b
            X.27P r3 = X.C28541Wm.A0F(r3)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0I = r3     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
        L_0x016b:
            int r2 = r8.A02()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2sw r3 = (X.C58132sw) r3     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            int r0 = r3.A00     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r3.A02(r0, r2)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x0178:
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            int r4 = r8.A04(r0)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.27P r2 = r15.A0I     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r2
            X.1XF r0 = (X.AnonymousClass1XF) r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            boolean r0 = r0.A00     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            if (r0 != 0) goto L_0x0195
            int r0 = r8.A00()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            if (r0 <= 0) goto L_0x0195
            X.27P r0 = X.C28541Wm.A0F(r2)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0I = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
        L_0x0195:
            int r0 = r8.A00()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            if (r0 <= 0) goto L_0x01a9
            X.27P r3 = r15.A0I     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            int r2 = r8.A02()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2sw r3 = (X.C58132sw) r3     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            int r0 = r3.A00     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r3.A02(r0, r2)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0195
        L_0x01a9:
            r8.A03 = r4     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r8.A0B()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x01b0:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r3 = 512(0x200, float:7.175E-43)
            r0 = r0 & r3
            if (r0 != r3) goto L_0x01ce
            X.2gk r0 = r15.A0J     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Wr r2 = r0.A0U()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2gl r2 = (X.C54072gl) r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
        L_0x01bf:
            X.2gk r0 = X.C54062gk.A03     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Wo r0 = r8.A09(r1, r0)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2gk r0 = (X.C54062gk) r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0J = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x01d0
        L_0x01ce:
            r2 = r5
            goto L_0x01bf
        L_0x01d0:
            if (r2 == 0) goto L_0x01dd
            r2.A04(r0)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Wm r0 = r2.A01()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2gk r0 = (X.C54062gk) r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0J = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
        L_0x01dd:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | r3
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x01e4:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A02 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x01f2:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A00 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x0200:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A05 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x020e:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r3 = 8192(0x2000, float:1.14794E-41)
            r0 = r0 & r3
            if (r0 != r3) goto L_0x022c
            X.2gm r0 = r15.A0K     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Wr r2 = r0.A0U()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2gn r2 = (X.C54092gn) r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
        L_0x021d:
            X.2gm r0 = X.C54082gm.A09     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Wo r0 = r8.A09(r1, r0)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2gm r0 = (X.C54082gm) r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0K = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x022e
        L_0x022c:
            r2 = r5
            goto L_0x021d
        L_0x022e:
            if (r2 == 0) goto L_0x023b
            r2.A04(r0)     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Wm r0 = r2.A01()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.2gm r0 = (X.C54082gm) r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0K = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
        L_0x023b:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = r0 | r3
            r15.A01 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x0242:
            int r2 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r0
            r15.A01 = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Ww r0 = r8.A08()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0E = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x0252:
            int r2 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r15.A01 = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Ww r0 = r8.A08()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0G = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x0261:
            int r2 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r0
            r15.A01 = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            boolean r0 = r8.A0F()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0O = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x0270:
            int r2 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r0
            r15.A01 = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A07 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x027f:
            int r2 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 | r0
            r15.A01 = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            long r2 = r8.A06()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0C = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x028e:
            int r2 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 | r0
            r15.A01 = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Ww r0 = r8.A08()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0F = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x029d:
            int r2 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 | r0
            r15.A01 = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            X.1Ww r0 = r8.A08()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0H = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x02ac:
            int r2 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r2 | r0
            r15.A01 = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A0B = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x02bb:
            int r2 = r15.A01     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 | r0
            r15.A01 = r2     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            r15.A08 = r0     // Catch:{ 1bD -> 0x02cf, IOException -> 0x02cd }
            goto L_0x0032
        L_0x02ca:
            X.2ge r0 = A0R
            return r0
        L_0x02cd:
            r0 = move-exception
            goto L_0x02d8
        L_0x02cf:
            r0 = move-exception
            r0.unfinishedMessage = r15     // Catch:{ all -> 0x02e9 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x02e9 }
            r1.<init>(r0)     // Catch:{ all -> 0x02e9 }
            goto L_0x02e8
        L_0x02d8:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x02e9 }
            X.1bD r0 = new X.1bD     // Catch:{ all -> 0x02e9 }
            r0.<init>(r1)     // Catch:{ all -> 0x02e9 }
            r0.unfinishedMessage = r15     // Catch:{ all -> 0x02e9 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x02e9 }
            r1.<init>(r0)     // Catch:{ all -> 0x02e9 }
        L_0x02e8:
            throw r1     // Catch:{ all -> 0x02e9 }
        L_0x02e9:
            r0 = move-exception
            throw r0
        L_0x02eb:
            X.2L6 r8 = (X.AnonymousClass2L6) r8
            X.2ge r1 = (X.C54002ge) r1
            int r4 = r15.A01
            r13 = 1
            r0 = r4 & 1
            if (r0 == r13) goto L_0x02f7
            r13 = 0
        L_0x02f7:
            long r9 = r15.A0D
            int r6 = r1.A01
            r14 = 1
            r0 = r6 & 1
            if (r0 == r14) goto L_0x0301
            r14 = 0
        L_0x0301:
            long r11 = r1.A0D
            long r2 = r8.Aht(r9, r11, r13, r14)
            r15.A0D = r2
            r2 = 2
            r0 = r4 & 2
            r5 = 0
            if (r0 != r2) goto L_0x0310
            r5 = 1
        L_0x0310:
            boolean r4 = r15.A0P
            r3 = r6 & 2
            r0 = 2
            r2 = 0
            if (r3 != r0) goto L_0x0319
            r2 = 1
        L_0x0319:
            boolean r0 = r1.A0P
            boolean r0 = r8.Ahm(r5, r4, r2, r0)
            r15.A0P = r0
            X.2gg r2 = r15.A0L
            X.2gg r0 = r1.A0L
            X.1Wo r0 = r8.Ahu(r2, r0)
            X.2gg r0 = (X.C54022gg) r0
            r15.A0L = r0
            X.2gy r2 = r15.A0M
            X.2gy r0 = r1.A0M
            X.1Wo r0 = r8.Ahu(r2, r0)
            X.2gy r0 = (X.C54202gy) r0
            r15.A0M = r0
            int r7 = r15.A01
            r2 = 16
            r0 = r7 & 16
            r5 = 0
            if (r0 != r2) goto L_0x0343
            r5 = 1
        L_0x0343:
            java.lang.String r4 = r15.A0N
            int r6 = r1.A01
            r3 = r6 & 16
            r0 = 16
            r2 = 0
            if (r3 != r0) goto L_0x034f
            r2 = 1
        L_0x034f:
            java.lang.String r0 = r1.A0N
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r2)
            r15.A0N = r0
            r2 = 32
            r0 = r7 & 32
            r5 = 0
            if (r0 != r2) goto L_0x035f
            r5 = 1
        L_0x035f:
            int r4 = r15.A0A
            r3 = r6 & 32
            r0 = 32
            r2 = 0
            if (r3 != r0) goto L_0x0369
            r2 = 1
        L_0x0369:
            int r0 = r1.A0A
            int r0 = r8.Ahq(r4, r0, r5, r2)
            r15.A0A = r0
            r2 = 64
            r0 = r7 & 64
            r5 = 0
            if (r0 != r2) goto L_0x0379
            r5 = 1
        L_0x0379:
            boolean r4 = r15.A0Q
            r3 = r6 & 64
            r0 = 64
            r2 = 0
            if (r3 != r0) goto L_0x0383
            r2 = 1
        L_0x0383:
            boolean r0 = r1.A0Q
            boolean r0 = r8.Ahm(r5, r4, r2, r0)
            r15.A0Q = r0
            r2 = 128(0x80, float:1.794E-43)
            r0 = r7 & r2
            r5 = 0
            if (r0 != r2) goto L_0x0393
            r5 = 1
        L_0x0393:
            int r4 = r15.A04
            r3 = r6 & r2
            r0 = 128(0x80, float:1.794E-43)
            r2 = 0
            if (r3 != r0) goto L_0x039d
            r2 = 1
        L_0x039d:
            int r0 = r1.A04
            int r0 = r8.Ahq(r4, r0, r5, r2)
            r15.A04 = r0
            r0 = 256(0x100, float:3.59E-43)
            r7 = r7 & r0
            r4 = 0
            if (r7 != r0) goto L_0x03ac
            r4 = 1
        L_0x03ac:
            int r3 = r15.A03
            r6 = r6 & r0
            r2 = 0
            if (r6 != r0) goto L_0x03b3
            r2 = 1
        L_0x03b3:
            int r0 = r1.A03
            int r0 = r8.Ahq(r3, r0, r4, r2)
            r15.A03 = r0
            X.27P r2 = r15.A0I
            X.27P r0 = r1.A0I
            X.27P r0 = r8.Ahr(r2, r0)
            r15.A0I = r0
            X.2gk r2 = r15.A0J
            X.2gk r0 = r1.A0J
            X.1Wo r0 = r8.Ahu(r2, r0)
            X.2gk r0 = (X.C54062gk) r0
            r15.A0J = r0
            int r7 = r15.A01
            r2 = 1024(0x400, float:1.435E-42)
            r0 = r7 & r2
            r5 = 0
            if (r0 != r2) goto L_0x03db
            r5 = 1
        L_0x03db:
            int r4 = r15.A02
            int r6 = r1.A01
            r3 = r6 & r2
            r0 = 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r3 != r0) goto L_0x03e7
            r2 = 1
        L_0x03e7:
            int r0 = r1.A02
            int r0 = r8.Ahq(r4, r0, r5, r2)
            r15.A02 = r0
            r2 = 2048(0x800, float:2.87E-42)
            r0 = r7 & r2
            r5 = 0
            if (r0 != r2) goto L_0x03f7
            r5 = 1
        L_0x03f7:
            int r4 = r15.A00
            r3 = r6 & r2
            r0 = 2048(0x800, float:2.87E-42)
            r2 = 0
            if (r3 != r0) goto L_0x0401
            r2 = 1
        L_0x0401:
            int r0 = r1.A00
            int r0 = r8.Ahq(r4, r0, r5, r2)
            r15.A00 = r0
            r0 = 4096(0x1000, float:5.74E-42)
            r7 = r7 & r0
            r4 = 0
            if (r7 != r0) goto L_0x0410
            r4 = 1
        L_0x0410:
            int r3 = r15.A05
            r6 = r6 & r0
            r2 = 0
            if (r6 != r0) goto L_0x0417
            r2 = 1
        L_0x0417:
            int r0 = r1.A05
            int r0 = r8.Ahq(r3, r0, r4, r2)
            r15.A05 = r0
            X.2gm r2 = r15.A0K
            X.2gm r0 = r1.A0K
            X.1Wo r0 = r8.Ahu(r2, r0)
            X.2gm r0 = (X.C54082gm) r0
            r15.A0K = r0
            int r7 = r15.A01
            r2 = 16384(0x4000, float:2.2959E-41)
            r0 = r7 & r2
            r6 = 0
            if (r0 != r2) goto L_0x0435
            r6 = 1
        L_0x0435:
            int r4 = r15.A09
            int r5 = r1.A01
            r3 = r5 & r2
            r0 = 16384(0x4000, float:2.2959E-41)
            r2 = 0
            if (r3 != r0) goto L_0x0441
            r2 = 1
        L_0x0441:
            int r0 = r1.A09
            int r0 = r8.Ahq(r4, r0, r6, r2)
            r15.A09 = r0
            r0 = 32768(0x8000, float:4.5918E-41)
            r7 = r7 & r0
            r4 = 0
            if (r7 != r0) goto L_0x0451
            r4 = 1
        L_0x0451:
            X.1Ww r3 = r15.A0E
            r5 = r5 & r0
            r2 = 0
            if (r5 != r0) goto L_0x0458
            r2 = 1
        L_0x0458:
            X.1Ww r0 = r1.A0E
            X.1Ww r0 = r8.Ahn(r3, r0, r4, r2)
            r15.A0E = r0
            int r2 = r15.A01
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r0
            r5 = 0
            if (r2 != r0) goto L_0x0469
            r5 = 1
        L_0x0469:
            X.1Ww r4 = r15.A0G
            int r3 = r1.A01
            r3 = r3 & r0
            r2 = 0
            if (r3 != r0) goto L_0x0472
            r2 = 1
        L_0x0472:
            X.1Ww r0 = r1.A0G
            X.1Ww r0 = r8.Ahn(r4, r0, r5, r2)
            r15.A0G = r0
            int r6 = r15.A01
            r2 = 131072(0x20000, float:1.83671E-40)
            r0 = r6 & r2
            r7 = 0
            if (r0 != r2) goto L_0x0484
            r7 = 1
        L_0x0484:
            boolean r4 = r15.A0O
            int r5 = r1.A01
            r3 = r5 & r2
            r0 = 131072(0x20000, float:1.83671E-40)
            r2 = 0
            if (r3 != r0) goto L_0x0490
            r2 = 1
        L_0x0490:
            boolean r0 = r1.A0O
            boolean r0 = r8.Ahm(r7, r4, r2, r0)
            r15.A0O = r0
            r2 = 262144(0x40000, float:3.67342E-40)
            r0 = r6 & r2
            r7 = 0
            if (r0 != r2) goto L_0x04a0
            r7 = 1
        L_0x04a0:
            int r4 = r15.A07
            r3 = r5 & r2
            r0 = 262144(0x40000, float:3.67342E-40)
            r2 = 0
            if (r3 != r0) goto L_0x04aa
            r2 = 1
        L_0x04aa:
            int r0 = r1.A07
            int r0 = r8.Ahq(r4, r0, r7, r2)
            r15.A07 = r0
            r2 = 524288(0x80000, float:7.34684E-40)
            r0 = r6 & r2
            r7 = 0
            if (r0 != r2) goto L_0x04ba
            r7 = 1
        L_0x04ba:
            int r4 = r15.A06
            r3 = r5 & r2
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = 0
            if (r3 != r0) goto L_0x04c4
            r2 = 1
        L_0x04c4:
            int r0 = r1.A06
            int r0 = r8.Ahq(r4, r0, r7, r2)
            r15.A06 = r0
            r2 = 1048576(0x100000, float:1.469368E-39)
            r0 = r6 & r2
            r13 = 0
            if (r0 != r2) goto L_0x04d4
            r13 = 1
        L_0x04d4:
            long r9 = r15.A0C
            r0 = r5 & r2
            r14 = 0
            if (r0 != r2) goto L_0x04dc
            r14 = 1
        L_0x04dc:
            long r11 = r1.A0C
            long r2 = r8.Aht(r9, r11, r13, r14)
            r15.A0C = r2
            r0 = 2097152(0x200000, float:2.938736E-39)
            r6 = r6 & r0
            r4 = 0
            if (r6 != r0) goto L_0x04eb
            r4 = 1
        L_0x04eb:
            X.1Ww r3 = r15.A0F
            r5 = r5 & r0
            r2 = 0
            if (r5 != r0) goto L_0x04f2
            r2 = 1
        L_0x04f2:
            X.1Ww r0 = r1.A0F
            X.1Ww r0 = r8.Ahn(r3, r0, r4, r2)
            r15.A0F = r0
            int r2 = r15.A01
            r0 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r0
            r5 = 0
            if (r2 != r0) goto L_0x0503
            r5 = 1
        L_0x0503:
            X.1Ww r4 = r15.A0H
            int r3 = r1.A01
            r3 = r3 & r0
            r2 = 0
            if (r3 != r0) goto L_0x050c
            r2 = 1
        L_0x050c:
            X.1Ww r0 = r1.A0H
            X.1Ww r0 = r8.Ahn(r4, r0, r5, r2)
            r15.A0H = r0
            int r7 = r15.A01
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r7 & r2
            r5 = 0
            if (r0 != r2) goto L_0x051e
            r5 = 1
        L_0x051e:
            int r4 = r15.A0B
            int r6 = r1.A01
            r3 = r6 & r2
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r2 = 0
            if (r3 != r0) goto L_0x052a
            r2 = 1
        L_0x052a:
            int r0 = r1.A0B
            int r0 = r8.Ahq(r4, r0, r5, r2)
            r15.A0B = r0
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r7 & r2
            r5 = 0
            if (r0 != r2) goto L_0x053a
            r5 = 1
        L_0x053a:
            int r4 = r15.A08
            r3 = r6 & r2
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = 0
            if (r3 != r0) goto L_0x0544
            r2 = 1
        L_0x0544:
            int r0 = r1.A08
            int r0 = r8.Ahq(r4, r0, r5, r2)
            r15.A08 = r0
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r8 != r0) goto L_0x0553
            r7 = r7 | r6
            r15.A01 = r7
        L_0x0553:
            return r15
        L_0x0554:
            X.2gf r0 = new X.2gf
            r0.<init>()
            return r0
        L_0x055a:
            X.27P r1 = r15.A0I
            X.1XF r1 = (X.AnonymousClass1XF) r1
            r0 = 0
            r1.A00 = r0
            return r5
        L_0x0562:
            X.2ge r0 = A0R
            return r0
        L_0x0565:
            X.2ge r0 = new X.2ge
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54002ge.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A01;
        int A032 = (i3 & 1) == 1 ? 1 + CodedOutputStream.A03(this.A0D) : 0;
        if ((i3 & 2) == 2) {
            A032 += 2;
        }
        if ((i3 & 4) == 4) {
            C54022gg r0 = this.A0L;
            if (r0 == null) {
                r0 = C54022gg.A0E;
            }
            A032 += CodedOutputStream.A05(r0, 5);
        }
        if ((this.A01 & 8) == 8) {
            C54202gy r02 = this.A0M;
            if (r02 == null) {
                r02 = C54202gy.A05;
            }
            A032 += CodedOutputStream.A05(r02, 6);
        }
        if ((this.A01 & 16) == 16) {
            A032 += 1 + CodedOutputStream.A06(this.A0N);
        }
        int i4 = this.A01;
        if ((i4 & 32) == 32) {
            A032 += 5;
        }
        if ((i4 & 64) == 64) {
            A032 += 2;
        }
        if ((i4 & 128) == 128) {
            A032 += CodedOutputStream.A00(12, this.A04);
        }
        if ((i4 & 256) == 256) {
            A032 += CodedOutputStream.A00(13, this.A03);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.A0I.size(); i6++) {
            C58132sw r03 = (C58132sw) this.A0I;
            r03.A01(i6);
            int i7 = r03.A01[i6];
            int i8 = 10;
            if (i7 >= 0) {
                i8 = 1;
                if ((i7 & -128) != 0) {
                    i8 = 2;
                    if ((i7 & -16384) != 0) {
                        i8 = 3;
                        if ((-2097152 & i7) != 0) {
                            i8 = 5;
                            if ((i7 & -268435456) == 0) {
                                i8 = 4;
                            }
                        }
                    }
                }
            }
            i5 += i8;
        }
        int size = A032 + i5 + this.A0I.size();
        if ((this.A01 & 512) == 512) {
            C54062gk r04 = this.A0J;
            if (r04 == null) {
                r04 = C54062gk.A03;
            }
            size += CodedOutputStream.A05(r04, 15);
        }
        int i9 = this.A01;
        if ((i9 & 1024) == 1024) {
            size += CodedOutputStream.A02(16, this.A02);
        }
        if ((i9 & 2048) == 2048) {
            size += CodedOutputStream.A02(17, this.A00);
        }
        if ((i9 & 4096) == 4096) {
            size += CodedOutputStream.A02(18, this.A05);
        }
        if ((i9 & 8192) == 8192) {
            C54082gm r05 = this.A0K;
            if (r05 == null) {
                r05 = C54082gm.A09;
            }
            size += CodedOutputStream.A05(r05, 19);
        }
        int i10 = this.A01;
        if ((i10 & 16384) == 16384) {
            size += CodedOutputStream.A00(20, this.A09);
        }
        if ((i10 & 32768) == 32768) {
            size += CodedOutputStream.A04(this.A0E, 21);
        }
        if ((i10 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            size += CodedOutputStream.A04(this.A0G, 22);
        }
        if ((i10 & 131072) == 131072) {
            size += 3;
        }
        if ((i10 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            size += CodedOutputStream.A01(24, this.A07);
        }
        if ((i10 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            size += CodedOutputStream.A00(30, this.A06);
        }
        if ((i10 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            size += 2 + CodedOutputStream.A03(this.A0C);
        }
        if ((i10 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            size += CodedOutputStream.A04(this.A0F, 32);
        }
        if ((i10 & 4194304) == 4194304) {
            size += CodedOutputStream.A04(this.A0H, 34);
        }
        if ((i10 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            size += CodedOutputStream.A01(36, this.A0B);
        }
        if ((i10 & 16777216) == 16777216) {
            size += CodedOutputStream.A01(37, this.A08);
        }
        int A002 = size + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A0C(1, this.A0D);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0E(3, this.A0P);
        }
        if ((this.A01 & 4) == 4) {
            C54022gg r0 = this.A0L;
            if (r0 == null) {
                r0 = C54022gg.A0E;
            }
            codedOutputStream.A0G(r0, 5);
        }
        if ((this.A01 & 8) == 8) {
            C54202gy r02 = this.A0M;
            if (r02 == null) {
                r02 = C54202gy.A05;
            }
            codedOutputStream.A0G(r02, 6);
        }
        if ((this.A01 & 16) == 16) {
            codedOutputStream.A0D(7, this.A0N);
        }
        if ((this.A01 & 32) == 32) {
            codedOutputStream.A08(9, this.A0A);
        }
        if ((this.A01 & 64) == 64) {
            codedOutputStream.A0E(10, this.A0Q);
        }
        if ((this.A01 & 128) == 128) {
            codedOutputStream.A09(12, this.A04);
        }
        if ((this.A01 & 256) == 256) {
            codedOutputStream.A09(13, this.A03);
        }
        for (int i2 = 0; i2 < this.A0I.size(); i2++) {
            C58132sw r03 = (C58132sw) this.A0I;
            r03.A01(i2);
            codedOutputStream.A09(14, r03.A01[i2]);
        }
        if ((this.A01 & 512) == 512) {
            C54062gk r04 = this.A0J;
            if (r04 == null) {
                r04 = C54062gk.A03;
            }
            codedOutputStream.A0G(r04, 15);
        }
        if ((this.A01 & 1024) == 1024) {
            codedOutputStream.A0A(16, this.A02);
        }
        if ((this.A01 & 2048) == 2048) {
            codedOutputStream.A0A(17, this.A00);
        }
        if ((this.A01 & 4096) == 4096) {
            codedOutputStream.A0A(18, this.A05);
        }
        if ((this.A01 & 8192) == 8192) {
            C54082gm r05 = this.A0K;
            if (r05 == null) {
                r05 = C54082gm.A09;
            }
            codedOutputStream.A0G(r05, 19);
        }
        if ((this.A01 & 16384) == 16384) {
            codedOutputStream.A09(20, this.A09);
        }
        if ((this.A01 & 32768) == 32768) {
            codedOutputStream.A0F(this.A0E, 21);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            codedOutputStream.A0F(this.A0G, 22);
        }
        if ((this.A01 & 131072) == 131072) {
            codedOutputStream.A0E(23, this.A0O);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            codedOutputStream.A09(24, this.A07);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            codedOutputStream.A09(30, this.A06);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            codedOutputStream.A0C(31, this.A0C);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            codedOutputStream.A0F(this.A0F, 32);
        }
        if ((this.A01 & 4194304) == 4194304) {
            codedOutputStream.A0F(this.A0H, 34);
        }
        if ((this.A01 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            codedOutputStream.A09(36, this.A0B);
        }
        if ((this.A01 & 16777216) == 16777216) {
            codedOutputStream.A09(37, this.A08);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
