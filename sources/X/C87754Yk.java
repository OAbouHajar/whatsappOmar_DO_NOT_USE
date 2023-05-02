package X;

/* renamed from: X.4Yk  reason: invalid class name and case insensitive filesystem */
public final class C87754Yk {
    public static final C12910lA A00;

    static {
        C12910lA r1;
        boolean z2 = false;
        try {
            String property = System.getProperty("kotlinx.coroutines.main.delay");
            if (property != null) {
                z2 = Boolean.parseBoolean(property);
                if (z2) {
                    AnonymousClass5GI r12 = AnonymousClass38H.A00;
                    if (!(r12.A06() instanceof C107045Ge) && (r12 instanceof C12910lA)) {
                        r1 = (C12910lA) r12;
                        A00 = r1;
                    }
                }
            }
        } catch (SecurityException unused) {
        }
        r1 = AnonymousClass5GP.A01;
        A00 = r1;
    }

    public static final C12910lA A00() {
        return A00;
    }
}
