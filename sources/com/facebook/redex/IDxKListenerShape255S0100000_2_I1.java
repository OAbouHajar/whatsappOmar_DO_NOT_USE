package com.facebook.redex;

import X.AnonymousClass00B;
import X.C13700nu;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.backup.encryptedbackup.EncryptionKeyFragment;

public class IDxKListenerShape255S0100000_2_I1 implements View.OnKeyListener {
    public Object A00;
    public final int A01;

    public IDxKListenerShape255S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        int i3;
        if (this.A01 != 0) {
            TextView textView = (TextView) this.A00;
            if (i2 != 67 || keyEvent.getAction() != 0) {
                return false;
            }
            C13700nu.A0T(textView);
            return true;
        }
        EncryptionKeyFragment encryptionKeyFragment = (EncryptionKeyFragment) this.A00;
        if (keyEvent.getAction() != 0 || i2 != 67 || (i3 = encryptionKeyFragment.A00) <= 0 || encryptionKeyFragment.A04[i3].getText() == null || encryptionKeyFragment.A04[encryptionKeyFragment.A00].getText().length() != 0) {
            return false;
        }
        CodeInputField codeInputField = encryptionKeyFragment.A04[encryptionKeyFragment.A00 - 1];
        Editable text = codeInputField.getText();
        AnonymousClass00B.A06(text);
        text.delete(codeInputField.length() - 1, codeInputField.length());
        codeInputField.requestFocus();
        return true;
    }
}
