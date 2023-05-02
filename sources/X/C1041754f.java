package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.54f  reason: invalid class name and case insensitive filesystem */
public class C1041754f implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator comparator;
    public final Object[] elements;

    public C1041754f(Comparator comparator2, Object[] objArr) {
        this.comparator = comparator2;
        this.elements = objArr;
    }

    public Object readResolve() {
        C67873cW r1 = new C67873cW(this.comparator);
        r1.add(this.elements);
        return r1.build();
    }
}
