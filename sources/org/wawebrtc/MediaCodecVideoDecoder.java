package org.wawebrtc;

import X.AnonymousClass000;
import X.AnonymousClass1ZS;
import X.AnonymousClass44W;
import X.AnonymousClass48H;
import X.AnonymousClass4LI;
import X.AnonymousClass5NS;
import X.C13680ns;
import X.C13690nt;
import X.C43291zl;
import X.C799341x;
import X.C84944Mm;
import X.C88224a9;
import X.C88284aF;
import X.C88424aT;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.redex.RunnableRunnableShape15S0200000_I1_3;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MediaCodecVideoDecoder {
    public static final int DEQUEUE_INPUT_TIMEOUT = 500000;
    public static final String H264_MIME_TYPE = "video/avc";
    public static final String H265_MIME_TYPE = "video/hevc";
    public static final long MAX_DECODE_TIME_MS = 500;
    public static final int MAX_QUEUED_OUTPUTBUFFERS = 3;
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final String TAG = "MediaCodecVideoDecoder";
    public static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    public static final String[] blacklistedDeviceBoard = new String[0];
    public static final String[] blacklistedHwCodecPrefixes = {"OMX.TI.DUCATI1.VIDEO.DECODER"};
    public static final Map cachedCodecCapabilites = AnonymousClass000.A0x();
    public static int codecErrors;
    public static AnonymousClass5NS errorCallback;
    public static Set hwDecoderDisabledTypes = C13680ns.A0o();
    public static long lastReleaseTimestamp;
    public static final String[] restartDecoderOnNewSpsPpsPrefixes = {"omx.mtk.", "OMX.SEC.avc.dec"};
    public static MediaCodecVideoDecoder runningInstance;
    public static final String[] spsBaselineProfileHackPrefixes = new String[0];
    public static final String[] spsBitstreamRestrictionsPrefixes = {"omx.qcom.", "omx.nvidia.", "omx.brcm.", "OMX.Exynos."};
    public static final String[] spsConstrainedHighProfilePrefixes = new String[0];
    public static final String[] supportedH264HwCodecPrefixes = null;
    public static final String[] supportedH265HwCodecPrefixes = null;
    public static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Nvidia.", "OMX.Exynos.", "OMX.Intel."};
    public static final String[] supportedVp9HwCodecPrefixes = C13690nt.A1b("OMX.qcom.", "OMX.Exynos.", 2);
    public MediaCodec.BufferInfo cachedBufferInfo = new MediaCodec.BufferInfo();
    public BufferInfo cachedInputBuffer = new BufferInfo();
    public BufferInfo cachedOutputBuffer = new BufferInfo();
    public final Queue carryAlongInfos = new LinkedList();
    public String codecName;
    public int colorFormat;
    public int colorId;
    public int cropBottom;
    public int cropLeft;
    public int cropRight;
    public int cropTop;
    public final Queue dequeuedSurfaceOutputBuffers = new LinkedList();
    public int droppedFrames;
    public final List freeInfos = new LinkedList();
    public boolean hasDecodedFirstFrame;
    public int height;
    public ByteBuffer[] inputBuffers;
    public MediaCodec mediaCodec;
    public Thread mediaCodecThread;
    public boolean needsRestartDecoderOnNewSpsPps;
    public boolean needsSpsBaselineProfileHack;
    public boolean needsSpsBitstreamRestrictions;
    public boolean needsSpsConstrainedHighProfile;
    public boolean needsSpsPpsInCsd;
    public ByteBuffer[] outputBuffers;
    public int sliceHeight;
    public int stride;
    public Surface surface = null;
    public AnonymousClass4LI textureListener;
    public boolean useSurface;
    public int width;

    public class Api29Impl {
        public static boolean mediaCodecInfoIsSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
            return mediaCodecInfo.isSoftwareOnly();
        }
    }

    public class BufferInfo {
        public int bitInfo;
        public ByteBuffer buffer;
        public long decodeTimeMs;
        public long endDecodeTimeMs;
        public int index;
        public long ntpTimeStampMs;
        public long presentationTimeStampMs;
        public long timeStampMs;

        public void set(int i2, ByteBuffer byteBuffer, long j2, long j3, long j4, int i3, long j5, long j6) {
            this.index = i2;
            this.buffer = byteBuffer;
            this.presentationTimeStampMs = j2;
            this.timeStampMs = j3;
            this.ntpTimeStampMs = j4;
            this.bitInfo = i3;
            this.decodeTimeMs = j5;
            this.endDecodeTimeMs = j6;
        }
    }

    public class DecodedTextureBuffer {
        public final long decodeTimeMs;
        public final long frameDelayMs;
        public final long ntpTimeStampMs;
        public final long presentationTimeStampMs;
        public final int textureID;
        public final long timeStampMs;
        public final float[] transformMatrix;

        public DecodedTextureBuffer(int i2, float[] fArr, long j2, long j3, long j4, long j5, long j6) {
            this.textureID = i2;
            this.transformMatrix = fArr;
            this.presentationTimeStampMs = j2;
            this.timeStampMs = j3;
            this.ntpTimeStampMs = j4;
            this.decodeTimeMs = j5;
            this.frameDelayMs = j6;
        }
    }

    public MediaCodecVideoDecoder() {
        int i2 = 0;
        do {
            this.freeInfos.add(new C88224a9());
            i2++;
        } while (i2 < 10);
    }

    private void MaybeRenderDecodedTextureBuffer() {
        boolean A1V;
        if (!this.dequeuedSurfaceOutputBuffers.isEmpty()) {
            AnonymousClass4LI r0 = this.textureListener;
            synchronized (r0.A01) {
                A1V = AnonymousClass000.A1V(r0.A00);
            }
            if (!A1V) {
                BufferInfo bufferInfo = (BufferInfo) this.dequeuedSurfaceOutputBuffers.remove();
                AnonymousClass4LI r1 = this.textureListener;
                if (r1.A00 == null) {
                    r1.A00 = bufferInfo;
                    this.mediaCodec.releaseOutputBuffer(bufferInfo.index, true);
                    return;
                }
                Log.e("Unexpected addBufferToRender() called while waiting for a texture.");
                throw AnonymousClass000.A0V("Waiting for a texture.");
            }
        }
    }

    private void checkOnMediaCodecThread() {
    }

    private BufferInfo dequeueInputBuffer() {
        MediaCodec mediaCodec2 = this.mediaCodec;
        if (mediaCodec2 != null) {
            try {
                int dequeueInputBuffer = mediaCodec2.dequeueInputBuffer(500000);
                if (dequeueInputBuffer >= 0) {
                    this.cachedInputBuffer.set(dequeueInputBuffer, getInputBuffer(dequeueInputBuffer), 0, 0, 0, 0, 0, 0);
                    return this.cachedInputBuffer;
                }
            } catch (Throwable th) {
                Log.e(th);
                throw th;
            }
        }
        return null;
    }

    private BufferInfo dequeueOutputBuffer(int i2) {
        int dequeueOutputBuffer;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!this.carryAlongInfos.isEmpty()) {
            MediaCodec.BufferInfo bufferInfo = this.cachedBufferInfo;
            while (true) {
                dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros((long) i2));
                if (dequeueOutputBuffer != -3) {
                    if (dequeueOutputBuffer != -2) {
                        break;
                    }
                    MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                    Log.i(AnonymousClass000.A0h(outputFormat.toString(), AnonymousClass000.A0r("MediaCodecVideoDecoder Decoder format changed: ")));
                    C88424aT A02 = C43291zl.A02(outputFormat, (C88284aF) null, this.codecName);
                    int i7 = A02.A09;
                    this.width = i7;
                    int i8 = A02.A06;
                    this.height = i8;
                    this.stride = Math.max(i7, A02.A08);
                    this.sliceHeight = Math.max(i8, A02.A07);
                    int i9 = A02.A00;
                    this.colorFormat = i9;
                    this.colorId = getFrameConverterColorId(i9, A02.A05);
                    this.cropLeft = 0;
                    int i10 = this.width;
                    this.cropRight = i10 - 1;
                    this.cropTop = 0;
                    this.cropBottom = this.height - 1;
                    int i11 = A02.A02;
                    if (i11 >= 0 && i11 < (i5 = A02.A08) && (i6 = A02.A03) >= 0 && i6 < i5 && i11 < i6) {
                        this.cropLeft = i11;
                        this.cropRight = i6;
                        int i12 = (i6 - i11) + 1;
                        if (i12 < i10) {
                            this.width = i12;
                            Log.w(C13680ns.A0c(i12, "MediaCodecVideoDecoder Decoder format changed, use cropRight and cropLeft to calculate width "));
                        }
                    }
                    int i13 = A02.A01;
                    if (i13 >= 0 && i13 < (i3 = A02.A07) && (i4 = A02.A04) >= 0 && i4 < i3 && i4 < i13) {
                        this.cropTop = i4;
                        this.cropBottom = i13;
                        int i14 = (i13 - i4) + 1;
                        if (i14 < this.height) {
                            this.height = i14;
                            Log.w(C13680ns.A0c(i14, "MediaCodecVideoDecoder Decoder format changed, use cropBottom and cropTop to calculate height "));
                        }
                    }
                } else if (Build.VERSION.SDK_INT < 21) {
                    ByteBuffer[] outputBuffers2 = this.mediaCodec.getOutputBuffers();
                    this.outputBuffers = outputBuffers2;
                    StringBuilder A0r = AnonymousClass000.A0r("MediaCodecVideoDecoder Decoder output buffers changed: ");
                    A0r.append(outputBuffers2.length);
                    C13680ns.A1V(A0r);
                }
            }
            if (dequeueOutputBuffer != -1) {
                this.hasDecodedFirstFrame = true;
                C88224a9 r0 = (C88224a9) this.carryAlongInfos.remove();
                long elapsedRealtime = SystemClock.elapsedRealtime() - r0.A01;
                ByteBuffer outputBuffer = getOutputBuffer(dequeueOutputBuffer);
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs), r0.A03, r0.A02, r0.A00, elapsedRealtime, SystemClock.elapsedRealtime());
                this.freeInfos.add(r0);
                return this.cachedOutputBuffer;
            }
        }
        return null;
    }

    private DecodedTextureBuffer dequeueTextureBuffer(int i2) {
        StringBuilder A0r;
        String str;
        if (this.useSurface) {
            BufferInfo dequeueOutputBuffer = dequeueOutputBuffer(i2);
            if (dequeueOutputBuffer != null) {
                this.dequeuedSurfaceOutputBuffers.add(dequeueOutputBuffer);
            }
            MaybeRenderDecodedTextureBuffer();
            AnonymousClass4LI r0 = this.textureListener;
            Object obj = r0.A01;
            synchronized (obj) {
                if (i2 > 0) {
                    if (r0.A00 != null) {
                        try {
                            obj.wait((long) i2);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
            if (this.dequeuedSurfaceOutputBuffers.size() < Math.min(3, this.outputBuffers.length) && (i2 <= 0 || this.dequeuedSurfaceOutputBuffers.isEmpty())) {
                return null;
            }
            this.droppedFrames++;
            BufferInfo bufferInfo = (BufferInfo) this.dequeuedSurfaceOutputBuffers.remove();
            if (i2 > 0) {
                A0r = AnonymousClass000.A0o();
                str = "MediaCodecVideoDecoder Draining decoder. Dropping frame with TS: ";
            } else {
                A0r = AnonymousClass000.A0r("MediaCodecVideoDecoder Too many output buffers ");
                A0r.append(this.dequeuedSurfaceOutputBuffers.size());
                str = ". Dropping frame with TS: ";
            }
            A0r.append(str);
            A0r.append(bufferInfo.presentationTimeStampMs);
            A0r.append(". Total number of dropped frames: ");
            Log.w(AnonymousClass000.A0l(A0r, this.droppedFrames));
            this.mediaCodec.releaseOutputBuffer(bufferInfo.index, false);
            return new DecodedTextureBuffer(0, (float[]) null, bufferInfo.presentationTimeStampMs, bufferInfo.timeStampMs, bufferInfo.ntpTimeStampMs, bufferInfo.decodeTimeMs, SystemClock.elapsedRealtime() - bufferInfo.endDecodeTimeMs);
        }
        throw AnonymousClass000.A0V("dequeueTexture() called for byte buffer decoding.");
    }

    public static void disableH264HwCodec() {
        Log.w("MediaCodecVideoDecoder H.264 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/avc");
    }

    public static void disableH265HwCodec() {
        Log.w("MediaCodecVideoDecoder H.265 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        Log.w("MediaCodecVideoDecoder VP8 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Log.w("MediaCodecVideoDecoder VP9 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0168, code lost:
        if (r8.isFeatureSupported("adaptive-playback") == false) goto L_0x016a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List findDecoder(java.lang.String r20, java.lang.String[] r21, int r22, boolean r23) {
        /*
            java.lang.String r0 = "MediaCodecVideoDecoder Trying to find HW decoder for mime "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r14 = r20
            java.lang.String r0 = X.AnonymousClass000.A0h(r14, r0)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r13 = X.AnonymousClass000.A0u()
            java.lang.String r18 = "vid_driver.decoder_name"
            java.lang.String r12 = com.whatsapp.voipcalling.Voip.A06(r18)
            r11 = -1
            r10 = 0
        L_0x001c:
            int r0 = android.media.MediaCodecList.getCodecCount()
            if (r10 >= r0) goto L_0x01ce
            android.media.MediaCodecInfo r2 = android.media.MediaCodecList.getCodecInfoAt(r10)
            boolean r0 = r2.isEncoder()
            if (r0 != 0) goto L_0x0072
            boolean r17 = isSoftwareCodec(r2)
            java.lang.String[] r4 = r2.getSupportedTypes()
            int r3 = r4.length
            r1 = 0
        L_0x0036:
            if (r1 >= r3) goto L_0x01cb
            r0 = r4[r1]
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x01c7
            java.lang.String r9 = r2.getName()
        L_0x0044:
            if (r9 == 0) goto L_0x0072
            if (r23 == 0) goto L_0x0051
            java.lang.String r0 = "MediaCodecVideoDecoder Found candidate decoder "
            java.lang.String r0 = X.C13680ns.A0h(r0, r9)
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0051:
            java.lang.String[] r0 = blacklistedHwCodecPrefixes
            java.lang.String r3 = "MediaCodecVideoDecoder "
            if (r0 == 0) goto L_0x0075
            boolean r0 = X.C43291zl.A08(r9, r0)
            if (r0 == 0) goto L_0x0075
            boolean r0 = r9.equalsIgnoreCase(r12)
            if (r0 != 0) goto L_0x0075
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r3)
            r2.append(r9)
            java.lang.String r9 = " is in the blacklist."
        L_0x006c:
            r2.append(r9)
        L_0x006f:
            X.C13680ns.A1V(r2)
        L_0x0072:
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0075:
            java.lang.String[] r0 = blacklistedDeviceBoard
            if (r0 == 0) goto L_0x0098
            java.lang.String r1 = android.os.Build.BOARD
            boolean r0 = X.C43291zl.A08(r1, r0)
            if (r0 == 0) goto L_0x0098
            if (r17 != 0) goto L_0x0098
            boolean r0 = r9.equalsIgnoreCase(r12)
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = "MediaCodecVideoDecoder Device Board "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            r2.append(r1)
            java.lang.String r0 = " is in the blacklist, do not use hardware codec "
            r2.append(r0)
            goto L_0x006c
        L_0x0098:
            r1 = r21
            if (r21 == 0) goto L_0x00b3
            boolean r0 = X.C43291zl.A08(r9, r1)
            if (r0 != 0) goto L_0x00b3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r3)
            r2.append(r9)
            java.lang.String r0 = " is not supported. supportedCodecPrefixes are "
            r2.append(r0)
            java.lang.String r9 = java.util.Arrays.toString(r1)
            goto L_0x006c
        L_0x00b3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r9)
            java.lang.String r0 = "_"
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r14, r1)
            java.util.Map r0 = cachedCodecCapabilites
            java.lang.Object r8 = r0.get(r1)
            android.media.MediaCodecInfo$CodecCapabilities r8 = (android.media.MediaCodecInfo.CodecCapabilities) r8
            if (r8 != 0) goto L_0x00e0
            android.media.MediaCodecInfo$CodecCapabilities r8 = r2.getCapabilitiesForType(r14)     // Catch:{ all -> 0x00d2 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x00d2 }
            goto L_0x00dd
        L_0x00d2:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoDecoder failed to get capabilities for "
            java.lang.String r0 = X.C13680ns.A0h(r0, r9)
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0072
        L_0x00dd:
            r0.put(r1, r8)
        L_0x00e0:
            r5 = 0
            r4 = r22
            if (r22 >= 0) goto L_0x00e6
            r5 = 1
        L_0x00e6:
            android.media.MediaCodecInfo$CodecProfileLevel[] r3 = r8.profileLevels
            int r2 = r3.length
            r1 = 0
        L_0x00ea:
            if (r1 >= r2) goto L_0x00f8
            r0 = r3[r1]
            if (r22 < 0) goto L_0x00f5
            int r0 = r0.profile
            if (r0 != r4) goto L_0x00f5
            r5 = 1
        L_0x00f5:
            int r1 = r1 + 1
            goto L_0x00ea
        L_0x00f8:
            java.lang.String r0 = "MediaCodecVideoDecoder  "
            if (r5 != 0) goto L_0x010d
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r0)
            r2.append(r9)
            java.lang.String r0 = " does not support Profile "
            r2.append(r0)
            r2.append(r4)
            goto L_0x006f
        L_0x010d:
            if (r23 == 0) goto L_0x013e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)
            int[] r0 = r8.colorFormats
            int r0 = r0.length
            r1.append(r0)
            java.lang.String r0 = "  colorFormats"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int[] r5 = r8.colorFormats
            int r4 = r5.length
            r3 = 0
        L_0x0126:
            if (r3 >= r4) goto L_0x013e
            r2 = r5[r3]
            java.lang.String r0 = "MediaCodecVideoDecoder    Color: 0x"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r2)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r3 = r3 + 1
            goto L_0x0126
        L_0x013e:
            java.lang.String r2 = com.whatsapp.voipcalling.Voip.A06(r18)
            java.lang.String r0 = "vid_driver.decoder_color_format"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r12 == 0) goto L_0x01c5
            boolean r0 = r9.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x01c5
            if (r1 == 0) goto L_0x01c5
            int r7 = r1.intValue()
        L_0x0157:
            int[] r16 = X.C43291zl.A09(r9, r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x016a
            java.lang.String r0 = "adaptive-playback"
            boolean r0 = r8.isFeatureSupported(r0)
            r15 = 1
            if (r0 != 0) goto L_0x016b
        L_0x016a:
            r15 = 0
        L_0x016b:
            r0 = r16
            int r0 = r0.length
            r20 = r0
            r6 = 0
        L_0x0171:
            r0 = r20
            if (r6 >= r0) goto L_0x0072
            r5 = r16[r6]
            if (r5 != r1) goto L_0x0188
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "ghost"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0188
        L_0x0183:
            int r6 = r6 + 1
            r1 = 19
            goto L_0x0171
        L_0x0188:
            int[] r4 = r8.colorFormats
            int r0 = r4.length
            r19 = r0
            r3 = 0
        L_0x018e:
            r0 = r19
            if (r3 >= r0) goto L_0x0183
            r2 = r4[r3]
            if (r2 != r5) goto L_0x01c2
            java.lang.String r0 = "MediaCodecVideoDecoder Found target decoder "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r9)
            java.lang.String r1 = ". Color: 0x"
            r0.append(r1)
            X.AnonymousClass000.A1J(r0, r2)
            java.lang.String r1 = ". Adaptive Playback: "
            r0.append(r1)
            r0.append(r15)
            X.C13680ns.A1V(r0)
            if (r2 != r7) goto L_0x01b8
            int r11 = r13.size()
        L_0x01b8:
            X.4Mm r1 = new X.4Mm
            r0 = r17
            r1.<init>(r8, r9, r2, r0)
            r13.add(r1)
        L_0x01c2:
            int r3 = r3 + 1
            goto L_0x018e
        L_0x01c5:
            r7 = 0
            goto L_0x0157
        L_0x01c7:
            int r1 = r1 + 1
            goto L_0x0036
        L_0x01cb:
            r9 = 0
            goto L_0x0044
        L_0x01ce:
            if (r11 < 0) goto L_0x01df
            java.lang.Object r2 = r13.get(r11)
            r1 = 0
            java.lang.Object r0 = r13.get(r1)
            r13.set(r11, r0)
            r13.set(r1, r2)
        L_0x01df:
            java.lang.String r0 = "vid_rc.android_decoder_prefer_impl"
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.A06(r0)
            int r5 = getDecoderImplFromString(r0)
            if (r5 == 0) goto L_0x021c
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            java.util.Iterator r2 = r13.iterator()
        L_0x01f8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0210
            java.lang.Object r1 = r2.next()
            X.4Mm r1 = (X.C84944Mm) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x020c
            r4.add(r1)
            goto L_0x01f8
        L_0x020c:
            r3.add(r1)
            goto L_0x01f8
        L_0x0210:
            r13.clear()
            r0 = 1
            if (r5 != r0) goto L_0x022d
            r13.addAll(r4)
            r13.addAll(r3)
        L_0x021c:
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0234
            java.lang.String r0 = "MediaCodecVideoDecoder No HW decoder found for mime "
            java.lang.String r0 = X.C13680ns.A0h(r0, r14)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x022d:
            r13.addAll(r3)
            r13.addAll(r4)
            goto L_0x021c
        L_0x0234:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.findDecoder(java.lang.String, java.lang.String[], int, boolean):java.util.List");
    }

    public static int getDecoderImplFromString(String str) {
        if ("SW".equalsIgnoreCase(str)) {
            return 1;
        }
        return "HW".equalsIgnoreCase(str) ? 2 : 0;
    }

    private int getDequeueOutputTimeout() {
        return 20;
    }

    private int getFrameConverterColorId(int i2, int i3) {
        Integer A01 = Voip.A01("vid_driver.decoder_frame_converter_color_format");
        String A06 = Voip.A06("vid_driver.decoder_name");
        Integer A012 = Voip.A01("vid_driver.decoder_color_format");
        return (A01 == null || A06 == null || A012 == null || !A06.equalsIgnoreCase(this.codecName) || i2 != A012.intValue()) ? i3 : A01.intValue();
    }

    private ByteBuffer getInputBuffer(int i2) {
        return Build.VERSION.SDK_INT >= 21 ? this.mediaCodec.getInputBuffer(i2) : this.inputBuffers[i2];
    }

    private ByteBuffer getOutputBuffer(int i2) {
        return Build.VERSION.SDK_INT >= 21 ? this.mediaCodec.getOutputBuffer(i2) : this.outputBuffers[i2];
    }

    private boolean initDecode(C799341x r11, int i2, int i3, AnonymousClass44W r14, byte[] bArr, byte[] bArr2, boolean z2) {
        String str;
        String[] strArr;
        String str2;
        if (this.mediaCodecThread == null) {
            this.useSurface = AnonymousClass000.A1V(r14);
            if (r11 == C799341x.VIDEO_CODEC_VP8) {
                strArr = supportedVp8HwCodecPrefixes;
                str2 = "video/x-vnd.on2.vp8";
            } else if (r11 == C799341x.VIDEO_CODEC_VP9) {
                strArr = supportedVp9HwCodecPrefixes;
                str2 = "video/x-vnd.on2.vp9";
            } else if (r11 == C799341x.VIDEO_CODEC_H264) {
                strArr = supportedH264HwCodecPrefixes;
                str2 = "video/avc";
            } else if (r11 == C799341x.VIDEO_CODEC_H265) {
                strArr = supportedH265HwCodecPrefixes;
                str2 = "video/hevc";
            } else {
                str = AnonymousClass000.A0g("initDecode: Non-supported codec ", r11);
            }
            try {
                List<C84944Mm> findDecoder = findDecoder(str2, strArr, -1, AnonymousClass000.A1Q(((SystemClock.uptimeMillis() - lastReleaseTimestamp) > 3000 ? 1 : ((SystemClock.uptimeMillis() - lastReleaseTimestamp) == 3000 ? 0 : -1))));
                if (findDecoder == null || findDecoder.isEmpty()) {
                    Log.e(C13680ns.A0h("MediaCodecVideoDecoder Can not find HW decoder for ", str2));
                } else {
                    runningInstance = this;
                    this.mediaCodecThread = Thread.currentThread();
                    this.freeInfos.addAll(this.carryAlongInfos);
                    this.carryAlongInfos.clear();
                    for (C84944Mm r1 : findDecoder) {
                        StringBuilder A0r = AnonymousClass000.A0r("MediaCodecVideoDecoder Java initDecode: ");
                        A0r.append(r11);
                        A0r.append(" : ");
                        A0r.append(i2);
                        A0r.append(" x ");
                        A0r.append(i3);
                        A0r.append(". Color: 0x");
                        int i4 = r1.A00;
                        AnonymousClass000.A1J(A0r, i4);
                        A0r.append(". Use Surface: ");
                        A0r.append(this.useSurface);
                        A0r.append(". Decoder: ");
                        String str3 = r1.A02;
                        Log.i(AnonymousClass000.A0h(str3, A0r));
                        try {
                            this.codecName = str3;
                            this.width = i2;
                            this.height = i3;
                            this.stride = i2;
                            this.sliceHeight = i3;
                            this.cropLeft = 0;
                            this.cropRight = i2 - 1;
                            this.cropTop = 0;
                            this.cropBottom = i3 - 1;
                            if (this.useSurface) {
                                new AnonymousClass4LI(r14);
                                throw AnonymousClass000.A0Z();
                            }
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str2, i2, i3);
                            if (bArr != null) {
                                StringBuilder A0o = AnonymousClass000.A0o();
                                A0o.append("MediaCodecVideoDecoder Java initDecode: csd-0 ");
                                Log.i(AnonymousClass000.A0h(Arrays.toString(bArr), A0o));
                                createVideoFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
                            }
                            if (bArr2 != null) {
                                StringBuilder A0o2 = AnonymousClass000.A0o();
                                A0o2.append("MediaCodecVideoDecoder Java initDecode: csd-1 ");
                                Log.i(AnonymousClass000.A0h(Arrays.toString(bArr2), A0o2));
                                createVideoFormat.setByteBuffer("csd-1", ByteBuffer.wrap(bArr2));
                            }
                            if (!this.useSurface) {
                                createVideoFormat.setInteger("color-format", i4);
                            }
                            StringBuilder A0o3 = AnonymousClass000.A0o();
                            A0o3.append("MediaCodecVideoDecoder   Format: ");
                            A0o3.append(createVideoFormat);
                            C13680ns.A1V(A0o3);
                            MediaCodec createByCodecName = MediaCodecVideoEncoder.createByCodecName(str3);
                            this.mediaCodec = createByCodecName;
                            if (createByCodecName == null) {
                                Log.e("MediaCodecVideoDecoder Can not create media decoder");
                                if (!z2) {
                                    break;
                                }
                            } else {
                                createByCodecName.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
                                this.mediaCodec.start();
                                C88424aT A02 = C43291zl.A02(createVideoFormat, (C88284aF) null, this.codecName);
                                int i5 = A02.A00;
                                this.colorFormat = i5;
                                this.colorId = getFrameConverterColorId(i5, A02.A05);
                                if (Build.VERSION.SDK_INT < 21) {
                                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                                    ByteBuffer[] inputBuffers2 = this.mediaCodec.getInputBuffers();
                                    this.inputBuffers = inputBuffers2;
                                    StringBuilder A0o4 = AnonymousClass000.A0o();
                                    A0o4.append("MediaCodecVideoDecoder Input buffers: ");
                                    A0o4.append(inputBuffers2.length);
                                    A0o4.append(". Output buffers: ");
                                    A0o4.append(this.outputBuffers.length);
                                    C13680ns.A1V(A0o4);
                                }
                                this.hasDecodedFirstFrame = false;
                                this.dequeuedSurfaceOutputBuffers.clear();
                                this.droppedFrames = 0;
                                setDecoderFlags(r1);
                                return true;
                            }
                        } catch (Throwable th) {
                            Log.e("MediaCodecVideoDecoder initDecode failed with Exception", th);
                        }
                    }
                }
                return false;
            } catch (Throwable th2) {
                Log.e("MediaCodecVideoDecoder Exception in findDecoder", th2);
                return false;
            }
        } else {
            str = "initDecode: Forgot to release()?";
        }
        throw AnonymousClass000.A0a(str);
    }

    private boolean initH264Decoder(int i2, int i3, byte[] bArr, byte[] bArr2) {
        return initH264Decoder(i2, i3, bArr, bArr2, false);
    }

    private boolean initH264Decoder(int i2, int i3, byte[] bArr, byte[] bArr2, boolean z2) {
        C84944Mm r4 = null;
        try {
            List findDecoder = findDecoder("video/avc", supportedH264HwCodecPrefixes, -1, false);
            if (findDecoder != null && !findDecoder.isEmpty()) {
                r4 = (C84944Mm) findDecoder.get(0);
            }
        } catch (Throwable th) {
            Log.e("MediaCodecVideoDecoder Exception in findDecoder", th);
        }
        setDecoderFlags(r4);
        return initDecode(C799341x.VIDEO_CODEC_H264, i2, i3, (AnonymousClass44W) null, bArr, bArr2, z2);
    }

    private boolean initH265Decoder(int i2, int i3, byte[] bArr, byte[] bArr2) {
        return initH265Decoder(i2, i3, bArr, bArr2, false);
    }

    private boolean initH265Decoder(int i2, int i3, byte[] bArr, byte[] bArr2, boolean z2) {
        C84944Mm r4 = null;
        try {
            List findDecoder = findDecoder("video/hevc", supportedH265HwCodecPrefixes, -1, true);
            if (findDecoder != null && !findDecoder.isEmpty()) {
                r4 = (C84944Mm) C13690nt.A0Z(findDecoder);
            }
        } catch (Throwable th) {
            Log.e("MediaCodecVideoDecoder Exception in findDecoder", th);
        }
        setDecoderFlags(r4);
        return initDecode(C799341x.VIDEO_CODEC_H265, i2, i3, (AnonymousClass44W) null, bArr, bArr2, z2);
    }

    public static boolean isH264HwSupported() {
        return !hwDecoderDisabledTypes.contains("video/avc") && findDecoder("video/avc", supportedH264HwCodecPrefixes, -1, false) != null;
    }

    public static boolean isH265HwSupported() {
        return !hwDecoderDisabledTypes.contains("video/hevc") && findDecoder("video/hevc", supportedH265HwCodecPrefixes, -1, true) != null;
    }

    public static boolean isSoftwareCodec(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.mediaCodecInfoIsSoftwareOnly(mediaCodecInfo);
        }
        String name = mediaCodecInfo.getName();
        return name.equalsIgnoreCase("OMX.google.h264.decoder") || name.equalsIgnoreCase("c2.android.avc.decoder") || name.toLowerCase(Locale.US).contains(".sw.");
    }

    public static boolean isVp8HwSupported() {
        return !hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp8") && findDecoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, -1, false) != null;
    }

    public static boolean isVp9HwSupported() {
        return !hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp9") && findDecoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, -1, false) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r3 = r0.getStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void printStackTrace() {
        /*
            org.wawebrtc.MediaCodecVideoDecoder r0 = runningInstance
            if (r0 == 0) goto L_0x001f
            java.lang.Thread r0 = r0.mediaCodecThread
            if (r0 == 0) goto L_0x001f
            java.lang.StackTraceElement[] r3 = r0.getStackTrace()
            int r2 = r3.length
            if (r2 <= 0) goto L_0x001f
            java.lang.String r0 = "MediaCodecVideoDecoder MediaCodecVideoDecoder stacks trace:"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
        L_0x0015:
            r0 = r3[r1]
            X.C13680ns.A1V(r0)
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x001f
            goto L_0x0015
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.printStackTrace():void");
    }

    private boolean queueInputBuffer(int i2, int i3, long j2, long j3, int i4) {
        C88224a9 r4;
        int i5 = i2;
        try {
            ByteBuffer inputBuffer = getInputBuffer(i2);
            inputBuffer.position(0);
            int i6 = i3;
            inputBuffer.limit(i3);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = j2;
            long j5 = j3;
            int i7 = i4;
            if (this.freeInfos.isEmpty()) {
                r4 = new C88224a9(i7, elapsedRealtime, j4, j5);
            } else {
                r4 = (C88224a9) this.freeInfos.remove(0);
                r4.A01 = elapsedRealtime;
                r4.A03 = j2;
                r4.A02 = j5;
                r4.A00 = i7;
            }
            this.carryAlongInfos.add(r4);
            this.mediaCodec.queueInputBuffer(i5, 0, i6, 1000 * elapsedRealtime, 0);
            return true;
        } catch (IllegalStateException e2) {
            Log.e("MediaCodecVideoDecoder decode failed", e2);
            return false;
        }
    }

    private void release() {
        StringBuilder A0r = AnonymousClass000.A0r("MediaCodecVideoDecoder Java releaseDecoder ");
        A0r.append(this.codecName);
        A0r.append(". Total number of dropped frames: ");
        A0r.append(this.droppedFrames);
        C13680ns.A1V(A0r);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new AnonymousClass1ZS(new RunnableRunnableShape15S0200000_I1_3(this, 16, countDownLatch), TAG).start();
        if (!AnonymousClass48H.A00(countDownLatch)) {
            Log.e("MediaCodecVideoDecoder Media decoder release timeout");
            codecErrors++;
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        runningInstance = null;
        lastReleaseTimestamp = SystemClock.uptimeMillis();
        if (this.useSurface) {
            this.surface.release();
            this.surface = null;
            throw AnonymousClass000.A0W("dispose");
        }
        Log.i("MediaCodecVideoDecoder Java releaseDecoder done");
    }

    private void reset(int i2, int i3) {
        if (this.mediaCodecThread == null || this.mediaCodec == null) {
            throw AnonymousClass000.A0a("Incorrect reset call for non-initialized decoder.");
        }
        StringBuilder A0r = AnonymousClass000.A0r("MediaCodecVideoDecoder Java reset: ");
        A0r.append(i2);
        A0r.append(" x ");
        A0r.append(i3);
        C13680ns.A1V(A0r);
        this.mediaCodec.flush();
        this.codecName = null;
        this.width = i2;
        this.height = i3;
        this.freeInfos.addAll(this.carryAlongInfos);
        this.carryAlongInfos.clear();
        this.dequeuedSurfaceOutputBuffers.clear();
        this.hasDecodedFirstFrame = false;
        this.droppedFrames = 0;
    }

    private void returnDecodedOutputBuffer(int i2) {
        if (!this.useSurface) {
            this.mediaCodec.releaseOutputBuffer(i2, false);
            return;
        }
        throw AnonymousClass000.A0V("returnDecodedOutputBuffer() called for surface decoding.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r7.intValue() > 0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00af, code lost:
        if (r9.A01.isFeatureSupported("adaptive-playback") != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002c, code lost:
        if (r1 == 0) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setDecoderFlags(X.C84944Mm r9) {
        /*
            r8 = this;
            java.lang.String r0 = "vid_driver.decoder_sps_pps_in_csd"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.decoder_baseline_hack"
            java.lang.Integer r6 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.decoder_constrained_high_hack"
            java.lang.Integer r5 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.decoder_restriction_hack"
            java.lang.Integer r4 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.decoder_restart_on_new_sps_pps"
            java.lang.Integer r7 = com.whatsapp.voipcalling.Voip.A01(r0)
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L_0x013c
            int r1 = r1.intValue()
        L_0x002b:
            r0 = 1
            if (r1 != 0) goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r8.needsSpsPpsInCsd = r0
            if (r6 == 0) goto L_0x012c
            int r0 = r6.intValue()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
        L_0x003b:
            r8.needsSpsBaselineProfileHack = r0
        L_0x003d:
            if (r5 == 0) goto L_0x011c
            int r0 = r5.intValue()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
        L_0x0047:
            r8.needsSpsConstrainedHighProfile = r0
        L_0x0049:
            if (r4 == 0) goto L_0x00b6
            int r0 = r4.intValue()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
        L_0x0053:
            r8.needsSpsBitstreamRestrictions = r0
        L_0x0055:
            if (r7 == 0) goto L_0x0095
            int r0 = r7.intValue()
            if (r0 <= 0) goto L_0x005e
        L_0x005d:
            r3 = 1
        L_0x005e:
            r8.needsRestartDecoderOnNewSpsPps = r3
        L_0x0060:
            java.lang.String r0 = "MediaCodecVideoDecoder needsSpsPpsInCsd: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            boolean r0 = r8.needsSpsPpsInCsd
            r1.append(r0)
            java.lang.String r0 = ". needsSpsBaselineProfileHack: "
            r1.append(r0)
            boolean r0 = r8.needsSpsBaselineProfileHack
            r1.append(r0)
            java.lang.String r0 = ". needsSpsBitstreamRestrictions: "
            r1.append(r0)
            boolean r0 = r8.needsSpsBitstreamRestrictions
            r1.append(r0)
            java.lang.String r0 = ". needsSpsConstrainedHighProfile: "
            r1.append(r0)
            boolean r0 = r8.needsSpsConstrainedHighProfile
            r1.append(r0)
            java.lang.String r0 = ". needsRestartDecoderOnNewSpsPps: "
            r1.append(r0)
            r1.append(r3)
            X.C13680ns.A1V(r1)
            return
        L_0x0095:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L_0x00b2
            if (r9 == 0) goto L_0x00b2
            java.lang.String r1 = r9.A02
            java.lang.String[] r0 = restartDecoderOnNewSpsPpsPrefixes
            boolean r0 = X.C43291zl.A08(r1, r0)
            if (r0 != 0) goto L_0x005d
            android.media.MediaCodecInfo$CodecCapabilities r1 = r9.A01
            java.lang.String r0 = "adaptive-playback"
            boolean r0 = r1.isFeatureSupported(r0)
            if (r0 != 0) goto L_0x005e
            goto L_0x005d
        L_0x00b2:
            r8.needsRestartDecoderOnNewSpsPps = r2
            r3 = 1
            goto L_0x0060
        L_0x00b6:
            java.lang.String r0 = "smdk4"
            boolean r0 = X.C31111dU.A02(r0)     // Catch:{ Exception -> 0x00d3 }
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "Found SMDK4 in /proc/cpuinfo"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00d3 }
            goto L_0x0118
        L_0x00c5:
            java.lang.String r0 = "exynos 4"
            boolean r0 = X.C31111dU.A02(r0)     // Catch:{ Exception -> 0x00d3 }
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = "Found Exynos 4 in /proc/cpuinfo"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00d3 }
            goto L_0x0118
        L_0x00d3:
            r1 = move-exception
            java.lang.String r0 = "DeviceInfo/isExynos4Device searchFileForText"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00d9:
            java.lang.String r0 = "/sys/devices/system"
            java.io.File r0 = X.C13700nu.A0D(r0)     // Catch:{ Exception -> 0x0106 }
            java.io.File[] r6 = r0.listFiles()     // Catch:{ Exception -> 0x0106 }
            if (r6 == 0) goto L_0x010c
            int r5 = r6.length     // Catch:{ Exception -> 0x0106 }
            r4 = 0
        L_0x00e7:
            if (r4 >= r5) goto L_0x010c
            r0 = r6[r4]     // Catch:{ Exception -> 0x0106 }
            java.lang.String r1 = r0.getName()     // Catch:{ Exception -> 0x0106 }
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0106 }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ Exception -> 0x0106 }
            java.lang.String r0 = "exynos4"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x0106 }
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = "Found exynos4 in /sys/devices/system"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0106 }
            goto L_0x0118
        L_0x0103:
            int r4 = r4 + 1
            goto L_0x00e7
        L_0x0106:
            r1 = move-exception
            java.lang.String r0 = "DeviceInfo/isExynos4Device search in /sys/devices/system"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x010c:
            if (r9 == 0) goto L_0x0118
            java.lang.String r1 = r9.A02
            java.lang.String[] r0 = spsBitstreamRestrictionsPrefixes
            boolean r0 = X.C43291zl.A08(r1, r0)
            goto L_0x0053
        L_0x0118:
            r8.needsSpsBitstreamRestrictions = r2
            goto L_0x0055
        L_0x011c:
            if (r9 == 0) goto L_0x0128
            java.lang.String r1 = r9.A02
            java.lang.String[] r0 = spsConstrainedHighProfilePrefixes
            boolean r0 = X.C43291zl.A08(r1, r0)
            goto L_0x0047
        L_0x0128:
            r8.needsSpsConstrainedHighProfile = r3
            goto L_0x0049
        L_0x012c:
            if (r9 == 0) goto L_0x0138
            java.lang.String r1 = r9.A02
            java.lang.String[] r0 = spsBaselineProfileHackPrefixes
            boolean r0 = X.C43291zl.A08(r1, r0)
            goto L_0x003b
        L_0x0138:
            r8.needsSpsBaselineProfileHack = r3
            goto L_0x003d
        L_0x013c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r1 >= r0) goto L_0x002e
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String r0 = "mt\\d+"
            boolean r1 = r1.matches(r0)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.setDecoderFlags(X.4Mm):void");
    }

    public static void setErrorCallback(AnonymousClass5NS r1) {
        Log.i("MediaCodecVideoDecoder Set error callback");
        errorCallback = r1;
    }
}
