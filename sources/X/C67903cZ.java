package X;

/* renamed from: X.3cZ  reason: invalid class name and case insensitive filesystem */
public final class C67903cZ<E> extends C17380uz<E> {
    public final transient Object element;

    public C67903cZ(Object obj) {
        this.element = obj;
    }

    public C34641kb asList() {
        return C34641kb.of(this.element);
    }

    public boolean contains(Object obj) {
        return this.element.equals(obj);
    }

    public int copyIntoArray(Object[] objArr, int i2) {
        objArr[i2] = this.element;
        return i2 + 1;
    }

    public final int hashCode() {
        return this.element.hashCode();
    }

    public boolean isPartialView() {
        return false;
    }

    public C28031Ub iterator() {
        return C28021Ua.singletonIterator(this.element);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        String obj = this.element.toString();
        StringBuilder A0g = C13690nt.A0g(C13680ns.A06(obj) + 2);
        A0g.append('[');
        A0g.append(obj);
        return AnonymousClass3K2.A0m(A0g);
    }
}
