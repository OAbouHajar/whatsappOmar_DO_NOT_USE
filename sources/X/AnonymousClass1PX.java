package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1PX  reason: invalid class name */
public class AnonymousClass1PX {
    public final C25511Kb A00;
    public final Set A01 = new HashSet();

    public AnonymousClass1PX(C25511Kb r2) {
        this.A00 = r2;
    }

    public synchronized void A00(AnonymousClass3FJ r2) {
        this.A01.add(r2);
    }

    public synchronized void A01(AnonymousClass3FJ r2) {
        this.A01.remove(r2);
    }
}
