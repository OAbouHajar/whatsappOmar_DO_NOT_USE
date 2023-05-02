package X;

import android.content.Context;
import java.util.Collections;

/* renamed from: X.53Q  reason: invalid class name */
public class AnonymousClass53Q implements AnonymousClass5SD {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C04580Nc A01;
    public final /* synthetic */ C95494mj A02;

    public AnonymousClass53Q(Context context, C04580Nc r2, C95494mj r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = context;
    }

    public void AWK(C29661az r5) {
        C29701b3.A02(this.A00, r5, C14950q3.A01, this.A02.A00, Collections.emptyMap());
    }

    public void AWO(AnonymousClass2WZ r5) {
        AnonymousClass5OO r0;
        C88894bG r3 = new C88894bG(new AnonymousClass4CL(true), 1);
        AnonymousClass4Q1 r2 = r5.A00 == 5 ? new AnonymousClass0J3(r5.A01, r3) : new AnonymousClass0J2(r3, r5.A02);
        AnonymousClass0WJ r1 = this.A01.A00;
        synchronized (r1) {
            r0 = r1.A00;
        }
        if (r0 != null) {
            r0.AWG(r2);
        }
    }
}
