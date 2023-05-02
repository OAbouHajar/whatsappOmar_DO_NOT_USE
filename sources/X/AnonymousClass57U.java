package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.57U  reason: invalid class name */
public final class AnonymousClass57U implements Iterator {
    public int A00 = 0;
    public final int A01;
    public final /* synthetic */ AnonymousClass556 A02;

    public AnonymousClass57U(AnonymousClass556 r2) {
        this.A02 = r2;
        this.A01 = r2.A02();
    }

    public final boolean hasNext() {
        return AnonymousClass3K3.A1Q(this.A00, this.A01);
    }

    public final /* synthetic */ Object next() {
        try {
            AnonymousClass556 r2 = this.A02;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            return Byte.valueOf(r2.A01(i2));
        } catch (IndexOutOfBoundsException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public final void remove() {
        throw C13680ns.A0m();
    }
}
