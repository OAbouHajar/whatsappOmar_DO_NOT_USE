package X;

import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.util.Set;

/* renamed from: X.4Zs  reason: invalid class name and case insensitive filesystem */
public class C88054Zs {
    public int A00 = 5;
    public Set A01 = C13680ns.A0o();
    public final C1047156p A02;

    public C88054Zs(C1047156p r2) {
        this.A02 = r2;
    }

    public C88054Zs(PKIXBuilderParameters pKIXBuilderParameters) {
        this.A02 = new C1047156p(new C88434aU((PKIXParameters) pKIXBuilderParameters));
        this.A00 = pKIXBuilderParameters.getMaxPathLength();
    }
}
