package X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: X.2cR  reason: invalid class name and case insensitive filesystem */
public class C51882cR {
    public final Map A00;
    public final byte[] A01;

    public C51882cR(Map map, byte[] bArr) {
        this.A01 = bArr;
        this.A00 = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C51882cR r4 = (C51882cR) obj;
            if (Arrays.equals(this.A01, r4.A01)) {
                return this.A00.equals(r4.A00);
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.A01) * 31) + this.A00.hashCode();
    }
}
