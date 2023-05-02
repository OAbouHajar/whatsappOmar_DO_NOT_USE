package X;

import android.support.v4.view.GravityCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.google.protobuf.CodedOutputStream;

/* renamed from: X.21S  reason: invalid class name */
public final class AnonymousClass21S extends C28541Wm implements C28561Wp {
    public static final AnonymousClass21S A0R;
    public static volatile C47872Kz A0S;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public C28631Ww A07;
    public C28631Ww A08;
    public AnonymousClass1XE A09 = AnonymousClass2NE.A01;
    public C58332tK A0A;
    public C58752u2 A0B;
    public AnonymousClass21X A0C;
    public C30391cH A0D;
    public C33211iD A0E;
    public C33231iF A0F;
    public String A0G = "";
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L = "";
    public String A0M = "";
    public String A0N = "";
    public String A0O;
    public boolean A0P;
    public boolean A0Q;

    static {
        AnonymousClass21S r0 = new AnonymousClass21S();
        A0R = r0;
        r0.A0W();
    }

    public AnonymousClass21S() {
        C28631Ww r0 = C28631Ww.A01;
        this.A07 = r0;
        this.A08 = r0;
        this.A0I = "";
        this.A0H = "";
        this.A0J = "";
        this.A0K = "";
        this.A0O = "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0240, code lost:
        r15.A00 = r0 | r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r2 = r18
            r8 = r17
            int r0 = r16.ordinal()
            r4 = 0
            switch(r0) {
                case 0: goto L_0x0515;
                case 1: goto L_0x02b1;
                case 2: goto L_0x002e;
                case 3: goto L_0x050d;
                case 4: goto L_0x0518;
                case 5: goto L_0x0507;
                case 6: goto L_0x0290;
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
            java.lang.Class<X.21S> r2 = X.AnonymousClass21S.class
            monitor-enter(r2)
            X.2Kz r0 = A0S     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            X.21S r1 = A0R     // Catch:{ all -> 0x0028 }
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
            X.2Ky r2 = (X.C47862Ky) r2
        L_0x0032:
            int r0 = r8.A03()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r3 = 1
            switch(r0) {
                case 0: goto L_0x0290;
                case 10: goto L_0x0042;
                case 18: goto L_0x004e;
                case 26: goto L_0x005b;
                case 34: goto L_0x008c;
                case 122: goto L_0x0099;
                case 146: goto L_0x00b0;
                case 154: goto L_0x00be;
                case 160: goto L_0x00cc;
                case 168: goto L_0x00da;
                case 176: goto L_0x00e8;
                case 186: goto L_0x00f6;
                case 194: goto L_0x0127;
                case 200: goto L_0x0158;
                case 208: goto L_0x0166;
                case 218: goto L_0x0174;
                case 226: goto L_0x0182;
                case 234: goto L_0x01b3;
                case 242: goto L_0x01c3;
                case 248: goto L_0x01d2;
                case 258: goto L_0x01e1;
                case 266: goto L_0x0211;
                case 274: goto L_0x0245;
                case 282: goto L_0x0254;
                case 298: goto L_0x0263;
                case 304: goto L_0x0272;
                case 312: goto L_0x0281;
                default: goto L_0x003a;
            }     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x003a:
            boolean r0 = r15.A0a(r8, r0)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            if (r0 != 0) goto L_0x0032
            goto L_0x0290
        L_0x0042:
            java.lang.String r1 = r8.A0A()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r3 = r3 | r0
            r15.A00 = r3     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0N = r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x004e:
            java.lang.String r1 = r8.A0A()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = r0 | 2
            r15.A00 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0L = r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x005b:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r3 = 4
            r0 = r0 & 4
            if (r0 != r3) goto L_0x0079
            X.1iD r0 = r15.A0E     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1iE r1 = (X.C33221iE) r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x006a:
            X.1iD r0 = X.C33211iD.A0o     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wo r0 = r8.A09(r2, r0)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1iD r0 = (X.C33211iD) r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0E = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x007b
        L_0x0079:
            r1 = r4
            goto L_0x006a
        L_0x007b:
            if (r1 == 0) goto L_0x0088
            r1.A04(r0)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1iD r0 = (X.C33211iD) r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0E = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x0088:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0240
        L_0x008c:
            java.lang.String r1 = r8.A0A()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = r0 | 8
            r15.A00 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0M = r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x0099:
            java.lang.String r3 = r8.A0A()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1XE r1 = r15.A09     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            boolean r0 = r0.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            if (r0 != 0) goto L_0x00ac
            X.1XE r1 = X.C28541Wm.A0G(r1)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A09 = r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x00ac:
            r1.add(r3)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x00b0:
            java.lang.String r1 = r8.A0A()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = r0 | 16
            r15.A00 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0G = r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x00be:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = r0 | 32
            r15.A00 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Ww r0 = r8.A08()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A07 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x00cc:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = r0 | 64
            r15.A00 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A01 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x00da:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r15.A00 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A04 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x00e8:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = r0 | 256(0x100, float:3.59E-43)
            r15.A00 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            boolean r0 = r8.A0F()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0P = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x00f6:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r3 = 512(0x200, float:7.175E-43)
            r0 = r0 & r3
            if (r0 != r3) goto L_0x0114
            X.2u2 r0 = r15.A0B     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.3dQ r1 = (X.C68433dQ) r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x0105:
            X.2u2 r0 = X.C58752u2.A05     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wo r0 = r8.A09(r2, r0)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.2u2 r0 = (X.C58752u2) r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0B = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0116
        L_0x0114:
            r1 = r4
            goto L_0x0105
        L_0x0116:
            if (r1 == 0) goto L_0x0123
            r1.A04(r0)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.2u2 r0 = (X.C58752u2) r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0B = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x0123:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0240
        L_0x0127:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r3 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r3
            if (r0 != r3) goto L_0x0145
            X.1iF r0 = r15.A0F     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1iG r1 = (X.C33241iG) r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x0136:
            X.1iF r0 = X.C33231iF.A05     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wo r0 = r8.A09(r2, r0)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1iF r0 = (X.C33231iF) r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0F = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0147
        L_0x0145:
            r1 = r4
            goto L_0x0136
        L_0x0147:
            if (r1 == 0) goto L_0x0154
            r1.A04(r0)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1iF r0 = (X.C33231iF) r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0F = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x0154:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0240
        L_0x0158:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r15.A00 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A03 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x0166:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r15.A00 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            long r0 = r8.A06()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A06 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x0174:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r15.A00 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Ww r0 = r8.A08()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A08 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x0182:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r3 = 16384(0x4000, float:2.2959E-41)
            r0 = r0 & r3
            if (r0 != r3) goto L_0x01a0
            X.21X r0 = r15.A0C     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.3dR r1 = (X.C68443dR) r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x0191:
            X.21X r0 = X.AnonymousClass21X.A0E     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wo r0 = r8.A09(r2, r0)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.21X r0 = (X.AnonymousClass21X) r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0C = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x01a2
        L_0x01a0:
            r1 = r4
            goto L_0x0191
        L_0x01a2:
            if (r1 == 0) goto L_0x01af
            r1.A04(r0)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.21X r0 = (X.AnonymousClass21X) r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0C = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x01af:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0240
        L_0x01b3:
            java.lang.String r3 = r8.A0A()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r1 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r15.A00 = r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0I = r3     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x01c3:
            java.lang.String r3 = r8.A0A()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r1 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r15.A00 = r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0H = r3     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x01d2:
            int r1 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r15.A00 = r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A02 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x01e1:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r3 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r3
            if (r0 != r3) goto L_0x01ff
            X.1cH r0 = r15.A0D     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1cI r1 = (X.C30401cI) r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x01f0:
            X.1cH r0 = X.C30391cH.A02     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wo r0 = r8.A09(r2, r0)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1cH r0 = (X.C30391cH) r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0D = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0201
        L_0x01ff:
            r1 = r4
            goto L_0x01f0
        L_0x0201:
            if (r1 == 0) goto L_0x020e
            r1.A04(r0)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1cH r0 = (X.C30391cH) r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0D = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x020e:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0240
        L_0x0211:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r3 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r3
            if (r0 != r3) goto L_0x022f
            X.2tK r0 = r15.A0A     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.3dP r1 = (X.C68423dP) r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x0220:
            X.2tK r0 = X.C58332tK.A03     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wo r0 = r8.A09(r2, r0)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.2tK r0 = (X.C58332tK) r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0A = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0231
        L_0x022f:
            r1 = r4
            goto L_0x0220
        L_0x0231:
            if (r1 == 0) goto L_0x023e
            r1.A04(r0)     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            X.2tK r0 = (X.C58332tK) r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0A = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x023e:
            int r0 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
        L_0x0240:
            r0 = r0 | r3
            r15.A00 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x0245:
            java.lang.String r3 = r8.A0A()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r1 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r15.A00 = r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0J = r3     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x0254:
            java.lang.String r3 = r8.A0A()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r1 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r15.A00 = r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0K = r3     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x0263:
            java.lang.String r3 = r8.A0A()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r1 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r15.A00 = r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0O = r3     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x0272:
            int r1 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r15.A00 = r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A05 = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x0281:
            int r1 = r15.A00     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r0
            r15.A00 = r1     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            boolean r0 = r8.A0F()     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            r15.A0Q = r0     // Catch:{ 1bD -> 0x0295, IOException -> 0x0293 }
            goto L_0x0032
        L_0x0290:
            X.21S r0 = A0R
            return r0
        L_0x0293:
            r0 = move-exception
            goto L_0x029e
        L_0x0295:
            r0 = move-exception
            r0.unfinishedMessage = r15     // Catch:{ all -> 0x02af }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x02af }
            r1.<init>(r0)     // Catch:{ all -> 0x02af }
            goto L_0x02ae
        L_0x029e:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x02af }
            X.1bD r0 = new X.1bD     // Catch:{ all -> 0x02af }
            r0.<init>(r1)     // Catch:{ all -> 0x02af }
            r0.unfinishedMessage = r15     // Catch:{ all -> 0x02af }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x02af }
            r1.<init>(r0)     // Catch:{ all -> 0x02af }
        L_0x02ae:
            throw r1     // Catch:{ all -> 0x02af }
        L_0x02af:
            r0 = move-exception
            throw r0
        L_0x02b1:
            X.2L6 r8 = (X.AnonymousClass2L6) r8
            X.21S r2 = (X.AnonymousClass21S) r2
            int r6 = r15.A00
            r5 = 1
            r0 = r6 & 1
            if (r0 == r5) goto L_0x02bd
            r5 = 0
        L_0x02bd:
            java.lang.String r4 = r15.A0N
            int r3 = r2.A00
            r1 = 1
            r0 = r3 & 1
            if (r0 == r1) goto L_0x02c7
            r1 = 0
        L_0x02c7:
            java.lang.String r0 = r2.A0N
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0N = r0
            r1 = 2
            r0 = r6 & 2
            r5 = 0
            if (r0 != r1) goto L_0x02d6
            r5 = 1
        L_0x02d6:
            java.lang.String r4 = r15.A0L
            r3 = r3 & 2
            r0 = 2
            r1 = 0
            if (r3 != r0) goto L_0x02df
            r1 = 1
        L_0x02df:
            java.lang.String r0 = r2.A0L
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0L = r0
            X.1iD r1 = r15.A0E
            X.1iD r0 = r2.A0E
            X.1Wo r0 = r8.Ahu(r1, r0)
            X.1iD r0 = (X.C33211iD) r0
            r15.A0E = r0
            int r0 = r15.A00
            r1 = 8
            r0 = r0 & 8
            r5 = 0
            if (r0 != r1) goto L_0x02fd
            r5 = 1
        L_0x02fd:
            java.lang.String r4 = r15.A0M
            int r0 = r2.A00
            r3 = r0 & 8
            r0 = 8
            r1 = 0
            if (r3 != r0) goto L_0x0309
            r1 = 1
        L_0x0309:
            java.lang.String r0 = r2.A0M
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0M = r0
            X.1XE r1 = r15.A09
            X.1XE r0 = r2.A09
            X.1XE r0 = r8.Ahs(r1, r0)
            r15.A09 = r0
            int r7 = r15.A00
            r1 = 16
            r0 = r7 & 16
            r5 = 0
            if (r0 != r1) goto L_0x0325
            r5 = 1
        L_0x0325:
            java.lang.String r4 = r15.A0G
            int r6 = r2.A00
            r3 = r6 & 16
            r0 = 16
            r1 = 0
            if (r3 != r0) goto L_0x0331
            r1 = 1
        L_0x0331:
            java.lang.String r0 = r2.A0G
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0G = r0
            r1 = 32
            r0 = r7 & 32
            r5 = 0
            if (r0 != r1) goto L_0x0341
            r5 = 1
        L_0x0341:
            X.1Ww r4 = r15.A07
            r3 = r6 & 32
            r0 = 32
            r1 = 0
            if (r3 != r0) goto L_0x034b
            r1 = 1
        L_0x034b:
            X.1Ww r0 = r2.A07
            X.1Ww r0 = r8.Ahn(r4, r0, r5, r1)
            r15.A07 = r0
            int r7 = r15.A00
            r1 = 64
            r0 = r7 & 64
            r5 = 0
            if (r0 != r1) goto L_0x035d
            r5 = 1
        L_0x035d:
            int r4 = r15.A01
            int r6 = r2.A00
            r3 = r6 & 64
            r0 = 64
            r1 = 0
            if (r3 != r0) goto L_0x0369
            r1 = 1
        L_0x0369:
            int r0 = r2.A01
            int r0 = r8.Ahq(r4, r0, r5, r1)
            r15.A01 = r0
            r1 = 128(0x80, float:1.794E-43)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x0379
            r5 = 1
        L_0x0379:
            int r4 = r15.A04
            r3 = r6 & r1
            r0 = 128(0x80, float:1.794E-43)
            r1 = 0
            if (r3 != r0) goto L_0x0383
            r1 = 1
        L_0x0383:
            int r0 = r2.A04
            int r0 = r8.Ahq(r4, r0, r5, r1)
            r15.A04 = r0
            r0 = 256(0x100, float:3.59E-43)
            r7 = r7 & r0
            r4 = 0
            if (r7 != r0) goto L_0x0392
            r4 = 1
        L_0x0392:
            boolean r3 = r15.A0P
            r6 = r6 & r0
            r1 = 0
            if (r6 != r0) goto L_0x0399
            r1 = 1
        L_0x0399:
            boolean r0 = r2.A0P
            boolean r0 = r8.Ahm(r4, r3, r1, r0)
            r15.A0P = r0
            X.2u2 r1 = r15.A0B
            X.2u2 r0 = r2.A0B
            X.1Wo r0 = r8.Ahu(r1, r0)
            X.2u2 r0 = (X.C58752u2) r0
            r15.A0B = r0
            X.1iF r1 = r15.A0F
            X.1iF r0 = r2.A0F
            X.1Wo r0 = r8.Ahu(r1, r0)
            X.1iF r0 = (X.C33231iF) r0
            r15.A0F = r0
            int r3 = r15.A00
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r3 & r1
            r7 = 0
            if (r0 != r1) goto L_0x03c3
            r7 = 1
        L_0x03c3:
            int r6 = r15.A03
            int r5 = r2.A00
            r4 = r5 & r1
            r0 = 2048(0x800, float:2.87E-42)
            r1 = 0
            if (r4 != r0) goto L_0x03cf
            r1 = 1
        L_0x03cf:
            int r0 = r2.A03
            int r0 = r8.Ahq(r6, r0, r7, r1)
            r15.A03 = r0
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r3 & r1
            r13 = 0
            if (r0 != r1) goto L_0x03df
            r13 = 1
        L_0x03df:
            long r9 = r15.A06
            r0 = r5 & r1
            r14 = 0
            if (r0 != r1) goto L_0x03e7
            r14 = 1
        L_0x03e7:
            long r11 = r2.A06
            long r0 = r8.Aht(r9, r11, r13, r14)
            r15.A06 = r0
            r0 = 8192(0x2000, float:1.14794E-41)
            r3 = r3 & r0
            r4 = 0
            if (r3 != r0) goto L_0x03f6
            r4 = 1
        L_0x03f6:
            X.1Ww r3 = r15.A08
            r5 = r5 & r0
            r1 = 0
            if (r5 != r0) goto L_0x03fd
            r1 = 1
        L_0x03fd:
            X.1Ww r0 = r2.A08
            X.1Ww r0 = r8.Ahn(r3, r0, r4, r1)
            r15.A08 = r0
            X.21X r1 = r15.A0C
            X.21X r0 = r2.A0C
            X.1Wo r0 = r8.Ahu(r1, r0)
            X.21X r0 = (X.AnonymousClass21X) r0
            r15.A0C = r0
            int r7 = r15.A00
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x041c
            r5 = 1
        L_0x041c:
            java.lang.String r4 = r15.A0I
            int r6 = r2.A00
            r3 = r6 & r1
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = 0
            if (r3 != r0) goto L_0x0429
            r1 = 1
        L_0x0429:
            java.lang.String r0 = r2.A0I
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0I = r0
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x0439
            r5 = 1
        L_0x0439:
            java.lang.String r4 = r15.A0H
            r3 = r6 & r1
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = 0
            if (r3 != r0) goto L_0x0443
            r1 = 1
        L_0x0443:
            java.lang.String r0 = r2.A0H
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0H = r0
            r0 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 & r0
            r4 = 0
            if (r7 != r0) goto L_0x0452
            r4 = 1
        L_0x0452:
            int r3 = r15.A02
            r6 = r6 & r0
            r1 = 0
            if (r6 != r0) goto L_0x0459
            r1 = 1
        L_0x0459:
            int r0 = r2.A02
            int r0 = r8.Ahq(r3, r0, r4, r1)
            r15.A02 = r0
            X.1cH r1 = r15.A0D
            X.1cH r0 = r2.A0D
            X.1Wo r0 = r8.Ahu(r1, r0)
            X.1cH r0 = (X.C30391cH) r0
            r15.A0D = r0
            X.2tK r1 = r15.A0A
            X.2tK r0 = r2.A0A
            X.1Wo r0 = r8.Ahu(r1, r0)
            X.2tK r0 = (X.C58332tK) r0
            r15.A0A = r0
            int r7 = r15.A00
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x0483
            r5 = 1
        L_0x0483:
            java.lang.String r4 = r15.A0J
            int r6 = r2.A00
            r3 = r6 & r1
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = 0
            if (r3 != r0) goto L_0x048f
            r1 = 1
        L_0x048f:
            java.lang.String r0 = r2.A0J
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0J = r0
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x049f
            r5 = 1
        L_0x049f:
            java.lang.String r4 = r15.A0K
            r3 = r6 & r1
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = 0
            if (r3 != r0) goto L_0x04a9
            r1 = 1
        L_0x04a9:
            java.lang.String r0 = r2.A0K
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0K = r0
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x04b9
            r5 = 1
        L_0x04b9:
            java.lang.String r4 = r15.A0O
            r3 = r6 & r1
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = 0
            if (r3 != r0) goto L_0x04c3
            r1 = 1
        L_0x04c3:
            java.lang.String r0 = r2.A0O
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0O = r0
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x04d3
            r5 = 1
        L_0x04d3:
            int r4 = r15.A05
            r3 = r6 & r1
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = 0
            if (r3 != r0) goto L_0x04dd
            r1 = 1
        L_0x04dd:
            int r0 = r2.A05
            int r0 = r8.Ahq(r4, r0, r5, r1)
            r15.A05 = r0
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x04ed
            r5 = 1
        L_0x04ed:
            boolean r4 = r15.A0Q
            r3 = r6 & r1
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = 0
            if (r3 != r0) goto L_0x04f7
            r1 = 1
        L_0x04f7:
            boolean r0 = r2.A0Q
            boolean r0 = r8.Ahm(r5, r4, r1, r0)
            r15.A0Q = r0
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r8 != r0) goto L_0x0506
            r7 = r7 | r6
            r15.A00 = r7
        L_0x0506:
            return r15
        L_0x0507:
            X.21T r0 = new X.21T
            r0.<init>()
            return r0
        L_0x050d:
            X.1XE r1 = r15.A09
            X.1XF r1 = (X.AnonymousClass1XF) r1
            r0 = 0
            r1.A00 = r0
            return r4
        L_0x0515:
            X.21S r0 = A0R
            return r0
        L_0x0518:
            X.21S r0 = new X.21S
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass21S.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A062 = (this.A00 & 1) == 1 ? 1 + CodedOutputStream.A06(this.A0N) : 0;
        if ((this.A00 & 2) == 2) {
            A062 += 1 + CodedOutputStream.A06(this.A0L);
        }
        if ((this.A00 & 4) == 4) {
            C33211iD r0 = this.A0E;
            if (r0 == null) {
                r0 = C33211iD.A0o;
            }
            A062 += CodedOutputStream.A05(r0, 3);
        }
        if ((this.A00 & 8) == 8) {
            A062 += 1 + CodedOutputStream.A06(this.A0M);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A09.size(); i4++) {
            i3 += CodedOutputStream.A06((String) this.A09.get(i4));
        }
        int size = A062 + i3 + this.A09.size();
        if ((this.A00 & 16) == 16) {
            size += 2 + CodedOutputStream.A06(this.A0G);
        }
        int i5 = this.A00;
        if ((i5 & 32) == 32) {
            size += CodedOutputStream.A04(this.A07, 19);
        }
        if ((i5 & 64) == 64) {
            size += CodedOutputStream.A02(20, this.A01);
        }
        if ((i5 & 128) == 128) {
            size += CodedOutputStream.A02(21, this.A04);
        }
        if ((i5 & 256) == 256) {
            size += 3;
        }
        if ((i5 & 512) == 512) {
            C58752u2 r02 = this.A0B;
            if (r02 == null) {
                r02 = C58752u2.A05;
            }
            size += CodedOutputStream.A05(r02, 23);
        }
        if ((this.A00 & 1024) == 1024) {
            C33231iF r03 = this.A0F;
            if (r03 == null) {
                r03 = C33231iF.A05;
            }
            size += CodedOutputStream.A05(r03, 24);
        }
        int i6 = this.A00;
        if ((i6 & 2048) == 2048) {
            size += CodedOutputStream.A02(25, this.A03);
        }
        if ((i6 & 4096) == 4096) {
            size += 2 + CodedOutputStream.A03(this.A06);
        }
        if ((i6 & 8192) == 8192) {
            size += CodedOutputStream.A04(this.A08, 27);
        }
        if ((i6 & 16384) == 16384) {
            AnonymousClass21X r04 = this.A0C;
            if (r04 == null) {
                r04 = AnonymousClass21X.A0E;
            }
            size += CodedOutputStream.A05(r04, 28);
        }
        if ((this.A00 & 32768) == 32768) {
            size += 2 + CodedOutputStream.A06(this.A0I);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            size += 2 + CodedOutputStream.A06(this.A0H);
        }
        int i7 = this.A00;
        if ((i7 & 131072) == 131072) {
            size += CodedOutputStream.A02(31, this.A02);
        }
        if ((i7 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            C30391cH r05 = this.A0D;
            if (r05 == null) {
                r05 = C30391cH.A02;
            }
            size += CodedOutputStream.A05(r05, 32);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            C58332tK r06 = this.A0A;
            if (r06 == null) {
                r06 = C58332tK.A03;
            }
            size += CodedOutputStream.A05(r06, 33);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            size += 2 + CodedOutputStream.A06(this.A0J);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            size += 2 + CodedOutputStream.A06(this.A0K);
        }
        if ((this.A00 & 4194304) == 4194304) {
            size += 2 + CodedOutputStream.A06(this.A0O);
        }
        int i8 = this.A00;
        if ((i8 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            size += CodedOutputStream.A02(38, this.A05);
        }
        if ((i8 & 16777216) == 16777216) {
            size += 3;
        }
        int A002 = size + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A0N);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A0L);
        }
        if ((this.A00 & 4) == 4) {
            C33211iD r0 = this.A0E;
            if (r0 == null) {
                r0 = C33211iD.A0o;
            }
            codedOutputStream.A0G(r0, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0D(4, this.A0M);
        }
        for (int i2 = 0; i2 < this.A09.size(); i2++) {
            codedOutputStream.A0D(15, (String) this.A09.get(i2));
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0D(18, this.A0G);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0F(this.A07, 19);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0A(20, this.A01);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0A(21, this.A04);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0E(22, this.A0P);
        }
        if ((this.A00 & 512) == 512) {
            C58752u2 r02 = this.A0B;
            if (r02 == null) {
                r02 = C58752u2.A05;
            }
            codedOutputStream.A0G(r02, 23);
        }
        if ((this.A00 & 1024) == 1024) {
            C33231iF r03 = this.A0F;
            if (r03 == null) {
                r03 = C33231iF.A05;
            }
            codedOutputStream.A0G(r03, 24);
        }
        if ((this.A00 & 2048) == 2048) {
            codedOutputStream.A0A(25, this.A03);
        }
        if ((this.A00 & 4096) == 4096) {
            codedOutputStream.A0C(26, this.A06);
        }
        if ((this.A00 & 8192) == 8192) {
            codedOutputStream.A0F(this.A08, 27);
        }
        if ((this.A00 & 16384) == 16384) {
            AnonymousClass21X r04 = this.A0C;
            if (r04 == null) {
                r04 = AnonymousClass21X.A0E;
            }
            codedOutputStream.A0G(r04, 28);
        }
        if ((this.A00 & 32768) == 32768) {
            codedOutputStream.A0D(29, this.A0I);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            codedOutputStream.A0D(30, this.A0H);
        }
        if ((this.A00 & 131072) == 131072) {
            codedOutputStream.A0A(31, this.A02);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            C30391cH r05 = this.A0D;
            if (r05 == null) {
                r05 = C30391cH.A02;
            }
            codedOutputStream.A0G(r05, 32);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            C58332tK r06 = this.A0A;
            if (r06 == null) {
                r06 = C58332tK.A03;
            }
            codedOutputStream.A0G(r06, 33);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            codedOutputStream.A0D(34, this.A0J);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            codedOutputStream.A0D(35, this.A0K);
        }
        if ((this.A00 & 4194304) == 4194304) {
            codedOutputStream.A0D(37, this.A0O);
        }
        if ((this.A00 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            codedOutputStream.A0A(38, this.A05);
        }
        if ((this.A00 & 16777216) == 16777216) {
            codedOutputStream.A0E(39, this.A0Q);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
