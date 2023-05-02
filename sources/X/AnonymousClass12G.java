package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.12G  reason: invalid class name */
public class AnonymousClass12G {
    public static final long A04 = TimeUnit.DAYS.toSeconds(182);
    public Map A00;
    public final C442123f A01;
    public final C16440t3 A02;
    public final C14710pd A03;

    public AnonymousClass12G(C16440t3 r2, C14710pd r3, AnonymousClass11X r4) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = new C442123f(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        if (r10 == 1) goto L_0x0052;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0077 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(com.whatsapp.jid.UserJid r15, byte[] r16, long r17) {
        /*
            r14 = this;
            X.23f r2 = r14.A01
            r0 = 3
            android.content.ContentValues r9 = new android.content.ContentValues
            r9.<init>(r0)
            java.lang.String r1 = r15.getRawString()
            java.lang.String r0 = "jid"
            r9.put(r0, r1)
            java.lang.String r0 = "incoming_tc_token"
            r1 = r16
            r9.put(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r17)
            java.lang.String r0 = "incoming_tc_token_timestamp"
            r9.put(r0, r1)
            X.11X r0 = r2.A00
            X.0tf r5 = r0.A02()
            X.1cj r13 = r5.A00()     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "wa_trusted_contacts"
            java.lang.String r3 = "jid = ? AND incoming_tc_token_timestamp < ? "
            r6 = 2
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = r15.getRawString()     // Catch:{ all -> 0x0073 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x0073 }
            r12 = 1
            r2[r12] = r0     // Catch:{ all -> 0x0073 }
            long r10 = X.AnonymousClass15L.A01(r9, r5, r4, r3, r2)     // Catch:{ all -> 0x0073 }
            r7 = 0
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0052
            r2 = 1
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x0053
        L_0x0052:
            r0 = 1
        L_0x0053:
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0073 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0073 }
            r0 = 4
            long r3 = r1.A06(r9, r4, r0)     // Catch:{ all -> 0x0073 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0068
            r6 = 0
        L_0x0068:
            r12 = r6
        L_0x0069:
            r13.A00()     // Catch:{ all -> 0x0073 }
            r13.close()     // Catch:{ all -> 0x0078 }
            r5.close()
            return r12
        L_0x0073:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0077 }
        L_0x0077:
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x007c }
        L_0x007c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12G.A00(com.whatsapp.jid.UserJid, byte[], long):int");
    }

    public long A01() {
        C14710pd r7 = this.A03;
        C16620tM r6 = C16620tM.A02;
        return Math.min(A02((long) r7.A03(r6, 996), (long) r7.A03(r6, 997)), A02((long) r7.A03(r6, 865), (long) r7.A03(r6, 909)));
    }

    public final long A02(long j2, long j3) {
        long A012 = this.A02.A01() / 1000;
        long j4 = A012 - A04;
        if (j2 <= 0 || j3 <= 0) {
            StringBuilder sb = new StringBuilder("Bad bucket configuration: numValidBuckets = ");
            sb.append(j3);
            sb.append(", bucketLengthSec = ");
            sb.append(j2);
            Log.e(sb.toString());
            return j4;
        }
        long j5 = A012 / j2;
        long j6 = j3 - 1;
        if (j5 < j6) {
            StringBuilder sb2 = new StringBuilder("Strange bucket configuration: currentBucket = ");
            sb2.append(j5);
            sb2.append(", currentTimeSec = ");
            sb2.append(A012);
            sb2.append(", numValidBuckets = ");
            sb2.append(j3);
            sb2.append(", bucketLengthSec = ");
            sb2.append(j2);
            Log.e(sb2.toString());
        }
        return Math.max((j5 - j6) * j2, j4);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0042 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0042=Splitter:B:16:0x0042, B:10:0x0038=Splitter:B:10:0x0038} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Long A03(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            java.util.Map r5 = r7.A06()
            boolean r0 = r5.containsKey(r8)
            if (r0 != 0) goto L_0x0057
            X.23f r0 = r7.A01
            X.11X r0 = r0.A00
            X.0tf r6 = r0.get()
            X.0tg r4 = r6.A02     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = "SELECT sent_tc_token_timestamp FROM wa_trusted_contacts_send WHERE jid= ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0043 }
            r1 = 0
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x0043 }
            r2[r1] = r0     // Catch:{ all -> 0x0043 }
            android.database.Cursor r1 = r4.A08(r3, r2)     // Catch:{ all -> 0x0043 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "sent_tc_token_timestamp"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003c }
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x003c }
            goto L_0x0038
        L_0x0036:
            r3 = -1
        L_0x0038:
            r1.close()     // Catch:{ all -> 0x0043 }
            goto L_0x0048
        L_0x003c:
            r0 = move-exception
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0
        L_0x0048:
            r6.close()
            long r1 = r7.A01()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005e
            r0 = 0
        L_0x0054:
            r5.put(r8, r0)
        L_0x0057:
            java.lang.Object r0 = r5.get(r8)
            java.lang.Long r0 = (java.lang.Long) r0
            return r0
        L_0x005e:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12G.A03(com.whatsapp.jid.UserJid):java.lang.Long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A04() {
        /*
            r8 = this;
            X.23f r0 = r8.A01
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            X.11X r0 = r0.A00
            X.0tf r6 = r0.get()
            X.0tg r2 = r6.A02     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = "SELECT jid, sent_tc_token_timestamp FROM wa_trusted_contacts_send"
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0051 }
            android.database.Cursor r5 = r2.A08(r1, r0)     // Catch:{ all -> 0x0051 }
            if (r5 == 0) goto L_0x0048
            java.lang.String r0 = "jid"
            int r4 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "sent_tc_token_timestamp"
            int r3 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0043 }
        L_0x0027:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r5.getString(r4)     // Catch:{ all -> 0x0043 }
            X.0rv r2 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0027
            long r0 = r5.getLong(r3)     // Catch:{ all -> 0x0043 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0043 }
            r7.put(r2, r0)     // Catch:{ all -> 0x0043 }
            goto L_0x0027
        L_0x0043:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0048:
            if (r5 == 0) goto L_0x004d
            r5.close()     // Catch:{ all -> 0x0051 }
        L_0x004d:
            r6.close()
            return r7
        L_0x0051:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12G.A04():java.util.Map");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A05() {
        /*
            r10 = this;
            X.23f r0 = r10.A01
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            X.11X r0 = r0.A00
            X.0tf r7 = r0.get()
            X.0tg r2 = r7.A02     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "SELECT jid, incoming_tc_token, incoming_tc_token_timestamp FROM wa_trusted_contacts"
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0060 }
            android.database.Cursor r8 = r2.A08(r1, r0)     // Catch:{ all -> 0x0060 }
            if (r8 == 0) goto L_0x0057
            java.lang.String r0 = "jid"
            int r6 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "incoming_tc_token"
            int r5 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "incoming_tc_token_timestamp"
            int r4 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0052 }
        L_0x002c:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r8.getString(r6)     // Catch:{ all -> 0x0052 }
            com.whatsapp.jid.UserJid r3 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x0052 }
            byte[] r2 = r8.getBlob(r5)     // Catch:{ all -> 0x0052 }
            long r0 = r8.getLong(r4)     // Catch:{ all -> 0x0052 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x0052 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0052 }
            X.1cG r0 = new X.1cG     // Catch:{ all -> 0x0052 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0052 }
            r9.put(r3, r0)     // Catch:{ all -> 0x0052 }
            goto L_0x002c
        L_0x0052:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0057:
            if (r8 == 0) goto L_0x005c
            r8.close()     // Catch:{ all -> 0x0060 }
        L_0x005c:
            r7.close()
            return r9
        L_0x0060:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12G.A05():java.util.Map");
    }

    public final synchronized Map A06() {
        Map map;
        map = this.A00;
        if (map == null) {
            map = Collections.synchronizedMap(new HashMap());
            this.A00 = map;
        }
        return map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0053, code lost:
        if (r14 == 1) goto L_0x0055;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0084 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(com.whatsapp.jid.UserJid r18, java.lang.Long r19) {
        /*
            r17 = this;
            r9 = r17
            X.23f r2 = r9.A01
            r7 = r19
            long r12 = r7.longValue()
            r6 = 2
            android.content.ContentValues r11 = new android.content.ContentValues
            r11.<init>(r6)
            r8 = r18
            java.lang.String r1 = r8.getRawString()
            java.lang.String r0 = "jid"
            r11.put(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            java.lang.String r0 = "sent_tc_token_timestamp"
            r11.put(r0, r1)
            X.11X r0 = r2.A00
            X.0tf r5 = r0.A02()
            X.1cj r16 = r5.A00()     // Catch:{ all -> 0x0085 }
            java.lang.String r10 = "wa_trusted_contacts_send"
            java.lang.String r3 = "jid = ? AND sent_tc_token_timestamp < ? "
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = r8.getRawString()     // Catch:{ all -> 0x0080 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0080 }
            r4 = 1
            r2[r4] = r0     // Catch:{ all -> 0x0080 }
            long r14 = X.AnonymousClass15L.A01(r11, r5, r10, r3, r2)     // Catch:{ all -> 0x0080 }
            r12 = 0
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            r2 = 1
            int r1 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x0056
        L_0x0055:
            r0 = 1
        L_0x0056:
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0080 }
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x006c
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0080 }
            r0 = 4
            long r3 = r1.A06(r11, r10, r0)     // Catch:{ all -> 0x0080 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006b
            r6 = 0
        L_0x006b:
            r4 = r6
        L_0x006c:
            r16.A00()     // Catch:{ all -> 0x0080 }
            r16.close()     // Catch:{ all -> 0x0085 }
            r5.close()
            r0 = 2
            if (r4 == r0) goto L_0x007f
            java.util.Map r0 = r9.A06()
            r0.put(r8, r7)
        L_0x007f:
            return
        L_0x0080:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x0084 }
        L_0x0084:
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0089 }
        L_0x0089:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12G.A07(com.whatsapp.jid.UserJid, java.lang.Long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0076 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0076=Splitter:B:23:0x0076, B:8:0x003c=Splitter:B:8:0x003c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A08(com.whatsapp.jid.UserJid r10) {
        /*
            r9 = this;
            X.23f r0 = r9.A01
            X.11X r0 = r0.A00
            X.0tf r5 = r0.get()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = "SELECT incoming_tc_token, incoming_tc_token_timestamp FROM wa_trusted_contacts WHERE jid= ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0077 }
            r1 = 0
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x0077 }
            r2[r1] = r0     // Catch:{ all -> 0x0077 }
            android.database.Cursor r4 = r4.A08(r3, r2)     // Catch:{ all -> 0x0077 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0070 }
            r3 = 0
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "incoming_tc_token"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0070 }
            byte[] r2 = r4.getBlob(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "incoming_tc_token_timestamp"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0070 }
            long r0 = r4.getLong(r0)     // Catch:{ all -> 0x0070 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0070 }
            goto L_0x003c
        L_0x003a:
            r2 = r3
            r0 = r3
        L_0x003c:
            r4.close()     // Catch:{ all -> 0x0077 }
            r5.close()
            if (r2 == 0) goto L_0x0049
            X.1cG r3 = new X.1cG
            r3.<init>(r0, r2)
        L_0x0049:
            r8 = 0
            if (r3 == 0) goto L_0x006f
            byte[] r5 = r3.A01
            java.lang.Long r0 = r3.A00
            long r6 = r0.longValue()
            X.0pd r4 = r9.A03
            r0 = 865(0x361, float:1.212E-42)
            X.0tM r1 = X.C16620tM.A02
            int r0 = r4.A03(r1, r0)
            long r2 = (long) r0
            r0 = 909(0x38d, float:1.274E-42)
            int r0 = r4.A03(r1, r0)
            long r0 = (long) r0
            long r1 = r9.A02(r2, r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x006f
            return r5
        L_0x006f:
            return r8
        L_0x0070:
            r0 = move-exception
            if (r4 == 0) goto L_0x0076
            r4.close()     // Catch:{ all -> 0x0076 }
        L_0x0076:
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x007b }
        L_0x007b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12G.A08(com.whatsapp.jid.UserJid):byte[]");
    }
}
