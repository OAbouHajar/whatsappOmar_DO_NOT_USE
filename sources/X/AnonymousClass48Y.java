package X;

import android.support.v4.view.MotionEventCompat;

/* renamed from: X.48Y  reason: invalid class name */
public class AnonymousClass48Y {
    public static int A00(C85644Pi r30, byte[] bArr, byte[] bArr2, byte[] bArr3, long j2) {
        long j3 = j2;
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[64];
        byte[] bArr8 = new byte[32];
        C84984Mq r3 = new C84984Mq();
        AnonymousClass4LJ r25 = new AnonymousClass4LJ();
        if (j2 >= 64) {
            byte[] bArr9 = bArr2;
            if ((bArr2[63] & 224) == 0) {
                int[] iArr = new int[10];
                int[] iArr2 = new int[10];
                int[] iArr3 = new int[10];
                int[] iArr4 = new int[10];
                int[] iArr5 = new int[10];
                int[] iArr6 = r3.A02;
                int[] iArr7 = iArr6;
                byte[] bArr10 = bArr3;
                C89604cW.A00(bArr10, iArr6);
                int[] iArr8 = r3.A03;
                iArr8[0] = 1;
                AnonymousClass3K2.A1V(iArr8);
                AnonymousClass48P.A00(iArr, iArr7);
                AnonymousClass48N.A00(iArr2, iArr, AnonymousClass4As.A00);
                AnonymousClass48Q.A00(iArr, iArr, iArr8);
                AnonymousClass48K.A00(iArr2, iArr2, iArr8);
                AnonymousClass48P.A00(iArr3, iArr2);
                AnonymousClass48N.A00(iArr3, iArr3, iArr2);
                int[] iArr9 = r3.A01;
                AnonymousClass48P.A00(iArr9, iArr3);
                AnonymousClass48N.A00(iArr9, iArr9, iArr2);
                AnonymousClass48N.A00(iArr9, iArr9, iArr);
                int[] iArr10 = new int[10];
                int[] iArr11 = new int[10];
                int[] iArr12 = new int[10];
                AnonymousClass48P.A00(iArr10, iArr9);
                AnonymousClass48P.A00(iArr11, iArr10);
                AnonymousClass48P.A00(iArr11, iArr11);
                AnonymousClass48N.A00(iArr11, iArr9, iArr11);
                AnonymousClass48N.A00(iArr10, iArr10, iArr11);
                AnonymousClass48P.A00(iArr10, iArr10);
                AnonymousClass48N.A00(iArr10, iArr11, iArr10);
                AnonymousClass48P.A00(iArr11, iArr10);
                int i2 = 1;
                do {
                    AnonymousClass48P.A00(iArr11, iArr11);
                    i2++;
                } while (i2 < 5);
                AnonymousClass48N.A00(iArr10, iArr11, iArr10);
                AnonymousClass48P.A00(iArr11, iArr10);
                int i3 = 1;
                do {
                    AnonymousClass48P.A00(iArr11, iArr11);
                    i3++;
                } while (i3 < 10);
                AnonymousClass48N.A00(iArr11, iArr11, iArr10);
                AnonymousClass48P.A00(iArr12, iArr11);
                int i4 = 1;
                do {
                    AnonymousClass48P.A00(iArr12, iArr12);
                    i4++;
                } while (i4 < 20);
                AnonymousClass48N.A00(iArr11, iArr12, iArr11);
                AnonymousClass48P.A00(iArr11, iArr11);
                int i5 = 1;
                do {
                    AnonymousClass48P.A00(iArr11, iArr11);
                    i5++;
                } while (i5 < 10);
                AnonymousClass48N.A00(iArr10, iArr11, iArr10);
                AnonymousClass48P.A00(iArr11, iArr10);
                int i6 = 1;
                do {
                    AnonymousClass48P.A00(iArr11, iArr11);
                    i6++;
                } while (i6 < 50);
                AnonymousClass48N.A00(iArr11, iArr11, iArr10);
                AnonymousClass48P.A00(iArr12, iArr11);
                int i7 = 1;
                do {
                    AnonymousClass48P.A00(iArr12, iArr12);
                    i7++;
                } while (i7 < 100);
                AnonymousClass48N.A00(iArr11, iArr12, iArr11);
                AnonymousClass48P.A00(iArr11, iArr11);
                int i8 = 1;
                do {
                    AnonymousClass48P.A00(iArr11, iArr11);
                    i8++;
                } while (i8 < 50);
                AnonymousClass48N.A00(iArr10, iArr11, iArr10);
                AnonymousClass48P.A00(iArr10, iArr10);
                AnonymousClass48P.A00(iArr10, iArr10);
                AnonymousClass48N.A00(iArr9, iArr10, iArr9);
                AnonymousClass48N.A00(iArr9, iArr9, iArr3);
                AnonymousClass48N.A00(iArr9, iArr9, iArr);
                AnonymousClass48P.A00(iArr4, iArr9);
                AnonymousClass48N.A00(iArr4, iArr4, iArr2);
                AnonymousClass48Q.A00(iArr5, iArr4, iArr);
                byte[] bArr11 = new byte[32];
                AnonymousClass48R.A00(bArr11, iArr5);
                byte[] bArr12 = AnonymousClass4AK.A00;
                int i9 = 0;
                byte b2 = 0;
                do {
                    b2 |= bArr11[i9] ^ bArr12[i9];
                    i9++;
                } while (i9 < 32);
                if (b2 != 0) {
                    AnonymousClass48K.A00(iArr5, iArr4, iArr);
                    byte[] bArr13 = new byte[32];
                    AnonymousClass48R.A00(bArr13, iArr5);
                    int i10 = 0;
                    byte b3 = 0;
                    do {
                        b3 |= bArr13[i10] ^ bArr12[i10];
                        i10++;
                    } while (i10 < 32);
                    if (b3 == 0) {
                        AnonymousClass48N.A00(iArr9, iArr9, AnonymousClass4As.A01);
                    }
                }
                byte[] bArr14 = new byte[32];
                AnonymousClass48R.A00(bArr14, iArr9);
                if ((bArr14[0] & 1) == ((bArr3[31] >>> 7) & 1)) {
                    AnonymousClass48O.A00(iArr9, iArr9);
                }
                AnonymousClass48N.A00(r3.A00, iArr9, iArr7);
                C85644Pi r7 = r30;
                byte[] bArr15 = bArr10;
                r7.A00(new byte[64], bArr15, 32);
                System.arraycopy(bArr15, 0, bArr4, 0, 32);
                byte[] bArr16 = bArr9;
                System.arraycopy(bArr16, 0, bArr5, 0, 32);
                System.arraycopy(bArr16, 32, bArr6, 0, 32);
                byte[] bArr17 = bArr;
                System.arraycopy(bArr9, 0, bArr17, 0, (int) j3);
                System.arraycopy(bArr4, 0, bArr17, 32, 32);
                r7.A00(bArr7, bArr17, j3);
                C89614cX.A00(bArr7);
                byte[] bArr18 = new byte[256];
                byte[] bArr19 = new byte[256];
                C84964Mo[] r14 = new C84964Mo[8];
                int i11 = 0;
                do {
                    r14[i11] = new C84964Mo();
                    i11++;
                } while (i11 < 8);
                C84974Mp r13 = new C84974Mp();
                C84984Mq r12 = new C84984Mq();
                C84984Mq r5 = new C84984Mq();
                C87804Yq.A00(bArr18, bArr7);
                C87804Yq.A00(bArr19, bArr6);
                C84964Mo r0 = r14[0];
                C87814Yr.A00(r0, r3);
                AnonymousClass48X.A00(r13, r3);
                AnonymousClass48V.A00(r13, r5);
                AnonymousClass48S.A00(r0, r13, r5);
                AnonymousClass48V.A00(r13, r12);
                A01(r13, r12, r5, r14, 1);
                A01(r13, r12, r5, r14, 2);
                A01(r13, r12, r5, r14, 3);
                A01(r13, r12, r5, r14, 4);
                A01(r13, r12, r5, r14, 5);
                A01(r13, r12, r5, r14, 6);
                C87814Yr.A00(r14[7], r12);
                int[] iArr13 = r25.A00;
                int[] iArr14 = iArr13;
                iArr13[0] = 0;
                AnonymousClass3K2.A1V(iArr14);
                int[] iArr15 = r25.A01;
                int[] iArr16 = iArr15;
                iArr15[0] = 1;
                AnonymousClass3K2.A1V(iArr16);
                int[] iArr17 = r25.A02;
                int[] iArr18 = iArr17;
                iArr17[0] = 1;
                AnonymousClass3K2.A1V(iArr18);
                int i12 = MotionEventCompat.ACTION_MASK;
                while (true) {
                    if (bArr18[i12] == 0 && bArr19[i12] == 0) {
                        i12--;
                        if (i12 < 0) {
                            break;
                        }
                    }
                }
                do {
                    AnonymousClass48W.A00(r13, r25);
                    byte b4 = bArr18[i12];
                    if (b4 > 0) {
                        AnonymousClass48V.A00(r13, r12);
                        AnonymousClass48S.A00(r14[b4 / 2], r13, r12);
                    } else if (b4 < 0) {
                        AnonymousClass48V.A00(r13, r12);
                        C84964Mo r10 = r14[(-b4) / 2];
                        int[] iArr19 = new int[10];
                        int[] iArr20 = r13.A01;
                        int[] iArr21 = r12.A02;
                        int[] iArr22 = r12.A01;
                        AnonymousClass48K.A00(iArr20, iArr21, iArr22);
                        int[] iArr23 = r13.A02;
                        AnonymousClass48Q.A00(iArr23, iArr21, iArr22);
                        int[] iArr24 = r13.A03;
                        AnonymousClass48N.A00(iArr24, iArr20, r10.A01);
                        AnonymousClass48N.A00(iArr23, iArr23, r10.A02);
                        int[] iArr25 = r13.A00;
                        AnonymousClass48N.A00(iArr25, r10.A00, r12.A00);
                        AnonymousClass48N.A00(iArr20, r12.A03, r10.A03);
                        AnonymousClass48K.A00(iArr19, iArr20, iArr20);
                        AnonymousClass48Q.A00(iArr20, iArr24, iArr23);
                        AnonymousClass48K.A00(iArr23, iArr24, iArr23);
                        AnonymousClass48Q.A00(iArr24, iArr19, iArr25);
                        AnonymousClass48K.A00(iArr25, iArr19, iArr25);
                    }
                    byte b5 = bArr19[i12];
                    if (b5 > 0) {
                        AnonymousClass48V.A00(r13, r12);
                        AnonymousClass48T.A00(r13, r12, C87804Yq.A00[b5 / 2]);
                    } else if (b5 < 0) {
                        AnonymousClass48V.A00(r13, r12);
                        C88074Zu r9 = C87804Yq.A00[(-b5) / 2];
                        int[] iArr26 = new int[10];
                        int[] iArr27 = r13.A01;
                        int[] iArr28 = r12.A02;
                        int[] iArr29 = r12.A01;
                        AnonymousClass48K.A00(iArr27, iArr28, iArr29);
                        int[] iArr30 = r13.A02;
                        AnonymousClass48Q.A00(iArr30, iArr28, iArr29);
                        int[] iArr31 = r13.A03;
                        AnonymousClass48N.A00(iArr31, iArr27, r9.A01);
                        AnonymousClass48N.A00(iArr30, iArr30, r9.A02);
                        int[] iArr32 = r13.A00;
                        AnonymousClass48N.A00(iArr32, r9.A00, r12.A00);
                        int[] iArr33 = r12.A03;
                        AnonymousClass48K.A00(iArr26, iArr33, iArr33);
                        AnonymousClass48Q.A00(iArr27, iArr31, iArr30);
                        AnonymousClass48K.A00(iArr30, iArr31, iArr30);
                        AnonymousClass48Q.A00(iArr31, iArr26, iArr32);
                        AnonymousClass48K.A00(iArr32, iArr26, iArr32);
                    }
                    AnonymousClass48U.A00(r13, r25);
                    i12--;
                } while (i12 >= 0);
                int[] iArr34 = new int[10];
                int[] iArr35 = new int[10];
                int[] iArr36 = new int[10];
                AnonymousClass48M.A00(iArr34, iArr18);
                AnonymousClass48N.A00(iArr35, iArr14, iArr34);
                AnonymousClass48N.A00(iArr36, iArr16, iArr34);
                AnonymousClass48R.A00(bArr8, iArr36);
                byte b6 = bArr8[31];
                byte[] bArr20 = new byte[32];
                AnonymousClass48R.A00(bArr20, iArr35);
                bArr8[31] = (byte) (b6 ^ ((bArr20[0] & 1) << 7));
                int i13 = 0;
                byte b7 = 0;
                do {
                    b7 |= bArr8[i13] ^ bArr5[i13];
                    i13++;
                } while (i13 < 32);
                if (b7 == 0) {
                    System.arraycopy(bArr17, 64, bArr17, 0, (int) (j2 - 64));
                    return 0;
                }
            }
        }
        return -1;
    }

    public static void A01(C84974Mp r1, C84984Mq r2, C84984Mq r3, C84964Mo[] r4, int i2) {
        C84964Mo r0 = r4[i2];
        C87814Yr.A00(r0, r2);
        AnonymousClass48S.A00(r0, r1, r3);
        AnonymousClass48V.A00(r1, r2);
    }
}
