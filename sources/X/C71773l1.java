package X;

/* renamed from: X.3l1  reason: invalid class name and case insensitive filesystem */
public class C71773l1 extends C86344Sg {
    public final C108635Ot A00;
    public final AnonymousClass1US A01;

    public C71773l1(C108635Ot r2, AnonymousClass1US r3) {
        super(6);
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A01.equals(((C71773l1) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
