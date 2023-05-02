package X;

import java.util.AbstractSet;
import java.util.Set;

/* renamed from: X.5C0  reason: invalid class name */
public abstract class AnonymousClass5C0<E> extends AbstractSet<E> implements Set<E>, AnonymousClass5VE {
    public abstract boolean add(Object obj);

    public final /* bridge */ int size() {
        return (this instanceof C106105Cn ? ((C106105Cn) this).backing : this instanceof C106115Co ? ((C106115Co) this).A00 : ((C106095Cm) this).A00).size();
    }
}
