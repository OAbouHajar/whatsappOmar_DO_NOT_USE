package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.57a  reason: invalid class name and case insensitive filesystem */
public abstract class C1048157a implements Iterator {
    public Collection collection = null;
    public Object key = null;
    public final Iterator keyIterator;
    public final /* synthetic */ C67723cH this$0;
    public Iterator valueIterator = C28021Ua.emptyModifiableIterator();

    public C1048157a(C67723cH r2) {
        this.this$0 = r2;
        this.keyIterator = AnonymousClass000.A0y(r2.map);
    }

    public boolean hasNext() {
        return this.keyIterator.hasNext() || this.valueIterator.hasNext();
    }

    public Object next() {
        if (!this.valueIterator.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(this.keyIterator);
            this.key = A0z.getKey();
            Collection collection2 = (Collection) A0z.getValue();
            this.collection = collection2;
            this.valueIterator = collection2.iterator();
        }
        return output(this.key, this.valueIterator.next());
    }

    public abstract Object output(Object obj, Object obj2);

    public void remove() {
        this.valueIterator.remove();
        if (this.collection.isEmpty()) {
            this.keyIterator.remove();
        }
        C67723cH.access$210(this.this$0);
    }
}
