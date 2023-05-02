package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.0fO  reason: invalid class name and case insensitive filesystem */
public class C09370fO implements Runnable {
    public final /* synthetic */ BiometricFragment A00;

    public C09370fO(BiometricFragment biometricFragment) {
        this.A00 = biometricFragment;
    }

    public void run() {
        AnonymousClass0F6 r1 = this.A00.A01;
        C05340Qi r0 = r1.A04;
        if (r0 == null) {
            r0 = new AnonymousClass0DI(r1);
            r1.A04 = r0;
        }
        r0.A00();
    }
}
