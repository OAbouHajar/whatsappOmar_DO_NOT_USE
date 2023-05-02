package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.57T  reason: invalid class name */
public class AnonymousClass57T implements Iterator {
    public int A00 = 0;
    public final Object[] A01;

    public AnonymousClass57T(Object[] objArr) {
        this.A01 = objArr;
    }

    public boolean hasNext() {
        return AnonymousClass3K3.A1Q(this.A00, this.A01.length);
    }

    public Object next() {
        int i2 = this.A00;
        Object[] objArr = this.A01;
        if (i2 != objArr.length) {
            this.A00 = i2 + 1;
            return objArr[i2];
        }
        throw new NoSuchElementException(C13680ns.A0c(i2, "Out of elements: "));
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }
}
