package X;

import android.util.SparseBooleanArray;

/* renamed from: X.4Sb  reason: invalid class name and case insensitive filesystem */
public class C86294Sb {
    public final SparseBooleanArray A00 = new SparseBooleanArray();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86294Sb)) {
            return false;
        }
        return this.A00.equals(((C86294Sb) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
