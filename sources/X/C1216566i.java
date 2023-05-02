package X;

import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.66i  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1216566i implements Runnable {
    public final /* synthetic */ AnonymousClass1Z7 A00;
    public final /* synthetic */ AnonymousClass62S A01;
    public final /* synthetic */ C116615rf A02;
    public final /* synthetic */ C28371Vv A03;

    public /* synthetic */ C1216566i(AnonymousClass1Z7 r1, AnonymousClass62S r2, C116615rf r3, C28371Vv r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass62S r6 = this.A01;
        C116615rf r4 = this.A02;
        C28371Vv r3 = this.A03;
        AnonymousClass1Z7 r5 = this.A00;
        Iterator it = AnonymousClass2HA.A00(r3).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((AnonymousClass2HJ) it.next()).A00 == 453) {
                    r4.A00.A06(true);
                    break;
                }
            } else {
                break;
            }
        }
        if (r5 != null) {
            Map A012 = r6.A01.A01(r3);
            if (r5.A00) {
                r5.A03.A00(new RunnableRunnableShape0S1200000_I0(A012, "on_failure", r5, 14));
            }
        }
    }
}
