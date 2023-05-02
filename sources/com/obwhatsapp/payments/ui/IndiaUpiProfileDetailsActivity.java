package com.obwhatsapp.payments.ui;

import X.AnonymousClass04o;
import X.AnonymousClass1Vo;
import X.AnonymousClass5ko;
import X.C001500q;
import X.C005402i;
import X.C006602z;
import X.C110105dW;
import X.C110115dX;
import X.C110615eX;
import X.C111345g2;
import X.C112215i8;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14870pt;
import X.C16150sX;
import X.C17200uh;
import X.C18280wR;
import X.C227719f;
import X.C32241fu;
import X.C35301lh;
import X.C49132Rg;
import X.C53872gR;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.redex.IDxFactoryShape343S0100000_3_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;

public class IndiaUpiProfileDetailsActivity extends AnonymousClass5ko {
    public ImageView A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public ConstraintLayout A08;
    public C17200uh A09;
    public C35301lh A0A;
    public C112215i8 A0B;
    public C110615eX A0C;
    public C227719f A0D;
    public C18280wR A0E;
    public String A0F;
    public boolean A0G;
    public final AnonymousClass1Vo A0H;

    public IndiaUpiProfileDetailsActivity() {
        this(0);
        this.A0H = C110115dX.A0S("IndiaUpiProfileDetailsActivity");
    }

    public IndiaUpiProfileDetailsActivity(int i2) {
        this.A0G = false;
        C110105dW.A0t(this, 71);
    }

    public void A1q() {
        if (!this.A0G) {
            this.A0G = true;
            C49132Rg A0C2 = C110105dW.A0C(this);
            C16150sX r1 = A0C2.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C2, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C2, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            this.A09 = C16150sX.A0R(r1);
            this.A0E = C110115dX.A0V(r1);
            this.A0D = (C227719f) r1.ACE.get();
        }
    }

    public void A3S(boolean z2) {
        int i2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (z2) {
            this.A08.setVisibility(0);
            this.A01.setVisibility(8);
            linearLayout = this.A03;
        } else {
            ArrayList A0n = C13680ns.A0n(this.A0D.A00());
            this.A08.setVisibility(8);
            if (A0n.size() == 0) {
                this.A01.setVisibility(8);
                linearLayout2 = this.A03;
            } else {
                C53872gR r2 = (C53872gR) A0n.get(0);
                this.A03.setVisibility(8);
                this.A01.setVisibility(0);
                this.A05.setText((CharSequence) r2.A00.A00);
                TextView textView = this.A04;
                String str = r2.A02;
                boolean equals = str.equals("active_pending");
                if (equals) {
                    i2 = R.string.str0c5e;
                } else {
                    boolean equals2 = str.equals("deregistered_pending");
                    i2 = R.string.str0c5c;
                    if (equals2) {
                        i2 = R.string.str0c5d;
                    }
                }
                textView.setText(i2);
                if (equals || str.equals("deregistered_pending")) {
                    this.A00.setImageResource(R.drawable.ic_auto_pay);
                    linearLayout = this.A02;
                } else {
                    this.A00.setImageResource(R.drawable.ic_settings_phone);
                    linearLayout2 = this.A02;
                }
            }
            linearLayout2.setVisibility(0);
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final boolean A3T(int i2) {
        if (!this.A0C.A0R()) {
            return true;
        }
        Intent A042 = C110105dW.A04(this, IndiaUpiPaymentsAccountSetupActivity.class);
        A042.putExtra("extra_setup_mode", 2);
        A042.putExtra("extra_payments_entry_type", i2);
        A042.putExtra("extra_skip_value_props_display", false);
        A042.putExtra("extra_referral_screen", "payments_profile");
        A042.putExtra("extra_payment_name", this.A0A);
        A3M(A042);
        startActivity(A042);
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C110105dW.A0m(this);
        setContentView((int) R.layout.layout0345);
        this.A0A = (C35301lh) getIntent().getParcelableExtra("extra_payment_name");
        this.A0F = C110115dX.A0b(this);
        C005402i x2 = x();
        if (x2 != null) {
            C110105dW.A0u(x2, R.string.str194d);
        }
        this.A0H.A06("onCreate");
        C14870pt r6 = this.A05;
        C18280wR r11 = this.A0E;
        this.A0B = new C112215i8(this, r6, this.A0B, this.A0K, this.A0M, this.A0E, r11);
        TextView A0N = C13680ns.A0N(this, R.id.profile_name);
        this.A07 = A0N;
        A0N.setText((CharSequence) C110105dW.A0d(this.A0A));
        TextView A0N2 = C13680ns.A0N(this, R.id.profile_vpa);
        this.A06 = A0N2;
        A0N2.setText((CharSequence) this.A0C.A05().A00);
        this.A03 = (LinearLayout) findViewById(R.id.set_up_upi_number_container);
        this.A05 = C13680ns.A0N(this, R.id.upi_number_text);
        this.A04 = C13680ns.A0N(this, R.id.upi_number_subtext);
        this.A00 = C110115dX.A04(this, R.id.linked_number_image);
        this.A01 = (LinearLayout) findViewById(R.id.linked_upi_number_container);
        this.A02 = (LinearLayout) findViewById(R.id.remove_upi_number_container);
        this.A08 = (ConstraintLayout) findViewById(R.id.shimmer_layout_row);
        C110615eX r0 = (C110615eX) new C006602z((AnonymousClass04o) new IDxFactoryShape343S0100000_3_I1(this, 0), (C001500q) this).A01(C110615eX.class);
        this.A0C = r0;
        C110105dW.A0x(this, r0.A02, 34);
        C110105dW.A0x(this, this.A0C.A01, 33);
        C110105dW.A0r(this.A02, this, 73);
        C110105dW.A0r(this.A03, this, 74);
        A3S(false);
        this.A0E.AKS(0, (Integer) null, "payments_profile", this.A0F);
    }

    public Dialog onCreateDialog(int i2) {
        C32241fu r2;
        if (i2 == 28) {
            r2 = C32241fu.A00(this);
            r2.A01(R.string.str1031);
            C110105dW.A0w(r2, this, 51, R.string.str0e87);
        } else if (i2 != 38) {
            return super.onCreateDialog(i2);
        } else {
            this.A0E.AKS(C13680ns.A0X(), (Integer) null, "alias_remove_confirm_dialog", "payments_profile");
            r2 = C32241fu.A00(this);
            r2.A02(R.string.str1940);
            r2.A01(R.string.str193f);
            C110105dW.A0w(r2, this, 52, R.string.str13e4);
            C110105dW.A0v(r2, this, 53, R.string.str0394);
        }
        return r2.create();
    }

    public void onResume() {
        super.onResume();
        A3S(false);
    }
}
