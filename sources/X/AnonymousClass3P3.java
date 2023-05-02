package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.3P3  reason: invalid class name */
public class AnonymousClass3P3 extends AnonymousClass05M {
    public final C31201dg A00;

    public AnonymousClass3P3(C31201dg r1) {
        this.A00 = r1;
    }

    public void A06(View view, AnonymousClass031 r6) {
        super.A06(view, r6);
        C31201dg r3 = this.A00;
        String A0J = r3.A0J(36);
        String A0J2 = r3.A0J(38);
        if (A0J != null) {
            r6.A01.setContentDescription(A0J);
        }
        C806044s.A00(view.getContext(), view, r6, A0J2);
        String A0J3 = r3.A0J(40);
        if (A0J3 != null) {
            AnonymousClass3K3.A18(r6, A0J3);
        }
        boolean A0P = r3.A0P(42, false);
        boolean A0P2 = r3.A0P(43, false);
        AccessibilityNodeInfo accessibilityNodeInfo = r6.A01;
        accessibilityNodeInfo.setSelected(A0P);
        accessibilityNodeInfo.setEnabled(!A0P2);
    }
}
