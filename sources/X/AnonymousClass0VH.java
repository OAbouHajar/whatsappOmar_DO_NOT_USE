package X;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import java.lang.reflect.Method;

/* renamed from: X.0VH  reason: invalid class name */
public class AnonymousClass0VH {
    public static int A00(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static BiometricManager A01(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    public static Method A02() {
        try {
            return AnonymousClass000.A0s(BiometricManager.class, BiometricPrompt.CryptoObject.class, "canAuthenticate", new Class[1], 0);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
