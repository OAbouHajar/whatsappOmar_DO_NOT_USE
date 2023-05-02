package com.google.gson.internal.reflect;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: XFMFile */
public class ReflectionHelper {
    public static void makeAccessible(Field field) {
        try {
            field.setAccessible(true);
        } catch (Exception e2) {
            throw new JsonIOException("Failed making field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' accessible; either change its visibility or write a custom TypeAdapter for its declaring type", e2);
        }
    }

    public static String tryMakeAccessible(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Failed making constructor '");
            StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(constructor.getDeclaringClass().getSimpleName());
            sb2.append('(');
            Class[] parameterTypes = constructor.getParameterTypes();
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(parameterTypes[i2].getSimpleName());
            }
            sb2.append(')');
            sb.append(sb2.toString());
            sb.append("' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
            sb.append(e2.getMessage());
            return sb.toString();
        }
    }
}
