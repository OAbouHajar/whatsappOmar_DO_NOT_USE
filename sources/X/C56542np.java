package X;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.facebook.redex.IDxCallbackShape335S0100000_2_I1;
import com.facebook.redex.IDxFCallbackShape425S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.facebook.redex.RunnableRunnableShape1S0101000_I1;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.2np  reason: invalid class name and case insensitive filesystem */
public class C56542np extends SurfaceView implements AnonymousClass5TD, AnonymousClass006 {
    public int A00;
    public int A01;
    public Camera.Size A02;
    public Camera A03;
    public Handler A04;
    public Handler A05;
    public HandlerThread A06;
    public HandlerThread A07;
    public C109465Sf A08;
    public C52662eE A09;
    public List A0A;
    public Map A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Camera.AutoFocusCallback A0F;
    public final Camera.PreviewCallback A0G;
    public final Handler A0H;
    public final SurfaceHolder.Callback A0I;
    public final SurfaceHolder A0J;
    public final C88514ad A0K;
    public final Runnable A0L;

    public C56542np(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0C) {
            this.A0C = true;
            generatedComponent();
        }
        this.A0H = AnonymousClass000.A0L();
        this.A0K = new C88514ad();
        IDxCallbackShape335S0100000_2_I1 iDxCallbackShape335S0100000_2_I1 = new IDxCallbackShape335S0100000_2_I1(this, 2);
        this.A0I = iDxCallbackShape335S0100000_2_I1;
        this.A0G = new C91664gI(this);
        this.A0F = new IDxFCallbackShape425S0100000_2_I1(this, 1);
        this.A0L = new RunnableRunnableShape19S0100000_I1_2(this, 21);
        SurfaceHolder holder = getHolder();
        this.A0J = holder;
        holder.addCallback(iDxCallbackShape335S0100000_2_I1);
    }

    public final void A00() {
        if (this.A08 != null) {
            this.A0H.post(new RunnableRunnableShape1S0101000_I1((Object) this, 1, 12));
        }
    }

    public boolean AJl() {
        Camera camera = this.A03;
        if (camera == null || !this.A0D) {
            return false;
        }
        boolean equals = "torch".equals(camera.getParameters().getFlashMode());
        this.A0E = equals;
        return equals;
    }

    public void AcJ() {
        Handler handler = this.A04;
        if (handler != null) {
            handler.post(new RunnableRunnableShape19S0100000_I1_2(this, 22));
        }
    }

    public void AcX() {
        Handler handler = this.A04;
        if (handler != null) {
            handler.post(new RunnableRunnableShape19S0100000_I1_2(this, 25));
        }
    }

    public boolean Aga() {
        return this.A0D;
    }

    public void Agz() {
        Camera camera = this.A03;
        if (camera != null && this.A0D) {
            this.A0E = !this.A0E;
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(this.A0E ? "torch" : "off");
            camera.setParameters(parameters);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A09;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public Camera.Size getPreviewSize() {
        return this.A02;
    }

    public void onAttachedToWindow() {
        Log.i("qrview/onAttachedToWindow");
        super.onAttachedToWindow();
        HandlerThread handlerThread = new HandlerThread("QrScannerCamera");
        this.A06 = handlerThread;
        handlerThread.start();
        this.A04 = new Handler(this.A06.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("QrScannerViewDecode");
        this.A07 = handlerThread2;
        handlerThread2.start();
        this.A05 = new Handler(this.A07.getLooper());
    }

    public void onDetachedFromWindow() {
        Log.i("qrview/onDetachedFromWindow");
        super.onDetachedFromWindow();
        HandlerThread handlerThread = this.A06;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        HandlerThread handlerThread2 = this.A07;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r1 == 2) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r11 = r17
            r1 = r18
            r0 = r19
            super.onMeasure(r1, r0)
            r0 = 0
            r11.A01 = r0
            r11.A00 = r0
            int r14 = r11.getMeasuredWidth()
            int r13 = r11.getMeasuredHeight()
            android.hardware.Camera r0 = r11.A03
            java.lang.String r12 = "x"
            if (r0 == 0) goto L_0x00c9
            java.util.List r0 = r11.A0A
            if (r0 == 0) goto L_0x00c9
            android.content.Context r0 = r11.getContext()
            android.view.WindowManager r0 = X.AnonymousClass01V.A02(r0)
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            if (r1 == 0) goto L_0x0037
            r0 = 2
            r3 = 0
            if (r1 != r0) goto L_0x0038
        L_0x0037:
            r3 = 1
        L_0x0038:
            java.util.List r2 = r11.A0A
            r1 = r14
            r0 = r13
            if (r3 == 0) goto L_0x0040
            r1 = r13
            r0 = r14
        L_0x0040:
            android.hardware.Camera$Size r10 = X.C49062Qp.A01(r2, r1, r0)
            if (r10 == 0) goto L_0x00c9
            double r6 = (double) r14
            double r4 = (double) r13
            double r2 = r6 / r4
            int r0 = r10.width
            r16 = r0
            double r8 = (double) r0
            int r15 = r10.height
            double r0 = (double) r15
            double r8 = r8 / r0
            double r2 = r2 - r8
            double r2 = java.lang.Math.abs(r2)
            double r0 = r4 / r6
            double r0 = r0 - r8
            double r0 = java.lang.Math.abs(r0)
            double r0 = java.lang.Math.min(r2, r0)
            java.lang.String r2 = "qrview/measure optimalpreviewsize:"
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r2)
            r2 = r16
            X.C13690nt.A1N(r12, r3, r2, r15)
            java.lang.String r2 = " measured:"
            r3.append(r2)
            X.C13690nt.A1N(r12, r3, r14, r13)
            java.lang.String r2 = " aspect diff:"
            r3.append(r2)
            r3.append(r0)
            X.C13680ns.A1V(r3)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c9
            boolean r1 = X.C13700nu.A0g(r14, r13)
            int r3 = r10.width
            int r2 = r10.height
            boolean r0 = X.C13700nu.A0g(r3, r2)
            java.lang.String r8 = "qrview/measure optimalpreviewsize scale:"
            if (r1 != r0) goto L_0x00ca
            double r0 = (double) r3
            double r6 = r6 / r0
            double r0 = (double) r2
            double r4 = r4 / r0
            double r2 = java.lang.Math.max(r6, r4)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r8)
            r0.append(r2)
            X.C13680ns.A1V(r0)
            int r0 = r10.width
            double r0 = (double) r0
            double r0 = r0 * r2
            int r4 = (int) r0
            int r0 = r10.height
        L_0x00b3:
            double r0 = (double) r0
            double r2 = r2 * r0
            int r1 = (int) r2
            java.lang.String r0 = "qrview/measure result:"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            X.C13690nt.A1N(r12, r0, r4, r1)
            X.C13680ns.A1V(r0)
            r11.A01 = r4
            r11.A00 = r1
            r11.setMeasuredDimension(r4, r1)
        L_0x00c9:
            return
        L_0x00ca:
            double r0 = (double) r2
            double r6 = r6 / r0
            double r0 = (double) r3
            double r4 = r4 / r0
            double r2 = java.lang.Math.max(r6, r4)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r8)
            r0.append(r2)
            X.C13680ns.A1V(r0)
            int r0 = r10.height
            double r0 = (double) r0
            double r0 = r0 * r2
            int r4 = (int) r0
            int r0 = r10.width
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56542np.onMeasure(int, int):void");
    }

    public void setQrDecodeHints(Map map) {
        this.A0B = map;
    }

    public void setQrScannerCallback(C109465Sf r1) {
        this.A08 = r1;
    }
}
