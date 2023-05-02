package X;

import java.util.Enumeration;

/* renamed from: X.5IR  reason: invalid class name */
public class AnonymousClass5IR extends C32061fa implements C32031fX {
    public C32071fb A00;
    public C32041fY A01;
    public boolean A02 = true;

    public AnonymousClass5IR(C32071fb r2, C32041fY r3) {
        this.A01 = r3;
        this.A00 = r2;
    }

    public AnonymousClass5IR(C32411gJ r3) {
        Enumeration A0B = r3.A0B();
        this.A01 = (C32041fY) A0B.nextElement();
        if (A0B.hasMoreElements()) {
            this.A00 = C107525In.A00((C107525In) A0B.nextElement());
        }
        this.A02 = r3 instanceof C107545Ip;
    }

    public C32051fZ Agm() {
        C32391gH A0v = AnonymousClass3K3.A0v();
        A0v.A02(this.A01);
        C32071fb r3 = this.A00;
        if (r3 != null) {
            A0v.A02(new C107605Iv(r3, 0, true));
        }
        return this.A02 ? new C107545Ip(A0v) : new C107555Iq(A0v);
    }
}
