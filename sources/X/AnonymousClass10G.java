package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.10G  reason: invalid class name */
public class AnonymousClass10G implements AnonymousClass10H {
    public final C16440t3 A00;
    public final AnonymousClass013 A01;
    public final C16920ts A02;
    public final C15810rt A03;
    public final C17620vN A04;
    public final C221616w A05;
    public final AnonymousClass17F A06;
    public final AnonymousClass17E A07;
    public final AnonymousClass17G A08;
    public final AnonymousClass17H A09;
    public final C19150xq A0A;
    public final C19650ym A0B;
    public final C16900tq A0C;
    public final C20260zl A0D;
    public final C16490t9 A0E;

    public AnonymousClass10G(C16440t3 r1, AnonymousClass013 r2, C16920ts r3, C15810rt r4, C17620vN r5, C221616w r6, AnonymousClass17F r7, AnonymousClass17E r8, AnonymousClass17G r9, AnonymousClass17H r10, C19150xq r11, C19650ym r12, C16900tq r13, C20260zl r14, C16490t9 r15) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A0E = r15;
        this.A0D = r14;
        this.A07 = r8;
        this.A01 = r2;
        this.A06 = r7;
        this.A08 = r9;
        this.A0A = r11;
        this.A04 = r5;
        this.A05 = r6;
        this.A09 = r10;
        this.A0C = r13;
        this.A0B = r12;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0052 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0052=Splitter:B:16:0x0052, B:8:0x0045=Splitter:B:8:0x0045} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A00(X.C15830rv r8) {
        /*
            r7 = this;
            X.0tq r0 = r7.A0C
            X.0tf r3 = r0.get()
            X.0tg r6 = r3.A02     // Catch:{ all -> 0x0053 }
            java.lang.String r5 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND starred = 1 AND (message_type != '7')"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0053 }
            r2 = 0
            X.0ts r0 = r7.A02     // Catch:{ all -> 0x0053 }
            long r0 = r0.A02(r8)     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0053 }
            r4[r2] = r0     // Catch:{ all -> 0x0053 }
            android.database.Cursor r2 = r6.A08(r5, r4)     // Catch:{ all -> 0x0053 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004c }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x004c }
            goto L_0x0045
        L_0x002f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r1.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "msgstore/countStarredMessages/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x004c }
            r1.append(r8)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x004c }
            r0 = 0
        L_0x0045:
            r2.close()     // Catch:{ all -> 0x0053 }
            r3.close()
            return r0
        L_0x004c:
            r0 = move-exception
            if (r2 == 0) goto L_0x0052
            r2.close()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10G.A00(X.0rv):long");
    }

    public void A01(Collection collection) {
        C20260zl r4 = this.A0D;
        C16490t9 r3 = this.A0E;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C42601y5.A02(r4, r3, (C16740tZ) it.next(), 1);
        }
        A02(collection, true);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0110 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0168 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x016d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x0172 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0177 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.util.Collection r24, boolean r25) {
        /*
            r23 = this;
            X.AnonymousClass00B.A00()
            r6 = r24
            java.util.Iterator r1 = r6.iterator()
        L_0x0009:
            boolean r0 = r1.hasNext()
            r5 = r25
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r1.next()
            X.0tZ r0 = (X.C16740tZ) r0
            r0.A0x = r5
            goto L_0x0009
        L_0x001a:
            long r21 = android.os.SystemClock.uptimeMillis()
            r4 = r23
            X.0tq r0 = r4.A0C     // Catch:{ SQLiteDatabaseCorruptException -> 0x0178 }
            X.0tf r20 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0178 }
            X.1cj r19 = r20.A00()     // Catch:{ all -> 0x0173 }
            X.17G r9 = r4.A08     // Catch:{ all -> 0x016e }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x016e }
            r8.<init>()     // Catch:{ all -> 0x016e }
            X.0tq r7 = r9.A05     // Catch:{ all -> 0x016e }
            X.0tf r3 = r7.A02()     // Catch:{ all -> 0x016e }
            X.1cj r18 = r3.A00()     // Catch:{ all -> 0x0169 }
            java.util.Iterator r17 = r6.iterator()     // Catch:{ all -> 0x0164 }
        L_0x003f:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0164 }
            if (r0 == 0) goto L_0x0111
            java.lang.Object r11 = r17.next()     // Catch:{ all -> 0x0164 }
            X.0tZ r11 = (X.C16740tZ) r11     // Catch:{ all -> 0x0164 }
            r16 = 0
            r7.A04()     // Catch:{ all -> 0x0164 }
            X.1jC r0 = r7.A04     // Catch:{ all -> 0x0164 }
            boolean r0 = r0.A0D(r3)     // Catch:{ all -> 0x0164 }
            if (r0 == 0) goto L_0x00ba
            X.0tf r10 = r7.A02()     // Catch:{ all -> 0x0164 }
            X.1Vw r12 = r11.A11     // Catch:{ all -> 0x010c }
            X.0rv r0 = r12.A00     // Catch:{ all -> 0x010c }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x010c }
            java.lang.String r15 = r0.getRawString()     // Catch:{ all -> 0x010c }
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x010c }
            r14.<init>()     // Catch:{ all -> 0x010c }
            java.lang.String r2 = "starred"
            r1 = 1
            r0 = 0
            if (r25 == 0) goto L_0x0074
            r0 = 1
        L_0x0074:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x010c }
            r14.put(r2, r0)     // Catch:{ all -> 0x010c }
            r0 = 3
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ all -> 0x010c }
            r13[r16] = r15     // Catch:{ all -> 0x010c }
            boolean r0 = r12.A02     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = "1"
        L_0x0086:
            r13[r1] = r0     // Catch:{ all -> 0x010c }
            r1 = 2
            java.lang.String r0 = r12.A01     // Catch:{ all -> 0x010c }
            r13[r1] = r0     // Catch:{ all -> 0x010c }
            X.0tg r2 = r10.A02     // Catch:{ all -> 0x010c }
            java.lang.String r1 = "messages"
            java.lang.String r0 = "key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
            int r0 = r2.A00(r1, r14, r0, r13)     // Catch:{ all -> 0x010c }
            if (r0 != 0) goto L_0x00b1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x010c }
            r1.<init>()     // Catch:{ all -> 0x010c }
            java.lang.String r0 = "MainMessageStore/updateMessageStarredStatus/did not update; message.key="
            r1.append(r0)     // Catch:{ all -> 0x010c }
            r1.append(r12)     // Catch:{ all -> 0x010c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x010c }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x010c }
            goto L_0x00b7
        L_0x00ae:
            java.lang.String r0 = "0"
            goto L_0x0086
        L_0x00b1:
            r10.close()     // Catch:{ all -> 0x0164 }
            r16 = 1
            goto L_0x00ba
        L_0x00b7:
            r10.close()     // Catch:{ all -> 0x0164 }
        L_0x00ba:
            boolean r0 = r9.A08()     // Catch:{ all -> 0x0164 }
            if (r0 == 0) goto L_0x00fe
            X.0tf r10 = r7.A02()     // Catch:{ all -> 0x0164 }
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x010c }
            r14.<init>()     // Catch:{ all -> 0x010c }
            java.lang.String r0 = "starred"
            X.C38611r4.A05(r14, r0, r5)     // Catch:{ all -> 0x010c }
            X.0tg r13 = r10.A02     // Catch:{ all -> 0x010c }
            java.lang.String r12 = "message"
            java.lang.String r1 = "chat_row_id = ? AND from_me = ? AND key_id = ?"
            X.1Vw r2 = r11.A11     // Catch:{ all -> 0x010c }
            java.lang.String[] r0 = r9.A0B(r2)     // Catch:{ all -> 0x010c }
            int r0 = r13.A00(r12, r14, r1, r0)     // Catch:{ all -> 0x010c }
            if (r0 != 0) goto L_0x00f9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x010c }
            r1.<init>()     // Catch:{ all -> 0x010c }
            java.lang.String r0 = "MainMessageStore/updateMessageStarredStatusV2/update failed; message.key="
            r1.append(r0)     // Catch:{ all -> 0x010c }
            r1.append(r2)     // Catch:{ all -> 0x010c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x010c }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x010c }
            r10.close()     // Catch:{ all -> 0x0164 }
            goto L_0x00fe
        L_0x00f9:
            r10.close()     // Catch:{ all -> 0x0164 }
            r0 = 1
            goto L_0x00ff
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            if (r16 != 0) goto L_0x0103
            if (r0 == 0) goto L_0x003f
        L_0x0103:
            X.1Vw r0 = r11.A11     // Catch:{ all -> 0x0164 }
            X.0rv r0 = r0.A00     // Catch:{ all -> 0x0164 }
            r8.add(r0)     // Catch:{ all -> 0x0164 }
            goto L_0x003f
        L_0x010c:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0110 }
        L_0x0110:
            throw r0     // Catch:{ all -> 0x0164 }
        L_0x0111:
            r18.A00()     // Catch:{ all -> 0x0164 }
            r18.close()     // Catch:{ all -> 0x0169 }
            r3.close()     // Catch:{ all -> 0x016e }
            r19.A00()     // Catch:{ all -> 0x016e }
            X.17F r0 = r4.A06     // Catch:{ all -> 0x016e }
            long r10 = r0.A04()     // Catch:{ all -> 0x016e }
            java.util.Iterator r3 = r6.iterator()     // Catch:{ all -> 0x016e }
        L_0x0127:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x0142
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x016e }
            X.0tZ r2 = (X.C16740tZ) r2     // Catch:{ all -> 0x016e }
            X.17H r1 = r4.A09     // Catch:{ all -> 0x016e }
            X.1y7 r0 = new X.1y7     // Catch:{ all -> 0x016e }
            r7 = r0
            r8 = r4
            r9 = r2
            r12 = r5
            r7.<init>(r8, r9, r10, r12)     // Catch:{ all -> 0x016e }
            r1.A00(r0)     // Catch:{ all -> 0x016e }
            goto L_0x0127
        L_0x0142:
            X.17E r0 = r4.A07     // Catch:{ all -> 0x016e }
            android.os.Handler r2 = r0.A02     // Catch:{ all -> 0x016e }
            r1 = 11
            com.facebook.redex.RunnableRunnableShape0S0210000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0210000_I0     // Catch:{ all -> 0x016e }
            r0.<init>(r4, r6, r1, r5)     // Catch:{ all -> 0x016e }
            r2.post(r0)     // Catch:{ all -> 0x016e }
            X.0vN r3 = r4.A04     // Catch:{ all -> 0x016e }
            java.lang.String r2 = "StarredMessageStore/updateMessageStarredStateInternal"
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x016e }
            long r0 = r0 - r21
            r3.A00(r2, r0)     // Catch:{ all -> 0x016e }
            r19.close()     // Catch:{ all -> 0x0173 }
            r20.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0178 }
            return
        L_0x0164:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x0168 }
        L_0x0168:
            throw r0     // Catch:{ all -> 0x0169 }
        L_0x0169:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x016d }
        L_0x016d:
            throw r0     // Catch:{ all -> 0x016e }
        L_0x016e:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x0172 }
        L_0x0172:
            throw r0     // Catch:{ all -> 0x0173 }
        L_0x0173:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x0177 }
        L_0x0177:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0178 }
        L_0x0178:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r4.A0B
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10G.A02(java.util.Collection, boolean):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0187 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x018c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0191 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0196 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x019b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.C15830rv r19, java.lang.Long r20) {
        /*
            r18 = this;
            long r16 = android.os.SystemClock.uptimeMillis()
            r3 = r18
            X.16w r0 = r3.A05
            java.util.Set r0 = r0.A04()
            r4 = r19
            if (r19 != 0) goto L_0x0018
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            r0 = 0
            return r0
        L_0x0018:
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0016
        L_0x001e:
            X.0tq r0 = r3.A0C     // Catch:{ SQLiteDatabaseCorruptException -> 0x019c }
            X.0tf r15 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x019c }
            X.1cj r14 = r15.A00()     // Catch:{ all -> 0x0197 }
            X.17G r9 = r3.A08     // Catch:{ all -> 0x0192 }
            X.0tq r8 = r9.A05     // Catch:{ all -> 0x0192 }
            X.0tf r5 = r8.A02()     // Catch:{ all -> 0x0192 }
            X.1cj r13 = r5.A00()     // Catch:{ all -> 0x018d }
            r8.A04()     // Catch:{ all -> 0x0188 }
            X.1jC r0 = r8.A04     // Catch:{ all -> 0x0188 }
            boolean r0 = r0.A0D(r5)     // Catch:{ all -> 0x0188 }
            r6 = r20
            if (r0 == 0) goto L_0x00c6
            X.0tf r7 = r8.A02()     // Catch:{ all -> 0x0188 }
            r0 = 1
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0183 }
            r11.<init>(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r1 = "starred"
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0183 }
            r11.put(r1, r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r12 = "starred = ? AND (status IS NULL OR status!=6)"
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0183 }
            r10.<init>()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "1"
            r10.add(r0)     // Catch:{ all -> 0x0183 }
            if (r19 == 0) goto L_0x007d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            r1.append(r12)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = " AND key_remote_jid = ? "
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r4.getRawString()     // Catch:{ all -> 0x0183 }
            r10.add(r0)     // Catch:{ all -> 0x0183 }
        L_0x007d:
            if (r20 == 0) goto L_0x0097
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            r1.append(r12)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = " AND _id <= ? "
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0183 }
            r10.add(r0)     // Catch:{ all -> 0x0183 }
        L_0x0097:
            X.0tg r2 = r7.A02     // Catch:{ all -> 0x0183 }
            java.lang.String r1 = "messages"
            java.lang.String[] r0 = X.AnonymousClass01S.A0H     // Catch:{ all -> 0x0183 }
            java.lang.Object[] r0 = r10.toArray(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0183 }
            int r2 = r2.A00(r1, r11, r12, r0)     // Catch:{ all -> 0x0183 }
            if (r2 == 0) goto L_0x00c3
            boolean r0 = r9.A09()     // Catch:{ all -> 0x0183 }
            if (r0 != 0) goto L_0x00c3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "MainMessageStore/unStarAllMessageV1/rowChanged="
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            r1.append(r2)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0183 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0183 }
        L_0x00c3:
            r7.close()     // Catch:{ all -> 0x0188 }
        L_0x00c6:
            X.0tf r7 = r8.A02()     // Catch:{ all -> 0x0188 }
            r0 = 1
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0183 }
            r10.<init>(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r1 = "starred"
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0183 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r11 = "starred = ? AND message_type != ?"
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0183 }
            r8.<init>()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "1"
            r8.add(r0)     // Catch:{ all -> 0x0183 }
            r0 = 7
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0183 }
            r8.add(r0)     // Catch:{ all -> 0x0183 }
            if (r19 == 0) goto L_0x0110
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            r1.append(r11)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = " AND chat_row_id = ? "
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x0183 }
            X.0ts r0 = r9.A03     // Catch:{ all -> 0x0183 }
            long r0 = r0.A02(r4)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0183 }
            r8.add(r0)     // Catch:{ all -> 0x0183 }
        L_0x0110:
            if (r20 == 0) goto L_0x012a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            r1.append(r11)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = " AND sort_id <= ?"
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0183 }
            r8.add(r0)     // Catch:{ all -> 0x0183 }
        L_0x012a:
            X.0tg r2 = r7.A02     // Catch:{ all -> 0x0183 }
            java.lang.String r1 = "message"
            java.lang.String[] r0 = X.AnonymousClass01S.A0H     // Catch:{ all -> 0x0183 }
            java.lang.Object[] r0 = r8.toArray(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0183 }
            int r2 = r2.A00(r1, r10, r11, r0)     // Catch:{ all -> 0x0183 }
            if (r2 == 0) goto L_0x0156
            boolean r0 = r9.A09()     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x0156
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "MainMessageStore/unStarAllMessageV1/rowChanged="
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            r1.append(r2)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0183 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0183 }
        L_0x0156:
            r7.close()     // Catch:{ all -> 0x0188 }
            r13.A00()     // Catch:{ all -> 0x0188 }
            r13.close()     // Catch:{ all -> 0x018d }
            r5.close()     // Catch:{ all -> 0x0192 }
            r14.A00()     // Catch:{ all -> 0x0192 }
            X.17H r1 = r3.A09     // Catch:{ all -> 0x0192 }
            X.1y6 r0 = new X.1y6     // Catch:{ all -> 0x0192 }
            r0.<init>(r4, r6)     // Catch:{ all -> 0x0192 }
            r1.A00(r0)     // Catch:{ all -> 0x0192 }
            X.0vN r5 = r3.A04     // Catch:{ all -> 0x0192 }
            java.lang.String r2 = "StarredMessageStore/unstarAll"
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0192 }
            long r0 = r0 - r16
            r5.A00(r2, r0)     // Catch:{ all -> 0x0192 }
            r14.close()     // Catch:{ all -> 0x0197 }
            r15.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x019c }
            goto L_0x01a5
        L_0x0183:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0187 }
        L_0x0187:
            throw r0     // Catch:{ all -> 0x0188 }
        L_0x0188:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x018c }
        L_0x018c:
            throw r0     // Catch:{ all -> 0x018d }
        L_0x018d:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0191 }
        L_0x0191:
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x0196 }
        L_0x0196:
            throw r0     // Catch:{ all -> 0x0197 }
        L_0x0197:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x019b }
        L_0x019b:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x019c }
        L_0x019c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r3.A0B
            r0.A02()
        L_0x01a5:
            X.17E r0 = r3.A07
            android.os.Handler r2 = r0.A02
            r1 = 47
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r3, r1, r4)
            r2.post(r0)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10G.A03(X.0rv, java.lang.Long):boolean");
    }

    public boolean A04(Collection collection) {
        boolean z2;
        Set A042 = this.A05.A04();
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = true;
                break;
            }
            C16740tZ r2 = (C16740tZ) it.next();
            C15830rv r1 = r2.A11.A00;
            if (A042.contains(r1)) {
                long j2 = r2.A14;
                C15810rt r0 = this.A03;
                AnonymousClass00B.A06(r1);
                C15840rx A062 = r0.A06(r1);
                if (j2 < (A062 == null ? Long.MIN_VALUE : A062.A0D)) {
                    z2 = false;
                    break;
                }
            }
        }
        if (!z2) {
            return false;
        }
        A02(collection, false);
        return true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x005b=Splitter:B:14:0x005b, B:21:0x006d=Splitter:B:21:0x006d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor ADc(X.AnonymousClass024 r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r4 = "StarredMessageStore/getStarredMessages"
            long r11 = android.os.SystemClock.uptimeMillis()
            X.17F r8 = r13.A06
            long r9 = r8.A04()
            X.0tq r0 = r13.A0C     // Catch:{ all -> 0x006e }
            X.0tf r5 = r0.get()     // Catch:{ all -> 0x006e }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0069 }
            r3 = 0
            if (r0 != 0) goto L_0x0053
            r1 = 1
            r7 = 0
            r6 = 1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x002b
            java.lang.String r3 = r8.A0G(r15)     // Catch:{ all -> 0x0069 }
        L_0x002b:
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = X.C42431xm.A0C     // Catch:{ all -> 0x0069 }
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x0069 }
            r0[r7] = r3     // Catch:{ all -> 0x0069 }
            android.database.Cursor r3 = r2.A07(r14, r1, r0)     // Catch:{ all -> 0x0069 }
            goto L_0x005b
        L_0x0038:
            X.013 r1 = r13.A01     // Catch:{ all -> 0x0069 }
            X.1xi r0 = new X.1xi     // Catch:{ all -> 0x0069 }
            r0.<init>(r1)     // Catch:{ all -> 0x0069 }
            r0.A04(r15)     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = r8.A0B(r14, r0, r3)     // Catch:{ all -> 0x0069 }
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = X.C42431xm.A0D     // Catch:{ all -> 0x0069 }
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x0069 }
            r0[r7] = r3     // Catch:{ all -> 0x0069 }
            android.database.Cursor r3 = r2.A07(r14, r1, r0)     // Catch:{ all -> 0x0069 }
            goto L_0x005b
        L_0x0053:
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = X.AnonymousClass1WW.A03     // Catch:{ all -> 0x0069 }
            android.database.Cursor r3 = r1.A07(r14, r0, r3)     // Catch:{ all -> 0x0069 }
        L_0x005b:
            r5.close()     // Catch:{ all -> 0x006e }
            X.0vN r2 = r13.A04
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r11
            r2.A00(r4, r0)
            return r3
        L_0x0069:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x006d }
        L_0x006d:
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r3 = move-exception
            X.0vN r2 = r13.A04
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r11
            r2.A00(r4, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10G.ADc(X.024, java.lang.String):android.database.Cursor");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0092 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0080=Splitter:B:15:0x0080, B:22:0x0092=Splitter:B:22:0x0092} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor ADd(X.AnonymousClass024 r18, X.C15830rv r19, java.lang.String r20) {
        /*
            r17 = this;
            java.lang.String r5 = "StarredMessageStore/getStarredMessagesForJid"
            long r15 = android.os.SystemClock.uptimeMillis()
            r6 = r17
            X.17F r3 = r6.A06
            long r13 = r3.A04()
            X.0tq r0 = r6.A0C     // Catch:{ all -> 0x0093 }
            X.0tf r7 = r0.get()     // Catch:{ all -> 0x0093 }
            r11 = r20
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x008e }
            r12 = 0
            r9 = 1
            r8 = r18
            r10 = r19
            if (r0 != 0) goto L_0x006a
            r1 = 1
            r4 = 0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x0033
            java.lang.String r4 = r3.A0G(r11)     // Catch:{ all -> 0x008e }
        L_0x0033:
            X.0tg r11 = r7.A02     // Catch:{ all -> 0x008e }
            java.lang.String r3 = X.C42431xm.A0A     // Catch:{ all -> 0x008e }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x008e }
            X.0ts r0 = r6.A02     // Catch:{ all -> 0x008e }
            long r0 = r0.A02(r10)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x008e }
            r2[r12] = r0     // Catch:{ all -> 0x008e }
            r2[r9] = r4     // Catch:{ all -> 0x008e }
            android.database.Cursor r3 = r11.A07(r8, r3, r2)     // Catch:{ all -> 0x008e }
            goto L_0x0080
        L_0x004d:
            X.013 r1 = r6.A01     // Catch:{ all -> 0x008e }
            X.1xi r0 = new X.1xi     // Catch:{ all -> 0x008e }
            r0.<init>(r1)     // Catch:{ all -> 0x008e }
            r0.A04(r11)     // Catch:{ all -> 0x008e }
            r0.A04 = r10     // Catch:{ all -> 0x008e }
            java.lang.String r3 = r3.A0B(r8, r0, r4)     // Catch:{ all -> 0x008e }
            X.0tg r2 = r7.A02     // Catch:{ all -> 0x008e }
            java.lang.String r1 = X.C42431xm.A0B     // Catch:{ all -> 0x008e }
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ all -> 0x008e }
            r0[r12] = r3     // Catch:{ all -> 0x008e }
            android.database.Cursor r3 = r2.A07(r8, r1, r0)     // Catch:{ all -> 0x008e }
            goto L_0x0080
        L_0x006a:
            X.0tg r4 = r7.A02     // Catch:{ all -> 0x008e }
            java.lang.String r3 = X.AnonymousClass1WW.A02     // Catch:{ all -> 0x008e }
            java.lang.String[] r2 = new java.lang.String[r9]     // Catch:{ all -> 0x008e }
            X.0ts r0 = r6.A02     // Catch:{ all -> 0x008e }
            long r0 = r0.A02(r10)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x008e }
            r2[r12] = r0     // Catch:{ all -> 0x008e }
            android.database.Cursor r3 = r4.A07(r8, r3, r2)     // Catch:{ all -> 0x008e }
        L_0x0080:
            r7.close()     // Catch:{ all -> 0x0093 }
            X.0vN r2 = r6.A04
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r15
            r2.A00(r5, r0)
            return r3
        L_0x008e:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0092 }
        L_0x0092:
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r3 = move-exception
            X.0vN r2 = r6.A04
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r15
            r2.A00(r5, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10G.ADd(X.024, X.0rv, java.lang.String):android.database.Cursor");
    }
}
