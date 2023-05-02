package X;

import java.util.Enumeration;

/* renamed from: X.5Hr  reason: invalid class name */
public class AnonymousClass5Hr extends C32061fa {
    public C33041hq A00;
    public C107405Ib A01;
    public AnonymousClass5IG A02;

    public AnonymousClass5Hr(C32411gJ r6) {
        Enumeration A0B = r6.A0B();
        while (A0B.hasMoreElements()) {
            C107525In A012 = C107525In.A01(A0B.nextElement());
            int i2 = A012.A00;
            if (i2 == 0) {
                this.A01 = C107405Ib.A03(A012, false);
            } else if (i2 == 1) {
                this.A02 = new AnonymousClass5IG(C32411gJ.A01(A012, false));
            } else if (i2 == 2) {
                this.A00 = C33041hq.A01(A012, false);
            } else {
                throw AnonymousClass000.A0T("illegal tag");
            }
        }
    }

    public C32051fZ Agm() {
        C32391gH r3 = new C32391gH(3);
        C107405Ib r0 = this.A01;
        if (r0 != null) {
            C107525In.A04(r0, r3, false);
        }
        AnonymousClass5IG r1 = this.A02;
        if (r1 != null) {
            C107525In.A03(r1, r3, 1, false);
        }
        C33041hq r12 = this.A00;
        if (r12 != null) {
            C107525In.A03(r12, r3, 2, false);
        }
        return new C32401gI(r3);
    }

    public String toString() {
        C107405Ib r0 = this.A01;
        String A002 = r0 != null ? C90584eP.A00(r0.A00) : "null";
        StringBuilder A0r = AnonymousClass000.A0r("AuthorityKeyIdentifier: KeyID(");
        A0r.append(A002);
        return AnonymousClass000.A0h(")", A0r);
    }
}
