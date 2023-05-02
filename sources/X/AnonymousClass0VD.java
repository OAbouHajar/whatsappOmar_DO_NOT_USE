package X;

import java.util.Arrays;

/* renamed from: X.0VD  reason: invalid class name */
public class AnonymousClass0VD {
    public static int A0E = 1000;
    public static boolean A0F = true;
    public static long A0G;
    public static long A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public C12330kD A07;
    public C12330kD A08;
    public boolean A09;
    public C07210an[] A0A;
    public AnonymousClass0SA[] A0B;
    public boolean[] A0C;
    public final AnonymousClass0OZ A0D;

    public AnonymousClass0VD() {
        this.A06 = 0;
        this.A00 = 32;
        this.A01 = 32;
        this.A0A = null;
        this.A09 = false;
        this.A0C = new boolean[32];
        this.A03 = 1;
        this.A04 = 0;
        this.A02 = 32;
        this.A0B = new AnonymousClass0SA[A0E];
        this.A05 = 0;
        this.A0A = new C07210an[32];
        A09();
        AnonymousClass0OZ r1 = new AnonymousClass0OZ();
        this.A0D = r1;
        this.A07 = new AnonymousClass0Dj(r1);
        this.A08 = A0F ? new C02630Di(r1, this) : new C07210an(r1);
    }

    public static int A00(Object obj) {
        AnonymousClass0SA r0 = ((AnonymousClass0S1) obj).A02;
        if (r0 != null) {
            return (int) (r0.A00 + 0.5f);
        }
        return 0;
    }

    public static void A01(C07220ao r3, Object obj) {
        int i2 = r3.A00;
        Object[] objArr = r3.A01;
        if (i2 < objArr.length) {
            objArr[i2] = obj;
            r3.A00 = i2 + 1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.0an} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.0an} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.0an} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C07210an A02() {
        /*
            r8 = this;
            boolean r0 = A0F
            r6 = 1
            X.0OZ r5 = r8.A0D
            if (r0 == 0) goto L_0x0032
            X.0jP r3 = r5.A01
            X.0ao r3 = (X.C07220ao) r3
            int r0 = r3.A00
            r2 = 0
            if (r0 <= 0) goto L_0x0030
            int r1 = r0 + -1
            java.lang.Object[] r0 = r3.A01
            r4 = r0[r1]
            r0[r1] = r2
            r3.A00 = r1
        L_0x001b:
            X.0an r4 = (X.C07210an) r4
            if (r4 != 0) goto L_0x0056
            X.0Di r4 = new X.0Di
            r4.<init>(r5, r8)
            long r0 = A0H
            long r0 = r0 + r6
            A0H = r0
        L_0x0029:
            int r0 = X.AnonymousClass0SA.A0C
            int r0 = r0 + 1
            X.AnonymousClass0SA.A0C = r0
            return r4
        L_0x0030:
            r4 = r2
            goto L_0x001b
        L_0x0032:
            X.0jP r3 = r5.A00
            X.0ao r3 = (X.C07220ao) r3
            int r0 = r3.A00
            r2 = 0
            if (r0 <= 0) goto L_0x0054
            int r1 = r0 + -1
            java.lang.Object[] r0 = r3.A01
            r4 = r0[r1]
            r0[r1] = r2
            r3.A00 = r1
        L_0x0045:
            X.0an r4 = (X.C07210an) r4
            if (r4 != 0) goto L_0x0056
            X.0an r4 = new X.0an
            r4.<init>(r5)
            long r0 = A0G
            long r0 = r0 + r6
            A0G = r0
            goto L_0x0029
        L_0x0054:
            r4 = r2
            goto L_0x0045
        L_0x0056:
            r0 = 0
            r4.A02 = r0
            X.0lx r0 = r4.A01
            r0.clear()
            r0 = 0
            r4.A00 = r0
            r0 = 0
            r4.A04 = r0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VD.A02():X.0an");
    }

    public AnonymousClass0SA A03() {
        if (this.A03 + 1 >= this.A01) {
            A08();
        }
        AnonymousClass0SA A052 = A05(C03800Jx.SLACK);
        int i2 = this.A06 + 1;
        this.A06 = i2;
        this.A03++;
        A052.A02 = i2;
        this.A0D.A03[i2] = A052;
        return A052;
    }

    public AnonymousClass0SA A04(int i2) {
        if (this.A03 + 1 >= this.A01) {
            A08();
        }
        AnonymousClass0SA A052 = A05(C03800Jx.ERROR);
        int i3 = this.A06 + 1;
        this.A06 = i3;
        this.A03++;
        A052.A02 = i3;
        A052.A04 = i2;
        this.A0D.A03[i3] = A052;
        AnonymousClass0Dj r3 = (AnonymousClass0Dj) this.A07;
        r3.A02.A01 = A052;
        float[] fArr = A052.A09;
        Arrays.fill(fArr, 0.0f);
        fArr[A052.A04] = 1.0f;
        r3.A06(A052);
        return A052;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.0SA} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0SA A05(X.C03800Jx r6) {
        /*
            r5 = this;
            X.0OZ r0 = r5.A0D
            X.0jP r4 = r0.A02
            X.0ao r4 = (X.C07220ao) r4
            int r0 = r4.A00
            r2 = 0
            if (r0 <= 0) goto L_0x0043
            int r1 = r0 + -1
            java.lang.Object[] r0 = r4.A01
            r3 = r0[r1]
            r0[r1] = r2
            r4.A00 = r1
        L_0x0015:
            X.0SA r3 = (X.AnonymousClass0SA) r3
            if (r3 != 0) goto L_0x003f
            X.0SA r3 = new X.0SA
            r3.<init>(r6)
        L_0x001e:
            r3.A06 = r6
            int r1 = r5.A05
            int r0 = A0E
            if (r1 < r0) goto L_0x0034
            int r1 = r0 << 1
            A0E = r1
            X.0SA[] r0 = r5.A0B
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            X.0SA[] r0 = (X.AnonymousClass0SA[]) r0
            r5.A0B = r0
        L_0x0034:
            X.0SA[] r2 = r5.A0B
            int r1 = r5.A05
            int r0 = r1 + 1
            r5.A05 = r0
            r2[r1] = r3
            return r3
        L_0x003f:
            r3.A00()
            goto L_0x001e
        L_0x0043:
            r3 = r2
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VD.A05(X.0Jx):X.0SA");
    }

    public AnonymousClass0SA A06(Object obj) {
        AnonymousClass0SA r3 = null;
        if (obj != null) {
            if (this.A03 + 1 >= this.A01) {
                A08();
            }
            if (obj instanceof AnonymousClass0S1) {
                AnonymousClass0S1 r5 = (AnonymousClass0S1) obj;
                r3 = r5.A02;
                if (r3 == null) {
                    r5.A02();
                    r3 = r5.A02;
                }
                int i2 = r3.A02;
                if (i2 != -1) {
                    if (i2 > this.A06 || this.A0D.A03[i2] == null) {
                        if (i2 != -1) {
                            r3.A00();
                        }
                    }
                }
                int i3 = this.A06 + 1;
                this.A06 = i3;
                this.A03++;
                r3.A02 = i3;
                r3.A06 = C03800Jx.UNRESTRICTED;
                this.A0D.A03[i3] = r3;
            }
        }
        return r3;
    }

    public void A07() {
        AnonymousClass0OZ r5;
        AnonymousClass0SA[] r7;
        int i2 = 0;
        while (true) {
            r5 = this.A0D;
            r7 = r5.A03;
            if (i2 >= r7.length) {
                break;
            }
            AnonymousClass0SA r0 = r7[i2];
            if (r0 != null) {
                r0.A00();
            }
            i2++;
        }
        C11830jP r4 = r5.A02;
        AnonymousClass0SA[] r3 = this.A0B;
        int i3 = this.A05;
        C07220ao r42 = (C07220ao) r4;
        int length = r3.length;
        if (i3 > length) {
            i3 = length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            A01(r42, r3[i4]);
        }
        this.A05 = 0;
        Arrays.fill(r7, (Object) null);
        this.A06 = 0;
        AnonymousClass0Dj r1 = (AnonymousClass0Dj) this.A07;
        r1.A00 = 0;
        r1.A00 = 0.0f;
        this.A03 = 1;
        for (int i5 = 0; i5 < this.A04; i5++) {
        }
        A09();
        this.A04 = 0;
        this.A08 = A0F ? new C02630Di(r5, this) : new C07210an(r5);
    }

    public final void A08() {
        int i2 = this.A00 << 1;
        this.A00 = i2;
        this.A0A = (C07210an[]) Arrays.copyOf(this.A0A, i2);
        AnonymousClass0OZ r2 = this.A0D;
        r2.A03 = (AnonymousClass0SA[]) Arrays.copyOf(r2.A03, this.A00);
        int i3 = this.A00;
        this.A0C = new boolean[i3];
        this.A01 = i3;
        this.A02 = i3;
    }

    public final void A09() {
        int i2 = 0;
        if (A0F) {
            while (true) {
                C07210an[] r2 = this.A0A;
                if (i2 < r2.length) {
                    C07210an r1 = r2[i2];
                    if (r1 != null) {
                        A01((C07220ao) this.A0D.A01, r1);
                    }
                    r2[i2] = null;
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C07210an[] r22 = this.A0A;
                if (i2 < r22.length) {
                    C07210an r12 = r22[i2];
                    if (r12 != null) {
                        A01((C07220ao) this.A0D.A00, r12);
                    }
                    r22[i2] = null;
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C07210an r18) {
        /*
            r17 = this;
            r5 = r17
            int r0 = r5.A04
            r4 = 1
            int r1 = r0 + 1
            int r0 = r5.A02
            if (r1 >= r0) goto L_0x0013
            int r0 = r5.A03
            int r1 = r0 + 1
            int r0 = r5.A01
            if (r1 < r0) goto L_0x0016
        L_0x0013:
            r5.A08()
        L_0x0016:
            r6 = r18
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x019d
            X.0an[] r0 = r5.A0A
            int r0 = r0.length
            if (r0 != 0) goto L_0x0108
        L_0x0021:
            X.0SA r0 = r6.A02
            if (r0 != 0) goto L_0x0035
            float r1 = r6.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            X.0lx r0 = r6.A01
            int r0 = r0.ABU()
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            return
        L_0x0035:
            float r1 = r6.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r1 * r0
            r6.A00 = r1
            X.0lx r0 = r6.A01
            r0.AIS()
        L_0x0046:
            X.0lx r8 = r6.A01
            int r7 = r8.ABU()
            r9 = 0
            r16 = 0
            r15 = r9
            r3 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
        L_0x0055:
            if (r3 >= r7) goto L_0x009f
            float r10 = r8.AGs(r3)
            X.0SA r2 = r8.AGr(r3)
            X.0Jx r1 = r2.A06
            X.0Jx r0 = X.C03800Jx.UNRESTRICTED
            if (r1 != r0) goto L_0x0080
            if (r9 == 0) goto L_0x0077
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0077
            if (r14 != 0) goto L_0x0074
            int r0 = r2.A05
            if (r0 > r4) goto L_0x0074
            r12 = r10
            r9 = r2
            r14 = 1
        L_0x0074:
            int r3 = r3 + 1
            goto L_0x0055
        L_0x0077:
            int r0 = r2.A05
            r14 = 1
            if (r0 <= r4) goto L_0x007d
            r14 = 0
        L_0x007d:
            r12 = r10
            r9 = r2
            goto L_0x0074
        L_0x0080:
            if (r9 != 0) goto L_0x0074
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            if (r15 == 0) goto L_0x0096
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0096
            if (r13 != 0) goto L_0x0074
            int r0 = r2.A05
            if (r0 > r4) goto L_0x0074
            r11 = r10
            r15 = r2
            r13 = 1
            goto L_0x0074
        L_0x0096:
            int r0 = r2.A05
            r13 = 1
            if (r0 <= r4) goto L_0x009c
            r13 = 0
        L_0x009c:
            r11 = r10
            r15 = r2
            goto L_0x0074
        L_0x009f:
            if (r9 != 0) goto L_0x0100
            r9 = r15
            if (r15 != 0) goto L_0x0100
            r1 = 1
        L_0x00a5:
            X.0lx r0 = r6.A01
            int r0 = r0.ABU()
            if (r0 != 0) goto L_0x00af
            r6.A04 = r4
        L_0x00af:
            if (r1 == 0) goto L_0x0105
            int r0 = r5.A03
            int r1 = r0 + 1
            int r0 = r5.A01
            if (r1 < r0) goto L_0x00bc
            r5.A08()
        L_0x00bc:
            X.0Jx r0 = X.C03800Jx.SLACK
            X.0SA r7 = r5.A05(r0)
            int r0 = r5.A06
            int r1 = r0 + 1
            r5.A06 = r1
            int r0 = r5.A03
            int r0 = r0 + 1
            r5.A03 = r0
            r7.A02 = r1
            X.0OZ r0 = r5.A0D
            X.0SA[] r0 = r0.A03
            r0[r1] = r7
            r6.A02 = r7
            r5.A0B(r6)
            X.0kD r8 = r5.A08
            X.0an r8 = (X.C07210an) r8
            r0 = 0
            r8.A02 = r0
            X.0lx r0 = r8.A01
            r0.clear()
            r3 = 0
        L_0x00e8:
            X.0lx r1 = r6.A01
            int r0 = r1.ABU()
            if (r3 >= r0) goto L_0x0165
            X.0SA r2 = r1.AGr(r3)
            float r1 = r1.AGs(r3)
            X.0lx r0 = r8.A01
            r0.A4V(r2, r1, r4)
            int r3 = r3 + 1
            goto L_0x00e8
        L_0x0100:
            r6.A03(r9)
            r1 = 0
            goto L_0x00a5
        L_0x0105:
            r4 = 0
            goto L_0x018b
        L_0x0108:
            X.0lx r8 = r6.A01
            int r7 = r8.ABU()
            r3 = 0
        L_0x010f:
            if (r3 >= r7) goto L_0x0126
            X.0SA r2 = r8.AGr(r3)
            int r1 = r2.A01
            r0 = -1
            if (r1 != r0) goto L_0x011e
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0123
        L_0x011e:
            java.util.ArrayList r0 = r6.A03
            r0.add(r2)
        L_0x0123:
            int r3 = r3 + 1
            goto L_0x010f
        L_0x0126:
            java.util.ArrayList r9 = r6.A03
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x0021
            java.util.Iterator r8 = r9.iterator()
        L_0x0132:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0161
            java.lang.Object r7 = r8.next()
            X.0SA r7 = (X.AnonymousClass0SA) r7
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0157
            X.0lx r3 = r6.A01
            float r2 = r3.A9S(r7)
            float r1 = r6.A00
            float r0 = r7.A00
            float r0 = r0 * r2
            float r1 = r1 + r0
            r6.A00 = r1
            r3.Abq(r7, r4)
            r7.A03(r6)
            goto L_0x0132
        L_0x0157:
            X.0an[] r1 = r5.A0A
            int r0 = r7.A01
            r0 = r1[r0]
            r6.A02(r0, r4)
            goto L_0x0132
        L_0x0161:
            r9.clear()
            goto L_0x0108
        L_0x0165:
            X.0kD r0 = r5.A08
            r5.A0C(r0)
            int r1 = r7.A01
            r0 = -1
            if (r1 != r0) goto L_0x018b
            X.0SA r0 = r6.A02
            if (r0 != r7) goto L_0x017d
            r0 = 0
            X.0SA r0 = r6.A01(r7, r0)
            if (r0 == 0) goto L_0x017d
            r6.A03(r0)
        L_0x017d:
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x0186
            X.0SA r0 = r6.A02
            r0.A04(r6)
        L_0x0186:
            int r0 = r5.A04
            int r0 = r0 - r4
            r5.A04 = r0
        L_0x018b:
            X.0SA r0 = r6.A02
            if (r0 == 0) goto L_0x0034
            X.0Jx r1 = r0.A06
            X.0Jx r0 = X.C03800Jx.UNRESTRICTED
            if (r1 == r0) goto L_0x019b
            float r0 = r6.A00
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
        L_0x019b:
            if (r4 != 0) goto L_0x0034
        L_0x019d:
            r5.A0B(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VD.A0A(X.0an):void");
    }

    public final void A0B(C07210an r5) {
        C11830jP r0;
        boolean z2 = A0F;
        C07210an[] r3 = this.A0A;
        int i2 = this.A04;
        C07210an r1 = r3[i2];
        if (z2) {
            if (r1 != null) {
                r0 = this.A0D.A01;
            }
            r3[i2] = r5;
            AnonymousClass0SA r12 = r5.A02;
            r12.A01 = i2;
            this.A04 = i2 + 1;
            r12.A04(r5);
        }
        if (r1 != null) {
            r0 = this.A0D.A00;
        }
        r3[i2] = r5;
        AnonymousClass0SA r122 = r5.A02;
        r122.A01 = i2;
        this.A04 = i2 + 1;
        r122.A04(r5);
        A01((C07220ao) r0, r1);
        r3[i2] = r5;
        AnonymousClass0SA r1222 = r5.A02;
        r1222.A01 = i2;
        this.A04 = i2 + 1;
        r1222.A04(r5);
    }

    public final void A0C(C12330kD r10) {
        for (int i2 = 0; i2 < this.A03; i2++) {
            this.A0C[i2] = false;
        }
        int i3 = 0;
        while (true) {
            i3++;
            if (i3 < (this.A03 << 1)) {
                AnonymousClass0SA r0 = ((C07210an) r10).A02;
                if (r0 != null) {
                    this.A0C[r0.A02] = true;
                }
                boolean[] zArr = this.A0C;
                AnonymousClass0SA AF1 = r10.AF1(this, zArr);
                if (AF1 != null) {
                    int i4 = AF1.A02;
                    if (!zArr[i4]) {
                        zArr[i4] = true;
                        float f2 = Float.MAX_VALUE;
                        int i5 = -1;
                        for (int i6 = 0; i6 < this.A04; i6++) {
                            C07210an r1 = this.A0A[i6];
                            if (r1.A02.A06 != C03800Jx.UNRESTRICTED && !r1.A04 && r1.A01.A6e(AF1)) {
                                float A9S = r1.A01.A9S(AF1);
                                if (A9S < 0.0f) {
                                    float f3 = (-r1.A00) / A9S;
                                    if (f3 < f2) {
                                        i5 = i6;
                                        f2 = f3;
                                    }
                                }
                            }
                        }
                        if (i5 > -1) {
                            C07210an r12 = this.A0A[i5];
                            r12.A02.A01 = -1;
                            r12.A03(AF1);
                            AnonymousClass0SA r02 = r12.A02;
                            r02.A01 = i5;
                            r02.A04(r12);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void A0D(AnonymousClass0SA r4, int i2) {
        C07210an r2;
        C13390lx r1;
        float f2;
        int i3 = r4.A01;
        if (i3 == -1) {
            r4.A01((float) i2);
            return;
        }
        if (i3 != -1) {
            C07210an r12 = this.A0A[i3];
            if (!r12.A04) {
                if (r12.A01.ABU() == 0) {
                    r12.A04 = true;
                } else {
                    r2 = A02();
                    if (i2 < 0) {
                        r2.A00 = (float) (-i2);
                        r1 = r2.A01;
                        f2 = 1.0f;
                    } else {
                        r2.A00 = (float) i2;
                        r1 = r2.A01;
                        f2 = -1.0f;
                    }
                    r1.Ab0(r4, f2);
                }
            }
            r12.A00 = (float) i2;
            return;
        }
        r2 = A02();
        r2.A02 = r4;
        float f3 = (float) i2;
        r4.A00 = f3;
        r2.A00 = f3;
        r2.A04 = true;
        A0A(r2);
    }

    public void A0E(AnonymousClass0SA r7, AnonymousClass0SA r8, int i2, int i3) {
        if (i3 == 8 && r8.A08 && r7.A01 == -1) {
            r7.A01(r8.A00 + ((float) i2));
            return;
        }
        C07210an A022 = A02();
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 = -i2;
                z2 = true;
            }
            A022.A00 = (float) i2;
        }
        C13390lx r0 = A022.A01;
        if (!z2) {
            r0.Ab0(r7, -1.0f);
            A022.A01.Ab0(r8, 1.0f);
        } else {
            r0.Ab0(r7, 1.0f);
            A022.A01.Ab0(r8, -1.0f);
        }
        if (i3 != 8) {
            A022.A01.Ab0(A04(i3), 1.0f);
            A022.A01.Ab0(A04(i3), -1.0f);
        }
        A0A(A022);
    }

    public void A0F(AnonymousClass0SA r5, AnonymousClass0SA r6, int i2, int i3) {
        C07210an A022 = A02();
        AnonymousClass0SA A032 = A03();
        A032.A04 = 0;
        A022.A04(r5, r6, A032, i2);
        if (i3 != 8) {
            int A9S = (int) (A022.A01.A9S(A032) * -1.0f);
            A022.A01.Ab0(A04(i3), (float) A9S);
        }
        A0A(A022);
    }

    public void A0G(AnonymousClass0SA r5, AnonymousClass0SA r6, int i2, int i3) {
        C07210an A022 = A02();
        AnonymousClass0SA A032 = A03();
        A032.A04 = 0;
        A022.A05(r5, r6, A032, i2);
        if (i3 != 8) {
            int A9S = (int) (A022.A01.A9S(A032) * -1.0f);
            A022.A01.Ab0(A04(i3), (float) A9S);
        }
        A0A(A022);
    }

    public void A0H(AnonymousClass0SA r7, AnonymousClass0SA r8, AnonymousClass0SA r9, AnonymousClass0SA r10, float f2, int i2, int i3, int i4) {
        float f3;
        int i5;
        C07210an A022 = A02();
        if (r8 == r9) {
            A022.A01.Ab0(r7, 1.0f);
            A022.A01.Ab0(r10, 1.0f);
            A022.A01.Ab0(r8, -2.0f);
        } else {
            if (f2 == 0.5f) {
                C07210an.A00(A022, r7, r8, 1.0f, -1.0f);
                C07210an.A00(A022, r9, r10, -1.0f, 1.0f);
                if (i2 > 0 || i3 > 0) {
                    i5 = (-i2) + i3;
                }
            } else {
                if (f2 <= 0.0f) {
                    C07210an.A00(A022, r7, r8, -1.0f, 1.0f);
                    f3 = (float) i2;
                } else if (f2 >= 1.0f) {
                    C07210an.A00(A022, r10, r9, -1.0f, 1.0f);
                    i5 = -i3;
                } else {
                    float f4 = 1.0f - f2;
                    A022.A01.Ab0(r7, f4 * 1.0f);
                    A022.A01.Ab0(r8, f4 * -1.0f);
                    A022.A01.Ab0(r9, -1.0f * f2);
                    A022.A01.Ab0(r10, 1.0f * f2);
                    if (i2 > 0 || i3 > 0) {
                        f3 = (((float) (-i2)) * f4) + (((float) i3) * f2);
                    }
                }
                A022.A00 = f3;
            }
            f3 = (float) i5;
            A022.A00 = f3;
        }
        if (i4 != 8) {
            A022.A01.Ab0(A04(i4), 1.0f);
            A022.A01.Ab0(A04(i4), -1.0f);
        }
        A0A(A022);
    }
}
