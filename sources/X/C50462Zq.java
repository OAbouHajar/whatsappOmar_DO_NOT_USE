package X;

/* renamed from: X.2Zq  reason: invalid class name and case insensitive filesystem */
public final class C50462Zq extends C50472Zr {
    public static final long serialVersionUID = 0;
    public final Object reference;

    public C50462Zq(Object obj) {
        this.reference = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C50462Zq) {
            return this.reference.equals(((C50462Zq) obj).reference);
        }
        return false;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.reference);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
