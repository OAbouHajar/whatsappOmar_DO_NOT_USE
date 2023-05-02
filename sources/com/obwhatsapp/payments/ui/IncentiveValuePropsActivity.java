package com.obwhatsapp.payments.ui;

import X.AnonymousClass00T;
import X.AnonymousClass027;
import X.AnonymousClass04o;
import X.AnonymousClass2SR;
import X.AnonymousClass2St;
import X.AnonymousClass5xI;
import X.AnonymousClass5xP;
import X.C001500q;
import X.C005402i;
import X.C006602z;
import X.C110105dW;
import X.C110115dX;
import X.C110625eY;
import X.C117745tU;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C17110uY;
import X.C49132Rg;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxFactoryShape343S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;

public class IncentiveValuePropsActivity extends C14530pL {
    public View A00;
    public View A01;
    public Button A02;
    public TextEmojiLabel A03;
    public WaImageView A04;
    public WaTextView A05;
    public C110625eY A06;
    public C117745tU A07;
    public C17110uY A08;
    public boolean A09;

    public IncentiveValuePropsActivity() {
        this(0);
    }

    public IncentiveValuePropsActivity(int i2) {
        this.A09 = false;
        C110105dW.A0t(this, 33);
    }

    public void A1q() {
        if (!this.A09) {
            this.A09 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A08 = C16150sX.A1A(r1);
            this.A07 = (C117745tU) r1.AHx.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout02fe);
        Toolbar A092 = C110105dW.A09(this);
        TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.layout0425, A092, false);
        C13680ns.A0v(this, textView, R.color.color069a);
        textView.setText(R.string.str0fdf);
        A092.addView(textView);
        Aem(A092);
        C005402i x2 = x();
        if (x2 != null) {
            C110105dW.A0u(x2, R.string.str0fdf);
            A092.setBackgroundColor(AnonymousClass00T.A00(this, R.color.color065f));
            x2.A0E(AnonymousClass2SR.A06(getResources().getDrawable(R.drawable.ic_close), AnonymousClass00T.A00(this, R.color.color059b)));
            x2.A0Q(false);
        }
        this.A05 = (WaTextView) findViewById(R.id.incentives_value_props_title);
        this.A03 = (TextEmojiLabel) findViewById(R.id.incentives_value_props_desc);
        this.A00 = findViewById(R.id.incentive_security_blurb_view);
        this.A01 = findViewById(R.id.payment_processor_logo);
        this.A02 = (Button) findViewById(R.id.incentives_value_props_continue);
        WaImageView waImageView = (WaImageView) findViewById(R.id.incentive_security_icon_view);
        this.A04 = waImageView;
        AnonymousClass2SR.A07(this, waImageView, R.color.color05ee);
        PaymentIncentiveViewModel A0R = C110105dW.A0R(this);
        AnonymousClass027 r1 = A0R.A01;
        r1.A09(AnonymousClass5xI.A01(A0R.A06.A00()));
        C110105dW.A0x(this, r1, 19);
        C110625eY r0 = (C110625eY) new C006602z((AnonymousClass04o) new IDxFactoryShape343S0100000_3_I1(this.A07, 1), (C001500q) this).A01(C110625eY.class);
        this.A06 = r0;
        C110105dW.A0x(this, r0.A00, 18);
        C110625eY r4 = this.A06;
        String A0a = C110115dX.A0a(this);
        AnonymousClass2St A0N = C110105dW.A0N();
        A0N.A02("is_payment_account_setup", r4.A01.A0C());
        AnonymousClass5xP.A02(A0N, r4.A02.A03().ACC(), "incentive_value_prop", A0a);
    }
}
