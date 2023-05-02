package X;

import android.view.View;
import android.widget.FrameLayout;
import com.facebook.redex.IDxTRendererShape14S0101000_2_I1;
import com.obwhatsapp.mediacomposer.doodle.DoodleView;
import com.obwhatsapp.mediaview.PhotoView;
import com.obwhatsapp.videoplayback.ExoPlayerErrorFrame;
import java.util.List;

/* renamed from: X.34x  reason: invalid class name and case insensitive filesystem */
public class C606934x extends C41841wk {
    public float A00 = 0.0f;
    public C613038j A01;
    public AnonymousClass29D A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07 = true;
    public final View A08;
    public final FrameLayout A09;
    public final FrameLayout A0A;
    public final C15900s5 A0B;
    public final C14710pd A0C;
    public final AnonymousClass1P7 A0D;
    public final DoodleView A0E;
    public final PhotoView A0F;
    public final C38721rJ A0G;
    public final AnonymousClass5S9 A0H;
    public final AnonymousClass1PA A0I;
    public final C25791Ld A0J;
    public final C16320sq A0K;
    public final ExoPlayerErrorFrame A0L;
    public final AnonymousClass1P9 A0M;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C606934x(X.C19980zJ r17, X.C16180sb r18, X.C14870pt r19, X.C15900s5 r20, X.AnonymousClass01V r21, X.AnonymousClass013 r22, X.C17250um r23, X.C14710pd r24, X.AnonymousClass1P7 r25, X.AnonymousClass1P8 r26, X.C16740tZ r27, X.AnonymousClass4Ta r28, X.AnonymousClass1PA r29, X.AnonymousClass1MF r30, X.C25791Ld r31, X.C16320sq r32, X.AnonymousClass1P9 r33) {
        /*
            r16 = this;
            r3 = r27
            r9 = r16
            r15 = r28
            r14 = r26
            r11 = r19
            r10 = r17
            r12 = r21
            r13 = r22
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r6 = 1
            r9.A07 = r6
            r4 = 0
            r9.A00 = r4
            r0 = r24
            r9.A0C = r0
            r0 = r20
            r9.A0B = r0
            r0 = r25
            r9.A0D = r0
            r0 = r32
            r9.A0K = r0
            r0 = r31
            r9.A0J = r0
            r0 = r33
            r9.A0M = r0
            r0 = r29
            r9.A0I = r0
            X.AnonymousClass00B.A06(r3)
            X.1rJ r3 = (X.C38721rJ) r3
            r9.A0G = r3
            android.content.Context r0 = r9.A01()
            android.app.Activity r1 = X.C19980zJ.A00(r0)
            r0 = 2131366922(0x7f0a140a, float:1.8353751E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r9.A0A = r0
            android.content.Context r0 = r9.A01()
            android.app.Activity r1 = X.C19980zJ.A00(r0)
            r0 = 2131366923(0x7f0a140b, float:1.8353753E38)
            android.view.View r0 = r1.findViewById(r0)
            r9.A08 = r0
            android.content.Context r0 = r9.A01()
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            r5.<init>(r0)
            r9.A09 = r5
            android.content.Context r0 = r9.A01()
            com.obwhatsapp.mediaview.PhotoView r2 = new com.obwhatsapp.mediaview.PhotoView
            r2.<init>(r0)
            r9.A0F = r2
            r2.A01 = r4
            r4 = 0
            r2.A08(r4)
            r2.A0V = r4
            r2.setEnabled(r4)
            android.content.Context r0 = r9.A01()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131099794(0x7f060092, float:1.7811951E38)
            int r0 = r1.getColor(r0)
            r2.setBackgroundColor(r0)
            android.content.Context r1 = r9.A01()
            com.obwhatsapp.videoplayback.ExoPlayerErrorFrame r0 = new com.obwhatsapp.videoplayback.ExoPlayerErrorFrame
            r0.<init>(r1)
            r9.A0L = r0
            r5.addView(r2)
            r5.addView(r0)
            r0 = 2131366365(0x7f0a11dd, float:1.8352621E38)
            r5.setId(r0)
            r9.A0H()
            X.0ta r1 = X.C16730tY.A00(r3)
            X.1Vw r0 = r3.A11
            boolean r0 = r0.A02
            r3 = 0
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r1.A0P
            if (r0 != 0) goto L_0x00f4
            boolean r0 = r1.A0O
            if (r0 != 0) goto L_0x00f4
            java.lang.String r0 = r1.A0H
            if (r0 == 0) goto L_0x00f4
            r1 = r18
            java.io.File r2 = X.C17970vw.A0E(r1, r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x00f4
            android.content.Context r0 = r9.A01()
            com.obwhatsapp.mediacomposer.doodle.DoodleView r1 = new com.obwhatsapp.mediacomposer.doodle.DoodleView
            r1.<init>(r0)
            android.content.Context r0 = r9.A01()
            r7 = r30
            r8 = r23
            X.3Bj r0 = X.C62033Bj.A02(r0, r13, r8, r7, r2)
            if (r0 == 0) goto L_0x00f3
            r1.setLayerType(r6, r3)
            r1.setEnabled(r4)
            r1.setDoodle(r0)
            X.C13690nt.A15(r1, r5)
        L_0x00f3:
            r3 = r1
        L_0x00f4:
            r9.A0E = r3
            X.51s r0 = new X.51s
            r0.<init>(r9)
            r9.A0H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C606934x.<init>(X.0zJ, X.0sb, X.0pt, X.0s5, X.01V, X.013, X.0um, X.0pd, X.1P7, X.1P8, X.0tZ, X.4Ta, X.1PA, X.1MF, X.1Ld, X.0sq, X.1P9):void");
    }

    public long A08() {
        long j2;
        C38721rJ r0 = this.A0G;
        C16750ta A002 = C16730tY.A00(r0);
        long j3 = 0;
        if (r0.A11.A02 && !A002.A0P && !A002.A0O) {
            long j4 = A002.A0D;
            if (j4 >= 0) {
                long j5 = A002.A0E;
                if (j5 > 0) {
                    j2 = j5 - j4;
                    return Math.min(C13690nt.A08(this.A0B.A02(C15910s6.A1y)), j2);
                }
            }
        }
        AnonymousClass29D r02 = this.A02;
        if (r02 != null) {
            j3 = (long) r02.A04();
        }
        j2 = j3;
        return Math.min(C13690nt.A08(this.A0B.A02(C15910s6.A1y)), j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        if (r7 != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09() {
        /*
            r11 = this;
            X.1PA r2 = r11.A0I
            X.5S9 r1 = r11.A0H
            java.util.List r0 = r2.A04
            if (r0 != 0) goto L_0x000e
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r2.A04 = r0
        L_0x000e:
            r0.add(r1)
            boolean r0 = r2.A05
            r11.A0I(r0)
            boolean r0 = r11.A06
            r10 = 0
            if (r0 == 0) goto L_0x0020
            r11.A06 = r10
            r11.A0C()
        L_0x0020:
            boolean r0 = r11.A04
            if (r0 != 0) goto L_0x0078
            r11.A0D()
            X.29D r9 = r11.A02
            if (r9 == 0) goto L_0x007f
            X.1rJ r0 = r11.A0G
            X.0ta r8 = X.C16730tY.A00(r0)
            X.1Vw r0 = r0.A11
            boolean r7 = r0.A02
            if (r7 == 0) goto L_0x0079
            boolean r0 = r8.A0P
            if (r0 != 0) goto L_0x0079
            boolean r0 = r8.A0O
            if (r0 != 0) goto L_0x0079
            long r3 = r8.A0D
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0079
            long r1 = r8.A0E
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0079
            int r0 = (int) r3
            r9.A0A(r0)
        L_0x0051:
            boolean r0 = r8.A0P
            if (r0 != 0) goto L_0x0061
            boolean r0 = r8.A0O
            if (r0 != 0) goto L_0x0061
            boolean r0 = r8.A0N
            if (r0 == 0) goto L_0x0061
            r0 = 1
            r11.A0I(r0)
        L_0x0061:
            X.29D r0 = r11.A02
            r0.A08()
            com.obwhatsapp.mediacomposer.doodle.DoodleView r2 = r11.A0E
            if (r2 == 0) goto L_0x0075
            X.29m r1 = r2.A0G
            r0 = 1
            r1.A0A = r0
            android.os.SystemClock.elapsedRealtime()
            r2.invalidate()
        L_0x0075:
            r11.A0G()
        L_0x0078:
            return
        L_0x0079:
            r9.A0A(r10)
            if (r7 == 0) goto L_0x0061
            goto L_0x0051
        L_0x007f:
            java.lang.String r0 = "video player is null for "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.1rJ r0 = r11.A0G
            X.1Vw r0 = r0.A11
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C606934x.A09():void");
    }

    public void A0A() {
        A0E();
        AnonymousClass29D r1 = this.A02;
        if (r1 != null && !r1.A0E()) {
            r1.A09();
        }
        DoodleView doodleView = this.A0E;
        if (doodleView != null) {
            doodleView.A0G.A0A = false;
            doodleView.invalidate();
        }
        AnonymousClass1PA r2 = this.A0I;
        r2.A02(this);
        this.A03 = false;
        A0F();
        this.A08.setVisibility(0);
        A0H();
        this.A00 = 0.0f;
        this.A07 = true;
        AnonymousClass5S9 r12 = this.A0H;
        List list = r2.A04;
        if (list != null) {
            list.remove(r12);
        }
    }

    public final int A0B() {
        AnonymousClass29D r6 = this.A02;
        if (r6 == null) {
            return 0;
        }
        C38721rJ r0 = this.A0G;
        C16750ta A002 = C16730tY.A00(r0);
        return (!r0.A11.A02 || A002.A0P || A002.A0O || A002.A0D < 0 || A002.A0E <= 0) ? r6.A03() : r6.A03() - ((int) A002.A0D);
    }

    public final void A0C() {
        PhotoView photoView = this.A0F;
        if (photoView.getVisibility() == 0) {
            View A0J2 = C13690nt.A0J(C19980zJ.A00(A01()));
            this.A0J.A07(photoView, this.A0G, new IDxTRendererShape14S0101000_2_I1(this, Math.max(A0J2.getWidth(), A0J2.getHeight()), 2));
        }
    }

    /* JADX WARNING: type inference failed for: r15v6, types: [X.1cs] */
    /* JADX WARNING: type inference failed for: r4v34, types: [X.1cs] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D() {
        /*
            r38 = this;
            r7 = 0
            r1 = r38
            X.29D r0 = r1.A02
            if (r0 != 0) goto L_0x0023
            r1.A0E()
            X.1rJ r2 = r1.A0G
            X.0ta r6 = X.C16730tY.A00(r2)
            java.io.File r0 = r6.A0F
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x002f
        L_0x001a:
            com.obwhatsapp.mediaview.PhotoView r2 = r1.A0F
            X.3zM r0 = new X.3zM
            r0.<init>(r2)
            r1.A02 = r0
        L_0x0023:
            android.widget.FrameLayout r1 = r1.A0A
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L_0x002e
            r1.setVisibility(r7)
        L_0x002e:
            return
        L_0x002f:
            X.0pd r12 = r1.A0C
            r3 = 2917(0xb65, float:4.088E-42)
            X.0tM r0 = X.C16620tM.A02
            java.lang.String r0 = r12.A06(r0, r3)
            boolean r0 = X.C41971wz.A0B(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02cb
            com.obwhatsapp.videoplayback.ExoPlayerErrorFrame r5 = r1.A0L
            r5.setVisibility(r7)
            X.1P9 r0 = r1.A0M
            android.widget.FrameLayout r3 = r1.A09
            android.content.Context r8 = r3.getContext()
            X.29C r4 = r0.A00
            r3 = 0
            if (r4 != 0) goto L_0x01d4
            X.0t3 r14 = r0.A06
            X.0pt r4 = r0.A01
            r30 = r4
            X.0sq r4 = r0.A0H
            r33 = r4
            X.0t9 r15 = r0.A0D
            X.1P8 r10 = r0.A0F
            X.01V r4 = r0.A05
            r31 = r4
            X.013 r4 = r0.A08
            r32 = r4
            java.lang.Class<X.0pN> r9 = X.C14550pN.class
            X.0ta r11 = X.C16730tY.A00(r2)
            X.1co r12 = r10.A00(r11)
            boolean r4 = r11.A0Z
            r13 = 1
            if (r4 == 0) goto L_0x01d1
            if (r12 == 0) goto L_0x01d1
            X.2Oh r4 = r12.A0i
            if (r4 == 0) goto L_0x01d1
        L_0x007e:
            r4 = 0
            if (r13 != 0) goto L_0x0158
            X.0pd r13 = r0.A0C
            boolean r13 = X.AnonymousClass20C.A02(r13, r2)
            if (r13 != 0) goto L_0x0158
            java.io.File r5 = r11.A0F
            if (r5 == 0) goto L_0x00dd
            android.net.Uri r29 = android.net.Uri.fromFile(r5)
            X.1HE r9 = r0.A0E
            X.2JK r5 = new X.2JK
            r4 = r30
            r5.<init>(r4, r9, r2)
            android.app.Activity r28 = X.C19980zJ.A00(r8)
            X.0tz r4 = r0.A07
            X.3zG r8 = new X.3zG
            r8.<init>(r4, r5, r9, r2)
            int r4 = r2.A00
            long r12 = (long) r4
            X.1Vw r4 = r2.A11
            boolean r4 = r4.A02
            r20 = 1
            if (r4 == 0) goto L_0x00b2
            r20 = 3
        L_0x00b2:
            java.io.File r4 = r11.A0F
            long r24 = r4.lastModified()
            java.lang.Integer r19 = X.C13690nt.A0U()
            r21 = 3
            long r9 = r2.A01
            X.37d r16 = new X.37d
            r22 = r12
            r26 = r9
            r17 = r14
            r18 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r24, r26)
            X.29C r4 = new X.29C
            r27 = r4
            r34 = r8
            r35 = r16
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35)
            r5.A01 = r4
            r5 = 1
            r4.A0F = r5
        L_0x00dd:
            r0.A00 = r4
            if (r4 == 0) goto L_0x00e6
            r3 = 1
            r4.A0H = r3
        L_0x00e4:
            X.29C r3 = r0.A00
        L_0x00e6:
            r1.A02 = r3
        L_0x00e8:
            X.29D r3 = r1.A02
            if (r3 == 0) goto L_0x001a
            X.537 r0 = new X.537
            r0.<init>(r1)
            r3.A02 = r0
            X.539 r0 = new X.539
            r0.<init>(r1)
            r3.A03 = r0
            X.533 r0 = new X.533
            r0.<init>(r1)
            r3.A00 = r0
            boolean r0 = r1.A05
            r3.A0B(r0)
            X.1Vw r0 = r2.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0152
            boolean r0 = r6.A0P
            if (r0 != 0) goto L_0x0152
            boolean r0 = r6.A0O
            if (r0 != 0) goto L_0x0152
            long r3 = r6.A0D
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0152
            long r5 = r6.A0E
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0152
            X.29D r2 = r1.A02
            int r0 = (int) r3
            r2.A0A(r0)
        L_0x0128:
            boolean r0 = r1 instanceof X.C606834w
            if (r0 == 0) goto L_0x0134
            X.29D r2 = r1.A02
            if (r2 == 0) goto L_0x0134
            r0 = 1
            r2.A0B(r0)
        L_0x0134:
            X.29D r0 = r1.A02
            android.view.View r5 = r0.A06()
            android.view.ViewParent r0 = r5.getParent()
            if (r0 != 0) goto L_0x0023
            android.widget.FrameLayout r4 = r1.A0A
            r4.removeAllViews()
            r3 = 17
            r2 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r2, r3)
            r4.addView(r5, r7, r0)
            goto L_0x0023
        L_0x0152:
            X.29D r0 = r1.A02
            r0.A0A(r7)
            goto L_0x0128
        L_0x0158:
            X.0w2 r11 = r0.A0B
            if (r12 == 0) goto L_0x015e
            X.1cs r4 = r12.A0c
        L_0x015e:
            r17 = 2
            r18 = 3
            r19 = 5
            X.37e r27 = new X.37e
            r12 = r27
            r13 = r11
            r14 = r15
            r15 = r4
            r16 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            android.app.Activity r29 = X.C19980zJ.A01(r8, r9)
            X.0tz r4 = r0.A07
            r22 = r4
            X.0tb r15 = r0.A02
            X.0pf r14 = r0.A09
            X.0sP r13 = r0.A04
            X.12c r12 = r0.A0G
            X.0wP r11 = r0.A03
            X.14t r4 = r0.A0A
            android.app.Activity r9 = X.C19980zJ.A01(r8, r9)
            X.0pN r9 = (X.C14550pN) r9
            X.37c r8 = new X.37c
            r23 = r14
            r24 = r4
            r25 = r10
            r26 = r12
            r28 = r2
            r16 = r8
            r17 = r9
            r18 = r30
            r19 = r15
            r20 = r11
            r21 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r9 = 1
            X.29C r4 = new X.29C
            r36 = 1
            r37 = 0
            r28 = r4
            r34 = r3
            r35 = r27
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.2Oi r10 = new X.2Oi
            r10.<init>(r4)
            r8.A00 = r10
            r4.A0A = r8
            X.4WY r8 = new X.4WY
            r8.<init>(r3, r5, r7)
            X.2oj r5 = r4.A0Y
            r5.A03 = r8
            r8.A01()
            r4.A0G()
            r4.A0F = r9
            goto L_0x00dd
        L_0x01d1:
            r13 = 0
            goto L_0x007e
        L_0x01d4:
            X.0ta r9 = X.C16730tY.A00(r2)
            X.1P8 r10 = r0.A0F
            X.1co r13 = r10.A00(r9)
            boolean r4 = r9.A0Z
            if (r4 == 0) goto L_0x025a
            if (r13 == 0) goto L_0x025a
            X.2Oh r4 = r13.A0i
            if (r4 == 0) goto L_0x025a
        L_0x01e8:
            X.0t9 r12 = r0.A0D
            X.0w2 r11 = r0.A0B
            if (r13 != 0) goto L_0x0257
            r4 = r3
        L_0x01ef:
            r18 = 2
            r19 = 3
            r20 = 5
            X.37e r9 = new X.37e
            r13 = r9
            r14 = r11
            r15 = r12
            r16 = r4
            r17 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            X.4WY r4 = new X.4WY
            r4.<init>(r3, r5, r7)
            X.29C r3 = r0.A00
            X.2oj r3 = r3.A0Y
            r3.A03 = r4
            r4.A01()
            X.29C r12 = r0.A00
            X.0tz r3 = r0.A07
            r16 = r3
            X.0pt r3 = r0.A01
            r17 = r3
            X.0tb r15 = r0.A02
            X.0pf r14 = r0.A09
            X.0sP r13 = r0.A04
            X.12c r11 = r0.A0G
            X.0wP r5 = r0.A03
            X.14t r3 = r0.A0A
            android.app.Activity r8 = X.C19980zJ.A00(r8)
            X.0pN r8 = (X.C14550pN) r8
            X.37c r4 = new X.37c
            r22 = r14
            r23 = r3
            r24 = r10
            r25 = r11
            r26 = r9
            r27 = r2
            r19 = r5
            r20 = r13
            r21 = r16
            r16 = r8
            r18 = r15
            r15 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r12.A0D = r9
            X.2Oi r3 = new X.2Oi
            r3.<init>(r12)
            r4.A00 = r3
            r12.A0A = r4
            r12.A0H()
            goto L_0x00e4
        L_0x0257:
            X.1cs r4 = r13.A0c
            goto L_0x01ef
        L_0x025a:
            X.0pd r4 = r0.A0C
            boolean r4 = X.AnonymousClass20C.A02(r4, r2)
            if (r4 != 0) goto L_0x01e8
            java.io.File r4 = r9.A0F
            if (r4 == 0) goto L_0x00e6
            X.0pt r4 = r0.A01
            X.1HE r10 = r0.A0E
            X.2JK r8 = new X.2JK
            r8.<init>(r4, r10, r2)
            X.29C r5 = r0.A00
            X.0t3 r4 = r0.A06
            r25 = r4
            X.0t9 r15 = r0.A0D
            int r4 = r2.A00
            long r13 = (long) r4
            X.1Vw r4 = r2.A11
            boolean r4 = r4.A02
            r17 = 1
            if (r4 == 0) goto L_0x0284
            r17 = 3
        L_0x0284:
            java.io.File r4 = r9.A0F
            long r21 = r4.lastModified()
            java.lang.Integer r16 = X.C13690nt.A0U()
            r18 = 3
            long r11 = r2.A01
            X.37d r4 = new X.37d
            r23 = r11
            r19 = r13
            r14 = r25
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r21, r23)
            r5.A0D = r4
            X.29C r5 = r0.A00
            java.io.File r4 = r9.A0F
            android.net.Uri r4 = android.net.Uri.fromFile(r4)
            r5.A07 = r4
            r5.A0A = r3
            X.29C r9 = r0.A00
            X.0tz r4 = r0.A07
            X.3zG r5 = new X.3zG
            r5.<init>(r4, r8, r10, r2)
            X.2Oi r4 = new X.2Oi
            r4.<init>(r9)
            r5.A00 = r4
            r9.A0A = r5
            X.29C r5 = r0.A00
            r8.A01 = r5
            X.2oj r4 = r5.A0Y
            r4.A03 = r3
            r5.A0H()
            goto L_0x00e4
        L_0x02cb:
            java.io.File r0 = r6.A0F
            if (r0 == 0) goto L_0x00e8
            X.0pt r9 = r1.A01
            X.0sq r13 = r1.A0K
            X.01V r10 = r1.A02
            X.013 r11 = r1.A03
            android.widget.FrameLayout r0 = r1.A09
            android.content.Context r8 = r0.getContext()
            java.io.File r0 = r6.A0F
            r16 = 1
            r15 = 0
            r17 = 0
            r14 = r0
            X.29D r3 = X.AnonymousClass29D.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00e6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C606934x.A0D():void");
    }

    public final void A0E() {
        StringBuilder A0r = AnonymousClass000.A0r("videoContainer=");
        boolean z2 = true;
        A0r.append(AnonymousClass000.A1P(this.A0A.getVisibility()));
        A0r.append("videoPlaybackContainerOverlay=");
        A0r.append(AnonymousClass000.A1P(this.A08.getVisibility()));
        A0r.append("photoView=");
        A0r.append(AnonymousClass000.A1P(this.A0F.getVisibility()));
        A0r.append("mainView=");
        if (this.A09.getVisibility() != 0) {
            z2 = false;
        }
        A0r.append(z2);
        A0r.append(" isPlaybackStarted=");
        A0r.append(this.A05.A00.A05);
        A0r.toString();
    }

    public final void A0F() {
        A0E();
        this.A0L.setVisibility(8);
        AnonymousClass29D r1 = this.A02;
        if (r1 != null) {
            r1.A01 = null;
            r1.A03 = null;
            r1.A02 = null;
            r1.A00 = null;
            if (r1.A0E()) {
                AnonymousClass29C r2 = this.A0M.A00;
                if (r2 != null) {
                    AnonymousClass2PR r0 = r2.A08;
                    if (r0 == null || r0.AF5() == 1) {
                        r2.A0M = false;
                    } else {
                        r2.A0M = true;
                        r2.A08.A0A(false);
                    }
                }
            } else {
                r1.A09();
            }
            this.A02.A01();
            this.A02 = null;
        }
    }

    public final void A0G() {
        if (!this.A05 && !this.A03 && this.A05.A00.A05) {
            this.A03 = true;
            this.A0I.A03(this);
        }
    }

    public final void A0H() {
        PhotoView photoView = this.A0F;
        if (photoView.getVisibility() != 0) {
            A0E();
            photoView.setVisibility(0);
        }
    }

    public void A0I(boolean z2) {
        if (!(this instanceof C606834w)) {
            this.A05 = z2;
            AnonymousClass29D r0 = this.A02;
            if (r0 != null) {
                r0.A0B(z2);
            }
            A0G();
        }
    }
}
