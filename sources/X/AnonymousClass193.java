package X;

import com.whatsapp.util.Log;

/* renamed from: X.193  reason: invalid class name */
public class AnonymousClass193 {
    public final C16300so A00;
    public final C16040sK A01;
    public final C216314v A02;
    public final C16900tq A03;
    public final C16320sq A04;

    public AnonymousClass193(C16300so r1, C16040sK r2, C216314v r3, C16900tq r4, C16320sq r5) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C17380uz r11, X.C16060sN r12, com.whatsapp.jid.UserJid r13, long r14) {
        /*
            r10 = this;
            java.lang.String r0 = "participant-device-store/addParticipantDevices/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r13)
            r1.append(r0)
            r1.append(r14)
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r11.isEmpty()
            r5 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "participant-device-store/addParticipantDevices/empty devices"
            X.AnonymousClass00B.A0C(r0, r1)
            X.14v r3 = r10.A02
            long r0 = r3.A01(r12)
            X.0tq r2 = r10.A03
            X.0tf r4 = r2.A02()
            X.1cj r9 = r4.A01()     // Catch:{ all -> 0x00c2 }
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = "INSERT INTO group_participant_device (group_participant_row_id, device_jid_row_id, sent_sender_key, sent_add_on_sender_key) SELECT _id, ?, ?, ? FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?"
            X.1ou r2 = r6.A0A(r2)     // Catch:{ all -> 0x00bd }
            r6 = 4
            r2.A01(r6, r0)     // Catch:{ all -> 0x00bd }
            r0 = 5
            r2.A01(r0, r14)     // Catch:{ all -> 0x00bd }
            X.1Ub r8 = r11.iterator()     // Catch:{ all -> 0x00bd }
        L_0x0055:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x00bd }
            X.1sh r7 = (X.C39571sh) r7     // Catch:{ all -> 0x00bd }
            com.whatsapp.jid.DeviceJid r6 = r7.A02     // Catch:{ all -> 0x00bd }
            com.whatsapp.jid.UserJid r0 = r6.getUserJid()     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0094
            long r0 = r3.A01(r6)     // Catch:{ all -> 0x00bd }
            r2.A01(r5, r0)     // Catch:{ all -> 0x00bd }
            r6 = 2
            boolean r0 = r7.A01     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x007c
            r0 = 1
            goto L_0x007e
        L_0x007c:
            r0 = 0
        L_0x007e:
            r2.A01(r6, r0)     // Catch:{ all -> 0x00bd }
            r6 = 3
            boolean r0 = r7.A00     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0089
            r0 = 1
            goto L_0x008b
        L_0x0089:
            r0 = 0
        L_0x008b:
            r2.A01(r6, r0)     // Catch:{ all -> 0x00bd }
            android.database.sqlite.SQLiteStatement r0 = r2.A00     // Catch:{ all -> 0x00bd }
            r0.executeInsert()     // Catch:{ all -> 0x00bd }
            goto L_0x0055
        L_0x0094:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r1.<init>()     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "participant-device-store/incorrect device jid "
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            r1.append(r6)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = " for user "
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            r1.append(r13)     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00bd }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00bd }
            r0.<init>(r1)     // Catch:{ all -> 0x00bd }
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00b3:
            r9.A00()     // Catch:{ all -> 0x00bd }
            r9.close()     // Catch:{ all -> 0x00c2 }
            r4.close()
            return
        L_0x00bd:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass193.A00(X.0uz, X.0sN, com.whatsapp.jid.UserJid, long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0085 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x008a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C17380uz r10, X.C16060sN r11, com.whatsapp.jid.UserJid r12, long r13) {
        /*
            r9 = this;
            java.lang.String r1 = "participant-device-store/updateParticipantDevices/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r3 = " "
            r0.append(r3)
            r0.append(r12)
            r0.append(r3)
            r0.append(r13)
            r0.append(r3)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tq r2 = r9.A03
            X.0tf r8 = r2.A02()
            X.1cj r7 = r8.A01()     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "participant-device-store/deleteParticipantDevices/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r0.<init>(r1)     // Catch:{ all -> 0x0086 }
            r0.append(r11)     // Catch:{ all -> 0x0086 }
            r0.append(r3)     // Catch:{ all -> 0x0086 }
            r0.append(r13)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0086 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0086 }
            X.14v r0 = r9.A02     // Catch:{ all -> 0x0086 }
            long r5 = r0.A01(r11)     // Catch:{ all -> 0x0086 }
            X.0tf r4 = r2.A02()     // Catch:{ all -> 0x0086 }
            X.0tg r1 = r4.A02     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "DELETE FROM group_participant_device WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?)"
            X.1ou r3 = r1.A0A(r0)     // Catch:{ all -> 0x0081 }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0081 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0081 }
            r2[r1] = r0     // Catch:{ all -> 0x0081 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0081 }
            r2[r1] = r0     // Catch:{ all -> 0x0081 }
            android.database.sqlite.SQLiteStatement r0 = r3.A00     // Catch:{ all -> 0x0081 }
            r0.bindAllArgsAsStrings(r2)     // Catch:{ all -> 0x0081 }
            r3.A00()     // Catch:{ all -> 0x0081 }
            r4.close()     // Catch:{ all -> 0x0086 }
            r9.A00(r10, r11, r12, r13)     // Catch:{ all -> 0x0086 }
            r7.A00()     // Catch:{ all -> 0x0086 }
            r7.close()     // Catch:{ all -> 0x008b }
            r8.close()
            return
        L_0x0081:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0085 }
        L_0x0085:
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x008a }
        L_0x008a:
            throw r0     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x008f }
        L_0x008f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass193.A01(X.0uz, X.0sN, com.whatsapp.jid.UserJid, long):void");
    }

    public void A02(C16060sN r8) {
        StringBuilder sb = new StringBuilder("participant-device-store/resetSentSenderKeyForAllParticipants/");
        sb.append(r8);
        Log.i(sb.toString());
        long A012 = this.A02.A01(r8);
        C16800tf A022 = this.A03.A02();
        try {
            C37281ou A0A = A022.A02.A0A("UPDATE group_participant_device SET sent_sender_key = ? WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ?)");
            A0A.A00.bindAllArgsAsStrings(new String[]{"0", String.valueOf(A012)});
            A0A.A00();
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C16060sN r11, java.lang.String r12, java.util.Collection r13) {
        /*
            r10 = this;
            X.14v r3 = r10.A02
            long r0 = r3.A01(r11)
            X.0tq r2 = r10.A03
            X.0tf r2 = r2.A02()
            X.1cj r9 = r2.A00()     // Catch:{ all -> 0x0070 }
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x006b }
            X.1ou r6 = r4.A0A(r12)     // Catch:{ all -> 0x006b }
            r7 = 1
            r4 = 1
            r6.A01(r7, r4)     // Catch:{ all -> 0x006b }
            r4 = 3
            r6.A01(r4, r0)     // Catch:{ all -> 0x006b }
            java.util.Iterator r8 = r13.iterator()     // Catch:{ all -> 0x006b }
        L_0x0024:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0061
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x006b }
            com.whatsapp.jid.DeviceJid r7 = (com.whatsapp.jid.DeviceJid) r7     // Catch:{ all -> 0x006b }
            r4 = 2
            long r0 = r3.A01(r7)     // Catch:{ all -> 0x006b }
            r6.A01(r4, r0)     // Catch:{ all -> 0x006b }
            r5 = 4
            com.whatsapp.jid.UserJid r4 = r7.getUserJid()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r4.getRawString()     // Catch:{ all -> 0x006b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x006b }
            r1 = r0 ^ 1
            java.lang.String r0 = "participant-user-store/invalid-jid"
            X.AnonymousClass00B.A0C(r0, r1)     // Catch:{ all -> 0x006b }
            X.0sK r0 = r10.A01     // Catch:{ all -> 0x006b }
            boolean r0 = r0.A0I(r4)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0056
            X.1jg r4 = X.C34091jg.A00     // Catch:{ all -> 0x006b }
        L_0x0056:
            long r0 = r3.A01(r4)     // Catch:{ all -> 0x006b }
            r6.A01(r5, r0)     // Catch:{ all -> 0x006b }
            r6.A00()     // Catch:{ all -> 0x006b }
            goto L_0x0024
        L_0x0061:
            r9.A00()     // Catch:{ all -> 0x006b }
            r9.close()     // Catch:{ all -> 0x0070 }
            r2.close()
            return
        L_0x006b:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x006f }
        L_0x006f:
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0074 }
        L_0x0074:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass193.A03(X.0sN, java.lang.String, java.util.Collection):void");
    }
}
