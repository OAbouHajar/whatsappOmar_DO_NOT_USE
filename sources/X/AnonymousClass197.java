package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.197  reason: invalid class name */
public class AnonymousClass197<K, V> extends LinkedHashMap<K, V> {
    public int cacheLimit;

    public AnonymousClass197(int i2) {
        super(((int) Math.ceil((double) (((float) i2) / 0.75f))) + 1, 0.75f, true);
        this.cacheLimit = i2;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.cacheLimit;
    }
}
