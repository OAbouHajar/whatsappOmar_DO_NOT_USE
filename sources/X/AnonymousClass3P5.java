package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.3P5  reason: invalid class name */
public class AnonymousClass3P5 extends AnonymousClass05M {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public AnonymousClass3P5(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public void A06(View view, AnonymousClass031 r4) {
        super.A06(view, r4);
        r4.A0F("Button");
        AccessibilityNodeInfo accessibilityNodeInfo = r4.A01;
        accessibilityNodeInfo.setSelected(false);
        accessibilityNodeInfo.setContentDescription(this.A01);
        String str = this.A00;
        if (str != null) {
            AnonymousClass3K3.A18(r4, str);
        }
    }
}
