package X;

import java.security.cert.CertSelector;
import java.security.cert.PKIXParameters;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4aU  reason: invalid class name and case insensitive filesystem */
public class C88434aU {
    public int A00 = 0;
    public List A01 = AnonymousClass000.A0u();
    public List A02 = AnonymousClass000.A0u();
    public Map A03 = AnonymousClass000.A0x();
    public Map A04 = AnonymousClass000.A0x();
    public Set A05;
    public AnonymousClass5AH A06;
    public boolean A07;
    public boolean A08 = false;
    public final PKIXParameters A09;
    public final Date A0A;
    public final Date A0B;

    public C88434aU(C1047156p r3) {
        this.A09 = r3.A01;
        this.A0B = r3.A03;
        this.A0A = r3.A02;
        this.A06 = r3.A09;
        this.A02 = C13680ns.A0n(r3.A05);
        this.A04 = new HashMap(r3.A07);
        this.A01 = C13680ns.A0n(r3.A04);
        this.A03 = new HashMap(r3.A06);
        this.A08 = r3.A0B;
        this.A00 = r3.A00;
        this.A07 = r3.A0A;
        this.A05 = r3.A08;
    }

    public C88434aU(PKIXParameters pKIXParameters) {
        this.A09 = (PKIXParameters) pKIXParameters.clone();
        CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
        if (targetCertConstraints != null) {
            this.A06 = new AnonymousClass5AH((CertSelector) targetCertConstraints.clone());
        }
        Date date = pKIXParameters.getDate();
        this.A0B = date;
        this.A0A = date == null ? new Date() : date;
        this.A07 = pKIXParameters.isRevocationEnabled();
        this.A05 = pKIXParameters.getTrustAnchors();
    }
}
