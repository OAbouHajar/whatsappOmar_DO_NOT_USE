package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass01J;
import X.AnonymousClass173;
import X.AnonymousClass175;
import X.AnonymousClass1JN;
import X.AnonymousClass1N5;
import X.AnonymousClass1Vo;
import X.AnonymousClass2SR;
import X.AnonymousClass2Sy;
import X.AnonymousClass4WN;
import X.AnonymousClass5x9;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.AnonymousClass683;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C110405e4;
import X.C111375g5;
import X.C111805hR;
import X.C112315iI;
import X.C112715ix;
import X.C112885jv;
import X.C114435nl;
import X.C115305pX;
import X.C117995tt;
import X.C118805vH;
import X.C119105vx;
import X.C119365wy;
import X.C119405xi;
import X.C119605yk;
import X.C1200960h;
import X.C1209963u;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14710pd;
import X.C14870pt;
import X.C15910s6;
import X.C16040sK;
import X.C16150sX;
import X.C17190ug;
import X.C18260wP;
import X.C18280wR;
import X.C18290wS;
import X.C18310wU;
import X.C18340wX;
import X.C18450wi;
import X.C30671cl;
import X.C32241fu;
import X.C35301lh;
import X.C35521m4;
import X.C39901tF;
import X.C49132Rg;
import X.C93684jb;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape163S0100000_3_I1;
import com.facebook.redex.IDxSDetectorShape311S0100000_3_I1;
import com.obwhatsapp.R;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

public class IndiaUpiBankAccountDetailsActivity extends C112885jv implements AnonymousClass683 {
    public C35521m4 A00;
    public AnonymousClass173 A01;
    public C17190ug A02;
    public C119365wy A03;
    public AnonymousClass60V A04;
    public C18340wX A05;
    public C18310wU A06;
    public C118805vH A07;
    public C112315iI A08;
    public AnonymousClass61W A09;
    public AnonymousClass1N5 A0A;
    public AnonymousClass1JN A0B;
    public C1200960h A0C;
    public C112715ix A0D;
    public C110405e4 A0E;
    public AnonymousClass5x9 A0F;
    public C117995tt A0G;
    public C18280wR A0H;
    public boolean A0I;
    public final AnonymousClass1Vo A0J;

    public IndiaUpiBankAccountDetailsActivity() {
        this(0);
        this.A0J = C110105dW.A0P("IndiaUpiBankAccountDetailsActivity");
    }

    public IndiaUpiBankAccountDetailsActivity(int i2) {
        this.A0I = false;
        C110105dW.A0t(this, 38);
    }

    public void A1q() {
        if (!this.A0I) {
            this.A0I = true;
            C49132Rg A0C2 = C110105dW.A0C(this);
            C16150sX r1 = A0C2.A1s;
            AnonymousClass01J r4 = r1.ARB;
            AnonymousClass01J A022 = C111375g5.A02(r1, this, r4);
            C14530pL.A0b(A0C2, r1, this, C110105dW.A0F(r1));
            C111375g5.A03(r1, this, A022, r4);
            this.A02 = C16150sX.A0t(r1);
            this.A0H = C110115dX.A0V(r1);
            this.A0B = (AnonymousClass1JN) r1.AI5.get();
            this.A0C = (C1200960h) r1.ACB.get();
            this.A03 = (C119365wy) r1.ACI.get();
            this.A0F = (AnonymousClass5x9) r1.A1y.get();
            this.A06 = C110115dX.A0P(r1);
            this.A07 = A0C2.A0Q();
            this.A01 = C110115dX.A0D(r1);
            this.A09 = C110105dW.A0O(r1);
            this.A05 = C110115dX.A0M(r1);
            this.A04 = (AnonymousClass60V) r1.ACJ.get();
            this.A0A = (AnonymousClass1N5) r1.ACD.get();
            this.A0D = (C112715ix) r1.ACG.get();
        }
    }

    public void A37() {
        C1209963u r3 = new C1209963u(this);
        C13680ns.A1U(new C114435nl(this, r3, 103), this.A0G);
    }

    public void A38(C30671cl r10, boolean z2) {
        C93684jb r1;
        View view;
        int i2;
        String string;
        super.A38(r10, z2);
        C35521m4 r0 = (C35521m4) r10;
        this.A00 = r0;
        if (z2) {
            String A062 = C119405xi.A06(r0);
            TextView textView = this.A02;
            StringBuilder A0q = AnonymousClass000.A0q(this.A00.A0B);
            A0q.append(" ");
            A0q.append("•");
            A0q.append("•");
            textView.setText(AnonymousClass000.A0h(A062, A0q));
            this.A03.setText(C13680ns.A0d(this, this.A04.A05().A00, new Object[1], 0, R.string.str1b1e));
            this.A03.A02 = AnonymousClass60V.A00(this.A04);
            this.A03.A03 = getString(R.string.str1b1d);
            C39901tF r2 = this.A00.A08;
            if (r2 instanceof C111805hR) {
                this.A01.setText(((C111805hR) r2).A0C());
            }
            ((ViewGroup) findViewById(R.id.payment_method_additional_details_container)).addView(LayoutInflater.from(this).inflate(R.layout.layout0337, (ViewGroup) null));
            findViewById(R.id.check_balance_container).setOnClickListener(new C119605yk(C110115dX.A06(this, 32), this.A05));
            AnonymousClass2SR.A08(C110115dX.A04(this, R.id.check_balance_icon), AnonymousClass00T.A00(this, R.color.color070f));
            C13690nt.A1I(this, R.id.default_payment_method_divider);
            this.A0E = new C110405e4(this);
            ((ViewGroup) findViewById(R.id.widget_container)).addView(this.A0E);
            C110405e4 r22 = this.A0E;
            if (C119105vx.A00(this.A0C, this.A04.A08())) {
                AnonymousClass1N5 r02 = this.A0A;
                String str = r10.A0A;
                C18450wi.A0H(str, 0);
                AnonymousClass4WN r3 = (AnonymousClass4WN) ((Map) r02.A01.getValue()).get(str);
                if (r3 == null || !r3.A00.equals("activated")) {
                    string = getString(R.string.str1170);
                } else {
                    long parseLong = Long.parseLong(r3.A02);
                    Calendar instance = Calendar.getInstance(Locale.ENGLISH);
                    instance.setTimeInMillis(parseLong * 1000);
                    string = C13680ns.A0d(this, DateFormat.format("dd-MM-yyyy", instance).toString(), new Object[1], 0, R.string.str116d);
                }
                r1 = new C93684jb(string, false);
            } else {
                r1 = null;
            }
            r22.A09 = this;
            C111805hR r32 = (C111805hR) r10.A08;
            r22.findViewById(R.id.reset_upi_pin_container).setOnClickListener(r22);
            r22.A04 = C13680ns.A0M(r22, R.id.reset_upi_pin);
            r22.A00 = r22.findViewById(R.id.change_upi_pin_container);
            r22.A03 = r22.findViewById(R.id.switch_payment_provider_container);
            r22.A02 = r22.findViewById(R.id.upi_international_shimmer);
            r22.A01 = r22.findViewById(R.id.upi_international_container);
            if (r1 != null) {
                r22.setInternationalActivationView(r1);
            }
            C35301lh r03 = r32.A05;
            r22.A08 = r03;
            if (!AnonymousClass000.A1X(r03.A00)) {
                r22.A04.setText(R.string.str10bc);
                view = r22.A00;
                i2 = 8;
            } else {
                view = r22.A00;
                i2 = 0;
            }
            view.setVisibility(i2);
            r22.A00.setOnClickListener(r22);
            r22.A03.setOnClickListener(r22);
            this.A0E.A03.setVisibility(C13680ns.A02(AnonymousClass000.A1O(this.A06.A05(C15910s6.A0k) ? 1 : 0) ^ true ? 1 : 0));
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 == -1) {
            if (i2 == 0) {
                this.A0G.A00(this);
            } else if (i2 == 1012) {
                this.A0E.A00();
            } else {
                if (i2 == 1016) {
                    this.A0E.A00();
                } else if (i2 != 1017) {
                    if (i2 == 1019 && intent != null) {
                        this.A0E.setInternationalActivationView((C93684jb) intent.getParcelableExtra("INTERNATIONAL_ACTIVATION_RESULT_STATE"));
                    }
                }
                C35521m4 r3 = this.A00;
                Intent A042 = C110105dW.A04(this, IndiaUpiPinSetUpCompletedActivity.class);
                C110115dX.A0o(A042, r3);
                A042.putExtra("on_settings_page", true);
                startActivity(A042);
            }
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C110105dW.A0m(this);
        this.A0F.A02(new IDxSDetectorShape311S0100000_3_I1(this, 0));
        this.A0G = new C117995tt(this.A09);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0B(R.string.str0feb);
            x2.A0N(true);
        }
        this.A0J.A06("onCreate");
        C13680ns.A0J(getLayoutInflater().inflate(R.layout.layout0346, (ViewGroup) findViewById(R.id.footer_container), true), R.id.psp_logo).setImageResource(C115305pX.A00(this.A04.A08()).A00);
        C14710pd r16 = this.A0C;
        C16040sK r15 = this.A01;
        C17190ug r14 = this.A02;
        C18290wS r12 = this.A0C;
        C18280wR r11 = this.A0H;
        C119365wy r10 = this.A03;
        AnonymousClass175 r9 = this.A09;
        C18310wU r8 = this.A06;
        C118805vH r7 = this.A07;
        AnonymousClass173 r6 = this.A01;
        AnonymousClass61W r5 = this.A09;
        C18260wP r4 = this.A07;
        C18340wX r3 = this.A05;
        AnonymousClass60V r21 = this.A04;
        AnonymousClass175 r22 = r9;
        C17190ug r19 = r14;
        C119365wy r20 = r10;
        AnonymousClass173 r17 = r6;
        C14710pd r18 = r16;
        C18260wP r162 = r4;
        C14870pt r142 = this.A04;
        this.A08 = new C112315iI(this, r142, r15, r162, r17, r18, r19, r20, r21, r22, r3, r8, r12, r7, r5, this.A0D, r11);
    }

    public Dialog onCreateDialog(int i2) {
        C32241fu r3;
        int i3;
        int i4;
        switch (i2) {
            case 100:
                C18290wS r0 = this.A0C;
                r0.A06();
                boolean A1Q = AnonymousClass000.A1Q(r0.A08.A0T(1).size());
                r3 = C32241fu.A00(this);
                int i5 = R.string.str172a;
                if (A1Q) {
                    i5 = R.string.str172b;
                }
                r3.A06(AnonymousClass2Sy.A05(this, this.A0B, getString(i5)));
                r3.A07(true);
                C110105dW.A0v(r3, this, 14, R.string.str0394);
                C110105dW.A0w(r3, this, 15, R.string.str1091);
                r3.A03(new IDxCListenerShape163S0100000_3_I1(this, 2));
                break;
            case 101:
                r3 = C32241fu.A00(this);
                r3.A02(R.string.str18c1);
                r3.A01(R.string.str18c0);
                C110105dW.A0w(r3, this, 11, R.string.str1cf6);
                i3 = R.string.str0e87;
                i4 = 12;
                break;
            case 103:
                r3 = C32241fu.A00(this);
                r3.A01(R.string.str18f7);
                i3 = R.string.str0e87;
                i4 = 10;
                break;
            case 104:
                r3 = C32241fu.A00(this);
                r3.A01(R.string.str18f8);
                i3 = R.string.str0e87;
                i4 = 13;
                break;
            default:
                return super.onCreateDialog(i2);
        }
        C110105dW.A0v(r3, this, i4, i3);
        return r3.create();
    }

    public void onResume() {
        super.onResume();
        if (this.A0F.A03()) {
            AnonymousClass5x9.A01(this);
        }
    }
}
