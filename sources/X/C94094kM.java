package X;

import android.text.Editable;
import android.view.View;
import com.obwhatsapp.backup.encryptedbackup.EncryptionKeyFragment;

/* renamed from: X.4kM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94094kM implements View.OnFocusChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EncryptionKeyFragment A01;

    public /* synthetic */ C94094kM(EncryptionKeyFragment encryptionKeyFragment, int i2) {
        this.A01 = encryptionKeyFragment;
        this.A00 = i2;
    }

    public final void onFocusChange(View view, boolean z2) {
        EncryptionKeyFragment encryptionKeyFragment = this.A01;
        int i2 = this.A00;
        if (z2) {
            encryptionKeyFragment.A00 = i2;
            if (i2 > 0) {
                Editable text = encryptionKeyFragment.A04[i2 - 1].getText();
                AnonymousClass00B.A06(text);
                if (text.length() < 4) {
                    encryptionKeyFragment.A04[encryptionKeyFragment.A00 - 1].requestFocus();
                }
            }
        }
    }
}
