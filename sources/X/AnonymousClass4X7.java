package X;

import android.util.Pair;
import java.util.HashSet;

/* renamed from: X.4X7  reason: invalid class name */
public final class AnonymousClass4X7 {
    public long A00;
    public AnonymousClass4X7 A01;
    public C87454Wv A02;
    public C93604jT A03 = C93604jT.A03;
    public AnonymousClass4LY A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass4XK A08;
    public final C15070qH A09;
    public final AnonymousClass4GL A0A;
    public final Object A0B;
    public final AnonymousClass5SK[] A0C;
    public final C109525Sm[] A0D;
    public final boolean[] A0E;

    public AnonymousClass4X7(C87454Wv r11, AnonymousClass4XK r12, AnonymousClass4GL r13, AnonymousClass4LY r14, AnonymousClass5RB r15, AnonymousClass5SK[] r16, long j2) {
        AnonymousClass5SK[] r2 = r16;
        this.A0C = r2;
        this.A00 = j2;
        this.A0A = r13;
        this.A08 = r12;
        C30271c3 r6 = r11.A04;
        Object obj = r6.A04;
        this.A0B = obj;
        this.A02 = r11;
        this.A04 = r14;
        int length = r2.length;
        this.A0D = new C109525Sm[length];
        this.A0E = new boolean[length];
        long j3 = r11.A03;
        long j4 = r11.A01;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        C30271c3 A012 = r6.A01(pair.second);
        C96204nx r8 = (C96204nx) r12.A09.get(obj2);
        r12.A0A.add(r8);
        AnonymousClass4JR r4 = (AnonymousClass4JR) r12.A06.get(r8);
        if (r4 != null) {
            AnonymousClass2PW r7 = r4.A01;
            C108315Nm r62 = r4.A00;
            C97294pi r72 = (C97294pi) r7;
            HashSet hashSet = r72.A05;
            boolean isEmpty = hashSet.isEmpty();
            hashSet.add(r62);
            if (isEmpty) {
                r72.A00();
            }
        }
        r8.A04.add(A012);
        C15070qH A052 = r8.A02.A7W(A012, r15, j3);
        r12.A07.put(A052, r8);
        r12.A02();
        if (!(j4 == -9223372036854775807L || j4 == Long.MIN_VALUE)) {
            A052 = new AnonymousClass3E1(A052, j4);
        }
        this.A09 = A052;
    }

    public long A00() {
        if (!this.A07) {
            return this.A02.A03;
        }
        if (this.A06) {
            long AAG = this.A09.AAG();
            if (AAG != Long.MIN_VALUE) {
                return AAG;
            }
        }
        return this.A02.A00;
    }

    public long A01(AnonymousClass4LY r14, boolean[] zArr, long j2, boolean z2) {
        int i2 = 0;
        while (true) {
            boolean z3 = true;
            if (i2 >= r14.A00) {
                break;
            }
            boolean[] zArr2 = this.A0E;
            if (!z2) {
                AnonymousClass4LY r6 = this.A04;
                if (AnonymousClass3C1.A0F(r14.A02[i2], r6.A02[i2]) && AnonymousClass3C1.A0F(r14.A03[i2], r6.A03[i2])) {
                    zArr2[i2] = z3;
                    i2++;
                }
            }
            z3 = false;
            zArr2[i2] = z3;
            i2++;
        }
        C109525Sm[] r7 = this.A0D;
        this.A04 = r14;
        C15070qH r62 = this.A09;
        AnonymousClass5UR[] r8 = r14.A03;
        long AdK = r62.AdK(r7, r8, this.A0E, zArr, j2);
        this.A06 = false;
        for (int i3 = 0; i3 < r7.length; i3++) {
            if (r7[i3] != null) {
                C90524eJ.A04(AnonymousClass000.A1V(r14.A02[i3]));
                this.A06 = true;
            } else {
                C90524eJ.A04(AnonymousClass000.A1W(r8[i3]));
            }
        }
        return AdK;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: int[][][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: X.4LX[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.4LX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: X.4LX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: X.4LX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v160, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v201, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v13, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v228, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v13, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v313, resolved type: int[][]} */
    /* JADX WARNING: type inference failed for: r3v14, types: [X.3Vf] */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0315, code lost:
        if (r27 == 0) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03ec, code lost:
        if (r7.length > 1) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0175, code lost:
        if ((r1 & r31) == 0) goto L_0x0177;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02f6 A[LOOP:8: B:64:0x017a->B:131:0x02f6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x02d6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass4LY A02() {
        /*
            r52 = this;
            r1 = r52
            X.4GL r0 = r1.A0A
            r21 = r0
            X.5SK[] r11 = r1.A0C
            X.4jT r10 = r1.A03
            r0 = r21
            X.3Vj r0 = (X.C65593Vj) r0
            r21 = r0
            int r12 = r11.length
            int r3 = r12 + 1
            int[] r9 = new int[r3]
            X.4jQ[][] r8 = new X.C93574jQ[r3][]
            int[][][] r0 = new int[r3][][]
            r17 = r0
            r13 = 0
            r2 = 0
        L_0x001d:
            if (r2 >= r3) goto L_0x002c
            int r1 = r10.A01
            X.4jQ[] r0 = new X.C93574jQ[r1]
            r8[r2] = r0
            int[][] r0 = new int[r1][]
            r17[r2] = r0
            int r2 = r2 + 1
            goto L_0x001d
        L_0x002c:
            int[] r0 = new int[r12]
            r23 = r0
            r1 = 0
        L_0x0031:
            if (r1 >= r12) goto L_0x0042
            r0 = r11[r1]
            boolean r0 = r0 instanceof X.AnonymousClass3UH
            if (r0 == 0) goto L_0x0040
            r0 = 8
        L_0x003b:
            r23[r1] = r0
            int r1 = r1 + 1
            goto L_0x0031
        L_0x0040:
            r0 = 0
            goto L_0x003b
        L_0x0042:
            r14 = 0
        L_0x0043:
            int r0 = r10.A01
            if (r14 >= r0) goto L_0x00bc
            X.4jQ[] r0 = r10.A02
            r7 = r0[r14]
            X.1gT[] r0 = r7.A02
            r0 = r0[r13]
            java.lang.String r0 = r0.A0T
            int r1 = X.C90834eu.A00(r0)
            r0 = 5
            boolean r16 = X.AnonymousClass000.A1R(r1, r0)
            r6 = r12
            r5 = 0
            r4 = 0
            r15 = 1
        L_0x005e:
            if (r5 >= r12) goto L_0x008f
            r3 = r11[r5]
            r2 = 0
            r1 = 0
        L_0x0064:
            int r0 = r7.A01
            if (r2 >= r0) goto L_0x0079
            X.1gT[] r0 = r7.A02
            r0 = r0[r2]
            int r0 = r3.AgX(r0)
            r0 = r0 & 7
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + 1
            goto L_0x0064
        L_0x0079:
            r0 = r9[r5]
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r1 > r4) goto L_0x0089
            if (r1 != r4) goto L_0x008c
            if (r16 == 0) goto L_0x008c
            if (r15 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
        L_0x0089:
            r6 = r5
            r15 = r0
            r4 = r1
        L_0x008c:
            int r5 = r5 + 1
            goto L_0x005e
        L_0x008f:
            if (r6 != r12) goto L_0x00a6
            int r0 = r7.A01
            int[] r4 = new int[r0]
        L_0x0095:
            r1 = r9[r6]
            r0 = r8[r6]
            r0[r1] = r7
            r0 = r17[r6]
            r0[r1] = r4
            int r0 = r1 + 1
            r9[r6] = r0
            int r14 = r14 + 1
            goto L_0x0043
        L_0x00a6:
            r3 = r11[r6]
            int r2 = r7.A01
            int[] r4 = new int[r2]
            r1 = 0
        L_0x00ad:
            if (r1 >= r2) goto L_0x0095
            X.1gT[] r0 = r7.A02
            r0 = r0[r1]
            int r0 = r3.AgX(r0)
            r4[r1] = r0
            int r1 = r1 + 1
            goto L_0x00ad
        L_0x00bc:
            X.4jT[] r5 = new X.C93604jT[r12]
            java.lang.String[] r4 = new java.lang.String[r12]
            int[] r3 = new int[r12]
        L_0x00c2:
            if (r13 >= r12) goto L_0x0100
            r6 = r9[r13]
            r2 = r8[r13]
            int r1 = r2.length
            r0 = 0
            if (r6 > r1) goto L_0x00cd
            r0 = 1
        L_0x00cd:
            X.C90524eJ.A03(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r6)
            X.4jQ[] r1 = (X.C93574jQ[]) r1
            X.4jT r0 = new X.4jT
            r0.<init>((X.C93574jQ[]) r1)
            r5[r13] = r0
            r2 = r17[r13]
            int r1 = r2.length
            r0 = 0
            if (r6 > r1) goto L_0x00e4
            r0 = 1
        L_0x00e4:
            X.C90524eJ.A03(r0)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r6)
            r17[r13] = r0
            r0 = r11[r13]
            java.lang.String r0 = r0.getName()
            r4[r13] = r0
            r0 = r11[r13]
            X.4o1 r0 = (X.C96244o1) r0
            int r0 = r0.A09
            r3[r13] = r0
            int r13 = r13 + 1
            goto L_0x00c2
        L_0x0100:
            r6 = r9[r12]
            r2 = r8[r12]
            int r1 = r2.length
            r0 = 0
            if (r6 > r1) goto L_0x0109
            r0 = 1
        L_0x0109:
            X.C90524eJ.A03(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r6)
            X.4jQ[] r1 = (X.C93574jQ[]) r1
            X.4jT r0 = new X.4jT
            r0.<init>((X.C93574jQ[]) r1)
            X.4S2 r9 = new X.4S2
            r10 = r0
            r11 = r3
            r12 = r23
            r13 = r5
            r14 = r4
            r15 = r17
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0 = r21
            java.util.concurrent.atomic.AtomicReference r0 = r0.A02
            java.lang.Object r25 = r0.get()
            r0 = r25
            X.3Vi r0 = (X.C65583Vi) r0
            r25 = r0
            int r0 = r9.A00
            r51 = r0
            X.4LX[] r0 = new X.AnonymousClass4LX[r0]
            r22 = r0
            r8 = 0
            r1 = 0
            r7 = 0
            r27 = 0
        L_0x013f:
            r6 = 2
            r5 = 1
            r0 = r51
            if (r7 >= r0) goto L_0x02fa
            int[] r0 = r9.A03
            r0 = r0[r7]
            if (r6 != r0) goto L_0x02ef
            if (r1 != 0) goto L_0x02e4
            X.4jT[] r0 = r9.A04
            r4 = r0[r7]
            r20 = r17[r7]
            r1 = r23[r7]
            r0 = r25
            boolean r0 = r0.A0P
            if (r0 != 0) goto L_0x024f
            r0 = r25
            boolean r0 = r0.A0Q
            if (r0 != 0) goto L_0x024f
            r0 = r25
            boolean r0 = r0.A0L
            r31 = 16
            if (r0 == 0) goto L_0x016b
            r31 = 24
        L_0x016b:
            r0 = r25
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0177
            r1 = r1 & r31
            r19 = 1
            if (r1 != 0) goto L_0x0179
        L_0x0177:
            r19 = 0
        L_0x0179:
            r3 = 0
        L_0x017a:
            int r0 = r4.A01
            if (r3 >= r0) goto L_0x024f
            X.4jQ[] r0 = r4.A02
            r2 = r0[r3]
            r18 = r20[r3]
            r0 = r25
            int r0 = r0.A05
            r32 = r0
            r0 = r25
            int r0 = r0.A04
            r33 = r0
            r0 = r25
            int r0 = r0.A03
            r34 = r0
            r0 = r25
            int r0 = r0.A02
            r35 = r0
            r0 = r25
            int r0 = r0.A09
            r36 = r0
            r0 = r25
            int r0 = r0.A08
            r37 = r0
            r0 = r25
            int r0 = r0.A07
            r26 = r0
            r0 = r25
            int r0 = r0.A06
            r24 = r0
            r0 = r25
            int r1 = r0.A0B
            int r10 = r0.A0A
            boolean r11 = r0.A0S
            int r0 = r2.A01
            if (r0 < r6) goto L_0x02f3
            java.util.List r1 = X.C65593Vj.A01(r2, r1, r10, r11)
            int r0 = r1.size()
            if (r0 < r6) goto L_0x02f3
            r40 = 0
            if (r19 != 0) goto L_0x021d
            java.util.HashSet r16 = X.C13680ns.A0o()
            r15 = 0
            r11 = 0
        L_0x01d4:
            int r0 = r1.size()
            if (r11 >= r0) goto L_0x021d
            java.lang.Object r0 = r1.get(r11)
            int r0 = X.AnonymousClass000.A0D(r0)
            X.1gT[] r12 = r2.A02
            r0 = r12[r0]
            java.lang.String r14 = r0.A0T
            r0 = r16
            boolean r0 = r0.add(r14)
            if (r0 == 0) goto L_0x021a
            r10 = 0
            r0 = 0
        L_0x01f2:
            int r13 = r1.size()
            if (r10 >= r13) goto L_0x0215
            java.lang.Object r13 = r1.get(r10)
            int r13 = X.AnonymousClass000.A0D(r13)
            r28 = r12[r13]
            r30 = r18[r13]
            r29 = r14
            r38 = r26
            r39 = r24
            boolean r13 = X.C65593Vj.A02(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            if (r13 == 0) goto L_0x0212
            int r0 = r0 + 1
        L_0x0212:
            int r10 = r10 + 1
            goto L_0x01f2
        L_0x0215:
            if (r0 <= r15) goto L_0x021a
            r15 = r0
            r40 = r14
        L_0x021a:
            int r11 = r11 + 1
            goto L_0x01d4
        L_0x021d:
            int r0 = r1.size()
        L_0x0221:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x02c9
            java.lang.Object r10 = r1.get(r0)
            int r11 = X.AnonymousClass000.A0D(r10)
            X.1gT[] r10 = r2.A02
            r39 = r10[r11]
            r41 = r18[r11]
            r43 = r32
            r44 = r33
            r45 = r34
            r46 = r35
            r47 = r36
            r48 = r37
            r49 = r26
            r50 = r24
            r42 = r31
            boolean r10 = X.C65593Vj.A02(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            if (r10 != 0) goto L_0x0221
            r1.remove(r0)
            goto L_0x0221
        L_0x024f:
            r3 = 0
            r19 = -1
            r18 = r3
            r10 = r3
            r6 = 0
        L_0x0256:
            int r0 = r4.A01
            if (r6 >= r0) goto L_0x02ba
            X.4jQ[] r0 = r4.A02
            r2 = r0[r6]
            r0 = r25
            int r1 = r0.A0B
            int r11 = r0.A0A
            boolean r0 = r0.A0S
            java.util.List r13 = X.C65593Vj.A01(r2, r1, r11, r0)
            r16 = r20[r6]
            r12 = 0
        L_0x026d:
            int r0 = r2.A01
            if (r12 >= r0) goto L_0x02b7
            X.1gT[] r0 = r2.A02
            r14 = r0[r12]
            int r0 = r14.A0D
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 != 0) goto L_0x02a6
            r1 = r16[r12]
            r0 = r25
            boolean r11 = r0.A0N
            r1 = r1 & 7
            r0 = 4
            if (r1 == r0) goto L_0x028b
            if (r11 == 0) goto L_0x02a6
            r0 = 3
            if (r1 != r0) goto L_0x02a6
        L_0x028b:
            X.54z r11 = new X.54z
            r15 = r16[r12]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            boolean r1 = r13.contains(r0)
            r0 = r25
            r11.<init>(r14, r0, r15, r1)
            boolean r0 = r11.A04
            if (r0 != 0) goto L_0x02a9
            r0 = r25
            boolean r0 = r0.A0O
            if (r0 != 0) goto L_0x02a9
        L_0x02a6:
            int r12 = r12 + 1
            goto L_0x026d
        L_0x02a9:
            if (r10 == 0) goto L_0x02b1
            int r0 = r11.compareTo(r10)
            if (r0 <= 0) goto L_0x02a6
        L_0x02b1:
            r18 = r2
            r19 = r12
            r10 = r11
            goto L_0x02a6
        L_0x02b7:
            int r6 = r6 + 1
            goto L_0x0256
        L_0x02ba:
            if (r18 == 0) goto L_0x02dc
            int[] r2 = new int[r5]
            r2[r8] = r19
            r1 = 0
            X.4LX r3 = new X.4LX
            r0 = r18
            r3.<init>(r0, r1, r2, r8)
            goto L_0x02dc
        L_0x02c9:
            int r0 = r1.size()
            if (r0 < r6) goto L_0x02f3
            int[] r1 = X.AnonymousClass45T.A00(r1)
        L_0x02d3:
            int r0 = r1.length
            if (r0 <= 0) goto L_0x02f6
            r0 = 0
            X.4LX r3 = new X.4LX
            r3.<init>(r2, r0, r1, r8)
        L_0x02dc:
            r22[r7] = r3
            r0 = r22[r7]
            boolean r1 = X.AnonymousClass000.A1V(r0)
        L_0x02e4:
            X.4jT[] r0 = r9.A04
            r0 = r0[r7]
            int r0 = r0.A01
            if (r0 > 0) goto L_0x02ed
            r5 = 0
        L_0x02ed:
            r27 = r27 | r5
        L_0x02ef:
            int r7 = r7 + 1
            goto L_0x013f
        L_0x02f3:
            int[] r1 = X.C65593Vj.A05
            goto L_0x02d3
        L_0x02f6:
            int r3 = r3 + 1
            goto L_0x017a
        L_0x02fa:
            r3 = -1
            r2 = 0
            r16 = r2
            r28 = r2
            r26 = -1
            r1 = 0
        L_0x0303:
            r0 = r51
            if (r1 >= r0) goto L_0x043a
            int[] r0 = r9.A03
            r0 = r0[r1]
            if (r5 != r0) goto L_0x0435
            r0 = r25
            boolean r0 = r0.A0J
            if (r0 != 0) goto L_0x0317
            r19 = 0
            if (r27 != 0) goto L_0x0319
        L_0x0317:
            r19 = 1
        L_0x0319:
            X.4jT[] r0 = r9.A04
            r11 = r0[r1]
            r18 = r17[r1]
            r24 = r2
            r10 = 0
            r6 = -1
            r5 = -1
        L_0x0324:
            int r0 = r11.A01
            if (r10 >= r0) goto L_0x036f
            X.4jQ[] r0 = r11.A02
            r7 = r0[r10]
            r15 = r18[r10]
            r4 = 0
        L_0x032f:
            int r0 = r7.A01
            if (r4 >= r0) goto L_0x036c
            r12 = r15[r4]
            r0 = r25
            boolean r13 = r0.A0N
            r12 = r12 & 7
            r0 = 4
            if (r12 == r0) goto L_0x0343
            if (r13 == 0) goto L_0x035a
            r0 = 3
            if (r12 != r0) goto L_0x035a
        L_0x0343:
            X.1gT[] r0 = r7.A02
            r14 = r0[r4]
            X.551 r12 = new X.551
            r13 = r15[r4]
            r0 = r25
            r12.<init>(r14, r0, r13)
            boolean r0 = r12.A0C
            if (r0 != 0) goto L_0x035d
            r0 = r25
            boolean r0 = r0.A0M
            if (r0 != 0) goto L_0x035d
        L_0x035a:
            int r4 = r4 + 1
            goto L_0x032f
        L_0x035d:
            if (r24 == 0) goto L_0x0367
            r0 = r24
            int r0 = r12.compareTo(r0)
            if (r0 <= 0) goto L_0x035a
        L_0x0367:
            r6 = r10
            r5 = r4
            r24 = r12
            goto L_0x035a
        L_0x036c:
            int r10 = r10 + 1
            goto L_0x0324
        L_0x036f:
            if (r6 == r3) goto L_0x0435
            X.4jQ[] r0 = r11.A02
            r4 = r0[r6]
            r0 = r25
            boolean r0 = r0.A0P
            if (r0 != 0) goto L_0x03ef
            r0 = r25
            boolean r0 = r0.A0Q
            if (r0 != 0) goto L_0x03ef
            if (r19 == 0) goto L_0x03ef
            r23 = r18[r6]
            r0 = r25
            int r0 = r0.A00
            r29 = r0
            r0 = r25
            boolean r0 = r0.A0H
            r20 = r0
            r0 = r25
            boolean r0 = r0.A0I
            r19 = r0
            r0 = r25
            boolean r0 = r0.A0G
            r18 = r0
            X.1gT[] r14 = r4.A02
            r13 = r14[r5]
            int r12 = r4.A01
            int[] r11 = new int[r12]
            r10 = 0
            r7 = 0
        L_0x03a7:
            if (r10 >= r12) goto L_0x03e6
            if (r10 == r5) goto L_0x03de
            r6 = r14[r10]
            r0 = r23[r10]
            r15 = r0 & 7
            r0 = 4
            if (r15 != r0) goto L_0x03e3
            int r15 = r6.A05
            if (r15 == r3) goto L_0x03e3
            r0 = r29
            if (r15 > r0) goto L_0x03e3
            if (r18 != 0) goto L_0x03c6
            int r15 = r6.A06
            if (r15 == r3) goto L_0x03e3
            int r0 = r13.A06
            if (r15 != r0) goto L_0x03e3
        L_0x03c6:
            if (r20 != 0) goto L_0x03d4
            java.lang.String r15 = r6.A0T
            if (r15 == 0) goto L_0x03e3
            java.lang.String r0 = r13.A0T
            boolean r0 = android.text.TextUtils.equals(r15, r0)
            if (r0 == 0) goto L_0x03e3
        L_0x03d4:
            if (r19 != 0) goto L_0x03de
            int r6 = r6.A0F
            if (r6 == r3) goto L_0x03e3
            int r0 = r13.A0F
            if (r6 != r0) goto L_0x03e3
        L_0x03de:
            int r0 = r7 + 1
            r11[r7] = r10
            r7 = r0
        L_0x03e3:
            int r10 = r10 + 1
            goto L_0x03a7
        L_0x03e6:
            int[] r7 = java.util.Arrays.copyOf(r11, r7)
            int r6 = r7.length
            r0 = 1
            if (r6 <= r0) goto L_0x03ef
            goto L_0x03f4
        L_0x03ef:
            r0 = 1
            int[] r7 = new int[r0]
            r7[r8] = r5
        L_0x03f4:
            X.4LX r5 = new X.4LX
            r5.<init>(r4, r2, r7, r8)
            r0 = r24
            android.util.Pair r4 = android.util.Pair.create(r5, r0)
            if (r4 == 0) goto L_0x0435
            if (r16 == 0) goto L_0x040f
            java.lang.Object r5 = r4.second
            X.551 r5 = (X.AnonymousClass551) r5
            r0 = r16
            int r0 = r5.compareTo(r0)
            if (r0 <= 0) goto L_0x0435
        L_0x040f:
            r0 = r26
            if (r0 == r3) goto L_0x0415
            r22[r26] = r2
        L_0x0415:
            java.lang.Object r0 = r4.first
            X.4LX r0 = (X.AnonymousClass4LX) r0
            r22[r1] = r0
            X.4jQ r6 = r0.A01
            int[] r0 = r0.A03
            r5 = r0[r8]
            X.1gT[] r0 = r6.A02
            r0 = r0[r5]
            java.lang.String r0 = r0.A0S
            r28 = r0
            java.lang.Object r0 = r4.second
            r16 = r0
            r0 = r16
            X.551 r0 = (X.AnonymousClass551) r0
            r16 = r0
            r26 = r1
        L_0x0435:
            int r1 = r1 + 1
            r5 = 1
            goto L_0x0303
        L_0x043a:
            r16 = r2
            r24 = -1
        L_0x043e:
            r0 = r51
            if (r8 >= r0) goto L_0x0544
            int[] r0 = r9.A03
            r4 = r0[r8]
            if (r4 == r5) goto L_0x0540
            r0 = 2
            if (r4 == r0) goto L_0x0540
            r1 = 3
            X.4jT[] r0 = r9.A04
            r13 = r0[r8]
            r23 = r17[r8]
            if (r4 == r1) goto L_0x04ad
            r12 = 0
            r11 = 0
            r20 = r2
            r14 = r2
            r10 = 0
            r19 = 0
        L_0x045c:
            int r0 = r13.A01
            if (r10 >= r0) goto L_0x0531
            X.4jQ[] r0 = r13.A02
            r7 = r0[r10]
            r18 = r23[r10]
            r6 = 0
        L_0x0467:
            int r0 = r7.A01
            if (r6 >= r0) goto L_0x04aa
            r1 = r18[r6]
            r0 = r25
            boolean r4 = r0.A0N
            r1 = r1 & 7
            r0 = 4
            if (r1 == r0) goto L_0x047b
            if (r4 == 0) goto L_0x04a7
            r0 = 3
            if (r1 != r0) goto L_0x04a7
        L_0x047b:
            X.1gT[] r0 = r7.A02
            r1 = r0[r6]
            X.54x r15 = new X.54x
            r0 = r18[r6]
            r15.<init>(r1, r0)
            if (r14 == 0) goto L_0x04a2
            X.4ep r4 = X.C90794ep.start()
            boolean r1 = r15.A01
            boolean r0 = r14.A01
            X.4ep r4 = r4.compareFalseFirst(r1, r0)
            boolean r1 = r15.A00
            boolean r0 = r14.A00
            X.4ep r0 = r4.compareFalseFirst(r1, r0)
            int r0 = r0.result()
            if (r0 <= 0) goto L_0x04a7
        L_0x04a2:
            r20 = r7
            r19 = r6
            r14 = r15
        L_0x04a7:
            int r6 = r6 + 1
            goto L_0x0467
        L_0x04aa:
            int r10 = r10 + 1
            goto L_0x045c
        L_0x04ad:
            r12 = 0
            r20 = -1
            r19 = r2
            r11 = r2
            r14 = 0
        L_0x04b4:
            int r0 = r13.A01
            if (r14 >= r0) goto L_0x04f9
            X.4jQ[] r0 = r13.A02
            r10 = r0[r14]
            r18 = r23[r14]
            r7 = 0
        L_0x04bf:
            int r0 = r10.A01
            if (r7 >= r0) goto L_0x04f6
            r1 = r18[r7]
            r0 = r25
            boolean r4 = r0.A0N
            r1 = r1 & 7
            r0 = 4
            if (r1 == r0) goto L_0x04d3
            if (r4 == 0) goto L_0x04f3
            r0 = 3
            if (r1 != r0) goto L_0x04f3
        L_0x04d3:
            X.1gT[] r0 = r10.A02
            r15 = r0[r7]
            X.550 r6 = new X.550
            r4 = r18[r7]
            r1 = r25
            r0 = r28
            r6.<init>(r15, r1, r0, r4)
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x04f3
            if (r11 == 0) goto L_0x04ee
            int r0 = r6.compareTo(r11)
            if (r0 <= 0) goto L_0x04f3
        L_0x04ee:
            r19 = r10
            r20 = r7
            r11 = r6
        L_0x04f3:
            int r7 = r7 + 1
            goto L_0x04bf
        L_0x04f6:
            int r14 = r14 + 1
            goto L_0x04b4
        L_0x04f9:
            if (r19 == 0) goto L_0x0540
            int[] r4 = new int[r5]
            r4[r12] = r20
            X.4LX r1 = new X.4LX
            r0 = r19
            r1.<init>(r0, r2, r4, r12)
            android.util.Pair r4 = android.util.Pair.create(r1, r11)
            if (r4 == 0) goto L_0x0540
            if (r16 == 0) goto L_0x051a
            java.lang.Object r1 = r4.second
            X.550 r1 = (X.AnonymousClass550) r1
            r0 = r16
            int r0 = r1.compareTo(r0)
            if (r0 <= 0) goto L_0x0540
        L_0x051a:
            r0 = r24
            if (r0 == r3) goto L_0x0520
            r22[r24] = r2
        L_0x0520:
            java.lang.Object r0 = r4.first
            r22[r8] = r0
            java.lang.Object r0 = r4.second
            r16 = r0
            r0 = r16
            X.550 r0 = (X.AnonymousClass550) r0
            r16 = r0
            r24 = r8
            goto L_0x0540
        L_0x0531:
            if (r20 == 0) goto L_0x053e
            int[] r1 = new int[r5]
            r1[r11] = r19
            X.4LX r12 = new X.4LX
            r0 = r20
            r12.<init>(r0, r2, r1, r11)
        L_0x053e:
            r22[r8] = r12
        L_0x0540:
            int r8 = r8 + 1
            goto L_0x043e
        L_0x0544:
            r4 = 0
        L_0x0545:
            r12 = 0
            r0 = r51
            if (r4 >= r0) goto L_0x0594
            r0 = r25
            android.util.SparseBooleanArray r0 = r0.A0D
            boolean r0 = r0.get(r4)
            if (r0 != 0) goto L_0x058f
            X.4jT[] r0 = r9.A04
            r2 = r0[r4]
            r0 = r25
            android.util.SparseArray r1 = r0.A0C
            java.lang.Object r0 = r1.get(r4)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0591
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0591
            java.lang.Object r0 = r1.get(r4)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x058f
            java.lang.Object r5 = r0.get(r2)
            X.4jW r5 = (X.C93634jW) r5
            if (r5 == 0) goto L_0x058f
            int r1 = r5.A01
            X.4jQ[] r0 = r2.A02
            r3 = r0[r1]
            int[] r2 = r5.A04
            int r1 = r5.A03
            int r0 = r5.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.4LX r12 = new X.4LX
            r12.<init>(r3, r0, r2, r1)
        L_0x058f:
            r22[r4] = r12
        L_0x0591:
            int r4 = r4 + 1
            goto L_0x0545
        L_0x0594:
            r0 = r21
            X.5LR r0 = r0.A01
            r26 = r0
            r0 = r21
            X.5LX r0 = r0.A01
            r29 = r0
            r0 = r26
            X.4qA r0 = (X.C97544qA) r0
            r26 = r0
            java.util.ArrayList r11 = X.AnonymousClass000.A0u()
            r10 = 0
            r4 = 0
        L_0x05ac:
            r0 = 0
            r8 = 1
            r2 = r51
            if (r4 >= r2) goto L_0x05d2
            r2 = r22[r4]
            if (r2 == 0) goto L_0x05d0
            r2 = r22[r4]
            int[] r2 = r2.A03
            int r2 = r2.length
            if (r2 <= r8) goto L_0x05d0
            X.3cL r3 = X.C34641kb.builder()
            X.4TH r2 = new X.4TH
            r2.<init>(r0, r0)
            r3.add((java.lang.Object) r2)
        L_0x05ca:
            r11.add(r3)
            int r4 = r4 + 1
            goto L_0x05ac
        L_0x05d0:
            r3 = 0
            goto L_0x05ca
        L_0x05d2:
            long[][] r13 = new long[r2][]
            r2 = 0
        L_0x05d5:
            r0 = r51
            if (r2 >= r0) goto L_0x0609
            r4 = r22[r2]
            if (r4 != 0) goto L_0x05e4
            long[] r0 = new long[r10]
            r13[r2] = r0
        L_0x05e1:
            int r2 = r2 + 1
            goto L_0x05d5
        L_0x05e4:
            int[] r0 = r4.A03
            int r0 = r0.length
            long[] r0 = new long[r0]
            r13[r2] = r0
            r3 = 0
        L_0x05ec:
            int[] r1 = r4.A03
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0603
            r5 = r13[r2]
            X.4jQ r0 = r4.A01
            r1 = r1[r3]
            X.1gT[] r0 = r0.A02
            r0 = r0[r1]
            int r0 = r0.A05
            long r0 = (long) r0
            r5[r3] = r0
            int r3 = r3 + 1
            goto L_0x05ec
        L_0x0603:
            r0 = r13[r2]
            java.util.Arrays.sort(r0)
            goto L_0x05e1
        L_0x0609:
            int[] r14 = new int[r0]
            long[] r7 = new long[r0]
            r2 = 0
        L_0x060e:
            r0 = r51
            if (r2 >= r0) goto L_0x0623
            r0 = r13[r2]
            int r0 = r0.length
            if (r0 != 0) goto L_0x061e
            r0 = 0
        L_0x0619:
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x060e
        L_0x061e:
            r0 = r13[r2]
            r0 = r0[r10]
            goto L_0x0619
        L_0x0623:
            X.C65563Vg.A00(r11, r7)
            X.4VN r0 = X.C90244dp.treeKeys()
            X.3cj r0 = r0.arrayListValues()
            X.5Ue r6 = r0.build()
            r5 = 0
        L_0x0633:
            r0 = r51
            if (r5 >= r0) goto L_0x0692
            r0 = r13[r5]
            int r0 = r0.length
            if (r0 <= r8) goto L_0x068f
            r0 = r13[r5]
            int r4 = r0.length
            double[] r3 = new double[r4]
            r2 = 0
        L_0x0642:
            r0 = r13[r5]
            int r0 = r0.length
            r23 = 0
            if (r2 >= r0) goto L_0x0661
            r0 = r13[r5]
            r18 = r0[r2]
            r15 = -1
            int r0 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x065c
            r0 = r13[r5]
            r0 = r0[r2]
            double r15 = (double) r0
            double r23 = java.lang.Math.log(r15)
        L_0x065c:
            r3[r2] = r23
            int r2 = r2 + 1
            goto L_0x0642
        L_0x0661:
            int r4 = r4 + -1
            r20 = r3[r4]
            r0 = r3[r10]
            double r20 = r20 - r0
            r2 = 0
        L_0x066a:
            if (r2 >= r4) goto L_0x068f
            r18 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r15 = r3[r2]
            int r2 = r2 + 1
            r0 = r3[r2]
            double r15 = r15 + r0
            double r15 = r15 * r18
            int r0 = (r20 > r23 ? 1 : (r20 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x0689
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x067d:
            java.lang.Double r1 = java.lang.Double.valueOf(r15)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r6.put(r1, r0)
            goto L_0x066a
        L_0x0689:
            r0 = r3[r10]
            double r15 = r15 - r0
            double r15 = r15 / r20
            goto L_0x067d
        L_0x068f:
            int r5 = r5 + 1
            goto L_0x0633
        L_0x0692:
            java.util.Collection r0 = r6.values()
            X.1kb r3 = X.C34641kb.copyOf((java.util.Collection) r0)
            r2 = 0
        L_0x069b:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x06bb
            java.lang.Object r0 = r3.get(r2)
            int r4 = X.AnonymousClass000.A0D(r0)
            r0 = r14[r4]
            int r1 = r0 + 1
            r14[r4] = r1
            r0 = r13[r4]
            r0 = r0[r1]
            r7[r4] = r0
            X.C65563Vg.A00(r11, r7)
            int r2 = r2 + 1
            goto L_0x069b
        L_0x06bb:
            r4 = 0
        L_0x06bc:
            r0 = r51
            if (r4 >= r0) goto L_0x06d0
            java.lang.Object r0 = r11.get(r4)
            if (r0 == 0) goto L_0x06cd
            r2 = r7[r4]
            r0 = 2
            long r2 = r2 * r0
            r7[r4] = r2
        L_0x06cd:
            int r4 = r4 + 1
            goto L_0x06bc
        L_0x06d0:
            X.C65563Vg.A00(r11, r7)
            X.3cL r1 = X.C34641kb.builder()
        L_0x06d7:
            int r0 = r11.size()
            if (r10 >= r0) goto L_0x06f4
            java.lang.Object r0 = r11.get(r10)
            X.3cL r0 = (X.C67763cL) r0
            if (r0 != 0) goto L_0x06ef
            X.1kb r0 = X.C34641kb.of()
        L_0x06e9:
            r1.add((java.lang.Object) r0)
            int r10 = r10 + 1
            goto L_0x06d7
        L_0x06ef:
            X.1kb r0 = r0.build()
            goto L_0x06e9
        L_0x06f4:
            X.1kb r5 = r1.build()
            r0 = r51
            X.5UR[] r2 = new X.AnonymousClass5UR[r0]
            r10 = 0
            r6 = 0
        L_0x06fe:
            r0 = r51
            if (r6 >= r0) goto L_0x0738
            r3 = r22[r6]
            if (r3 == 0) goto L_0x071b
            int[] r7 = r3.A03
            int r0 = r7.length
            if (r0 == 0) goto L_0x071b
            int r0 = r7.length
            X.4jQ r4 = r3.A01
            if (r0 != r8) goto L_0x071e
            r1 = r7[r10]
            java.lang.Object r0 = r3.A02
            X.3Vf r3 = new X.3Vf
            r3.<init>(r4, r0, r1)
        L_0x0719:
            r2[r6] = r3
        L_0x071b:
            int r6 = r6 + 1
            goto L_0x06fe
        L_0x071e:
            java.lang.Object r1 = r5.get(r6)
            X.1kb r1 = (X.C34641kb) r1
            r0 = r26
            X.5TU r0 = r0.A00
            X.3Vg r3 = new X.3Vg
            r27 = r3
            r28 = r4
            r30 = r0
            r31 = r1
            r32 = r7
            r27.<init>(r28, r29, r30, r31, r32)
            goto L_0x0719
        L_0x0738:
            X.4bE[] r5 = new X.C88874bE[r0]
            r3 = 0
        L_0x073b:
            r0 = r51
            if (r3 >= r0) goto L_0x075d
            r0 = r25
            android.util.SparseBooleanArray r0 = r0.A0D
            boolean r0 = r0.get(r3)
            if (r0 != 0) goto L_0x075b
            int[] r0 = r9.A03
            r1 = r0[r3]
            r0 = 7
            if (r1 == r0) goto L_0x0754
            r0 = r2[r3]
            if (r0 == 0) goto L_0x075b
        L_0x0754:
            X.4bE r0 = X.C88874bE.A01
        L_0x0756:
            r5[r3] = r0
            int r3 = r3 + 1
            goto L_0x073b
        L_0x075b:
            r0 = r12
            goto L_0x0756
        L_0x075d:
            r0 = r25
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x07ca
            r16 = 0
            r11 = -1
            r12 = 0
            r10 = -1
            r7 = -1
        L_0x0769:
            r0 = r51
            if (r12 >= r0) goto L_0x07b4
            int[] r0 = r9.A03
            r13 = r0[r12]
            r6 = r2[r12]
            if (r13 == r8) goto L_0x0778
            r0 = 2
            if (r13 != r0) goto L_0x07ad
        L_0x0778:
            if (r6 == 0) goto L_0x07ad
            r15 = r17[r12]
            X.4jT[] r0 = r9.A04
            r3 = r0[r12]
            X.4qB r6 = (X.C97554qB) r6
            X.4jQ r1 = r6.A02
            r4 = 0
        L_0x0785:
            int r0 = r3.A01
            if (r4 >= r0) goto L_0x0792
            X.4jQ[] r0 = r3.A02
            r0 = r0[r4]
            if (r0 == r1) goto L_0x0793
            int r4 = r4 + 1
            goto L_0x0785
        L_0x0792:
            r4 = -1
        L_0x0793:
            r3 = 0
        L_0x0794:
            int[] r14 = r6.A03
            int r0 = r14.length
            if (r3 >= r0) goto L_0x07a8
            r1 = r15[r4]
            r0 = r14[r3]
            r0 = r1[r0]
            r1 = r0 & 32
            r0 = 32
            if (r1 != r0) goto L_0x07ad
            int r3 = r3 + 1
            goto L_0x0794
        L_0x07a8:
            if (r13 != r8) goto L_0x07b0
            if (r7 != r11) goto L_0x07b6
            r7 = r12
        L_0x07ad:
            int r12 = r12 + 1
            goto L_0x0769
        L_0x07b0:
            if (r10 != r11) goto L_0x07b6
            r10 = r12
            goto L_0x07ad
        L_0x07b4:
            r0 = 1
            goto L_0x07b7
        L_0x07b6:
            r0 = 0
        L_0x07b7:
            if (r7 == r11) goto L_0x07bd
            if (r10 == r11) goto L_0x07bd
            r16 = 1
        L_0x07bd:
            r0 = r0 & r16
            if (r0 == 0) goto L_0x07ca
            X.4bE r0 = new X.4bE
            r0.<init>(r8)
            r5[r7] = r0
            r5[r10] = r0
        L_0x07ca:
            android.util.Pair r0 = android.util.Pair.create(r5, r2)
            java.lang.Object r1 = r0.first
            X.4bE[] r1 = (X.C88874bE[]) r1
            java.lang.Object r0 = r0.second
            X.5UR[] r0 = (X.AnonymousClass5UR[]) r0
            X.4LY r2 = new X.4LY
            r2.<init>(r9, r1, r0)
            X.5UR[] r0 = r2.A03
            int r1 = r0.length
            r0 = 0
        L_0x07df:
            if (r0 >= r1) goto L_0x07e4
            int r0 = r0 + 1
            goto L_0x07df
        L_0x07e4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4X7.A02():X.4LY");
    }

    public void A03() {
        long j2 = this.A02.A01;
        AnonymousClass4XK r6 = this.A08;
        C15070qH r5 = this.A09;
        if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
            r6.A06(r5);
            return;
        }
        try {
            r6.A06(((AnonymousClass3E1) r5).A04);
        } catch (RuntimeException e2) {
            C89504cL.A01("MediaPeriodHolder", "Period release failed.", e2);
        }
    }
}
