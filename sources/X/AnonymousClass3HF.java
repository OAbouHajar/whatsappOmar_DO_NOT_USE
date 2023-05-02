package X;

import android.view.View;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.obwhatsapp.mediaview.PhotoView;

/* renamed from: X.3HF  reason: invalid class name */
public class AnonymousClass3HF implements AnonymousClass25V {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ PhotoView A01;

    public AnonymousClass3HF(MediaViewFragment mediaViewFragment, PhotoView photoView) {
        this.A00 = mediaViewFragment;
        this.A01 = photoView;
    }

    public int AG6() {
        return this.A00.A1Z.A03(this.A01.getContext());
    }

    public /* synthetic */ void ARJ() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r1 != 43) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r12 != null) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AfV(android.graphics.Bitmap r12, android.view.View r13, X.C16740tZ r14) {
        /*
            r11 = this;
            com.obwhatsapp.mediaview.MediaViewFragment r4 = r11.A00
            android.content.Context r0 = r4.A0u()
            if (r0 == 0) goto L_0x0071
            X.0tY r14 = (X.C16730tY) r14
            r8 = 0
            r7 = 43
            r6 = 42
            r9 = 13
            r5 = 9
            r2 = 3
            r3 = 1
            if (r12 == 0) goto L_0x008d
            com.obwhatsapp.mediaview.PhotoView r10 = r11.A01
            android.content.res.Resources r1 = r4.A03()
            X.3L1 r0 = new X.3L1
            r0.<init>(r1, r12, r14)
        L_0x0022:
            r10.A07(r0)
        L_0x0025:
            byte r1 = r14.A10
            if (r1 == r3) goto L_0x0083
            if (r1 == r2) goto L_0x0077
            if (r1 == r5) goto L_0x0072
            if (r1 == r9) goto L_0x0077
            r0 = 28
            if (r1 == r0) goto L_0x0077
            r0 = 29
            if (r1 == r0) goto L_0x0077
            if (r1 == r6) goto L_0x0083
            if (r1 == r7) goto L_0x0077
        L_0x003b:
            X.0ta r1 = X.C16730tY.A00(r14)
            int r0 = r1.A08
            if (r0 == 0) goto L_0x004a
            int r0 = r1.A06
            if (r0 == 0) goto L_0x004a
            r2 = 1
            if (r12 != 0) goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            boolean r0 = X.C455529g.A00
            if (r0 == 0) goto L_0x0068
            X.0tY r0 = r4.A1M
            if (r0 == 0) goto L_0x0068
            X.1Vw r1 = r14.A11
            X.1Vw r0 = r0.A11
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            if (r2 != 0) goto L_0x0063
            com.facebook.redex.RunnableRunnableShape0S0310000_I0 r0 = r4.A0C
            if (r0 != 0) goto L_0x0068
        L_0x0063:
            r4.A1f = r3
            com.obwhatsapp.mediaview.MediaViewFragment.A05(r4)
        L_0x0068:
            com.facebook.redex.RunnableRunnableShape0S0310000_I0 r1 = r4.A0C
            if (r1 == 0) goto L_0x0071
            com.obwhatsapp.mediaview.PhotoView r0 = r11.A01
            r1.A00(r0, r14)
        L_0x0071:
            return
        L_0x0072:
            com.obwhatsapp.mediaview.PhotoView r0 = r11.A01
            r0.A0M = r8
            goto L_0x003b
        L_0x0077:
            com.obwhatsapp.mediaview.PhotoView r2 = r11.A01
            r1 = 39
            com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1
            r0.<init>(r11, r1, r14)
            r2.A0M = r0
            goto L_0x003b
        L_0x0083:
            com.obwhatsapp.mediaview.PhotoView r1 = r11.A01
            X.3uy r0 = new X.3uy
            r0.<init>(r11, r14)
            r1.A0M = r0
            goto L_0x003b
        L_0x008d:
            byte r0 = r14.A10
            if (r0 == r3) goto L_0x00ac
            if (r0 == r2) goto L_0x00b6
            if (r0 == r5) goto L_0x00a2
            if (r0 == r9) goto L_0x00b6
            if (r0 == r6) goto L_0x009c
            if (r0 == r7) goto L_0x009c
            goto L_0x0025
        L_0x009c:
            com.obwhatsapp.mediaview.PhotoView r0 = r11.A01
            r0.A07(r8)
            goto L_0x0025
        L_0x00a2:
            com.obwhatsapp.mediaview.PhotoView r10 = r11.A01
            android.content.Context r1 = r4.A02()
            r0 = 2131232007(0x7f080507, float:1.8080111E38)
            goto L_0x00bf
        L_0x00ac:
            com.obwhatsapp.mediaview.PhotoView r10 = r11.A01
            android.content.Context r1 = r4.A02()
            r0 = 2131230878(0x7f08009e, float:1.8077821E38)
            goto L_0x00bf
        L_0x00b6:
            com.obwhatsapp.mediaview.PhotoView r10 = r11.A01
            android.content.Context r1 = r4.A02()
            r0 = 2131230880(0x7f0800a0, float:1.8077825E38)
        L_0x00bf:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r1, r0)
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3HF.AfV(android.graphics.Bitmap, android.view.View, X.0tZ):void");
    }

    public void Afm(View view) {
        PhotoView photoView = this.A01;
        photoView.A0J = null;
        photoView.A04 = 0.0f;
    }
}
