package com.google.android.gms.internal.gtm;

import X.C105685At;
import X.C13710nw;
import X.C15000qA;
import android.content.Context;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public final class zzcn extends zzbs {
    public volatile String zza;
    public Future zzb;

    public zzcn(zzbv zzbv) {
        super(zzbv);
    }

    /* access modifiers changed from: private */
    public final String zzf() {
        FileOutputStream openFileOutput;
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            C15000qA r0 = this.zza.zzg;
            C13710nw.A01(r0);
            Context context = r0.A01;
            C13710nw.A05(lowerCase);
            C13710nw.A06("ClientId should be saved from worker thread");
            try {
                zzP("Storing clientId", lowerCase);
                openFileOutput = context.openFileOutput("gaClientId", 0);
                openFileOutput.write(lowerCase.getBytes());
                try {
                    openFileOutput.close();
                    return lowerCase;
                } catch (IOException e2) {
                    zzK("Failed to close clientId writing stream", e2);
                    return lowerCase;
                }
            } catch (FileNotFoundException e3) {
                zzK("Error creating clientId file", e3);
            } catch (IOException e4) {
                zzK("Error writing to clientId file", e4);
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e5) {
                        zzK("Failed to close clientId writing stream", e5);
                    }
                }
                throw th;
            }
            if (openFileOutput != null) {
                try {
                    openFileOutput.close();
                    return "0";
                } catch (IOException e6) {
                    zzK("Failed to close clientId writing stream", e6);
                    return "0";
                }
            }
            return "0";
        } catch (Exception e7) {
            zzK("Error saving clientId file", e7);
            return "0";
        }
    }

    public final String zzb() {
        String str;
        FutureTask futureTask;
        zzW();
        synchronized (this) {
            if (this.zza == null) {
                C15000qA r2 = this.zza.zzg;
                C13710nw.A01(r2);
                zzcl zzcl = new zzcl(this);
                if (Thread.currentThread() instanceof C105685At) {
                    FutureTask futureTask2 = new FutureTask(zzcl);
                    futureTask2.run();
                    futureTask = futureTask2;
                } else {
                    futureTask = r2.A03.submit(zzcl);
                }
                this.zzb = futureTask;
            }
            Future future = this.zzb;
            if (future != null) {
                try {
                    this.zza = (String) future.get();
                } catch (InterruptedException e2) {
                    zzS("ClientId loading or generation was interrupted", e2);
                    this.zza = "0";
                } catch (ExecutionException e3) {
                    zzK("Failed to load or generate client id", e3);
                    this.zza = "0";
                }
                if (this.zza == null) {
                    this.zza = "0";
                }
                zzP("Loaded clientId", this.zza);
                this.zzb = null;
            }
            str = this.zza;
        }
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        if (r6 != null) goto L_0x006e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062 A[SYNTHETIC, Splitter:B:26:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzc() {
        /*
            r10 = this;
            java.lang.String r8 = "gaClientId"
            java.lang.String r4 = "Failed to close client id reading stream"
            com.google.android.gms.internal.gtm.zzbv r0 = r10.zza
            X.0qA r0 = r0.zzg
            X.C13710nw.A01(r0)
            android.content.Context r7 = r0.A01
            java.lang.String r0 = "ClientId should be loaded from worker thread"
            X.C13710nw.A06(r0)
            r9 = 0
            java.io.FileInputStream r6 = r7.openFileInput(r8)     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x004f, all -> 0x005f }
            r0 = 36
            byte[] r5 = new byte[r0]     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x004d }
            r3 = 0
            int r2 = r6.read(r5, r3, r0)     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x004d }
            int r0 = r6.available()     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x004d }
            if (r0 <= 0) goto L_0x0032
            java.lang.String r0 = "clientId file seems corrupted, deleting it."
            r10.zzR(r0)     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x004d }
        L_0x002b:
            r6.close()     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x004d }
            r7.deleteFile(r8)     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x004d }
            goto L_0x006e
        L_0x0032:
            r0 = 14
            if (r2 >= r0) goto L_0x003c
            java.lang.String r0 = "clientId file is empty, deleting it."
            r10.zzR(r0)     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x004d }
            goto L_0x002b
        L_0x003c:
            r6.close()     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x004d }
            java.lang.String r1 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x004d }
            r1.<init>(r5, r3, r2)     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x004d }
            java.lang.String r0 = "Read client id from disk"
            r10.zzP(r0, r1)     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x004d }
            r6.close()     // Catch:{ IOException -> 0x0077 }
            goto L_0x007b
        L_0x004d:
            r1 = move-exception
            goto L_0x0051
        L_0x004f:
            r1 = move-exception
            r6 = r9
        L_0x0051:
            java.lang.String r0 = "Error reading client id file, deleting it"
            r10.zzK(r0, r1)     // Catch:{ all -> 0x005c }
            r7.deleteFile(r8)     // Catch:{ all -> 0x005c }
            if (r6 == 0) goto L_0x007c
            goto L_0x006e
        L_0x005c:
            r1 = move-exception
            r9 = r6
            goto L_0x0060
        L_0x005f:
            r1 = move-exception
        L_0x0060:
            if (r9 == 0) goto L_0x006a
            r9.close()     // Catch:{ IOException -> 0x0066 }
            throw r1
        L_0x0066:
            r0 = move-exception
            r10.zzK(r4, r0)
        L_0x006a:
            throw r1
        L_0x006b:
            r6 = r9
        L_0x006c:
            if (r6 == 0) goto L_0x007c
        L_0x006e:
            r6.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x007c
        L_0x0072:
            r0 = move-exception
            r10.zzK(r4, r0)
            goto L_0x007c
        L_0x0077:
            r0 = move-exception
            r10.zzK(r4, r0)
        L_0x007b:
            r9 = r1
        L_0x007c:
            if (r9 != 0) goto L_0x0083
            java.lang.String r0 = r10.zzf()
            return r0
        L_0x0083:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcn.zzc():java.lang.String");
    }

    public final void zzd() {
    }
}
