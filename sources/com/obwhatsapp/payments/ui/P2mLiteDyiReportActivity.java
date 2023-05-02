package com.obwhatsapp.payments.ui;

import X.C005702l;
import X.C112775jP;
import X.C18450wi;
import android.content.DialogInterface;
import android.os.Bundle;
import com.obwhatsapp.R;

public final class P2mLiteDyiReportActivity extends C112775jP {
    public int A35() {
        return R.string.str1097;
    }

    public int A36() {
        return R.string.str0948;
    }

    public int A37() {
        return R.string.str0940;
    }

    public int A38() {
        return R.string.str0749;
    }

    public int A39() {
        return R.string.str08a8;
    }

    public String A3A() {
        String A05 = this.A0C.A05(2759);
        if (A05 != null) {
            return A05;
        }
        String A3A = super.A3A();
        C18450wi.A0B(A3A);
        return A3A;
    }

    public void A3B(int i2, int i3) {
        C005702l A02 = this.A0K.A02(this, (DialogInterface.OnDismissListener) null, (DialogInterface.OnDismissListener) null, i2);
        if (A02 != null) {
            A02.show();
        }
    }

    public void A3C(String str) {
        this.A0U.A0B(str);
    }

    public boolean A3D() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0A.setVisibility(0);
    }
}
