package X;

import android.util.Log;
import androidx.biometric.BiometricFragment;
import java.util.concurrent.Executor;

/* renamed from: X.0Q8  reason: invalid class name */
public class AnonymousClass0Q8 {
    public AnonymousClass02C A00;

    public AnonymousClass0Q8(C05340Qi r4, C001000l r5, Executor executor) {
        String str;
        if (executor == null) {
            str = "Executor must not be null.";
        } else if (r4 != null) {
            AnonymousClass02C r2 = r5.A03.A00.A03;
            AnonymousClass0F6 r0 = (AnonymousClass0F6) new C006602z(r5).A01(AnonymousClass0F6.class);
            this.A00 = r2;
            if (r0 != null) {
                r0.A0H = executor;
                r0.A04 = r4;
                return;
            }
            return;
        } else {
            str = "AuthenticationCallback must not be null.";
        }
        throw AnonymousClass000.A0T(str);
    }

    public void A00() {
        String str;
        AnonymousClass02C r1 = this.A00;
        if (r1 == null) {
            str = "Unable to start authentication. Client fragment manager was null.";
        } else {
            BiometricFragment biometricFragment = (BiometricFragment) r1.A0B("androidx.biometric.BiometricFragment");
            if (biometricFragment == null) {
                str = "Unable to cancel authentication. BiometricFragment not found.";
            } else {
                biometricFragment.A1F(3);
                return;
            }
        }
        Log.e("BiometricPromptCompat", str);
    }

    public void A01(C05030Oy r5) {
        String str;
        if (r5 != null) {
            AnonymousClass02C r3 = this.A00;
            if (r3 == null) {
                str = "Unable to start authentication. Client fragment manager was null.";
            } else if (r3.A0o()) {
                str = "Unable to start authentication. Called after onSaveInstanceState().";
            } else {
                BiometricFragment biometricFragment = (BiometricFragment) r3.A0B("androidx.biometric.BiometricFragment");
                if (biometricFragment == null) {
                    biometricFragment = new BiometricFragment();
                    AnonymousClass050 r1 = new AnonymousClass050(r3);
                    r1.A0C(biometricFragment, "androidx.biometric.BiometricFragment");
                    r1.A00(true);
                    r3.A0m(true);
                    r3.A0K();
                }
                biometricFragment.A1J(r5);
                return;
            }
            Log.e("BiometricPromptCompat", str);
            return;
        }
        throw AnonymousClass000.A0T("PromptInfo cannot be null.");
    }
}
