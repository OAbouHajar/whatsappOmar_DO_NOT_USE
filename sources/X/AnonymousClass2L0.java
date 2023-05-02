package X;

import com.google.protobuf.CodedOutputStream;
import java.util.Arrays;

/* renamed from: X.2L0  reason: invalid class name */
public final class AnonymousClass2L0 {
    public static final AnonymousClass2L0 A04 = new AnonymousClass2L0(new int[0], new Object[0], 0, false);
    public int A00 = -1;
    public boolean A01;
    public int[] A02;
    public Object[] A03;
    public int count;

    public AnonymousClass2L0(int[] iArr, Object[] objArr, int i2, boolean z2) {
        this.count = i2;
        this.A02 = iArr;
        this.A03 = objArr;
        this.A01 = z2;
    }

    public int A00() {
        int i2;
        int i3;
        int i4;
        int i5 = this.A00;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.count; i7++) {
            int i8 = this.A02[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 == 0) {
                long longValue = ((Number) this.A03[i7]).longValue();
                int i11 = i9 << 3;
                if ((i11 & -128) == 0) {
                    i2 = 1;
                } else if ((i11 & -16384) == 0) {
                    i2 = 2;
                } else if ((-2097152 & i11) == 0) {
                    i2 = 3;
                } else {
                    i2 = 5;
                    if ((i11 & -268435456) == 0) {
                        i2 = 4;
                    }
                }
                i3 = CodedOutputStream.A03(longValue);
                i4 = i2 + i3;
            } else if (i10 == 1) {
                int i12 = i9 << 3;
                int i13 = 1;
                if ((i12 & -128) != 0) {
                    i13 = 2;
                    if ((i12 & -16384) != 0) {
                        i13 = 3;
                        if ((-2097152 & i12) != 0) {
                            i13 = 5;
                            if ((i12 & -268435456) == 0) {
                                i13 = 4;
                            }
                        }
                    }
                }
                i4 = i13 + 8;
            } else if (i10 == 2) {
                i4 = CodedOutputStream.A04((C28631Ww) this.A03[i7], i9);
            } else if (i10 == 3) {
                int i14 = i9 << 3;
                int i15 = 1;
                if ((i14 & -128) != 0) {
                    i15 = 2;
                    if ((i14 & -16384) != 0) {
                        i15 = 3;
                        if ((-2097152 & i14) != 0) {
                            i15 = 5;
                            if ((i14 & -268435456) == 0) {
                                i15 = 4;
                            }
                        }
                    }
                }
                i2 = i15 << 1;
                i3 = ((AnonymousClass2L0) this.A03[i7]).A00();
                i4 = i2 + i3;
            } else if (i10 == 5) {
                int i16 = i9 << 3;
                int i17 = 1;
                if ((i16 & -128) != 0) {
                    i17 = 2;
                    if ((i16 & -16384) != 0) {
                        i17 = 3;
                        if ((-2097152 & i16) != 0) {
                            i17 = 5;
                            if ((i16 & -268435456) == 0) {
                                i17 = 4;
                            }
                        }
                    }
                }
                i4 = i17 + 4;
            } else {
                throw new IllegalStateException(new C29791bD("Protocol message tag had invalid wire type."));
            }
            i6 += i4;
        }
        this.A00 = i6;
        return i6;
    }

    public final void A01(int i2, Object obj) {
        int i3 = this.count;
        int[] iArr = this.A02;
        if (i3 == iArr.length) {
            int i4 = i3 >> 1;
            if (i3 < 4) {
                i4 = 8;
            }
            int i5 = i3 + i4;
            this.A02 = Arrays.copyOf(iArr, i5);
            this.A03 = Arrays.copyOf(this.A03, i5);
        }
        int[] iArr2 = this.A02;
        int i6 = this.count;
        iArr2[i6] = i2;
        this.A03[i6] = obj;
        this.count = i6 + 1;
    }

    public void A02(CodedOutputStream codedOutputStream) {
        for (int i2 = 0; i2 < this.count; i2++) {
            int i3 = this.A02[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                codedOutputStream.A0C(i4, ((Number) this.A03[i2]).longValue());
            } else if (i5 == 1) {
                codedOutputStream.A0B(i4, ((Number) this.A03[i2]).longValue());
            } else if (i5 == 2) {
                codedOutputStream.A0F((C28631Ww) this.A03[i2], i4);
            } else if (i5 == 3) {
                int i6 = i4 << 3;
                codedOutputStream.A07(i6 | 3);
                ((AnonymousClass2L0) this.A03[i2]).A02(codedOutputStream);
                codedOutputStream.A07(i6 | 4);
            } else if (i5 == 5) {
                codedOutputStream.A08(i4, ((Number) this.A03[i2]).intValue());
            } else {
                throw new C29791bD("Protocol message tag had invalid wire type.");
            }
        }
    }

    public boolean A03(C47852Kx r7, int i2) {
        int A032;
        if (this.A01) {
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                A01(i2, Long.valueOf(r7.A06()));
                return true;
            } else if (i4 == 1) {
                A01(i2, Long.valueOf(r7.A05()));
                return true;
            } else if (i4 == 2) {
                A01(i2, r7.A08());
                return true;
            } else if (i4 == 3) {
                AnonymousClass2L0 r1 = new AnonymousClass2L0(new int[8], new Object[8], 0, true);
                do {
                    A032 = r7.A03();
                    if (A032 == 0 || !r1.A03(r7, A032)) {
                        r7.A0C((i3 << 3) | 4);
                        A01(i2, r1);
                    }
                    A032 = r7.A03();
                    break;
                } while (!r1.A03(r7, A032));
                r7.A0C((i3 << 3) | 4);
                A01(i2, r1);
                return true;
            } else if (i4 == 4) {
                return false;
            } else {
                if (i4 == 5) {
                    A01(i2, Integer.valueOf(r7.A01()));
                    return true;
                }
                throw new C29791bD("Protocol message tag had invalid wire type.");
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof AnonymousClass2L0)) {
                AnonymousClass2L0 r5 = (AnonymousClass2L0) obj;
                if (this.count != r5.count || !Arrays.equals(this.A02, r5.A02) || !Arrays.deepEquals(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((527 + this.count) * 31) + Arrays.hashCode(this.A02)) * 31) + Arrays.deepHashCode(this.A03);
    }
}
