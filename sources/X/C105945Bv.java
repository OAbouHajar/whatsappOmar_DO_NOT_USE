package X;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.5Bv  reason: invalid class name and case insensitive filesystem */
public abstract class C105945Bv<E> extends AbstractSet<E> {
    public boolean removeAll(Collection collection) {
        return C90734ei.removeAllImpl((Set) this, collection);
    }

    public boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }
}
