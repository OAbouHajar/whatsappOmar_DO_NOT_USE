package X;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: X.0PY  reason: invalid class name */
public class AnonymousClass0PY {
    public BiometricPrompt.AuthenticationCallback A00;
    public C009404l A01;
    public final C05330Qh A02;

    public AnonymousClass0PY(C05330Qh r1) {
        this.A02 = r1;
    }

    public BiometricPrompt.AuthenticationCallback A00() {
        BiometricPrompt.AuthenticationCallback authenticationCallback = this.A00;
        if (authenticationCallback != null) {
            return authenticationCallback;
        }
        BiometricPrompt.AuthenticationCallback A002 = AnonymousClass0L6.A00(this.A02);
        this.A00 = A002;
        return A002;
    }
}
