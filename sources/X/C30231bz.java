package X;

import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.facebook.redex.RunnableRunnableShape0S0510000_I0;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1bz  reason: invalid class name and case insensitive filesystem */
public class C30231bz {
    public final int A00;
    public final C30271c3 A01;
    public final CopyOnWriteArrayList A02;

    public C30231bz(C30271c3 r1, CopyOnWriteArrayList copyOnWriteArrayList, int i2) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i2;
        this.A01 = r1;
    }

    public final long A00(long j2) {
        long A022 = C90604eR.A02(j2);
        if (A022 != -9223372036854775807L) {
            return 0 + A022;
        }
        return -9223372036854775807L;
    }

    public void A01(C30251c1 r9, C30261c2 r10) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass4GG r0 = (AnonymousClass4GG) it.next();
            AnonymousClass3C1.A0C(r0.A00, new RunnableRunnableShape0S0400000_I0(this, r0.A01, r10, r9, 5));
        }
    }

    public void A02(C30251c1 r9, C30261c2 r10) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass4GG r0 = (AnonymousClass4GG) it.next();
            AnonymousClass3C1.A0C(r0.A00, new RunnableRunnableShape0S0400000_I0(this, r0.A01, r10, r9, 3));
        }
    }

    public void A03(C30251c1 r9, C30261c2 r10) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass4GG r0 = (AnonymousClass4GG) it.next();
            AnonymousClass3C1.A0C(r0.A00, new RunnableRunnableShape0S0400000_I0(this, r0.A01, r10, r9, 4));
        }
    }

    public void A04(C30251c1 r11, C30261c2 r12, IOException iOException, boolean z2) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass4GG r0 = (AnonymousClass4GG) it.next();
            AnonymousClass3C1.A0C(r0.A00, new RunnableRunnableShape0S0510000_I0(this, r0.A01, r11, r12, iOException, 0, z2));
        }
    }

    public void A05(C30261c2 r6) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass4GG r0 = (AnonymousClass4GG) it.next();
            AnonymousClass3C1.A0C(r0.A00, new RunnableRunnableShape0S0300000_I0(this, r0.A01, r6, 0));
        }
    }
}
