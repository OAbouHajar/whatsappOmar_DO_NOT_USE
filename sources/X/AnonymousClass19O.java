package X;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.19O  reason: invalid class name */
public class AnonymousClass19O {
    public final C216314v A00;
    public final C16900tq A01;
    public final Object A02 = new Object();
    public final Map A03;

    public AnonymousClass19O(C216314v r2, C16900tq r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = Collections.synchronizedMap(new HashMap());
    }

    public final C37401p6 A00(Cursor cursor) {
        return new C37401p6(cursor.getInt(cursor.getColumnIndexOrThrow("raw_id")), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")), cursor.getLong(cursor.getColumnIndexOrThrow("expected_timestamp")), cursor.getLong(cursor.getColumnIndexOrThrow("expected_ts_last_device_job_ts")), cursor.getLong(cursor.getColumnIndexOrThrow("expected_timestamp_update_ts")));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0088 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C37401p6 r13, com.whatsapp.jid.UserJid r14) {
        /*
            r12 = this;
            X.14v r0 = r12.A00
            long r10 = r0.A01(r14)
            X.0tq r0 = r12.A01
            X.0tf r6 = r0.A02()
            X.1cj r9 = r6.A00()     // Catch:{ all -> 0x0089 }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0084 }
            r8.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "raw_id"
            int r0 = r13.A00     // Catch:{ all -> 0x0084 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0084 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "timestamp"
            long r0 = r13.A04     // Catch:{ all -> 0x0084 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0084 }
            r8.put(r2, r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "expected_timestamp"
            long r0 = r13.A01     // Catch:{ all -> 0x0084 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0084 }
            r8.put(r2, r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "expected_ts_last_device_job_ts"
            long r0 = r13.A03     // Catch:{ all -> 0x0084 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0084 }
            r8.put(r2, r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "expected_timestamp_update_ts"
            long r0 = r13.A02     // Catch:{ all -> 0x0084 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0084 }
            r8.put(r2, r0)     // Catch:{ all -> 0x0084 }
            X.0tg r7 = r6.A02     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = "user_device_info"
            java.lang.String r4 = "user_jid_row_id = ?"
            r3 = 1
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x0084 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0084 }
            r2[r1] = r0     // Catch:{ all -> 0x0084 }
            int r0 = r7.A00(r5, r8, r4, r2)     // Catch:{ all -> 0x0084 }
            if (r0 == r3) goto L_0x0072
            java.lang.String r1 = "user_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0084 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0084 }
            r7.A03(r8, r5)     // Catch:{ all -> 0x0084 }
        L_0x0072:
            r9.A00()     // Catch:{ all -> 0x0084 }
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5     // Catch:{ all -> 0x0084 }
            r0.<init>(r12, r3, r14)     // Catch:{ all -> 0x0084 }
            r6.A03(r0)     // Catch:{ all -> 0x0084 }
            r9.close()     // Catch:{ all -> 0x0089 }
            r6.close()
            return
        L_0x0084:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0088 }
        L_0x0088:
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x008d }
        L_0x008d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19O.A01(X.1p6, com.whatsapp.jid.UserJid):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(com.whatsapp.jid.UserJid r7) {
        /*
            r6 = this;
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]
            X.14v r0 = r6.A00
            long r0 = r0.A01(r7)
            java.lang.String r1 = java.lang.Long.toString(r0)
            r0 = 0
            r5[r0] = r1
            X.0tq r0 = r6.A01
            X.0tf r4 = r0.A02()
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x003d }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "user_device_info"
            java.lang.String r0 = "user_jid_row_id=?"
            r2.A01(r1, r0, r5)     // Catch:{ all -> 0x0038 }
            r3.A00()     // Catch:{ all -> 0x0038 }
            r1 = 2
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5     // Catch:{ all -> 0x0038 }
            r0.<init>(r6, r1, r7)     // Catch:{ all -> 0x0038 }
            r4.A03(r0)     // Catch:{ all -> 0x0038 }
            r3.close()     // Catch:{ all -> 0x003d }
            r4.close()
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19O.A02(com.whatsapp.jid.UserJid):void");
    }
}
