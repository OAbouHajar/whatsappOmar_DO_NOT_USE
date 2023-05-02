package com.mod.tools.control;

import android.content.Context;
import java.lang.ref.SoftReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class ReflectUtils {
    private static final Map<String, SoftReference<Class>> sCache = new HashMap();
    private static final Set<Class<?>> sImmutable = new HashSet(sWrapper);
    private static final Set<Class<?>> sWrapper = new HashSet();

    static {
        try {
            sWrapper.add(Class.forName("java.lang.Boolean"));
            try {
                sWrapper.add(Class.forName("java.lang.Character"));
                try {
                    sWrapper.add(Class.forName("java.lang.Byte"));
                    try {
                        sWrapper.add(Class.forName("java.lang.Short"));
                        try {
                            sWrapper.add(Class.forName("java.lang.Integer"));
                            try {
                                sWrapper.add(Class.forName("java.lang.Long"));
                                try {
                                    sWrapper.add(Class.forName("java.lang.Float"));
                                    try {
                                        sWrapper.add(Class.forName("java.lang.Double"));
                                        try {
                                            sWrapper.add(Class.forName("java.lang.Void"));
                                            try {
                                                sImmutable.add(Class.forName("java.lang.String"));
                                                try {
                                                    sImmutable.add(Class.forName("java.math.BigInteger"));
                                                    try {
                                                        sImmutable.add(Class.forName("java.math.BigDecimal"));
                                                    } catch (ClassNotFoundException e2) {
                                                        throw new NoClassDefFoundError(e2.getMessage());
                                                    }
                                                } catch (ClassNotFoundException e3) {
                                                    throw new NoClassDefFoundError(e3.getMessage());
                                                }
                                            } catch (ClassNotFoundException e4) {
                                                throw new NoClassDefFoundError(e4.getMessage());
                                            }
                                        } catch (ClassNotFoundException e5) {
                                            throw new NoClassDefFoundError(e5.getMessage());
                                        }
                                    } catch (ClassNotFoundException e6) {
                                        throw new NoClassDefFoundError(e6.getMessage());
                                    }
                                } catch (ClassNotFoundException e7) {
                                    throw new NoClassDefFoundError(e7.getMessage());
                                }
                            } catch (ClassNotFoundException e8) {
                                throw new NoClassDefFoundError(e8.getMessage());
                            }
                        } catch (ClassNotFoundException e9) {
                            throw new NoClassDefFoundError(e9.getMessage());
                        }
                    } catch (ClassNotFoundException e10) {
                        throw new NoClassDefFoundError(e10.getMessage());
                    }
                } catch (ClassNotFoundException e11) {
                    throw new NoClassDefFoundError(e11.getMessage());
                }
            } catch (ClassNotFoundException e12) {
                throw new NoClassDefFoundError(e12.getMessage());
            }
        } catch (ClassNotFoundException e13) {
            throw new NoClassDefFoundError(e13.getMessage());
        }
    }

    ReflectUtils() {
    }

    public static String fullClassName(Context context, String str) {
        return str.charAt(0) == '.' ? new StringBuffer().append(context.getPackageName()).append(str).toString() : str;
    }

    public static Object getEnclosingInstance(Object obj) {
        try {
            int i2 = -1;
            Class<?> enclosingClass = obj.getClass().getEnclosingClass();
            Object obj2 = obj;
            while (enclosingClass != null) {
                i2++;
                Field field = getField(obj2.getClass(), new StringBuffer().append("this$").append(i2).toString());
                field.setAccessible(true);
                Object obj3 = field.get(obj2);
                enclosingClass = enclosingClass.getEnclosingClass();
                obj2 = obj3;
            }
            return obj2;
        } catch (Throwable th) {
            return null;
        }
    }

    public static String getEnclosingInstanceName(Object obj) {
        int i2 = -1;
        for (Class<?> enclosingClass = obj.getClass().getEnclosingClass(); enclosingClass != null; enclosingClass = enclosingClass.getEnclosingClass()) {
            i2++;
        }
        if (i2 == -1) {
            return null;
        }
        return new StringBuffer().append("this$").append(i2).toString();
    }

    public static Field getField(Class<?> cls, String str) {
        Class<? super Object> cls2;
        while (cls2 != null) {
            try {
                return cls2.getDeclaredField(str);
            } catch (NoSuchFieldException e2) {
                Class<? super Object> superclass = cls2.getSuperclass();
                cls2 = cls;
                cls2 = superclass;
            }
        }
        return null;
    }

    public static Object getFieldValue(Class<?> cls, String str) {
        try {
            Field field = getField(cls, str);
            field.setAccessible(true);
            return field.get((Object) null);
        } catch (Throwable th) {
            return null;
        }
    }

    public static Object getFieldValue(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        if (str == null) {
            return null;
        }
        try {
            Field field = getField(obj.getClass(), str);
            if (field == null) {
                return null;
            }
            field.setAccessible(true);
            return field.get(obj);
        } catch (Throwable th) {
            return null;
        }
    }

    public static Object getFieldValue(Object obj, String... strArr) {
        if (strArr == null) {
            return null;
        }
        for (String fieldValue : strArr) {
            obj = getFieldValue(obj, fieldValue);
        }
        return obj;
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Class<? super Object> cls2;
        while (cls2 != null) {
            try {
                return cls2.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e2) {
                Class<? super Object> superclass = cls2.getSuperclass();
                cls2 = cls;
                cls2 = superclass;
            }
        }
        return null;
    }

    public static <T> T invokeConstructor(Class<T> cls) {
        return invokeConstructor(cls, new Class[0], new Object[0]);
    }

    public static <T> T invokeConstructor(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        if (cls == null) {
            return (Object) null;
        }
        if (clsArr == null) {
            return (Object) null;
        }
        if (objArr == null) {
            return (Object) null;
        }
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            if (declaredConstructor == null) {
                return (Object) null;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(objArr);
        } catch (Throwable th) {
            return (Object) null;
        }
    }

    public static Object invokeMethod(Object obj, String str) {
        return invokeMethod(obj, str, new Class[0], new Object[0]);
    }

    public static Object invokeMethod(Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        if (obj == null) {
            return null;
        }
        if (str == null) {
            return null;
        }
        if (clsArr == null) {
            return null;
        }
        if (objArr == null) {
            return null;
        }
        try {
            Method method = getMethod(obj.getClass(), str, clsArr);
            if (method != null) {
                return invokeMethod(method, obj, objArr);
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    public static Object invokeMethod(Method method, Object obj, Object... objArr) {
        try {
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            return null;
        }
    }

    public static Object invokeStaticMethod(Method method, Object... objArr) {
        return invokeMethod(method, (Object) null, objArr);
    }

    public static boolean isImmutable(Class<?> cls) {
        return sImmutable.contains(cls);
    }

    public static boolean isWrapper(Class<?> cls) {
        return sWrapper.contains(cls);
    }

    public static <T> T newInstance(Class<T> cls) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    public static <T> T newInstance(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(objArr);
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T newInstanceByClassName(String str) {
        Class<?> cls = null;
        SoftReference softReference = sCache.get(str);
        if (softReference != null) {
            cls = (Class) softReference.get();
        }
        if (cls == null) {
            try {
                cls = Class.forName(str);
                sCache.put(str, new SoftReference(cls));
            } catch (Throwable th) {
                throw new IllegalStateException(th);
            }
        }
        try {
            return cls.newInstance();
        } catch (Throwable th2) {
            throw new IllegalStateException(th2);
        }
    }

    @SuppressWarnings("UnnecessaryBoxing")
    public static Object newReturnInstance(Method method) throws InstantiationException, IllegalAccessException {
        Class<?> returnType = method.getReturnType();
        if (returnType == Boolean.TYPE) {
            return false;
        }
        if (returnType == Byte.TYPE) {
            return (byte) 0;
        }
        if (returnType == Character.TYPE) {
            return 0;
        }
        if (returnType == Short.TYPE) {
            return (short) 0;
        }
        if (returnType == Integer.TYPE) {
            return 0;
        }
        if (returnType == Long.TYPE) {
            return 0L;
        }
        if (returnType == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (returnType == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (returnType != Void.TYPE) {
            try {
                if (returnType != Class.forName("java.lang.Void")) {
                    return returnType.newInstance();
                }
            } catch (ClassNotFoundException e2) {
                throw new NoClassDefFoundError(e2.getMessage());
            }
        }
        return null;
    }

    public static boolean setFieldValue(Object obj, String str, Object obj2) {
        if (obj == null || str == null) {
            return false;
        }
        try {
            Field field = getField(obj.getClass(), str);
            if (field == null) {
                return false;
            }
            field.setAccessible(true);
            field.set(obj, obj2);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }
}
