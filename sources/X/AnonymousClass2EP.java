package X;

/* renamed from: X.2EP  reason: invalid class name */
public class AnonymousClass2EP extends C30111bl implements AnonymousClass2EI {
    public final C223317n A00;

    public AnonymousClass2EP(C223317n r3, C24821Hk r4) {
        super(r4, "message_future", 1);
        this.A00 = r3;
    }

    public /* synthetic */ void AMJ() {
    }

    public /* synthetic */ void ANa() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0031 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRollback() {
        /*
            r5 = this;
            X.0tq r0 = r5.A05
            X.0tf r4 = r0.A02()
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x0032 }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x002d }
            java.lang.String r1 = "message_future"
            r0 = 0
            r2.A01(r1, r0, r0)     // Catch:{ all -> 0x002d }
            X.11I r1 = r5.A06     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "future_ready"
            r1.A03(r0)     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "migration_message_future_index"
            r1.A03(r0)     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "migration_message_future_retry"
            r1.A03(r0)     // Catch:{ all -> 0x002d }
            r3.A00()     // Catch:{ all -> 0x002d }
            r3.close()     // Catch:{ all -> 0x0032 }
            r4.close()
            return
        L_0x002d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2EP.onRollback():void");
    }
}
