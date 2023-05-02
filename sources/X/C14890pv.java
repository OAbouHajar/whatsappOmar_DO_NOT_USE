package X;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.obwhatsapp.CodeInputField;

/* renamed from: X.0pv  reason: invalid class name and case insensitive filesystem */
public class C14890pv extends PasswordTransformationMethod {
    public int A00 = -1;
    public C1042654p A01;
    public Runnable A02;
    public String A03 = "";
    public final CodeInputField A04;

    public C14890pv(CodeInputField codeInputField) {
        this.A04 = codeInputField;
    }

    public void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        if (this.A02 == null) {
            this.A02 = new RunnableRunnableShape1S0100000_I0((Object) this, 27);
        }
        if (!this.A03.equals(editable.toString().replaceAll("[^0-9, ]", ""))) {
            this.A03 = editable.toString().replaceAll("[^0-9, ]", "");
            this.A01.A00(editable);
            CodeInputField codeInputField = this.A04;
            if (codeInputField.getHandler() != null) {
                codeInputField.getHandler().removeCallbacks(this.A02);
                codeInputField.getHandler().postDelayed(this.A02, 1500);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.beforeTextChanged(charSequence, i2, i3, i4);
        CodeInputField codeInputField = this.A04;
        if (codeInputField.getHandler() != null && this.A02 != null) {
            codeInputField.getHandler().removeCallbacks(this.A02);
        }
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        C1042654p r0 = new C1042654p(this, charSequence);
        this.A01 = r0;
        return r0;
    }
}
