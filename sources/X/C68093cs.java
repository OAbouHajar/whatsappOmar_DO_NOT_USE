package X;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3cs  reason: invalid class name and case insensitive filesystem */
public class C68093cs extends Maps.EntrySet<K, Collection<V>> {
    public final /* synthetic */ C67963cf this$1;

    public C68093cs() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C68093cs(C67963cf r1) {
        this();
        this.this$1 = r1;
    }

    public void clear() {
        map().clear();
    }

    public boolean contains(Object obj) {
        return C90534eK.safeContains(this.this$1.submap.entrySet(), obj);
    }

    public boolean isEmpty() {
        return map().isEmpty();
    }

    public Iterator iterator() {
        return new AnonymousClass57Z(this.this$1);
    }

    public Map map() {
        return this.this$1;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.3cs, java.util.AbstractCollection] */
    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.this$1.this$0.removeValuesForKey(((Map.Entry) obj).getKey());
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3cs, java.util.Set, X.5Bv] */
    public boolean removeAll(Collection collection) {
        try {
            return C68093cs.super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            return C90734ei.removeAllImpl((Set) this, collection.iterator());
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.3cs, java.util.AbstractCollection, X.5Bv] */
    public boolean retainAll(Collection collection) {
        try {
            return C68093cs.super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet newHashSetWithExpectedSize = C90734ei.newHashSetWithExpectedSize(collection.size());
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    newHashSetWithExpectedSize.add(((Map.Entry) next).getKey());
                }
            }
            return map().keySet().retainAll(newHashSetWithExpectedSize);
        }
    }

    public int size() {
        return map().size();
    }
}
