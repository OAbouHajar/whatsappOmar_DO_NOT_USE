package X;

/* renamed from: X.5HU  reason: invalid class name */
public final class AnonymousClass5HU extends AnonymousClass4XT {
    public static final int[] A0n = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public C90694ee A0E;
    public C90694ee A0F;
    public C90694ee A0G;
    public C90694ee A0H;
    public C90694ee A0I;
    public C90694ee A0J;
    public C90054dQ A0K;
    public C89454cD A0L;
    public C89454cD A0M;
    public C89454cD A0N;
    public C89454cD A0O;
    public C89454cD A0P;
    public C89454cD A0Q;
    public AnonymousClass4NY A0R;
    public AnonymousClass4NY A0S;
    public C89384c4 A0T;
    public C89384c4 A0U;
    public C89384c4 A0V;
    public boolean A0W;
    public boolean A0X;
    public int[] A0Y;
    public int[] A0Z;
    public C90694ee[] A0a;
    public C90694ee[] A0b;
    public final int A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final int A0h;
    public final String A0i;
    public final String A0j;
    public final C89454cD A0k = C89454cD.A00();
    public final AnonymousClass4XW A0l;
    public final int[] A0m;

    public AnonymousClass5HU(String str, String str2, String str3, AnonymousClass4XW r8, String[] strArr, int i2, int i3) {
        int length;
        this.A0l = r8;
        this.A0c = "<init>".equals(str) ? 262144 | i2 : i2;
        this.A0f = r8.A02(str);
        this.A0j = str;
        this.A0e = r8.A02(str2);
        this.A0i = str2;
        this.A0h = str3 == null ? 0 : r8.A02(str3);
        if (strArr != null && (length = strArr.length) > 0) {
            this.A0g = length;
            this.A0m = new int[length];
            for (int i4 = 0; i4 < this.A0g; i4++) {
                this.A0m[i4] = r8.A0A(strArr[i4], 7).A03;
            }
        }
        this.A0d = i3;
        if (i3 != 0) {
            int A002 = C90854ew.A00(str2) >> 2;
            A002 = (i2 & 8) != 0 ? A002 - 1 : A002;
            this.A06 = A002;
            this.A00 = A002;
            C89384c4 r0 = new C89384c4();
            this.A0U = r0;
            A0B(r0);
        }
    }

    public static void A03(AnonymousClass5HU r2, int i2) {
        r2.A08 = Math.max(r2.A08, i2);
        r2.A06 = Math.max(r2.A06, r2.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E() {
        /*
            r17 = this;
            r9 = r17
            int[] r14 = r9.A0Z
            if (r14 == 0) goto L_0x003e
            X.4cD r11 = r9.A0Q
            if (r11 != 0) goto L_0x0010
            X.4cD r11 = X.C89454cD.A00()
            r9.A0Q = r11
        L_0x0010:
            int[] r13 = r9.A0Y
            r1 = 1
            r10 = r13[r1]
            r0 = 2
            r12 = r13[r0]
            X.4XW r0 = r9.A0l
            int r3 = r0.A03
            r8 = 0
            r2 = 3
            r0 = 50
            if (r3 >= r0) goto L_0x0046
            r0 = r13[r8]
            r11.A06(r0)
            r11.A06(r10)
            int r1 = r10 + 3
            r9.A0G(r2, r1)
        L_0x002f:
            X.4cD r0 = r9.A0Q
            r0.A06(r12)
            int r12 = r12 + r1
            r9.A0G(r1, r12)
        L_0x0038:
            int r0 = r9.A0C
            int r0 = r0 + 1
            r9.A0C = r0
        L_0x003e:
            int[] r0 = r9.A0Y
            r9.A0Z = r0
            r0 = 0
            r9.A0Y = r0
            return
        L_0x0046:
            int r0 = r9.A0C
            r7 = r13[r8]
            if (r0 == 0) goto L_0x0050
            r0 = r14[r8]
            int r7 = r7 - r0
            int r7 = r7 - r1
        L_0x0050:
            r6 = r14[r1]
            int r5 = r10 - r6
            r15 = 247(0xf7, float:3.46E-43)
            r4 = 64
            r3 = 251(0xfb, float:3.52E-43)
            if (r12 != 0) goto L_0x007a
            switch(r5) {
                case -3: goto L_0x0087;
                case -2: goto L_0x0087;
                case -1: goto L_0x0087;
                case 0: goto L_0x0074;
                case 1: goto L_0x0071;
                case 2: goto L_0x0071;
                case 3: goto L_0x0071;
                default: goto L_0x005f;
            }
        L_0x005f:
            r0 = 255(0xff, float:3.57E-43)
            r11.A04(r0)
            r11.A06(r7)
            r11.A06(r10)
            r0 = 3
            int r1 = r10 + 3
            r9.A0G(r0, r1)
            goto L_0x002f
        L_0x0071:
            r2 = 252(0xfc, float:3.53E-43)
            goto L_0x0089
        L_0x0074:
            r2 = 251(0xfb, float:3.52E-43)
            if (r7 >= r4) goto L_0x0089
            r2 = 0
            goto L_0x0089
        L_0x007a:
            if (r5 != 0) goto L_0x005f
            if (r12 != r1) goto L_0x005f
            r0 = 63
            r2 = 247(0xf7, float:3.46E-43)
            if (r7 >= r0) goto L_0x0089
            r2 = 64
            goto L_0x0089
        L_0x0087:
            r2 = 248(0xf8, float:3.48E-43)
        L_0x0089:
            r16 = 3
        L_0x008b:
            if (r8 >= r6) goto L_0x009a
            if (r8 >= r10) goto L_0x009a
            r1 = r13[r16]
            r0 = r14[r16]
            if (r1 != r0) goto L_0x005f
            int r16 = r16 + 1
            int r8 = r8 + 1
            goto L_0x008b
        L_0x009a:
            if (r2 == 0) goto L_0x00d7
            if (r2 == r4) goto L_0x00c0
            if (r2 == r15) goto L_0x00b9
            r0 = 248(0xf8, float:3.48E-43)
            if (r2 == r0) goto L_0x00ce
            if (r2 == r3) goto L_0x00ca
            r0 = 252(0xfc, float:3.53E-43)
            if (r2 != r0) goto L_0x005f
            int r5 = r5 + r3
            r11.A04(r5)
            r11.A06(r7)
            int r1 = r6 + 3
            int r0 = r10 + 3
        L_0x00b5:
            r9.A0G(r1, r0)
            goto L_0x0038
        L_0x00b9:
            r11.A04(r15)
            r11.A06(r7)
            goto L_0x00c5
        L_0x00c0:
            int r0 = r7 + 64
            r11.A04(r0)
        L_0x00c5:
            int r1 = r10 + 3
            int r0 = r10 + 4
            goto L_0x00b5
        L_0x00ca:
            r11.A04(r3)
            goto L_0x00d2
        L_0x00ce:
            int r5 = r5 + r3
            r11.A04(r5)
        L_0x00d2:
            r11.A06(r7)
            goto L_0x0038
        L_0x00d7:
            r11.A04(r7)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5HU.A0E():void");
    }

    public final void A0F() {
        if (this.A0d == 1) {
            this.A0T.A08 = (short) this.A07;
            this.A0T = null;
        }
    }

    public final void A0G(int i2, int i3) {
        String str;
        int i4;
        char c2;
        while (i2 < i3) {
            AnonymousClass4XW r4 = this.A0l;
            int i5 = this.A0Y[i2];
            C89454cD r3 = this.A0Q;
            int i6 = (-67108864 & i5) >> 26;
            if (i6 == 0) {
                int i7 = i5 & 1048575;
                int i8 = i5 & 62914560;
                if (i8 == 4194304) {
                    r3.A04(i7);
                    i2++;
                } else if (i8 == 8388608) {
                    r3.A04(7);
                    str = r4.A09[i7].A08;
                    i4 = r4.A0A(str, 7).A03;
                } else if (i8 == 12582912) {
                    r3.A04(8);
                    i4 = (int) r4.A09[i7].A05;
                } else {
                    throw new AssertionError();
                }
            } else {
                StringBuilder A0o = AnonymousClass000.A0o();
                while (true) {
                    int i9 = i6 - 1;
                    if (i6 <= 0) {
                        break;
                    }
                    A0o.append('[');
                    i6 = i9;
                }
                if ((i5 & 62914560) == 8388608) {
                    A0o.append('L');
                    A0o.append(r4.A09[i5 & 1048575].A08);
                    c2 = ';';
                } else {
                    int i10 = i5 & 1048575;
                    c2 = 'I';
                    if (i10 != 1) {
                        c2 = 'F';
                        if (i10 != 2) {
                            c2 = 'D';
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    switch (i10) {
                                        case 9:
                                            c2 = 'Z';
                                            break;
                                        case 10:
                                            c2 = 'B';
                                            break;
                                        case 11:
                                            c2 = 'C';
                                            break;
                                        case 12:
                                            c2 = 'S';
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {
                                    c2 = 'J';
                                }
                            }
                        }
                    }
                }
                A0o.append(c2);
                r3.A04(7);
                str = A0o.toString();
                i4 = r4.A0A(str, 7).A03;
            }
            r3.A06(i4);
            i2++;
        }
    }

    public final void A0H(Object obj) {
        int i2;
        if (obj instanceof Integer) {
            this.A0Q.A04(AnonymousClass000.A0D(obj));
            return;
        }
        boolean z2 = obj instanceof String;
        C89454cD r2 = this.A0Q;
        if (z2) {
            r2.A04(7);
            i2 = this.A0l.A0A((String) obj, 7).A03;
        } else {
            r2.A04(8);
            i2 = ((C89384c4) obj).A00;
        }
        r2.A06(i2);
    }

    public final void A0I(C89384c4 r4, int i2) {
        C89384c4 r2 = this.A0T;
        r2.A01 = new AnonymousClass4LG(r2.A01, r4, i2);
    }

    public final void A0J(C89384c4 r5, C89384c4[] r6) {
        if (this.A0T != null) {
            if (this.A0d == 1) {
                int i2 = this.A0B - 1;
                this.A0B = i2;
                A0I(r5, i2);
                for (C89384c4 A0I2 : r6) {
                    A0I(A0I2, i2);
                }
            }
            A0F();
        }
    }
}
