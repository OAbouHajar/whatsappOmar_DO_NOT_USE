package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.OrientationEventListener;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import com.facebook.optic.IDxSCallbackShape43S0100000_3_I1;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.5yh  reason: invalid class name and case insensitive filesystem */
public class C119575yh implements TextureView.SurfaceTextureListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public AnonymousClass5xU A07;
    public C116965sE A08;
    public C115975qc A09;
    public C115995qe A0A;
    public C116015qg A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Context A0F;
    public final Handler A0G;
    public final HandlerThread A0H;
    public final OrientationEventListener A0I;
    public final TextureView A0J;
    public final C115745qF A0K;
    public final C117815tb A0L;
    public final AnonymousClass5zQ A0M;
    public final C1223369e A0N;
    public final AnonymousClass687 A0O;
    public final AnonymousClass688 A0P;
    public final C118595uw A0Q;
    public final C118595uw A0R;
    public final C114825of A0S;
    public final C118855vM A0T;
    public final Object A0U;
    public final String A0V;
    public volatile C116005qf A0W;
    public volatile boolean A0X;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.5zD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.5zC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.5zD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.5zD} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C119575yh(android.content.Context r9, android.view.TextureView r10, X.AnonymousClass5zQ r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r7 = "OBWhatsAppCamera"
            android.content.Context r2 = r9.getApplicationContext()
            if (r12 == 0) goto L_0x0012
            X.5of r3 = X.C114825of.CAMERA2
        L_0x000a:
            X.5rV r0 = X.C116515rV.A01
            if (r0 != 0) goto L_0x0025
            java.lang.Class<X.5rV> r1 = X.C116515rV.class
            monitor-enter(r1)
            goto L_0x0015
        L_0x0012:
            X.5of r3 = X.C114825of.CAMERA1
            goto L_0x000a
        L_0x0015:
            X.5rV r0 = X.C116515rV.A01     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0020
            X.5rV r0 = new X.5rV     // Catch:{ all -> 0x0022 }
            r0.<init>(r3)     // Catch:{ all -> 0x0022 }
            X.C116515rV.A01 = r0     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r1)     // Catch:{ all -> 0x0022 }
            goto L_0x0025
        L_0x0022:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0022 }
            throw r0
        L_0x0025:
            X.5rV r0 = X.C116515rV.A01
            X.5of r1 = r0.A00
            X.5of r6 = X.C114825of.CAMERA1
            r3 = 1
            if (r1 != r6) goto L_0x0045
            X.5zC r0 = X.AnonymousClass5zC.A0h
            if (r0 != 0) goto L_0x0051
            java.lang.Class<X.5zC> r1 = X.AnonymousClass5zC.class
            monitor-enter(r1)
            X.5zC r0 = X.AnonymousClass5zC.A0h     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0040
            X.5zC r0 = new X.5zC     // Catch:{ all -> 0x0042 }
            r0.<init>(r9)     // Catch:{ all -> 0x0042 }
            X.AnonymousClass5zC.A0h = r0     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            goto L_0x0051
        L_0x0042:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            throw r0
        L_0x0045:
            X.5of r0 = X.C114825of.CAMERA2
            if (r1 != r0) goto L_0x00e4
            X.5zD r1 = X.AnonymousClass5zD.A03(r9)
            r1.A0B()
            goto L_0x0055
        L_0x0051:
            X.5zC r1 = X.AnonymousClass5zC.A0h
            r1.A0C = r3
        L_0x0055:
            X.5yX r5 = new X.5yX
            r5.<init>()
            r8.<init>()
            X.5vM r0 = new X.5vM
            r0.<init>()
            r8.A0T = r0
            java.lang.Object r0 = X.C13690nt.A0Y()
            r8.A0U = r0
            r0 = -1
            r8.A04 = r0
            r8.A03 = r0
            r8.A0C = r3
            r4 = 3
            com.facebook.optic.IDxSCallbackShape43S0100000_3_I1 r0 = new com.facebook.optic.IDxSCallbackShape43S0100000_3_I1
            r0.<init>(r8, r4)
            r8.A0Q = r0
            r4 = 4
            com.facebook.optic.IDxSCallbackShape43S0100000_3_I1 r0 = new com.facebook.optic.IDxSCallbackShape43S0100000_3_I1
            r0.<init>(r8, r4)
            r8.A0R = r0
            r4 = 0
            com.facebook.redex.IDxFListenerShape400S0100000_3_I1 r0 = new com.facebook.redex.IDxFListenerShape400S0100000_3_I1
            r0.<init>(r8, r4)
            r8.A0O = r0
            X.5qF r0 = new X.5qF
            r0.<init>(r8)
            r8.A0K = r0
            X.5tb r0 = new X.5tb
            r0.<init>(r8)
            r8.A0L = r0
            com.facebook.redex.IDxFListenerShape353S0100000_3_I1 r0 = new com.facebook.redex.IDxFListenerShape353S0100000_3_I1
            r0.<init>(r8, r4)
            r8.A0P = r0
            r8.A0F = r2
            r8.A0V = r7
            if (r12 == 0) goto L_0x00a6
            X.5of r6 = X.C114825of.CAMERA2
        L_0x00a6:
            r8.A0S = r6
            r0 = 1920(0x780, float:2.69E-42)
            r8.A02 = r0
            r0 = 1080(0x438, float:1.513E-42)
            r8.A01 = r0
            r8.A0N = r1
            r8.A0M = r11
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1, r5)
            r8.A0G = r0
            java.lang.String r1 = "Simple-Lite-Camera-Callback-Thread"
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1)
            r8.A0H = r0
            r0.start()
            X.69e r0 = r8.A0N
            boolean r0 = r0.AHT(r4)
            r0 = r0 ^ 1
            r8.A00 = r0
            r8.A0E = r3
            r8.A0J = r10
            r10.setSurfaceTextureListener(r8)
            X.5dp r0 = new X.5dp
            r0.<init>(r2, r8)
            r8.A0I = r0
            return
        L_0x00e4:
            java.lang.String r0 = "Invalid Camera API: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119575yh.<init>(android.content.Context, android.view.TextureView, X.5zQ, boolean):void");
    }

    public static /* synthetic */ void A00(C119575yh r1, Object obj, int i2) {
        Handler handler = r1.A0G;
        handler.sendMessage(handler.obtainMessage(i2, obj));
    }

    public int A01() {
        AnonymousClass5wJ A042;
        AnonymousClass5wJ A043 = A04();
        if (A043 == null || (A042 = A04()) == null) {
            return 100;
        }
        C115825qN r2 = AnonymousClass5wJ.A0W;
        if (!AnonymousClass5wJ.A02(r2, A042)) {
            return 100;
        }
        List A012 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0x, A043);
        AnonymousClass5wJ A044 = A04();
        return AnonymousClass000.A0D(A012.get((A044 == null || !AnonymousClass5wJ.A02(r2, A044)) ? 0 : this.A0N.getZoomLevel()));
    }

    public final int A02() {
        WindowManager windowManager = (WindowManager) this.A0F.getSystemService("window");
        if (windowManager != null) {
            return windowManager.getDefaultDisplay().getRotation();
        }
        return 0;
    }

    public View A03() {
        return this.A0J;
    }

    public final AnonymousClass5wJ A04() {
        C1223369e r1 = this.A0N;
        if (r1 == null || !r1.isConnected()) {
            return null;
        }
        try {
            return r1.AAT();
        } catch (AnonymousClass67L unused) {
            return null;
        }
    }

    public void A05() {
        if (!this.A0E) {
            OrientationEventListener orientationEventListener = this.A0I;
            if (orientationEventListener.canDetectOrientation()) {
                orientationEventListener.disable();
            }
            this.A0E = true;
            C1223369e r1 = this.A0N;
            r1.Ac0(this.A0L);
            r1.Adx((AnonymousClass687) null);
            r1.A81(new IDxSCallbackShape43S0100000_3_I1(this, 1));
        }
    }

    public void A06() {
        String obj;
        if (this.A0E) {
            this.A0E = false;
            OrientationEventListener orientationEventListener = this.A0I;
            if (orientationEventListener.canDetectOrientation()) {
                orientationEventListener.enable();
            }
            HandlerThread handlerThread = this.A0H;
            Looper looper = handlerThread.getLooper();
            if (looper != null) {
                C1223369e r4 = this.A0N;
                r4.Adf(new Handler(looper));
                AnonymousClass5xU r8 = this.A07;
                if (r8 == null) {
                    r8 = new AnonymousClass5xU(0, 0, 0);
                }
                int i2 = Build.VERSION.SDK_INT;
                C111105fL r7 = new C111105fL(r8, new C117785tY(), C114885ol.A02, i2 >= 26 ? C114885ol.A02 : i2 >= 19 ? C114885ol.A04 : C114885ol.A03, this.A0D);
                this.A04 = A02();
                r4.A4e(this.A0L);
                r4.Adx(this.A0O);
                String str = this.A0V;
                int i3 = this.A00;
                int i4 = 0;
                if (i3 != 0) {
                    i4 = 1;
                    if (i3 != 1) {
                        obj = C13680ns.A0c(i3, "Could not convert camera facing to optic: ");
                    }
                }
                r4.A6Z(this.A0Q, new C118715v8(new C116935sB(this.A0M, this.A02, this.A01)), r7, (C1219467r) null, (C1219567s) null, str, i4, this.A04);
                return;
            }
            StringBuilder A0r = AnonymousClass000.A0r("Callback handler looper is null. CallbackHandlerThread is alive: ");
            A0r.append(handlerThread.isAlive());
            obj = A0r.toString();
            throw AnonymousClass000.A0a(obj);
        }
    }

    public void A07(int i2) {
        int i3 = 1;
        if (this.A00 != 1) {
            C118845vL r2 = new C118845vL();
            C115835qO r1 = AnonymousClass5wI.A0A;
            if (i2 == 0) {
                i3 = 0;
            } else if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    i3 = 3;
                }
            }
            r2.A01(r1, Integer.valueOf(i3));
            this.A0N.ALa(new C111115fM(), r2.A00());
        }
    }

    public void A08(int i2) {
        if (this.A0E) {
            C1223369e r1 = this.A0N;
            int i3 = 0;
            if (i2 != 0) {
                i3 = 1;
                if (i2 != 1) {
                    throw AnonymousClass000.A0a(C13680ns.A0c(i2, "Could not convert camera facing to optic: "));
                }
            }
            if (r1.AHT(i3)) {
                this.A00 = i2;
                return;
            }
            return;
        }
        throw AnonymousClass000.A0V("Initial camera facing must be set before initializing the camera.");
    }

    public final void A09(C116965sE r5) {
        C1223369e r3 = this.A0N;
        if (r3.isConnected() && r5 != null) {
            int A022 = A02();
            if (this.A04 == A022) {
                Object[] objArr = new Object[4];
                objArr[0] = this;
                objArr[1] = this.A08;
                AnonymousClass000.A1M(objArr, this.A06, 2);
                AnonymousClass000.A1M(objArr, this.A05, 3);
                Handler handler = this.A0G;
                handler.sendMessage(handler.obtainMessage(15, objArr));
                return;
            }
            this.A04 = A022;
            r3.AeP(new IDxSCallbackShape43S0100000_3_I1(this, 2), A022);
        }
    }

    public void A0A(C115975qc r3) {
        if (!this.A0E) {
            C1223369e r1 = this.A0N;
            if (r1.isConnected()) {
                if (r3 != null) {
                    r1.A4d(this.A0P);
                } else if (this.A09 != null) {
                    r1.Abz(this.A0P);
                }
            }
        }
        this.A09 = r3;
    }

    public boolean A0B(int i2) {
        List A012;
        AnonymousClass5wJ A042 = A04();
        if (A042 == null || (A012 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0j, A042)) == null) {
            return false;
        }
        int i3 = 0;
        if (i2 != 0) {
            i3 = 1;
            if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    i3 = 3;
                }
            }
        }
        return C110115dX.A1E(A012, i3);
    }

    public void finalize() {
        int i2 = Build.VERSION.SDK_INT;
        HandlerThread handlerThread = this.A0H;
        if (i2 >= 18) {
            handlerThread.quitSafely();
        } else {
            handlerThread.quit();
        }
        super.finalize();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        AnonymousClass5zQ r0 = this.A0M;
        synchronized (r0.A08) {
            r0.A0A = surfaceTexture;
            r0.A07.countDown();
        }
        onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AnonymousClass5yF r1;
        AnonymousClass5zQ r4 = this.A0M;
        synchronized (r4.A08) {
            if (r4.A0A != null) {
                r4.A09 = null;
                r4.A0A = null;
                r4.A07 = new CountDownLatch(1);
            }
            if (AnonymousClass5zQ.A0C && (r1 = r4.A0B) != null) {
                r1.A05((SurfaceTexture) null, 0);
            }
        }
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.A06 = i2;
        this.A05 = i3;
        A09(this.A08);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
