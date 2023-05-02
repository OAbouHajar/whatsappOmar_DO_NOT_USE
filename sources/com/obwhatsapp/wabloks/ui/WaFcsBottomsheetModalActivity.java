package com.obwhatsapp.wabloks.ui;

import X.AnonymousClass00B;
import X.AnonymousClass02C;
import X.AnonymousClass1MQ;
import X.AnonymousClass22A;
import X.AnonymousClass2KR;
import X.AnonymousClass2ZU;
import X.C110105dW;
import X.C110115dX;
import X.C1206562m;
import X.C14550pN;
import X.C15450qv;
import X.C16150sX;
import X.C20180zd;
import X.C49132Rg;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.obwhatsapp.R;
import java.util.Map;

public class WaFcsBottomsheetModalActivity extends C14550pN implements AnonymousClass2KR {
    public AnonymousClass2ZU A00;
    public AnonymousClass1MQ A01;
    public C20180zd A02;
    public FcsBottomsheetBaseContainer A03;
    public Map A04;
    public boolean A05;

    public WaFcsBottomsheetModalActivity() {
        this(0);
    }

    public WaFcsBottomsheetModalActivity(int i2) {
        this.A05 = false;
        C110105dW.A0t(this, 107);
    }

    public static Intent A02(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        return C110105dW.A05(C110105dW.A04(context, WaFcsBottomsheetModalActivity.class).putExtra("screen_params", str).putExtra("fds_observer_id", str2), str3, str4, str5, str6);
    }

    public void A1q() {
        if (!this.A05) {
            this.A05 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            this.A0A = C110105dW.A0F(r1);
            this.A01 = A0C.A06();
            this.A00 = (AnonymousClass2ZU) A0C.A1m.get();
            this.A02 = C110115dX.A0Y(r1);
            this.A04 = C16150sX.A1C(r1);
        }
    }

    public AnonymousClass1MQ AA9() {
        return this.A01;
    }

    public AnonymousClass22A AH1() {
        return C110115dX.A0A(this, AGM(), this.A00, this.A04);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C15450qv.A03()) {
            Window window = getWindow();
            int color = getResources().getColor(R.color.color0792);
        }
        C110105dW.A1N(this.A02.A02(getIntent().getStringExtra("fds_observer_id")), C1206562m.class, this, 11);
        Intent intent = getIntent();
        FcsBottomsheetBaseContainer A012 = FcsBottomsheetBaseContainer.A01(intent.getStringExtra("fds_observer_id"), intent.getStringExtra("fds_on_back"), intent.getStringExtra("fds_on_back_params"), intent.getStringExtra("fds_button_style"), intent.getStringExtra("fds_state_name"));
        this.A03 = A012;
        AnonymousClass02C AGM = AGM();
        AnonymousClass00B.A06(AGM);
        A012.A1G(AGM, "fds_bottom_sheet_container");
    }

    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
}
