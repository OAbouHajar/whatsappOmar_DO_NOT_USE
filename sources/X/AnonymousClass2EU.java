package X;

/* renamed from: X.2EU  reason: invalid class name */
public class AnonymousClass2EU extends C30111bl implements AnonymousClass2EI {
    public final C216314v A00;
    public final C224217w A01;

    public AnonymousClass2EU(C216314v r3, C224217w r4, C24821Hk r5) {
        super(r5, "message_mention", 1);
        this.A00 = r3;
        this.A01 = r4;
    }

    public /* synthetic */ void AMJ() {
    }

    public /* synthetic */ void ANa() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRollback() {
        /*
            r5 = this;
            X.0tq r0 = r5.A05
            X.0tf r4 = r0.A02()
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x0037 }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = "message_mentions"
            r0 = 0
            r2.A01(r1, r0, r0)     // Catch:{ all -> 0x0032 }
            X.11I r1 = r5.A06     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "mention_message_ready"
            r1.A03(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "migration_message_mention_index"
            r1.A03(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "migration_message_mention_retry"
            r1.A03(r0)     // Catch:{ all -> 0x0032 }
            r3.A00()     // Catch:{ all -> 0x0032 }
            r3.close()     // Catch:{ all -> 0x0037 }
            r4.close()
            java.lang.String r0 = "MentionMessageStore/resetDatabaseMigration/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0032:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2EU.onRollback():void");
    }
}
