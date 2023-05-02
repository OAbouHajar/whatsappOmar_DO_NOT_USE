package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.5Bk  reason: invalid class name and case insensitive filesystem */
public class C105845Bk extends AbstractCollection<V> {
    public final C105845Bk ancestor;
    public final Collection ancestorDelegate;
    public Collection delegate;
    public final Object key;
    public final /* synthetic */ C67723cH this$0;

    public C105845Bk(C67723cH r2, Object obj, Collection collection, C105845Bk r5) {
        this.this$0 = r2;
        this.key = obj;
        this.delegate = collection;
        this.ancestor = r5;
        this.ancestorDelegate = r5 == null ? null : r5.getDelegate();
    }

    public boolean add(Object obj) {
        refreshIfEmpty();
        boolean isEmpty = this.delegate.isEmpty();
        boolean add = this.delegate.add(obj);
        if (add) {
            C67723cH.access$208(this.this$0);
            if (isEmpty) {
                addToMap();
            }
        }
        return add;
    }

    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.delegate.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        C67723cH.access$212(this.this$0, this.delegate.size() - size);
        if (size != 0) {
            return addAll;
        }
        addToMap();
        return addAll;
    }

    public void addToMap() {
        C105845Bk r0 = this.ancestor;
        if (r0 != null) {
            r0.addToMap();
        } else {
            this.this$0.map.put(this.key, this.delegate);
        }
    }

    public void clear() {
        int size = size();
        if (size != 0) {
            this.delegate.clear();
            C67723cH.access$220(this.this$0, size);
            removeIfEmpty();
        }
    }

    public boolean contains(Object obj) {
        refreshIfEmpty();
        return this.delegate.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        refreshIfEmpty();
        return this.delegate.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        refreshIfEmpty();
        return this.delegate.equals(obj);
    }

    public C105845Bk getAncestor() {
        return this.ancestor;
    }

    public Collection getDelegate() {
        return this.delegate;
    }

    public Object getKey() {
        return this.key;
    }

    public int hashCode() {
        refreshIfEmpty();
        return this.delegate.hashCode();
    }

    public Iterator iterator() {
        refreshIfEmpty();
        return new C1048457d(this);
    }

    public void refreshIfEmpty() {
        Collection collection;
        C105845Bk r0 = this.ancestor;
        if (r0 != null) {
            r0.refreshIfEmpty();
            if (this.ancestor.getDelegate() != this.ancestorDelegate) {
                throw new ConcurrentModificationException();
            }
        } else if (this.delegate.isEmpty() && (collection = (Collection) this.this$0.map.get(this.key)) != null) {
            this.delegate = collection;
        }
    }

    public boolean remove(Object obj) {
        refreshIfEmpty();
        boolean remove = this.delegate.remove(obj);
        if (remove) {
            C67723cH.access$210(this.this$0);
            removeIfEmpty();
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.delegate.removeAll(collection);
        if (!removeAll) {
            return removeAll;
        }
        C67723cH.access$212(this.this$0, this.delegate.size() - size);
        removeIfEmpty();
        return removeAll;
    }

    public void removeIfEmpty() {
        C105845Bk r0 = this.ancestor;
        if (r0 != null) {
            r0.removeIfEmpty();
        } else if (this.delegate.isEmpty()) {
            this.this$0.map.remove(this.key);
        }
    }

    public boolean retainAll(Collection collection) {
        int size = size();
        boolean retainAll = this.delegate.retainAll(collection);
        if (retainAll) {
            C67723cH.access$212(this.this$0, this.delegate.size() - size);
            removeIfEmpty();
        }
        return retainAll;
    }

    public int size() {
        refreshIfEmpty();
        return this.delegate.size();
    }

    public String toString() {
        refreshIfEmpty();
        return this.delegate.toString();
    }
}
