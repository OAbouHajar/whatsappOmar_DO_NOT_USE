package X;

import android.app.Activity;
import android.content.Context;
import com.obwhatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Lr  reason: invalid class name and case insensitive filesystem */
public class C25931Lr {
    public final C14870pt A00;
    public final C16760tb A01;
    public final AnonymousClass01Y A02;
    public final C18260wP A03;
    public final C16000sG A04;
    public final AnonymousClass15I A05;
    public final AnonymousClass11A A06;
    public final C20260zl A07;
    public final C17240ul A08;
    public final C17780vd A09;

    public C25931Lr(C14870pt r1, C16760tb r2, AnonymousClass01Y r3, C18260wP r4, C16000sG r5, AnonymousClass15I r6, AnonymousClass11A r7, C20260zl r8, C17240ul r9, C17780vd r10) {
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A04 = r5;
        this.A02 = r3;
        this.A08 = r9;
        this.A09 = r10;
        this.A05 = r6;
        this.A06 = r7;
        this.A03 = r4;
    }

    public void A00(Activity activity, AnonymousClass1Y7 r19, C16010sH r20, String str, String str2, String str3, boolean z2) {
        C16010sH r6 = r20;
        AnonymousClass1Y7 r3 = r19;
        boolean z3 = z2;
        if (!r6.A0J()) {
            Jid A082 = r6.A08(UserJid.class);
            AnonymousClass00B.A06(A082);
            UserJid userJid = (UserJid) A082;
            this.A02.A0I(activity, r6, userJid, str, str2, str3);
            if (z2) {
                this.A01.A0I(userJid, true);
            }
            if (r19 != null) {
                r3.AZU(r6);
                return;
            }
            return;
        }
        C17780vd r1 = this.A09;
        C17240ul r7 = this.A08;
        AnonymousClass11A r5 = this.A06;
        Jid A083 = r6.A08(C16050sL.class);
        AnonymousClass00B.A06(A083);
        r1.A05(new C76513u2(r3, this, r5, r6, r7, (C16050sL) A083, z3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05d9, code lost:
        if (r11.A10(131072) == false) goto L_0x05db;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x02ab */
    /* JADX WARNING: Missing exception handler attribute for start block: B:189:0x04bf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:194:0x04c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:216:0x052f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x019c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x01a5 */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x07ab  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0223  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x019c=Splitter:B:60:0x019c, B:51:0x018d=Splitter:B:51:0x018d} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:67:0x01a5=Splitter:B:67:0x01a5, B:62:0x019d=Splitter:B:62:0x019d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C16010sH r47, java.lang.String r48, java.util.List<android.util.Pair> r49) {
        /*
            r46 = this;
            java.lang.Class<X.0rv> r1 = X.C15830rv.class
            r45 = r47
            r0 = r45
            com.whatsapp.jid.Jid r21 = r0.A08(r1)
            X.AnonymousClass00B.A06(r21)
            r0 = r21
            X.0rv r0 = (X.C15830rv) r0
            r21 = r0
            r44 = r46
            r0 = r44
            X.15I r5 = r0.A05
            monitor-enter(r5)
            android.content.SharedPreferences r2 = r5.A05()     // Catch:{ all -> 0x0b02 }
            java.lang.String r0 = r21.getRawString()     // Catch:{ all -> 0x0b02 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b02 }
            r1.<init>()     // Catch:{ all -> 0x0b02 }
            r1.append(r0)     // Catch:{ all -> 0x0b02 }
            java.lang.String r0 = "_integrity"
            r1.append(r0)     // Catch:{ all -> 0x0b02 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x0b02 }
            java.lang.String r0 = "0,null,null"
            java.lang.String r0 = r2.getString(r7, r0)     // Catch:{ all -> 0x0b02 }
            java.lang.String r8 = ","
            java.lang.String[] r1 = r0.split(r8)     // Catch:{ all -> 0x0b02 }
            r0 = 0
            long r10 = X.AnonymousClass2D6.A01(r1, r0)     // Catch:{ all -> 0x0b02 }
            java.lang.Integer r9 = X.AnonymousClass2D6.A03(r1)     // Catch:{ all -> 0x0b02 }
            r6 = 2
            java.lang.Boolean r4 = X.AnonymousClass2D6.A02(r1, r6)     // Catch:{ all -> 0x0b02 }
            r0 = 1
            long r10 = r10 + r0
            android.content.SharedPreferences$Editor r3 = r2.edit()     // Catch:{ all -> 0x0b02 }
            r0 = 3
            java.io.Serializable[] r2 = new java.io.Serializable[r0]     // Catch:{ all -> 0x0b02 }
            java.lang.Long r1 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0b02 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0b02 }
            r0 = 1
            r2[r0] = r9     // Catch:{ all -> 0x0b02 }
            r2[r6] = r4     // Catch:{ all -> 0x0b02 }
            java.util.List r0 = java.util.Arrays.asList(r2)     // Catch:{ all -> 0x0b02 }
            java.lang.String r0 = android.text.TextUtils.join(r8, r0)     // Catch:{ all -> 0x0b02 }
            android.content.SharedPreferences$Editor r0 = r3.putString(r7, r0)     // Catch:{ all -> 0x0b02 }
            r0.apply()     // Catch:{ all -> 0x0b02 }
            monitor-exit(r5)
            r0 = r44
            X.0tb r6 = r0.A01
            X.AnonymousClass00B.A00()
            r0 = r21
            r6.A0C(r0)
            X.0tK r0 = r6.A0B
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0aa2
            r2 = 5
            if (r49 != 0) goto L_0x0090
            X.0yz r1 = r6.A0l
            r0 = r21
            java.util.List r49 = r1.A04(r0, r2)
        L_0x0090:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r49.iterator()
        L_0x0099:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r1.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            r2.add(r0)
            goto L_0x0099
        L_0x00ab:
            X.0z4 r4 = r6.A1H
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0A(r0, r2)
            r19 = r48
            java.lang.Integer r0 = X.C19830z4.A02(r19)
            int r3 = r0.intValue()
            r2 = 7
            r1 = 0
            r0 = r21
            r4.A08(r0, r1, r3, r2)
            int r0 = r49.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r3 = r49.iterator()
        L_0x00d3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0106
            java.lang.Object r0 = r3.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r2 = r0.first
            X.0tZ r2 = (X.C16740tZ) r2
            r0 = 8
            boolean r0 = r2.A10(r0)
            if (r0 != 0) goto L_0x00fd
            boolean r0 = r2 instanceof X.C30591cd
            if (r0 != 0) goto L_0x00fd
            boolean r0 = r2 instanceof X.C16830ti
            if (r0 != 0) goto L_0x00fd
            r1 = 0
        L_0x00f4:
            X.4Ih r0 = new X.4Ih
            r0.<init>(r2, r1)
            r8.add(r0)
            goto L_0x00d3
        L_0x00fd:
            X.153 r0 = r6.A0k
            java.lang.String r1 = r0.A00(r2)
            if (r1 == 0) goto L_0x00d3
            goto L_0x00f4
        L_0x0106:
            X.0sG r0 = r6.A0J
            r18 = r0
            r1 = r0
            r0 = r21
            X.0sH r3 = r1.A08(r0)
            r4 = 0
            r2 = 1
            if (r3 == 0) goto L_0x01ad
            boolean r0 = r3.A0J()
            if (r0 == 0) goto L_0x01ad
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            com.whatsapp.jid.Jid r5 = r3.A08(r0)
            X.AnonymousClass00B.A06(r5)
            com.whatsapp.jid.GroupJid r5 = (com.whatsapp.jid.GroupJid) r5
            X.11H r7 = r6.A0i
            X.0tq r0 = r7.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b2, IllegalStateException -> 0x01a6 }
            X.0tf r9 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b2, IllegalStateException -> 0x01a6 }
            r0.A04()     // Catch:{ all -> 0x01a1 }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x01a1 }
            X.0tg r11 = r9.A02     // Catch:{ all -> 0x01a1 }
            boolean r0 = r0.A0E(r11)     // Catch:{ all -> 0x01a1 }
            if (r0 == 0) goto L_0x0153
            java.lang.String r10 = "SELECT sender_jid_row_id, sender_jid_raw_string FROM message_system_group AS system_group JOIN message_system AS message_system ON message_system.message_row_id = system_group.message_row_id JOIN available_message_view AS message ON message_system.message_row_id = message._id WHERE message.chat_row_id = ? AND message.message_type = '7' AND message.from_me = 1 AND message_system.action_type = 12 AND system_group.is_me_joined = 1 ORDER BY _id DESC LIMIT 1"
        L_0x013d:
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x01a1 }
            r14 = 0
            X.0ts r0 = r7.A01     // Catch:{ all -> 0x01a1 }
            long r12 = r0.A02(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x01a1 }
            r1[r14] = r0     // Catch:{ all -> 0x01a1 }
            android.database.Cursor r10 = r11.A08(r10, r1)     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x019d
            goto L_0x0156
        L_0x0153:
            java.lang.String r10 = "SELECT sender_jid_row_id, sender_jid_raw_string FROM available_message_view WHERE chat_row_id = ? AND message_type = '7' AND from_me = 1 AND media_size = 12 AND media_duration = 1 ORDER BY _id DESC LIMIT 1"
            goto L_0x013d
        L_0x0156:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x0194
            java.lang.String r0 = "sender_jid_row_id"
            int r1 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0198 }
            boolean r0 = r10.isNull(r1)     // Catch:{ all -> 0x0198 }
            if (r0 != 0) goto L_0x017e
            long r0 = r10.getLong(r1)     // Catch:{ all -> 0x0198 }
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x017e
            X.14v r11 = r7.A03     // Catch:{ all -> 0x0198 }
            com.whatsapp.jid.Jid r0 = r11.A03(r0)     // Catch:{ all -> 0x0198 }
            com.whatsapp.jid.UserJid r22 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x0198 }
            goto L_0x018d
        L_0x017e:
            java.lang.String r0 = "sender_jid_raw_string"
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x0198 }
            com.whatsapp.jid.UserJid r22 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x0198 }
        L_0x018d:
            r10.close()     // Catch:{ all -> 0x01a1 }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b2, IllegalStateException -> 0x01a6 }
            goto L_0x01bd
        L_0x0194:
            r10.close()     // Catch:{ all -> 0x01a1 }
            goto L_0x019d
        L_0x0198:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x019c }
        L_0x019c:
            throw r0     // Catch:{ all -> 0x01a1 }
        L_0x019d:
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b2, IllegalStateException -> 0x01a6 }
            goto L_0x01bb
        L_0x01a1:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x01a5 }
        L_0x01a5:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b2, IllegalStateException -> 0x01a6 }
        L_0x01a6:
            r1 = move-exception
            java.lang.String r0 = "msgstore/getlastmessagesfornotification/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x01bb
        L_0x01ad:
            r22 = r4
            r20 = r4
            goto L_0x01c9
        L_0x01b2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r7.A04
            r0.A02()
        L_0x01bb:
            r22 = 0
        L_0x01bd:
            X.0rt r0 = r6.A0b
            int r0 = r0.A02(r5)
            if (r0 == r2) goto L_0x0223
            java.lang.String r20 = r3.A09()
        L_0x01c9:
            com.whatsapp.jid.UserJid r7 = com.whatsapp.jid.UserJid.of(r21)
            if (r7 == 0) goto L_0x053d
            X.0s5 r1 = r6.A07
            X.0s8 r0 = X.C15910s6.A0U
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x053d
            r0 = 0
            X.1Zf r5 = new X.1Zf
            r5.<init>((boolean) r0)
            java.lang.String r0 = "useractions/userActionReportSpam"
            r5.A04(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.0t3 r0 = r6.A0Q
            long r2 = r0.A00()
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r2 = r2 - r0
            java.util.Iterator r12 = r49.iterator()
        L_0x01f8:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0226
            java.lang.Object r9 = r12.next()
            android.util.Pair r9 = (android.util.Pair) r9
            java.lang.Object r11 = r9.first
            X.0tZ r11 = (X.C16740tZ) r11
            long r0 = r11.A0I
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 < 0) goto L_0x01f8
            long r0 = r11.A0G
            java.lang.Object r9 = r9.second
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r11 = r9.booleanValue()
            java.lang.String r10 = "individual"
            X.1py r9 = new X.1py
            r9.<init>(r10, r0, r11)
            r4.add(r9)
            goto L_0x01f8
        L_0x0223:
            r20 = r4
            goto L_0x01c9
        L_0x0226:
            X.128 r0 = r6.A0q
            r17 = r0
            r10 = 5
            X.AnonymousClass00B.A00()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            X.11G r0 = r0.A0G
            X.1dI r14 = r0.A06(r7)
            if (r14 == 0) goto L_0x02b7
            r0 = r17
            X.0tq r0 = r0.A0D
            X.0tf r13 = r0.get()
            X.0tg r12 = r13.A02     // Catch:{ all -> 0x02af }
            java.lang.String r11 = "SELECT received_timestamp FROM message_view WHERE chat_row_id = ? AND (sender_jid_row_id = ? OR sender_jid_raw_string = ?) AND sort_id <= ? ORDER BY sort_id DESC LIMIT ?"
            java.lang.String[] r9 = new java.lang.String[r10]     // Catch:{ all -> 0x02af }
            r16 = 0
            r0 = r17
            X.0ts r1 = r0.A05     // Catch:{ all -> 0x02af }
            X.1kq r0 = X.C34771kq.A00     // Catch:{ all -> 0x02af }
            long r0 = r1.A02(r0)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02af }
            r9[r16] = r0     // Catch:{ all -> 0x02af }
            r16 = 1
            r0 = r17
            X.14v r0 = r0.A08     // Catch:{ all -> 0x02af }
            long r0 = r0.A01(r7)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02af }
            r9[r16] = r0     // Catch:{ all -> 0x02af }
            r1 = 2
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x02af }
            r9[r1] = r0     // Catch:{ all -> 0x02af }
            r16 = 3
            monitor-enter(r14)     // Catch:{ all -> 0x02af }
            long r0 = r14.A06     // Catch:{ all -> 0x02ac }
            monitor-exit(r14)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02af }
            r9[r16] = r0     // Catch:{ all -> 0x02af }
            r1 = 4
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02af }
            r9[r1] = r0     // Catch:{ all -> 0x02af }
            android.database.Cursor r1 = r12.A08(r11, r9)     // Catch:{ all -> 0x02af }
        L_0x0289:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x02a5 }
            if (r0 == 0) goto L_0x02a1
            java.lang.String r0 = "received_timestamp"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02a5 }
            long r11 = r1.getLong(r0)     // Catch:{ all -> 0x02a5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x02a5 }
            r15.add(r0)     // Catch:{ all -> 0x02a5 }
            goto L_0x0289
        L_0x02a1:
            r1.close()     // Catch:{ all -> 0x02af }
            goto L_0x02b4
        L_0x02a5:
            r0 = move-exception
            if (r1 == 0) goto L_0x02ab
            r1.close()     // Catch:{ all -> 0x02ab }
        L_0x02ab:
            throw r0     // Catch:{ all -> 0x02af }
        L_0x02ac:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x02af }
            throw r0     // Catch:{ all -> 0x02af }
        L_0x02af:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0534 }
            throw r0
        L_0x02b4:
            r13.close()
        L_0x02b7:
            java.util.Iterator r13 = r15.iterator()
        L_0x02bb:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02d8
            java.lang.Object r0 = r13.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.String r12 = "status"
            r11 = 1
            X.1py r9 = new X.1py
            r9.<init>(r12, r0, r11)
            r4.add(r9)
            goto L_0x02bb
        L_0x02d8:
            X.199 r1 = r6.A0Z
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r0 = 3
            java.lang.String[] r9 = new java.lang.String[r0]
            X.14v r0 = r1.A01
            long r13 = r0.A01(r7)
            java.lang.String r11 = java.lang.String.valueOf(r13)
            r0 = 0
            r9[r0] = r11
            java.lang.String r11 = java.lang.String.valueOf(r2)
            r0 = 1
            r9[r0] = r11
            java.lang.String r24 = java.lang.String.valueOf(r10)
            r0 = 2
            r9[r0] = r24
            X.0tq r0 = r1.A03
            X.0tf r11 = r0.get()
            X.0tg r1 = r11.A02     // Catch:{ all -> 0x0530 }
            java.lang.String r0 = "SELECT timestamp, call_result FROM call_log WHERE jid_row_id = ? AND from_me = 0 AND timestamp >= ? ORDER BY _id DESC LIMIT ?"
            android.database.Cursor r9 = r1.A08(r0, r9)     // Catch:{ all -> 0x0530 }
        L_0x030b:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x033a
            java.lang.String r0 = "timestamp"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0529 }
            long r13 = r9.getLong(r0)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = "call_result"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0529 }
            int r0 = r9.getInt(r0)     // Catch:{ all -> 0x0529 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0529 }
            r13 = 0
            if (r0 != r10) goto L_0x032e
            r13 = 1
        L_0x032e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0529 }
            android.util.Pair r0 = android.util.Pair.create(r1, r0)     // Catch:{ all -> 0x0529 }
            r12.add(r0)     // Catch:{ all -> 0x0529 }
            goto L_0x030b
        L_0x033a:
            r9.close()     // Catch:{ all -> 0x0530 }
            r11.close()
            java.lang.String r0 = "CallLogStore/getCallsByJid/size="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r12.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Iterator r13 = r12.iterator()
        L_0x0359:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0380
            java.lang.Object r9 = r13.next()
            android.util.Pair r9 = (android.util.Pair) r9
            java.lang.Object r0 = r9.first
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Object r9 = r9.second
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r12 = r9.booleanValue()
            java.lang.String r11 = "call"
            X.1py r9 = new X.1py
            r9.<init>(r11, r0, r12)
            r4.add(r9)
            goto L_0x0359
        L_0x0380:
            r1 = 6
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r0.<init>(r1)
            java.util.Collections.sort(r4, r0)
            int r1 = r4.size()
            r9 = 4
            if (r1 <= r10) goto L_0x03a2
            r0 = 1
            int r1 = r1 - r0
        L_0x0392:
            if (r1 < r10) goto L_0x039a
            r4.remove(r1)
            int r1 = r1 + -1
            goto L_0x0392
        L_0x039a:
            java.lang.Object r0 = r4.get(r9)
            X.1py r0 = (X.C37931py) r0
            long r2 = r0.A00
        L_0x03a2:
            java.lang.String r0 = " other interaction time spent in ms: "
            r5.A02(r0)
            r0 = 0
            r5.A01 = r0
            r5.A00 = r0
            r5.A03()
            java.util.ArrayList r0 = r18.A0E()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r12 = r0.iterator()
        L_0x03bd:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0410
            java.lang.Object r1 = r12.next()
            X.0sH r1 = (X.C16010sH) r1
            boolean r0 = r1.A0J()
            if (r0 == 0) goto L_0x03bd
            X.0rv r0 = r1.A0E
            boolean r0 = X.C16030sJ.A0R(r0)
            if (r0 != 0) goto L_0x03bd
            java.lang.String r0 = r1.A09()
            if (r0 == 0) goto L_0x03bd
            X.0sO r0 = r6.A0j
            java.lang.Class<X.0sL> r11 = X.C16050sL.class
            com.whatsapp.jid.Jid r11 = r1.A08(r11)
            X.AnonymousClass00B.A06(r11)
            X.0sN r11 = (X.C16060sN) r11
            X.0us r0 = r0.A07
            X.1cE r0 = r0.A04(r11)
            X.0uz r11 = r0.A02()
            boolean r0 = r11.contains(r7)
            if (r0 == 0) goto L_0x03bd
            X.0sK r0 = r6.A05
            r0.A0B()
            X.1Zb r0 = r0.A01
            X.AnonymousClass00B.A06(r0)
            X.0rv r0 = r0.A0E
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x03bd
            r10.add(r1)
            goto L_0x03bd
        L_0x0410:
            java.util.Iterator r23 = r10.iterator()
        L_0x0414:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x0535
            java.lang.Object r1 = r23.next()
            X.0sH r1 = (X.C16010sH) r1
            X.0yz r0 = r6.A0l
            r25 = r0
            X.0rv r0 = r1.A0E
            X.0rv r1 = X.C15830rv.A00(r0)
            r10 = 5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0 = r25
            X.0tq r0 = r0.A09     // Catch:{ SQLiteDatabaseCorruptException -> 0x04cc, IllegalStateException -> 0x04c5 }
            X.0tf r11 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04cc, IllegalStateException -> 0x04c5 }
            X.0tg r13 = r11.A02     // Catch:{ all -> 0x04c0 }
            java.lang.String r12 = "SELECT sort_id, received_timestamp FROM message_view WHERE chat_row_id = ? AND (sender_jid_row_id = ? OR sender_jid_raw_string = ?) AND from_me = 0 AND received_timestamp >= ? AND message_type NOT IN ('10', '7', '15', '19') ORDER BY sort_id DESC LIMIT ?"
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x04c0 }
            r0 = r25
            X.0ts r0 = r0.A03     // Catch:{ all -> 0x04c0 }
            long r14 = r0.A02(r1)     // Catch:{ all -> 0x04c0 }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x04c0 }
            r0 = 0
            r10[r0] = r14     // Catch:{ all -> 0x04c0 }
            r0 = r25
            X.14v r14 = r0.A06     // Catch:{ all -> 0x04c0 }
            r0 = r21
            long r14 = r14.A01(r0)     // Catch:{ all -> 0x04c0 }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x04c0 }
            r0 = 1
            r10[r0] = r14     // Catch:{ all -> 0x04c0 }
            r14 = 2
            java.lang.String r0 = r21.getRawString()     // Catch:{ all -> 0x04c0 }
            r10[r14] = r0     // Catch:{ all -> 0x04c0 }
            r14 = 3
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x04c0 }
            r10[r14] = r0     // Catch:{ all -> 0x04c0 }
            r10[r9] = r24     // Catch:{ all -> 0x04c0 }
            android.database.Cursor r13 = r13.A08(r12, r10)     // Catch:{ all -> 0x04c0 }
            r0 = r25
            X.0rt r0 = r0.A04     // Catch:{ all -> 0x04b9 }
            X.0rx r0 = r0.A06(r1)     // Catch:{ all -> 0x04b9 }
            if (r0 == 0) goto L_0x04af
            long r0 = r0.A0O     // Catch:{ all -> 0x04b9 }
        L_0x047e:
            java.lang.String r10 = "received_timestamp"
            int r14 = r13.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x04b9 }
            java.lang.String r10 = "sort_id"
            int r12 = r13.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x04b9 }
        L_0x048b:
            boolean r10 = r13.moveToNext()     // Catch:{ all -> 0x04b9 }
            if (r10 == 0) goto L_0x04b2
            long r15 = r13.getLong(r14)     // Catch:{ all -> 0x04b9 }
            long r17 = r13.getLong(r12)     // Catch:{ all -> 0x04b9 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x04b9 }
            int r16 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            r10 = 0
            if (r16 > 0) goto L_0x04a3
            r10 = 1
        L_0x04a3:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x04b9 }
            android.util.Pair r10 = android.util.Pair.create(r15, r10)     // Catch:{ all -> 0x04b9 }
            r7.add(r10)     // Catch:{ all -> 0x04b9 }
            goto L_0x048b
        L_0x04af:
            r0 = -1
            goto L_0x047e
        L_0x04b2:
            r13.close()     // Catch:{ all -> 0x04c0 }
            r11.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04cc, IllegalStateException -> 0x04c5 }
            goto L_0x04d7
        L_0x04b9:
            r0 = move-exception
            if (r13 == 0) goto L_0x04bf
            r13.close()     // Catch:{ all -> 0x04bf }
        L_0x04bf:
            throw r0     // Catch:{ all -> 0x04c0 }
        L_0x04c0:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x04c4 }
        L_0x04c4:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x04cc, IllegalStateException -> 0x04c5 }
        L_0x04c5:
            r1 = move-exception
            java.lang.String r0 = "msgstore/getlastsignificantgroupmessagesbyjid/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x04d7
        L_0x04cc:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = r25
            X.0ym r0 = r0.A08
            r0.A02()
        L_0x04d7:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0414
            java.util.Iterator r12 = r7.iterator()
        L_0x04e1:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0508
            java.lang.Object r7 = r12.next()
            android.util.Pair r7 = (android.util.Pair) r7
            java.lang.Object r0 = r7.first
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Object r7 = r7.second
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r11 = r7.booleanValue()
            java.lang.String r10 = "group"
            X.1py r7 = new X.1py
            r7.<init>(r10, r0, r11)
            r4.add(r7)
            goto L_0x04e1
        L_0x0508:
            r1 = 5
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r0.<init>(r1)
            java.util.Collections.sort(r4, r0)
            int r0 = r4.size()
            if (r0 <= r1) goto L_0x0414
        L_0x0517:
            int r0 = r0 + -1
            if (r0 < r1) goto L_0x051f
            r4.remove(r0)
            goto L_0x0517
        L_0x051f:
            java.lang.Object r0 = r4.get(r9)
            X.1py r0 = (X.C37931py) r0
            long r2 = r0.A00
            goto L_0x0414
        L_0x0529:
            r0 = move-exception
            if (r9 == 0) goto L_0x052f
            r9.close()     // Catch:{ all -> 0x052f }
        L_0x052f:
            throw r0     // Catch:{ all -> 0x0530 }
        L_0x0530:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0534 }
        L_0x0534:
            throw r0
        L_0x0535:
            java.lang.String r0 = "group interaction time spent in ms: "
            r5.A02(r0)
            r5.A01()
        L_0x053d:
            X.156 r1 = r6.A0K
            r0 = r21
            X.26U r24 = r1.A00(r0)
            X.1Sm r10 = r6.A1P
            X.0ug r0 = r10.A05
            r43 = r0
            java.lang.String r25 = r43.A02()
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
            java.util.Iterator r31 = r8.iterator()
        L_0x0558:
            boolean r0 = r31.hasNext()
            if (r0 == 0) goto L_0x093b
            java.lang.Object r30 = r31.next()
            r0 = r30
            X.4Ih r0 = (X.C83854Ih) r0
            r30 = r0
            if (r0 == 0) goto L_0x0558
            X.0tZ r11 = r0.A00
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            long r0 = r11.A0I
            java.lang.String r2 = java.lang.Long.toString(r0)
            java.lang.String r1 = "t"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r9.add(r0)
            X.1Vw r2 = r11.A11
            boolean r0 = r2.A02
            r29 = r0
            if (r0 == 0) goto L_0x0934
            java.lang.String r3 = "to"
        L_0x058d:
            X.0rv r1 = r2.A00
            X.AnonymousClass00B.A06(r1)
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r3)
            r9.add(r0)
            byte r0 = r11.A10
            r28 = r0
            if (r0 != 0) goto L_0x0930
            java.lang.String r3 = "text"
        L_0x05a3:
            java.lang.String r27 = "type"
            X.1lL r1 = new X.1lL
            r0 = r27
            r1.<init>((java.lang.String) r0, (java.lang.String) r3)
            r9.add(r1)
            java.lang.String r2 = r2.A01
            java.lang.String r26 = "id"
            X.1lL r1 = new X.1lL
            r0 = r26
            r1.<init>((java.lang.String) r0, (java.lang.String) r2)
            r9.add(r1)
            X.0rv r2 = r11.A0B()
            if (r2 == 0) goto L_0x05ce
            java.lang.String r1 = "participant"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)
            r9.add(r0)
        L_0x05ce:
            boolean r0 = r11 instanceof X.C30581cc
            if (r0 == 0) goto L_0x05db
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r1 = r11.A10(r0)
            r0 = 1
            if (r1 != 0) goto L_0x05dc
        L_0x05db:
            r0 = 0
        L_0x05dc:
            r1 = 1
            if (r0 == 0) goto L_0x05e9
            java.lang.String r2 = "edit"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (int) r1)
            r9.add(r0)
        L_0x05e9:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r5 = 12
            r7 = 2
            java.lang.String r3 = "2"
            java.lang.String r2 = "v"
            r6 = 0
            r0 = r28
            if (r0 != r5) goto L_0x076d
            r1 = r11
            X.1rQ r1 = (X.C38791rQ) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0606
            java.lang.String r3 = java.lang.Integer.toString(r0)
        L_0x0606:
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r3)
            r8.add(r0)
            byte[] r12 = r1.A11()
        L_0x0612:
            X.1lL[] r3 = X.C27621Sm.A08
            java.lang.Object[] r1 = r8.toArray(r3)
            X.1lL[] r1 = (X.C35081lL[]) r1
            java.lang.String r0 = "raw"
            X.1Vv r5 = new X.1Vv
            r5.<init>((java.lang.String) r0, (byte[]) r12, (X.C35081lL[]) r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0 = 64
            boolean r0 = r11.A10(r0)
            if (r0 == 0) goto L_0x0638
            java.lang.String r1 = "multicast"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r6)
            r2.add(r0)
        L_0x0638:
            r0 = 4
            boolean r0 = r11.A10(r0)
            if (r0 == 0) goto L_0x064a
            java.lang.String r1 = "url_number"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r6)
            r2.add(r0)
        L_0x064a:
            boolean r0 = r11.A10(r7)
            if (r0 == 0) goto L_0x065b
            java.lang.String r1 = "url_text"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r6)
            r2.add(r0)
        L_0x065b:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            boolean r0 = r11 instanceof X.C38871rY
            java.lang.String r7 = "pay"
            java.lang.String r12 = "receiver"
            java.lang.String r6 = "sender"
            if (r0 == 0) goto L_0x0703
            boolean r0 = r11 instanceof X.C38861rX
            if (r0 == 0) goto L_0x06fb
            java.lang.String r13 = "request-decline"
        L_0x0671:
            X.1lL r1 = new X.1lL
            r0 = r27
            r1.<init>((java.lang.String) r0, (java.lang.String) r13)
            r8.add(r1)
            com.whatsapp.jid.UserJid r13 = r11.A0C()
            X.0sK r0 = r10.A01
            r0.A0B()
            X.1ZT r11 = r0.A05
            if (r13 == 0) goto L_0x0694
            r1 = r12
            if (r29 == 0) goto L_0x068c
            r1 = r6
        L_0x068c:
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r13, (java.lang.String) r1)
            r8.add(r0)
        L_0x0694:
            if (r11 == 0) goto L_0x06a1
            if (r29 != 0) goto L_0x0699
            r12 = r6
        L_0x0699:
            X.1lL r1 = new X.1lL
            r1.<init>((com.whatsapp.jid.Jid) r11, (java.lang.String) r12)
        L_0x069e:
            r8.add(r1)
        L_0x06a1:
            java.lang.Object[] r1 = r8.toArray(r3)
            X.1lL[] r1 = (X.C35081lL[]) r1
            X.1Vv r0 = new X.1Vv
            r0.<init>(r7, r1)
            r2.add(r0)
        L_0x06af:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = r30
            java.lang.String r7 = r0.A01
            if (r7 == 0) goto L_0x06c5
            java.lang.String r6 = "tid"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r6, (java.lang.String) r7)
            r1.add(r0)
        L_0x06c5:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x06db
            java.lang.Object[] r6 = r1.toArray(r3)
            X.1lL[] r6 = (X.C35081lL[]) r6
            java.lang.String r1 = "hsm"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r6)
            r2.add(r0)
        L_0x06db:
            r2.add(r5)
            java.lang.Object[] r3 = r9.toArray(r3)
            X.1lL[] r3 = (X.C35081lL[]) r3
            r0 = 0
            X.1Vv[] r0 = new X.C28371Vv[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            X.1Vv[] r2 = (X.C28371Vv[]) r2
            java.lang.String r0 = "message"
            X.1Vv r1 = new X.1Vv
            r1.<init>((java.lang.String) r0, (X.C35081lL[]) r3, (X.C28371Vv[]) r2)
            r0 = r23
            r0.add(r1)
            goto L_0x0558
        L_0x06fb:
            boolean r0 = r11 instanceof X.C38881rZ
            if (r0 == 0) goto L_0x06af
            java.lang.String r13 = "request-cancel"
            goto L_0x0671
        L_0x0703:
            X.1Vt r13 = r11.A0L
            if (r13 == 0) goto L_0x06af
            int r1 = r13.A03
            r0 = 5
            if (r1 != r0) goto L_0x0746
            java.lang.String r13 = "futureproof"
        L_0x070e:
            X.1lL r1 = new X.1lL
            r0 = r27
            r1.<init>((java.lang.String) r0, (java.lang.String) r13)
            r8.add(r1)
            X.1Vt r11 = r11.A0L
            com.whatsapp.jid.UserJid r1 = r11.A0E
            if (r1 == 0) goto L_0x0726
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r6)
            r8.add(r0)
        L_0x0726:
            com.whatsapp.jid.UserJid r1 = r11.A0D
            if (r1 == 0) goto L_0x0732
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r12)
            r8.add(r0)
        L_0x0732:
            java.lang.String r6 = r11.A0K
            boolean r0 = X.AnonymousClass1W1.A09(r6)
            if (r0 == 0) goto L_0x06a1
            X.AnonymousClass00B.A06(r6)
            X.1lL r1 = new X.1lL
            r0 = r26
            r1.<init>((java.lang.String) r0, (java.lang.String) r6)
            goto L_0x069e
        L_0x0746:
            boolean r0 = r13.A0E()
            if (r0 == 0) goto L_0x074f
            java.lang.String r13 = "request"
            goto L_0x070e
        L_0x074f:
            X.1Vt r13 = r11.A0L
            monitor-enter(r13)
            int r14 = r13.A03     // Catch:{ all -> 0x0938 }
            r1 = 1
            r0 = 2
            if (r14 == r0) goto L_0x0766
            r0 = 200(0xc8, float:2.8E-43)
            if (r14 == r0) goto L_0x0766
            if (r14 == r1) goto L_0x0766
            r0 = 100
            if (r14 == r0) goto L_0x0766
            r0 = 3
            if (r14 == r0) goto L_0x0766
            r1 = 0
        L_0x0766:
            monitor-exit(r13)
            if (r1 == 0) goto L_0x06af
            java.lang.String r13 = "send"
            goto L_0x070e
        L_0x076d:
            boolean r0 = X.C41061vA.A0I(r11)
            if (r0 == 0) goto L_0x0776
            r12 = r6
            goto L_0x0612
        L_0x0776:
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r3)
            r8.add(r0)
            boolean r0 = X.C30921dB.A00(r28)
            if (r0 == 0) goto L_0x07bd
            r0 = r11
            X.1rl r0 = (X.C39001rl) r0
            int r3 = r0.AGz()
            java.lang.String r2 = "media_viewer"
            r0 = r19
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x07bd
            java.lang.String r2 = "deleted_reason"
            if (r3 != r1) goto L_0x07b7
            java.lang.String r1 = "view_once_opened"
        L_0x079c:
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r9.add(r0)
            r12 = r6
        L_0x07a5:
            java.lang.String r2 = X.C38621r6.A0H(r28)
            if (r2 == 0) goto L_0x0612
            java.lang.String r1 = "mediatype"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r8.add(r0)
            goto L_0x0612
        L_0x07b7:
            if (r3 != r7) goto L_0x07bd
            java.lang.String r1 = "view_once_expired"
            goto L_0x079c
        L_0x07bd:
            X.1iD r0 = X.C33211iD.A0o
            X.1Wr r5 = r0.A0U()
            X.1iE r5 = (X.C33221iE) r5
            X.1GC r3 = r10.A06
            X.0pd r13 = r10.A04
            X.0sK r12 = r10.A01
            com.whatsapp.wamsys.JniBridge r2 = r10.A07
            X.1WV r37 = X.C40491uD.A01(r11)
            X.0tz r1 = r10.A03
            r40 = 0
            X.21Q r0 = new X.21Q
            r41 = 1
            r42 = 1
            r32 = r0
            r33 = r12
            r34 = r1
            r35 = r13
            r36 = r5
            r38 = r2
            r39 = r6
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r3.A01(r11, r0)
            X.17V r1 = r10.A02
            X.0pd r0 = r1.A03
            boolean r0 = X.C38621r6.A0Z(r0, r11)
            if (r0 == 0) goto L_0x0923
            X.1sy r0 = r1.A01(r11)
            java.lang.String r12 = r1.A02(r0)
            X.2uY r0 = r5.A05()
            X.1Wr r3 = r0.A0U()
            X.3fM r3 = (X.C69633fM) r3
            X.1Wm r1 = r3.A00
            X.2uY r1 = (X.C59022uY) r1
            int r0 = r1.A01
            if (r0 != r7) goto L_0x08e8
            java.lang.Object r0 = r1.A04
            X.1Wm r0 = (X.C28541Wm) r0
        L_0x0817:
            X.1Wr r2 = r0.A0U()
            X.3fH r2 = (X.C69583fH) r2
            X.1Wm r0 = r2.A00
            X.2uZ r0 = (X.C59032uZ) r0
            java.lang.String r0 = r0.A04
            java.lang.String r1 = "<code>"
            java.lang.String r14 = r0.replace(r12, r1)
            r2.A03()
            X.1Wm r13 = r2.A00
            X.2uZ r13 = (X.C59032uZ) r13
            int r0 = r13.A00
            r0 = r0 | 32
            r13.A00 = r0
            r13.A04 = r14
            java.lang.String r0 = r13.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0859
            X.1Wm r0 = r2.A00
            X.2uZ r0 = (X.C59032uZ) r0
            java.lang.String r0 = r0.A05
            java.lang.String r14 = r0.replace(r12, r1)
            r2.A03()
            X.1Wm r13 = r2.A00
            X.2uZ r13 = (X.C59032uZ) r13
            int r0 = r13.A00
            r0 = r0 | 64
            r13.A00 = r0
            r13.A05 = r14
        L_0x0859:
            X.1Wm r0 = r2.A00
            X.2uZ r0 = (X.C59032uZ) r0
            X.1XE r0 = r0.A02
            java.util.List r13 = java.util.Collections.unmodifiableList(r0)
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            if (r13 == 0) goto L_0x08fc
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x08fc
            java.util.Iterator r17 = r13.iterator()
        L_0x0874:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x08ec
            java.lang.Object r0 = r17.next()
            X.1Wm r0 = (X.C28541Wm) r0
            X.1Wr r16 = r0.A0U()
            r0 = r16
            X.1Wm r15 = r0.A00
            X.2tg r15 = (X.C58552tg) r15
            int r14 = r15.A01
            if (r14 == 0) goto L_0x08e5
            r0 = 1
            if (r14 == r0) goto L_0x08e2
            if (r14 == r7) goto L_0x08df
            r0 = 3
            if (r14 == r0) goto L_0x08dc
            r13 = 0
        L_0x0897:
            X.42b r0 = X.C799742b.A04
            if (r13 != r0) goto L_0x08cf
            if (r14 != r7) goto L_0x08d9
            java.lang.Object r0 = r15.A03
            X.1Wm r0 = (X.C28541Wm) r0
        L_0x08a1:
            X.1Wr r14 = r0.A0U()
            X.1Wm r0 = r14.A00
            X.2tN r0 = (X.C58362tN) r0
            java.lang.String r0 = r0.A02
            java.lang.String r15 = r0.replace(r12, r1)
            r14.A03()
            X.1Wm r13 = r14.A00
            X.2tN r13 = (X.C58362tN) r13
            int r0 = r13.A00
            r0 = r0 | 2
            r13.A00 = r0
            r13.A02 = r15
            X.1Wm r13 = r14.A02()
            r16.A03()
            r0 = r16
            X.1Wm r0 = r0.A00
            X.2tg r0 = (X.C58552tg) r0
            r0.A03 = r13
            r0.A01 = r7
        L_0x08cf:
            X.1Wm r13 = r16.A02()
            r0 = r18
            r0.add(r13)
            goto L_0x0874
        L_0x08d9:
            X.2tN r0 = X.C58362tN.A03
            goto L_0x08a1
        L_0x08dc:
            X.42b r13 = X.C799742b.A01
            goto L_0x0897
        L_0x08df:
            X.42b r13 = X.C799742b.A04
            goto L_0x0897
        L_0x08e2:
            X.42b r13 = X.C799742b.A03
            goto L_0x0897
        L_0x08e5:
            X.42b r13 = X.C799742b.A02
            goto L_0x0897
        L_0x08e8:
            X.2uZ r0 = X.C59032uZ.A07
            goto L_0x0817
        L_0x08ec:
            r2.A03()
            X.1Wm r13 = r2.A00
            X.2uZ r13 = (X.C59032uZ) r13
            X.2NE r0 = X.AnonymousClass2NE.A01
            r13.A02 = r0
            r0 = r18
            r2.A05(r0)
        L_0x08fc:
            X.1Wm r13 = r2.A00
            X.2uZ r13 = (X.C59032uZ) r13
            int r0 = r13.A01
            if (r0 != r7) goto L_0x092d
            java.lang.Object r13 = r13.A03
            java.lang.String r13 = (java.lang.String) r13
        L_0x0908:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x091d
            java.lang.String r1 = r13.replace(r12, r1)
            r2.A03()
            X.1Wm r0 = r2.A00
            X.2uZ r0 = (X.C59032uZ) r0
            r0.A01 = r7
            r0.A03 = r1
        L_0x091d:
            r3.A05(r2)
            r5.A0D(r3)
        L_0x0923:
            X.1Wm r0 = r5.A02()
            byte[] r12 = r0.A02()
            goto L_0x07a5
        L_0x092d:
            java.lang.String r13 = ""
            goto L_0x0908
        L_0x0930:
            java.lang.String r3 = "media"
            goto L_0x05a3
        L_0x0934:
            java.lang.String r3 = "from"
            goto L_0x058d
        L_0x0938:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x093b:
            if (r4 == 0) goto L_0x099a
            java.util.Iterator r5 = r4.iterator()
        L_0x0941:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x099a
            java.lang.Object r4 = r5.next()
            X.1py r4 = (X.C37931py) r4
            if (r4 == 0) goto L_0x0941
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            long r0 = r4.A00
            java.lang.String r2 = java.lang.Long.toString(r0)
            java.lang.String r1 = "t"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r3.add(r0)
            java.lang.String r2 = r4.A01
            java.lang.String r1 = "threadtype"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r3.add(r0)
            boolean r0 = r4.A02
            java.lang.String r2 = "is_read"
            if (r0 == 0) goto L_0x0997
            java.lang.String r1 = "1"
        L_0x097a:
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r3.add(r0)
            X.1lL[] r0 = X.C27621Sm.A08
            java.lang.Object[] r2 = r3.toArray(r0)
            X.1lL[] r2 = (X.C35081lL[]) r2
            java.lang.String r0 = "interaction"
            X.1Vv r1 = new X.1Vv
            r1.<init>(r0, r2)
            r0 = r23
            r0.add(r1)
            goto L_0x0941
        L_0x0997:
            java.lang.String r1 = "0"
            goto L_0x097a
        L_0x099a:
            boolean r0 = r23.isEmpty()
            r6 = 1
            if (r0 == 0) goto L_0x09be
            java.lang.String r1 = "1_1_spam_banner_report"
            r0 = r19
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x09b5
            java.lang.String r1 = "1_1_old_spam_banner_block"
            r0 = r19
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x09be
        L_0x09b5:
            X.0so r2 = r10.A00
            java.lang.String r1 = "SpamXmppMethods/noMessagesFromSusBanner"
            r0 = r19
            r2.AcB(r1, r0, r6)
        L_0x09be:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r2 = "jid"
            X.1lL r1 = new X.1lL
            r0 = r21
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r2)
            r3.add(r1)
            if (r22 == 0) goto L_0x09de
            java.lang.String r2 = "source"
            X.1lL r1 = new X.1lL
            r0 = r22
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r2)
            r3.add(r1)
        L_0x09de:
            if (r20 == 0) goto L_0x09ed
            java.lang.String r2 = "subject"
            X.1lL r1 = new X.1lL
            r0 = r20
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r3.add(r1)
        L_0x09ed:
            if (r48 == 0) goto L_0x09fc
            java.lang.String r2 = "spam_flow"
            X.1lL r1 = new X.1lL
            r0 = r19
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r3.add(r1)
        L_0x09fc:
            r0 = 4
            X.1lL[] r4 = new X.C35081lL[r0]
            X.1ks r2 = X.C34791ks.A00
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)
            r5 = 0
            r4[r5] = r0
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "spam"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r4[r6] = r0
            r6 = 2
            java.lang.String r2 = "type"
            java.lang.String r1 = "set"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r4[r6] = r0
            r6 = 3
            java.lang.String r2 = "id"
            X.1lL r1 = new X.1lL
            r0 = r25
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r4[r6] = r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            if (r24 == 0) goto L_0x0a7a
            r0 = r24
            java.lang.String r2 = r0.A03
            java.lang.String r1 = "business_discovery_entry_point"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r7.add(r0)
            r0 = r24
            long r1 = r0.A00
            java.lang.String r6 = "business_discovery_timestamp"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r6, (long) r1)
            r7.add(r0)
            r0 = r24
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x0a66
            java.lang.String r1 = "business_discovery_id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r7.add(r0)
        L_0x0a66:
            X.1lL[] r0 = X.C27621Sm.A08
            java.lang.Object[] r2 = r7.toArray(r0)
            X.1lL[] r2 = (X.C35081lL[]) r2
            java.lang.String r0 = "biz_opt_out"
            X.1Vv r1 = new X.1Vv
            r1.<init>(r0, r2)
            r0 = r23
            r0.add(r1)
        L_0x0a7a:
            X.1lL[] r0 = X.C27621Sm.A08
            java.lang.Object[] r3 = r3.toArray(r0)
            X.1lL[] r3 = (X.C35081lL[]) r3
            X.1Vv[] r1 = new X.C28371Vv[r5]
            r0 = r23
            java.lang.Object[] r2 = r0.toArray(r1)
            X.1Vv[] r2 = (X.C28371Vv[]) r2
            java.lang.String r0 = "spam_list"
            X.1Vv r1 = new X.1Vv
            r1.<init>((java.lang.String) r0, (X.C35081lL[]) r3, (X.C28371Vv[]) r2)
            java.lang.String r0 = "iq"
            X.1Vv r2 = new X.1Vv
            r2.<init>((X.C28371Vv) r1, (java.lang.String) r0, (X.C35081lL[]) r4)
            r1 = 98
            r0 = r43
            r0.A0D(r2, r1)
        L_0x0aa2:
            r1 = 1
            r0 = r45
            r0.A0f = r1
            r0 = r44
            X.0sG r3 = r0.A04
            r0 = r45
            r0.A0f = r1
            X.18c r2 = r3.A06
            X.1Zf r5 = new X.1Zf
            r5.<init>((boolean) r1)
            r5.A03()
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>(r1)
            boolean r0 = r0.A0f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_spam_reported"
            r4.put(r0, r1)
            r0 = r45
            X.0rv r0 = r0.A0E
            r2.A0D(r4, r0)
            java.lang.String r0 = "updated is reported spam for jid="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = r45
            X.0rv r0 = r0.A0E
            r2.append(r0)
            r0 = 32
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = " | time: "
            r2.append(r0)
            long r0 = r5.A00()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1kv r1 = r3.A04
            r0 = r45
            r1.A00(r0)
            return
        L_0x0b02:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25931Lr.A01(X.0sH, java.lang.String, java.util.List):void");
    }

    public boolean A02(Context context) {
        if (this.A03.A0A()) {
            return true;
        }
        Log.w("spamreportmanager/spam/report/no-network-cannot-block-report");
        boolean A022 = C18260wP.A02(context);
        int i2 = R.string.str0dfb;
        if (A022) {
            i2 = R.string.str0dfc;
        }
        this.A00.A09(i2, 0);
        return false;
    }
}
