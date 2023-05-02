package org.wawebrtc;

import X.AnonymousClass1OL;
import X.AnonymousClass1ZS;
import X.AnonymousClass48H;
import X.AnonymousClass4JG;
import X.AnonymousClass4YC;
import X.AnonymousClass5Kr;
import X.AnonymousClass5Kt;
import X.AnonymousClass5NT;
import X.C43291zl;
import X.C799441y;
import X.C88064Zt;
import X.C88864bD;
import X.C89884d6;
import android.media.MediaCodec;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MediaCodecVideoEncoder {
    public static final int DEQUEUE_TIMEOUT = 0;
    public static final String[] H264_HW_EXCEPTION_MODELS = {"SAMSUNG-SGH-I337", "Nexus 7"};
    public static final String H264_MIME_TYPE = "video/avc";
    public static final String[] H265_HW_EXCEPTION_MODELS = new String[0];
    public static final String H265_MIME_TYPE = "video/hevc";
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final int MIN_ENCODER_HEIGHT = 144;
    public static final int MIN_ENCODER_WIDTH = 176;
    public static final String TAG = "MediaCodecVideoEncoder";
    public static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    public static final String[] blacklistedHwCodecPrefixes = new String[0];
    public static final Map cachedCodecCapabilites = new HashMap();
    public static int codecErrors;
    public static AnonymousClass5NT errorCallback;
    public static final String[] h264BlacklistedBuildHardware = {"sc8830", "sc8830a", "samsungexynos7580"};
    public static final String[] h265BlacklistedBuildHardware = new String[0];
    public static Set hwEncoderDisabledTypes = new HashSet();
    public static long lastReleaseTimestamp;
    public static MediaCodecVideoEncoder runningInstance;
    public static final String[] supportedH264HwCodecPrefixes = null;
    public static final String[] supportedH265HwCodecPrefixes = null;
    public static final int[] supportedSurfaceColorList = {2130708361};
    public static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Intel."};
    public static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom."};
    public static final String[] trustedCodecPrefixes = {"OMX.qcom.", "OMX.Exynos.", "OMX.google", "OMX.IMG."};
    public MediaCodec.BufferInfo cachedBufferInfo = new MediaCodec.BufferInfo();
    public BufferInfo cachedInputBuffer = new BufferInfo();
    public BufferInfo cachedOutputBuffer = new BufferInfo();
    public final Queue carryAlongInfos = new LinkedList();
    public String codecName;
    public int colorFormat;
    public int colorId;
    public C89884d6 drawer;
    public AnonymousClass5Kt eglBase;
    public final List freeInfos = new LinkedList();
    public int height;
    public ByteBuffer[] inputBuffers;
    public Surface inputSurface;
    public Bundle keyFrameRequestBundle = new Bundle();
    public MediaCodec mediaCodec;
    public Thread mediaCodecThread;
    public ByteBuffer[] outputBuffers;
    public C799441y type;
    public final AnonymousClass1OL voipSharedPreferences;
    public int width;

    public class BufferInfo {
        public int bitInfo;
        public ByteBuffer buffer;
        public long encodeTimeMs;
        public int index;
        public boolean isConfigData;
        public boolean isKeyFrame;
        public long timestamp;

        public void set(int i2, ByteBuffer byteBuffer, boolean z2, long j2, long j3, int i3, boolean z3) {
            this.index = i2;
            this.buffer = byteBuffer;
            this.isKeyFrame = z2;
            this.timestamp = j2;
            this.encodeTimeMs = j3;
            this.bitInfo = i3;
            this.isConfigData = z3;
        }
    }

    public MediaCodecVideoEncoder(AnonymousClass1OL r5) {
        this.voipSharedPreferences = r5;
        int i2 = 0;
        do {
            this.freeInfos.add(new C88064Zt());
            i2++;
        } while (i2 < 10);
        this.keyFrameRequestBundle.putInt("request-sync", 0);
    }

    private void checkOnMediaCodecThread() {
    }

    public static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception e2) {
            Log.e((Throwable) e2);
            return null;
        }
    }

    public static void disableH264HwCodec() {
        Log.w("MediaCodecVideoEncoder H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/avc");
    }

    public static void disableH265HwCodec() {
        Log.w("MediaCodecVideoEncoder H.265 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        Log.w("MediaCodecVideoEncoder VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Log.w("MediaCodecVideoEncoder VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0141, code lost:
        if (r7.startsWith("OMX.google") != false) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0343 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List findHwEncoder(java.lang.String r22, java.lang.String[] r23, int[] r24, int r25, boolean r26) {
        /*
            r12 = r24
            java.lang.String r0 = "vid_driver.encoder_name"
            java.lang.String r11 = com.whatsapp.voipcalling.Voip.A06(r0)
            java.lang.String r0 = "video/avc"
            r13 = r22
            boolean r20 = r13.equals(r0)
            java.lang.String r3 = " is not supported."
            java.lang.String r19 = "video/hevc"
            java.lang.String r18 = "MediaCodecVideoEncoder Model: "
            r2 = 0
            if (r20 == 0) goto L_0x003c
            boolean r0 = X.C41971wz.A03()
            if (r0 == 0) goto L_0x0064
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = r18
            r1.append(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        L_0x003c:
            r0 = r19
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0061
            java.lang.String[] r4 = H265_HW_EXCEPTION_MODELS
            int r3 = r4.length
            r2 = 0
        L_0x0048:
            if (r2 >= r3) goto L_0x005e
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.MODEL
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x005b
            r17 = 1
        L_0x0056:
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String[] r0 = h265BlacklistedBuildHardware
            goto L_0x007a
        L_0x005b:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x005e:
            r17 = 0
            goto L_0x0056
        L_0x0061:
            r17 = 0
            goto L_0x0082
        L_0x0064:
            java.lang.String[] r4 = H264_HW_EXCEPTION_MODELS
            int r3 = r4.length
            r2 = 0
        L_0x0068:
            if (r2 >= r3) goto L_0x0315
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.MODEL
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0311
            r17 = 1
        L_0x0076:
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String[] r0 = h264BlacklistedBuildHardware
        L_0x007a:
            boolean r0 = X.C43291zl.A08(r1, r0)
            if (r0 == 0) goto L_0x0082
            r17 = 1
        L_0x0082:
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            r9 = -1
            r8 = 0
        L_0x0089:
            int r0 = android.media.MediaCodecList.getCodecCount()
            if (r8 >= r0) goto L_0x0319
            android.media.MediaCodecInfo r3 = android.media.MediaCodecList.getCodecInfoAt(r8)
            boolean r0 = r3.isEncoder()
            if (r0 == 0) goto L_0x00dd
            java.lang.String[] r4 = r3.getSupportedTypes()
            int r2 = r4.length
            r1 = 0
        L_0x009f:
            if (r1 >= r2) goto L_0x030e
            r0 = r4[r1]
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x030a
            java.lang.String r7 = r3.getName()
        L_0x00ad:
            if (r7 == 0) goto L_0x00dd
            if (r17 == 0) goto L_0x00e0
            java.lang.String r0 = "OMX.google"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x00e0
            boolean r0 = r7.equalsIgnoreCase(r11)
            if (r0 != 0) goto L_0x00e0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = r18
            r1.append(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            java.lang.String r0 = " has black listed H.264 hw encoder "
            r1.append(r0)
        L_0x00d3:
            r1.append(r7)
        L_0x00d6:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00dd:
            int r8 = r8 + 1
            goto L_0x0089
        L_0x00e0:
            if (r26 == 0) goto L_0x00f3
            java.lang.String r1 = "MediaCodecVideoEncoder Found candidate encoder "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00f3:
            java.lang.String[] r0 = blacklistedHwCodecPrefixes
            java.lang.String r2 = "MediaCodecVideoEncoder "
            if (r0 == 0) goto L_0x010d
            boolean r0 = X.C43291zl.A08(r7, r0)
            if (r0 == 0) goto L_0x010d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " is in the blacklist."
            goto L_0x00d3
        L_0x010d:
            r0 = r23
            if (r23 == 0) goto L_0x012a
            boolean r4 = X.C43291zl.A08(r7, r0)
        L_0x0115:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r4 != 0) goto L_0x0145
            r1.<init>()
            r1.append(r2)
            r1.append(r7)
            java.lang.String r0 = " is not supported on "
            r1.append(r0)
            java.lang.String r7 = android.os.Build.MODEL
            goto L_0x00d3
        L_0x012a:
            r0 = 0
            if (r20 == 0) goto L_0x0132
            boolean r4 = X.C41971wz.A0D(r7, r0)
            goto L_0x0115
        L_0x0132:
            r0 = r19
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0143
            java.lang.String r0 = "OMX.google"
            boolean r0 = r7.startsWith(r0)
            r4 = 1
            if (r0 == 0) goto L_0x0115
        L_0x0143:
            r4 = 0
            goto L_0x0115
        L_0x0145:
            r1.<init>()
            r1.append(r7)
            java.lang.String r0 = "_"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r2 = r1.toString()
            java.util.Map r1 = cachedCodecCapabilites
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x017d
            java.lang.Object r6 = r1.get(r2)
            android.media.MediaCodecInfo$CodecCapabilities r6 = (android.media.MediaCodecInfo.CodecCapabilities) r6
        L_0x0165:
            r5 = 0
            r2 = r25
            if (r25 >= 0) goto L_0x016b
            r5 = 1
        L_0x016b:
            android.media.MediaCodecInfo$CodecProfileLevel[] r4 = r6.profileLevels
            int r3 = r4.length
            r1 = 0
        L_0x016f:
            if (r1 >= r3) goto L_0x0185
            r0 = r4[r1]
            if (r25 < 0) goto L_0x017a
            int r0 = r0.profile
            if (r0 != r2) goto L_0x017a
            r5 = 1
        L_0x017a:
            int r1 = r1 + 1
            goto L_0x016f
        L_0x017d:
            android.media.MediaCodecInfo$CodecCapabilities r6 = r3.getCapabilitiesForType(r13)     // Catch:{ all -> 0x02f6 }
            r1.put(r2, r6)
            goto L_0x0165
        L_0x0185:
            if (r5 != 0) goto L_0x019b
            java.lang.String r0 = "MediaCodecVideoEncoder  "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = " does not support Profile "
            r1.append(r0)
            r1.append(r2)
            goto L_0x00d6
        L_0x019b:
            if (r26 == 0) goto L_0x01f9
            int[] r4 = r6.colorFormats
            int r3 = r4.length
            r2 = 0
        L_0x01a1:
            if (r2 >= r3) goto L_0x01bd
            r5 = r4[r2]
            java.lang.String r0 = "MediaCodecVideoEncoder    Supported Color: 0x"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r5)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r2 = r2 + 1
            goto L_0x01a1
        L_0x01bd:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x01f9
            android.media.MediaCodecInfo$EncoderCapabilities r2 = r6.getEncoderCapabilities()
            if (r2 == 0) goto L_0x01f9
            java.lang.String r0 = "MediaCodecVideoEncoder    CBR: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 2
            boolean r0 = r2.isBitrateModeSupported(r0)
            r1.append(r0)
            java.lang.String r0 = ", VBR: "
            r1.append(r0)
            r0 = 1
            boolean r0 = r2.isBitrateModeSupported(r0)
            r1.append(r0)
            java.lang.String r0 = ",  CQ: "
            r1.append(r0)
            r0 = 0
            boolean r0 = r2.isBitrateModeSupported(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01f9:
            if (r12 != 0) goto L_0x029d
            java.lang.String r0 = "vid_driver.encoder_color_format"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r11 == 0) goto L_0x029a
            boolean r0 = r7.equalsIgnoreCase(r11)
            if (r0 == 0) goto L_0x029a
            if (r1 == 0) goto L_0x029a
            int r5 = r1.intValue()
        L_0x0210:
            int[] r12 = X.C43291zl.A09(r7, r5)
        L_0x0214:
            int r0 = r12.length
            r22 = r0
            r4 = 0
            r3 = 0
        L_0x0219:
            r0 = r22
            if (r4 >= r0) goto L_0x02a0
            r16 = r12[r4]
            int[] r15 = r6.colorFormats
            int r0 = r15.length
            r21 = r0
            r2 = 0
        L_0x0225:
            r0 = r21
            if (r2 >= r0) goto L_0x0297
            r1 = r15[r2]
            r14 = 19
            r0 = r16
            if (r0 != r14) goto L_0x0244
            java.lang.String r0 = "OMX.SEC.avc.enc"
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 != 0) goto L_0x0241
            java.lang.String r0 = "OMX.IMG.TOPAZ.VIDEO.Encoder"
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x0244
        L_0x0241:
            int r2 = r2 + 1
            goto L_0x0225
        L_0x0244:
            r0 = r16
            if (r1 != r0) goto L_0x0241
            java.lang.String r0 = "MediaCodecVideoEncoder Found target encoder for mime "
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r0)
            r14.append(r13)
            java.lang.String r0 = " : "
            r14.append(r0)
            r14.append(r7)
            java.lang.String r0 = ". Color: 0x"
            r14.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r1)
            r14.append(r0)
            java.lang.String r0 = "("
            r14.append(r0)
            r14.append(r1)
            java.lang.String r0 = ")"
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r14 < r0) goto L_0x0286
            if (r3 != 0) goto L_0x0286
            android.media.MediaCodecInfo$VideoCapabilities r3 = r6.getVideoCapabilities()
        L_0x0286:
            if (r1 != r5) goto L_0x028c
            int r9 = r10.size()
        L_0x028c:
            android.media.MediaCodecInfo$CodecProfileLevel[] r14 = r6.profileLevels
            X.4Mn r0 = new X.4Mn
            r0.<init>(r3, r7, r14, r1)
            r10.add(r0)
            goto L_0x0241
        L_0x0297:
            int r4 = r4 + 1
            goto L_0x0219
        L_0x029a:
            r5 = 0
            goto L_0x0210
        L_0x029d:
            r5 = 0
            goto L_0x0214
        L_0x02a0:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x00dd
            if (r3 == 0) goto L_0x00dd
            if (r26 == 0) goto L_0x00dd
            java.lang.String r0 = "MediaCodecVideoEncoder birtate range: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            android.util.Range r0 = r3.getBitrateRange()
            r1.append(r0)
            java.lang.String r0 = ", frame rate: "
            r1.append(r0)
            android.util.Range r0 = r3.getSupportedFrameRates()
            r1.append(r0)
            java.lang.String r0 = ", height alignment: "
            r1.append(r0)
            int r0 = r3.getHeightAlignment()
            r1.append(r0)
            java.lang.String r0 = ", width alignment: "
            r1.append(r0)
            int r0 = r3.getWidthAlignment()
            r1.append(r0)
            java.lang.String r0 = ", height range: "
            r1.append(r0)
            android.util.Range r0 = r3.getSupportedHeights()
            r1.append(r0)
            java.lang.String r0 = ", width range: "
            r1.append(r0)
            android.util.Range r0 = r3.getSupportedWidths()
            r1.append(r0)
            goto L_0x00d6
        L_0x02f6:
            r2 = move-exception
            java.lang.String r1 = "MediaCodecVideoEncoder failed to get capabilities for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            goto L_0x00dd
        L_0x030a:
            int r1 = r1 + 1
            goto L_0x009f
        L_0x030e:
            r7 = 0
            goto L_0x00ad
        L_0x0311:
            int r2 = r2 + 1
            goto L_0x0068
        L_0x0315:
            r17 = 0
            goto L_0x0076
        L_0x0319:
            if (r9 < 0) goto L_0x032a
            java.lang.Object r2 = r10.get(r9)
            r1 = 0
            java.lang.Object r0 = r10.get(r1)
            r10.set(r9, r0)
            r10.set(r1, r2)
        L_0x032a:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0343
            java.lang.String r1 = "MediaCodecVideoEncoder No HW encoder found for mime "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x0343:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.findHwEncoder(java.lang.String, java.lang.String[], int[], int, boolean):java.util.List");
    }

    private int getCodecKeyFrameInterval() {
        return C43291zl.A08(this.codecName, trustedCodecPrefixes) ? 4 : 2;
    }

    private int getDequeueOutputTimeout() {
        String str = this.codecName;
        boolean A08 = C43291zl.A08(str, trustedCodecPrefixes);
        if ("OMX.google.h264.encoder".equalsIgnoreCase(str)) {
            return 100;
        }
        return A08 ? 30 : 1000;
    }

    private ByteBuffer getInputBuffer(int i2) {
        return Build.VERSION.SDK_INT >= 21 ? this.mediaCodec.getInputBuffer(i2) : this.inputBuffers[i2];
    }

    private ByteBuffer getOutputBuffer(int i2) {
        return Build.VERSION.SDK_INT >= 21 ? this.mediaCodec.getOutputBuffer(i2) : this.outputBuffers[i2];
    }

    public static boolean isH264HwSupported() {
        return !hwEncoderDisabledTypes.contains("video/avc") && findHwEncoder("video/avc", supportedH264HwCodecPrefixes, (int[]) null, -1, false) != null;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        return !hwEncoderDisabledTypes.contains("video/avc") && findHwEncoder("video/avc", supportedH264HwCodecPrefixes, supportedSurfaceColorList, -1, false) != null;
    }

    public static boolean isH265HwSupported() {
        return !hwEncoderDisabledTypes.contains("video/hevc") && findHwEncoder("video/hevc", supportedH265HwCodecPrefixes, (int[]) null, -1, true) != null;
    }

    public static boolean isH265HwSupportedUsingTextures() {
        return !hwEncoderDisabledTypes.contains("video/hevc") && findHwEncoder("video/hevc", supportedH265HwCodecPrefixes, supportedSurfaceColorList, -1, false) != null;
    }

    public static boolean isVp8HwSupported() {
        return !hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8") && findHwEncoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, (int[]) null, -1, false) != null;
    }

    public static boolean isVp8HwSupportedUsingTextures() {
        return !hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8") && findHwEncoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, supportedSurfaceColorList, -1, false) != null;
    }

    public static boolean isVp9HwSupported() {
        return !hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9") && findHwEncoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, (int[]) null, -1, false) != null;
    }

    public static boolean isVp9HwSupportedUsingTextures() {
        return !hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9") && findHwEncoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, supportedSurfaceColorList, -1, false) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r3 = r0.getStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void printStackTrace() {
        /*
            org.wawebrtc.MediaCodecVideoEncoder r0 = runningInstance
            if (r0 == 0) goto L_0x0023
            java.lang.Thread r0 = r0.mediaCodecThread
            if (r0 == 0) goto L_0x0023
            java.lang.StackTraceElement[] r3 = r0.getStackTrace()
            int r2 = r3.length
            if (r2 <= 0) goto L_0x0023
            java.lang.String r0 = "MediaCodecVideoEncoder  stacks trace:"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
        L_0x0015:
            r0 = r3[r1]
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0023
            goto L_0x0015
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.printStackTrace():void");
    }

    public static void setErrorCallback(AnonymousClass5NT r1) {
        Log.i("MediaCodecVideoEncoder Set error callback");
        errorCallback = r1;
    }

    private boolean setRates(int i2, int i3) {
        if (!supportUpdateBitrate()) {
            return false;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i2 * 1000);
            this.mediaCodec.setParameters(bundle);
            return true;
        } catch (IllegalStateException e2) {
            Log.e("MediaCodecVideoEncoder setRates failed", e2);
            return false;
        }
    }

    public BufferInfo dequeueInputBuffer() {
        try {
            int dequeueInputBuffer = this.mediaCodec.dequeueInputBuffer(0);
            if (dequeueInputBuffer < 0) {
                return null;
            }
            this.cachedInputBuffer.set(dequeueInputBuffer, getInputBuffer(dequeueInputBuffer), false, 0, 0, 0, false);
            return this.cachedInputBuffer;
        } catch (Throwable th) {
            Log.e(th);
            throw th;
        }
    }

    public BufferInfo dequeueOutputBuffer(int i2) {
        try {
            MediaCodec.BufferInfo bufferInfo = this.cachedBufferInfo;
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, (long) i2);
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer outputBuffer = getOutputBuffer(dequeueOutputBuffer);
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                int i3 = bufferInfo.flags;
                if ((i3 & 2) != 0) {
                    this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), false, 0, 0, 0, true);
                    return this.cachedOutputBuffer;
                }
                boolean z2 = false;
                if ((i3 & 1) != 0) {
                    z2 = true;
                }
                C88064Zt r2 = (C88064Zt) this.carryAlongInfos.remove();
                int i4 = r2.A00;
                this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), z2, r2.A02, SystemClock.elapsedRealtime() - r2.A01, i4, false);
                this.freeInfos.add(r2);
                return this.cachedOutputBuffer;
            } else if (dequeueOutputBuffer == -3) {
                if (Build.VERSION.SDK_INT < 21) {
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                }
                return dequeueOutputBuffer(i2);
            } else if (dequeueOutputBuffer == -2) {
                return dequeueOutputBuffer(i2);
            } else {
                if (dequeueOutputBuffer == -1) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("dequeueOutputBuffer: ");
                sb.append(dequeueOutputBuffer);
                throw new RuntimeException(sb.toString());
            }
        } catch (IllegalStateException e2) {
            Log.e("MediaCodecVideoEncoder dequeueOutputBuffer failed", e2);
            BufferInfo bufferInfo2 = this.cachedOutputBuffer;
            bufferInfo2.set(-1, (ByteBuffer) null, false, -1, -1, 0, false);
            return bufferInfo2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ IllegalStateException -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056 A[Catch:{ IllegalStateException -> 0x0066 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean encodeBuffer(boolean r18, int r19, int r20, long r21, long r23, int r25) {
        /*
            r17 = this;
            r3 = 1
            r6 = 0
            r1 = r17
            if (r18 == 0) goto L_0x0025
            boolean r0 = r1.supportForceKeyFrame()     // Catch:{ IllegalStateException -> 0x0066 }
            if (r0 == 0) goto L_0x0025
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x0066 }
            r0 = 21
            if (r2 < r0) goto L_0x0019
            java.lang.String r0 = "MediaCodecVideoEncoder force Keyframe"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0066 }
            r10 = 1
            goto L_0x0026
        L_0x0019:
            java.lang.String r0 = "MediaCodecVideoEncoder Sync frame request"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0066 }
            android.media.MediaCodec r2 = r1.mediaCodec     // Catch:{ IllegalStateException -> 0x0066 }
            android.os.Bundle r0 = r1.keyFrameRequestBundle     // Catch:{ IllegalStateException -> 0x0066 }
            r2.setParameters(r0)     // Catch:{ IllegalStateException -> 0x0066 }
        L_0x0025:
            r10 = 0
        L_0x0026:
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0066 }
            java.util.List r0 = r1.freeInfos     // Catch:{ IllegalStateException -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ IllegalStateException -> 0x0066 }
            r15 = r21
            r12 = r25
            if (r0 == 0) goto L_0x0056
            X.4Zt r11 = new X.4Zt     // Catch:{ IllegalStateException -> 0x0066 }
            r11.<init>(r12, r13, r15)     // Catch:{ IllegalStateException -> 0x0066 }
        L_0x003b:
            java.util.Queue r0 = r1.carryAlongInfos     // Catch:{ IllegalStateException -> 0x0066 }
            r0.add(r11)     // Catch:{ IllegalStateException -> 0x0066 }
            r5 = r19
            java.nio.ByteBuffer r0 = r1.getInputBuffer(r5)     // Catch:{ IllegalStateException -> 0x0066 }
            r0.position(r6)     // Catch:{ IllegalStateException -> 0x0066 }
            r7 = r20
            r0.limit(r7)     // Catch:{ IllegalStateException -> 0x0066 }
            android.media.MediaCodec r4 = r1.mediaCodec     // Catch:{ IllegalStateException -> 0x0066 }
            r8 = r23
            r4.queueInputBuffer(r5, r6, r7, r8, r10)     // Catch:{ IllegalStateException -> 0x0066 }
            goto L_0x0065
        L_0x0056:
            java.util.List r0 = r1.freeInfos     // Catch:{ IllegalStateException -> 0x0066 }
            java.lang.Object r11 = r0.remove(r6)     // Catch:{ IllegalStateException -> 0x0066 }
            X.4Zt r11 = (X.C88064Zt) r11     // Catch:{ IllegalStateException -> 0x0066 }
            r11.A01 = r13     // Catch:{ IllegalStateException -> 0x0066 }
            r11.A02 = r15     // Catch:{ IllegalStateException -> 0x0066 }
            r11.A00 = r12     // Catch:{ IllegalStateException -> 0x0066 }
            goto L_0x003b
        L_0x0065:
            return r3
        L_0x0066:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoEncoder encodeBuffer failed"
            com.whatsapp.util.Log.e(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.encodeBuffer(boolean, int, int, long, long, int):boolean");
    }

    public boolean encodeTexture(boolean z2, int i2, float[] fArr, long j2) {
        RuntimeException runtimeException;
        AnonymousClass4JG r3;
        if (z2) {
            try {
                if (Build.VERSION.SDK_INT >= 19) {
                    Log.i("MediaCodecVideoEncoder Sync frame request");
                    this.mediaCodec.setParameters(this.keyFrameRequestBundle);
                }
            } catch (RuntimeException e2) {
                Log.e("MediaCodecVideoEncoder encodeTexture failed", e2);
                return false;
            }
        }
        this.eglBase.A06();
        GLES20.glClear(16384);
        C89884d6 r0 = this.drawer;
        int i3 = this.width;
        int i4 = this.height;
        Map map = r0.A00;
        if (map.containsKey("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n")) {
            r3 = (AnonymousClass4JG) map.get("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n");
        } else {
            r3 = new AnonymousClass4JG();
            map.put("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n", r3);
            C88864bD r2 = r3.A01;
            int i5 = r2.A00;
            if (i5 != -1) {
                GLES20.glUseProgram(i5);
                AnonymousClass4YC.A01("glUseProgram");
                GLES20.glUniform1i(r2.A01("oes_tex"), 0);
                AnonymousClass4YC.A01("Initialize fragment shader uniform values.");
                r2.A02("in_pos", C89884d6.A01);
                r2.A02("in_tc", C89884d6.A02);
            } else {
                runtimeException = new RuntimeException("The program has been released");
                throw runtimeException;
            }
        }
        int i6 = r3.A01.A00;
        if (i6 != -1) {
            GLES20.glUseProgram(i6);
            AnonymousClass4YC.A01("glUseProgram");
            GLES20.glUniformMatrix4fv(r3.A00, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i2);
            GLES20.glViewport(0, 0, i3, i4);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(36197, 0);
            this.eglBase.A0E(TimeUnit.MICROSECONDS.toNanos(j2));
            return true;
        }
        runtimeException = new RuntimeException("The program has been released");
        throw runtimeException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0104 A[Catch:{ all -> 0x0399 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean initEncode(X.C799441y r32, int r33, int r34, int r35, int r36, int r37, X.AnonymousClass5Kr r38) {
        /*
            r31 = this;
            r11 = 0
            r19 = r38
            if (r38 == 0) goto L_0x0006
            r11 = 1
        L_0x0006:
            r10 = r31
            r0 = r33
            r10.width = r0
            r0 = r34
            r10.height = r0
            java.lang.String r0 = "MediaCodecVideoEncoder Java initEncode: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r12 = r32
            r1.append(r12)
            java.lang.String r0 = " : "
            r1.append(r0)
            int r0 = r10.width
            r1.append(r0)
            java.lang.String r0 = " x "
            r1.append(r0)
            int r0 = r10.height
            r1.append(r0)
            java.lang.String r0 = ". @ "
            r1.append(r0)
            r30 = r35
            r0 = r30
            r1.append(r0)
            java.lang.String r0 = " kbps. Fps: "
            r1.append(r0)
            r29 = r36
            r0 = r29
            r1.append(r0)
            java.lang.String r0 = ". Key frame interval: "
            r1.append(r0)
            r3 = r37
            r1.append(r3)
            java.lang.String r0 = " seconds. Encode from texture : "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Thread r0 = r10.mediaCodecThread
            if (r0 != 0) goto L_0x03a1
            java.lang.String r18 = "vid_driver.encoder_name"
            java.lang.String r8 = com.whatsapp.voipcalling.Voip.A06(r18)
            long r4 = android.os.SystemClock.uptimeMillis()
            long r0 = lastReleaseTimestamp
            long r4 = r4 - r0
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r4 = 0
            if (r0 <= 0) goto L_0x007b
            r4 = 1
        L_0x007b:
            X.41y r0 = X.C799441y.VIDEO_CODEC_VP8     // Catch:{ all -> 0x0399 }
            java.lang.String r9 = "video/hevc"
            java.lang.String r6 = "video/avc"
            java.lang.String r7 = "video/x-vnd.on2.vp9"
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            if (r12 != r0) goto L_0x00a4
            if (r8 == 0) goto L_0x0094
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0399 }
            r0 = 0
            r2[r0] = r8     // Catch:{ all -> 0x0399 }
            goto L_0x0096
        L_0x0094:
            java.lang.String[] r2 = supportedVp8HwCodecPrefixes     // Catch:{ all -> 0x0399 }
        L_0x0096:
            if (r11 == 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r1 = 0
            goto L_0x009d
        L_0x009b:
            int[] r1 = supportedSurfaceColorList     // Catch:{ all -> 0x0399 }
        L_0x009d:
            r0 = -1
            java.util.List r2 = findHwEncoder(r5, r2, r1, r0, r4)     // Catch:{ all -> 0x0399 }
            r9 = r5
            goto L_0x00c0
        L_0x00a4:
            X.41y r0 = X.C799441y.VIDEO_CODEC_VP9     // Catch:{ all -> 0x0399 }
            if (r12 != r0) goto L_0x00c3
            if (r8 == 0) goto L_0x00b1
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0399 }
            r0 = 0
            r2[r0] = r8     // Catch:{ all -> 0x0399 }
            goto L_0x00b3
        L_0x00b1:
            java.lang.String[] r2 = supportedVp9HwCodecPrefixes     // Catch:{ all -> 0x0399 }
        L_0x00b3:
            if (r11 == 0) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r1 = 0
            goto L_0x00ba
        L_0x00b8:
            int[] r1 = supportedSurfaceColorList     // Catch:{ all -> 0x0399 }
        L_0x00ba:
            r0 = -1
            java.util.List r2 = findHwEncoder(r7, r2, r1, r0, r4)     // Catch:{ all -> 0x0399 }
            r9 = r7
        L_0x00c0:
            r8 = 100
            goto L_0x0102
        L_0x00c3:
            X.41y r0 = X.C799441y.VIDEO_CODEC_H264     // Catch:{ all -> 0x0399 }
            if (r12 != r0) goto L_0x00e0
            if (r8 == 0) goto L_0x00d0
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0399 }
            r0 = 0
            r2[r0] = r8     // Catch:{ all -> 0x0399 }
            goto L_0x00d2
        L_0x00d0:
            java.lang.String[] r2 = supportedH264HwCodecPrefixes     // Catch:{ all -> 0x0399 }
        L_0x00d2:
            if (r11 == 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00d5:
            r1 = 0
            goto L_0x00d9
        L_0x00d7:
            int[] r1 = supportedSurfaceColorList     // Catch:{ all -> 0x0399 }
        L_0x00d9:
            r0 = -1
            java.util.List r2 = findHwEncoder(r6, r2, r1, r0, r4)     // Catch:{ all -> 0x0399 }
            r9 = r6
            goto L_0x0100
        L_0x00e0:
            X.41y r0 = X.C799441y.VIDEO_CODEC_H265     // Catch:{ all -> 0x0399 }
            if (r12 != r0) goto L_0x00fc
            if (r8 == 0) goto L_0x00ed
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0399 }
            r0 = 0
            r2[r0] = r8     // Catch:{ all -> 0x0399 }
            goto L_0x00ef
        L_0x00ed:
            java.lang.String[] r2 = supportedH265HwCodecPrefixes     // Catch:{ all -> 0x0399 }
        L_0x00ef:
            if (r11 == 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r1 = 0
            goto L_0x00f6
        L_0x00f4:
            int[] r1 = supportedSurfaceColorList     // Catch:{ all -> 0x0399 }
        L_0x00f6:
            r0 = -1
            java.util.List r2 = findHwEncoder(r9, r2, r1, r0, r4)     // Catch:{ all -> 0x0399 }
            goto L_0x0100
        L_0x00fc:
            r2 = 0
            r8 = 0
            r9 = 0
            goto L_0x0102
        L_0x0100:
            r8 = 20
        L_0x0102:
            if (r37 < 0) goto L_0x0105
            r8 = r3
        L_0x0105:
            if (r2 == 0) goto L_0x0386
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0386
            runningInstance = r31
            java.util.List r1 = r10.freeInfos
            java.util.Queue r0 = r10.carryAlongInfos
            r1.addAll(r0)
            java.util.Queue r0 = r10.carryAlongInfos
            r0.clear()
            java.util.Iterator r17 = r2.iterator()
        L_0x011f:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0384
            java.lang.Object r7 = r17.next()
            X.4Mn r7 = (X.C84954Mn) r7
            java.lang.String r0 = r7.A02
            r28 = r0
            r10.codecName = r0
            int r6 = r7.A00
            r10.colorFormat = r6
            java.lang.String r0 = "MediaCodecVideoEncoder Java initEncode: format: 0x"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r6)
            r1.append(r0)
            java.lang.String r0 = " for Encoder: "
            r1.append(r0)
            r0 = r28
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = r10.codecName
            java.lang.String r0 = "OMX.google.h264.encoder"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0166
            r0 = 320(0x140, float:4.48E-43)
            r10.width = r0
            r0 = 192(0xc0, float:2.69E-43)
            r10.height = r0
        L_0x0166:
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "samsung"
            r0 = 21
            if (r5 < r0) goto L_0x036e
            android.media.MediaCodecInfo$VideoCapabilities r1 = r7.A01
            if (r1 == 0) goto L_0x036e
            android.util.Range r0 = r1.getSupportedWidths()
            java.lang.Comparable r0 = r0.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r26 = r0.intValue()
            android.util.Range r0 = r1.getSupportedHeights()
            java.lang.Comparable r0 = r0.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r27 = r0.intValue()
        L_0x018f:
            java.lang.String r1 = r10.codecName
            java.lang.String r0 = "OMX.qcom.video.encoder.avc"
            boolean r1 = r1.equals(r0)
            r25 = 16
            if (r1 == 0) goto L_0x019d
            r25 = 32
        L_0x019d:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01a9
            if (r1 == 0) goto L_0x01a9
            r25 = 16
        L_0x01a9:
            java.lang.String r0 = "vid_driver.encoder_min_width"
            java.lang.Integer r13 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.encoder_min_height"
            java.lang.Integer r4 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.encoder_alignment"
            java.lang.Integer r3 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.encoder_h264_profile"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.encoder_h264_level"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.encoder_hw_h264_maxqp"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r13 == 0) goto L_0x01d9
            int r26 = r13.intValue()
        L_0x01d9:
            if (r4 == 0) goto L_0x01df
            int r27 = r4.intValue()
        L_0x01df:
            if (r3 == 0) goto L_0x01e5
            int r25 = r3.intValue()
        L_0x01e5:
            if (r2 == 0) goto L_0x036b
            int r4 = r2.intValue()
        L_0x01eb:
            if (r1 == 0) goto L_0x0368
            int r3 = r1.intValue()
        L_0x01f1:
            if (r0 == 0) goto L_0x0365
            int r2 = r0.intValue()
        L_0x01f7:
            java.lang.String r0 = r10.codecName
            r15 = r0
            int r14 = r10.colorFormat
            int r13 = r10.width
            int r1 = r10.height
            r0 = 0
            r20 = r0
            r21 = r15
            r22 = r14
            r23 = r13
            r24 = r1
            X.4aT r14 = X.C43291zl.A03(r20, r21, r22, r23, r24, r25, r26, r27)
            int r1 = r14.A09
            r10.width = r1
            int r1 = r14.A06
            r10.height = r1
            int r1 = r14.A00
            r10.colorFormat = r1
            int r1 = r14.A05
            r10.colorId = r1
            java.lang.String r1 = "vid_driver.encoder_frame_converter_color_format"
            java.lang.Integer r16 = com.whatsapp.voipcalling.Voip.A01(r1)
            java.lang.String r13 = com.whatsapp.voipcalling.Voip.A06(r18)
            java.lang.String r1 = "vid_driver.encoder_color_format"
            java.lang.Integer r15 = com.whatsapp.voipcalling.Voip.A01(r1)
            if (r16 == 0) goto L_0x024d
            if (r13 == 0) goto L_0x024d
            if (r15 == 0) goto L_0x024d
            java.lang.String r1 = r10.codecName
            boolean r1 = r1.equalsIgnoreCase(r13)
            if (r1 == 0) goto L_0x024d
            int r13 = r10.colorFormat
            int r1 = r15.intValue()
            if (r13 != r1) goto L_0x024d
            int r1 = r16.intValue()
            r10.colorId = r1
        L_0x024d:
            X.1OL r13 = r10.voipSharedPreferences
            int r1 = r10.colorId
            r15 = r1
            android.content.SharedPreferences r1 = r13.A01()
            android.content.SharedPreferences$Editor r13 = r1.edit()
            java.lang.String r1 = "video_encoder_frame_convertor_color_id"
            android.content.SharedPreferences$Editor r1 = r13.putInt(r1, r15)
            r1.apply()
            int r1 = r14.A08
            r16 = r1
            int r1 = r14.A07
            r15 = r1
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r10.mediaCodecThread = r1
            int r13 = r10.width     // Catch:{ all -> 0x035d }
            int r1 = r10.height     // Catch:{ all -> 0x035d }
            android.media.MediaFormat r13 = android.media.MediaFormat.createVideoFormat(r9, r13, r1)     // Catch:{ all -> 0x035d }
            java.lang.String r14 = "bitrate"
            r1 = r30
            int r1 = r1 * 1000
            r13.setInteger(r14, r1)     // Catch:{ all -> 0x035d }
            java.lang.String r1 = "color-format"
            r13.setInteger(r1, r6)     // Catch:{ all -> 0x035d }
            java.lang.String r6 = "frame-rate"
            r1 = r29
            r13.setInteger(r6, r1)     // Catch:{ all -> 0x035d }
            java.lang.String r1 = "i-frame-interval"
            r13.setInteger(r1, r8)     // Catch:{ all -> 0x035d }
            r1 = 31
            if (r5 < r1) goto L_0x029f
            if (r2 <= 0) goto L_0x029f
            java.lang.String r1 = "video-qp-max"
            r13.setInteger(r1, r2)     // Catch:{ all -> 0x035d }
        L_0x029f:
            java.lang.String r2 = "stride"
            r1 = r16
            r13.setInteger(r2, r1)     // Catch:{ all -> 0x035d }
            java.lang.String r2 = "slice-height"
            r13.setInteger(r2, r15)     // Catch:{ all -> 0x035d }
            if (r4 < 0) goto L_0x02d5
            android.media.MediaCodecInfo$CodecProfileLevel[] r14 = r7.A03     // Catch:{ all -> 0x035d }
            if (r14 == 0) goto L_0x02d5
            int r7 = r14.length     // Catch:{ all -> 0x035d }
            r6 = 0
        L_0x02b5:
            if (r6 >= r7) goto L_0x02d5
            r2 = r14[r6]     // Catch:{ all -> 0x035d }
            int r1 = r2.profile     // Catch:{ all -> 0x035d }
            if (r1 != r4) goto L_0x02c6
            int r2 = r2.level     // Catch:{ all -> 0x035d }
            if (r2 == r3) goto L_0x02c9
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r2 != r1) goto L_0x02c6
            goto L_0x02c9
        L_0x02c6:
            int r6 = r6 + 1
            goto L_0x02b5
        L_0x02c9:
            java.lang.String r1 = "profile"
            r13.setInteger(r1, r4)     // Catch:{ all -> 0x035d }
            if (r3 < 0) goto L_0x02d5
            java.lang.String r1 = "level"
            r13.setInteger(r1, r3)     // Catch:{ all -> 0x035d }
        L_0x02d5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x035d }
            r2.<init>()     // Catch:{ all -> 0x035d }
            java.lang.String r1 = "MediaCodecVideoEncoder   Format: "
            r2.append(r1)     // Catch:{ all -> 0x035d }
            r2.append(r13)     // Catch:{ all -> 0x035d }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x035d }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x035d }
            android.media.MediaCodec r2 = createByCodecName(r28)     // Catch:{ all -> 0x035d }
            r10.mediaCodec = r2     // Catch:{ all -> 0x035d }
            r10.type = r12     // Catch:{ all -> 0x035d }
            if (r2 != 0) goto L_0x02fa
            java.lang.String r0 = "MediaCodecVideoEncoder Can not create media encoder"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x035d }
            goto L_0x0380
        L_0x02fa:
            r1 = 1
            r2.configure(r13, r0, r0, r1)     // Catch:{ all -> 0x035d }
            if (r11 == 0) goto L_0x0323
            r0 = 18
            if (r5 < r0) goto L_0x0323
            int[] r2 = X.C90194dg.A02     // Catch:{ all -> 0x035d }
            X.5Kt r1 = new X.5Kt     // Catch:{ all -> 0x035d }
            r0 = r19
            r1.<init>(r0, r2)     // Catch:{ all -> 0x035d }
            r10.eglBase = r1     // Catch:{ all -> 0x035d }
            android.media.MediaCodec r0 = r10.mediaCodec     // Catch:{ all -> 0x035d }
            android.view.Surface r1 = r0.createInputSurface()     // Catch:{ all -> 0x035d }
            r10.inputSurface = r1     // Catch:{ all -> 0x035d }
            X.5Kt r0 = r10.eglBase     // Catch:{ all -> 0x035d }
            r0.A0A(r1)     // Catch:{ all -> 0x035d }
            X.4d6 r0 = new X.4d6     // Catch:{ all -> 0x035d }
            r0.<init>()     // Catch:{ all -> 0x035d }
            r10.drawer = r0     // Catch:{ all -> 0x035d }
        L_0x0323:
            android.media.MediaCodec r0 = r10.mediaCodec     // Catch:{ all -> 0x035d }
            r0.start()     // Catch:{ all -> 0x035d }
            r0 = 21
            if (r5 >= r0) goto L_0x0382
            android.media.MediaCodec r0 = r10.mediaCodec     // Catch:{ all -> 0x035d }
            java.nio.ByteBuffer[] r0 = r0.getInputBuffers()     // Catch:{ all -> 0x035d }
            r10.inputBuffers = r0     // Catch:{ all -> 0x035d }
            android.media.MediaCodec r0 = r10.mediaCodec     // Catch:{ all -> 0x035d }
            java.nio.ByteBuffer[] r2 = r0.getOutputBuffers()     // Catch:{ all -> 0x035d }
            r10.outputBuffers = r2     // Catch:{ all -> 0x035d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x035d }
            r1.<init>()     // Catch:{ all -> 0x035d }
            java.lang.String r0 = "MediaCodecVideoEncoder Input buffers: "
            r1.append(r0)     // Catch:{ all -> 0x035d }
            java.nio.ByteBuffer[] r0 = r10.inputBuffers     // Catch:{ all -> 0x035d }
            int r0 = r0.length     // Catch:{ all -> 0x035d }
            r1.append(r0)     // Catch:{ all -> 0x035d }
            java.lang.String r0 = ", Output buffers: "
            r1.append(r0)     // Catch:{ all -> 0x035d }
            int r0 = r2.length     // Catch:{ all -> 0x035d }
            r1.append(r0)     // Catch:{ all -> 0x035d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x035d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x035d }
            goto L_0x0382
        L_0x035d:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoEncoder initEncode failed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x011f
        L_0x0365:
            r2 = -1
            goto L_0x01f7
        L_0x0368:
            r3 = -1
            goto L_0x01f1
        L_0x036b:
            r4 = -1
            goto L_0x01eb
        L_0x036e:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r2)
            r26 = 176(0xb0, float:2.47E-43)
            r27 = 144(0x90, float:2.02E-43)
            if (r0 == 0) goto L_0x018f
            r26 = 160(0xa0, float:2.24E-43)
            r27 = 128(0x80, float:1.794E-43)
            goto L_0x018f
        L_0x0380:
            r0 = 0
            return r0
        L_0x0382:
            r0 = 1
            return r0
        L_0x0384:
            r2 = 0
            return r2
        L_0x0386:
            r2 = 0
            java.lang.String r1 = "MediaCodecVideoEncoder Can not find HW encoder for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        L_0x0399:
            r2 = move-exception
            r1 = 0
            java.lang.String r0 = "MediaCodecVideoEncoder Exception in findHwEncoder"
            com.whatsapp.util.Log.e(r0, r2)
            return r1
        L_0x03a1:
            java.lang.String r1 = "Forgot to release()?"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.initEncode(X.41y, int, int, int, int, int, X.5Kr):boolean");
    }

    public boolean initH264Encoder(int i2, int i3, int i4, int i5, int i6) {
        return initEncode(C799441y.VIDEO_CODEC_H264, i2, i3, i4, i5, i6, (AnonymousClass5Kr) null);
    }

    public boolean initH265Encoder(int i2, int i3, int i4, int i5, int i6) {
        return initEncode(C799441y.VIDEO_CODEC_H265, i2, i3, i4, i5, i6, (AnonymousClass5Kr) null);
    }

    public void release() {
        StringBuilder sb = new StringBuilder("MediaCodecVideoEncoder Java releaseEncoder ");
        sb.append(this.codecName);
        Log.i(sb.toString());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new AnonymousClass1ZS(new RunnableRunnableShape11S0200000_I0_9(this, 35, countDownLatch), TAG).start();
        if (!AnonymousClass48H.A00(countDownLatch)) {
            Log.e("MediaCodecVideoEncoder Media encoder release timeout");
            codecErrors++;
        }
        this.codecName = null;
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        C89884d6 r0 = this.drawer;
        if (r0 != null) {
            Map map = r0.A00;
            for (AnonymousClass4JG r02 : map.values()) {
                C88864bD r2 = r02.A01;
                Log.i("GlShader Deleting shader.");
                int i2 = r2.A00;
                if (i2 != -1) {
                    GLES20.glDeleteProgram(i2);
                    r2.A00 = -1;
                }
            }
            map.clear();
            this.drawer = null;
        }
        AnonymousClass5Kt r03 = this.eglBase;
        if (r03 != null) {
            r03.A07();
            this.eglBase = null;
        }
        Surface surface = this.inputSurface;
        if (surface != null) {
            surface.release();
            this.inputSurface = null;
        }
        runningInstance = null;
        lastReleaseTimestamp = SystemClock.uptimeMillis();
        Log.i("MediaCodecVideoEncoder Java releaseEncoder done");
    }

    public boolean releaseOutputBuffer(int i2) {
        try {
            this.mediaCodec.releaseOutputBuffer(i2, false);
            return true;
        } catch (IllegalStateException e2) {
            Log.e("MediaCodecVideoEncoder releaseOutputBuffer failed", e2);
            return false;
        }
    }

    public boolean resetEncoderOnFPSChanges() {
        return "OMX.Exynos.AVC.Encoder".equalsIgnoreCase(this.codecName);
    }

    public boolean supportForceKeyFrame() {
        return Build.VERSION.SDK_INT >= 19 && !"OMX.google.h264.encoder".equalsIgnoreCase(this.codecName);
    }

    public boolean supportUpdateBitrate() {
        return Build.VERSION.SDK_INT >= 19 && !"OMX.google.h264.encoder".equalsIgnoreCase(this.codecName);
    }
}
