package X;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.3cC  reason: invalid class name and case insensitive filesystem */
public class C67683cC extends C67723cH<K, V>.WrappedCollection implements List<V> {
    public final /* synthetic */ C67723cH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67683cC(C67723cH r1, Object obj, List list, C105845Bk r4) {
        super(r1, obj, list, r4);
        this.this$0 = r1;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.3cC, X.5Bk] */
    public void add(int i2, Object obj) {
        refreshIfEmpty();
        boolean isEmpty = getDelegate().isEmpty();
        getListDelegate().add(i2, obj);
        C67723cH.access$208(this.this$0);
        if (isEmpty) {
            addToMap();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.3cC, java.util.AbstractCollection, X.5Bk] */
    public boolean addAll(int i2, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = getListDelegate().addAll(i2, collection);
        if (!addAll) {
            return addAll;
        }
        C67723cH.access$212(this.this$0, getDelegate().size() - size);
        if (size != 0) {
            return addAll;
        }
        addToMap();
        return addAll;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3cC, X.5Bk] */
    public Object get(int i2) {
        refreshIfEmpty();
        return getListDelegate().get(i2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3cC, X.5Bk] */
    public List getListDelegate() {
        return (List) getDelegate();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3cC, X.5Bk] */
    public int indexOf(Object obj) {
        refreshIfEmpty();
        return getListDelegate().indexOf(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3cC, X.5Bk] */
    public int lastIndexOf(Object obj) {
        refreshIfEmpty();
        return getListDelegate().lastIndexOf(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3cC, X.5Bk] */
    public ListIterator listIterator() {
        refreshIfEmpty();
        return new C67663cA(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3cC, X.5Bk] */
    public ListIterator listIterator(int i2) {
        refreshIfEmpty();
        return new C67663cA(this, i2);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.3cC, X.5Bk] */
    public Object remove(int i2) {
        refreshIfEmpty();
        Object remove = getListDelegate().remove(i2);
        C67723cH.access$210(this.this$0);
        removeIfEmpty();
        return remove;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3cC, X.5Bk] */
    public Object set(int i2, Object obj) {
        refreshIfEmpty();
        return getListDelegate().set(i2, obj);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.3cC, X.5Bk] */
    public List subList(int i2, int i3) {
        refreshIfEmpty();
        C67723cH r3 = this.this$0;
        Object key = getKey();
        List subList = getListDelegate().subList(i2, i3);
        C105845Bk ancestor = getAncestor();
        if (ancestor == null) {
            ancestor = this;
        }
        return r3.wrapList(key, subList, ancestor);
    }
}
