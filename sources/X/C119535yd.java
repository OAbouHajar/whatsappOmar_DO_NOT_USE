package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.obwhatsapp.R;
import com.obwhatsapp.components.Button;
import com.obwhatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;

/* renamed from: X.5yd  reason: invalid class name and case insensitive filesystem */
public class C119535yd implements TextWatcher {
    public final int A00;
    public final EditText A01;
    public final /* synthetic */ IndiaUpiDebitCardVerificationActivity A02;

    public C119535yd(EditText editText, IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity, int i2) {
        this.A02 = indiaUpiDebitCardVerificationActivity;
        this.A00 = i2;
        this.A01 = editText;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int parseInt;
        if (i4 != 0) {
            this.A02.A06.setVisibility(4);
        }
        IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = this.A02;
        int A3k = indiaUpiDebitCardVerificationActivity.A3k();
        Button button = indiaUpiDebitCardVerificationActivity.A07;
        if (A3k == 0) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        if (charSequence.length() >= this.A00) {
            EditText editText = this.A01;
            if (editText != null) {
                editText.requestFocus();
                if (editText == indiaUpiDebitCardVerificationActivity.A05) {
                    EditText editText2 = indiaUpiDebitCardVerificationActivity.A04;
                    if (!TextUtils.isEmpty(C110105dW.A0e(editText2)) && (parseInt = Integer.parseInt(C110105dW.A0e(editText2))) != -1) {
                        if (parseInt < 1 || parseInt > 12) {
                            indiaUpiDebitCardVerificationActivity.A06.setText(R.string.str0650);
                            indiaUpiDebitCardVerificationActivity.A3l();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            indiaUpiDebitCardVerificationActivity.A3n(indiaUpiDebitCardVerificationActivity.A00, indiaUpiDebitCardVerificationActivity.A01, false);
        }
    }
}
