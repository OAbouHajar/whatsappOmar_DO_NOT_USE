package X;

/* renamed from: X.0e9  reason: invalid class name and case insensitive filesystem */
public class C08700e9 implements C12740kt {
    public String A00;
    public boolean A01;

    public C08700e9(String str, boolean z2) {
        this.A01 = z2;
        this.A00 = str;
    }

    public boolean ALM(C04000Ks r7, AnonymousClass0IL r8) {
        String A002 = (!this.A01 || this.A00 != null) ? this.A00 : r8.A00();
        C13170la r0 = r8.A00;
        if (r0 != null) {
            int i2 = 0;
            for (AnonymousClass0PV r02 : r0.AAc()) {
                if (A002 == null || r02.A00().equals(A002)) {
                    i2++;
                }
            }
            return i2 == 1;
        }
    }

    public String toString() {
        Object[] objArr;
        String str;
        if (this.A01) {
            objArr = new Object[]{this.A00};
            str = "only-of-type <%s>";
        } else {
            objArr = new Object[0];
            str = "only-child";
        }
        return String.format(str, objArr);
    }
}
