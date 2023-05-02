package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1Hm  reason: invalid class name and case insensitive filesystem */
public class C24841Hm {
    public final C16000sG A00;
    public final C224818c A01;
    public final C16440t3 A02;
    public final C15860rz A03;
    public final C16920ts A04;
    public final C15810rt A05;
    public final AnonymousClass17I A06;
    public final C24831Hl A07;
    public final C41721wT A08;
    public final CopyOnWriteArrayList A09 = new CopyOnWriteArrayList();

    public C24841Hm(C16000sG r2, C224818c r3, C16440t3 r4, C15860rz r5, C16920ts r6, C15810rt r7, AnonymousClass17I r8, C24831Hl r9, AnonymousClass1CW r10) {
        this.A02 = r4;
        this.A04 = r6;
        this.A05 = r7;
        this.A00 = r2;
        this.A03 = r5;
        this.A06 = r8;
        this.A01 = r3;
        this.A07 = r9;
        this.A08 = new C41721wT(r4, r10);
    }

    public static final boolean A00(C28711Xg r5) {
        C28701Xf r52 = r5.A00;
        return r52.A0G == 0 && r52.A06 == 0;
    }

    public final List A01(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C15830rv r2 = (C15830rv) it.next();
            if (this.A00.A08(r2) != null) {
                arrayList.add(new C28711Xg(this.A06.A04(r2), r2));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:124:0x0246 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x027a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x02da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x02df */
    /* JADX WARNING: Missing exception handler attribute for start block: B:171:0x02e4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass024 r21, java.util.concurrent.atomic.AtomicBoolean r22) {
        /*
            r20 = this;
            android.os.SystemClock.elapsedRealtime()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r4 = r20
            X.0rt r0 = r4.A05
            java.util.Set r0 = r0.A0B()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>(r0)
            X.18c r6 = r4.A01
            android.database.Cursor r3 = r6.A09()
            int r0 = r3.getCount()     // Catch:{ all -> 0x0338 }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x0338 }
            r8.<init>(r7)     // Catch:{ all -> 0x0338 }
        L_0x002c:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = r3.getString(r1)     // Catch:{ all -> 0x0338 }
            X.0rv r0 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x002c
            r8.remove(r0)     // Catch:{ all -> 0x0338 }
            goto L_0x002c
        L_0x0040:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0338 }
            r1.<init>(r8)     // Catch:{ all -> 0x0338 }
            r1.size()     // Catch:{ all -> 0x0338 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0338 }
            if (r0 != 0) goto L_0x0051
            r6.A0Q(r1)     // Catch:{ all -> 0x0338 }
        L_0x0051:
            r3.close()
            android.database.Cursor r3 = r6.A09()
            goto L_0x009c
        L_0x0059:
            r3.close()
            r10 = 0
            X.1Hl r3 = r4.A07
            X.17I r0 = r3.A03
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x008a
            X.0ts r1 = r3.A00
            X.1kq r0 = X.C34771kq.A00
            long r8 = r1.A02(r0)
            X.0tq r0 = r3.A05
            r0.A04()
            X.1jC r0 = r0.A04
            X.0tg r3 = r0.AFO()
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r0 = java.lang.Long.toString(r8)
            r1[r10] = r0
            java.lang.String r0 = "SELECT message.chat_row_id AS chat_row_id, sum(file_size) AS media_sum FROM message_media message_media JOIN message_view message ON message_media.message_row_id = message._id WHERE message.message_type IN ('0','1','2','3','4','5','9','13','14') AND message.chat_row_id != ? GROUP BY message.chat_row_id ORDER BY media_sum DESC"
            android.database.Cursor r3 = r3.A08(r0, r1)
            goto L_0x009c
        L_0x008a:
            X.0tq r0 = r3.A05
            r0.A04()
            X.1jC r0 = r0.A04
            X.0tg r3 = r0.AFO()
            java.lang.String r1 = X.C39511sb.A00
            r0 = 0
            android.database.Cursor r3 = r3.A08(r1, r0)
        L_0x009c:
            r3.getCount()     // Catch:{ all -> 0x0338 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x0192
            r10 = 0
        L_0x00a6:
            if (r21 == 0) goto L_0x00ab
            r21.A02()     // Catch:{ all -> 0x0338 }
        L_0x00ab:
            boolean r0 = r22.get()     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x00b3
            goto L_0x018e
        L_0x00b3:
            int r1 = r2.size()     // Catch:{ all -> 0x0338 }
            r0 = 16
            if (r1 <= r0) goto L_0x00c1
            if (r10 != 0) goto L_0x00c1
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0338 }
            r10 = 1
        L_0x00c1:
            java.lang.String r0 = "chat_row_id"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0338 }
            r0 = -1
            if (r1 <= r0) goto L_0x00d5
            X.0ts r8 = r4.A04     // Catch:{ all -> 0x0338 }
            long r0 = r3.getLong(r1)     // Catch:{ all -> 0x0338 }
            X.0rv r8 = r8.A05(r0)     // Catch:{ all -> 0x0338 }
            goto L_0x00e3
        L_0x00d5:
            java.lang.String r0 = "jid"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0338 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0338 }
            X.0rv r8 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0338 }
        L_0x00e3:
            if (r8 == 0) goto L_0x00ff
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0338 }
        L_0x00e9:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x0149
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0338 }
            X.1Xg r0 = (X.C28711Xg) r0     // Catch:{ all -> 0x0338 }
            X.0rv r0 = r0.A01()     // Catch:{ all -> 0x0338 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x00e9
        L_0x00ff:
            int r0 = r2.size()     // Catch:{ all -> 0x0338 }
            r8 = 16
            if (r0 >= r8) goto L_0x010e
            int r1 = r5.size()     // Catch:{ all -> 0x0338 }
            r0 = 2
            if (r1 >= r0) goto L_0x011b
        L_0x010e:
            int r0 = r2.size()     // Catch:{ all -> 0x0338 }
            if (r0 < r8) goto L_0x0177
            int r1 = r5.size()     // Catch:{ all -> 0x0338 }
            r0 = 5
            if (r1 < r0) goto L_0x0177
        L_0x011b:
            java.util.List r9 = r4.A01(r5)     // Catch:{ all -> 0x0338 }
            r5.clear()     // Catch:{ all -> 0x0338 }
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0338 }
            if (r0 != 0) goto L_0x0177
            r2.addAll(r9)     // Catch:{ all -> 0x0338 }
            r2.size()     // Catch:{ all -> 0x0338 }
            X.4EH r8 = new X.4EH     // Catch:{ all -> 0x0338 }
            r8.<init>(r9)     // Catch:{ all -> 0x0338 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.A09     // Catch:{ all -> 0x0338 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0338 }
        L_0x0139:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x0164
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0338 }
            X.1wc r0 = (X.C41761wc) r0     // Catch:{ all -> 0x0338 }
            r0.AOK(r8)     // Catch:{ all -> 0x0338 }
            goto L_0x0139
        L_0x0149:
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x0338 }
        L_0x014d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x0160
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0338 }
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0     // Catch:{ all -> 0x0338 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x014d
            goto L_0x00ff
        L_0x0160:
            r5.add(r8)     // Catch:{ all -> 0x0338 }
            goto L_0x00ff
        L_0x0164:
            r1 = 0
        L_0x0165:
            int r0 = r9.size()     // Catch:{ all -> 0x0338 }
            if (r1 >= r0) goto L_0x0177
            java.lang.Object r0 = r9.get(r1)     // Catch:{ all -> 0x0338 }
            X.1Xg r0 = (X.C28711Xg) r0     // Catch:{ all -> 0x0338 }
            r6.A0H(r0)     // Catch:{ all -> 0x0338 }
            int r1 = r1 + 1
            goto L_0x0165
        L_0x0177:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0338 }
            if (r0 != 0) goto L_0x00a6
            int r0 = r5.size()     // Catch:{ all -> 0x0338 }
            if (r0 <= 0) goto L_0x018a
            java.util.List r0 = r4.A01(r5)     // Catch:{ all -> 0x0338 }
            r2.addAll(r0)     // Catch:{ all -> 0x0338 }
        L_0x018a:
            java.util.Collections.sort(r2)     // Catch:{ all -> 0x0338 }
            goto L_0x0192
        L_0x018e:
            r3.close()
            return
        L_0x0192:
            r3.close()
            X.11X r9 = r6.A00     // Catch:{ IllegalArgumentException -> 0x02e5 }
            X.0tf r5 = r9.A02()     // Catch:{ IllegalArgumentException -> 0x02e5 }
            X.1cj r12 = r5.A00()     // Catch:{ all -> 0x02e0 }
            android.database.Cursor r3 = r6.A09()     // Catch:{ all -> 0x02db }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x02d4 }
            r1.<init>(r7)     // Catch:{ all -> 0x02d4 }
        L_0x01a8:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x02d4 }
            if (r0 == 0) goto L_0x01bd
            r0 = 0
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x02d4 }
            X.0rv r0 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x02d4 }
            if (r0 == 0) goto L_0x01a8
            r1.remove(r0)     // Catch:{ all -> 0x02d4 }
            goto L_0x01a8
        L_0x01bd:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02d4 }
            r0.<init>(r1)     // Catch:{ all -> 0x02d4 }
            r6.A0Q(r0)     // Catch:{ all -> 0x02d4 }
            r3.close()     // Catch:{ all -> 0x02db }
            int r0 = r0.size()     // Catch:{ all -> 0x02db }
            if (r0 != 0) goto L_0x0283
            X.0tf r13 = r9.get()     // Catch:{ all -> 0x02db }
            java.lang.String r14 = "wa_contact_storage_usage"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x027b }
            r0 = 0
            java.lang.String r1 = "jid"
            r3[r0] = r1     // Catch:{ all -> 0x027b }
            r15 = 0
            java.lang.String r17 = "CONTACT_STORAGE_USAGES"
            r19 = r15
            r16 = r15
            r18 = r3
            android.database.Cursor r6 = X.AnonymousClass15L.A03(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x027b }
            int r3 = r6.getCount()     // Catch:{ all -> 0x0274 }
            r6.close()     // Catch:{ all -> 0x027b }
            r13.close()     // Catch:{ all -> 0x02db }
            int r0 = r7.size()     // Catch:{ all -> 0x02db }
            if (r3 == r0) goto L_0x0283
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x02db }
            r8.<init>()     // Catch:{ all -> 0x02db }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x02db }
            r6.<init>(r7)     // Catch:{ all -> 0x02db }
            X.0tf r13 = r9.A02()     // Catch:{ all -> 0x02db }
            X.1cj r11 = r13.A00()     // Catch:{ all -> 0x027b }
            r7 = 1
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ all -> 0x026f }
            r10 = 0
            r0[r10] = r1     // Catch:{ all -> 0x026f }
            r18 = r0
            android.database.Cursor r9 = X.AnonymousClass15L.A03(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x026f }
            if (r9 == 0) goto L_0x024a
            int r3 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0242 }
        L_0x021e:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0242 }
            if (r0 == 0) goto L_0x0247
            java.lang.String r0 = r9.getString(r3)     // Catch:{ all -> 0x0242 }
            X.0rv r1 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0242 }
            if (r1 != 0) goto L_0x0234
            java.lang.String r0 = "contact-manager-database/remove-copies-and-not-wa-contacts/jid is null or invalid!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0242 }
            goto L_0x021e
        L_0x0234:
            boolean r0 = r6.contains(r1)     // Catch:{ all -> 0x0242 }
            if (r0 == 0) goto L_0x023e
            r6.remove(r1)     // Catch:{ all -> 0x0242 }
            goto L_0x021e
        L_0x023e:
            r8.add(r1)     // Catch:{ all -> 0x0242 }
            goto L_0x021e
        L_0x0242:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0246 }
        L_0x0246:
            throw r0     // Catch:{ all -> 0x026f }
        L_0x0247:
            r9.close()     // Catch:{ all -> 0x026f }
        L_0x024a:
            java.util.Iterator r6 = r8.iterator()     // Catch:{ all -> 0x026f }
        L_0x024e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x026f }
            if (r0 == 0) goto L_0x0268
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x026f }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x026f }
            java.lang.String r3 = "jid = ? "
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ all -> 0x026f }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x026f }
            r1[r10] = r0     // Catch:{ all -> 0x026f }
            X.AnonymousClass15L.A02(r13, r14, r3, r1)     // Catch:{ all -> 0x026f }
            goto L_0x024e
        L_0x0268:
            r11.A00()     // Catch:{ all -> 0x026f }
            r11.close()     // Catch:{ all -> 0x027b }
            goto L_0x0280
        L_0x026f:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x027a }
            goto L_0x027a
        L_0x0274:
            r0 = move-exception
            if (r6 == 0) goto L_0x027a
            r6.close()     // Catch:{ all -> 0x027a }
        L_0x027a:
            throw r0     // Catch:{ all -> 0x027b }
        L_0x027b:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x02da }
            goto L_0x02da
        L_0x0280:
            r13.close()     // Catch:{ all -> 0x02db }
        L_0x0283:
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x02db }
            r6.<init>()     // Catch:{ all -> 0x02db }
            java.util.Iterator r8 = r2.iterator()     // Catch:{ all -> 0x02db }
        L_0x028c:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x02db }
            if (r0 == 0) goto L_0x02ca
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x02db }
            X.1Xg r0 = (X.C28711Xg) r0     // Catch:{ all -> 0x02db }
            X.0rv r7 = r0.A01()     // Catch:{ all -> 0x02db }
            X.1Xf r3 = r0.A00     // Catch:{ all -> 0x02db }
            long r0 = r3.A0G     // Catch:{ all -> 0x02db }
            int r3 = r3.A06     // Catch:{ all -> 0x02db }
            r6.clear()     // Catch:{ all -> 0x02db }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02db }
            java.lang.String r0 = "conversation_size"
            r6.put(r0, r1)     // Catch:{ all -> 0x02db }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x02db }
            java.lang.String r0 = "conversation_message_count"
            r6.put(r0, r1)     // Catch:{ all -> 0x02db }
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x02db }
            java.lang.String r1 = r7.getRawString()     // Catch:{ all -> 0x02db }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x02db }
            java.lang.String r1 = "wa_contact_storage_usage"
            java.lang.String r0 = "jid = ?"
            X.AnonymousClass15L.A01(r6, r5, r1, r0, r3)     // Catch:{ all -> 0x02db }
            goto L_0x028c
        L_0x02ca:
            r12.A00()     // Catch:{ all -> 0x02db }
            r12.close()     // Catch:{ all -> 0x02e0 }
            r5.close()     // Catch:{ IllegalArgumentException -> 0x02e5 }
            goto L_0x02eb
        L_0x02d4:
            r0 = move-exception
            if (r3 == 0) goto L_0x02da
            r3.close()     // Catch:{ all -> 0x02da }
        L_0x02da:
            throw r0     // Catch:{ all -> 0x02db }
        L_0x02db:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x02df }
        L_0x02df:
            throw r0     // Catch:{ all -> 0x02e0 }
        L_0x02e0:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x02e4 }
        L_0x02e4:
            throw r0     // Catch:{ IllegalArgumentException -> 0x02e5 }
        L_0x02e5:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to update batch on storage usage table"
            X.AnonymousClass00B.A09(r0, r1)
        L_0x02eb:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x02f4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x030c
            java.lang.Object r1 = r2.next()
            X.1Xg r1 = (X.C28711Xg) r1
            if (r1 == 0) goto L_0x02f4
            boolean r0 = A00(r1)
            if (r0 != 0) goto L_0x02f4
            r3.add(r1)
            goto L_0x02f4
        L_0x030c:
            boolean r0 = r22.get()
            if (r0 != 0) goto L_0x0337
            X.1wT r1 = r4.A08
            java.lang.String r0 = "STORAGE_USAGE_CHAT_LIST_CACHE_TIME"
            r1.A01(r0)
            X.4EG r2 = new X.4EG
            r2.<init>(r3)
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.A09
            java.util.Iterator r1 = r0.iterator()
        L_0x0324:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0334
            java.lang.Object r0 = r1.next()
            X.1wc r0 = (X.C41761wc) r0
            r0.AOJ(r2)
            goto L_0x0324
        L_0x0334:
            android.os.SystemClock.elapsedRealtime()
        L_0x0337:
            return
        L_0x0338:
            r0 = move-exception
            if (r3 == 0) goto L_0x033e
            r3.close()     // Catch:{ all -> 0x033e }
        L_0x033e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24841Hm.A02(X.024, java.util.concurrent.atomic.AtomicBoolean):void");
    }
}
