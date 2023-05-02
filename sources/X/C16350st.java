package X;

import android.content.Context;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.0st  reason: invalid class name and case insensitive filesystem */
public class C16350st {
    public Context A00;

    public C16350st(Context context) {
        this.A00 = context;
    }

    public static final String A00(File file, String str) {
        File canonicalFile = file.getCanonicalFile();
        File canonicalFile2 = new File(canonicalFile, str).getCanonicalFile();
        String path = canonicalFile.getPath();
        String path2 = canonicalFile2.getPath();
        if (!path2.startsWith(path)) {
            StringBuilder sb = new StringBuilder("Invalid relative path (escapes parent): ");
            sb.append(path2);
            throw new IOException(sb.toString());
        } else if (!path2.equals(path)) {
            String substring = path2.substring(path.length() + 1);
            if (substring.length() != 0) {
                return substring;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid relative path (points to root): ");
            sb2.append(path2);
            throw new IOException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Invalid relative path (points to root): ");
            sb3.append(path2);
            throw new IOException(sb3.toString());
        }
    }

    public static void A01(CancellationSignal cancellationSignal, InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                cancellationSignal.throwIfCanceled();
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public String A02(String str) {
        Context context = this.A00;
        File file = new File(context.getFilesDir(), "__relative_root_1");
        File file2 = new File(context.getFilesDir(), "__relative_root_2");
        String A002 = A00(file, str);
        if (A002.equals(A00(file2, str))) {
            return A002;
        }
        StringBuilder sb = new StringBuilder("Invalid relative path: ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.os.CancellationSignal r7, java.io.File r8, java.io.File r9, byte[] r10) {
        /*
            r6 = this;
            java.io.File r5 = r8.getCanonicalFile()
            java.io.File r1 = r9.getCanonicalFile()
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L_0x005a
            java.io.File r0 = r1.getParentFile()
            if (r0 == 0) goto L_0x0017
            r0.mkdirs()
        L_0x0017:
            boolean r0 = r5.renameTo(r1)
            if (r0 != 0) goto L_0x005a
            java.io.File r4 = r5.getCanonicalFile()
            java.io.File r3 = r1.getCanonicalFile()
            boolean r0 = r4.equals(r3)
            if (r0 != 0) goto L_0x0057
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L_0x0034
            r0.mkdirs()
        L_0x0034:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0052 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0052 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x004d }
            r1.<init>(r4)     // Catch:{ all -> 0x004d }
            A01(r7, r1, r2, r10)     // Catch:{ all -> 0x0048 }
            r1.close()     // Catch:{ all -> 0x004d }
            r2.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0057
        L_0x0048:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            r3.delete()
            throw r0
        L_0x0057:
            r5.delete()
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16350st.A03(android.os.CancellationSignal, java.io.File, java.io.File, byte[]):void");
    }
}
