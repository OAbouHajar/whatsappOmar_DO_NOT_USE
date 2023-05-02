package X;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.spec.ECGenParameterSpec;

/* renamed from: X.5u1  reason: invalid class name and case insensitive filesystem */
public class C118075u1 {
    public final AnonymousClass1Vo A00 = C110105dW.A0Q("Secp256r1KeyStoreHelper", "infra");
    public final KeyStore A01;

    public C118075u1(KeyStore keyStore) {
        this.A01 = keyStore;
    }

    public KeyPair A00() {
        try {
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("alias-payments-br-trusted-device-key", 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setKeySize(256).setDigests(new String[]{"SHA-256"}).build();
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            instance.initialize(build);
            return instance.generateKeyPair();
        } catch (Exception e2) {
            this.A00.A0A("", e2);
            return null;
        }
    }
}
