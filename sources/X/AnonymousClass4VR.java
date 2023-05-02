package X;

/* renamed from: X.4VR  reason: invalid class name */
public class AnonymousClass4VR {
    public final C1043054u A00;

    public AnonymousClass4VR(C1043054u r1) {
        this.A00 = r1;
    }

    public final float A00(int i2, int i3, int i4, int i5) {
        double d2;
        int i6 = i3;
        int i7 = i5;
        int i8 = i4;
        int i9 = i2;
        boolean z2 = true;
        int i10 = i6;
        int i11 = i7;
        if (AnonymousClass000.A09(i7, i6) <= AnonymousClass000.A09(i8, i9)) {
            z2 = false;
            i10 = i9;
            i9 = i6;
            i11 = i8;
            i8 = i7;
        }
        int A09 = AnonymousClass000.A09(i11, i10);
        int i12 = i8 - i9;
        int abs = Math.abs(i12);
        int i13 = (-A09) / 2;
        int i14 = -1;
        int i15 = -1;
        if (i10 < i11) {
            i15 = 1;
        }
        if (i9 < i8) {
            i14 = 1;
        }
        int i16 = i11 + i15;
        int i17 = i10;
        int i18 = i9;
        int i19 = 0;
        while (true) {
            if (i17 == i16) {
                break;
            }
            int i20 = i17;
            int i21 = i18;
            if (z2) {
                i20 = i18;
                i21 = i17;
            }
            if (AnonymousClass000.A1R(i19, 1) == this.A00.A03(i20, i21)) {
                if (i19 == 2) {
                    int i22 = i17 - i10;
                    int i23 = i18 - i9;
                    d2 = (double) ((i22 * i22) + (i23 * i23));
                    break;
                }
                i19++;
            }
            i13 += abs;
            if (i13 > 0) {
                if (i18 == i8) {
                    break;
                }
                i18 += i14;
                i13 -= A09;
            }
            i17 += i15;
        }
        if (i19 != 2) {
            return Float.NaN;
        }
        int i24 = i16 - i10;
        d2 = (double) ((i24 * i24) + (i12 * i12));
        return (float) Math.sqrt(d2);
    }

    public final float A01(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float A002 = A00(i2, i3, i4, i5);
        int i6 = i2 - (i4 - i2);
        int i7 = 0;
        if (i6 < 0) {
            f2 = ((float) i2) / ((float) (i2 - i6));
            i6 = 0;
        } else {
            int i8 = this.A00.A02;
            f2 = 1.0f;
            if (i6 >= i8) {
                int i9 = i8 - 1;
                f2 = ((float) (i9 - i2)) / ((float) (i6 - i2));
                i6 = i9;
            }
        }
        float f5 = (float) i3;
        int i10 = (int) (f5 - (((float) (i5 - i3)) * f2));
        if (i10 < 0) {
            f4 = (float) (i3 - i10);
        } else {
            int i11 = this.A00.A00;
            i7 = i10;
            f3 = 1.0f;
            if (i10 >= i11) {
                i7 = i11 - 1;
                f5 = (float) (i7 - i3);
                f4 = (float) (i10 - i3);
            }
            return (A002 + A00(i2, i3, (int) (((float) i2) + (((float) (i6 - i2)) * f3)), i7)) - 1.0f;
        }
        f3 = f5 / f4;
        return (A002 + A00(i2, i3, (int) (((float) i2) + (((float) (i6 - i2)) * f3)), i7)) - 1.0f;
    }

    public final float A02(C89134be r6, C89134be r7) {
        int i2 = (int) r6.A00;
        int i3 = (int) r6.A01;
        int i4 = (int) r7.A00;
        int i5 = (int) r7.A01;
        float A01 = A01(i2, i3, i4, i5);
        float A012 = A01(i4, i5, i2, i3);
        return Float.isNaN(A01) ? A012 / 7.0f : Float.isNaN(A012) ? A01 / 7.0f : (A01 + A012) / 14.0f;
    }
}
