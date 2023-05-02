package X;

import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape6S0200000_I0_4;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1xv  reason: invalid class name and case insensitive filesystem */
public class C42511xv {
    public final C221116r A00;
    public final AnonymousClass160 A01;
    public final AnonymousClass1GR A02;
    public final C16320sq A03;

    public C42511xv(C221116r r1, AnonymousClass160 r2, AnonymousClass1GR r3, C16320sq r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public AnonymousClass1WD A00() {
        AnonymousClass1WD r3 = new AnonymousClass1WD();
        this.A03.Acl(new RunnableRunnableShape6S0200000_I0_4(this, 41, r3));
        return r3;
    }

    public AnonymousClass1WD A01(String str) {
        AnonymousClass1WD r3 = new AnonymousClass1WD();
        this.A03.Acl(new RunnableRunnableShape0S1200000_I0(r3, str, this, 21));
        return r3;
    }

    public void A02(AnonymousClass2HF r8, C30671cl r9) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(r9);
        C16320sq r5 = this.A03;
        r5.Ack(new C604331o(r8, this.A01, this.A02, r5, arrayList), new Void[0]);
    }

    public void A03(AnonymousClass2HF r8, List list) {
        C16320sq r5 = this.A03;
        r5.Ack(new C74083pi(r8, this.A01, this.A02, r5, list), new Void[0]);
    }
}
