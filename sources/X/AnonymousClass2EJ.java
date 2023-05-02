package X;

import android.database.SQLException;
import android.database.sqlite.SQLiteBlobTooBigException;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2EJ  reason: invalid class name */
public class AnonymousClass2EJ extends C30111bl implements AnonymousClass2EI {
    public final AnonymousClass17F A00;
    public final Map A01 = new HashMap();

    public AnonymousClass2EJ(AnonymousClass17F r3, C24821Hk r4) {
        super(r4, "message_fts", Integer.MIN_VALUE);
        this.A00 = r3;
    }

    public void A0G() {
        super.A0G();
        this.A06.A05("fts_ready", 5);
    }

    public boolean A0S(SQLException sQLException, int i2) {
        if (i2 != 1 || !(sQLException instanceof SQLiteBlobTooBigException)) {
            return super.A0S(sQLException, i2);
        }
        Log.e("FtsDatabaseMigration/skipping BlobTooBigException single row");
        return true;
    }

    public /* synthetic */ void AMJ() {
    }

    public /* synthetic */ void ANa() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00a0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRollback() {
        /*
            r10 = this;
            r0 = 0
            X.AnonymousClass00B.A0G(r0)
            java.lang.String r0 = "FtsMessageStore/reset"
            X.1Zf r6 = new X.1Zf
            r6.<init>((java.lang.String) r0)
            X.17F r0 = r10.A00
            r0.A0K()
            X.0tq r9 = r0.A0D
            X.0tf r4 = r9.A02()
            r9.A04()     // Catch:{ all -> 0x00ab }
            X.1jC r8 = r9.A04     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "databasehelper/createFtsTable"
            X.1Zf r5 = new X.1Zf     // Catch:{ all -> 0x00ab }
            r5.<init>((java.lang.String) r0)     // Catch:{ all -> 0x00ab }
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x00ab }
            X.0tg r2 = r8.AHC()     // Catch:{ all -> 0x00a6 }
            X.C33991jW.A00(r2)     // Catch:{ all -> 0x00a6 }
            X.0tg r0 = r4.A02     // Catch:{ all -> 0x00a6 }
            boolean r1 = r8.A0E(r0)     // Catch:{ all -> 0x00a6 }
            boolean r0 = r8.A0F(r0)     // Catch:{ all -> 0x00a6 }
            r8.A0C(r2, r1, r0)     // Catch:{ all -> 0x00a6 }
            r3.A00()     // Catch:{ all -> 0x00a6 }
            r3.close()     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = "databasehelper/createFtsDeprecatedTable time spent:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r2.<init>(r7)     // Catch:{ all -> 0x00ab }
            long r0 = r5.A01()     // Catch:{ all -> 0x00ab }
            r2.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00ab }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ab }
            r4.close()
            X.0tf r5 = r9.A02()
            r9.A04()     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "databasehelper/createFtsDeprecatedTable"
            X.1Zf r4 = new X.1Zf     // Catch:{ all -> 0x00a1 }
            r4.<init>((java.lang.String) r0)     // Catch:{ all -> 0x00a1 }
            X.1cj r3 = r5.A00()     // Catch:{ all -> 0x00a1 }
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "CREATE VIRTUAL TABLE messages_fts USING FTS3()"
            r2.A0B(r0)     // Catch:{ all -> 0x009c }
            boolean r1 = r8.A0E(r2)     // Catch:{ all -> 0x009c }
            boolean r0 = r8.A0F(r2)     // Catch:{ all -> 0x009c }
            r8.A0C(r2, r1, r0)     // Catch:{ all -> 0x009c }
            r3.A00()     // Catch:{ all -> 0x009c }
            r3.close()     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r2.<init>(r7)     // Catch:{ all -> 0x00a1 }
            long r0 = r4.A01()     // Catch:{ all -> 0x00a1 }
            r2.append(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00a1 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00a1 }
            r5.close()
            r6.A01()
            return
        L_0x009c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00af }
            throw r0
        L_0x00a6:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00af }
        L_0x00af:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2EJ.onRollback():void");
    }
}
