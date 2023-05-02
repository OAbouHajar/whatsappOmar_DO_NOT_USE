package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4ts  reason: invalid class name and case insensitive filesystem */
public class C99344ts implements AnonymousClass5SR {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();

    public void AMK(C14950q3 r3, C14930q1 r4, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((AnonymousClass5SR) it.next()).AMK(r3, r4, str);
            }
        }
    }

    public void ANb(C14950q3 r3, C14930q1 r4, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((AnonymousClass5SR) it.next()).ANb(r3, r4, str);
            }
        }
    }

    public void AWj(String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((AnonymousClass5SR) it.next()).AWj(str);
            }
        }
    }
}
