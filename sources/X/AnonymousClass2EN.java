package X;

import android.database.Cursor;

/* renamed from: X.2EN  reason: invalid class name */
public class AnonymousClass2EN extends C30111bl implements AnonymousClass2EI {
    public final C16920ts A00;
    public final C222917j A01;
    public final C18860xN A02;

    public AnonymousClass2EN(C16920ts r3, C222917j r4, C18860xN r5, C24821Hk r6) {
        super(r6, "message_text", 1);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public final C28381Vw A0U(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("key_from_me");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("key_id");
        C15830rv A06 = this.A00.A06(cursor);
        int i2 = cursor.getInt(columnIndexOrThrow);
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        return new C28381Vw(A06, cursor.getString(columnIndexOrThrow2), z2);
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
            java.lang.String r1 = "message_text"
            r0 = 0
            r2.A01(r1, r0, r0)     // Catch:{ all -> 0x0033 }
            X.11I r1 = r5.A06     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "text_ready"
            r1.A03(r0)     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "migration_message_text_index"
            r1.A03(r0)     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "migration_message_text_retry"
            r1.A03(r0)     // Catch:{ all -> 0x0033 }
            r3.A00()     // Catch:{ all -> 0x0033 }
            r3.close()     // Catch:{ all -> 0x0038 }
            r4.close()
            java.lang.String r0 = "TextMessageStore/TextMessageDatabaseMigration/resetMigration/done"
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2EN.onRollback():void");
    }
}
