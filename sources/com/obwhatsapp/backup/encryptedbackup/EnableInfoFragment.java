package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass013;
import X.AnonymousClass1ZW;
import X.AnonymousClass2GQ;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C15860rz;
import X.C34331k5;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;

public class EnableInfoFragment extends Hilt_EnableInfoFragment {
    public AnonymousClass013 A00;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout025e);
    }

    public void A18(Bundle bundle, View view) {
        super.A17(bundle);
        EncBackupViewModel A0T = C13680ns.A0T(this);
        TextView A0L = C13680ns.A0L(view, R.id.enable_info_backup_size_message);
        C15860rz r5 = A0T.A0D;
        String A0M = r5.A0M();
        long A0I = A0M != null ? r5.A0I(A0M) : 0;
        String A0M2 = r5.A0M();
        long j2 = A0M2 != null ? TextUtils.isEmpty(A0M2) ? -1 : C13680ns.A0B(r5).getLong(C13680ns.A0h("gdrive_last_successful_backup_media_size:", A0M2), -1) : 0;
        if (A0I > 0 || A0I == -1) {
            C13680ns.A0L(view, R.id.enable_info_enc_backup_info).setText(R.string.str07b0);
        }
        if (A0I > 0 && j2 >= 0) {
            A0L.setVisibility(0);
            Context A02 = A02();
            Object[] A1Z = C13690nt.A1Z();
            A1Z[0] = AnonymousClass2GQ.A03(this.A00, A0I);
            A1Z[1] = AnonymousClass2GQ.A03(this.A00, j2);
            A0L.setText(AnonymousClass1ZW.A00(A02, A1Z, R.string.str07af));
        }
        C34331k5.A04(C004601z.A0E(view, R.id.enable_info_turn_on_button), this, A0T, 9);
    }
}
