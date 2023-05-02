package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.4Pi  reason: invalid class name and case insensitive filesystem */
public class C85644Pi {
    public void A00(byte[] bArr, byte[] bArr2, long j2) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-512");
            instance.update(bArr2, 0, (int) j2);
            byte[] digest = instance.digest();
            System.arraycopy(digest, 0, bArr, 0, digest.length);
        } catch (NoSuchAlgorithmException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }
}
