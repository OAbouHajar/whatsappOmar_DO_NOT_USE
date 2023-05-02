package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass3CO;
import X.AnonymousClass3CV;
import X.C13680ns;
import X.C13700nu;
import X.C15450qv;
import X.C94094kM;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.facebook.redex.IDxKListenerShape255S0100000_2_I1;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.R;

public class EncryptionKeyFragment extends Hilt_EncryptionKeyFragment {
    public int A00;
    public EncBackupViewModel A01;
    public AnonymousClass01V A02;
    public AnonymousClass013 A03;
    public CodeInputField[] A04;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0260);
    }

    public void A18(Bundle bundle, View view) {
        InputMethodManager A0Q;
        super.A17(bundle);
        this.A01 = C13680ns.A0T(this);
        ViewGroup A07 = C13700nu.A07(view, R.id.encryption_key_vertical_layout);
        this.A04 = new CodeInputField[16];
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            ViewGroup viewGroup = (ViewGroup) A07.getChildAt(i3);
            int i4 = 0;
            do {
                int i5 = (i3 << 2) + i4;
                this.A04[i5] = viewGroup.getChildAt(i4);
                if (Build.VERSION.SDK_INT >= 21) {
                    this.A04[i5].setLetterSpacing(0.15f);
                }
                if (this.A01.A05() != 1) {
                    CodeInputField codeInputField = this.A04[i5];
                    codeInputField.setEnabled(true);
                    codeInputField.setClickable(true);
                    codeInputField.setLongClickable(true);
                    codeInputField.setOnFocusChangeListener(new C94094kM(this, i5));
                    codeInputField.addTextChangedListener(new AnonymousClass3CO(codeInputField, this));
                    codeInputField.setOnKeyListener(new IDxKListenerShape255S0100000_2_I1(this, 0));
                    if (C15450qv.A04()) {
                        codeInputField.setCustomInsertionActionModeCallback(new AnonymousClass3CV(this));
                    }
                }
                i4++;
            } while (i4 < 4);
        }
        String str = (String) this.A01.A02.A01();
        if (str != null) {
            A1B(str);
            i2 = str.length() >> 2;
        }
        if (this.A01.A05() != 1 && (A0Q = this.A02.A0Q()) != null) {
            this.A04[i2].requestFocus();
            A0Q.toggleSoftInput(1, 1);
        }
    }

    public void A1B(String str) {
        if (str != null) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                int i4 = i3 << 2;
                int length = str.length();
                String substring = str.substring(i2 << 2, Math.min(i4, length));
                if (!substring.equals(this.A04[i2].getText() != null ? C13680ns.A0f(this.A04[i2]) : "")) {
                    this.A04[i2].setText(substring);
                    this.A04[i2].setSelection(substring.length());
                }
                if (length >= i4 && i3 < 16) {
                    i2 = i3;
                } else {
                    return;
                }
            }
        }
    }
}
