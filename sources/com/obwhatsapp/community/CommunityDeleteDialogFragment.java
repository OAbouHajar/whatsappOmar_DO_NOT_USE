package com.obwhatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass11A;
import X.C13690nt;
import X.C15830rv;
import X.C15900s5;
import X.C15910s6;
import X.C16000sG;
import X.C16030sJ;
import X.C16050sL;
import X.C16080sP;
import X.C16320sq;
import X.C16440t3;
import X.C16760tb;
import X.C16980tz;
import X.C32241fu;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.obwhatsapp.R;
import java.util.List;

public class CommunityDeleteDialogFragment extends Hilt_CommunityDeleteDialogFragment {
    public C15900s5 A00;
    public C16760tb A01;
    public C16000sG A02;
    public C16080sP A03;
    public C16440t3 A04;
    public C16980tz A05;
    public AnonymousClass11A A06;
    public C16320sq A07;

    public Dialog A1B(Bundle bundle) {
        String quantityString;
        List A08 = C16030sJ.A08(C16050sL.class, A04().getStringArrayList("selectedParentJids"));
        C32241fu A002 = C32241fu.A00(A0D());
        if (A08.size() == 1) {
            String A082 = this.A03.A08(this.A02.A0A((C15830rv) A08.get(0)));
            if (!this.A00.A05(C15910s6.A0X)) {
                quantityString = C13690nt.A0c(this, A082, new Object[1], 0, R.string.str0698);
            }
            Resources A003 = C16980tz.A00(this.A05);
            int size = A08.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, A08.size(), 0);
            quantityString = A003.getQuantityString(R.plurals.plurals002e, size, objArr);
        } else {
            if (!this.A00.A05(C15910s6.A0X)) {
                quantityString = "";
            }
            Resources A0032 = C16980tz.A00(this.A05);
            int size2 = A08.size();
            Object[] objArr2 = new Object[1];
            AnonymousClass000.A1M(objArr2, A08.size(), 0);
            quantityString = A0032.getQuantityString(R.plurals.plurals002e, size2, objArr2);
        }
        if (!quantityString.isEmpty()) {
            A002.A06(quantityString);
        }
        Resources A004 = C16980tz.A00(this.A05);
        int size3 = A08.size();
        Object[] objArr3 = new Object[1];
        AnonymousClass000.A1M(objArr3, A08.size(), 0);
        A002.setTitle(A004.getQuantityString(R.plurals.plurals002f, size3, objArr3));
        Resources A005 = C16980tz.A00(this.A05);
        int size4 = A08.size();
        Object[] objArr4 = new Object[1];
        AnonymousClass000.A1M(objArr4, A08.size(), 0);
        A002.A09(new IDxCListenerShape29S0200000_2_I1(A08, 5, this), A005.getQuantityString(R.plurals.plurals002d, size4, objArr4));
        C13690nt.A1E(A002);
        return A002.create();
    }
}
