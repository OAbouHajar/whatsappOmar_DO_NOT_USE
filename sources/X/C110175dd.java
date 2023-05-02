package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5dd  reason: invalid class name and case insensitive filesystem */
public class C110175dd extends BroadcastReceiver {
    public final Object A00 = C13690nt.A0Y();
    public volatile boolean A01 = false;
    public final /* synthetic */ IndiaUpiDeviceBindStepActivity A02;

    public C110175dd(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        this.A02 = indiaUpiDeviceBindStepActivity;
    }

    public void onReceive(Context context, Intent intent) {
        C35301lh A0J;
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    AnonymousClass2IF.A01(context);
                    this.A01 = true;
                }
            }
        }
        int resultCode = getResultCode();
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = this.A02;
        AnonymousClass1Vo r4 = indiaUpiDeviceBindStepActivity.A0e;
        r4.A06(C13680ns.A0c(resultCode, "SmsSentReceiver onReceive: "));
        if (resultCode == -1) {
            indiaUpiDeviceBindStepActivity.A3f((String) null, true);
            boolean A0C = indiaUpiDeviceBindStepActivity.A0C.A0C(2686);
            indiaUpiDeviceBindStepActivity.A0L.A00.A07("smsSend");
            C31081dR r0 = indiaUpiDeviceBindStepActivity.A0L.A00;
            if (A0C) {
                r0.A08("deviceBind");
                AnonymousClass4XO r1 = indiaUpiDeviceBindStepActivity.A0D;
                if (r1 != null) {
                    r1.A05("device-binding-sms");
                }
                StringBuilder A0r = AnonymousClass000.A0r("IndiaUpiPaymentBankSetupActivity: onSmsSent to psp: ");
                A0r.append(indiaUpiDeviceBindStepActivity.A0U);
                A0r.append(" storing verification data sent: ");
                r4.A06(AnonymousClass000.A0h(AnonymousClass5x3.A00(indiaUpiDeviceBindStepActivity.A0W), A0r));
                if (!TextUtils.isEmpty(indiaUpiDeviceBindStepActivity.A0W)) {
                    indiaUpiDeviceBindStepActivity.A05.A0K(new AnonymousClass64A(indiaUpiDeviceBindStepActivity));
                    indiaUpiDeviceBindStepActivity.A0b = true;
                    indiaUpiDeviceBindStepActivity.A0S = indiaUpiDeviceBindStepActivity.A05.Ad4(new AnonymousClass64B(indiaUpiDeviceBindStepActivity), "IndiaUpiDeviceBindSetupActivity/startDeviceBindingForMultipleSms", 3000);
                    return;
                }
                return;
            }
            r0.A08("deviceBind");
            String A07 = indiaUpiDeviceBindStepActivity.A0B.A07(indiaUpiDeviceBindStepActivity.A0B);
            AnonymousClass60V r8 = indiaUpiDeviceBindStepActivity.A0C;
            synchronized (r8) {
                String str = null;
                try {
                    String A04 = r8.A03.A04();
                    if (!TextUtils.isEmpty(A04)) {
                        str = C13700nu.A0K(A04).optString("smsVerifDataGen", (String) null);
                    }
                } catch (JSONException e2) {
                    Log.w("PAY: IndiaUpiPaymentSharedPrefs readSmsVerificationDataGenerated threw: ", e2);
                }
                A0J = C110105dW.A0J(C110105dW.A0L(), String.class, str, "smsVerificationDataGen");
            }
            String A3G = indiaUpiDeviceBindStepActivity.A3G(A07, (String) A0J.A00);
            String A06 = indiaUpiDeviceBindStepActivity.A0B.A06(indiaUpiDeviceBindStepActivity.A0B);
            AnonymousClass60V r82 = indiaUpiDeviceBindStepActivity.A0C;
            synchronized (r82) {
                AnonymousClass00B.A06(A06);
                AnonymousClass00B.A06(A3G);
                try {
                    C18300wT r7 = r82.A03;
                    JSONObject A0k = C110105dW.A0k(r7);
                    A0k.put("v", "2");
                    JSONObject A022 = AnonymousClass60V.A02(A06, "smsVerifDataSentToPsp", A0k);
                    if (A022 != null) {
                        A022.put("smsVerifData", A3G);
                    }
                    C110105dW.A1J(r7, A0k);
                } catch (JSONException e3) {
                    Log.w("PAY: IndiaUpiPaymentSharedPrefs storeSmsVerificationDataSent threw: ", e3);
                }
            }
            AnonymousClass4XO r12 = indiaUpiDeviceBindStepActivity.A0D;
            if (r12 != null) {
                r12.A05("device-binding-sms");
            }
            StringBuilder A0r2 = AnonymousClass000.A0r("IndiaUpiPaymentBankSetupActivity: onSmsSent to psp: ");
            A0r2.append(A06);
            A0r2.append(" storing verification data sent: ");
            r4.A06(AnonymousClass000.A0h(AnonymousClass5x3.A00(A3G), A0r2));
            if (!TextUtils.isEmpty(A3G)) {
                indiaUpiDeviceBindStepActivity.A05.A0K(new AnonymousClass64A(indiaUpiDeviceBindStepActivity));
                indiaUpiDeviceBindStepActivity.A0b = true;
                indiaUpiDeviceBindStepActivity.A0F.A00();
                indiaUpiDeviceBindStepActivity.A0E.AgB();
                return;
            }
            return;
        }
        AnonymousClass4XO r13 = indiaUpiDeviceBindStepActivity.A0D;
        if (r13 != null) {
            r13.A06("device-binding-sms", resultCode);
        }
        indiaUpiDeviceBindStepActivity.A3f("sms_sending_failed", false);
        indiaUpiDeviceBindStepActivity.A3b(new C119265wo(R.string.str1026), true);
        return;
    }
}
