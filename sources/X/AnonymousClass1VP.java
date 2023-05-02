package X;

import com.obwhatsapp.payments.ui.viewmodel.BusinessHubViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.1VP  reason: invalid class name */
public final class AnonymousClass1VP implements AnonymousClass1TV {
    public final /* synthetic */ BusinessHubViewModel A00;

    public AnonymousClass1VP(BusinessHubViewModel businessHubViewModel) {
        this.A00 = businessHubViewModel;
    }

    public void AWC(AnonymousClass2HJ r4) {
        C18450wi.A0H(r4, 0);
        StringBuilder sb = new StringBuilder("PAY: BusinessHubViewModel unlinkMerchantAccount/onRequestError paymentNetworkError: [");
        sb.append(r4.A00);
        sb.append("] ");
        sb.append(r4.A07);
        Log.e(sb.toString());
        ((AnonymousClass028) this.A00.A0A.getValue()).A09(AnonymousClass5xI.A02((Object) null, new RuntimeException(r4.A07)));
    }

    public void AWI(AnonymousClass2HJ r4) {
        C18450wi.A0H(r4, 0);
        StringBuilder sb = new StringBuilder("PAY: BusinessHubViewModel unlinkMerchantAccount/onRequestError paymentNetworkError: [");
        sb.append(r4.A00);
        sb.append("] ");
        sb.append(r4.A07);
        Log.e(sb.toString());
        ((AnonymousClass028) this.A00.A0A.getValue()).A09(AnonymousClass5xI.A02((Object) null, new RuntimeException(r4.A07)));
    }

    public void AWJ(AnonymousClass2HK r3) {
        Log.i("PAY: BusinessHubViewModel unlinkMerchantAccount/onResponseSuccess");
        ((AnonymousClass028) this.A00.A0A.getValue()).A09(AnonymousClass5xI.A01((Object) null));
    }
}
