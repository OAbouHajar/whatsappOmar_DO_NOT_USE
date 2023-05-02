package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

/* renamed from: X.3CU  reason: invalid class name */
public class AnonymousClass3CU implements TextWatcher {
    public EditText A00;
    public CharSequence A01;
    public String A02;
    public ArrayList A03;
    public boolean A04 = false;
    public boolean A05 = false;

    public AnonymousClass3CU(EditText editText, String str) {
        this.A02 = str;
        A00();
        this.A00 = editText;
    }

    public final void A00() {
        this.A03 = AnonymousClass000.A0u();
        int i2 = 0;
        while (true) {
            String str = this.A02;
            if (i2 < str.length()) {
                if (str.charAt(i2) != '#') {
                    C13690nt.A1O(this.A03, i2);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void afterTextChanged(Editable editable) {
        EditText editText = this.A00;
        if (editText != null) {
            int selectionStart = editText.getSelectionStart();
            if (!this.A04 && !this.A05) {
                this.A05 = true;
            } else if (!this.A05) {
                this.A05 = true;
                if (C13700nu.A0h(this.A03, selectionStart)) {
                    while (true) {
                        if (selectionStart <= 0) {
                            break;
                        }
                        int i2 = selectionStart - 1;
                        if (this.A02.charAt(i2) == '#') {
                            editable.delete(i2, selectionStart);
                            selectionStart = i2;
                            break;
                        }
                        editable.delete(i2, selectionStart);
                        selectionStart--;
                    }
                }
            } else {
                return;
            }
            StringBuilder sb = new StringBuilder(editable);
            int i3 = 0;
            while (i3 < sb.length()) {
                String str = this.A02;
                if (i3 >= str.length()) {
                    break;
                }
                if (str.charAt(i3) == '#') {
                    if (!Character.isDigit(sb.charAt(i3))) {
                        sb.replace(i3, i3 + 1, "");
                        if (i3 < selectionStart) {
                            selectionStart--;
                        }
                        i3--;
                    }
                } else if (this.A02.charAt(i3) != sb.charAt(i3)) {
                    sb.insert(i3, this.A02.substring(i3, i3 + 1));
                    if (i3 <= selectionStart) {
                        selectionStart++;
                    }
                }
                i3++;
            }
            if (sb.length() > this.A02.length()) {
                sb.delete(i3, sb.length());
                selectionStart = i3;
            }
            while (true) {
                String str2 = this.A02;
                if (i3 >= str2.length() || str2.charAt(i3) == '#') {
                    this.A00.setText(sb);
                    this.A00.setSelection(selectionStart);
                    this.A05 = false;
                } else {
                    sb.append(this.A02.charAt(i3));
                    if (selectionStart == i3) {
                        selectionStart++;
                    }
                    i3++;
                }
            }
            this.A00.setText(sb);
            this.A00.setSelection(selectionStart);
            this.A05 = false;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        boolean z2 = false;
        if (i4 < i3) {
            z2 = true;
        }
        this.A04 = z2;
        this.A01 = charSequence;
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
