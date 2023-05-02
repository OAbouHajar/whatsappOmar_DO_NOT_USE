package X;

import com.mod.bomfab.R$styleable;

/* renamed from: X.4ee  reason: invalid class name and case insensitive filesystem */
public final class C90694ee {
    public int A00;
    public C90694ee A01;
    public final int A02;
    public final C90694ee A03;
    public final C89454cD A04;
    public final AnonymousClass4XW A05;
    public final boolean A06;

    public C90694ee(C90694ee r3, C89454cD r4, AnonymousClass4XW r5, boolean z2) {
        this.A05 = r5;
        this.A06 = z2;
        this.A04 = r4;
        int i2 = r4.A00;
        this.A02 = i2 == 0 ? -1 : i2 - 2;
        this.A03 = r3;
        if (r3 != null) {
            r3.A01 = this;
        }
    }

    public static int A00(C90694ee r2, C90694ee r3, C90694ee r4, C90694ee r5) {
        int i2 = 0;
        if (r2 != null) {
            i2 = 0 + r2.A06("RuntimeVisibleAnnotations");
        }
        if (r3 != null) {
            i2 += r3.A06("RuntimeInvisibleAnnotations");
        }
        if (r4 != null) {
            i2 += r4.A06("RuntimeVisibleTypeAnnotations");
        }
        return r5 != null ? i2 + r5.A06("RuntimeInvisibleTypeAnnotations") : i2;
    }

    public static C90694ee A01(String str, C90694ee r4, AnonymousClass4XW r5) {
        C89454cD A002 = C89454cD.A00();
        AnonymousClass4XW.A01(str, A002, r5);
        A002.A06(0);
        return new C90694ee(r4, A002, r5, true);
    }

    public static C90694ee A02(String str, C90694ee r5, AnonymousClass4XW r6, AnonymousClass4R2 r7, int i2) {
        C89454cD A002 = C89454cD.A00();
        int i3 = i2 >>> 24;
        if (!(i3 == 0 || i3 == 1)) {
            switch (i3) {
                case 16:
                case 17:
                case 18:
                case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                    A002.A09(i3, (i2 & 16776960) >> 8);
                    break;
                case 19:
                case 20:
                case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                    A002.A04(i3);
                    break;
                case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                    break;
                default:
                    switch (i3) {
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            break;
                        case 71:
                        case AnonymousClass2EA.A02:
                        case 73:
                        case 74:
                        case 75:
                            A002.A05(i2);
                            break;
                        default:
                            throw AnonymousClass3K3.A0f();
                    }
                    A002.A09(i3, (i2 & 16776960) >> 8);
                    break;
            }
        }
        A002.A06(i2 >>> 16);
        if (r7 == null) {
            A002.A04(0);
        } else {
            byte[] bArr = r7.A01;
            int i4 = r7.A00;
            A002.A0C(bArr, i4, (bArr[i4] << 1) + 1);
        }
        AnonymousClass4XW.A01(str, A002, r6);
        A002.A06(0);
        return new C90694ee(r5, A002, r6, true);
    }

    public static void A03(C90694ee r1, C90694ee r2, C90694ee r3, C90694ee r4, C89454cD r5, AnonymousClass4XW r6) {
        if (r1 != null) {
            r1.A0A(r5, r6.A02("RuntimeVisibleAnnotations"));
        }
        if (r2 != null) {
            r2.A0A(r5, r6.A02("RuntimeInvisibleAnnotations"));
        }
        if (r3 != null) {
            r3.A0A(r5, r6.A02("RuntimeVisibleTypeAnnotations"));
        }
        if (r4 != null) {
            r4.A0A(r5, r6.A02("RuntimeInvisibleTypeAnnotations"));
        }
    }

    public static void A04(C89454cD r1, AnonymousClass4XW r2, int i2, int i3) {
        r1.A09(i3, r2.A07(3, i2).A03);
    }

    public static void A05(C89454cD r6, C90694ee[] r7, int i2, int i3) {
        int i4 = (i3 << 1) + 1;
        for (int i5 = 0; i5 < i3; i5++) {
            C90694ee r0 = r7[i5];
            i4 += r0 == null ? 0 : r0.A06((String) null) - 8;
        }
        r6.A06(i2);
        r6.A05(i4);
        r6.A04(i3);
        for (int i6 = 0; i6 < i3; i6++) {
            C90694ee r2 = null;
            int i7 = 0;
            for (C90694ee r3 = r7[i6]; r3 != null; r3 = r3.A03) {
                r3.A08();
                i7++;
                r2 = r3;
            }
            r6.A06(i7);
            while (r2 != null) {
                C89454cD.A02(r2.A04, r6);
                r2 = r2.A01;
            }
        }
    }

    public int A06(String str) {
        if (str != null) {
            this.A05.A02(str);
        }
        int i2 = 8;
        for (C90694ee r1 = this; r1 != null; r1 = r1.A03) {
            i2 += r1.A04.A00;
        }
        return i2;
    }

    public C90694ee A07(String str) {
        this.A00++;
        if (this.A06) {
            AnonymousClass4XW.A01(str, this.A04, this.A05);
        }
        C89454cD r4 = this.A04;
        r4.A09(91, 0);
        return new C90694ee((C90694ee) null, r4, this.A05, false);
    }

    public void A08() {
        int i2 = this.A02;
        if (i2 != -1) {
            byte[] bArr = this.A04.A01;
            int i3 = this.A00;
            bArr[AnonymousClass3K4.A0C(bArr, i3 >>> 8, i2)] = (byte) i3;
        }
    }

    public void A09(String str, Object obj) {
        int i2;
        C89454cD r3;
        AnonymousClass4XW r0;
        String A062;
        int i3;
        this.A00++;
        if (this.A06) {
            AnonymousClass4XW.A01(str, this.A04, this.A05);
        }
        if (obj instanceof String) {
            r3 = this.A04;
            i2 = 115;
            r0 = this.A05;
            A062 = (String) obj;
        } else {
            i2 = 66;
            if (obj instanceof Byte) {
                r3 = this.A04;
                i3 = this.A05.A07(3, ((Number) obj).byteValue()).A03;
                r3.A09(i2, i3);
            } else if (obj instanceof Boolean) {
                A04(this.A04, this.A05, AnonymousClass000.A1X(obj) ? 1 : 0, 90);
                return;
            } else if (obj instanceof Character) {
                A04(this.A04, this.A05, ((Character) obj).charValue(), 67);
                return;
            } else if (obj instanceof Short) {
                A04(this.A04, this.A05, ((Number) obj).shortValue(), 83);
                return;
            } else if (obj instanceof C90854ew) {
                r3 = this.A04;
                i2 = 99;
                r0 = this.A05;
                A062 = ((C90854ew) obj).A06();
            } else {
                int i4 = 0;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    C89454cD r32 = this.A04;
                    int length = bArr.length;
                    r32.A09(91, length);
                    while (i4 < length) {
                        A04(r32, this.A05, bArr[i4], 66);
                        i4++;
                    }
                    return;
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    C89454cD r33 = this.A04;
                    int length2 = zArr.length;
                    r33.A09(91, length2);
                    while (i4 < length2) {
                        A04(r33, this.A05, zArr[i4] ? 1 : 0, 90);
                        i4++;
                    }
                    return;
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    C89454cD r34 = this.A04;
                    int length3 = sArr.length;
                    r34.A09(91, length3);
                    while (i4 < length3) {
                        A04(r34, this.A05, sArr[i4], 83);
                        i4++;
                    }
                    return;
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    C89454cD r35 = this.A04;
                    int length4 = cArr.length;
                    r35.A09(91, length4);
                    while (i4 < length4) {
                        A04(r35, this.A05, cArr[i4], 67);
                        i4++;
                    }
                    return;
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    C89454cD r4 = this.A04;
                    int length5 = iArr.length;
                    r4.A09(91, length5);
                    while (i4 < length5) {
                        A04(r4, this.A05, iArr[i4], 73);
                        i4++;
                    }
                    return;
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    C89454cD r6 = this.A04;
                    int length6 = jArr.length;
                    r6.A09(91, length6);
                    while (i4 < length6) {
                        r6.A09(74, this.A05.A08(5, jArr[i4]).A03);
                        i4++;
                    }
                    return;
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    C89454cD r5 = this.A04;
                    int length7 = fArr.length;
                    r5.A09(91, length7);
                    while (i4 < length7) {
                        r5.A09(70, this.A05.A07(4, Float.floatToRawIntBits(fArr[i4])).A03);
                        i4++;
                    }
                    return;
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    C89454cD r62 = this.A04;
                    int length8 = dArr.length;
                    r62.A09(91, length8);
                    while (i4 < length8) {
                        r62.A09(68, this.A05.A08(6, Double.doubleToRawLongBits(dArr[i4])).A03);
                        i4++;
                    }
                    return;
                } else {
                    C90634eU A09 = this.A05.A09(obj);
                    this.A04.A09(".s.IFJDCS".charAt(A09.A04), A09.A03);
                    return;
                }
            }
        }
        i3 = r0.A02(A062);
        r3.A09(i2, i3);
    }

    public void A0A(C89454cD r6, int i2) {
        int i3 = 2;
        C90694ee r3 = null;
        int i4 = 0;
        for (C90694ee r1 = this; r1 != null; r1 = r1.A03) {
            r1.A08();
            i3 += r1.A04.A00;
            i4++;
            r3 = r1;
        }
        r6.A06(i2);
        r6.A05(i3);
        r6.A06(i4);
        while (r3 != null) {
            C89454cD.A02(r3.A04, r6);
            r3 = r3.A01;
        }
    }
}
