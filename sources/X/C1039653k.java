package X;

import com.whatsapp.util.Log;

/* renamed from: X.53k  reason: invalid class name and case insensitive filesystem */
public final class C1039653k implements C109055Qn, C109065Qo, C109085Qq {
    public final C28371Vv A00;
    public final AnonymousClass54C A01;

    public C1039653k(C16300so r2, C28371Vv r3) {
        AnonymousClass3K3.A1G(r3);
        this.A01 = (AnonymousClass54C) AnonymousClass3K2.A0b(r2, r3, 143);
        this.A00 = r3;
    }

    public void A4K(AnonymousClass4HW r2) {
        r2.A00 = "400";
        r2.A01 = "bad-request";
    }

    public void A4P(C82694Du r3) {
        Log.i(C18450wi.A06("Fetching parent participants failed: ", "400"));
    }

    public void A4Q(AnonymousClass4QD r1) {
        r1.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1039653k.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C1039653k) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
