package X;

/* renamed from: X.4V7  reason: invalid class name */
public class AnonymousClass4V7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.A05;
        String str2 = ((AnonymousClass4V7) obj).A05;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A05, C13680ns.A1b());
    }
}
