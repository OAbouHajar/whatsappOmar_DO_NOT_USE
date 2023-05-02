package X;

import android.graphics.Paint;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.4e3  reason: invalid class name and case insensitive filesystem */
public class C90384e3 {
    public static final Method A00;
    public static final Method A01;

    static {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getMethod", new Class[]{String.class, Class[].class});
            if (declaredMethod != null) {
                Class<Paint> cls = Paint.class;
                Class<Method> cls2 = Method.class;
                A00 = (Method) A02(cls2, cls, declaredMethod, "getUnderlinePosition", null);
                A01 = (Method) A02(cls2, cls, declaredMethod, "getUnderlineThickness", null);
            }
        } catch (NoSuchMethodException | SecurityException e2) {
            Log.e("paintcompat/no method getMethod", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = (java.lang.Number) A02(java.lang.Float.class, r3, r2, new java.lang.Object[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float A00(android.graphics.Paint r3) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x000b
            float r1 = r3.getUnderlinePosition()
            return r1
        L_0x000b:
            java.lang.reflect.Method r2 = A00
            if (r2 == 0) goto L_0x0021
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r0 = A02(r1, r3, r2, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0021
            float r1 = r0.floatValue()
            return r1
        L_0x0021:
            float r1 = r3.getTextSize()
            r0 = 1094713344(0x41400000, float:12.0)
            float r1 = r1 / r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90384e3.A00(android.graphics.Paint):float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = (java.lang.Number) A02(java.lang.Float.class, r3, r2, new java.lang.Object[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float A01(android.graphics.Paint r3) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x000b
            float r1 = r3.getUnderlineThickness()
            return r1
        L_0x000b:
            java.lang.reflect.Method r2 = A01
            if (r2 == 0) goto L_0x0021
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r0 = A02(r1, r3, r2, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0021
            float r1 = r0.floatValue()
            return r1
        L_0x0021:
            float r1 = r3.getTextSize()
            r0 = 1099956224(0x41900000, float:18.0)
            float r1 = r1 / r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90384e3.A01(android.graphics.Paint):float");
    }

    public static Object A02(Class cls, Object obj, Method method, Object... objArr) {
        try {
            return cls.cast(method.invoke(obj, objArr));
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.e("paintcompat/invoke exception", e2);
            return null;
        }
    }
}
