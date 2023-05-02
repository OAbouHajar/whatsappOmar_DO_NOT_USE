package X;

/* renamed from: X.47P  reason: invalid class name */
public class AnonymousClass47P {
    public static boolean A00(String str) {
        if (str == null) {
            return false;
        }
        try {
            return Long.parseLong(str) > 0;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
