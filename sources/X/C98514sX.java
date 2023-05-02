package X;

/* renamed from: X.4sX  reason: invalid class name and case insensitive filesystem */
public final class C98514sX implements AnonymousClass5RI {
    public static final C98514sX A00 = new C98514sX();

    public final boolean Air(Class cls) {
        return C67293bJ.class.isAssignableFrom(cls);
    }

    public final AnonymousClass5M3 Aj5(Class cls) {
        IllegalStateException illegalStateException;
        Class<C67293bJ> cls2 = C67293bJ.class;
        if (!cls2.isAssignableFrom(cls)) {
            throw AnonymousClass000.A0T(C13680ns.A0g(cls.getName(), "Unsupported message type: "));
        }
        try {
            Class<? extends U> asSubclass = cls.asSubclass(cls2);
            C67293bJ r2 = (C67293bJ) C67293bJ.zzd.get(asSubclass);
            if (r2 == null) {
                try {
                    Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                    r2 = (C67293bJ) C67293bJ.zzd.get(asSubclass);
                    if (r2 == null) {
                        r2 = (C67293bJ) ((C67293bJ) C90914f4.A02(asSubclass)).A08(6);
                        if (r2 != null) {
                            C67293bJ.A04(asSubclass, r2);
                        } else {
                            illegalStateException = AnonymousClass3K4.A0V();
                            throw illegalStateException;
                        }
                    }
                } catch (ClassNotFoundException e2) {
                    illegalStateException = new IllegalStateException("Class initialization cannot fail.", e2);
                }
            }
            return (AnonymousClass5M3) r2.A08(3);
        } catch (Exception e3) {
            throw new RuntimeException(C13680ns.A0g(cls.getName(), "Unable to get message info for "), e3);
        }
    }
}
