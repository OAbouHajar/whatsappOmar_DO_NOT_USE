package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0yh  reason: invalid class name and case insensitive filesystem */
public class C19600yh implements C18950xW {
    public Handler A00;
    public final C16300so A01;
    public final C14870pt A02;
    public final C16040sK A03;
    public final C16600tK A04;
    public final C220416k A05;
    public final C17150uc A06;
    public final AnonymousClass16O A07;
    public final C18260wP A08;
    public final C16000sG A09;
    public final C42481xs A0A;
    public final C220316j A0B;
    public final AnonymousClass12D A0C;
    public final C451227d A0D;
    public final C452627s A0E;
    public final C452527r A0F;
    public final C15800rs A0G;
    public final AnonymousClass01V A0H;
    public final C16440t3 A0I;
    public final C16980tz A0J;
    public final C16260sj A0K;
    public final C14730pf A0L;
    public final C19810z2 A0M;
    public final C14710pd A0N;
    public final C18090w8 A0O;
    public final AnonymousClass12B A0P;
    public final C15960sC A0Q;
    public final AnonymousClass1WA A0R;
    public final Runnable A0S;
    public final Random A0T = new Random();
    public final AtomicBoolean A0U = new AtomicBoolean(false);

    public C19600yh(C16300so r38, C14870pt r39, C16040sK r40, C16600tK r41, C220416k r42, C17150uc r43, AnonymousClass16O r44, C18930xU r45, C18260wP r46, C16000sG r47, C17030uP r48, AnonymousClass120 r49, C220516l r50, C220316j r51, AnonymousClass167 r52, AnonymousClass12D r53, C15800rs r54, AnonymousClass01V r55, C16440t3 r56, C16980tz r57, C16260sj r58, C15860rz r59, AnonymousClass013 r60, C14730pf r61, C17580vJ r62, AnonymousClass137 r63, C19810z2 r64, C14710pd r65, C16490t9 r66, C17190ug r67, C18090w8 r68, C18290wS r69, AnonymousClass12B r70, C15960sC r71, C16320sq r72) {
        C16980tz r10 = r57;
        C14710pd r6 = r65;
        C19810z2 r7 = r64;
        C17030uP r17 = r48;
        C220516l r18 = r50;
        C16300so r15 = r38;
        C18090w8 r5 = r68;
        AnonymousClass12B r4 = r70;
        C18930xU r16 = r45;
        AnonymousClass167 r19 = r52;
        AnonymousClass12D r8 = r53;
        C15800rs r13 = r54;
        AnonymousClass01V r12 = r55;
        C16440t3 r11 = r56;
        C16260sj r9 = r58;
        C15860rz r27 = r59;
        AnonymousClass013 r28 = r60;
        C16260sj r26 = r9;
        C452427q r21 = new C452427q(r10);
        C15800rs r22 = r13;
        AnonymousClass01V r23 = r12;
        C16440t3 r24 = r11;
        C16980tz r25 = r10;
        AnonymousClass12D r20 = r8;
        C42481xs r14 = new C42481xs(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r62, r63, r7, r6, r67, r5, r69, r4);
        C451227d r3 = new C451227d(r11, r66);
        this.A0J = r10;
        this.A0I = r11;
        this.A0N = r6;
        this.A02 = r39;
        this.A01 = r15;
        this.A03 = r40;
        this.A0L = r61;
        this.A09 = r47;
        this.A0H = r12;
        this.A04 = r41;
        this.A0M = r7;
        this.A0D = r3;
        this.A0P = r4;
        this.A0K = r9;
        this.A07 = r44;
        this.A0B = r51;
        this.A0G = r13;
        this.A0O = r5;
        this.A06 = r43;
        this.A0Q = r71;
        this.A08 = r46;
        this.A0C = r8;
        this.A0A = r14;
        this.A05 = r42;
        this.A0S = new RunnableRunnableShape7S0100000_I0_6(r49, 6);
        this.A0R = new AnonymousClass1WA(r72, false);
        this.A0F = new C452527r(r8);
        this.A0E = new C452627s();
    }

    public final synchronized Handler A00() {
        Handler handler;
        handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("sync", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A00 = handler;
        }
        return handler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0139, code lost:
        if (r4.A0C != false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x013b, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x013f, code lost:
        if (r1.A0C == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0141, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0145, code lost:
        if (r4.A0D != false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0147, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x014b, code lost:
        if (r1.A0D == false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x014d, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x014f, code lost:
        r0.A00 = new X.C453027w(r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r11 = r0.A01();
        r11.A00 = java.lang.Math.max(r4.A00, r1.A00);
        r0 = r4.A03;
        r4 = r11.A03;
        r4.addAll(r0);
        r4.addAll(r1.A03);
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0172, code lost:
        r2 = new java.lang.StringBuilder("these requests cannot be combined ");
        r2.append(r4);
        r2.append(" and ");
        r2.append(r1);
        r1 = new java.lang.IllegalStateException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0190, code lost:
        r9 = new X.C453127x(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0197, code lost:
        if (r4.A01 == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0199, code lost:
        A00().postDelayed(r9, 0);
        r2.A02(r4, r9, android.os.SystemClock.elapsedRealtime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01aa, code lost:
        r12 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01b0, code lost:
        if (r12.A08() == false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01bc, code lost:
        if (r3.A0N.A0E(X.C16620tM.A02, 560) == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01c2, code lost:
        if (r12.A06() != false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01c6, code lost:
        if (r5 < 0) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01c8, code lost:
        A00().postDelayed(r9, r5);
        r1 = new java.lang.StringBuilder();
        r1.append("ContactSyncRequestExecutor/delay/combine ");
        r1.append(r5);
        com.whatsapp.util.Log.i(r1.toString());
        r2.A02(r4, r9, android.os.SystemClock.elapsedRealtime() + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01ee, code lost:
        if (r4.A01 == false) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01f0, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f3, code lost:
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01f5, code lost:
        if (r0 != 0) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01f7, code lost:
        r5 = r3.A0E.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01fd, code lost:
        A00().postDelayed(r9, r5);
        r7 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0206, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0208, code lost:
        r5 = (1 << java.lang.Math.min(r0 << 1, 8)) * 1000;
        r5 = java.lang.Math.max(r5 + java.lang.Math.abs(r3.A0T.nextLong() % r5), r3.A0E.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r7.A00.addFirst(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        r3 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0243, code lost:
        if (r3.size() != X.C452627s.A01.length) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0245, code lost:
        r3.removeLast();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0249, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("ContactSyncRequestExecutor/delay ");
        r1.append(r5);
        com.whatsapp.util.Log.i(r1.toString());
        r2.A02(r4, r9, android.os.SystemClock.elapsedRealtime() + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0267, code lost:
        com.whatsapp.util.Log.i("ContactSyncRequestExecutor/freeze until connection returns");
        r2.A02(r4, r9, android.os.SystemClock.elapsedRealtime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0276, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x027c, code lost:
        r1 = new java.lang.StringBuilder("Context/Mode (");
        r1.append(r13);
        r1.append("/");
        r1.append(r11);
        r1.append(") do not represent a recognized SyncType");
        r1 = new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        com.whatsapp.util.Log.i("ContactSyncRequestExecutor/combineRequests");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.A02.remove(r1);
        r0 = (X.C452827u) r2.A01.remove(r1);
        r2.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r5 = java.lang.Math.max(r0.A00 - android.os.SystemClock.elapsedRealtime(), 0);
        A00().removeCallbacks(r0.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r12 != r9) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r12 == r13) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r12 == r9) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r9 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        if (r12 != null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        r13 = r12.context;
        r11 = r9.context;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (r13.compareTo(r11) < 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        r11 = r12.mode;
        r9 = r9.mode;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r11.compareTo(r9) < 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        r15 = X.C34861kz.values();
        r14 = r15.length;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        r12 = r15[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        if (r12.context != r13) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        if (r12.mode != r11) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        r0 = new X.C452927v(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        if (r4.A01 != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a3, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        if (r1.A01 == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a9, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ab, code lost:
        if (r9 >= r14) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ae, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00af, code lost:
        r0.A02 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b3, code lost:
        if (r4.A07 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b5, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b8, code lost:
        if (r1.A07 != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ba, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bb, code lost:
        r0.A03 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bf, code lost:
        if (r4.A08 == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c1, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c4, code lost:
        if (r1.A08 != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c6, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c7, code lost:
        r0.A04 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cb, code lost:
        if (r4.A06 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00cd, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d0, code lost:
        if (r1.A06 == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d2, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d3, code lost:
        r0.A01 = r9;
        X.C452927v.A00(r0, r4.A04);
        X.C452927v.A00(r0, r1.A04);
        r9 = r4.A05;
        r11 = r0.A07;
        r11.addAll(r9);
        r11.addAll(r1.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ed, code lost:
        if (r4.A0A != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ef, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f2, code lost:
        if (r1.A0A == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f4, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f7, code lost:
        if (r4.A0G != false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f9, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fc, code lost:
        if (r1.A0G == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fe, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0101, code lost:
        if (r4.A0H != false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0103, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0106, code lost:
        if (r1.A0H == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0108, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x010b, code lost:
        if (r4.A0F != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x010d, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0110, code lost:
        if (r1.A0F == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0112, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0115, code lost:
        if (r4.A09 != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0117, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x011b, code lost:
        if (r1.A09 == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x011d, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0121, code lost:
        if (r4.A0B != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0123, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0127, code lost:
        if (r1.A0B == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0129, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x012d, code lost:
        if (r4.A0E != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x012f, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0133, code lost:
        if (r1.A0E == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0135, code lost:
        r18 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C452727t r22) {
        /*
            r21 = this;
            r4 = r22
            java.lang.String r1 = "ContactSyncRequestExecutor/queueRequest "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = r21
            java.util.concurrent.atomic.AtomicBoolean r10 = r3.A0U
            monitor-enter(r10)
            r5 = -1
            X.27r r2 = r3.A0F     // Catch:{ all -> 0x029d }
            monitor-enter(r2)     // Catch:{ all -> 0x029d }
            java.util.Set r0 = r2.A02     // Catch:{ all -> 0x0279 }
            monitor-exit(r2)     // Catch:{ all -> 0x029d }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x029d }
        L_0x0024:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x029d }
            r7 = 0
            if (r0 == 0) goto L_0x0190
            java.lang.Object r1 = r11.next()     // Catch:{ all -> 0x029d }
            X.27t r1 = (X.C452727t) r1     // Catch:{ all -> 0x029d }
            X.1kz r9 = r1.A02     // Catch:{ all -> 0x029d }
            X.1kz r12 = r4.A02     // Catch:{ all -> 0x029d }
            if (r9 != r12) goto L_0x0024
            X.1kz r13 = X.C34861kz.A0K     // Catch:{ all -> 0x029d }
            if (r9 == r13) goto L_0x0024
            java.lang.String r0 = "ContactSyncRequestExecutor/combineRequests"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x029d }
            monitor-enter(r2)     // Catch:{ all -> 0x029d }
            java.util.Set r0 = r2.A02     // Catch:{ all -> 0x0279 }
            r0.remove(r1)     // Catch:{ all -> 0x0279 }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0279 }
            java.lang.Object r0 = r0.remove(r1)     // Catch:{ all -> 0x0279 }
            X.27u r0 = (X.C452827u) r0     // Catch:{ all -> 0x0279 }
            r2.A00()     // Catch:{ all -> 0x0279 }
            monitor-exit(r2)     // Catch:{ all -> 0x029d }
            long r5 = r0.A00     // Catch:{ all -> 0x029d }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x029d }
            long r5 = r5 - r14
            long r5 = java.lang.Math.max(r5, r7)     // Catch:{ all -> 0x029d }
            android.os.Handler r11 = r3.A00()     // Catch:{ all -> 0x029d }
            java.lang.Runnable r0 = r0.A01     // Catch:{ all -> 0x029d }
            r11.removeCallbacks(r0)     // Catch:{ all -> 0x029d }
            if (r12 != r9) goto L_0x0172
            if (r12 == r13) goto L_0x0172
            if (r12 == r9) goto L_0x009a
            if (r9 == 0) goto L_0x009a
            if (r12 != 0) goto L_0x0073
            r12 = r9
            goto L_0x009a
        L_0x0073:
            X.27y r13 = r12.context     // Catch:{ all -> 0x029d }
            X.27y r11 = r9.context     // Catch:{ all -> 0x029d }
            int r0 = r13.compareTo(r11)     // Catch:{ all -> 0x029d }
            if (r0 < 0) goto L_0x007e
            r13 = r11
        L_0x007e:
            X.27z r11 = r12.mode     // Catch:{ all -> 0x029d }
            X.27z r9 = r9.mode     // Catch:{ all -> 0x029d }
            int r0 = r11.compareTo(r9)     // Catch:{ all -> 0x029d }
            if (r0 < 0) goto L_0x0089
            r11 = r9
        L_0x0089:
            X.1kz[] r15 = X.C34861kz.values()     // Catch:{ all -> 0x029d }
            int r14 = r15.length     // Catch:{ all -> 0x029d }
            r9 = 0
            goto L_0x00ab
        L_0x0090:
            r12 = r15[r9]     // Catch:{ all -> 0x029d }
            X.27y r0 = r12.context     // Catch:{ all -> 0x029d }
            if (r0 != r13) goto L_0x00a9
            X.27z r0 = r12.mode     // Catch:{ all -> 0x029d }
            if (r0 != r11) goto L_0x00a9
        L_0x009a:
            X.27v r0 = new X.27v     // Catch:{ all -> 0x029d }
            r0.<init>(r12)     // Catch:{ all -> 0x029d }
            boolean r9 = r4.A01     // Catch:{ all -> 0x029d }
            if (r9 != 0) goto L_0x00ae
            boolean r11 = r1.A01     // Catch:{ all -> 0x029d }
            r9 = 0
            if (r11 == 0) goto L_0x00af
            goto L_0x00ae
        L_0x00a9:
            int r9 = r9 + 1
        L_0x00ab:
            if (r9 >= r14) goto L_0x027c
            goto L_0x0090
        L_0x00ae:
            r9 = 1
        L_0x00af:
            r0.A02 = r9     // Catch:{ all -> 0x029d }
            boolean r9 = r4.A07     // Catch:{ all -> 0x029d }
            if (r9 == 0) goto L_0x00ba
            boolean r11 = r1.A07     // Catch:{ all -> 0x029d }
            r9 = 1
            if (r11 != 0) goto L_0x00bb
        L_0x00ba:
            r9 = 0
        L_0x00bb:
            r0.A03 = r9     // Catch:{ all -> 0x029d }
            boolean r9 = r4.A08     // Catch:{ all -> 0x029d }
            if (r9 == 0) goto L_0x00c6
            boolean r11 = r1.A08     // Catch:{ all -> 0x029d }
            r9 = 1
            if (r11 != 0) goto L_0x00c7
        L_0x00c6:
            r9 = 0
        L_0x00c7:
            r0.A04 = r9     // Catch:{ all -> 0x029d }
            boolean r9 = r4.A06     // Catch:{ all -> 0x029d }
            if (r9 != 0) goto L_0x00d2
            boolean r11 = r1.A06     // Catch:{ all -> 0x029d }
            r9 = 0
            if (r11 == 0) goto L_0x00d3
        L_0x00d2:
            r9 = 1
        L_0x00d3:
            r0.A01 = r9     // Catch:{ all -> 0x029d }
            java.util.List r9 = r4.A04     // Catch:{ all -> 0x029d }
            X.C452927v.A00(r0, r9)     // Catch:{ all -> 0x029d }
            java.util.List r9 = r1.A04     // Catch:{ all -> 0x029d }
            X.C452927v.A00(r0, r9)     // Catch:{ all -> 0x029d }
            java.util.Set r9 = r4.A05     // Catch:{ all -> 0x029d }
            java.util.Set r11 = r0.A07     // Catch:{ all -> 0x029d }
            r11.addAll(r9)     // Catch:{ all -> 0x029d }
            java.util.Set r9 = r1.A05     // Catch:{ all -> 0x029d }
            r11.addAll(r9)     // Catch:{ all -> 0x029d }
            boolean r9 = r4.A0A     // Catch:{ all -> 0x029d }
            if (r9 != 0) goto L_0x00f4
            boolean r9 = r1.A0A     // Catch:{ all -> 0x029d }
            r12 = 0
            if (r9 == 0) goto L_0x00f5
        L_0x00f4:
            r12 = 1
        L_0x00f5:
            boolean r9 = r4.A0G     // Catch:{ all -> 0x029d }
            if (r9 != 0) goto L_0x00fe
            boolean r9 = r1.A0G     // Catch:{ all -> 0x029d }
            r13 = 0
            if (r9 == 0) goto L_0x00ff
        L_0x00fe:
            r13 = 1
        L_0x00ff:
            boolean r9 = r4.A0H     // Catch:{ all -> 0x029d }
            if (r9 != 0) goto L_0x0108
            boolean r9 = r1.A0H     // Catch:{ all -> 0x029d }
            r14 = 0
            if (r9 == 0) goto L_0x0109
        L_0x0108:
            r14 = 1
        L_0x0109:
            boolean r9 = r4.A0F     // Catch:{ all -> 0x029d }
            if (r9 != 0) goto L_0x0112
            boolean r9 = r1.A0F     // Catch:{ all -> 0x029d }
            r15 = 0
            if (r9 == 0) goto L_0x0113
        L_0x0112:
            r15 = 1
        L_0x0113:
            boolean r9 = r4.A09     // Catch:{ all -> 0x029d }
            if (r9 != 0) goto L_0x011d
            boolean r9 = r1.A09     // Catch:{ all -> 0x029d }
            r16 = 0
            if (r9 == 0) goto L_0x011f
        L_0x011d:
            r16 = 1
        L_0x011f:
            boolean r9 = r4.A0B     // Catch:{ all -> 0x029d }
            if (r9 != 0) goto L_0x0129
            boolean r9 = r1.A0B     // Catch:{ all -> 0x029d }
            r17 = 0
            if (r9 == 0) goto L_0x012b
        L_0x0129:
            r17 = 1
        L_0x012b:
            boolean r9 = r4.A0E     // Catch:{ all -> 0x029d }
            if (r9 != 0) goto L_0x0135
            boolean r9 = r1.A0E     // Catch:{ all -> 0x029d }
            r18 = 0
            if (r9 == 0) goto L_0x0137
        L_0x0135:
            r18 = 1
        L_0x0137:
            boolean r9 = r4.A0C     // Catch:{ all -> 0x029d }
            if (r9 != 0) goto L_0x0141
            boolean r9 = r1.A0C     // Catch:{ all -> 0x029d }
            r19 = 0
            if (r9 == 0) goto L_0x0143
        L_0x0141:
            r19 = 1
        L_0x0143:
            boolean r9 = r4.A0D     // Catch:{ all -> 0x029d }
            if (r9 != 0) goto L_0x014d
            boolean r9 = r1.A0D     // Catch:{ all -> 0x029d }
            r20 = 0
            if (r9 == 0) goto L_0x014f
        L_0x014d:
            r20 = 1
        L_0x014f:
            X.27w r11 = new X.27w     // Catch:{ all -> 0x029d }
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x029d }
            r0.A00 = r11     // Catch:{ all -> 0x029d }
            X.27t r11 = r0.A01()     // Catch:{ all -> 0x029d }
            int r9 = r4.A00     // Catch:{ all -> 0x029d }
            int r0 = r1.A00     // Catch:{ all -> 0x029d }
            int r0 = java.lang.Math.max(r9, r0)     // Catch:{ all -> 0x029d }
            r11.A00 = r0     // Catch:{ all -> 0x029d }
            java.util.List r0 = r4.A03     // Catch:{ all -> 0x029d }
            java.util.List r4 = r11.A03     // Catch:{ all -> 0x029d }
            r4.addAll(r0)     // Catch:{ all -> 0x029d }
            java.util.List r0 = r1.A03     // Catch:{ all -> 0x029d }
            r4.addAll(r0)     // Catch:{ all -> 0x029d }
            r4 = r11
            goto L_0x0190
        L_0x0172:
            java.lang.String r0 = "these requests cannot be combined "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x029d }
            r2.<init>(r0)     // Catch:{ all -> 0x029d }
            r2.append(r4)     // Catch:{ all -> 0x029d }
            java.lang.String r0 = " and "
            r2.append(r0)     // Catch:{ all -> 0x029d }
            r2.append(r1)     // Catch:{ all -> 0x029d }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x029d }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x029d }
            r1.<init>(r0)     // Catch:{ all -> 0x029d }
            goto L_0x029c
        L_0x0190:
            X.27x r9 = new X.27x     // Catch:{ all -> 0x029d }
            r9.<init>(r3, r4)     // Catch:{ all -> 0x029d }
            boolean r0 = r4.A01     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x01aa
            android.os.Handler r0 = r3.A00()     // Catch:{ all -> 0x029d }
            r0.postDelayed(r9, r7)     // Catch:{ all -> 0x029d }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x029d }
            r2.A02(r4, r9, r0)     // Catch:{ all -> 0x029d }
        L_0x01a7:
            monitor-exit(r10)     // Catch:{ all -> 0x029d }
            goto L_0x0275
        L_0x01aa:
            X.0tK r12 = r3.A04     // Catch:{ all -> 0x029d }
            boolean r0 = r12.A08()     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x0267
            X.0pd r11 = r3.A0N     // Catch:{ all -> 0x029d }
            r1 = 560(0x230, float:7.85E-43)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x029d }
            boolean r0 = r11.A0E(r0, r1)     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x01c4
            boolean r0 = r12.A06()     // Catch:{ all -> 0x029d }
            if (r0 != 0) goto L_0x0267
        L_0x01c4:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x01ec
            android.os.Handler r0 = r3.A00()     // Catch:{ all -> 0x029d }
            r0.postDelayed(r9, r5)     // Catch:{ all -> 0x029d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x029d }
            r1.<init>()     // Catch:{ all -> 0x029d }
            java.lang.String r0 = "ContactSyncRequestExecutor/delay/combine "
            r1.append(r0)     // Catch:{ all -> 0x029d }
            r1.append(r5)     // Catch:{ all -> 0x029d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x029d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x029d }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x029d }
            long r0 = r0 + r5
            r2.A02(r4, r9, r0)     // Catch:{ all -> 0x029d }
            goto L_0x01a7
        L_0x01ec:
            boolean r0 = r4.A01     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x01f3
            r5 = 0
            goto L_0x01fd
        L_0x01f3:
            int r0 = r4.A00     // Catch:{ all -> 0x029d }
            if (r0 != 0) goto L_0x0208
            X.27s r0 = r3.A0E     // Catch:{ all -> 0x029d }
            long r5 = r0.A00()     // Catch:{ all -> 0x029d }
        L_0x01fd:
            android.os.Handler r0 = r3.A00()     // Catch:{ all -> 0x029d }
            r0.postDelayed(r9, r5)     // Catch:{ all -> 0x029d }
            X.27s r7 = r3.A0E     // Catch:{ all -> 0x029d }
            monitor-enter(r7)     // Catch:{ all -> 0x029d }
            goto L_0x022d
        L_0x0208:
            r7 = 1000(0x3e8, double:4.94E-321)
            r5 = 1
            int r1 = r0 << 1
            r0 = 8
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x029d }
            long r5 = r5 << r0
            long r5 = r5 * r7
            java.util.Random r0 = r3.A0T     // Catch:{ all -> 0x029d }
            long r0 = r0.nextLong()     // Catch:{ all -> 0x029d }
            long r0 = r0 % r5
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x029d }
            long r5 = r5 + r0
            X.27s r0 = r3.A0E     // Catch:{ all -> 0x029d }
            long r0 = r0.A00()     // Catch:{ all -> 0x029d }
            long r5 = java.lang.Math.max(r5, r0)     // Catch:{ all -> 0x029d }
            goto L_0x01fd
        L_0x022d:
            java.util.LinkedList r3 = r7.A00     // Catch:{ all -> 0x0276 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0276 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0276 }
            r3.addFirst(r0)     // Catch:{ all -> 0x0276 }
            java.util.LinkedList r3 = r7.A00     // Catch:{ all -> 0x0276 }
            int r1 = r3.size()     // Catch:{ all -> 0x0276 }
            int[] r0 = X.C452627s.A01     // Catch:{ all -> 0x0276 }
            int r0 = r0.length     // Catch:{ all -> 0x0276 }
            if (r1 != r0) goto L_0x0248
            r3.removeLast()     // Catch:{ all -> 0x0276 }
        L_0x0248:
            monitor-exit(r7)     // Catch:{ all -> 0x029d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x029d }
            r1.<init>()     // Catch:{ all -> 0x029d }
            java.lang.String r0 = "ContactSyncRequestExecutor/delay "
            r1.append(r0)     // Catch:{ all -> 0x029d }
            r1.append(r5)     // Catch:{ all -> 0x029d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x029d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x029d }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x029d }
            long r0 = r0 + r5
            r2.A02(r4, r9, r0)     // Catch:{ all -> 0x029d }
            goto L_0x01a7
        L_0x0267:
            java.lang.String r0 = "ContactSyncRequestExecutor/freeze until connection returns"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x029d }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x029d }
            r2.A02(r4, r9, r0)     // Catch:{ all -> 0x029d }
            goto L_0x01a7
        L_0x0275:
            return
        L_0x0276:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x029d }
            goto L_0x029c
        L_0x0279:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x029d }
            goto L_0x029c
        L_0x027c:
            java.lang.String r0 = "Context/Mode ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x029d }
            r1.<init>(r0)     // Catch:{ all -> 0x029d }
            r1.append(r13)     // Catch:{ all -> 0x029d }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x029d }
            r1.append(r11)     // Catch:{ all -> 0x029d }
            java.lang.String r0 = ") do not represent a recognized SyncType"
            r1.append(r0)     // Catch:{ all -> 0x029d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x029d }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x029d }
            r1.<init>(r0)     // Catch:{ all -> 0x029d }
        L_0x029c:
            throw r1     // Catch:{ all -> 0x029d }
        L_0x029d:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x029d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19600yh.A01(X.27t):void");
    }

    public void ARy() {
        if (!this.A0N.A0E(C16620tM.A02, 560)) {
            this.A0R.execute(new RunnableRunnableShape7S0100000_I0_6(this, 9));
        }
    }

    public /* synthetic */ void ARz() {
    }

    public /* synthetic */ void AS0() {
    }

    public void AS1() {
        if (this.A0N.A0E(C16620tM.A02, 560)) {
            this.A0R.execute(new RunnableRunnableShape7S0100000_I0_6(this, 9));
        }
    }
}
