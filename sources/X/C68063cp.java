package X;

import java.util.Map;

/* renamed from: X.3cp  reason: invalid class name and case insensitive filesystem */
public class C68063cp<K, V> extends C105945Bv<K> {
    public final Map map;

    public C68063cp(Map map2) {
        this.map = map2;
    }

    public boolean contains(Object obj) {
        return map().containsKey(obj);
    }

    public boolean isEmpty() {
        return map().isEmpty();
    }

    public Map map() {
        return this.map;
    }

    public int size() {
        return map().size();
    }
}
