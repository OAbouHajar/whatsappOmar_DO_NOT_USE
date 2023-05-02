package X;

/* renamed from: X.00A  reason: invalid class name */
public final class AnonymousClass00A implements AnonymousClass007 {
    public final AnonymousClass009 A00;
    public final Object A01 = new Object();
    public volatile Object A02;

    public AnonymousClass00A(AnonymousClass009 r2) {
        this.A00 = r2;
    }

    public Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    AnonymousClass009 r0 = this.A00;
                    AnonymousClass01U r2 = new AnonymousClass01U();
                    r2.A0N = new AnonymousClass01L(r0.A00);
                    this.A02 = r2.A00();
                }
            }
        }
        return this.A02;
    }
}
