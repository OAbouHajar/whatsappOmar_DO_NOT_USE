package com.obwhatsapp.backup.encryptedbackup;

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

public class DisableDoneFragment extends WaFragment {
    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout025b);
    }

    public void A18(Bundle bundle, View view) {
        super.A17(bundle);
        C34331k5.A04(C004601z.A0E(view, R.id.disable_done_done_button), this, new C006602z(A0D()).A01(EncBackupViewModel.class), 4);
    }
}
