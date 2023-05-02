package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.5uD  reason: invalid class name and case insensitive filesystem */
public class C118145uD {
    public final C112255iC A00;
    public final C116195qy A01;
    public final Runnable A02;

    public C118145uD(C112255iC r1, C116195qy r2, Runnable runnable) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = runnable;
    }

    public void A00(C28401Vy r16, C30671cl r17, UserJid userJid, C35301lh r19, C111855hW r20, C53312fV r21, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j2, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            this.A02.run();
            return;
        }
        C112255iC r11 = this.A00;
        String str8 = r17.A0A;
        C116195qy r13 = this.A01;
        C111855hW r0 = r20;
        String str9 = r0.A0L;
        String str10 = r0.A0M;
        String str11 = r0.A0J;
        String str12 = r0.A0K;
        String str13 = r0.A0N;
        String str14 = r0.A0H;
        String str15 = r0.A0I;
        ArrayList A0u = AnonymousClass000.A0u();
        C110105dW.A1P("sender-vpa", str9, A0u);
        if (!TextUtils.isEmpty(str10)) {
            C110105dW.A1P("sender-vpa-id", str10, A0u);
        }
        if (!TextUtils.isEmpty(str11)) {
            AnonymousClass00B.A06(str11);
            C110105dW.A1P("receiver-vpa", str11, A0u);
        }
        if (!TextUtils.isEmpty(str12)) {
            C110105dW.A1P("receiver-vpa-id", str12, A0u);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            C110105dW.A1P("upi-bank-info", (String) null, A0u);
        }
        C110105dW.A1P("seq-no", str13, A0u);
        if (!TextUtils.isEmpty(str14)) {
            C110105dW.A1P("mcc", str14, A0u);
        }
        String str16 = str3;
        if (!TextUtils.isEmpty(str16)) {
            C110105dW.A1P("ref-id", str16, A0u);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            C110105dW.A1P("ref-url", (String) null, A0u);
        }
        if (!C39841t9.A03(r19)) {
            C110105dW.A1P("payee-name", C110115dX.A0e(r19), A0u);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            C110105dW.A1P("mode", (String) null, A0u);
        }
        if (!TextUtils.isEmpty(str15)) {
            C110105dW.A1P("purpose-code", str15, A0u);
        }
        String str17 = str7;
        if (!TextUtils.isEmpty(str17)) {
            C110105dW.A1P("note", str17, A0u);
        }
        C14710pd r8 = r11.A05;
        if (r8.A0C(1918)) {
            String str18 = str2;
            if (!TextUtils.isEmpty(str18)) {
                C110105dW.A1P("merchant-token", str18, A0u);
            }
            String str19 = "1";
            String str20 = "0";
            if (z2) {
                str20 = str19;
            }
            C110105dW.A1P("merchant", str20, A0u);
            if (!z3) {
                str19 = "0";
            }
            C110105dW.A1P("verified-merchant", str19, A0u);
        }
        C28371Vv r3 = null;
        if (!TextUtils.isEmpty(str16)) {
            String str21 = str6;
            if (!TextUtils.isEmpty(str21)) {
                ArrayList A0u2 = AnonymousClass000.A0u();
                C110105dW.A1P("order-id", str16, A0u2);
                C110105dW.A1P("payment-config-id", str21, A0u2);
                String str22 = str4;
                if (!TextUtils.isEmpty(str22) && r8.A0C(1599)) {
                    C110105dW.A1P("discount-program-name", str22, A0u2);
                }
                long j3 = j2;
                if (j2 != 0) {
                    A0u2.add(new C35081lL("expiry-ts", j3));
                }
                if (r8.A0C(1330)) {
                    String str23 = str5;
                    if (!TextUtils.isEmpty(str23)) {
                        C110105dW.A1P("order-type", str23, A0u2);
                    }
                }
                r3 = new C28371Vv("order", C110115dX.A1F(A0u2, 0));
            }
        }
        C28371Vv r7 = new C28371Vv(r3, "upi", C110115dX.A1F(A0u, 0));
        Log.i("PAY: IndiaUpiPayPrecheckAction sendPrecheck called");
        ArrayList A0u3 = AnonymousClass000.A0u();
        C110105dW.A1P("action", "pay-precheck", A0u3);
        C110105dW.A1P("country", "IN", A0u3);
        C110105dW.A1P("credential-id", str8, A0u3);
        UserJid userJid2 = userJid;
        if (userJid != null) {
            A0u3.add(new C35081lL((Jid) userJid2, "receiver"));
        }
        A0u3.add(new C35081lL("version", 1));
        C110105dW.A1P("nonce", C110105dW.A0g(r11.A02, r11.A03), A0u3);
        C110105dW.A1P("device-id", r11.A0C.A01(), A0u3);
        C110105dW.A1P("transaction-type", str, A0u3);
        C53312fV r12 = r21;
        if (r21 != null) {
            A0u3.add(new C35081lL("offer_id", r12.A01));
        }
        C28371Vv r1 = null;
        C28401Vy r82 = r16;
        if (r16 != null) {
            r1 = r11.A08.A04(C35481m0.A05, r82, "amount");
        }
        AnonymousClass4XO A022 = C116635rh.A02(r11, "pay-precheck");
        r11.A08.A0H(new C112475iY(r11.A00, r11.A01, r11.A07, A022, r11, r12, r13, r11.A0B.A02("pay-precheck")), new C28371Vv("account", C110115dX.A1F(A0u3, 0), new C28371Vv[]{r7, r1}), "set", AnonymousClass1NO.A0L);
    }
}
