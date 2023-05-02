package com.facebook.redex;

public class RunnableRunnableShape0S1411000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public boolean A06;
    public final int A07;

    public RunnableRunnableShape0S1411000_I0(Object obj, Object obj2, Object obj3, Object obj4, String str, int i2, int i3, boolean z2) {
        this.A07 = i3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A05 = str;
        this.A00 = i2;
        this.A04 = obj4;
        this.A06 = z2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r2 = r19
            int r0 = r2.A07
            java.lang.Object r4 = r2.A01
            X.0tb r4 = (X.C16760tb) r4
            if (r0 == 0) goto L_0x004f
            java.lang.Object r5 = r2.A02
            java.lang.String r8 = r2.A05
            java.lang.Object r3 = r2.A03
            byte[] r3 = (byte[]) r3
            int r9 = r2.A00
            java.lang.Object r7 = r2.A04
            boolean r11 = r2.A06
            X.1A9 r2 = r4.A1X
            int r0 = r3.length
            long r0 = (long) r0
            java.io.File r6 = r2.A0a(r8, r0)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0031 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0031 }
            r1.write(r3)     // Catch:{ all -> 0x002c }
            r1.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x0037
        L_0x002c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            r1 = move-exception
            java.lang.String r0 = "UserActions/prepareVCardDocument IO Exception when writing vcard document"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0037:
            boolean r0 = r6.exists()
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "UserActions/prepareVCardDocument Error writing vcard document file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0043:
            X.0pt r0 = r4.A03
            r10 = 0
            com.facebook.redex.RunnableRunnableShape0S1411000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S1411000_I0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.Acq(r3)
            return
        L_0x004f:
            java.lang.Object r12 = r2.A02
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r1 = r2.A03
            java.io.File r1 = (java.io.File) r1
            java.lang.String r11 = r2.A05
            int r3 = r2.A00
            java.lang.Object r10 = r2.A04
            X.0tZ r10 = (X.C16740tZ) r10
            boolean r0 = r2.A06
            X.0ta r8 = new X.0ta
            r8.<init>()
            r8.A0F = r1
            r8.A01 = r3
            X.0wK r6 = r4.A15
            r7 = 0
            r16 = 7
            r15 = 9
            r2 = 0
            r13 = r7
            r14 = r7
            r17 = 0
            r9 = r7
            r18 = r0
            X.1zg r6 = r6.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.A01
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0087:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r1 = r5.next()
            X.0tY r1 = (X.C16730tY) r1
            boolean r0 = r1 instanceof X.C38631rA
            if (r0 == 0) goto L_0x0087
            X.1rA r1 = (X.C38631rA) r1
            r1.A00 = r3
            java.lang.String r0 = "text/vcard"
            r1.A06 = r0
            r1.A07 = r11
            goto L_0x0087
        L_0x00a3:
            r4.A07(r6, r7, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S1411000_I0.run():void");
    }
}
