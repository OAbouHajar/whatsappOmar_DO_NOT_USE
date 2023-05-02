package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.2dL  reason: invalid class name and case insensitive filesystem */
public final class C52222dL implements Iterator, C23861Dq {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;

    public C52222dL(int i2, int i3, int i4) {
        this.A03 = i4;
        this.A02 = i3;
        boolean z2 = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z2 = false;
        }
        this.A01 = z2;
        this.A00 = !z2 ? i3 : i2;
    }

    public int A00() {
        int i2 = this.A00;
        if (i2 != this.A02) {
            this.A00 = this.A03 + i2;
            return i2;
        } else if (this.A01) {
            this.A01 = false;
            return i2;
        } else {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(A00());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
