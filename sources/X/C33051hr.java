package X;

import java.io.IOException;

/* renamed from: X.1hr  reason: invalid class name and case insensitive filesystem */
public class C33051hr extends C32051fZ {
    public static final C33051hr A01 = new C33051hr((byte) 0);
    public static final C33051hr A02 = new C33051hr((byte) -1);
    public final byte A00;

    public C33051hr(byte b2) {
        this.A00 = b2;
    }

    public static C33051hr A00(Object obj) {
        if (obj == null || (obj instanceof C33051hr)) {
            return (C33051hr) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C33051hr) C32051fZ.A02((byte[]) obj);
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder("failed to construct boolean from byte[]: ");
                sb.append(e2.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("illegal object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static C33051hr A01(C107525In r2) {
        C32051fZ Agm = r2.A01.Agm();
        if (Agm instanceof C33051hr) {
            return A00(Agm);
        }
        byte[] bArr = C107405Ib.A01(Agm).A00;
        if (bArr.length == 1) {
            byte b2 = bArr[0];
            return b2 != -1 ? b2 != 0 ? new C33051hr(b2) : A01 : A02;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    public C32051fZ A05() {
        return this.A00 != 0 ? A02 : A01;
    }

    public int hashCode() {
        return this.A00 != 0 ? 1 : 0;
    }

    public String toString() {
        return this.A00 != 0 ? "TRUE" : "FALSE";
    }
}
