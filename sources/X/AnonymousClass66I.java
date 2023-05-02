package X;

import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import java.util.Map;

/* renamed from: X.66I  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66I implements Runnable {
    public final /* synthetic */ AnonymousClass1Z7 A00;
    public final /* synthetic */ AnonymousClass62S A01;
    public final /* synthetic */ C28371Vv A02;

    public /* synthetic */ AnonymousClass66I(AnonymousClass1Z7 r1, AnonymousClass62S r2, C28371Vv r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void run() {
        AnonymousClass62S r0 = this.A01;
        AnonymousClass1Z7 r5 = this.A00;
        C28371Vv r1 = this.A02;
        if (r5 != null) {
            Map A012 = r0.A01.A01(r1);
            if (r5.A00) {
                r5.A03.A00(new RunnableRunnableShape0S1200000_I0(A012, "on_success", r5, 14));
            }
        }
    }
}
