package X;

/* renamed from: X.2CC  reason: invalid class name */
public final class AnonymousClass2CC {
    public static Object checkElementNotNull(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }

    public static Object[] checkElementsNotNull(Object... objArr) {
        checkElementsNotNull(objArr, objArr.length);
        return objArr;
    }

    public static Object[] checkElementsNotNull(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            checkElementNotNull(objArr[i3], i3);
        }
        return objArr;
    }

    public static Object[] newArray(Object[] objArr, int i2) {
        return C90254dq.newArray(objArr, i2);
    }

    public static Object[] toArrayImpl(Object[] objArr, int i2, int i3, Object[] objArr2) {
        C29031Zu.A03(0, i3, objArr.length);
        int length = objArr2.length;
        if (length < i3) {
            objArr2 = newArray(objArr2, i3);
        } else if (length > i3) {
            objArr2[i3] = null;
        }
        System.arraycopy(objArr, 0, objArr2, 0, i3);
        return objArr2;
    }
}
