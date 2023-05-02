package X;

import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.4sb  reason: invalid class name and case insensitive filesystem */
public final class C98554sb implements AnonymousClass5TK {
    public static final Unsafe A0E = C90914f4.A05();
    public static final int[] A0F = new int[0];
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass45K A04;
    public final C88844bB A05;
    public final AnonymousClass5O7 A06;
    public final C109905Uc A07;
    public final AnonymousClass5M4 A08;
    public final AnonymousClass45M A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final Object[] A0D;

    public C98554sb(AnonymousClass45K r1, C88844bB r2, AnonymousClass5O7 r3, C109905Uc r4, AnonymousClass5M4 r5, AnonymousClass45M r6, int[] iArr, int[] iArr2, Object[] objArr, int i2, int i3, int i4, int i5, boolean z2) {
        this.A0B = iArr;
        this.A0D = objArr;
        this.A00 = i2;
        this.A01 = i3;
        this.A0A = z2;
        this.A0C = iArr2;
        this.A02 = i4;
        this.A03 = i5;
        this.A08 = r5;
        this.A05 = r2;
        this.A09 = r6;
        this.A04 = r1;
        this.A07 = r4;
        this.A06 = r3;
    }

    public static int A00(int i2, int i3) {
        return C32531gX.A00(i2 << 3) + C32531gX.A00((i3 >> 31) ^ (i3 << 1));
    }

    public static int A01(int i2, int i3, int i4) {
        return i4 + (i3 * C32531gX.A00(i2 << 3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.C88174a4 r6, X.AnonymousClass5TK r7, byte[] r8, int r9, int r10) {
        /*
            int r4 = r9 + 1
            r3 = r8
            byte r5 = r8[r9]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = A0A(r6, r8, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x0022
        L_0x0010:
            int r10 = r10 - r4
            if (r5 > r10) goto L_0x0022
            r0 = r7
            java.lang.Object r2 = r7.Ain()
            int r5 = r5 + r4
            r0.Aiy(r1, r2, r3, r4, r5)
            r7.AjE(r2)
            r6.A02 = r2
            return r5
        L_0x0022:
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.40H r0 = new X.40H
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98554sb.A02(X.4a4, X.5TK, byte[], int, int):int");
    }

    public static int A03(C88174a4 r2, AnonymousClass5TK r3, byte[] bArr, int i2, int i3, int i4) {
        C98554sb r1 = (C98554sb) r3;
        Object Ain = r1.Ain();
        int A0K = r1.A0K(r2, Ain, bArr, i2, i3, i4);
        r1.AjE(Ain);
        r2.A02 = Ain;
        return A0K;
    }

    public static int A04(C88174a4 r8, C90144dZ r9, byte[] bArr, int i2, int i3, int i4) {
        Object r1;
        int i5 = i3;
        if ((i2 >>> 3) != 0) {
            int i6 = i2 & 7;
            C88174a4 r3 = r8;
            byte[] bArr2 = bArr;
            if (i6 == 0) {
                int A062 = A06(r8, bArr, i3);
                r9.A02(i2, Long.valueOf(r8.A01));
                return A062;
            } else if (i6 == 1) {
                r9.A02(i2, Long.valueOf(AnonymousClass3K2.A0K(bArr, i3)));
                return i3 + 8;
            } else if (i6 == 2) {
                int A052 = A05(r8, bArr, i3);
                int i7 = r8.A00;
                if (i7 >= 0) {
                    int length = bArr.length;
                    if (i7 <= length - A052) {
                        if (i7 == 0) {
                            r1 = AnonymousClass557.A00;
                        } else {
                            AnonymousClass557.A01(A052, A052 + i7, length);
                            r1 = new C66963am(AnonymousClass557.A01.Ait(bArr, A052, i7));
                        }
                        r9.A02(i2, r1);
                        return A052 + i7;
                    }
                    throw new AnonymousClass40H("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                throw new AnonymousClass40H("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            } else if (i6 == 3) {
                C90144dZ A002 = C90144dZ.A00();
                int i8 = (i2 & -8) | 4;
                int i9 = 0;
                while (true) {
                    int i10 = i4;
                    if (i5 >= i4) {
                        break;
                    }
                    i5 = A05(r3, bArr, i5);
                    i9 = r3.A00;
                    if (i9 == i8) {
                        break;
                    }
                    i5 = A04(r3, A002, bArr2, i9, i5, i10);
                }
                if (i5 > i4 || i9 != i8) {
                    throw new AnonymousClass40H("Failed to parse the message.");
                }
                r9.A02(i2, A002);
                return i5;
            } else if (i6 == 5) {
                r9.A02(i2, Integer.valueOf(AnonymousClass3K2.A0D(bArr, i3)));
                return i3 + 4;
            }
        }
        throw new AnonymousClass40H("Protocol message contained an invalid tag (zero).");
    }

    public static int A05(C88174a4 r2, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return A0A(r2, bArr, b2, i3);
        }
        r2.A00 = b2;
        return i3;
    }

    public static int A06(C88174a4 r8, byte[] bArr, int i2) {
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

    public static int A07(C88174a4 r4, byte[] bArr, int i2) {
        int A052 = A05(r4, bArr, i2);
        int i3 = r4.A00;
        if (i3 < 0) {
            throw new AnonymousClass40H("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i3 == 0) {
            r4.A02 = "";
            return A052;
        } else {
            r4.A02 = new String(bArr, A052, i3, AnonymousClass4ZC.A02);
            return A052 + i3;
        }
    }

    public static int A08(C88174a4 r15, byte[] bArr, int i2) {
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C88174a4 r9 = r15;
        byte[] bArr2 = bArr;
        int A052 = A05(r15, bArr2, i2);
        int i9 = r15.A00;
        if (i9 < 0) {
            throw new AnonymousClass40H("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i9 == 0) {
            r15.A02 = "";
            return A052;
        } else {
            int i10 = A052;
            if (AnonymousClass4YS.A00 instanceof C67373bR) {
                int length = bArr2.length;
                if ((A052 | i9 | ((length - A052) - i9)) >= 0) {
                    int i11 = A052 + i9;
                    char[] cArr = new char[i9];
                    int i12 = 0;
                    while (i7 < i11) {
                        byte A002 = C90914f4.A00(bArr2, (long) i7);
                        if (A002 < 0) {
                            break;
                        }
                        i10 = i7 + 1;
                        cArr[i6] = (char) A002;
                        i12 = i6 + 1;
                    }
                    while (i7 < i11) {
                        int i13 = i7 + 1;
                        byte A003 = C90914f4.A00(bArr2, (long) i7);
                        if (A003 >= 0) {
                            i8 = i6 + 1;
                            cArr[i6] = (char) A003;
                            while (i13 < i11) {
                                byte A004 = C90914f4.A00(bArr2, (long) i13);
                                if (A004 < 0) {
                                    break;
                                }
                                i13++;
                                cArr[i8] = (char) A004;
                                i8++;
                            }
                            i7 = i13;
                        } else {
                            if (A003 < -32) {
                                if (i13 < i11) {
                                    i7 = i13 + 1;
                                    byte A005 = C90914f4.A00(bArr2, (long) i13);
                                    i8 = i6 + 1;
                                    if (A003 < -62 || A005 > -65) {
                                        throw new AnonymousClass40H("Protocol message had invalid UTF-8.");
                                    }
                                    cArr[i6] = (char) (((A003 & 31) << 6) | (A005 & 63));
                                }
                            } else if (A003 < -16) {
                                if (i13 < i11 - 1) {
                                    int i14 = i13 + 1;
                                    i7 = i14 + 1;
                                    C87524Xg.A01(cArr, A003, C90914f4.A00(bArr2, (long) i13), C90914f4.A00(bArr2, (long) i14), i6);
                                    i6++;
                                }
                            } else if (i13 < i11 - 2) {
                                int i15 = i13 + 1;
                                byte A006 = C90914f4.A00(bArr2, (long) i13);
                                int i16 = i15 + 1;
                                i7 = i16 + 1;
                                C87524Xg.A00(cArr, A003, A006, C90914f4.A00(bArr2, (long) i15), C90914f4.A00(bArr2, (long) i16), i6);
                                i6 = i6 + 1 + 1;
                            }
                            throw new AnonymousClass40H("Protocol message had invalid UTF-8.");
                        }
                        i6 = i8;
                    }
                    str = new String(cArr, 0, i6);
                } else {
                    Object[] objArr = new Object[3];
                    AnonymousClass000.A1M(objArr, length, 0);
                    AnonymousClass000.A1M(objArr, A052, 1);
                    AnonymousClass3K2.A1W(objArr, i9);
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", objArr));
                }
            } else {
                int length2 = bArr2.length;
                if ((A052 | i9 | ((length2 - A052) - i9)) >= 0) {
                    int i17 = A052 + i9;
                    char[] cArr2 = new char[i9];
                    int i18 = 0;
                    while (i4 < i17) {
                        byte b2 = bArr[i4];
                        if (b2 < 0) {
                            break;
                        }
                        i10 = i4 + 1;
                        cArr2[i3] = (char) b2;
                        i18 = i3 + 1;
                    }
                    while (i4 < i17) {
                        int i19 = i4 + 1;
                        byte b3 = bArr2[i4];
                        if (b3 >= 0) {
                            i5 = i3 + 1;
                            cArr2[i3] = (char) b3;
                            while (i19 < i17) {
                                byte b4 = bArr2[i19];
                                if (b4 < 0) {
                                    break;
                                }
                                i19++;
                                cArr2[i5] = (char) b4;
                                i5++;
                            }
                            i4 = i19;
                        } else {
                            if (b3 < -32) {
                                if (i19 < i17) {
                                    i4 = i19 + 1;
                                    byte b5 = bArr2[i19];
                                    i5 = i3 + 1;
                                    if (b3 < -62 || b5 > -65) {
                                        throw new AnonymousClass40H("Protocol message had invalid UTF-8.");
                                    }
                                    cArr2[i3] = (char) (((b3 & 31) << 6) | (b5 & 63));
                                }
                            } else if (b3 < -16) {
                                if (i19 < i17 - 1) {
                                    int i20 = i19 + 1;
                                    i4 = i20 + 1;
                                    C87524Xg.A01(cArr2, b3, bArr2[i19], bArr2[i20], i3);
                                    i3++;
                                }
                            } else if (i19 < i17 - 2) {
                                int i21 = i19 + 1;
                                byte b6 = bArr2[i19];
                                int i22 = i21 + 1;
                                byte b7 = bArr2[i21];
                                i4 = i22 + 1;
                                C87524Xg.A00(cArr2, b3, b6, b7, bArr2[i22], i3);
                                i3 = i3 + 1 + 1;
                            }
                            throw new AnonymousClass40H("Protocol message had invalid UTF-8.");
                        }
                        i3 = i5;
                    }
                    str = new String(cArr2, 0, i3);
                } else {
                    Object[] objArr2 = new Object[3];
                    AnonymousClass000.A1M(objArr2, length2, 0);
                    AnonymousClass000.A1M(objArr2, A052, 1);
                    AnonymousClass3K2.A1W(objArr2, i9);
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", objArr2));
                }
            }
            r9.A02 = str;
            return A052 + i9;
        }
    }

    public static int A09(C88174a4 r4, byte[] bArr, int i2) {
        int A052 = A05(r4, bArr, i2);
        int i3 = r4.A00;
        if (i3 >= 0) {
            int length = bArr.length;
            if (i3 > length - A052) {
                throw new AnonymousClass40H("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } else if (i3 == 0) {
                r4.A02 = AnonymousClass557.A00;
                return A052;
            } else {
                AnonymousClass557.A01(A052, A052 + i3, length);
                r4.A02 = new C66963am(AnonymousClass557.A01.Ait(bArr, A052, i3));
                return A052 + i3;
            }
        } else {
            throw new AnonymousClass40H("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public static int A0A(C88174a4 r4, byte[] bArr, int i2, int i3) {
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

    public static int A0B(C32531gX r2, AnonymousClass5TK r3, Object obj, int i2) {
        r2.A06((i2 << 3) | 2);
        C98484sU r4 = (C98484sU) obj;
        C67293bJ r22 = (C67293bJ) r4;
        int i3 = r22.zzc;
        if (i3 != -1) {
            return i3;
        }
        int Aj1 = r3.Aj1(r4);
        r22.zzc = Aj1;
        return Aj1;
    }

    public static int A0C(List list) {
        return list.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0177, code lost:
        if (r40 == false) goto L_0x0179;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C98554sb A0D(X.AnonymousClass45K r41, X.C88844bB r42, X.AnonymousClass5O7 r43, X.AnonymousClass5M3 r44, X.AnonymousClass5M4 r45, X.AnonymousClass45M r46) {
        /*
            r7 = r44
            boolean r0 = r7 instanceof X.C98474sT
            if (r0 == 0) goto L_0x0386
            X.4sT r7 = (X.C98474sT) r7
            int r0 = r7.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 == r1) goto L_0x0010
            r1 = 2
        L_0x0010:
            r0 = 2
            r4 = 0
            r15 = 1
            boolean r40 = X.AnonymousClass000.A1R(r1, r0)
            java.lang.String r12 = r7.A02
            int r27 = r12.length()
            char r0 = r12.charAt(r4)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r13) goto L_0x0031
            r0 = 1
        L_0x0027:
            int r1 = r0 + 1
            char r0 = r12.charAt(r0)
            if (r0 < r13) goto L_0x0032
            r0 = r1
            goto L_0x0027
        L_0x0031:
            r1 = 1
        L_0x0032:
            int r11 = r1 + 1
            char r3 = r12.charAt(r1)
            if (r3 < r13) goto L_0x0051
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x003e:
            int r1 = r11 + 1
            char r0 = r12.charAt(r11)
            if (r0 < r13) goto L_0x004e
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r3 = r3 | r0
            int r2 = r2 + 13
            r11 = r1
            goto L_0x003e
        L_0x004e:
            int r0 = r0 << r2
            r3 = r3 | r0
            r11 = r1
        L_0x0051:
            if (r3 != 0) goto L_0x0265
            int[] r18 = A0F
            r17 = 0
            r3 = 0
            r2 = 0
            r6 = 0
            r5 = 0
            r1 = 0
        L_0x005c:
            sun.misc.Unsafe r26 = A0E
            java.lang.Object[] r10 = r7.A03
            X.5Uc r0 = r7.A01
            r30 = r0
            java.lang.Class r14 = r30.getClass()
            int r0 = r6 * 3
            int[] r0 = new int[r0]
            r25 = r0
            int r6 = r6 << r15
            java.lang.Object[] r9 = new java.lang.Object[r6]
            int r39 = r1 + r5
            r24 = r1
            r23 = r39
            r22 = 0
            r21 = 0
        L_0x007b:
            r0 = r27
            if (r11 >= r0) goto L_0x036a
            int r0 = r11 + 1
            char r8 = r12.charAt(r11)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r5) goto L_0x00a1
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x008e:
            int r5 = r0 + 1
            char r6 = r12.charAt(r0)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r0) goto L_0x00a3
            r0 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r7
            r8 = r8 | r0
            int r7 = r7 + 13
            r0 = r5
            goto L_0x008e
        L_0x00a1:
            r5 = r0
            goto L_0x00a5
        L_0x00a3:
            int r6 = r6 << r7
            r8 = r8 | r6
        L_0x00a5:
            int r0 = r5 + 1
            char r7 = r12.charAt(r5)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r5) goto L_0x00c7
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00b4:
            int r5 = r0 + 1
            char r6 = r12.charAt(r0)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r0) goto L_0x00c9
            r0 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r11
            r7 = r7 | r0
            int r11 = r11 + 13
            r0 = r5
            goto L_0x00b4
        L_0x00c7:
            r5 = r0
            goto L_0x00cb
        L_0x00c9:
            int r6 = r6 << r11
            r7 = r7 | r6
        L_0x00cb:
            r6 = r7 & 255(0xff, float:3.57E-43)
            r0 = r7 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00d7
            int r0 = r22 + 1
            r18[r22] = r21
            r22 = r0
        L_0x00d7:
            r0 = 51
            if (r6 < r0) goto L_0x00fe
            int r11 = r5 + 1
            char r13 = r12.charAt(r5)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r0) goto L_0x01d7
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x00ea:
            int r15 = r11 + 1
            char r5 = r12.charAt(r11)
            if (r5 < r0) goto L_0x01d3
            r0 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r16
            r13 = r13 | r0
            int r16 = r16 + 13
            r11 = r15
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x00ea
        L_0x00fe:
            int r19 = r17 + 1
            r0 = r10[r17]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r11 = A0F(r14, r0)
            r0 = 9
            if (r6 == r0) goto L_0x018b
            r0 = 17
            if (r6 == r0) goto L_0x018b
            r0 = 27
            if (r6 == r0) goto L_0x0179
            r0 = 49
            if (r6 == r0) goto L_0x0179
            r0 = 12
            if (r6 == r0) goto L_0x0177
            r0 = 30
            if (r6 == r0) goto L_0x0177
            r0 = 44
            if (r6 == r0) goto L_0x0177
            r0 = 50
            if (r6 != r0) goto L_0x0144
            int r15 = r24 + 1
            r18[r24] = r21
            int r0 = r21 / 3
            int r13 = r0 << 1
            int r16 = r19 + 1
            r0 = r10[r19]
            r9[r13] = r0
            r0 = r7 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0186
            int r13 = r13 + 1
            int r19 = r16 + 1
            r0 = r10[r16]
            r9[r13] = r0
            r24 = r15
        L_0x0144:
            r0 = r26
            long r15 = r0.objectFieldOffset(r11)
            int r0 = (int) r15
            r20 = r0
            r11 = r7 & 4096(0x1000, float:5.74E-42)
            r0 = 4096(0x1000, float:5.74E-42)
            if (r11 != r0) goto L_0x0198
            r0 = 17
            if (r6 > r0) goto L_0x0198
            int r11 = r5 + 1
            char r13 = r12.charAt(r5)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r0) goto L_0x01b1
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0166:
            int r15 = r11 + 1
            char r5 = r12.charAt(r11)
            if (r5 < r0) goto L_0x01ad
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r16
            r13 = r13 | r5
            int r16 = r16 + 13
            r11 = r15
            goto L_0x0166
        L_0x0177:
            if (r40 != 0) goto L_0x0144
        L_0x0179:
            int r0 = r21 / 3
            int r0 = r0 << 1
            int r13 = r0 + 1
            int r16 = r19 + 1
            r0 = r10[r19]
            r9[r13] = r0
            goto L_0x0188
        L_0x0186:
            r24 = r15
        L_0x0188:
            r19 = r16
            goto L_0x0144
        L_0x018b:
            int r0 = r21 / 3
            int r0 = r0 << 1
            int r13 = r0 + 1
            java.lang.Class r0 = r11.getType()
            r9[r13] = r0
            goto L_0x0144
        L_0x0198:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r5
            r16 = 0
            r5 = 18
            if (r6 < r5) goto L_0x01c7
            r5 = 49
            if (r6 > r5) goto L_0x01c7
            int r5 = r23 + 1
            r18[r23] = r20
            r23 = r5
            goto L_0x01c7
        L_0x01ad:
            int r5 = r5 << r16
            r13 = r13 | r5
            r11 = r15
        L_0x01b1:
            int r15 = r4 << 1
            int r0 = r13 >> 5
            int r15 = r15 + r0
            r5 = r10[r15]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x01ca
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x01be:
            r0 = r26
            long r15 = r0.objectFieldOffset(r5)
            int r0 = (int) r15
            int r16 = r13 % 32
        L_0x01c7:
            r17 = r19
            goto L_0x021d
        L_0x01ca:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = A0F(r14, r5)
            r10[r15] = r5
            goto L_0x01be
        L_0x01d3:
            int r5 = r5 << r16
            r13 = r13 | r5
            r11 = r15
        L_0x01d7:
            int r0 = r6 + -51
            r5 = 9
            if (r0 == r5) goto L_0x0254
            r5 = 17
            if (r0 == r5) goto L_0x0254
            r5 = 12
            if (r0 != r5) goto L_0x01f5
            if (r40 != 0) goto L_0x01f5
            int r5 = r21 / 3
            r0 = 1
            int r5 = r5 << r0
            int r15 = r5 + 1
            int r5 = r17 + 1
            r0 = r10[r17]
            r9[r15] = r0
            r17 = r5
        L_0x01f5:
            r16 = 1
        L_0x01f7:
            int r13 = r13 << r16
            r5 = r10[r13]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x024b
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x0201:
            r0 = r26
            long r15 = r0.objectFieldOffset(r5)
            int r0 = (int) r15
            r20 = r0
            int r13 = r13 + 1
            r5 = r10[r13]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0242
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x0214:
            r0 = r26
            long r15 = r0.objectFieldOffset(r5)
            int r0 = (int) r15
            r16 = 0
        L_0x021d:
            int r15 = r21 + 1
            r25[r21] = r8
            int r13 = r15 + 1
            r5 = r7 & 512(0x200, float:7.175E-43)
            r8 = 0
            if (r5 == 0) goto L_0x022a
            r8 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x022a:
            r5 = r7 & 256(0x100, float:3.59E-43)
            r7 = 0
            if (r5 == 0) goto L_0x0231
            r7 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0231:
            r7 = r7 | r8
            int r5 = r6 << 20
            r7 = r7 | r5
            r7 = r7 | r20
            r25[r15] = r7
            int r21 = r13 + 1
            int r5 = r16 << 20
            r5 = r5 | r0
            r25[r13] = r5
            goto L_0x007b
        L_0x0242:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = A0F(r14, r5)
            r10[r13] = r5
            goto L_0x0214
        L_0x024b:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = A0F(r14, r5)
            r10[r13] = r5
            goto L_0x0201
        L_0x0254:
            int r0 = r21 / 3
            r16 = 1
            int r0 = r0 << r16
            int r15 = r0 + 1
            int r5 = r17 + 1
            r0 = r10[r17]
            r9[r15] = r0
            r17 = r5
            goto L_0x01f7
        L_0x0265:
            int r0 = r11 + 1
            char r4 = r12.charAt(r11)
            if (r4 < r13) goto L_0x0284
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0271:
            int r1 = r0 + 1
            char r0 = r12.charAt(r0)
            if (r0 < r13) goto L_0x0281
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r4 = r4 | r0
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0271
        L_0x0281:
            int r0 = r0 << r2
            r4 = r4 | r0
            r0 = r1
        L_0x0284:
            int r3 = r0 + 1
            char r8 = r12.charAt(r0)
            if (r8 < r13) goto L_0x02a3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0290:
            int r1 = r3 + 1
            char r0 = r12.charAt(r3)
            if (r0 < r13) goto L_0x02a0
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r8 = r8 | r0
            int r2 = r2 + 13
            r3 = r1
            goto L_0x0290
        L_0x02a0:
            int r0 = r0 << r2
            r8 = r8 | r0
            r3 = r1
        L_0x02a3:
            int r0 = r3 + 1
            char r3 = r12.charAt(r3)
            if (r3 < r13) goto L_0x02c2
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02af:
            int r1 = r0 + 1
            char r0 = r12.charAt(r0)
            if (r0 < r13) goto L_0x02bf
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r3 = r3 | r0
            int r2 = r2 + 13
            r0 = r1
            goto L_0x02af
        L_0x02bf:
            int r0 = r0 << r2
            r3 = r3 | r0
            r0 = r1
        L_0x02c2:
            int r6 = r0 + 1
            char r2 = r12.charAt(r0)
            if (r2 < r13) goto L_0x02e1
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x02ce:
            int r1 = r6 + 1
            char r0 = r12.charAt(r6)
            if (r0 < r13) goto L_0x02de
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r5
            r2 = r2 | r0
            int r5 = r5 + 13
            r6 = r1
            goto L_0x02ce
        L_0x02de:
            int r0 = r0 << r5
            r2 = r2 | r0
            r6 = r1
        L_0x02e1:
            int r0 = r6 + 1
            char r6 = r12.charAt(r6)
            if (r6 < r13) goto L_0x0300
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x02ed:
            int r1 = r0 + 1
            char r0 = r12.charAt(r0)
            if (r0 < r13) goto L_0x02fd
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r5
            r6 = r6 | r0
            int r5 = r5 + 13
            r0 = r1
            goto L_0x02ed
        L_0x02fd:
            int r0 = r0 << r5
            r6 = r6 | r0
            r0 = r1
        L_0x0300:
            int r10 = r0 + 1
            char r5 = r12.charAt(r0)
            if (r5 < r13) goto L_0x031f
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x030c:
            int r1 = r10 + 1
            char r0 = r12.charAt(r10)
            if (r0 < r13) goto L_0x031c
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r9
            r5 = r5 | r0
            int r9 = r9 + 13
            r10 = r1
            goto L_0x030c
        L_0x031c:
            int r0 = r0 << r9
            r5 = r5 | r0
            r10 = r1
        L_0x031f:
            int r0 = r10 + 1
            char r10 = r12.charAt(r10)
            if (r10 < r13) goto L_0x033e
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x032b:
            int r1 = r0 + 1
            char r0 = r12.charAt(r0)
            if (r0 < r13) goto L_0x033b
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r9
            r10 = r10 | r0
            int r9 = r9 + 13
            r0 = r1
            goto L_0x032b
        L_0x033b:
            int r0 = r0 << r9
            r10 = r10 | r0
            r0 = r1
        L_0x033e:
            int r11 = r0 + 1
            char r1 = r12.charAt(r0)
            if (r1 < r13) goto L_0x035d
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x034a:
            int r9 = r11 + 1
            char r0 = r12.charAt(r11)
            if (r0 < r13) goto L_0x035a
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r14
            r1 = r1 | r0
            int r14 = r14 + 13
            r11 = r9
            goto L_0x034a
        L_0x035a:
            int r0 = r0 << r14
            r1 = r1 | r0
            r11 = r9
        L_0x035d:
            int r0 = r1 + r5
            int r0 = r0 + r10
            int[] r0 = new int[r0]
            r18 = r0
            int r17 = r4 << 1
            int r17 = r17 + r8
            goto L_0x005c
        L_0x036a:
            X.4sb r26 = new X.4sb
            r27 = r41
            r28 = r42
            r29 = r43
            r31 = r45
            r32 = r46
            r33 = r25
            r34 = r18
            r35 = r9
            r36 = r3
            r37 = r2
            r38 = r1
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r26
        L_0x0386:
            java.lang.String r0 = "zza"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98554sb.A0D(X.45K, X.4bB, X.5O7, X.5M3, X.5M4, X.45M):X.4sb");
    }

    public static Object A0E(Object obj, int i2) {
        return C90914f4.A03(obj, (long) (i2 & 1048575));
    }

    public static Field A0F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            throw AnonymousClass000.A0a(AnonymousClass000.A0h(arrays, AnonymousClass3K2.A0p(arrays, str, name)));
        }
    }

    public static List A0G(int i2, Object obj) {
        return (List) C90914f4.A03(obj, (long) (i2 & 1048575));
    }

    public static void A0H(C98574sd r2, AnonymousClass5TK r3, Object obj, int i2) {
        C32531gX r22 = r2.A00;
        int i3 = i2 << 3;
        r22.A06(i3 | 3);
        r3.Aix(r22.A01, obj);
        r22.A06(i3 | 4);
    }

    public static void A0I(Object obj, long j2, int i2) {
        C32531gX r3 = ((C98574sd) obj).A00;
        r3.A06(i2 << 3);
        r3.A0A((j2 >> 63) ^ (j2 << 1));
    }

    public final int A0J(int i2) {
        if (i2 >= this.A00 && i2 <= this.A01) {
            int i3 = 0;
            int[] iArr = this.A0B;
            int length = (iArr.length / 3) - 1;
            while (i3 <= length) {
                int i4 = (length + i3) >>> 1;
                int i5 = i4 * 3;
                int i6 = iArr[i5];
                if (i2 == i6) {
                    return i5;
                }
                if (i2 < i6) {
                    length = i4 - 1;
                } else {
                    i3 = i4 + 1;
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01fc, code lost:
        r7 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0300, code lost:
        r7 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0302, code lost:
        r11 = r11 | r14;
        r13 = r17;
        r14 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        r13 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0179, code lost:
        r10.putInt(r9, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018b, code lost:
        r2 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018d, code lost:
        r10.putObject(r9, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01df, code lost:
        r10.putLong(r9, r0, r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0K(X.C88174a4 r40, java.lang.Object r41, byte[] r42, int r43, int r44, int r45) {
        /*
            r39 = this;
            r7 = r43
            sun.misc.Unsafe r10 = A0E
            r1 = -1
            r14 = 0
            r12 = 0
            r11 = 0
            r13 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000b:
            r8 = r39
            r29 = r44
            r9 = r41
            r23 = r45
            r0 = r29
            if (r7 >= r0) goto L_0x00a6
            int r4 = r7 + 1
            r5 = r42
            byte r12 = r42[r7]
            r6 = r40
            if (r12 >= 0) goto L_0x0027
            int r4 = A0A(r6, r5, r12, r4)
            int r12 = r6.A00
        L_0x0027:
            int r22 = r12 >>> 3
            r7 = r12 & 7
            r2 = 3
            r0 = r22
            if (r0 <= r1) goto L_0x0056
            int r14 = r14 / r2
            int r1 = r8.A00
            if (r0 < r1) goto L_0x030a
            int r1 = r8.A01
            if (r0 > r1) goto L_0x030a
            int[] r3 = r8.A0B
            int r0 = r3.length
            int r0 = r0 / 3
            int r2 = r0 + -1
        L_0x0040:
            if (r14 > r2) goto L_0x030a
            int r0 = r2 + r14
            int r16 = r0 >>> 1
            int r15 = r16 * 3
            r1 = r3[r15]
            r0 = r22
            if (r0 == r1) goto L_0x005a
            if (r0 >= r1) goto L_0x0053
            int r2 = r16 + -1
            goto L_0x0040
        L_0x0053:
            int r14 = r16 + 1
            goto L_0x0040
        L_0x0056:
            int r15 = r8.A0J(r0)
        L_0x005a:
            r20 = 0
            r0 = -1
            if (r15 == r0) goto L_0x030a
            int[] r14 = r8.A0B
            int r0 = r15 + 1
            r19 = r14[r0]
            int r18 = X.AnonymousClass3K4.A04(r19)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r19 & r0
            long r0 = (long) r0
            r2 = 17
            r3 = r2
            r2 = r18
            if (r2 > r3) goto L_0x0204
            int r2 = r15 + 2
            r17 = r14[r2]
            int r2 = r17 >>> 20
            r16 = 1
            int r14 = r16 << r2
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r17 = r17 & r2
            r2 = r17
            if (r2 == r13) goto L_0x0200
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r13 == r2) goto L_0x0092
            long r2 = (long) r13
            r10.putInt(r9, r2, r11)
        L_0x0092:
            r2 = r17
            long r2 = (long) r2
            int r11 = r10.getInt(r9, r2)
        L_0x0099:
            switch(r18) {
                case 0: goto L_0x02eb;
                case 1: goto L_0x01ec;
                case 2: goto L_0x01d7;
                case 3: goto L_0x01d7;
                case 4: goto L_0x01ca;
                case 5: goto L_0x01b7;
                case 6: goto L_0x01ac;
                case 7: goto L_0x0197;
                case 8: goto L_0x017e;
                case 9: goto L_0x0245;
                case 10: goto L_0x00f4;
                case 11: goto L_0x01ca;
                case 12: goto L_0x0131;
                case 13: goto L_0x01ac;
                case 14: goto L_0x01b7;
                case 15: goto L_0x016b;
                case 16: goto L_0x0123;
                case 17: goto L_0x00fd;
                default: goto L_0x009c;
            }
        L_0x009c:
            r13 = r17
        L_0x009e:
            r14 = r15
        L_0x009f:
            r0 = r23
            if (r12 != r0) goto L_0x00da
            if (r45 == 0) goto L_0x00da
            r7 = r4
        L_0x00a6:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r13 == r0) goto L_0x00af
            long r0 = (long) r13
            r10.putInt(r9, r0, r11)
        L_0x00af:
            int r3 = r8.A02
        L_0x00b1:
            int r0 = r8.A03
            if (r3 >= r0) goto L_0x030d
            int[] r0 = r8.A0C
            r2 = r0[r3]
            int[] r1 = r8.A0B
            int r0 = r2 + 1
            r1 = r1[r0]
            java.lang.Object r0 = A0E(r9, r1)
            if (r0 == 0) goto L_0x00d7
            java.lang.Object[] r1 = r8.A0D
            int r0 = r2 / 3
            int r0 = r0 << 1
            int r0 = r0 + 1
            r0 = r1[r0]
            if (r0 == 0) goto L_0x00d7
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x00d7:
            int r3 = r3 + 1
            goto L_0x00b1
        L_0x00da:
            r2 = r9
            X.3bJ r2 = (X.C67293bJ) r2
            X.4dZ r1 = r2.zzb
            X.4dZ r0 = X.C90144dZ.A05
            if (r1 != r0) goto L_0x00e9
            X.4dZ r1 = X.C90144dZ.A00()
            r2.zzb = r1
        L_0x00e9:
            r0 = r6
            r2 = r5
            r3 = r12
            r5 = r29
            int r7 = A04(r0, r1, r2, r3, r4, r5)
            goto L_0x0306
        L_0x00f4:
            r2 = 2
            if (r7 != r2) goto L_0x009c
            int r7 = A09(r6, r5, r4)
            goto L_0x018b
        L_0x00fd:
            r2 = 3
            if (r7 != r2) goto L_0x009c
            int r2 = r22 << 3
            r28 = r2 | 4
            X.5TK r24 = r8.A0N(r15)
            r23 = r6
            r25 = r5
            r26 = r4
            r27 = r29
            int r7 = A03(r23, r24, r25, r26, r27, r28)
            r2 = r11 & r14
            if (r2 == 0) goto L_0x018b
            java.lang.Object r3 = r10.getObject(r9, r0)
            java.lang.Object r2 = r6.A02
            java.lang.Object r2 = X.AnonymousClass4ZC.A00(r3, r2)
            goto L_0x018d
        L_0x0123:
            if (r7 != 0) goto L_0x009c
            int r7 = A06(r6, r5, r4)
            long r2 = r6.A01
            long r2 = X.AnonymousClass3K2.A0H(r2)
            goto L_0x01df
        L_0x0131:
            if (r7 != 0) goto L_0x009c
            int r7 = A05(r6, r5, r4)
            int r3 = r6.A00
            java.lang.Object[] r4 = r8.A0D
            int r2 = r15 / 3
            int r2 = r2 << 1
            int r2 = r2 + 1
            r2 = r4[r2]
            X.5O6 r2 = (X.AnonymousClass5O6) r2
            if (r2 == 0) goto L_0x0179
            boolean r2 = r2.Aiq(r3)
            if (r2 != 0) goto L_0x0179
            r1 = r9
            X.3bJ r1 = (X.C67293bJ) r1
            X.4dZ r2 = r1.zzb
            X.4dZ r0 = X.C90144dZ.A05
            if (r2 != r0) goto L_0x015c
            X.4dZ r2 = X.C90144dZ.A00()
            r1.zzb = r2
        L_0x015c:
            long r0 = (long) r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A02(r12, r0)
            r14 = r15
            r1 = r22
            r13 = r17
            goto L_0x000b
        L_0x016b:
            if (r7 != 0) goto L_0x009c
            int r7 = A05(r6, r5, r4)
            int r2 = r6.A00
            int r4 = r2 >>> 1
            r2 = r2 & 1
            int r3 = -r2
            r3 = r3 ^ r4
        L_0x0179:
            r10.putInt(r9, r0, r3)
            goto L_0x0302
        L_0x017e:
            r2 = 2
            if (r7 != r2) goto L_0x009c
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r19
            if (r2 != 0) goto L_0x0192
            int r7 = A07(r6, r5, r4)
        L_0x018b:
            java.lang.Object r2 = r6.A02
        L_0x018d:
            r10.putObject(r9, r0, r2)
            goto L_0x0302
        L_0x0192:
            int r7 = A08(r6, r5, r4)
            goto L_0x018b
        L_0x0197:
            if (r7 != 0) goto L_0x009c
            int r7 = A06(r6, r5, r4)
            long r2 = r6.A01
            int r4 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1O(r4)
            X.4XS r2 = X.C90914f4.A01
            r2.A0B(r9, r0, r3)
            goto L_0x0302
        L_0x01ac:
            r2 = 5
            if (r7 != r2) goto L_0x009c
            int r2 = X.AnonymousClass3K2.A0D(r5, r4)
            r10.putInt(r9, r0, r2)
            goto L_0x01fc
        L_0x01b7:
            r2 = r16
            if (r7 != r2) goto L_0x009c
            long r27 = X.AnonymousClass3K2.A0K(r5, r4)
            r24 = r9
            r23 = r10
            r25 = r0
            r23.putLong(r24, r25, r27)
            goto L_0x0300
        L_0x01ca:
            if (r7 != 0) goto L_0x009c
            int r7 = A05(r6, r5, r4)
            int r2 = r6.A00
            r10.putInt(r9, r0, r2)
            goto L_0x0302
        L_0x01d7:
            if (r7 != 0) goto L_0x009c
            int r7 = A06(r6, r5, r4)
            long r2 = r6.A01
        L_0x01df:
            r24 = r9
            r23 = r10
            r25 = r0
            r27 = r2
            r23.putLong(r24, r25, r27)
            goto L_0x0302
        L_0x01ec:
            r2 = 5
            if (r7 != r2) goto L_0x009c
            int r2 = X.AnonymousClass3K2.A0D(r5, r4)
            float r3 = java.lang.Float.intBitsToFloat(r2)
            X.4XS r2 = X.C90914f4.A01
            r2.A08(r9, r0, r3)
        L_0x01fc:
            int r7 = r4 + 4
            goto L_0x0302
        L_0x0200:
            r17 = r13
            goto L_0x0099
        L_0x0204:
            r3 = 27
            if (r2 != r3) goto L_0x026e
            r2 = 2
            if (r7 != r2) goto L_0x009e
            java.lang.Object r2 = r10.getObject(r9, r0)
            X.5Us r2 = (X.C110025Us) r2
            r3 = r2
            X.5Bp r3 = (X.C105895Bp) r3
            boolean r3 = r3.A00
            if (r3 != 0) goto L_0x0223
            int r3 = X.AnonymousClass3K4.A0A(r2)
            X.5Us r2 = r2.Aim(r3)
            r10.putObject(r9, r0, r2)
        L_0x0223:
            X.5TK r3 = r8.A0N(r15)
            r0 = r29
            int r7 = A02(r6, r3, r5, r4, r0)
        L_0x022d:
            java.lang.Object r0 = r6.A02
            r2.add(r0)
            r0 = r29
            if (r7 >= r0) goto L_0x025e
            int r1 = A05(r6, r5, r7)
            int r0 = r6.A00
            if (r12 != r0) goto L_0x025e
            r0 = r29
            int r7 = A02(r6, r3, r5, r1, r0)
            goto L_0x022d
        L_0x0245:
            r2 = 2
            if (r7 != r2) goto L_0x009c
            X.5TK r3 = r8.A0N(r15)
            r2 = r29
            int r7 = A02(r6, r3, r5, r4, r2)
            r2 = r11 & r14
            if (r2 != 0) goto L_0x0263
            java.lang.Object r2 = r6.A02
        L_0x0258:
            r10.putObject(r9, r0, r2)
            r11 = r11 | r14
            r13 = r17
        L_0x025e:
            r1 = r22
            r14 = r15
            goto L_0x000b
        L_0x0263:
            java.lang.Object r3 = r10.getObject(r9, r0)
            java.lang.Object r2 = r6.A02
            java.lang.Object r2 = X.AnonymousClass4ZC.A00(r3, r2)
            goto L_0x0258
        L_0x026e:
            r14 = r15
            r2 = 49
            r3 = r2
            r2 = r18
            if (r2 > r3) goto L_0x029a
            r2 = r19
            long r2 = (long) r2
            r25 = r6
            r26 = r9
            r27 = r5
            r31 = r22
            r32 = r7
            r33 = r15
            r34 = r18
            r35 = r2
            r37 = r0
            r24 = r8
            r28 = r4
            r30 = r12
            int r7 = r24.A0M(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37)
        L_0x0295:
            if (r7 != r4) goto L_0x0306
            r4 = r7
            goto L_0x009f
        L_0x029a:
            r2 = 50
            r3 = r2
            r2 = r18
            if (r2 != r3) goto L_0x02ce
            r2 = 2
            if (r7 != r2) goto L_0x009f
            java.lang.Object r6 = r10.getObject(r9, r0)
            X.5O7 r5 = r8.A06
            r2 = r6
            X.5CR r2 = (X.AnonymousClass5CR) r2
            boolean r2 = r2.zza
            if (r2 != 0) goto L_0x02c4
            X.5CR r4 = X.AnonymousClass5CR.A00
            boolean r3 = r4.isEmpty()
            X.5CR r2 = new X.5CR
            if (r3 == 0) goto L_0x02ca
            r2.<init>()
        L_0x02be:
            r5.Aio(r2, r6)
            r10.putObject(r9, r0, r2)
        L_0x02c4:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x02ca:
            r2.<init>(r4)
            goto L_0x02be
        L_0x02ce:
            r25 = r6
            r26 = r9
            r27 = r5
            r31 = r22
            r32 = r7
            r33 = r19
            r34 = r2
            r35 = r15
            r36 = r0
            r24 = r8
            r28 = r4
            r30 = r12
            int r7 = r24.A0L(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x0295
        L_0x02eb:
            r2 = r16
            if (r7 != r2) goto L_0x009c
            long r2 = X.AnonymousClass3K2.A0K(r5, r4)
            double r27 = java.lang.Double.longBitsToDouble(r2)
            X.4XS r23 = X.C90914f4.A01
            r24 = r9
            r25 = r0
            r23.A07(r24, r25, r27)
        L_0x0300:
            int r7 = r4 + 8
        L_0x0302:
            r11 = r11 | r14
            r13 = r17
            r14 = r15
        L_0x0306:
            r1 = r22
            goto L_0x000b
        L_0x030a:
            r14 = 0
            goto L_0x009f
        L_0x030d:
            r0 = r29
            if (r45 != 0) goto L_0x0314
            if (r7 != r0) goto L_0x031b
            return r7
        L_0x0314:
            if (r7 > r0) goto L_0x031b
            r0 = r23
            if (r12 != r0) goto L_0x031b
            return r7
        L_0x031b:
            java.lang.String r1 = "Failed to parse the message."
            X.40H r0 = new X.40H
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98554sb.A0K(X.4a4, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0025, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e1, code lost:
        r5 = r6.getObject(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0190, code lost:
        r7 = r25 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a5, code lost:
        r7 = r25 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a7, code lost:
        r6.putInt(r8, r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01aa, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0L(X.C88174a4 r22, java.lang.Object r23, byte[] r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, long r33) {
        /*
            r21 = this;
            r8 = r23
            r7 = r25
            sun.misc.Unsafe r6 = A0E
            r9 = r21
            int[] r1 = r9.A0B
            r12 = r32
            int r0 = r32 + 2
            long r2 = X.AnonymousClass3K4.A0J(r1, r0)
            r5 = 5
            r4 = 2
            r11 = r22
            r10 = r24
            r17 = r26
            r15 = r27
            r14 = r28
            r13 = r29
            r0 = r33
            switch(r31) {
                case 51: goto L_0x0193;
                case 52: goto L_0x017f;
                case 53: goto L_0x016f;
                case 54: goto L_0x016f;
                case 55: goto L_0x015f;
                case 56: goto L_0x0150;
                case 57: goto L_0x0142;
                case 58: goto L_0x012a;
                case 59: goto L_0x00f5;
                case 60: goto L_0x00cf;
                case 61: goto L_0x00c2;
                case 62: goto L_0x015f;
                case 63: goto L_0x0086;
                case 64: goto L_0x0142;
                case 65: goto L_0x0150;
                case 66: goto L_0x006f;
                case 67: goto L_0x005a;
                case 68: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            return r7
        L_0x0026:
            r4 = 3
            if (r13 != r4) goto L_0x0025
            r4 = r27 & -8
            r20 = r4 | 4
            X.5TK r16 = r9.A0N(r12)
            r19 = r17
            r17 = r10
            r18 = r7
            r15 = r11
            int r7 = A03(r15, r16, r17, r18, r19, r20)
            int r4 = r6.getInt(r8, r2)
            if (r4 != r14) goto L_0x0053
            java.lang.Object r5 = r6.getObject(r8, r0)
            if (r5 == 0) goto L_0x0053
            java.lang.Object r4 = r11.A02
            java.lang.Object r4 = X.AnonymousClass4ZC.A00(r5, r4)
            r6.putObject(r8, r0, r4)
            goto L_0x01a7
        L_0x0053:
            java.lang.Object r4 = r11.A02
            r6.putObject(r8, r0, r4)
            goto L_0x01a7
        L_0x005a:
            if (r29 != 0) goto L_0x0025
            int r7 = A06(r11, r10, r7)
            long r4 = r11.A01
            long r4 = X.AnonymousClass3K2.A0H(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r6.putObject(r8, r0, r4)
            goto L_0x01a7
        L_0x006f:
            if (r29 != 0) goto L_0x0025
            int r7 = A05(r11, r10, r7)
            int r4 = r11.A00
            int r5 = r4 >>> 1
            r4 = r4 & 1
            int r4 = -r4
            r4 = r4 ^ r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.putObject(r8, r0, r4)
            goto L_0x01a7
        L_0x0086:
            if (r29 != 0) goto L_0x0025
            int r7 = A05(r11, r10, r7)
            int r5 = r11.A00
            java.lang.Object[] r9 = r9.A0D
            int r4 = r32 / 3
            int r4 = r4 << 1
            int r4 = r4 + 1
            r4 = r9[r4]
            X.5O6 r4 = (X.AnonymousClass5O6) r4
            if (r4 == 0) goto L_0x00b9
            boolean r4 = r4.Aiq(r5)
            if (r4 != 0) goto L_0x00b9
            X.3bJ r8 = (X.C67293bJ) r8
            X.4dZ r2 = r8.zzb
            X.4dZ r0 = X.C90144dZ.A05
            if (r2 != r0) goto L_0x00b0
            X.4dZ r2 = X.C90144dZ.A00()
            r8.zzb = r2
        L_0x00b0:
            long r0 = (long) r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A02(r15, r0)
            return r7
        L_0x00b9:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r6.putObject(r8, r0, r4)
            goto L_0x01a7
        L_0x00c2:
            if (r13 != r4) goto L_0x0025
            int r7 = A09(r11, r10, r7)
            java.lang.Object r4 = r11.A02
            r6.putObject(r8, r0, r4)
            goto L_0x01a7
        L_0x00cf:
            if (r13 != r4) goto L_0x0025
            X.5TK r5 = r9.A0N(r12)
            r4 = r17
            int r7 = A02(r11, r5, r10, r7, r4)
            int r4 = r6.getInt(r8, r2)
            if (r4 != r14) goto L_0x00f2
            java.lang.Object r5 = r6.getObject(r8, r0)
            if (r5 == 0) goto L_0x00f2
            java.lang.Object r4 = r11.A02
            java.lang.Object r4 = X.AnonymousClass4ZC.A00(r5, r4)
        L_0x00ed:
            r6.putObject(r8, r0, r4)
            goto L_0x01a7
        L_0x00f2:
            java.lang.Object r4 = r11.A02
            goto L_0x00ed
        L_0x00f5:
            if (r13 != r4) goto L_0x0025
            int r7 = A05(r11, r10, r7)
            int r9 = r11.A00
            if (r9 != 0) goto L_0x0106
            java.lang.String r4 = ""
            r6.putObject(r8, r0, r4)
            goto L_0x01a7
        L_0x0106:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r30 = r30 & r4
            if (r30 == 0) goto L_0x011e
            int r11 = r7 + r9
            X.4VM r5 = X.AnonymousClass4YS.A00
            int r4 = r5.A01(r10, r7, r11)
            if (r4 == 0) goto L_0x011e
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.40H r0 = new X.40H
            r0.<init>(r1)
            throw r0
        L_0x011e:
            java.nio.charset.Charset r5 = X.AnonymousClass4ZC.A02
            java.lang.String r4 = new java.lang.String
            r4.<init>(r10, r7, r9, r5)
            r6.putObject(r8, r0, r4)
            int r7 = r7 + r9
            goto L_0x01a7
        L_0x012a:
            if (r29 != 0) goto L_0x0025
            int r7 = A06(r11, r10, r7)
            long r4 = r11.A01
            r10 = 0
            int r9 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1O(r9)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6.putObject(r8, r0, r4)
            goto L_0x01a7
        L_0x0142:
            if (r13 != r5) goto L_0x0025
            int r4 = X.AnonymousClass3K2.A0D(r10, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.putObject(r8, r0, r4)
            goto L_0x0190
        L_0x0150:
            r4 = 1
            if (r13 != r4) goto L_0x0025
            long r4 = X.AnonymousClass3K2.A0K(r10, r7)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r6.putObject(r8, r0, r4)
            goto L_0x01a5
        L_0x015f:
            if (r29 != 0) goto L_0x0025
            int r7 = A05(r11, r10, r7)
            int r4 = r11.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.putObject(r8, r0, r4)
            goto L_0x01a7
        L_0x016f:
            if (r29 != 0) goto L_0x0025
            int r7 = A06(r11, r10, r7)
            long r4 = r11.A01
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r6.putObject(r8, r0, r4)
            goto L_0x01a7
        L_0x017f:
            if (r13 != r5) goto L_0x0025
            int r4 = X.AnonymousClass3K2.A0D(r10, r7)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r6.putObject(r8, r0, r4)
        L_0x0190:
            int r7 = r25 + 4
            goto L_0x01a7
        L_0x0193:
            r4 = 1
            if (r13 != r4) goto L_0x0025
            long r4 = X.AnonymousClass3K2.A0K(r10, r7)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r6.putObject(r8, r0, r4)
        L_0x01a5:
            int r7 = r25 + 8
        L_0x01a7:
            r6.putInt(r8, r2, r14)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98554sb.A0L(X.4a4, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0285, code lost:
        throw new X.AnonymousClass40H("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02e0, code lost:
        if (r4 != r3) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02e2, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03f5, code lost:
        if (r4 == r1) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03f7, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03ff, code lost:
        throw new X.AnonymousClass40H("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0400, code lost:
        return r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0M(X.C88174a4 r18, java.lang.Object r19, byte[] r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, long r28, long r30) {
        /*
            r17 = this;
            r5 = r19
            r14 = r21
            sun.misc.Unsafe r7 = A0E
            r0 = r30
            java.lang.Object r2 = r7.getObject(r5, r0)
            X.5Us r2 = (X.C110025Us) r2
            r3 = r2
            X.5Bp r3 = (X.C105895Bp) r3
            boolean r3 = r3.A00
            r4 = 1
            if (r3 != 0) goto L_0x0027
            int r6 = r2.size()
            int r3 = r6 << r4
            if (r6 != 0) goto L_0x0020
            r3 = 10
        L_0x0020:
            X.5Us r2 = r2.Aim(r3)
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
                case 18: goto L_0x00a8;
                case 19: goto L_0x00df;
                case 20: goto L_0x0116;
                case 21: goto L_0x0116;
                case 22: goto L_0x006b;
                case 23: goto L_0x003c;
                case 24: goto L_0x0149;
                case 25: goto L_0x0178;
                case 26: goto L_0x01b7;
                case 27: goto L_0x0222;
                case 28: goto L_0x0240;
                case 29: goto L_0x006b;
                case 30: goto L_0x032c;
                case 31: goto L_0x0149;
                case 32: goto L_0x003c;
                case 33: goto L_0x0286;
                case 34: goto L_0x02c5;
                case 35: goto L_0x00a8;
                case 36: goto L_0x00df;
                case 37: goto L_0x0116;
                case 38: goto L_0x0116;
                case 39: goto L_0x006b;
                case 40: goto L_0x003c;
                case 41: goto L_0x0149;
                case 42: goto L_0x0178;
                case 43: goto L_0x006b;
                case 44: goto L_0x032c;
                case 45: goto L_0x0149;
                case 46: goto L_0x003c;
                case 47: goto L_0x0286;
                case 48: goto L_0x02c5;
                case 49: goto L_0x0303;
                default: goto L_0x003c;
            }
        L_0x003c:
            if (r7 != r1) goto L_0x0053
            X.3ai r2 = (X.C66923ai) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x0047:
            if (r4 >= r3) goto L_0x02e0
            long r0 = X.AnonymousClass3K2.A0K(r13, r4)
            r2.A04(r0)
            int r4 = r4 + 8
            goto L_0x0047
        L_0x0053:
            if (r7 != r4) goto L_0x0400
            X.3ai r2 = (X.C66923ai) r2
        L_0x0057:
            long r0 = X.AnonymousClass3K2.A0K(r13, r14)
            r2.A04(r0)
            int r4 = r14 + 8
            if (r4 >= r15) goto L_0x03f7
            int r14 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x03f7
            goto L_0x0057
        L_0x006b:
            if (r7 != r1) goto L_0x008c
            X.3ah r2 = (X.C66913ah) r2
            int r4 = A05(r11, r13, r14)
            int r1 = r11.A00
            int r1 = r1 + r4
        L_0x0076:
            if (r4 >= r1) goto L_0x0082
            int r4 = A05(r11, r13, r4)
            int r0 = r11.A00
            r2.A03(r0)
            goto L_0x0076
        L_0x0082:
            if (r4 == r1) goto L_0x03f7
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.40H r0 = new X.40H
            r0.<init>(r1)
            throw r0
        L_0x008c:
            if (r25 != 0) goto L_0x0400
            X.3ah r2 = (X.C66913ah) r2
            int r4 = A05(r11, r13, r14)
        L_0x0094:
            int r0 = r11.A00
            r2.A03(r0)
            if (r4 >= r15) goto L_0x03f7
            int r1 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x03f7
            int r4 = A05(r11, r13, r1)
            goto L_0x0094
        L_0x00a8:
            if (r7 != r1) goto L_0x00c3
            X.3af r2 = (X.C66893af) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x00b3:
            if (r4 >= r3) goto L_0x02e0
            long r0 = X.AnonymousClass3K2.A0K(r13, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r2.A03(r0)
            int r4 = r4 + 8
            goto L_0x00b3
        L_0x00c3:
            if (r7 != r4) goto L_0x0400
            X.3af r2 = (X.C66893af) r2
        L_0x00c7:
            long r0 = X.AnonymousClass3K2.A0K(r13, r14)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r2.A03(r0)
            int r4 = r14 + 8
            if (r4 >= r15) goto L_0x03f7
            int r14 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x03f7
            goto L_0x00c7
        L_0x00df:
            if (r7 != r1) goto L_0x00fa
            X.3ag r2 = (X.C66903ag) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x00ea:
            if (r4 >= r3) goto L_0x02e0
            int r0 = X.AnonymousClass3K2.A0D(r13, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2.A03(r0)
            int r4 = r4 + 4
            goto L_0x00ea
        L_0x00fa:
            if (r7 != r6) goto L_0x0400
            X.3ag r2 = (X.C66903ag) r2
        L_0x00fe:
            int r0 = X.AnonymousClass3K2.A0D(r13, r14)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2.A03(r0)
            int r4 = r14 + 4
            if (r4 >= r15) goto L_0x03f7
            int r14 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x03f7
            goto L_0x00fe
        L_0x0116:
            if (r7 != r1) goto L_0x012d
            X.3ai r2 = (X.C66923ai) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x0121:
            if (r4 >= r3) goto L_0x02e0
            int r4 = A06(r11, r13, r4)
            long r0 = r11.A01
            r2.A04(r0)
            goto L_0x0121
        L_0x012d:
            if (r25 != 0) goto L_0x0400
            X.3ai r2 = (X.C66923ai) r2
            int r4 = A06(r11, r13, r14)
        L_0x0135:
            long r0 = r11.A01
            r2.A04(r0)
            if (r4 >= r15) goto L_0x03f7
            int r1 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x03f7
            int r4 = A06(r11, r13, r1)
            goto L_0x0135
        L_0x0149:
            if (r7 != r1) goto L_0x0160
            X.3ah r2 = (X.C66913ah) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x0154:
            if (r4 >= r3) goto L_0x02e0
            int r0 = X.AnonymousClass3K2.A0D(r13, r4)
            r2.A03(r0)
            int r4 = r4 + 4
            goto L_0x0154
        L_0x0160:
            if (r7 != r6) goto L_0x0400
            X.3ah r2 = (X.C66913ah) r2
        L_0x0164:
            int r0 = X.AnonymousClass3K2.A0D(r13, r14)
            r2.A03(r0)
            int r4 = r14 + 4
            if (r4 >= r15) goto L_0x03f7
            int r14 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x03f7
            goto L_0x0164
        L_0x0178:
            if (r7 != r1) goto L_0x0195
            X.3ae r2 = (X.C66883ae) r2
            int r4 = A05(r11, r13, r14)
            int r1 = r11.A00
            int r1 = r1 + r4
        L_0x0183:
            if (r4 >= r1) goto L_0x03f5
            int r4 = A06(r11, r13, r4)
            long r5 = r11.A01
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r2.A03(r0)
            goto L_0x0183
        L_0x0195:
            if (r25 != 0) goto L_0x0400
            X.3ae r2 = (X.C66883ae) r2
            int r14 = A06(r11, r13, r14)
        L_0x019d:
            long r0 = r11.A01
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r4)
            r2.A03(r0)
            if (r14 >= r15) goto L_0x0400
            int r1 = A05(r11, r13, r14)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0400
            int r14 = A06(r11, r13, r1)
            goto L_0x019d
        L_0x01b7:
            if (r7 != r1) goto L_0x0400
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r28 = r28 & r0
            java.lang.String r5 = ""
            int r0 = (r28 > r9 ? 1 : (r28 == r9 ? 0 : -1))
            int r14 = A05(r11, r13, r14)
            if (r0 != 0) goto L_0x01ec
        L_0x01c8:
            int r4 = r11.A00
            if (r4 < 0) goto L_0x027e
            if (r4 != 0) goto L_0x01e0
            r2.add(r5)
        L_0x01d1:
            if (r14 >= r15) goto L_0x0400
            int r1 = A05(r11, r13, r14)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0400
            int r14 = A05(r11, r13, r1)
            goto L_0x01c8
        L_0x01e0:
            java.nio.charset.Charset r1 = X.AnonymousClass4ZC.A02
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13, r14, r4, r1)
            r2.add(r0)
            int r14 = r14 + r4
            goto L_0x01d1
        L_0x01ec:
            int r6 = r11.A00
            if (r6 < 0) goto L_0x027e
            if (r6 != 0) goto L_0x0204
            r2.add(r5)
        L_0x01f5:
            if (r14 >= r15) goto L_0x0400
            int r1 = A05(r11, r13, r14)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0400
            int r14 = A05(r11, r13, r1)
            goto L_0x01ec
        L_0x0204:
            int r4 = r14 + r6
            X.4VM r1 = X.AnonymousClass4YS.A00
            int r0 = r1.A01(r13, r14, r4)
            if (r0 != 0) goto L_0x021a
            java.nio.charset.Charset r1 = X.AnonymousClass4ZC.A02
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13, r14, r6, r1)
            r2.add(r0)
            r14 = r4
            goto L_0x01f5
        L_0x021a:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.40H r1 = new X.40H
            r1.<init>(r0)
            throw r1
        L_0x0222:
            if (r7 != r1) goto L_0x0400
            X.5TK r5 = r0.A0N(r8)
            int r4 = A02(r11, r5, r13, r14, r15)
        L_0x022c:
            java.lang.Object r0 = r11.A02
            r2.add(r0)
            if (r4 >= r15) goto L_0x03f7
            int r1 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x03f7
            int r4 = A02(r11, r5, r13, r1, r15)
            goto L_0x022c
        L_0x0240:
            if (r7 != r1) goto L_0x0400
            int r4 = A05(r11, r13, r14)
            int r6 = r11.A00
            if (r6 < 0) goto L_0x027e
            int r5 = r13.length
        L_0x024b:
            int r0 = r5 - r4
            if (r6 > r0) goto L_0x03f8
            if (r6 != 0) goto L_0x0269
            X.557 r0 = X.AnonymousClass557.A00
            r2.add(r0)
        L_0x0256:
            if (r4 >= r15) goto L_0x03f7
            int r1 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x03f7
            int r4 = A05(r11, r13, r1)
            int r6 = r11.A00
            if (r6 < 0) goto L_0x027e
            goto L_0x024b
        L_0x0269:
            int r0 = r4 + r6
            X.AnonymousClass557.A01(r4, r0, r5)
            X.5O5 r0 = X.AnonymousClass557.A01
            byte[] r1 = r0.Ait(r13, r4, r6)
            X.3am r0 = new X.3am
            r0.<init>(r1)
            r2.add(r0)
            int r4 = r4 + r6
            goto L_0x0256
        L_0x027e:
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            X.40H r1 = new X.40H
            r1.<init>(r0)
            throw r1
        L_0x0286:
            if (r7 != r1) goto L_0x02a3
            X.3ah r2 = (X.C66913ah) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x0291:
            if (r4 >= r3) goto L_0x02e0
            int r4 = A05(r11, r13, r4)
            int r0 = r11.A00
            int r1 = r0 >>> 1
            r0 = r0 & 1
            int r0 = -r0
            r0 = r0 ^ r1
            r2.A03(r0)
            goto L_0x0291
        L_0x02a3:
            if (r25 != 0) goto L_0x0400
            X.3ah r2 = (X.C66913ah) r2
            int r4 = A05(r11, r13, r14)
        L_0x02ab:
            int r0 = r11.A00
            int r1 = r0 >>> 1
            r0 = r0 & 1
            int r0 = -r0
            r0 = r0 ^ r1
            r2.A03(r0)
            if (r4 >= r15) goto L_0x03f7
            int r1 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x03f7
            int r4 = A05(r11, r13, r1)
            goto L_0x02ab
        L_0x02c5:
            if (r7 != r1) goto L_0x02e3
            X.3ai r2 = (X.C66923ai) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x02d0:
            if (r4 >= r3) goto L_0x02e0
            int r4 = A06(r11, r13, r4)
            long r0 = r11.A01
            long r0 = X.AnonymousClass3K2.A0H(r0)
            r2.A04(r0)
            goto L_0x02d0
        L_0x02e0:
            if (r4 != r3) goto L_0x03f8
            return r4
        L_0x02e3:
            if (r25 != 0) goto L_0x0400
            X.3ai r2 = (X.C66923ai) r2
            int r4 = A06(r11, r13, r14)
        L_0x02eb:
            long r0 = r11.A01
            long r0 = X.AnonymousClass3K2.A0H(r0)
            r2.A04(r0)
            if (r4 >= r15) goto L_0x03f7
            int r1 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x03f7
            int r4 = A06(r11, r13, r1)
            goto L_0x02eb
        L_0x0303:
            r1 = 3
            if (r7 != r1) goto L_0x0400
            X.5TK r12 = r0.A0N(r8)
            r0 = r23 & -8
            r16 = r0 | 4
            int r14 = A03(r11, r12, r13, r14, r15, r16)
        L_0x0312:
            java.lang.Object r0 = r11.A02
            r2.add(r0)
            if (r14 >= r15) goto L_0x0400
            int r7 = A05(r11, r13, r14)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0400
            r4 = r11
            r5 = r12
            r6 = r13
            r8 = r15
            r9 = r16
            int r14 = A03(r4, r5, r6, r7, r8, r9)
            goto L_0x0312
        L_0x032c:
            if (r7 != r1) goto L_0x034e
            r6 = r2
            X.3ah r6 = (X.C66913ah) r6
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x0338:
            if (r4 >= r3) goto L_0x0344
            int r4 = A05(r11, r13, r4)
            int r1 = r11.A00
            r6.A03(r1)
            goto L_0x0338
        L_0x0344:
            if (r4 == r3) goto L_0x036b
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.40H r0 = new X.40H
            r0.<init>(r1)
            throw r0
        L_0x034e:
            if (r25 != 0) goto L_0x0400
            r7 = r2
            X.3ah r7 = (X.C66913ah) r7
            int r4 = A05(r11, r13, r14)
        L_0x0357:
            int r1 = r11.A00
            r7.A03(r1)
            if (r4 >= r15) goto L_0x036b
            int r6 = A05(r11, r13, r4)
            int r1 = r11.A00
            if (r3 != r1) goto L_0x036b
            int r4 = A05(r11, r13, r6)
            goto L_0x0357
        L_0x036b:
            X.3bJ r5 = (X.C67293bJ) r5
            X.4dZ r6 = r5.zzb
            X.4dZ r1 = X.C90144dZ.A05
            if (r6 != r1) goto L_0x0374
            r6 = 0
        L_0x0374:
            java.lang.Object[] r1 = r0.A0D
            int r0 = r26 / 3
            int r0 = r0 << 1
            int r0 = r0 + 1
            r7 = r1[r0]
            X.5O6 r7 = (X.AnonymousClass5O6) r7
            if (r7 == 0) goto L_0x03f0
            boolean r0 = r2 instanceof java.util.RandomAccess
            if (r0 == 0) goto L_0x03bb
            int r10 = r2.size()
            r9 = 0
            r8 = 0
        L_0x038c:
            if (r9 >= r10) goto L_0x03e7
            java.lang.Object r0 = r2.get(r9)
            int r1 = X.AnonymousClass000.A0D(r0)
            boolean r0 = r7.Aiq(r1)
            if (r0 == 0) goto L_0x03aa
            if (r9 == r8) goto L_0x03a5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.set(r8, r0)
        L_0x03a5:
            int r8 = r8 + 1
        L_0x03a7:
            int r9 = r9 + 1
            goto L_0x038c
        L_0x03aa:
            if (r6 != 0) goto L_0x03b0
            X.4dZ r6 = X.C90144dZ.A00()
        L_0x03b0:
            long r0 = (long) r1
            int r3 = r24 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A02(r3, r0)
            goto L_0x03a7
        L_0x03bb:
            java.util.Iterator r8 = r2.iterator()
        L_0x03bf:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x03f0
            java.lang.Object r0 = r8.next()
            int r1 = X.AnonymousClass000.A0D(r0)
            boolean r0 = r7.Aiq(r1)
            if (r0 != 0) goto L_0x03bf
            if (r6 != 0) goto L_0x03d9
            X.4dZ r6 = X.C90144dZ.A00()
        L_0x03d9:
            long r2 = (long) r1
            int r1 = r24 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A02(r1, r0)
            r8.remove()
            goto L_0x03bf
        L_0x03e7:
            if (r8 == r10) goto L_0x03f0
            java.util.List r0 = r2.subList(r8, r10)
            r0.clear()
        L_0x03f0:
            if (r6 == 0) goto L_0x03f7
            r5.zzb = r6
            return r4
        L_0x03f5:
            if (r4 != r1) goto L_0x03f8
        L_0x03f7:
            return r4
        L_0x03f8:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.40H r1 = new X.40H
            r1.<init>(r0)
            throw r1
        L_0x0400:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98554sb.A0M(X.4a4, java.lang.Object, byte[], int, int, int, int, int, int, int, long, long):int");
    }

    public final AnonymousClass5TK A0N(int i2) {
        int i3 = (i2 / 3) << 1;
        Object[] objArr = this.A0D;
        AnonymousClass5TK r0 = (AnonymousClass5TK) objArr[i3];
        if (r0 != null) {
            return r0;
        }
        AnonymousClass5TK A002 = C88654as.A02.A00((Class) objArr[i3 + 1]);
        objArr[i3] = A002;
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        throw X.AnonymousClass3K3.A0f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0O(int r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r9 = r10.A0B
            int r0 = r11 + 2
            r8 = r9[r0]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r8 & r5
            long r1 = (long) r0
            r7 = 0
            r6 = 1
            r3 = 1048575(0xfffff, double:5.18065E-318)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0090
            int r0 = r11 + 1
            r1 = r9[r0]
            r0 = r1 & r5
            long r2 = (long) r0
            int r0 = X.AnonymousClass3K4.A04(r1)
            r4 = 0
            switch(r0) {
                case 0: goto L_0x005c;
                case 1: goto L_0x0069;
                case 2: goto L_0x0085;
                case 3: goto L_0x0085;
                case 4: goto L_0x007c;
                case 5: goto L_0x0085;
                case 6: goto L_0x007c;
                case 7: goto L_0x0075;
                case 8: goto L_0x002a;
                case 9: goto L_0x0055;
                case 10: goto L_0x0048;
                case 11: goto L_0x007c;
                case 12: goto L_0x007c;
                case 13: goto L_0x007c;
                case 14: goto L_0x0085;
                case 15: goto L_0x007c;
                case 16: goto L_0x0085;
                case 17: goto L_0x0055;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass3K3.A0f()
            throw r0
        L_0x002a:
            java.lang.Object r1 = X.C90914f4.A03(r12, r2)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x003b
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x009e
            return r6
        L_0x003b:
            boolean r0 = r1 instanceof X.AnonymousClass557
            if (r0 == 0) goto L_0x0025
            X.557 r0 = X.AnonymousClass557.A00
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009e
            return r6
        L_0x0048:
            X.557 r1 = X.AnonymousClass557.A00
            java.lang.Object r0 = X.C90914f4.A03(r12, r2)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009e
            return r6
        L_0x0055:
            java.lang.Object r0 = X.C90914f4.A03(r12, r2)
            if (r0 == 0) goto L_0x009e
            return r6
        L_0x005c:
            X.4XS r0 = X.C90914f4.A01
            double r3 = r0.A02(r12, r2)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x009e
            return r6
        L_0x0069:
            X.4XS r0 = X.C90914f4.A01
            float r1 = r0.A03(r12, r2)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x009e
            return r6
        L_0x0075:
            X.4XS r0 = X.C90914f4.A01
            boolean r0 = r0.A0C(r12, r2)
            return r0
        L_0x007c:
            X.4XS r0 = X.C90914f4.A01
            int r0 = r0.A04(r12, r2)
            if (r0 == 0) goto L_0x009e
            return r6
        L_0x0085:
            X.4XS r0 = X.C90914f4.A01
            long r1 = r0.A05(r12, r2)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x009e
            return r6
        L_0x0090:
            int r0 = r8 >>> 20
            int r3 = r6 << r0
            X.4XS r0 = X.C90914f4.A01
            int r0 = r0.A04(r12, r1)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x009e
            return r6
        L_0x009e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98554sb.A0O(int, java.lang.Object):boolean");
    }

    public final boolean A0P(Object obj, int i2, int i3) {
        return AnonymousClass000.A1R(C90914f4.A01.A04(obj, AnonymousClass3K4.A0J(this.A0B, i3 + 2)), i2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        r0 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        r1 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009c, code lost:
        if (r0 == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        r1 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
        r6 = r6 * 53;
        r1 = ((java.lang.String) X.C90914f4.A03(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d5, code lost:
        r1 = X.AnonymousClass3K2.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e0, code lost:
        r6 = r6 * 53;
        r1 = X.C90914f4.A03(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ea, code lost:
        r6 = r6 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r3 = r3 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Ail(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r5 = r9.A0B
            int r4 = r5.length
            r3 = 0
            r6 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x00ed
            int r0 = r3 + 1
            r7 = r5[r0]
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r1 = (long) r0
            int r0 = X.AnonymousClass3K4.A04(r7)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0027;
                case 2: goto L_0x0048;
                case 3: goto L_0x0048;
                case 4: goto L_0x003e;
                case 5: goto L_0x0048;
                case 6: goto L_0x003e;
                case 7: goto L_0x0035;
                case 8: goto L_0x00a7;
                case 9: goto L_0x0052;
                case 10: goto L_0x00e0;
                case 11: goto L_0x003e;
                case 12: goto L_0x003e;
                case 13: goto L_0x003e;
                case 14: goto L_0x0048;
                case 15: goto L_0x003e;
                case 16: goto L_0x0048;
                case 17: goto L_0x0052;
                case 18: goto L_0x00e0;
                case 19: goto L_0x00e0;
                case 20: goto L_0x00e0;
                case 21: goto L_0x00e0;
                case 22: goto L_0x00e0;
                case 23: goto L_0x00e0;
                case 24: goto L_0x00e0;
                case 25: goto L_0x00e0;
                case 26: goto L_0x00e0;
                case 27: goto L_0x00e0;
                case 28: goto L_0x00e0;
                case 29: goto L_0x00e0;
                case 30: goto L_0x00e0;
                case 31: goto L_0x00e0;
                case 32: goto L_0x00e0;
                case 33: goto L_0x00e0;
                case 34: goto L_0x00e0;
                case 35: goto L_0x00e0;
                case 36: goto L_0x00e0;
                case 37: goto L_0x00e0;
                case 38: goto L_0x00e0;
                case 39: goto L_0x00e0;
                case 40: goto L_0x00e0;
                case 41: goto L_0x00e0;
                case 42: goto L_0x00e0;
                case 43: goto L_0x00e0;
                case 44: goto L_0x00e0;
                case 45: goto L_0x00e0;
                case 46: goto L_0x00e0;
                case 47: goto L_0x00e0;
                case 48: goto L_0x00e0;
                case 49: goto L_0x00e0;
                case 50: goto L_0x00e0;
                case 51: goto L_0x0060;
                case 52: goto L_0x0075;
                case 53: goto L_0x00c5;
                case 54: goto L_0x00c5;
                case 55: goto L_0x00b4;
                case 56: goto L_0x00c5;
                case 57: goto L_0x00b4;
                case 58: goto L_0x008a;
                case 59: goto L_0x00a1;
                case 60: goto L_0x00da;
                case 61: goto L_0x00da;
                case 62: goto L_0x00b4;
                case 63: goto L_0x00b4;
                case 64: goto L_0x00b4;
                case 65: goto L_0x00c5;
                case 66: goto L_0x00b4;
                case 67: goto L_0x00c5;
                case 68: goto L_0x00da;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x001e:
            int r6 = r6 * 53
            X.4XS r0 = X.C90914f4.A01
            double r0 = r0.A02(r10, r1)
            goto L_0x0070
        L_0x0027:
            int r6 = r6 * 53
            X.4XS r0 = X.C90914f4.A01
            float r0 = r0.A03(r10, r1)
            int r1 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00ea
        L_0x0035:
            int r6 = r6 * 53
            X.4XS r0 = X.C90914f4.A01
            boolean r0 = r0.A0C(r10, r1)
            goto L_0x009a
        L_0x003e:
            int r6 = r6 * 53
            X.4XS r0 = X.C90914f4.A01
            int r1 = r0.A04(r10, r1)
            goto L_0x00ea
        L_0x0048:
            int r6 = r6 * 53
            X.4XS r0 = X.C90914f4.A01
            long r0 = r0.A05(r10, r1)
            goto L_0x00d5
        L_0x0052:
            java.lang.Object r0 = X.C90914f4.A03(r10, r1)
            if (r0 == 0) goto L_0x005c
            int r7 = r0.hashCode()
        L_0x005c:
            int r6 = r6 * 53
            int r6 = r6 + r7
            goto L_0x001b
        L_0x0060:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C90914f4.A03(r10, r1)
            double r0 = X.AnonymousClass3K3.A01(r0)
        L_0x0070:
            long r0 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x00d5
        L_0x0075:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C90914f4.A03(r10, r1)
            float r0 = X.AnonymousClass000.A04(r0)
            int r1 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00ea
        L_0x008a:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C90914f4.A03(r10, r1)
            boolean r0 = X.AnonymousClass000.A1X(r0)
        L_0x009a:
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r0 == 0) goto L_0x00ea
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L_0x00ea
        L_0x00a1:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00a7:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C90914f4.A03(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.hashCode()
            goto L_0x00ea
        L_0x00b4:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C90914f4.A03(r10, r1)
            int r1 = X.AnonymousClass000.A0D(r0)
            goto L_0x00ea
        L_0x00c5:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C90914f4.A03(r10, r1)
            long r0 = X.C13700nu.A01(r0)
        L_0x00d5:
            int r1 = X.AnonymousClass3K2.A04(r0)
            goto L_0x00ea
        L_0x00da:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00e0:
            java.lang.Object r0 = X.C90914f4.A03(r10, r1)
            int r6 = r6 * 53
            int r1 = r0.hashCode()
        L_0x00ea:
            int r6 = r6 + r1
            goto L_0x001b
        L_0x00ed:
            int r1 = r6 * 53
            X.3bJ r10 = (X.C67293bJ) r10
            X.4dZ r0 = r10.zzb
            int r0 = X.AnonymousClass3K2.A06(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98554sb.Ail(java.lang.Object):int");
    }

    public final Object Ain() {
        return ((C67293bJ) this.A07).A08(4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        if (r4 == r0) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d9, code lost:
        if (r8 == r1) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Ais(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            int[] r7 = r11.A0B
            int r6 = r7.length
            r10 = 0
            r5 = 0
        L_0x0005:
            r2 = 1
            if (r5 >= r6) goto L_0x00b4
            int r0 = r5 + 1
            r4 = r7[r0]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r4 & r1
            long r2 = (long) r0
            int r0 = X.AnonymousClass3K4.A04(r4)
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x003a;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00c3;
                case 4: goto L_0x006c;
                case 5: goto L_0x00c3;
                case 6: goto L_0x006c;
                case 7: goto L_0x0057;
                case 8: goto L_0x0083;
                case 9: goto L_0x0083;
                case 10: goto L_0x0083;
                case 11: goto L_0x006c;
                case 12: goto L_0x006c;
                case 13: goto L_0x006c;
                case 14: goto L_0x00c3;
                case 15: goto L_0x006c;
                case 16: goto L_0x00c3;
                case 17: goto L_0x0083;
                case 18: goto L_0x00a0;
                case 19: goto L_0x00a0;
                case 20: goto L_0x00a0;
                case 21: goto L_0x00a0;
                case 22: goto L_0x00a0;
                case 23: goto L_0x00a0;
                case 24: goto L_0x00a0;
                case 25: goto L_0x00a0;
                case 26: goto L_0x00a0;
                case 27: goto L_0x00a0;
                case 28: goto L_0x00a0;
                case 29: goto L_0x00a0;
                case 30: goto L_0x00a0;
                case 31: goto L_0x00a0;
                case 32: goto L_0x00a0;
                case 33: goto L_0x00a0;
                case 34: goto L_0x00a0;
                case 35: goto L_0x00a0;
                case 36: goto L_0x00a0;
                case 37: goto L_0x00a0;
                case 38: goto L_0x00a0;
                case 39: goto L_0x00a0;
                case 40: goto L_0x00a0;
                case 41: goto L_0x00a0;
                case 42: goto L_0x00a0;
                case 43: goto L_0x00a0;
                case 44: goto L_0x00a0;
                case 45: goto L_0x00a0;
                case 46: goto L_0x00a0;
                case 47: goto L_0x00a0;
                case 48: goto L_0x00a0;
                case 49: goto L_0x00a0;
                case 50: goto L_0x00a0;
                case 51: goto L_0x008e;
                case 52: goto L_0x008e;
                case 53: goto L_0x008e;
                case 54: goto L_0x008e;
                case 55: goto L_0x008e;
                case 56: goto L_0x008e;
                case 57: goto L_0x008e;
                case 58: goto L_0x008e;
                case 59: goto L_0x008e;
                case 60: goto L_0x008e;
                case 61: goto L_0x008e;
                case 62: goto L_0x008e;
                case 63: goto L_0x008e;
                case 64: goto L_0x008e;
                case 65: goto L_0x008e;
                case 66: goto L_0x008e;
                case 67: goto L_0x008e;
                case 68: goto L_0x008e;
                default: goto L_0x0019;
            }
        L_0x0019:
            int r5 = r5 + 3
            goto L_0x0005
        L_0x001c:
            boolean r1 = r11.A0O(r5, r12)
            boolean r0 = r11.A0O(r5, r13)
            if (r1 != r0) goto L_0x00db
            X.4XS r4 = X.C90914f4.A01
            double r0 = r4.A02(r12, r2)
            long r8 = java.lang.Double.doubleToLongBits(r0)
            double r0 = r4.A02(r13, r2)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x00d7
        L_0x003a:
            boolean r1 = r11.A0O(r5, r12)
            boolean r0 = r11.A0O(r5, r13)
            if (r1 != r0) goto L_0x00db
            X.4XS r1 = X.C90914f4.A01
            float r0 = r1.A03(r12, r2)
            int r4 = java.lang.Float.floatToIntBits(r0)
            float r0 = r1.A03(r13, r2)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0080
        L_0x0057:
            boolean r1 = r11.A0O(r5, r12)
            boolean r0 = r11.A0O(r5, r13)
            if (r1 != r0) goto L_0x00db
            X.4XS r0 = X.C90914f4.A01
            boolean r4 = r0.A0C(r12, r2)
            boolean r0 = r0.A0C(r13, r2)
            goto L_0x0080
        L_0x006c:
            boolean r1 = r11.A0O(r5, r12)
            boolean r0 = r11.A0O(r5, r13)
            if (r1 != r0) goto L_0x00db
            X.4XS r0 = X.C90914f4.A01
            int r4 = r0.A04(r12, r2)
            int r0 = r0.A04(r13, r2)
        L_0x0080:
            if (r4 == r0) goto L_0x0019
            return r10
        L_0x0083:
            boolean r1 = r11.A0O(r5, r12)
            boolean r0 = r11.A0O(r5, r13)
            if (r1 != r0) goto L_0x00db
            goto L_0x00a0
        L_0x008e:
            int r0 = r5 + 2
            r0 = r7[r0]
            r0 = r0 & r1
            long r0 = (long) r0
            X.4XS r8 = X.C90914f4.A01
            int r4 = r8.A04(r12, r0)
            int r0 = r8.A04(r13, r0)
            if (r4 != r0) goto L_0x00db
        L_0x00a0:
            java.lang.Object r1 = X.C90914f4.A03(r12, r2)
            java.lang.Object r0 = X.C90914f4.A03(r13, r2)
            if (r1 == r0) goto L_0x0019
            if (r1 == 0) goto L_0x00db
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00db
            goto L_0x0019
        L_0x00b4:
            X.3bJ r12 = (X.C67293bJ) r12
            X.4dZ r1 = r12.zzb
            X.3bJ r13 = (X.C67293bJ) r13
            X.4dZ r0 = r13.zzb
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00db
            return r2
        L_0x00c3:
            boolean r1 = r11.A0O(r5, r12)
            boolean r0 = r11.A0O(r5, r13)
            if (r1 != r0) goto L_0x00db
            X.4XS r0 = X.C90914f4.A01
            long r8 = r0.A05(r12, r2)
            long r1 = r0.A05(r13, r2)
        L_0x00d7:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0019
        L_0x00db:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98554sb.Ais(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02e8, code lost:
        r10 = ((X.C98574sd) r8).A00;
        r10.A06(r2 << 3);
        r10.A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0305, code lost:
        r1 = ((X.C98574sd) r8).A00;
        r1.A06(r2 << 3);
        r1.A05(r10 ? (byte) 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0319, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x031b, code lost:
        r1 = A0E(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0321, code lost:
        if ((r1 instanceof java.lang.String) == false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0323, code lost:
        ((X.C98574sd) r8).A00.A09(r2, (java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0333, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0335, code lost:
        r11 = A0E(r7, r1);
        r10 = A0N(r3);
        r1 = ((X.C98574sd) r8).A00;
        r11 = (X.C109905Uc) r11;
        r1.A06(A0B(r1, r10, r11, r2));
        r10.Aix(r1.A01, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0356, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0358, code lost:
        r1 = A0E(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x035c, code lost:
        ((X.C98574sd) r8).A00.A0C((X.AnonymousClass557) r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0376, code lost:
        r1 = ((X.C98574sd) r8).A00;
        r1.A06(r2 << 3);
        r1.A06(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0393, code lost:
        ((X.C98574sd) r8).A00.A08(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03ab, code lost:
        X.AnonymousClass3K3.A1C(((X.C98574sd) r8).A00, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03c3, code lost:
        r10 = ((X.C98574sd) r8).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03c8, code lost:
        X.AnonymousClass3K4.A0q(r10, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03db, code lost:
        r10 = ((X.C98574sd) r8).A00;
        r10.A06(r2 << 3);
        r10.A06((r1 >> 31) ^ (r1 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03fd, code lost:
        A0I(r8, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0406, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0408, code lost:
        r0 = (X.C98574sd) r8;
        A0H(r0, A0N(r3), A0E(r7, r1), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x044f, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x059c, code lost:
        X.C90944f7.A0I(r8, r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05a2, code lost:
        X.C90944f7.A0N(r8, (java.util.List) r4.getObject(r7, r0), r9[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05b0, code lost:
        X.C90944f7.A0K(r8, (java.util.List) r4.getObject(r7, r0), r9[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05be, code lost:
        X.C90944f7.A0P(r8, (java.util.List) r4.getObject(r7, r0), r9[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05cc, code lost:
        X.C90944f7.A0Q(r8, (java.util.List) r4.getObject(r7, r0), r9[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05da, code lost:
        X.C90944f7.A0M(r8, (java.util.List) r4.getObject(r7, r0), r9[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0645, code lost:
        X.C90944f7.A0O(r8, (java.util.List) r4.getObject(r7, r0), r9[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0653, code lost:
        X.C90944f7.A0J(r8, (java.util.List) r4.getObject(r7, r0), r9[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0661, code lost:
        X.C90944f7.A0L(r8, (java.util.List) r4.getObject(r7, r0), r9[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x066f, code lost:
        X.C90944f7.A0H(r8, (java.util.List) r4.getObject(r7, r0), r9[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x06a8, code lost:
        if (r11 == false) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x06aa, code lost:
        r11 = r4.getObject(r7, r0);
        A0H((X.C98574sd) r8, A0N(r3), r11, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x06c2, code lost:
        A0I(r8, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x06cf, code lost:
        r11 = ((X.C98574sd) r8).A00;
        r11.A06(r2 << 3);
        r11.A06((r1 >> 31) ^ (r1 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x06eb, code lost:
        r11 = ((X.C98574sd) r8).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06fa, code lost:
        X.AnonymousClass3K3.A1C(((X.C98574sd) r8).A00, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x070c, code lost:
        ((X.C98574sd) r8).A00.A08(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x071e, code lost:
        r1 = ((X.C98574sd) r8).A00;
        r1.A06(r2 << 3);
        r1.A06(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x072f, code lost:
        if (r11 == false) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0731, code lost:
        r12 = r4.getObject(r7, r0);
        r11 = A0N(r3);
        r1 = ((X.C98574sd) r8).A00;
        r12 = (X.C109905Uc) r12;
        r1.A06(A0B(r1, r11, r12, r2));
        r11.Aix(r1.A01, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0750, code lost:
        if (r11 == false) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0752, code lost:
        r1 = r4.getObject(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0758, code lost:
        if ((r1 instanceof java.lang.String) == false) goto L_0x076e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x075a, code lost:
        ((X.C98574sd) r8).A00.A09(r2, (java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0768, code lost:
        if (r11 == false) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x076a, code lost:
        r1 = r4.getObject(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x076e, code lost:
        ((X.C98574sd) r8).A00.A0C((X.AnonymousClass557) r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0784, code lost:
        r1 = ((X.C98574sd) r8).A00;
        r1.A06(r2 << 3);
        r1.A05(r11 ? (byte) 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x079c, code lost:
        r11 = ((X.C98574sd) r8).A00;
        r11.A06(r2 << 3);
        r11.A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x07b5, code lost:
        X.AnonymousClass3K3.A1C(((X.C98574sd) r8).A00, r2, java.lang.Float.floatToRawIntBits(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x07cd, code lost:
        r11 = ((X.C98574sd) r8).A00;
        r0 = java.lang.Double.doubleToRawLongBits(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x07d6, code lost:
        X.AnonymousClass3K4.A0q(r11, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b3, code lost:
        r10 = ((X.C98574sd) r8).A00;
        r0 = java.lang.Double.doubleToRawLongBits(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02cc, code lost:
        X.AnonymousClass3K3.A1C(((X.C98574sd) r8).A00, r2, java.lang.Float.floatToRawIntBits(r10));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Aix(X.AnonymousClass5M8 r21, java.lang.Object r22) {
        /*
            r20 = this;
            r7 = r22
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r6 = 1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r20
            boolean r0 = r5.A0A
            r8 = r21
            if (r0 == 0) goto L_0x0418
            int[] r4 = r5.A0B
            int r9 = r4.length
            r3 = 0
        L_0x0014:
            if (r3 >= r9) goto L_0x07de
            int r0 = r3 + 1
            r1 = r4[r0]
            r2 = r4[r3]
            r0 = r1 & r18
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x0026;
                case 1: goto L_0x0037;
                case 2: goto L_0x0048;
                case 3: goto L_0x0048;
                case 4: goto L_0x008d;
                case 5: goto L_0x00af;
                case 6: goto L_0x009e;
                case 7: goto L_0x0059;
                case 8: goto L_0x0070;
                case 9: goto L_0x0076;
                case 10: goto L_0x006a;
                case 11: goto L_0x007c;
                case 12: goto L_0x008d;
                case 13: goto L_0x009e;
                case 14: goto L_0x00af;
                case 15: goto L_0x00c0;
                case 16: goto L_0x00d1;
                case 17: goto L_0x00e2;
                case 18: goto L_0x00e8;
                case 19: goto L_0x00f4;
                case 20: goto L_0x0100;
                case 21: goto L_0x010c;
                case 22: goto L_0x0118;
                case 23: goto L_0x0124;
                case 24: goto L_0x0130;
                case 25: goto L_0x013c;
                case 26: goto L_0x0148;
                case 27: goto L_0x0153;
                case 28: goto L_0x0186;
                case 29: goto L_0x0191;
                case 30: goto L_0x019d;
                case 31: goto L_0x01a9;
                case 32: goto L_0x01b5;
                case 33: goto L_0x01c1;
                case 34: goto L_0x01cd;
                case 35: goto L_0x01d9;
                case 36: goto L_0x01e4;
                case 37: goto L_0x01ef;
                case 38: goto L_0x01fa;
                case 39: goto L_0x0205;
                case 40: goto L_0x0210;
                case 41: goto L_0x021b;
                case 42: goto L_0x0226;
                case 43: goto L_0x0231;
                case 44: goto L_0x023c;
                case 45: goto L_0x0247;
                case 46: goto L_0x0252;
                case 47: goto L_0x025d;
                case 48: goto L_0x0268;
                case 49: goto L_0x0273;
                case 50: goto L_0x0299;
                case 51: goto L_0x02a5;
                case 52: goto L_0x02be;
                case 53: goto L_0x02da;
                case 54: goto L_0x02da;
                case 55: goto L_0x0385;
                case 56: goto L_0x03b5;
                case 57: goto L_0x039d;
                case 58: goto L_0x02f7;
                case 59: goto L_0x0315;
                case 60: goto L_0x032f;
                case 61: goto L_0x0352;
                case 62: goto L_0x0368;
                case 63: goto L_0x0385;
                case 64: goto L_0x039d;
                case 65: goto L_0x03b5;
                case 66: goto L_0x03cd;
                case 67: goto L_0x03ef;
                case 68: goto L_0x0402;
                default: goto L_0x0023;
            }
        L_0x0023:
            int r3 = r3 + 3
            goto L_0x0014
        L_0x0026:
            boolean r0 = r5.A0O(r3, r7)
            if (r0 == 0) goto L_0x0023
            r1 = r1 & r17
            long r0 = (long) r1
            X.4XS r10 = X.C90914f4.A01
            double r11 = r10.A02(r7, r0)
            goto L_0x02b3
        L_0x0037:
            boolean r0 = r5.A0O(r3, r7)
            if (r0 == 0) goto L_0x0023
            r1 = r1 & r17
            long r0 = (long) r1
            X.4XS r10 = X.C90914f4.A01
            float r10 = r10.A03(r7, r0)
            goto L_0x02cc
        L_0x0048:
            boolean r0 = r5.A0O(r3, r7)
            if (r0 == 0) goto L_0x0023
            r1 = r1 & r17
            long r0 = (long) r1
            X.4XS r10 = X.C90914f4.A01
            long r0 = r10.A05(r7, r0)
            goto L_0x02e8
        L_0x0059:
            boolean r0 = r5.A0O(r3, r7)
            if (r0 == 0) goto L_0x0023
            r1 = r1 & r17
            long r0 = (long) r1
            X.4XS r10 = X.C90914f4.A01
            boolean r10 = r10.A0C(r7, r0)
            goto L_0x0305
        L_0x006a:
            boolean r0 = r5.A0O(r3, r7)
            goto L_0x0356
        L_0x0070:
            boolean r0 = r5.A0O(r3, r7)
            goto L_0x0319
        L_0x0076:
            boolean r0 = r5.A0O(r3, r7)
            goto L_0x0333
        L_0x007c:
            boolean r0 = r5.A0O(r3, r7)
            if (r0 == 0) goto L_0x0023
            r1 = r1 & r17
            long r0 = (long) r1
            X.4XS r10 = X.C90914f4.A01
            int r10 = r10.A04(r7, r0)
            goto L_0x0376
        L_0x008d:
            boolean r0 = r5.A0O(r3, r7)
            if (r0 == 0) goto L_0x0023
            r1 = r1 & r17
            long r0 = (long) r1
            X.4XS r10 = X.C90914f4.A01
            int r1 = r10.A04(r7, r0)
            goto L_0x0393
        L_0x009e:
            boolean r0 = r5.A0O(r3, r7)
            if (r0 == 0) goto L_0x0023
            r1 = r1 & r17
            long r0 = (long) r1
            X.4XS r10 = X.C90914f4.A01
            int r1 = r10.A04(r7, r0)
            goto L_0x03ab
        L_0x00af:
            boolean r0 = r5.A0O(r3, r7)
            if (r0 == 0) goto L_0x0023
            r1 = r1 & r17
            long r0 = (long) r1
            X.4XS r10 = X.C90914f4.A01
            long r0 = r10.A05(r7, r0)
            goto L_0x03c3
        L_0x00c0:
            boolean r0 = r5.A0O(r3, r7)
            if (r0 == 0) goto L_0x0023
            r1 = r1 & r17
            long r0 = (long) r1
            X.4XS r10 = X.C90914f4.A01
            int r1 = r10.A04(r7, r0)
            goto L_0x03db
        L_0x00d1:
            boolean r0 = r5.A0O(r3, r7)
            if (r0 == 0) goto L_0x0023
            r1 = r1 & r17
            long r0 = (long) r1
            X.4XS r10 = X.C90914f4.A01
            long r0 = r10.A05(r7, r0)
            goto L_0x03fd
        L_0x00e2:
            boolean r0 = r5.A0O(r3, r7)
            goto L_0x0406
        L_0x00e8:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0E(r8, r1, r2, r0)
            goto L_0x0023
        L_0x00f4:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0F(r8, r1, r2, r0)
            goto L_0x0023
        L_0x0100:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0G(r8, r1, r2, r0)
            goto L_0x0023
        L_0x010c:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0H(r8, r1, r2, r0)
            goto L_0x0023
        L_0x0118:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0L(r8, r1, r2, r0)
            goto L_0x0023
        L_0x0124:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0J(r8, r1, r2, r0)
            goto L_0x0023
        L_0x0130:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0O(r8, r1, r2, r0)
            goto L_0x0023
        L_0x013c:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0R(r8, r1, r2, r0)
            goto L_0x0023
        L_0x0148:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0C(r8, r0, r2)
            goto L_0x0023
        L_0x0153:
            r14 = r4[r3]
            java.util.List r13 = A0G(r1, r7)
            X.5TK r12 = r5.A0N(r3)
            if (r13 == 0) goto L_0x0023
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0023
            r11 = r8
            X.4sd r11 = (X.C98574sd) r11
            r10 = 0
        L_0x0169:
            int r0 = r13.size()
            if (r10 >= r0) goto L_0x0023
            java.lang.Object r2 = r13.get(r10)
            X.1gX r1 = r11.A00
            X.5Uc r2 = (X.C109905Uc) r2
            int r0 = A0B(r1, r12, r2, r14)
            r1.A06(r0)
            X.4sd r0 = r1.A01
            r12.Aix(r0, r2)
            int r10 = r10 + 1
            goto L_0x0169
        L_0x0186:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0D(r8, r0, r2)
            goto L_0x0023
        L_0x0191:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0M(r8, r1, r2, r0)
            goto L_0x0023
        L_0x019d:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0Q(r8, r1, r2, r0)
            goto L_0x0023
        L_0x01a9:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0P(r8, r1, r2, r0)
            goto L_0x0023
        L_0x01b5:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0K(r8, r1, r2, r0)
            goto L_0x0023
        L_0x01c1:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0N(r8, r1, r2, r0)
            goto L_0x0023
        L_0x01cd:
            r2 = r4[r3]
            java.util.List r1 = A0G(r1, r7)
            r0 = 0
            X.C90944f7.A0I(r8, r1, r2, r0)
            goto L_0x0023
        L_0x01d9:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0E(r8, r0, r2, r6)
            goto L_0x0023
        L_0x01e4:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0F(r8, r0, r2, r6)
            goto L_0x0023
        L_0x01ef:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0G(r8, r0, r2, r6)
            goto L_0x0023
        L_0x01fa:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0H(r8, r0, r2, r6)
            goto L_0x0023
        L_0x0205:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0L(r8, r0, r2, r6)
            goto L_0x0023
        L_0x0210:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0J(r8, r0, r2, r6)
            goto L_0x0023
        L_0x021b:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0O(r8, r0, r2, r6)
            goto L_0x0023
        L_0x0226:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0R(r8, r0, r2, r6)
            goto L_0x0023
        L_0x0231:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0M(r8, r0, r2, r6)
            goto L_0x0023
        L_0x023c:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0Q(r8, r0, r2, r6)
            goto L_0x0023
        L_0x0247:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0P(r8, r0, r2, r6)
            goto L_0x0023
        L_0x0252:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0K(r8, r0, r2, r6)
            goto L_0x0023
        L_0x025d:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0N(r8, r0, r2, r6)
            goto L_0x0023
        L_0x0268:
            r2 = r4[r3]
            java.util.List r0 = A0G(r1, r7)
            X.C90944f7.A0I(r8, r0, r2, r6)
            goto L_0x0023
        L_0x0273:
            r11 = r4[r3]
            java.util.List r12 = A0G(r1, r7)
            X.5TK r10 = r5.A0N(r3)
            if (r12 == 0) goto L_0x0023
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0023
            r2 = r8
            X.4sd r2 = (X.C98574sd) r2
            r1 = 0
        L_0x0289:
            int r0 = r12.size()
            if (r1 >= r0) goto L_0x0023
            java.lang.Object r0 = r12.get(r1)
            A0H(r2, r10, r0, r11)
            int r1 = r1 + 1
            goto L_0x0289
        L_0x0299:
            java.lang.Object r0 = A0E(r7, r1)
            if (r0 == 0) goto L_0x0023
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x02a5:
            boolean r0 = r5.A0P(r7, r2, r3)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = A0E(r7, r1)
            double r11 = X.AnonymousClass3K3.A01(r0)
        L_0x02b3:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r10 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r11)
            goto L_0x03c8
        L_0x02be:
            boolean r0 = r5.A0P(r7, r2, r3)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = A0E(r7, r1)
            float r10 = X.AnonymousClass000.A04(r0)
        L_0x02cc:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r10)
            X.AnonymousClass3K3.A1C(r1, r2, r0)
            goto L_0x0023
        L_0x02da:
            boolean r0 = r5.A0P(r7, r2, r3)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = A0E(r7, r1)
            long r0 = X.C13700nu.A01(r0)
        L_0x02e8:
            r10 = r8
            X.4sd r10 = (X.C98574sd) r10
            X.1gX r10 = r10.A00
            int r2 = r2 << 3
            r10.A06(r2)
            r10.A0A(r0)
            goto L_0x0023
        L_0x02f7:
            boolean r0 = r5.A0P(r7, r2, r3)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = A0E(r7, r1)
            boolean r10 = X.AnonymousClass000.A1X(r0)
        L_0x0305:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r1 = r0.A00
            int r0 = r2 << 3
            r1.A06(r0)
            byte r0 = (byte) r10
            r1.A05(r0)
            goto L_0x0023
        L_0x0315:
            boolean r0 = r5.A0P(r7, r2, r3)
        L_0x0319:
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = A0E(r7, r1)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x035c
            java.lang.String r1 = (java.lang.String) r1
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r0 = r0.A00
            r0.A09(r2, r1)
            goto L_0x0023
        L_0x032f:
            boolean r0 = r5.A0P(r7, r2, r3)
        L_0x0333:
            if (r0 == 0) goto L_0x0023
            java.lang.Object r11 = A0E(r7, r1)
            X.5TK r10 = r5.A0N(r3)
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r1 = r0.A00
            X.5Uc r11 = (X.C109905Uc) r11
            int r0 = A0B(r1, r10, r11, r2)
            r1.A06(r0)
            X.4sd r0 = r1.A01
            r10.Aix(r0, r11)
            goto L_0x0023
        L_0x0352:
            boolean r0 = r5.A0P(r7, r2, r3)
        L_0x0356:
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = A0E(r7, r1)
        L_0x035c:
            X.557 r1 = (X.AnonymousClass557) r1
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r0 = r0.A00
            r0.A0C(r1, r2)
            goto L_0x0023
        L_0x0368:
            boolean r0 = r5.A0P(r7, r2, r3)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = A0E(r7, r1)
            int r10 = X.AnonymousClass000.A0D(r0)
        L_0x0376:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r1 = r0.A00
            int r0 = r2 << 3
            r1.A06(r0)
            r1.A06(r10)
            goto L_0x0023
        L_0x0385:
            boolean r0 = r5.A0P(r7, r2, r3)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = A0E(r7, r1)
            int r1 = X.AnonymousClass000.A0D(r0)
        L_0x0393:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r0 = r0.A00
            r0.A08(r2, r1)
            goto L_0x0023
        L_0x039d:
            boolean r0 = r5.A0P(r7, r2, r3)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = A0E(r7, r1)
            int r1 = X.AnonymousClass000.A0D(r0)
        L_0x03ab:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r0 = r0.A00
            X.AnonymousClass3K3.A1C(r0, r2, r1)
            goto L_0x0023
        L_0x03b5:
            boolean r0 = r5.A0P(r7, r2, r3)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = A0E(r7, r1)
            long r0 = X.C13700nu.A01(r0)
        L_0x03c3:
            r10 = r8
            X.4sd r10 = (X.C98574sd) r10
            X.1gX r10 = r10.A00
        L_0x03c8:
            X.AnonymousClass3K4.A0q(r10, r2, r0)
            goto L_0x0023
        L_0x03cd:
            boolean r0 = r5.A0P(r7, r2, r3)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = A0E(r7, r1)
            int r1 = X.AnonymousClass000.A0D(r0)
        L_0x03db:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r10 = r0.A00
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            int r0 = r2 << 3
            r10.A06(r0)
            r10.A06(r1)
            goto L_0x0023
        L_0x03ef:
            boolean r0 = r5.A0P(r7, r2, r3)
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = A0E(r7, r1)
            long r0 = X.C13700nu.A01(r0)
        L_0x03fd:
            A0I(r8, r0, r2)
            goto L_0x0023
        L_0x0402:
            boolean r0 = r5.A0P(r7, r2, r3)
        L_0x0406:
            if (r0 == 0) goto L_0x0023
            java.lang.Object r10 = A0E(r7, r1)
            X.5TK r1 = r5.A0N(r3)
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            A0H(r0, r1, r10, r2)
            goto L_0x0023
        L_0x0418:
            int[] r9 = r5.A0B
            int r0 = r9.length
            r19 = r0
            sun.misc.Unsafe r4 = A0E
            r3 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r16 = 0
        L_0x0425:
            r0 = r19
            if (r3 >= r0) goto L_0x07de
            int r0 = r3 + 1
            r13 = r9[r0]
            r2 = r9[r3]
            r0 = r13 & r18
            int r12 = r0 >>> 20
            r0 = 17
            if (r12 > r0) goto L_0x07db
            int r0 = r3 + 2
            r14 = r9[r0]
            r11 = r14 & r17
            if (r11 == r10) goto L_0x0445
            long r0 = (long) r11
            int r16 = r4.getInt(r7, r0)
            r10 = r11
        L_0x0445:
            int r0 = r14 >>> 20
            int r11 = r6 << r0
        L_0x0449:
            r13 = r13 & r17
            long r0 = (long) r13
            switch(r12) {
                case 0: goto L_0x07c3;
                case 1: goto L_0x07ab;
                case 2: goto L_0x0794;
                case 3: goto L_0x0794;
                case 4: goto L_0x0704;
                case 5: goto L_0x06e3;
                case 6: goto L_0x06f2;
                case 7: goto L_0x077a;
                case 8: goto L_0x074e;
                case 9: goto L_0x072d;
                case 10: goto L_0x0766;
                case 11: goto L_0x0716;
                case 12: goto L_0x0704;
                case 13: goto L_0x06f2;
                case 14: goto L_0x06e3;
                case 15: goto L_0x06c7;
                case 16: goto L_0x06ba;
                case 17: goto L_0x06a6;
                case 18: goto L_0x0698;
                case 19: goto L_0x068a;
                case 20: goto L_0x067c;
                case 21: goto L_0x066e;
                case 22: goto L_0x0660;
                case 23: goto L_0x0652;
                case 24: goto L_0x0644;
                case 25: goto L_0x0636;
                case 26: goto L_0x0629;
                case 27: goto L_0x05f4;
                case 28: goto L_0x05e7;
                case 29: goto L_0x05d9;
                case 30: goto L_0x05cb;
                case 31: goto L_0x05bd;
                case 32: goto L_0x05af;
                case 33: goto L_0x05a1;
                case 34: goto L_0x0593;
                case 35: goto L_0x0586;
                case 36: goto L_0x0579;
                case 37: goto L_0x056c;
                case 38: goto L_0x0569;
                case 39: goto L_0x0566;
                case 40: goto L_0x0563;
                case 41: goto L_0x0560;
                case 42: goto L_0x0553;
                case 43: goto L_0x0550;
                case 44: goto L_0x054e;
                case 45: goto L_0x054c;
                case 46: goto L_0x054a;
                case 47: goto L_0x0548;
                case 48: goto L_0x053e;
                case 49: goto L_0x0516;
                case 50: goto L_0x050a;
                case 51: goto L_0x04fa;
                case 52: goto L_0x04ea;
                case 53: goto L_0x04da;
                case 54: goto L_0x04da;
                case 55: goto L_0x0498;
                case 56: goto L_0x0478;
                case 57: goto L_0x0488;
                case 58: goto L_0x04ca;
                case 59: goto L_0x04c4;
                case 60: goto L_0x04be;
                case 61: goto L_0x04b8;
                case 62: goto L_0x04a8;
                case 63: goto L_0x0498;
                case 64: goto L_0x0488;
                case 65: goto L_0x0478;
                case 66: goto L_0x0468;
                case 67: goto L_0x0458;
                case 68: goto L_0x0452;
                default: goto L_0x044f;
            }
        L_0x044f:
            int r3 = r3 + 3
            goto L_0x0425
        L_0x0452:
            boolean r11 = r5.A0P(r7, r2, r3)
            goto L_0x06a8
        L_0x0458:
            boolean r11 = r5.A0P(r7, r2, r3)
            if (r11 == 0) goto L_0x044f
            java.lang.Object r0 = X.C90914f4.A03(r7, r0)
            long r0 = X.C13700nu.A01(r0)
            goto L_0x06c2
        L_0x0468:
            boolean r11 = r5.A0P(r7, r2, r3)
            if (r11 == 0) goto L_0x044f
            java.lang.Object r0 = X.C90914f4.A03(r7, r0)
            int r1 = X.AnonymousClass000.A0D(r0)
            goto L_0x06cf
        L_0x0478:
            boolean r11 = r5.A0P(r7, r2, r3)
            if (r11 == 0) goto L_0x044f
            java.lang.Object r0 = X.C90914f4.A03(r7, r0)
            long r0 = X.C13700nu.A01(r0)
            goto L_0x06eb
        L_0x0488:
            boolean r11 = r5.A0P(r7, r2, r3)
            if (r11 == 0) goto L_0x044f
            java.lang.Object r0 = X.C90914f4.A03(r7, r0)
            int r1 = X.AnonymousClass000.A0D(r0)
            goto L_0x06fa
        L_0x0498:
            boolean r11 = r5.A0P(r7, r2, r3)
            if (r11 == 0) goto L_0x044f
            java.lang.Object r0 = X.C90914f4.A03(r7, r0)
            int r1 = X.AnonymousClass000.A0D(r0)
            goto L_0x070c
        L_0x04a8:
            boolean r11 = r5.A0P(r7, r2, r3)
            if (r11 == 0) goto L_0x044f
            java.lang.Object r0 = X.C90914f4.A03(r7, r0)
            int r11 = X.AnonymousClass000.A0D(r0)
            goto L_0x071e
        L_0x04b8:
            boolean r11 = r5.A0P(r7, r2, r3)
            goto L_0x0768
        L_0x04be:
            boolean r11 = r5.A0P(r7, r2, r3)
            goto L_0x072f
        L_0x04c4:
            boolean r11 = r5.A0P(r7, r2, r3)
            goto L_0x0750
        L_0x04ca:
            boolean r11 = r5.A0P(r7, r2, r3)
            if (r11 == 0) goto L_0x044f
            java.lang.Object r0 = X.C90914f4.A03(r7, r0)
            boolean r11 = X.AnonymousClass000.A1X(r0)
            goto L_0x0784
        L_0x04da:
            boolean r11 = r5.A0P(r7, r2, r3)
            if (r11 == 0) goto L_0x044f
            java.lang.Object r0 = X.C90914f4.A03(r7, r0)
            long r0 = X.C13700nu.A01(r0)
            goto L_0x079c
        L_0x04ea:
            boolean r11 = r5.A0P(r7, r2, r3)
            if (r11 == 0) goto L_0x044f
            java.lang.Object r0 = X.C90914f4.A03(r7, r0)
            float r11 = X.AnonymousClass000.A04(r0)
            goto L_0x07b5
        L_0x04fa:
            boolean r11 = r5.A0P(r7, r2, r3)
            if (r11 == 0) goto L_0x044f
            java.lang.Object r0 = X.C90914f4.A03(r7, r0)
            double r12 = X.AnonymousClass3K3.A01(r0)
            goto L_0x07cd
        L_0x050a:
            java.lang.Object r0 = r4.getObject(r7, r0)
            if (r0 == 0) goto L_0x044f
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0516:
            r11 = r9[r3]
            java.lang.Object r13 = r4.getObject(r7, r0)
            java.util.List r13 = (java.util.List) r13
            X.5TK r12 = r5.A0N(r3)
            if (r13 == 0) goto L_0x044f
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x044f
            r2 = r8
            X.4sd r2 = (X.C98574sd) r2
            r1 = 0
        L_0x052e:
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x044f
            java.lang.Object r0 = r13.get(r1)
            A0H(r2, r12, r0, r11)
            int r1 = r1 + 1
            goto L_0x052e
        L_0x053e:
            r2 = r9[r3]
            java.lang.Object r1 = r4.getObject(r7, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            goto L_0x059c
        L_0x0548:
            r11 = 1
            goto L_0x05a2
        L_0x054a:
            r11 = 1
            goto L_0x05b0
        L_0x054c:
            r11 = 1
            goto L_0x05be
        L_0x054e:
            r11 = 1
            goto L_0x05cc
        L_0x0550:
            r11 = 1
            goto L_0x05da
        L_0x0553:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0R(r8, r0, r2, r6)
            goto L_0x044f
        L_0x0560:
            r11 = 1
            goto L_0x0645
        L_0x0563:
            r11 = 1
            goto L_0x0653
        L_0x0566:
            r11 = 1
            goto L_0x0661
        L_0x0569:
            r11 = 1
            goto L_0x066f
        L_0x056c:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0G(r8, r0, r2, r6)
            goto L_0x044f
        L_0x0579:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0F(r8, r0, r2, r6)
            goto L_0x044f
        L_0x0586:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0E(r8, r0, r2, r6)
            goto L_0x044f
        L_0x0593:
            r2 = r9[r3]
            java.lang.Object r1 = r4.getObject(r7, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
        L_0x059c:
            X.C90944f7.A0I(r8, r1, r2, r0)
            goto L_0x044f
        L_0x05a1:
            r11 = 0
        L_0x05a2:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0N(r8, r0, r2, r11)
            goto L_0x044f
        L_0x05af:
            r11 = 0
        L_0x05b0:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0K(r8, r0, r2, r11)
            goto L_0x044f
        L_0x05bd:
            r11 = 0
        L_0x05be:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0P(r8, r0, r2, r11)
            goto L_0x044f
        L_0x05cb:
            r11 = 0
        L_0x05cc:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0Q(r8, r0, r2, r11)
            goto L_0x044f
        L_0x05d9:
            r11 = 0
        L_0x05da:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0M(r8, r0, r2, r11)
            goto L_0x044f
        L_0x05e7:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0D(r8, r0, r2)
            goto L_0x044f
        L_0x05f4:
            r12 = r9[r3]
            java.lang.Object r14 = r4.getObject(r7, r0)
            java.util.List r14 = (java.util.List) r14
            X.5TK r13 = r5.A0N(r3)
            if (r14 == 0) goto L_0x044f
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x044f
            r11 = r8
            X.4sd r11 = (X.C98574sd) r11
            r2 = 0
        L_0x060c:
            int r0 = r14.size()
            if (r2 >= r0) goto L_0x044f
            java.lang.Object r1 = r14.get(r2)
            X.1gX r15 = r11.A00
            X.5Uc r1 = (X.C109905Uc) r1
            int r0 = A0B(r15, r13, r1, r12)
            r15.A06(r0)
            X.4sd r0 = r15.A01
            r13.Aix(r0, r1)
            int r2 = r2 + 1
            goto L_0x060c
        L_0x0629:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0C(r8, r0, r2)
            goto L_0x044f
        L_0x0636:
            r2 = r9[r3]
            java.lang.Object r1 = r4.getObject(r7, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C90944f7.A0R(r8, r1, r2, r0)
            goto L_0x044f
        L_0x0644:
            r11 = 0
        L_0x0645:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0O(r8, r0, r2, r11)
            goto L_0x044f
        L_0x0652:
            r11 = 0
        L_0x0653:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0J(r8, r0, r2, r11)
            goto L_0x044f
        L_0x0660:
            r11 = 0
        L_0x0661:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0L(r8, r0, r2, r11)
            goto L_0x044f
        L_0x066e:
            r11 = 0
        L_0x066f:
            r2 = r9[r3]
            java.lang.Object r0 = r4.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            X.C90944f7.A0H(r8, r0, r2, r11)
            goto L_0x044f
        L_0x067c:
            r2 = r9[r3]
            java.lang.Object r1 = r4.getObject(r7, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C90944f7.A0G(r8, r1, r2, r0)
            goto L_0x044f
        L_0x068a:
            r2 = r9[r3]
            java.lang.Object r1 = r4.getObject(r7, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C90944f7.A0F(r8, r1, r2, r0)
            goto L_0x044f
        L_0x0698:
            r2 = r9[r3]
            java.lang.Object r1 = r4.getObject(r7, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C90944f7.A0E(r8, r1, r2, r0)
            goto L_0x044f
        L_0x06a6:
            r11 = r11 & r16
        L_0x06a8:
            if (r11 == 0) goto L_0x044f
            java.lang.Object r11 = r4.getObject(r7, r0)
            X.5TK r1 = r5.A0N(r3)
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            A0H(r0, r1, r11, r2)
            goto L_0x044f
        L_0x06ba:
            r11 = r11 & r16
            if (r11 == 0) goto L_0x044f
            long r0 = r4.getLong(r7, r0)
        L_0x06c2:
            A0I(r8, r0, r2)
            goto L_0x044f
        L_0x06c7:
            r11 = r11 & r16
            if (r11 == 0) goto L_0x044f
            int r1 = r4.getInt(r7, r0)
        L_0x06cf:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r11 = r0.A00
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            int r0 = r2 << 3
            r11.A06(r0)
            r11.A06(r1)
            goto L_0x044f
        L_0x06e3:
            r11 = r11 & r16
            if (r11 == 0) goto L_0x044f
            long r0 = r4.getLong(r7, r0)
        L_0x06eb:
            r11 = r8
            X.4sd r11 = (X.C98574sd) r11
            X.1gX r11 = r11.A00
            goto L_0x07d6
        L_0x06f2:
            r11 = r11 & r16
            if (r11 == 0) goto L_0x044f
            int r1 = r4.getInt(r7, r0)
        L_0x06fa:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r0 = r0.A00
            X.AnonymousClass3K3.A1C(r0, r2, r1)
            goto L_0x044f
        L_0x0704:
            r11 = r11 & r16
            if (r11 == 0) goto L_0x044f
            int r1 = r4.getInt(r7, r0)
        L_0x070c:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r0 = r0.A00
            r0.A08(r2, r1)
            goto L_0x044f
        L_0x0716:
            r11 = r11 & r16
            if (r11 == 0) goto L_0x044f
            int r11 = r4.getInt(r7, r0)
        L_0x071e:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r1 = r0.A00
            int r0 = r2 << 3
            r1.A06(r0)
            r1.A06(r11)
            goto L_0x044f
        L_0x072d:
            r11 = r11 & r16
        L_0x072f:
            if (r11 == 0) goto L_0x044f
            java.lang.Object r12 = r4.getObject(r7, r0)
            X.5TK r11 = r5.A0N(r3)
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r1 = r0.A00
            X.5Uc r12 = (X.C109905Uc) r12
            int r0 = A0B(r1, r11, r12, r2)
            r1.A06(r0)
            X.4sd r0 = r1.A01
            r11.Aix(r0, r12)
            goto L_0x044f
        L_0x074e:
            r11 = r11 & r16
        L_0x0750:
            if (r11 == 0) goto L_0x044f
            java.lang.Object r1 = r4.getObject(r7, r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x076e
            java.lang.String r1 = (java.lang.String) r1
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r0 = r0.A00
            r0.A09(r2, r1)
            goto L_0x044f
        L_0x0766:
            r11 = r11 & r16
        L_0x0768:
            if (r11 == 0) goto L_0x044f
            java.lang.Object r1 = r4.getObject(r7, r0)
        L_0x076e:
            X.557 r1 = (X.AnonymousClass557) r1
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r0 = r0.A00
            r0.A0C(r1, r2)
            goto L_0x044f
        L_0x077a:
            r11 = r11 & r16
            if (r11 == 0) goto L_0x044f
            X.4XS r11 = X.C90914f4.A01
            boolean r11 = r11.A0C(r7, r0)
        L_0x0784:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r1 = r0.A00
            int r0 = r2 << 3
            r1.A06(r0)
            byte r0 = (byte) r11
            r1.A05(r0)
            goto L_0x044f
        L_0x0794:
            r11 = r11 & r16
            if (r11 == 0) goto L_0x044f
            long r0 = r4.getLong(r7, r0)
        L_0x079c:
            r11 = r8
            X.4sd r11 = (X.C98574sd) r11
            X.1gX r11 = r11.A00
            int r2 = r2 << 3
            r11.A06(r2)
            r11.A0A(r0)
            goto L_0x044f
        L_0x07ab:
            r11 = r11 & r16
            if (r11 == 0) goto L_0x044f
            X.4XS r11 = X.C90914f4.A01
            float r11 = r11.A03(r7, r0)
        L_0x07b5:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r11)
            X.AnonymousClass3K3.A1C(r1, r2, r0)
            goto L_0x044f
        L_0x07c3:
            r11 = r11 & r16
            if (r11 == 0) goto L_0x044f
            X.4XS r11 = X.C90914f4.A01
            double r12 = r11.A02(r7, r0)
        L_0x07cd:
            r0 = r8
            X.4sd r0 = (X.C98574sd) r0
            X.1gX r11 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r12)
        L_0x07d6:
            X.AnonymousClass3K4.A0q(r11, r2, r0)
            goto L_0x044f
        L_0x07db:
            r11 = 0
            goto L_0x0449
        L_0x07de:
            X.3bJ r7 = (X.C67293bJ) r7
            X.4dZ r0 = r7.zzb
            r0.A03(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98554sb.Aix(X.5M8, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e5, code lost:
        r8.putInt(r6, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0119, code lost:
        r4 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011b, code lost:
        r8.putObject(r6, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015d, code lost:
        r8.putLong(r6, r2, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0178, code lost:
        r1 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018f, code lost:
        r1 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0191, code lost:
        r19 = r19 | r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Aiy(X.C88174a4 r37, java.lang.Object r38, byte[] r39, int r40, int r41) {
        /*
            r36 = this;
            r1 = r40
            r13 = r36
            boolean r0 = r13.A0A
            r7 = r37
            r6 = r38
            r5 = r39
            r35 = r41
            if (r0 == 0) goto L_0x0261
            sun.misc.Unsafe r8 = A0E
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r11 = -1
            r10 = 0
            r19 = 0
            r0 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001c:
            r2 = r35
            if (r1 >= r2) goto L_0x024d
            int r4 = r1 + 1
            byte r12 = r39[r1]
            if (r12 >= 0) goto L_0x002c
            int r4 = A0A(r7, r5, r12, r4)
            int r12 = r7.A00
        L_0x002c:
            int r18 = r12 >>> 3
            r9 = r12 & 7
            r1 = r18
            if (r1 <= r11) goto L_0x005b
            int r15 = r10 / 3
            int r2 = r13.A00
            if (r1 < r2) goto L_0x024a
            int r2 = r13.A01
            if (r1 > r2) goto L_0x024a
            int[] r14 = r13.A0B
            int r1 = r14.length
            int r1 = r1 / 3
            int r11 = r1 + -1
        L_0x0045:
            if (r15 > r11) goto L_0x024a
            int r1 = r11 + r15
            int r16 = r1 >>> 1
            int r10 = r16 * 3
            r2 = r14[r10]
            r1 = r18
            if (r1 == r2) goto L_0x005f
            if (r1 >= r2) goto L_0x0058
            int r11 = r16 + -1
            goto L_0x0045
        L_0x0058:
            int r15 = r16 + 1
            goto L_0x0045
        L_0x005b:
            int r10 = r13.A0J(r1)
        L_0x005f:
            r1 = -1
            if (r10 == r1) goto L_0x024a
            int[] r11 = r13.A0B
            int r1 = r10 + 1
            r17 = r11[r1]
            int r14 = X.AnonymousClass3K4.A04(r17)
            r1 = r17 & r3
            long r2 = (long) r1
            r1 = 17
            if (r14 > r1) goto L_0x0195
            int r1 = r10 + 2
            r11 = r11[r1]
            int r1 = r11 >>> 20
            r16 = 1
            int r16 = r16 << r1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r11 & r1
            if (r11 == r0) goto L_0x0096
            if (r0 == r1) goto L_0x008b
            long r0 = (long) r0
            r15 = r19
            r8.putInt(r6, r0, r15)
        L_0x008b:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r11 == r0) goto L_0x0095
            long r0 = (long) r11
            int r19 = r8.getInt(r6, r0)
        L_0x0095:
            r0 = r11
        L_0x0096:
            r1 = 5
            switch(r14) {
                case 0: goto L_0x017b;
                case 1: goto L_0x0169;
                case 2: goto L_0x0155;
                case 3: goto L_0x0155;
                case 4: goto L_0x00dd;
                case 5: goto L_0x0144;
                case 6: goto L_0x013a;
                case 7: goto L_0x0124;
                case 8: goto L_0x010c;
                case 9: goto L_0x00f2;
                case 10: goto L_0x00ea;
                case 11: goto L_0x00dd;
                case 12: goto L_0x00dd;
                case 13: goto L_0x013a;
                case 14: goto L_0x0144;
                case 15: goto L_0x00ce;
                case 16: goto L_0x00c0;
                default: goto L_0x009a;
            }
        L_0x009a:
            r3 = r6
            X.3bJ r3 = (X.C67293bJ) r3
            X.4dZ r2 = r3.zzb
            X.4dZ r1 = X.C90144dZ.A05
            if (r2 != r1) goto L_0x00a9
            X.4dZ r2 = X.C90144dZ.A00()
            r3.zzb = r2
        L_0x00a9:
            r20 = r7
            r21 = r2
            r22 = r5
            r23 = r12
            r24 = r4
            r25 = r35
            int r1 = A04(r20, r21, r22, r23, r24, r25)
        L_0x00b9:
            r11 = r18
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x001c
        L_0x00c0:
            if (r9 != 0) goto L_0x009a
            int r1 = A06(r7, r5, r4)
            long r11 = r7.A01
            long r11 = X.AnonymousClass3K2.A0H(r11)
            goto L_0x015d
        L_0x00ce:
            if (r9 != 0) goto L_0x009a
            int r1 = A05(r7, r5, r4)
            int r4 = r7.A00
            int r9 = r4 >>> 1
            r4 = r4 & 1
            int r4 = -r4
            r4 = r4 ^ r9
            goto L_0x00e5
        L_0x00dd:
            if (r9 != 0) goto L_0x009a
            int r1 = A05(r7, r5, r4)
            int r4 = r7.A00
        L_0x00e5:
            r8.putInt(r6, r2, r4)
            goto L_0x0191
        L_0x00ea:
            r1 = 2
            if (r9 != r1) goto L_0x009a
            int r1 = A09(r7, r5, r4)
            goto L_0x0119
        L_0x00f2:
            r1 = 2
            if (r9 != r1) goto L_0x009a
            X.5TK r9 = r13.A0N(r10)
            r1 = r35
            int r1 = A02(r7, r9, r5, r4, r1)
            java.lang.Object r9 = r8.getObject(r6, r2)
            if (r9 == 0) goto L_0x0119
            java.lang.Object r4 = r7.A02
            java.lang.Object r4 = X.AnonymousClass4ZC.A00(r9, r4)
            goto L_0x011b
        L_0x010c:
            r1 = 2
            if (r9 != r1) goto L_0x009a
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r17 = r17 & r1
            if (r17 != 0) goto L_0x011f
            int r1 = A07(r7, r5, r4)
        L_0x0119:
            java.lang.Object r4 = r7.A02
        L_0x011b:
            r8.putObject(r6, r2, r4)
            goto L_0x0191
        L_0x011f:
            int r1 = A08(r7, r5, r4)
            goto L_0x0119
        L_0x0124:
            if (r9 != 0) goto L_0x009a
            int r1 = A06(r7, r5, r4)
            long r11 = r7.A01
            r14 = 0
            int r4 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            boolean r9 = X.AnonymousClass000.A1O(r4)
            X.4XS r4 = X.C90914f4.A01
            r4.A0B(r6, r2, r9)
            goto L_0x0191
        L_0x013a:
            if (r9 != r1) goto L_0x009a
            int r1 = X.AnonymousClass3K2.A0D(r5, r4)
            r8.putInt(r6, r2, r1)
            goto L_0x0178
        L_0x0144:
            r1 = 1
            if (r9 != r1) goto L_0x009a
            long r24 = X.AnonymousClass3K2.A0K(r5, r4)
            r20 = r8
            r21 = r6
            r22 = r2
            r20.putLong(r21, r22, r24)
            goto L_0x018f
        L_0x0155:
            if (r9 != 0) goto L_0x009a
            int r1 = A06(r7, r5, r4)
            long r11 = r7.A01
        L_0x015d:
            r20 = r8
            r21 = r6
            r22 = r2
            r24 = r11
            r20.putLong(r21, r22, r24)
            goto L_0x0191
        L_0x0169:
            if (r9 != r1) goto L_0x009a
            int r1 = X.AnonymousClass3K2.A0D(r5, r4)
            float r9 = java.lang.Float.intBitsToFloat(r1)
            X.4XS r1 = X.C90914f4.A01
            r1.A08(r6, r2, r9)
        L_0x0178:
            int r1 = r4 + 4
            goto L_0x0191
        L_0x017b:
            r1 = 1
            if (r9 != r1) goto L_0x009a
            long r11 = X.AnonymousClass3K2.A0K(r5, r4)
            double r24 = java.lang.Double.longBitsToDouble(r11)
            X.4XS r20 = X.C90914f4.A01
            r21 = r6
            r22 = r2
            r20.A07(r21, r22, r24)
        L_0x018f:
            int r1 = r4 + 8
        L_0x0191:
            r19 = r19 | r16
            goto L_0x00b9
        L_0x0195:
            r1 = 27
            if (r14 != r1) goto L_0x01d0
            r1 = 2
            if (r9 != r1) goto L_0x009a
            java.lang.Object r9 = r8.getObject(r6, r2)
            X.5Us r9 = (X.C110025Us) r9
            r1 = r9
            X.5Bp r1 = (X.C105895Bp) r1
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x01b4
            int r1 = X.AnonymousClass3K4.A0A(r9)
            X.5Us r9 = r9.Aim(r1)
            r8.putObject(r6, r2, r9)
        L_0x01b4:
            X.5TK r3 = r13.A0N(r10)
        L_0x01b8:
            r1 = r35
            int r1 = A02(r7, r3, r5, r4, r1)
            java.lang.Object r2 = r7.A02
            r9.add(r2)
            r2 = r35
            if (r1 >= r2) goto L_0x00b9
            int r4 = A05(r7, r5, r1)
            int r2 = r7.A00
            if (r12 != r2) goto L_0x00b9
            goto L_0x01b8
        L_0x01d0:
            r1 = 49
            if (r14 > r1) goto L_0x01fa
            r1 = r17
            long r15 = (long) r1
            r28 = r9
            r29 = r10
            r30 = r14
            r31 = r15
            r33 = r2
            r23 = r5
            r24 = r4
            r25 = r35
            r26 = r12
            r27 = r18
            r20 = r13
            r21 = r7
            r22 = r6
            int r1 = r20.A0M(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33)
        L_0x01f5:
            if (r1 != r4) goto L_0x00b9
            r4 = r1
            goto L_0x009a
        L_0x01fa:
            r1 = 50
            if (r14 != r1) goto L_0x022b
            r1 = 2
            if (r9 != r1) goto L_0x009a
            java.lang.Object r7 = r8.getObject(r6, r2)
            X.5O7 r5 = r13.A06
            r0 = r7
            X.5CR r0 = (X.AnonymousClass5CR) r0
            boolean r0 = r0.zza
            if (r0 != 0) goto L_0x0221
            X.5CR r4 = X.AnonymousClass5CR.A00
            boolean r1 = r4.isEmpty()
            X.5CR r0 = new X.5CR
            if (r1 == 0) goto L_0x0227
            r0.<init>()
        L_0x021b:
            r5.Aio(r0, r7)
            r8.putObject(r6, r2, r0)
        L_0x0221:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0227:
            r0.<init>(r4)
            goto L_0x021b
        L_0x022b:
            r28 = r9
            r29 = r17
            r30 = r14
            r31 = r10
            r32 = r2
            r23 = r5
            r24 = r4
            r25 = r35
            r26 = r12
            r27 = r18
            r20 = r13
            r21 = r7
            r22 = r6
            int r1 = r20.A0L(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x01f5
        L_0x024a:
            r10 = 0
            goto L_0x009a
        L_0x024d:
            if (r0 == r3) goto L_0x0255
            long r2 = (long) r0
            r0 = r19
            r8.putInt(r6, r2, r0)
        L_0x0255:
            r0 = r35
            if (r1 == r0) goto L_0x026b
            java.lang.String r1 = "Failed to parse the message."
            X.40H r0 = new X.40H
            r0.<init>(r1)
            throw r0
        L_0x0261:
            r8 = 0
            r2 = r13
            r3 = r7
            r4 = r6
            r6 = r1
            r7 = r35
            r2.A0K(r3, r4, r5, r6, r7, r8)
        L_0x026b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98554sb.Aiy(X.4a4, java.lang.Object, byte[], int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v76, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v78, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04c5, code lost:
        if (r5 <= 0) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04c7, code lost:
        r1 = (X.AnonymousClass3K3.A0B(r2) + X.C32531gX.A00(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05ff, code lost:
        if (r5 == 0) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0601, code lost:
        r9 = X.C32531gX.A04((X.C109905Uc) r4.getObject(r14, r0), A0N(r3), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x062c, code lost:
        if (r0 == 0) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x062e, code lost:
        r9 = X.AnonymousClass3K3.A0B(r2) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x063d, code lost:
        r9 = X.AnonymousClass3K3.A0B(r2) + X.AnonymousClass3K3.A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x065b, code lost:
        if (r5 == 0) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x065d, code lost:
        r9 = X.C32531gX.A03((X.AnonymousClass557) r4.getObject(r14, r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x066a, code lost:
        if (r5 == 0) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x066c, code lost:
        r9 = X.C90944f7.A00(A0N(r3), r4.getObject(r14, r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x067b, code lost:
        if (r5 == 0) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x067d, code lost:
        r1 = r4.getObject(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0683, code lost:
        if ((r1 instanceof X.AnonymousClass557) == false) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0685, code lost:
        r9 = X.C32531gX.A03((X.AnonymousClass557) r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x068e, code lost:
        r1 = (java.lang.String) r1;
        r9 = X.AnonymousClass3K3.A0B(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0694, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:?, code lost:
        r1 = X.AnonymousClass4YS.A00(r1);
        r1 = r1;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0699, code lost:
        r1 = r1.getBytes(X.AnonymousClass4ZC.A02).length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x06a9, code lost:
        if (r0 == 0) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x06ab, code lost:
        r1 = X.AnonymousClass3K3.A0B(r2) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x06b4, code lost:
        if (r0 == 0) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x06b6, code lost:
        r1 = X.AnonymousClass3K3.A0B(r2) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x06e7, code lost:
        r1 = r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x06e8, code lost:
        r11 = r11 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0700, code lost:
        r11 = r11 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0149, code lost:
        if (r1 <= 0) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014b, code lost:
        r2 = (X.AnonymousClass3K3.A0B(r3) + X.C32531gX.A00(r1)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015b, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015d, code lost:
        r2 = X.C32531gX.A04((X.C109905Uc) X.C90914f4.A03(r14, r1), A0N(r5), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ac, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ae, code lost:
        r2 = X.C32531gX.A03((X.AnonymousClass557) X.C90914f4.A03(r14, r1), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01be, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c0, code lost:
        r2 = X.C90944f7.A00(A0N(r5), X.C90914f4.A03(r14, r1), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d2, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d4, code lost:
        r1 = X.C90914f4.A03(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01da, code lost:
        if ((r1 instanceof X.AnonymousClass557) == false) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01dc, code lost:
        r2 = X.C32531gX.A03((X.AnonymousClass557) r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e4, code lost:
        r1 = (java.lang.String) r1;
        r2 = X.AnonymousClass3K3.A0B(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ea, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r1 = X.AnonymousClass4YS.A00(r1);
        r1 = r1;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ef, code lost:
        r1 = r1.getBytes(X.AnonymousClass4ZC.A02).length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0202, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0204, code lost:
        r2 = X.AnonymousClass3K3.A0B(r3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0218, code lost:
        r2 = X.AnonymousClass3K3.A0B(r3) + X.AnonymousClass3K3.A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022f, code lost:
        r2 = X.AnonymousClass3K3.A0B(r3) + X.C32531gX.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x023e, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0240, code lost:
        r2 = X.AnonymousClass3K3.A0B(r3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x024c, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x024e, code lost:
        r2 = X.AnonymousClass3K3.A0B(r3) + 8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Aj1(java.lang.Object r14) {
        /*
            r13 = this;
            boolean r0 = r13.A0A
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 1
            sun.misc.Unsafe r4 = A0E
            if (r0 == 0) goto L_0x0367
            r5 = 0
            r9 = 0
        L_0x000e:
            int[] r2 = r13.A0B
            int r0 = r2.length
            if (r5 >= r0) goto L_0x035d
            int r0 = r5 + 1
            r1 = r2[r0]
            r0 = r1 & r3
            int r0 = r0 >>> 20
            r3 = r2[r5]
            r1 = r1 & r12
            long r1 = (long) r1
            switch(r0) {
                case 0: goto L_0x0248;
                case 1: goto L_0x023a;
                case 2: goto L_0x0223;
                case 3: goto L_0x0223;
                case 4: goto L_0x020c;
                case 5: goto L_0x0248;
                case 6: goto L_0x023a;
                case 7: goto L_0x01fe;
                case 8: goto L_0x01ce;
                case 9: goto L_0x01ba;
                case 10: goto L_0x01a8;
                case 11: goto L_0x0191;
                case 12: goto L_0x020c;
                case 13: goto L_0x023a;
                case 14: goto L_0x0248;
                case 15: goto L_0x017f;
                case 16: goto L_0x016d;
                case 17: goto L_0x0157;
                case 18: goto L_0x027e;
                case 19: goto L_0x0291;
                case 20: goto L_0x0322;
                case 21: goto L_0x030f;
                case 22: goto L_0x02fc;
                case 23: goto L_0x027e;
                case 24: goto L_0x0291;
                case 25: goto L_0x02ea;
                case 26: goto L_0x02e1;
                case 27: goto L_0x02d4;
                case 28: goto L_0x02cb;
                case 29: goto L_0x02b8;
                case 30: goto L_0x02a4;
                case 31: goto L_0x0291;
                case 32: goto L_0x027e;
                case 33: goto L_0x026a;
                case 34: goto L_0x0256;
                case 35: goto L_0x00ee;
                case 36: goto L_0x00fb;
                case 37: goto L_0x013f;
                case 38: goto L_0x0134;
                case 39: goto L_0x0129;
                case 40: goto L_0x00ee;
                case 41: goto L_0x00fb;
                case 42: goto L_0x011e;
                case 43: goto L_0x0113;
                case 44: goto L_0x0108;
                case 45: goto L_0x00fb;
                case 46: goto L_0x00ee;
                case 47: goto L_0x00e3;
                case 48: goto L_0x00d8;
                case 49: goto L_0x033b;
                case 50: goto L_0x00b2;
                case 51: goto L_0x00ac;
                case 52: goto L_0x00a6;
                case 53: goto L_0x0096;
                case 54: goto L_0x0096;
                case 55: goto L_0x0086;
                case 56: goto L_0x00ac;
                case 57: goto L_0x00a6;
                case 58: goto L_0x0080;
                case 59: goto L_0x007a;
                case 60: goto L_0x0074;
                case 61: goto L_0x006e;
                case 62: goto L_0x0055;
                case 63: goto L_0x0086;
                case 64: goto L_0x00a6;
                case 65: goto L_0x00ac;
                case 66: goto L_0x0041;
                case 67: goto L_0x002d;
                case 68: goto L_0x0027;
                default: goto L_0x0022;
            }
        L_0x0022:
            int r5 = r5 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x000e
        L_0x0027:
            boolean r0 = r13.A0P(r14, r3, r5)
            goto L_0x015b
        L_0x002d:
            boolean r0 = r13.A0P(r14, r3, r5)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = X.C90914f4.A03(r14, r1)
            long r0 = X.C13700nu.A01(r0)
            int r2 = X.C32531gX.A01(r3, r0)
            goto L_0x0338
        L_0x0041:
            boolean r0 = r13.A0P(r14, r3, r5)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = X.C90914f4.A03(r14, r1)
            int r0 = X.AnonymousClass000.A0D(r0)
            int r2 = A00(r3, r0)
            goto L_0x0338
        L_0x0055:
            boolean r0 = r13.A0P(r14, r3, r5)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = X.C90914f4.A03(r14, r1)
            int r0 = X.AnonymousClass000.A0D(r0)
            int r2 = X.AnonymousClass3K3.A0B(r3)
            int r0 = X.C32531gX.A00(r0)
            int r2 = r2 + r0
            goto L_0x0338
        L_0x006e:
            boolean r0 = r13.A0P(r14, r3, r5)
            goto L_0x01ac
        L_0x0074:
            boolean r0 = r13.A0P(r14, r3, r5)
            goto L_0x01be
        L_0x007a:
            boolean r0 = r13.A0P(r14, r3, r5)
            goto L_0x01d2
        L_0x0080:
            boolean r0 = r13.A0P(r14, r3, r5)
            goto L_0x0202
        L_0x0086:
            boolean r0 = r13.A0P(r14, r3, r5)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = X.C90914f4.A03(r14, r1)
            int r0 = X.AnonymousClass000.A0D(r0)
            goto L_0x0218
        L_0x0096:
            boolean r0 = r13.A0P(r14, r3, r5)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = X.C90914f4.A03(r14, r1)
            long r0 = X.C13700nu.A01(r0)
            goto L_0x022f
        L_0x00a6:
            boolean r0 = r13.A0P(r14, r3, r5)
            goto L_0x023e
        L_0x00ac:
            boolean r0 = r13.A0P(r14, r3, r5)
            goto L_0x024c
        L_0x00b2:
            java.lang.Object r1 = X.C90914f4.A03(r14, r1)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x034b
            java.util.Iterator r1 = X.C13690nt.A0j(r1)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x034b
            java.util.Map$Entry r0 = X.AnonymousClass000.A0z(r1)
            r0.getKey()
            r0.getValue()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x00d8:
            java.lang.Object r0 = r4.getObject(r14, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90944f7.A04(r0)
            goto L_0x0149
        L_0x00e3:
            java.lang.Object r0 = r4.getObject(r14, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90944f7.A08(r0)
            goto L_0x0149
        L_0x00ee:
            java.lang.Object r0 = r4.getObject(r14, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = A0C(r0)
            int r1 = r0 << 3
            goto L_0x0149
        L_0x00fb:
            java.lang.Object r0 = r4.getObject(r14, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = A0C(r0)
            int r1 = r0 << 2
            goto L_0x0149
        L_0x0108:
            java.lang.Object r0 = r4.getObject(r14, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90944f7.A05(r0)
            goto L_0x0149
        L_0x0113:
            java.lang.Object r0 = r4.getObject(r14, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90944f7.A07(r0)
            goto L_0x0149
        L_0x011e:
            java.lang.Object r0 = r4.getObject(r14, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = A0C(r0)
            goto L_0x0149
        L_0x0129:
            java.lang.Object r0 = r4.getObject(r14, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90944f7.A06(r0)
            goto L_0x0149
        L_0x0134:
            java.lang.Object r0 = r4.getObject(r14, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90944f7.A03(r0)
            goto L_0x0149
        L_0x013f:
            java.lang.Object r0 = r4.getObject(r14, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C90944f7.A02(r0)
        L_0x0149:
            if (r1 <= 0) goto L_0x0022
            int r2 = X.AnonymousClass3K3.A0B(r3)
            int r0 = X.C32531gX.A00(r1)
            int r2 = r2 + r0
            int r2 = r2 + r1
            goto L_0x0338
        L_0x0157:
            boolean r0 = r13.A0O(r5, r14)
        L_0x015b:
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = X.C90914f4.A03(r14, r1)
            X.5Uc r1 = (X.C109905Uc) r1
            X.5TK r0 = r13.A0N(r5)
            int r2 = X.C32531gX.A04(r1, r0, r3)
            goto L_0x0338
        L_0x016d:
            boolean r0 = r13.A0O(r5, r14)
            if (r0 == 0) goto L_0x0022
            X.4XS r0 = X.C90914f4.A01
            long r0 = r0.A05(r14, r1)
            int r2 = X.C32531gX.A01(r3, r0)
            goto L_0x0338
        L_0x017f:
            boolean r0 = r13.A0O(r5, r14)
            if (r0 == 0) goto L_0x0022
            X.4XS r0 = X.C90914f4.A01
            int r0 = r0.A04(r14, r1)
            int r2 = A00(r3, r0)
            goto L_0x0338
        L_0x0191:
            boolean r0 = r13.A0O(r5, r14)
            if (r0 == 0) goto L_0x0022
            X.4XS r0 = X.C90914f4.A01
            int r0 = r0.A04(r14, r1)
            int r2 = X.AnonymousClass3K3.A0B(r3)
            int r0 = X.C32531gX.A00(r0)
            int r2 = r2 + r0
            goto L_0x0338
        L_0x01a8:
            boolean r0 = r13.A0O(r5, r14)
        L_0x01ac:
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = X.C90914f4.A03(r14, r1)
            X.557 r0 = (X.AnonymousClass557) r0
            int r2 = X.C32531gX.A03(r0, r3)
            goto L_0x0338
        L_0x01ba:
            boolean r0 = r13.A0O(r5, r14)
        L_0x01be:
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = X.C90914f4.A03(r14, r1)
            X.5TK r0 = r13.A0N(r5)
            int r2 = X.C90944f7.A00(r0, r1, r3)
            goto L_0x0338
        L_0x01ce:
            boolean r0 = r13.A0O(r5, r14)
        L_0x01d2:
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = X.C90914f4.A03(r14, r1)
            boolean r0 = r1 instanceof X.AnonymousClass557
            if (r0 == 0) goto L_0x01e4
            X.557 r1 = (X.AnonymousClass557) r1
            int r2 = X.C32531gX.A03(r1, r3)
            goto L_0x0338
        L_0x01e4:
            java.lang.String r1 = (java.lang.String) r1
            int r2 = X.AnonymousClass3K3.A0B(r3)
            int r1 = X.AnonymousClass4YS.A00(r1)     // Catch:{ 443 -> 0x01ef }
            goto L_0x01f6
        L_0x01ef:
            java.nio.charset.Charset r0 = X.AnonymousClass4ZC.A02
            byte[] r0 = r1.getBytes(r0)
            int r1 = r0.length
        L_0x01f6:
            int r0 = X.C32531gX.A00(r1)
            int r0 = r0 + r1
            int r2 = r2 + r0
            goto L_0x0338
        L_0x01fe:
            boolean r0 = r13.A0O(r5, r14)
        L_0x0202:
            if (r0 == 0) goto L_0x0022
            int r0 = X.AnonymousClass3K3.A0B(r3)
            int r2 = r0 + 1
            goto L_0x0338
        L_0x020c:
            boolean r0 = r13.A0O(r5, r14)
            if (r0 == 0) goto L_0x0022
            X.4XS r0 = X.C90914f4.A01
            int r0 = r0.A04(r14, r1)
        L_0x0218:
            int r2 = X.AnonymousClass3K3.A0B(r3)
            int r0 = X.AnonymousClass3K3.A08(r0)
            int r2 = r2 + r0
            goto L_0x0338
        L_0x0223:
            boolean r0 = r13.A0O(r5, r14)
            if (r0 == 0) goto L_0x0022
            X.4XS r0 = X.C90914f4.A01
            long r0 = r0.A05(r14, r1)
        L_0x022f:
            int r2 = X.AnonymousClass3K3.A0B(r3)
            int r0 = X.C32531gX.A02(r0)
            int r2 = r2 + r0
            goto L_0x0338
        L_0x023a:
            boolean r0 = r13.A0O(r5, r14)
        L_0x023e:
            if (r0 == 0) goto L_0x0022
            int r0 = X.AnonymousClass3K3.A0B(r3)
            int r2 = r0 + 4
            goto L_0x0338
        L_0x0248:
            boolean r0 = r13.A0O(r5, r14)
        L_0x024c:
            if (r0 == 0) goto L_0x0022
            int r0 = X.AnonymousClass3K3.A0B(r3)
            int r2 = r0 + 8
            goto L_0x0338
        L_0x0256:
            java.util.List r0 = X.AnonymousClass3K4.A0g(r14, r1)
            int r1 = A0C(r0)
            if (r1 == 0) goto L_0x034b
            int r0 = X.C90944f7.A04(r0)
            int r2 = A01(r3, r1, r0)
            goto L_0x0338
        L_0x026a:
            java.util.List r0 = X.AnonymousClass3K4.A0g(r14, r1)
            int r1 = A0C(r0)
            if (r1 == 0) goto L_0x034b
            int r0 = X.C90944f7.A08(r0)
            int r2 = A01(r3, r1, r0)
            goto L_0x0338
        L_0x027e:
            java.util.List r0 = X.AnonymousClass3K4.A0g(r14, r1)
            int r2 = A0C(r0)
            if (r2 == 0) goto L_0x034b
            int r0 = X.AnonymousClass3K3.A0B(r3)
            int r0 = r0 + 8
            int r2 = r2 * r0
            goto L_0x0338
        L_0x0291:
            java.util.List r0 = X.AnonymousClass3K4.A0g(r14, r1)
            int r2 = A0C(r0)
            if (r2 == 0) goto L_0x034b
            int r0 = X.AnonymousClass3K3.A0B(r3)
            int r0 = r0 + 4
            int r2 = r2 * r0
            goto L_0x0338
        L_0x02a4:
            java.util.List r0 = X.AnonymousClass3K4.A0g(r14, r1)
            int r1 = A0C(r0)
            if (r1 == 0) goto L_0x034b
            int r0 = X.C90944f7.A05(r0)
            int r2 = A01(r3, r1, r0)
            goto L_0x0338
        L_0x02b8:
            java.util.List r0 = X.AnonymousClass3K4.A0g(r14, r1)
            int r1 = A0C(r0)
            if (r1 == 0) goto L_0x034b
            int r0 = X.C90944f7.A07(r0)
            int r2 = A01(r3, r1, r0)
            goto L_0x0338
        L_0x02cb:
            java.util.List r0 = X.AnonymousClass3K4.A0g(r14, r1)
            int r2 = X.C90944f7.A0A(r0, r3)
            goto L_0x0338
        L_0x02d4:
            java.util.List r1 = X.AnonymousClass3K4.A0g(r14, r1)
            X.5TK r0 = r13.A0N(r5)
            int r2 = X.C90944f7.A01(r0, r1, r3)
            goto L_0x0338
        L_0x02e1:
            java.util.List r0 = X.AnonymousClass3K4.A0g(r14, r1)
            int r2 = X.C90944f7.A09(r0, r3)
            goto L_0x0338
        L_0x02ea:
            java.util.List r0 = X.AnonymousClass3K4.A0g(r14, r1)
            int r2 = A0C(r0)
            if (r2 == 0) goto L_0x034b
            int r0 = X.AnonymousClass3K3.A0B(r3)
            int r0 = r0 + 1
            int r2 = r2 * r0
            goto L_0x0338
        L_0x02fc:
            java.util.List r0 = X.AnonymousClass3K4.A0g(r14, r1)
            int r1 = A0C(r0)
            if (r1 == 0) goto L_0x034b
            int r0 = X.C90944f7.A06(r0)
            int r2 = A01(r3, r1, r0)
            goto L_0x0338
        L_0x030f:
            java.util.List r0 = X.AnonymousClass3K4.A0g(r14, r1)
            int r1 = A0C(r0)
            if (r1 == 0) goto L_0x034b
            int r0 = X.C90944f7.A03(r0)
            int r2 = A01(r3, r1, r0)
            goto L_0x0338
        L_0x0322:
            java.util.List r2 = X.AnonymousClass3K4.A0g(r14, r1)
            int r0 = A0C(r2)
            if (r0 == 0) goto L_0x034b
            int r1 = X.C90944f7.A02(r2)
            int r0 = r2.size()
            int r2 = A01(r3, r0, r1)
        L_0x0338:
            int r9 = r9 + r2
            goto L_0x0022
        L_0x033b:
            java.util.List r8 = X.AnonymousClass3K4.A0g(r14, r1)
            X.5TK r7 = r13.A0N(r5)
            int r6 = A0C(r8)
            r1 = 0
            r2 = 0
            if (r6 != 0) goto L_0x034d
        L_0x034b:
            r2 = 0
            goto L_0x0338
        L_0x034d:
            if (r1 >= r6) goto L_0x0338
            java.lang.Object r0 = r8.get(r1)
            X.5Uc r0 = (X.C109905Uc) r0
            int r0 = X.C32531gX.A04(r0, r7, r3)
            int r2 = r2 + r0
            int r1 = r1 + 1
            goto L_0x034d
        L_0x035d:
            X.3bJ r14 = (X.C67293bJ) r14
            X.4dZ r0 = r14.zzb
            int r0 = r0.A01()
            int r9 = r9 + r0
            return r9
        L_0x0367:
            r3 = 0
            r11 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
        L_0x036d:
            int[] r1 = r13.A0B
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0706
            int r0 = r3 + 1
            r8 = r1[r0]
            r2 = r1[r3]
            int r7 = X.AnonymousClass3K4.A04(r8)
            r0 = 17
            if (r7 > r0) goto L_0x0703
            int r0 = r3 + 2
            r0 = r1[r0]
            r5 = r0 & r12
            int r0 = r0 >>> 20
            int r9 = r9 << r0
            if (r5 == r6) goto L_0x0391
            long r0 = (long) r5
            int r10 = r4.getInt(r14, r0)
            r6 = r5
        L_0x0391:
            r8 = r8 & r12
            long r0 = (long) r8
            switch(r7) {
                case 0: goto L_0x06eb;
                case 1: goto L_0x06f6;
                case 2: goto L_0x06d8;
                case 3: goto L_0x06d8;
                case 4: goto L_0x06c8;
                case 5: goto L_0x06bd;
                case 6: goto L_0x06b2;
                case 7: goto L_0x06a7;
                case 8: goto L_0x0679;
                case 9: goto L_0x0668;
                case 10: goto L_0x0659;
                case 11: goto L_0x0647;
                case 12: goto L_0x0635;
                case 13: goto L_0x06b2;
                case 14: goto L_0x062a;
                case 15: goto L_0x061d;
                case 16: goto L_0x0610;
                case 17: goto L_0x05fd;
                case 18: goto L_0x04ff;
                case 19: goto L_0x0514;
                case 20: goto L_0x05be;
                case 21: goto L_0x05a8;
                case 22: goto L_0x0592;
                case 23: goto L_0x04ff;
                case 24: goto L_0x0514;
                case 25: goto L_0x057d;
                case 26: goto L_0x0571;
                case 27: goto L_0x0561;
                case 28: goto L_0x0555;
                case 29: goto L_0x053f;
                case 30: goto L_0x0529;
                case 31: goto L_0x0514;
                case 32: goto L_0x04ff;
                case 33: goto L_0x04e9;
                case 34: goto L_0x04d3;
                case 35: goto L_0x046a;
                case 36: goto L_0x0477;
                case 37: goto L_0x04bb;
                case 38: goto L_0x04b0;
                case 39: goto L_0x04a5;
                case 40: goto L_0x046a;
                case 41: goto L_0x0477;
                case 42: goto L_0x049a;
                case 43: goto L_0x048f;
                case 44: goto L_0x0484;
                case 45: goto L_0x0477;
                case 46: goto L_0x046a;
                case 47: goto L_0x045f;
                case 48: goto L_0x0454;
                case 49: goto L_0x05d8;
                case 50: goto L_0x042e;
                case 51: goto L_0x0428;
                case 52: goto L_0x0422;
                case 53: goto L_0x0409;
                case 54: goto L_0x0409;
                case 55: goto L_0x03f9;
                case 56: goto L_0x0428;
                case 57: goto L_0x0422;
                case 58: goto L_0x03f3;
                case 59: goto L_0x03ed;
                case 60: goto L_0x03e7;
                case 61: goto L_0x03e1;
                case 62: goto L_0x03c8;
                case 63: goto L_0x03f9;
                case 64: goto L_0x0422;
                case 65: goto L_0x0428;
                case 66: goto L_0x03b4;
                case 67: goto L_0x03a0;
                case 68: goto L_0x039a;
                default: goto L_0x0396;
            }
        L_0x0396:
            int r3 = r3 + 3
            r9 = 1
            goto L_0x036d
        L_0x039a:
            boolean r5 = r13.A0P(r14, r2, r3)
            goto L_0x05ff
        L_0x03a0:
            boolean r5 = r13.A0P(r14, r2, r3)
            if (r5 == 0) goto L_0x0396
            java.lang.Object r0 = X.C90914f4.A03(r14, r0)
            long r0 = X.C13700nu.A01(r0)
            int r9 = X.C32531gX.A01(r2, r0)
            goto L_0x068b
        L_0x03b4:
            boolean r5 = r13.A0P(r14, r2, r3)
            if (r5 == 0) goto L_0x0396
            java.lang.Object r0 = X.C90914f4.A03(r14, r0)
            int r0 = X.AnonymousClass000.A0D(r0)
            int r9 = A00(r2, r0)
            goto L_0x068b
        L_0x03c8:
            boolean r5 = r13.A0P(r14, r2, r3)
            if (r5 == 0) goto L_0x0396
            java.lang.Object r0 = X.C90914f4.A03(r14, r0)
            int r0 = X.AnonymousClass000.A0D(r0)
            int r9 = X.AnonymousClass3K3.A0B(r2)
            int r0 = X.C32531gX.A00(r0)
            int r9 = r9 + r0
            goto L_0x068b
        L_0x03e1:
            boolean r5 = r13.A0P(r14, r2, r3)
            goto L_0x065b
        L_0x03e7:
            boolean r5 = r13.A0P(r14, r2, r3)
            goto L_0x066a
        L_0x03ed:
            boolean r5 = r13.A0P(r14, r2, r3)
            goto L_0x067b
        L_0x03f3:
            boolean r0 = r13.A0P(r14, r2, r3)
            goto L_0x06a9
        L_0x03f9:
            boolean r5 = r13.A0P(r14, r2, r3)
            if (r5 == 0) goto L_0x0396
            java.lang.Object r0 = X.C90914f4.A03(r14, r0)
            int r0 = X.AnonymousClass000.A0D(r0)
            goto L_0x063d
        L_0x0409:
            boolean r5 = r13.A0P(r14, r2, r3)
            if (r5 == 0) goto L_0x0396
            java.lang.Object r0 = X.C90914f4.A03(r14, r0)
            long r0 = X.C13700nu.A01(r0)
            int r9 = X.AnonymousClass3K3.A0B(r2)
            int r0 = X.C32531gX.A02(r0)
            int r9 = r9 + r0
            goto L_0x068b
        L_0x0422:
            boolean r0 = r13.A0P(r14, r2, r3)
            goto L_0x06b4
        L_0x0428:
            boolean r0 = r13.A0P(r14, r2, r3)
            goto L_0x062c
        L_0x042e:
            java.lang.Object r1 = r4.getObject(r14, r0)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x05ea
            java.util.Iterator r1 = X.C13690nt.A0j(r1)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05ea
            java.util.Map$Entry r0 = X.AnonymousClass000.A0z(r1)
            r0.getKey()
            r0.getValue()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0454:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r5 = X.C90944f7.A04(r0)
            goto L_0x04c5
        L_0x045f:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r5 = X.C90944f7.A08(r0)
            goto L_0x04c5
        L_0x046a:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = A0C(r0)
            int r5 = r0 << 3
            goto L_0x04c5
        L_0x0477:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = A0C(r0)
            int r5 = r0 << 2
            goto L_0x04c5
        L_0x0484:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r5 = X.C90944f7.A05(r0)
            goto L_0x04c5
        L_0x048f:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r5 = X.C90944f7.A07(r0)
            goto L_0x04c5
        L_0x049a:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r5 = A0C(r0)
            goto L_0x04c5
        L_0x04a5:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r5 = X.C90944f7.A06(r0)
            goto L_0x04c5
        L_0x04b0:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r5 = X.C90944f7.A03(r0)
            goto L_0x04c5
        L_0x04bb:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r5 = X.C90944f7.A02(r0)
        L_0x04c5:
            if (r5 <= 0) goto L_0x0396
            int r1 = X.AnonymousClass3K3.A0B(r2)
            int r0 = X.C32531gX.A00(r5)
            int r1 = r1 + r0
            int r1 = r1 + r5
            goto L_0x06e8
        L_0x04d3:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = A0C(r0)
            if (r1 == 0) goto L_0x05ea
            int r0 = X.C90944f7.A04(r0)
            int r9 = A01(r2, r1, r0)
            goto L_0x068b
        L_0x04e9:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = A0C(r0)
            if (r1 == 0) goto L_0x05ea
            int r0 = X.C90944f7.A08(r0)
            int r9 = A01(r2, r1, r0)
            goto L_0x068b
        L_0x04ff:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r9 = A0C(r0)
            if (r9 == 0) goto L_0x05ea
            int r0 = X.AnonymousClass3K3.A0B(r2)
            int r0 = r0 + 8
            int r9 = r9 * r0
            goto L_0x068b
        L_0x0514:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r9 = A0C(r0)
            if (r9 == 0) goto L_0x05ea
            int r0 = X.AnonymousClass3K3.A0B(r2)
            int r0 = r0 + 4
            int r9 = r9 * r0
            goto L_0x068b
        L_0x0529:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = A0C(r0)
            if (r1 == 0) goto L_0x05ea
            int r0 = X.C90944f7.A05(r0)
            int r9 = A01(r2, r1, r0)
            goto L_0x068b
        L_0x053f:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = A0C(r0)
            if (r1 == 0) goto L_0x05ea
            int r0 = X.C90944f7.A07(r0)
            int r9 = A01(r2, r1, r0)
            goto L_0x068b
        L_0x0555:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r9 = X.C90944f7.A0A(r0, r2)
            goto L_0x068b
        L_0x0561:
            java.lang.Object r1 = r4.getObject(r14, r0)
            java.util.List r1 = (java.util.List) r1
            X.5TK r0 = r13.A0N(r3)
            int r9 = X.C90944f7.A01(r0, r1, r2)
            goto L_0x068b
        L_0x0571:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r9 = X.C90944f7.A09(r0, r2)
            goto L_0x068b
        L_0x057d:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r9 = A0C(r0)
            if (r9 == 0) goto L_0x05ea
            int r0 = X.AnonymousClass3K3.A0B(r2)
            int r0 = r0 + 1
            int r9 = r9 * r0
            goto L_0x068b
        L_0x0592:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = A0C(r0)
            if (r1 == 0) goto L_0x05ea
            int r0 = X.C90944f7.A06(r0)
            int r9 = A01(r2, r1, r0)
            goto L_0x068b
        L_0x05a8:
            java.lang.Object r0 = r4.getObject(r14, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = A0C(r0)
            if (r1 == 0) goto L_0x05ea
            int r0 = X.C90944f7.A03(r0)
            int r9 = A01(r2, r1, r0)
            goto L_0x068b
        L_0x05be:
            java.lang.Object r5 = r4.getObject(r14, r0)
            java.util.List r5 = (java.util.List) r5
            int r0 = A0C(r5)
            if (r0 == 0) goto L_0x05ea
            int r1 = X.C90944f7.A02(r5)
            int r0 = r5.size()
            int r9 = A01(r2, r0, r1)
            goto L_0x068b
        L_0x05d8:
            java.lang.Object r8 = r4.getObject(r14, r0)
            java.util.List r8 = (java.util.List) r8
            X.5TK r7 = r13.A0N(r3)
            int r5 = A0C(r8)
            r1 = 0
            r9 = 0
            if (r5 != 0) goto L_0x05ed
        L_0x05ea:
            r9 = 0
            goto L_0x068b
        L_0x05ed:
            if (r1 >= r5) goto L_0x068b
            java.lang.Object r0 = r8.get(r1)
            X.5Uc r0 = (X.C109905Uc) r0
            int r0 = X.C32531gX.A04(r0, r7, r2)
            int r9 = r9 + r0
            int r1 = r1 + 1
            goto L_0x05ed
        L_0x05fd:
            r5 = r10 & r9
        L_0x05ff:
            if (r5 == 0) goto L_0x0396
            java.lang.Object r1 = r4.getObject(r14, r0)
            X.5Uc r1 = (X.C109905Uc) r1
            X.5TK r0 = r13.A0N(r3)
            int r9 = X.C32531gX.A04(r1, r0, r2)
            goto L_0x068b
        L_0x0610:
            r5 = r10 & r9
            if (r5 == 0) goto L_0x0396
            long r0 = r4.getLong(r14, r0)
            int r9 = X.C32531gX.A01(r2, r0)
            goto L_0x068b
        L_0x061d:
            r5 = r10 & r9
            if (r5 == 0) goto L_0x0396
            int r0 = r4.getInt(r14, r0)
            int r9 = A00(r2, r0)
            goto L_0x068b
        L_0x062a:
            r0 = r10 & r9
        L_0x062c:
            if (r0 == 0) goto L_0x0396
            int r0 = X.AnonymousClass3K3.A0B(r2)
            int r9 = r0 + 8
            goto L_0x068b
        L_0x0635:
            r5 = r10 & r9
            if (r5 == 0) goto L_0x0396
            int r0 = r4.getInt(r14, r0)
        L_0x063d:
            int r9 = X.AnonymousClass3K3.A0B(r2)
            int r0 = X.AnonymousClass3K3.A08(r0)
            int r9 = r9 + r0
            goto L_0x068b
        L_0x0647:
            r5 = r10 & r9
            if (r5 == 0) goto L_0x0396
            int r0 = r4.getInt(r14, r0)
            int r9 = X.AnonymousClass3K3.A0B(r2)
            int r0 = X.C32531gX.A00(r0)
            int r9 = r9 + r0
            goto L_0x068b
        L_0x0659:
            r5 = r10 & r9
        L_0x065b:
            if (r5 == 0) goto L_0x0396
            java.lang.Object r0 = r4.getObject(r14, r0)
            X.557 r0 = (X.AnonymousClass557) r0
            int r9 = X.C32531gX.A03(r0, r2)
            goto L_0x068b
        L_0x0668:
            r5 = r10 & r9
        L_0x066a:
            if (r5 == 0) goto L_0x0396
            java.lang.Object r1 = r4.getObject(r14, r0)
            X.5TK r0 = r13.A0N(r3)
            int r9 = X.C90944f7.A00(r0, r1, r2)
            goto L_0x068b
        L_0x0679:
            r5 = r10 & r9
        L_0x067b:
            if (r5 == 0) goto L_0x0396
            java.lang.Object r1 = r4.getObject(r14, r0)
            boolean r0 = r1 instanceof X.AnonymousClass557
            if (r0 == 0) goto L_0x068e
            X.557 r1 = (X.AnonymousClass557) r1
            int r9 = X.C32531gX.A03(r1, r2)
        L_0x068b:
            int r11 = r11 + r9
            goto L_0x0396
        L_0x068e:
            java.lang.String r1 = (java.lang.String) r1
            int r9 = X.AnonymousClass3K3.A0B(r2)
            int r1 = X.AnonymousClass4YS.A00(r1)     // Catch:{ 443 -> 0x0699 }
            goto L_0x06a0
        L_0x0699:
            java.nio.charset.Charset r0 = X.AnonymousClass4ZC.A02
            byte[] r0 = r1.getBytes(r0)
            int r1 = r0.length
        L_0x06a0:
            int r0 = X.C32531gX.A00(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            goto L_0x068b
        L_0x06a7:
            r0 = r10 & r9
        L_0x06a9:
            if (r0 == 0) goto L_0x0396
            int r0 = X.AnonymousClass3K3.A0B(r2)
            int r1 = r0 + 1
            goto L_0x06e8
        L_0x06b2:
            r0 = r10 & r9
        L_0x06b4:
            if (r0 == 0) goto L_0x0396
            int r0 = X.AnonymousClass3K3.A0B(r2)
            int r1 = r0 + 4
            goto L_0x06e8
        L_0x06bd:
            r0 = r10 & r9
            if (r0 == 0) goto L_0x0396
            int r0 = X.AnonymousClass3K3.A0B(r2)
            int r1 = r0 + 8
            goto L_0x06e8
        L_0x06c8:
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0396
            int r0 = r4.getInt(r14, r0)
            int r1 = X.AnonymousClass3K3.A0B(r2)
            int r0 = X.AnonymousClass3K3.A08(r0)
            goto L_0x06e7
        L_0x06d8:
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0396
            long r7 = r4.getLong(r14, r0)
            int r1 = X.AnonymousClass3K3.A0B(r2)
            int r0 = X.C32531gX.A02(r7)
        L_0x06e7:
            int r1 = r1 + r0
        L_0x06e8:
            int r11 = r11 + r1
            goto L_0x0396
        L_0x06eb:
            r0 = r10 & r9
            if (r0 == 0) goto L_0x0396
            int r0 = X.AnonymousClass3K3.A0B(r2)
            int r0 = r0 + 8
            goto L_0x0700
        L_0x06f6:
            r0 = r10 & r9
            if (r0 == 0) goto L_0x0396
            int r0 = X.AnonymousClass3K3.A0B(r2)
            int r0 = r0 + 4
        L_0x0700:
            int r11 = r11 + r0
            goto L_0x0396
        L_0x0703:
            r9 = 0
            goto L_0x0391
        L_0x0706:
            X.3bJ r14 = (X.C67293bJ) r14
            X.4dZ r0 = r14.zzb
            int r0 = r0.A01()
            int r11 = r11 + r0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98554sb.Aj1(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        X.C90914f4.A01.A09(r13, X.AnonymousClass3K4.A0J(r3, r2 + 2), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c1, code lost:
        r6 = r3[r2 + 2];
        r0 = (long) (1048575 & r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cf, code lost:
        if (r0 == 1048575) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d1, code lost:
        r4 = X.C90914f4.A01;
        r4.A09(r13, r0, (1 << (r6 >>> 20)) | r4.A04(r13, r0));
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Aj9(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            r2 = 0
        L_0x0001:
            int[] r3 = r12.A0B
            int r0 = r3.length
            r7 = r13
            if (r2 >= r0) goto L_0x01e1
            int r0 = r2 + 1
            r1 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r8 = (long) r0
            r5 = r3[r2]
            int r0 = X.AnonymousClass3K4.A04(r1)
            switch(r0) {
                case 0: goto L_0x01b2;
                case 1: goto L_0x01a2;
                case 2: goto L_0x0164;
                case 3: goto L_0x0164;
                case 4: goto L_0x0174;
                case 5: goto L_0x0164;
                case 6: goto L_0x0174;
                case 7: goto L_0x0192;
                case 8: goto L_0x0184;
                case 9: goto L_0x004b;
                case 10: goto L_0x0184;
                case 11: goto L_0x0174;
                case 12: goto L_0x0174;
                case 13: goto L_0x0174;
                case 14: goto L_0x0164;
                case 15: goto L_0x0174;
                case 16: goto L_0x0164;
                case 17: goto L_0x004b;
                case 18: goto L_0x009a;
                case 19: goto L_0x009a;
                case 20: goto L_0x009a;
                case 21: goto L_0x009a;
                case 22: goto L_0x009a;
                case 23: goto L_0x009a;
                case 24: goto L_0x009a;
                case 25: goto L_0x009a;
                case 26: goto L_0x009a;
                case 27: goto L_0x009a;
                case 28: goto L_0x009a;
                case 29: goto L_0x009a;
                case 30: goto L_0x009a;
                case 31: goto L_0x009a;
                case 32: goto L_0x009a;
                case 33: goto L_0x009a;
                case 34: goto L_0x009a;
                case 35: goto L_0x009a;
                case 36: goto L_0x009a;
                case 37: goto L_0x009a;
                case 38: goto L_0x009a;
                case 39: goto L_0x009a;
                case 40: goto L_0x009a;
                case 41: goto L_0x009a;
                case 42: goto L_0x009a;
                case 43: goto L_0x009a;
                case 44: goto L_0x009a;
                case 45: goto L_0x009a;
                case 46: goto L_0x009a;
                case 47: goto L_0x009a;
                case 48: goto L_0x009a;
                case 49: goto L_0x009a;
                case 50: goto L_0x0088;
                case 51: goto L_0x006f;
                case 52: goto L_0x006f;
                case 53: goto L_0x006f;
                case 54: goto L_0x006f;
                case 55: goto L_0x006f;
                case 56: goto L_0x006f;
                case 57: goto L_0x006f;
                case 58: goto L_0x006f;
                case 59: goto L_0x006f;
                case 60: goto L_0x001c;
                case 61: goto L_0x006f;
                case 62: goto L_0x006f;
                case 63: goto L_0x006f;
                case 64: goto L_0x006f;
                case 65: goto L_0x006f;
                case 66: goto L_0x006f;
                case 67: goto L_0x006f;
                case 68: goto L_0x001c;
                default: goto L_0x0019;
            }
        L_0x0019:
            int r2 = r2 + 3
            goto L_0x0001
        L_0x001c:
            int r0 = r2 + 1
            r1 = r3[r0]
            r5 = r3[r2]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            boolean r4 = r12.A0P(r14, r5, r2)
            if (r4 == 0) goto L_0x0019
            r6 = 0
            boolean r4 = r12.A0P(r13, r5, r2)
            if (r4 == 0) goto L_0x0038
            java.lang.Object r6 = X.C90914f4.A03(r13, r0)
        L_0x0038:
            java.lang.Object r4 = X.C90914f4.A03(r14, r0)
            if (r6 == 0) goto L_0x0048
            if (r4 == 0) goto L_0x0019
            java.lang.Object r4 = X.AnonymousClass4ZC.A00(r6, r4)
        L_0x0044:
            X.C90914f4.A09(r13, r0, r4)
            goto L_0x007c
        L_0x0048:
            if (r4 == 0) goto L_0x0019
            goto L_0x0044
        L_0x004b:
            int r0 = r2 + 1
            long r0 = X.AnonymousClass3K4.A0J(r3, r0)
            boolean r4 = r12.A0O(r2, r14)
            if (r4 == 0) goto L_0x0019
            java.lang.Object r5 = X.C90914f4.A03(r13, r0)
            java.lang.Object r4 = X.C90914f4.A03(r14, r0)
            if (r5 == 0) goto L_0x006c
            if (r4 == 0) goto L_0x0019
            java.lang.Object r4 = X.AnonymousClass4ZC.A00(r5, r4)
        L_0x0067:
            X.C90914f4.A09(r13, r0, r4)
            goto L_0x01c1
        L_0x006c:
            if (r4 == 0) goto L_0x0019
            goto L_0x0067
        L_0x006f:
            boolean r0 = r12.A0P(r14, r5, r2)
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = X.C90914f4.A03(r14, r8)
            X.C90914f4.A09(r13, r8, r0)
        L_0x007c:
            int r0 = r2 + 2
            long r0 = X.AnonymousClass3K4.A0J(r3, r0)
            X.4XS r3 = X.C90914f4.A01
            r3.A09(r13, r0, r5)
            goto L_0x0019
        L_0x0088:
            X.5O7 r3 = r12.A06
            java.lang.Object r1 = X.C90914f4.A03(r13, r8)
            java.lang.Object r0 = X.C90914f4.A03(r14, r8)
            java.lang.Object r0 = r3.Aio(r1, r0)
            X.C90914f4.A09(r13, r8, r0)
            goto L_0x0019
        L_0x009a:
            X.4bB r0 = r12.A05
            boolean r0 = r0 instanceof X.C67313bL
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r5 = X.C90914f4.A03(r13, r8)
            X.5Us r5 = (X.C110025Us) r5
            java.util.List r4 = X.AnonymousClass3K4.A0g(r14, r8)
            int r3 = r5.size()
            int r1 = r4.size()
            if (r3 <= 0) goto L_0x00c6
            if (r1 <= 0) goto L_0x00c5
            r0 = r5
            X.5Bp r0 = (X.C105895Bp) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00c2
            int r1 = r1 + r3
            X.5Us r5 = r5.Aim(r1)
        L_0x00c2:
            r5.addAll(r4)
        L_0x00c5:
            r4 = r5
        L_0x00c6:
            X.C90914f4.A09(r13, r8, r4)
            goto L_0x0019
        L_0x00cb:
            java.util.List r4 = X.AnonymousClass3K4.A0g(r14, r8)
            int r5 = r4.size()
            java.util.List r3 = X.AnonymousClass3K4.A0g(r13, r8)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0112
            boolean r0 = r3 instanceof X.C110005Uq
            if (r0 == 0) goto L_0x00fe
            java.util.ArrayList r0 = X.C13690nt.A0i(r5)
            X.3aj r3 = new X.3aj
            r3.<init>(r0)
        L_0x00ea:
            X.C90914f4.A09(r13, r8, r3)
        L_0x00ed:
            int r1 = r3.size()
            int r0 = r4.size()
            if (r1 <= 0) goto L_0x00c6
            if (r0 <= 0) goto L_0x00fc
            r3.addAll(r4)
        L_0x00fc:
            r4 = r3
            goto L_0x00c6
        L_0x00fe:
            boolean r0 = r3 instanceof X.AnonymousClass5M5
            if (r0 == 0) goto L_0x010d
            boolean r0 = r3 instanceof X.C110025Us
            if (r0 == 0) goto L_0x010d
            X.5Us r3 = (X.C110025Us) r3
            X.5Us r3 = r3.Aim(r5)
            goto L_0x00ea
        L_0x010d:
            java.util.ArrayList r3 = X.C13690nt.A0i(r5)
            goto L_0x00ea
        L_0x0112:
            java.lang.Class r1 = X.C67323bM.A00
            java.lang.Class r0 = r3.getClass()
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x012f
            int r0 = r3.size()
            int r0 = r0 + r5
            java.util.ArrayList r1 = X.C13690nt.A0i(r0)
            r1.addAll(r3)
            X.C90914f4.A09(r13, r8, r1)
        L_0x012d:
            r3 = r1
            goto L_0x00ed
        L_0x012f:
            boolean r0 = r3 instanceof X.C105905Bq
            if (r0 == 0) goto L_0x0148
            int r0 = r3.size()
            int r0 = r0 + r5
            java.util.ArrayList r0 = X.C13690nt.A0i(r0)
            X.3aj r1 = new X.3aj
            r1.<init>(r0)
            r1.addAll(r3)
            X.C90914f4.A09(r13, r8, r1)
            goto L_0x012d
        L_0x0148:
            boolean r0 = r3 instanceof X.AnonymousClass5M5
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r3 instanceof X.C110025Us
            if (r0 == 0) goto L_0x00ed
            r1 = r3
            X.5Us r1 = (X.C110025Us) r1
            r0 = r1
            X.5Bp r0 = (X.C105895Bp) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00ed
            int r0 = r3.size()
            int r0 = r0 + r5
            X.5Us r3 = r1.Aim(r0)
            goto L_0x00ea
        L_0x0164:
            boolean r0 = r12.A0O(r2, r14)
            if (r0 == 0) goto L_0x0019
            X.4XS r6 = X.C90914f4.A01
            long r10 = r6.A05(r14, r8)
            r6.A0A(r7, r8, r10)
            goto L_0x01c1
        L_0x0174:
            boolean r0 = r12.A0O(r2, r14)
            if (r0 == 0) goto L_0x0019
            X.4XS r1 = X.C90914f4.A01
            int r0 = r1.A04(r14, r8)
            r1.A09(r13, r8, r0)
            goto L_0x01c1
        L_0x0184:
            boolean r0 = r12.A0O(r2, r14)
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = X.C90914f4.A03(r14, r8)
            X.C90914f4.A09(r13, r8, r0)
            goto L_0x01c1
        L_0x0192:
            boolean r0 = r12.A0O(r2, r14)
            if (r0 == 0) goto L_0x0019
            X.4XS r1 = X.C90914f4.A01
            boolean r0 = r1.A0C(r14, r8)
            r1.A0B(r13, r8, r0)
            goto L_0x01c1
        L_0x01a2:
            boolean r0 = r12.A0O(r2, r14)
            if (r0 == 0) goto L_0x0019
            X.4XS r1 = X.C90914f4.A01
            float r0 = r1.A03(r14, r8)
            r1.A08(r13, r8, r0)
            goto L_0x01c1
        L_0x01b2:
            boolean r0 = r12.A0O(r2, r14)
            if (r0 == 0) goto L_0x0019
            X.4XS r6 = X.C90914f4.A01
            double r10 = r6.A02(r14, r8)
            r6.A07(r7, r8, r10)
        L_0x01c1:
            int r0 = r2 + 2
            r6 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r6
            long r0 = (long) r0
            r4 = 1048575(0xfffff, double:5.18065E-318)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0019
            r5 = 1
            int r3 = r6 >>> 20
            int r5 = r5 << r3
            X.4XS r4 = X.C90914f4.A01
            int r3 = r4.A04(r13, r0)
            r5 = r5 | r3
            r4.A09(r13, r0, r5)
            goto L_0x0019
        L_0x01e1:
            X.C90944f7.A0S(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98554sb.Aj9(java.lang.Object, java.lang.Object):void");
    }

    public final void AjE(Object obj) {
        int i2;
        Object unmodifiableList;
        int i3 = this.A02;
        while (true) {
            i2 = this.A03;
            if (i3 >= i2) {
                break;
            }
            long A0J = AnonymousClass3K4.A0J(this.A0B, this.A0C[i3] + 1);
            Object A032 = C90914f4.A03(obj, A0J);
            if (A032 != null) {
                ((AnonymousClass5CR) A032).zza = false;
                C90914f4.A09(obj, A0J, A032);
            }
            i3++;
        }
        int[] iArr = this.A0C;
        int length = iArr.length;
        while (i2 < length) {
            C88844bB r3 = this.A05;
            long j2 = (long) iArr[i2];
            if (r3 instanceof C67313bL) {
                ((C105895Bp) ((C110025Us) C90914f4.A03(obj, j2))).A00 = false;
            } else {
                List A0g = AnonymousClass3K4.A0g(obj, j2);
                if (A0g instanceof C110005Uq) {
                    unmodifiableList = ((C110005Uq) A0g).AjJ();
                } else if (!C67323bM.A00.isAssignableFrom(A0g.getClass())) {
                    if (!(A0g instanceof AnonymousClass5M5) || !(A0g instanceof C110025Us)) {
                        unmodifiableList = Collections.unmodifiableList(A0g);
                    } else {
                        C105895Bp r7 = (C105895Bp) ((C110025Us) A0g);
                        if (r7.A00) {
                            r7.A00 = false;
                        }
                    }
                }
                C90914f4.A09(obj, j2, unmodifiableList);
            }
            i2++;
        }
        ((C67293bJ) obj).zzb.A02 = false;
    }

    public final boolean AjI(Object obj) {
        boolean z2;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        while (i4 < this.A02) {
            int i5 = this.A0C[i4];
            int[] iArr = this.A0B;
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            int i8 = iArr[i5 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 == i2) {
                i9 = i2;
            } else if (i9 != 1048575) {
                i3 = A0E.getInt(obj, (long) i9);
            }
            if ((268435456 & i7) != 0) {
                if (i9 == 1048575) {
                    if (!A0O(i5, obj)) {
                        return false;
                    }
                } else if ((i3 & i10) == 0) {
                    return false;
                }
            }
            int i11 = (267386880 & i7) >>> 20;
            if (i11 == 9 || i11 == 17) {
                z2 = i9 == 1048575 ? A0O(i5, obj) : i3 & i10;
            } else {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        z2 = A0P(obj, i6, i5);
                    } else if (i11 != 49) {
                        if (i11 == 50 && !((AbstractMap) A0E(obj, i7)).isEmpty()) {
                            throw new NoSuchMethodError();
                        }
                        i4++;
                        i2 = i9;
                    }
                }
                List A0G = A0G(i7, obj);
                if (!A0G.isEmpty()) {
                    AnonymousClass5TK A0N = A0N(i5);
                    for (int i12 = 0; i12 < A0G.size(); i12++) {
                        if (!A0N.AjI(A0G.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
                i4++;
                i2 = i9;
            }
            if (z2 && !A0N(i5).AjI(A0E(obj, i7))) {
                return false;
            }
            i4++;
            i2 = i9;
        }
        return true;
    }
}
