package X;

import com.obwhatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import java.util.HashMap;

/* renamed from: X.61T  reason: invalid class name */
public class AnonymousClass61T implements AnonymousClass695 {
    public final /* synthetic */ AnonymousClass1Z7 A00;
    public final /* synthetic */ C112855jo A01;

    public AnonymousClass61T(AnonymousClass1Z7 r1, C112855jo r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void APy(boolean z2) {
        this.A00.A00("on_success");
    }

    public void AQW(AnonymousClass2HJ r5) {
        boolean z2;
        C112855jo r3 = this.A01;
        r3.A0J.A01.A06(AnonymousClass000.A0g("maybeHandleUnderageError: ", r5));
        if (r5.A00 == 2896001) {
            r3.Afc(PaymentsUnavailableDialogFragment.A02());
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.A00.A00("on_failure");
            return;
        }
        int i2 = r5.A00;
        if (i2 == 10755) {
            this.A00.A00("on_failure");
            r3.Afc(PaymentsUnavailableDialogFragment.A01());
            return;
        }
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("error_code", String.valueOf(i2));
        this.A00.A01("on_exception", A0x);
    }
}
