package androidx.work;

import X.AnonymousClass000;
import X.AnonymousClass0UK;
import X.C007103g;
import X.C007203h;
import X.C18450wi;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ArrayCreatingInputMerger extends AnonymousClass0UK {
    public static final Object A00(Class cls, Object obj) {
        Object newInstance = Array.newInstance(cls, 1);
        Array.set(newInstance, 0, obj);
        C18450wi.A0B(newInstance);
        return newInstance;
    }

    public static final Object A01(Class cls, Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        C18450wi.A0B(newInstance);
        return newInstance;
    }

    public static final Object A02(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        C18450wi.A0F(componentType);
        Object newInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        C18450wi.A0B(newInstance);
        return newInstance;
    }

    public C007203h A03(List list) {
        C007103g r8 = new C007103g();
        HashMap A0x = AnonymousClass000.A0x();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((C007203h) it.next()).A00);
            C18450wi.A0B(unmodifiableMap);
            Iterator A0y = AnonymousClass000.A0y(unmodifiableMap);
            while (true) {
                if (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass000.A0z(A0y);
                    Object key = A0z.getKey();
                    Object value = A0z.getValue();
                    Class cls = value != null ? value.getClass() : String.class;
                    Object obj = A0x.get(key);
                    C18450wi.A09(key);
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (C18450wi.A0R(cls2, cls)) {
                            C18450wi.A0B(value);
                            value = A02(obj, value);
                        } else if (C18450wi.A0R(cls2.getComponentType(), cls)) {
                            value = A01(cls, obj, value);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else if (!cls.isArray()) {
                        value = A00(cls, value);
                    }
                    C18450wi.A0E(value);
                    A0x.put(key, value);
                }
            }
        }
        r8.A02(A0x);
        return r8.A00();
    }
}
