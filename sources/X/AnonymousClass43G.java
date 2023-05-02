package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.43G  reason: invalid class name */
public enum AnonymousClass43G implements Iterator {
    INSTANCE;

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public void remove() {
        C29011Zs.checkRemove(false);
    }
}
