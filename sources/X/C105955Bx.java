package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5Bx  reason: invalid class name and case insensitive filesystem */
public class C105955Bx extends AbstractSet<K> {
    public final /* synthetic */ C105935Bu this$0;

    public C105955Bx(C105935Bu r1) {
        this.this$0 = r1;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean contains(Object obj) {
        return this.this$0.containsKey(obj);
    }

    public Iterator iterator() {
        return this.this$0.keySetIterator();
    }

    public boolean remove(Object obj) {
        C105935Bu r1 = this.this$0;
        Map delegateOrNull = r1.delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.keySet().remove(obj) : C13680ns.A1a(r1.removeHelper(obj), C105935Bu.NOT_FOUND);
    }

    public int size() {
        return this.this$0.size();
    }
}
