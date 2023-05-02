package X;

import com.obwhatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import java.util.HashMap;

/* renamed from: X.61U  reason: invalid class name */
public class AnonymousClass61U implements AnonymousClass696 {
    public final /* synthetic */ AnonymousClass1Z7 A00;
    public final /* synthetic */ C112855jo A01;

    public AnonymousClass61U(AnonymousClass1Z7 r1, C112855jo r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void AQW(AnonymousClass2HJ r4) {
        int i2 = r4.A00;
        if (i2 == 10756) {
            this.A00.A00("on_failure");
        } else if (i2 == 10755) {
            this.A01.Afc(PaymentsUnavailableDialogFragment.A01());
        } else {
            HashMap A0x = AnonymousClass000.A0x();
            A0x.put("error_code", String.valueOf(i2));
            this.A00.A01("on_exception", A0x);
        }
    }

    public void ATr(boolean z2) {
        this.A00.A00("on_success");
    }
}
