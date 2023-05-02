package X;

import java.util.Collection;
import java.util.Comparator;

/* renamed from: X.3cT  reason: invalid class name and case insensitive filesystem */
public final class C67843cT extends AnonymousClass4X2 {
    public C67863cV build() {
        return C67863cV.fromMapEntries(this.builderMap.entrySet(), (Comparator) null);
    }

    public Collection newMutableValueCollection() {
        return C90254dq.preservesInsertionOrderOnAddsSet();
    }

    public C67843cT put(Object obj, Object obj2) {
        super.put(obj, obj2);
        return this;
    }

    public C67843cT putAll(Object obj, Iterable iterable) {
        super.putAll(obj, iterable);
        return this;
    }
}
