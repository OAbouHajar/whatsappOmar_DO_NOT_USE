package X;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.4rS  reason: invalid class name and case insensitive filesystem */
public final class C98324rS implements C32591gd {
    public static final Unsafe A0F = C90904f2.A03();
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass45F A03;
    public final C88834bA A04;
    public final AnonymousClass5O2 A05;
    public final AnonymousClass5UZ A06;
    public final C107885Lu A07;
    public final AnonymousClass45G A08;
    public final boolean A09;
    public final int[] A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final int[] A0D;
    public final Object[] A0E;

    public C98324rS(AnonymousClass45F r1, C88834bA r2, AnonymousClass5O2 r3, AnonymousClass5UZ r4, C107885Lu r5, AnonymousClass45G r6, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, Object[] objArr, int i2, int i3, int i4, boolean z2) {
        this.A0A = iArr;
        this.A0E = objArr;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A09 = z2;
        this.A0B = iArr2;
        this.A0C = iArr3;
        this.A0D = iArr4;
        this.A07 = r5;
        this.A04 = r2;
        this.A08 = r6;
        this.A03 = r1;
        this.A06 = r4;
        this.A05 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C84184Jo r6, X.C32591gd r7, byte[] r8, int r9, int r10) {
        /*
            int r4 = r9 + 1
            r3 = r8
            byte r5 = r8[r9]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = X.C90724eh.A04(r6, r8, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x0022
        L_0x0010:
            int r10 = r10 - r4
            if (r5 > r10) goto L_0x0022
            r0 = r7
            java.lang.Object r2 = r7.ALj()
            int r5 = r5 + r4
            r0.Aiw(r1, r2, r3, r4, r5)
            r7.AjE(r2)
            r6.A02 = r2
            return r5
        L_0x0022:
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.40G r0 = new X.40G
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98324rS.A00(X.4Jo, X.1gd, byte[], int, int):int");
    }

    public static int A01(C84184Jo r2, C32591gd r3, byte[] bArr, int i2, int i3, int i4) {
        C98324rS r1 = (C98324rS) r3;
        Object ALj = r1.ALj();
        int A082 = r1.A08(r2, ALj, bArr, i2, i3, i4);
        r1.AjE(ALj);
        r2.A02 = ALj;
        return A082;
    }

    public static int A02(C84184Jo r5, byte[] bArr, int i2) {
        int A012 = C90724eh.A01(r5, bArr, i2);
        int i3 = r5.A00;
        if (i3 == 0) {
            r5.A02 = "";
            return A012;
        }
        int i4 = A012 + i3;
        if (C90324dx.A00.A02(bArr, A012, i4) == 0) {
            r5.A02 = new String(bArr, A012, i3, AnonymousClass4ZB.A03);
            return i4;
        }
        throw new AnonymousClass40G("Protocol message had invalid UTF-8.");
    }

    public static int A03(List list) {
        return list.size();
    }

    public static Object A04(Object obj, int i2) {
        return C90904f2.A01(obj, (long) (i2 & 1048575));
    }

    public static List A05(int i2, Object obj) {
        return (List) C90904f2.A01(obj, (long) (i2 & 1048575));
    }

    public static void A06(C98344rU r2, C32591gd r3, Object obj, int i2) {
        C32561ga r22 = r2.A00;
        int i3 = i2 << 3;
        r22.A08(i3 | 3);
        r3.Aiv(r22.A00, obj);
        r22.A08(i3 | 4);
    }

    public final int A07(int i2) {
        int i3;
        int i4 = this.A00;
        if (i2 >= i4) {
            int i5 = this.A02;
            if (i2 < i5) {
                i3 = (i2 - i4) << 2;
                if (this.A0A[i3] == i2) {
                    return i3;
                }
            } else if (i2 <= this.A01) {
                int i6 = i5 - i4;
                int[] iArr = this.A0A;
                int length = (iArr.length >> 2) - 1;
                while (i6 <= length) {
                    int i7 = (length + i6) >>> 1;
                    i3 = i7 << 2;
                    int i8 = iArr[i3];
                    if (i2 != i8) {
                        if (i2 < i8) {
                            length = i7 - 1;
                        } else {
                            i6 = i7 + 1;
                        }
                    }
                }
            }
            return i3;
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        r9.putObject(r8, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b7, code lost:
        r3 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0112, code lost:
        r20 = r20 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0131, code lost:
        r9.putObject(r8, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014a, code lost:
        r2 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01bd, code lost:
        r7 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d4, code lost:
        r7 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d6, code lost:
        r20 = r20 | r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A08(X.C84184Jo r38, java.lang.Object r39, byte[] r40, int r41, int r42, int r43) {
        /*
            r37 = this;
            r7 = r41
            sun.misc.Unsafe r9 = A0F
            r2 = -1
            r12 = 0
            r20 = 0
            r19 = -1
        L_0x000a:
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r7
            r10 = r37
            r27 = r42
            r8 = r39
            r21 = r43
            r0 = r27
            if (r7 >= r0) goto L_0x028f
            int r4 = r7 + 1
            r5 = r40
            byte r12 = r40[r7]
            r6 = r38
            if (r12 >= 0) goto L_0x002a
            int r4 = X.C90724eh.A04(r6, r5, r12, r4)
            int r12 = r6.A00
        L_0x002a:
            int r18 = r12 >>> 3
            r7 = r12 & 7
            r0 = r18
            int r11 = r10.A07(r0)
            if (r11 == r2) goto L_0x0070
            int[] r13 = r10.A0A
            int r0 = r11 + 1
            r14 = r13[r0]
            int r17 = X.AnonymousClass3K4.A04(r14)
            r0 = r14 & r15
            long r0 = (long) r0
            r2 = 17
            r3 = r2
            r2 = r17
            if (r2 > r3) goto L_0x01da
            int r2 = r11 + 2
            r13 = r13[r2]
            int r2 = r13 >>> 20
            r16 = 1
            int r16 = r16 << r2
            r13 = r13 & r15
            r2 = r19
            if (r13 == r2) goto L_0x006c
            r2 = -1
            r3 = r2
            r2 = r19
            if (r2 == r3) goto L_0x0065
            long r2 = (long) r2
            r15 = r20
            r9.putInt(r8, r2, r15)
        L_0x0065:
            long r2 = (long) r13
            int r20 = r9.getInt(r8, r2)
            r19 = r13
        L_0x006c:
            r2 = 5
            switch(r17) {
                case 0: goto L_0x01c0;
                case 1: goto L_0x01ae;
                case 2: goto L_0x019a;
                case 3: goto L_0x019a;
                case 4: goto L_0x018e;
                case 5: goto L_0x017d;
                case 6: goto L_0x0173;
                case 7: goto L_0x015d;
                case 8: goto L_0x0136;
                case 9: goto L_0x0116;
                case 10: goto L_0x00af;
                case 11: goto L_0x018e;
                case 12: goto L_0x00e4;
                case 13: goto L_0x0173;
                case 14: goto L_0x017d;
                case 15: goto L_0x00d1;
                case 16: goto L_0x00ba;
                case 17: goto L_0x0085;
                default: goto L_0x0070;
            }
        L_0x0070:
            r0 = r21
            if (r12 != r0) goto L_0x0076
            if (r43 != 0) goto L_0x028f
        L_0x0076:
            X.4dY r1 = X.AnonymousClass3Z1.A01(r8)
            r0 = r6
            r2 = r5
            r3 = r12
            r5 = r27
            int r7 = X.C90724eh.A00(r0, r1, r2, r3, r4, r5)
        L_0x0083:
            r2 = -1
            goto L_0x000a
        L_0x0085:
            r2 = 3
            if (r7 != r2) goto L_0x0070
            int r2 = r18 << 3
            r26 = r2 | 4
            X.1gd r22 = r10.A0B(r11)
            r2 = -1
            r21 = r6
            r23 = r5
            r24 = r4
            r25 = r27
            int r7 = A01(r21, r22, r23, r24, r25, r26)
            r3 = r20 & r16
            if (r3 == 0) goto L_0x00b7
            java.lang.Object r4 = r9.getObject(r8, r0)
            java.lang.Object r3 = r6.A02
            java.lang.Object r3 = X.AnonymousClass4ZB.A00(r4, r3)
        L_0x00ab:
            r9.putObject(r8, r0, r3)
            goto L_0x0112
        L_0x00af:
            r3 = 2
            r2 = -1
            if (r7 != r3) goto L_0x0070
            int r7 = X.C90724eh.A03(r6, r5, r4)
        L_0x00b7:
            java.lang.Object r3 = r6.A02
            goto L_0x00ab
        L_0x00ba:
            r2 = -1
            if (r7 != 0) goto L_0x0070
            int r7 = X.C90724eh.A02(r6, r5, r4)
            long r3 = r6.A01
            long r25 = X.AnonymousClass3K2.A0H(r3)
            r22 = r8
            r21 = r9
            r23 = r0
            r21.putLong(r22, r23, r25)
            goto L_0x0112
        L_0x00d1:
            r2 = -1
            if (r7 != 0) goto L_0x0070
            int r7 = X.C90724eh.A01(r6, r5, r4)
            int r3 = r6.A00
            int r4 = r3 >>> 1
            r3 = r3 & 1
            int r3 = -r3
            r3 = r3 ^ r4
            r9.putInt(r8, r0, r3)
            goto L_0x0112
        L_0x00e4:
            r2 = -1
            if (r7 != 0) goto L_0x0070
            int r7 = X.C90724eh.A01(r6, r5, r4)
            int r4 = r6.A00
            java.lang.Object[] r5 = r10.A0E
            int r3 = r11 >> 2
            int r3 = r3 << 1
            int r3 = r3 + 1
            r3 = r5[r3]
            X.5O1 r3 = (X.AnonymousClass5O1) r3
            if (r3 == 0) goto L_0x010f
            X.5Ls r3 = r3.Aj3(r4)
            if (r3 != 0) goto L_0x010f
            X.4dY r3 = X.AnonymousClass3Z1.A01(r8)
            long r0 = (long) r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A01(r12, r0)
            goto L_0x000a
        L_0x010f:
            r9.putInt(r8, r0, r4)
        L_0x0112:
            r20 = r20 | r16
            goto L_0x000a
        L_0x0116:
            r2 = 2
            if (r7 != r2) goto L_0x0070
            X.1gd r3 = r10.A0B(r11)
            r2 = r27
            int r7 = A00(r6, r3, r5, r4, r2)
            r2 = r20 & r16
            if (r2 == 0) goto L_0x014a
            java.lang.Object r3 = r9.getObject(r8, r0)
            java.lang.Object r2 = r6.A02
            java.lang.Object r2 = X.AnonymousClass4ZB.A00(r3, r2)
        L_0x0131:
            r9.putObject(r8, r0, r2)
            goto L_0x01d6
        L_0x0136:
            r2 = 2
            if (r7 != r2) goto L_0x0070
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r14 = r14 & r2
            if (r14 != 0) goto L_0x0158
            int r7 = X.C90724eh.A01(r6, r5, r4)
            int r4 = r6.A00
            if (r4 != 0) goto L_0x014d
            java.lang.String r2 = ""
            r6.A02 = r2
        L_0x014a:
            java.lang.Object r2 = r6.A02
            goto L_0x0131
        L_0x014d:
            java.nio.charset.Charset r3 = X.AnonymousClass4ZB.A03
            java.lang.String r2 = new java.lang.String
            r2.<init>(r5, r7, r4, r3)
            r6.A02 = r2
            int r7 = r7 + r4
            goto L_0x014a
        L_0x0158:
            int r7 = A02(r6, r5, r4)
            goto L_0x014a
        L_0x015d:
            if (r7 != 0) goto L_0x0070
            int r7 = X.C90724eh.A02(r6, r5, r4)
            long r2 = r6.A01
            r5 = 0
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1O(r4)
            X.4XX r2 = X.C90904f2.A02
            r2.A0D(r8, r0, r3)
            goto L_0x01d6
        L_0x0173:
            if (r7 != r2) goto L_0x0070
            int r2 = X.AnonymousClass3K2.A0D(r5, r4)
            r9.putInt(r8, r0, r2)
            goto L_0x01bd
        L_0x017d:
            r2 = 1
            if (r7 != r2) goto L_0x0070
            long r25 = X.AnonymousClass3K2.A0K(r5, r4)
            r22 = r8
            r21 = r9
            r23 = r0
            r21.putLong(r22, r23, r25)
            goto L_0x01d4
        L_0x018e:
            if (r7 != 0) goto L_0x0070
            int r7 = X.C90724eh.A01(r6, r5, r4)
            int r2 = r6.A00
            r9.putInt(r8, r0, r2)
            goto L_0x01d6
        L_0x019a:
            if (r7 != 0) goto L_0x0070
            int r7 = X.C90724eh.A02(r6, r5, r4)
            long r2 = r6.A01
            r22 = r8
            r21 = r9
            r23 = r0
            r25 = r2
            r21.putLong(r22, r23, r25)
            goto L_0x01d6
        L_0x01ae:
            if (r7 != r2) goto L_0x0070
            int r2 = X.AnonymousClass3K2.A0D(r5, r4)
            float r3 = java.lang.Float.intBitsToFloat(r2)
            X.4XX r2 = X.C90904f2.A02
            r2.A0A(r8, r0, r3)
        L_0x01bd:
            int r7 = r4 + 4
            goto L_0x01d6
        L_0x01c0:
            r2 = 1
            if (r7 != r2) goto L_0x0070
            long r2 = X.AnonymousClass3K2.A0K(r5, r4)
            double r25 = java.lang.Double.longBitsToDouble(r2)
            X.4XX r21 = X.C90904f2.A02
            r22 = r8
            r23 = r0
            r21.A09(r22, r23, r25)
        L_0x01d4:
            int r7 = r4 + 8
        L_0x01d6:
            r20 = r20 | r16
            goto L_0x0083
        L_0x01da:
            r3 = 27
            if (r2 != r3) goto L_0x021b
            r2 = 2
            if (r7 != r2) goto L_0x0070
            java.lang.Object r2 = r9.getObject(r8, r0)
            X.5Ur r2 = (X.C110015Ur) r2
            r3 = r2
            X.5Bn r3 = (X.C105875Bn) r3
            boolean r3 = r3.A00
            if (r3 != 0) goto L_0x01f9
            int r3 = X.AnonymousClass3K4.A0A(r2)
            X.5Ur r2 = r2.AjM(r3)
            r9.putObject(r8, r0, r2)
        L_0x01f9:
            X.1gd r3 = r10.A0B(r11)
            r0 = r27
            int r7 = A00(r6, r3, r5, r4, r0)
        L_0x0203:
            java.lang.Object r0 = r6.A02
            r2.add(r0)
            r0 = r27
            if (r7 >= r0) goto L_0x0083
            int r1 = X.C90724eh.A01(r6, r5, r7)
            int r0 = r6.A00
            if (r12 != r0) goto L_0x0083
            r0 = r27
            int r7 = A00(r6, r3, r5, r1, r0)
            goto L_0x0203
        L_0x021b:
            r3 = 49
            if (r2 > r3) goto L_0x0241
            long r2 = (long) r14
            r23 = r6
            r24 = r8
            r25 = r5
            r32 = r17
            r33 = r2
            r35 = r0
            r26 = r4
            r28 = r12
            r29 = r18
            r30 = r7
            r31 = r11
            r22 = r10
            int r7 = r22.A0A(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)
        L_0x023c:
            if (r7 != r4) goto L_0x0083
            r4 = r7
            goto L_0x0070
        L_0x0241:
            r3 = 50
            if (r2 != r3) goto L_0x0272
            r2 = 2
            if (r7 != r2) goto L_0x0070
            java.lang.Object r6 = r9.getObject(r8, r0)
            X.5O2 r5 = r10.A05
            r2 = r6
            X.5CQ r2 = (X.AnonymousClass5CQ) r2
            boolean r2 = r2.zzfa
            if (r2 != 0) goto L_0x0268
            X.5CQ r4 = X.AnonymousClass5CQ.A00
            boolean r3 = r4.isEmpty()
            X.5CQ r2 = new X.5CQ
            if (r3 == 0) goto L_0x026e
            r2.<init>()
        L_0x0262:
            r5.Aj8(r2, r6)
            r9.putObject(r8, r0, r2)
        L_0x0268:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x026e:
            r2.<init>(r4)
            goto L_0x0262
        L_0x0272:
            r23 = r6
            r24 = r8
            r25 = r5
            r22 = r10
            r26 = r4
            r28 = r12
            r29 = r18
            r30 = r7
            r31 = r14
            r32 = r2
            r33 = r11
            r34 = r0
            int r7 = r22.A09(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x023c
        L_0x028f:
            r1 = -1
            r0 = r19
            if (r0 == r1) goto L_0x029a
            long r0 = (long) r0
            r2 = r20
            r9.putInt(r8, r0, r2)
        L_0x029a:
            int[] r5 = r10.A0C
            if (r5 == 0) goto L_0x02c5
            int r3 = r5.length
            r2 = 0
        L_0x02a0:
            if (r2 >= r3) goto L_0x02c5
            r6 = r5[r2]
            int[] r1 = r10.A0A
            int r0 = r6 + 1
            r1 = r1[r0]
            java.lang.Object r0 = A04(r8, r1)
            if (r0 == 0) goto L_0x02c2
            java.lang.Object[] r1 = r10.A0E
            int r0 = r6 >> 2
            int r0 = r0 << 1
            int r0 = r0 + 1
            r0 = r1[r0]
            if (r0 == 0) goto L_0x02c2
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x02c2:
            int r2 = r2 + 1
            goto L_0x02a0
        L_0x02c5:
            r0 = r27
            if (r43 != 0) goto L_0x02cc
            if (r4 != r0) goto L_0x02d3
            return r4
        L_0x02cc:
            if (r4 > r0) goto L_0x02d3
            r0 = r21
            if (r12 != r0) goto L_0x02d3
            return r4
        L_0x02d3:
            java.lang.String r1 = "Failed to parse the message."
            X.40G r0 = new X.40G
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98324rS.A08(X.4Jo, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        if (r7.getInt(r10, r2) != r15) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        r4 = r7.getObject(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c1, code lost:
        r5 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c3, code lost:
        if (r4 == null) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0025, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c5, code lost:
        r5 = X.AnonymousClass4ZB.A00(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fb, code lost:
        r8 = r8 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0131, code lost:
        r5 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013e, code lost:
        r5 = java.lang.Long.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0142, code lost:
        r7.putObject(r10, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0154, code lost:
        r7.putObject(r10, r0, r4);
        r8 = r26 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0169, code lost:
        r7.putObject(r10, r0, r4);
        r8 = r26 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016e, code lost:
        r7.putInt(r10, r2, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0171, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A09(X.C84184Jo r23, java.lang.Object r24, byte[] r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, long r34) {
        /*
            r22 = this;
            r8 = r26
            sun.misc.Unsafe r7 = A0F
            r6 = r22
            int[] r1 = r6.A0A
            r12 = r33
            int r0 = r33 + 2
            long r2 = X.AnonymousClass3K4.A0J(r1, r0)
            r5 = 5
            r4 = 2
            r11 = r23
            r9 = r25
            r16 = r27
            r14 = r28
            r15 = r29
            r13 = r30
            r0 = r34
            r10 = r24
            switch(r32) {
                case 51: goto L_0x015a;
                case 52: goto L_0x0146;
                case 53: goto L_0x0136;
                case 54: goto L_0x0136;
                case 55: goto L_0x0129;
                case 56: goto L_0x011d;
                case 57: goto L_0x0112;
                case 58: goto L_0x00fd;
                case 59: goto L_0x00cc;
                case 60: goto L_0x00ab;
                case 61: goto L_0x008e;
                case 62: goto L_0x0129;
                case 63: goto L_0x005c;
                case 64: goto L_0x0112;
                case 65: goto L_0x011d;
                case 66: goto L_0x004c;
                case 67: goto L_0x003e;
                case 68: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            return r8
        L_0x0026:
            r4 = 3
            if (r13 != r4) goto L_0x0025
            r4 = r28 & -8
            r21 = r4 | 4
            X.1gd r17 = r6.A0B(r12)
            r20 = r16
            r18 = r9
            r19 = r8
            r16 = r11
            int r8 = A01(r16, r17, r18, r19, r20, r21)
            goto L_0x00b7
        L_0x003e:
            if (r30 != 0) goto L_0x0025
            int r8 = X.C90724eh.A02(r11, r9, r8)
            long r4 = r11.A01
            long r4 = X.AnonymousClass3K2.A0H(r4)
            goto L_0x013e
        L_0x004c:
            if (r30 != 0) goto L_0x0025
            int r8 = X.C90724eh.A01(r11, r9, r8)
            int r4 = r11.A00
            int r5 = r4 >>> 1
            r4 = r4 & 1
            int r4 = -r4
            r4 = r4 ^ r5
            goto L_0x0131
        L_0x005c:
            if (r30 != 0) goto L_0x0025
            int r8 = X.C90724eh.A01(r11, r9, r8)
            int r5 = r11.A00
            java.lang.Object[] r6 = r6.A0E
            int r4 = r33 >> 2
            int r4 = r4 << 1
            int r4 = r4 + 1
            r4 = r6[r4]
            X.5O1 r4 = (X.AnonymousClass5O1) r4
            if (r4 == 0) goto L_0x0085
            X.5Ls r4 = r4.Aj3(r5)
            if (r4 != 0) goto L_0x0085
            X.4dY r2 = X.AnonymousClass3Z1.A01(r10)
            long r0 = (long) r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A01(r14, r0)
            return r8
        L_0x0085:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r7.putObject(r10, r0, r4)
            goto L_0x016e
        L_0x008e:
            if (r13 != r4) goto L_0x0025
            int r8 = X.C90724eh.A01(r11, r9, r8)
            int r6 = r11.A00
            if (r6 != 0) goto L_0x009c
            X.556 r5 = X.AnonymousClass556.A00
            goto L_0x0142
        L_0x009c:
            X.5O0 r4 = X.AnonymousClass556.A01
            byte[] r5 = r4.AjG(r9, r8, r6)
            X.3ZC r4 = new X.3ZC
            r4.<init>(r5)
            r7.putObject(r10, r0, r4)
            goto L_0x00fb
        L_0x00ab:
            if (r13 != r4) goto L_0x0025
            X.1gd r5 = r6.A0B(r12)
            r4 = r16
            int r8 = A00(r11, r5, r9, r8, r4)
        L_0x00b7:
            int r4 = r7.getInt(r10, r2)
            if (r4 != r15) goto L_0x00ca
            java.lang.Object r4 = r7.getObject(r10, r0)
        L_0x00c1:
            java.lang.Object r5 = r11.A02
            if (r4 == 0) goto L_0x0142
            java.lang.Object r5 = X.AnonymousClass4ZB.A00(r4, r5)
            goto L_0x0142
        L_0x00ca:
            r4 = 0
            goto L_0x00c1
        L_0x00cc:
            if (r13 != r4) goto L_0x0025
            int r8 = X.C90724eh.A01(r11, r9, r8)
            int r6 = r11.A00
            if (r6 != 0) goto L_0x00d9
            java.lang.String r5 = ""
            goto L_0x0142
        L_0x00d9:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r31 = r31 & r4
            if (r31 == 0) goto L_0x00f1
            int r11 = r8 + r6
            X.4bY r5 = X.C90324dx.A00
            int r4 = r5.A02(r9, r8, r11)
            if (r4 == 0) goto L_0x00f1
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.40G r0 = new X.40G
            r0.<init>(r1)
            throw r0
        L_0x00f1:
            java.nio.charset.Charset r5 = X.AnonymousClass4ZB.A03
            java.lang.String r4 = new java.lang.String
            r4.<init>(r9, r8, r6, r5)
            r7.putObject(r10, r0, r4)
        L_0x00fb:
            int r8 = r8 + r6
            goto L_0x016e
        L_0x00fd:
            if (r30 != 0) goto L_0x0025
            int r8 = X.C90724eh.A02(r11, r9, r8)
            long r4 = r11.A01
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1O(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            goto L_0x0142
        L_0x0112:
            if (r13 != r5) goto L_0x0025
            int r4 = X.AnonymousClass3K2.A0D(r9, r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0154
        L_0x011d:
            r4 = 1
            if (r13 != r4) goto L_0x0025
            long r4 = X.AnonymousClass3K2.A0K(r9, r8)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0169
        L_0x0129:
            if (r30 != 0) goto L_0x0025
            int r8 = X.C90724eh.A01(r11, r9, r8)
            int r4 = r11.A00
        L_0x0131:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            goto L_0x0142
        L_0x0136:
            if (r30 != 0) goto L_0x0025
            int r8 = X.C90724eh.A02(r11, r9, r8)
            long r4 = r11.A01
        L_0x013e:
            java.lang.Long r5 = java.lang.Long.valueOf(r4)
        L_0x0142:
            r7.putObject(r10, r0, r5)
            goto L_0x016e
        L_0x0146:
            if (r13 != r5) goto L_0x0025
            int r4 = X.AnonymousClass3K2.A0D(r9, r8)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
        L_0x0154:
            r7.putObject(r10, r0, r4)
            int r8 = r26 + 4
            goto L_0x016e
        L_0x015a:
            r4 = 1
            if (r13 != r4) goto L_0x0025
            long r4 = X.AnonymousClass3K2.A0K(r9, r8)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
        L_0x0169:
            r7.putObject(r10, r0, r4)
            int r8 = r26 + 8
        L_0x016e:
            r7.putInt(r10, r2, r15)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98324rS.A09(X.4Jo, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02de, code lost:
        if (r4 == r3) goto L_0x040e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e7, code lost:
        throw new X.AnonymousClass40G("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x040e, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x040f, code lost:
        return r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0A(X.C84184Jo r18, java.lang.Object r19, byte[] r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, long r28, long r30) {
        /*
            r17 = this;
            r5 = r19
            r14 = r21
            sun.misc.Unsafe r7 = A0F
            r0 = r30
            java.lang.Object r2 = r7.getObject(r5, r0)
            X.5Ur r2 = (X.C110015Ur) r2
            r3 = r2
            X.5Bn r3 = (X.C105875Bn) r3
            boolean r3 = r3.A00
            r4 = 1
            if (r3 != 0) goto L_0x0027
            int r6 = r2.size()
            int r3 = r6 << r4
            if (r6 != 0) goto L_0x0020
            r3 = 10
        L_0x0020:
            X.5Ur r2 = r2.AjM(r3)
            r7.putObject(r5, r0, r2)
        L_0x0027:
            r6 = 5
            r9 = 0
            r1 = 2
            r0 = r17
            r11 = r18
            r13 = r20
            r15 = r22
            r3 = r23
            r7 = r25
            r8 = r26
            switch(r27) {
                case 18: goto L_0x00b0;
                case 19: goto L_0x00eb;
                case 20: goto L_0x0126;
                case 21: goto L_0x0126;
                case 22: goto L_0x006f;
                case 23: goto L_0x003c;
                case 24: goto L_0x0159;
                case 25: goto L_0x018c;
                case 26: goto L_0x01cf;
                case 27: goto L_0x0236;
                case 28: goto L_0x0254;
                case 29: goto L_0x006f;
                case 30: goto L_0x032f;
                case 31: goto L_0x0159;
                case 32: goto L_0x003c;
                case 33: goto L_0x0282;
                case 34: goto L_0x02c1;
                case 35: goto L_0x00b0;
                case 36: goto L_0x00eb;
                case 37: goto L_0x0126;
                case 38: goto L_0x0126;
                case 39: goto L_0x006f;
                case 40: goto L_0x003c;
                case 41: goto L_0x0159;
                case 42: goto L_0x018c;
                case 43: goto L_0x006f;
                case 44: goto L_0x032f;
                case 45: goto L_0x0159;
                case 46: goto L_0x003c;
                case 47: goto L_0x0282;
                case 48: goto L_0x02c1;
                case 49: goto L_0x0306;
                default: goto L_0x003c;
            }
        L_0x003c:
            if (r7 != r1) goto L_0x0055
            X.3Z8 r2 = (X.AnonymousClass3Z8) r2
            int r4 = X.C90724eh.A01(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x0047:
            if (r4 >= r3) goto L_0x02de
            long r0 = X.AnonymousClass3K2.A0K(r13, r4)
            int r5 = r2.A00
            r2.A04(r5, r0)
            int r4 = r4 + 8
            goto L_0x0047
        L_0x0055:
            if (r7 != r4) goto L_0x040f
            X.3Z8 r2 = (X.AnonymousClass3Z8) r2
        L_0x0059:
            long r0 = X.AnonymousClass3K2.A0K(r13, r14)
            int r4 = r2.A00
            r2.A04(r4, r0)
            int r4 = r14 + 8
            if (r4 >= r15) goto L_0x040e
            int r14 = X.C90724eh.A01(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040e
            goto L_0x0059
        L_0x006f:
            if (r7 != r1) goto L_0x0092
            X.3Z7 r2 = (X.AnonymousClass3Z7) r2
            int r4 = X.C90724eh.A01(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x007a:
            if (r4 >= r3) goto L_0x0088
            int r4 = X.C90724eh.A01(r11, r13, r4)
            int r1 = r11.A00
            int r0 = r2.A00
            r2.A04(r0, r1)
            goto L_0x007a
        L_0x0088:
            if (r4 == r3) goto L_0x040e
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.40G r0 = new X.40G
            r0.<init>(r1)
            throw r0
        L_0x0092:
            if (r25 != 0) goto L_0x040f
            X.3Z7 r2 = (X.AnonymousClass3Z7) r2
            int r4 = X.C90724eh.A01(r11, r13, r14)
        L_0x009a:
            int r1 = r11.A00
            int r0 = r2.A00
            r2.A04(r0, r1)
            if (r4 >= r15) goto L_0x040e
            int r1 = X.C90724eh.A01(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040e
            int r4 = X.C90724eh.A01(r11, r13, r1)
            goto L_0x009a
        L_0x00b0:
            if (r7 != r1) goto L_0x00cd
            X.3Z5 r2 = (X.AnonymousClass3Z5) r2
            int r4 = X.C90724eh.A01(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x00bb:
            if (r4 >= r3) goto L_0x02de
            long r0 = X.AnonymousClass3K2.A0K(r13, r4)
            double r5 = java.lang.Double.longBitsToDouble(r0)
            int r0 = r2.A00
            r2.A03(r0, r5)
            int r4 = r4 + 8
            goto L_0x00bb
        L_0x00cd:
            if (r7 != r4) goto L_0x040f
            X.3Z5 r2 = (X.AnonymousClass3Z5) r2
        L_0x00d1:
            long r0 = X.AnonymousClass3K2.A0K(r13, r14)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            int r4 = r2.A00
            r2.A03(r4, r0)
            int r4 = r14 + 8
            if (r4 >= r15) goto L_0x040e
            int r14 = X.C90724eh.A01(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040e
            goto L_0x00d1
        L_0x00eb:
            if (r7 != r1) goto L_0x0108
            X.3Z6 r2 = (X.AnonymousClass3Z6) r2
            int r4 = X.C90724eh.A01(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x00f6:
            if (r4 >= r3) goto L_0x02de
            int r0 = X.AnonymousClass3K2.A0D(r13, r4)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            int r0 = r2.A00
            r2.A03(r0, r1)
            int r4 = r4 + 4
            goto L_0x00f6
        L_0x0108:
            if (r7 != r6) goto L_0x040f
            X.3Z6 r2 = (X.AnonymousClass3Z6) r2
        L_0x010c:
            int r0 = X.AnonymousClass3K2.A0D(r13, r14)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            int r0 = r2.A00
            r2.A03(r0, r1)
            int r4 = r14 + 4
            if (r4 >= r15) goto L_0x040e
            int r14 = X.C90724eh.A01(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040e
            goto L_0x010c
        L_0x0126:
            if (r7 != r1) goto L_0x013f
            X.3Z8 r2 = (X.AnonymousClass3Z8) r2
            int r4 = X.C90724eh.A01(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x0131:
            if (r4 >= r3) goto L_0x02de
            int r4 = X.C90724eh.A02(r11, r13, r4)
            long r0 = r11.A01
            int r5 = r2.A00
            r2.A04(r5, r0)
            goto L_0x0131
        L_0x013f:
            if (r25 != 0) goto L_0x040f
            X.3Z8 r2 = (X.AnonymousClass3Z8) r2
        L_0x0143:
            int r4 = X.C90724eh.A02(r11, r13, r14)
            long r0 = r11.A01
            int r5 = r2.A00
            r2.A04(r5, r0)
            if (r4 >= r15) goto L_0x040e
            int r14 = X.C90724eh.A01(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040e
            goto L_0x0143
        L_0x0159:
            if (r7 != r1) goto L_0x0172
            X.3Z7 r2 = (X.AnonymousClass3Z7) r2
            int r4 = X.C90724eh.A01(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x0164:
            if (r4 >= r3) goto L_0x02de
            int r1 = X.AnonymousClass3K2.A0D(r13, r4)
            int r0 = r2.A00
            r2.A04(r0, r1)
            int r4 = r4 + 4
            goto L_0x0164
        L_0x0172:
            if (r7 != r6) goto L_0x040f
            X.3Z7 r2 = (X.AnonymousClass3Z7) r2
        L_0x0176:
            int r1 = X.AnonymousClass3K2.A0D(r13, r14)
            int r0 = r2.A00
            r2.A04(r0, r1)
            int r4 = r14 + 4
            if (r4 >= r15) goto L_0x040e
            int r14 = X.C90724eh.A01(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040e
            goto L_0x0176
        L_0x018c:
            if (r7 != r1) goto L_0x01ab
            X.3Z4 r2 = (X.AnonymousClass3Z4) r2
            int r4 = X.C90724eh.A01(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x0197:
            if (r4 >= r3) goto L_0x02de
            int r4 = X.C90724eh.A02(r11, r13, r4)
            long r0 = r11.A01
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r5)
            int r0 = r2.A00
            r2.A03(r0, r1)
            goto L_0x0197
        L_0x01ab:
            if (r25 != 0) goto L_0x040f
            X.3Z4 r2 = (X.AnonymousClass3Z4) r2
            int r14 = X.C90724eh.A02(r11, r13, r14)
        L_0x01b3:
            long r0 = r11.A01
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r4)
            int r0 = r2.A00
            r2.A03(r0, r1)
            if (r14 >= r15) goto L_0x040f
            int r1 = X.C90724eh.A01(r11, r13, r14)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040f
            int r14 = X.C90724eh.A02(r11, r13, r1)
            goto L_0x01b3
        L_0x01cf:
            if (r7 != r1) goto L_0x040f
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r28 = r28 & r0
            java.lang.String r5 = ""
            int r0 = (r28 > r9 ? 1 : (r28 == r9 ? 0 : -1))
            int r14 = X.C90724eh.A01(r11, r13, r14)
            if (r0 != 0) goto L_0x0202
        L_0x01e0:
            int r4 = r11.A00
            if (r4 != 0) goto L_0x01f6
            r2.add(r5)
        L_0x01e7:
            if (r14 >= r15) goto L_0x040f
            int r1 = X.C90724eh.A01(r11, r13, r14)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040f
            int r14 = X.C90724eh.A01(r11, r13, r1)
            goto L_0x01e0
        L_0x01f6:
            java.nio.charset.Charset r1 = X.AnonymousClass4ZB.A03
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13, r14, r4, r1)
            r2.add(r0)
            int r14 = r14 + r4
            goto L_0x01e7
        L_0x0202:
            int r6 = r11.A00
            if (r6 != 0) goto L_0x0218
            r2.add(r5)
        L_0x0209:
            if (r14 >= r15) goto L_0x040f
            int r1 = X.C90724eh.A01(r11, r13, r14)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040f
            int r14 = X.C90724eh.A01(r11, r13, r1)
            goto L_0x0202
        L_0x0218:
            int r4 = r14 + r6
            X.4bY r1 = X.C90324dx.A00
            int r0 = r1.A02(r13, r14, r4)
            if (r0 != 0) goto L_0x022e
            java.nio.charset.Charset r1 = X.AnonymousClass4ZB.A03
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13, r14, r6, r1)
            r2.add(r0)
            r14 = r4
            goto L_0x0209
        L_0x022e:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.40G r1 = new X.40G
            r1.<init>(r0)
            throw r1
        L_0x0236:
            if (r7 != r1) goto L_0x040f
            X.1gd r5 = r0.A0B(r8)
            int r4 = A00(r11, r5, r13, r14, r15)
        L_0x0240:
            java.lang.Object r0 = r11.A02
            r2.add(r0)
            if (r4 >= r15) goto L_0x040e
            int r1 = X.C90724eh.A01(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040e
            int r4 = A00(r11, r5, r13, r1, r15)
            goto L_0x0240
        L_0x0254:
            if (r7 != r1) goto L_0x040f
            int r4 = X.C90724eh.A01(r11, r13, r14)
        L_0x025a:
            int r5 = r11.A00
            if (r5 != 0) goto L_0x0272
            X.556 r0 = X.AnonymousClass556.A00
            r2.add(r0)
        L_0x0263:
            if (r4 >= r15) goto L_0x040e
            int r1 = X.C90724eh.A01(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040e
            int r4 = X.C90724eh.A01(r11, r13, r1)
            goto L_0x025a
        L_0x0272:
            X.5O0 r0 = X.AnonymousClass556.A01
            byte[] r1 = r0.AjG(r13, r4, r5)
            X.3ZC r0 = new X.3ZC
            r0.<init>(r1)
            r2.add(r0)
            int r4 = r4 + r5
            goto L_0x0263
        L_0x0282:
            if (r7 != r1) goto L_0x02a1
            X.3Z7 r2 = (X.AnonymousClass3Z7) r2
            int r4 = X.C90724eh.A01(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x028d:
            if (r4 >= r3) goto L_0x02de
            int r4 = X.C90724eh.A01(r11, r13, r4)
            int r0 = r11.A00
            int r5 = r0 >>> 1
            r0 = r0 & 1
            int r1 = -r0
            r1 = r1 ^ r5
            int r0 = r2.A00
            r2.A04(r0, r1)
            goto L_0x028d
        L_0x02a1:
            if (r25 != 0) goto L_0x040f
            X.3Z7 r2 = (X.AnonymousClass3Z7) r2
        L_0x02a5:
            int r4 = X.C90724eh.A01(r11, r13, r14)
            int r0 = r11.A00
            int r5 = r0 >>> 1
            r0 = r0 & 1
            int r1 = -r0
            r1 = r1 ^ r5
            int r0 = r2.A00
            r2.A04(r0, r1)
            if (r4 >= r15) goto L_0x040e
            int r14 = X.C90724eh.A01(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040e
            goto L_0x02a5
        L_0x02c1:
            if (r7 != r1) goto L_0x02e8
            X.3Z8 r2 = (X.AnonymousClass3Z8) r2
            int r4 = X.C90724eh.A01(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x02cc:
            if (r4 >= r3) goto L_0x02de
            int r4 = X.C90724eh.A02(r11, r13, r4)
            long r0 = r11.A01
            long r0 = X.AnonymousClass3K2.A0H(r0)
            int r5 = r2.A00
            r2.A04(r5, r0)
            goto L_0x02cc
        L_0x02de:
            if (r4 == r3) goto L_0x040e
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.40G r1 = new X.40G
            r1.<init>(r0)
            throw r1
        L_0x02e8:
            if (r25 != 0) goto L_0x040f
            X.3Z8 r2 = (X.AnonymousClass3Z8) r2
        L_0x02ec:
            int r4 = X.C90724eh.A02(r11, r13, r14)
            long r0 = r11.A01
            long r0 = X.AnonymousClass3K2.A0H(r0)
            int r5 = r2.A00
            r2.A04(r5, r0)
            if (r4 >= r15) goto L_0x040e
            int r14 = X.C90724eh.A01(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040e
            goto L_0x02ec
        L_0x0306:
            r1 = 3
            if (r7 != r1) goto L_0x040f
            X.1gd r12 = r0.A0B(r8)
            r0 = r23 & -8
            r16 = r0 | 4
            int r14 = A01(r11, r12, r13, r14, r15, r16)
        L_0x0315:
            java.lang.Object r0 = r11.A02
            r2.add(r0)
            if (r14 >= r15) goto L_0x040f
            int r7 = X.C90724eh.A01(r11, r13, r14)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x040f
            r4 = r11
            r5 = r12
            r6 = r13
            r8 = r15
            r9 = r16
            int r14 = A01(r4, r5, r6, r7, r8, r9)
            goto L_0x0315
        L_0x032f:
            if (r7 != r1) goto L_0x0353
            r7 = r2
            X.3Z7 r7 = (X.AnonymousClass3Z7) r7
            int r4 = X.C90724eh.A01(r11, r13, r14)
            int r6 = r11.A00
            int r6 = r6 + r4
        L_0x033b:
            if (r4 >= r6) goto L_0x0349
            int r4 = X.C90724eh.A01(r11, r13, r4)
            int r3 = r11.A00
            int r1 = r7.A00
            r7.A04(r1, r3)
            goto L_0x033b
        L_0x0349:
            if (r4 == r6) goto L_0x0372
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.40G r0 = new X.40G
            r0.<init>(r1)
            throw r0
        L_0x0353:
            if (r25 != 0) goto L_0x040f
            r7 = r2
            X.3Z7 r7 = (X.AnonymousClass3Z7) r7
            int r4 = X.C90724eh.A01(r11, r13, r14)
        L_0x035c:
            int r6 = r11.A00
            int r1 = r7.A00
            r7.A04(r1, r6)
            if (r4 >= r15) goto L_0x0372
            int r6 = X.C90724eh.A01(r11, r13, r4)
            int r1 = r11.A00
            if (r3 != r1) goto L_0x0372
            int r4 = X.C90724eh.A01(r11, r13, r6)
            goto L_0x035c
        L_0x0372:
            X.3Z1 r5 = (X.AnonymousClass3Z1) r5
            X.4dY r6 = r5.zzjp
            X.4dY r1 = X.C90134dY.A05
            if (r6 != r1) goto L_0x037b
            r6 = 0
        L_0x037b:
            java.lang.Object[] r1 = r0.A0E
            int r0 = r26 >> 2
            int r0 = r0 << 1
            int r0 = r0 + 1
            r7 = r1[r0]
            X.5O1 r7 = (X.AnonymousClass5O1) r7
            if (r7 == 0) goto L_0x0409
            boolean r0 = r2 instanceof java.util.RandomAccess
            if (r0 == 0) goto L_0x03cb
            int r10 = r2.size()
            r9 = 0
            r8 = 0
        L_0x0393:
            if (r9 >= r10) goto L_0x0400
            java.lang.Object r0 = r2.get(r9)
            int r12 = X.AnonymousClass000.A0D(r0)
            X.5Ls r0 = r7.Aj3(r12)
            if (r0 == 0) goto L_0x03b1
            if (r9 == r8) goto L_0x03ac
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2.set(r8, r0)
        L_0x03ac:
            int r8 = r8 + 1
        L_0x03ae:
            int r9 = r9 + 1
            goto L_0x0393
        L_0x03b1:
            if (r6 != 0) goto L_0x03c0
            r0 = 8
            int[] r11 = new int[r0]
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r1 = 0
            r0 = 1
            X.4dY r6 = new X.4dY
            r6.<init>(r11, r3, r1, r0)
        L_0x03c0:
            long r0 = (long) r12
            int r3 = r24 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A01(r3, r0)
            goto L_0x03ae
        L_0x03cb:
            java.util.Iterator r9 = r2.iterator()
        L_0x03cf:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0409
            java.lang.Object r0 = r9.next()
            int r8 = X.AnonymousClass000.A0D(r0)
            X.5Ls r0 = r7.Aj3(r8)
            if (r0 != 0) goto L_0x03cf
            if (r6 != 0) goto L_0x03f2
            r0 = 8
            int[] r3 = new int[r0]
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            r0 = 1
            X.4dY r6 = new X.4dY
            r6.<init>(r3, r2, r1, r0)
        L_0x03f2:
            long r2 = (long) r8
            int r1 = r24 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A01(r1, r0)
            r9.remove()
            goto L_0x03cf
        L_0x0400:
            if (r8 == r10) goto L_0x0409
            java.util.List r0 = r2.subList(r8, r10)
            r0.clear()
        L_0x0409:
            if (r6 == 0) goto L_0x040e
            r5.zzjp = r6
            return r4
        L_0x040e:
            return r4
        L_0x040f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98324rS.A0A(X.4Jo, java.lang.Object, byte[], int, int, int, int, int, int, int, long, long):int");
    }

    public final C32591gd A0B(int i2) {
        int i3 = (i2 >> 2) << 1;
        Object[] objArr = this.A0E;
        C32591gd r0 = (C32591gd) objArr[i3];
        if (r0 != null) {
            return r0;
        }
        C32591gd A002 = C32581gc.A02.A00((Class) objArr[i3 + 1]);
        objArr[i3] = A002;
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        throw X.AnonymousClass3K3.A0f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0C(int r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r8.A09
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 0
            r6 = 1
            int[] r1 = r8.A0A
            if (r0 == 0) goto L_0x0086
            int r0 = r9 + 1
            r1 = r1[r0]
            r0 = r1 & r2
            long r2 = (long) r0
            int r0 = X.AnonymousClass3K4.A04(r1)
            r4 = 0
            switch(r0) {
                case 0: goto L_0x0052;
                case 1: goto L_0x005f;
                case 2: goto L_0x007b;
                case 3: goto L_0x007b;
                case 4: goto L_0x0072;
                case 5: goto L_0x007b;
                case 6: goto L_0x0072;
                case 7: goto L_0x006b;
                case 8: goto L_0x0020;
                case 9: goto L_0x004b;
                case 10: goto L_0x003e;
                case 11: goto L_0x0072;
                case 12: goto L_0x0072;
                case 13: goto L_0x0072;
                case 14: goto L_0x007b;
                case 15: goto L_0x0072;
                case 16: goto L_0x007b;
                case 17: goto L_0x004b;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass3K3.A0f()
            throw r0
        L_0x0020:
            java.lang.Object r1 = X.C90904f2.A01(r10, r2)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x009a
            return r6
        L_0x0031:
            boolean r0 = r1 instanceof X.AnonymousClass556
            if (r0 == 0) goto L_0x001b
            X.556 r0 = X.AnonymousClass556.A00
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009a
            return r6
        L_0x003e:
            X.556 r1 = X.AnonymousClass556.A00
            java.lang.Object r0 = X.C90904f2.A01(r10, r2)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009a
            return r6
        L_0x004b:
            java.lang.Object r0 = X.C90904f2.A01(r10, r2)
            if (r0 == 0) goto L_0x009a
            return r6
        L_0x0052:
            X.4XX r0 = X.C90904f2.A02
            double r3 = r0.A02(r10, r2)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x009a
            return r6
        L_0x005f:
            X.4XX r0 = X.C90904f2.A02
            float r1 = r0.A03(r10, r2)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x009a
            return r6
        L_0x006b:
            X.4XX r0 = X.C90904f2.A02
            boolean r0 = r0.A0F(r10, r2)
            return r0
        L_0x0072:
            X.4XX r0 = X.C90904f2.A02
            int r0 = r0.A04(r10, r2)
            if (r0 == 0) goto L_0x009a
            return r6
        L_0x007b:
            X.4XX r0 = X.C90904f2.A02
            long r1 = r0.A05(r10, r2)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x009a
            return r6
        L_0x0086:
            int r0 = r9 + 2
            r1 = r1[r0]
            int r0 = r1 >>> 20
            int r3 = r6 << r0
            r1 = r1 & r2
            long r1 = (long) r1
            X.4XX r0 = X.C90904f2.A02
            int r0 = r0.A04(r10, r1)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x009a
            return r6
        L_0x009a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98324rS.A0C(int, java.lang.Object):boolean");
    }

    public final boolean A0D(Object obj, int i2, int i3) {
        return AnonymousClass000.A1R(C90904f2.A02.A04(obj, AnonymousClass3K4.A0J(this.A0A, i3 + 2)), i2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        if (r3 == r0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A8b(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r7 = r10.A0A
            int r6 = r7.length
            r9 = 0
            r5 = 0
        L_0x0005:
            r2 = 1
            if (r5 >= r6) goto L_0x007a
            int r0 = r5 + 1
            r4 = r7[r0]
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r4 & r3
            long r1 = (long) r0
            int r0 = X.AnonymousClass3K4.A04(r4)
            switch(r0) {
                case 0: goto L_0x0061;
                case 1: goto L_0x0089;
                case 2: goto L_0x0061;
                case 3: goto L_0x0061;
                case 4: goto L_0x0089;
                case 5: goto L_0x0061;
                case 6: goto L_0x0089;
                case 7: goto L_0x001c;
                case 8: goto L_0x0031;
                case 9: goto L_0x0031;
                case 10: goto L_0x0031;
                case 11: goto L_0x0089;
                case 12: goto L_0x0089;
                case 13: goto L_0x0089;
                case 14: goto L_0x0061;
                case 15: goto L_0x0089;
                case 16: goto L_0x0061;
                case 17: goto L_0x0031;
                case 18: goto L_0x004e;
                case 19: goto L_0x004e;
                case 20: goto L_0x004e;
                case 21: goto L_0x004e;
                case 22: goto L_0x004e;
                case 23: goto L_0x004e;
                case 24: goto L_0x004e;
                case 25: goto L_0x004e;
                case 26: goto L_0x004e;
                case 27: goto L_0x004e;
                case 28: goto L_0x004e;
                case 29: goto L_0x004e;
                case 30: goto L_0x004e;
                case 31: goto L_0x004e;
                case 32: goto L_0x004e;
                case 33: goto L_0x004e;
                case 34: goto L_0x004e;
                case 35: goto L_0x004e;
                case 36: goto L_0x004e;
                case 37: goto L_0x004e;
                case 38: goto L_0x004e;
                case 39: goto L_0x004e;
                case 40: goto L_0x004e;
                case 41: goto L_0x004e;
                case 42: goto L_0x004e;
                case 43: goto L_0x004e;
                case 44: goto L_0x004e;
                case 45: goto L_0x004e;
                case 46: goto L_0x004e;
                case 47: goto L_0x004e;
                case 48: goto L_0x004e;
                case 49: goto L_0x004e;
                case 50: goto L_0x004e;
                case 51: goto L_0x003c;
                case 52: goto L_0x003c;
                case 53: goto L_0x003c;
                case 54: goto L_0x003c;
                case 55: goto L_0x003c;
                case 56: goto L_0x003c;
                case 57: goto L_0x003c;
                case 58: goto L_0x003c;
                case 59: goto L_0x003c;
                case 60: goto L_0x003c;
                case 61: goto L_0x003c;
                case 62: goto L_0x003c;
                case 63: goto L_0x003c;
                case 64: goto L_0x003c;
                case 65: goto L_0x003c;
                case 66: goto L_0x003c;
                case 67: goto L_0x003c;
                case 68: goto L_0x003c;
                default: goto L_0x0019;
            }
        L_0x0019:
            int r5 = r5 + 4
            goto L_0x0005
        L_0x001c:
            boolean r3 = r10.A0C(r5, r11)
            boolean r0 = r10.A0C(r5, r12)
            if (r3 != r0) goto L_0x009f
            X.4XX r0 = X.C90904f2.A02
            boolean r3 = r0.A0F(r11, r1)
            boolean r0 = r0.A0F(r12, r1)
            goto L_0x009d
        L_0x0031:
            boolean r3 = r10.A0C(r5, r11)
            boolean r0 = r10.A0C(r5, r12)
            if (r3 != r0) goto L_0x009f
            goto L_0x004e
        L_0x003c:
            int r0 = r5 + 2
            r0 = r7[r0]
            r0 = r0 & r3
            long r3 = (long) r0
            X.4XX r0 = X.C90904f2.A02
            int r8 = r0.A04(r11, r3)
            int r0 = r0.A04(r12, r3)
            if (r8 != r0) goto L_0x009f
        L_0x004e:
            java.lang.Object r3 = X.C90904f2.A01(r11, r1)
            java.lang.Object r0 = X.C90904f2.A01(r12, r1)
            if (r3 == r0) goto L_0x0019
            if (r3 == 0) goto L_0x009f
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            goto L_0x0019
        L_0x0061:
            boolean r3 = r10.A0C(r5, r11)
            boolean r0 = r10.A0C(r5, r12)
            if (r3 != r0) goto L_0x009f
            X.4XX r0 = X.C90904f2.A02
            long r3 = r0.A05(r11, r1)
            long r1 = r0.A05(r12, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0019
            return r9
        L_0x007a:
            X.3Z1 r11 = (X.AnonymousClass3Z1) r11
            X.4dY r1 = r11.zzjp
            X.3Z1 r12 = (X.AnonymousClass3Z1) r12
            X.4dY r0 = r12.zzjp
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009f
            return r2
        L_0x0089:
            boolean r3 = r10.A0C(r5, r11)
            boolean r0 = r10.A0C(r5, r12)
            if (r3 != r0) goto L_0x009f
            X.4XX r0 = X.C90904f2.A02
            int r3 = r0.A04(r11, r1)
            int r0 = r0.A04(r12, r1)
        L_0x009d:
            if (r3 == r0) goto L_0x0019
        L_0x009f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98324rS.A8b(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r0 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        r1 = java.lang.Float.floatToIntBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        r1 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        if (r0 == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        r1 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r3 = r3 * 53;
        r1 = ((java.lang.String) X.C90904f2.A01(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        r1 = X.AnonymousClass3K2.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00db, code lost:
        r3 = r3 * 53;
        r1 = X.C90904f2.A01(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        r3 = r3 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r4 = r4 + 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int AHj(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r6 = r9.A0A
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L_0x0005:
            if (r4 >= r5) goto L_0x00e8
            int r0 = r4 + 1
            r7 = r6[r0]
            r8 = r6[r4]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r1 = (long) r0
            int r0 = X.AnonymousClass3K4.A04(r7)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0027;
                case 2: goto L_0x0030;
                case 3: goto L_0x0030;
                case 4: goto L_0x003a;
                case 5: goto L_0x0030;
                case 6: goto L_0x003a;
                case 7: goto L_0x0044;
                case 8: goto L_0x00a2;
                case 9: goto L_0x004d;
                case 10: goto L_0x00db;
                case 11: goto L_0x003a;
                case 12: goto L_0x003a;
                case 13: goto L_0x003a;
                case 14: goto L_0x0030;
                case 15: goto L_0x003a;
                case 16: goto L_0x0030;
                case 17: goto L_0x004d;
                case 18: goto L_0x00db;
                case 19: goto L_0x00db;
                case 20: goto L_0x00db;
                case 21: goto L_0x00db;
                case 22: goto L_0x00db;
                case 23: goto L_0x00db;
                case 24: goto L_0x00db;
                case 25: goto L_0x00db;
                case 26: goto L_0x00db;
                case 27: goto L_0x00db;
                case 28: goto L_0x00db;
                case 29: goto L_0x00db;
                case 30: goto L_0x00db;
                case 31: goto L_0x00db;
                case 32: goto L_0x00db;
                case 33: goto L_0x00db;
                case 34: goto L_0x00db;
                case 35: goto L_0x00db;
                case 36: goto L_0x00db;
                case 37: goto L_0x00db;
                case 38: goto L_0x00db;
                case 39: goto L_0x00db;
                case 40: goto L_0x00db;
                case 41: goto L_0x00db;
                case 42: goto L_0x00db;
                case 43: goto L_0x00db;
                case 44: goto L_0x00db;
                case 45: goto L_0x00db;
                case 46: goto L_0x00db;
                case 47: goto L_0x00db;
                case 48: goto L_0x00db;
                case 49: goto L_0x00db;
                case 50: goto L_0x00db;
                case 51: goto L_0x005b;
                case 52: goto L_0x0070;
                case 53: goto L_0x00c0;
                case 54: goto L_0x00c0;
                case 55: goto L_0x00af;
                case 56: goto L_0x00c0;
                case 57: goto L_0x00af;
                case 58: goto L_0x0085;
                case 59: goto L_0x009c;
                case 60: goto L_0x00d5;
                case 61: goto L_0x00d5;
                case 62: goto L_0x00af;
                case 63: goto L_0x00af;
                case 64: goto L_0x00af;
                case 65: goto L_0x00c0;
                case 66: goto L_0x00af;
                case 67: goto L_0x00c0;
                case 68: goto L_0x00d5;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r4 = r4 + 4
            goto L_0x0005
        L_0x001e:
            int r3 = r3 * 53
            X.4XX r0 = X.C90904f2.A02
            double r0 = r0.A02(r10, r1)
            goto L_0x006b
        L_0x0027:
            int r3 = r3 * 53
            X.4XX r0 = X.C90904f2.A02
            float r0 = r0.A03(r10, r1)
            goto L_0x0080
        L_0x0030:
            int r3 = r3 * 53
            X.4XX r0 = X.C90904f2.A02
            long r0 = r0.A05(r10, r1)
            goto L_0x00d0
        L_0x003a:
            int r3 = r3 * 53
            X.4XX r0 = X.C90904f2.A02
            int r1 = r0.A04(r10, r1)
            goto L_0x00e5
        L_0x0044:
            int r3 = r3 * 53
            X.4XX r0 = X.C90904f2.A02
            boolean r0 = r0.A0F(r10, r1)
            goto L_0x0095
        L_0x004d:
            java.lang.Object r0 = X.C90904f2.A01(r10, r1)
            if (r0 == 0) goto L_0x0057
            int r7 = r0.hashCode()
        L_0x0057:
            int r3 = r3 * 53
            int r3 = r3 + r7
            goto L_0x001b
        L_0x005b:
            boolean r0 = r9.A0D(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            int r3 = r3 * 53
            java.lang.Object r0 = X.C90904f2.A01(r10, r1)
            double r0 = X.AnonymousClass3K3.A01(r0)
        L_0x006b:
            long r0 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x00d0
        L_0x0070:
            boolean r0 = r9.A0D(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            int r3 = r3 * 53
            java.lang.Object r0 = X.C90904f2.A01(r10, r1)
            float r0 = X.AnonymousClass000.A04(r0)
        L_0x0080:
            int r1 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00e5
        L_0x0085:
            boolean r0 = r9.A0D(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            int r3 = r3 * 53
            java.lang.Object r0 = X.C90904f2.A01(r10, r1)
            boolean r0 = X.AnonymousClass000.A1X(r0)
        L_0x0095:
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r0 == 0) goto L_0x00e5
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L_0x00e5
        L_0x009c:
            boolean r0 = r9.A0D(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
        L_0x00a2:
            int r3 = r3 * 53
            java.lang.Object r0 = X.C90904f2.A01(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.hashCode()
            goto L_0x00e5
        L_0x00af:
            boolean r0 = r9.A0D(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            int r3 = r3 * 53
            java.lang.Object r0 = X.C90904f2.A01(r10, r1)
            int r1 = X.AnonymousClass000.A0D(r0)
            goto L_0x00e5
        L_0x00c0:
            boolean r0 = r9.A0D(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
            int r3 = r3 * 53
            java.lang.Object r0 = X.C90904f2.A01(r10, r1)
            long r0 = X.C13700nu.A01(r0)
        L_0x00d0:
            int r1 = X.AnonymousClass3K2.A04(r0)
            goto L_0x00e5
        L_0x00d5:
            boolean r0 = r9.A0D(r10, r8, r4)
            if (r0 == 0) goto L_0x001b
        L_0x00db:
            int r3 = r3 * 53
            java.lang.Object r0 = X.C90904f2.A01(r10, r1)
            int r1 = r0.hashCode()
        L_0x00e5:
            int r3 = r3 + r1
            goto L_0x001b
        L_0x00e8:
            int r1 = r3 * 53
            X.3Z1 r10 = (X.AnonymousClass3Z1) r10
            X.4dY r0 = r10.zzjp
            int r0 = X.AnonymousClass3K2.A06(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98324rS.AHj(java.lang.Object):int");
    }

    public final Object ALj() {
        return ((AnonymousClass3Z1) this.A06).A07(4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02cf, code lost:
        ((X.C98344rU) r6).A00.A0A(r7, (java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02df, code lost:
        if (r0 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02e1, code lost:
        r12 = A04(r5, r1);
        r11 = A0B(r8);
        r1 = ((X.C98344rU) r6).A00;
        r12 = (X.AnonymousClass5UZ) r12;
        X.AnonymousClass3K3.A1A(r1, r7);
        r1.A08(X.AnonymousClass3Z1.A00(r11, r12));
        r11.Aiv(r1.A00, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0305, code lost:
        if (r0 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0307, code lost:
        r1 = A04(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x030b, code lost:
        X.AnonymousClass3K2.A16((X.AnonymousClass556) r1, ((X.C98344rU) r6).A00, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0325, code lost:
        X.C98344rU.A00(r6, r7).A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x033c, code lost:
        r11 = X.C98344rU.A00(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0340, code lost:
        if (r1 >= 0) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0342, code lost:
        r0 = (long) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0353, code lost:
        r11 = X.C98344rU.A00(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0366, code lost:
        X.AnonymousClass3K3.A1B(((X.C98344rU) r6).A00, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x037e, code lost:
        r11 = ((X.C98344rU) r6).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0383, code lost:
        X.AnonymousClass3K4.A0p(r11, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0396, code lost:
        r11 = ((X.C98344rU) r6).A00;
        r1 = (r1 >> 31) ^ (r1 << 1);
        r11.A08(r7 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03a5, code lost:
        r11.A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03b8, code lost:
        r11 = ((X.C98344rU) r6).A00;
        r0 = X.AnonymousClass3K3.A0R(r12);
        r11.A08(r7 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03c6, code lost:
        r11.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03cf, code lost:
        if (r0 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03d1, code lost:
        r0 = (X.C98344rU) r6;
        A06(r0, A0B(r8), A04(r5, r1), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0412, code lost:
        r8 = r8 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x055f, code lost:
        X.C90954f8.A0H(r6, r1, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0565, code lost:
        X.C90954f8.A0M(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0573, code lost:
        X.C90954f8.A0J(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0581, code lost:
        X.C90954f8.A0O(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x058f, code lost:
        X.C90954f8.A0P(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x059d, code lost:
        X.C90954f8.A0L(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05e3, code lost:
        X.C90954f8.A0N(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05f1, code lost:
        X.C90954f8.A0I(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05ff, code lost:
        X.C90954f8.A0K(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x060d, code lost:
        X.C90954f8.A0G(r6, (java.util.List) r9.getObject(r5, r0), r10[r8], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0643, code lost:
        if (r14 == false) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0645, code lost:
        r13 = r9.getObject(r5, r0);
        A06((X.C98344rU) r6, A0B(r8), r13, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x065d, code lost:
        r13 = ((X.C98344rU) r6).A00;
        r0 = X.AnonymousClass3K3.A0R(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0670, code lost:
        r13 = ((X.C98344rU) r6).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x067f, code lost:
        X.AnonymousClass3K3.A1B(((X.C98344rU) r6).A00, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0691, code lost:
        r13 = X.C98344rU.A00(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0695, code lost:
        if (r1 >= 0) goto L_0x06b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0697, code lost:
        r0 = (long) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x06a2, code lost:
        r13 = ((X.C98344rU) r6).A00;
        r1 = (r1 >> 31) ^ (r1 << 1);
        r13.A08(r7 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x06b1, code lost:
        r13.A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06be, code lost:
        X.C98344rU.A00(r6, r7).A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x06c9, code lost:
        if (r14 == false) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x06cb, code lost:
        r14 = r9.getObject(r5, r0);
        r13 = A0B(r8);
        r1 = ((X.C98344rU) r6).A00;
        r14 = (X.AnonymousClass5UZ) r14;
        X.AnonymousClass3K3.A1A(r1, r7);
        r1.A08(X.AnonymousClass3Z1.A00(r13, r14));
        r13.Aiv(r1.A00, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x06ed, code lost:
        if (r14 == false) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x06ef, code lost:
        r1 = r9.getObject(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06f5, code lost:
        if ((r1 instanceof java.lang.String) == false) goto L_0x070b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x06f7, code lost:
        ((X.C98344rU) r6).A00.A0A(r7, (java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0705, code lost:
        if (r14 == false) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0707, code lost:
        r1 = r9.getObject(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x070b, code lost:
        X.AnonymousClass3K2.A16((X.AnonymousClass556) r1, ((X.C98344rU) r6).A00, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0721, code lost:
        X.C98344rU.A00(r6, r7).A07(r0 ? (byte) 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0733, code lost:
        r13 = ((X.C98344rU) r6).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0738, code lost:
        r13.A08(r7 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x073d, code lost:
        r13.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x074c, code lost:
        X.AnonymousClass3K3.A1B(((X.C98344rU) r6).A00, r7, java.lang.Float.floatToRawIntBits(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0764, code lost:
        r13 = ((X.C98344rU) r6).A00;
        r0 = java.lang.Double.doubleToRawLongBits(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x076d, code lost:
        X.AnonymousClass3K4.A0p(r13, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r8 = r8 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0282, code lost:
        r11 = ((X.C98344rU) r6).A00;
        r0 = java.lang.Double.doubleToRawLongBits(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x029b, code lost:
        X.AnonymousClass3K3.A1B(((X.C98344rU) r6).A00, r7, java.lang.Float.floatToRawIntBits(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b7, code lost:
        X.C98344rU.A00(r6, r7).A07(r0 ? (byte) 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02c5, code lost:
        if (r0 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c7, code lost:
        r1 = A04(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02cd, code lost:
        if ((r1 instanceof java.lang.String) == false) goto L_0x030b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Aiv(X.C107915Lx r21, java.lang.Object r22) {
        /*
            r20 = this;
            r5 = r22
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 1
            r3 = 0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r20
            boolean r0 = r2.A09
            r6 = r21
            if (r0 == 0) goto L_0x03e1
            int[] r9 = r2.A0A
            int r10 = r9.length
            r8 = 0
        L_0x0015:
            if (r8 >= r10) goto L_0x0775
            int r0 = r8 + 1
            r1 = r9[r0]
            r7 = r9[r8]
            r0 = r1 & r19
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0038;
                case 2: goto L_0x0049;
                case 3: goto L_0x0049;
                case 4: goto L_0x009f;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00b0;
                case 7: goto L_0x005a;
                case 8: goto L_0x0071;
                case 9: goto L_0x0077;
                case 10: goto L_0x006b;
                case 11: goto L_0x007d;
                case 12: goto L_0x009f;
                case 13: goto L_0x00b0;
                case 14: goto L_0x00c1;
                case 15: goto L_0x008e;
                case 16: goto L_0x00d2;
                case 17: goto L_0x00e3;
                case 18: goto L_0x00e9;
                case 19: goto L_0x00f4;
                case 20: goto L_0x00ff;
                case 21: goto L_0x010a;
                case 22: goto L_0x0115;
                case 23: goto L_0x0120;
                case 24: goto L_0x012b;
                case 25: goto L_0x0136;
                case 26: goto L_0x0141;
                case 27: goto L_0x014c;
                case 28: goto L_0x015b;
                case 29: goto L_0x0166;
                case 30: goto L_0x0171;
                case 31: goto L_0x017c;
                case 32: goto L_0x0187;
                case 33: goto L_0x0192;
                case 34: goto L_0x019d;
                case 35: goto L_0x01a8;
                case 36: goto L_0x01b3;
                case 37: goto L_0x01be;
                case 38: goto L_0x01c9;
                case 39: goto L_0x01d4;
                case 40: goto L_0x01df;
                case 41: goto L_0x01ea;
                case 42: goto L_0x01f5;
                case 43: goto L_0x0200;
                case 44: goto L_0x020b;
                case 45: goto L_0x0216;
                case 46: goto L_0x0221;
                case 47: goto L_0x022c;
                case 48: goto L_0x0237;
                case 49: goto L_0x0242;
                case 50: goto L_0x0268;
                case 51: goto L_0x0274;
                case 52: goto L_0x028d;
                case 53: goto L_0x0345;
                case 54: goto L_0x0345;
                case 55: goto L_0x032e;
                case 56: goto L_0x0370;
                case 57: goto L_0x0358;
                case 58: goto L_0x02a9;
                case 59: goto L_0x02c1;
                case 60: goto L_0x02db;
                case 61: goto L_0x0301;
                case 62: goto L_0x0317;
                case 63: goto L_0x032e;
                case 64: goto L_0x0358;
                case 65: goto L_0x0370;
                case 66: goto L_0x0388;
                case 67: goto L_0x03aa;
                case 68: goto L_0x03cb;
                default: goto L_0x0024;
            }
        L_0x0024:
            int r8 = r8 + 4
            goto L_0x0015
        L_0x0027:
            boolean r0 = r2.A0C(r8, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r18
            long r0 = (long) r1
            X.4XX r11 = X.C90904f2.A02
            double r12 = r11.A02(r5, r0)
            goto L_0x0282
        L_0x0038:
            boolean r0 = r2.A0C(r8, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r18
            long r0 = (long) r1
            X.4XX r11 = X.C90904f2.A02
            float r11 = r11.A03(r5, r0)
            goto L_0x029b
        L_0x0049:
            boolean r0 = r2.A0C(r8, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r18
            long r0 = (long) r1
            X.4XX r11 = X.C90904f2.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x0353
        L_0x005a:
            boolean r0 = r2.A0C(r8, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r18
            long r0 = (long) r1
            X.4XX r11 = X.C90904f2.A02
            boolean r0 = r11.A0F(r5, r0)
            goto L_0x02b7
        L_0x006b:
            boolean r0 = r2.A0C(r8, r5)
            goto L_0x0305
        L_0x0071:
            boolean r0 = r2.A0C(r8, r5)
            goto L_0x02c5
        L_0x0077:
            boolean r0 = r2.A0C(r8, r5)
            goto L_0x02df
        L_0x007d:
            boolean r0 = r2.A0C(r8, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r18
            long r0 = (long) r1
            X.4XX r11 = X.C90904f2.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0325
        L_0x008e:
            boolean r0 = r2.A0C(r8, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r18
            long r0 = (long) r1
            X.4XX r11 = X.C90904f2.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0396
        L_0x009f:
            boolean r0 = r2.A0C(r8, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r18
            long r0 = (long) r1
            X.4XX r11 = X.C90904f2.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x033c
        L_0x00b0:
            boolean r0 = r2.A0C(r8, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r18
            long r0 = (long) r1
            X.4XX r11 = X.C90904f2.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0366
        L_0x00c1:
            boolean r0 = r2.A0C(r8, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r18
            long r0 = (long) r1
            X.4XX r11 = X.C90904f2.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x037e
        L_0x00d2:
            boolean r0 = r2.A0C(r8, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r18
            long r0 = (long) r1
            X.4XX r11 = X.C90904f2.A02
            long r12 = r11.A05(r5, r0)
            goto L_0x03b8
        L_0x00e3:
            boolean r0 = r2.A0C(r8, r5)
            goto L_0x03cf
        L_0x00e9:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0D(r6, r0, r7, r3)
            goto L_0x0024
        L_0x00f4:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0E(r6, r0, r7, r3)
            goto L_0x0024
        L_0x00ff:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0F(r6, r0, r7, r3)
            goto L_0x0024
        L_0x010a:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0G(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0115:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0K(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0120:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0I(r6, r0, r7, r3)
            goto L_0x0024
        L_0x012b:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0N(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0136:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0Q(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0141:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0B(r6, r0, r7)
            goto L_0x0024
        L_0x014c:
            r7 = r9[r8]
            java.util.List r1 = A05(r1, r5)
            X.1gd r0 = r2.A0B(r8)
            X.C90954f8.A0A(r0, r6, r1, r7)
            goto L_0x0024
        L_0x015b:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0C(r6, r0, r7)
            goto L_0x0024
        L_0x0166:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0L(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0171:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0P(r6, r0, r7, r3)
            goto L_0x0024
        L_0x017c:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0O(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0187:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0J(r6, r0, r7, r3)
            goto L_0x0024
        L_0x0192:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0M(r6, r0, r7, r3)
            goto L_0x0024
        L_0x019d:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0H(r6, r0, r7, r3)
            goto L_0x0024
        L_0x01a8:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0D(r6, r0, r7, r4)
            goto L_0x0024
        L_0x01b3:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0E(r6, r0, r7, r4)
            goto L_0x0024
        L_0x01be:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0F(r6, r0, r7, r4)
            goto L_0x0024
        L_0x01c9:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0G(r6, r0, r7, r4)
            goto L_0x0024
        L_0x01d4:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0K(r6, r0, r7, r4)
            goto L_0x0024
        L_0x01df:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0I(r6, r0, r7, r4)
            goto L_0x0024
        L_0x01ea:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0N(r6, r0, r7, r4)
            goto L_0x0024
        L_0x01f5:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0Q(r6, r0, r7, r4)
            goto L_0x0024
        L_0x0200:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0L(r6, r0, r7, r4)
            goto L_0x0024
        L_0x020b:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0P(r6, r0, r7, r4)
            goto L_0x0024
        L_0x0216:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0O(r6, r0, r7, r4)
            goto L_0x0024
        L_0x0221:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0J(r6, r0, r7, r4)
            goto L_0x0024
        L_0x022c:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0M(r6, r0, r7, r4)
            goto L_0x0024
        L_0x0237:
            r7 = r9[r8]
            java.util.List r0 = A05(r1, r5)
            X.C90954f8.A0H(r6, r0, r7, r4)
            goto L_0x0024
        L_0x0242:
            r12 = r9[r8]
            java.util.List r13 = A05(r1, r5)
            X.1gd r11 = r2.A0B(r8)
            if (r13 == 0) goto L_0x0024
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0024
            r7 = r6
            X.4rU r7 = (X.C98344rU) r7
            r1 = 0
        L_0x0258:
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x0024
            java.lang.Object r0 = r13.get(r1)
            A06(r7, r11, r0, r12)
            int r1 = r1 + 1
            goto L_0x0258
        L_0x0268:
            java.lang.Object r0 = A04(r5, r1)
            if (r0 == 0) goto L_0x0024
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0274:
            boolean r0 = r2.A0D(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A04(r5, r1)
            double r12 = X.AnonymousClass3K3.A01(r0)
        L_0x0282:
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r11 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r12)
            goto L_0x0383
        L_0x028d:
            boolean r0 = r2.A0D(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A04(r5, r1)
            float r11 = X.AnonymousClass000.A04(r0)
        L_0x029b:
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r11)
            X.AnonymousClass3K3.A1B(r1, r7, r0)
            goto L_0x0024
        L_0x02a9:
            boolean r0 = r2.A0D(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A04(r5, r1)
            boolean r0 = X.AnonymousClass000.A1X(r0)
        L_0x02b7:
            X.1ga r1 = X.C98344rU.A00(r6, r7)
            byte r0 = (byte) r0
            r1.A07(r0)
            goto L_0x0024
        L_0x02c1:
            boolean r0 = r2.A0D(r5, r7, r8)
        L_0x02c5:
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A04(r5, r1)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x030b
            java.lang.String r1 = (java.lang.String) r1
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r0 = r0.A00
            r0.A0A(r7, r1)
            goto L_0x0024
        L_0x02db:
            boolean r0 = r2.A0D(r5, r7, r8)
        L_0x02df:
            if (r0 == 0) goto L_0x0024
            java.lang.Object r12 = A04(r5, r1)
            X.1gd r11 = r2.A0B(r8)
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r1 = r0.A00
            X.5UZ r12 = (X.AnonymousClass5UZ) r12
            X.AnonymousClass3K3.A1A(r1, r7)
            int r0 = X.AnonymousClass3Z1.A00(r11, r12)
            r1.A08(r0)
            X.4rU r0 = r1.A00
            r11.Aiv(r0, r12)
            goto L_0x0024
        L_0x0301:
            boolean r0 = r2.A0D(r5, r7, r8)
        L_0x0305:
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A04(r5, r1)
        L_0x030b:
            X.556 r1 = (X.AnonymousClass556) r1
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r0 = r0.A00
            X.AnonymousClass3K2.A16(r1, r0, r7)
            goto L_0x0024
        L_0x0317:
            boolean r0 = r2.A0D(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A04(r5, r1)
            int r1 = X.AnonymousClass000.A0D(r0)
        L_0x0325:
            X.1ga r0 = X.C98344rU.A00(r6, r7)
            r0.A08(r1)
            goto L_0x0024
        L_0x032e:
            boolean r0 = r2.A0D(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A04(r5, r1)
            int r1 = X.AnonymousClass000.A0D(r0)
        L_0x033c:
            X.1ga r11 = X.C98344rU.A00(r6, r7)
            if (r1 >= 0) goto L_0x03a5
            long r0 = (long) r1
            goto L_0x03c6
        L_0x0345:
            boolean r0 = r2.A0D(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A04(r5, r1)
            long r0 = X.C13700nu.A01(r0)
        L_0x0353:
            X.1ga r11 = X.C98344rU.A00(r6, r7)
            goto L_0x03c6
        L_0x0358:
            boolean r0 = r2.A0D(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A04(r5, r1)
            int r1 = X.AnonymousClass000.A0D(r0)
        L_0x0366:
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r0 = r0.A00
            X.AnonymousClass3K3.A1B(r0, r7, r1)
            goto L_0x0024
        L_0x0370:
            boolean r0 = r2.A0D(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A04(r5, r1)
            long r0 = X.C13700nu.A01(r0)
        L_0x037e:
            r11 = r6
            X.4rU r11 = (X.C98344rU) r11
            X.1ga r11 = r11.A00
        L_0x0383:
            X.AnonymousClass3K4.A0p(r11, r7, r0)
            goto L_0x0024
        L_0x0388:
            boolean r0 = r2.A0D(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A04(r5, r1)
            int r1 = X.AnonymousClass000.A0D(r0)
        L_0x0396:
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r11 = r0.A00
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            int r0 = r7 << 3
            r11.A08(r0)
        L_0x03a5:
            r11.A08(r1)
            goto L_0x0024
        L_0x03aa:
            boolean r0 = r2.A0D(r5, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A04(r5, r1)
            long r12 = X.C13700nu.A01(r0)
        L_0x03b8:
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r11 = r0.A00
            long r0 = X.AnonymousClass3K3.A0R(r12)
            int r7 = r7 << 3
            r11.A08(r7)
        L_0x03c6:
            r11.A0B(r0)
            goto L_0x0024
        L_0x03cb:
            boolean r0 = r2.A0D(r5, r7, r8)
        L_0x03cf:
            if (r0 == 0) goto L_0x0024
            java.lang.Object r11 = A04(r5, r1)
            X.1gd r1 = r2.A0B(r8)
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            A06(r0, r1, r11, r7)
            goto L_0x0024
        L_0x03e1:
            r11 = -1
            int[] r10 = r2.A0A
            int r12 = r10.length
            sun.misc.Unsafe r9 = A0F
            r8 = 0
            r17 = 0
        L_0x03ea:
            if (r8 >= r12) goto L_0x0775
            int r0 = r8 + 1
            r15 = r10[r0]
            r7 = r10[r8]
            r0 = r19 & r15
            int r13 = r0 >>> 20
            r0 = 17
            if (r13 > r0) goto L_0x0772
            int r0 = r8 + 2
            r16 = r10[r0]
            r14 = r16 & r18
            if (r14 == r11) goto L_0x0408
            long r0 = (long) r14
            int r17 = r9.getInt(r5, r0)
            r11 = r14
        L_0x0408:
            int r0 = r16 >>> 20
            int r14 = r4 << r0
        L_0x040c:
            r15 = r15 & r18
            long r0 = (long) r15
            switch(r13) {
                case 0: goto L_0x075a;
                case 1: goto L_0x0742;
                case 2: goto L_0x072b;
                case 3: goto L_0x072b;
                case 4: goto L_0x0689;
                case 5: goto L_0x0668;
                case 6: goto L_0x0677;
                case 7: goto L_0x0717;
                case 8: goto L_0x06eb;
                case 9: goto L_0x06c7;
                case 10: goto L_0x0703;
                case 11: goto L_0x06b6;
                case 12: goto L_0x0689;
                case 13: goto L_0x0677;
                case 14: goto L_0x0668;
                case 15: goto L_0x069a;
                case 16: goto L_0x0655;
                case 17: goto L_0x0641;
                case 18: goto L_0x0634;
                case 19: goto L_0x0627;
                case 20: goto L_0x061a;
                case 21: goto L_0x060c;
                case 22: goto L_0x05fe;
                case 23: goto L_0x05f0;
                case 24: goto L_0x05e2;
                case 25: goto L_0x05d5;
                case 26: goto L_0x05c8;
                case 27: goto L_0x05b7;
                case 28: goto L_0x05aa;
                case 29: goto L_0x059c;
                case 30: goto L_0x058e;
                case 31: goto L_0x0580;
                case 32: goto L_0x0572;
                case 33: goto L_0x0564;
                case 34: goto L_0x0556;
                case 35: goto L_0x0549;
                case 36: goto L_0x053c;
                case 37: goto L_0x052f;
                case 38: goto L_0x052c;
                case 39: goto L_0x0529;
                case 40: goto L_0x0526;
                case 41: goto L_0x0523;
                case 42: goto L_0x0516;
                case 43: goto L_0x0513;
                case 44: goto L_0x0511;
                case 45: goto L_0x050f;
                case 46: goto L_0x050d;
                case 47: goto L_0x050b;
                case 48: goto L_0x0501;
                case 49: goto L_0x04d9;
                case 50: goto L_0x04cd;
                case 51: goto L_0x04bd;
                case 52: goto L_0x04ad;
                case 53: goto L_0x045b;
                case 54: goto L_0x045b;
                case 55: goto L_0x046b;
                case 56: goto L_0x043b;
                case 57: goto L_0x044b;
                case 58: goto L_0x049d;
                case 59: goto L_0x0497;
                case 60: goto L_0x0491;
                case 61: goto L_0x048b;
                case 62: goto L_0x047b;
                case 63: goto L_0x046b;
                case 64: goto L_0x044b;
                case 65: goto L_0x043b;
                case 66: goto L_0x042b;
                case 67: goto L_0x041b;
                case 68: goto L_0x0415;
                default: goto L_0x0412;
            }
        L_0x0412:
            int r8 = r8 + 4
            goto L_0x03ea
        L_0x0415:
            boolean r14 = r2.A0D(r5, r7, r8)
            goto L_0x0643
        L_0x041b:
            boolean r13 = r2.A0D(r5, r7, r8)
            if (r13 == 0) goto L_0x0412
            java.lang.Object r0 = X.C90904f2.A01(r5, r0)
            long r14 = X.C13700nu.A01(r0)
            goto L_0x065d
        L_0x042b:
            boolean r13 = r2.A0D(r5, r7, r8)
            if (r13 == 0) goto L_0x0412
            java.lang.Object r0 = X.C90904f2.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0D(r0)
            goto L_0x06a2
        L_0x043b:
            boolean r13 = r2.A0D(r5, r7, r8)
            if (r13 == 0) goto L_0x0412
            java.lang.Object r0 = X.C90904f2.A01(r5, r0)
            long r0 = X.C13700nu.A01(r0)
            goto L_0x0670
        L_0x044b:
            boolean r13 = r2.A0D(r5, r7, r8)
            if (r13 == 0) goto L_0x0412
            java.lang.Object r0 = X.C90904f2.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0D(r0)
            goto L_0x067f
        L_0x045b:
            boolean r13 = r2.A0D(r5, r7, r8)
            if (r13 == 0) goto L_0x0412
            java.lang.Object r0 = X.C90904f2.A01(r5, r0)
            long r0 = X.C13700nu.A01(r0)
            goto L_0x0733
        L_0x046b:
            boolean r13 = r2.A0D(r5, r7, r8)
            if (r13 == 0) goto L_0x0412
            java.lang.Object r0 = X.C90904f2.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0D(r0)
            goto L_0x0691
        L_0x047b:
            boolean r13 = r2.A0D(r5, r7, r8)
            if (r13 == 0) goto L_0x0412
            java.lang.Object r0 = X.C90904f2.A01(r5, r0)
            int r1 = X.AnonymousClass000.A0D(r0)
            goto L_0x06be
        L_0x048b:
            boolean r14 = r2.A0D(r5, r7, r8)
            goto L_0x0705
        L_0x0491:
            boolean r14 = r2.A0D(r5, r7, r8)
            goto L_0x06c9
        L_0x0497:
            boolean r14 = r2.A0D(r5, r7, r8)
            goto L_0x06ed
        L_0x049d:
            boolean r13 = r2.A0D(r5, r7, r8)
            if (r13 == 0) goto L_0x0412
            java.lang.Object r0 = X.C90904f2.A01(r5, r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            goto L_0x0721
        L_0x04ad:
            boolean r13 = r2.A0D(r5, r7, r8)
            if (r13 == 0) goto L_0x0412
            java.lang.Object r0 = X.C90904f2.A01(r5, r0)
            float r13 = X.AnonymousClass000.A04(r0)
            goto L_0x074c
        L_0x04bd:
            boolean r13 = r2.A0D(r5, r7, r8)
            if (r13 == 0) goto L_0x0412
            java.lang.Object r0 = X.C90904f2.A01(r5, r0)
            double r14 = X.AnonymousClass3K3.A01(r0)
            goto L_0x0764
        L_0x04cd:
            java.lang.Object r0 = r9.getObject(r5, r0)
            if (r0 == 0) goto L_0x0412
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x04d9:
            r13 = r10[r8]
            java.lang.Object r15 = r9.getObject(r5, r0)
            java.util.List r15 = (java.util.List) r15
            X.1gd r14 = r2.A0B(r8)
            if (r15 == 0) goto L_0x0412
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x0412
            r7 = r6
            X.4rU r7 = (X.C98344rU) r7
            r1 = 0
        L_0x04f1:
            int r0 = r15.size()
            if (r1 >= r0) goto L_0x0412
            java.lang.Object r0 = r15.get(r1)
            A06(r7, r14, r0, r13)
            int r1 = r1 + 1
            goto L_0x04f1
        L_0x0501:
            r7 = r10[r8]
            java.lang.Object r1 = r9.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            goto L_0x055f
        L_0x050b:
            r13 = 1
            goto L_0x0565
        L_0x050d:
            r13 = 1
            goto L_0x0573
        L_0x050f:
            r13 = 1
            goto L_0x0581
        L_0x0511:
            r13 = 1
            goto L_0x058f
        L_0x0513:
            r13 = 1
            goto L_0x059d
        L_0x0516:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0Q(r6, r0, r7, r4)
            goto L_0x0412
        L_0x0523:
            r13 = 1
            goto L_0x05e3
        L_0x0526:
            r13 = 1
            goto L_0x05f1
        L_0x0529:
            r13 = 1
            goto L_0x05ff
        L_0x052c:
            r13 = 1
            goto L_0x060d
        L_0x052f:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0F(r6, r0, r7, r4)
            goto L_0x0412
        L_0x053c:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0E(r6, r0, r7, r4)
            goto L_0x0412
        L_0x0549:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0D(r6, r0, r7, r4)
            goto L_0x0412
        L_0x0556:
            r7 = r10[r8]
            java.lang.Object r1 = r9.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
        L_0x055f:
            X.C90954f8.A0H(r6, r1, r7, r0)
            goto L_0x0412
        L_0x0564:
            r13 = 0
        L_0x0565:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0M(r6, r0, r7, r13)
            goto L_0x0412
        L_0x0572:
            r13 = 0
        L_0x0573:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0J(r6, r0, r7, r13)
            goto L_0x0412
        L_0x0580:
            r13 = 0
        L_0x0581:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0O(r6, r0, r7, r13)
            goto L_0x0412
        L_0x058e:
            r13 = 0
        L_0x058f:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0P(r6, r0, r7, r13)
            goto L_0x0412
        L_0x059c:
            r13 = 0
        L_0x059d:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0L(r6, r0, r7, r13)
            goto L_0x0412
        L_0x05aa:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0C(r6, r0, r7)
            goto L_0x0412
        L_0x05b7:
            r7 = r10[r8]
            java.lang.Object r1 = r9.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            X.1gd r0 = r2.A0B(r8)
            X.C90954f8.A0A(r0, r6, r1, r7)
            goto L_0x0412
        L_0x05c8:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0B(r6, r0, r7)
            goto L_0x0412
        L_0x05d5:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0Q(r6, r0, r7, r3)
            goto L_0x0412
        L_0x05e2:
            r13 = 0
        L_0x05e3:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0N(r6, r0, r7, r13)
            goto L_0x0412
        L_0x05f0:
            r13 = 0
        L_0x05f1:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0I(r6, r0, r7, r13)
            goto L_0x0412
        L_0x05fe:
            r13 = 0
        L_0x05ff:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0K(r6, r0, r7, r13)
            goto L_0x0412
        L_0x060c:
            r13 = 0
        L_0x060d:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0G(r6, r0, r7, r13)
            goto L_0x0412
        L_0x061a:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0F(r6, r0, r7, r3)
            goto L_0x0412
        L_0x0627:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0E(r6, r0, r7, r3)
            goto L_0x0412
        L_0x0634:
            r7 = r10[r8]
            java.lang.Object r0 = r9.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90954f8.A0D(r6, r0, r7, r3)
            goto L_0x0412
        L_0x0641:
            r14 = r14 & r17
        L_0x0643:
            if (r14 == 0) goto L_0x0412
            java.lang.Object r13 = r9.getObject(r5, r0)
            X.1gd r1 = r2.A0B(r8)
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            A06(r0, r1, r13, r7)
            goto L_0x0412
        L_0x0655:
            r14 = r14 & r17
            if (r14 == 0) goto L_0x0412
            long r14 = r9.getLong(r5, r0)
        L_0x065d:
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r13 = r0.A00
            long r0 = X.AnonymousClass3K3.A0R(r14)
            goto L_0x0738
        L_0x0668:
            r14 = r14 & r17
            if (r14 == 0) goto L_0x0412
            long r0 = r9.getLong(r5, r0)
        L_0x0670:
            r13 = r6
            X.4rU r13 = (X.C98344rU) r13
            X.1ga r13 = r13.A00
            goto L_0x076d
        L_0x0677:
            r14 = r14 & r17
            if (r14 == 0) goto L_0x0412
            int r1 = r9.getInt(r5, r0)
        L_0x067f:
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r0 = r0.A00
            X.AnonymousClass3K3.A1B(r0, r7, r1)
            goto L_0x0412
        L_0x0689:
            r14 = r14 & r17
            if (r14 == 0) goto L_0x0412
            int r1 = r9.getInt(r5, r0)
        L_0x0691:
            X.1ga r13 = X.C98344rU.A00(r6, r7)
            if (r1 >= 0) goto L_0x06b1
            long r0 = (long) r1
            goto L_0x073d
        L_0x069a:
            r14 = r14 & r17
            if (r14 == 0) goto L_0x0412
            int r1 = r9.getInt(r5, r0)
        L_0x06a2:
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r13 = r0.A00
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            int r0 = r7 << 3
            r13.A08(r0)
        L_0x06b1:
            r13.A08(r1)
            goto L_0x0412
        L_0x06b6:
            r14 = r14 & r17
            if (r14 == 0) goto L_0x0412
            int r1 = r9.getInt(r5, r0)
        L_0x06be:
            X.1ga r0 = X.C98344rU.A00(r6, r7)
            r0.A08(r1)
            goto L_0x0412
        L_0x06c7:
            r14 = r14 & r17
        L_0x06c9:
            if (r14 == 0) goto L_0x0412
            java.lang.Object r14 = r9.getObject(r5, r0)
            X.1gd r13 = r2.A0B(r8)
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r1 = r0.A00
            X.5UZ r14 = (X.AnonymousClass5UZ) r14
            X.AnonymousClass3K3.A1A(r1, r7)
            int r0 = X.AnonymousClass3Z1.A00(r13, r14)
            r1.A08(r0)
            X.4rU r0 = r1.A00
            r13.Aiv(r0, r14)
            goto L_0x0412
        L_0x06eb:
            r14 = r14 & r17
        L_0x06ed:
            if (r14 == 0) goto L_0x0412
            java.lang.Object r1 = r9.getObject(r5, r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x070b
            java.lang.String r1 = (java.lang.String) r1
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r0 = r0.A00
            r0.A0A(r7, r1)
            goto L_0x0412
        L_0x0703:
            r14 = r14 & r17
        L_0x0705:
            if (r14 == 0) goto L_0x0412
            java.lang.Object r1 = r9.getObject(r5, r0)
        L_0x070b:
            X.556 r1 = (X.AnonymousClass556) r1
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r0 = r0.A00
            X.AnonymousClass3K2.A16(r1, r0, r7)
            goto L_0x0412
        L_0x0717:
            r14 = r14 & r17
            if (r14 == 0) goto L_0x0412
            X.4XX r13 = X.C90904f2.A02
            boolean r0 = r13.A0F(r5, r0)
        L_0x0721:
            X.1ga r1 = X.C98344rU.A00(r6, r7)
            byte r0 = (byte) r0
            r1.A07(r0)
            goto L_0x0412
        L_0x072b:
            r14 = r14 & r17
            if (r14 == 0) goto L_0x0412
            long r0 = r9.getLong(r5, r0)
        L_0x0733:
            r13 = r6
            X.4rU r13 = (X.C98344rU) r13
            X.1ga r13 = r13.A00
        L_0x0738:
            int r7 = r7 << 3
            r13.A08(r7)
        L_0x073d:
            r13.A0B(r0)
            goto L_0x0412
        L_0x0742:
            r14 = r14 & r17
            if (r14 == 0) goto L_0x0412
            X.4XX r13 = X.C90904f2.A02
            float r13 = r13.A03(r5, r0)
        L_0x074c:
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r13)
            X.AnonymousClass3K3.A1B(r1, r7, r0)
            goto L_0x0412
        L_0x075a:
            r14 = r14 & r17
            if (r14 == 0) goto L_0x0412
            X.4XX r13 = X.C90904f2.A02
            double r14 = r13.A02(r5, r0)
        L_0x0764:
            r0 = r6
            X.4rU r0 = (X.C98344rU) r0
            X.1ga r13 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r14)
        L_0x076d:
            X.AnonymousClass3K4.A0p(r13, r7, r0)
            goto L_0x0412
        L_0x0772:
            r14 = 0
            goto L_0x040c
        L_0x0775:
            X.3Z1 r5 = (X.AnonymousClass3Z1) r5
            X.4dY r0 = r5.zzjp
            r0.A02(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98324rS.Aiv(X.5Lx, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        r9.putInt(r7, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b0, code lost:
        r0 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        r9.putObject(r7, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fc, code lost:
        r9.putLong(r7, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0115, code lost:
        r10 = r0 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012a, code lost:
        r10 = r0 + 8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Aiw(X.C84184Jo r32, java.lang.Object r33, byte[] r34, int r35, int r36) {
        /*
            r31 = this;
            r10 = r35
            r4 = r31
            boolean r0 = r4.A09
            r8 = r32
            r7 = r33
            r6 = r34
            r5 = r36
            if (r0 == 0) goto L_0x01e6
            sun.misc.Unsafe r9 = A0F
        L_0x0012:
            if (r10 >= r5) goto L_0x01dc
            int r0 = r10 + 1
            byte r12 = r34[r10]
            if (r12 >= 0) goto L_0x0020
            int r0 = X.C90724eh.A04(r8, r6, r12, r0)
            int r12 = r8.A00
        L_0x0020:
            int r16 = r12 >>> 3
            r13 = r12 & 7
            r1 = r16
            int r14 = r4.A07(r1)
            if (r14 < 0) goto L_0x0045
            int[] r2 = r4.A0A
            int r1 = r14 + 1
            r15 = r2[r1]
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r15
            int r1 = r1 >>> 20
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r15
            long r2 = (long) r2
            r11 = 17
            r10 = 2
            if (r1 > r11) goto L_0x012e
            r11 = 1
            switch(r1) {
                case 0: goto L_0x0119;
                case 1: goto L_0x0105;
                case 2: goto L_0x00f4;
                case 3: goto L_0x00f4;
                case 4: goto L_0x0073;
                case 5: goto L_0x00e8;
                case 6: goto L_0x00dd;
                case 7: goto L_0x00c7;
                case 8: goto L_0x009d;
                case 9: goto L_0x0086;
                case 10: goto L_0x007f;
                case 11: goto L_0x0073;
                case 12: goto L_0x0073;
                case 13: goto L_0x00dd;
                case 14: goto L_0x00e8;
                case 15: goto L_0x0064;
                case 16: goto L_0x0056;
                default: goto L_0x0045;
            }
        L_0x0045:
            X.4dY r14 = X.AnonymousClass3Z1.A01(r7)
            r13 = r8
            r15 = r6
            r16 = r12
            r17 = r0
            r18 = r5
            int r10 = X.C90724eh.A00(r13, r14, r15, r16, r17, r18)
            goto L_0x0012
        L_0x0056:
            if (r13 != 0) goto L_0x0045
            int r10 = X.C90724eh.A02(r8, r6, r0)
            long r0 = r8.A01
            long r0 = X.AnonymousClass3K2.A0H(r0)
            goto L_0x00fc
        L_0x0064:
            if (r13 != 0) goto L_0x0045
            int r10 = X.C90724eh.A01(r8, r6, r0)
            int r0 = r8.A00
            int r1 = r0 >>> 1
            r0 = r0 & 1
            int r0 = -r0
            r0 = r0 ^ r1
            goto L_0x007b
        L_0x0073:
            if (r13 != 0) goto L_0x0045
            int r10 = X.C90724eh.A01(r8, r6, r0)
            int r0 = r8.A00
        L_0x007b:
            r9.putInt(r7, r2, r0)
            goto L_0x0012
        L_0x007f:
            if (r13 != r10) goto L_0x0045
            int r10 = X.C90724eh.A03(r8, r6, r0)
            goto L_0x00b0
        L_0x0086:
            if (r13 != r10) goto L_0x0045
            X.1gd r1 = r4.A0B(r14)
            int r10 = A00(r8, r1, r6, r0, r5)
            java.lang.Object r1 = r9.getObject(r7, r2)
            if (r1 == 0) goto L_0x00b0
            java.lang.Object r0 = r8.A02
            java.lang.Object r0 = X.AnonymousClass4ZB.A00(r1, r0)
            goto L_0x00b2
        L_0x009d:
            if (r13 != r10) goto L_0x0045
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r15
            if (r1 != 0) goto L_0x00c2
            int r10 = X.C90724eh.A01(r8, r6, r0)
            int r11 = r8.A00
            if (r11 != 0) goto L_0x00b7
            java.lang.String r0 = ""
            r8.A02 = r0
        L_0x00b0:
            java.lang.Object r0 = r8.A02
        L_0x00b2:
            r9.putObject(r7, r2, r0)
            goto L_0x0012
        L_0x00b7:
            java.nio.charset.Charset r1 = X.AnonymousClass4ZB.A03
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r10, r11, r1)
            r8.A02 = r0
            int r10 = r10 + r11
            goto L_0x00b0
        L_0x00c2:
            int r10 = A02(r8, r6, r0)
            goto L_0x00b0
        L_0x00c7:
            if (r13 != 0) goto L_0x0045
            int r10 = X.C90724eh.A02(r8, r6, r0)
            long r0 = r8.A01
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x00d6
            r11 = 0
        L_0x00d6:
            X.4XX r0 = X.C90904f2.A02
            r0.A0D(r7, r2, r11)
            goto L_0x0012
        L_0x00dd:
            r1 = 5
            if (r13 != r1) goto L_0x0045
            int r1 = X.AnonymousClass3K2.A0D(r6, r0)
            r9.putInt(r7, r2, r1)
            goto L_0x0115
        L_0x00e8:
            if (r13 != r11) goto L_0x0045
            long r13 = X.AnonymousClass3K2.A0K(r6, r0)
            r10 = r7
            r11 = r2
            r9.putLong(r10, r11, r13)
            goto L_0x012a
        L_0x00f4:
            if (r13 != 0) goto L_0x0045
            int r10 = X.C90724eh.A02(r8, r6, r0)
            long r0 = r8.A01
        L_0x00fc:
            r11 = r9
            r12 = r7
            r13 = r2
            r15 = r0
            r11.putLong(r12, r13, r15)
            goto L_0x0012
        L_0x0105:
            r1 = 5
            if (r13 != r1) goto L_0x0045
            int r1 = X.AnonymousClass3K2.A0D(r6, r0)
            float r10 = java.lang.Float.intBitsToFloat(r1)
            X.4XX r1 = X.C90904f2.A02
            r1.A0A(r7, r2, r10)
        L_0x0115:
            int r10 = r0 + 4
            goto L_0x0012
        L_0x0119:
            if (r13 != r11) goto L_0x0045
            long r10 = X.AnonymousClass3K2.A0K(r6, r0)
            double r14 = java.lang.Double.longBitsToDouble(r10)
            X.4XX r10 = X.C90904f2.A02
            r11 = r7
            r12 = r2
            r10.A09(r11, r12, r14)
        L_0x012a:
            int r10 = r0 + 8
            goto L_0x0012
        L_0x012e:
            r11 = 27
            if (r1 != r11) goto L_0x0168
            if (r13 != r10) goto L_0x0045
            java.lang.Object r11 = r9.getObject(r7, r2)
            X.5Ur r11 = (X.C110015Ur) r11
            r1 = r11
            X.5Bn r1 = (X.C105875Bn) r1
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x014c
            int r1 = X.AnonymousClass3K4.A0A(r11)
            X.5Ur r11 = r11.AjM(r1)
            r9.putObject(r7, r2, r11)
        L_0x014c:
            X.1gd r2 = r4.A0B(r14)
            int r10 = A00(r8, r2, r6, r0, r5)
        L_0x0154:
            java.lang.Object r0 = r8.A02
            r11.add(r0)
            if (r10 >= r5) goto L_0x0012
            int r1 = X.C90724eh.A01(r8, r6, r10)
            int r0 = r8.A00
            if (r12 != r0) goto L_0x0012
            int r10 = A00(r8, r2, r6, r1, r5)
            goto L_0x0154
        L_0x0168:
            r11 = 49
            if (r1 > r11) goto L_0x018d
            long r10 = (long) r15
            r23 = r1
            r24 = r10
            r26 = r2
            r19 = r12
            r20 = r16
            r21 = r13
            r22 = r14
            r18 = r5
            r17 = r0
            r16 = r6
            r15 = r7
            r14 = r8
            r13 = r4
            int r10 = r13.A0A(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)
        L_0x0188:
            if (r10 != r0) goto L_0x0012
            r0 = r10
            goto L_0x0045
        L_0x018d:
            r11 = 50
            if (r1 != r11) goto L_0x01bd
            if (r13 != r10) goto L_0x0045
            java.lang.Object r6 = r9.getObject(r7, r2)
            X.5O2 r5 = r4.A05
            r0 = r6
            X.5CQ r0 = (X.AnonymousClass5CQ) r0
            boolean r0 = r0.zzfa
            if (r0 != 0) goto L_0x01b3
            X.5CQ r4 = X.AnonymousClass5CQ.A00
            boolean r1 = r4.isEmpty()
            X.5CQ r0 = new X.5CQ
            if (r1 == 0) goto L_0x01b9
            r0.<init>()
        L_0x01ad:
            r5.Aj8(r0, r6)
            r9.putObject(r7, r2, r0)
        L_0x01b3:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x01b9:
            r0.<init>(r4)
            goto L_0x01ad
        L_0x01bd:
            r17 = r4
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r0
            r22 = r5
            r23 = r12
            r24 = r16
            r25 = r13
            r26 = r15
            r27 = r1
            r28 = r14
            r29 = r2
            int r10 = r17.A09(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0188
        L_0x01dc:
            if (r10 == r5) goto L_0x01f2
            java.lang.String r1 = "Failed to parse the message."
            X.40G r0 = new X.40G
            r0.<init>(r1)
            throw r0
        L_0x01e6:
            r17 = 0
            r11 = r4
            r12 = r8
            r13 = r7
            r14 = r6
            r15 = r10
            r16 = r5
            r11.A08(r12, r13, r14, r15, r16, r17)
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98324rS.Aiw(X.4Jo, java.lang.Object, byte[], int, int):void");
    }

    public final void AjE(Object obj) {
        Object unmodifiableList;
        int[] iArr = this.A0C;
        if (iArr != null) {
            for (int i2 : iArr) {
                long A0J = AnonymousClass3K4.A0J(this.A0A, i2 + 1);
                Object A012 = C90904f2.A01(obj, A0J);
                if (A012 != null) {
                    ((AnonymousClass5CQ) A012).zzfa = false;
                    C90904f2.A07(obj, A0J, A012);
                }
            }
        }
        int[] iArr2 = this.A0D;
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                long j2 = (long) i3;
                if (this.A04 instanceof AnonymousClass3ZS) {
                    ((C105875Bn) ((C110015Ur) C90904f2.A01(obj, j2))).A00 = false;
                } else {
                    List A0f = AnonymousClass3K4.A0f(obj, j2);
                    if (A0f instanceof C109995Up) {
                        unmodifiableList = ((C109995Up) A0f).AjD();
                    } else if (!AnonymousClass3ZT.A00.isAssignableFrom(A0f.getClass())) {
                        unmodifiableList = Collections.unmodifiableList(A0f);
                    }
                    C90904f2.A07(obj, j2, unmodifiableList);
                }
            }
        }
        ((AnonymousClass3Z1) obj).zzjp.A02 = false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019a, code lost:
        if (r12.A09 != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x019c, code lost:
        r1 = r3[r2 + 2];
        r0 = (long) (r1 & 1048575);
        r4 = X.C90904f2.A02;
        r4.A0B(r13, r0, r4.A04(r13, r0) | (1 << (r1 >>> 20)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AjF(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            r2 = 0
        L_0x0001:
            int[] r3 = r12.A0A
            int r0 = r3.length
            r7 = r13
            if (r2 >= r0) goto L_0x01b5
            int r0 = r2 + 1
            r1 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r8 = (long) r0
            r4 = r3[r2]
            int r0 = X.AnonymousClass3K4.A04(r1)
            switch(r0) {
                case 0: goto L_0x0189;
                case 1: goto L_0x0179;
                case 2: goto L_0x013b;
                case 3: goto L_0x013b;
                case 4: goto L_0x014b;
                case 5: goto L_0x013b;
                case 6: goto L_0x014b;
                case 7: goto L_0x0169;
                case 8: goto L_0x015b;
                case 9: goto L_0x004f;
                case 10: goto L_0x015b;
                case 11: goto L_0x014b;
                case 12: goto L_0x014b;
                case 13: goto L_0x014b;
                case 14: goto L_0x013b;
                case 15: goto L_0x014b;
                case 16: goto L_0x013b;
                case 17: goto L_0x004f;
                case 18: goto L_0x009f;
                case 19: goto L_0x009f;
                case 20: goto L_0x009f;
                case 21: goto L_0x009f;
                case 22: goto L_0x009f;
                case 23: goto L_0x009f;
                case 24: goto L_0x009f;
                case 25: goto L_0x009f;
                case 26: goto L_0x009f;
                case 27: goto L_0x009f;
                case 28: goto L_0x009f;
                case 29: goto L_0x009f;
                case 30: goto L_0x009f;
                case 31: goto L_0x009f;
                case 32: goto L_0x009f;
                case 33: goto L_0x009f;
                case 34: goto L_0x009f;
                case 35: goto L_0x009f;
                case 36: goto L_0x009f;
                case 37: goto L_0x009f;
                case 38: goto L_0x009f;
                case 39: goto L_0x009f;
                case 40: goto L_0x009f;
                case 41: goto L_0x009f;
                case 42: goto L_0x009f;
                case 43: goto L_0x009f;
                case 44: goto L_0x009f;
                case 45: goto L_0x009f;
                case 46: goto L_0x009f;
                case 47: goto L_0x009f;
                case 48: goto L_0x009f;
                case 49: goto L_0x009f;
                case 50: goto L_0x008c;
                case 51: goto L_0x0073;
                case 52: goto L_0x0073;
                case 53: goto L_0x0073;
                case 54: goto L_0x0073;
                case 55: goto L_0x0073;
                case 56: goto L_0x0073;
                case 57: goto L_0x0073;
                case 58: goto L_0x0073;
                case 59: goto L_0x0073;
                case 60: goto L_0x001c;
                case 61: goto L_0x0073;
                case 62: goto L_0x0073;
                case 63: goto L_0x0073;
                case 64: goto L_0x0073;
                case 65: goto L_0x0073;
                case 66: goto L_0x0073;
                case 67: goto L_0x0073;
                case 68: goto L_0x001c;
                default: goto L_0x0019;
            }
        L_0x0019:
            int r2 = r2 + 4
            goto L_0x0001
        L_0x001c:
            int r0 = r2 + 1
            r1 = r3[r0]
            r6 = r3[r2]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            boolean r4 = r12.A0D(r14, r6, r2)
            if (r4 == 0) goto L_0x0019
            java.lang.Object r5 = X.C90904f2.A01(r13, r0)
            java.lang.Object r4 = X.C90904f2.A01(r14, r0)
            if (r5 == 0) goto L_0x004c
            if (r4 == 0) goto L_0x0019
            java.lang.Object r4 = X.AnonymousClass4ZB.A00(r5, r4)
        L_0x003d:
            X.C90904f2.A07(r13, r0, r4)
            int r0 = r2 + 2
            long r0 = X.AnonymousClass3K4.A0J(r3, r0)
            X.4XX r3 = X.C90904f2.A02
            r3.A0B(r13, r0, r6)
            goto L_0x0019
        L_0x004c:
            if (r4 == 0) goto L_0x0019
            goto L_0x003d
        L_0x004f:
            int r0 = r2 + 1
            long r0 = X.AnonymousClass3K4.A0J(r3, r0)
            boolean r4 = r12.A0C(r2, r14)
            if (r4 == 0) goto L_0x0019
            java.lang.Object r5 = X.C90904f2.A01(r13, r0)
            java.lang.Object r4 = X.C90904f2.A01(r14, r0)
            if (r5 == 0) goto L_0x0070
            if (r4 == 0) goto L_0x0019
            java.lang.Object r4 = X.AnonymousClass4ZB.A00(r5, r4)
        L_0x006b:
            X.C90904f2.A07(r13, r0, r4)
            goto L_0x0198
        L_0x0070:
            if (r4 == 0) goto L_0x0019
            goto L_0x006b
        L_0x0073:
            boolean r0 = r12.A0D(r14, r4, r2)
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = X.C90904f2.A01(r14, r8)
            X.C90904f2.A07(r13, r8, r0)
            int r0 = r2 + 2
            long r0 = X.AnonymousClass3K4.A0J(r3, r0)
            X.4XX r3 = X.C90904f2.A02
            r3.A0B(r13, r0, r4)
            goto L_0x0019
        L_0x008c:
            X.5O2 r3 = r12.A05
            java.lang.Object r1 = X.C90904f2.A01(r13, r8)
            java.lang.Object r0 = X.C90904f2.A01(r14, r8)
            java.lang.Object r0 = r3.Aj8(r1, r0)
            X.C90904f2.A07(r13, r8, r0)
            goto L_0x0019
        L_0x009f:
            X.4bA r0 = r12.A04
            boolean r0 = r0 instanceof X.AnonymousClass3ZS
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r5 = X.C90904f2.A01(r13, r8)
            X.5Ur r5 = (X.C110015Ur) r5
            java.util.List r4 = X.AnonymousClass3K4.A0f(r14, r8)
            int r3 = r5.size()
            int r1 = r4.size()
            if (r3 <= 0) goto L_0x00cb
            if (r1 <= 0) goto L_0x00ca
            r0 = r5
            X.5Bn r0 = (X.C105875Bn) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00c7
            int r1 = r1 + r3
            X.5Ur r5 = r5.AjM(r1)
        L_0x00c7:
            r5.addAll(r4)
        L_0x00ca:
            r4 = r5
        L_0x00cb:
            X.C90904f2.A07(r13, r8, r4)
            goto L_0x0019
        L_0x00d0:
            java.util.List r4 = X.AnonymousClass3K4.A0f(r14, r8)
            int r5 = r4.size()
            java.util.List r3 = X.AnonymousClass3K4.A0f(r13, r8)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0108
            boolean r0 = r3 instanceof X.C109995Up
            if (r0 == 0) goto L_0x0103
            java.util.ArrayList r0 = X.C13690nt.A0i(r5)
            X.3Z9 r3 = new X.3Z9
            r3.<init>(r0)
        L_0x00ef:
            X.C90904f2.A07(r13, r8, r3)
        L_0x00f2:
            int r1 = r3.size()
            int r0 = r4.size()
            if (r1 <= 0) goto L_0x00cb
            if (r0 <= 0) goto L_0x0101
            r3.addAll(r4)
        L_0x0101:
            r4 = r3
            goto L_0x00cb
        L_0x0103:
            java.util.ArrayList r3 = X.C13690nt.A0i(r5)
            goto L_0x00ef
        L_0x0108:
            java.lang.Class r1 = X.AnonymousClass3ZT.A00
            java.lang.Class r0 = r3.getClass()
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x0125
            int r0 = r3.size()
            int r0 = r0 + r5
            java.util.ArrayList r1 = X.C13690nt.A0i(r0)
            r1.addAll(r3)
        L_0x0120:
            X.C90904f2.A07(r13, r8, r1)
            r3 = r1
            goto L_0x00f2
        L_0x0125:
            boolean r0 = r3 instanceof X.C105885Bo
            if (r0 == 0) goto L_0x00f2
            int r0 = r3.size()
            int r0 = r0 + r5
            java.util.ArrayList r0 = X.C13690nt.A0i(r0)
            X.3Z9 r1 = new X.3Z9
            r1.<init>(r0)
            r1.addAll(r3)
            goto L_0x0120
        L_0x013b:
            boolean r0 = r12.A0C(r2, r14)
            if (r0 == 0) goto L_0x0019
            X.4XX r6 = X.C90904f2.A02
            long r10 = r6.A05(r14, r8)
            r6.A0C(r7, r8, r10)
            goto L_0x0198
        L_0x014b:
            boolean r0 = r12.A0C(r2, r14)
            if (r0 == 0) goto L_0x0019
            X.4XX r1 = X.C90904f2.A02
            int r0 = r1.A04(r14, r8)
            r1.A0B(r13, r8, r0)
            goto L_0x0198
        L_0x015b:
            boolean r0 = r12.A0C(r2, r14)
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = X.C90904f2.A01(r14, r8)
            X.C90904f2.A07(r13, r8, r0)
            goto L_0x0198
        L_0x0169:
            boolean r0 = r12.A0C(r2, r14)
            if (r0 == 0) goto L_0x0019
            X.4XX r1 = X.C90904f2.A02
            boolean r0 = r1.A0F(r14, r8)
            r1.A0D(r13, r8, r0)
            goto L_0x0198
        L_0x0179:
            boolean r0 = r12.A0C(r2, r14)
            if (r0 == 0) goto L_0x0019
            X.4XX r1 = X.C90904f2.A02
            float r0 = r1.A03(r14, r8)
            r1.A0A(r13, r8, r0)
            goto L_0x0198
        L_0x0189:
            boolean r0 = r12.A0C(r2, r14)
            if (r0 == 0) goto L_0x0019
            X.4XX r6 = X.C90904f2.A02
            double r10 = r6.A02(r14, r8)
            r6.A09(r7, r8, r10)
        L_0x0198:
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x0019
            int r0 = r2 + 2
            r1 = r3[r0]
            r5 = 1
            int r0 = r1 >>> 20
            int r5 = r5 << r0
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.4XX r4 = X.C90904f2.A02
            int r3 = r4.A04(r13, r0)
            r3 = r3 | r5
            r4.A0B(r13, r0, r3)
            goto L_0x0019
        L_0x01b5:
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x01bc
            X.C90954f8.A0R(r13, r14)
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98324rS.AjF(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02f3, code lost:
        r2 = r2 + (r1 * X.AnonymousClass3K3.A0A(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04af, code lost:
        if (r1 <= 0) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04b1, code lost:
        r2 = (X.AnonymousClass3K3.A0A(r6) + X.C32561ga.A00(r1)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x057f, code lost:
        r2 = r2 + (r1 * X.AnonymousClass3K3.A0A(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05f4, code lost:
        if (r0 == false) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05f6, code lost:
        r2 = X.C32561ga.A03((X.AnonymousClass5UZ) r5.getObject(r15, r1), A0B(r3), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x060e, code lost:
        r2 = X.AnonymousClass3K3.A0A(r6);
        r0 = X.C32561ga.A01(X.AnonymousClass3K3.A0R(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0624, code lost:
        r2 = X.AnonymousClass3K3.A0A(r6);
        r0 = X.C32561ga.A00((r0 >> 31) ^ (r0 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x063b, code lost:
        r2 = X.AnonymousClass3K3.A0A(r6);
        r0 = X.AnonymousClass3K3.A09(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x064d, code lost:
        r2 = X.AnonymousClass3K3.A0A(r6);
        r0 = X.C32561ga.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0659, code lost:
        if (r0 == false) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x065b, code lost:
        r2 = X.C90954f8.A00(A0B(r3), r5.getObject(r15, r1), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x066b, code lost:
        if (r0 == false) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x066d, code lost:
        r2 = r5.getObject(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0673, code lost:
        if ((r2 instanceof X.AnonymousClass556) != false) goto L_0x0694;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0675, code lost:
        r2 = (java.lang.String) r2;
        r1 = X.AnonymousClass3K3.A0A(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:?, code lost:
        r0 = X.C90324dx.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0680, code lost:
        r0 = r2.getBytes(X.AnonymousClass4ZB.A03).length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x068e, code lost:
        if (r0 == false) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0690, code lost:
        r2 = r5.getObject(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0694, code lost:
        r2 = X.C32561ga.A02((X.AnonymousClass556) r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x069d, code lost:
        if (r0 == false) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x069f, code lost:
        r2 = X.AnonymousClass3K3.A0A(r6) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06a8, code lost:
        if (r0 == false) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06aa, code lost:
        r2 = X.AnonymousClass3K3.A0A(r6) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06b3, code lost:
        if (r0 == false) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06b5, code lost:
        r2 = X.AnonymousClass3K3.A0A(r6) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06e2, code lost:
        r11 = r11 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06f5, code lost:
        r2 = r2 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0138, code lost:
        if (r1 <= 0) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013a, code lost:
        r2 = (X.AnonymousClass3K3.A0A(r4) + X.C32561ga.A00(r1)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014a, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014c, code lost:
        r2 = X.C32561ga.A03((X.AnonymousClass5UZ) X.C90904f2.A01(r15, r1), A0B(r3), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0168, code lost:
        r2 = X.AnonymousClass3K3.A0A(r4);
        r0 = X.C32561ga.A01(X.AnonymousClass3K3.A0R(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0182, code lost:
        r2 = X.AnonymousClass3K3.A0A(r4);
        r0 = X.C32561ga.A00((r0 >> 31) ^ (r0 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019d, code lost:
        r2 = X.AnonymousClass3K3.A0A(r4);
        r0 = X.C32561ga.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ab, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ad, code lost:
        r2 = X.C90954f8.A00(A0B(r3), X.C90904f2.A01(r15, r1), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bf, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c1, code lost:
        r2 = X.C90904f2.A01(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c7, code lost:
        if ((r2 instanceof X.AnonymousClass556) != false) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c9, code lost:
        r2 = (java.lang.String) r2;
        r1 = X.AnonymousClass3K3.A0A(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r0 = X.C90324dx.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d4, code lost:
        r0 = r2.getBytes(X.AnonymousClass4ZB.A03).length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e5, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e7, code lost:
        r2 = X.C90904f2.A01(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01eb, code lost:
        r2 = X.C32561ga.A02((X.AnonymousClass556) r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f7, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f9, code lost:
        r2 = X.AnonymousClass3K3.A0A(r4) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x020d, code lost:
        r2 = X.AnonymousClass3K3.A0A(r4);
        r0 = X.AnonymousClass3K3.A09(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0222, code lost:
        r2 = X.AnonymousClass3K3.A0A(r4);
        r0 = X.C32561ga.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022a, code lost:
        r2 = r2 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0231, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0233, code lost:
        r2 = X.AnonymousClass3K3.A0A(r4) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x023f, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0241, code lost:
        r2 = X.AnonymousClass3K3.A0A(r4) + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int AjN(java.lang.Object r15) {
        /*
            r14 = this;
            boolean r0 = r14.A09
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r13 = 1
            r12 = 1048575(0xfffff, float:1.469367E-39)
            sun.misc.Unsafe r5 = A0F
            if (r0 == 0) goto L_0x0365
            r3 = 0
            r9 = 0
        L_0x000e:
            int[] r2 = r14.A0A
            int r0 = r2.length
            if (r3 >= r0) goto L_0x035b
            int r0 = r3 + 1
            r1 = r2[r0]
            r0 = r1 & r4
            int r0 = r0 >>> 20
            r4 = r2[r3]
            r1 = r1 & r12
            long r1 = (long) r1
            switch(r0) {
                case 0: goto L_0x023b;
                case 1: goto L_0x022d;
                case 2: goto L_0x0216;
                case 3: goto L_0x0216;
                case 4: goto L_0x0201;
                case 5: goto L_0x023b;
                case 6: goto L_0x022d;
                case 7: goto L_0x01f3;
                case 8: goto L_0x01bb;
                case 9: goto L_0x01a7;
                case 10: goto L_0x01e1;
                case 11: goto L_0x0191;
                case 12: goto L_0x0201;
                case 13: goto L_0x022d;
                case 14: goto L_0x023b;
                case 15: goto L_0x0176;
                case 16: goto L_0x015c;
                case 17: goto L_0x0146;
                case 18: goto L_0x0325;
                case 19: goto L_0x0313;
                case 20: goto L_0x02fa;
                case 21: goto L_0x02e5;
                case 22: goto L_0x02d6;
                case 23: goto L_0x0325;
                case 24: goto L_0x0313;
                case 25: goto L_0x02c4;
                case 26: goto L_0x02bb;
                case 27: goto L_0x02ae;
                case 28: goto L_0x0287;
                case 29: goto L_0x0278;
                case 30: goto L_0x0269;
                case 31: goto L_0x0313;
                case 32: goto L_0x0325;
                case 33: goto L_0x0259;
                case 34: goto L_0x0249;
                case 35: goto L_0x00dd;
                case 36: goto L_0x00ea;
                case 37: goto L_0x012e;
                case 38: goto L_0x0123;
                case 39: goto L_0x0118;
                case 40: goto L_0x00dd;
                case 41: goto L_0x00ea;
                case 42: goto L_0x010d;
                case 43: goto L_0x0102;
                case 44: goto L_0x00f7;
                case 45: goto L_0x00ea;
                case 46: goto L_0x00dd;
                case 47: goto L_0x00d2;
                case 48: goto L_0x00c7;
                case 49: goto L_0x0339;
                case 50: goto L_0x00a1;
                case 51: goto L_0x009b;
                case 52: goto L_0x0095;
                case 53: goto L_0x0085;
                case 54: goto L_0x0085;
                case 55: goto L_0x0075;
                case 56: goto L_0x009b;
                case 57: goto L_0x0095;
                case 58: goto L_0x006f;
                case 59: goto L_0x0069;
                case 60: goto L_0x0063;
                case 61: goto L_0x005d;
                case 62: goto L_0x004d;
                case 63: goto L_0x0075;
                case 64: goto L_0x0095;
                case 65: goto L_0x009b;
                case 66: goto L_0x003d;
                case 67: goto L_0x002d;
                case 68: goto L_0x0027;
                default: goto L_0x0022;
            }
        L_0x0022:
            int r3 = r3 + 4
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x000e
        L_0x0027:
            boolean r0 = r14.A0D(r15, r4, r3)
            goto L_0x014a
        L_0x002d:
            boolean r0 = r14.A0D(r15, r4, r3)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = X.C90904f2.A01(r15, r1)
            long r0 = X.C13700nu.A01(r0)
            goto L_0x0168
        L_0x003d:
            boolean r0 = r14.A0D(r15, r4, r3)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = X.C90904f2.A01(r15, r1)
            int r0 = X.AnonymousClass000.A0D(r0)
            goto L_0x0182
        L_0x004d:
            boolean r0 = r14.A0D(r15, r4, r3)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = X.C90904f2.A01(r15, r1)
            int r0 = X.AnonymousClass000.A0D(r0)
            goto L_0x019d
        L_0x005d:
            boolean r0 = r14.A0D(r15, r4, r3)
            goto L_0x01e5
        L_0x0063:
            boolean r0 = r14.A0D(r15, r4, r3)
            goto L_0x01ab
        L_0x0069:
            boolean r0 = r14.A0D(r15, r4, r3)
            goto L_0x01bf
        L_0x006f:
            boolean r0 = r14.A0D(r15, r4, r3)
            goto L_0x01f7
        L_0x0075:
            boolean r0 = r14.A0D(r15, r4, r3)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = X.C90904f2.A01(r15, r1)
            int r0 = X.AnonymousClass000.A0D(r0)
            goto L_0x020d
        L_0x0085:
            boolean r0 = r14.A0D(r15, r4, r3)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = X.C90904f2.A01(r15, r1)
            long r0 = X.C13700nu.A01(r0)
            goto L_0x0222
        L_0x0095:
            boolean r0 = r14.A0D(r15, r4, r3)
            goto L_0x0231
        L_0x009b:
            boolean r0 = r14.A0D(r15, r4, r3)
            goto L_0x023f
        L_0x00a1:
            java.lang.Object r1 = X.C90904f2.A01(r15, r1)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0349
            java.util.Iterator r1 = X.C13690nt.A0j(r1)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0349
            java.util.Map$Entry r0 = X.AnonymousClass000.A0z(r1)
            r0.getKey()
            r0.getValue()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x00c7:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A04(r0)
            goto L_0x0138
        L_0x00d2:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A08(r0)
            goto L_0x0138
        L_0x00dd:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = A03(r0)
            int r1 = r0 << 3
            goto L_0x0138
        L_0x00ea:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = A03(r0)
            int r1 = r0 << 2
            goto L_0x0138
        L_0x00f7:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A05(r0)
            goto L_0x0138
        L_0x0102:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A07(r0)
            goto L_0x0138
        L_0x010d:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = A03(r0)
            goto L_0x0138
        L_0x0118:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A06(r0)
            goto L_0x0138
        L_0x0123:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A03(r0)
            goto L_0x0138
        L_0x012e:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A02(r0)
        L_0x0138:
            if (r1 <= 0) goto L_0x0022
            int r2 = X.AnonymousClass3K3.A0A(r4)
            int r0 = X.C32561ga.A00(r1)
            int r2 = r2 + r0
            int r2 = r2 + r1
            goto L_0x0336
        L_0x0146:
            boolean r0 = r14.A0C(r3, r15)
        L_0x014a:
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = X.C90904f2.A01(r15, r1)
            X.5UZ r1 = (X.AnonymousClass5UZ) r1
            X.1gd r0 = r14.A0B(r3)
            int r2 = X.C32561ga.A03(r1, r0, r4)
            goto L_0x0336
        L_0x015c:
            boolean r0 = r14.A0C(r3, r15)
            if (r0 == 0) goto L_0x0022
            X.4XX r0 = X.C90904f2.A02
            long r0 = r0.A05(r15, r1)
        L_0x0168:
            int r2 = X.AnonymousClass3K3.A0A(r4)
            long r0 = X.AnonymousClass3K3.A0R(r0)
            int r0 = X.C32561ga.A01(r0)
            goto L_0x022a
        L_0x0176:
            boolean r0 = r14.A0C(r3, r15)
            if (r0 == 0) goto L_0x0022
            X.4XX r0 = X.C90904f2.A02
            int r0 = r0.A04(r15, r1)
        L_0x0182:
            int r2 = X.AnonymousClass3K3.A0A(r4)
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            int r0 = X.C32561ga.A00(r0)
            goto L_0x022a
        L_0x0191:
            boolean r0 = r14.A0C(r3, r15)
            if (r0 == 0) goto L_0x0022
            X.4XX r0 = X.C90904f2.A02
            int r0 = r0.A04(r15, r1)
        L_0x019d:
            int r2 = X.AnonymousClass3K3.A0A(r4)
            int r0 = X.C32561ga.A00(r0)
            goto L_0x022a
        L_0x01a7:
            boolean r0 = r14.A0C(r3, r15)
        L_0x01ab:
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = X.C90904f2.A01(r15, r1)
            X.1gd r0 = r14.A0B(r3)
            int r2 = X.C90954f8.A00(r0, r1, r4)
            goto L_0x0336
        L_0x01bb:
            boolean r0 = r14.A0C(r3, r15)
        L_0x01bf:
            if (r0 == 0) goto L_0x0022
            java.lang.Object r2 = X.C90904f2.A01(r15, r1)
            boolean r0 = r2 instanceof X.AnonymousClass556
            if (r0 != 0) goto L_0x01eb
            java.lang.String r2 = (java.lang.String) r2
            int r1 = X.AnonymousClass3K3.A0A(r4)
            int r0 = X.C90324dx.A00(r2)     // Catch:{ 442 -> 0x01d4 }
            goto L_0x01db
        L_0x01d4:
            java.nio.charset.Charset r0 = X.AnonymousClass4ZB.A03
            byte[] r0 = r2.getBytes(r0)
            int r0 = r0.length
        L_0x01db:
            int r2 = X.AnonymousClass3K4.A05(r0, r1)
            goto L_0x0336
        L_0x01e1:
            boolean r0 = r14.A0C(r3, r15)
        L_0x01e5:
            if (r0 == 0) goto L_0x0022
            java.lang.Object r2 = X.C90904f2.A01(r15, r1)
        L_0x01eb:
            X.556 r2 = (X.AnonymousClass556) r2
            int r2 = X.C32561ga.A02(r2, r4)
            goto L_0x0336
        L_0x01f3:
            boolean r0 = r14.A0C(r3, r15)
        L_0x01f7:
            if (r0 == 0) goto L_0x0022
            int r0 = X.AnonymousClass3K3.A0A(r4)
            int r2 = r0 + 1
            goto L_0x0336
        L_0x0201:
            boolean r0 = r14.A0C(r3, r15)
            if (r0 == 0) goto L_0x0022
            X.4XX r0 = X.C90904f2.A02
            int r0 = r0.A04(r15, r1)
        L_0x020d:
            int r2 = X.AnonymousClass3K3.A0A(r4)
            int r0 = X.AnonymousClass3K3.A09(r0)
            goto L_0x022a
        L_0x0216:
            boolean r0 = r14.A0C(r3, r15)
            if (r0 == 0) goto L_0x0022
            X.4XX r0 = X.C90904f2.A02
            long r0 = r0.A05(r15, r1)
        L_0x0222:
            int r2 = X.AnonymousClass3K3.A0A(r4)
            int r0 = X.C32561ga.A01(r0)
        L_0x022a:
            int r2 = r2 + r0
            goto L_0x0336
        L_0x022d:
            boolean r0 = r14.A0C(r3, r15)
        L_0x0231:
            if (r0 == 0) goto L_0x0022
            int r0 = X.AnonymousClass3K3.A0A(r4)
            int r2 = r0 + 4
            goto L_0x0336
        L_0x023b:
            boolean r0 = r14.A0C(r3, r15)
        L_0x023f:
            if (r0 == 0) goto L_0x0022
            int r0 = X.AnonymousClass3K3.A0A(r4)
            int r2 = r0 + 8
            goto L_0x0336
        L_0x0249:
            java.util.List r0 = X.AnonymousClass3K4.A0f(r15, r1)
            int r1 = A03(r0)
            if (r1 == 0) goto L_0x0349
            int r2 = X.C90954f8.A04(r0)
            goto L_0x02f3
        L_0x0259:
            java.util.List r0 = X.AnonymousClass3K4.A0f(r15, r1)
            int r1 = A03(r0)
            if (r1 == 0) goto L_0x0349
            int r2 = X.C90954f8.A08(r0)
            goto L_0x02f3
        L_0x0269:
            java.util.List r0 = X.AnonymousClass3K4.A0f(r15, r1)
            int r1 = A03(r0)
            if (r1 == 0) goto L_0x0349
            int r2 = X.C90954f8.A05(r0)
            goto L_0x02f3
        L_0x0278:
            java.util.List r0 = X.AnonymousClass3K4.A0f(r15, r1)
            int r1 = A03(r0)
            if (r1 == 0) goto L_0x0349
            int r2 = X.C90954f8.A07(r0)
            goto L_0x02f3
        L_0x0287:
            java.util.List r6 = X.AnonymousClass3K4.A0f(r15, r1)
            int r2 = r6.size()
            r1 = 0
            if (r2 == 0) goto L_0x0349
            int r0 = X.AnonymousClass3K3.A0A(r4)
            int r2 = r2 * r0
        L_0x0297:
            int r0 = r6.size()
            if (r1 >= r0) goto L_0x0336
            java.lang.Object r0 = r6.get(r1)
            X.556 r0 = (X.AnonymousClass556) r0
            int r0 = r0.A02()
            int r2 = X.AnonymousClass3K4.A05(r0, r2)
            int r1 = r1 + 1
            goto L_0x0297
        L_0x02ae:
            java.util.List r1 = X.AnonymousClass3K4.A0f(r15, r1)
            X.1gd r0 = r14.A0B(r3)
            int r2 = X.C90954f8.A01(r0, r1, r4)
            goto L_0x0336
        L_0x02bb:
            java.util.List r0 = X.AnonymousClass3K4.A0f(r15, r1)
            int r2 = X.C90954f8.A09(r0, r4)
            goto L_0x0336
        L_0x02c4:
            java.util.List r0 = X.AnonymousClass3K4.A0f(r15, r1)
            int r2 = A03(r0)
            if (r2 == 0) goto L_0x0349
            int r0 = X.AnonymousClass3K3.A0A(r4)
            int r0 = r0 + 1
            int r2 = r2 * r0
            goto L_0x0336
        L_0x02d6:
            java.util.List r0 = X.AnonymousClass3K4.A0f(r15, r1)
            int r1 = A03(r0)
            if (r1 == 0) goto L_0x0349
            int r2 = X.C90954f8.A06(r0)
            goto L_0x02f3
        L_0x02e5:
            java.util.List r0 = X.AnonymousClass3K4.A0f(r15, r1)
            int r1 = A03(r0)
            if (r1 == 0) goto L_0x0349
            int r2 = X.C90954f8.A03(r0)
        L_0x02f3:
            int r0 = X.AnonymousClass3K3.A0A(r4)
            int r1 = r1 * r0
            int r2 = r2 + r1
            goto L_0x0336
        L_0x02fa:
            java.util.List r1 = X.AnonymousClass3K4.A0f(r15, r1)
            int r0 = A03(r1)
            if (r0 == 0) goto L_0x0349
            int r2 = X.C90954f8.A02(r1)
            int r1 = r1.size()
            int r0 = X.AnonymousClass3K3.A0A(r4)
            int r1 = r1 * r0
            int r2 = r2 + r1
            goto L_0x0336
        L_0x0313:
            java.util.List r0 = X.AnonymousClass3K4.A0f(r15, r1)
            int r2 = A03(r0)
            if (r2 == 0) goto L_0x0349
            int r0 = X.AnonymousClass3K3.A0A(r4)
            int r0 = r0 + 4
            int r2 = r2 * r0
            goto L_0x0336
        L_0x0325:
            java.util.List r0 = X.AnonymousClass3K4.A0f(r15, r1)
            int r2 = A03(r0)
            if (r2 == 0) goto L_0x0349
            int r0 = X.AnonymousClass3K3.A0A(r4)
            int r0 = r0 + 8
            int r2 = r2 * r0
        L_0x0336:
            int r9 = r9 + r2
            goto L_0x0022
        L_0x0339:
            java.util.List r8 = X.AnonymousClass3K4.A0f(r15, r1)
            X.1gd r7 = r14.A0B(r3)
            int r6 = A03(r8)
            r1 = 0
            r2 = 0
            if (r6 != 0) goto L_0x034b
        L_0x0349:
            r2 = 0
            goto L_0x0336
        L_0x034b:
            if (r1 >= r6) goto L_0x0336
            java.lang.Object r0 = r8.get(r1)
            X.5UZ r0 = (X.AnonymousClass5UZ) r0
            int r0 = X.C32561ga.A03(r0, r7, r4)
            int r2 = r2 + r0
            int r1 = r1 + 1
            goto L_0x034b
        L_0x035b:
            X.3Z1 r15 = (X.AnonymousClass3Z1) r15
            X.4dY r0 = r15.zzjp
            int r0 = r0.A00()
            int r9 = r9 + r0
            return r9
        L_0x0365:
            r4 = -1
            r3 = 0
            r11 = 0
            r10 = 0
        L_0x0369:
            int[] r1 = r14.A0A
            int r0 = r1.length
            if (r3 >= r0) goto L_0x06fc
            int r0 = r3 + 1
            r9 = r1[r0]
            r6 = r1[r3]
            int r8 = X.AnonymousClass3K4.A04(r9)
            r0 = 17
            if (r8 > r0) goto L_0x06f9
            int r0 = r3 + 2
            r0 = r1[r0]
            r2 = r0 & r12
            int r0 = r0 >>> 20
            int r7 = r13 << r0
            if (r2 == r4) goto L_0x038e
            long r0 = (long) r2
            int r10 = r5.getInt(r15, r0)
            r4 = r2
        L_0x038e:
            r9 = r9 & r12
            long r1 = (long) r9
            switch(r8) {
                case 0: goto L_0x06cd;
                case 1: goto L_0x06d8;
                case 2: goto L_0x06e5;
                case 3: goto L_0x06e5;
                case 4: goto L_0x06bc;
                case 5: goto L_0x06b1;
                case 6: goto L_0x06a6;
                case 7: goto L_0x069b;
                case 8: goto L_0x0669;
                case 9: goto L_0x0657;
                case 10: goto L_0x068c;
                case 11: goto L_0x0645;
                case 12: goto L_0x0633;
                case 13: goto L_0x06a6;
                case 14: goto L_0x06b1;
                case 15: goto L_0x061c;
                case 16: goto L_0x0606;
                case 17: goto L_0x05f2;
                case 18: goto L_0x05b8;
                case 19: goto L_0x05a3;
                case 20: goto L_0x0587;
                case 21: goto L_0x056f;
                case 22: goto L_0x055e;
                case 23: goto L_0x05b8;
                case 24: goto L_0x05a3;
                case 25: goto L_0x0549;
                case 26: goto L_0x053d;
                case 27: goto L_0x052d;
                case 28: goto L_0x0504;
                case 29: goto L_0x04f3;
                case 30: goto L_0x04e1;
                case 31: goto L_0x05a3;
                case 32: goto L_0x05b8;
                case 33: goto L_0x04cf;
                case 34: goto L_0x04bd;
                case 35: goto L_0x0454;
                case 36: goto L_0x0461;
                case 37: goto L_0x04a5;
                case 38: goto L_0x049a;
                case 39: goto L_0x048f;
                case 40: goto L_0x0454;
                case 41: goto L_0x0461;
                case 42: goto L_0x0484;
                case 43: goto L_0x0479;
                case 44: goto L_0x046e;
                case 45: goto L_0x0461;
                case 46: goto L_0x0454;
                case 47: goto L_0x0449;
                case 48: goto L_0x043e;
                case 49: goto L_0x05cd;
                case 50: goto L_0x0418;
                case 51: goto L_0x0412;
                case 52: goto L_0x040c;
                case 53: goto L_0x03f4;
                case 54: goto L_0x03f4;
                case 55: goto L_0x03e4;
                case 56: goto L_0x0412;
                case 57: goto L_0x040c;
                case 58: goto L_0x03de;
                case 59: goto L_0x03d8;
                case 60: goto L_0x03d2;
                case 61: goto L_0x03cc;
                case 62: goto L_0x03bc;
                case 63: goto L_0x03e4;
                case 64: goto L_0x040c;
                case 65: goto L_0x0412;
                case 66: goto L_0x03ac;
                case 67: goto L_0x039c;
                case 68: goto L_0x0396;
                default: goto L_0x0393;
            }
        L_0x0393:
            int r3 = r3 + 4
            goto L_0x0369
        L_0x0396:
            boolean r0 = r14.A0D(r15, r6, r3)
            goto L_0x05f4
        L_0x039c:
            boolean r0 = r14.A0D(r15, r6, r3)
            if (r0 == 0) goto L_0x0393
            java.lang.Object r0 = X.C90904f2.A01(r15, r1)
            long r0 = X.C13700nu.A01(r0)
            goto L_0x060e
        L_0x03ac:
            boolean r0 = r14.A0D(r15, r6, r3)
            if (r0 == 0) goto L_0x0393
            java.lang.Object r0 = X.C90904f2.A01(r15, r1)
            int r0 = X.AnonymousClass000.A0D(r0)
            goto L_0x0624
        L_0x03bc:
            boolean r0 = r14.A0D(r15, r6, r3)
            if (r0 == 0) goto L_0x0393
            java.lang.Object r0 = X.C90904f2.A01(r15, r1)
            int r0 = X.AnonymousClass000.A0D(r0)
            goto L_0x064d
        L_0x03cc:
            boolean r0 = r14.A0D(r15, r6, r3)
            goto L_0x068e
        L_0x03d2:
            boolean r0 = r14.A0D(r15, r6, r3)
            goto L_0x0659
        L_0x03d8:
            boolean r0 = r14.A0D(r15, r6, r3)
            goto L_0x066b
        L_0x03de:
            boolean r0 = r14.A0D(r15, r6, r3)
            goto L_0x069d
        L_0x03e4:
            boolean r0 = r14.A0D(r15, r6, r3)
            if (r0 == 0) goto L_0x0393
            java.lang.Object r0 = X.C90904f2.A01(r15, r1)
            int r0 = X.AnonymousClass000.A0D(r0)
            goto L_0x063b
        L_0x03f4:
            boolean r0 = r14.A0D(r15, r6, r3)
            if (r0 == 0) goto L_0x0393
            java.lang.Object r0 = X.C90904f2.A01(r15, r1)
            long r0 = X.C13700nu.A01(r0)
            int r2 = X.AnonymousClass3K3.A0A(r6)
            int r0 = X.C32561ga.A01(r0)
            goto L_0x06f5
        L_0x040c:
            boolean r0 = r14.A0D(r15, r6, r3)
            goto L_0x06a8
        L_0x0412:
            boolean r0 = r14.A0D(r15, r6, r3)
            goto L_0x06b3
        L_0x0418:
            java.lang.Object r1 = r5.getObject(r15, r1)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x05df
            java.util.Iterator r1 = X.C13690nt.A0j(r1)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05df
            java.util.Map$Entry r0 = X.AnonymousClass000.A0z(r1)
            r0.getKey()
            r0.getValue()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x043e:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A04(r0)
            goto L_0x04af
        L_0x0449:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A08(r0)
            goto L_0x04af
        L_0x0454:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = A03(r0)
            int r1 = r0 << 3
            goto L_0x04af
        L_0x0461:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = A03(r0)
            int r1 = r0 << 2
            goto L_0x04af
        L_0x046e:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A05(r0)
            goto L_0x04af
        L_0x0479:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A07(r0)
            goto L_0x04af
        L_0x0484:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = A03(r0)
            goto L_0x04af
        L_0x048f:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A06(r0)
            goto L_0x04af
        L_0x049a:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A03(r0)
            goto L_0x04af
        L_0x04a5:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90954f8.A02(r0)
        L_0x04af:
            if (r1 <= 0) goto L_0x0393
            int r2 = X.AnonymousClass3K3.A0A(r6)
            int r0 = X.C32561ga.A00(r1)
            int r2 = r2 + r0
            int r2 = r2 + r1
            goto L_0x06f6
        L_0x04bd:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = A03(r0)
            if (r1 == 0) goto L_0x05df
            int r2 = X.C90954f8.A04(r0)
            goto L_0x057f
        L_0x04cf:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = A03(r0)
            if (r1 == 0) goto L_0x05df
            int r2 = X.C90954f8.A08(r0)
            goto L_0x057f
        L_0x04e1:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = A03(r0)
            if (r1 == 0) goto L_0x05df
            int r2 = X.C90954f8.A05(r0)
            goto L_0x057f
        L_0x04f3:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = A03(r0)
            if (r1 == 0) goto L_0x05df
            int r2 = X.C90954f8.A07(r0)
            goto L_0x057f
        L_0x0504:
            java.lang.Object r7 = r5.getObject(r15, r1)
            java.util.List r7 = (java.util.List) r7
            int r2 = r7.size()
            r1 = 0
            if (r2 == 0) goto L_0x05df
            int r0 = X.AnonymousClass3K3.A0A(r6)
            int r2 = r2 * r0
        L_0x0516:
            int r0 = r7.size()
            if (r1 >= r0) goto L_0x06f6
            java.lang.Object r0 = r7.get(r1)
            X.556 r0 = (X.AnonymousClass556) r0
            int r0 = r0.A02()
            int r2 = X.AnonymousClass3K4.A05(r0, r2)
            int r1 = r1 + 1
            goto L_0x0516
        L_0x052d:
            java.lang.Object r1 = r5.getObject(r15, r1)
            java.util.List r1 = (java.util.List) r1
            X.1gd r0 = r14.A0B(r3)
            int r2 = X.C90954f8.A01(r0, r1, r6)
            goto L_0x06f6
        L_0x053d:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C90954f8.A09(r0, r6)
            goto L_0x06f6
        L_0x0549:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = A03(r0)
            if (r2 == 0) goto L_0x05df
            int r0 = X.AnonymousClass3K3.A0A(r6)
            int r0 = r0 + 1
            int r2 = r2 * r0
            goto L_0x06f6
        L_0x055e:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = A03(r0)
            if (r1 == 0) goto L_0x05df
            int r2 = X.C90954f8.A06(r0)
            goto L_0x057f
        L_0x056f:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = A03(r0)
            if (r1 == 0) goto L_0x05df
            int r2 = X.C90954f8.A03(r0)
        L_0x057f:
            int r0 = X.AnonymousClass3K3.A0A(r6)
            int r1 = r1 * r0
            int r2 = r2 + r1
            goto L_0x06f6
        L_0x0587:
            java.lang.Object r1 = r5.getObject(r15, r1)
            java.util.List r1 = (java.util.List) r1
            int r0 = A03(r1)
            if (r0 == 0) goto L_0x05df
            int r2 = X.C90954f8.A02(r1)
            int r1 = r1.size()
            int r0 = X.AnonymousClass3K3.A0A(r6)
            int r1 = r1 * r0
            int r2 = r2 + r1
            goto L_0x06f6
        L_0x05a3:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = A03(r0)
            if (r2 == 0) goto L_0x05df
            int r0 = X.AnonymousClass3K3.A0A(r6)
            int r0 = r0 + 4
            int r2 = r2 * r0
            goto L_0x06f6
        L_0x05b8:
            java.lang.Object r0 = r5.getObject(r15, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = A03(r0)
            if (r2 == 0) goto L_0x05df
            int r0 = X.AnonymousClass3K3.A0A(r6)
            int r0 = r0 + 8
            int r2 = r2 * r0
            goto L_0x06f6
        L_0x05cd:
            java.lang.Object r9 = r5.getObject(r15, r1)
            java.util.List r9 = (java.util.List) r9
            X.1gd r8 = r14.A0B(r3)
            int r7 = A03(r9)
            r1 = 0
            r2 = 0
            if (r7 != 0) goto L_0x05e2
        L_0x05df:
            r2 = 0
            goto L_0x06f6
        L_0x05e2:
            if (r1 >= r7) goto L_0x06f6
            java.lang.Object r0 = r9.get(r1)
            X.5UZ r0 = (X.AnonymousClass5UZ) r0
            int r0 = X.C32561ga.A03(r0, r8, r6)
            int r2 = r2 + r0
            int r1 = r1 + 1
            goto L_0x05e2
        L_0x05f2:
            r0 = r10 & r7
        L_0x05f4:
            if (r0 == 0) goto L_0x0393
            java.lang.Object r1 = r5.getObject(r15, r1)
            X.5UZ r1 = (X.AnonymousClass5UZ) r1
            X.1gd r0 = r14.A0B(r3)
            int r2 = X.C32561ga.A03(r1, r0, r6)
            goto L_0x06f6
        L_0x0606:
            r0 = r10 & r7
            if (r0 == 0) goto L_0x0393
            long r0 = r5.getLong(r15, r1)
        L_0x060e:
            int r2 = X.AnonymousClass3K3.A0A(r6)
            long r0 = X.AnonymousClass3K3.A0R(r0)
            int r0 = X.C32561ga.A01(r0)
            goto L_0x06f5
        L_0x061c:
            r0 = r10 & r7
            if (r0 == 0) goto L_0x0393
            int r0 = r5.getInt(r15, r1)
        L_0x0624:
            int r2 = X.AnonymousClass3K3.A0A(r6)
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            int r0 = X.C32561ga.A00(r0)
            goto L_0x06f5
        L_0x0633:
            r0 = r10 & r7
            if (r0 == 0) goto L_0x0393
            int r0 = r5.getInt(r15, r1)
        L_0x063b:
            int r2 = X.AnonymousClass3K3.A0A(r6)
            int r0 = X.AnonymousClass3K3.A09(r0)
            goto L_0x06f5
        L_0x0645:
            r0 = r10 & r7
            if (r0 == 0) goto L_0x0393
            int r0 = r5.getInt(r15, r1)
        L_0x064d:
            int r2 = X.AnonymousClass3K3.A0A(r6)
            int r0 = X.C32561ga.A00(r0)
            goto L_0x06f5
        L_0x0657:
            r0 = r10 & r7
        L_0x0659:
            if (r0 == 0) goto L_0x0393
            java.lang.Object r1 = r5.getObject(r15, r1)
            X.1gd r0 = r14.A0B(r3)
            int r2 = X.C90954f8.A00(r0, r1, r6)
            goto L_0x06f6
        L_0x0669:
            r0 = r10 & r7
        L_0x066b:
            if (r0 == 0) goto L_0x0393
            java.lang.Object r2 = r5.getObject(r15, r1)
            boolean r0 = r2 instanceof X.AnonymousClass556
            if (r0 != 0) goto L_0x0694
            java.lang.String r2 = (java.lang.String) r2
            int r1 = X.AnonymousClass3K3.A0A(r6)
            int r0 = X.C90324dx.A00(r2)     // Catch:{ 442 -> 0x0680 }
            goto L_0x0687
        L_0x0680:
            java.nio.charset.Charset r0 = X.AnonymousClass4ZB.A03
            byte[] r0 = r2.getBytes(r0)
            int r0 = r0.length
        L_0x0687:
            int r2 = X.AnonymousClass3K4.A05(r0, r1)
            goto L_0x06f6
        L_0x068c:
            r0 = r10 & r7
        L_0x068e:
            if (r0 == 0) goto L_0x0393
            java.lang.Object r2 = r5.getObject(r15, r1)
        L_0x0694:
            X.556 r2 = (X.AnonymousClass556) r2
            int r2 = X.C32561ga.A02(r2, r6)
            goto L_0x06f6
        L_0x069b:
            r0 = r10 & r7
        L_0x069d:
            if (r0 == 0) goto L_0x0393
            int r0 = X.AnonymousClass3K3.A0A(r6)
            int r2 = r0 + 1
            goto L_0x06f6
        L_0x06a6:
            r0 = r10 & r7
        L_0x06a8:
            if (r0 == 0) goto L_0x0393
            int r0 = X.AnonymousClass3K3.A0A(r6)
            int r2 = r0 + 4
            goto L_0x06f6
        L_0x06b1:
            r0 = r10 & r7
        L_0x06b3:
            if (r0 == 0) goto L_0x0393
            int r0 = X.AnonymousClass3K3.A0A(r6)
            int r2 = r0 + 8
            goto L_0x06f6
        L_0x06bc:
            r0 = r10 & r7
            if (r0 == 0) goto L_0x0393
            int r0 = r5.getInt(r15, r1)
            int r2 = X.AnonymousClass3K3.A0A(r6)
            int r0 = X.AnonymousClass3K3.A09(r0)
            goto L_0x06f5
        L_0x06cd:
            r0 = r10 & r7
            if (r0 == 0) goto L_0x0393
            int r0 = X.AnonymousClass3K3.A0A(r6)
            int r0 = r0 + 8
            goto L_0x06e2
        L_0x06d8:
            r0 = r10 & r7
            if (r0 == 0) goto L_0x0393
            int r0 = X.AnonymousClass3K3.A0A(r6)
            int r0 = r0 + 4
        L_0x06e2:
            int r11 = r11 + r0
            goto L_0x0393
        L_0x06e5:
            r0 = r10 & r7
            if (r0 == 0) goto L_0x0393
            long r0 = r5.getLong(r15, r1)
            int r2 = X.AnonymousClass3K3.A0A(r6)
            int r0 = X.C32561ga.A01(r0)
        L_0x06f5:
            int r2 = r2 + r0
        L_0x06f6:
            int r11 = r11 + r2
            goto L_0x0393
        L_0x06f9:
            r7 = 0
            goto L_0x038e
        L_0x06fc:
            X.3Z1 r15 = (X.AnonymousClass3Z1) r15
            X.4dY r0 = r15.zzjp
            int r0 = r0.A00()
            int r11 = r11 + r0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98324rS.AjN(java.lang.Object):int");
    }

    public final boolean AjP(Object obj) {
        int length;
        int i2;
        boolean z2;
        boolean z3;
        int[] iArr = this.A0B;
        if (iArr == null || (length = iArr.length) == 0) {
            return true;
        }
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        do {
            int i6 = iArr[i4];
            int A072 = A07(i6);
            int[] iArr2 = this.A0A;
            int i7 = iArr2[A072 + 1];
            boolean z4 = this.A09;
            Object obj2 = obj;
            if (!z4) {
                int i8 = iArr2[A072 + 2];
                int i9 = i8 & 1048575;
                i2 = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i5 = A0F.getInt(obj2, (long) i9);
                    i3 = i9;
                }
            } else {
                i2 = 0;
            }
            if ((268435456 & i7) != 0) {
                if (z4) {
                    if (!A0C(A072, obj2)) {
                        return false;
                    }
                } else if ((i5 & i2) == 0) {
                    return false;
                }
            }
            int i10 = (267386880 & i7) >>> 20;
            if (i10 == 9 || i10 == 17) {
                z2 = false;
                z3 = z4 ? A0C(A072, obj2) : i5 & i2;
            } else {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        z2 = false;
                        z3 = A0D(obj2, i6, A072);
                    } else if (i10 != 49) {
                        if (i10 == 50 && !((AbstractMap) A04(obj2, i7)).isEmpty()) {
                            throw new NoSuchMethodError();
                        }
                        i4++;
                    }
                }
                List A052 = A05(i7, obj2);
                if (!A052.isEmpty()) {
                    C32591gd A0B2 = A0B(A072);
                    for (int i11 = 0; i11 < A052.size(); i11++) {
                        if (!A0B2.AjP(A052.get(i11))) {
                            return false;
                        }
                    }
                }
                i4++;
            }
            if (z3 && !A0B(A072).AjP(A04(obj2, i7))) {
                return z2;
            }
            i4++;
        } while (i4 < length);
        return true;
    }
}
