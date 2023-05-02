package X;

/* renamed from: X.3AF  reason: invalid class name */
public final class AnonymousClass3AF {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r0 <= 0) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r4.add(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(java.io.BufferedReader r5) {
        /*
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
        L_0x0005:
            java.lang.String r2 = r5.readLine()
            if (r2 != 0) goto L_0x0010
            java.util.List r0 = X.C003101j.A0A(r4)
            return r0
        L_0x0010:
            java.lang.String r0 = "#"
            r3 = 0
            int r1 = X.C008603x.A03(r2, r0, r3)
            r0 = -1
            if (r1 == r0) goto L_0x0021
            java.lang.String r2 = r2.substring(r3, r1)
            X.C18450wi.A0B(r2)
        L_0x0021:
            java.lang.CharSequence r0 = X.C008603x.A04(r2)
            java.lang.String r2 = r0.toString()
        L_0x0029:
            int r0 = r2.length()
            if (r3 >= r0) goto L_0x004a
            char r1 = r2.charAt(r3)
            int r3 = r3 + 1
            r0 = 46
            if (r1 == r0) goto L_0x0029
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r1)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "Illegal service provider class name: "
            java.lang.String r0 = X.C18450wi.A06(r0, r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x004a:
            if (r0 <= 0) goto L_0x0005
            r4.add(r2)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AF.A00(java.io.BufferedReader):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C41191vO.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.C813647w.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a9, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        X.C41191vO.A00(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(java.lang.ClassLoader r9) {
        /*
            r8 = this;
            java.lang.Class<kotlinx.coroutines.android.AndroidDispatcherFactory> r4 = kotlinx.coroutines.android.AndroidDispatcherFactory.class
            java.lang.String r1 = r4.getName()     // Catch:{ all -> 0x0106 }
            java.lang.String r0 = "META-INF/services/"
            java.lang.String r0 = X.C18450wi.A06(r0, r1)     // Catch:{ all -> 0x0106 }
            java.util.Enumeration r0 = r9.getResources(r0)     // Catch:{ all -> 0x0106 }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ all -> 0x0106 }
            X.C18450wi.A0B(r0)     // Catch:{ all -> 0x0106 }
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0106 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0106 }
        L_0x001f:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x0106 }
            java.net.URL r1 = (java.net.URL) r1     // Catch:{ all -> 0x0106 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0106 }
            java.lang.String r0 = "jar"
            r6 = 0
            boolean r0 = X.C008703y.A0N(r3, r0)     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = "jar:file:"
            java.lang.String r2 = X.C008603x.A07(r3, r0, r3)     // Catch:{ all -> 0x0106 }
            r0 = 33
            int r1 = r2.indexOf(r0, r6)     // Catch:{ all -> 0x0106 }
            r0 = -1
            if (r1 == r0) goto L_0x004e
            java.lang.String r2 = r2.substring(r6, r1)     // Catch:{ all -> 0x0106 }
            X.C18450wi.A0B(r2)     // Catch:{ all -> 0x0106 }
        L_0x004e:
            java.lang.String r0 = "!/"
            java.lang.String r1 = X.C008603x.A07(r3, r0, r3)     // Catch:{ all -> 0x0106 }
            java.util.jar.JarFile r3 = new java.util.jar.JarFile     // Catch:{ all -> 0x0106 }
            r3.<init>(r2, r6)     // Catch:{ all -> 0x0106 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x009b }
            r0.<init>(r1)     // Catch:{ all -> 0x009b }
            java.io.InputStream r2 = r3.getInputStream(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = "UTF-8"
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x009b }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x009b }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x009b }
            r2.<init>(r0)     // Catch:{ all -> 0x009b }
            java.util.List r0 = A00(r2)     // Catch:{ all -> 0x0094 }
            r2.close()     // Catch:{ all -> 0x009b }
            r3.close()     // Catch:{ all -> 0x0092 }
            goto L_0x008e
        L_0x0079:
            java.io.InputStream r1 = r1.openStream()     // Catch:{ all -> 0x0106 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0106 }
            r0.<init>(r1)     // Catch:{ all -> 0x0106 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0106 }
            r2.<init>(r0)     // Catch:{ all -> 0x0106 }
            java.util.List r0 = A00(r2)     // Catch:{ all -> 0x00a7 }
            r2.close()     // Catch:{ all -> 0x0106 }
        L_0x008e:
            X.C003201k.A0J(r0, r5)     // Catch:{ all -> 0x0106 }
            goto L_0x001f
        L_0x0092:
            r2 = move-exception
            goto L_0x00a6
        L_0x0094:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            X.C41191vO.A00(r2, r1)     // Catch:{ all -> 0x009b }
            throw r0     // Catch:{ all -> 0x009b }
        L_0x009b:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x009d }
        L_0x009d:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x0105
        L_0x00a2:
            r0 = move-exception
            X.C813647w.A00(r2, r0)     // Catch:{ all -> 0x0106 }
        L_0x00a6:
            throw r2     // Catch:{ all -> 0x0106 }
        L_0x00a7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            X.C41191vO.A00(r2, r0)     // Catch:{ all -> 0x0106 }
            goto L_0x0105
        L_0x00ae:
            java.util.Set r1 = X.C003101j.A0F(r5)     // Catch:{ all -> 0x0106 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0106 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00eb
            java.util.ArrayList r6 = X.AnonymousClass1J9.A0N(r1)     // Catch:{ all -> 0x0106 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x0106 }
        L_0x00c2:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = X.AnonymousClass000.A0m(r5)     // Catch:{ all -> 0x0106 }
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0, r3, r9)     // Catch:{ all -> 0x0106 }
            boolean r0 = r4.isAssignableFrom(r2)     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x00f2
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x0106 }
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r0)     // Catch:{ all -> 0x0106 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x0106 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x0106 }
            java.lang.Object r0 = r4.cast(r0)     // Catch:{ all -> 0x0106 }
            r6.add(r0)     // Catch:{ all -> 0x0106 }
            goto L_0x00c2
        L_0x00eb:
            java.lang.String r0 = "No providers were loaded with FastServiceLoader"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x0106 }
            goto L_0x0105
        L_0x00f2:
            java.lang.String r0 = "Expected service of class "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0106 }
            r1.append(r4)     // Catch:{ all -> 0x0106 }
            java.lang.String r0 = ", but found "
            java.lang.String r0 = X.AnonymousClass000.A0e(r2, r0, r1)     // Catch:{ all -> 0x0106 }
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x0106 }
        L_0x0105:
            throw r1     // Catch:{ all -> 0x0106 }
        L_0x0106:
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r4, r9)
            java.util.List r6 = X.C003101j.A0A(r0)
        L_0x010e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AF.A01(java.lang.ClassLoader):java.util.List");
    }
}
