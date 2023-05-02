package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Deprecated
/* renamed from: X.0W6  reason: invalid class name */
public final class AnonymousClass0W6 {
    public static AnonymousClass0W6 A02 = new AnonymousClass0W6();
    public final Map A00 = AnonymousClass000.A0x();
    public final Map A01 = AnonymousClass000.A0x();

    public static final void A00(AnonymousClass0QJ r4, C011405n r5, Class cls, Map map) {
        Object obj = map.get(r4);
        if (obj == null) {
            map.put(r4, r5);
        } else if (r5 != obj) {
            Method method = r4.A01;
            StringBuilder A0r = AnonymousClass000.A0r("Method ");
            A0r.append(method.getName());
            A0r.append(" in ");
            A0r.append(cls.getName());
            A0r.append(" already declared with different @OnLifecycleEvent value: previous value ");
            A0r.append(obj);
            throw AnonymousClass000.A0T(AnonymousClass000.A0e(r5, ", new value ", A0r));
        }
    }

    public final C05990Tu A01(Class cls, Method[] methodArr) {
        int i2;
        String str;
        Class superclass = cls.getSuperclass();
        HashMap A0x = AnonymousClass000.A0x();
        if (superclass != null) {
            C05990Tu r0 = (C05990Tu) this.A00.get(superclass);
            if (r0 == null) {
                r0 = A01(superclass, (Method[]) null);
            }
            A0x.putAll(r0.A01);
        }
        for (Class cls2 : cls.getInterfaces()) {
            C05990Tu r02 = (C05990Tu) this.A00.get(cls2);
            if (r02 == null) {
                r02 = A01(cls2, (Method[]) null);
            }
            Iterator A0y = AnonymousClass000.A0y(r02.A01);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                A00((AnonymousClass0QJ) A0z.getKey(), (C011405n) A0z.getValue(), cls, A0x);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i2 = 0;
                } else if (parameterTypes[0].isAssignableFrom(C001300o.class)) {
                    i2 = 1;
                } else {
                    str = "invalid parameter type. Must be one and instanceof LifecycleOwner";
                    throw AnonymousClass000.A0T(str);
                }
                C011405n value = onLifecycleEvent.value();
                if (length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C011405n.class)) {
                        str = "invalid parameter type. second arg must be an event";
                    } else if (value == C011405n.ON_ANY) {
                        i2 = 2;
                        if (length > 2) {
                            str = "cannot have more than 2 params";
                        }
                    } else {
                        str = "Second arg is supported only for ON_ANY value";
                    }
                    throw AnonymousClass000.A0T(str);
                }
                A00(new AnonymousClass0QJ(method, i2), value, cls, A0x);
                z2 = true;
            }
        }
        C05990Tu r2 = new C05990Tu(A0x);
        this.A00.put(cls, r2);
        this.A01.put(cls, Boolean.valueOf(z2));
        return r2;
    }
}
