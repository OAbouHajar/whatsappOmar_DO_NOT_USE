package X;

/* renamed from: X.1ho  reason: invalid class name and case insensitive filesystem */
public class C33021ho extends C32051fZ implements C33031hp {
    public final byte[] A00;

    public C33021ho(String str) {
        if (str != null) {
            this.A00 = C32941ha.A03(str);
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    public C33021ho(byte[] bArr) {
        this.A00 = bArr;
    }

    public static C33021ho A00(Object obj) {
        if (obj == null || (obj instanceof C33021ho)) {
            return (C33021ho) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C33021ho) C32051fZ.A02((byte[]) obj);
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("encoding error in getInstance: ");
                sb.append(e2.toString());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("illegal object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public String AGJ() {
        return C32941ha.A02(this.A00);
    }

    public int hashCode() {
        return C33111hx.A00(this.A00);
    }

    public String toString() {
        return C32941ha.A02(this.A00);
    }
}
