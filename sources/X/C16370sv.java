package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Random;

/* renamed from: X.0sv  reason: invalid class name and case insensitive filesystem */
public class C16370sv {
    public final C20120zX A00;
    public final C20110zW A01;
    public final AnonymousClass01D A02;
    public final ThreadLocal A03 = new ThreadLocal();

    public C16370sv(C20120zX r2, C20110zW r3, AnonymousClass01D r4) {
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0038 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0038=Splitter:B:16:0x0038, B:8:0x002b=Splitter:B:8:0x002b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A00() {
        /*
            r6 = this;
            X.0zW r0 = r6.A01
            java.lang.String r5 = "migration/messages_export.zip"
            X.0zX r0 = r0.A00
            X.0tf r4 = r0.A00()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = "SELECT  f.file_size AS exported_file_size FROM exported_files_metadata AS f WHERE f.exported_path = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0039 }
            r0 = 0
            r1[r0] = r5     // Catch:{ all -> 0x0039 }
            android.database.Cursor r2 = r3.A08(r2, r1)     // Catch:{ all -> 0x0039 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x0021
            r0 = 0
            goto L_0x002b
        L_0x0021:
            java.lang.String r0 = "exported_file_size"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0032 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0032 }
        L_0x002b:
            r2.close()     // Catch:{ all -> 0x0039 }
            r4.close()
            return r0
        L_0x0032:
            r0 = move-exception
            if (r2 == 0) goto L_0x0038
            r2.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16370sv.A00():long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0031 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0031=Splitter:B:16:0x0031, B:8:0x0024=Splitter:B:8:0x0024} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A01() {
        /*
            r4 = this;
            X.0zW r0 = r4.A01
            X.0zX r0 = r0.A00
            X.0tf r3 = r0.A00()
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = "SELECT  SUM(f.file_size) AS media_size FROM exported_files_metadata AS f WHERE f.required = 0"
            r0 = 0
            android.database.Cursor r2 = r2.A08(r1, r0)     // Catch:{ all -> 0x0032 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x001a
            r0 = 0
            goto L_0x0024
        L_0x001a:
            java.lang.String r0 = "media_size"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002b }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x002b }
        L_0x0024:
            r2.close()     // Catch:{ all -> 0x0032 }
            r3.close()
            return r0
        L_0x002b:
            r0 = move-exception
            if (r2 == 0) goto L_0x0031
            r2.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16370sv.A01():long");
    }

    public long A02(File file, String str, boolean z2) {
        C20110zW r3 = this.A01;
        String canonicalPath = file.getCanonicalPath();
        long length = file.length();
        ThreadLocal threadLocal = this.A03;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[16];
            threadLocal.set(bArr);
        }
        ((Random) this.A02.get()).nextBytes(bArr);
        return r3.A01(canonicalPath, str, Base64.encodeToString(bArr, 2), length, z2);
    }

    public C1048657f A03() {
        C16800tf A002 = this.A01.A00.A00();
        try {
            C1048657f r0 = new C1048657f(A002.A02.A08("SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f ORDER BY   f.required DESC , f._id ASC ", (String[]) null), C101924y7.A00);
            A002.close();
            return r0;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A04() {
        AnonymousClass1GH r0;
        C20120zX r1 = this.A01.A00;
        synchronized (r1) {
            r0 = r1.A00;
            if (r0 == null) {
                r0 = (AnonymousClass1GH) r1.A02.get();
                r1.A00 = r0;
            }
        }
        C16800tf A022 = r0.A02();
        try {
            A022.A02.A01("exported_files_metadata", (String) null, (String[]) null);
            A022.close();
            C20120zX r2 = this.A00;
            synchronized (r2) {
                AnonymousClass1GH r02 = r2.A00;
                if (r02 != null) {
                    r02.close();
                    r2.A00 = null;
                }
                r2.A01.deleteDatabase("migration_export_metadata.db");
                Log.i("ExportMetadata/removeDatabase/deleted");
            }
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
