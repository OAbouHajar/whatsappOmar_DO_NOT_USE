package X;

import android.os.Bundle;
import com.mod2.fblibs.FacebookFacade;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0sw  reason: invalid class name and case insensitive filesystem */
public class C16380sw {
    public final C16300so A00;
    public final C16360su A01;
    public final C16330sr A02;
    public final C16370sv A03;
    public final C16350st A04;
    public final Set A05 = new HashSet();
    public final Executor A06;
    public final AtomicLong A07 = new AtomicLong();

    public C16380sw(C16300so r3, C16360su r4, C16330sr r5, C16370sv r6, C16350st r7, C16320sq r8) {
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
        this.A06 = new AnonymousClass1WA(r8, false);
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString("iconUri", (String) null);
        return bundle;
    }

    public static Bundle A01() {
        Bundle bundle = new Bundle();
        bundle.putString(FacebookFacade.RequestParameter.NAME, "OBWhatsApp");
        return bundle;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x004e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0058 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A02(android.os.CancellationSignal r6, android.os.ParcelFileDescriptor r7, X.C16380sw r8, java.io.File r9, javax.crypto.Cipher r10) {
        /*
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0080 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ OperationCanceledException -> 0x0059, IOException -> 0x0061 }
            r3.<init>(r9)     // Catch:{ OperationCanceledException -> 0x0059, IOException -> 0x0061 }
            if (r10 != 0) goto L_0x000e
            r4 = r3
            goto L_0x0013
        L_0x000e:
            javax.crypto.CipherInputStream r4 = new javax.crypto.CipherInputStream     // Catch:{ all -> 0x0054 }
            r4.<init>(r3, r10)     // Catch:{ all -> 0x0054 }
        L_0x0013:
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r5 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ all -> 0x004f }
            r5.<init>(r7)     // Catch:{ all -> 0x004f }
            X.C16350st.A01(r6, r4, r5, r0)     // Catch:{ IOException -> 0x001c }
            goto L_0x0040
        L_0x001c:
            r6 = move-exception
            java.lang.String r0 = "ExportMigrationApi/Failed while writing to a remote stream "
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x004a }
            X.0so r2 = r8.A00     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "xpm-export-api-remote-write"
            java.lang.String r0 = r6.getMessage()     // Catch:{ all -> 0x004a }
            r2.A03(r1, r0, r6)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "Failed to write data."
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x003a }
            r0 = 19
            if (r1 < r0) goto L_0x0040
            r7.closeWithError(r2)     // Catch:{ IOException -> 0x003a }
            goto L_0x0040
        L_0x003a:
            r1 = move-exception
            java.lang.String r0 = "ExportMigrationApi/Failed to close the pipe after an error."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x004a }
        L_0x0040:
            r5.close()     // Catch:{ all -> 0x004f }
            r4.close()     // Catch:{ all -> 0x0054 }
            r3.close()     // Catch:{ OperationCanceledException -> 0x0059, IOException -> 0x0061 }
            goto L_0x0075
        L_0x004a:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r0     // Catch:{ OperationCanceledException -> 0x0059, IOException -> 0x0061 }
        L_0x0059:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r1.<init>()     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "ExportMigrationApi/Cancelled by remote peer while streaming "
            goto L_0x0068
        L_0x0061:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r1.<init>()     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "ExportMigrationApi/Failed to close stream for "
        L_0x0068:
            r1.append(r0)     // Catch:{ all -> 0x0080 }
            r1.append(r9)     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0080 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0080 }
        L_0x0075:
            monitor-enter(r8)
            java.util.Set r0 = r8.A05     // Catch:{ all -> 0x007d }
            r0.remove(r7)     // Catch:{ all -> 0x007d }
            monitor-exit(r8)     // Catch:{ all -> 0x007d }
            return
        L_0x007d:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x007d }
            throw r0
        L_0x0080:
            r1 = move-exception
            monitor-enter(r8)
            java.util.Set r0 = r8.A05     // Catch:{ all -> 0x0089 }
            r0.remove(r7)     // Catch:{ all -> 0x0089 }
            monitor-exit(r8)     // Catch:{ all -> 0x0089 }
            throw r1
        L_0x0089:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0089 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16380sw.A02(android.os.CancellationSignal, android.os.ParcelFileDescriptor, X.0sw, java.io.File, javax.crypto.Cipher):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x01e1 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:92:0x01e1=Splitter:B:92:0x01e1, B:8:0x002e=Splitter:B:8:0x002e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.ParcelFileDescriptor A03(android.os.CancellationSignal r18, long r19) {
        /*
            r17 = this;
            r10 = r18
            r12 = r17
            X.0sv r0 = r12.A03
            X.0zW r0 = r0.A01
            X.0zX r0 = r0.A00
            X.0tf r7 = r0.A00()
            X.0tg r6 = r7.A02     // Catch:{ all -> 0x01e2 }
            java.lang.String r5 = "SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f WHERE f._id = ?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x01e2 }
            r1 = 0
            r2 = r19
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x01e2 }
            r4[r1] = r0     // Catch:{ all -> 0x01e2 }
            android.database.Cursor r1 = r6.A08(r5, r4)     // Catch:{ all -> 0x01e2 }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x002a
            r6 = 0
            goto L_0x002e
        L_0x002a:
            X.4No r6 = X.C20110zW.A00(r1)     // Catch:{ all -> 0x01db }
        L_0x002e:
            r1.close()     // Catch:{ all -> 0x01e2 }
            r7.close()
            if (r6 == 0) goto L_0x01c7
            java.io.File r13 = r6.A02
            boolean r0 = r13.exists()
            if (r0 == 0) goto L_0x01a2
            long r7 = r13.length()
            r4 = 0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0059
            java.lang.String r1 = "Exporting EMPTY file: path="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0059:
            long r8 = r13.length()
            long r0 = r6.A01
            java.lang.String r7 = ", on-record="
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0088
            java.lang.String r4 = "Exporting MISMATCHED SIZE file: path="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r4)
            r8.append(r13)
            java.lang.String r4 = ", on-disk="
            r8.append(r4)
            long r4 = r13.length()
            r8.append(r4)
            r8.append(r7)
            r8.append(r0)
            java.lang.String r4 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
        L_0x0088:
            java.util.concurrent.atomic.AtomicLong r4 = r12.A07
            long r8 = r4.getAndSet(r2)
            int r4 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r4 != 0) goto L_0x00b5
            java.lang.String r2 = "RETRY DETECTED for path="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r13)
            java.lang.String r2 = " with size on-disk="
            r4.append(r2)
            long r2 = r13.length()
            r4.append(r2)
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00b5:
            if (r18 != 0) goto L_0x00bc
            android.os.CancellationSignal r10 = new android.os.CancellationSignal
            r10.<init>()
        L_0x00bc:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            r0 = 19
            if (r1 <= r0) goto L_0x00ce
            android.os.ParcelFileDescriptor[] r1 = android.os.ParcelFileDescriptor.createReliablePipe()     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
        L_0x00c6:
            r3 = 0
            r7 = r1[r3]     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            r0 = 1
            r11 = r1[r0]     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            monitor-enter(r12)     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            goto L_0x00d3
        L_0x00ce:
            android.os.ParcelFileDescriptor[] r1 = android.os.ParcelFileDescriptor.createPipe()     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            goto L_0x00c6
        L_0x00d3:
            java.util.Set r5 = r12.A05     // Catch:{ all -> 0x018a }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x018a }
            if (r0 != 0) goto L_0x012e
            X.0so r2 = r12.A00     // Catch:{ all -> 0x018a }
            java.lang.String r1 = "xpm-export-api-leaked-fd"
            int r0 = r5.size()     // Catch:{ all -> 0x018a }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x018a }
            r2.AcB(r1, r0, r3)     // Catch:{ all -> 0x018a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018a }
            r1.<init>()     // Catch:{ all -> 0x018a }
            java.lang.String r0 = "ExportMigrationApi/force closing pending file descriptors ("
            r1.append(r0)     // Catch:{ all -> 0x018a }
            int r0 = r5.size()     // Catch:{ all -> 0x018a }
            r1.append(r0)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018a }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x018a }
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x018a }
        L_0x010c:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x012b
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x018a }
            android.os.ParcelFileDescriptor r3 = (android.os.ParcelFileDescriptor) r3     // Catch:{ all -> 0x018a }
            java.lang.String r2 = "Force closing, concurrent streaming not supported."
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0124 }
            r0 = 19
            if (r1 < r0) goto L_0x010c
            r3.closeWithError(r2)     // Catch:{ IOException -> 0x0124 }
            goto L_0x010c
        L_0x0124:
            r1 = move-exception
            java.lang.String r0 = "ExportMigrationApi/Failed to close the pipe after an error."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x018a }
            goto L_0x010c
        L_0x012b:
            r5.clear()     // Catch:{ all -> 0x018a }
        L_0x012e:
            r5.add(r11)     // Catch:{ all -> 0x018a }
            monitor-exit(r12)     // Catch:{ all -> 0x018a }
            java.lang.String r2 = r6.A03     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            if (r0 == 0) goto L_0x013c
            r14 = 0
            goto L_0x0165
        L_0x013c:
            X.0su r0 = r12.A01     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            X.1pt r0 = r0.A00()     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            if (r0 == 0) goto L_0x018d
            java.lang.String r1 = r0.A03     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            r0 = 2
            byte[] r3 = android.util.Base64.decode(r1, r0)     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            byte[] r1 = android.util.Base64.decode(r2, r0)     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r14 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ GeneralSecurityException -> 0x0172 }
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch:{ GeneralSecurityException -> 0x0172 }
            r2.<init>(r1)     // Catch:{ GeneralSecurityException -> 0x0172 }
            java.lang.String r0 = "AES"
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch:{ GeneralSecurityException -> 0x0172 }
            r1.<init>(r3, r0)     // Catch:{ GeneralSecurityException -> 0x0172 }
            r0 = 1
            r14.init(r0, r1, r2)     // Catch:{ GeneralSecurityException -> 0x0172 }
        L_0x0165:
            long r15 = r6.A00     // Catch:{ RejectedExecutionException -> 0x017b }
            java.util.concurrent.Executor r0 = r12.A06     // Catch:{ RejectedExecutionException -> 0x017b }
            X.56H r9 = new X.56H     // Catch:{ RejectedExecutionException -> 0x017b }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ RejectedExecutionException -> 0x017b }
            r0.execute(r9)     // Catch:{ RejectedExecutionException -> 0x017b }
            return r7
        L_0x0172:
            r1 = move-exception
            java.lang.String r0 = "Failed to initiate encrypting cipher."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            r2.<init>(r0, r1)     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            goto L_0x0189
        L_0x017b:
            r1 = move-exception
            r7.close()     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            r11.close()     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            java.lang.String r0 = "Failed to initiate streaming."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            r2.<init>(r0, r1)     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
        L_0x0189:
            throw r2     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
        L_0x018a:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x018a }
            goto L_0x0194
        L_0x018d:
            java.lang.String r0 = "Failed to initiate encryption, key is missing."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
        L_0x0194:
            throw r1     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x0195 }
        L_0x0195:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>(r1)
            throw r0
        L_0x01a0:
            r0 = move-exception
            throw r0
        L_0x01a2:
            java.lang.String r0 = r13.getAbsolutePath()
            java.lang.String r5 = X.AnonymousClass1XI.A08(r0)
            X.0so r4 = r12.A00
            r1 = 0
            java.lang.String r0 = "xpm-export-missing-file-type"
            r4.AcB(r0, r5, r1)
            java.lang.String r1 = "File no longer exists: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>(r1)
            throw r0
        L_0x01c7:
            java.lang.String r1 = "Unknown entry: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>(r1)
            throw r0
        L_0x01db:
            r0 = move-exception
            if (r1 == 0) goto L_0x01e1
            r1.close()     // Catch:{ all -> 0x01e1 }
        L_0x01e1:
            throw r0     // Catch:{ all -> 0x01e2 }
        L_0x01e2:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x01e6 }
        L_0x01e6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16380sw.A03(android.os.CancellationSignal, long):android.os.ParcelFileDescriptor");
    }
}
