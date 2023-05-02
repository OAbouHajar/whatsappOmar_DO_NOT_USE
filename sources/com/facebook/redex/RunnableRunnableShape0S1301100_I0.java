package com.facebook.redex;

public class RunnableRunnableShape0S1301100_I0 implements Runnable {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public RunnableRunnableShape0S1301100_I0(Object obj, Object obj2, Object obj3, String str, int i2, int i3, long j2) {
        this.A06 = i3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i2;
        this.A01 = j2;
        this.A04 = obj3;
        this.A05 = str;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:200:0x0680 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:215:0x0694 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:220:0x0699 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:225:0x069e */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0469 A[SYNTHETIC, Splitter:B:105:0x0469] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x04b4 A[Catch:{ all -> 0x0690, all -> 0x0694, all -> 0x0695 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x04f0 A[Catch:{ all -> 0x069a, all -> 0x069e, all -> 0x069f }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0537 A[Catch:{ all -> 0x069a, all -> 0x069e, all -> 0x069f }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0541 A[Catch:{ all -> 0x069a, all -> 0x069e, all -> 0x069f }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0551 A[Catch:{ all -> 0x069a, all -> 0x069e, all -> 0x069f }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x05a6 A[Catch:{ all -> 0x069a, all -> 0x069e, all -> 0x069f }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r44 = this;
            r3 = r44
            int r0 = r3.A06
            if (r0 == 0) goto L_0x003a
            java.lang.Object r7 = r3.A02
            X.11H r7 = (X.AnonymousClass11H) r7
            java.lang.Object r6 = r3.A03
            X.0rv r6 = (X.C15830rv) r6
            java.lang.String r5 = r3.A05
            long r0 = r3.A01
            java.lang.Object r4 = r3.A04
            X.1jl r4 = (X.C34141jl) r4
            int r3 = r3.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.0rt r1 = r7.A02
            X.0rx r0 = r1.A06(r6)
            if (r0 != 0) goto L_0x002e
            X.0rx r0 = new X.0rx
            r0.<init>(r6)
            r0.A0d = r5
            r1.A0D(r0, r6)
        L_0x002e:
            r0.A0d = r5
            r0.A01 = r3
            if (r4 == 0) goto L_0x0036
            r0.A0a = r4
        L_0x0036:
            r7.A02(r0, r6, r2)
        L_0x0039:
            return
        L_0x003a:
            java.lang.Object r0 = r3.A02
            r21 = r0
            r0 = r21
            X.0t6 r0 = (X.C16460t6) r0
            r21 = r0
            java.lang.Object r2 = r3.A03
            X.1Vw r2 = (X.C28381Vw) r2
            int r4 = r3.A00
            long r0 = r3.A01
            r42 = r0
            java.lang.Object r0 = r3.A04
            r20 = r0
            r0 = r20
            X.0tZ r0 = (X.C16740tZ) r0
            r20 = r0
            java.lang.String r0 = r3.A05
            r41 = r0
            r0 = r21
            X.0t3 r3 = r0.A0F
            long r16 = android.os.SystemClock.uptimeMillis()
            X.0th r0 = r0.A0K
            X.0tZ r5 = r0.A03(r2)
            if (r5 != 0) goto L_0x00ad
            java.lang.String r0 = "msgstore/receivedbyserver/nosuchmessage: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r2)
        L_0x0076:
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x007d:
            boolean r0 = X.C30921dB.A04(r20)
            if (r0 == 0) goto L_0x0039
            boolean r0 = android.text.TextUtils.isEmpty(r41)
            if (r0 != 0) goto L_0x0039
            r0 = r21
            X.0pd r2 = r0.A1U
            X.0tM r1 = X.C16620tM.A01
            r0 = 2200(0x898, float:3.083E-42)
            boolean r0 = r2.A0E(r1, r0)
            if (r0 == 0) goto L_0x0039
            r0 = r20
            X.1cc r0 = (X.C30581cc) r0
            r20 = r0
            r1 = r41
            r0.A03 = r1
            r0 = r21
            X.17j r0 = r0.A1M
            X.0tq r0 = r0.A01
            X.0tf r6 = r0.A02()
            goto L_0x064c
        L_0x00ad:
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x00d9
            r0 = r21
            X.0sK r0 = r0.A05
            boolean r0 = X.C38621r6.A0T(r0, r5)
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "msgstore/receivedbyserver/error "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0rv r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x007d
        L_0x00d9:
            int r0 = r5.A0C
            r1 = 4
            boolean r0 = X.C42881yp.A02(r0, r1)
            if (r0 == 0) goto L_0x0100
            java.lang.String r0 = "msgstore/receivedbyserver/statusdowngrade: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r2)
            java.lang.String r0 = " current:"
            r3.append(r0)
            int r0 = r5.A0C
            r3.append(r0)
            java.lang.String r0 = " new:"
            r3.append(r0)
            r3.append(r1)
            goto L_0x0076
        L_0x0100:
            r5.A0W(r1)
            r0 = r42
            r5.A0H = r0
            r5.A0A = r4
            X.1Vw r4 = r5.A11
            X.0rv r0 = r4.A00
            r15 = r0
            boolean r22 = X.C16030sJ.A0Q(r0)
            if (r22 == 0) goto L_0x012d
            r0 = r21
            X.11G r0 = r0.A1J
            X.1dI r7 = r0.A05()
            if (r7 == 0) goto L_0x01b3
            long r8 = r7.A03()
            long r0 = r5.A14
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x01b3
            r0 = r42
            r7.A0A(r0)
        L_0x012d:
            r26 = 1
        L_0x012f:
            long r6 = r3.A00()
            boolean r0 = r5 instanceof X.C38831rU
            if (r0 == 0) goto L_0x01b0
            r0 = r5
            X.1rU r0 = (X.C38831rU) r0
            long r0 = r0.A00
        L_0x013c:
            long r6 = r6 - r0
            java.lang.String r0 = "msgstore/receivedbyserver/receipt/server/delay "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = " id="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r21
            X.17h r0 = r0.A1W
            java.util.Set r9 = r0.A02
            boolean r40 = r9.contains(r4)
            r0 = r21
            X.16V r0 = r0.A17
            java.util.Set r1 = r0.A00(r4)
            r0 = r21
            X.0w1 r10 = r0.A06
            int r30 = r0.A07(r5)
            X.0so r8 = r0.A02
            java.util.Set r0 = X.C16030sJ.A0A(r8, r1)
            int r31 = r0.size()
            int r32 = r1.size()
            r3 = 0
            r2 = 0
            r1 = 1
            r0 = 1
            r29 = 1
            r33 = 0
            r34 = 0
            r37 = 0
            r38 = 1
            r39 = 0
            r27 = r10
            r28 = r5
            r35 = r6
            r27.A0I(r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40)
            if (r40 == 0) goto L_0x019e
            r9.remove(r4)
        L_0x019e:
            r6 = r21
            X.17E r7 = r6.A0e
            r6 = 24
            r7.A00(r5, r6)
            r6 = r21
            X.0tq r7 = r6.A0v
            X.0tf r24 = r7.A02()
            goto L_0x01b7
        L_0x01b0:
            long r0 = r5.A0I
            goto L_0x013c
        L_0x01b3:
            r26 = 0
            goto L_0x012f
        L_0x01b7:
            X.1cj r23 = r24.A00()     // Catch:{ all -> 0x069f }
            boolean r25 = X.C16030sJ.A0G(r15)     // Catch:{ all -> 0x069a }
            if (r25 == 0) goto L_0x044a
            if (r22 != 0) goto L_0x044a
            X.17G r9 = r6.A0j     // Catch:{ all -> 0x069a }
            boolean r6 = r9.A08()     // Catch:{ all -> 0x069a }
            if (r6 == 0) goto L_0x027f
            java.util.List r11 = r5.A0Q()     // Catch:{ all -> 0x069a }
            if (r11 == 0) goto L_0x0273
            int r10 = r11.size()     // Catch:{ all -> 0x069a }
            int r6 = r5.A0A     // Catch:{ all -> 0x069a }
            if (r10 < r6) goto L_0x0273
            r6 = 3
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x069a }
            r10.<init>(r6)     // Catch:{ all -> 0x069a }
            int r6 = r5.A0C     // Catch:{ all -> 0x069a }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = "status"
            r10.put(r6, r12)     // Catch:{ all -> 0x069a }
            java.lang.Long r12 = java.lang.Long.valueOf(r42)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = "receipt_server_timestamp"
            r10.put(r6, r12)     // Catch:{ all -> 0x069a }
            int r6 = r5.A0A     // Catch:{ all -> 0x069a }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = "recipient_count"
            r10.put(r6, r12)     // Catch:{ all -> 0x069a }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x069a }
            r12.<init>(r11)     // Catch:{ all -> 0x069a }
            r12.add(r15)     // Catch:{ all -> 0x069a }
            int r6 = r12.size()     // Catch:{ all -> 0x069a }
            int r6 = r6 + 1
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x069a }
            r11.<init>(r6)     // Catch:{ all -> 0x069a }
            java.util.Iterator r14 = r12.iterator()     // Catch:{ all -> 0x069a }
        L_0x0216:
            boolean r6 = r14.hasNext()     // Catch:{ all -> 0x069a }
            if (r6 == 0) goto L_0x0232
            java.lang.Object r12 = r14.next()     // Catch:{ all -> 0x069a }
            X.0rv r12 = (X.C15830rv) r12     // Catch:{ all -> 0x069a }
            r6 = r21
            X.0ts r6 = r6.A0N     // Catch:{ all -> 0x069a }
            long r12 = r6.A02(r12)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x069a }
            r11.add(r6)     // Catch:{ all -> 0x069a }
            goto L_0x0216
        L_0x0232:
            java.lang.String r6 = r4.A01     // Catch:{ all -> 0x069a }
            r11.add(r6)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = "chat_row_id IN "
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x069a }
            r13.<init>(r6)     // Catch:{ all -> 0x069a }
            int r6 = r11.size()     // Catch:{ all -> 0x069a }
            int r6 = r6 - r1
            java.lang.String r6 = X.C34111ji.A00(r6)     // Catch:{ all -> 0x069a }
            r13.append(r6)     // Catch:{ all -> 0x069a }
            java.lang.String r12 = " AND "
            r13.append(r12)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = "from_me = 1"
            r13.append(r6)     // Catch:{ all -> 0x069a }
            r13.append(r12)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = "key_id = ?"
            r13.append(r6)     // Catch:{ all -> 0x069a }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x069a }
            r6 = r24
            X.0tg r6 = r6.A02     // Catch:{ all -> 0x069a }
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x069a }
            java.lang.Object[] r11 = r11.toArray(r3)     // Catch:{ all -> 0x069a }
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ all -> 0x069a }
            java.lang.String r3 = "message"
            r6.A00(r3, r10, r12, r11)     // Catch:{ all -> 0x069a }
            r3 = 1
            goto L_0x027f
        L_0x0273:
            java.lang.String r10 = "message-table-scan"
            java.lang.String r6 = "broadcast-ack"
            r8.AcB(r10, r6, r1)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = "msgstore/updateMessageTableForBroadcastAck falling back to table scan"
            com.whatsapp.util.Log.w((java.lang.String) r6)     // Catch:{ all -> 0x069a }
        L_0x027f:
            r7.A04()     // Catch:{ all -> 0x069a }
            X.1jC r7 = r7.A04     // Catch:{ all -> 0x069a }
            r6 = r24
            boolean r6 = r7.A0D(r6)     // Catch:{ all -> 0x069a }
            if (r6 == 0) goto L_0x031c
            java.util.List r6 = r5.A0Q()     // Catch:{ all -> 0x069a }
            if (r6 == 0) goto L_0x030c
            int r10 = r6.size()     // Catch:{ all -> 0x069a }
            int r7 = r5.A0A     // Catch:{ all -> 0x069a }
            if (r10 < r7) goto L_0x030c
            r7 = 3
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x069a }
            r10.<init>(r7)     // Catch:{ all -> 0x069a }
            int r7 = r5.A0C     // Catch:{ all -> 0x069a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x069a }
            java.lang.String r7 = "status"
            r10.put(r7, r8)     // Catch:{ all -> 0x069a }
            java.lang.Long r8 = java.lang.Long.valueOf(r42)     // Catch:{ all -> 0x069a }
            java.lang.String r7 = "receipt_server_timestamp"
            r10.put(r7, r8)     // Catch:{ all -> 0x069a }
            int r7 = r5.A0A     // Catch:{ all -> 0x069a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x069a }
            java.lang.String r7 = "recipient_count"
            r10.put(r7, r8)     // Catch:{ all -> 0x069a }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x069a }
            r7.<init>(r6)     // Catch:{ all -> 0x069a }
            r7.add(r15)     // Catch:{ all -> 0x069a }
            java.util.ArrayList r7 = X.C16030sJ.A06(r7)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = r4.A01     // Catch:{ all -> 0x069a }
            r7.add(r6)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = "key_remote_jid IN "
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x069a }
            r11.<init>(r6)     // Catch:{ all -> 0x069a }
            int r6 = r7.size()     // Catch:{ all -> 0x069a }
            int r6 = r6 - r1
            java.lang.String r6 = X.C34111ji.A00(r6)     // Catch:{ all -> 0x069a }
            r11.append(r6)     // Catch:{ all -> 0x069a }
            java.lang.String r8 = " AND "
            r11.append(r8)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = "key_from_me = 1"
            r11.append(r6)     // Catch:{ all -> 0x069a }
            r11.append(r8)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = "key_id = ?"
            r11.append(r6)     // Catch:{ all -> 0x069a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x069a }
            r6 = r24
            X.0tg r8 = r6.A02     // Catch:{ all -> 0x069a }
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ all -> 0x069a }
            java.lang.Object[] r7 = r7.toArray(r6)     // Catch:{ all -> 0x069a }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x069a }
            java.lang.String r6 = "messages"
            r8.A00(r6, r10, r11, r7)     // Catch:{ all -> 0x069a }
            goto L_0x031a
        L_0x030c:
            java.lang.String r7 = "message-table-scan"
            java.lang.String r6 = "broadcast-ack"
            r8.AcB(r7, r6, r1)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = "msgstore/updateMessageTableForBroadcastAck falling back to table scan"
            com.whatsapp.util.Log.w((java.lang.String) r6)     // Catch:{ all -> 0x069a }
            r6 = 0
            goto L_0x031b
        L_0x031a:
            r6 = 1
        L_0x031b:
            r3 = r3 | r6
        L_0x031c:
            if (r3 != 0) goto L_0x03d0
            X.0tq r6 = r9.A05     // Catch:{ all -> 0x069a }
            X.0tf r3 = r6.A02()     // Catch:{ all -> 0x069a }
            X.1cj r19 = r3.A00()     // Catch:{ all -> 0x0686 }
            r6.A04()     // Catch:{ all -> 0x067c }
            X.1jC r6 = r6.A04     // Catch:{ all -> 0x067c }
            boolean r6 = r6.A0D(r3)     // Catch:{ all -> 0x067c }
            r18 = 2
            r14 = 3
            java.lang.String r13 = "recipient_count"
            java.lang.String r12 = "receipt_server_timestamp"
            java.lang.String r11 = "status"
            r15 = 0
            if (r6 == 0) goto L_0x0380
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x067c }
            r10.<init>()     // Catch:{ all -> 0x067c }
            int r6 = r5.A0C     // Catch:{ all -> 0x067c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x067c }
            r10.put(r11, r6)     // Catch:{ all -> 0x067c }
            java.lang.Long r6 = java.lang.Long.valueOf(r42)     // Catch:{ all -> 0x067c }
            r10.put(r12, r6)     // Catch:{ all -> 0x067c }
            int r6 = r5.A0A     // Catch:{ all -> 0x067c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x067c }
            r10.put(r13, r6)     // Catch:{ all -> 0x067c }
            java.lang.String[] r8 = new java.lang.String[r14]     // Catch:{ all -> 0x067c }
            long r6 = r5.A0I     // Catch:{ all -> 0x067c }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x067c }
            r8[r2] = r6     // Catch:{ all -> 0x067c }
            boolean r6 = r4.A02     // Catch:{ all -> 0x067c }
            r7 = 0
            if (r6 == 0) goto L_0x036c
            r7 = 1
        L_0x036c:
            java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x067c }
            r8[r1] = r6     // Catch:{ all -> 0x067c }
            java.lang.String r1 = r4.A01     // Catch:{ all -> 0x067c }
            r8[r18] = r1     // Catch:{ all -> 0x067c }
            X.0tg r7 = r3.A02     // Catch:{ all -> 0x067c }
            java.lang.String r6 = "messages"
            java.lang.String r1 = "timestamp = ? AND key_from_me = ? AND key_id = ?"
            r7.A00(r6, r10, r1, r8)     // Catch:{ all -> 0x067c }
        L_0x0380:
            boolean r1 = r9.A08()     // Catch:{ all -> 0x067c }
            if (r1 == 0) goto L_0x03c7
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x067c }
            r1.<init>()     // Catch:{ all -> 0x067c }
            int r6 = r5.A0C     // Catch:{ all -> 0x067c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x067c }
            r1.put(r11, r6)     // Catch:{ all -> 0x067c }
            java.lang.Long r6 = java.lang.Long.valueOf(r42)     // Catch:{ all -> 0x067c }
            r1.put(r12, r6)     // Catch:{ all -> 0x067c }
            int r6 = r5.A0A     // Catch:{ all -> 0x067c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x067c }
            r1.put(r13, r6)     // Catch:{ all -> 0x067c }
            java.lang.String[] r8 = new java.lang.String[r14]     // Catch:{ all -> 0x067c }
            long r6 = r5.A0I     // Catch:{ all -> 0x067c }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x067c }
            r8[r2] = r6     // Catch:{ all -> 0x067c }
            boolean r6 = r4.A02     // Catch:{ all -> 0x067c }
            if (r6 == 0) goto L_0x03b3
            r15 = 1
        L_0x03b3:
            java.lang.String r6 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x067c }
            r8[r0] = r6     // Catch:{ all -> 0x067c }
            java.lang.String r6 = r4.A01     // Catch:{ all -> 0x067c }
            r8[r18] = r6     // Catch:{ all -> 0x067c }
            X.0tg r9 = r3.A02     // Catch:{ all -> 0x067c }
            java.lang.String r7 = "message"
            java.lang.String r6 = "timestamp = ? AND from_me = ? AND key_id = ?"
            r9.A00(r7, r1, r6, r8)     // Catch:{ all -> 0x067c }
        L_0x03c7:
            r19.A00()     // Catch:{ all -> 0x067c }
            r19.close()     // Catch:{ all -> 0x0686 }
            r3.close()     // Catch:{ all -> 0x069a }
        L_0x03d0:
            r1 = r21
            X.182 r1 = r1.A0V     // Catch:{ all -> 0x069a }
            X.17y r1 = r1.A06     // Catch:{ all -> 0x069a }
            X.01Q r6 = r1.A03(r5)     // Catch:{ all -> 0x069a }
            java.lang.String r1 = "SELECT _id FROM message_view"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x069a }
            r3.<init>(r1)     // Catch:{ all -> 0x069a }
            java.lang.Object r1 = r6.A00     // Catch:{ all -> 0x069a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x069a }
            r3.append(r1)     // Catch:{ all -> 0x069a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x069a }
            java.lang.Object r1 = r6.A01     // Catch:{ all -> 0x069a }
            X.01Q r7 = new X.01Q     // Catch:{ all -> 0x069a }
            r7.<init>(r3, r1)     // Catch:{ all -> 0x069a }
            java.lang.String r1 = "UPDATE message_ephemeral SET expire_timestamp=? + ?*(SELECT duration FROM message_ephemeral t2 WHERE message_ephemeral.message_row_id=t2.message_row_id)"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x069a }
            r3.<init>(r1)     // Catch:{ all -> 0x069a }
            java.lang.String r1 = " WHERE message_row_id IN ("
            r3.append(r1)     // Catch:{ all -> 0x069a }
            java.lang.Object r1 = r7.A00     // Catch:{ all -> 0x069a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x069a }
            r3.append(r1)     // Catch:{ all -> 0x069a }
            java.lang.String r1 = ")"
            r3.append(r1)     // Catch:{ all -> 0x069a }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x069a }
            java.lang.Object r1 = r7.A01     // Catch:{ all -> 0x069a }
            X.01Q r3 = new X.01Q     // Catch:{ all -> 0x069a }
            r3.<init>(r6, r1)     // Catch:{ all -> 0x069a }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x069a }
            r8.<init>()     // Catch:{ all -> 0x069a }
            long r6 = r5.A0H     // Catch:{ all -> 0x069a }
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x069a }
            r8.add(r1)     // Catch:{ all -> 0x069a }
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x069a }
            r8.add(r1)     // Catch:{ all -> 0x069a }
            java.lang.Object r1 = r3.A01     // Catch:{ all -> 0x069a }
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x069a }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x069a }
            r8.addAll(r1)     // Catch:{ all -> 0x069a }
            r1 = r24
            X.0tg r6 = r1.A02     // Catch:{ all -> 0x069a }
            java.lang.Object r3 = r3.A00     // Catch:{ all -> 0x069a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x069a }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x069a }
            java.lang.Object[] r1 = r8.toArray(r1)     // Catch:{ all -> 0x069a }
            r6.A0C(r3, r1)     // Catch:{ all -> 0x069a }
            goto L_0x04ed
        L_0x044a:
            X.17G r14 = r6.A0j     // Catch:{ all -> 0x069a }
            X.0tq r6 = r14.A05     // Catch:{ all -> 0x069a }
            X.0tf r13 = r6.A02()     // Catch:{ all -> 0x069a }
            X.1cj r19 = r13.A00()     // Catch:{ all -> 0x0695 }
            r6.A04()     // Catch:{ all -> 0x0690 }
            X.1jC r6 = r6.A04     // Catch:{ all -> 0x0690 }
            boolean r6 = r6.A0D(r13)     // Catch:{ all -> 0x0690 }
            java.lang.String r12 = "recipient_count"
            java.lang.String r11 = "receipt_server_timestamp"
            java.lang.String r10 = "status"
            r9 = 3
            if (r6 == 0) goto L_0x04ae
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0690 }
            r8.<init>(r9)     // Catch:{ all -> 0x0690 }
            int r6 = r5.A0C     // Catch:{ all -> 0x0690 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0690 }
            r8.put(r10, r6)     // Catch:{ all -> 0x0690 }
            java.lang.Long r6 = java.lang.Long.valueOf(r42)     // Catch:{ all -> 0x0690 }
            r8.put(r11, r6)     // Catch:{ all -> 0x0690 }
            int r6 = r5.A0A     // Catch:{ all -> 0x0690 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0690 }
            r8.put(r12, r6)     // Catch:{ all -> 0x0690 }
            X.0tg r6 = r13.A02     // Catch:{ all -> 0x0690 }
            r27 = r6
            java.lang.String r18 = "messages"
            java.lang.String r7 = "key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
            java.lang.String[] r6 = new java.lang.String[r9]     // Catch:{ all -> 0x0690 }
            X.AnonymousClass00B.A06(r15)     // Catch:{ all -> 0x0690 }
            java.lang.String r15 = r15.getRawString()     // Catch:{ all -> 0x0690 }
            r6[r3] = r15     // Catch:{ all -> 0x0690 }
            boolean r15 = r4.A02     // Catch:{ all -> 0x0690 }
            if (r15 == 0) goto L_0x04e3
            java.lang.String r15 = "1"
        L_0x04a0:
            r6[r1] = r15     // Catch:{ all -> 0x0690 }
            r15 = 2
            java.lang.String r1 = r4.A01     // Catch:{ all -> 0x0690 }
            r6[r15] = r1     // Catch:{ all -> 0x0690 }
            r15 = r27
            r1 = r18
            r15.A00(r1, r8, r7, r6)     // Catch:{ all -> 0x0690 }
        L_0x04ae:
            boolean r1 = r14.A08()     // Catch:{ all -> 0x0690 }
            if (r1 == 0) goto L_0x04df
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0690 }
            r7.<init>(r9)     // Catch:{ all -> 0x0690 }
            int r1 = r5.A0C     // Catch:{ all -> 0x0690 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0690 }
            r7.put(r10, r1)     // Catch:{ all -> 0x0690 }
            java.lang.Long r1 = java.lang.Long.valueOf(r42)     // Catch:{ all -> 0x0690 }
            r7.put(r11, r1)     // Catch:{ all -> 0x0690 }
            int r1 = r5.A0A     // Catch:{ all -> 0x0690 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0690 }
            r7.put(r12, r1)     // Catch:{ all -> 0x0690 }
            X.0tg r9 = r13.A02     // Catch:{ all -> 0x0690 }
            java.lang.String r8 = "message"
            java.lang.String r6 = "chat_row_id = ? AND from_me = ? AND key_id = ?"
            java.lang.String[] r1 = r14.A0B(r4)     // Catch:{ all -> 0x0690 }
            r9.A00(r8, r7, r6, r1)     // Catch:{ all -> 0x0690 }
        L_0x04df:
            r19.A00()     // Catch:{ all -> 0x0690 }
            goto L_0x04e6
        L_0x04e3:
            java.lang.String r15 = "0"
            goto L_0x04a0
        L_0x04e6:
            r19.close()     // Catch:{ all -> 0x0695 }
            r13.close()     // Catch:{ all -> 0x069a }
            goto L_0x04ee
        L_0x04ed:
            r3 = 1
        L_0x04ee:
            if (r26 == 0) goto L_0x052f
            r1 = r21
            X.11G r6 = r1.A1J     // Catch:{ all -> 0x069a }
            X.0tq r1 = r6.A02     // Catch:{ all -> 0x069a }
            X.0tf r11 = r1.A02()     // Catch:{ all -> 0x069a }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x0681 }
            r12.<init>(r0)     // Catch:{ all -> 0x0681 }
            java.lang.String r7 = "timestamp"
            java.lang.Long r1 = java.lang.Long.valueOf(r42)     // Catch:{ all -> 0x0681 }
            r12.put(r7, r1)     // Catch:{ all -> 0x0681 }
            boolean r10 = r6.A0H()     // Catch:{ all -> 0x0681 }
            X.0tg r9 = r11.A02     // Catch:{ all -> 0x0681 }
            if (r10 == 0) goto L_0x0526
            java.lang.String r8 = "status_list"
            java.lang.String r7 = "key_remote_jid=?"
        L_0x0516:
            X.1jg r1 = X.C34091jg.A00     // Catch:{ all -> 0x0681 }
            java.lang.String[] r6 = r6.A0K(r1, r10)     // Catch:{ all -> 0x0681 }
            java.lang.String r1 = "updateMyTimestamp/UPDATE"
            X.AnonymousClass11G.A01(r1, r10)     // Catch:{ all -> 0x0681 }
            r9.A00(r8, r12, r7, r6)     // Catch:{ all -> 0x0681 }
            goto L_0x052c
        L_0x0526:
            java.lang.String r8 = "status"
            java.lang.String r7 = "jid_row_id=?"
            goto L_0x0516
        L_0x052c:
            r11.close()     // Catch:{ all -> 0x069a }
        L_0x052f:
            byte r7 = r5.A10     // Catch:{ all -> 0x069a }
            boolean r1 = X.C30921dB.A00(r7)     // Catch:{ all -> 0x069a }
            if (r1 == 0) goto L_0x053f
            r6 = r5
            X.0tY r6 = (X.C16730tY) r6     // Catch:{ all -> 0x069a }
            r1 = r21
            r1.A0j(r6, r0, r2)     // Catch:{ all -> 0x069a }
        L_0x053f:
            if (r25 == 0) goto L_0x054d
            r1 = r21
            X.17H r6 = r1.A0n     // Catch:{ all -> 0x069a }
            X.4xw r1 = new X.4xw     // Catch:{ all -> 0x069a }
            r1.<init>(r5, r3)     // Catch:{ all -> 0x069a }
            r6.A00(r1)     // Catch:{ all -> 0x069a }
        L_0x054d:
            r1 = 36
            if (r7 != r1) goto L_0x05a6
            r12 = r5
            X.1ri r12 = (X.C38971ri) r12     // Catch:{ all -> 0x069a }
            r1 = r21
            X.189 r11 = r1.A0W     // Catch:{ all -> 0x069a }
            X.0rx r10 = r11.A01(r12)     // Catch:{ all -> 0x069a }
            if (r10 == 0) goto L_0x05cd
            X.10R r13 = r11.A01     // Catch:{ all -> 0x069a }
            X.1WV r6 = r10.A0X     // Catch:{ all -> 0x069a }
            X.1Vw r3 = r12.A11     // Catch:{ all -> 0x069a }
            boolean r1 = r3.A02     // Catch:{ all -> 0x069a }
            if (r1 == 0) goto L_0x05cd
            long r8 = r12.A0H     // Catch:{ all -> 0x069a }
            long r6 = r6.ephemeralSettingTimestamp     // Catch:{ all -> 0x069a }
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x058b
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x05cd
            X.0rv r3 = r3.A00     // Catch:{ all -> 0x069a }
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x069a }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x069a }
            X.0sK r1 = r13.A00     // Catch:{ all -> 0x069a }
            r1.A0B()     // Catch:{ all -> 0x069a }
            X.1ZT r1 = r1.A05     // Catch:{ all -> 0x069a }
            if (r1 == 0) goto L_0x058b
            int r1 = r3.compareTo((com.whatsapp.jid.Jid) r1)     // Catch:{ all -> 0x069a }
            if (r1 >= 0) goto L_0x058b
            goto L_0x05cd
        L_0x058b:
            X.1WV r1 = r10.A0X     // Catch:{ all -> 0x069a }
            int r3 = r1.expiration     // Catch:{ all -> 0x069a }
            int r1 = r12.A00     // Catch:{ all -> 0x069a }
            if (r3 == r1) goto L_0x059b
            long r6 = r5.A0H     // Catch:{ all -> 0x069a }
            r1 = r21
            r1.A0z(r5, r6)     // Catch:{ all -> 0x069a }
            goto L_0x05cd
        L_0x059b:
            long r6 = r12.A0H     // Catch:{ all -> 0x069a }
            r10.A0A(r1, r6, r2)     // Catch:{ all -> 0x069a }
            X.0ts r1 = r11.A02     // Catch:{ all -> 0x069a }
            r1.A0E(r10)     // Catch:{ all -> 0x069a }
            goto L_0x05cd
        L_0x05a6:
            int r1 = r5.A04     // Catch:{ all -> 0x069a }
            if (r1 <= 0) goto L_0x05cd
            r1 = r21
            X.182 r3 = r1.A0V     // Catch:{ all -> 0x069a }
            boolean r1 = r4.A02     // Catch:{ all -> 0x069a }
            if (r1 == 0) goto L_0x05cd
            X.0tq r1 = r3.A05     // Catch:{ all -> 0x069a }
            X.0tf r3 = r1.A02()     // Catch:{ all -> 0x069a }
            long r8 = r5.A0H     // Catch:{ all -> 0x0686 }
            int r1 = r5.A04     // Catch:{ all -> 0x0686 }
            long r6 = (long) r1     // Catch:{ all -> 0x0686 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r10
            long r8 = r8 + r6
            java.lang.Long r1 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0686 }
            r5.A0Z = r1     // Catch:{ all -> 0x0686 }
            X.AnonymousClass182.A00(r3, r5)     // Catch:{ all -> 0x0686 }
            r3.close()     // Catch:{ all -> 0x069a }
        L_0x05cd:
            r23.A00()     // Catch:{ all -> 0x069a }
            r23.close()     // Catch:{ all -> 0x069f }
            r24.close()
            X.1Vt r1 = r5.A0L
            if (r1 == 0) goto L_0x061d
            X.1W2 r1 = r1.A0A
            if (r1 == 0) goto L_0x061d
            java.lang.String r9 = r1.A0H()
            if (r9 == 0) goto L_0x061d
            r1 = r21
            X.160 r3 = r1.A1S
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x061d
            X.1tB r1 = r3.A00
            X.0tf r6 = r1.A02()
            X.0tg r8 = r6.A02     // Catch:{ all -> 0x068b }
            java.lang.String r7 = "tmp_transactions"
            java.lang.String r3 = "tmp_id=?"
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x068b }
            r1[r2] = r9     // Catch:{ all -> 0x068b }
            int r1 = r8.A01(r7, r3, r1)     // Catch:{ all -> 0x068b }
            if (r1 == r0) goto L_0x061a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x068b }
            r1.<init>()     // Catch:{ all -> 0x068b }
            java.lang.String r0 = "PAY: PaymentStore removePaymentTransactionTmpInfo could not delete: "
            r1.append(r0)     // Catch:{ all -> 0x068b }
            r1.append(r9)     // Catch:{ all -> 0x068b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x068b }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x068b }
        L_0x061a:
            r6.close()
        L_0x061d:
            if (r22 == 0) goto L_0x063b
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x063b
            boolean r0 = X.C38621r6.A0o(r5)
            if (r0 == 0) goto L_0x063b
            r1 = 4
            int r0 = r5.A0C
            boolean r0 = X.C42881yp.A02(r0, r1)
            if (r0 == 0) goto L_0x063b
            java.util.List r1 = java.util.Collections.singletonList(r5)
            r0 = r21
            r0.A0l(r1)
        L_0x063b:
            r0 = r21
            X.0vN r3 = r0.A0T
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r16
            java.lang.String r0 = "CoreMessageStore/updateMessageReceivedByServerInBackground"
            r3.A00(r0, r1)
            goto L_0x007d
        L_0x064c:
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x068b }
            r8.<init>()     // Catch:{ all -> 0x068b }
            r0 = r20
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x068b }
            java.lang.String r0 = "counter_abuse_token"
            if (r1 == 0) goto L_0x0674
            r8.put(r0, r1)     // Catch:{ all -> 0x068b }
        L_0x065c:
            X.0tg r7 = r6.A02     // Catch:{ all -> 0x068b }
            java.lang.String r5 = "message_text"
            java.lang.String r4 = "message_row_id = ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x068b }
            r2 = 0
            r0 = r20
            long r0 = r0.A13     // Catch:{ all -> 0x068b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x068b }
            r3[r2] = r0     // Catch:{ all -> 0x068b }
            r7.A00(r5, r8, r4, r3)     // Catch:{ all -> 0x068b }
            goto L_0x0678
        L_0x0674:
            r8.putNull(r0)     // Catch:{ all -> 0x068b }
            goto L_0x065c
        L_0x0678:
            r6.close()
            return
        L_0x067c:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x0680 }
        L_0x0680:
            throw r0     // Catch:{ all -> 0x0686 }
        L_0x0681:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0699 }
            goto L_0x0699
        L_0x0686:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0699 }
            goto L_0x0699
        L_0x068b:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x06a3 }
            throw r0
        L_0x0690:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x0694 }
        L_0x0694:
            throw r0     // Catch:{ all -> 0x0695 }
        L_0x0695:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0699 }
        L_0x0699:
            throw r0     // Catch:{ all -> 0x069a }
        L_0x069a:
            r0 = move-exception
            r23.close()     // Catch:{ all -> 0x069e }
        L_0x069e:
            throw r0     // Catch:{ all -> 0x069f }
        L_0x069f:
            r0 = move-exception
            r24.close()     // Catch:{ all -> 0x06a3 }
        L_0x06a3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S1301100_I0.run():void");
    }
}
