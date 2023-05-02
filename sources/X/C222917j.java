package X;

/* renamed from: X.17j  reason: invalid class name and case insensitive filesystem */
public class C222917j {
    public final C16920ts A00;
    public final C16900tq A01;
    public final AnonymousClass11I A02;
    public final C18860xN A03;

    public C222917j(C16920ts r1, C16900tq r2, AnonymousClass11I r3, C18860xN r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0052, code lost:
        if (r1 == 0) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C16740tZ r10, long r11, boolean r13) {
        /*
            r9 = this;
            boolean r2 = r10 instanceof X.C30581cc
            java.lang.String r1 = "TextMessageStore/insertOrUpdateQuotedTextMessage/message must be a text message; key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            X.1Vw r4 = r10.A11
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            r3 = 1
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x001e
            r2 = 1
        L_0x001e:
            java.lang.String r1 = "TextMessageStore/insertOrUpdateQuotedTextMessage/message must have row_id set; key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            int r1 = r10.A08()
            r0 = 2
            if (r1 == r0) goto L_0x0037
            r3 = 0
        L_0x0037:
            java.lang.String r1 = "TextMessageStore/insertOrUpdateQuotedTextMessage/message in main storage; key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A0C(r0, r3)
            X.1cc r10 = (X.C30581cc) r10
            byte[] r0 = r10.A17()
            if (r0 == 0) goto L_0x0054
            int r1 = r0.length
            r0 = 1
            if (r1 != 0) goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            java.lang.String r6 = "message_quoted_text"
            r5 = 0
            r7 = 1
            if (r0 == 0) goto L_0x00a2
            X.0tq r0 = r9.A01
            X.0tf r3 = r0.A02()
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x009d }
            r8.<init>()     // Catch:{ all -> 0x009d }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x009d }
            r8.put(r1, r0)     // Catch:{ all -> 0x009d }
            java.lang.String r1 = "thumbnail"
            byte[] r0 = r10.A17()     // Catch:{ all -> 0x009d }
            X.C38611r4.A06(r8, r1, r0)     // Catch:{ all -> 0x009d }
            X.0tg r4 = r3.A02     // Catch:{ all -> 0x009d }
            java.lang.String r2 = "message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ all -> 0x009d }
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x009d }
            r1[r5] = r0     // Catch:{ all -> 0x009d }
            int r0 = r4.A00(r6, r8, r2, r1)     // Catch:{ all -> 0x009d }
            if (r0 == r7) goto L_0x0099
            long r1 = r4.A03(r8, r6)     // Catch:{ all -> 0x009d }
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0094
            r5 = 1
        L_0x0094:
            java.lang.String r0 = "TextMessageStore/insertOrUpdateQuotedTextMessage/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r0, r5)     // Catch:{ all -> 0x009d }
        L_0x0099:
            r3.close()
            return
        L_0x009d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00be }
            throw r0
        L_0x00a2:
            if (r13 == 0) goto L_0x00c2
            X.0tq r0 = r9.A01
            X.0tf r4 = r0.A02()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = "message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00ba }
            r1[r5] = r0     // Catch:{ all -> 0x00ba }
            r3.A01(r6, r2, r1)     // Catch:{ all -> 0x00ba }
            goto L_0x00bf
        L_0x00ba:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00be }
        L_0x00be:
            throw r0
        L_0x00bf:
            r4.close()
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222917j.A00(X.0tZ, long, boolean):void");
    }

    public void A01(C30581cc r7) {
        if (A04(r7) || (r7.A13 > 0 && r7.A13 <= this.A02.A01("migration_message_text_index", 0))) {
            A02(r7, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r12.A03 != null) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C30581cc r12, boolean r13) {
        /*
            r11 = this;
            java.lang.String r0 = r12.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r12.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r12.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
            com.obwhatsapp.TextData r0 = r12.A02
            if (r0 != 0) goto L_0x0029
            int r0 = r12.A01
            if (r0 != 0) goto L_0x0029
            int r0 = r12.A00
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = r12.A03
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            java.lang.String r6 = "message_text"
            r10 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00fd
            X.0tq r0 = r11.A01
            X.0tf r5 = r0.A02()
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0117 }
            r7.<init>()     // Catch:{ all -> 0x0117 }
            long r0 = r12.A13     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r0 = "message_row_id"
            r7.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r0 = r12.A04     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r1 = "description"
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = r12.A04     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r7.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
        L_0x0055:
            java.lang.String r0 = r12.A06     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r1 = "page_title"
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = r12.A06     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r7.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
        L_0x0064:
            java.lang.String r0 = r12.A07     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r1 = "url"
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = r12.A07     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r7.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
        L_0x0074:
            com.obwhatsapp.TextData r0 = r12.A02     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r1 = "background_color"
            java.lang.String r4 = "text_color"
            java.lang.String r3 = "font_style"
            if (r0 == 0) goto L_0x00c9
            int r0 = r0.fontStyle     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r7.put(r3, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            com.obwhatsapp.TextData r0 = r12.A02     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            int r0 = r0.textColor     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r7.put(r4, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            com.obwhatsapp.TextData r0 = r12.A02     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            int r0 = r0.backgroundColor     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r7.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
        L_0x009e:
            int r0 = r12.A01     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r0 = "preview_type"
            r7.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            int r0 = r12.A00     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r0 = "invite_link_group_type"
            r7.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r1 = r12.A03     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r0 = "counter_abuse_token"
            r7.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            X.0tg r0 = r5.A02     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            long r8 = r0.A03(r7, r6)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            long r0 = r12.A13     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 0
            if (r3 != 0) goto L_0x00e1
            goto L_0x00e0
        L_0x00c9:
            r7.putNull(r3)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r7.putNull(r4)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r7.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            goto L_0x009e
        L_0x00d3:
            r7.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            goto L_0x0074
        L_0x00d7:
            r7.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            goto L_0x0064
        L_0x00db:
            r7.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            goto L_0x0055
        L_0x00e0:
            r1 = 1
        L_0x00e1:
            java.lang.String r0 = "TextMessageStore/insertOrUpdateTextMessage/inserted row should has same row_id"
            X.AnonymousClass00B.A0D(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            goto L_0x011c
        L_0x00e7:
            r9 = move-exception
            X.0tg r8 = r5.A02     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = "message_row_id = ?"
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x0117 }
            long r0 = r12.A13     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0117 }
            r3[r10] = r0     // Catch:{ all -> 0x0117 }
            int r0 = r8.A00(r6, r7, r4, r3)     // Catch:{ all -> 0x0117 }
            if (r0 == r2) goto L_0x011c
            throw r9     // Catch:{ all -> 0x0117 }
        L_0x00fd:
            if (r13 == 0) goto L_0x011f
            X.0tq r0 = r11.A01
            X.0tf r5 = r0.A02()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "message_row_id = ?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0117 }
            long r0 = r12.A13     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0117 }
            r2[r10] = r0     // Catch:{ all -> 0x0117 }
            r4.A01(r6, r3, r2)     // Catch:{ all -> 0x0117 }
            goto L_0x011c
        L_0x0117:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x011b }
        L_0x011b:
            throw r0
        L_0x011c:
            r5.close()
        L_0x011f:
            byte[] r1 = r12.A17()
            if (r1 == 0) goto L_0x012e
            int r0 = r1.length
            if (r0 == 0) goto L_0x012e
            X.0xN r0 = r11.A03
            r0.A02(r12, r1)
        L_0x012d:
            return
        L_0x012e:
            if (r13 == 0) goto L_0x012d
            X.0xN r0 = r11.A03
            r0.A01(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222917j.A02(X.1cc, boolean):void");
    }

    public boolean A03() {
        return this.A00.A0H() && this.A02.A01("text_ready", 0) == 1;
    }

    public final boolean A04(C30581cc r9) {
        boolean z2 = false;
        if (!A03()) {
            return false;
        }
        boolean z3 = false;
        if (r9.A13 > 0) {
            z3 = true;
        }
        StringBuilder sb = new StringBuilder("TextMessageStore/isValidMessage/message must have row_id set; key=");
        C28381Vw r2 = r9.A11;
        sb.append(r2);
        AnonymousClass00B.A0C(sb.toString(), z3);
        if (r9.A08() == 1) {
            z2 = true;
        }
        StringBuilder sb2 = new StringBuilder("TextMessageStore/isValidMessage/message in main storage; key=");
        sb2.append(r2);
        AnonymousClass00B.A0C(sb2.toString(), z2);
        return true;
    }
}
