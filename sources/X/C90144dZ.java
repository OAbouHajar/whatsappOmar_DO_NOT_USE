package X;

import java.util.Arrays;

/* renamed from: X.4dZ  reason: invalid class name and case insensitive filesystem */
public final class C90144dZ {
    public static final C90144dZ A05 = new C90144dZ(new int[0], new Object[0], 0, false);
    public int A00;
    public int A01 = -1;
    public boolean A02;
    public int[] A03;
    public Object[] A04;

    public C90144dZ(int[] iArr, Object[] objArr, int i2, boolean z2) {
        this.A00 = i2;
        this.A03 = iArr;
        this.A04 = objArr;
        this.A02 = z2;
    }

    public static C90144dZ A00() {
        return new C90144dZ(new int[8], new Object[8], 0, true);
    }

    public final int A01() {
        int i2;
        int i3;
        int i4;
        int i5 = this.A01;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.A00; i7++) {
            int i8 = this.A03[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 == 0) {
                long A012 = C13700nu.A01(this.A04[i7]);
                i2 = AnonymousClass3K3.A0B(i9);
                i3 = C32531gX.A02(A012);
                i4 = i2 + i3;
            } else if (i10 == 1) {
                i4 = AnonymousClass3K3.A0B(i9) + 8;
            } else if (i10 == 2) {
                i4 = C32531gX.A03((AnonymousClass557) this.A04[i7], i9);
            } else if (i10 == 3) {
                i2 = AnonymousClass3K3.A0B(i9) << 1;
                i3 = ((C90144dZ) this.A04[i7]).A01();
                i4 = i2 + i3;
            } else if (i10 == 5) {
                i4 = AnonymousClass3K3.A0B(i9) + 4;
            } else {
                throw new IllegalStateException(new C67303bK());
            }
            i6 += i4;
        }
        this.A01 = i6;
        return i6;
    }

    public final void A02(int i2, Object obj) {
        if (this.A02) {
            int i3 = this.A00;
            int[] iArr = this.A03;
            if (i3 == iArr.length) {
                int i4 = i3 >> 1;
                if (i3 < 4) {
                    i4 = 8;
                }
                int i5 = i3 + i4;
                this.A03 = Arrays.copyOf(iArr, i5);
                this.A04 = Arrays.copyOf(this.A04, i5);
            }
            int[] iArr2 = this.A03;
            int i6 = this.A00;
            iArr2[i6] = i2;
            this.A04[i6] = obj;
            this.A00 = i6 + 1;
            return;
        }
        throw C13680ns.A0m();
    }

    public final void A03(AnonymousClass5M8 r7) {
        if (this.A00 != 0) {
            for (int i2 = 0; i2 < this.A00; i2++) {
                int i3 = this.A03[i2];
                Object obj = this.A04[i2];
                int i4 = i3 >>> 3;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    long A012 = C13700nu.A01(obj);
                    C32531gX r1 = ((C98574sd) r7).A00;
                    r1.A06(i4 << 3);
                    r1.A0A(A012);
                } else if (i5 == 1) {
                    AnonymousClass3K4.A0q(((C98574sd) r7).A00, i4, C13700nu.A01(obj));
                } else if (i5 == 2) {
                    ((C98574sd) r7).A00.A0C((AnonymousClass557) obj, i4);
                } else if (i5 == 3) {
                    C32531gX r2 = ((C98574sd) r7).A00;
                    int i6 = i4 << 3;
                    r2.A06(i6 | 3);
                    ((C90144dZ) obj).A03(r7);
                    r2.A06(i6 | 4);
                } else if (i5 == 5) {
                    AnonymousClass3K3.A1C(((C98574sd) r7).A00, i4, AnonymousClass000.A0D(obj));
                } else {
                    throw new RuntimeException(new C67303bK());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C90144dZ)) {
                C90144dZ r9 = (C90144dZ) obj;
                int i2 = this.A00;
                if (i2 == r9.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = r9.A03;
                    int i3 = 0;
                    while (true) {
                        if (i3 < i2) {
                            if (iArr[i3] != iArr2[i3]) {
                                break;
                            }
                            i3++;
                        } else {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = r9.A04;
                            int i4 = 0;
                            while (i4 < i2) {
                                if (objArr[i4].equals(objArr2[i4])) {
                                    i4++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = this.A00;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.A03;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.A04;
        for (int i8 = 0; i8 < i2; i8++) {
            i4 = AnonymousClass3K2.A06(objArr[i8], i4 * 31);
        }
        return i7 + i4;
    }
}
