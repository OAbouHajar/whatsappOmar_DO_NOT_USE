package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.57n  reason: invalid class name and case insensitive filesystem */
public final class C1049457n implements ListIterator, C23861Dq {
    public int A00;
    public int A01 = -1;
    public final C52182dH A02;

    public C1049457n(C52182dH r2, int i2) {
        this.A02 = r2;
        this.A00 = i2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.AbstractList, X.2dH] */
    public void add(Object obj) {
        ? r2 = this.A02;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        r2.add(i2, obj);
        this.A01 = -1;
    }

    public boolean hasNext() {
        return AnonymousClass3K3.A1Q(this.A00, this.A02.length);
    }

    public boolean hasPrevious() {
        return AnonymousClass000.A1Q(this.A00);
    }

    public Object next() {
        int i2 = this.A00;
        C52182dH r2 = this.A02;
        if (i2 < r2.length) {
            this.A00 = i2 + 1;
            this.A01 = i2;
            return r2.array[r2.offset + i2];
        }
        throw new NoSuchElementException();
    }

    public int nextIndex() {
        return this.A00;
    }

    public Object previous() {
        int i2 = this.A00;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.A00 = i3;
            this.A01 = i3;
            C52182dH r0 = this.A02;
            return r0.array[r0.offset + i3];
        }
        throw new NoSuchElementException();
    }

    public int previousIndex() {
        return this.A00 - 1;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.AbstractList, X.2dH] */
    public void remove() {
        int i2 = this.A01;
        if (i2 != -1) {
            this.A02.remove(i2);
            this.A00 = this.A01;
            this.A01 = -1;
            return;
        }
        throw AnonymousClass000.A0V("Call next() or previous() before removing element from the iterator.");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.AbstractList, X.2dH] */
    public void set(Object obj) {
        int i2 = this.A01;
        if (i2 != -1) {
            this.A02.set(i2, obj);
            return;
        }
        throw AnonymousClass000.A0V("Call next() or previous() before replacing element from the iterator.");
    }
}
