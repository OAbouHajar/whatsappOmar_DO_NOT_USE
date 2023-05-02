package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1Gg  reason: invalid class name and case insensitive filesystem */
public class C24521Gg {
    public C28831Xx A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AnonymousClass1HD A02;
    public final C19250y7 A03;
    public final AnonymousClass1SL A04;
    public final C208211s A05;
    public final AnonymousClass16P A06;
    public final C18920xT A07;
    public final AnonymousClass137 A08;
    public final C16320sq A09;
    public final boolean A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002f, code lost:
        if (r10.A0E(r1, 1885) == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24521Gg(X.AnonymousClass1HD r3, X.C19250y7 r4, X.AnonymousClass1SL r5, X.C208211s r6, X.AnonymousClass16P r7, X.C18920xT r8, X.AnonymousClass137 r9, X.C14710pd r10, X.C16320sq r11) {
        /*
            r2 = this;
            r2.<init>()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r2.A01 = r0
            r2.A09 = r11
            r2.A07 = r8
            r2.A06 = r7
            r2.A05 = r6
            r2.A03 = r4
            r2.A08 = r9
            r2.A02 = r3
            r2.A04 = r5
            r0 = 2232(0x8b8, float:3.128E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r0 = r10.A0E(r1, r0)
            if (r0 == 0) goto L_0x0031
            r0 = 1885(0x75d, float:2.641E-42)
            boolean r1 = r10.A0E(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            r2.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24521Gg.<init>(X.1HD, X.0y7, X.1SL, X.11s, X.16P, X.0xT, X.137, X.0pd, X.0sq):void");
    }

    public void A00(DeviceJid deviceJid) {
        StringBuilder sb = new StringBuilder("Prekey request returned none or signature invalid; jid=");
        sb.append(deviceJid);
        Log.i(sb.toString());
        C28861Yb A022 = C28851Ya.A02(deviceJid);
        Lock A023 = this.A07.A02(A022);
        if (A023 != null) {
            try {
                A023.lock();
            } catch (Throwable th) {
                if (A023 != null) {
                    A023.unlock();
                }
                throw th;
            }
        }
        this.A05.A0R((AnonymousClass1WL) null, A022);
        AnonymousClass1HD r2 = this.A02;
        synchronized (r2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("prekeysmanager/onGetPreKeyNone:");
            sb2.append(deviceJid);
            Log.i(sb2.toString());
            r2.A08.remove(deviceJid);
        }
        if (deviceJid.device != 0) {
            this.A08.A08(deviceJid, true);
        }
        if (A023 != null) {
            A023.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x000e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.util.List r21) {
        /*
            r20 = this;
            java.lang.String r0 = "RecvPreKeyMessageListener/processPrekeys"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r6 = r21.iterator()
        L_0x000e:
            boolean r0 = r6.hasNext()
            r3 = r20
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r6.next()
            X.2dZ r0 = (X.C52312dZ) r0
            com.whatsapp.jid.DeviceJid r15 = r0.A01
            byte[] r11 = r0.A05
            byte[] r12 = r0.A06
            byte[] r1 = r0.A04
            byte r13 = r0.A00
            X.1dG r9 = r0.A02
            X.1dG r10 = r0.A03
            java.lang.String r2 = "prekey request successful; initiating signal protocol session; jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xT r0 = r3.A07
            java.util.concurrent.locks.Lock r5 = r0.A04(r15)
            if (r5 == 0) goto L_0x0046
            r5.lock()     // Catch:{ all -> 0x0094 }
        L_0x0046:
            byte r0 = r15.device     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0063
            X.137 r14 = r3.A08     // Catch:{ all -> 0x0094 }
            r19 = 4
            r16 = r1
            r17 = r11
            r18 = r13
            boolean r0 = r14.A0C(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "recvprekeymessagelistener/onGetPreKeySuccess adv verification fails"
        L_0x005c:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0094 }
            r3.A00(r15)     // Catch:{ all -> 0x0094 }
            goto L_0x008d
        L_0x0063:
            X.1Yb r8 = X.C28851Ya.A02(r15)     // Catch:{ all -> 0x0094 }
            X.11s r7 = r3.A05     // Catch:{ all -> 0x0094 }
            int r2 = r7.A04(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0094 }
            if (r2 != 0) goto L_0x0070
            goto L_0x0082
        L_0x0070:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r1.<init>()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "Error received from SignalCoordinator; status="
            r1.append(r0)     // Catch:{ all -> 0x0094 }
            r1.append(r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0094 }
            goto L_0x005c
        L_0x0082:
            r0 = 0
            if (r9 != 0) goto L_0x0086
            r0 = 1
        L_0x0086:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0094 }
            r4.put(r15, r0)     // Catch:{ all -> 0x0094 }
        L_0x008d:
            if (r5 == 0) goto L_0x000e
            r5.unlock()
            goto L_0x000e
        L_0x0094:
            r0 = move-exception
            if (r5 == 0) goto L_0x009a
            r5.unlock()
        L_0x009a:
            throw r0
        L_0x009b:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00ad
            android.os.Handler r2 = r3.A01
            r1 = 45
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r0.<init>(r3, r1, r4)
            r2.post(r0)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24521Gg.A01(java.util.List):void");
    }
}
