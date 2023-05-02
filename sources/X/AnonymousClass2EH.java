package X;

/* renamed from: X.2EH  reason: invalid class name */
public class AnonymousClass2EH extends C30111bl implements AnonymousClass2EI {
    public final C216314v A00;
    public final C18550ws A01;

    public AnonymousClass2EH(C216314v r3, C18550ws r4, C24821Hk r5) {
        super(r5, "labeled_jid", 1);
        this.A00 = r3;
        this.A01 = r4;
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
            java.lang.String r1 = "labeled_jid"
            r0 = 0
            r2.A01(r1, r0, r0)     // Catch:{ all -> 0x002d }
            X.11I r1 = r5.A06     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "labeled_jids_ready"
            r1.A03(r0)     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "migration_labeled_jid_index"
            r1.A03(r0)     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "migration_labeled_jid_retry"
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2EH.onRollback():void");
    }
}
