package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.5Bg  reason: invalid class name and case insensitive filesystem */
public class C105805Bg extends AbstractCollection<V> {
    public final /* synthetic */ C99064tQ this$0;

    public C105805Bg(C99064tQ r1) {
        this.this$0 = r1;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean contains(Object obj) {
        return this.this$0.containsValue(obj);
    }

    public Iterator iterator() {
        return this.this$0.valueIterator();
    }

    public int size() {
        return this.this$0.size();
    }
}
