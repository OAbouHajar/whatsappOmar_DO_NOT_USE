package X;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import com.whatsapp.util.NativeUtils;
import com.whatsapp.util.StatResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0tB  reason: invalid class name and case insensitive filesystem */
public class C16510tB {
    public final AnonymousClass01D A00 = new AnonymousClass01T((Object) null, new C33831jE(this));
    public final Set A01 = new HashSet();
    public volatile C16180sb A02;
    public volatile Set A03 = new HashSet();

    public static Collection A00(File[] fileArr, int i2) {
        if (fileArr == null || i2 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r5);
        for (File file : fileArr) {
            try {
                StatResult lstatOpenFile = StatResult.lstatOpenFile(file.getPath());
                if (!lstatOpenFile.A05) {
                    if (file.isDirectory()) {
                        arrayList.addAll(A00(file.listFiles(), i2 - 1));
                    } else if (lstatOpenFile.A01 == 1) {
                        arrayList.add(Long.valueOf(lstatOpenFile.A04));
                    }
                }
            } catch (Exception e2) {
                throw new IOException(e2);
            } catch (IOException e3) {
                StringBuilder sb = new StringBuilder("externalfilevalidator/file read error: ");
                sb.append(file);
                Log.e(sb.toString(), e3);
            }
        }
        return arrayList;
    }

    public void A01(Uri uri) {
        if (this.A01.contains(uri.getAuthority())) {
            StringBuilder sb = new StringBuilder("externalfilevalidator/don't allow sharing ");
            sb.append(uri);
            throw new IOException(sb.toString());
        }
    }

    public void A02(ParcelFileDescriptor parcelFileDescriptor) {
        StatResult statOpenFile = StatResult.statOpenFile(NativeUtils.getFileDescriptorForFileDescriptor(parcelFileDescriptor.getFileDescriptor()));
        StringBuilder sb = new StringBuilder("parcelFileDescriptor=");
        sb.append(parcelFileDescriptor);
        A03(statOpenFile, sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("externalfilevalidator/getProcDeviceId/proc file not found: ");
        r1.append(r2);
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        if (r6 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("externalfilevalidator/getProcDeviceId/close failed: ");
        r0.append(r1);
        com.whatsapp.util.Log.e(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0138, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0139, code lost:
        if (r6 != null) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0140, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("externalfilevalidator/getProcDeviceId/close failed: ");
        r0.append(r1);
        com.whatsapp.util.Log.e(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0152, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055 A[ExcHandler: FileNotFoundException (r2v5 'e' java.io.FileNotFoundException A[CUSTOM_DECLARE]), PHI: r6 
      PHI: (r6v2 android.os.ParcelFileDescriptor) = (r6v0 android.os.ParcelFileDescriptor), (r6v3 android.os.ParcelFileDescriptor) binds: [B:1:0x000c, B:3:0x0010] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x000c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.whatsapp.util.StatResult r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r5 = "externalfilevalidator/getProcDeviceId/close failed: "
            java.lang.String r0 = "/proc/self"
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r6 = 0
            android.os.ParcelFileDescriptor r6 = android.os.ParcelFileDescriptor.open(r1, r0)     // Catch:{ FileNotFoundException -> 0x0055, all -> 0x0153 }
            java.io.FileDescriptor r0 = r6.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0055 }
            int r0 = com.whatsapp.util.NativeUtils.getFileDescriptorForFileDescriptor(r0)     // Catch:{ FileNotFoundException -> 0x0055 }
            com.whatsapp.util.StatResult r0 = com.whatsapp.util.StatResult.statOpenFile(r0)     // Catch:{ FileNotFoundException -> 0x0055 }
            long r3 = r0.A03     // Catch:{ FileNotFoundException -> 0x0055 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ FileNotFoundException -> 0x0055 }
            r6.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x0039
        L_0x0026:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0039:
            if (r2 == 0) goto L_0x0083
            long r1 = r10.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0083
            java.lang.String r1 = "file is on the proc filesystem; not permitting nefarious file share operation; "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r1 = r0.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0055:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r1.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "externalfilevalidator/getProcDeviceId/proc file not found: "
            r1.append(r0)     // Catch:{ all -> 0x0138 }
            r1.append(r2)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0138 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0138 }
            if (r6 == 0) goto L_0x0083
            r6.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x0083
        L_0x0070:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0083:
            int r0 = android.os.Process.myUid()
            int r2 = r10.A02
            if (r0 != r2) goto L_0x00c2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c3 }
            r1.<init>()     // Catch:{ IOException -> 0x00c3 }
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x00c3 }
            r1.append(r0)     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r0 = "/."
            r1.append(r0)     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00c3 }
            com.whatsapp.util.StatResult r0 = com.whatsapp.util.StatResult.lstatOpenFile(r0)     // Catch:{ Exception -> 0x00b1 }
            int r1 = r0.A00     // Catch:{ IOException -> 0x00c3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00c3 }
            if (r0 == 0) goto L_0x00c9
            goto L_0x00b8
        L_0x00b1:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00c3 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00c3 }
            throw r0     // Catch:{ IOException -> 0x00c3 }
        L_0x00b8:
            if (r1 == r2) goto L_0x00c9
            int r0 = r10.A00
            if (r1 != r0) goto L_0x00c9
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x00c9
        L_0x00c2:
            return
        L_0x00c3:
            r1 = move-exception
            java.lang.String r0 = "externalfilevalidator/getExternalStorageGid/unable to read external storage dir"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00c9:
            java.util.Set r2 = r9.A03
            long r0 = r10.A04
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            boolean r0 = r2.contains(r8)
            r7 = 1
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = "externalfilevalidator/update whitelist"
            X.1Zf r6 = new X.1Zf
            r6.<init>((java.lang.String) r0)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            X.01D r0 = r9.A00
            java.lang.Object r0 = r0.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x00f0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0119
            java.lang.Object r3 = r4.next()
            java.io.File r3 = (java.io.File) r3
            boolean r0 = r3.isFile()
            r2 = 3
            if (r0 == 0) goto L_0x0110
            java.io.File[] r1 = new java.io.File[r7]
            r0 = 0
            r1[r0] = r3
            java.util.Collection r0 = A00(r1, r2)
        L_0x010c:
            r5.addAll(r0)
            goto L_0x00f0
        L_0x0110:
            java.io.File[] r0 = r3.listFiles()
            java.util.Collection r0 = A00(r0, r2)
            goto L_0x010c
        L_0x0119:
            r9.A03 = r5
            r6.A01()
            boolean r0 = r5.contains(r8)
            if (r0 != 0) goto L_0x00c2
            java.lang.String r1 = "file is owned by our application; not permitting nefarious file share operation; "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r1 = r0.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0138:
            r2 = move-exception
            if (r6 == 0) goto L_0x0154
            r6.close()     // Catch:{ IOException -> 0x013f }
            throw r2
        L_0x013f:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            throw r2
        L_0x0153:
            r2 = move-exception
        L_0x0154:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16510tB.A03(com.whatsapp.util.StatResult, java.lang.String):void");
    }

    public void A04(File file) {
        String canonicalPath = file.getCanonicalPath();
        try {
            StatResult lstatOpenFile = StatResult.lstatOpenFile(canonicalPath);
            StringBuilder sb = new StringBuilder("canonicalFilePath=");
            sb.append(canonicalPath);
            A03(lstatOpenFile, sb.toString());
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public void A05(FileInputStream fileInputStream) {
        StatResult statOpenFile = StatResult.statOpenFile(NativeUtils.getFileDescriptorForFileDescriptor(fileInputStream.getFD()));
        StringBuilder sb = new StringBuilder("fileInputStream=");
        sb.append(fileInputStream);
        A03(statOpenFile, sb.toString());
    }
}
