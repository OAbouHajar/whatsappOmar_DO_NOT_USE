package com.obwhatsapp.wabloks.ui;

import X.AnonymousClass2EA;
import X.AnonymousClass633;
import X.C110105dW;
import X.C110115dX;
import X.C111415g9;
import X.C114695oP;
import X.C1207162s;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C35001lD;
import X.C49132Rg;
import X.C52372dh;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.wabloks.base.FdsContentFragmentManager;

public class WaFcsModalActivity extends C114695oP {
    public FdsContentFragmentManager A00;
    public boolean A01;

    public WaFcsModalActivity() {
        this(0);
    }

    public WaFcsModalActivity(int i2) {
        this.A01 = false;
        C110105dW.A0t(this, AnonymousClass2EA.A03);
    }

    public static Intent A02(Context context, C35001lD r2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return C110105dW.A05(C110105dW.A04(context, WaFcsModalActivity.class).putExtra("screen_name", str).putExtra("screen_params", str2).putExtra("screen_cache_config", r2).putExtra("fds_observer_id", str3), str4, str5, str6, str8).putExtra("qpl_param_map", str7);
    }

    public void A0Y() {
        FdsContentFragmentManager fdsContentFragmentManager = this.A00;
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
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111415g9.A03(A0C, r1, this);
            this.A01 = C110115dX.A0Y(r1);
            this.A02 = new AnonymousClass633(C16150sX.A0Z(r1));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C52372dh r2 = this.A00;
        if (r2 != null) {
            C110105dW.A1N(r2, C1207162s.class, this, 12);
        }
    }

    public void onPause() {
        FdsContentFragmentManager fdsContentFragmentManager = this.A00;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A03 = false;
        }
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        FdsContentFragmentManager fdsContentFragmentManager = this.A00;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A03 = false;
        }
        super.onSaveInstanceState(bundle);
    }
}
