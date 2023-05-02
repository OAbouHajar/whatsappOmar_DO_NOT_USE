package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.57W  reason: invalid class name */
public class AnonymousClass57W implements Iterator {
    public Map.Entry entry;
    public final /* synthetic */ C67953ce this$1;
    public final /* synthetic */ Iterator val$entryIterator;

    public AnonymousClass57W(C67953ce r1, Iterator it) {
        this.this$1 = r1;
        this.val$entryIterator = it;
    }

    public boolean hasNext() {
        return this.val$entryIterator.hasNext();
    }

    public Object next() {
        Map.Entry A0z = AnonymousClass000.A0z(this.val$entryIterator);
        this.entry = A0z;
        return A0z.getKey();
    }

    public void remove() {
        C29031Zu.A04("no calls to next() since the last call to remove()", AnonymousClass000.A1V(this.entry));
        Collection collection = (Collection) this.entry.getValue();
        this.val$entryIterator.remove();
        C67723cH.access$220(this.this$1.this$0, collection.size());
        collection.clear();
        this.entry = null;
    }
}
