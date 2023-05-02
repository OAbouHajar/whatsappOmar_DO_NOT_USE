package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.0gg  reason: invalid class name and case insensitive filesystem */
public class C10160gg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public C10160gg(BiometricFragment biometricFragment, CharSequence charSequence, int i2) {
        this.A01 = biometricFragment;
        this.A00 = i2;
        this.A02 = charSequence;
    }

    public void run() {
        AnonymousClass0F6 r0 = this.A01.A01;
        C05340Qi r2 = r0.A04;
        if (r2 == null) {
            r2 = new AnonymousClass0DI(r0);
            r0.A04 = r2;
        }
        r2.A01(this.A00, this.A02);
    }
}
