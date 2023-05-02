package X;

import com.facebook.redex.RunnableRunnableShape0S1210000_I0;
import java.util.Set;

/* renamed from: X.4Q7  reason: invalid class name */
public class AnonymousClass4Q7 {
    public final /* synthetic */ C448725z A00;

    public AnonymousClass4Q7(C448725z r1) {
        this.A00 = r1;
    }

    public void A00(String str, Set set, boolean z2) {
        C448725z r2 = this.A00;
        AnonymousClass1ZJ r0 = r2.A06;
        boolean z3 = r0.A09;
        Set set2 = set;
        boolean contains = set.contains(r0.A04);
        r2.A00 = !z3 ? !contains : contains;
        r2.A03.Acq(new RunnableRunnableShape0S1210000_I0(r2, set2, str, 1, z2));
    }
}
