package X;

import android.content.Context;
import com.obwhatsapp.yo.yo;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0u3  reason: invalid class name and case insensitive filesystem */
public class C17020u3 {
    public static final Set A04;
    public final Context A00;
    public final C23281Bj A01;
    public final Map A02 = new HashMap();
    public final AtomicInteger A03 = new AtomicInteger();

    static {
        StringBuilder sb = new StringBuilder("com.obwhatsapp");
        sb.append("_preferences");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.obwhatsapp");
        sb2.append("_preferences_payments_debug");
        A04 = new HashSet(Arrays.asList(new String[]{sb.toString(), "ab-props", "ab-prechatd-props", "startup_prefs", "field-stats-events-sampling", "server_prop_preferences", "com.obwhatsapp_payment_preferences", "forced_blocked_shared_prefs", "debug_drawer", "com.obwhatsapp_payment_debug_preferences", sb2.toString()}));
    }

    public C17020u3(Context context, C23281Bj r3) {
        this.A00 = context;
        this.A01 = r3;
    }

    public static C17020u3 A21() {
        return (C17020u3) yo.mSingletonC.AMG.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f0, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.SharedPreferences A00(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.Set r0 = A04     // Catch:{ all -> 0x00f3 }
            boolean r0 = r0.contains(r8)     // Catch:{ all -> 0x00f3 }
            r3 = 0
            if (r0 == 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            java.util.Map r2 = r7.A02     // Catch:{ all -> 0x00f1 }
            java.lang.Object r4 = r2.get(r8)     // Catch:{ all -> 0x00f1 }
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4     // Catch:{ all -> 0x00f1 }
            if (r4 != 0) goto L_0x00ef
            java.lang.String r1 = X.AnonymousClass01S.A07     // Catch:{ all -> 0x00f1 }
            boolean r0 = r1.equals(r8)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0027
            android.content.Context r0 = r7.A00     // Catch:{ all -> 0x00f1 }
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r3)     // Catch:{ all -> 0x00f1 }
            monitor-exit(r7)
            return r0
        L_0x0027:
            android.content.Context r1 = r7.A00     // Catch:{ all -> 0x00f1 }
            java.io.File r0 = r1.getFilesDir()     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = r0.getParent()     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "shared_prefs"
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00f1 }
            r4.<init>(r6, r0)     // Catch:{ all -> 0x00f1 }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x00a9
            r6 = 0
            r4.mkdir()     // Catch:{ SecurityException -> 0x00d2 }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "SharedPreferencesFactory/Failed to create preference dir "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r5.<init>(r0)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ all -> 0x00f1 }
            r5.append(r0)     // Catch:{ all -> 0x00f1 }
        L_0x0057:
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x00f1 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00f1 }
            android.content.SharedPreferences r4 = r1.getSharedPreferences(r8, r3)     // Catch:{ all -> 0x00f1 }
            goto L_0x00ec
        L_0x0064:
            boolean r0 = r4.isDirectory()     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0076
            boolean r0 = r4.canRead()     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x0076
            boolean r0 = r4.canWrite()     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x00a9
        L_0x0076:
            java.lang.String r0 = "SharedPreferencesFactory/Invalid preference dir "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r5.<init>(r0)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ all -> 0x00f1 }
            r5.append(r0)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = ", isDirectory="
            r5.append(r0)     // Catch:{ all -> 0x00f1 }
            boolean r0 = r4.isDirectory()     // Catch:{ all -> 0x00f1 }
            r5.append(r0)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = ", canRead="
            r5.append(r0)     // Catch:{ all -> 0x00f1 }
            boolean r0 = r4.canRead()     // Catch:{ all -> 0x00f1 }
            r5.append(r0)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = ", canWrite="
            r5.append(r0)     // Catch:{ all -> 0x00f1 }
            boolean r0 = r4.canWrite()     // Catch:{ all -> 0x00f1 }
            r5.append(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x0057
        L_0x00a9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r1.<init>()     // Catch:{ all -> 0x00f1 }
            r1.append(r8)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = ".xml"
            r1.append(r0)     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f1 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00f1 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x00f1 }
            X.1Uw r3 = new X.1Uw     // Catch:{ all -> 0x00f1 }
            r3.<init>(r0)     // Catch:{ all -> 0x00f1 }
            X.1Bj r1 = r7.A01     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.atomic.AtomicInteger r0 = r7.A03     // Catch:{ all -> 0x00f1 }
            int r0 = r0.getAndIncrement()     // Catch:{ all -> 0x00f1 }
            X.1Ux r4 = new X.1Ux     // Catch:{ all -> 0x00f1 }
            r4.<init>(r3, r1, r0, r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x00ec
        L_0x00d2:
            r5 = move-exception
            java.lang.String r0 = "SharedPreferencesFactory/Unable to create LightSharedPreferences: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r3.<init>(r0)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ all -> 0x00f1 }
            r3.append(r0)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00f1 }
            com.whatsapp.util.Log.e(r0, r5)     // Catch:{ all -> 0x00f1 }
            android.content.SharedPreferences r4 = r1.getSharedPreferences(r8, r6)     // Catch:{ all -> 0x00f1 }
        L_0x00ec:
            r2.put(r8, r4)     // Catch:{ all -> 0x00f1 }
        L_0x00ef:
            monitor-exit(r7)
            return r4
        L_0x00f1:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17020u3.A00(java.lang.String):android.content.SharedPreferences");
    }

    public boolean A01() {
        File file = new File(this.A00.getFilesDir().getParent(), "shared_prefs");
        StringBuilder sb = new StringBuilder();
        sb.append("ab-props-backup");
        sb.append(".xml");
        return new File(file, sb.toString()).exists();
    }
}
