package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1;
import com.obwhatsapp.payments.actions.IDxNCallbackShape95S0100000_3_I1;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.5iJ  reason: invalid class name and case insensitive filesystem */
public class C112325iJ extends C116635rh {
    public C1222868z A00;
    public final Context A01;
    public final C14870pt A02;
    public final C16040sK A03;
    public final C18260wP A04;
    public final AnonymousClass173 A05;
    public final C14710pd A06;
    public final C17190ug A07;
    public final AnonymousClass60V A08;
    public final AnonymousClass175 A09;
    public final C18340wX A0A;
    public final AnonymousClass174 A0B;
    public final C18290wS A0C;
    public final C118805vH A0D;
    public final AnonymousClass61W A0E;
    public final C112715ix A0F;
    public final C18280wR A0G;

    public C112325iJ(Context context, C14870pt r3, C16040sK r4, C18260wP r5, AnonymousClass173 r6, C14710pd r7, C17190ug r8, C119365wy r9, AnonymousClass60V r10, AnonymousClass175 r11, C18340wX r12, C18310wU r13, AnonymousClass174 r14, C18290wS r15, C118805vH r16, C1222868z r17, AnonymousClass61W r18, C112715ix r19, C18280wR r20) {
        super(r9.A04, r13);
        this.A01 = context;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A07 = r8;
        this.A0G = r20;
        this.A0C = r15;
        this.A09 = r11;
        this.A05 = r6;
        this.A0B = r14;
        this.A0D = r16;
        this.A0E = r18;
        this.A04 = r5;
        this.A0A = r12;
        this.A08 = r10;
        this.A0F = r19;
        this.A00 = r17;
    }

    public void A00() {
        AnonymousClass61W r11 = this.A0E;
        r11.AgB();
        Log.i("PAY: IndiaUpiPaymentSetup sendGetListKeys called");
        String A0C2 = this.A08.A0C();
        if (!TextUtils.isEmpty(A0C2)) {
            StringBuilder A0r = AnonymousClass000.A0r("PAY: IndiaUpiPaymentSetup got cached listkeys; callback: ");
            A0r.append(this.A00);
            C13680ns.A1V(A0r);
            C1222868z r0 = this.A00;
            if (r0 != null) {
                r0.ASh((AnonymousClass2HJ) null, A0C2);
                return;
            }
            return;
        }
        AnonymousClass4XO r9 = this.A00;
        r9.A04("upi-list-keys");
        Log.i("PAY: IndiaUPIPaymentBankSetup sendGetListKeys");
        Integer A022 = this.A0F.A02("upi-list-keys");
        C17190ug r3 = this.A07;
        String A023 = r3.A02();
        AnonymousClass2BJ r6 = new AnonymousClass2BJ(A023);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ.A00(A0X, "xmlns", "w:pay");
        C32461gQ A0Z = C110105dW.A0Z(A0X);
        C32461gQ.A00(A0Z, "action", "upi-list-keys");
        C28371Vv A0S = C110105dW.A0S(A0Z, A0X, r6);
        r11.A06((AnonymousClass2HJ) null, 1, 0);
        C110105dW.A1G(r3, new IDxNCallbackShape21S0200000_3_I1(this.A01, this.A02, this.A0A, r9, this, r11, A022), A0S, A023);
    }

    public final void A01(C35301lh r22, C35301lh r23, String str, String str2, String str3, String str4, String str5, String str6, HashMap hashMap) {
        String str7;
        String str8;
        this.A0E.AgB();
        Log.i("PAY: IndiaUpiPaymentSetup sendSetPin called");
        AnonymousClass4XO r12 = this.A00;
        r12.A04("upi-set-mpin");
        String str9 = null;
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            str9 = C119365wy.A00("SMS", hashMap2);
            str7 = C119365wy.A00("MPIN", hashMap2);
            str8 = C119365wy.A00("ATMPIN", hashMap2);
        } else {
            str7 = null;
            str8 = null;
        }
        C17190ug r14 = this.A07;
        String A022 = r14.A02();
        String A0e = C110115dX.A0e(r22);
        String str10 = (String) C110105dW.A0d(r23);
        String A012 = this.A0G.A01();
        C51812cK r9 = new C51812cK(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "upi-set-mpin");
        if (A0e != null && C116635rh.A03(A0e)) {
            C32461gQ.A00(A0Y, "vpa", A0e);
        }
        String str11 = str;
        if (str != null && C116635rh.A03(str11)) {
            C32461gQ.A00(A0Y, "vpa-id", str11);
        }
        if (str10 != null && C32271fx.A0D(str10, 1, 100000, true)) {
            C32461gQ.A00(A0Y, "upi-bank-info", str10);
        }
        String str12 = str2;
        if (C110115dX.A1A(str12, 1, false)) {
            C32461gQ.A00(A0Y, "credential-id", str12);
        }
        String str13 = str6;
        if (C32271fx.A0D(str13, 35, 35, false)) {
            C32461gQ.A00(A0Y, "seq-no", str13);
        }
        if (C110105dW.A1V(A012, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", A012);
        }
        if (C32271fx.A0D(str9, 0, 10000, false)) {
            C32461gQ.A00(A0Y, "otp", str9);
        }
        if (C32271fx.A0D(str7, 0, 10000, false)) {
            C32461gQ.A00(A0Y, "mpin", str7);
        }
        if (str8 != null && C32271fx.A0D(str8, 0, 10000, true)) {
            C32461gQ.A00(A0Y, "atm-pin", str8);
        }
        String str14 = str3;
        if (C32271fx.A0D(str14, 6, 6, false)) {
            C32461gQ.A00(A0Y, "debit-last-6", str14);
        }
        String str15 = str4;
        if (C32271fx.A0D(str15, 1, 2, false)) {
            C32461gQ.A00(A0Y, "debit-exp-month", str15);
        }
        String str16 = str5;
        if (C32271fx.A0D(str16, 2, 2, false)) {
            C32461gQ.A00(A0Y, "debit-exp-year", str16);
        }
        A0Y.A0A("1", "default-debit", C115645q5.A01);
        A0Y.A0A("1", "default-credit", C115645q5.A00);
        r14.A0A(new IDxNCallbackShape95S0100000_3_I1(this.A01, this.A02, this.A0A, r12, this), C110105dW.A0T(A0Y, A0X, r9), A022, 204, 0);
    }

    public final void A02(C35301lh r23, C35301lh r24, String str, String str2, String str3, HashMap hashMap) {
        String str4;
        String str5;
        AnonymousClass61W r21 = this.A0E;
        r21.AgB();
        Log.i("PAY: IndiaUpiPaymentSetup sendChangePin called");
        AnonymousClass4XO r14 = this.A00;
        r14.A04("upi-change-mpin");
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            str4 = C119365wy.A00("MPIN", hashMap2);
            str5 = C119365wy.A00("NMPIN", hashMap2);
        } else {
            str4 = null;
            str5 = null;
        }
        C17190ug r13 = this.A07;
        String A022 = r13.A02();
        String A012 = this.A0G.A01();
        String A0e = C110115dX.A0e(r23);
        String str6 = (String) C110105dW.A0d(r24);
        C51812cK r9 = new C51812cK(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "upi-change-mpin");
        String str7 = str2;
        if (C110115dX.A1C(str7, false)) {
            C32461gQ.A00(A0Y, "credential-id", str7);
        }
        String str8 = str3;
        if (C32271fx.A0D(str8, 35, 35, false)) {
            C32461gQ.A00(A0Y, "seq-no", str8);
        }
        if (C32271fx.A0D(str4, 0, 1000, false)) {
            C32461gQ.A00(A0Y, "old-mpin", str4);
        }
        if (C32271fx.A0D(str5, 0, 1000, false)) {
            C32461gQ.A00(A0Y, "new-mpin", str5);
        }
        if (C110105dW.A1V(A012, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", A012);
        }
        if (A0e != null && C110115dX.A1A(A0e, 0, true)) {
            C32461gQ.A00(A0Y, "vpa", A0e);
        }
        String str9 = str;
        if (str != null && C110115dX.A1A(str9, 1, true)) {
            C32461gQ.A00(A0Y, "vpa-id", str9);
        }
        if (str6 != null && C110115dX.A1D(str6, true)) {
            C32461gQ.A00(A0Y, "upi-bank-info", str6);
        }
        C28371Vv A0T = C110105dW.A0T(A0Y, A0X, r9);
        r21.A06((AnonymousClass2HJ) null, 7, 0);
        C110105dW.A1G(r13, new IDxNCallbackShape95S0100000_3_I1(this.A01, this.A02, this.A0A, r14, this, r21), A0T, A022);
    }
}
