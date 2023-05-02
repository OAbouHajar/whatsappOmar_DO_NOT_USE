package X;

import java.util.Locale;

/* renamed from: X.2gS  reason: invalid class name and case insensitive filesystem */
public class C53882gS implements AnonymousClass1TV {
    public int A00 = 0;
    public final /* synthetic */ C227219a A01;
    public final /* synthetic */ AnonymousClass13O A02;

    public C53882gS(C227219a r2, AnonymousClass13O r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void A00() {
        int i2 = this.A00;
        AnonymousClass13O r0 = this.A02;
        if (i2 < 3) {
            r0.A0D.A08(this);
            this.A00++;
            return;
        }
        r0.A0G.A05(String.format(Locale.US, "AccountRecoveryNotification: sendGetPaymentMethods retry failed, attempts made: %d", new Object[]{Integer.valueOf(i2)}));
    }

    public void AWC(AnonymousClass2HJ r3) {
        this.A02.A0G.A05("AccountRecoveryNotification: sendGetPaymentMethods request error");
        A00();
    }

    public void AWI(AnonymousClass2HJ r3) {
        this.A02.A0G.A05("AccountRecoveryNotification: sendGetPaymentMethods response error");
        A00();
    }

    public void AWJ(AnonymousClass2HK r4) {
        AnonymousClass13O r2 = this.A02;
        r2.A0G.A06("AccountRecoveryNotification: sendGetPaymentMethods success");
        C18290wS r22 = r2.A0F;
        r22.A06();
        AnonymousClass160 r1 = r22.A09;
        if (r1 != null) {
            r22.A06();
            if (r1.A06() != null) {
                r22.A06();
                C30671cl A06 = r1.A06();
                if (A06 != null) {
                    C227219a r23 = this.A01;
                    r23.AhX(A06.A08);
                    r23.A7n((String) null, false);
                }
            }
        }
    }
}
