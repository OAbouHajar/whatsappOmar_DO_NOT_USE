package X;

/* renamed from: X.4XT  reason: invalid class name */
public abstract class AnonymousClass4XT {
    public AnonymousClass4XT A00 = null;

    public static void A00(C89454cD r3, AnonymousClass5HU r4, int i2) {
        r4.A0A = r3.A00;
        r4.A0C++;
        if (i2 == 2) {
            r4.A0B = 0;
            if (0 > r4.A07) {
                r4.A07 = 0;
            }
        }
    }

    public static void A01(AnonymousClass5HU r5) {
        C89384c4 r1 = r5.A0T;
        if (r1.A02 == null) {
            AnonymousClass5HT r3 = new AnonymousClass5HT(r1);
            r1.A02 = r3;
            r3.A0B(r5.A0i, r5.A0l, r5.A0c, 0);
        }
    }

    public static void A02(AnonymousClass5HU r1) {
        r1.A0T.A02.A0C(r1);
    }

    public void A03(int i2) {
        AnonymousClass5HU r3 = (AnonymousClass5HU) this;
        C89454cD r1 = r3.A0k;
        r3.A02 = r1.A00;
        r1.A04(i2);
        C89384c4 r2 = r3.A0T;
        if (r2 != null) {
            if (r3.A0d == 3) {
                r2.A02.A0D((C90634eU) null, (AnonymousClass4XW) null, i2, 0);
            } else {
                int i3 = r3.A0B + AnonymousClass5HU.A0n[i2];
                if (i3 > r3.A07) {
                    r3.A07 = i3;
                }
                r3.A0B = i3;
            }
            if (i2 < 172) {
                return;
            }
            if (i2 <= 177 || i2 == 191) {
                r3.A0F();
            }
        }
    }

    public void A04(int i2, int i3) {
        AnonymousClass5HU r3 = (AnonymousClass5HU) this;
        C89454cD r1 = r3.A0k;
        r3.A02 = r1.A00;
        if (i2 == 17) {
            r1.A09(i2, i3);
        } else {
            r1.A08(i2, i3);
        }
        C89384c4 r2 = r3.A0T;
        if (r2 == null) {
            return;
        }
        if (r3.A0d == 3) {
            r2.A02.A0D((C90634eU) null, (AnonymousClass4XW) null, i2, i3);
        } else if (i2 != 188) {
            int i4 = r3.A0B + 1;
            if (i4 > r3.A07) {
                r3.A07 = i4;
            }
            r3.A0B = i4;
        }
    }

    public void A05(int i2, int i3) {
        AnonymousClass5HU r5 = (AnonymousClass5HU) this;
        int i4 = r5.A0d;
        short s2 = 1;
        if (i4 == 1) {
            for (AnonymousClass4NY r9 = r5.A0R; r9 != null; r9 = r9.A00) {
                C89384c4 r7 = r9.A03;
                C89384c4 r4 = r9.A02;
                for (C89384c4 r6 = r9.A04; r6 != r4; r6 = r6.A03) {
                    if ((r6.A05 & 16) == 0) {
                        r6.A01 = new AnonymousClass4LG(r6.A01, r7, Integer.MAX_VALUE);
                    } else {
                        AnonymousClass4LG r2 = r6.A01.A00;
                        r2.A00 = new AnonymousClass4LG(r2.A00, r7, Integer.MAX_VALUE);
                    }
                }
            }
            if (r5.A0X) {
                C89384c4 r62 = r5.A0U;
                r62.A02(1);
                short s3 = 1;
                do {
                    C89384c4 r22 = r62;
                    do {
                        if ((r22.A05 & 16) != 0 && r22.A0A == s2) {
                            C89384c4 r1 = r22.A01.A00.A02;
                            if (r1.A0A == 0) {
                                s3 = (short) (s3 + 1);
                                r1.A02(s3);
                            }
                        }
                        r22 = r22.A03;
                    } while (r22 != null);
                    s2 = (short) (s2 + 1);
                } while (s2 <= s3);
                do {
                    if ((r62.A05 & 16) != 0) {
                        C89384c4 r92 = r62.A01.A00.A02;
                        C89384c4 r42 = C89384c4.A0D;
                        r92.A04 = r42;
                        C89384c4 r23 = r42;
                        while (r92 != r42) {
                            C89384c4 r72 = r92.A04;
                            r92.A04 = r23;
                            if (!((r92.A05 & 64) == 0 || r92.A0A == r62.A0A)) {
                                short s4 = r92.A09;
                                r92.A01 = new AnonymousClass4LG(r92.A01, r62.A01.A02, s4);
                            }
                            AnonymousClass4LG r3 = r92.A01;
                            AnonymousClass4LG r24 = r3;
                            while (r3 != null) {
                                if ((r92.A05 & 16) == 0 || r3 != r24.A00) {
                                    C89384c4 r12 = r3.A02;
                                    if (r12.A04 == null) {
                                        r12.A04 = r72;
                                        r72 = r12;
                                    }
                                }
                                r3 = r3.A00;
                            }
                            r23 = r92;
                            r92 = r72;
                        }
                        while (r23 != r42) {
                            C89384c4 r13 = r23.A04;
                            r23.A04 = null;
                            r23 = r13;
                        }
                    }
                    r62 = r62.A03;
                } while (r62 != null);
            }
            C89384c4 r93 = r5.A0U;
            C89384c4 r73 = C89384c4.A0D;
            r93.A04 = r73;
            int i5 = r5.A08;
            while (r93 != r73) {
                C89384c4 r14 = r93.A04;
                short s5 = r93.A06;
                int i6 = r93.A08 + s5;
                if (i6 > i5) {
                    i5 = i6;
                }
                AnonymousClass4LG r32 = r93.A01;
                if ((r93.A05 & 16) != 0) {
                    r32 = r32.A00;
                }
                r93 = r14;
                while (r32 != null) {
                    C89384c4 r25 = r32.A02;
                    if (r25.A04 == null) {
                        int i7 = r32.A01;
                        int i8 = i7 + s5;
                        if (i7 == Integer.MAX_VALUE) {
                            i8 = 1;
                        }
                        r25.A06 = (short) i8;
                        r25.A04 = r93;
                        r93 = r25;
                    }
                    r32 = r32.A00;
                }
            }
            r5.A08 = i5;
        } else if (i4 == 2) {
            r5.A08 = r5.A07;
        } else {
            r5.A08 = i2;
            r5.A06 = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r6 == 57) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(int r6, int r7) {
        /*
            r5 = this;
            r2 = r5
            X.5HU r2 = (X.AnonymousClass5HU) r2
            X.4cD r3 = r2.A0k
            int r0 = r3.A00
            r2.A02 = r0
            r4 = 169(0xa9, float:2.37E-43)
            r1 = 54
            r0 = 4
            if (r7 >= r0) goto L_0x0074
            if (r6 == r4) goto L_0x0081
            int r0 = r6 + -54
            int r0 = r0 << 2
            int r0 = r0 + 59
            if (r6 >= r1) goto L_0x0020
            int r0 = r6 + -21
            int r0 = r0 << 2
            int r0 = r0 + 26
        L_0x0020:
            int r0 = r0 + r7
            r3.A04(r0)
        L_0x0024:
            X.4c4 r3 = r2.A0T
            if (r3 == 0) goto L_0x0033
            int r1 = r2.A0d
            r0 = 3
            if (r1 != r0) goto L_0x0052
            X.4eG r1 = r3.A02
            r0 = 0
            r1.A0D(r0, r0, r6, r7)
        L_0x0033:
            int r0 = r2.A0d
            if (r0 == 0) goto L_0x0051
            r0 = 22
            if (r6 == r0) goto L_0x0049
            r0 = 24
            if (r6 == r0) goto L_0x0049
            r0 = 55
            if (r6 == r0) goto L_0x0049
            r0 = 57
            int r1 = r7 + 1
            if (r6 != r0) goto L_0x004b
        L_0x0049:
            int r1 = r7 + 2
        L_0x004b:
            int r0 = r2.A06
            if (r1 <= r0) goto L_0x0051
            r2.A06 = r1
        L_0x0051:
            return
        L_0x0052:
            if (r6 != r4) goto L_0x0064
            short r0 = r3.A05
            r0 = r0 | 64
            short r0 = (short) r0
            r3.A05 = r0
            int r0 = r2.A0B
            short r0 = (short) r0
            r3.A09 = r0
            r2.A0F()
            goto L_0x0033
        L_0x0064:
            int r1 = r2.A0B
            int[] r0 = X.AnonymousClass5HU.A0n
            r0 = r0[r6]
            int r1 = r1 + r0
            int r0 = r2.A07
            if (r1 <= r0) goto L_0x0071
            r2.A07 = r1
        L_0x0071:
            r2.A0B = r1
            goto L_0x0033
        L_0x0074:
            r0 = 256(0x100, float:3.59E-43)
            if (r7 < r0) goto L_0x0081
            r0 = 196(0xc4, float:2.75E-43)
            r3.A04(r0)
            r3.A09(r6, r7)
            goto L_0x0024
        L_0x0081:
            r3.A08(r6, r7)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XT.A06(int, int):void");
    }

    public void A07(int i2, String str) {
        AnonymousClass5HU r5 = (AnonymousClass5HU) this;
        C89454cD r1 = r5.A0k;
        r5.A02 = r1.A00;
        AnonymousClass4XW r4 = r5.A0l;
        C90634eU A0A = r4.A0A(str, 7);
        r1.A09(i2, A0A.A03);
        C89384c4 r2 = r5.A0T;
        if (r2 == null) {
            return;
        }
        if (r5.A0d == 3) {
            r2.A02.A0D(A0A, r4, i2, r5.A02);
        } else if (i2 == 187) {
            int i3 = r5.A0B + 1;
            if (i3 > r5.A07) {
                r5.A07 = i3;
            }
            r5.A0B = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r1 = r8.A08.charAt(0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(java.lang.Object r12) {
        /*
            r11 = this;
            r6 = r11
            X.5HU r6 = (X.AnonymousClass5HU) r6
            X.4cD r2 = r6.A0k
            int r0 = r2.A00
            r6.A02 = r0
            X.4XW r7 = r6.A0l
            X.4eU r8 = r7.A09(r12)
            int r9 = r8.A03
            int r1 = r8.A04
            r10 = 1
            r5 = 0
            r0 = 5
            if (r1 == r0) goto L_0x002d
            r0 = 6
            if (r1 == r0) goto L_0x002d
            r0 = 17
            if (r1 != r0) goto L_0x0050
            java.lang.String r0 = r8.A08
            char r1 = r0.charAt(r5)
            r0 = 74
            if (r1 == r0) goto L_0x002d
            r0 = 68
            if (r1 != r0) goto L_0x0050
        L_0x002d:
            r4 = 1
        L_0x002e:
            r3 = 18
            r0 = 20
            if (r4 != 0) goto L_0x003a
            r0 = 256(0x100, float:3.59E-43)
            if (r9 < r0) goto L_0x004c
            r0 = 19
        L_0x003a:
            r2.A09(r0, r9)
        L_0x003d:
            X.4c4 r2 = r6.A0T
            if (r2 == 0) goto L_0x004b
            int r1 = r6.A0d
            r0 = 3
            if (r1 != r0) goto L_0x0052
            X.4eG r0 = r2.A02
            r0.A0D(r8, r7, r3, r5)
        L_0x004b:
            return
        L_0x004c:
            r2.A08(r3, r9)
            goto L_0x003d
        L_0x0050:
            r4 = 0
            goto L_0x002e
        L_0x0052:
            int r1 = r6.A0B
            if (r4 == 0) goto L_0x0057
            r10 = 2
        L_0x0057:
            int r1 = r1 + r10
            int r0 = r6.A07
            if (r1 <= r0) goto L_0x005e
            r6.A07 = r1
        L_0x005e:
            r6.A0B = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XT.A08(java.lang.Object):void");
    }

    public void A09(String str, String str2, String str3, int i2) {
        int i3;
        AnonymousClass5HU r7 = (AnonymousClass5HU) this;
        C89454cD r1 = r7.A0k;
        r7.A02 = r1.A00;
        AnonymousClass4XW r4 = r7.A0l;
        C90634eU A0C = r4.A0C(str, str2, str3, 9);
        r1.A09(i2, A0C.A03);
        C89384c4 r2 = r7.A0T;
        if (r2 != null) {
            int i4 = 0;
            if (r7.A0d == 3) {
                r2.A02.A0D(A0C, r4, i2, 0);
                return;
            }
            char charAt = str3.charAt(0);
            int i5 = 1;
            int i6 = -2;
            int i7 = r7.A0B;
            switch (i2) {
                case 178:
                    if (charAt == 'D' || charAt == 'J') {
                        i5 = 2;
                    }
                    i3 = i7 + i5;
                    break;
                case 179:
                    if (!(charAt == 'D' || charAt == 'J')) {
                        i6 = -1;
                        break;
                    }
                case 180:
                    if (charAt == 'D' || charAt == 'J') {
                        i4 = 1;
                    }
                    i3 = i7 + i4;
                    break;
                default:
                    if (charAt == 'D' || charAt == 'J') {
                        i6 = -3;
                        break;
                    }
            }
            i3 = i7 + i6;
            if (i3 > r7.A07) {
                r7.A07 = i3;
            }
            r7.A0B = i3;
        }
    }

    public void A0A(String str, String str2, String str3, int i2, boolean z2) {
        AnonymousClass5HU r3 = (AnonymousClass5HU) this;
        C89454cD r2 = r3.A0k;
        r3.A02 = r2.A00;
        AnonymousClass4XW r4 = r3.A0l;
        int i3 = 10;
        if (z2) {
            i3 = 11;
        }
        C90634eU A0C = r4.A0C(str, str2, str3, i3);
        int i4 = A0C.A03;
        if (i2 == 185) {
            r2.A09(185, i4);
            int i5 = A0C.A00;
            if (i5 == 0) {
                i5 = C90854ew.A00(A0C.A08);
                A0C.A00 = i5;
            }
            r2.A08(i5 >> 2, 0);
        } else {
            r2.A09(i2, i4);
        }
        C89384c4 r22 = r3.A0T;
        if (r22 == null) {
            return;
        }
        if (r3.A0d == 3) {
            r22.A02.A0D(A0C, r4, i2, 0);
            return;
        }
        int i6 = A0C.A00;
        if (i6 == 0) {
            i6 = C90854ew.A00(A0C.A08);
            A0C.A00 = i6;
        }
        int i7 = r3.A0B + ((i6 & 3) - (i6 >> 2));
        if (i2 == 184) {
            i7++;
        }
        if (i7 > r3.A07) {
            r3.A07 = i7;
        }
        r3.A0B = i7;
    }

    public void A0B(C89384c4 r14) {
        int A0F;
        AnonymousClass5HU r8 = (AnonymousClass5HU) this;
        boolean z2 = r8.A0W;
        C89454cD r0 = r8.A0k;
        byte[] bArr = r0.A01;
        int i2 = r0.A00;
        short s2 = (short) (r14.A05 | 4);
        r14.A05 = s2;
        r14.A00 = i2;
        int[] iArr = r14.A0B;
        boolean z3 = false;
        if (iArr != null) {
            for (int i3 = iArr[0]; i3 > 0; i3 -= 2) {
                int i4 = iArr[i3 - 1];
                int i5 = iArr[i3];
                int i6 = i2 - i4;
                int i7 = 268435455 & i5;
                if ((i5 & -268435456) == 268435456) {
                    if (i6 < -32768 || i6 > 32767) {
                        byte b2 = bArr[i4] & 255;
                        int i8 = b2 + 20;
                        if (b2 < 198) {
                            i8 = b2 + 49;
                        }
                        bArr[i4] = (byte) i8;
                        z3 = true;
                    }
                    A0F = i7 + 1;
                    bArr[i7] = (byte) (i6 >>> 8);
                } else {
                    A0F = AnonymousClass3K2.A0F(bArr, i7, i6);
                }
                bArr[A0F] = (byte) i6;
            }
        }
        r8.A0W = z2 | z3;
        if ((s2 & 1) == 0) {
            int i9 = r8.A0d;
            if (i9 == 3) {
                C89384c4 r02 = r8.A0T;
                if (r02 != null) {
                    r02.A02.A01 = r14;
                    return;
                }
            } else if (i9 == 1) {
                C89384c4 r1 = r8.A0T;
                if (r1 != null) {
                    r1.A08 = (short) r8.A07;
                    r8.A0I(r14, r8.A0B);
                }
                r8.A0T = r14;
                r8.A0B = 0;
                r8.A07 = 0;
                C89384c4 r03 = r8.A0V;
                if (r03 != null) {
                    r03.A03 = r14;
                }
                r8.A0V = r14;
                return;
            } else if (!(i9 == 2 && r8.A0T == null)) {
                return;
            }
            r8.A0T = r14;
        }
    }

    public void A0C(C89384c4 r13, int i2) {
        boolean z2;
        AnonymousClass5HU r7 = (AnonymousClass5HU) this;
        C89454cD r6 = r7.A0k;
        int i3 = r6.A00;
        r7.A02 = i3;
        int i4 = i2;
        if (i2 >= 200) {
            i4 = i2 - 33;
        }
        if ((r13.A05 & 4) == 0 || r13.A00 - i3 >= -32768) {
            if (i4 != i2) {
                r6.A04(i2);
                r13.A01(r6, r6.A00 - 1, true);
            } else {
                r6.A04(i4);
                r13.A01(r6, r6.A00 - 1, false);
            }
            z2 = false;
        } else {
            if (i4 == 167) {
                r6.A04(200);
            } else if (i4 == 168) {
                r6.A04(201);
            } else {
                int i5 = ((i4 + 1) ^ 1) - 1;
                if (i4 >= 198) {
                    i5 = i4 ^ 1;
                }
                r6.A04(i5);
                r6.A06(8);
                r6.A04(220);
                r7.A0W = true;
                z2 = true;
                r13.A01(r6, r6.A00 - 1, true);
            }
            z2 = false;
            r13.A01(r6, r6.A00 - 1, true);
        }
        C89384c4 r62 = r7.A0T;
        if (r62 != null) {
            int i6 = r7.A0d;
            if (i6 == 3) {
                r62.A02.A0D((C90634eU) null, (AnonymousClass4XW) null, i4, 0);
            } else if (i6 == 2) {
                r7.A0B += AnonymousClass5HU.A0n[i4];
            } else if (i4 == 168) {
                short s2 = r13.A05;
                if ((s2 & 32) == 0) {
                    r13.A05 = (short) (s2 | 32);
                    r7.A0X = true;
                }
                r62.A05 = (short) (r62.A05 | 16);
                r7.A0I(r13, r7.A0B + 1);
                C89384c4 r1 = new C89384c4();
                if (z2) {
                    r1.A05 = (short) (r1.A05 | 2);
                }
                r7.A0B(r1);
                return;
            } else {
                int i7 = r7.A0B + AnonymousClass5HU.A0n[i4];
                r7.A0B = i7;
                r7.A0I(r13, i7);
            }
            if (i4 == 167) {
                r7.A0F();
            }
        }
    }

    public void A0D(C89384c4 r8, C89384c4[] r9, int i2, int i3) {
        AnonymousClass5HU r6 = (AnonymousClass5HU) this;
        C89454cD r5 = r6.A0k;
        r6.A02 = r5.A00;
        r5.A04(170);
        r5.A0C((byte[]) null, 0, (4 - (r5.A00 % 4)) % 4);
        r8.A01(r5, r6.A02, true);
        r5.A05(i2);
        r5.A05(i3);
        for (C89384c4 A01 : r9) {
            A01.A01(r5, r6.A02, true);
        }
        r6.A0J(r8, r9);
    }
}
