package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass3K3;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;

public class ConfirmPasswordFragment extends Hilt_ConfirmPasswordFragment {
    public String A00;

    public void A18(Bundle bundle, View view) {
        super.A18(bundle, view);
        this.A00 = (String) this.A07.A05.A01();
        int i2 = this.A00;
        TextView textView = this.A04;
        int i3 = R.string.str07a1;
        if (i2 == 1) {
            i3 = R.string.str07a2;
        }
        AnonymousClass3K3.A17(textView, this, i3);
        AnonymousClass3K3.A17(this.A03, this, R.string.str079f);
        AnonymousClass3K3.A17(this.A08, this, R.string.str079d);
        A1F(true);
        A1C();
    }
}
