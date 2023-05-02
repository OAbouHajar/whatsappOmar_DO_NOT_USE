package X;

import java.lang.reflect.Array;

/* renamed from: X.4TK  reason: invalid class name */
public final class AnonymousClass4TK {
    public C1043054u A00;
    public final AnonymousClass4CC A01;

    public AnonymousClass4TK(AnonymousClass4CC r1) {
        this.A01 = r1;
    }

    public C1043054u A00() {
        int[] iArr;
        int i2;
        C1043054u r0 = this.A00;
        C1043054u r22 = r0;
        if (r0 == null) {
            C69673fQ r02 = (C69673fQ) this.A01;
            C69673fQ r21 = r02;
            C1043054u r03 = r02.A00;
            r22 = r03;
            if (r03 == null) {
                C87354Wl r3 = r21.A00;
                int i3 = r3.A01;
                int i4 = i3;
                int i5 = r3.A00;
                if (i3 < 40 || i5 < 40) {
                    r22 = new C1043054u(i3, i5);
                    int i6 = i4;
                    if (r21.A01.length < i6) {
                        r21.A01 = new byte[i6];
                    }
                    int i7 = 0;
                    do {
                        iArr = r21.A02;
                        iArr[i7] = 0;
                        i7++;
                    } while (i7 < 32);
                    for (int i8 = 1; i8 < 5; i8++) {
                        byte[] A012 = r3.A01(r21.A01, (i5 * i8) / 5);
                        int i9 = (i4 << 2) / 5;
                        for (int i10 = i4 / 5; i10 < i9; i10++) {
                            AnonymousClass3K4.A17(iArr, (A012[i10] & 255) >> 3);
                        }
                    }
                    int length = iArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < length; i14++) {
                        if (iArr[i14] > i11) {
                            i11 = iArr[i14];
                            i13 = i14;
                        }
                        if (iArr[i14] > i12) {
                            i12 = iArr[i14];
                        }
                    }
                    int i15 = 0;
                    int i16 = 0;
                    for (int i17 = 0; i17 < length; i17++) {
                        int i18 = i17 - i13;
                        int i19 = iArr[i17] * i18 * i18;
                        if (i19 > i16) {
                            i15 = i17;
                            i16 = i19;
                        }
                    }
                    if (i13 <= i15) {
                        int i20 = i13;
                        i13 = i15;
                        i15 = i20;
                    }
                    if (i13 - i15 > (length >> 4)) {
                        int i21 = i13 - 1;
                        int i22 = i21;
                        int i23 = -1;
                        while (i21 > i15) {
                            int i24 = i21 - i15;
                            int i25 = i24 * i24 * (i13 - i21) * (i12 - iArr[i21]);
                            if (i25 > i23) {
                                i22 = i21;
                                i23 = i25;
                            }
                            i21--;
                        }
                        int i26 = i22 << 3;
                        byte[] A002 = r3.A00();
                        for (int i27 = 0; i27 < i5; i27++) {
                            int i28 = i27 * i4;
                            for (int i29 = 0; i29 < i4; i29++) {
                                if ((A002[i28 + i29] & 255) < i26) {
                                    r22.A01(i29, i27);
                                }
                            }
                        }
                    } else {
                        throw C69723fV.A00;
                    }
                } else {
                    byte[] A003 = r3.A00();
                    int i30 = i3 >> 3;
                    if ((i3 & 7) != 0) {
                        i30++;
                    }
                    int i31 = i5 >> 3;
                    if ((i5 & 7) != 0) {
                        i31++;
                    }
                    int i32 = i5 - 8;
                    int i33 = i4 - 8;
                    int[] iArr2 = new int[2];
                    iArr2[1] = i30;
                    iArr2[0] = i31;
                    int[][] iArr3 = (int[][]) Array.newInstance(int.class, iArr2);
                    for (int i34 = 0; i34 < i31; i34++) {
                        int i35 = i34 << 3;
                        int i36 = i32;
                        if (i35 > i36) {
                            i35 = i36;
                        }
                        for (int i37 = 0; i37 < i30; i37++) {
                            int i38 = i37 << 3;
                            if (i38 > i33) {
                                i38 = i33;
                            }
                            int i39 = (i35 * i4) + i38;
                            byte b2 = 255;
                            int i40 = 0;
                            int i41 = 0;
                            byte b3 = 0;
                            do {
                                int i42 = 0;
                                do {
                                    byte b4 = A003[i39 + i42] & 255;
                                    i41 += b4;
                                    if (b4 < b2) {
                                        b2 = b4;
                                    }
                                    if (b4 > b3) {
                                        b3 = b4;
                                    }
                                    i42++;
                                } while (i42 < 8);
                                i2 = b3 - b2;
                                if (i2 > 24) {
                                    while (true) {
                                        i40++;
                                        i39 += i4;
                                        if (i40 >= 8) {
                                            break;
                                        }
                                        int i43 = 0;
                                        do {
                                            i41 += A003[i39 + i43] & 255;
                                            i43++;
                                        } while (i43 < 8);
                                    }
                                }
                                i40++;
                                i39 += i4;
                            } while (i40 < 8);
                            int i44 = i41 >> 6;
                            if (i2 <= 24) {
                                i44 = b2 >> 1;
                                if (i34 > 0 && i37 > 0) {
                                    int[] iArr4 = iArr3[i34 - 1];
                                    int i45 = i37 - 1;
                                    int i46 = ((iArr4[i37] + (iArr3[i34][i45] << 1)) + iArr4[i45]) >> 2;
                                    if (b2 < i46) {
                                        i44 = i46;
                                    }
                                }
                            }
                            iArr3[i34][i37] = i44;
                        }
                    }
                    r22 = new C1043054u(i4, i5);
                    for (int i47 = 0; i47 < i31; i47++) {
                        int i48 = i47 << 3;
                        int i49 = i32;
                        if (i48 > i49) {
                            i48 = i49;
                        }
                        int i50 = i31 - 3;
                        if (i47 < 2) {
                            i50 = 2;
                        } else if (i47 <= i50) {
                            i50 = i47;
                        }
                        for (int i51 = 0; i51 < i30; i51++) {
                            int i52 = i51 << 3;
                            if (i52 > i33) {
                                i52 = i33;
                            }
                            int i53 = i30 - 3;
                            if (i51 < 2) {
                                i53 = 2;
                            } else if (i51 <= i53) {
                                i53 = i51;
                            }
                            int i54 = -2;
                            int i55 = 0;
                            do {
                                int[] iArr5 = iArr3[i50 + i54];
                                i55 = AnonymousClass3K4.A0E(iArr5, i53 + 2, iArr5[i53 - 2] + iArr5[i53 - 1] + iArr5[i53] + iArr5[i53 + 1], i55);
                                i54++;
                            } while (i54 <= 2);
                            int i56 = i55 / 25;
                            int i57 = (i48 * i4) + i52;
                            int i58 = 0;
                            while (i58 < 8) {
                                int i59 = 0;
                                do {
                                    if ((A003[i57 + i59] & 255) <= i56) {
                                        r22.A01(i52 + i59, i48 + i58);
                                    }
                                    i59++;
                                } while (i59 < 8);
                                i58++;
                                i57 += i4;
                            }
                        }
                    }
                }
                r21.A00 = r22;
            }
            this.A00 = r22;
        }
        return r22;
    }

    public String toString() {
        try {
            return A00().toString();
        } catch (C69723fV unused) {
            return "";
        }
    }
}
