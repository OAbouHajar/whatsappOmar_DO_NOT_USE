package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.05F  reason: invalid class name */
public final class AnonymousClass05F implements Iterator {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final int A03;
    public final /* synthetic */ AnonymousClass05D A04;

    public AnonymousClass05F(AnonymousClass05D r2, int i2) {
        this.A04 = r2;
        this.A03 = i2;
        this.A01 = r2.A01();
    }

    public boolean hasNext() {
        return this.A00 < this.A01;
    }

    public Object next() {
        if (hasNext()) {
            AnonymousClass05D r1 = this.A04;
            int i2 = this.A00;
            Object A032 = r1.A03(i2, this.A03);
            this.A00 = i2 + 1;
            this.A02 = true;
            return A032;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (this.A02) {
            int i2 = this.A00 - 1;
            this.A00 = i2;
            this.A01--;
            this.A02 = false;
            this.A04.A07(i2);
            return;
        }
        throw new IllegalStateException();
    }
}
