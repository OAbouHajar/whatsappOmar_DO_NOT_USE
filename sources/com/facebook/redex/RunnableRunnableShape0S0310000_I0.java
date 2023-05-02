package com.facebook.redex;

import X.AnonymousClass1ZS;
import X.C16730tY;
import X.C84504Ku;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.obwhatsapp.mediaview.PhotoView;
import java.util.AbstractList;
import java.util.Stack;

public class RunnableRunnableShape0S0310000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public RunnableRunnableShape0S0310000_I0(MediaViewFragment mediaViewFragment) {
        this.A04 = 7;
        this.A01 = mediaViewFragment;
        this.A00 = new Stack();
        this.A02 = new AnonymousClass1ZS(this, "PhotoLoader");
    }

    public RunnableRunnableShape0S0310000_I0(Object obj, Object obj2, Object obj3, int i2, boolean z2) {
        this.A04 = i2;
        this.A00 = obj;
        this.A03 = z2;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public void A00(PhotoView photoView, C16730tY r5) {
        C84504Ku r2 = new C84504Ku(this, photoView, r5);
        AbstractList abstractList = (AbstractList) this.A00;
        synchronized (abstractList) {
            abstractList.add(0, r2);
            abstractList.notifyAll();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x01ca */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A04
            switch(r0) {
                case 0: goto L_0x0105;
                case 1: goto L_0x0123;
                case 2: goto L_0x0158;
                case 3: goto L_0x0173;
                case 4: goto L_0x0194;
                case 5: goto L_0x01d0;
                case 6: goto L_0x0241;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r1.A01     // Catch:{ InterruptedException -> 0x00fd }
            com.obwhatsapp.mediaview.MediaViewFragment r2 = (com.obwhatsapp.mediaview.MediaViewFragment) r2     // Catch:{ InterruptedException -> 0x00fd }
            X.0sj r0 = r2.A0j     // Catch:{ InterruptedException -> 0x00fd }
            boolean r9 = r0.A0B()     // Catch:{ InterruptedException -> 0x00fd }
        L_0x0011:
            boolean r0 = r1.A03     // Catch:{ InterruptedException -> 0x00fd }
            if (r0 != 0) goto L_0x00fd
            java.lang.Object r3 = r1.A00     // Catch:{ InterruptedException -> 0x00fd }
            java.util.Stack r3 = (java.util.Stack) r3     // Catch:{ InterruptedException -> 0x00fd }
            int r0 = r3.size()     // Catch:{ InterruptedException -> 0x00fd }
            if (r0 != 0) goto L_0x0024
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x00fd }
            r3.wait()     // Catch:{ all -> 0x00f7 }
            monitor-exit(r3)     // Catch:{ all -> 0x00f7 }
        L_0x0024:
            boolean r0 = r1.A03     // Catch:{ InterruptedException -> 0x00fd }
            if (r0 != 0) goto L_0x00fd
            int r0 = r3.size()     // Catch:{ InterruptedException -> 0x00fd }
            if (r0 == 0) goto L_0x0011
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x00fd }
            java.lang.Object r0 = r3.pop()     // Catch:{ all -> 0x00fa }
            X.4Ku r0 = (X.C84504Ku) r0     // Catch:{ all -> 0x00fa }
            monitor-exit(r3)     // Catch:{ all -> 0x00fa }
            X.0tY r7 = r0.A01     // Catch:{ InterruptedException -> 0x00fd }
            X.0ta r6 = r7.A02     // Catch:{ InterruptedException -> 0x00fd }
            X.AnonymousClass00B.A06(r6)     // Catch:{ InterruptedException -> 0x00fd }
            java.io.File r4 = r6.A0F     // Catch:{ InterruptedException -> 0x00fd }
            r13 = 0
            if (r4 == 0) goto L_0x00cc
            if (r9 == 0) goto L_0x00cc
            boolean r3 = r7 instanceof X.C38681rF     // Catch:{ InterruptedException -> 0x00fd }
            r5 = 1
            if (r3 != 0) goto L_0x0063
            boolean r3 = r7 instanceof X.C38991rk     // Catch:{ InterruptedException -> 0x00fd }
            if (r3 != 0) goto L_0x0063
            byte r3 = r7.A10     // Catch:{ InterruptedException -> 0x00fd }
            boolean r3 = X.AnonymousClass20C.A00(r3)     // Catch:{ InterruptedException -> 0x00fd }
            if (r3 == 0) goto L_0x00cc
            android.graphics.Bitmap r10 = X.C18830xK.A01(r4)     // Catch:{ OutOfMemoryError -> 0x0061 }
            if (r10 != 0) goto L_0x00e9
            java.lang.String r3 = "mediaview/fillview/bitmap/null"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ OutOfMemoryError -> 0x0061 }
            goto L_0x00cc
        L_0x0061:
            r4 = move-exception
            goto L_0x00c4
        L_0x0063:
            com.obwhatsapp.mediaview.PhotoView r3 = r0.A00     // Catch:{ InterruptedException -> 0x00fd }
            int r4 = r3.getWidth()     // Catch:{ InterruptedException -> 0x00fd }
            int r3 = r3.getHeight()     // Catch:{ InterruptedException -> 0x00fd }
            if (r4 == 0) goto L_0x0071
            if (r3 != 0) goto L_0x0089
        L_0x0071:
            android.content.Context r3 = r2.A0u()     // Catch:{ InterruptedException -> 0x00fd }
            android.view.WindowManager r3 = X.AnonymousClass01V.A02(r3)     // Catch:{ InterruptedException -> 0x00fd }
            android.view.Display r4 = r3.getDefaultDisplay()     // Catch:{ InterruptedException -> 0x00fd }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ InterruptedException -> 0x00fd }
            r3.<init>()     // Catch:{ InterruptedException -> 0x00fd }
            r4.getSize(r3)     // Catch:{ InterruptedException -> 0x00fd }
            int r4 = r3.x     // Catch:{ InterruptedException -> 0x00fd }
            int r3 = r3.y     // Catch:{ InterruptedException -> 0x00fd }
        L_0x0089:
            int r4 = r4 * r3
            long r3 = (long) r4     // Catch:{ InterruptedException -> 0x00fd }
            r7 = 4
            long r3 = r3 * r7
            java.io.File r7 = r6.A0F     // Catch:{ InterruptedException -> 0x00fd }
            r15 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Long r14 = java.lang.Long.valueOf(r3)     // Catch:{ InterruptedException -> 0x00fd }
            r11 = 0
            X.25c r12 = new X.25c     // Catch:{ InterruptedException -> 0x00fd }
            r16 = 2147483647(0x7fffffff, float:NaN)
            r17 = 0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ InterruptedException -> 0x00fd }
            X.25d r3 = X.C37741pe.A06(r12, r7)     // Catch:{ InterruptedException -> 0x00fd }
            android.graphics.Bitmap r10 = r3.A02     // Catch:{ InterruptedException -> 0x00fd }
            java.io.File r3 = r6.A0F     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r4 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x00b8 }
            X.03o r3 = new X.03o     // Catch:{ IOException -> 0x00b8 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00b8 }
            int r3 = r3.A07(r5)     // Catch:{ IOException -> 0x00b8 }
            goto L_0x00bf
        L_0x00b8:
            r4 = move-exception
            java.lang.String r3 = "mediaview/getExif"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ InterruptedException -> 0x00fd }
            r3 = 1
        L_0x00bf:
            if (r10 == 0) goto L_0x00cc
            if (r3 == r5) goto L_0x00e9
            goto L_0x00d6
        L_0x00c4:
            java.lang.String r3 = "mediaview/oom"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ InterruptedException -> 0x00fd }
            java.lang.System.gc()     // Catch:{ InterruptedException -> 0x00fd }
        L_0x00cc:
            X.0pt r5 = r2.A0I     // Catch:{ InterruptedException -> 0x00fd }
            r3 = 33
            com.facebook.redex.RunnableRunnableShape3S0300000_I1 r4 = new com.facebook.redex.RunnableRunnableShape3S0300000_I1     // Catch:{ InterruptedException -> 0x00fd }
            r4.<init>(r1, r13, r0, r3)     // Catch:{ InterruptedException -> 0x00fd }
            goto L_0x00f2
        L_0x00d6:
            int r13 = r10.getWidth()     // Catch:{ InterruptedException -> 0x00fd }
            int r14 = r10.getHeight()     // Catch:{ InterruptedException -> 0x00fd }
            android.graphics.Matrix r15 = X.C17970vw.A08(r3)     // Catch:{ InterruptedException -> 0x00fd }
            r12 = 0
            r16 = 1
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ InterruptedException -> 0x00fd }
        L_0x00e9:
            X.0pt r5 = r2.A0I     // Catch:{ InterruptedException -> 0x00fd }
            r3 = 33
            com.facebook.redex.RunnableRunnableShape3S0300000_I1 r4 = new com.facebook.redex.RunnableRunnableShape3S0300000_I1     // Catch:{ InterruptedException -> 0x00fd }
            r4.<init>(r1, r10, r0, r3)     // Catch:{ InterruptedException -> 0x00fd }
        L_0x00f2:
            r5.A0K(r4)     // Catch:{ InterruptedException -> 0x00fd }
            goto L_0x0011
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00f7 }
            goto L_0x00fc
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00fa }
        L_0x00fc:
            throw r0     // Catch:{ InterruptedException -> 0x00fd }
        L_0x00fd:
            java.lang.Object r0 = r1.A00
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.clear()
            return
        L_0x0105:
            java.lang.Object r3 = r1.A00
            X.12A r3 = (X.AnonymousClass12A) r3
            boolean r0 = r1.A03
            java.lang.Object r2 = r1.A01
            X.0sH r2 = (X.C16010sH) r2
            java.lang.Object r1 = r1.A02
            X.0rv r1 = (X.C15830rv) r1
            if (r0 != 0) goto L_0x011a
            X.120 r0 = r3.A05
            r0.A04(r2)
        L_0x011a:
            X.0ub r0 = r3.A04
            r0.A05(r1)
            r0.A04(r1)
            return
        L_0x0123:
            java.lang.Object r4 = r1.A00
            X.0xS r4 = (X.C18910xS) r4
            boolean r0 = r1.A03
            java.lang.Object r3 = r1.A01
            X.0rv r3 = (X.C15830rv) r3
            java.lang.Object r2 = r1.A02
            X.0rx r2 = (X.C15840rx) r2
            if (r0 == 0) goto L_0x0153
            X.0xU r1 = r4.A02
            r0 = 0
            java.util.Set r1 = r1.A0F(r3, r0)
        L_0x013a:
            X.0ts r0 = r4.A09
            r0.A0D(r2)
            X.0xU r0 = r4.A02
            r0.A0V(r1)
            X.17E r0 = r4.A0C
            android.os.Handler r2 = r0.A02
            r1 = 19
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r4, r1, r3)
            r2.post(r0)
            return
        L_0x0153:
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x013a
        L_0x0158:
            java.lang.Object r3 = r1.A00
            X.0xS r3 = (X.C18910xS) r3
            java.lang.Object r4 = r1.A01
            X.0rv r4 = (X.C15830rv) r4
            java.lang.Object r2 = r1.A02
            java.lang.Number r2 = (java.lang.Number) r2
            boolean r0 = r1.A03
            X.0z4 r3 = r3.A0R
            int r2 = r2.intValue()
            r1 = r0 ^ 1
            r0 = 0
            r3.A08(r4, r0, r2, r1)
            return
        L_0x0173:
            java.lang.Object r4 = r1.A00
            X.0t6 r4 = (X.C16460t6) r4
            boolean r0 = r1.A03
            java.lang.Object r3 = r1.A01
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r1.A02
            X.0rv r2 = (X.C15830rv) r2
            X.0xq r1 = r4.A0r
            if (r0 == 0) goto L_0x0190
            r0 = 0
            r1.A0A(r3, r0)
        L_0x0189:
            X.17Z r1 = r4.A0C
            r0 = 0
            r1.A03(r2, r0)
            return
        L_0x0190:
            r1.A04(r2)
            goto L_0x0189
        L_0x0194:
            java.lang.Object r7 = r1.A00
            X.0us r7 = (X.C17310us) r7
            java.lang.Object r6 = r1.A01
            X.0sN r6 = (X.C16060sN) r6
            java.lang.Object r5 = r1.A02
            X.1ck r5 = (X.C30661ck) r5
            boolean r4 = r1.A03
            X.0tq r0 = r7.A09
            X.0tf r3 = r0.A02()
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x01cb }
            X.14v r1 = r7.A08     // Catch:{ all -> 0x01c6 }
            com.whatsapp.jid.UserJid r0 = r5.A03     // Catch:{ all -> 0x01c6 }
            long r0 = r1.A01(r0)     // Catch:{ all -> 0x01c6 }
            r7.A0F(r6, r0)     // Catch:{ all -> 0x01c6 }
            if (r4 == 0) goto L_0x01bc
            r7.A08(r5, r6)     // Catch:{ all -> 0x01c6 }
        L_0x01bc:
            r2.A00()     // Catch:{ all -> 0x01c6 }
            r2.close()     // Catch:{ all -> 0x01cb }
            r3.close()
            return
        L_0x01c6:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x01ca }
        L_0x01ca:
            throw r0     // Catch:{ all -> 0x01cb }
        L_0x01cb:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x01cf }
        L_0x01cf:
            throw r0
        L_0x01d0:
            java.lang.Object r0 = r1.A00
            X.2Ok r0 = (X.C48672Ok) r0
            java.lang.Object r8 = r1.A01
            X.1WF r8 = (X.AnonymousClass1WF) r8
            boolean r7 = r1.A03
            java.lang.Object r6 = r1.A02
            X.0yO r5 = r0.A01
            java.lang.Object r4 = r5.A0O
            monitor-enter(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x023e }
            r1.<init>()     // Catch:{ all -> 0x023e }
            java.lang.String r0 = "companion-device-manager/critical sync failed. DeviceJid: "
            r1.append(r0)     // Catch:{ all -> 0x023e }
            X.1WN r0 = r8.A01     // Catch:{ all -> 0x023e }
            com.whatsapp.jid.DeviceJid r0 = r0.A06     // Catch:{ all -> 0x023e }
            r1.append(r0)     // Catch:{ all -> 0x023e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x023e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x023e }
            X.139 r0 = r5.A08     // Catch:{ all -> 0x023e }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x023e }
            android.content.SharedPreferences r0 = r0.A01()     // Catch:{ all -> 0x023e }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x023e }
            java.lang.String r0 = "syncd_bootstrap_fail_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch:{ all -> 0x023e }
            r0.apply()     // Catch:{ all -> 0x023e }
            java.lang.Iterable r0 = r5.A01()     // Catch:{ all -> 0x023e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x023e }
        L_0x0219:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x023e }
            if (r0 == 0) goto L_0x0229
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x023e }
            X.1WC r0 = (X.AnonymousClass1WC) r0     // Catch:{ all -> 0x023e }
            r0.A01(r8)     // Catch:{ all -> 0x023e }
            goto L_0x0219
        L_0x0229:
            if (r7 == 0) goto L_0x022c
            goto L_0x0230
        L_0x022c:
            java.lang.String r0 = "syncd_failure"
            goto L_0x0232
        L_0x0230:
            java.lang.String r0 = "critical_sync_timeout"
        L_0x0232:
            r5.A0B(r0)     // Catch:{ all -> 0x023e }
            X.16Q r0 = r5.A0H     // Catch:{ all -> 0x023e }
            X.1iM r0 = r0.A04     // Catch:{ all -> 0x023e }
            r0.A03(r6)     // Catch:{ all -> 0x023e }
            monitor-exit(r4)     // Catch:{ all -> 0x023e }
            return
        L_0x023e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x023e }
            throw r0
        L_0x0241:
            java.lang.Object r4 = r1.A00
            X.1Mc r4 = (X.C26041Mc) r4
            java.lang.Object r3 = r1.A01
            X.20T r3 = (X.AnonymousClass20T) r3
            boolean r2 = r1.A03
            java.lang.Object r0 = r1.A02
            X.1kQ r0 = (X.C34531kQ) r0
            r4.A05(r3, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0310000_I0.run():void");
    }
}
