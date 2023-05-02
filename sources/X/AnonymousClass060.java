package X;

import java.util.Map;

/* renamed from: X.060  reason: invalid class name */
public class AnonymousClass060 implements Map.Entry {
    public AnonymousClass060 A00;
    public AnonymousClass060 A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass060(Object obj, Object obj2) {
        this.A02 = obj;
        this.A03 = obj2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass060)) {
            return false;
        }
        AnonymousClass060 r4 = (AnonymousClass060) obj;
        return this.A02.equals(r4.A02) && this.A03.equals(r4.A03);
    }

    public Object getKey() {
        return this.A02;
    }

    public Object getValue() {
        return this.A03;
    }

    public int hashCode() {
        return this.A02.hashCode() ^ this.A03.hashCode();
    }

    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02);
        sb.append("=");
        sb.append(this.A03);
        return sb.toString();
    }
}
