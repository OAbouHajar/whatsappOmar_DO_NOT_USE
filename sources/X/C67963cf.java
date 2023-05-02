package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3cf  reason: invalid class name and case insensitive filesystem */
public class C67963cf extends AnonymousClass5Bt<K, Collection<V>> {
    public final transient Map submap;
    public final /* synthetic */ C67723cH this$0;

    public C67963cf(C67723cH r1, Map map) {
        this.this$0 = r1;
        this.submap = map;
    }

    public void clear() {
        Map map = this.submap;
        C67723cH r1 = this.this$0;
        if (map == r1.map) {
            r1.clear();
        } else {
            C28021Ua.clear(new AnonymousClass57Z(this));
        }
    }

    public boolean containsKey(Object obj) {
        return C90814er.safeContainsKey(this.submap, obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3cs, java.util.Set] */
    public Set createEntrySet() {
        return new C68093cs(this);
    }

    public boolean equals(Object obj) {
        return this == obj || this.submap.equals(obj);
    }

    public Collection get(Object obj) {
        Collection collection = (Collection) C90814er.safeGet(this.submap, obj);
        if (collection == null) {
            return null;
        }
        return this.this$0.wrapCollection(obj, collection);
    }

    public int hashCode() {
        return this.submap.hashCode();
    }

    public Set keySet() {
        return this.this$0.keySet();
    }

    public Collection remove(Object obj) {
        Collection collection = (Collection) this.submap.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection createCollection = this.this$0.createCollection();
        createCollection.addAll(collection);
        C67723cH.access$220(this.this$0, collection.size());
        collection.clear();
        return createCollection;
    }

    public int size() {
        return this.submap.size();
    }

    public String toString() {
        return this.submap.toString();
    }

    public Map.Entry wrapEntry(Map.Entry entry) {
        Object key = entry.getKey();
        return C90814er.immutableEntry(key, this.this$0.wrapCollection(key, (Collection) entry.getValue()));
    }
}
