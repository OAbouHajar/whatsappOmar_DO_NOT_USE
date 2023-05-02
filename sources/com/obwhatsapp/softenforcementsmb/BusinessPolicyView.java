package com.obwhatsapp.softenforcementsmb;

import X.AnonymousClass13U;
import X.AnonymousClass4V8;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16620tM;
import X.C49132Rg;
import X.C75663sW;
import android.os.Bundle;
import com.obwhatsapp.WaInAppBrowsingActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

public class BusinessPolicyView extends WaInAppBrowsingActivity {
    public long A00;
    public AnonymousClass13U A01;
    public boolean A02;

    public BusinessPolicyView() {
        this(0);
    }

    public BusinessPolicyView(int i2) {
        this.A02 = false;
        C13680ns.A1G(this, 129);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0f(r1, this);
            this.A01 = (AnonymousClass13U) r1.ALK.get();
        }
    }

    public void onBackPressed() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.A00);
        try {
            AnonymousClass4V8 r5 = new AnonymousClass4V8(C13700nu.A0K(getIntent().getStringExtra("notificationJSONObject")));
            AnonymousClass13U r4 = this.A01;
            Integer A0a = C13680ns.A0a();
            Long valueOf = Long.valueOf(seconds);
            C75663sW r3 = new C75663sW();
            r3.A06 = r5.A05;
            r3.A08 = r5.A07;
            r3.A05 = r5.A04;
            r3.A04 = C13690nt.A0W(r5.A00);
            r3.A07 = r5.A06;
            r3.A00 = C13680ns.A0Y();
            r3.A01 = A0a;
            r3.A02 = A0a;
            r3.A03 = valueOf;
            if (!r4.A00.A0E(C16620tM.A02, 1730)) {
                r4.A01.A06(r3);
            }
        } catch (JSONException e2) {
            Log.e("Error deserializing JSON String: notificationJSONObject", e2);
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = System.currentTimeMillis();
    }
}
