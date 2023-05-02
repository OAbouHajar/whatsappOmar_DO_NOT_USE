package X;

import com.whatsapp.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;

/* renamed from: X.5pa  reason: invalid class name and case insensitive filesystem */
public class C115335pa {
    public static void A00(Object obj, StringBuilder sb) {
        String valueOf;
        if (obj == null) {
            valueOf = "null";
        } else {
            Class<?> cls = obj.getClass();
            int i2 = 0;
            if (cls.isArray()) {
                sb.append("[");
                while (i2 < Array.getLength(obj)) {
                    A00(Array.get(obj, i2), sb);
                    sb.append(",");
                    i2++;
                }
                sb.replace(sb.length() - 1, sb.length(), "]");
                return;
            } else if (cls.equals(String.class)) {
                sb.append("\"");
                sb.append(obj);
                sb.append("\"");
                return;
            } else if (cls.isPrimitive() || cls.equals(Integer.class) || cls.equals(Long.class) || cls.equals(Short.class) || cls.equals(Double.class) || cls.equals(Float.class) || cls.equals(BigDecimal.class)) {
                valueOf = String.valueOf(obj);
            } else {
                try {
                    sb.append("{");
                    Field[] declaredFields = cls.getDeclaredFields();
                    int length = declaredFields.length;
                    while (i2 < length) {
                        Field field = declaredFields[i2];
                        if (!Modifier.isStatic(field.getModifiers())) {
                            field.setAccessible(true);
                            sb.append("\"");
                            sb.append(field.getName());
                            sb.append("\"");
                            sb.append(":");
                            A00(field.get(obj), sb);
                            sb.append(",");
                        }
                        i2++;
                    }
                    sb.replace(sb.length() - 1, sb.length(), "}");
                    return;
                } catch (IllegalAccessException unused) {
                    Log.e("PAY: failed to convert to json string");
                    return;
                }
            }
        }
        sb.append(valueOf);
    }
}
