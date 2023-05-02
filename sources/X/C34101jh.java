package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.1jh  reason: invalid class name and case insensitive filesystem */
public final class C34101jh implements Iterator {
    public int A00 = 0;
    public final int A01;
    public final Object[] A02;

    public C34101jh(Object[] objArr, int i2) {
        this.A02 = objArr;
        this.A01 = i2;
    }

    public boolean hasNext() {
        return this.A00 < this.A02.length;
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            int i2 = this.A00;
            int i3 = this.A01;
            Object[] objArr = this.A02;
            int length = objArr.length;
            int min = Math.min(i2 + i3, length);
            if (length > i3 || i2 != 0) {
                objArr = Arrays.copyOfRange(objArr, i2, min);
            }
            this.A00 += i3;
            return objArr;
        }
        throw new NoSuchElementException("There are no more chunks to provide.");
    }
}
