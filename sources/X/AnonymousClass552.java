package X;

/* renamed from: X.552  reason: invalid class name */
public abstract class AnonymousClass552 implements Comparable {
    public static final AnonymousClass552 A01 = new C70013fy();
    public Object A00;

    public AnonymousClass552(Object obj) {
        this.A00 = obj;
    }

    /* renamed from: A00 */
    public int compareTo(AnonymousClass552 r3) {
        return -A01().toString().compareTo(r3.A01().toString());
    }

    public Object A01() {
        if (this instanceof C70023fz) {
            return "$";
        }
        if (this instanceof C70043g1) {
            return ((C70043g1) this).A00;
        }
        if (this instanceof C70033g0) {
            return C90264dr.A00(((C70033g0) this).A00, "&&", "");
        }
        if (this instanceof C70053g2) {
            return Integer.valueOf(((C70053g2) this).A00);
        }
        return null;
    }
}
