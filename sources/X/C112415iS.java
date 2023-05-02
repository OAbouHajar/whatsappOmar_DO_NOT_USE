package X;

import android.content.Context;
import com.facebook.redex.IDxNFunctionShape44S0200000_3_I1;

/* renamed from: X.5iS  reason: invalid class name and case insensitive filesystem */
public class C112415iS extends C112485iZ {
    public final C16300so A00;
    public final C118195uI A01;
    public final AnonymousClass5wD A02;

    public C112415iS(Context context, C16300so r8, C14870pt r9, C18340wX r10, AnonymousClass4XO r11, C118195uI r12, AnonymousClass5wD r13) {
        super(context, r9, r10, r11, "upi-create-mandate");
        this.A00 = r8;
        this.A02 = r13;
        this.A01 = r12;
    }

    public void A03(AnonymousClass2HJ r3) {
        super.A03(r3);
        this.A01.A00(r3, (String) null, (String) null);
    }

    public void A04(AnonymousClass2HJ r3) {
        super.A04(r3);
        this.A01.A00(r3, (String) null, (String) null);
    }

    public void A05(C28371Vv r23) {
        try {
            AnonymousClass5wD r4 = this.A02;
            C16300so r2 = this.A00;
            C28371Vv r3 = r23;
            C28371Vv.A06(r3, "iq");
            C28371Vv r10 = r4.A00;
            Class<String> cls = String.class;
            Long A0X = AnonymousClass3K2.A0X();
            Long A0Y = AnonymousClass3K2.A0Y();
            Object A012 = C32271fx.A01((C16300so) null, r10, cls, A0X, A0Y, (Object) null, new String[]{"account", "action"}, false);
            C32271fx.A01((C16300so) null, r3, cls, A0X, A0Y, A012, new String[]{"account", "action"}, true);
            Long A0a = AnonymousClass3K2.A0a();
            C28371Vv r13 = r3;
            Class<String> cls2 = cls;
            String str = (String) C32271fx.A01((C16300so) null, r13, cls2, A0a, 100L, (Object) null, new String[]{"account", "mandate-no"}, false);
            C32271fx.A03(r3, new IDxNFunctionShape44S0200000_3_I1(r2, r10, 5), new String[0]);
            C118195uI r0 = this.A01;
            r0.A00((AnonymousClass2HJ) null, str, (String) C32271fx.A01((C16300so) null, r13, cls2, A0a, 1000L, (Object) null, new String[]{"account", "transaction-id"}, false));
        } catch (AnonymousClass1W9 unused) {
            this.A01.A00(new AnonymousClass2HJ(500), (String) null, (String) null);
        }
    }
}
