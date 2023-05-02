package X;

import java.util.Comparator;

/* renamed from: X.57I  reason: invalid class name */
public abstract class AnonymousClass57I implements Comparator {
    public static C90794ep A00(C90794ep r2, Object obj, int i2) {
        return r2.compare(obj, Integer.valueOf(i2), natural().reverse());
    }

    public static AnonymousClass57I from(Comparator comparator) {
        return comparator instanceof AnonymousClass57I ? (AnonymousClass57I) comparator : new C68023cl(comparator);
    }

    public static AnonymousClass57I natural() {
        return C68043cn.INSTANCE;
    }

    public abstract int compare(Object obj, Object obj2);

    public AnonymousClass57I reverse() {
        return new C68033cm(this);
    }
}
