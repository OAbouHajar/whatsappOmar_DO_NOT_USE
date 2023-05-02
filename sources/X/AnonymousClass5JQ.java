package X;

/* renamed from: X.5JQ  reason: invalid class name */
public class AnonymousClass5JQ extends AnonymousClass5AC {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int[] A06 = new int[16];

    public AnonymousClass5JQ() {
        reset();
    }

    public AnonymousClass5JQ(AnonymousClass5JQ r2) {
        super(r2);
        A0M(r2);
    }

    public static int A0D(int i2, int i3, int i4) {
        int i5 = i2 + i3;
        return ((i5 >>> 26) | (i5 << 6)) + i4;
    }

    public static int A0E(int i2, int i3, int i4) {
        int i5 = i2 + i3;
        return ((i5 >>> 25) | (i5 << 7)) + i4;
    }

    public static int A0F(int i2, int i3, int i4) {
        int i5 = i2 + i3;
        return ((i5 >>> 24) | (i5 << 8)) + i4;
    }

    public static int A0G(int i2, int i3, int i4) {
        int i5 = i2 + i3;
        return ((i5 >>> 17) | (i5 << 15)) + i4;
    }

    public static int A0H(int i2, int i3, int i4, int i5) {
        int i6 = i2 + i3 + i4;
        return ((i6 >>> 27) | (i6 << 5)) + i5;
    }

    public static int A0I(int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2 + i3 + i4 + i5;
        return ((i7 >>> 19) | (i7 << 13)) + i6;
    }

    public static int A0J(int i2, int i3, int i4, int i5, int i6) {
        return i5 + (i4 ^ (i3 | (i2 ^ -1))) + i6;
    }

    public static final void A0K(byte[] bArr, int i2, int i3) {
        bArr[AnonymousClass3K4.A0C(bArr, i2, i3)] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 3] = (byte) (i2 >>> 24);
    }

    public void A0L() {
        int i2 = this.A00;
        int i3 = this.A01;
        int i4 = this.A02;
        int i5 = this.A03;
        int i6 = this.A04;
        int[] iArr = this.A06;
        int i7 = iArr[0];
        int i8 = ((i3 ^ i4) ^ i5) + i2 + i7;
        int A07 = AnonymousClass5AC.A07(i8, 21, i8 << 11, i6);
        int A002 = AnonymousClass5AC.A00(i4);
        int i9 = iArr[1];
        int i10 = ((A07 ^ i3) ^ A002) + i6 + i9;
        int A072 = AnonymousClass5AC.A07(i10, 18, i10 << 14, i5);
        int A003 = AnonymousClass5AC.A00(i3);
        int i11 = iArr[2];
        int A0G = A0G(((A072 ^ A07) ^ A003) + i5, i11, A002);
        int A004 = AnonymousClass5AC.A00(A07);
        int A062 = AnonymousClass5AC.A06(A0G, A072, A004, A002);
        int i12 = iArr[3];
        int i13 = A062 + i12;
        int A073 = AnonymousClass5AC.A07(i13, 20, i13 << 12, A003);
        int A005 = AnonymousClass5AC.A00(A072);
        int A063 = AnonymousClass5AC.A06(A073, A0G, A005, A003);
        int i14 = iArr[4];
        int i15 = A063 + i14;
        int A074 = AnonymousClass5AC.A07(i15, 27, i15 << 5, A004);
        int A006 = AnonymousClass5AC.A00(A0G);
        int A064 = AnonymousClass5AC.A06(A074, A073, A006, A004);
        int i16 = iArr[5];
        int i17 = A064 + i16;
        int A075 = AnonymousClass5AC.A07(i17, 24, i17 << 8, A005);
        int A007 = AnonymousClass5AC.A00(A073);
        int A065 = AnonymousClass5AC.A06(A075, A074, A007, A005);
        int i18 = iArr[6];
        int i19 = A065 + i18;
        int A076 = AnonymousClass5AC.A07(i19, 25, i19 << 7, A006);
        int A008 = AnonymousClass5AC.A00(A074);
        int A066 = AnonymousClass5AC.A06(A076, A075, A008, A006);
        int i20 = iArr[7];
        int i21 = A066 + i20;
        int A077 = AnonymousClass5AC.A07(i21, 23, i21 << 9, A007);
        int A009 = AnonymousClass5AC.A00(A075);
        int A067 = AnonymousClass5AC.A06(A077, A076, A009, A007);
        int i22 = iArr[8];
        int A032 = AnonymousClass5AC.A03(A067, i22, A008);
        int A0010 = AnonymousClass5AC.A00(A076);
        int A068 = AnonymousClass5AC.A06(A032, A077, A0010, A008);
        int i23 = iArr[9];
        int i24 = A068 + i23;
        int A078 = AnonymousClass5AC.A07(i24, 19, i24 << 13, A009);
        int A0011 = AnonymousClass5AC.A00(A077);
        int A069 = AnonymousClass5AC.A06(A078, A032, A0011, A009);
        int i25 = iArr[10];
        int i26 = A069 + i25;
        int A079 = AnonymousClass5AC.A07(i26, 18, i26 << 14, A0010);
        int A0012 = AnonymousClass5AC.A00(A032);
        int A0610 = AnonymousClass5AC.A06(A079, A078, A0012, A0010);
        int i27 = iArr[11];
        int A0G2 = A0G(A0610, i27, A0011);
        int A0013 = AnonymousClass5AC.A00(A078);
        int A0611 = AnonymousClass5AC.A06(A0G2, A079, A0013, A0011);
        int i28 = iArr[12];
        int A0D = A0D(A0611, i28, A0012);
        int A0014 = AnonymousClass5AC.A00(A079);
        int A0612 = AnonymousClass5AC.A06(A0D, A0G2, A0014, A0012);
        int i29 = iArr[13];
        int A0E = A0E(A0612, i29, A0013);
        int A0015 = AnonymousClass5AC.A00(A0G2);
        int A0613 = AnonymousClass5AC.A06(A0E, A0D, A0015, A0013);
        int i30 = iArr[14];
        int A042 = AnonymousClass5AC.A04(A0613, i30, A0014);
        int A0016 = AnonymousClass5AC.A00(A0D);
        int A0614 = AnonymousClass5AC.A06(A042, A0E, A0016, A0014);
        int i31 = iArr[15];
        int i32 = A0614 + i31;
        int A0710 = AnonymousClass5AC.A07(i32, 24, i32 << 8, A0015);
        int A0017 = AnonymousClass5AC.A00(A0E);
        int i33 = i5;
        int A0J = A0J(i33, i4, i3, i2, i16) + 1352829926;
        int i34 = i6;
        int A0711 = AnonymousClass5AC.A07(A0J, 24, A0J << 8, i34);
        int A043 = AnonymousClass5AC.A04(A0J(A002, i3, A0711, i34, i30), 1352829926, i33);
        int A044 = AnonymousClass5AC.A04(A0J(A003, A0711, A043, i33, i20), 1352829926, A002);
        int A0018 = AnonymousClass5AC.A00(A0711);
        int A033 = AnonymousClass5AC.A03(A002 + (((A0018 ^ -1) | A043) ^ A044) + i7, 1352829926, A003);
        int A0019 = AnonymousClass5AC.A00(A043);
        int A0I = A0I(A003, A033 ^ ((A0019 ^ -1) | A044), i23, 1352829926, A0018);
        int A0020 = AnonymousClass5AC.A00(A044);
        int A0J2 = A0J(A0020, A033, A0I, A0018, i11) + 1352829926;
        int A0712 = AnonymousClass5AC.A07(A0J2, 17, A0J2 << 15, A0019);
        int A0021 = AnonymousClass5AC.A00(A033);
        int A0J3 = A0J(A0021, A0I, A0712, A0019, i27) + 1352829926;
        int A0713 = AnonymousClass5AC.A07(A0J3, 17, A0J3 << 15, A0020);
        int A0022 = AnonymousClass5AC.A00(A0I);
        int A0H = A0H(A0020 + (((A0022 ^ -1) | A0712) ^ A0713), i14, 1352829926, A0021);
        int A0023 = AnonymousClass5AC.A00(A0712);
        int A0E2 = A0E(A0J(A0023, A0713, A0H, A0021, i29), 1352829926, A0022);
        int A0024 = AnonymousClass5AC.A00(A0713);
        int A0E3 = A0E(A0J(A0024, A0H, A0E2, A0022, i18), 1352829926, A0023);
        int A0025 = AnonymousClass5AC.A00(A0H);
        int A0F = A0F(A0J(A0025, A0E2, A0E3, A0023, i31), 1352829926, A0024);
        int A0026 = AnonymousClass5AC.A00(A0E2);
        int A034 = AnonymousClass5AC.A03(A0J(A0026, A0E3, A0F, A0024, i22), 1352829926, A0025);
        int A0027 = AnonymousClass5AC.A00(A0E3);
        int A012 = AnonymousClass5AC.A01(A0J(A0027, A0F, A034, A0025, i9), 1352829926, A0026);
        int A0028 = AnonymousClass5AC.A00(A0F);
        int A013 = AnonymousClass5AC.A01(A0J(A0028, A034, A012, A0026, i25), 1352829926, A0027);
        int A0029 = AnonymousClass5AC.A00(A034);
        int A022 = AnonymousClass5AC.A02(A0J(A0029, A012, A013, A0027, i12), 1352829926, A0028);
        int A0030 = AnonymousClass5AC.A00(A012);
        int A0D2 = A0D(A0J(A0030, A013, A022, A0028, i28), 1352829926, A0029);
        int A0031 = AnonymousClass5AC.A00(A013);
        int A0E4 = A0E(AnonymousClass5AC.A05(A042, A0710, A0017, A0015) + i20, 1518500249, A0016);
        int A0032 = AnonymousClass5AC.A00(A042);
        int A0D3 = A0D(AnonymousClass5AC.A05(A0710, A0E4, A0032, A0016) + i14, 1518500249, A0017);
        int A0033 = AnonymousClass5AC.A00(A0710);
        int A0F2 = A0F(AnonymousClass5AC.A05(A0E4, A0D3, A0033, A0017) + i29, 1518500249, A0032);
        int A0034 = AnonymousClass5AC.A00(A0E4);
        int A0I2 = A0I(A0032, ((A0F2 ^ -1) & A0034) | (A0D3 & A0F2), i9, 1518500249, A0033);
        int A0035 = AnonymousClass5AC.A00(A0D3);
        int A035 = AnonymousClass5AC.A03(AnonymousClass5AC.A05(A0F2, A0I2, A0035, A0033) + i25, 1518500249, A0034);
        int A0036 = AnonymousClass5AC.A00(A0F2);
        int A045 = AnonymousClass5AC.A04(AnonymousClass5AC.A05(A0I2, A035, A0036, A0034) + i18, 1518500249, A0035);
        int A0037 = AnonymousClass5AC.A00(A0I2);
        int A0E5 = A0E(AnonymousClass5AC.A05(A035, A045, A0037, A0035) + i31, 1518500249, A0036);
        int A0038 = AnonymousClass5AC.A00(A035);
        int A052 = AnonymousClass5AC.A05(A045, A0E5, A0038, A0036) + i12 + 1518500249;
        int A0714 = AnonymousClass5AC.A07(A052, 17, A052 << 15, A0037);
        int A0039 = AnonymousClass5AC.A00(A045);
        int A0E6 = A0E(AnonymousClass5AC.A05(A0E5, A0714, A0039, A0037) + i28, 1518500249, A0038);
        int A0040 = AnonymousClass5AC.A00(A0E5);
        int A023 = AnonymousClass5AC.A02(AnonymousClass5AC.A05(A0714, A0E6, A0040, A0038) + i7, 1518500249, A0039);
        int A0041 = AnonymousClass5AC.A00(A0714);
        int A053 = AnonymousClass5AC.A05(A0E6, A023, A0041, A0039) + i23 + 1518500249;
        int A0715 = AnonymousClass5AC.A07(A053, 17, A053 << 15, A0040);
        int A0042 = AnonymousClass5AC.A00(A0E6);
        int A046 = AnonymousClass5AC.A04(AnonymousClass5AC.A05(A023, A0715, A0042, A0040) + i16, 1518500249, A0041);
        int A0043 = AnonymousClass5AC.A00(A023);
        int A036 = AnonymousClass5AC.A03(AnonymousClass5AC.A05(A0715, A046, A0043, A0041) + i11, 1518500249, A0042);
        int A0044 = AnonymousClass5AC.A00(A0715);
        int A0E7 = A0E(AnonymousClass5AC.A05(A046, A036, A0044, A0042) + i30, 1518500249, A0043);
        int A0045 = AnonymousClass5AC.A00(A046);
        int i35 = i27;
        int A0I3 = A0I(A0043, ((A0E7 ^ -1) & A0045) | (A036 & A0E7), i35, 1518500249, A0044);
        int A0046 = AnonymousClass5AC.A00(A036);
        int i36 = A0I3 ^ -1;
        int A024 = AnonymousClass5AC.A02(A0044 + ((i36 & A0046) | (A0E7 & A0I3)) + i22, 1518500249, A0045);
        int A0047 = AnonymousClass5AC.A00(A0E7);
        int A047 = AnonymousClass5AC.A04(AnonymousClass5AC.A08(A0D2, A0031, A022, A0029, i18), 1548603684, A0030);
        int A0048 = AnonymousClass5AC.A00(A022);
        int A08 = AnonymousClass5AC.A08(A047, A0048, A0D2, A0030, i35) + 1548603684;
        int A0716 = AnonymousClass5AC.A07(A08, 19, A08 << 13, A0031);
        int A0049 = AnonymousClass5AC.A00(A0D2);
        int A0G3 = A0G(AnonymousClass5AC.A08(A0716, A0049, A047, A0031, i12), 1548603684, A0048);
        int A0050 = AnonymousClass5AC.A00(A047);
        int A0E8 = A0E(AnonymousClass5AC.A08(A0G3, A0050, A0716, A0048, i20), 1548603684, A0049);
        int A0051 = AnonymousClass5AC.A00(A0716);
        int A025 = AnonymousClass5AC.A02(AnonymousClass5AC.A08(A0E8, A0051, A0G3, A0049, i7), 1548603684, A0050);
        int A0052 = AnonymousClass5AC.A00(A0G3);
        int A0F3 = A0F(AnonymousClass5AC.A08(A025, A0052, A0E8, A0050, i29), 1548603684, A0051);
        int A0053 = AnonymousClass5AC.A00(A0E8);
        int A048 = AnonymousClass5AC.A04(AnonymousClass5AC.A08(A0F3, A0053, A025, A0051, i16), 1548603684, A0052);
        int A0054 = AnonymousClass5AC.A00(A025);
        int A037 = AnonymousClass5AC.A03(AnonymousClass5AC.A08(A048, A0054, A0F3, A0052, i25), 1548603684, A0053);
        int A0055 = AnonymousClass5AC.A00(A0F3);
        int A0E9 = A0E(AnonymousClass5AC.A08(A037, A0055, A048, A0053, i30), 1548603684, A0054);
        int A0056 = AnonymousClass5AC.A00(A048);
        int A0E10 = A0E(AnonymousClass5AC.A08(A0E9, A0056, A037, A0054, i31), 1548603684, A0055);
        int A0057 = AnonymousClass5AC.A00(A037);
        int A026 = AnonymousClass5AC.A02(AnonymousClass5AC.A08(A0E10, A0057, A0E9, A0055, i22), 1548603684, A0056);
        int A0058 = AnonymousClass5AC.A00(A0E9);
        int A0E11 = A0E(AnonymousClass5AC.A08(A026, A0058, A0E10, A0056, i28), 1548603684, A0057);
        int A0059 = AnonymousClass5AC.A00(A0E10);
        int A0D4 = A0D(AnonymousClass5AC.A08(A0E11, A0059, A026, A0057, i14), 1548603684, A0058);
        int A0060 = AnonymousClass5AC.A00(A026);
        int A0G4 = A0G(AnonymousClass5AC.A08(A0D4, A0060, A0E11, A0058, i23), 1548603684, A0059);
        int A0061 = AnonymousClass5AC.A00(A0E11);
        int A082 = AnonymousClass5AC.A08(A0G4, A0061, A0D4, A0059, i9) + 1548603684;
        int A0717 = AnonymousClass5AC.A07(A082, 19, A082 << 13, A0060);
        int A0062 = AnonymousClass5AC.A00(A0D4);
        int A038 = AnonymousClass5AC.A03(AnonymousClass5AC.A08(A0717, A0062, A0G4, A0060, i11), 1548603684, A0061);
        int A0063 = AnonymousClass5AC.A00(A0G4);
        int A039 = AnonymousClass5AC.A03(A0045 + ((A024 | i36) ^ A0047) + i12, 1859775393, A0046);
        int A0064 = AnonymousClass5AC.A00(A0I3);
        int A0I4 = A0I(A0046, (A039 | (A024 ^ -1)) ^ A0064, i25, 1859775393, A0047);
        int A0065 = AnonymousClass5AC.A00(A024);
        int A0D5 = A0D(AnonymousClass5AC.A09(A039, A0I4, A0065, A0047, i30), 1859775393, A0064);
        int A0066 = AnonymousClass5AC.A00(A039);
        int A0E12 = A0E(AnonymousClass5AC.A09(A0I4, A0D5, A0066, A0064, i14), 1859775393, A0065);
        int A0067 = AnonymousClass5AC.A00(A0I4);
        int A014 = AnonymousClass5AC.A01(AnonymousClass5AC.A09(A0D5, A0E12, A0067, A0065, i23), 1859775393, A0066);
        int A0068 = AnonymousClass5AC.A00(A0D5);
        int A049 = AnonymousClass5AC.A04(AnonymousClass5AC.A09(A0E12, A014, A0068, A0066, i31), 1859775393, A0067);
        int A0069 = AnonymousClass5AC.A00(A0E12);
        int A0I5 = A0I(A0067, (A049 | (A014 ^ -1)) ^ A0069, i22, 1859775393, A0068);
        int A0070 = AnonymousClass5AC.A00(A014);
        int A0G5 = A0G(AnonymousClass5AC.A09(A049, A0I5, A0070, A0068, i9), 1859775393, A0069);
        int A0071 = AnonymousClass5AC.A00(A049);
        int A015 = AnonymousClass5AC.A01(AnonymousClass5AC.A09(A0I5, A0G5, A0071, A0069, i11), 1859775393, A0070);
        int A0072 = AnonymousClass5AC.A00(A0I5);
        int A0F4 = A0F(AnonymousClass5AC.A09(A0G5, A015, A0072, A0070, i20), 1859775393, A0071);
        int A0073 = AnonymousClass5AC.A00(A0G5);
        int A0I6 = A0I(A0071, (A0F4 | (A015 ^ -1)) ^ A0073, i7, 1859775393, A0072);
        int A0074 = AnonymousClass5AC.A00(A015);
        int A0D6 = A0D(AnonymousClass5AC.A09(A0F4, A0I6, A0074, A0072, i18), 1859775393, A0073);
        int A0075 = AnonymousClass5AC.A00(A0F4);
        int A0H2 = A0H(A0073 + (((A0I6 ^ -1) | A0D6) ^ A0075), i29, 1859775393, A0074);
        int A0076 = AnonymousClass5AC.A00(A0I6);
        int A027 = AnonymousClass5AC.A02(AnonymousClass5AC.A09(A0D6, A0H2, A0076, A0074, i27), 1859775393, A0075);
        int A0077 = AnonymousClass5AC.A00(A0D6);
        int A0E13 = A0E(AnonymousClass5AC.A09(A0H2, A027, A0077, A0075, i16), 1859775393, A0076);
        int A0078 = AnonymousClass5AC.A00(A0H2);
        int A0H3 = A0H(A0076 + (((A027 ^ -1) | A0E13) ^ A0078), i28, 1859775393, A0077);
        int A0079 = AnonymousClass5AC.A00(A027);
        int A0410 = AnonymousClass5AC.A04(AnonymousClass5AC.A09(A0717, A038, A0063, A0061, i31), 1836072691, A0062);
        int A0080 = AnonymousClass5AC.A00(A0717);
        int A0E14 = A0E(AnonymousClass5AC.A09(A038, A0410, A0080, A0062, i16), 1836072691, A0063);
        int A0081 = AnonymousClass5AC.A00(A038);
        int A0G6 = A0G(AnonymousClass5AC.A09(A0410, A0E14, A0081, A0063, i9), 1836072691, A0080);
        int A0082 = AnonymousClass5AC.A00(A0410);
        int A0310 = AnonymousClass5AC.A03(AnonymousClass5AC.A09(A0E14, A0G6, A0082, A0080, i12), 1836072691, A0081);
        int A0083 = AnonymousClass5AC.A00(A0E14);
        int A0F5 = A0F(AnonymousClass5AC.A09(A0G6, A0310, A0083, A0081, i20), 1836072691, A0082);
        int A0084 = AnonymousClass5AC.A00(A0G6);
        int A0D7 = A0D(AnonymousClass5AC.A09(A0310, A0F5, A0084, A0082, i30), 1836072691, A0083);
        int A0085 = AnonymousClass5AC.A00(A0310);
        int A0D8 = A0D(AnonymousClass5AC.A09(A0F5, A0D7, A0085, A0083, i18), 1836072691, A0084);
        int A0086 = AnonymousClass5AC.A00(A0F5);
        int A016 = AnonymousClass5AC.A01(AnonymousClass5AC.A09(A0D7, A0D8, A0086, A0084, i23), 1836072691, A0085);
        int A0087 = AnonymousClass5AC.A00(A0D7);
        int A028 = AnonymousClass5AC.A02(AnonymousClass5AC.A09(A0D8, A016, A0087, A0085, i27), 1836072691, A0086);
        int A0088 = AnonymousClass5AC.A00(A0D8);
        int A0I7 = A0I(A0086, (A028 | (A016 ^ -1)) ^ A0088, i22, 1836072691, A0087);
        int A0089 = AnonymousClass5AC.A00(A016);
        int A0H4 = A0H(A0087 + (((A028 ^ -1) | A0I7) ^ A0089), i28, 1836072691, A0088);
        int A0090 = AnonymousClass5AC.A00(A028);
        int A017 = AnonymousClass5AC.A01(AnonymousClass5AC.A09(A0I7, A0H4, A0090, A0088, i11), 1836072691, A0089);
        int A0091 = AnonymousClass5AC.A00(A0I7);
        int A0I8 = A0I(A0089, (A017 | (A0H4 ^ -1)) ^ A0091, i25, 1836072691, A0090);
        int A0092 = AnonymousClass5AC.A00(A0H4);
        int A0I9 = A0I(A0090, ((A017 ^ -1) | A0I8) ^ A0092, i7, 1836072691, A0091);
        int A0093 = AnonymousClass5AC.A00(A017);
        int A0E15 = A0E(AnonymousClass5AC.A09(A0I8, A0I9, A0093, A0091, i14), 1836072691, A0092);
        int A0094 = AnonymousClass5AC.A00(A0I8);
        int A0H5 = A0H(A0092 + (((A0I9 ^ -1) | A0E15) ^ A0094), i29, 1836072691, A0093);
        int A0095 = AnonymousClass5AC.A00(A0I9);
        int A0311 = AnonymousClass5AC.A03(AnonymousClass5AC.A08(A0H3, A0079, A0E13, A0077, i9), -1894007588, A0078);
        int A0096 = AnonymousClass5AC.A00(A0E13);
        int A029 = AnonymousClass5AC.A02(AnonymousClass5AC.A08(A0311, A0096, A0H3, A0078, i23), -1894007588, A0079);
        int A0097 = AnonymousClass5AC.A00(A0H3);
        int A018 = AnonymousClass5AC.A01(AnonymousClass5AC.A08(A029, A0097, A0311, A0079, i27), -1894007588, A0096);
        int A0098 = AnonymousClass5AC.A00(A0311);
        int A0G7 = A0G(AnonymousClass5AC.A08(A018, A0098, A029, A0096, i25), -1894007588, A0097);
        int A0099 = AnonymousClass5AC.A00(A029);
        int A019 = AnonymousClass5AC.A01(AnonymousClass5AC.A08(A0G7, A0099, A018, A0097, i7), -1894007588, A0098);
        int A00100 = AnonymousClass5AC.A00(A018);
        int A0G8 = A0G(AnonymousClass5AC.A08(A019, A00100, A0G7, A0098, i22), -1894007588, A0099);
        int A00101 = AnonymousClass5AC.A00(A0G7);
        int A0411 = AnonymousClass5AC.A04(AnonymousClass5AC.A08(A0G8, A00101, A019, A0099, i28), -1894007588, A00100);
        int A00102 = AnonymousClass5AC.A00(A019);
        int A0F6 = A0F(AnonymousClass5AC.A08(A0411, A00102, A0G8, A00100, i14), -1894007588, A00101);
        int A00103 = AnonymousClass5AC.A00(A0G8);
        int A0412 = AnonymousClass5AC.A04(AnonymousClass5AC.A08(A0F6, A00103, A0411, A00101, i29), -1894007588, A00102);
        int A00104 = AnonymousClass5AC.A00(A0411);
        int A0110 = AnonymousClass5AC.A01(AnonymousClass5AC.A08(A0412, A00104, A0F6, A00102, i12), -1894007588, A00103);
        int A00105 = AnonymousClass5AC.A00(A0F6);
        int A083 = AnonymousClass5AC.A08(A0110, A00105, A0412, A00103, i20) - 1894007588;
        int A0718 = AnonymousClass5AC.A07(A083, 27, A083 << 5, A00104);
        int A00106 = AnonymousClass5AC.A00(A0412);
        int A0D9 = A0D(AnonymousClass5AC.A08(A0718, A00106, A0110, A00104, i31), -1894007588, A00105);
        int A00107 = AnonymousClass5AC.A00(A0110);
        int A0F7 = A0F(AnonymousClass5AC.A08(A0D9, A00107, A0718, A00105, i30), -1894007588, A00106);
        int A00108 = AnonymousClass5AC.A00(A0718);
        int A0D10 = A0D(AnonymousClass5AC.A08(A0F7, A00108, A0D9, A00106, i16), -1894007588, A00107);
        int A00109 = AnonymousClass5AC.A00(A0D9);
        int A084 = AnonymousClass5AC.A08(A0D10, A00109, A0F7, A00107, i18) - 1894007588;
        int A0719 = AnonymousClass5AC.A07(A084, 27, A084 << 5, A00108);
        int A00110 = AnonymousClass5AC.A00(A0F7);
        int A0210 = AnonymousClass5AC.A02(AnonymousClass5AC.A08(A0719, A00110, A0D10, A00108, i11), -1894007588, A00109);
        int A00111 = AnonymousClass5AC.A00(A0D10);
        int A0G9 = A0G(AnonymousClass5AC.A05(A0E15, A0H5, A0095, A0093) + i22, 2053994217, A0094);
        int A00112 = AnonymousClass5AC.A00(A0E15);
        int A0H6 = A0H(AnonymousClass5AC.A05(A0H5, A0G9, A00112, A0094), i18, 2053994217, A0095);
        int A00113 = AnonymousClass5AC.A00(A0H5);
        int A0F8 = A0F(AnonymousClass5AC.A05(A0G9, A0H6, A00113, A0095) + i14, 2053994217, A00112);
        int A00114 = AnonymousClass5AC.A00(A0G9);
        int A0312 = AnonymousClass5AC.A03(AnonymousClass5AC.A05(A0H6, A0F8, A00114, A00112) + i9, 2053994217, A00113);
        int A00115 = AnonymousClass5AC.A00(A0H6);
        int A0111 = AnonymousClass5AC.A01(AnonymousClass5AC.A05(A0F8, A0312, A00115, A00113) + i12, 2053994217, A00114);
        int A00116 = AnonymousClass5AC.A00(A0F8);
        int A0112 = AnonymousClass5AC.A01(AnonymousClass5AC.A05(A0312, A0111, A00116, A00114) + i27, 2053994217, A00115);
        int A00117 = AnonymousClass5AC.A00(A0312);
        int A0D11 = A0D(AnonymousClass5AC.A05(A0111, A0112, A00117, A00115) + i31, 2053994217, A00116);
        int A00118 = AnonymousClass5AC.A00(A0111);
        int A0113 = AnonymousClass5AC.A01(AnonymousClass5AC.A05(A0112, A0D11, A00118, A00116) + i7, 2053994217, A00117);
        int A00119 = AnonymousClass5AC.A00(A0112);
        int A0D12 = A0D(AnonymousClass5AC.A05(A0D11, A0113, A00119, A00117) + i16, 2053994217, A00118);
        int A00120 = AnonymousClass5AC.A00(A0D11);
        int A0413 = AnonymousClass5AC.A04(AnonymousClass5AC.A05(A0113, A0D12, A00120, A00118) + i28, 2053994217, A00119);
        int A00121 = AnonymousClass5AC.A00(A0113);
        int A0211 = AnonymousClass5AC.A02(AnonymousClass5AC.A05(A0D12, A0413, A00121, A00119) + i11, 2053994217, A00120);
        int A00122 = AnonymousClass5AC.A00(A0D12);
        int A0414 = AnonymousClass5AC.A04(AnonymousClass5AC.A05(A0413, A0211, A00122, A00120) + i29, 2053994217, A00121);
        int A00123 = AnonymousClass5AC.A00(A0413);
        int A0212 = AnonymousClass5AC.A02(AnonymousClass5AC.A05(A0211, A0414, A00123, A00121) + i23, 2053994217, A00122);
        int A00124 = AnonymousClass5AC.A00(A0211);
        int A0H7 = A0H(AnonymousClass5AC.A05(A0414, A0212, A00124, A00122), i20, 2053994217, A00123);
        int A00125 = AnonymousClass5AC.A00(A0414);
        int A0G10 = A0G(AnonymousClass5AC.A05(A0212, A0H7, A00125, A00123) + i25, 2053994217, A00124);
        int A00126 = AnonymousClass5AC.A00(A0212);
        int A0F9 = A0F(AnonymousClass5AC.A05(A0H7, A0G10, A00126, A00124) + i30, 2053994217, A00125);
        int A00127 = AnonymousClass5AC.A00(A0H7);
        int A0415 = AnonymousClass5AC.A04(A0J(A00111, A0719, A0210, A00109, i14), -1454113458, A00110);
        int A00128 = AnonymousClass5AC.A00(A0719);
        int A0G11 = A0G(A0J(A00128, A0210, A0415, A00110, i7), -1454113458, A00111);
        int A00129 = AnonymousClass5AC.A00(A0210);
        int A0H8 = A0H(A00111 + (((A00129 ^ -1) | A0415) ^ A0G11), i16, -1454113458, A00128);
        int A00130 = AnonymousClass5AC.A00(A0415);
        int A0313 = AnonymousClass5AC.A03(A0J(A00130, A0G11, A0H8, A00128, i23), -1454113458, A00129);
        int A00131 = AnonymousClass5AC.A00(A0G11);
        int A0D13 = A0D(A0J(A00131, A0H8, A0313, A00129, i20), -1454113458, A00130);
        int A00132 = AnonymousClass5AC.A00(A0H8);
        int A0F10 = A0F(A0J(A00132, A0313, A0D13, A00130, i28), -1454113458, A00131);
        int A00133 = AnonymousClass5AC.A00(A0313);
        int A0I10 = A0I(A00131, A0F10 ^ ((A00133 ^ -1) | A0D13), i11, -1454113458, A00132);
        int A00134 = AnonymousClass5AC.A00(A0D13);
        int A0213 = AnonymousClass5AC.A02(A0J(A00134, A0F10, A0I10, A00132, i25), -1454113458, A00133);
        int A00135 = AnonymousClass5AC.A00(A0F10);
        int A0H9 = A0H(A00133 + (((A00135 ^ -1) | A0I10) ^ A0213), i30, -1454113458, A00134);
        int A00136 = AnonymousClass5AC.A00(A0I10);
        int A0214 = AnonymousClass5AC.A02(A0J(A00136, A0213, A0H9, A00134, i9), -1454113458, A00135);
        int A00137 = AnonymousClass5AC.A00(A0213);
        int A0I11 = A0I(A00135, ((A00137 ^ -1) | A0H9) ^ A0214, i12, -1454113458, A00136);
        int A00138 = AnonymousClass5AC.A00(A0H9);
        int A0114 = AnonymousClass5AC.A01(A0J(A00138, A0214, A0I11, A00136, i22), -1454113458, A00137);
        int A00139 = AnonymousClass5AC.A00(A0214);
        int A0314 = AnonymousClass5AC.A03(A0J(A00139, A0I11, A0114, A00137, i27), -1454113458, A00138);
        int A00140 = AnonymousClass5AC.A00(A0I11);
        int A0F11 = A0F(A0J(A00140, A0114, A0314, A00138, i18), -1454113458, A00139);
        int A00141 = AnonymousClass5AC.A00(A0114);
        int A0H10 = A0H(A00139 + (((A00141 ^ -1) | A0314) ^ A0F11), i31, -1454113458, A00140);
        int A00142 = AnonymousClass5AC.A00(A0314);
        int A0D14 = A0D(A0J(A00142, A0F11, A0H10, A00140, i29), -1454113458, A00141);
        int A00143 = AnonymousClass5AC.A00(A0F11);
        int A0F12 = A0F(AnonymousClass5AC.A06(A0F9, A0G10, A00127, A00125), i28, A00126);
        int A00144 = AnonymousClass5AC.A00(A0G10);
        int A0H11 = A0H(A00126, (A0F12 ^ A0F9) ^ A00144, i31, A00127);
        int A00145 = AnonymousClass5AC.A00(A0F9);
        int A0215 = AnonymousClass5AC.A02(AnonymousClass5AC.A06(A0H11, A0F12, A00145, A00127), i25, A00144);
        int A00146 = AnonymousClass5AC.A00(A0F12);
        int A0416 = AnonymousClass5AC.A04(AnonymousClass5AC.A06(A0215, A0H11, A00146, A00144), i14, A00145);
        int A00147 = AnonymousClass5AC.A00(A0H11);
        int A0216 = AnonymousClass5AC.A02(AnonymousClass5AC.A06(A0416, A0215, A00147, A00145), i9, A00146);
        int A00148 = AnonymousClass5AC.A00(A0215);
        int A0H12 = A0H(A00146, (A0216 ^ A0416) ^ A00148, i16, A00147);
        int A00149 = AnonymousClass5AC.A00(A0416);
        int A0115 = AnonymousClass5AC.A01(AnonymousClass5AC.A06(A0H12, A0216, A00149, A00147), i22, A00148);
        int A00150 = AnonymousClass5AC.A00(A0216);
        int A0D15 = A0D(AnonymousClass5AC.A06(A0115, A0H12, A00150, A00148), i20, A00149);
        int A00151 = AnonymousClass5AC.A00(A0H12);
        int A0F13 = A0F(AnonymousClass5AC.A06(A0D15, A0115, A00151, A00149), i18, A00150);
        int A00152 = AnonymousClass5AC.A00(A0115);
        int A0615 = AnonymousClass5AC.A06(A0F13, A0D15, A00152, A00150) + i11;
        int A0720 = AnonymousClass5AC.A07(A0615, 19, A0615 << 13, A00151);
        int A00153 = AnonymousClass5AC.A00(A0D15);
        int A0D16 = A0D(AnonymousClass5AC.A06(A0720, A0F13, A00153, A00151), i29, A00152);
        int A00154 = AnonymousClass5AC.A00(A0F13);
        int A0H13 = A0H(A00152, (A0D16 ^ A0720) ^ A00154, i30, A00153);
        int A00155 = AnonymousClass5AC.A00(A0720);
        int A0G12 = A0G(AnonymousClass5AC.A06(A0H13, A0D16, A00155, A00153), i7, A00154);
        int A00156 = AnonymousClass5AC.A00(A0D16);
        int A0616 = AnonymousClass5AC.A06(A0G12, A0H13, A00156, A00154) + i12;
        int A0721 = AnonymousClass5AC.A07(A0616, 19, A0616 << 13, A00155);
        int A00157 = AnonymousClass5AC.A00(A0H13);
        int A0315 = AnonymousClass5AC.A03(AnonymousClass5AC.A06(A0721, A0G12, A00157, A00155), i23, A00156);
        int A00158 = AnonymousClass5AC.A00(A0G12);
        int A0316 = AnonymousClass5AC.A03(AnonymousClass5AC.A06(A0315, A0721, A00158, A00156), i27, A00157);
        int A00159 = AnonymousClass5AC.A00(A0721) + A0H10 + i3;
        this.A01 = i4 + A00143 + A00158;
        this.A02 = i5 + A00142 + A00157;
        this.A03 = i6 + A00141 + A0316;
        this.A04 = i2 + A0D14 + A0315;
        this.A00 = A00159;
        this.A05 = 0;
        for (int i37 = 0; i37 != iArr.length; i37++) {
            iArr[i37] = 0;
        }
    }

    public final void A0M(AnonymousClass5JQ r5) {
        super.A0E(r5);
        this.A00 = r5.A00;
        this.A01 = r5.A01;
        this.A02 = r5.A02;
        this.A03 = r5.A03;
        this.A04 = r5.A04;
        int[] iArr = r5.A06;
        System.arraycopy(iArr, 0, this.A06, 0, iArr.length);
        this.A05 = r5.A05;
    }

    public AnonymousClass5SH A6m() {
        return new AnonymousClass5JQ(this);
    }

    public int A8A(byte[] bArr, int i2) {
        A0D();
        A0K(bArr, this.A00, i2);
        A0K(bArr, this.A01, i2 + 4);
        A0K(bArr, this.A02, i2 + 8);
        A0K(bArr, this.A03, i2 + 12);
        A0K(bArr, this.A04, i2 + 16);
        reset();
        return 20;
    }

    public String A9q() {
        return "RIPEMD160";
    }

    public int ABn() {
        return 20;
    }

    public void AcP(AnonymousClass5SH r1) {
        A0M((AnonymousClass5JQ) r1);
    }

    public void reset() {
        super.reset();
        this.A00 = 1732584193;
        this.A01 = -271733879;
        this.A02 = -1732584194;
        this.A03 = 271733878;
        this.A04 = -1009589776;
        this.A05 = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.A06;
            if (i2 != iArr.length) {
                iArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }
}
