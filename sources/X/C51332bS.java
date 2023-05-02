package X;

import android.os.Handler;

/* renamed from: X.2bS  reason: invalid class name and case insensitive filesystem */
public class C51332bS implements Runnable {
    public int A00 = 0;
    public long A01 = 0;
    public Handler A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public final C16040sK A05;
    public final AnonymousClass138 A06;
    public final C19000xb A07;
    public final AnonymousClass468 A08;
    public final AnonymousClass1DP A09;
    public final C16000sG A0A;
    public final C16080sP A0B;
    public final C19230xz A0C;
    public final AnonymousClass12D A0D;
    public final AnonymousClass16U A0E;
    public final C222417e A0F;
    public final C15860rz A0G;
    public final C16290sm A0H;
    public final AnonymousClass013 A0I;
    public final C216114t A0J;
    public final C18590ww A0K;
    public final AnonymousClass11G A0L;
    public final C220616m A0M;
    public final C16490t9 A0N;
    public final C17240ul A0O;
    public final AnonymousClass0y3 A0P;
    public final C18500wn A0Q;
    public final C18320wV A0R;
    public final AnonymousClass12B A0S;
    public final C82964Ev A0T;
    public final C19760yx A0U;
    public final AnonymousClass1Sh A0V;
    public final C211112v A0W;
    public final C19450yS A0X;
    public final C17770vc A0Y;

    public C51332bS(Handler handler, C16040sK r4, AnonymousClass138 r5, C19000xb r6, AnonymousClass468 r7, AnonymousClass1DP r8, C16000sG r9, C16080sP r10, C19230xz r11, AnonymousClass12D r12, AnonymousClass16U r13, C222417e r14, C15860rz r15, C16290sm r16, AnonymousClass013 r17, C216114t r18, C18590ww r19, AnonymousClass11G r20, C220616m r21, C16490t9 r22, C17240ul r23, AnonymousClass0y3 r24, C18500wn r25, C18320wV r26, AnonymousClass12B r27, C82964Ev r28, C19760yx r29, AnonymousClass1Sh r30, C211112v r31, C19450yS r32, C17770vc r33) {
        this.A0W = r31;
        this.A05 = r4;
        this.A0N = r22;
        this.A0F = r14;
        this.A0L = r20;
        this.A07 = r6;
        this.A0A = r9;
        this.A0B = r10;
        this.A0I = r17;
        this.A08 = r7;
        this.A0Y = r33;
        this.A0O = r23;
        this.A0E = r13;
        this.A0C = r11;
        this.A0P = r24;
        this.A0S = r27;
        this.A0U = r29;
        this.A0G = r15;
        this.A0Q = r25;
        this.A06 = r5;
        this.A0X = r32;
        this.A0M = r21;
        this.A0R = r26;
        this.A0V = r30;
        this.A0K = r19;
        this.A0J = r18;
        this.A0H = r16;
        this.A09 = r8;
        this.A0D = r12;
        this.A0T = r28;
        this.A02 = handler;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02ab, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02b1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02b2, code lost:
        r11.A03 = true;
        r0 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b6, code lost:
        if (r0 != null) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02b8, code lost:
        r0.sendEmptyMessage(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bb, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4 = X.AnonymousClass284.A03;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x009c */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            r2 = 0
            r3 = 1
            java.lang.String r0 = "registername/initializer/run"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02b1 }
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02b1 }
            long r4 = r11.A01     // Catch:{ all -> 0x02b1 }
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            r11.A01 = r6     // Catch:{ all -> 0x02b1 }
        L_0x0015:
            r8 = 3
            X.12D r0 = r11.A0D     // Catch:{ all -> 0x02b1 }
            r0.A02()     // Catch:{ all -> 0x02b1 }
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02b1 }
            X.1kz r0 = X.C34861kz.A0J     // Catch:{ all -> 0x02b1 }
            X.27v r1 = new X.27v     // Catch:{ all -> 0x02b1 }
            r1.<init>(r0)     // Catch:{ all -> 0x02b1 }
            r1.A02 = r3     // Catch:{ all -> 0x02b1 }
            X.27w r0 = X.C453027w.A09     // Catch:{ all -> 0x02b1 }
            r1.A00 = r0     // Catch:{ all -> 0x02b1 }
            r1.A01 = r3     // Catch:{ all -> 0x02b1 }
            X.27t r4 = r1.A01()     // Catch:{ all -> 0x02b1 }
            android.os.Handler r1 = r11.A02     // Catch:{ all -> 0x02b1 }
            X.0xz r0 = r11.A0C     // Catch:{ all -> 0x02b1 }
            if (r1 == 0) goto L_0x0091
            X.284 r4 = r0.A01(r4)     // Catch:{ all -> 0x02b1 }
        L_0x003b:
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02b1 }
            X.16U r1 = r11.A0E     // Catch:{ all -> 0x02b1 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x02b1 }
            r5.<init>()     // Catch:{ all -> 0x02b1 }
            X.0rs r0 = r1.A03     // Catch:{ all -> 0x02b1 }
            java.util.Set r7 = r0.A0A()     // Catch:{ all -> 0x02b1 }
            X.0sG r0 = r1.A01     // Catch:{ all -> 0x02b1 }
            java.util.ArrayList r0 = r0.A0F()     // Catch:{ all -> 0x02b1 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x02b1 }
        L_0x0055:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x009f
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x02b1 }
            X.0sH r9 = (X.C16010sH) r9     // Catch:{ all -> 0x02b1 }
            X.0rv r0 = r9.A0E     // Catch:{ all -> 0x02b1 }
            boolean r0 = X.AnonymousClass288.A04(r0)     // Catch:{ all -> 0x02b1 }
            if (r0 != 0) goto L_0x0055
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r9.A08(r6)     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x0055
            X.1ko r0 = r9.A0D     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x02b1 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02b1 }
            if (r0 != 0) goto L_0x007e
            goto L_0x0055
        L_0x007e:
            X.0rv r0 = r9.A0E     // Catch:{ all -> 0x02b1 }
            boolean r0 = r7.contains(r0)     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x0055
            com.whatsapp.jid.Jid r0 = r9.A08(r6)     // Catch:{ all -> 0x02b1 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x02b1 }
            r5.add(r0)     // Catch:{ all -> 0x02b1 }
            goto L_0x0055
        L_0x0091:
            X.1kE r0 = r0.A03(r4, r3)     // Catch:{ all -> 0x02b1 }
            java.lang.Object r4 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x009c }
            X.284 r4 = (X.AnonymousClass284) r4     // Catch:{ InterruptedException | ExecutionException -> 0x009c }
            goto L_0x003b
        L_0x009c:
            X.284 r4 = X.AnonymousClass284.A03     // Catch:{ all -> 0x02b1 }
            goto L_0x003b
        L_0x009f:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x02b1 }
            if (r0 != 0) goto L_0x00b0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r2]     // Catch:{ all -> 0x02b1 }
            java.lang.Object[] r0 = r5.toArray(r0)     // Catch:{ all -> 0x02b1 }
            com.whatsapp.jid.UserJid[] r0 = (com.whatsapp.jid.UserJid[]) r0     // Catch:{ all -> 0x02b1 }
            r1.A01(r0, r8)     // Catch:{ all -> 0x02b1 }
        L_0x00b0:
            java.lang.String r1 = "registername/initializer/sync/done result="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b1 }
            r0.<init>(r1)     // Catch:{ all -> 0x02b1 }
            r0.append(r4)     // Catch:{ all -> 0x02b1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02b1 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02b1 }
            if (r4 == 0) goto L_0x00d5
            int r1 = r4.A00     // Catch:{ all -> 0x02b1 }
            if (r1 != 0) goto L_0x00cb
            r11.A00 = r3     // Catch:{ all -> 0x02b1 }
            goto L_0x02a1
        L_0x00cb:
            r0 = 4
            if (r1 == r0) goto L_0x00d1
            r0 = 6
            if (r1 != r0) goto L_0x00d5
        L_0x00d1:
            r11.A00 = r8     // Catch:{ all -> 0x02b1 }
            goto L_0x02a1
        L_0x00d5:
            java.lang.String r0 = "registername/setconnection/active"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02b1 }
            X.0y3 r0 = r11.A0P     // Catch:{ all -> 0x02b1 }
            r0.A03(r3)     // Catch:{ all -> 0x02b1 }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02b1 }
            long r0 = r11.A01     // Catch:{ all -> 0x02b1 }
            long r9 = r9 - r0
        L_0x00e6:
            X.0ul r1 = r11.A0O     // Catch:{ all -> 0x02b1 }
            boolean r0 = r1.A13     // Catch:{ all -> 0x02b1 }
            r6 = 45000(0xafc8, double:2.2233E-319)
            r4 = 200(0xc8, double:9.9E-322)
            if (r0 == 0) goto L_0x00fa
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fa
            long r9 = r9 + r4
            android.os.SystemClock.sleep(r4)     // Catch:{ all -> 0x02b1 }
            goto L_0x00e6
        L_0x00fa:
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0105
            boolean r0 = r1.A13     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x0105
            r1.A0C(r8)     // Catch:{ all -> 0x02b1 }
        L_0x0105:
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02b1 }
            java.lang.String r0 = "registername/shouldrefreshlists"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02b1 }
            X.0rz r6 = r11.A0G     // Catch:{ all -> 0x02b1 }
            android.content.SharedPreferences$Editor r1 = r6.A0K()     // Catch:{ all -> 0x02b1 }
            java.lang.String r0 = "refresh_broadcast_lists"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r3)     // Catch:{ all -> 0x02b1 }
            r0.apply()     // Catch:{ all -> 0x02b1 }
            X.0wn r0 = r11.A0Q     // Catch:{ all -> 0x02b1 }
            r0.A00()     // Catch:{ all -> 0x02b1 }
            X.138 r1 = r11.A06     // Catch:{ all -> 0x02b1 }
            r0 = 0
            r1.A00(r0)     // Catch:{ all -> 0x02b1 }
            X.16m r0 = r11.A0M     // Catch:{ all -> 0x02b1 }
            r0.A00()     // Catch:{ all -> 0x02b1 }
            X.0ww r0 = r11.A0K     // Catch:{ all -> 0x02b1 }
            X.0tq r0 = r0.A00     // Catch:{ all -> 0x02b1 }
            r0.A04()     // Catch:{ all -> 0x02b1 }
            java.io.File r0 = r0.A06     // Catch:{ all -> 0x02b1 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x014c
            X.11G r0 = r11.A0L     // Catch:{ all -> 0x02b1 }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x02b1 }
            if (r0 != 0) goto L_0x014c
            X.0xb r1 = r11.A07     // Catch:{ all -> 0x02b1 }
            com.obwhatsapp.jobqueue.job.GetStatusPrivacyJob r0 = com.obwhatsapp.jobqueue.job.GetStatusPrivacyJob.A00()     // Catch:{ all -> 0x02b1 }
            r1.A00(r0)     // Catch:{ all -> 0x02b1 }
        L_0x014c:
            X.0wV r0 = r11.A0R     // Catch:{ all -> 0x02b1 }
            r0.A01(r3, r2)     // Catch:{ all -> 0x02b1 }
            java.lang.String r0 = "registername/reintialized payments"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02b1 }
            r6.A1F(r2)     // Catch:{ all -> 0x02b1 }
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02b1 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x02b1 }
            r8.<init>()     // Catch:{ all -> 0x02b1 }
            X.14t r0 = r11.A0J     // Catch:{ all -> 0x02b1 }
            r10 = 50
            java.util.List r0 = r0.A03(r10)     // Catch:{ all -> 0x02b1 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x02b1 }
        L_0x016d:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x02b1 }
            r7 = 2
            if (r0 == 0) goto L_0x019c
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x02b1 }
            X.0sH r5 = (X.C16010sH) r5     // Catch:{ all -> 0x02b1 }
            java.lang.Class<X.0rv> r4 = X.C15830rv.class
            com.whatsapp.jid.Jid r1 = r5.A08(r4)     // Catch:{ all -> 0x02b1 }
            X.0rv r1 = (X.C15830rv) r1     // Catch:{ all -> 0x02b1 }
            if (r1 == 0) goto L_0x016d
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x0190
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x02b1 }
            r8.put(r1, r0)     // Catch:{ all -> 0x02b1 }
            goto L_0x016d
        L_0x0190:
            X.12B r1 = r11.A0S     // Catch:{ all -> 0x02b1 }
            com.whatsapp.jid.Jid r0 = r5.A08(r4)     // Catch:{ all -> 0x02b1 }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x02b1 }
            r1.A01(r0, r2, r7)     // Catch:{ all -> 0x02b1 }
            goto L_0x016d
        L_0x019c:
            X.0sG r0 = r11.A0A     // Catch:{ all -> 0x02b1 }
            java.util.ArrayList r5 = r0.A0F()     // Catch:{ all -> 0x02b1 }
            X.0sP r4 = r11.A0B     // Catch:{ all -> 0x02b1 }
            X.013 r1 = r11.A0I     // Catch:{ all -> 0x02b1 }
            X.26p r0 = new X.26p     // Catch:{ all -> 0x02b1 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x02b1 }
            java.util.Collections.sort(r5, r0)     // Catch:{ all -> 0x02b1 }
            java.util.Iterator r9 = r5.iterator()     // Catch:{ all -> 0x02b1 }
            r5 = 0
        L_0x01b3:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x01dc
            java.lang.Object r4 = r9.next()     // Catch:{ all -> 0x02b1 }
            X.0sH r4 = (X.C16010sH) r4     // Catch:{ all -> 0x02b1 }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r4.A08(r0)     // Catch:{ all -> 0x02b1 }
            boolean r0 = r4.A0i     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x01b3
            if (r1 == 0) goto L_0x01b3
            boolean r0 = r8.containsKey(r1)     // Catch:{ all -> 0x02b1 }
            if (r0 != 0) goto L_0x01b3
            int r5 = r5 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x02b1 }
            r8.put(r1, r0)     // Catch:{ all -> 0x02b1 }
            if (r5 <= r10) goto L_0x01b3
        L_0x01dc:
            X.12B r5 = r11.A0S     // Catch:{ all -> 0x02b1 }
            X.0pd r4 = r5.A09     // Catch:{ all -> 0x02b1 }
            r1 = 609(0x261, float:8.53E-43)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x02b1 }
            int r0 = r4.A03(r0, r1)     // Catch:{ all -> 0x02b1 }
            if (r0 < r3) goto L_0x0208
            java.util.Set r1 = r8.keySet()     // Catch:{ all -> 0x02b1 }
            r0 = 0
            r5.A04(r0, r1, r7)     // Catch:{ all -> 0x02b1 }
        L_0x01f2:
            X.0sK r1 = r11.A05     // Catch:{ all -> 0x02b1 }
            r1.A0B()     // Catch:{ all -> 0x02b1 }
            X.1Zb r0 = r1.A01     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x0230
            int r0 = r0.A04     // Catch:{ all -> 0x02b1 }
            if (r0 != 0) goto L_0x0230
            r1.A0B()     // Catch:{ all -> 0x02b1 }
            X.1ZT r0 = r1.A05     // Catch:{ all -> 0x02b1 }
            r5.A01(r0, r2, r3)     // Catch:{ all -> 0x02b1 }
            goto L_0x0230
        L_0x0208:
            java.util.Set r0 = r8.entrySet()     // Catch:{ all -> 0x02b1 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x02b1 }
        L_0x0210:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x01f2
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x02b1 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x02b1 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x02b1 }
            X.0rv r1 = (X.C15830rv) r1     // Catch:{ all -> 0x02b1 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x02b1 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x02b1 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x02b1 }
            r5.A01(r1, r0, r7)     // Catch:{ all -> 0x02b1 }
            goto L_0x0210
        L_0x0230:
            r9 = 0
        L_0x0231:
            X.0vc r0 = r11.A0Y     // Catch:{ all -> 0x02b1 }
            X.1ui r1 = r0.A02     // Catch:{ all -> 0x02b1 }
            monitor-enter(r1)     // Catch:{ all -> 0x02b1 }
            java.util.HashMap r0 = r1.A00     // Catch:{ all -> 0x02ae }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02ae }
            monitor-exit(r1)     // Catch:{ all -> 0x02b1 }
            r7 = 10000(0x2710, double:4.9407E-320)
            if (r0 != 0) goto L_0x024e
            long r4 = (long) r9     // Catch:{ all -> 0x02b1 }
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x024e
            r0 = 200(0xc8, double:9.9E-322)
            android.os.SystemClock.sleep(r0)     // Catch:{ all -> 0x02b1 }
            int r9 = r9 + 200
            goto L_0x0231
        L_0x024e:
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02b1 }
            r11.A04 = r3     // Catch:{ all -> 0x02b1 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02b1 }
            android.content.SharedPreferences$Editor r1 = r6.A0K()     // Catch:{ all -> 0x02b1 }
            java.lang.String r0 = "registration_initialized_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r4)     // Catch:{ all -> 0x02b1 }
            r0.apply()     // Catch:{ all -> 0x02b1 }
            X.0yx r1 = r11.A0U     // Catch:{ all -> 0x02b1 }
            r0 = 3
            r1.A0A(r0)     // Catch:{ all -> 0x02b1 }
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02b1 }
            java.lang.String r0 = "registername/setregverified"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02b1 }
            r0 = 0
            r11.A01 = r0     // Catch:{ all -> 0x02b1 }
            java.lang.String r0 = "registername/fin/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02b1 }
            boolean r0 = r6.A1b()     // Catch:{ all -> 0x02b1 }
            if (r0 != 0) goto L_0x028b
            java.lang.String r0 = "RegistrationInitializer/Enabling archive2.0"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02b1 }
            X.17e r0 = r11.A0F     // Catch:{ all -> 0x02b1 }
            r0.A02()     // Catch:{ all -> 0x02b1 }
        L_0x028b:
            X.1DP r1 = r11.A09     // Catch:{ all -> 0x02b1 }
            monitor-enter(r1)     // Catch:{ all -> 0x02b1 }
            X.16S r0 = r1.A03     // Catch:{ all -> 0x02ab }
            X.0rz r0 = r0.A01     // Catch:{ all -> 0x02ab }
            boolean r0 = r0.A1d()     // Catch:{ all -> 0x02ab }
            if (r0 != 0) goto L_0x02a0
            java.lang.String r0 = "MDOptInInitializer/forceOptIn updated"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02ab }
            r1.A00()     // Catch:{ all -> 0x02ab }
        L_0x02a0:
            monitor-exit(r1)     // Catch:{ all -> 0x02b1 }
        L_0x02a1:
            r11.A03 = r3
            android.os.Handler r0 = r11.A02
            if (r0 == 0) goto L_0x02aa
            r0.sendEmptyMessage(r2)
        L_0x02aa:
            return
        L_0x02ab:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02b1 }
            goto L_0x02b0
        L_0x02ae:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02b1 }
        L_0x02b0:
            throw r0     // Catch:{ all -> 0x02b1 }
        L_0x02b1:
            r1 = move-exception
            r11.A03 = r3
            android.os.Handler r0 = r11.A02
            if (r0 == 0) goto L_0x02bb
            r0.sendEmptyMessage(r2)
        L_0x02bb:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51332bS.run():void");
    }
}
