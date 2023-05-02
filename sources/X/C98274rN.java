package X;

/* renamed from: X.4rN  reason: invalid class name and case insensitive filesystem */
public final class C98274rN implements AnonymousClass5RG {
    public static final C98274rN A00 = new C98274rN();

    public final boolean Air(Class cls) {
        return AnonymousClass3Z1.class.isAssignableFrom(cls);
    }

    public final C107875Lt Aj4(Class cls) {
        IllegalStateException illegalStateException;
        Class<AnonymousClass3Z1> cls2 = AnonymousClass3Z1.class;
        if (!cls2.isAssignableFrom(cls)) {
            throw AnonymousClass000.A0T(C13680ns.A0g(cls.getName(), "Unsupported message type: "));
        }
        try {
            Class<? extends U> asSubclass = cls.asSubclass(cls2);
            AnonymousClass3Z1 r3 = (AnonymousClass3Z1) AnonymousClass3Z1.zzjr.get(asSubclass);
            if (r3 == null) {
                try {
                    String name = asSubclass.getName();
                    Class.forName(name, true, asSubclass.getClassLoader());
                    r3 = (AnonymousClass3Z1) AnonymousClass3Z1.zzjr.get(asSubclass);
                    if (r3 == null) {
                        illegalStateException = AnonymousClass000.A0V(C13680ns.A0g(name, "Unable to get default instance for: "));
                        throw illegalStateException;
                    }
                } catch (ClassNotFoundException e2) {
                    illegalStateException = new IllegalStateException("Class initialization cannot fail.", e2);
                }
            }
            return (C107875Lt) r3.A07(3);
        } catch (Exception e3) {
            throw new RuntimeException(C13680ns.A0g(cls.getName(), "Unable to get message info for "), e3);
        }
    }
}
