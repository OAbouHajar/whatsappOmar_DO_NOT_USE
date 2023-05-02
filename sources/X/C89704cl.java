package X;

/* renamed from: X.4cl  reason: invalid class name and case insensitive filesystem */
public final class C89704cl {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static final AnonymousClass5GR A00() {
        ThreadLocal threadLocal = A00;
        AnonymousClass5GR r1 = (AnonymousClass5GR) threadLocal.get();
        if (r1 != null) {
            return r1;
        }
        AnonymousClass5GO r12 = new AnonymousClass5GO(Thread.currentThread());
        threadLocal.set(r12);
        return r12;
    }

    public static final void A01() {
        A00.set((Object) null);
    }
}
