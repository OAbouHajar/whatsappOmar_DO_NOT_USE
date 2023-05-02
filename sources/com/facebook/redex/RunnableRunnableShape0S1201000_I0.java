package com.facebook.redex;

import X.C17170ue;
import com.whatsapp.jid.UserJid;

public class RunnableRunnableShape0S1201000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public RunnableRunnableShape0S1201000_I0(C17170ue r2, UserJid userJid, String str, int i2) {
        this.A04 = 0;
        this.A01 = r2;
        this.A00 = i2;
        this.A03 = str;
        this.A02 = userJid;
    }

    public RunnableRunnableShape0S1201000_I0(Object obj, Object obj2, String str, int i2, int i3) {
        this.A04 = i3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i2;
        this.A03 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0281, code lost:
        if (r2 != 4) goto L_0x0279;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r3 = r28
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L_0x02c2;
                case 1: goto L_0x0284;
                case 2: goto L_0x020d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A01
            X.10F r0 = (X.AnonymousClass10F) r0
            java.lang.String r5 = r3.A03
            int r1 = r3.A00
            java.lang.Object r8 = r3.A02
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            int r3 = r0.A00
            r2 = -1
            if (r3 == r2) goto L_0x01f4
            long r14 = android.os.SystemClock.elapsedRealtime()
            X.008 r4 = r0.A0I
            long r2 = r4.A00
            long r14 = r14 - r2
            long r16 = android.os.SystemClock.uptimeMillis()
            long r2 = r4.A01
            long r16 = r16 - r2
            boolean r2 = r0.A09
            if (r2 == 0) goto L_0x014d
            java.lang.Long r2 = r0.A06
            if (r2 == 0) goto L_0x012a
            r2 = 4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r2)
            java.lang.String r3 = r0.A07
            java.lang.String r2 = "from"
            r4.put(r2, r3)
            java.lang.String r2 = "to"
            r4.put(r2, r5)
            X.1hI r6 = r0.A05
            java.lang.Long r5 = r0.A06
            int r9 = r0.A00
            int r3 = X.C32661gv.A00
            r2 = 2
            if (r3 != r2) goto L_0x0125
            X.1gw r2 = X.C32671gw.A0A
            if (r2 == 0) goto L_0x0125
            java.util.concurrent.atomic.AtomicInteger r2 = r2.A06
            int r2 = r2.get()
            if (r2 == 0) goto L_0x0125
            long r26 = r5.longValue()
            r2 = 2
            long r2 = (long) r2
            long r26 = r26 | r2
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x0112
            java.util.Set r2 = r4.entrySet()
            java.util.Iterator r13 = r2.iterator()
            r23 = 0
            r7 = 0
        L_0x0074:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0112
            java.lang.Object r5 = r13.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r2 = r5.getKey()
            if (r2 == 0) goto L_0x0074
            java.lang.Object r2 = r5.getKey()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0074
            java.lang.Object r2 = r5.getValue()
            if (r2 == 0) goto L_0x0074
            java.lang.Object r2 = r5.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0074
            java.lang.Object r2 = r5.getKey()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.length()
            java.lang.Object r2 = r5.getKey()
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            int r3 = r3 + r2
            int r7 = r7 + r3
            long r3 = (long) r7
            r11 = 2048(0x800, double:1.0118E-320)
            r2 = 1
            int r10 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x00f5
            int r4 = X.C32711h0.A00
            int r3 = com.facebook.profilo.core.TraceEvents.sProviders
            r4 = r4 & r3
            if (r4 == 0) goto L_0x0074
            java.lang.Object r4 = r5.getKey()
            java.lang.String r4 = (java.lang.String) r4
            com.facebook.profilo.logger.MultiBufferLogger r3 = r6.A00
            r19 = 7
            r20 = 59
            r21 = 0
            r25 = 0
            r18 = r3
            r24 = r9
            int r11 = r18.writeStandardEntry(r19, r20, r21, r23, r24, r25, r26)
            if (r4 == 0) goto L_0x00e9
            r10 = 56
            int r11 = r3.writeBytesEntry(r2, r10, r11, r4)
        L_0x00e9:
            r10 = 57
            java.lang.Object r4 = r5.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r3.writeBytesEntry(r2, r10, r11, r4)
            goto L_0x0074
        L_0x00f5:
            java.util.Locale r3 = java.util.Locale.US
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r1[r23] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1[r2] = r0
            java.lang.String r0 = "Maximum Length(%d) of Profilo annotations exceeded %d"
            java.lang.String r1 = java.lang.String.format(r3, r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0112:
            r20 = 47
            com.facebook.profilo.logger.MultiBufferLogger r2 = r6.A00
            r19 = 7
            r21 = 0
            r23 = 0
            r25 = 0
            r18 = r2
            r24 = r9
            r18.writeStandardEntry(r19, r20, r21, r23, r24, r25, r26)
        L_0x0125:
            X.1hJ r2 = r0.A04
            r2.A00()
        L_0x012a:
            int r4 = r0.A00
            int r3 = X.C32661gv.A00
            r2 = 2
            if (r3 != r2) goto L_0x013d
            X.1gw r2 = X.C32671gw.A0A
            if (r2 == 0) goto L_0x013d
            int r3 = X.C32681gx.A02
            long r6 = (long) r4
            r4 = 1
            r5 = 0
            r2.A03(r3, r4, r5, r6)
        L_0x013d:
            X.0tz r2 = r0.A0E
            android.content.Context r5 = r2.A00
            java.lang.Class<com.obwhatsapp.perf.profilo.ProfiloUploadService> r4 = com.obwhatsapp.perf.profilo.ProfiloUploadService.class
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r5, r4)
            r2 = 8
            X.AnonymousClass03J.A00(r5, r3, r4, r2)
        L_0x014d:
            X.2l4 r3 = new X.2l4
            r3.<init>()
            int r2 = r0.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.A01 = r2
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            r3.A03 = r11
            java.lang.Long r10 = java.lang.Long.valueOf(r16)
            r3.A02 = r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3.A00 = r2
            X.0t9 r9 = r0.A0H
            X.00F r2 = r0.A02
            r9.A0A(r3, r2)
            int r3 = r0.A01
            r2 = 1
            if (r3 != r2) goto L_0x019d
            X.0pd r4 = r0.A0G
            r3 = 1626(0x65a, float:2.279E-42)
            X.0tM r2 = X.C16620tM.A02
            int r2 = r4.A03(r2, r3)
            if (r2 <= 0) goto L_0x019d
            long r2 = (long) r2
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x019d
            X.1xY r5 = new X.1xY
            r5.<init>()
            java.lang.String r4 = "app_launch"
            r5.A02 = r4
            r5.A00 = r11
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5.A01 = r2
            r9.A04(r5)
        L_0x019d:
            X.2l5 r7 = new X.2l5
            r7.<init>()
            int r6 = r0.A01
            r5 = 1
            r4 = 3
            r3 = 2
            if (r6 == r3) goto L_0x020b
            r2 = 3
            if (r6 == r4) goto L_0x01ad
            r2 = 1
        L_0x01ad:
            if (r1 == r3) goto L_0x0209
            if (r1 != r4) goto L_0x01b2
            r5 = 3
        L_0x01b2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.A01 = r2
            r7.A03 = r11
            r7.A02 = r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r7.A00 = r2
            X.00F r2 = r0.A02
            r9.A0A(r7, r2)
            X.0sq r4 = r0.A0T
            r3 = 11
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r2 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r2.<init>((X.AnonymousClass10F) r0, (int) r3)
            r4.Acl(r2)
            X.1dR r4 = r0.A03
            if (r4 == 0) goto L_0x01e9
            r2 = 2
            if (r2 != r1) goto L_0x01fa
            java.lang.String r3 = "chat"
        L_0x01dc:
            r2 = 1
            java.lang.String r1 = "destination"
            r4.A0A(r1, r3, r2)
            X.1dR r2 = r0.A03
            java.lang.String r1 = "render"
            r2.A08(r1)
        L_0x01e9:
            r1 = -1
            r0.A00 = r1
            r2 = 0
            r0.A07 = r2
            r1 = 0
            r0.A09 = r1
            r0.A06 = r2
        L_0x01f4:
            if (r8 == 0) goto L_0x01f9
            r8.run()
        L_0x01f9:
            return
        L_0x01fa:
            r2 = 1
            if (r2 != r1) goto L_0x0200
            java.lang.String r3 = "chat_list"
            goto L_0x01dc
        L_0x0200:
            r2 = 4
            if (r2 != r1) goto L_0x0206
            java.lang.String r3 = "call"
            goto L_0x01dc
        L_0x0206:
            java.lang.String r3 = ""
            goto L_0x01dc
        L_0x0209:
            r5 = 2
            goto L_0x01b2
        L_0x020b:
            r2 = 2
            goto L_0x01ad
        L_0x020d:
            java.lang.Object r0 = r3.A01
            X.1Wc r0 = (X.C28441Wc) r0
            int r4 = r3.A00
            java.lang.String r2 = r3.A03
            java.lang.Object r3 = r3.A02
            java.lang.Number r3 = (java.lang.Number) r3
            r0.A00()
            X.1Wd r6 = r0.A02
            java.lang.String r0 = "SyncResponseHandler/onGlobalError request failed with global error code="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = ", text="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", backoffMs="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0vs r2 = X.C28451Wd.A0K
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r2.containsKey(r1)
            r5 = 0
            if (r0 == 0) goto L_0x0259
            java.lang.Object r0 = r2.get(r1)
            X.AnonymousClass00B.A06(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r6.A03(r0, r5)
            return
        L_0x0259:
            int r2 = r4 / 100
            r0 = 5
            if (r2 != r0) goto L_0x027e
            r4 = 1
            X.1ue r0 = r6.A0J
            java.lang.Long r5 = r0.A00()
            if (r3 == 0) goto L_0x0279
            if (r5 == 0) goto L_0x0279
            long r2 = r3.longValue()
            long r0 = r5.longValue()
            long r0 = java.lang.Math.max(r2, r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L_0x0279:
            r1 = 0
        L_0x027a:
            r6.A04(r5, r4, r1)
            return
        L_0x027e:
            r4 = 0
            r0 = 4
            r1 = 1
            if (r2 == r0) goto L_0x027a
            goto L_0x0279
        L_0x0284:
            java.lang.Object r1 = r3.A01
            X.25g r1 = (X.C447225g) r1
            java.lang.Object r6 = r3.A02
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r5 = r3.A00
            java.lang.String r4 = r3.A03
            r0 = 1
            r1.A1P = r0
            android.content.Context r3 = r1.A1X
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.calling.VoipNotAllowedActivity"
            android.content.Intent r2 = r2.setClassName(r1, r0)
            java.util.ArrayList r1 = X.C16030sJ.A06(r6)
            java.lang.String r0 = "jids"
            r2.putStringArrayListExtra(r0, r1)
            java.lang.String r0 = "reason"
            r2.putExtra(r0, r5)
            if (r4 == 0) goto L_0x02b9
            java.lang.String r0 = "message"
            r2.putExtra(r0, r4)
        L_0x02b9:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            r3.startActivity(r2)
            return
        L_0x02c2:
            java.lang.Object r2 = r3.A01
            X.0ue r2 = (X.C17170ue) r2
            int r8 = r3.A00
            java.lang.String r7 = r3.A03
            java.lang.Object r5 = r3.A02
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            r6 = 0
            X.2RJ r1 = new X.2RJ
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A09
            int r0 = r0.getAndIncrement()
            long r3 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1.A08 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.A05 = r0
            java.lang.String r0 = r2.A00
            r1.A0B = r0
            r1.A0F = r7
            r1.A06 = r6
            X.0zR r0 = r2.A05
            java.lang.String r0 = r0.A00(r5)
            r1.A09 = r0
            r1.A07 = r6
            r1.A0E = r6
            r1.A02 = r6
            r1.A00 = r6
            r1.A0D = r6
            r1.A0G = r6
            r1.A0C = r6
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A08
            int r0 = r0.get()
            if (r0 == 0) goto L_0x0313
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
        L_0x0313:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A01 = r0
            X.0uP r0 = r2.A02
            X.1Vq r0 = r0.A00(r5)
            int r0 = X.AnonymousClass2RK.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            X.0t9 r0 = r2.A04
            r0.A06(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S1201000_I0.run():void");
    }
}
