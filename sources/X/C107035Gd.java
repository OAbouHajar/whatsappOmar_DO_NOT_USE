package X;

/* renamed from: X.5Gd  reason: invalid class name and case insensitive filesystem */
public class C107035Gd extends C11030i5 implements C004001t {
    public final boolean A00 = A0t();

    public C107035Gd() {
        A0e((C004001t) null);
    }

    public boolean A0h() {
        return this.A00;
    }

    public boolean A0i() {
        return true;
    }

    public final boolean A0t() {
        AnonymousClass5GH r1;
        AnonymousClass5GH r2;
        C13640mn A0Q = A0Q();
        C11030i5 r12 = null;
        if (!(A0Q instanceof AnonymousClass5GW) || (r2 = (AnonymousClass5GH) A0Q) == null || (r12 = r2.A00) != null) {
            if (r12 != null) {
                while (!r12.A0h()) {
                    C13640mn A0Q2 = r12.A0Q();
                    if ((A0Q2 instanceof AnonymousClass5GW) && (r1 = (AnonymousClass5GH) A0Q2) != null) {
                        r12 = r1.A00;
                        if (r12 == null) {
                            throw C18450wi.A03("job");
                        }
                    }
                }
                return true;
            }
            return false;
        }
        throw C18450wi.A03("job");
    }
}
