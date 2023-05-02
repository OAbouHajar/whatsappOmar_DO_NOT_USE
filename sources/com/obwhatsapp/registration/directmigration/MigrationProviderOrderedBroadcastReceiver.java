package com.obwhatsapp.registration.directmigration;

import X.AnonymousClass10J;
import X.AnonymousClass15P;
import X.C14710pd;
import X.C15860rz;
import X.C15900s5;
import X.C16040sK;
import X.C18990xa;
import X.C19640yl;
import X.C210912t;
import android.content.BroadcastReceiver;

public class MigrationProviderOrderedBroadcastReceiver extends BroadcastReceiver {
    public C16040sK A00;
    public C15900s5 A01;
    public AnonymousClass15P A02;
    public C15860rz A03;
    public C210912t A04;
    public AnonymousClass10J A05;
    public C14710pd A06;
    public C18990xa A07;
    public C19640yl A08;
    public final Object A09;
    public volatile boolean A0A;

    public MigrationProviderOrderedBroadcastReceiver() {
        this(0);
    }

    public MigrationProviderOrderedBroadcastReceiver(int i2) {
        this.A0A = false;
        this.A09 = new Object();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0096, code lost:
        if (X.AnonymousClass01R.A00(r10, "com.obwhatsapp.w4b") <= 656) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01e8, code lost:
        if (r4 != false) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            boolean r0 = r9.A0A
            if (r0 != 0) goto L_0x0075
            java.lang.Object r1 = r9.A09
            monitor-enter(r1)
            boolean r0 = r9.A0A     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0070
            java.lang.Object r2 = X.AnonymousClass2IF.A01(r10)     // Catch:{ all -> 0x0072 }
            X.01F r2 = (X.AnonymousClass01F) r2     // Catch:{ all -> 0x0072 }
            X.0sX r2 = (X.C16150sX) r2     // Catch:{ all -> 0x0072 }
            X.01J r0 = r2.A05     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0072 }
            X.0pd r0 = (X.C14710pd) r0     // Catch:{ all -> 0x0072 }
            r9.A06 = r0     // Catch:{ all -> 0x0072 }
            X.01J r0 = r2.ADr     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0072 }
            X.0sK r0 = (X.C16040sK) r0     // Catch:{ all -> 0x0072 }
            r9.A00 = r0     // Catch:{ all -> 0x0072 }
            X.01J r0 = r2.ALm     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0072 }
            X.0s5 r0 = (X.C15900s5) r0     // Catch:{ all -> 0x0072 }
            r9.A01 = r0     // Catch:{ all -> 0x0072 }
            X.01J r0 = r2.ADh     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0072 }
            X.0xa r0 = (X.C18990xa) r0     // Catch:{ all -> 0x0072 }
            r9.A07 = r0     // Catch:{ all -> 0x0072 }
            X.01J r0 = r2.A0b     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0072 }
            X.15P r0 = (X.AnonymousClass15P) r0     // Catch:{ all -> 0x0072 }
            r9.A02 = r0     // Catch:{ all -> 0x0072 }
            X.01J r0 = r2.A02     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0072 }
            X.10J r0 = (X.AnonymousClass10J) r0     // Catch:{ all -> 0x0072 }
            r9.A05 = r0     // Catch:{ all -> 0x0072 }
            X.01J r0 = r2.AQh     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0072 }
            X.0rz r0 = (X.C15860rz) r0     // Catch:{ all -> 0x0072 }
            r9.A03 = r0     // Catch:{ all -> 0x0072 }
            X.01J r0 = r2.ACo     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0072 }
            X.0yl r0 = (X.C19640yl) r0     // Catch:{ all -> 0x0072 }
            r9.A08 = r0     // Catch:{ all -> 0x0072 }
            X.01J r0 = r2.ADW     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0072 }
            X.12t r0 = (X.C210912t) r0     // Catch:{ all -> 0x0072 }
            r9.A04 = r0     // Catch:{ all -> 0x0072 }
            r0 = 1
            r9.A0A = r0     // Catch:{ all -> 0x0072 }
        L_0x0070:
            monitor-exit(r1)     // Catch:{ all -> 0x0072 }
            goto L_0x0075
        L_0x0072:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0072 }
            throw r0
        L_0x0075:
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/on-receive"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sK r0 = r9.A00
            r0.A0B()
            com.obwhatsapp.Me r8 = r0.A00
            X.0sK r0 = r9.A00
            boolean r0 = r0.A0G()
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = "com.obwhatsapp.w4b"
            long r6 = X.AnonymousClass01R.A00(r10, r0)
            r4 = 656(0x290, double:3.24E-321)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 1
            if (r0 > 0) goto L_0x0099
        L_0x0098:
            r7 = 0
        L_0x0099:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            if (r11 == 0) goto L_0x0180
            java.lang.String r0 = r11.getAction()
            if (r0 == 0) goto L_0x0180
            X.0xa r0 = r9.A07
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0180
            if (r8 == 0) goto L_0x0180
            java.lang.String r1 = r11.getAction()
            java.lang.String r0 = "com.obwhatsapp.registration.directmigration.initialMigrationInfoAction"
            boolean r0 = r0.equals(r1)
            java.lang.String r6 = "phone_number"
            java.lang.String r4 = "me_country_code"
            if (r0 == 0) goto L_0x011a
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/request-initial-migration-token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r8.cc
            r5.putString(r4, r0)
            java.lang.String r0 = r8.number
            r5.putString(r6, r0)
            android.os.Bundle r1 = r9.getResultExtras(r2)
            java.lang.String r0 = "database_migration_is_enabled_on_requester_side"
            boolean r1 = r1.getBoolean(r0)
            java.lang.String r0 = "sister_app_content_provider_enabled"
            r5.putBoolean(r0, r7)
            if (r1 == 0) goto L_0x010f
            if (r7 == 0) goto L_0x010f
            X.0s5 r1 = r9.A01
            X.0tC r0 = X.C15910s6.A1D
            int r1 = r1.A02(r0)
            java.lang.String r0 = "direct_db_migration_timeout_in_secs"
            r5.putInt(r0, r1)
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/request-database-migration-action"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yl r0 = r9.A08
            X.0sq r2 = r0.A04
            X.35u r1 = new X.35u
            r1.<init>(r0)
            java.lang.Void[] r0 = new java.lang.Void[r3]
            r2.Ack(r1, r0)
            X.12t r3 = r9.A04
            X.0sq r2 = r3.A0N
            r1 = 38
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r0.<init>(r3, r1)
            r2.Acl(r0)
        L_0x010f:
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = -1
            r0 = 0
            r9.setResult(r1, r0, r5)
            return
        L_0x011a:
            if (r7 == 0) goto L_0x0180
            java.lang.String r1 = r11.getAction()
            java.lang.String r0 = "com.obwhatsapp.registration.directmigration.recoveryTokenAction"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01ec
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/request-token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Bundle r7 = r9.getResultExtras(r2)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r6 = r7.getString(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0180
            X.0rz r0 = r9.A03
            java.lang.String r0 = r0.A0O()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0180
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0180
            X.0rz r0 = r9.A03
            java.lang.String r0 = r0.A0Q()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0180
            X.15P r0 = r9.A02
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0180
            java.lang.String r0 = "auth"
            android.os.Parcelable r2 = r7.getParcelable(r0)
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            if (r2 != 0) goto L_0x0189
            java.lang.String r1 = "MigrationProviderOrderedBroadcastReceiver/verifyRequester/invalid auth intent; data="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0180:
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.setResultCode(r3)
            return
        L_0x0189:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r1 < r0) goto L_0x01e3
            java.lang.String r2 = r2.getCreatorPackage()
        L_0x0193:
            java.lang.String r0 = "com.obwhatsapp.w4b"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0180
            android.content.pm.PackageManager r1 = r10.getPackageManager()
            java.lang.String r0 = r10.getPackageName()
            int r0 = r1.checkSignatures(r2, r0)
            if (r0 != 0) goto L_0x0180
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = X.AnonymousClass293.A00(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01e1
            byte[] r1 = X.C004101u.A0G(r10, r1)
            if (r1 == 0) goto L_0x01e1
            java.lang.String r0 = "key_recovery_token"
            r5.putByteArray(r0, r1)
            r4 = 1
        L_0x01ce:
            X.0pd r2 = r9.A06
            X.10J r1 = r9.A05
            X.0rz r0 = r9.A03
            byte[] r1 = X.AnonymousClass2FR.A07(r10, r0, r1, r2, r6)
            if (r1 == 0) goto L_0x01e8
            java.lang.String r0 = "key_backup_token"
            r5.putByteArray(r0, r1)
            goto L_0x010f
        L_0x01e1:
            r4 = 0
            goto L_0x01ce
        L_0x01e3:
            java.lang.String r2 = r2.getTargetPackage()
            goto L_0x0193
        L_0x01e8:
            if (r4 == 0) goto L_0x0180
            goto L_0x010f
        L_0x01ec:
            java.lang.String r1 = r11.getAction()
            java.lang.String r0 = "com.obwhatsapp.registration.directmigration.setMigrationStateOnProviderSide"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0180
            android.os.Bundle r1 = r9.getResultExtras(r2)
            X.0rz r0 = r9.A03
            java.lang.String r2 = "migration_state_on_provider_side"
            int r1 = r1.getInt(r2, r3)
            android.content.SharedPreferences$Editor r0 = r0.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r1)
            r0.apply()
            goto L_0x0180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
