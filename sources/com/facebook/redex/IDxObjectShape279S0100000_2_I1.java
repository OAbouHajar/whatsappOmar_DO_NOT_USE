package com.facebook.redex;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.obwhatsapp.backup.encryptedbackup.PasswordInputFragment;

public class IDxObjectShape279S0100000_2_I1 implements NoCopySpan, TextWatcher {
    public Object A00;
    public final int A01;

    public IDxObjectShape279S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        if (this.A01 == 0) {
            TextInputLayout textInputLayout = (TextInputLayout) this.A00;
            textInputLayout.A0G(!textInputLayout.A0d, false);
            if (textInputLayout.A0R) {
                textInputLayout.A0D(editable.length());
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (this.A01 != 0) {
            ((PasswordInputFragment) this.A00).A1C();
        }
    }
}
