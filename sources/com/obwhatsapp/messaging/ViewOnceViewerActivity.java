package com.obwhatsapp.messaging;

import X.AnonymousClass01A;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass1yL;
import X.C13690nt;
import X.C14530pL;
import X.C28381Vw;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;

public class ViewOnceViewerActivity extends C14530pL {
    public void onActivityResult(int i2, int i3, Intent intent) {
        AnonymousClass01A A08 = AGM().A08(R.id.view_once_fragment_container);
        if (A08 != null) {
            A08.A0x(i2, i3, intent);
        } else {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout05d8);
        getWindow().setFlags(8192, 8192);
        AnonymousClass02C AGM = AGM();
        AnonymousClass01A A0B = AGM.A0B("view_once_text");
        if (A0B == null) {
            C28381Vw A02 = AnonymousClass1yL.A02(getIntent());
            if (A02 == null) {
                finish();
                return;
            }
            A0B = new ViewOnceTextFragment();
            Bundle A0D = C13690nt.A0D();
            AnonymousClass1yL.A09(A0D, A02, "");
            A0B.A0T(A0D);
        }
        AnonymousClass050 r1 = new AnonymousClass050(AGM);
        r1.A0E(A0B, "view_once_text", R.id.view_once_fragment_container);
        r1.A01();
    }
}
