package X;

import java.io.Serializable;

/* renamed from: X.1nf  reason: invalid class name and case insensitive filesystem */
public abstract class C36511nf implements Serializable {
    public static final long serialVersionUID = 0;

    public Object A00() {
        if (this instanceof C36521ng) {
            return ((C36521ng) this).reference;
        }
        throw new IllegalStateException("value is absent");
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();
}
