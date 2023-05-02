package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wamsys.JniBridge;
import java.util.HashSet;

/* renamed from: X.0y3  reason: invalid class name */
public class AnonymousClass0y3 {
    public final C16300so A00;
    public final AnonymousClass1H8 A01;
    public final C16040sK A02;
    public final C18020w1 A03;
    public final C19000xb A04;
    public final C16600tK A05;
    public final C16440t3 A06;
    public final C208211s A07;
    public final AnonymousClass16P A08;
    public final C15810rt A09;
    public final AnonymousClass182 A0A;
    public final C16070sO A0B;
    public final C27681Ss A0C;
    public final C221816y A0D;
    public final AnonymousClass16V A0E;
    public final C19410yO A0F;
    public final C14710pd A0G;
    public final C222717h A0H;
    public final C17190ug A0I;
    public final C19090xk A0J;
    public final AnonymousClass1RV A0K;
    public final AnonymousClass1GC A0L;
    public final C19450yS A0M;
    public final AnonymousClass1H2 A0N;
    public final AnonymousClass1WA A0O;
    public final JniBridge A0P;

    public AnonymousClass0y3(C16300so r4, AnonymousClass1H8 r5, C16040sK r6, C18020w1 r7, C19000xb r8, C16600tK r9, C16440t3 r10, C208211s r11, AnonymousClass16P r12, C15810rt r13, AnonymousClass182 r14, C16070sO r15, C27681Ss r16, C221816y r17, AnonymousClass16V r18, C19410yO r19, C14710pd r20, C222717h r21, C17190ug r22, C19090xk r23, AnonymousClass1RV r24, AnonymousClass1GC r25, C19450yS r26, AnonymousClass1H2 r27, C16320sq r28, JniBridge jniBridge) {
        AnonymousClass1WA r0 = new AnonymousClass1WA(r28, true);
        this.A06 = r10;
        this.A0G = r20;
        this.A00 = r4;
        this.A02 = r6;
        this.A09 = r13;
        this.A0P = jniBridge;
        this.A04 = r8;
        this.A0I = r22;
        this.A03 = r7;
        this.A0J = r23;
        this.A08 = r12;
        this.A0H = r21;
        this.A05 = r9;
        this.A01 = r5;
        this.A0K = r24;
        this.A07 = r11;
        this.A0N = r27;
        this.A0E = r18;
        this.A0A = r14;
        this.A0F = r19;
        this.A0M = r26;
        this.A0B = r15;
        this.A0D = r17;
        this.A0L = r25;
        this.A0C = r16;
        this.A0O = r0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C46662Fi r54) {
        /*
            r53 = this;
            java.lang.String r1 = "sending message: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r7 = r54
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = r53
            X.1H8 r0 = r6.A01
            android.os.Handler r1 = r0.A00
            r0 = 0
            r1.removeMessages(r0)
            r0 = 1
            r1.removeMessages(r0)
            r0 = 2
            r1.removeMessages(r0)
            X.0tZ r5 = r7.A05
            com.whatsapp.jid.DeviceJid r4 = r7.A03
            r1 = r4
            X.0so r0 = r6.A00
            r52 = r0
            X.0rt r10 = r6.A09
            X.0sO r2 = r6.A0B
            boolean r0 = X.C38621r6.A0P(r0, r10, r2, r5)
            if (r0 == 0) goto L_0x01bd
            boolean r0 = r5.A0z()
            if (r0 == 0) goto L_0x01bd
            X.0tK r8 = r6.A05
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x01bd
            X.17h r0 = r6.A0H
            X.1Vw r2 = r5.A11
            java.util.Map r3 = r0.A01
            monitor-enter(r3)
            java.lang.Object r0 = r3.get(r2)     // Catch:{ all -> 0x01ba }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x01ba }
            r11 = 0
            if (r0 == 0) goto L_0x0074
            java.lang.Object r9 = r0.first     // Catch:{ all -> 0x01ba }
            java.util.Set r9 = (java.util.Set) r9     // Catch:{ all -> 0x01ba }
            if (r9 == 0) goto L_0x0074
            if (r4 != 0) goto L_0x006a
            X.0rv r1 = r2.A00     // Catch:{ all -> 0x01ba }
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x01ba }
            if (r0 == 0) goto L_0x0071
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r1)     // Catch:{ all -> 0x01ba }
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x01ba }
        L_0x006a:
            boolean r0 = r9.contains(r1)     // Catch:{ all -> 0x01ba }
            if (r0 == 0) goto L_0x0074
            goto L_0x0073
        L_0x0071:
            r1 = 0
            goto L_0x006a
        L_0x0073:
            r11 = 1
        L_0x0074:
            monitor-exit(r3)     // Catch:{ all -> 0x01ba }
            if (r11 != 0) goto L_0x01bd
            boolean r0 = r5.A1D
            if (r0 != 0) goto L_0x01bd
            monitor-enter(r3)
            java.lang.Object r0 = r3.get(r2)     // Catch:{ all -> 0x01b7 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x0092
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x01b7 }
            r9.<init>()     // Catch:{ all -> 0x01b7 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x01b7 }
            r0.<init>(r9, r5)     // Catch:{ all -> 0x01b7 }
            r3.put(r2, r0)     // Catch:{ all -> 0x01b7 }
            goto L_0x0096
        L_0x0092:
            java.lang.Object r9 = r0.first     // Catch:{ all -> 0x01b7 }
            java.util.Set r9 = (java.util.Set) r9     // Catch:{ all -> 0x01b7 }
        L_0x0096:
            if (r4 == 0) goto L_0x009a
            r0 = r4
            goto L_0x00a7
        L_0x009a:
            X.0rv r1 = r2.A00     // Catch:{ all -> 0x01b7 }
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x00cb
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r1)     // Catch:{ all -> 0x01b7 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x01b7 }
        L_0x00a7:
            boolean r0 = r9.add(r0)     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x00c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b7 }
            r1.<init>()     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "in-flight-messages/duplicate in flight message: "
            r1.append(r0)     // Catch:{ all -> 0x01b7 }
            r1.append(r2)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = " : "
            r1.append(r0)     // Catch:{ all -> 0x01b7 }
            r1.append(r4)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01b7 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01b7 }
        L_0x00c9:
            monitor-exit(r3)     // Catch:{ all -> 0x01b7 }
            goto L_0x00cd
        L_0x00cb:
            r0 = 0
            goto L_0x00a7
        L_0x00cd:
            boolean r0 = r8.A08()
            if (r0 != 0) goto L_0x00eb
            boolean r0 = r7.A0A
            if (r0 != 0) goto L_0x00eb
            X.0xk r0 = r6.A0J
            r12 = 0
            r14 = 1
            r16 = 0
            r15 = 1
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r11 = r0
            r13 = r12
            r11.A0C(r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x00eb:
            long r0 = r5.A18
            r8 = 0
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x00f9
            long r0 = android.os.SystemClock.uptimeMillis()
            r5.A18 = r0
        L_0x00f9:
            boolean r12 = r7.A09
            if (r12 != 0) goto L_0x0101
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0117
        L_0x0101:
            X.0w1 r1 = r6.A03
            int r9 = r5.A1H
            r8 = 5
            boolean r0 = r1.A0M
            if (r0 == 0) goto L_0x0117
            X.18E r3 = r1.A0E
            java.lang.String r0 = r2.A01
            int r1 = r0.hashCode()
            byte r0 = r5.A10
            r3.A05(r1, r8, r9, r0)
        L_0x0117:
            X.1WA r11 = r6.A0O
            X.0t3 r0 = r6.A06
            r51 = r0
            X.0pd r0 = r6.A0G
            r26 = r0
            X.0sK r0 = r6.A02
            r50 = r0
            com.whatsapp.wamsys.JniBridge r0 = r6.A0P
            r35 = r0
            X.0xb r0 = r6.A04
            r49 = r0
            X.0w1 r0 = r6.A03
            r48 = r0
            X.16P r0 = r6.A08
            r47 = r0
            X.1RV r0 = r6.A0K
            r30 = r0
            X.11s r0 = r6.A07
            r46 = r0
            X.1H2 r0 = r6.A0N
            r34 = r0
            X.16V r0 = r6.A0E
            r24 = r0
            X.182 r0 = r6.A0A
            r21 = r0
            X.0yO r0 = r6.A0F
            r25 = r0
            X.0yS r0 = r6.A0M
            r32 = r0
            X.16y r0 = r6.A0D
            r20 = r0
            X.1GC r0 = r6.A0L
            r19 = r0
            X.1Ss r0 = r6.A0C
            r18 = r0
            if (r4 != 0) goto L_0x0164
            X.0rv r4 = r2.A00
            X.AnonymousClass00B.A06(r4)
        L_0x0164:
            com.whatsapp.jid.UserJid r0 = r7.A04
            r17 = r0
            java.util.Set r0 = r7.A08
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>(r0)
            boolean r0 = r7.A0A
            r16 = r0
            long r8 = r7.A00
            long r2 = r7.A01
            long r0 = r7.A02
            r15 = 3
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r14 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r14.<init>(r6, r15, r7)
            X.1kE r7 = r7.A06
            X.2Fj r6 = new X.2Fj
            r22 = r18
            r23 = r20
            r27 = r4
            r28 = r17
            r29 = r5
            r31 = r19
            r33 = r7
            r36 = r14
            r37 = r13
            r38 = r8
            r40 = r2
            r42 = r0
            r44 = r16
            r45 = r12
            r12 = r6
            r13 = r52
            r14 = r50
            r15 = r48
            r16 = r49
            r17 = r51
            r18 = r46
            r19 = r47
            r20 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r45)
            r11.execute(r6)
            return
        L_0x01b7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01b7 }
            throw r0
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01ba }
            throw r0
        L_0x01bd:
            java.lang.String r1 = "Dropping send message: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1kE r1 = r7.A06
            if (r1 == 0) goto L_0x01d6
            r0 = 0
            r1.A02(r0)
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0y3.A00(X.2Fi):void");
    }

    public void A01(C16740tZ r19) {
        C16740tZ r6 = r19;
        A00(new C46662Fi((DeviceJid) null, (UserJid) null, r6, (C34421kE) null, (Runnable) null, new HashSet(), 0, 0, r6 instanceof C38831rU ? this.A06.A00() : r6.A0I, false, false));
    }

    public void A02(C16740tZ r19, boolean z2) {
        C16740tZ r6 = r19;
        A00(new C46662Fi((DeviceJid) null, (UserJid) null, r6, (C34421kE) null, (Runnable) null, new HashSet(), 0, 0, r6 instanceof C38831rU ? this.A06.A00() : r6.A0I, z2, true));
    }

    public void A03(boolean z2) {
        this.A0J.A0y = z2;
        this.A0I.A08(Message.obtain((Handler) null, 0, 37, 0, Boolean.valueOf(z2)), (String) null, false);
    }
}
