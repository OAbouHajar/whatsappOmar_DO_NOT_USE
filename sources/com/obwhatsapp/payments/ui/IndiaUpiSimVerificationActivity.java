package com.obwhatsapp.payments.ui;

import X.AnonymousClass0PG;
import X.AnonymousClass0y5;
import X.AnonymousClass22U;
import X.AnonymousClass2St;
import X.AnonymousClass5ko;
import X.C110105dW;
import X.C110115dX;
import X.C111345g2;
import X.C113285ln;
import X.C119295wr;
import X.C1220368a;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C16260sj;
import X.C32241fu;
import X.C49132Rg;
import android.content.Intent;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.view.Menu;
import android.view.MenuItem;
import com.obwhatsapp.R;

public class IndiaUpiSimVerificationActivity extends AnonymousClass5ko implements C1220368a {
    public C16260sj A00;
    public C113285ln A01;
    public C119295wr A02;
    public AnonymousClass0y5 A03;
    public boolean A04;

    public IndiaUpiSimVerificationActivity() {
        this(0);
    }

    public IndiaUpiSimVerificationActivity(int i2) {
        this.A04 = false;
        C110105dW.A0t(this, 78);
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            this.A03 = (AnonymousClass0y5) r1.ARa.get();
            this.A00 = C16150sX.A0X(r1);
            this.A02 = A0C.A0X();
            this.A01 = (C113285ln) r1.ACF.get();
        }
    }

    public void A2S(int i2) {
        if (!(i2 == R.string.str1101 || i2 == R.string.str1027 || i2 == R.string.str1029 || i2 == R.string.str10fe || i2 == R.string.str10fd)) {
            A3H();
        }
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1.A0C() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3S() {
        /*
            r15 = this;
            X.0sj r1 = r15.A00
            java.lang.String r4 = "android.permission.SEND_SMS"
            int r0 = r1.A03(r4)
            if (r0 != 0) goto L_0x0011
            boolean r1 = r1.A0C()
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r12 = 0
            r2 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x0204
            X.0sj r0 = r15.A00
            java.lang.String r3 = "android.permission.RECEIVE_SMS"
            int r0 = r0.A03(r3)
            if (r0 == 0) goto L_0x0036
            X.0sj r0 = r15.A00
            int r0 = r0.A03(r4)
            if (r0 != 0) goto L_0x0036
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r1[r2] = r3
            r0 = 100
            X.AnonymousClass00T.A0F(r15, r1, r0)
        L_0x0036:
            boolean r0 = X.C18260wP.A02(r15)
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "airplane_mode_on"
            r15.A3U(r0)
            r0 = 2131890215(0x7f121027, float:1.9415116E38)
        L_0x0044:
            r15.Afg(r0)
            return
        L_0x0048:
            X.01V r0 = r15.A08
            android.telephony.TelephonyManager r0 = r0.A0N()
            if (r0 == 0) goto L_0x0072
            int r1 = r0.getSimState()
            r0 = 5
            if (r1 != r0) goto L_0x0072
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r3 < r0) goto L_0x0177
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = X.AnonymousClass00T.A01(r15, r0)
            if (r0 == 0) goto L_0x007b
            X.1Vo r1 = r15.A0V
            java.lang.String r0 = "WaPermissionsHelper#hasSendSMSAndTelephonePermissions() is missing android.permission.READ_PHONE_STATE permission"
            r1.A05(r0)
            java.lang.String r0 = "read_phone_permission_issues"
            r15.A3U(r0)
            return
        L_0x0072:
            java.lang.String r0 = "sim_state_issues"
            r15.A3U(r0)
            r0 = 2131890217(0x7f121029, float:1.941512E38)
            goto L_0x0044
        L_0x007b:
            android.telephony.SubscriptionManager r0 = android.telephony.SubscriptionManager.from(r15)
            java.util.List r4 = r0.getActiveSubscriptionInfoList()
            X.2St[] r0 = new X.AnonymousClass2St[r2]
            X.2St r10 = new X.2St
            r10.<init>(r0)
            int r0 = r4.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "number_of_sims"
            r10.A01(r0, r1)
            X.61W r9 = r15.A0E
            java.lang.String r13 = "payments_device_binding_precheck"
            java.lang.String r14 = "verify_number"
            r9.AKU(r10, r11, r12, r13, r14)
            int r1 = r4.size()
            if (r1 == 0) goto L_0x0172
            r8 = 1774(0x6ee, float:2.486E-42)
            java.lang.String r7 = "allow_undetermined_number_device_binding"
            r5 = 1
            if (r1 == r5) goto L_0x018c
            r0 = 2
            if (r1 == r0) goto L_0x00c0
            X.1Vo r1 = r15.A0V
            java.lang.String r0 = "Phone has more than 2 sims, which we do not support"
            r1.A05(r0)
            java.lang.String r0 = "more_than_two_sims"
            r15.A3U(r0)
            r15.finish()
            return
        L_0x00c0:
            X.0sK r0 = r15.A01
            r0.A0B()
            X.1ZT r6 = r0.A05
            java.lang.Object r0 = r4.get(r2)
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            java.lang.String r3 = r0.getNumber()
            java.lang.Object r0 = r4.get(r5)
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            java.lang.String r1 = r0.getNumber()
            if (r6 == 0) goto L_0x0127
            java.lang.String r0 = r6.user
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0127
            X.5wr r0 = r15.A02
            java.lang.String r10 = r6.user
            X.1G1 r9 = r0.A01
            X.61W r0 = r0.A0C
            boolean r0 = X.C119295wr.A00(r9, r0, r3, r10)
            if (r0 == 0) goto L_0x010b
            X.1Vo r1 = r15.A0V
            java.lang.String r0 = "sim 1 is not empty, matches with wa number, proceed"
            r1.A06(r0)
            X.60V r1 = r15.A0C
            java.lang.Object r0 = r4.get(r2)
        L_0x0100:
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            int r0 = r0.getSubscriptionId()
            r1.A0G(r0)
            goto L_0x01b4
        L_0x010b:
            X.5wr r0 = r15.A02
            java.lang.String r9 = r6.user
            X.1G1 r6 = r0.A01
            X.61W r0 = r0.A0C
            boolean r0 = X.C119295wr.A00(r6, r0, r1, r9)
            if (r0 == 0) goto L_0x0139
            X.1Vo r1 = r15.A0V
            java.lang.String r0 = "sim 2 is not empty, matches with wa number, proceed"
            r1.A06(r0)
            X.60V r1 = r15.A0C
            java.lang.Object r0 = r4.get(r5)
            goto L_0x0100
        L_0x0127:
            X.1Vo r1 = r15.A0V
            java.lang.String r0 = "Jid Info null, show sim picker"
            goto L_0x0135
        L_0x012c:
            X.61W r0 = r15.A0E
            r0.AKS(r11, r12, r7, r12)
            X.1Vo r1 = r15.A0V
            java.lang.String r0 = "Did not find WA number, show sim picker"
        L_0x0135:
            r1.A06(r0)
            goto L_0x0159
        L_0x0139:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x012c
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x012c
            X.0pd r0 = r15.A0C
            boolean r0 = r0.A0C(r8)
            X.1Vo r1 = r15.A0V
            if (r0 == 0) goto L_0x01eb
            java.lang.String r0 = "Cannot read sim number(s) to compare with WA, show sim picker"
            r1.A06(r0)
            X.61W r0 = r15.A0E
            r0.AKS(r11, r12, r7, r12)
        L_0x0159:
            android.os.Bundle r2 = X.C13690nt.A0D()
            java.util.ArrayList r1 = X.C13680ns.A0n(r4)
            java.lang.String r0 = "extra_subscriptions"
            r2.putParcelableArrayList(r0, r1)
            com.obwhatsapp.payments.ui.IndiaUpiSimPickerDialogFragment r0 = new com.obwhatsapp.payments.ui.IndiaUpiSimPickerDialogFragment
            r0.<init>()
            r0.A0T(r2)
            r15.Afc(r0)
            return
        L_0x0172:
            X.1Vo r1 = r15.A0V
            java.lang.String r0 = "found no sim information, proceeding"
            goto L_0x01b1
        L_0x0177:
            X.1Vo r2 = r15.A0V
            java.lang.String r0 = "Trying payments on android sdk level"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r3)
            java.lang.String r0 = ", we do not have sim apis"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r2.A06(r0)
            goto L_0x01b4
        L_0x018c:
            java.lang.Object r0 = r4.get(r2)
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            java.lang.String r4 = r0.getNumber()
            X.0sK r0 = r15.A01
            r0.A0B()
            X.1ZT r1 = r0.A05
            if (r1 == 0) goto L_0x01e6
            java.lang.String r0 = r1.user
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01e6
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x01b8
            X.1Vo r1 = r15.A0V
            java.lang.String r0 = "found one sim, but not able to read phone number, proceeding"
        L_0x01b1:
            r1.A05(r0)
        L_0x01b4:
            r15.A3T()
            return
        L_0x01b8:
            X.5wr r0 = r15.A02
            java.lang.String r3 = r1.user
            X.1G1 r1 = r0.A01
            X.61W r0 = r0.A0C
            boolean r0 = X.C119295wr.A00(r1, r0, r4, r3)
            X.1Vo r1 = r15.A0V
            if (r0 == 0) goto L_0x01ce
            java.lang.String r0 = "wa number matches with sim number, proceeding"
            r1.A06(r0)
            goto L_0x01b4
        L_0x01ce:
            java.lang.String r0 = "wa number didn't match with sim number, showing error"
            r1.A05(r0)
            X.0pd r0 = r15.A0C
            boolean r0 = r0.A0C(r8)
            if (r0 == 0) goto L_0x01f0
            java.lang.String r0 = "Cannot read sim number, allow device binding"
            r1.A06(r0)
            X.61W r0 = r15.A0E
            r0.AKS(r11, r12, r7, r12)
            goto L_0x01b4
        L_0x01e6:
            X.1Vo r1 = r15.A0V
            java.lang.String r0 = "Jid Info null, proceeding"
            goto L_0x01b1
        L_0x01eb:
            java.lang.String r0 = "Found sims numbers and they do not match, show error"
            r1.A06(r0)
        L_0x01f0:
            r4 = 2131890430(0x7f1210fe, float:1.9415552E38)
            r3 = 2131890429(0x7f1210fd, float:1.941555E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.0sK r0 = r15.A01
            java.lang.String r0 = X.C110115dX.A0d(r0)
            r1[r2] = r0
            r15.Afj(r1, r4, r3)
            return
        L_0x0204:
            X.0sj r2 = r15.A00
            r3 = 153(0x99, float:2.14E-43)
            boolean r0 = r15.isFinishing()
            if (r0 != 0) goto L_0x0267
            int r0 = r2.A03(r4)
            r1 = 1
            if (r0 != 0) goto L_0x0216
            r1 = 0
        L_0x0216:
            boolean r0 = r2.A0C()
            r0 = r0 ^ 1
            if (r1 == 0) goto L_0x0271
            if (r0 == 0) goto L_0x0298
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
            r6.add(r4)
            java.util.List r0 = X.C16260sj.A00()
            r6.addAll(r0)
            X.2iV r5 = new X.2iV
            r5.<init>(r15)
            r0 = 3
            int[] r4 = new int[r0]
            r0 = 2131232308(0x7f080634, float:1.8080722E38)
            r2 = 0
            r4[r2] = r0
            r1 = 2131232304(0x7f080630, float:1.8080713E38)
            r0 = 1
            r4[r0] = r1
            r1 = 2131232297(0x7f080629, float:1.80807E38)
            r0 = 2
            r4[r0] = r1
            r5.A0H = r4
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r0 = r6.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r5.A0K = r0
            r0 = 2131890672(0x7f1211f0, float:1.9416042E38)
            r5.A06 = r0
            r0 = 2131890671(0x7f1211ef, float:1.941604E38)
            r5.A09 = r0
            r5.A0D = r2
            android.content.Intent r0 = r5.A00()
        L_0x0264:
            r15.startActivityForResult(r0, r3)
        L_0x0267:
            X.61W r2 = r15.A0E
            java.lang.String r1 = "allow_sms_dialog"
            java.lang.String r0 = "verify_number"
            r2.AKS(r11, r12, r1, r0)
            return
        L_0x0271:
            X.2iV r2 = new X.2iV
            r2.<init>(r15)
            r0 = 2131232297(0x7f080629, float:1.80807E38)
            r2.A01 = r0
            java.util.List r1 = X.C16260sj.A00()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r2.A0K = r0
            r0 = 2131890788(0x7f121264, float:1.9416278E38)
            r2.A06 = r0
            r0 = 2131890787(0x7f121263, float:1.9416276E38)
            r2.A09 = r0
            r0 = 0
            r2.A0D = r0
            goto L_0x02b6
        L_0x0298:
            X.2iV r2 = new X.2iV
            r2.<init>(r15)
            r0 = 2131232308(0x7f080634, float:1.8080722E38)
            r2.A01 = r0
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r4
            r2.A0K = r0
            r0 = 2131890670(0x7f1211ee, float:1.9416038E38)
            r2.A06 = r0
            r0 = 2131890669(0x7f1211ed, float:1.9416036E38)
            r2.A09 = r0
            r2.A0D = r1
        L_0x02b6:
            android.content.Intent r0 = r2.A00()
            goto L_0x0264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiSimVerificationActivity.A3S():void");
    }

    public final void A3T() {
        this.A01.A00.A09("verifyNumberClicked");
        Intent A042 = C110105dW.A04(this, IndiaUpiDeviceBindStepActivity.class);
        A042.putExtras(C13690nt.A0E(this));
        AnonymousClass22U.A00(A042, "verifyNumber");
        A3M(A042);
        C110115dX.A0p(A042, this, "extra_previous_screen", "verify_number");
    }

    public final void A3U(String str) {
        AnonymousClass2St r3 = new AnonymousClass2St(new AnonymousClass2St[0]);
        r3.A01("device_binding_failure_reason", str);
        this.A0E.AKU(r3, 0, (Integer) null, "payments_device_binding_precheck", "verify_number");
    }

    public void AXF(SubscriptionInfo subscriptionInfo) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.A0C.A0G(subscriptionInfo.getSubscriptionId());
            A3T();
            return;
        }
        this.A0V.A05("Why sim picker is showing for < 22 api level?");
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 153) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            this.A0E.AKS(1, 66, "allow_sms_dialog", (String) null);
            A3S();
        } else {
            Afg(R.string.str1101);
            this.A0E.AKS(1, 67, "allow_sms_dialog", (String) null);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0E.A07((AnonymousClass2St) null, 1, 1, this.A0L, "verify_number", this.A0O);
        if (!this.A0C.A0Q()) {
            Intent A042 = C110105dW.A04(this, IndiaUpiBankPickerActivity.class);
            A3M(A042);
            A2X(A042, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012f, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r9 = r16
            r0 = r17
            super.onCreate(r0)
            r0 = 2131559245(0x7f0d034d, float:1.8743829E38)
            r9.setContentView((int) r0)
            r1 = 2131232247(0x7f0805f7, float:1.8080598E38)
            r0 = 2131365901(0x7f0a100d, float:1.835168E38)
            r9.A3K(r1, r0)
            X.02i r1 = r9.x()
            r4 = 1
            if (r1 == 0) goto L_0x002a
            r0 = 2131890143(0x7f120fdf, float:1.941497E38)
            java.lang.String r0 = r9.getString(r0)
            r1.A0J(r0)
            r1.A0N(r4)
        L_0x002a:
            r0 = 2131363148(0x7f0a054c, float:1.8346097E38)
            android.widget.TextView r6 = X.C13680ns.A0N(r9, r0)
            r7 = 2131890422(0x7f1210f6, float:1.9415535E38)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            X.0sK r0 = r9.A01
            java.lang.String r2 = X.C110115dX.A0d(r0)
            r0 = 0
            if (r2 == 0) goto L_0x0047
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = r2.replace(r1, r0)
        L_0x0047:
            r3 = 0
            java.lang.String r0 = X.C13680ns.A0d(r9, r0, r5, r3, r7)
            r6.setText(r0)
            X.01V r0 = r9.A08
            android.telephony.TelephonyManager r2 = r0.A0N()
            X.0sj r1 = r9.A00
            java.lang.String r0 = "android.permission.SEND_SMS"
            int r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x00e1
            boolean r0 = r1.A0C()
            if (r0 == 0) goto L_0x00e1
            boolean r0 = X.C18260wP.A02(r9)
            if (r0 != 0) goto L_0x00e1
            if (r2 == 0) goto L_0x00e1
            int r1 = r2.getSimState()
            r0 = 5
            if (r1 != r0) goto L_0x00e1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L_0x00e1
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = X.AnonymousClass00T.A01(r9, r0)
            if (r0 != 0) goto L_0x00e1
            X.5wr r0 = r9.A02
            java.util.List r2 = r0.A05(r9)
            int r1 = r2.size()
            r0 = 2
            if (r1 != r0) goto L_0x00e1
            r0 = 2131365369(0x7f0a0df9, float:1.8350601E38)
            android.widget.TextView r5 = X.C13680ns.A0N(r9, r0)
            X.0sK r0 = r9.A01
            r0.A0B()
            X.1ZT r1 = r0.A05
            java.lang.String r8 = X.AnonymousClass000.A0n(r2, r3)
            java.lang.String r7 = X.AnonymousClass000.A0n(r2, r4)
            if (r1 == 0) goto L_0x00db
            java.lang.String r0 = r1.user
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00db
            java.lang.String r2 = r1.user
            X.5wr r0 = r9.A02
            X.1G1 r1 = r0.A01
            X.61W r0 = r0.A0C
            boolean r0 = X.C119295wr.A00(r1, r0, r8, r2)
            if (r0 != 0) goto L_0x00db
            X.5wr r0 = r9.A02
            X.1G1 r1 = r0.A01
            X.61W r0 = r0.A0C
            boolean r0 = X.C119295wr.A00(r1, r0, r7, r2)
            if (r0 == 0) goto L_0x0125
            r2 = 2131890423(0x7f1210f7, float:1.9415537E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.0sK r0 = r9.A01
            java.lang.String r0 = X.C110115dX.A0d(r0)
            java.lang.String r0 = X.C13680ns.A0d(r9, r0, r1, r3, r2)
            r6.setText(r0)
        L_0x00db:
            r0 = 2131890425(0x7f1210f9, float:1.9415541E38)
            r5.setText(r0)
        L_0x00e1:
            r0 = 2131364868(0x7f0a0c04, float:1.8349585E38)
            android.view.View r13 = r9.findViewById(r0)
            com.obwhatsapp.TextEmojiLabel r13 = (com.obwhatsapp.TextEmojiLabel) r13
            X.0pt r12 = r9.A05
            X.0zJ r11 = r9.A00
            X.01V r14 = r9.A08
            r2 = 2131890285(0x7f12106d, float:1.9415257E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "learn-more"
            java.lang.String r15 = X.C13680ns.A0d(r9, r0, r1, r3, r2)
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/learn-more-about-sharing-the-legal-name-on-your-bank-account"
            android.net.Uri r10 = android.net.Uri.parse(r0)
            X.C45922Bq.A08(r9, r10, r11, r12, r13, r14, r15)
            r13.setVisibility(r3)
            r0 = 2131366887(0x7f0a13e7, float:1.835368E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 85
            X.C110105dW.A0r(r1, r9, r0)
            X.61W r0 = r9.A0E
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1 = 0
            java.lang.String r4 = r9.A0L
            java.lang.String r6 = r9.A0O
            java.lang.String r5 = "verify_number"
            r3 = r1
            r0.A07(r1, r2, r3, r4, r5, r6)
            return
        L_0x0125:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00db
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x00e1
            goto L_0x00db
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiSimVerificationActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A3N(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_help) {
            C32241fu A002 = C32241fu.A00(this);
            AnonymousClass0PG r1 = A002.A01;
            r1.A0C = null;
            r1.A01 = R.layout.layout034e;
            A3O(A002, "verify_number");
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        this.A01.A00.A09("verifyNumberShown");
    }
}
