package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4y4  reason: invalid class name and case insensitive filesystem */
public class C101904y4 implements C41761wc {
    public final /* synthetic */ C75933sx A00;
    public final /* synthetic */ C26331Nh A01;
    public final /* synthetic */ AtomicBoolean A02;

    public C101904y4(C75933sx r1, C26331Nh r2, AtomicBoolean atomicBoolean) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = atomicBoolean;
    }

    public void AOJ(AnonymousClass4EG r6) {
        Iterator it = r6.A00.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += ((C28711Xg) it.next()).A00.A0G;
        }
        this.A00.A01 = Long.valueOf((j2 / 10000000) * 10000000);
        this.A02.set(true);
        this.A01.A07.A09.remove(this);
    }

    public void AOK(AnonymousClass4EH r1) {
    }

    public void APV(C28701Xf r1, C15830rv r2) {
    }
}
