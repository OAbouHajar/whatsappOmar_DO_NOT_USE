package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* renamed from: X.0Vp  reason: invalid class name and case insensitive filesystem */
public class C06390Vp {
    public static Map A00 = AnonymousClass000.A0x();
    public static Map A01 = AnonymousClass000.A0x();

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        if (r0.booleanValue() != false) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.lang.Class r9) {
        /*
            java.util.Map r5 = A00
            java.lang.Object r0 = r5.get(r9)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000f
            int r0 = r0.intValue()
            return r0
        L_0x000f:
            java.lang.String r0 = r9.getCanonicalName()
            r6 = 1
            if (r0 == 0) goto L_0x0094
            java.lang.Package r0 = r9.getPackage()     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            java.lang.String r7 = r9.getCanonicalName()     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            if (r0 == 0) goto L_0x004a
            java.lang.String r4 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        L_0x0024:
            boolean r3 = r4.isEmpty()     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            if (r3 != 0) goto L_0x0034
            int r0 = r4.length()     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            int r0 = r0 + 1
            java.lang.String r7 = r7.substring(r0)     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        L_0x0034:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            java.lang.String r2 = "."
            java.lang.String r0 = "_"
            java.lang.String r0 = r7.replace(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            java.lang.String r0 = "_LifecycleAdapter"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            goto L_0x004d
        L_0x004a:
            java.lang.String r4 = ""
            goto L_0x0024
        L_0x004d:
            if (r3 != 0) goto L_0x005a
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r4)     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        L_0x005a:
            java.lang.Class r2 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            r0 = 0
            r1[r0] = r9     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            boolean r0 = r2.isAccessible()     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
            if (r0 != 0) goto L_0x0070
            r2.setAccessible(r6)     // Catch:{ ClassNotFoundException -> 0x0082, NoSuchMethodException -> 0x007b }
        L_0x0070:
            java.util.Map r1 = A01
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r1.put(r9, r0)
            goto L_0x0112
        L_0x007b:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x0082:
            X.0W6 r8 = X.AnonymousClass0W6.A02
            java.util.Map r7 = r8.A01
            java.lang.Object r0 = r7.get(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x009d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bb
        L_0x0094:
            r1 = 1
        L_0x0095:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.put(r9, r0)
            return r1
        L_0x009d:
            java.lang.reflect.Method[] r4 = r9.getDeclaredMethods()     // Catch:{ NoClassDefFoundError -> 0x0114 }
            int r3 = r4.length
            r2 = 0
        L_0x00a3:
            if (r2 >= r3) goto L_0x00b6
            r1 = r4[r2]
            java.lang.Class<androidx.lifecycle.OnLifecycleEvent> r0 = androidx.lifecycle.OnLifecycleEvent.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            if (r0 == 0) goto L_0x00b3
            r8.A01(r9, r4)
            goto L_0x0094
        L_0x00b3:
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00b6:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.put(r9, r0)
        L_0x00bb:
            java.lang.Class r1 = r9.getSuperclass()
            r7 = 0
            if (r1 == 0) goto L_0x00dd
            java.lang.Class<X.01o> r0 = X.C003501o.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x00dd
            int r0 = A00(r1)
            if (r0 == r6) goto L_0x0094
            java.util.Map r0 = A01
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
        L_0x00dd:
            java.lang.Class[] r4 = r9.getInterfaces()
            int r3 = r4.length
            r2 = 0
        L_0x00e3:
            if (r2 >= r3) goto L_0x010b
            r1 = r4[r2]
            if (r1 == 0) goto L_0x0108
            java.lang.Class<X.01o> r0 = X.C003501o.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0108
            int r0 = A00(r1)
            if (r0 == r6) goto L_0x0094
            if (r7 != 0) goto L_0x00fd
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
        L_0x00fd:
            java.util.Map r0 = A01
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.addAll(r0)
        L_0x0108:
            int r2 = r2 + 1
            goto L_0x00e3
        L_0x010b:
            if (r7 == 0) goto L_0x0094
            java.util.Map r0 = A01
            r0.put(r9, r7)
        L_0x0112:
            r1 = 2
            goto L_0x0095
        L_0x0114:
            r1 = move-exception
            java.lang.String r0 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06390Vp.A00(java.lang.Class):int");
    }

    public static C11910jX A01(Object obj, Constructor constructor) {
        try {
            constructor.newInstance(new Object[]{obj});
            return null;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
