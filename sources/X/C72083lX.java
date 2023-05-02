package X;

/* renamed from: X.3lX  reason: invalid class name and case insensitive filesystem */
public class C72083lX extends C31301dt {
    public final int A00;
    public final C29141a6 A01;
    public final String A02;

    public C72083lX(C29141a6 r2, String str, int i2) {
        super(AnonymousClass428.A0Z);
        this.A02 = str;
        this.A00 = i2;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C72083lX r5 = (C72083lX) obj;
            if (!this.A02.equals(r5.A02) || this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A02.hashCode();
    }
}
