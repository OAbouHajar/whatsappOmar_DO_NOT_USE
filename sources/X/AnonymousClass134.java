package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.134  reason: invalid class name */
public class AnonymousClass134 {
    public final C14870pt A00;
    public final C16040sK A01;
    public final C211212w A02;
    public final AnonymousClass138 A03;
    public final AnonymousClass01Y A04;
    public final AnonymousClass16U A05;
    public final C16440t3 A06;
    public final C15860rz A07;
    public final AnonymousClass124 A08;
    public final AnonymousClass12B A09;
    public final Map A0A = new HashMap();

    public AnonymousClass134(C14870pt r2, C16040sK r3, C211212w r4, AnonymousClass138 r5, AnonymousClass01Y r6, AnonymousClass16U r7, C16440t3 r8, C15860rz r9, AnonymousClass124 r10, AnonymousClass12B r11) {
        this.A06 = r8;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A08 = r10;
        this.A04 = r6;
        this.A05 = r7;
        this.A09 = r11;
        this.A07 = r9;
        this.A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        if (A01(1, r0, r10) != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (A01(2, r0, r10) != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        if (A01(3, r0, r10) != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0094, code lost:
        if (A01(4, r0, r10) != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009f, code lost:
        if (A01(5, r0, r10) != false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A00(X.AnonymousClass29Y r24, boolean r25, boolean r26, boolean r27) {
        /*
            r23 = this;
            r5 = r23
            monitor-enter(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0210 }
            r7.<init>()     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "AccountSyncManager/fetchAllAccountInfo/fetch account info: "
            r7.append(r0)     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "AccountSyncRequest:"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0210 }
            r6.<init>(r0)     // Catch:{ all -> 0x0210 }
            r8 = r24
            boolean r2 = r8.A05     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = ""
            if (r2 == 0) goto L_0x005a
            java.lang.String r0 = "S"
        L_0x001e:
            r6.append(r0)     // Catch:{ all -> 0x0210 }
            boolean r12 = r8.A03     // Catch:{ all -> 0x0210 }
            if (r12 == 0) goto L_0x0058
            java.lang.String r0 = "Pi"
        L_0x0027:
            r6.append(r0)     // Catch:{ all -> 0x0210 }
            boolean r11 = r8.A04     // Catch:{ all -> 0x0210 }
            if (r11 == 0) goto L_0x0056
            java.lang.String r0 = "Pr"
        L_0x0030:
            r6.append(r0)     // Catch:{ all -> 0x0210 }
            boolean r3 = r8.A02     // Catch:{ all -> 0x0210 }
            if (r3 == 0) goto L_0x0054
            java.lang.String r0 = "D"
        L_0x0039:
            r6.append(r0)     // Catch:{ all -> 0x0210 }
            boolean r4 = r8.A01     // Catch:{ all -> 0x0210 }
            if (r4 == 0) goto L_0x0042
            java.lang.String r1 = "B"
        L_0x0042:
            r6.append(r1)     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0210 }
            r7.append(r0)     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0210 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0210 }
            goto L_0x005c
        L_0x0054:
            r0 = r1
            goto L_0x0039
        L_0x0056:
            r0 = r1
            goto L_0x0030
        L_0x0058:
            r0 = r1
            goto L_0x0027
        L_0x005a:
            r0 = r1
            goto L_0x001e
        L_0x005c:
            X.0t3 r0 = r5.A06     // Catch:{ all -> 0x020e }
            long r0 = r0.A00()     // Catch:{ all -> 0x020e }
            r7 = 0
            r9 = 1
            r10 = r27
            if (r2 == 0) goto L_0x0070
            boolean r2 = r5.A01(r9, r0, r10)     // Catch:{ all -> 0x020e }
            r18 = 1
            if (r2 == 0) goto L_0x0072
        L_0x0070:
            r18 = 0
        L_0x0072:
            r6 = 2
            if (r12 == 0) goto L_0x007d
            boolean r2 = r5.A01(r6, r0, r10)     // Catch:{ all -> 0x020e }
            r17 = 1
            if (r2 == 0) goto L_0x007f
        L_0x007d:
            r17 = 0
        L_0x007f:
            r2 = 3
            if (r11 == 0) goto L_0x008a
            boolean r2 = r5.A01(r2, r0, r10)     // Catch:{ all -> 0x020e }
            r16 = 1
            if (r2 == 0) goto L_0x008c
        L_0x008a:
            r16 = 0
        L_0x008c:
            r2 = 4
            if (r4 == 0) goto L_0x0096
            boolean r2 = r5.A01(r2, r0, r10)     // Catch:{ all -> 0x020e }
            r15 = 1
            if (r2 == 0) goto L_0x0097
        L_0x0096:
            r15 = 0
        L_0x0097:
            r4 = 5
            if (r3 == 0) goto L_0x00a1
            boolean r2 = r5.A01(r4, r0, r10)     // Catch:{ all -> 0x020e }
            r14 = 1
            if (r2 == 0) goto L_0x00a2
        L_0x00a1:
            r14 = 0
        L_0x00a2:
            int r2 = r18 + r17
            int r2 = r2 + r16
            int r2 = r2 + r15
            int r2 = r2 + r14
            r10 = r25
            if (r2 != 0) goto L_0x00b8
            if (r25 == 0) goto L_0x020c
            X.124 r2 = r5.A08     // Catch:{ all -> 0x020e }
            java.lang.String r1 = "account_sync"
            r0 = 0
            r2.A04(r1, r0)     // Catch:{ all -> 0x020e }
            goto L_0x020c
        L_0x00b8:
            X.0rz r11 = r5.A07     // Catch:{ all -> 0x020e }
            r13 = 4
            X.273 r3 = new X.273     // Catch:{ all -> 0x020e }
            r3.<init>(r11, r5, r2, r10)     // Catch:{ all -> 0x020e }
            if (r26 == 0) goto L_0x0181
            boolean r8 = r8.A00     // Catch:{ all -> 0x020e }
            if (r18 == 0) goto L_0x00f1
            X.01D r2 = r11.A01     // Catch:{ all -> 0x020e }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x020e }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x020e }
            java.lang.String r12 = "account_sync_status_num_retries"
            int r10 = r2.getInt(r12, r7)     // Catch:{ all -> 0x020e }
            if (r8 == 0) goto L_0x00dc
            if (r10 <= r9) goto L_0x00e6
            int r10 = r10 - r9
            if (r10 != 0) goto L_0x00dd
            goto L_0x00e6
        L_0x00dc:
            r10 = 3
        L_0x00dd:
            android.content.SharedPreferences$Editor r2 = r11.A0K()     // Catch:{ all -> 0x020e }
            android.content.SharedPreferences$Editor r2 = r2.putInt(r12, r10)     // Catch:{ all -> 0x020e }
            goto L_0x00ee
        L_0x00e6:
            android.content.SharedPreferences$Editor r2 = r11.A0K()     // Catch:{ all -> 0x020e }
            android.content.SharedPreferences$Editor r2 = r2.remove(r12)     // Catch:{ all -> 0x020e }
        L_0x00ee:
            r2.apply()     // Catch:{ all -> 0x020e }
        L_0x00f1:
            if (r17 == 0) goto L_0x011e
            X.01D r2 = r11.A01     // Catch:{ all -> 0x020e }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x020e }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x020e }
            java.lang.String r12 = "account_sync_picture_num_retries"
            int r10 = r2.getInt(r12, r7)     // Catch:{ all -> 0x020e }
            if (r8 == 0) goto L_0x0109
            if (r10 <= r9) goto L_0x0113
            int r10 = r10 - r9
            if (r10 != 0) goto L_0x010a
            goto L_0x0113
        L_0x0109:
            r10 = 3
        L_0x010a:
            android.content.SharedPreferences$Editor r2 = r11.A0K()     // Catch:{ all -> 0x020e }
            android.content.SharedPreferences$Editor r2 = r2.putInt(r12, r10)     // Catch:{ all -> 0x020e }
            goto L_0x011b
        L_0x0113:
            android.content.SharedPreferences$Editor r2 = r11.A0K()     // Catch:{ all -> 0x020e }
            android.content.SharedPreferences$Editor r2 = r2.remove(r12)     // Catch:{ all -> 0x020e }
        L_0x011b:
            r2.apply()     // Catch:{ all -> 0x020e }
        L_0x011e:
            if (r16 == 0) goto L_0x014b
            X.01D r2 = r11.A01     // Catch:{ all -> 0x020e }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x020e }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x020e }
            java.lang.String r12 = "account_sync_privacy_num_retries"
            int r10 = r2.getInt(r12, r7)     // Catch:{ all -> 0x020e }
            if (r8 == 0) goto L_0x0136
            if (r10 <= r9) goto L_0x0140
            int r10 = r10 - r9
            if (r10 != 0) goto L_0x0137
            goto L_0x0140
        L_0x0136:
            r10 = 3
        L_0x0137:
            android.content.SharedPreferences$Editor r2 = r11.A0K()     // Catch:{ all -> 0x020e }
            android.content.SharedPreferences$Editor r2 = r2.putInt(r12, r10)     // Catch:{ all -> 0x020e }
            goto L_0x0148
        L_0x0140:
            android.content.SharedPreferences$Editor r2 = r11.A0K()     // Catch:{ all -> 0x020e }
            android.content.SharedPreferences$Editor r2 = r2.remove(r12)     // Catch:{ all -> 0x020e }
        L_0x0148:
            r2.apply()     // Catch:{ all -> 0x020e }
        L_0x014b:
            if (r15 == 0) goto L_0x0181
            X.01D r2 = r11.A01     // Catch:{ all -> 0x020e }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x020e }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x020e }
            java.lang.String r10 = "account_sync_blocklist_num_retries"
            int r2 = r2.getInt(r10, r7)     // Catch:{ all -> 0x020e }
            if (r8 == 0) goto L_0x016c
            if (r2 <= r9) goto L_0x0176
            int r8 = r2 + -1
            if (r8 == 0) goto L_0x0176
            android.content.SharedPreferences$Editor r2 = r11.A0K()     // Catch:{ all -> 0x020e }
            android.content.SharedPreferences$Editor r2 = r2.putInt(r10, r8)     // Catch:{ all -> 0x020e }
            goto L_0x017e
        L_0x016c:
            r8 = 3
            android.content.SharedPreferences$Editor r2 = r11.A0K()     // Catch:{ all -> 0x020e }
            android.content.SharedPreferences$Editor r2 = r2.putInt(r10, r8)     // Catch:{ all -> 0x020e }
            goto L_0x017e
        L_0x0176:
            android.content.SharedPreferences$Editor r2 = r11.A0K()     // Catch:{ all -> 0x020e }
            android.content.SharedPreferences$Editor r2 = r2.remove(r10)     // Catch:{ all -> 0x020e }
        L_0x017e:
            r2.apply()     // Catch:{ all -> 0x020e }
        L_0x0181:
            if (r18 == 0) goto L_0x019a
            java.util.Map r10 = r5.A0A     // Catch:{ all -> 0x020e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x020e }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x020e }
            r10.put(r8, r2)     // Catch:{ all -> 0x020e }
            X.12w r8 = r5.A02     // Catch:{ all -> 0x020e }
            X.2KD r2 = new X.2KD     // Catch:{ all -> 0x020e }
            r2.<init>(r3, r5)     // Catch:{ all -> 0x020e }
            r8.A01(r2)     // Catch:{ all -> 0x020e }
        L_0x019a:
            if (r17 == 0) goto L_0x01c1
            java.util.Map r10 = r5.A0A     // Catch:{ all -> 0x020e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x020e }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x020e }
            r10.put(r8, r2)     // Catch:{ all -> 0x020e }
            X.12B r8 = r5.A09     // Catch:{ all -> 0x020e }
            X.0sK r2 = r5.A01     // Catch:{ all -> 0x020e }
            r2.A0B()     // Catch:{ all -> 0x020e }
            X.1ZT r2 = r2.A05     // Catch:{ all -> 0x020e }
            r20 = 0
            r21 = 0
            r22 = 1
            r17 = r8
            r18 = r2
            r19 = r3
            r17.A02(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x020e }
        L_0x01c1:
            if (r16 == 0) goto L_0x01d6
            java.util.Map r10 = r5.A0A     // Catch:{ all -> 0x020e }
            r2 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x020e }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x020e }
            r10.put(r8, r2)     // Catch:{ all -> 0x020e }
            X.138 r2 = r5.A03     // Catch:{ all -> 0x020e }
            r2.A00(r3)     // Catch:{ all -> 0x020e }
        L_0x01d6:
            if (r15 == 0) goto L_0x01ea
            java.util.Map r10 = r5.A0A     // Catch:{ all -> 0x020e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x020e }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x020e }
            r10.put(r8, r2)     // Catch:{ all -> 0x020e }
            X.01Y r2 = r5.A04     // Catch:{ all -> 0x020e }
            r2.A0N(r3)     // Catch:{ all -> 0x020e }
        L_0x01ea:
            if (r14 == 0) goto L_0x020c
            java.util.Map r8 = r5.A0A     // Catch:{ all -> 0x020e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x020e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x020e }
            r8.put(r2, r0)     // Catch:{ all -> 0x020e }
            X.16U r2 = r5.A05     // Catch:{ all -> 0x020e }
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r9]     // Catch:{ all -> 0x020e }
            X.0sK r0 = r5.A01     // Catch:{ all -> 0x020e }
            r0.A0B()     // Catch:{ all -> 0x020e }
            X.1ZT r0 = r0.A05     // Catch:{ all -> 0x020e }
            r1[r7] = r0     // Catch:{ all -> 0x020e }
            r2.A01(r1, r6)     // Catch:{ all -> 0x020e }
            r3.A00(r4)     // Catch:{ all -> 0x020e }
        L_0x020c:
            monitor-exit(r5)
            return
        L_0x020e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0210 }
        L_0x0210:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass134.A00(X.29Y, boolean, boolean, boolean):void");
    }

    public final boolean A01(int i2, long j2, boolean z2) {
        if (z2) {
            Map map = this.A0A;
            Integer valueOf = Integer.valueOf(i2);
            return map.containsKey(valueOf) && j2 - ((Number) map.get(valueOf)).longValue() <= 60000;
        }
    }
}
