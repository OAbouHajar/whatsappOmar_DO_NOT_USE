package X;

/* renamed from: X.0ss  reason: invalid class name and case insensitive filesystem */
public final class C16340ss {
    public static void A00(Class cls, Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void A01(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
