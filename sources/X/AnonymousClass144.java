package X;

/* renamed from: X.144  reason: invalid class name */
public class AnonymousClass144 {
    public final String A00;

    public AnonymousClass144(String str) {
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass144)) {
            return false;
        }
        return this.A00.equals(((AnonymousClass144) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00;
    }
}
