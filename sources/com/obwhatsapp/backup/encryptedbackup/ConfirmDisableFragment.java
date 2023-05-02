package com.obwhatsapp.backup.encryptedbackup;

import X.C003401n;
import X.C004601z;
import X.C006602z;
import X.C13680ns;
import X.C34331k5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.base.WaFragment;

public class ConfirmDisableFragment extends WaFragment {
    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout025a);
    }

    public void A18(Bundle bundle, View view) {
        super.A17(bundle);
        C003401n A01 = new C006602z(A0D()).A01(EncBackupViewModel.class);
        C34331k5.A04(C004601z.A0E(view, R.id.confirm_disable_disable_button), this, A01, 2);
        C34331k5.A04(C004601z.A0E(view, R.id.confirm_disable_cancel_button), this, A01, 3);
    }
}
