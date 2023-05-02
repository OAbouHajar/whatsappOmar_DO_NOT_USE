package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0sO  reason: invalid class name and case insensitive filesystem */
public class C16070sO {
    public final C14870pt A00;
    public final C16040sK A01;
    public final C16000sG A02;
    public final C15810rt A03;
    public final AnonymousClass18S A04;
    public final AnonymousClass11J A05;
    public final C16900tq A06;
    public final C17310us A07;
    public final AnonymousClass192 A08;
    public final C17580vJ A09;
    public final C14710pd A0A;
    public final AnonymousClass18R A0B;

    public C16070sO(C14870pt r1, C16040sK r2, C16000sG r3, C15810rt r4, AnonymousClass18S r5, AnonymousClass11J r6, C16900tq r7, C17310us r8, AnonymousClass192 r9, C17580vJ r10, C14710pd r11, AnonymousClass18R r12) {
        this.A0A = r11;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A09 = r10;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A08 = r9;
        this.A0B = r12;
        this.A04 = r5;
    }

    public static C30361cE A00(C16070sO r0, C16060sN r1) {
        return r0.A07.A04(r1);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0078 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.C16060sN r7) {
        /*
            r6 = this;
            X.0us r2 = r6.A07
            java.lang.String r1 = "participant-user-store/getGroupParticipantsCount/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11J r0 = r2.A07
            java.util.concurrent.ConcurrentHashMap r0 = r0.A03
            boolean r1 = r0.containsKey(r7)
            java.lang.Object r0 = r0.get(r7)
            X.1cE r0 = (X.C30361cE) r0
            if (r1 == 0) goto L_0x002c
            X.0uz r0 = r0.A04()
            int r0 = r0.size()
            return r0
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.util.Map r0 = r0.A04
            int r0 = r0.size()
            return r0
        L_0x0035:
            X.14v r0 = r2.A08
            long r0 = r0.A01(r7)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            X.0tq r0 = r2.A09
            X.0tf r4 = r0.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "SELECT COUNT(1) as count FROM group_participant_user WHERE group_jid_row_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0079 }
            r0 = 0
            r1[r0] = r5     // Catch:{ all -> 0x0079 }
            android.database.Cursor r1 = r3.A08(r2, r1)     // Catch:{ all -> 0x0079 }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = "count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0072 }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0072 }
            r1.close()     // Catch:{ all -> 0x0079 }
            r4.close()
            return r0
        L_0x006a:
            r1.close()     // Catch:{ all -> 0x0079 }
            r4.close()
            r0 = 0
            return r0
        L_0x0072:
            r0 = move-exception
            if (r1 == 0) goto L_0x0078
            r1.close()     // Catch:{ all -> 0x0078 }
        L_0x0078:
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x007d }
        L_0x007d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16070sO.A01(X.0sN):int");
    }

    public Set A02(C15830rv r3) {
        if (!(r3 instanceof C16060sN)) {
            return new HashSet();
        }
        C30361cE A042 = this.A07.A04((C16060sN) r3);
        return A042.A05 ? A042.A0D() : A042.A0E();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00b8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A03(java.util.Set r13) {
        /*
            r12 = this;
            X.0us r5 = r12.A07
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x00c2
            X.0tq r0 = r5.A09
            X.0tf r3 = r0.get()
            r0 = 0
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r0]     // Catch:{ all -> 0x00bd }
            java.lang.Object[] r1 = r13.toArray(r0)     // Catch:{ all -> 0x00bd }
            com.whatsapp.jid.DeviceJid[] r1 = (com.whatsapp.jid.DeviceJid[]) r1     // Catch:{ all -> 0x00bd }
            r0 = 975(0x3cf, float:1.366E-42)
            X.1jh r6 = new X.1jh     // Catch:{ all -> 0x00bd }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x00bd }
        L_0x0023:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r11 = r6.next()     // Catch:{ all -> 0x00bd }
            com.whatsapp.jid.DeviceJid[] r11 = (com.whatsapp.jid.DeviceJid[]) r11     // Catch:{ all -> 0x00bd }
            X.0tg r10 = r3.A02     // Catch:{ all -> 0x00bd }
            int r9 = r11.length     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "SELECT DISTINCT(group_jid_row_id) FROM group_participant_user AS user JOIN group_participant_device AS device ON  user._id =  device.group_participant_row_id WHERE "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r1.<init>(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "device_jid_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = X.C34111ji.A00(r9)     // Catch:{ all -> 0x00bd }
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = " AND "
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "sent_sender_key = 1"
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x00bd }
            java.lang.String[] r7 = new java.lang.String[r9]     // Catch:{ all -> 0x00bd }
            r2 = 0
        L_0x0057:
            if (r2 >= r9) goto L_0x006a
            X.14v r1 = r5.A08     // Catch:{ all -> 0x00bd }
            r0 = r11[r2]     // Catch:{ all -> 0x00bd }
            long r0 = r1.A01(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00bd }
            r7[r2] = r0     // Catch:{ all -> 0x00bd }
            int r2 = r2 + 1
            goto L_0x0057
        L_0x006a:
            android.database.Cursor r2 = r10.A08(r8, r7)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "group_jid_row_id"
            int r8 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b2 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x00b2 }
            r7.<init>()     // Catch:{ all -> 0x00b2 }
        L_0x0079:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x008b
            long r0 = r2.getLong(r8)     // Catch:{ all -> 0x00b2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00b2 }
            r7.add(r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x0079
        L_0x008b:
            X.14v r1 = r5.A08     // Catch:{ all -> 0x00b2 }
            java.lang.Class<X.0sN> r0 = X.C16060sN.class
            java.util.Map r0 = r1.A09(r0, r7)     // Catch:{ all -> 0x00b2 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00b2 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00b2 }
        L_0x009b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00b2 }
            X.0sN r0 = (X.C16060sN) r0     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x009b
            r4.add(r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x009b
        L_0x00ad:
            r2.close()     // Catch:{ all -> 0x00bd }
            goto L_0x0023
        L_0x00b2:
            r0 = move-exception
            if (r2 == 0) goto L_0x00b8
            r2.close()     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00b9:
            r3.close()
            return r4
        L_0x00bd:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            throw r0
        L_0x00c2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16070sO.A03(java.util.Set):java.util.Set");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C30361cE r4) {
        /*
            r3 = this;
            X.0tq r0 = r3.A06
            X.0tf r2 = r0.A02()
            X.1cj r1 = r2.A00()     // Catch:{ all -> 0x001e }
            X.0us r0 = r3.A07     // Catch:{ all -> 0x0019 }
            r0.A09(r4)     // Catch:{ all -> 0x0019 }
            r1.A00()     // Catch:{ all -> 0x0019 }
            r1.close()     // Catch:{ all -> 0x001e }
            r2.close()
            return
        L_0x0019:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x001d }
        L_0x001d:
            throw r0     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0022 }
        L_0x0022:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16070sO.A04(X.1cE):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00df */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00e9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C30361cE r25, long r26) {
        /*
            r24 = this;
            r7 = r24
            X.0tq r0 = r7.A06
            X.0tf r17 = r0.A02()
            X.1cj r16 = r17.A00()     // Catch:{ all -> 0x00ea }
            X.0us r8 = r7.A07     // Catch:{ all -> 0x00e5 }
            java.lang.String r6 = "group_participant_user"
            java.lang.String r1 = "participant-user-store/saveGroupParticipants/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e5 }
            r11 = r25
            r0.append(r11)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e5 }
            boolean r10 = r11.A05     // Catch:{ all -> 0x00e5 }
            X.14v r0 = r8.A08     // Catch:{ all -> 0x00e5 }
            X.0sN r5 = r11.A06     // Catch:{ all -> 0x00e5 }
            long r14 = r0.A01(r5)     // Catch:{ all -> 0x00e5 }
            X.0tq r0 = r8.A09     // Catch:{ all -> 0x00e5 }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x00e5 }
            X.1cj r13 = r4.A00()     // Catch:{ all -> 0x00e0 }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x00db }
            java.lang.String r9 = "group_jid_row_id=?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00db }
            java.lang.String r1 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x00db }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x00db }
            r3.A01(r6, r9, r2)     // Catch:{ all -> 0x00db }
            if (r10 == 0) goto L_0x0055
            java.util.Map r0 = r11.A03     // Catch:{ all -> 0x00db }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00db }
            X.0uz r0 = X.C17380uz.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x00db }
            goto L_0x0059
        L_0x0055:
            X.0uz r0 = r11.A04()     // Catch:{ all -> 0x00db }
        L_0x0059:
            X.1Ub r12 = r0.iterator()     // Catch:{ all -> 0x00db }
        L_0x005d:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x00db }
            X.1ck r10 = (X.C30661ck) r10     // Catch:{ all -> 0x00db }
            com.whatsapp.jid.UserJid r2 = r10.A03     // Catch:{ all -> 0x00db }
            long r22 = r8.A02(r2)     // Catch:{ all -> 0x00db }
            r0 = 4
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x00db }
            r11.<init>(r0)     // Catch:{ all -> 0x00db }
            java.lang.String r1 = "group_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x00db }
            r11.put(r1, r0)     // Catch:{ all -> 0x00db }
            java.lang.String r1 = "user_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x00db }
            r11.put(r1, r0)     // Catch:{ all -> 0x00db }
            java.lang.String r1 = "rank"
            int r0 = r10.A01     // Catch:{ all -> 0x00db }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00db }
            r11.put(r1, r0)     // Catch:{ all -> 0x00db }
            java.lang.String r9 = "pending"
            boolean r1 = r10.A02     // Catch:{ all -> 0x00db }
            r0 = 0
            if (r1 == 0) goto L_0x009b
            r0 = 1
        L_0x009b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00db }
            r11.put(r9, r0)     // Catch:{ all -> 0x00db }
            r3.A02(r11, r6)     // Catch:{ all -> 0x00db }
            X.193 r1 = r8.A0A     // Catch:{ all -> 0x00db }
            java.util.concurrent.ConcurrentHashMap r0 = r10.A04     // Catch:{ all -> 0x00db }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00db }
            X.0uz r19 = X.C17380uz.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x00db }
            r18 = r1
            r20 = r5
            r21 = r2
            r18.A00(r19, r20, r21, r22)     // Catch:{ all -> 0x00db }
            goto L_0x005d
        L_0x00bb:
            r13.A00()     // Catch:{ all -> 0x00db }
            r13.close()     // Catch:{ all -> 0x00e0 }
            r4.close()     // Catch:{ all -> 0x00e5 }
            boolean r0 = r5 instanceof X.C16050sL     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00d1
            X.18S r0 = r7.A04     // Catch:{ all -> 0x00e5 }
            X.0sL r5 = (X.C16050sL) r5     // Catch:{ all -> 0x00e5 }
            r1 = r26
            r0.A01(r5, r1)     // Catch:{ all -> 0x00e5 }
        L_0x00d1:
            r16.A00()     // Catch:{ all -> 0x00e5 }
            r16.close()     // Catch:{ all -> 0x00ea }
            r17.close()
            return
        L_0x00db:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x00df }
        L_0x00df:
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            throw r0     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x00ee }
        L_0x00ee:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16070sO.A05(X.1cE, long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0070 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0075 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C16060sN r8, java.lang.Long r9, java.util.List r10) {
        /*
            r7 = this;
            X.0tq r0 = r7.A06
            X.0tf r6 = r0.A02()
            X.1cj r5 = r6.A00()     // Catch:{ all -> 0x0076 }
            X.0us r4 = r7.A07     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "participant-user-store/updateGroupParticipants/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r1.<init>(r0)     // Catch:{ all -> 0x0071 }
            r1.append(r8)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ all -> 0x0071 }
            r1.append(r10)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0071 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0071 }
            X.0tq r0 = r4.A09     // Catch:{ all -> 0x0071 }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x0071 }
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x006c }
            java.util.Iterator r1 = r10.iterator()     // Catch:{ all -> 0x0067 }
        L_0x0033:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0067 }
            X.1ck r0 = (X.C30661ck) r0     // Catch:{ all -> 0x0067 }
            r4.A08(r0, r8)     // Catch:{ all -> 0x0067 }
            goto L_0x0033
        L_0x0043:
            r2.A00()     // Catch:{ all -> 0x0067 }
            r2.close()     // Catch:{ all -> 0x006c }
            r3.close()     // Catch:{ all -> 0x0071 }
            if (r9 == 0) goto L_0x005d
            boolean r0 = r8 instanceof X.C16050sL     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x005d
            X.18S r2 = r7.A04     // Catch:{ all -> 0x0071 }
            X.0sL r8 = (X.C16050sL) r8     // Catch:{ all -> 0x0071 }
            long r0 = r9.longValue()     // Catch:{ all -> 0x0071 }
            r2.A01(r8, r0)     // Catch:{ all -> 0x0071 }
        L_0x005d:
            r5.A00()     // Catch:{ all -> 0x0071 }
            r5.close()     // Catch:{ all -> 0x0076 }
            r6.close()
            return
        L_0x0067:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x006b }
        L_0x006b:
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0070 }
        L_0x0070:
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0075 }
        L_0x0075:
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x007a }
        L_0x007a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16070sO.A06(X.0sN, java.lang.Long, java.util.List):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(com.whatsapp.jid.UserJid r8, java.util.List r9) {
        /*
            r7 = this;
            X.0tq r0 = r7.A06
            X.0tf r6 = r0.A02()
            X.1cj r5 = r6.A00()     // Catch:{ all -> 0x0065 }
            X.0us r4 = r7.A07     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "participant-user-store/removeParticipantFromGroups/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r1.<init>(r0)     // Catch:{ all -> 0x0060 }
            r1.append(r9)     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ all -> 0x0060 }
            r1.append(r8)     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0060 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0060 }
            X.0tq r0 = r4.A09     // Catch:{ all -> 0x0060 }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x0060 }
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x005b }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x0056 }
        L_0x0033:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0056 }
            X.0sN r0 = (X.C16060sN) r0     // Catch:{ all -> 0x0056 }
            r4.A0G(r0, r8)     // Catch:{ all -> 0x0056 }
            goto L_0x0033
        L_0x0043:
            r2.A00()     // Catch:{ all -> 0x0056 }
            r2.close()     // Catch:{ all -> 0x005b }
            r3.close()     // Catch:{ all -> 0x0060 }
            r5.A00()     // Catch:{ all -> 0x0060 }
            r5.close()     // Catch:{ all -> 0x0065 }
            r6.close()
            return
        L_0x0056:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005f }
        L_0x005f:
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0069 }
        L_0x0069:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16070sO.A07(com.whatsapp.jid.UserJid, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0276, code lost:
        if (r3.A01.A0I(r8) != false) goto L_0x0278;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0186 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x0214 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x0219 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:192:0x02cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x0148 */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AnonymousClass1WU r23) {
        /*
            r22 = this;
            r7 = r23
            X.1Vw r1 = r7.A11
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x02d1
            X.0rv r4 = r1.A00
            boolean r0 = r4 instanceof X.C16060sN
            if (r0 == 0) goto L_0x02d1
            X.0sN r4 = (X.C16060sN) r4
            X.AnonymousClass00B.A06(r4)
            r3 = r22
            X.0tq r0 = r3.A06
            X.0tf r15 = r0.A02()
            X.1cj r14 = r15.A00()     // Catch:{ all -> 0x02cc }
            boolean r1 = r7 instanceof X.C39291sE     // Catch:{ all -> 0x02c7 }
            if (r1 == 0) goto L_0x002d
            r0 = r7
            X.1sE r0 = (X.C39291sE) r0     // Catch:{ all -> 0x02c7 }
            java.util.List r8 = r0.A01     // Catch:{ all -> 0x02c7 }
        L_0x0028:
            boolean r5 = r4 instanceof X.C16050sL     // Catch:{ all -> 0x02c7 }
            if (r5 == 0) goto L_0x004e
            goto L_0x002f
        L_0x002d:
            r8 = 0
            goto L_0x0028
        L_0x002f:
            if (r1 != 0) goto L_0x003b
            boolean r0 = r7 instanceof X.AnonymousClass1WT     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x004e
            r0 = r7
            X.1WT r0 = (X.AnonymousClass1WT) r0     // Catch:{ all -> 0x02c7 }
            long r0 = r0.A02     // Catch:{ all -> 0x02c7 }
            goto L_0x0040
        L_0x003b:
            r0 = r7
            X.1sE r0 = (X.C39291sE) r0     // Catch:{ all -> 0x02c7 }
            long r0 = r0.A03     // Catch:{ all -> 0x02c7 }
        L_0x0040:
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x004e
            X.18S r6 = r3.A04     // Catch:{ all -> 0x02c7 }
            r2 = r4
            X.0sL r2 = (X.C16050sL) r2     // Catch:{ all -> 0x02c7 }
            r6.A01(r2, r0)     // Catch:{ all -> 0x02c7 }
        L_0x004e:
            int r2 = r7.A00     // Catch:{ all -> 0x02c7 }
            r0 = 2
            if (r2 == r0) goto L_0x027c
            r0 = 3
            if (r2 == r0) goto L_0x027c
            r0 = 4
            if (r2 == r0) goto L_0x0249
            r0 = 5
            if (r2 == r0) goto L_0x021a
            r0 = 7
            if (r2 == r0) goto L_0x021a
            r0 = 20
            if (r2 == r0) goto L_0x01b2
            r0 = 52
            if (r2 == r0) goto L_0x01b2
            r0 = 79
            if (r2 == r0) goto L_0x01b2
            r0 = 90
            if (r2 == r0) goto L_0x01b2
            r0 = 106(0x6a, float:1.49E-43)
            if (r2 == r0) goto L_0x01b2
            r0 = 9
            if (r2 == r0) goto L_0x018d
            r0 = 10
            if (r2 == r0) goto L_0x014f
            r0 = 93
            if (r2 == r0) goto L_0x01b2
            r0 = 94
            if (r2 == r0) goto L_0x01b2
            switch(r2) {
                case 12: goto L_0x01b2;
                case 13: goto L_0x0088;
                case 14: goto L_0x0088;
                case 15: goto L_0x027c;
                case 16: goto L_0x027c;
                case 17: goto L_0x00e2;
                default: goto L_0x0086;
            }     // Catch:{ all -> 0x02c7 }
        L_0x0086:
            goto L_0x028a
        L_0x0088:
            X.0us r0 = r3.A07     // Catch:{ all -> 0x02c7 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x02c7 }
            r0.A0D(r4, r8)     // Catch:{ all -> 0x02c7 }
            X.192 r11 = r3.A08     // Catch:{ all -> 0x02c7 }
            X.0pd r6 = r11.A02     // Catch:{ all -> 0x02c7 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x02c7 }
            boolean r0 = r6.A0E(r0, r1)     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x028a
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x02c7 }
            r0 = 13
            r21 = 0
            if (r2 != r0) goto L_0x00a9
            r21 = 1
        L_0x00a9:
            long r0 = r7.A0I     // Catch:{ all -> 0x02c7 }
            X.0tq r6 = r11.A01     // Catch:{ all -> 0x02c7 }
            X.0tf r10 = r6.A02()     // Catch:{ all -> 0x02c7 }
            X.1cj r9 = r10.A00()     // Catch:{ all -> 0x0215 }
            java.util.Iterator r7 = r8.iterator()     // Catch:{ all -> 0x00dc }
        L_0x00b9:
            boolean r6 = r7.hasNext()     // Catch:{ all -> 0x00dc }
            if (r6 == 0) goto L_0x00d1
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x00dc }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ all -> 0x00dc }
            r17 = r4
            r18 = r6
            r19 = r0
            r16 = r11
            r16.A04(r17, r18, r19, r21)     // Catch:{ all -> 0x00dc }
            goto L_0x00b9
        L_0x00d1:
            r9.A00()     // Catch:{ all -> 0x00dc }
            r9.close()     // Catch:{ all -> 0x0215 }
            r10.close()     // Catch:{ all -> 0x02c7 }
            goto L_0x028a
        L_0x00dc:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0214 }
            goto L_0x0214
        L_0x00e2:
            X.0us r11 = r3.A07     // Catch:{ all -> 0x02c7 }
            X.14v r0 = r11.A08     // Catch:{ all -> 0x02c7 }
            long r0 = r0.A01(r4)     // Catch:{ all -> 0x02c7 }
            java.lang.String r10 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02c7 }
            r0 = 3
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x02c7 }
            r9.<init>(r0)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = "group_jid_row_id"
            r9.put(r0, r10)     // Catch:{ all -> 0x02c7 }
            r13 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = "rank"
            r9.put(r0, r1)     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = "pending"
            r9.put(r0, r1)     // Catch:{ all -> 0x02c7 }
            X.0tq r0 = r11.A09     // Catch:{ all -> 0x02c7 }
            X.0tf r8 = r0.A02()     // Catch:{ all -> 0x02c7 }
            X.1cj r12 = r8.A00()     // Catch:{ all -> 0x0149 }
            X.0sK r1 = r11.A01     // Catch:{ all -> 0x0144 }
            X.1ZX r0 = r1.A03()     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x0121
            X.1ZX r0 = r1.A03()     // Catch:{ all -> 0x0144 }
            r11.A0G(r4, r0)     // Catch:{ all -> 0x0144 }
        L_0x0121:
            r1.A0B()     // Catch:{ all -> 0x0144 }
            X.1ZT r0 = r1.A05     // Catch:{ all -> 0x0144 }
            r11.A0G(r4, r0)     // Catch:{ all -> 0x0144 }
            X.0tg r7 = r8.A02     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = "group_participant_user"
            java.lang.String r1 = "group_jid_row_id = ?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0144 }
            r0[r13] = r10     // Catch:{ all -> 0x0144 }
            r7.A00(r6, r9, r1, r0)     // Catch:{ all -> 0x0144 }
            X.193 r0 = r11.A0A     // Catch:{ all -> 0x0144 }
            r0.A02(r4)     // Catch:{ all -> 0x0144 }
            r12.A00()     // Catch:{ all -> 0x0144 }
            r12.close()     // Catch:{ all -> 0x0149 }
            goto L_0x0287
        L_0x0144:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0148 }
        L_0x0148:
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0219 }
            goto L_0x0219
        L_0x014f:
            X.1WT r7 = (X.AnonymousClass1WT) r7     // Catch:{ all -> 0x02c7 }
            X.0us r9 = r3.A07     // Catch:{ all -> 0x02c7 }
            com.whatsapp.jid.UserJid r1 = r7.A00     // Catch:{ all -> 0x02c7 }
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x02c7 }
            com.whatsapp.jid.UserJid r8 = r7.A01     // Catch:{ all -> 0x02c7 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x02c7 }
            X.1cE r0 = r9.A04(r4)     // Catch:{ all -> 0x02c7 }
            X.1ck r7 = r0.A05(r1)     // Catch:{ all -> 0x02c7 }
            X.0tq r0 = r9.A09     // Catch:{ all -> 0x02c7 }
            X.0tf r6 = r0.A02()     // Catch:{ all -> 0x02c7 }
            X.1cj r1 = r6.A00()     // Catch:{ all -> 0x0187 }
            r9.A0G(r4, r8)     // Catch:{ all -> 0x0182 }
            if (r7 == 0) goto L_0x0177
            r9.A08(r7, r4)     // Catch:{ all -> 0x0182 }
        L_0x0177:
            r1.A00()     // Catch:{ all -> 0x0182 }
            r1.close()     // Catch:{ all -> 0x0187 }
            r6.close()     // Catch:{ all -> 0x02c7 }
            goto L_0x028a
        L_0x0182:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0186 }
        L_0x0186:
            throw r0     // Catch:{ all -> 0x0187 }
        L_0x0187:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0219 }
            goto L_0x0219
        L_0x018d:
            X.0sK r0 = r3.A01     // Catch:{ all -> 0x02c7 }
            r0.A0B()     // Catch:{ all -> 0x02c7 }
            X.1ZT r1 = r0.A05     // Catch:{ all -> 0x02c7 }
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x02c7 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x02c7 }
            r6 = r8
            boolean r0 = r8.contains(r1)     // Catch:{ all -> 0x02c7 }
            if (r0 != 0) goto L_0x01a9
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x02c7 }
            r6.<init>(r8)     // Catch:{ all -> 0x02c7 }
            r6.add(r1)     // Catch:{ all -> 0x02c7 }
        L_0x01a9:
            X.0us r1 = r3.A07     // Catch:{ all -> 0x02c7 }
            X.0rt r0 = r3.A03     // Catch:{ all -> 0x02c7 }
            r1.A0C(r0, r4, r6)     // Catch:{ all -> 0x02c7 }
            goto L_0x028a
        L_0x01b2:
            X.0us r1 = r3.A07     // Catch:{ all -> 0x02c7 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x02c7 }
            X.0rt r0 = r3.A03     // Catch:{ all -> 0x02c7 }
            r1.A0C(r0, r4, r8)     // Catch:{ all -> 0x02c7 }
            X.192 r7 = r3.A08     // Catch:{ all -> 0x02c7 }
            X.0pd r6 = r7.A02     // Catch:{ all -> 0x02c7 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x02c7 }
            boolean r0 = r6.A0E(r0, r1)     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x028a
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x02c7 }
            X.0tq r0 = r7.A01     // Catch:{ all -> 0x02c7 }
            X.0tf r10 = r0.A02()     // Catch:{ all -> 0x02c7 }
            X.1cj r6 = r10.A00()     // Catch:{ all -> 0x0215 }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x0210 }
        L_0x01db:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0210 }
            if (r0 == 0) goto L_0x01eb
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0210 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0210 }
            r7.A03(r4, r0)     // Catch:{ all -> 0x0210 }
            goto L_0x01db
        L_0x01eb:
            r6.A00()     // Catch:{ all -> 0x0210 }
            r6.close()     // Catch:{ all -> 0x0215 }
            r10.close()     // Catch:{ all -> 0x02c7 }
            X.0sK r0 = r3.A01     // Catch:{ all -> 0x02c7 }
            X.1sm r6 = new X.1sm     // Catch:{ all -> 0x02c7 }
            r6.<init>(r0)     // Catch:{ all -> 0x02c7 }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x02c7 }
        L_0x01ff:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x028a
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x02c7 }
            boolean r0 = r6.test(r0)     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x01ff
            goto L_0x0278
        L_0x0210:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0214 }
        L_0x0214:
            throw r0     // Catch:{ all -> 0x0215 }
        L_0x0215:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0219 }
        L_0x0219:
            throw r0     // Catch:{ all -> 0x02c7 }
        L_0x021a:
            X.0rv r0 = r7.A0B()     // Catch:{ all -> 0x02c7 }
            com.whatsapp.jid.UserJid r10 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x02c7 }
            X.AnonymousClass00B.A06(r10)     // Catch:{ all -> 0x02c7 }
            X.0us r1 = r3.A07     // Catch:{ all -> 0x02c7 }
            java.util.List r0 = java.util.Collections.singletonList(r10)     // Catch:{ all -> 0x02c7 }
            r1.A0D(r4, r0)     // Catch:{ all -> 0x02c7 }
            X.192 r8 = r3.A08     // Catch:{ all -> 0x02c7 }
            X.0pd r6 = r8.A02     // Catch:{ all -> 0x02c7 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x02c7 }
            boolean r0 = r6.A0E(r0, r1)     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x028a
            r0 = 5
            r13 = 1
            if (r2 == r0) goto L_0x0241
            r13 = 0
        L_0x0241:
            long r0 = r7.A0I     // Catch:{ all -> 0x02c7 }
            r9 = r4
            r11 = r0
            r8.A04(r9, r10, r11, r13)     // Catch:{ all -> 0x02c7 }
            goto L_0x028a
        L_0x0249:
            X.0rv r0 = r7.A0B()     // Catch:{ all -> 0x02c7 }
            com.whatsapp.jid.UserJid r8 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x02c7 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x02c7 }
            X.0us r6 = r3.A07     // Catch:{ all -> 0x02c7 }
            java.util.List r1 = java.util.Collections.singletonList(r8)     // Catch:{ all -> 0x02c7 }
            X.0rt r0 = r3.A03     // Catch:{ all -> 0x02c7 }
            r6.A0C(r0, r4, r1)     // Catch:{ all -> 0x02c7 }
            X.192 r7 = r3.A08     // Catch:{ all -> 0x02c7 }
            X.0pd r6 = r7.A02     // Catch:{ all -> 0x02c7 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x02c7 }
            boolean r0 = r6.A0E(r0, r1)     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x028a
            r7.A03(r4, r8)     // Catch:{ all -> 0x02c7 }
            X.0sK r0 = r3.A01     // Catch:{ all -> 0x02c7 }
            boolean r0 = r0.A0I(r8)     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x028a
        L_0x0278:
            r7.A02(r4)     // Catch:{ all -> 0x02c7 }
            goto L_0x028a
        L_0x027c:
            X.0us r1 = r3.A07     // Catch:{ all -> 0x02c7 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x02c7 }
            X.0rt r0 = r3.A03     // Catch:{ all -> 0x02c7 }
            r1.A0C(r0, r4, r8)     // Catch:{ all -> 0x02c7 }
            goto L_0x028a
        L_0x0287:
            r8.close()     // Catch:{ all -> 0x02c7 }
        L_0x028a:
            r14.A00()     // Catch:{ all -> 0x02c7 }
            r14.close()     // Catch:{ all -> 0x02cc }
            r15.close()
            if (r5 == 0) goto L_0x02d1
            r0 = 4
            if (r2 == r0) goto L_0x02ba
            r0 = 12
            if (r2 == r0) goto L_0x02ba
            r0 = 52
            if (r2 == r0) goto L_0x02ba
            r0 = 20
            if (r2 == r0) goto L_0x02ba
            r0 = 7
            if (r2 == r0) goto L_0x02ba
            r0 = 14
            if (r2 == r0) goto L_0x02ba
            r0 = 5
            if (r2 == r0) goto L_0x02ba
            r0 = 13
            if (r2 == r0) goto L_0x02ba
            r0 = 93
            if (r2 == r0) goto L_0x02ba
            r0 = 94
            if (r2 != r0) goto L_0x02d1
        L_0x02ba:
            X.0pt r2 = r3.A00
            r1 = 35
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r3, r1, r4)
            r2.A0K(r0)
            return
        L_0x02c7:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x02cb }
        L_0x02cb:
            throw r0     // Catch:{ all -> 0x02cc }
        L_0x02cc:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x02d0 }
        L_0x02d0:
            throw r0
        L_0x02d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16070sO.A08(X.1WU):void");
    }

    public boolean A09(GroupJid groupJid) {
        return this.A07.A04(groupJid).A0M(this.A01);
    }

    public boolean A0A(GroupJid groupJid) {
        return this.A07.A04(groupJid).A0N(this.A01);
    }

    public boolean A0B(GroupJid groupJid, UserJid userJid) {
        C30361cE A042 = this.A07.A04(groupJid);
        if (A042.A0O(userJid)) {
            return true;
        }
        if (!C16030sJ.A0O(userJid) || !A042.A05) {
            return false;
        }
        return A042.A0O(this.A09.A00((AnonymousClass1ZT) userJid));
    }

    public boolean A0C(C16060sN r4) {
        C28031Ub it = this.A07.A04(r4).A04().iterator();
        while (it.hasNext()) {
            C16010sH A082 = this.A02.A08(((C30661ck) it.next()).A03);
            if (A082 != null && A082.A0H()) {
                return true;
            }
        }
        return false;
    }

    public boolean A0D(C16050sL r4) {
        C16010sH A082;
        Iterator it = this.A07.A04(r4).A0C().iterator();
        while (it.hasNext()) {
            C16040sK r0 = this.A01;
            UserJid userJid = ((C30661ck) it.next()).A03;
            if (!r0.A0I(userJid) && (A082 = this.A02.A08(userJid)) != null && A082.A0D != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = (X.C30661ck) r3.A04.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(X.C16050sL r5) {
        /*
            r4 = this;
            X.0us r0 = r4.A07
            X.1cE r3 = r0.A04(r5)
            X.0sK r0 = r4.A01
            r0.A0B()
            X.1ZT r1 = r0.A05
            r2 = 0
            if (r1 == 0) goto L_0x0020
            java.util.Map r0 = r3.A04
            java.lang.Object r0 = r0.get(r1)
            X.1ck r0 = (X.C30661ck) r0
            if (r0 == 0) goto L_0x0020
            int r1 = r0.A01
            r0 = 2
            if (r1 != r0) goto L_0x0020
            r2 = 1
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16070sO.A0E(X.0sL):boolean");
    }

    public boolean A0F(C16050sL r3, UserJid userJid) {
        C30661ck A052 = this.A07.A04(r3).A05(userJid);
        return (A052 == null || A052.A01 == 0) ? false : true;
    }
}
