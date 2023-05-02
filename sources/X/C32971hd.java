package X;

import java.security.AccessController;

/* renamed from: X.1hd  reason: invalid class name and case insensitive filesystem */
public class C32971hd {
    public static Class A00(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new C32981he(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
