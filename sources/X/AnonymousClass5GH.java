package X;

/* renamed from: X.5GH  reason: invalid class name */
public abstract class AnonymousClass5GH extends C107155Gp implements AnonymousClass5SE, C109115Qt {
    public C11030i5 A00;

    public final void A0B(C11030i5 r1) {
        this.A00 = r1;
    }

    public C107095Gj AD9() {
        return null;
    }

    public boolean AIc() {
        return true;
    }

    public void dispose() {
        C11030i5 r0 = this.A00;
        if (r0 != null) {
            r0.A0g(this);
            return;
        }
        throw C18450wi.A03("job");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(AnonymousClass3K2.A0l(this, A0o));
        A0o.append("[job@");
        C11030i5 r0 = this.A00;
        if (r0 != null) {
            AnonymousClass000.A1G(r0, A0o);
            return AnonymousClass3K2.A0m(A0o);
        }
        throw C18450wi.A03("job");
    }
}
