package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.0gh  reason: invalid class name and case insensitive filesystem */
public class C10170gh implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public C10170gh(BiometricFragment biometricFragment, CharSequence charSequence, int i2) {
        this.A01 = biometricFragment;
        this.A00 = i2;
        this.A02 = charSequence;
    }

    public void run() {
        BiometricFragment biometricFragment = this.A01;
        biometricFragment.A1H(this.A00, this.A02);
        biometricFragment.A19();
    }
}
