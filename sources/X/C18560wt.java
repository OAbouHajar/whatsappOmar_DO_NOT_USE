package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0wt  reason: invalid class name and case insensitive filesystem */
public class C18560wt {
    public final C16300so A00;
    public final C40591uN A01 = new C40591uN();
    public final C216314v A02;
    public final C19650ym A03;
    public final C16900tq A04;
    public final AnonymousClass11I A05;
    public final Map A06 = Collections.synchronizedMap(new AnonymousClass197(200));

    public C18560wt(C16300so r3, C216314v r4, C19650ym r5, C16900tq r6, AnonymousClass11I r7) {
        this.A02 = r4;
        this.A00 = r3;
        this.A05 = r7;
        this.A04 = r6;
        this.A03 = r5;
    }

    public void A00() {
        C40591uN r2 = this.A01;
        synchronized (r2) {
            Iterator it = r2.A02.values().iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("count");
            }
        }
    }
}
