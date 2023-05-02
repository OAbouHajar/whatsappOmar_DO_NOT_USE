package X;

import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3GE  reason: invalid class name */
public class AnonymousClass3GE implements AnonymousClass1TV {
    public final /* synthetic */ C16460t6 A00;
    public final /* synthetic */ C109295Rm A01;
    public final /* synthetic */ C16840tj A02;
    public final /* synthetic */ C16320sq A03;

    public AnonymousClass3GE(C16460t6 r1, C109295Rm r2, C16840tj r3, C16320sq r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void AWC(AnonymousClass2HJ r2) {
        Log.e(AnonymousClass000.A0g("PAY: InteractiveMessageCheckoutInfoConverter verifyFromServer/onRequestError. paymentNetworkError: ", r2));
        this.A01.AXg();
    }

    public void AWI(AnonymousClass2HJ r2) {
        Log.e(AnonymousClass000.A0g("PAY: InteractiveMessageCheckoutInfoConverter verifyFromServer/onResponseError. paymentNetworkError: ", r2));
        this.A01.AXg();
    }

    public void AWJ(AnonymousClass2HK r6) {
        if (r6 instanceof C77583w1) {
            List list = ((C77583w1) r6).A01;
            if (list != null && list.size() > 0) {
                int i2 = ((AnonymousClass1Vt) C13690nt.A0Z(list)).A02;
                if (!C13690nt.A1V(C62013Bh.A01, i2) && !C13690nt.A1V(C62013Bh.A00, i2)) {
                    this.A03.Acl(new RunnableRunnableShape14S0200000_I1_2(this.A02, 16, this.A00));
                    this.A01.AXi();
                    return;
                }
            } else {
                return;
            }
        }
        this.A01.AXg();
    }
}
