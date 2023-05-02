package X;

/* renamed from: X.4XW  reason: invalid class name */
public final class AnonymousClass4XW {
    public int A00;
    public int A01 = 1;
    public int A02;
    public int A03;
    public int A04;
    public String A05;
    public C89454cD A06;
    public C89454cD A07 = C89454cD.A00();
    public C90634eU[] A08 = new C90634eU[256];
    public C90634eU[] A09;
    public final C87344Wj A0A;

    public AnonymousClass4XW(C87344Wj r2) {
        this.A0A = r2;
    }

    public static C90634eU A00(AnonymousClass4XW r1, int i2) {
        C90634eU[] r12 = r1.A08;
        return r12[i2 % r12.length];
    }

    public static void A01(String str, C89454cD r1, AnonymousClass4XW r2) {
        r1.A06(r2.A02(str));
    }

    public int A02(String str) {
        int hashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C90634eU A002 = A00(this, hashCode); A002 != null; A002 = A002.A01) {
            if (A002.A04 == 1 && A002.A02 == hashCode && A002.A08.equals(str)) {
                return A002.A03;
            }
        }
        C89454cD r10 = this.A07;
        r10.A04(1);
        int length = str.length();
        if (length <= 65535) {
            int i2 = r10.A00;
            if (i2 + 2 + length > r10.A01.length) {
                r10.A07(length + 2);
            }
            byte[] bArr = r10.A01;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (length >>> 8);
            int i4 = i3 + 1;
            bArr[i3] = (byte) length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    r10.A00 = i4;
                    break;
                }
                char charAt = str.charAt(i5);
                if (charAt < 1 || charAt > 127) {
                    r10.A00 = i4;
                    r10.A0B(i5, str, 65535);
                } else {
                    bArr[i4] = (byte) charAt;
                    i5++;
                    i4++;
                }
            }
            r10.A00 = i4;
            r10.A0B(i5, str, 65535);
            int i6 = this.A01;
            this.A01 = i6 + 1;
            C90634eU r0 = new C90634eU(str, i6, 1, hashCode);
            A0F(r0);
            return r0.A03;
        }
        throw AnonymousClass000.A0T("UTF8 string too large");
    }

    public int A03(String str) {
        int A082 = AnonymousClass3K4.A08(str, 128) & Integer.MAX_VALUE;
        for (C90634eU A002 = A00(this, A082); A002 != null; A002 = A002.A01) {
            if (A002.A04 == 128 && A002.A02 == A082 && A002.A08.equals(str)) {
                return A002.A03;
            }
        }
        return A06(new C90634eU(str, this.A04, 128, A082));
    }

    public int A04(String str, int i2) {
        String str2 = str;
        int A082 = (AnonymousClass3K4.A08(str, 129) + i2) & Integer.MAX_VALUE;
        for (C90634eU A002 = A00(this, A082); A002 != null; A002 = A002.A01) {
            if (A002.A04 == 129 && A002.A02 == A082 && A002.A05 == ((long) i2) && A002.A08.equals(str)) {
                return A002.A03;
            }
        }
        return A06(new C90634eU(str2, this.A04, A082, (long) i2));
    }

    public int A05(String str, String str2) {
        int hashCode = ((str.hashCode() * str2.hashCode()) + 12) & Integer.MAX_VALUE;
        C90634eU A002 = A00(this, hashCode);
        while (true) {
            if (A002 != null) {
                if (A002.A04 == 12 && A002.A02 == hashCode && A002.A06.equals(str) && A002.A08.equals(str2)) {
                    break;
                }
                A002 = A002.A01;
            } else {
                this.A07.A0A(12, A02(str), A02(str2));
                int i2 = this.A01;
                this.A01 = i2 + 1;
                A002 = new C90634eU(str, str2, i2, hashCode);
                A0F(A002);
                break;
            }
        }
        return A002.A03;
    }

    public final int A06(C90634eU r5) {
        C90634eU[] r3 = this.A09;
        if (r3 == null) {
            r3 = new C90634eU[16];
            this.A09 = r3;
        }
        int i2 = this.A04;
        int length = r3.length;
        if (i2 == length) {
            C90634eU[] r1 = new C90634eU[(length << 1)];
            System.arraycopy(r3, 0, r1, 0, length);
            this.A09 = r1;
            r3 = r1;
        }
        int i3 = this.A04;
        this.A04 = i3 + 1;
        r3[i3] = r5;
        A0F(r5);
        return r5.A03;
    }

    public final C90634eU A07(int i2, int i3) {
        int i4 = i2;
        int i5 = (i2 + i3) & Integer.MAX_VALUE;
        for (C90634eU A002 = A00(this, i5); A002 != null; A002 = A002.A01) {
            if (A002.A04 == i2 && A002.A02 == i5 && A002.A05 == ((long) i3)) {
                return A002;
            }
        }
        C89454cD r0 = this.A07;
        r0.A04(i2);
        r0.A05(i3);
        int i6 = this.A01;
        this.A01 = i6 + 1;
        C90634eU r4 = new C90634eU(i6, i4, i5, (long) i3);
        A0F(r4);
        return r4;
    }

    public final C90634eU A08(int i2, long j2) {
        long j3 = j2;
        int i3 = (int) j2;
        int i4 = i2;
        int i5 = (int) (j2 >>> 32);
        int i6 = (i2 + i3 + i5) & Integer.MAX_VALUE;
        for (C90634eU A002 = A00(this, i6); A002 != null; A002 = A002.A01) {
            if (A002.A04 == i2 && A002.A02 == i6 && A002.A05 == j2) {
                return A002;
            }
        }
        int i7 = this.A01;
        C89454cD r4 = this.A07;
        r4.A04(i2);
        int i8 = r4.A00;
        if (i8 + 8 > r4.A01.length) {
            r4.A07(8);
        }
        byte[] bArr = r4.A01;
        int A0F = AnonymousClass3K2.A0F(bArr, i8, i5);
        bArr[A0F] = (byte) i5;
        int A0F2 = AnonymousClass3K2.A0F(bArr, A0F + 1, i3);
        bArr[A0F2] = (byte) i3;
        r4.A00 = A0F2 + 1;
        this.A01 += 2;
        C90634eU r6 = new C90634eU(i7, i4, i6, j3);
        A0F(r6);
        return r6;
    }

    public C90634eU A09(Object obj) {
        int A0D;
        if (!(obj instanceof Integer) && !(obj instanceof Byte)) {
            if (obj instanceof Character) {
                A0D = ((Character) obj).charValue();
            } else if (!(obj instanceof Short)) {
                if (obj instanceof Boolean) {
                    A0D = AnonymousClass000.A1X(obj);
                } else if (obj instanceof Float) {
                    return A07(4, Float.floatToRawIntBits(AnonymousClass000.A04(obj)));
                } else {
                    if (obj instanceof Long) {
                        return A08(5, C13700nu.A01(obj));
                    }
                    if (obj instanceof Double) {
                        return A08(6, Double.doubleToRawLongBits(AnonymousClass3K3.A01(obj)));
                    }
                    if (obj instanceof String) {
                        return A0A((String) obj, 8);
                    }
                    if (obj instanceof C90854ew) {
                        C90854ew r11 = (C90854ew) obj;
                        int i2 = r11.A00;
                        if (i2 == 12 || i2 == 10) {
                            return A0A(r11.A03.substring(r11.A01, r11.A02), 7);
                        }
                        String A062 = r11.A06();
                        return i2 == 11 ? A0A(A062, 16) : A0A(A062, 7);
                    } else if (obj instanceof C87254Wa) {
                        C87254Wa r112 = (C87254Wa) obj;
                        return A0D(r112.A03, r112.A02, r112.A01, r112.A00, r112.A04);
                    } else if (obj instanceof AnonymousClass4WS) {
                        AnonymousClass4WS r113 = (AnonymousClass4WS) obj;
                        return A0B(r113.A01, r113.A00, 17, A0E(r113.A02, r113.A03).A03);
                    } else {
                        throw AnonymousClass000.A0T(AnonymousClass000.A0g("value ", obj));
                    }
                }
            }
            return A07(3, A0D);
        }
        A0D = AnonymousClass000.A0D(obj);
        return A07(3, A0D);
    }

    public final C90634eU A0A(String str, int i2) {
        int A082 = AnonymousClass3K4.A08(str, i2) & Integer.MAX_VALUE;
        for (C90634eU A002 = A00(this, A082); A002 != null; A002 = A002.A01) {
            if (A002.A04 == i2 && A002.A02 == A082 && A002.A08.equals(str)) {
                return A002;
            }
        }
        this.A07.A09(i2, A02(str));
        int i3 = this.A01;
        this.A01 = i3 + 1;
        C90634eU r0 = new C90634eU(str, i3, i2, A082);
        A0F(r0);
        return r0;
    }

    public final C90634eU A0B(String str, String str2, int i2, int i3) {
        String str3 = str;
        String str4 = str2;
        int i4 = i3;
        int i5 = i2;
        int hashCode = (i2 + (str.hashCode() * str4.hashCode() * (i3 + 1))) & Integer.MAX_VALUE;
        for (C90634eU A002 = A00(this, hashCode); A002 != null; A002 = A002.A01) {
            if (A002.A04 == i5 && A002.A02 == hashCode && A002.A05 == ((long) i4) && A002.A06.equals(str) && A002.A08.equals(str4)) {
                return A002;
            }
        }
        this.A07.A0A(i5, i4, A05(str, str4));
        int i6 = this.A01;
        this.A01 = i6 + 1;
        C90634eU r5 = new C90634eU((String) null, str3, str4, i6, i5, hashCode, (long) i4);
        A0F(r5);
        return r5;
    }

    public final C90634eU A0C(String str, String str2, String str3, int i2) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = i2;
        int hashCode = (i2 + (str.hashCode() * str2.hashCode() * str3.hashCode())) & Integer.MAX_VALUE;
        for (C90634eU A002 = A00(this, hashCode); A002 != null; A002 = A002.A01) {
            if (A002.A04 == i2 && A002.A02 == hashCode && A002.A07.equals(str) && A002.A06.equals(str2) && A002.A08.equals(str3)) {
                return A002;
            }
        }
        this.A07.A0A(i2, A0A(str, 7).A03, A05(str2, str3));
        int i4 = this.A01;
        this.A01 = i4 + 1;
        C90634eU r2 = new C90634eU(str4, str5, str6, i4, i3, hashCode, 0);
        A0F(r2);
        return r2;
    }

    public C90634eU A0D(String str, String str2, String str3, int i2, boolean z2) {
        int i3;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i4 = i2;
        int hashCode = ((str4.hashCode() * str5.hashCode() * str6.hashCode() * i2) + 15) & Integer.MAX_VALUE;
        for (C90634eU A002 = A00(this, hashCode); A002 != null; A002 = A002.A01) {
            if (A002.A04 == 15 && A002.A02 == hashCode && A002.A05 == ((long) i4) && A002.A07.equals(str4) && A002.A06.equals(str5) && A002.A08.equals(str6)) {
                return A002;
            }
        }
        C89454cD r7 = this.A07;
        if (i4 <= 4) {
            i3 = 9;
        } else {
            i3 = 10;
            if (z2) {
                i3 = 11;
            }
        }
        int i5 = A0C(str4, str5, str6, i3).A03;
        int i6 = r7.A00;
        if (i6 + 4 > r7.A01.length) {
            r7.A07(4);
        }
        byte[] bArr = r7.A01;
        bArr[i6] = (byte) 15;
        C89454cD.A03(r7, bArr, i6 + 1, i4, i5);
        int i7 = this.A01;
        this.A01 = i7 + 1;
        C90634eU r8 = new C90634eU(str4, str5, str6, i7, 15, hashCode, (long) i4);
        A0F(r8);
        return r8;
    }

    public C90634eU A0E(C87254Wa r17, Object... objArr) {
        C89454cD r7 = this.A06;
        if (r7 == null) {
            r7 = C89454cD.A00();
            this.A06 = r7;
        }
        int[] iArr = new int[r4];
        for (int i2 = 0; i2 < r4; i2++) {
            iArr[i2] = A09(objArr[i2]).A03;
        }
        int i3 = r7.A00;
        C87254Wa r8 = r17;
        r7.A06(A0D(r8.A03, r8.A02, r8.A01, r8.A00, r8.A04).A03);
        r7.A06(r4);
        for (int i4 = 0; i4 < r4; i4++) {
            r7.A06(iArr[i4]);
        }
        int i5 = r7.A00 - i3;
        int hashCode = r8.hashCode();
        for (Object hashCode2 : objArr) {
            hashCode ^= hashCode2.hashCode();
        }
        int i6 = hashCode & Integer.MAX_VALUE;
        C89454cD r6 = this.A06;
        byte[] bArr = r6.A01;
        for (C90634eU A002 = A00(this, i6); A002 != null; A002 = A002.A01) {
            if (A002.A04 == 64 && A002.A02 == i6) {
                int i7 = (int) A002.A05;
                int i8 = 0;
                while (i8 < i5) {
                    if (bArr[i3 + i8] == bArr[i7 + i8]) {
                        i8++;
                    }
                }
                r6.A00 = i3;
                return A002;
            }
        }
        int i9 = this.A00;
        this.A00 = i9 + 1;
        C90634eU r10 = new C90634eU(i9, 64, i6, (long) i3);
        A0F(r10);
        return r10;
    }

    public final void A0F(C90634eU r10) {
        int i2 = this.A02;
        C90634eU[] r7 = this.A08;
        int length = r7.length;
        if (i2 > ((length * 3) >> 2)) {
            int i3 = (length << 1) + 1;
            C90634eU[] r5 = new C90634eU[i3];
            for (int i4 = length - 1; i4 >= 0; i4--) {
                C90634eU r3 = r7[i4];
                while (r3 != null) {
                    int i5 = r3.A02 % i3;
                    C90634eU r1 = r3.A01;
                    r3.A01 = r5[i5];
                    r5[i5] = r3;
                    r3 = r1;
                }
            }
            this.A08 = r5;
            r7 = r5;
        }
        this.A02 = i2 + 1;
        int length2 = r10.A02 % r7.length;
        r10.A01 = r7[length2];
        r7[length2] = r10;
    }
}
