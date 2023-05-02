package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.Locale;

/* renamed from: X.3V3  reason: invalid class name */
public final class AnonymousClass3V3 extends C97244pd {
    public static final C108305Nl A01 = new C97264pf();
    public final C108305Nl A00;

    public AnonymousClass3V3(C108305Nl r1) {
        this.A00 = r1;
    }

    public static int A00(byte[] bArr, int i2, int i3) {
        int length;
        while (true) {
            length = bArr.length;
            if (i2 < length) {
                if (bArr[i2] == 0) {
                    break;
                }
                i2++;
            } else {
                i2 = length;
                break;
            }
        }
        if (i3 == 0 || i3 == 3) {
            return i2;
        }
        while (i2 < length - 1) {
            if (i2 % 2 != 0 || bArr[i2 + 1] != 0) {
                while (true) {
                    i2++;
                    if (i2 < length) {
                        if (bArr[i2] == 0) {
                            break;
                        }
                    } else {
                        i2 = length;
                        break;
                    }
                }
            } else {
                return i2;
            }
        }
        return length;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.4pU] */
    /* JADX WARNING: type inference failed for: r0v129 */
    /* JADX WARNING: type inference failed for: r0v130 */
    /* JADX WARNING: type inference failed for: r0v131 */
    /* JADX WARNING: type inference failed for: r0v132 */
    /* JADX WARNING: type inference failed for: r18v5, types: [X.3V5] */
    /* JADX WARNING: type inference failed for: r8v26, types: [X.3VE] */
    /* JADX WARNING: type inference failed for: r9v21, types: [X.3VD] */
    /* JADX WARNING: type inference failed for: r0v133 */
    /* JADX WARNING: type inference failed for: r0v134 */
    /* JADX WARNING: type inference failed for: r0v135 */
    /* JADX WARNING: type inference failed for: r0v136 */
    /* JADX WARNING: type inference failed for: r0v137 */
    /* JADX WARNING: type inference failed for: r0v138 */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01e7, code lost:
        if (r12 == 3) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0217, code lost:
        if (r9 == 67) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x028d, code lost:
        if (r10 == 3) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02d9, code lost:
        if (r10 == 3) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010a, code lost:
        if (r9 == 3) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r10 == 3) goto L_0x014d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02a8 A[Catch:{ UnsupportedEncodingException -> 0x04cb, all -> 0x04d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02ef A[Catch:{ UnsupportedEncodingException -> 0x04cb, all -> 0x04d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0355 A[ADDED_TO_REGION, Catch:{ UnsupportedEncodingException -> 0x04cb, all -> 0x04d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03cf A[Catch:{ UnsupportedEncodingException -> 0x04cb, all -> 0x04d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0401 A[Catch:{ UnsupportedEncodingException -> 0x04cb, all -> 0x04d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x042b A[Catch:{ UnsupportedEncodingException -> 0x04cb, all -> 0x04d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x048c A[Catch:{ UnsupportedEncodingException -> 0x04cb, all -> 0x04d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x04a8 A[Catch:{ UnsupportedEncodingException -> 0x04cb, all -> 0x04d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x03d6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011f A[Catch:{ UnsupportedEncodingException -> 0x04cb, all -> 0x04d1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C97154pU A01(X.C108305Nl r20, X.C90504eH r21, int r22, int r23, boolean r24) {
        /*
            r4 = r21
            int r12 = r4.A0C()
            int r11 = r4.A0C()
            int r10 = r4.A0C()
            r5 = 3
            r6 = r22
            r19 = r24
            if (r6 < r5) goto L_0x0060
            int r9 = r4.A0C()
            r0 = 4
            int r3 = r4.A0E()
            if (r6 != r0) goto L_0x0039
            if (r24 != 0) goto L_0x0039
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r0 = r3 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 7
            r1 = r1 | r0
            int r0 = r3 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 14
            r1 = r1 | r0
            int r0 = r3 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r0 << 21
            r3 = r3 | r1
        L_0x0039:
            int r8 = r4.A0F()
        L_0x003d:
            r17 = 0
            if (r12 != 0) goto L_0x0051
            if (r11 != 0) goto L_0x0051
            if (r10 != 0) goto L_0x0051
            if (r9 != 0) goto L_0x0051
            if (r3 != 0) goto L_0x0051
            if (r8 != 0) goto L_0x0051
        L_0x004b:
            int r0 = r4.A00
            r4.A0S(r0)
            return r17
        L_0x0051:
            int r2 = r4.A01
            int r2 = r2 + r3
            int r0 = r4.A00
            java.lang.String r1 = "Id3Decoder"
            if (r2 <= r0) goto L_0x0067
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r1, r0)
            goto L_0x004b
        L_0x0060:
            r9 = 0
            int r3 = r4.A0D()
            r8 = 0
            goto L_0x003d
        L_0x0067:
            if (r20 != 0) goto L_0x04db
            r7 = 1
            if (r6 != r5) goto L_0x00bb
            r0 = r8 & 128(0x80, float:1.794E-43)
            boolean r18 = X.AnonymousClass000.A1O(r0)
            r0 = r8 & 64
            boolean r16 = X.AnonymousClass000.A1O(r0)
            r0 = r8 & 32
            boolean r15 = X.AnonymousClass000.A1O(r0)
            r14 = r18
            r13 = 0
        L_0x0081:
            if (r14 != 0) goto L_0x04d6
            if (r16 != 0) goto L_0x04d6
            if (r15 == 0) goto L_0x008c
            int r3 = r3 + -1
            r4.A0T(r7)
        L_0x008c:
            if (r18 == 0) goto L_0x0094
            int r3 = r3 + -4
            r0 = 4
            r4.A0T(r0)
        L_0x0094:
            if (r13 == 0) goto L_0x00dd
            byte[] r14 = r4.A02
            int r13 = r4.A01
            r15 = r13
        L_0x009b:
            int r8 = r15 + 1
            int r0 = r13 + r3
            if (r8 >= r0) goto L_0x00dd
            byte r7 = r14[r15]
            r0 = 255(0xff, float:3.57E-43)
            r7 = r7 & r0
            if (r7 != r0) goto L_0x00b9
            byte r0 = r14[r8]
            if (r0 != 0) goto L_0x00b9
            int r0 = r15 - r13
            int r7 = r15 + 2
            int r0 = r3 - r0
            int r0 = r0 + -2
            java.lang.System.arraycopy(r14, r7, r14, r8, r0)
            int r3 = r3 + -1
        L_0x00b9:
            r15 = r8
            goto L_0x009b
        L_0x00bb:
            r0 = 4
            if (r6 != r0) goto L_0x00dd
            r0 = r8 & 64
            boolean r15 = X.AnonymousClass000.A1O(r0)
            r0 = r8 & 8
            boolean r14 = X.AnonymousClass000.A1O(r0)
            r0 = r8 & 4
            boolean r16 = X.AnonymousClass000.A1O(r0)
            r0 = r8 & 2
            boolean r13 = X.AnonymousClass000.A1O(r0)
            r0 = r8 & 1
            boolean r18 = X.AnonymousClass000.A1O(r0)
            goto L_0x0081
        L_0x00dd:
            r13 = 84
            r0 = 2
            r8 = 88
            if (r12 != r13) goto L_0x011f
            if (r11 != r8) goto L_0x0485
            if (r10 != r8) goto L_0x0485
            if (r6 == r0) goto L_0x00ec
            if (r9 != r8) goto L_0x0485
        L_0x00ec:
            r0 = 1
            if (r3 < r0) goto L_0x02ec
            int r9 = r4.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r8 = A02(r9)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r3 = r3 - r0
            byte[] r7 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0 = 0
            r4.A0V(r7, r0, r3)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r3 = A00(r7, r0, r9)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r6.<init>(r7, r0, r3, r8)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r9 == 0) goto L_0x010c
            r0 = 2
            if (r9 != r5) goto L_0x010d
        L_0x010c:
            r0 = 1
        L_0x010d:
            int r3 = r3 + r0
            int r0 = A00(r7, r3, r9)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r5 = A04(r8, r7, r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r3 = "TXXX"
            X.3V7 r0 = new X.3V7     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0.<init>(r3, r6, r5)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x04c7
        L_0x011f:
            if (r12 == r13) goto L_0x0485
            r7 = 87
            if (r12 != r7) goto L_0x0169
            if (r11 != r8) goto L_0x0461
            if (r10 != r8) goto L_0x0461
            if (r6 == r0) goto L_0x012d
            if (r9 != r8) goto L_0x0461
        L_0x012d:
            r0 = 1
            if (r3 < r0) goto L_0x02ec
            int r10 = r4.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r9 = A02(r10)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r3 = r3 - r0
            byte[] r8 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0 = 0
            r4.A0V(r8, r0, r3)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r7 = A00(r8, r0, r10)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r6.<init>(r8, r0, r7, r9)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r10 == 0) goto L_0x014d
            r0 = 2
            if (r10 != r5) goto L_0x014e
        L_0x014d:
            r0 = 1
        L_0x014e:
            int r7 = r7 + r0
            r5 = r7
        L_0x0150:
            if (r5 >= r3) goto L_0x0159
            byte r0 = r8[r5]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r0 == 0) goto L_0x015a
            int r5 = r5 + 1
            goto L_0x0150
        L_0x0159:
            r5 = r3
        L_0x015a:
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r5 = A04(r0, r8, r7, r5)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r3 = "WXXX"
            X.3V8 r0 = new X.3V8     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0.<init>(r3, r6, r5)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x04c7
        L_0x0169:
            if (r12 == r7) goto L_0x0461
            r15 = 73
            r14 = 80
            if (r12 != r14) goto L_0x01a6
            r7 = 82
            if (r11 != r7) goto L_0x01a6
            if (r10 != r15) goto L_0x01a6
            r7 = 86
            if (r9 != r7) goto L_0x01a6
            byte[] r8 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r7 = 0
            r4.A0V(r8, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r6 = 0
        L_0x0182:
            if (r6 >= r3) goto L_0x018b
            byte r0 = r8[r6]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r0 == 0) goto L_0x018c
            int r6 = r6 + 1
            goto L_0x0182
        L_0x018b:
            r6 = r3
        L_0x018c:
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r5.<init>(r8, r7, r6, r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r0 = r6 + 1
            if (r3 > r0) goto L_0x0198
            goto L_0x019d
        L_0x0198:
            byte[] r3 = java.util.Arrays.copyOfRange(r8, r0, r3)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x019f
        L_0x019d:
            byte[] r3 = X.AnonymousClass3C1.A0A     // Catch:{ UnsupportedEncodingException -> 0x04cb }
        L_0x019f:
            X.3V6 r0 = new X.3V6     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0.<init>(r5, r3)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x04c7
        L_0x01a6:
            r7 = 71
            r8 = 79
            if (r12 != r7) goto L_0x0204
            r7 = 69
            if (r11 != r7) goto L_0x0204
            if (r10 != r8) goto L_0x0204
            r7 = 66
            if (r9 == r7) goto L_0x01b8
            if (r6 != r0) goto L_0x0204
        L_0x01b8:
            int r12 = r4.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r11 = A02(r12)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r10 = r3 + -1
            byte[] r9 = new byte[r10]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r6 = 0
            r4.A0V(r9, r6, r10)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r3 = 0
        L_0x01c9:
            if (r3 >= r10) goto L_0x01d2
            byte r0 = r9[r3]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r0 == 0) goto L_0x01d3
            int r3 = r3 + 1
            goto L_0x01c9
        L_0x01d2:
            r3 = r10
        L_0x01d3:
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r8.<init>(r9, r6, r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r0 = r3 + 1
            int r7 = A00(r9, r0, r12)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r6 = A04(r11, r9, r0, r7)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r12 == 0) goto L_0x01e9
            r3 = 2
            if (r12 != r5) goto L_0x01ea
        L_0x01e9:
            r3 = 1
        L_0x01ea:
            int r7 = r7 + r3
            int r0 = A00(r9, r7, r12)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r5 = A04(r11, r9, r7, r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r0 = r0 + r3
            if (r10 > r0) goto L_0x01ff
            byte[] r3 = X.AnonymousClass3C1.A0A     // Catch:{ UnsupportedEncodingException -> 0x04cb }
        L_0x01f8:
            X.3VC r0 = new X.3VC     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0.<init>(r8, r6, r5, r3)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x04c7
        L_0x01ff:
            byte[] r3 = java.util.Arrays.copyOfRange(r9, r0, r10)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x01f8
        L_0x0204:
            r7 = 65
            r5 = 67
            if (r6 != r0) goto L_0x0211
            if (r12 != r14) goto L_0x02a2
            if (r11 != r15) goto L_0x0451
            if (r10 != r5) goto L_0x0451
            goto L_0x0219
        L_0x0211:
            if (r12 != r7) goto L_0x02a2
            if (r11 != r14) goto L_0x0451
            if (r10 != r15) goto L_0x0451
            if (r9 != r5) goto L_0x0451
        L_0x0219:
            int r10 = r4.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r12 = A02(r10)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r11 = r3 + -1
            byte[] r9 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r8 = 0
            r4.A0V(r9, r8, r11)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r13 = "image/"
            java.lang.String r7 = "ISO-8859-1"
            if (r6 != r0) goto L_0x024f
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0q(r13)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0 = 3
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r3.<init>(r9, r8, r0, r7)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r0 = r3.toLowerCase(r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r8 = X.AnonymousClass000.A0h(r0, r5)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r0 = "image/jpg"
            boolean r0 = r0.equals(r8)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r0 == 0) goto L_0x024d
            java.lang.String r8 = "image/jpeg"
        L_0x024d:
            r5 = 2
            goto L_0x0276
        L_0x024f:
            r5 = 0
        L_0x0250:
            if (r5 >= r11) goto L_0x0259
            byte r0 = r9[r5]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r0 == 0) goto L_0x025a
            int r5 = r5 + 1
            goto L_0x0250
        L_0x0259:
            r5 = r11
        L_0x025a:
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r3.<init>(r9, r8, r5, r7)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r8 = r3.toLowerCase(r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0 = 47
            int r3 = r8.indexOf(r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0 = -1
            if (r3 != r0) goto L_0x0276
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r13)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r8 = X.AnonymousClass000.A0h(r8, r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
        L_0x0276:
            int r0 = r5 + 1
            byte r0 = r9[r0]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r7 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r5 + 2
            int r6 = A00(r9, r3, r10)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r0 = r6 - r3
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r5.<init>(r9, r3, r0, r12)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r10 == 0) goto L_0x028f
            r3 = 3
            r0 = 2
            if (r10 != r3) goto L_0x0290
        L_0x028f:
            r0 = 1
        L_0x0290:
            int r6 = r6 + r0
            if (r11 > r6) goto L_0x0294
            goto L_0x0299
        L_0x0294:
            byte[] r3 = java.util.Arrays.copyOfRange(r9, r6, r11)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x029b
        L_0x0299:
            byte[] r3 = X.AnonymousClass3C1.A0A     // Catch:{ UnsupportedEncodingException -> 0x04cb }
        L_0x029b:
            X.3VB r0 = new X.3VB     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0.<init>(r8, r5, r3, r7)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x04c7
        L_0x02a2:
            r15 = 77
            r18 = r23
            if (r12 != r5) goto L_0x02ef
            if (r11 != r8) goto L_0x0351
            if (r10 != r15) goto L_0x0451
            if (r9 == r15) goto L_0x02b0
            if (r6 != r0) goto L_0x0451
        L_0x02b0:
            r13 = 4
            if (r3 < r13) goto L_0x02ec
            int r10 = r4.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r9 = A02(r10)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r8 = 3
            byte[] r5 = new byte[r8]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0 = 0
            r4.A0V(r5, r0, r8)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r7 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r7.<init>(r5, r0, r8)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r3 = r3 - r13
            byte[] r6 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r4.A0V(r6, r0, r3)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r3 = A00(r6, r0, r10)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r5.<init>(r6, r0, r3, r9)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r10 == 0) goto L_0x02db
            r0 = 2
            if (r10 != r8) goto L_0x02dc
        L_0x02db:
            r0 = 1
        L_0x02dc:
            int r3 = r3 + r0
            int r0 = A00(r6, r3, r10)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r3 = A04(r9, r6, r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            X.3V9 r0 = new X.3V9     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0.<init>(r7, r5, r3)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x04c7
        L_0x02ec:
            r0 = 0
            goto L_0x048e
        L_0x02ef:
            if (r12 == r5) goto L_0x0351
            if (r12 == r5) goto L_0x03c1
            if (r12 != r15) goto L_0x0451
            r0 = 76
            if (r11 != r0) goto L_0x0451
            if (r10 != r0) goto L_0x0451
            if (r9 != r13) goto L_0x0451
            int r12 = r4.A0F()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r13 = r4.A0D()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r14 = r4.A0D()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r10 = r4.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r9 = r4.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            X.4dh r8 = new X.4dh     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r8.<init>()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            byte[] r0 = r4.A02     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r5 = r4.A00     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r8.A03 = r0     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0 = 0
            r8.A02 = r0     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r8.A00 = r0     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r8.A01 = r5     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r0 = r4.A01     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r0 = r0 << 3
            r8.A07(r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r0 = r3 + -10
            int r11 = r0 << 3
            int r0 = r10 + r9
            int r11 = r11 / r0
            int[] r7 = new int[r11]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int[] r6 = new int[r11]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r5 = 0
        L_0x0336:
            if (r5 >= r11) goto L_0x0347
            int r3 = r8.A04(r10)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r0 = r8.A04(r9)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r7[r5] = r3     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r6[r5] = r0     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r5 = r5 + 1
            goto L_0x0336
        L_0x0347:
            X.3VD r0 = new X.3VD     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r11 = r6
            r9 = r0
            r10 = r7
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x04c7
        L_0x0351:
            r0 = 72
            if (r11 != r0) goto L_0x03c1
            if (r10 != r7) goto L_0x0451
            if (r9 != r14) goto L_0x0451
            int r8 = r4.A01     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            byte[] r10 = r4.A02     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r9 = r8
        L_0x035e:
            int r0 = r10.length     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r9 >= r0) goto L_0x0368
            byte r0 = r10[r9]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r0 == 0) goto L_0x0369
            int r9 = r9 + 1
            goto L_0x035e
        L_0x0368:
            r9 = r0
        L_0x0369:
            int r5 = r9 - r8
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r7 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r7.<init>(r10, r8, r5, r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r0 = r9 + 1
            int r11 = X.C90504eH.A03(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r12 = r4.A07()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            long r13 = r4.A0I()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x038b
            r13 = -1
        L_0x038b:
            long r15 = r4.A0I()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0395
            r15 = -1
        L_0x0395:
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r8 = r8 + r3
        L_0x039a:
            int r0 = r4.A01     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r0 >= r8) goto L_0x03ae
            r9 = r20
            r3 = r18
            r0 = r19
            X.4pU r0 = A01(r9, r4, r6, r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r0 == 0) goto L_0x039a
            r5.add(r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x039a
        L_0x03ae:
            r0 = 0
            X.4pU[] r0 = new X.C97154pU[r0]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.Object[] r3 = r5.toArray(r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            X.4pU[] r3 = (X.C97154pU[]) r3     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            X.3VE r0 = new X.3VE     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r10 = r3
            r8 = r0
            r9 = r7
            r8.<init>(r9, r10, r11, r12, r13, r15)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x04c7
        L_0x03c1:
            if (r11 != r13) goto L_0x0451
            if (r10 != r8) goto L_0x0451
            if (r9 != r5) goto L_0x0451
            int r13 = r4.A01     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            byte[] r8 = r4.A02     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r7 = r13
        L_0x03cc:
            int r0 = r8.length     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r7 >= r0) goto L_0x03d6
            byte r0 = r8[r7]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r0 == 0) goto L_0x03d7
            int r7 = r7 + 1
            goto L_0x03cc
        L_0x03d6:
            r7 = r0
        L_0x03d7:
            int r5 = r7 - r13
            java.lang.String r12 = "ISO-8859-1"
            java.lang.String r16 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0 = r16
            r0.<init>(r8, r13, r5, r12)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r0 = r7 + 1
            r4.A0S(r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r5 = r4.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0 = r5 & 2
            r14 = 0
            boolean r22 = X.AnonymousClass000.A1O(r0)
            r0 = r5 & 1
            boolean r23 = X.AnonymousClass000.A1O(r0)
            int r11 = r4.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String[] r15 = new java.lang.String[r11]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r10 = 0
        L_0x03ff:
            if (r10 >= r11) goto L_0x0422
            int r9 = r4.A01     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            byte[] r8 = r4.A02     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r7 = r9
        L_0x0406:
            int r0 = r8.length     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r7 >= r0) goto L_0x0410
            byte r0 = r8[r7]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r0 == 0) goto L_0x0411
            int r7 = r7 + 1
            goto L_0x0406
        L_0x0410:
            r7 = r0
        L_0x0411:
            int r5 = r7 - r9
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0.<init>(r8, r9, r5, r12)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r15[r10] = r0     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r0 = r7 + 1
            r4.A0S(r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r10 = r10 + 1
            goto L_0x03ff
        L_0x0422:
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r13 = r13 + r3
        L_0x0427:
            int r0 = r4.A01     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r0 >= r13) goto L_0x043b
            r5 = r20
            r3 = r18
            r0 = r19
            X.4pU r0 = A01(r5, r4, r6, r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r0 == 0) goto L_0x0427
            r7.add(r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x0427
        L_0x043b:
            X.4pU[] r0 = new X.C97154pU[r14]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.Object[] r3 = r7.toArray(r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            X.4pU[] r3 = (X.C97154pU[]) r3     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            X.3V5 r0 = new X.3V5     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r20 = r3
            r21 = r15
            r18 = r0
            r19 = r16
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x04c7
        L_0x0451:
            java.lang.String r6 = A03(r6, r12, r11, r10, r9)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            byte[] r5 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0 = 0
            r4.A0V(r5, r0, r3)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            X.3V4 r0 = new X.3V4     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r0.<init>(r6, r5)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x04c7
        L_0x0461:
            java.lang.String r9 = A03(r6, r12, r11, r10, r9)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            byte[] r8 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r7 = 0
            r4.A0V(r8, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r6 = 0
        L_0x046c:
            if (r6 >= r3) goto L_0x0475
            byte r0 = r8[r6]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            if (r0 == 0) goto L_0x0476
            int r6 = r6 + 1
            goto L_0x046c
        L_0x0475:
            r6 = r3
        L_0x0476:
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r5.<init>(r8, r7, r6, r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            X.3V8 r0 = new X.3V8     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r3 = r17
            r0.<init>(r9, r3, r5)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x04c7
        L_0x0485:
            java.lang.String r8 = A03(r6, r12, r11, r10, r9)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r5 = 1
            if (r3 >= r5) goto L_0x04a8
            r0 = r17
        L_0x048e:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0o()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r5 = "Failed to decode frame: id="
            r7.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r5 = A03(r6, r12, r11, r10, r9)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r7.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r5 = ", frameSize="
            java.lang.String r3 = X.C13680ns.A0i(r5, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            android.util.Log.w(r1, r3)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            goto L_0x04c7
        L_0x04a8:
            int r0 = r4.A0C()     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r9 = A02(r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r3 = r3 - r5
            byte[] r7 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r6 = 0
            r4.A0V(r7, r6, r3)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            int r0 = A00(r7, r6, r0)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r5.<init>(r7, r6, r0, r9)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            X.3V7 r0 = new X.3V7     // Catch:{ UnsupportedEncodingException -> 0x04cb }
            r3 = r17
            r0.<init>(r8, r3, r5)     // Catch:{ UnsupportedEncodingException -> 0x04cb }
        L_0x04c7:
            r4.A0S(r2)
            return r0
        L_0x04cb:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x04d1 }
            goto L_0x04db
        L_0x04d1:
            r0 = move-exception
            r4.A0S(r2)
            throw r0
        L_0x04d6:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r1, r0)
        L_0x04db:
            r4.A0S(r2)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3V3.A01(X.5Nl, X.4eH, int, int, boolean):X.4pU");
    }

    public static String A02(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "ISO-8859-1" : DefaultCrypto.UTF_8 : "UTF-16BE" : "UTF-16";
    }

    public static String A03(int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr;
        String str;
        Locale locale = Locale.US;
        if (i2 == 2) {
            objArr = new Object[3];
            AnonymousClass000.A1M(objArr, i3, 0);
            AnonymousClass000.A1M(objArr, i4, 1);
            AnonymousClass000.A1M(objArr, i5, 2);
            str = "%c%c%c";
        } else {
            objArr = new Object[4];
            AnonymousClass000.A1M(objArr, i3, 0);
            AnonymousClass000.A1M(objArr, i4, 1);
            AnonymousClass000.A1M(objArr, i5, 2);
            AnonymousClass000.A1M(objArr, i6, 3);
            str = "%c%c%c%c";
        }
        return String.format(locale, str, objArr);
    }

    public static String A04(String str, byte[] bArr, int i2, int i3) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        r13.A0S(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082 A[SYNTHETIC, Splitter:B:30:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008c A[EDGE_INSN: B:42:0x008c->B:34:0x008c ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.C90504eH r13, int r14, int r15, boolean r16) {
        /*
            int r5 = r13.A01
            goto L_0x0007
        L_0x0003:
            int r0 = (int) r3     // Catch:{ all -> 0x0090 }
            r13.A0T(r0)     // Catch:{ all -> 0x0090 }
        L_0x0007:
            int r6 = r13.A00     // Catch:{ all -> 0x0090 }
            int r0 = r13.A01     // Catch:{ all -> 0x0090 }
            int r0 = r6 - r0
            r10 = 1
            if (r0 < r15) goto L_0x0035
            r2 = 3
            r12 = 0
            if (r14 < r2) goto L_0x0021
            int r1 = r13.A07()     // Catch:{ all -> 0x0090 }
            long r3 = r13.A0I()     // Catch:{ all -> 0x0090 }
            int r7 = r13.A0F()     // Catch:{ all -> 0x0090 }
            goto L_0x002b
        L_0x0021:
            int r1 = r13.A0D()     // Catch:{ all -> 0x0090 }
            int r0 = r13.A0D()     // Catch:{ all -> 0x0090 }
            long r3 = (long) r0     // Catch:{ all -> 0x0090 }
            r7 = 0
        L_0x002b:
            r8 = 0
            if (r1 != 0) goto L_0x0039
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0039
            if (r7 != 0) goto L_0x0039
        L_0x0035:
            r13.A0S(r5)
            return r10
        L_0x0039:
            r0 = 4
            if (r14 != r0) goto L_0x0075
            if (r16 != 0) goto L_0x0063
            r1 = 8421504(0x808080, double:4.160776E-317)
            long r1 = r1 & r3
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x008c
            r10 = 255(0xff, double:1.26E-321)
            long r8 = r3 & r10
            r0 = 8
            long r1 = r3 >> r0
            long r1 = r1 & r10
            r0 = 7
            long r1 = r1 << r0
            long r8 = r8 | r1
            r0 = 16
            long r1 = r3 >> r0
            long r1 = r1 & r10
            r0 = 14
            long r1 = r1 << r0
            long r8 = r8 | r1
            r0 = 24
            long r3 = r3 >> r0
            long r3 = r3 & r10
            r0 = 21
            long r3 = r3 << r0
            long r3 = r3 | r8
        L_0x0063:
            r0 = r7 & 64
            boolean r1 = X.AnonymousClass000.A1O(r0)
            r0 = r7 & 1
        L_0x006b:
            if (r0 == 0) goto L_0x006f
            int r1 = r1 + 4
        L_0x006f:
            long r1 = (long) r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x008c
            goto L_0x0082
        L_0x0075:
            if (r14 != r2) goto L_0x0080
            r0 = r7 & 32
            boolean r1 = X.AnonymousClass000.A1O(r0)
            r0 = r7 & 128(0x80, float:1.794E-43)
            goto L_0x006b
        L_0x0080:
            r1 = 0
            goto L_0x006f
        L_0x0082:
            int r0 = r13.A01     // Catch:{ all -> 0x0090 }
            int r6 = r6 - r0
            long r1 = (long) r6     // Catch:{ all -> 0x0090 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x008c
            goto L_0x0003
        L_0x008c:
            r13.A0S(r5)
            return r12
        L_0x0090:
            r0 = move-exception
            r13.A0S(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3V3.A05(X.4eH, int, int, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C93724jf A06(byte[] r14, int r15) {
        /*
            r13 = this;
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            X.4eH r4 = new X.4eH
            r4.<init>(r14, r15)
            int r1 = X.C90504eH.A00(r4)
            r9 = 0
            java.lang.String r6 = "Id3Decoder"
            r0 = 10
            if (r1 >= r0) goto L_0x004f
            java.lang.String r0 = "Data too short to be an ID3 tag"
        L_0x0016:
            android.util.Log.w(r6, r0)
        L_0x0019:
            r12 = 0
            if (r9 == 0) goto L_0x00fa
            int r10 = r4.A01
            int r5 = r9.A01
            r0 = 2
            r7 = 10
            if (r5 != r0) goto L_0x0026
            r7 = 6
        L_0x0026:
            int r8 = r9.A00
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x00c3
            byte[] r9 = r4.A02
            r11 = r10
        L_0x002f:
            int r2 = r11 + 1
            int r0 = r10 + r8
            if (r2 >= r0) goto L_0x00c3
            byte r1 = r9[r11]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x004d
            byte r0 = r9[r2]
            if (r0 != 0) goto L_0x004d
            int r0 = r11 - r10
            int r1 = r11 + 2
            int r0 = r8 - r0
            int r0 = r0 + -2
            java.lang.System.arraycopy(r9, r1, r9, r2, r0)
            int r8 = r8 + -1
        L_0x004d:
            r11 = r2
            goto L_0x002f
        L_0x004f:
            int r5 = r4.A0D()
            r0 = 4801587(0x494433, float:6.728456E-39)
            r7 = 0
            r1 = 1
            if (r5 == r0) goto L_0x0070
            java.lang.String r0 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.AnonymousClass000.A1M(r1, r5, r7)
            java.lang.String r0 = "%06X"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)
            goto L_0x0016
        L_0x0070:
            int r5 = r4.A0C()
            int r8 = X.C90504eH.A01(r4, r1)
            int r2 = r4.A0B()
            r0 = 2
            r1 = 4
            if (r5 != r0) goto L_0x0087
            r0 = r8 & 64
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            goto L_0x0016
        L_0x0087:
            r0 = 3
            if (r5 != r0) goto L_0x00a4
            r0 = r8 & 64
            if (r0 == 0) goto L_0x0098
            int r0 = r4.A07()
            r4.A0T(r0)
            int r0 = r0 + 4
            int r2 = r2 - r0
        L_0x0098:
            r0 = r8 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x009d
            r7 = 1
        L_0x009d:
            X.4JW r9 = new X.4JW
            r9.<init>(r5, r2, r7)
            goto L_0x0019
        L_0x00a4:
            if (r5 != r1) goto L_0x00bb
            r0 = r8 & 64
            if (r0 == 0) goto L_0x00b4
            int r1 = r4.A0B()
            int r0 = r1 + -4
            r4.A0T(r0)
            int r2 = r2 - r1
        L_0x00b4:
            r0 = r8 & 16
            if (r0 == 0) goto L_0x009d
            int r2 = r2 + -10
            goto L_0x009d
        L_0x00bb:
            java.lang.String r0 = "Skipped ID3 tag with unsupported majorVersion="
            java.lang.String r0 = X.C13680ns.A0c(r5, r0)
            goto L_0x0016
        L_0x00c3:
            int r10 = r10 + r8
            r4.A0R(r10)
            r2 = 0
            boolean r0 = A05(r4, r5, r7, r2)
            r1 = 1
            if (r0 != 0) goto L_0x00d9
            r0 = 4
            if (r5 != r0) goto L_0x00f1
            boolean r0 = A05(r4, r0, r7, r1)
            if (r0 == 0) goto L_0x00f1
            r2 = 1
        L_0x00d9:
            int r0 = X.C90504eH.A00(r4)
            if (r0 < r7) goto L_0x00eb
            X.5Nl r0 = r13.A00
            X.4pU r0 = A01(r0, r4, r5, r7, r2)
            if (r0 == 0) goto L_0x00d9
            r3.add(r0)
            goto L_0x00d9
        L_0x00eb:
            X.4jf r0 = new X.4jf
            r0.<init>((java.util.List) r3)
            return r0
        L_0x00f1:
            java.lang.String r0 = "Failed to validate ID3 tag with majorVersion="
            java.lang.String r0 = X.C13680ns.A0c(r5, r0)
            android.util.Log.w(r6, r0)
        L_0x00fa:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3V3.A06(byte[], int):X.4jf");
    }
}
