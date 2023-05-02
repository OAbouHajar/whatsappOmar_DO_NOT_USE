package X;

import android.content.ContentValues;
import android.database.SQLException;
import com.facebook.redex.RunnableRunnableShape6S0200000_I0_4;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.17i  reason: invalid class name and case insensitive filesystem */
public class C222817i {
    public final C16920ts A00;
    public final C16070sO A01;
    public final AnonymousClass17H A02;
    public final C16900tq A03;

    public C222817i(C16920ts r1, C16070sO r2, AnonymousClass17H r3, C16900tq r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public void A00(C16800tf r7, GroupJid groupJid) {
        if (!this.A01.A09(groupJid)) {
            String[] strArr = {String.valueOf(this.A00.A02(groupJid))};
            ContentValues contentValues = new ContentValues();
            contentValues.put("invalid_state", 1);
            r7.A02.A00("message_poll", contentValues, "message_row_id IN (SELECT _id FROM available_message_view WHERE (available_message_view.chat_row_id = ? AND available_message_view.message_type = 66))", strArr);
            r7.A03(new RunnableRunnableShape6S0200000_I0_4(this, 44, groupJid));
        }
    }

    public void A01(C39171s2 r7) {
        C16800tf A022 = this.A03.A02();
        try {
            ContentValues contentValues = new ContentValues(4);
            contentValues.put("message_row_id", Long.valueOf(r7.A13));
            contentValues.put("selectable_options_count", Integer.valueOf(r7.A01));
            contentValues.put("invalid_state", Integer.valueOf(r7.A00));
            contentValues.put("poll_logging_id", Long.valueOf(r7.A02));
            if (A022.A02.A06(contentValues, "message_poll", 5) < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("PollMessageStore/insertOrUpdateMessagePoll/insert error, rowId=");
                sb.append(r7.A13);
                Log.e(sb.toString());
            }
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A02(C39171s2 r12) {
        C16800tf A022 = this.A03.A02();
        try {
            for (C39631sn r6 : r12.A05) {
                ContentValues contentValues = new ContentValues(5);
                contentValues.put("message_row_id", Long.valueOf(r12.A13));
                contentValues.put("option_sha256", r6.A02);
                contentValues.put("option_name", r6.A03);
                contentValues.put("vote_total", Integer.valueOf(r6.A00));
                long j2 = r6.A01;
                if (j2 != -1) {
                    contentValues.put("_id", Long.valueOf(j2));
                }
                long A06 = A022.A02.A06(contentValues, "message_poll_option", 5);
                if (A06 != -1) {
                    r6.A01 = A06;
                } else {
                    throw new SQLException("PollMessageStore/insertOrUpdatePollOptionTable the row was not updated");
                }
            }
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C39171s2 r14) {
        /*
            r13 = this;
            X.0tq r0 = r13.A03
            X.0tf r7 = r0.A02()
            X.1cj r12 = r7.A00()     // Catch:{ all -> 0x005d }
            java.util.List r0 = r14.A05     // Catch:{ all -> 0x0058 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x0058 }
        L_0x0010:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x0058 }
            X.1sn r10 = (X.C39631sn) r10     // Catch:{ all -> 0x0058 }
            r9 = 1
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0058 }
            r8.<init>(r9)     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "vote_total"
            int r0 = r10.A00     // Catch:{ all -> 0x0058 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0058 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0058 }
            X.0tg r6 = r7.A02     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = "message_poll_option"
            java.lang.String r4 = "_id = ?"
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ all -> 0x0058 }
            r2 = 0
            long r0 = r10.A01     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0058 }
            r3[r2] = r0     // Catch:{ all -> 0x0058 }
            int r0 = r6.A00(r5, r8, r4, r3)     // Catch:{ all -> 0x0058 }
            if (r0 == r9) goto L_0x0010
            java.lang.String r1 = "updatePollOptionVoteTotals/updatePollOptionVoteTotals the row was not updated"
            android.database.SQLException r0 = new android.database.SQLException     // Catch:{ all -> 0x0058 }
            r0.<init>(r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x004e:
            r12.A00()     // Catch:{ all -> 0x0058 }
            r12.close()     // Catch:{ all -> 0x005d }
            r7.close()
            return
        L_0x0058:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0061 }
        L_0x0061:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222817i.A03(X.1s2):void");
    }
}
