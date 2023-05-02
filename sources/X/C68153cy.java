package X;

import java.util.Iterator;

/* renamed from: X.3cy  reason: invalid class name and case insensitive filesystem */
public class C68153cy extends C28031Ub {
    public final /* synthetic */ C67813cQ this$0;
    public Iterator valueCollectionItr;
    public Iterator valueItr = C28021Ua.emptyIterator();

    public C68153cy(C67813cQ r2) {
        this.this$0 = r2;
        this.valueCollectionItr = r2.map.values().iterator();
    }

    public boolean hasNext() {
        return this.valueItr.hasNext() || this.valueCollectionItr.hasNext();
    }

    public Object next() {
        if (!this.valueItr.hasNext()) {
            this.valueItr = ((C17390v0) this.valueCollectionItr.next()).iterator();
        }
        return this.valueItr.next();
    }
}
