package X;

import android.content.ContentValues;

/* renamed from: X.17m  reason: invalid class name and case insensitive filesystem */
public class C223217m {
    public final C16040sK A00;
    public final C16000sG A01;
    public final C16980tz A02;
    public final AnonymousClass013 A03;
    public final AnonymousClass126 A04;
    public final C16920ts A05;
    public final C15810rt A06;
    public final C216314v A07;
    public final C19650ym A08;
    public final C16900tq A09;
    public final AnonymousClass11I A0A;

    public C223217m(C16040sK r1, C16000sG r2, C16980tz r3, AnonymousClass013 r4, AnonymousClass126 r5, C16920ts r6, C15810rt r7, C216314v r8, C19650ym r9, C16900tq r10, AnonymousClass11I r11) {
        this.A02 = r3;
        this.A07 = r8;
        this.A05 = r6;
        this.A00 = r1;
        this.A06 = r7;
        this.A01 = r2;
        this.A03 = r4;
        this.A0A = r11;
        this.A04 = r5;
        this.A09 = r10;
        this.A08 = r9;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.C223217m r5, java.util.List r6, long r7) {
        /*
            X.0tz r3 = r5.A02
            X.0sG r2 = r5.A01
            X.013 r1 = r5.A03
            X.1st r0 = new X.1st
            r0.<init>(r2, r3, r1)
            java.util.List r1 = r0.A02(r6)
            X.0tq r0 = r5.A09
            X.0tf r4 = r0.A02()
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x0041 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x003c }
        L_0x001d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0032
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x003c }
            X.1su r1 = (X.C39691su) r1     // Catch:{ all -> 0x003c }
            java.lang.String r0 = r1.A00     // Catch:{ all -> 0x003c }
            r5.A07(r0, r7)     // Catch:{ all -> 0x003c }
            r5.A08(r1, r7)     // Catch:{ all -> 0x003c }
            goto L_0x001d
        L_0x0032:
            r3.A00()     // Catch:{ all -> 0x003c }
            r3.close()     // Catch:{ all -> 0x0041 }
            r4.close()
            return
        L_0x003c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223217m.A00(X.17m, java.util.List, long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(long r8, boolean r10) {
        /*
            r7 = this;
            if (r10 == 0) goto L_0x0010
            java.lang.String r6 = "SELECT vcard FROM message_quoted_vcard WHERE message_row_id = ? AND vcard IS NOT NULL AND vcard != \"\""
        L_0x0004:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.0tq r0 = r7.A09
            X.0tf r4 = r0.get()
            goto L_0x0013
        L_0x0010:
            java.lang.String r6 = "SELECT vcard FROM message_vcard WHERE message_row_id = ? AND vcard IS NOT NULL AND vcard != \"\""
            goto L_0x0004
        L_0x0013:
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0046 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0046 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r8)     // Catch:{ all -> 0x0046 }
            r2[r1] = r0     // Catch:{ all -> 0x0046 }
            android.database.Cursor r2 = r3.A08(r6, r2)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "vcard"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003f }
        L_0x002a:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = r2.getString(r1)     // Catch:{ all -> 0x003f }
            r5.add(r0)     // Catch:{ all -> 0x003f }
            goto L_0x002a
        L_0x0038:
            r2.close()     // Catch:{ all -> 0x0046 }
            r4.close()
            return r5
        L_0x003f:
            r0 = move-exception
            if (r2 == 0) goto L_0x0045
            r2.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223217m.A01(long, boolean):java.util.List");
    }

    public void A02(C38741rL r7) {
        if ((A09() || (r7.A13 > 0 && r7.A13 <= this.A0A.A01("migration_vcard_index", 0))) && r7.A0I() != null) {
            A07(r7.A0I(), r7.A13);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C38811rS r7) {
        /*
            r6 = this;
            boolean r0 = r6.A09()
            if (r0 != 0) goto L_0x001c
            long r3 = r7.A13
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005e
            long r3 = r7.A13
            X.11I r5 = r6.A0A
            java.lang.String r0 = "migration_vcard_index"
            long r1 = r5.A01(r0, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x005e
        L_0x001c:
            java.util.List r0 = r7.A12()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x005e
            java.util.List r1 = r7.A12()
            X.0tq r0 = r6.A09
            X.0tf r5 = r0.A02()
            X.1cj r4 = r5.A00()     // Catch:{ all -> 0x0059 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0054 }
        L_0x0038:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x004a
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0054 }
            long r0 = r7.A13     // Catch:{ all -> 0x0054 }
            r6.A07(r2, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0038
        L_0x004a:
            r4.A00()     // Catch:{ all -> 0x0054 }
            r4.close()     // Catch:{ all -> 0x0059 }
            r5.close()
            return
        L_0x0054:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x005d }
        L_0x005d:
            throw r0
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223217m.A03(X.1rS):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C38811rS r5, long r6) {
        /*
            r4 = this;
            java.util.List r1 = r5.A12()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x003c
            X.0tq r0 = r4.A09
            X.0tf r3 = r0.A02()
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x0037 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0032 }
        L_0x0018:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0032 }
            r4.A06(r0, r6)     // Catch:{ all -> 0x0032 }
            goto L_0x0018
        L_0x0028:
            r2.A00()     // Catch:{ all -> 0x0032 }
            r2.close()     // Catch:{ all -> 0x0037 }
            r3.close()
            return
        L_0x0032:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223217m.A04(X.1rS, long):void");
    }

    public void A05(C38631rA r6) {
        if (r6.A08 == 7 && r6.A02 != null) {
            C16800tf A012 = this.A09.get();
            try {
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("message_row_id", Long.valueOf(r6.A13));
                contentValues.put("count", Integer.valueOf(r6.A02.A01));
                A012.A02.A04(contentValues, "message_media_vcard_count");
                A012.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        throw th;
    }

    public final void A06(String str, long j2) {
        C16800tf A022 = this.A09.A02();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("message_row_id", Long.valueOf(j2));
            contentValues.put("vcard", str);
            A022.A02.A06(contentValues, "message_quoted_vcard", 4);
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final void A07(String str, long j2) {
        C16800tf A022 = this.A09.A02();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("message_row_id", Long.valueOf(j2));
            contentValues.put("vcard", str);
            A022.A02.A06(contentValues, "message_vcard", 4);
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C39691su r11, long r12) {
        /*
            r10 = this;
            java.lang.String r7 = r11.A00
            X.0tq r4 = r10.A09
            X.0tf r2 = r4.get()
            X.0tg r6 = r2.A02     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = "SELECT _id FROM message_vcard WHERE message_row_id = ? AND vcard = ?"
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x00a9 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r12)     // Catch:{ all -> 0x00a9 }
            r3[r1] = r0     // Catch:{ all -> 0x00a9 }
            r0 = 1
            r3[r0] = r7     // Catch:{ all -> 0x00a9 }
            android.database.Cursor r1 = r6.A08(r5, r3)     // Catch:{ all -> 0x00a9 }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a2 }
            long r8 = r1.getLong(r0)     // Catch:{ all -> 0x00a2 }
            r1.close()     // Catch:{ all -> 0x00a9 }
            goto L_0x003a
        L_0x0031:
            r1.close()     // Catch:{ all -> 0x00a9 }
            r2.close()
            r8 = -1
            goto L_0x003d
        L_0x003a:
            r2.close()
        L_0x003d:
            X.1sv r0 = r11.A01
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x00a1
            X.0tf r2 = r4.A02()
            X.1cj r7 = r2.A00()     // Catch:{ all -> 0x00a9 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0099 }
        L_0x004f:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0092
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0099 }
            X.1sw r5 = (X.C39711sw) r5     // Catch:{ all -> 0x0099 }
            com.whatsapp.jid.UserJid r0 = r5.A01     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x004f
            r0 = 3
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0099 }
            r4.<init>(r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "vcard_jid_row_id"
            X.14v r1 = r10.A07     // Catch:{ all -> 0x0099 }
            com.whatsapp.jid.UserJid r0 = r5.A01     // Catch:{ all -> 0x0099 }
            long r0 = r1.A01(r0)     // Catch:{ all -> 0x0099 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0099 }
            r4.put(r3, r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "vcard_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0099 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0099 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0099 }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "message_vcard_jid"
            r1.A02(r4, r0)     // Catch:{ all -> 0x0099 }
            goto L_0x004f
        L_0x0092:
            r7.A00()     // Catch:{ all -> 0x0099 }
            r7.close()     // Catch:{ all -> 0x00a9 }
            goto L_0x009e
        L_0x0099:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00a8 }
            goto L_0x00a8
        L_0x009e:
            r2.close()
        L_0x00a1:
            return
        L_0x00a2:
            r0 = move-exception
            if (r1 == 0) goto L_0x00a8
            r1.close()     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223217m.A08(X.1su, long):void");
    }

    public boolean A09() {
        return this.A07.A0C() && this.A0A.A00("new_vcards_ready", 0) == 1;
    }
}
