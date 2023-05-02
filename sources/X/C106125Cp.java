package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.5Cp  reason: invalid class name and case insensitive filesystem */
public final class C106125Cp extends AnonymousClass4WC implements Iterator, C23861Dq {
    public C106125Cp(AnonymousClass28m r1) {
        super(r1);
    }

    public /* bridge */ /* synthetic */ Object next() {
        int i2 = this.A00;
        AnonymousClass28m r1 = this.A02;
        if (i2 < r1.length) {
            this.A00 = i2 + 1;
            this.A01 = i2;
            C1049657p r0 = new C1049657p(r1, i2);
            A00();
            return r0;
        }
        throw new NoSuchElementException();
    }
}
