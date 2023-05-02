package X;

/* renamed from: X.15d  reason: invalid class name and case insensitive filesystem */
public class C217115d {
    public final C216314v A00;
    public final C16900tq A01;

    public C217115d(C216314v r1, C16900tq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0058 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x005d=Splitter:B:27:0x005d, B:15:0x004e=Splitter:B:15:0x004e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A00(X.C16050sL r16) {
        /*
            r15 = this;
            java.lang.String r2 = "user_jid_row_id"
            X.14v r0 = r15.A00
            r1 = r16
            long r5 = r0.A01(r1)
            X.0tq r0 = r15.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x005e }
            X.0tf r4 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005e }
            X.0tg r7 = r4.A02     // Catch:{ all -> 0x0059 }
            java.lang.String r8 = "parent_group_participants"
            r0 = 1
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0059 }
            r1 = 0
            r9[r1] = r2     // Catch:{ all -> 0x0059 }
            java.lang.String r10 = "parent_group_jid_row_id = ?"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0059 }
            r11[r1] = r0     // Catch:{ all -> 0x0059 }
            r12 = 0
            r14 = r12
            r13 = r12
            android.database.Cursor r5 = r7.A09(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0059 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r3.<init>()     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x0049
            int r2 = r5.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0052 }
        L_0x0037:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0049
            long r0 = r5.getLong(r2)     // Catch:{ all -> 0x0052 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0052 }
            r3.add(r0)     // Catch:{ all -> 0x0052 }
            goto L_0x0037
        L_0x0049:
            if (r5 == 0) goto L_0x004e
            r5.close()     // Catch:{ all -> 0x0059 }
        L_0x004e:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005e }
            return r3
        L_0x0052:
            r0 = move-exception
            if (r5 == 0) goto L_0x0058
            r5.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005d }
        L_0x005d:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x005e }
        L_0x005e:
            r1 = move-exception
            java.lang.String r0 = "linkedGroupParticipantsStore/getParticipantsForParentGroupJid"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217115d.A00(X.0sL):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A01(X.C16050sL r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            X.0tq r0 = r5.A01     // Catch:{ all -> 0x002e }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x002e }
            X.14v r0 = r5.A00     // Catch:{ all -> 0x0029 }
            long r0 = r0.A01(r6)     // Catch:{ all -> 0x0029 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0029 }
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0029 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0029 }
            r3[r1] = r0     // Catch:{ all -> 0x0029 }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "parent_group_participants"
            java.lang.String r0 = "parent_group_jid_row_id = ?"
            r2.A01(r1, r0, r3)     // Catch:{ all -> 0x0029 }
            r4.close()     // Catch:{ all -> 0x002e }
            monitor-exit(r5)
            return
        L_0x0029:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217115d.A01(X.0sL):void");
    }
}
