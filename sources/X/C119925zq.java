package X;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.bloks.BloksCameraOverlay;
import com.whatsapp.util.Log;

/* renamed from: X.5zq  reason: invalid class name and case insensitive filesystem */
public class C119925zq implements AnonymousClass1JX {
    public boolean A00;
    public final C14870pt A01;
    public final C117875th A02;
    public final C16320sq A03;

    public C119925zq(C14870pt r1, C117875th r2, C16320sq r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.view.SurfaceView r4, X.AnonymousClass4HD r5, X.C119915zp r6, X.C117875th r7) {
        /*
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0035
            android.media.MediaRecorder r0 = r6.A04
            X.AnonymousClass00B.A06(r0)
            r0.stop()
            A02(r6)
            android.hardware.Camera r0 = r6.A03
            X.AnonymousClass00B.A06(r0)
            r0.lock()
            r0 = 0
        L_0x0018:
            r6.A0B = r0
        L_0x001a:
            X.1dg r1 = r5.A01
            r0 = 48
            java.lang.String r0 = r1.A0J(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            X.66J r2 = new X.66J
            r2.<init>(r5, r6, r7)
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            return
        L_0x0035:
            android.media.MediaRecorder r0 = new android.media.MediaRecorder
            r0.<init>()
            r6.A04 = r0
            android.hardware.Camera r0 = r6.A03
            X.AnonymousClass00B.A06(r0)
            r0.unlock()
            android.media.MediaRecorder r1 = r6.A04
            android.hardware.Camera r0 = r6.A03
            r1.setCamera(r0)
            android.media.MediaRecorder r0 = r6.A04
            r2 = 1
            r0.setVideoSource(r2)
            int r0 = r6.A00
            r1 = 4
            boolean r0 = android.media.CamcorderProfile.hasProfile(r0, r1)
            if (r0 != 0) goto L_0x00ea
            int r0 = r6.A00
            r1 = 5
            boolean r0 = android.media.CamcorderProfile.hasProfile(r0, r1)
            if (r0 != 0) goto L_0x00ea
            int r0 = r6.A00
            android.media.CamcorderProfile r3 = android.media.CamcorderProfile.get(r0, r2)
        L_0x0069:
            android.media.MediaRecorder r1 = r6.A04
            int r0 = r3.fileFormat
            r1.setOutputFormat(r0)
            android.media.MediaRecorder r1 = r6.A04
            int r0 = r3.videoFrameRate
            r1.setVideoFrameRate(r0)
            android.media.MediaRecorder r2 = r6.A04
            int r1 = r3.videoFrameWidth
            int r0 = r3.videoFrameHeight
            r2.setVideoSize(r1, r0)
            android.media.MediaRecorder r1 = r6.A04
            r0 = 256000(0x3e800, float:3.58732E-40)
            r1.setVideoEncodingBitRate(r0)
            android.media.MediaRecorder r1 = r6.A04
            int r0 = r3.videoCodec
            r1.setVideoEncoder(r0)
            X.1dg r1 = r5.A01
            r0 = 46
            java.lang.String r1 = r1.A0J(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = "yyyyMMdd_HHmmss"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r2 = r1.format(r0)
            java.lang.String r0 = "VID_"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = ".mp4"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
        L_0x00bc:
            java.io.File r0 = r7.A00(r1)
            X.AnonymousClass00B.A06(r0)
            java.lang.String r1 = r0.getPath()
            android.media.MediaRecorder r0 = r6.A04
            r0.setOutputFile(r1)
            android.media.MediaRecorder r1 = r6.A04
            X.5h1 r0 = r6.A06
            X.AnonymousClass00B.A04(r0)
            int r0 = r0.getDisplayOrientation()
            int r0 = 360 - r0
            r1.setOrientationHint(r0)
            android.media.MediaRecorder r1 = r6.A04
            android.view.SurfaceHolder r0 = r4.getHolder()
            android.view.Surface r0 = r0.getSurface()
            r1.setPreviewDisplay(r0)
            goto L_0x00f2
        L_0x00ea:
            int r0 = r6.A00
            android.media.CamcorderProfile r3 = android.media.CamcorderProfile.get(r0, r1)
            goto L_0x0069
        L_0x00f2:
            android.media.MediaRecorder r0 = r6.A04     // Catch:{ IOException | IllegalStateException -> 0x0102 }
            r0.prepare()     // Catch:{ IOException | IllegalStateException -> 0x0102 }
            android.media.MediaRecorder r0 = r6.A04
            X.AnonymousClass00B.A06(r0)
            r0.start()
            r0 = 1
            goto L_0x0018
        L_0x0102:
            r0 = move-exception
            r0.getMessage()
            A02(r6)
            A02(r6)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119925zq.A00(android.view.SurfaceView, X.4HD, X.5zp, X.5th):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass4HD r6, X.C119915zp r7, X.C117875th r8) {
        /*
            java.util.HashMap r3 = X.AnonymousClass000.A0x()
            java.lang.String r2 = r7.A08
            int r1 = r2.hashCode()
            r0 = 100313435(0x5faa95b, float:2.3572098E-35)
            r5 = 1
            if (r1 == r0) goto L_0x0081
            r0 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r1 == r0) goto L_0x0079
            r0 = 124969519(0x772e22f, float:1.8272526E-34)
            if (r1 != r0) goto L_0x0023
            java.lang.String r0 = "image_and_video"
            boolean r0 = r2.equals(r0)
            r4 = 1
        L_0x0021:
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r4 = -1
        L_0x0024:
            java.lang.String r2 = "video_file_name"
            if (r4 == 0) goto L_0x0073
            java.lang.String r1 = "image_file_name"
            if (r4 == r5) goto L_0x0052
            java.lang.String r0 = r7.A07
            r3.put(r1, r0)
        L_0x0031:
            X.1dg r5 = r6.A01
            r0 = 44
            X.0q1 r4 = r5.A0H(r0)
            if (r4 == 0) goto L_0x0051
            X.0q2 r2 = new X.0q2
            r2.<init>()
            r1 = 0
            java.util.Map r0 = X.C87604Xq.A01(r3)
            r2.A03(r0, r1)
            X.0q3 r1 = r2.A01()
            X.0q7 r0 = r6.A00
            X.C29701b3.A01(r0, r5, r1, r4)
        L_0x0051:
            return
        L_0x0052:
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x0063
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0063
            X.5h1 r0 = r7.A06
            X.AnonymousClass00B.A04(r0)
            A00(r0, r6, r7, r8)
            return
        L_0x0063:
            java.lang.String r0 = r7.A07
            r3.put(r1, r0)
            java.lang.String r0 = r7.A09
            r3.put(r2, r0)
            r0 = 0
            r7.A0C = r0
            r7.A0A = r0
            goto L_0x0031
        L_0x0073:
            java.lang.String r0 = r7.A09
            r3.put(r2, r0)
            goto L_0x0031
        L_0x0079:
            java.lang.String r0 = "video"
            boolean r0 = r2.equals(r0)
            r4 = 0
            goto L_0x0021
        L_0x0081:
            java.lang.String r0 = "image"
            boolean r0 = r2.equals(r0)
            r4 = 2
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119925zq.A01(X.4HD, X.5zp, X.5th):void");
    }

    public static void A02(C119915zp r1) {
        MediaRecorder mediaRecorder = r1.A04;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            r1.A04.release();
            r1.A04 = null;
            Camera camera = r1.A03;
            if (camera != null) {
                camera.lock();
            }
        }
    }

    public void A5W(Context context, View view, C12380kI r14, AnonymousClass4HD r15, String str, String str2, String str3, String str4, String str5) {
        int i2;
        Camera camera;
        String str6 = str5;
        this.A00 = false;
        AnonymousClass4HD r7 = r15;
        AnonymousClass5MV r8 = (AnonymousClass5MV) C62183Bz.A05(r15.A00, r15.A01);
        AnonymousClass00B.A06(r8);
        C119915zp r82 = (C119915zp) r8;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        r82.A01 = displayMetrics.heightPixels;
        r82.A02 = displayMetrics.widthPixels;
        ViewGroup A07 = C13700nu.A07(view, R.id.bloks_camera_preview);
        if (TextUtils.equals(str, "front")) {
            i2 = 1;
            r82.A00 = 1;
        } else {
            i2 = 0;
            r82.A00 = 0;
        }
        if (Camera.getNumberOfCameras() < i2 + 1) {
            i2 = 0;
        }
        try {
            camera = Camera.open(i2);
        } catch (Exception e2) {
            Log.e(AnonymousClass000.A0g("CAMERA EXPECTION", e2));
            camera = null;
        }
        r82.A03 = camera;
        String str7 = str2;
        r82.A08 = str7;
        r82.A07 = str3;
        r82.A09 = str4;
        r82.A0C = false;
        r82.A0A = false;
        r82.A05 = (BloksCameraOverlay) view.findViewById(R.id.camera_overlay);
        Camera camera2 = r82.A03;
        int i3 = r82.A00;
        int i4 = r82.A02;
        int i5 = r82.A01;
        C111585h1 r0 = new C111585h1(context);
        r0.A02 = camera2;
        r0.A01 = i4;
        r0.A00 = i5;
        r0.A00 = i3;
        r82.A06 = r0;
        BloksCameraOverlay bloksCameraOverlay = r82.A05;
        AnonymousClass00B.A04(bloksCameraOverlay);
        if (str5 == null) {
            str6 = "original";
        }
        bloksCameraOverlay.A00(str6);
        A07.removeAllViews();
        A07.addView(r82.A06);
        C111585h1 r02 = r82.A06;
        AnonymousClass00B.A04(r02);
        r02.getDisplayOrientation();
        C004601z.A0E(view, R.id.shutter).setOnClickListener(new C119635yn(new AnonymousClass5yL(r14, r82, this), r7, r82, this, str7));
    }

    public AnonymousClass5MV A7H() {
        return new C119915zp();
    }

    public C12690ko AKA() {
        return new AnonymousClass5z7();
    }

    public void Ah7(AnonymousClass5MV r2) {
        C119915zp r22 = (C119915zp) r2;
        A02(r22);
        Camera camera = r22.A03;
        if (camera != null) {
            camera.release();
            r22.A03 = null;
        }
    }
}
