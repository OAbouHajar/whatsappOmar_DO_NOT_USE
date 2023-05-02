package X;

import java.util.Arrays;

/* renamed from: X.3Zb  reason: invalid class name and case insensitive filesystem */
public final class C66363Zb extends C66383Zd implements Cloneable {
    public int[] A00 = AnonymousClass4BB.A01;
    public long[] A01;
    public long[] A02;
    public String[] A03;
    public String[] A04;

    public C66363Zb() {
        String[] strArr = AnonymousClass4BB.A03;
        this.A03 = strArr;
        this.A04 = strArr;
        long[] jArr = AnonymousClass4BB.A02;
        this.A01 = jArr;
        this.A02 = jArr;
        this.A00 = null;
        this.A00 = -1;
    }

    public final int A03() {
        int length;
        int length2;
        int length3;
        int A032 = super.A03();
        String[] strArr = this.A03;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.A03;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    i5++;
                    int A033 = C90704ef.A03(str);
                    i4 += C90704ef.A01(A033) + A033;
                }
                i3++;
            }
            A032 = A032 + i4 + i5;
        }
        String[] strArr3 = this.A04;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr4 = this.A04;
                if (i6 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i6];
                if (str2 != null) {
                    i8++;
                    int A034 = C90704ef.A03(str2);
                    i7 += C90704ef.A01(A034) + A034;
                }
                i6++;
            }
            A032 = A032 + i7 + i8;
        }
        int[] iArr = this.A00;
        if (iArr != null && (length3 = iArr.length) > 0) {
            int i9 = 0;
            int i10 = 0;
            do {
                int i11 = iArr[i9];
                i10 += i11 >= 0 ? C90704ef.A01(i11) : 10;
                i9++;
            } while (i9 < length3);
            A032 = A032 + i10 + length3;
        }
        long[] jArr = this.A01;
        if (jArr != null && (length2 = jArr.length) > 0) {
            int i12 = 0;
            int i13 = 0;
            do {
                i13 += C90704ef.A02(jArr[i12]);
                i12++;
            } while (i12 < length2);
            A032 = A032 + i13 + length2;
        }
        long[] jArr2 = this.A02;
        if (jArr2 == null || (length = jArr2.length) <= 0) {
            return A032;
        }
        int i14 = 0;
        do {
            i14 += C90704ef.A02(jArr2[i2]);
            i2++;
        } while (i2 < length);
        return A032 + i14 + length;
    }

    public final void A05(C90704ef r6) {
        String[] strArr = this.A03;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.A03;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    r6.A07(1, str);
                }
                i3++;
            }
        }
        String[] strArr3 = this.A04;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.A04;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i4];
                if (str2 != null) {
                    r6.A07(2, str2);
                }
                i4++;
            }
        }
        int[] iArr = this.A00;
        if (iArr != null && iArr.length > 0) {
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.A00;
                if (i5 >= iArr2.length) {
                    break;
                }
                int i6 = iArr2[i5];
                r6.A05(24);
                if (i6 >= 0) {
                    r6.A06(i6);
                } else {
                    r6.A09((long) i6);
                }
                i5++;
            }
        }
        long[] jArr = this.A01;
        if (jArr != null && jArr.length > 0) {
            int i7 = 0;
            while (true) {
                long[] jArr2 = this.A01;
                if (i7 >= jArr2.length) {
                    break;
                }
                long j2 = jArr2[i7];
                r6.A05(32);
                r6.A09(j2);
                i7++;
            }
        }
        long[] jArr3 = this.A02;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.A02;
                if (i2 >= jArr4.length) {
                    break;
                }
                long j3 = jArr4[i2];
                r6.A05(40);
                r6.A09(j3);
                i2++;
            }
        }
        super.A05(r6);
    }

    public final /* synthetic */ Object clone() {
        try {
            C66363Zb r2 = (C66363Zb) super.A06();
            String[] strArr = this.A03;
            if (strArr != null && strArr.length > 0) {
                r2.A03 = (String[]) strArr.clone();
            }
            String[] strArr2 = this.A04;
            if (strArr2 != null && strArr2.length > 0) {
                r2.A04 = (String[]) strArr2.clone();
            }
            int[] iArr = this.A00;
            if (iArr != null && iArr.length > 0) {
                r2.A00 = (int[]) iArr.clone();
            }
            long[] jArr = this.A01;
            if (jArr != null && jArr.length > 0) {
                r2.A01 = (long[]) jArr.clone();
            }
            long[] jArr2 = this.A02;
            if (jArr2 != null && jArr2.length > 0) {
                r2.A02 = (long[]) jArr2.clone();
            }
            return r2;
        } catch (CloneNotSupportedException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        if (r1.length != 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005b, code lost:
        if (r1.length != 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 1
            if (r6 == r5) goto L_0x0074
            boolean r0 = r6 instanceof X.C66363Zb
            r3 = 0
            if (r0 == 0) goto L_0x002d
            X.3Zb r6 = (X.C66363Zb) r6
            java.lang.String[] r1 = r5.A03
            java.lang.String[] r0 = r6.A03
            boolean r0 = X.C89754cq.A00(r1, r0)
            if (r0 == 0) goto L_0x002d
            java.lang.String[] r1 = r5.A04
            java.lang.String[] r0 = r6.A04
            boolean r0 = X.C89754cq.A00(r1, r0)
            if (r0 == 0) goto L_0x002d
            int[] r2 = r5.A00
            int[] r1 = r6.A00
            if (r2 == 0) goto L_0x002e
            int r0 = r2.length
            if (r0 == 0) goto L_0x002e
            boolean r0 = java.util.Arrays.equals(r2, r1)
            if (r0 != 0) goto L_0x0033
        L_0x002d:
            return r3
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            int r0 = r1.length
            if (r0 != 0) goto L_0x002d
        L_0x0033:
            long[] r2 = r5.A01
            long[] r1 = r6.A01
            if (r2 == 0) goto L_0x0043
            int r0 = r2.length
            if (r0 == 0) goto L_0x0043
            boolean r0 = java.util.Arrays.equals(r2, r1)
            if (r0 != 0) goto L_0x0048
            return r3
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            int r0 = r1.length
            if (r0 != 0) goto L_0x002d
        L_0x0048:
            long[] r2 = r5.A02
            long[] r1 = r6.A02
            if (r2 == 0) goto L_0x0058
            int r0 = r2.length
            if (r0 == 0) goto L_0x0058
            boolean r0 = java.util.Arrays.equals(r2, r1)
            if (r0 != 0) goto L_0x005d
            return r3
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            int r0 = r1.length
            if (r0 != 0) goto L_0x002d
        L_0x005d:
            X.54v r1 = r5.A00
            if (r1 == 0) goto L_0x006c
            int r0 = r1.A00
            if (r0 == 0) goto L_0x006c
            X.54v r0 = r6.A00
            boolean r0 = r1.equals(r0)
            return r0
        L_0x006c:
            X.54v r0 = r6.A00
            if (r0 == 0) goto L_0x0074
            int r0 = r0.A00
            if (r0 != 0) goto L_0x002d
        L_0x0074:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66363Zb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (C66363Zb.class.getName().hashCode() + 527) * 31;
        String[] strArr = this.A03;
        int length = strArr == null ? 0 : strArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String str = strArr[i3];
            if (str != null) {
                i2 = AnonymousClass3K2.A06(str, i2 * 31);
            }
        }
        int i4 = (hashCode + i2) * 31;
        String[] strArr2 = this.A04;
        int length2 = strArr2 == null ? 0 : strArr2.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length2; i6++) {
            String str2 = strArr2[i6];
            if (str2 != null) {
                i5 = AnonymousClass3K2.A06(str2, i5 * 31);
            }
        }
        int i7 = (i4 + i5) * 31;
        int[] iArr = this.A00;
        int hashCode2 = (i7 + ((iArr == null || iArr.length == 0) ? 0 : Arrays.hashCode(iArr))) * 31;
        long[] jArr = this.A01;
        int hashCode3 = (hashCode2 + ((jArr == null || jArr.length == 0) ? 0 : Arrays.hashCode(jArr))) * 31;
        long[] jArr2 = this.A02;
        int hashCode4 = (hashCode3 + ((jArr2 == null || jArr2.length == 0) ? 0 : Arrays.hashCode(jArr2))) * 31;
        C1043154v r1 = this.A00;
        return hashCode4 + ((r1 == null || r1.A00 == 0) ? 0 : r1.hashCode());
    }
}
