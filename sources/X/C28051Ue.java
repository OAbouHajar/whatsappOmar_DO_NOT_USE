package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1Ue  reason: invalid class name and case insensitive filesystem */
public final class C28051Ue {
    public final C28141Un A00 = new C28141Un();
    public final List A01 = new ArrayList(2);
    public volatile C16300so A02;

    public synchronized void A00(C28081Uh r6) {
        synchronized (this) {
            C28151Uo r3 = C28151Uo.A00;
            C28141Un r2 = this.A00;
            synchronized (r2) {
                HashMap hashMap = r2.A02;
                C28161Up r0 = (C28161Up) hashMap.get(r6);
                if (r0 == null) {
                    hashMap.put(r6, new C28161Up(r3));
                } else {
                    r0.A00 = r3;
                }
            }
        }
    }
}
