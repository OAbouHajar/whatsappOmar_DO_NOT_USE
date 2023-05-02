package X;

import java.util.Arrays;

/* renamed from: X.0al  reason: invalid class name and case insensitive filesystem */
public class C07190al implements C13390lx {
    public int A00 = 8;
    public int A01 = 0;
    public int A02 = -1;
    public int A03 = -1;
    public boolean A04 = false;
    public float[] A05 = new float[8];
    public int[] A06 = new int[8];
    public int[] A07 = new int[8];
    public final C07210an A08;
    public final AnonymousClass0OZ A09;

    public C07190al(C07210an r4, AnonymousClass0OZ r5) {
        this.A08 = r4;
        this.A09 = r5;
    }

    public static int A00(C07190al r3, int i2, int i3) {
        if (i2 < i3) {
            return i2;
        }
        int i4 = r3.A00 << 1;
        r3.A00 = i4;
        r3.A04 = false;
        r3.A03 = i3 - 1;
        r3.A05 = Arrays.copyOf(r3.A05, i4);
        r3.A06 = Arrays.copyOf(r3.A06, r3.A00);
        r3.A07 = Arrays.copyOf(r3.A07, r3.A00);
        return i3;
    }

    public static boolean A01(C07190al r4, AnonymousClass0SA r5, float f2) {
        r4.A02 = 0;
        r4.A05[0] = f2;
        r4.A06[0] = r5.A02;
        r4.A07[0] = -1;
        r5.A05++;
        r5.A02(r4.A08);
        r4.A01++;
        return r4.A04;
    }

    public void A4V(AnonymousClass0SA r13, float f2, boolean z2) {
        int i2;
        float f3 = -0.001f;
        if (f2 <= f3 || f2 >= 0.001f) {
            int i3 = this.A02;
            int i4 = i3;
            if (i3 != -1) {
                int i5 = 0;
                int i6 = -1;
                while (i3 != -1) {
                    int i7 = this.A01;
                    if (i5 >= i7) {
                        break;
                    }
                    int[] iArr = this.A06;
                    int i8 = iArr[i3];
                    int i9 = r13.A02;
                    if (i8 == i9) {
                        float[] fArr = this.A05;
                        float f4 = fArr[i3] + f2;
                        if (f4 > f3 && f4 < 0.001f) {
                            f4 = 0.0f;
                        }
                        fArr[i3] = f4;
                        if (f4 == 0.0f) {
                            int[] iArr2 = this.A07;
                            int i10 = iArr2[i3];
                            if (i3 == i4) {
                                this.A02 = i10;
                            } else {
                                iArr2[i6] = i10;
                            }
                            if (z2) {
                                r13.A03(this.A08);
                            }
                            if (this.A04) {
                                this.A03 = i3;
                            }
                            r13.A05--;
                            this.A01 = i7 - 1;
                            return;
                        }
                        return;
                    }
                    if (iArr[i3] < i9) {
                        i6 = i3;
                    }
                    i3 = this.A07[i3];
                    i5++;
                }
                int i11 = this.A03;
                int i12 = i11 + 1;
                if (this.A04) {
                    int[] iArr3 = this.A06;
                    if (iArr3[i11] != -1) {
                        i11 = iArr3.length;
                    }
                } else {
                    i11 = i12;
                }
                int[] iArr4 = this.A06;
                int length = iArr4.length;
                if (i11 >= length && this.A01 < length) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            break;
                        } else if (iArr4[i13] == -1) {
                            i11 = i13;
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                int A002 = A00(this, i11, length);
                this.A06[A002] = r13.A02;
                this.A05[A002] = f2;
                int[] iArr5 = this.A07;
                if (i6 != -1) {
                    iArr5[A002] = iArr5[i6];
                    iArr5[i6] = A002;
                } else {
                    iArr5[A002] = this.A02;
                    this.A02 = A002;
                }
                r13.A05++;
                r13.A02(this.A08);
                this.A01++;
                if (!this.A04) {
                    this.A03++;
                }
                i2 = this.A03;
            } else if (!A01(this, r13, f2)) {
                i2 = this.A03 + 1;
                this.A03 = i2;
            } else {
                return;
            }
            int length2 = this.A06.length;
            if (i2 >= length2) {
                this.A04 = true;
                this.A03 = length2 - 1;
            }
        }
    }

    public boolean A6e(AnonymousClass0SA r7) {
        int i2 = this.A02;
        if (i2 != -1) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.A01) {
                if (this.A06[i2] == r7.A02) {
                    return true;
                }
                i2 = this.A07[i2];
                i3++;
            }
        }
        return false;
    }

    public void A88(float f2) {
        int i2 = this.A02;
        int i3 = 0;
        while (i2 != -1 && i3 < this.A01) {
            float[] fArr = this.A05;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.A07[i2];
            i3++;
        }
    }

    public final float A9S(AnonymousClass0SA r5) {
        int i2 = this.A02;
        int i3 = 0;
        while (i2 != -1 && i3 < this.A01) {
            if (this.A06[i2] == r5.A02) {
                return this.A05[i2];
            }
            i2 = this.A07[i2];
            i3++;
        }
        return 0.0f;
    }

    public int ABU() {
        return this.A01;
    }

    public AnonymousClass0SA AGr(int i2) {
        int i3 = this.A02;
        int i4 = 0;
        while (i3 != -1 && i4 < this.A01) {
            if (i4 == i2) {
                return this.A09.A03[this.A06[i3]];
            }
            i3 = this.A07[i3];
            i4++;
        }
        return null;
    }

    public float AGs(int i2) {
        int i3 = this.A02;
        int i4 = 0;
        while (i3 != -1 && i4 < this.A01) {
            if (i4 == i2) {
                return this.A05[i3];
            }
            i3 = this.A07[i3];
            i4++;
        }
        return 0.0f;
    }

    public void AIS() {
        int i2 = this.A02;
        int i3 = 0;
        while (i2 != -1 && i3 < this.A01) {
            float[] fArr = this.A05;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.A07[i2];
            i3++;
        }
    }

    public final void Ab0(AnonymousClass0SA r9, float f2) {
        int length;
        if (f2 == 0.0f) {
            Abq(r9, true);
            return;
        }
        int i2 = this.A02;
        if (i2 != -1) {
            int i3 = 0;
            int i4 = -1;
            while (i2 != -1 && i3 < this.A01) {
                int[] iArr = this.A06;
                int i5 = iArr[i2];
                int i6 = r9.A02;
                if (i5 == i6) {
                    this.A05[i2] = f2;
                    return;
                }
                if (iArr[i2] < i6) {
                    i4 = i2;
                }
                i2 = this.A07[i2];
                i3++;
            }
            int i7 = this.A03;
            int i8 = i7 + 1;
            if (this.A04) {
                int[] iArr2 = this.A06;
                if (iArr2[i7] != -1) {
                    i7 = iArr2.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr3 = this.A06;
            int length2 = iArr3.length;
            if (i7 >= length2 && this.A01 < length2) {
                int i9 = 0;
                while (true) {
                    if (i9 >= length2) {
                        break;
                    } else if (iArr3[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int A002 = A00(this, i7, length2);
            this.A06[A002] = r9.A02;
            this.A05[A002] = f2;
            int[] iArr4 = this.A07;
            if (i4 != -1) {
                iArr4[A002] = iArr4[i4];
                iArr4[i4] = A002;
            } else {
                iArr4[A002] = this.A02;
                this.A02 = A002;
            }
            r9.A05++;
            r9.A02(this.A08);
            int i10 = this.A01 + 1;
            this.A01 = i10;
            if (!this.A04) {
                this.A03++;
            }
            length = this.A06.length;
            if (i10 >= length) {
                this.A04 = true;
            }
            if (this.A03 < length) {
                return;
            }
        } else if (!A01(this, r9, f2)) {
            int i11 = this.A03 + 1;
            this.A03 = i11;
            length = this.A06.length;
            if (i11 < length) {
                return;
            }
        } else {
            return;
        }
        this.A04 = true;
        this.A03 = length - 1;
    }

    public final float Abq(AnonymousClass0SA r11, boolean z2) {
        int i2 = this.A02;
        int i3 = i2;
        if (i2 != -1) {
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1) {
                int i6 = this.A01;
                if (i4 >= i6) {
                    break;
                }
                int[] iArr = this.A06;
                if (iArr[i2] == r11.A02) {
                    int[] iArr2 = this.A07;
                    int i7 = iArr2[i2];
                    if (i2 == i3) {
                        this.A02 = i7;
                    } else {
                        iArr2[i5] = i7;
                    }
                    if (z2) {
                        r11.A03(this.A08);
                    }
                    r11.A05--;
                    this.A01 = i6 - 1;
                    iArr[i2] = -1;
                    if (this.A04) {
                        this.A03 = i2;
                    }
                    return this.A05[i2];
                }
                i4++;
                i5 = i2;
                i2 = this.A07[i2];
            }
        }
        return 0.0f;
    }

    public float Ahf(C07210an r7, boolean z2) {
        AnonymousClass0SA r0 = r7.A02;
        float A9S = A9S(r0);
        Abq(r0, z2);
        C13390lx r4 = r7.A01;
        int ABU = r4.ABU();
        for (int i2 = 0; i2 < ABU; i2++) {
            AnonymousClass0SA AGr = r4.AGr(i2);
            A4V(AGr, r4.A9S(AGr) * A9S, z2);
        }
        return A9S;
    }

    public final void clear() {
        int i2 = this.A02;
        int i3 = 0;
        while (i2 != -1 && i3 < this.A01) {
            AnonymousClass0SA r1 = this.A09.A03[this.A06[i2]];
            if (r1 != null) {
                r1.A03(this.A08);
            }
            i2 = this.A07[i2];
            i3++;
        }
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = false;
        this.A01 = 0;
    }

    public String toString() {
        int i2 = this.A02;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.A01) {
            StringBuilder A0q = AnonymousClass000.A0q(AnonymousClass000.A0h(" -> ", AnonymousClass000.A0q(str)));
            A0q.append(this.A05[i2]);
            str = AnonymousClass000.A0f(this.A09.A03[this.A06[i2]], AnonymousClass000.A0q(AnonymousClass000.A0h(" : ", A0q)));
            i2 = this.A07[i2];
            i3++;
        }
        return str;
    }
}
