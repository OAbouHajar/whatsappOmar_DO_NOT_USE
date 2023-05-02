package com.facebook.redex;

import X.AnonymousClass5ko;
import X.C112755jA;
import X.C112865jq;
import X.C112885jv;
import X.C112965kx;
import X.C13680ns;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.obwhatsapp.R;

public class IDxCListenerShape3S1100000_3_I1 implements DialogInterface.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxCListenerShape3S1100000_3_I1(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        if (this.A02 != 0) {
            C112755jA r5 = (C112755jA) this.A00;
            String str = this.A01;
            C112885jv r3 = r5.A04;
            r3.Afq(R.string.str13db);
            ((C112865jq) r3).A3C(new C112965kx(r5, r3, str), r3.A08.A0A, str);
            return;
        }
        AnonymousClass5ko r32 = (AnonymousClass5ko) this.A00;
        String str2 = this.A01;
        dialogInterface.dismiss();
        String string = r32.A0D.A01().getString("payments_support_phone_number", (String) null);
        if (!TextUtils.isEmpty(string)) {
            Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", string, (String) null));
            if (intent.resolveActivity(r32.getPackageManager()) != null) {
                r32.startActivity(intent);
            }
        }
        r32.A0E.AKS(C13680ns.A0Y(), 26, str2, (String) null);
    }
}
