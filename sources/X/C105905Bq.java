package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.5Bq  reason: invalid class name and case insensitive filesystem */
public final class C105905Bq extends AbstractList<String> implements C110005Uq, RandomAccess {
    public final C110005Uq A00;

    public C105905Bq(C110005Uq r1) {
        this.A00 = r1;
    }

    public final void Aip(AnonymousClass557 r2) {
        throw C13680ns.A0m();
    }

    public final Object Aj6(int i2) {
        return this.A00.Aj6(i2);
    }

    public final List AjH() {
        return this.A00.AjH();
    }

    public final C110005Uq AjJ() {
        return this;
    }

    public final /* synthetic */ Object get(int i2) {
        return this.A00.get(i2);
    }

    public final Iterator iterator() {
        return new AnonymousClass57S(this);
    }

    public final ListIterator listIterator(int i2) {
        return new C1049357m(this, i2);
    }

    public final int size() {
        return this.A00.size();
    }
}
