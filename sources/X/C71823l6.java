package X;

/* renamed from: X.3l6  reason: invalid class name and case insensitive filesystem */
public class C71823l6 extends C86344Sg {
    public final int A00;
    public final C108645Ou A01;

    public C71823l6(C108645Ou r1, Integer num, int i2) {
        super(num);
        this.A00 = i2;
        this.A01 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            C71823l6 r5 = (C71823l6) obj;
            return this.A00 == r5.A00 && this.A01 == r5.A01;
        }
        return false;
    }
}
