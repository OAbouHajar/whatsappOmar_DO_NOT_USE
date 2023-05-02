package X;

import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.36P  reason: invalid class name */
public class AnonymousClass36P extends C16690tT {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C16760tb A01;
    public final WeakReference A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass36P(C14600pS r3, C16760tb r4, boolean z2, boolean z3) {
        this.A02 = C13690nt.A0h(r3);
        this.A01 = r4;
        this.A04 = z2;
        this.A03 = z3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0098 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0165 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r12) {
        /*
            r11 = this;
            X.0tb r4 = r11.A01
            boolean r5 = r11.A04
            boolean r7 = r11.A03
            X.0rs r0 = r4.A0O
            java.util.List r0 = r0.A05()
            java.util.HashSet r3 = X.C13680ns.A0o()
            java.util.Iterator r8 = r0.iterator()
        L_0x0014:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0044
            X.0rv r6 = X.C13700nu.A0B(r8)
            X.0rt r0 = r4.A0b
            int r0 = r0.A00(r6)
            if (r0 <= 0) goto L_0x0038
            X.0pj r1 = r4.A1I
            r0 = 0
            r1.A0A(r6, r0)
            X.0pt r2 = r4.A03
            r1 = 38
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r6, r1, r4)
            r2.A0K(r0)
        L_0x0038:
            X.0xU r1 = r4.A0I
            r0 = r5 ^ 1
            java.util.Set r0 = r1.A0G(r6, r0, r7)
            r3.addAll(r0)
            goto L_0x0014
        L_0x0044:
            X.0t6 r6 = r4.A0e
            if (r5 == 0) goto L_0x009e
            java.lang.String r0 = "msgstore/clearallmsgs_excludestarred"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r8 = X.AnonymousClass000.A0u()
            X.0tq r0 = r6.A0v
            X.0tf r5 = r0.get()
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "SELECT DISTINCT chat_row_id FROM message_view"
            r0 = 0
            android.database.Cursor r2 = r2.A08(r1, r0)     // Catch:{ all -> 0x0099 }
        L_0x0060:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0078
            X.0ts r0 = r6.A0N     // Catch:{ all -> 0x0092 }
            X.0rv r1 = r0.A06(r2)     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0060
            boolean r0 = X.C16030sJ.A0Q(r1)     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x0060
            r8.add(r1)     // Catch:{ all -> 0x0092 }
            goto L_0x0060
        L_0x0078:
            r2.close()     // Catch:{ all -> 0x0099 }
            r5.close()
            java.util.Iterator r5 = r8.iterator()
        L_0x0082:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0126
            X.0rv r2 = X.C13700nu.A0B(r5)
            r1 = 0
            r0 = 1
            r6.A0S(r2, r1, r0, r7)
            goto L_0x0082
        L_0x0092:
            r0 = move-exception
            if (r2 == 0) goto L_0x0098
            r2.close()     // Catch:{ all -> 0x0098 }
        L_0x0098:
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x016a }
            throw r0
        L_0x009e:
            java.lang.String r0 = "msgstore/clearallmsgs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Zf r5 = new X.1Zf
            r5.<init>((java.lang.String) r0)
            java.util.Map r0 = r6.A1o
            r0.clear()
            X.0tq r0 = r6.A0v
            X.0tf r10 = r0.A02()
            X.1cj r9 = r10.A00()     // Catch:{ all -> 0x0166 }
            r6.A0k(r5)     // Catch:{ all -> 0x0161 }
            X.0rt r1 = r6.A0O     // Catch:{ all -> 0x0161 }
            monitor-enter(r1)     // Catch:{ all -> 0x0161 }
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0C()     // Catch:{ all -> 0x015e }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x015e }
            monitor-exit(r1)     // Catch:{ all -> 0x0161 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0161 }
        L_0x00ca:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0161 }
            if (r0 == 0) goto L_0x00ef
            java.util.Map$Entry r1 = X.AnonymousClass000.A0z(r8)     // Catch:{ all -> 0x0161 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0161 }
            X.0rx r0 = (X.C15840rx) r0     // Catch:{ all -> 0x0161 }
            r0.A08()     // Catch:{ all -> 0x0161 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x0161 }
            X.0rv r2 = (X.C15830rv) r2     // Catch:{ all -> 0x0161 }
            if (r2 == 0) goto L_0x00ca
            int r1 = r0.A00     // Catch:{ all -> 0x0161 }
            r0 = 1
            if (r1 != r0) goto L_0x00ca
            r0 = 0
            r6.A0s(r2, r0)     // Catch:{ all -> 0x0161 }
            goto L_0x00ca
        L_0x00ef:
            r9.A00()     // Catch:{ all -> 0x0161 }
            r9.close()     // Catch:{ all -> 0x0166 }
            r10.close()
            X.0sb r0 = r6.A03
            X.1jH r0 = r0.A05()
            java.io.File r0 = r0.A0O
            X.AnonymousClass1XI.A0O(r0)
            if (r7 == 0) goto L_0x0108
            r6.A0J()
        L_0x0108:
            X.17E r0 = r6.A0e
            android.os.Handler r1 = r0.A01
            r0 = 8
            android.os.Message r0 = android.os.Message.obtain(r1, r0)
            r0.sendToTarget()
            java.lang.String r0 = "msgstore/clearallmsgs time spent:"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            long r0 = r5.A01()
            r2.append(r0)
            X.C13680ns.A1V(r2)
            goto L_0x0133
        L_0x0126:
            X.17E r0 = r6.A0e
            android.os.Handler r1 = r0.A01
            r0 = 8
            android.os.Message r0 = android.os.Message.obtain(r1, r0)
            r0.sendToTarget()
        L_0x0133:
            X.0xU r0 = r4.A0I
            r0.A0V(r3)
            X.0pt r3 = r4.A03
            X.0pj r2 = r4.A1I
            r1 = 16
            com.facebook.redex.RunnableRunnableShape2S0100000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1
            r0.<init>(r2, r1)
            r3.A0K(r0)
            X.18Z r0 = r4.A0C
            r0.A01()
            long r5 = r11.A00
            r3 = 300(0x12c, double:1.48E-321)
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x015c
            long r3 = r3 - r1
            android.os.SystemClock.sleep(r3)
        L_0x015c:
            r0 = 0
            return r0
        L_0x015e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0161 }
            throw r0     // Catch:{ all -> 0x0161 }
        L_0x0161:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0165 }
        L_0x0165:
            throw r0     // Catch:{ all -> 0x0166 }
        L_0x0166:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x016a }
        L_0x016a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36P.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C14600pS r0 = (C14600pS) this.A02.get();
        if (r0 != null) {
            r0.Ac1();
        }
    }
}
