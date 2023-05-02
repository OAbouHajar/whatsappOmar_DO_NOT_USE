package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4dq  reason: invalid class name and case insensitive filesystem */
public final class C90254dq {
    public static Object[] copy(Object[] objArr, int i2, int i3, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i2, i3, objArr2.getClass());
    }

    public static Object[] newArray(Object[] objArr, int i2) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
    }

    public static Set preservesInsertionOrderOnAddsSet() {
        return C105975Bz.create();
    }

    public static Map preservesInsertionOrderOnPutsMap() {
        return C105935Bu.create();
    }
}
