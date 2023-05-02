package X;

import java.lang.reflect.InvocationTargetException;

/* renamed from: X.06B  reason: invalid class name */
public class AnonymousClass06B {
    public static final AnonymousClass00O A01 = new AnonymousClass00O();
    public final /* synthetic */ AnonymousClass02C A00;

    public AnonymousClass06B(AnonymousClass02C r1) {
        this.A00 = r1;
    }

    public AnonymousClass01A A00(String str) {
        C11080iA r1;
        try {
            ClassLoader classLoader = this.A00.A07.A01.getClassLoader();
            try {
                AnonymousClass00O r0 = A01;
                AnonymousClass00O r2 = (AnonymousClass00O) r0.get(classLoader);
                if (r2 == null) {
                    r2 = new AnonymousClass00O();
                    r0.put(classLoader, r2);
                }
                Class<?> cls = (Class) r2.get(str);
                if (cls == null) {
                    cls = Class.forName(str, false, classLoader);
                    r2.put(str, cls);
                }
                return (AnonymousClass01A) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to instantiate fragment ");
                sb.append(str);
                sb.append(": make sure class name exists");
                r1 = new C11080iA(sb.toString(), e2);
                throw r1;
            } catch (ClassCastException e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to instantiate fragment ");
                sb2.append(str);
                sb2.append(": make sure class is a valid subclass of Fragment");
                r1 = new C11080iA(sb2.toString(), e3);
                throw r1;
            }
        } catch (InstantiationException e4) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to instantiate fragment ");
            sb3.append(str);
            sb3.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C11080iA(sb3.toString(), e4);
        } catch (IllegalAccessException e5) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unable to instantiate fragment ");
            sb4.append(str);
            sb4.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C11080iA(sb4.toString(), e5);
        } catch (NoSuchMethodException e6) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Unable to instantiate fragment ");
            sb5.append(str);
            sb5.append(": could not find Fragment constructor");
            throw new C11080iA(sb5.toString(), e6);
        } catch (InvocationTargetException e7) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Unable to instantiate fragment ");
            sb6.append(str);
            sb6.append(": calling Fragment constructor caused an exception");
            throw new C11080iA(sb6.toString(), e7);
        }
    }
}
