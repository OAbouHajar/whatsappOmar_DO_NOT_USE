package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.5iO  reason: invalid class name and case insensitive filesystem */
public class C112375iO extends C112485iZ {
    public final /* synthetic */ C112295iG A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112375iO(Context context, C14870pt r13, C18340wX r14, AnonymousClass4XO r15, C112295iG r16, AnonymousClass61W r17, C112715ix r18, String str, boolean z2) {
        super(context, r13, r14, r15, r17, r18, "upi-batch", str, 3);
        this.A00 = r16;
        this.A01 = z2;
    }

    public void A03(AnonymousClass2HJ r4) {
        super.A03(r4);
        C1222568w r2 = this.A00.A00;
        if (r2 != null) {
            r2.ANU(r4, true, true, false);
        }
    }

    public void A04(AnonymousClass2HJ r4) {
        super.A04(r4);
        C1222568w r2 = this.A00.A00;
        if (r2 != null) {
            r2.ANU(r4, false, true, false);
        }
    }

    public void A05(C28371Vv r13) {
        super.A05(r13);
        C112295iG r2 = this.A00;
        C46042Cc AEJ = r2.A08.A05("UPI").AEJ();
        AnonymousClass00B.A06(AEJ);
        ArrayList AaD = AEJ.AaD(r2.A03, r13);
        C119365wy r0 = r2.A06;
        AnonymousClass4XO r4 = r2.A00;
        C117025sK A04 = r0.A04(r4, AaD);
        C1222568w r5 = r2.A00;
        if (r5 != null) {
            r5.ANV(A04.A00, A04.A01, A04.A02, true, this.A01, false);
        }
        r4.A05("upi-batch");
        ArrayList arrayList = r4.A05;
        if (!arrayList.contains("upi-list-keys")) {
            r4.A06("upi-list-keys", 500);
        }
        if (!arrayList.contains("upi-get-banks")) {
            r4.A06("upi-get-banks", 500);
        }
    }
}
