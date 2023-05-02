package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import com.facebook.optic.IDxSCallbackShape9S0200000_3_I1;

/* renamed from: X.5ws  reason: invalid class name and case insensitive filesystem */
public class C119305ws {
    public static final C115095p8 A0H = new C115095p8();
    public CameraDevice A00;
    public C119005vl A01;
    public AnonymousClass5xW A02;
    public C119325wu A03;
    public AnonymousClass5zM A04;
    public C119335wv A05;
    public C1223469f A06;
    public C111185fT A07;
    public AnonymousClass5wJ A08;
    public AnonymousClass69V A09;
    public C118945vf A0A;
    public boolean A0B;
    public boolean A0C;
    public final C118885vP A0D;
    public final C115095p8 A0E;
    public final C119355wx A0F;
    public volatile boolean A0G;

    public C119305ws(C118945vf r3, C119355wx r4) {
        C115095p8 r1 = A0H;
        this.A0F = r4;
        this.A0A = r3;
        this.A0D = new C118885vP(r4);
        this.A0E = r1;
    }

    public void A00() {
        this.A0D.A02("Failed to release PhotoCaptureController.", false);
        this.A00 = null;
        this.A08 = null;
        this.A07 = null;
        this.A03 = null;
        this.A05 = null;
        this.A02 = null;
        this.A01 = null;
        this.A06 = null;
        AnonymousClass69V r0 = this.A09;
        if (r0 != null) {
            r0.release();
            this.A09 = null;
        }
        AnonymousClass5zM r02 = this.A04;
        if (r02 != null) {
            r02.release();
            this.A04 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (X.AnonymousClass000.A1X(r5.A06.A9Z(X.C1223469f.A0C)) == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (r0 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (X.AnonymousClass000.A1X(r5.A06.A9Z(X.C1223469f.A08)) == false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.hardware.camera2.CameraDevice r6, X.AnonymousClass5zQ r7, X.C119005vl r8, X.AnonymousClass5xW r9, X.C119325wu r10, X.C119335wv r11, X.C1223469f r12, X.C111185fT r13, X.AnonymousClass5wJ r14, int r15) {
        /*
            r5 = this;
            X.5vP r3 = r5.A0D
            java.lang.String r0 = "Can prepare only on the Optic thread"
            r3.A01(r0)
            r5.A00 = r6
            r5.A08 = r14
            r5.A07 = r13
            r5.A03 = r10
            r5.A05 = r11
            r5.A02 = r9
            r5.A01 = r8
            r5.A06 = r12
            if (r7 == 0) goto L_0x001e
            r0 = 0
            r5.A09 = r0
            r5.A04 = r0
        L_0x001e:
            r0 = 0
            r5.A0B = r0
            r5.A0C = r0
            r4 = 1
            if (r12 == 0) goto L_0x00ec
            X.5qN r0 = X.AnonymousClass5wJ.A0F
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r14)
            if (r0 == 0) goto L_0x003d
            X.69f r1 = r5.A06
            X.5qM r0 = X.C1223469f.A08
            java.lang.Object r0 = r1.A9Z(r0)
            boolean r1 = X.AnonymousClass000.A1X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            r5.A0B = r0
            if (r0 != 0) goto L_0x0059
            X.5qN r0 = X.AnonymousClass5wJ.A0U
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r14)
            if (r0 == 0) goto L_0x0059
            X.69f r1 = r5.A06
            X.5qM r0 = X.C1223469f.A0C
            java.lang.Object r0 = r1.A9Z(r0)
            boolean r1 = X.AnonymousClass000.A1X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            r5.A0C = r0
            X.69f r1 = r5.A06
            X.5qM r0 = X.C1223469f.A02
            java.lang.Object r0 = r1.A9Z(r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 != 0) goto L_0x0072
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0072
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x00ec
        L_0x0072:
            r0 = 0
        L_0x0073:
            r5.A09 = r0
            if (r0 == 0) goto L_0x009e
        L_0x0077:
            int r1 = r0.ACi()
            r0 = 35
            if (r1 == r0) goto L_0x00e5
            r0 = 37
            if (r1 == r0) goto L_0x00ce
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != r0) goto L_0x00f7
            X.5fT r1 = r5.A07
            if (r1 == 0) goto L_0x00f7
            X.5qO r0 = X.AnonymousClass5wI.A0g
        L_0x008d:
            java.lang.Object r0 = r1.A05(r0)
        L_0x0091:
            X.5vQ r0 = (X.AnonymousClass5vQ) r0
            if (r0 == 0) goto L_0x00f7
            X.69V r2 = r5.A09
            int r1 = r0.A02
            int r0 = r0.A01
            r2.AHv(r1, r0, r15)
        L_0x009e:
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x00a6
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x00c8
        L_0x00a6:
            X.5zM r0 = r5.A04
            if (r0 != 0) goto L_0x00b1
            X.5zM r0 = new X.5zM
            r0.<init>()
            r5.A04 = r0
        L_0x00b1:
            X.5fT r1 = r5.A07
            if (r1 == 0) goto L_0x00c8
            X.5qO r0 = X.AnonymousClass5wI.A0u
            java.lang.Object r0 = r1.A05(r0)
            X.5vQ r0 = (X.AnonymousClass5vQ) r0
            if (r0 == 0) goto L_0x00c8
            X.5zM r2 = r5.A04
            int r1 = r0.A02
            int r0 = r0.A01
            r2.AHv(r1, r0, r15)
        L_0x00c8:
            java.lang.String r0 = "Failed to prepare PhotoCaptureController."
            r3.A02(r0, r4)
            return
        L_0x00ce:
            X.5wJ r1 = r5.A08
            if (r1 == 0) goto L_0x00f7
            X.5qN r0 = X.AnonymousClass5wJ.A0s
            java.util.List r1 = X.AnonymousClass5wJ.A01(r0, r1)
            if (r1 == 0) goto L_0x00f7
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00f7
            java.lang.Object r0 = X.C13690nt.A0Z(r1)
            goto L_0x0091
        L_0x00e5:
            X.5fT r1 = r5.A07
            if (r1 == 0) goto L_0x00f7
            X.5qO r0 = X.AnonymousClass5wI.A0u
            goto L_0x008d
        L_0x00ec:
            X.69V r0 = r5.A09
            if (r0 != 0) goto L_0x0077
            X.5zL r0 = new X.5zL
            r0.<init>()
            goto L_0x0073
        L_0x00f7:
            java.lang.String r1 = "Invalid picture size"
            X.67O r0 = new X.67O
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119305ws.A01(android.hardware.camera2.CameraDevice, X.5zQ, X.5vl, X.5xW, X.5wu, X.5wv, X.69f, X.5fT, X.5wJ, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (X.AnonymousClass5wI.A02(X.AnonymousClass5wI.A0A, r3) != 2) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (X.AnonymousClass5wI.A02(X.AnonymousClass5wI.A0A, r3) != 1) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r1 != 1) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013b, code lost:
        if (r11 == null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0141, code lost:
        if (r10 == null) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.hardware.camera2.CameraManager r29, android.hardware.camera2.CaptureRequest.Builder r30, X.C118645v1 r31, X.AnonymousClass5zJ r32, X.C115105p9 r33, X.AnonymousClass5wQ r34, int r35, int r36, int r37, boolean r38) {
        /*
            r28 = this;
            r19 = 0
            r0 = r28
            X.5fT r1 = r0.A07
            X.AnonymousClass5wI.A04(r1)
            X.5vP r6 = r0.A0D
            java.lang.String r1 = "Cannot capture photo, not prepared"
            r6.A00(r1)
            X.5xW r1 = r0.A02
            r4 = 0
            if (r1 == 0) goto L_0x0521
            boolean r1 = r1.A0Q
            if (r1 == 0) goto L_0x0521
            X.5wx r5 = r0.A0F
            X.5vf r1 = r0.A0A
            r26 = r1
            java.util.UUID r3 = r1.A03
            X.65A r2 = new X.65A
            r27 = r31
            r1 = r27
            r2.<init>(r1, r0)
            r5.A05(r2, r3)
            X.5xW r1 = r0.A02
            X.5vP r2 = r1.A0H
            java.lang.String r1 = "Can only check if the prepared on the Optic thread"
            r2.A01(r1)
            boolean r1 = r2.A00
            if (r1 == 0) goto L_0x0046
            if (r38 == 0) goto L_0x0046
            X.5xW r1 = r0.A02
            r1.A0E(r4)
            X.5xW r1 = r0.A02
            r1.A05()
        L_0x0046:
            X.5fT r3 = r0.A07
            r8 = 2
            r2 = 1
            if (r3 == 0) goto L_0x0055
            X.5qO r1 = X.AnonymousClass5wI.A0A
            int r1 = X.AnonymousClass5wI.A02(r1, r3)
            r10 = 1
            if (r1 == r8) goto L_0x0056
        L_0x0055:
            r10 = 0
        L_0x0056:
            X.5fT r3 = r0.A07
            if (r3 == 0) goto L_0x0063
            X.5qO r1 = X.AnonymousClass5wI.A0A
            int r1 = X.AnonymousClass5wI.A02(r1, r3)
            r9 = 1
            if (r1 == r2) goto L_0x0064
        L_0x0063:
            r9 = 0
        L_0x0064:
            X.5fT r3 = r0.A07
            if (r3 == 0) goto L_0x0071
            X.5qO r1 = X.AnonymousClass5wI.A0C
            int r1 = X.AnonymousClass5wI.A02(r1, r3)
            r3 = 1
            if (r1 == r2) goto L_0x0072
        L_0x0071:
            r3 = 0
        L_0x0072:
            r1 = r30
            r14 = r32
            if (r10 != 0) goto L_0x0281
            if (r3 == 0) goto L_0x0080
            X.5vl r3 = r0.A01
            boolean r3 = r3.A0C
            if (r3 == 0) goto L_0x0281
        L_0x0080:
            if (r9 != 0) goto L_0x0086
            if (r10 == 0) goto L_0x0106
            if (r4 != 0) goto L_0x0106
        L_0x0086:
            java.lang.String r3 = "Cannot run precapture sequence, not prepared"
            r6.A00(r3)
            if (r30 == 0) goto L_0x051a
            X.5fT r3 = r0.A07
            if (r3 == 0) goto L_0x051a
            X.5wJ r3 = r0.A08
            if (r3 == 0) goto L_0x051a
            X.5xW r7 = r0.A02
            if (r7 == 0) goto L_0x051a
            X.5wv r3 = r0.A05
            if (r3 == 0) goto L_0x051a
            X.5vP r4 = r7.A0H
            java.lang.String r3 = "Cannot get camera operations callback."
            r4.A00(r3)
            X.5zJ r7 = r7.A08
            r9 = 0
            X.5fT r4 = r0.A07
            X.5wJ r3 = r0.A08
            X.C119375wz.A02(r1, r4, r3, r9)
            X.5fT r4 = r0.A07
            X.5qO r3 = X.AnonymousClass5wI.A08
            int r3 = X.AnonymousClass5wI.A02(r3, r4)
            if (r3 == 0) goto L_0x00bf
            X.5fT r4 = r0.A07
            X.5wJ r3 = r0.A08
            X.C119375wz.A02(r1, r4, r3, r2)
        L_0x00bf:
            X.5wv r3 = r0.A05
            int r3 = r3.A02()
            if (r3 != 0) goto L_0x00d3
            X.5wv r3 = r0.A05
            float r4 = r3.A01()
            r3 = 1120403456(0x42c80000, float:100.0)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00f2
        L_0x00d3:
            X.5wv r3 = r0.A05
            float r25 = r3.A01()
            X.5wv r3 = r0.A05
            android.graphics.Rect r4 = r3.A03
            android.hardware.camera2.params.MeteringRectangle[] r23 = r3.A06()
            X.5wv r3 = r0.A05
            android.hardware.camera2.params.MeteringRectangle[] r24 = r3.A05()
            X.5wJ r3 = r0.A08
            r20 = r4
            r21 = r1
            r22 = r3
            X.AnonymousClass5xW.A01(r20, r21, r22, r23, r24, r25)
        L_0x00f2:
            r3 = 3
            r7.A0E = r3
            X.5vT r9 = r7.A0D
            r3 = 3000(0xbb8, double:1.482E-320)
            r9.A02(r3)
            X.67B r4 = new X.67B
            r4.<init>(r1, r0, r7)
            java.lang.String r3 = "run_precapture_sequence_on_camera_handler_thread"
            r5.A04(r3, r4)
        L_0x0106:
            java.lang.String r3 = "Cannot capture still picture, not prepared"
            r6.A00(r3)
            android.hardware.camera2.CameraDevice r3 = r0.A00
            r7 = 0
            if (r3 == 0) goto L_0x0510
            X.5fT r3 = r0.A07
            if (r3 == 0) goto L_0x0510
            X.69V r9 = r0.A09
            java.lang.String r3 = "Cannot get picture ImageReader, not prepared"
            r6.A00(r3)
            X.69V r3 = r0.A09
            if (r3 == 0) goto L_0x027e
            android.view.Surface r10 = r3.getSurface()
        L_0x0123:
            boolean r3 = r0.A0C
            boolean r15 = X.AnonymousClass000.A1O(r3)
            X.5zM r4 = r0.A04
            java.lang.String r3 = "Cannot get YUV picture ImageReader, not prepared"
            r6.A00(r3)
            X.5zM r3 = r0.A04
            if (r3 == 0) goto L_0x027b
            android.view.Surface r11 = r3.getSurface()
        L_0x0138:
            if (r4 == 0) goto L_0x013d
            r12 = 1
            if (r11 != 0) goto L_0x013e
        L_0x013d:
            r12 = 0
        L_0x013e:
            if (r9 == 0) goto L_0x0143
            r3 = 1
            if (r10 != 0) goto L_0x0144
        L_0x0143:
            r3 = 0
        L_0x0144:
            if (r15 == 0) goto L_0x0261
            if (r12 == 0) goto L_0x0263
        L_0x0148:
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            if (r15 != 0) goto L_0x0251
            r3.add(r10)
            r10 = r19
            r3.add(r10)
        L_0x0156:
            java.lang.String r10 = "Cannot create still capture builder, not prepared"
            r6.A00(r10)
            if (r30 == 0) goto L_0x0509
            android.hardware.camera2.CameraDevice r11 = r0.A00
            if (r11 == 0) goto L_0x0509
            X.5wv r10 = r0.A05
            if (r10 == 0) goto L_0x0509
            X.5fT r10 = r0.A07
            if (r10 == 0) goto L_0x0509
            X.5xW r10 = r0.A02
            if (r10 == 0) goto L_0x0509
            X.5wJ r10 = r0.A08
            if (r10 == 0) goto L_0x0509
            android.hardware.camera2.CaptureRequest$Builder r10 = r11.createCaptureRequest(r8)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            java.lang.Integer r18 = java.lang.Integer.valueOf(r8)
            r11 = r18
            r10.set(r12, r11)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            java.lang.Object r11 = r1.get(r12)
            r10.set(r12, r11)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.lang.Object r11 = r1.get(r12)
            r10.set(r12, r11)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            java.lang.Object r11 = r1.get(r12)
            r10.set(r12, r11)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            java.lang.Object r11 = r1.get(r12)
            r10.set(r12, r11)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            java.lang.Object r11 = r1.get(r12)
            r10.set(r12, r11)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            java.lang.Integer r11 = java.lang.Integer.valueOf(r36)
            r10.set(r12, r11)
            android.hardware.camera2.CaptureRequest$Key r12 = android.hardware.camera2.CaptureRequest.JPEG_QUALITY
            r11 = 90
            java.lang.Byte r11 = java.lang.Byte.valueOf(r11)
            r10.set(r12, r11)
            X.5fT r12 = r0.A07
            X.5wJ r11 = r0.A08
            X.C119375wz.A02(r10, r12, r11, r7)
            r13 = 3
            X.5fT r12 = r0.A07
            X.5wJ r11 = r0.A08
            X.C119375wz.A02(r10, r12, r11, r13)
            r13 = 4
            X.5fT r12 = r0.A07
            X.5wJ r11 = r0.A08
            X.C119375wz.A02(r10, r12, r11, r13)
            r13 = 7
            X.5fT r12 = r0.A07
            X.5wJ r11 = r0.A08
            X.C119375wz.A02(r10, r12, r11, r13)
            X.5fT r12 = r0.A07
            X.5wJ r11 = r0.A08
            X.C119375wz.A02(r10, r12, r11, r8)
            r12 = 6
            X.5fT r11 = r0.A07
            X.5wJ r8 = r0.A08
            X.C119375wz.A02(r10, r11, r8, r12)
            r12 = 5
            X.5fT r11 = r0.A07
            X.5wJ r8 = r0.A08
            X.C119375wz.A02(r10, r11, r8, r12)
            X.5fT r11 = r0.A07
            X.5qO r8 = X.AnonymousClass5wI.A08
            int r8 = X.AnonymousClass5wI.A02(r8, r11)
            if (r8 == 0) goto L_0x0208
            X.5fT r11 = r0.A07
            X.5wJ r8 = r0.A08
            X.C119375wz.A02(r1, r11, r8, r2)
        L_0x0208:
            X.5wv r8 = r0.A05
            int r8 = r8.A02()
            if (r8 != 0) goto L_0x021c
            X.5wv r8 = r0.A05
            float r11 = r8.A01()
            r8 = 1120403456(0x42c80000, float:100.0)
            int r8 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x023b
        L_0x021c:
            X.5wv r8 = r0.A05
            float r25 = r8.A01()
            X.5wv r8 = r0.A05
            android.graphics.Rect r11 = r8.A03
            android.hardware.camera2.params.MeteringRectangle[] r23 = r8.A06()
            X.5wv r8 = r0.A05
            android.hardware.camera2.params.MeteringRectangle[] r24 = r8.A05()
            X.5wJ r8 = r0.A08
            r20 = r11
            r21 = r10
            r22 = r8
            X.AnonymousClass5xW.A01(r20, r21, r22, r23, r24, r25)
        L_0x023b:
            java.util.Iterator r8 = r3.iterator()
        L_0x023f:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0296
            java.lang.Object r3 = r8.next()
            android.view.Surface r3 = (android.view.Surface) r3
            if (r3 == 0) goto L_0x023f
            r10.addTarget(r3)
            goto L_0x023f
        L_0x0251:
            boolean r10 = r0.A0B
            if (r10 == 0) goto L_0x025c
            java.lang.String r0 = "set"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x025c:
            r3.add(r11)
            goto L_0x0156
        L_0x0261:
            if (r3 != 0) goto L_0x0148
        L_0x0263:
            r0.A0G = r7
            java.lang.Object[] r1 = new java.lang.Object[r2]
            if (r15 == 0) goto L_0x0278
            java.lang.String r0 = "YUV"
        L_0x026b:
            r1[r7] = r0
            java.lang.String r0 = "%s ImageReader not setup before taking picture."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0278:
            java.lang.String r0 = "JPEG"
            goto L_0x026b
        L_0x027b:
            r11 = 0
            goto L_0x0138
        L_0x027e:
            r10 = 0
            goto L_0x0123
        L_0x0281:
            X.5vl r7 = r0.A01
            X.5xW r3 = r0.A02
            X.5xD r3 = r3.A09
            java.lang.Integer r3 = r7.A00(r1, r14, r3)
            if (r3 == 0) goto L_0x0080
            int r3 = r3.intValue()
            if (r3 != r8) goto L_0x0080
            r4 = 1
            goto L_0x0080
        L_0x0296:
            int r8 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r8 < r3) goto L_0x02a3
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r10.set(r8, r3)
        L_0x02a3:
            X.5wJ r8 = r0.A08
            X.5qN r3 = X.AnonymousClass5wJ.A0K
            boolean r3 = X.AnonymousClass5wJ.A02(r3, r8)
            if (r3 == 0) goto L_0x02b4
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE
            r3 = r18
            r10.set(r8, r3)
        L_0x02b4:
            X.5wJ r8 = r0.A08
            X.5qN r3 = X.AnonymousClass5wJ.A0B
            r8.A03(r3)
            X.5wJ r8 = r0.A08
            java.lang.String r3 = "Cannot update builder for burst capture after camera closed."
            if (r8 == 0) goto L_0x0500
            if (r15 != 0) goto L_0x04f0
            boolean r4 = r9 instanceof X.AnonymousClass5zM
            X.5zI r3 = new X.5zI
            r3.<init>(r4)
            android.os.Handler r8 = r5.A02
            X.5tg r4 = r3.A04
            r9.Aam(r8, r4)
        L_0x02d1:
            X.67A r8 = new X.67A
            r8.<init>(r10, r0, r3)
            java.lang.String r4 = "capture_still_picture_on_camera_handler_thread"
            java.lang.Object r13 = r5.A04(r4, r8)
            X.5wG r13 = (X.AnonymousClass5wG) r13
            r0.A0G = r7
            byte[] r12 = r13.A04
            X.5va r4 = r13.A01
            r17 = r4
            r20 = r34
            if (r12 == 0) goto L_0x02ed
            int r4 = r12.length
            if (r4 != 0) goto L_0x03a4
        L_0x02ed:
            if (r17 != 0) goto L_0x03a4
            java.lang.String r4 = "Image data was null."
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r4)
            X.AnonymousClass5xH.A00()
            java.lang.String r3 = "Photo capture returned empty image data."
            X.67O r4 = new X.67O
            r4.<init>(r3)
            r3 = r27
            r0.A04(r3, r4)
        L_0x0305:
            X.5qR r4 = X.AnonymousClass5wQ.A04
            r3 = r20
            java.lang.Object r3 = r3.A00(r4)
            boolean r3 = X.AnonymousClass000.A1X(r3)
            if (r3 == 0) goto L_0x03a3
            java.lang.String r3 = "Cannot restore preview post capture, not prepared"
            r6.A00(r3)
            if (r33 == 0) goto L_0x03a3
            X.5xW r5 = r0.A02
            if (r5 == 0) goto L_0x03a3
            X.5wJ r3 = r0.A08
            if (r3 == 0) goto L_0x03a3
            X.5fT r3 = r0.A07
            if (r3 == 0) goto L_0x03a3
            X.5wv r3 = r0.A05
            if (r3 == 0) goto L_0x03a3
            X.5xD r4 = r5.A09
            if (r4 == 0) goto L_0x03a3
            if (r38 == 0) goto L_0x0333
            r5.A0E(r2)
        L_0x0333:
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r3 = r18
            r1.set(r5, r3)
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            r1.set(r5, r3)
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r1.set(r6, r5)
            X.5wv r5 = r0.A05
            float r11 = r5.A01()
            X.5wv r5 = r0.A05
            android.graphics.Rect r6 = r5.A03
            android.hardware.camera2.params.MeteringRectangle[] r9 = r5.A06()
            X.5wv r5 = r0.A05
            android.hardware.camera2.params.MeteringRectangle[] r10 = r5.A05()
            X.5wJ r5 = r0.A08
            r7 = r1
            r8 = r5
            X.AnonymousClass5xW.A01(r6, r7, r8, r9, r10, r11)
            android.hardware.camera2.CameraDevice r5 = r0.A00
            java.lang.String r11 = r5.getId()
            X.5fT r6 = r0.A07
            X.5wJ r5 = r0.A08
            r12 = 0
            r7 = r29
            r8 = r1
            r9 = r6
            r10 = r5
            X.C119375wz.A00(r7, r8, r9, r10, r11, r12)
            if (r32 == 0) goto L_0x0389
            X.5xW r5 = r0.A02
            X.68A r5 = r5.A0J
            r14.A0E = r2
            r14.A07 = r5
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r14.A09 = r2
            r2 = r19
            r14.A02 = r2
        L_0x0389:
            android.hardware.camera2.CaptureRequest r5 = r1.build()
            r2 = r19
            r4.A04(r5, r2)
            r4.A05(r5, r14)
            X.5fT r2 = r0.A07
            X.5wJ r0 = r0.A08
            X.C119375wz.A02(r1, r2, r0, r3)
            android.hardware.camera2.CaptureRequest r0 = r1.build()
            r4.A05(r0, r14)
        L_0x03a3:
            return
        L_0x03a4:
            java.lang.Integer r4 = r13.A03
            if (r4 == 0) goto L_0x04df
            java.lang.Integer r8 = r13.A02
            if (r8 == 0) goto L_0x04df
            int r4 = r4.intValue()
            int r8 = r8.intValue()
        L_0x03b4:
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>(r7, r7, r4, r8)
            X.5fT r7 = r0.A07
            X.5qO r4 = X.AnonymousClass5wI.A0l
            java.lang.Object r11 = r7.A05(r4)
            android.graphics.Rect r11 = (android.graphics.Rect) r11
            java.lang.Long r9 = r3.A00
            X.5v3 r3 = r3.A01
            int r4 = r3.A00
            int r4 = r4 + 3
            int r4 = r4 + -1
            int r4 = r4 % 3
            X.5wd[] r3 = r3.A01
            r8 = r3[r4]
            if (r8 == 0) goto L_0x04d9
            boolean r3 = r0.A0C
            if (r3 == 0) goto L_0x04d6
            X.5qQ r3 = X.C119155wd.A0T
            java.lang.Object r3 = r8.A00(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 != 0) goto L_0x03eb
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            java.lang.Object r3 = r10.get(r3)
            java.lang.Number r3 = (java.lang.Number) r3
        L_0x03eb:
            if (r9 != 0) goto L_0x03f3
            X.5qQ r4 = X.C119155wd.A0K
            java.lang.Object r9 = r8.A00(r4)
        L_0x03f3:
            if (r3 == 0) goto L_0x04d9
            int r16 = r3.intValue()
        L_0x03f9:
            r4 = r37
            r3 = r16
            X.C115115pA.A00(r15, r11, r4, r3)
            r3 = 0
            X.5vK r7 = new X.5vK
            r4 = r35
            r7.<init>(r15, r11, r3, r4)
            X.5qT r11 = X.C119185wg.A0f
            X.5qR r4 = X.AnonymousClass5wQ.A05
            r3 = r20
            java.lang.Object r4 = r3.A00(r4)
            r7.A01(r11, r4)
            X.5qT r3 = X.C119185wg.A0U
            r7.A01(r3, r9)
            int r4 = r13.A00
            r3 = 35
            if (r4 != r3) goto L_0x04cf
            X.5qT r4 = X.C119185wg.A0a
            r3 = r17
            r7.A01(r4, r3)
        L_0x0427:
            if (r8 == 0) goto L_0x0483
            X.5qT r4 = X.C119185wg.A0b
            X.5qQ r3 = X.C119155wd.A0R
            java.lang.Object r3 = r8.A00(r3)
            r7.A01(r4, r3)
            X.5qT r4 = X.C119185wg.A0P
            X.5qQ r3 = X.C119155wd.A0F
            java.lang.Object r3 = r8.A00(r3)
            r7.A01(r4, r3)
            X.5qT r4 = X.C119185wg.A0W
            X.5qQ r3 = X.C119155wd.A0M
            java.lang.Object r3 = r8.A00(r3)
            r7.A01(r4, r3)
            X.5qT r4 = X.C119185wg.A0Q
            X.5qQ r3 = X.C119155wd.A0G
            java.lang.Object r3 = r8.A00(r3)
            r7.A01(r4, r3)
            X.5qT r4 = X.C119185wg.A0X
            X.5qQ r3 = X.C119155wd.A0P
            java.lang.Object r3 = r8.A00(r3)
            r7.A01(r4, r3)
            X.5qT r4 = X.C119185wg.A0T
            X.5qQ r3 = X.C119155wd.A0J
            java.lang.Object r3 = r8.A00(r3)
            r7.A01(r4, r3)
            X.5qT r4 = X.C119185wg.A0V
            X.5qQ r3 = X.C119155wd.A0L
            java.lang.Object r3 = r8.A00(r3)
            r7.A01(r4, r3)
            boolean r3 = r0.A0C
            if (r3 == 0) goto L_0x0483
            X.5qT r4 = X.C119185wg.A0c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r7.A01(r4, r3)
        L_0x0483:
            X.5wv r3 = r0.A05
            if (r3 == 0) goto L_0x0494
            X.5qT r4 = X.C119185wg.A0g
            int r3 = r3.A02()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.A01(r4, r3)
        L_0x0494:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            java.lang.Object r3 = r10.get(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            X.5qT r4 = X.C119185wg.A0e
            if (r3 == 0) goto L_0x04cd
            int r3 = r3.intValue()
            int r3 = X.C119415xm.A00(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x04ac:
            r7.A01(r4, r3)
            r15.width()
            r15.height()
            X.AnonymousClass5xH.A00()
            X.5wg r8 = new X.5wg
            r8.<init>(r7)
            r3 = r26
            java.util.UUID r7 = r3.A03
            X.66F r4 = new X.66F
            r3 = r27
            r4.<init>(r3, r0, r8)
            r5.A05(r4, r7)
            goto L_0x0305
        L_0x04cd:
            r3 = 0
            goto L_0x04ac
        L_0x04cf:
            X.5qT r3 = X.C119185wg.A0Z
            r7.A01(r3, r12)
            goto L_0x0427
        L_0x04d6:
            r3 = 0
            goto L_0x03eb
        L_0x04d9:
            int r16 = X.C119025vn.A00(r12)
            goto L_0x03f9
        L_0x04df:
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options
            r8.<init>()
            r8.inJustDecodeBounds = r2
            int r4 = r12.length
            android.graphics.BitmapFactory.decodeByteArray(r12, r7, r4, r8)
            int r4 = r8.outWidth
            int r8 = r8.outHeight
            goto L_0x03b4
        L_0x04f0:
            boolean r8 = r4 instanceof X.AnonymousClass5zM
            X.5zI r3 = new X.5zI
            r3.<init>(r8)
            android.os.Handler r9 = r5.A02
            X.5tg r8 = r3.A04
            r4.Aam(r9, r8)
            goto L_0x02d1
        L_0x0500:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x0509:
            java.lang.String r0 = "Trying to create capture settings after camera closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0510:
            r0.A0G = r7
            java.lang.String r1 = "Camera must be opened to capture still picture."
            X.67O r0 = new X.67O
            r0.<init>(r1)
            throw r0
        L_0x051a:
            java.lang.String r0 = "Preview closed while processing capture request."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0521:
            r0.A0G = r4
            java.lang.String r0 = "Preview closed while processing capture request."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119305ws.A02(android.hardware.camera2.CameraManager, android.hardware.camera2.CaptureRequest$Builder, X.5v1, X.5zJ, X.5p9, X.5wQ, int, int, int, boolean):void");
    }

    public void A03(CameraManager cameraManager, CaptureRequest.Builder builder, C118645v1 r18, AnonymousClass5zJ r19, C115105p9 r20, AnonymousClass5wQ r21, int i2, int i3, int i4, boolean z2) {
        AnonymousClass5xW r0;
        C118645v1 r6 = r18;
        if (this.A00 == null || (r0 = this.A02) == null || !r0.A0Q) {
            A04(r6, new AnonymousClass67O("Camera not ready to take photo."));
        } else if (this.A0G) {
            A04(r6, new AnonymousClass67O("Cannot take photo, another capture in progress."));
        } else if (this.A03.A0D) {
            A04(r6, new AnonymousClass67O("Cannot take photo, video recording in progress."));
        } else {
            AnonymousClass5wI.A04(this.A07);
            this.A0G = true;
            this.A01.A02();
            this.A0F.A00(new IDxSCallbackShape9S0200000_3_I1(r6, 2, this), "take_photo", new AnonymousClass67G(cameraManager, builder, r6, this, r19, r20, r21, i2, i3, i4, z2));
        }
    }

    public void A04(C118645v1 r4, Exception exc) {
        this.A0F.A05(new AnonymousClass66G(r4, this, exc), this.A0A.A03);
    }
}
