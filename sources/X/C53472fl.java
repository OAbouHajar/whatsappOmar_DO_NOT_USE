package X;

import android.content.Context;
import com.facebook.redex.IDxICallbackShape450S0100000_2_I0;
import com.whatsapp.util.Log;

/* renamed from: X.2fl  reason: invalid class name and case insensitive filesystem */
public class C53472fl extends AnonymousClass2HA {
    public final /* synthetic */ C53352fZ A00;
    public final /* synthetic */ C53452fj A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53472fl(Context context, C18340wX r2, C53352fZ r3, C53452fj r4, C14880pu r5) {
        super(context, r2, r5);
        this.A00 = r3;
        this.A01 = r4;
    }

    public void A03(AnonymousClass2HJ r4) {
        C53452fj r2 = this.A01;
        StringBuilder sb = new StringBuilder("getOfferDetails: failed with error: ");
        sb.append(r4);
        Log.e(sb.toString());
        C53332fX r0 = r2.A01;
        if (r0 != null) {
            r0.AQQ();
        }
    }

    public void A04(AnonymousClass2HJ r4) {
        C53452fj r2 = this.A01;
        StringBuilder sb = new StringBuilder("getOfferDetails: failed with error: ");
        sb.append(r4);
        Log.e(sb.toString());
        C53332fX r0 = r2.A01;
        if (r0 != null) {
            r0.AQQ();
        }
    }

    public void A05(C28371Vv r8) {
        C53452fj r6 = this.A01;
        try {
            C28371Vv A0K = r8.A0K("account").A0K("offer_eligibility");
            r6.A02.A09(new IDxICallbackShape450S0100000_2_I0(r6, 0), A0K, r6.A00);
        } catch (AnonymousClass1W9 e2) {
            C53332fX r0 = r6.A01;
            if (r0 != null) {
                r0.AQQ();
            }
            e2.printStackTrace();
        }
    }
}
