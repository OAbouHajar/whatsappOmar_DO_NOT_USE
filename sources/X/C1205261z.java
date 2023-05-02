package X;

import android.view.View;
import com.facebook.redex.IDxKCallbackShape1S1300000_3_I1;
import com.facebook.redex.IDxTCallbackShape11S0400000_3_I1;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.61z  reason: invalid class name and case insensitive filesystem */
public class C1205261z implements AnonymousClass698 {
    public final /* synthetic */ C28401Vy A00;
    public final /* synthetic */ C30671cl A01;
    public final /* synthetic */ AnonymousClass1XP A02;
    public final /* synthetic */ PinBottomSheetDialogFragment A03;
    public final /* synthetic */ BrazilPaymentActivity A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C1205261z(C28401Vy r1, C30671cl r2, AnonymousClass1XP r3, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        this.A04 = brazilPaymentActivity;
        this.A03 = pinBottomSheetDialogFragment;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = r3;
    }

    public void AOu(String str) {
        this.A03.A1O();
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        AnonymousClass5wX A3G = brazilPaymentActivity.A3G(this.A01, new C35431lv(C35481m0.A04, 1000, (long) this.A00.A00.scaleByPowerOfTen(3).intValue()), this.A06, "payment_pin", brazilPaymentActivity.A0d);
        AnonymousClass61H r3 = new AnonymousClass61H(this);
        A3G.A0Q.Acl(new C1208763i(A3G));
        AnonymousClass50C A022 = A3G.A0H.A02("FB", "PIN", true);
        String str2 = str;
        if (A022 != null) {
            C117915tl r5 = new C117915tl(A022);
            A3G.A0F.A00(new IDxTCallbackShape11S0400000_3_I1(r3, A3G, r5, (Object) null, 1), r5, str);
            return;
        }
        A3G.A0G.A00(new IDxKCallbackShape1S1300000_3_I1(1, str2, r3, A3G, r3.A00.A04.A0O.A02("get-provider-key")), "FB");
    }

    public void ARW(View view) {
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        C116035qi r3 = new C116035qi(brazilPaymentActivity);
        C13680ns.A1U(new C114325na(r3, brazilPaymentActivity.A0P), brazilPaymentActivity.A05);
    }
}
