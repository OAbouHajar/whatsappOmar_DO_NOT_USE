package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.TypedValue;
import com.facebook.optic.IDxSCallbackShape43S0100000_3_I1;
import com.facebook.redex.IDxCallableShape0S0302000_3_I1;
import com.facebook.redex.IDxCallableShape150S0100000_3_I1;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.5zD  reason: invalid class name */
public class AnonymousClass5zD implements C1223369e {
    public static final Map A0q;
    public static volatile AnonymousClass5zD A0r;
    public int A00;
    public int A01;
    public int A02;
    public Matrix A03;
    public Matrix A04;
    public Rect A05;
    public CaptureRequest.Builder A06;
    public C118715v8 A07;
    public AnonymousClass5xM A08;
    public C119335wv A09;
    public C115105p9 A0A;
    public C1223469f A0B;
    public C111185fT A0C;
    public C111195fU A0D;
    public AnonymousClass5wJ A0E;
    public AnonymousClass5vQ A0F;
    public AnonymousClass5vQ A0G;
    public UUID A0H;
    public FutureTask A0I;
    public boolean A0J;
    public boolean A0K;
    public final int A0L;
    public final Context A0M;
    public final CameraManager A0N;
    public final AnonymousClass69J A0O = new AnonymousClass5zF(this);
    public final C117835td A0P = new C117835td(this);
    public final C115775qI A0Q = new C115775qI(this);
    public final C115785qJ A0R = new C115785qJ(this);
    public final C115795qK A0S = new C115795qK(this);
    public final C111145fP A0T = new C111145fP();
    public final C118995vk A0U;
    public final C119005vl A0V;
    public final C116545rY A0W = new C116545rY();
    public final C119305ws A0X;
    public final AnonymousClass5xW A0Y;
    public final C119325wu A0Z;
    public final C118855vM A0a = new C118855vM();
    public final C118855vM A0b = new C118855vM();
    public final C118945vf A0c;
    public final C119355wx A0d;
    public final Object A0e = C13690nt.A0Y();
    public final Callable A0f = new IDxCallableShape150S0100000_3_I1(this, 12);
    public volatile int A0g;
    public volatile CameraDevice A0h;
    public volatile AnonymousClass5zQ A0i;
    public volatile AnonymousClass5zJ A0j;
    public volatile C115075p4 A0k;
    public volatile boolean A0l;
    public volatile boolean A0m;
    public volatile boolean A0n;
    public volatile boolean A0o;
    public volatile boolean A0p;

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A0q = A0x;
        Integer A0X2 = C13680ns.A0X();
        A0x.put(A0X2, A0X2);
        C13680ns.A1X(C13680ns.A0Y(), A0x, 90);
        C13680ns.A1X(2, A0x, 180);
        C13680ns.A1X(C13680ns.A0a(), A0x, 270);
    }

    public AnonymousClass5zD(Context context) {
        this.A0M = context.getApplicationContext();
        C119355wx r3 = new C119355wx();
        this.A0d = r3;
        C118945vf r2 = new C118945vf(r3);
        this.A0c = r2;
        CameraManager cameraManager = (CameraManager) context.getApplicationContext().getSystemService("camera");
        this.A0N = cameraManager;
        C118995vk r1 = new C118995vk(cameraManager, r2, r3);
        this.A0U = r1;
        this.A0X = new C119305ws(r2, r3);
        this.A0Z = new C119325wu(r1, r3);
        this.A0L = Math.round(TypedValue.applyDimension(1, 30.0f, AnonymousClass000.A0M(context)));
        this.A0V = new C119005vl(r3);
        this.A0Y = new AnonymousClass5xW(r3);
    }

    public static AnonymousClass5zD A03(Context context) {
        if (A0r == null) {
            synchronized (AnonymousClass5zD.class) {
                if (A0r == null) {
                    A0r = new AnonymousClass5zD(context);
                }
            }
        }
        return A0r;
    }

    public static /* synthetic */ void A05(AnonymousClass5zD r14) {
        AnonymousClass5zD r1 = r14;
        C119335wv r5 = r14.A09;
        if (r5 != null) {
            AnonymousClass5wJ r4 = r14.A0E;
            C111185fT r2 = r14.A0C;
            C111195fU r0 = r14.A0D;
            Rect rect = r14.A05;
            r5.A07 = r4;
            r5.A05 = r2;
            r5.A06 = r0;
            r5.A04 = rect;
            r5.A03 = new Rect(0, 0, rect.width(), rect.height());
            r5.A0A = AnonymousClass5wJ.A02(AnonymousClass5wJ.A0J, r5.A07);
            r5.A02 = AnonymousClass000.A0D(r4.A03(AnonymousClass5wJ.A0c));
            r5.A08 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0w, r4);
            r5.A09 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0x, r4);
            r5.A01 = AnonymousClass000.A0D(r4.A03(AnonymousClass5wJ.A0a));
            rect.width();
            rect.height();
            r5.A00 = C119335wv.A00(0.0f, (float) r5.A02, (float) r5.A01, -1.0f, 1.0f);
            if (r5.A06 != null) {
                C111195fU.A00(r5.A06, AnonymousClass5wI.A0p, Float.valueOf(C119335wv.A00((float) r5.A02(), (float) r5.A02, (float) r5.A01, -1.0f, 1.0f)));
            }
        }
        C119005vl r52 = r14.A0V;
        C115765qH r10 = new C115765qH(r14);
        CameraManager cameraManager = r14.A0N;
        CameraDevice cameraDevice = r14.A0h;
        AnonymousClass5wJ r3 = r14.A0E;
        C111185fT r22 = r14.A0C;
        C119335wv r02 = r14.A09;
        AnonymousClass5xW r6 = r14.A0Y;
        r52.A04(cameraDevice, cameraManager, r10, r6, r02, r22, r3);
        C119325wu r7 = r1.A0Z;
        CameraDevice cameraDevice2 = r1.A0h;
        AnonymousClass5wJ r32 = r1.A0E;
        r7.A04(cameraDevice2, r52, r6, r1.A0B, r1.A0C, r32);
        C119305ws r23 = r1.A0X;
        CameraDevice cameraDevice3 = r1.A0h;
        AnonymousClass5wJ r11 = r1.A0E;
        r23.A01(cameraDevice3, r1.A0i, r52, r6, r7, r1.A09, r1.A0B, r1.A0C, r11, r1.A02);
    }

    public static /* synthetic */ void A06(AnonymousClass5zD r7, String str) {
        C119355wx r6 = r7.A0d;
        r6.A06("Method openCamera() must run on the Optic Background Thread.");
        if (r7.A0h != null) {
            if (!r7.A0h.getId().equals(str)) {
                r7.A0C();
            } else {
                return;
            }
        }
        r7.A0Y.A0O.clear();
        CameraCharacteristics A012 = AnonymousClass5x4.A01(r7.A0N, str);
        C110215dh r4 = new C110215dh(r7.A0P, r7.A0Q);
        AnonymousClass677 r3 = new AnonymousClass677(r7, r4, str);
        synchronized (r6) {
            r6.A02.post(new C1218367a(r6, "open_camera_on_camera_handler_thread", r6.A01, r3));
        }
        C118995vk r32 = r7.A0U;
        int A042 = r32.A04(str);
        r7.A00 = A042;
        C111165fR r0 = new C111165fR(r7.A0M, A012, A042);
        r7.A0E = r0;
        C111185fT r1 = new C111185fT(r0);
        r7.A0C = r1;
        r7.A0D = new C111195fU(r1);
        r7.A02 = r32.A01(r7.A00);
        r7.A05 = (Rect) A012.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        r4.A5c();
        r7.A0h = r4.AFb();
    }

    public static /* synthetic */ void A07(AnonymousClass5zD r8, String str) {
        String str2;
        if (str != null) {
            if (r8.A07 != null) {
                C1223469f r2 = r8.A0B;
                if (r2 != null) {
                    AnonymousClass5wJ r1 = r8.A0E;
                    if (r1 == null) {
                        str2 = "Trying to setup camera params without a Capabilities.";
                    } else if (r8.A0C == null || r8.A0D == null) {
                        str2 = "Trying to setup camera params without instantiating CameraSettings.";
                    } else if (r8.A0A != null) {
                        AnonymousClass5xU r22 = ((AnonymousClass5zK) r2).A00;
                        List A012 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0r, r1);
                        List A013 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0n, r8.A0E);
                        r8.A0E.A03(AnonymousClass5wJ.A0h);
                        List A014 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0u, r8.A0E);
                        C118715v8 r0 = r8.A07;
                        int i2 = r0.A01;
                        int i3 = r0.A00;
                        r8.A0A();
                        C116945sC A042 = r22.A04(A013, A014, A012, i2, i3);
                        AnonymousClass5vQ r23 = A042.A01;
                        AnonymousClass5vQ r12 = A042.A00;
                        if (r12 != null) {
                            r8.A0F = r23;
                            C111195fU r3 = r8.A0D;
                            C115845qP.A02(AnonymousClass5wI.A0m, r3, r23);
                            C115845qP.A02(AnonymousClass5wI.A0g, r3, r12);
                            C115845qP.A02(AnonymousClass5wI.A0u, r3, (Object) null);
                            C115835qO r13 = AnonymousClass5wI.A0s;
                            AnonymousClass5vQ r02 = A042.A02;
                            if (r02 == null) {
                                r02 = r23;
                            }
                            C115845qP.A02(r13, r3, r02);
                            C115845qP.A02(AnonymousClass5wI.A0R, r3, Boolean.valueOf(r8.A0m));
                            C115845qP.A02(AnonymousClass5wI.A0h, r3, (Object) null);
                            C115845qP.A02(AnonymousClass5wI.A0N, r3, false);
                            C115845qP.A02(AnonymousClass5wI.A0J, r3, false);
                            C111195fU.A00(r3, AnonymousClass5wI.A02, AnonymousClass000.A0x());
                            return;
                        }
                        throw AnonymousClass000.A0a("Invalid picture size: 'null'");
                    } else {
                        str2 = "Trying to setup camera params without instantiating PreviewSetupDelegate.";
                    }
                } else {
                    str2 = "Trying to setup camera params without a StartupSettings.";
                }
            } else {
                str2 = "Trying to setup camera params without a CameraDeviceConfig.";
            }
            throw AnonymousClass000.A0V(str2);
        }
        throw new AnonymousClass67O("Camera ID must be provided to setup camera params.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0102, code lost:
        if (r6.A0F() != false) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A08(X.AnonymousClass5zD r24, java.lang.String r25) {
        /*
            r6 = r24
            X.5wx r5 = r6.A0d
            java.lang.String r0 = "Method configureAndStartCameraPreview() must run on the Optic Background Thread."
            r5.A06(r0)
            android.hardware.camera2.CameraDevice r0 = r6.A0h
            if (r0 == 0) goto L_0x01cd
            X.5wJ r0 = r6.A0E
            if (r0 == 0) goto L_0x01cd
            X.5v8 r0 = r6.A07
            if (r0 == 0) goto L_0x01cd
            X.5zQ r0 = r6.A0i
            if (r0 == 0) goto L_0x01c5
            X.5p9 r0 = r6.A0A
            if (r0 == 0) goto L_0x01bd
            X.69f r0 = r6.A0B
            if (r0 == 0) goto L_0x01b6
            X.5fT r0 = r6.A0C
            java.lang.String r14 = "Camera params need to be configured before invoking configureAndStartCameraPreview()"
            if (r0 == 0) goto L_0x01b1
            X.5fU r0 = r6.A0D
            if (r0 == 0) goto L_0x01b1
            X.5xW r15 = r6.A0Y
            boolean r0 = r15.A0Q
            r4 = 0
            if (r0 == 0) goto L_0x0035
            r6.A0E(r4)
        L_0x0035:
            X.5zQ r1 = r6.A0i
            java.util.List r8 = java.util.Collections.emptyList()
            X.5xM r0 = r6.A08
            if (r0 == 0) goto L_0x004a
            X.5vM r0 = r0.A08
            java.util.List r8 = r0.A00
            X.5xM r0 = r6.A08
            X.5vM r0 = r0.A08
            r0.A00()
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r0 = 0
            r6.A08 = r0
        L_0x004f:
            X.5xM r0 = r6.A08
            if (r0 != 0) goto L_0x005a
            X.5xM r0 = new X.5xM
            r0.<init>()
            r6.A08 = r0
        L_0x005a:
            X.5vM r0 = r0.A08
            r0.A00()
            X.5xM r7 = r6.A08
            int r3 = r8.size()
            r2 = 0
        L_0x0066:
            if (r2 >= r3) goto L_0x0074
            X.5vM r1 = r7.A08
            java.lang.Object r0 = r8.get(r2)
            r1.A01(r0)
            int r2 = r2 + 1
            goto L_0x0066
        L_0x0074:
            X.5xM r0 = r6.A08
            if (r0 == 0) goto L_0x01a9
            android.hardware.camera2.CameraDevice r13 = r6.A0h
            X.5fT r10 = r6.A0C
            X.5fU r9 = r6.A0D
            X.69f r8 = r6.A0B
            X.5wJ r7 = r6.A0E
            android.hardware.camera2.CameraManager r0 = r6.A0N
            r11 = r25
            android.hardware.camera2.CameraCharacteristics r16 = X.AnonymousClass5x4.A01(r0, r11)
            X.5p9 r3 = r6.A0A
            X.5xM r2 = r6.A08
            X.5ws r12 = r6.A0X
            X.5vP r1 = r12.A0D
            java.lang.String r0 = "Cannot get picture ImageReader, not prepared"
            r1.A00(r0)
            X.69V r0 = r12.A09
            if (r0 == 0) goto L_0x019d
            android.view.Surface r18 = r0.getSurface()
        L_0x009f:
            java.lang.String r0 = "Cannot get raw picture ImageReader, not prepared"
            r1.A00(r0)
            java.lang.String r0 = "Cannot get YUV picture ImageReader, not prepared"
            r1.A00(r0)
            X.5zM r0 = r12.A04
            if (r0 == 0) goto L_0x0199
            android.view.Surface r19 = r0.getSurface()
        L_0x00b1:
            r21 = r3
            r22 = r8
            r23 = r10
            r24 = r9
            r25 = r7
            r20 = r2
            r17 = r13
            r15.A0A(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.5vk r0 = r6.A0U
            r0.A04(r11)
            int r1 = r6.A00
            X.5v8 r0 = r6.A07
            int r3 = r0.A01
            int r2 = r0.A00
            X.5vQ r0 = new X.5vQ
            r0.<init>(r3, r2)
            r6.A0G = r0
            X.5xM r7 = r6.A08
            X.5vQ r11 = r6.A0F
            r6.AFv(r1)
            X.5fT r9 = r6.A0C
            X.69f r8 = r6.A0B
            X.5wJ r10 = r6.A0E
            r12 = r5
            r7.A05(r8, r9, r10, r11, r12)
            r6.A0D()
            X.5vQ r0 = r6.A0F
            if (r0 == 0) goto L_0x01b1
            X.69f r2 = r6.A0B
            X.5qM r0 = X.C1223469f.A07
            java.lang.Object r0 = r2.A9Z(r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0104
            boolean r0 = r6.A0F()
            r3 = 0
            if (r0 == 0) goto L_0x0105
        L_0x0104:
            r3 = 1
        L_0x0105:
            X.5zQ r10 = r6.A0i
            X.5vQ r0 = r6.A0F
            int r9 = r0.A02
            int r8 = r0.A01
            X.5fT r2 = r6.A0C
            X.5qO r0 = X.AnonymousClass5wI.A0i
            java.lang.Object r0 = r2.A05(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            r6.AFv(r1)
            int r7 = r6.A0g
            int r2 = r6.A01
            r1 = 90
            if (r2 == r5) goto L_0x0130
            r0 = 2
            r1 = 180(0xb4, float:2.52E-43)
            if (r2 == r0) goto L_0x0130
            r0 = 3
            r1 = 270(0x10e, float:3.78E-43)
            if (r2 == r0) goto L_0x0130
            r1 = 0
        L_0x0130:
            android.graphics.SurfaceTexture r7 = r10.A00(r9, r8, r7, r1)
            r6.A0n = r5
            X.5vl r2 = r6.A0V
            r2.A0C = r4
            if (r7 == 0) goto L_0x01a1
            X.5vQ r0 = r6.A0F
            int r1 = r0.A02
            int r0 = r0.A01
            r7.setDefaultBufferSize(r1, r0)
            X.5qJ r0 = r6.A0R
            r15.A09(r7, r0)
            X.5wv r4 = r6.A09
            if (r4 == 0) goto L_0x0159
            android.hardware.camera2.params.MeteringRectangle[] r1 = r15.A0J()
            android.hardware.camera2.params.MeteringRectangle[] r0 = r15.A0I()
            r4.A04(r1, r0)
        L_0x0159:
            X.5wJ r1 = r6.A0E
            X.5qN r0 = X.AnonymousClass5wJ.A0G
            r1.A03(r0)
            X.5wJ r1 = r6.A0E
            X.5qN r0 = X.AnonymousClass5wJ.A0t
            java.util.List r1 = X.AnonymousClass5wJ.A01(r0, r1)
            java.lang.Integer r0 = X.C13690nt.A0U()
            r1.contains(r0)
            android.hardware.camera2.CaptureRequest$Builder r0 = r15.A03()
            r6.A06 = r0
            X.5vP r1 = r15.A0H
            java.lang.String r0 = "Cannot get camera operations callback."
            r1.A00(r0)
            X.5zJ r0 = r15.A08
            r6.A0j = r0
            X.68A r0 = r15.A0J
            r15.A04(r0, r3, r5)
            X.5fT r1 = r6.A0C
            X.5qO r0 = X.AnonymousClass5wI.A0N
            java.lang.Object r0 = r1.A05(r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0198
            X.5zJ r0 = r6.A0j
            r2.A0A(r0)
        L_0x0198:
            return
        L_0x0199:
            r19 = 0
            goto L_0x00b1
        L_0x019d:
            r18 = 0
            goto L_0x009f
        L_0x01a1:
            java.lang.String r1 = "SurfacePipeCoordinator unable to provide surface texture and surface holder."
            X.67O r0 = new X.67O
            r0.<init>(r1)
            throw r0
        L_0x01a9:
            java.lang.String r1 = "PreviewFrameController must be provided to configure preview."
            X.67O r0 = new X.67O
            r0.<init>(r1)
            throw r0
        L_0x01b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r14)
            throw r0
        L_0x01b6:
            java.lang.String r0 = "StartupSettings must be provided to configure preview."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x01bd:
            java.lang.String r1 = "PreviewSetupDelegate must be provided to configure preview."
            X.67O r0 = new X.67O
            r0.<init>(r1)
            throw r0
        L_0x01c5:
            java.lang.String r1 = "SurfacePipeCoordinator must be provided to configure preview."
            X.67O r0 = new X.67O
            r0.<init>(r1)
            throw r0
        L_0x01cd:
            java.lang.String r1 = "Camera must be opened to configure preview."
            X.67O r0 = new X.67O
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5zD.A08(X.5zD, java.lang.String):void");
    }

    public int A0A() {
        Number number = (Number) AnonymousClass000.A0Y(A0q, this.A01);
        if (number != null) {
            return ((this.A02 - number.intValue()) + 360) % 360;
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0l(AnonymousClass000.A0r("Invalid display rotation value: "), this.A01));
    }

    public void A0B() {
        this.A0J = true;
    }

    public final void A0C() {
        this.A0d.A06("Method closeCamera() must run on the Optic Background Thread.");
        C119325wu r1 = this.A0Z;
        if (r1.A0D && (!this.A0p || r1.A0C)) {
            r1.A02();
        }
        A0E(false);
        this.A0V.A01();
        this.A0X.A00();
        r1.A03();
        if (this.A0h != null) {
            C111145fP r2 = this.A0T;
            r2.A00 = this.A0h.getId();
            r2.A02(0);
            this.A0h.close();
            r2.A00();
        }
        this.A0Y.A0O.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r6 == 180) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        if (r6 == 180) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        r1 = r1 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        if (r6 == 90) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a9, code lost:
        r2 = -r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        r2 = (float) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
        if (r6 == 270) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ba, code lost:
        r2 = r2 - r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D() {
        /*
            r13 = this;
            X.5vQ r1 = r13.A0F
            if (r1 == 0) goto L_0x00c6
            X.5vQ r0 = r13.A0G
            if (r0 == 0) goto L_0x00c6
            android.graphics.Rect r0 = r13.A05
            if (r0 == 0) goto L_0x00c6
            int r2 = r1.A02
            int r1 = r1.A01
            int r10 = r0.width()
            android.graphics.Rect r0 = r13.A05
            int r3 = r0.height()
            int r6 = r13.A0A()
            X.5vQ r0 = r13.A0F
            X.5vQ r11 = r13.A0G
            int r9 = r0.A02
            int r7 = r0.A01
            int r8 = r9 - r7
            int r5 = r11.A02
            int r4 = r11.A01
            int r0 = r5 - r4
            int r8 = r8 * r0
            if (r8 >= 0) goto L_0x0036
            X.5vQ r11 = new X.5vQ
            r11.<init>(r4, r5)
        L_0x0036:
            float r8 = (float) r9
            int r0 = r11.A01
            float r5 = (float) r0
            int r0 = r11.A02
            float r4 = (float) r0
            float r0 = r5 / r4
            float r8 = r8 * r0
            int r0 = (int) r8
            if (r0 > r7) goto L_0x00bc
            X.5vQ r4 = new X.5vQ
            r4.<init>(r9, r0)
        L_0x0048:
            int r0 = r4.A02
            int r0 = r2 - r0
            int r8 = r0 >> 1
            int r0 = r4.A01
            int r0 = r1 - r0
            int r7 = r0 >> 1
            int r4 = r13.A00
            r0 = 1
            r9 = 180(0xb4, float:2.52E-43)
            r11 = 270(0x10e, float:3.78E-43)
            r12 = 90
            if (r4 != r0) goto L_0x0089
            if (r6 == r12) goto L_0x00ac
            if (r6 == r11) goto L_0x00ac
            float r5 = (float) r2
            float r0 = (float) r10
            float r5 = r5 / r0
            int r0 = -r1
            float r4 = (float) r0
            float r0 = (float) r3
            float r4 = r4 / r0
            int r2 = r2 - r8
            if (r6 == r9) goto L_0x006e
            int r2 = -r8
        L_0x006e:
            float r3 = (float) r2
            if (r6 != r9) goto L_0x009a
        L_0x0071:
            int r1 = -r7
        L_0x0072:
            float r2 = (float) r1
        L_0x0073:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r13.A03 = r1
            float r0 = (float) r6
            r1.postRotate(r0)
            android.graphics.Matrix r0 = r13.A03
            r0.postScale(r5, r4)
            android.graphics.Matrix r0 = r13.A03
            r0.postTranslate(r3, r2)
            return
        L_0x0089:
            if (r6 == r12) goto L_0x009c
            if (r6 == r11) goto L_0x009c
            float r5 = (float) r2
            float r0 = (float) r10
            float r5 = r5 / r0
            float r4 = (float) r1
            float r0 = (float) r3
            float r4 = r4 / r0
            int r2 = r2 - r8
            if (r6 == r9) goto L_0x0097
            int r2 = -r8
        L_0x0097:
            float r3 = (float) r2
            if (r6 != r9) goto L_0x0071
        L_0x009a:
            int r1 = r1 - r7
            goto L_0x0072
        L_0x009c:
            float r5 = (float) r1
            float r0 = (float) r3
            float r5 = r5 / r0
            float r4 = (float) r2
            float r0 = (float) r10
            float r4 = r4 / r0
            int r1 = r1 - r7
            if (r6 == r12) goto L_0x00a6
            int r1 = -r7
        L_0x00a6:
            float r3 = (float) r1
            if (r6 != r12) goto L_0x00ba
        L_0x00a9:
            int r2 = -r8
        L_0x00aa:
            float r2 = (float) r2
            goto L_0x0073
        L_0x00ac:
            int r0 = -r1
            float r5 = (float) r0
            float r0 = (float) r3
            float r5 = r5 / r0
            float r4 = (float) r2
            float r0 = (float) r10
            float r4 = r4 / r0
            int r1 = r1 - r7
            if (r6 == r11) goto L_0x00b7
            int r1 = -r7
        L_0x00b7:
            float r3 = (float) r1
            if (r6 != r11) goto L_0x00a9
        L_0x00ba:
            int r2 = r2 - r8
            goto L_0x00aa
        L_0x00bc:
            float r0 = (float) r7
            float r4 = r4 / r5
            float r0 = r0 * r4
            int r0 = (int) r0
            X.5vQ r4 = new X.5vQ
            r4.<init>(r0, r7)
            goto L_0x0048
        L_0x00c6:
            java.lang.String r0 = "Method updateDriverToPreviewMatrix() invoked without proper initialisation."
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5zD.A0D():void");
    }

    public final void A0E(boolean z2) {
        AnonymousClass5xW r3;
        C119355wx r5 = this.A0d;
        r5.A06("Method stopCameraPreview() must run on the Optic Background Thread.");
        synchronized (AnonymousClass5xW.A0S) {
            r3 = this.A0Y;
            r3.A0D(z2);
            synchronized (this.A0e) {
                FutureTask futureTask = this.A0I;
                if (futureTask != null) {
                    r5.A08(futureTask);
                    this.A0I = null;
                }
            }
            this.A0j = null;
            this.A06 = null;
            this.A0G = null;
            this.A0X.A0G = false;
        }
        if (!r3.A0M.A00.isEmpty()) {
            AnonymousClass5xT.A00(new AnonymousClass63V(r3));
        }
    }

    public final boolean A0F() {
        AnonymousClass5xM r0 = this.A08;
        return r0 != null && (r0.A08.A00.isEmpty() ^ true);
    }

    public void A4d(AnonymousClass688 r4) {
        if (r4 == null) {
            throw AnonymousClass000.A0T("Cannot add null OnPreviewFrameListener.");
        } else if (this.A08 != null) {
            boolean z2 = !A0F();
            boolean A012 = this.A08.A08.A01(r4);
            if (z2 && A012) {
                this.A0d.A07("restart_preview_to_resume_cpu_frames", new C1218166y(this));
            }
        }
    }

    public void A4e(C117815tb r2) {
        if (r2 != null) {
            this.A0Y.A0L.A01(r2);
            return;
        }
        throw AnonymousClass000.A0T("Cannot add null OnPreviewStartedListener.");
    }

    public void A6Z(C118595uw r10, C118715v8 r11, C1223469f r12, C1219467r r13, C1219567s r14, String str, int i2, int i3) {
        AnonymousClass5xH.A00();
        if (this.A0J) {
            this.A0H = this.A0c.A00(this.A0d.A00, str);
        }
        this.A0d.A00(r10, "connect", new IDxCallableShape0S0302000_3_I1(r11, this, r12, i2, i3, 1));
    }

    public boolean A81(C118595uw r4) {
        AnonymousClass5xH.A00();
        AnonymousClass5xW r1 = this.A0Y;
        r1.A0L.A00();
        r1.A0M.A00();
        AnonymousClass5xM r0 = this.A08;
        if (r0 != null) {
            r0.A08.A00();
            this.A08 = null;
        }
        this.A0b.A00();
        C119335wv r02 = this.A09;
        if (r02 != null) {
            r02.A0E.A00();
        }
        this.A0W.A01.clear();
        this.A0m = false;
        if (this.A0J) {
            this.A0c.A02(this.A0H);
            this.A0H = null;
        }
        this.A0d.A00(r4, "disconnect", new IDxCallableShape150S0100000_3_I1(this, 9));
        return true;
    }

    public void A99(int i2, int i3) {
        Rect rect = new Rect(i2, i3, i2, i3);
        int i4 = -this.A0L;
        rect.inset(i4, i4);
        this.A0d.A00(new IDxSCallbackShape43S0100000_3_I1(this, 7), "focus", new AnonymousClass672(rect, this));
    }

    public int AAP() {
        return this.A00;
    }

    public AnonymousClass5wJ AAT() {
        AnonymousClass5wJ r0;
        if (isConnected() && (r0 = this.A0E) != null) {
            return r0;
        }
        throw new AnonymousClass67L("Cannot get camera capabilities");
    }

    public int AFv(int i2) {
        return (this.A0h == null || i2 != this.A00) ? this.A0U.A01(i2) : this.A02;
    }

    public boolean AHT(int i2) {
        try {
            return this.A0U.A06(i2) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public void AIG(Matrix matrix, int i2, int i3, int i4) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) i2, (float) i3);
        matrix.mapRect(rectF);
        Rect rect = this.A05;
        if (rect == null) {
            rect = (Rect) AnonymousClass5x4.A01(this.A0N, this.A0U.A06(i4)).get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        }
        RectF rectF2 = new RectF(rect);
        int A0A2 = A0A();
        if (A0A2 == 90 || A0A2 == 270) {
            rectF2.set((float) rect.left, (float) rect.top, (float) rect.bottom, (float) rect.right);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f2 = 1.0f;
        if (this.A00 == 1) {
            f2 = -1.0f;
        }
        matrix2.postScale(f2, 1.0f, rectF2.width() / 2.0f, 0.0f);
        int abs = Math.abs(A0A2 / 90);
        Matrix matrix3 = new Matrix();
        for (int i5 = 0; i5 < abs; i5++) {
            Matrix matrix4 = new Matrix();
            float width = rectF2.width() / 2.0f;
            matrix4.setRotate(-90.0f, width, width);
            matrix4.mapRect(rectF2);
            matrix3.postConcat(matrix4);
        }
        matrix2.postConcat(matrix3);
        this.A04 = matrix2;
    }

    public boolean AJa() {
        return this.A0Z.A0D;
    }

    public boolean AJj() {
        return AHT(0) && AHT(1);
    }

    public boolean AKb(float[] fArr) {
        Matrix matrix = this.A04;
        if (matrix == null) {
            return false;
        }
        matrix.mapPoints(fArr);
        return true;
    }

    public void ALa(C118595uw r4, C117775tX r5) {
        this.A0d.A00(r4, "modify_settings_on_background_thread", new AnonymousClass671(this, r5));
    }

    public void AUH(int i2) {
        this.A0g = i2;
        AnonymousClass5zQ r1 = this.A0i;
        if (r1 != null) {
            r1.A00 = this.A0g;
        }
    }

    public void Abz(AnonymousClass688 r7) {
        AnonymousClass5xM r0;
        if (r7 != null && (r0 = this.A08) != null && r0.A08.A02(r7) && !A0F()) {
            synchronized (this.A0e) {
                C119355wx r4 = this.A0d;
                r4.A08(this.A0I);
                this.A0I = r4.A02("restart_preview_if_to_stop_cpu_frames", this.A0f, 200);
            }
        }
    }

    public void Ac0(C117815tb r2) {
        if (r2 != null) {
            this.A0Y.A0L.A02(r2);
        }
    }

    public void Adf(Handler handler) {
        this.A0d.A00 = handler;
    }

    public void Adx(AnonymousClass687 r2) {
        this.A0V.A02 = r2;
    }

    public void AeD(C115745qF r3) {
        C118945vf r0 = this.A0c;
        synchronized (r0.A02) {
            r0.A00 = r3;
        }
    }

    public void AeP(C118595uw r4, int i2) {
        this.A01 = i2;
        this.A0d.A00(r4, "set_rotation", new IDxCallableShape150S0100000_3_I1(this, 11));
    }

    public void Af5(C118595uw r5, int i2) {
        this.A0d.A00((C118595uw) null, "set_zoom_level", new AnonymousClass673(this, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r4 == 180) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Af7(android.graphics.Matrix r7, int r8, int r9, int r10, int r11, boolean r12) {
        /*
            r6 = this;
            X.5vQ r0 = r6.A0F
            if (r0 == 0) goto L_0x007c
            r7.reset()
            float r1 = (float) r8
            float r0 = (float) r9
            r5 = 0
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r5, r5, r1, r0)
            int r4 = r6.A02
            if (r4 == 0) goto L_0x0019
            r2 = 180(0xb4, float:2.52E-43)
            float r1 = (float) r11
            float r0 = (float) r10
            if (r4 != r2) goto L_0x001b
        L_0x0019:
            float r1 = (float) r10
            float r0 = (float) r11
        L_0x001b:
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r5, r5, r1, r0)
            float r5 = r3.centerX()
            float r4 = r3.centerY()
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x0061
            float r0 = r2.centerX()
            float r1 = r5 - r0
            float r0 = r2.centerY()
            float r0 = r4 - r0
            r2.offset(r1, r0)
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.FILL
            r7.setRectToRect(r3, r2, r0)
            int r0 = java.lang.Math.max(r8, r9)
            float r2 = (float) r0
            int r0 = java.lang.Math.max(r10, r11)
            float r0 = (float) r0
            float r2 = r2 / r0
            int r0 = java.lang.Math.min(r8, r9)
            float r1 = (float) r0
            int r0 = java.lang.Math.min(r10, r11)
            float r0 = (float) r0
            float r1 = r1 / r0
            if (r12 == 0) goto L_0x0077
            float r0 = java.lang.Math.max(r2, r1)
        L_0x005e:
            r7.postScale(r0, r0, r5, r4)
        L_0x0061:
            int r3 = r6.A01
            r2 = 2
            r1 = 1
            if (r3 == r1) goto L_0x0072
            r0 = 3
            if (r3 == r0) goto L_0x0072
            if (r3 != r2) goto L_0x0071
            r0 = 1127481344(0x43340000, float:180.0)
        L_0x006e:
            r7.postRotate(r0, r5, r4)
        L_0x0071:
            return r1
        L_0x0072:
            int r3 = r3 - r2
            int r0 = r3 * 90
            float r0 = (float) r0
            goto L_0x006e
        L_0x0077:
            float r0 = java.lang.Math.min(r2, r1)
            goto L_0x005e
        L_0x007c:
            java.lang.String r0 = "Camera params need to be configured before invoking setupViewTransformMatrix()"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5zD.Af7(android.graphics.Matrix, int, int, int, int, boolean):boolean");
    }

    public void AgH(C118595uw r11, File file) {
        C119325wu r0 = this.A0Z;
        String absolutePath = file.getAbsolutePath();
        int i2 = this.A00;
        int i3 = this.A0g;
        AnonymousClass5zQ r2 = this.A0i;
        AnonymousClass69J r4 = this.A0O;
        C118595uw r3 = r11;
        r0.A05(this.A06, r2, r3, r4, this.A0j, absolutePath, i2, i3, A0F());
    }

    public void AgQ(C118595uw r4, boolean z2) {
        C119325wu r2 = this.A0Z;
        CaptureRequest.Builder builder = this.A06;
        A0F();
        r2.A06(builder, r4, this.A0j);
    }

    public void Agb(C118595uw r4) {
        AnonymousClass5xH.A00();
        this.A0d.A00(r4, "switch_camera", new IDxCallableShape150S0100000_3_I1(this, 10));
    }

    public void Agd(C118645v1 r16, AnonymousClass5wQ r17) {
        C119305ws r4 = this.A0X;
        CameraManager cameraManager = this.A0N;
        int i2 = this.A00;
        int i3 = (((this.A0g + 45) / 90) * 90) % 360;
        int i4 = this.A00;
        int i5 = this.A02;
        int i6 = i4 == 1 ? (i5 - i3) + 360 : i5 + i3;
        int A0A2 = A0A();
        C118645v1 r7 = r16;
        r4.A03(cameraManager, this.A06, r7, this.A0j, this.A0A, r17, i2, i6 % 360, A0A2, A0F());
    }

    public int getZoomLevel() {
        C119335wv r0 = this.A09;
        if (r0 == null) {
            return -1;
        }
        return r0.A02();
    }

    public boolean isConnected() {
        return this.A0h != null && this.A0n;
    }
}
