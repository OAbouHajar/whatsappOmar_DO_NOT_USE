package X;

/* renamed from: X.2EV  reason: invalid class name */
public class AnonymousClass2EV extends C30111bl implements AnonymousClass2EI {
    public final C216314v A00;
    public final C224117v A01;

    public AnonymousClass2EV(C216314v r3, C224117v r4, C24821Hk r5) {
        super(r5, "message_revoked", 1);
        this.A00 = r3;
        this.A01 = r4;
    }

    public /* synthetic */ void AMJ() {
    }

    public /* synthetic */ void ANa() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRollback() {
        /*
            r5 = this;
            X.0tq r0 = r5.A05
            X.0tf r4 = r0.A02()
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x0038 }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "message_revoked"
            r0 = 0
            r2.A01(r1, r0, r0)     // Catch:{ all -> 0x0033 }
            X.11I r1 = r5.A06     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "revoked_ready"
            r1.A03(r0)     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "migration_message_revoked_index"
            r1.A03(r0)     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "migration_message_revoked_retry"
            r1.A03(r0)     // Catch:{ all -> 0x0033 }
            r3.A00()     // Catch:{ all -> 0x0033 }
            r3.close()     // Catch:{ all -> 0x0038 }
            r4.close()
            java.lang.String r0 = "RevokedMessageStore/resetDatabaseMigration/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0033:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2EV.onRollback():void");
    }
}
