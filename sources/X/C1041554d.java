package X;

import java.io.Serializable;

/* renamed from: X.54d  reason: invalid class name and case insensitive filesystem */
public class C1041554d implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] elements;

    public C1041554d(Object[] objArr) {
        this.elements = objArr;
    }

    public Object readResolve() {
        return C34641kb.copyOf(this.elements);
    }
}
