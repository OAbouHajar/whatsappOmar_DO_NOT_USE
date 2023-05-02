package X;

import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.3Hz  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3Hz implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C43241zg A02;
    public final /* synthetic */ AnonymousClass1HE A03;
    public final /* synthetic */ AnonymousClass1XP A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ AnonymousClass3Hz(C43241zg r1, AnonymousClass1HE r2, AnonymousClass1XP r3, Integer num, int i2, long j2, boolean z2) {
        this.A03 = r2;
        this.A01 = j2;
        this.A04 = r3;
        this.A06 = z2;
        this.A05 = num;
        this.A00 = i2;
        this.A02 = r1;
    }

    public final void run() {
        AnonymousClass1HE r4 = this.A03;
        long j2 = this.A01;
        AnonymousClass1XP r3 = this.A04;
        boolean z2 = this.A06;
        Integer num = this.A05;
        int i2 = this.A00;
        C43241zg r9 = this.A02;
        if (j2 > 0) {
            int A002 = r3.A0L.A02.A01 ? 3 : C13690nt.A00(z2 ? 1 : 0);
            C215914r r2 = r4.A0F;
            double d2 = (double) j2;
            boolean A1P = AnonymousClass000.A1P(num.intValue());
            synchronized (r2) {
                long A012 = r2.A01();
                int A003 = r2.A00();
                C215814q r12 = r2.A04;
                AnonymousClass25Q A013 = r12.A01(i2, A003, A002, A012, false);
                A013.A01 = (long) (((double) A013.A01) + d2);
                if (A1P) {
                    A013.A07++;
                }
                r12.A02(A013, i2, A003, A002, A012, false);
            }
        }
        if (num.intValue() == 0) {
            Iterator it = Collections.unmodifiableList(r9.A01).iterator();
            while (it.hasNext()) {
                r4.A0F.A02(C18020w1.A05(C13680ns.A0V(it)), i2);
            }
            if (r4.A0B.A0E(C16620tM.A02, 475)) {
                C43251zh r0 = r3.A0K;
                AnonymousClass00B.A06(r0);
                if (r0.A00() == 3) {
                    AnonymousClass1RN r42 = r4.A0G;
                    C31781f1 r22 = r3.A0J;
                    AnonymousClass00B.A06(r22);
                    r22.A05 = System.currentTimeMillis();
                    r42.A01.A03(r22);
                }
            }
        }
    }
}
