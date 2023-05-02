package X;

/* renamed from: X.1nO  reason: invalid class name and case insensitive filesystem */
public class C36341nO {
    public final C36251nF A00;

    public C36341nO(C36251nF r1) {
        this.A00 = r1;
    }

    public C36341nO(byte[] bArr) {
        this.A00 = C36241nE.A00(bArr);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C36341nO)) {
            return false;
        }
        return this.A00.equals(((C36341nO) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
