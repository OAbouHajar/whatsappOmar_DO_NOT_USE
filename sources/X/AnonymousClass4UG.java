package X;

/* renamed from: X.4UG  reason: invalid class name */
public class AnonymousClass4UG {
    public final int A00;
    public final int A01;
    public final String A02;

    public AnonymousClass4UG(int i2, String str, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4UG r5 = (AnonymousClass4UG) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02.equals(r5.A02))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1K(objArr, this.A00);
        AnonymousClass000.A1L(objArr, this.A01);
        return AnonymousClass000.A0F(this.A02, objArr, 2);
    }
}
