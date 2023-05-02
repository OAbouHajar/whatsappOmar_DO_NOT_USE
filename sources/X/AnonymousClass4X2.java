package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4X2  reason: invalid class name */
public class AnonymousClass4X2 {
    public final Map builderMap = C90254dq.preservesInsertionOrderOnPutsMap();

    public C67813cQ build() {
        return C67853cU.fromMapEntries(this.builderMap.entrySet(), (Comparator) null);
    }

    public Collection newMutableValueCollection() {
        return AnonymousClass000.A0u();
    }

    public AnonymousClass4X2 put(Object obj, Object obj2) {
        C29011Zs.checkEntryNotNull(obj, obj2);
        Collection collection = (Collection) this.builderMap.get(obj);
        if (collection == null) {
            Map map = this.builderMap;
            collection = newMutableValueCollection();
            map.put(obj, collection);
        }
        collection.add(obj2);
        return this;
    }

    public AnonymousClass4X2 putAll(Object obj, Iterable iterable) {
        if (obj == null) {
            throw AnonymousClass000.A0W(C13680ns.A0g(String.valueOf(C90804eq.toString(iterable)), "null key in entry: null="));
        }
        Collection collection = (Collection) this.builderMap.get(obj);
        Iterator it = iterable.iterator();
        if (collection != null) {
            while (it.hasNext()) {
                Object next = it.next();
                C29011Zs.checkEntryNotNull(obj, next);
                collection.add(next);
            }
        } else if (it.hasNext()) {
            Collection newMutableValueCollection = newMutableValueCollection();
            while (it.hasNext()) {
                Object next2 = it.next();
                C29011Zs.checkEntryNotNull(obj, next2);
                newMutableValueCollection.add(next2);
            }
            this.builderMap.put(obj, newMutableValueCollection);
            return this;
        }
        return this;
    }

    public AnonymousClass4X2 putAll(Object obj, Object... objArr) {
        putAll(obj, (Iterable) Arrays.asList(objArr));
        return this;
    }
}
