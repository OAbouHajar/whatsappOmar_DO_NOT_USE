package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass3K3;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;

public class CreatePasswordFragment extends Hilt_CreatePasswordFragment {
    public void A18(Bundle bundle, View view) {
        super.A18(bundle, view);
        int i2 = this.A00;
        TextView textView = this.A04;
        int i3 = R.string.str07a5;
        if (i2 == 1) {
            i3 = R.string.str07a6;
        }
        AnonymousClass3K3.A17(textView, this, i3);
        this.A03.setVisibility(4);
        this.A06.setHint(A0I(R.string.str07cc));
        AnonymousClass3K3.A17(this.A08, this, R.string.str07a3);
        A1F(true);
        A1C();
    }
}
