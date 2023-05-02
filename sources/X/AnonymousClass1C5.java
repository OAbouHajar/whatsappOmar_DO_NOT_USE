package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1C5  reason: invalid class name */
public class AnonymousClass1C5 {
    public Object[] alternatingKeysAndValues;
    public boolean entriesUsed;
    public int size;

    public AnonymousClass1C5() {
        this(4);
    }

    public AnonymousClass1C5(int i2) {
        this.alternatingKeysAndValues = new Object[(i2 << 1)];
        this.size = 0;
        this.entriesUsed = false;
    }

    private void ensureCapacity(int i2) {
        int i3 = i2 << 1;
        Object[] objArr = this.alternatingKeysAndValues;
        int length = objArr.length;
        if (i3 > length) {
            this.alternatingKeysAndValues = Arrays.copyOf(objArr, C18410we.expandedCapacity(length, i3));
            this.entriesUsed = false;
        }
    }

    public C17930vs build() {
        return buildOrThrow();
    }

    public C17930vs buildOrThrow() {
        this.entriesUsed = true;
        return C29021Zt.create(this.size, this.alternatingKeysAndValues);
    }

    public AnonymousClass1C5 put(Object obj, Object obj2) {
        ensureCapacity(this.size + 1);
        C29011Zs.checkEntryNotNull(obj, obj2);
        Object[] objArr = this.alternatingKeysAndValues;
        int i2 = this.size;
        int i3 = i2 << 1;
        objArr[i3] = obj;
        objArr[i3 + 1] = obj2;
        this.size = i2 + 1;
        return this;
    }

    public AnonymousClass1C5 put(Map.Entry entry) {
        put(entry.getKey(), entry.getValue());
        return this;
    }

    public AnonymousClass1C5 putAll(Iterable iterable) {
        if (iterable instanceof Collection) {
            ensureCapacity(this.size + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            put((Map.Entry) it.next());
        }
        return this;
    }

    public AnonymousClass1C5 putAll(Map map) {
        putAll((Iterable) map.entrySet());
        return this;
    }
}
