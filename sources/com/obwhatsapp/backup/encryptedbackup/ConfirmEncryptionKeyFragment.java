package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass050;
import X.C004601z;
import X.C13680ns;
import X.C13700nu;
import X.C34331k5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

public class ConfirmEncryptionKeyFragment extends Hilt_ConfirmEncryptionKeyFragment {
    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0261);
    }

    public void A18(Bundle bundle, View view) {
        this.A01 = C13680ns.A0T(this);
        AnonymousClass050 r2 = new AnonymousClass050(A0F());
        r2.A0A(new EncryptionKeyFragment(), R.id.encryption_key_confirm_encryption_key_container);
        r2.A01();
        this.A00 = (RelativeLayout) C004601z.A0E(view, R.id.enc_key_background);
        TextView A0L = C13680ns.A0L(view, R.id.encryption_key_confirm_title);
        C13700nu.A0M(A03(), A0L, new Object[]{64}, R.plurals.plurals0045, 64);
        TextView A0L2 = C13680ns.A0L(view, R.id.encryption_key_confirm_button_confirm);
        C13700nu.A0M(A03(), A0L2, new Object[]{64}, R.plurals.plurals0044, 64);
        C34331k5.A01(A0L2, this, 2);
        C34331k5.A01(C004601z.A0E(view, R.id.encryption_key_confirm_button_cancel), this, 3);
        this.A00.setOnCreateContextMenuListener(this);
    }
}
