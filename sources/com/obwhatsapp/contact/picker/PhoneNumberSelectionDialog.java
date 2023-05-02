package com.obwhatsapp.contact.picker;

import X.AnonymousClass00B;
import X.AnonymousClass2AW;
import X.C005702l;
import X.C13690nt;
import X.C16440t3;
import X.C32241fu;
import X.C64263Nl;
import X.C78633yP;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape22S0300000_2_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;

public class PhoneNumberSelectionDialog extends Hilt_PhoneNumberSelectionDialog {
    public AnonymousClass2AW A00;
    public C16440t3 A01;

    public static PhoneNumberSelectionDialog A01(String str, ArrayList arrayList) {
        PhoneNumberSelectionDialog phoneNumberSelectionDialog = new PhoneNumberSelectionDialog();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("displayName", str);
        A0D.putParcelableArrayList("phoneNumberSelectionInfoList", arrayList);
        phoneNumberSelectionDialog.A0T(A0D);
        return phoneNumberSelectionDialog;
    }

    public void A0k() {
        super.A0k();
        this.A00 = null;
    }

    public void A16(Context context) {
        super.A16(context);
        if (context instanceof AnonymousClass2AW) {
            this.A00 = (AnonymousClass2AW) context;
        }
    }

    public Dialog A1B(Bundle bundle) {
        Bundle A04 = A04();
        String string = A04.getString("displayName");
        ArrayList parcelableArrayList = A04.getParcelableArrayList("phoneNumberSelectionInfoList");
        AnonymousClass00B.A06(parcelableArrayList);
        Context A02 = A02();
        C64263Nl r5 = new C64263Nl(A02, parcelableArrayList);
        C32241fu A002 = C32241fu.A00(A02);
        A002.setTitle(string);
        A002.A04((DialogInterface.OnClickListener) null, r5);
        A002.setPositiveButton(R.string.str02ac, new IDxCListenerShape22S0300000_2_I1(r5, this, parcelableArrayList, 0));
        A002.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        A002.A07(true);
        C005702l create = A002.create();
        create.A00.A0J.setOnItemClickListener(new C78633yP(r5, this, this.A01));
        return create;
    }
}
