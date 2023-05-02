package X;

import android.content.ContentValues;

/* renamed from: X.18U  reason: invalid class name */
public class AnonymousClass18U {
    public final AnonymousClass18N A00;
    public final AnonymousClass11X A01;

    public AnonymousClass18U(AnonymousClass18N r2, AnonymousClass11X r3) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public static final void A00(AnonymousClass2BN r4, C16800tf r5) {
        String rawString = r4.A05.getRawString();
        C18450wi.A0B(rawString);
        String rawString2 = r4.A06.getRawString();
        C18450wi.A0B(rawString2);
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("group_jid", rawString);
        contentValues.put("requester_jid", rawString2);
        contentValues.put("request_method", r4.A07);
        contentValues.put("request_creation_time", Long.valueOf(r4.A04));
        r5.A02.A06(contentValues, "group_membership_approval_requests", 5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C41191vO.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        X.C41191vO.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(X.C16050sL r6) {
        /*
            r5 = this;
            r1 = 0
            X.C18450wi.A0H(r6, r1)
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r0 = r6.getRawString()
            r4 = 0
            r2[r1] = r0
            X.11X r0 = r5.A01
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "SELECT COUNT(*) as count FROM group_membership_approval_requests WHERE group_jid = ?"
            android.database.Cursor r2 = r1.A08(r0, r2)     // Catch:{ all -> 0x003a }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0033 }
            int r4 = r2.getInt(r0)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            r2.close()     // Catch:{ all -> 0x003a }
            r3.close()
            return r4
        L_0x0033:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            X.C41191vO.A00(r2, r1)     // Catch:{ all -> 0x003a }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            X.C41191vO.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18U.A01(X.0sL):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        X.C41191vO.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C16050sL r8) {
        /*
            r7 = this;
            r6 = 0
            X.C18450wi.A0H(r8, r6)
            X.11X r0 = r7.A01
            X.0tf r5 = r0.A02()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = "group_membership_approval_requests"
            java.lang.String r2 = "group_jid =?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x0028 }
            r1[r6] = r0     // Catch:{ all -> 0x0028 }
            int r0 = r4.A01(r3, r2, r1)     // Catch:{ all -> 0x0028 }
            r5.close()
            if (r0 <= 0) goto L_0x0027
            X.18N r0 = r7.A00
            r0.A04(r8)
        L_0x0027:
            return
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            X.C41191vO.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18U.A02(X.0sL):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        X.C41191vO.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C16050sL r10, com.whatsapp.jid.UserJid r11) {
        /*
            r9 = this;
            r8 = 0
            X.C18450wi.A0H(r10, r8)
            r7 = 1
            X.C18450wi.A0H(r11, r7)
            X.11X r0 = r9.A01
            X.0tf r5 = r0.A02()
            X.0tg r6 = r5.A02     // Catch:{ all -> 0x003b }
            java.lang.String r4 = "group_membership_approval_requests"
            java.lang.String r3 = "requester_jid =? AND group_jid =?"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x003b }
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x003b }
            r2 = 0
            r1[r8] = r0     // Catch:{ all -> 0x003b }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x003b }
            r1[r7] = r0     // Catch:{ all -> 0x003b }
            int r1 = r6.A01(r4, r3, r1)     // Catch:{ all -> 0x003b }
            if (r1 > r7) goto L_0x002b
            r2 = 1
        L_0x002b:
            java.lang.String r0 = "There should not be more than 1 membership approval request entries with same requester_jid + group_jid"
            X.AnonymousClass00B.A0B(r0, r2)     // Catch:{ all -> 0x003b }
            if (r1 <= 0) goto L_0x0037
            X.18N r0 = r9.A00     // Catch:{ all -> 0x003b }
            r0.A04(r10)     // Catch:{ all -> 0x003b }
        L_0x0037:
            r5.close()
            return
        L_0x003b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            X.C41191vO.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18U.A03(X.0sL, com.whatsapp.jid.UserJid):void");
    }
}
