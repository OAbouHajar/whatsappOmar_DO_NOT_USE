package X;

import com.facebook.redex.IDxComparatorShape182S0100000_I1;
import java.util.Arrays;

/* renamed from: X.0Dj  reason: invalid class name */
public class AnonymousClass0Dj extends C07210an {
    public int A00 = 0;
    public AnonymousClass0OZ A01;
    public C09170f3 A02 = new C09170f3(this, this);
    public AnonymousClass0SA[] A03 = new AnonymousClass0SA[128];
    public AnonymousClass0SA[] A04 = new AnonymousClass0SA[128];

    public AnonymousClass0Dj(AnonymousClass0OZ r3) {
        super(r3);
        this.A01 = r3;
    }

    public void A02(C07210an r18, boolean z2) {
        C07210an r7 = r18;
        AnonymousClass0SA r6 = r7.A02;
        if (r6 != null) {
            C13390lx r5 = r7.A01;
            int ABU = r5.ABU();
            int i2 = 0;
            while (true) {
                if (i2 < ABU) {
                    AnonymousClass0SA AGr = r5.AGr(i2);
                    float AGs = r5.AGs(i2);
                    C09170f3 r11 = this.A02;
                    r11.A01 = AGr;
                    boolean z3 = true;
                    int i3 = 0;
                    if (AGr.A07) {
                        int i4 = 0;
                        do {
                            float[] fArr = AGr.A09;
                            float f2 = fArr[i4] + (r6.A09[i4] * AGs);
                            fArr[i4] = f2;
                            if (Math.abs(f2) < 1.0E-4f) {
                                fArr[i4] = 0.0f;
                            } else {
                                z3 = false;
                            }
                            i4++;
                        } while (i4 < 9);
                        if (z3) {
                            r11.A02.A07(AGr);
                        }
                    } else {
                        do {
                            float f3 = r6.A09[i3];
                            if (f3 != 0.0f) {
                                float f4 = f3 * AGs;
                                if (Math.abs(f4) < 1.0E-4f) {
                                    f4 = 0.0f;
                                }
                                AGr.A09[i3] = f4;
                            } else {
                                AGr.A09[i3] = 0.0f;
                            }
                            i3++;
                        } while (i3 < 9);
                        A06(AGr);
                    }
                    this.A00 += r7.A00 * AGs;
                    i2++;
                } else {
                    A07(r6);
                    return;
                }
            }
        }
    }

    public final void A06(AnonymousClass0SA r8) {
        AnonymousClass0SA[] r1;
        int i2 = this.A00 + 1;
        AnonymousClass0SA[] r12 = this.A03;
        int length = r12.length;
        if (i2 > length) {
            AnonymousClass0SA[] r13 = (AnonymousClass0SA[]) Arrays.copyOf(r12, length << 1);
            this.A03 = r13;
            this.A04 = (AnonymousClass0SA[]) Arrays.copyOf(r13, r13.length << 1);
        }
        AnonymousClass0SA[] r6 = this.A03;
        int i3 = this.A00;
        r6[i3] = r8;
        int i4 = i3 + 1;
        this.A00 = i4;
        if (i4 > 1 && r6[i4 - 1].A02 > r8.A02) {
            int i5 = 0;
            do {
                r1 = this.A04;
                r1[i5] = r6[i5];
                i5++;
            } while (i5 < i4);
            Arrays.sort(r1, 0, i4, new IDxComparatorShape182S0100000_I1(this, 0));
            for (int i6 = 0; i6 < this.A00; i6++) {
                this.A03[i6] = this.A04[i6];
            }
        }
        r8.A07 = true;
        r8.A02(this);
    }

    public final void A07(AnonymousClass0SA r7) {
        int i2 = 0;
        while (true) {
            int i3 = this.A00;
            if (i2 < i3) {
                AnonymousClass0SA[] r2 = this.A03;
                if (r2[i2] != r7) {
                    i2++;
                } else {
                    while (true) {
                        int i4 = i3 - 1;
                        if (i2 < i4) {
                            int i5 = i2 + 1;
                            r2[i2] = r2[i5];
                            i2 = i5;
                        } else {
                            this.A00 = i4;
                            r7.A07 = false;
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public AnonymousClass0SA AF1(AnonymousClass0VD r10, boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.A00; i3++) {
            AnonymousClass0SA[] r1 = this.A03;
            AnonymousClass0SA r8 = r1[i3];
            if (!zArr[r8.A02]) {
                this.A02.A01 = r8;
                if (i2 == -1) {
                    int i4 = 8;
                    while (true) {
                        float f2 = r8.A09[i4];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                break;
                            }
                            i4--;
                            if (i4 < 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    AnonymousClass0SA r4 = r1[i2];
                    int i5 = 8;
                    while (true) {
                        float f3 = r4.A09[i5];
                        float f4 = r8.A09[i5];
                        if (f4 == f3) {
                            i5--;
                            if (i5 < 0) {
                                break;
                            }
                        } else if (f4 >= f3) {
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.A03[i2];
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("");
        A0r.append(" goal -> (");
        A0r.append(this.A00);
        String A0h = AnonymousClass000.A0h(") : ", A0r);
        for (int i2 = 0; i2 < this.A00; i2++) {
            AnonymousClass0SA r1 = this.A03[i2];
            C09170f3 r0 = this.A02;
            r0.A01 = r1;
            StringBuilder A0q = AnonymousClass000.A0q(A0h);
            A0q.append(r0);
            A0h = AnonymousClass000.A0h(" ", A0q);
        }
        return A0h;
    }
}
