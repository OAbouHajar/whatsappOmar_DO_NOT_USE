package X;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0WL  reason: invalid class name */
public class AnonymousClass0WL {
    public final Object A00;

    public AnonymousClass0WL(Object obj) {
        this.A00 = obj;
    }

    public static AnonymousClass0WL A00(int i2) {
        return new AnonymousClass0WL(Build.VERSION.SDK_INT >= 19 ? AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i2, 1, false) : null);
    }

    public static AnonymousClass0WL A01(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        int i6 = Build.VERSION.SDK_INT;
        return new AnonymousClass0WL(i6 >= 21 ? AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2, z3) : i6 >= 19 ? AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2) : null);
    }

    public int A02() {
        if (Build.VERSION.SDK_INT >= 19) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.A00).getColumnIndex();
        }
        return 0;
    }

    public int A03() {
        if (Build.VERSION.SDK_INT >= 19) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.A00).getColumnSpan();
        }
        return 0;
    }

    public int A04() {
        if (Build.VERSION.SDK_INT >= 19) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.A00).getRowIndex();
        }
        return 0;
    }

    public int A05() {
        if (Build.VERSION.SDK_INT >= 19) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.A00).getRowSpan();
        }
        return 0;
    }

    public boolean A06() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.A00).isSelected();
        }
        return false;
    }
}
