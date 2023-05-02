package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wamsys.JniBridge;
import java.util.Set;

/* renamed from: X.2Fj  reason: invalid class name */
public final class AnonymousClass2Fj implements Runnable {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C16300so A03;
    public final C16040sK A04;
    public final C18020w1 A05;
    public final C19000xb A06;
    public final C16440t3 A07;
    public final C208211s A08;
    public final AnonymousClass16P A09;
    public final AnonymousClass182 A0A;
    public final C27681Ss A0B;
    public final C221816y A0C;
    public final AnonymousClass16V A0D;
    public final C19410yO A0E;
    public final C14710pd A0F;
    public final Jid A0G;
    public final UserJid A0H;
    public final C16740tZ A0I;
    public final AnonymousClass1RV A0J;
    public final AnonymousClass1GC A0K;
    public final C19450yS A0L;
    public final C34421kE A0M;
    public final AnonymousClass1H2 A0N;
    public final JniBridge A0O;
    public final Runnable A0P;
    public final Set A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;

    public AnonymousClass2Fj(C16300so r4, C16040sK r5, C18020w1 r6, C19000xb r7, C16440t3 r8, C208211s r9, AnonymousClass16P r10, C15810rt r11, AnonymousClass182 r12, C27681Ss r13, C221816y r14, AnonymousClass16V r15, C19410yO r16, C14710pd r17, Jid jid, UserJid userJid, C16740tZ r20, AnonymousClass1RV r21, AnonymousClass1GC r22, C19450yS r23, C34421kE r24, AnonymousClass1H2 r25, JniBridge jniBridge, Runnable runnable, Set set, long j2, long j3, long j4, boolean z2, boolean z3) {
        this.A07 = r8;
        this.A0F = r17;
        this.A03 = r4;
        this.A04 = r5;
        this.A0O = jniBridge;
        this.A06 = r7;
        this.A05 = r6;
        this.A09 = r10;
        this.A0J = r21;
        this.A08 = r9;
        this.A0N = r25;
        this.A0D = r15;
        this.A0A = r12;
        this.A0E = r16;
        this.A0L = r23;
        this.A0C = r14;
        this.A0K = r22;
        this.A0B = r13;
        C16740tZ r2 = r20;
        this.A0I = r2;
        this.A0G = jid;
        this.A0H = userJid;
        this.A0Q = set;
        this.A0S = z2;
        this.A0R = z3;
        this.A00 = j2;
        this.A01 = j3;
        this.A02 = j4;
        this.A0P = runnable;
        this.A0M = r24;
        this.A0T = C38621r6.A0Y(r11, r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r3v26, types: [java.util.AbstractMap] */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0354, code lost:
        if (r21 != false) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0366, code lost:
        if (r20 != false) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x041f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0420, code lost:
        r1 = new java.lang.StringBuilder("send message runnable failed to build message; messageId=");
        r1.append(r4);
        com.whatsapp.util.Log.e(r1.toString(), r3);
        r0.A0P.run();
        r0 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0439, code lost:
        if (r0 != null) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x043b, code lost:
        r0.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x043e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0443, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0447, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0136, code lost:
        r7 = r0.A0B;
        r2 = r1.A13;
        r10 = r7.A00.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r10.A02.A0C("INSERT OR REPLACE INTO message_broadcast_ephemeral (message_row_id, shared_secret) VALUES (?, ?)", new java.lang.Object[]{java.lang.Long.valueOf(r2), r6});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0195, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0055, code lost:
        r6 = r13.getType();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0288, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        com.whatsapp.util.Log.e("send message error building sender key distribution message", r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x044c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:164:0x0458 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x041f A[ExcHandler: 23S | NullPointerException (r3v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:78:0x0250] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r71 = this;
            r25 = 0
            r0 = r71
            com.whatsapp.jid.Jid r1 = r0.A0G
            r24 = r1
            if (r1 == 0) goto L_0x045f
            boolean r1 = r24.isProtocolCompliant()
            if (r1 == 0) goto L_0x045f
            java.lang.String r1 = "send message runnable running; messageId="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            X.0tZ r1 = r0.A0I
            X.1Vw r5 = r1.A11
            java.lang.String r4 = r5.A01
            r3.append(r4)
            java.lang.String r2 = "; resend="
            r3.append(r2)
            boolean r2 = r0.A0S
            r23 = r2
            r3.append(r2)
            java.lang.String r2 = "; targetDevices="
            r3.append(r2)
            java.util.Set r2 = r0.A0Q
            r22 = r2
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0rv r13 = r5.A00
            X.0t3 r2 = r0.A07
            r26 = r2
            long r14 = r26.A00()
            boolean r21 = X.C16030sJ.A0L(r13)
            boolean r20 = X.C16030sJ.A0G(r13)
            r3 = 5
            if (r13 == 0) goto L_0x043f
            int r6 = r13.getType()
            r2 = 3
            if (r6 == r2) goto L_0x005e
            if (r6 != r3) goto L_0x043f
        L_0x005e:
            r19 = 1
        L_0x0060:
            X.0sK r8 = r0.A04
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r24)
            if (r2 == 0) goto L_0x0090
            com.whatsapp.jid.UserJid r2 = r2.getUserJid()
            boolean r2 = r8.A0I(r2)
            if (r2 == 0) goto L_0x0090
            X.0yO r2 = r0.A0E
            java.util.List r2 = r2.A06()
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            if (r2 != 0) goto L_0x0090
            java.lang.String r1 = "skip scheduling send message job for self-thread, as there are no paired devices."
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x0086:
            X.1kE r1 = r0.A0M
            if (r1 == 0) goto L_0x008f
            r0 = r25
            r1.A02(r0)
        L_0x008f:
            return
        L_0x0090:
            int r10 = r1.A01
            java.util.concurrent.ConcurrentHashMap r9 = com.obwhatsapp.jobqueue.job.SendE2EMessageJob.A0m
            java.lang.String r7 = r24.getRawString()
            X.2Q1 r6 = new X.2Q1
            r2 = r25
            r6.<init>(r7, r4, r2, r10)
            boolean r7 = r9.containsKey(r6)
            java.lang.String r2 = "send message runnable checking scheduling; messageId="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r4)
            java.lang.String r2 = "; jobAlreadyScheduled="
            r6.append(r2)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            if (r23 == 0) goto L_0x00f5
            if (r7 == 0) goto L_0x00da
            X.1kE r2 = r0.A0M
            if (r2 == 0) goto L_0x00ca
            r1 = r25
            r2.A02(r1)
        L_0x00ca:
            X.0w1 r2 = r0.A05
            int r1 = r4.hashCode()
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x008f
            X.18E r0 = r2.A0E
            r0.A04(r1, r3)
            return
        L_0x00da:
            java.lang.String r2 = "recreating e2e message job because it's not in the scheduled list; message.key="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r5)
            java.lang.String r2 = " edit="
            r3.append(r2)
            int r2 = r1.A01
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x00f5:
            boolean r2 = r1 instanceof X.C38841rV
            if (r2 == 0) goto L_0x0141
            r2 = r1
            X.1rV r2 = (X.C38841rV) r2
            int r2 = r2.A00
            if (r2 <= 0) goto L_0x0141
            java.lang.Integer r33 = java.lang.Integer.valueOf(r2)
        L_0x0104:
            boolean r16 = X.C16030sJ.A0H(r13)
            if (r16 == 0) goto L_0x0218
            int r2 = r1.A0B
            if (r2 != 0) goto L_0x0159
            r2 = 32
            byte[] r6 = new byte[r2]
            java.security.SecureRandom r2 = new java.security.SecureRandom
            r2.<init>()
            r2.nextBytes(r6)
            X.16V r2 = r0.A0D
            java.util.Set r2 = r2.A00(r5)
            java.util.Iterator r3 = r2.iterator()
        L_0x0124:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0198
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            boolean r2 = r8.A0J(r2)
            if (r2 == 0) goto L_0x0124
            X.1Ss r7 = r0.A0B
            long r2 = r1.A13
            X.0tq r7 = r7.A00
            X.0tf r10 = r7.A02()
            goto L_0x0144
        L_0x0141:
            r33 = 0
            goto L_0x0104
        L_0x0144:
            X.0tg r11 = r10.A02     // Catch:{ all -> 0x0443 }
            java.lang.String r9 = "INSERT OR REPLACE INTO message_broadcast_ephemeral (message_row_id, shared_secret) VALUES (?, ?)"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0443 }
            r12 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0443 }
            r7[r12] = r2     // Catch:{ all -> 0x0443 }
            r2 = 1
            r7[r2] = r6     // Catch:{ all -> 0x0443 }
            r11.A0C(r9, r7)     // Catch:{ all -> 0x0443 }
            goto L_0x0195
        L_0x0159:
            X.1Ss r6 = r0.A0B
            long r2 = r1.A13
            X.0tq r6 = r6.A00
            X.0tf r7 = r6.get()
            X.0tg r10 = r7.A02     // Catch:{ all -> 0x0459 }
            java.lang.String r9 = "SELECT shared_secret FROM message_broadcast_ephemeral WHERE message_row_id = ?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0459 }
            r11 = 0
            java.lang.String r2 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x0459 }
            r6[r11] = r2     // Catch:{ all -> 0x0459 }
            android.database.Cursor r3 = r10.A08(r9, r6)     // Catch:{ all -> 0x0459 }
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x0452 }
            if (r2 == 0) goto L_0x018d
            java.lang.String r2 = "shared_secret"
            int r2 = r3.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0452 }
            byte[] r6 = r3.getBlob(r2)     // Catch:{ all -> 0x0452 }
            r3.close()     // Catch:{ all -> 0x0459 }
            r7.close()
            goto L_0x0198
        L_0x018d:
            r3.close()     // Catch:{ all -> 0x0459 }
            r7.close()
            r6 = 0
            goto L_0x0198
        L_0x0195:
            r10.close()
        L_0x0198:
            java.util.Map r2 = r1.A0s
            r18 = r2
            if (r2 != 0) goto L_0x021f
            X.182 r12 = r0.A0A
            X.AnonymousClass00B.A0G(r16)
            java.util.HashMap r18 = new java.util.HashMap
            r18.<init>()
            X.17y r2 = r12.A06
            X.01Q r7 = r2.A03(r1)
            java.lang.String r2 = "SELECT chat_row_id, duration FROM message_view LEFT JOIN message_ephemeral ON _id = message_row_id"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.Object r2 = r7.A00
            java.lang.String r2 = (java.lang.String) r2
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.Object r2 = r7.A01
            X.01Q r9 = new X.01Q
            r9.<init>(r3, r2)
            X.0tq r2 = r12.A05
            X.0tf r17 = r2.get()
            r2 = r17
            X.0tg r7 = r2.A02     // Catch:{ all -> 0x044d }
            java.lang.Object r3 = r9.A00     // Catch:{ all -> 0x044d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x044d }
            java.lang.Object r9 = r9.A01     // Catch:{ all -> 0x044d }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x044d }
            X.AnonymousClass00B.A06(r9)     // Catch:{ all -> 0x044d }
            r11 = 0
            java.lang.String[] r2 = new java.lang.String[r11]     // Catch:{ all -> 0x044d }
            java.lang.Object[] r2 = r9.toArray(r2)     // Catch:{ all -> 0x044d }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x044d }
            android.database.Cursor r10 = r7.A08(r3, r2)     // Catch:{ all -> 0x044d }
            if (r10 == 0) goto L_0x021c
        L_0x01eb:
            boolean r2 = r10.moveToNext()     // Catch:{ all -> 0x0448 }
            if (r2 == 0) goto L_0x0214
            X.0ts r2 = r12.A02     // Catch:{ all -> 0x0448 }
            X.0rv r3 = r2.A06(r10)     // Catch:{ all -> 0x0448 }
            java.lang.String r2 = "duration"
            int r2 = r10.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0448 }
            int r7 = r10.getInt(r2)     // Catch:{ all -> 0x0448 }
            com.whatsapp.jid.DeviceJid r16 = com.whatsapp.jid.DeviceJid.of(r3)     // Catch:{ all -> 0x0448 }
            r2 = 0
            X.1WV r9 = new X.1WV     // Catch:{ all -> 0x0448 }
            r9.<init>(r7, r2, r11)     // Catch:{ all -> 0x0448 }
            r3 = r18
            r2 = r16
            r3.put(r2, r9)     // Catch:{ all -> 0x0448 }
            goto L_0x01eb
        L_0x0214:
            r10.close()     // Catch:{ all -> 0x044d }
            goto L_0x021c
        L_0x0218:
            r6 = 0
            r18 = 0
            goto L_0x021f
        L_0x021c:
            r17.close()
        L_0x021f:
            X.1iD r2 = X.C33211iD.A0o
            X.1Wr r7 = r2.A0U()
            X.1iE r7 = (X.C33221iE) r7
            java.lang.String r3 = "send message runnable loading thumbs; messageId="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.1RV r2 = r0.A0J
            r2.A00(r1)
            java.lang.String r3 = "send message runnable building message; messageId="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            boolean r2 = r1 instanceof X.C39131ry     // Catch:{ 23S | NullPointerException -> 0x041f }
            if (r2 == 0) goto L_0x0267
            X.16y r2 = r0.A0C     // Catch:{ 23S | NullPointerException -> 0x041f }
            java.util.Set r3 = r2.A03(r1)     // Catch:{ 23S | NullPointerException -> 0x041f }
            if (r3 == 0) goto L_0x0400
            boolean r2 = r3.isEmpty()     // Catch:{ 23S | NullPointerException -> 0x041f }
            if (r2 != 0) goto L_0x0400
            r2 = r22
            r2.addAll(r3)     // Catch:{ 23S | NullPointerException -> 0x041f }
        L_0x0267:
            boolean r2 = r1 instanceof X.C39121rx     // Catch:{ 23S | NullPointerException -> 0x041f }
            r16 = r2
            if (r2 == 0) goto L_0x0290
            boolean r2 = r13 instanceof X.C16060sN     // Catch:{ 23S | NullPointerException -> 0x041f }
            if (r2 != 0) goto L_0x0272
            r13 = 0
        L_0x0272:
            X.AnonymousClass00B.A06(r13)     // Catch:{ 23S | NullPointerException -> 0x041f }
            X.16P r9 = r0.A09     // Catch:{ InterruptedException | ExecutionException -> 0x0288, 23S | NullPointerException -> 0x041f }
            r2 = 28
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r3 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1     // Catch:{ InterruptedException | ExecutionException -> 0x0288, 23S | NullPointerException -> 0x041f }
            r3.<init>(r0, r13, r7, r2)     // Catch:{ InterruptedException | ExecutionException -> 0x0288, 23S | NullPointerException -> 0x041f }
            java.util.concurrent.ThreadPoolExecutor r2 = r9.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0288, 23S | NullPointerException -> 0x041f }
            java.util.concurrent.Future r2 = r2.submit(r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0288, 23S | NullPointerException -> 0x041f }
            r2.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0288, 23S | NullPointerException -> 0x041f }
            goto L_0x02c3
        L_0x0288:
            r3 = move-exception
            java.lang.String r2 = "send message error building sender key distribution message"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ 23S | NullPointerException -> 0x041f }
            goto L_0x02c3
        L_0x0290:
            X.1H2 r3 = r0.A0N     // Catch:{ 23S | NullPointerException -> 0x041f }
            X.0w1 r2 = r0.A05     // Catch:{ 23S | NullPointerException -> 0x041f }
            X.0w2 r2 = r2.A09     // Catch:{ 23S | NullPointerException -> 0x041f }
            int r2 = X.C18020w1.A02(r2, r1)     // Catch:{ 23S | NullPointerException -> 0x041f }
            r3.A03(r1, r2)     // Catch:{ 23S | NullPointerException -> 0x041f }
            X.1GC r3 = r0.A0K     // Catch:{ 23S | NullPointerException -> 0x041f }
            X.0pd r10 = r0.A0F     // Catch:{ 23S | NullPointerException -> 0x041f }
            com.whatsapp.wamsys.JniBridge r9 = r0.A0O     // Catch:{ 23S | NullPointerException -> 0x041f }
            X.1WV r39 = X.C40491uD.A01(r1)     // Catch:{ 23S | NullPointerException -> 0x041f }
            r42 = 0
            X.21Q r2 = new X.21Q     // Catch:{ 23S | NullPointerException -> 0x041f }
            r43 = 0
            r44 = 0
            r34 = r2
            r35 = r8
            r36 = r25
            r37 = r10
            r38 = r7
            r40 = r9
            r41 = r6
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ 23S | NullPointerException -> 0x041f }
            r3.A01(r1, r2)     // Catch:{ 23S | NullPointerException -> 0x041f }
        L_0x02c3:
            java.lang.String r3 = "send message runnable creating e2e message job; messageId="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            boolean r56 = X.C38621r6.A0r(r1)
            boolean r2 = r22.isEmpty()
            if (r2 == 0) goto L_0x03fc
            if (r21 != 0) goto L_0x02e3
            if (r19 == 0) goto L_0x03fc
        L_0x02e3:
            X.16V r2 = r0.A0D
            java.util.Set r3 = r2.A00(r5)
            boolean r2 = r0.A0T
            if (r2 == 0) goto L_0x03f5
            X.1ZY r2 = r8.A02()
        L_0x02f1:
            r3.add(r2)
            java.lang.String r35 = X.C37431p9.A00(r3)
        L_0x02f8:
            boolean r2 = r1 instanceof X.C39191s4
            if (r2 == 0) goto L_0x03f0
            r2 = 30000(0x7530, double:1.4822E-319)
        L_0x02fe:
            long r14 = r14 + r2
            long r2 = r0.A02
            r9 = 0
            int r8 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x030b
            long r14 = java.lang.Math.min(r2, r14)
        L_0x030b:
            boolean r2 = r22.isEmpty()
            r69 = r2 ^ 1
            long r45 = android.os.SystemClock.uptimeMillis()
            long r62 = r26.A00()
            long r8 = r0.A00
            long r62 = r62 - r8
            if (r69 == 0) goto L_0x03ea
            r60 = r62
        L_0x0321:
            X.0pd r10 = r0.A0F
            X.1Wm r3 = r7.A02()
            X.1iD r3 = (X.C33211iD) r3
            X.0yS r2 = r0.A0L
            r32 = r2
            X.AnonymousClass00B.A06(r4)
            X.AnonymousClass00B.A06(r24)
            X.AnonymousClass00B.A06(r3)
            X.AnonymousClass00B.A06(r22)
            X.AnonymousClass00B.A06(r32)
            com.whatsapp.jid.UserJid r2 = r0.A0H
            r29 = r2
            int r2 = r1.A0B
            r42 = r2
            byte r2 = r1.A10
            r41 = r2
            boolean r2 = r0.A0R
            r66 = r2
            X.2EC r2 = r1.A0O
            r31 = r2
            if (r20 != 0) goto L_0x0356
            r54 = 0
            if (r21 == 0) goto L_0x0358
        L_0x0356:
            r54 = 1
        L_0x0358:
            long r11 = r0.A01
            int r43 = r1.A07()
            int r2 = r1.A01
            r17 = r2
            if (r21 != 0) goto L_0x0368
            r55 = 0
            if (r20 == 0) goto L_0x036a
        L_0x0368:
            r55 = 1
        L_0x036a:
            boolean r13 = r0.A0T
            r7 = 1785(0x6f9, float:2.501E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r59 = r10.A0E(r2, r7)
            com.obwhatsapp.jobqueue.job.SendE2EMessageJob r7 = new com.obwhatsapp.jobqueue.job.SendE2EMessageJob
            r26 = r7
            r27 = r25
            r28 = r24
            r30 = r3
            r34 = r4
            r36 = r35
            r37 = r18
            r38 = r22
            r39 = r25
            r40 = r6
            r44 = r17
            r47 = r14
            r49 = r8
            r51 = r11
            r53 = r66
            r57 = r13
            r58 = r16
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r47, r49, r51, r53, r54, r55, r56, r57, r58, r59)
            X.0xb r2 = r0.A06
            org.whispersystems.jobqueue.JobParameters r3 = r7.parameters
            java.lang.String r4 = r3.groupId
            X.1Xj r3 = r2.A00
            X.1Xu r3 = r3.A04
            int r57 = r3.A00(r4)
            X.1Xj r3 = r2.A00
            java.util.concurrent.atomic.AtomicInteger r3 = r3.A03
            int r58 = r3.get()
            if (r21 != 0) goto L_0x03e1
            if (r19 != 0) goto L_0x03e1
            r22 = 0
        L_0x03b7:
            X.0w1 r6 = r0.A05
            r52 = 5
            int r5 = r1.A1H
            int r4 = r1.A0B
            r55 = 0
            int r3 = r1.A0A
            r56 = 0
            r67 = 0
            r70 = 0
            r49 = r6
            r50 = r1
            r51 = r22
            r53 = r5
            r54 = r4
            r59 = r3
            r64 = r62
            r68 = r23
            r49.A0J(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r62, r64, r66, r67, r68, r69, r70)
            r2.A00(r7)
            goto L_0x0086
        L_0x03e1:
            if (r69 != 0) goto L_0x03b7
            X.16V r3 = r0.A0D
            java.util.Set r22 = r3.A00(r5)
            goto L_0x03b7
        L_0x03ea:
            long r2 = r1.A18
            long r60 = r45 - r2
            goto L_0x0321
        L_0x03f0:
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x02fe
        L_0x03f5:
            r8.A0B()
            X.1Za r2 = r8.A04
            goto L_0x02f1
        L_0x03fc:
            r35 = 0
            goto L_0x02f8
        L_0x0400:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 23S | NullPointerException -> 0x041f }
            r2.<init>()     // Catch:{ 23S | NullPointerException -> 0x041f }
            java.lang.String r1 = "send message runnable skip sending transient message: "
            r2.append(r1)     // Catch:{ 23S | NullPointerException -> 0x041f }
            r2.append(r5)     // Catch:{ 23S | NullPointerException -> 0x041f }
            java.lang.String r1 = r2.toString()     // Catch:{ 23S | NullPointerException -> 0x041f }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 23S | NullPointerException -> 0x041f }
            X.1kE r2 = r0.A0M     // Catch:{ 23S | NullPointerException -> 0x041f }
            if (r2 == 0) goto L_0x008f
            r1 = r25
            r2.A02(r1)     // Catch:{ 23S | NullPointerException -> 0x041f }
            goto L_0x045e
        L_0x041f:
            r3 = move-exception
            java.lang.String r2 = "send message runnable failed to build message; messageId="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.e(r1, r3)
            java.lang.Runnable r1 = r0.A0P
            r1.run()
            X.1kE r0 = r0.A0M
            if (r0 == 0) goto L_0x008f
            r0.A01(r3)
            return
        L_0x043f:
            r19 = 0
            goto L_0x0060
        L_0x0443:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x045d }
            throw r0
        L_0x0448:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x044c }
        L_0x044c:
            throw r0     // Catch:{ all -> 0x044d }
        L_0x044d:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x045d }
            throw r0
        L_0x0452:
            r0 = move-exception
            if (r3 == 0) goto L_0x0458
            r3.close()     // Catch:{ all -> 0x0458 }
        L_0x0458:
            throw r0     // Catch:{ all -> 0x0459 }
        L_0x0459:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x045d }
        L_0x045d:
            throw r0
        L_0x045e:
            return
        L_0x045f:
            java.lang.String r0 = "Attempting to send message with invalid jid: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r24
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Fj.run():void");
    }
}
