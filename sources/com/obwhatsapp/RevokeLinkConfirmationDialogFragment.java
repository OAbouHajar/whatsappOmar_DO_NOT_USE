package com.obwhatsapp;

import X.AnonymousClass00B;
import X.AnonymousClass3K2;
import X.C13680ns;
import X.C13690nt;
import X.C16000sG;
import X.C16050sL;
import X.C16080sP;
import X.C17240ul;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;

public class RevokeLinkConfirmationDialogFragment extends Hilt_RevokeLinkConfirmationDialogFragment {
    public C16000sG A00;
    public C16080sP A01;
    public C17240ul A02;

    public static RevokeLinkConfirmationDialogFragment A01(C16050sL r4, boolean z2) {
        RevokeLinkConfirmationDialogFragment revokeLinkConfirmationDialogFragment = new RevokeLinkConfirmationDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("jid", r4.getRawString());
        A0D.putBoolean("from_qr", z2);
        revokeLinkConfirmationDialogFragment.A0T(A0D);
        return revokeLinkConfirmationDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        String A0c;
        Bundle A04 = A04();
        boolean z2 = A04.getBoolean("from_qr");
        C32241fu A0R = AnonymousClass3K2.A0R(this);
        int i2 = R.string.str1472;
        if (z2) {
            i2 = R.string.str057d;
        }
        A0R.A09(new IDxCListenerShape128S0100000_2_I1(this, 5), A0J(i2));
        A0R.A08((DialogInterface.OnClickListener) null, A0J(R.string.str0394));
        if (z2) {
            A0R.setTitle(A0J(R.string.str0580));
            A0c = A0J(R.string.str1452);
        } else {
            String string = A04.getString("jid");
            AnonymousClass00B.A06(string);
            C16050sL A05 = C16050sL.A05(string);
            boolean A0m = this.A02.A0m(A05);
            int i3 = R.string.str1454;
            if (A0m) {
                i3 = R.string.str1455;
            }
            Object[] A1b = C13680ns.A1b();
            C16080sP r1 = this.A01;
            C16000sG r0 = this.A00;
            AnonymousClass00B.A06(A05);
            A0c = C13690nt.A0c(this, r1.A08(r0.A0A(A05)), A1b, 0, i3);
        }
        A0R.A06(A0c);
        return A0R.create();
    }
}
