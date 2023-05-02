package X;

/* renamed from: X.1nW  reason: invalid class name and case insensitive filesystem */
public class C36421nW {
    public final int A00;
    public final String A01;

    public C36421nW(String str, int i2) {
        this.A01 = str;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C36421nW)) {
            return false;
        }
        C36421nW r4 = (C36421nW) obj;
        return this.A01.equals(r4.A01) && this.A00 == r4.A00;
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(":");
        sb.append(this.A00);
        return sb.toString();
    }
}
