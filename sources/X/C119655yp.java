package X;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.obwhatsapp.payments.ui.widget.DebitCardInputText;

/* renamed from: X.5yp  reason: invalid class name and case insensitive filesystem */
public class C119655yp implements View.OnKeyListener {
    public final EditText A00;
    public final EditText A01;

    public C119655yp(EditText editText, EditText editText2) {
        this.A01 = editText;
        this.A00 = editText2;
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        EditText editText;
        DebitCardInputText debitCardInputText = (DebitCardInputText) view;
        if (debitCardInputText != null && keyEvent.getAction() == 0 && debitCardInputText.isFocused()) {
            if (i2 != 67 || (editText = this.A01) == null || !TextUtils.isEmpty(debitCardInputText.getText())) {
                EditText editText2 = this.A00;
                if (!(editText2 == null || i2 == 67 || debitCardInputText.getText() == null || debitCardInputText.getText().length() != debitCardInputText.A06)) {
                    debitCardInputText.clearFocus();
                    editText2.requestFocus();
                    return true;
                }
            } else {
                debitCardInputText.clearFocus();
                editText.requestFocus();
                return true;
            }
        }
        return false;
    }
}
