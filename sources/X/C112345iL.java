package X;

import android.content.Context;
import com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5iL  reason: invalid class name and case insensitive filesystem */
public class C112345iL extends C116635rh {
    public static final Long A06 = 2L;
    public final Context A00;
    public final C14870pt A01;
    public final C14710pd A02;
    public final C17190ug A03;
    public final C18340wX A04;
    public final C18280wR A05;

    public C112345iL(Context context, C14870pt r3, C14710pd r4, C17190ug r5, C119365wy r6, C18340wX r7, C18310wU r8, C18280wR r9) {
        super(r6.A04, r8);
        this.A00 = context;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A05 = r9;
        this.A04 = r7;
    }

    public void A00(C28401Vy r25, C35301lh r26, AnonymousClass68P r27, C112265iD r28, String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap hashMap) {
        C35081lL[] A0Q;
        Log.i("PAY: acceptCollect called");
        C17190ug r23 = this.A03;
        String A022 = r23.A02();
        Long l2 = null;
        String A002 = hashMap != null ? C119365wy.A00("MPIN", hashMap) : null;
        AnonymousClass00B.A06(A002);
        if (this.A02.A0C(747)) {
            l2 = A06;
        }
        String A012 = this.A05.A01();
        String str8 = (String) C110105dW.A0d(r26);
        C35431lv A003 = this.A01.A00(C35481m0.A05, r25);
        String valueOf = String.valueOf(A003.A00());
        String valueOf2 = String.valueOf(A003.A00);
        String str9 = ((C35491m1) A003.A01).A04;
        C32461gQ A0S = AnonymousClass3K4.A0S("smax:any");
        C32461gQ A0S2 = AnonymousClass3K4.A0S("money");
        if (C32271fx.A0D(valueOf, 1, 100, false)) {
            C32461gQ.A00(A0S2, "value", valueOf);
        }
        if (C32271fx.A0D(valueOf2, 1, 100, false)) {
            C32461gQ.A00(A0S2, "offset", valueOf2);
        }
        if (C32271fx.A0D(str9, 1, 100, false)) {
            C32461gQ.A00(A0S2, "currency", str9);
        }
        AnonymousClass3K4.A0s(A0S2, A0S);
        C28371Vv A013 = A0S.A01();
        C32461gQ A0S3 = AnonymousClass3K4.A0S("amount");
        A0S3.A05(A013, AnonymousClass000.A0u());
        List list = Collections.EMPTY_LIST;
        A0S3.A07(A013, list, AnonymousClass000.A0u());
        C28371Vv A014 = A0S3.A01();
        C51812cK r11 = new C51812cK(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "upi-accept-collect");
        if (C110105dW.A1W(A002, 0, false)) {
            C32461gQ.A00(A0Y, "mpin", A002);
        }
        if (C110105dW.A1V(A012, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", A012);
        }
        String str10 = str6;
        if (C110115dX.A1C(str10, false)) {
            C32461gQ.A00(A0Y, "credential-id", str10);
        }
        String str11 = str;
        if (C110105dW.A1W(str11, 1, false)) {
            C32461gQ.A00(A0Y, "id", str11);
        }
        String str12 = str2;
        if (str2 != null && C32271fx.A0D(str12, 0, 100, true)) {
            C32461gQ.A00(A0Y, "sender-vpa", str12);
        }
        String str13 = str3;
        if (str3 != null && C32271fx.A0D(str13, 0, 100, true)) {
            C32461gQ.A00(A0Y, "sender-vpa-id", str13);
        }
        if (str8 != null && C110115dX.A1D(str8, true)) {
            C32461gQ.A00(A0Y, "upi-bank-info", str8);
        }
        String str14 = str4;
        if (str4 != null && C32271fx.A0D(str14, 0, 100, true)) {
            C32461gQ.A00(A0Y, "receiver-vpa", str14);
        }
        String str15 = str5;
        if (str5 != null && C32271fx.A0D(str15, 0, 100, true)) {
            C32461gQ.A00(A0Y, "receiver-vpa-id", str15);
        }
        String str16 = str7;
        if (str7 != null && C32271fx.A0D(str16, 0, 100, true)) {
            C32461gQ.A00(A0Y, "mandate-no", str16);
        }
        if (l2 != null && C32271fx.A0B(l2, 1, true)) {
            C110115dX.A13(A0Y, "version", l2.longValue());
        }
        A0Y.A03(A014);
        C28371Vv A0U = C110105dW.A0U(A0Y, A0X, r11, list);
        AnonymousClass4XO A023 = C116635rh.A02(this, "upi-accept-collect");
        List A0u = AnonymousClass000.A0u();
        C28371Vv A0I = A0U.A0I(0);
        if (!(A0I == null || (A0Q = A0I.A0Q()) == null)) {
            AnonymousClass00B.A06(A0Q);
            A0u = Arrays.asList(A0Q);
        }
        r28.A00("U66", A0u);
        r23.A0A(new IDxNCallbackShape21S0200000_3_I1(this.A00, this.A01, this.A04, A023, r27, this), A0U, A022, 204, 0);
    }
}
