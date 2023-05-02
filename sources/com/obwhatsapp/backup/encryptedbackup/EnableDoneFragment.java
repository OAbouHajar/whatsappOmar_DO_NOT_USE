package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass01V;
import X.AnonymousClass027;
import X.C004601z;
import X.C13680ns;
import X.C15860rz;
import X.C34331k5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

public class EnableDoneFragment extends Hilt_EnableDoneFragment {
    public AnonymousClass01V A00;
    public C15860rz A01;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout025c);
    }

    public void A18(Bundle bundle, View view) {
        super.A17(bundle);
        EncBackupViewModel A0T = C13680ns.A0T(this);
        C34331k5.A04(C004601z.A0E(view, R.id.enable_done_create_button), this, A0T, 5);
        AnonymousClass027 r3 = A0T.A04;
        C13680ns.A1N(A0H(), r3, this, 3);
        C34331k5.A04(C004601z.A0E(view, R.id.enable_done_cancel_button), this, A0T, 6);
        C13680ns.A1N(A0H(), r3, this, 3);
    }
}
