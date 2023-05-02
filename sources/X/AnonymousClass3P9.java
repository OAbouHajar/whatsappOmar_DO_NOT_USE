package X;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.3P9  reason: invalid class name */
public class AnonymousClass3P9 extends AnonymousClass05M {
    public final /* synthetic */ View A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass3P9(View view, String str, String str2, boolean z2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = view;
        this.A03 = z2;
    }

    public void A06(View view, AnonymousClass031 r10) {
        super.A06(view, r10);
        r10.A0F("Button");
        AccessibilityNodeInfo accessibilityNodeInfo = r10.A01;
        accessibilityNodeInfo.setSelected(false);
        accessibilityNodeInfo.setContentDescription(this.A02);
        String str = this.A01;
        if (str != null) {
            AnonymousClass3K3.A18(r10, str);
        }
        View view2 = (View) this.A00.getParent();
        if (this.A03 && view2 != null) {
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            accessibilityNodeInfo.setBoundsInScreen(new Rect(i2, iArr[1], i2 + view2.getWidth(), iArr[1] + view2.getHeight()));
        }
    }
}
