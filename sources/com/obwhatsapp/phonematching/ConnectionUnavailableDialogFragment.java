package com.obwhatsapp.phonematching;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass15W;
import X.AnonymousClass1KO;
import X.AnonymousClass1KP;
import X.AnonymousClass3K4;
import X.C001000l;
import X.C13690nt;
import X.C16260sj;
import X.C16320sq;
import X.C18260wP;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import com.obwhatsapp.R;

public class ConnectionUnavailableDialogFragment extends Hilt_ConnectionUnavailableDialogFragment {
    public AnonymousClass1KO A00;
    public C18260wP A01;
    public AnonymousClass01V A02;
    public C16260sj A03;
    public AnonymousClass15W A04;
    public AnonymousClass1KP A05;
    public C16320sq A06;

    public Dialog A1B(Bundle bundle) {
        C001000l A0C = A0C();
        AnonymousClass00B.A06(A0C);
        C32241fu A002 = C32241fu.A00(A0C);
        A002.A01(R.string.str13ad);
        AnonymousClass3K4.A0n(A002, A0C, this, 28, R.string.str0452);
        C13690nt.A1H(A002, this, 82, R.string.str0394);
        return A002.create();
    }

    public void A1G(AnonymousClass02C r2, String str) {
        AnonymousClass050 r0 = new AnonymousClass050(r2);
        r0.A0C(this, str);
        r0.A02();
    }
}
