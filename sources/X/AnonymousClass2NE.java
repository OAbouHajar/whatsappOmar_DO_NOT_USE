package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2NE  reason: invalid class name */
public final class AnonymousClass2NE<E> extends AnonymousClass1XF<E> {
    public static final AnonymousClass2NE A01;
    public final List A00;

    static {
        AnonymousClass2NE r1 = new AnonymousClass2NE(new ArrayList(10));
        A01 = r1;
        r1.A00 = false;
    }

    public AnonymousClass2NE(List list) {
        this.A00 = list;
    }

    public /* bridge */ /* synthetic */ AnonymousClass1XE ALe(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.A00);
            return new AnonymousClass2NE(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public void add(int i2, Object obj) {
        A00();
        this.A00.add(i2, obj);
        this.modCount++;
    }

    public Object get(int i2) {
        return this.A00.get(i2);
    }

    public Object remove(int i2) {
        A00();
        Object remove = this.A00.remove(i2);
        this.modCount++;
        return remove;
    }

    public Object set(int i2, Object obj) {
        A00();
        Object obj2 = this.A00.set(i2, obj);
        this.modCount++;
        return obj2;
    }

    public int size() {
        return this.A00.size();
    }
}
