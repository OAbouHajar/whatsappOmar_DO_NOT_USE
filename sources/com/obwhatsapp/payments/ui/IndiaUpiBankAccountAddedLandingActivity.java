package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass1GP;
import X.AnonymousClass2St;
import X.AnonymousClass5ko;
import X.C110105dW;
import X.C111345g2;
import X.C112525id;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C218315p;
import X.C39841t9;
import X.C49132Rg;
import android.content.Intent;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.components.Button;
import com.whatsapp.util.Log;

public class IndiaUpiBankAccountAddedLandingActivity extends AnonymousClass5ko {
    public ImageView A00;
    public TextView A01;
    public TextView A02;
    public Button A03;
    public Button A04;
    public AnonymousClass1GP A05;
    public C218315p A06;
    public boolean A07;

    public IndiaUpiBankAccountAddedLandingActivity() {
        this(0);
    }

    public IndiaUpiBankAccountAddedLandingActivity(int i2) {
        this.A07 = false;
        C110105dW.A0t(this, 37);
    }

    public void A1q() {
        if (!this.A07) {
            this.A07 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            this.A06 = (C218315p) r1.AIL.get();
            this.A05 = (AnonymousClass1GP) r1.AH4.get();
        }
    }

    public final AnonymousClass2St A3S() {
        if (C39841t9.A03(this.A06) || !this.A06.A0e(this.A0G)) {
            return null;
        }
        return C112525id.A00();
    }

    public void A3T() {
        this.A0E.A07(A3S(), C13680ns.A0Y(), C13680ns.A0a(), this.A0L, "registration_complete", (String) null);
    }

    public void A3U() {
        this.A0E.A07(A3S(), C13680ns.A0Y(), C13690nt.A0U(), this.A0L, "registration_complete", (String) null);
    }

    public void A3V() {
        this.A0E.A07(A3S(), C13680ns.A0Y(), 47, this.A0L, "registration_complete", (String) null);
    }

    public final void A3W() {
        if (this.A0E != null || !C39841t9.A04(this.A09)) {
            Intent A042 = C110105dW.A04(this, IndiaUpiSendPaymentActivity.class);
            A3M(A042);
            startActivity(A042);
        } else {
            Log.e(AnonymousClass000.A0l(AnonymousClass000.A0r("openPaymentActivity, jid and vpa is null, payment entry type = "), this.A02));
        }
        finish();
    }

    public final void A3X(ImageView imageView) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        int applyDimension = (int) TypedValue.applyDimension(1, 64.0f, AnonymousClass000.A0M(this));
        layoutParams.width = applyDimension;
        layoutParams.height = applyDimension;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.ic_hero_bank_added);
    }

    public void onBackPressed() {
        super.onBackPressed();
        A3T();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x021f, code lost:
        r0 = r5.A05;
        r2 = r9.A00;
        r3 = X.AnonymousClass000.A1X(r0.A00);
        r0 = com.obwhatsapp.R.drawable.ic_hero_account_added_landing;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x022c, code lost:
        if (r3 == false) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x022e, code lost:
        r0 = com.obwhatsapp.R.drawable.ic_hero_account_added_landing_mpin;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0231, code lost:
        r2.setImageResource(r0);
        r2 = r9.A02;
        r0 = com.obwhatsapp.R.string.str016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0239, code lost:
        if (r3 == false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x023b, code lost:
        r0 = com.obwhatsapp.R.string.str016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x023e, code lost:
        X.C13690nt.A0s(r9, r2, r0);
        X.C13690nt.A0s(r9, r9.A01, com.obwhatsapp.R.string.str0166);
        X.C13690nt.A0s(r9, r9.A03, com.obwhatsapp.R.string.str02ac);
        r9.A04.setVisibility(8);
        r2 = r9.A03;
        r0 = 23;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r9 = r16
            r0 = r17
            super.onCreate(r0)
            X.C110105dW.A0m(r9)
            r0 = 2131559172(0x7f0d0304, float:1.874368E38)
            r9.setContentView((int) r0)
            X.02i r2 = X.C111345g2.A0r(r9)
            r0 = 1
            if (r2 == 0) goto L_0x0024
            r1 = 2131890138(0x7f120fda, float:1.941496E38)
            java.lang.String r1 = r9.getString(r1)
            r2.A0J(r1)
            r2.A0N(r0)
        L_0x0024:
            java.lang.String r8 = X.C110115dX.A0a(r9)
            X.61W r2 = r9.A0E
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r5 = 0
            java.lang.String r6 = r9.A0L
            X.2St r3 = r9.A3S()
            java.lang.String r7 = "registration_complete"
            r2.A07(r3, r4, r5, r6, r7, r8)
            r2 = 2131364035(0x7f0a08c3, float:1.8347896E38)
            android.widget.ImageView r2 = X.C110115dX.A04(r9, r2)
            r9.A00 = r2
            r2 = 2131366639(0x7f0a12ef, float:1.8353177E38)
            android.widget.TextView r2 = X.C13680ns.A0N(r9, r2)
            r9.A02 = r2
            r2 = 2131363148(0x7f0a054c, float:1.8346097E38)
            android.widget.TextView r2 = X.C13680ns.A0N(r9, r2)
            r9.A01 = r2
            r2 = 2131365466(0x7f0a0e5a, float:1.8350798E38)
            android.view.View r2 = r9.findViewById(r2)
            com.obwhatsapp.components.Button r2 = (com.obwhatsapp.components.Button) r2
            r9.A03 = r2
            r2 = 2131366002(0x7f0a1072, float:1.8351885E38)
            android.view.View r2 = r9.findViewById(r2)
            com.obwhatsapp.components.Button r2 = (com.obwhatsapp.components.Button) r2
            r9.A04 = r2
            r2 = 2131364105(0x7f0a0909, float:1.8348038E38)
            android.view.View r2 = r9.findViewById(r2)
            r3 = 2131364867(0x7f0a0c03, float:1.8349583E38)
            android.view.View r5 = r9.findViewById(r3)
            X.0pt r12 = r9.A05
            X.0zJ r11 = r9.A00
            X.01V r14 = r9.A08
            r3 = 2131364866(0x7f0a0c02, float:1.8349581E38)
            com.obwhatsapp.TextEmojiLabel r13 = X.C13680ns.A0Q(r5, r3)
            r4 = 2131890151(0x7f120fe7, float:1.9414986E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "learn-more"
            java.lang.String r15 = X.C13680ns.A0d(r9, r0, r3, r1, r4)
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/about-payments-data"
            android.net.Uri r10 = android.net.Uri.parse(r0)
            X.C45922Bq.A08(r9, r10, r11, r12, r13, r14, r15)
            r5.setVisibility(r1)
            r0 = 2131364868(0x7f0a0c04, float:1.8349585E38)
            android.view.View r0 = X.C004601z.A0E(r5, r0)
            r6 = 8
            r0.setVisibility(r6)
            X.1m4 r0 = r9.A04
            if (r0 == 0) goto L_0x02a5
            X.1tF r0 = r0.A08
            if (r0 == 0) goto L_0x02a5
            r9.setupIncentiveInfoContainer(r2)
            X.1m4 r0 = r9.A04
            X.1tF r5 = r0.A08
            X.5hR r5 = (X.C111805hR) r5
            int r0 = r9.A02
            switch(r0) {
                case 0: goto L_0x0181;
                case 1: goto L_0x01eb;
                case 2: goto L_0x025b;
                case 3: goto L_0x0148;
                case 4: goto L_0x0148;
                case 5: goto L_0x0186;
                case 6: goto L_0x0148;
                case 7: goto L_0x00c0;
                case 8: goto L_0x0148;
                case 9: goto L_0x0148;
                case 10: goto L_0x0148;
                case 11: goto L_0x0148;
                default: goto L_0x00c0;
            }
        L_0x00c0:
            r0 = 2131361866(0x7f0a004a, float:1.8343496E38)
            android.view.View r4 = r9.findViewById(r0)
            r0 = 2131365554(0x7f0a0eb2, float:1.8350977E38)
            android.view.View r0 = X.C004601z.A0E(r4, r0)
            r0.setVisibility(r6)
            r0 = 2131363227(0x7f0a059b, float:1.8346257E38)
            android.view.View r0 = X.C004601z.A0E(r4, r0)
            r0.setVisibility(r6)
            r0 = 2131365630(0x7f0a0efe, float:1.835113E38)
            android.view.View r0 = X.C004601z.A0E(r4, r0)
            r0.setVisibility(r6)
            X.1m4 r0 = r9.A04
            X.C111345g2.A1h(r4, r0)
            r0 = 2131361869(0x7f0a004d, float:1.8343503E38)
            android.widget.TextView r3 = X.C13680ns.A0L(r4, r0)
            X.0wS r2 = r9.A0P
            X.1m4 r0 = r9.A04
            java.lang.String r0 = X.C119405xi.A05(r9, r0, r2, r1)
            r3.setText(r0)
            r0 = 2131361867(0x7f0a004b, float:1.8343498E38)
            android.widget.TextView r2 = X.C13680ns.A0L(r4, r0)
            X.1lh r0 = r5.A03
            java.lang.Object r0 = X.C110105dW.A0d(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
            r0 = 2131361878(0x7f0a0056, float:1.834352E38)
            android.widget.TextView r2 = X.C13680ns.A0L(r4, r0)
            int r0 = r5.A0C()
            r2.setText(r0)
            java.lang.String r2 = r5.A0B
            java.lang.String r0 = "OD_UNSECURED"
            boolean r0 = r0.equals(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0142
            X.0pd r2 = r9.A0C
            r0 = 1677(0x68d, float:2.35E-42)
            boolean r0 = r2.A0C(r0)
            if (r0 == 0) goto L_0x0142
            r0 = 2131364964(0x7f0a0c64, float:1.834978E38)
            android.widget.TextView r2 = X.C13680ns.A0N(r9, r0)
            r2.setVisibility(r1)
            r0 = 2131886441(0x7f120169, float:1.940746E38)
            r2.setText(r0)
        L_0x0142:
            X.1GP r0 = r9.A05
            r0.A04()
            return
        L_0x0148:
            boolean r0 = r9.A0S
            if (r0 != 0) goto L_0x021f
            X.1lh r4 = r5.A05
            android.widget.ImageView r0 = r9.A00
            r9.A3X(r0)
            android.widget.TextView r2 = r9.A02
            r0 = 2131886444(0x7f12016c, float:1.9407467E38)
            X.C13690nt.A0s(r9, r2, r0)
            android.widget.TextView r3 = r9.A01
            java.lang.Object r0 = r4.A00
            boolean r2 = X.AnonymousClass000.A1X(r0)
            r0 = 2131886440(0x7f120168, float:1.9407459E38)
            if (r2 == 0) goto L_0x016b
            r0 = 2131886439(0x7f120167, float:1.9407457E38)
        L_0x016b:
            X.C13690nt.A0s(r9, r3, r0)
            com.obwhatsapp.components.Button r2 = r9.A03
            r0 = 2131886436(0x7f120164, float:1.940745E38)
            X.C13690nt.A0s(r9, r2, r0)
            com.obwhatsapp.components.Button r0 = r9.A04
            r0.setVisibility(r6)
            com.obwhatsapp.components.Button r2 = r9.A03
            r0 = 31
            goto L_0x02a0
        L_0x0181:
            java.lang.String r0 = "Wrong onboarding type 0"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0186:
            boolean r0 = r9.A0S
            X.1lh r4 = r5.A05
            if (r0 == 0) goto L_0x01b8
            android.widget.ImageView r2 = r9.A00
            java.lang.Object r0 = r4.A00
            boolean r3 = X.AnonymousClass000.A1X(r0)
            r0 = 2131231686(0x7f0803c6, float:1.807946E38)
            if (r3 == 0) goto L_0x019c
            r0 = 2131231687(0x7f0803c7, float:1.8079462E38)
        L_0x019c:
            r2.setImageResource(r0)
            android.widget.TextView r2 = r9.A02
            r0 = 2131886443(0x7f12016b, float:1.9407465E38)
            if (r3 == 0) goto L_0x01a9
            r0 = 2131886442(0x7f12016a, float:1.9407463E38)
        L_0x01a9:
            com.obwhatsapp.components.Button r2 = X.C111345g2.A0u(r2, r9, r0)
            r0 = 25
            X.C110105dW.A0r(r2, r9, r0)
            com.obwhatsapp.components.Button r2 = r9.A04
            r0 = 27
            goto L_0x02a0
        L_0x01b8:
            android.widget.ImageView r0 = r9.A00
            r9.A3X(r0)
            android.widget.TextView r2 = r9.A02
            r0 = 2131886444(0x7f12016c, float:1.9407467E38)
            X.C13690nt.A0s(r9, r2, r0)
            android.widget.TextView r3 = r9.A01
            java.lang.Object r0 = r4.A00
            boolean r2 = X.AnonymousClass000.A1X(r0)
            r0 = 2131886440(0x7f120168, float:1.9407459E38)
            if (r2 == 0) goto L_0x01d5
            r0 = 2131886439(0x7f120167, float:1.9407457E38)
        L_0x01d5:
            X.C13690nt.A0s(r9, r3, r0)
            com.obwhatsapp.components.Button r2 = r9.A03
            r0 = 2131886436(0x7f120164, float:1.940745E38)
            X.C13690nt.A0s(r9, r2, r0)
            com.obwhatsapp.components.Button r0 = r9.A04
            r0.setVisibility(r6)
            com.obwhatsapp.components.Button r2 = r9.A03
            r0 = 26
            goto L_0x02a0
        L_0x01eb:
            int r2 = r9.A00
            r0 = 20
            if (r2 == r0) goto L_0x021f
            X.1lh r0 = r5.A05
            android.widget.ImageView r2 = r9.A00
            java.lang.Object r0 = r0.A00
            boolean r3 = X.AnonymousClass000.A1X(r0)
            r0 = 2131231686(0x7f0803c6, float:1.807946E38)
            if (r3 == 0) goto L_0x0203
            r0 = 2131231687(0x7f0803c7, float:1.8079462E38)
        L_0x0203:
            r2.setImageResource(r0)
            android.widget.TextView r2 = r9.A02
            r0 = 2131886443(0x7f12016b, float:1.9407465E38)
            if (r3 == 0) goto L_0x0210
            r0 = 2131886442(0x7f12016a, float:1.9407463E38)
        L_0x0210:
            com.obwhatsapp.components.Button r2 = X.C111345g2.A0u(r2, r9, r0)
            r0 = 24
            X.C110105dW.A0r(r2, r9, r0)
            com.obwhatsapp.components.Button r2 = r9.A04
            r0 = 28
            goto L_0x02a0
        L_0x021f:
            X.1lh r0 = r5.A05
            android.widget.ImageView r2 = r9.A00
            java.lang.Object r0 = r0.A00
            boolean r3 = X.AnonymousClass000.A1X(r0)
            r0 = 2131231686(0x7f0803c6, float:1.807946E38)
            if (r3 == 0) goto L_0x0231
            r0 = 2131231687(0x7f0803c7, float:1.8079462E38)
        L_0x0231:
            r2.setImageResource(r0)
            android.widget.TextView r2 = r9.A02
            r0 = 2131886443(0x7f12016b, float:1.9407465E38)
            if (r3 == 0) goto L_0x023e
            r0 = 2131886442(0x7f12016a, float:1.9407463E38)
        L_0x023e:
            X.C13690nt.A0s(r9, r2, r0)
            android.widget.TextView r2 = r9.A01
            r0 = 2131886438(0x7f120166, float:1.9407455E38)
            X.C13690nt.A0s(r9, r2, r0)
            com.obwhatsapp.components.Button r2 = r9.A03
            r0 = 2131886764(0x7f1202ac, float:1.9408116E38)
            X.C13690nt.A0s(r9, r2, r0)
            com.obwhatsapp.components.Button r0 = r9.A04
            r0.setVisibility(r6)
            com.obwhatsapp.components.Button r2 = r9.A03
            r0 = 23
            goto L_0x02a0
        L_0x025b:
            X.1lh r0 = r5.A05
            android.widget.ImageView r2 = r9.A00
            java.lang.Object r0 = r0.A00
            boolean r3 = X.AnonymousClass000.A1X(r0)
            r0 = 2131231686(0x7f0803c6, float:1.807946E38)
            if (r3 == 0) goto L_0x026d
            r0 = 2131231687(0x7f0803c7, float:1.8079462E38)
        L_0x026d:
            r2.setImageResource(r0)
            android.widget.TextView r2 = r9.A02
            r0 = 2131886443(0x7f12016b, float:1.9407465E38)
            if (r3 == 0) goto L_0x027a
            r0 = 2131886442(0x7f12016a, float:1.9407463E38)
        L_0x027a:
            X.C13690nt.A0s(r9, r2, r0)
            android.widget.TextView r2 = r9.A01
            r0 = 2131886438(0x7f120166, float:1.9407455E38)
            X.C13690nt.A0s(r9, r2, r0)
            com.obwhatsapp.components.Button r2 = r9.A03
            r0 = 2131886436(0x7f120164, float:1.940745E38)
            X.C13690nt.A0s(r9, r2, r0)
            com.obwhatsapp.components.Button r2 = r9.A04
            r0 = 2131886437(0x7f120165, float:1.9407453E38)
            X.C13690nt.A0s(r9, r2, r0)
            com.obwhatsapp.components.Button r2 = r9.A03
            r0 = 29
            X.C110105dW.A0r(r2, r9, r0)
            com.obwhatsapp.components.Button r2 = r9.A04
            r0 = 30
        L_0x02a0:
            X.C110105dW.A0r(r2, r9, r0)
            goto L_0x00c0
        L_0x02a5:
            java.lang.String r0 = "Screen called without valid account, finishing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A3T();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void setupIncentiveInfoContainer(View view) {
        String A0d;
        if (this.A00 == 20) {
            A0d = getString(R.string.str0b5b);
        } else if (C39841t9.A03(this.A06) || !this.A06.A0e(this.A0G)) {
            view.setVisibility(8);
            return;
        } else {
            A0d = C13680ns.A0d(this, C39841t9.A02(this.A06), C13680ns.A1b(), 0, R.string.str016d);
        }
        view.setVisibility(0);
        C13680ns.A0L(view, R.id.incentive_info_text).setText(A0d);
    }
}
