package X;

import java.security.cert.CertPathParameters;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.56o  reason: invalid class name and case insensitive filesystem */
public class C1047056o implements CertPathParameters {
    public final int A00;
    public final Set A01;
    public final C1047156p A02;

    public C1047056o(C88054Zs r2) {
        this.A02 = r2.A02;
        this.A01 = Collections.unmodifiableSet(r2.A01);
        this.A00 = r2.A00;
    }

    public Object clone() {
        return this;
    }
}
