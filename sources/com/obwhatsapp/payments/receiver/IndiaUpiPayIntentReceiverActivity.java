package com.obwhatsapp.payments.receiver;

import X.AnonymousClass175;
import X.AnonymousClass29T;
import X.AnonymousClass5ko;
import X.C110105dW;
import X.C111345g2;
import X.C117995tt;
import X.C119395xh;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C32241fu;
import X.C49132Rg;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.obwhatsapp.R;

public class IndiaUpiPayIntentReceiverActivity extends AnonymousClass5ko {
    public boolean A00;

    public IndiaUpiPayIntentReceiverActivity() {
        this(0);
    }

    public IndiaUpiPayIntentReceiverActivity(int i2) {
        this.A00 = false;
        C110105dW.A0t(this, 10);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1020) {
            setResult(i3, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C117995tt r2 = new C117995tt(this.A0I);
        C119395xh A002 = C119395xh.A00(getIntent().getData(), "DEEP_LINK");
        if (!(getIntent().getData() == null || A002 == null)) {
            AnonymousClass175 r1 = r2.A00;
            if (r1.A0D()) {
                Uri data = getIntent().getData();
                String obj = data.toString();
                if (obj == null || !obj.startsWith("upi://mandate") || this.A0C.A0C(2211)) {
                    Context applicationContext = getApplicationContext();
                    Intent A09 = C13680ns.A09();
                    A09.setClassName(applicationContext.getPackageName(), "com.obwhatsapp.payments.ui.IndiaUpiPaymentLauncherActivity");
                    A09.setData(data);
                    startActivityForResult(A09, 1020);
                    return;
                }
                setResult(0);
            } else {
                boolean A0E = r1.A0E();
                int i2 = SearchActionVerificationClientService.NOTIFICATION_ID;
                if (A0E) {
                    i2 = 10001;
                }
                AnonymousClass29T.A01(this, i2);
                return;
            }
        }
        finish();
    }

    public Dialog onCreateDialog(int i2) {
        C32241fu r2;
        int i3;
        int i4;
        if (i2 == 10000) {
            r2 = C32241fu.A00(this);
            r2.A02(R.string.str0f5f);
            r2.A01(R.string.str0f60);
            i3 = R.string.str0e87;
            i4 = 4;
        } else if (i2 != 10001) {
            return super.onCreateDialog(i2);
        } else {
            r2 = C32241fu.A00(this);
            r2.A02(R.string.str0f5f);
            r2.A01(R.string.str0f61);
            i3 = R.string.str0e87;
            i4 = 3;
        }
        C110105dW.A0w(r2, this, i4, i3);
        r2.A07(false);
        return r2.create();
    }
}
