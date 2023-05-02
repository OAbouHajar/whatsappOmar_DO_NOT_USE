package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: X.0YO  reason: invalid class name */
public class AnonymousClass0YO implements TextWatcher {
    public EditText A00;
    public C14990q7 A01;
    public C31201dg A02;
    public C14930q1 A03;
    public boolean A04 = false;

    public void afterTextChanged(Editable editable) {
        if (!this.A04) {
            this.A04 = true;
            if (!(this.A02 == null || this.A00 == null || this.A03 == null || this.A01 == null)) {
                String obj = editable.toString();
                C31201dg r3 = this.A02;
                C14930q1 r2 = this.A03;
                C14940q2 r0 = new C14940q2();
                r0.A02(obj, 0);
                String str = (String) C29701b3.A01(this.A01, r3, r0.A01(), r2);
                if (!obj.equals(str)) {
                    editable.replace(0, editable.length(), str);
                    this.A00.setSelection(editable.length());
                }
            }
            this.A04 = false;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
