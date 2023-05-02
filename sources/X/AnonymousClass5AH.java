package X;

import java.security.cert.CertSelector;
import java.security.cert.Certificate;

/* renamed from: X.5AH  reason: invalid class name */
public class AnonymousClass5AH implements C109955Ul {
    public final CertSelector A00;

    public AnonymousClass5AH(CertSelector certSelector) {
        this.A00 = certSelector;
    }

    public /* bridge */ /* synthetic */ boolean ALL(Object obj) {
        return this.A00.match((Certificate) obj);
    }

    public Object clone() {
        return new AnonymousClass5AH(this.A00);
    }
}
