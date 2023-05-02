package X;

import java.util.HashMap;

/* renamed from: X.5to  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117945to {
    public final /* synthetic */ AnonymousClass1Z7 A00;

    public /* synthetic */ C117945to(AnonymousClass1Z7 r1) {
        this.A00 = r1;
    }

    public final void A00(AnonymousClass2HJ r4) {
        AnonymousClass1Z7 r2 = this.A00;
        if (r4 == null) {
            r2.A00("on_success");
            return;
        }
        HashMap A0x = AnonymousClass000.A0x();
        C110105dW.A1I(r4, A0x);
        r2.A01("on_failure", A0x);
    }
}
