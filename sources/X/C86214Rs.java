package X;

/* renamed from: X.4Rs  reason: invalid class name and case insensitive filesystem */
public class C86214Rs {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C005602k A04;
    public C005602k A05;

    public C86214Rs(C005602k r1, C005602k r2, int i2, int i3, int i4, int i5) {
        this.A05 = r1;
        this.A04 = r2;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ChangeInfo{oldHolder=");
        A0r.append(this.A05);
        A0r.append(", newHolder=");
        A0r.append(this.A04);
        A0r.append(", fromX=");
        A0r.append(this.A00);
        A0r.append(", fromY=");
        A0r.append(this.A01);
        A0r.append(", toX=");
        A0r.append(this.A02);
        A0r.append(", toY=");
        A0r.append(this.A03);
        return AnonymousClass000.A0k(A0r);
    }
}
