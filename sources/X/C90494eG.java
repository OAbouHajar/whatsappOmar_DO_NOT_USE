package X;

import android.support.v4.view.GravityCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;

/* renamed from: X.4eG  reason: invalid class name and case insensitive filesystem */
public class C90494eG {
    public int A00;
    public C89384c4 A01;
    public short A02;
    public short A03;
    public int[] A04;
    public int[] A05;
    public int[] A06;
    public int[] A07;
    public int[] A08;

    public C90494eG(C89384c4 r1) {
        this.A01 = r1;
    }

    public static int A00(Object obj, AnonymousClass4XW r5) {
        if (obj instanceof Integer) {
            return 4194304 | AnonymousClass000.A0D(obj);
        }
        if (!(obj instanceof String)) {
            return r5.A04("", ((C89384c4) obj).A00) | 12582912;
        }
        String str = (String) obj;
        int i2 = 12;
        if (str.charAt(0) == '[') {
            i2 = 9;
        }
        return A01(new C90854ew(str, i2, 0, str.length()).A06(), r5, 0);
    }

    public static int A01(String str, AnonymousClass4XW r13, int i2) {
        char charAt = str.charAt(i2);
        int i3 = 4194306;
        if (charAt == 'F') {
            return 4194306;
        }
        if (charAt == 'L') {
            return r13.A03(str.substring(i2 + 1, str.length() - 1)) | GravityCompat.RELATIVE_LAYOUT_DIRECTION;
        }
        if (charAt != 'S') {
            if (charAt == 'V') {
                return 0;
            }
            if (charAt != 'I') {
                if (charAt == 'J') {
                    return 4194308;
                }
                if (charAt != 'Z') {
                    if (charAt != '[') {
                        switch (charAt) {
                            case 'B':
                            case 'C':
                                break;
                            case 'D':
                                return 4194307;
                        }
                    } else {
                        int i4 = i2 + 1;
                        while (str.charAt(i4) == '[') {
                            i4++;
                        }
                        char charAt2 = str.charAt(i4);
                        if (charAt2 != 'F') {
                            if (charAt2 == 'L') {
                                i3 = r13.A03(str.substring(i4 + 1, str.length() - 1)) | GravityCompat.RELATIVE_LAYOUT_DIRECTION;
                            } else if (charAt2 == 'S') {
                                i3 = 4194316;
                            } else if (charAt2 == 'Z') {
                                i3 = 4194313;
                            } else if (charAt2 == 'I') {
                                i3 = 4194305;
                            } else if (charAt2 != 'J') {
                                switch (charAt2) {
                                    case 'B':
                                        i3 = 4194314;
                                        break;
                                    case 'C':
                                        i3 = 4194315;
                                        break;
                                    case 'D':
                                        i3 = 4194307;
                                        break;
                                }
                            } else {
                                i3 = 4194308;
                            }
                        }
                        return ((i4 - i2) << 26) | i3;
                    }
                    throw AnonymousClass3K3.A0f();
                }
            }
        }
        return 4194305;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f5, code lost:
        if (r7 == 8388608) goto L_0x00f7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass4XW r15, int[] r16, int r17, int r18) {
        /*
            r7 = r17
            r3 = r16[r18]
            r5 = 0
            if (r3 == r7) goto L_0x001a
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r0 = r0 & r17
            r1 = 4194309(0x400005, float:5.877479E-39)
            if (r0 != r1) goto L_0x0016
            if (r3 == r1) goto L_0x001a
            r7 = 4194309(0x400005, float:5.877479E-39)
        L_0x0016:
            if (r3 != 0) goto L_0x001b
            r16[r18] = r7
        L_0x001a:
            return
        L_0x001b:
            r10 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r9 = r3 & r10
            r2 = 4194304(0x400000, float:5.877472E-39)
            r8 = 62914560(0x3c00000, float:1.1284746E-36)
            r6 = 8388608(0x800000, float:1.17549435E-38)
            if (r9 != 0) goto L_0x003d
            r0 = r3 & r8
            if (r0 == r6) goto L_0x003d
            if (r3 != r1) goto L_0x0038
            r0 = r7 & r10
            if (r0 != 0) goto L_0x0037
            r0 = r7 & r8
            if (r0 == r6) goto L_0x0037
            r7 = 4194304(0x400000, float:5.877472E-39)
        L_0x0037:
            r2 = r7
        L_0x0038:
            if (r2 == r3) goto L_0x001a
            r16[r18] = r2
            return
        L_0x003d:
            if (r7 == r1) goto L_0x001a
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r0 = r7 & r1
            r1 = r1 & r3
            java.lang.String r11 = "java/lang/Object"
            r4 = r15
            if (r0 != r1) goto L_0x00f0
            r0 = r3 & r8
            if (r0 != r6) goto L_0x00ed
            r2 = r7 & r10
            r2 = r2 | r6
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r6
            r6 = r6 & r3
            r8 = 32
            if (r7 >= r6) goto L_0x00e9
            long r14 = (long) r7
            long r0 = (long) r6
        L_0x005b:
            long r0 = r0 << r8
            long r14 = r14 | r0
            int r0 = r7 + r6
            r12 = 130(0x82, float:1.82E-43)
            int r13 = r12 + r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r13 = r13 & r0
            X.4eU r8 = X.AnonymousClass4XW.A00(r4, r13)
        L_0x006b:
            if (r8 == 0) goto L_0x0082
            int r0 = r8.A04
            if (r0 != r12) goto L_0x007f
            int r0 = r8.A02
            if (r0 != r13) goto L_0x007f
            long r0 = r8.A05
            int r9 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r9 != 0) goto L_0x007f
            int r0 = r8.A00
        L_0x007d:
            r2 = r2 | r0
            goto L_0x0038
        L_0x007f:
            X.4eU r8 = r8.A01
            goto L_0x006b
        L_0x0082:
            X.4eU[] r1 = r4.A09
            r0 = r1[r7]
            java.lang.String r9 = r0.A08
            r0 = r1[r6]
            java.lang.String r8 = r0.A08
            X.4Wj r0 = r4.A0A
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r7 = r0.getClassLoader()
            r6 = 46
            r1 = 47
            java.lang.String r0 = r9.replace(r1, r6)     // Catch:{ ClassNotFoundException -> 0x0116 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r5, r7)     // Catch:{ ClassNotFoundException -> 0x0116 }
            java.lang.String r10 = r8.replace(r1, r6)     // Catch:{ ClassNotFoundException -> 0x010f }
            java.lang.Class r5 = java.lang.Class.forName(r10, r5, r7)     // Catch:{ ClassNotFoundException -> 0x010f }
            boolean r7 = r0.isAssignableFrom(r5)
            if (r7 != 0) goto L_0x00b7
            boolean r7 = r5.isAssignableFrom(r0)
            if (r7 == 0) goto L_0x00c8
            r9 = r8
        L_0x00b7:
            int r0 = r4.A03(r9)
            int r11 = r4.A04
            X.4eU r10 = new X.4eU
            r10.<init>((int) r11, (int) r12, (int) r13, (long) r14)
            r4.A0F(r10)
            r10.A00 = r0
            goto L_0x007d
        L_0x00c8:
            boolean r7 = r0.isInterface()
            if (r7 != 0) goto L_0x00d4
            boolean r7 = r5.isInterface()
            if (r7 == 0) goto L_0x00d6
        L_0x00d4:
            r9 = r11
            goto L_0x00b7
        L_0x00d6:
            java.lang.Class r0 = r0.getSuperclass()
            boolean r7 = r0.isAssignableFrom(r5)
            if (r7 == 0) goto L_0x00d6
            java.lang.String r0 = r0.getName()
            java.lang.String r9 = r0.replace(r6, r1)
            goto L_0x00b7
        L_0x00e9:
            long r14 = (long) r6
            long r0 = (long) r7
            goto L_0x005b
        L_0x00ed:
            r7 = r7 & r10
            int r7 = r7 + r10
            goto L_0x0102
        L_0x00f0:
            r1 = r7 & r10
            r7 = r7 & r8
            if (r1 != 0) goto L_0x010b
            if (r7 != r6) goto L_0x0038
        L_0x00f7:
            if (r9 == 0) goto L_0x00fe
            r0 = r3 & r8
            if (r0 == r6) goto L_0x00fe
            int r9 = r9 + r10
        L_0x00fe:
            int r7 = java.lang.Math.min(r1, r9)
        L_0x0102:
            r7 = r7 | r6
            int r0 = r15.A03(r11)
            r2 = r7 | r0
            goto L_0x0038
        L_0x010b:
            if (r7 == r6) goto L_0x00f7
            int r1 = r1 + r10
            goto L_0x00f7
        L_0x010f:
            r0 = move-exception
            java.lang.TypeNotPresentException r1 = new java.lang.TypeNotPresentException
            r1.<init>(r8, r0)
            throw r1
        L_0x0116:
            r0 = move-exception
            java.lang.TypeNotPresentException r1 = new java.lang.TypeNotPresentException
            r1.<init>(r9, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90494eG.A02(X.4XW, int[], int, int):void");
    }

    public final int A03() {
        short s2 = this.A03;
        if (s2 > 0) {
            int[] iArr = this.A08;
            short s3 = (short) (s2 - 1);
            this.A03 = s3;
            return iArr[s3];
        }
        short s4 = (short) (this.A02 - 1);
        this.A02 = s4;
        return 20971520 | (-s4);
    }

    public final int A04(int i2, int i3) {
        int i4;
        int i5 = -67108864 & i2;
        int i6 = 62914560 & i2;
        if (i6 == 16777216) {
            i4 = this.A05[i2 & 1048575];
        } else if (i6 != 20971520) {
            return i2;
        } else {
            i4 = this.A06[i3 - (1048575 & i2)];
        }
        int i7 = i5 + i4;
        if ((i2 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 0 || (i7 != 4194308 && i7 != 4194307)) {
            return i7;
        }
        return 4194304;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f A[LOOP:0: B:5:0x000d->B:18:0x003f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A05(X.AnonymousClass4XW r9, int r10) {
        /*
            r8 = this;
            r6 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r6) goto L_0x000c
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r10
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != r0) goto L_0x004d
        L_0x000c:
            r7 = 0
        L_0x000d:
            int r0 = r8.A00
            if (r7 >= r0) goto L_0x004d
            int[] r0 = r8.A04
            r1 = r0[r7]
            r5 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r5 = r5 & r1
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r1
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r1 & r3
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 != r0) goto L_0x0042
            int[] r0 = r8.A05
            r1 = r0[r2]
        L_0x0028:
            int r1 = r1 + r5
        L_0x0029:
            if (r10 != r1) goto L_0x003f
            r1 = 8388608(0x800000, float:1.17549435E-38)
            if (r10 != r6) goto L_0x0037
            java.lang.String r0 = r9.A05
        L_0x0031:
            int r0 = r9.A03(r0)
            r0 = r0 | r1
            return r0
        L_0x0037:
            r10 = r10 & r3
            X.4eU[] r0 = r9.A09
            r0 = r0[r10]
            java.lang.String r0 = r0.A08
            goto L_0x0031
        L_0x003f:
            int r7 = r7 + 1
            goto L_0x000d
        L_0x0042:
            r0 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r0) goto L_0x0029
            int[] r1 = r8.A06
            int r0 = r1.length
            int r0 = r0 - r2
            r1 = r1[r0]
            goto L_0x0028
        L_0x004d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90494eG.A05(X.4XW, int):int");
    }

    public final void A06(int i2) {
        short s2;
        short s3 = this.A03;
        if (s3 >= i2) {
            s2 = (short) (s3 - i2);
        } else {
            this.A02 = (short) (this.A02 - (i2 - s3));
            s2 = 0;
        }
        this.A03 = s2;
    }

    public final void A07(int i2) {
        int[] iArr = this.A08;
        if (iArr == null) {
            iArr = new int[10];
            this.A08 = iArr;
        }
        int length = iArr.length;
        short s2 = this.A03;
        if (s2 >= length) {
            int[] iArr2 = new int[Math.max(s2 + 1, length << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A08 = iArr2;
            iArr = iArr2;
        }
        short s3 = this.A03;
        short s4 = (short) (s3 + 1);
        this.A03 = s4;
        iArr[s3] = i2;
        short s5 = (short) (this.A02 + s4);
        C89384c4 r1 = this.A01;
        if (s5 > r1.A08) {
            r1.A08 = s5;
        }
    }

    public final void A08(int i2, int i3) {
        int[] iArr = this.A07;
        if (iArr == null) {
            iArr = new int[10];
            this.A07 = iArr;
        }
        int length = iArr.length;
        if (i2 >= length) {
            int[] iArr2 = new int[Math.max(i2 + 1, length << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A07 = iArr2;
            iArr = iArr2;
        }
        iArr[i2] = i3;
    }

    public final void A09(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            A06((C90854ew.A00(str) >> 2) - 1);
        } else if (charAt == 'J' || charAt == 'D') {
            A06(2);
        } else {
            A06(1);
        }
    }

    public final void A0A(String str, AnonymousClass4XW r6) {
        int i2 = 0;
        if (str.charAt(0) == '(') {
            int i3 = 1;
            while (str.charAt(i3) != ')') {
                while (str.charAt(i3) == '[') {
                    i3++;
                }
                int i4 = i3 + 1;
                i3 = str.charAt(i3) == 'L' ? Math.max(i4, str.indexOf(59, i4) + 1) : i4;
            }
            i2 = i3 + 1;
        }
        int A012 = A01(str, r6, i2);
        if (A012 != 0) {
            A07(A012);
            if (A012 == 4194308 || A012 == 4194307) {
                A07(4194304);
            }
        }
    }

    public final void A0B(String str, AnonymousClass4XW r12, int i2, int i3) {
        int i4;
        int[] iArr = new int[i3];
        this.A05 = iArr;
        this.A06 = new int[0];
        int i5 = 1;
        if ((i2 & 8) == 0) {
            int i6 = 4194310;
            if ((i2 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 0) {
                i6 = 8388608 | r12.A03(r12.A05);
            }
            iArr[0] = i6;
        } else {
            i5 = 0;
        }
        for (C90854ew A062 : C90854ew.A05(str)) {
            int A012 = A01(A062.A06(), r12, 0);
            int[] iArr2 = this.A05;
            int i7 = i4 + 1;
            iArr2[i4] = A012;
            if (A012 != 4194308) {
                i4 = i7;
                if (A012 != 4194307) {
                }
            }
            i4 = i7 + 1;
            iArr2[i7] = 4194304;
        }
        while (i4 < i3) {
            this.A05[i4] = 4194304;
            i4++;
        }
    }

    public final void A0C(AnonymousClass5HU r14) {
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.A05;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        loop0:
        while (true) {
            int i9 = 0;
            do {
                int i10 = 2;
                if (i7 >= iArr.length) {
                    break loop0;
                }
                i5 = iArr[i7];
                if (!(i5 == 4194308 || i5 == 4194307)) {
                    i10 = 1;
                }
                i7 += i10;
                i9++;
            } while (i5 == 4194304);
            i8 += i9;
        }
        int[] iArr2 = this.A06;
        int i11 = 0;
        int i12 = 0;
        while (i11 < iArr2.length) {
            int i13 = iArr2[i11];
            if (i13 != 4194308) {
                i4 = 1;
                if (i13 != 4194307) {
                    i11 += i4;
                    i12++;
                }
            }
            i4 = 2;
            i11 += i4;
            i12++;
        }
        int i14 = this.A01.A00;
        int i15 = i8 + 3 + i12;
        int[] iArr3 = r14.A0Y;
        if (iArr3 == null || iArr3.length < i15) {
            iArr3 = new int[i15];
            r14.A0Y = iArr3;
        }
        iArr3[0] = i14;
        iArr3[1] = i8;
        iArr3[2] = i12;
        int i16 = 3;
        int i17 = 0;
        while (true) {
            int i18 = i8 - 1;
            if (i8 <= 0) {
                break;
            }
            int i19 = iArr[i17];
            if (i19 != 4194308) {
                i3 = 1;
                if (i19 != 4194307) {
                    i17 += i3;
                    iArr3[i16] = i19;
                    i8 = i18;
                    i16++;
                }
            }
            i3 = 2;
            i17 += i3;
            iArr3[i16] = i19;
            i8 = i18;
            i16++;
        }
        while (true) {
            int i20 = i12 - 1;
            if (i12 > 0) {
                int i21 = iArr2[i6];
                if (i21 != 4194308) {
                    i2 = 1;
                    if (i21 != 4194307) {
                        i6 += i2;
                        iArr3[i16] = i21;
                        i16++;
                        i12 = i20;
                    }
                }
                i2 = 2;
                i6 += i2;
                iArr3[i16] = i21;
                i16++;
                i12 = i20;
            } else {
                r14.A0E();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x021b, code lost:
        r1 = r1.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x021d, code lost:
        A0A(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0220, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0221, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0222, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0225, code lost:
        A07(4194305);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0228, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0229, code lost:
        A06(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x022d, code lost:
        A07(4194306);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0230, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0234, code lost:
        A07(4194308);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x023b, code lost:
        A07(4194307);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x023e, code lost:
        A07(4194304);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0241, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x024a, code lost:
        r3 = r5.A03(r1) | android.support.v4.view.GravityCompat.RELATIVE_LAYOUT_DIRECTION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0258, code lost:
        A07(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x025b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        A06(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        A07(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a2, code lost:
        A07(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bf, code lost:
        A07(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c2, code lost:
        A07(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        if (r1.charAt(0) == '[') goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018f, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0190, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01bd, code lost:
        if (r21 <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01bf, code lost:
        r3 = r21 - 1;
        r2 = r4.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c3, code lost:
        if (r2 == null) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c6, code lost:
        if (r3 >= r2.length) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c8, code lost:
        r1 = r2[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ca, code lost:
        if (r1 != 0) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cc, code lost:
        r1 = r3 | 16777216;
        r2[r3] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d0, code lost:
        if (r1 == 4194308) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d2, code lost:
        if (r1 == 4194307) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d4, code lost:
        r0 = r1 & 62914560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d6, code lost:
        if (r0 == 16777216) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d8, code lost:
        if (r0 != 20971520) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01da, code lost:
        A08(r3, r1 | android.support.v4.view.accessibility.AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e1, code lost:
        r1 = r3 | 16777216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e4, code lost:
        A08(r3, 4194304);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e8, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e9, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        throw X.AnonymousClass3K3.A0f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C90634eU r18, X.AnonymousClass4XW r19, int r20, int r21) {
        /*
            r17 = this;
            r11 = r21
            r12 = 4194306(0x400002, float:5.877475E-39)
            r16 = 8388608(0x800000, float:1.17549435E-38)
            r13 = 4194305(0x400001, float:5.877473E-39)
            r10 = 4194307(0x400003, float:5.877476E-39)
            r9 = 4194308(0x400004, float:5.877477E-39)
            r8 = 4194304(0x400000, float:5.877472E-39)
            r4 = r17
            r5 = r19
            r2 = r20
            r1 = r18
            switch(r20) {
                case 0: goto L_0x025f;
                case 1: goto L_0x0203;
                case 2: goto L_0x0225;
                case 3: goto L_0x0225;
                case 4: goto L_0x0225;
                case 5: goto L_0x0225;
                case 6: goto L_0x0225;
                case 7: goto L_0x0225;
                case 8: goto L_0x0225;
                case 9: goto L_0x0234;
                case 10: goto L_0x0234;
                case 11: goto L_0x022d;
                case 12: goto L_0x022d;
                case 13: goto L_0x022d;
                case 14: goto L_0x023b;
                case 15: goto L_0x023b;
                case 16: goto L_0x0225;
                case 17: goto L_0x0225;
                case 18: goto L_0x0207;
                default: goto L_0x001d;
            }
        L_0x001d:
            switch(r20) {
                case 21: goto L_0x0225;
                case 22: goto L_0x0234;
                case 23: goto L_0x022d;
                case 24: goto L_0x023b;
                case 25: goto L_0x01ed;
                default: goto L_0x0020;
            }
        L_0x0020:
            r7 = 20971520(0x1400000, float:3.526483E-38)
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            r15 = 62914560(0x3c00000, float:1.1284746E-36)
            r14 = 1
            switch(r20) {
                case 46: goto L_0x0221;
                case 47: goto L_0x01e8;
                case 48: goto L_0x0229;
                case 49: goto L_0x018f;
                case 50: goto L_0x0195;
                case 51: goto L_0x0221;
                case 52: goto L_0x0221;
                case 53: goto L_0x0221;
                case 54: goto L_0x01a6;
                case 55: goto L_0x01ae;
                case 56: goto L_0x01a6;
                case 57: goto L_0x01ae;
                case 58: goto L_0x01a6;
                default: goto L_0x002a;
            }
        L_0x002a:
            r6 = 3
            r3 = 91
            r7 = 0
            r0 = 4
            switch(r20) {
                case 79: goto L_0x025c;
                case 80: goto L_0x006a;
                case 81: goto L_0x025c;
                case 82: goto L_0x006a;
                case 83: goto L_0x025c;
                case 84: goto L_0x025c;
                case 85: goto L_0x025c;
                case 86: goto L_0x025c;
                case 87: goto L_0x0065;
                case 88: goto L_0x0069;
                case 89: goto L_0x0041;
                case 90: goto L_0x006e;
                case 91: goto L_0x0077;
                case 92: goto L_0x0084;
                case 93: goto L_0x0093;
                case 94: goto L_0x00a6;
                case 95: goto L_0x00c7;
                case 96: goto L_0x0221;
                case 97: goto L_0x01e9;
                case 98: goto L_0x0229;
                case 99: goto L_0x0190;
                case 100: goto L_0x0221;
                case 101: goto L_0x01e9;
                case 102: goto L_0x0229;
                case 103: goto L_0x0190;
                case 104: goto L_0x0221;
                case 105: goto L_0x01e9;
                case 106: goto L_0x0229;
                case 107: goto L_0x0190;
                case 108: goto L_0x0221;
                case 109: goto L_0x01e9;
                case 110: goto L_0x0229;
                case 111: goto L_0x0190;
                case 112: goto L_0x0221;
                case 113: goto L_0x01e9;
                case 114: goto L_0x0229;
                case 115: goto L_0x0190;
                case 116: goto L_0x025f;
                case 117: goto L_0x025f;
                case 118: goto L_0x025f;
                case 119: goto L_0x025f;
                case 120: goto L_0x0221;
                case 121: goto L_0x0054;
                case 122: goto L_0x0221;
                case 123: goto L_0x0054;
                case 124: goto L_0x0221;
                case 125: goto L_0x0054;
                case 126: goto L_0x0221;
                case 127: goto L_0x01e9;
                case 128: goto L_0x0221;
                case 129: goto L_0x01e9;
                case 130: goto L_0x0221;
                case 131: goto L_0x01e9;
                case 132: goto L_0x00d6;
                case 133: goto L_0x0231;
                case 134: goto L_0x004f;
                case 135: goto L_0x0238;
                case 136: goto L_0x0221;
                case 137: goto L_0x0229;
                case 138: goto L_0x018f;
                case 139: goto L_0x004a;
                case 140: goto L_0x0231;
                case 141: goto L_0x0238;
                case 142: goto L_0x0221;
                case 143: goto L_0x01e8;
                case 144: goto L_0x0229;
                case 145: goto L_0x025f;
                case 146: goto L_0x025f;
                case 147: goto L_0x025f;
                case 148: goto L_0x0222;
                case 149: goto L_0x0221;
                case 150: goto L_0x0221;
                case 151: goto L_0x0222;
                case 152: goto L_0x0222;
                case 153: goto L_0x0065;
                case 154: goto L_0x0065;
                case 155: goto L_0x0065;
                case 156: goto L_0x0065;
                case 157: goto L_0x0065;
                case 158: goto L_0x0065;
                case 159: goto L_0x0069;
                case 160: goto L_0x0069;
                case 161: goto L_0x0069;
                case 162: goto L_0x0069;
                case 163: goto L_0x0069;
                case 164: goto L_0x0069;
                case 165: goto L_0x0069;
                case 166: goto L_0x0069;
                case 167: goto L_0x025f;
                case 168: goto L_0x005e;
                case 169: goto L_0x005e;
                case 170: goto L_0x0065;
                case 171: goto L_0x0065;
                case 172: goto L_0x0065;
                case 173: goto L_0x0069;
                case 174: goto L_0x0065;
                case 175: goto L_0x0069;
                case 176: goto L_0x0065;
                case 177: goto L_0x025f;
                case 178: goto L_0x021b;
                case 179: goto L_0x00da;
                case 180: goto L_0x0059;
                case 181: goto L_0x00e0;
                case 182: goto L_0x00e9;
                case 183: goto L_0x00e9;
                case 184: goto L_0x00e9;
                case 185: goto L_0x00e9;
                case 186: goto L_0x012e;
                case 187: goto L_0x0137;
                case 188: goto L_0x003a;
                case 189: goto L_0x0142;
                case 190: goto L_0x004a;
                case 191: goto L_0x0065;
                case 192: goto L_0x015a;
                case 193: goto L_0x004a;
                case 194: goto L_0x0065;
                case 195: goto L_0x0065;
                default: goto L_0x0032;
            }
        L_0x0032:
            switch(r20) {
                case 197: goto L_0x0218;
                case 198: goto L_0x0065;
                case 199: goto L_0x0065;
                default: goto L_0x0035;
            }
        L_0x0035:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass3K3.A0f()
            throw r0
        L_0x003a:
            r4.A03()
            switch(r21) {
                case 4: goto L_0x0167;
                case 5: goto L_0x016c;
                case 6: goto L_0x0171;
                case 7: goto L_0x0176;
                case 8: goto L_0x017b;
                case 9: goto L_0x0180;
                case 10: goto L_0x0185;
                case 11: goto L_0x018a;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0035
        L_0x0041:
            int r3 = r4.A03()
            r4.A07(r3)
            goto L_0x0258
        L_0x004a:
            r4.A06(r14)
            goto L_0x0225
        L_0x004f:
            r4.A06(r14)
            goto L_0x022d
        L_0x0054:
            r4.A06(r6)
            goto L_0x0234
        L_0x0059:
            r4.A06(r14)
            goto L_0x021b
        L_0x005e:
            java.lang.String r0 = "JSR/RET are not supported with computeFrames option"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0065:
            r4.A06(r14)
            return
        L_0x0069:
            r0 = 2
        L_0x006a:
            r4.A06(r0)
            return
        L_0x006e:
            int r3 = r4.A03()
            int r2 = r4.A03()
            goto L_0x008f
        L_0x0077:
            int r3 = r4.A03()
            int r2 = r4.A03()
            int r1 = r4.A03()
            goto L_0x00a2
        L_0x0084:
            int r3 = r4.A03()
            int r2 = r4.A03()
            r4.A07(r2)
        L_0x008f:
            r4.A07(r3)
            goto L_0x00c2
        L_0x0093:
            int r3 = r4.A03()
            int r2 = r4.A03()
            int r1 = r4.A03()
            r4.A07(r2)
        L_0x00a2:
            r4.A07(r3)
            goto L_0x00bf
        L_0x00a6:
            int r3 = r4.A03()
            int r2 = r4.A03()
            int r1 = r4.A03()
            int r0 = r4.A03()
            r4.A07(r2)
            r4.A07(r3)
            r4.A07(r0)
        L_0x00bf:
            r4.A07(r1)
        L_0x00c2:
            r4.A07(r2)
            goto L_0x0258
        L_0x00c7:
            int r1 = r4.A03()
            int r0 = r4.A03()
            r4.A07(r1)
            r4.A07(r0)
            return
        L_0x00d6:
            r4.A08(r11, r13)
            return
        L_0x00da:
            java.lang.String r0 = r1.A08
            r4.A09(r0)
            return
        L_0x00e0:
            java.lang.String r0 = r1.A08
            r4.A09(r0)
            r4.A03()
            return
        L_0x00e9:
            java.lang.String r6 = r1.A08
            r4.A09(r6)
            r0 = 184(0xb8, float:2.58E-43)
            if (r2 == r0) goto L_0x012a
            int r8 = r4.A03()
            r0 = 183(0xb7, float:2.56E-43)
            if (r2 != r0) goto L_0x012a
            java.lang.String r0 = r1.A06
            char r1 = r0.charAt(r7)
            r0 = 60
            if (r1 != r0) goto L_0x012a
            int[] r3 = r4.A04
            if (r3 != 0) goto L_0x010d
            r0 = 2
            int[] r3 = new int[r0]
            r4.A04 = r3
        L_0x010d:
            int r2 = r3.length
            int r0 = r4.A00
            if (r0 < r2) goto L_0x0122
            int r1 = r0 + 1
            int r0 = r2 << 1
            int r0 = java.lang.Math.max(r1, r0)
            int[] r0 = new int[r0]
            java.lang.System.arraycopy(r3, r7, r0, r7, r2)
            r4.A04 = r0
            r3 = r0
        L_0x0122:
            int r1 = r4.A00
            int r0 = r1 + 1
            r4.A00 = r0
            r3[r1] = r8
        L_0x012a:
            r4.A0A(r6, r5)
            return
        L_0x012e:
            java.lang.String r0 = r1.A08
            r4.A09(r0)
            r4.A0A(r0, r5)
            return
        L_0x0137:
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            java.lang.String r0 = r1.A08
            int r0 = r5.A04(r0, r11)
            r3 = r3 | r0
            goto L_0x0258
        L_0x0142:
            java.lang.String r1 = r1.A08
            r4.A03()
            char r0 = r1.charAt(r7)
            if (r0 != r3) goto L_0x0251
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0o()
            r0.append(r3)
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r0)
            goto L_0x021d
        L_0x015a:
            java.lang.String r1 = r1.A08
            r4.A03()
            char r0 = r1.charAt(r7)
            if (r0 != r3) goto L_0x024a
            goto L_0x021d
        L_0x0167:
            r3 = 71303177(0x4400009, float:2.2569508E-36)
            goto L_0x0258
        L_0x016c:
            r3 = 71303179(0x440000b, float:2.2569511E-36)
            goto L_0x0258
        L_0x0171:
            r3 = 71303170(0x4400002, float:2.2569495E-36)
            goto L_0x0258
        L_0x0176:
            r3 = 71303171(0x4400003, float:2.2569497E-36)
            goto L_0x0258
        L_0x017b:
            r3 = 71303178(0x440000a, float:2.256951E-36)
            goto L_0x0258
        L_0x0180:
            r3 = 71303180(0x440000c, float:2.2569513E-36)
            goto L_0x0258
        L_0x0185:
            r3 = 71303169(0x4400001, float:2.2569493E-36)
            goto L_0x0258
        L_0x018a:
            r3 = 71303172(0x4400004, float:2.2569499E-36)
            goto L_0x0258
        L_0x018f:
            r0 = 2
        L_0x0190:
            r4.A06(r0)
            goto L_0x023b
        L_0x0195:
            r4.A06(r14)
            int r3 = r4.A03()
            r0 = 4194309(0x400005, float:5.877479E-39)
            if (r3 == r0) goto L_0x0258
            r0 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            int r3 = r3 + r0
            goto L_0x0258
        L_0x01a6:
            int r0 = r4.A03()
            r4.A08(r11, r0)
            goto L_0x01bd
        L_0x01ae:
            r4.A06(r14)
            int r0 = r4.A03()
            r4.A08(r11, r0)
            int r0 = r21 + 1
            r4.A08(r0, r8)
        L_0x01bd:
            if (r21 <= 0) goto L_0x025f
            int r3 = r21 + -1
            int[] r2 = r4.A07
            if (r2 == 0) goto L_0x01e1
            int r0 = r2.length
            if (r3 >= r0) goto L_0x01e1
            r1 = r2[r3]
            if (r1 != 0) goto L_0x01d0
            r1 = r3 | r6
            r2[r3] = r1
        L_0x01d0:
            if (r1 == r9) goto L_0x01e4
            if (r1 == r10) goto L_0x01e4
            r0 = r1 & r15
            if (r0 == r6) goto L_0x01da
            if (r0 != r7) goto L_0x025f
        L_0x01da:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r4.A08(r3, r1)
            return
        L_0x01e1:
            r1 = r3 | r6
            goto L_0x01d0
        L_0x01e4:
            r4.A08(r3, r8)
            return
        L_0x01e8:
            r0 = 2
        L_0x01e9:
            r4.A06(r0)
            goto L_0x0234
        L_0x01ed:
            int[] r2 = r4.A07
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r2 == 0) goto L_0x01ff
            int r0 = r2.length
            if (r11 >= r0) goto L_0x01ff
            r3 = r2[r21]
            if (r3 != 0) goto L_0x0258
            r3 = r21 | r1
            r2[r21] = r3
            goto L_0x0258
        L_0x01ff:
            r11 = r21 | r1
            r3 = r11
            goto L_0x0258
        L_0x0203:
            r3 = 4194309(0x400005, float:5.877479E-39)
            goto L_0x0258
        L_0x0207:
            int r0 = r1.A04
            switch(r0) {
                case 3: goto L_0x0225;
                case 4: goto L_0x022d;
                case 5: goto L_0x0234;
                case 6: goto L_0x023b;
                case 7: goto L_0x0242;
                case 8: goto L_0x0245;
                default: goto L_0x020c;
            }
        L_0x020c:
            switch(r0) {
                case 15: goto L_0x0215;
                case 16: goto L_0x0248;
                case 17: goto L_0x021b;
                default: goto L_0x020f;
            }
        L_0x020f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0215:
            java.lang.String r1 = "java/lang/invoke/MethodHandle"
            goto L_0x024a
        L_0x0218:
            r4.A06(r11)
        L_0x021b:
            java.lang.String r1 = r1.A08
        L_0x021d:
            r4.A0A(r1, r5)
            return
        L_0x0221:
            r0 = 2
        L_0x0222:
            r4.A06(r0)
        L_0x0225:
            r4.A07(r13)
            return
        L_0x0229:
            r0 = 2
            r4.A06(r0)
        L_0x022d:
            r4.A07(r12)
            return
        L_0x0231:
            r4.A06(r14)
        L_0x0234:
            r4.A07(r9)
            goto L_0x023e
        L_0x0238:
            r4.A06(r14)
        L_0x023b:
            r4.A07(r10)
        L_0x023e:
            r4.A07(r8)
            return
        L_0x0242:
            java.lang.String r1 = "java/lang/Class"
            goto L_0x024a
        L_0x0245:
            java.lang.String r1 = "java/lang/String"
            goto L_0x024a
        L_0x0248:
            java.lang.String r1 = "java/lang/invoke/MethodType"
        L_0x024a:
            int r3 = r5.A03(r1)
            r3 = r3 | r16
            goto L_0x0258
        L_0x0251:
            r0 = 75497472(0x4800000, float:3.0092655E-36)
            int r3 = r5.A03(r1)
            r3 = r3 | r0
        L_0x0258:
            r4.A07(r3)
            return
        L_0x025c:
            r4.A06(r6)
        L_0x025f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90494eG.A0D(X.4eU, X.4XW, int, int):void");
    }
}
