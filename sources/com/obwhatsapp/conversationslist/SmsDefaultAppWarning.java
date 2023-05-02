package com.obwhatsapp.conversationslist;

import X.AnonymousClass1BJ;
import X.AnonymousClass29T;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C32241fu;
import X.C49132Rg;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape162S0100000_2_I1;
import com.obwhatsapp.R;

public class SmsDefaultAppWarning extends C14530pL {
    public AnonymousClass1BJ A00;
    public boolean A01;

    public SmsDefaultAppWarning() {
        this(0);
    }

    public SmsDefaultAppWarning(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 59);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = (AnonymousClass1BJ) r1.AOm.get();
        }
    }

    public final void A35() {
        this.A00.A00(this, getIntent().getData(), 17, C13680ns.A0d(this, "https://whatsapp.com/dl/", C13680ns.A1b(), 0, R.string.str179b));
    }

    public void onCreate(Bundle bundle) {
        ActivityInfo activityInfo;
        super.onCreate(bundle);
        Intent A02 = C13700nu.A02("android.intent.action.SENDTO");
        A02.setData(getIntent().getData());
        ResolveInfo resolveActivity = getPackageManager().resolveActivity(A02, 0);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || !"com.obwhatsapp".equals(activityInfo.packageName)) {
            AnonymousClass29T.A01(this, 1);
        } else {
            AnonymousClass29T.A01(this, 0);
        }
    }

    public Dialog onCreateDialog(int i2) {
        C32241fu r3;
        int i3;
        if (i2 == 0) {
            r3 = C32241fu.A00(this);
            r3.A01(R.string.str1b78);
            r3.A0B(new IDxCListenerShape128S0100000_2_I1(this, 53), R.string.str164d);
            C13690nt.A1H(r3, this, 52, R.string.str1654);
            C13680ns.A1H(r3, this, 51, R.string.str1655);
            i3 = 9;
        } else if (i2 != 1) {
            return super.onCreateDialog(i2);
        } else {
            r3 = C32241fu.A00(this);
            r3.A01(R.string.str1b77);
            r3.A0B(new IDxCListenerShape128S0100000_2_I1(this, 50), R.string.str164d);
            C13680ns.A1H(r3, this, 49, R.string.str1655);
            i3 = 8;
        }
        r3.A03(new IDxCListenerShape162S0100000_2_I1(this, i3));
        return r3.create();
    }
}
