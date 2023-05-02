package X;

/* renamed from: X.4TW  reason: invalid class name */
public class AnonymousClass4TW {
    public String A00;
    public String A01;

    public AnonymousClass4TW(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4TW r5 = (AnonymousClass4TW) obj;
            if (!this.A00.equals(r5.A00) || !C34901l3.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A00;
        return AnonymousClass3K2.A08(this.A01, A1Z);
    }
}
