package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.3Uu  reason: invalid class name and case insensitive filesystem */
public final class C65443Uu extends C87484Wy {
    public int A00;
    public C82204Bu A01;
    public C85314Ny A02;
    public C85054Mx A03;
    public boolean A04;

    public void A00(boolean z2) {
        super.A00(z2);
        if (z2) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    public boolean A01(AnonymousClass4GD r21, C90504eH r22, long j2) {
        String str;
        if (this.A03 != null) {
            return false;
        }
        C85314Ny r0 = this.A02;
        C85314Ny r18 = r0;
        C85054Mx r4 = null;
        C90504eH r6 = r22;
        if (r0 == null) {
            AnonymousClass4Xf.A00(r6, 1, false);
            r6.A09();
            int A0C = r6.A0C();
            int A09 = r6.A09();
            int A08 = r6.A08();
            if (A08 <= 0) {
                A08 = -1;
            }
            int A082 = r6.A08();
            if (A082 <= 0) {
                A082 = -1;
            }
            r6.A08();
            int A0C2 = r6.A0C();
            int pow = (int) Math.pow(2.0d, (double) (A0C2 & 15));
            int pow2 = (int) Math.pow(2.0d, (double) ((A0C2 & 240) >> 4));
            r6.A0C();
            this.A02 = new C85314Ny(Arrays.copyOf(r6.A02, r6.A00), A0C, A09, A08, A082, pow, pow2);
        } else {
            C82204Bu r02 = this.A01;
            C82204Bu r17 = r02;
            if (r02 == null) {
                AnonymousClass4Xf.A00(r6, 3, false);
                r6.A0O((int) r6.A0G());
                long A0G = r6.A0G();
                String[] strArr = new String[((int) A0G)];
                for (int i2 = 0; ((long) i2) < A0G; i2++) {
                    strArr[i2] = r6.A0O((int) r6.A0G());
                }
                if ((r6.A0C() & 1) != 0) {
                    this.A01 = new C82204Bu(strArr);
                } else {
                    str = "framing bit expected to be set";
                }
            } else {
                int i3 = r6.A00;
                byte[] bArr = new byte[i3];
                byte[] bArr2 = bArr;
                System.arraycopy(r6.A02, 0, bArr, 0, i3);
                int i4 = r18.A04;
                int i5 = 0;
                AnonymousClass4Xf.A00(r6, 5, false);
                int A0C3 = r6.A0C() + 1;
                AnonymousClass4WE r42 = new AnonymousClass4WE(r6.A02);
                r42.A01(r6.A01 << 3);
                int i6 = 0;
                while (true) {
                    if (i6 < A0C3) {
                        if (r42.A00(24) != 5653314) {
                            str = AnonymousClass000.A0l(AnonymousClass000.A0r("expected code book to start with [0x56, 0x43, 0x42] at "), (r42.A01 << 3) + r42.A00);
                            break;
                        }
                        int A002 = r42.A00(16);
                        int A003 = r42.A00(24);
                        long j3 = 0;
                        if (!r42.A02()) {
                            boolean A022 = r42.A02();
                            for (int i7 = 0; i7 < A003; i7++) {
                                if (!A022 || r42.A02()) {
                                    r42.A00(5);
                                }
                            }
                        } else {
                            r42.A00(5);
                            int i8 = 0;
                            while (i8 < A003) {
                                int i9 = 0;
                                for (int i10 = A003 - i8; i10 > 0; i10 >>>= 1) {
                                    i9++;
                                }
                                int A004 = r42.A00(i9);
                                for (int i11 = 0; i11 < A004 && i8 < A003; i11++) {
                                    i8++;
                                }
                            }
                        }
                        int A005 = r42.A00(4);
                        if (A005 > 2) {
                            str = C13680ns.A0c(A005, "lookup type greater than 2 not decodable: ");
                            break;
                        }
                        if (A005 == 1 || A005 == 2) {
                            r42.A01(32);
                            r42.A01(32);
                            int A006 = r42.A00(4) + 1;
                            r42.A01(1);
                            if (A005 != 1) {
                                j3 = ((long) A003) * ((long) A002);
                            } else if (A002 != 0) {
                                j3 = (long) Math.floor(Math.pow((double) ((long) A003), 1.0d / ((double) ((long) A002))));
                            }
                            r42.A01((int) (j3 * ((long) A006)));
                        }
                        i6++;
                    } else {
                        int A007 = r42.A00(6) + 1;
                        while (true) {
                            if (i5 < A007) {
                                if (r42.A00(16) != 0) {
                                    str = "placeholder of time domain transforms not zeroed out";
                                    break;
                                }
                                i5++;
                            } else {
                                int A008 = r42.A00(6) + 1;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= A008) {
                                        int A009 = r42.A00(6) + 1;
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < A009) {
                                                if (r42.A00(16) > 2) {
                                                    str = "residueType greater than 2 is not decodable";
                                                    break;
                                                }
                                                r42.A01(24);
                                                r42.A01(24);
                                                r42.A01(24);
                                                int A0010 = r42.A00(6) + 1;
                                                r42.A01(8);
                                                int[] iArr = new int[A0010];
                                                for (int i14 = 0; i14 < A0010; i14++) {
                                                    int A0011 = r42.A00(3);
                                                    int i15 = 0;
                                                    if (r42.A02()) {
                                                        i15 = r42.A00(5);
                                                    }
                                                    iArr[i14] = (i15 << 3) + A0011;
                                                }
                                                for (int i16 = 0; i16 < A0010; i16++) {
                                                    int i17 = 0;
                                                    do {
                                                        if ((iArr[i16] & (1 << i17)) != 0) {
                                                            r42.A01(8);
                                                        }
                                                        i17++;
                                                    } while (i17 < 8);
                                                }
                                                i13++;
                                            } else {
                                                int A0012 = r42.A00(6) + 1;
                                                int i18 = 0;
                                                while (true) {
                                                    if (i18 >= A0012) {
                                                        int A0013 = r42.A00(6) + 1;
                                                        AnonymousClass4Bv[] r3 = new AnonymousClass4Bv[A0013];
                                                        for (int i19 = 0; i19 < A0013; i19++) {
                                                            boolean A023 = r42.A02();
                                                            r42.A00(16);
                                                            r42.A00(16);
                                                            r42.A00(8);
                                                            r3[i19] = new AnonymousClass4Bv(A023);
                                                        }
                                                        if (r42.A02()) {
                                                            int i20 = 0;
                                                            for (int i21 = A0013 - 1; i21 > 0; i21 >>>= 1) {
                                                                i20++;
                                                            }
                                                            r4 = new C85054Mx(r17, r18, bArr2, r3, i20);
                                                        } else {
                                                            str = "framing bit after modes not set as expected";
                                                        }
                                                    } else {
                                                        int A0014 = r42.A00(16);
                                                        if (A0014 == 0) {
                                                            int A0015 = r42.A02() ? r42.A00(4) + 1 : 1;
                                                            if (r42.A02()) {
                                                                int A0016 = r42.A00(8) + 1;
                                                                for (int i22 = 0; i22 < A0016; i22++) {
                                                                    int i23 = 0;
                                                                    for (int i24 = i4 - 1; i24 > 0; i24 >>>= 1) {
                                                                        i23++;
                                                                    }
                                                                    r42.A01(i23);
                                                                    r42.A01(i23);
                                                                }
                                                            }
                                                            if (r42.A00(2) != 0) {
                                                                str = "to reserved bits must be zero after mapping coupling steps";
                                                                break;
                                                            }
                                                            if (A0015 > 1) {
                                                                for (int i25 = 0; i25 < i4; i25++) {
                                                                    r42.A01(4);
                                                                }
                                                            }
                                                            for (int i26 = 0; i26 < A0015; i26++) {
                                                                r42.A01(8);
                                                                r42.A01(8);
                                                                r42.A01(8);
                                                            }
                                                        } else {
                                                            Log.e("VorbisUtil", C13680ns.A0c(A0014, "mapping type other than 0 not supported: "));
                                                        }
                                                        i18++;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        int A0017 = r42.A00(16);
                                        if (A0017 != 0) {
                                            if (A0017 != 1) {
                                                str = C13680ns.A0c(A0017, "floor type greater than 1 not decodable: ");
                                                break;
                                            }
                                            int A0018 = r42.A00(5);
                                            int i27 = -1;
                                            int[] iArr2 = new int[A0018];
                                            for (int i28 = 0; i28 < A0018; i28++) {
                                                int A0019 = r42.A00(4);
                                                iArr2[i28] = A0019;
                                                if (A0019 > i27) {
                                                    i27 = iArr2[i28];
                                                }
                                            }
                                            int i29 = i27 + 1;
                                            int[] iArr3 = new int[i29];
                                            for (int i30 = 0; i30 < i29; i30++) {
                                                iArr3[i30] = r42.A00(3) + 1;
                                                int A0020 = r42.A00(2);
                                                if (A0020 > 0) {
                                                    r42.A01(8);
                                                }
                                                for (int i31 = 0; i31 < (1 << A0020); i31++) {
                                                    r42.A01(8);
                                                }
                                            }
                                            r42.A01(2);
                                            int A0021 = r42.A00(4);
                                            int i32 = 0;
                                            int i33 = 0;
                                            for (int i34 = 0; i34 < A0018; i34++) {
                                                i32 += iArr3[iArr2[i34]];
                                                while (i33 < i32) {
                                                    r42.A01(A0021);
                                                    i33++;
                                                }
                                            }
                                        } else {
                                            r42.A01(8);
                                            r42.A01(16);
                                            r42.A01(16);
                                            r42.A01(6);
                                            r42.A01(8);
                                            int A0022 = r42.A00(4) + 1;
                                            for (int i35 = 0; i35 < A0022; i35++) {
                                                r42.A01(8);
                                            }
                                        }
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw AnonymousClass40M.A00(str);
        }
        this.A03 = r4;
        if (r4 != null) {
            C85314Ny r32 = r4.A02;
            ArrayList A0u = AnonymousClass000.A0u();
            A0u.add(r32.A06);
            A0u.add(r4.A03);
            C32471gR A0N = AnonymousClass3K4.A0N();
            A0N.A0R = "audio/vorbis";
            A0N.A03 = r32.A01;
            A0N.A0A = r32.A00;
            A0N.A04 = r32.A04;
            A0N.A0D = r32.A05;
            A0N.A0S = A0u;
            r21.A00 = new C32491gT(A0N);
        }
        return true;
    }
}
