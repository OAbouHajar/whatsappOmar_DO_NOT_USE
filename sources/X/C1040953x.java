package X;

import com.obwhatsapp.youbasha.ui.lockV2.LockUtils;

/* renamed from: X.53x  reason: invalid class name and case insensitive filesystem */
public final class C1040953x implements C109065Qo, C109085Qq {
    public final C28371Vv A00;
    public final AnonymousClass4T2 A01;

    public C1040953x(C16300so r2, C28371Vv r3) {
        AnonymousClass3K3.A1G(r3);
        this.A01 = (AnonymousClass4T2) AnonymousClass3K2.A0b(r2, r3, 93);
        this.A00 = r3;
    }

    public void A4K(AnonymousClass4HW r2) {
        r2.A00 = "423";
        r2.A01 = LockUtils.PATTERN_LOCK;
    }

    public void A4Q(AnonymousClass4QD r1) {
        r1.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1040953x.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C1040953x) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
