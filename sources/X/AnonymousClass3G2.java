package X;

/* renamed from: X.3G2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G2 implements AnonymousClass2A2 {
    public final /* synthetic */ C19040xf A00;

    public /* synthetic */ AnonymousClass3G2(C19040xf r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x004b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C90774em Acg(X.C29561ap r6) {
        /*
            r5 = this;
            X.0xf r0 = r5.A00
            java.lang.String r1 = r6.A02
            X.16X r3 = r0.A0E
            java.lang.String r4 = r6.A06
            java.lang.String r0 = "prewarmer/sendrequest/checking authority "
            java.lang.String r0 = X.C13680ns.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
            android.net.Uri$Builder r2 = new android.net.Uri$Builder     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
            r2.<init>()     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
            java.lang.String r0 = "https"
            android.net.Uri$Builder r0 = r2.scheme(r0)     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
            android.net.Uri$Builder r1 = r0.encodedAuthority(r1)     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
            java.lang.String r0 = "prewarm"
            r1.appendPath(r0)     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
            java.lang.String r0 = X.C13700nu.A0G(r2)     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
            r2.<init>(r0)     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
            X.0zs r1 = r3.A00     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
            java.lang.String r0 = "POST"
            X.1pl r1 = r1.A01(r4, r0, r2)     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0047 }
            r1.A6O()     // Catch:{ all -> 0x0047 }
            r1.close()     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
            goto L_0x0064
        L_0x0047:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x004b }
        L_0x004b:
            throw r0     // Catch:{ MalformedURLException -> 0x005e, IOException -> 0x004c }
        L_0x004c:
            r2 = move-exception
            X.0vT r1 = r3.A01     // Catch:{ all -> 0x006c }
            boolean r0 = r1.A02(r2)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0058
            r1.A00()     // Catch:{ all -> 0x006c }
        L_0x0058:
            java.lang.String r0 = "prewarmer/sendrequest/error opening connection"
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x006c }
            goto L_0x0064
        L_0x005e:
            r1 = move-exception
            java.lang.String r0 = "prewarmer/sendrequest/error forming URL"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x006c }
        L_0x0064:
            android.net.TrafficStats.clearThreadStatsTag()
            X.4em r0 = X.C90774em.A02(r6)
            return r0
        L_0x006c:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3G2.Acg(X.1ap):X.4em");
    }
}
