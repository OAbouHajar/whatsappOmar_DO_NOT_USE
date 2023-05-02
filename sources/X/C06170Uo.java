package X;

/* renamed from: X.0Uo  reason: invalid class name and case insensitive filesystem */
public class C06170Uo {
    public static final C06170Uo A02 = new C06170Uo(AnonymousClass0KG.xMidYMid, C03600Jd.meet);
    public static final C06170Uo A03 = new C06170Uo(AnonymousClass0KG.none, (C03600Jd) null);
    public AnonymousClass0KG A00;
    public C03600Jd A01;

    public C06170Uo(AnonymousClass0KG r1, C03600Jd r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C06170Uo r5 = (C06170Uo) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A00);
        A0o.append(" ");
        return AnonymousClass000.A0f(this.A01, A0o);
    }
}
