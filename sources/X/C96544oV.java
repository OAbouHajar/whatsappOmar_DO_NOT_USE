package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.4oV  reason: invalid class name and case insensitive filesystem */
public final class C96544oV implements C55132it {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public long A04;
    public C15060qG A05;
    public C90654eW A06;
    public C32481gS A07;
    public C65333Uj A08;
    public C93724jf A09;
    public final AnonymousClass4Bs A0A = new AnonymousClass4Bs();
    public final C90504eH A0B = new C90504eH(new byte[32768], 0);
    public final byte[] A0C = new byte[42];

    public final void A00() {
        this.A07.Ad0((C86824Uh) null, 1, this.A00, 0, (this.A04 * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A06.A07));
    }

    public void AHx(C15060qG r3) {
        this.A05 = r3;
        this.A07 = r3.Ah1(0, 1);
        r3.A8W();
    }

    public int AbN(C55142iu r30, AnonymousClass4Bt r31) {
        int i2;
        String str;
        boolean A0C2;
        C93724jf r15;
        C32371gD r4;
        boolean z2;
        boolean z3;
        long j2;
        int AaH;
        int i3 = this.A03;
        C55142iu r42 = r30;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    C90504eH A052 = C90504eH.A05(4);
                    r42.readFully(A052.A02, 0, 4);
                    if (A052.A0I() == 1716281667) {
                        i2 = 3;
                    } else {
                        str = "Failed to read FLAC stream marker.";
                    }
                } else if (i3 == 3) {
                    C90654eW r7 = this.A06;
                    do {
                        r42.AcS();
                        C90204dh r5 = new C90204dh(new byte[4], 4);
                        r42.AaL(r5.A03, 0, 4);
                        A0C2 = r5.A0C();
                        int A042 = r5.A04(7);
                        int A043 = r5.A04(24) + 4;
                        if (A042 == 0) {
                            byte[] bArr = new byte[38];
                            r42.readFully(bArr, 0, 38);
                            r7 = new C90654eW(bArr, 4);
                        } else if (r7 == null) {
                            throw AnonymousClass3K3.A0f();
                        } else if (A042 == 3) {
                            C90504eH A053 = C90504eH.A05(A043);
                            r42.readFully(A053.A02, 0, A043);
                            r7 = r7.A04(AnonymousClass450.A00(A053));
                        } else {
                            if (A042 == 4) {
                                C90504eH A054 = C90504eH.A05(A043);
                                r42.readFully(A054.A02, 0, A043);
                                A054.A0T(4);
                                A054.A0O((int) A054.A0G());
                                long A0G = A054.A0G();
                                String[] strArr = new String[((int) A0G)];
                                for (int i4 = 0; ((long) i4) < A0G; i4++) {
                                    strArr[i4] = A054.A0O((int) A054.A0G());
                                }
                                r15 = C90654eW.A01(Arrays.asList(new C82204Bu(strArr).A00), Collections.emptyList());
                            } else if (A042 == 6) {
                                C90504eH A055 = C90504eH.A05(A043);
                                r42.readFully(A055.A02, 0, A043);
                                A055.A0T(4);
                                int A072 = A055.A07();
                                int A073 = A055.A07();
                                String str2 = new String(A055.A02, A055.A01, A073, AnonymousClass4BH.A01);
                                A055.A01 += A073;
                                String A0O = A055.A0O(A055.A07());
                                int A074 = A055.A07();
                                int A075 = A055.A07();
                                int A076 = A055.A07();
                                int A077 = A055.A07();
                                int A078 = A055.A07();
                                byte[] bArr2 = new byte[A078];
                                A055.A0V(bArr2, 0, A078);
                                r15 = C90654eW.A01(Collections.emptyList(), Collections.singletonList(new C97234pc(str2, A0O, bArr2, A072, A074, A075, A076, A077)));
                            } else {
                                r42.Afx(A043);
                            }
                            C93724jf r2 = r7.A0B;
                            if (r2 != null) {
                                r15 = r2.A00(r15);
                            }
                            int i5 = r7.A05;
                            int i6 = r7.A03;
                            int i7 = r7.A06;
                            int i8 = r7.A04;
                            int i9 = r7.A07;
                            int i10 = r7.A02;
                            int i11 = r7.A00;
                            long j3 = r7.A09;
                            AnonymousClass4G8 r18 = r7.A0A;
                            r7 = new C90654eW(r18, r15, i5, i6, i7, i8, i9, i10, i11, j3);
                        }
                        this.A06 = r7;
                    } while (!A0C2);
                    this.A02 = Math.max(r7.A06, 6);
                    this.A07.A9D(r7.A03(this.A09, this.A0C));
                    i2 = 4;
                } else if (i3 != 4) {
                    C65333Uj r3 = this.A08;
                    if (r3 != null && r3.A00 != null) {
                        return r3.A00(r42, r31);
                    }
                    if (this.A04 == -1) {
                        C90654eW r9 = this.A06;
                        r42.AcS();
                        boolean z4 = true;
                        r42.A4m(1);
                        byte[] bArr3 = new byte[1];
                        r42.AaL(bArr3, 0, 1);
                        if ((bArr3[0] & 1) != 1) {
                            z4 = false;
                        }
                        r42.A4m(2);
                        int i12 = 6;
                        if (z4) {
                            i12 = 7;
                        }
                        C90504eH A056 = C90504eH.A05(i12);
                        byte[] bArr4 = A056.A02;
                        int i13 = 0;
                        do {
                            AaH = r42.AaH(bArr4, i13, i12 - i13);
                            if (AaH == -1 || (i13 = i13 + AaH) >= i12) {
                                A056.A0R(i13);
                                r42.AcS();
                            }
                            AaH = r42.AaH(bArr4, i13, i12 - i13);
                            break;
                        } while ((i13 = i13 + AaH) >= i12);
                        A056.A0R(i13);
                        r42.AcS();
                        try {
                            long A0K = A056.A0K();
                            if (!z4) {
                                A0K *= (long) r9.A03;
                            }
                            this.A04 = A0K;
                            return 0;
                        } catch (NumberFormatException unused) {
                            throw new AnonymousClass40M();
                        }
                    } else {
                        C90504eH r52 = this.A0B;
                        int i14 = r52.A00;
                        if (i14 < 32768) {
                            int read = r42.read(r52.A02, i14, 32768 - i14);
                            if (read == -1) {
                                z2 = true;
                                if (C90504eH.A00(r52) == 0) {
                                    A00();
                                    return -1;
                                }
                            } else {
                                z2 = false;
                                r52.A0R(i14 + read);
                            }
                        } else {
                            z2 = false;
                        }
                        int i15 = r52.A01;
                        int i16 = this.A00;
                        int i17 = this.A02;
                        if (i16 < i17) {
                            r52.A0T(AnonymousClass3K4.A06(r52.A00, i15, i17 - i16));
                        }
                        int i18 = r52.A01;
                        while (true) {
                            int i19 = r52.A00;
                            if (i18 <= i19 - 16) {
                                r52.A0S(i18);
                                C90654eW r43 = this.A06;
                                int i20 = this.A01;
                                AnonymousClass4Bs r32 = this.A0A;
                                if (C87514Xe.A01(r32, r43, r52, i20)) {
                                    r52.A0S(i18);
                                    j2 = r32.A00;
                                    break;
                                }
                                i18++;
                            } else {
                                if (!z2) {
                                    r52.A0S(i18);
                                } else {
                                    while (i18 <= i19 - this.A02) {
                                        r52.A0S(i18);
                                        try {
                                            z3 = C87514Xe.A01(this.A0A, this.A06, r52, this.A01);
                                        } catch (IndexOutOfBoundsException unused2) {
                                            z3 = false;
                                        }
                                        int i21 = r52.A01;
                                        i19 = r52.A00;
                                        if (i21 <= i19 && z3) {
                                            r52.A0S(i18);
                                            j2 = this.A0A.A00;
                                            break;
                                        }
                                        i18++;
                                    }
                                    r52.A0S(i19);
                                }
                                j2 = -1;
                            }
                        }
                        int i22 = r52.A01 - i15;
                        r52.A0S(i15);
                        this.A07.Acw(r52, i22);
                        this.A00 += i22;
                        if (j2 != -1) {
                            A00();
                            this.A00 = 0;
                            this.A04 = j2;
                        }
                        int i23 = r52.A00;
                        int i24 = r52.A01;
                        int i25 = i23 - i24;
                        if (i25 >= 16) {
                            return 0;
                        }
                        byte[] bArr5 = r52.A02;
                        System.arraycopy(bArr5, i24, bArr5, 0, i25);
                        r52.A0S(0);
                        r52.A0R(i25);
                        return 0;
                    }
                } else {
                    r42.AcS();
                    C90504eH A057 = C90504eH.A05(2);
                    C90504eH.A06(r42, A057, 2);
                    int A0F = A057.A0F();
                    if ((A0F >> 2) == 16382) {
                        r42.AcS();
                        this.A01 = A0F;
                        C15060qG r53 = this.A05;
                        long AF7 = r42.AF7();
                        long length = r42.getLength();
                        C90654eW r8 = this.A06;
                        if (r8.A0A != null) {
                            r4 = new C96684oj(r8, AF7);
                        } else if (length == -1 || r8.A09 <= 0) {
                            r4 = new C32361gC(r8.A02(), 0);
                        } else {
                            C65333Uj r72 = new C65333Uj(r8, A0F, AF7, length);
                            this.A08 = r72;
                            r4 = r72.A02;
                        }
                        r53.AdD(r4);
                        i2 = 5;
                    } else {
                        r42.AcS();
                        str = "First frame does not start with sync code.";
                    }
                }
                throw AnonymousClass40M.A00(str);
            }
            byte[] bArr6 = this.A0C;
            r42.AaL(bArr6, 0, bArr6.length);
            r42.AcS();
            i2 = 2;
            this.A03 = i2;
            return 0;
        }
        r42.AcS();
        long AEy = r42.AEy();
        C93724jf r73 = null;
        C93724jf A002 = new C85734Ps().A00(r42, (C108305Nl) null);
        if (!(A002 == null || A002.A00.length == 0)) {
            r73 = A002;
        }
        r42.Afx((int) (r42.AEy() - AEy));
        this.A09 = r73;
        this.A03 = 1;
        return 0;
    }

    public void AdC(long j2, long j3) {
        long j4 = 0;
        if (j2 == 0) {
            this.A03 = 0;
        } else {
            C65333Uj r0 = this.A08;
            if (r0 != null) {
                r0.A01(j3);
            }
        }
        if (j3 != 0) {
            j4 = -1;
        }
        this.A04 = j4;
        this.A00 = 0;
        this.A0B.A0Q(0);
    }

    public boolean Afz(C55142iu r7) {
        new C85734Ps().A00(r7, AnonymousClass3V3.A01);
        C90504eH A052 = C90504eH.A05(4);
        r7.AaL(A052.A02, 0, 4);
        return A052.A0I() == 1716281667;
    }
}
