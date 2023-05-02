package X;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.0TV  reason: invalid class name */
public final class AnonymousClass0TV {
    public static final List A00;
    public static final List A01;

    static {
        Class<C016407u> cls = C016407u.class;
        A00 = AnonymousClass1JA.A0R(Application.class, cls);
        A01 = AnonymousClass1JB.A0V(cls);
    }

    public static final Constructor A00(Class cls, List list) {
        Constructor[] constructors = cls.getConstructors();
        C18450wi.A0B(constructors);
        int length = constructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor constructor = constructors[i2];
            Class[] parameterTypes = constructor.getParameterTypes();
            C18450wi.A0B(parameterTypes);
            List A05 = C11330iZ.A05(parameterTypes);
            if (list.equals(A05)) {
                return constructor;
            }
            if (list.size() != A05.size() || !A05.containsAll(list)) {
                i2++;
            } else {
                StringBuilder A0r = AnonymousClass000.A0r("Class ");
                A0r.append(cls.getSimpleName());
                throw new UnsupportedOperationException(AnonymousClass000.A0e(list, " must have parameters in the proper order: ", A0r));
            }
        }
        return null;
    }
}
