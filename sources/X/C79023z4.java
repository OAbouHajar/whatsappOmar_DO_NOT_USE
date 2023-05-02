package X;

import com.obwhatsapp.privacy.disclosure.standalone.PrivacyDisclosureStandaloneContainerViewModel;

/* renamed from: X.3z4  reason: invalid class name and case insensitive filesystem */
public final class C79023z4 extends C16690tT {
    public final /* synthetic */ PrivacyDisclosureStandaloneContainerViewModel A00;

    public C79023z4(PrivacyDisclosureStandaloneContainerViewModel privacyDisclosureStandaloneContainerViewModel) {
        this.A00 = privacyDisclosureStandaloneContainerViewModel;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            return new C87154Vp(C797541d.SUCCESS, (Exception) null);
        } catch (AnonymousClass43K e2) {
            return new C87154Vp(C797541d.ERROR, e2);
        }
    }

    public void A09() {
        this.A00.A02.A0B(new C87154Vp(C797541d.LOADING, (Exception) null));
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C18450wi.A0H(obj, 0);
        this.A00.A02.A0B(obj);
    }
}
