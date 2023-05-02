package X;

/* renamed from: X.3cY  reason: invalid class name and case insensitive filesystem */
public final class C67893cY<K> extends C17380uz<K> {
    public final transient C34641kb list;
    public final transient C17930vs map;

    public C67893cY(C17930vs r1, C34641kb r2) {
        this.map = r1;
        this.list = r2;
    }

    public C34641kb asList() {
        return this.list;
    }

    public boolean contains(Object obj) {
        return AnonymousClass000.A1V(this.map.get(obj));
    }

    public int copyIntoArray(Object[] objArr, int i2) {
        return asList().copyIntoArray(objArr, i2);
    }

    public boolean isPartialView() {
        return true;
    }

    public C28031Ub iterator() {
        return asList().iterator();
    }

    public int size() {
        return this.map.size();
    }
}
