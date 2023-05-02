package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1kF  reason: invalid class name and case insensitive filesystem */
public class C34431kF extends Handler {
    public final /* synthetic */ AnonymousClass1CP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34431kF(Looper looper, AnonymousClass1CP r2) {
        super(looper);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r3 >= r4.A0C.size()) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r10) {
        /*
            r9 = this;
            int r0 = r10.what
            r4 = 0
            switch(r0) {
                case 1: goto L_0x0050;
                case 2: goto L_0x01e2;
                case 3: goto L_0x00f3;
                case 4: goto L_0x00e3;
                case 5: goto L_0x00d9;
                case 6: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            return
        L_0x0007:
            java.lang.Object r4 = r10.obj
            X.1ci r4 = (X.C30641ci) r4
            X.1CP r3 = r9.A00
            X.1CO r2 = r3.A07
            java.lang.String r1 = "received ack; stanzaKey="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Map r2 = r2.A02
            monitor-enter(r2)
            java.lang.Object r1 = r2.remove(r4)     // Catch:{ all -> 0x02a1 }
            X.1kE r1 = (X.C34421kE) r1     // Catch:{ all -> 0x02a1 }
            monitor-exit(r2)     // Catch:{ all -> 0x02a1 }
            if (r1 == 0) goto L_0x0030
            r0 = 0
            r1.A02(r0)
        L_0x0030:
            X.1CM r2 = r3.A08
            java.lang.String r1 = r4.A07
            java.lang.String r0 = "message acked with null id"
            X.AnonymousClass00B.A07(r1, r0)
            java.lang.String r0 = "remove ackable message with null id"
            X.AnonymousClass00B.A07(r1, r0)
            java.util.LinkedHashMap r2 = r2.A00
            monitor-enter(r2)
            java.lang.Object r1 = r2.remove(r1)     // Catch:{ all -> 0x029e }
            r0 = 0
            if (r1 == 0) goto L_0x0049
            r0 = 1
        L_0x0049:
            monitor-exit(r2)     // Catch:{ all -> 0x029e }
            if (r0 == 0) goto L_0x0006
            r2.size()
            return
        L_0x0050:
            X.1CP r4 = r9.A00
            int r6 = r10.arg1
            android.util.SparseIntArray r1 = r4.A04
            r0 = -1
            int r3 = r1.get(r6, r0)
            r5 = 0
            if (r3 < 0) goto L_0x0067
            java.util.List r0 = r4.A0C
            int r1 = r0.size()
            r0 = 1
            if (r3 < r1) goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            X.AnonymousClass00B.A0G(r0)
            java.util.List r2 = r4.A0C     // Catch:{ 1W9 -> 0x009c }
            java.lang.Object r0 = r2.get(r3)     // Catch:{ 1W9 -> 0x009c }
            X.0yP r0 = (X.C19420yP) r0     // Catch:{ 1W9 -> 0x009c }
            boolean r0 = r0.AHS(r10, r6)     // Catch:{ 1W9 -> 0x009c }
            if (r0 != 0) goto L_0x0006
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1W9 -> 0x009c }
            r1.<init>()     // Catch:{ 1W9 -> 0x009c }
            java.lang.String r0 = "Registered handler:"
            r1.append(r0)     // Catch:{ 1W9 -> 0x009c }
            java.lang.Object r0 = r2.get(r3)     // Catch:{ 1W9 -> 0x009c }
            r1.append(r0)     // Catch:{ 1W9 -> 0x009c }
            java.lang.String r0 = " can't handle message of type:"
            r1.append(r0)     // Catch:{ 1W9 -> 0x009c }
            r1.append(r6)     // Catch:{ 1W9 -> 0x009c }
            java.lang.String r1 = r1.toString()     // Catch:{ 1W9 -> 0x009c }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 1W9 -> 0x009c }
            r0.<init>(r1)     // Catch:{ 1W9 -> 0x009c }
            throw r0     // Catch:{ 1W9 -> 0x009c }
        L_0x009c:
            r3 = move-exception
            java.lang.String r0 = "xmppIncomingMessageRouter/handleIncomingXmppMessage/corrupt-stream-error/stanza "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r3.bufString
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r0 = "xmppIncomingMessageRouter/handleIncomingXmppMessage/corrupt-stream-error"
            com.whatsapp.util.Log.w(r0, r3)
            X.0so r2 = r4.A05
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = "CorruptStreamException"
            r2.AcB(r0, r1, r5)
            android.os.Bundle r1 = r10.getData()
            java.lang.String r0 = "stanzaKey"
            android.os.Parcelable r1 = r1.getParcelable(r0)
            X.1ci r1 = (X.C30641ci) r1
            if (r1 == 0) goto L_0x0006
            X.0ug r0 = r4.A02
            if (r0 == 0) goto L_0x0006
            r0.A0E(r1)
            return
        L_0x00d9:
            X.1CP r1 = r9.A00
            java.lang.Object r0 = r10.obj
            java.lang.String r0 = (java.lang.String) r0
            X.AnonymousClass1CP.A00(r1, r0, r4)
            return
        L_0x00e3:
            X.1CP r3 = r9.A00
            java.lang.Object r2 = r10.obj
            java.lang.String r2 = (java.lang.String) r2
            int r1 = r10.arg1
            r0 = 1
            if (r1 != r0) goto L_0x00ef
            r4 = 1
        L_0x00ef:
            X.AnonymousClass1CP.A00(r3, r2, r4)
            return
        L_0x00f3:
            X.1CP r5 = r9.A00
            java.lang.Object r3 = r5.A0B
            monitor-enter(r3)
            java.util.Map r2 = r5.A0D     // Catch:{ all -> 0x01df }
            java.util.Set r1 = r2.entrySet()     // Catch:{ all -> 0x01df }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01df }
            r0.<init>(r1)     // Catch:{ all -> 0x01df }
            r2.clear()     // Catch:{ all -> 0x01df }
            monitor-exit(r3)     // Catch:{ all -> 0x01df }
            java.util.Iterator r4 = r0.iterator()
        L_0x010b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x013a
            java.lang.Object r3 = r4.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r2 = r3.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r1 = 1
            com.facebook.redex.IDxNConsumerShape0S1000000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape0S1000000_2_I0
            r0.<init>(r2, r1)
            r5.A02(r0)
            java.lang.Object r0 = r3.getValue()
            X.0yc r0 = (X.C19550yc) r0
            r0.APb(r2)
            r1 = 8
            com.facebook.redex.IDxNConsumerShape0S1000000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape0S1000000_2_I0
            r0.<init>(r2, r1)
            r5.A02(r0)
            goto L_0x010b
        L_0x013a:
            X.1CO r5 = r5.A07
            java.util.Map r4 = r5.A02
            monitor-enter(r4)
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x01dc }
            r6.<init>()     // Catch:{ all -> 0x01dc }
            java.util.Set r0 = r4.keySet()     // Catch:{ all -> 0x01da }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x01da }
        L_0x014c:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x0187
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x01da }
            X.1ci r7 = (X.C30641ci) r7     // Catch:{ all -> 0x01da }
            java.lang.String r1 = "message"
            java.lang.String r0 = r7.A05     // Catch:{ all -> 0x01da }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x014c
            java.lang.String r1 = r7.A06     // Catch:{ all -> 0x01da }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x01da }
            r3 = 0
            if (r0 == 0) goto L_0x016d
            r1 = 0
            goto L_0x0171
        L_0x016d:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x01da }
        L_0x0171:
            com.whatsapp.jid.Jid r0 = r7.A01     // Catch:{ all -> 0x01da }
            X.0rv r2 = X.C16030sJ.A00(r0)     // Catch:{ all -> 0x01da }
            r0 = 8
            if (r1 == r0) goto L_0x017c
            r3 = 1
        L_0x017c:
            java.lang.String r1 = r7.A07     // Catch:{ all -> 0x01da }
            X.1Vw r0 = new X.1Vw     // Catch:{ all -> 0x01da }
            r0.<init>(r2, r1, r3)     // Catch:{ all -> 0x01da }
            r6.add(r0)     // Catch:{ all -> 0x01da }
            goto L_0x014c
        L_0x0187:
            X.0yR r5 = r5.A00     // Catch:{ all -> 0x01dc }
            X.AnonymousClass00B.A06(r5)     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = "message-handler-callback/onMessageHandlerAckTimeout/keys:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dc }
            r0.<init>(r1)     // Catch:{ all -> 0x01dc }
            r0.append(r6)     // Catch:{ all -> 0x01dc }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01dc }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01dc }
            X.0t3 r0 = r5.A0J     // Catch:{ all -> 0x01dc }
            long r2 = r0.A00()     // Catch:{ all -> 0x01dc }
            X.0sq r1 = r5.A0x     // Catch:{ all -> 0x01dc }
            X.1kJ r0 = new X.1kJ     // Catch:{ all -> 0x01dc }
            r0.<init>(r5, r6, r2)     // Catch:{ all -> 0x01dc }
            r1.Acl(r0)     // Catch:{ all -> 0x01dc }
            java.lang.String r0 = "disconnected"
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x01dc }
            r3.<init>(r0)     // Catch:{ all -> 0x01dc }
            java.util.Set r0 = r4.entrySet()     // Catch:{ all -> 0x01dc }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x01dc }
        L_0x01bc:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01dc }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x01dc }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x01dc }
            X.1kE r0 = (X.C34421kE) r0     // Catch:{ all -> 0x01dc }
            r0.A01(r3)     // Catch:{ all -> 0x01dc }
            r1.getKey()     // Catch:{ all -> 0x01dc }
            goto L_0x01bc
        L_0x01d5:
            r4.clear()     // Catch:{ all -> 0x01dc }
            monitor-exit(r4)     // Catch:{ all -> 0x01dc }
            return
        L_0x01da:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01dc }
        L_0x01dc:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01dc }
            throw r0
        L_0x01df:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01df }
            throw r0
        L_0x01e2:
            android.os.Bundle r1 = r10.getData()
            java.lang.String r0 = "iqId"
            java.lang.String r4 = r1.getString(r0)
            X.1CP r6 = r9.A00
            java.lang.Object r5 = r10.obj
            X.1Vv r5 = (X.C28371Vv) r5
            java.lang.Object r1 = r6.A0B
            monitor-enter(r1)
            java.util.Map r0 = r6.A0D     // Catch:{ all -> 0x029b }
            java.lang.Object r3 = r0.remove(r4)     // Catch:{ all -> 0x029b }
            X.0yc r3 = (X.C19550yc) r3     // Catch:{ all -> 0x029b }
            monitor-exit(r1)     // Catch:{ all -> 0x029b }
            if (r3 == 0) goto L_0x0288
            java.lang.String r1 = "type"
            r0 = 0
            java.lang.String r2 = r5.A0N(r1, r0)
            java.lang.String r0 = "result"
            boolean r0 = r0.equals(r2)     // Catch:{ 1W9 -> 0x0258 }
            if (r0 == 0) goto L_0x021e
            r1 = 6
            com.facebook.redex.IDxNConsumerShape0S1000000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape0S1000000_2_I0     // Catch:{ 1W9 -> 0x0258 }
            r0.<init>(r4, r1)     // Catch:{ 1W9 -> 0x0258 }
            r6.A02(r0)     // Catch:{ 1W9 -> 0x0258 }
            r3.AYG(r5, r4)     // Catch:{ 1W9 -> 0x0258 }
            goto L_0x0273
        L_0x021e:
            java.lang.String r0 = "error"
            boolean r0 = r0.equals(r2)     // Catch:{ 1W9 -> 0x0258 }
            if (r0 == 0) goto L_0x0232
            X.1kK r0 = new X.1kK     // Catch:{ 1W9 -> 0x0258 }
            r0.<init>(r5, r4)     // Catch:{ 1W9 -> 0x0258 }
            r6.A02(r0)     // Catch:{ 1W9 -> 0x0258 }
            r3.AQe(r5, r4)     // Catch:{ 1W9 -> 0x0258 }
            goto L_0x0273
        L_0x0232:
            r1 = 4
            com.facebook.redex.IDxNConsumerShape0S1000000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape0S1000000_2_I0     // Catch:{ 1W9 -> 0x0258 }
            r0.<init>(r4, r1)     // Catch:{ 1W9 -> 0x0258 }
            r6.A02(r0)     // Catch:{ 1W9 -> 0x0258 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1W9 -> 0x0258 }
            r1.<init>()     // Catch:{ 1W9 -> 0x0258 }
            java.lang.String r0 = "Unexpected type="
            r1.append(r0)     // Catch:{ 1W9 -> 0x0258 }
            r1.append(r2)     // Catch:{ 1W9 -> 0x0258 }
            java.lang.String r0 = " for iq:"
            r1.append(r0)     // Catch:{ 1W9 -> 0x0258 }
            r1.append(r4)     // Catch:{ 1W9 -> 0x0258 }
            java.lang.String r0 = r1.toString()     // Catch:{ 1W9 -> 0x0258 }
            X.AnonymousClass00B.A08(r0)     // Catch:{ 1W9 -> 0x0258 }
            goto L_0x0273
        L_0x0258:
            r5 = move-exception
            java.lang.String r0 = "xmppIncomingMessageRouter/handleIncomingIqResponse/corrupt-stream-error"
            com.whatsapp.util.Log.w(r0, r5)     // Catch:{ all -> 0x027d }
            r3 = 0
            com.facebook.redex.IDxNConsumerShape0S1000000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape0S1000000_2_I0     // Catch:{ all -> 0x027d }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x027d }
            r6.A02(r0)     // Catch:{ all -> 0x027d }
            X.0so r2 = r6.A05     // Catch:{ all -> 0x027d }
            java.lang.String r1 = "CorruptStreamException"
            java.lang.String r0 = r5.getMessage()     // Catch:{ all -> 0x027d }
            r2.AcB(r1, r0, r3)     // Catch:{ all -> 0x027d }
        L_0x0273:
            r1 = 5
            com.facebook.redex.IDxNConsumerShape0S1000000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape0S1000000_2_I0
            r0.<init>(r4, r1)
            r6.A02(r0)
            return
        L_0x027d:
            r2 = move-exception
            r1 = 5
            com.facebook.redex.IDxNConsumerShape0S1000000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape0S1000000_2_I0
            r0.<init>(r4, r1)
            r6.A02(r0)
            throw r2
        L_0x0288:
            java.lang.String r1 = "xmppIncomingMessageRouter/ignoring response due to missing callback for iqId:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x029b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x029b }
            throw r0
        L_0x029e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x029e }
            throw r0
        L_0x02a1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02a1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34431kF.handleMessage(android.os.Message):void");
    }
}
