package com.facebook.redex;

import android.content.Context;
import java.util.concurrent.Callable;

public class IDxCallableShape1S2100000_I1 implements Callable {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public IDxCallableShape1S2100000_I1(Context context, String str, String str2, int i2) {
        this.A03 = i2;
        this.A00 = context;
        this.A02 = str;
        this.A01 = str2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:3|(2:5|1b)|22|(11:24|25|26|(1:28)|30|31|(1:33)|34|(1:36)(1:40)|37|(3:39|105|(2:107|108)(1:129)))|41|43|44|45|46|(12:48|49|(1:51)|52|(2:60|(6:62|100|101|(1:128)|105|(0)(0))(1:63))(2:56|(6:58|100|101|(0)|105|(0)(0))(1:59))|64|(2:66|(1:68))|100|101|(0)|105|(0)(0))|69|70|(7:72|95|100|101|(0)|105|(0)(0))|73|74|(3:75|76|(1:78)(10:79|80|81|82|95|100|101|(0)|105|(0)(0)))) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        if (r8.exists() != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01fa, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        X.C05770Sy.A01("get error failed ", r1);
        r0 = r1.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0214, code lost:
        if (r7 == null) goto L_0x021e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0196 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x01a3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01ea */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x01f9 */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a1 A[Catch:{ IOException -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01de A[Catch:{ Exception -> 0x01f3, all -> 0x01f5 }, LOOP:0: B:75:0x01d8->B:78:0x01de, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e7 A[SYNTHETIC, Splitter:B:79:0x01e7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r10 = this;
            int r0 = r10.A03
            if (r0 == 0) goto L_0x0011
            java.lang.Object r2 = r10.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = r10.A02
            java.lang.String r0 = r10.A01
            X.0Um r4 = X.AnonymousClass0XN.A01(r2, r1, r0)
        L_0x0010:
            return r4
        L_0x0011:
            java.lang.Object r4 = r10.A00
            android.content.Context r4 = (android.content.Context) r4
            X.0O9 r6 = X.AnonymousClass0NI.A02
            if (r6 != 0) goto L_0x0045
            java.lang.Class<X.0O9> r3 = X.AnonymousClass0O9.class
            monitor-enter(r3)
            X.0O9 r6 = X.AnonymousClass0NI.A02     // Catch:{ all -> 0x022f }
            if (r6 != 0) goto L_0x0044
            X.0Uk r2 = X.AnonymousClass0NI.A01     // Catch:{ all -> 0x022f }
            if (r2 != 0) goto L_0x0038
            java.lang.Class<X.0Uk> r1 = X.C06140Uk.class
            monitor-enter(r1)     // Catch:{ all -> 0x022f }
            X.0Uk r2 = X.AnonymousClass0NI.A01     // Catch:{ all -> 0x022c }
            if (r2 != 0) goto L_0x0037
            X.0NX r0 = new X.0NX     // Catch:{ all -> 0x022c }
            r0.<init>(r4)     // Catch:{ all -> 0x022c }
            X.0Uk r2 = new X.0Uk     // Catch:{ all -> 0x022c }
            r2.<init>(r0)     // Catch:{ all -> 0x022c }
            X.AnonymousClass0NI.A01 = r2     // Catch:{ all -> 0x022c }
        L_0x0037:
            monitor-exit(r1)     // Catch:{ all -> 0x022c }
        L_0x0038:
            X.0MT r0 = new X.0MT     // Catch:{ all -> 0x022f }
            r0.<init>()     // Catch:{ all -> 0x022f }
            X.0O9 r6 = new X.0O9     // Catch:{ all -> 0x022f }
            r6.<init>(r0, r2)     // Catch:{ all -> 0x022f }
            X.AnonymousClass0NI.A02 = r6     // Catch:{ all -> 0x022f }
        L_0x0044:
            monitor-exit(r3)     // Catch:{ all -> 0x022f }
        L_0x0045:
            java.lang.String r5 = r10.A02
            java.lang.String r3 = r10.A01
            r4 = 0
            if (r3 == 0) goto L_0x00b7
            X.0Uk r9 = r6.A01
            java.io.File r1 = r9.A01()     // Catch:{ FileNotFoundException -> 0x00b7 }
            X.0KY r7 = X.AnonymousClass0KY.JSON     // Catch:{ FileNotFoundException -> 0x00b7 }
            r2 = 0
            java.lang.String r0 = X.C06140Uk.A00(r7, r5, r2)     // Catch:{ FileNotFoundException -> 0x00b7 }
            java.io.File r8 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00b7 }
            r8.<init>(r1, r0)     // Catch:{ FileNotFoundException -> 0x00b7 }
            boolean r0 = r8.exists()     // Catch:{ FileNotFoundException -> 0x00b7 }
            if (r0 != 0) goto L_0x0079
            java.io.File r1 = r9.A01()     // Catch:{ FileNotFoundException -> 0x00b7 }
            X.0KY r0 = X.AnonymousClass0KY.ZIP     // Catch:{ FileNotFoundException -> 0x00b7 }
            java.lang.String r0 = X.C06140Uk.A00(r0, r5, r2)     // Catch:{ FileNotFoundException -> 0x00b7 }
            java.io.File r8 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00b7 }
            r8.<init>(r1, r0)     // Catch:{ FileNotFoundException -> 0x00b7 }
            boolean r0 = r8.exists()     // Catch:{ FileNotFoundException -> 0x00b7 }
            if (r0 == 0) goto L_0x00b7
        L_0x0079:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00b7 }
            r2.<init>(r8)     // Catch:{ FileNotFoundException -> 0x00b7 }
            java.lang.String r1 = r8.getAbsolutePath()
            java.lang.String r0 = ".zip"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x008c
            X.0KY r7 = X.AnonymousClass0KY.ZIP
        L_0x008c:
            r8.getAbsolutePath()
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r7, r2)
            java.lang.Object r2 = r0.first
            java.lang.Object r1 = r0.second
            java.io.InputStream r1 = (java.io.InputStream) r1
            X.0KY r0 = X.AnonymousClass0KY.ZIP
            if (r2 != r0) goto L_0x00b2
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            r0.<init>(r1)
            X.0Um r0 = X.AnonymousClass0XN.A04(r5, r0)
        L_0x00a7:
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x00b7
            X.0Um r4 = new X.0Um
            r4.<init>((java.lang.Object) r0)
            goto L_0x0220
        L_0x00b2:
            X.0Um r0 = X.AnonymousClass0XN.A03(r1, r5)
            goto L_0x00a7
        L_0x00b7:
            java.lang.String r2 = "LottieFetchResult close failed "
            r7 = 0
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x020e }
            r0.<init>(r5)     // Catch:{ Exception -> 0x020e }
            java.net.URLConnection r1 = r0.openConnection()     // Catch:{ Exception -> 0x020e }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x020e }
            java.lang.String r0 = "GET"
            r1.setRequestMethod(r0)     // Catch:{ Exception -> 0x020e }
            r1.connect()     // Catch:{ Exception -> 0x020e }
            X.0ep r0 = new X.0ep     // Catch:{ Exception -> 0x020e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x020e }
            r7 = r0
            java.net.HttpURLConnection r8 = r0.A00     // Catch:{ IOException -> 0x0196 }
            int r0 = r8.getResponseCode()     // Catch:{ IOException -> 0x0196 }
            int r1 = r0 / 100
            r0 = 2
            if (r1 != r0) goto L_0x0196
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ Exception -> 0x020e }
            java.lang.String r1 = r8.getContentType()     // Catch:{ Exception -> 0x020e }
            if (r1 != 0) goto L_0x00ea
            java.lang.String r1 = "application/json"
        L_0x00ea:
            java.lang.String r0 = "application/zip"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x020e }
            if (r0 != 0) goto L_0x0126
            java.lang.String r0 = "\\?"
            java.lang.String[] r1 = r5.split(r0)     // Catch:{ Exception -> 0x020e }
            r0 = 0
            r1 = r1[r0]     // Catch:{ Exception -> 0x020e }
            java.lang.String r0 = ".lottie"
            boolean r0 = r1.endsWith(r0)     // Catch:{ Exception -> 0x020e }
            if (r0 != 0) goto L_0x0126
            X.0KY r8 = X.AnonymousClass0KY.JSON     // Catch:{ Exception -> 0x020e }
            if (r3 != 0) goto L_0x010d
            X.0Um r4 = X.AnonymousClass0XN.A03(r9, r4)     // Catch:{ Exception -> 0x020e }
            goto L_0x0216
        L_0x010d:
            X.0Uk r6 = r6.A01     // Catch:{ Exception -> 0x020e }
            java.io.File r0 = r6.A02(r8, r9, r5)     // Catch:{ Exception -> 0x020e }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x020e }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x020e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x020e }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x020e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x020e }
            X.0Um r4 = X.AnonymousClass0XN.A03(r0, r5)     // Catch:{ Exception -> 0x020e }
            goto L_0x0149
        L_0x0126:
            X.0KY r8 = X.AnonymousClass0KY.ZIP     // Catch:{ Exception -> 0x020e }
            if (r3 != 0) goto L_0x0135
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x020e }
            r0.<init>(r9)     // Catch:{ Exception -> 0x020e }
            X.0Um r4 = X.AnonymousClass0XN.A04(r4, r0)     // Catch:{ Exception -> 0x020e }
            goto L_0x0216
        L_0x0135:
            X.0Uk r6 = r6.A01     // Catch:{ Exception -> 0x020e }
            java.io.File r0 = r6.A02(r8, r9, r5)     // Catch:{ Exception -> 0x020e }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x020e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x020e }
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x020e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x020e }
            X.0Um r4 = X.AnonymousClass0XN.A04(r5, r0)     // Catch:{ Exception -> 0x020e }
        L_0x0149:
            java.lang.Object r0 = r4.A00     // Catch:{ Exception -> 0x020e }
            if (r0 == 0) goto L_0x0216
            r0 = 1
            java.lang.String r1 = X.C06140Uk.A00(r8, r5, r0)     // Catch:{ Exception -> 0x020e }
            java.io.File r0 = r6.A01()     // Catch:{ Exception -> 0x020e }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x020e }
            r6.<init>(r0, r1)     // Catch:{ Exception -> 0x020e }
            java.lang.String r5 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x020e }
            java.lang.String r1 = ".temp"
            java.lang.String r0 = ""
            java.lang.String r0 = r5.replace(r1, r0)     // Catch:{ Exception -> 0x020e }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x020e }
            r5.<init>(r0)     // Catch:{ Exception -> 0x020e }
            boolean r0 = r6.renameTo(r5)     // Catch:{ Exception -> 0x020e }
            if (r0 != 0) goto L_0x0216
            java.lang.String r0 = "Unable to rename cache file "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ Exception -> 0x020e }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x020e }
            r1.append(r0)     // Catch:{ Exception -> 0x020e }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ Exception -> 0x020e }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x020e }
            r1.append(r0)     // Catch:{ Exception -> 0x020e }
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ Exception -> 0x020e }
            X.C05770Sy.A00(r0)     // Catch:{ Exception -> 0x020e }
            goto L_0x0216
        L_0x0196:
            java.net.HttpURLConnection r0 = r7.A00     // Catch:{ IOException -> 0x01a3 }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x01a3 }
            int r1 = r0 / 100
            r0 = 2
            if (r1 != r0) goto L_0x01a3
            r0 = 0
            goto L_0x0204
        L_0x01a3:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x01fa }
            java.lang.String r0 = "Unable to fetch "
            r5.append(r0)     // Catch:{ IOException -> 0x01fa }
            java.net.HttpURLConnection r1 = r7.A00     // Catch:{ IOException -> 0x01fa }
            java.net.URL r0 = r1.getURL()     // Catch:{ IOException -> 0x01fa }
            r5.append(r0)     // Catch:{ IOException -> 0x01fa }
            java.lang.String r0 = ". Failed with "
            r5.append(r0)     // Catch:{ IOException -> 0x01fa }
            int r0 = r1.getResponseCode()     // Catch:{ IOException -> 0x01fa }
            r5.append(r0)     // Catch:{ IOException -> 0x01fa }
            java.lang.String r0 = "\n"
            r5.append(r0)     // Catch:{ IOException -> 0x01fa }
            java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ IOException -> 0x01fa }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x01fa }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01fa }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x01fa }
            r4.<init>(r0)     // Catch:{ IOException -> 0x01fa }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x01fa }
        L_0x01d8:
            java.lang.String r0 = r4.readLine()     // Catch:{ Exception -> 0x01f3 }
            if (r0 == 0) goto L_0x01e7
            r1.append(r0)     // Catch:{ Exception -> 0x01f3 }
            r0 = 10
            r1.append(r0)     // Catch:{ Exception -> 0x01f3 }
            goto L_0x01d8
        L_0x01e7:
            r4.close()     // Catch:{ Exception -> 0x01ea }
        L_0x01ea:
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x01fa }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r5)     // Catch:{ IOException -> 0x01fa }
            goto L_0x0204
        L_0x01f3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01f5 }
        L_0x01f5:
            r0 = move-exception
            r4.close()     // Catch:{ Exception -> 0x01f9 }
        L_0x01f9:
            throw r0     // Catch:{ IOException -> 0x01fa }
        L_0x01fa:
            r1 = move-exception
            java.lang.String r0 = "get error failed "
            X.C05770Sy.A01(r0, r1)     // Catch:{ Exception -> 0x020e }
            java.lang.String r0 = r1.getMessage()     // Catch:{ Exception -> 0x020e }
        L_0x0204:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ Exception -> 0x020e }
            X.0Um r4 = new X.0Um     // Catch:{ Exception -> 0x020e }
            r4.<init>((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x020e }
            goto L_0x0216
        L_0x020e:
            r0 = move-exception
            X.0Um r4 = new X.0Um     // Catch:{ all -> 0x0232 }
            r4.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x0232 }
            if (r7 == 0) goto L_0x021e
        L_0x0216:
            r7.close()     // Catch:{ IOException -> 0x021a }
            goto L_0x021e
        L_0x021a:
            r0 = move-exception
            X.C05770Sy.A01(r2, r0)
        L_0x021e:
            if (r3 == 0) goto L_0x0010
        L_0x0220:
            java.lang.Object r1 = r4.A00
            if (r1 == 0) goto L_0x0010
            X.0Tq r0 = X.C05950Tq.A01
            X.03L r0 = r0.A00
            r0.A06(r3, r1)
            return r4
        L_0x022c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x022c }
            throw r0     // Catch:{ all -> 0x022f }
        L_0x022f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x022f }
            throw r0
        L_0x0232:
            r1 = move-exception
            if (r7 == 0) goto L_0x023d
            r7.close()     // Catch:{ IOException -> 0x0239 }
            throw r1
        L_0x0239:
            r0 = move-exception
            X.C05770Sy.A01(r2, r0)
        L_0x023d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCallableShape1S2100000_I1.call():java.lang.Object");
    }
}
