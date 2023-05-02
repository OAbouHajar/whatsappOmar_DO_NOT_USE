package X;

/* renamed from: X.0uo  reason: invalid class name and case insensitive filesystem */
public final class C17270uo implements AnonymousClass01J, AnonymousClass01D {
    public static final Object A02 = new Object();
    public volatile Object A00 = A02;
    public volatile AnonymousClass01J A01;

    public C17270uo(AnonymousClass01J r2) {
        this.A01 = r2;
    }

    public static AnonymousClass01D A00(AnonymousClass01J r1) {
        return r1 instanceof AnonymousClass01D ? (AnonymousClass01D) r1 : new C17270uo(r1);
    }

    public static AnonymousClass01J A01(AnonymousClass01J r1) {
        return r1 instanceof C17270uo ? r1 : new C17270uo(r1);
    }

    public Object get() {
        Object obj;
        Object obj2 = this.A00;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A00;
            if (obj == obj3) {
                obj = this.A01.get();
                Object obj4 = this.A00;
                if (obj4 == obj3 || obj4 == obj) {
                    this.A00 = obj;
                    this.A01 = null;
                } else {
                    StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                    sb.append(obj4);
                    sb.append(" & ");
                    sb.append(obj);
                    sb.append(". This is likely due to a circular dependency.");
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        return obj;
    }
}
