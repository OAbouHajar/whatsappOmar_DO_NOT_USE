package X;

import com.facebook.redex.RunnableRunnableShape15S0200000_I1_3;
import com.obwhatsapp.registration.VerifyPhoneNumber;

/* renamed from: X.3Gr  reason: invalid class name and case insensitive filesystem */
public class C63243Gr implements AnonymousClass5S6 {
    public final /* synthetic */ VerifyPhoneNumber A00;

    public C63243Gr(VerifyPhoneNumber verifyPhoneNumber) {
        this.A00 = verifyPhoneNumber;
    }

    public /* bridge */ /* synthetic */ void AOt(Object obj) {
        C84844Mc r5 = (C84844Mc) obj;
        int i2 = r5.A00;
        if (i2 == 1) {
            VerifyPhoneNumber verifyPhoneNumber = this.A00;
            C005702l A09 = AnonymousClass2JN.A09(verifyPhoneNumber);
            verifyPhoneNumber.A0U = A09;
            RunnableRunnableShape15S0200000_I1_3 runnableRunnableShape15S0200000_I1_3 = new RunnableRunnableShape15S0200000_I1_3(this, 9, r5);
            if (A09 == null) {
                runnableRunnableShape15S0200000_I1_3.run();
            } else {
                verifyPhoneNumber.A05.A0L(runnableRunnableShape15S0200000_I1_3, 1000);
            }
        } else if (i2 == 11) {
            VerifyPhoneNumber verifyPhoneNumber2 = this.A00;
            verifyPhoneNumber2.A11.A0A(7);
            verifyPhoneNumber2.A17.A04(verifyPhoneNumber2.A38(), "successful");
            verifyPhoneNumber2.A2X(C14750ph.A0p(verifyPhoneNumber2, verifyPhoneNumber2.A1F), false);
            verifyPhoneNumber2.finish();
        } else if (i2 == 13) {
            this.A00.A0x.A01(45);
        }
    }

    public void AQR(int i2) {
    }
}
