package X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.555  reason: invalid class name */
public final class AnonymousClass555 implements Iterable {
    public final /* synthetic */ C84204Jq A00;
    public final /* synthetic */ CharSequence A01;

    public AnonymousClass555(C84204Jq r1, CharSequence charSequence) {
        this.A00 = r1;
        this.A01 = charSequence;
    }

    public final Iterator iterator() {
        C84204Jq r3 = this.A00;
        return new C66453Zk(r3.A01, r3, this.A01);
    }

    public final String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[");
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                CharSequence obj = next instanceof CharSequence ? (CharSequence) next : next.toString();
                while (true) {
                    A0r.append(obj);
                    if (!it.hasNext()) {
                        break;
                    }
                    A0r.append(", ");
                    Object next2 = it.next();
                    obj = next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString();
                }
            }
            return AnonymousClass3K2.A0m(A0r);
        } catch (IOException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }
}
