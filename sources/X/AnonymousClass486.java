package X;

/* renamed from: X.486  reason: invalid class name */
public final class AnonymousClass486 {
    public static final String A00(AnonymousClass1UG r3) {
        Object obj;
        if (r3 instanceof AnonymousClass5GM) {
            return r3.toString();
        }
        try {
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(r3);
            A0o.append('@');
            obj = AnonymousClass000.A0h(Integer.toHexString(System.identityHashCode(r3)), A0o);
        } catch (Throwable th) {
            obj = new C41211vQ(th);
        }
        if (C41201vP.A00(obj) != null) {
            StringBuilder A0o2 = AnonymousClass000.A0o();
            A0o2.append(AnonymousClass000.A0d(r3));
            A0o2.append('@');
            obj = AnonymousClass000.A0h(Integer.toHexString(System.identityHashCode(r3)), A0o2);
        }
        return (String) obj;
    }
}
