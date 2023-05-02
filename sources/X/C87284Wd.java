package X;

import android.support.v4.view.MotionEventCompat;
import java.io.EOFException;

/* renamed from: X.4Wd  reason: invalid class name and case insensitive filesystem */
public final class C87284Wd {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public final C90504eH A05 = C90504eH.A05(MotionEventCompat.ACTION_MASK);
    public final int[] A06 = new int[MotionEventCompat.ACTION_MASK];

    public boolean A00(C55142iu r12, long j2) {
        C90524eJ.A03(AnonymousClass000.A1P((r12.AF7() > r12.AEy() ? 1 : (r12.AF7() == r12.AEy() ? 0 : -1))));
        C90504eH r8 = this.A05;
        r8.A0Q(4);
        while (true) {
            if (j2 != -1 && r12.AF7() + 4 >= j2) {
                break;
            }
            try {
                if (!r12.AaM(r8.A02, 0, 4, true)) {
                    break;
                }
                r8.A0S(0);
                if (r8.A0I() == 1332176723) {
                    r12.AcS();
                    return true;
                }
                r12.Afx(1);
            } catch (EOFException unused) {
            }
        }
        do {
            if ((j2 != -1 && r12.AF7() >= j2) || r12.Afv(1) == -1) {
                return false;
            }
            break;
        } while (r12.Afv(1) == -1);
        return false;
    }

    public boolean A01(C55142iu r13, boolean z2) {
        this.A03 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
        C90504eH r4 = this.A05;
        r4.A0Q(27);
        try {
            if (r13.AaM(r4.A02, 0, 27, z2) && r4.A0I() == 1332176723) {
                if (r4.A0C() == 0) {
                    this.A03 = r4.A0C();
                    byte[] bArr = r4.A02;
                    int i2 = r4.A01;
                    int i3 = i2 + 1;
                    r4.A01 = i3;
                    int i4 = i3 + 1;
                    r4.A01 = i4;
                    int i5 = i4 + 1;
                    r4.A01 = i5;
                    int i6 = i5 + 1;
                    r4.A01 = i6;
                    int i7 = i6 + 1;
                    r4.A01 = i7;
                    int i8 = i7 + 1;
                    r4.A01 = i8;
                    int i9 = i8 + 1;
                    r4.A01 = i9;
                    long j2 = (((long) bArr[i2]) & 255) | ((((long) bArr[i3]) & 255) << 8) | ((((long) bArr[i4]) & 255) << 16) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 32) | ((((long) bArr[i7]) & 255) << 40) | ((((long) bArr[i8]) & 255) << 48);
                    r4.A01 = i9 + 1;
                    this.A04 = ((((long) bArr[i9]) & 255) << 56) | j2;
                    r4.A0G();
                    r4.A0G();
                    r4.A0G();
                    int A0C = r4.A0C();
                    this.A02 = A0C;
                    this.A01 = A0C + 27;
                    r4.A0Q(A0C);
                    C90504eH.A06(r13, r4, A0C);
                    for (int i10 = 0; i10 < this.A02; i10++) {
                        int[] iArr = this.A06;
                        int A0C2 = r4.A0C();
                        iArr[i10] = A0C2;
                        this.A00 += A0C2;
                    }
                    return true;
                } else if (!z2) {
                    throw AnonymousClass40M.A00("unsupported bit stream revision");
                }
            }
        } catch (EOFException e2) {
            if (!z2) {
                throw e2;
            }
        }
        return false;
    }
}
