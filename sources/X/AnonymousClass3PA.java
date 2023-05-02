package X;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.3PA  reason: invalid class name */
public class AnonymousClass3PA extends AnonymousClass05M {
    public final TextInputLayout A00;

    public AnonymousClass3PA(TextInputLayout textInputLayout) {
        this.A00 = textInputLayout;
    }

    public void A02(View view, AccessibilityEvent accessibilityEvent) {
        super.A02(view, accessibilityEvent);
        TextInputLayout textInputLayout = this.A00;
        EditText editText = textInputLayout.A0L;
        CharSequence text = editText != null ? editText.getText() : null;
        if (TextUtils.isEmpty(text)) {
            text = textInputLayout.getHint();
        }
        if (!TextUtils.isEmpty(text)) {
            accessibilityEvent.getText().add(text);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (r4 != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        if (android.text.TextUtils.isEmpty(r6) == false) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r11, X.AnonymousClass031 r12) {
        /*
            r10 = this;
            super.A06(r11, r12)
            com.google.android.material.textfield.TextInputLayout r1 = r10.A00
            android.widget.EditText r0 = r1.A0L
            if (r0 == 0) goto L_0x005c
            android.text.Editable r9 = r0.getText()
        L_0x000d:
            java.lang.CharSequence r8 = r1.getHint()
            java.lang.CharSequence r7 = r1.getError()
            java.lang.CharSequence r6 = r1.getCounterOverflowDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r5 = r0 ^ 1
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r4 = r0 ^ 1
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r3 = r0 ^ 1
            r2 = 0
            if (r3 != 0) goto L_0x0035
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 != 0) goto L_0x0036
        L_0x0035:
            r1 = 1
        L_0x0036:
            if (r5 == 0) goto L_0x0054
            android.view.accessibility.AccessibilityNodeInfo r0 = r12.A01
            r0.setText(r9)
            if (r4 == 0) goto L_0x0048
        L_0x003f:
            r12.A0D(r8)
            if (r5 != 0) goto L_0x0045
            r2 = 1
        L_0x0045:
            r12.A0N(r2)
        L_0x0048:
            if (r1 == 0) goto L_0x0053
            if (r3 != 0) goto L_0x004d
            r7 = r6
        L_0x004d:
            r12.A0C(r7)
            r12.A05()
        L_0x0053:
            return
        L_0x0054:
            if (r4 == 0) goto L_0x0048
            android.view.accessibility.AccessibilityNodeInfo r0 = r12.A01
            r0.setText(r8)
            goto L_0x003f
        L_0x005c:
            r9 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PA.A06(android.view.View, X.031):void");
    }
}
