package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Z3  reason: invalid class name */
public final class AnonymousClass3Z3<E> extends C105875Bn<E> {
    public static final AnonymousClass3Z3 A01;
    public final List A00;

    static {
        AnonymousClass3Z3 r1 = new AnonymousClass3Z3(C13690nt.A0i(10));
        A01 = r1;
        r1.A00 = false;
    }

    public AnonymousClass3Z3(List list) {
        this.A00 = list;
    }

    public final /* synthetic */ C110015Ur AjM(int i2) {
        if (i2 >= size()) {
            ArrayList A0i = C13690nt.A0i(i2);
            A0i.addAll(this.A00);
            return new AnonymousClass3Z3(A0i);
        }
        throw AnonymousClass3K3.A0f();
    }

    public final void add(int i2, Object obj) {
        A02();
        this.A00.add(i2, obj);
        this.modCount++;
    }

    public final Object get(int i2) {
        return this.A00.get(i2);
    }

    public final Object remove(int i2) {
        A02();
        Object remove = this.A00.remove(i2);
        this.modCount++;
        return remove;
    }

    public final Object set(int i2, Object obj) {
        A02();
        Object obj2 = this.A00.set(i2, obj);
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.A00.size();
    }
}
