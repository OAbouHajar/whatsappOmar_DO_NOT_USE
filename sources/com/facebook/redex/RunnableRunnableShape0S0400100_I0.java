package com.facebook.redex;

public class RunnableRunnableShape0S0400100_I0 implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public RunnableRunnableShape0S0400100_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2, long j2) {
        this.A05 = i2;
        this.A03 = obj;
        this.A01 = obj2;
        this.A00 = j2;
        this.A02 = obj3;
        this.A04 = obj4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00b3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00b8 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x00b3=Splitter:B:24:0x00b3, B:14:0x008d=Splitter:B:14:0x008d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            int r0 = r15.A05
            switch(r0) {
                case 0: goto L_0x001d;
                case 1: goto L_0x00be;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r15.A01
            X.193 r1 = (X.AnonymousClass193) r1
            java.lang.Object r3 = r15.A02
            X.0sN r3 = (X.C16060sN) r3
            java.lang.Object r4 = r15.A03
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            long r5 = r15.A00
            java.lang.Object r0 = r15.A04
            X.0uz r2 = X.C17380uz.of(r0)
            r1.A01(r2, r3, r4, r5)
            return
        L_0x001d:
            java.lang.Object r0 = r15.A03
            X.0t3 r0 = (X.C16440t3) r0
            long r13 = r0.A00()
            java.lang.Object r2 = r15.A02
            X.1Nt r2 = (X.C26451Nt) r2
            X.0pd r1 = r2.A01
            r0 = 2645(0xa55, float:3.706E-42)
            r1.A02(r0)
            X.0s5 r1 = r2.A00
            X.0tC r0 = X.C15910s6.A1Q
            int r0 = r1.A02(r0)
            long r6 = (long) r0
            long r2 = r15.A00
            r0 = 210(0xd2, float:2.94E-43)
            long r4 = (long) r0
            long r11 = r2 / r4
            r0 = 1
            long r11 = r11 + r0
            java.lang.Object r8 = r15.A01
            X.0t6 r8 = (X.C16460t6) r8
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r6
            long r9 = r13 - r0
            java.lang.String r0 = "CoreMessageStore/getNumMessagesSince"
            X.1Zf r7 = new X.1Zf
            r7.<init>((java.lang.String) r0)
            r0 = 3
            java.lang.String[] r6 = new java.lang.String[r0]
            java.lang.String r1 = java.lang.String.valueOf(r9)
            r0 = 0
            r6[r0] = r1
            java.lang.String r1 = java.lang.String.valueOf(r13)
            r0 = 1
            r6[r0] = r1
            java.lang.String r1 = java.lang.String.valueOf(r11)
            r0 = 2
            r6[r0] = r1
            X.0tq r0 = r8.A0v     // Catch:{ all -> 0x00b9 }
            X.0tf r8 = r0.get()     // Catch:{ all -> 0x00b9 }
            X.0tg r1 = r8.A02     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = "SELECT COUNT(*) as count FROM (SELECT _id FROM available_message_view WHERE timestamp >= ?  AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  LIMIT ?)"
            android.database.Cursor r6 = r1.A08(r0, r6)     // Catch:{ all -> 0x00b4 }
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x0083
            r0 = -1
            goto L_0x008d
        L_0x0083:
            java.lang.String r0 = "count"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ad }
            long r0 = r6.getLong(r0)     // Catch:{ all -> 0x00ad }
        L_0x008d:
            r6.close()     // Catch:{ all -> 0x00b4 }
            r8.close()     // Catch:{ all -> 0x00b9 }
            r7.A01()
            long r0 = r0 * r4
            long r2 = java.lang.Math.min(r0, r2)
            java.lang.Object r0 = r15.A04
            X.0rz r0 = (X.C15860rz) r0
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "md_initial_sync_estimate_bytes"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
            r0.apply()
            return
        L_0x00ad:
            r0 = move-exception
            if (r6 == 0) goto L_0x00b3
            r6.close()     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            throw r0     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r0 = move-exception
            r7.A01()
            throw r0
        L_0x00be:
            java.lang.Object r8 = r15.A01
            X.18P r8 = (X.AnonymousClass18P) r8
            java.lang.Object r2 = r15.A02
            X.0sL r2 = (X.C16050sL) r2
            java.lang.Object r1 = r15.A03
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            long r3 = r15.A00
            java.lang.Object r7 = r15.A04
            X.1ci r7 = (X.C30641ci) r7
            X.185 r0 = r8.A03
            long r1 = r0.A00(r2, r1)
            r5 = -1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00f2
            X.0th r0 = r8.A01
            X.0tZ r2 = r0.A00(r1)
            X.1bh r2 = (X.C30071bh) r2
            if (r2 == 0) goto L_0x00f2
            r0 = 1
            r2.A07 = r0
            r2.A01 = r3
            X.0t6 r1 = r8.A02
            r0 = 21
            r1.A0e(r2, r0)
        L_0x00f2:
            X.124 r0 = r8.A04
            r0.A02(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0400100_I0.run():void");
    }
}
