package X;

import android.content.Context;
import com.facebook.redex.IDxNFunctionShape44S0200000_3_I1;

/* renamed from: X.5hr  reason: invalid class name and case insensitive filesystem */
public class C112045hr extends AnonymousClass2HA {
    public final /* synthetic */ AnonymousClass691 A00;
    public final /* synthetic */ C118315uU A01;
    public final /* synthetic */ C116465rQ A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112045hr(Context context, C18340wX r2, AnonymousClass691 r3, C118315uU r4, C14880pu r5, C116465rQ r6) {
        super(context, r2, r5);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r6;
    }

    public void A03(AnonymousClass2HJ r2) {
        this.A00.AQW(r2);
    }

    public void A04(AnonymousClass2HJ r2) {
        this.A00.AQW(r2);
    }

    public void A05(C28371Vv r23) {
        try {
            C116465rQ r1 = this.A02;
            C16300so r4 = this.A01.A00;
            C28371Vv r15 = r23;
            C28371Vv.A06(r15, "iq");
            C28371Vv r7 = r1.A00;
            Class<String> cls = String.class;
            Long A0X = AnonymousClass3K2.A0X();
            Long A0Y = AnonymousClass3K2.A0Y();
            C32271fx.A01((C16300so) null, r15, cls, A0X, A0Y, C32271fx.A01((C16300so) null, r7, cls, A0X, A0Y, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
            String A06 = C32271fx.A06(r15, C115575py.A00, new String[]{"account", "status"});
            C32271fx.A03(r15, new IDxNFunctionShape44S0200000_3_I1(r4, r7, 4), new String[0]);
            this.A00.AY8("INACTIVE".equals(A06) ? C797441c.INACTIVE : "ACTIVE".equals(A06) ? C797441c.ACTIVE : C797441c.NONE);
        } catch (AnonymousClass1W9 e2) {
            C110105dW.A1O("PaymentMerchantAccountActions", e2.getMessage());
        }
    }
}
