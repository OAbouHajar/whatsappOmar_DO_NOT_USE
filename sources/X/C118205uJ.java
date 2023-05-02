package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5uJ  reason: invalid class name and case insensitive filesystem */
public class C118205uJ {
    public final AnonymousClass160 A00;
    public final AnonymousClass1JN A01;
    public final C18280wR A02;

    public C118205uJ(AnonymousClass160 r1, AnonymousClass1JN r2, C18280wR r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public AnonymousClass1WD A00(AnonymousClass5Q8 r11, AnonymousClass5QA r12, C1220968g r13, String str, String str2) {
        AnonymousClass1WD r2 = new AnonymousClass1WD();
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("action", "start");
        A0x.put("credential_id", str);
        C35391lr r0 = (C35391lr) this.A00.A08(str);
        if (r0 != null) {
            A0x.put("network", C35391lr.A06(r0.A01));
        }
        A0x.put("device_id", this.A02.A01());
        AnonymousClass1JN r4 = this.A01;
        r4.A01.A0I.put("PaymentData", r12);
        AnonymousClass5Q8 r5 = r11;
        r4.A00(r5, new C1204361q(r2, r13, this), new AnonymousClass4W4(A0x, "br_p2p_verify_card", "CardAddedScreen"), str2, (Map) null);
        return r2;
    }
}
