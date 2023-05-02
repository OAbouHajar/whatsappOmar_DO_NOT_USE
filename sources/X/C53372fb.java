package X;

import com.whatsapp.util.Log;

/* renamed from: X.2fb  reason: invalid class name and case insensitive filesystem */
public class C53372fb {
    public final /* synthetic */ C53342fY A00;
    public final /* synthetic */ AnonymousClass1GO A01;
    public final /* synthetic */ C53312fV A02;
    public final /* synthetic */ String A03;

    public C53372fb(C53342fY r1, AnonymousClass1GO r2, C53312fV r3, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
    }

    public void A00(AnonymousClass2HJ r3) {
        StringBuilder sb = new StringBuilder("PAY: PaymentIncentiveManager/getIncentiveOfferInfo/getOfferDetails/onError : ");
        sb.append(r3);
        Log.e(sb.toString());
        C53342fY r1 = this.A00;
        if (r1 != null) {
            Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshGetIncentiveOfferInfo failed");
            r1.A00.AQQ();
        }
    }
}
