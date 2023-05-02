package X;

/* renamed from: X.4sW  reason: invalid class name and case insensitive filesystem */
public final class C98504sW implements AnonymousClass5RI {
    public AnonymousClass5RI[] A00;

    public C98504sW(AnonymousClass5RI... r1) {
        this.A00 = r1;
    }

    public final boolean Air(Class cls) {
        for (AnonymousClass5RI Air : this.A00) {
            if (Air.Air(cls)) {
                return true;
            }
        }
        return false;
    }

    public final AnonymousClass5M3 Aj5(Class cls) {
        for (AnonymousClass5RI r1 : this.A00) {
            if (r1.Air(cls)) {
                return r1.Aj5(cls);
            }
        }
        throw new UnsupportedOperationException(C13680ns.A0g(cls.getName(), "No factory is available for message type: "));
    }
}
