package X;

import java.util.Arrays;

/* renamed from: X.0am  reason: invalid class name and case insensitive filesystem */
public class C07200am implements C13390lx {
    public int A00 = 16;
    public int A01 = -1;
    public int A02 = 0;
    public float[] A03 = new float[16];
    public int[] A04 = new int[16];
    public int[] A05 = new int[16];
    public int[] A06 = new int[16];
    public int[] A07 = new int[16];
    public int[] A08 = new int[16];
    public final C07210an A09;
    public final AnonymousClass0OZ A0A;

    public C07200am(C07210an r4, AnonymousClass0OZ r5) {
        this.A09 = r4;
        this.A0A = r5;
        clear();
    }

    public int A00(AnonymousClass0SA r7) {
        int[] iArr;
        if (this.A02 != 0) {
            int i2 = r7.A02;
            int i3 = this.A04[i2 % 16];
            if (i3 != -1) {
                int[] iArr2 = this.A08;
                if (iArr2[i3] == i2) {
                    return i3;
                }
                while (true) {
                    iArr = this.A06;
                    if (iArr[i3] == -1 || iArr2[iArr[i3]] == i2) {
                        int i4 = iArr[i3];
                    } else {
                        i3 = iArr[i3];
                    }
                }
                int i42 = iArr[i3];
                if (i42 == -1 || iArr2[i42] != i2) {
                    return -1;
                }
                return i42;
            }
        }
        return -1;
    }

    public final void A01(AnonymousClass0SA r3, float f2, int i2) {
        this.A08[i2] = r3.A02;
        this.A03[i2] = f2;
        this.A07[i2] = -1;
        this.A05[i2] = -1;
        r3.A02(this.A09);
        r3.A05++;
        this.A02++;
    }

    public final void A02(AnonymousClass0SA r5, int i2) {
        int[] iArr;
        int i3 = r5.A02 % 16;
        int[] iArr2 = this.A04;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.A06;
                if (iArr[i4] == -1) {
                    break;
                }
                i4 = iArr[i4];
            }
            iArr[i4] = i2;
        }
        this.A06[i2] = -1;
    }

    public void A4V(AnonymousClass0SA r7, float f2, boolean z2) {
        float f3 = -0.001f;
        if (f2 <= f3 || f2 >= 0.001f) {
            int A002 = A00(r7);
            if (A002 == -1) {
                Ab0(r7, f2);
                return;
            }
            float[] fArr = this.A03;
            float f4 = fArr[A002] + f2;
            fArr[A002] = f4;
            if (f4 > f3 && f4 < 0.001f) {
                fArr[A002] = 0.0f;
                Abq(r7, z2);
            }
        }
    }

    public boolean A6e(AnonymousClass0SA r4) {
        return A00(r4) != -1;
    }

    public void A88(float f2) {
        int i2 = this.A02;
        int i3 = this.A01;
        int i4 = 0;
        while (i4 < i2) {
            float[] fArr = this.A03;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.A05[i3];
            if (i3 != -1) {
                i4++;
            } else {
                return;
            }
        }
    }

    public float A9S(AnonymousClass0SA r3) {
        int A002 = A00(r3);
        if (A002 != -1) {
            return this.A03[A002];
        }
        return 0.0f;
    }

    public int ABU() {
        return this.A02;
    }

    public AnonymousClass0SA AGr(int i2) {
        int i3 = this.A02;
        if (i3 != 0) {
            int i4 = this.A01;
            int i5 = 0;
            while (i5 < i3) {
                if (i5 != i2 || i4 == -1) {
                    i4 = this.A05[i4];
                    if (i4 == -1) {
                        break;
                    }
                    i5++;
                } else {
                    return this.A0A.A03[this.A08[i4]];
                }
            }
        }
        return null;
    }

    public float AGs(int i2) {
        int i3 = this.A02;
        int i4 = this.A01;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.A03[i4];
            }
            i4 = this.A05[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public void AIS() {
        int i2 = this.A02;
        int i3 = this.A01;
        int i4 = 0;
        while (i4 < i2) {
            float[] fArr = this.A03;
            fArr[i3] = fArr[i3] * -1.0f;
            i3 = this.A05[i3];
            if (i3 != -1) {
                i4++;
            } else {
                return;
            }
        }
    }

    public void Ab0(AnonymousClass0SA r10, float f2) {
        int[] iArr;
        if (f2 <= (-0.001f) || f2 >= 0.001f) {
            int i2 = this.A02;
            int i3 = 0;
            if (i2 == 0) {
                A01(r10, f2, 0);
                A02(r10, 0);
                this.A01 = 0;
                return;
            }
            int A002 = A00(r10);
            if (A002 != -1) {
                this.A03[A002] = f2;
                return;
            }
            int i4 = i2 + 1;
            int i5 = this.A00;
            if (i4 >= i5) {
                i5 <<= 1;
                this.A08 = Arrays.copyOf(this.A08, i5);
                this.A03 = Arrays.copyOf(this.A03, i5);
                this.A07 = Arrays.copyOf(this.A07, i5);
                this.A05 = Arrays.copyOf(this.A05, i5);
                int[] copyOf = Arrays.copyOf(this.A06, i5);
                this.A06 = copyOf;
                for (int i6 = this.A00; i6 < i5; i6++) {
                    this.A08[i6] = -1;
                    copyOf[i6] = -1;
                }
                this.A00 = i5;
            }
            int i7 = this.A02;
            int i8 = this.A01;
            int i9 = -1;
            while (i3 < i7) {
                int[] iArr2 = this.A08;
                int i10 = iArr2[i8];
                int i11 = r10.A02;
                if (i10 != i11) {
                    if (iArr2[i8] < i11) {
                        i9 = i8;
                    }
                    i8 = this.A05[i8];
                    if (i8 == -1) {
                        break;
                    }
                    i3++;
                } else {
                    this.A03[i8] = f2;
                    return;
                }
            }
            int i12 = 0;
            while (true) {
                if (i12 < i5) {
                    if (this.A08[i12] == -1) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            A01(r10, f2, i12);
            int[] iArr3 = this.A07;
            if (i9 != -1) {
                iArr3[i12] = i9;
                iArr = this.A05;
                iArr[i12] = iArr[i9];
                iArr[i9] = i12;
            } else {
                iArr3[i12] = -1;
                int i13 = this.A02;
                iArr = this.A05;
                if (i13 > 0) {
                    iArr[i12] = this.A01;
                    this.A01 = i12;
                } else {
                    iArr[i12] = -1;
                }
            }
            int i14 = iArr[i12];
            if (i14 != -1) {
                iArr3[i14] = i12;
            }
            A02(r10, i12);
            return;
        }
        Abq(r10, true);
    }

    public float Abq(AnonymousClass0SA r10, boolean z2) {
        int[] iArr;
        int A002 = A00(r10);
        if (A002 == -1) {
            return 0.0f;
        }
        int i2 = r10.A02;
        int i3 = i2 % 16;
        int[] iArr2 = this.A04;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            int[] iArr3 = this.A08;
            if (iArr3[i4] == i2) {
                int[] iArr4 = this.A06;
                iArr2[i3] = iArr4[i4];
                iArr4[i4] = -1;
            } else {
                while (true) {
                    iArr = this.A06;
                    if (iArr[i4] == -1 || iArr3[iArr[i4]] == i2) {
                        int i5 = iArr[i4];
                    } else {
                        i4 = iArr[i4];
                    }
                }
                int i52 = iArr[i4];
                if (i52 != -1 && iArr3[i52] == i2) {
                    iArr[i4] = iArr[i52];
                    iArr[i52] = -1;
                }
            }
        }
        float f2 = this.A03[A002];
        if (this.A01 == A002) {
            this.A01 = this.A05[A002];
        }
        this.A08[A002] = -1;
        int[] iArr5 = this.A07;
        int i6 = iArr5[A002];
        if (i6 != -1) {
            int[] iArr6 = this.A05;
            iArr6[i6] = iArr6[A002];
        }
        int i7 = this.A05[A002];
        if (i7 != -1) {
            iArr5[i7] = iArr5[A002];
        }
        this.A02--;
        r10.A05--;
        if (z2) {
            r10.A03(this.A09);
        }
        return f2;
    }

    public float Ahf(C07210an r10, boolean z2) {
        AnonymousClass0SA r0 = r10.A02;
        float A9S = A9S(r0);
        Abq(r0, z2);
        C07200am r7 = (C07200am) r10.A01;
        int i2 = r7.A02;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int[] iArr = r7.A08;
            if (iArr[i4] != -1) {
                A4V(this.A0A.A03[iArr[i4]], r7.A03[i4] * A9S, z2);
                i3++;
            }
            i4++;
        }
        return A9S;
    }

    public void clear() {
        int i2 = this.A02;
        for (int i3 = 0; i3 < i2; i3++) {
            AnonymousClass0SA AGr = AGr(i3);
            if (AGr != null) {
                AGr.A03(this.A09);
            }
        }
        for (int i4 = 0; i4 < this.A00; i4++) {
            this.A08[i4] = -1;
            this.A06[i4] = -1;
        }
        int i5 = 0;
        do {
            this.A04[i5] = -1;
            i5++;
        } while (i5 < 16);
        this.A02 = 0;
        this.A01 = -1;
    }

    public String toString() {
        String A0h;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(hashCode());
        String A0h2 = AnonymousClass000.A0h(" { ", A0o);
        int i2 = this.A02;
        for (int i3 = 0; i3 < i2; i3++) {
            AnonymousClass0SA AGr = AGr(i3);
            if (AGr != null) {
                StringBuilder A0q = AnonymousClass000.A0q(A0h2);
                A0q.append(AGr);
                A0q.append(" = ");
                A0q.append(AGs(i3));
                String A0h3 = AnonymousClass000.A0h(" ", A0q);
                int A002 = A00(AGr);
                String A0h4 = AnonymousClass000.A0h("[p: ", AnonymousClass000.A0q(A0h3));
                int i4 = this.A07[A002];
                StringBuilder A0o2 = AnonymousClass000.A0o();
                if (i4 != -1) {
                    A0o2.append(A0h4);
                    A0o2.append(this.A0A.A03[this.A08[i4]]);
                } else {
                    A0o2.append(A0h4);
                    A0o2.append("none");
                }
                String A0h5 = AnonymousClass000.A0h(", n: ", AnonymousClass000.A0q(A0o2.toString()));
                int i5 = this.A05[A002];
                if (i5 != -1) {
                    A0h = AnonymousClass000.A0f(this.A0A.A03[this.A08[i5]], AnonymousClass000.A0q(A0h5));
                } else {
                    A0h = AnonymousClass000.A0h("none", AnonymousClass000.A0q(A0h5));
                }
                A0h2 = AnonymousClass000.A0h("]", AnonymousClass000.A0q(A0h));
            }
        }
        return AnonymousClass000.A0h(" }", AnonymousClass000.A0q(A0h2));
    }
}
