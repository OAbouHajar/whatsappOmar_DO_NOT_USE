package com.obwhatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass5PE;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C32241fu;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.obwhatsapp.R;

public class ConfirmLinkExistingGroupsDialog extends Hilt_ConfirmLinkExistingGroupsDialog {
    public AnonymousClass5PE A00;

    public static ConfirmLinkExistingGroupsDialog A01(String str) {
        Bundle A0D = C13690nt.A0D();
        A0D.putString("community_name", str);
        ConfirmLinkExistingGroupsDialog confirmLinkExistingGroupsDialog = new ConfirmLinkExistingGroupsDialog();
        confirmLinkExistingGroupsDialog.A0T(A0D);
        return confirmLinkExistingGroupsDialog;
    }

    public void A16(Context context) {
        super.A16(context);
        this.A00 = (AnonymousClass5PE) context;
    }

    public Dialog A1B(Bundle bundle) {
        String string = A04().getString("community_name", (String) null);
        C001000l A0D = A0D();
        C32241fu A002 = C32241fu.A00(A0D);
        A002.A06(string != null ? A0D.getString(R.string.str0dd7, AnonymousClass000.A1a(string)) : A0D.getString(R.string.str0dd8));
        C13680ns.A1H(A002, this, 36, R.string.str02ac);
        C13690nt.A1H(A002, this, 37, R.string.str0394);
        return A002.create();
    }
}
