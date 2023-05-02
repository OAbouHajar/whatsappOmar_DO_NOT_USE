package com.obwhatsapp.mediacomposer;

import X.AnonymousClass00T;
import X.AnonymousClass1PD;
import X.AnonymousClass1QT;
import X.AnonymousClass29D;
import X.AnonymousClass2SR;
import X.C19610yi;
import X.C42061xA;
import X.C43281zk;
import X.C49112Rc;
import X.C93934k0;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.obwhatsapp.R;
import java.io.File;

public class VideoComposerFragment extends Hilt_VideoComposerFragment {
    public long A00;
    public long A01 = -1;
    public long A02;
    public long A03;
    public View.OnClickListener A04 = new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 42);
    public View.OnClickListener A05 = new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 41);
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public ImageView A0A;
    public ImageView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public C19610yi A0F;
    public AnonymousClass1QT A0G;
    public C43281zk A0H;
    public VideoTimelineView A0I;
    public C49112Rc A0J;
    public AnonymousClass1PD A0K;
    public C42061xA A0L;
    public AnonymousClass29D A0M;
    public File A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final View.OnAttachStateChangeListener A0T = new C93934k0(this);
    public final Runnable A0U = new RunnableRunnableShape10S0100000_I0_9((Object) this, 42);

    public void A0w() {
        super.A0w();
        A1I();
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout05cc, viewGroup, false);
    }

    public void A13() {
        super.A13();
        VideoTimelineView videoTimelineView = this.A0I;
        if (videoTimelineView != null) {
            videoTimelineView.A0I = null;
            this.A0I = null;
        }
        AnonymousClass29D r0 = this.A0M;
        if (r0 != null) {
            r0.A09();
            this.A0M = null;
        }
    }

    public void A14() {
        super.A14();
        int A032 = this.A0M.A03();
        AnonymousClass29D r1 = this.A0M;
        int i2 = A032 + 1;
        if (A032 > 0) {
            i2 = A032 - 1;
        }
        r1.A0A(i2);
        this.A0M.A0A(A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0285, code lost:
        if (r14 != false) goto L_0x0221;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A18(android.os.Bundle r27, android.view.View r28) {
        /*
            r26 = this;
            r5 = r26
            r15 = r27
            r6 = r28
            super.A18(r15, r6)
            X.29D r1 = r5.A0M
            r8 = 1
            r2 = 0
            r0 = 0
            if (r1 != 0) goto L_0x0011
            r0 = 1
        L_0x0011:
            X.AnonymousClass00B.A0G(r0)
            X.00l r10 = r5.A0C()
            X.29K r10 = (X.AnonymousClass29K) r10
            android.net.Uri r0 = r5.A00
            r9 = r10
            com.obwhatsapp.mediacomposer.MediaComposerActivity r9 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r9
            X.29Q r4 = r9.A1S
            X.20I r0 = r4.A00(r0)
            java.io.File r0 = r0.A05()
            r5.A0N = r0
            android.net.Uri r0 = r5.A00
            X.20I r1 = r4.A00(r0)
            monitor-enter(r1)
            X.1xA r0 = r1.A05     // Catch:{ all -> 0x03f6 }
            monitor-exit(r1)
            r5.A0L = r0
            if (r0 != 0) goto L_0x0049
            java.io.File r1 = r5.A0N     // Catch:{ 1xB -> 0x0043 }
            X.1xA r0 = new X.1xA     // Catch:{ 1xB -> 0x0043 }
            r0.<init>(r1)     // Catch:{ 1xB -> 0x0043 }
            r5.A0L = r0     // Catch:{ 1xB -> 0x0043 }
            goto L_0x0049
        L_0x0043:
            r1 = move-exception
            java.lang.String r0 = "VideoComposerFragment/bad video"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0049:
            X.2Rc r0 = r9.A0s
            r5.A0J = r0
            X.0pd r12 = r5.A09
            X.0pt r11 = r5.A03
            X.0sq r7 = r5.A0N
            X.01V r3 = r5.A05
            X.013 r1 = r5.A07
            android.content.Context r16 = r5.A02()
            java.io.File r0 = r5.A0N
            android.net.Uri r13 = r5.A00
            X.20I r14 = r4.A00(r13)
            monitor-enter(r14)
            boolean r13 = r14.A0D     // Catch:{ all -> 0x03f3 }
            monitor-exit(r14)
            r24 = 0
            if (r13 == 0) goto L_0x006d
            r24 = 1
        L_0x006d:
            boolean r13 = X.C41971wz.A01()
            r25 = 0
            if (r13 == 0) goto L_0x0077
            r25 = 1
        L_0x0077:
            r13 = 0
            r23 = 0
            r22 = r0
            r18 = r3
            r19 = r1
            r20 = r12
            r21 = r7
            r17 = r11
            X.29D r0 = X.AnonymousClass29D.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r5.A0M = r0
            android.view.View r1 = r0.A06()
            android.view.View$OnAttachStateChangeListener r0 = r5.A0T
            r1.addOnAttachStateChangeListener(r0)
            android.net.Uri r1 = r5.A00
            android.net.Uri r0 = r10.A9w()
            boolean r0 = r1.equals(r0)
            r7 = 0
            if (r0 == 0) goto L_0x00b2
            X.29D r0 = r5.A0M
            android.view.View r0 = r0.A06()
            r0.setAlpha(r7)
            X.00l r0 = r5.A0C()
            r0.A0c()
        L_0x00b2:
            android.net.Uri r0 = r5.A00
            X.20I r0 = r4.A00(r0)
            boolean r0 = r0.A0F()
            r5.A0Q = r0
            X.1QT r11 = r5.A0G
            X.1XK r0 = X.AnonymousClass1XK.A0X
            java.io.File r3 = r5.A0N
            boolean r0 = X.C31831f6.A03(r0)     // Catch:{ IOException -> 0x0122 }
            if (r0 == 0) goto L_0x0120
            long r18 = r3.length()     // Catch:{ IOException -> 0x0122 }
            X.0s5 r12 = r11.A02     // Catch:{ IOException -> 0x0122 }
            X.0tC r0 = X.C15910s6.A1f     // Catch:{ IOException -> 0x0122 }
            int r0 = r12.A02(r0)     // Catch:{ IOException -> 0x0122 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0122 }
            r16 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r16
            int r14 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r14 > 0) goto L_0x012b
            X.0pd r14 = r11.A04     // Catch:{ IOException -> 0x0122 }
            r1 = 422(0x1a6, float:5.91E-43)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ IOException -> 0x0122 }
            boolean r0 = r14.A0E(r0, r1)     // Catch:{ IOException -> 0x0122 }
            int r0 = X.C43291zl.A01(r0)     // Catch:{ IOException -> 0x0122 }
            if (r0 != r8) goto L_0x0117
            X.1xA r1 = new X.1xA     // Catch:{ 1xB -> 0x010f }
            r1.<init>(r3)     // Catch:{ 1xB -> 0x010f }
            long r18 = r3.length()     // Catch:{ IOException -> 0x0122 }
            r16 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0117
            int r0 = r1.A00()     // Catch:{ IOException -> 0x0122 }
            int r1 = r0 / 1000
            X.0tC r0 = X.C15910s6.A25     // Catch:{ IOException -> 0x0122 }
            int r0 = r12.A02(r0)     // Catch:{ IOException -> 0x0122 }
            if (r1 <= r0) goto L_0x0117
            goto L_0x012b
        L_0x010f:
            r1 = move-exception
            java.lang.String r0 = "videopreview/bad video"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0122 }
            goto L_0x012b
        L_0x0117:
            X.1QS r0 = r11.A06     // Catch:{ IOException -> 0x0122 }
            boolean r0 = r0.A0E(r3)     // Catch:{ IOException -> 0x0122 }
            r0 = r0 ^ 1
            goto L_0x012c
        L_0x0120:
            r0 = 0
            goto L_0x012c
        L_0x0122:
            r1 = move-exception
            java.lang.String r0 = "transcodeutils/needtranscodemedia exception"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            goto L_0x012c
        L_0x012b:
            r0 = 1
        L_0x012c:
            r5.A0S = r0
            r0 = 0
            r5.A02 = r0
            X.1xA r0 = r5.A0L
            long r0 = r0.A04
            r5.A03 = r0
            r5.A00 = r0
            android.net.Uri r3 = r5.A00
            X.20I r3 = r4.A00(r3)
            r3.A02 = r0
            r5.A0R = r2
            X.29P r0 = r9.A0l
            X.027 r0 = r0.A01
            java.lang.Object r1 = r0.A01()
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0288
            int r0 = r1.size()
            if (r0 != r8) goto L_0x0166
            java.lang.Object r0 = r1.get(r2)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r0 = X.C16030sJ.A0Q(r0)
            r5.A0R = r0
        L_0x0166:
            X.1kq r0 = X.C34771kq.A00
            boolean r14 = r1.contains(r0)
        L_0x016c:
            r0 = 2131366914(0x7f0a1402, float:1.8353735E38)
            android.view.View r0 = r6.findViewById(r0)
            r5.A09 = r0
            r0 = 2131365350(0x7f0a0de6, float:1.8350563E38)
            android.view.View r3 = r6.findViewById(r0)
            r5.A07 = r3
            r1 = 40
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r0 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r0.<init>((java.lang.Object) r5, (int) r1)
            r3.setOnClickListener(r0)
            r0 = 2131366263(0x7f0a1177, float:1.8352415E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A0D = r0
            r0 = 2131363310(0x7f0a05ee, float:1.8346425E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A0C = r0
            r0 = 2131366770(0x7f0a1372, float:1.8353443E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A0E = r0
            r0 = 2131366771(0x7f0a1373, float:1.8353445E38)
            android.view.View r0 = r6.findViewById(r0)
            r5.A08 = r0
            r0 = 2131366918(0x7f0a1406, float:1.8353743E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.A0B = r0
            r0 = 2131364783(0x7f0a0baf, float:1.8349413E38)
            android.view.View r0 = r6.findViewById(r0)
            r5.A06 = r0
            r0 = 2131364782(0x7f0a0bae, float:1.834941E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.A0A = r0
            X.0pd r3 = r5.A09
            r1 = 325(0x145, float:4.55E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 == 0) goto L_0x01ec
            android.view.View r0 = r5.A06
            r0.setVisibility(r2)
            r5.A1M()
            android.view.View r1 = r5.A06
            android.view.View$OnClickListener r0 = r5.A04
            r1.setOnClickListener(r0)
        L_0x01ec:
            long r18 = r5.A1K()
            X.1zk r0 = r5.A0H
            int r0 = r0.A00
            long r2 = (long) r0
            r16 = 1048576(0x100000, double:5.180654E-318)
            long r11 = r2 * r16
            int r0 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0209
            X.1xA r0 = r5.A0L
            long r0 = r0.A04
            long r0 = r0 * r2
            long r0 = r0 * r16
            long r0 = r0 / r18
            r5.A00 = r0
        L_0x0209:
            X.0s5 r1 = r5.A04
            X.0tC r0 = X.C15910s6.A1y
            int r0 = r1.A02(r0)
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            long r0 = r5.A00
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x0229
            boolean r0 = r5.A0R
            if (r0 == 0) goto L_0x0285
            r5.A00 = r2
        L_0x0221:
            X.1PD r0 = r5.A0K
            r5.A0u()
            r0.A00()
        L_0x0229:
            long r0 = r5.A00
            r5.A03 = r0
            android.net.Uri r0 = r5.A00
            X.20I r0 = r4.A00(r0)
            android.graphics.Point r2 = r0.A02()
            if (r2 == 0) goto L_0x0273
            int r0 = r2.x
            long r0 = (long) r0
            r5.A02 = r0
            int r0 = r2.y
            long r0 = (long) r0
            r5.A03 = r0
        L_0x0243:
            r5.A1K()
            r0 = 2131366631(0x7f0a12e7, float:1.835316E38)
            android.view.View r11 = r6.findViewById(r0)
            com.obwhatsapp.mediacomposer.VideoTimelineView r11 = (com.obwhatsapp.mediacomposer.VideoTimelineView) r11
            r5.A0I = r11
            java.io.File r12 = r5.A0N
            X.1xA r0 = r5.A0L
            long r0 = r0.A04
            r11.A0O = r12
            r3 = 0
            r11.A0P = r3
            X.0tT r2 = r11.A0L
            if (r2 == 0) goto L_0x0265
            r2.A06(r8)
            r11.A0L = r3
        L_0x0265:
            r2 = 0
            if (r12 == 0) goto L_0x02a7
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x02a4
            X.1wq r8 = new X.1wq
            r8.<init>()
            goto L_0x028b
        L_0x0273:
            android.net.Uri r11 = r5.A00
            long r2 = r5.A02
            long r0 = r5.A03
            r16 = r10
            r17 = r11
            r18 = r2
            r20 = r0
            r16.Aev(r17, r18, r20)
            goto L_0x0243
        L_0x0285:
            if (r14 == 0) goto L_0x0229
            goto L_0x0221
        L_0x0288:
            r14 = 0
            goto L_0x016c
        L_0x028b:
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ all -> 0x029f }
            r8.setDataSource(r0)     // Catch:{ all -> 0x029f }
            r0 = 9
            java.lang.String r0 = r8.extractMetadata(r0)     // Catch:{ all -> 0x029f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x029f }
            r11.A0D = r0     // Catch:{ all -> 0x029f }
            goto L_0x02aa
        L_0x029f:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x02a3 }
        L_0x02a3:
            throw r0
        L_0x02a4:
            r11.A0D = r0
            goto L_0x02ad
        L_0x02a7:
            r11.A0D = r2
            goto L_0x02ad
        L_0x02aa:
            r8.close()
        L_0x02ad:
            r11.A0F = r2
            long r0 = r11.A0D
            r11.A0G = r0
            r11.invalidate()
            com.obwhatsapp.mediacomposer.VideoTimelineView r8 = r5.A0I
            long r2 = r5.A02
            long r0 = r5.A03
            r8.A0F = r2
            r8.A0G = r0
            r8.invalidate()
            com.obwhatsapp.mediacomposer.VideoTimelineView r8 = r5.A0I
            boolean r0 = r5.A0Q
            long r2 = r5.A00
            if (r0 == 0) goto L_0x02d1
            r0 = 7000(0x1b58, double:3.4585E-320)
            long r2 = java.lang.Math.min(r2, r0)
        L_0x02d1:
            r8.A0E = r2
            X.3G7 r0 = new X.3G7
            r0.<init>(r5)
            r8.A0I = r0
            X.4zQ r0 = new X.4zQ
            r0.<init>(r5)
            r8.A0J = r0
            X.29D r1 = r5.A0M
            com.facebook.redex.IDxCListenerShape386S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape386S0100000_2_I0
            r0.<init>(r5, r13)
            r1.A01 = r0
            android.view.View r3 = r1.A06()
            boolean r0 = r3 instanceof com.obwhatsapp.videoplayback.VideoSurfaceView
            if (r0 == 0) goto L_0x031e
            com.obwhatsapp.videoplayback.VideoSurfaceView r3 = (com.obwhatsapp.videoplayback.VideoSurfaceView) r3
            X.1xA r1 = r5.A0L
            boolean r0 = r1.A02()
            X.1xA r1 = r5.A0L
            if (r0 == 0) goto L_0x03ef
            int r2 = r1.A01
        L_0x0300:
            boolean r1 = r1.A02()
            X.1xA r0 = r5.A0L
            if (r1 == 0) goto L_0x03eb
            int r0 = r0.A03
        L_0x030a:
            r3.A03(r2, r0)
            X.4yN r2 = new X.4yN
            r2.<init>(r5)
            X.2OM r1 = r9.A0e
            if (r1 == 0) goto L_0x031e
            X.4yW r0 = new X.4yW
            r0.<init>(r5, r3)
            r1.A02(r2, r0)
        L_0x031e:
            if (r27 != 0) goto L_0x035c
            android.net.Uri r0 = r5.A00
            X.20I r0 = r4.A00(r0)
            java.lang.String r8 = r0.A08()
            android.net.Uri r0 = r5.A00
            java.lang.String r4 = r10.ABt(r0)
            if (r8 != 0) goto L_0x03cd
            X.1xA r1 = r5.A0L
            boolean r0 = r1.A02()
            X.1xA r1 = r5.A0L
            if (r0 == 0) goto L_0x03c9
            int r0 = r1.A01
        L_0x033e:
            float r3 = (float) r0
            boolean r1 = r1.A02()
            X.1xA r0 = r5.A0L
            if (r1 == 0) goto L_0x03c6
            int r0 = r0.A03
        L_0x0349:
            float r0 = (float) r0
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r7, r7, r3, r0)
            X.2Ra r1 = r5.A0D
            X.39P r0 = r1.A0I
            r0.A06 = r2
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r1.A0H
            r0.A00 = r7
            r1.A05(r2)
        L_0x035c:
            r0 = 2131366924(0x7f0a140c, float:1.8353755E38)
            android.view.View r7 = r6.findViewById(r0)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r0 = 2
            X.C004601z.A0d(r7, r0)
            X.29D r0 = r5.A0M
            android.view.View r3 = r0.A06()
            r2 = 17
            r1 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1, r2)
            r7.addView(r3, r0)
            X.29D r3 = r5.A0M
            long r1 = r5.A02
            int r0 = (int) r1
            int r0 = r0 + 1
            r3.A0A(r0)
            r0 = 2131362790(0x7f0a03e6, float:1.834537E38)
            android.view.View r4 = r6.findViewById(r0)
            int r3 = r4.getPaddingLeft()
            int r0 = r4.getPaddingTop()
            int r2 = r0 << 1
            int r1 = r4.getPaddingRight()
            int r0 = r4.getPaddingBottom()
            r4.setPadding(r3, r2, r1, r0)
            r1 = 43
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r0 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r0.<init>((java.lang.Object) r5, (int) r1)
            r7.setOnClickListener(r0)
            android.net.Uri r1 = r5.A00
            android.net.Uri r0 = r10.A9w()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03c5
            android.view.View r1 = r5.A06()
            r0 = 2131362933(0x7f0a0475, float:1.834566E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 4
            r1.setVisibility(r0)
        L_0x03c5:
            return
        L_0x03c6:
            int r0 = r0.A01
            goto L_0x0349
        L_0x03c9:
            int r0 = r1.A03
            goto L_0x033e
        L_0x03cd:
            android.content.Context r3 = r5.A02()
            X.0um r2 = r5.A08
            X.013 r1 = r5.A07
            X.1MF r0 = r5.A0I
            X.3Bj r2 = X.C62033Bj.A03(r3, r1, r2, r0, r8)
            if (r2 == 0) goto L_0x035c
            X.2Ra r1 = r5.A0D
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r1.A0H
            r0.setDoodle(r2)
            X.29k r0 = r1.A0O
            r0.A05(r4)
            goto L_0x035c
        L_0x03eb:
            int r0 = r0.A01
            goto L_0x030a
        L_0x03ef:
            int r2 = r1.A03
            goto L_0x0300
        L_0x03f3:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x03f6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.VideoComposerFragment.A18(android.os.Bundle, android.view.View):void");
    }

    public void A1F(Rect rect) {
        super.A1F(rect);
        if (this.A0A != null) {
            this.A09.setPadding(rect.left, rect.top + A03().getDimensionPixelSize(R.dimen.dimen005e), rect.right, rect.bottom + A03().getDimensionPixelSize(R.dimen.dimen005e));
            this.A08.setPadding(rect.left, rect.top, rect.right, 0);
        }
    }

    public void A1G(boolean z2) {
        super.A1G(z2);
        this.A0P = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        if (X.AnonymousClass1QT.A05(r9, r11, r0) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d4, code lost:
        if (r4 != false) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A1K() {
        /*
            r19 = this;
            r8 = r19
            X.1QT r2 = r8.A0G
            boolean r1 = r8.A0R
            boolean r0 = r8.A0Q
            X.1zk r9 = r2.A06(r1, r0)
            r8.A0H = r9
            long r6 = r8.A03
            long r0 = r8.A02
            long r2 = r6 - r0
            r17 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 >= 0) goto L_0x001c
            r2 = 1000(0x3e8, double:4.94E-321)
        L_0x001c:
            X.1QT r13 = r8.A0G
            X.1xA r11 = r8.A0L
            java.io.File r12 = r8.A0N
            boolean r5 = r8.A0Q
            boolean r4 = r8.A0O
            boolean r10 = r8.A0S
            X.0pd r15 = r13.A04
            r14 = 422(0x1a6, float:5.91E-43)
            X.0tM r13 = X.C16620tM.A02
            boolean r16 = r15.A0E(r13, r14)
            if (r10 != 0) goto L_0x006c
            r14 = 0
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x006c
            long r0 = r11.A04
            int r13 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r13 != 0) goto L_0x006c
            long r13 = r12.length()
            int r0 = r9.A00
            long r0 = (long) r0
            r6 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r6
            int r6 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x006c
            long r4 = r12.length()
        L_0x0053:
            android.widget.TextView r1 = r8.A0C
            X.013 r0 = r8.A07
            long r2 = r2 / r17
            java.lang.String r0 = X.C28961Zl.A04(r0, r2)
            r1.setText(r0)
            android.widget.TextView r1 = r8.A0D
            X.013 r0 = r8.A07
            java.lang.String r0 = X.AnonymousClass2GQ.A03(r0, r4)
            r1.setText(r0)
            return r4
        L_0x006c:
            int r1 = X.C43291zl.A01(r16)
            r0 = 1
            if (r1 != r0) goto L_0x0080
            if (r10 != 0) goto L_0x0089
            r0 = 3
            if (r5 == 0) goto L_0x007a
            r0 = 13
        L_0x007a:
            boolean r0 = X.AnonymousClass1QT.A05(r9, r11, r0)
            if (r0 != 0) goto L_0x0089
        L_0x0080:
            long r4 = r12.length()
            long r4 = r4 * r2
            long r0 = r11.A04
            long r4 = r4 / r0
            goto L_0x0053
        L_0x0089:
            int r7 = r11.A03
            int r6 = r11.A01
            int r1 = r9.A02
            int r0 = java.lang.Math.max(r7, r6)
            int r0 = java.lang.Math.min(r1, r0)
            android.util.Pair r1 = X.AnonymousClass1QT.A03(r7, r6, r0)
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r10 = r0.intValue()
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r0.intValue()
            if (r5 == 0) goto L_0x00bc
            int r10 = r10 * r11
            int r0 = r10 << 1
            float r1 = (float) r0
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            float r1 = r1 + r0
            long r4 = r2 / r17
            float r0 = (float) r4
            float r1 = r1 * r0
            r0 = 1090519040(0x41000000, float:8.0)
            float r1 = r1 / r0
            long r4 = (long) r1
            goto L_0x0053
        L_0x00bc:
            int r0 = r9.A01
            float r5 = (float) r0
            int r0 = r10 * r11
            float r1 = (float) r0
            int r0 = r9.A00
            r12 = 9
            r9 = r0
            r13 = r2
            float r0 = X.AnonymousClass1QT.A00(r9, r10, r11, r12, r13)
            float r1 = r1 * r0
            float r1 = java.lang.Math.min(r5, r1)
            r0 = 1203470336(0x47bb8000, float:96000.0)
            if (r4 == 0) goto L_0x00b2
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.VideoComposerFragment.A1K():long");
    }

    public final void A1L() {
        if (this.A0M.A0C()) {
            A1I();
            return;
        }
        this.A0M.A06().setBackground((Drawable) null);
        if (((long) this.A0M.A03()) > this.A03 - 2000) {
            this.A0M.A0A((int) this.A02);
        }
        A1D();
    }

    public final void A1M() {
        ImageView imageView;
        int i2;
        View view;
        View.OnClickListener onClickListener;
        Context A022 = A02();
        if (this.A0Q) {
            this.A0A.setImageResource(R.drawable.ic_unmute);
            AnonymousClass2SR.A08(this.A0A, AnonymousClass00T.A00(A022, R.color.color0922));
            view = this.A06;
            onClickListener = null;
        } else {
            boolean z2 = this.A0O;
            ImageView imageView2 = this.A0A;
            if (z2) {
                imageView2.setImageResource(R.drawable.ic_unmute);
                imageView = this.A0A;
                i2 = R.string.str1899;
            } else {
                imageView2.setImageResource(R.drawable.ic_mute);
                imageView = this.A0A;
                i2 = R.string.str0da9;
            }
            imageView.setContentDescription(A0J(i2));
            AnonymousClass2SR.A08(this.A0A, AnonymousClass00T.A00(A022, R.color.color0910));
            view = this.A06;
            onClickListener = this.A04;
        }
        view.setOnClickListener(onClickListener);
    }
}
