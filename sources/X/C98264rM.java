package X;

/* renamed from: X.4rM  reason: invalid class name and case insensitive filesystem */
public final class C98264rM implements AnonymousClass5RG {
    public AnonymousClass5RG[] A00;

    public C98264rM(AnonymousClass5RG... r1) {
        this.A00 = r1;
    }

    public final boolean Air(Class cls) {
        for (AnonymousClass5RG Air : this.A00) {
            if (Air.Air(cls)) {
                return true;
            }
        }
        return false;
    }

    public final C107875Lt Aj4(Class cls) {
        for (AnonymousClass5RG r1 : this.A00) {
            if (r1.Air(cls)) {
                return r1.Aj4(cls);
            }
        }
        throw new UnsupportedOperationException(C13680ns.A0g(cls.getName(), "No factory is available for message type: "));
    }
}
