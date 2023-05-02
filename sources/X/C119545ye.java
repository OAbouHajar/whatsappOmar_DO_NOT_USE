package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

/* renamed from: X.5ye  reason: invalid class name and case insensitive filesystem */
public class C119545ye implements TextWatcher {
    public CharSequence A00;
    public ArrayList A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public final EditText A04;
    public final String A05;

    public C119545ye(EditText editText, String str) {
        int i2 = 0;
        this.A05 = str;
        this.A04 = editText;
        this.A01 = AnonymousClass000.A0u();
        while (true) {
            String str2 = this.A05;
            if (i2 < str2.length()) {
                if (str2.charAt(i2) != '#') {
                    C13690nt.A1O(this.A01, i2);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void afterTextChanged(Editable editable) {
        String str;
        int length;
        EditText editText = this.A04;
        int selectionStart = editText.getSelectionStart();
        if (!this.A02 && !this.A03) {
            this.A03 = true;
        } else if (!this.A03) {
            this.A03 = true;
            if (this.A01.contains(Integer.valueOf(selectionStart))) {
                while (true) {
                    if (selectionStart <= 0) {
                        break;
                    }
                    int i2 = selectionStart - 1;
                    if (this.A05.charAt(i2) == '#') {
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
        InputFilter[] filters = editable.getFilters();
        editText.removeTextChangedListener(this);
        editable.setFilters(new InputFilter[0]);
        int i3 = 0;
        while (true) {
            str = this.A05;
            length = str.length();
            if (i3 >= Math.min(length, editable.length())) {
                break;
            }
            if (str.charAt(i3) == '#') {
                char charAt = editable.charAt(i3);
                if (!(this instanceof C111605h3 ? Character.isDigit(charAt) : Character.isLetterOrDigit(charAt))) {
                    editable.replace(i3, i3 + 1, "");
                    if (i3 < selectionStart) {
                        selectionStart--;
                    }
                    i3--;
                }
            } else if (str.charAt(i3) != editable.charAt(i3)) {
                editable.insert(i3, str.substring(i3, i3 + 1));
                if (i3 <= selectionStart) {
                    selectionStart++;
                }
            }
            i3++;
        }
        while (i3 < length && str.charAt(i3) != '#') {
            editable.append(str.charAt(i3));
            if (selectionStart == i3) {
                selectionStart++;
            }
            i3++;
        }
        editable.setFilters(filters);
        editText.addTextChangedListener(this);
        editText.setSelection(selectionStart);
        this.A03 = false;
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        boolean z2 = false;
        if (i4 < i3) {
            z2 = true;
        }
        this.A02 = z2;
        this.A00 = charSequence;
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
