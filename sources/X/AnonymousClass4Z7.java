package X;

import java.lang.reflect.Method;

/* renamed from: X.4Z7  reason: invalid class name */
public final class AnonymousClass4Z7 {
    public static final Object A00;
    public static final Method A01;
    public static final Method A02;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066 A[ExcHandler: ThreadDeath (r0v1 'e' java.lang.ThreadDeath A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    static {
        /*
            r5 = 0
            java.lang.String r0 = "sun.misc.SharedSecrets"
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0, r3, r5)     // Catch:{ ThreadDeath -> 0x0066, all -> 0x0016 }
            java.lang.String r1 = "getJavaLangAccess"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ ThreadDeath -> 0x0066, all -> 0x0016 }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch:{ ThreadDeath -> 0x0066, all -> 0x0016 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ ThreadDeath -> 0x0066, all -> 0x0016 }
            java.lang.Object r5 = r1.invoke(r5, r0)     // Catch:{ ThreadDeath -> 0x0066, all -> 0x0016 }
        L_0x0016:
            A00 = r5
            r4 = 0
            if (r5 != 0) goto L_0x0021
            r6 = r4
        L_0x001c:
            A02 = r6
            if (r5 == 0) goto L_0x0063
            goto L_0x003d
        L_0x0021:
            r0 = 2
            java.lang.Class[] r3 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r3[r1] = r0
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0 = 1
            r3[r0] = r1
            java.lang.String r2 = "getStackTraceElement"
            r6 = 0
            java.lang.String r1 = "sun.misc.JavaLangAccess"
            r0 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r0, r4)     // Catch:{ ThreadDeath -> 0x0066, all -> 0x001c }
            java.lang.reflect.Method r6 = r0.getMethod(r2, r3)     // Catch:{ ThreadDeath -> 0x0066, all -> 0x001c }
            goto L_0x001c
        L_0x003d:
            java.lang.String r2 = "getStackTraceDepth"
            r6 = 1
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0063 }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r3 = 0
            r1[r3] = r0     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0063 }
            java.lang.String r0 = "sun.misc.JavaLangAccess"
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r4)     // Catch:{ ThreadDeath -> 0x0060 }
            java.lang.reflect.Method r2 = r0.getMethod(r2, r1)     // Catch:{ ThreadDeath -> 0x0060 }
            if (r2 == 0) goto L_0x0063
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0063 }
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0063 }
            r0.<init>()     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0063 }
            r1[r3] = r0     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0063 }
            r2.invoke(r5, r1)     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0063 }
            goto L_0x0062
        L_0x0060:
            r0 = move-exception
            throw r0     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0063 }
        L_0x0062:
            r4 = r2
        L_0x0063:
            A01 = r4
            return
        L_0x0066:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Z7.<clinit>():void");
    }
}
