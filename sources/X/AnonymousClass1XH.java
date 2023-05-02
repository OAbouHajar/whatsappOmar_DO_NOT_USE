package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1XH  reason: invalid class name */
public class AnonymousClass1XH {
    public File A00;
    public final C16260sj A01;
    public final C14730pf A02;
    public final File A03;

    public AnonymousClass1XH(C16260sj r1, C14730pf r2, File file) {
        this.A03 = file;
        this.A02 = r2;
        this.A01 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040 A[Catch:{ IOException -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A00(java.lang.String r9) {
        /*
            r8 = this;
            r7 = r8
            monitor-enter(r7)
            r8.A01()     // Catch:{ all -> 0x01bd }
            java.io.File r0 = r8.A00     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.exists()     // Catch:{ all -> 0x01bd }
            if (r0 != 0) goto L_0x0130
        L_0x000f:
            r5 = 0
            java.io.File r2 = r8.A03     // Catch:{ all -> 0x01bd }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01bd }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x01bd }
            r4.<init>(r2, r0)     // Catch:{ all -> 0x01bd }
            r8.A00 = r4     // Catch:{ all -> 0x01bd }
        L_0x0021:
            int r3 = r5 + 1
            r1 = 10
            if (r5 >= r1) goto L_0x003e
            boolean r0 = r4.mkdir()     // Catch:{ all -> 0x01bd }
            if (r0 != 0) goto L_0x003e
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01bd }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x01bd }
            r4.<init>(r2, r0)     // Catch:{ all -> 0x01bd }
            r8.A00 = r4     // Catch:{ all -> 0x01bd }
            r5 = r3
            goto L_0x0021
        L_0x003e:
            if (r3 <= r1) goto L_0x0130
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bd }
            r1.<init>()     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = "trash/createtempdir/failed "
            r1.append(r0)     // Catch:{ all -> 0x01bd }
            java.io.File r0 = r8.A00     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01bd }
            r1.append(r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01bd }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01bd }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bd }
            r4.<init>()     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = "trash/createtempdir/failed total-storage:"
            r4.append(r0)     // Catch:{ all -> 0x01bd }
            X.0pf r3 = r8.A02     // Catch:{ all -> 0x01bd }
            long r0 = r3.A03()     // Catch:{ all -> 0x01bd }
            r4.append(r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = " free-storage:"
            r4.append(r0)     // Catch:{ all -> 0x01bd }
            long r0 = r3.A01()     // Catch:{ all -> 0x01bd }
            r4.append(r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01bd }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01bd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bd }
            r1.<init>()     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = "trash/createtempdir/failed external-storage-state:"
            r1.append(r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch:{ all -> 0x01bd }
            r1.append(r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01bd }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01bd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bd }
            r1.<init>()     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = "trash/createtempdir/failed base-dir:"
            r1.append(r0)     // Catch:{ all -> 0x01bd }
            r1.append(r2)     // Catch:{ all -> 0x01bd }
            java.lang.String r4 = " exists:"
            r1.append(r4)     // Catch:{ all -> 0x01bd }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x01bd }
            r1.append(r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r3 = " writable:"
            r1.append(r3)     // Catch:{ all -> 0x01bd }
            boolean r0 = r2.canWrite()     // Catch:{ all -> 0x01bd }
            r1.append(r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = " directory:"
            r1.append(r0)     // Catch:{ all -> 0x01bd }
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x01bd }
            r1.append(r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01bd }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01bd }
            java.io.File r2 = r2.getCanonicalFile()     // Catch:{ IOException -> 0x0121 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0121 }
            r1.<init>()     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = "trash/createtempdir/failed canonical-base-dir:"
            r1.append(r0)     // Catch:{ IOException -> 0x0121 }
            r1.append(r2)     // Catch:{ IOException -> 0x0121 }
            r1.append(r4)     // Catch:{ IOException -> 0x0121 }
            boolean r0 = r2.exists()     // Catch:{ IOException -> 0x0121 }
            r1.append(r0)     // Catch:{ IOException -> 0x0121 }
            r1.append(r3)     // Catch:{ IOException -> 0x0121 }
            boolean r0 = r2.canWrite()     // Catch:{ IOException -> 0x0121 }
            r1.append(r0)     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0121 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0121 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0121 }
            r2.<init>()     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = "trash/createtempdir/failed StoragePermission?:"
            r2.append(r0)     // Catch:{ IOException -> 0x0121 }
            X.0sj r1 = r8.A01     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch:{ IOException -> 0x0121 }
            boolean r0 = r1.A0F(r0)     // Catch:{ IOException -> 0x0121 }
            r2.append(r0)     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0121 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0121 }
            goto L_0x0128
        L_0x0121:
            r1 = move-exception
            java.lang.String r0 = "trash/createtempdir/failed unable to resolve trashDir"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01bd }
        L_0x0128:
            java.lang.String r1 = "max retries reached while creating temp dir"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01bd }
            r0.<init>(r1)     // Catch:{ all -> 0x01bd }
            throw r0     // Catch:{ all -> 0x01bd }
        L_0x0130:
            monitor-exit(r7)
            monitor-enter(r7)
            java.io.File r2 = r8.A00     // Catch:{ all -> 0x01bd }
            monitor-exit(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r6 = ""
            java.lang.String r4 = "."
            if (r0 == 0) goto L_0x01a2
            r0 = r6
        L_0x0150:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r5 = new java.io.File
            r5.<init>(r2, r0)
            r0 = 0
        L_0x015d:
            int r3 = r0 + 1
            r1 = 10
            if (r0 >= r1) goto L_0x01b2
            boolean r0 = r5.createNewFile()
            if (r0 != 0) goto L_0x01b2
            monitor-enter(r7)
            java.io.File r2 = r8.A00     // Catch:{ all -> 0x01bd }
            monitor-exit(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0192
            r0 = r6
        L_0x0184:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r5 = new java.io.File
            r5.<init>(r2, r0)
            r0 = r3
            goto L_0x015d
        L_0x0192:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            goto L_0x0184
        L_0x01a2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            goto L_0x0150
        L_0x01b2:
            if (r3 > r1) goto L_0x01b5
            return r5
        L_0x01b5:
            java.lang.String r1 = "max retries reached while creating temp file"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x01bd:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XH.A00(java.lang.String):java.io.File");
    }

    public final void A01() {
        File file = this.A03;
        if (file.exists() && !file.isDirectory()) {
            StringBuilder sb = new StringBuilder("trash/create-trash-dir/removing ");
            sb.append(file);
            Log.w(sb.toString());
            if (!file.delete() && file.exists()) {
                StringBuilder sb2 = new StringBuilder("trash/create-trash-dir/failed ");
                sb2.append(file);
                sb2.append(" is not a directory");
                Log.e(sb2.toString());
            }
        }
        if (!file.exists()) {
            file.mkdirs();
            if (!file.exists() && !file.mkdir()) {
                Log.w("trash/create-trash-dir/failed");
            }
        }
    }
}
