package X;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0Tm  reason: invalid class name and case insensitive filesystem */
public class C05910Tm {
    public final Object A00;

    public C05910Tm(Object obj) {
        this.A00 = obj;
    }

    public static C05910Tm A00(float f2, float f3, float f4, int i2) {
        return new C05910Tm(Build.VERSION.SDK_INT >= 19 ? AccessibilityNodeInfo.RangeInfo.obtain(i2, f2, f3, f4) : null);
    }
}
