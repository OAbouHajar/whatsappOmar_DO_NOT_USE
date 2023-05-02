package X;

import androidx.fragment.app.DialogFragment;

/* renamed from: X.28a  reason: invalid class name and case insensitive filesystem */
public class C453428a {
    public static void A00(DialogFragment dialogFragment, AnonymousClass02C r3) {
        String name = dialogFragment.getClass().getName();
        if (r3.A0B(name) == null) {
            dialogFragment.A1G(r3, name);
        }
    }

    public static void A01(DialogFragment dialogFragment, AnonymousClass02C r3) {
        String name = dialogFragment.getClass().getName();
        if (r3.A0B(name) == null) {
            AnonymousClass050 r0 = new AnonymousClass050(r3);
            r0.A0C(dialogFragment, name);
            r0.A02();
        }
    }
}
