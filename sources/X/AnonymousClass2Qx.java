package X;

import android.content.Context;
import android.graphics.Point;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.SurfaceHolder;
import com.facebook.redex.IDxCallableShape148S0100000_2_I0;
import com.facebook.redex.IDxCallableShape45S0200000_2_I0;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2Qx  reason: invalid class name */
public class AnonymousClass2Qx implements VideoPort {
    public static final float[] A0I = {0.0f, 0.0f, 0.0f, 1.0f};
    public static final float[] A0J = {0.0f, 0.0f, 0.0f, 0.0f};
    public int A00;
    public AnonymousClass4V1 A01;
    public WeakReference A02;
    public C90194dg A03;
    public boolean A04;
    public boolean A05;
    public final Handler A06;
    public final HandlerThread A07;
    public final AnonymousClass46D A08;
    public final C26811Ph A09;
    public final C14710pd A0A;
    public final UserJid A0B;
    public final GlVideoRenderer A0C;
    public final Set A0D = new HashSet();
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public final boolean A0F;
    public volatile boolean A0G;
    public volatile boolean A0H;

    public AnonymousClass2Qx(AnonymousClass46D r5, C26811Ph r6, C14710pd r7, UserJid userJid, GlVideoRenderer glVideoRenderer, boolean z2) {
        this.A0B = userJid;
        this.A0A = r7;
        this.A0C = glVideoRenderer;
        this.A08 = r5;
        this.A09 = r6;
        this.A0F = z2;
        StringBuilder sb = new StringBuilder("VideoPort_");
        sb.append(hashCode());
        HandlerThread handlerThread = new HandlerThread(sb.toString());
        this.A07 = handlerThread;
        handlerThread.start();
        C63873Lv r3 = new C63873Lv(handlerThread.getLooper(), this);
        this.A06 = r3;
        if (this.A0A.A0E(C16620tM.A02, 2831)) {
            Handler handler = this.A06;
            handler.removeMessages(4);
            A00(handler.obtainMessage(4), "initEgl");
            return;
        }
        int intValue = ((Number) AnonymousClass46C.A00(r3, -100, new IDxCallableShape148S0100000_2_I0(this, 5))).intValue();
        if (intValue != 0) {
            StringBuilder sb2 = new StringBuilder("voip/CoreVideoPort/create failed to init EGL (");
            sb2.append(intValue);
            sb2.append(") for ");
            sb2.append(userJid);
            Log.e(sb2.toString());
        }
    }

    public final int A00(Message message, String str) {
        if (this.A06.sendMessage(message)) {
            return 0;
        }
        StringBuilder sb = new StringBuilder("voip/CoreVideoPort/");
        sb.append(str);
        sb.append(" failed: ");
        sb.append(-100);
        sb.append(" for ");
        sb.append(this.A0B);
        Log.e(sb.toString());
        return -100;
    }

    public final int A01(Callable callable) {
        return ((Number) AnonymousClass46C.A00(this.A06, -100, callable)).intValue();
    }

    public final int A02(float[] fArr) {
        boolean z2 = false;
        if (fArr.length == 4) {
            z2 = true;
        }
        AnonymousClass00B.A0B("Color array must be RGBA", z2);
        HandlerThread handlerThread = this.A07;
        AnonymousClass00B.A03(handlerThread);
        GLES20.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
        GLES20.glClear(16384);
        AnonymousClass00B.A03(handlerThread);
        return this.A03.A0C() ? 0 : -3;
    }

    public final void A03() {
        if (!this.A0H) {
            this.A0H = true;
            Set<AnonymousClass26F> set = this.A0D;
            synchronized (set) {
                for (AnonymousClass26F A0I2 : set) {
                    A0I2.A0I();
                }
            }
        }
    }

    public final void A04() {
        AnonymousClass00B.A03(this.A07);
        this.A0C.release();
        this.A0E.set(false);
        try {
            this.A03.A05();
            this.A03.A08();
            this.A03.A07();
        } catch (Exception e2) {
            Log.e((Throwable) e2);
        }
    }

    public final void A05() {
        AnonymousClass00B.A03(this.A07);
        C90194dg r1 = this.A03;
        if (r1.A0B()) {
            r1.A05();
            this.A03.A08();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (X.C34901l3.A00(r0.get(), r6) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r5.A0G
            if (r0 != 0) goto L_0x0035
            java.lang.ref.WeakReference r0 = r5.A02
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get()
            boolean r0 = X.C34901l3.A00(r0, r6)
            r1 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            X.3IY r0 = new X.3IY
            r0.<init>(r5, r6, r1)
            int r2 = r5.A01(r0)
            r5.A0H = r3
            if (r2 != 0) goto L_0x0040
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x0036
            r5.A05 = r4
            X.1Ph r0 = r5.A09
            r0.A01(r5)
        L_0x002e:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r5.A02 = r0
        L_0x0035:
            return
        L_0x0036:
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x002e
            com.whatsapp.jid.UserJid r0 = r5.A0B
            com.whatsapp.voipcalling.Voip.startVideoRenderStream(r0)
            goto L_0x002e
        L_0x0040:
            java.lang.String r0 = "voip/CoreVideoPort/onSurfaceAvailable failed to create surface ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = ") for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r5.A0B
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Qx.A06(java.lang.Object):void");
    }

    public void A07(Object obj) {
        WeakReference weakReference;
        if (!this.A0G) {
            if (((Boolean) AnonymousClass46C.A00(this.A06, Boolean.FALSE, new IDxCallableShape148S0100000_2_I0(this, 3))).booleanValue() && (weakReference = this.A02) != null && C34901l3.A00(weakReference.get(), obj)) {
                A01(new IDxCallableShape148S0100000_2_I0(this, 7));
                if (this.A02 != null) {
                    this.A02 = null;
                }
                if (this.A0F) {
                    Voip.stopVideoRenderStream(this.A0B);
                }
            }
        }
    }

    public void A08(Object obj, int i2, int i3) {
        String str;
        if (!this.A0G) {
            WeakReference weakReference = this.A02;
            if (weakReference == null || !C34901l3.A00(weakReference.get(), obj)) {
                str = "voip/CoreVideoPort/onSurfaceSizeChanged invalid surface";
            } else if (this.A0A.A0E(C16620tM.A02, 2831)) {
                Handler handler = this.A06;
                handler.removeMessages(1);
                A00(handler.obtainMessage(1, i2, i3), "setWindowSize");
                return;
            } else {
                int intValue = ((Number) AnonymousClass46C.A00(this.A06, -100, new AnonymousClass584(this, i2, i3))).intValue();
                if (intValue == 0) {
                    C26811Ph r0 = this.A09;
                    AnonymousClass00B.A01();
                    UserJid userJid = this.A0B;
                    if (r0.A03.A0I(userJid)) {
                        Voip.setVideoPreviewSize(i2, i3);
                        return;
                    } else {
                        Voip.setVideoDisplayPort(userJid, this);
                        return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("voip/CoreVideoPort/setWindowSize failed: ");
                    sb.append(intValue);
                    sb.append(" for ");
                    sb.append(this.A0B);
                    str = sb.toString();
                }
            }
            Log.i(str);
        }
    }

    public final boolean A09() {
        AnonymousClass00B.A03(this.A07);
        return this.A03.A0B() && this.A0E.get();
    }

    public AnonymousClass4V1 createSurfaceTexture() {
        if (this.A0G) {
            Log.w("voip/CoreVideoPort/createSurfaceTexture called after release");
            return null;
        }
        return (AnonymousClass4V1) AnonymousClass46C.A00(this.A06, (Object) null, new IDxCallableShape148S0100000_2_I0(this, 4));
    }

    public Context getContext() {
        return null;
    }

    @Deprecated
    public SurfaceHolder getSurfaceHolder() {
        return null;
    }

    public Point getWindowSize() {
        return new Point(0, 0);
    }

    public void release() {
        AnonymousClass00B.A01();
        UserJid userJid = this.A0B;
        this.A0G = true;
        Set set = this.A0D;
        synchronized (set) {
            set.clear();
        }
        if (this.A05) {
            this.A05 = false;
            this.A09.A03(userJid);
        }
        Handler handler = this.A06;
        handler.removeCallbacksAndMessages((Object) null);
        if (this.A0A.A0E(C16620tM.A02, 2831)) {
            AnonymousClass4V1 r1 = this.A01;
            handler.removeMessages(7);
            A00(handler.obtainMessage(7, r1), "releaseSurfaceTexture");
            handler.removeMessages(5);
            if (A00(handler.obtainMessage(5), "releaseEgl") != -100) {
                return;
            }
        } else {
            A01(new IDxCallableShape148S0100000_2_I0(this, 2));
        }
        this.A07.quit();
    }

    public void releaseSurfaceTexture(AnonymousClass4V1 r4) {
        if (this.A0G) {
            return;
        }
        if (this.A0A.A0E(C16620tM.A02, 2831)) {
            Handler handler = this.A06;
            handler.removeMessages(7);
            A00(handler.obtainMessage(7, r4), "releaseSurfaceTexture");
            return;
        }
        A01(new IDxCallableShape45S0200000_2_I0(this, 0, r4));
    }

    public int renderNativeFrame(long j2, int i2, int i3, int i4, int i5, int i6) {
        int A012 = A01(new AnonymousClass58A(this, i2, i3, i4, i5, i6, j2));
        if (A012 == 0) {
            A03();
        }
        return A012;
    }

    public void renderTexture(AnonymousClass4V1 r4, int i2, int i3) {
        if (this.A0A.A0E(C16620tM.A02, 2831)) {
            Handler handler = this.A06;
            handler.removeMessages(6);
            A00(handler.obtainMessage(6, i2, i3, r4), "renderTexture");
        } else if (A01(new AnonymousClass587(this, r4, i2, i3)) == 0) {
            A03();
        }
    }

    public int resetBlackScreen() {
        return A01(new IDxCallableShape148S0100000_2_I0(this, 6));
    }

    public void setCornerRadius(float f2) {
        if (this.A0A.A0E(C16620tM.A02, 2831)) {
            Handler handler = this.A06;
            handler.removeMessages(3);
            A00(handler.obtainMessage(3, Float.valueOf(f2)), "setCornerRadius");
            return;
        }
        int A012 = A01(new C1050057v(this, f2));
        if (A012 != 0) {
            StringBuilder sb = new StringBuilder("voip/CoreVideoPort/setCornerRadius failed: ");
            sb.append(A012);
            sb.append(" for ");
            sb.append(this.A0B);
            sb.append(". Retrying on valid surface");
            Log.i(sb.toString());
        }
    }

    public void setListener(C449426i r1) {
    }

    public int setScaleType(int i2) {
        if (!this.A0A.A0E(C16620tM.A02, 2831)) {
            int A012 = A01(new C1050157w(this, i2));
            if (A012 == 0) {
                return A012;
            }
            StringBuilder sb = new StringBuilder("voip/CoreVideoPort/setScaleType failed: ");
            sb.append(A012);
            sb.append(" for ");
            sb.append(this.A0B);
            Log.i(sb.toString());
            return A012;
        } else if (!this.A0E.get()) {
            StringBuilder sb2 = new StringBuilder("voip/CoreVideoPort/setScaleType failed: -6 for ");
            sb2.append(this.A0B);
            Log.e(sb2.toString());
            return -6;
        } else {
            Handler handler = this.A06;
            handler.removeMessages(2);
            return A00(handler.obtainMessage(2, Integer.valueOf(i2)), "setScaleType");
        }
    }
}
