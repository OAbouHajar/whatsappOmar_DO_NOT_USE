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
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

public class EncryptionKeyInfoFragment extends Hilt_EncryptionKeyInfoFragment {
    public Button A00;
    public Button A01;
    public FrameLayout A02;
    public TextView A03;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0262);
    }

    public void A18(Bundle bundle, View view) {
        this.A01 = C13680ns.A0T(this);
        AnonymousClass050 r2 = new AnonymousClass050(A0F());
        r2.A0A(new EncryptionKeyFragment(), R.id.encryption_key_info_encryption_key_container);
        r2.A01();
        this.A00 = (RelativeLayout) C004601z.A0E(view, R.id.enc_key_background);
        FrameLayout A08 = C13700nu.A08(view, R.id.encryption_key_info_encryption_key_container);
        this.A02 = A08;
        A08.setVisibility(4);
        Button button = (Button) C004601z.A0E(view, R.id.encryption_key_info_middle_button);
        this.A01 = button;
        C13700nu.A0M(A03(), button, new Object[]{64}, R.plurals.plurals0046, 64);
        C34331k5.A01(this.A01, this, 5);
        Button button2 = (Button) C004601z.A0E(view, R.id.encryption_key_info_bottom_button);
        this.A00 = button2;
        C13700nu.A0M(A03(), button2, new Object[]{64}, R.plurals.plurals0046, 64);
        C34331k5.A01(this.A00, this, 6);
        this.A03 = C13680ns.A0L(view, R.id.encryption_key_info_info);
    }
}
