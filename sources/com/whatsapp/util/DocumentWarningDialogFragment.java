package com.whatsapp.util;

import X.C14870pt;
import X.C16300so;
import X.C16320sq;
import X.C16460t6;
import X.C16500tA;
import X.C16730tY;
import X.C19980zJ;
import X.C32241fu;
import X.C41961wy;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxNConsumerShape9S0400000_2_I0;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;

public class DocumentWarningDialogFragment extends Hilt_DocumentWarningDialogFragment {
    public C19980zJ A00;
    public C16300so A01;
    public C14870pt A02;
    public C16460t6 A03;
    public C16500tA A04;
    public C16320sq A05;

    public static DocumentWarningDialogFragment A01(int i2, long j2) {
        DocumentWarningDialogFragment documentWarningDialogFragment = new DocumentWarningDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("message_id", j2);
        bundle.putInt("warning_id", i2);
        documentWarningDialogFragment.A0T(bundle);
        return documentWarningDialogFragment;
    }

    public static /* synthetic */ void A02(DocumentWarningDialogFragment documentWarningDialogFragment) {
        C16730tY r8 = (C16730tY) documentWarningDialogFragment.A03.A0K.A00(documentWarningDialogFragment.A04().getLong("message_id"));
        if (r8 != null && r8.A02 != null) {
            C14870pt r7 = documentWarningDialogFragment.A02;
            C16300so r4 = documentWarningDialogFragment.A01;
            C16320sq r3 = documentWarningDialogFragment.A05;
            C16500tA r2 = documentWarningDialogFragment.A04;
            Context A0u = documentWarningDialogFragment.A0u();
            C19980zJ r6 = documentWarningDialogFragment.A00;
            WeakReference weakReference = new WeakReference(A0u);
            r7.A08(0, R.string.str0c8c);
            IDxNConsumerShape9S0400000_2_I0 iDxNConsumerShape9S0400000_2_I0 = new IDxNConsumerShape9S0400000_2_I0(r6, r7, r8, weakReference, 1);
            C41961wy r1 = new C41961wy(r4, r2, r8);
            r1.A01(iDxNConsumerShape9S0400000_2_I0, r7.A06);
            r3.Acl(r1);
            r8.A02.A07 = 2;
            documentWarningDialogFragment.A03.A0a(r8);
        }
    }

    public Dialog A1B(Bundle bundle) {
        C32241fu r3 = new C32241fu(A0u());
        r3.A06(A0J(A04().getInt("warning_id", R.string.str1b76)));
        r3.setPositiveButton(R.string.str0e91, new IDxCListenerShape127S0100000_2_I0(this, 141));
        r3.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        return r3.create();
    }
}
