package X;

import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import java.util.Random;

/* renamed from: X.1O3  reason: invalid class name */
public final class AnonymousClass1O3 implements C23541Cj {
    public final C16300so A00;
    public final C14710pd A01;
    public final C16490t9 A02;

    public AnonymousClass1O3(C16300so r2, C14710pd r3, C16490t9 r4) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r4, 2);
        C18450wi.A0H(r2, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public void APJ() {
        C23401Bv r3 = (C23401Bv) this.A00;
        r3.A0E.Acl(new RunnableRunnableShape8S0100000_I0_7(r3, 25));
        int A03 = this.A01.A03(C16620tM.A02, 1211);
        if (A03 > 0 && new Random().nextInt(A03) < 1) {
            C75373s3 r2 = new C75373s3();
            r2.A00 = 0;
            r2.A01 = 1L;
            r2.A05 = "Dummy";
            r2.A04 = "Dummy";
            r2.A03 = "2.23.1.76";
            this.A02.A04(r2);
        }
    }

    public /* synthetic */ void APK() {
    }
}
