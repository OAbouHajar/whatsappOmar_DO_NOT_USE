package X;

import com.facebook.redex.IDxECallbackShape326S0100000_2_I1;
import com.obwhatsapp.account.delete.DeleteAccountConfirmation;

/* renamed from: X.4uz  reason: invalid class name and case insensitive filesystem */
public class C100034uz implements C19480yV {
    public final /* synthetic */ DeleteAccountConfirmation A00;

    public C100034uz(DeleteAccountConfirmation deleteAccountConfirmation) {
        this.A00 = deleteAccountConfirmation;
    }

    public void ASz() {
        DeleteAccountConfirmation deleteAccountConfirmation = this.A00;
        AnonymousClass29T.A00(deleteAccountConfirmation, 1);
        deleteAccountConfirmation.A2X(C14750ph.A01(deleteAccountConfirmation), true);
    }

    public void AT0() {
        DeleteAccountConfirmation deleteAccountConfirmation = this.A00;
        AnonymousClass14L r0 = deleteAccountConfirmation.A07;
        AnonymousClass144 r3 = AnonymousClass147.A00;
        if (r0.A00(r3) != null) {
            deleteAccountConfirmation.A07.A03(new IDxECallbackShape326S0100000_2_I1(deleteAccountConfirmation, 0), r3);
        }
        deleteAccountConfirmation.A01.removeMessages(0);
    }
}
