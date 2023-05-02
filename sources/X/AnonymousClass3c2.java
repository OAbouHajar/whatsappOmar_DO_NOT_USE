package X;

import java.util.Iterator;

/* renamed from: X.3c2  reason: invalid class name */
public class AnonymousClass3c2 extends C68163cz {
    public final /* synthetic */ AnonymousClass5OH val$retainIfTrue;
    public final /* synthetic */ Iterator val$unfiltered;

    public AnonymousClass3c2(Iterator it, AnonymousClass5OH r2) {
        this.val$unfiltered = it;
        this.val$retainIfTrue = r2;
    }

    public Object computeNext() {
        while (this.val$unfiltered.hasNext()) {
            Object next = this.val$unfiltered.next();
            if (this.val$retainIfTrue.A55(next)) {
                return next;
            }
        }
        return endOfData();
    }
}
