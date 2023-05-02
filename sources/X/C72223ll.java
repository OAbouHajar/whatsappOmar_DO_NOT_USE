package X;

import java.util.List;

/* renamed from: X.3ll  reason: invalid class name and case insensitive filesystem */
public final class C72223ll extends C31301dt {
    public final AnonymousClass26B A00;
    public final List A01;
    public final AnonymousClass1DU A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72223ll(AnonymousClass26B r3, List list, AnonymousClass1DU r5) {
        super(AnonymousClass428.A0K, C798541o.UTILITY_MAP_VIEW);
        C18450wi.A0J(r3, r5);
        C18450wi.A0H(list, 3);
        this.A00 = r3;
        this.A02 = r5;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72223ll) {
                C72223ll r5 = (C72223ll) obj;
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
        StringBuilder A0r = AnonymousClass000.A0r("MapViewEntrypointItem(searchLocation=");
        A0r.append(this.A00);
        A0r.append(", entrypointClickListener=");
        A0r.append(this.A02);
        A0r.append(", businessProfiles=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
