package com.google.android.exoplayer2;

import X.AnonymousClass000;
import X.AnonymousClass3C1;
import X.AnonymousClass3K2;
import X.AnonymousClass3K4;
import X.AnonymousClass3UD;
import X.AnonymousClass3UE;
import X.AnonymousClass3UN;
import X.AnonymousClass3UO;
import X.AnonymousClass3UP;
import X.AnonymousClass3UQ;
import X.AnonymousClass3UR;
import X.AnonymousClass3VR;
import X.AnonymousClass4XE;
import X.C13680ns;
import X.C89224bn;
import X.C89324by;
import X.C90524eJ;
import android.util.Pair;
import java.util.Arrays;

public abstract class Timeline {
    public static final Timeline A00 = new AnonymousClass3UN();

    public int A00() {
        if ((this instanceof AnonymousClass3UR) || (this instanceof AnonymousClass3UO)) {
            return 1;
        }
        if (this instanceof AnonymousClass3UP) {
            return ((AnonymousClass3UP) this).A00.A00();
        }
        if (this instanceof AnonymousClass3UN) {
            return 0;
        }
        if (!(this instanceof AnonymousClass3UD)) {
            return ((AnonymousClass3UE) this).A00;
        }
        AnonymousClass3UD r0 = (AnonymousClass3UD) this;
        return r0.A00 * r0.A02;
    }

    public int A01() {
        if ((this instanceof AnonymousClass3UR) || (this instanceof AnonymousClass3UO)) {
            return 1;
        }
        if (this instanceof AnonymousClass3UP) {
            return ((AnonymousClass3UP) this).A00.A01();
        }
        if (this instanceof AnonymousClass3UN) {
            return 0;
        }
        if (!(this instanceof AnonymousClass3UD)) {
            return ((AnonymousClass3UE) this).A01;
        }
        AnonymousClass3UD r0 = (AnonymousClass3UD) this;
        return r0.A01 * r0.A02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0099 A[EDGE_INSN: B:63:0x0099->B:41:0x0099 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass3UP
            if (r0 == 0) goto L_0x0019
            r3 = r7
            X.3UP r3 = (X.AnonymousClass3UP) r3
            boolean r2 = r3 instanceof X.AnonymousClass3VP
            com.google.android.exoplayer2.Timeline r0 = r3.A00
            int r1 = r0.A02(r8, r9, r10)
            if (r2 == 0) goto L_0x0018
            r0 = -1
            if (r1 != r0) goto L_0x0018
            int r1 = r3.A05(r10)
        L_0x0018:
            return r1
        L_0x0019:
            boolean r0 = r7 instanceof X.AnonymousClass3UQ
            if (r0 == 0) goto L_0x00a2
            r4 = r7
            X.3UQ r4 = (X.AnonymousClass3UQ) r4
            r5 = 0
            r3 = 2
            boolean r0 = r4 instanceof X.AnonymousClass3UD
            if (r0 == 0) goto L_0x0073
            r0 = r4
            X.3UD r0 = (X.AnonymousClass3UD) r0
            int r0 = r0.A01
            int r6 = r8 / r0
        L_0x002d:
            int r2 = r4.A0E(r6)
            com.google.android.exoplayer2.Timeline r0 = r4.A0F(r6)
            int r8 = r8 - r2
            if (r9 == r3) goto L_0x0039
            r5 = r9
        L_0x0039:
            int r0 = r0.A02(r8, r5, r10)
            r5 = -1
            if (r0 != r5) goto L_0x0097
            if (r10 == 0) goto L_0x006a
            X.5TE r0 = r4.A01
            int r2 = r0.ADv(r6)
        L_0x0048:
            if (r2 == r5) goto L_0x0099
            com.google.android.exoplayer2.Timeline r1 = r4.A0F(r2)
            int r0 = r1.A01()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x008d
            if (r10 == 0) goto L_0x0061
            X.5TE r0 = r4.A01
            int r2 = r0.ADv(r2)
            goto L_0x0048
        L_0x0061:
            int r0 = r4.A00
            int r0 = r0 + -1
            if (r2 >= r0) goto L_0x0099
            int r2 = r2 + 1
            goto L_0x0048
        L_0x006a:
            int r0 = r4.A00
            int r0 = r0 + -1
            if (r6 >= r0) goto L_0x0099
            int r2 = r6 + 1
            goto L_0x0048
        L_0x0073:
            r0 = r4
            X.3UE r0 = (X.AnonymousClass3UE) r0
            int[] r2 = r0.A04
            int r1 = r8 + 1
            int r6 = java.util.Arrays.binarySearch(r2, r1)
            if (r6 >= 0) goto L_0x0084
            int r0 = r6 + 2
            int r6 = -r0
            goto L_0x002d
        L_0x0084:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x002d
            r0 = r2[r6]
            if (r0 != r1) goto L_0x002d
            goto L_0x0084
        L_0x008d:
            if (r2 == r5) goto L_0x0099
            int r2 = r4.A0E(r2)
            int r0 = r1.A05(r10)
        L_0x0097:
            int r2 = r2 + r0
            return r2
        L_0x0099:
            if (r9 != r3) goto L_0x00a0
            int r2 = r4.A05(r10)
            return r2
        L_0x00a0:
            r2 = -1
            return r2
        L_0x00a2:
            r0 = 1
            if (r9 == 0) goto L_0x00ba
            if (r9 == r0) goto L_0x00b4
            r0 = 2
            if (r9 != r0) goto L_0x00b5
            int r0 = r7.A06(r10)
            if (r8 != r0) goto L_0x00c2
            int r8 = r7.A05(r10)
        L_0x00b4:
            return r8
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass3K4.A0V()
            throw r0
        L_0x00ba:
            int r0 = r7.A06(r10)
            if (r8 != r0) goto L_0x00c2
            r8 = -1
            return r8
        L_0x00c2:
            int r8 = r8 + 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Timeline.A02(int, int, boolean):int");
    }

    public final int A03(AnonymousClass4XE r5, C89324by r6, int i2, int i3, boolean z2) {
        int i4 = A08(r5, i2, false).A00;
        if (A0A(r6, i4, 0).A01 != i2) {
            return i2 + 1;
        }
        int A02 = A02(i4, i3, z2);
        if (A02 == -1) {
            return -1;
        }
        return A0A(r6, A02, 0).A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass3UR
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = X.AnonymousClass3UR.A06
            boolean r1 = r0.equals(r6)
            r0 = -1
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            return r0
        L_0x000f:
            boolean r0 = r5 instanceof X.AnonymousClass3UO
            if (r0 == 0) goto L_0x0019
            java.lang.Object r1 = X.AnonymousClass3VR.A02
            r0 = -1
            if (r6 != r1) goto L_0x000e
            goto L_0x000d
        L_0x0019:
            boolean r0 = r5 instanceof X.AnonymousClass3UP
            if (r0 == 0) goto L_0x003a
            r2 = r5
            X.3UP r2 = (X.AnonymousClass3UP) r2
            boolean r0 = r2 instanceof X.AnonymousClass3VR
            if (r0 == 0) goto L_0x007e
            X.3VR r2 = (X.AnonymousClass3VR) r2
            com.google.android.exoplayer2.Timeline r1 = r2.A00
            java.lang.Object r0 = X.AnonymousClass3VR.A02
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r2.A00
            if (r0 == 0) goto L_0x0035
            r6 = r0
        L_0x0035:
            int r0 = r1.A04(r6)
            return r0
        L_0x003a:
            boolean r0 = r5 instanceof X.AnonymousClass3UN
            if (r0 == 0) goto L_0x0040
            r0 = -1
            return r0
        L_0x0040:
            r4 = r5
            X.3UQ r4 = (X.AnonymousClass3UQ) r4
            boolean r1 = r6 instanceof android.util.Pair
            r0 = -1
            if (r1 == 0) goto L_0x000e
            android.util.Pair r6 = (android.util.Pair) r6
            java.lang.Object r2 = r6.first
            java.lang.Object r3 = r6.second
            boolean r1 = r4 instanceof X.AnonymousClass3UD
            if (r1 == 0) goto L_0x006c
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x000e
            int r2 = X.AnonymousClass000.A0D(r2)
        L_0x005a:
            if (r2 == r0) goto L_0x000e
            com.google.android.exoplayer2.Timeline r1 = r4.A0F(r2)
            int r1 = r1.A04(r3)
            if (r1 == r0) goto L_0x000e
            int r0 = r4.A0D(r2)
            int r0 = r0 + r1
            return r0
        L_0x006c:
            r1 = r4
            X.3UE r1 = (X.AnonymousClass3UE) r1
            java.util.HashMap r1 = r1.A02
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x000e
            int r2 = r1.intValue()
            goto L_0x005a
        L_0x007e:
            com.google.android.exoplayer2.Timeline r0 = r2.A00
            int r0 = r0.A04(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Timeline.A04(java.lang.Object):int");
    }

    public int A05(boolean z2) {
        int i2;
        if (this instanceof AnonymousClass3UP) {
            return ((AnonymousClass3UP) this).A00.A05(z2);
        }
        if (!(this instanceof AnonymousClass3UQ)) {
            return AnonymousClass000.A1P(A01()) ? -1 : 0;
        }
        AnonymousClass3UQ r5 = (AnonymousClass3UQ) this;
        int i3 = r5.A00;
        if (i3 == 0) {
            return -1;
        }
        int i4 = 0;
        if (z2) {
            i4 = r5.A01.ACJ();
        }
        do {
            Timeline A0F = r5.A0F(i2);
            if (!AnonymousClass000.A1P(A0F.A01())) {
                return r5.A0E(i2) + A0F.A05(z2);
            }
            if (z2) {
                i2 = r5.A01.ADv(i2);
                continue;
            } else if (i2 >= i3 - 1) {
                return -1;
            } else {
                i2++;
                continue;
            }
        } while (i2 != -1);
        return -1;
    }

    public int A06(boolean z2) {
        int i2;
        if (this instanceof AnonymousClass3UP) {
            return ((AnonymousClass3UP) this).A00.A06(z2);
        }
        if (this instanceof AnonymousClass3UQ) {
            AnonymousClass3UQ r4 = (AnonymousClass3UQ) this;
            int i3 = r4.A00;
            if (i3 != 0) {
                int AD2 = z2 ? r4.A01.AD2() : i3 - 1;
                do {
                    Timeline A0F = r4.A0F(AD2);
                    if (AnonymousClass000.A1P(A0F.A01())) {
                        if (!z2) {
                            if (AD2 <= 0) {
                                break;
                            }
                            i2 = AD2 - 1;
                            continue;
                        } else {
                            i2 = r4.A01.AFC(AD2);
                            continue;
                        }
                    } else {
                        return r4.A0E(AD2) + A0F.A06(z2);
                    }
                } while (AD2 != -1);
            }
            return -1;
        } else if (AnonymousClass000.A1P(A01())) {
            return -1;
        } else {
            return A01() - 1;
        }
    }

    public final Pair A07(AnonymousClass4XE r10, C89324by r11, int i2, long j2, long j3) {
        C90524eJ.A00(i2, A01());
        A0A(r11, i2, j3);
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        int i3 = r11.A00;
        long j4 = 0 + j2;
        while (true) {
            long j5 = A08(r10, i3, true).A01;
            if (j5 != -9223372036854775807L && j4 >= j5 && i3 < r11.A01) {
                j4 -= j5;
                i3++;
            }
        }
        return Pair.create(r10.A05, Long.valueOf(j4));
    }

    public AnonymousClass4XE A08(AnonymousClass4XE r11, int i2, boolean z2) {
        int binarySearch;
        Object create;
        Integer num;
        if (this instanceof AnonymousClass3UR) {
            AnonymousClass3UR r1 = (AnonymousClass3UR) this;
            C90524eJ.A00(i2, 1);
            Object obj = z2 ? AnonymousClass3UR.A06 : null;
            long j2 = r1.A00;
            C89224bn r0 = C89224bn.A03;
            r11.A04 = null;
            r11.A05 = obj;
            r11.A00 = 0;
            r11.A01 = j2;
            r11.A02 = -0;
            r11.A03 = r0;
        } else if (this instanceof AnonymousClass3UO) {
            Object obj2 = null;
            if (z2) {
                num = C13680ns.A0X();
                obj2 = AnonymousClass3VR.A02;
            } else {
                num = null;
            }
            C89224bn r12 = C89224bn.A03;
            r11.A04 = num;
            r11.A05 = obj2;
            r11.A00 = 0;
            r11.A01 = -9223372036854775807L;
            r11.A02 = 0;
            r11.A03 = r12;
            return r11;
        } else {
            if (this instanceof AnonymousClass3UP) {
                AnonymousClass3UP r2 = (AnonymousClass3UP) this;
                if (!(r2 instanceof AnonymousClass3VR)) {
                    return r2.A00.A08(r11, i2, z2);
                }
                AnonymousClass3VR r22 = (AnonymousClass3VR) r2;
                r22.A00.A08(r11, i2, z2);
                if (AnonymousClass3C1.A0F(r11.A05, r22.A00) && z2) {
                    create = AnonymousClass3VR.A02;
                }
            } else if (this instanceof AnonymousClass3UN) {
                throw new IndexOutOfBoundsException();
            } else {
                AnonymousClass3UQ r5 = (AnonymousClass3UQ) this;
                boolean z3 = r5 instanceof AnonymousClass3UD;
                if (z3) {
                    binarySearch = i2 / ((AnonymousClass3UD) r5).A00;
                } else {
                    int[] iArr = ((AnonymousClass3UE) r5).A03;
                    int i3 = i2 + 1;
                    binarySearch = Arrays.binarySearch(iArr, i3);
                    if (binarySearch < 0) {
                        binarySearch = -(binarySearch + 2);
                    } else {
                        do {
                            binarySearch--;
                            if (binarySearch < 0) {
                                break;
                            }
                        } while (iArr[binarySearch] != i3);
                    }
                }
                int A0E = r5.A0E(binarySearch);
                r5.A0F(binarySearch).A08(r11, i2 - r5.A0D(binarySearch), z2);
                r11.A00 += A0E;
                if (z2) {
                    create = Pair.create(z3 ? Integer.valueOf(binarySearch) : ((AnonymousClass3UE) r5).A06[binarySearch], r11.A05);
                }
            }
            r11.A05 = create;
            return r11;
        }
        return r11;
    }

    public AnonymousClass4XE A09(AnonymousClass4XE r5, Object obj) {
        int i2;
        if (!(this instanceof AnonymousClass3UQ)) {
            return A08(r5, A04(obj), true);
        }
        AnonymousClass3UQ r3 = (AnonymousClass3UQ) this;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        if (r3 instanceof AnonymousClass3UD) {
            if (obj2 instanceof Integer) {
                i2 = AnonymousClass000.A0D(obj2);
            }
            i2 = -1;
        } else {
            Number number = (Number) ((AnonymousClass3UE) r3).A02.get(obj2);
            if (number != null) {
                i2 = number.intValue();
            }
            i2 = -1;
        }
        int A0E = r3.A0E(i2);
        r3.A0F(i2).A09(r5, obj3);
        r5.A00 += A0E;
        r5.A05 = obj;
        return r5;
    }

    public abstract C89324by A0A(C89324by r1, int i2, long j2);

    public Object A0B(int i2) {
        int binarySearch;
        if (this instanceof AnonymousClass3UR) {
            C90524eJ.A00(i2, 1);
            return AnonymousClass3UR.A06;
        } else if (this instanceof AnonymousClass3UO) {
            return AnonymousClass3VR.A02;
        } else {
            if (this instanceof AnonymousClass3UP) {
                AnonymousClass3UP r2 = (AnonymousClass3UP) this;
                if (!(r2 instanceof AnonymousClass3VR)) {
                    return r2.A00.A0B(i2);
                }
                AnonymousClass3VR r22 = (AnonymousClass3VR) r2;
                Object A0B = r22.A00.A0B(i2);
                return AnonymousClass3C1.A0F(A0B, r22.A00) ? AnonymousClass3VR.A02 : A0B;
            } else if (this instanceof AnonymousClass3UN) {
                throw new IndexOutOfBoundsException();
            } else {
                AnonymousClass3UQ r5 = (AnonymousClass3UQ) this;
                boolean z2 = r5 instanceof AnonymousClass3UD;
                if (z2) {
                    binarySearch = i2 / ((AnonymousClass3UD) r5).A00;
                } else {
                    int[] iArr = ((AnonymousClass3UE) r5).A03;
                    int i3 = i2 + 1;
                    binarySearch = Arrays.binarySearch(iArr, i3);
                    if (binarySearch < 0) {
                        binarySearch = -(binarySearch + 2);
                    } else {
                        do {
                            binarySearch--;
                            if (binarySearch < 0) {
                                break;
                            }
                        } while (iArr[binarySearch] != i3);
                    }
                }
                return Pair.create(z2 ? Integer.valueOf(binarySearch) : ((AnonymousClass3UE) r5).A06[binarySearch], r5.A0F(binarySearch).A0B(i2 - r5.A0D(binarySearch)));
            }
        }
    }

    public final boolean A0C() {
        return AnonymousClass000.A1P(A01());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r14 = (com.google.android.exoplayer2.Timeline) r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r14) {
        /*
            r13 = this;
            r8 = 1
            if (r13 == r14) goto L_0x005d
            boolean r0 = r14 instanceof com.google.android.exoplayer2.Timeline
            r12 = 0
            if (r0 == 0) goto L_0x005c
            com.google.android.exoplayer2.Timeline r14 = (com.google.android.exoplayer2.Timeline) r14
            int r0 = r14.A01()
            int r11 = r13.A01()
            if (r0 != r11) goto L_0x005c
            int r0 = r14.A00()
            int r7 = r13.A00()
            if (r0 != r7) goto L_0x005c
            X.4by r10 = new X.4by
            r10.<init>()
            X.4XE r6 = new X.4XE
            r6.<init>()
            X.4by r9 = new X.4by
            r9.<init>()
            X.4XE r5 = new X.4XE
            r5.<init>()
            r4 = 0
        L_0x0033:
            if (r4 >= r11) goto L_0x0048
            r2 = 0
            X.4by r1 = r13.A0A(r10, r4, r2)
            X.4by r0 = r14.A0A(r9, r4, r2)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005c
            int r4 = r4 + 1
            goto L_0x0033
        L_0x0048:
            r2 = 0
        L_0x0049:
            if (r2 >= r7) goto L_0x005d
            X.4XE r1 = r13.A08(r6, r2, r8)
            X.4XE r0 = r14.A08(r5, r2, r8)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005c
            int r2 = r2 + 1
            goto L_0x0049
        L_0x005c:
            return r12
        L_0x005d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Timeline.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i2;
        C89324by r6 = new C89324by();
        AnonymousClass4XE r5 = new AnonymousClass4XE();
        int A01 = A01();
        int i3 = 217 + A01;
        int i4 = 0;
        while (true) {
            i2 = i3 * 31;
            if (i4 >= A01) {
                break;
            }
            i3 = AnonymousClass3K2.A06(AnonymousClass3K4.A0O(r6, this, i4), i2);
            i4++;
        }
        int A002 = A00();
        int i5 = i2 + A002;
        for (int i6 = 0; i6 < A002; i6++) {
            i5 = AnonymousClass3K2.A06(A08(r5, i6, true), i5 * 31);
        }
        return i5;
    }
}
