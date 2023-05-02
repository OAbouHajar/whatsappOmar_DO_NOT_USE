package X;

import java.lang.reflect.Method;

/* renamed from: X.4d0  reason: invalid class name and case insensitive filesystem */
public class C89834d0 {
    public static final Method A00;
    public static final Method A01;
    public static final Method A02;
    public static final Method A03;
    public static final Method A04;
    public static final Method A05;
    public static final Method A06;
    public static final Method A07;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[SYNTHETIC, Splitter:B:23:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ad  */
    static {
        /*
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.String r2 = "add"
            android.os.Process.myUid()
            r4 = 1
            r5 = 0
            r3 = 0
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0017 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0017 }
            r1[r5] = r0     // Catch:{ Exception -> 0x0017 }
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)     // Catch:{ Exception -> 0x0017 }
            goto L_0x0018
        L_0x0017:
            r0 = r3
        L_0x0018:
            A00 = r0
            boolean r0 = X.C14320oy.A00()
            r9 = 2
            if (r0 == 0) goto L_0x0030
            java.lang.Class[] r1 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0030 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0030 }
            r1[r5] = r0     // Catch:{ Exception -> 0x0030 }
            r1[r4] = r10     // Catch:{ Exception -> 0x0030 }
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r0 = r3
        L_0x0031:
            A01 = r0
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r1 = "size"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x003e }
            java.lang.reflect.Method r0 = r2.getMethod(r1, r0)     // Catch:{ Exception -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r0 = r3
        L_0x003f:
            A02 = r0
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0050 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0050 }
            r2[r5] = r0     // Catch:{ Exception -> 0x0050 }
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r0 = "get"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch:{ Exception -> 0x0050 }
            goto L_0x0051
        L_0x0050:
            r0 = r3
        L_0x0051:
            A03 = r0
            boolean r0 = X.C14320oy.A00()
            if (r0 == 0) goto L_0x0068
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0068 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0068 }
            r2[r5] = r0     // Catch:{ Exception -> 0x0068 }
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r0 = "getName"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0069
        L_0x0068:
            r0 = r3
        L_0x0069:
            A04 = r0
            int r7 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            boolean r0 = X.AnonymousClass3K3.A1P(r7, r6)
            java.lang.String r8 = "WorkSourceUtil"
            if (r0 == 0) goto L_0x0088
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r1 = "createWorkChain"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0082 }
            java.lang.reflect.Method r0 = r2.getMethod(r1, r0)     // Catch:{ Exception -> 0x0082 }
            goto L_0x0089
        L_0x0082:
            r1 = move-exception
            java.lang.String r0 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r8, r0, r1)
        L_0x0088:
            r0 = r3
        L_0x0089:
            A05 = r0
            if (r7 < r6) goto L_0x00a8
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00a2 }
            java.lang.Class[] r1 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x00a2 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00a2 }
            r1[r5] = r0     // Catch:{ Exception -> 0x00a2 }
            r1[r4] = r10     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "addNode"
            java.lang.reflect.Method r0 = r2.getMethod(r0, r1)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00a9
        L_0x00a2:
            r1 = move-exception
            java.lang.String r0 = "Missing WorkChain class"
            android.util.Log.w(r8, r0, r1)
        L_0x00a8:
            r0 = r3
        L_0x00a9:
            A06 = r0
            if (r7 < r6) goto L_0x00ba
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x00ba }
            java.lang.reflect.Method r3 = r2.getMethod(r1, r0)     // Catch:{ Exception -> 0x00ba }
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x00ba }
        L_0x00ba:
            A07 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89834d0.<clinit>():void");
    }
}
