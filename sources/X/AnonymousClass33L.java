package X;

import android.content.Context;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;

/* renamed from: X.33L  reason: invalid class name */
public class AnonymousClass33L extends AnonymousClass2HA {
    public final /* synthetic */ C86184Rn A00;
    public final /* synthetic */ C18310wU A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass33L(Context context, C18340wX r2, C86184Rn r3, C18310wU r4, C14880pu r5) {
        super(context, r2, r5);
        this.A01 = r4;
        this.A00 = r3;
    }

    public void A03(AnonymousClass2HJ r2) {
        this.A00.A00();
    }

    public void A04(AnonymousClass2HJ r2) {
        this.A00.A00();
    }

    public void A05(C28371Vv r15) {
        C28371Vv A0J = r15.A0J("account");
        if (A0J == null || !"1".equals(C28371Vv.A05(A0J, "cancel-status"))) {
            this.A00.A00();
            return;
        }
        C86184Rn r1 = this.A00;
        C228019i r0 = r1.A04;
        C16320sq r2 = r0.A0D;
        C16440t3 r4 = r0.A01;
        AnonymousClass17E r6 = r0.A05;
        C222617g r11 = r0.A0C;
        C18290wS r10 = r0.A0B;
        C13680ns.A1U(new C607736b(r4, r0.A03, r6, r1.A01, r1.A02, r0.A0A, r10, r11, new RunnableRunnableShape19S0100000_I1_2(r1.A03, 7), 18), r2);
    }
}
