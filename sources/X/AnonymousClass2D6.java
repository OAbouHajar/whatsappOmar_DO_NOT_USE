package X;

/* renamed from: X.2D6  reason: invalid class name */
public class AnonymousClass2D6 {
    public static long A00(Long l2, long j2) {
        return (l2 == null ? 0 : l2.longValue()) + j2;
    }

    public static long A01(String[] strArr, int i2) {
        if (strArr.length > i2) {
            return C29501aj.A01(strArr[i2], 0);
        }
        return 0;
    }

    public static Boolean A02(String[] strArr, int i2) {
        if (strArr.length > i2) {
            String str = strArr[i2];
            if (!"null".equals(str)) {
                return Boolean.valueOf(Boolean.parseBoolean(str));
            }
        }
        return null;
    }

    public static Integer A03(String[] strArr) {
        if (strArr.length > 1) {
            String str = strArr[1];
            if (!"null".equals(str)) {
                return Integer.valueOf(C29501aj.A00(str, 0));
            }
        }
        return null;
    }

    public static Long A04(String[] strArr, int i2) {
        if (strArr.length > i2) {
            String str = strArr[i2];
            if (!"null".equals(str)) {
                return Long.valueOf(C29501aj.A01(str, 0));
            }
        }
        return null;
    }
}
