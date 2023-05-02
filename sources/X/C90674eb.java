package X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: X.4eb  reason: invalid class name and case insensitive filesystem */
public final class C90674eb {
    public static int[] A00 = new int[10];
    public static final Object A01 = C13690nt.A0Y();
    public static final byte[] A02 = {0, 0, 0, 1};
    public static final float[] A03 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    public static int A00(byte[] bArr, int i2) {
        int i3;
        synchronized (A01) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 < i2 - 2) {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } else {
                        i4 = i2;
                        break;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = A00;
                    int length = iArr.length;
                    if (length <= i5) {
                        iArr = Arrays.copyOf(iArr, length << 1);
                        A00 = iArr;
                    }
                    iArr[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = A00[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i11 + 1;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        if (r8[r11 - 3] == 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007a, code lost:
        if (r8[r11 - 2] == 0) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007c, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007f, code lost:
        if (r8[r2] == 1) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008f, code lost:
        if (r8[r2] != 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a5, code lost:
        if (r9[2] != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00aa, code lost:
        if (r9[1] != false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(byte[] r8, boolean[] r9, int r10, int r11) {
        /*
            int r5 = r11 - r10
            r7 = 0
            r4 = 1
            boolean r0 = X.C13700nu.A0f(r5)
            X.C90524eJ.A04(r0)
            if (r5 == 0) goto L_0x00ad
            boolean r0 = r9[r7]
            if (r0 == 0) goto L_0x001b
            r9[r7] = r7
            r9[r4] = r7
            r0 = 2
            r9[r0] = r7
            int r10 = r10 + -3
            return r10
        L_0x001b:
            r3 = 2
            if (r5 <= r4) goto L_0x0046
            boolean r0 = r9[r4]
            if (r0 == 0) goto L_0x002e
            byte r0 = r8[r10]
            if (r0 != r4) goto L_0x002e
            r9[r7] = r7
            r9[r4] = r7
            r9[r3] = r7
            int r10 = r10 - r3
            return r10
        L_0x002e:
            if (r5 <= r3) goto L_0x0046
            boolean r0 = r9[r3]
            if (r0 == 0) goto L_0x0046
            byte r0 = r8[r10]
            if (r0 != 0) goto L_0x0046
            int r0 = r10 + 1
            byte r0 = r8[r0]
            if (r0 != r4) goto L_0x0046
            r9[r7] = r7
            r9[r4] = r7
            r9[r3] = r7
            int r10 = r10 - r4
            return r10
        L_0x0046:
            int r2 = r11 + -1
            int r6 = r10 + 2
        L_0x004a:
            if (r6 >= r2) goto L_0x006e
            byte r0 = r8[r6]
            r0 = r0 & 254(0xfe, float:3.56E-43)
            if (r0 != 0) goto L_0x006b
            int r1 = r6 + -2
            byte r0 = r8[r1]
            if (r0 != 0) goto L_0x0069
            int r0 = r6 + -1
            byte r0 = r8[r0]
            if (r0 != 0) goto L_0x0069
            byte r0 = r8[r6]
            if (r0 != r4) goto L_0x0069
            r9[r7] = r7
            r9[r4] = r7
            r9[r3] = r7
            return r1
        L_0x0069:
            int r6 = r6 + -2
        L_0x006b:
            int r6 = r6 + 3
            goto L_0x004a
        L_0x006e:
            if (r5 <= r3) goto L_0x00a1
            int r0 = r11 + -3
            byte r0 = r8[r0]
            if (r0 != 0) goto L_0x0081
        L_0x0076:
            int r0 = r11 + -2
            byte r0 = r8[r0]
            if (r0 != 0) goto L_0x0081
        L_0x007c:
            byte r1 = r8[r2]
            r0 = 1
            if (r1 == r4) goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            r9[r7] = r0
            if (r5 <= r4) goto L_0x009c
            int r0 = r11 + -2
            byte r0 = r8[r0]
            if (r0 != 0) goto L_0x0091
        L_0x008c:
            byte r1 = r8[r2]
            r0 = 1
            if (r1 == 0) goto L_0x0092
        L_0x0091:
            r0 = 0
        L_0x0092:
            r9[r4] = r0
            byte r0 = r8[r2]
            if (r0 != 0) goto L_0x0099
            r7 = 1
        L_0x0099:
            r9[r3] = r7
            return r11
        L_0x009c:
            boolean r0 = r9[r3]
            if (r0 == 0) goto L_0x0091
            goto L_0x008c
        L_0x00a1:
            if (r5 != r3) goto L_0x00a8
            boolean r0 = r9[r3]
            if (r0 == 0) goto L_0x0081
            goto L_0x0076
        L_0x00a8:
            boolean r0 = r9[r4]
            if (r0 == 0) goto L_0x0081
            goto L_0x007c
        L_0x00ad:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90674eb.A01(byte[], boolean[], int, int):int");
    }

    public static AnonymousClass4O0 A02(byte[] bArr, int i2, int i3) {
        int A012;
        AnonymousClass4XN r5 = new AnonymousClass4XN(bArr, i2, i3);
        r5.A05(8);
        int A022 = r5.A02(8);
        int A023 = r5.A02(8);
        int A024 = r5.A02(8);
        int A013 = r5.A01();
        int i4 = 1;
        if (A022 == 100 || A022 == 110 || A022 == 122 || A022 == 244 || A022 == 44 || A022 == 83 || A022 == 86 || A022 == 118 || A022 == 128 || A022 == 138) {
            A012 = r5.A01();
            if (A012 == 3) {
                r5.A03();
            }
            r5.A01();
            r5.A01();
            r5.A03();
            if (r5.A06()) {
                int i5 = 12;
                if (A012 != 3) {
                    i5 = 8;
                }
                int i6 = 0;
                do {
                    if (r5.A06()) {
                        int i7 = 64;
                        if (i6 < 6) {
                            i7 = 16;
                        }
                        int i8 = 8;
                        int i9 = 0;
                        while (true) {
                            int A002 = ((r5.A00() + i8) + 256) % 256;
                            if (A002 != 0) {
                                i8 = A002;
                            }
                            while (true) {
                                i9++;
                                if (i9 >= i7) {
                                    break;
                                } else if (A002 != 0) {
                                }
                            }
                        }
                    }
                    i6++;
                } while (i6 < i5);
            }
        } else {
            A012 = 1;
        }
        r5.A01();
        int A014 = r5.A01();
        if (A014 == 0) {
            r5.A01();
        } else if (A014 == 1) {
            r5.A03();
            r5.A00();
            r5.A00();
            long A015 = (long) r5.A01();
            for (int i10 = 0; ((long) i10) < A015; i10++) {
                r5.A01();
            }
        }
        r5.A01();
        r5.A03();
        int A016 = r5.A01() + 1;
        boolean A06 = r5.A06();
        int i11 = true - (A06 ? 1 : 0);
        int A017 = (r5.A01() + 1) * i11;
        if (!A06) {
            r5.A03();
        }
        r5.A03();
        int i12 = A016 << 4;
        int i13 = A017 << 4;
        if (r5.A06()) {
            int A018 = r5.A01();
            int A019 = r5.A01();
            int A0110 = r5.A01();
            int A0111 = r5.A01();
            if (A012 != 0) {
                int i14 = 1;
                if (A012 != 3) {
                    i14 = 2;
                    if (A012 == 1) {
                        i4 = 2;
                    }
                }
                i11 *= i4;
                i4 = i14;
            }
            i12 -= (A018 + A019) * i4;
            i13 -= (A0110 + A0111) * i11;
        }
        float f2 = 1.0f;
        if (r5.A06() && r5.A06()) {
            int A025 = r5.A02(8);
            if (A025 == 255) {
                int A026 = r5.A02(16);
                int A027 = r5.A02(16);
                if (!(A026 == 0 || A027 == 0)) {
                    f2 = ((float) A026) / ((float) A027);
                }
            } else {
                float[] fArr = A03;
                if (A025 < fArr.length) {
                    f2 = fArr[A025];
                } else {
                    Log.w("NalUnitUtil", C13680ns.A0c(A025, "Unexpected aspect_ratio_idc value: "));
                }
            }
        }
        return new AnonymousClass4O0(f2, A022, A023, A024, A013, i12, i13);
    }
}
