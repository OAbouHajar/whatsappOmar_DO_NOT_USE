package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.2NC  reason: invalid class name */
public class AnonymousClass2NC implements Iterator {
    public int A00 = 0;
    public final int A01;
    public final /* synthetic */ C28631Ww A02;

    public AnonymousClass2NC(C28631Ww r2) {
        this.A02 = r2;
        this.A01 = r2.A03();
    }

    public boolean hasNext() {
        return this.A00 < this.A01;
    }

    public /* bridge */ /* synthetic */ Object next() {
        try {
            C28631Ww r2 = this.A02;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            return Byte.valueOf(r2.A02(i2));
        } catch (IndexOutOfBoundsException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
