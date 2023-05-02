package X;

/* renamed from: X.5Hp  reason: invalid class name */
public class AnonymousClass5Hp extends C32061fa {
    public C32041fY A00;
    public C32411gJ A01;

    public AnonymousClass5Hp(C32411gJ r4) {
        if (r4.A0A() < 1 || r4.A0A() > 2) {
            throw AnonymousClass000.A0T(AnonymousClass000.A0l(AnonymousClass000.A0r("Bad sequence size: "), r4.A0A()));
        }
        this.A00 = C32041fY.A00(AnonymousClass3K3.A0u(r4));
        if (r4.A0A() > 1) {
            this.A01 = C32411gJ.A00(r4.A0C(1));
        }
    }

    public C32051fZ Agm() {
        C32391gH A0v = AnonymousClass3K3.A0v();
        A0v.A02(this.A00);
        C32411gJ r0 = this.A01;
        if (r0 != null) {
            A0v.A02(r0);
        }
        return new C32401gI(A0v);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Policy information: ");
        stringBuffer.append(this.A00);
        C32411gJ r4 = this.A01;
        if (r4 != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i2 = 0; i2 < r4.A0A(); i2++) {
                if (stringBuffer2.length() != 0) {
                    stringBuffer2.append(", ");
                }
                Object A0C = r4.A0C(i2);
                if (!(A0C instanceof AnonymousClass5Hi)) {
                    A0C = A0C != null ? new AnonymousClass5Hi(C32411gJ.A00(A0C)) : null;
                }
                stringBuffer2.append(A0C);
            }
            stringBuffer.append("[");
            stringBuffer.append(stringBuffer2);
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }
}
