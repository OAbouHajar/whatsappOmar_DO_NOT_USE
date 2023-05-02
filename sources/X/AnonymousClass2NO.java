package X;

import java.util.NoSuchElementException;

/* renamed from: X.2NO  reason: invalid class name */
public abstract class AnonymousClass2NO extends AnonymousClass2NP {
    public int position;
    public final int size;

    public AnonymousClass2NO(int i2, int i3) {
        C29031Zu.A02(i3, i2);
        this.size = i2;
        this.position = i3;
    }

    public abstract Object get(int i2);

    public final boolean hasNext() {
        return this.position < this.size;
    }

    public final boolean hasPrevious() {
        return this.position > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i2 = this.position;
            this.position = i2 + 1;
            return get(i2);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.position;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i2 = this.position - 1;
            this.position = i2;
            return get(i2);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.position - 1;
    }
}
