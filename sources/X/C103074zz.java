package X;

import com.obwhatsapp.payments.ui.P2mLitePaymentSettingsFragment;

/* renamed from: X.4zz  reason: invalid class name and case insensitive filesystem */
public final class C103074zz implements AnonymousClass1TV {
    public final /* synthetic */ P2mLitePaymentSettingsFragment A00;

    public C103074zz(P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment) {
        this.A00 = p2mLitePaymentSettingsFragment;
    }

    public void AWC(AnonymousClass2HJ r2) {
        this.A00.A0F.A05();
    }

    public void AWI(AnonymousClass2HJ r5) {
        C18450wi.A0H(r5, 0);
        P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment = this.A00;
        AnonymousClass4QO A01 = p2mLitePaymentSettingsFragment.A06;
        if (A01 != null) {
            A01.A00((long) r5.A00);
        }
        p2mLitePaymentSettingsFragment.A0F.A05();
    }

    public void AWJ(AnonymousClass2HK r5) {
        C18450wi.A0H(r5, 0);
        if (r5.A02) {
            P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment = this.A00;
            C13680ns.A0z(p2mLitePaymentSettingsFragment.A0c.A01().edit(), "has_p2mlite_account", false);
            p2mLitePaymentSettingsFragment.A1e();
        }
        this.A00.A0F.A05();
    }
}
