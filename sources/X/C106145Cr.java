package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.5Cr  reason: invalid class name and case insensitive filesystem */
public final class C106145Cr extends AnonymousClass4WC implements Iterator, C23861Dq {
    public C106145Cr(AnonymousClass28m r1) {
        super(r1);
    }

    public Object next() {
        int i2 = this.A00;
        AnonymousClass28m r1 = this.A02;
        if (i2 < r1.length) {
            this.A00 = i2 + 1;
            this.A01 = i2;
            Object[] objArr = r1.valuesArray;
            C18450wi.A0F(objArr);
            Object obj = objArr[this.A01];
            A00();
            return obj;
        }
        throw new NoSuchElementException();
    }
}
