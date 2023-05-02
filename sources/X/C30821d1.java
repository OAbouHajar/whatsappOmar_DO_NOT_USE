package X;

/* renamed from: X.1d1  reason: invalid class name and case insensitive filesystem */
public class C30821d1 {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public C30821d1(byte[] bArr, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EncryptedMessage{ciphertextVersion=");
        sb.append(this.A01);
        sb.append(", ciphertextType=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
