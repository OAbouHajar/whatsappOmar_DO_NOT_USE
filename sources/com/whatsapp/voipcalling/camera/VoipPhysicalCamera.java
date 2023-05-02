package com.whatsapp.voipcalling.camera;

import X.AnonymousClass00B;
import X.AnonymousClass1UT;
import X.AnonymousClass3M4;
import X.AnonymousClass4V1;
import X.C1050457z;
import X.C108165Mx;
import X.C14710pd;
import X.C16620tM;
import X.C18450wi;
import X.C26821Pi;
import X.C52002cn;
import X.C52012cp;
import X.C52042cs;
import X.C63853Lt;
import X.C87174Vs;
import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.facebook.redex.IDxAListenerShape424S0100000_2_I0;
import com.facebook.redex.IDxCallableShape148S0100000_2_I0;
import com.facebook.redex.IDxCallableShape45S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

public abstract class VoipPhysicalCamera {
    public static final int CAMERA_MODE_CONSERVATIVE = 1;
    public static final int CAMERA_MODE_DEFAULT = 0;
    public static final int CAMERA_MODE_NO_FPS_RANGE = 2;
    public static final int ERROR_CAMERA_PROCESSOR_SETUP_ERROR = -11;
    public static final int ERROR_CAMERA_SESSION_CONFIGURING = -10;
    public static final int ERROR_EXCEPTION_IN_CAMERA = -9;
    public static final int ERROR_INVALID_STATE = -1;
    public static final int ERROR_NO_CAMERA_AFTER_OPEN = -5;
    public static final int ERROR_NO_CAMERA_IN_STOP = -6;
    public static final int ERROR_NO_SURFACE_TEXTURE = -12;
    public static final int ERROR_OPEN_CAMERA = -4;
    public static final int ERROR_POST_TO_LOOPER = -100;
    public static final int ERROR_SETUP_PREVIEW = -2;
    public static final int ERROR_SET_PARAMETERS = -3;
    public static final int ERROR_START_FINAL_FAILED = -8;
    public static final int ERROR_SWITCH_SURFACE_VIEW = -7;
    public static final int MESSAGE_LAST_CAMERA_CALLBACK_CHECK = 1;
    public static final int MESSAGE_ON_FRAME_AVAILABLE = 2;
    public static final int SUCCESS = 0;
    public static final String TAG = "voip/video/VoipCamera/";
    public final C14710pd abProps;
    public long cameraCallbackCount;
    public final C87174Vs cameraEventsDispatcher = new C87174Vs(this);
    public C108165Mx cameraProcessor;
    public boolean cameraProcessorEnabled = false;
    public HandlerThread cameraThread;
    public final Handler cameraThreadHandler;
    public final Context context;
    public long lastCameraCallbackTs;
    public boolean passiveMode;
    public volatile boolean textureApiFailed;
    public AnonymousClass4V1 textureHolder;
    public final long thresholdRestartCameraMillis = 2000;
    public long totalElapsedCameraCallbackTime;
    public VideoPort videoPort;
    public final Map virtualCameras;

    public class CameraInfo {
        public final int format;
        public final int fps1000;
        public final int height;
        public final int idx;
        public final boolean isFrontCamera;
        public final int orientation;
        public final int width;

        public CameraInfo(int i2, int i3, int i4, int i5, boolean z2, int i6, int i7) {
            this.width = i2;
            this.height = i3;
            this.format = i4;
            this.fps1000 = i5;
            this.isFrontCamera = z2;
            this.orientation = i6;
            this.idx = i7;
        }
    }

    public VoipPhysicalCamera(C14710pd r3, Context context2) {
        this.abProps = r3;
        this.context = context2;
        this.virtualCameras = new HashMap();
        AnonymousClass3M4 r0 = new AnonymousClass3M4(this);
        this.cameraThread = r0;
        r0.start();
        this.cameraThreadHandler = new C63853Lt(this.cameraThread.getLooper(), this);
    }

    private void clearFrameAvailableMessages() {
        this.cameraThreadHandler.removeMessages(2);
    }

    private Object exchange(Exchanger exchanger, Object obj) {
        try {
            return exchanger.exchange(obj);
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static int fpsRangeScore(int i2, int i3, int i4) {
        return ((i2 <= 5000 ? -(5000 - i2) : (-(i2 - 5000)) << 2) - Math.abs(i3 - i4)) / 1000;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$close$5(boolean z2) {
        if (z2) {
            this.virtualCameras.clear();
        }
        if (this.virtualCameras.size() != 0) {
            return Boolean.FALSE;
        }
        closeOnCameraThread();
        return Boolean.TRUE;
    }

    private /* synthetic */ void lambda$createTexture$8(SurfaceTexture surfaceTexture) {
        notifyFrameAvailable();
    }

    private /* synthetic */ Integer lambda$disableAREffect$2() {
        return Integer.valueOf(disableAREffectOnCameraThread());
    }

    private /* synthetic */ Integer lambda$enableAREffect$1(C52002cn r2, C52012cp r3) {
        return Integer.valueOf(enableAREffectOnCameraThread(r2, r3));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$registerVirtualCamera$6(VoipCamera voipCamera) {
        if (!this.virtualCameras.containsKey(Long.valueOf(voipCamera.userIdentity))) {
            this.virtualCameras.put(Long.valueOf(voipCamera.userIdentity), voipCamera);
        }
        return 0;
    }

    private /* synthetic */ Integer lambda$setVideoPort$3(VideoPort videoPort2) {
        return Integer.valueOf(setVideoPortOnCameraThread(videoPort2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$stop$4() {
        int i2;
        Iterator it = this.virtualCameras.entrySet().iterator();
        boolean z2 = true;
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            } else if (((VoipCamera) ((Map.Entry) it.next()).getValue()).started) {
                z2 = false;
            }
        }
        if (z2) {
            i2 = stopOnCameraThread();
        }
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$syncRunOnCameraThread$0(Exchanger exchanger, Callable callable) {
        try {
            exchange(exchanger, callable.call());
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$unregisterVirtualCamera$7(VoipCamera voipCamera) {
        this.virtualCameras.remove(Long.valueOf(voipCamera.userIdentity));
        return Integer.valueOf(this.virtualCameras.size() == 0 ? stopOnCameraThread() : 0);
    }

    /* access modifiers changed from: private */
    public void notifyFrameAvailable() {
        this.cameraThreadHandler.sendEmptyMessage(2);
    }

    public final void addCameraEventsListener(C26821Pi r3) {
        C87174Vs r1 = this.cameraEventsDispatcher;
        synchronized (r1) {
            r1.A00.add(r3);
        }
    }

    public final synchronized void close(boolean z2) {
        HandlerThread handlerThread;
        Log.i("voip/video/VoipCamera/close Enter");
        if (((Boolean) syncRunOnCameraThread(new C1050457z(this, z2), Boolean.FALSE)).booleanValue() && (handlerThread = this.cameraThread) != null) {
            handlerThread.quit();
            this.cameraThread = null;
        }
        Log.i("voip/video/VoipCamera/close Exit");
    }

    public abstract void closeOnCameraThread();

    public void createTexture(int i2, int i3) {
        boolean z2 = false;
        if (this.videoPort != null) {
            z2 = true;
        }
        AnonymousClass00B.A0B("videoport should not be null in createTexture", z2);
        AnonymousClass4V1 r0 = this.textureHolder;
        if (r0 == null) {
            r0 = this.videoPort.createSurfaceTexture();
            this.textureHolder = r0;
            if (r0 == null) {
                Log.e("voip/video/VoipCamera/createSurfaceTexture failed to create SurfaceTexture");
                this.textureApiFailed = true;
                return;
            }
        }
        r0.A01.setOnFrameAvailableListener(new IDxAListenerShape424S0100000_2_I0(this, 1));
        this.textureHolder.A01.setDefaultBufferSize(i2, i3);
    }

    public int disableAREffect() {
        Log.i("voip/video/VoipCamera/disableAREffect Enter");
        StringBuilder sb = new StringBuilder("voip/video/VoipCamera/disableAREffect Exit with ");
        sb.append(0);
        Log.i(sb.toString());
        return 0;
    }

    public abstract int disableAREffectOnCameraThread();

    public int enableAREffect(C52002cn r4, C52012cp r5) {
        Log.i("voip/video/VoipCamera/enableAREffect Enter");
        StringBuilder sb = new StringBuilder("voip/video/VoipCamera/enableAREffect Exit with ");
        sb.append(0);
        Log.i(sb.toString());
        return 0;
    }

    public abstract int enableAREffectOnCameraThread(C52002cn r1, C52012cp r2);

    public abstract Point getAdjustedPreviewSize();

    public final int getAverageCaptureFps() {
        long j2 = this.totalElapsedCameraCallbackTime;
        if (j2 <= 0) {
            return 0;
        }
        return (int) ((this.cameraCallbackCount * 1000) / j2);
    }

    public abstract CameraInfo getCameraInfo();

    public abstract int getCameraStartMode();

    public abstract C52042cs getLastCachedFrame();

    public abstract int getLatestFrame(ByteBuffer byteBuffer);

    public final boolean isAvatarDriver() {
        return Build.VERSION.SDK_INT >= 21 && this.abProps.A0E(C16620tM.A02, 1402);
    }

    public abstract boolean isCameraOpen();

    public final boolean isPassiveMode() {
        return this.passiveMode;
    }

    public boolean isTextureApiFailed() {
        return this.textureApiFailed;
    }

    public abstract void onFrameAvailableOnCameraThread();

    public int registerVirtualCamera(VoipCamera voipCamera) {
        StringBuilder sb = new StringBuilder("voip/video/VoipCamera/Add new virtual camera with user identity ");
        sb.append(voipCamera.userIdentity);
        Log.i(sb.toString());
        return ((Number) syncRunOnCameraThread(new IDxCallableShape45S0200000_2_I0(this, 6, voipCamera), -1)).intValue();
    }

    public void releaseTexture() {
        boolean z2 = false;
        if (this.textureHolder != null) {
            if (this.videoPort != null) {
                z2 = true;
            }
            AnonymousClass00B.A0B("video port should not be null in releaseTexture", z2);
            this.textureHolder.A01.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
            clearFrameAvailableMessages();
            this.videoPort.releaseSurfaceTexture(this.textureHolder);
            this.textureHolder = null;
        }
    }

    public final void removeCameraEventsListener(C26821Pi r3) {
        C87174Vs r1 = this.cameraEventsDispatcher;
        synchronized (r1) {
            r1.A00.remove(r3);
        }
    }

    public final void setPassiveMode(boolean z2) {
        this.passiveMode = z2;
    }

    public final synchronized int setVideoPort(VideoPort videoPort2) {
        int intValue;
        Log.i("voip/video/VoipCamera/setVideoPort Enter");
        intValue = ((Integer) syncRunOnCameraThread(new IDxCallableShape45S0200000_2_I0(this, 5, videoPort2), -100)).intValue();
        StringBuilder sb = new StringBuilder();
        sb.append("voip/video/VoipCamera/setVideoPort Exit with ");
        sb.append(intValue);
        Log.i(sb.toString());
        return intValue;
    }

    public abstract int setVideoPortOnCameraThread(VideoPort videoPort2);

    public void setupCameraProcessor() {
        if (isAvatarDriver()) {
            throw new AnonymousClass1UT(C18450wi.A06("An operation is not implemented: ", "Not implemented"));
        }
    }

    public final synchronized int start() {
        int intValue;
        StringBuilder sb = new StringBuilder();
        sb.append("voip/video/VoipCamera/start Enter in ");
        sb.append(this.passiveMode ? "passive " : "active ");
        sb.append("mode");
        Log.i(sb.toString());
        intValue = ((Integer) syncRunOnCameraThread(new IDxCallableShape148S0100000_2_I0(this, 18), -100)).intValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voip/video/VoipCamera/start Exit with ");
        sb2.append(intValue);
        Log.i(sb2.toString());
        return intValue;
    }

    public abstract int startOnCameraThread();

    public final void startPeriodicCameraCallbackCheck() {
        stopPeriodicCameraCallbackCheck();
        this.cameraThreadHandler.sendEmptyMessageDelayed(1, 1000);
    }

    public final synchronized void stop() {
        Log.i("voip/video/VoipCamera/stop Enter");
        int intValue = ((Integer) syncRunOnCameraThread(new IDxCallableShape148S0100000_2_I0(this, 19), -100)).intValue();
        StringBuilder sb = new StringBuilder();
        sb.append("voip/video/VoipCamera/stop Exit with ");
        sb.append(intValue);
        Log.i(sb.toString());
    }

    public abstract int stopOnCameraThread();

    public final void stopPeriodicCameraCallbackCheck() {
        this.cameraThreadHandler.removeMessages(1);
        this.lastCameraCallbackTs = SystemClock.elapsedRealtime();
    }

    public final Object syncRunOnCameraThread(Callable callable, Object obj) {
        Exchanger exchanger = new Exchanger();
        return this.cameraThreadHandler.post(new RunnableRunnableShape2S0300000_I0_2(this, exchanger, callable, 26)) ? exchange(exchanger, (Object) null) : obj;
    }

    public int unregisterVirtualCamera(VoipCamera voipCamera) {
        StringBuilder sb = new StringBuilder("voip/video/VoipCamera/Remove virtual camera with user identity ");
        sb.append(voipCamera.userIdentity);
        Log.i(sb.toString());
        return ((Number) syncRunOnCameraThread(new IDxCallableShape45S0200000_2_I0(this, 7, voipCamera), -1)).intValue();
    }

    public final void updateCameraCallbackCheck() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.totalElapsedCameraCallbackTime += elapsedRealtime - this.lastCameraCallbackTs;
        this.lastCameraCallbackTs = elapsedRealtime;
        this.cameraCallbackCount++;
    }

    public abstract void updatePreviewOrientation();
}
