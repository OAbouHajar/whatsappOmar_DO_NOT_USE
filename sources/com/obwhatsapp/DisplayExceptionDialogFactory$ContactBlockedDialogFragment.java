package com.obwhatsapp;

import X.AnonymousClass00B;
import X.AnonymousClass01Y;
import X.C001000l;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxCListenerShape21S0300000_2_I0;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class DisplayExceptionDialogFactory$ContactBlockedDialogFragment extends Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment {
    public AnonymousClass01Y A00;

    public static DialogFragment A01(String str, ArrayList arrayList) {
        DisplayExceptionDialogFactory$ContactBlockedDialogFragment displayExceptionDialogFactory$ContactBlockedDialogFragment = new DisplayExceptionDialogFactory$ContactBlockedDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        bundle.putParcelableArrayList("jids", arrayList);
        displayExceptionDialogFactory$ContactBlockedDialogFragment.A0T(bundle);
        return displayExceptionDialogFactory$ContactBlockedDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        Log.w("home/dialog contact-blocked");
        Bundle A04 = A04();
        String string = A04.getString("message");
        AnonymousClass00B.A06(string);
        ArrayList parcelableArrayList = A04.getParcelableArrayList("jids");
        AnonymousClass00B.A06(parcelableArrayList);
        C001000l A0D = A0D();
        AnonymousClass01Y r4 = this.A00;
        C32241fu r3 = new C32241fu(A0D);
        r3.A06(string);
        r3.setPositiveButton(R.string.str1872, new IDxCListenerShape21S0300000_2_I0(A0D, r4, parcelableArrayList, 0));
        r3.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        return r3.create();
    }
}
