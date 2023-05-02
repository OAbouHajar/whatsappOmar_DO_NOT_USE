package X;

/* renamed from: X.1ng  reason: invalid class name and case insensitive filesystem */
public final class C36521ng extends C36511nf {
    public static final long serialVersionUID = 0;
    public final Object reference;

    public C36521ng(Object obj) {
        this.reference = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C36521ng) {
            return this.reference.equals(((C36521ng) obj).reference);
        }
        return false;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Optional.of(");
        sb.append(this.reference);
        sb.append(")");
        return sb.toString();
    }
}
