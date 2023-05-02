package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.0fz  reason: invalid class name and case insensitive filesystem */
public class C09730fz implements Runnable {
    public final /* synthetic */ BiometricFragment A00;
    public final /* synthetic */ C04730Nr A01;

    public C09730fz(BiometricFragment biometricFragment, C04730Nr r2) {
        this.A00 = biometricFragment;
        this.A01 = r2;
    }

    public void run() {
        AnonymousClass0F6 r0 = this.A00.A01;
        C05340Qi r1 = r0.A04;
        if (r1 == null) {
            r1 = new AnonymousClass0DI(r0);
            r0.A04 = r1;
        }
        r1.A02(this.A01);
    }
}
