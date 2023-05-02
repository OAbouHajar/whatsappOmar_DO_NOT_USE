package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.5iG  reason: invalid class name and case insensitive filesystem */
public class C112295iG extends C116635rh {
    public C1222568w A00;
    public final Context A01;
    public final C14870pt A02;
    public final AnonymousClass173 A03;
    public final C14710pd A04;
    public final C17190ug A05;
    public final C119365wy A06;
    public final C18340wX A07;
    public final C18290wS A08;
    public final AnonymousClass61W A09;
    public final C112715ix A0A;

    public C112295iG(Context context, C14870pt r3, AnonymousClass173 r4, C14710pd r5, C17190ug r6, C119365wy r7, C18340wX r8, C18310wU r9, C18290wS r10, C1222568w r11, AnonymousClass61W r12, C112715ix r13) {
        super(r7.A04, r9);
        this.A04 = r5;
        this.A01 = context;
        this.A02 = r3;
        this.A05 = r6;
        this.A08 = r10;
        this.A06 = r7;
        this.A03 = r4;
        this.A09 = r12;
        this.A07 = r8;
        this.A0A = r13;
        this.A00 = r11;
    }

    public void A00(boolean z2) {
        Log.i("PAY: IndiaUpiPaymentSetup createPaymentAccountBatch called");
        AnonymousClass61W r12 = this.A09;
        r12.A06((AnonymousClass2HJ) null, 3, 0);
        AnonymousClass4XO r10 = this.A00;
        r10.A04("upi-batch");
        C17190ug r5 = this.A05;
        String A022 = r5.A02();
        boolean z3 = z2;
        String str = z2 ? "1" : "0";
        C51812cK r7 = new C51812cK(A022);
        C112715ix r13 = null;
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ.A00(A0X, "xmlns", "w:pay");
        C32461gQ A0Z = C110105dW.A0Z(A0X);
        C32461gQ.A00(A0Z, "action", "upi-batch");
        C32461gQ.A00(A0Z, "version", "2");
        A0Z.A09(str, "popular-banks", C115595q0.A00);
        C28371Vv A0T = C110105dW.A0T(A0Z, A0X, r7);
        boolean A0C = this.A04.A0C(2227);
        String str2 = "in_upi_batch_tag";
        if (A0C) {
            this.A0A.A04(185468726, str2);
        }
        Context context = this.A01;
        C14870pt r8 = this.A02;
        C18340wX r9 = this.A07;
        if (A0C) {
            r13 = this.A0A;
        } else {
            str2 = null;
        }
        C110105dW.A1G(r5, new C112375iO(context, r8, r9, r10, this, r12, r13, str2, z3), A0T, A022);
    }

    public void A01(boolean z2, boolean z3) {
        Log.i("PAY: IndiaUpiPaymentSetup sendGetBanksList called");
        AnonymousClass61W r12 = this.A09;
        r12.A06((AnonymousClass2HJ) null, 4, 0);
        AnonymousClass4XO r10 = this.A00;
        r10.A04("upi-get-banks");
        C17190ug r5 = this.A05;
        String A022 = r5.A02();
        boolean z4 = z2;
        String str = z2 ? "1" : "0";
        AnonymousClass2BJ r7 = new AnonymousClass2BJ(A022);
        C112715ix r13 = null;
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ.A00(A0X, "xmlns", "w:pay");
        C32461gQ A0Z = C110105dW.A0Z(A0X);
        C32461gQ.A00(A0Z, "action", "upi-get-banks");
        C32461gQ.A00(A0Z, "version", "2");
        A0Z.A09(str, "popular-banks", C115605q1.A00);
        C28371Vv A0S = C110105dW.A0S(A0Z, A0X, r7);
        boolean A0C = this.A04.A0C(2227);
        String str2 = "in_upi_get_banks_tag";
        if (A0C) {
            this.A0A.A04(185478219, str2);
        }
        Context context = this.A01;
        C14870pt r8 = this.A02;
        C18340wX r9 = this.A07;
        if (A0C) {
            r13 = this.A0A;
        } else {
            str2 = null;
        }
        C110105dW.A1G(r5, new C112395iQ(context, r8, r9, r10, this, r12, r13, str2, z3, z4), A0S, A022);
    }
}
