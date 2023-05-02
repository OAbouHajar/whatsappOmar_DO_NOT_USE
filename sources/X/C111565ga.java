package X;

import com.facebook.redex.IDxKCallbackShape15S0400000_3_I1;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.5ga  reason: invalid class name and case insensitive filesystem */
public class C111565ga extends C70783hi {
    public final C14550pN A00;
    public final FingerprintBottomSheet A01;
    public final C16440t3 A02;
    public final AnonymousClass5wX A03;
    public final C118915vc A04;
    public final AnonymousClass61I A05;

    public C111565ga(C14550pN r1, FingerprintBottomSheet fingerprintBottomSheet, C16440t3 r3, AnonymousClass5wX r4, C118915vc r5, AnonymousClass61I r6) {
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = fingerprintBottomSheet;
        this.A05 = r6;
    }

    public void A00() {
        FingerprintBottomSheet fingerprintBottomSheet = this.A01;
        fingerprintBottomSheet.A1H(true);
        fingerprintBottomSheet.A1D();
    }

    public void A01() {
        AnonymousClass61I r0 = this.A05;
        BrazilPaymentActivity brazilPaymentActivity = r0.A04;
        C30671cl r2 = r0.A02;
        BrazilPaymentActivity.A03(r0.A01, r2, r0.A03, brazilPaymentActivity, r0.A05, r0.A06);
    }

    public void A03(AnonymousClass024 r10, AnonymousClass2J2 r11) {
        long A002 = this.A04.A00() * 1000;
        if (A002 > this.A02.A00()) {
            this.A01.A1M(A002);
            return;
        }
        AnonymousClass5wX r5 = this.A03;
        C119805ze r6 = new C119805ze(r11, this);
        r5.A0Q.Acl(new C1208763i(r5));
        AnonymousClass50C A0R = C110115dX.A0R(r5.A0H, "FB", "PIN");
        AnonymousClass024 r4 = r10;
        if (A0R != null) {
            r5.A01(r10, r6, new C117915tl(A0R));
            return;
        }
        r5.A0G.A00(new IDxKCallbackShape15S0400000_3_I1(r4, r5, r6, r6.A01.A05.A04.A0O.A02("get-provider-key"), 0), "FB");
    }
}
