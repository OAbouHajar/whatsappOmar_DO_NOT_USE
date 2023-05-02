package X;

import dalvik.system.PathClassLoader;

/* renamed from: X.3zz  reason: invalid class name and case insensitive filesystem */
public final class C79483zz extends PathClassLoader {
    public C79483zz(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public final Class loadClass(String str, boolean z2) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z2);
    }
}
