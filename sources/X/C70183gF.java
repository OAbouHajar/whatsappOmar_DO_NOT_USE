package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3gF  reason: invalid class name and case insensitive filesystem */
public class C70183gF extends C89494cI implements Iterable {
    public List A00 = AnonymousClass000.A0u();

    public C70183gF(Collection collection) {
        for (Object A01 : collection) {
            this.A00.add(C89494cI.A01(A01));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70183gF)) {
            return false;
        }
        return this.A00.equals(((C70183gF) obj).A00);
    }

    public Iterator iterator() {
        return this.A00.iterator();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[");
        A0r.append(C90264dr.A00(this.A00, ",", ""));
        return AnonymousClass000.A0h("]", A0r);
    }
}
