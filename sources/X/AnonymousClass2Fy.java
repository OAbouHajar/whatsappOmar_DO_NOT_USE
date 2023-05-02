package X;

import java.util.Arrays;

/* renamed from: X.2Fy  reason: invalid class name */
public class AnonymousClass2Fy {
    public final C40731ub A00;
    public final byte[] A01;
    public final byte[] A02;

    public AnonymousClass2Fy(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.A00 = new C40731ub(str, bArr, bArr2, bArr3, bArr5);
        this.A02 = bArr4;
        this.A01 = bArr6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BackupKey [");
        sb.append(this.A00.toString());
        sb.append(", hashedGoogleId=");
        sb.append(Arrays.toString(this.A02));
        sb.append(", cipherKey=");
        sb.append(Arrays.toString(this.A01));
        sb.append("]");
        return sb.toString();
    }
}
