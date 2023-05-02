package X;

import android.content.Context;
import android.hardware.Camera;
import android.view.Display;
import android.view.SurfaceHolder;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;

/* renamed from: X.5h1  reason: invalid class name and case insensitive filesystem */
public class C111585h1 extends C111685hC implements SurfaceHolder.Callback {
    public int A00;
    public int A01;
    public Camera A02;
    public final SurfaceHolder A03;

    public C111585h1(Context context) {
        super(context);
        SurfaceHolder holder = getHolder();
        this.A03 = holder;
        holder.addCallback(this);
    }

    public void AcZ() {
        this.A09.post(new RunnableRunnableShape4S0200000_I0_2(this, 0, this.A03));
    }

    public int getDisplayOrientation() {
        Display defaultDisplay = AnonymousClass01V.A02(getContext()).getDefaultDisplay();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.A00, cameraInfo);
        int rotation = defaultDisplay.getRotation();
        int i2 = 0;
        boolean A1R = AnonymousClass000.A1R(cameraInfo.facing, 1);
        int i3 = cameraInfo.orientation;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        int i4 = (i3 - i2) + 360;
        if (A1R) {
            i4 = 360 - ((i3 + i2) % 360);
        }
        int i5 = i4 % 360;
        StringBuilder A0r = AnonymousClass000.A0r("bloks_camera/startpreview display:");
        A0r.append(i2);
        A0r.append(" camera:");
        A0r.append(i3);
        A0r.append(" preview:");
        A0r.append(i5);
        A0r.append(" front:");
        A0r.append(A1R);
        C13680ns.A1V(A0r);
        return i5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (r5.contains(r2) != false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bb A[Catch:{ RuntimeException -> 0x0020 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e6 A[Catch:{ RuntimeException -> 0x0020 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceChanged(android.view.SurfaceHolder r22, int r23, int r24, int r25) {
        /*
            r21 = this;
            r0 = r21
            android.view.SurfaceHolder r4 = r0.A03
            android.view.Surface r1 = r4.getSurface()
            if (r1 == 0) goto L_0x015b
            android.hardware.Camera r1 = r0.A02
            if (r1 == 0) goto L_0x015b
            r1.stopPreview()     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            monitor-enter(r0)
            android.hardware.Camera r1 = r0.A02     // Catch:{ all -> 0x0158 }
            if (r1 == 0) goto L_0x0156
            int r5 = r0.getDisplayOrientation()     // Catch:{ all -> 0x0158 }
            android.hardware.Camera r1 = r0.A02     // Catch:{ RuntimeException -> 0x0020 }
            r1.setDisplayOrientation(r5)     // Catch:{ RuntimeException -> 0x0020 }
            goto L_0x0026
        L_0x0020:
            r2 = move-exception
            java.lang.String r1 = "bloks_camera/startpreview/setdisplayorientation "
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0158 }
        L_0x0026:
            android.hardware.Camera r1 = r0.A02     // Catch:{ all -> 0x0158 }
            android.hardware.Camera$Parameters r3 = r1.getParameters()     // Catch:{ all -> 0x0158 }
            r3.setRotation(r5)     // Catch:{ all -> 0x0158 }
            java.util.List r5 = r3.getSupportedFocusModes()     // Catch:{ all -> 0x0158 }
            if (r5 == 0) goto L_0x0086
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = "bloks_camera/startpreview supported focus:"
            r2.append(r1)     // Catch:{ all -> 0x0158 }
            java.lang.Object[] r1 = r5.toArray()     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = java.util.Arrays.deepToString(r1)     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)     // Catch:{ all -> 0x0158 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "continuous-picture"
            boolean r1 = r5.contains(r2)     // Catch:{ all -> 0x0158 }
            if (r1 != 0) goto L_0x006d
            java.lang.String r2 = "auto"
            boolean r1 = r5.contains(r2)     // Catch:{ all -> 0x0158 }
            if (r1 != 0) goto L_0x006d
            java.lang.String r2 = "macro"
            boolean r1 = r5.contains(r2)     // Catch:{ all -> 0x0158 }
            if (r1 != 0) goto L_0x006d
            java.lang.String r2 = "edof"
            boolean r1 = r5.contains(r2)     // Catch:{ all -> 0x0158 }
            if (r1 == 0) goto L_0x0070
        L_0x006d:
            r3.setFocusMode(r2)     // Catch:{ all -> 0x0158 }
        L_0x0070:
            int r5 = r0.A01     // Catch:{ all -> 0x0158 }
            if (r5 <= 0) goto L_0x0142
            int r11 = r0.A00     // Catch:{ all -> 0x0158 }
            if (r11 <= 0) goto L_0x0142
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ all -> 0x0158 }
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch:{ all -> 0x0158 }
            int r2 = r1.orientation     // Catch:{ all -> 0x0158 }
            r1 = 1
            if (r2 != r1) goto L_0x008c
            goto L_0x009c
        L_0x0086:
            java.lang.String r1 = "bloks_camera/startpreview supported focus:null"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0158 }
            goto L_0x0070
        L_0x008c:
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ all -> 0x0158 }
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch:{ all -> 0x0158 }
            int r2 = r1.orientation     // Catch:{ all -> 0x0158 }
            r1 = 2
            if (r2 != r1) goto L_0x00a0
            double r8 = (double) r5     // Catch:{ all -> 0x0158 }
            double r1 = (double) r11     // Catch:{ all -> 0x0158 }
            goto L_0x009e
        L_0x009c:
            double r8 = (double) r11     // Catch:{ all -> 0x0158 }
            double r1 = (double) r5     // Catch:{ all -> 0x0158 }
        L_0x009e:
            double r8 = r8 / r1
            goto L_0x00a2
        L_0x00a0:
            r8 = 0
        L_0x00a2:
            java.util.List r20 = r3.getSupportedPreviewSizes()     // Catch:{ all -> 0x0158 }
            java.util.Iterator r19 = r20.iterator()     // Catch:{ all -> 0x0158 }
            r17 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r7 = 0
            r15 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x00b5:
            boolean r1 = r19.hasNext()     // Catch:{ all -> 0x0158 }
            if (r1 == 0) goto L_0x00e4
            java.lang.Object r10 = r19.next()     // Catch:{ all -> 0x0158 }
            android.hardware.Camera$Size r10 = (android.hardware.Camera.Size) r10     // Catch:{ all -> 0x0158 }
            int r1 = r10.width     // Catch:{ all -> 0x0158 }
            double r5 = (double) r1     // Catch:{ all -> 0x0158 }
            int r12 = r10.height     // Catch:{ all -> 0x0158 }
            double r1 = (double) r12     // Catch:{ all -> 0x0158 }
            double r5 = r5 / r1
            double r5 = r5 - r8
            double r13 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0158 }
            r5 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x00b5
            int r1 = r11 - r12
            int r1 = java.lang.Math.abs(r1)     // Catch:{ all -> 0x0158 }
            double r5 = (double) r1     // Catch:{ all -> 0x0158 }
            int r1 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b5
            r15 = r5
            r7 = r10
            goto L_0x00b5
        L_0x00e4:
            if (r7 != 0) goto L_0x0112
            java.lang.String r1 = "bloks_camera/getOptimalSize optimalSize under tolerance not found"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0158 }
            java.util.Iterator r11 = r20.iterator()     // Catch:{ all -> 0x0158 }
        L_0x00ef:
            boolean r1 = r11.hasNext()     // Catch:{ all -> 0x0158 }
            if (r1 == 0) goto L_0x010f
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x0158 }
            android.hardware.Camera$Size r10 = (android.hardware.Camera.Size) r10     // Catch:{ all -> 0x0158 }
            int r1 = r10.width     // Catch:{ all -> 0x0158 }
            double r5 = (double) r1     // Catch:{ all -> 0x0158 }
            int r1 = r10.height     // Catch:{ all -> 0x0158 }
            double r1 = (double) r1     // Catch:{ all -> 0x0158 }
            double r5 = r5 / r1
            double r5 = r5 - r8
            double r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0158 }
            int r1 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ef
            r7 = r10
            r17 = r5
            goto L_0x00ef
        L_0x010f:
            if (r7 != 0) goto L_0x0112
            goto L_0x013d
        L_0x0112:
            int r2 = r7.width     // Catch:{ all -> 0x0158 }
            int r1 = r7.height     // Catch:{ all -> 0x0158 }
            r3.setPreviewSize(r2, r1)     // Catch:{ all -> 0x0158 }
            int r2 = r7.width     // Catch:{ all -> 0x0158 }
            int r1 = r7.height     // Catch:{ all -> 0x0158 }
            r3.setPictureSize(r2, r1)     // Catch:{ all -> 0x0158 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = "bloks_camera/preview and picture size width : "
            r2.append(r1)     // Catch:{ all -> 0x0158 }
            int r1 = r7.width     // Catch:{ all -> 0x0158 }
            r2.append(r1)     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = "height :"
            r2.append(r1)     // Catch:{ all -> 0x0158 }
            int r1 = r7.height     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = X.AnonymousClass000.A0l(r2, r1)     // Catch:{ all -> 0x0158 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0158 }
            goto L_0x0142
        L_0x013d:
            java.lang.String r1 = "bloks_camera/startpreview optimal size not found"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0158 }
        L_0x0142:
            android.hardware.Camera r1 = r0.A02     // Catch:{ all -> 0x0158 }
            r1.setParameters(r3)     // Catch:{ all -> 0x0158 }
            android.hardware.Camera r1 = r0.A02     // Catch:{ Exception -> 0x0152 }
            r1.setPreviewDisplay(r4)     // Catch:{ Exception -> 0x0152 }
            android.hardware.Camera r1 = r0.A02     // Catch:{ Exception -> 0x0152 }
            r1.startPreview()     // Catch:{ Exception -> 0x0152 }
            goto L_0x0156
        L_0x0152:
            r1 = move-exception
            r1.getMessage()     // Catch:{ all -> 0x0158 }
        L_0x0156:
            monitor-exit(r0)
            return
        L_0x0158:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111585h1.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
