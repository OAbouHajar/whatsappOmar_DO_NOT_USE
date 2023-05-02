package X;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.191  reason: invalid class name */
public class AnonymousClass191 {
    public final C216314v A00;
    public final C16900tq A01;
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();

    public AnonymousClass191(C216314v r2, C16900tq r3) {
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:29|30|31|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0070 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0070=Splitter:B:32:0x0070, B:19:0x0057=Splitter:B:19:0x0057} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C39611sl A00(X.C16050sL r12) {
        /*
            r11 = this;
            r6 = r11
            java.util.Map r1 = r11.A02
            monitor-enter(r1)
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0071 }
            r4 = 0
            X.14v r0 = r11.A00     // Catch:{ all -> 0x0071 }
            long r2 = r0.A01(r12)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x0071 }
            r5[r4] = r0     // Catch:{ all -> 0x0071 }
            X.0tq r0 = r11.A01     // Catch:{ all -> 0x0071 }
            X.0tf r2 = r0.get()     // Catch:{ all -> 0x0071 }
            X.0tg r3 = r2.A02     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "SELECT subject_timestamp, announcement_version FROM group_notification_version WHERE group_jid_row_id = ?"
            android.database.Cursor r3 = r3.A08(r0, r5)     // Catch:{ all -> 0x006c }
            if (r3 == 0) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            r7 = 0
            r9 = 0
            X.1sl r5 = new X.1sl     // Catch:{ all -> 0x0065 }
            r5.<init>(r6, r7, r9)     // Catch:{ all -> 0x0065 }
            goto L_0x004f
        L_0x002f:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "subject_timestamp"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0065 }
            long r7 = r3.getLong(r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "announcement_version"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0065 }
            long r9 = r3.getLong(r0)     // Catch:{ all -> 0x0065 }
            X.1sl r5 = new X.1sl     // Catch:{ all -> 0x0065 }
            r5.<init>(r6, r7, r9)     // Catch:{ all -> 0x0065 }
        L_0x004f:
            r1.put(r12, r5)     // Catch:{ all -> 0x0065 }
            if (r3 == 0) goto L_0x0057
            r3.close()     // Catch:{ all -> 0x006c }
        L_0x0057:
            r2.close()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r1.get(r12)     // Catch:{ all -> 0x0071 }
            X.1sl r0 = (X.C39611sl) r0     // Catch:{ all -> 0x0071 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0071 }
            monitor-exit(r1)     // Catch:{ all -> 0x0071 }
            return r0
        L_0x0065:
            r0 = move-exception
            if (r3 == 0) goto L_0x006b
            r3.close()     // Catch:{ all -> 0x006b }
        L_0x006b:
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0070 }
        L_0x0070:
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0071 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass191.A00(X.0sL):X.1sl");
    }

    public final void A01(C16050sL r6, long j2, long j3, long j4) {
        C16800tf A022 = this.A01.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("group_jid_row_id", Long.valueOf(this.A00.A01(r6)));
            contentValues.put("subject_timestamp", Long.valueOf(j2));
            contentValues.put("announcement_version", Long.valueOf(j3));
            contentValues.put("participant_version", Long.valueOf(j4));
            A022.A02.A02(contentValues, "group_notification_version");
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
