package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2uW  reason: invalid class name and case insensitive filesystem */
public final class C59002uW extends C28541Wm implements C28561Wp {
    public static final C59002uW A0K;
    public static volatile C47872Kz A0L;
    public byte A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C58742tz A08;
    public AnonymousClass2N5 A09;
    public C48392Mz A0A;
    public C48362Mw A0B;
    public C33231iF A0C;
    public String A0D = "";
    public String A0E = "";
    public String A0F = "";
    public String A0G = "";
    public String A0H = "";
    public String A0I = "";
    public boolean A0J;

    static {
        C59002uW r0 = new C59002uW();
        A0K = r0;
        r0.A0W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0235, code lost:
        if (r0.A0Z() == false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x023b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0242, code lost:
        return A0K;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0b(X.AnonymousClass2L5 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r14 = this;
            r0 = r17
            r7 = r16
            int r1 = r15.ordinal()
            r3 = 0
            r2 = 1
            r6 = 0
            switch(r1) {
                case 0: goto L_0x01f5;
                case 1: goto L_0x0243;
                case 2: goto L_0x002e;
                case 3: goto L_0x023b;
                case 4: goto L_0x03d1;
                case 5: goto L_0x03cb;
                case 6: goto L_0x0240;
                case 7: goto L_0x0013;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        L_0x0013:
            X.2Kz r0 = A0L
            if (r0 != 0) goto L_0x002b
            java.lang.Class<X.2uW> r1 = X.C59002uW.class
            monitor-enter(r1)
            X.2Kz r0 = A0L     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            X.2uW r0 = A0K     // Catch:{ all -> 0x0028 }
            X.2Kz r0 = X.C28541Wm.A09(r0)     // Catch:{ all -> 0x0028 }
            A0L = r0     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            X.2Kz r0 = A0L
            return r0
        L_0x002e:
            X.2Kx r7 = (X.C47852Kx) r7
            X.2Ky r0 = (X.C47862Ky) r0
        L_0x0032:
            int r1 = r7.A03()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            switch(r1) {
                case 0: goto L_0x0240;
                case 10: goto L_0x005d;
                case 18: goto L_0x0089;
                case 26: goto L_0x0096;
                case 32: goto L_0x00a3;
                case 40: goto L_0x00b0;
                case 50: goto L_0x00be;
                case 58: goto L_0x00cc;
                case 64: goto L_0x00fb;
                case 72: goto L_0x0109;
                case 90: goto L_0x0117;
                case 106: goto L_0x0125;
                case 112: goto L_0x0133;
                case 122: goto L_0x0141;
                case 138: goto L_0x016e;
                case 146: goto L_0x019b;
                case 152: goto L_0x0041;
                case 160: goto L_0x01c8;
                case 170: goto L_0x01d7;
                default: goto L_0x0039;
            }     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
        L_0x0039:
            boolean r1 = r14.A0a(r7, r1)     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            if (r1 != 0) goto L_0x0032
            goto L_0x0240
        L_0x0041:
            int r4 = r7.A02()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            if (r4 == 0) goto L_0x0052
            if (r4 == r2) goto L_0x0052
            r1 = 2
            if (r4 == r1) goto L_0x0052
            r1 = 19
            super.A0X(r1, r4)     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x0052:
            int r3 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r1
            r14.A01 = r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A02 = r4     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x005d:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 & 1
            if (r1 != r2) goto L_0x0076
            X.2tz r1 = r14.A08     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.1Wr r3 = r1.A0U()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.3fN r3 = (X.C69643fN) r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
        L_0x006b:
            X.2tz r1 = X.C58742tz.A04     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.1Wo r1 = X.C28541Wm.A0H(r7, r0, r1)     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.2tz r1 = (X.C58742tz) r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A08 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0078
        L_0x0076:
            r3 = r6
            goto L_0x006b
        L_0x0078:
            if (r3 == 0) goto L_0x0082
            X.1Wm r1 = X.C28541Wm.A0C(r3, r1)     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.2tz r1 = (X.C58742tz) r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A08 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
        L_0x0082:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | 1
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x0089:
            java.lang.String r3 = r7.A0A()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | 2
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A0D = r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x0096:
            java.lang.String r3 = r7.A0A()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | 4
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A0E = r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x00a3:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | 8
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            long r3 = r7.A06()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A04 = r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x00b0:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | 16
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            long r3 = r7.A06()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A05 = r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x00be:
            java.lang.String r3 = r7.A0A()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | 32
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A0F = r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x00cc:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r3 = 64
            r1 = r1 & 64
            if (r1 != r3) goto L_0x00e7
            X.1iF r1 = r14.A0C     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.1Wr r3 = r1.A0U()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.1iG r3 = (X.C33241iG) r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
        L_0x00dc:
            X.1iF r1 = X.C33231iF.A05     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.1Wo r1 = X.C28541Wm.A0H(r7, r0, r1)     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.1iF r1 = (X.C33231iF) r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A0C = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x00e9
        L_0x00e7:
            r3 = r6
            goto L_0x00dc
        L_0x00e9:
            if (r3 == 0) goto L_0x00f3
            X.1Wm r1 = X.C28541Wm.A0C(r3, r1)     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.1iF r1 = (X.C33231iF) r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A0C = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
        L_0x00f3:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | 64
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x00fb:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | 128(0x80, float:1.794E-43)
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            long r3 = r7.A06()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A06 = r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x0109:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | 256(0x100, float:3.59E-43)
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            long r3 = r7.A06()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A07 = r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x0117:
            java.lang.String r3 = r7.A0A()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | 512(0x200, float:7.175E-43)
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A0G = r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x0125:
            java.lang.String r3 = r7.A0A()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A0I = r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x0133:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | 2048(0x800, float:2.87E-42)
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            int r1 = r7.A02()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A03 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x0141:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r4 = 4096(0x1000, float:5.74E-42)
            r1 = r1 & r4
            if (r1 != r4) goto L_0x015b
            X.2Mw r1 = r14.A0B     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.1Wr r3 = r1.A0U()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.2Mx r3 = (X.C48372Mx) r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
        L_0x0150:
            X.2Mw r1 = X.C48362Mw.A04     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.1Wo r1 = X.C28541Wm.A0H(r7, r0, r1)     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.2Mw r1 = (X.C48362Mw) r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A0B = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x015d
        L_0x015b:
            r3 = r6
            goto L_0x0150
        L_0x015d:
            if (r3 == 0) goto L_0x0167
            X.1Wm r1 = X.C28541Wm.A0C(r3, r1)     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.2Mw r1 = (X.C48362Mw) r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A0B = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
        L_0x0167:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | r4
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x016e:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r4 = 8192(0x2000, float:1.14794E-41)
            r1 = r1 & r4
            if (r1 != r4) goto L_0x0188
            X.2Mz r1 = r14.A0A     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.1Wr r3 = r1.A0U()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.2N4 r3 = (X.AnonymousClass2N4) r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
        L_0x017d:
            X.2Mz r1 = X.C48392Mz.A03     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.1Wo r1 = X.C28541Wm.A0H(r7, r0, r1)     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.2Mz r1 = (X.C48392Mz) r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A0A = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x018a
        L_0x0188:
            r3 = r6
            goto L_0x017d
        L_0x018a:
            if (r3 == 0) goto L_0x0194
            X.1Wm r1 = X.C28541Wm.A0C(r3, r1)     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.2Mz r1 = (X.C48392Mz) r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A0A = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
        L_0x0194:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | r4
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x019b:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r4 = 16384(0x4000, float:2.2959E-41)
            r1 = r1 & r4
            if (r1 != r4) goto L_0x01b5
            X.2N5 r1 = r14.A09     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.1Wr r3 = r1.A0U()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.2N6 r3 = (X.AnonymousClass2N6) r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
        L_0x01aa:
            X.2N5 r1 = X.AnonymousClass2N5.A06     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.1Wo r1 = X.C28541Wm.A0H(r7, r0, r1)     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.2N5 r1 = (X.AnonymousClass2N5) r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A09 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x01b7
        L_0x01b5:
            r3 = r6
            goto L_0x01aa
        L_0x01b7:
            if (r3 == 0) goto L_0x01c1
            X.1Wm r1 = X.C28541Wm.A0C(r3, r1)     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            X.2N5 r1 = (X.AnonymousClass2N5) r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A09 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
        L_0x01c1:
            int r1 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = r1 | r4
            r14.A01 = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x01c8:
            int r3 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 | r1
            r14.A01 = r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            boolean r1 = r7.A0F()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A0J = r1     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x01d7:
            java.lang.String r4 = r7.A0A()     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            int r3 = r14.A01     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r1 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 | r1
            r14.A01 = r3     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            r14.A0H = r4     // Catch:{ 1bD -> 0x01e8, IOException -> 0x01e6 }
            goto L_0x0032
        L_0x01e6:
            r0 = move-exception
            goto L_0x01ee
        L_0x01e8:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C28541Wm.A0J(r0, r14)     // Catch:{ all -> 0x01f3 }
            goto L_0x01f2
        L_0x01ee:
            java.lang.RuntimeException r0 = X.C28541Wm.A0K(r14, r0)     // Catch:{ all -> 0x01f3 }
        L_0x01f2:
            throw r0     // Catch:{ all -> 0x01f3 }
        L_0x01f3:
            r0 = move-exception
            throw r0
        L_0x01f5:
            byte r0 = r14.A00
            if (r0 == r2) goto L_0x0240
            if (r0 == 0) goto L_0x023b
            boolean r5 = X.AnonymousClass000.A1X(r7)
            int r4 = r14.A01
            r1 = 128(0x80, float:1.794E-43)
            r0 = r4 & r1
            if (r0 != r1) goto L_0x0237
            r1 = 256(0x100, float:3.59E-43)
            r0 = r4 & r1
            if (r0 != r1) goto L_0x0237
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r4 & r1
            if (r0 != r1) goto L_0x0237
            r0 = 4096(0x1000, float:5.74E-42)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x0237
            X.2Mw r0 = r14.A0B
            if (r0 != 0) goto L_0x021e
            X.2Mw r0 = X.C48362Mw.A04
        L_0x021e:
            boolean r0 = r0.A0Z()
            if (r0 == 0) goto L_0x0237
            int r1 = r14.A01
            r0 = 16384(0x4000, float:2.2959E-41)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x023c
            X.2N5 r0 = r14.A09
            if (r0 != 0) goto L_0x0231
            X.2N5 r0 = X.AnonymousClass2N5.A06
        L_0x0231:
            boolean r0 = r0.A0Z()
            if (r0 != 0) goto L_0x023c
        L_0x0237:
            if (r5 == 0) goto L_0x023b
            r14.A00 = r3
        L_0x023b:
            return r6
        L_0x023c:
            if (r5 == 0) goto L_0x0240
            r14.A00 = r2
        L_0x0240:
            X.2uW r0 = A0K
            return r0
        L_0x0243:
            X.2L6 r7 = (X.AnonymousClass2L6) r7
            X.2uW r0 = (X.C59002uW) r0
            X.2tz r2 = r14.A08
            X.2tz r1 = r0.A08
            X.1Wo r1 = r7.Ahu(r2, r1)
            X.2tz r1 = (X.C58742tz) r1
            r14.A08 = r1
            int r2 = r14.A01
            r5 = 2
            r1 = r2 & 2
            if (r1 != r5) goto L_0x025b
            r3 = 1
        L_0x025b:
            java.lang.String r6 = r14.A0D
            int r1 = r0.A01
            r4 = r1 & 2
            boolean r5 = X.AnonymousClass000.A1R(r4, r5)
            java.lang.String r4 = r0.A0D
            java.lang.String r3 = r7.Ahz(r6, r4, r3, r5)
            r14.A0D = r3
            r4 = 4
            r3 = r2 & 4
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A0E
            r3 = r1 & 4
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r0.A0E
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A0E = r3
            r4 = 8
            r3 = r2 & 8
            boolean r12 = X.AnonymousClass000.A1R(r3, r4)
            long r8 = r14.A04
            r3 = r1 & 8
            boolean r13 = X.AnonymousClass000.A1R(r3, r4)
            long r10 = r0.A04
            long r3 = r7.Aht(r8, r10, r12, r13)
            r14.A04 = r3
            r4 = 16
            r3 = r2 & 16
            boolean r12 = X.AnonymousClass000.A1R(r3, r4)
            long r8 = r14.A05
            r3 = r1 & 16
            boolean r13 = X.AnonymousClass000.A1R(r3, r4)
            long r10 = r0.A05
            long r3 = r7.Aht(r8, r10, r12, r13)
            r14.A05 = r3
            r5 = 32
            r2 = r2 & 32
            boolean r4 = X.AnonymousClass000.A1R(r2, r5)
            java.lang.String r3 = r14.A0F
            r1 = r1 & 32
            boolean r2 = X.AnonymousClass000.A1R(r1, r5)
            java.lang.String r1 = r0.A0F
            java.lang.String r1 = r7.Ahz(r3, r1, r4, r2)
            r14.A0F = r1
            X.1iF r2 = r14.A0C
            X.1iF r1 = r0.A0C
            X.1Wo r1 = r7.Ahu(r2, r1)
            X.1iF r1 = (X.C33231iF) r1
            r14.A0C = r1
            int r2 = r14.A01
            r4 = 128(0x80, float:1.794E-43)
            r1 = r2 & r4
            boolean r12 = X.AnonymousClass000.A1R(r1, r4)
            long r8 = r14.A06
            int r1 = r0.A01
            r3 = r1 & r4
            boolean r13 = X.AnonymousClass000.A1R(r3, r4)
            long r10 = r0.A06
            long r3 = r7.Aht(r8, r10, r12, r13)
            r14.A06 = r3
            r4 = 256(0x100, float:3.59E-43)
            r3 = r2 & r4
            boolean r12 = X.AnonymousClass000.A1R(r3, r4)
            long r8 = r14.A07
            r3 = r1 & r4
            boolean r13 = X.AnonymousClass000.A1R(r3, r4)
            long r10 = r0.A07
            long r3 = r7.Aht(r8, r10, r12, r13)
            r14.A07 = r3
            r4 = 512(0x200, float:7.175E-43)
            r3 = r2 & r4
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A0G
            r3 = r1 & r4
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r0.A0G
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A0G = r3
            r4 = 1024(0x400, float:1.435E-42)
            r3 = r2 & r4
            boolean r6 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r5 = r14.A0I
            r3 = r1 & r4
            boolean r4 = X.AnonymousClass000.A1R(r3, r4)
            java.lang.String r3 = r0.A0I
            java.lang.String r3 = r7.Ahz(r5, r3, r6, r4)
            r14.A0I = r3
            r5 = 2048(0x800, float:2.87E-42)
            r2 = r2 & r5
            boolean r4 = X.AnonymousClass000.A1R(r2, r5)
            int r3 = r14.A03
            r1 = r1 & r5
            boolean r2 = X.AnonymousClass000.A1R(r1, r5)
            int r1 = r0.A03
            int r1 = r7.Ahq(r3, r1, r4, r2)
            r14.A03 = r1
            X.2Mw r2 = r14.A0B
            X.2Mw r1 = r0.A0B
            X.1Wo r1 = r7.Ahu(r2, r1)
            X.2Mw r1 = (X.C48362Mw) r1
            r14.A0B = r1
            X.2Mz r2 = r14.A0A
            X.2Mz r1 = r0.A0A
            X.1Wo r1 = r7.Ahu(r2, r1)
            X.2Mz r1 = (X.C48392Mz) r1
            r14.A0A = r1
            X.2N5 r2 = r14.A09
            X.2N5 r1 = r0.A09
            X.1Wo r1 = r7.Ahu(r2, r1)
            X.2N5 r1 = (X.AnonymousClass2N5) r1
            r14.A09 = r1
            int r6 = r14.A01
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r6 & r2
            boolean r4 = X.AnonymousClass000.A1R(r1, r2)
            int r3 = r14.A02
            int r5 = r0.A01
            r1 = r5 & r2
            boolean r2 = X.AnonymousClass000.A1R(r1, r2)
            int r1 = r0.A02
            int r1 = r7.Ahq(r3, r1, r4, r2)
            r14.A02 = r1
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = r6 & r2
            boolean r4 = X.AnonymousClass000.A1R(r1, r2)
            boolean r3 = r14.A0J
            r1 = r5 & r2
            boolean r2 = X.AnonymousClass000.A1R(r1, r2)
            boolean r1 = r0.A0J
            boolean r1 = r7.Ahm(r4, r3, r2, r1)
            r14.A0J = r1
            r4 = 131072(0x20000, float:1.83671E-40)
            r1 = r6 & r4
            boolean r3 = X.AnonymousClass000.A1R(r1, r4)
            java.lang.String r2 = r14.A0H
            r1 = r5 & r4
            boolean r1 = X.AnonymousClass000.A1R(r1, r4)
            java.lang.String r0 = r0.A0H
            java.lang.String r0 = r7.Ahz(r2, r0, r3, r1)
            r14.A0H = r0
            X.2L7 r0 = X.AnonymousClass2L7.A00
            if (r7 != r0) goto L_0x03ca
            r6 = r6 | r5
            r14.A01 = r6
        L_0x03ca:
            return r14
        L_0x03cb:
            X.3ex r0 = new X.3ex
            r0.<init>()
            return r0
        L_0x03d1:
            X.2uW r0 = new X.2uW
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59002uW.A0b(X.2L5, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A01 & 1) == 1) {
            C58742tz r0 = this.A08;
            if (r0 == null) {
                r0 = C58742tz.A04;
            }
            i3 = C28541Wm.A06(r0, 1, 0);
        }
        if ((this.A01 & 2) == 2) {
            i3 = C28541Wm.A07(this.A0D, i3);
        }
        if ((this.A01 & 4) == 4) {
            i3 = C28541Wm.A07(this.A0E, i3);
        }
        int i4 = this.A01;
        if ((i4 & 8) == 8) {
            i3 = C28541Wm.A02(i3, this.A04);
        }
        if ((i4 & 16) == 16) {
            i3 = C28541Wm.A02(i3, this.A05);
        }
        if ((i4 & 32) == 32) {
            i3 = C28541Wm.A07(this.A0F, i3);
        }
        if ((this.A01 & 64) == 64) {
            C33231iF r02 = this.A0C;
            if (r02 == null) {
                r02 = C33231iF.A05;
            }
            i3 = C28541Wm.A06(r02, 7, i3);
        }
        int i5 = this.A01;
        if ((i5 & 128) == 128) {
            i3 = C28541Wm.A02(i3, this.A06);
        }
        if ((i5 & 256) == 256) {
            i3 = C28541Wm.A02(i3, this.A07);
        }
        if ((i5 & 512) == 512) {
            i3 = C28541Wm.A07(this.A0G, i3);
        }
        if ((this.A01 & 1024) == 1024) {
            i3 = C28541Wm.A07(this.A0I, i3);
        }
        int i6 = this.A01;
        if ((i6 & 2048) == 2048) {
            i3 += CodedOutputStream.A01(14, this.A03);
        }
        if ((i6 & 4096) == 4096) {
            C48362Mw r03 = this.A0B;
            if (r03 == null) {
                r03 = C48362Mw.A04;
            }
            i3 = C28541Wm.A06(r03, 15, i3);
        }
        if ((this.A01 & 8192) == 8192) {
            C48392Mz r04 = this.A0A;
            if (r04 == null) {
                r04 = C48392Mz.A03;
            }
            i3 = C28541Wm.A06(r04, 17, i3);
        }
        if ((this.A01 & 16384) == 16384) {
            AnonymousClass2N5 r05 = this.A09;
            if (r05 == null) {
                r05 = AnonymousClass2N5.A06;
            }
            i3 = C28541Wm.A06(r05, 18, i3);
        }
        int i7 = this.A01;
        if ((i7 & 32768) == 32768) {
            i3 = C28541Wm.A01(19, this.A02, i3);
        }
        if ((i7 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            i3 += 3;
        }
        if ((i7 & 131072) == 131072) {
            i3 = C28541Wm.A08(this.A0H, 2, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            C58742tz r0 = this.A08;
            if (r0 == null) {
                r0 = C58742tz.A04;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0D(2, this.A0D);
        }
        if ((this.A01 & 4) == 4) {
            codedOutputStream.A0D(3, this.A0E);
        }
        if ((this.A01 & 8) == 8) {
            codedOutputStream.A0C(4, this.A04);
        }
        if ((this.A01 & 16) == 16) {
            codedOutputStream.A0C(5, this.A05);
        }
        if ((this.A01 & 32) == 32) {
            codedOutputStream.A0D(6, this.A0F);
        }
        if ((this.A01 & 64) == 64) {
            C33231iF r02 = this.A0C;
            if (r02 == null) {
                r02 = C33231iF.A05;
            }
            codedOutputStream.A0G(r02, 7);
        }
        if ((this.A01 & 128) == 128) {
            codedOutputStream.A0C(8, this.A06);
        }
        if ((this.A01 & 256) == 256) {
            codedOutputStream.A0C(9, this.A07);
        }
        if ((this.A01 & 512) == 512) {
            codedOutputStream.A0D(11, this.A0G);
        }
        if ((this.A01 & 1024) == 1024) {
            codedOutputStream.A0D(13, this.A0I);
        }
        if ((this.A01 & 2048) == 2048) {
            codedOutputStream.A09(14, this.A03);
        }
        if ((this.A01 & 4096) == 4096) {
            C48362Mw r03 = this.A0B;
            if (r03 == null) {
                r03 = C48362Mw.A04;
            }
            codedOutputStream.A0G(r03, 15);
        }
        if ((this.A01 & 8192) == 8192) {
            C48392Mz r04 = this.A0A;
            if (r04 == null) {
                r04 = C48392Mz.A03;
            }
            codedOutputStream.A0G(r04, 17);
        }
        if ((this.A01 & 16384) == 16384) {
            AnonymousClass2N5 r05 = this.A09;
            if (r05 == null) {
                r05 = AnonymousClass2N5.A06;
            }
            codedOutputStream.A0G(r05, 18);
        }
        if ((this.A01 & 32768) == 32768) {
            codedOutputStream.A09(19, this.A02);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            codedOutputStream.A0E(20, this.A0J);
        }
        if ((this.A01 & 131072) == 131072) {
            codedOutputStream.A0D(21, this.A0H);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
