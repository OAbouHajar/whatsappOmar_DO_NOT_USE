package X;

import com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import java.util.List;

/* renamed from: X.3GF  reason: invalid class name */
public final class AnonymousClass3GF implements AnonymousClass1TV {
    public final /* synthetic */ P2mLiteOrderDetailsActivity A00;
    public final /* synthetic */ C16830ti A01;
    public final /* synthetic */ String A02;

    public AnonymousClass3GF(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C16830ti r2, String str) {
        this.A00 = p2mLiteOrderDetailsActivity;
        this.A01 = r2;
        this.A02 = str;
    }

    public static /* synthetic */ void A00(AnonymousClass2HK r1, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C16830ti r3, String str) {
        String str2;
        List list = ((C77583w1) r1).A01;
        if (list != null && list.size() > 0) {
            C221116r r0 = p2mLiteOrderDetailsActivity.A06;
            if (r0 != null) {
                r0.A0n(list);
            } else {
                str2 = "paymentTransactionStore";
                throw C18450wi.A03(str2);
            }
        }
        AnonymousClass2ZJ r02 = p2mLiteOrderDetailsActivity.A0J;
        if (r02 != null) {
            r3.A0L = r02.A02.A0L(str);
            p2mLiteOrderDetailsActivity.A35().A0a(r3);
            p2mLiteOrderDetailsActivity.A05.A0K(new AnonymousClass55W(p2mLiteOrderDetailsActivity, r3));
            return;
        }
        str2 = "paymentCheckoutOrderRepository";
        throw C18450wi.A03(str2);
    }

    public static /* synthetic */ void A01(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C16830ti r4) {
        p2mLiteOrderDetailsActivity.Ac1();
        AnonymousClass1Vt r0 = r4.A0L;
        p2mLiteOrderDetailsActivity.A3B(r4, !(r0 == null ? false : r0.A0F()));
        p2mLiteOrderDetailsActivity.A37().A01(C797441c.NONE, p2mLiteOrderDetailsActivity.A37().A07.A00(p2mLiteOrderDetailsActivity, r4));
    }

    public void AWC(AnonymousClass2HJ r2) {
        this.A00.Ac1();
    }

    public void AWI(AnonymousClass2HJ r2) {
        this.A00.Ac1();
    }

    public void AWJ(AnonymousClass2HK r6) {
        if (!(r6 instanceof C77583w1)) {
            this.A00.Ac1();
            return;
        }
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A00;
        p2mLiteOrderDetailsActivity.A05.Aco(new C1045455u(r6, p2mLiteOrderDetailsActivity, this.A01, this.A02));
    }
}
