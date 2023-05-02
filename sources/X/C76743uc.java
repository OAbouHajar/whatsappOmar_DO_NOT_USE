package X;

import android.app.Activity;

/* renamed from: X.3uc  reason: invalid class name and case insensitive filesystem */
public class C76743uc extends AnonymousClass2K1 {
    public boolean A00;
    public boolean A01;
    public boolean A02;

    public C76743uc(Activity activity, C14870pt r2, C16080sP r3, AnonymousClass12W r4, C14730pf r5, C16010sH r6, C16490t9 r7) {
        super(activity, r2, r3, r4, r5, r6, r7);
    }

    public void AQ4(C31701et r4, C30761cu r5) {
        if (!r4.A02()) {
            int i2 = r4.A01;
            if (i2 == 9) {
                if (!this.A02) {
                    A00(r4);
                    this.A02 = true;
                }
            } else if (i2 == 4) {
                if (!this.A00) {
                    A00(r4);
                    this.A00 = true;
                }
            } else if (i2 != 2 && i2 != 3 && i2 != 11) {
                A00(r4);
            } else if (!this.A01) {
                A00(r4);
                this.A01 = true;
            }
        }
    }
}
