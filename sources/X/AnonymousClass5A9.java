package X;

import java.security.SecureRandom;
import javax.crypto.BadPaddingException;

/* renamed from: X.5A9  reason: invalid class name */
public class AnonymousClass5A9 implements AnonymousClass5TM {
    public C89424c9 A00;

    public AnonymousClass5A9(C89424c9 r1) {
        this.A00 = r1;
    }

    public AnonymousClass5A9(AnonymousClass5T1 r3) {
        this.A00 = new AnonymousClass5JA(r3, new AnonymousClass5A0());
    }

    public AnonymousClass5A9(AnonymousClass5T1 r2, C109515Sl r3) {
        this.A00 = new AnonymousClass5JA(r2, r3);
    }

    public int A8A(byte[] bArr, int i2) {
        AnonymousClass5JA r2;
        int i3;
        AnonymousClass5JA r22;
        Throwable th;
        byte[] bArr2;
        int i4;
        try {
            C89424c9 r23 = this.A00;
            if (r23 instanceof AnonymousClass5JA) {
                AnonymousClass5JA r24 = (AnonymousClass5JA) r23;
                AnonymousClass5T1 r4 = r24.A01;
                int AA7 = r4.AA7();
                boolean z2 = r24.A02;
                int i5 = r24.A00;
                if (z2) {
                    if (i5 != AA7) {
                        i4 = 0;
                    } else if ((AA7 << 1) + i2 <= bArr.length) {
                        i4 = r4.Aaq(r24.A05, bArr, 0, i2);
                        r24.A00 = 0;
                        i5 = 0;
                    } else {
                        r24.A01();
                        th = AnonymousClass5JD.A00();
                        throw th;
                    }
                    r24.A00.A4f(r24.A05, i5);
                    i3 = i4 + r24.A01.Aaq(r24.A05, bArr, 0, i2 + i4);
                    r22 = r24;
                } else if (i5 == AA7) {
                    byte[] bArr3 = r24.A05;
                    int Aaq = r4.Aaq(bArr3, bArr3, 0, 0);
                    r24.A00 = 0;
                    try {
                        r2 = r24;
                        i3 = Aaq - r24.A00.Aa9(r24.A05);
                        System.arraycopy(r24.A05, 0, bArr, i2, i3);
                        r2 = r24;
                        r22 = r24;
                    } catch (Throwable th2) {
                        th = th2;
                        r2.A01();
                    }
                } else {
                    r24.A01();
                    th = new AnonymousClass5JI("last block incomplete in decryption");
                    throw th;
                }
            } else if (r23 instanceof AnonymousClass5J9) {
                int i6 = r23.A00;
                if (i6 + i2 <= bArr.length) {
                    AnonymousClass5T1 r3 = r23.A01;
                    int AA72 = r3.AA7();
                    int i7 = i6 - AA72;
                    byte[] bArr4 = new byte[AA72];
                    if (r23.A02) {
                        if (i6 >= AA72) {
                            r3.Aaq(r23.A05, bArr4, 0, 0);
                            int i8 = r23.A00;
                            int i9 = i8;
                            if (i8 > AA72) {
                                while (true) {
                                    bArr2 = r23.A05;
                                    if (i8 == bArr2.length) {
                                        break;
                                    }
                                    AnonymousClass3K4.A16(bArr4, bArr2, i8 - AA72, i8);
                                    i8++;
                                }
                                for (int i10 = AA72; i10 != i9; i10++) {
                                    AnonymousClass3K2.A1U(bArr4, bArr2, i10 - AA72, bArr2[i10], i10);
                                }
                                AnonymousClass5T1 r1 = r23.A01;
                                if (r1 instanceof AnonymousClass59X) {
                                    ((AnonymousClass59X) r1).A01.Aaq(bArr2, bArr, AA72, i2);
                                } else {
                                    r1.Aaq(bArr2, bArr, AA72, i2);
                                }
                                System.arraycopy(bArr4, 0, bArr, i2 + AA72, i7);
                                i3 = r23.A00;
                                r22 = r23;
                            }
                        } else {
                            th = new AnonymousClass5JI("need at least one block of input for CTS");
                        }
                    } else if (i6 >= AA72) {
                        byte[] bArr5 = new byte[AA72];
                        if (i6 > AA72) {
                            if (r3 instanceof AnonymousClass59X) {
                                r3 = ((AnonymousClass59X) r3).A01;
                            }
                            r3.Aaq(r23.A05, bArr4, 0, 0);
                            for (int i11 = AA72; i11 != r23.A00; i11++) {
                                int i12 = i11 - AA72;
                                AnonymousClass3K2.A1U(r23.A05, bArr5, i11, bArr4[i12], i12);
                            }
                            System.arraycopy(r23.A05, AA72, bArr4, 0, i7);
                            r23.A01.Aaq(bArr4, bArr, 0, i2);
                            System.arraycopy(bArr5, 0, bArr, i2 + AA72, i7);
                            i3 = r23.A00;
                            r22 = r23;
                        } else {
                            r3.Aaq(r23.A05, bArr4, 0, 0);
                        }
                    } else {
                        th = new AnonymousClass5JI("need at least one block of input for CTS");
                    }
                    System.arraycopy(bArr4, 0, bArr, i2, AA72);
                    i3 = r23.A00;
                    r22 = r23;
                } else {
                    th = new AnonymousClass5JD("output buffer to small in doFinal");
                }
                throw th;
            } else {
                r2 = r23;
                int i13 = r23.A00;
                if (i2 + i13 <= bArr.length) {
                    i3 = 0;
                    r22 = r23;
                    if (i13 != 0) {
                        if (r23.A03) {
                            AnonymousClass5T1 r12 = r23.A01;
                            byte[] bArr6 = r23.A05;
                            r12.Aaq(bArr6, bArr6, 0, 0);
                            int i14 = r23.A00;
                            r23.A00 = 0;
                            System.arraycopy(r23.A05, 0, bArr, i2, i14);
                            i3 = i14;
                            r22 = r23;
                        } else {
                            th = new AnonymousClass5JI("data not block size aligned");
                        }
                    }
                } else {
                    r2 = r23;
                    th = new AnonymousClass5JD("output buffer too short for doFinal()");
                }
                throw th;
            }
            r22.A01();
            return i3;
        } catch (AnonymousClass5JC e2) {
            throw new BadPaddingException(e2.getMessage());
        }
    }

    public String A9q() {
        return this.A00.A01.A9q();
    }

    public int AE9(int i2) {
        C89424c9 r2 = this.A00;
        boolean z2 = r2 instanceof AnonymousClass5JA;
        int i3 = i2 + r2.A00;
        if (!z2) {
            return i3;
        }
        int length = r2.A05.length;
        int i4 = i3 % length;
        if (i4 != 0) {
            i3 -= i4;
        } else if (!r2.A02) {
            return i3;
        }
        return i3 + length;
    }

    public AnonymousClass5T1 AGk() {
        return this.A00.A01;
    }

    public int AGm(int i2) {
        return this.A00.A00(i2);
    }

    public void AI1(C46932Gv r4, boolean z2) {
        AnonymousClass5JA r2;
        AnonymousClass5T1 r0;
        C89424c9 r22 = this.A00;
        if (r22 instanceof AnonymousClass5JA) {
            AnonymousClass5JA r23 = (AnonymousClass5JA) r22;
            r23.A02 = z2;
            r23.A01();
            if (r4 instanceof C1053759g) {
                C1053759g r42 = (C1053759g) r4;
                r23.A00.AHy(r42.A00);
                r0 = r23.A01;
                r4 = r42.A01;
            } else {
                r23.A00.AHy((SecureRandom) null);
                r2 = r23;
                r0 = r2.A01;
            }
        } else {
            r22.A02 = z2;
            r22.A01();
            r2 = r22;
            r0 = r2.A01;
        }
        r0.AI1(r4, z2);
    }

    public int Aar(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        int i5;
        byte[] bArr3;
        int i6;
        C89424c9 r5 = this.A00;
        if (r5 instanceof AnonymousClass5JA) {
            if (i3 >= 0) {
                int AA7 = r5.A01.AA7();
                int A002 = r5.A00(i3);
                if (A002 <= 0 || A002 + i4 <= bArr2.length) {
                    bArr3 = r5.A05;
                    int length = bArr3.length;
                    int i7 = r5.A00;
                    int i8 = length - i7;
                    i5 = 0;
                    if (i3 > i8) {
                        System.arraycopy(bArr, i2, bArr3, i7, i8);
                        int Aaq = r5.A01.Aaq(r5.A05, bArr2, 0, i4);
                        r5.A00 = 0;
                        i3 -= i8;
                        i2 += i8;
                        i5 = Aaq;
                        while (true) {
                            bArr3 = r5.A05;
                            if (i3 <= bArr3.length) {
                                break;
                            }
                            i5 += r5.A01.Aaq(bArr, bArr2, i2, i4 + i5);
                            i3 -= AA7;
                            i2 += AA7;
                        }
                    }
                } else {
                    throw AnonymousClass5JD.A00();
                }
            } else {
                throw AnonymousClass000.A0T("Can't have a negative input length!");
            }
        } else if (r5 instanceof AnonymousClass5J9) {
            if (i3 >= 0) {
                int AA72 = r5.A01.AA7();
                int A003 = r5.A00(i3);
                if (A003 <= 0 || A003 + i4 <= bArr2.length) {
                    byte[] bArr4 = r5.A05;
                    int length2 = bArr4.length;
                    int i9 = r5.A00;
                    int i10 = length2 - i9;
                    int i11 = 0;
                    if (i3 > i10) {
                        System.arraycopy(bArr, i2, bArr4, i9, i10);
                        int Aaq2 = r5.A01.Aaq(r5.A05, bArr2, 0, i4);
                        byte[] bArr5 = r5.A05;
                        System.arraycopy(bArr5, AA72, bArr5, 0, AA72);
                        r5.A00 = AA72;
                        r10 = i3 - i10;
                        r9 = i2 + i10;
                        while (i3 > AA72) {
                            System.arraycopy(bArr, i2, r5.A05, r5.A00, AA72);
                            Aaq2 += r5.A01.Aaq(r5.A05, bArr2, 0, i4 + Aaq2);
                            byte[] bArr6 = r5.A05;
                            System.arraycopy(bArr6, AA72, bArr6, 0, AA72);
                            r10 = i3 - AA72;
                            r9 = i2 + AA72;
                        }
                        i11 = Aaq2;
                    }
                    bArr3 = r5.A05;
                } else {
                    throw AnonymousClass5JD.A00();
                }
            } else {
                throw AnonymousClass000.A0T("Can't have a negative input length!");
            }
        } else if (i3 >= 0) {
            int AA73 = r5.A01.AA7();
            int A004 = r5.A00(i3);
            if (A004 <= 0 || A004 + i4 <= bArr2.length) {
                byte[] bArr7 = r5.A05;
                int length3 = bArr7.length;
                int i12 = r5.A00;
                int i13 = length3 - i12;
                if (i3 > i13) {
                    System.arraycopy(bArr, i2, bArr7, i12, i13);
                    i6 = r5.A01.Aaq(r5.A05, bArr2, 0, i4);
                    r5.A00 = 0;
                    r10 = i3 - i13;
                    r9 = i2 + i13;
                    while (true) {
                        bArr7 = r5.A05;
                        if (i3 <= bArr7.length) {
                            break;
                        }
                        i6 += r5.A01.Aaq(bArr, bArr2, i2, i4 + i6);
                        r10 = i3 - AA73;
                        r9 = i2 + AA73;
                    }
                } else {
                    i6 = 0;
                }
                System.arraycopy(bArr, i2, bArr7, r5.A00, i3);
                int i14 = r5.A00 + i3;
                r5.A00 = i14;
                byte[] bArr8 = r5.A05;
                if (i14 != bArr8.length) {
                    return i6;
                }
                int Aaq3 = i6 + r5.A01.Aaq(bArr8, bArr2, 0, i4 + i6);
                r5.A00 = 0;
                return Aaq3;
            }
            throw AnonymousClass5JD.A00();
        } else {
            throw AnonymousClass000.A0T("Can't have a negative input length!");
        }
        System.arraycopy(bArr, i2, bArr3, r5.A00, i3);
        r5.A00 += i3;
        return i5;
    }

    public void AhM(byte[] bArr, int i2, int i3) {
        throw new UnsupportedOperationException("AAD is not supported in the current mode.");
    }

    public boolean AiB() {
        return !(this.A00 instanceof AnonymousClass5J9);
    }
}
