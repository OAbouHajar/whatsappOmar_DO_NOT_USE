package com.whatsapp.voipcalling.camera;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass1OL;
import X.AnonymousClass2P8;
import X.C14710pd;
import X.C16320sq;
import X.C16980tz;
import X.C23441Bz;
import X.C26821Pi;
import X.C37841pp;
import X.C51962ca;
import X.C52002cn;
import X.C52012cp;
import X.C52022cq;
import X.C52042cs;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import com.obwhatsapp.calling.camera.IDxEListenerShape62S0100000_2_I0;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.pjsip.PjCameraInfo;

public final class VoipCameraManager {
    public final C14710pd abProps;
    public final C26821Pi cameraEventsListener = new IDxEListenerShape62S0100000_2_I0(this, 2);
    public Integer currentApiVersion;
    public volatile VoipPhysicalCamera currentCamera;
    public volatile Point lastAdjustedCameraPreviewSize;
    public final SparseArray rawCameraInfoCache = new SparseArray();
    public final AnonymousClass01V systemServices;
    public final AnonymousClass1OL voipSharedPreferences;
    public final C16980tz waContext;
    public final C16320sq waWorkers;

    public VoipCameraManager(C16980tz r3, C14710pd r4, C16320sq r5, AnonymousClass01V r6, AnonymousClass1OL r7) {
        this.systemServices = r6;
        this.abProps = r4;
        this.voipSharedPreferences = r7;
        this.waWorkers = r5;
        this.waContext = r3;
    }

    /* access modifiers changed from: private */
    public void clearStoredRawCameraInfo(int i2, int i3) {
        this.voipSharedPreferences.A01().edit().remove(AnonymousClass1OL.A00(i2, i3)).apply();
    }

    /* access modifiers changed from: private */
    public synchronized void closeCurrentCamera(VoipPhysicalCamera voipPhysicalCamera) {
        VoipPhysicalCamera voipPhysicalCamera2 = this.currentCamera;
        boolean z2 = false;
        if (voipPhysicalCamera2 == voipPhysicalCamera) {
            z2 = true;
        }
        AnonymousClass00B.A0B("attempted to close orphaned camera", z2);
        if (!(voipPhysicalCamera2 == null || voipPhysicalCamera2 == voipPhysicalCamera)) {
            voipPhysicalCamera2.removeCameraEventsListener(this.cameraEventsListener);
            voipPhysicalCamera2.close(true);
        }
        voipPhysicalCamera.removeCameraEventsListener(this.cameraEventsListener);
        this.lastAdjustedCameraPreviewSize = voipPhysicalCamera.getAdjustedPreviewSize();
        this.currentCamera = null;
    }

    private int getCameraInfoCacheKey(int i2, int i3) {
        int i4 = i2 + i3;
        return ((i4 * (i4 + 1)) >> 1) + i3;
    }

    private boolean isRawCameraInfoValid(int i2, C51962ca r8) {
        int i3;
        boolean z2;
        if (r8.A00 == 1) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            try {
                Camera.getCameraInfo(i2, cameraInfo);
                if (cameraInfo.orientation != r8.A01) {
                    return false;
                }
                i3 = cameraInfo.facing;
                z2 = r8.A04;
            } catch (RuntimeException e2) {
                Log.e((Throwable) e2);
                return false;
            }
        } else {
            try {
                CameraManager A0E = this.systemServices.A0E();
                if (A0E != null) {
                    CameraCharacteristics cameraCharacteristics = A0E.getCameraCharacteristics(Integer.toString(i2));
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                    Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num == null || num2 == null) {
                        Log.w("voip/VoipCameraManager/isRawCameraInfoValid metadata returned null values, invalidating cache");
                        return false;
                    } else if (r8.A01 != num.intValue()) {
                        return false;
                    } else {
                        i3 = r8.A04;
                        z2 = false;
                        if (num2.intValue() == 0) {
                            z2 = true;
                        }
                    }
                }
            } catch (Exception e3) {
                Log.w("voip/VoipCameraManager/isRawCameraInfoValid, camera is unavailable, invalidating info", e3);
            }
            return false;
        }
        return i3 == z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010d, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0111, code lost:
        if (r6 != null) goto L_0x0113;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C51962ca loadFromCameraService(int r16) {
        /*
            r15 = this;
            int r2 = r15.getCurrentApiVersion()
            r12 = 1
            r4 = r16
            if (r2 == r12) goto L_0x0013
            r0 = 2
            if (r2 != r0) goto L_0x011e
            X.01V r0 = r15.systemServices
            X.2ca r8 = X.C51962ca.A00(r0, r4)
            return r8
        L_0x0013:
            r7 = 0
            android.hardware.Camera$CameraInfo r3 = new android.hardware.Camera$CameraInfo     // Catch:{ Exception -> 0x010c, all -> 0x010a }
            r3.<init>()     // Catch:{ Exception -> 0x010c, all -> 0x010a }
            android.hardware.Camera.getCameraInfo(r4, r3)     // Catch:{ Exception -> 0x010c, all -> 0x010a }
            android.hardware.Camera r6 = android.hardware.Camera.open(r4)     // Catch:{ Exception -> 0x010c, all -> 0x010a }
            android.hardware.Camera$Parameters r5 = r6.getParameters()     // Catch:{ Exception -> 0x0108 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0108 }
            r1.<init>()     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = "voip/RawCameraInfo camera "
            r1.append(r0)     // Catch:{ Exception -> 0x0108 }
            r1.append(r4)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = " params, supported preview formats: {"
            r1.append(r0)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = "preview-format-values"
            java.lang.String r0 = r5.get(r0)     // Catch:{ Exception -> 0x0108 }
            r1.append(r0)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = "}, preview format values: "
            r1.append(r0)     // Catch:{ Exception -> 0x0108 }
            java.util.List r0 = r5.getSupportedPreviewFormats()     // Catch:{ Exception -> 0x0108 }
            r1.append(r0)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = ", supported preview sizes: {"
            r1.append(r0)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = "preview-size-values"
            java.lang.String r0 = r5.get(r0)     // Catch:{ Exception -> 0x0108 }
            r1.append(r0)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = "}, preferred preview size: "
            r1.append(r0)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = "preferred-preview-size-for-video"
            java.lang.String r0 = r5.get(r0)     // Catch:{ Exception -> 0x0108 }
            r1.append(r0)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = ", supported fps ranges: {"
            r1.append(r0)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = "preview-fps-range-values"
            java.lang.String r0 = r5.get(r0)     // Catch:{ Exception -> 0x0108 }
            r1.append(r0)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = "}"
            r1.append(r0)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0108 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0108 }
            java.util.List r1 = r5.getSupportedPreviewFormats()     // Catch:{ Exception -> 0x0108 }
            if (r1 != 0) goto L_0x0093
            java.lang.String r0 = "voip/RawCameraInfo getSupportedPreviewFormats return null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0108 }
            goto L_0x0113
        L_0x0093:
            int r0 = r1.size()     // Catch:{ Exception -> 0x0108 }
            int[] r11 = new int[r0]     // Catch:{ Exception -> 0x0108 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x0108 }
            r2 = 0
        L_0x009e:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0108 }
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x0108 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0108 }
            int r1 = r2 + 1
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0108 }
            r11[r2] = r0     // Catch:{ Exception -> 0x0108 }
            r2 = r1
            goto L_0x009e
        L_0x00b4:
            java.util.List r1 = r5.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x0108 }
            if (r1 == 0) goto L_0x00e4
            int r0 = r1.size()     // Catch:{ Exception -> 0x0108 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x0108 }
            r10.<init>(r0)     // Catch:{ Exception -> 0x0108 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x0108 }
        L_0x00c7:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0108 }
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x0108 }
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0     // Catch:{ Exception -> 0x0108 }
            if (r0 == 0) goto L_0x00e2
            int r2 = r0.width     // Catch:{ Exception -> 0x0108 }
            int r1 = r0.height     // Catch:{ Exception -> 0x0108 }
            X.1pp r0 = new X.1pp     // Catch:{ Exception -> 0x0108 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0108 }
        L_0x00de:
            r10.add(r0)     // Catch:{ Exception -> 0x0108 }
            goto L_0x00c7
        L_0x00e2:
            r0 = r7
            goto L_0x00de
        L_0x00e4:
            r10 = r7
        L_0x00e5:
            android.hardware.Camera$Size r0 = r5.getPreferredPreviewSizeForVideo()     // Catch:{ Exception -> 0x0108 }
            if (r0 == 0) goto L_0x00fa
            int r1 = r0.width     // Catch:{ Exception -> 0x0108 }
            int r0 = r0.height     // Catch:{ Exception -> 0x0108 }
            X.1pp r9 = new X.1pp     // Catch:{ Exception -> 0x0108 }
            r9.<init>(r1, r0)     // Catch:{ Exception -> 0x0108 }
        L_0x00f4:
            int r0 = r3.facing     // Catch:{ Exception -> 0x0108 }
            r14 = 1
            if (r0 == r12) goto L_0x00fd
            goto L_0x00fc
        L_0x00fa:
            r9 = r7
            goto L_0x00f4
        L_0x00fc:
            r14 = 0
        L_0x00fd:
            int r13 = r3.orientation     // Catch:{ Exception -> 0x0108 }
            X.2ca r8 = new X.2ca     // Catch:{ Exception -> 0x0108 }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0108 }
            r6.release()
            return r8
        L_0x0108:
            r0 = move-exception
            goto L_0x010e
        L_0x010a:
            r1 = move-exception
            throw r1
        L_0x010c:
            r0 = move-exception
            r6 = r7
        L_0x010e:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0117 }
            if (r6 == 0) goto L_0x0116
        L_0x0113:
            r6.release()
        L_0x0116:
            return r7
        L_0x0117:
            r1 = move-exception
            if (r6 == 0) goto L_0x0132
            r6.release()
            throw r1
        L_0x011e:
            java.lang.String r1 = "unsupported camera api version "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
        L_0x0132:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.loadFromCameraService(int):X.2ca");
    }

    public void addCameraErrorListener(C26821Pi r2) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.addCameraEventsListener(r2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.whatsapp.voipcalling.camera.VoipCamera} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.whatsapp.voipcalling.camera.VoipPhysicalCamera] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.whatsapp.voipcalling.camera.VoipCamera createCamera(int r18, int r19, int r20, int r21, int r22, long r23) {
        /*
            r17 = this;
            r3 = r17
            monitor-enter(r3)
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r6 = r3.currentCamera     // Catch:{ all -> 0x00ed }
            r4 = 0
            r12 = r18
            r13 = r19
            r14 = r20
            r15 = r21
            r0 = r23
            if (r6 == 0) goto L_0x0087
            boolean r2 = r6.isAvatarDriver()     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x0025
            java.lang.String r2 = "voip/VoipCameraManager/createCamera ignoring input parameters. Caller should query getCameraInfo directly."
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x00ed }
        L_0x001e:
            com.whatsapp.voipcalling.camera.VoipCamera r4 = new com.whatsapp.voipcalling.camera.VoipCamera     // Catch:{ all -> 0x00ed }
            r4.<init>(r6, r0)     // Catch:{ all -> 0x00ed }
            goto L_0x00eb
        L_0x0025:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r7 = r6.getCameraInfo()     // Catch:{ all -> 0x00ed }
            int r5 = r7.width     // Catch:{ all -> 0x00ed }
            if (r5 != r13) goto L_0x0039
            int r2 = r7.height     // Catch:{ all -> 0x00ed }
            if (r2 != r14) goto L_0x0039
            int r2 = r7.format     // Catch:{ all -> 0x00ed }
            if (r2 != r15) goto L_0x0039
            int r2 = r7.idx     // Catch:{ all -> 0x00ed }
            if (r2 == r12) goto L_0x001e
        L_0x0039:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r6.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "voip/VoipCameraManager/createCamera camera info doesn't match. Current cam: w/h: "
            r6.append(r0)     // Catch:{ all -> 0x00ed }
            r6.append(r5)     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = "/"
            r6.append(r5)     // Catch:{ all -> 0x00ed }
            int r0 = r7.height     // Catch:{ all -> 0x00ed }
            r6.append(r0)     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = ", format: "
            r6.append(r2)     // Catch:{ all -> 0x00ed }
            int r0 = r7.format     // Catch:{ all -> 0x00ed }
            r6.append(r0)     // Catch:{ all -> 0x00ed }
            java.lang.String r1 = ", idx: "
            r6.append(r1)     // Catch:{ all -> 0x00ed }
            int r0 = r7.idx     // Catch:{ all -> 0x00ed }
            r6.append(r0)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = ". New cam: w/h: "
            r6.append(r0)     // Catch:{ all -> 0x00ed }
            r6.append(r13)     // Catch:{ all -> 0x00ed }
            r6.append(r5)     // Catch:{ all -> 0x00ed }
            r6.append(r14)     // Catch:{ all -> 0x00ed }
            r6.append(r2)     // Catch:{ all -> 0x00ed }
            r6.append(r15)     // Catch:{ all -> 0x00ed }
            r6.append(r1)     // Catch:{ all -> 0x00ed }
            r6.append(r12)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x00ed }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00ed }
            goto L_0x00eb
        L_0x0087:
            X.2ca r2 = r3.getRawCameraInfo(r12)     // Catch:{ RuntimeException -> 0x00e4 }
            if (r2 == 0) goto L_0x00d4
            int r5 = r2.A00     // Catch:{ RuntimeException -> 0x00e4 }
            r2 = 1
            r16 = r22
            if (r5 != r2) goto L_0x00bf
            X.01V r6 = r3.systemServices     // Catch:{ RuntimeException -> 0x00e4 }
            X.0pd r5 = r3.abProps     // Catch:{ RuntimeException -> 0x00e4 }
            X.0tz r2 = r3.waContext     // Catch:{ RuntimeException -> 0x00e4 }
            android.content.Context r2 = r2.A00     // Catch:{ RuntimeException -> 0x00e4 }
            org.pjsip.PjCamera r7 = new org.pjsip.PjCamera     // Catch:{ RuntimeException -> 0x00e4 }
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r15
            r12 = r16
            r13 = r6
            r14 = r5
            r15 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ RuntimeException -> 0x00e4 }
            X.1OL r2 = r3.voipSharedPreferences     // Catch:{ RuntimeException -> 0x00e4 }
            android.content.SharedPreferences r6 = r2.A01()     // Catch:{ RuntimeException -> 0x00e4 }
            java.lang.String r5 = "force_passive_capture_dev_stream_role"
            r2 = 0
            boolean r2 = r6.getBoolean(r5, r2)     // Catch:{ RuntimeException -> 0x00e4 }
            r7.passiveMode = r2     // Catch:{ RuntimeException -> 0x00e4 }
        L_0x00b9:
            X.1Pi r2 = r3.cameraEventsListener     // Catch:{ RuntimeException -> 0x00e4 }
            r7.addCameraEventsListener(r2)     // Catch:{ RuntimeException -> 0x00e4 }
            goto L_0x00d2
        L_0x00bf:
            X.01V r9 = r3.systemServices     // Catch:{ RuntimeException -> 0x00e4 }
            X.0pd r10 = r3.abProps     // Catch:{ RuntimeException -> 0x00e4 }
            X.0sq r11 = r3.waWorkers     // Catch:{ RuntimeException -> 0x00e4 }
            X.0tz r2 = r3.waContext     // Catch:{ RuntimeException -> 0x00e4 }
            android.content.Context r8 = r2.A00     // Catch:{ RuntimeException -> 0x00e4 }
            X.2P8 r7 = new X.2P8     // Catch:{ RuntimeException -> 0x00e4 }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ RuntimeException -> 0x00e4 }
            r2 = 0
            r7.passiveMode = r2     // Catch:{ RuntimeException -> 0x00e4 }
            goto L_0x00b9
        L_0x00d2:
            r4 = r7
            goto L_0x00da
        L_0x00d4:
            java.lang.String r2 = "voip/VoipCameraManager/createCamera couldn't get camera info"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ RuntimeException -> 0x00e4 }
        L_0x00da:
            r3.currentCamera = r4     // Catch:{ all -> 0x00ed }
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r2 = r3.currentCamera     // Catch:{ all -> 0x00ed }
            com.whatsapp.voipcalling.camera.VoipCamera r4 = new com.whatsapp.voipcalling.camera.VoipCamera     // Catch:{ all -> 0x00ed }
            r4.<init>(r2, r0)     // Catch:{ all -> 0x00ed }
            goto L_0x00eb
        L_0x00e4:
            r1 = move-exception
            java.lang.String r0 = "voip/VoipCameraManager/createCamera error while starting camera"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00ed }
        L_0x00eb:
            monitor-exit(r3)
            return r4
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.createCamera(int, int, int, int, int, long):com.whatsapp.voipcalling.camera.VoipCamera");
    }

    public boolean disableAREffect() {
        return false;
    }

    public boolean enableAREffect(C52002cn r2, C52012cp r3) {
        return false;
    }

    public Point getAdjustedCameraPreviewSize(C52022cq r2) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getAdjustedPreviewSize();
        }
        return null;
    }

    public int getCachedCam2HardwareLevel() {
        int i2 = this.voipSharedPreferences.A01().getInt("lowest_camera_hardware_support_level", -1);
        if (i2 == -1) {
            i2 = AnonymousClass2P8.A00(this.systemServices);
            this.voipSharedPreferences.A01().edit().putInt("lowest_camera_hardware_support_level", i2).apply();
        }
        StringBuilder sb = new StringBuilder("voip/VoipCameraManager/getCachedCam2HardwareLevel got:");
        sb.append(i2);
        Log.i(sb.toString());
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int getCameraCount() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r3 = r4.getCurrentApiVersion()     // Catch:{ all -> 0x0035 }
            r0 = 1
            if (r3 != r0) goto L_0x000d
            int r0 = android.hardware.Camera.getNumberOfCameras()     // Catch:{ all -> 0x0035 }
            goto L_0x002b
        L_0x000d:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0035 }
            r0 = 21
            r1 = 0
            if (r2 < r0) goto L_0x0033
            r0 = 2
            if (r3 != r0) goto L_0x0033
            X.01V r0 = r4.systemServices     // Catch:{ all -> 0x0035 }
            android.hardware.camera2.CameraManager r0 = r0.A0E()     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "voip/VoipCameraManager/getCameraCount, unable to acquire camera manager"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0035 }
            goto L_0x0033
        L_0x0026:
            java.lang.String[] r0 = r0.getCameraIdList()     // Catch:{ Exception -> 0x002d }
            int r0 = r0.length     // Catch:{ Exception -> 0x002d }
        L_0x002b:
            monitor-exit(r4)
            return r0
        L_0x002d:
            java.lang.String r0 = "voip/VoipCameraManager/getCameraCount, unable to connect to cameras!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r4)
            return r1
        L_0x0035:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.getCameraCount():int");
    }

    public synchronized PjCameraInfo getCameraInfo(int i2) {
        PjCameraInfo pjCameraInfo;
        pjCameraInfo = null;
        if (i2 >= 0) {
            if (i2 < getCameraCount()) {
                C51962ca rawCameraInfo = getRawCameraInfo(i2);
                if (rawCameraInfo != null) {
                    pjCameraInfo = PjCameraInfo.createFromRawInfo(rawCameraInfo, this.voipSharedPreferences);
                    StringBuilder sb = new StringBuilder();
                    sb.append("voip/VoipCameraManager/getCameraInfo camera ");
                    sb.append(i2);
                    sb.append(" info: ");
                    sb.append(pjCameraInfo);
                    Log.i(sb.toString());
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voip/VoipCameraManager/getCameraInfo bad idx: ");
        sb2.append(i2);
        Log.e(sb2.toString());
        return pjCameraInfo;
    }

    public int getCameraStartMode() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getCameraStartMode();
        }
        return -1;
    }

    public synchronized int getCurrentApiVersion() {
        Integer num;
        if (this.currentApiVersion == null) {
            this.currentApiVersion = 1;
            String A02 = this.voipSharedPreferences.A02();
            if (Build.VERSION.SDK_INT >= 21 && !TextUtils.isEmpty(A02) && AnonymousClass2P8.A08(A02, getCachedCam2HardwareLevel())) {
                this.currentApiVersion = 2;
            }
        }
        num = this.currentApiVersion;
        AnonymousClass00B.A06(num);
        return num.intValue();
    }

    public Point getLastAdjustedCameraPreviewSize() {
        return this.lastAdjustedCameraPreviewSize;
    }

    public C52042cs getLastCachedFrame() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getLastCachedFrame();
        }
        return null;
    }

    public synchronized C51962ca getRawCameraInfo(int i2) {
        C51962ca r12;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        C37841pp r13;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        synchronized (this) {
            int currentApiVersion2 = getCurrentApiVersion();
            StringBuilder sb = new StringBuilder();
            sb.append("voip/VoipCameraManager/getRawCameraInfo camera: ");
            int i3 = i2;
            sb.append(i3);
            sb.append(" enabled camera version: ");
            sb.append(currentApiVersion2);
            Log.i(sb.toString());
            int i4 = i2 + currentApiVersion2;
            int i5 = ((i4 * (i4 + 1)) >> 1) + currentApiVersion2;
            r12 = (C51962ca) this.rawCameraInfoCache.get(i5);
            if (r12 == null) {
                String string = this.voipSharedPreferences.A01().getString(AnonymousClass1OL.A00(i3, currentApiVersion2), (String) null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("voip/VoipCameraManager/getRawCameraInfo, stored info for camera ");
                sb2.append(i3);
                sb2.append(": ");
                sb2.append(string);
                Log.i(sb2.toString());
                ArrayList arrayList = null;
                if (!TextUtils.isEmpty(string)) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        int i6 = jSONObject.getInt("version");
                        if (i6 != 1) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("voip/RawCameraInfo/createFromJson, skip mismatched json version ");
                            sb3.append(i6);
                            sb3.append(", required ");
                            sb3.append(1);
                            Log.i(sb3.toString());
                        } else {
                            int i7 = jSONObject.getInt("apiVersion");
                            if (i7 == 1 || i7 == 2) {
                                boolean z2 = jSONObject.getBoolean("isFrontCamera");
                                int i8 = jSONObject.getInt("orientation");
                                JSONArray jSONArray5 = jSONObject.getJSONArray("supportFormats");
                                if (jSONArray5 == null) {
                                    Log.e("voip/RawCameraInfo/createFromJson, cannot find formats");
                                } else {
                                    int[] iArr = new int[jSONArray5.length()];
                                    for (int i9 = 0; i9 < jSONArray5.length(); i9++) {
                                        iArr[i9] = jSONArray5.getInt(i9);
                                    }
                                    if (!jSONObject.has("preferredSize") || (jSONArray4 = jSONObject.getJSONArray("preferredSize")) == null) {
                                        r13 = null;
                                    } else if (jSONArray4.length() != 2) {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("voip/RawCameraInfo createFromJson bad preferred size ");
                                        sb4.append(jSONArray4);
                                        Log.e(sb4.toString());
                                    } else {
                                        r13 = new C37841pp(jSONArray4.getInt(0), jSONArray4.getInt(1));
                                    }
                                    if (jSONObject.has("previewSizes") && (jSONArray3 = jSONObject.getJSONArray("previewSizes")) != null) {
                                        int length = jSONArray3.length();
                                        if (length % 2 == 0) {
                                            arrayList = new ArrayList(length >> 1);
                                            for (int i10 = 0; i10 < length; i10 += 2) {
                                                arrayList.add(new C37841pp(jSONArray3.getInt(i10), jSONArray3.getInt(i10 + 1)));
                                            }
                                        } else {
                                            throw new JSONException("length is not even");
                                        }
                                    }
                                    r12 = new C51962ca(r13, arrayList, iArr, i7, i8, z2);
                                    if (!isRawCameraInfoValid(i3, r12)) {
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append("voip/VoipCameraManager/getRawCameraInfo, stored raw info is outdated ");
                                        sb5.append(r12);
                                        Log.w(sb5.toString());
                                        clearStoredRawCameraInfo(i3, r12.A00);
                                    }
                                    this.rawCameraInfoCache.put(i5, r12);
                                }
                            } else {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("voip/RawCameraInfo/createFromJson, skip unsupported api version ");
                                sb6.append(i7);
                                Log.i(sb6.toString());
                            }
                        }
                    } catch (JSONException e2) {
                        Log.e((Throwable) e2);
                    }
                }
                r12 = loadFromCameraService(i3);
                if (r12 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    String str = null;
                    try {
                        jSONObject2.put("version", 1);
                        jSONObject2.put("apiVersion", r12.A00);
                        jSONObject2.put("isFrontCamera", r12.A04);
                        jSONObject2.put("orientation", r12.A01);
                        JSONArray jSONArray6 = new JSONArray();
                        for (int put : r12.A05) {
                            jSONArray6.put(put);
                        }
                        jSONObject2.put("supportFormats", jSONArray6);
                        C37841pp r2 = r12.A02;
                        if (r2 != null) {
                            jSONArray = new JSONArray();
                            jSONArray.put(r2.A01);
                            jSONArray.put(r2.A00);
                        } else {
                            jSONArray = null;
                        }
                        jSONObject2.put("preferredSize", jSONArray);
                        List<C37841pp> list = r12.A03;
                        if (list != null) {
                            jSONArray2 = new JSONArray();
                            for (C37841pp r1 : list) {
                                jSONArray2.put(r1.A01);
                                jSONArray2.put(r1.A00);
                            }
                        } else {
                            jSONArray2 = null;
                        }
                        jSONObject2.put("previewSizes", jSONArray2);
                        str = jSONObject2.toString();
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.voipSharedPreferences.A01().edit().putString(AnonymousClass1OL.A00(i3, r12.A00), str).apply();
                    }
                    this.rawCameraInfoCache.put(i5, r12);
                } else {
                    clearStoredRawCameraInfo(i3, currentApiVersion2);
                    this.rawCameraInfoCache.put(i5, r12);
                }
            }
        }
        return r12;
    }

    public boolean isCameraOpen() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        return voipPhysicalCamera != null && voipPhysicalCamera.isCameraOpen();
    }

    public boolean isCameraTextureApiFailed() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        return voipPhysicalCamera != null && voipPhysicalCamera.textureApiFailed;
    }

    public boolean isFrontCamera() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        return voipPhysicalCamera != null && voipPhysicalCamera.getCameraInfo().isFrontCamera;
    }

    public void removeCameraErrorListener(C26821Pi r2) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.removeCameraEventsListener(r2);
        }
    }

    public synchronized void setCurrentApiVersion(int i2) {
        this.currentApiVersion = Integer.valueOf(i2);
    }

    public void setRequestedCamera2SupportLevel(String str, C23441Bz r6) {
        int currentApiVersion2 = getCurrentApiVersion();
        int i2 = 1;
        if (Build.VERSION.SDK_INT >= 21 && str != null && AnonymousClass2P8.A08(str, getCachedCam2HardwareLevel())) {
            i2 = 2;
        }
        setCurrentApiVersion(i2);
        if (currentApiVersion2 != getCurrentApiVersion()) {
            Voip.refreshVideoDevice();
        }
    }

    public void updateCameraPreviewOrientation() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.updatePreviewOrientation();
        }
    }
}
