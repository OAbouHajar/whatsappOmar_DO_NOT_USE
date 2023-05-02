package X;

import java.io.File;

/* renamed from: X.2kW  reason: invalid class name and case insensitive filesystem */
public class C55852kW extends C16690tT {
    public Exception A00;
    public final C16180sb A01;
    public final AnonymousClass20R A02;
    public final String A03;
    public final String A04;

    public C55852kW(C16180sb r1, AnonymousClass20R r2, String str, String str2) {
        this.A01 = r1;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0074 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0092 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.A04     // Catch:{ IOException -> 0x0093 }
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x0093 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0093 }
            java.net.URLConnection r0 = r1.openConnection()     // Catch:{ IOException -> 0x0093 }
            r0.connect()     // Catch:{ IOException -> 0x0093 }
            java.io.InputStream r0 = r1.openStream()     // Catch:{ IOException -> 0x0093 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0093 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0093 }
            X.0sb r3 = r6.A01     // Catch:{ all -> 0x008e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r1.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r0 = X.C17970vw.A0H()     // Catch:{ all -> 0x008e }
            r1.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r2 = r6.A03     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "image/gif"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "video/mp4"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = ".mp4"
        L_0x003a:
            r1.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x008e }
            java.io.File r5 = r3.A0N(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x008e }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x008e }
            r3.<init>(r0)     // Catch:{ all -> 0x008e }
            goto L_0x0052
        L_0x004f:
            java.lang.String r0 = ".gif"
            goto L_0x003a
        L_0x0052:
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0070 }
            int r1 = r4.read(r2)     // Catch:{ all -> 0x0070 }
        L_0x005a:
            r0 = -1
            if (r1 == r0) goto L_0x0066
            r0 = 0
            r3.write(r2, r0, r1)     // Catch:{ all -> 0x0070 }
            int r1 = r4.read(r2)     // Catch:{ all -> 0x0070 }
            goto L_0x005a
        L_0x0066:
            r3.flush()     // Catch:{ all -> 0x0070 }
            r3.close()     // Catch:{ all -> 0x008e }
            r4.close()     // Catch:{ IOException -> 0x0093 }
            return r5
        L_0x0070:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0074 }
        L_0x0074:
            throw r0     // Catch:{ all -> 0x008e }
        L_0x0075:
            java.lang.String r0 = "Unexpected info type ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r1.<init>(r0)     // Catch:{ all -> 0x008e }
            r1.append(r2)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x008e }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008e }
            r0.<init>(r1)     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ all -> 0x008e }
        L_0x008e:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0092 }
        L_0x0092:
            throw r0     // Catch:{ IOException -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            r6.A00 = r0
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55852kW.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        File file = (File) obj;
        if (file != null) {
            this.A02.ARL(file, this.A04, (byte[]) null);
            return;
        }
        Exception exc = this.A00;
        if (exc != null) {
            this.A02.AQu(exc);
        }
    }
}
