package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.3ID  reason: invalid class name */
public class AnonymousClass3ID implements Runnable {
    public AnonymousClass4EA A00;
    public final long A01;
    public final long A02;
    public final C15810rt A03;
    public final C16460t6 A04;
    public final AnonymousClass15B A05;
    public final C15830rv A06;
    public final String A07;
    public final List A08;
    public final Set A09;

    public AnonymousClass3ID(AnonymousClass4EA r1, C15810rt r2, C16460t6 r3, AnonymousClass15B r4, C15830rv r5, String str, List list, Set set, long j2, long j3) {
        this.A01 = j2;
        this.A07 = str;
        this.A04 = r3;
        this.A06 = r5;
        this.A02 = j3;
        this.A03 = r2;
        this.A05 = r4;
        this.A09 = set;
        this.A08 = list;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r9.size() == 0) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r3 = r21
            java.lang.String r0 = "messagesViewModel/more-messages/loading/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e3 }
            X.0t6 r14 = r3.A04     // Catch:{ all -> 0x00e3 }
            X.0rv r15 = r3.A06     // Catch:{ all -> 0x00e3 }
            long r4 = r3.A02     // Catch:{ all -> 0x00e3 }
            r16 = 100
            long r0 = r3.A01     // Catch:{ all -> 0x00e3 }
            r17 = r4
            r19 = r0
            X.1kc r4 = r14.A0B(r15, r16, r17, r19)     // Catch:{ all -> 0x00e3 }
            android.database.Cursor r5 = r4.A00     // Catch:{ all -> 0x00e3 }
            r2 = 0
            if (r5 == 0) goto L_0x006d
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x006d
            r5.getCount()     // Catch:{ all -> 0x00e3 }
            X.15B r2 = r3.A05     // Catch:{ all -> 0x00e3 }
            long r0 = r4.A02     // Catch:{ all -> 0x00e3 }
            boolean r2 = r2.A06(r15, r0)     // Catch:{ all -> 0x00e3 }
            X.0tZ r11 = r14.A0G(r5, r15)     // Catch:{ all -> 0x00e3 }
            if (r11 == 0) goto L_0x006d
            java.util.List r10 = r3.A08     // Catch:{ all -> 0x00e3 }
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x00e3 }
            if (r0 != 0) goto L_0x006d
            java.util.ArrayList r9 = X.AnonymousClass000.A0w(r10)     // Catch:{ all -> 0x00e3 }
            java.util.Iterator r14 = r10.iterator()     // Catch:{ all -> 0x00e3 }
        L_0x0045:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x0063
            X.0tZ r8 = X.C13680ns.A0V(r14)     // Catch:{ all -> 0x00e3 }
            long r5 = r8.A13     // Catch:{ all -> 0x00e3 }
            r12 = 0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0045
            long r5 = r8.A14     // Catch:{ all -> 0x00e3 }
            long r0 = r11.A14     // Catch:{ all -> 0x00e3 }
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x0045
            r9.add(r8)     // Catch:{ all -> 0x00e3 }
            goto L_0x0045
        L_0x0063:
            r10.removeAll(r9)     // Catch:{ all -> 0x00e3 }
            int r0 = r9.size()     // Catch:{ all -> 0x00e3 }
            r7 = 1
            if (r0 != 0) goto L_0x006e
        L_0x006d:
            r7 = 0
        L_0x006e:
            X.4EA r1 = r3.A00     // Catch:{ all -> 0x00e3 }
            if (r1 == 0) goto L_0x00d3
            X.0rt r0 = r3.A03     // Catch:{ all -> 0x00e3 }
            java.util.concurrent.ConcurrentHashMap r0 = r0.A0C()     // Catch:{ all -> 0x00e3 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ all -> 0x00e3 }
            X.0rx r0 = (X.C15840rx) r0     // Catch:{ all -> 0x00e3 }
            if (r0 != 0) goto L_0x0082
            r0 = 0
            goto L_0x0084
        L_0x0082:
            int r0 = r0.A02     // Catch:{ all -> 0x00e3 }
        L_0x0084:
            X.4UH r6 = new X.4UH     // Catch:{ all -> 0x00e3 }
            r6.<init>(r4, r0, r2)     // Catch:{ all -> 0x00e3 }
            X.1kZ r4 = r1.A00     // Catch:{ all -> 0x00e3 }
            boolean r0 = r6.A02     // Catch:{ all -> 0x00e3 }
            r4.A0J = r0     // Catch:{ all -> 0x00e3 }
            int r0 = r6.A00     // Catch:{ all -> 0x00e3 }
            r4.A01 = r0     // Catch:{ all -> 0x00e3 }
            X.1kc r5 = r6.A01     // Catch:{ all -> 0x00e3 }
            android.os.Handler r2 = X.AnonymousClass000.A0L()     // Catch:{ all -> 0x00e3 }
            r1 = 29
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3     // Catch:{ all -> 0x00e3 }
            r0.<init>(r4, r1, r5)     // Catch:{ all -> 0x00e3 }
            r2.post(r0)     // Catch:{ all -> 0x00e3 }
            long r0 = r5.A01     // Catch:{ all -> 0x00e3 }
            r4.A0G(r0)     // Catch:{ all -> 0x00e3 }
            long r0 = r5.A02     // Catch:{ all -> 0x00e3 }
            r4.A0H(r0)     // Catch:{ all -> 0x00e3 }
            X.027 r0 = r4.A0N     // Catch:{ all -> 0x00e3 }
            r0.A09(r6)     // Catch:{ all -> 0x00e3 }
            if (r7 == 0) goto L_0x00d3
            r7 = 0
            java.util.List r0 = r4.A0x     // Catch:{ all -> 0x00e3 }
            X.1kb r6 = X.C34641kb.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x00e3 }
            r11 = 1
            r12 = 0
            r9 = r7
            r10 = r7
            X.1ka r5 = new X.1ka     // Catch:{ all -> 0x00e3 }
            r8 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00e3 }
            android.os.Handler r2 = X.AnonymousClass000.A0L()     // Catch:{ all -> 0x00e3 }
            r1 = 28
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3     // Catch:{ all -> 0x00e3 }
            r0.<init>(r4, r1, r5)     // Catch:{ all -> 0x00e3 }
            r2.post(r0)     // Catch:{ all -> 0x00e3 }
        L_0x00d3:
            java.lang.String r0 = "messagesViewModel/more-messages/loading/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e3 }
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x00e3 }
            java.util.Set r1 = r3.A09
            java.lang.String r0 = r3.A07
            r1.remove(r0)
            return
        L_0x00e3:
            r2 = move-exception
            java.util.Set r1 = r3.A09
            java.lang.String r0 = r3.A07
            r1.remove(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ID.run():void");
    }
}
