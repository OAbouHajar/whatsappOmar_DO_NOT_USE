package X;

/* renamed from: X.3ZZ  reason: invalid class name */
public final class AnonymousClass3ZZ extends C66383Zd implements Cloneable {
    public static volatile AnonymousClass3ZZ[] A00;

    public AnonymousClass3ZZ() {
        this.A00 = null;
        this.A00 = -1;
    }

    public final int A03() {
        int A03 = super.A03();
        return !"".equals("") ? A03 + C90704ef.A00(1) + C90704ef.A00(2) : A03;
    }

    public final void A05(C90704ef r3) {
        if (!"".equals("")) {
            r3.A07(1, "");
            r3.A07(2, "");
        }
        super.A05(r3);
    }

    public final /* synthetic */ Object clone() {
        try {
            return super.A06();
        } catch (CloneNotSupportedException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass3ZZ) {
                C66383Zd r5 = (C66383Zd) obj;
                if ("".equals("")) {
                    C1043154v r1 = this.A00;
                    if (r1 != null && r1.A00 != 0) {
                        return r1.equals(r5.A00);
                    }
                    C1043154v r0 = r5.A00;
                    if (r0 == null || r0.A00 == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        int hashCode = "".hashCode();
        int hashCode2 = (((((AnonymousClass3ZZ.class.getName().hashCode() + 527) * 31) + hashCode) * 31) + hashCode) * 31;
        C1043154v r1 = this.A00;
        if (!(r1 == null || r1.A00 == 0)) {
            i2 = r1.hashCode();
        }
        return hashCode2 + i2;
    }
}
