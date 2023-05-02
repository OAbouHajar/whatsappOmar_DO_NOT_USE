package X;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.facebook.redex.IDxCallableShape149S0100000_2_I1;
import com.facebook.redex.IDxCallableShape46S0200000_2_I1;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.VideoPort;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

/* renamed from: X.53K  reason: invalid class name */
public abstract class AnonymousClass53K implements VideoPort {
    public int A00;
    public int A01;
    public C449426i A02;
    public C90194dg A03;
    public boolean A04;
    public boolean A05;
    public final Handler A06;
    public final HandlerThread A07;
    public final GlVideoRenderer A08 = new GlVideoRenderer();
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    public AnonymousClass53K(String str, boolean z2, boolean z3) {
        AnonymousClass00B.A01();
        this.A09 = str;
        this.A0B = z2;
        this.A0A = z3;
        HandlerThread handlerThread = new HandlerThread(AnonymousClass000.A0l(AnonymousClass000.A0r("VideoPort_"), hashCode()));
        this.A07 = handlerThread;
        handlerThread.start();
        this.A06 = new Handler(handlerThread.getLooper());
    }

    public final int A00() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        C90194dg r0 = this.A03;
        AnonymousClass00B.A06(r0);
        return C90194dg.A01(r0);
    }

    public Object A01() {
        if (this instanceof C73003n7) {
            return ((C73003n7) this).A01.getSurfaceTexture();
        }
        Surface surface = ((C73013n8) this).A01.getHolder().getSurface();
        if (surface == null || !surface.isValid()) {
            return null;
        }
        return surface;
    }

    public final Object A02(Callable callable, Object obj) {
        if (Thread.currentThread() == this.A07) {
            try {
                return callable.call();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            Exchanger exchanger = new Exchanger();
            if (!this.A06.post(new RunnableRunnableShape3S0300000_I1(this, exchanger, callable, 14))) {
                return obj;
            }
            try {
                return exchanger.exchange((Object) null);
            } catch (InterruptedException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public void A03() {
        AnonymousClass00B.A01();
        this.A05 = false;
        if (this.A04) {
            C449426i r0 = this.A02;
            if (r0 != null) {
                r0.APq(this);
            }
            A02(new IDxCallableShape149S0100000_2_I1(this, 2), -100);
            this.A04 = false;
        }
    }

    public void A04() {
        AnonymousClass00B.A01();
        String str = this.A09;
        if (!this.A04) {
            Object A012 = A01();
            if (A012 == null) {
                Log.w(AnonymousClass000.A0h("/openPort no Surface/SurfaceTexture", AnonymousClass000.A0q(str)));
                return;
            }
            this.A05 = false;
            this.A04 = true;
            ((Number) A02(new IDxCallableShape46S0200000_2_I1(this, 0, A012), -100)).intValue();
            C449426i r0 = this.A02;
            if (r0 != null) {
                r0.AP2(this);
            }
        }
    }

    public final void A05() {
        if (this.A03 != null) {
            this.A08.release();
            try {
                this.A03.A05();
                this.A03.A08();
                this.A03.A07();
            } catch (Exception e2) {
                Log.e((Throwable) e2);
            }
            this.A03 = null;
        }
    }

    public void A06(int i2, int i3) {
        AnonymousClass00B.A01();
        ((Number) A02(new AnonymousClass585(this, i2, i3), -100)).intValue();
        C449426i r0 = this.A02;
        if (r0 != null) {
            r0.AUv(this);
        }
    }

    public final boolean A07(Object obj) {
        AnonymousClass00B.A03(this.A07);
        C90194dg r1 = this.A03;
        AnonymousClass00B.A06(r1);
        try {
            if (r1.A0B()) {
                r1.A05();
                this.A03.A08();
            }
            if (obj instanceof Surface) {
                this.A03.A0A((Surface) obj);
            } else {
                this.A03.A09((SurfaceTexture) obj);
            }
            this.A03.A06();
            return true;
        } catch (RuntimeException e2) {
            Log.e((Throwable) e2);
            A05();
            return false;
        }
    }

    public AnonymousClass4V1 createSurfaceTexture() {
        return (AnonymousClass4V1) A02(new C1049757q(), (Object) null);
    }

    @Deprecated
    public SurfaceHolder getSurfaceHolder() {
        if (this instanceof C73013n8) {
            return ((C73013n8) this).A01.getHolder();
        }
        return null;
    }

    public Point getWindowSize() {
        return (Point) A02(new IDxCallableShape149S0100000_2_I1(this, 3), new Point(0, 0));
    }

    public void release() {
        AnonymousClass00B.A01();
        A03();
        this.A07.quit();
    }

    public void releaseSurfaceTexture(AnonymousClass4V1 r3) {
        A02(new IDxCallableShape46S0200000_2_I1(this, 1, r3), -100);
    }

    public int renderNativeFrame(long j2, int i2, int i3, int i4, int i5, int i6) {
        C449426i r1 = this.A02;
        if (r1 != null && !this.A05) {
            this.A05 = true;
            r1.AW2(this);
        }
        return AnonymousClass000.A0D(A02(new AnonymousClass58B(this, i2, i3, i4, i5, i6, j2), -100));
    }

    public void renderTexture(AnonymousClass4V1 r3, int i2, int i3) {
        C449426i r1 = this.A02;
        if (r1 != null && !this.A05) {
            this.A05 = true;
            r1.AW2(this);
        }
        A02(new AnonymousClass588(this, r3, i2, i3), -100);
    }

    public int resetBlackScreen() {
        return AnonymousClass000.A0D(A02(new IDxCallableShape149S0100000_2_I1(this, 1), -100));
    }

    public void setCornerRadius(float f2) {
        A02(new C1050257x(this, f2), -100);
    }

    public void setListener(C449426i r3) {
        AnonymousClass00B.A01();
        C449426i r1 = this.A02;
        if (r3 != r1) {
            if (this.A04 && r1 != null) {
                r1.APq(this);
            }
            this.A02 = r3;
            if (this.A04 && r3 != null) {
                r3.AP2(this);
            }
        }
    }

    public int setScaleType(int i2) {
        return AnonymousClass000.A0D(A02(new C1050357y(this, i2), -100));
    }
}
