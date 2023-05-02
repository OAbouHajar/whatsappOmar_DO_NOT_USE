package X;

/* renamed from: X.2Dy  reason: invalid class name */
public class AnonymousClass2Dy {
    public final long A00;

    public AnonymousClass2Dy(long j2) {
        this.A00 = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((AnonymousClass2Dy) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return Long.valueOf(this.A00).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Timestamp{timeInMillis=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
