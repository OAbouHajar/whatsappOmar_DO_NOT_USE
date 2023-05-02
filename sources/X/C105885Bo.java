package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.5Bo  reason: invalid class name and case insensitive filesystem */
public final class C105885Bo extends AbstractList<String> implements C109995Up, RandomAccess {
    public final C109995Up A00;

    public C105885Bo(C109995Up r1) {
        this.A00 = r1;
    }

    public final Object AFN(int i2) {
        return this.A00.AFN(i2);
    }

    public final List AjC() {
        return this.A00.AjC();
    }

    public final C109995Up AjD() {
        return this;
    }

    public final /* synthetic */ Object get(int i2) {
        return this.A00.get(i2);
    }

    public final Iterator iterator() {
        return new AnonymousClass57Q(this);
    }

    public final ListIterator listIterator(int i2) {
        return new C1049257l(this, i2);
    }

    public final int size() {
        return this.A00.size();
    }
}
