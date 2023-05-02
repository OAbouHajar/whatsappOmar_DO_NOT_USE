package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.SurfaceHolder;
import com.facebook.optic.IDxSCallbackShape43S0100000_3_I1;
import com.facebook.optic.IDxSCallbackShape9S0200000_3_I1;
import com.facebook.redex.IDxCallableShape0S0302000_3_I1;
import com.facebook.redex.IDxCallableShape150S0100000_3_I1;
import com.facebook.redex.IDxCallableShape47S0200000_3_I1;
import com.facebook.redex.IDxCallableShape9S0101000_3_I1;
import com.facebook.redex.IDxFListenerShape353S0100000_3_I1;
import java.io.File;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.5zC  reason: invalid class name */
public class AnonymousClass5zC implements C1223369e {
    public static final Camera.ShutterCallback A0g = new AnonymousClass5yN();
    public static volatile AnonymousClass5zC A0h;
    public int A00;
    public int A01;
    public int A02;
    public Matrix A03;
    public C118715v8 A04;
    public C115755qG A05;
    public C1223469f A06;
    public C119235wl A07;
    public C1221768o A08;
    public UUID A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final Camera.ErrorCallback A0F = new AnonymousClass5yH(this);
    public final Camera.FaceDetectionListener A0G = new AnonymousClass5yI(this);
    public final AnonymousClass688 A0H = new IDxFListenerShape353S0100000_3_I1(this, 1);
    public final AnonymousClass69J A0I = new AnonymousClass5zE(this);
    public final C119245wm A0J;
    public final C118525up A0K;
    public final C118215uK A0L;
    public final AnonymousClass5vW A0M;
    public final C117825tc A0N = new C117825tc();
    public final AnonymousClass5yJ A0O;
    public final C118855vM A0P = new C118855vM();
    public final C118855vM A0Q = new C118855vM();
    public final AnonymousClass5vU A0R;
    public final C118945vf A0S;
    public final C119355wx A0T;
    public final AtomicBoolean A0U = new AtomicBoolean(false);
    public final AtomicBoolean A0V = new AtomicBoolean(false);
    public final AtomicBoolean A0W = new AtomicBoolean(false);
    public volatile int A0X;
    public volatile Camera A0Y;
    public volatile AnonymousClass5zQ A0Z;
    public volatile C115075p4 A0a;
    public volatile FutureTask A0b;
    public volatile boolean A0c;
    public volatile boolean A0d;
    public volatile boolean A0e;
    public volatile boolean A0f;

    public AnonymousClass5zC(Context context) {
        C119355wx r2 = new C119355wx();
        this.A0T = r2;
        C118945vf r1 = new C118945vf(r2);
        this.A0S = r1;
        C119245wm r0 = new C119245wm(r1, r2);
        this.A0J = r0;
        AnonymousClass5vU r12 = new AnonymousClass5vU(r0);
        this.A0R = r12;
        this.A0L = new C118215uK();
        this.A0O = new AnonymousClass5yJ(r12, r2);
        this.A0K = new C118525up(r12, r2);
        this.A0E = Math.round(TypedValue.applyDimension(1, 30.0f, AnonymousClass000.A0M(context)));
        this.A0M = new AnonymousClass5vW();
    }

    public static /* synthetic */ C116965sE A00(C118715v8 r20, AnonymousClass5zC r21, C1223469f r22, int i2) {
        List A012;
        List list;
        List list2;
        int i3;
        C116955sD r1;
        AnonymousClass5xT.A01("initialiseCamera should not run on the UI thread");
        C118715v8 r4 = r20;
        if (r20 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AnonymousClass5zC r10 = r21;
            if (r10.A0Y != null) {
                AtomicBoolean atomicBoolean = r10.A0U;
                C1223469f r2 = r22;
                int i4 = i2;
                if (!atomicBoolean.get() || !r4.equals(r10.A04) || r10.A0Z != r4.A02 || r10.A01 != i4 || AnonymousClass000.A1X(r2.A9Z(C1223469f.A0D))) {
                    r10.A06 = r2;
                    r10.A04 = r4;
                    AnonymousClass5zQ r8 = r4.A02;
                    r10.A0Z = r8;
                    r10.A0L.A00(false, r10.A0Y);
                    AnonymousClass5zK r0 = (AnonymousClass5zK) r10.A06;
                    C114885ol r13 = r0.A02;
                    C114885ol r12 = r0.A03;
                    int i5 = r4.A01;
                    int i6 = r4.A00;
                    AnonymousClass5xU r42 = r0.A00;
                    C117785tY r3 = r0.A01;
                    r10.A0D = AnonymousClass000.A1X(r2.A9Z(C1223469f.A09));
                    r10.A01 = i4;
                    int A042 = r10.A04(i4);
                    AnonymousClass5vU r14 = r10.A0R;
                    AnonymousClass5wJ A013 = r14.A01(r10.A00);
                    C114885ol r02 = C114885ol.A01;
                    boolean equals = r12.equals(r02);
                    boolean equals2 = r13.equals(r02);
                    if (!equals) {
                        if (!equals2) {
                            list = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0n, A013);
                            list2 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0u, A013);
                            A012 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0r, A013);
                        } else {
                            list2 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0u, A013);
                            A012 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0r, A013);
                            list = null;
                        }
                    } else if (!equals2) {
                        list = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0n, A013);
                        A012 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0r, A013);
                        list2 = null;
                    } else {
                        A012 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0r, A013);
                        list = null;
                        list2 = null;
                    }
                    C116945sC A043 = r42.A04(list, list2, A012, i5, i6);
                    C111205fV A002 = r14.A00(r10.A00);
                    AnonymousClass5vQ r43 = A043.A00;
                    if (r43 != null) {
                        C115845qP.A02(AnonymousClass5wI.A0g, A002, r43);
                    }
                    AnonymousClass5vQ r03 = A043.A01;
                    C115835qO r11 = AnonymousClass5wI.A0m;
                    C115845qP.A02(r11, A002, r03);
                    AnonymousClass5vQ r44 = A043.A02;
                    if (r44 != null) {
                        C115845qP.A02(AnonymousClass5wI.A0s, A002, r44);
                    }
                    A002.A03();
                    A002.A00.A01(AnonymousClass5wI.A00, C13680ns.A0a());
                    A002.A00.A01(AnonymousClass5wI.A0t, C13680ns.A0Y());
                    A002.A00.A01(AnonymousClass5wI.A0j, r3.A00(AnonymousClass5wJ.A01(AnonymousClass5wJ.A0p, A002.A00)));
                    A002.A00.A01(AnonymousClass5wI.A0o, 0);
                    int i7 = r10.A00;
                    AnonymousClass5wJ A014 = r14.A01(i7);
                    A002.A02();
                    AnonymousClass5vW r32 = r10.A0M;
                    r32.A01(r10.A0Y);
                    AnonymousClass5wI A022 = r14.A02(i7);
                    AnonymousClass5vQ r04 = (AnonymousClass5vQ) A022.A05(r11);
                    int i8 = r04.A02;
                    int i9 = r04.A01;
                    C115835qO r7 = AnonymousClass5wI.A0i;
                    ((Number) A022.A05(r7)).intValue();
                    r10.A0J.A01(i7);
                    int i10 = r10.A0X;
                    int i11 = r10.A01;
                    if (i11 == 1) {
                        i3 = 90;
                    } else if (i11 != 2) {
                        i3 = 270;
                        if (i11 != 3) {
                            i3 = 0;
                        }
                    } else {
                        i3 = 180;
                    }
                    SurfaceTexture A003 = r8.A00(i8, i9, i10, i3);
                    if (A003 != null) {
                        r10.A0Y.setPreviewTexture(A003);
                    } else {
                        r10.A0Y.setPreviewDisplay((SurfaceHolder) null);
                    }
                    boolean z2 = AnonymousClass5zQ.A0C;
                    Camera camera = r10.A0Y;
                    if (z2) {
                        camera.setDisplayOrientation(r10.A04(0));
                    } else {
                        camera.setDisplayOrientation(A042);
                    }
                    r10.A0B = AnonymousClass5wJ.A02(AnonymousClass5wJ.A0S, A014);
                    atomicBoolean.set(true);
                    r10.A0V.set(false);
                    r10.A0f = AnonymousClass5wJ.A02(AnonymousClass5wJ.A0W, A014);
                    AnonymousClass5yJ r23 = r10.A0O;
                    Camera camera2 = r10.A0Y;
                    int i12 = r10.A00;
                    r23.A03 = camera2;
                    r23.A00 = i12;
                    AnonymousClass5vU r82 = r23.A06;
                    AnonymousClass5wJ A015 = r82.A01(i12);
                    r23.A0A = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0x, A015);
                    r23.A0E = AnonymousClass5wJ.A02(AnonymousClass5wJ.A0V, A015);
                    r23.A09 = AnonymousClass5wI.A02(AnonymousClass5wI.A0v, r82.A02(i12));
                    r23.A01 = AnonymousClass000.A0D(r82.A01(i12).A03(AnonymousClass5wJ.A0a));
                    r23.A03.setZoomChangeListener(r23);
                    r23.A0B = true;
                    C118525up r9 = r10.A0K;
                    Camera camera3 = r10.A0Y;
                    int i13 = r10.A00;
                    r9.A06.A06("The FocusController must be prepared on the Optic thread.");
                    r9.A01 = camera3;
                    r9.A00 = i13;
                    r9.A09 = true;
                    r9.A08 = false;
                    r9.A07 = false;
                    r9.A04 = true;
                    r9.A0A = false;
                    r10.A0A(i8, i9);
                    r32.A02(r10.A0Y, (AnonymousClass5vQ) A022.A05(r11), AnonymousClass5wI.A02(r7, A022));
                    r10.A07();
                    C119125wa.A00().A01 = 0;
                    StringBuilder A0r = AnonymousClass000.A0r("time to setPreviewSurfaceTexture:");
                    A0r.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    Log.d("Camera1Device", AnonymousClass000.A0h("ms", A0r));
                    r1 = new C116955sD(A014, A022, i7);
                } else {
                    if (r10.A0L.A00.A01()) {
                        r10.A07();
                    }
                    r1 = new C116955sD(r10.AAT(), r10.A05(), r10.A00);
                }
                return new C116965sE(r1);
            }
            throw AnonymousClass000.A0a("Can't connect to the camera service.");
        }
        throw AnonymousClass000.A0T("StartupConfiguration cannot be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r9.A00(X.C119185wg.A0Q) != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r9.A00(X.C119185wg.A0d) != null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A01(X.C118645v1 r6, X.AnonymousClass5zC r7, X.AnonymousClass5wQ r8, X.C118835vK r9, X.C119185wg r10) {
        /*
            boolean r0 = X.C119015vm.A00()
            r5 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0031
            X.5qT r0 = X.C119185wg.A0U
            java.lang.Object r0 = r9.A00(r0)
            if (r0 != 0) goto L_0x0031
            X.5qT r0 = X.C119185wg.A0b
            java.lang.Object r0 = r9.A00(r0)
            if (r0 != 0) goto L_0x0031
            X.5qT r0 = X.C119185wg.A0P
            java.lang.Object r0 = r9.A00(r0)
            if (r0 != 0) goto L_0x0031
            X.5qT r0 = X.C119185wg.A0W
            java.lang.Object r0 = r9.A00(r0)
            if (r0 != 0) goto L_0x0031
            X.5qT r0 = X.C119185wg.A0Q
            java.lang.Object r0 = r9.A00(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            X.5qR r0 = X.AnonymousClass5wQ.A03
            java.lang.Object r0 = r8.A00(r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0047
            X.5qT r0 = X.C119185wg.A0d
            java.lang.Object r0 = r9.A00(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            X.5qT r1 = X.C119185wg.A0Z
            java.lang.Object r0 = r9.A00(r1)
            if (r0 != 0) goto L_0x0188
            if (r10 == 0) goto L_0x0189
            X.5qS r0 = X.C119185wg.A0N
            android.graphics.Rect r0 = r10.A03
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r9.A01 = r0
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r10.A00(r1)
            byte[] r0 = (byte[]) r0
            r9.A0G = r0
        L_0x0068:
            X.5qT r1 = X.C119185wg.A0d
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r10.A00(r1)
            byte[] r0 = (byte[]) r0
            r9.A0H = r0
        L_0x0078:
            X.5qT r1 = X.C119185wg.A0a
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r10.A00(r1)
            X.5va r0 = (X.C118895va) r0
            r9.A03 = r0
        L_0x0088:
            X.5qT r1 = X.C119185wg.A0f
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r10.A00(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r9.A02 = r0
        L_0x0098:
            X.5qT r1 = X.C119185wg.A0U
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r10.A00(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            r9.A0E = r0
        L_0x00a8:
            X.5qT r1 = X.C119185wg.A0b
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r10.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0A = r0
        L_0x00b8:
            X.5qT r1 = X.C119185wg.A0P
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r0 = r10.A00(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            r9.A06 = r0
        L_0x00c8:
            X.5qT r1 = X.C119185wg.A0Q
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r0 = r10.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A08 = r0
        L_0x00d8:
            X.5qT r1 = X.C119185wg.A0W
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r10.A00(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            r9.A07 = r0
        L_0x00e8:
            X.5qT r1 = X.C119185wg.A0X
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r0 = r10.A00(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            r9.A0F = r0
        L_0x00f8:
            X.5qT r1 = X.C119185wg.A0S
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x0103
            r10.A00(r1)
        L_0x0103:
            X.5qT r1 = X.C119185wg.A0R
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r10.A00(r1)
            X.5wg r0 = (X.C119185wg) r0
            r9.A04 = r0
        L_0x0113:
            X.5qT r1 = X.C119185wg.A0c
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x0123
            java.lang.Object r0 = r10.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0B = r0
        L_0x0123:
            X.5qT r1 = X.C119185wg.A0g
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r10.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0D = r0
        L_0x0133:
            X.5qT r1 = X.C119185wg.A0T
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x0143
            java.lang.Object r0 = r10.A00(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r9.A05 = r0
        L_0x0143:
            X.5qT r1 = X.C119185wg.A0e
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x0153
            java.lang.Object r0 = r10.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0C = r0
        L_0x0153:
            X.5qT r1 = X.C119185wg.A0V
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x0163
            java.lang.Object r0 = r10.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A09 = r0
        L_0x0163:
            X.5qT r1 = X.C119185wg.A0Y
            java.lang.Object r0 = r10.A00(r1)
            if (r0 == 0) goto L_0x0173
            java.lang.Object r0 = r10.A00(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r9.A00 = r0
        L_0x0173:
            if (r3 != 0) goto L_0x0187
            if (r2 != 0) goto L_0x0187
            if (r4 != 0) goto L_0x0187
            X.5wx r2 = r7.A0T
            X.5vf r0 = r7.A0S
            java.util.UUID r1 = r0.A03
            X.66C r0 = new X.66C
            r0.<init>(r6, r7, r9)
            r2.A05(r0, r1)
        L_0x0187:
            return
        L_0x0188:
            r5 = 0
        L_0x0189:
            r4 = r5
            goto L_0x0173
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5zC.A01(X.5v1, X.5zC, X.5wQ, X.5vK, X.5wg):void");
    }

    public static /* synthetic */ void A02(AnonymousClass5zC r4) {
        try {
            if (r4.A0e) {
                r4.A08();
            }
        } catch (RuntimeException e2) {
            Log.e("Camera1Device", "Stop video recording failed, likely due to nothing being captured", e2);
        } catch (Throwable th) {
            if (r4.A0Y != null) {
                r4.A06();
                r4.A0M.A00();
            }
            if (r4.A0Z != null) {
                r4.A0Z.A01();
            }
            r4.A0Z = null;
            r4.A04 = null;
            throw th;
        }
        if (r4.A0Y != null) {
            r4.A06();
            r4.A0M.A00();
        }
        if (r4.A0Z != null) {
            r4.A0Z.A01();
        }
        r4.A0Z = null;
        r4.A04 = null;
    }

    public static /* synthetic */ void A03(AnonymousClass5zC r5, C1223469f r6, int i2) {
        String str;
        C111155fQ r52;
        SparseArray sparseArray;
        AnonymousClass5xT.A01("Should not check for open camera on the UI thread.");
        if (r5.A0Y == null || r5.A00 != i2) {
            r5.A06();
            C119125wa.A00().A00 = SystemClock.elapsedRealtime();
            r5.A0Y = (Camera) r5.A0T.A03("open_camera_on_camera_handler_thread", new IDxCallableShape9S0101000_3_I1(r5, r5.A0J.A02(i2), 0));
            if (r5.A0Y != null) {
                r5.A00 = i2;
                r5.A0Y.setErrorCallback(r5.A0F);
                AnonymousClass5vU r2 = r5.A0R;
                Camera camera = r5.A0Y;
                if (camera != null) {
                    int A022 = r2.A03.A02(i2);
                    Camera.Parameters parameters = camera.getParameters();
                    if (r6 == null || !AnonymousClass000.A1X(r6.A9Z(C1223469f.A00))) {
                        r52 = new C111155fQ(parameters);
                        sparseArray = r2.A00;
                    } else {
                        sparseArray = r2.A00;
                        r52 = (C111155fQ) sparseArray.get(A022);
                        if (r52 == null) {
                            r52 = new C111155fQ(parameters);
                        }
                        C111175fS r62 = new C111175fS(parameters, r52);
                        r2.A01.put(A022, r62);
                        r2.A02.put(A022, new C111205fV(parameters, camera, r52, r62, i2));
                        return;
                    }
                    sparseArray.put(A022, r52);
                    C111175fS r622 = new C111175fS(parameters, r52);
                    r2.A01.put(A022, r622);
                    r2.A02.put(A022, new C111205fV(parameters, camera, r52, r622, i2));
                    return;
                }
                str = "camera is null!";
            } else {
                str = String.valueOf("Camera is null.");
            }
            throw AnonymousClass000.A0W(str);
        }
    }

    public final int A04(int i2) {
        int i3;
        int i4 = this.A00;
        int A012 = this.A0J.A01(i4);
        if (i2 == 1) {
            i3 = 90;
        } else if (i2 != 2) {
            i3 = 270;
            if (i2 != 3) {
                i3 = 0;
            }
        } else {
            i3 = 180;
        }
        return (i4 == 1 ? 360 - ((A012 + i3) % 360) : (A012 - i3) + 360) % 360;
    }

    public AnonymousClass5wI A05() {
        if (isConnected()) {
            return this.A0R.A02(this.A00);
        }
        throw new AnonymousClass67L("Cannot get camera settings");
    }

    public final void A06() {
        if (this.A0Y != null) {
            A09();
            this.A0U.set(false);
            this.A0V.set(false);
            Camera camera = this.A0Y;
            this.A0Y = null;
            AnonymousClass5yJ r2 = this.A0O;
            if (r2.A0B) {
                Handler handler = r2.A04;
                handler.removeMessages(1);
                handler.removeMessages(2);
                r2.A0A = null;
                r2.A03.setZoomChangeListener((Camera.OnZoomChangeListener) null);
                r2.A03 = null;
                r2.A0B = false;
            }
            C118525up r22 = this.A0K;
            r22.A06.A06("The FocusController must be released on the Optic thread.");
            r22.A09 = false;
            r22.A01 = null;
            r22.A08 = false;
            r22.A07 = false;
            this.A0f = false;
            AnonymousClass5vU r0 = this.A0R;
            r0.A02.remove(r0.A03.A02(this.A00));
            this.A0T.A03("close_camera_on_camera_handler_thread", new IDxCallableShape47S0200000_3_I1(camera, 1, this));
        }
    }

    public final void A07() {
        if (isConnected()) {
            A4d(this.A0H);
            C118215uK r0 = this.A0L;
            Camera camera = this.A0Y;
            C118655v2 r3 = r0.A00;
            ReentrantLock reentrantLock = r3.A01;
            reentrantLock.lock();
            if (camera != null) {
                try {
                    if (!r3.A00()) {
                        reentrantLock.lock();
                        boolean z2 = true;
                        if ((r3.A00 & 1) != 1) {
                            z2 = false;
                        }
                        reentrantLock.unlock();
                        if (!z2) {
                            reentrantLock.lock();
                            if (r3.A01()) {
                                r3.A00 = 1;
                                reentrantLock.unlock();
                                AnonymousClass5xH.A00();
                                camera.startPreview();
                            } else {
                                throw AnonymousClass000.A0V("Cannot progress to STARTING, not in STOPPED state");
                            }
                        }
                    }
                } catch (Throwable th) {
                    AnonymousClass5xH.A00();
                    reentrantLock.unlock();
                    throw th;
                }
            }
            AnonymousClass5xH.A00();
            reentrantLock.unlock();
        }
    }

    public final void A08() {
        try {
            C1221768o r0 = this.A08;
            if (r0 != null) {
                r0.AgP();
                this.A08 = null;
            }
        } finally {
            A0B((MediaRecorder) null);
            this.A0e = false;
        }
    }

    public final synchronized void A09() {
        FutureTask futureTask = this.A0b;
        if (futureTask != null) {
            this.A0T.A08(futureTask);
            this.A0b = null;
        }
    }

    public final void A0A(int i2, int i3) {
        Matrix matrix;
        float f2;
        float f3;
        float f4;
        Matrix matrix2 = new Matrix();
        this.A03 = matrix2;
        float f5 = 1.0f;
        if (this.A00 == 1) {
            f5 = -1.0f;
        }
        matrix2.setScale(f5, 1.0f);
        int A042 = A04(this.A01);
        this.A03.postRotate((float) A042);
        if (A042 == 90 || A042 == 270) {
            matrix = this.A03;
            f2 = (float) i3;
            f3 = f2 / 2000.0f;
            f4 = (float) i2;
        } else {
            matrix = this.A03;
            f2 = (float) i2;
            f3 = f2 / 2000.0f;
            f4 = (float) i3;
        }
        matrix.postScale(f3, f4 / 2000.0f);
        this.A03.postTranslate(f2 / 2.0f, f4 / 2.0f);
    }

    public void A0B(MediaRecorder mediaRecorder) {
        Camera camera = this.A0Y;
        if (camera != null) {
            AnonymousClass5vU r1 = this.A0R;
            boolean z2 = this.A0A;
            int i2 = this.A02;
            if (mediaRecorder != null) {
                camera.unlock();
                mediaRecorder.setCamera(camera);
                mediaRecorder.setVideoSource(1);
                return;
            }
            camera.lock();
            C111205fV A002 = r1.A00(this.A00);
            C115845qP.A02(AnonymousClass5wI.A0A, A002, Integer.valueOf(i2));
            A002.A00.A01(AnonymousClass5wI.A0T, Boolean.valueOf(z2));
            A002.A03();
            A002.A02();
        }
    }

    public void A4d(AnonymousClass688 r7) {
        if (r7 != null) {
            AnonymousClass5vW r5 = this.A0M;
            synchronized (r5) {
                r5.A05.A01(r7);
            }
            C119355wx r2 = this.A0T;
            boolean A092 = r2.A09();
            boolean isConnected = isConnected();
            if (A092) {
                if (isConnected) {
                    Camera camera = this.A0Y;
                    AnonymousClass5vU r3 = this.A0R;
                    r5.A02(camera, (AnonymousClass5vQ) r3.A02(this.A00).A05(AnonymousClass5wI.A0m), AnonymousClass5wI.A02(AnonymousClass5wI.A0i, r3.A02(this.A00)));
                }
            } else if (isConnected) {
                r2.A07("enable_preview_frame_listeners", new IDxCallableShape150S0100000_3_I1(this, 1));
            }
        } else {
            throw AnonymousClass000.A0T("listener is required");
        }
    }

    public void A4e(C117815tb r4) {
        C1223469f r1 = this.A06;
        if (r1 == null || !AnonymousClass000.A1X(r1.A9Z(C1223469f.A0A))) {
            C118215uK r12 = this.A0L;
            if (r12.A00.A00()) {
                r4.A00();
            }
            r12.A01.A01(r4);
            return;
        }
        this.A0T.A07("add_on_preview_started_listener", new IDxCallableShape47S0200000_3_I1(r4, 2, this));
    }

    public void A6Z(C118595uw r10, C118715v8 r11, C1223469f r12, C1219467r r13, C1219567s r14, String str, int i2, int i3) {
        AnonymousClass5xH.A00();
        if (this.A0C) {
            this.A09 = this.A0S.A00(this.A0T.A00, str);
        }
        this.A0T.A00(r10, "connect", new IDxCallableShape0S0302000_3_I1(r11, this, r12, i2, i3, 0));
    }

    public boolean A81(C118595uw r4) {
        AnonymousClass5xH.A00();
        C117825tc.A00(this);
        if (this.A0C) {
            this.A0S.A02(this.A09);
            this.A09 = null;
        }
        this.A0T.A00(r4, "disconnect", new IDxCallableShape150S0100000_3_I1(this, 0));
        return true;
    }

    public void A99(int i2, int i3) {
        Rect rect = new Rect(i2, i3, i2, i3);
        int i4 = -this.A0E;
        rect.inset(i4, i4);
        this.A0T.A00(new IDxSCallbackShape43S0100000_3_I1(this, 5), "focus", new IDxCallableShape47S0200000_3_I1(rect, 4, this));
    }

    public int AAP() {
        return this.A00;
    }

    public AnonymousClass5wJ AAT() {
        if (isConnected()) {
            return this.A0R.A01(this.A00);
        }
        throw new AnonymousClass67L("Cannot get camera capabilities");
    }

    public int AFv(int i2) {
        return this.A0J.A01(i2);
    }

    public boolean AHT(int i2) {
        try {
            return this.A0J.A02(i2) != -1;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public void AIG(Matrix matrix, int i2, int i3, int i4) {
        C115755qG r1 = new C115755qG(matrix, i4, A04(this.A01), i2, i3);
        this.A05 = r1;
        this.A0K.A03 = r1;
    }

    public boolean AJa() {
        return this.A0e;
    }

    public boolean AJj() {
        return AHT(0) && AHT(1);
    }

    public boolean AKb(float[] fArr) {
        C115755qG r0 = this.A05;
        if (r0 == null) {
            return false;
        }
        r0.A00.mapPoints(fArr);
        return true;
    }

    public void ALa(C118595uw r4, C117775tX r5) {
        this.A0T.A00(r4, "modify_settings", new IDxCallableShape47S0200000_3_I1(r5, 0, this));
    }

    public void AUH(int i2) {
        this.A0X = i2;
        AnonymousClass5zQ r1 = this.A0Z;
        if (r1 != null) {
            r1.A00 = this.A0X;
        }
    }

    public void Abz(AnonymousClass688 r4) {
        if (r4 != null) {
            AnonymousClass5vW r1 = this.A0M;
            synchronized (r1) {
                r1.A07.remove(r4);
                r1.A05.A02(r4);
            }
            if (this.A0S.A04) {
                this.A0T.A07("disable_preview_frame_listeners", new IDxCallableShape150S0100000_3_I1(this, 2));
                return;
            }
            return;
        }
        throw AnonymousClass000.A0T("listener is required");
    }

    public void Ac0(C117815tb r4) {
        C1223469f r1 = this.A06;
        if (r1 == null || !AnonymousClass000.A1X(r1.A9Z(C1223469f.A0A))) {
            this.A0L.A01.A02(r4);
        } else {
            this.A0T.A07("remove_on_preview_started_listener", new IDxCallableShape47S0200000_3_I1(r4, 3, this));
        }
    }

    public void Adf(Handler handler) {
        this.A0T.A00 = handler;
    }

    public void Adx(AnonymousClass687 r2) {
        this.A0K.A02 = r2;
    }

    public void AeD(C115745qF r3) {
        C118945vf r0 = this.A0S;
        synchronized (r0.A02) {
            r0.A00 = r3;
        }
    }

    public void AeP(C118595uw r4, int i2) {
        this.A0T.A00(r4, "set_rotation", new IDxCallableShape9S0101000_3_I1(this, i2, 2));
    }

    public void Af5(C118595uw r5, int i2) {
        this.A0T.A00((C118595uw) null, "set_zoom_level", new IDxCallableShape9S0101000_3_I1(this, i2, 1));
    }

    public boolean Af7(Matrix matrix, int i2, int i3, int i4, int i5, boolean z2) {
        matrix.reset();
        float f2 = (float) i2;
        float f3 = (float) i3;
        float f4 = f2 / f3;
        int A042 = A04(this.A01);
        if (A042 == 90 || A042 == 270) {
            int i6 = i5;
            i5 = i4;
            i4 = i6;
        }
        float f5 = (float) i4;
        float f6 = (float) i5;
        int i7 = ((f5 / f6) > f4 ? 1 : ((f5 / f6) == f4 ? 0 : -1));
        float f7 = (!z2 ? i7 <= 0 : i7 > 0) ? f3 / f6 : f2 / f5;
        matrix.setScale((f5 / f2) * f7, (f6 / f3) * f7, (float) (i2 >> 1), (float) (i3 >> 1));
        return true;
    }

    public void AgH(C118595uw r6, File file) {
        String absolutePath = file.getAbsolutePath();
        if (absolutePath == null) {
            throw AnonymousClass000.A0T("Both videoPath and videoFileDescriptor cannot be null, one must contain a valid value");
        } else if (!isConnected()) {
            r6.A02(AnonymousClass000.A0a("Can't record video before it's initialised."));
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A0e = true;
            this.A0T.A00(new IDxSCallbackShape9S0200000_3_I1(r6, 1, this), "start_video", new AnonymousClass676(this, absolutePath, elapsedRealtime));
        }
    }

    public void AgQ(C118595uw r4, boolean z2) {
        if (!this.A0e) {
            r4.A02(AnonymousClass000.A0a("Not recording video"));
            return;
        }
        this.A0T.A00(r4, "stop_video_recording", new AnonymousClass670(this, SystemClock.elapsedRealtime()));
    }

    public void Agb(C118595uw r6) {
        if (((CountDownLatch) this.A0N.A00.get()).getCount() <= 0) {
            AnonymousClass5xH.A00();
            this.A0T.A00(r6, "switch_camera", new IDxCallableShape150S0100000_3_I1(this, 4));
        }
    }

    public void Agd(C118645v1 r7, AnonymousClass5wQ r8) {
        if (!isConnected()) {
            r7.A00(new AnonymousClass67L("Cannot take a photo"));
            return;
        }
        C117825tc r3 = this.A0N;
        if (((CountDownLatch) r3.A00.get()).getCount() > 0) {
            r7.A00(new C115015oy("Busy taking photo"));
        } else if (this.A0e && !this.A0B) {
            r7.A00(new C115015oy("Cannot take a photo while recording video"));
        } else if (r8.A00(AnonymousClass5wQ.A01) != null) {
            r7.A00(new UnsupportedOperationException("Burst capture not supported on camera1"));
        } else {
            C119125wa.A00().A03 = SystemClock.elapsedRealtime();
            AnonymousClass5wI.A04(A05());
            r3.A01(2);
            this.A0W.set(false);
            this.A0T.A00(new C111125fN(r7, this, r8), "take_photo", new AnonymousClass675(r7, this, r8));
        }
    }

    public int getZoomLevel() {
        AnonymousClass5yJ r1 = this.A0O;
        if (r1.A0B) {
            return r1.A09;
        }
        return 0;
    }

    public boolean isConnected() {
        if (this.A0Y != null) {
            return this.A0U.get() || this.A0V.get();
        }
        return false;
    }
}
