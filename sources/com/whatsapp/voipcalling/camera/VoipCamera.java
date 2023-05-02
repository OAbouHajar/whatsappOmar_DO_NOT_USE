package com.whatsapp.voipcalling.camera;

import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;

public final class VoipCamera {
    public final VoipPhysicalCamera physicalCamera;
    public boolean started = false;
    public final long userIdentity;

    public VoipCamera(VoipPhysicalCamera voipPhysicalCamera, long j2) {
        this.physicalCamera = voipPhysicalCamera;
        this.userIdentity = j2;
        voipPhysicalCamera.registerVirtualCamera(this);
    }

    private final native void changeCaptureFormat(int i2, int i3, int i4, int i5, long j2);

    private final native void pushABGRFrame(int i2, int i3, ByteBuffer byteBuffer, int i4, long j2);

    private final native void pushFrame(byte[] bArr, int i2, long j2);

    private final native void pushFramePlane(int i2, int i3, ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, int i7, long j2);

    public final void abgrFramePlaneCallback(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        pushABGRFrame(i2, i3, byteBuffer, i4, this.userIdentity);
    }

    public final synchronized void close() {
        this.physicalCamera.unregisterVirtualCamera(this);
        this.physicalCamera.close(false);
    }

    public final void formatChangeCallback(int i2, int i3, int i4, int i5) {
        changeCaptureFormat(i2, i3, i4, i5, this.userIdentity);
    }

    public final void frameCallback(byte[] bArr, int i2) {
        pushFrame(bArr, i2, this.userIdentity);
    }

    public final void framePlaneCallback(int i2, int i3, ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i6, int i7) {
        pushFramePlane(i2, i3, byteBuffer, i4, byteBuffer2, i5, byteBuffer3, i6, i7, this.userIdentity);
    }

    public final int getAverageCaptureFps() {
        return this.physicalCamera.getAverageCaptureFps();
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        return this.physicalCamera.getCameraInfo();
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        return this.physicalCamera.getLatestFrame(byteBuffer);
    }

    public final boolean getStarted() {
        return this.started;
    }

    public long getUserIdentity() {
        return this.userIdentity;
    }

    public final boolean isAvatarDriver() {
        return this.physicalCamera.isAvatarDriver();
    }

    public final boolean isPassiveMode() {
        return this.physicalCamera.passiveMode;
    }

    public final synchronized int setVideoPort(VideoPort videoPort) {
        return this.physicalCamera.setVideoPort(videoPort);
    }

    public final synchronized int start() {
        this.started = true;
        return this.physicalCamera.start();
    }

    public final synchronized void stop() {
        this.started = false;
        this.physicalCamera.stop();
    }
}
