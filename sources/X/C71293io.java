package X;

/* renamed from: X.3io  reason: invalid class name and case insensitive filesystem */
public class C71293io extends AnonymousClass45p {
    public final int A00;

    public C71293io(int i2) {
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((C71293io) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(Integer.valueOf(this.A00), C13680ns.A1b());
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("NoParamsStatusMessage{type=");
        A0r.append(this.A00);
        return AnonymousClass000.A0k(A0r);
    }
}
