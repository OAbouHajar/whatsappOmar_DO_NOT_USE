package X;

import com.obwhatsapp.SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment;
import com.obwhatsapp.SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment;

/* renamed from: X.4xk  reason: invalid class name and case insensitive filesystem */
public class C101704xk implements C32301g2 {
    public final C001000l A00;

    public C101704xk(C001000l r1) {
        this.A00 = r1;
    }

    public static void A00(C001000l r2) {
        AnonymousClass050 A0O = C13680ns.A0O(r2);
        A0O.A0C(new SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment(), (String) null);
        A0O.A02();
    }

    public void AVg(String str) {
        A00(this.A00);
    }

    public void AVh() {
        AnonymousClass050 A0O = C13680ns.A0O(this.A00);
        A0O.A0C(new SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment(), (String) null);
        A0O.A02();
    }

    public void AZJ(String str) {
        A00(this.A00);
    }

    public void AZK() {
        AnonymousClass050 A0O = C13680ns.A0O(this.A00);
        A0O.A0C(new SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment(), (String) null);
        A0O.A02();
    }
}
