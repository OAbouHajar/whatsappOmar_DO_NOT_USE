package com.obwhatsapp.userban.ui;

import X.C006602z;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C19750yw;
import X.C49132Rg;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.obwhatsapp.R;
import com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;

public class BanAppealActivity extends C14530pL {
    public BanAppealViewModel A00;
    public String A01;
    public boolean A02;

    public BanAppealActivity() {
        this(0);
    }

    public BanAppealActivity(int i2) {
        this.A02 = false;
        C13680ns.A1G(this, 138);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0089);
        this.A00 = (BanAppealViewModel) new C006602z(this).A01(BanAppealViewModel.class);
        String stringExtra = getIntent().getStringExtra("appeal_request_token");
        int intExtra = getIntent().getIntExtra("ban_violation_type", -1);
        int intExtra2 = getIntent().getIntExtra("launch_source", 0);
        BanAppealViewModel banAppealViewModel = this.A00;
        if (stringExtra != null) {
            C13680ns.A0y(banAppealViewModel.A09.A04.A0K(), "support_ban_appeal_token", stringExtra);
        }
        if (intExtra >= 0) {
            C19750yw r1 = banAppealViewModel.A09;
            Log.i(C13680ns.A0c(intExtra, "BanAppealRepository/storeBanViolationType "));
            C13680ns.A0w(r1.A04.A0K(), "support_ban_appeal_violation_type", intExtra);
        }
        banAppealViewModel.A00 = intExtra2;
        if (bundle == null) {
            this.A00.A06();
        } else {
            this.A01 = bundle.getString("first_fragment_tag_save_instance_state");
        }
        C13680ns.A1M(this, this.A00.A0B, 33);
        C13680ns.A1L(this, this.A00.A01, 133);
        C13680ns.A1L(this, this.A00.A0A, 132);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("BanAppealActivity/onNewIntent");
        BanAppealViewModel banAppealViewModel = this.A00;
        if (banAppealViewModel.A00 == 4) {
            banAppealViewModel.A06();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("first_fragment_tag_save_instance_state", this.A01);
    }

    public void onStart() {
        super.onStart();
        this.A00.A05.A03(42, (String) null);
    }
}
