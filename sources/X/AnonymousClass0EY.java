package X;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0EY  reason: invalid class name */
public class AnonymousClass0EY extends C06200Ur {
    public final /* synthetic */ AnonymousClass0EL A00;

    public AnonymousClass0EY(AnonymousClass0EL r1) {
        this.A00 = r1;
    }

    public AnonymousClass031 A00(int i2) {
        return new AnonymousClass031(AccessibilityNodeInfo.obtain(this.A00.A08(i2).A01));
    }

    public AnonymousClass031 A01(int i2) {
        AnonymousClass0EL r0 = this.A00;
        int i3 = i2 == 2 ? r0.A00 : r0.A01;
        if (i3 == Integer.MIN_VALUE) {
            return null;
        }
        return A00(i3);
    }

    public boolean A02(int i2, int i3, Bundle bundle) {
        int i4;
        int i5;
        AnonymousClass0EL r2 = this.A00;
        if (i2 == -1) {
            return r2.A06.performAccessibilityAction(i3, bundle);
        }
        if (i3 == 1) {
            return r2.A0G(i2);
        }
        if (i3 != 2) {
            if (i3 == 64) {
                AccessibilityManager accessibilityManager = r2.A07;
                if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i5 = r2.A00) == i2) {
                    return false;
                }
                if (i5 != Integer.MIN_VALUE && i5 == i5) {
                    r2.A00 = Integer.MIN_VALUE;
                    r2.A06.invalidate();
                    r2.A0B(i5, AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED);
                }
                r2.A00 = i2;
                r2.A06.invalidate();
                i4 = 32768;
            } else if (i3 != 128) {
                return r2.A0H(i2, i3, bundle);
            } else {
                if (r2.A00 != i2) {
                    return false;
                }
                r2.A00 = Integer.MIN_VALUE;
                r2.A06.invalidate();
                i4 = AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
            }
        } else if (r2.A01 != i2) {
            return false;
        } else {
            r2.A01 = Integer.MIN_VALUE;
            i4 = 8;
        }
        r2.A0B(i2, i4);
        return true;
    }
}
