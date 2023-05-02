package com.obwhatsapp;

import X.C30551cZ;
import android.view.View;
import android.view.animation.Animation;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;

public class IDxLAdapterShape11S0200000_2_I0 extends C30551cZ {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxLAdapterShape11S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c6, code lost:
        r1.setEnabled(true);
        r1.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        r0.setVisibility(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.view.animation.Animation r5) {
        /*
            r4 = this;
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x0039;
                case 1: goto L_0x001e;
                case 2: goto L_0x005a;
                case 3: goto L_0x0024;
                case 4: goto L_0x0079;
                case 5: goto L_0x0097;
                case 6: goto L_0x00ad;
                case 7: goto L_0x00b8;
                case 8: goto L_0x00c2;
                case 9: goto L_0x00ce;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = "voip/VoipActivityV2/shrinkPreviewToPip/onAnimationEnd"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r4.A00
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            r0 = 0
            r1.A22 = r0
            android.widget.ImageView r0 = r1.A0V
            r0.clearAnimation()
            android.widget.ImageView r0 = r1.A0V
            r1 = 8
        L_0x001a:
            r0.setVisibility(r1)
        L_0x001d:
            return
        L_0x001e:
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            r1 = 4
            goto L_0x001a
        L_0x0024:
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.identity.IdentityVerificationActivity r0 = (com.obwhatsapp.identity.IdentityVerificationActivity) r0
            com.obwhatsapp.qrcode.WaQrScannerView r1 = r0.A0R
            r0 = 8
            r1.setVisibility(r0)
            java.lang.Object r0 = r4.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x001d
            r0.run()
            return
        L_0x0039:
            java.lang.Object r3 = r4.A00
            X.2Va r3 = (X.C49682Va) r3
            java.lang.Object r2 = r4.A01
            X.4Dx r2 = (X.C82724Dx) r2
            android.view.View r1 = r3.A00
            X.AnonymousClass00B.A04(r1)
            r0 = 8
            r1.setVisibility(r0)
            android.view.ViewGroup r1 = r3.A04
            android.view.View r0 = r3.A00
            r1.removeView(r0)
            r1 = 0
            r3.A00 = r1
            X.2VZ r0 = r2.A00
            r0.A01 = r1
            return
        L_0x005a:
            java.lang.Object r3 = r4.A00
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            r0 = -2
            r1.width = r0
            r3.requestLayout()
            android.view.ViewTreeObserver r2 = r3.getViewTreeObserver()
            r1 = 4
            com.facebook.redex.IDxLListenerShape145S0100000_2_I1 r0 = new com.facebook.redex.IDxLListenerShape145S0100000_2_I1
            r0.<init>(r4, r1)
            r2.addOnGlobalLayoutListener(r0)
            r3.clearAnimation()
            return
        L_0x0079:
            java.lang.Object r0 = r4.A00
            X.2Op r0 = (X.C48702Op) r0
            android.widget.ImageView r3 = r0.A06
            java.lang.Object r0 = r4.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r3.setImageBitmap(r0)
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 100
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        L_0x0097:
            java.lang.Object r1 = r4.A00
            X.4RF r1 = (X.AnonymousClass4RF) r1
            android.view.View r0 = r1.A01
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r1.A00(r0)
            java.lang.Object r0 = r4.A01
            X.1cZ r0 = (X.C30551cZ) r0
            r0.onAnimationEnd(r5)
            return
        L_0x00ad:
            java.lang.Object r0 = r4.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            super.onAnimationEnd(r5)
            return
        L_0x00b8:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00c6
        L_0x00c2:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
        L_0x00c6:
            r0 = 1
            r1.setEnabled(r0)
            r1.clearAnimation()
            return
        L_0x00ce:
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            r0.clearAnimation()
            java.lang.Object r1 = r4.A00
            X.1ZK r1 = (X.AnonymousClass1ZK) r1
            android.view.View r2 = r1.A0c
            r0 = 1
            r2.setFocusable(r0)
            r2.setFocusableInTouchMode(r0)
            r2.requestFocus()
            X.1B2 r1 = r1.A1I
            java.lang.String r0 = "voicenote/voicenotepreviewcancelled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Iterator r1 = X.C16590tJ.A00(r1)
        L_0x00f0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r1.next()
            X.2h7 r0 = (X.C54272h7) r0
            r0.A02()
            goto L_0x00f0
        L_0x0100:
            r2.requestFocus()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0.onAnimationEnd(android.view.animation.Animation):void");
    }

    public void onAnimationStart(Animation animation) {
        View view;
        boolean z2;
        switch (this.A02) {
            case 5:
                ((C30551cZ) this.A01).onAnimationStart(animation);
                return;
            case 7:
                view = (View) this.A01;
                z2 = false;
                break;
            case 8:
                view = (View) this.A01;
                z2 = false;
                view.setVisibility(0);
                break;
            case 9:
                ((View) this.A01).setVisibility(0);
                return;
            case 10:
                Log.i("voip/VoipActivityV2/shrinkPreviewToPip/onAnimationStart");
                ((VideoCallParticipantView) this.A01).A03 = 1;
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                CallInfo A3B = voipActivityV2.A3B();
                if (A3B != null) {
                    voipActivityV2.A22 = false;
                    voipActivityV2.A3t(A3B);
                    voipActivityV2.A22 = true;
                    return;
                }
                return;
            default:
                super.onAnimationStart(animation);
                return;
        }
        view.setEnabled(z2);
    }
}
