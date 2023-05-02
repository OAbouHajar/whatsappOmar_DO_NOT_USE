package X;

import java.util.Arrays;

/* renamed from: X.1cD  reason: invalid class name and case insensitive filesystem */
public class C30351cD {
    public final byte A00;
    public final byte[] A01;

    public C30351cD(byte[] bArr, byte b2) {
        this.A01 = bArr;
        this.A00 = b2;
    }

    public byte[] A00() {
        return C28641Wx.A04(new byte[]{this.A00}, this.A01);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C30351cD)) {
            return false;
        }
        return Arrays.equals(this.A01, ((C30351cD) obj).A01);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01);
    }
}
