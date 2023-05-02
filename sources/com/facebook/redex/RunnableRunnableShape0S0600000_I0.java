package com.facebook.redex;

import X.C16740tZ;
import X.C16760tb;
import X.C35701mM;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class RunnableRunnableShape0S0600000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public RunnableRunnableShape0S0600000_I0(Uri uri, C16760tb r3, C35701mM r4, UserJid userJid, C16740tZ r6, List list) {
        this.A06 = 0;
        this.A00 = r3;
        this.A01 = uri;
        this.A02 = list;
        this.A03 = r6;
        this.A05 = r4;
        this.A04 = userJid;
    }

    public RunnableRunnableShape0S0600000_I0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2) {
        this.A06 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x012d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.A06
            switch(r1) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x013f;
                case 2: goto L_0x017d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.A00
            X.0rs r1 = (X.C15800rs) r1
            java.lang.Object r6 = r0.A01
            X.17g r6 = (X.C222617g) r6
            java.lang.Object r5 = r0.A02
            X.0t3 r5 = (X.C16440t3) r5
            java.lang.Object r4 = r0.A03
            X.0t6 r4 = (X.C16460t6) r4
            java.lang.Object r3 = r0.A04
            X.0t9 r3 = (X.C16490t9) r3
            java.lang.Object r7 = r0.A05
            X.0w3 r7 = (X.C18040w3) r7
            X.0rt r2 = r1.A00
            r2.A0C()
            java.util.ArrayList r10 = r1.A01
            monitor-enter(r10)
            int r0 = r10.size()     // Catch:{ all -> 0x00a5 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00a5 }
            r9.<init>(r0)     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r8 = r10.iterator()     // Catch:{ all -> 0x00a5 }
        L_0x0034:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x00a5 }
            X.0ru r1 = (X.C15820ru) r1     // Catch:{ all -> 0x00a5 }
            X.0rv r0 = r1.A01     // Catch:{ all -> 0x00a5 }
            int r0 = r2.A01(r0)     // Catch:{ all -> 0x00a5 }
            if (r0 <= 0) goto L_0x0034
            X.0rv r0 = r1.A01     // Catch:{ all -> 0x00a5 }
            r9.add(r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x0034
        L_0x004e:
            monitor-exit(r10)     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r12 = r9.iterator()
        L_0x0053:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x013e
            java.lang.Object r9 = r12.next()
            X.0rv r9 = (X.C15830rv) r9
            long r0 = r5.A00()
            X.18b r8 = r6.A05
            r11 = 1
            X.1Vw r10 = r8.A02(r9, r11)
            X.1u3 r8 = new X.1u3
            r8.<init>(r10, r0)
            r8.A0b(r9)
            r4.A0W(r8)
            if (r9 == 0) goto L_0x0053
            X.2JW r8 = new X.2JW
            r8.<init>()
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r8.A01 = r0
            java.lang.String r0 = r9.getRawString()
            java.lang.String r0 = r7.A03(r0)
            r8.A03 = r0
            r2.A0C()
            int r0 = r2.A01(r9)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A02 = r0
            r3.A06(r8)
            goto L_0x0053
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00a5 }
            throw r0
        L_0x00a8:
            java.lang.Object r4 = r0.A00
            X.0tb r4 = (X.C16760tb) r4
            java.lang.Object r9 = r0.A01
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.Object r8 = r0.A02
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r13 = r0.A03
            X.0tZ r13 = (X.C16740tZ) r13
            java.lang.Object r2 = r0.A05
            X.1mM r2 = (X.C35701mM) r2
            java.lang.Object r1 = r0.A04
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1A9 r3 = r4.A1X     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            r0 = 100
            android.graphics.Bitmap r7 = r3.A0W(r9, r0, r0)     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            r6.<init>()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0129 }
            r0 = 80
            r7.compress(r3, r0, r6)     // Catch:{ all -> 0x0129 }
            byte[] r5 = r6.toByteArray()     // Catch:{ all -> 0x0129 }
            r6.close()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            r7.recycle()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            int r0 = r8.size()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            r3.<init>(r0)     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            java.util.Iterator r6 = r8.iterator()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
        L_0x00eb:
            boolean r0 = r6.hasNext()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            if (r0 == 0) goto L_0x011c
            java.lang.Object r12 = r6.next()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            X.0rv r12 = (X.C15830rv) r12     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            X.0ta r10 = new X.0ta     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            r10.<init>()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            X.0wK r8 = r4.A15     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            r19 = 0
            r18 = 23
            r11 = 0
            r15 = r11
            r16 = r11
            r17 = r11
            r20 = 0
            r21 = 0
            r14 = r11
            X.0tY r0 = r8.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            X.1ra r0 = (X.C38891ra) r0     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            r2.A00(r0)     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            r0.A01 = r1     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            r3.add(r0)     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            goto L_0x00eb
        L_0x011c:
            X.0pt r2 = r4.A03     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            r1 = 8
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            r0.<init>(r4, r3, r5, r1)     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            r2.A0K(r0)     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
            return
        L_0x0129:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x012d }
        L_0x012d:
            throw r0     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x012e }
        L_0x012e:
            r3 = move-exception
            X.0pt r2 = r4.A03
            r1 = 2131887076(0x7f1203e4, float:1.9408749E38)
            r0 = 0
            r2.A07(r1, r0)
            java.lang.String r0 = "userActionSendProductMessages/product thumbnail load failed"
            com.whatsapp.util.Log.e(r0, r3)
        L_0x013e:
            return
        L_0x013f:
            java.lang.Object r4 = r0.A00
            X.1L3 r4 = (X.AnonymousClass1L3) r4
            java.lang.Object r6 = r0.A01
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            java.lang.Object r2 = r0.A02
            com.obwhatsapp.dialogs.ProgressDialogFragment r2 = (com.obwhatsapp.dialogs.ProgressDialogFragment) r2
            java.lang.Object r7 = r0.A03
            java.lang.Object r5 = r0.A04
            java.lang.Object r8 = r0.A05
            X.0uk r0 = r4.A02
            X.0sL r1 = X.C16050sL.A03(r6)
            X.28n r0 = r0.A03
            java.util.List r0 = r0.A00(r1)
            int r0 = r0.size()
            r10 = 0
            if (r0 <= 0) goto L_0x0165
            r10 = 1
        L_0x0165:
            r2.A1N()
            X.0pt r0 = r4.A01
            X.05f r2 = X.C011005f.RESUMED
            r9 = 2
            com.facebook.redex.RunnableRunnableShape0S0510000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S0510000_I0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            android.os.Handler r1 = r0.A02
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r0.<init>(r7, r2, r3, r9)
            r1.post(r0)
            return
        L_0x017d:
            java.lang.Object r4 = r0.A00
            X.1yj r4 = (X.C42821yj) r4
            java.lang.Object r8 = r0.A01
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            java.lang.Object r11 = r0.A02
            com.obwhatsapp.KeyboardPopupLayout r11 = (com.obwhatsapp.KeyboardPopupLayout) r11
            java.lang.Object r10 = r0.A03
            android.widget.ListView r10 = (android.widget.ListView) r10
            java.lang.Object r9 = r0.A04
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            java.lang.Object r3 = r0.A05
            android.view.View r3 = (android.view.View) r3
            X.1kZ r1 = r4.A2C
            r0 = 0
            r1.A0J(r0)
            android.view.View r7 = r4.A0I
            com.obwhatsapp.conversation.ConversationListView r0 = r4.A1n
            if (r0 != 0) goto L_0x01fa
            r2 = 0
        L_0x01a2:
            r0 = 0
            r11.setClipChildren(r0)
            int r12 = r10.getTranscriptMode()
            int r6 = r8.getHeight()
            float r1 = (float) r6
            r0 = 0
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r5.<init>(r0, r0, r0, r1)
            r0 = 250(0xfa, double:1.235E-321)
            r5.setDuration(r0)
            r7.startAnimation(r5)
            if (r2 == 0) goto L_0x01c6
            r2 = 2
            r10.setTranscriptMode(r2)
            r10.startAnimation(r5)
        L_0x01c6:
            android.graphics.drawable.Drawable r5 = r9.getBackground()
            boolean r2 = r5 instanceof X.AnonymousClass3LG
            if (r2 != 0) goto L_0x01d6
            X.3LG r2 = new X.3LG
            r2.<init>(r5)
            X.AnonymousClass3LG.A00(r2, r9)
        L_0x01d6:
            X.3NQ r2 = new X.3NQ
            r2.<init>(r9, r6)
            r2.setDuration(r0)
            r9.startAnimation(r2)
            X.3gW r7 = new X.3gW
            r7.<init>(r8, r9, r10, r11, r12)
            r2.setAnimationListener(r7)
            r0 = 1
            int r0 = r4.A04(r0)
            r4.A0R(r0)
            r0 = 8
            r3.setVisibility(r0)
            r4.A0B()
            return
        L_0x01fa:
            boolean r2 = r0.A0C()
            goto L_0x01a2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0600000_I0.run():void");
    }
}
