package com.facebook.redex;

import X.C110755em;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.PaymentSettingsFragment;
import com.whatsapp.util.Log;

public class IDxCListenerShape5S1100000_3_I1 implements View.OnLongClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxCListenerShape5S1100000_3_I1(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public final boolean onLongClick(View view) {
        int i2 = this.A02;
        Object obj = this.A00;
        if (i2 != 0) {
            C110755em r4 = (C110755em) obj;
            String str = this.A01;
            ClipboardManager A0B = r4.A0N.A0B();
            if (A0B != null) {
                try {
                    A0B.setPrimaryClip(ClipData.newPlainText(str, str));
                    r4.A0H.A09(R.string.str17e9, 0);
                    return true;
                } catch (NullPointerException | SecurityException e2) {
                    r4.A0f.A0A("getTransactionIdRow paymentTransactionID", e2);
                }
            }
            r4.A0H.A09(R.string.str19d7, 0);
            return true;
        }
        PaymentSettingsFragment paymentSettingsFragment = (PaymentSettingsFragment) obj;
        String str2 = this.A01;
        ClipboardManager A0B2 = paymentSettingsFragment.A0O.A0B();
        if (A0B2 == null) {
            return true;
        }
        try {
            A0B2.setPrimaryClip(ClipData.newPlainText(str2, str2));
            paymentSettingsFragment.A0F.A0H(paymentSettingsFragment.A0J(R.string.str1b1d), 1);
            return true;
        } catch (NullPointerException | SecurityException e3) {
            Log.e("indiaupi/clipboard/", e3);
            return true;
        }
    }
}
