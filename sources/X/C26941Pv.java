package X;

import com.obwhatsapp.yo.yo;

/* renamed from: X.1Pv  reason: invalid class name and case insensitive filesystem */
public class C26941Pv {
    public final C16440t3 A00;
    public final C15860rz A01;
    public final AnonymousClass126 A02;
    public final AnonymousClass128 A03;
    public final AnonymousClass11G A04;
    public final C14710pd A05;
    public final C222517f A06;
    public final C26931Pu A07;

    public C26941Pv(C16440t3 r1, C15860rz r2, AnonymousClass126 r3, AnonymousClass128 r4, AnonymousClass11G r5, C14710pd r6, C222517f r7, C26931Pu r8) {
        this.A05 = r6;
        this.A00 = r1;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A07 = r8;
    }

    public static C26941Pv A21() {
        return (C26941Pv) yo.mSingletonC.ANC.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0273, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r10 == false) goto L_0x005a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x026f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0277 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C16740tZ r20, X.C16740tZ r21, java.util.List r22, int r23) {
        /*
            r19 = this;
            r6 = r20
            if (r20 == 0) goto L_0x00d0
            long r3 = r6.A14
            r0 = r21
            long r1 = r0.A14
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00d0
            r5 = r19
            X.11G r3 = r5.A04
            boolean r0 = r3.A0J(r6)
            if (r0 == 0) goto L_0x00d0
            int r1 = r23 + 1
            r2 = r22
            int r0 = r2.size()
            r4 = 0
            if (r1 >= r0) goto L_0x011b
            java.lang.Object r8 = r2.get(r1)
            X.0tZ r8 = (X.C16740tZ) r8
        L_0x0029:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0041
            int r0 = r2.size()
            int r1 = r0 + -1
            int r0 = r23 + 2
            int r0 = java.lang.Math.min(r1, r0)
            java.lang.Object r4 = r2.get(r0)
            X.0tZ r4 = (X.C16740tZ) r4
        L_0x0041:
            X.0pd r2 = r5.A05
            r1 = 2039(0x7f7, float:2.857E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r13 = r2.A0E(r0, r1)
            X.1Vw r11 = r6.A11
            boolean r10 = r11.A02
            X.0rz r0 = r5.A01
            boolean r9 = r0.A1i()
            if (r13 == 0) goto L_0x005a
            r12 = 0
            if (r10 != 0) goto L_0x00b2
        L_0x005a:
            r12 = 1
            boolean r0 = com.obwhatsapp.yo.yo.yoHideStatusView(r6)
            if (r0 == 0) goto L_0x0066
            X.17f r0 = r5.A06
            r0.A04(r6)
        L_0x0066:
            java.lang.String r0 = "statusmanager/markstatusasseen/sending status rr for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
            java.lang.String r7 = " "
            r1.append(r7)
            X.0rv r0 = r6.A0B()
            r1.append(r0)
            r1.append(r7)
            byte r2 = r6.A10
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "statusmanager/markstatusasseen/mark seen "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
            r1.append(r7)
            X.0rv r0 = r6.A0B()
            r1.append(r0)
            r1.append(r7)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r13 == 0) goto L_0x010e
            if (r10 == 0) goto L_0x010e
        L_0x00b2:
            X.1dI r7 = r3.A05()
        L_0x00b6:
            if (r7 != 0) goto L_0x00d1
            if (r12 == 0) goto L_0x00d0
            java.lang.String r0 = "statusmanager/markstatusasseen/no status for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0rv r0 = r6.A0B()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00cd:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00d0:
            return
        L_0x00d1:
            monitor-enter(r7)
            long r2 = r6.A14     // Catch:{ all -> 0x029d }
            long r0 = r7.A06     // Catch:{ all -> 0x029d }
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00db
            goto L_0x0106
        L_0x00db:
            if (r9 == 0) goto L_0x00e1
            long r0 = r6.A14     // Catch:{ all -> 0x029d }
            r7.A07 = r0     // Catch:{ all -> 0x029d }
        L_0x00e1:
            long r0 = r6.A14     // Catch:{ all -> 0x029d }
            r7.A06 = r0     // Catch:{ all -> 0x029d }
            int r0 = r7.A01     // Catch:{ all -> 0x029d }
            if (r0 <= 0) goto L_0x00ed
            int r0 = r0 + -1
            r7.A01 = r0     // Catch:{ all -> 0x029d }
        L_0x00ed:
            r2 = -9223372036854775808
            if (r8 != 0) goto L_0x00f4
            r0 = -9223372036854775808
            goto L_0x00f6
        L_0x00f4:
            long r0 = r8.A14     // Catch:{ all -> 0x029d }
        L_0x00f6:
            r7.A03 = r0     // Catch:{ all -> 0x029d }
            if (r4 == 0) goto L_0x00fc
            long r2 = r4.A14     // Catch:{ all -> 0x029d }
        L_0x00fc:
            r7.A02 = r2     // Catch:{ all -> 0x029d }
            X.C30991dI.A00(r6)     // Catch:{ all -> 0x029d }
            X.1dI r10 = r7.A05()     // Catch:{ all -> 0x029d }
            goto L_0x0107
        L_0x0106:
            r10 = 0
        L_0x0107:
            monitor-exit(r7)
            if (r10 != 0) goto L_0x011e
            java.lang.String r0 = "statusmanager/markstatusasseen/updatestatus returned null"
            goto L_0x00cd
        L_0x010e:
            X.0rv r0 = r6.A0B()
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            X.1dI r7 = r3.A06(r0)
            goto L_0x00b6
        L_0x011b:
            r8 = r4
            goto L_0x0029
        L_0x011e:
            X.128 r4 = r5.A03
            java.lang.String r5 = "status_psa_viewed_time"
            java.lang.String r0 = "msgstore/setstatusreadreceiptssent/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0rv r0 = r6.A0B()
            r1.append(r0)
            java.lang.String r0 = " rrsent="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tq r0 = r4.A0D
            X.0tf r18 = r0.A02()
            X.1cj r17 = r18.A00()     // Catch:{ SQLiteDatabaseCorruptException -> 0x027d, Error | RuntimeException -> 0x0278 }
            X.11G r14 = r4.A0G     // Catch:{ all -> 0x0273 }
            long r7 = r6.A14     // Catch:{ all -> 0x0273 }
            int r16 = r10.A02()     // Catch:{ all -> 0x0273 }
            monitor-enter(r10)     // Catch:{ all -> 0x0273 }
            long r2 = r10.A03     // Catch:{ all -> 0x0270 }
            monitor-exit(r10)     // Catch:{ all -> 0x0273 }
            monitor-enter(r10)     // Catch:{ all -> 0x0273 }
            long r0 = r10.A02     // Catch:{ all -> 0x0270 }
            monitor-exit(r10)     // Catch:{ all -> 0x0273 }
            X.0rv r10 = r6.A0B()     // Catch:{ all -> 0x0273 }
            java.lang.String r12 = X.C16030sJ.A03(r10)     // Catch:{ all -> 0x0273 }
            X.0tq r10 = r14.A02     // Catch:{ all -> 0x0273 }
            X.0tf r10 = r10.A02()     // Catch:{ all -> 0x0273 }
            boolean r11 = r14.A0H()     // Catch:{ all -> 0x026b }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x026b }
            r13.<init>()     // Catch:{ all -> 0x026b }
            if (r9 == 0) goto L_0x017c
            java.lang.String r15 = "last_read_receipt_sent_message_table_id"
            java.lang.Long r9 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x026b }
            r13.put(r15, r9)     // Catch:{ all -> 0x026b }
        L_0x017c:
            java.lang.String r9 = "last_read_message_table_id"
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x026b }
            r13.put(r9, r7)     // Catch:{ all -> 0x026b }
            java.lang.String r8 = "unseen_count"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x026b }
            r13.put(r8, r7)     // Catch:{ all -> 0x026b }
            java.lang.String r7 = "first_unread_message_table_id"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x026b }
            r13.put(r7, r2)     // Catch:{ all -> 0x026b }
            java.lang.String r2 = "autodownload_limit_message_table_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x026b }
            r13.put(r2, r0)     // Catch:{ all -> 0x026b }
            X.0tg r7 = r10.A02     // Catch:{ all -> 0x026b }
            if (r11 == 0) goto L_0x01db
            java.lang.String r3 = "status_list"
            java.lang.String r2 = "key_remote_jid=?"
        L_0x01aa:
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r12)     // Catch:{ all -> 0x026b }
            java.lang.String[] r1 = r14.A0K(r0, r11)     // Catch:{ all -> 0x026b }
            java.lang.String r0 = "updateStatus/UPDATE"
            X.AnonymousClass11G.A01(r0, r11)     // Catch:{ all -> 0x026b }
            int r0 = r7.A00(r3, r13, r2, r1)     // Catch:{ all -> 0x026b }
            if (r0 != 0) goto L_0x01e1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x026b }
            r1.<init>()     // Catch:{ all -> 0x026b }
            java.lang.String r0 = "msgstore/setstatusreadreceiptssent/no status saved for "
            r1.append(r0)     // Catch:{ all -> 0x026b }
            r1.append(r12)     // Catch:{ all -> 0x026b }
            java.lang.String r0 = "; shouldUseDeprecatedTable="
            r1.append(r0)     // Catch:{ all -> 0x026b }
            r1.append(r11)     // Catch:{ all -> 0x026b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x026b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x026b }
            goto L_0x01e1
        L_0x01db:
            java.lang.String r3 = "status"
            java.lang.String r2 = "jid_row_id=?"
            goto L_0x01aa
        L_0x01e1:
            r10.close()     // Catch:{ all -> 0x0273 }
            X.0rv r0 = r6.A0B()     // Catch:{ all -> 0x0273 }
            boolean r0 = X.C16030sJ.A0P(r0)     // Catch:{ all -> 0x0273 }
            if (r0 == 0) goto L_0x0264
            X.11I r9 = r4.A0E     // Catch:{ all -> 0x0273 }
            r0 = 0
            long r1 = r9.A01(r5, r0)     // Catch:{ all -> 0x0273 }
            X.184 r3 = r4.A0F     // Catch:{ all -> 0x0273 }
            X.1kX r7 = r3.A00(r6)     // Catch:{ all -> 0x0273 }
            boolean r0 = r7.A00()     // Catch:{ all -> 0x0273 }
            if (r0 != 0) goto L_0x0248
            long r1 = r7.A01     // Catch:{ all -> 0x0273 }
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0264
            java.lang.String r10 = r7.A04     // Catch:{ all -> 0x0273 }
            X.0t3 r0 = r4.A02     // Catch:{ all -> 0x0273 }
            long r0 = r0.A00()     // Catch:{ all -> 0x0273 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0273 }
            r9.<init>()     // Catch:{ all -> 0x0273 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0273 }
            java.lang.String r0 = "first_seen_timestamp"
            r9.put(r0, r1)     // Catch:{ all -> 0x0273 }
            X.0tq r0 = r3.A00     // Catch:{ all -> 0x0273 }
            X.0tf r8 = r0.A02()     // Catch:{ all -> 0x0273 }
            X.0tg r7 = r8.A02     // Catch:{ all -> 0x0243 }
            java.lang.String r5 = "message_status_psa_campaign"
            java.lang.String r3 = "campaign_id=? AND first_seen_timestamp=?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0243 }
            r0 = 0
            r2[r0] = r10     // Catch:{ all -> 0x0243 }
            r1 = 1
            java.lang.String r0 = java.lang.Long.toString(r11)     // Catch:{ all -> 0x0243 }
            r2[r1] = r0     // Catch:{ all -> 0x0243 }
            r7.A00(r5, r9, r3, r2)     // Catch:{ all -> 0x0243 }
            r8.close()     // Catch:{ all -> 0x0273 }
            goto L_0x0264
        L_0x0243:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x026f }
            goto L_0x026f
        L_0x0248:
            long r7 = r6.A0I     // Catch:{ all -> 0x0273 }
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0264
            r0 = 10000(0x2710, double:4.9407E-320)
            long r7 = r7 + r0
            X.0t3 r0 = r4.A02     // Catch:{ all -> 0x0273 }
            long r2 = r0.A00()     // Catch:{ all -> 0x0273 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r0
            r9.A05(r5, r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r0 = "status_psa_exipration_time"
            r9.A05(r0, r2)     // Catch:{ all -> 0x0273 }
        L_0x0264:
            r17.A00()     // Catch:{ all -> 0x0273 }
            r17.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x027d, Error | RuntimeException -> 0x0278 }
            goto L_0x0286
        L_0x026b:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x026f }
        L_0x026f:
            throw r0     // Catch:{ all -> 0x0273 }
        L_0x0270:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0273 }
            throw r0     // Catch:{ all -> 0x0273 }
        L_0x0273:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x0277 }
        L_0x0277:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x027d, Error | RuntimeException -> 0x0278 }
        L_0x0278:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0298 }
            throw r0     // Catch:{ all -> 0x0298 }
        L_0x027d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0298 }
            X.0ym r0 = r4.A0C     // Catch:{ all -> 0x0298 }
            r0.A02()     // Catch:{ all -> 0x0298 }
        L_0x0286:
            X.17E r0 = r4.A07     // Catch:{ all -> 0x0298 }
            android.os.Handler r2 = r0.A02     // Catch:{ all -> 0x0298 }
            r1 = 48
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4     // Catch:{ all -> 0x0298 }
            r0.<init>(r4, r1, r6)     // Catch:{ all -> 0x0298 }
            r2.post(r0)     // Catch:{ all -> 0x0298 }
            r18.close()
            return
        L_0x0298:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x029c }
        L_0x029c:
            throw r0
        L_0x029d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26941Pv.A00(X.0tZ, X.0tZ, java.util.List, int):void");
    }
}
