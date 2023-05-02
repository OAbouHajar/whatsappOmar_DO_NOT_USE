package com.obwhatsapp.backup.encryptedbackup;

import X.C004601z;
import X.C13680ns;
import X.C34331k5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

public class ForcedRegLandingFragment extends Hilt_ForcedRegLandingFragment {
    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0264);
    }

    public void A18(Bundle bundle, View view) {
        super.A17(bundle);
        EncBackupViewModel A0T = C13680ns.A0T(this);
        C34331k5.A04(C004601z.A0E(view, R.id.enc_backup_validate_password_continue_button), this, A0T, 12);
        C34331k5.A04(C004601z.A0E(view, R.id.enc_backup_validate_password_turn_off_button), this, A0T, 13);
        if (A0T.A05() == 9) {
            C13680ns.A0L(view, R.id.enc_backup_validate_password_info_subtitle_info).setText(R.string.str07c5);
        }
    }
}
