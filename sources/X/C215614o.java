package X;

import android.content.SharedPreferences;

/* renamed from: X.14o  reason: invalid class name and case insensitive filesystem */
public class C215614o {
    public final AnonymousClass01V A00;
    public final C15860rz A01;
    public final C14710pd A02;
    public final C215514n A03;
    public final C17020u3 A04;

    public C215614o(AnonymousClass01V r1, C15860rz r2, C14710pd r3, C215514n r4, C17020u3 r5) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
    }

    public AnonymousClass1XN A00(byte b2, boolean z2) {
        Float A012;
        if (b2 != 1 && b2 != 23 && b2 != 37 && b2 != 42) {
            return null;
        }
        AnonymousClass1XN A013 = A01(z2);
        if (z2) {
            return A013;
        }
        C14710pd r6 = this.A02;
        C16620tM r2 = C16620tM.A02;
        if (!r6.A0E(r2, 700)) {
            return A013;
        }
        int A032 = r6.A03(r2, 1574);
        int A033 = r6.A03(r2, 1575);
        if (500 > A032 || A032 > 4000 || 20 > A033 || A033 > 100) {
            return A013;
        }
        int i2 = ((SharedPreferences) this.A01.A01.get()).getInt("photo_quality", 0);
        if (!r6.A0E(r2, 702) || i2 == 0) {
            if (!r6.A0E(r2, 701)) {
                return A013;
            }
            if (C42971z5.A02(this.A00, this.A04) < 2013 || (A012 = this.A03.A01(0)) == null) {
                return A013;
            }
            float floatValue = A012.floatValue();
            if (floatValue <= 20.0f || floatValue < ((float) r6.A03(r2, 1573))) {
                return A013;
            }
        } else if (i2 != 1) {
            return A013;
        }
        return new AnonymousClass1XN(r6.A03(r2, 1577), A033, A032, A013.A00);
    }

    public final AnonymousClass1XN A01(boolean z2) {
        int A032;
        int i2;
        C14710pd r4 = this.A02;
        C16620tM r1 = C16620tM.A02;
        int A033 = r4.A03(r1, 1577);
        if (z2) {
            A032 = r4.A03(r1, 1581);
            i2 = 1580;
        } else {
            A032 = r4.A03(r1, 1578);
            i2 = 1576;
        }
        int A034 = r4.A03(r1, i2);
        return new AnonymousClass1XN(A033, A032, A034, A034);
    }
}
