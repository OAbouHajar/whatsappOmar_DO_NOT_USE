package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.C004601z;
import X.C13680ns;
import X.C13700nu;
import X.C15860rz;
import X.C34331k5;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;

public class EnabledLandingFragment extends Hilt_EnabledLandingFragment {
    public C15860rz A00;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout025f);
    }

    public void A18(Bundle bundle, View view) {
        super.A17(bundle);
        EncBackupViewModel A0T = C13680ns.A0T(this);
        TextView A0L = C13680ns.A0L(view, R.id.enc_backup_enabled_landing_password_button);
        C15860rz r1 = A0T.A0D;
        String A0M = r1.A0M();
        if (A0M != null && r1.A0I(A0M) > 0) {
            C13680ns.A0L(view, R.id.enc_backup_enabled_landing_privacy_notice).setText(R.string.str07ce);
        }
        if (this.A00.A1g()) {
            TextView A0L2 = C13680ns.A0L(view, R.id.enc_backup_enabled_landing_restore_notice);
            Resources A03 = A03();
            Object[] A1b = C13680ns.A1b();
            AnonymousClass000.A1M(A1b, 64, 0);
            C13700nu.A0M(A03, A0L2, A1b, R.plurals.plurals004c, 64);
            A0L.setText(A0I(R.string.str07b8));
        }
        C34331k5.A04(A0L, this, A0T, 10);
        C34331k5.A04(C004601z.A0E(view, R.id.enc_backup_enabled_landing_disable_button), this, A0T, 11);
    }
}
