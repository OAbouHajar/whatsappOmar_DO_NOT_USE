package com.obwhatsapp.wabloks.commerce.ui.view;

import X.AnonymousClass00B;
import X.AnonymousClass02C;
import X.AnonymousClass1K6;
import X.AnonymousClass1MQ;
import X.AnonymousClass22A;
import X.AnonymousClass2KQ;
import X.AnonymousClass2KR;
import X.AnonymousClass2ZU;
import X.AnonymousClass4DE;
import X.AnonymousClass4NW;
import X.C006602z;
import X.C100704w4;
import X.C108615Or;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15450qv;
import X.C16150sX;
import X.C18450wi;
import X.C29671b0;
import X.C49132Rg;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.facebook.redex.IDxEWrapperShape174S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsNavBarViewModel;
import com.whatsapp.util.Log;
import java.util.Map;

public class WaExtensionsBottomsheetModalActivity extends C14530pL implements AnonymousClass2KQ, AnonymousClass2KR {
    public AnonymousClass2ZU A00;
    public AnonymousClass22A A01;
    public AnonymousClass1MQ A02;
    public WaExtensionsNavBarViewModel A03;
    public Map A04;
    public boolean A05;

    public WaExtensionsBottomsheetModalActivity() {
        this(0);
    }

    public WaExtensionsBottomsheetModalActivity(int i2) {
        this.A05 = false;
        C13680ns.A1G(this, 139);
    }

    public void A1q() {
        if (!this.A05) {
            this.A05 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A02 = A1T.A06();
            this.A00 = (AnonymousClass2ZU) A1T.A1m.get();
            this.A04 = C16150sX.A1C(r1);
        }
    }

    public AnonymousClass1MQ AA9() {
        return this.A02;
    }

    public AnonymousClass22A AH1() {
        return this.A01;
    }

    public void AhU(C108615Or r5) {
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = this.A03;
        try {
            AnonymousClass4NW r2 = new AnonymousClass4NW(r5.A9T().A0G(40));
            if (r2.A00 != null) {
                waExtensionsNavBarViewModel.A00 = new IDxEWrapperShape174S0100000_2_I1(r2, 1);
            }
            String str = r2.A03;
            if (str != null) {
                waExtensionsNavBarViewModel.A04.A00(new C100704w4(waExtensionsNavBarViewModel), str);
            }
        } catch (ClassCastException e2) {
            Log.e(C18450wi.A06("Bloks: Invalid navigation bar type", e2));
        }
    }

    public void AhV(C108615Or r1, boolean z2) {
    }

    public void onBackPressed() {
        C29671b0 r1 = this.A03.A00;
        if (r1 != null) {
            AnonymousClass1K6.A0A(this.A01, r1);
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout060a);
        if (C15450qv.A03()) {
            Window window = getWindow();
            int color = getResources().getColor(R.color.color0792);
        }
        int i2 = 1;
        if (Build.VERSION.SDK_INT == 26) {
            i2 = -1;
        }
        setRequestedOrientation(i2);
        this.A01 = this.A00.A00(this, AGM(), new AnonymousClass4DE(this.A04));
        this.A03 = (WaExtensionsNavBarViewModel) new C006602z(this).A01(WaExtensionsNavBarViewModel.class);
        Intent intent = getIntent();
        C18450wi.A0H(intent, 0);
        ExtensionsBottomsheetBaseContainer extensionsBottomsheetBaseContainer = new ExtensionsBottomsheetBaseContainer();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("screen_name", intent.getStringExtra("screen_name"));
        A0D.putString("screen_params", intent.getStringExtra("screen_params"));
        A0D.putParcelable("screen_cache_config", intent.getParcelableExtra("screen_cache_config"));
        A0D.putString("chat_id", intent.getStringExtra("chat_id"));
        A0D.putString("flow_id", intent.getStringExtra("flow_id"));
        A0D.putBoolean("make_metadata_request", intent.getBooleanExtra("make_metadata_request", false));
        extensionsBottomsheetBaseContainer.A0T(A0D);
        AnonymousClass02C AGM = AGM();
        AnonymousClass00B.A06(AGM);
        extensionsBottomsheetBaseContainer.A1G(AGM, "extensions_bottom_sheet_container");
    }

    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
}
