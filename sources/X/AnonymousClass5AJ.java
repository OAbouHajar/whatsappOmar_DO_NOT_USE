package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5AJ  reason: invalid class name */
public class AnonymousClass5AJ implements AnonymousClass5R4, C32421gK {
    public Collection A00;

    public AnonymousClass5AJ(AnonymousClass5R4 r2) {
        this.A00 = C13680ns.A0n(r2.ADM((C109955Ul) null));
    }

    public Collection ADM(C109955Ul r5) {
        if (r5 == null) {
            return C13680ns.A0n(this.A00);
        }
        ArrayList A0u = AnonymousClass000.A0u();
        for (Object next : this.A00) {
            if (r5.ALL(next)) {
                A0u.add(next);
            }
        }
        return A0u;
    }

    public Iterator iterator() {
        return C13680ns.A0n(this.A00).iterator();
    }
}
