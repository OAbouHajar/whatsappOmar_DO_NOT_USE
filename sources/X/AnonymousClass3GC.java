package X;

import android.os.SystemClock;
import com.obwhatsapp.mediaview.MediaViewFragment;

/* renamed from: X.3GC  reason: invalid class name */
public class AnonymousClass3GC implements AnonymousClass5T0 {
    public final /* synthetic */ MediaViewFragment A00;

    public AnonymousClass3GC(MediaViewFragment mediaViewFragment) {
        this.A00 = mediaViewFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0336, code lost:
        if (r12 == null) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0338, code lost:
        r6 = r4.A11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x033c, code lost:
        if (r6 != false) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x033e, code lost:
        r3 = r3;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0340, code lost:
        if (r12.A0P == false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0342, code lost:
        r5 = r12.A0F;
        r3 = r3;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0344, code lost:
        if (r5 == null) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0346, code lost:
        r2.A0C = false;
        X.AnonymousClass00B.A06(r5);
        r31 = android.net.Uri.fromFile(r5);
        r15 = r0.A0g;
        r14 = r0.A10;
        r12 = (long) r4.A00;
        r23 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0358, code lost:
        if (r6 == false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x035a, code lost:
        r23 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x035c, code lost:
        r19 = new X.C610537d(r15, r14, 1, r23, 2, r12, r5.lastModified(), r4.A01);
        r6 = new X.AnonymousClass2JK(r0.A0I, r0.A17, r4);
        r29 = new X.AnonymousClass29C(r0.A0D(), r31, r0.A0I, r0.A0e, r0.A0l, r0.A1a, new X.C79143zG(r0.A0h, r6, r0.A17, r4), r19);
        r6.A01 = r29;
        r12 = false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x04a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass01Q A7f(int r44) {
        /*
            r43 = this;
            r0 = r43
            com.obwhatsapp.mediaview.MediaViewFragment r0 = r0.A00
            r1 = r44
            X.0tY r11 = r0.A1U(r1)
            if (r11 != 0) goto L_0x0013
            r0 = 0
            X.01Q r1 = new X.01Q
            r1.<init>(r0, r0)
            return r1
        L_0x0013:
            X.1Vw r1 = r11.A11
            r42 = r1
            boolean r1 = r0.A1l
            r18 = r1
            r7 = 0
            r0.A1l = r7
            android.view.LayoutInflater r17 = r0.A05()
            byte r1 = r11.A10
            r41 = r1
            r9 = 1
            r8 = 0
            r2 = 2
            if (r1 != r2) goto L_0x00c3
            r2 = 2131559377(0x7f0d03d1, float:1.8744096E38)
            r1 = r17
            android.view.View r3 = r1.inflate(r2, r8)
            r1 = 2131363738(0x7f0a079a, float:1.8347293E38)
            android.view.ViewGroup r10 = X.C13690nt.A0K(r3, r1)
            r1 = 2131362086(0x7f0a0126, float:1.8343943E38)
            android.widget.ImageView r1 = X.C13680ns.A0K(r3, r1)
            int r2 = r11.A08
            if (r2 != r9) goto L_0x004c
            r2 = 2131232204(0x7f0805cc, float:1.808051E38)
            r1.setImageResource(r2)
        L_0x004c:
            r4 = r8
        L_0x004d:
            X.1Vw r5 = r0.A1L
            r2 = r42
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0062
            java.lang.String r2 = r42.toString()
            java.lang.String r2 = X.C47612Jr.A04(r2)
            X.C004601z.A0n(r1, r2)
        L_0x0062:
            if (r4 == 0) goto L_0x00b2
            X.1Ld r2 = r0.A1Z
            X.3HF r1 = new X.3HF
            r1.<init>(r0, r4)
            r23 = 100
            r24 = 1
            r25 = 0
            r18 = r2
            r19 = r4
            r20 = r11
            r21 = r1
            r22 = r42
            r18.A0A(r19, r20, r21, r22, r23, r24, r25)
        L_0x007e:
            if (r10 == 0) goto L_0x0506
            java.lang.String r1 = r11.A13()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x04f3
            r2 = 2131559378(0x7f0d03d2, float:1.8744098E38)
            r1 = r17
            android.view.View r6 = r1.inflate(r2, r8)
            r1 = 2131362580(0x7f0a0314, float:1.8344945E38)
            android.view.View r1 = X.C004601z.A0E(r6, r1)
            com.obwhatsapp.ui.media.MediaCaptionTextView r1 = (com.obwhatsapp.ui.media.MediaCaptionTextView) r1
            r0.A1U = r1
            r10.addView(r6, r7)
            r2 = 0
        L_0x00a2:
            int r1 = r10.getChildCount()
            if (r2 >= r1) goto L_0x04b0
            android.view.View r1 = r10.getChildAt(r2)
            X.C13690nt.A16(r1, r0)
            int r2 = r2 + 1
            goto L_0x00a2
        L_0x00b2:
            X.0tY r1 = r0.A1M
            if (r1 == 0) goto L_0x007e
            X.1Vw r2 = r1.A11
            r1 = r42
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007e
            r0.A1f = r9
            goto L_0x007e
        L_0x00c3:
            boolean r2 = r0.A1i
            boolean r1 = X.C38621r6.A0M(r41)
            if (r2 == 0) goto L_0x03af
            if (r1 == 0) goto L_0x018d
            r2 = 2131559380(0x7f0d03d4, float:1.8744102E38)
            r1 = r17
            android.view.View r3 = r1.inflate(r2, r8)
            r1 = 2131363738(0x7f0a079a, float:1.8347293E38)
            android.view.ViewGroup r10 = X.C13690nt.A0K(r3, r1)
            r1 = 2131366623(0x7f0a12df, float:1.8353145E38)
            android.view.View r1 = r3.findViewById(r1)
            com.obwhatsapp.mediaview.PhotoView r1 = (com.obwhatsapp.mediaview.PhotoView) r1
            r1.A08(r7)
            r1.A0K = r8
            r2 = r11
            X.1rK r2 = (X.C38731rK) r2
            r4 = 2131366927(0x7f0a140f, float:1.8353761E38)
            android.view.ViewGroup r5 = X.C13690nt.A0K(r3, r4)
            X.0ta r4 = X.C16730tY.A00(r2)
            java.io.File r12 = r4.A0F
            X.AnonymousClass00B.A06(r12)
            android.net.Uri r31 = android.net.Uri.fromFile(r12)
            X.0t3 r4 = r0.A0g
            r20 = r4
            X.0t9 r4 = r0.A10
            r16 = r4
            int r4 = r2.A00
            long r14 = (long) r4
            X.1Vw r4 = r2.A11
            boolean r6 = r4.A02
            r23 = 1
            if (r6 == 0) goto L_0x0117
            r23 = 3
        L_0x0117:
            long r27 = r12.lastModified()
            java.lang.Integer r22 = java.lang.Integer.valueOf(r9)
            r24 = 2
            long r12 = r2.A01
            X.37d r19 = new X.37d
            r25 = r14
            r29 = r12
            r21 = r16
            r19.<init>(r20, r21, r22, r23, r24, r25, r27, r29)
            X.0pt r6 = r0.A0I
            r20 = r6
            X.0sq r6 = r0.A1a
            r16 = r6
            X.01V r15 = r0.A0e
            X.013 r14 = r0.A0l
            X.00l r30 = r0.A0D()
            X.0tz r13 = r0.A0h
            X.1HE r12 = r0.A17
            X.3zG r6 = new X.3zG
            r6.<init>(r13, r12, r2)
            X.29C r12 = new X.29C
            r29 = r12
            r32 = r20
            r33 = r15
            r34 = r14
            r35 = r16
            r36 = r6
            r37 = r19
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37)
            r12.A0I = r9
            r12.A0F = r9
            X.2oj r6 = r12.A0Y
            X.C13690nt.A15(r6, r5)
            java.util.Map r6 = r0.A1x
            r6.put(r4, r12)
            X.3ux r4 = new X.3ux
            r4.<init>(r0, r1, r1, r2)
            r5.setOnTouchListener(r4)
            X.4kZ r2 = new X.4kZ
            r2.<init>(r0, r12)
            r3.setOnSystemUiVisibilityChangeListener(r2)
            X.53B r2 = new X.53B
            r2.<init>(r1)
            r12.A04 = r2
            r2 = 4
            r12.A04 = r2
            if (r18 == 0) goto L_0x018a
            r0.A1c = r12
            int r2 = r0.A04
            r12.A04 = r2
        L_0x018a:
            r4 = r1
            goto L_0x004d
        L_0x018d:
            boolean r1 = X.AnonymousClass20C.A00(r41)
            if (r1 == 0) goto L_0x0448
            r2 = 2131559379(0x7f0d03d3, float:1.87441E38)
            r1 = r17
            android.view.View r3 = r1.inflate(r2, r8)
            r1 = 2131362947(0x7f0a0483, float:1.8345689E38)
            android.view.View r2 = r3.findViewById(r1)
            r1 = 2131363739(0x7f0a079b, float:1.8347295E38)
            android.view.ViewGroup r10 = X.C13690nt.A0K(r2, r1)
            r1 = 2131366623(0x7f0a12df, float:1.8353145E38)
            android.view.View r1 = r3.findViewById(r1)
            com.obwhatsapp.mediaview.PhotoView r1 = (com.obwhatsapp.mediaview.PhotoView) r1
            r1.A08(r7)
            r1.A0K = r8
            r4 = r11
            X.1rK r4 = (X.C38731rK) r4
            r2 = 2131366927(0x7f0a140f, float:1.8353761E38)
            android.view.ViewGroup r16 = X.C13690nt.A0K(r3, r2)
            r2 = 2131362947(0x7f0a0483, float:1.8345689E38)
            android.view.View r2 = r3.findViewById(r2)
            com.obwhatsapp.videoplayback.ExoPlaybackControlView r2 = (com.obwhatsapp.videoplayback.ExoPlaybackControlView) r2
            android.widget.ImageView r6 = r2.A0H
            r5 = 8
            r6.setVisibility(r5)
            int r5 = r4.A00
            long r5 = X.C13690nt.A08(r5)
            r2.setDuration(r5)
            X.0ta r12 = r4.A02
            X.0pd r5 = r0.A0y
            boolean r5 = X.AnonymousClass20C.A02(r5, r4)
            if (r5 == 0) goto L_0x0336
            r2.A0C = r9
            X.0t9 r6 = r0.A10
            X.0w2 r5 = r0.A0x
            r36 = 2
            r35 = 1
            r37 = 1
            X.37e r30 = new X.37e
            r31 = r5
            r32 = r6
            r33 = r8
            r34 = r4
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)
            X.0pt r5 = r0.A0I
            r37 = r5
            X.0sq r5 = r0.A1a
            r36 = r5
            X.01V r5 = r0.A0e
            r34 = r5
            X.013 r5 = r0.A0l
            r35 = r5
            X.00l r32 = r0.A0D()
            X.0tz r5 = r0.A0h
            r25 = r5
            X.0pt r5 = r0.A0I
            r33 = r5
            X.0tb r5 = r0.A0N
            r21 = r5
            X.0pf r5 = r0.A0m
            r20 = r5
            X.0sP r5 = r0.A0X
            r19 = r5
            X.1P8 r15 = r0.A19
            X.12c r14 = r0.A1A
            X.0wP r13 = r0.A0S
            X.14t r12 = r0.A0p
            X.00l r5 = r0.A0D()
            X.0pN r5 = (X.C14550pN) r5
            X.37c r6 = new X.37c
            r22 = r21
            r23 = r13
            r24 = r19
            r26 = r20
            r27 = r12
            r28 = r15
            r29 = r14
            r31 = r4
            r19 = r6
            r20 = r5
            r21 = r33
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.29C r5 = new X.29C
            r39 = 1
            r40 = 0
            r31 = r5
            r33 = r37
            r37 = r8
            r38 = r30
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40)
            X.2Oi r12 = new X.2Oi
            r12.<init>(r5)
            r6.A00 = r12
            r5.A0A = r6
            X.3HK r6 = new X.3HK
            r6.<init>(r0, r4, r5)
            r5.A02 = r6
            r12 = 1
        L_0x0271:
            r5.A0C = r2
            X.2oj r14 = r5.A0Y
            r14.A02 = r2
            X.2PR r6 = r14.A01
            if (r6 == 0) goto L_0x027e
            r2.setPlayer(r6)
        L_0x027e:
            r6 = 2131363601(0x7f0a0711, float:1.8347015E38)
            android.view.View r13 = r3.findViewById(r6)
            com.obwhatsapp.videoplayback.ExoPlayerErrorFrame r13 = (com.obwhatsapp.videoplayback.ExoPlayerErrorFrame) r13
            X.4WY r6 = new X.4WY
            r6.<init>(r2, r13, r9)
            r14.A03 = r6
            if (r12 == 0) goto L_0x02a6
            com.facebook.redex.ViewOnClickCListenerShape2S0400000_I0 r13 = new com.facebook.redex.ViewOnClickCListenerShape2S0400000_I0
            r24 = 1
            r19 = r13
            r20 = r0
            r21 = r4
            r22 = r2
            r23 = r5
            r19.<init>(r20, r21, r22, r23, r24)
            com.obwhatsapp.videoplayback.ExoPlayerErrorFrame r6 = r6.A03
            r6.setOnRetryListener(r13)
        L_0x02a6:
            r15 = -1
            r6 = 17
            android.widget.FrameLayout$LayoutParams r13 = new android.widget.FrameLayout$LayoutParams
            r13.<init>(r15, r15, r6)
            r6 = r16
            r6.addView(r14, r13)
            java.util.Map r13 = r0.A1x
            X.1Vw r6 = r4.A11
            r13.put(r6, r5)
            java.lang.String r6 = r4.A13()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x02d9
            r6 = 2131362953(0x7f0a0489, float:1.8345701E38)
            android.view.View r14 = r2.findViewById(r6)
            X.00l r13 = r0.A0D()
            r6 = 2131232140(0x7f08058c, float:1.808038E38)
            android.graphics.drawable.Drawable r6 = X.AnonymousClass00T.A04(r13, r6)
            r14.setBackground(r6)
        L_0x02d9:
            r6 = 2
            com.facebook.redex.IDxDCompatShape4S0200000_2_I1 r13 = new com.facebook.redex.IDxDCompatShape4S0200000_2_I1
            r13.<init>(r2, r6, r0)
            r6 = r16
            X.C004601z.A0j(r6, r13)
            com.obwhatsapp.mediaview.IDxSListenerShape6S0300000_2_I1 r13 = new com.obwhatsapp.mediaview.IDxSListenerShape6S0300000_2_I1
            r22 = r1
            r25 = 0
            r19 = r13
            r20 = r0
            r21 = r1
            r23 = r4
            r24 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r6.setOnTouchListener(r13)
            com.obwhatsapp.mediaview.IDxSListenerShape6S0300000_2_I1 r6 = new com.obwhatsapp.mediaview.IDxSListenerShape6S0300000_2_I1
            r25 = 1
            r19 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r1.setOnTouchListener(r6)
            X.4ka r4 = new X.4ka
            r4.<init>(r0, r2, r5)
            r3.setOnSystemUiVisibilityChangeListener(r4)
            X.531 r4 = new X.531
            r4.<init>(r0, r5)
            r2.A05 = r4
            r4 = 2131366624(0x7f0a12e0, float:1.8353147E38)
            android.view.View r6 = r3.findViewById(r4)
            X.53D r4 = new X.53D
            r4.<init>(r6, r0, r1, r12)
            r5.A04 = r4
            r4 = 4
            r5.A04 = r4
            boolean r4 = r0.A0G
            if (r4 != 0) goto L_0x032d
            r2.A02()
        L_0x032d:
            if (r18 == 0) goto L_0x018a
            r0.A1c = r5
            r2.setVisibility(r7)
            goto L_0x018a
        L_0x0336:
            if (r12 == 0) goto L_0x018a
            X.1Vw r5 = r4.A11
            boolean r6 = r5.A02
            if (r6 != 0) goto L_0x0342
            boolean r5 = r12.A0P
            if (r5 == 0) goto L_0x018a
        L_0x0342:
            java.io.File r5 = r12.A0F
            if (r5 == 0) goto L_0x018a
            r2.A0C = r7
            X.AnonymousClass00B.A06(r5)
            android.net.Uri r31 = android.net.Uri.fromFile(r5)
            X.0t3 r15 = r0.A0g
            X.0t9 r14 = r0.A10
            int r12 = r4.A00
            long r12 = (long) r12
            r23 = 1
            if (r6 == 0) goto L_0x035c
            r23 = 3
        L_0x035c:
            long r27 = r5.lastModified()
            java.lang.Integer r22 = java.lang.Integer.valueOf(r9)
            r24 = 2
            long r5 = r4.A01
            X.37d r19 = new X.37d
            r25 = r12
            r29 = r5
            r20 = r15
            r21 = r14
            r19.<init>(r20, r21, r22, r23, r24, r25, r27, r29)
            X.0pt r12 = r0.A0I
            X.1HE r5 = r0.A17
            X.2JK r6 = new X.2JK
            r6.<init>(r12, r5, r4)
            X.0pt r5 = r0.A0I
            r21 = r5
            X.0sq r5 = r0.A1a
            r20 = r5
            X.01V r15 = r0.A0e
            X.013 r14 = r0.A0l
            X.00l r30 = r0.A0D()
            X.0tz r12 = r0.A0h
            X.1HE r5 = r0.A17
            X.3zG r13 = new X.3zG
            r13.<init>(r12, r6, r5, r4)
            X.29C r5 = new X.29C
            r29 = r5
            r32 = r21
            r33 = r15
            r34 = r14
            r35 = r20
            r36 = r13
            r37 = r19
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37)
            r6.A01 = r5
            r12 = 0
            goto L_0x0271
        L_0x03af:
            if (r1 == 0) goto L_0x0448
            r2 = 2131559382(0x7f0d03d6, float:1.8744106E38)
            r1 = r17
            android.view.View r3 = r1.inflate(r2, r8)
            r1 = 2131363738(0x7f0a079a, float:1.8347293E38)
            android.view.ViewGroup r10 = X.C13690nt.A0K(r3, r1)
            r2 = 11
            com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4 r1 = new com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4
            r1.<init>(r0, r2)
            r3.setOnClickListener(r1)
            X.0ta r14 = X.C16730tY.A00(r11)
            r1 = r42
            boolean r1 = r1.A02
            if (r1 != 0) goto L_0x03e8
            boolean r1 = r14.A0P
            if (r1 != 0) goto L_0x03e8
            X.0pt r4 = r0.A0I
            X.00l r2 = r0.A0D()
            X.0pN r2 = (X.C14550pN) r2
            int r1 = com.obwhatsapp.mediaview.MediaViewFragment.A01(r41)
            r4.A0F(r2, r1)
        L_0x03e8:
            r1 = 2131366927(0x7f0a140f, float:1.8353761E38)
            android.view.ViewGroup r6 = X.C13690nt.A0K(r3, r1)
            X.0pd r13 = r0.A0y
            X.0pt r12 = r0.A0I
            X.0sq r5 = r0.A1a
            X.01V r4 = r0.A0e
            X.013 r2 = r0.A0l
            android.content.Context r18 = r3.getContext()
            java.io.File r1 = r14.A0F
            X.AnonymousClass00B.A06(r1)
            r25 = 1
            r26 = 1
            r27 = 0
            r21 = r2
            r22 = r13
            r23 = r5
            r24 = r1
            r19 = r12
            r20 = r4
            X.29D r4 = X.AnonymousClass29D.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            android.view.View r1 = r4.A06()
            X.C13690nt.A15(r1, r6)
            X.538 r1 = new X.538
            r1.<init>(r0, r4)
            r4.A02 = r1
            r4.A0B(r9)
            X.535 r1 = new X.535
            r1.<init>()
            r4.A01 = r1
            java.util.Map r2 = r0.A1w
            r1 = r42
            r2.put(r1, r4)
            r1 = 2131366623(0x7f0a12df, float:1.8353145E38)
            android.view.View r4 = r3.findViewById(r1)
            com.obwhatsapp.mediaview.PhotoView r4 = (com.obwhatsapp.mediaview.PhotoView) r4
            r4.A08(r7)
            r4.A0K = r8
            r1 = r4
            goto L_0x004d
        L_0x0448:
            r2 = 2131559383(0x7f0d03d7, float:1.8744109E38)
            r1 = r17
            android.view.View r3 = r1.inflate(r2, r8)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1 = 2131363738(0x7f0a079a, float:1.8347293E38)
            android.view.ViewGroup r10 = X.C13690nt.A0K(r3, r1)
            android.content.Context r4 = r0.A02()
            r2 = 2
            com.obwhatsapp.mediaview.IDxPViewShape89S0100000_2_I1 r1 = new com.obwhatsapp.mediaview.IDxPViewShape89S0100000_2_I1
            r1.<init>(r4, r0, r2)
            r3.addView(r1, r7)
            r5 = 1
            r2 = r41
            if (r2 == r9) goto L_0x0479
            r4 = 25
            if (r2 == r4) goto L_0x0479
            r4 = 57
            if (r2 == r4) goto L_0x0479
            r4 = 42
            if (r2 == r4) goto L_0x0479
            r5 = 0
        L_0x0479:
            r1.A08(r5)
            boolean r2 = X.AnonymousClass20C.A00(r41)
            if (r2 != 0) goto L_0x04a4
            r2 = r8
        L_0x0483:
            r1.A0K = r2
            X.0ta r4 = X.C16730tY.A00(r11)
            r2 = r42
            boolean r2 = r2.A02
            if (r2 != 0) goto L_0x018a
            boolean r2 = r4.A0P
            if (r2 != 0) goto L_0x018a
            X.0pt r5 = r0.A0I
            X.00l r4 = r0.A0D()
            X.0pN r4 = (X.C14550pN) r4
            int r2 = com.obwhatsapp.mediaview.MediaViewFragment.A01(r41)
            r5.A0F(r4, r2)
            goto L_0x018a
        L_0x04a4:
            android.content.Context r4 = r0.A02()
            r2 = 2131232205(0x7f0805cd, float:1.8080513E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass00T.A04(r4, r2)
            goto L_0x0483
        L_0x04b0:
            com.obwhatsapp.ui.media.MediaCaptionTextView r1 = r0.A1U
            X.027 r5 = r1.A09
            X.00o r4 = r0.A0H()
            r2 = 5
            com.facebook.redex.IDxObserverShape37S0200000_2_I1 r1 = new com.facebook.redex.IDxObserverShape37S0200000_2_I1
            r1.<init>(r6, r2, r0)
            r5.A0A(r4, r1)
            java.lang.String r2 = r11.A13()
            r1 = 1024(0x400, float:1.435E-42)
            java.lang.String r1 = X.AnonymousClass1ZW.A05(r1, r2)
            android.text.SpannableStringBuilder r8 = X.C13690nt.A0F(r1)
            X.0zK r6 = r0.A1E
            android.content.Context r5 = r3.getContext()
            java.util.List r4 = r11.A0q
            r2 = 2131101963(0x7f06090b, float:1.781635E38)
            X.270 r1 = new X.270
            r1.<init>(r5, r6, r2, r9)
            r6.A03(r8, r1, r4)
            com.obwhatsapp.ui.media.MediaCaptionTextView r1 = r0.A1U
            r1.setCaptionText(r8)
            com.obwhatsapp.ui.media.MediaCaptionTextView r4 = r0.A1U
            r2 = 8
            com.facebook.redex.IDxCListenerShape53S0200000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape53S0200000_2_I1
            r1.<init>(r0, r2, r11)
            r4.setOnLongClickListener(r1)
        L_0x04f3:
            boolean r1 = r0.A1i
            if (r1 == 0) goto L_0x04fd
            boolean r1 = X.AnonymousClass20C.A00(r41)
            if (r1 != 0) goto L_0x0506
        L_0x04fd:
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x0503
            r7 = 8
        L_0x0503:
            r10.setVisibility(r7)
        L_0x0506:
            X.01Q r1 = new X.01Q
            r0 = r42
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3GC.A7f(int):X.01Q");
    }

    public void A7w(int i2) {
        AnonymousClass29D r0;
        MediaViewFragment mediaViewFragment = this.A00;
        C16730tY A1U = mediaViewFragment.A1U(i2);
        if (A1U != null && C38621r6.A0M(A1U.A10)) {
            AnonymousClass29D r02 = (AnonymousClass29D) mediaViewFragment.A1w.remove(A1U.A11);
            if (r02 != null) {
                r02.A09();
            }
        } else if (mediaViewFragment.A1i && A1U != null && (r0 = (AnonymousClass29D) mediaViewFragment.A1x.remove(A1U.A11)) != null) {
            r0.A09();
            r0.A01();
        }
    }

    public /* bridge */ /* synthetic */ int AF8(Object obj) {
        C28381Vw r2 = (C28381Vw) obj;
        AnonymousClass2B7 r0 = this.A00.A1C;
        if (r0 == null) {
            return -2;
        }
        return r0.AF9(r2);
    }

    public void ARO() {
        MediaViewFragment mediaViewFragment = this.A00;
        mediaViewFragment.A1p = true;
        MediaViewFragment.A05(mediaViewFragment);
        if (!mediaViewFragment.A1e && !mediaViewFragment.A1q) {
            long j2 = mediaViewFragment.A05;
            if (j2 != 0) {
                mediaViewFragment.A1V.A00(4, SystemClock.uptimeMillis() - j2);
                mediaViewFragment.A1q = true;
            }
        }
    }

    public int getCount() {
        AnonymousClass2B7 r0 = this.A00.A1C;
        if (r0 == null) {
            return 0;
        }
        return r0.getCount();
    }
}
