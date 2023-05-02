package org.pjsip;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass4V1;
import X.C14710pd;
import X.C26821Pi;
import X.C52002cn;
import X.C52012cp;
import X.C52042cs;
import X.C87174Vs;
import X.C91794gV;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.hardware.Camera;
import android.media.Image;
import android.media.ImageReader;
import com.facebook.redex.IDxCallableShape148S0100000_2_I0;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class PjCamera extends VoipPhysicalCamera implements Camera.PreviewCallback {
    public volatile Point adjustedPreviewSize;
    public final int camIdx;
    public Camera camera;
    public final VoipPhysicalCamera.CameraInfo cameraInfo;
    public final AtomicInteger cameraStartMode = new AtomicInteger(0);
    public final Object frameLock = new Object();
    public boolean isRunning;
    public volatile byte[] lastCachedFrameData;
    public volatile boolean newFrameAvailable;
    public ImageReader.OnImageAvailableListener onImageAvailableListener;
    public boolean receivedCameraError = false;
    public final AnonymousClass01V systemServices;

    public PjCamera(int i2, int i3, int i4, int i5, int i6, AnonymousClass01V r16, C14710pd r17, Context context) {
        super(r17, context);
        StringBuilder sb = new StringBuilder("voip/video/VoipCamera/create idx: ");
        int i7 = i2;
        sb.append(i2);
        sb.append(", size:");
        int i8 = i3;
        sb.append(i3);
        sb.append("x");
        int i9 = i4;
        sb.append(i4);
        sb.append(", format: 0x");
        int i10 = i5;
        sb.append(Integer.toHexString(i5));
        sb.append(", fps * 1000: ");
        int i11 = i6;
        sb.append(i6);
        sb.append(", this ");
        sb.append(this);
        sb.append(", class ");
        Class<?> cls = getClass();
        sb.append(cls);
        sb.append("@");
        sb.append(cls.hashCode());
        sb.append(", class loader ");
        Class<PjCamera> cls2 = PjCamera.class;
        sb.append(cls2.getClassLoader());
        sb.append(", hash: ");
        sb.append(System.identityHashCode(cls2.getClassLoader()));
        Log.i(sb.toString());
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(i2, cameraInfo2);
        this.systemServices = r16;
        this.camIdx = i2;
        this.cameraInfo = new VoipPhysicalCamera.CameraInfo(i8, i9, i10, i11, cameraInfo2.facing == 1, cameraInfo2.orientation, i7);
    }

    private ImageReader.OnImageAvailableListener getImageAvailableListener() {
        ImageReader.OnImageAvailableListener onImageAvailableListener2 = this.onImageAvailableListener;
        if (onImageAvailableListener2 != null) {
            return onImageAvailableListener2;
        }
        C91794gV r0 = new C91794gV(this);
        this.onImageAvailableListener = r0;
        return r0;
    }

    public static int getPreviewSizeForFormat(int i2, int i3, int i4) {
        if (i4 != 842094169) {
            return ((i2 * i3) * ImageFormat.getBitsPerPixel(i4)) >> 3;
        }
        int ceil = ((int) Math.ceil(((double) i2) / 16.0d)) << 4;
        return Math.max(((i2 * i3) * 3) >> 1, (ceil * i3) + ((((((int) Math.ceil(((double) (ceil >> 1)) / 16.0d)) << 4) * i3) >> 1) << 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: imageAvailableListener */
    public void lambda$getImageAvailableListener$1(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            for (VoipCamera voipCamera : this.virtualCameras.values()) {
                if (voipCamera.started) {
                    updateCameraCallbackCheck();
                    if (acquireLatestImage.getPlanes().length == 1) {
                        voipCamera.abgrFramePlaneCallback(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), acquireLatestImage.getPlanes()[0].getBuffer(), acquireLatestImage.getWidth() << 2);
                    }
                }
            }
            acquireLatestImage.close();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$startOnCameraThread$0(int i2, Camera camera2) {
        StringBuilder sb = new StringBuilder("camera error occurred: ");
        sb.append(i2);
        Log.e(sb.toString());
        this.receivedCameraError = true;
        if (i2 != 2) {
            C87174Vs r3 = this.cameraEventsDispatcher;
            if (i2 != 100) {
                r3.A02();
                return;
            }
            Iterator it = r3.A00.iterator();
            while (it.hasNext()) {
                ((C26821Pi) it.next()).AX4(r3.A01);
            }
            return;
        }
        this.cameraEventsDispatcher.A01();
    }

    private int preparePreviewOnCameraThread() {
        AnonymousClass00B.A06(this.videoPort);
        VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
        createTexture(cameraInfo2.width, cameraInfo2.height);
        try {
            AnonymousClass4V1 r0 = this.textureHolder;
            if (r0 != null) {
                Camera camera2 = this.camera;
                AnonymousClass00B.A06(camera2);
                camera2.setPreviewTexture(r0.A01);
                this.videoPort.setScaleType(0);
                return 0;
            }
            Log.e("voip/video/VoipCamera/ Failed to create Surface Texture");
            this.cameraProcessor = null;
            return -12;
        } catch (IOException e2) {
            Log.e((Throwable) e2);
            return -2;
        }
    }

    private void stopPreviewOnCameraThread(boolean z2) {
        if (z2 && !this.receivedCameraError) {
            try {
                Camera camera2 = this.camera;
                AnonymousClass00B.A06(camera2);
                camera2.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                this.camera.stopPreview();
            } catch (RuntimeException e2) {
                Log.e("voip/video/VoipCamera/stopPreviewOnCameraThread exception while calling stopPreview", e2);
            }
        }
        releaseTexture();
    }

    private int tryNextStartModeOnCameraThread() {
        this.isRunning = false;
        this.cameraStartMode.incrementAndGet();
        stopOnCameraThread();
        if (this.passiveMode || this.cameraStartMode.get() > 2) {
            return -8;
        }
        return startOnCameraThread();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r1.getRotation() == 2) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateAdjustedPreviewSizeOnCameraThread() {
        /*
            r5 = this;
            X.01V r0 = r5.systemServices
            android.view.WindowManager r0 = r0.A0O()
            android.view.Display r1 = r0.getDefaultDisplay()
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r5.cameraInfo
            int r0 = r0.orientation
            int r0 = r0 % 180
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0015
            r3 = 1
        L_0x0015:
            int r0 = r1.getRotation()
            if (r0 == 0) goto L_0x0023
            int r2 = r1.getRotation()
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            if (r3 == r0) goto L_0x0027
            r4 = 0
        L_0x0027:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r5.cameraInfo
            if (r4 == 0) goto L_0x0037
            int r2 = r0.width
            int r1 = r0.height
        L_0x002f:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            r5.adjustedPreviewSize = r0
            return
        L_0x0037:
            int r2 = r0.height
            int r1 = r0.width
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.updateAdjustedPreviewSizeOnCameraThread():void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r1 != 3) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int updatePreviewOrientationOnCameraThread() {
        /*
            r7 = this;
            com.whatsapp.voipcalling.VideoPort r0 = r7.videoPort
            if (r0 == 0) goto L_0x0085
            boolean r0 = r7.isRunning
            if (r0 == 0) goto L_0x0085
            X.01V r0 = r7.systemServices
            android.view.WindowManager r0 = r0.A0O()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            r6 = 0
            if (r1 == 0) goto L_0x0024
            r0 = 1
            if (r1 == r0) goto L_0x0071
            r0 = 2
            if (r1 == r0) goto L_0x006e
            r0 = 3
            r5 = 270(0x10e, float:3.78E-43)
            if (r1 == r0) goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r7.cameraInfo
            boolean r4 = r0.isFrontCamera
            int r3 = r0.orientation
            int r0 = r3 - r5
            int r0 = r0 + 360
            if (r4 == 0) goto L_0x0037
            int r0 = r3 + r5
            int r0 = r0 % 360
            int r0 = 360 - r0
        L_0x0037:
            int r2 = r0 % 360
            java.lang.String r0 = "voip/video/VoipCamera/updatePreviewOrientationOnCameraThread to "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " degree. Camera #"
            r1.append(r0)
            int r0 = r7.camIdx
            r1.append(r0)
            java.lang.String r0 = ", facing front: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", camera orientation: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", activity rotation: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0074
        L_0x006e:
            r5 = 180(0xb4, float:2.52E-43)
            goto L_0x0025
        L_0x0071:
            r5 = 90
            goto L_0x0025
        L_0x0074:
            android.hardware.Camera r0 = r7.camera     // Catch:{ Exception -> 0x007d }
            X.AnonymousClass00B.A06(r0)     // Catch:{ Exception -> 0x007d }
            r0.setDisplayOrientation(r2)     // Catch:{ Exception -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0081:
            r7.updateAdjustedPreviewSizeOnCameraThread()
            return r6
        L_0x0085:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.updatePreviewOrientationOnCameraThread():int");
    }

    public void closeOnCameraThread() {
        Log.i("voip/video/VoipCamera/closeOnCameraThread");
        AnonymousClass00B.A0B("close should only be called after stop.", !this.isRunning);
        this.cameraEventsDispatcher.A00();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int disableAREffectOnCameraThread() {
        /*
            r7 = this;
            java.lang.String r0 = "voip/video/VoipCamera/ Disabling AREffect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r7.cameraProcessorEnabled
            r6 = 0
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "voip/video/VoipCamera/ AREffect already disabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0011:
            return r6
        L_0x0012:
            r1 = 1
            java.lang.String r0 = "Camera processor should not be null when cameraProcessorEnabled is true"
            X.AnonymousClass00B.A0B(r0, r6)
            r7.cameraProcessorEnabled = r6
            boolean r0 = r7.isRunning
            if (r0 == 0) goto L_0x0047
            com.whatsapp.voipcalling.VideoPort r0 = r7.videoPort
            if (r0 == 0) goto L_0x0023
            r6 = 1
        L_0x0023:
            java.lang.String r0 = "video port should not be null if the camera is running."
            X.AnonymousClass00B.A0B(r0, r6)
            r7.stopPreviewOnCameraThread(r1)
            int r6 = r7.preparePreviewOnCameraThread()
            if (r6 == 0) goto L_0x006b
            java.lang.String r1 = "voip/video/VoipCamera/ Disabling AREffect: preparePreviewOnCameraThread failed with "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r7.stopOnCameraThread()
        L_0x0047:
            java.util.Map r0 = r7.virtualCameras
            java.util.Collection r0 = r0.values()
            java.util.Iterator r5 = r0.iterator()
        L_0x0051:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r4 = r5.next()
            com.whatsapp.voipcalling.camera.VoipCamera r4 = (com.whatsapp.voipcalling.camera.VoipCamera) r4
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r7.cameraInfo
            int r3 = r0.width
            int r2 = r0.height
            int r1 = r0.format
            int r0 = r0.fps1000
            r4.formatChangeCallback(r3, r2, r1, r0)
            goto L_0x0051
        L_0x006b:
            android.hardware.Camera r0 = r7.camera
            X.AnonymousClass00B.A06(r0)
            r0.setPreviewCallback(r7)
            int r6 = r7.updatePreviewOrientationOnCameraThread()
            android.hardware.Camera r0 = r7.camera
            r0.startPreview()
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.disableAREffectOnCameraThread():int");
    }

    public int enableAREffectOnCameraThread(C52002cn r3, C52012cp r4) {
        Log.i("voip/video/VoipCamera/ Enabling AREffect");
        if (this.cameraProcessorEnabled) {
            AnonymousClass00B.A06((Object) null);
            throw new NullPointerException("setEffect");
        }
        setupCameraProcessor();
        Log.e("voip/video/VoipCamera/ Failed to set AREffect param. No Camera Processor!");
        return -11;
    }

    public Point getAdjustedPreviewSize() {
        return this.adjustedPreviewSize;
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        boolean z2 = this.cameraProcessorEnabled;
        VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
        return z2 ? new VoipPhysicalCamera.CameraInfo(cameraInfo2.width, cameraInfo2.height, 1, cameraInfo2.fps1000, cameraInfo2.isFrontCamera, cameraInfo2.orientation, cameraInfo2.idx) : cameraInfo2;
    }

    public int getCameraStartMode() {
        return this.cameraStartMode.get();
    }

    public C52042cs getLastCachedFrame() {
        byte[] bArr = this.lastCachedFrameData;
        if (bArr == null) {
            return null;
        }
        C52042cs r2 = new C52042cs();
        r2.A05 = bArr;
        VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
        r2.A03 = cameraInfo2.width;
        r2.A01 = cameraInfo2.height;
        r2.A00 = cameraInfo2.format;
        r2.A02 = cameraInfo2.orientation;
        r2.A04 = cameraInfo2.isFrontCamera;
        return r2;
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        AnonymousClass00B.A0B("Should be here only in passive mode", this.passiveMode);
        if (!this.passiveMode) {
            return -1;
        }
        synchronized (this.frameLock) {
            if (!this.newFrameAvailable) {
                return 0;
            }
            int min = Math.min(byteBuffer.capacity(), this.lastCachedFrameData.length);
            byteBuffer.rewind();
            byteBuffer.order(ByteOrder.nativeOrder());
            byteBuffer.put(this.lastCachedFrameData, 0, min);
            this.newFrameAvailable = false;
            return min;
        }
    }

    public boolean isCameraOpen() {
        return this.isRunning;
    }

    public void onFrameAvailableOnCameraThread() {
        VideoPort videoPort = this.videoPort;
        if (videoPort == null) {
            Log.e("voip/video/VoipCamera/videoport null while receiving frames");
            return;
        }
        AnonymousClass4V1 r2 = this.textureHolder;
        if (r2 != null) {
            VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
            videoPort.renderTexture(r2, cameraInfo2.width, cameraInfo2.height);
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera2) {
        byte[] bArr2;
        if (camera2 != null && bArr != null) {
            Camera camera3 = this.camera;
            if (camera2 != camera3) {
                StringBuilder sb = new StringBuilder("Unexpected camera in callback! current camera = ");
                sb.append(camera3);
                sb.append(", callback camera is ");
                sb.append(camera2);
                Log.w(sb.toString());
                return;
            }
            updateCameraCallbackCheck();
            if (this.isRunning) {
                if (this.passiveMode) {
                    synchronized (this.frameLock) {
                        bArr2 = this.lastCachedFrameData;
                        this.lastCachedFrameData = bArr;
                        this.newFrameAvailable = true;
                    }
                    bArr = bArr2;
                } else {
                    for (Map.Entry entry : this.virtualCameras.entrySet()) {
                        if (((VoipCamera) entry.getValue()).started) {
                            ((VoipCamera) entry.getValue()).frameCallback(bArr, bArr.length);
                        }
                    }
                    this.lastCachedFrameData = bArr;
                }
            }
            if (this.cameraStartMode.get() == 0) {
                camera2.addCallbackBuffer(bArr);
            }
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
            sb.append(", running: ");
            sb.append(this.isRunning);
            Log.i(sb.toString());
            if (!this.isRunning) {
                this.videoPort = videoPort;
                if (!(videoPort == null || (i2 = startOnCameraThread()) == 0)) {
                    stopOnCameraThread();
                    this.videoPort = videoPort2;
                }
            } else if (videoPort != null) {
                stopPreviewOnCameraThread(true);
                this.videoPort = videoPort;
                if (preparePreviewOnCameraThread() != 0) {
                    stopOnCameraThread();
                    this.videoPort = videoPort2;
                    return -7;
                }
                Camera camera2 = this.camera;
                AnonymousClass00B.A06(camera2);
                camera2.setPreviewCallback(this);
                int updatePreviewOrientationOnCameraThread = updatePreviewOrientationOnCameraThread();
                this.camera.startPreview();
                return updatePreviewOrientationOnCameraThread;
            } else {
                int stopOnCameraThread = stopOnCameraThread();
                this.videoPort = null;
                return stopOnCameraThread;
            }
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x015e, code lost:
        if (r8.contains(r7) != false) goto L_0x0160;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int startOnCameraThread() {
        /*
            r17 = this;
            java.lang.String r4 = ": "
            r3 = r17
            boolean r0 = r3.isRunning
            r2 = 0
            if (r0 != 0) goto L_0x033e
            java.lang.String r0 = "voip/video/VoipCamera/startOnCameraThread. ENTER. videoPort = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            com.whatsapp.voipcalling.VideoPort r0 = r3.videoPort
            r1.append(r0)
            java.lang.String r0 = " at start mode: "
            r1.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cameraStartMode
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.hardware.Camera r0 = r3.camera
            if (r0 != 0) goto L_0x004b
            int r0 = r3.camIdx     // Catch:{ Exception -> 0x003c }
            android.hardware.Camera r5 = android.hardware.Camera.open(r0)     // Catch:{ Exception -> 0x003c }
            r3.camera = r5     // Catch:{ Exception -> 0x003c }
            if (r5 != 0) goto L_0x0042
            java.lang.String r0 = "camera is null after open"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = -5
            return r0
        L_0x003c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = -4
            return r0
        L_0x0042:
            r1 = 1
            com.facebook.redex.IDxECallbackShape319S0100000_2_I0 r0 = new com.facebook.redex.IDxECallbackShape319S0100000_2_I0
            r0.<init>(r3, r1)
            r5.setErrorCallback(r0)
        L_0x004b:
            com.whatsapp.voipcalling.VideoPort r0 = r3.videoPort
            if (r0 == 0) goto L_0x033e
            int r0 = r3.preparePreviewOnCameraThread()
            if (r0 == 0) goto L_0x0057
            r0 = -2
            return r0
        L_0x0057:
            android.hardware.Camera r0 = r3.camera     // Catch:{ RuntimeException -> 0x0334 }
            android.hardware.Camera$Parameters r5 = r0.getParameters()     // Catch:{ RuntimeException -> 0x0334 }
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r3.cameraInfo
            int r1 = r0.width
            int r0 = r0.height
            r5.setPreviewSize(r1, r0)
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r3.cameraInfo
            int r0 = r0.format
            r5.setPreviewFormat(r0)
            java.lang.String r0 = "voip/video/VoipCamera/startOnCameraThread setting camera params at start mode: "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cameraStartMode
            r6.append(r0)
            java.lang.String r0 = " width: "
            r6.append(r0)
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r1 = r3.cameraInfo
            int r0 = r1.width
            r6.append(r0)
            java.lang.String r0 = " height: "
            r6.append(r0)
            int r0 = r1.height
            r6.append(r0)
            java.lang.String r0 = " format: "
            r6.append(r0)
            int r0 = r1.format
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cameraStartMode
            int r0 = r0.get()
            r6 = 2
            if (r0 <= r6) goto L_0x00af
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cameraStartMode
            r0.set(r6)
        L_0x00af:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cameraStartMode
            int r0 = r0.get()
            r16 = 0
            r1 = 1
            if (r0 == r6) goto L_0x0142
            java.util.List r0 = r5.getSupportedPreviewFpsRange()
            if (r0 == 0) goto L_0x0142
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            java.util.Iterator r15 = r0.iterator()
        L_0x00c6:
            boolean r0 = r15.hasNext()
            java.lang.String r10 = "], score: "
            java.lang.String r11 = ", "
            if (r0 == 0) goto L_0x0109
            java.lang.Object r13 = r15.next()
            int[] r13 = (int[]) r13
            int r0 = r13.length
            if (r0 != r6) goto L_0x00c6
            r14 = r13[r2]
            r12 = r13[r1]
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r3.cameraInfo
            int r0 = r0.fps1000
            int r8 = com.whatsapp.voipcalling.camera.VoipPhysicalCamera.fpsRangeScore(r14, r12, r0)
            java.lang.String r7 = "voip/video/VoipCamera/startOnCameraThread check fps ["
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            r0.append(r14)
            r0.append(r11)
            r0.append(r12)
            r0.append(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r8 <= r9) goto L_0x00c6
            r16 = r13
            r9 = r8
            goto L_0x00c6
        L_0x0109:
            if (r16 == 0) goto L_0x0142
            java.lang.String r0 = "voip/video/VoipCamera/startOnCameraThread with fps range ["
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r0 = r16[r2]
            r7.append(r0)
            r7.append(r11)
            r0 = r16[r1]
            r7.append(r0)
            r7.append(r10)
            r7.append(r9)
            java.lang.String r0 = ", supported ranges : "
            r7.append(r0)
            java.lang.String r0 = "preview-fps-range-values"
            java.lang.String r0 = r5.get(r0)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = r16[r2]
            r0 = r16[r1]
            r5.setPreviewFpsRange(r7, r0)
        L_0x0142:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cameraStartMode
            int r0 = r0.get()
            if (r0 != 0) goto L_0x0237
            java.util.List r8 = r5.getSupportedFocusModes()
            if (r8 == 0) goto L_0x0163
            java.lang.String r7 = "continuous-video"
            boolean r0 = r8.contains(r7)
            if (r0 != 0) goto L_0x0160
            java.lang.String r7 = "infinity"
            boolean r0 = r8.contains(r7)
            if (r0 == 0) goto L_0x0163
        L_0x0160:
            r5.setFocusMode(r7)
        L_0x0163:
            java.util.List r8 = r5.getSupportedFlashModes()
            if (r8 == 0) goto L_0x017a
            java.lang.String r0 = r5.getFlashMode()
            if (r0 == 0) goto L_0x017a
            java.lang.String r7 = "off"
            boolean r0 = r8.contains(r7)
            if (r0 == 0) goto L_0x017a
            r5.setFlashMode(r7)
        L_0x017a:
            boolean r0 = r5.isAutoExposureLockSupported()
            if (r0 == 0) goto L_0x0183
            r5.setAutoExposureLock(r2)
        L_0x0183:
            boolean r0 = r5.isAutoWhiteBalanceLockSupported()
            if (r0 == 0) goto L_0x018c
            r5.setAutoWhiteBalanceLock(r2)
        L_0x018c:
            java.lang.String r0 = "voip/video/VoipCamera/startOnCameraThread with scene mode: "
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r0 = r5.getSceneMode()
            r7.append(r0)
            java.lang.String r0 = ", supported scene mode: ["
            r7.append(r0)
            java.lang.String r0 = "scene-mode-values"
            java.lang.String r0 = r5.get(r0)
            r7.append(r0)
            java.lang.String r0 = "], focus mode: "
            r7.append(r0)
            java.lang.String r0 = r5.getFocusMode()
            r7.append(r0)
            java.lang.String r0 = ", supported focus mode: ["
            r7.append(r0)
            java.lang.String r0 = "focus-mode-values"
            java.lang.String r0 = r5.get(r0)
            r7.append(r0)
            java.lang.String r0 = "], flash mode: "
            r7.append(r0)
            java.lang.String r0 = r5.getFlashMode()
            r7.append(r0)
            java.lang.String r0 = ", supported flash mode: ["
            r7.append(r0)
            java.lang.String r0 = "flash-mode-values"
            java.lang.String r0 = r5.get(r0)
            r7.append(r0)
            java.lang.String r0 = "], white balance: "
            r7.append(r0)
            java.lang.String r0 = r5.getWhiteBalance()
            r7.append(r0)
            java.lang.String r0 = ", supported white balance: ["
            r7.append(r0)
            java.lang.String r0 = "whitebalance-values"
            java.lang.String r0 = r5.get(r0)
            r7.append(r0)
            java.lang.String r0 = "], white balance lock: "
            r7.append(r0)
            boolean r0 = r5.getAutoWhiteBalanceLock()
            r7.append(r0)
            java.lang.String r0 = ", exposure: "
            r7.append(r0)
            int r0 = r5.getExposureCompensation()
            r7.append(r0)
            java.lang.String r0 = ", supported exposure range: ["
            r7.append(r0)
            int r0 = r5.getMinExposureCompensation()
            r7.append(r0)
            int r0 = r5.getMaxExposureCompensation()
            r7.append(r0)
            java.lang.String r0 = "], , exposure lock: "
            r7.append(r0)
            boolean r0 = r5.getAutoExposureLock()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0237:
            android.hardware.Camera r0 = r3.camera     // Catch:{ RuntimeException -> 0x02fe }
            r0.setParameters(r5)     // Catch:{ RuntimeException -> 0x02fe }
            r3.isRunning = r1
            r3.receivedCameraError = r2
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cameraStartMode
            int r0 = r0.get()
            if (r0 != 0) goto L_0x02a5
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r3.cameraInfo
            int r5 = r0.width
            int r1 = r0.height
            int r0 = r0.format
            int r5 = getPreviewSizeForFormat(r5, r1, r0)
            android.hardware.Camera r1 = r3.camera     // Catch:{ OutOfMemoryError -> 0x0288 }
            byte[] r0 = new byte[r5]     // Catch:{ OutOfMemoryError -> 0x0288 }
            r1.addCallbackBuffer(r0)     // Catch:{ OutOfMemoryError -> 0x0288 }
            boolean r0 = r3.passiveMode     // Catch:{ OutOfMemoryError -> 0x0288 }
            if (r0 == 0) goto L_0x0286
            byte[] r0 = new byte[r5]     // Catch:{ OutOfMemoryError -> 0x0288 }
            r3.lastCachedFrameData = r0     // Catch:{ OutOfMemoryError -> 0x0288 }
        L_0x0263:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0288 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0288 }
            java.lang.String r0 = "voip/video/VoipCamera/startOnCameraThread. added "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x0288 }
            r1.append(r6)     // Catch:{ OutOfMemoryError -> 0x0288 }
            java.lang.String r0 = " buffers of "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x0288 }
            r1.append(r5)     // Catch:{ OutOfMemoryError -> 0x0288 }
            java.lang.String r0 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x0288 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OutOfMemoryError -> 0x0288 }
            android.hardware.Camera r0 = r3.camera     // Catch:{ OutOfMemoryError -> 0x0288 }
            r0.setPreviewCallbackWithBuffer(r3)     // Catch:{ OutOfMemoryError -> 0x0288 }
            goto L_0x02be
        L_0x0286:
            r6 = 1
            goto L_0x0263
        L_0x0288:
            r2 = move-exception
            java.lang.String r0 = "voip/video/VoipCamera/startOnCameraThread. OOM when adding callback buffers at start mode: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cameraStartMode
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            int r0 = r3.tryNextStartModeOnCameraThread()
            return r0
        L_0x02a5:
            java.lang.String r0 = "voip/video/VoipCamera/startOnCameraThread not adding callback buffers at start mode: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cameraStartMode
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.hardware.Camera r0 = r3.camera
            r0.setPreviewCallback(r3)
        L_0x02be:
            r3.updatePreviewOrientationOnCameraThread()
            android.hardware.Camera r0 = r3.camera     // Catch:{ Exception -> 0x02e1 }
            r0.startPreview()     // Catch:{ Exception -> 0x02e1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e1 }
            r1.<init>()     // Catch:{ Exception -> 0x02e1 }
            java.lang.String r0 = "voip/video/VoipCamera/startOnCameraThread success EXIT at attempt: "
            r1.append(r0)     // Catch:{ Exception -> 0x02e1 }
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cameraStartMode     // Catch:{ Exception -> 0x02e1 }
            r1.append(r0)     // Catch:{ Exception -> 0x02e1 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x02e1 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x02e1 }
            r3.startPeriodicCameraCallbackCheck()     // Catch:{ Exception -> 0x02e1 }
            return r2
        L_0x02e1:
            r2 = move-exception
            java.lang.String r0 = "voip/video/VoipCamera/startOnCameraThread/startPreview threw at attempt: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cameraStartMode
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            int r0 = r3.tryNextStartModeOnCameraThread()
            return r0
        L_0x02fe:
            r2 = move-exception
            java.lang.String r0 = "voip/video/VoipCamera/startOnCameraThread/setParameters threw at attempt: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.cameraStartMode
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            X.4Vs r4 = r3.cameraEventsDispatcher
            int r3 = r3.camIdx
            java.util.concurrent.CopyOnWriteArraySet r0 = r4.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0320:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0332
            java.lang.Object r1 = r2.next()
            X.1Pi r1 = (X.C26821Pi) r1
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r0 = r4.A01
            r1.AO2(r0, r3)
            goto L_0x0320
        L_0x0332:
            r0 = -3
            return r0
        L_0x0334:
            r1 = move-exception
            java.lang.String r0 = "voip/video/VoipCamera/startOnCameraThread camera getParameters threw"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = -9
            return r0
        L_0x033e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.startOnCameraThread():int");
    }

    public void startPreview(Camera camera2) {
        camera2.startPreview();
    }

    public int stopOnCameraThread() {
        boolean z2 = this.isRunning;
        this.isRunning = false;
        stopPeriodicCameraCallbackCheck();
        if (this.camera == null) {
            return -6;
        }
        Log.i("voip/video/VoipCamera/stopOnCameraThread");
        stopPreviewOnCameraThread(z2);
        this.camera.release();
        this.camera = null;
        return 0;
    }

    public void updatePreviewOrientation() {
        Log.i("voip/video/VoipCamera/updateCameraPreviewOrientation Enter");
        int intValue = ((Number) syncRunOnCameraThread(new IDxCallableShape148S0100000_2_I0(this, 20), -100)).intValue();
        StringBuilder sb = new StringBuilder("voip/video/VoipCamera/updateCameraPreviewOrientation Exit with ");
        sb.append(intValue);
        Log.i(sb.toString());
    }
}
