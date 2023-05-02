package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.0An  reason: invalid class name and case insensitive filesystem */
public class C02240An extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ C05330Qh A00;

    public C02240An(C05330Qh r1) {
        this.A00 = r1;
    }

    public void onAuthenticationError(int i2, CharSequence charSequence) {
        this.A00.A01(i2, charSequence);
    }

    public void onAuthenticationFailed() {
        this.A00.A00();
    }

    public void onAuthenticationHelp(int i2, CharSequence charSequence) {
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        AnonymousClass0Wh r3;
        IdentityCredential A01;
        if (authenticationResult != null) {
            BiometricPrompt.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
            r3 = null;
            if (cryptoObject != null) {
                Cipher cipher = cryptoObject.getCipher();
                if (cipher != null) {
                    r3 = new AnonymousClass0Wh(cipher);
                } else {
                    Signature signature = cryptoObject.getSignature();
                    if (signature != null) {
                        r3 = new AnonymousClass0Wh(signature);
                    } else {
                        Mac mac = cryptoObject.getMac();
                        if (mac != null) {
                            r3 = new AnonymousClass0Wh(mac);
                        } else if (Build.VERSION.SDK_INT >= 30 && (A01 = AnonymousClass0SQ.A01(cryptoObject)) != null) {
                            r3 = new AnonymousClass0Wh(A01);
                        }
                    }
                }
            }
        } else {
            r3 = null;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = -1;
        if (i2 >= 30) {
            if (authenticationResult != null) {
                i3 = AnonymousClass0L7.A00(authenticationResult);
            }
        } else if (i2 != 29) {
            i3 = 2;
        }
        this.A00.A02(new C04730Nr(r3, i3));
    }
}
