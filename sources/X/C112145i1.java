package X;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5i1  reason: invalid class name and case insensitive filesystem */
public class C112145i1 extends AnonymousClass2X2 {
    public final C16440t3 A00;
    public final C15860rz A01;
    public final C18300wT A02;

    public C112145i1(C16440t3 r1, C15860rz r2, AnonymousClass17O r3, AnonymousClass1GQ r4, C18300wT r5, C1222969a r6) {
        super(r3, r4, r6);
        this.A00 = r1;
        this.A02 = r5;
        this.A01 = r2;
    }

    public void A00(Context context, String str) {
        C15860rz r7 = this.A01;
        int i2 = (r7.A0J("payments_merchant_upsell_start_cool_off_timestamp") > -1 ? 1 : (r7.A0J("payments_merchant_upsell_start_cool_off_timestamp") == -1 ? 0 : -1));
        long currentTimeMillis = System.currentTimeMillis();
        if (i2 == 0) {
            currentTimeMillis += TimeUnit.DAYS.toMillis(30);
        }
        C18300wT r8 = this.A02;
        C13680ns.A0w(C110105dW.A06(r8), "payment_smb_upsell_view_count", C13690nt.A01(r8.A01(), "payment_smb_upsell_view_count") + 1);
        r7.A14("payments_merchant_upsell_start_cool_off_timestamp", currentTimeMillis);
        this.A02.AKS(C13680ns.A0Y(), 36, "merchant_upsell_prompt", "chat");
        this.A01.A00(context, "merchant_upsell_prompt");
    }

    public void A01(String str) {
        C15860rz r7 = this.A01;
        int i2 = (r7.A0J("payments_merchant_upsell_start_cool_off_timestamp") > -1 ? 1 : (r7.A0J("payments_merchant_upsell_start_cool_off_timestamp") == -1 ? 0 : -1));
        long currentTimeMillis = System.currentTimeMillis();
        if (i2 == 0) {
            currentTimeMillis += TimeUnit.DAYS.toMillis(30);
        }
        C18300wT r8 = this.A02;
        C13680ns.A0w(C110105dW.A06(r8), "payment_smb_upsell_view_count", C13690nt.A01(r8.A01(), "payment_smb_upsell_view_count") + 1);
        r7.A14("payments_merchant_upsell_start_cool_off_timestamp", currentTimeMillis);
        this.A02.AKS(C13680ns.A0Y(), 10, "merchant_upsell_prompt", "chat");
    }

    public boolean A02() {
        return super.A02() && this.A01.A1n("payments_merchant_upsell_start_cool_off_timestamp", TimeUnit.DAYS.toMillis(30)) && C13690nt.A01(this.A02.A01(), "payment_smb_upsell_view_count") < 3;
    }
}
