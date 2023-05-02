package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.189  reason: invalid class name */
public class AnonymousClass189 {
    public final C16040sK A00;
    public final AnonymousClass10R A01;
    public final C16920ts A02;
    public final C15810rt A03;
    public final C16900tq A04;
    public final C18600wx A05;
    public final AnonymousClass122 A06;

    public AnonymousClass189(C16040sK r1, AnonymousClass10R r2, C16920ts r3, C15810rt r4, C16900tq r5, C18600wx r6, AnonymousClass122 r7) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A06 = r7;
        this.A05 = r6;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0033=Splitter:B:13:0x0033, B:8:0x002b=Splitter:B:8:0x002b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(long r7) {
        /*
            r6 = this;
            X.0tq r0 = r6.A04
            X.0tf r5 = r0.get()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "SELECT setting_duration FROM message_ephemeral_setting WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x0038 }
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x0038 }
            android.database.Cursor r1 = r4.A08(r3, r1)     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0034
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "setting_duration"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002f }
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x002f }
        L_0x002b:
            r1.close()     // Catch:{ all -> 0x0038 }
            goto L_0x0034
        L_0x002f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0034:
            r5.close()
            return r2
        L_0x0038:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A00(long):int");
    }

    public final C15840rx A01(C16740tZ r4) {
        UserJid of = UserJid.of(r4.A11.A00);
        if (of == null) {
            Log.e("EphemeralSettingMessageStore/getChatInfo/not a user");
            return null;
        }
        C15840rx A062 = this.A03.A06(of);
        if (A062 != null) {
            return A062;
        }
        Log.w("EphemeralSettingMessageStore/getChatInfo/no chat");
        return null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer A02(X.C16740tZ r10) {
        /*
            r9 = this;
            X.0ts r1 = r9.A02
            X.1Vw r0 = r10.A11
            X.0rv r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            long r7 = r1.A02(r0)
            X.0tq r0 = r9.A04
            X.0tf r3 = r0.get()
            X.0tg r6 = r3.A02     // Catch:{ all -> 0x005b }
            java.lang.String r5 = "SELECT setting_duration FROM message_ephemeral_setting INNER JOIN message_view ON message_ephemeral_setting.message_row_id=message_view._id WHERE chat_row_id == ? AND sort_id < ? ORDER BY sort_id DESC LIMIT 1"
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x005b }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x005b }
            r4[r1] = r0     // Catch:{ all -> 0x005b }
            r2 = 1
            long r0 = r10.A14     // Catch:{ all -> 0x005b }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x005b }
            r4[r2] = r0     // Catch:{ all -> 0x005b }
            android.database.Cursor r1 = r6.A08(r5, r4)     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0051
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "setting_duration"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004c }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x004c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x004c }
            r1.close()     // Catch:{ all -> 0x005b }
            r3.close()
            return r0
        L_0x004c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0     // Catch:{ all -> 0x005b }
        L_0x0051:
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ all -> 0x005b }
        L_0x0056:
            r3.close()
            r0 = 0
            return r0
        L_0x005b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005f }
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A02(X.0tZ):java.lang.Integer");
    }

    public void A03(int i2, long j2, int i3) {
        C16800tf A022 = this.A04.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(j2));
            contentValues.put("setting_duration", Integer.valueOf(i2));
            contentValues.put("setting_reason", Integer.valueOf(i3));
            A022.A02.A06(contentValues, "message_ephemeral_setting", 5);
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r0 <= r0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C15840rx r13, X.C38971ri r14) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0009
            X.0rx r13 = r12.A01(r14)
            if (r13 != 0) goto L_0x0009
        L_0x0008:
            return
        L_0x0009:
            X.1WV r7 = r13.A0X
            X.10R r5 = r12.A01
            int r9 = r14.A00
            int r0 = r7.expiration
            if (r9 != r0) goto L_0x002d
            long r0 = r14.A0I
            long r2 = r7.ephemeralSettingTimestamp
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x002d
            int r2 = (r0 > r0 ? 1 : (r0 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x002d
        L_0x001f:
            int r3 = r14.A00
            long r1 = r14.A0I
            r0 = 0
            r13.A0A(r3, r1, r0)
            X.0ts r0 = r12.A02
            r0.A0E(r13)
            return
        L_0x002d:
            int r1 = r14.A08()
            r0 = 1
            if (r1 != r0) goto L_0x0008
            X.1Vw r0 = r14.A11
            X.0rv r6 = r0.A00
            long r10 = r14.A0I
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            boolean r0 = r5.A03(r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x0008
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass189.A04(X.0rx, X.1ri):void");
    }

    public void A05(C15840rx r5, C39231s8 r6) {
        if (r5 != null || (r5 = A01(r6)) != null) {
            r5.A0A(r6.A00, r6.A01, 0);
            this.A02.A0E(r5);
        }
    }
}
