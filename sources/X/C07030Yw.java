package X;

import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0Yw  reason: invalid class name and case insensitive filesystem */
public final class C07030Yw implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final C12400kK A00;

    public C07030Yw(C12400kK r1) {
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07030Yw)) {
            return false;
        }
        return this.A00.equals(((C07030Yw) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void onTouchExplorationStateChanged(boolean z2) {
        this.A00.onTouchExplorationStateChanged(z2);
    }
}
