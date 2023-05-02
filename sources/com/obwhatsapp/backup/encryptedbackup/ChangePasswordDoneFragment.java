package com.obwhatsapp.backup.encryptedbackup;

import X.C004601z;
import X.C13680ns;
import X.C34331k5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;

public class ChangePasswordDoneFragment extends Hilt_ChangePasswordDoneFragment {
    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0259);
    }

    public void A18(Bundle bundle, View view) {
        int i2;
        super.A17(bundle);
        EncBackupViewModel A0T = C13680ns.A0T(this);
        C34331k5.A04(C004601z.A0E(view, R.id.change_password_done_done_button), this, A0T, 1);
        TextView A0L = C13680ns.A0L(view, R.id.change_password_done_title);
        if (A0T.A05() == 6) {
            i2 = R.string.str078f;
        } else if (A0T.A05() == 7 || A0T.A05() == 9) {
            i2 = R.string.str07dc;
        } else {
            return;
        }
        A0L.setText(i2);
    }
}
