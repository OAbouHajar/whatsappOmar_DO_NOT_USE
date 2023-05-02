package X;

/* renamed from: X.3lW  reason: invalid class name and case insensitive filesystem */
public class C72073lW extends C31301dt {
    public final C34331k5 A00;
    public final String A01;
    public final String A02;

    public C72073lW(C34331k5 r2, String str, String str2) {
        super(AnonymousClass428.A0Y);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C72073lW r5 = (C72073lW) obj;
            if (!this.A01.equals(r5.A01) || !this.A02.equals(r5.A02) || !this.A00.equals(r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
