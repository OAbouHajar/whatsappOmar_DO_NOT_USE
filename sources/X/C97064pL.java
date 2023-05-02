package X;

import okhttp3.internal.http.StatusLine;

/* renamed from: X.4pL  reason: invalid class name and case insensitive filesystem */
public final class C97064pL implements AnonymousClass5SO {
    public static final int[] A0C = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] A0D = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final int A04;
    public final int A05;
    public final C32491gT A06;
    public final C15060qG A07;
    public final C32481gS A08;
    public final C85114Ne A09;
    public final C90504eH A0A;
    public final byte[] A0B;

    public C97064pL(C15060qG r9, C32481gS r10, C85114Ne r11) {
        this.A07 = r9;
        this.A08 = r10;
        this.A09 = r11;
        int i2 = r11.A03;
        int max = Math.max(1, i2 / 10);
        this.A05 = max;
        C90504eH r0 = new C90504eH(r11.A05);
        r0.A0A();
        int A0A2 = r0.A0A();
        this.A04 = A0A2;
        int i3 = r11.A04;
        int i4 = r11.A01;
        int i5 = (((i4 - (i3 << 2)) << 3) / (r11.A00 * i3)) + 1;
        if (A0A2 == i5) {
            int i6 = ((max + A0A2) - 1) / A0A2;
            this.A0B = new byte[(i4 * i6)];
            this.A0A = C90504eH.A05(i6 * (A0A2 << 1) * i3);
            int i7 = ((i2 * i4) << 3) / A0A2;
            C32471gR A0N = AnonymousClass3K4.A0N();
            A0N.A0R = "audio/raw";
            A0N.A03 = i7;
            A0N.A0A = i7;
            A0N.A08 = (max << 1) * i3;
            A0N.A04 = i3;
            A0N.A0D = i2;
            A0N.A09 = 2;
            this.A06 = new C32491gT(A0N);
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Expected frames per block: ");
        A0r.append(i5);
        throw AnonymousClass40M.A00(C13680ns.A0i("; got: ", A0r, A0A2));
    }

    public final void A00(int i2) {
        long j2 = this.A03;
        long j3 = this.A02;
        C85114Ne r4 = this.A09;
        long A0G = j2 + AnonymousClass3K4.A0G(j3, (long) r4.A03);
        int i3 = (i2 << 1) * r4.A04;
        this.A08.Ad0((C86824Uh) null, 1, i3, this.A01 - i3, A0G);
        this.A02 += (long) i2;
        this.A01 -= i3;
    }

    public void AHw(int i2, long j2) {
        this.A07.AdD(new C96714om(this.A09, this.A04, (long) i2, j2));
        this.A08.A9D(this.A06);
    }

    public void AcO(long j2) {
        this.A00 = 0;
        this.A03 = j2;
        this.A01 = 0;
        this.A02 = 0;
    }

    public boolean Acy(C55142iu r25, long j2) {
        int i2;
        int i3 = this.A05;
        int i4 = this.A01;
        C85114Ne r1 = this.A09;
        int i5 = r1.A04;
        int i6 = i5 << 1;
        int i7 = this.A04;
        int i8 = r1.A01;
        int i9 = ((((i3 - (i4 / i6)) + i7) - 1) / i7) * i8;
        long j3 = j2;
        boolean z2 = false;
        if (j2 != 0) {
            while (true) {
                int i10 = this.A00;
                if (i10 < i9) {
                    int read = r25.read(this.A0B, i10, (int) Math.min((long) (i9 - i10), j3));
                    if (read == -1) {
                        break;
                    }
                    this.A00 += read;
                } else {
                    break;
                }
            }
        }
        z2 = true;
        int i11 = this.A00 / i8;
        if (i11 > 0) {
            byte[] bArr = this.A0B;
            C90504eH r8 = this.A0A;
            int i12 = 0;
            do {
                for (int i13 = 0; i13 < i5; i13++) {
                    byte[] bArr2 = r8.A02;
                    int i14 = (i12 * i8) + (i13 << 2);
                    int i15 = (i5 << 2) + i14;
                    int i16 = (i8 / i5) - 4;
                    int i17 = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
                    int min = Math.min(bArr[i14 + 2] & 255, 88);
                    int[] iArr = A0D;
                    int i18 = iArr[min];
                    int i19 = (((i12 * i7) * i5) + i13) << 1;
                    AnonymousClass3K4.A15(bArr2, i17, i19);
                    bArr2[i19 + 1] = (byte) (i17 >> 8);
                    for (int i20 = 0; i20 < (i16 << 1); i20++) {
                        byte b2 = bArr[(((i20 >> 3) * i5) << 2) + i15 + ((i20 >> 1) % 4)] & 255;
                        int i21 = b2 >> 4;
                        if (i20 % 2 == 0) {
                            i21 = b2 & 15;
                        }
                        int i22 = ((((i21 & 7) << 1) + 1) * i18) >> 3;
                        if ((i21 & 8) != 0) {
                            i22 = -i22;
                        }
                        i17 = Math.max(-32768, Math.min(i17 + i22, 32767));
                        i19 += i6;
                        AnonymousClass3K4.A15(bArr2, i17, i19);
                        bArr2[i19 + 1] = (byte) (i17 >> 8);
                        min = Math.max(0, Math.min(min + A0C[i21], iArr.length - 1));
                        i18 = iArr[min];
                    }
                }
                i12++;
            } while (i12 < i11);
            r8.A0S(0);
            r8.A0R(((i7 * i11) << 1) * i5);
            this.A00 -= i11 * i8;
            int i23 = r8.A00;
            this.A08.Acw(r8, i23);
            int i24 = this.A01 + i23;
            this.A01 = i24;
            int i25 = i3;
            if (i24 / i6 >= i25) {
                A00(i25);
            }
        }
        if (z2 && (i2 = this.A01 / i6) > 0) {
            A00(i2);
        }
        return z2;
    }
}
