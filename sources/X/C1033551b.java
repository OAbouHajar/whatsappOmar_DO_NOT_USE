package X;

import com.obwhatsapp.registration.VerifyPhoneNumber;

/* renamed from: X.51b  reason: invalid class name and case insensitive filesystem */
public class C1033551b implements AnonymousClass5S5 {
    public final /* synthetic */ VerifyPhoneNumber A00;

    public C1033551b(VerifyPhoneNumber verifyPhoneNumber) {
        this.A00 = verifyPhoneNumber;
    }

    public void Aao() {
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        if (verifyPhoneNumber.A0j.A03("android.permission.RECEIVE_SMS") == 0) {
            verifyPhoneNumber.A3a(verifyPhoneNumber.A0B, verifyPhoneNumber.A0C);
        } else {
            AnonymousClass2JN.A0J(verifyPhoneNumber, 701);
        }
    }

    public void Ag9() {
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        verifyPhoneNumber.A1P = true;
        verifyPhoneNumber.A3a(verifyPhoneNumber.A0B, verifyPhoneNumber.A0C);
    }
}
