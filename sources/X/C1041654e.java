package X;

import java.io.Serializable;

/* renamed from: X.54e  reason: invalid class name and case insensitive filesystem */
public class C1041654e implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] elements;

    public C1041654e(Object[] objArr) {
        this.elements = objArr;
    }

    public Object readResolve() {
        return C17380uz.copyOf(this.elements);
    }
}
