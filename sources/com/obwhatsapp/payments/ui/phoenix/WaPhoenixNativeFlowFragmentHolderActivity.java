package com.obwhatsapp.payments.ui.phoenix;

import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.C110105dW;
import X.C110115dX;
import X.C117495t5;
import X.C1207362u;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C20180zd;
import X.C49132Rg;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.base.FdsContentFragmentManager;

public class WaPhoenixNativeFlowFragmentHolderActivity extends C14530pL {
    public C117495t5 A00;
    public C20180zd A01;
    public FdsContentFragmentManager A02;
    public boolean A03;

    public WaPhoenixNativeFlowFragmentHolderActivity() {
        this(0);
    }

    public WaPhoenixNativeFlowFragmentHolderActivity(int i2) {
        this.A03 = false;
        C110105dW.A0t(this, 105);
    }

    public void A0Y() {
        FdsContentFragmentManager fdsContentFragmentManager = this.A02;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A03 = true;
            Runnable runnable = fdsContentFragmentManager.A02;
            if (runnable != null) {
                runnable.run();
                fdsContentFragmentManager.A02 = null;
            }
        }
        super.A0Y();
    }

    public void A1q() {
        if (!this.A03) {
            this.A03 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A01 = C110115dX.A0Y(r1);
        }
    }

    public void onBackPressed() {
        C117495t5 r2 = this.A00;
        r2.A00.A02(r2.A02).A01(new C1207362u(r2.A01, r2.A03, false));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0051);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("fds_on_back");
        String stringExtra2 = intent.getStringExtra("fds_on_back_params");
        String stringExtra3 = intent.getStringExtra("fds_state_name");
        String stringExtra4 = intent.getStringExtra("fds_observer_id");
        intent.getStringExtra("fds_resource_id");
        this.A00 = new C117495t5(this, this.A01, stringExtra3, stringExtra4, stringExtra, stringExtra2);
        AnonymousClass02C AGM = AGM();
        this.A02 = FdsContentFragmentManager.A01(intent.getStringExtra("fds_observer_id"));
        if (AGM.A04() == 0) {
            AnonymousClass050 r2 = new AnonymousClass050(AGM);
            r2.A09(this.A02, R.id.nativeflow_fragment_container);
            r2.A0I(stringExtra3);
            r2.A02();
        }
    }

    public void onDestroy() {
        C117495t5 r2 = this.A00;
        String str = r2.A02;
        if (str != null) {
            r2.A00.A02(str).A03(r2);
        }
        super.onDestroy();
    }

    public void onPause() {
        FdsContentFragmentManager fdsContentFragmentManager = this.A02;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A03 = false;
        }
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        FdsContentFragmentManager fdsContentFragmentManager = this.A02;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A03 = false;
        }
        super.onSaveInstanceState(bundle);
    }
}
