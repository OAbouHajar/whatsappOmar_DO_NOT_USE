package X;

import android.content.Context;
import com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1;

/* renamed from: X.5iH  reason: invalid class name and case insensitive filesystem */
public class C112305iH extends C116635rh {
    public final Context A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C18260wP A03;
    public final AnonymousClass173 A04;
    public final C14710pd A05;
    public final C17190ug A06;
    public final AnonymousClass60V A07;
    public final AnonymousClass175 A08;
    public final C18340wX A09;
    public final C18290wS A0A;
    public final C118805vH A0B;
    public final AnonymousClass61W A0C;
    public final C112715ix A0D;
    public final C18280wR A0E;

    public C112305iH(Context context, C14870pt r3, C16040sK r4, C18260wP r5, AnonymousClass173 r6, C14710pd r7, C17190ug r8, C119365wy r9, AnonymousClass60V r10, AnonymousClass175 r11, C18340wX r12, C18310wU r13, C18290wS r14, C118805vH r15, AnonymousClass61W r16, C112715ix r17, C18280wR r18) {
        super(r9.A04, r13);
        this.A00 = context;
        this.A05 = r7;
        this.A01 = r3;
        this.A02 = r4;
        this.A06 = r8;
        this.A0E = r18;
        this.A0A = r14;
        this.A08 = r11;
        this.A0B = r15;
        this.A04 = r6;
        this.A0C = r16;
        this.A03 = r5;
        this.A09 = r12;
        this.A07 = r10;
        this.A0D = r17;
    }

    public final void A00(C35301lh r20, C111805hR r21, AnonymousClass68R r22, String str) {
        AnonymousClass4XO r10 = this.A00;
        r10.A04("upi-generate-otp");
        C17190ug r3 = this.A06;
        String A022 = r3.A02();
        String A0e = C110115dX.A0e(r20);
        String A012 = this.A0E.A01();
        String str2 = (String) C110105dW.A0d(r21.A06);
        String A082 = this.A07.A08();
        C51812cK r5 = new C51812cK(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "upi-generate-otp");
        if (A0e != null && C116635rh.A03(A0e)) {
            C32461gQ.A00(A0Y, "vpa", A0e);
        }
        String str3 = str;
        if (str != null && C116635rh.A03(str3)) {
            C32461gQ.A00(A0Y, "vpa-id", str3);
        }
        if (C110105dW.A1V(A012, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", A012);
        }
        if (C110115dX.A1B(str2, 1, false)) {
            C32461gQ.A00(A0Y, "upi-bank-info", str2);
        }
        if (A082 != null && C32271fx.A0D(A082, 1, 10, true)) {
            C32461gQ.A00(A0Y, "provider-type", A082);
        }
        C110105dW.A1H(r3, new IDxNCallbackShape21S0200000_3_I1(this.A00, this.A01, this.A09, r10, r22, this), C110105dW.A0T(A0Y, A0X, r5), A022);
    }

    public void A01(C111805hR r5, AnonymousClass68R r6) {
        StringBuilder A0r = AnonymousClass000.A0r("PAY: IndiaUpiOtpAction requestOtp withCallback: ");
        A0r.append(AnonymousClass000.A1V(r6));
        C13680ns.A1V(A0r);
        this.A0C.AgB();
        String str = r5.A0F;
        if (C39841t9.A03(r5.A09)) {
            this.A0B.A01(this.A00, (AnonymousClass4XO) null, new AnonymousClass615(r5, r6, this));
        } else {
            A00(r5.A09, r5, r6, str);
        }
    }
}
