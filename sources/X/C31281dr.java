package X;

/* renamed from: X.1dr  reason: invalid class name and case insensitive filesystem */
public class C31281dr {
    public static C31271dq A00;

    public static void A00(C31271dq r3) {
        boolean z2;
        Class<C31281dr> cls = C31281dr.class;
        synchronized (cls) {
            z2 = false;
            if (A00 != null) {
                z2 = true;
            }
        }
        if (!z2) {
            synchronized (cls) {
                if (A00 == null) {
                    A00 = r3;
                } else {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
            }
        }
    }

    public static boolean A01(String str) {
        C31271dq r0;
        synchronized (C31281dr.class) {
            r0 = A00;
            if (r0 == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return r0.AKF(str, 0);
    }
}
