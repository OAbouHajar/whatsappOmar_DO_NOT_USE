package X;

import android.content.Intent;
import android.os.SystemClock;
import com.obwhatsapp.registration.RegisterName;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.36s  reason: invalid class name and case insensitive filesystem */
public class C609436s extends C16690tT {
    public WeakReference A00;
    public final C14870pt A01;
    public final C19650ym A02;
    public final C19640yl A03;
    public final C83004Ez A04;

    public C609436s(C14870pt r2, C19650ym r3, RegisterName registerName, C19640yl r5, C83004Ez r6) {
        this.A01 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r3;
        this.A00 = C13690nt.A0h(registerName);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r6) {
        /*
            r5 = this;
            X.4Ez r0 = r5.A04
            java.util.Set r3 = r0.A00
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0069
            int r0 = r3.size()
            boolean r1 = X.C13690nt.A1R(r0)
            java.lang.String r0 = "Multiple bridges registered. Not supported."
            X.AnonymousClass00B.A0B(r0, r1)
            java.util.Iterator r0 = r3.iterator()
            java.lang.Object r0 = r0.next()
            X.1NO r0 = (X.AnonymousClass1NO) r0
            if (r0 == 0) goto L_0x0069
            boolean r0 = r0.A0H()
        L_0x0027:
            java.lang.Integer r4 = X.C13680ns.A0Y()
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/google-migrate-flow/import is still running"
        L_0x002f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r4
        L_0x0033:
            X.0ym r0 = r5.A02
            X.0tq r2 = r0.A02
            r1 = 0
            r0 = 0
            boolean r0 = r2.A07(r1, r0)
            if (r0 != 0) goto L_0x00a4
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0070
            int r0 = r3.size()
            boolean r1 = X.C13690nt.A1R(r0)
            java.lang.String r0 = "Multiple bridges registered. Not supported."
            X.AnonymousClass00B.A0B(r0, r1)
            java.util.Iterator r0 = r3.iterator()
            java.lang.Object r0 = r0.next()
            X.1NO r0 = (X.AnonymousClass1NO) r0
            if (r0 == 0) goto L_0x0070
            X.1NJ r0 = r0.A03
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/google-migrate-flow"
            goto L_0x002f
        L_0x0069:
            java.lang.String r0 = "GoogleMigrateUtil/isImportRunning/no-bridge"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            goto L_0x0027
        L_0x0070:
            java.lang.String r0 = "GoogleMigrateUtil/hasWhatsAppData/no-bridge"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0075:
            X.0yl r1 = r5.A03
            X.0rz r0 = r1.A01
            boolean r0 = r0.A1Z()
            if (r0 == 0) goto L_0x0082
            r1.A00()
        L_0x0082:
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/media-storage-unreachable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 3
            goto L_0x00aa
        L_0x009d:
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/restore-from-backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            goto L_0x00aa
        L_0x00a4:
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/msg-store-is-healthy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
        L_0x00aa:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609436s.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        RegisterName registerName;
        Intent intent;
        Number number = (Number) obj;
        this.A01.A05();
        WeakReference weakReference = this.A00;
        if (weakReference != null && (registerName = (RegisterName) weakReference.get()) != null && !registerName.AIm()) {
            int intValue = number.intValue();
            Log.i(AnonymousClass000.A0h(intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? C13680ns.A0c(intValue, "unspecified restore type: ") : "message-store-is-healthy" : "media-unreadable" : "from-consumer-app" : "from-google-migrate" : "from-backup", AnonymousClass000.A0r("restore>RegisterName/onRestoreStateResult/result = ")));
            if (intValue == 0) {
                registerName.A3B();
            } else if (intValue == 1) {
                C13680ns.A0x(registerName.A09.A0K(), "google_migrate_import_start_time", System.currentTimeMillis());
                try {
                    intent = new Intent(registerName, Class.forName("com.obwhatsapp.migration.android.view.GoogleMigrateImporterActivity"));
                } catch (ClassNotFoundException unused) {
                    Log.e("GoogleMigrateUtil/createStartIntent/class not found");
                    intent = null;
                }
                registerName.startActivityForResult(intent, 18);
            } else if (intValue == 2) {
                C13680ns.A0x(registerName.A09.A0K(), "direct_migration_start_time", SystemClock.elapsedRealtime());
                long A002 = AnonymousClass01R.A00(registerName, "com.obwhatsapp.w4b");
                StringBuilder A0r = AnonymousClass000.A0r("RegisterName/checkForMigrateFromConsumerDirectly/providerAppVersionCode = ");
                A0r.append(A002);
                C13680ns.A1V(A0r);
                registerName.A1A.A01.A0A = Long.valueOf(A002);
                Intent A09 = C13680ns.A09();
                A09.setClassName(registerName.getPackageName(), "com.obwhatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity");
                registerName.startActivityForResult(A09, 16);
            } else if (intValue == 3) {
                AnonymousClass29T.A01(registerName, 107);
            } else if (intValue == 4) {
                registerName.A1D.A03("profile_photo", "no_tap");
                registerName.A39();
                registerName.A1P = 4;
                registerName.A09.A0l(System.currentTimeMillis() + 604800000);
            } else {
                throw AnonymousClass000.A0V(C13680ns.A0c(intValue, "restore>RegisterName/onRestoreStateResult/result is not recognized/result = "));
            }
        }
    }
}
