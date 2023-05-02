package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.61D  reason: invalid class name */
public class AnonymousClass61D implements AnonymousClass690 {
    public final /* synthetic */ AnonymousClass1Z7 A00;
    public final /* synthetic */ C112855jo A01;

    public AnonymousClass61D(AnonymousClass1Z7 r1, C112855jo r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void ASW(AnonymousClass2HJ r4) {
        C112855jo.A09(this.A00, (Map) null, r4.A00);
    }

    public void ASX(C35451lx r4) {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("kyc_status", r4.A02);
        this.A00.A01("on_success", A0x);
    }
}
