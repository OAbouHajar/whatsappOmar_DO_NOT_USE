package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.C003401n;
import X.C004601z;
import X.C006602z;
import X.C13680ns;
import X.C13700nu;
import X.C34331k5;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.base.WaFragment;

public class EnableEducationFragment extends WaFragment {
    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout025d);
    }

    public void A18(Bundle bundle, View view) {
        super.A17(bundle);
        C003401n A01 = new C006602z(A0D()).A01(EncBackupViewModel.class);
        TextView A0L = C13680ns.A0L(view, R.id.enable_education_use_encryption_key_button);
        Resources A03 = A03();
        Object[] A1b = C13680ns.A1b();
        AnonymousClass000.A1K(A1b, 64);
        C13700nu.A0M(A03, A0L, A1b, R.plurals.plurals004d, 64);
        C34331k5.A04(A0L, this, A01, 7);
        C34331k5.A04(C004601z.A0E(view, R.id.enable_education_create_password_button), this, A01, 8);
    }
}
