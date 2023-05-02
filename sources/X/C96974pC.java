package X;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.4pC  reason: invalid class name and case insensitive filesystem */
public final class C96974pC implements C109595St {
    public static final byte[] A0L = {73, 68, 51};
    public int A00 = 0;
    public int A01;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = 256;
    public int A05;
    public int A06 = 0;
    public long A07;
    public long A08 = -9223372036854775807L;
    public long A09;
    public C32481gS A0A;
    public C32481gS A0B;
    public C32481gS A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final C90204dh A0H = new C90204dh(new byte[7], 7);
    public final C90504eH A0I = new C90504eH(Arrays.copyOf(A0L, 10));
    public final String A0J;
    public final boolean A0K;

    public C96974pC(String str, boolean z2) {
        this.A0K = z2;
        this.A0J = str;
    }

    public void A6b(C90504eH r15) {
        while (true) {
            int i2 = r15.A00;
            int i3 = r15.A01;
            int i4 = i2 - i3;
            if (i4 > 0) {
                int i5 = this.A06;
                if (i5 != 0) {
                    if (i5 == 1) {
                        C90204dh r3 = this.A0H;
                        AnonymousClass3K4.A16(r15.A02, r3.A03, i3, 0);
                        r3.A07(2);
                        int A042 = r3.A04(4);
                        int i6 = this.A02;
                        if (i6 == -1 || A042 == i6) {
                            if (!this.A0E) {
                                this.A0E = true;
                                this.A03 = this.A01;
                                this.A02 = A042;
                            }
                            this.A06 = 3;
                            this.A00 = 0;
                        } else {
                            this.A0E = false;
                            this.A06 = 0;
                            this.A00 = 0;
                        }
                    } else if (i5 == 2) {
                        C90504eH r6 = this.A0I;
                        byte[] bArr = r6.A02;
                        int i7 = this.A00;
                        int A062 = AnonymousClass3K4.A06(10, i7, i4);
                        r15.A0V(bArr, i7, A062);
                        int i8 = this.A00 + A062;
                        this.A00 = i8;
                        if (i8 == 10) {
                            this.A0B.Acw(r6, 10);
                            r6.A0S(6);
                            C32481gS r4 = this.A0B;
                            this.A06 = 4;
                            this.A00 = 10;
                            this.A0A = r4;
                            this.A07 = 0;
                            this.A05 = r6.A0B() + 10;
                        }
                    } else if (i5 != 3) {
                        int A063 = AnonymousClass3K4.A06(this.A05, this.A00, i4);
                        this.A0A.Acw(r15, A063);
                        int i9 = this.A00 + A063;
                        this.A00 = i9;
                        int i10 = this.A05;
                        if (i9 == i10) {
                            this.A0A.Ad0((C86824Uh) null, 1, i10, 0, this.A09);
                            this.A09 += this.A07;
                            this.A06 = 0;
                            this.A00 = 0;
                        }
                    } else {
                        int i11 = 5;
                        if (this.A0F) {
                            i11 = 7;
                        }
                        C90204dh r5 = this.A0H;
                        byte[] bArr2 = r5.A03;
                        int i12 = this.A00;
                        int A064 = AnonymousClass3K4.A06(i11, i12, i4);
                        r15.A0V(bArr2, i12, A064);
                        int i13 = this.A00 + A064;
                        this.A00 = i13;
                        if (i13 == i11) {
                            r5.A07(0);
                            if (!this.A0G) {
                                int A043 = r5.A04(2) + 1;
                                if (A043 != 2) {
                                    StringBuilder A0r = AnonymousClass000.A0r("Detected audio object type: ");
                                    A0r.append(A043);
                                    Log.w("AdtsReader", AnonymousClass000.A0h(", but assuming AAC LC.", A0r));
                                }
                                r5.A08(5);
                                int A044 = r5.A04(3);
                                int i14 = this.A02;
                                byte[] bArr3 = new byte[2];
                                bArr3[0] = (byte) (16 | ((i14 >> 1) & 7));
                                AnonymousClass3K4.A0i((i14 << 7) & 128, bArr3, (A044 << 3) & 120, 1);
                                AnonymousClass4JS A012 = C89734co.A01(new C90204dh(bArr3, 2), false);
                                C32471gR A0N = AnonymousClass3K4.A0N();
                                A0N.A0O = this.A0D;
                                A0N.A0R = "audio/mp4a-latm";
                                A0N.A0M = A012.A02;
                                A0N.A04 = A012.A00;
                                A0N.A0D = A012.A01;
                                A0N.A0S = Collections.singletonList(bArr3);
                                A0N.A0Q = this.A0J;
                                C32491gT r42 = new C32491gT(A0N);
                                this.A08 = 1024000000 / ((long) r42.A0F);
                                this.A0C.A9D(r42);
                                this.A0G = true;
                            } else {
                                r5.A08(10);
                            }
                            r5.A08(4);
                            int A045 = (r5.A04(13) - 2) - 5;
                            if (this.A0F) {
                                A045 -= 2;
                            }
                            C32481gS r43 = this.A0C;
                            long j2 = this.A08;
                            this.A06 = 4;
                            this.A00 = 0;
                            this.A0A = r43;
                            this.A07 = j2;
                            this.A05 = A045;
                        }
                    }
                    this.A04 = 256;
                } else {
                    byte[] bArr4 = r15.A02;
                    while (i3 < i2) {
                        int i15 = i3 + 1;
                        byte b2 = bArr4[i3] & 255;
                        if (this.A04 == 512 && ((65280 | (((byte) b2) & 255)) & 65526) == 65520) {
                            if (!this.A0E) {
                                int i16 = i15 - 2;
                                r15.A0S(i16 + 1);
                                C90204dh r7 = this.A0H;
                                byte[] bArr5 = r7.A03;
                                if (C90504eH.A00(r15) >= 1) {
                                    r15.A0V(bArr5, 0, 1);
                                    r7.A07(4);
                                    int A046 = r7.A04(1);
                                    int i17 = this.A03;
                                    if (i17 == -1 || A046 == i17) {
                                        if (this.A02 != -1) {
                                            byte[] bArr6 = r7.A03;
                                            if (C90504eH.A00(r15) >= 1) {
                                                r15.A0V(bArr6, 0, 1);
                                                r7.A07(2);
                                                if (r7.A04(4) == this.A02) {
                                                    r15.A0S(i16 + 2);
                                                }
                                            }
                                        }
                                        byte[] bArr7 = r7.A03;
                                        if (C90504eH.A00(r15) >= 4) {
                                            r15.A0V(bArr7, 0, 4);
                                            r7.A07(14);
                                            int A047 = r7.A04(13);
                                            if (A047 >= 7) {
                                                byte[] bArr8 = r15.A02;
                                                int i18 = r15.A00;
                                                int i19 = i16 + A047;
                                                if (i19 < i18) {
                                                    byte b3 = bArr8[i19];
                                                    if (b3 == -1) {
                                                        int i20 = i19 + 1;
                                                        if (i20 != i18) {
                                                            byte b4 = bArr8[i20];
                                                            if (((65280 | (b4 & 255)) & 65526) == 65520 && ((b4 & 8) >> 3) == A046) {
                                                            }
                                                        }
                                                    } else if (b3 == 73) {
                                                        int i21 = i19 + 1;
                                                        if (i21 != i18) {
                                                            if (bArr8[i21] == 68) {
                                                                int i22 = i19 + 2;
                                                                if (i22 != i18) {
                                                                    if (bArr8[i22] == 51) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            this.A01 = (b2 & 8) >> 3;
                            boolean z2 = true;
                            if ((b2 & 1) != 0) {
                                z2 = false;
                            }
                            this.A0F = z2;
                            int i23 = 3;
                            if (!this.A0E) {
                                i23 = 1;
                            }
                            this.A06 = i23;
                            this.A00 = 0;
                            r15.A0S(i15);
                            break;
                        }
                        int i24 = this.A04;
                        byte b5 = b2 | i24;
                        int i25 = 768;
                        if (b5 != 329) {
                            if (b5 != 511) {
                                i25 = 1024;
                                if (b5 != 836) {
                                    if (b5 == 1075) {
                                        this.A06 = 2;
                                        this.A00 = A0L.length;
                                        this.A05 = 0;
                                        this.A0I.A0S(0);
                                        r15.A0S(i15);
                                        break;
                                        break;
                                    } else if (i24 != 256) {
                                        this.A04 = 256;
                                        i15--;
                                    }
                                }
                            } else {
                                this.A04 = 512;
                            }
                            i3 = i15;
                        }
                        this.A04 = i25;
                        i3 = i15;
                    }
                    r15.A0S(i3);
                }
            } else {
                return;
            }
        }
    }

    public void A7e(C15060qG r4, AnonymousClass4WV r5) {
        r5.A03();
        this.A0D = r5.A02();
        C32481gS A002 = AnonymousClass4WV.A00(r4, r5);
        this.A0C = A002;
        this.A0A = A002;
        if (this.A0K) {
            r5.A03();
            C32481gS Ah1 = r4.Ah1(r5.A01(), 5);
            this.A0B = Ah1;
            C32471gR A0N = AnonymousClass3K4.A0N();
            A0N.A0O = r5.A02();
            A0N.A0R = "application/id3";
            AnonymousClass3K3.A19(A0N, Ah1);
            return;
        }
        this.A0B = new C96764or();
    }

    public void Aa7() {
    }

    public void Aa8(long j2, int i2) {
        this.A09 = j2;
    }

    public void AdB() {
        this.A0E = false;
        this.A06 = 0;
        this.A00 = 0;
        this.A04 = 256;
    }
}
