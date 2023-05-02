package X;

import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.components.Button;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity;
import com.obwhatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import org.json.JSONObject;

/* renamed from: X.5g2  reason: invalid class name and case insensitive filesystem */
public abstract class C111345g2 extends C14530pL {
    public C111345g2() {
        C110105dW.A0t(this, 11);
    }

    public static View A0p(C000900k r2) {
        View findViewById = r2.findViewById(R.id.account_layout);
        C004601z.A0E(findViewById, R.id.progress).setVisibility(8);
        C004601z.A0E(findViewById, R.id.divider).setVisibility(8);
        C004601z.A0E(findViewById, R.id.radio_button).setVisibility(8);
        return findViewById;
    }

    public static C005402i A0r(AnonymousClass5ko r2) {
        r2.A3K(R.drawable.onboarding_actionbar_home_close, R.id.scroll_view);
        return r2.x();
    }

    public static Button A0u(TextView textView, IndiaUpiBankAccountAddedLandingActivity indiaUpiBankAccountAddedLandingActivity, int i2) {
        textView.setText(indiaUpiBankAccountAddedLandingActivity.getString(i2));
        indiaUpiBankAccountAddedLandingActivity.A01.setText(indiaUpiBankAccountAddedLandingActivity.getString(R.string.str0166));
        indiaUpiBankAccountAddedLandingActivity.A03.setText(indiaUpiBankAccountAddedLandingActivity.getString(R.string.str0165));
        indiaUpiBankAccountAddedLandingActivity.A04.setText(indiaUpiBankAccountAddedLandingActivity.getString(R.string.str0164));
        return indiaUpiBankAccountAddedLandingActivity.A03;
    }

    public static C53842gO A0x(AnonymousClass2HJ r3, IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, String str) {
        AnonymousClass61W r1 = indiaUpiDeviceBindStepActivity.A0E;
        r1.A08(str);
        C53842gO A02 = r1.A02(r3, 20);
        A02.A0O = indiaUpiDeviceBindStepActivity.A0B.A0C;
        C113285ln r0 = indiaUpiDeviceBindStepActivity.A0M;
        if (r3 != null) {
            r0.A00.A0C(3);
            indiaUpiDeviceBindStepActivity.A0L.A00.A0C(3);
            return A02;
        }
        r0.A00.A09("deviceBindingEnded");
        indiaUpiDeviceBindStepActivity.A0L.A00.A07("deviceBind");
        return A02;
    }

    public static AnonymousClass1HB A1R(C49132Rg r1, C16150sX r2, AnonymousClass5kl r3) {
        r3.A03 = (AnonymousClass160) r2.AHq.get();
        r3.A00 = (C17160ud) r2.A4t.get();
        r3.A01 = (C16260sj) r2.AQe.get();
        r3.A06 = (C227819g) r2.AHv.get();
        r3.A0A = (C14860ps) r2.API.get();
        r3.A05 = (AnonymousClass1GP) r2.AH4.get();
        r3.A07 = (C18320wV) r2.AIA.get();
        r3.A09 = r1.A0X();
        return (AnonymousClass1HB) r2.AIG.get();
    }

    public static C118025tw A1X(AnonymousClass1Vt r3, C111855hW r4, C112355iM r5, Object obj, String str) {
        AnonymousClass00B.A06(obj);
        Object obj2 = r5.A04.A05().A00;
        AnonymousClass00B.A06(obj2);
        r4.A0L = (String) obj2;
        C35431lv A00 = r5.A01.A00(r3.A07, r3.A08);
        r3.A09 = A00;
        r3.A0H = str;
        return new C118025tw(String.valueOf(A00.A00()), String.valueOf(A00.A00), ((C35491m1) A00.A01).A04);
    }

    public static String A1b(AnonymousClass5ko r1) {
        return r1.A3F(r1.A0C.A07());
    }

    public static String A1c(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        return !TextUtils.isEmpty(indiaUpiDeviceBindStepActivity.A0C.A08()) ? indiaUpiDeviceBindStepActivity.A0C.A08() : indiaUpiDeviceBindStepActivity.A0B.A06(indiaUpiDeviceBindStepActivity.A0B);
    }

    public static String A1d(C112825ja r4) {
        return r4.A0G.A00(r4.A0e, r4.A0M, r4.A0p);
    }

    public static AnonymousClass01J A1e(C16150sX r1, C112765jH r2) {
        r2.A07 = (C16980tz) r1.AQB.get();
        r2.A0D = C16150sX.A0n(r1);
        r2.A0H = (C17190ug) r1.AEu.get();
        r2.A0Z = (AnonymousClass1DY) r1.A3w.get();
        r2.A0Q = (C118365uZ) r1.AIm.get();
        r2.A05 = (AnonymousClass1N0) r1.A20.get();
        r2.A06 = (C19230xz) r1.A5B.get();
        r2.A0b = (C222617g) r1.A8a.get();
        r2.A0P = (C18290wS) r1.AIB.get();
        r2.A09 = (C16460t6) r1.A5k.get();
        return r1.AI6;
    }

    public static AnonymousClass01J A1f(C16150sX r1, C112825ja r2) {
        r2.A05 = (C17200uh) r1.A52.get();
        r2.A0a = (C218315p) r1.AIL.get();
        r2.A01 = (C17160ud) r1.A4t.get();
        r2.A03 = (C16080sP) r1.AQ9.get();
        r2.A00 = (AnonymousClass01Y) r1.A1w.get();
        r2.A02 = (C17140ub) r1.A4y.get();
        r2.A0k = r1.AI5;
        r2.A06 = (C16260sj) r1.AQe.get();
        r2.A0Y = (AnonymousClass5vS) r1.ACK.get();
        return r1.AHv;
    }

    public static void A1g(LayoutInflater layoutInflater, ViewGroup viewGroup, AnonymousClass5ko r4) {
        ((ImageView) C004601z.A0E(layoutInflater.inflate(R.layout.layout0346, viewGroup, true), R.id.psp_logo)).setImageResource(C115305pX.A00(r4.A0C.A08()).A00);
    }

    public static void A1h(View view, C30671cl r2) {
        Bitmap A05 = r2.A05();
        ImageView imageView = (ImageView) C004601z.A0E(view, R.id.provider_icon);
        if (A05 != null) {
            imageView.setImageBitmap(A05);
        } else {
            imageView.setImageResource(R.drawable.av_bank);
        }
    }

    public static void A1i(C001000l r3, C119265wo r4) {
        String A01 = r4.A01(r3);
        AnonymousClass2T3 r0 = new AnonymousClass2T3();
        r0.A08 = A01;
        r0.A00().A1G(r3.AGM(), (String) null);
    }

    public static void A1j(C49132Rg r1, C16150sX r2, AnonymousClass5xG r3, BrazilPaymentActivity brazilPaymentActivity) {
        brazilPaymentActivity.A0P = r3;
        brazilPaymentActivity.A0K = (C119285wq) r2.AIH.get();
        brazilPaymentActivity.A0J = (C209712h) r2.AHE.get();
        brazilPaymentActivity.A0F = (AnonymousClass17Y) r2.AHs.get();
        brazilPaymentActivity.A0D = (AnonymousClass17O) r2.AHe.get();
        brazilPaymentActivity.A0I = (C209512f) r2.AHB.get();
        brazilPaymentActivity.A0T = (C118955vg) r2.A2T.get();
        brazilPaymentActivity.A0O = (C112705iw) r2.A2R.get();
        brazilPaymentActivity.A0V = r1.A0T();
        brazilPaymentActivity.A0X = (AnonymousClass5xF) r2.A2H.get();
        brazilPaymentActivity.A0Y = (C118205uJ) r2.A2a.get();
        brazilPaymentActivity.A0H = (C118255uO) r2.A2M.get();
        brazilPaymentActivity.A08 = r1.A0N();
    }

    public static void A1k(C49132Rg r1, C16150sX r2, C112765jH r3, AnonymousClass01J r4) {
        r3.A0O = (C18090w8) r4.get();
        r3.A0V = r1.A0U();
        r3.A0N = (AnonymousClass174) r2.AI3.get();
        r3.A0L = C16150sX.A0y(r2);
        r3.A0T = (AnonymousClass1GO) r2.AHY.get();
        r3.A0I = (AnonymousClass175) r2.AH5.get();
        r3.A0W = r1.A0V();
        r3.A0K = (C18340wX) r2.AHd.get();
        r3.A0M = (C18310wU) r2.AHz.get();
        r3.A08 = (C216114t) r2.A5O.get();
        r3.A0d = (AnonymousClass1MF) r2.ANa.get();
        r3.A0R = r1.A0R();
        r3.A0S = C16150sX.A12(r2);
        r3.A0Y = (C117745tU) r2.AHx.get();
    }

    public static void A1l(C49132Rg r1, C16150sX r2, C112795jR r3) {
        r3.A01 = (C113285ln) r2.ACF.get();
        r3.A00 = (C117075sP) r1.A1X.get();
    }

    public static void A1m(C49132Rg r1, C16150sX r2, C112825ja r3, AnonymousClass01J r4) {
        r3.A0K = (C227819g) r4.get();
        r3.A0U = (C116715rp) r2.AHl.get();
        r3.A0I = (AnonymousClass1GP) r2.AH4.get();
        r3.A07 = (C221116r) r2.AHt.get();
        r3.A0M = (C18320wV) r2.AIA.get();
        r3.A0F = (AnonymousClass60O) r2.AC8.get();
        r3.A0b = (C17020u3) r2.AMG.get();
        r3.A0L = C16150sX.A0z(r2);
        r3.A0Q = (C209712h) r2.AHE.get();
        r3.A0J = (AnonymousClass17Y) r2.AHs.get();
        r3.A0P = (C209512f) r2.AHB.get();
        r3.A0Z = r1.A0X();
        r3.A0G = r1.A0O();
    }

    public static void A1n(C49132Rg r1, C16150sX r2, C112935km r3) {
        r3.A0F = (C118985vj) r2.A38.get();
        r3.A02 = (AnonymousClass173) r2.AHL.get();
        r3.A01 = (AnonymousClass013) r2.AR8.get();
        r3.A0C = (C18280wR) r2.AHR.get();
        r3.A0B = (C1200960h) r2.ACB.get();
        r3.A08 = r1.A0Q();
        r3.A07 = (C224918d) r2.AID.get();
        r3.A03 = (C1204661t) r2.AHV.get();
    }

    public static void A1o(C16150sX r1, BrazilPaymentActivity brazilPaymentActivity) {
        brazilPaymentActivity.A0S = (AnonymousClass5vX) r1.A2J.get();
        brazilPaymentActivity.A0Q = (C118915vc) r1.AHj.get();
        brazilPaymentActivity.A0L = (C1222969a) r1.A2U.get();
        brazilPaymentActivity.A0N = (C118335uW) r1.AGB.get();
        brazilPaymentActivity.A05 = (AnonymousClass173) r1.AHL.get();
        brazilPaymentActivity.A0C = (AnonymousClass1GP) r1.AH4.get();
        brazilPaymentActivity.A0B = (C1204661t) r1.AHV.get();
        brazilPaymentActivity.A09 = (C119315wt) r1.A2Y.get();
        brazilPaymentActivity.A0G = (C18320wV) r1.AIA.get();
        brazilPaymentActivity.A0a = (C17020u3) r1.AMG.get();
        brazilPaymentActivity.A0R = (AnonymousClass1TR) r1.AEa.get();
    }

    public static void A1p(C16150sX r1, BrazilPaymentActivity brazilPaymentActivity) {
        brazilPaymentActivity.A0b = (C17110uY) r1.ADT.get();
        brazilPaymentActivity.A03 = (C16080sP) r1.AQ9.get();
        brazilPaymentActivity.A04 = (AnonymousClass013) r1.AR8.get();
        brazilPaymentActivity.A0Z = (C18280wR) r1.AHR.get();
        brazilPaymentActivity.A07 = (AnonymousClass5x7) r1.A2I.get();
        brazilPaymentActivity.A0E = (C18300wT) r1.AHn.get();
        brazilPaymentActivity.A06 = (AnonymousClass60U) r1.A2G.get();
        brazilPaymentActivity.A0M = (C118585uv) r1.A2P.get();
    }

    public static void A1q(C16150sX r1, AnonymousClass5ko r2) {
        r2.A05 = (C16490t9) r1.AQz.get();
        r2.A0H = (AnonymousClass5xN) r1.AC6.get();
        r2.A0D = (C18300wT) r1.AHn.get();
        r2.A0B = (C119365wy) r1.ACI.get();
        r2.A0G = (AnonymousClass5x9) r1.A1y.get();
        r2.A0E = (AnonymousClass61W) r1.ACC.get();
        r2.A0C = (AnonymousClass60V) r1.ACJ.get();
        r2.A0A = (C111865hX) r1.AHU.get();
        r2.A0F = (C112715ix) r1.ACG.get();
    }

    public static void A1r(C35521m4 r0, AnonymousClass5ko r1, boolean z2) {
        r1.startActivity(IndiaUpiPinPrimerFullSheetActivity.A02(r1, r0, z2));
        r1.A3H();
        r1.finish();
    }

    public static void A1s(C53842gO r1, AnonymousClass5ko r2) {
        r2.A0E.AKR(r1);
    }

    public static void A1t(C53842gO r1, AnonymousClass5ko r2, String str) {
        r1.A0a = str;
        r1.A0X = r2.A0L;
    }

    public static void A1u(C112765jH r2, Object obj, JSONObject jSONObject) {
        jSONObject.put("step", obj);
        jSONObject.put("completedSteps", r2.A0I.A02().toString());
        jSONObject.put("isCompleteWith2FA", r2.A0I.A0D());
        jSONObject.put("isCompleteWithout2FA", r2.A0I.A0E());
    }

    public static void A1v(AnonymousClass5ko r0, int i2) {
        AnonymousClass29T.A00(r0, i2);
        r0.A3H();
        r0.finish();
    }

    public static void A1w(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        indiaUpiDeviceBindStepActivity.A0C.A7n(indiaUpiDeviceBindStepActivity.A0B.A06(indiaUpiDeviceBindStepActivity.A0B), true);
    }

    public static void A1x(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        if (indiaUpiDeviceBindStepActivity.A0J == null) {
            indiaUpiDeviceBindStepActivity.A03 = C42341xd.A01(indiaUpiDeviceBindStepActivity, 0, new Intent("SMS_SENT").setPackage("com.obwhatsapp"), 0);
            C110175dd r1 = new C110175dd(indiaUpiDeviceBindStepActivity);
            indiaUpiDeviceBindStepActivity.A0J = r1;
            indiaUpiDeviceBindStepActivity.registerReceiver(r1, new IntentFilter("SMS_SENT"));
        }
    }

    public static void A1y(C112935km r1) {
        r1.A0C.A0E();
        r1.Ac1();
        r1.Afq(R.string.str1102);
        r1.A0A.A00();
    }

    public static void A1z(C118635v0 r0, short s2) {
        r0.A00.A0C(s2);
    }

    public static boolean A20(C30671cl r2, C112825ja r3) {
        return r3.A0Y.A02(r2, r3.A0n);
    }

    public static boolean A21(C112765jH r0) {
        return r0.A0I.A0C();
    }
}
