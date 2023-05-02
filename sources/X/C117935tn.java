package X;

import java.util.HashMap;

/* renamed from: X.5tn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117935tn {
    public final /* synthetic */ AnonymousClass1Z7 A00;

    public /* synthetic */ C117935tn(AnonymousClass1Z7 r1) {
        this.A00 = r1;
    }

    public final void A00(AnonymousClass2HJ r5, C117465t2 r6) {
        String str;
        AnonymousClass1Z7 r3 = this.A00;
        HashMap A0x = AnonymousClass000.A0x();
        if (r5 == null) {
            A0x.put("business_name", r6.A02);
            A0x.put("owner_full_name", r6.A04);
            A0x.put("verify_type", r6.A05);
            A0x.put("bank_name", r6.A01);
            A0x.put("credential_id", r6.A03);
            str = "on_success";
        } else {
            C110105dW.A1I(r5, A0x);
            str = "on_failure";
        }
        r3.A01(str, A0x);
    }
}
