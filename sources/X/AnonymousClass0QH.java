package X;

/* renamed from: X.0QH  reason: invalid class name */
public class AnonymousClass0QH {
    public final Object A00;
    public final String A01;

    public AnonymousClass0QH(Object obj, String str) {
        this.A00 = obj;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[");
        A0r.append(this.A01);
        A0r.append(", ");
        A0r.append(AnonymousClass0XL.A04(this.A00.getClass()));
        return AnonymousClass000.A0h("]", A0r);
    }
}
