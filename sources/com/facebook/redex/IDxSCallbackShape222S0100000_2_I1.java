package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass37A;
import X.AnonymousClass37C;
import X.C14550pN;
import X.C14730pf;
import X.C14870pt;
import X.C18450wi;
import X.C32301g2;
import X.C85354Oc;
import android.app.Activity;
import android.os.Build;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

public class IDxSCallbackShape222S0100000_2_I1 implements C32301g2 {
    public Object A00;
    public final int A01;

    public IDxSCallbackShape222S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AVg(String str) {
        throw AnonymousClass000.A0V(this.A01 != 0 ? "must not be called" : "inAppBugReporting/external-storage-readonly");
    }

    public void AVh() {
        throw AnonymousClass000.A0V(this.A01 != 0 ? "must not be called" : "inAppBugReporting/external-storage-readonly/permission denied");
    }

    public void AZJ(String str) {
        StringBuilder A0r;
        String str2;
        String A06;
        switch (this.A01) {
            case 0:
                C85354Oc r2 = (C85354Oc) this.A00;
                r2.A00 = -2;
                A06 = C18450wi.A06("inAppBugReporting/error-external-storage-unavailable/state=", r2.A01);
                break;
            case 1:
                AnonymousClass37C r22 = (AnonymousClass37C) this.A00;
                r22.A00 = -2;
                A0r = AnonymousClass000.A0r("searchSupportTask/externalStorage/avail external storage not calculated, state=");
                str2 = r22.A03;
                break;
            case 2:
                C14550pN r3 = (C14550pN) this.A00;
                C14870pt r23 = r3.A05;
                boolean A002 = C14730pf.A00();
                int i2 = R.string.str0dc1;
                if (A002) {
                    i2 = R.string.str0dc0;
                }
                r23.A09(i2, 1);
                r3.finish();
                return;
            default:
                AnonymousClass37A r24 = (AnonymousClass37A) this.A00;
                r24.A00 = -2;
                A0r = AnonymousClass000.A0r("contactsupporttask/externalstorage/avail external storage not calculated, state=");
                str2 = r24.A01;
                break;
        }
        A06 = AnonymousClass000.A0h(str2, A0r);
        Log.i(A06);
    }

    public void AZK() {
        String str;
        switch (this.A01) {
            case 0:
                ((C85354Oc) this.A00).A00 = -2;
                str = "inAppBugReporting/error-external-storage-unavailable/permission denied";
                break;
            case 1:
                ((AnonymousClass37C) this.A00).A00 = -2;
                str = "searchSupportTask/externalStorage/avail external storage not calculated, permission denied";
                break;
            case 2:
                Activity activity = (Activity) this.A00;
                int i2 = Build.VERSION.SDK_INT;
                int i3 = R.string.str125c;
                if (i2 >= 30) {
                    i3 = R.string.str125f;
                    if (i2 < 33) {
                        i3 = R.string.str125e;
                    }
                }
                RequestPermissionActivity.A0K(activity, R.string.str125d, i3);
                return;
            default:
                ((AnonymousClass37A) this.A00).A00 = -2;
                str = "contactsupporttask/externalstorage/avail external storage not calculated, permission denied";
                break;
        }
        Log.i(str);
    }
}
