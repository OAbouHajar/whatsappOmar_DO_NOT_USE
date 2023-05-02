package com.obwhatsapp.payments.ui;

import X.AnonymousClass5ko;
import X.C110105dW;
import X.C110115dX;
import X.C111345g2;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;
import android.content.Intent;
import android.view.MenuItem;

public class IndiaUpiOnboardingErrorEducationActivity extends AnonymousClass5ko {
    public boolean A00;

    public IndiaUpiOnboardingErrorEducationActivity() {
        this(0);
    }

    public IndiaUpiOnboardingErrorEducationActivity(int i2) {
        this.A00 = false;
        C110105dW.A0t(this, 55);
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

    public final void A3S() {
        Class cls;
        int i2 = 0;
        if (getIntent() != null) {
            i2 = getIntent().getIntExtra("try_again", 0);
        }
        if (this.A0R || i2 <= 0) {
            cls = IndiaUpiPaymentsAccountSetupActivity.class;
        } else {
            if (i2 == 1) {
                cls = IndiaUpiBankPickerActivity.class;
            }
            finish();
        }
        Intent A04 = C110105dW.A04(this, cls);
        A3M(A04);
        startActivity(A04);
        finish();
    }

    public final void A3T(int i2) {
        if (getIntent().hasExtra("extra_error_screen_name")) {
            this.A0E.AKS(C13680ns.A0Y(), Integer.valueOf(i2), getIntent().getStringExtra("extra_error_screen_name"), C110115dX.A0b(this));
        }
    }

    public void onBackPressed() {
        A3T(1);
        A3S();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ea A[LOOP:0: B:22:0x00e4->B:24:0x00ea, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0238  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r0 = r16
            super.onCreate(r0)
            r0 = 2131559187(0x7f0d0313, float:1.874371E38)
            r15.setContentView((int) r0)
            r1 = 2131232247(0x7f0805f7, float:1.8080598E38)
            r0 = 2131365901(0x7f0a100d, float:1.835168E38)
            r15.A3K(r1, r0)
            X.02i r1 = r15.x()
            r10 = 1
            if (r1 == 0) goto L_0x0028
            r0 = 2131890366(0x7f1210be, float:1.9415422E38)
            java.lang.String r0 = r15.getString(r0)
            r1.A0J(r0)
            r1.A0N(r10)
        L_0x0028:
            r0 = 2131363532(0x7f0a06cc, float:1.8346875E38)
            android.widget.TextView r11 = X.C13680ns.A0N(r15, r0)
            r0 = 2131363531(0x7f0a06cb, float:1.8346873E38)
            android.widget.TextView r4 = X.C13680ns.A0N(r15, r0)
            r0 = 2131364901(0x7f0a0c25, float:1.8349652E38)
            android.widget.TextView r3 = X.C13680ns.A0N(r15, r0)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "error"
            r2 = 0
            int r7 = r1.getIntExtra(r0, r2)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "error_text"
            java.lang.String r5 = r1.getStringExtra(r0)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "error_type"
            int r9 = r1.getIntExtra(r0, r2)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "extra_bank_account"
            android.os.Parcelable r1 = r1.getParcelableExtra(r0)
            X.1tG r1 = (X.C39911tG) r1
            java.lang.String r8 = ""
            if (r1 == 0) goto L_0x01f8
            X.1lh r0 = r1.A01
            java.lang.Object r8 = X.C110105dW.A0d(r0)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r0 = r1.A04
        L_0x0076:
            r1 = 2131364034(0x7f0a08c2, float:1.8347894E38)
            android.widget.ImageView r12 = X.C110115dX.A04(r15, r1)
            r1 = 5
            if (r9 < r10) goto L_0x01fb
            r6 = 4
            if (r9 > r6) goto L_0x01fb
            X.0sK r5 = r15.A01
            java.lang.String r13 = X.C110115dX.A0d(r5)
            r6 = 0
            if (r13 == 0) goto L_0x0094
            r6 = 32
            r5 = 160(0xa0, float:2.24E-43)
            java.lang.String r6 = r13.replace(r6, r5)
        L_0x0094:
            X.013 r5 = r15.A01
            java.lang.String r13 = r5.A0H(r6)
            r5 = 2131363655(0x7f0a0747, float:1.8347125E38)
            android.view.View r6 = r15.findViewById(r5)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r5 = 2131363656(0x7f0a0748, float:1.8347127E38)
            android.widget.TextView r5 = X.C13680ns.A0M(r6, r5)
            java.util.ArrayList r1 = X.C13690nt.A0i(r1)
            r14 = 2
            if (r9 != r10) goto L_0x015b
            r5 = 2131890529(0x7f121161, float:1.9415752E38)
            r3.setText(r5)
            r12 = 2131886447(0x7f12016f, float:1.9407473E38)
            java.lang.Object[] r9 = new java.lang.Object[r10]
            X.013 r5 = r15.A01
            java.lang.String r5 = r5.A0G(r8)
            java.lang.String r5 = X.C13680ns.A0d(r15, r5, r9, r2, r12)
            r11.setText(r5)
            r8 = 2131888561(0x7f1209b1, float:1.941176E38)
            if (r7 != r8) goto L_0x00e0
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x014c
            r5 = 2131888562(0x7f1209b2, float:1.9411763E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r7 = X.C13680ns.A0d(r15, r13, r0, r2, r5)
        L_0x00dd:
            r4.setText(r7)
        L_0x00e0:
            java.util.Iterator r9 = r1.iterator()
        L_0x00e4:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0232
            java.lang.String r8 = X.AnonymousClass000.A0m(r9)
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r8)
            android.content.res.Resources r5 = r15.getResources()
            r0 = 2131166725(0x7f070605, float:1.7947703E38)
            float r0 = r5.getDimension(r0)
            int r0 = (int) r0
            X.5dk r5 = new X.5dk
            r5.<init>(r0)
            int r0 = r8.length()
            r7.setSpan(r5, r2, r0, r2)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r15)
            r8.setText(r7)
            android.content.res.Resources r5 = r15.getResources()
            r0 = 2131101381(0x7f0606c5, float:1.781517E38)
            X.C13690nt.A0w(r5, r8, r0)
            android.content.res.Resources r5 = r15.getResources()
            r0 = 2131166683(0x7f0705db, float:1.7947618E38)
            int r0 = r5.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r8.setTextSize(r2, r0)
            android.content.res.Resources r0 = r15.getResources()
            r7 = 2131166682(0x7f0705da, float:1.7947616E38)
            int r0 = r0.getDimensionPixelSize(r7)
            float r5 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.setLineSpacing(r5, r0)
            android.content.res.Resources r0 = r15.getResources()
            int r0 = r0.getDimensionPixelSize(r7)
            r8.setPadding(r2, r2, r2, r0)
            r6.addView(r8)
            goto L_0x00e4
        L_0x014c:
            java.lang.Object[] r7 = new java.lang.Object[r14]
            r7[r2] = r13
            X.013 r5 = r15.A01
            java.lang.String r0 = r5.A0H(r0)
            java.lang.String r7 = X.C13680ns.A0d(r15, r0, r7, r10, r8)
            goto L_0x00dd
        L_0x015b:
            if (r9 != r14) goto L_0x01a9
            if (r12 == 0) goto L_0x0165
            r0 = 2131231694(0x7f0803ce, float:1.8079476E38)
            X.C13700nu.A0L(r15, r12, r0)
        L_0x0165:
            r0 = 2131887831(0x7f1206d7, float:1.941028E38)
            r11.setText(r0)
            r0 = 2131887828(0x7f1206d4, float:1.9410274E38)
            r5.setText(r0)
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()
            r5 = 2131887824(0x7f1206d0, float:1.9410266E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r0 = X.C13680ns.A0d(r15, r13, r0, r2, r5)
            r1.add(r0)
            r0 = 2131887825(0x7f1206d1, float:1.9410268E38)
            java.lang.String r0 = r15.getString(r0)
            r1.add(r0)
            r0 = 2131887826(0x7f1206d2, float:1.941027E38)
            java.lang.String r0 = r15.getString(r0)
            r1.add(r0)
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r5 > r0) goto L_0x00e0
            r5 = 2131887827(0x7f1206d3, float:1.9410272E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r0 = X.C13680ns.A0d(r15, r13, r0, r2, r5)
            r1.add(r0)
            goto L_0x00e0
        L_0x01a9:
            r0 = 3
            if (r9 != r0) goto L_0x01e2
            if (r12 == 0) goto L_0x01b4
            r0 = 2131231694(0x7f0803ce, float:1.8079476E38)
            X.C13700nu.A0L(r15, r12, r0)
        L_0x01b4:
            r0 = 2131887832(0x7f1206d8, float:1.9410282E38)
            r11.setText(r0)
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r7 > r0) goto L_0x01ce
            r0 = 2131887830(0x7f1206d6, float:1.9410278E38)
            java.lang.String r0 = r15.getString(r0)
            r1.add(r0)
        L_0x01ce:
            r7 = 2131887823(0x7f1206cf, float:1.9410264E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r7 = X.C13680ns.A0d(r15, r13, r0, r2, r7)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00dd
            r5.setText(r7)
            goto L_0x00e0
        L_0x01e2:
            if (r12 == 0) goto L_0x01ea
            r0 = 2131231694(0x7f0803ce, float:1.8079476E38)
            X.C13700nu.A0L(r15, r12, r0)
        L_0x01ea:
            r0 = 2131887831(0x7f1206d7, float:1.941028E38)
            r11.setText(r0)
            r0 = 2131887829(0x7f1206d5, float:1.9410276E38)
            r4.setText(r0)
            goto L_0x00e0
        L_0x01f8:
            r0 = r8
            goto L_0x0076
        L_0x01fb:
            if (r7 <= 0) goto L_0x0240
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0215
            if (r9 != r1) goto L_0x0215
        L_0x0205:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            X.013 r0 = r15.A01
            java.lang.String r0 = r0.A0G(r8)
            java.lang.String r0 = X.C13680ns.A0d(r15, r0, r1, r2, r7)
            r4.setText(r0)
            goto L_0x0240
        L_0x0215:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x021f
            r0 = 6
            if (r9 != r0) goto L_0x021f
            goto L_0x0205
        L_0x021f:
            r0 = 7
            if (r9 != r0) goto L_0x022c
            r0 = 2131890529(0x7f121161, float:1.9415752E38)
            r3.setText(r0)
        L_0x0228:
            r4.setText(r5)
            goto L_0x0240
        L_0x022c:
            if (r5 != 0) goto L_0x0228
            r4.setText(r7)
            goto L_0x0240
        L_0x0232:
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0240
            r6.setVisibility(r2)
            r0 = 8
            r4.setVisibility(r0)
        L_0x0240:
            r0 = 48
            X.C110105dW.A0r(r3, r15, r0)
            android.content.Intent r0 = r15.getIntent()
            java.lang.String r1 = "extra_error_screen_name"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L_0x0267
            X.61W r4 = r15.A0E
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r2 = 0
            android.content.Intent r0 = r15.getIntent()
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r0 = X.C110115dX.A0b(r15)
            r4.AKS(r3, r2, r1, r0)
        L_0x0267:
            android.content.res.Configuration r0 = X.C13700nu.A03(r15)
            r15.onConfigurationChanged(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A3T(1);
        A3S();
        return true;
    }
}
