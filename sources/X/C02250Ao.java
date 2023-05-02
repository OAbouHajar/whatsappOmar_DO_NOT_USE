package X;

import android.hardware.fingerprint.FingerprintManager;

/* renamed from: X.0Ao  reason: invalid class name and case insensitive filesystem */
public class C02250Ao extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ C009404l A00;

    public C02250Ao(C009404l r1) {
        this.A00 = r1;
    }

    public void onAuthenticationError(int i2, CharSequence charSequence) {
        this.A00.A01(i2, charSequence);
    }

    public void onAuthenticationFailed() {
        this.A00.A00();
    }

    public void onAuthenticationHelp(int i2, CharSequence charSequence) {
        this.A00.A02(i2, charSequence);
    }

    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        this.A00.A03(new AnonymousClass0NQ(C009304k.A03(C009504n.A01(authenticationResult))));
    }
}
