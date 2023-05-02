package X;

import android.content.Context;

/* renamed from: X.5iT  reason: invalid class name and case insensitive filesystem */
public class C112425iT extends C112485iZ {
    public final /* synthetic */ C112335iK A00;
    public final /* synthetic */ AnonymousClass4QP A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112425iT(Context context, C14870pt r8, C18340wX r9, AnonymousClass4XO r10, C112335iK r11, AnonymousClass4QP r12, String str) {
        super(context, r8, r9, r10, "register-alias");
        this.A00 = r11;
        this.A02 = str;
        this.A01 = r12;
    }

    public void A03(AnonymousClass2HJ r3) {
        C112335iK.A00(r3, this.A00, this.A02);
        super.A03(r3);
        this.A01.A00((C53872gR) null, r3);
    }

    public void A04(AnonymousClass2HJ r3) {
        C112335iK.A00(r3, this.A00, this.A02);
        super.A04(r3);
        this.A01.A00((C53872gR) null, r3);
    }

    public void A05(C28371Vv r6) {
        C28371Vv A0J;
        C112335iK r4 = this.A00;
        C112335iK.A00((AnonymousClass2HJ) null, r4, this.A02);
        super.A05(r6);
        C28371Vv A0X = C110115dX.A0X(r6);
        if (A0X != null && (A0J = A0X.A0J("alias")) != null) {
            AnonymousClass4QP r2 = this.A01;
            try {
                r2.A00(C112485iZ.A01(A0J), (AnonymousClass2HJ) null);
            } catch (AnonymousClass1W9 unused) {
                r4.A04.A05("onRegisterVpaAlias/onResponseSuccess/corrupt stream exception");
                r2.A00((C53872gR) null, new AnonymousClass2HJ(500));
            }
        }
    }
}
