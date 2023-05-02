package X;

import java.lang.reflect.Method;

/* renamed from: X.40f  reason: invalid class name and case insensitive filesystem */
public class C795340f extends ClassLoader {
    public static final String A00 = C90574eO.class.getName();
    public static final Class[] A01;

    static {
        Class cls = Integer.TYPE;
        A01 = new Class[]{String.class, byte[].class, cls, cls};
    }

    public C795340f(ClassLoader classLoader) {
        super(classLoader);
    }

    public Class A00(String str, byte[] bArr) {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("defineClass", A01);
            declaredMethod.setAccessible(true);
            ClassLoader parent = getParent();
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = bArr;
            AnonymousClass000.A1M(objArr, 0, 2);
            AnonymousClass000.A1M(objArr, bArr.length, 3);
            return (Class) declaredMethod.invoke(parent, objArr);
        } catch (Exception unused) {
            return defineClass(str, bArr, 0, bArr.length);
        }
    }

    public synchronized Class loadClass(String str, boolean z2) {
        return str.equals(A00) ? C90574eO.class : super.loadClass(str, z2);
    }
}
