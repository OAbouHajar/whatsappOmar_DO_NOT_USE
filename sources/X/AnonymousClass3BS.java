package X;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: X.3BS  reason: invalid class name */
public class AnonymousClass3BS {
    public static String A00() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder A0o = AnonymousClass000.A0o();
        int i2 = 0;
        do {
            A0o.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+{}".charAt(secureRandom.nextInt(76)));
            i2++;
        } while (i2 < 50);
        return A0o.toString();
    }

    public static String A01(PublicKey publicKey) {
        StringBuilder A0r = AnonymousClass000.A0r("-----BEGIN PUBLIC KEY-----\n");
        A0r.append(Base64.encodeToString(publicKey.getEncoded(), 2));
        return AnonymousClass000.A0h("\n-----END PUBLIC KEY-----\n", A0r);
    }

    public static KeyPair A02() {
        KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
        instance.initialize(2048);
        return instance.generateKeyPair();
    }

    public static PublicKey A03(String str) {
        if (!str.startsWith("-----BEGIN PUBLIC KEY-----\n") || !str.endsWith("\n-----END PUBLIC KEY-----\n")) {
            throw new InvalidKeySpecException("malformed string");
        }
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.substring(26, str.length() - 26), 2)));
    }
}
