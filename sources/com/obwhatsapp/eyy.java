package com.obwhatsapp;

import X.AnonymousClass1GE;
import X.C16620tM;
import X.C55472jf;
import android.view.View;

public class eyy implements View.OnClickListener {
    final C55472jf A00;

    public eyy(C55472jf r2) {
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.0oI, X.0rz] */
    public void onClick(View view) {
        C55472jf r7 = this.A00;
        if (r7.A0R.A0E(C16620tM.A02, 2767)) {
            ? r0 = r7.A0P;
            String[] strArr = AnonymousClass1GE.A07;
            if (RequestPermissionActivity.A0X(r0, strArr)) {
                boolean A0U = RequestPermissionActivity.A0U(r7.A02, r7.A0O, strArr, 0, 0, 801, true);
            }
        }
        r7.A05();
    }
}
