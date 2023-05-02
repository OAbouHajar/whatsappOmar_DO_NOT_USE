package X;

/* renamed from: X.1eH  reason: invalid class name and case insensitive filesystem */
public final class C31491eH extends C31501eI {
    public final AnonymousClass3U3[] A00;
    public final /* synthetic */ C31231dl A01;

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b9, code lost:
        r5.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C31491eH(X.C31231dl r16, X.C31221dk r17) {
        /*
            r15 = this;
            r0 = r16
            r15.A01 = r0
            r15.<init>()
            android.content.Context r2 = r0.A03
            java.lang.String r0 = "/data/local/tmp/exopackage/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getPackageName()
            r1.append(r0)
            java.lang.String r0 = "/native-libs/"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r12 = new java.io.File
            r12.<init>(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.lang.String[] r11 = X.C31331dy.A02()
            int r9 = r11.length
            r3 = 0
            r8 = 0
        L_0x0036:
            if (r8 >= r9) goto L_0x00e6
            r1 = r11[r8]
            java.io.File r6 = new java.io.File
            r6.<init>(r12, r1)
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L_0x00bc
            r10.add(r1)
            java.lang.String r0 = "metadata.txt"
            java.io.File r1 = new java.io.File
            r1.<init>(r6, r0)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L_0x00bc
            java.io.FileReader r5 = new java.io.FileReader
            r5.<init>(r1)
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x00e1 }
            r4.<init>(r5)     // Catch:{ all -> 0x00e1 }
        L_0x005f:
            java.lang.String r2 = r4.readLine()     // Catch:{ all -> 0x00dc }
            if (r2 == 0) goto L_0x00b6
            int r0 = r2.length()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x005f
            r0 = 32
            int r14 = r2.indexOf(r0)     // Catch:{ all -> 0x00dc }
            r0 = -1
            if (r14 == r0) goto L_0x00c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r1.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r2.substring(r3, r14)     // Catch:{ all -> 0x00dc }
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = ".so"
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x00dc }
            int r13 = r7.size()     // Catch:{ all -> 0x00dc }
            r1 = 0
        L_0x008e:
            if (r1 >= r13) goto L_0x00a1
            java.lang.Object r0 = r7.get(r1)     // Catch:{ all -> 0x00dc }
            X.3U3 r0 = (X.AnonymousClass3U3) r0     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x00dc }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x00b4
            int r1 = r1 + 1
            goto L_0x008e
        L_0x00a1:
            int r0 = r14 + 1
            java.lang.String r2 = r2.substring(r0)     // Catch:{ all -> 0x00dc }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00dc }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x00dc }
            X.3U3 r0 = new X.3U3     // Catch:{ all -> 0x00dc }
            r0.<init>(r1, r3, r2)     // Catch:{ all -> 0x00dc }
            r7.add(r0)     // Catch:{ all -> 0x00dc }
        L_0x00b4:
            r3 = 0
            goto L_0x005f
        L_0x00b6:
            r4.close()     // Catch:{ all -> 0x00e1 }
            r5.close()
        L_0x00bc:
            int r8 = r8 + 1
            goto L_0x0036
        L_0x00c0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r1.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "illegal line in exopackage metadata: ["
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            r1.append(r2)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00dc }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00dc }
            r0.<init>(r1)     // Catch:{ all -> 0x00dc }
            throw r0     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            throw r0
        L_0x00e6:
            int r0 = r10.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r10.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1 = r17
            r1.A02 = r0
            int r0 = r7.size()
            X.3U3[] r0 = new X.AnonymousClass3U3[r0]
            java.lang.Object[] r0 = r7.toArray(r0)
            X.3U3[] r0 = (X.AnonymousClass3U3[]) r0
            r15.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31491eH.<init>(X.1dl, X.1dk):void");
    }
}
