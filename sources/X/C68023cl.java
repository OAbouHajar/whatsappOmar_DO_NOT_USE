package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.3cl  reason: invalid class name and case insensitive filesystem */
public final class C68023cl extends AnonymousClass57I implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator comparator;

    public C68023cl(Comparator comparator2) {
        this.comparator = comparator2;
    }

    public int compare(Object obj, Object obj2) {
        return this.comparator.compare(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C68023cl) {
            return this.comparator.equals(((C68023cl) obj).comparator);
        }
        return false;
    }

    public int hashCode() {
        return this.comparator.hashCode();
    }

    public String toString() {
        return this.comparator.toString();
    }
}
