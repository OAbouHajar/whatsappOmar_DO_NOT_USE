package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.obwhatsapp.backup.encryptedbackup.EncryptionKeyFragment;

/* renamed from: X.3CO  reason: invalid class name */
public class AnonymousClass3CO implements TextWatcher {
    public final /* synthetic */ CodeInputField A00;
    public final /* synthetic */ EncryptionKeyFragment A01;

    public AnonymousClass3CO(CodeInputField codeInputField, EncryptionKeyFragment encryptionKeyFragment) {
        this.A01 = encryptionKeyFragment;
        this.A00 = codeInputField;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int i5;
        String charSequence2 = charSequence.toString();
        EncryptionKeyFragment encryptionKeyFragment = this.A01;
        String lowerCase = charSequence2.toLowerCase(C13690nt.A0m(encryptionKeyFragment.A03));
        if (!charSequence.toString().equals(lowerCase)) {
            CodeInputField codeInputField = this.A00;
            codeInputField.setText(lowerCase);
            codeInputField.setSelection(charSequence.length());
        }
        if (charSequence.length() == 4 && (i5 = encryptionKeyFragment.A00 + 1) < 16) {
            encryptionKeyFragment.A04[i5].requestFocus();
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        int i6 = 0;
        do {
            Editable text = encryptionKeyFragment.A04[i6].getText();
            if (text == null) {
                break;
            }
            A0o.append(text);
            i6++;
        } while (i6 < 16);
        EncBackupViewModel encBackupViewModel = encryptionKeyFragment.A01;
        encBackupViewModel.A02.A0B(A0o.toString());
    }
}
