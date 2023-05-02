package X;

import android.content.Context;
import android.graphics.Point;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import com.facebook.redex.IDxCallableShape148S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.whatsapp.VideoFrameConverter;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipCameraApi2$StopCameraRunnable;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2P8  reason: invalid class name */
public class AnonymousClass2P8 extends VoipPhysicalCamera {
    public static final AtomicBoolean A0I = new AtomicBoolean(false);
    public static final int[] A0J = {2, 0, 1, 3};
    public int A00 = 0;
    public Point A01;
    public CameraDevice A02;
    public Image A03;
    public Surface A04;
    public Runnable A05;
    public ByteBuffer A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public final int A09;
    public final CameraCharacteristics A0A;
    public final CameraDevice.StateCallback A0B = new AnonymousClass3LK(this);
    public final CameraManager A0C;
    public final ImageReader A0D;
    public final AnonymousClass01V A0E;
    public final C16320sq A0F;
    public final VoipPhysicalCamera.CameraInfo A0G;
    public final Object A0H = new Object();

    public AnonymousClass2P8(Context context, AnonymousClass01V r14, C14710pd r15, C16320sq r16, int i2, int i3, int i4, int i5, int i6) {
        super(r15, context);
        this.A0E = r14;
        this.A0F = r16;
        StringBuilder sb = new StringBuilder("voip/video/VoipCamera/create idx: ");
        int i7 = i2;
        sb.append(i7);
        sb.append(", size:");
        int i8 = i3;
        sb.append(i8);
        sb.append("x");
        int i9 = i4;
        sb.append(i9);
        sb.append(", format: 0x");
        int i10 = i5;
        sb.append(Integer.toHexString(i10));
        sb.append(", fps * 1000: ");
        int i11 = i6;
        sb.append(i11);
        sb.append(", api 2, this ");
        sb.append(this);
        Log.i(sb.toString());
        CameraManager A0E2 = r14.A0E();
        AnonymousClass00B.A06(A0E2);
        this.A0C = A0E2;
        this.A09 = i7;
        try {
            CameraCharacteristics cameraCharacteristics = A0E2.getCameraCharacteristics(Integer.toString(i7));
            this.A0A = cameraCharacteristics;
            Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            AnonymousClass00B.A06(obj);
            Number number = (Number) obj;
            Object obj2 = cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            AnonymousClass00B.A06(obj2);
            VoipPhysicalCamera.CameraInfo cameraInfo = new VoipPhysicalCamera.CameraInfo(i8, i9, i10, i11, ((Number) obj2).intValue() == 0, number.intValue(), i7);
            this.A0G = cameraInfo;
            ImageReader newInstance = ImageReader.newInstance(cameraInfo.width, cameraInfo.height, cameraInfo.format, 3);
            this.A0D = newInstance;
            if (newInstance != null) {
                newInstance.setOnImageAvailableListener(new C91784gU(this), this.cameraThreadHandler);
                return;
            }
            throw new RuntimeException("Unable to create image reader");
        } catch (CameraAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static int A00(AnonymousClass01V r12) {
        CameraManager A0E2 = r12.A0E();
        if (A0E2 == null) {
            Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel CameraManager is null");
        } else {
            int[] iArr = A0J;
            int length = iArr.length;
            int i2 = length;
            try {
                if (A0E2.getCameraIdList().length > 0) {
                    for (String cameraCharacteristics : A0E2.getCameraIdList()) {
                        Integer num = (Integer) A0E2.getCameraCharacteristics(cameraCharacteristics).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        if (num != null) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    break;
                                } else if (num.intValue() == iArr[i3]) {
                                    length = i3;
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                }
                if (length < i2) {
                    return iArr[length];
                }
            } catch (AssertionError | Exception e2) {
                Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel unable to acquire camera info", e2);
                return -1;
            }
        }
        return -1;
    }

    public static /* synthetic */ void A06(AnonymousClass2P8 r2) {
        boolean z2 = false;
        if (r2.A05 != null) {
            z2 = true;
        }
        AnonymousClass00B.A0B("Camera Delayed Start Op should not be null if calling delayedStartOnCameraThread", z2);
        r2.A05 = null;
        Log.i("voip/video/VoipCamera/ Trying to start camera again after delay.");
        r2.startOnCameraThread();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0 == r6) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r0 == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 != r6) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r3 = A0J;
        r2 = r3.length;
        r1 = 0;
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r1 >= r2) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r0 = r3[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 != r5) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r4 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A08(java.lang.String r5, int r6) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r5.toUpperCase(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -2053249079: goto L_0x0043;
                case -1038134325: goto L_0x003b;
                case 2169487: goto L_0x0033;
                case 787768856: goto L_0x002b;
                case 894099834: goto L_0x0023;
                default: goto L_0x000d;
            }
        L_0x000d:
            r5 = -1
        L_0x000e:
            if (r5 != r6) goto L_0x0012
            r4 = 1
        L_0x0011:
            return r4
        L_0x0012:
            int[] r3 = A0J
            int r2 = r3.length
            r1 = 0
            r4 = 0
        L_0x0017:
            if (r1 >= r2) goto L_0x004d
            r0 = r3[r1]
            if (r0 != r5) goto L_0x001e
            r4 = 1
        L_0x001e:
            if (r0 == r6) goto L_0x0011
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0023:
            java.lang.String r0 = "LIMITED"
            boolean r0 = r1.equals(r0)
            r5 = 0
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "LEVEL_3"
            boolean r0 = r1.equals(r0)
            r5 = 3
            goto L_0x004a
        L_0x0033:
            java.lang.String r0 = "FULL"
            boolean r0 = r1.equals(r0)
            r5 = 1
            goto L_0x004a
        L_0x003b:
            java.lang.String r0 = "EXTERNAL"
            boolean r0 = r1.equals(r0)
            r5 = 4
            goto L_0x004a
        L_0x0043:
            java.lang.String r0 = "LEGACY"
            boolean r0 = r1.equals(r0)
            r5 = 2
        L_0x004a:
            if (r0 != 0) goto L_0x000e
            goto L_0x000d
        L_0x004d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2P8.A08(java.lang.String, int):boolean");
    }

    public final int A09() {
        List asList;
        Log.i("voip/video/VoipCamera/ starting camera");
        if (this.A02 == null || this.videoPort == null) {
            return -5;
        }
        AnonymousClass4V1 r0 = this.textureHolder;
        if (r0 == null) {
            VoipPhysicalCamera.CameraInfo cameraInfo = this.A0G;
            createTexture(cameraInfo.width, cameraInfo.height);
            r0 = this.textureHolder;
            if (r0 == null) {
                return -12;
            }
        }
        Surface surface = this.A04;
        this.A04 = new Surface(r0.A01);
        A0A();
        try {
            CaptureRequest.Builder createCaptureRequest = this.A02.createCaptureRequest(1);
            createCaptureRequest.addTarget(this.A04);
            if (!this.cameraProcessorEnabled) {
                ImageReader imageReader = this.A0D;
                createCaptureRequest.addTarget(imageReader.getSurface());
                asList = Arrays.asList(new Surface[]{this.A04, imageReader.getSurface()});
            } else {
                asList = Arrays.asList(new Surface[]{this.A04});
            }
            this.A08 = true;
            this.A02.createCaptureSession(asList, new AnonymousClass3LJ(createCaptureRequest, surface, this), this.cameraThreadHandler);
            return 0;
        } catch (CameraAccessException e2) {
            Log.e("startCaptureSessionOnCameraThread", e2);
            return -2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r4 == 2) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
            r5 = this;
            X.01V r0 = r5.A0E
            android.view.WindowManager r0 = r0.A0O()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r4 = r0.getRotation()
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r3 = r5.A0G
            int r0 = r3.orientation
            int r0 = r0 % 180
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r2 = 1
        L_0x0018:
            if (r4 == 0) goto L_0x001e
            r1 = 2
            r0 = 0
            if (r4 != r1) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            if (r2 != r0) goto L_0x0035
            int r2 = r3.width
            int r1 = r3.height
        L_0x0025:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            r5.A01 = r0
            X.4V1 r1 = r5.textureHolder
            if (r1 == 0) goto L_0x0034
            int r0 = 4 - r4
            r1.A05 = r0
        L_0x0034:
            return
        L_0x0035:
            int r2 = r3.height
            int r1 = r3.width
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2P8.A0A():void");
    }

    public final void A0B(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            for (Map.Entry entry : this.virtualCameras.entrySet()) {
                if (((VoipCamera) entry.getValue()).started) {
                    VoipCamera voipCamera = (VoipCamera) entry.getValue();
                    updateCameraCallbackCheck();
                    if (acquireLatestImage.getPlanes().length == 1) {
                        voipCamera.abgrFramePlaneCallback(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), acquireLatestImage.getPlanes()[0].getBuffer(), acquireLatestImage.getWidth() << 2);
                    } else {
                        Image.Plane plane = acquireLatestImage.getPlanes()[0];
                        Image.Plane plane2 = acquireLatestImage.getPlanes()[1];
                        Image.Plane plane3 = acquireLatestImage.getPlanes()[2];
                        voipCamera.framePlaneCallback(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), plane.getBuffer(), plane.getRowStride(), plane2.getBuffer(), plane2.getRowStride(), plane3.getBuffer(), plane3.getRowStride(), plane2.getPixelStride());
                    }
                }
            }
            synchronized (this.A0H) {
                Image image = this.A03;
                if (image != null) {
                    image.close();
                }
                this.A03 = acquireLatestImage;
            }
        }
    }

    public void closeOnCameraThread() {
        int i2 = this.A00;
        boolean z2 = true;
        if (!(i2 == 0 || i2 == 1)) {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder("closing camera while still open: ");
        sb.append(i2);
        AnonymousClass00B.A0B(sb.toString(), z2);
        this.cameraEventsDispatcher.A00();
        this.A0D.close();
        synchronized (this.A0H) {
            Image image = this.A03;
            if (image != null) {
                image.close();
                this.A03 = null;
            }
        }
    }

    public int disableAREffectOnCameraThread() {
        Log.i("voip/video/VoipCamera/ Disabling AREffect");
        int i2 = 0;
        if (!this.cameraProcessorEnabled) {
            Log.i("voip/video/VoipCamera/ AREffect already disabled");
        } else if (this.A08) {
            Log.e("voip/video/VoipCamera/ Failed to disable AREffect. Configuring Session!");
            return -10;
        } else {
            if (this.videoPort != null) {
                releaseTexture();
            }
            this.cameraProcessorEnabled = false;
            this.A0D.setOnImageAvailableListener(new C91774gT(this), this.cameraThreadHandler);
            if (this.A00 == 2) {
                i2 = A09();
            }
            for (VoipCamera formatChangeCallback : this.virtualCameras.values()) {
                VoipPhysicalCamera.CameraInfo cameraInfo = this.A0G;
                formatChangeCallback.formatChangeCallback(cameraInfo.width, cameraInfo.height, cameraInfo.format, cameraInfo.fps1000);
            }
        }
        return i2;
    }

    public int enableAREffectOnCameraThread(C52002cn r3, C52012cp r4) {
        Log.i("voip/video/VoipCamera/ Enabling AREffect");
        if (this.cameraProcessorEnabled) {
            AnonymousClass00B.A06((Object) null);
            throw new NullPointerException("setEffect");
        } else if (this.A08) {
            Log.e("voip/video/VoipCamera/ Failed to set AREffect param. Configuring Session!");
            return -10;
        } else {
            if (this.videoPort != null) {
                releaseTexture();
            }
            setupCameraProcessor();
            Log.e("voip/video/VoipCamera/ Failed to set AREffect param. No Camera Processor!");
            this.cameraProcessorEnabled = false;
            return -11;
        }
    }

    public Point getAdjustedPreviewSize() {
        return this.A01;
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        boolean z2 = this.cameraProcessorEnabled;
        VoipPhysicalCamera.CameraInfo cameraInfo = this.A0G;
        return z2 ? new VoipPhysicalCamera.CameraInfo(cameraInfo.width, cameraInfo.height, 1, cameraInfo.fps1000, cameraInfo.isFrontCamera, cameraInfo.orientation, cameraInfo.idx) : cameraInfo;
    }

    public int getCameraStartMode() {
        return 0;
    }

    public C52042cs getLastCachedFrame() {
        synchronized (this.A0H) {
            Image image = this.A03;
            if (image == null || image.getPlanes().length < 3) {
                return null;
            }
            int width = ((this.A03.getWidth() * 3) * this.A03.getHeight()) / 2;
            ByteBuffer byteBuffer = this.A06;
            if (byteBuffer == null || byteBuffer.capacity() != width) {
                this.A06 = ByteBuffer.allocateDirect(width);
            }
            Image.Plane plane = this.A03.getPlanes()[0];
            Image.Plane plane2 = this.A03.getPlanes()[1];
            Image.Plane plane3 = this.A03.getPlanes()[2];
            VideoFrameConverter.convertAndroid420toI420(plane.getBuffer(), plane.getRowStride(), plane2.getBuffer(), plane2.getRowStride(), plane3.getBuffer(), plane3.getRowStride(), plane2.getPixelStride(), this.A03.getWidth(), this.A03.getHeight(), this.A06);
            byte[] bArr = new byte[width];
            this.A06.rewind();
            this.A06.get(bArr);
            C52042cs r2 = new C52042cs();
            r2.A05 = bArr;
            VoipPhysicalCamera.CameraInfo cameraInfo = this.A0G;
            r2.A03 = cameraInfo.width;
            r2.A01 = cameraInfo.height;
            r2.A00 = cameraInfo.format;
            r2.A02 = cameraInfo.orientation;
            r2.A04 = cameraInfo.isFrontCamera;
            return r2;
        }
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("VoipCameraApi2 does not support this operation ATM");
    }

    public boolean isCameraOpen() {
        return this.A00 == 2;
    }

    public void onFrameAvailableOnCameraThread() {
        VideoPort videoPort = this.videoPort;
        if (videoPort == null) {
            Log.e("voip/video/VoipCamera/videoport null while receiving frames");
            return;
        }
        AnonymousClass4V1 r2 = this.textureHolder;
        if (r2 != null) {
            VoipPhysicalCamera.CameraInfo cameraInfo = this.A0G;
            videoPort.renderTexture(r2, cameraInfo.width, cameraInfo.height);
        }
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        VideoPort videoPort2 = this.videoPort;
        int i2 = 0;
        if (videoPort2 != videoPort) {
            StringBuilder sb = new StringBuilder("voip/video/VoipCamera/setVideoPortOnCameraThread to ");
            sb.append(videoPort != null ? videoPort.hashCode() : 0);
            sb.append(" from ");
            sb.append(videoPort2 != null ? videoPort2.hashCode() : 0);
            sb.append(", status: ");
            sb.append(this.A00);
            Log.i(sb.toString());
            if (videoPort == null) {
                stopOnCameraThread();
                this.videoPort = null;
            } else if (this.A08) {
                return -10;
            } else {
                this.videoPort = videoPort;
                videoPort.setScaleType(0);
                int i3 = this.A00;
                if (i3 == 2) {
                    if (videoPort2 != null) {
                        releaseTexture();
                    }
                    i2 = A09();
                } else if (i3 == 0 || i3 == 1) {
                    i2 = startOnCameraThread();
                }
                if (i2 != 0) {
                    this.videoPort = videoPort2;
                    return i2;
                }
            }
        }
        return i2;
    }

    public int startOnCameraThread() {
        int i2 = this.A00;
        if (!(i2 == 2 || i2 == 3 || this.videoPort == null)) {
            if (i2 == 1) {
                Log.i("voip/video/VoipCamera/ Camera device is not fully closed, create camera device on close");
                this.A07 = true;
            } else if (A0I.get()) {
                Log.i("voip/video/VoipCamera/retryOpen");
                if (this.A05 == null) {
                    RunnableRunnableShape16S0100000_I0_15 runnableRunnableShape16S0100000_I0_15 = new RunnableRunnableShape16S0100000_I0_15(this, 35);
                    this.A05 = runnableRunnableShape16S0100000_I0_15;
                    this.cameraThreadHandler.postDelayed(runnableRunnableShape16S0100000_I0_15, 250);
                    return 0;
                }
            } else {
                try {
                    Log.i("voip/video/VoipCamera/ opening camera");
                    this.A0C.openCamera(Integer.toString(this.A09), this.A0B, this.cameraThreadHandler);
                    this.A00 = 3;
                    if (this.textureHolder == null) {
                        VoipPhysicalCamera.CameraInfo cameraInfo = this.A0G;
                        createTexture(cameraInfo.width, cameraInfo.height);
                        if (this.textureHolder == null) {
                            return -12;
                        }
                    }
                } catch (CameraAccessException e2) {
                    Log.e("voip/video/VoipCamera/ failed to open camera ", e2);
                    return -4;
                } catch (IllegalArgumentException e3) {
                    Log.e("voip/video/VoipCamera/ failed to open camera due to crashed HAL ", e3);
                    return -4;
                }
            }
        }
        return 0;
    }

    public int stopOnCameraThread() {
        stopPeriodicCameraCallbackCheck();
        CameraDevice cameraDevice = this.A02;
        if (cameraDevice != null) {
            this.A02 = null;
            this.A00 = 1;
            A0I.set(true);
            this.A0F.Aco(new VoipCameraApi2$StopCameraRunnable(this, cameraDevice));
        }
        Surface surface = this.A04;
        if (surface != null) {
            surface.release();
            this.A04 = null;
        }
        releaseTexture();
        Runnable runnable = this.A05;
        if (runnable != null) {
            this.cameraThreadHandler.removeCallbacks(runnable);
            this.A05 = null;
        }
        this.A07 = false;
        this.A08 = false;
        return 0;
    }

    public void updatePreviewOrientation() {
        if (this.videoPort != null) {
            syncRunOnCameraThread(new IDxCallableShape148S0100000_2_I0(this, 17), -100);
        }
    }
}
