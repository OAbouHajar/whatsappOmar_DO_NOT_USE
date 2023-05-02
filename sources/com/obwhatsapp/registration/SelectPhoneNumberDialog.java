package com.obwhatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass1G1;
import X.AnonymousClass2F3;
import X.AnonymousClass2F6;
import X.C005702l;
import X.C13680ns;
import X.C13690nt;
import X.C32241fu;
import X.C56642oG;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape195S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape20S0300000_1_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;

public class SelectPhoneNumberDialog extends Hilt_SelectPhoneNumberDialog {
    public AnonymousClass1G1 A00;
    public AnonymousClass2F6 A01;

    public void A0k() {
        super.A0k();
        this.A01 = null;
    }

    public void A16(Context context) {
        super.A16(context);
        if (context instanceof AnonymousClass2F6) {
            this.A01 = (AnonymousClass2F6) context;
        }
    }

    public Dialog A1B(Bundle bundle) {
        ArrayList parcelableArrayList = A04().getParcelableArrayList("deviceSimInfoList");
        AnonymousClass00B.A06(parcelableArrayList);
        StringBuilder A0r = AnonymousClass000.A0r("select-phone-number-dialog/number-of-suggestions: ");
        A0r.append(parcelableArrayList.size());
        C13680ns.A1V(A0r);
        Context A02 = A02();
        C56642oG r4 = new C56642oG(A02, this.A00, parcelableArrayList);
        C32241fu A002 = C32241fu.A00(A02);
        A002.A02(R.string.str14ce);
        A002.A04((DialogInterface.OnClickListener) null, r4);
        A002.setPositiveButton(R.string.str1972, new IDxCListenerShape20S0300000_1_I1(this, r4, parcelableArrayList, 1));
        C13690nt.A1H(A002, this, 90, R.string.str0394);
        C005702l create = A002.create();
        create.A00.A0J.setOnItemClickListener(new IDxCListenerShape195S0100000_2_I1(r4, 4));
        return create;
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        AnonymousClass2F6 r0 = this.A01;
        if (r0 != null) {
            AnonymousClass2F3 r02 = (AnonymousClass2F3) r0;
            r02.A0B.A02(r02.A0E.A03);
        }
    }
}
