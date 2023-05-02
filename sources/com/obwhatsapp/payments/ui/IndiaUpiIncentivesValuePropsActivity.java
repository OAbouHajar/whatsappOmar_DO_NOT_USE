package com.obwhatsapp.payments.ui;

import X.AnonymousClass2SR;
import X.AnonymousClass64E;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C111345g2;
import X.C112795jR;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C17110uY;
import X.C30531cW;
import X.C42711yJ;
import X.C49132Rg;
import X.C53302fU;
import X.C53842gO;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class IndiaUpiIncentivesValuePropsActivity extends C112795jR {
    public C17110uY A00;
    public boolean A01;

    public IndiaUpiIncentivesValuePropsActivity() {
        this(0);
    }

    public IndiaUpiIncentivesValuePropsActivity(int i2) {
        this.A01 = false;
        C110105dW.A0t(this, 51);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            C111345g2.A1l(A0C, r1, this);
            this.A00 = C16150sX.A1A(r1);
        }
    }

    public void A3T() {
        this.A03 = 1;
        super.A3T();
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        int i2;
        super.onCreate(bundle);
        setContentView((int) R.layout.layout02fe);
        A3L(R.string.str0fdf, R.color.color069a, R.id.payments_value_props_title_and_description_section);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0B(R.string.str0fdf);
            x2.A0N(true);
        }
        C53302fU A02 = this.A0T.A02();
        if (A02 == null || (str = A02.A0F) == null || (str2 = A02.A0B) == null) {
            Log.e("PAY: IndiaUpiIncentivesValuePropsActivity/PaymentIncentiveOfferInfo is null or has null items in it");
            finish();
            return;
        }
        TextView A0N = C13680ns.A0N(this, R.id.incentives_value_props_title);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.incentives_value_props_desc);
        A0N.setText(str);
        String str3 = A02.A0C;
        if (!TextUtils.isEmpty(str3)) {
            String[] strArr = new String[1];
            C110105dW.A1E(this.A02, str3, strArr, 0);
            Runnable[] runnableArr = {new AnonymousClass64E(this)};
            C30531cW.A04(textEmojiLabel, this.A08, this.A00.A05(C13680ns.A0d(this, str2, new Object[1], 0, R.string.str0b5f), runnableArr, new String[]{"incentive-blurb-cashback-terms"}, strArr));
        } else {
            textEmojiLabel.setText(str2);
        }
        View findViewById = findViewById(R.id.incentive_security_blurb_view);
        View findViewById2 = findViewById(R.id.payment_processor_logo);
        TextView A0N2 = C13680ns.A0N(this, R.id.incentives_value_props_continue);
        C42711yJ AEd = this.A0P.A05("UPI").AEd();
        if (AEd == null || !AEd.A07.A0C(979)) {
            if (C111345g2.A21(this)) {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(8);
                A0N2.setText(R.string.str10d2);
                i2 = 45;
            } else {
                findViewById.setVisibility(0);
                AnonymousClass2SR.A07(this, C110115dX.A04(this, R.id.incentive_security_icon_view), R.color.color05ee);
                findViewById2.setVisibility(0);
                A0N2.setText(R.string.str0b60);
                i2 = 46;
            }
            C110105dW.A0r(A0N2, this, i2);
        } else {
            C110105dW.A0s(A0N2, AEd, this, 10);
        }
        C53842gO A03 = this.A0E.A03(0, (Integer) null, "incentive_value_prop", this.A02);
        A03.A01 = Boolean.valueOf(C111345g2.A21(this));
        C111345g2.A1s(A03, this);
        this.A0D.A09();
    }
}
