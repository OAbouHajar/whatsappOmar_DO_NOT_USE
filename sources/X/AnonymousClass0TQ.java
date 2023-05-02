package X;

/* renamed from: X.0TQ  reason: invalid class name */
public class AnonymousClass0TQ {
    public static final long A00;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r3 > 0) goto L_0x0014;
     */
    static {
        /*
            r8 = 100
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0018
            int r0 = android.system.OsConstants._SC_CLK_TCK
            long r3 = android.system.Os.sysconf(r0)
        L_0x000e:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
        L_0x0014:
            r8 = r3
        L_0x0015:
            A00 = r8
            return
        L_0x0018:
            java.lang.String r1 = "_SC_CLK_TCK"
            java.lang.String r0 = "libcore.io.OsConstants"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            r2 = 0
            int r7 = r0.getInt(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.String r0 = "libcore.io.Libcore"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.String r0 = "libcore.io.Os"
            java.lang.Class r6 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.String r0 = "os"
            java.lang.reflect.Field r0 = r1.getField(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.Object r5 = r0.get(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.String r4 = "sysconf"
            r3 = 1
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            r2 = 0
            java.lang.reflect.Method r1 = X.AnonymousClass000.A0s(r6, r0, r4, r1, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            X.AnonymousClass000.A1M(r0, r7, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.Object r0 = r1.invoke(r5, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            long r3 = r0.longValue()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            goto L_0x000e
        L_0x005b:
            r3 = 100
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0TQ.<clinit>():void");
    }
}
