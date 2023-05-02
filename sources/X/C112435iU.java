package X;

import android.content.Context;

/* renamed from: X.5iU  reason: invalid class name and case insensitive filesystem */
public class C112435iU extends C112485iZ {
    public final /* synthetic */ C118135uC A00;
    public final /* synthetic */ C112205i7 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112435iU(Context context, C14870pt r8, C118135uC r9, C18340wX r10, AnonymousClass4XO r11, C112205i7 r12, String str, String str2, boolean z2) {
        super(context, r8, r10, r11, str);
        this.A01 = r12;
        this.A00 = r9;
        this.A03 = z2;
        this.A02 = str2;
    }

    public void A03(AnonymousClass2HJ r3) {
        super.A03(r3);
        this.A00.A00(r3, this.A03);
    }

    public void A04(AnonymousClass2HJ r3) {
        super.A04(r3);
        this.A00.A00(r3, this.A03);
    }

    public void A05(C28371Vv r6) {
        super.A05(r6);
        AnonymousClass60O r4 = this.A01.A04;
        C35301lh A0J = C110105dW.A0J(C110105dW.A0L(), String.class, this.A02, "upiHandle");
        boolean z2 = this.A03;
        r4.A00(A0J, z2);
        C118135uC r2 = this.A00;
        StringBuilder A0r = AnonymousClass000.A0r("PAY: IndiaUpiBlockListManager/on-success blocked: ");
        A0r.append(z2);
        C13680ns.A1V(A0r);
        r2.A01.A02.A0C((C14600pS) r2.A00);
        r2.A02.AWL((AnonymousClass2HJ) null);
    }
}
