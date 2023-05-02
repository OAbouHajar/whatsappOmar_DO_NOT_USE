package X;

import android.util.Base64;

/* renamed from: X.22Y  reason: invalid class name */
public class AnonymousClass22Y {
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;

    public AnonymousClass22Y(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.A01 = bArr;
        this.A00 = bArr2;
        this.A02 = bArr3;
    }

    public String A00() {
        StringBuilder sb = new StringBuilder("AesKey=");
        sb.append(Base64.encodeToString(this.A01, 2));
        sb.append(";IV=");
        sb.append(Base64.encodeToString(this.A02, 2));
        sb.append(";Data=");
        sb.append(Base64.encodeToString(this.A00, 2));
        return sb.toString();
    }
}
