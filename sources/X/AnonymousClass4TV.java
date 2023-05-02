package X;

/* renamed from: X.4TV  reason: invalid class name */
public class AnonymousClass4TV {
    public final String A00;
    public final String A01;

    public AnonymousClass4TV(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass4TV r4 = (AnonymousClass4TV) obj;
            if (this.A00.equals(r4.A00)) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass3K4.A08(this.A01, AnonymousClass3K4.A07(this.A00));
    }
}
