package X;

import java.security.cert.CertPathParameters;
import java.security.cert.PKIXParameters;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.56p  reason: invalid class name and case insensitive filesystem */
public class C1047156p implements CertPathParameters {
    public final int A00;
    public final PKIXParameters A01;
    public final Date A02;
    public final Date A03;
    public final List A04;
    public final List A05;
    public final Map A06;
    public final Map A07;
    public final Set A08;
    public final AnonymousClass5AH A09;
    public final boolean A0A;
    public final boolean A0B;

    public C1047156p(C88434aU r3) {
        this.A01 = r3.A09;
        this.A03 = r3.A0B;
        this.A02 = r3.A0A;
        this.A05 = Collections.unmodifiableList(r3.A02);
        this.A07 = Collections.unmodifiableMap(new HashMap(r3.A04));
        this.A04 = Collections.unmodifiableList(r3.A01);
        this.A06 = Collections.unmodifiableMap(new HashMap(r3.A03));
        this.A09 = r3.A06;
        this.A0A = r3.A07;
        this.A0B = r3.A08;
        this.A00 = r3.A00;
        this.A08 = Collections.unmodifiableSet(r3.A05);
    }

    public Object clone() {
        return this;
    }
}
