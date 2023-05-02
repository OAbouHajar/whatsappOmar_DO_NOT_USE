package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.19D  reason: invalid class name */
public class AnonymousClass19D {
    public final C16300so A00;
    public final C16440t3 A01;
    public final C16460t6 A02;
    public final C216314v A03;
    public final C16900tq A04;
    public final C20360zv A05;

    public AnonymousClass19D(C16300so r1, C16440t3 r2, C16460t6 r3, C216314v r4, C16900tq r5, C20360zv r6) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
    }

    public static long A00(long j2, long j3) {
        if (j3 > 0 && j2 / 10 > j3) {
            StringBuilder sb = new StringBuilder("MessageRangeUtil/convertTheTimestampIfTooLarge DeleteMessageForMeMutation message timestamp is too large, timestampToConvert=");
            sb.append(j2);
            sb.append("; validTimestamp=");
            sb.append(j3);
            Log.w(sb.toString());
            while (j2 / 10 > j3) {
                j2 /= 1000;
            }
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r1 > 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A01(android.database.Cursor r6, boolean r7) {
        /*
            java.lang.String r5 = "timestamp"
            if (r7 == 0) goto L_0x0034
            java.lang.String r0 = "status"
            int r0 = r6.getColumnIndexOrThrow(r0)
            int r0 = r6.getInt(r0)
            r3 = 0
            if (r0 != 0) goto L_0x0015
            return r3
        L_0x0015:
            java.lang.String r0 = "receipt_server_timestamp"
            int r0 = r6.getColumnIndexOrThrow(r0)
            long r1 = r6.getLong(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0033
            java.lang.String r0 = "receipt_device_timestamp"
            int r0 = r6.getColumnIndex(r0)
            if (r0 < 0) goto L_0x0034
            long r1 = r6.getLong(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0034
        L_0x0033:
            return r1
        L_0x0034:
            int r0 = r6.getColumnIndexOrThrow(r5)
            long r0 = r6.getLong(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19D.A01(android.database.Cursor, boolean):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C37901pv A02(android.database.Cursor r13, X.C16800tf r14, X.C15830rv r15) {
        /*
            r12 = this;
            java.lang.String r0 = "key_id"
            int r0 = r13.getColumnIndexOrThrow(r0)
            java.lang.String r8 = r13.getString(r0)
            java.lang.String r0 = "from_me"
            int r0 = r13.getColumnIndexOrThrow(r0)
            int r1 = r13.getInt(r0)
            r0 = 1
            r11 = 0
            if (r1 != r0) goto L_0x0019
            r11 = 1
        L_0x0019:
            long r9 = A01(r13, r11)
            r6 = r15
            boolean r0 = X.C16030sJ.A0L(r15)
            r5 = 0
            if (r0 == 0) goto L_0x0090
            if (r11 != 0) goto L_0x0090
            X.0tq r0 = r12.A04
            r0.A04()
            X.1jC r1 = r0.A04
            X.0tg r0 = r14.A02
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "sender_jid_row_id"
            int r0 = r13.getColumnIndexOrThrow(r0)
            long r0 = r13.getLong(r0)
            X.14v r2 = r12.A03
            com.whatsapp.jid.Jid r4 = r2.A03(r0)
            com.whatsapp.jid.UserJid r7 = com.whatsapp.jid.UserJid.of(r4)
            if (r7 != 0) goto L_0x0091
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r4)
            if (r2 != 0) goto L_0x0089
            java.lang.String r3 = "MessageRangeUtil/getSenderJid null or not UserJid/DeviceJid when db migration is completed; senderJidRowId="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "; jid="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x006c:
            java.lang.String r0 = "sender_jid_raw_string"
            int r0 = r13.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r13.getString(r0)
            com.whatsapp.jid.UserJid r7 = com.whatsapp.jid.UserJid.getNullable(r0)
            if (r7 != 0) goto L_0x0091
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            if (r2 != 0) goto L_0x0089
            java.lang.String r0 = "MessageRangeUtil/getSenderJid null or not UserJid/DeviceJid before db migration"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r5
        L_0x0089:
            com.whatsapp.jid.UserJid r7 = r2.getUserJid()
            if (r7 != 0) goto L_0x0091
            return r5
        L_0x0090:
            r7 = r5
        L_0x0091:
            X.1pv r5 = new X.1pv
            r5.<init>(r6, r7, r8, r9, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19D.A02(android.database.Cursor, X.0tf, X.0rv):X.1pv");
    }

    public C36801o8 A03(C15830rv r22) {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"clearChat", "deleteChat", "deleteMessageForMe"}));
        ArrayList arrayList = new ArrayList();
        C20360zv r1 = this.A05;
        C15830rv r6 = r22;
        arrayList.addAll(r1.A08(r6, hashSet, false));
        arrayList.addAll(r1.A08(r6, hashSet, true));
        C36801o8 A042 = A04(r6, true);
        HashSet hashSet2 = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass1WJ r62 = (AnonymousClass1WJ) it.next();
            if (r62 instanceof C36831oB) {
                A042 = C36801o8.A01(A042, ((C36831oB) r62).ADZ());
            } else if (r62 instanceof C36851oD) {
                C36851oD r63 = (C36851oD) r62;
                long j2 = r63.A00;
                if (j2 > 0) {
                    long A002 = A00(j2, r63.A04);
                    C28381Vw r0 = r63.A02;
                    boolean z2 = r0.A02;
                    String str = r0.A01;
                    C15830rv r9 = r0.A00;
                    AnonymousClass00B.A06(r9);
                    C15830rv r02 = r63.A01;
                    hashSet2.add(new C37901pv(r9, r02 != null ? UserJid.getNullable(r02.getRawString()) : null, str, A002, z2));
                }
            } else {
                StringBuilder sb = new StringBuilder("MessageRangeUtil/createActiveRange unhandledMutation:");
                sb.append(r62.A04());
                Log.e(sb.toString());
            }
        }
        return C36801o8.A01(A042, new C36801o8(hashSet2, Collections.emptySet(), 0, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0140, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:29:0x0092, B:35:0x00ac] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0090 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x013b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0147 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0090=Splitter:B:26:0x0090, B:20:0x0086=Splitter:B:20:0x0086} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:75:0x0147=Splitter:B:75:0x0147, B:8:0x004e=Splitter:B:8:0x004e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C36801o8 A04(X.C15830rv r21, boolean r22) {
        /*
            r20 = this;
            r12 = r20
            X.0t6 r3 = r12.A02
            r4 = 1000(0x3e8, float:1.401E-42)
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]
            X.0ts r10 = r3.A0N
            r13 = r21
            long r0 = r10.A02(r13)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r2[r0] = r1
            X.0t3 r7 = r3.A0F
            long r0 = r7.A00()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 1
            r2[r0] = r1
            java.lang.String r19 = java.lang.String.valueOf(r4)
            r0 = 2
            r2[r0] = r19
            X.0tq r8 = r3.A0v
            X.0tf r3 = r8.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "   SELECT MAX(timestamp) as timestamp FROM  ( SELECT timestamp FROM available_message_view WHERE chat_row_id = ? AND from_me = 0 AND (message_type != '7') AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC  LIMIT ? )"
            android.database.Cursor r2 = r1.A08(r0, r2)     // Catch:{ all -> 0x0148 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0141 }
            if (r0 != 0) goto L_0x0043
            r0 = -1
            goto L_0x004e
        L_0x0043:
            java.lang.String r0 = "timestamp"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0141 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0141 }
        L_0x004e:
            r2.close()     // Catch:{ all -> 0x0148 }
            r3.close()
            r17 = 0
            if (r22 == 0) goto L_0x0096
            r2 = 1
            java.lang.String[] r4 = new java.lang.String[r2]
            long r2 = r10.A02(r13)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            r2 = 0
            r4[r2] = r3
            X.0tf r6 = r8.get()
            X.0tg r3 = r6.A02     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "   SELECT timestamp FROM available_message_view WHERE chat_row_id = ? AND from_me = 1 AND message_type = 7 ORDER BY sort_id DESC LIMIT 1"
            android.database.Cursor r3 = r3.A08(r2, r4)     // Catch:{ all -> 0x0091 }
            boolean r2 = r3.moveToFirst()     // Catch:{ all -> 0x008a }
            if (r2 != 0) goto L_0x007b
            r4 = -1
            goto L_0x0086
        L_0x007b:
            java.lang.String r2 = "timestamp"
            int r2 = r3.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x008a }
            long r4 = r3.getLong(r2)     // Catch:{ all -> 0x008a }
        L_0x0086:
            r3.close()     // Catch:{ all -> 0x0091 }
            goto L_0x0099
        L_0x008a:
            r0 = move-exception
            if (r3 == 0) goto L_0x0090
            r3.close()     // Catch:{ all -> 0x0090 }
        L_0x0090:
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x014c }
            throw r0
        L_0x0096:
            r4 = 0
            goto L_0x009c
        L_0x0099:
            r6.close()
        L_0x009c:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            X.0tq r6 = r12.A04
            X.0tf r11 = r6.get()
            java.lang.String r16 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x013c }
            r6 = 7
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ all -> 0x013c }
            long r14 = r10.A02(r13)     // Catch:{ all -> 0x013c }
            java.lang.String r10 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x013c }
            r6 = 0
            r9[r6] = r10     // Catch:{ all -> 0x013c }
            r6 = 1
            r9[r6] = r16     // Catch:{ all -> 0x013c }
            r6 = 2
            r9[r6] = r16     // Catch:{ all -> 0x013c }
            r6 = 3
            r9[r6] = r16     // Catch:{ all -> 0x013c }
            r6 = 4
            r9[r6] = r16     // Catch:{ all -> 0x013c }
            long r6 = r7.A00()     // Catch:{ all -> 0x013c }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x013c }
            r6 = 5
            r9[r6] = r7     // Catch:{ all -> 0x013c }
            r6 = 6
            r9[r6] = r19     // Catch:{ all -> 0x013c }
            X.0tf r8 = r8.get()     // Catch:{ all -> 0x013c }
            X.0tg r7 = r8.A02     // Catch:{ all -> 0x0137 }
            java.lang.String r6 = "   SELECT key_id, from_me, timestamp, receipt_server_timestamp, receipt_device_timestamp, sender_jid_raw_string, sender_jid_row_id, status FROM available_message_view WHERE chat_row_id = ? AND (message_type != '7') AND  (  ( from_me = 0 AND timestamp >= ? ) OR ( from_me = 1 AND (  CASE  WHEN status = 0 THEN 1  WHEN receipt_server_timestamp > 0  THEN receipt_server_timestamp >= ?  WHEN receipt_device_timestamp > 0  THEN receipt_device_timestamp >= ?  WHEN timestamp >= 0  THEN timestamp >= ?  ELSE 0  END  ) ))  AND (status != '7')  AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC LIMIT ?"
            android.database.Cursor r10 = r7.A08(r6, r9)     // Catch:{ all -> 0x0137 }
            r8.close()     // Catch:{ all -> 0x013c }
            if (r10 == 0) goto L_0x0112
        L_0x00e9:
            boolean r6 = r10.moveToNext()     // Catch:{ all -> 0x010d }
            if (r6 == 0) goto L_0x0109
            X.1pv r9 = r12.A02(r10, r11, r13)     // Catch:{ all -> 0x010d }
            if (r9 == 0) goto L_0x0103
            long r7 = r9.A00     // Catch:{ all -> 0x010d }
            int r6 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r6 > 0) goto L_0x00ff
            r2.add(r9)     // Catch:{ all -> 0x010d }
            goto L_0x00e9
        L_0x00ff:
            r3.add(r9)     // Catch:{ all -> 0x010d }
            goto L_0x00e9
        L_0x0103:
            java.lang.String r6 = "MessageRangeUtil/createRange unable to create message"
            com.whatsapp.util.Log.e((java.lang.String) r6)     // Catch:{ all -> 0x010d }
            goto L_0x00e9
        L_0x0109:
            r10.close()     // Catch:{ all -> 0x013c }
            goto L_0x0112
        L_0x010d:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x013b }
            goto L_0x013b
        L_0x0112:
            r11.close()
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r6.toSeconds(r0)
            long r8 = r7.toMillis(r0)
            long r0 = r6.toSeconds(r4)
            long r10 = r7.toMillis(r0)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x012f
            r10 = 0
        L_0x012f:
            X.1o8 r5 = new X.1o8
            r6 = r3
            r7 = r2
            r5.<init>(r6, r7, r8, r10)
            return r5
        L_0x0137:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x013b }
        L_0x013b:
            throw r0     // Catch:{ all -> 0x013c }
        L_0x013c:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x014c }
            throw r0
        L_0x0141:
            r0 = move-exception
            if (r2 == 0) goto L_0x0147
            r2.close()     // Catch:{ all -> 0x0147 }
        L_0x0147:
            throw r0     // Catch:{ all -> 0x0148 }
        L_0x0148:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x014c }
        L_0x014c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19D.A04(X.0rv, boolean):X.1o8");
    }
}
