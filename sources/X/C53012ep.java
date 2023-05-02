package X;

import android.support.v4.view.GravityCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2ep  reason: invalid class name and case insensitive filesystem */
public final class C53012ep extends C28541Wm implements C28561Wp {
    public static final C53012ep A0P;
    public static volatile C47872Kz A0Q;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public C28631Ww A0A;
    public C28631Ww A0B;
    public C28631Ww A0C;
    public C28631Ww A0D;
    public C28631Ww A0E;
    public AnonymousClass21S A0F;
    public String A0G = "";
    public String A0H = "";
    public String A0I;
    public String A0J = "";
    public String A0K = "";
    public String A0L;
    public String A0M = "";
    public boolean A0N;
    public boolean A0O;

    static {
        C53012ep r0 = new C53012ep();
        A0P = r0;
        r0.A0W();
    }

    public C53012ep() {
        C28631Ww r0 = C28631Ww.A01;
        this.A0B = r0;
        this.A0L = "";
        this.A0E = r0;
        this.A0D = r0;
        this.A0C = r0;
        this.A0I = "";
        this.A0A = r0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        super.A0X(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r2 = r18
            r8 = r17
            int r0 = r16.ordinal()
            r5 = 0
            switch(r0) {
                case 0: goto L_0x0472;
                case 1: goto L_0x0202;
                case 2: goto L_0x002e;
                case 3: goto L_0x0471;
                case 4: goto L_0x0475;
                case 5: goto L_0x046b;
                case 6: goto L_0x01e1;
                case 7: goto L_0x0012;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0012:
            X.2Kz r0 = A0Q
            if (r0 != 0) goto L_0x002b
            java.lang.Class<X.2ep> r2 = X.C53012ep.class
            monitor-enter(r2)
            X.2Kz r0 = A0Q     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            X.2ep r1 = A0P     // Catch:{ all -> 0x0028 }
            X.2Kz r0 = new X.2Kz     // Catch:{ all -> 0x0028 }
            r0.<init>(r1)     // Catch:{ all -> 0x0028 }
            A0Q = r0     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            X.2Kz r0 = A0Q
            return r0
        L_0x002e:
            X.2Kx r8 = (X.C47852Kx) r8
            X.2Ky r2 = (X.C47862Ky) r2
        L_0x0032:
            int r0 = r8.A03()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r4 = 1
            switch(r0) {
                case 0: goto L_0x01e1;
                case 10: goto L_0x009d;
                case 18: goto L_0x00a9;
                case 34: goto L_0x00b7;
                case 42: goto L_0x00c5;
                case 50: goto L_0x00d3;
                case 61: goto L_0x00e1;
                case 69: goto L_0x00ef;
                case 72: goto L_0x0042;
                case 80: goto L_0x0058;
                case 130: goto L_0x00fd;
                case 138: goto L_0x010b;
                case 144: goto L_0x013f;
                case 154: goto L_0x014d;
                case 162: goto L_0x015b;
                case 170: goto L_0x0169;
                case 178: goto L_0x0177;
                case 184: goto L_0x0187;
                case 192: goto L_0x0196;
                case 200: goto L_0x01a5;
                case 208: goto L_0x006c;
                case 218: goto L_0x01b4;
                case 226: goto L_0x01c3;
                case 232: goto L_0x0083;
                case 240: goto L_0x01d2;
                default: goto L_0x003a;
            }     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
        L_0x003a:
            boolean r0 = r15.A0a(r8, r0)     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            if (r0 != 0) goto L_0x0032
            goto L_0x01e1
        L_0x0042:
            int r3 = r8.A02()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.435 r0 = X.AnonymousClass435.A00(r3)     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            if (r0 != 0) goto L_0x004f
            r0 = 9
            goto L_0x008f
        L_0x004f:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A02 = r3     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x0058:
            int r3 = r8.A02()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            if (r3 == 0) goto L_0x0063
            if (r3 == r4) goto L_0x0063
            r0 = 10
            goto L_0x008f
        L_0x0063:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | 256(0x100, float:3.59E-43)
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A05 = r3     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x006c:
            int r3 = r8.A02()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.431 r0 = X.AnonymousClass431.A00(r3)     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            if (r0 != 0) goto L_0x0079
            r0 = 26
            goto L_0x008f
        L_0x0079:
            int r1 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r15.A01 = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A04 = r3     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x0083:
            int r3 = r8.A02()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.431 r0 = X.AnonymousClass431.A00(r3)     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            if (r0 != 0) goto L_0x0093
            r0 = 29
        L_0x008f:
            super.A0X(r0, r3)     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x0093:
            int r1 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r15.A01 = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A03 = r3     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x009d:
            java.lang.String r1 = r8.A0A()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r4 = r4 | r0
            r15.A01 = r4     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0K = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x00a9:
            java.lang.String r1 = r8.A0A()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | 2
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0J = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x00b7:
            java.lang.String r1 = r8.A0A()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | 4
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0G = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x00c5:
            java.lang.String r1 = r8.A0A()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | 8
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0H = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x00d3:
            java.lang.String r1 = r8.A0A()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | 16
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0M = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x00e1:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | 32
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            int r0 = r8.A01()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A06 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x00ef:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | 64
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            int r0 = r8.A01()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A00 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x00fd:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | 512(0x200, float:7.175E-43)
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.1Ww r0 = r8.A08()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0B = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x010b:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r3 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r3
            if (r0 != r3) goto L_0x0129
            X.21S r0 = r15.A0F     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.1Wr r1 = r0.A0U()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.21T r1 = (X.AnonymousClass21T) r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
        L_0x011a:
            X.21S r0 = X.AnonymousClass21S.A0R     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.2Kz r0 = r0.A0V()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.1Wo r0 = r8.A09(r2, r0)     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.21S r0 = (X.AnonymousClass21S) r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0F = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x012b
        L_0x0129:
            r1 = r5
            goto L_0x011a
        L_0x012b:
            if (r1 == 0) goto L_0x0138
            r1.A04(r0)     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.1Wm r0 = r1.A01()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.21S r0 = (X.AnonymousClass21S) r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0F = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
        L_0x0138:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | r3
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x013f:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            boolean r0 = r8.A0F()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0N = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x014d:
            java.lang.String r1 = r8.A0A()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0L = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x015b:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.1Ww r0 = r8.A08()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0E = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x0169:
            int r0 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r15.A01 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.1Ww r0 = r8.A08()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0D = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x0177:
            int r1 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r15.A01 = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.1Ww r0 = r8.A08()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0C = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x0187:
            int r1 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r15.A01 = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            long r0 = r8.A06()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A09 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x0196:
            int r1 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r15.A01 = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A07 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x01a5:
            int r1 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r15.A01 = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            int r0 = r8.A02()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A08 = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x01b4:
            java.lang.String r3 = r8.A0A()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            int r1 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r15.A01 = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0I = r3     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x01c3:
            int r1 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r15.A01 = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            X.1Ww r0 = r8.A08()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0A = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x01d2:
            int r1 = r15.A01     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r15.A01 = r1     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            boolean r0 = r8.A0F()     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            r15.A0O = r0     // Catch:{ 1bD -> 0x01e6, IOException -> 0x01e4 }
            goto L_0x0032
        L_0x01e1:
            X.2ep r0 = A0P
            return r0
        L_0x01e4:
            r0 = move-exception
            goto L_0x01ef
        L_0x01e6:
            r0 = move-exception
            r0.unfinishedMessage = r15     // Catch:{ all -> 0x0200 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0200 }
            r1.<init>(r0)     // Catch:{ all -> 0x0200 }
            goto L_0x01ff
        L_0x01ef:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0200 }
            X.1bD r0 = new X.1bD     // Catch:{ all -> 0x0200 }
            r0.<init>(r1)     // Catch:{ all -> 0x0200 }
            r0.unfinishedMessage = r15     // Catch:{ all -> 0x0200 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0200 }
            r1.<init>(r0)     // Catch:{ all -> 0x0200 }
        L_0x01ff:
            throw r1     // Catch:{ all -> 0x0200 }
        L_0x0200:
            r0 = move-exception
            throw r0
        L_0x0202:
            X.2L6 r8 = (X.AnonymousClass2L6) r8
            X.2ep r2 = (X.C53012ep) r2
            int r7 = r15.A01
            r4 = 1
            r0 = r7 & 1
            if (r0 == r4) goto L_0x020e
            r4 = 0
        L_0x020e:
            java.lang.String r3 = r15.A0K
            int r6 = r2.A01
            r1 = 1
            r0 = r6 & 1
            if (r0 == r1) goto L_0x0218
            r1 = 0
        L_0x0218:
            java.lang.String r0 = r2.A0K
            java.lang.String r0 = r8.Ahz(r3, r0, r4, r1)
            r15.A0K = r0
            r1 = 2
            r0 = r7 & 2
            r5 = 0
            if (r0 != r1) goto L_0x0227
            r5 = 1
        L_0x0227:
            java.lang.String r4 = r15.A0J
            r3 = r6 & 2
            r0 = 2
            r1 = 0
            if (r3 != r0) goto L_0x0230
            r1 = 1
        L_0x0230:
            java.lang.String r0 = r2.A0J
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0J = r0
            r1 = 4
            r0 = r7 & 4
            r5 = 0
            if (r0 != r1) goto L_0x023f
            r5 = 1
        L_0x023f:
            java.lang.String r4 = r15.A0G
            r3 = r6 & 4
            r0 = 4
            r1 = 0
            if (r3 != r0) goto L_0x0248
            r1 = 1
        L_0x0248:
            java.lang.String r0 = r2.A0G
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0G = r0
            r1 = 8
            r0 = r7 & 8
            r5 = 0
            if (r0 != r1) goto L_0x0258
            r5 = 1
        L_0x0258:
            java.lang.String r4 = r15.A0H
            r3 = r6 & 8
            r0 = 8
            r1 = 0
            if (r3 != r0) goto L_0x0262
            r1 = 1
        L_0x0262:
            java.lang.String r0 = r2.A0H
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0H = r0
            r1 = 16
            r0 = r7 & 16
            r5 = 0
            if (r0 != r1) goto L_0x0272
            r5 = 1
        L_0x0272:
            java.lang.String r4 = r15.A0M
            r3 = r6 & 16
            r0 = 16
            r1 = 0
            if (r3 != r0) goto L_0x027c
            r1 = 1
        L_0x027c:
            java.lang.String r0 = r2.A0M
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0M = r0
            r1 = 32
            r0 = r7 & 32
            r5 = 0
            if (r0 != r1) goto L_0x028c
            r5 = 1
        L_0x028c:
            int r4 = r15.A06
            r3 = r6 & 32
            r0 = 32
            r1 = 0
            if (r3 != r0) goto L_0x0296
            r1 = 1
        L_0x0296:
            int r0 = r2.A06
            int r0 = r8.Ahq(r4, r0, r5, r1)
            r15.A06 = r0
            r1 = 64
            r0 = r7 & 64
            r5 = 0
            if (r0 != r1) goto L_0x02a6
            r5 = 1
        L_0x02a6:
            int r4 = r15.A00
            r3 = r6 & 64
            r0 = 64
            r1 = 0
            if (r3 != r0) goto L_0x02b0
            r1 = 1
        L_0x02b0:
            int r0 = r2.A00
            int r0 = r8.Ahq(r4, r0, r5, r1)
            r15.A00 = r0
            r1 = 128(0x80, float:1.794E-43)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x02c0
            r5 = 1
        L_0x02c0:
            int r4 = r15.A02
            r3 = r6 & r1
            r0 = 128(0x80, float:1.794E-43)
            r1 = 0
            if (r3 != r0) goto L_0x02ca
            r1 = 1
        L_0x02ca:
            int r0 = r2.A02
            int r0 = r8.Ahq(r4, r0, r5, r1)
            r15.A02 = r0
            r1 = 256(0x100, float:3.59E-43)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x02da
            r5 = 1
        L_0x02da:
            int r4 = r15.A05
            r3 = r6 & r1
            r0 = 256(0x100, float:3.59E-43)
            r1 = 0
            if (r3 != r0) goto L_0x02e4
            r1 = 1
        L_0x02e4:
            int r0 = r2.A05
            int r0 = r8.Ahq(r4, r0, r5, r1)
            r15.A05 = r0
            r0 = 512(0x200, float:7.175E-43)
            r7 = r7 & r0
            r4 = 0
            if (r7 != r0) goto L_0x02f3
            r4 = 1
        L_0x02f3:
            X.1Ww r3 = r15.A0B
            r6 = r6 & r0
            r1 = 0
            if (r6 != r0) goto L_0x02fa
            r1 = 1
        L_0x02fa:
            X.1Ww r0 = r2.A0B
            X.1Ww r0 = r8.Ahn(r3, r0, r4, r1)
            r15.A0B = r0
            X.21S r1 = r15.A0F
            X.21S r0 = r2.A0F
            X.1Wo r0 = r8.Ahu(r1, r0)
            X.21S r0 = (X.AnonymousClass21S) r0
            r15.A0F = r0
            int r7 = r15.A01
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x0318
            r5 = 1
        L_0x0318:
            boolean r4 = r15.A0N
            int r6 = r2.A01
            r3 = r6 & r1
            r0 = 2048(0x800, float:2.87E-42)
            r1 = 0
            if (r3 != r0) goto L_0x0324
            r1 = 1
        L_0x0324:
            boolean r0 = r2.A0N
            boolean r0 = r8.Ahm(r5, r4, r1, r0)
            r15.A0N = r0
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x0334
            r5 = 1
        L_0x0334:
            java.lang.String r4 = r15.A0L
            r3 = r6 & r1
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 0
            if (r3 != r0) goto L_0x033e
            r1 = 1
        L_0x033e:
            java.lang.String r0 = r2.A0L
            java.lang.String r0 = r8.Ahz(r4, r0, r5, r1)
            r15.A0L = r0
            r0 = 8192(0x2000, float:1.14794E-41)
            r7 = r7 & r0
            r4 = 0
            if (r7 != r0) goto L_0x034d
            r4 = 1
        L_0x034d:
            X.1Ww r3 = r15.A0E
            r6 = r6 & r0
            r1 = 0
            if (r6 != r0) goto L_0x0354
            r1 = 1
        L_0x0354:
            X.1Ww r0 = r2.A0E
            X.1Ww r0 = r8.Ahn(r3, r0, r4, r1)
            r15.A0E = r0
            int r1 = r15.A01
            r0 = 16384(0x4000, float:2.2959E-41)
            r1 = r1 & r0
            r5 = 0
            if (r1 != r0) goto L_0x0365
            r5 = 1
        L_0x0365:
            X.1Ww r4 = r15.A0D
            int r3 = r2.A01
            r3 = r3 & r0
            r1 = 0
            if (r3 != r0) goto L_0x036e
            r1 = 1
        L_0x036e:
            X.1Ww r0 = r2.A0D
            X.1Ww r0 = r8.Ahn(r4, r0, r5, r1)
            r15.A0D = r0
            int r1 = r15.A01
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r5 = 0
            if (r1 != r0) goto L_0x0380
            r5 = 1
        L_0x0380:
            X.1Ww r4 = r15.A0C
            int r3 = r2.A01
            r3 = r3 & r0
            r1 = 0
            if (r3 != r0) goto L_0x0389
            r1 = 1
        L_0x0389:
            X.1Ww r0 = r2.A0C
            X.1Ww r0 = r8.Ahn(r4, r0, r5, r1)
            r15.A0C = r0
            int r3 = r15.A01
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r3 & r1
            r13 = 0
            if (r0 != r1) goto L_0x039b
            r13 = 1
        L_0x039b:
            long r9 = r15.A09
            int r5 = r2.A01
            r0 = r5 & r1
            r14 = 0
            if (r0 != r1) goto L_0x03a5
            r14 = 1
        L_0x03a5:
            long r11 = r2.A09
            long r0 = r8.Aht(r9, r11, r13, r14)
            r15.A09 = r0
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r3 & r1
            r7 = 0
            if (r0 != r1) goto L_0x03b5
            r7 = 1
        L_0x03b5:
            int r6 = r15.A07
            r4 = r5 & r1
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = 0
            if (r4 != r0) goto L_0x03bf
            r1 = 1
        L_0x03bf:
            int r0 = r2.A07
            int r0 = r8.Ahq(r6, r0, r7, r1)
            r15.A07 = r0
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r3 & r1
            r7 = 0
            if (r0 != r1) goto L_0x03cf
            r7 = 1
        L_0x03cf:
            int r6 = r15.A08
            r4 = r5 & r1
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = 0
            if (r4 != r0) goto L_0x03d9
            r1 = 1
        L_0x03d9:
            int r0 = r2.A08
            int r0 = r8.Ahq(r6, r0, r7, r1)
            r15.A08 = r0
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r3 & r1
            r7 = 0
            if (r0 != r1) goto L_0x03e9
            r7 = 1
        L_0x03e9:
            int r6 = r15.A04
            r4 = r5 & r1
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = 0
            if (r4 != r0) goto L_0x03f3
            r1 = 1
        L_0x03f3:
            int r0 = r2.A04
            int r0 = r8.Ahq(r6, r0, r7, r1)
            r15.A04 = r0
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r3 & r1
            r7 = 0
            if (r0 != r1) goto L_0x0403
            r7 = 1
        L_0x0403:
            java.lang.String r6 = r15.A0I
            r4 = r5 & r1
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = 0
            if (r4 != r0) goto L_0x040d
            r1 = 1
        L_0x040d:
            java.lang.String r0 = r2.A0I
            java.lang.String r0 = r8.Ahz(r6, r0, r7, r1)
            r15.A0I = r0
            r0 = 2097152(0x200000, float:2.938736E-39)
            r3 = r3 & r0
            r4 = 0
            if (r3 != r0) goto L_0x041c
            r4 = 1
        L_0x041c:
            X.1Ww r3 = r15.A0A
            r5 = r5 & r0
            r1 = 0
            if (r5 != r0) goto L_0x0423
            r1 = 1
        L_0x0423:
            X.1Ww r0 = r2.A0A
            X.1Ww r0 = r8.Ahn(r3, r0, r4, r1)
            r15.A0A = r0
            int r7 = r15.A01
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x0435
            r5 = 1
        L_0x0435:
            int r4 = r15.A03
            int r6 = r2.A01
            r3 = r6 & r1
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = 0
            if (r3 != r0) goto L_0x0441
            r1 = 1
        L_0x0441:
            int r0 = r2.A03
            int r0 = r8.Ahq(r4, r0, r5, r1)
            r15.A03 = r0
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r7 & r1
            r5 = 0
            if (r0 != r1) goto L_0x0451
            r5 = 1
        L_0x0451:
            boolean r4 = r15.A0O
            r3 = r6 & r1
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = 0
            if (r3 != r0) goto L_0x045b
            r1 = 1
        L_0x045b:
            boolean r0 = r2.A0O
            boolean r0 = r8.Ahm(r5, r4, r1, r0)
            r15.A0O = r0
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r8 != r0) goto L_0x046a
            r7 = r7 | r6
            r15.A01 = r7
        L_0x046a:
            return r15
        L_0x046b:
            X.3fJ r0 = new X.3fJ
            r0.<init>()
            return r0
        L_0x0471:
            return r5
        L_0x0472:
            X.2ep r0 = A0P
            return r0
        L_0x0475:
            X.2ep r0 = new X.2ep
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53012ep.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A01 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A0K);
        }
        if ((this.A01 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A0J);
        }
        if ((this.A01 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A06(this.A0G);
        }
        if ((this.A01 & 8) == 8) {
            i3 += 1 + CodedOutputStream.A06(this.A0H);
        }
        if ((this.A01 & 16) == 16) {
            i3 += 1 + CodedOutputStream.A06(this.A0M);
        }
        int i4 = this.A01;
        if ((i4 & 32) == 32) {
            i3 += 5;
        }
        if ((i4 & 64) == 64) {
            i3 += 5;
        }
        if ((i4 & 128) == 128) {
            i3 += CodedOutputStream.A00(9, this.A02);
        }
        if ((i4 & 256) == 256) {
            i3 += CodedOutputStream.A00(10, this.A05);
        }
        if ((i4 & 512) == 512) {
            i3 += CodedOutputStream.A04(this.A0B, 16);
        }
        if ((i4 & 1024) == 1024) {
            AnonymousClass21S r0 = this.A0F;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            i3 += CodedOutputStream.A05(r0, 17);
        }
        int i5 = this.A01;
        if ((i5 & 2048) == 2048) {
            i3 += 3;
        }
        if ((i5 & 4096) == 4096) {
            i3 += 2 + CodedOutputStream.A06(this.A0L);
        }
        int i6 = this.A01;
        if ((i6 & 8192) == 8192) {
            i3 += CodedOutputStream.A04(this.A0E, 20);
        }
        if ((i6 & 16384) == 16384) {
            i3 += CodedOutputStream.A04(this.A0D, 21);
        }
        if ((i6 & 32768) == 32768) {
            i3 += CodedOutputStream.A04(this.A0C, 22);
        }
        if ((i6 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            i3 += 2 + CodedOutputStream.A03(this.A09);
        }
        if ((i6 & 131072) == 131072) {
            i3 += CodedOutputStream.A02(24, this.A07);
        }
        if ((i6 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            i3 += CodedOutputStream.A02(25, this.A08);
        }
        if ((i6 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            i3 += CodedOutputStream.A00(26, this.A04);
        }
        if ((i6 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            i3 += 2 + CodedOutputStream.A06(this.A0I);
        }
        int i7 = this.A01;
        if ((i7 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            i3 += CodedOutputStream.A04(this.A0A, 28);
        }
        if ((i7 & 4194304) == 4194304) {
            i3 += CodedOutputStream.A00(29, this.A03);
        }
        if ((i7 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            i3 += 3;
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A0D(1, this.A0K);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0D(2, this.A0J);
        }
        if ((this.A01 & 4) == 4) {
            codedOutputStream.A0D(4, this.A0G);
        }
        if ((this.A01 & 8) == 8) {
            codedOutputStream.A0D(5, this.A0H);
        }
        if ((this.A01 & 16) == 16) {
            codedOutputStream.A0D(6, this.A0M);
        }
        if ((this.A01 & 32) == 32) {
            codedOutputStream.A08(7, this.A06);
        }
        if ((this.A01 & 64) == 64) {
            codedOutputStream.A08(8, this.A00);
        }
        if ((this.A01 & 128) == 128) {
            codedOutputStream.A09(9, this.A02);
        }
        if ((this.A01 & 256) == 256) {
            codedOutputStream.A09(10, this.A05);
        }
        if ((this.A01 & 512) == 512) {
            codedOutputStream.A0F(this.A0B, 16);
        }
        if ((this.A01 & 1024) == 1024) {
            AnonymousClass21S r0 = this.A0F;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 17);
        }
        if ((this.A01 & 2048) == 2048) {
            codedOutputStream.A0E(18, this.A0N);
        }
        if ((this.A01 & 4096) == 4096) {
            codedOutputStream.A0D(19, this.A0L);
        }
        if ((this.A01 & 8192) == 8192) {
            codedOutputStream.A0F(this.A0E, 20);
        }
        if ((this.A01 & 16384) == 16384) {
            codedOutputStream.A0F(this.A0D, 21);
        }
        if ((this.A01 & 32768) == 32768) {
            codedOutputStream.A0F(this.A0C, 22);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            codedOutputStream.A0C(23, this.A09);
        }
        if ((this.A01 & 131072) == 131072) {
            codedOutputStream.A0A(24, this.A07);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            codedOutputStream.A0A(25, this.A08);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            codedOutputStream.A09(26, this.A04);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            codedOutputStream.A0D(27, this.A0I);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            codedOutputStream.A0F(this.A0A, 28);
        }
        if ((this.A01 & 4194304) == 4194304) {
            codedOutputStream.A09(29, this.A03);
        }
        if ((this.A01 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            codedOutputStream.A0E(30, this.A0O);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
