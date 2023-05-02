package X;

import com.obwhatsapp.growthlock.InviteLinkUnavailableDialogFragment;

/* renamed from: X.2BW  reason: invalid class name */
public class AnonymousClass2BW {
    public static void A00(C14550pN r2, C15810rt r3, C15830rv r4) {
        C34141jl r0;
        AnonymousClass00B.A06(r4);
        C15840rx A06 = r3.A06(r4);
        if (A06 == null || (r0 = A06.A0a) == null || r0.A00 != 1) {
            r2.startActivity(C14750ph.A0H(r2, r4));
        } else {
            r2.Afc(InviteLinkUnavailableDialogFragment.A01(false, true));
        }
    }

    public static boolean A01(C16070sO r3, C16010sH r4, C217915l r5, C16050sL r6) {
        return r3.A09(r6) && r3.A0A(r6) && !r5.A00(r4);
    }
}
