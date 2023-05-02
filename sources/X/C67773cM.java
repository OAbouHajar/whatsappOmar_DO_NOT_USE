package X;

/* renamed from: X.3cM  reason: invalid class name and case insensitive filesystem */
public final class C67773cM<K, V> extends C17390v0<V> {
    public static final long serialVersionUID = 0;
    public final transient C67813cQ multimap;

    public C67773cM(C67813cQ r1) {
        this.multimap = r1;
    }

    public boolean contains(Object obj) {
        return this.multimap.containsValue(obj);
    }

    public int copyIntoArray(Object[] objArr, int i2) {
        C28031Ub it = this.multimap.map.values().iterator();
        while (it.hasNext()) {
            i2 = ((C17390v0) it.next()).copyIntoArray(objArr, i2);
        }
        return i2;
    }

    public boolean isPartialView() {
        return true;
    }

    public C28031Ub iterator() {
        return this.multimap.valueIterator();
    }

    public int size() {
        return this.multimap.size();
    }
}
