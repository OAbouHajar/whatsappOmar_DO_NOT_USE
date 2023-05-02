package X;

/* renamed from: X.1CY  reason: invalid class name */
public class AnonymousClass1CY {
    public final C15900s5 A00;
    public final C26451Nt A01;
    public final C23461Cb A02;
    public final AnonymousClass19E A03;
    public final AnonymousClass139 A04;
    public final C15800rs A05;
    public final C16440t3 A06;
    public final C19780yz A07;
    public final AnonymousClass192 A08;
    public final C17290uq A09;
    public final C27441Rt A0A;
    public final AnonymousClass1RS A0B;
    public final AnonymousClass19M A0C;
    public final C14710pd A0D;
    public final AnonymousClass124 A0E;
    public final C27431Rs A0F;
    public final C23321Bn A0G;
    public final C16220sf A0H;
    public final C16320sq A0I;

    public AnonymousClass1CY(C15900s5 r2, C26451Nt r3, C23461Cb r4, AnonymousClass19E r5, AnonymousClass139 r6, C15800rs r7, C16440t3 r8, C19780yz r9, AnonymousClass192 r10, C17290uq r11, C27441Rt r12, AnonymousClass1RS r13, AnonymousClass19M r14, C14710pd r15, AnonymousClass124 r16, C27431Rs r17, C23321Bn r18, C16220sf r19, C16320sq r20) {
        this.A06 = r8;
        this.A0D = r15;
        this.A0I = r20;
        this.A09 = r11;
        this.A0E = r16;
        this.A00 = r2;
        this.A0A = r12;
        this.A0F = r17;
        this.A01 = r3;
        this.A07 = r9;
        this.A03 = r5;
        this.A0H = r19;
        this.A0C = r14;
        this.A05 = r7;
        this.A0G = r18;
        this.A02 = r4;
        this.A04 = r6;
        this.A0B = r13;
        this.A08 = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r10.A00;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00bf */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x00b5=Splitter:B:29:0x00b5, B:35:0x00bf=Splitter:B:35:0x00bf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A00(X.C30451cN r10, int r11, boolean r12) {
        /*
            r9 = this;
            X.1Nt r5 = r9.A01
            r0 = 2
            if (r11 == r0) goto L_0x0066
            if (r10 == 0) goto L_0x005d
            java.lang.Integer r0 = r10.A00
            if (r0 == 0) goto L_0x005d
            int r3 = r0.intValue()
        L_0x000f:
            X.0pd r2 = r5.A01
            r1 = 2266(0x8da, float:3.175E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            int r0 = java.lang.Math.min(r3, r0)
        L_0x001d:
            long r4 = (long) r0
            java.lang.String r0 = "history-sync-manager/getOldestRowIdToSync syncType = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
            java.lang.String r0 = ", days = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00e6
            X.0uq r2 = r9.A09
            X.0t3 r0 = r9.A06
            long r7 = r0.A00()
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 * r0
            long r7 = r7 - r4
            r6 = 0
            X.1Zf r5 = new X.1Zf
            r5.<init>((boolean) r6)
            java.lang.String r0 = "rowidstore/getRowIdByTimestampExcludeSystemMessages"
            r5.A04(r0)
            X.0tq r0 = r2.A06
            X.0tf r4 = r0.get()
            goto L_0x0091
        L_0x005d:
            X.0s5 r1 = r5.A00
            X.0tC r0 = X.C15910s6.A1N
            int r3 = r1.A02(r0)
            goto L_0x000f
        L_0x0066:
            X.0pd r4 = r5.A01
            r0 = 2645(0xa55, float:3.706E-42)
            X.0tM r3 = X.C16620tM.A02
            int r2 = r4.A03(r3, r0)
            if (r12 != 0) goto L_0x0088
            if (r10 == 0) goto L_0x0088
            java.lang.Integer r1 = r10.A02
            if (r1 == 0) goto L_0x0088
            r0 = -1
            if (r2 == r0) goto L_0x0088
            int r0 = r1.intValue()
            if (r0 <= r2) goto L_0x0088
            r0 = 2646(0xa56, float:3.708E-42)
            int r0 = r4.A03(r3, r0)
            goto L_0x001d
        L_0x0088:
            X.0s5 r1 = r5.A00
            X.0tC r0 = X.C15910s6.A1Q
            int r0 = r1.A02(r0)
            goto L_0x001d
        L_0x0091:
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = "SELECT _id FROM available_message_view WHERE (message_type != '7') AND timestamp > 0 AND timestamp <= ? ORDER BY sort_id DESC LIMIT 1"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x00c0 }
            r1[r6] = r0     // Catch:{ all -> 0x00c0 }
            android.database.Cursor r1 = r3.A08(r2, r1)     // Catch:{ all -> 0x00c0 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = "_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b9 }
            long r2 = r1.getLong(r0)     // Catch:{ all -> 0x00b9 }
            goto L_0x00b5
        L_0x00b3:
            r2 = 0
        L_0x00b5:
            r1.close()     // Catch:{ all -> 0x00c0 }
            goto L_0x00c5
        L_0x00b9:
            r0 = move-exception
            if (r1 == 0) goto L_0x00bf
            r1.close()     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            throw r0     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            throw r0
        L_0x00c5:
            r4.close()
            java.lang.String r0 = "rowidstore/getRowIdByTimestampExcludeSystemMessages "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r4.append(r2)
            java.lang.String r0 = " | time spent:"
            r4.append(r0)
            long r0 = r5.A01()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00e6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CY.A00(X.1cN, int, boolean):long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0098 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x009d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass1WM r37, com.whatsapp.jid.DeviceJid r38, int r39, long r40, long r42, long r44, long r46) {
        /*
            r36 = this;
            r3 = r36
            X.1RS r2 = r3.A0B
            X.19K r0 = r2.A02
            X.0tf r1 = r0.A02()
            X.1cj r11 = r1.A00()     // Catch:{ all -> 0x009e }
            r10 = 2
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x0099 }
            X.0tf r8 = r0.A02()     // Catch:{ all -> 0x0099 }
            X.0tg r9 = r8.A02     // Catch:{ all -> 0x0094 }
            java.lang.String r7 = "msg_history_sync"
            java.lang.String r6 = "device_id=?  AND sync_type=?  AND status=?"
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0094 }
            r4 = 0
            r14 = r38
            java.lang.String r0 = r14.getRawString()     // Catch:{ all -> 0x0094 }
            r5[r4] = r0     // Catch:{ all -> 0x0094 }
            r4 = 1
            r15 = r39
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0094 }
            r5[r4] = r0     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0094 }
            r5[r10] = r0     // Catch:{ all -> 0x0094 }
            int r4 = r9.A01(r7, r6, r5)     // Catch:{ all -> 0x0094 }
            r2.A01(r8, r14)     // Catch:{ all -> 0x0094 }
            r8.close()     // Catch:{ all -> 0x0099 }
            r0 = 0
            if (r4 <= 0) goto L_0x0045
            r0 = 1
        L_0x0045:
            r18 = -1
            r26 = 0
            r16 = 0
            r28 = 0
            r30 = 0
            r32 = -1
            X.1bK r12 = new X.1bK     // Catch:{ all -> 0x0099 }
            r13 = r37
            r20 = r40
            r22 = r42
            r24 = r44
            r4 = r46
            r17 = r0
            r34 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r24, r26, r28, r30, r32, r34)     // Catch:{ all -> 0x0099 }
            r2.A02(r12)     // Catch:{ all -> 0x0099 }
            r11.A00()     // Catch:{ all -> 0x0099 }
            r2.A01(r1, r14)     // Catch:{ all -> 0x0099 }
            r11.close()     // Catch:{ all -> 0x009e }
            r1.close()
            java.lang.String r1 = "history-sync-manager/addOrUpdateSyncStateWithData sizeLimitBytes: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r4)
            java.lang.String r1 = ", isActivated: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            if (r0 == 0) goto L_0x0093
            X.1Cb r0 = r3.A02
            r0.A02()
        L_0x0093:
            return
        L_0x0094:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0098 }
        L_0x0098:
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x009d }
        L_0x009d:
            throw r0     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CY.A01(X.1WM, com.whatsapp.jid.DeviceJid, int, long, long, long, long):void");
    }
}
