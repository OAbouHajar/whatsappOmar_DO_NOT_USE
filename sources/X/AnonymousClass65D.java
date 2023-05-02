package X;

import com.obwhatsapp.payments.IDxRCallbackShape19S0200000_3_I0;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.65D  reason: invalid class name */
public final /* synthetic */ class AnonymousClass65D implements Runnable {
    public final /* synthetic */ IDxRCallbackShape19S0200000_3_I0 A00;
    public final /* synthetic */ AnonymousClass1TV A01;

    public /* synthetic */ AnonymousClass65D(IDxRCallbackShape19S0200000_3_I0 iDxRCallbackShape19S0200000_3_I0, AnonymousClass1TV r2) {
        this.A00 = iDxRCallbackShape19S0200000_3_I0;
        this.A01 = r2;
    }

    public final void run() {
        IDxRCallbackShape19S0200000_3_I0 iDxRCallbackShape19S0200000_3_I0 = this.A00;
        AnonymousClass1TV r4 = this.A01;
        C118485ul r5 = (C118485ul) iDxRCallbackShape19S0200000_3_I0.A00;
        C18290wS r3 = r5.A07;
        AnonymousClass160 A0H = C110115dX.A0H(r3);
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = A0H.A09().iterator();
        while (it.hasNext()) {
            A0u.add(C110115dX.A0F(it).A0A);
        }
        if (!A0u.isEmpty()) {
            Iterator it2 = A0u.iterator();
            while (it2.hasNext()) {
                it2.next();
                r3.A06();
                Log.w("PAY: removeMerchantPaymentMethod for nonSmbApp!");
            }
        }
        r5.A06.A05();
        r4.AWJ(new C77573vz());
    }
}
