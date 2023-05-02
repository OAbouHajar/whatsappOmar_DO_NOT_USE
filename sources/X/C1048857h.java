package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.57h  reason: invalid class name and case insensitive filesystem */
public final class C1048857h implements Iterator, C23861Dq {
    public int A00;
    public final Object[] A01;

    public C1048857h(Object[] objArr) {
        this.A01 = objArr;
    }

    public boolean hasNext() {
        return AnonymousClass3K3.A1Q(this.A00, this.A01.length);
    }

    public Object next() {
        try {
            Object[] objArr = this.A01;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.A00--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
