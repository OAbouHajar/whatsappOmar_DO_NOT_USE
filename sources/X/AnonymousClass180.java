package X;

/* renamed from: X.180  reason: invalid class name */
public class AnonymousClass180 {
    public final C17120uZ A00;
    public final C16900tq A01;

    public AnonymousClass180(C17120uZ r1, C16900tq r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(long r6, int r8) {
        /*
            r5 = this;
            X.0tq r0 = r5.A01     // Catch:{ Exception -> 0x002f }
            X.0tf r4 = r0.A02()     // Catch:{ Exception -> 0x002f }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x002a }
            r3.<init>()     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x002a }
            r3.put(r1, r0)     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "state"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x002a }
            r3.put(r1, r0)     // Catch:{ all -> 0x002a }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "message_view_once_media"
            r0 = 5
            r2.A06(r3, r1, r0)     // Catch:{ all -> 0x002a }
            r4.close()     // Catch:{ Exception -> 0x002f }
            return
        L_0x002a:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            r1 = move-exception
            java.lang.String r0 = "ViewOnceMessageStore/updateInsert failed"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass180.A00(long, int):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(long r9, int r11) {
        /*
            r8 = this;
            X.0tq r0 = r8.A01     // Catch:{ Exception -> 0x0035 }
            X.0tf r7 = r0.A02()     // Catch:{ Exception -> 0x0035 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0030 }
            r6.<init>()     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "state"
            int r11 = com.obwhatsapp.yo.yo.antiVOnceI(r11)     // Catch:{ all -> 0x0030 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0030 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0030 }
            X.0tg r5 = r7.A02     // Catch:{ all -> 0x0030 }
            java.lang.String r4 = "message_view_once_media"
            java.lang.String r3 = "message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0030 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0030 }
            r2[r1] = r0     // Catch:{ all -> 0x0030 }
            r5.A00(r4, r6, r3, r2)     // Catch:{ all -> 0x0030 }
            r7.close()     // Catch:{ Exception -> 0x0035 }
            return
        L_0x0030:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            throw r0     // Catch:{ Exception -> 0x0035 }
        L_0x0035:
            r1 = move-exception
            java.lang.String r0 = "ViewOnceMessageStore/updateInsert failed"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass180.A01(long, int):void");
    }

    public void A02(C16740tZ r4) {
        if (r4 instanceof C39001rl) {
            int i2 = r4.A0C;
            if (i2 == 9 || i2 == 10 || i2 == 8) {
                C16740tZ r42 = (C16740tZ) ((C39001rl) r4);
                C39001rl r0 = (C39001rl) r42;
                r0.Aey(1);
                A01(r42.A13, r0.AGz());
            }
        }
    }
}
