package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.obwhatsapp.CodeInputField;

/* renamed from: X.3P4  reason: invalid class name */
public class AnonymousClass3P4 extends AnonymousClass05M {
    public final /* synthetic */ CodeInputField A00;
    public final /* synthetic */ String A01;

    public AnonymousClass3P4(CodeInputField codeInputField, String str) {
        this.A00 = codeInputField;
        this.A01 = str;
    }

    public void A06(View view, AnonymousClass031 r4) {
        super.A06(view, r4);
        String A0d = AnonymousClass000.A0d(this);
        AccessibilityNodeInfo accessibilityNodeInfo = r4.A01;
        accessibilityNodeInfo.setClassName(A0d);
        accessibilityNodeInfo.setContentDescription(this.A01);
    }
}
