package X;

/* renamed from: X.00S  reason: invalid class name */
public final class AnonymousClass00S extends AnonymousClass00P {
    public final String A00;
    public final String A01;

    public AnonymousClass00S(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass00P)) {
                return false;
            }
            AnonymousClass00S r4 = (AnonymousClass00S) ((AnonymousClass00P) obj);
            if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.A00);
        sb.append(", version=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }
}
