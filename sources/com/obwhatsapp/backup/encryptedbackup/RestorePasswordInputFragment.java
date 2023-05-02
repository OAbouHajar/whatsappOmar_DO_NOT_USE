package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass3K3;
import X.C13680ns;
import X.C19980zJ;
import X.C23071Aj;
import X.C34331k5;
import android.os.Bundle;
import android.view.View;
import com.obwhatsapp.R;

public class RestorePasswordInputFragment extends Hilt_RestorePasswordInputFragment {
    public C19980zJ A00;
    public C23071Aj A01;

    public void A18(Bundle bundle, View view) {
        super.A18(bundle, view);
        AnonymousClass3K3.A17(this.A04, this, R.string.str07d8);
        AnonymousClass3K3.A17(this.A03, this, R.string.str07d6);
        this.A01.setVisibility(0);
        C34331k5.A01(this.A01, this, 12);
        AnonymousClass3K3.A17(this.A08, this, R.string.str07d7);
        this.A05.setVisibility(0);
        this.A05.setText(R.string.str07da);
        C34331k5.A01(this.A05, this, 13);
        C13680ns.A1N(A0H(), this.A07.A08, this, 8);
    }
}
