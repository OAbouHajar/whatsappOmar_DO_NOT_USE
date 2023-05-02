package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;

/* renamed from: X.2Ee  reason: invalid class name and case insensitive filesystem */
public class C46412Ee extends C30111bl implements AnonymousClass2EI {
    public final C216314v A00;
    public final C221116r A01;

    public C46412Ee(C216314v r3, C221116r r4, C24821Hk r5) {
        super(r5, "payment_transaction", 1);
        this.A00 = r3;
        this.A01 = r4;
    }

    public C49522Tm A09(Cursor cursor) {
        Jid nullable;
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("message_row_id");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("key_remote_jid");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("key_id");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("interop_id");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("id");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("timestamp");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("status");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("error_code");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("sender");
        int columnIndexOrThrow11 = cursor2.getColumnIndexOrThrow("receiver");
        int columnIndexOrThrow12 = cursor2.getColumnIndexOrThrow("type");
        int columnIndexOrThrow13 = cursor2.getColumnIndexOrThrow("currency");
        int columnIndexOrThrow14 = cursor2.getColumnIndexOrThrow("amount_1000");
        int columnIndexOrThrow15 = cursor2.getColumnIndexOrThrow("credential_id");
        int columnIndexOrThrow16 = cursor2.getColumnIndexOrThrow("methods");
        int columnIndexOrThrow17 = cursor2.getColumnIndexOrThrow("bank_transaction_id");
        int columnIndexOrThrow18 = cursor2.getColumnIndexOrThrow("metadata");
        int columnIndexOrThrow19 = cursor2.getColumnIndexOrThrow("init_timestamp");
        int columnIndexOrThrow20 = cursor2.getColumnIndexOrThrow("request_key_id");
        int columnIndexOrThrow21 = cursor2.getColumnIndexOrThrow("country");
        int columnIndexOrThrow22 = cursor2.getColumnIndexOrThrow("version");
        int columnIndexOrThrow23 = cursor2.getColumnIndexOrThrow("future_data");
        int columnIndexOrThrow24 = cursor2.getColumnIndexOrThrow("service_id");
        int columnIndexOrThrow25 = cursor2.getColumnIndexOrThrow("background_id");
        int columnIndexOrThrow26 = cursor2.getColumnIndexOrThrow("purchase_initiator");
        C16800tf A02 = this.A05.A02();
        long j2 = -1;
        int i2 = 0;
        while (cursor2.moveToNext()) {
            try {
                ContentValues contentValues = new ContentValues(25);
                j2 = cursor2.getLong(columnIndexOrThrow);
                contentValues.put("_id", Long.valueOf(j2));
                if (!cursor2.isNull(columnIndexOrThrow2)) {
                    contentValues.put("message_row_id", Long.valueOf(cursor2.getLong(columnIndexOrThrow2)));
                }
                if (!cursor2.isNull(columnIndexOrThrow3) && (nullable = Jid.getNullable(cursor2.getString(columnIndexOrThrow3))) != null) {
                    long A012 = this.A00.A01(nullable);
                    if (A012 != -1) {
                        contentValues.put("remote_jid_row_id", Long.valueOf(A012));
                    }
                }
                C38611r4.A04(contentValues, "key_id", cursor2.getString(columnIndexOrThrow4));
                C38611r4.A04(contentValues, "interop_id", cursor2.getString(columnIndexOrThrow5));
                C38611r4.A04(contentValues, "id", cursor2.getString(columnIndexOrThrow6));
                if (!cursor2.isNull(columnIndexOrThrow7)) {
                    contentValues.put("timestamp", Long.valueOf(cursor2.getLong(columnIndexOrThrow7)));
                }
                if (!cursor2.isNull(columnIndexOrThrow8)) {
                    contentValues.put("status", Long.valueOf(cursor2.getLong(columnIndexOrThrow8)));
                }
                C38611r4.A04(contentValues, "error_code", cursor2.getString(columnIndexOrThrow9));
                Jid nullable2 = Jid.getNullable(cursor2.getString(columnIndexOrThrow10));
                if (nullable2 != null) {
                    long A013 = this.A00.A01(nullable2);
                    if (A013 != -1) {
                        contentValues.put("sender_jid_row_id", Long.valueOf(A013));
                    }
                }
                Jid nullable3 = Jid.getNullable(cursor2.getString(columnIndexOrThrow11));
                if (nullable3 != null) {
                    long A014 = this.A00.A01(nullable3);
                    if (A014 != -1) {
                        contentValues.put("receiver_jid_row_id", Long.valueOf(A014));
                    }
                }
                contentValues.put("type", Long.valueOf(cursor2.getLong(columnIndexOrThrow12)));
                C38611r4.A04(contentValues, "currency_code", cursor2.getString(columnIndexOrThrow13));
                contentValues.put("amount_1000", Long.valueOf(cursor2.getLong(columnIndexOrThrow14)));
                C38611r4.A04(contentValues, "credential_id", cursor2.getString(columnIndexOrThrow15));
                C38611r4.A04(contentValues, "methods", cursor2.getString(columnIndexOrThrow16));
                C38611r4.A04(contentValues, "bank_transaction_id", cursor2.getString(columnIndexOrThrow17));
                C38611r4.A04(contentValues, "metadata", cursor2.getString(columnIndexOrThrow18));
                if (!cursor2.isNull(columnIndexOrThrow19)) {
                    contentValues.put("init_timestamp", Long.valueOf(cursor2.getLong(columnIndexOrThrow19)));
                }
                C38611r4.A04(contentValues, "request_key_id", cursor2.getString(columnIndexOrThrow20));
                C38611r4.A04(contentValues, "country", cursor2.getString(columnIndexOrThrow21));
                contentValues.put("version", Long.valueOf(cursor2.getLong(columnIndexOrThrow22)));
                C38611r4.A06(contentValues, "future_data", cursor2.getBlob(columnIndexOrThrow23));
                contentValues.put("service_id", Long.valueOf(cursor2.getLong(columnIndexOrThrow24)));
                C38611r4.A04(contentValues, "background_id", cursor2.getString(columnIndexOrThrow25));
                contentValues.put("purchase_initiator", Long.valueOf(cursor2.getLong(columnIndexOrThrow26)));
                A02.A02.A03(contentValues, "pay_transaction");
                i2++;
            } catch (Throwable unused) {
            }
        }
        A02.close();
        return new C49522Tm(j2, i2);
        throw th;
    }

    public /* synthetic */ void AMJ() {
    }

    public /* synthetic */ void ANa() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRollback() {
        /*
            r5 = this;
            X.0tq r0 = r5.A05
            X.0tf r4 = r0.A02()
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x003d }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "pay_transaction"
            r0 = 0
            r2.A01(r1, r0, r0)     // Catch:{ all -> 0x0038 }
            X.11I r1 = r5.A06     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "new_pay_transaction_ready"
            r1.A03(r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "migration_pay_transaction_index"
            r1.A03(r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "migration_pay_transaction_retry"
            r1.A03(r0)     // Catch:{ all -> 0x0038 }
            r3.A00()     // Catch:{ all -> 0x0038 }
            r3.close()     // Catch:{ all -> 0x003d }
            r4.close()
            java.lang.String r1 = "PaymentTransactionDatabaseMigration"
            java.lang.String r0 = "PaymentTransactionStore/resetDatabaseMigrationForDebug/done"
            java.lang.String r0 = X.AnonymousClass1Vo.A01(r1, r0)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0038:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46412Ee.onRollback():void");
    }
}
