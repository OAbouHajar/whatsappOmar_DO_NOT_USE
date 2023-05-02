package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: X.0Bx  reason: invalid class name and case insensitive filesystem */
public class C02440Bx extends AccessibilityNodeProvider {
    public final C06200Ur A00;

    public C02440Bx(C06200Ur r1) {
        this.A00 = r1;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        AnonymousClass031 A002 = this.A00.A00(i2);
        if (A002 == null) {
            return null;
        }
        return A002.A01;
    }

    public List findAccessibilityNodeInfosByText(String str, int i2) {
        return null;
    }

    public boolean performAction(int i2, int i3, Bundle bundle) {
        return this.A00.A02(i2, i3, bundle);
    }
}
