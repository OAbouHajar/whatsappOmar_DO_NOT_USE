package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5Bh  reason: invalid class name and case insensitive filesystem */
public class C105815Bh<F, T> extends AbstractCollection<T> {
    public final Collection fromCollection;
    public final C49762Vq function;

    public C105815Bh(Collection collection, C49762Vq r2) {
        this.fromCollection = collection;
        this.function = r2;
    }

    public void clear() {
        this.fromCollection.clear();
    }

    public boolean isEmpty() {
        return this.fromCollection.isEmpty();
    }

    public Iterator iterator() {
        return C28021Ua.transform(this.fromCollection.iterator(), this.function);
    }

    public int size() {
        return this.fromCollection.size();
    }
}
