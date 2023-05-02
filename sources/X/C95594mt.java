package X;

import android.app.ActivityManager;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4mt  reason: invalid class name and case insensitive filesystem */
public class C95594mt implements C12860l5 {
    public static final long A01 = TimeUnit.MINUTES.toMillis(5);
    public final ActivityManager A00;

    public C95594mt(ActivityManager activityManager) {
        this.A00 = activityManager;
    }

    public /* bridge */ /* synthetic */ Object get() {
        int i2;
        int min = Math.min(this.A00.getMemoryClass() * AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START, Integer.MAX_VALUE);
        if (min < 33554432) {
            i2 = 4194304;
        } else {
            i2 = min >> 2;
            if (min < 67108864) {
                i2 = 6291456;
            }
        }
        return new C83214Fu(A01, i2);
    }
}
