package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1Sf  reason: invalid class name and case insensitive filesystem */
public final class C27561Sf {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C16300so A01;
    public final C16040sK A02;
    public final C18020w1 A03;
    public final C211512z A04;
    public final C17130ua A05;
    public final C19000xb A06;
    public final C18930xU A07;
    public final AnonymousClass159 A08;
    public final AnonymousClass11R A09;
    public final C208211s A0A;
    public final AnonymousClass126 A0B;
    public final C15810rt A0C;
    public final C216114t A0D;
    public final C16460t6 A0E;
    public final C27631Sn A0F;
    public final C16070sO A0G;
    public final C19150xq A0H;
    public final AnonymousClass11G A0I;
    public final C18030w2 A0J;
    public final C16490t9 A0K;
    public final C17240ul A0L;
    public final C19950zG A0M;
    public final C27541Sd A0N;
    public final AnonymousClass1T9 A0O;
    public final C20340zt A0P;
    public final C222517f A0Q;
    public final AnonymousClass124 A0R;
    public final C207811o A0S;
    public final AnonymousClass1TB A0T;
    public final C27691St A0U;
    public final C16320sq A0V;

    public C27561Sf(C16300so r3, C16040sK r4, C18020w1 r5, C211512z r6, C17130ua r7, C19000xb r8, C18930xU r9, AnonymousClass159 r10, AnonymousClass11R r11, C208211s r12, AnonymousClass126 r13, C15810rt r14, C216114t r15, C16460t6 r16, C27631Sn r17, C16070sO r18, C19150xq r19, AnonymousClass11G r20, C18030w2 r21, C16490t9 r22, C17240ul r23, C19950zG r24, C27541Sd r25, AnonymousClass1T9 r26, C20340zt r27, C222517f r28, AnonymousClass124 r29, C207811o r30, AnonymousClass1TB r31, C27691St r32, C16320sq r33) {
        this.A01 = r3;
        this.A02 = r4;
        this.A0V = r33;
        this.A0C = r14;
        this.A05 = r7;
        this.A0K = r22;
        this.A0R = r29;
        this.A0I = r20;
        this.A07 = r9;
        this.A0Q = r28;
        this.A06 = r8;
        this.A0M = r24;
        this.A0J = r21;
        this.A03 = r5;
        this.A0E = r16;
        this.A0F = r17;
        this.A0L = r23;
        this.A0H = r19;
        this.A04 = r6;
        this.A0A = r12;
        this.A0B = r13;
        this.A0S = r30;
        this.A08 = r10;
        this.A0N = r25;
        this.A0G = r18;
        this.A0P = r27;
        this.A0O = r26;
        this.A0U = r32;
        this.A0T = r31;
        this.A0D = r15;
        this.A09 = r11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r3 == -1001) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.C30891d8 r6, X.C30861d5 r7, X.C30841d3 r8, X.C30161br r9, boolean r10) {
        /*
            r5 = this;
            r2 = 0
            if (r6 == 0) goto L_0x0083
            int r3 = r6.A00
            if (r3 == 0) goto L_0x0083
            java.lang.String r1 = "decryptmessagerunnable/handleDecryptionResult axolotl status="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.A00 = r0
            if (r8 == 0) goto L_0x0020
            r8.A02 = r2
        L_0x0020:
            r1 = -1001(0xfffffffffffffc17, float:NaN)
            if (r3 == r1) goto L_0x0045
            java.lang.Integer r0 = X.C18020w1.A09(r3)
            r7.A05 = r0
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            r4 = 1
            if (r3 == r0) goto L_0x0061
            r0 = -1002(0xfffffffffffffc16, float:NaN)
            if (r3 == r0) goto L_0x0061
            r0 = -1003(0xfffffffffffffc15, float:NaN)
            if (r3 == r0) goto L_0x0061
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            if (r3 == r0) goto L_0x0061
            r0 = -1006(0xfffffffffffffc12, float:NaN)
            if (r3 == r0) goto L_0x007b
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            if (r3 == r0) goto L_0x007b
            if (r3 != r1) goto L_0x0083
        L_0x0045:
            if (r10 != 0) goto L_0x0083
            boolean r0 = r9.A0f
            if (r0 != 0) goto L_0x0083
            X.1d1 r0 = r9.A09
            if (r0 == 0) goto L_0x005a
            X.0sq r2 = r5.A0V
            r1 = 3
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r0.<init>(r5, r1, r9)
            r2.Acl(r0)
        L_0x005a:
            X.17f r0 = r5.A0Q
            r0.A07(r9)
            r0 = 2
            return r0
        L_0x0061:
            r9.A0f = r4
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            r1 = 1
            if (r3 == r0) goto L_0x0078
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            r1 = 4
            if (r3 == r0) goto L_0x0078
            r0 = -1003(0xfffffffffffffc15, float:NaN)
            r1 = 3
            if (r3 == r0) goto L_0x0078
            r0 = -1002(0xfffffffffffffc16, float:NaN)
            r1 = 2
            if (r3 == r0) goto L_0x0078
            r1 = 0
        L_0x0078:
            r9.A04 = r1
            goto L_0x0080
        L_0x007b:
            X.17f r0 = r5.A0Q
            r0.A07(r9)
        L_0x0080:
            if (r10 == 0) goto L_0x0083
            return r4
        L_0x0083:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27561Sf.A00(X.1d8, X.1d5, X.1d3, X.1br, boolean):int");
    }
}
