package X;

import java.io.IOException;

/* renamed from: X.5IP  reason: invalid class name */
public class AnonymousClass5IP extends C32061fa implements AnonymousClass5NM {
    public int A00;
    public C32071fb A01;

    public AnonymousClass5IP(C32071fb r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public AnonymousClass5IP(AnonymousClass5IQ r2) {
        this.A01 = r2;
        this.A00 = 4;
    }

    public AnonymousClass5IP(String str) {
        this.A00 = 1;
        this.A01 = new C33021ho(str);
    }

    public static AnonymousClass5IP A00(Object obj) {
        C32071fb r0;
        if (obj == null || (obj instanceof AnonymousClass5IP)) {
            return (AnonymousClass5IP) obj;
        }
        if (obj instanceof C107525In) {
            C107525In r4 = (C107525In) obj;
            int i2 = r4.A00;
            switch (i2) {
                case 0:
                case 3:
                case 5:
                    return new AnonymousClass5IP(C32411gJ.A01(r4, false), i2);
                case 1:
                case 2:
                case 6:
                    C32051fZ A002 = C107525In.A00(r4);
                    return new AnonymousClass5IP(A002 instanceof C33021ho ? C33021ho.A00(A002) : new C33021ho(C107405Ib.A01(A002).A00), i2);
                case 4:
                    return new AnonymousClass5IP(AnonymousClass5IQ.A01(C32411gJ.A01(r4, true)), i2);
                case 7:
                    return new AnonymousClass5IP(C107405Ib.A03(r4, false), i2);
                case 8:
                    C32051fZ A003 = C107525In.A00(r4);
                    if (A003 instanceof C32041fY) {
                        r0 = C32041fY.A00(A003);
                    } else {
                        byte[] bArr = C107405Ib.A01(A003).A00;
                        r0 = (C32061fa) C32041fY.A02.get(new C33101hw(bArr));
                        if (r0 == null) {
                            r0 = new C32041fY(bArr);
                        }
                    }
                    return new AnonymousClass5IP(r0, i2);
                default:
                    throw AnonymousClass000.A0T(C13680ns.A0c(i2, "unknown tag: "));
            }
        } else if (obj instanceof byte[]) {
            try {
                return A00(C32051fZ.A02((byte[]) obj));
            } catch (IOException unused) {
                throw AnonymousClass000.A0T("unable to parse encoded general name");
            }
        } else {
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(AnonymousClass000.A0d(obj), AnonymousClass000.A0r("unknown object in getInstance: ")));
        }
    }

    public C32051fZ Agm() {
        int i2 = this.A00;
        return new C107625Ix(this.A01, i2, AnonymousClass000.A1R(i2, 4));
    }

    public String toString() {
        String AGJ;
        Object A012;
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = this.A00;
        stringBuffer.append(i2);
        stringBuffer.append(": ");
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 4) {
                A012 = AnonymousClass5IQ.A01(this.A01);
            } else if (i2 != 6) {
                A012 = this.A01;
            }
            AGJ = A012.toString();
            stringBuffer.append(AGJ);
            return stringBuffer.toString();
        }
        AGJ = C33021ho.A00(this.A01).AGJ();
        stringBuffer.append(AGJ);
        return stringBuffer.toString();
    }
}
