package X;

import java.util.List;

/* renamed from: X.3lm  reason: invalid class name and case insensitive filesystem */
public final class C72233lm extends C31301dt {
    public final AnonymousClass26B A00;
    public final AnonymousClass4DP A01;
    public final List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72233lm(AnonymousClass26B r2, AnonymousClass4DP r3, List list) {
        super(AnonymousClass428.A0N);
        C18450wi.A0I(r2, 1, r3);
        this.A00 = r2;
        this.A02 = list;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72233lm) {
                C72233lm r5 = (C72233lm) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A01, AnonymousClass000.A0E(this.A02, AnonymousClass3K3.A0H(this.A00)));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("NearbyBusinessWidgetListItem(searchLocation=");
        A0r.append(this.A00);
        A0r.append(", businessProfiles=");
        A0r.append(this.A02);
        A0r.append(", nearbyBusinessClickListener=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
