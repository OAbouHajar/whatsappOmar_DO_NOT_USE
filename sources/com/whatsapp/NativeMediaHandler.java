package com.whatsapp;

import X.C16980tz;

public class NativeMediaHandler {
    public final C16980tz A00;

    public NativeMediaHandler(C16980tz r1) {
        this.A00 = r1;
    }

    public static native void initFileHandlingCallbacks(NativeMediaHandler nativeMediaHandler);

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0085 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056 A[SYNTHETIC, Splitter:B:16:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0077 A[Catch:{ all -> 0x007f, all -> 0x0085, Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int openFile(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r5 = "; path="
            java.lang.String r4 = "; mode="
            r6 = 0
            if (r8 == 0) goto L_0x00a5
            if (r9 == 0) goto L_0x00a5
            r1 = r8
            java.lang.String r0 = "/mnt/content/"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "content://"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 13
            java.lang.String r0 = r8.substring(r0)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
        L_0x0026:
            android.net.Uri r3 = android.net.Uri.parse(r1)
        L_0x002a:
            java.lang.String r0 = "r+"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0048
            java.lang.String r9 = "rw"
            goto L_0x0048
        L_0x0036:
            java.lang.String r0 = "/"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x0026
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            android.net.Uri r3 = android.net.Uri.fromFile(r0)
            goto L_0x002a
        L_0x0048:
            X.0tz r0 = r7.A00     // Catch:{ Exception -> 0x0086 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x0086 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x0086 }
            android.os.ParcelFileDescriptor r2 = r0.openFileDescriptor(r3, r9)     // Catch:{ Exception -> 0x0086 }
            if (r2 != 0) goto L_0x0077
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r1.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "nativemediahandler/openFile failed, not opened; uri="
            r1.append(r0)     // Catch:{ all -> 0x007f }
            r1.append(r3)     // Catch:{ all -> 0x007f }
            r1.append(r4)     // Catch:{ all -> 0x007f }
            r1.append(r9)     // Catch:{ all -> 0x007f }
            r1.append(r5)     // Catch:{ all -> 0x007f }
            r1.append(r8)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007f }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x007f }
            return r6
        L_0x0077:
            int r0 = r2.detachFd()     // Catch:{ all -> 0x007f }
            r2.close()     // Catch:{ Exception -> 0x0086 }
            return r0
        L_0x007f:
            r0 = move-exception
            if (r2 == 0) goto L_0x0085
            r2.close()     // Catch:{ all -> 0x0085 }
        L_0x0085:
            throw r0     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            r2 = move-exception
            java.lang.String r1 = "nativemediahandler/openFile failed; uri="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            r0.append(r4)
            r0.append(r9)
            r0.append(r5)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r6
        L_0x00a5:
            java.lang.String r0 = "nativemediahandler/openFile wrong arguments; path="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r0 = " mode="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.NativeMediaHandler.openFile(java.lang.String, java.lang.String):int");
    }
}
