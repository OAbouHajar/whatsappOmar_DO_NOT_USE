package X;

/* renamed from: X.5JS  reason: invalid class name */
public class AnonymousClass5JS extends AnonymousClass5AC implements AnonymousClass5NN {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int[] A05 = new int[16];

    public AnonymousClass5JS() {
        reset();
    }

    public AnonymousClass5JS(AnonymousClass5JS r2) {
        super(r2);
        A0M(r2);
    }

    public static final void A0D(byte[] bArr, int i2, int i3) {
        bArr[AnonymousClass3K4.A0C(bArr, i2, i3)] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 3] = (byte) (i2 >>> 24);
    }

    public void A0L() {
        int i2 = this.A00;
        int i3 = this.A01;
        int i4 = this.A02;
        int i5 = this.A03;
        int i6 = i5;
        int A052 = AnonymousClass5AC.A05(i4, i3, i5, i2);
        int[] iArr = this.A05;
        int i7 = iArr[0];
        int i8 = (A052 + i7) - 680876936;
        int A07 = AnonymousClass5AC.A07(i8, 25, i8 << 7, i3);
        int A053 = AnonymousClass5AC.A05(i3, A07, i4, i6);
        int i9 = iArr[1];
        int i10 = (A053 + i9) - 389564586;
        int A072 = AnonymousClass5AC.A07(i10, 20, i10 << 12, A07);
        int A054 = AnonymousClass5AC.A05(A07, A072, i3, i4);
        int i11 = iArr[2];
        int i12 = A054 + i11 + 606105819;
        int A073 = AnonymousClass5AC.A07(i12, 15, i12 << 17, A072);
        int A055 = AnonymousClass5AC.A05(A072, A073, A07, i3);
        int i13 = iArr[3];
        int i14 = (A055 + i13) - 1044525330;
        int A074 = AnonymousClass5AC.A07(i14, 10, i14 << 22, A073);
        int A056 = AnonymousClass5AC.A05(A073, A074, A072, A07);
        int i15 = iArr[4];
        int i16 = (A056 + i15) - 176418897;
        int A075 = AnonymousClass5AC.A07(i16, 25, i16 << 7, A074);
        int A057 = AnonymousClass5AC.A05(A074, A075, A073, A072);
        int i17 = iArr[5];
        int A022 = AnonymousClass5AC.A02(A057 + i17, 1200080426, A075);
        int A058 = AnonymousClass5AC.A05(A075, A022, A074, A073);
        int i18 = iArr[6];
        int i19 = (A058 + i18) - 1473231341;
        int A076 = AnonymousClass5AC.A07(i19, 15, i19 << 17, A022);
        int A059 = AnonymousClass5AC.A05(A022, A076, A075, A074);
        int i20 = iArr[7];
        int i21 = (A059 + i20) - 45705983;
        int A077 = AnonymousClass5AC.A07(i21, 10, i21 << 22, A076);
        int A0510 = AnonymousClass5AC.A05(A076, A077, A022, A075);
        int i22 = iArr[8];
        int i23 = A0510 + i22 + 1770035416;
        int A078 = AnonymousClass5AC.A07(i23, 25, i23 << 7, A077);
        int A0511 = AnonymousClass5AC.A05(A077, A078, A076, A022);
        int i24 = iArr[9];
        int A023 = AnonymousClass5AC.A02(A0511 + i24, -1958414417, A078);
        int A0512 = AnonymousClass5AC.A05(A078, A023, A077, A076);
        int i25 = iArr[10];
        int i26 = (A0512 + i25) - 42063;
        int A079 = AnonymousClass5AC.A07(i26, 15, i26 << 17, A023);
        int A0513 = AnonymousClass5AC.A05(A023, A079, A078, A077);
        int i27 = iArr[11];
        int i28 = (A0513 + i27) - 1990404162;
        int A0710 = AnonymousClass5AC.A07(i28, 10, i28 << 22, A079);
        int A0514 = AnonymousClass5AC.A05(A079, A0710, A023, A078);
        int i29 = iArr[12];
        int i30 = A0514 + i29 + 1804603682;
        int A0711 = AnonymousClass5AC.A07(i30, 25, i30 << 7, A0710);
        int A0515 = AnonymousClass5AC.A05(A0710, A0711, A079, A023);
        int i31 = iArr[13];
        int A024 = AnonymousClass5AC.A02(A0515 + i31, -40341101, A0711);
        int i32 = A024 ^ -1;
        int i33 = iArr[14];
        int i34 = ((A079 + ((i32 & A0710) | (A0711 & A024))) + i33) - 1502002290;
        int A0712 = AnonymousClass5AC.A07(i34, 15, i34 << 17, A024);
        int i35 = A0712 ^ -1;
        int i36 = iArr[15];
        int i37 = A0710 + ((i35 & A0711) | (A024 & A0712)) + i36 + 1236535329;
        int A0713 = AnonymousClass5AC.A07(i37, 10, i37 << 22, A0712);
        int i38 = ((A0711 + ((A0713 & A024) | (A0712 & i32))) + i9) - 165796510;
        int A0714 = AnonymousClass5AC.A07(i38, 27, i38 << 5, A0713);
        int A042 = AnonymousClass5AC.A04(A024 + ((A0714 & A0712) | (A0713 & i35)) + i18, -1069501632, A0714);
        int A012 = AnonymousClass5AC.A01(AnonymousClass5AC.A08(A042, A0713, A0714, A0712, i27), 643717713, A042);
        int A08 = AnonymousClass5AC.A08(A012, A0714, A042, A0713, i7) - 373897302;
        int A0715 = AnonymousClass5AC.A07(A08, 12, A08 << 20, A012);
        int A082 = AnonymousClass5AC.A08(A0715, A042, A012, A0714, i17) - 701558691;
        int A0716 = AnonymousClass5AC.A07(A082, 27, A082 << 5, A0715);
        int A043 = AnonymousClass5AC.A04(AnonymousClass5AC.A08(A0716, A012, A0715, A042, i25), 38016083, A0716);
        int A013 = AnonymousClass5AC.A01(AnonymousClass5AC.A08(A043, A0715, A0716, A012, i36), -660478335, A043);
        int A083 = AnonymousClass5AC.A08(A013, A0716, A043, A0715, i15) - 405537848;
        int A0717 = AnonymousClass5AC.A07(A083, 12, A083 << 20, A013);
        int A084 = AnonymousClass5AC.A08(A0717, A043, A013, A0716, i24) + 568446438;
        int A0718 = AnonymousClass5AC.A07(A084, 27, A084 << 5, A0717);
        int A044 = AnonymousClass5AC.A04(AnonymousClass5AC.A08(A0718, A013, A0717, A043, i33), -1019803690, A0718);
        int A014 = AnonymousClass5AC.A01(AnonymousClass5AC.A08(A044, A0717, A0718, A013, i13), -187363961, A044);
        int A085 = AnonymousClass5AC.A08(A014, A0718, A044, A0717, i22) + 1163531501;
        int A0719 = AnonymousClass5AC.A07(A085, 12, A085 << 20, A014);
        int A086 = AnonymousClass5AC.A08(A0719, A044, A014, A0718, i31) - 1444681467;
        int A0720 = AnonymousClass5AC.A07(A086, 27, A086 << 5, A0719);
        int A045 = AnonymousClass5AC.A04(AnonymousClass5AC.A08(A0720, A014, A0719, A044, i11), -51403784, A0720);
        int A015 = AnonymousClass5AC.A01(AnonymousClass5AC.A08(A045, A0719, A0720, A014, i20), 1735328473, A045);
        int A087 = AnonymousClass5AC.A08(A015, A0720, A045, A0719, i29) - 1926607734;
        int A0721 = AnonymousClass5AC.A07(A087, 12, A087 << 20, A015);
        int A06 = (AnonymousClass5AC.A06(A0721, A015, A045, A0720) + i17) - 378558;
        int A0722 = AnonymousClass5AC.A07(A06, 28, A06 << 4, A0721);
        int A032 = AnonymousClass5AC.A03(AnonymousClass5AC.A06(A0722, A0721, A015, A045) + i22, -2022574463, A0722);
        int A062 = AnonymousClass5AC.A06(A032, A0722, A0721, A015) + i27 + 1839030562;
        int A0723 = AnonymousClass5AC.A07(A062, 16, A062 << 16, A032);
        int A063 = (AnonymousClass5AC.A06(A0723, A032, A0722, A0721) + i33) - 35309556;
        int A0724 = AnonymousClass5AC.A07(A063, 9, A063 << 23, A0723);
        int A064 = (AnonymousClass5AC.A06(A0724, A0723, A032, A0722) + i9) - 1530992060;
        int A0725 = AnonymousClass5AC.A07(A064, 28, A064 << 4, A0724);
        int A033 = AnonymousClass5AC.A03(AnonymousClass5AC.A06(A0725, A0724, A0723, A032) + i15, 1272893353, A0725);
        int A065 = (AnonymousClass5AC.A06(A033, A0725, A0724, A0723) + i20) - 155497632;
        int A0726 = AnonymousClass5AC.A07(A065, 16, A065 << 16, A033);
        int A066 = (AnonymousClass5AC.A06(A0726, A033, A0725, A0724) + i25) - 1094730640;
        int A0727 = AnonymousClass5AC.A07(A066, 9, A066 << 23, A0726);
        int A067 = AnonymousClass5AC.A06(A0727, A0726, A033, A0725) + i31 + 681279174;
        int A0728 = AnonymousClass5AC.A07(A067, 28, A067 << 4, A0727);
        int A034 = AnonymousClass5AC.A03(AnonymousClass5AC.A06(A0728, A0727, A0726, A033) + i7, -358537222, A0728);
        int A068 = (AnonymousClass5AC.A06(A034, A0728, A0727, A0726) + i13) - 722521979;
        int A0729 = AnonymousClass5AC.A07(A068, 16, A068 << 16, A034);
        int A069 = AnonymousClass5AC.A06(A0729, A034, A0728, A0727) + i18 + 76029189;
        int A0730 = AnonymousClass5AC.A07(A069, 9, A069 << 23, A0729);
        int A0610 = (AnonymousClass5AC.A06(A0730, A0729, A034, A0728) + i24) - 640364487;
        int A0731 = AnonymousClass5AC.A07(A0610, 28, A0610 << 4, A0730);
        int A035 = AnonymousClass5AC.A03(AnonymousClass5AC.A06(A0731, A0730, A0729, A034) + i29, -421815835, A0731);
        int A0611 = AnonymousClass5AC.A06(A035, A0731, A0730, A0729) + i36 + 530742520;
        int A0732 = AnonymousClass5AC.A07(A0611, 16, A0611 << 16, A035);
        int A0612 = (AnonymousClass5AC.A06(A0732, A035, A0731, A0730) + i11) - 995338651;
        int A0733 = AnonymousClass5AC.A07(A0612, 9, A0612 << 23, A0732);
        int A09 = AnonymousClass5AC.A09(A035, A0733, A0732, A0731, i7) - 198630844;
        int A0734 = AnonymousClass5AC.A07(A09, 26, A09 << 6, A0733);
        int A002 = AnonymousClass5AC.A00(AnonymousClass5AC.A09(A0732, A0734, A0733, A035, i20) + 1126891415) + A0734;
        int A092 = AnonymousClass5AC.A09(A0733, A002, A0734, A0732, i33) - 1416354905;
        int A0735 = AnonymousClass5AC.A07(A092, 17, A092 << 15, A002);
        int A093 = AnonymousClass5AC.A09(A0734, A0735, A002, A0733, i17) - 57434055;
        int A0736 = AnonymousClass5AC.A07(A093, 11, A093 << 21, A0735);
        int A094 = AnonymousClass5AC.A09(A002, A0736, A0735, A0734, i29) + 1700485571;
        int A0737 = AnonymousClass5AC.A07(A094, 26, A094 << 6, A0736);
        int A003 = AnonymousClass5AC.A00(AnonymousClass5AC.A09(A0735, A0737, A0736, A002, i13) - 1894986606) + A0737;
        int A095 = AnonymousClass5AC.A09(A0736, A003, A0737, A0735, i25) - 1051523;
        int A0738 = AnonymousClass5AC.A07(A095, 17, A095 << 15, A003);
        int A096 = AnonymousClass5AC.A09(A0737, A0738, A003, A0736, i9) - 2054922799;
        int A0739 = AnonymousClass5AC.A07(A096, 11, A096 << 21, A0738);
        int A097 = AnonymousClass5AC.A09(A003, A0739, A0738, A0737, i22) + 1873313359;
        int A0740 = AnonymousClass5AC.A07(A097, 26, A097 << 6, A0739);
        int A004 = AnonymousClass5AC.A00(AnonymousClass5AC.A09(A0738, A0740, A0739, A003, i36) - 30611744) + A0740;
        int A098 = AnonymousClass5AC.A09(A0739, A004, A0740, A0738, i18) - 1560198380;
        int A0741 = AnonymousClass5AC.A07(A098, 17, A098 << 15, A004);
        int A099 = AnonymousClass5AC.A09(A0740, A0741, A004, A0739, i31) + 1309151649;
        int A0742 = AnonymousClass5AC.A07(A099, 11, A099 << 21, A0741);
        int A0910 = AnonymousClass5AC.A09(A004, A0742, A0741, A0740, i15) - 145523070;
        int A0743 = AnonymousClass5AC.A07(A0910, 26, A0910 << 6, A0742);
        int A005 = AnonymousClass5AC.A00(AnonymousClass5AC.A09(A0741, A0743, A0742, A004, i27) - 1120210379) + A0743;
        int A0911 = AnonymousClass5AC.A09(A0742, A005, A0743, A0741, i11) + 718787259;
        int A0744 = AnonymousClass5AC.A07(A0911, 17, A0911 << 15, A005);
        int A0912 = AnonymousClass5AC.A09(A0743, A0744, A005, A0742, i24) - 343485551;
        int A0745 = AnonymousClass5AC.A07(A0912, 11, A0912 << 21, A0744);
        this.A00 = i2 + A0743;
        this.A01 = i3 + A0745;
        this.A02 = i4 + A0744;
        this.A03 = i6 + A005;
        this.A04 = 0;
        for (int i39 = 0; i39 != iArr.length; i39++) {
            iArr[i39] = 0;
        }
    }

    public final void A0M(AnonymousClass5JS r5) {
        super.A0E(r5);
        this.A00 = r5.A00;
        this.A01 = r5.A01;
        this.A02 = r5.A02;
        this.A03 = r5.A03;
        int[] iArr = r5.A05;
        System.arraycopy(iArr, 0, this.A05, 0, iArr.length);
        this.A04 = r5.A04;
    }

    public AnonymousClass5SH A6m() {
        return new AnonymousClass5JS(this);
    }

    public int A8A(byte[] bArr, int i2) {
        A0D();
        A0D(bArr, this.A00, i2);
        A0D(bArr, this.A01, i2 + 4);
        A0D(bArr, this.A02, i2 + 8);
        A0D(bArr, this.A03, i2 + 12);
        reset();
        return 16;
    }

    public String A9q() {
        return "MD5";
    }

    public int ABn() {
        return 16;
    }

    public void AcP(AnonymousClass5SH r1) {
        A0M((AnonymousClass5JS) r1);
    }

    public void reset() {
        super.reset();
        this.A00 = 1732584193;
        this.A01 = -271733879;
        this.A02 = -1732584194;
        this.A03 = 271733878;
        this.A04 = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.A05;
            if (i2 != iArr.length) {
                iArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }
}
