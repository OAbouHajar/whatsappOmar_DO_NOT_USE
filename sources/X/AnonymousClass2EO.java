package X;

/* renamed from: X.2EO  reason: invalid class name */
public class AnonymousClass2EO extends C30111bl implements AnonymousClass2EI {
    public final C223217m A00;

    public AnonymousClass2EO(C223217m r3, C24821Hk r4) {
        super(r4, "message_vcard", 1);
        this.A00 = r3;
    }

    public /* synthetic */ void AMJ() {
    }

    public /* synthetic */ void ANa() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRollback() {
        /*
            r5 = this;
            X.0tq r0 = r5.A05
            X.0tf r4 = r0.A02()
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x003c }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "message_vcard"
            r1 = 0
            r2.A01(r0, r1, r1)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "message_vcard_jid"
            r2.A01(r0, r1, r1)     // Catch:{ all -> 0x0037 }
            X.11I r1 = r5.A06     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "new_vcards_ready"
            r1.A03(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "migration_vcard_index"
            r1.A03(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "migration_vcard_retry"
            r1.A03(r0)     // Catch:{ all -> 0x0037 }
            r3.A00()     // Catch:{ all -> 0x0037 }
            r3.close()     // Catch:{ all -> 0x003c }
            r4.close()
            java.lang.String r0 = "VCardMessageStore/VCardMessageStoreDatabaseMigration/resetMigration/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0037:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2EO.onRollback():void");
    }
}
