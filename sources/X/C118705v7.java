package X;

/* renamed from: X.5v7  reason: invalid class name and case insensitive filesystem */
public class C118705v7 {
    public final String A00;
    public final boolean A01;

    public C118705v7(String str, boolean z2) {
        this.A00 = str;
        this.A01 = z2;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C118705v7 r5 = (C118705v7) obj;
            String str = r5.A00;
            String str2 = this.A00;
            return (str == str2 || (str != null && str.equals(str2))) && r5.A01 == this.A01;
        }
    }

    public final int hashCode() {
        String str = this.A00;
        return ((589 + (str == null ? 0 : str.hashCode())) * 31) + (this.A01 ? 1 : 0);
    }
}
