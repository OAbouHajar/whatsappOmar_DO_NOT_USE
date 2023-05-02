package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3ce  reason: invalid class name and case insensitive filesystem */
public class C67953ce extends C68063cp<K, Collection<V>> {
    public final /* synthetic */ C67723cH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67953ce(C67723cH r1, Map map) {
        super(map);
        this.this$0 = r1;
    }

    public void clear() {
        C28021Ua.clear(iterator());
    }

    public boolean containsAll(Collection collection) {
        return map().keySet().containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this == obj || map().keySet().equals(obj);
    }

    public int hashCode() {
        return map().keySet().hashCode();
    }

    public Iterator iterator() {
        return new AnonymousClass57W(this, AnonymousClass000.A0y(map()));
    }

    public boolean remove(Object obj) {
        Collection collection = (Collection) map().remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        C67723cH.access$220(this.this$0, size);
        return size > 0;
    }
}
