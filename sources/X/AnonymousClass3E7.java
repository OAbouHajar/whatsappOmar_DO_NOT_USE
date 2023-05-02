package X;

import android.net.Uri;
import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.3E7  reason: invalid class name */
public class AnonymousClass3E7 implements C48612Oe {
    public boolean A00;
    public final C14550pN A01;
    public final C14870pt A02;
    public final C18000vz A03;
    public final C18260wP A04;
    public final C16080sP A05;
    public final C48602Od A06;
    public final C48642Oh A07;
    public final C48652Oi A08;

    public AnonymousClass3E7() {
        this.A08 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        if (r1 == false) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3E7(X.C14550pN r14, X.C14870pt r15, X.C16760tb r16, X.C18260wP r17, X.C16080sP r18, X.C16980tz r19, X.C14730pf r20, X.C216114t r21, X.AnonymousClass1P8 r22, X.C209212c r23, X.C610637e r24, X.C38731rK r25, X.C48652Oi r26) {
        /*
            r13 = this;
            r13.<init>()
            r12 = r26
            r13.A08 = r12
            r2 = 1
            com.facebook.redex.IDxCObserverShape306S0100000_2_I1 r0 = new com.facebook.redex.IDxCObserverShape306S0100000_2_I1
            r0.<init>(r13, r2)
            r13.A03 = r0
            r13.A02 = r15
            r6 = r18
            r13.A05 = r6
            r0 = r17
            r13.A04 = r0
            r13.A01 = r14
            r10 = r25
            X.0ta r1 = X.C16730tY.A00(r10)
            r3 = r22
            X.1co r0 = r3.A00(r1)
            if (r0 != 0) goto L_0x002f
            r0 = 0
            r4 = r16
            r4.A05(r14, r10, r0)
        L_0x002f:
            X.1co r0 = r3.A00(r1)
            if (r0 == 0) goto L_0x0117
            X.2Oh r11 = r0.A0i
            if (r11 == 0) goto L_0x0117
            r13.A07 = r11
            r11.A0C = r2
            r11.A0D = r2
            X.1cs r3 = r0.A0c
            r4 = r24
            X.1cs r0 = r4.A04
            if (r0 != 0) goto L_0x004d
            long r0 = r3.A03()
            r4.A02 = r0
        L_0x004d:
            r4.A04 = r3
            X.2Od r5 = new X.2Od
            r7 = r19
            r8 = r20
            r9 = r21
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.A06 = r5
            int r1 = r11.A00()
            r0 = 4
            if (r1 != r0) goto L_0x0076
            java.lang.String r3 = X.C48662Oj.A00(r14, r6, r9, r10, r11)
            boolean r1 = r11.A08()
            r0 = 0
            X.C18450wi.A0H(r3, r0)
            X.2Oi r0 = r13.A08
            if (r0 == 0) goto L_0x0076
            r0.A00(r3, r1, r2)
        L_0x0076:
            X.0ta r0 = X.C16730tY.A00(r10)
            r7 = r23
            X.1P8 r5 = r7.A0W
            X.1co r1 = r5.A00(r0)
            if (r1 == 0) goto L_0x0116
            boolean r0 = r7.A0D(r10)
            if (r0 == 0) goto L_0x0116
            r1.A0v = r2
            java.util.ArrayList r8 = X.AnonymousClass000.A0u()
            X.2C3 r6 = r7.A0X
            monitor-enter(r6)
            android.os.ConditionVariable r0 = r7.A01     // Catch:{ all -> 0x0113 }
            r0.close()     // Catch:{ all -> 0x0113 }
            java.util.Collection r0 = r7.A04()     // Catch:{ all -> 0x0113 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0113 }
        L_0x00a0:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r4 = r9.next()     // Catch:{ all -> 0x0113 }
            X.0tY r4 = (X.C16730tY) r4     // Catch:{ all -> 0x0113 }
            X.0ta r0 = r4.A02     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x00a0
            X.14k r3 = r7.A0Y     // Catch:{ all -> 0x0113 }
            monitor-enter(r3)     // Catch:{ all -> 0x0113 }
            java.util.Map r0 = r3.A01     // Catch:{ all -> 0x00ca }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x00ca }
            X.1zo r0 = (X.C43321zo) r0     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00c2
            boolean r1 = r0.A03     // Catch:{ all -> 0x00ca }
            r0 = 1
            if (r1 != 0) goto L_0x00c3
        L_0x00c2:
            r0 = 0
        L_0x00c3:
            monitor-exit(r3)     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x00a0
            r8.add(r4)     // Catch:{ all -> 0x0113 }
            goto L_0x00a0
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0113 }
            throw r0     // Catch:{ all -> 0x0113 }
        L_0x00cd:
            monitor-exit(r6)     // Catch:{ all -> 0x0113 }
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x0107
            java.util.Iterator r6 = r8.iterator()
        L_0x00d8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0107
            java.lang.Object r4 = r6.next()
            X.0tY r4 = (X.C16730tY) r4
            X.1co r1 = r7.A03(r4)
            if (r1 == 0) goto L_0x00d8
            boolean r0 = r1.A0v
            if (r0 != 0) goto L_0x00d8
            int r0 = r1.A0u
            if (r0 != r2) goto L_0x00d8
            java.util.HashMap r3 = r7.A0r
            monitor-enter(r3)
            long r0 = r1.A07     // Catch:{ all -> 0x0104 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0104 }
            r3.put(r4, r0)     // Catch:{ all -> 0x0104 }
            monitor-exit(r3)     // Catch:{ all -> 0x0104 }
            r0 = 0
            r7.A0B(r4, r0, r0)
            goto L_0x00d8
        L_0x0104:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0104 }
            throw r0
        L_0x0107:
            X.0sq r1 = r7.A0n
            X.0ta r0 = r10.A02
            X.1co r0 = r5.A00(r0)
            r1.Acl(r0)
            return
        L_0x0113:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0113 }
            throw r0
        L_0x0116:
            return
        L_0x0117:
            java.lang.String r0 = "download file is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3E7.<init>(X.0pN, X.0pt, X.0tb, X.0wP, X.0sP, X.0tz, X.0pf, X.14t, X.1P8, X.12c, X.37e, X.1rK, X.2Oi):void");
    }

    public void A4k(AnonymousClass5LZ r1) {
    }

    public /* synthetic */ Map AFZ() {
        return Collections.emptyMap();
    }

    public Uri AGo() {
        return this.A06.AGo();
    }

    public long AZr(AnonymousClass3AL r4) {
        this.A02.A0K(new RunnableRunnableShape18S0100000_I1_1((Object) this, 32));
        return this.A06.AZr(r4);
    }

    public void close() {
        this.A02.A0K(new RunnableRunnableShape18S0100000_I1_1((Object) this, 33));
        this.A06.close();
    }

    public int read(byte[] bArr, int i2, int i3) {
        return this.A06.read(bArr, i2, i3);
    }
}
