package X;

import java.util.Arrays;

/* renamed from: X.4UA  reason: invalid class name */
public class AnonymousClass4UA {
    public int A00;
    public byte[] A01;

    public AnonymousClass4UA(byte[] bArr, int i2) {
        this.A01 = C33111hx.A02(bArr);
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass4UA) {
            AnonymousClass4UA r4 = (AnonymousClass4UA) obj;
            if (r4.A00 == this.A00) {
                return Arrays.equals(this.A01, r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.A00 ^ C33111hx.A00(this.A01);
    }
}
