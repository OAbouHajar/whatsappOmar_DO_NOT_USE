package X;

import com.obwhatsapp.calling.telecom.SelfManagedConnectionService;
import com.obwhatsapp.service.UnsentMessagesNetworkAvailableJob;

/* renamed from: X.2uj  reason: invalid class name and case insensitive filesystem */
public final class C59132uj extends AnonymousClass54H {
    public AnonymousClass01J A00;
    public AnonymousClass01J A01;
    public AnonymousClass01J A02;
    public final C59132uj A03 = this;
    public final C16150sX A04;

    public /* synthetic */ C59132uj(C16150sX r3) {
        this.A04 = r3;
        this.A00 = C17280up.A00(new C1050558a(this, r3, 0));
        this.A01 = C17280up.A00(new C1050558a(this, r3, 1));
        this.A02 = C17280up.A00(new C1050558a(this, r3, 2));
    }

    public void A00(SelfManagedConnectionService selfManagedConnectionService) {
        selfManagedConnectionService.A00 = (C216514x) this.A04.ALV.get();
    }

    public void A01(UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob) {
        C16150sX r1 = this.A04;
        unsentMessagesNetworkAvailableJob.A05 = C16150sX.A1B(r1);
        unsentMessagesNetworkAvailableJob.A04 = (C19090xk) r1.AF1.get();
        unsentMessagesNetworkAvailableJob.A01 = (C19150xq) r1.AFC.get();
        unsentMessagesNetworkAvailableJob.A03 = (AnonymousClass119) r1.APO.get();
        unsentMessagesNetworkAvailableJob.A02 = (C16900tq) r1.AFT.get();
    }

    public final C615039e A02() {
        C16150sX r0 = this.A04;
        return new C615039e(C16150sX.A0V(r0), (C19380yL) r0.AQd.get(), C16150sX.A0Z(r0));
    }
}
