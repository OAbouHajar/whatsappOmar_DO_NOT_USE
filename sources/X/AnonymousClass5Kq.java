package X;

import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5Kq  reason: invalid class name */
public class AnonymousClass5Kq extends AnonymousClass5BX {
    public int A00 = 5;
    public Set A01 = Collections.EMPTY_SET;

    public AnonymousClass5Kq(Set set, C109955Ul r3) {
        super(set);
        this.A07 = r3 != null ? (C109955Ul) r3.clone() : null;
    }

    public void A00(PKIXParameters pKIXParameters) {
        super.A00(pKIXParameters);
        if (pKIXParameters instanceof AnonymousClass5Kq) {
            AnonymousClass5Kq r1 = (AnonymousClass5Kq) pKIXParameters;
            this.A00 = r1.A00;
            this.A01 = new HashSet(r1.A01);
        }
        if (pKIXParameters instanceof PKIXBuilderParameters) {
            this.A00 = ((PKIXBuilderParameters) pKIXParameters).getMaxPathLength();
        }
    }

    public Object clone() {
        try {
            Set<TrustAnchor> trustAnchors = getTrustAnchors();
            C109955Ul r0 = this.A07;
            AnonymousClass5Kq r02 = new AnonymousClass5Kq(trustAnchors, r0 != null ? (C109955Ul) r0.clone() : null);
            r02.A00(this);
            return r02;
        } catch (Exception e2) {
            throw AnonymousClass000.A0a(e2.getMessage());
        }
    }
}
