package X;

import java.util.Enumeration;

/* renamed from: X.5Hx  reason: invalid class name and case insensitive filesystem */
public class C107365Hx extends C32061fa {
    public AnonymousClass5HY A00;
    public AnonymousClass5II A01;

    public C107365Hx(C32411gJ r3) {
        if (r3.A0A() == 2) {
            Enumeration A0B = r3.A0B();
            this.A01 = AnonymousClass5II.A00(A0B.nextElement());
            this.A00 = AnonymousClass5HY.A00(A0B.nextElement());
            return;
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0l(AnonymousClass000.A0r("Bad sequence size: "), r3.A0A()));
    }

    public static C107365Hx A00(Object obj) {
        if (obj instanceof C107365Hx) {
            return (C107365Hx) obj;
        }
        if (obj != null) {
            return new C107365Hx(C32411gJ.A00(obj));
        }
        return null;
    }

    public C32051fZ Agm() {
        C32391gH A0v = AnonymousClass3K3.A0v();
        A0v.A02(this.A01);
        return AnonymousClass3K3.A0x(this.A00, A0v);
    }
}
