package X;

/* renamed from: X.1IW  reason: invalid class name */
public abstract class AnonymousClass1IW extends AnonymousClass1IC implements C20240zj, AnonymousClass1IG {
    public AnonymousClass39U A00;
    public final AnonymousClass1IP A01;

    public AnonymousClass1IW(AnonymousClass1IP r1, C20210zg r2) {
        super(r2);
        this.A01 = r1;
    }

    public final AnonymousClass39U A04() {
        AnonymousClass39U r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18450wi.A0O("screenOpener");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void A59(String str) {
        C18450wi.A0H(str, 0);
        this.A00 = new AnonymousClass39U(this, (C20180zd) this.A01.A00.A01.APJ.get(), str);
    }
}
