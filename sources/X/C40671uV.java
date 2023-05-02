package X;

import java.util.Arrays;

/* renamed from: X.1uV  reason: invalid class name and case insensitive filesystem */
public class C40671uV {
    public final int A00;
    public final byte[] A01;
    public final byte[] A02;

    public C40671uV(byte[] bArr, byte[] bArr2, int i2) {
        this.A00 = i2;
        this.A02 = bArr;
        this.A01 = bArr2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetCipherKeyResult [code=");
        sb.append(this.A00);
        sb.append(", key=");
        sb.append(Arrays.toString(this.A02));
        sb.append(", accountHash=");
        sb.append(Arrays.toString(this.A01));
        sb.append("]");
        return sb.toString();
    }
}
