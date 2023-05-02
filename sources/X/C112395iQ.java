package X;

import android.content.Context;

/* renamed from: X.5iQ  reason: invalid class name and case insensitive filesystem */
public class C112395iQ extends C112485iZ {
    public final /* synthetic */ C112295iG A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112395iQ(Context context, C14870pt r13, C18340wX r14, AnonymousClass4XO r15, C112295iG r16, AnonymousClass61W r17, C112715ix r18, String str, boolean z2, boolean z3) {
        super(context, r13, r14, r15, r17, r18, "upi-get-banks", str, 4);
        this.A00 = r16;
        this.A02 = z2;
        this.A01 = z3;
    }

    public void A03(AnonymousClass2HJ r5) {
        super.A03(r5);
        C1222568w r3 = this.A00.A00;
        if (r3 != null) {
            r3.ANU(r5, true, false, this.A02);
        }
    }

    public void A04(AnonymousClass2HJ r4) {
        super.A04(r4);
        C1222568w r2 = this.A00.A00;
        if (r2 != null) {
            r2.ANU(r4, false, false, this.A02);
        }
    }

    public void A05(C28371Vv r9) {
        super.A05(r9);
        C112295iG r3 = this.A00;
        C46042Cc AEJ = r3.A08.A05("UPI").AEJ();
        AnonymousClass00B.A06(AEJ);
        C117025sK A04 = r3.A06.A04(r3.A00, AEJ.AaD(r3.A03, r9));
        C1222568w r1 = r3.A00;
        if (r1 != null) {
            r1.ANV(A04.A00, A04.A01, A04.A02, false, this.A01, this.A02);
        }
    }
}
