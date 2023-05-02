package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.Map;

/* renamed from: X.0od  reason: invalid class name and case insensitive filesystem */
public final class C14110od {
    public final Context A00;
    public final SharedPreferences A01;
    public final C14190ol A02;
    public final Map A03 = new AnonymousClass00N();

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3) != false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        r1 = java.lang.String.valueOf(r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        if (r1.length() != 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        r0 = "Error creating file in no backup dir: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        android.util.Log.d("FirebaseInstanceId", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        r0 = new java.lang.String("Error creating file in no backup dir: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14110od(android.content.Context r5) {
        /*
            r4 = this;
            X.0ol r2 = new X.0ol
            r2.<init>()
            java.lang.String r3 = "FirebaseInstanceId"
            r4.<init>()
            X.00N r0 = new X.00N
            r0.<init>()
            r4.A03 = r0
            r4.A00 = r5
            java.lang.String r1 = "com.google.android.gms.appid"
            r0 = 0
            android.content.SharedPreferences r0 = r5.getSharedPreferences(r1, r0)
            r4.A01 = r0
            r4.A02 = r2
            java.io.File r2 = X.AnonymousClass00T.A06(r5)
            java.lang.String r0 = "com.google.android.gms.appid-no-backup"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x007a
            boolean r0 = r1.createNewFile()     // Catch:{ IOException -> 0x005b }
            if (r0 == 0) goto L_0x007a
            r1 = r4
            monitor-enter(r1)     // Catch:{ IOException -> 0x005b }
            android.content.SharedPreferences r0 = r4.A01     // Catch:{ all -> 0x0058 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0058 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0058 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x005b }
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = "App restored, clearing state"
            android.util.Log.i(r3, r0)     // Catch:{ IOException -> 0x005b }
            r4.A02()     // Catch:{ IOException -> 0x005b }
            X.0nx r0 = X.C13720nx.A00()     // Catch:{ IOException -> 0x005b }
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)     // Catch:{ IOException -> 0x005b }
            r0.A07()     // Catch:{ IOException -> 0x005b }
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x005b }
            throw r0     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            r1 = move-exception
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x007a
            java.lang.String r2 = "Error creating file in no backup dir: "
            java.lang.String r0 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r0 = r1.length()
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = r2.concat(r1)
        L_0x0077:
            android.util.Log.d(r3, r0)
        L_0x007a:
            return
        L_0x007b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14110od.<init>(android.content.Context):void");
    }

    public static String A00(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf("").length() + 3 + String.valueOf(str).length());
        sb.append("");
        sb.append("|S|");
        sb.append(str);
        return sb.toString();
    }

    public static String A01(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf("").length() + 4 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("");
        sb.append("|T|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        return sb.toString();
    }

    public final synchronized void A02() {
        this.A03.clear();
        Context context = this.A00;
        File A06 = AnonymousClass00T.A06(context);
        if (A06 == null || !A06.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            A06 = context.getFilesDir();
        }
        for (File file : A06.listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.A01.edit().clear().commit();
    }
}
