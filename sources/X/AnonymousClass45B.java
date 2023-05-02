package X;

/* renamed from: X.45B  reason: invalid class name */
public final class AnonymousClass45B {
    public static boolean A00(Object obj, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (!AnonymousClass45A.A00(objArr[i2], obj)) {
                    i2++;
                } else if (i2 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
