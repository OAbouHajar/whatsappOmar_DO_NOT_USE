package com.facebook.redex;

import android.view.View;

public class ViewOnClickCListenerShape2S0400000_I0 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public ViewOnClickCListenerShape2S0400000_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c9, code lost:
        if (r1.A00(new com.facebook.redex.IDxDListenerShape267S0100000_2_I1(r6, 1), r4, r5) == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e7, code lost:
        if (r0 == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0122, code lost:
        r6 = (X.C606634u) r6;
        r13 = r6.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A04
            switch(r0) {
                case 0: goto L_0x0036;
                case 1: goto L_0x015b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r12 = r14.A00
            X.1wh r12 = (X.C41811wh) r12
            java.lang.Object r1 = r14.A01
            java.util.concurrent.atomic.AtomicLong r1 = (java.util.concurrent.atomic.AtomicLong) r1
            java.lang.Object r11 = r14.A02
            X.2kE r11 = (X.C55722kE) r11
            java.lang.Object r10 = r14.A03
            android.graphics.PointF r10 = (android.graphics.PointF) r10
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r12.A00
            int r0 = r0.A0B
            r9 = 4
            if (r0 != r9) goto L_0x0035
            r12.A09()
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x0035
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.get()
            long r3 = r3 - r0
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            r12.A0D()
        L_0x0035:
            return
        L_0x0036:
            java.lang.Object r5 = r14.A00
            X.1cg r5 = (X.C30621cg) r5
            java.lang.Object r4 = r14.A01
            X.0rv r4 = (X.C15830rv) r4
            java.lang.Object r2 = r14.A02
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r3 = r14.A03
            X.0xS r1 = r5.A06
            r0 = 0
            r1.A04(r4, r2, r0)
            if (r3 == 0) goto L_0x0035
            X.0sq r2 = r5.A0B
            r1 = 48
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r0.<init>(r5, r4, r3, r1)
            r2.Acl(r0)
            return
        L_0x0059:
            com.obwhatsapp.ui.media.MediaCaptionTextView r0 = r11.A0F
            boolean r0 = r0.A05
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L_0x008d
            float r1 = r10.y
            android.view.View r0 = r11.A01
            int r0 = r0.getTop()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x008d
            com.obwhatsapp.ui.media.MediaCaptionTextView r0 = r11.A0F
            boolean r0 = r0.A0K()
            if (r0 != 0) goto L_0x0151
            com.obwhatsapp.ui.media.MediaCaptionTextView r0 = r11.A0F
            r0.setExpanded(r8)
            r12.A0C()
        L_0x007e:
            android.view.View r1 = r11.A02
            com.obwhatsapp.ui.media.MediaCaptionTextView r0 = r11.A0F
            int r0 = r0.getVisibility()
            r1.setVisibility(r0)
        L_0x0089:
            r12.A0G()
            return
        L_0x008d:
            com.obwhatsapp.ui.media.MediaCaptionTextView r0 = r11.A0F
            boolean r0 = r0.A0K()
            if (r0 != 0) goto L_0x0151
            X.1wk r6 = r12.A09()
            float r2 = r10.x
            float r1 = r10.y
            boolean r0 = r6 instanceof X.C606934x
            if (r0 == 0) goto L_0x011e
            X.34x r6 = (X.C606934x) r6
            com.obwhatsapp.mediaview.PhotoView r5 = r6.A0F
            X.1rJ r0 = r6.A0G
            com.obwhatsapp.InteractiveAnnotation r4 = X.AnonymousClass3A1.A00(r5, r0, r2, r1)
            if (r4 == 0) goto L_0x00cb
            android.content.Context r3 = r5.getContext()
            X.1P7 r2 = r6.A0D
            android.view.View r0 = r5.getRootView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.38j r1 = new X.38j
            r1.<init>(r3, r0, r2)
            r6.A01 = r1
            com.facebook.redex.IDxDListenerShape267S0100000_2_I1 r0 = new com.facebook.redex.IDxDListenerShape267S0100000_2_I1
            r0.<init>(r6, r8)
            boolean r0 = r1.A00(r0, r4, r5)
            if (r0 != 0) goto L_0x0089
        L_0x00cb:
            float r1 = r10.x
            android.view.View r0 = r11.A07
            int r0 = r0.getWidth()
            int r0 = r0 / 6
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x011a
            r3 = 9
            r9 = 5
        L_0x00dd:
            X.4L6 r0 = r12.A0R
            if (r8 == 0) goto L_0x00ed
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = r0.A02
            boolean r0 = com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment.A03(r0, r3, r9)
        L_0x00e7:
            if (r0 != 0) goto L_0x0089
        L_0x00e9:
            r12.A0D()
            goto L_0x0089
        L_0x00ed:
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r2 = r0.A02
            java.util.List r0 = r2.A0k
            if (r0 == 0) goto L_0x00e9
            int r1 = r2.A00
            if (r1 <= 0) goto L_0x0104
            r0 = 1
            int r1 = r1 - r0
            r2.A1N(r1)
            X.1wi r0 = r2.A1J()
            r2.A1Q(r0, r3, r9)
            goto L_0x0089
        L_0x0104:
            X.00l r1 = r2.A0C()
            X.1zc r1 = (X.C43211zc) r1
            if (r1 == 0) goto L_0x00e9
            com.whatsapp.jid.UserJid r0 = r2.A0S
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.getRawString()
            boolean r0 = r1.ASR(r0, r3, r9, r7)
            goto L_0x00e7
        L_0x011a:
            r8 = 0
            r3 = 8
            goto L_0x00dd
        L_0x011e:
            boolean r0 = r6 instanceof X.C606634u
            if (r0 == 0) goto L_0x00cb
            X.34u r6 = (X.C606634u) r6
            com.obwhatsapp.mediaview.PhotoView r13 = r6.A05
            X.1rF r0 = r6.A06
            com.obwhatsapp.InteractiveAnnotation r5 = X.AnonymousClass3A1.A00(r13, r0, r2, r1)
            if (r5 == 0) goto L_0x00cb
            com.facebook.redex.IDxDListenerShape267S0100000_2_I1 r4 = new com.facebook.redex.IDxDListenerShape267S0100000_2_I1
            r4.<init>(r6, r7)
            android.content.Context r3 = r13.getContext()
            X.1P7 r2 = r6.A04
            android.view.View r1 = r13.getRootView()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.38j r0 = new X.38j
            r0.<init>(r3, r1, r2)
            r6.A00 = r0
            boolean r0 = r0.A00(r4, r5, r13)
            if (r0 == 0) goto L_0x00cb
            r6.A04()
            goto L_0x0089
        L_0x0151:
            com.obwhatsapp.ui.media.MediaCaptionTextView r0 = r11.A0F
            r0.setExpanded(r7)
            r12.A0D()
            goto L_0x007e
        L_0x015b:
            java.lang.Object r5 = r14.A00
            com.obwhatsapp.mediaview.MediaViewFragment r5 = (com.obwhatsapp.mediaview.MediaViewFragment) r5
            java.lang.Object r4 = r14.A01
            X.0tY r4 = (X.C16730tY) r4
            java.lang.Object r1 = r14.A02
            com.obwhatsapp.videoplayback.ExoPlaybackControlView r1 = (com.obwhatsapp.videoplayback.ExoPlaybackControlView) r1
            java.lang.Object r3 = r14.A03
            X.29D r3 = (X.AnonymousClass29D) r3
            java.lang.String r0 = r4.A08
            if (r0 == 0) goto L_0x0185
            r2 = 0
            r1.setPlayControlVisibility(r2)
            r3.A09()
            X.0tb r1 = r5.A0N
            X.00l r0 = r5.A0D()
            X.0pN r0 = (X.C14550pN) r0
            r1.A05(r0, r4, r2)
            r3.A08()
            return
        L_0x0185:
            java.lang.String r0 = "cannot retry download on message with null url, key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r4.A11
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape2S0400000_I0.onClick(android.view.View):void");
    }
}
