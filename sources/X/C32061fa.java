package X;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: X.1fa  reason: invalid class name and case insensitive filesystem */
public abstract class C32061fa implements C32071fb {
    public void A00(OutputStream outputStream, String str) {
        if (this instanceof C32051fZ) {
            (str.equals("DER") ? new C33071ht(outputStream) : str.equals("DL") ? new C33081hu(outputStream) : new C33061hs(outputStream)).A04((C32051fZ) this, true);
        } else {
            (str.equals("DER") ? new C33071ht(outputStream) : str.equals("DL") ? new C33081hu(outputStream) : new C33061hs(outputStream)).A04(Agm(), true);
        }
    }

    public byte[] A01() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this instanceof C32051fZ) {
            new C33061hs(byteArrayOutputStream).A04((C32051fZ) this, true);
        } else {
            new C33061hs(byteArrayOutputStream).A04(Agm(), true);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] A02(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        A00(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }

    public C32051fZ Agm() {
        if (!(this instanceof C33091hv)) {
            return (C32051fZ) this;
        }
        C33091hv r2 = (C33091hv) this;
        C32391gH r1 = new C32391gH(2);
        C33051hr r0 = r2.A00;
        if (r0 != null) {
            r1.A02(r0);
        }
        C33041hq r02 = r2.A01;
        if (r02 != null) {
            r1.A02(r02);
        }
        return new C32401gI(r1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32071fb)) {
            return false;
        }
        return Agm().A04(((C32071fb) obj).Agm());
    }

    public int hashCode() {
        return Agm().hashCode();
    }
}
