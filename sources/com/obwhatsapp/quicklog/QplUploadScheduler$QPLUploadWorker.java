package com.obwhatsapp.quicklog;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass1A7;
import X.C16150sX;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class QplUploadScheduler$QPLUploadWorker extends Worker {
    public final AnonymousClass1A7 A00;

    public QplUploadScheduler$QPLUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = (AnonymousClass1A7) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).AKX.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01d8, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r1.A05.A8f(r3.getMessage());
        r1.A00 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01d8 A[ExcHandler: Exception | OutOfMemoryError (r3v10 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:31:0x00a5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass02Q A04() {
        /*
            r25 = this;
            r0 = r25
            X.1A7 r1 = r0.A00
            X.18g r0 = r1.A03
            java.util.concurrent.Semaphore r5 = r0.A05     // Catch:{ InterruptedException -> 0x0011 }
            r3 = 5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0011 }
            boolean r2 = r5.tryAcquire(r3, r2)     // Catch:{ InterruptedException -> 0x0011 }
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            if (r2 != 0) goto L_0x001a
            X.02P r1 = new X.02P
            r1.<init>()
            return r1
        L_0x001a:
            r2 = 0
            r1.A00 = r2     // Catch:{ all -> 0x022b }
            java.lang.String r10 = ".txt"
            java.io.File[] r9 = r0.A01(r10)     // Catch:{ all -> 0x022b }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x022b }
            long r3 = X.C225218g.A07     // Catch:{ all -> 0x022b }
            long r7 = r7 - r3
            r6 = 0
        L_0x002b:
            int r3 = r9.length     // Catch:{ all -> 0x022b }
            if (r6 >= r3) goto L_0x0040
            r3 = r9[r6]     // Catch:{ all -> 0x022b }
            long r4 = r3.lastModified()     // Catch:{ all -> 0x022b }
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x003d
            r3 = r9[r6]     // Catch:{ all -> 0x022b }
            r0.A00(r3)     // Catch:{ all -> 0x022b }
        L_0x003d:
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0040:
            java.io.File[] r8 = r0.A01(r10)     // Catch:{ all -> 0x022b }
            X.0tz r3 = r0.A01     // Catch:{ all -> 0x022b }
            android.content.Context r3 = r3.A00     // Catch:{ all -> 0x022b }
            java.io.File r4 = r3.getCacheDir()     // Catch:{ all -> 0x022b }
            java.lang.String r3 = "qpl"
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x022b }
            r7.<init>(r4, r3)     // Catch:{ all -> 0x022b }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x022b }
            r6.<init>()     // Catch:{ all -> 0x022b }
            int r13 = r8.length     // Catch:{ all -> 0x022b }
            r5 = 0
        L_0x005a:
            if (r5 >= r13) goto L_0x0079
            r4 = r8[r5]     // Catch:{ all -> 0x022b }
            java.lang.String r3 = r4.getName()     // Catch:{ IOException -> 0x006c }
            java.io.File r3 = X.AnonymousClass1XI.A04(r4, r7, r3)     // Catch:{ IOException -> 0x006c }
            if (r3 == 0) goto L_0x0076
            r6.add(r3)     // Catch:{ IOException -> 0x006c }
            goto L_0x0076
        L_0x006c:
            r3 = move-exception
            X.0v3 r4 = r0.A04     // Catch:{ all -> 0x022b }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x022b }
            r4.A8c(r3)     // Catch:{ all -> 0x022b }
        L_0x0076:
            int r5 = r5 + 1
            goto L_0x005a
        L_0x0079:
            java.io.File[] r3 = new java.io.File[r2]     // Catch:{ all -> 0x022b }
            java.lang.Object[] r5 = r6.toArray(r3)     // Catch:{ all -> 0x022b }
            java.io.File[] r5 = (java.io.File[]) r5     // Catch:{ all -> 0x022b }
            int r6 = r5.length     // Catch:{ all -> 0x022b }
            if (r6 != 0) goto L_0x00a5
            X.18e r1 = r1.A06     // Catch:{ all -> 0x022b }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x022b }
            X.01D r1 = r1.A01     // Catch:{ all -> 0x022b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x022b }
            X.0rz r1 = (X.C15860rz) r1     // Catch:{ all -> 0x022b }
            android.content.SharedPreferences$Editor r2 = r1.A0K()     // Catch:{ all -> 0x022b }
            java.lang.String r1 = "qpl_last_upload_ts"
            android.content.SharedPreferences$Editor r1 = r2.putLong(r1, r3)     // Catch:{ all -> 0x022b }
            r1.apply()     // Catch:{ all -> 0x022b }
            X.02Q r1 = X.AnonymousClass02Q.A00()     // Catch:{ all -> 0x022b }
            goto L_0x0225
        L_0x00a5:
            android.os.ConditionVariable r12 = new android.os.ConditionVariable     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            r12.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            r4 = 1
            com.facebook.redex.IDxListenerShape86S0200000_2_I0 r3 = new com.facebook.redex.IDxListenerShape86S0200000_2_I0     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            r3.<init>(r12, r4, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            r7 = 17
            android.net.TrafficStats.setThreadStatsTag(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            X.0vS r9 = r1.A07     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            X.0vR r7 = r1.A08     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            java.lang.String r20 = r7.A00()     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            X.0ua r7 = r1.A01     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            java.lang.String r19 = "https://graph.whatsapp.net/wa_qpl_data"
            r21 = 8
            r22 = 0
            r23 = 0
            r24 = 0
            X.1ao r15 = new X.1ao     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            r16 = r7
            r17 = r3
            r18 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            java.lang.String r7 = "access_token"
            java.lang.String r3 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r15.A06(r7, r3)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            X.18i r7 = r1.A04     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            java.lang.String r9 = X.AnonymousClass021.A09     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            java.lang.String r3 = "app_id"
            r15.A06(r3, r9)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            r3 = 0
        L_0x00e5:
            if (r3 >= r6) goto L_0x0118
            r9 = r5[r3]     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x010b, Exception | OutOfMemoryError -> 0x01d8 }
            r11.<init>(r9)     // Catch:{ FileNotFoundException -> 0x010b, Exception | OutOfMemoryError -> 0x01d8 }
            java.lang.String r18 = "batches[]"
            java.lang.String r19 = r9.getName()     // Catch:{ FileNotFoundException -> 0x010b, Exception | OutOfMemoryError -> 0x01d8 }
            long r23 = r9.length()     // Catch:{ FileNotFoundException -> 0x010b, Exception | OutOfMemoryError -> 0x01d8 }
            r21 = 0
            java.util.List r10 = r15.A0A     // Catch:{ FileNotFoundException -> 0x010b, Exception | OutOfMemoryError -> 0x01d8 }
            X.2JR r9 = new X.2JR     // Catch:{ FileNotFoundException -> 0x010b, Exception | OutOfMemoryError -> 0x01d8 }
            r20 = 0
            r16 = r9
            r17 = r11
            r16.<init>(r17, r18, r19, r20, r21, r23)     // Catch:{ FileNotFoundException -> 0x010b, Exception | OutOfMemoryError -> 0x01d8 }
            r10.add(r9)     // Catch:{ FileNotFoundException -> 0x010b, Exception | OutOfMemoryError -> 0x01d8 }
            goto L_0x0115
        L_0x010b:
            r9 = move-exception
            X.0v3 r10 = r1.A05     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            r10.A8f(r9)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
        L_0x0115:
            int r3 = r3 + 1
            goto L_0x00e5
        L_0x0118:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            java.lang.String r3 = "upload_time"
            r15.A06(r3, r9)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            X.18e r3 = r7.A05     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            long r9 = r3.A00()     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            java.lang.String r3 = "user_id"
            r15.A06(r3, r9)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x01bc }
            r9.<init>()     // Catch:{ Exception -> 0x01bc }
            X.01V r10 = r7.A00     // Catch:{ Exception -> 0x01bc }
            android.telephony.TelephonyManager r11 = r10.A0N()     // Catch:{ Exception -> 0x01bc }
            if (r11 == 0) goto L_0x015b
            int r3 = r11.getPhoneType()     // Catch:{ Exception -> 0x01bc }
            if (r3 != r4) goto L_0x015b
            java.lang.String r4 = "carrier"
            java.lang.String r3 = r11.getNetworkOperatorName()     // Catch:{ Exception -> 0x01bc }
            r9.put(r4, r3)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r4 = "country"
            java.lang.String r3 = r11.getSimCountryIso()     // Catch:{ Exception -> 0x01bc }
            r9.put(r4, r3)     // Catch:{ Exception -> 0x01bc }
        L_0x015b:
            java.lang.String r14 = "device_name"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01bc }
            r3.<init>()     // Catch:{ Exception -> 0x01bc }
            java.lang.String r11 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x01bc }
            r3.append(r11)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r4 = "-"
            r3.append(r4)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ Exception -> 0x01bc }
            r3.append(r4)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01bc }
            r9.put(r14, r3)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r14 = "device_code_name"
            java.lang.String r3 = android.os.Build.DEVICE     // Catch:{ Exception -> 0x01bc }
            r9.put(r14, r3)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r3 = "device_manufacturer"
            r9.put(r3, r11)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r3 = "device_model"
            r9.put(r3, r4)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r4 = "year_class"
            X.0u3 r3 = r7.A03     // Catch:{ Exception -> 0x01bc }
            int r3 = X.C42971z5.A02(r10, r3)     // Catch:{ Exception -> 0x01bc }
            r9.put(r4, r3)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r4 = "mem_class"
            int r3 = X.C29601at.A00(r10)     // Catch:{ Exception -> 0x01bc }
            r9.put(r4, r3)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r4 = "device_os_version"
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x01bc }
            r9.put(r4, r3)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r3 = "is_employee"
            r9.put(r3, r2)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r10 = "oc_version"
            X.0tz r3 = r7.A01     // Catch:{ Exception -> 0x01bc }
            android.content.Context r3 = r3.A00     // Catch:{ Exception -> 0x01bc }
            long r3 = X.AnonymousClass2CE.A00(r3)     // Catch:{ Exception -> 0x01bc }
            r9.put(r10, r3)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x01bc }
            goto L_0x01c8
        L_0x01bc:
            r3 = move-exception
            X.0v3 r7 = r7.A04     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            r4 = -1
            java.lang.String r3 = r3.getMessage()     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            r7.AK1(r4, r3)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            r4 = 0
        L_0x01c8:
            java.lang.String r3 = "batch_info"
            r15.A06(r3, r4)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            r3 = 0
            r15.A02(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            r3 = 100000(0x186a0, double:4.94066E-319)
            r12.block(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x01d8 }
            goto L_0x01e4
        L_0x01d8:
            r3 = move-exception
            X.0v3 r4 = r1.A05     // Catch:{ all -> 0x022b }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x022b }
            r4.A8f(r3)     // Catch:{ all -> 0x022b }
            r1.A00 = r2     // Catch:{ all -> 0x022b }
        L_0x01e4:
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ all -> 0x022b }
            r4 = 0
        L_0x01e8:
            if (r4 >= r6) goto L_0x01f2
            r3 = r5[r4]     // Catch:{ all -> 0x022b }
            r0.A00(r3)     // Catch:{ all -> 0x022b }
            int r4 = r4 + 1
            goto L_0x01e8
        L_0x01f2:
            boolean r3 = r1.A00     // Catch:{ all -> 0x022b }
            if (r3 != 0) goto L_0x01fc
            X.02P r1 = new X.02P     // Catch:{ all -> 0x022b }
            r1.<init>()     // Catch:{ all -> 0x022b }
            goto L_0x0225
        L_0x01fc:
            if (r2 >= r13) goto L_0x0206
            r3 = r8[r2]     // Catch:{ all -> 0x022b }
            r0.A00(r3)     // Catch:{ all -> 0x022b }
            int r2 = r2 + 1
            goto L_0x01fc
        L_0x0206:
            X.18e r1 = r1.A06     // Catch:{ all -> 0x022b }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x022b }
            X.01D r1 = r1.A01     // Catch:{ all -> 0x022b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x022b }
            X.0rz r1 = (X.C15860rz) r1     // Catch:{ all -> 0x022b }
            android.content.SharedPreferences$Editor r2 = r1.A0K()     // Catch:{ all -> 0x022b }
            java.lang.String r1 = "qpl_last_upload_ts"
            android.content.SharedPreferences$Editor r1 = r2.putLong(r1, r3)     // Catch:{ all -> 0x022b }
            r1.apply()     // Catch:{ all -> 0x022b }
            X.02Q r1 = X.AnonymousClass02Q.A00()     // Catch:{ all -> 0x022b }
        L_0x0225:
            java.util.concurrent.Semaphore r0 = r0.A05
            r0.release()
            return r1
        L_0x022b:
            r1 = move-exception
            java.util.concurrent.Semaphore r0 = r0.A05
            r0.release()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.quicklog.QplUploadScheduler$QPLUploadWorker.A04():X.02Q");
    }
}
