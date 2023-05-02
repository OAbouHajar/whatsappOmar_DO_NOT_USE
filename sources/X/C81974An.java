package X;

import java.lang.reflect.Method;

/* renamed from: X.4An  reason: invalid class name and case insensitive filesystem */
public final class C81974An {
    public static final Method A00;
    public static final Method A01;

    static {
        Method method;
        Method method2;
        Class<Throwable> cls = Throwable.class;
        Method[] methods = cls.getMethods();
        C18450wi.A0B(methods);
        int length = methods.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            method = null;
            if (i3 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i3];
            i3++;
            if (C18450wi.A0R(method2.getName(), "addSuppressed")) {
                Class[] parameterTypes = method2.getParameterTypes();
                C18450wi.A0B(parameterTypes);
                if (C18450wi.A0R(parameterTypes.length == 1 ? parameterTypes[0] : null, cls)) {
                    break;
                }
            }
        }
        A00 = method2;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Method method3 = methods[i2];
            i2++;
            if (C18450wi.A0R(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
        }
        A01 = method;
    }
}
