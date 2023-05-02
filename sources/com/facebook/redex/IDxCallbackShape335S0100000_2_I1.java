package com.facebook.redex;

import X.AnonymousClass2Qx;
import X.AnonymousClass3K4;
import X.AnonymousClass53K;
import X.C56542np;
import X.C87374Wn;
import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import com.obwhatsapp.videoplayback.VideoSurfaceView;
import com.whatsapp.util.Log;

public class IDxCallbackShape335S0100000_2_I1 implements SurfaceHolder.Callback {
    public Object A00;
    public final int A01;

    public IDxCallbackShape335S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r2.A07 != r9) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceChanged(android.view.SurfaceHolder r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x006f;
                case 1: goto L_0x003f;
                case 2: goto L_0x004f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = "videoview/surfaceChanged: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r8)
            java.lang.String r0 = "x"
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r9)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.videoplayback.VideoSurfaceView r2 = (com.obwhatsapp.videoplayback.VideoSurfaceView) r2
            r2.A05 = r8
            r2.A04 = r9
            int r0 = r2.A08
            if (r0 != r8) goto L_0x0028
            int r0 = r2.A07
            r1 = 1
            if (r0 == r9) goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            android.media.MediaPlayer r0 = r2.A0C
            if (r0 == 0) goto L_0x003e
            if (r1 == 0) goto L_0x003e
            int r0 = r2.A03
            if (r0 < 0) goto L_0x0036
            r2.seekTo(r0)
        L_0x0036:
            int r1 = r2.A06
            r0 = 3
            if (r1 != r0) goto L_0x003e
            r2.start()
        L_0x003e:
            return
        L_0x003f:
            java.lang.Object r0 = r5.A00
            X.4Wn r0 = (X.C87374Wn) r0
            X.2Qx r1 = r0.A01
            if (r1 == 0) goto L_0x003e
            android.view.Surface r0 = r6.getSurface()
            r1.A08(r0, r8, r9)
            return
        L_0x004f:
            java.lang.Object r4 = r5.A00
            X.2np r4 = (X.C56542np) r4
            android.hardware.Camera r0 = r4.A03
            if (r0 != 0) goto L_0x0064
            android.os.Handler r0 = r4.A04
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "qrview/surfacechanged: no camera"
        L_0x005d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4.A00()
            return
        L_0x0064:
            android.view.SurfaceHolder r3 = r4.A0J
            android.view.Surface r0 = r3.getSurface()
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = "qrview/surfacechanged: no surface"
            goto L_0x005d
        L_0x006f:
            java.lang.Object r0 = r5.A00
            X.53K r0 = (X.AnonymousClass53K) r0
            r0.hashCode()
            r0.A06(r8, r9)
            return
        L_0x007a:
            android.os.Handler r2 = r4.A04
            r1 = 3
            com.facebook.redex.RunnableRunnableShape15S0200000_I1_3 r0 = new com.facebook.redex.RunnableRunnableShape15S0200000_I1_3
            r0.<init>(r4, r1, r3)
            r2.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCallbackShape335S0100000_2_I1.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        switch (this.A01) {
            case 0:
                AnonymousClass53K r0 = (AnonymousClass53K) this.A00;
                r0.hashCode();
                r0.A04();
                return;
            case 1:
                C87374Wn r2 = (C87374Wn) this.A00;
                AnonymousClass2Qx r1 = r2.A01;
                if (r1 != null) {
                    r1.A06(surfaceHolder.getSurface());
                    r2.A01.setCornerRadius(r2.A00);
                    return;
                }
                return;
            case 2:
                Log.i("qrview/surfaceCreated");
                C56542np r22 = (C56542np) this.A00;
                AnonymousClass3K4.A0m(r22.A04, r22, 19);
                return;
            default:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
                videoSurfaceView.A0E = surfaceHolder;
                videoSurfaceView.A02();
                return;
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        switch (this.A01) {
            case 0:
                AnonymousClass53K r0 = (AnonymousClass53K) this.A00;
                r0.hashCode();
                r0.A03();
                return;
            case 1:
                AnonymousClass2Qx r1 = ((C87374Wn) this.A00).A01;
                if (r1 != null) {
                    r1.A07(surfaceHolder.getSurface());
                    return;
                }
                return;
            case 2:
                Log.i("qrview/surfacedestroyed");
                C56542np r2 = (C56542np) this.A00;
                AnonymousClass3K4.A0m(r2.A04, r2, 23);
                return;
            default:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
                videoSurfaceView.A03 = videoSurfaceView.getCurrentPosition();
                videoSurfaceView.A0E = null;
                MediaPlayer mediaPlayer = videoSurfaceView.A0C;
                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                    videoSurfaceView.A0C.release();
                    videoSurfaceView.A0C = null;
                    videoSurfaceView.A02 = 0;
                    videoSurfaceView.A06 = 0;
                    return;
                }
                return;
        }
    }
}
