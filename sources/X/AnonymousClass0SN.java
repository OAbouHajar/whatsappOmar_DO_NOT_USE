package X;

import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.0SN  reason: invalid class name */
public class AnonymousClass0SN {
    public float A00 = 0.0f;
    public float A01;
    public float A02;
    public float A03 = 1.0f;
    public float A04 = 1.0f;
    public float A05 = 1.0f;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B = -1;
    public int A0C = 0;
    public int A0D = 0;
    public int A0E = 0;
    public int A0F = 0;
    public int A0G = 0;
    public int A0H = 0;
    public int A0I;
    public int A0J;
    public int A0K = -1;
    public int A0L;
    public int A0M = -1;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public AnonymousClass0S1 A0R;
    public AnonymousClass0S1 A0S;
    public AnonymousClass0S1 A0T;
    public AnonymousClass0S1 A0U;
    public AnonymousClass0S1 A0V;
    public AnonymousClass0S1 A0W;
    public AnonymousClass0S1 A0X;
    public AnonymousClass0S1 A0Y;
    public AnonymousClass0SN A0Z;
    public AnonymousClass0Du A0a;
    public AnonymousClass0Du A0b;
    public AnonymousClass0Dw A0c = new AnonymousClass0Dw(this);
    public AnonymousClass0Dv A0d = new AnonymousClass0Dv(this);
    public Object A0e;
    public String A0f;
    public ArrayList A0g;
    public boolean A0h = false;
    public boolean A0i = false;
    public float[] A0j;
    public int[] A0k = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public int[] A0l = new int[2];
    public int[] A0m = {0, 0, 0, 0};
    public AnonymousClass0S1[] A0n;
    public C03810Jy[] A0o;
    public AnonymousClass0SN[] A0p;
    public AnonymousClass0SN[] A0q;
    public boolean[] A0r = {true, true};
    public boolean[] A0s;

    public AnonymousClass0SN() {
        AnonymousClass0S1 r2 = new AnonymousClass0S1(AnonymousClass0KD.LEFT, this);
        this.A0W = r2;
        AnonymousClass0S1 r12 = new AnonymousClass0S1(AnonymousClass0KD.TOP, this);
        this.A0Y = r12;
        AnonymousClass0S1 r10 = new AnonymousClass0S1(AnonymousClass0KD.RIGHT, this);
        this.A0X = r10;
        AnonymousClass0S1 r9 = new AnonymousClass0S1(AnonymousClass0KD.BOTTOM, this);
        this.A0S = r9;
        AnonymousClass0S1 r8 = new AnonymousClass0S1(AnonymousClass0KD.BASELINE, this);
        this.A0R = r8;
        this.A0U = new AnonymousClass0S1(AnonymousClass0KD.CENTER_X, this);
        this.A0V = new AnonymousClass0S1(AnonymousClass0KD.CENTER_Y, this);
        AnonymousClass0S1 r5 = new AnonymousClass0S1(AnonymousClass0KD.CENTER, this);
        this.A0T = r5;
        this.A0n = new AnonymousClass0S1[]{r2, r10, r12, r9, r8, r5};
        this.A0g = AnonymousClass000.A0u();
        this.A0s = new boolean[2];
        C03810Jy r0 = C03810Jy.FIXED;
        this.A0o = new C03810Jy[]{r0, r0};
        this.A0Z = null;
        this.A0O = 0;
        this.A09 = 0;
        this.A01 = 0.0f;
        this.A08 = -1;
        this.A0P = 0;
        this.A0Q = 0;
        this.A07 = 0;
        this.A02 = 0.5f;
        this.A06 = 0.5f;
        this.A0N = 0;
        this.A0f = null;
        this.A0A = 0;
        this.A0L = 0;
        this.A0j = new float[]{-1.0f, -1.0f};
        this.A0p = new AnonymousClass0SN[]{null, null};
        this.A0q = new AnonymousClass0SN[]{null, null};
        ArrayList arrayList = this.A0g;
        arrayList.add(this.A0W);
        arrayList.add(this.A0Y);
        arrayList.add(this.A0X);
        arrayList.add(this.A0S);
        arrayList.add(this.A0U);
        arrayList.add(this.A0V);
        arrayList.add(this.A0T);
        arrayList.add(this.A0R);
    }

    public static C07210an A01(AnonymousClass0VD r2, AnonymousClass0SA r3, AnonymousClass0SA r4, AnonymousClass0SA r5, float f2) {
        C07210an A022 = r2.A02();
        A022.A01.Ab0(r3, -1.0f);
        A022.A01.Ab0(r4, 1.0f);
        A022.A01.Ab0(r5, f2);
        return A022;
    }

    public static AnonymousClass0SA A02(AnonymousClass0VD r1, AnonymousClass0KD r2, AnonymousClass0SN r3) {
        return r1.A06(r3.A07(r2));
    }

    public int A03() {
        if (this.A0N == 8) {
            return 0;
        }
        return this.A09;
    }

    public int A04() {
        if (this.A0N == 8) {
            return 0;
        }
        return this.A0O;
    }

    public int A05() {
        AnonymousClass0SN r1 = this.A0Z;
        return (r1 == null || !(r1 instanceof AnonymousClass0Dp)) ? this.A0P : ((AnonymousClass0Dp) r1).A02 + this.A0P;
    }

    public int A06() {
        AnonymousClass0SN r1 = this.A0Z;
        return (r1 == null || !(r1 instanceof AnonymousClass0Dp)) ? this.A0Q : ((AnonymousClass0Dp) r1).A03 + this.A0Q;
    }

    public AnonymousClass0S1 A07(AnonymousClass0KD r3) {
        switch (r3.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.A0W;
            case 2:
                return this.A0Y;
            case 3:
                return this.A0X;
            case 4:
                return this.A0S;
            case 5:
                return this.A0R;
            case 6:
                return this.A0T;
            case 7:
                return this.A0U;
            case 8:
                return this.A0V;
            default:
                throw new AssertionError(r3.name());
        }
    }

    public void A08() {
        this.A0W.A01();
        this.A0Y.A01();
        this.A0X.A01();
        this.A0S.A01();
        this.A0R.A01();
        this.A0U.A01();
        this.A0V.A01();
        this.A0T.A01();
        this.A0Z = null;
        this.A00 = 0.0f;
        this.A0O = 0;
        this.A09 = 0;
        this.A01 = 0.0f;
        this.A08 = -1;
        this.A0P = 0;
        this.A0Q = 0;
        this.A07 = 0;
        this.A0J = 0;
        this.A0I = 0;
        this.A02 = 0.5f;
        this.A06 = 0.5f;
        C03810Jy[] r1 = this.A0o;
        C03810Jy r0 = C03810Jy.FIXED;
        r1[0] = r0;
        r1[1] = r0;
        this.A0e = null;
        this.A0N = 0;
        this.A0A = 0;
        this.A0L = 0;
        float[] fArr = this.A0j;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.A0B = -1;
        this.A0M = -1;
        int[] iArr = this.A0k;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.A0D = 0;
        this.A0C = 0;
        this.A04 = 1.0f;
        this.A03 = 1.0f;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0H = 0;
        this.A0G = 0;
        this.A0K = -1;
        this.A05 = 1.0f;
        boolean[] zArr = this.A0r;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.A0s;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void A09(int i2) {
        this.A09 = i2;
        int i3 = this.A0I;
        if (i2 < i3) {
            this.A09 = i3;
        }
    }

    public void A0A(int i2) {
        this.A0O = i2;
        int i3 = this.A0J;
        if (i2 < i3) {
            this.A0O = i3;
        }
    }

    public void A0B(AnonymousClass0OZ r2) {
        this.A0W.A02();
        this.A0Y.A02();
        this.A0X.A02();
        this.A0S.A02();
        this.A0R.A02();
        this.A0T.A02();
        this.A0U.A02();
        this.A0V.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020f, code lost:
        if (r60.A03 != null) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x048f, code lost:
        if (r8 == 0) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04a3, code lost:
        if (r12.A03 != null) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04bb, code lost:
        if (r12.A03 != null) goto L_0x04bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04c3, code lost:
        if (r0.A0G == 0) goto L_0x04c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04d2, code lost:
        if (r12.A03 != null) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04d9, code lost:
        if (r0.A0G > 0) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04db, code lost:
        r0.A05 = 1.0f / r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04fd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.AnonymousClass0VD r83) {
        /*
            r82 = this;
            r0 = r82
            X.0S1 r1 = r0.A0W
            r32 = r1
            r1 = r83
            r2 = r32
            X.0SA r22 = r1.A06(r2)
            X.0S1 r12 = r0.A0X
            X.0SA r24 = r1.A06(r12)
            X.0S1 r2 = r0.A0Y
            r59 = r2
            X.0SA r23 = r1.A06(r2)
            X.0S1 r2 = r0.A0S
            r60 = r2
            X.0SA r25 = r1.A06(r2)
            X.0S1 r2 = r0.A0R
            r27 = r2
            X.0SA r26 = r1.A06(r2)
            X.0Dw r2 = r0.A0c
            r29 = r2
            X.0aq r4 = r2.A05
            boolean r2 = r4.A0B
            r3 = 0
            if (r2 == 0) goto L_0x00c1
            r2 = r29
            X.0aq r8 = r2.A04
            boolean r2 = r8.A0B
            if (r2 == 0) goto L_0x00c1
            X.0Dv r5 = r0.A0d
            X.0aq r7 = r5.A05
            boolean r2 = r7.A0B
            if (r2 == 0) goto L_0x00c1
            X.0aq r6 = r5.A04
            boolean r2 = r6.A0B
            if (r2 == 0) goto L_0x00c1
            int r4 = r4.A02
            r2 = r22
            r1.A0D(r2, r4)
            int r4 = r8.A02
            r2 = r24
            r1.A0D(r2, r4)
            int r4 = r7.A02
            r2 = r23
            r1.A0D(r2, r4)
            int r4 = r6.A02
            r2 = r25
            r1.A0D(r2, r4)
            X.0aq r2 = r5.A00
            int r4 = r2.A02
            r2 = r26
            r1.A0D(r2, r4)
            X.0SN r7 = r0.A0Z
            if (r7 == 0) goto L_0x00c0
            X.0Jy[] r6 = r7.A0o
            r2 = r6[r3]
            X.0Jy r5 = X.C03810Jy.WRAP_CONTENT
            boolean r4 = X.AnonymousClass000.A1Y(r2, r5)
            r2 = 1
            r2 = r6[r2]
            boolean r6 = X.AnonymousClass000.A1Y(r2, r5)
            if (r4 == 0) goto L_0x00a2
            boolean[] r2 = r0.A0r
            boolean r2 = r2[r3]
            if (r2 == 0) goto L_0x00a2
            boolean r2 = r0.A0J()
            if (r2 != 0) goto L_0x00a2
            X.0S1 r2 = r7.A0X
            X.0SA r5 = r1.A06(r2)
            r4 = 8
            r2 = r24
            r1.A0F(r5, r2, r3, r4)
        L_0x00a2:
            if (r6 == 0) goto L_0x00c0
            boolean[] r4 = r0.A0r
            r2 = 1
            boolean r2 = r4[r2]
            if (r2 == 0) goto L_0x00c0
            boolean r2 = r0.A0K()
            if (r2 != 0) goto L_0x00c0
            X.0SN r0 = r0.A0Z
            X.0S1 r0 = r0.A0S
            X.0SA r4 = r1.A06(r0)
            r2 = 8
            r0 = r25
            r1.A0F(r4, r0, r3, r2)
        L_0x00c0:
            return
        L_0x00c1:
            X.0SN r9 = r0.A0Z
            if (r9 == 0) goto L_0x052a
            X.0Jy[] r6 = r9.A0o
            r2 = r6[r3]
            X.0Jy r5 = X.C03810Jy.WRAP_CONTENT
            boolean r46 = X.AnonymousClass000.A1Y(r2, r5)
            r7 = 1
            r2 = r6[r7]
            boolean r47 = X.AnonymousClass000.A1Y(r2, r5)
            X.0S1[] r6 = r0.A0n
            r5 = r6[r3]
            X.0S1 r2 = r5.A03
            if (r2 == 0) goto L_0x0524
            X.0S1 r2 = r2.A03
            if (r2 == r5) goto L_0x0524
            r5 = r6[r7]
            X.0S1 r2 = r5.A03
            if (r2 == 0) goto L_0x0524
            X.0S1 r2 = r2.A03
            if (r2 != r5) goto L_0x0524
            X.0Dp r9 = (X.AnonymousClass0Dp) r9
            int r2 = r9.A00
            int r5 = r2 + 1
            X.0PE[] r8 = r9.A0C
            int r2 = r8.length
            if (r5 < r2) goto L_0x0101
            int r2 = r2 << 1
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r2)
            X.0PE[] r8 = (X.AnonymousClass0PE[]) r8
            r9.A0C = r8
        L_0x0101:
            int r7 = r9.A00
            boolean r5 = r9.A0A
            X.0PE r2 = new X.0PE
            r2.<init>(r0, r3, r5)
            r8[r7] = r2
            int r2 = r7 + 1
            r9.A00 = r2
            r51 = 1
        L_0x0112:
            r52 = 1
            r2 = 2
            r5 = r6[r2]
            X.0S1 r2 = r5.A03
            if (r2 == 0) goto L_0x051e
            X.0S1 r2 = r2.A03
            if (r2 == r5) goto L_0x051e
            r2 = 3
            r5 = r6[r2]
            X.0S1 r2 = r5.A03
            if (r2 == 0) goto L_0x051e
            X.0S1 r2 = r2.A03
            if (r2 != r5) goto L_0x051e
            X.0SN r9 = r0.A0Z
            X.0Dp r9 = (X.AnonymousClass0Dp) r9
            int r2 = r9.A04
            int r5 = r2 + 1
            X.0PE[] r8 = r9.A0D
            int r2 = r8.length
            if (r5 < r2) goto L_0x0141
            int r2 = r2 << 1
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r2)
            X.0PE[] r8 = (X.AnonymousClass0PE[]) r8
            r9.A0D = r8
        L_0x0141:
            int r7 = r9.A04
            boolean r6 = r9.A0A
            r5 = 1
            X.0PE r2 = new X.0PE
            r2.<init>(r0, r5, r6)
            r8[r7] = r2
            int r2 = r7 + 1
            r9.A04 = r2
        L_0x0151:
            if (r51 != 0) goto L_0x0173
            if (r46 == 0) goto L_0x0173
            int r5 = r0.A0N
            r2 = 8
            if (r5 == r2) goto L_0x0173
            r2 = r32
            X.0S1 r2 = r2.A03
            if (r2 != 0) goto L_0x0173
            X.0S1 r2 = r12.A03
            if (r2 != 0) goto L_0x0173
            X.0SN r2 = r0.A0Z
            X.0S1 r2 = r2.A0X
            X.0SA r6 = r1.A06(r2)
            r5 = 1
            r2 = r24
            r1.A0F(r6, r2, r3, r5)
        L_0x0173:
            if (r52 != 0) goto L_0x0199
            if (r47 == 0) goto L_0x0199
            int r5 = r0.A0N
            r2 = 8
            if (r5 == r2) goto L_0x0199
            r2 = r59
            X.0S1 r2 = r2.A03
            if (r2 != 0) goto L_0x0199
            r2 = r60
            X.0S1 r2 = r2.A03
            if (r2 != 0) goto L_0x0199
            if (r27 != 0) goto L_0x0199
            X.0SN r2 = r0.A0Z
            X.0S1 r2 = r2.A0S
            X.0SA r6 = r1.A06(r2)
            r5 = 1
            r2 = r25
            r1.A0F(r6, r2, r3, r5)
        L_0x0199:
            int r15 = r0.A0O
            int r2 = r0.A0J
            r21 = r2
            if (r15 < r2) goto L_0x01a3
            r21 = r15
        L_0x01a3:
            int r14 = r0.A09
            int r2 = r0.A0I
            r20 = r2
            if (r14 < r2) goto L_0x01ad
            r20 = r14
        L_0x01ad:
            X.0Jy[] r2 = r0.A0o
            r19 = r2
            r9 = r2[r3]
            X.0Jy r10 = X.C03810Jy.MATCH_CONSTRAINT
            r18 = 0
            if (r9 == r10) goto L_0x01bb
            r18 = 1
        L_0x01bb:
            r6 = 1
            r11 = r2[r6]
            r17 = 0
            if (r11 == r10) goto L_0x01c4
            r17 = 1
        L_0x01c4:
            int r8 = r0.A08
            r0.A0K = r8
            r7 = r8
            float r5 = r0.A01
            r0.A05 = r5
            int r2 = r0.A0D
            r16 = r2
            int r13 = r0.A0C
            r2 = 0
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x051a
            int r2 = r0.A0N
            r28 = r2
            r3 = 8
            r2 = r28
            if (r2 == r3) goto L_0x051a
            if (r9 != r10) goto L_0x01e8
            if (r16 != 0) goto L_0x01e8
            r16 = 3
        L_0x01e8:
            if (r11 != r10) goto L_0x01ed
            if (r13 != 0) goto L_0x01ed
            r13 = 3
        L_0x01ed:
            if (r9 != r10) goto L_0x04e3
            if (r11 != r10) goto L_0x04e3
            r3 = 3
            r2 = r16
            if (r2 != r3) goto L_0x04e4
            if (r13 != r3) goto L_0x04e4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r10 = -1
            if (r8 != r10) goto L_0x048f
            if (r18 == 0) goto L_0x0493
            if (r17 != 0) goto L_0x04a7
            r0.A0K = r2
            r7 = 0
        L_0x0205:
            r2 = r59
            X.0S1 r2 = r2.A03
            if (r2 == 0) goto L_0x04de
            r2 = r60
            X.0S1 r2 = r2.A03
            if (r2 == 0) goto L_0x04de
        L_0x0211:
            r2 = 0
        L_0x0212:
            r11 = 1
        L_0x0213:
            int[] r3 = r0.A0l
            r3[r2] = r16
            r3[r6] = r13
            if (r11 == 0) goto L_0x048b
            r3 = -1
            if (r7 == 0) goto L_0x0220
            if (r7 != r3) goto L_0x048b
        L_0x0220:
            r50 = 1
        L_0x0222:
            X.0Jy r7 = X.C03810Jy.WRAP_CONTENT
            if (r9 != r7) goto L_0x0487
            boolean r3 = r0 instanceof X.AnonymousClass0Dp
            if (r3 == 0) goto L_0x0487
            r49 = 1
            r21 = 0
        L_0x022e:
            X.0S1 r10 = r0.A0T
            X.0S1 r3 = r10.A03
            boolean r3 = X.AnonymousClass000.A1V(r3)
            r54 = r3 ^ 1
            boolean[] r3 = r0.A0s
            boolean r53 = r3[r2]
            boolean r80 = r3[r6]
            int r5 = r0.A0B
            r3 = 2
            r57 = 0
            if (r5 == r3) goto L_0x027e
            boolean r3 = r4.A0B
            if (r3 == 0) goto L_0x0438
            r3 = r29
            X.0aq r3 = r3.A04
            boolean r5 = r3.A0B
            if (r5 == 0) goto L_0x0438
            int r5 = r4.A02
            r4 = r22
            r1.A0D(r4, r5)
            int r4 = r3.A02
            r3 = r24
            r1.A0D(r3, r4)
            X.0SN r4 = r0.A0Z
            if (r4 == 0) goto L_0x027e
            if (r46 == 0) goto L_0x027e
            boolean[] r3 = r0.A0r
            boolean r3 = r3[r2]
            if (r3 == 0) goto L_0x027e
            boolean r3 = r0.A0J()
            if (r3 != 0) goto L_0x027e
            X.0S1 r3 = r4.A0X
            X.0SA r5 = r1.A06(r3)
            r4 = 8
            r3 = r24
            r1.A0F(r5, r3, r2, r4)
        L_0x027e:
            X.0Dv r4 = r0.A0d
            X.0aq r3 = r4.A05
            boolean r2 = r3.A0B
            if (r2 == 0) goto L_0x0431
            X.0aq r5 = r4.A04
            boolean r2 = r5.A0B
            if (r2 == 0) goto L_0x0431
            int r3 = r3.A02
            r2 = r23
            r1.A0D(r2, r3)
            int r3 = r5.A02
            r2 = r25
            r1.A0D(r2, r3)
            X.0aq r2 = r4.A00
            int r3 = r2.A02
            r2 = r26
            r1.A0D(r2, r3)
            X.0SN r4 = r0.A0Z
            if (r4 == 0) goto L_0x042b
            if (r52 != 0) goto L_0x042b
            if (r47 == 0) goto L_0x042b
            boolean[] r3 = r0.A0r
            r2 = 1
            boolean r3 = r3[r2]
            if (r3 == 0) goto L_0x0426
            X.0S1 r3 = r4.A0S
            X.0SA r4 = r1.A06(r3)
            r6 = 8
            r5 = 0
            r3 = r25
            r1.A0F(r4, r3, r5, r6)
        L_0x02c0:
            r8 = 0
        L_0x02c1:
            int r4 = r0.A0M
            r3 = 2
            if (r4 == r3) goto L_0x035c
            if (r8 == 0) goto L_0x035c
            r3 = r19[r2]
            if (r3 != r7) goto L_0x0422
            boolean r3 = r0 instanceof X.AnonymousClass0Dp
            if (r3 == 0) goto L_0x0422
            r76 = 1
            r20 = 0
        L_0x02d4:
            if (r11 == 0) goto L_0x041e
            int r4 = r0.A0K
            if (r4 == r2) goto L_0x02dd
            r3 = -1
            if (r4 != r3) goto L_0x041e
        L_0x02dd:
            r77 = 1
        L_0x02df:
            X.0SN r3 = r0.A0Z
            if (r3 == 0) goto L_0x041a
            X.0S1 r3 = r3.A0S
            X.0SA r8 = r1.A06(r3)
        L_0x02e9:
            X.0SN r3 = r0.A0Z
            if (r3 == 0) goto L_0x02f3
            X.0S1 r3 = r3.A0Y
            X.0SA r57 = r1.A06(r3)
        L_0x02f3:
            int r7 = r0.A07
            if (r7 > 0) goto L_0x02fb
            int r3 = r0.A0N
            if (r3 != r6) goto L_0x031f
        L_0x02fb:
            r4 = r23
            r3 = r26
            r1.A0E(r3, r4, r7, r6)
            r3 = r27
            X.0S1 r3 = r3.A03
            if (r3 == 0) goto L_0x040f
            X.0SA r4 = r1.A06(r3)
            r3 = r26
            r1.A0E(r3, r4, r5, r6)
            if (r47 == 0) goto L_0x031d
            r3 = r60
            X.0SA r4 = r1.A06(r3)
            r3 = 5
            r1.A0F(r8, r4, r5, r3)
        L_0x031d:
            r54 = 0
        L_0x031f:
            boolean[] r3 = r0.A0r
            boolean r75 = r3[r2]
            r61 = r19[r2]
            int r9 = r0.A0Q
            int r7 = r0.A0I
            int[] r3 = r0.A0k
            r67 = r3[r2]
            float r6 = r0.A06
            int r5 = r0.A0G
            int r4 = r0.A0E
            float r3 = r0.A03
            r72 = 0
            r55 = r0
            r56 = r1
            r58 = r8
            r62 = r6
            r63 = r3
            r64 = r9
            r65 = r20
            r66 = r7
            r68 = r13
            r69 = r16
            r70 = r5
            r71 = r4
            r73 = r47
            r74 = r46
            r78 = r52
            r79 = r51
            r81 = r54
            r55.A0F(r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81)
        L_0x035c:
            if (r11 == 0) goto L_0x0379
            int r3 = r0.A0K
            float r6 = r0.A05
            if (r3 != r2) goto L_0x03fe
            r4 = r25
            r3 = r23
            r2 = r24
            X.0an r5 = A01(r1, r4, r3, r2, r6)
            X.0lx r4 = r5.A01
            float r3 = -r6
        L_0x0371:
            r2 = r22
            r4.Ab0(r2, r3)
            r1.A0A(r5)
        L_0x0379:
            X.0S1 r2 = r10.A03
            if (r2 == 0) goto L_0x00c0
            X.0SN r7 = r2.A06
            float r3 = r0.A00
            r2 = 1119092736(0x42b40000, float:90.0)
            float r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.toRadians(r2)
            float r5 = (float) r2
            int r2 = r10.A00()
            X.0KD r8 = X.AnonymousClass0KD.LEFT
            X.0SA r10 = A02(r1, r8, r0)
            X.0KD r6 = X.AnonymousClass0KD.TOP
            X.0SA r12 = A02(r1, r6, r0)
            X.0KD r4 = X.AnonymousClass0KD.RIGHT
            X.0SA r9 = A02(r1, r4, r0)
            X.0KD r3 = X.AnonymousClass0KD.BOTTOM
            X.0SA r13 = A02(r1, r3, r0)
            X.0SA r11 = A02(r1, r8, r7)
            X.0SA r14 = A02(r1, r6, r7)
            X.0SA r8 = A02(r1, r4, r7)
            X.0SA r0 = A02(r1, r3, r7)
            X.0an r7 = r1.A02()
            double r15 = (double) r5
            double r3 = java.lang.Math.sin(r15)
            double r5 = (double) r2
            double r3 = r3 * r5
            float r2 = (float) r3
            X.0lx r3 = r7.A01
            r4 = 1056964608(0x3f000000, float:0.5)
            r3.Ab0(r14, r4)
            X.0lx r3 = r7.A01
            r3.Ab0(r0, r4)
            X.0lx r3 = r7.A01
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
            r3.Ab0(r12, r0)
            X.0lx r3 = r7.A01
            r3.Ab0(r13, r0)
            float r2 = -r2
            r7.A00 = r2
            r1.A0A(r7)
            X.0an r7 = r1.A02()
            double r2 = java.lang.Math.cos(r15)
            double r2 = r2 * r5
            float r5 = (float) r2
            X.0lx r2 = r7.A01
            r2.Ab0(r11, r4)
            X.C07210an.A00(r7, r8, r10, r4, r0)
            X.0lx r2 = r7.A01
            r2.Ab0(r9, r0)
            float r0 = -r5
            r7.A00 = r0
            r1.A0A(r7)
            return
        L_0x03fe:
            r4 = r24
            r3 = r22
            r2 = r25
            X.0an r5 = A01(r1, r4, r3, r2, r6)
            X.0lx r4 = r5.A01
            float r3 = -r6
            r22 = r23
            goto L_0x0371
        L_0x040f:
            int r3 = r0.A0N
            if (r3 != r6) goto L_0x031f
            r3 = r26
            r1.A0E(r3, r4, r5, r6)
            goto L_0x031f
        L_0x041a:
            r8 = r57
            goto L_0x02e9
        L_0x041e:
            r77 = 0
            goto L_0x02df
        L_0x0422:
            r76 = 0
            goto L_0x02d4
        L_0x0426:
            r6 = 8
            r5 = 0
            goto L_0x02c0
        L_0x042b:
            r6 = 8
            r5 = 0
            r2 = 1
            goto L_0x02c0
        L_0x0431:
            r6 = 8
            r5 = 0
            r2 = 1
            r8 = 1
            goto L_0x02c1
        L_0x0438:
            X.0SN r3 = r0.A0Z
            if (r3 == 0) goto L_0x0484
            X.0S1 r3 = r3.A0X
            X.0SA r31 = r1.A06(r3)
        L_0x0442:
            X.0SN r3 = r0.A0Z
            if (r3 == 0) goto L_0x0481
            X.0S1 r3 = r3.A0W
            X.0SA r30 = r1.A06(r3)
        L_0x044c:
            boolean[] r3 = r0.A0r
            boolean r48 = r3[r2]
            r34 = r19[r2]
            int r8 = r0.A0P
            int r6 = r0.A0J
            int[] r3 = r0.A0k
            r40 = r3[r2]
            float r5 = r0.A02
            int r4 = r0.A0H
            int r3 = r0.A0F
            float r2 = r0.A04
            r45 = 1
            r28 = r0
            r29 = r1
            r33 = r12
            r35 = r5
            r36 = r2
            r37 = r8
            r38 = r21
            r39 = r6
            r41 = r16
            r42 = r13
            r43 = r4
            r44 = r3
            r28.A0F(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            goto L_0x027e
        L_0x0481:
            r30 = r57
            goto L_0x044c
        L_0x0484:
            r31 = r57
            goto L_0x0442
        L_0x0487:
            r49 = 0
            goto L_0x022e
        L_0x048b:
            r50 = 0
            goto L_0x0222
        L_0x048f:
            if (r8 != 0) goto L_0x049b
            goto L_0x0205
        L_0x0493:
            if (r17 == 0) goto L_0x04a7
            r0.A0K = r6
            r7 = 1
            float r3 = r3 / r5
            r0.A05 = r3
        L_0x049b:
            r3 = r32
            X.0S1 r3 = r3.A03
            if (r3 == 0) goto L_0x04c5
            X.0S1 r3 = r12.A03
            if (r3 == 0) goto L_0x04c5
            goto L_0x0211
        L_0x04a7:
            r8 = r59
            X.0S1 r8 = r8.A03
            if (r8 == 0) goto L_0x04ca
            r8 = r60
            X.0S1 r8 = r8.A03
            if (r8 == 0) goto L_0x04ca
            r8 = r32
            X.0S1 r8 = r8.A03
            if (r8 == 0) goto L_0x04c5
            X.0S1 r8 = r12.A03
            if (r8 == 0) goto L_0x04c5
        L_0x04bd:
            int r8 = r0.A0H
            if (r8 <= 0) goto L_0x04d5
            int r3 = r0.A0G
            if (r3 != 0) goto L_0x0211
        L_0x04c5:
            r0.A0K = r2
            r7 = 0
            goto L_0x0211
        L_0x04ca:
            r8 = r32
            X.0S1 r8 = r8.A03
            if (r8 == 0) goto L_0x04bd
            X.0S1 r8 = r12.A03
            if (r8 == 0) goto L_0x04bd
            goto L_0x04db
        L_0x04d5:
            if (r8 != 0) goto L_0x0211
            int r2 = r0.A0G
            if (r2 <= 0) goto L_0x0211
        L_0x04db:
            float r3 = r3 / r5
            r0.A05 = r3
        L_0x04de:
            r0.A0K = r6
            r7 = 1
            goto L_0x0211
        L_0x04e3:
            r3 = 3
        L_0x04e4:
            if (r9 != r10) goto L_0x04fd
            r2 = r16
            if (r2 != r3) goto L_0x04fd
            r2 = 0
            r0.A0K = r2
            r7 = 0
            float r2 = (float) r14
            float r5 = r5 * r2
            int r2 = (int) r5
            r21 = r2
            r16 = 3
            if (r11 == r10) goto L_0x0211
            r2 = 0
            r11 = 0
            r16 = 4
            goto L_0x0213
        L_0x04fd:
            if (r11 != r10) goto L_0x0211
            if (r13 != r3) goto L_0x0211
            r0.A0K = r6
            r7 = 1
            r2 = -1
            if (r8 != r2) goto L_0x050d
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r5
            r0.A05 = r2
            r5 = r2
        L_0x050d:
            float r2 = (float) r15
            float r5 = r5 * r2
            int r2 = (int) r5
            r20 = r2
            r2 = 0
            r13 = 3
            if (r9 == r10) goto L_0x0212
            r11 = 0
            r13 = 4
            goto L_0x0213
        L_0x051a:
            r2 = 0
            r11 = 0
            goto L_0x0213
        L_0x051e:
            boolean r52 = r0.A0K()
            goto L_0x0151
        L_0x0524:
            boolean r51 = r0.A0J()
            goto L_0x0112
        L_0x052a:
            r47 = 0
            r46 = 0
            r52 = 0
            r51 = 0
            goto L_0x0199
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0SN.A0C(X.0VD):void");
    }

    public void A0D(AnonymousClass0VD r2) {
        r2.A06(this.A0W);
        r2.A06(this.A0Y);
        r2.A06(this.A0X);
        r2.A06(this.A0S);
        if (this.A07 > 0) {
            r2.A06(this.A0R);
        }
    }

    public void A0E(AnonymousClass0VD r8) {
        int i2;
        int i3;
        int A002 = AnonymousClass0VD.A00(this.A0W);
        int A003 = AnonymousClass0VD.A00(this.A0Y);
        int A004 = AnonymousClass0VD.A00(this.A0X);
        int A005 = AnonymousClass0VD.A00(this.A0S);
        AnonymousClass0Dw r1 = this.A0c;
        C07240aq r2 = r1.A05;
        if (r2.A0B) {
            C07240aq r12 = r1.A04;
            if (r12.A0B) {
                A002 = r2.A02;
                A004 = r12.A02;
            }
        }
        AnonymousClass0Dv r13 = this.A0d;
        C07240aq r22 = r13.A05;
        if (r22.A0B) {
            C07240aq r14 = r13.A04;
            if (r14.A0B) {
                A003 = r22.A02;
                A005 = r14.A02;
            }
        }
        int i4 = A005 - A003;
        if (A004 - A002 < 0 || i4 < 0 || A002 == Integer.MIN_VALUE || A002 == Integer.MAX_VALUE || A003 == Integer.MIN_VALUE || A003 == Integer.MAX_VALUE || A004 == Integer.MIN_VALUE || A004 == Integer.MAX_VALUE || A005 == Integer.MIN_VALUE || A005 == Integer.MAX_VALUE) {
            A005 = 0;
            A002 = 0;
            A003 = 0;
            A004 = 0;
        }
        int i5 = A004 - A002;
        int i6 = A005 - A003;
        this.A0P = A002;
        this.A0Q = A003;
        if (this.A0N == 8) {
            this.A0O = 0;
            this.A09 = 0;
            return;
        }
        C03810Jy[] r23 = this.A0o;
        C03810Jy r0 = r23[0];
        C03810Jy r15 = C03810Jy.FIXED;
        if (r0 == r15 && i5 < (i3 = this.A0O)) {
            i5 = i3;
        }
        if (r23[1] == r15 && i6 < (i2 = this.A09)) {
            i6 = i2;
        }
        this.A0O = i5;
        this.A09 = i6;
        int i7 = this.A0I;
        if (i6 < i7) {
            this.A09 = i7;
        }
        int i8 = this.A0J;
        if (i5 < i8) {
            this.A0O = i8;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        if (r3 == 4) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01a0, code lost:
        if (r16 != false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01d3, code lost:
        if (r7 == 1) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01fb, code lost:
        if (r9 == r11) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0213, code lost:
        if (r8 != false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e9, code lost:
        if (r15 != 0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fa, code lost:
        if ((r9 instanceof X.AnonymousClass0Dn) != false) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.AnonymousClass0VD r35, X.AnonymousClass0SA r36, X.AnonymousClass0SA r37, X.AnonymousClass0S1 r38, X.AnonymousClass0S1 r39, X.C03810Jy r40, float r41, float r42, int r43, int r44, int r45, int r46, int r47, int r48, int r49, int r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, boolean r59, boolean r60) {
        /*
            r34 = this;
            r3 = r47
            r5 = r44
            r15 = r49
            r7 = r50
            r2 = r35
            r32 = r38
            r0 = r32
            X.0SA r1 = r2.A06(r0)
            r31 = r39
            r0 = r31
            X.0SA r0 = r2.A06(r0)
            r4 = r32
            X.0S1 r4 = r4.A03
            X.0SA r14 = r2.A06(r4)
            r4 = r31
            X.0S1 r4 = r4.A03
            X.0SA r20 = r2.A06(r4)
            r4 = r32
            X.0S1 r4 = r4.A03
            boolean r12 = X.AnonymousClass000.A1V(r4)
            r4 = r31
            X.0S1 r4 = r4.A03
            boolean r11 = X.AnonymousClass000.A1V(r4)
            r10 = r34
            X.0S1 r4 = r10.A0T
            X.0S1 r4 = r4.A03
            boolean r8 = X.AnonymousClass000.A1V(r4)
            r9 = r12
            if (r11 == 0) goto L_0x0049
            int r9 = r12 + 1
        L_0x0049:
            if (r8 == 0) goto L_0x004d
            int r9 = r9 + 1
        L_0x004d:
            if (r56 == 0) goto L_0x0050
            r3 = 3
        L_0x0050:
            int r4 = r40.ordinal()
            int r4 = 2 - r4
            if (r4 != 0) goto L_0x005d
            r4 = 4
            r19 = 1
            if (r3 != r4) goto L_0x005f
        L_0x005d:
            r19 = 0
        L_0x005f:
            int r6 = r10.A0N
            r4 = 8
            if (r6 != r4) goto L_0x0068
            r5 = 0
            r19 = 0
        L_0x0068:
            if (r60 == 0) goto L_0x0075
            if (r12 != 0) goto L_0x0312
            if (r11 != 0) goto L_0x0075
            if (r8 != 0) goto L_0x0075
            r6 = r43
            r2.A0D(r1, r6)
        L_0x0075:
            r21 = r45
            if (r19 != 0) goto L_0x027f
            if (r55 == 0) goto L_0x0307
            r5 = 0
            r4 = 3
            r2.A0E(r0, r1, r5, r4)
            r5 = 8
            if (r45 <= 0) goto L_0x0089
            r4 = r21
            r2.A0F(r0, r1, r4, r5)
        L_0x0089:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r6 = r46
            if (r6 >= r4) goto L_0x0093
            r2.A0G(r0, r1, r6, r5)
        L_0x0093:
            r13 = r36
            r33 = r37
            if (r60 == 0) goto L_0x024c
            if (r57 != 0) goto L_0x024c
            if (r12 != 0) goto L_0x00cd
            if (r11 == 0) goto L_0x0248
            int r3 = r31.A00()
            int r5 = -r3
            r4 = 8
            r3 = r20
            r2.A0E(r0, r3, r5, r4)
            if (r52 == 0) goto L_0x00ca
            r4 = 5
            r3 = 0
            r2.A0F(r1, r13, r3, r4)
        L_0x00b2:
            if (r54 == 0) goto L_0x00ca
            r1 = r31
            X.0S1 r1 = r1.A03
            if (r1 == 0) goto L_0x00cb
            int r4 = r31.A00()
        L_0x00be:
            r3 = r33
            r1 = r20
            if (r1 == r3) goto L_0x00ca
            r3 = 5
            r1 = r33
            r2.A0F(r1, r0, r4, r3)
        L_0x00ca:
            return
        L_0x00cb:
            r4 = 0
            goto L_0x00be
        L_0x00cd:
            if (r11 == 0) goto L_0x0248
            r4 = r32
            X.0S1 r4 = r4.A03
            X.0SN r6 = r4.A06
            r4 = r31
            X.0S1 r4 = r4.A03
            X.0SN r9 = r4.A06
            X.0SN r11 = r10.A0Z
            r12 = 6
            if (r19 == 0) goto L_0x020a
            if (r3 != 0) goto L_0x01a3
            if (r7 != 0) goto L_0x00eb
            r5 = 8
            r8 = 0
            r18 = 1
            if (r15 == 0) goto L_0x00ef
        L_0x00eb:
            r5 = 5
            r8 = 1
            r18 = 0
        L_0x00ef:
            boolean r4 = r6 instanceof X.AnonymousClass0Dn
            if (r4 != 0) goto L_0x00fc
            boolean r7 = r9 instanceof X.AnonymousClass0Dn
            r4 = r5
            r30 = 6
            r17 = 0
            if (r7 == 0) goto L_0x0101
        L_0x00fc:
            r17 = 0
            r4 = 4
            r30 = 6
        L_0x0101:
            r16 = 1
            if (r8 != 0) goto L_0x021f
            r8 = 8
        L_0x0107:
            int r7 = r10.A0N
            if (r7 == r8) goto L_0x00ca
            if (r17 == 0) goto L_0x012f
            if (r52 == 0) goto L_0x011e
            r7 = r20
            if (r14 == r7) goto L_0x011e
            if (r19 != 0) goto L_0x011e
            boolean r7 = r6 instanceof X.AnonymousClass0Dn
            if (r7 != 0) goto L_0x011d
            boolean r7 = r9 instanceof X.AnonymousClass0Dn
            if (r7 == 0) goto L_0x011e
        L_0x011d:
            r5 = 6
        L_0x011e:
            int r7 = r32.A00()
            r2.A0F(r1, r14, r7, r5)
            int r7 = r31.A00()
            int r10 = -r7
            r7 = r20
            r2.A0G(r0, r7, r10, r5)
        L_0x012f:
            if (r52 == 0) goto L_0x01a0
            if (r59 == 0) goto L_0x01a0
            boolean r7 = r6 instanceof X.AnonymousClass0Dn
            if (r7 != 0) goto L_0x01a0
            boolean r7 = r9 instanceof X.AnonymousClass0Dn
            if (r7 != 0) goto L_0x01a0
            r4 = 6
            r5 = 6
        L_0x013d:
            if (r18 == 0) goto L_0x0161
            if (r58 == 0) goto L_0x0143
            if (r53 == 0) goto L_0x0161
        L_0x0143:
            if (r6 == r11) goto L_0x0148
            if (r9 == r11) goto L_0x0148
            r12 = r4
        L_0x0148:
            boolean r7 = r6 instanceof X.AnonymousClass0Dl
            if (r7 != 0) goto L_0x0150
            boolean r7 = r9 instanceof X.AnonymousClass0Dl
            if (r7 == 0) goto L_0x0151
        L_0x0150:
            r12 = 5
        L_0x0151:
            boolean r7 = r6 instanceof X.AnonymousClass0Dn
            if (r7 != 0) goto L_0x0159
            boolean r7 = r9 instanceof X.AnonymousClass0Dn
            if (r7 == 0) goto L_0x015a
        L_0x0159:
            r12 = 5
        L_0x015a:
            if (r58 == 0) goto L_0x015d
            r12 = 5
        L_0x015d:
            int r4 = java.lang.Math.max(r12, r4)
        L_0x0161:
            if (r52 == 0) goto L_0x0170
            int r4 = java.lang.Math.min(r5, r4)
            if (r56 == 0) goto L_0x0170
            if (r58 != 0) goto L_0x0170
            if (r6 == r11) goto L_0x016f
            if (r9 != r11) goto L_0x0170
        L_0x016f:
            r4 = 4
        L_0x0170:
            int r5 = r32.A00()
            r2.A0E(r1, r14, r5, r4)
            int r5 = r31.A00()
            int r6 = -r5
            r5 = r20
            r2.A0E(r0, r5, r6, r4)
        L_0x0181:
            if (r52 == 0) goto L_0x00ca
            if (r13 != r14) goto L_0x019e
            int r5 = r32.A00()
        L_0x0189:
            if (r14 == r13) goto L_0x018f
            r4 = 5
            r2.A0F(r1, r13, r5, r4)
        L_0x018f:
            if (r19 == 0) goto L_0x00b2
            if (r45 != 0) goto L_0x00b2
            if (r15 != 0) goto L_0x00b2
            r5 = 3
            r4 = 0
            if (r3 != r5) goto L_0x0242
            r2.A0F(r0, r1, r4, r8)
            goto L_0x00b2
        L_0x019e:
            r5 = 0
            goto L_0x0189
        L_0x01a0:
            if (r16 == 0) goto L_0x0181
            goto L_0x013d
        L_0x01a3:
            r8 = 1
            if (r3 != r8) goto L_0x01ae
            r30 = 6
            r17 = 1
            r4 = 4
            r5 = 8
            goto L_0x0211
        L_0x01ae:
            r4 = 3
            if (r3 != r4) goto L_0x0204
            int r5 = r10.A0K
            r4 = -1
            if (r5 != r4) goto L_0x01c9
            if (r58 == 0) goto L_0x01c6
            r30 = 4
            if (r52 == 0) goto L_0x01be
            r30 = 5
        L_0x01be:
            r17 = 1
            r4 = 5
            r5 = 8
        L_0x01c3:
            r18 = 1
            goto L_0x0215
        L_0x01c6:
            r30 = 8
            goto L_0x01be
        L_0x01c9:
            if (r56 == 0) goto L_0x01dc
            r4 = 2
            r7 = r48
            if (r7 == r4) goto L_0x01d5
            r5 = 8
            r4 = 5
            if (r7 != r8) goto L_0x01d7
        L_0x01d5:
            r5 = 5
            r4 = 4
        L_0x01d7:
            r30 = 6
            r17 = 1
            goto L_0x01c3
        L_0x01dc:
            if (r7 <= 0) goto L_0x01e5
            r30 = 6
            r17 = 1
            r4 = 5
        L_0x01e3:
            r5 = 5
            goto L_0x01c3
        L_0x01e5:
            if (r7 != 0) goto L_0x01f2
            if (r15 != 0) goto L_0x01f2
            if (r58 != 0) goto L_0x01f8
            r30 = 6
            r17 = 1
            r4 = 8
            goto L_0x01e3
        L_0x01f2:
            r30 = 6
            r17 = 1
            r4 = 4
            goto L_0x01e3
        L_0x01f8:
            if (r6 == r11) goto L_0x01fd
            r5 = 4
            if (r9 != r11) goto L_0x01fe
        L_0x01fd:
            r5 = 5
        L_0x01fe:
            r30 = 6
            r17 = 1
            r4 = 4
            goto L_0x01c3
        L_0x0204:
            r30 = 6
            r17 = 0
            r8 = 0
            goto L_0x020f
        L_0x020a:
            r30 = 6
            r17 = 1
            r8 = 1
        L_0x020f:
            r4 = 4
            r5 = 5
        L_0x0211:
            r18 = 0
            if (r8 == 0) goto L_0x0101
        L_0x0215:
            r7 = r20
            if (r14 != r7) goto L_0x0101
            if (r6 == r11) goto L_0x0101
            r17 = 0
            r16 = 0
        L_0x021f:
            int r8 = r10.A0N
            r7 = 8
            if (r8 != r7) goto L_0x0227
            r30 = 4
        L_0x0227:
            int r28 = r32.A00()
            int r29 = r31.A00()
            r8 = 8
            r27 = r41
            r25 = r20
            r26 = r0
            r22 = r2
            r23 = r1
            r24 = r14
            r22.A0H(r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0107
        L_0x0242:
            r3 = 5
            r2.A0F(r0, r1, r4, r3)
            goto L_0x00b2
        L_0x0248:
            if (r52 == 0) goto L_0x00ca
            goto L_0x00b2
        L_0x024c:
            r4 = 8
            r3 = 2
            if (r9 >= r3) goto L_0x00ca
            if (r52 == 0) goto L_0x00ca
            if (r54 == 0) goto L_0x00ca
            r3 = 0
            r2.A0F(r1, r13, r3, r4)
            if (r51 != 0) goto L_0x0278
            X.0S1 r1 = r10.A0R
            X.0S1 r1 = r1.A03
            if (r1 == 0) goto L_0x0278
            X.0SN r5 = r1.A06
            float r3 = r5.A01
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00ca
            X.0Jy[] r5 = r5.A0o
            r1 = 0
            r1 = r5[r1]
            X.0Jy r3 = X.C03810Jy.MATCH_CONSTRAINT
            if (r1 != r3) goto L_0x00ca
            r1 = 1
            r1 = r5[r1]
            if (r1 != r3) goto L_0x00ca
        L_0x0278:
            r3 = 0
            r1 = r33
            r2.A0F(r1, r0, r3, r4)
            return
        L_0x027f:
            r6 = 2
            if (r9 == r6) goto L_0x029a
            if (r56 != 0) goto L_0x029a
            r6 = 1
            if (r3 == r6) goto L_0x0289
            if (r3 != 0) goto L_0x029a
        L_0x0289:
            int r5 = java.lang.Math.max(r15, r5)
            if (r50 <= 0) goto L_0x0293
            int r5 = java.lang.Math.min(r7, r5)
        L_0x0293:
            r2.A0E(r0, r1, r5, r4)
        L_0x0296:
            r19 = 0
            goto L_0x0093
        L_0x029a:
            r6 = -2
            if (r15 != r6) goto L_0x029e
            r15 = r5
        L_0x029e:
            if (r7 != r6) goto L_0x02a1
            r7 = r5
        L_0x02a1:
            if (r5 <= 0) goto L_0x02a7
            r6 = 1
            if (r3 == r6) goto L_0x02a7
            r5 = 0
        L_0x02a7:
            if (r15 <= 0) goto L_0x02b0
            r2.A0F(r0, r1, r15, r4)
            int r5 = java.lang.Math.max(r5, r15)
        L_0x02b0:
            if (r7 <= 0) goto L_0x02bb
            if (r52 == 0) goto L_0x02c9
            r6 = 1
            if (r3 != r6) goto L_0x02c9
        L_0x02b7:
            int r5 = java.lang.Math.min(r5, r7)
        L_0x02bb:
            r6 = 1
            if (r3 != r6) goto L_0x02cd
            if (r52 != 0) goto L_0x0307
            r6 = 5
            r2.A0E(r0, r1, r5, r6)
            r2.A0G(r0, r1, r5, r4)
            goto L_0x0093
        L_0x02c9:
            r2.A0G(r0, r1, r7, r4)
            goto L_0x02b7
        L_0x02cd:
            r4 = 2
            if (r3 != r4) goto L_0x030c
            r4 = r32
            X.0KD r5 = r4.A05
            X.0KD r4 = X.AnonymousClass0KD.TOP
            if (r5 == r4) goto L_0x02fc
            X.0KD r6 = X.AnonymousClass0KD.BOTTOM
            if (r5 == r6) goto L_0x02fc
            X.0SN r5 = r10.A0Z
            X.0KD r4 = X.AnonymousClass0KD.LEFT
            X.0SA r6 = A02(r2, r4, r5)
            X.0SN r5 = r10.A0Z
            X.0KD r4 = X.AnonymousClass0KD.RIGHT
        L_0x02e8:
            X.0SA r4 = A02(r2, r4, r5)
            r5 = r42
            X.0an r4 = A01(r2, r0, r1, r4, r5)
            X.0lx r8 = r4.A01
            float r5 = -r5
            r8.Ab0(r6, r5)
            r2.A0A(r4)
            goto L_0x0296
        L_0x02fc:
            X.0SN r5 = r10.A0Z
            X.0SA r6 = A02(r2, r4, r5)
            X.0SN r5 = r10.A0Z
            X.0KD r4 = X.AnonymousClass0KD.BOTTOM
            goto L_0x02e8
        L_0x0307:
            r2.A0E(r0, r1, r5, r4)
            goto L_0x0093
        L_0x030c:
            r19 = 1
            r54 = 1
            goto L_0x0093
        L_0x0312:
            if (r11 != 0) goto L_0x0075
            int r6 = r32.A00()
            r2.A0E(r1, r14, r6, r4)
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0SN.A0F(X.0VD, X.0SA, X.0SA, X.0S1, X.0S1, X.0Jy, float, float, int, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public void A0G(AnonymousClass0KD r5, AnonymousClass0KD r6, AnonymousClass0SN r7, int i2, int i3) {
        AnonymousClass0S1 A072 = A07(r5);
        AnonymousClass0S1 A073 = r7.A07(r6);
        if (A073 == null) {
            A072.A01();
            return;
        }
        A072.A03 = A073;
        HashSet hashSet = A073.A04;
        if (hashSet == null) {
            hashSet = new HashSet();
            A073.A04 = hashSet;
        }
        hashSet.add(A072);
        if (i2 > 0) {
            A072.A01 = i2;
        } else {
            A072.A01 = 0;
        }
        A072.A00 = i3;
    }

    public void A0H(boolean z2, boolean z3) {
        int i2;
        int i3;
        AnonymousClass0Dw r2 = this.A0c;
        boolean z4 = z2 & r2.A09;
        AnonymousClass0Dv r1 = this.A0d;
        boolean z5 = z3 & r1.A09;
        int i4 = r2.A05.A02;
        int i5 = r1.A05.A02;
        int i6 = r2.A04.A02;
        int i7 = r1.A04.A02;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i4 = 0;
            i7 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z4) {
            this.A0P = i4;
        }
        if (z5) {
            this.A0Q = i5;
        }
        if (this.A0N == 8) {
            this.A0O = 0;
            this.A09 = 0;
            return;
        }
        if (z4) {
            if (this.A0o[0] == C03810Jy.FIXED && i9 < (i3 = this.A0O)) {
                i9 = i3;
            }
            this.A0O = i9;
            int i11 = this.A0J;
            if (i9 < i11) {
                this.A0O = i11;
            }
        }
        if (z5) {
            if (this.A0o[1] == C03810Jy.FIXED && i10 < (i2 = this.A09)) {
                i10 = i2;
            }
            this.A09 = i10;
            int i12 = this.A0I;
            if (i10 < i12) {
                this.A09 = i12;
            }
        }
    }

    public boolean A0I() {
        return this.A0N != 8;
    }

    public boolean A0J() {
        AnonymousClass0S1 r1 = this.A0W;
        AnonymousClass0S1 r0 = r1.A03;
        if (r0 != null && r0.A03 == r1) {
            return true;
        }
        AnonymousClass0S1 r12 = this.A0X;
        AnonymousClass0S1 r02 = r12.A03;
        return r02 != null && r02.A03 == r12;
    }

    public boolean A0K() {
        AnonymousClass0S1 r1 = this.A0Y;
        AnonymousClass0S1 r0 = r1.A03;
        if (r0 != null && r0.A03 == r1) {
            return true;
        }
        AnonymousClass0S1 r12 = this.A0S;
        AnonymousClass0S1 r02 = r12.A03;
        return r02 != null && r02.A03 == r12;
    }

    public String toString() {
        StringBuilder A0o2 = AnonymousClass000.A0o();
        String str = "";
        String str2 = this.A0f;
        if (str2 != null) {
            StringBuilder A0r2 = AnonymousClass000.A0r("id: ");
            A0r2.append(str2);
            str = AnonymousClass000.A0h(" ", A0r2);
        }
        A0o2.append(str);
        A0o2.append("(");
        A0o2.append(this.A0P);
        A0o2.append(", ");
        A0o2.append(this.A0Q);
        A0o2.append(") - (");
        A0o2.append(this.A0O);
        A0o2.append(" x ");
        A0o2.append(this.A09);
        return AnonymousClass000.A0h(")", A0o2);
    }
}
