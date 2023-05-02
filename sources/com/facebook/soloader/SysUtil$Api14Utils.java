package com.facebook.soloader;

import dalvik.system.BaseDexClassLoader;

public class SysUtil$Api14Utils {
    public static String A00() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
            } catch (Exception e2) {
                throw new RuntimeException("Cannot call getLdLibraryPath", e2);
            }
        } else {
            StringBuilder sb = new StringBuilder("ClassLoader ");
            sb.append(classLoader.getClass().getName());
            sb.append(" should be of type BaseDexClassLoader");
            throw new IllegalStateException(sb.toString());
        }
    }
}
