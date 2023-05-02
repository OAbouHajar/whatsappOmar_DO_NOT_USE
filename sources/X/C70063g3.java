package X;

/* renamed from: X.3g3  reason: invalid class name and case insensitive filesystem */
public class C70063g3 extends C99364tu {
    public final C801642u A00;
    public final C89494cI A01;
    public final C89494cI A02;

    public C70063g3(C801642u r1, C89494cI r2, C89494cI r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        toString();
    }

    public boolean A54(C84634Lh r5) {
        C89494cI r3 = this.A01;
        C89494cI r2 = this.A02;
        if (r3 instanceof C70123g9) {
            r3 = ((C70123g9) r3).A07(r5);
        }
        if (r2 instanceof C70123g9) {
            r2 = ((C70123g9) r2).A07(r5);
        }
        AnonymousClass5OR r0 = (AnonymousClass5OR) AnonymousClass49D.A00.get(this.A00);
        if (r0 != null) {
            return r0.A8k(r3, r2, r5);
        }
        return false;
    }

    public String toString() {
        C801642u r2 = this.A00;
        if (r2 == C801642u.EXISTS) {
            return this.A01.toString();
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass000.A1I(this.A01, A0o);
        A0o.append(" ");
        AnonymousClass000.A1I(r2, A0o);
        A0o.append(" ");
        return AnonymousClass000.A0h(this.A02.toString(), A0o);
    }
}
