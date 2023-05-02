package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;

/* renamed from: X.5wu  reason: invalid class name and case insensitive filesystem */
public class C119325wu {
    public long A00;
    public C119005vl A01;
    public AnonymousClass5xW A02;
    public C1223469f A03;
    public C111185fT A04;
    public AnonymousClass5wJ A05;
    public C119235wl A06;
    public C1221768o A07;
    public final C118995vk A08;
    public final C118885vP A09;
    public final C119355wx A0A;
    public volatile CameraDevice A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;

    public C119325wu(C118995vk r2, C119355wx r3) {
        this.A0A = r3;
        this.A08 = r2;
        this.A09 = new C118885vP(r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e7, code lost:
        if (r0 == false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C119235wl A01(android.hardware.camera2.CaptureRequest.Builder r14, X.AnonymousClass5zQ r15, X.AnonymousClass69J r16, X.AnonymousClass5zJ r17, X.AnonymousClass5vQ r18, java.lang.String r19, int r20, int r21) {
        /*
            r13 = this;
            r11 = 1
            r3 = 0
            X.5vP r1 = r13.A09
            java.lang.String r0 = "Method recordVideo() must run on the Optic Background Thread."
            r1.A01(r0)
            android.hardware.camera2.CameraDevice r0 = r13.A0B
            if (r0 == 0) goto L_0x00ea
            X.5wJ r0 = r13.A05
            if (r0 == 0) goto L_0x00ea
            X.5fT r1 = r13.A04
            if (r1 == 0) goto L_0x00ea
            X.5xW r0 = r13.A02
            if (r0 == 0) goto L_0x00ea
            X.5vl r0 = r13.A01
            if (r0 == 0) goto L_0x00ea
            X.69f r0 = r13.A03
            if (r0 == 0) goto L_0x00ed
            X.5qO r2 = X.AnonymousClass5wI.A0A
            int r0 = X.AnonymousClass5wI.A02(r2, r1)
            boolean r1 = X.AnonymousClass000.A1P(r0)
            r0 = 3
            if (r1 != 0) goto L_0x0051
            if (r14 == 0) goto L_0x0051
            X.5vL r1 = new X.5vL
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r2, r0)
            X.5tX r1 = r1.A00()
            X.5fT r0 = r13.A04
            r0.A07(r1)
            X.5fT r1 = r13.A04
            X.5wJ r0 = r13.A05
            X.C119375wz.A02(r14, r1, r0, r3)
            X.5xW r0 = r13.A02
            r0.A05()
        L_0x0051:
            X.C119375wz.A01(r14)
            X.69f r0 = r13.A03
            X.5zK r0 = (X.AnonymousClass5zK) r0
            X.5ol r5 = r0.A03
            X.5vk r2 = r13.A08
            r9 = r20
            int r0 = r2.A00(r9)
            android.media.CamcorderProfile r6 = android.media.CamcorderProfile.get(r0, r11)
            X.5fT r0 = r13.A04
            X.5qO r4 = X.AnonymousClass5wI.A0q
            r0.A05(r4)
            r0 = r18
            int r3 = r0.A02
            int r1 = r0.A01
            X.5ol r0 = X.C114885ol.A02
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00d2
            r5 = 5000000(0x4c4b40, float:7.006492E-39)
        L_0x007e:
            r6.videoBitRate = r5
        L_0x0080:
            r0 = 2
            r6.videoCodec = r0
            X.5fT r0 = r13.A04
            int r0 = X.AnonymousClass5wI.A02(r4, r0)
            r6.videoFrameRate = r0
            r6.videoFrameWidth = r3
            r6.videoFrameHeight = r1
            boolean r0 = X.AnonymousClass5zQ.A0C
            if (r0 != 0) goto L_0x0094
            r15 = 0
        L_0x0094:
            r13.A07 = r15
            if (r15 != 0) goto L_0x00ad
            X.5fT r1 = r13.A04
            X.5qO r0 = X.AnonymousClass5wI.A0K
            java.lang.Object r0 = r1.A05(r0)
            boolean r1 = X.AnonymousClass000.A1X(r0)
            X.5zP r0 = new X.5zP
            r3 = r16
            r0.<init>(r3, r1)
            r13.A07 = r0
        L_0x00ad:
            X.5vl r0 = r13.A01
            r1 = r17
            r0.A06(r14, r1)
            X.68o r5 = r13.A07
            r0 = r21
            int r10 = r2.A03(r9, r0)
            r7 = 0
            X.5fT r1 = r13.A04
            X.5qO r0 = X.AnonymousClass5wI.A0K
            java.lang.Object r0 = r1.A05(r0)
            boolean r12 = X.AnonymousClass000.A1X(r0)
            r8 = r19
            X.5wl r0 = r5.AgG(r6, r7, r8, r9, r10, r11, r12)
            r13.A06 = r0
            return r0
        L_0x00d2:
            X.5ol r0 = X.C114885ol.A04
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00de
            r5 = 3000000(0x2dc6c0, float:4.203895E-39)
            goto L_0x007e
        L_0x00de:
            X.5ol r0 = X.C114885ol.A03
            boolean r0 = r5.equals(r0)
            r5 = 1000000(0xf4240, float:1.401298E-39)
            if (r0 != 0) goto L_0x007e
            goto L_0x0080
        L_0x00ea:
            java.lang.String r0 = "Cannot start recording video, camera is closed"
            goto L_0x00ef
        L_0x00ed:
            java.lang.String r0 = "Cannot setup media recorder, trying to setup camera params without a StartupSettings."
        L_0x00ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119325wu.A01(android.hardware.camera2.CaptureRequest$Builder, X.5zQ, X.69J, X.5zJ, X.5vQ, java.lang.String, int, int):X.5wl");
    }

    public Exception A02() {
        this.A09.A01("Method stopVideoRecording() must be run on the background thread.");
        C1221768o r0 = this.A07;
        if (r0 != null) {
            try {
                r0.AgP();
                e = null;
            } catch (Exception e2) {
                e = e2;
            }
            this.A07 = null;
        } else {
            e = null;
        }
        AnonymousClass5xW r02 = this.A02;
        if (r02 != null) {
            r02.A06();
        }
        this.A06 = null;
        this.A0D = false;
        this.A0C = false;
        return e;
    }

    public void A03() {
        this.A09.A02("Failed to release VideoCaptureController.", false);
        this.A0B = null;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
    }

    public void A04(CameraDevice cameraDevice, C119005vl r5, AnonymousClass5xW r6, C1223469f r7, C111185fT r8, AnonymousClass5wJ r9) {
        C118885vP r2 = this.A09;
        r2.A01("Can prepare only on the Optic thread");
        this.A0B = cameraDevice;
        this.A05 = r9;
        this.A04 = r8;
        this.A03 = r7;
        this.A02 = r6;
        this.A01 = r5;
        r2.A02("Failed to prepare VideoCaptureController.", true);
    }

    public void A05(CaptureRequest.Builder builder, AnonymousClass5zQ r18, C118595uw r19, AnonymousClass69J r20, AnonymousClass5zJ r21, String str, int i2, int i3, boolean z2) {
        AnonymousClass5xW r0 = this.A02;
        C118595uw r3 = r19;
        if (r0 == null || !r0.A0G() || this.A04 == null) {
            r3.A02(AnonymousClass000.A0V("Cannot start recording video, camera is not ready or has been closed."));
        } else if (this.A0D) {
            r3.A02(AnonymousClass000.A0V("Cannot start recording video, there is a video already being recorded"));
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C111185fT r02 = this.A04;
            C115835qO r2 = AnonymousClass5wI.A0s;
            Object A052 = r02.A05(r2);
            C111185fT r03 = this.A04;
            if (A052 == null) {
                r2 = AnonymousClass5wI.A0m;
            }
            AnonymousClass5vQ r10 = (AnonymousClass5vQ) r03.A05(r2);
            String str2 = str;
            if (str == null) {
                r3.A02(AnonymousClass000.A0T("Cannot start recording video, both filePath and fileDescriptor cannot be null, one must contain a valid value"));
                return;
            }
            this.A0D = true;
            this.A0C = false;
            CaptureRequest.Builder builder2 = builder;
            AnonymousClass5zJ r9 = r21;
            this.A0A.A00(new C111135fO(builder2, r3, this, r9, z2), "start_video_recording", new AnonymousClass67F(builder2, r18, r20, this, r9, r10, str2, i2, i3, elapsedRealtime));
        }
    }

    public void A06(CaptureRequest.Builder builder, C118595uw r10, AnonymousClass5zJ r11) {
        if (!this.A0D) {
            r10.A02(AnonymousClass000.A0V("Not recording video."));
            return;
        }
        this.A0A.A00(r10, "stop_video_capture", new AnonymousClass67E(builder, this, r11, SystemClock.elapsedRealtime()));
    }
}
