package X;

/* renamed from: X.0RM  reason: invalid class name */
public final class AnonymousClass0RM {
    public C08970eh A00;
    public C02620Dh A01 = C02620Dh.A00();
    public Object A02;
    public boolean A03;

    public void A00() {
        this.A02 = null;
        this.A00 = null;
        this.A01.A07((Object) null);
    }

    public void A01(Object obj) {
        this.A03 = true;
        C08970eh r0 = this.A00;
        if (r0 != null && r0.A01(obj)) {
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
        }
    }

    public void finalize() {
        C02620Dh r1;
        C08970eh r2 = this.A00;
        if (r2 != null && !r2.isDone()) {
            r2.A00(new C11220iO(AnonymousClass000.A0f(this.A02, AnonymousClass000.A0r("The completer object was garbage collected - this future would otherwise never complete. The tag was: "))));
        }
        if (!this.A03 && (r1 = this.A01) != null) {
            r1.A07((Object) null);
        }
    }
}
