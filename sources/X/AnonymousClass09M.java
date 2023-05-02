package X;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.09M  reason: invalid class name */
public class AnonymousClass09M {
    public final Object A00;

    public AnonymousClass09M(Object obj) {
        this.A00 = obj;
    }

    public static AnonymousClass09M A00(int i2) {
        return new AnonymousClass09M(Build.VERSION.SDK_INT >= 19 ? AccessibilityNodeInfo.CollectionInfo.obtain(1, i2, false) : null);
    }

    public static AnonymousClass09M A01(int i2, int i3, int i4, boolean z2) {
        int i5 = Build.VERSION.SDK_INT;
        return new AnonymousClass09M(i5 >= 21 ? AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z2, i4) : i5 >= 19 ? AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z2) : null);
    }
}
