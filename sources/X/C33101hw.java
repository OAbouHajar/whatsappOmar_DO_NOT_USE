package X;

import java.util.Arrays;

/* renamed from: X.1hw  reason: invalid class name and case insensitive filesystem */
public class C33101hw {
    public final int A00;
    public final byte[] A01;

    public C33101hw(byte[] bArr) {
        this.A00 = C33111hx.A00(bArr);
        this.A01 = bArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C33101hw) {
            return Arrays.equals(this.A01, ((C33101hw) obj).A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A00;
    }
}
