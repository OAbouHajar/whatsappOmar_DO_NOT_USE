package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2EM  reason: invalid class name */
public class AnonymousClass2EM extends C30111bl implements AnonymousClass2EI {
    public C37281ou A00;
    public final C16040sK A01;
    public final C16820th A02;
    public final C216314v A03;
    public final C26891Pq A04;
    public final C218715t A05;

    public AnonymousClass2EM(C16040sK r3, C16820th r4, C216314v r5, C26891Pq r6, C218715t r7, C24821Hk r8) {
        super(r8, "receipt_user", Integer.MIN_VALUE);
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A05 = r7;
    }

    public void A0G() {
        super.A0G();
        this.A06.A04("receipt_user_ready", 2);
    }

    public boolean A0T(C30101bk r5) {
        C16800tf A012 = this.A05.get();
        try {
            if (TextUtils.isEmpty(C33961jT.A00(A012.A02, "table", "messages"))) {
                A0G();
                A012.close();
                return true;
            }
            A012.close();
            return super.A0T(r5);
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final void A0U(AnonymousClass21N r6, UserJid userJid, long j2) {
        long A012 = this.A03.A01(userJid);
        if (A012 == -1) {
            this.A01.AcB("ReceiptUserStoreDatabaseMigration: invalid jid", userJid.toString(), false);
            return;
        }
        this.A00.A01(1, j2);
        this.A00.A01(2, A012);
        this.A00.A01(3, r6.A00);
        this.A00.A01(4, r6.A02);
        this.A00.A01(5, r6.A01);
        this.A00.A00.executeInsert();
        this.A00.A00.clearBindings();
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
            java.lang.String r1 = "receipt_user"
            r0 = 0
            r2.A01(r1, r0, r0)     // Catch:{ all -> 0x0032 }
            X.11I r1 = r5.A06     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "receipt_user_ready"
            r1.A03(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "migration_receipt_index"
            r1.A03(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "migration_receipt_retry"
            r1.A03(r0)     // Catch:{ all -> 0x0032 }
            r3.A00()     // Catch:{ all -> 0x0032 }
            r3.close()     // Catch:{ all -> 0x0037 }
            r4.close()
            java.lang.String r0 = "ReceiptUserStore/ReceiptUserStoreDatabaseMigration/resetMigration/done"
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2EM.onRollback():void");
    }
}
