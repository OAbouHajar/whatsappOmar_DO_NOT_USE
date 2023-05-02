package X;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;

/* renamed from: X.5pB  reason: invalid class name and case insensitive filesystem */
public class C115125pB {
    public static PublicKey A00() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder("payment_bio_key_alias", 4).setDigests(new String[]{"SHA-256"}).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setUserAuthenticationRequired(true);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                userAuthenticationRequired.setUserAuthenticationParameters(0, 2);
            } else {
                userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(-1);
            }
            if (i2 >= 24) {
                userAuthenticationRequired.setInvalidatedByBiometricEnrollment(true);
            }
            instance.initialize(userAuthenticationRequired.build());
            return instance.generateKeyPair().getPublic();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e2) {
            throw new RuntimeException(AnonymousClass000.A0l(AnonymousClass000.A0r("FingerprintHelper/generateKey generateKey: api="), Build.VERSION.SDK_INT), e2);
        }
    }
}
