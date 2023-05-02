package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass0y5;
import X.AnonymousClass173;
import X.AnonymousClass175;
import X.AnonymousClass1Vo;
import X.AnonymousClass2HJ;
import X.AnonymousClass2St;
import X.AnonymousClass4XO;
import X.AnonymousClass5kM;
import X.AnonymousClass5vV;
import X.AnonymousClass5x3;
import X.AnonymousClass60L;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.AnonymousClass64C;
import X.AnonymousClass68T;
import X.AnonymousClass69M;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C110175dd;
import X.C111345g2;
import X.C111775hO;
import X.C111805hR;
import X.C112265iD;
import X.C112275iE;
import X.C113275lm;
import X.C113285ln;
import X.C114285nW;
import X.C117995tt;
import X.C118985vj;
import X.C119175wf;
import X.C119265wo;
import X.C119295wr;
import X.C119365wy;
import X.C1200960h;
import X.C1204661t;
import X.C1222768y;
import X.C13680ns;
import X.C13700nu;
import X.C14710pd;
import X.C14870pt;
import X.C16260sj;
import X.C16320sq;
import X.C16980tz;
import X.C17190ug;
import X.C18280wR;
import X.C18290wS;
import X.C18300wT;
import X.C18310wU;
import X.C18340wX;
import X.C224918d;
import X.C35301lh;
import X.C35521m4;
import X.C40031tS;
import X.C53842gO;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.IDxECallbackShape391S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.whatsapp.util.IDxATaskShape1S1100000_3_I1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class IndiaUpiDeviceBindStepActivity extends AnonymousClass5kM implements C1222768y, AnonymousClass68T {
    public static final AnonymousClass69M A0f = new AnonymousClass60L();
    public int A00 = 0;
    public int A01;
    public int A02 = -1;
    public PendingIntent A03;
    public View A04;
    public View A05;
    public View A06;
    public WaImageView A07;
    public C16260sj A08;
    public AnonymousClass173 A09;
    public C1204661t A0A;
    public C111805hR A0B;
    public AnonymousClass2HJ A0C;
    public AnonymousClass4XO A0D;
    public C224918d A0E;
    public C119175wf A0F;
    public C112275iE A0G;
    public AnonymousClass5vV A0H;
    public C114285nW A0I;
    public C110175dd A0J;
    public C1200960h A0K;
    public C113275lm A0L;
    public C113285ln A0M;
    public C117995tt A0N;
    public C119295wr A0O;
    public C18280wR A0P;
    public AnonymousClass0y5 A0Q;
    public Runnable A0R;
    public Runnable A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public ArrayList A0X;
    public C118985vj A0Y;
    public boolean A0Z;
    public boolean A0a = false;
    public boolean A0b;
    public boolean A0c;
    public final C53842gO A0d = new C53842gO();
    public final AnonymousClass1Vo A0e = C110115dX.A0S("IndiaUpiDeviceBindActivity");

    public static /* synthetic */ void A02(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        String str;
        AnonymousClass1Vo r8;
        ArrayList A0u;
        String str2;
        Bundle bundle;
        ArrayList<String> stringArrayList;
        int i2;
        AnonymousClass00B.A00();
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity2 = indiaUpiDeviceBindStepActivity;
        indiaUpiDeviceBindStepActivity2.A00++;
        C119365wy r1 = indiaUpiDeviceBindStepActivity2.A0B;
        C111805hR r7 = indiaUpiDeviceBindStepActivity2.A0B;
        ArrayList A0u2 = AnonymousClass000.A0u();
        AnonymousClass60V r4 = r1.A09;
        if (r4.A0Q()) {
            String A082 = r4.A08();
            if (TextUtils.isEmpty(A082)) {
                r4.AhX(r7);
                A082 = r7 != null ? r7.A0A : r4.A08();
            }
            if (!TextUtils.isEmpty(A082)) {
                A0u2.add(A082);
            }
        } else {
            ArrayList A083 = r1.A08(r7);
            if (A083 == null || A083.isEmpty()) {
                str = "PAY: IndiaUPIPaymentSetup psps list is null or empty";
            } else {
                int i3 = r1.A01;
                A0u2.add(A083.get(i3 % A083.size()));
                if (A083.size() > 1) {
                    A0u2.add(A083.get((i3 + 1) % A083.size()));
                } else {
                    str = "PAY: IndiaUPIPaymentSetup psps list has only one psp";
                }
            }
            Log.e(str);
        }
        int size = A0u2.size();
        int i4 = indiaUpiDeviceBindStepActivity2.A00;
        if (size >= i4) {
            indiaUpiDeviceBindStepActivity2.A0U = (String) A0u2.get(i4 - 1);
        } else {
            AnonymousClass1Vo r42 = indiaUpiDeviceBindStepActivity2.A0e;
            StringBuilder A0r = AnonymousClass000.A0r("IndiaUpiDeviceBindActivity : not enough psp available, pspSize: ");
            A0r.append(A0u2);
            A0r.append(", multipleSmsNumber : ");
            A0r.append(indiaUpiDeviceBindStepActivity2.A00);
            C110105dW.A1L(r42, A0r);
            indiaUpiDeviceBindStepActivity2.finish();
        }
        try {
            if (Build.VERSION.SDK_INT < 22 || (i2 = indiaUpiDeviceBindStepActivity2.A02) < 0) {
                r8 = indiaUpiDeviceBindStepActivity2.A0e;
                r8.A06("sending sms from default sim");
                A0u = AnonymousClass000.A0u();
                A0u.add(SmsManager.getDefault());
            } else {
                r8 = indiaUpiDeviceBindStepActivity2.A0e;
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("sending sms from sim subscription id: ");
                A0o.append(i2);
                C110105dW.A1L(r8, A0o);
                A0u = AnonymousClass000.A0u();
                A0u.add(indiaUpiDeviceBindStepActivity2.A0O.A02(indiaUpiDeviceBindStepActivity2.A02));
            }
            C111345g2.A1x(indiaUpiDeviceBindStepActivity2);
            for (int i5 = 0; i5 < A0u.size(); i5++) {
                String A3F = indiaUpiDeviceBindStepActivity2.A3F("");
                C119365wy r11 = indiaUpiDeviceBindStepActivity2.A0B;
                C111775hO A022 = r11.A02(indiaUpiDeviceBindStepActivity2.A0U);
                if (A022 == null || (bundle = A022.A00) == null || (stringArrayList = bundle.getStringArrayList("smsGateways")) == null || stringArrayList.size() <= 0 || stringArrayList.isEmpty()) {
                    Log.e("PAY: IndiaUPIPaymentSetup smsGateways list is null or empty");
                    str2 = null;
                } else {
                    AnonymousClass00B.A0A("", stringArrayList);
                    int size2 = stringArrayList.size();
                    r11.A00 = size2;
                    int i6 = r11.A02 % size2;
                    r11.A02 = i6;
                    str2 = stringArrayList.get(i6);
                }
                indiaUpiDeviceBindStepActivity2.A0V = str2;
                C119365wy r9 = indiaUpiDeviceBindStepActivity2.A0B;
                C111775hO A023 = r9.A02(indiaUpiDeviceBindStepActivity2.A0U);
                indiaUpiDeviceBindStepActivity2.A0W = indiaUpiDeviceBindStepActivity2.A3G((A023 == null || TextUtils.isEmpty(A023.A0D())) ? r9.A09.A07() : A023.A0D(), A3F);
                C111775hO A024 = indiaUpiDeviceBindStepActivity2.A0B.A02(indiaUpiDeviceBindStepActivity2.A0U);
                String A0B2 = (A024 == null || TextUtils.isEmpty(A024.A0B())) ? "TRL WHA" : A024.A0B();
                SmsManager smsManager = (SmsManager) A0u.get(i5);
                StringBuilder A0q = AnonymousClass000.A0q(A0B2);
                A0q.append(" ");
                ArrayList<String> divideMessage = smsManager.divideMessage(AnonymousClass000.A0h(indiaUpiDeviceBindStepActivity2.A0W, A0q));
                ArrayList A0u3 = AnonymousClass000.A0u();
                for (int i7 = 0; i7 < divideMessage.size(); i7++) {
                    A0u3.add(indiaUpiDeviceBindStepActivity2.A03);
                }
                try {
                    C53842gO A032 = indiaUpiDeviceBindStepActivity2.A0E.A03(0, (Integer) null, "db_sms_sent", "device_binding");
                    A032.A0N = indiaUpiDeviceBindStepActivity2.A0V;
                    A032.A0M = Long.valueOf((long) indiaUpiDeviceBindStepActivity2.A00);
                    C111345g2.A1s(A032, indiaUpiDeviceBindStepActivity2);
                    smsManager.sendMultipartTextMessage(indiaUpiDeviceBindStepActivity2.A0V, (String) null, divideMessage, A0u3, (ArrayList) null);
                    indiaUpiDeviceBindStepActivity2.A0b = true;
                } catch (IllegalArgumentException | NullPointerException | SecurityException | UnsupportedOperationException e2) {
                    r8.A0A("IndiaUpiPaymentSetup sendDeviceBindingSms failed. Manual SMS no longer available. More details: ", e2);
                    indiaUpiDeviceBindStepActivity2.A3f("sms_not_supported", false);
                    C111345g2.A1z(indiaUpiDeviceBindStepActivity2.A0M, 3);
                    C111345g2.A1z(indiaUpiDeviceBindStepActivity2.A0L, 3);
                    indiaUpiDeviceBindStepActivity2.finish();
                }
            }
            AnonymousClass4XO r0 = indiaUpiDeviceBindStepActivity2.A0D;
            if (r0 != null) {
                r0.A04("device-binding-sms");
            }
        } catch (IllegalArgumentException | IllegalStateException e3) {
            indiaUpiDeviceBindStepActivity2.A0e.A0A("IndiaUpiDeviceBindActivity showSmsErrorAndFinish after sendDeviceBindingSms threw: ", e3);
            AnonymousClass4XO r12 = indiaUpiDeviceBindStepActivity2.A0D;
            if (r12 != null) {
                r12.A06("device-binding-sms", -1);
            }
            indiaUpiDeviceBindStepActivity2.A3f("illegal_state_exception", false);
            indiaUpiDeviceBindStepActivity2.A3b(new C119265wo(R.string.str1026), true);
        }
    }

    public static /* synthetic */ void A03(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        ArrayList A0u;
        int i2;
        AnonymousClass00B.A00();
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity2 = indiaUpiDeviceBindStepActivity;
        String A062 = indiaUpiDeviceBindStepActivity2.A0B.A06(indiaUpiDeviceBindStepActivity2.A0B);
        AnonymousClass1Vo r11 = indiaUpiDeviceBindStepActivity2.A0e;
        StringBuilder A0r = AnonymousClass000.A0r("IndiaUpiDeviceBindActivity sendDeviceBindingSms called for psp: ");
        A0r.append(A062);
        A0r.append(" with ordering: ");
        A0r.append(indiaUpiDeviceBindStepActivity2.A0B.A08(indiaUpiDeviceBindStepActivity2.A0B));
        C110105dW.A1L(r11, A0r);
        int i3 = 0;
        if (Build.VERSION.SDK_INT < 22 || (i2 = indiaUpiDeviceBindStepActivity2.A02) < 0) {
            r11.A06("sending sms from default sim");
            A0u = AnonymousClass000.A0u();
            A0u.add(SmsManager.getDefault());
        } else {
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append("sending sms from sim subscription id: ");
            A0o.append(i2);
            C110105dW.A1L(r11, A0o);
            A0u = AnonymousClass000.A0u();
            A0u.add(indiaUpiDeviceBindStepActivity2.A0O.A02(indiaUpiDeviceBindStepActivity2.A02));
        }
        C111345g2.A1x(indiaUpiDeviceBindStepActivity2);
        C35301lh A0J2 = C110105dW.A0J(C110105dW.A0L(), String.class, indiaUpiDeviceBindStepActivity2.A3F(""), "smsVerificationDataGen");
        AnonymousClass60V r4 = indiaUpiDeviceBindStepActivity2.A0C;
        synchronized (r4) {
            try {
                C18300wT r5 = r4.A03;
                JSONObject A0k = C110105dW.A0k(r5);
                A0k.put("v", "2");
                Object obj = A0J2.A00;
                AnonymousClass00B.A06(obj);
                A0k.put("smsVerifDataGen", obj);
                C110105dW.A1J(r5, A0k);
            } catch (JSONException e2) {
                Log.w("PAY: IndiaUpiPaymentSharedPrefs storeSmsVerificationDataGenerated threw: ", e2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
            try {
            } catch (IllegalArgumentException | IllegalStateException e3) {
                r11.A0A("IndiaUpiDeviceBindActivity showSmsErrorAndFinish after sendDeviceBindingSms threw: ", e3);
                AnonymousClass4XO r1 = indiaUpiDeviceBindStepActivity2.A0D;
                if (r1 != null) {
                    r1.A06("device-binding-sms", -1);
                }
                indiaUpiDeviceBindStepActivity2.A3f("illegal_state_exception", false);
                indiaUpiDeviceBindStepActivity2.A3b(new C119265wo(R.string.str1026), true);
                return;
            }
        }
        String A3G = indiaUpiDeviceBindStepActivity2.A3G(indiaUpiDeviceBindStepActivity2.A0B.A07(indiaUpiDeviceBindStepActivity2.A0B), C110115dX.A0e(A0J2));
        String A052 = indiaUpiDeviceBindStepActivity2.A0B.A05(indiaUpiDeviceBindStepActivity2.A0B);
        AnonymousClass60V r3 = indiaUpiDeviceBindStepActivity2.A0C;
        synchronized (r3) {
            try {
                C18300wT r42 = r3.A03;
                JSONObject A0k2 = C110105dW.A0k(r42);
                A0k2.put("v", "2");
                A0k2.put("smsVerifDataGateway", A052);
                C110105dW.A1J(r42, A0k2);
            } catch (JSONException e4) {
                Log.w("PAY: IndiaUpiPaymentSharedPrefs storeSmsGateway threw: ", e4);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
        C111775hO A012 = indiaUpiDeviceBindStepActivity2.A0B.A01(indiaUpiDeviceBindStepActivity2.A0B);
        String A0B2 = (A012 == null || TextUtils.isEmpty(A012.A0B())) ? "TRL WHA" : A012.A0B();
        int i4 = 0;
        while (i4 < A0u.size()) {
            SmsManager smsManager = (SmsManager) A0u.get(i4);
            StringBuilder A0q = AnonymousClass000.A0q(A0B2);
            A0q.append(" ");
            ArrayList<String> divideMessage = smsManager.divideMessage(AnonymousClass000.A0h(A3G, A0q));
            ArrayList A0u2 = AnonymousClass000.A0u();
            for (int i5 = 0; i5 < divideMessage.size(); i5++) {
                A0u2.add(indiaUpiDeviceBindStepActivity2.A03);
            }
            try {
                C53842gO A032 = indiaUpiDeviceBindStepActivity2.A0E.A03(Integer.valueOf(i3), (Integer) null, "db_sms_sent", "device_binding");
                A032.A0N = indiaUpiDeviceBindStepActivity2.A0V;
                C111345g2.A1s(A032, indiaUpiDeviceBindStepActivity2);
                smsManager.sendMultipartTextMessage(A052, (String) null, divideMessage, A0u2, (ArrayList) null);
                indiaUpiDeviceBindStepActivity2.A0b = true;
            } catch (IllegalArgumentException | NullPointerException | SecurityException | UnsupportedOperationException e5) {
                r11.A0A("IndiaUpiPaymentSetup sendDeviceBindingSms failed. Manual SMS no longer available. More details: ", e5);
                indiaUpiDeviceBindStepActivity2.A3f("sms_not_supported", false);
                C111345g2.A1z(indiaUpiDeviceBindStepActivity2.A0M, 3);
                C111345g2.A1z(indiaUpiDeviceBindStepActivity2.A0L, 3);
                indiaUpiDeviceBindStepActivity2.finish();
            }
            AnonymousClass4XO r0 = indiaUpiDeviceBindStepActivity2.A0D;
            if (r0 != null) {
                r0.A04("device-binding-sms");
            }
            i4++;
            i3 = 0;
        }
        StringBuilder A0o2 = AnonymousClass000.A0o();
        A0o2.append("IndiaUpiDeviceBindActivity sendDeviceBindingSms sent sms to psp: ");
        A0o2.append(A062);
        A0o2.append(" smsNumber: ");
        A0o2.append(A052);
        A0o2.append(" smsPrefix: ");
        A0o2.append(A0B2);
        A0o2.append(" verificationData:");
        r11.A06(AnonymousClass000.A0h(AnonymousClass5x3.A00(A3G), A0o2));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3S() {
        /*
            r2 = this;
            java.lang.String r1 = r2.A0T
            int r0 = r1.hashCode()
            switch(r0) {
                case 49: goto L_0x0025;
                case 50: goto L_0x0046;
                case 51: goto L_0x0054;
                case 52: goto L_0x0064;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "1"
            r2.A0T = r0
            android.view.View r0 = r2.A06
            r2.markStepProcessing(r0)
            android.view.View r0 = r2.A04
            r2.markStepDisabled(r0)
            android.view.View r0 = r2.A05
            r2.markStepDisabled(r0)
            com.obwhatsapp.WaImageView r1 = r2.A07
            r0 = 2131231848(0x7f080468, float:1.8079789E38)
        L_0x0021:
            X.C13700nu.A0L(r2, r1, r0)
            return
        L_0x0025:
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = "2"
            r2.A0T = r0
            android.view.View r0 = r2.A06
            r2.markStepDone(r0)
            android.view.View r0 = r2.A04
            r2.markStepProcessing(r0)
            android.view.View r0 = r2.A05
            r2.markStepDisabled(r0)
            com.obwhatsapp.WaImageView r1 = r2.A07
            r0 = 2131231959(0x7f0804d7, float:1.8080014E38)
            goto L_0x0021
        L_0x0046:
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.2HJ r0 = r2.A0C
            r2.A3Z(r0)
            return
        L_0x0054:
            java.lang.String r0 = "3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.util.ArrayList r1 = r2.A0X
            X.2HJ r0 = r2.A0C
            r2.A3a(r0, r1)
            return
        L_0x0064:
            java.lang.String r0 = "4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            r2.A3T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A3S():void");
    }

    public final void A3T() {
        this.A0e.A06("PAY: continueOnFinishDeviceBind called");
        C40031tS A012 = this.A0I.A01("add_bank");
        C40031tS A013 = this.A0I.A01("2fa");
        this.A0I.A08(A012);
        this.A0I.A08(A013);
        Intent A042 = C110105dW.A04(this, IndiaUpiAccountRecoveryFinishActivity.class);
        A3M(A042);
        C110115dX.A0p(A042, this, "extra_previous_screen", "device_binding");
    }

    public final void A3U() {
        if (this.A08.A03("android.permission.RECEIVE_SMS") != 0 && this.A08.A03("android.permission.SEND_SMS") == 0) {
            AnonymousClass00T.A0F(this, new String[]{"android.permission.RECEIVE_SMS"}, 100);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003c, code lost:
        if (r0.getSimState() != 5) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3V() {
        /*
            r4 = this;
            X.5lm r0 = r4.A0L
            java.lang.String r1 = "smsSend"
            X.1dR r0 = r0.A00
            r0.A08(r1)
            java.lang.String r0 = "1"
            r4.A0T = r0
            android.view.View r0 = r4.A06
            r4.markStepProcessing(r0)
            android.view.View r0 = r4.A04
            r4.markStepDisabled(r0)
            android.view.View r0 = r4.A05
            r4.markStepDisabled(r0)
            com.obwhatsapp.WaImageView r1 = r4.A07
            r0 = 2131231848(0x7f080468, float:1.8079789E38)
            X.C13700nu.A0L(r4, r1, r0)
            X.5ln r0 = r4.A0M
            java.lang.String r1 = "deviceBindingStarted"
            X.1dR r0 = r0.A00
            r0.A09(r1)
            X.01V r0 = r4.A08
            android.telephony.TelephonyManager r0 = r0.A0N()
            r3 = 1
            if (r0 == 0) goto L_0x003e
            int r2 = r0.getSimState()
            r0 = 5
            r1 = 1
            if (r2 == r0) goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            boolean r0 = X.C18260wP.A02(r4)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "airplane_mode_on"
            r4.A3e(r0)
            r1 = 2131890215(0x7f121027, float:1.9415116E38)
        L_0x004d:
            X.5wo r0 = new X.5wo
            r0.<init>(r1)
            r4.A3b(r0, r3)
            return
        L_0x0056:
            if (r1 != 0) goto L_0x0061
            java.lang.String r0 = "sim_state_issues"
            r4.A3e(r0)
            r1 = 2131890217(0x7f121029, float:1.941512E38)
            goto L_0x004d
        L_0x0061:
            X.5nW r1 = new X.5nW
            r1.<init>(r4)
            r4.A0I = r1
            X.0sq r0 = r4.A05
            X.C13700nu.A0W(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A3V():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        markStepDone(r2.A06);
        markStepDone(r2.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        markStepDisabled(r2.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        markStepDisabled(r2.A04);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3W() {
        /*
            r2 = this;
            java.lang.String r1 = r2.A0T
            int r0 = r1.hashCode()
            switch(r0) {
                case 49: goto L_0x000a;
                case 50: goto L_0x0018;
                case 51: goto L_0x002b;
                case 52: goto L_0x002e;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r2.A06
            r2.markStepDisabled(r0)
            goto L_0x0025
        L_0x0018:
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r2.A06
            r2.markStepDone(r0)
        L_0x0025:
            android.view.View r0 = r2.A04
            r2.markStepDisabled(r0)
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "3"
            goto L_0x0030
        L_0x002e:
            java.lang.String r0 = "4"
        L_0x0030:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r2.A06
            r2.markStepDone(r0)
            android.view.View r0 = r2.A04
            r2.markStepDone(r0)
        L_0x0040:
            android.view.View r0 = r2.A05
            r2.markStepDisabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A3W():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (r2 == com.obwhatsapp.R.string.str0df7) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3X(int r6) {
        /*
            r5 = this;
            X.60h r1 = r5.A0K
            X.4XO r0 = r5.A0D
            X.5wo r4 = r1.A04(r0, r6)
            X.1Vo r3 = r5.A0e
            java.lang.String r0 = "onDeviceBinding failure. showErrorAndFinish: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            X.4XO r1 = r5.A0D
            java.lang.String r0 = "upi-bind-device"
            int r0 = r1.A00(r0)
            r2.append(r0)
            X.C110105dW.A1L(r3, r2)
            int r2 = r4.A00
            r0 = 2131890159(0x7f120fef, float:1.9415002E38)
            if (r2 == r0) goto L_0x0030
            r0 = 2131890225(0x7f121031, float:1.9415136E38)
            if (r2 == r0) goto L_0x0030
            r1 = 2131889655(0x7f120df7, float:1.941398E38)
            r0 = 1
            if (r2 != r1) goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r5.A3b(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A3X(int):void");
    }

    public final void A3Y(View view, String str, String str2) {
        TextView A0M2 = C13680ns.A0M(view, R.id.bind_step_number);
        if (A0M2 != null) {
            A0M2.setText(str);
        }
        TextView A0M3 = C13680ns.A0M(view, R.id.bind_step_desc);
        if (A0M3 != null) {
            A0M3.setText(str2);
        }
        markStepDisabled(view);
    }

    public final void A3Z(AnonymousClass2HJ r11) {
        int i2;
        int i3;
        this.A0b = false;
        C53842gO A0x = C111345g2.A0x(r11, this, C111345g2.A1c(this));
        int i4 = this.A0F.A00;
        int i5 = i4 - 1;
        int i6 = i5;
        if (i4 == 0) {
            i5 = 0;
        }
        A0x.A0K = Long.valueOf((long) i5);
        if (i4 == 0) {
            i6 = 0;
        }
        long j2 = 0;
        int i7 = 0;
        while (i7 <= i6) {
            long[] jArr = C119175wf.A0L;
            j2 += i7 < jArr.length ? jArr[i7] : ((long) i7) * 5;
            i7++;
        }
        A0x.A0L = Long.valueOf(j2);
        C119365wy r2 = this.A0B;
        A0x.A0M = Long.valueOf((long) r2.A02);
        A0x.A0N = r2.A05(this.A0B);
        C111345g2.A1t(A0x, this, "device_binding");
        AnonymousClass1Vo r22 = this.A0e;
        r22.A06(AnonymousClass000.A0g("PaymentUserActionEvent devicebind event:", A0x));
        C111345g2.A1s(A0x, this);
        StringBuilder A0r = AnonymousClass000.A0r("IndiaUpiDeviceBindActivity: onDeviceBinding: ");
        A0r.append(AnonymousClass000.A1W(r11));
        C110105dW.A1L(r22, A0r);
        if (r11 == null || (i2 = r11.A00) == 11453) {
            this.A0L.A00.A08("getAccounts");
            C13700nu.A0W(new IDxATaskShape1S1100000_3_I1(this, this.A0C.A08(), 1), this.A05);
        } else if (!C1200960h.A02(this, "upi-bind-device", i2, true)) {
            int i8 = r11.A00;
            if (i8 != 476) {
                if (i8 != 11452) {
                    if (!(i8 == 11477 || i8 == 11544)) {
                        if (i8 != 11469) {
                            if (i8 != 11470) {
                                StringBuilder A0r2 = AnonymousClass000.A0r("onDeviceBinding failure. showErrorAndFinish at error: ");
                                A0r2.append(this.A0D.A00("upi-bind-device"));
                                C110105dW.A1L(r22, A0r2);
                                i3 = 2;
                            }
                        } else if (this.A0D.A07("upi-bind-device")) {
                            this.A0b = true;
                            StringBuilder A0r3 = AnonymousClass000.A0r("onDeviceBinding failure. Retry delayedDeviceVerifIqHandlerMessage at error: ");
                            A0r3.append(this.A0D.A00("upi-bind-device"));
                            C110105dW.A1L(r22, A0r3);
                            this.A0F.A00();
                            return;
                        } else if (this.A0D.A00("upi-bind-device") >= 3) {
                            C111345g2.A1w(this);
                            this.A01 = 4;
                            A3X(this.A0D.A00);
                            this.A0B.A0A();
                            return;
                        } else {
                            return;
                        }
                    }
                    C111345g2.A1w(this);
                    i3 = 3;
                } else {
                    C111345g2.A1w(this);
                    i3 = 4;
                }
                this.A01 = i3;
                A3X(r11.A00);
                return;
            }
            C111345g2.A1w(this);
            A3b(new C119265wo(R.string.str196a), false);
        }
    }

    public final void A3a(AnonymousClass2HJ r8, ArrayList arrayList) {
        long j2;
        short s2;
        C119265wo A042;
        int i2;
        AnonymousClass1Vo r3 = this.A0e;
        StringBuilder A0r = AnonymousClass000.A0r("onBankAccountsList: ");
        A0r.append(arrayList);
        r3.A06(AnonymousClass000.A0e(r8, " error: ", A0r));
        String A1c = C111345g2.A1c(this);
        AnonymousClass61W r1 = this.A0E;
        r1.A08(A1c);
        C53842gO A022 = r1.A02(r8, 18);
        C111345g2.A1t(A022, this, "device_binding");
        A022.A0O = this.A0B.A0C;
        if (arrayList != null) {
            A022.A01 = Boolean.valueOf(AnonymousClass000.A1Q(arrayList.size()));
            j2 = (long) arrayList.size();
        } else {
            A022.A01 = Boolean.FALSE;
            j2 = 0;
        }
        A022.A0H = Long.valueOf(j2);
        C111345g2.A1s(A022, this);
        r3.A04(AnonymousClass000.A0g("logGetAccounts: ", A022));
        C113275lm r2 = this.A0L;
        if (r8 != null) {
            s2 = 3;
        } else {
            r2.A00.A07("getAccounts");
            r2 = this.A0L;
            s2 = 2;
        }
        C111345g2.A1z(r2, s2);
        if (arrayList == null || arrayList.isEmpty()) {
            if (arrayList != null) {
                A3W();
                this.A01 = 1;
                AnonymousClass2HJ r4 = new AnonymousClass2HJ(11473);
                i2 = R.string.str09b1;
                if (A3R(this.A0B, r4, getString(R.string.str09b1))) {
                    return;
                }
            } else if (r8 != null && !C1200960h.A02(this, "upi-get-accounts", r8.A00, true)) {
                String A002 = this.A0A.A00(r8.A00);
                if (A002 != null) {
                    A3W();
                    if (!A3R(this.A0B, r8, A002)) {
                        A3b(new C119265wo(r8.A00, A002), true);
                        return;
                    }
                    return;
                }
                int i3 = r8.A00;
                if (i3 == 11473) {
                    A3W();
                    i2 = R.string.str0fed;
                } else if (i3 == 11485) {
                    A3W();
                    this.A01 = 5;
                    i2 = R.string.str0fdc;
                } else if (i3 == 11487) {
                    A3W();
                    this.A01 = 6;
                    i2 = R.string.str0fdb;
                } else if (i3 == 11467 || i3 == 11543) {
                    A3W();
                    C111345g2.A1w(this);
                    this.A01 = 3;
                    A3b(new C119265wo(R.string.str0fef), true);
                    this.A0B.A0A();
                    return;
                } else {
                    A042 = this.A0K.A04(this.A0D, i3);
                    StringBuilder A0r2 = AnonymousClass000.A0r("onBankAccountsList failure. showErrorAndFinish: ");
                    A0r2.append(this.A0D.A00("upi-get-accounts"));
                    C110105dW.A1L(r3, A0r2);
                    int i4 = A042.A00;
                    if (i4 == R.string.str0fef || i4 == R.string.str1031 || i4 == R.string.str0df7) {
                        A3b(A042, false);
                        return;
                    }
                    this.A01 = 1;
                    A3b(A042, true);
                }
            } else {
                return;
            }
            A042 = new C119265wo(i2);
            A3b(A042, true);
        } else if (arrayList.size() != 1 || ((C111805hR) arrayList.get(0)).A0H) {
            A3g(arrayList);
        } else if (!this.A0a) {
            this.A0a = true;
            boolean z2 = this.A0R;
            this.A0G.A00((C111805hR) arrayList.get(0), new IDxECallbackShape391S0100000_3_I1(this, 2), z2, z2);
        }
    }

    public final void A3b(C119265wo r6, boolean z2) {
        int i2 = r6.A00;
        AnonymousClass1Vo r3 = this.A0e;
        r3.A06(C13680ns.A0c(i2, "IndiaUpiDeviceBindActivity showErrorAndFinish: "));
        A3W();
        if (i2 == 0) {
            i2 = R.string.str10f2;
            String str = this.A0D.A04;
            if ("upi-bind-device".equalsIgnoreCase(str)) {
                i2 = R.string.device_binding_failure_reasons_bullet_list_title;
            }
            if ("upi-get-accounts".equalsIgnoreCase(str)) {
                this.A01 = 1;
                i2 = R.string.str09b1;
            }
        }
        if (z2) {
            AnonymousClass4XO r0 = this.A0D;
            if (r0 != null) {
                r0.A01();
                StringBuilder A0r = AnonymousClass000.A0r("clearStates: ");
                A0r.append(this.A0D);
                C110105dW.A1L(r3, A0r);
            }
            this.A0B.A04 = new AnonymousClass4XO();
            Intent A042 = C110105dW.A04(this, IndiaUpiOnboardingErrorEducationActivity.class);
            if (r6.A01 != null) {
                A042.putExtra("error_text", r6.A01(this));
            }
            A042.putExtra("error", i2);
            A042.putExtra("error_type", this.A01);
            int i3 = this.A01;
            if (i3 >= 1 && i3 <= 6) {
                C110115dX.A0o(A042, this.A0B);
            }
            if (!this.A0R) {
                A042.putExtra("try_again", 1);
            }
            A042.addFlags(335544320);
            A3M(A042);
            A042.putExtra("extra_previous_screen", "device_binding");
            A2X(A042, true);
        } else {
            C111345g2.A1i(this, r6);
        }
        C111345g2.A1z(this.A0M, 3);
        C111345g2.A1z(this.A0L, 3);
    }

    public final void A3c(Integer num, Integer num2) {
        C53842gO r1 = this.A0d;
        r1.A07 = num2;
        r1.A08 = num;
        C111345g2.A1t(r1, this, "device_binding");
        C111345g2.A1s(r1, this);
    }

    public final void A3d(String str) {
        if (this.A0Z) {
            this.A0e.A06("PAY: getAccountsOrFinishAfterDeviceBinding called");
            this.A0T = "4";
            markStepDone(this.A06);
            markStepDone(this.A04);
            markStepProcessing(this.A05);
            C13700nu.A0L(this, this.A07, R.drawable.ic_account_search);
            A3T();
            return;
        }
        this.A0T = "3";
        markStepDone(this.A06);
        markStepDone(this.A04);
        markStepProcessing(this.A05);
        C13700nu.A0L(this, this.A07, R.drawable.ic_account_search);
        AnonymousClass1Vo r2 = this.A0e;
        StringBuilder A0r = AnonymousClass000.A0r("getAccountsAfterDeviceBinding: bank picked and calling sendGetBankAccounts for: ");
        A0r.append(this.A0B.A01);
        A0r.append(" accountProvider:");
        A0r.append(this.A0B.A0A);
        A0r.append(" psp: ");
        r2.A06(AnonymousClass000.A0h(str, A0r));
        this.A0F.A01(this.A0B);
        this.A0E.AgB();
    }

    public final void A3e(String str) {
        AnonymousClass2St r3 = new AnonymousClass2St(new AnonymousClass2St[0]);
        r3.A01("device_binding_failure_reason", str);
        this.A0E.AKU(r3, 0, (Integer) null, "device_binding", "payments_device_binding_precheck");
    }

    public final void A3f(String str, boolean z2) {
        String A1c = C111345g2.A1c(this);
        AnonymousClass61W r0 = this.A0E;
        r0.A08(A1c);
        C53842gO A7M = r0.A7M();
        A7M.A0O = this.A0B.A0C;
        C111345g2.A1t(A7M, this, "db_sms_sent");
        int i2 = 28;
        if (z2) {
            i2 = 27;
        }
        A7M.A07 = Integer.valueOf(i2);
        if (!z2) {
            AnonymousClass2St A0N2 = C110105dW.A0N();
            A0N2.A01("device_binding_failure_reason", str);
            A7M.A0Y = A0N2.toString();
        }
        this.A0e.A06(AnonymousClass000.A0h(A7M.toString(), AnonymousClass000.A0r("PaymentUserActionEvent smsSent event: ")));
        C111345g2.A1s(A7M, this);
    }

    public final void A3g(ArrayList arrayList) {
        this.A0e.A06("IndiaUpiDeviceBindActivity showBankAccounts called");
        Intent A042 = C110105dW.A04(this, IndiaUpiBankAccountPickerActivity.class);
        A042.putParcelableArrayListExtra("extra_accounts_list", arrayList);
        A042.putExtra("extra_selected_account_bank_logo", this.A0B.A03);
        A3M(A042);
        C110115dX.A0p(A042, this, "extra_previous_screen", "device_binding");
    }

    public void ANT(AnonymousClass2HJ r2, ArrayList arrayList) {
        this.A0X = arrayList;
        this.A0C = r2;
        if (!this.A0T) {
            A3a(r2, arrayList);
        }
    }

    public void APe(AnonymousClass2HJ r9) {
        int i2;
        int i3;
        int i4;
        if (this.A0T) {
            this.A0C = r9;
        } else if (this.A0C.A0C(2686)) {
            C53842gO A0x = C111345g2.A0x(r9, this, this.A0U);
            Long valueOf = Long.valueOf((long) this.A00);
            A0x.A0K = valueOf;
            A0x.A0L = 3L;
            A0x.A0M = valueOf;
            A0x.A0N = this.A0V;
            C111345g2.A1t(A0x, this, "device_binding");
            AnonymousClass2St A0N2 = C110105dW.A0N();
            A0N2.A02("is_multiple_sms_flow", true);
            A0x.A0Y = A0N2.toString();
            AnonymousClass1Vo r5 = this.A0e;
            r5.A06(AnonymousClass000.A0g("PaymentUserActionEvent devicebind event:", A0x));
            C111345g2.A1s(A0x, this);
            StringBuilder A0r = AnonymousClass000.A0r("IndiaUpiDeviceBindActivity: onDeviceBinding: ");
            A0r.append(AnonymousClass000.A1W(r9));
            C110105dW.A1L(r5, A0r);
            ArrayList A082 = this.A0B.A08(this.A0B);
            if (r9 == null || (i2 = r9.A00) == 11453) {
                this.A0b = false;
                this.A0L.A00.A08("getAccounts");
                C13700nu.A0W(new IDxATaskShape1S1100000_3_I1(this, this.A0C.A08(), 0), this.A05);
            } else if (A082 != null && A082.size() > (i4 = this.A00) && i4 < 2) {
                this.A0b = true;
                C114285nW r1 = new C114285nW(this);
                this.A0I = r1;
                C13700nu.A0W(r1, this.A05);
            } else if (!C1200960h.A02(this, "upi-bind-device", i2, true)) {
                this.A0b = false;
                C119365wy r3 = this.A0B;
                ArrayList arrayList = r3.A07;
                if (arrayList != null && arrayList.size() > 1) {
                    r3.A01 += 2;
                }
                r3.A02 = 0;
                int i5 = r9.A00;
                if (i5 != 476) {
                    if (i5 != 11452) {
                        if (!(i5 == 11477 || i5 == 11544)) {
                            if (i5 != 11469) {
                                if (i5 != 11470) {
                                    StringBuilder A0r2 = AnonymousClass000.A0r("onDeviceBinding failure. showErrorAndFinish at error: ");
                                    A0r2.append(this.A0D.A00("upi-bind-device"));
                                    C110105dW.A1L(r5, A0r2);
                                    this.A01 = 2;
                                    A3X(r9.A00);
                                    return;
                                }
                            }
                        }
                        this.A0C.A7n(r3.A06(this.A0B), true);
                        i3 = 3;
                        this.A01 = i3;
                        A3X(r9.A00);
                        return;
                    }
                    this.A0C.A7n(r3.A06(this.A0B), true);
                    i3 = 4;
                    this.A01 = i3;
                    A3X(r9.A00);
                    return;
                }
                this.A0C.A7n(r3.A06(this.A0B), true);
                A3b(new C119265wo(R.string.str196a), false);
            }
        } else {
            A3Z(r9);
        }
    }

    public void AVw(C35521m4 r3, AnonymousClass2HJ r4) {
        if (r3 != null) {
            this.A04 = r3;
            A3Q("device_binding");
            C111345g2.A1z(this.A0M, 2);
            return;
        }
        A3g(this.A0X);
    }

    public final void markStepDisabled(View view) {
        View findViewById = view.findViewById(R.id.bind_step_number);
        if (findViewById != null) {
            Drawable drawable = getResources().getDrawable(R.drawable.step_circle);
            drawable.setColorFilter(AnonymousClass00T.A00(this, R.color.color074c), PorterDuff.Mode.SRC_OVER);
            findViewById.setBackground(drawable);
        }
        View findViewById2 = view.findViewById(R.id.bind_step_number_progress);
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
        }
        TextView A0M2 = C13680ns.A0M(view, R.id.bind_step_desc);
        if (A0M2 != null) {
            C13680ns.A0v(this, A0M2, R.color.color074f);
        }
    }

    public final void markStepDone(View view) {
        View findViewById = view.findViewById(R.id.bind_step_number);
        if (findViewById != null) {
            findViewById.setVisibility(4);
        }
        View findViewById2 = view.findViewById(R.id.bind_step_number_progress);
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
        }
        View findViewById3 = view.findViewById(R.id.bind_step_check);
        if (findViewById3 != null) {
            Drawable drawable = getResources().getDrawable(R.drawable.step_circle);
            drawable.setColorFilter(AnonymousClass00T.A00(this, R.color.color074a), PorterDuff.Mode.SRC_OVER);
            findViewById3.setBackground(drawable);
            findViewById3.setVisibility(0);
        }
        TextView A0M2 = C13680ns.A0M(view, R.id.bind_step_desc);
        if (A0M2 != null) {
            C13680ns.A0v(this, A0M2, R.color.color074f);
        }
    }

    public final void markStepProcessing(View view) {
        View findViewById = view.findViewById(R.id.bind_step_number);
        if (findViewById != null) {
            findViewById.setVisibility(0);
            Drawable drawable = getResources().getDrawable(R.drawable.step_circle);
            drawable.setColorFilter(AnonymousClass00T.A00(this, R.color.color074e), PorterDuff.Mode.SRC_OVER);
            findViewById.setBackground(drawable);
        }
        View findViewById2 = view.findViewById(R.id.bind_step_number_progress);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        View findViewById3 = view.findViewById(R.id.bind_step_check);
        if (findViewById3 != null) {
            findViewById3.setVisibility(4);
        }
        TextView A0M2 = C13680ns.A0M(view, R.id.bind_step_desc);
        if (A0M2 != null) {
            C13680ns.A0v(this, A0M2, R.color.color0660);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 154) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            A3U();
            A3V();
        } else {
            Afg(R.string.str1101);
        }
    }

    public void onBackPressed() {
        AnonymousClass1Vo r2 = this.A0e;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this);
        r2.A06(AnonymousClass000.A0h(" onBackPressed", A0o));
        Integer A0Y2 = C13680ns.A0Y();
        A3c(A0Y2, A0Y2);
        A3J();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0Z = this.A0C.A0Q();
        this.A0L.A00(getIntent());
        this.A0L.A00.A08("onCreate");
        setContentView((int) R.layout.layout030f);
        C005402i A0r = C111345g2.A0r(this);
        if (A0r != null) {
            C110115dX.A0u(A0r, getString(R.string.str101a));
        }
        this.A06 = findViewById(R.id.bind_step_1);
        this.A04 = findViewById(R.id.bind_step_2);
        this.A05 = findViewById(R.id.bind_step_3);
        A3Y(this.A06, getString(R.string.str101e), getString(R.string.str101d));
        A3Y(this.A04, getString(R.string.str101f), getString(R.string.str1022));
        boolean z2 = this.A0Z;
        int i2 = R.string.str101c;
        if (z2) {
            i2 = R.string.str101b;
        }
        A3Y(this.A05, getString(R.string.str1020), getString(i2));
        this.A07 = (WaImageView) findViewById(R.id.ic_bind_top);
        this.A0D = this.A0B.A04;
        C111805hR r13 = (C111805hR) getIntent().getParcelableExtra("extra_selected_bank");
        this.A0B = r13;
        this.A0N = new C117995tt(this.A0I);
        C14870pt r30 = this.A05;
        C16980tz r15 = this.A07;
        C16320sq r14 = this.A05;
        C17190ug r12 = this.A0H;
        C18280wR r11 = this.A0P;
        C18290wS r10 = this.A0P;
        C119365wy r9 = this.A0B;
        AnonymousClass173 r8 = this.A09;
        C18340wX r7 = this.A0K;
        AnonymousClass60V r6 = this.A0C;
        C119295wr r5 = this.A0O;
        AnonymousClass61W r4 = this.A0E;
        C16320sq r29 = r14;
        AnonymousClass61W r25 = r4;
        C18340wX r22 = r7;
        C18290wS r23 = r10;
        C119365wy r20 = r9;
        AnonymousClass60V r21 = r6;
        C17190ug r18 = r12;
        C111805hR r19 = r13;
        AnonymousClass173 r16 = r8;
        C14870pt r142 = r30;
        this.A0F = new C119175wf(r142, r15, r16, this.A0C, r18, r19, r20, r21, r22, r23, this, r25, this.A0F, r5, r11, r29);
        C14710pd r143 = this.A0C;
        C14870pt r132 = this.A05;
        C17190ug r122 = this.A0H;
        C18280wR r112 = this.A0P;
        C18290wS r102 = this.A0P;
        AnonymousClass175 r92 = this.A0I;
        AnonymousClass173 r82 = this.A09;
        C119365wy r72 = this.A0B;
        C18310wU r62 = this.A0M;
        C18340wX r42 = this.A0K;
        AnonymousClass60V r52 = this.A0C;
        C14870pt r17 = r132;
        this.A0G = new C112275iE(this, r17, r82, r143, r122, r72, r52, r92, r42, r62, r102, this, this.A0E, this.A0F, r112);
        this.A0e.A06(AnonymousClass000.A0h(r52.toString(), AnonymousClass000.A0r("IndiaUpiDeviceBindActivity onCreate: device binding status: ")));
        String A082 = this.A0C.A08();
        if (this.A0C.A0S(this.A0B, this.A0E, A082)) {
            try {
                JSONObject A0J2 = C13700nu.A0J();
                C111345g2.A1u(this, "DeviceBindingStep", A0J2);
                A0J2.put("pspForDeviceBinding", A082);
                A0J2.put("isDeviceBindingDone", this.A0C.A0S(this.A0B, this.A0E, A082));
                C112265iD r93 = new C112265iD(this.A05, this.A0C, this.A0H, this.A0B, this.A0M);
                r93.A00 = A0J2;
                r93.A00("SKIPPED_DEVICE_BINDING", (List) null);
            } catch (Exception unused) {
            }
            A3d(A082);
        } else {
            A3c(C13680ns.A0X(), (Integer) null);
            this.A0D.A02("upi-educate-sms");
            this.A02 = this.A0C.A04();
            A3V();
        }
        onConfigurationChanged(C13700nu.A03(this));
        this.A0L.A00.A07("onCreate");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0G.A01 = null;
        C119175wf r2 = this.A0F;
        r2.A02 = null;
        r2.A03.removeCallbacksAndMessages((Object) null);
        r2.A01.quit();
        C110175dd r0 = this.A0J;
        if (r0 != null) {
            unregisterReceiver(r0);
            this.A0J = null;
        }
        PendingIntent pendingIntent = this.A03;
        if (pendingIntent != null) {
            pendingIntent.cancel();
            this.A03 = null;
        }
        C114285nW r1 = this.A0I;
        if (r1 != null) {
            r1.A06(false);
        }
        Runnable runnable = this.A0R;
        if (runnable != null) {
            this.A05.Ac3(runnable);
        }
        Runnable runnable2 = this.A0S;
        if (runnable2 != null) {
            this.A05.Ac3(runnable2);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        AnonymousClass1Vo r2 = this.A0e;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this);
        r2.A06(AnonymousClass000.A0h(" action bar home", A0o));
        A3c(1, 1);
        A3J();
        return true;
    }

    public void onStart() {
        super.onStart();
        if (this.A0c) {
            A3b(new C119265wo(R.string.str1028), true);
        } else {
            Runnable runnable = this.A0R;
            if (runnable != null) {
                this.A05.Ac3(runnable);
                this.A0R = null;
                A3S();
            }
        }
        Runnable runnable2 = this.A0S;
        if (runnable2 != null) {
            this.A05.Ac3(runnable2);
            this.A0S = null;
        }
    }

    public void onStop() {
        super.onStop();
        if (this.A0b && this.A0R == null) {
            this.A0R = this.A05.Ad4(new AnonymousClass64C(this), "IndiaUpiDeviceBindSetupActivity/onStop", ((long) this.A0C.A02(924)) * 1000);
        }
    }
}
