package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1;

/* renamed from: X.5eh  reason: invalid class name and case insensitive filesystem */
public class C110705eh extends C003401n {
    public AnonymousClass027 A00 = C13690nt.A0O();
    public C30801cy A01 = new C30801cy();
    public String A02;
    public boolean A03;
    public final C15900s5 A04;
    public final AnonymousClass013 A05;
    public final C14710pd A06;
    public final C118055tz A07;
    public final C117675tN A08;
    public final AnonymousClass5x5 A09;

    public C110705eh(C15900s5 r2, AnonymousClass013 r3, C14710pd r4, C118055tz r5, C117675tN r6, AnonymousClass5x5 r7) {
        this.A06 = r4;
        this.A04 = r2;
        this.A09 = r7;
        this.A05 = r3;
        this.A08 = r6;
        this.A07 = r5;
    }

    public static /* synthetic */ void A01(C110705eh r16) {
        C110705eh r2 = r16;
        if (!r2.A04.A05(C15910s6.A0n) || TextUtils.isEmpty(r2.A05().A0I)) {
            r2.A06();
            return;
        }
        C117675tN r1 = r2.A08;
        Context context = r1.A01.A00;
        C14870pt r10 = r1.A00;
        AnonymousClass4XO r13 = new AnonymousClass4XO();
        C112175i4 r8 = new C112175i4(context, r10, r1.A03, r1.A06, r13, r1.A07);
        String str = r2.A05().A08;
        C116335rD r9 = new C116335rD(r2);
        C17190ug r102 = r8.A02;
        String A022 = r102.A02();
        AnonymousClass2BJ r6 = new AnonymousClass2BJ(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ.A00(A0X, "xmlns", "w:pay");
        C32461gQ A0Z = C110105dW.A0Z(A0X);
        C32461gQ.A00(A0Z, "action", "upi-verify-qr-code");
        if (C110115dX.A1B(str, 1, false)) {
            C32461gQ.A00(A0Z, "signed-qr-code", str);
        }
        r102.A0A(new IDxNCallbackShape21S0200000_3_I1(r8.A00, r8.A01, r8.A03, C116635rh.A02(r8, "upi-verify-qr-code"), r8, r9), C110105dW.A0S(A0Z, A0X, r6), A022, 204, 0);
    }

    public C119395xh A05() {
        Object A012 = this.A00.A01();
        AnonymousClass00B.A06(A012);
        return (C119395xh) A012;
    }

    public final void A06() {
        if (!this.A04.A05(C15910s6.A0q) || !A05().A0P || TextUtils.isEmpty(A05().A0F)) {
            A07();
        } else {
            C117425sy.A00(this.A01, 3);
        }
    }

    public final void A07() {
        C117425sy r2 = new C117425sy(5);
        r2.A03 = !TextUtils.isEmpty(A05().A0A);
        r2.A04 = "DEEP_LINK".equals(this.A02);
        this.A01.A0B(r2);
    }
}
