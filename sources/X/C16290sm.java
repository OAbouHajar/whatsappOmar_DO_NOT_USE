package X;

import android.content.SharedPreferences;

/* renamed from: X.0sm  reason: invalid class name and case insensitive filesystem */
public class C16290sm {
    public final SharedPreferences A00;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        r2.put("version", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        r2.put("registration_state", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        r2.put("force_db_check", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        r2.put("companion_registration_state", r5);
        r2.put("registration_device_id", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        r2.put("forced_language", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        r2.put("profile_photo_thumb_id", r5);
        r2.put("profile_photo_full_id", r5);
        r2.put("push_name", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0085, code lost:
        r2.put("async_tasks_pending_for_version_change", r8);
        r1 = new java.lang.StringBuilder("WaStartupSharedPreferences/added ");
        r1.append(r2.size());
        r1.append(" keys");
        com.whatsapp.util.Log.i(r1.toString());
        r15 = r2.entrySet().iterator();
        r4 = null;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b2, code lost:
        if (r15.hasNext() == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b4, code lost:
        r1 = (java.util.Map.Entry) r15.next();
        r2 = (java.lang.String) r1.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c4, code lost:
        if (r10.contains(r2) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ca, code lost:
        if (r9.contains(r2) != false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cc, code lost:
        if (r4 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ce, code lost:
        r4 = r9.edit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d2, code lost:
        r14 = (java.lang.Class) r1.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d9, code lost:
        if (r14 != r8) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00db, code lost:
        r4.putBoolean(r2, r10.getBoolean(r2, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e3, code lost:
        if (r14 != r5) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e5, code lost:
        r4.putInt(r2, r10.getInt(r2, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ef, code lost:
        if (r14 != java.lang.Float.class) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f1, code lost:
        r4.putFloat(r2, r10.getFloat(r2, 0.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fa, code lost:
        if (r14 != r7) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fc, code lost:
        r4.putLong(r2, r10.getLong(r2, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0106, code lost:
        if (r14 != r6) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0108, code lost:
        r4.putString(r2, r10.getString(r2, (java.lang.String) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0116, code lost:
        if (java.util.Set.class.isAssignableFrom(r14) == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0118, code lost:
        r4.putStringSet(r2, r10.getStringSet(r2, (java.util.Set) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011f, code lost:
        if (r3 != null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0121, code lost:
        r3 = r10.edit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0125, code lost:
        r3.remove(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0129, code lost:
        r0 = new java.lang.StringBuilder("Cannot access value of type ");
        r0.append(r14);
        r1 = new java.lang.IllegalArgumentException(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0144, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0145, code lost:
        if (r4 == null) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0147, code lost:
        r4.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014a, code lost:
        if (r3 == null) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014c, code lost:
        r3.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014f, code lost:
        r9.edit().putInt("startup_migrated_version", 8).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16290sm(X.C17020u3 r17) {
        /*
            r16 = this;
            java.lang.String r0 = "startup_prefs"
            r3 = r17
            android.content.SharedPreferences r0 = r3.A00(r0)
            r13 = 0
            r12 = 8
            r2 = r16
            r2.<init>()
            r2.A00 = r0
            java.lang.String r11 = "startup_migrated_version"
            r1 = 0
            int r0 = r0.getInt(r11, r1)     // Catch:{ all -> 0x015b }
            if (r0 >= r12) goto L_0x015a
            android.content.SharedPreferences r0 = r2.A00     // Catch:{ all -> 0x015b }
            r0.getInt(r11, r1)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = X.C15860rz.A05     // Catch:{ all -> 0x015b }
            android.content.SharedPreferences r10 = r3.A00(r0)     // Catch:{ all -> 0x015b }
            if (r10 == 0) goto L_0x015a
            android.content.SharedPreferences r9 = r2.A00     // Catch:{ all -> 0x015b }
            int r0 = r9.getInt(r11, r1)     // Catch:{ all -> 0x015b }
            if (r0 >= r12) goto L_0x015a
            int r0 = r9.getInt(r11, r1)     // Catch:{ all -> 0x015b }
            java.lang.Class<java.lang.Boolean> r8 = java.lang.Boolean.class
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x015b }
            r2.<init>()     // Catch:{ all -> 0x015b }
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0057;
                case 2: goto L_0x005d;
                case 3: goto L_0x0062;
                case 4: goto L_0x0067;
                case 5: goto L_0x0071;
                case 6: goto L_0x0076;
                case 7: goto L_0x0085;
                default: goto L_0x0046;
            }     // Catch:{ all -> 0x015b }
        L_0x0046:
            goto L_0x013d
        L_0x0048:
            java.lang.String r0 = "client_server_time_diff"
            r2.put(r0, r7)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "client_ntp_time_diff"
            r2.put(r0, r7)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "last_ntp_client_time"
            r2.put(r0, r7)     // Catch:{ all -> 0x015b }
        L_0x0057:
            java.lang.String r0 = "version"
            r2.put(r0, r6)     // Catch:{ all -> 0x015b }
        L_0x005d:
            java.lang.String r0 = "registration_state"
            r2.put(r0, r5)     // Catch:{ all -> 0x015b }
        L_0x0062:
            java.lang.String r0 = "force_db_check"
            r2.put(r0, r8)     // Catch:{ all -> 0x015b }
        L_0x0067:
            java.lang.String r0 = "companion_registration_state"
            r2.put(r0, r5)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "registration_device_id"
            r2.put(r0, r5)     // Catch:{ all -> 0x015b }
        L_0x0071:
            java.lang.String r0 = "forced_language"
            r2.put(r0, r6)     // Catch:{ all -> 0x015b }
        L_0x0076:
            java.lang.String r0 = "profile_photo_thumb_id"
            r2.put(r0, r5)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "profile_photo_full_id"
            r2.put(r0, r5)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "push_name"
            r2.put(r0, r6)     // Catch:{ all -> 0x015b }
        L_0x0085:
            java.lang.String r0 = "async_tasks_pending_for_version_change"
            r2.put(r0, r8)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "WaStartupSharedPreferences/added "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x015b }
            r1.<init>(r0)     // Catch:{ all -> 0x015b }
            int r0 = r2.size()     // Catch:{ all -> 0x015b }
            r1.append(r0)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = " keys"
            r1.append(r0)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x015b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015b }
            java.util.Set r0 = r2.entrySet()     // Catch:{ all -> 0x015b }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x015b }
            r4 = 0
            r3 = r13
        L_0x00ae:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0145
            java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x015b }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x015b }
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x015b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x015b }
            boolean r0 = r10.contains(r2)     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r9.contains(r2)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x011f
            if (r4 != 0) goto L_0x00d2
            android.content.SharedPreferences$Editor r4 = r9.edit()     // Catch:{ all -> 0x015b }
        L_0x00d2:
            java.lang.Object r14 = r1.getValue()     // Catch:{ all -> 0x015b }
            java.lang.Class r14 = (java.lang.Class) r14     // Catch:{ all -> 0x015b }
            r0 = 0
            if (r14 != r8) goto L_0x00e3
            boolean r0 = r10.getBoolean(r2, r0)     // Catch:{ all -> 0x015b }
            r4.putBoolean(r2, r0)     // Catch:{ all -> 0x015b }
            goto L_0x011f
        L_0x00e3:
            if (r14 != r5) goto L_0x00ed
            int r0 = r10.getInt(r2, r0)     // Catch:{ all -> 0x015b }
            r4.putInt(r2, r0)     // Catch:{ all -> 0x015b }
            goto L_0x011f
        L_0x00ed:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r14 != r0) goto L_0x00fa
            r0 = 0
            float r0 = r10.getFloat(r2, r0)     // Catch:{ all -> 0x015b }
            r4.putFloat(r2, r0)     // Catch:{ all -> 0x015b }
            goto L_0x011f
        L_0x00fa:
            if (r14 != r7) goto L_0x0106
            r0 = 0
            long r0 = r10.getLong(r2, r0)     // Catch:{ all -> 0x015b }
            r4.putLong(r2, r0)     // Catch:{ all -> 0x015b }
            goto L_0x011f
        L_0x0106:
            if (r14 != r6) goto L_0x0110
            java.lang.String r0 = r10.getString(r2, r13)     // Catch:{ all -> 0x015b }
            r4.putString(r2, r0)     // Catch:{ all -> 0x015b }
            goto L_0x011f
        L_0x0110:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r0 = r0.isAssignableFrom(r14)     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0129
            java.util.Set r0 = r10.getStringSet(r2, r13)     // Catch:{ all -> 0x015b }
            r4.putStringSet(r2, r0)     // Catch:{ all -> 0x015b }
        L_0x011f:
            if (r3 != 0) goto L_0x0125
            android.content.SharedPreferences$Editor r3 = r10.edit()     // Catch:{ all -> 0x015b }
        L_0x0125:
            r3.remove(r2)     // Catch:{ all -> 0x015b }
            goto L_0x00ae
        L_0x0129:
            java.lang.String r1 = "Cannot access value of type "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x015b }
            r0.<init>(r1)     // Catch:{ all -> 0x015b }
            r0.append(r14)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x015b }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x015b }
            r1.<init>(r0)     // Catch:{ all -> 0x015b }
            goto L_0x0144
        L_0x013d:
            java.lang.String r0 = "Version bump required"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x015b }
            r1.<init>(r0)     // Catch:{ all -> 0x015b }
        L_0x0144:
            throw r1     // Catch:{ all -> 0x015b }
        L_0x0145:
            if (r4 == 0) goto L_0x014a
            r4.commit()     // Catch:{ all -> 0x015b }
        L_0x014a:
            if (r3 == 0) goto L_0x014f
            r3.commit()     // Catch:{ all -> 0x015b }
        L_0x014f:
            android.content.SharedPreferences$Editor r0 = r9.edit()     // Catch:{ all -> 0x015b }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r11, r12)     // Catch:{ all -> 0x015b }
            r0.apply()     // Catch:{ all -> 0x015b }
        L_0x015a:
            return
        L_0x015b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16290sm.<init>(X.0u3):void");
    }

    public void A00() {
        this.A00.edit().remove("forced_language").apply();
    }

    public void A01(String str) {
        this.A00.edit().putString("forced_language", str).apply();
    }
}
