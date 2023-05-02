package X;

import android.content.Context;
import com.obwhatsapp.payments.actions.IDxNCallbackShape9S0300000_3_I1;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5iF  reason: invalid class name and case insensitive filesystem */
public class C112285iF extends C116635rh {
    public final Context A00;
    public final C14870pt A01;
    public final AnonymousClass173 A02;
    public final C17190ug A03;
    public final AnonymousClass60O A04;
    public final C18340wX A05;
    public final C112715ix A06;
    public final C18280wR A07;

    public C112285iF(Context context, C14870pt r3, AnonymousClass173 r4, C17190ug r5, AnonymousClass60O r6, C119365wy r7, C18340wX r8, C18310wU r9, C112715ix r10, C18280wR r11) {
        super(r7.A04, r9);
        this.A00 = context;
        this.A01 = r3;
        this.A03 = r5;
        this.A07 = r11;
        this.A02 = r4;
        this.A04 = r6;
        this.A05 = r8;
        this.A06 = r10;
    }

    public void A00(C28401Vy r36, C35301lh r37, C35301lh r38, C35301lh r39, C111855hW r40, C112265iD r41, AnonymousClass68S r42, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, HashMap hashMap, boolean z2) {
        C35081lL[] A0Q;
        Log.i("PAY: IndiaUpiPaymentSetup sendPaymentToNonWaVpa called");
        C111855hW r7 = r40;
        Boolean bool = r7.A0D;
        C28401Vy r12 = r36;
        C35431lv A002 = this.A01.A00(C35481m0.A05, r12);
        C17190ug r34 = this.A03;
        String A022 = r34.A02();
        String A012 = this.A07.A01();
        String A003 = C119365wy.A00("MPIN", hashMap);
        String str10 = r7.A0L;
        String str11 = r7.A0J;
        String str12 = r7.A0N;
        String str13 = r7.A0F;
        String str14 = (String) C110105dW.A0d(r38);
        String str15 = (String) C110105dW.A0d(r37);
        String str16 = r7.A0M;
        String str17 = r7.A0K;
        String str18 = (String) C110105dW.A0d(r39);
        String obj = r12.toString();
        String str19 = r7.A0P;
        String str20 = z2 ? "p2m" : "p2p";
        String str21 = bool != null ? bool.booleanValue() ? "1" : "0" : null;
        C118025tw r122 = new C118025tw(String.valueOf(A002.A00()), String.valueOf(A002.A00), ((C35491m1) A002.A01).A04);
        C51812cK r1 = new C51812cK(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "upi-send-to-vpa");
        String str22 = str;
        if (C32271fx.A0D(str22, 1, 200, false)) {
            C32461gQ.A00(A0Y, "credential-id", str22);
        }
        if (C110105dW.A1V(A012, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", A012);
        }
        if (C32271fx.A0D(A003, 0, 1000, false)) {
            C32461gQ.A00(A0Y, "mpin", A003);
        }
        if (C32271fx.A0D(str10, 0, 100, false)) {
            C32461gQ.A00(A0Y, "sender-vpa", str10);
        }
        if (C32271fx.A0D(str11, 0, 100, false)) {
            C32461gQ.A00(A0Y, "receiver-vpa", str11);
        }
        if (C32271fx.A0D(str12, 0, 35, false)) {
            C32461gQ.A00(A0Y, "seq-no", str12);
        }
        if (C110115dX.A1D(str13, false)) {
            C32461gQ.A00(A0Y, "message-id", str13);
        }
        String str23 = str4;
        if (str4 != null && C32271fx.A0D(str23, 0, 4, true)) {
            C32461gQ.A00(A0Y, "mcc", str23);
        }
        String str24 = str3;
        if (str3 != null && C110105dW.A1V(str24, 0, true)) {
            C32461gQ.A00(A0Y, "ref-id", str24);
        }
        String str25 = str5;
        if (str5 != null && C32271fx.A0D(str25, 0, 2048, true)) {
            C32461gQ.A00(A0Y, "ref-url", str25);
        }
        String str26 = str9;
        if (str9 != null && C110115dX.A1D(str26, true)) {
            C32461gQ.A00(A0Y, "note", str26);
        }
        if (str14 != null && C110105dW.A1W(str14, 1, true)) {
            C32461gQ.A00(A0Y, "payee-name", str14);
        }
        String str27 = str7;
        if (str7 != null && C32271fx.A0D(str27, 0, 4, true)) {
            C32461gQ.A00(A0Y, "mode", str27);
        }
        String str28 = str6;
        if (str6 != null && C32271fx.A0D(str28, 1, 4, true)) {
            C32461gQ.A00(A0Y, "purpose-code", str28);
        }
        if (str15 != null && C110115dX.A1D(str15, true)) {
            C32461gQ.A00(A0Y, "upi-bank-info", str15);
        }
        if (str16 != null && C116635rh.A03(str16)) {
            C32461gQ.A00(A0Y, "sender-vpa-id", str16);
        }
        if (str17 != null && C116635rh.A03(str17)) {
            C32461gQ.A00(A0Y, "receiver-vpa-id", str17);
        }
        if (str18 != null && C32271fx.A0D(str18, 8, 15, true)) {
            C32461gQ.A00(A0Y, "receiver-upi-number", str18);
        }
        if (obj != null && C116635rh.A03(obj)) {
            C32461gQ.A00(A0Y, "amount", obj);
        }
        String str29 = str2;
        if (str2 != null && C116635rh.A03(str29)) {
            C32461gQ.A00(A0Y, "currency", str29);
        }
        if (str19 != null) {
            String str30 = str19;
            if (C110105dW.A1W(str30, 1, true)) {
                C32461gQ.A00(A0Y, "token", str30);
            }
        }
        String str31 = str8;
        if (str8 != null && C110105dW.A1W(str31, 1, true)) {
            C32461gQ.A00(A0Y, "id", str31);
        }
        A0Y.A09(str20, "transaction-type", C115715qC.A01);
        A0Y.A09("2", "version", C115715qC.A02);
        A0Y.A09(str21, "is_first_send", C115715qC.A00);
        C32461gQ A0S = AnonymousClass3K4.A0S("amount");
        A0S.A05(r122.A00, AnonymousClass000.A0u());
        List list = Collections.EMPTY_LIST;
        r122.A00(A0S, list);
        AnonymousClass3K4.A0s(A0S, A0Y);
        C28371Vv A0U = C110105dW.A0U(A0Y, A0X, r1, list);
        AnonymousClass4XO A023 = C116635rh.A02(this, "upi-send-to-vpa");
        List A0u = AnonymousClass000.A0u();
        C28371Vv A0I = A0U.A0I(0);
        if (!(A0I == null || (A0Q = A0I.A0Q()) == null)) {
            AnonymousClass00B.A06(A0Q);
            A0u = Arrays.asList(A0Q);
        }
        r41.A00("U66", A0u);
        r34.A0A(new IDxNCallbackShape9S0300000_3_I1(this.A00, this.A01, this.A05, A023, r42, this, this.A06.A02("upi-send-to-vpa")), A0U, A022, 204, 0);
    }

    public void A01(C35301lh r27, C35301lh r28, AnonymousClass68L r29) {
        String str;
        String str2;
        String str3;
        Log.i("PAY: verifyPaymentVpa called");
        String A012 = this.A07.A01();
        C35301lh r11 = r28;
        boolean z2 = !C39841t9.A03(r11);
        String str4 = null;
        if (z2) {
            str = (String) C110105dW.A0d(r11);
            str3 = ((String) r11.A00).length() == 10 ? "mobile_number" : "numeric_id";
            str2 = "2";
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = (String) C110105dW.A0d(r27);
        }
        C17190ug r15 = this.A03;
        String A022 = r15.A02();
        C118015tv r5 = new C118015tv(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0S = AnonymousClass3K4.A0S("account");
        C32461gQ.A00(A0S, "action", "upi-get-vpa-name");
        if (str4 != null && C110105dW.A1W(str4, 1, true)) {
            C32461gQ.A00(A0S, "vpa", str4);
        }
        if (C110105dW.A1V(A012, 1, false)) {
            C32461gQ.A00(A0S, "device-id", A012);
        }
        if (str != null && C32271fx.A0D(str, 8, 10, true)) {
            C32461gQ.A00(A0S, "value", str);
        }
        A0S.A09(str2, "version", C115625q3.A01);
        A0S.A09(str3, "type", C115625q3.A00);
        C28371Vv A002 = C118015tv.A00(A0S, A0X, r5);
        Integer A023 = this.A06.A02("upi-get-vpa-name");
        r15.A0G(new C112445iV(this.A00, this.A01, r11, r29, this.A05, this.A00, this, A023, z2), A002, A022, 204, 0);
    }
}
