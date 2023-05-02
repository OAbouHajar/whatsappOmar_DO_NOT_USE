package X;

/* renamed from: X.4eh  reason: invalid class name and case insensitive filesystem */
public final class C90724eh {
    public static int A00(C84184Jo r9, C90134dY r10, byte[] bArr, int i2, int i3, int i4) {
        int i5 = i3;
        if ((i2 >>> 3) != 0) {
            int i6 = i2 & 7;
            C84184Jo r4 = r9;
            byte[] bArr2 = bArr;
            if (i6 == 0) {
                int A02 = A02(r9, bArr, i3);
                r10.A01(i2, Long.valueOf(r9.A01));
                return A02;
            } else if (i6 == 1) {
                r10.A01(i2, Long.valueOf(AnonymousClass3K2.A0K(bArr, i3)));
                return i3 + 8;
            } else if (i6 == 2) {
                int A01 = A01(r9, bArr, i3);
                int i7 = r9.A00;
                r10.A01(i2, i7 == 0 ? AnonymousClass556.A00 : new AnonymousClass3ZC(AnonymousClass556.A01.AjG(bArr, A01, i7)));
                return A01 + i7;
            } else if (i6 == 3) {
                C90134dY r5 = new C90134dY(new int[8], new Object[8], 0, true);
                int i8 = (i2 & -8) | 4;
                int i9 = 0;
                while (true) {
                    int i10 = i4;
                    if (i5 >= i4) {
                        break;
                    }
                    i5 = A01(r4, bArr, i5);
                    i9 = r4.A00;
                    if (i9 == i8) {
                        break;
                    }
                    i5 = A00(r4, r5, bArr2, i9, i5, i10);
                }
                if (i5 > i4 || i9 != i8) {
                    throw new AnonymousClass40G("Failed to parse the message.");
                }
                r10.A01(i2, r5);
                return i5;
            } else if (i6 == 5) {
                r10.A01(i2, Integer.valueOf(AnonymousClass3K2.A0D(bArr, i3)));
                return i3 + 4;
            }
        }
        throw new AnonymousClass40G("Protocol message contained an invalid tag (zero).");
    }

    public static int A01(C84184Jo r2, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return A04(r2, bArr, b2, i3);
        }
        r2.A00 = b2;
        return i3;
    }

    public static int A02(C84184Jo r8, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        long j2 = (long) bArr[i2];
        if (j2 >= 0) {
            r8.A01 = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & Byte.MAX_VALUE)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            b2 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i5;
            i4++;
        }
        r8.A01 = j3;
        return i4;
    }

    public static int A03(C84184Jo r4, byte[] bArr, int i2) {
        int A01 = A01(r4, bArr, i2);
        int i3 = r4.A00;
        if (i3 == 0) {
            r4.A02 = AnonymousClass556.A00;
            return A01;
        }
        r4.A02 = new AnonymousClass3ZC(AnonymousClass556.A01.AjG(bArr, A01, i3));
        return A01 + i3;
    }

    public static int A04(C84184Jo r4, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = i2 & 127;
        int i8 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            i6 = b2 << 7;
        } else {
            int i9 = i7 | ((b2 & Byte.MAX_VALUE) << 7);
            int i10 = i8 + 1;
            byte b3 = bArr[i8];
            if (b3 >= 0) {
                i5 = b3 << 14;
            } else {
                i7 = i9 | ((b3 & Byte.MAX_VALUE) << 14);
                i8 = i10 + 1;
                byte b4 = bArr[i10];
                if (b4 >= 0) {
                    i6 = b4 << 21;
                } else {
                    i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
                    i10 = i8 + 1;
                    byte b5 = bArr[i8];
                    if (b5 >= 0) {
                        i5 = b5 << 28;
                    } else {
                        i4 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            i8 = i10 + 1;
                            if (bArr[i10] >= 0) {
                                break;
                            }
                            i10 = i8;
                        }
                        r4.A00 = i4;
                        return i8;
                    }
                }
            }
            r4.A00 = i9 | i5;
            return i10;
        }
        i4 = i7 | i6;
        r4.A00 = i4;
        return i8;
    }
}
