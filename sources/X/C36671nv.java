package X;

import java.util.Arrays;

/* renamed from: X.1nv  reason: invalid class name and case insensitive filesystem */
public class C36671nv {
    public final byte A00;
    public final byte[] A01;

    public C36671nv(byte[] bArr, byte b2) {
        this.A01 = bArr;
        this.A00 = b2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C36671nv)) {
            return false;
        }
        return Arrays.equals(this.A01, ((C36671nv) obj).A01);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01);
    }
}
