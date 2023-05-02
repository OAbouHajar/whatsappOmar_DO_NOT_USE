package X;

/* renamed from: X.0up  reason: invalid class name and case insensitive filesystem */
public final class C17280up implements AnonymousClass01J {
    public static final Object A02 = new Object();
    public volatile Object A00 = A02;
    public volatile AnonymousClass01J A01;

    public C17280up(AnonymousClass01J r2) {
        this.A01 = r2;
    }

    public static AnonymousClass01J A00(AnonymousClass01J r1) {
        return ((r1 instanceof C17280up) || (r1 instanceof C17270uo)) ? r1 : new C17280up(r1);
    }

    public Object get() {
        Object obj = this.A00;
        if (obj != A02) {
            return obj;
        }
        AnonymousClass01J r0 = this.A01;
        if (r0 == null) {
            return this.A00;
        }
        Object obj2 = r0.get();
        this.A00 = obj2;
        this.A01 = null;
        return obj2;
    }
}
