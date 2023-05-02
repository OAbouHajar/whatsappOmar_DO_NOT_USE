package X;

/* renamed from: X.4cQ  reason: invalid class name and case insensitive filesystem */
public class C89554cQ {
    public static Number A00(double d2) {
        int i2 = (int) d2;
        return ((double) i2) == d2 ? Integer.valueOf(i2) : Double.valueOf(d2);
    }

    public static Number A01(float f2) {
        return A00((double) f2);
    }

    public static boolean A02(Object obj) {
        if (obj instanceof Number) {
            return AnonymousClass000.A1O(AnonymousClass000.A0D(obj));
        }
        if (obj instanceof Boolean) {
            return AnonymousClass000.A1X(obj);
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(obj == null ? "null" : obj.toString(), AnonymousClass000.A0r("Expected Number or Boolean: ")));
    }
}
