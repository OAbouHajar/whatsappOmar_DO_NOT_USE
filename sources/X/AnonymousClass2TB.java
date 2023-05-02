package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.2TB  reason: invalid class name */
public class AnonymousClass2TB extends C28031Ub {
    public int index = 0;
    public final /* synthetic */ Iterator[] val$elements;

    public AnonymousClass2TB(Iterator[] itArr) {
        this.val$elements = itArr;
    }

    public boolean hasNext() {
        return this.index < this.val$elements.length;
    }

    public Iterator next() {
        if (hasNext()) {
            Iterator[] itArr = this.val$elements;
            int i2 = this.index;
            Iterator it = itArr[i2];
            itArr[i2] = null;
            this.index = i2 + 1;
            return it;
        }
        throw new NoSuchElementException();
    }
}
