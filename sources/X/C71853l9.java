package X;

/* renamed from: X.3l9  reason: invalid class name and case insensitive filesystem */
public class C71853l9 extends AnonymousClass4TO {
    public final String A00;

    public C71853l9(C109185Ra r1, String str, boolean z2) {
        super(r1, z2);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C71853l9 r5 = (C71853l9) obj;
            if (!this.A00.equals(r5.A00) || r5.A01 != this.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
