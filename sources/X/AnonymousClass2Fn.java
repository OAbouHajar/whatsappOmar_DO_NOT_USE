package X;

/* renamed from: X.2Fn  reason: invalid class name */
public class AnonymousClass2Fn implements Runnable {
    public long A00 = 0;
    public final int A01;
    public final C16300so A02;
    public final C16440t3 A03;
    public final C16920ts A04;
    public final C16460t6 A05;
    public final AnonymousClass182 A06;
    public final AnonymousClass17R A07;
    public final AnonymousClass2Fm A08;
    public final AnonymousClass17E A09;
    public final C27681Ss A0A;
    public final AnonymousClass16V A0B;
    public final AnonymousClass180 A0C;

    public AnonymousClass2Fn(C16300so r3, C16440t3 r4, C16920ts r5, C16460t6 r6, AnonymousClass182 r7, AnonymousClass17R r8, AnonymousClass2Fm r9, AnonymousClass17E r10, C27681Ss r11, AnonymousClass16V r12, AnonymousClass180 r13, int i2) {
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A09 = r10;
        this.A05 = r6;
        this.A0B = r12;
        this.A0C = r13;
        this.A06 = r7;
        this.A07 = r8;
        this.A0A = r11;
        this.A08 = r9;
        this.A01 = i2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01f7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x01fc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(int r16, long r17) {
        /*
            r15 = this;
            r3 = r17
            java.lang.String r0 = "EphemeralUpdateRunnable/processMessages type: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = r16
            r1.append(r2)
            java.lang.String r0 = " time: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r5 = r15.A01
            r11 = r5
            if (r16 == 0) goto L_0x0077
            r10 = 2
            if (r2 == r10) goto L_0x004e
            r0 = 3
            if (r2 != r0) goto L_0x0046
            X.180 r0 = r15.A0C
            if (r5 != 0) goto L_0x002d
            r11 = -1
        L_0x002d:
            X.0tq r0 = r0.A01
            X.0tf r8 = r0.get()
            X.0tg r6 = r8.A02     // Catch:{ all -> 0x021e }
            java.lang.String r4 = X.AnonymousClass2Fo.A02     // Catch:{ all -> 0x021e }
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x021e }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x021e }
            r3[r1] = r0     // Catch:{ all -> 0x021e }
            android.database.Cursor r4 = r6.A08(r4, r3)     // Catch:{ all -> 0x021e }
            goto L_0x00a7
        L_0x0046:
            java.lang.String r1 = "Invalid job type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x004e:
            X.180 r6 = r15.A0C
            r0 = 1209600000(0x48190800, double:5.97621805E-315)
            long r3 = r17 - r0
            if (r5 != 0) goto L_0x0058
            r11 = -1
        L_0x0058:
            X.0tq r0 = r6.A01
            X.0tf r8 = r0.get()
            X.0tg r9 = r8.A02     // Catch:{ all -> 0x021e }
            java.lang.String r7 = X.AnonymousClass2Fo.A00     // Catch:{ all -> 0x021e }
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ all -> 0x021e }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x021e }
            r6[r1] = r0     // Catch:{ all -> 0x021e }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x021e }
            r6[r1] = r0     // Catch:{ all -> 0x021e }
            android.database.Cursor r4 = r9.A08(r7, r6)     // Catch:{ all -> 0x021e }
            goto L_0x00a7
        L_0x0077:
            X.182 r0 = r15.A06
            X.0tq r0 = r0.A05
            X.0tf r8 = r0.get()
            X.0tg r9 = r8.A02     // Catch:{ all -> 0x021e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x021e }
            r1.<init>()     // Catch:{ all -> 0x021e }
            java.lang.String r0 = X.C46692Fp.A00     // Catch:{ all -> 0x021e }
            r1.append(r0)     // Catch:{ all -> 0x021e }
            if (r5 <= 0) goto L_0x0095
            java.lang.String r0 = " LIMIT "
            r1.append(r0)     // Catch:{ all -> 0x021e }
            r1.append(r5)     // Catch:{ all -> 0x021e }
        L_0x0095:
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x021e }
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x021e }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x021e }
            r6[r1] = r0     // Catch:{ all -> 0x021e }
            android.database.Cursor r4 = r9.A08(r7, r6)     // Catch:{ all -> 0x021e }
        L_0x00a7:
            r8.close()
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0217 }
            r6.<init>()     // Catch:{ all -> 0x0217 }
            r8 = 0
            r9 = 0
            r14 = 0
            if (r4 == 0) goto L_0x010e
        L_0x00b4:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x00f4
            X.0ts r3 = r15.A04     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = "chat_row_id"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0217 }
            long r0 = r4.getLong(r0)     // Catch:{ all -> 0x0217 }
            X.0rv r3 = r3.A05(r0)     // Catch:{ all -> 0x0217 }
            if (r3 != 0) goto L_0x00cf
            int r9 = r9 + 1
            goto L_0x00b4
        L_0x00cf:
            X.17R r0 = r15.A07     // Catch:{ all -> 0x0217 }
            java.util.Map r1 = r0.A03     // Catch:{ all -> 0x0217 }
            java.lang.Object r0 = r1.get(r3)     // Catch:{ all -> 0x0217 }
            if (r0 != 0) goto L_0x00f2
            r0 = 0
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0217 }
            if (r0 != 0) goto L_0x00f2
            X.0t6 r0 = r15.A05     // Catch:{ all -> 0x0217 }
            X.0tZ r0 = r0.A0G(r4, r3)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x00ec
            r6.add(r0)     // Catch:{ all -> 0x0217 }
            goto L_0x00b4
        L_0x00ec:
            java.lang.String r0 = "EphemeralUpdateRunnable/failed to get message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0217 }
            goto L_0x00b4
        L_0x00f2:
            r14 = 2
            goto L_0x00b4
        L_0x00f4:
            if (r9 <= 0) goto L_0x010e
            X.0so r7 = r15.A02     // Catch:{ all -> 0x0217 }
            java.lang.String r3 = "EphemeralUpdateRunnable/processMessages/null_jid"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0217 }
            r1.<init>()     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = "count: "
            r1.append(r0)     // Catch:{ all -> 0x0217 }
            r1.append(r9)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0217 }
            r7.AcB(r3, r0, r8)     // Catch:{ all -> 0x0217 }
        L_0x010e:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0217 }
            if (r0 != 0) goto L_0x020a
            java.lang.String r0 = "EphemeralUpdateRunnable/performJobAction: jobType:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0217 }
            r1.<init>(r0)     // Catch:{ all -> 0x0217 }
            r1.append(r2)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = " num:"
            r1.append(r0)     // Catch:{ all -> 0x0217 }
            int r0 = r6.size()     // Catch:{ all -> 0x0217 }
            r1.append(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0217 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0217 }
            if (r16 == 0) goto L_0x01fd
            r0 = 1
            if (r2 == r0) goto L_0x020a
            r9 = 2
            if (r2 == r9) goto L_0x013b
            goto L_0x0205
        L_0x013b:
            X.180 r8 = r15.A0C     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = "ViewOnceMessageStore/expireMessages/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0217 }
            r1.<init>(r0)     // Catch:{ all -> 0x0217 }
            int r0 = r6.size()     // Catch:{ all -> 0x0217 }
            r1.append(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0217 }
            X.1Zf r7 = new X.1Zf     // Catch:{ all -> 0x0217 }
            r7.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0217 }
            X.0tq r0 = r8.A01     // Catch:{ all -> 0x0217 }
            X.0tf r13 = r0.A02()     // Catch:{ all -> 0x0217 }
            X.1cj r12 = r13.A00()     // Catch:{ all -> 0x01f8 }
            java.util.Iterator r11 = r6.iterator()     // Catch:{ all -> 0x01f3 }
            r3 = 0
        L_0x0168:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x01a8
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x01f3 }
            X.0tZ r10 = (X.C16740tZ) r10     // Catch:{ all -> 0x01f3 }
            int r3 = r3 + 1
            boolean r0 = r10 instanceof X.C39001rl     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x018e
            X.1rl r10 = (X.C39001rl) r10     // Catch:{ all -> 0x01f3 }
            X.0tZ r10 = (X.C16740tZ) r10     // Catch:{ all -> 0x01f3 }
            r2 = r10
            X.1rl r2 = (X.C39001rl) r2     // Catch:{ all -> 0x01f3 }
            r2.Aey(r9)     // Catch:{ all -> 0x01f3 }
            long r0 = r10.A13     // Catch:{ all -> 0x01f3 }
            int r2 = r2.AGz()     // Catch:{ all -> 0x01f3 }
            r8.A01(r0, r2)     // Catch:{ all -> 0x01f3 }
            goto L_0x0168
        L_0x018e:
            long r0 = r10.A13     // Catch:{ all -> 0x01f3 }
            r8.A01(r0, r9)     // Catch:{ all -> 0x01f3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f3 }
            r1.<init>()     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = "ViewOnceMessageStore/expireMessages/updating state of non view-once message: "
            r1.append(r0)     // Catch:{ all -> 0x01f3 }
            r1.append(r10)     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01f3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01f3 }
            goto L_0x0168
        L_0x01a8:
            r12.A00()     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = "success"
            r7.A02(r0)     // Catch:{ all -> 0x01f3 }
            r12.close()     // Catch:{ all -> 0x01f8 }
            r13.close()     // Catch:{ all -> 0x0217 }
            r7.A01()     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = "ViewOnceMessageStore/expireMessages numExpired:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0217 }
            r1.<init>(r0)     // Catch:{ all -> 0x0217 }
            r1.append(r3)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = " numTotal:"
            r1.append(r0)     // Catch:{ all -> 0x0217 }
            int r0 = r6.size()     // Catch:{ all -> 0x0217 }
            r1.append(r0)     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0217 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0217 }
            X.0t6 r0 = r15.A05     // Catch:{ all -> 0x0217 }
            r0.A0o(r6)     // Catch:{ all -> 0x0217 }
            java.util.Iterator r3 = r6.iterator()     // Catch:{ all -> 0x0217 }
        L_0x01e0:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x020a
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0217 }
            X.0tZ r2 = (X.C16740tZ) r2     // Catch:{ all -> 0x0217 }
            X.17E r1 = r15.A09     // Catch:{ all -> 0x0217 }
            r0 = -1
            r1.A00(r2, r0)     // Catch:{ all -> 0x0217 }
            goto L_0x01e0
        L_0x01f3:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x01f7 }
        L_0x01f7:
            throw r0     // Catch:{ all -> 0x01f8 }
        L_0x01f8:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x01fc }
        L_0x01fc:
            throw r0     // Catch:{ all -> 0x0217 }
        L_0x01fd:
            X.0t6 r1 = r15.A05     // Catch:{ all -> 0x0217 }
            r0 = 29
            r1.A0n(r6, r0)     // Catch:{ all -> 0x0217 }
            goto L_0x020a
        L_0x0205:
            X.0t6 r0 = r15.A05     // Catch:{ all -> 0x0217 }
            r0.A0o(r6)     // Catch:{ all -> 0x0217 }
        L_0x020a:
            int r0 = r6.size()     // Catch:{ all -> 0x0217 }
            if (r0 != r5) goto L_0x0211
            r14 = 1
        L_0x0211:
            if (r4 == 0) goto L_0x0216
            r4.close()
        L_0x0216:
            return r14
        L_0x0217:
            r0 = move-exception
            if (r4 == 0) goto L_0x0222
            r4.close()     // Catch:{ all -> 0x0222 }
            throw r0
        L_0x021e:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0222 }
        L_0x0222:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Fn.A00(int, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01e9, code lost:
        if (r0 == null) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0225, code lost:
        if (r12 != null) goto L_0x0227;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x008f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0094 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0143 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x01d8 */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r19 = this;
            java.lang.String r0 = "EphemeralUpdateRunnable/run"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = r19
            X.0t3 r5 = r4.A03
            long r6 = r5.A00()
            r0 = 0
            int r2 = r4.A00(r0, r6)
            r0 = 2
            int r1 = r4.A00(r0, r6)
            r0 = 3
            int r0 = r4.A00(r0, r6)
            r17 = 0
            r13 = 1
            if (r2 == r13) goto L_0x01de
            if (r0 == r13) goto L_0x01de
            if (r1 == r13) goto L_0x01de
            if (r2 == 0) goto L_0x0029
            if (r1 != 0) goto L_0x01eb
        L_0x0029:
            long r2 = r4.A00
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x003e
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            long r1 = r8.toDays(r0)
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0156
        L_0x003e:
            r3 = 100
            java.lang.String r0 = "EphemeralUpdateRunnable/deleteSharedSecrets"
            X.1Zf r2 = new X.1Zf
            r2.<init>((java.lang.String) r0)
        L_0x0047:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            X.1Ss r10 = r4.A0A
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            X.0tq r0 = r10.A00     // Catch:{ Exception -> 0x0095 }
            X.0tf r1 = r0.get()     // Catch:{ Exception -> 0x0095 }
            X.0tg r12 = r1.A02     // Catch:{ all -> 0x0090 }
            java.lang.String r9 = "SELECT message_row_id FROM message_broadcast_ephemeral ORDER BY message_row_id LIMIT ?"
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ all -> 0x0090 }
            r15 = 0
            java.lang.String r14 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x0090 }
            r0[r15] = r14     // Catch:{ all -> 0x0090 }
            android.database.Cursor r9 = r12.A08(r9, r0)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = "message_row_id"
            int r12 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0089 }
        L_0x0070:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0082
            long r14 = r9.getLong(r12)     // Catch:{ all -> 0x0089 }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0089 }
            r11.add(r0)     // Catch:{ all -> 0x0089 }
            goto L_0x0070
        L_0x0082:
            r9.close()     // Catch:{ all -> 0x0090 }
            r1.close()     // Catch:{ Exception -> 0x0095 }
            goto L_0x00a7
        L_0x0089:
            r0 = move-exception
            if (r9 == 0) goto L_0x008f
            r9.close()     // Catch:{ all -> 0x008f }
        L_0x008f:
            throw r0     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0094 }
        L_0x0094:
            throw r0     // Catch:{ Exception -> 0x0095 }
        L_0x0095:
            r9 = move-exception
            java.lang.String r1 = "Unable to get message_row_id from message_broadcast_ephemeral batchSize="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r9)
        L_0x00a7:
            java.util.Iterator r16 = r11.iterator()
        L_0x00ab:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r12 = r16.next()
            java.lang.Number r12 = (java.lang.Number) r12
            X.16V r9 = r4.A0B
            long r0 = r12.longValue()
            X.17B r11 = r9.A02
            r9 = 0
            X.1yA r0 = r11.A05(r9, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r15 = r0.iterator()
        L_0x00ce:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r0 = r15.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r14 = r0.getKey()
            com.whatsapp.jid.DeviceJid r14 = (com.whatsapp.jid.DeviceJid) r14
            java.lang.Object r9 = r0.getValue()
            X.1yB r9 = (X.C42651yB) r9
            X.0sK r1 = r11.A00
            com.whatsapp.jid.UserJid r0 = r14.getUserJid()
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x00ce
            byte r0 = r14.device
            if (r0 == 0) goto L_0x00ce
            long r0 = r9.A00
            int r9 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ab
            goto L_0x00ce
        L_0x00fd:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            r8.add(r0)
            goto L_0x00ab
        L_0x0105:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x014d
            X.0tq r0 = r10.A00     // Catch:{ Exception -> 0x0144 }
            X.0tf r9 = r0.A02()     // Catch:{ Exception -> 0x0144 }
            X.0tg r11 = r9.A02     // Catch:{ all -> 0x013f }
            java.lang.String r10 = "message_broadcast_ephemeral"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x013f }
            r1.<init>()     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "message_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x013f }
            int r0 = r8.size()     // Catch:{ all -> 0x013f }
            java.lang.String r0 = X.C34111ji.A00(r0)     // Catch:{ all -> 0x013f }
            r1.append(r0)     // Catch:{ all -> 0x013f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x013f }
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x013f }
            java.lang.Object[] r0 = r8.toArray(r0)     // Catch:{ all -> 0x013f }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x013f }
            int r0 = r11.A01(r10, r1, r0)     // Catch:{ all -> 0x013f }
            r9.close()     // Catch:{ Exception -> 0x0144 }
            goto L_0x014b
        L_0x013f:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0143 }
        L_0x0143:
            throw r0     // Catch:{ Exception -> 0x0144 }
        L_0x0144:
            r1 = move-exception
            java.lang.String r0 = "Unable to delete shared secrets"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x014d
        L_0x014b:
            if (r0 == r3) goto L_0x0047
        L_0x014d:
            r2.A01()
            long r0 = java.lang.System.nanoTime()
            r4.A00 = r0
        L_0x0156:
            X.182 r0 = r4.A06
            X.0tq r0 = r0.A05
            X.0tf r3 = r0.get()
            X.0tg r9 = r3.A02     // Catch:{ all -> 0x01d9 }
            java.lang.String r8 = "SELECT expire_timestamp FROM message_ephemeral WHERE expire_timestamp >= ? AND keep_in_chat != 1 ORDER BY expire_timestamp LIMIT 1"
            java.lang.String[] r2 = new java.lang.String[r13]     // Catch:{ all -> 0x01d9 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r6)     // Catch:{ all -> 0x01d9 }
            r2[r1] = r0     // Catch:{ all -> 0x01d9 }
            android.database.Cursor r2 = r9.A08(r8, r2)     // Catch:{ all -> 0x01d9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x018a
            java.lang.String r0 = "expire_timestamp"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d2 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.Long r12 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01d2 }
            r2.close()     // Catch:{ all -> 0x01d9 }
            r3.close()
            goto L_0x0191
        L_0x018a:
            r2.close()     // Catch:{ all -> 0x01d9 }
            r3.close()
            r12 = 0
        L_0x0191:
            X.180 r2 = r4.A0C
            r0 = 1209600000(0x48190800, double:5.97621805E-315)
            r10 = 1209600000(0x48190800, double:5.97621805E-315)
            long r6 = r6 - r0
            X.0tq r0 = r2.A01
            X.0tf r3 = r0.get()
            X.0tg r9 = r3.A02     // Catch:{ all -> 0x01d9 }
            java.lang.String r8 = "SELECT message_view.timestamp AS timestamp FROM message_view_once_media view_once  JOIN available_message_view message_view  ON view_once.message_row_id=message_view._id WHERE message_view.timestamp > ?  AND view_once.state = 0 ORDER BY message_view.timestamp ASC  LIMIT 1"
            java.lang.String[] r2 = new java.lang.String[r13]     // Catch:{ all -> 0x01d9 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r6)     // Catch:{ all -> 0x01d9 }
            r2[r1] = r0     // Catch:{ all -> 0x01d9 }
            android.database.Cursor r2 = r9.A08(r8, r2)     // Catch:{ all -> 0x01d9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x01ce
            java.lang.String r0 = "timestamp"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d2 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x01d2 }
            long r0 = r0 + r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01d2 }
            r2.close()     // Catch:{ all -> 0x01d9 }
            r3.close()
            goto L_0x01e7
        L_0x01ce:
            r2.close()     // Catch:{ all -> 0x01d9 }
            goto L_0x01e3
        L_0x01d2:
            r0 = move-exception
            if (r2 == 0) goto L_0x01d8
            r2.close()     // Catch:{ all -> 0x01d8 }
        L_0x01d8:
            throw r0     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            throw r0
        L_0x01de:
            java.lang.Long r5 = java.lang.Long.valueOf(r17)
            goto L_0x01ec
        L_0x01e3:
            r3.close()
            r0 = 0
        L_0x01e7:
            if (r12 != 0) goto L_0x0212
            if (r0 != 0) goto L_0x0227
        L_0x01eb:
            r5 = 0
        L_0x01ec:
            X.2Fm r2 = r4.A08
            if (r2 == 0) goto L_0x0211
            java.lang.String r1 = "EphemeralUpdateRunnable/timeToNextRun: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11K r3 = r2.A00
            if (r5 == 0) goto L_0x0211
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r3.A0A
            r1 = 32
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r3, r1, r5)
            r2.execute(r0)
        L_0x0211:
            return
        L_0x0212:
            if (r0 == 0) goto L_0x0224
            long r2 = r12.longValue()
            long r0 = r0.longValue()
            long r0 = java.lang.Math.min(r2, r0)
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
        L_0x0224:
            r0 = r12
            if (r12 == 0) goto L_0x01eb
        L_0x0227:
            long r2 = r0.longValue()
            long r0 = r5.A00()
            long r2 = r2 - r0
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x01de
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            goto L_0x01ec
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Fn.run():void");
    }
}
