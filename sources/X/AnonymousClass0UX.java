package X;

/* renamed from: X.0UX  reason: invalid class name */
public class AnonymousClass0UX {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public AnonymousClass0UX(float f2, float f3, float f4, float f5) {
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A00 = f5;
    }

    public AnonymousClass0UX(AnonymousClass0UX r2) {
        this.A01 = r2.A01;
        this.A02 = r2.A02;
        this.A03 = r2.A03;
        this.A00 = r2.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[");
        A0r.append(this.A01);
        A0r.append(" ");
        A0r.append(this.A02);
        A0r.append(" ");
        A0r.append(this.A03);
        A0r.append(" ");
        A0r.append(this.A00);
        return AnonymousClass000.A0h("]", A0r);
    }
}
