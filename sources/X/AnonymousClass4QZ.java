package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.4QZ  reason: invalid class name */
public class AnonymousClass4QZ {
    public byte[] A00;

    public AnonymousClass4QZ(byte[] bArr) {
        try {
            this.A00 = bArr.length > 32 ? MessageDigest.getInstance("SHA-256").digest(bArr) : bArr;
        } catch (NoSuchAlgorithmException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }

    public void A00(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(this.A00);
            this.A00 = instance.digest(bArr);
        } catch (NoSuchAlgorithmException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }
}
