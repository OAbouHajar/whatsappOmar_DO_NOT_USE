package X;

import com.obwhatsapp.payments.IDxRCallbackShape19S0200000_3_I0;

/* renamed from: X.63h  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1208663h implements Runnable {
    public final /* synthetic */ IDxRCallbackShape19S0200000_3_I0 A00;

    public /* synthetic */ C1208663h(IDxRCallbackShape19S0200000_3_I0 iDxRCallbackShape19S0200000_3_I0) {
        this.A00 = iDxRCallbackShape19S0200000_3_I0;
    }

    public final void run() {
        AnonymousClass5vZ r6 = (AnonymousClass5vZ) this.A00.A00;
        C18300wT r5 = r6.A05;
        long j2 = r5.A01().getLong("payments_enabled_till", -1);
        if (r6 instanceof C112495ia) {
            r6.A07.A01(true, false);
        } else {
            r6.A07.A01(false, false);
        }
        r5.A0C(0, j2);
    }
}
