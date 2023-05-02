package X;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.4XZ  reason: invalid class name */
public class AnonymousClass4XZ {
    public final int A00;
    public final int A01;
    @Deprecated
    public final byte[] A02;
    public final byte[] A03;
    public final int[] A04;
    public final int[] A05;
    public final String[] A06;
    public final AnonymousClass4WS[] A07;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r1 = 5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4XZ(byte[] r11) {
        /*
            r10 = this;
            r10.<init>()
            r10.A03 = r11
            r10.A02 = r11
            r0 = 8
            int r8 = X.AnonymousClass3K3.A0K(r11, r0)
            int[] r9 = new int[r8]
            r10.A05 = r9
            java.lang.String[] r0 = new java.lang.String[r8]
            r10.A06 = r0
            r4 = 10
            r7 = 0
            r6 = 0
            r5 = 0
            r0 = 1
        L_0x001b:
            if (r0 >= r8) goto L_0x004b
            int r3 = r0 + 1
            int r2 = r4 + 1
            r9[r0] = r2
            byte r0 = r11[r4]
            r1 = 3
            switch(r0) {
                case 1: goto L_0x0035;
                case 2: goto L_0x0029;
                case 3: goto L_0x002e;
                case 4: goto L_0x002e;
                case 5: goto L_0x0030;
                case 6: goto L_0x0030;
                case 7: goto L_0x0041;
                case 8: goto L_0x0041;
                case 9: goto L_0x002e;
                case 10: goto L_0x002e;
                case 11: goto L_0x002e;
                case 12: goto L_0x002e;
                case 13: goto L_0x0029;
                case 14: goto L_0x0029;
                case 15: goto L_0x0040;
                case 16: goto L_0x0041;
                case 17: goto L_0x0043;
                case 18: goto L_0x0046;
                case 19: goto L_0x0041;
                case 20: goto L_0x0041;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass3K3.A0f()
            throw r0
        L_0x002e:
            r0 = r3
            goto L_0x0048
        L_0x0030:
            r1 = 9
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0035:
            byte[] r0 = r10.A03
            int r0 = X.AnonymousClass3K3.A0K(r0, r2)
            int r1 = r1 + r0
            if (r1 <= r7) goto L_0x0041
            r7 = r1
            goto L_0x0041
        L_0x0040:
            r1 = 4
        L_0x0041:
            r0 = r3
            goto L_0x0049
        L_0x0043:
            r0 = r3
            r6 = 1
            goto L_0x0047
        L_0x0046:
            r0 = r3
        L_0x0047:
            r5 = 1
        L_0x0048:
            r1 = 5
        L_0x0049:
            int r4 = r4 + r1
            goto L_0x001b
        L_0x004b:
            r10.A01 = r7
            r10.A00 = r4
            r4 = 0
            if (r6 == 0) goto L_0x009d
            X.4WS[] r0 = new X.AnonymousClass4WS[r8]
        L_0x0054:
            r10.A07 = r0
            if (r5 == 0) goto L_0x009f
            char[] r5 = new char[r7]
            int r1 = r10.A03()
            int r2 = r1 + -2
            byte[] r0 = r10.A03
            int r4 = X.AnonymousClass3K3.A0K(r0, r2)
        L_0x0066:
            if (r4 <= 0) goto L_0x0029
            java.lang.String r3 = r10.A0D(r5, r1)
            int r2 = r1 + 2
            byte[] r0 = r10.A03
            int r2 = X.AnonymousClass3K2.A0C(r0, r2)
            int r1 = r1 + 6
            java.lang.String r0 = "BootstrapMethods"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0099
            byte[] r0 = r10.A03
            int r3 = X.AnonymousClass3K3.A0K(r0, r1)
            int[] r4 = new int[r3]
            int r2 = r1 + 2
            r1 = 0
        L_0x0089:
            if (r1 >= r3) goto L_0x009f
            r4[r1] = r2
            int r0 = A00(r10, r2)
            int r0 = r0 << 1
            int r0 = r0 + 4
            int r2 = r2 + r0
            int r1 = r1 + 1
            goto L_0x0089
        L_0x0099:
            int r1 = r1 + r2
            int r4 = r4 + -1
            goto L_0x0066
        L_0x009d:
            r0 = r4
            goto L_0x0054
        L_0x009f:
            r10.A04 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XZ.<init>(byte[]):void");
    }

    public static int A00(AnonymousClass4XZ r1, int i2) {
        return r1.A05(i2 + 2);
    }

    public static int A01(AnonymousClass4XZ r2, int i2) {
        return r2.A04(r2.A05[r2.A05(i2 + 1)]);
    }

    public static String A02(AnonymousClass4XZ r1, char[] cArr, int[] iArr, int i2) {
        return r1.A0D(cArr, iArr[r1.A05(i2)]);
    }

    public final int A03() {
        int i2 = this.A00;
        byte[] bArr = this.A03;
        int A0K = i2 + 8 + (AnonymousClass3K3.A0K(bArr, i2 + 6) << 1);
        int A0K2 = AnonymousClass3K3.A0K(bArr, A0K);
        int i3 = A0K + 2;
        while (true) {
            int i4 = A0K2 - 1;
            if (A0K2 <= 0) {
                break;
            }
            int A0K3 = AnonymousClass3K3.A0K(bArr, i3 + 6);
            i3 += 8;
            while (true) {
                int i5 = A0K3 - 1;
                A0K2 = i4;
                if (A0K3 > 0) {
                    i3 += AnonymousClass3K2.A0C(bArr, i3 + 2) + 6;
                    A0K3 = i5;
                }
            }
        }
        int A0K4 = AnonymousClass3K3.A0K(bArr, i3);
        int i6 = i3 + 2;
        while (true) {
            int i7 = A0K4 - 1;
            if (A0K4 <= 0) {
                return i6 + 2;
            }
            int A0K5 = AnonymousClass3K3.A0K(bArr, i6 + 6);
            i6 += 8;
            while (true) {
                int i8 = A0K5 - 1;
                A0K4 = i7;
                if (A0K5 > 0) {
                    i6 += AnonymousClass3K2.A0C(bArr, i6 + 2) + 6;
                    A0K5 = i8;
                }
            }
        }
    }

    public int A04(int i2) {
        return AnonymousClass3K2.A0C(this.A03, i2);
    }

    public int A05(int i2) {
        return AnonymousClass3K3.A0K(this.A03, i2);
    }

    public final int A06(String str, C90694ee r13, char[] cArr, int i2) {
        C90694ee r1;
        int i3;
        int i4 = 0;
        if (r13 == null) {
            byte b2 = this.A03[i2] & 255;
            r1 = null;
            if (b2 == 64) {
                return A07((C90694ee) null, cArr, i2 + 3, true);
            }
            if (b2 != 91) {
                return b2 != 101 ? i2 + 3 : i2 + 5;
            }
            i3 = i2 + 1;
        } else {
            byte[] bArr = this.A03;
            int i5 = i2 + 1;
            byte b3 = bArr[i2] & 255;
            if (b3 != 64) {
                if (b3 != 70) {
                    if (b3 == 83) {
                        r13.A09(str, Short.valueOf((short) AnonymousClass3K2.A0C(bArr, this.A05[AnonymousClass3K3.A0K(bArr, i5)])));
                    } else if (b3 == 99) {
                        String A0D = A0D(cArr, i5);
                        r13.A09(str, C90854ew.A03(A0D, 0, A0D.length()));
                    } else if (b3 == 101) {
                        String A0D2 = A0D(cArr, i5);
                        String A0D3 = A0D(cArr, i5 + 2);
                        r13.A00++;
                        if (r13.A06) {
                            AnonymousClass4XW.A01(str, r13.A04, r13.A05);
                        }
                        C89454cD r2 = r13.A04;
                        AnonymousClass4XW r12 = r13.A05;
                        r2.A09(101, r12.A02(A0D2));
                        AnonymousClass4XW.A01(A0D3, r2, r12);
                        return i5 + 4;
                    } else if (b3 == 115) {
                        r13.A09(str, A0D(cArr, i5));
                    } else if (!(b3 == 73 || b3 == 74)) {
                        if (b3 == 90) {
                            r13.A09(str, AnonymousClass3K2.A0C(bArr, this.A05[AnonymousClass3K3.A0K(bArr, i5)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
                        } else if (b3 != 91) {
                            switch (b3) {
                                case 66:
                                    r13.A09(str, Byte.valueOf((byte) AnonymousClass3K2.A0C(bArr, this.A05[AnonymousClass3K3.A0K(bArr, i5)])));
                                    break;
                                case 67:
                                    r13.A09(str, Character.valueOf((char) AnonymousClass3K2.A0C(bArr, this.A05[AnonymousClass3K3.A0K(bArr, i5)])));
                                    break;
                                case 68:
                                    break;
                                default:
                                    throw AnonymousClass3K3.A0f();
                            }
                        } else {
                            int A0K = AnonymousClass3K3.A0K(bArr, i5);
                            int i6 = i5 + 2;
                            if (A0K == 0) {
                                r1 = r13.A07(str);
                                i3 = i6 - 2;
                            } else {
                                byte b4 = bArr[i6] & 255;
                                if (b4 == 70) {
                                    float[] fArr = new float[A0K];
                                    while (i4 < A0K) {
                                        fArr[i4] = Float.intBitsToFloat(A01(this, i6));
                                        i6 += 3;
                                        i4++;
                                    }
                                    r13.A09(str, fArr);
                                    return i6;
                                } else if (b4 == 83) {
                                    short[] sArr = new short[A0K];
                                    while (i4 < A0K) {
                                        sArr[i4] = (short) A01(this, i6);
                                        i6 += 3;
                                        i4++;
                                    }
                                    r13.A09(str, sArr);
                                    return i6;
                                } else if (b4 == 90) {
                                    boolean[] zArr = new boolean[A0K];
                                    for (int i7 = 0; i7 < A0K; i7++) {
                                        zArr[i7] = AnonymousClass000.A1O(A01(this, i6));
                                        i6 += 3;
                                    }
                                    r13.A09(str, zArr);
                                    return i6;
                                } else if (b4 == 73) {
                                    int[] iArr = new int[A0K];
                                    while (i4 < A0K) {
                                        iArr[i4] = A01(this, i6);
                                        i6 += 3;
                                        i4++;
                                    }
                                    r13.A09(str, iArr);
                                    return i6;
                                } else if (b4 != 74) {
                                    switch (b4) {
                                        case 66:
                                            byte[] bArr2 = new byte[A0K];
                                            while (i4 < A0K) {
                                                bArr2[i4] = (byte) A01(this, i6);
                                                i6 += 3;
                                                i4++;
                                            }
                                            r13.A09(str, bArr2);
                                            return i6;
                                        case 67:
                                            char[] cArr2 = new char[A0K];
                                            while (i4 < A0K) {
                                                cArr2[i4] = (char) A01(this, i6);
                                                i6 += 3;
                                                i4++;
                                            }
                                            r13.A09(str, cArr2);
                                            return i6;
                                        case 68:
                                            double[] dArr = new double[A0K];
                                            while (i4 < A0K) {
                                                dArr[i4] = Double.longBitsToDouble(A0B(this.A05[AnonymousClass3K3.A0K(bArr, i6 + 1)]));
                                                i6 += 3;
                                                i4++;
                                            }
                                            r13.A09(str, dArr);
                                            return i6;
                                        default:
                                            return A07(r13.A07(str), cArr, i6 - 2, false);
                                    }
                                } else {
                                    long[] jArr = new long[A0K];
                                    while (i4 < A0K) {
                                        jArr[i4] = A0B(this.A05[AnonymousClass3K3.A0K(bArr, i6 + 1)]);
                                        i6 += 3;
                                        i4++;
                                    }
                                    r13.A09(str, jArr);
                                    return i6;
                                }
                            }
                        }
                    }
                    return i5 + 2;
                }
                r13.A09(str, A0C(cArr, AnonymousClass3K3.A0K(bArr, i5)));
                return i5 + 2;
            }
            String A0D4 = A0D(cArr, i5);
            r13.A00++;
            if (r13.A06) {
                AnonymousClass4XW.A01(str, r13.A04, r13.A05);
            }
            C89454cD r4 = r13.A04;
            AnonymousClass4XW r22 = r13.A05;
            r4.A09(64, r22.A02(A0D4));
            r4.A06(0);
            return A07(new C90694ee((C90694ee) null, r4, r22, true), cArr, i5 + 2, true);
        }
        return A07(r1, cArr, i3, false);
    }

    public final int A07(C90694ee r5, char[] cArr, int i2, boolean z2) {
        int A0K = AnonymousClass3K3.A0K(this.A03, i2);
        int i3 = i2 + 2;
        if (!z2) {
            while (true) {
                int i4 = A0K - 1;
                if (A0K <= 0) {
                    break;
                }
                i3 = A06((String) null, r5, cArr, i3);
                A0K = i4;
            }
        } else {
            while (true) {
                int i5 = A0K - 1;
                if (A0K <= 0) {
                    break;
                }
                i3 = A06(A0D(cArr, i3), r5, cArr, i3 + 2);
                A0K = i5;
            }
        }
        if (r5 != null) {
            r5.A08();
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        r9 = r9 & -256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r8 = r15 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A08(X.AnonymousClass4PF r14, int r15) {
        /*
            r13 = this;
            byte[] r6 = r13.A03
            int r9 = X.AnonymousClass3K2.A0C(r6, r15)
            int r1 = r9 >>> 24
            r0 = 1
            if (r1 == 0) goto L_0x0061
            if (r1 == r0) goto L_0x0061
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L_0x0056;
                case 17: goto L_0x0056;
                case 18: goto L_0x0056;
                case 19: goto L_0x005d;
                case 20: goto L_0x005d;
                case 21: goto L_0x005d;
                case 22: goto L_0x0061;
                case 23: goto L_0x0056;
                default: goto L_0x0012;
            }
        L_0x0012:
            switch(r1) {
                case 64: goto L_0x001a;
                case 65: goto L_0x001a;
                case 66: goto L_0x0056;
                case 67: goto L_0x0059;
                case 68: goto L_0x0059;
                case 69: goto L_0x0059;
                case 70: goto L_0x0059;
                case 71: goto L_0x0067;
                case 72: goto L_0x0067;
                case 73: goto L_0x0067;
                case 74: goto L_0x0067;
                case 75: goto L_0x0067;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass3K3.A0f()
            throw r0
        L_0x001a:
            r9 = r9 & r0
            int r0 = r15 + 1
            int r10 = X.AnonymousClass3K3.A0K(r6, r0)
            int r8 = r15 + 3
            X.4c4[] r11 = new X.C89384c4[r10]
            r14.A0H = r11
            X.4c4[] r7 = new X.C89384c4[r10]
            r14.A0G = r7
            int[] r5 = new int[r10]
            r14.A0C = r5
            r4 = 0
        L_0x0030:
            if (r4 >= r10) goto L_0x006d
            int r12 = X.AnonymousClass3K3.A0K(r6, r8)
            int r3 = A00(r13, r8)
            int r0 = r8 + 4
            int r2 = X.AnonymousClass3K3.A0K(r6, r0)
            int r8 = r8 + 6
            X.4c4[] r1 = r14.A0I
            X.4c4 r0 = r13.A0G(r1, r12)
            r11[r4] = r0
            int r12 = r12 + r3
            X.4c4 r0 = r13.A0G(r1, r12)
            r7[r4] = r0
            r5[r4] = r2
            int r4 = r4 + 1
            goto L_0x0030
        L_0x0056:
            r9 = r9 & -256(0xffffffffffffff00, float:NaN)
            goto L_0x005a
        L_0x0059:
            r9 = r9 & r0
        L_0x005a:
            int r8 = r15 + 3
            goto L_0x006d
        L_0x005d:
            r9 = r9 & r0
            int r8 = r15 + 1
            goto L_0x006d
        L_0x0061:
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r9 = r9 & r0
            int r8 = r15 + 2
            goto L_0x006d
        L_0x0067:
            r0 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r9 = r9 & r0
            int r8 = r15 + 4
        L_0x006d:
            r14.A06 = r9
            byte r0 = r6[r8]
            r2 = r0 & 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L_0x007e
            r0 = 0
        L_0x0076:
            r14.A0A = r0
            int r1 = r8 + 1
            int r0 = r2 << 1
            int r1 = r1 + r0
            return r1
        L_0x007e:
            X.4R2 r0 = new X.4R2
            r0.<init>(r6, r8)
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XZ.A08(X.4PF, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r5[r8] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        return r1 + 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A09(char[] r4, java.lang.Object[] r5, X.C89384c4[] r6, int r7, int r8) {
        /*
            r3 = this;
            byte[] r2 = r3.A03
            int r1 = r7 + 1
            byte r0 = r2[r7]
            r0 = r0 & 255(0xff, float:3.57E-43)
            switch(r0) {
                case 0: goto L_0x0010;
                case 1: goto L_0x0013;
                case 2: goto L_0x0016;
                case 3: goto L_0x0019;
                case 4: goto L_0x001c;
                case 5: goto L_0x001f;
                case 6: goto L_0x0022;
                case 7: goto L_0x0027;
                case 8: goto L_0x0030;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass3K3.A0f()
            throw r0
        L_0x0010:
            java.lang.Integer r0 = X.AnonymousClass5TZ.A05
            goto L_0x0024
        L_0x0013:
            java.lang.Integer r0 = X.AnonymousClass5TZ.A02
            goto L_0x0024
        L_0x0016:
            java.lang.Integer r0 = X.AnonymousClass5TZ.A01
            goto L_0x0024
        L_0x0019:
            java.lang.Integer r0 = X.AnonymousClass5TZ.A00
            goto L_0x0024
        L_0x001c:
            java.lang.Integer r0 = X.AnonymousClass5TZ.A03
            goto L_0x0024
        L_0x001f:
            java.lang.Integer r0 = X.AnonymousClass5TZ.A04
            goto L_0x0024
        L_0x0022:
            java.lang.Integer r0 = X.AnonymousClass5TZ.A06
        L_0x0024:
            r5[r8] = r0
            return r1
        L_0x0027:
            int[] r0 = r3.A05
            java.lang.String r0 = A02(r3, r4, r0, r1)
            r5[r8] = r0
            goto L_0x003a
        L_0x0030:
            int r0 = X.AnonymousClass3K3.A0K(r2, r1)
            X.4c4 r0 = r3.A0G(r6, r0)
            r5[r8] = r0
        L_0x003a:
            int r1 = r1 + 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XZ.A09(char[], java.lang.Object[], X.4c4[], int, int):int");
    }

    public final int A0A(int[] iArr, int i2) {
        if (iArr == null || i2 >= iArr.length) {
            return -1;
        }
        int i3 = iArr[i2];
        byte[] bArr = this.A03;
        if ((bArr[i3] & 255) >= 67) {
            return AnonymousClass3K3.A0K(bArr, i3 + 1);
        }
        return -1;
    }

    public long A0B(int i2) {
        byte[] bArr = this.A03;
        return (((long) AnonymousClass3K2.A0C(bArr, i2)) << 32) | (((long) AnonymousClass3K2.A0C(bArr, i2 + 4)) & 4294967295L);
    }

    public Object A0C(char[] cArr, int i2) {
        int[] iArr = this.A05;
        int i3 = iArr[i2];
        byte[] bArr = this.A03;
        byte b2 = bArr[i3 - 1];
        switch (b2) {
            case 3:
                return Integer.valueOf(AnonymousClass3K2.A0C(bArr, i3));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(AnonymousClass3K2.A0C(bArr, i3)));
            case 5:
                return Long.valueOf(A0B(i3));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(A0B(i3)));
            case 7:
                String A0D = A0D(cArr, i3);
                int i4 = 12;
                if (A0D.charAt(0) == '[') {
                    i4 = 9;
                }
                return new C90854ew(A0D, i4, 0, A0D.length());
            case 8:
                return A0D(cArr, i3);
            default:
                switch (b2) {
                    case 15:
                        byte b3 = bArr[i3] & 255;
                        int i5 = iArr[AnonymousClass3K3.A0K(bArr, i3 + 1)];
                        int i6 = iArr[A00(this, i5)];
                        return new C87254Wa(A02(this, cArr, iArr, i5), A0D(cArr, i6), A0D(cArr, i6 + 2), b3, AnonymousClass000.A1R(bArr[i5 - 1], 11));
                    case 16:
                        String A0D2 = A0D(cArr, i3);
                        return new C90854ew(A0D2, 11, 0, A0D2.length());
                    case 17:
                        AnonymousClass4WS[] r9 = this.A07;
                        AnonymousClass4WS r0 = r9[i2];
                        if (r0 != null) {
                            return r0;
                        }
                        int i7 = iArr[A00(this, i3)];
                        String A0D3 = A0D(cArr, i7);
                        String A0D4 = A0D(cArr, i7 + 2);
                        int i8 = this.A04[AnonymousClass3K3.A0K(bArr, i3)];
                        C87254Wa r5 = (C87254Wa) A0C(cArr, AnonymousClass3K3.A0K(bArr, i8));
                        int A002 = A00(this, i8);
                        Object[] objArr = new Object[A002];
                        int i9 = i8 + 4;
                        for (int i10 = 0; i10 < A002; i10++) {
                            objArr[i10] = A0C(cArr, AnonymousClass3K3.A0K(bArr, i9));
                            i9 += 2;
                        }
                        AnonymousClass4WS r02 = new AnonymousClass4WS(A0D3, A0D4, r5, objArr);
                        r9[i2] = r02;
                        return r02;
                    default:
                        throw AnonymousClass3K3.A0f();
                }
        }
    }

    public String A0D(char[] cArr, int i2) {
        byte[] bArr = this.A03;
        int A0K = AnonymousClass3K3.A0K(bArr, i2);
        if (i2 == 0 || A0K == 0) {
            return null;
        }
        String[] strArr = this.A06;
        String str = strArr[A0K];
        if (str != null) {
            return str;
        }
        int i3 = this.A05[A0K];
        String A0E = A0E(cArr, i3 + 2, AnonymousClass3K3.A0K(bArr, i3));
        strArr[A0K] = A0E;
        return A0E;
    }

    public final String A0E(char[] cArr, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i3 + i2;
        byte[] bArr = this.A03;
        int i7 = 0;
        while (i2 < i6) {
            int i8 = i2 + 1;
            byte b2 = bArr[i2];
            if ((b2 & 128) == 0) {
                i4 = i7 + 1;
                i5 = b2 & Byte.MAX_VALUE;
            } else {
                i4 = i7 + 1;
                if ((b2 & 224) == 192) {
                    i2 = i8 + 1;
                    cArr[i7] = (char) (((b2 & 31) << 6) + (bArr[i8] & 63));
                    i7 = i4;
                } else {
                    int i9 = i8 + 1;
                    i8 = i9 + 1;
                    i5 = ((b2 & 15) << 12) + ((bArr[i8] & 63) << 6) + (bArr[i9] & 63);
                }
            }
            cArr[i7] = (char) i5;
            i2 = i8;
            i7 = i4;
        }
        return new String(cArr, 0, i7);
    }

    public final C90054dQ A0F(String str, C90054dQ[] r6, int i2, int i3) {
        C90054dQ r3;
        int length = r6.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                r3 = new C90054dQ(new C90054dQ(str).A02);
                break;
            }
            String str2 = r6[i4].A02;
            if (str2.equals(str)) {
                r3 = new C90054dQ(str2);
                break;
            }
            i4++;
        }
        byte[] bArr = new byte[i3];
        r3.A01 = bArr;
        System.arraycopy(this.A03, i2, bArr, 0, i3);
        return r3;
    }

    public final C89384c4 A0G(C89384c4[] r3, int i2) {
        if (r3[i2] == null) {
            r3[i2] = new C89384c4();
        }
        C89384c4 r1 = r3[i2];
        r1.A05 = (short) (r1.A05 & -2);
        return r1;
    }

    public final void A0H(AnonymousClass4PF r11, AnonymousClass4XT r12, int i2, boolean z2) {
        C90694ee[] r8;
        byte[] bArr = this.A03;
        int i3 = i2 + 1;
        byte b2 = bArr[i2] & 255;
        AnonymousClass5HU r122 = (AnonymousClass5HU) r12;
        if (z2) {
            r122.A0D = b2;
        } else {
            r122.A01 = b2;
        }
        char[] cArr = r11.A0B;
        for (int i4 = 0; i4 < b2; i4++) {
            int A0K = AnonymousClass3K3.A0K(bArr, i3);
            i3 += 2;
            while (true) {
                int i5 = A0K - 1;
                if (A0K <= 0) {
                    break;
                }
                String A0D = A0D(cArr, i3);
                int i6 = i3 + 2;
                if (z2) {
                    r8 = r122.A0b;
                    if (r8 == null) {
                        r8 = new C90694ee[C90854ew.A05(r122.A0i).length];
                        r122.A0b = r8;
                    }
                } else {
                    r8 = r122.A0a;
                    if (r8 == null) {
                        r8 = new C90694ee[C90854ew.A05(r122.A0i).length];
                        r122.A0a = r8;
                    }
                }
                C90694ee A012 = C90694ee.A01(A0D, r8[i4], r122.A0l);
                r8[i4] = A012;
                i3 = A07(A012, cArr, i6, true);
                A0K = i5;
            }
        }
    }

    public final int[] A0I(AnonymousClass4PF r14, AnonymousClass4XT r15, int i2, boolean z2) {
        int i3;
        C90694ee A022;
        char[] cArr = r14.A0B;
        byte[] bArr = this.A03;
        int A0K = AnonymousClass3K3.A0K(bArr, i2);
        int[] iArr = new int[A0K];
        int i4 = i2 + 2;
        for (int i5 = 0; i5 < A0K; i5++) {
            iArr[i5] = i4;
            int A0C = AnonymousClass3K2.A0C(bArr, i4);
            int i6 = A0C >>> 24;
            if (i6 != 23) {
                switch (i6) {
                    case 16:
                    case 17:
                    case 18:
                        break;
                    default:
                        switch (i6) {
                            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                            case 65:
                                int A0K2 = AnonymousClass3K3.A0K(bArr, i4 + 1);
                                i3 = i4 + 3;
                                while (true) {
                                    int i7 = A0K2 - 1;
                                    if (A0K2 <= 0) {
                                        break;
                                    } else {
                                        int A0K3 = AnonymousClass3K3.A0K(bArr, i3);
                                        int A002 = A00(this, i3);
                                        i3 += 6;
                                        C89384c4[] r0 = r14.A0I;
                                        A0G(r0, A0K3);
                                        A0G(r0, A0K3 + A002);
                                        A0K2 = i7;
                                    }
                                }
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case AnonymousClass2EA.A02:
                            case 73:
                            case 74:
                            case 75:
                                i3 = i4 + 4;
                                break;
                            default:
                                throw AnonymousClass3K3.A0f();
                        }
                        break;
                }
            }
            i3 = i4 + 3;
            byte b2 = bArr[i3] & 255;
            AnonymousClass4R2 r6 = null;
            if (i6 == 66) {
                if (b2 != 0) {
                    r6 = new AnonymousClass4R2(bArr, i3);
                }
                int i8 = i3 + (b2 << 1) + 1;
                String A0D = A0D(cArr, i8);
                int i9 = i8 + 2;
                int i10 = A0C & -256;
                AnonymousClass5HU r2 = (AnonymousClass5HU) r15;
                AnonymousClass4XW r1 = r2.A0l;
                if (z2) {
                    A022 = C90694ee.A02(A0D, r2.A0F, r1, r6, i10);
                    r2.A0F = A022;
                } else {
                    A022 = C90694ee.A02(A0D, r2.A0E, r1, r6, i10);
                    r2.A0E = A022;
                }
                i4 = A07(A022, cArr, i9, true);
            } else {
                i4 = A07((C90694ee) null, cArr, i3 + (b2 << 1) + 3, true);
            }
        }
        return iArr;
    }
}
