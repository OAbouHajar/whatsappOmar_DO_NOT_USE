package X;

/* renamed from: X.0uf  reason: invalid class name and case insensitive filesystem */
public class C17180uf {
    public AnonymousClass01D A00;
    public Boolean A01;
    public final C14710pd A02;

    public C17180uf(C14710pd r1) {
        this.A02 = r1;
    }

    public String A00() {
        C14710pd r2 = this.A02;
        C16620tM r1 = C16620tM.A02;
        if (r2.A0E(r1, 450)) {
            return r2.A06(r1, 2711);
        }
        return null;
    }

    public boolean A01() {
        C14710pd r2 = this.A02;
        C16620tM r1 = C16620tM.A02;
        return r2.A0E(r1, 450) && r2.A0E(r1, 1594);
    }

    public boolean A02() {
        return A06() && this.A02.A0E(C16620tM.A02, 1616);
    }

    public boolean A03() {
        return A06() && this.A02.A0E(C16620tM.A02, 2192);
    }

    public boolean A04() {
        C14710pd r2 = this.A02;
        C16620tM r1 = C16620tM.A02;
        return r2.A0E(r1, 450) && r2.A0E(r1, 1890);
    }

    public boolean A05() {
        C14710pd r2 = this.A02;
        C16620tM r1 = C16620tM.A02;
        return r2.A0E(r1, 450) && r2.A0E(r1, 1920);
    }

    public boolean A06() {
        return this.A02.A0E(C16620tM.A02, 450) && A0C();
    }

    public boolean A07() {
        return A06() && this.A02.A0E(C16620tM.A02, 1206);
    }

    public boolean A08() {
        C14710pd r2 = this.A02;
        C16620tM r1 = C16620tM.A02;
        return r2.A0E(r1, 450) && r2.A0E(r1, 2452);
    }

    public boolean A09() {
        C14710pd r2 = this.A02;
        C16620tM r1 = C16620tM.A02;
        return r2.A0E(r1, 450) && r2.A0E(r1, 2613);
    }

    public boolean A0A() {
        C14710pd r2 = this.A02;
        C16620tM r1 = C16620tM.A02;
        return r2.A0E(r1, 450) && r2.A0E(r1, 2592);
    }

    public boolean A0B() {
        C14710pd r2 = this.A02;
        C16620tM r1 = C16620tM.A02;
        return r2.A0E(r1, 450) && r2.A0E(r1, 2357);
    }

    public final boolean A0C() {
        AnonymousClass01D r0;
        if (!(this.A01 != null || (r0 = this.A00) == null || r0.get() == null)) {
            AnonymousClass1GE r1 = (AnonymousClass1GE) this.A00.get();
            this.A01 = Boolean.valueOf(r1.A05(r1.A05.A00));
        }
        Boolean bool = this.A01;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
