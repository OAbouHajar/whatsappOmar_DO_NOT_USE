package X;

import androidx.biometric.BiometricFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.0fQ  reason: invalid class name and case insensitive filesystem */
public class C09390fQ implements Runnable {
    public final WeakReference A00;

    public C09390fQ(BiometricFragment biometricFragment) {
        this.A00 = new WeakReference(biometricFragment);
    }

    public void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((BiometricFragment) weakReference.get()).A1B();
        }
    }
}
