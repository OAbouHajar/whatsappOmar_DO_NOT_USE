package X;

/* renamed from: X.2Ef  reason: invalid class name and case insensitive filesystem */
public class C46422Ef extends C30111bl {
    public final C216314v A00;

    public C46422Ef(C216314v r3, C24821Hk r4) {
        super(r4, "migration_jid_store", Integer.MIN_VALUE);
        AnonymousClass00B.A06(r3);
        this.A00 = r3;
    }

    public long A06() {
        return super.A06();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00ab */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00c6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x00cb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0T(X.C30101bk r14) {
        /*
            r13 = this;
            X.0so r2 = r13.A01
            java.lang.String r1 = "jid-store-migration-pending"
            r0 = 0
            r11 = 0
            r2.AcB(r1, r0, r11)
            X.14v r7 = r13.A00
            X.0tq r6 = r7.A01
            r6.A04()
            java.io.File r3 = r6.A06
            long r4 = r3.length()
            java.lang.String r1 = "JidStore/populateJidTable/start/db size="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "JidStore/populate"
            X.1Zf r8 = new X.1Zf
            r8.<init>((java.lang.String) r0)
            r9 = 1
            X.0tf r2 = r6.A02()     // Catch:{ SQLException -> 0x00cc }
            X.1cj r12 = r2.A00()     // Catch:{ all -> 0x00c7 }
            X.0tg r10 = r2.A02     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "SELECT DISTINCT key_remote_jid FROM chat_list"
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ all -> 0x00c2 }
            android.database.Cursor r1 = r10.A08(r1, r0)     // Catch:{ all -> 0x00c2 }
            r7.A0A(r1)     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ all -> 0x00c2 }
        L_0x0049:
            java.lang.String r1 = "SELECT DISTINCT key_remote_jid FROM messages"
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ all -> 0x00c2 }
            android.database.Cursor r1 = r10.A08(r1, r0)     // Catch:{ all -> 0x00c2 }
            r7.A0A(r1)     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0059
            r1.close()     // Catch:{ all -> 0x00c2 }
        L_0x0059:
            java.lang.String r1 = "SELECT DISTINCT remote_resource FROM messages"
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ all -> 0x00c2 }
            android.database.Cursor r1 = r10.A08(r1, r0)     // Catch:{ all -> 0x00c2 }
            r7.A0A(r1)     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0069
            r1.close()     // Catch:{ all -> 0x00c2 }
        L_0x0069:
            java.lang.String r1 = "SELECT DISTINCT remote_resource FROM messages WHERE needs_push = 2"
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ all -> 0x00c2 }
            android.database.Cursor r1 = r10.A08(r1, r0)     // Catch:{ all -> 0x00c2 }
            r7.A0A(r1)     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0079
            r1.close()     // Catch:{ all -> 0x00c2 }
        L_0x0079:
            java.lang.String r1 = "SELECT DISTINCT mentioned_jids FROM messages WHERE mentioned_jids IS NOT NULL"
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ all -> 0x00c2 }
            android.database.Cursor r1 = r10.A08(r1, r0)     // Catch:{ all -> 0x00c2 }
            r7.A0A(r1)     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0089
            r1.close()     // Catch:{ all -> 0x00c2 }
        L_0x0089:
            java.lang.String r1 = "SELECT DISTINCT jid FROM group_participants"
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ all -> 0x00c2 }
            android.database.Cursor r1 = r10.A08(r1, r0)     // Catch:{ all -> 0x00c2 }
            r7.A0A(r1)     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0099
            r1.close()     // Catch:{ all -> 0x00c2 }
        L_0x0099:
            java.lang.String r1 = "SELECT DISTINCT jid FROM group_participants_history"
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ all -> 0x00c2 }
            android.database.Cursor r1 = r10.A08(r1, r0)     // Catch:{ all -> 0x00c2 }
            r7.A0A(r1)     // Catch:{ all -> 0x00a5 }
            goto L_0x00ac
        L_0x00a5:
            r0 = move-exception
            if (r1 == 0) goto L_0x00ab
            r1.close()     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x00ac:
            if (r1 == 0) goto L_0x00b1
            r1.close()     // Catch:{ all -> 0x00c2 }
        L_0x00b1:
            X.11I r1 = r7.A02     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "jid_ready"
            r1.A04(r0, r9)     // Catch:{ all -> 0x00c2 }
            r12.A00()     // Catch:{ all -> 0x00c2 }
            r12.close()     // Catch:{ all -> 0x00c7 }
            r2.close()     // Catch:{ SQLException -> 0x00cc }
            goto L_0x00db
        L_0x00c2:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            throw r0     // Catch:{ SQLException -> 0x00cc }
        L_0x00cc:
            r1 = move-exception
            java.lang.String r0 = "JidStore/populateJidTable/Error populating jid table"
            com.whatsapp.util.Log.e(r0, r1)
            X.0so r2 = r7.A00
            java.lang.String r1 = "JidStore/populateJidTable"
            java.lang.String r0 = "JidStore/populateJidTable/error"
            r2.AcB(r1, r0, r9)
        L_0x00db:
            java.lang.String r0 = "JidStore/populateJidTable/time spent="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            long r0 = r8.A01()
            r2.append(r0)
            java.lang.String r0 = "; count="
            r2.append(r0)
            java.util.Map r0 = r7.A03
            int r0 = r0.size()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A04()
            long r6 = r3.length()
            java.lang.String r0 = "JidStore/populateJidTable/end/db size="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            r8.append(r6)
            java.lang.String r0 = "; increase="
            r8.append(r0)
            double r2 = (double) r6
            double r0 = (double) r4
            double r2 = r2 / r0
            r8.append(r2)
            java.lang.String r0 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r13.A0L()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46422Ef.A0T(X.1bk):boolean");
    }
}
