package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Display;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.AssemMods.translator.Language;
import com.facebook.redex.IDxECallbackShape319S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0100002_I0;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Qp  reason: invalid class name and case insensitive filesystem */
public class C49062Qp extends C49072Qq implements AnonymousClass2Qt, SurfaceHolder.Callback {
    public static final String[] A0a = {"GT-I9195", "GT-I9190", "GT-I9192"};
    public static final String[] A0b = {"GT-I9505", "GT-I9506", "GT-I9505G", "SGH-I337", "SGH-M919", "SCH-I545", "SPH-L720", "SCH-R970", "GT-I9508", "SGH-N045", "SC-04E"};
    public int A00;
    public int A01;
    public int A02;
    public SurfaceTexture A03;
    public Camera.Size A04;
    public Camera.Size A05;
    public Camera.Size A06;
    public Camera A07;
    public MediaRecorder A08;
    public Handler A09;
    public HandlerThread A0A;
    public AnonymousClass0WP A0B;
    public AnonymousClass0PU A0C;
    public AnonymousClass0S9 A0D;
    public AnonymousClass0S9 A0E;
    public AnonymousClass2V3 A0F;
    public AnonymousClass01V A0G;
    public C16260sj A0H;
    public AnonymousClass1DX A0I;
    public C17020u3 A0J;
    public String A0K;
    public List A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public byte[] A0S;
    public final Handler A0T = new Handler(Looper.getMainLooper());
    public final Display A0U;
    public final SurfaceHolder A0V;
    public final C101204wt A0W;
    public final C63943Md A0X;
    public final AnonymousClass4V6 A0Y;
    public final float[] A0Z = new float[16];

    public C49062Qp(Context context) {
        super(context);
        C101204wt r3 = new C101204wt(this);
        this.A0W = r3;
        SharedPreferences sharedPreferences = getSharedPreferences();
        this.A00 = sharedPreferences.getInt("camera_index", 0);
        this.A0K = sharedPreferences.getString("flash_mode", "off");
        SurfaceHolder holder = getHolder();
        this.A0V = holder;
        holder.addCallback(this);
        holder.setType(3);
        this.A0U = AnonymousClass01V.A02(context).getDefaultDisplay();
        this.A0X = new C63943Md(context, this);
        this.A0Y = new AnonymousClass4V6(new C101194ws(this), r3, 5);
    }

    public static int A00(float f2) {
        if (f2 < -995.0f) {
            f2 = -995.0f;
        } else if (f2 > 995.0f) {
            f2 = 995.0f;
        }
        return (int) f2;
    }

    public static Camera.Size A01(List list, int i2, int i3) {
        int i4 = i2;
        double d2 = (double) i4;
        int i5 = i3;
        double d3 = d2 / ((double) i5);
        Camera.Size size = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Camera.Size size2 = (Camera.Size) it.next();
                int i6 = size2.width;
                double d4 = (double) i6;
                int i7 = size2.height;
                double d5 = d4 / ((double) i7);
                double d6 = d4 / d2;
                if (i6 * i7 >= 153600 && d6 <= 1.5d && Math.abs(d5 - d3) <= 0.1d && A04(size2, size, i4, i5)) {
                    size = size2;
                }
            }
            if (size == null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Camera.Size size3 = (Camera.Size) it2.next();
                    if (((double) size3.width) / d2 <= 1.5d && A04(size3, size, i4, i5)) {
                        size = size3;
                    }
                }
                if (size == null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Camera.Size size4 = (Camera.Size) it3.next();
                        if (A04(size4, size, i4, i5)) {
                            size = size4;
                        }
                    }
                }
            }
        }
        return size;
    }

    public static String A02(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Camera.Size size = (Camera.Size) it.next();
            sb.append(size.width);
            sb.append('x');
            sb.append(size.height);
            sb.append(", ");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 2);
        }
        return sb.toString();
    }

    public static /* synthetic */ void A03(C49062Qp r5) {
        synchronized (r5) {
            Camera camera = r5.A07;
            if (camera == null) {
                try {
                    if (r5.A00 >= Camera.getNumberOfCameras()) {
                        r5.A00 = Camera.getNumberOfCameras() - 1;
                    }
                    Camera open = Camera.open(r5.A00);
                    r5.A07 = open;
                    open.setErrorCallback(new IDxECallbackShape319S0100000_2_I0(r5, 0));
                } catch (Exception e2) {
                    Camera camera2 = r5.A07;
                    if (camera2 != null) {
                        camera2.release();
                    }
                    r5.A07 = null;
                    Log.e("cameraview/start-camera error opening camera", e2);
                    if (r5.A00 != 0) {
                        r5.getSharedPreferences().edit().putInt("camera_index", 0).apply();
                    }
                    r5.A08(e2);
                }
                Camera camera3 = r5.A07;
                if (camera3 != null) {
                    try {
                        camera3.setPreviewDisplay(r5.A0V);
                        r5.A06();
                    } catch (IOException | RuntimeException e3) {
                        r5.A07.release();
                        r5.A07 = null;
                        Log.e("cameraview/start-camera", e3);
                        if (r5.A00 != 0) {
                            r5.getSharedPreferences().edit().putInt("camera_index", 0).apply();
                        }
                        r5.A08(e3);
                    }
                }
            } else {
                try {
                    camera.reconnect();
                } catch (IOException e4) {
                    r5.A07.release();
                    r5.A07 = null;
                    Log.e("cameraview/start-camera error reconnecting camera", e4);
                    r5.A08(e4);
                }
            }
        }
        return;
    }

    public static boolean A04(Camera.Size size, Camera.Size size2, int i2, int i3) {
        if (size2 == null) {
            return true;
        }
        return (Math.abs(size.height - i3) * i2) + (Math.abs(size.width - i2) * i3) < (Math.abs(size2.height - i3) * i2) + (Math.abs(size2.width - i2) * i3);
    }

    private Camera.CameraInfo getCameraInfo() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.A00, cameraInfo);
        return cameraInfo;
    }

    private List getFallbackSupportedPreviewSizes() {
        Log.i("cameraview/fallback-supported-preview-sizes");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Camera.Size(this.A07, 640, 480));
        return arrayList;
    }

    private int getRequiredCameraRotation() {
        int rotation = this.A0U.getRotation();
        Camera.CameraInfo cameraInfo = getCameraInfo();
        int i2 = 0;
        boolean z2 = false;
        if (cameraInfo.facing == 1) {
            z2 = true;
        }
        this.A0N = z2;
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
        int i4 = i3 - i2;
        if (z2) {
            i4 = i3 + i2;
        }
        int i5 = (i4 + 360) % 360;
        StringBuilder sb = new StringBuilder("cameraview/orientation display:");
        sb.append(i2);
        sb.append(" camera:");
        sb.append(i3);
        sb.append(" rotate:");
        sb.append(i5);
        Log.i(sb.toString());
        return i5;
    }

    private SharedPreferences getSharedPreferences() {
        return this.A0J.A00(AnonymousClass01S.A07);
    }

    public final void A05() {
        MediaRecorder mediaRecorder = this.A08;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.A08.release();
            this.A08 = null;
            this.A0P = false;
            Camera camera = this.A07;
            if (camera != null) {
                try {
                    camera.lock();
                    Camera.Parameters parameters = this.A07.getParameters();
                    parameters.getFlashMode();
                    if ("torch".equals(parameters.getFlashMode())) {
                        parameters.setFlashMode("off");
                        this.A07.setParameters(parameters);
                        this.A07.stopPreview();
                        this.A0M = false;
                    }
                } catch (RuntimeException e2) {
                    Log.e("failed to lock the camera, it's in use by another process or WhatsApp video call.", e2);
                }
            }
        }
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A03 = null;
        }
        AnonymousClass0S9 r2 = this.A0D;
        if (r2 != null) {
            r2.A03();
            Surface surface = r2.A01;
            if (surface != null) {
                if (r2.A03) {
                    surface.release();
                }
                r2.A01 = null;
            }
            this.A0D = null;
        }
        AnonymousClass0PU r1 = this.A0C;
        if (r1 != null) {
            if (r1.A00 != null) {
                r1.A00 = null;
            }
            this.A0C = null;
        }
        AnonymousClass0S9 r22 = this.A0E;
        if (r22 != null) {
            r22.A03();
            Surface surface2 = r22.A01;
            if (surface2 != null) {
                if (r22.A03) {
                    surface2.release();
                }
                r22.A01 = null;
            }
            this.A0E = null;
        }
        AnonymousClass0WP r0 = this.A0B;
        if (r0 != null) {
            r0.A03();
            this.A0B = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x014f, code lost:
        if (r9 != 3) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r9 == 2) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0332 A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x037e A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03bb A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03e7 A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03fc A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0154 A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x016c A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01cb A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01f4 A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0200 A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0283 A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02ca A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02f8 A[Catch:{ RuntimeException -> 0x01b4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A06() {
        /*
            r21 = this;
            r18 = r21
            monitor-enter(r18)
            int r12 = r18.getWidth()     // Catch:{ all -> 0x0409 }
            int r11 = r18.getHeight()     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r1.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "cameraview/start-preview view:"
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            r1.append(r12)     // Catch:{ all -> 0x0409 }
            java.lang.String r10 = "x"
            r1.append(r10)     // Catch:{ all -> 0x0409 }
            r1.append(r11)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0409 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
            r0 = r18
            android.hardware.Camera r0 = r0.A07     // Catch:{ all -> 0x0409 }
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "cameraview/start-preview camera is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "CameraCustomException: Camera is null"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0409 }
            r1.<init>(r0)     // Catch:{ all -> 0x0409 }
            r0 = r18
            r0.A08(r1)     // Catch:{ all -> 0x0409 }
            goto L_0x03ff
        L_0x0041:
            r0 = r18
            android.view.Display r0 = r0.A0U     // Catch:{ all -> 0x0409 }
            int r9 = r0.getRotation()     // Catch:{ all -> 0x0409 }
            r0 = 2
            r1 = 1
            if (r9 == 0) goto L_0x0050
            r8 = 0
            if (r9 != r0) goto L_0x0051
        L_0x0050:
            r8 = 1
        L_0x0051:
            r0 = r18
            android.hardware.Camera r0 = r0.A07     // Catch:{ all -> 0x0409 }
            android.hardware.Camera$Parameters r7 = r0.getParameters()     // Catch:{ all -> 0x0409 }
            java.util.List r3 = r7.getSupportedPreviewSizes()     // Catch:{ all -> 0x0409 }
            r0 = r18
            r0.A0L = r3     // Catch:{ all -> 0x0409 }
            if (r3 != 0) goto L_0x0069
            java.util.List r3 = r18.getFallbackSupportedPreviewSizes()     // Catch:{ all -> 0x0409 }
            r0.A0L = r3     // Catch:{ all -> 0x0409 }
        L_0x0069:
            r2 = r12
            r0 = r11
            if (r8 == 0) goto L_0x006f
            r2 = r11
            r0 = r12
        L_0x006f:
            android.hardware.Camera$Size r2 = A01(r3, r2, r0)     // Catch:{ all -> 0x0409 }
            r0 = r18
            r0.A04 = r2     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x0409 }
            if (r0 != 0) goto L_0x0083
            java.lang.String r2 = r7.getFlashMode()     // Catch:{ all -> 0x0409 }
            r0 = r18
            r0.A0K = r2     // Catch:{ all -> 0x0409 }
        L_0x0083:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r2.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "cameraview/start-preview preview sizes:"
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            r0 = r18
            java.util.List r0 = r0.A0L     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = A02(r0)     // Catch:{ all -> 0x0409 }
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0409 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
            r0 = r18
            android.hardware.Camera$Size r3 = r0.A04     // Catch:{ all -> 0x0409 }
            if (r3 == 0) goto L_0x0401
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r2.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "cameraview/start-preview optimal preview size:"
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            int r0 = r3.width     // Catch:{ all -> 0x0409 }
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            r2.append(r10)     // Catch:{ all -> 0x0409 }
            int r0 = r3.height     // Catch:{ all -> 0x0409 }
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0409 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
            android.hardware.Camera$CameraInfo r17 = r18.getCameraInfo()     // Catch:{ all -> 0x0409 }
            r0 = r17
            int r0 = r0.facing     // Catch:{ all -> 0x0409 }
            r6 = 0
            if (r0 != r1) goto L_0x00cf
            r6 = 1
        L_0x00cf:
            r0 = r18
            r0.A0N = r6     // Catch:{ all -> 0x0409 }
            double r4 = (double) r12     // Catch:{ all -> 0x0409 }
            double r2 = (double) r11     // Catch:{ all -> 0x0409 }
            double r15 = r4 / r2
            android.hardware.Camera$Size r13 = r0.A04     // Catch:{ all -> 0x0409 }
            int r0 = r13.width     // Catch:{ all -> 0x0409 }
            r20 = r0
            double r0 = (double) r0     // Catch:{ all -> 0x0409 }
            int r13 = r13.height     // Catch:{ all -> 0x0409 }
            r19 = r13
            double r13 = (double) r13     // Catch:{ all -> 0x0409 }
            double r0 = r0 / r13
            double r15 = r15 - r0
            double r13 = java.lang.Math.abs(r15)     // Catch:{ all -> 0x0409 }
            double r2 = r2 / r4
            double r2 = r2 - r0
            double r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0409 }
            double r0 = java.lang.Math.min(r13, r0)     // Catch:{ all -> 0x0409 }
            r3 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0140
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r3.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r2 = "cameraview/start-preview request layout to match preview size:"
            r3.append(r2)     // Catch:{ all -> 0x0409 }
            r2 = r20
            r3.append(r2)     // Catch:{ all -> 0x0409 }
            r3.append(r10)     // Catch:{ all -> 0x0409 }
            r2 = r19
            r3.append(r2)     // Catch:{ all -> 0x0409 }
            java.lang.String r2 = " (view is "
            r3.append(r2)     // Catch:{ all -> 0x0409 }
            r3.append(r12)     // Catch:{ all -> 0x0409 }
            r3.append(r10)     // Catch:{ all -> 0x0409 }
            r3.append(r11)     // Catch:{ all -> 0x0409 }
            java.lang.String r2 = ") aspect diff is "
            r3.append(r2)     // Catch:{ all -> 0x0409 }
            r3.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0409 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
            r0 = r18
            android.os.Handler r3 = r0.A0T     // Catch:{ all -> 0x0409 }
            r2 = 16
            com.facebook.redex.RunnableRunnableShape5S0100000_I0_4 r1 = new com.facebook.redex.RunnableRunnableShape5S0100000_I0_4     // Catch:{ all -> 0x0409 }
            r1.<init>((java.lang.Object) r0, (int) r2)     // Catch:{ all -> 0x0409 }
            r3.post(r1)     // Catch:{ all -> 0x0409 }
            goto L_0x03ff
        L_0x0140:
            r0 = r17
            int r3 = r0.orientation     // Catch:{ all -> 0x0409 }
            r1 = 3
            if (r9 == 0) goto L_0x0151
            r0 = 1
            if (r9 == r0) goto L_0x0158
            r0 = 2
            if (r9 == r0) goto L_0x0155
            r4 = 270(0x10e, float:3.78E-43)
            if (r9 == r1) goto L_0x0152
        L_0x0151:
            r4 = 0
        L_0x0152:
            if (r6 == 0) goto L_0x016c
            goto L_0x015b
        L_0x0155:
            r4 = 180(0xb4, float:2.52E-43)
            goto L_0x0152
        L_0x0158:
            r4 = 90
            goto L_0x0152
        L_0x015b:
            int r0 = r3 + r4
            int r1 = r0 % 360
            r0 = r18
            r0.A01 = r1     // Catch:{ all -> 0x0409 }
            int r0 = 360 - r1
            int r2 = r0 % 360
            r0 = r18
            r0.A01 = r2     // Catch:{ all -> 0x0409 }
            goto L_0x0176
        L_0x016c:
            int r0 = r3 - r4
            int r0 = r0 + 360
            int r2 = r0 % 360
            r0 = r18
            r0.A01 = r2     // Catch:{ all -> 0x0409 }
        L_0x0176:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r1.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "cameraview/start-preview display:"
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            r1.append(r4)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = " camera:"
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            r1.append(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = " preview:"
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            r1.append(r2)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = " front:"
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            r1.append(r6)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = " portrait:"
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            r1.append(r8)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0409 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
            r0 = r18
            android.hardware.Camera r1 = r0.A07     // Catch:{ RuntimeException -> 0x01b4 }
            int r0 = r0.A01     // Catch:{ RuntimeException -> 0x01b4 }
            r1.setDisplayOrientation(r0)     // Catch:{ RuntimeException -> 0x01b4 }
            goto L_0x01ba
        L_0x01b4:
            r1 = move-exception
            java.lang.String r0 = "cameraview/start-preview/setdisplayorientation "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0409 }
        L_0x01ba:
            r0 = r18
            android.hardware.Camera$Size r0 = r0.A04     // Catch:{ all -> 0x0409 }
            int r1 = r0.width     // Catch:{ all -> 0x0409 }
            int r0 = r0.height     // Catch:{ all -> 0x0409 }
            r7.setPreviewSize(r1, r0)     // Catch:{ all -> 0x0409 }
            java.util.List r2 = r7.getSupportedFocusModes()     // Catch:{ all -> 0x0409 }
            if (r2 == 0) goto L_0x01f4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r1.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "cameraview/start-preview supported focus:"
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.Object[] r0 = r2.toArray()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x0409 }
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0409 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r1 = "continuous-picture"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x01f9
            r7.setFocusMode(r1)     // Catch:{ all -> 0x0409 }
            r14 = 1
            goto L_0x01fa
        L_0x01f4:
            java.lang.String r0 = "cameraview/start-preview supported focus:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
        L_0x01f9:
            r14 = 0
        L_0x01fa:
            java.util.List r2 = r7.getSupportedFlashModes()     // Catch:{ all -> 0x0409 }
            if (r2 == 0) goto L_0x02ca
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r1.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "cameraview/start-preview supported flash:"
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.Object[] r0 = r2.toArray()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x0409 }
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0409 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "torch"
            boolean r1 = r2.contains(r0)     // Catch:{ all -> 0x0409 }
            r0 = r18
            r0.A0Q = r1     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0250
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x02e0
            r0 = r18
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x0409 }
            r7.setFlashMode(r0)     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r1.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "cameraview/start-preview set flash mode:"
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            r0 = r18
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x0409 }
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0409 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
        L_0x0250:
            java.util.List r6 = r7.getSupportedPictureSizes()     // Catch:{ all -> 0x0409 }
            r1 = 13
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0     // Catch:{ all -> 0x0409 }
            r0.<init>(r1)     // Catch:{ all -> 0x0409 }
            java.util.Collections.sort(r6, r0)     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r1.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "cameraview/start-preview picture sizes:"
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = A02(r6)     // Catch:{ all -> 0x0409 }
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0409 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
            r3 = 640(0x280, float:8.97E-43)
            r2 = 480(0x1e0, float:6.73E-43)
            r0 = r18
            android.hardware.Camera$Size r1 = r0.A04     // Catch:{ all -> 0x0409 }
            r9 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r1 == 0) goto L_0x02f8
            int r0 = r1.height     // Catch:{ all -> 0x0409 }
            float r4 = (float) r0     // Catch:{ all -> 0x0409 }
            int r0 = r1.width     // Catch:{ all -> 0x0409 }
            float r0 = (float) r0     // Catch:{ all -> 0x0409 }
            float r4 = r4 / r0
            java.util.Iterator r13 = r6.iterator()     // Catch:{ all -> 0x0409 }
            r12 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r11 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0294:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0317
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x0409 }
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0     // Catch:{ all -> 0x0409 }
            int r8 = r0.width     // Catch:{ all -> 0x0409 }
            int r5 = r0.height     // Catch:{ all -> 0x0409 }
            int r1 = r8 * r5
            if (r1 >= r9) goto L_0x0294
            int r0 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x02b3
            int r1 = r1 << 1
            int r0 = r3 * r2
            if (r1 >= r0) goto L_0x02b3
            goto L_0x0317
        L_0x02b3:
            float r1 = (float) r5     // Catch:{ all -> 0x0409 }
            float r0 = (float) r8     // Catch:{ all -> 0x0409 }
            float r1 = r1 / r0
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)     // Catch:{ all -> 0x0409 }
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0294
            r2 = r5
            r3 = r8
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0317
            r11 = r1
            goto L_0x0294
        L_0x02ca:
            java.lang.String r0 = "cameraview/start-preview supported flash:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
            java.util.List r1 = r18.getFlashModes()     // Catch:{ all -> 0x0409 }
            r0 = r18
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x0409 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0409 }
            if (r0 != 0) goto L_0x0250
            java.lang.String r1 = "off"
            goto L_0x02f2
        L_0x02e0:
            java.util.List r1 = r18.getFlashModes()     // Catch:{ all -> 0x0409 }
            r0 = r18
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x0409 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0409 }
            if (r0 != 0) goto L_0x0250
            java.lang.String r1 = r7.getFlashMode()     // Catch:{ all -> 0x0409 }
        L_0x02f2:
            r0 = r18
            r0.A0K = r1     // Catch:{ all -> 0x0409 }
            goto L_0x0250
        L_0x02f8:
            java.util.Iterator r8 = r6.iterator()     // Catch:{ all -> 0x0409 }
        L_0x02fc:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0317
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0409 }
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0     // Catch:{ all -> 0x0409 }
            int r5 = r0.width     // Catch:{ all -> 0x0409 }
            int r4 = r0.height     // Catch:{ all -> 0x0409 }
            int r1 = r5 * r4
            int r0 = r3 * r2
            if (r1 <= r0) goto L_0x02fc
            if (r1 >= r9) goto L_0x02fc
            r2 = r4
            r3 = r5
            goto L_0x02fc
        L_0x0317:
            r0 = r18
            boolean r0 = r0.A0N     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x034e
            java.lang.String r1 = "samsung"
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0409 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x034e
            java.lang.String[] r1 = A0a     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ all -> 0x0409 }
            boolean r0 = X.C43041zF.A03(r0, r1)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x034e
            r0 = r18
            android.hardware.Camera r5 = r0.A07     // Catch:{ all -> 0x0409 }
            r1 = 1280(0x500, float:1.794E-42)
            r0 = 720(0x2d0, float:1.009E-42)
            android.hardware.Camera$Size r4 = new android.hardware.Camera$Size     // Catch:{ all -> 0x0409 }
            r4.<init>(r5, r1, r0)     // Catch:{ all -> 0x0409 }
            boolean r0 = r6.contains(r4)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x03c8
            int r3 = r4.width     // Catch:{ all -> 0x0409 }
            int r2 = r4.height     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "cameraview/start-preview workaround s4 mini preview size"
        L_0x034b:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
        L_0x034e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r1.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "cameraview/start-preview picture size "
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            r1.append(r3)     // Catch:{ all -> 0x0409 }
            r1.append(r10)     // Catch:{ all -> 0x0409 }
            r1.append(r2)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0409 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0409 }
            r7.setPictureSize(r3, r2)     // Catch:{ all -> 0x0409 }
            r0 = r18
            android.hardware.Camera r0 = r0.A07     // Catch:{ all -> 0x0409 }
            r0.setParameters(r7)     // Catch:{ all -> 0x0409 }
            r0 = r18
            boolean r0 = r0.A0N     // Catch:{ all -> 0x0409 }
            if (r0 != 0) goto L_0x03bb
            r0 = r18
            boolean r0 = r0.A0O     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x03bb
            r0 = r18
            android.hardware.Camera r1 = r0.A07     // Catch:{ all -> 0x0409 }
            r0 = 0
            r1.setPreviewCallbackWithBuffer(r0)     // Catch:{ all -> 0x0409 }
            r0 = r18
            android.hardware.Camera r2 = r0.A07     // Catch:{ all -> 0x0409 }
            X.4gJ r1 = new X.4gJ     // Catch:{ all -> 0x0409 }
            r1.<init>(r0)     // Catch:{ all -> 0x0409 }
            r2.setPreviewCallbackWithBuffer(r1)     // Catch:{ all -> 0x0409 }
            android.hardware.Camera$Size r0 = r0.A04     // Catch:{ all -> 0x0409 }
            int r1 = r0.width     // Catch:{ all -> 0x0409 }
            int r0 = r0.height     // Catch:{ all -> 0x0409 }
            int r1 = r1 * r0
            int r2 = r1 * 3
            r0 = 2
            int r2 = r2 / r0
            r0 = r18
            byte[] r1 = r0.A0S     // Catch:{ all -> 0x0409 }
            if (r1 == 0) goto L_0x03a6
            int r0 = r1.length     // Catch:{ all -> 0x0409 }
            if (r0 == r2) goto L_0x03ac
        L_0x03a6:
            byte[] r1 = new byte[r2]     // Catch:{ all -> 0x0409 }
            r0 = r18
            r0.A0S = r1     // Catch:{ all -> 0x0409 }
        L_0x03ac:
            r0 = r18
            android.hardware.Camera r0 = r0.A07     // Catch:{ all -> 0x0409 }
            r0.addCallbackBuffer(r1)     // Catch:{ all -> 0x0409 }
        L_0x03b3:
            r0 = r18
            android.hardware.Camera r0 = r0.A07     // Catch:{ all -> 0x0409 }
            r0.startPreview()     // Catch:{ all -> 0x0409 }
            goto L_0x03e5
        L_0x03bb:
            r0 = r18
            android.hardware.Camera r2 = r0.A07     // Catch:{ all -> 0x0409 }
            X.4gH r1 = new X.4gH     // Catch:{ all -> 0x0409 }
            r1.<init>(r0)     // Catch:{ all -> 0x0409 }
            r2.setOneShotPreviewCallback(r1)     // Catch:{ all -> 0x0409 }
            goto L_0x03b3
        L_0x03c8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r1.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "cameraview/start-preview could not workaround s4 mini preview size "
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            int r0 = r4.width     // Catch:{ all -> 0x0409 }
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            r1.append(r10)     // Catch:{ all -> 0x0409 }
            int r0 = r4.height     // Catch:{ all -> 0x0409 }
            r1.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0409 }
            goto L_0x034b
        L_0x03e5:
            if (r14 != 0) goto L_0x03f3
            r0 = r18
            android.hardware.Camera r1 = r0.A07     // Catch:{ all -> 0x0409 }
            X.4gE r0 = new X.4gE     // Catch:{ all -> 0x0409 }
            r0.<init>()     // Catch:{ all -> 0x0409 }
            r1.autoFocus(r0)     // Catch:{ all -> 0x0409 }
        L_0x03f3:
            r1 = 1
            r0 = r18
            r0.A0M = r1     // Catch:{ all -> 0x0409 }
            X.2V3 r0 = r0.A0F     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x03ff
            r0.AVG()     // Catch:{ all -> 0x0409 }
        L_0x03ff:
            monitor-exit(r18)
            return
        L_0x0401:
            java.lang.String r1 = "previewSize is NULL"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0409 }
            r0.<init>(r1)     // Catch:{ all -> 0x0409 }
            throw r0     // Catch:{ all -> 0x0409 }
        L_0x0409:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49062Qp.A06():void");
    }

    public final synchronized void A07() {
        Log.i("cameraview/stop-camera");
        Camera camera = this.A07;
        if (camera != null) {
            try {
                camera.stopPreview();
                this.A0M = false;
            } catch (Exception e2) {
                Log.w("cameraview/stop-camera error stopping camera preview", e2);
            }
            try {
                this.A07.release();
            } catch (Exception e3) {
                Log.w("cameraview/stop-camera error releasing camera", e3);
            }
            this.A07 = null;
        }
        Log.i("cameraview/stop-camera-end");
        return;
    }

    public final void A08(Exception exc) {
        StringBuilder sb = new StringBuilder("cameraview/on-error ");
        sb.append(1);
        Log.i(sb.toString());
        AnonymousClass2V3 r0 = this.A0F;
        if (r0 != null) {
            r0.AO0(exc, 1);
        }
    }

    public void A6D() {
        AnonymousClass4V6 r1 = this.A0Y;
        synchronized (r1) {
            r1.A00 = null;
        }
    }

    public void A9A(float f2, float f3) {
        this.A09.post(new RunnableRunnableShape0S0100002_I0(this, f2, f3, 1));
    }

    public boolean AIs() {
        return this.A0N;
    }

    public boolean AIv() {
        return this.A0M;
    }

    public boolean AJZ() {
        return this.A0P;
    }

    public boolean AJl() {
        Camera camera = this.A07;
        if (camera == null || !this.A0Q) {
            return false;
        }
        return "torch".equals(camera.getParameters().getFlashMode());
    }

    public boolean ALf() {
        Camera camera;
        if (!this.A0N || !"on".equals(this.A0K) || (camera = this.A07) == null) {
            return false;
        }
        List<String> supportedFlashModes = camera.getParameters().getSupportedFlashModes();
        return supportedFlashModes == null || !supportedFlashModes.contains(this.A0K);
    }

    public synchronized void ALm() {
        Log.i("cameraview/next-camera");
        if (this.A07 != null) {
            boolean z2 = true;
            if (Camera.getNumberOfCameras() > 1) {
                this.A00 = (this.A00 + 1) % Camera.getNumberOfCameras();
                if (getCameraInfo().facing != 1) {
                    z2 = false;
                }
                this.A0N = z2;
                A07();
                this.A09.post(new RunnableRunnableShape5S0100000_I0_4((Object) this, 18));
                getSharedPreferences().edit().putInt("camera_index", this.A00).apply();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r1 = "off";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String ALn() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.hardware.Camera r0 = r4.A07     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x0008
            java.lang.String r1 = "off"
            goto L_0x007c
        L_0x0008:
            java.util.List r2 = r4.getFlashModes()     // Catch:{ all -> 0x007e }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = "off"
            goto L_0x007c
        L_0x0015:
            android.hardware.Camera r0 = r4.A07     // Catch:{ all -> 0x007e }
            android.hardware.Camera$Parameters r3 = r0.getParameters()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x007e }
            int r0 = r2.indexOf(r0)     // Catch:{ all -> 0x007e }
            if (r0 >= 0) goto L_0x002c
            java.lang.String r1 = "off"
            int r0 = r2.indexOf(r1)     // Catch:{ all -> 0x007e }
            if (r0 >= 0) goto L_0x002c
            goto L_0x007c
        L_0x002c:
            int r1 = r0 + 1
            int r0 = r2.size()     // Catch:{ all -> 0x007e }
            int r1 = r1 % r0
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x007e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x007e }
            r4.A0K = r2     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r1.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "cameraview/next flash mode:"
            r1.append(r0)     // Catch:{ all -> 0x007e }
            r1.append(r2)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x007e }
            java.util.List r1 = r3.getSupportedFlashModes()     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0067
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x007e }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x007e }
            r3.setFlashMode(r0)     // Catch:{ all -> 0x007e }
            android.hardware.Camera r0 = r4.A07     // Catch:{ all -> 0x007e }
            r0.setParameters(r3)     // Catch:{ all -> 0x007e }
        L_0x0067:
            android.content.SharedPreferences r0 = r4.getSharedPreferences()     // Catch:{ all -> 0x007e }
            android.content.SharedPreferences$Editor r2 = r0.edit()     // Catch:{ all -> 0x007e }
            java.lang.String r1 = "flash_mode"
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x007e }
            android.content.SharedPreferences$Editor r0 = r2.putString(r1, r0)     // Catch:{ all -> 0x007e }
            r0.apply()     // Catch:{ all -> 0x007e }
            java.lang.String r1 = r4.A0K     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r4)
            return r1
        L_0x007e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49062Qp.ALn():java.lang.String");
    }

    public void AcZ() {
        this.A09.post(new RunnableRunnableShape4S0200000_I0_2(this, 0, this.A0V));
    }

    public void Acc() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int Af4(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r0 == 0) goto L_0x003c
            android.hardware.Camera$Parameters r1 = r0.getParameters()     // Catch:{ all -> 0x003e }
            boolean r0 = r1.isZoomSupported()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003c
            int r0 = r1.getMaxZoom()     // Catch:{ all -> 0x003e }
            if (r4 > r0) goto L_0x003c
            int r0 = r1.getZoom()     // Catch:{ all -> 0x003e }
            if (r0 == r4) goto L_0x0024
            r1.setZoom(r4)     // Catch:{ all -> 0x003e }
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x003e }
            r0.setParameters(r1)     // Catch:{ all -> 0x003e }
        L_0x0024:
            java.util.List r1 = r1.getZoomRatios()     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x003c
            int r0 = r1.size()     // Catch:{ all -> 0x003e }
            if (r0 < r4) goto L_0x003c
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x003e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x003e }
            int r0 = r0.intValue()     // Catch:{ all -> 0x003e }
            monitor-exit(r3)
            return r0
        L_0x003c:
            monitor-exit(r3)
            return r2
        L_0x003e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49062Qp.Af4(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0310, code lost:
        if (r2.contains(r1) != false) goto L_0x0312;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02e9 A[Catch:{ IOException -> 0x0393 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0338 A[Catch:{ IOException -> 0x0393 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0348 A[Catch:{ IOException -> 0x0393 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x034d A[Catch:{ IOException -> 0x0393 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0386 A[Catch:{ IOException -> 0x0393 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03ad A[Catch:{ IOException -> 0x0393 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03df A[Catch:{ IOException -> 0x0393 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x044a A[Catch:{ IOException -> 0x0393 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04be A[SYNTHETIC, Splitter:B:184:0x04be] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x059a A[Catch:{ RuntimeException -> 0x059e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void AgF(java.io.File r26, int r27) {
        /*
            r25 = this;
            r14 = r25
            monitor-enter(r14)
            r12 = 0
            java.lang.String r0 = "cameraview/prepare-video front:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05df }
            r1.<init>(r0)     // Catch:{ all -> 0x05df }
            boolean r0 = r14.A0N     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05df }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r0 = new android.media.MediaRecorder     // Catch:{ all -> 0x05df }
            r0.<init>()     // Catch:{ all -> 0x05df }
            r14.A08 = r0     // Catch:{ all -> 0x05df }
            int r0 = r14.A00     // Catch:{ all -> 0x05df }
            r4 = 4
            boolean r1 = android.media.CamcorderProfile.hasProfile(r0, r4)     // Catch:{ all -> 0x05df }
            r3 = 5
            r2 = 1
            int r0 = r14.A00     // Catch:{ all -> 0x05df }
            if (r1 == 0) goto L_0x0030
            android.media.CamcorderProfile r9 = android.media.CamcorderProfile.get(r0, r4)     // Catch:{ all -> 0x05df }
            goto L_0x0041
        L_0x0030:
            boolean r1 = android.media.CamcorderProfile.hasProfile(r0, r3)     // Catch:{ all -> 0x05df }
            int r0 = r14.A00     // Catch:{ all -> 0x05df }
            if (r1 == 0) goto L_0x003d
            android.media.CamcorderProfile r9 = android.media.CamcorderProfile.get(r0, r3)     // Catch:{ all -> 0x05df }
            goto L_0x0041
        L_0x003d:
            android.media.CamcorderProfile r9 = android.media.CamcorderProfile.get(r0, r2)     // Catch:{ all -> 0x05df }
        L_0x0041:
            if (r9 != 0) goto L_0x0045
            goto L_0x05be
        L_0x0045:
            java.lang.String r0 = "cameraview/prepare-video profile:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05df }
            r1.<init>(r0)     // Catch:{ all -> 0x05df }
            int r0 = r9.videoFrameWidth     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r8 = "x"
            r1.append(r8)     // Catch:{ all -> 0x05df }
            int r0 = r9.videoFrameHeight     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = " videoCodec:"
            r1.append(r0)     // Catch:{ all -> 0x05df }
            int r0 = r9.videoCodec     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = " audioCodec:"
            r1.append(r0)     // Catch:{ all -> 0x05df }
            int r0 = r9.audioCodec     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = " fileFormat:"
            r1.append(r0)     // Catch:{ all -> 0x05df }
            int r0 = r9.fileFormat     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = " videoFrameRate:"
            r1.append(r0)     // Catch:{ all -> 0x05df }
            int r0 = r9.videoFrameRate     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r10 = " videoBitRate:"
            r1.append(r10)     // Catch:{ all -> 0x05df }
            int r0 = r9.videoBitRate     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05df }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            android.hardware.Camera r0 = r14.A07     // Catch:{ all -> 0x05df }
            android.hardware.Camera$Parameters r7 = r0.getParameters()     // Catch:{ all -> 0x05df }
            java.util.List r24 = r7.getSupportedPreviewSizes()     // Catch:{ all -> 0x05df }
            if (r24 != 0) goto L_0x00a5
            java.util.List r24 = r14.getFallbackSupportedPreviewSizes()     // Catch:{ all -> 0x05df }
        L_0x00a5:
            java.util.List r2 = r7.getSupportedVideoSizes()     // Catch:{ all -> 0x05df }
            if (r2 != 0) goto L_0x00ad
            r2 = r24
        L_0x00ad:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = "cameraview/prepare-video no supported video sizes"
            goto L_0x05c0
        L_0x00b7:
            r11 = 2147483647(0x7fffffff, float:NaN)
            android.hardware.Camera$Size r6 = r7.getPreferredPreviewSizeForVideo()     // Catch:{ all -> 0x05df }
            if (r6 == 0) goto L_0x0176
            java.lang.String r0 = "cameraview/prepare-video preferred video preview size:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05df }
            r1.<init>(r0)     // Catch:{ all -> 0x05df }
            int r0 = r6.width     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            r1.append(r8)     // Catch:{ all -> 0x05df }
            int r0 = r6.height     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05df }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            int r3 = r6.width     // Catch:{ all -> 0x05df }
            r0 = 176(0xb0, float:2.47E-43)
            if (r3 != r0) goto L_0x00e7
            int r1 = r6.height     // Catch:{ all -> 0x05df }
            r0 = 144(0x90, float:2.02E-43)
            if (r1 == r0) goto L_0x00ea
        L_0x00e7:
            int r11 = r6.height     // Catch:{ all -> 0x05df }
            int r11 = r11 * r3
        L_0x00ea:
            r1 = 12
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0     // Catch:{ all -> 0x05df }
            r0.<init>(r1)     // Catch:{ all -> 0x05df }
            java.util.Collections.sort(r2, r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = "cameraview/prepare-video supported video sizes:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05df }
            r1.<init>(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = A02(r2)     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05df }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = "cameraview/prepare-video supported preview sizes:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05df }
            r1.<init>(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = A02(r24)     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05df }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            android.hardware.Camera$Size r1 = r14.A04     // Catch:{ all -> 0x05df }
            if (r1 == 0) goto L_0x05d7
            int r0 = r1.width     // Catch:{ all -> 0x05df }
            double r4 = (double) r0     // Catch:{ all -> 0x05df }
            int r0 = r1.height     // Catch:{ all -> 0x05df }
            double r0 = (double) r0     // Catch:{ all -> 0x05df }
            double r4 = r4 / r0
            java.util.Iterator r21 = r2.iterator()     // Catch:{ all -> 0x05df }
            r22 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r19 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x0137:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x017d
            java.lang.Object r13 = r21.next()     // Catch:{ all -> 0x05df }
            android.hardware.Camera$Size r13 = (android.hardware.Camera.Size) r13     // Catch:{ all -> 0x05df }
            int r2 = r13.width     // Catch:{ all -> 0x05df }
            r0 = 1280(0x500, float:1.794E-42)
            if (r2 > r0) goto L_0x0137
            r0 = 320(0x140, float:4.48E-43)
            if (r2 < r0) goto L_0x0137
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x05df }
            r0 = 16
            if (r1 > r0) goto L_0x0158
            r0 = 720(0x2d0, float:1.009E-42)
            if (r2 <= r0) goto L_0x0158
            goto L_0x0137
        L_0x0158:
            double r2 = (double) r2     // Catch:{ all -> 0x05df }
            int r0 = r13.height     // Catch:{ all -> 0x05df }
            double r0 = (double) r0     // Catch:{ all -> 0x05df }
            double r2 = r2 / r0
            android.hardware.Camera$Size r0 = r14.A06     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x0171
            double r0 = r4 - r2
            double r17 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x05df }
            double r0 = r4 - r19
            double r15 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x05df }
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x0137
        L_0x0171:
            r14.A06 = r13     // Catch:{ all -> 0x05df }
            r19 = r2
            goto L_0x0137
        L_0x0176:
            java.lang.String r0 = "cameraview/prepare-video preferred video preview size is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            goto L_0x00ea
        L_0x017d:
            android.hardware.Camera$Size r0 = r14.A06     // Catch:{ all -> 0x05df }
            if (r0 != 0) goto L_0x0188
            java.lang.String r0 = "cameraview/prepare-video cannot find video size"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            goto L_0x05c3
        L_0x0188:
            java.util.Iterator r1 = r24.iterator()     // Catch:{ all -> 0x05df }
        L_0x018c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x01af
            java.lang.Object r13 = r1.next()     // Catch:{ all -> 0x05df }
            android.hardware.Camera$Size r13 = (android.hardware.Camera.Size) r13     // Catch:{ all -> 0x05df }
            android.hardware.Camera$Size r0 = r14.A06     // Catch:{ all -> 0x05df }
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x018c
        L_0x01a0:
            boolean r0 = r14.A0N     // Catch:{ all -> 0x05df }
            r2 = 19
            r3 = 480(0x1e0, float:6.73E-43)
            if (r0 == 0) goto L_0x01df
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x05df }
            r0 = 17
            if (r1 < r0) goto L_0x01df
            goto L_0x01b1
        L_0x01af:
            r13 = 0
            goto L_0x01a0
        L_0x01b1:
            if (r1 > r2) goto L_0x01df
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x05df }
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x01df
            java.lang.String[] r1 = A0b     // Catch:{ all -> 0x05df }
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ all -> 0x05df }
            boolean r0 = X.C43041zF.A03(r0, r1)     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x01df
            android.hardware.Camera r2 = r14.A07     // Catch:{ all -> 0x05df }
            r1 = 1440(0x5a0, float:2.018E-42)
            r0 = 1080(0x438, float:1.513E-42)
            android.hardware.Camera$Size r13 = new android.hardware.Camera$Size     // Catch:{ all -> 0x05df }
            r13.<init>(r2, r1, r0)     // Catch:{ all -> 0x05df }
            android.hardware.Camera r2 = r14.A07     // Catch:{ all -> 0x05df }
            r1 = 640(0x280, float:8.97E-43)
            android.hardware.Camera$Size r0 = new android.hardware.Camera$Size     // Catch:{ all -> 0x05df }
            r0.<init>(r2, r1, r3)     // Catch:{ all -> 0x05df }
            r14.A06 = r0     // Catch:{ all -> 0x05df }
            goto L_0x0209
        L_0x01df:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x05df }
            if (r0 > r2) goto L_0x020d
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x05df }
            java.lang.String r0 = "LGE"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x020d
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x05df }
            java.lang.String r0 = "LG-D680"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x020d
            android.hardware.Camera r2 = r14.A07     // Catch:{ all -> 0x05df }
            r1 = 864(0x360, float:1.211E-42)
            android.hardware.Camera$Size r0 = new android.hardware.Camera$Size     // Catch:{ all -> 0x05df }
            r0.<init>(r2, r1, r3)     // Catch:{ all -> 0x05df }
            r14.A06 = r0     // Catch:{ all -> 0x05df }
            android.hardware.Camera r0 = r14.A07     // Catch:{ all -> 0x05df }
            android.hardware.Camera$Size r13 = new android.hardware.Camera$Size     // Catch:{ all -> 0x05df }
            r13.<init>(r0, r1, r3)     // Catch:{ all -> 0x05df }
        L_0x0209:
            r21 = 1
            goto L_0x029e
        L_0x020d:
            r21 = 0
            if (r13 != 0) goto L_0x029e
            android.hardware.Camera$Size r1 = r14.A06     // Catch:{ all -> 0x05df }
            int r0 = r1.width     // Catch:{ all -> 0x05df }
            double r4 = (double) r0     // Catch:{ all -> 0x05df }
            int r0 = r1.height     // Catch:{ all -> 0x05df }
            double r0 = (double) r0     // Catch:{ all -> 0x05df }
            double r4 = r4 / r0
            java.util.Iterator r20 = r24.iterator()     // Catch:{ all -> 0x05df }
        L_0x021e:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x0255
            java.lang.Object r15 = r20.next()     // Catch:{ all -> 0x05df }
            android.hardware.Camera$Size r15 = (android.hardware.Camera.Size) r15     // Catch:{ all -> 0x05df }
            int r2 = r15.width     // Catch:{ all -> 0x05df }
            android.hardware.Camera$Size r3 = r14.A06     // Catch:{ all -> 0x05df }
            int r0 = r3.width     // Catch:{ all -> 0x05df }
            if (r2 < r0) goto L_0x021e
            int r1 = r15.height     // Catch:{ all -> 0x05df }
            int r0 = r3.height     // Catch:{ all -> 0x05df }
            if (r1 < r0) goto L_0x021e
            int r0 = r1 * r2
            if (r0 > r11) goto L_0x021e
            double r2 = (double) r2     // Catch:{ all -> 0x05df }
            double r0 = (double) r1     // Catch:{ all -> 0x05df }
            double r2 = r2 / r0
            if (r13 == 0) goto L_0x0251
            double r0 = r4 - r2
            double r18 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x05df }
            double r0 = r4 - r22
            double r16 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x05df }
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x021e
        L_0x0251:
            r13 = r15
            r22 = r2
            goto L_0x021e
        L_0x0255:
            if (r13 != 0) goto L_0x029e
            java.lang.String r0 = "cameraview/prepare-video cannot find preview size that is larger than video"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            java.util.Iterator r20 = r24.iterator()     // Catch:{ all -> 0x05df }
        L_0x0260:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x028d
            java.lang.Object r15 = r20.next()     // Catch:{ all -> 0x05df }
            android.hardware.Camera$Size r15 = (android.hardware.Camera.Size) r15     // Catch:{ all -> 0x05df }
            int r1 = r15.height     // Catch:{ all -> 0x05df }
            int r2 = r15.width     // Catch:{ all -> 0x05df }
            int r0 = r1 * r2
            if (r0 > r11) goto L_0x0260
            double r2 = (double) r2     // Catch:{ all -> 0x05df }
            double r0 = (double) r1     // Catch:{ all -> 0x05df }
            double r2 = r2 / r0
            if (r13 == 0) goto L_0x0289
            double r0 = r4 - r2
            double r18 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x05df }
            double r0 = r4 - r22
            double r16 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x05df }
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0260
        L_0x0289:
            r13 = r15
            r22 = r2
            goto L_0x0260
        L_0x028d:
            if (r13 != 0) goto L_0x029e
            java.lang.String r0 = "cameraview/prepare-video use preferred video size"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            r13 = r6
            if (r6 != 0) goto L_0x029e
            java.lang.String r0 = "cameraview/prepare-video cannot find preview size"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            goto L_0x05c3
        L_0x029e:
            android.hardware.Camera$Size r0 = r14.A06     // Catch:{ all -> 0x05df }
            int r4 = r0.width     // Catch:{ all -> 0x05df }
            r9.videoFrameWidth = r4     // Catch:{ all -> 0x05df }
            int r3 = r0.height     // Catch:{ all -> 0x05df }
            r9.videoFrameHeight = r3     // Catch:{ all -> 0x05df }
            int r0 = r4 * r3
            int r2 = r0 << 2
            r9.videoBitRate = r2     // Catch:{ all -> 0x05df }
            java.lang.String r0 = "cameraview/prepare-video use profile:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05df }
            r1.<init>(r0)     // Catch:{ all -> 0x05df }
            r1.append(r4)     // Catch:{ all -> 0x05df }
            r1.append(r8)     // Catch:{ all -> 0x05df }
            r1.append(r3)     // Catch:{ all -> 0x05df }
            r1.append(r10)     // Catch:{ all -> 0x05df }
            r1.append(r2)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = " preview:"
            r1.append(r0)     // Catch:{ all -> 0x05df }
            int r0 = r13.width     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            r1.append(r8)     // Catch:{ all -> 0x05df }
            int r0 = r13.height     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05df }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            java.lang.String r1 = "cam_mode"
            r0 = 1
            r7.set(r1, r0)     // Catch:{ all -> 0x05df }
            java.util.List r2 = r7.getSupportedFocusModes()     // Catch:{ all -> 0x05df }
            if (r2 == 0) goto L_0x0338
            java.lang.String r0 = "cameraview/prepare-video supported focus:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05df }
            r1.<init>(r0)     // Catch:{ all -> 0x05df }
            java.lang.Object[] r0 = r2.toArray()     // Catch:{ all -> 0x05df }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x05df }
            r1.append(r0)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05df }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            java.lang.String r1 = "continuous-video"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x05df }
            if (r0 != 0) goto L_0x0312
            java.lang.String r1 = "infinity"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x0315
        L_0x0312:
            r7.setFocusMode(r1)     // Catch:{ all -> 0x05df }
        L_0x0315:
            android.hardware.Camera$Size r6 = r14.A04     // Catch:{ all -> 0x05df }
            int r0 = r6.width     // Catch:{ all -> 0x05df }
            double r10 = (double) r0     // Catch:{ all -> 0x05df }
            int r0 = r6.height     // Catch:{ all -> 0x05df }
            double r4 = (double) r0     // Catch:{ all -> 0x05df }
            double r15 = r10 / r4
            int r0 = r13.width     // Catch:{ all -> 0x05df }
            double r2 = (double) r0     // Catch:{ all -> 0x05df }
            int r0 = r13.height     // Catch:{ all -> 0x05df }
            double r0 = (double) r0     // Catch:{ all -> 0x05df }
            double r2 = r2 / r0
            double r15 = r15 - r2
            double r0 = java.lang.Math.abs(r15)     // Catch:{ all -> 0x05df }
            double r4 = r4 / r10
            double r4 = r4 - r2
            double r2 = java.lang.Math.abs(r4)     // Catch:{ all -> 0x05df }
            double r4 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x05df }
            r14.A05 = r6     // Catch:{ all -> 0x05df }
            goto L_0x033e
        L_0x0338:
            java.lang.String r0 = "cameraview/prepare-video supported focus: null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            goto L_0x0315
        L_0x033e:
            r2 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0349
            r0 = 1
        L_0x0349:
            r21 = r21 | r0
            if (r21 == 0) goto L_0x0363
            java.lang.String r0 = "cameraview/prepare-video restart preview for video"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            int r1 = r13.width     // Catch:{ all -> 0x05df }
            int r0 = r13.height     // Catch:{ all -> 0x05df }
            r7.setPreviewSize(r1, r0)     // Catch:{ all -> 0x05df }
            r14.A05 = r13     // Catch:{ all -> 0x05df }
            android.hardware.Camera r0 = r14.A07     // Catch:{ all -> 0x05df }
            r0.stopPreview()     // Catch:{ all -> 0x05df }
            r0 = 0
            r14.A0M = r0     // Catch:{ all -> 0x05df }
        L_0x0363:
            java.lang.String r1 = r14.A0K     // Catch:{ all -> 0x05df }
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x037f
            java.util.List r0 = r7.getSupportedFlashModes()     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x037f
            java.lang.String r1 = "torch"
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x037f
            r7.setFlashMode(r1)     // Catch:{ all -> 0x05df }
        L_0x037f:
            android.hardware.Camera r0 = r14.A07     // Catch:{ all -> 0x05df }
            r0.setParameters(r7)     // Catch:{ all -> 0x05df }
            if (r21 == 0) goto L_0x03a4
            java.lang.String r0 = "cameraview/prepare-video restart preview"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            android.hardware.Camera r1 = r14.A07     // Catch:{ IOException -> 0x0393 }
            android.view.SurfaceHolder r0 = r14.A0V     // Catch:{ IOException -> 0x0393 }
            r1.setPreviewDisplay(r0)     // Catch:{ IOException -> 0x0393 }
            goto L_0x0399
        L_0x0393:
            r1 = move-exception
            java.lang.String r0 = "cameraview/prepare-video  error setting preview display"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x05df }
        L_0x0399:
            android.hardware.Camera r0 = r14.A07     // Catch:{ all -> 0x05df }
            r0.startPreview()     // Catch:{ all -> 0x05df }
            r0 = 1
            r14.A0M = r0     // Catch:{ all -> 0x05df }
            r14.requestLayout()     // Catch:{ all -> 0x05df }
        L_0x03a4:
            android.hardware.Camera r0 = r14.A07     // Catch:{ all -> 0x05df }
            r0.setPreviewCallbackWithBuffer(r12)     // Catch:{ all -> 0x05df }
            boolean r0 = r14.A0N     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x03d2
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x05df }
            r0 = 27
            if (r1 != r0) goto L_0x03d0
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x05df }
            java.lang.String r0 = "oppo"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x03d0
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x05df }
            java.lang.String r0 = "cph1803"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x05df }
            if (r0 != 0) goto L_0x03d2
            java.lang.String r0 = "cph1901"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x05df }
            if (r0 == 0) goto L_0x03d0
            goto L_0x03d2
        L_0x03d0:
            r5 = 1
            goto L_0x03d3
        L_0x03d2:
            r5 = 0
        L_0x03d3:
            java.lang.String r4 = "camerview/prepare-video record audio denied, will record without sound"
            r3 = 21
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            if (r5 == 0) goto L_0x044a
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x05df }
            if (r0 < r3) goto L_0x044a
            X.0sj r0 = r14.A0H     // Catch:{ all -> 0x05df }
            int r0 = r0.A03(r2)     // Catch:{ all -> 0x05df }
            if (r0 != 0) goto L_0x0446
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            r0 = 5
            r1.setAudioSource(r0)     // Catch:{ all -> 0x05df }
        L_0x03ed:
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            r0 = 2
            r1.setVideoSource(r0)     // Catch:{ all -> 0x05df }
            X.0sj r0 = r14.A0H     // Catch:{ all -> 0x05df }
            int r0 = r0.A03(r2)     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            if (r0 != 0) goto L_0x0422
            r1.setProfile(r9)     // Catch:{ all -> 0x05df }
        L_0x0400:
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            java.lang.String r0 = r26.getAbsolutePath()     // Catch:{ all -> 0x05df }
            r1.setOutputFile(r0)     // Catch:{ all -> 0x05df }
        L_0x0409:
            int r0 = r14.getRequiredCameraRotation()     // Catch:{ all -> 0x05df }
            int r0 = r0 + r27
            int r1 = r0 % 360
            if (r5 == 0) goto L_0x041b
            int r0 = r1 % 180
            if (r0 != 0) goto L_0x041b
            int r0 = r1 + 180
            int r1 = r0 % 360
        L_0x041b:
            android.media.MediaRecorder r0 = r14.A08     // Catch:{ all -> 0x05df }
            r0.setOrientationHint(r1)     // Catch:{ all -> 0x05df }
            goto L_0x04b7
        L_0x0422:
            int r0 = r9.fileFormat     // Catch:{ all -> 0x05df }
            r1.setOutputFormat(r0)     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            int r0 = r9.videoFrameRate     // Catch:{ all -> 0x05df }
            r1.setVideoFrameRate(r0)     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r2 = r14.A08     // Catch:{ all -> 0x05df }
            int r1 = r9.videoFrameWidth     // Catch:{ all -> 0x05df }
            int r0 = r9.videoFrameHeight     // Catch:{ all -> 0x05df }
            r2.setVideoSize(r1, r0)     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            int r0 = r9.videoBitRate     // Catch:{ all -> 0x05df }
            r1.setVideoEncodingBitRate(r0)     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            int r0 = r9.videoCodec     // Catch:{ all -> 0x05df }
            r1.setVideoEncoder(r0)     // Catch:{ all -> 0x05df }
            goto L_0x0400
        L_0x0446:
            com.whatsapp.util.Log.w((java.lang.String) r4)     // Catch:{ all -> 0x05df }
            goto L_0x03ed
        L_0x044a:
            android.hardware.Camera r0 = r14.A07     // Catch:{ all -> 0x05df }
            r0.unlock()     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            android.hardware.Camera r0 = r14.A07     // Catch:{ all -> 0x05df }
            r1.setCamera(r0)     // Catch:{ all -> 0x05df }
            X.0sj r0 = r14.A0H     // Catch:{ all -> 0x05df }
            int r0 = r0.A03(r2)     // Catch:{ all -> 0x05df }
            if (r0 != 0) goto L_0x04b3
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            r0 = 5
            r1.setAudioSource(r0)     // Catch:{ all -> 0x05df }
        L_0x0464:
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            r0 = 1
            r1.setVideoSource(r0)     // Catch:{ all -> 0x05df }
            X.0sj r0 = r14.A0H     // Catch:{ all -> 0x05df }
            int r0 = r0.A03(r2)     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            if (r0 != 0) goto L_0x048f
            r1.setProfile(r9)     // Catch:{ all -> 0x05df }
        L_0x0477:
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            java.lang.String r0 = r26.getAbsolutePath()     // Catch:{ all -> 0x05df }
            r1.setOutputFile(r0)     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            android.view.SurfaceHolder r0 = r14.getHolder()     // Catch:{ all -> 0x05df }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ all -> 0x05df }
            r1.setPreviewDisplay(r0)     // Catch:{ all -> 0x05df }
            goto L_0x0409
        L_0x048f:
            int r0 = r9.fileFormat     // Catch:{ all -> 0x05df }
            r1.setOutputFormat(r0)     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            int r0 = r9.videoFrameRate     // Catch:{ all -> 0x05df }
            r1.setVideoFrameRate(r0)     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r2 = r14.A08     // Catch:{ all -> 0x05df }
            int r1 = r9.videoFrameWidth     // Catch:{ all -> 0x05df }
            int r0 = r9.videoFrameHeight     // Catch:{ all -> 0x05df }
            r2.setVideoSize(r1, r0)     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            int r0 = r9.videoBitRate     // Catch:{ all -> 0x05df }
            r1.setVideoEncodingBitRate(r0)     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r1 = r14.A08     // Catch:{ all -> 0x05df }
            int r0 = r9.videoCodec     // Catch:{ all -> 0x05df }
            r1.setVideoEncoder(r0)     // Catch:{ all -> 0x05df }
            goto L_0x0477
        L_0x04b3:
            com.whatsapp.util.Log.w((java.lang.String) r4)     // Catch:{ all -> 0x05df }
            goto L_0x0464
        L_0x04b7:
            android.media.MediaRecorder r0 = r14.A08     // Catch:{ IllegalStateException -> 0x05b3, IOException -> 0x05a8 }
            r0.prepare()     // Catch:{ IllegalStateException -> 0x05b3, IOException -> 0x05a8 }
            if (r5 == 0) goto L_0x0589
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x05df }
            if (r0 < r3) goto L_0x0589
            android.hardware.Camera r0 = r14.A07     // Catch:{ all -> 0x05df }
            r0.stopPreview()     // Catch:{ all -> 0x05df }
            android.hardware.Camera r0 = r14.A07     // Catch:{ IOException -> 0x04cd }
            r0.setPreviewDisplay(r12)     // Catch:{ IOException -> 0x04cd }
            goto L_0x04d3
        L_0x04cd:
            r1 = move-exception
            java.lang.String r0 = "cameraview/prepare-video error clearing preview display"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x05df }
        L_0x04d3:
            r0 = 1
            X.0WP r3 = new X.0WP     // Catch:{ all -> 0x05df }
            r3.<init>(r12, r0)     // Catch:{ all -> 0x05df }
            r14.A0B = r3     // Catch:{ all -> 0x05df }
            android.view.SurfaceHolder r0 = r14.A0V     // Catch:{ all -> 0x05df }
            android.view.Surface r2 = r0.getSurface()     // Catch:{ all -> 0x05df }
            r1 = 0
            X.0S9 r0 = new X.0S9     // Catch:{ all -> 0x05df }
            r0.<init>(r3)     // Catch:{ all -> 0x05df }
            r0.A05(r2)     // Catch:{ all -> 0x05df }
            r0.A01 = r2     // Catch:{ all -> 0x05df }
            r0.A03 = r1     // Catch:{ all -> 0x05df }
            r14.A0D = r0     // Catch:{ all -> 0x05df }
            r0.A02()     // Catch:{ all -> 0x05df }
            X.0JP r0 = X.AnonymousClass0JP.TEXTURE_EXT     // Catch:{ all -> 0x05df }
            X.0PB r1 = new X.0PB     // Catch:{ all -> 0x05df }
            r1.<init>(r0)     // Catch:{ all -> 0x05df }
            X.0PU r0 = new X.0PU     // Catch:{ all -> 0x05df }
            r0.<init>(r1)     // Catch:{ all -> 0x05df }
            r14.A0C = r0     // Catch:{ all -> 0x05df }
            r0 = 1
            int[] r2 = new int[r0]     // Catch:{ all -> 0x05df }
            r1 = 0
            android.opengl.GLES20.glGenTextures(r0, r2, r1)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = "glGenTextures"
            X.AnonymousClass0X0.A04(r0)     // Catch:{ all -> 0x05df }
            r3 = r2[r1]     // Catch:{ all -> 0x05df }
            r0 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r0, r3)     // Catch:{ all -> 0x05df }
            java.lang.String r1 = "glBindTexture "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05df }
            r0.<init>(r1)     // Catch:{ all -> 0x05df }
            r0.append(r3)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05df }
            X.AnonymousClass0X0.A04(r0)     // Catch:{ all -> 0x05df }
            r2 = 36197(0x8d65, float:5.0723E-41)
            r1 = 10241(0x2801, float:1.435E-41)
            r0 = 1175977984(0x46180000, float:9728.0)
            android.opengl.GLES20.glTexParameterf(r2, r1, r0)     // Catch:{ all -> 0x05df }
            r1 = 10240(0x2800, float:1.4349E-41)
            r0 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r2, r1, r0)     // Catch:{ all -> 0x05df }
            r0 = 10242(0x2802, float:1.4352E-41)
            r1 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r2, r0, r1)     // Catch:{ all -> 0x05df }
            r0 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r2, r0, r1)     // Catch:{ all -> 0x05df }
            java.lang.String r0 = "glTexParameter"
            X.AnonymousClass0X0.A04(r0)     // Catch:{ all -> 0x05df }
            r14.A02 = r3     // Catch:{ all -> 0x05df }
            android.graphics.SurfaceTexture r2 = new android.graphics.SurfaceTexture     // Catch:{ all -> 0x05df }
            r2.<init>(r3)     // Catch:{ all -> 0x05df }
            r14.A03 = r2     // Catch:{ all -> 0x05df }
            r1 = 0
            com.facebook.redex.IDxAListenerShape424S0100000_2_I0 r0 = new com.facebook.redex.IDxAListenerShape424S0100000_2_I0     // Catch:{ all -> 0x05df }
            r0.<init>(r14, r1)     // Catch:{ all -> 0x05df }
            r2.setOnFrameAvailableListener(r0)     // Catch:{ all -> 0x05df }
            X.0WP r3 = r14.A0B     // Catch:{ all -> 0x05df }
            android.media.MediaRecorder r0 = r14.A08     // Catch:{ all -> 0x05df }
            android.view.Surface r2 = r0.getSurface()     // Catch:{ all -> 0x05df }
            r1 = 1
            X.0S9 r0 = new X.0S9     // Catch:{ all -> 0x05df }
            r0.<init>(r3)     // Catch:{ all -> 0x05df }
            r0.A05(r2)     // Catch:{ all -> 0x05df }
            r0.A01 = r2     // Catch:{ all -> 0x05df }
            r0.A03 = r1     // Catch:{ all -> 0x05df }
            r14.A0E = r0     // Catch:{ all -> 0x05df }
            r0.A02()     // Catch:{ all -> 0x05df }
            android.hardware.Camera r1 = r14.A07     // Catch:{ IOException -> 0x057e }
            android.graphics.SurfaceTexture r0 = r14.A03     // Catch:{ IOException -> 0x057e }
            r1.setPreviewTexture(r0)     // Catch:{ IOException -> 0x057e }
            goto L_0x0584
        L_0x057e:
            r1 = move-exception
            java.lang.String r0 = "cameraview/prepare-video error setting preview texture"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x05df }
        L_0x0584:
            android.hardware.Camera r0 = r14.A07     // Catch:{ all -> 0x05df }
            r0.startPreview()     // Catch:{ all -> 0x05df }
        L_0x0589:
            java.lang.String r0 = "cameraview/start-video-capture"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x059e }
            android.media.MediaRecorder r0 = r14.A08     // Catch:{ RuntimeException -> 0x059e }
            r0.start()     // Catch:{ RuntimeException -> 0x059e }
            r0 = 1
            r14.A0P = r0     // Catch:{ RuntimeException -> 0x059e }
            X.2V3 r0 = r14.A0F     // Catch:{ RuntimeException -> 0x059e }
            if (r0 == 0) goto L_0x05d5
            r0.AZX()     // Catch:{ RuntimeException -> 0x059e }
            goto L_0x05d5
        L_0x059e:
            r1 = move-exception
            java.lang.String r0 = "cameraview/start-video-capture failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x05df }
            r14.A05()     // Catch:{ all -> 0x05df }
            goto L_0x05d2
        L_0x05a8:
            r0 = move-exception
            r0.getMessage()     // Catch:{ all -> 0x05df }
            r14.A05()     // Catch:{ all -> 0x05df }
            r14.A08(r0)     // Catch:{ all -> 0x05df }
            goto L_0x05c3
        L_0x05b3:
            r0 = move-exception
            r0.getMessage()     // Catch:{ all -> 0x05df }
            r14.A05()     // Catch:{ all -> 0x05df }
            r14.A08(r0)     // Catch:{ all -> 0x05df }
            goto L_0x05c3
        L_0x05be:
            java.lang.String r0 = "cameraview/ no profile"
        L_0x05c0:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05df }
        L_0x05c3:
            java.lang.String r0 = "cameraview/start-video-capture failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05df }
            r14.A05()     // Catch:{ all -> 0x05df }
            java.lang.String r0 = "CameraCustomException: Start-video-capture failed"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x05df }
            r1.<init>(r0)     // Catch:{ all -> 0x05df }
        L_0x05d2:
            r14.A08(r1)     // Catch:{ all -> 0x05df }
        L_0x05d5:
            monitor-exit(r14)
            return
        L_0x05d7:
            java.lang.String r1 = "previewSize is NULL"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x05df }
            r0.<init>(r1)     // Catch:{ all -> 0x05df }
            throw r0     // Catch:{ all -> 0x05df }
        L_0x05df:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x05e1 }
        L_0x05e1:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49062Qp.AgF(java.io.File, int):void");
    }

    public synchronized void AgO() {
        try {
            this.A08.stop();
        } catch (RuntimeException e2) {
            Log.w("cameraview/stop-video-capture ", e2);
        }
        A05();
        Camera camera = this.A07;
        if (camera != null) {
            camera.lock();
        }
        this.A0P = false;
        this.A05 = null;
    }

    public boolean Aga() {
        return this.A0Q;
    }

    public synchronized void Age(AnonymousClass2VC r6, boolean z2) {
        if (this.A07 == null) {
            Log.e("cameraview/take-picture camera is null");
            e = new Exception("CameraCustomException: Camera is null");
        } else if (this.A0R) {
            Log.e("cameraview/take-picture already taking a picture");
        } else {
            this.A0M = false;
            this.A0R = true;
            Log.i("cameraview/take-picture/start");
            Camera.Parameters parameters = this.A07.getParameters();
            parameters.setRotation(getRequiredCameraRotation());
            parameters.setJpegQuality(80);
            this.A07.setParameters(parameters);
            try {
                C91644gG r3 = new C91644gG(r6, this);
                this.A07.takePicture(new C91684gK(r6), (Camera.PictureCallback) null, r3);
            } catch (Exception e2) {
                e = e2;
                this.A0R = false;
                Log.e("cameraview/take-picture failed", e);
            }
        }
        A08(e);
        return;
    }

    public void Agz() {
        Camera camera = this.A07;
        if (camera != null && this.A0Q) {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(AJl() ? "off" : "torch");
            camera.setParameters(parameters);
        }
    }

    public int getCameraApi() {
        return 0;
    }

    public int getCameraType() {
        return 0;
    }

    public String getFlashMode() {
        return this.A0K;
    }

    public synchronized List getFlashModes() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Camera camera = this.A07;
        if (camera != null) {
            try {
                List<String> supportedFlashModes = camera.getParameters().getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    if (supportedFlashModes.contains("off")) {
                        arrayList.add("off");
                    }
                    if (supportedFlashModes.contains("on")) {
                        arrayList.add("on");
                    }
                    if (supportedFlashModes.contains(Language.AUTO_DETECT)) {
                        arrayList.add(Language.AUTO_DETECT);
                    }
                }
                if (this.A0N) {
                    if (!arrayList.contains("off")) {
                        arrayList.add("off");
                    }
                    if (!arrayList.contains("on")) {
                        arrayList.add("on");
                    }
                }
                if (getStoredFlashModeCount() != arrayList.size()) {
                    SharedPreferences.Editor edit = getSharedPreferences().edit();
                    StringBuilder sb = new StringBuilder();
                    sb.append("flash_mode_count");
                    sb.append(this.A00);
                    edit.putInt(sb.toString(), arrayList.size()).apply();
                }
            } catch (RuntimeException e2) {
                Log.e("cameraview/getFlashModes ", e2);
            }
        }
        return arrayList;
    }

    public synchronized int getMaxZoom() {
        int i2;
        i2 = 0;
        Camera camera = this.A07;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.isZoomSupported()) {
                i2 = parameters.getMaxZoom();
            }
        }
        return i2;
    }

    public int getNumberOfCameras() {
        return Camera.getNumberOfCameras();
    }

    public synchronized long getPictureResolution() {
        long j2;
        Camera.Size pictureSize;
        Camera camera = this.A07;
        j2 = 0;
        if (!(camera == null || (pictureSize = camera.getParameters().getPictureSize()) == null)) {
            j2 = (long) (pictureSize.width * pictureSize.height);
        }
        return j2;
    }

    public int getStoredFlashModeCount() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        StringBuilder sb = new StringBuilder("flash_mode_count");
        sb.append(this.A00);
        return sharedPreferences.getInt(sb.toString(), 0);
    }

    public synchronized long getVideoResolution() {
        Camera.Size size;
        size = this.A06;
        return size != null ? (long) (size.width * size.height) : 0;
    }

    public synchronized int getZoomLevel() {
        Camera camera;
        camera = this.A07;
        return camera == null ? 0 : camera.getParameters().getZoom();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0X.enable();
        HandlerThread handlerThread = new HandlerThread("Camera");
        this.A0A = handlerThread;
        handlerThread.start();
        this.A09 = new Handler(this.A0A.getLooper());
        if (this.A0O) {
            this.A0Y.A01();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0X.disable();
        HandlerThread handlerThread = this.A0A;
        if (handlerThread != null) {
            handlerThread.quit();
            this.A0A = null;
        }
        this.A0Y.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r1 == 2) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r11 = r17
            r1 = r18
            r0 = r19
            super.onMeasure(r1, r0)
            int r13 = r11.getMeasuredWidth()
            int r12 = r11.getMeasuredHeight()
            android.hardware.Camera r0 = r11.A07
            java.lang.String r16 = "x"
            if (r0 == 0) goto L_0x0043
            android.hardware.Camera$Size r10 = r11.A05
            if (r10 != 0) goto L_0x0044
            java.util.List r0 = r11.A0L
            if (r0 == 0) goto L_0x0043
            X.01V r0 = r11.A0G
            android.view.WindowManager r0 = r0.A0O()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            if (r1 == 0) goto L_0x0034
            r0 = 2
            r3 = 0
            if (r1 != r0) goto L_0x0035
        L_0x0034:
            r3 = 1
        L_0x0035:
            java.util.List r2 = r11.A0L
            r1 = r13
            r0 = r12
            if (r3 == 0) goto L_0x003d
            r1 = r12
            r0 = r13
        L_0x003d:
            android.hardware.Camera$Size r10 = A01(r2, r1, r0)
            if (r10 != 0) goto L_0x0044
        L_0x0043:
            return
        L_0x0044:
            double r6 = (double) r13
            double r4 = (double) r12
            double r2 = r6 / r4
            int r15 = r10.width
            double r8 = (double) r15
            int r14 = r10.height
            double r0 = (double) r14
            double r8 = r8 / r0
            double r2 = r2 - r8
            double r2 = java.lang.Math.abs(r2)
            double r0 = r4 / r6
            double r0 = r0 - r8
            double r0 = java.lang.Math.abs(r0)
            double r0 = java.lang.Math.min(r2, r0)
            java.lang.String r2 = "cameraview/measure optimalpreviewsize:"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r15)
            r2 = r16
            r3.append(r2)
            r3.append(r14)
            java.lang.String r2 = " measured:"
            r3.append(r2)
            r3.append(r13)
            r2 = r16
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = " aspect diff:"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0043
            r1 = 0
            if (r13 <= r12) goto L_0x009d
            r1 = 1
        L_0x009d:
            int r3 = r10.width
            int r2 = r10.height
            r0 = 0
            if (r3 <= r2) goto L_0x00a5
            r0 = 1
        L_0x00a5:
            r12 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            java.lang.String r9 = " scaleMax:"
            java.lang.String r8 = "cameraview/measure optimalpreviewsize scaleMin:"
            if (r1 != r0) goto L_0x0102
            double r0 = (double) r3
            double r6 = r6 / r0
            double r0 = (double) r2
            double r4 = r4 / r0
            double r0 = java.lang.Math.min(r6, r4)
            double r2 = java.lang.Math.max(r6, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            r4.append(r0)
            r4.append(r9)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            double r5 = r2 / r0
            int r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x00db
            r0 = r2
        L_0x00db:
            int r2 = r10.width
            double r2 = (double) r2
            double r2 = r2 * r0
            int r4 = (int) r2
            int r2 = r10.height
        L_0x00e2:
            double r2 = (double) r2
            double r0 = r0 * r2
            int r2 = (int) r0
            java.lang.String r0 = "cameraview/measure result:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            r0 = r16
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r11.setMeasuredDimension(r4, r2)
            return
        L_0x0102:
            double r0 = (double) r2
            double r6 = r6 / r0
            double r0 = (double) r3
            double r4 = r4 / r0
            double r0 = java.lang.Math.min(r6, r4)
            double r2 = java.lang.Math.max(r6, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            r4.append(r0)
            r4.append(r9)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            double r5 = r2 / r0
            int r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x012d
            r0 = r2
        L_0x012d:
            int r2 = r10.height
            double r2 = (double) r2
            double r2 = r2 * r0
            int r4 = (int) r2
            int r2 = r10.width
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49062Qp.onMeasure(int, int):void");
    }

    public void pause() {
    }

    public void setCameraCallback(AnonymousClass2V3 r1) {
        this.A0F = r1;
    }

    public void setQrDecodeHints(Map map) {
        this.A0Y.A02 = map;
    }

    public void setQrScanningEnabled(boolean z2) {
        this.A0O = z2;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        if (this.A07 == null) {
            return;
        }
        if (this.A0V.getSurface() == null) {
            Log.e("cameraview/surface-changed: no surface");
            A08(new Exception("CameraCustomException: No surface"));
        } else if (!this.A0P) {
            this.A09.post(new RunnableRunnableShape4S0200000_I0_2(this, 0, surfaceHolder));
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A09.post(new RunnableRunnableShape5S0100000_I0_4((Object) this, 18));
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A09.post(new RunnableRunnableShape5S0100000_I0_4((Object) this, 17));
        A05();
    }
}
