package X;

import java.lang.reflect.Field;

/* renamed from: X.4bC  reason: invalid class name and case insensitive filesystem */
public final class C88854bC {
    public final Field field;

    public C88854bC(Field field2) {
        this.field = field2;
        field2.setAccessible(true);
    }

    public void set(Object obj, int i2) {
        try {
            this.field.set(obj, Integer.valueOf(i2));
        } catch (IllegalAccessException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }

    public void set(Object obj, Object obj2) {
        try {
            this.field.set(obj, obj2);
        } catch (IllegalAccessException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }
}
