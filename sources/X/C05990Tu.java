package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: X.0Tu  reason: invalid class name and case insensitive filesystem */
public class C05990Tu {
    public final Map A00 = AnonymousClass000.A0x();
    public final Map A01;

    public C05990Tu(Map map) {
        this.A01 = map;
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            Object value = A0z.getValue();
            List list = (List) this.A00.get(value);
            if (list == null) {
                list = AnonymousClass000.A0u();
                this.A00.put(value, list);
            }
            list.add(A0z.getKey());
        }
    }

    public static void A00(C011405n r5, C001300o r6, Object obj, List list) {
        Method method;
        Object[] objArr;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    AnonymousClass0QJ r1 = (AnonymousClass0QJ) list.get(size);
                    try {
                        int i2 = r1.A00;
                        if (i2 == 0) {
                            method = r1.A01;
                            objArr = new Object[0];
                        } else if (i2 != 1) {
                            method = r1.A01;
                            objArr = new Object[]{r6, r5};
                        } else {
                            method = r1.A01;
                            objArr = new Object[]{r6};
                        }
                        method.invoke(obj, objArr);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    } catch (IllegalAccessException e3) {
                        throw new RuntimeException(e3);
                    }
                } else {
                    return;
                }
            }
        }
    }
}
