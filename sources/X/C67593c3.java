package X;

import java.util.Iterator;

/* renamed from: X.3c3  reason: invalid class name and case insensitive filesystem */
public class C67593c3 extends C68163cz {
    public final Iterator itr;
    public final /* synthetic */ C68113cu this$0;

    public C67593c3(C68113cu r2) {
        this.this$0 = r2;
        this.itr = r2.val$set1.iterator();
    }

    public Object computeNext() {
        while (this.itr.hasNext()) {
            Object next = this.itr.next();
            if (this.this$0.val$set2.contains(next)) {
                return next;
            }
        }
        return endOfData();
    }
}
