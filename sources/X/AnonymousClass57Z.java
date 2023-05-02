package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.57Z  reason: invalid class name */
public class AnonymousClass57Z implements Iterator {
    public Collection collection;
    public final Iterator delegateIterator;
    public final /* synthetic */ C67963cf this$1;

    public AnonymousClass57Z(C67963cf r2) {
        this.this$1 = r2;
        this.delegateIterator = AnonymousClass000.A0y(r2.submap);
    }

    public boolean hasNext() {
        return this.delegateIterator.hasNext();
    }

    public Map.Entry next() {
        Map.Entry A0z = AnonymousClass000.A0z(this.delegateIterator);
        this.collection = (Collection) A0z.getValue();
        return this.this$1.wrapEntry(A0z);
    }

    public void remove() {
        C29031Zu.A04("no calls to next() since the last call to remove()", AnonymousClass000.A1V(this.collection));
        this.delegateIterator.remove();
        C67723cH.access$220(this.this$1.this$0, this.collection.size());
        this.collection.clear();
        this.collection = null;
    }
}
