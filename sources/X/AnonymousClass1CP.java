package X;

import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import com.facebook.redex.IDxNConsumerShape0S1000000_2_I0;
import com.facebook.redex.IDxRCallbackShape231S0100000_2_I0;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1CP  reason: invalid class name */
public class AnonymousClass1CP {
    public int A00 = 0;
    public HandlerThread A01;
    public C17190ug A02;
    public boolean A03 = false;
    public final SparseIntArray A04 = new SparseIntArray();
    public final C16300so A05;
    public final C222717h A06;
    public final AnonymousClass1CO A07;
    public final AnonymousClass1CM A08;
    public final C34431kF A09;
    public final C19550yc A0A = new IDxRCallbackShape231S0100000_2_I0(this, 2);
    public final Object A0B = new Object();
    public final List A0C = new ArrayList();
    public final Map A0D = new HashMap();
    public final Map A0E = new HashMap();

    public AnonymousClass1CP(C16300so r4, C222717h r5, AnonymousClass1CO r6, AnonymousClass1CM r7) {
        this.A05 = r4;
        this.A08 = r7;
        this.A06 = r5;
        this.A07 = r6;
        HandlerThread handlerThread = new HandlerThread("XmppMessageRouter", 1);
        this.A01 = handlerThread;
        handlerThread.start();
        this.A09 = new C34431kF(this.A01.getLooper(), this);
    }

    public static /* synthetic */ void A00(AnonymousClass1CP r3, String str, boolean z2) {
        C19550yc r2;
        if (z2) {
            C222717h r1 = r3.A06;
            AnonymousClass00B.A07(str, "Can't remove message with null id");
            List list = r1.A00;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (str.equals(((C34441kG) it.next()).A01)) {
                        it.remove();
                    }
                }
            }
        }
        synchronized (r3.A0B) {
            r2 = (C19550yc) r3.A0E.remove(str);
            if (r2 == null) {
                r2 = (C19550yc) r3.A0D.remove(str);
            }
        }
        r3.A02(new IDxNConsumerShape0S1000000_2_I0(str, 2));
        if (r2 != null) {
            r2.APb(str);
        } else {
            StringBuilder sb = new StringBuilder("xmppIncomingMessageRouter/ignoring failure due to missing callback for iqId:");
            sb.append(str);
            Log.i(sb.toString());
        }
        r3.A02(new IDxNConsumerShape0S1000000_2_I0(str, 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r1 == r6.A0A) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C19550yc r7, java.lang.String r8, long r9, boolean r11) {
        /*
            r6 = this;
            java.lang.Object r3 = r6.A0B
            monitor-enter(r3)
            java.util.Map r0 = r6.A0D     // Catch:{ all -> 0x005c }
            boolean r0 = r0.containsKey(r8)     // Catch:{ all -> 0x005c }
            r5 = 1
            r4 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000f
            r2 = 1
        L_0x000f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r1.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "Pending iq-callback for id:"
            r1.append(r0)     // Catch:{ all -> 0x005c }
            r1.append(r8)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005c }
            X.AnonymousClass00B.A0D(r0, r2)     // Catch:{ all -> 0x005c }
            java.util.Map r0 = r6.A0E     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r0.put(r8, r7)     // Catch:{ all -> 0x005c }
            X.0yc r1 = (X.C19550yc) r1     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0032
            X.0yc r0 = r6.A0A     // Catch:{ all -> 0x005c }
            r2 = 0
            if (r1 != r0) goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r1.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "Pending request for id:"
            r1.append(r0)     // Catch:{ all -> 0x005c }
            r1.append(r8)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005c }
            X.AnonymousClass00B.A0D(r0, r2)     // Catch:{ all -> 0x005c }
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005a
            X.1kF r1 = r6.A09     // Catch:{ all -> 0x005c }
            r0 = 4
            if (r11 != 0) goto L_0x0053
            r5 = 0
        L_0x0053:
            android.os.Message r0 = r1.obtainMessage(r0, r5, r4, r8)     // Catch:{ all -> 0x005c }
            r1.sendMessageDelayed(r0, r9)     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r3)     // Catch:{ all -> 0x005c }
            return
        L_0x005c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CP.A01(X.0yc, java.lang.String, long, boolean):void");
    }

    public final void A02(AnonymousClass1WE r5) {
        C17190ug r0 = this.A02;
        if (r0 != null) {
            r5.accept(r0);
        } else if (!this.A03) {
            this.A03 = true;
            this.A05.AcB("NullMessageClient", "Message client is null in XmppIncomingMessageRouter", false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r2 == r4.A0A) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0B
            monitor-enter(r3)
            java.util.Map r0 = r4.A0E     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r0.remove(r5)     // Catch:{ all -> 0x0018 }
            X.0yc r2 = (X.C19550yc) r2     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0012
            X.0yc r1 = r4.A0A     // Catch:{ all -> 0x0018 }
            r0 = 0
            if (r2 != r1) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CP.A03(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r3.A0D.isEmpty() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A0B
            monitor-enter(r2)
            java.util.Map r0 = r3.A0E     // Catch:{ all -> 0x002e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0014
            java.util.Map r0 = r3.A0D     // Catch:{ all -> 0x002e }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x002e }
            r0 = 0
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            if (r4 != 0) goto L_0x0022
            if (r0 != 0) goto L_0x0022
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x0030 }
            X.1kF r1 = r3.A09     // Catch:{ all -> 0x0030 }
            r0 = 4
            r1.removeMessages(r0)     // Catch:{ all -> 0x0030 }
        L_0x0022:
            monitor-exit(r2)     // Catch:{ all -> 0x0030 }
            X.1kF r1 = r3.A09
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.sendToTarget()
            return
        L_0x002e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0030 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CP.A04(boolean):void");
    }

    public boolean A05(C28371Vv r5, String str) {
        boolean z2;
        synchronized (this.A0B) {
            if (this.A0D.containsKey(str)) {
                Message obtainMessage = this.A09.obtainMessage(2, r5);
                obtainMessage.getData().putString("iqId", str);
                obtainMessage.sendToTarget();
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }
}
