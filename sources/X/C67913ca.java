package X;

import java.util.Map;

/* renamed from: X.3ca  reason: invalid class name and case insensitive filesystem */
public class C67913ca<K, V> extends C17380uz<Map.Entry<K, V>> {
    public final transient Object[] alternatingKeysAndValues;
    public final transient C17930vs map;
    public final transient int size;

    public C67913ca(C17930vs r2, Object[] objArr, int i2, int i3) {
        this.map = r2;
        this.alternatingKeysAndValues = objArr;
        this.size = i3;
    }

    public static /* synthetic */ int access$200(C67913ca r0) {
        return 0;
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.map.get(key));
    }

    public int copyIntoArray(Object[] objArr, int i2) {
        return asList().copyIntoArray(objArr, i2);
    }

    public C34641kb createAsList() {
        return new C67783cN(this);
    }

    public boolean isPartialView() {
        return true;
    }

    public C28031Ub iterator() {
        return asList().iterator();
    }

    public int size() {
        return this.size;
    }
}
