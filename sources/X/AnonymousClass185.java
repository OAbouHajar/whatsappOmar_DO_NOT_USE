package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;

/* renamed from: X.185  reason: invalid class name */
public class AnonymousClass185 {
    public final C16920ts A00;
    public final C216314v A01;
    public final C16900tq A02;

    public AnonymousClass185(C16920ts r1, C216314v r2, C16900tq r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x004c=Splitter:B:18:0x004c, B:10:0x003f=Splitter:B:10:0x003f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A00(X.C16050sL r8, com.whatsapp.jid.UserJid r9) {
        /*
            r7 = this;
            r5 = -1
            if (r8 == 0) goto L_0x0052
            if (r9 == 0) goto L_0x0052
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]
            r2 = 0
            X.14v r3 = r7.A01
            long r0 = r3.A01(r8)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4[r2] = r0
            r2 = 1
            long r0 = r3.A01(r9)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4[r2] = r0
            X.0tq r0 = r7.A02
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "SELECT message_row_id FROM message_group_invite WHERE group_jid_row_id = ? AND admin_jid_row_id = ? AND expired = 0 ORDER BY invite_time DESC"
            android.database.Cursor r1 = r1.A08(r0, r4)     // Catch:{ all -> 0x004d }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "message_row_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0046 }
            long r5 = r1.getLong(r0)     // Catch:{ all -> 0x0046 }
        L_0x003f:
            r1.close()     // Catch:{ all -> 0x004d }
            r2.close()
            return r5
        L_0x0046:
            r0 = move-exception
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0
        L_0x0052:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass185.A00(X.0sL, com.whatsapp.jid.UserJid):long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:10:0x0041=Splitter:B:10:0x0041, B:18:0x004e=Splitter:B:18:0x004e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A01(X.C16050sL r7, com.whatsapp.jid.UserJid r8) {
        /*
            r6 = this;
            r4 = -1
            if (r7 == 0) goto L_0x0054
            if (r8 == 0) goto L_0x0054
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]
            r2 = 0
            X.14v r0 = r6.A01
            long r0 = r0.A01(r7)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r3[r2] = r0
            r2 = 1
            X.0ts r0 = r6.A00
            long r0 = r0.A02(r8)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r3[r2] = r0
            X.0tq r0 = r6.A02
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "SELECT invite.message_row_id AS message_row_id FROM message_group_invite invite INNER JOIN message_view message ON invite.message_row_id = message._id WHERE invite.group_jid_row_id = ? AND message.chat_row_id = ? AND invite.expired = 0 ORDER BY invite.invite_time DESC"
            android.database.Cursor r1 = r1.A08(r0, r3)     // Catch:{ all -> 0x004f }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "message_row_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0048 }
            long r4 = r1.getLong(r0)     // Catch:{ all -> 0x0048 }
        L_0x0041:
            r1.close()     // Catch:{ all -> 0x004f }
            r2.close()
            return r4
        L_0x0048:
            r0 = move-exception
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0
        L_0x0054:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass185.A01(X.0sL, com.whatsapp.jid.UserJid):long");
    }

    public final ContentValues A02(C30071bh r5, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_row_id", Long.toString(j2));
        C16050sL r1 = r5.A02;
        String str = null;
        contentValues.put("group_jid_row_id", r1 == null ? null : Long.toString(this.A01.A01(r1)));
        UserJid userJid = r5.A03;
        if (userJid != null) {
            str = Long.toString(this.A01.A01(userJid));
        }
        contentValues.put("admin_jid_row_id", str);
        contentValues.put("group_name", r5.A05);
        contentValues.put("invite_code", r5.A06);
        contentValues.put("expiration", Long.valueOf(r5.A01));
        contentValues.put("invite_time", Long.valueOf(r5.A0I));
        contentValues.put("expired", Integer.valueOf(r5.A07 ? 1 : 0));
        contentValues.put("group_type", Integer.valueOf(r5.A00));
        return contentValues;
    }

    public void A03(C30071bh r6) {
        C16800tf A022 = this.A02.A02();
        try {
            A022.A02.A06(A02(r6, r6.A13), "message_group_invite", 5);
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A04(C30071bh r6, long j2) {
        C16800tf A022 = this.A02.A02();
        try {
            A022.A02.A06(A02(r6, j2), "message_quoted_group_invite", 5);
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
