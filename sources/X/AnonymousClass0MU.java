package X;

import android.support.v4.view.MotionEventCompat;
import androidx.core.view.ViewCompat;

/* renamed from: X.0MU  reason: invalid class name */
public final class AnonymousClass0MU {
    public static int A00(int i2, float f2) {
        return (i2 & ViewCompat.MEASURED_SIZE_MASK) | (Math.max(0, Math.min((int) (f2 * 255.0f), MotionEventCompat.ACTION_MASK)) << 24);
    }

    public static void A01(int[] iArr, float f2, int i2, int i3) {
        iArr[i3] = A00(i2, f2);
    }
}
