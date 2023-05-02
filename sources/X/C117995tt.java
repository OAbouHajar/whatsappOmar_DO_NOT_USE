package X;

import android.app.Activity;
import com.obwhatsapp.payments.receiver.IndiaUpiPayIntentReceiverActivity;

/* renamed from: X.5tt  reason: invalid class name and case insensitive filesystem */
public class C117995tt {
    public final AnonymousClass175 A00;

    public C117995tt(AnonymousClass175 r1) {
        this.A00 = r1;
    }

    public void A00(Activity activity) {
        boolean z2;
        Class<IndiaUpiPayIntentReceiverActivity> cls = IndiaUpiPayIntentReceiverActivity.class;
        AnonymousClass175 r1 = this.A00;
        if (r1.A0D()) {
            z2 = true;
        } else {
            r1.A0E();
            z2 = false;
        }
        AnonymousClass01R.A01(activity, cls, z2);
    }
}
