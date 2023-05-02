package X;

import android.security.keystore.KeyGenParameterSpec;

/* renamed from: X.0WU  reason: invalid class name */
public class AnonymousClass0WU {
    public static KeyGenParameterSpec.Builder A00() {
        return new KeyGenParameterSpec.Builder("androidxBiometric", 3);
    }

    public static KeyGenParameterSpec A01(KeyGenParameterSpec.Builder builder) {
        return builder.build();
    }

    public static void A02(KeyGenParameterSpec.Builder builder) {
        builder.setBlockModes(new String[]{"CBC"});
    }

    public static void A03(KeyGenParameterSpec.Builder builder) {
        builder.setEncryptionPaddings(new String[]{"PKCS7Padding"});
    }
}
