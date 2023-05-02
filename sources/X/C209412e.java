package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.12e  reason: invalid class name and case insensitive filesystem */
public class C209412e {
    public C34421kE A00;
    public final C16180sb A01;
    public final C17130ua A02;
    public final C15860rz A03;
    public final C19950zG A04;
    public final C18490wm A05;
    public final C17670vS A06;
    public final AtomicBoolean A07 = new AtomicBoolean(false);

    public C209412e(C16180sb r3, C17130ua r4, C15860rz r5, C19950zG r6, C18490wm r7, C17670vS r8) {
        this.A01 = r3;
        this.A02 = r4;
        this.A06 = r8;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r7;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00e8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x012b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0130 */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0162  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:46:0x0116=Splitter:B:46:0x0116, B:58:0x012b=Splitter:B:58:0x012b} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:63:0x0130=Splitter:B:63:0x0130, B:53:0x0123=Splitter:B:53:0x0123, B:48:0x0119=Splitter:B:48:0x0119} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A00() {
        /*
            r17 = this;
            r5 = r17
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.A07
            r3 = 0
            r0 = 1
            boolean r0 = r4.compareAndSet(r3, r0)
            if (r0 == 0) goto L_0x016b
            X.1kE r0 = new X.1kE
            r0.<init>()
            r5.A00 = r0
            java.lang.String r6 = "PaymentBackgroundBatchFetcher: "
            r0 = 18
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.lang.String r2 = ""
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x005b
            r7 = 0
        L_0x0023:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0058
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r0 = "/payments/background"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x003f:
            r2.append(r0)
            java.lang.String r0 = "/all.zip"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r13 = r0.toString()
            goto L_0x006f
        L_0x0058:
            java.lang.String r0 = "https://static.whatsapp.net/payments/background"
            goto L_0x003f
        L_0x005b:
            java.lang.String r0 = "https://www."
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = ".facebook.com/cdn/cacheable/whatsapp"
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            goto L_0x0023
        L_0x006f:
            X.0zG r11 = r5.A04     // Catch:{ Exception -> 0x0131 }
            X.0vS r12 = r5.A06     // Catch:{ Exception -> 0x0131 }
            X.0rz r10 = r5.A03     // Catch:{ Exception -> 0x0131 }
            X.01D r0 = r10.A01     // Catch:{ Exception -> 0x0131 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0131 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ Exception -> 0x0131 }
            java.lang.String r8 = "payment_background_batch_etag"
            r14 = 0
            java.lang.String r15 = r0.getString(r8, r14)     // Catch:{ Exception -> 0x0131 }
            X.16H r11 = (X.AnonymousClass16H) r11     // Catch:{ Exception -> 0x0131 }
            r16 = r14
            X.1pl r9 = r11.A7K(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0131 }
            int r1 = r9.A6O()     // Catch:{ all -> 0x012c }
            r0 = 304(0x130, float:4.26E-43)
            java.lang.String r11 = "payment_backgrounds_batch_last_fetch_timestamp"
            if (r1 != r0) goto L_0x009f
            r10.A0x(r11)     // Catch:{ all -> 0x012c }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x012c }
            r7.<init>()     // Catch:{ all -> 0x012c }
            goto L_0x0119
        L_0x009f:
            int r1 = r9.A6O()     // Catch:{ all -> 0x012c }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00ab
            r9.A6O()     // Catch:{ all -> 0x012c }
            goto L_0x0123
        L_0x00ab:
            X.0ua r2 = r5.A02     // Catch:{ all -> 0x012c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x012c }
            r0 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x012c }
            java.io.InputStream r0 = r9.A9k(r2, r1, r0)     // Catch:{ all -> 0x012c }
            byte[] r0 = X.C30311c8.A08(r0)     // Catch:{ all -> 0x012c }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x012c }
            r2.<init>(r0)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = "PAY: PaymentBackgroundBatchFetcher/unzipBatchBackgrounds"
            java.util.zip.ZipInputStream r12 = new java.util.zip.ZipInputStream     // Catch:{ FileNotFoundException | IOException -> 0x00e9 }
            r12.<init>(r2)     // Catch:{ FileNotFoundException | IOException -> 0x00e9 }
            X.0sb r0 = r5.A01     // Catch:{ all -> 0x00e4 }
            java.io.File r7 = r0.A0A()     // Catch:{ all -> 0x00e4 }
            X.2Id r0 = new X.2Id     // Catch:{ all -> 0x00e4 }
            r0.<init>(r7)     // Catch:{ all -> 0x00e4 }
            r0.A00(r12)     // Catch:{ all -> 0x00e4 }
            java.util.Set r0 = r0.A01     // Catch:{ all -> 0x00e4 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x00e4 }
            r7.<init>(r0)     // Catch:{ all -> 0x00e4 }
            r12.close()     // Catch:{ FileNotFoundException | IOException -> 0x00e9 }
            goto L_0x00ee
        L_0x00e4:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            throw r0     // Catch:{ FileNotFoundException | IOException -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            com.whatsapp.util.Log.e(r1, r0)     // Catch:{ all -> 0x0127 }
            r7 = 0
        L_0x00ee:
            if (r7 == 0) goto L_0x0120
            r10.A0x(r11)     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = "etag"
            java.lang.String r1 = r9.AHk(r0)     // Catch:{ all -> 0x0127 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0127 }
            if (r0 != 0) goto L_0x0116
            if (r1 != 0) goto L_0x0102
            goto L_0x010b
        L_0x0102:
            android.content.SharedPreferences$Editor r0 = r10.A0K()     // Catch:{ all -> 0x0127 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r8, r1)     // Catch:{ all -> 0x0127 }
            goto L_0x0113
        L_0x010b:
            android.content.SharedPreferences$Editor r0 = r10.A0K()     // Catch:{ all -> 0x0127 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r8)     // Catch:{ all -> 0x0127 }
        L_0x0113:
            r0.apply()     // Catch:{ all -> 0x0127 }
        L_0x0116:
            r2.close()     // Catch:{ all -> 0x012c }
        L_0x0119:
            r9.close()     // Catch:{ Exception -> 0x0131 }
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0150
        L_0x0120:
            r2.close()     // Catch:{ all -> 0x012c }
        L_0x0123:
            r9.close()     // Catch:{ Exception -> 0x0131 }
            goto L_0x014c
        L_0x0127:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x012b }
        L_0x012b:
            throw r0     // Catch:{ all -> 0x012c }
        L_0x012c:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0130 }
        L_0x0130:
            throw r0     // Catch:{ Exception -> 0x0131 }
        L_0x0131:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0166 }
            r1.<init>()     // Catch:{ all -> 0x0166 }
            r1.append(r6)     // Catch:{ all -> 0x0166 }
            r1.append(r13)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = " Exception: "
            r1.append(r0)     // Catch:{ all -> 0x0166 }
            r1.append(r2)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0166 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0166 }
        L_0x014c:
            android.net.TrafficStats.clearThreadStatsTag()
            r7 = 0
        L_0x0150:
            X.1kE r2 = r5.A00
            if (r7 != 0) goto L_0x0162
            java.lang.String r1 = "PAY: PaymentBackgroundBatchFetcher/batch background download failed"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            r2.A01(r0)
        L_0x015e:
            r4.set(r3)
            return r7
        L_0x0162:
            r2.A02(r7)
            goto L_0x015e
        L_0x0166:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x016b:
            r1 = 0
            X.1kE r0 = r5.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0177 }
            if (r0 == 0) goto L_0x0177
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0177 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ InterruptedException | ExecutionException -> 0x0177 }
            return r0
        L_0x0177:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209412e.A00():java.util.Set");
    }
}
