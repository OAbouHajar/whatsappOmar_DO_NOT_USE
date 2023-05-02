package X;

import android.content.Context;
import com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1;
import com.whatsapp.util.Log;

/* renamed from: X.5iE  reason: invalid class name and case insensitive filesystem */
public class C112275iE extends C116635rh {
    public C111805hR A00;
    public AnonymousClass68T A01;
    public final Context A02;
    public final C14870pt A03;
    public final AnonymousClass173 A04;
    public final C14710pd A05;
    public final C17190ug A06;
    public final AnonymousClass60V A07;
    public final AnonymousClass175 A08;
    public final C18340wX A09;
    public final C18290wS A0A;
    public final AnonymousClass61W A0B;
    public final C112715ix A0C;
    public final C18280wR A0D;

    public C112275iE(Context context, C14870pt r3, AnonymousClass173 r4, C14710pd r5, C17190ug r6, C119365wy r7, AnonymousClass60V r8, AnonymousClass175 r9, C18340wX r10, C18310wU r11, C18290wS r12, AnonymousClass68T r13, AnonymousClass61W r14, C112715ix r15, C18280wR r16) {
        super(r7.A04, r11);
        this.A02 = context;
        this.A05 = r5;
        this.A03 = r3;
        this.A06 = r6;
        this.A0D = r16;
        this.A0A = r12;
        this.A08 = r9;
        this.A04 = r4;
        this.A09 = r10;
        this.A07 = r8;
        this.A0B = r14;
        this.A0C = r15;
        this.A01 = r13;
    }

    public void A00(C111805hR r27, AnonymousClass68Y r28, boolean z2, boolean z3) {
        Log.i("PAY: IndiaUpiPaymentSetup registerVpa called");
        AnonymousClass4XO r1 = this.A00;
        AnonymousClass4XO r25 = r1;
        r1.A04("upi-register-vpa");
        C17190ug r24 = this.A06;
        String A022 = r24.A02();
        String A012 = this.A0D.A01();
        C111805hR r6 = r27;
        String str = (String) C110105dW.A0d(r6.A06);
        String A082 = this.A07.A08();
        String str2 = (String) C110105dW.A0d(r6.A09);
        String str3 = r6.A0F;
        String str4 = "1";
        String str5 = "0";
        if (z2) {
            str5 = str4;
        }
        if (!z3) {
            str4 = "0";
        }
        C51812cK r9 = new C51812cK(A022);
        C112715ix r11 = null;
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "upi-register-vpa");
        if (C110105dW.A1W(A012, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", A012);
        }
        if (C32271fx.A0D(str, 1, 100000, false)) {
            C32461gQ.A00(A0Y, "upi-bank-info", str);
        }
        if (A082 != null && C32271fx.A0D(A082, 1, 10, true)) {
            C32461gQ.A00(A0Y, "provider-type", A082);
        }
        if (str2 != null && C110115dX.A1C(str2, true)) {
            C32461gQ.A00(A0Y, "vpa", str2);
        }
        if (str3 != null && C110115dX.A1A(str3, 1, true)) {
            C32461gQ.A00(A0Y, "vpa-id", str3);
        }
        A0Y.A0A(str5, "default-debit", C115635q4.A01);
        A0Y.A0A(str4, "default-credit", C115635q4.A00);
        C28371Vv A0T = C110105dW.A0T(A0Y, A0X, r9);
        this.A00 = r6;
        AnonymousClass61W r62 = this.A0B;
        r62.A06((AnonymousClass2HJ) null, 5, 0);
        boolean A0C2 = this.A05.A0C(2227);
        String str6 = "in_upi_register_tag";
        if (A0C2) {
            this.A0C.A04(185475893, str6);
        }
        Context context = this.A02;
        C14870pt r15 = this.A03;
        C18340wX r2 = this.A09;
        if (A0C2) {
            r11 = this.A0C;
        } else {
            str6 = null;
        }
        C110105dW.A1G(r24, new IDxNCallbackShape21S0200000_3_I1(context, r15, r2, r25, this, r62, r28, r11, str6), A0T, A022);
    }
}
