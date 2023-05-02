package X;

import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* renamed from: X.1CU  reason: invalid class name */
public class AnonymousClass1CU {
    public static String A00(Map map) {
        C29241aH r1 = new C29241aH(map);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            do {
            } while (new DigestInputStream(r1, instance).read() != -1);
            return C004101u.A05(instance.digest());
        } catch (IOException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }
}
