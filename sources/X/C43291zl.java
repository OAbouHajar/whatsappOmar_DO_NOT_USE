package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.mod.bomfab.R$styleable;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Locale;

/* renamed from: X.1zl  reason: invalid class name and case insensitive filesystem */
public class C43291zl implements C43301zm {
    public static int A0L;
    public static String A0M;
    public static final byte[] A0N = {102, 116, 121, 112};
    public static final int[] A0O = {19, 20, 21, 39, 2141391872, 2130706688, 25, 2141391876, 2130706433, 2141391875, 2141391873, 11, 2130706944};
    public float A00 = 3.0f;
    public long A01;
    public long A02;
    public C88284aF A03;
    public C108835Pr A04;
    public C88424aT A05;
    public C62033Bj A06;
    public File A07;
    public File A08;
    public File A09;
    public byte[] A0A;
    public final int A0B;
    public final int A0C;
    public final long A0D;
    public final long A0E;
    public final C16300so A0F;
    public final C16980tz A0G;
    public final C14710pd A0H;
    public final AnonymousClass1QT A0I;
    public final File A0J;
    public volatile boolean A0K;

    public C43291zl(C16300so r4, C16980tz r5, C14710pd r6, AnonymousClass1QT r7, File file, File file2, int i2, int i3, long j2, long j3) {
        this.A0G = r5;
        this.A0H = r6;
        this.A0F = r4;
        this.A0I = r7;
        this.A08 = file;
        this.A0J = file2;
        this.A0D = j2;
        this.A0E = j3;
        this.A0C = i2;
        this.A0B = i3;
        if (j3 > 0 && j2 == j3) {
            StringBuilder sb = new StringBuilder("timeFrom:");
            sb.append(j2);
            sb.append(" timeTo:");
            sb.append(j3);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static int A00(int i2) {
        switch (i2) {
            case 11:
                return 7;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
            case 39:
            case 2130706688:
            case 2141391873:
            case 2141391876:
                return 3;
            case 2130706433:
                return 6;
            case 2130706944:
                return 2;
            case 2141391872:
                return 4;
            case 2141391875:
                return 5;
            default:
                return 1;
        }
    }

    public static synchronized int A01(boolean z2) {
        int i2;
        String str;
        synchronized (C43291zl.class) {
            i2 = A0L;
            if (i2 == 0) {
                String str2 = null;
                if (C41971wz.A03()) {
                    i2 = 2;
                    StringBuilder sb = new StringBuilder();
                    sb.append("videotranscoder/istranscodesupported/unsupported model ");
                    sb.append(Build.MANUFACTURER);
                    sb.append("-");
                    sb.append(Build.MODEL);
                    str = sb.toString();
                } else {
                    int codecCount = MediaCodecList.getCodecCount();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("videotranscoder/istranscodesupported/number of codecs: ");
                    sb2.append(codecCount);
                    Log.i(sb2.toString());
                    for (int i3 = 0; i3 < codecCount; i3++) {
                        MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
                        if (codecInfoAt.isEncoder() && C41971wz.A0D(codecInfoAt.getName(), z2)) {
                            String[] supportedTypes = codecInfoAt.getSupportedTypes();
                            int length = supportedTypes.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    break;
                                } else if (supportedTypes[i4].equals("video/avc")) {
                                    str2 = codecInfoAt.getName();
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("videotranscoder/istranscodesupported/found ");
                                    sb3.append(codecInfoAt.getName());
                                    Log.i(sb3.toString());
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                    i2 = 1;
                    if (str2 == null) {
                        i2 = 3;
                        str = "videotranscoder/istranscodesupported/no encoder found";
                    }
                    A06(str2);
                    A0L = i2;
                }
                Log.w(str);
                A06(str2);
                A0L = i2;
            }
        }
        return i2;
    }

    public static C88424aT A02(MediaFormat mediaFormat, C88284aF r4, String str) {
        int i2;
        String str2;
        String str3;
        int i3;
        StringBuilder sb = new StringBuilder("videotranscoder/transcode/getDecoderFormat output format has changed to ");
        sb.append(mediaFormat);
        Log.i(sb.toString());
        C88424aT r2 = new C88424aT();
        r2.A0A = str;
        r2.A00 = mediaFormat.getInteger("color-format");
        r2.A09 = mediaFormat.getInteger("width");
        r2.A06 = mediaFormat.getInteger("height");
        try {
            r2.A02 = mediaFormat.getInteger("crop-left");
        } catch (Exception unused) {
        }
        try {
            r2.A03 = mediaFormat.getInteger("crop-right");
        } catch (Exception unused2) {
        }
        try {
            r2.A04 = mediaFormat.getInteger("crop-top");
        } catch (Exception unused3) {
        }
        try {
            r2.A01 = mediaFormat.getInteger("crop-bottom");
        } catch (Exception unused4) {
        }
        try {
            r2.A07 = mediaFormat.getInteger("slice-height");
        } catch (Exception unused5) {
        }
        if (str.startsWith("OMX.Nvidia.")) {
            r2.A07 = ((r2.A06 + 16) - 1) & -16;
        } else if (str.equalsIgnoreCase("OMX.SEC.avc.dec")) {
            r2.A07 = r2.A06;
            r2.A08 = r2.A09;
        }
        try {
            r2.A08 = mediaFormat.getInteger("stride");
        } catch (Exception unused6) {
        }
        if (Build.VERSION.SDK_INT < 21 && r2.A01 == 1079 && r2.A06 == 1088 && A07(str)) {
            Log.i("videotranscoder/transcode/decoder workaround samsung incorrect height");
            r2.A06 = 1080;
        }
        A06(str);
        if (r4 != null) {
            int i4 = r2.A00;
            String str4 = r4.A04;
            if (str4 != null && i4 > 0 && (i3 = r4.A00) > 0 && str4.equals(str) && i3 == i4) {
                StringBuilder sb2 = new StringBuilder("videotranscoder/parseDecoderFormat/forcing frame convert color id=");
                i2 = r4.A02;
                sb2.append(i2);
                str3 = sb2.toString();
                Log.i(str3);
                r2.A05 = i2;
                return r2;
            }
        }
        int i5 = r2.A00;
        r2.A05 = A00(i5);
        i2 = 3;
        if (i5 != 25) {
            if (i5 != 2141391876) {
                if (i5 == 2130706433 && ((str2 = A0M) == null || !str2.toLowerCase(Locale.US).startsWith("mt6589"))) {
                    r2.A05 = 1;
                    return r2;
                }
            }
            r2.A05 = i2;
        } else if ("OMX.k3.video.encoder.avc".equals(str) || "OMX.k3.video.decoder.avc".equals(str)) {
            str3 = "videotranscoder/transcode/decoder color format for Huaiwei is VideoFrameConverter.FRAMECONV_COLOR_FORMAT_NV12";
            Log.i(str3);
            r2.A05 = i2;
        }
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0176, code lost:
        if (r4 == 17) goto L_0x0178;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C88424aT A03(X.C88284aF r10, java.lang.String r11, int r12, int r13, int r14, int r15, int r16, int r17) {
        /*
            X.4aT r2 = new X.4aT
            r2.<init>(r12, r13, r14)
            r2.A0A = r11
            int r17 = r17 + r15
            int r6 = r17 + -1
            int r0 = r15 + -1
            r9 = r0 ^ -1
            r6 = r6 & r9
            int r16 = r16 + r15
            int r7 = r16 + -1
            r7 = r7 & r9
            float r4 = (float) r13
            float r0 = (float) r14
            r5 = 0
            float r0 = r0 + r5
            float r4 = r4 / r0
            int r3 = r2.A09
            if (r3 < r7) goto L_0x01c6
            int r0 = r2.A06
            if (r0 < r6) goto L_0x01c6
            X.41X r1 = X.AnonymousClass41X.None
        L_0x0024:
            X.41X r0 = X.AnonymousClass41X.None
            java.lang.String r5 = "x"
            if (r1 == r0) goto L_0x007c
            X.41X r0 = X.AnonymousClass41X.Vertical
            if (r1 != r0) goto L_0x01a9
            int r0 = r2.A06
            int r0 = r6 - r0
            r2.A06 = r6
            float r3 = (float) r3
            float r0 = (float) r0
            float r0 = r0 * r4
            float r3 = r3 + r0
            int r3 = (int) r3
            r2.A09 = r3
            int r0 = r15 >> 1
            int r3 = r3 + r0
            int r0 = r3 + -1
            r0 = r0 & r9
            r2.A09 = r0
            int r0 = java.lang.Math.max(r0, r7)
            r2.A09 = r0
        L_0x004a:
            java.lang.String r0 = "videotranscoder/transcode/encoder parseEncoderFormat expand direction is "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r1)
            java.lang.String r0 = ", input size: "
            r3.append(r0)
            r3.append(r13)
            r3.append(r5)
            r3.append(r14)
            java.lang.String r0 = ", after expansion: "
            r3.append(r0)
            int r0 = r2.A09
            r3.append(r0)
            r3.append(r5)
            int r0 = r2.A06
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x007c:
            int r0 = r2.A06
            int r1 = r15 >> 1
            int r0 = r0 + r1
            int r7 = r0 + -1
            r7 = r7 & r9
            r2.A06 = r7
            int r0 = r2.A09
            int r0 = r0 + r1
            int r6 = r0 + -1
            r6 = r6 & r9
            r2.A09 = r6
            java.lang.String r0 = "OMX.MTK.VIDEO.ENCODER.AVC"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00e2
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "motorola"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r1 >= r0) goto L_0x00e2
            int r1 = r6 * r7
            r0 = 306176(0x4ac00, float:4.29044E-40)
            if (r1 <= r0) goto L_0x00e2
            r3 = 4689003676092596224(0x4112b00000000000, double:306176.0)
            double r0 = (double) r1
            double r3 = r3 / r0
            double r3 = java.lang.Math.sqrt(r3)
            double r0 = (double) r6
            double r0 = r0 * r3
            int r6 = (int) r0
            r2.A09 = r6
            double r0 = (double) r7
            double r3 = r3 * r0
            int r0 = (int) r3
            r2.A06 = r0
            r4 = r6 & -16
            r2.A09 = r4
            r3 = r0 & -8
            r2.A06 = r3
            java.lang.String r1 = "videotranscoder/transcode/force frame dimensions for motorola to "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00e2:
            int r3 = r2.A09
            r2.A08 = r3
            int r1 = r2.A06
            r2.A07 = r1
            java.lang.String r0 = "OMX.Nvidia."
            boolean r0 = r11.startsWith(r0)
            r5 = 16
            if (r0 == 0) goto L_0x0102
            int r0 = r3 + 15
            int r0 = r0 / r5
            int r0 = r0 << 4
            r2.A08 = r0
            int r0 = r1 + 15
            int r0 = r0 / r5
            int r0 = r0 << 4
            r2.A07 = r0
        L_0x0102:
            A06(r11)
            if (r10 == 0) goto L_0x0130
            java.lang.String r0 = r10.A05
            if (r0 == 0) goto L_0x0130
            if (r12 <= 0) goto L_0x0130
            int r1 = r10.A01
            if (r1 <= 0) goto L_0x0130
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0130
            if (r1 != r12) goto L_0x0130
            java.lang.String r1 = "videotranscoder/parseEncoderFormat/forcing frame conver color id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            int r1 = r10.A03
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A05 = r1
        L_0x012f:
            return r2
        L_0x0130:
            int r0 = A00(r12)
            r2.A05 = r0
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 4
            r3 = 21
            if (r4 != r5) goto L_0x0174
            int r0 = r2.A00
            if (r0 != r3) goto L_0x0178
            java.lang.String r4 = android.os.Build.MODEL
            java.lang.String r0 = "GT-N7000"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "SAMSUNG-SGH-I777"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "GT-I9100"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "SHV-E210"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "OMX.SEC.avc.enc"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0178
            r2.A05 = r1
            java.lang.String r0 = "videotranscoder/transcode/encoder workaround wrong color format for samsung to FRAMECONV_COLOR_FORMAT_NV21"
        L_0x0170:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x0174:
            r0 = 17
            if (r4 != r0) goto L_0x0190
        L_0x0178:
            if (r12 != r3) goto L_0x0190
            java.lang.String r0 = "OMX.k3.video.encoder.avc"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x018a
            java.lang.String r0 = "OMX.k3.video.decoder.avc"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0190
        L_0x018a:
            r2.A05 = r1
            java.lang.String r0 = "videotranscoder/transcode/encoder workaround wrong color format for huawei to FRAMECONV_COLOR_FORMAT_NV21"
            goto L_0x0170
        L_0x0190:
            java.lang.String r1 = A0M
            if (r1 == 0) goto L_0x012f
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "mt6572"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x012f
            r0 = 2
            r2.A05 = r0
            java.lang.String r0 = "workaround wrong color format for mt6572 to FRAMECONV_COLOR_FORMAT_YV12"
            goto L_0x0170
        L_0x01a9:
            int r8 = r7 - r3
            r2.A09 = r7
            int r0 = r2.A06
            float r3 = (float) r0
            float r0 = (float) r8
            float r0 = r0 / r4
            float r3 = r3 + r0
            int r3 = (int) r3
            r2.A06 = r3
            int r0 = r15 >> 1
            int r3 = r3 + r0
            int r0 = r3 + -1
            r0 = r0 & r9
            r2.A06 = r0
            int r0 = java.lang.Math.max(r0, r6)
            r2.A06 = r0
            goto L_0x004a
        L_0x01c6:
            if (r3 >= r7) goto L_0x01d0
            int r0 = r2.A06
            if (r0 < r6) goto L_0x01d0
        L_0x01cc:
            X.41X r1 = X.AnonymousClass41X.Horizontal
            goto L_0x0024
        L_0x01d0:
            if (r3 < r7) goto L_0x01da
            int r0 = r2.A06
            if (r0 >= r6) goto L_0x01da
        L_0x01d6:
            X.41X r1 = X.AnonymousClass41X.Vertical
            goto L_0x0024
        L_0x01da:
            float r1 = (float) r7
            float r0 = (float) r6
            float r0 = r0 + r5
            float r1 = r1 / r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01cc
            goto L_0x01d6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43291zl.A03(X.4aF, java.lang.String, int, int, int, int, int, int):X.4aT");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A04(java.lang.String r4) {
        /*
            java.lang.String r3 = ""
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ IOException -> 0x003c }
            r1 = 0
            java.lang.String r0 = "/system/bin/getprop"
            r2[r1] = r0     // Catch:{ IOException -> 0x003c }
            r1 = 1
            r2[r1] = r4     // Catch:{ IOException -> 0x003c }
            java.lang.ProcessBuilder r0 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x003c }
            r0.<init>(r2)     // Catch:{ IOException -> 0x003c }
            java.lang.ProcessBuilder r0 = r0.redirectErrorStream(r1)     // Catch:{ IOException -> 0x003c }
            java.lang.Process r2 = r0.start()     // Catch:{ IOException -> 0x003c }
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ IOException -> 0x003c }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x003c }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003c }
            r1.<init>(r0)     // Catch:{ IOException -> 0x003c }
        L_0x0028:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0030
            r3 = r0
            goto L_0x0028
        L_0x0030:
            r1.close()     // Catch:{ IOException -> 0x003c }
            r2.destroy()     // Catch:{ IOException -> 0x003c }
            return r3
        L_0x0037:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r1 = move-exception
            java.lang.String r0 = "getsystemproperty/"
            com.whatsapp.util.Log.w(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43291zl.A04(java.lang.String):java.lang.String");
    }

    public static final void A05(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, WritableByteChannel writableByteChannel, ByteBuffer[] byteBufferArr) {
        while (true) {
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, SearchActionVerificationClientService.MS_TO_NS);
            if (dequeueOutputBuffer >= 0) {
                StringBuilder sb = new StringBuilder("videotranscoder/transcode/encoder draining ");
                sb.append(dequeueOutputBuffer);
                Log.i(sb.toString());
                ByteBuffer byteBuffer = byteBufferArr[dequeueOutputBuffer];
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                writableByteChannel.write(byteBuffer);
                byteBuffer.clear();
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else {
                Log.i("videotranscoder/transcode/encoder drained");
                return;
            }
        }
    }

    public static void A06(String str) {
        if (A0M == null && "OMX.MTK.VIDEO.ENCODER.AVC".equals(str)) {
            String A042 = A04("ro.board.platform");
            A0M = A042;
            if (TextUtils.isEmpty(A042)) {
                A0M = A04("ro.mediatek.platform");
            }
            StringBuilder sb = new StringBuilder("videotranscoder/setHwBoardPlatform/board/");
            sb.append(A0M);
            Log.i(sb.toString());
        }
    }

    public static boolean A07(String str) {
        return "OMX.SEC.avc.enc".equals(str) || "OMX.SEC.avc.dec".equals(str) || "OMX.Exynos.AVC.Encoder".equals(str) || "OMX.Exynos.AVC.Decoder".equals(str);
    }

    public static boolean A08(String str, String[] strArr) {
        if (strArr != null) {
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            for (String lowerCase2 : strArr) {
                if (lowerCase.startsWith(lowerCase2.toLowerCase(locale))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] A09(String str, int i2) {
        if (i2 <= 0) {
            if (!str.equals("OMX.MTK.VIDEO.ENCODER.AVC") && !str.equals("OMX.MTK.VIDEO.DECODER.AVC")) {
                return A0O;
            }
            i2 = 2130706944;
        }
        int[] iArr = A0O;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        iArr2[0] = i2;
        for (int i3 = 1; i3 < length; i3++) {
            int i4 = iArr[i3 - 1];
            iArr2[i3] = i4;
            if (i4 == i2) {
                iArr2[i3] = 0;
            }
        }
        return iArr2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:534|535|536) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:200|201|202|601|602) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:291|292|293|294|295|639) */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x04bf, code lost:
        if (r0.A04.AVN(r11) != false) goto L_0x04c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0964, code lost:
        if (r13 < 0) goto L_0x139a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0966, code lost:
        r12 = r44.getTrackFormat(r13);
        r11 = r12.getString("mime");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0970, code lost:
        if (r11 == null) goto L_0x137f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0979, code lost:
        if ("video/unknown".equals(r11) != false) goto L_0x137f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x097b, code lost:
        r44.selectTrack(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0984, code lost:
        if (r12.containsKey("durationUs") == false) goto L_0x09aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0986, code lost:
        r23 = r12.getLong("durationUs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x098a, code lost:
        r7 = new java.lang.StringBuilder();
        r7.append("videotranscoder/transcode/decoder format:");
        r7.append(r12);
        r7.append(" duration:");
        r7.append(r23);
        com.whatsapp.util.Log.i(r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x09aa, code lost:
        r23 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        r13 = android.media.MediaCodec.createDecoderByType(r11);
        r7 = r30.A0E(r5, 1250);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x09c2, code lost:
        if ("samsung".equalsIgnoreCase(android.os.Build.MANUFACTURER) == false) goto L_0x0a1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x09c8, code lost:
        if (android.os.Build.VERSION.SDK_INT < 18) goto L_0x0a1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x09ca, code lost:
        if (r7 == false) goto L_0x0a1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x09cc, code lost:
        r13 = r13.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x09dc, code lost:
        if (r13.toLowerCase(java.util.Locale.US).startsWith("omx.exynos") != false) goto L_0x0a16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x09de, code lost:
        r29 = X.AnonymousClass1QT.A04(r11).iterator();
        r15 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x09ec, code lost:
        if (r29.hasNext() == false) goto L_0x0a0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x09ee, code lost:
        r7 = (java.lang.String) r29.next();
        r2 = r7.toLowerCase(java.util.Locale.US);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x09fe, code lost:
        if (r2.startsWith("omx.exynos") == false) goto L_0x0a03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0a00, code lost:
        if (r15 != null) goto L_0x0a03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0a02, code lost:
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0a09, code lost:
        if (r2.startsWith("c2.exynos") != false) goto L_0x09e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0a0b, code lost:
        if (r14 != null) goto L_0x09e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0a0d, code lost:
        r14 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0a0f, code lost:
        if (r15 == null) goto L_0x0a13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0a11, code lost:
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0a13, code lost:
        if (r14 == null) goto L_0x0a16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0a15, code lost:
        r13 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0a16, code lost:
        r13 = android.media.MediaCodec.createByCodecName(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0a1a, code lost:
        if (r13 == null) goto L_0x134e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:?, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder created");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0a26, code lost:
        if (android.os.Build.VERSION.SDK_INT != 17) goto L_0x0a75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0a28, code lost:
        r2 = android.os.Build.MANUFACTURER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0a30, code lost:
        if (r2.equals("LGE") == false) goto L_0x0a53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0a32, code lost:
        r2 = android.os.Build.MODEL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0a3a, code lost:
        if (r2.startsWith("LG-D80") != false) goto L_0x0a65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0a42, code lost:
        if (r2.startsWith("LG-VS980") != false) goto L_0x0a65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0a4a, code lost:
        if (r2.startsWith("VS980_4G") != false) goto L_0x0a65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0a4c, code lost:
        r1 = r2.startsWith("LG-F320");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0a59, code lost:
        if (r2.equals("Amazon") == false) goto L_0x0a75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0a5b, code lost:
        r1 = android.os.Build.MODEL.startsWith("SD4930UR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0a63, code lost:
        if (r1 == false) goto L_0x0a75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0a65, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/videooutputsurface created");
        r8 = new X.C91614gD(r37, r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0a75, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0a76, code lost:
        r65 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0a78, code lost:
        if (r8 != null) goto L_0x0a7c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0a7a, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:?, code lost:
        r2 = r8.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0a7e, code lost:
        r13.configure(r12, r2, (android.media.MediaCrypto) null, 0);
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder configured");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0a8a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:?, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder failed to configure, will try different one ", r2);
        r13.release();
        r29 = X.AnonymousClass1QT.A04(r11).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0aa1, code lost:
        if (r29.hasNext() != false) goto L_0x0aa3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0aa3, code lost:
        r14 = (java.lang.String) r29.next();
        r1 = new java.lang.StringBuilder("videotranscoder/transcode/decoder/try ");
        r1.append(r14);
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0ac1, code lost:
        if ("OMX.ittiam.video.decoder.avc".equals(r14) != false) goto L_0x0ac3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0ac3, code lost:
        r1 = new java.lang.StringBuilder("videotranscoder/transcode/decoder/skip ");
        r1.append(r14);
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0ad6, code lost:
        r13 = android.media.MediaCodec.createByCodecName(r14);
        r2 = new java.lang.StringBuilder("videotranscoder/transcode/decoder ");
        r2.append(r14);
        r2.append(" created");
        com.whatsapp.util.Log.i(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:?, code lost:
        r13.configure(r12, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
        r1 = new java.lang.StringBuilder();
        r1.append("videotranscoder/transcode/decoder ");
        r1.append(r14);
        r1.append(" is ok");
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:?, code lost:
        r13.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0b10, code lost:
        r13.start();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder started");
        r34 = r13.getInputBuffers();
        r31 = r13.getOutputBuffers();
        r7 = new android.media.MediaCodec.BufferInfo();
        r43 = new android.media.MediaCodec.BufferInfo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0b2d, code lost:
        if (r25 <= 0) goto L_0x0b57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0b2f, code lost:
        r1 = r25 * 1000;
        r44.seekTo(r1, 0);
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/seek to:");
        r4.append(r1);
        r4.append(" actual:");
        r4.append(r44.getSampleTime());
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0b57, code lost:
        r41 = com.whatsapp.VideoFrameConverter.create();
        r1 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0b5d, code lost:
        if (r1 == null) goto L_0x0b7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0b5f, code lost:
        r2 = r1.A06.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0b69, code lost:
        if (r2.hasNext() == false) goto L_0x0b7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0b75, code lost:
        if (((X.C455829l) r2.next()).A0L() == false) goto L_0x0b65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0b77, code lost:
        r32 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0b7a, code lost:
        r53 = null;
        r51 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0b7f, code lost:
        r51 = android.graphics.Bitmap.createBitmap(r37, r36, android.graphics.Bitmap.Config.ARGB_8888);
        r0.A06.A06((360 - r54) % 360, r51);
        r53 = java.nio.ByteBuffer.allocateDirect((r51.getWidth() * r51.getHeight()) << 2);
        r1 = r53;
        r51.copyPixelsToBuffer(r1);
        com.whatsapp.VideoFrameConverter.setOverlay(r41, r1, 0, 0, r51.getWidth(), r51.getHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0bbf, code lost:
        r75 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0bd2, code lost:
        if (r8 == null) goto L_0x0bd9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0bd9, code lost:
        r58 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:?, code lost:
        r58 = java.nio.ByteBuffer.allocateDirect((r37 << 2) * r36);
        com.whatsapp.VideoFrameConverter.configure(r41, 7, r37, r36, 0, 0, r37 - 1, r36 - 1, r75, r37, r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0bf7, code lost:
        r59 = r30.A0E(r5, 2747);
        r60 = 1000000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0c02, code lost:
        if (r59 == false) goto L_0x0c06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0c04, code lost:
        r60 = 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0c06, code lost:
        r0.A02 = 0;
        r0.A01 = 0;
        r64 = 0;
        r61 = false;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0c11, code lost:
        if (r65 != false) goto L_0x10e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0c15, code lost:
        if (r0.A0K != false) goto L_0x10e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0c17, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0c1a, code lost:
        if (r2 >= 0) goto L_0x0c31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0c1c, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/loop ");
        r4.append(r2);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0c31, code lost:
        if (r61 != false) goto L_0x0cf4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0c33, code lost:
        r5 = r13.dequeueInputBuffer((long) r60);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0c3a, code lost:
        if (r2 >= 0) goto L_0x0c51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0c3c, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/decoder/dequeue/input ");
        r4.append(r5);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0c51, code lost:
        if (r5 >= 0) goto L_0x0c6c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0c53, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/decoder/dequeue/input < 0");
        r4.append(r5);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0c68, code lost:
        if (r59 != false) goto L_0x0cf4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0c6c, code lost:
        r6 = r44.readSampleData(r34[r5], 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0c74, code lost:
        if (r6 >= 0) goto L_0x0c8e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0c76, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/extractor BUFFER_FLAG_END_OF_STREAM");
        r13.queueInputBuffer(r5, 0, 0, 0, 4);
        r61 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0c8e, code lost:
        if (r2 >= 0) goto L_0x0cb1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0c90, code lost:
        r11 = new java.lang.StringBuilder();
        r11.append("videotranscoder/transcode/extractor/sample size:");
        r11.append(r6);
        r11.append(" time:");
        r11.append(r44.getSampleTime());
        com.whatsapp.util.Log.i(r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0cb1, code lost:
        r13.queueInputBuffer(r5, 0, r6, r44.getSampleTime(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0cc2, code lost:
        if (r2 >= 0) goto L_0x0cd9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0cc4, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/decoder/queue/input ");
        r4.append(r5);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0cd9, code lost:
        r5 = r44.advance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0cdd, code lost:
        if (r2 >= 0) goto L_0x0cf4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0cdf, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/extractor/advance ");
        r4.append(r5);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0cf4, code lost:
        r12 = r13.dequeueOutputBuffer(r7, com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0cfb, code lost:
        if (r2 >= 0) goto L_0x0d12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0cfd, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/decoder/dequeue/output ");
        r4.append(r12);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0d14, code lost:
        if (r12 < 0) goto L_0x0fbe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:?, code lost:
        r29 = r25 * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0d1c, code lost:
        if (r7.presentationTimeUs < r29) goto L_0x0f98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0d1e, code lost:
        r6 = r46.dequeueInputBuffer(com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0d27, code lost:
        if (r2 >= 0) goto L_0x0d3e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0d29, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/encoder/dequeue/input ");
        r4.append(r6);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0d3e, code lost:
        if (r6 < 0) goto L_0x0f22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0d40, code lost:
        r14 = r35[r6];
        r14.clear();
        r3 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0d47, code lost:
        if (r3 == null) goto L_0x0d89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0d49, code lost:
        if (r32 == false) goto L_0x0d89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0d4b, code lost:
        r4 = r3.A06.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0d55, code lost:
        if (r4.hasNext() == false) goto L_0x0d5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0d57, code lost:
        r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0d5b, code lost:
        r51.eraseColor(0);
        r3 = r51;
        r0.A06.A06((360 - r54) % 360, r3);
        r53.rewind();
        r4 = r3;
        r3 = r53;
        r4.copyPixelsToBuffer(r3);
        com.whatsapp.VideoFrameConverter.setOverlay(r41, r3, 0, 0, r51.getWidth(), r51.getHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0d89, code lost:
        if (r8 == null) goto L_0x0dde;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0d8b, code lost:
        r8.A00();
        r13.releaseOutputBuffer(r12, true);
        r5 = r8.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0d94, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0d97, code lost:
        if (r8.A07 != false) goto L_0x0daa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:?, code lost:
        r5.wait(500);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0da0, code lost:
        if (r8.A07 != false) goto L_0x0d95;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0da9, code lost:
        throw new java.lang.RuntimeException("Surface frame wait timed out");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:?, code lost:
        r8.A07 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0dac, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:?, code lost:
        X.C89054bW.A00("before updateTexImage");
        r8.A00.updateTexImage();
        r8.A02.A01(r8.A00);
        android.opengl.GLES20.glReadPixels(0, 0, r37, r36, 6407, 5121, r58);
        r58.position(0);
        com.whatsapp.VideoFrameConverter.convertFrame(r41, r58, r14);
        r62 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0dde, code lost:
        r5 = r31[r12];
        r5.position(r7.offset);
        r5.limit(r7.offset + r7.size);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0df1, code lost:
        if (r0.A01 == 0) goto L_0x0df5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0df3, code lost:
        if (r2 >= 0) goto L_0x0e34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0df5, code lost:
        r15 = new java.lang.StringBuilder();
        r15.append("videotranscoder/transcode/convert decoderBufferInfo.offset:");
        r15.append(r7.offset);
        r15.append(" decoderBufferInfo.size:");
        r15.append(r7.size);
        r15.append(" decoderBufferInfo.presentationTimeUs:");
        r15.append(r7.presentationTimeUs);
        r15.append(" decoderBufferInfo.flags:");
        r15.append(r7.flags);
        r15.append(" encoderFrameSize:");
        r15.append(r20);
        com.whatsapp.util.Log.i(r15.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0e36, code lost:
        if (r0.A0A != null) goto L_0x0e43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0e38, code lost:
        r3 = new byte[r5.remaining()];
        r5.get(r3);
        r0.A0A = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0e43, code lost:
        com.whatsapp.VideoFrameConverter.convertFrame(r41, r5, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0e4c, code lost:
        if (r0.A01 == 0) goto L_0x0e50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0e4e, code lost:
        if (r2 >= 0) goto L_0x0e56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0e50, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/converted");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0e56, code lost:
        r62 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0e58, code lost:
        r46.queueInputBuffer(r6, 0, r20, r7.presentationTimeUs, r7.flags);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0e6f, code lost:
        if (r0.A01 == 0) goto L_0x0e73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0e71, code lost:
        if (r2 >= 0) goto L_0x0e79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0e73, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder/queue/input");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0e79, code lost:
        r0.A01++;
        r5 = r7.presentationTimeUs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0e84, code lost:
        if (r5 <= 0) goto L_0x0e8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0e86, code lost:
        r0.A02 = r5 - r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0e8c, code lost:
        if (r21 <= 0) goto L_0x0eb2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0e8e, code lost:
        r3 = r21 * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0e92, code lost:
        if (r5 <= r3) goto L_0x0eb2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0e94, code lost:
        r15 = new java.lang.StringBuilder();
        r15.append("videotranscoder/transcode/end time detected ");
        r15.append(r5);
        r15.append(" ");
        r15.append(r3);
        com.whatsapp.util.Log.i(r15.toString());
        r65 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0eb2, code lost:
        r65 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0eb6, code lost:
        if (r23 <= 0) goto L_0x0f1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0eba, code lost:
        if (r25 > 0) goto L_0x0ebe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0ebc, code lost:
        r29 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0ec0, code lost:
        if (r21 > 0) goto L_0x0ec7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0ec2, code lost:
        r14 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0ec7, code lost:
        r14 = r21 * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0eca, code lost:
        r5 = (int) (((r7.presentationTimeUs - r29) * 100) / (r14 - r29));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0ed5, code lost:
        if (r5 == r64) goto L_0x0f1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0ed9, code lost:
        if (r0.A04 == null) goto L_0x0f1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0edd, code lost:
        if (r0.A0K != false) goto L_0x0ee8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0edf, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0ee6, code lost:
        if (r0.A04.AVN(r5) == false) goto L_0x0ee9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0ee8, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0ee9, code lost:
        r0.A0K = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0eec, code lost:
        if (r5 < 5) goto L_0x0ef2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0ef0, code lost:
        if ((r5 % 5) != 0) goto L_0x0f1e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0ef2, code lost:
        r6 = new java.lang.StringBuilder();
        r6.append("videotranscoder/transcode/progress ");
        r6.append(r5);
        r6.append(" frames:");
        r6.append(r0.A01);
        r6.append(" duration:");
        r6.append(r0.A02);
        com.whatsapp.util.Log.i(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0f1c, code lost:
        r5 = r64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0f1e, code lost:
        r3 = com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0f22, code lost:
        r5 = r64;
        r3 = com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS;
        r62 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0f29, code lost:
        r11 = r43;
        r6 = r46.dequeueOutputBuffer(r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0f31, code lost:
        if (r2 >= 0) goto L_0x0f48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0f33, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/encoder/dequeue/output ");
        r4.append(r6);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0f48, code lost:
        if (r6 < 0) goto L_0x0f6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0f4a, code lost:
        r4 = r27[r6];
        r4.position(r11.offset);
        r4.limit(r11.offset + r11.size);
        r28.write(r4);
        r4.clear();
        r46.releaseOutputBuffer(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0f67, code lost:
        if (r2 >= 0) goto L_0x0f95;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0f69, code lost:
        r3 = "videotranscoder/transcode/encoder/release/output";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0f6e, code lost:
        if (r6 != -3) goto L_0x0f71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0f72, code lost:
        if (r6 != -2) goto L_0x0f95;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0f74, code lost:
        r6 = r46.getOutputFormat();
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/encoder output format has changed to ");
        r4.append(r6);
        r3 = r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0f8b, code lost:
        r27 = r46.getOutputBuffers();
        r3 = "videotranscoder/transcode/encoder output buffers have changed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0f92, code lost:
        com.whatsapp.util.Log.i(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0f95, code lost:
        if (r62 != false) goto L_0x0fba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0f98, code lost:
        r5 = r64;
        r33 = r33 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0f9c, code lost:
        if (r2 >= 0) goto L_0x0fb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0f9e, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/frame skipped ");
        r4.append(r33);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0fb5, code lost:
        r65 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0fb7, code lost:
        r13.releaseOutputBuffer(r12, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0fba, code lost:
        if (r2 >= 0) goto L_0x10c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0fbe, code lost:
        r5 = r64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0fc1, code lost:
        if (r12 != -3) goto L_0x0fc5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0fc6, code lost:
        if (r12 != -2) goto L_0x10a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0fc8, code lost:
        r4 = A02(r13.getOutputFormat(), r0.A03, r38.getName());
        r0.A05 = r4;
        r74 = r4.A00;
        r15 = r4.A09;
        r1 = r4.A06;
        r30 = r4.A02;
        r29 = r4.A03;
        r14 = r4.A04;
        r12 = r4.A01;
        r6 = r38.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0ff4, code lost:
        if (A07(r6) != false) goto L_0x1012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0ffc, code lost:
        if ("OMX.Intel.VideoEncoder.AVC".equals(r6) != false) goto L_0x1012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x1004, code lost:
        if ("OMX.Intel.VideoDecoder.AVC".equals(r6) != false) goto L_0x1012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x1006, code lost:
        r1 = java.lang.Math.max(r4.A07, r1);
        r15 = java.lang.Math.max(r4.A08, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x1012, code lost:
        if (r8 != null) goto L_0x10bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x1014, code lost:
        r3 = r4.A05;
        com.whatsapp.VideoFrameConverter.configure(r41, r3, r15, r1, r30, r14, r29, r12, r75, r37, r36);
        r6 = new java.lang.StringBuilder();
        r6.append("videotranscoder/transcode/configure frame converter from:(");
        r6.append(r74);
        r6.append("[");
        r6.append(r3);
        r6.append("] ");
        r6.append(r15);
        r6.append(" ");
        r6.append(r1);
        r6.append(" ");
        r6.append(r30);
        r6.append(" ");
        r6.append(r14);
        r6.append(" ");
        r6.append(r29);
        r6.append(" ");
        r6.append(r12);
        r6.append(") to:(");
        r6.append(r78);
        r6.append("[");
        r6.append(r75);
        r6.append("] ");
        r6.append(r37);
        r6.append(" ");
        r6.append(r36);
        r6.append(")");
        r1 = r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x109d, code lost:
        r31 = r13.getOutputBuffers();
        r1 = "videotranscoder/transcode/decoder output buffers have changed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x10a4, code lost:
        com.whatsapp.util.Log.i(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x10a9, code lost:
        if (r12 != -1) goto L_0x10bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x10ab, code lost:
        if (r61 == false) goto L_0x10bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x10b1, code lost:
        if ((r7.flags & 4) != 0) goto L_0x10b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x10b3, code lost:
        com.whatsapp.util.Log.w("videotranscoder/transcode/decoder says try later after extractor finished");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x10b9, code lost:
        r65 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x10bc, code lost:
        r65 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x10bf, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder/release/output");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x10c9, code lost:
        if ((r7.flags & 4) == 0) goto L_0x10d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x10cb, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM");
        r65 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x10d3, code lost:
        r64 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x10d7, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x10dd, code lost:
        throw new java.lang.RuntimeException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:?, code lost:
        r13.stop();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder stopped");
        r13.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder released");
        A05(r43, r46, r28, r27);
        r46.stop();
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder stopped");
        r46.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder released");
        r44.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/extractor released");
        com.whatsapp.VideoFrameConverter.release(r41);
        r3 = new java.lang.StringBuilder();
        r3.append("videotranscoder/transcode/done cancelled:");
        r3.append(r0.A0K);
        r3.append(" frames:");
        r3.append(r0.A01);
        r3.append(" size:");
        r3.append(r0.A09.length());
        r3.append(" duration:");
        r3.append(r0.A02);
        r3.append(" skipfirstframes:");
        r3.append(r33);
        com.whatsapp.util.Log.i(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x1150, code lost:
        if (r28 == null) goto L_0x1155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:?, code lost:
        r28.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x115a, code lost:
        if (r0.A0K != false) goto L_0x116c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x1164, code lost:
        if (r0.A09.length() == 0) goto L_0x12e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x116a, code lost:
        if (r0.A01 == 0) goto L_0x12e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x1170, code lost:
        if (r0.A02 != 0) goto L_0x117f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x1172, code lost:
        r0.A02 = java.util.concurrent.TimeUnit.SECONDS.toMicros(r0.A01) / 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x117f, code lost:
        r3 = new java.lang.StringBuilder("videotranscoder/transcode/finished: size:");
        r3.append(r0.A09.length());
        com.whatsapp.util.Log.i(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x119d, code lost:
        if (r0.A08.exists() == false) goto L_0x1275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x11a1, code lost:
        if (r0.A0K != false) goto L_0x120a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x11a3, code lost:
        r4 = X.AnonymousClass1QS.A04(r0.A08, false);
        r3 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x11ad, code lost:
        if (r3 == 2) goto L_0x11b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x11b0, code lost:
        if (r3 != 3) goto L_0x11c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x11b2, code lost:
        r3 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x11b5, code lost:
        if (r3 == 4) goto L_0x120a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x11b7, code lost:
        if (r3 == 2) goto L_0x120a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x11ba, code lost:
        if (r3 == 1) goto L_0x120a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x11bc, code lost:
        if (r3 == 0) goto L_0x120a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x11c0, code lost:
        if (r3 != 8) goto L_0x11c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append(r79.getAbsoluteFile());
        r2.append(".aac");
        r2 = new java.io.File(r2.toString());
        r0.A07 = r2;
        r3 = new X.AnonymousClass4NM(r0.A08, r2);
        r3.A01 = r25;
        r3.A02 = r21;
        r3.A00 = 96000;
        r4 = new X.C43311zn(r3);
        r4.A01 = new com.facebook.redex.IDxListenerShape345S0100000_2_I0(r0, 3);
        r4.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x1209, code lost:
        throw new X.C42071xB();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x120c, code lost:
        if (r0.A0K != false) goto L_0x1261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:?, code lost:
        r3 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x1212, code lost:
        if (r3 <= 0) goto L_0x121a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x1214, code lost:
        r18 = (r0.A01 * 1000000000) / r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x121a, code lost:
        r1 = r0.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x121c, code lost:
        if (r1 == null) goto L_0x1255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x1222, code lost:
        if (r1.exists() == false) goto L_0x1253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x1224, code lost:
        r5 = r0.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x1226, code lost:
        com.whatsapp.Mp4Ops.A02(r79, r5, r0.A09, r0.A08, new X.C42061xA(r0.A08).A01(), r9, r18, r0.A02 / 1000, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x1253, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x1255, code lost:
        r5 = r0.A08;
        r9 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:?, code lost:
        r7 = new java.lang.StringBuilder();
        r7.append("videotranscoder/transcode/input file disappeared, ");
        r8 = r0.A08;
        r6 = new java.lang.StringBuilder("file_path=");
        r6.append(r8.getAbsolutePath());
        r6.append(", ");
        r4 = r8.exists();
        r3 = r8.canRead();
        r2 = r8.canWrite();
        r6.append("exists=");
        r6.append(r4);
        r6.append(", ");
        r6.append("canRead=");
        r6.append(r3);
        r6.append(", ");
        r6.append("canWrite=");
        r6.append(r2);
        r6.append(", ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x12c2, code lost:
        if (r4 == false) goto L_0x12d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x12c4, code lost:
        r6.append("length=");
        r6.append(r8.length());
        r6.append(", ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x12d3, code lost:
        r7.append(r6.toString());
        com.whatsapp.util.Log.e(r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x12e8, code lost:
        throw new java.io.FileNotFoundException("input file missing after transcode");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x12ee, code lost:
        throw new X.C42071xB();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x12ef, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:?, code lost:
        com.whatsapp.util.Log.e("videotranscoder/transcode", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x12f6, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x12f7, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:?, code lost:
        r13.stop();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder stopped");
        r13.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder released");
        A05(r43, r46, r28, r27);
        r46.stop();
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder stopped");
        r46.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder released");
        r44.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/extractor released");
        com.whatsapp.VideoFrameConverter.release(r41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x1324, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x1325, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("videotranscoder/transcode/can't create decoder for ");
        r1.append(r11);
        com.whatsapp.util.Log.e(r1.toString());
        r2 = new java.lang.StringBuilder();
        r2.append("Can't create decoder for ");
        r2.append(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x134d, code lost:
        throw new java.io.FileNotFoundException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x134e, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("videotranscoder/transcode/can't create decoder for ");
        r1.append(r11);
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x1365, code lost:
        throw new X.C42071xB();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x1366, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("videotranscoder/transcode/can't create decoder for ");
        r1.append(r11);
        com.whatsapp.util.Log.e(r1.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x137e, code lost:
        throw new X.C42071xB();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x137f, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/mime ");
        r2.append(r11);
        com.whatsapp.util.Log.e(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x1399, code lost:
        throw new X.C42071xB();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x13a6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x13a7, code lost:
        if (r28 != null) goto L_0x13a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:?, code lost:
        r28.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:190:0x0744 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:195:0x0749 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:294:0x0b0c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:534:0x1204 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:596:0x13ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:601:0x13b1 */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x126a  */
    /* JADX WARNING: Removed duplicated region for block: B:562:0x1271  */
    /* JADX WARNING: Removed duplicated region for block: B:651:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x03e6 A[Catch:{ Exception -> 0x05f9, all -> 0x06eb, all -> 0x073e }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:161:0x0656=Splitter:B:161:0x0656, B:195:0x0749=Splitter:B:195:0x0749} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:601:0x13b1=Splitter:B:601:0x13b1, B:534:0x1204=Splitter:B:534:0x1204, B:175:0x06e5=Splitter:B:175:0x06e5, B:505:0x1155=Splitter:B:505:0x1155} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r80 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0 = r80
            java.io.File r1 = r0.A0J
            r79 = r1
            java.io.File r1 = r79.getAbsoluteFile()
            r2.append(r1)
            java.lang.String r1 = ".h264"
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            r0.A09 = r1
            java.io.File r1 = r0.A08     // Catch:{ all -> 0x13ce }
            X.C41911wr.A04(r1)     // Catch:{ IOException -> 0x0028 }
            goto L_0x002a
        L_0x0028:
            r1 = 0
            goto L_0x002b
        L_0x002a:
            r1 = 1
        L_0x002b:
            r16 = 1000(0x3e8, double:4.94E-321)
            r39 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            java.lang.String r57 = "videotranscodequeue/libmp4muxexception"
            r18 = 30000(0x7530, double:1.4822E-319)
            r9 = 0
            if (r1 == 0) goto L_0x076c
            java.lang.String r29 = " duration:"
            java.lang.String r24 = " frames:"
            java.lang.String r28 = "videotranscoder/transcode/encoder released"
            java.lang.String r27 = "videotranscoder/transcode/encoder stopped"
            java.lang.String r25 = "videotranscoder/transcode/encoder draining "
            java.lang.String r26 = "videotranscoder/transcode/encoder drained"
            java.lang.String r7 = "videotranscoder/transcode/encoder "
            java.lang.String r8 = "video/avc"
            java.lang.String r6 = "x"
            java.lang.String r1 = " "
            r0.A02 = r9     // Catch:{ all -> 0x13ce }
            r0.A01 = r9     // Catch:{ all -> 0x13ce }
            java.io.File r4 = r0.A08     // Catch:{ all -> 0x13ce }
            r3 = 0
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r4, r2)     // Catch:{ all -> 0x13ce }
            X.1wr r30 = X.C41911wr.A01(r2, r3)     // Catch:{ all -> 0x13ce }
            java.lang.String r2 = "videotranscoder/transcode/gif decoder created"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0766 }
            r2 = r30
            com.facebook.animated.gif.GifImage r2 = r2.A01     // Catch:{ all -> 0x0766 }
            r70 = r2
            int r23 = r70.getWidth()     // Catch:{ all -> 0x0766 }
            int r22 = r70.getHeight()     // Catch:{ all -> 0x0766 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0766 }
            r3.<init>()     // Catch:{ all -> 0x0766 }
            java.lang.String r2 = "videotranscoder/transcode/gif "
            r3.append(r2)     // Catch:{ all -> 0x0766 }
            r2 = r23
            r3.append(r2)     // Catch:{ all -> 0x0766 }
            r3.append(r6)     // Catch:{ all -> 0x0766 }
            r2 = r22
            r3.append(r2)     // Catch:{ all -> 0x0766 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0766 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0766 }
            r3 = r22
            r2 = r23
        L_0x009c:
            r4 = 128(0x80, float:1.794E-43)
            if (r2 < r4) goto L_0x00a3
            if (r3 < r4) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            int r2 = r2 << 1
            int r3 = r3 << 1
            goto L_0x009c
        L_0x00a8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0766 }
            r4.<init>()     // Catch:{ all -> 0x0766 }
            r4.append(r7)     // Catch:{ all -> 0x0766 }
            r4.append(r2)     // Catch:{ all -> 0x0766 }
            r4.append(r6)     // Catch:{ all -> 0x0766 }
            r4.append(r3)     // Catch:{ all -> 0x0766 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0766 }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0766 }
            if (r2 <= r3) goto L_0x00c3
            goto L_0x00cd
        L_0x00c3:
            int r4 = r0.A0C     // Catch:{ all -> 0x0766 }
            if (r3 <= r4) goto L_0x00d6
            int r2 = r23 * r4
            int r2 = r2 / r22
            r3 = r4
            goto L_0x00d6
        L_0x00cd:
            int r4 = r0.A0C     // Catch:{ all -> 0x0766 }
            if (r2 <= r4) goto L_0x00d6
            int r3 = r22 * r4
            int r3 = r3 / r23
            r2 = r4
        L_0x00d6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0766 }
            r4.<init>()     // Catch:{ all -> 0x0766 }
            r4.append(r7)     // Catch:{ all -> 0x0766 }
            r4.append(r2)     // Catch:{ all -> 0x0766 }
            r4.append(r6)     // Catch:{ all -> 0x0766 }
            r4.append(r3)     // Catch:{ all -> 0x0766 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0766 }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0766 }
            int r4 = r2 * r3
            float r11 = (float) r4     // Catch:{ all -> 0x0766 }
            r5 = 1209401344(0x48160000, float:153600.0)
            float r5 = r5 / r11
            r4 = 1092616192(0x41200000, float:10.0)
            float r5 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x0766 }
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = java.lang.Math.max(r4, r5)     // Catch:{ all -> 0x0766 }
            float r11 = r11 * r4
            int r4 = (int) r11     // Catch:{ all -> 0x0766 }
            X.0pd r12 = r0.A0H     // Catch:{ all -> 0x0766 }
            r11 = 422(0x1a6, float:5.91E-43)
            X.0tM r5 = X.C16620tM.A02     // Catch:{ all -> 0x0766 }
            boolean r5 = r12.A0E(r5, r11)     // Catch:{ all -> 0x0766 }
            android.media.MediaCodecInfo r14 = X.AnonymousClass1QT.A02(r5)     // Catch:{ all -> 0x0766 }
            if (r14 == 0) goto L_0x074a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0766 }
            r11.<init>()     // Catch:{ all -> 0x0766 }
            java.lang.String r5 = "videotranscoder/transcode/found "
            r11.append(r5)     // Catch:{ all -> 0x0766 }
            java.lang.String r5 = r14.getName()     // Catch:{ all -> 0x0766 }
            r11.append(r5)     // Catch:{ all -> 0x0766 }
            java.lang.String r5 = " supporting "
            r11.append(r5)     // Catch:{ all -> 0x0766 }
            r11.append(r8)     // Catch:{ all -> 0x0766 }
            java.lang.String r5 = r11.toString()     // Catch:{ all -> 0x0766 }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x0766 }
            int r43 = X.AnonymousClass1QT.A01(r14)     // Catch:{ all -> 0x0766 }
            if (r43 == 0) goto L_0x0758
            java.lang.String r42 = r14.getName()     // Catch:{ all -> 0x0766 }
            java.lang.String r11 = r14.getName()     // Catch:{ all -> 0x0766 }
            java.lang.String r5 = "OMX.qcom.video.encoder.avc"
            boolean r5 = r11.equals(r5)     // Catch:{ all -> 0x0766 }
            r46 = 16
            if (r5 == 0) goto L_0x014d
            r46 = 32
        L_0x014d:
            r11 = 0
            X.4aF r5 = r0.A03     // Catch:{ all -> 0x0766 }
            r35 = 0
            r47 = 0
            r48 = 0
            r41 = r5
            r44 = r2
            r45 = r3
            X.4aT r12 = A03(r41, r42, r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0766 }
            int r5 = r12.A00     // Catch:{ all -> 0x0766 }
            int r3 = r12.A09     // Catch:{ all -> 0x0766 }
            int r2 = r12.A06     // Catch:{ all -> 0x0766 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0766 }
            r13.<init>()     // Catch:{ all -> 0x0766 }
            r13.append(r7)     // Catch:{ all -> 0x0766 }
            r13.append(r3)     // Catch:{ all -> 0x0766 }
            r13.append(r6)     // Catch:{ all -> 0x0766 }
            r13.append(r2)     // Catch:{ all -> 0x0766 }
            java.lang.String r6 = r13.toString()     // Catch:{ all -> 0x0766 }
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ all -> 0x0766 }
            int r6 = r12.A08     // Catch:{ all -> 0x0766 }
            r34 = r6
            int r7 = r6 / 2
            int r6 = r12.A07     // Catch:{ all -> 0x0766 }
            int r34 = r34 * r6
            int r7 = r7 * r6
            int r34 = r34 + r7
            java.lang.String r6 = r14.getName()     // Catch:{ all -> 0x0766 }
            android.media.MediaCodec r7 = android.media.MediaCodec.createByCodecName(r6)     // Catch:{ all -> 0x0766 }
            java.lang.String r6 = "videotranscoder/transcode/encoder created"
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ all -> 0x0766 }
            android.media.MediaFormat r8 = android.media.MediaFormat.createVideoFormat(r8, r3, r2)     // Catch:{ all -> 0x0766 }
            java.lang.String r6 = "bitrate"
            r8.setInteger(r6, r4)     // Catch:{ all -> 0x0766 }
            java.lang.String r6 = "frame-rate"
            r4 = 15
            r8.setInteger(r6, r4)     // Catch:{ all -> 0x0766 }
            java.lang.String r4 = "color-format"
            r8.setInteger(r4, r5)     // Catch:{ all -> 0x0766 }
            java.lang.String r6 = "i-frame-interval"
            r4 = 10
            r8.setInteger(r6, r4)     // Catch:{ all -> 0x0766 }
            java.lang.String r6 = "stride"
            int r4 = r12.A08     // Catch:{ all -> 0x0766 }
            r8.setInteger(r6, r4)     // Catch:{ all -> 0x0766 }
            java.lang.String r6 = "slice-height"
            int r4 = r12.A07     // Catch:{ all -> 0x0766 }
            r8.setInteger(r6, r4)     // Catch:{ all -> 0x0766 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0766 }
            r6.<init>()     // Catch:{ all -> 0x0766 }
            java.lang.String r4 = "videotranscoder/transcode/configure encoder with output format "
            r6.append(r4)     // Catch:{ all -> 0x0766 }
            r6.append(r8)     // Catch:{ all -> 0x0766 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0766 }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0766 }
            r6 = 0
            r4 = 1
            r7.configure(r8, r6, r6, r4)     // Catch:{ all -> 0x0766 }
            java.lang.String r4 = "videotranscoder/transcode/encoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0766 }
            r7.start()     // Catch:{ all -> 0x0766 }
            java.lang.String r4 = "videotranscoder/transcode/encoder started"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0766 }
            int r6 = r12.A05     // Catch:{ all -> 0x0766 }
            java.nio.ByteBuffer[] r43 = r7.getInputBuffers()     // Catch:{ all -> 0x0766 }
            java.nio.ByteBuffer[] r32 = r7.getOutputBuffers()     // Catch:{ all -> 0x0766 }
            java.io.File r8 = r0.A09     // Catch:{ all -> 0x0766 }
            java.io.FileOutputStream r31 = new java.io.FileOutputStream     // Catch:{ all -> 0x0766 }
            r4 = r31
            r4.<init>(r8)     // Catch:{ all -> 0x0766 }
            java.nio.channels.FileChannel r33 = r31.getChannel()     // Catch:{ all -> 0x0745 }
            android.media.MediaCodec$BufferInfo r4 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x073e }
            r4.<init>()     // Catch:{ all -> 0x073e }
            long r20 = com.whatsapp.VideoFrameConverter.create()     // Catch:{ all -> 0x073e }
            X.3Bj r8 = r0.A06     // Catch:{ all -> 0x073e }
            if (r8 == 0) goto L_0x0230
            java.util.List r8 = r8.A06     // Catch:{ all -> 0x073e }
            java.util.Iterator r12 = r8.iterator()     // Catch:{ all -> 0x073e }
        L_0x0218:
            boolean r8 = r12.hasNext()     // Catch:{ all -> 0x073e }
            if (r8 == 0) goto L_0x022d
            java.lang.Object r8 = r12.next()     // Catch:{ all -> 0x073e }
            X.29l r8 = (X.C455829l) r8     // Catch:{ all -> 0x073e }
            boolean r8 = r8.A0L()     // Catch:{ all -> 0x073e }
            if (r8 == 0) goto L_0x0218
            r46 = 1
            goto L_0x0237
        L_0x022d:
            r46 = 0
            goto L_0x0237
        L_0x0230:
            r48 = 0
            r47 = 0
            r46 = 0
            goto L_0x026d
        L_0x0237:
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x073e }
            android.graphics.Bitmap r47 = android.graphics.Bitmap.createBitmap(r3, r2, r8)     // Catch:{ all -> 0x073e }
            X.3Bj r12 = r0.A06     // Catch:{ all -> 0x073e }
            r8 = r47
            r12.A06(r11, r8)     // Catch:{ all -> 0x073e }
            int r11 = r47.getWidth()     // Catch:{ all -> 0x073e }
            int r8 = r47.getHeight()     // Catch:{ all -> 0x073e }
            int r11 = r11 * r8
            int r8 = r11 << 2
            java.nio.ByteBuffer r48 = java.nio.ByteBuffer.allocateDirect(r8)     // Catch:{ all -> 0x073e }
            r11 = r47
            r8 = r48
            r11.copyPixelsToBuffer(r8)     // Catch:{ all -> 0x073e }
            int r54 = r47.getWidth()     // Catch:{ all -> 0x073e }
            int r55 = r47.getHeight()     // Catch:{ all -> 0x073e }
            r52 = 0
            r53 = 0
            r49 = r20
            r51 = r8
            com.whatsapp.VideoFrameConverter.setOverlay(r49, r51, r52, r53, r54, r55)     // Catch:{ all -> 0x073e }
        L_0x026d:
            int r11 = r23 + -1
            int r45 = r22 + -1
            r60 = 7
            r8 = 0
            r63 = 0
            r64 = 0
            r58 = r20
            r61 = r23
            r62 = r22
            r65 = r11
            r66 = r45
            r67 = r6
            r68 = r3
            r69 = r2
            com.whatsapp.VideoFrameConverter.configure(r58, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)     // Catch:{ all -> 0x073e }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x073e }
            r12.<init>()     // Catch:{ all -> 0x073e }
            java.lang.String r13 = "videotranscoder/transcode/configure frame converter from:([7] "
            r12.append(r13)     // Catch:{ all -> 0x073e }
            r13 = r23
            r12.append(r13)     // Catch:{ all -> 0x073e }
            r12.append(r1)     // Catch:{ all -> 0x073e }
            r13 = r22
            r12.append(r13)     // Catch:{ all -> 0x073e }
            r12.append(r1)     // Catch:{ all -> 0x073e }
            r12.append(r8)     // Catch:{ all -> 0x073e }
            r12.append(r1)     // Catch:{ all -> 0x073e }
            r12.append(r8)     // Catch:{ all -> 0x073e }
            r12.append(r1)     // Catch:{ all -> 0x073e }
            r12.append(r11)     // Catch:{ all -> 0x073e }
            r12.append(r1)     // Catch:{ all -> 0x073e }
            r11 = r45
            r12.append(r11)     // Catch:{ all -> 0x073e }
            java.lang.String r11 = ") to:("
            r12.append(r11)     // Catch:{ all -> 0x073e }
            r12.append(r5)     // Catch:{ all -> 0x073e }
            java.lang.String r5 = "["
            r12.append(r5)     // Catch:{ all -> 0x073e }
            r12.append(r6)     // Catch:{ all -> 0x073e }
            java.lang.String r5 = "] "
            r12.append(r5)     // Catch:{ all -> 0x073e }
            r12.append(r3)     // Catch:{ all -> 0x073e }
            r12.append(r1)     // Catch:{ all -> 0x073e }
            r12.append(r2)     // Catch:{ all -> 0x073e }
            java.lang.String r1 = ")"
            r12.append(r1)     // Catch:{ all -> 0x073e }
            java.lang.String r1 = r12.toString()     // Catch:{ all -> 0x073e }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x073e }
            int r44 = r70.getFrameCount()     // Catch:{ Exception -> 0x05f9 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05f9 }
            r2.<init>()     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r1 = "videotranscoder/transcode/gif frames:"
            r2.append(r1)     // Catch:{ Exception -> 0x05f9 }
            r1 = r44
            r2.append(r1)     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x05f9 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x05f9 }
            int r42 = r23 * 3
            int r41 = r42 * r22
            java.nio.ByteBuffer r38 = java.nio.ByteBuffer.allocateDirect(r41)     // Catch:{ Exception -> 0x05f9 }
            r3 = 0
            r1 = 0
            r62 = 0
        L_0x030e:
            r2 = r44
            if (r1 >= r2) goto L_0x05ba
            int[] r2 = r70.getFrameDurations()     // Catch:{ Exception -> 0x05f9 }
            r15 = r2[r1]     // Catch:{ Exception -> 0x05f9 }
            r5 = 70
            if (r1 <= 0) goto L_0x0375
            int r11 = r3 + r15
            if (r11 > r5) goto L_0x0375
            int r2 = r44 + -1
            if (r1 != r2) goto L_0x05b4
            java.lang.String r3 = "videotranscoder/handleLastFrame/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05f9 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x05f9 }
            r2.append(r1)     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x05f9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x05f9 }
            r2 = 1000000(0xf4240, double:4.940656E-318)
            int r50 = r7.dequeueInputBuffer(r2)     // Catch:{ Exception -> 0x05f9 }
            r12 = r43[r50]     // Catch:{ Exception -> 0x05f9 }
            r12.clear()     // Catch:{ Exception -> 0x05f9 }
            r6 = r38
            r2 = r20
            com.whatsapp.VideoFrameConverter.convertFrame(r2, r6, r12)     // Catch:{ Exception -> 0x05f9 }
            int[] r2 = r70.getFrameDurations()     // Catch:{ Exception -> 0x05f9 }
            r2 = r2[r1]     // Catch:{ Exception -> 0x05f9 }
            if (r2 >= r5) goto L_0x0353
            r2 = 70
        L_0x0353:
            int r2 = r2 * 1000
            long r5 = (long) r2     // Catch:{ Exception -> 0x05f9 }
            long r2 = r62 + r5
            r55 = 4
            r51 = 0
            r49 = r7
            r52 = r34
            r53 = r2
            r49.queueInputBuffer(r50, r51, r52, r53, r55)     // Catch:{ Exception -> 0x05f9 }
            long r5 = r0.A01     // Catch:{ Exception -> 0x05f9 }
            r12 = 1
            long r5 = r5 + r12
            r0.A01 = r5     // Catch:{ Exception -> 0x05f9 }
            long r5 = r0.A0D     // Catch:{ Exception -> 0x05f9 }
            long r5 = r5 * r16
            long r2 = r2 - r5
            r0.A02 = r2     // Catch:{ Exception -> 0x05f9 }
            goto L_0x05b4
        L_0x0375:
            r2 = r30
            android.graphics.Bitmap r49 = r2.A05(r1)     // Catch:{ Exception -> 0x05f9 }
            int r2 = r23 * r22
            int[] r6 = new int[r2]     // Catch:{ Exception -> 0x05f9 }
            r37 = r6
            r51 = 0
            r53 = 0
            r54 = 0
            r55 = r23
            r50 = r6
            r52 = r23
            r56 = r22
            r49.getPixels(r50, r51, r52, r53, r54, r55, r56)     // Catch:{ Exception -> 0x05f9 }
            int r6 = r2 * 3
            byte[] r13 = new byte[r6]     // Catch:{ Exception -> 0x05f9 }
            r12 = 0
        L_0x0397:
            if (r12 >= r2) goto L_0x03b7
            r6 = r37[r12]     // Catch:{ Exception -> 0x05f9 }
            int r11 = r6 >> 16
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r14 = (byte) r11     // Catch:{ Exception -> 0x05f9 }
            int r11 = r6 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x05f9 }
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6     // Catch:{ Exception -> 0x05f9 }
            int r36 = r12 * 3
            r13[r36] = r14     // Catch:{ Exception -> 0x05f9 }
            int r14 = r36 + 1
            r13[r14] = r11     // Catch:{ Exception -> 0x05f9 }
            int r11 = r36 + 2
            r13[r11] = r6     // Catch:{ Exception -> 0x05f9 }
            int r12 = r12 + 1
            goto L_0x0397
        L_0x03b7:
            r2 = r41
            byte[] r12 = new byte[r2]     // Catch:{ Exception -> 0x05f9 }
            r14 = r45
            r11 = 0
        L_0x03be:
            if (r14 < 0) goto L_0x03ce
            int r6 = r14 * 3
            int r6 = r6 * r23
            r2 = r42
            java.lang.System.arraycopy(r13, r6, r12, r11, r2)     // Catch:{ Exception -> 0x05f9 }
            int r11 = r11 + r42
            int r14 = r14 + -1
            goto L_0x03be
        L_0x03ce:
            r2 = r38
            r2.put(r12)     // Catch:{ Exception -> 0x05f9 }
            r2.position(r8)     // Catch:{ Exception -> 0x05f9 }
            if (r1 != 0) goto L_0x03dd
            if (r15 >= r5) goto L_0x0407
            r15 = 70
            goto L_0x0407
        L_0x03dd:
            if (r3 < r5) goto L_0x03e7
            int r2 = r3 * 1000
            long r2 = (long) r2     // Catch:{ Exception -> 0x05f9 }
        L_0x03e2:
            long r62 = r62 + r2
        L_0x03e4:
            if (r1 >= r8) goto L_0x0407
            goto L_0x03f2
        L_0x03e7:
            int r2 = r3 + r15
            if (r2 <= r5) goto L_0x03e4
            int r2 = 70 - r3
            int r15 = r15 - r2
            r2 = 70000(0x11170, double:3.45846E-319)
            goto L_0x03e2
        L_0x03f2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05f9 }
            r3.<init>()     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r2 = "videotranscoder/transcode/loop "
            r3.append(r2)     // Catch:{ Exception -> 0x05f9 }
            r3.append(r1)     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x05f9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x05f9 }
        L_0x0407:
            r2 = 1000000(0xf4240, double:4.940656E-318)
            int r5 = r7.dequeueInputBuffer(r2)     // Catch:{ Exception -> 0x05f9 }
            if (r1 >= r8) goto L_0x0425
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05f9 }
            r3.<init>()     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r2 = "videotranscoder/transcode/encoder/dequeue/input "
            r3.append(r2)     // Catch:{ Exception -> 0x05f9 }
            r3.append(r5)     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x05f9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x05f9 }
        L_0x0425:
            if (r5 < 0) goto L_0x04f6
            r6 = r43[r5]     // Catch:{ Exception -> 0x05f9 }
            r6.clear()     // Catch:{ Exception -> 0x05f9 }
            X.3Bj r2 = r0.A06     // Catch:{ Exception -> 0x05f9 }
            if (r2 == 0) goto L_0x0466
            if (r46 == 0) goto L_0x0466
            java.util.List r2 = r2.A06     // Catch:{ Exception -> 0x05f9 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ Exception -> 0x05f9 }
        L_0x0438:
            boolean r2 = r3.hasNext()     // Catch:{ Exception -> 0x05f9 }
            if (r2 == 0) goto L_0x0442
            r3.next()     // Catch:{ Exception -> 0x05f9 }
            goto L_0x0438
        L_0x0442:
            r2 = r47
            r2.eraseColor(r8)     // Catch:{ Exception -> 0x05f9 }
            X.3Bj r3 = r0.A06     // Catch:{ Exception -> 0x05f9 }
            r3.A06(r8, r2)     // Catch:{ Exception -> 0x05f9 }
            r48.rewind()     // Catch:{ Exception -> 0x05f9 }
            r3 = r2
            r2 = r48
            r3.copyPixelsToBuffer(r2)     // Catch:{ Exception -> 0x05f9 }
            int r54 = r47.getWidth()     // Catch:{ Exception -> 0x05f9 }
            int r55 = r47.getHeight()     // Catch:{ Exception -> 0x05f9 }
            r52 = 0
            r49 = r20
            r51 = r2
            com.whatsapp.VideoFrameConverter.setOverlay(r49, r51, r52, r53, r54, r55)     // Catch:{ Exception -> 0x05f9 }
        L_0x0466:
            r11 = r38
            r2 = r20
            com.whatsapp.VideoFrameConverter.convertFrame(r2, r11, r6)     // Catch:{ Exception -> 0x05f9 }
            long r2 = r0.A01     // Catch:{ Exception -> 0x05f9 }
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0475
            if (r1 >= r8) goto L_0x047b
        L_0x0475:
            java.lang.String r2 = "videotranscoder/transcode/converted"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x05f9 }
        L_0x047b:
            r60 = 0
            r58 = r7
            r59 = r5
            r61 = r34
            r58.queueInputBuffer(r59, r60, r61, r62, r64)     // Catch:{ Exception -> 0x05f9 }
            long r2 = r0.A01     // Catch:{ Exception -> 0x05f9 }
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x048e
            if (r1 >= r8) goto L_0x0494
        L_0x048e:
            java.lang.String r2 = "videotranscoder/transcode/encoder/queue/input"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x05f9 }
        L_0x0494:
            long r2 = r0.A01     // Catch:{ Exception -> 0x05f9 }
            r5 = 1
            long r2 = r2 + r5
            r0.A01 = r2     // Catch:{ Exception -> 0x05f9 }
            long r5 = r0.A0D     // Catch:{ Exception -> 0x05f9 }
            long r5 = r5 * r16
            long r2 = r62 - r5
            r0.A02 = r2     // Catch:{ Exception -> 0x05f9 }
            double r5 = (double) r1     // Catch:{ Exception -> 0x05f9 }
            r2 = r44
            double r2 = (double) r2     // Catch:{ Exception -> 0x05f9 }
            double r5 = r5 / r2
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 * r2
            int r11 = (int) r5     // Catch:{ Exception -> 0x05f9 }
            r2 = r35
            if (r11 == r2) goto L_0x04f6
            X.5Pr r2 = r0.A04     // Catch:{ Exception -> 0x05f9 }
            if (r2 == 0) goto L_0x04f6
            boolean r2 = r0.A0K     // Catch:{ Exception -> 0x05f9 }
            if (r2 != 0) goto L_0x04c1
            X.5Pr r2 = r0.A04     // Catch:{ Exception -> 0x05f9 }
            boolean r3 = r2.AVN(r11)     // Catch:{ Exception -> 0x05f9 }
            r2 = 0
            if (r3 == 0) goto L_0x04c2
        L_0x04c1:
            r2 = 1
        L_0x04c2:
            r0.A0K = r2     // Catch:{ Exception -> 0x05f9 }
            r2 = 5
            if (r11 < r2) goto L_0x04cb
            int r2 = r11 % 5
            if (r2 != 0) goto L_0x04f4
        L_0x04cb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05f9 }
            r5.<init>()     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r2 = "videotranscoder/transcode/progress "
            r5.append(r2)     // Catch:{ Exception -> 0x05f9 }
            r5.append(r11)     // Catch:{ Exception -> 0x05f9 }
            r2 = r24
            r5.append(r2)     // Catch:{ Exception -> 0x05f9 }
            long r2 = r0.A01     // Catch:{ Exception -> 0x05f9 }
            r5.append(r2)     // Catch:{ Exception -> 0x05f9 }
            r2 = r29
            r5.append(r2)     // Catch:{ Exception -> 0x05f9 }
            long r2 = r0.A02     // Catch:{ Exception -> 0x05f9 }
            r5.append(r2)     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x05f9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x05f9 }
        L_0x04f4:
            r35 = r11
        L_0x04f6:
            int r2 = r44 + -1
            if (r1 != r2) goto L_0x054b
            java.lang.String r3 = "videotranscoder/handleLastFrame/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05f9 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x05f9 }
            r2.append(r1)     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x05f9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x05f9 }
            r2 = 1000000(0xf4240, double:4.940656E-318)
            int r50 = r7.dequeueInputBuffer(r2)     // Catch:{ Exception -> 0x05f9 }
            r6 = r43[r50]     // Catch:{ Exception -> 0x05f9 }
            r6.clear()     // Catch:{ Exception -> 0x05f9 }
            r5 = r38
            r2 = r20
            com.whatsapp.VideoFrameConverter.convertFrame(r2, r5, r6)     // Catch:{ Exception -> 0x05f9 }
            int[] r2 = r70.getFrameDurations()     // Catch:{ Exception -> 0x05f9 }
            r3 = r2[r1]     // Catch:{ Exception -> 0x05f9 }
            r2 = 70
            if (r3 >= r2) goto L_0x052b
            r3 = 70
        L_0x052b:
            int r2 = r3 * 1000
            long r5 = (long) r2     // Catch:{ Exception -> 0x05f9 }
            long r2 = r62 + r5
            r55 = 4
            r51 = 0
            r49 = r7
            r52 = r34
            r53 = r2
            r49.queueInputBuffer(r50, r51, r52, r53, r55)     // Catch:{ Exception -> 0x05f9 }
            long r5 = r0.A01     // Catch:{ Exception -> 0x05f9 }
            r11 = 1
            long r5 = r5 + r11
            r0.A01 = r5     // Catch:{ Exception -> 0x05f9 }
            long r5 = r0.A0D     // Catch:{ Exception -> 0x05f9 }
            long r5 = r5 * r16
            long r2 = r2 - r5
            r0.A02 = r2     // Catch:{ Exception -> 0x05f9 }
        L_0x054b:
            r2 = 1000000(0xf4240, double:4.940656E-318)
            int r5 = r7.dequeueOutputBuffer(r4, r2)     // Catch:{ Exception -> 0x05f9 }
            if (r1 >= r8) goto L_0x0569
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05f9 }
            r3.<init>()     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r2 = "videotranscoder/transcode/encoder/dequeue/output "
            r3.append(r2)     // Catch:{ Exception -> 0x05f9 }
            r3.append(r5)     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x05f9 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x05f9 }
        L_0x0569:
            if (r5 < 0) goto L_0x0588
            r3 = r32[r5]     // Catch:{ Exception -> 0x05f9 }
            int r2 = r4.offset     // Catch:{ Exception -> 0x05f9 }
            r3.position(r2)     // Catch:{ Exception -> 0x05f9 }
            int r6 = r4.offset     // Catch:{ Exception -> 0x05f9 }
            int r2 = r4.size     // Catch:{ Exception -> 0x05f9 }
            int r6 = r6 + r2
            r3.limit(r6)     // Catch:{ Exception -> 0x05f9 }
            r2 = r33
            r2.write(r3)     // Catch:{ Exception -> 0x05f9 }
            r3.clear()     // Catch:{ Exception -> 0x05f9 }
            r7.releaseOutputBuffer(r5, r8)     // Catch:{ Exception -> 0x05f9 }
            if (r1 >= r8) goto L_0x05b5
            goto L_0x05ad
        L_0x0588:
            r2 = -3
            if (r5 != r2) goto L_0x0593
            java.nio.ByteBuffer[] r32 = r7.getOutputBuffers()     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r2 = "videotranscoder/transcode/encoder output buffers have changed"
            goto L_0x05b0
        L_0x0593:
            r2 = -2
            if (r5 != r2) goto L_0x05b5
            android.media.MediaFormat r5 = r7.getOutputFormat()     // Catch:{ Exception -> 0x05f9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05f9 }
            r3.<init>()     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r2 = "videotranscoder/transcode/encoder output format has changed to "
            r3.append(r2)     // Catch:{ Exception -> 0x05f9 }
            r3.append(r5)     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x05f9 }
            goto L_0x05b0
        L_0x05ad:
            java.lang.String r2 = "videotranscoder/transcode/encoder/release/output"
        L_0x05b0:
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x05f9 }
            goto L_0x05b5
        L_0x05b4:
            r15 = r11
        L_0x05b5:
            int r1 = r1 + 1
            r3 = r15
            goto L_0x030e
        L_0x05ba:
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = r7.dequeueOutputBuffer(r4, r1)     // Catch:{ all -> 0x073e }
        L_0x05c1:
            if (r2 < 0) goto L_0x063f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x073e }
            r3.<init>()     // Catch:{ all -> 0x073e }
            r1 = r25
            r3.append(r1)     // Catch:{ all -> 0x073e }
            r3.append(r2)     // Catch:{ all -> 0x073e }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x073e }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x073e }
            r3 = r32[r2]     // Catch:{ all -> 0x073e }
            int r1 = r4.offset     // Catch:{ all -> 0x073e }
            r3.position(r1)     // Catch:{ all -> 0x073e }
            int r5 = r4.offset     // Catch:{ all -> 0x073e }
            int r1 = r4.size     // Catch:{ all -> 0x073e }
            int r5 = r5 + r1
            r3.limit(r5)     // Catch:{ all -> 0x073e }
            r1 = r33
            r1.write(r3)     // Catch:{ all -> 0x073e }
            r3.clear()     // Catch:{ all -> 0x073e }
            r7.releaseOutputBuffer(r2, r8)     // Catch:{ all -> 0x073e }
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = r7.dequeueOutputBuffer(r4, r1)     // Catch:{ all -> 0x073e }
            goto L_0x05c1
        L_0x05f9:
            r2 = move-exception
            java.lang.String r1 = "videotranscoder/transcode"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x06eb }
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = r7.dequeueOutputBuffer(r4, r1)     // Catch:{ all -> 0x073e }
        L_0x0607:
            if (r2 < 0) goto L_0x063f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x073e }
            r3.<init>()     // Catch:{ all -> 0x073e }
            r1 = r25
            r3.append(r1)     // Catch:{ all -> 0x073e }
            r3.append(r2)     // Catch:{ all -> 0x073e }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x073e }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x073e }
            r3 = r32[r2]     // Catch:{ all -> 0x073e }
            int r1 = r4.offset     // Catch:{ all -> 0x073e }
            r3.position(r1)     // Catch:{ all -> 0x073e }
            int r5 = r4.offset     // Catch:{ all -> 0x073e }
            int r1 = r4.size     // Catch:{ all -> 0x073e }
            int r5 = r5 + r1
            r3.limit(r5)     // Catch:{ all -> 0x073e }
            r1 = r33
            r1.write(r3)     // Catch:{ all -> 0x073e }
            r3.clear()     // Catch:{ all -> 0x073e }
            r7.releaseOutputBuffer(r2, r8)     // Catch:{ all -> 0x073e }
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = r7.dequeueOutputBuffer(r4, r1)     // Catch:{ all -> 0x073e }
            goto L_0x0607
        L_0x063f:
            com.whatsapp.util.Log.i((java.lang.String) r26)     // Catch:{ all -> 0x073e }
            r7.stop()     // Catch:{ all -> 0x073e }
            com.whatsapp.util.Log.i((java.lang.String) r27)     // Catch:{ all -> 0x073e }
            r7.release()     // Catch:{ all -> 0x073e }
            com.whatsapp.util.Log.i((java.lang.String) r28)     // Catch:{ all -> 0x073e }
            com.whatsapp.VideoFrameConverter.release(r20)     // Catch:{ all -> 0x073e }
            if (r33 == 0) goto L_0x0656
            r33.close()     // Catch:{ all -> 0x0745 }
        L_0x0656:
            r31.close()     // Catch:{ all -> 0x0766 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0766 }
            r3.<init>()     // Catch:{ all -> 0x0766 }
            java.lang.String r1 = "videotranscoder/transcode/done cancelled:"
            r3.append(r1)     // Catch:{ all -> 0x0766 }
            boolean r1 = r0.A0K     // Catch:{ all -> 0x0766 }
            r3.append(r1)     // Catch:{ all -> 0x0766 }
            r1 = r24
            r3.append(r1)     // Catch:{ all -> 0x0766 }
            long r1 = r0.A01     // Catch:{ all -> 0x0766 }
            r3.append(r1)     // Catch:{ all -> 0x0766 }
            java.lang.String r1 = " size:"
            r3.append(r1)     // Catch:{ all -> 0x0766 }
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x0766 }
            long r1 = r1.length()     // Catch:{ all -> 0x0766 }
            r3.append(r1)     // Catch:{ all -> 0x0766 }
            r1 = r29
            r3.append(r1)     // Catch:{ all -> 0x0766 }
            long r1 = r0.A02     // Catch:{ all -> 0x0766 }
            r3.append(r1)     // Catch:{ all -> 0x0766 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0766 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0766 }
            r30.close()     // Catch:{ all -> 0x13ce }
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x13ce }
            long r2 = r1.length()     // Catch:{ all -> 0x13ce }
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x06e5
            long r1 = r0.A02     // Catch:{ all -> 0x13ce }
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x06e5
            java.lang.String r1 = "videotranscoder/transcode/finished: size:"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x13ce }
            r3.<init>(r1)     // Catch:{ all -> 0x13ce }
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x13ce }
            long r1 = r1.length()     // Catch:{ all -> 0x13ce }
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x13ce }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13ce }
            boolean r1 = r0.A0K     // Catch:{ all -> 0x13ce }
            if (r1 != 0) goto L_0x1261
            long r1 = r0.A02     // Catch:{ 20O -> 0x125a }
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x06cd
            long r3 = r0.A01     // Catch:{ 20O -> 0x125a }
            long r18 = r3 * r39
            long r18 = r18 / r1
        L_0x06cd:
            r6 = 0
            java.io.File r4 = r0.A09     // Catch:{ 20O -> 0x125a }
            java.io.File r3 = r0.A08     // Catch:{ 20O -> 0x125a }
            long r1 = r1 / r16
            r9 = 0
            r10 = 0
            r16 = 0
            r5 = r79
            r7 = r4
            r8 = r3
            r12 = r18
            r14 = r1
            com.whatsapp.Mp4Ops.A02(r5, r6, r7, r8, r9, r10, r12, r14, r16)     // Catch:{ 20O -> 0x125a }
            goto L_0x124c
        L_0x06e5:
            X.1xB r1 = new X.1xB     // Catch:{ all -> 0x13ce }
            r1.<init>()     // Catch:{ all -> 0x13ce }
            throw r1     // Catch:{ all -> 0x13ce }
        L_0x06eb:
            r6 = move-exception
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r3 = r7.dequeueOutputBuffer(r4, r1)     // Catch:{ all -> 0x073e }
        L_0x06f3:
            if (r3 < 0) goto L_0x072b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x073e }
            r2.<init>()     // Catch:{ all -> 0x073e }
            r1 = r25
            r2.append(r1)     // Catch:{ all -> 0x073e }
            r2.append(r3)     // Catch:{ all -> 0x073e }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x073e }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x073e }
            r5 = r32[r3]     // Catch:{ all -> 0x073e }
            int r1 = r4.offset     // Catch:{ all -> 0x073e }
            r5.position(r1)     // Catch:{ all -> 0x073e }
            int r2 = r4.offset     // Catch:{ all -> 0x073e }
            int r1 = r4.size     // Catch:{ all -> 0x073e }
            int r2 = r2 + r1
            r5.limit(r2)     // Catch:{ all -> 0x073e }
            r1 = r33
            r1.write(r5)     // Catch:{ all -> 0x073e }
            r5.clear()     // Catch:{ all -> 0x073e }
            r7.releaseOutputBuffer(r3, r8)     // Catch:{ all -> 0x073e }
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r3 = r7.dequeueOutputBuffer(r4, r1)     // Catch:{ all -> 0x073e }
            goto L_0x06f3
        L_0x072b:
            com.whatsapp.util.Log.i((java.lang.String) r26)     // Catch:{ all -> 0x073e }
            r7.stop()     // Catch:{ all -> 0x073e }
            com.whatsapp.util.Log.i((java.lang.String) r27)     // Catch:{ all -> 0x073e }
            r7.release()     // Catch:{ all -> 0x073e }
            com.whatsapp.util.Log.i((java.lang.String) r28)     // Catch:{ all -> 0x073e }
            com.whatsapp.VideoFrameConverter.release(r20)     // Catch:{ all -> 0x073e }
            throw r6     // Catch:{ all -> 0x073e }
        L_0x073e:
            r1 = move-exception
            if (r33 == 0) goto L_0x0744
            r33.close()     // Catch:{ all -> 0x0744 }
        L_0x0744:
            throw r1     // Catch:{ all -> 0x0745 }
        L_0x0745:
            r1 = move-exception
            r31.close()     // Catch:{ all -> 0x0749 }
        L_0x0749:
            throw r1     // Catch:{ all -> 0x0766 }
        L_0x074a:
            java.lang.String r1 = "videotranscoder/transcode/no codec supporting video/avc"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0766 }
            java.lang.String r1 = "No codec supporting video/avc"
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0766 }
            r2.<init>(r1)     // Catch:{ all -> 0x0766 }
            goto L_0x0765
        L_0x0758:
            java.lang.String r1 = "videotranscoder/transcode/no known color formats suported"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0766 }
            java.lang.String r1 = "No known color formats suported"
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0766 }
            r2.<init>(r1)     // Catch:{ all -> 0x0766 }
        L_0x0765:
            throw r2     // Catch:{ all -> 0x0766 }
        L_0x0766:
            r1 = move-exception
            r30.close()     // Catch:{ all -> 0x13b1 }
            goto L_0x13b1
        L_0x076c:
            java.lang.String r7 = "durationUs"
            java.lang.String r6 = "videotranscoder/transcode/can't create decoder for "
            java.lang.String r56 = " duration:"
            java.io.File r1 = r0.A08     // Catch:{ all -> 0x13ce }
            X.1xA r2 = new X.1xA     // Catch:{ all -> 0x13ce }
            r2.<init>(r1)     // Catch:{ all -> 0x13ce }
            int r5 = r2.A03     // Catch:{ all -> 0x13ce }
            int r4 = r2.A01     // Catch:{ all -> 0x13ce }
            int r8 = r2.A00()     // Catch:{ all -> 0x13ce }
            int r54 = r2.A01()     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = "videotranscoder/transcode/source:"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x13ce }
            r3.<init>(r1)     // Catch:{ all -> 0x13ce }
            java.io.File r1 = r0.A08     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x13ce }
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r55 = " size:"
            r1 = r55
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            java.io.File r1 = r0.A08     // Catch:{ all -> 0x13ce }
            long r1 = r1.length()     // Catch:{ all -> 0x13ce }
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = " bitrate:"
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            r3.append(r8)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = " frame:"
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            r3.append(r5)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = "x"
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            r3.append(r4)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = " rotation:"
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            r1 = r54
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = " from:"
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            long r1 = r0.A0D     // Catch:{ all -> 0x13ce }
            r25 = r1
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = " to:"
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            long r1 = r0.A0E     // Catch:{ all -> 0x13ce }
            r21 = r1
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x13ce }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13ce }
            int r1 = r0.A0C     // Catch:{ all -> 0x13ce }
            android.util.Pair r2 = X.AnonymousClass1QT.A03(r5, r4, r1)     // Catch:{ all -> 0x13ce }
            java.lang.Object r1 = r2.first     // Catch:{ all -> 0x13ce }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x13ce }
            int r44 = r1.intValue()     // Catch:{ all -> 0x13ce }
            java.lang.Object r1 = r2.second     // Catch:{ all -> 0x13ce }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x13ce }
            int r45 = r1.intValue()     // Catch:{ all -> 0x13ce }
            int r2 = r0.A0B     // Catch:{ all -> 0x13ce }
            int r1 = r44 * r45
            float r3 = (float) r1     // Catch:{ all -> 0x13ce }
            float r1 = r0.A00     // Catch:{ all -> 0x13ce }
            float r3 = r3 * r1
            int r1 = (int) r3     // Catch:{ all -> 0x13ce }
            int r2 = java.lang.Math.min(r2, r1)     // Catch:{ all -> 0x13ce }
            X.0pd r1 = r0.A0H     // Catch:{ all -> 0x13ce }
            r30 = r1
            r3 = 422(0x1a6, float:5.91E-43)
            X.0tM r5 = X.C16620tM.A02     // Catch:{ all -> 0x13ce }
            boolean r3 = r1.A0E(r5, r3)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = "video/avc"
            android.media.MediaCodecInfo r38 = X.AnonymousClass1QT.A02(r3)     // Catch:{ all -> 0x13ce }
            if (r38 == 0) goto L_0x13c0
            java.lang.String r3 = "videotranscoder/transcode/found "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x13ce }
            r4.<init>(r3)     // Catch:{ all -> 0x13ce }
            java.lang.String r3 = r38.getName()     // Catch:{ all -> 0x13ce }
            r4.append(r3)     // Catch:{ all -> 0x13ce }
            java.lang.String r3 = " supporting "
            r4.append(r3)     // Catch:{ all -> 0x13ce }
            r4.append(r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x13ce }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x13ce }
            int r43 = X.AnonymousClass1QT.A01(r38)     // Catch:{ all -> 0x13ce }
            if (r43 == 0) goto L_0x13b2
            java.lang.String r42 = r38.getName()     // Catch:{ all -> 0x13ce }
            java.lang.String r4 = r38.getName()     // Catch:{ all -> 0x13ce }
            java.lang.String r3 = "OMX.qcom.video.encoder.avc"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x13ce }
            r46 = 16
            if (r3 == 0) goto L_0x0859
            r46 = 32
        L_0x0859:
            r4 = 0
            X.4aF r3 = r0.A03     // Catch:{ all -> 0x13ce }
            r32 = 0
            r33 = 0
            r47 = 0
            r48 = 0
            r41 = r3
            X.4aT r3 = A03(r41, r42, r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x13ce }
            int r8 = r3.A00     // Catch:{ all -> 0x13ce }
            r78 = r8
            int r8 = r3.A09     // Catch:{ all -> 0x13ce }
            r37 = r8
            int r8 = r3.A06     // Catch:{ all -> 0x13ce }
            r36 = r8
            int r8 = r3.A08     // Catch:{ all -> 0x13ce }
            r20 = r8
            int r11 = r8 >> 1
            int r8 = r3.A07     // Catch:{ all -> 0x13ce }
            int r20 = r20 * r8
            int r11 = r11 * r8
            int r20 = r20 + r11
            java.lang.String r8 = r38.getName()     // Catch:{ all -> 0x13ce }
            android.media.MediaCodec r46 = android.media.MediaCodec.createByCodecName(r8)     // Catch:{ all -> 0x13ce }
            java.lang.String r8 = "videotranscoder/transcode/encoder created"
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ all -> 0x13ce }
            r11 = r37
            r8 = r36
            android.media.MediaFormat r8 = android.media.MediaFormat.createVideoFormat(r1, r11, r8)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = "bitrate"
            r8.setInteger(r1, r2)     // Catch:{ all -> 0x13ce }
            r2 = 30
            java.lang.String r1 = "frame-rate"
            r8.setInteger(r1, r2)     // Catch:{ all -> 0x13ce }
            java.lang.String r2 = "color-format"
            r1 = r78
            r8.setInteger(r2, r1)     // Catch:{ all -> 0x13ce }
            r2 = 10
            java.lang.String r1 = "i-frame-interval"
            r8.setInteger(r1, r2)     // Catch:{ all -> 0x13ce }
            int r2 = r3.A08     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = "stride"
            r8.setInteger(r1, r2)     // Catch:{ all -> 0x13ce }
            int r2 = r3.A07     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = "slice-height"
            r8.setInteger(r1, r2)     // Catch:{ all -> 0x13ce }
            java.lang.String r2 = "videotranscoder/transcode/configure encoder with output format "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x13ce }
            r1.<init>(r2)     // Catch:{ all -> 0x13ce }
            r1.append(r8)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x13ce }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13ce }
            r11 = 0
            r2 = 1
            r1 = r46
            r1.configure(r8, r11, r11, r2)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = "videotranscoder/transcode/encoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13ce }
            r46.start()     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = "videotranscoder/transcode/encoder started"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13ce }
            java.nio.ByteBuffer[] r35 = r46.getInputBuffers()     // Catch:{ all -> 0x13ce }
            java.nio.ByteBuffer[] r27 = r46.getOutputBuffers()     // Catch:{ all -> 0x13ce }
            java.io.File r2 = r0.A09     // Catch:{ all -> 0x13ce }
            java.io.FileOutputStream r45 = new java.io.FileOutputStream     // Catch:{ all -> 0x13ce }
            r1 = r45
            r1.<init>(r2)     // Catch:{ all -> 0x13ce }
            java.nio.channels.FileChannel r28 = r45.getChannel()     // Catch:{ all -> 0x13ad }
            android.media.MediaExtractor r44 = new android.media.MediaExtractor     // Catch:{ all -> 0x13a6 }
            r44.<init>()     // Catch:{ all -> 0x13a6 }
            java.io.File r1 = r0.A08     // Catch:{ all -> 0x13a6 }
            java.lang.String r2 = r1.getAbsolutePath()     // Catch:{ all -> 0x13a6 }
            r1 = r44
            r1.setDataSource(r2)     // Catch:{ all -> 0x13a6 }
            int r14 = r44.getTrackCount()     // Catch:{ all -> 0x13a6 }
            java.lang.String r2 = "videotranscoder/transcode/number of tracks:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a6 }
            r1.<init>(r2)     // Catch:{ all -> 0x13a6 }
            r1.append(r14)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            r13 = 0
        L_0x0927:
            if (r13 >= r14) goto L_0x139a
            r1 = r44
            android.media.MediaFormat r12 = r1.getTrackFormat(r13)     // Catch:{ all -> 0x13a6 }
            java.lang.String r11 = "mime"
            java.lang.String r8 = r12.getString(r11)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = "videotranscoder/transcode/track:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a6 }
            r2.<init>(r1)     // Catch:{ all -> 0x13a6 }
            r2.append(r13)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = " mime:"
            r2.append(r1)     // Catch:{ all -> 0x13a6 }
            r2.append(r8)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = " format:"
            r2.append(r1)     // Catch:{ all -> 0x13a6 }
            r2.append(r12)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = "video"
            boolean r1 = r8.startsWith(r1)     // Catch:{ all -> 0x13a6 }
            if (r1 == 0) goto L_0x0961
            goto L_0x0964
        L_0x0961:
            int r13 = r13 + 1
            goto L_0x0927
        L_0x0964:
            if (r13 < 0) goto L_0x139a
            r1 = r44
            android.media.MediaFormat r12 = r1.getTrackFormat(r13)     // Catch:{ all -> 0x13a6 }
            java.lang.String r11 = r12.getString(r11)     // Catch:{ all -> 0x13a6 }
            if (r11 == 0) goto L_0x137f
            java.lang.String r1 = "video/unknown"
            boolean r1 = r1.equals(r11)     // Catch:{ all -> 0x13a6 }
            if (r1 != 0) goto L_0x137f
            r1 = r44
            r1.selectTrack(r13)     // Catch:{ all -> 0x13a6 }
            boolean r1 = r12.containsKey(r7)     // Catch:{ all -> 0x13a6 }
            if (r1 == 0) goto L_0x09aa
            long r23 = r12.getLong(r7)     // Catch:{ all -> 0x13a6 }
        L_0x098a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a6 }
            r7.<init>()     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = "videotranscoder/transcode/decoder format:"
            r7.append(r1)     // Catch:{ all -> 0x13a6 }
            r7.append(r12)     // Catch:{ all -> 0x13a6 }
            r1 = r56
            r7.append(r1)     // Catch:{ all -> 0x13a6 }
            r1 = r23
            r7.append(r1)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            goto L_0x09ad
        L_0x09aa:
            r23 = -1
            goto L_0x098a
        L_0x09ad:
            android.media.MediaCodec r13 = android.media.MediaCodec.createDecoderByType(r11)     // Catch:{ IllegalArgumentException -> 0x1366 }
            r2 = 1250(0x4e2, float:1.752E-42)
            r1 = r30
            boolean r7 = r1.A0E(r5, r2)     // Catch:{ IllegalArgumentException -> 0x1366 }
            java.lang.String r2 = "samsung"
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ IllegalArgumentException -> 0x1366 }
            boolean r1 = r2.equalsIgnoreCase(r1)     // Catch:{ IllegalArgumentException -> 0x1366 }
            if (r1 == 0) goto L_0x0a1a
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException -> 0x1366 }
            r1 = 18
            if (r2 < r1) goto L_0x0a1a
            if (r7 == 0) goto L_0x0a1a
            java.lang.String r13 = r13.getName()     // Catch:{ IllegalArgumentException -> 0x1366 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x1366 }
            java.lang.String r1 = r13.toLowerCase(r1)     // Catch:{ IllegalArgumentException -> 0x1366 }
            java.lang.String r8 = "omx.exynos"
            boolean r1 = r1.startsWith(r8)     // Catch:{ IllegalArgumentException -> 0x1366 }
            if (r1 != 0) goto L_0x0a16
            java.util.List r1 = X.AnonymousClass1QT.A04(r11)     // Catch:{ IllegalArgumentException -> 0x1366 }
            java.util.Iterator r29 = r1.iterator()     // Catch:{ IllegalArgumentException -> 0x1366 }
            r15 = 0
            r14 = r15
        L_0x09e8:
            boolean r1 = r29.hasNext()     // Catch:{ IllegalArgumentException -> 0x1366 }
            if (r1 == 0) goto L_0x0a0f
            java.lang.Object r7 = r29.next()     // Catch:{ IllegalArgumentException -> 0x1366 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IllegalArgumentException -> 0x1366 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x1366 }
            java.lang.String r2 = r7.toLowerCase(r1)     // Catch:{ IllegalArgumentException -> 0x1366 }
            boolean r1 = r2.startsWith(r8)     // Catch:{ IllegalArgumentException -> 0x1366 }
            if (r1 == 0) goto L_0x0a03
            if (r15 != 0) goto L_0x0a03
            r15 = r7
        L_0x0a03:
            java.lang.String r1 = "c2.exynos"
            boolean r1 = r2.startsWith(r1)     // Catch:{ IllegalArgumentException -> 0x1366 }
            if (r1 != 0) goto L_0x09e8
            if (r14 != 0) goto L_0x09e8
            r14 = r7
            goto L_0x09e8
        L_0x0a0f:
            if (r15 == 0) goto L_0x0a13
            r13 = r15
            goto L_0x0a16
        L_0x0a13:
            if (r14 == 0) goto L_0x0a16
            r13 = r14
        L_0x0a16:
            android.media.MediaCodec r13 = android.media.MediaCodec.createByCodecName(r13)     // Catch:{ IllegalArgumentException -> 0x1366 }
        L_0x0a1a:
            if (r13 == 0) goto L_0x134e
            java.lang.String r1 = "videotranscoder/transcode/decoder created"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x13a6 }
            r1 = 17
            if (r2 != r1) goto L_0x0a75
            java.lang.String r2 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = "LGE"
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x13a6 }
            if (r1 == 0) goto L_0x0a53
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = "LG-D80"
            boolean r1 = r2.startsWith(r1)     // Catch:{ all -> 0x13a6 }
            if (r1 != 0) goto L_0x0a65
            java.lang.String r1 = "LG-VS980"
            boolean r1 = r2.startsWith(r1)     // Catch:{ all -> 0x13a6 }
            if (r1 != 0) goto L_0x0a65
            java.lang.String r1 = "VS980_4G"
            boolean r1 = r2.startsWith(r1)     // Catch:{ all -> 0x13a6 }
            if (r1 != 0) goto L_0x0a65
            java.lang.String r1 = "LG-F320"
            boolean r1 = r2.startsWith(r1)     // Catch:{ all -> 0x13a6 }
            goto L_0x0a63
        L_0x0a53:
            java.lang.String r1 = "Amazon"
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x13a6 }
            if (r1 == 0) goto L_0x0a75
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = "SD4930UR"
            boolean r1 = r2.startsWith(r1)     // Catch:{ all -> 0x13a6 }
        L_0x0a63:
            if (r1 == 0) goto L_0x0a75
        L_0x0a65:
            java.lang.String r1 = "videotranscoder/transcode/videooutputsurface created"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            X.4gD r8 = new X.4gD     // Catch:{ all -> 0x13a6 }
            r2 = r37
            r1 = r36
            r8.<init>(r2, r1)     // Catch:{ all -> 0x13a6 }
            goto L_0x0a76
        L_0x0a75:
            r8 = 0
        L_0x0a76:
            r65 = 0
            if (r8 != 0) goto L_0x0a7c
            r2 = 0
            goto L_0x0a7e
        L_0x0a7c:
            android.view.Surface r2 = r8.A01     // Catch:{ IllegalStateException -> 0x0a8a }
        L_0x0a7e:
            r1 = 0
            r13.configure(r12, r2, r1, r4)     // Catch:{ IllegalStateException -> 0x0a8a }
            java.lang.String r1 = "videotranscoder/transcode/decoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IllegalStateException -> 0x0a8a }
            goto L_0x0b10
        L_0x0a8a:
            r2 = move-exception
            java.lang.String r1 = "videotranscoder/transcode/decoder failed to configure, will try different one "
            com.whatsapp.util.Log.i(r1, r2)     // Catch:{ all -> 0x13a6 }
            r13.release()     // Catch:{ all -> 0x13a6 }
            java.util.List r1 = X.AnonymousClass1QT.A04(r11)     // Catch:{ all -> 0x13a6 }
            java.util.Iterator r29 = r1.iterator()     // Catch:{ all -> 0x13a6 }
        L_0x0a9c:
            boolean r1 = r29.hasNext()     // Catch:{ all -> 0x13a6 }
            r15 = 0
            if (r1 == 0) goto L_0x1325
            java.lang.Object r14 = r29.next()     // Catch:{ all -> 0x13a6 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x13a6 }
            java.lang.String r2 = "videotranscoder/transcode/decoder/try "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a6 }
            r1.<init>(r2)     // Catch:{ all -> 0x13a6 }
            r1.append(r14)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = "OMX.ittiam.video.decoder.avc"
            boolean r1 = r1.equals(r14)     // Catch:{ all -> 0x13a6 }
            if (r1 == 0) goto L_0x0ad6
            java.lang.String r2 = "videotranscoder/transcode/decoder/skip "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a6 }
            r1.<init>(r2)     // Catch:{ all -> 0x13a6 }
            r1.append(r14)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            goto L_0x0a9c
        L_0x0ad6:
            android.media.MediaCodec r13 = android.media.MediaCodec.createByCodecName(r14)     // Catch:{ all -> 0x13a6 }
            java.lang.String r7 = "videotranscoder/transcode/decoder "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a6 }
            r2.<init>(r7)     // Catch:{ all -> 0x13a6 }
            r2.append(r14)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = " created"
            r2.append(r1)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            r13.configure(r12, r15, r15, r4)     // Catch:{ Exception -> 0x0b0c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b0c }
            r1.<init>()     // Catch:{ Exception -> 0x0b0c }
            r1.append(r7)     // Catch:{ Exception -> 0x0b0c }
            r1.append(r14)     // Catch:{ Exception -> 0x0b0c }
            java.lang.String r2 = " is ok"
            r1.append(r2)     // Catch:{ Exception -> 0x0b0c }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0b0c }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x0b0c }
            goto L_0x0b10
        L_0x0b0c:
            r13.release()     // Catch:{ all -> 0x13a6 }
            goto L_0x0a9c
        L_0x0b10:
            r13.start()     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = "videotranscoder/transcode/decoder started"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            java.nio.ByteBuffer[] r34 = r13.getInputBuffers()     // Catch:{ all -> 0x13a6 }
            java.nio.ByteBuffer[] r31 = r13.getOutputBuffers()     // Catch:{ all -> 0x13a6 }
            android.media.MediaCodec$BufferInfo r7 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x13a6 }
            r7.<init>()     // Catch:{ all -> 0x13a6 }
            android.media.MediaCodec$BufferInfo r43 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x13a6 }
            r43.<init>()     // Catch:{ all -> 0x13a6 }
            int r1 = (r25 > r9 ? 1 : (r25 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0b57
            long r1 = r25 * r16
            r6 = r44
            r6.seekTo(r1, r4)     // Catch:{ all -> 0x13a6 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a6 }
            r4.<init>()     // Catch:{ all -> 0x13a6 }
            java.lang.String r6 = "videotranscoder/transcode/seek to:"
            r4.append(r6)     // Catch:{ all -> 0x13a6 }
            r4.append(r1)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = " actual:"
            r4.append(r1)     // Catch:{ all -> 0x13a6 }
            long r1 = r44.getSampleTime()     // Catch:{ all -> 0x13a6 }
            r4.append(r1)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
        L_0x0b57:
            long r41 = com.whatsapp.VideoFrameConverter.create()     // Catch:{ all -> 0x13a6 }
            X.3Bj r1 = r0.A06     // Catch:{ all -> 0x13a6 }
            if (r1 == 0) goto L_0x0b7a
            java.util.List r1 = r1.A06     // Catch:{ all -> 0x13a6 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x13a6 }
        L_0x0b65:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x13a6 }
            if (r1 == 0) goto L_0x0b7f
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x13a6 }
            X.29l r1 = (X.C455829l) r1     // Catch:{ all -> 0x13a6 }
            boolean r1 = r1.A0L()     // Catch:{ all -> 0x13a6 }
            if (r1 == 0) goto L_0x0b65
            r32 = 1
            goto L_0x0b7f
        L_0x0b7a:
            r53 = 0
            r51 = 0
            goto L_0x0bbf
        L_0x0b7f:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x13a6 }
            r2 = r37
            r1 = r36
            android.graphics.Bitmap r51 = android.graphics.Bitmap.createBitmap(r2, r1, r4)     // Catch:{ all -> 0x13a6 }
            X.3Bj r2 = r0.A06     // Catch:{ all -> 0x13a6 }
            r1 = r54
            int r1 = 360 - r1
            int r4 = r1 % 360
            r1 = r51
            r2.A06(r4, r1)     // Catch:{ all -> 0x13a6 }
            int r2 = r51.getWidth()     // Catch:{ all -> 0x13a6 }
            int r1 = r51.getHeight()     // Catch:{ all -> 0x13a6 }
            int r2 = r2 * r1
            int r1 = r2 << 2
            java.nio.ByteBuffer r53 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch:{ all -> 0x13a6 }
            r2 = r51
            r1 = r53
            r2.copyPixelsToBuffer(r1)     // Catch:{ all -> 0x13a6 }
            int r63 = r51.getWidth()     // Catch:{ all -> 0x13a6 }
            int r64 = r51.getHeight()     // Catch:{ all -> 0x13a6 }
            r61 = 0
            r62 = 0
            r58 = r41
            r60 = r1
            com.whatsapp.VideoFrameConverter.setOverlay(r58, r60, r61, r62, r63, r64)     // Catch:{ all -> 0x13a6 }
        L_0x0bbf:
            int r1 = r3.A05     // Catch:{ all -> 0x13a6 }
            r75 = r1
            java.lang.String r49 = "videotranscoder/transcode/extractor released"
            java.lang.String r48 = "videotranscoder/transcode/encoder released"
            java.lang.String r47 = "videotranscoder/transcode/encoder stopped"
            java.lang.String r52 = "videotranscoder/transcode/decoder released"
            java.lang.String r50 = "videotranscoder/transcode/decoder stopped"
            if (r8 == 0) goto L_0x0bd9
            int r1 = r37 << 2
            int r1 = r1 * r36
            goto L_0x0bdc
        L_0x0bd9:
            r58 = 0
            goto L_0x0bf7
        L_0x0bdc:
            java.nio.ByteBuffer r58 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch:{ Exception -> 0x12ef }
            int r73 = r37 + -1
            int r74 = r36 + -1
            r68 = 7
            r71 = 0
            r72 = 0
            r76 = r37
            r77 = r36
            r66 = r41
            r69 = r37
            r70 = r36
            com.whatsapp.VideoFrameConverter.configure(r66, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77)     // Catch:{ Exception -> 0x12ef }
        L_0x0bf7:
            r2 = 2747(0xabb, float:3.85E-42)
            r1 = r30
            boolean r59 = r1.A0E(r5, r2)     // Catch:{ Exception -> 0x12ef }
            r60 = 1000000(0xf4240, float:1.401298E-39)
            if (r59 == 0) goto L_0x0c06
            r60 = 1000(0x3e8, float:1.401E-42)
        L_0x0c06:
            r0.A02 = r9     // Catch:{ Exception -> 0x12ef }
            r0.A01 = r9     // Catch:{ Exception -> 0x12ef }
            r64 = 0
            r61 = 0
            r2 = 0
        L_0x0c0f:
            java.lang.String r63 = " frames:"
            if (r65 != 0) goto L_0x10e1
            boolean r1 = r0.A0K     // Catch:{ Exception -> 0x12ef }
            if (r1 != 0) goto L_0x10e1
            int r2 = r2 + 1
            r1 = 0
            if (r2 >= r1) goto L_0x0c31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r4.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/transcode/loop "
            r4.append(r3)     // Catch:{ Exception -> 0x12ef }
            r4.append(r2)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x12ef }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
        L_0x0c31:
            if (r61 != 0) goto L_0x0cf4
            r3 = r60
            long r3 = (long) r3     // Catch:{ Exception -> 0x12ef }
            int r5 = r13.dequeueInputBuffer(r3)     // Catch:{ Exception -> 0x12ef }
            if (r2 >= r1) goto L_0x0c51
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r4.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/decoder/dequeue/input "
            r4.append(r3)     // Catch:{ Exception -> 0x12ef }
            r4.append(r5)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x12ef }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
        L_0x0c51:
            if (r5 >= 0) goto L_0x0c6c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r4.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/transcode/decoder/dequeue/input < 0"
            r4.append(r3)     // Catch:{ Exception -> 0x12ef }
            r4.append(r5)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x12ef }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
            if (r59 != 0) goto L_0x0cf4
            goto L_0x10e1
        L_0x0c6c:
            r4 = r34[r5]     // Catch:{ Exception -> 0x12ef }
            r3 = r44
            int r6 = r3.readSampleData(r4, r1)     // Catch:{ Exception -> 0x12ef }
            if (r6 >= 0) goto L_0x0c8e
            java.lang.String r3 = "videotranscoder/transcode/extractor BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
            r72 = 4
            r68 = 0
            r69 = 0
            r70 = 0
            r66 = r13
            r67 = r5
            r66.queueInputBuffer(r67, r68, r69, r70, r72)     // Catch:{ Exception -> 0x12ef }
            r61 = 1
            goto L_0x0cf4
        L_0x0c8e:
            if (r2 >= r1) goto L_0x0cb1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r11.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/transcode/extractor/sample size:"
            r11.append(r3)     // Catch:{ Exception -> 0x12ef }
            r11.append(r6)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = " time:"
            r11.append(r3)     // Catch:{ Exception -> 0x12ef }
            long r3 = r44.getSampleTime()     // Catch:{ Exception -> 0x12ef }
            r11.append(r3)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r11.toString()     // Catch:{ Exception -> 0x12ef }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
        L_0x0cb1:
            long r70 = r44.getSampleTime()     // Catch:{ Exception -> 0x12ef }
            r68 = 0
            r72 = 0
            r66 = r13
            r67 = r5
            r69 = r6
            r66.queueInputBuffer(r67, r68, r69, r70, r72)     // Catch:{ Exception -> 0x12ef }
            if (r2 >= r1) goto L_0x0cd9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r4.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/decoder/queue/input "
            r4.append(r3)     // Catch:{ Exception -> 0x12ef }
            r4.append(r5)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x12ef }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
        L_0x0cd9:
            boolean r5 = r44.advance()     // Catch:{ Exception -> 0x12ef }
            if (r2 >= r1) goto L_0x0cf4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r4.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/transcode/extractor/advance "
            r4.append(r3)     // Catch:{ Exception -> 0x12ef }
            r4.append(r5)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x12ef }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
        L_0x0cf4:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            int r12 = r13.dequeueOutputBuffer(r7, r3)     // Catch:{ Exception -> 0x12ef }
            if (r2 >= r1) goto L_0x0d12
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r4.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/transcode/decoder/dequeue/output "
            r4.append(r3)     // Catch:{ Exception -> 0x12ef }
            r4.append(r12)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x12ef }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
        L_0x0d12:
            java.lang.String r11 = " "
            if (r12 < 0) goto L_0x0fbe
            long r3 = r7.presentationTimeUs     // Catch:{ Exception -> 0x12ef }
            long r29 = r25 * r16
            int r5 = (r3 > r29 ? 1 : (r3 == r29 ? 0 : -1))
            if (r5 < 0) goto L_0x0f98
            r3 = 1000000(0xf4240, double:4.940656E-318)
            r5 = r46
            int r6 = r5.dequeueInputBuffer(r3)     // Catch:{ Exception -> 0x12ef }
            if (r2 >= r1) goto L_0x0d3e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r4.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/transcode/encoder/dequeue/input "
            r4.append(r3)     // Catch:{ Exception -> 0x12ef }
            r4.append(r6)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x12ef }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
        L_0x0d3e:
            if (r6 < 0) goto L_0x0f22
            r14 = r35[r6]     // Catch:{ Exception -> 0x12ef }
            r14.clear()     // Catch:{ Exception -> 0x12ef }
            X.3Bj r3 = r0.A06     // Catch:{ Exception -> 0x12ef }
            if (r3 == 0) goto L_0x0d89
            if (r32 == 0) goto L_0x0d89
            java.util.List r3 = r3.A06     // Catch:{ Exception -> 0x12ef }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ Exception -> 0x12ef }
        L_0x0d51:
            boolean r3 = r4.hasNext()     // Catch:{ Exception -> 0x12ef }
            if (r3 == 0) goto L_0x0d5b
            r4.next()     // Catch:{ Exception -> 0x12ef }
            goto L_0x0d51
        L_0x0d5b:
            r3 = r51
            r3.eraseColor(r1)     // Catch:{ Exception -> 0x12ef }
            X.3Bj r5 = r0.A06     // Catch:{ Exception -> 0x12ef }
            r3 = r54
            int r3 = 360 - r3
            int r4 = r3 % 360
            r3 = r51
            r5.A06(r4, r3)     // Catch:{ Exception -> 0x12ef }
            r53.rewind()     // Catch:{ Exception -> 0x12ef }
            r4 = r3
            r3 = r53
            r4.copyPixelsToBuffer(r3)     // Catch:{ Exception -> 0x12ef }
            int r70 = r51.getWidth()     // Catch:{ Exception -> 0x12ef }
            int r71 = r51.getHeight()     // Catch:{ Exception -> 0x12ef }
            r68 = 0
            r69 = 0
            r65 = r41
            r67 = r3
            com.whatsapp.VideoFrameConverter.setOverlay(r65, r67, r68, r69, r70, r71)     // Catch:{ Exception -> 0x12ef }
        L_0x0d89:
            if (r8 == 0) goto L_0x0dde
            r8.A00()     // Catch:{ Exception -> 0x12ef }
            r3 = 1
            r13.releaseOutputBuffer(r12, r3)     // Catch:{ Exception -> 0x12ef }
            java.lang.Object r5 = r8.A08     // Catch:{ Exception -> 0x12ef }
            monitor-enter(r5)     // Catch:{ Exception -> 0x12ef }
        L_0x0d95:
            boolean r3 = r8.A07     // Catch:{ all -> 0x10de }
            if (r3 != 0) goto L_0x0daa
            r3 = 500(0x1f4, double:2.47E-321)
            r5.wait(r3)     // Catch:{ InterruptedException -> 0x10d7 }
            boolean r3 = r8.A07     // Catch:{ InterruptedException -> 0x10d7 }
            if (r3 != 0) goto L_0x0d95
            java.lang.String r2 = "Surface frame wait timed out"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x10d7 }
            r1.<init>(r2)     // Catch:{ InterruptedException -> 0x10d7 }
            throw r1     // Catch:{ InterruptedException -> 0x10d7 }
        L_0x0daa:
            r8.A07 = r1     // Catch:{ all -> 0x10de }
            monitor-exit(r5)     // Catch:{ all -> 0x10de }
            java.lang.String r3 = "before updateTexImage"
            X.C89054bW.A00(r3)     // Catch:{ Exception -> 0x12ef }
            android.graphics.SurfaceTexture r3 = r8.A00     // Catch:{ Exception -> 0x12ef }
            r3.updateTexImage()     // Catch:{ Exception -> 0x12ef }
            X.4bW r4 = r8.A02     // Catch:{ Exception -> 0x12ef }
            android.graphics.SurfaceTexture r3 = r8.A00     // Catch:{ Exception -> 0x12ef }
            r4.A01(r3)     // Catch:{ Exception -> 0x12ef }
            r69 = 6407(0x1907, float:8.978E-42)
            r70 = 5121(0x1401, float:7.176E-42)
            r65 = 0
            r66 = 0
            r67 = r37
            r68 = r36
            r71 = r58
            android.opengl.GLES20.glReadPixels(r65, r66, r67, r68, r69, r70, r71)     // Catch:{ Exception -> 0x12ef }
            r3 = r58
            r3.position(r1)     // Catch:{ Exception -> 0x12ef }
            r3 = r41
            r5 = r58
            com.whatsapp.VideoFrameConverter.convertFrame(r3, r5, r14)     // Catch:{ Exception -> 0x12ef }
            r62 = 1
            goto L_0x0e58
        L_0x0dde:
            r5 = r31[r12]     // Catch:{ Exception -> 0x12ef }
            int r3 = r7.offset     // Catch:{ Exception -> 0x12ef }
            r5.position(r3)     // Catch:{ Exception -> 0x12ef }
            int r4 = r7.offset     // Catch:{ Exception -> 0x12ef }
            int r3 = r7.size     // Catch:{ Exception -> 0x12ef }
            int r4 = r4 + r3
            r5.limit(r4)     // Catch:{ Exception -> 0x12ef }
            long r3 = r0.A01     // Catch:{ Exception -> 0x12ef }
            int r15 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r15 == 0) goto L_0x0df5
            if (r2 >= r1) goto L_0x0e34
        L_0x0df5:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r15.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/transcode/convert decoderBufferInfo.offset:"
            r15.append(r3)     // Catch:{ Exception -> 0x12ef }
            int r3 = r7.offset     // Catch:{ Exception -> 0x12ef }
            r15.append(r3)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = " decoderBufferInfo.size:"
            r15.append(r3)     // Catch:{ Exception -> 0x12ef }
            int r3 = r7.size     // Catch:{ Exception -> 0x12ef }
            r15.append(r3)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = " decoderBufferInfo.presentationTimeUs:"
            r15.append(r3)     // Catch:{ Exception -> 0x12ef }
            long r3 = r7.presentationTimeUs     // Catch:{ Exception -> 0x12ef }
            r15.append(r3)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = " decoderBufferInfo.flags:"
            r15.append(r3)     // Catch:{ Exception -> 0x12ef }
            int r3 = r7.flags     // Catch:{ Exception -> 0x12ef }
            r15.append(r3)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = " encoderFrameSize:"
            r15.append(r3)     // Catch:{ Exception -> 0x12ef }
            r3 = r20
            r15.append(r3)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r15.toString()     // Catch:{ Exception -> 0x12ef }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
        L_0x0e34:
            byte[] r3 = r0.A0A     // Catch:{ Exception -> 0x12ef }
            if (r3 != 0) goto L_0x0e43
            int r3 = r5.remaining()     // Catch:{ Exception -> 0x12ef }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x12ef }
            r5.get(r3)     // Catch:{ Exception -> 0x12ef }
            r0.A0A = r3     // Catch:{ Exception -> 0x12ef }
        L_0x0e43:
            r3 = r41
            com.whatsapp.VideoFrameConverter.convertFrame(r3, r5, r14)     // Catch:{ Exception -> 0x12ef }
            long r3 = r0.A01     // Catch:{ Exception -> 0x12ef }
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0e50
            if (r2 >= r1) goto L_0x0e56
        L_0x0e50:
            java.lang.String r3 = "videotranscoder/transcode/converted"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
        L_0x0e56:
            r62 = 0
        L_0x0e58:
            long r3 = r7.presentationTimeUs     // Catch:{ Exception -> 0x12ef }
            int r5 = r7.flags     // Catch:{ Exception -> 0x12ef }
            r67 = 0
            r65 = r46
            r66 = r6
            r68 = r20
            r69 = r3
            r71 = r5
            r65.queueInputBuffer(r66, r67, r68, r69, r71)     // Catch:{ Exception -> 0x12ef }
            long r3 = r0.A01     // Catch:{ Exception -> 0x12ef }
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0e73
            if (r2 >= r1) goto L_0x0e79
        L_0x0e73:
            java.lang.String r3 = "videotranscoder/transcode/encoder/queue/input"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
        L_0x0e79:
            long r3 = r0.A01     // Catch:{ Exception -> 0x12ef }
            r5 = 1
            long r3 = r3 + r5
            r0.A01 = r3     // Catch:{ Exception -> 0x12ef }
            long r5 = r7.presentationTimeUs     // Catch:{ Exception -> 0x12ef }
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0e8a
            long r3 = r5 - r29
            r0.A02 = r3     // Catch:{ Exception -> 0x12ef }
        L_0x0e8a:
            int r3 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0eb2
            long r3 = r21 * r16
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 <= 0) goto L_0x0eb2
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r15.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r14 = "videotranscoder/transcode/end time detected "
            r15.append(r14)     // Catch:{ Exception -> 0x12ef }
            r15.append(r5)     // Catch:{ Exception -> 0x12ef }
            r15.append(r11)     // Catch:{ Exception -> 0x12ef }
            r15.append(r3)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r15.toString()     // Catch:{ Exception -> 0x12ef }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
            r65 = 1
            goto L_0x0eb4
        L_0x0eb2:
            r65 = 0
        L_0x0eb4:
            int r3 = (r23 > r9 ? 1 : (r23 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0f1c
            int r3 = (r25 > r9 ? 1 : (r25 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x0ebe
            r29 = 0
        L_0x0ebe:
            int r3 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x0ec7
            r14 = r23
        L_0x0ec4:
            r5 = 100
            goto L_0x0eca
        L_0x0ec7:
            long r14 = r21 * r16
            goto L_0x0ec4
        L_0x0eca:
            long r3 = r7.presentationTimeUs     // Catch:{ Exception -> 0x12ef }
            long r3 = r3 - r29
            long r3 = r3 * r5
            long r14 = r14 - r29
            long r3 = r3 / r14
            int r5 = (int) r3     // Catch:{ Exception -> 0x12ef }
            r3 = r64
            if (r5 == r3) goto L_0x0f1c
            X.5Pr r3 = r0.A04     // Catch:{ Exception -> 0x12ef }
            if (r3 == 0) goto L_0x0f1c
            boolean r3 = r0.A0K     // Catch:{ Exception -> 0x12ef }
            if (r3 != 0) goto L_0x0ee8
            X.5Pr r3 = r0.A04     // Catch:{ Exception -> 0x12ef }
            boolean r4 = r3.AVN(r5)     // Catch:{ Exception -> 0x12ef }
            r3 = 0
            if (r4 == 0) goto L_0x0ee9
        L_0x0ee8:
            r3 = 1
        L_0x0ee9:
            r0.A0K = r3     // Catch:{ Exception -> 0x12ef }
            r3 = 5
            if (r5 < r3) goto L_0x0ef2
            int r3 = r5 % 5
            if (r3 != 0) goto L_0x0f1e
        L_0x0ef2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r6.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/transcode/progress "
            r6.append(r3)     // Catch:{ Exception -> 0x12ef }
            r6.append(r5)     // Catch:{ Exception -> 0x12ef }
            r3 = r63
            r6.append(r3)     // Catch:{ Exception -> 0x12ef }
            long r3 = r0.A01     // Catch:{ Exception -> 0x12ef }
            r6.append(r3)     // Catch:{ Exception -> 0x12ef }
            r3 = r56
            r6.append(r3)     // Catch:{ Exception -> 0x12ef }
            long r3 = r0.A02     // Catch:{ Exception -> 0x12ef }
            r6.append(r3)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x12ef }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
            goto L_0x0f1e
        L_0x0f1c:
            r5 = r64
        L_0x0f1e:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            goto L_0x0f29
        L_0x0f22:
            r5 = r64
            r3 = 1000000(0xf4240, double:4.940656E-318)
            r62 = 0
        L_0x0f29:
            r11 = r43
            r6 = r46
            int r6 = r6.dequeueOutputBuffer(r11, r3)     // Catch:{ Exception -> 0x12ef }
            if (r2 >= r1) goto L_0x0f48
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r4.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/transcode/encoder/dequeue/output "
            r4.append(r3)     // Catch:{ Exception -> 0x12ef }
            r4.append(r6)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x12ef }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
        L_0x0f48:
            if (r6 < 0) goto L_0x0f6d
            r4 = r27[r6]     // Catch:{ Exception -> 0x12ef }
            int r3 = r11.offset     // Catch:{ Exception -> 0x12ef }
            r4.position(r3)     // Catch:{ Exception -> 0x12ef }
            r3 = r11
            int r11 = r11.offset     // Catch:{ Exception -> 0x12ef }
            int r3 = r3.size     // Catch:{ Exception -> 0x12ef }
            int r11 = r11 + r3
            r4.limit(r11)     // Catch:{ Exception -> 0x12ef }
            r3 = r28
            r3.write(r4)     // Catch:{ Exception -> 0x12ef }
            r4.clear()     // Catch:{ Exception -> 0x12ef }
            r3 = r46
            r3.releaseOutputBuffer(r6, r1)     // Catch:{ Exception -> 0x12ef }
            if (r2 >= r1) goto L_0x0f95
            java.lang.String r3 = "videotranscoder/transcode/encoder/release/output"
            goto L_0x0f92
        L_0x0f6d:
            r3 = -3
            if (r6 != r3) goto L_0x0f71
            goto L_0x0f8b
        L_0x0f71:
            r3 = -2
            if (r6 != r3) goto L_0x0f95
            android.media.MediaFormat r6 = r46.getOutputFormat()     // Catch:{ Exception -> 0x12ef }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r4.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/transcode/encoder output format has changed to "
            r4.append(r3)     // Catch:{ Exception -> 0x12ef }
            r4.append(r6)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x12ef }
            goto L_0x0f92
        L_0x0f8b:
            java.nio.ByteBuffer[] r27 = r46.getOutputBuffers()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/transcode/encoder output buffers have changed"
        L_0x0f92:
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
        L_0x0f95:
            if (r62 != 0) goto L_0x0fba
            goto L_0x0fb7
        L_0x0f98:
            r5 = r64
            int r33 = r33 + 1
            if (r2 >= r1) goto L_0x0fb5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r4.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "videotranscoder/transcode/frame skipped "
            r4.append(r3)     // Catch:{ Exception -> 0x12ef }
            r3 = r33
            r4.append(r3)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x12ef }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x12ef }
        L_0x0fb5:
            r65 = 0
        L_0x0fb7:
            r13.releaseOutputBuffer(r12, r1)     // Catch:{ Exception -> 0x12ef }
        L_0x0fba:
            if (r2 >= r1) goto L_0x10c5
            goto L_0x10bf
        L_0x0fbe:
            r5 = r64
            r1 = -3
            if (r12 != r1) goto L_0x0fc5
            goto L_0x109d
        L_0x0fc5:
            r1 = -2
            if (r12 != r1) goto L_0x10a8
            android.media.MediaFormat r4 = r13.getOutputFormat()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = r38.getName()     // Catch:{ Exception -> 0x12ef }
            X.4aF r1 = r0.A03     // Catch:{ Exception -> 0x12ef }
            X.4aT r4 = A02(r4, r1, r3)     // Catch:{ Exception -> 0x12ef }
            r0.A05 = r4     // Catch:{ Exception -> 0x12ef }
            int r1 = r4.A00     // Catch:{ Exception -> 0x12ef }
            r74 = r1
            int r15 = r4.A09     // Catch:{ Exception -> 0x12ef }
            int r1 = r4.A06     // Catch:{ Exception -> 0x12ef }
            int r3 = r4.A02     // Catch:{ Exception -> 0x12ef }
            r30 = r3
            int r3 = r4.A03     // Catch:{ Exception -> 0x12ef }
            r29 = r3
            int r14 = r4.A04     // Catch:{ Exception -> 0x12ef }
            int r12 = r4.A01     // Catch:{ Exception -> 0x12ef }
            java.lang.String r6 = r38.getName()     // Catch:{ Exception -> 0x12ef }
            boolean r3 = A07(r6)     // Catch:{ Exception -> 0x12ef }
            if (r3 != 0) goto L_0x1012
            java.lang.String r3 = "OMX.Intel.VideoEncoder.AVC"
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x12ef }
            if (r3 != 0) goto L_0x1012
            java.lang.String r3 = "OMX.Intel.VideoDecoder.AVC"
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x12ef }
            if (r3 != 0) goto L_0x1012
            int r3 = r4.A07     // Catch:{ Exception -> 0x12ef }
            int r1 = java.lang.Math.max(r3, r1)     // Catch:{ Exception -> 0x12ef }
            int r3 = r4.A08     // Catch:{ Exception -> 0x12ef }
            int r15 = java.lang.Math.max(r3, r15)     // Catch:{ Exception -> 0x12ef }
        L_0x1012:
            if (r8 != 0) goto L_0x10bc
            int r3 = r4.A05     // Catch:{ Exception -> 0x12ef }
            r62 = r41
            r64 = r3
            r65 = r15
            r66 = r1
            r67 = r30
            r68 = r14
            r69 = r29
            r70 = r12
            r71 = r75
            r72 = r37
            r73 = r36
            com.whatsapp.VideoFrameConverter.configure(r62, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)     // Catch:{ Exception -> 0x12ef }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x12ef }
            r6.<init>()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r4 = "videotranscoder/transcode/configure frame converter from:("
            r6.append(r4)     // Catch:{ Exception -> 0x12ef }
            r4 = r74
            r6.append(r4)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r4 = "["
            r6.append(r4)     // Catch:{ Exception -> 0x12ef }
            r6.append(r3)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r3 = "] "
            r6.append(r3)     // Catch:{ Exception -> 0x12ef }
            r6.append(r15)     // Catch:{ Exception -> 0x12ef }
            r6.append(r11)     // Catch:{ Exception -> 0x12ef }
            r6.append(r1)     // Catch:{ Exception -> 0x12ef }
            r6.append(r11)     // Catch:{ Exception -> 0x12ef }
            r1 = r30
            r6.append(r1)     // Catch:{ Exception -> 0x12ef }
            r6.append(r11)     // Catch:{ Exception -> 0x12ef }
            r6.append(r14)     // Catch:{ Exception -> 0x12ef }
            r6.append(r11)     // Catch:{ Exception -> 0x12ef }
            r1 = r29
            r6.append(r1)     // Catch:{ Exception -> 0x12ef }
            r6.append(r11)     // Catch:{ Exception -> 0x12ef }
            r6.append(r12)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r1 = ") to:("
            r6.append(r1)     // Catch:{ Exception -> 0x12ef }
            r1 = r78
            r6.append(r1)     // Catch:{ Exception -> 0x12ef }
            r6.append(r4)     // Catch:{ Exception -> 0x12ef }
            r1 = r75
            r6.append(r1)     // Catch:{ Exception -> 0x12ef }
            r6.append(r3)     // Catch:{ Exception -> 0x12ef }
            r1 = r37
            r6.append(r1)     // Catch:{ Exception -> 0x12ef }
            r6.append(r11)     // Catch:{ Exception -> 0x12ef }
            r1 = r36
            r6.append(r1)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r1 = ")"
            r6.append(r1)     // Catch:{ Exception -> 0x12ef }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x12ef }
            goto L_0x10a4
        L_0x109d:
            java.nio.ByteBuffer[] r31 = r13.getOutputBuffers()     // Catch:{ Exception -> 0x12ef }
            java.lang.String r1 = "videotranscoder/transcode/decoder output buffers have changed"
        L_0x10a4:
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x12ef }
            goto L_0x10bc
        L_0x10a8:
            r1 = -1
            if (r12 != r1) goto L_0x10bc
            if (r61 == 0) goto L_0x10bc
            int r1 = r7.flags     // Catch:{ Exception -> 0x12ef }
            r1 = r1 & 4
            if (r1 != 0) goto L_0x10b9
            java.lang.String r1 = "videotranscoder/transcode/decoder says try later after extractor finished"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x12ef }
        L_0x10b9:
            r65 = 1
            goto L_0x10c5
        L_0x10bc:
            r65 = 0
            goto L_0x10c5
        L_0x10bf:
            java.lang.String r1 = "videotranscoder/transcode/decoder/release/output"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x12ef }
        L_0x10c5:
            int r1 = r7.flags     // Catch:{ Exception -> 0x12ef }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x10d3
            java.lang.String r1 = "videotranscoder/transcode/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x12ef }
            r65 = 1
        L_0x10d3:
            r64 = r5
            goto L_0x0c0f
        L_0x10d7:
            r2 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x10de }
            r1.<init>(r2)     // Catch:{ all -> 0x10de }
            throw r1     // Catch:{ all -> 0x10de }
        L_0x10de:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x10de }
            throw r1     // Catch:{ Exception -> 0x12ef }
        L_0x10e1:
            r13.stop()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r50)     // Catch:{ all -> 0x13a6 }
            r13.release()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r52)     // Catch:{ all -> 0x13a6 }
            r3 = r43
            r4 = r28
            r2 = r46
            r1 = r27
            A05(r3, r2, r4, r1)     // Catch:{ all -> 0x13a6 }
            r46.stop()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r47)     // Catch:{ all -> 0x13a6 }
            r46.release()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r48)     // Catch:{ all -> 0x13a6 }
            r44.release()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r49)     // Catch:{ all -> 0x13a6 }
            com.whatsapp.VideoFrameConverter.release(r41)     // Catch:{ all -> 0x13a6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a6 }
            r3.<init>()     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = "videotranscoder/transcode/done cancelled:"
            r3.append(r1)     // Catch:{ all -> 0x13a6 }
            boolean r1 = r0.A0K     // Catch:{ all -> 0x13a6 }
            r3.append(r1)     // Catch:{ all -> 0x13a6 }
            r1 = r63
            r3.append(r1)     // Catch:{ all -> 0x13a6 }
            long r1 = r0.A01     // Catch:{ all -> 0x13a6 }
            r3.append(r1)     // Catch:{ all -> 0x13a6 }
            r1 = r55
            r3.append(r1)     // Catch:{ all -> 0x13a6 }
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x13a6 }
            long r1 = r1.length()     // Catch:{ all -> 0x13a6 }
            r3.append(r1)     // Catch:{ all -> 0x13a6 }
            r1 = r56
            r3.append(r1)     // Catch:{ all -> 0x13a6 }
            long r1 = r0.A02     // Catch:{ all -> 0x13a6 }
            r3.append(r1)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = " skipfirstframes:"
            r3.append(r1)     // Catch:{ all -> 0x13a6 }
            r1 = r33
            r3.append(r1)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            if (r28 == 0) goto L_0x1155
            r28.close()     // Catch:{ all -> 0x13ad }
        L_0x1155:
            r45.close()     // Catch:{ all -> 0x13ce }
            boolean r1 = r0.A0K     // Catch:{ all -> 0x13ce }
            if (r1 != 0) goto L_0x116c
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x13ce }
            long r2 = r1.length()     // Catch:{ all -> 0x13ce }
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x12e9
            long r1 = r0.A01     // Catch:{ all -> 0x13ce }
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x12e9
        L_0x116c:
            long r1 = r0.A02     // Catch:{ all -> 0x13ce }
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x117f
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x13ce }
            long r1 = r0.A01     // Catch:{ all -> 0x13ce }
            long r1 = r3.toMicros(r1)     // Catch:{ all -> 0x13ce }
            r3 = 30
            long r1 = r1 / r3
            r0.A02 = r1     // Catch:{ all -> 0x13ce }
        L_0x117f:
            java.lang.String r1 = "videotranscoder/transcode/finished: size:"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x13ce }
            r3.<init>(r1)     // Catch:{ all -> 0x13ce }
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x13ce }
            long r1 = r1.length()     // Catch:{ all -> 0x13ce }
            r3.append(r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x13ce }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13ce }
            java.io.File r1 = r0.A08     // Catch:{ all -> 0x13ce }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x13ce }
            if (r1 == 0) goto L_0x1275
            boolean r1 = r0.A0K     // Catch:{ all -> 0x13ce }
            if (r1 != 0) goto L_0x120a
            java.io.File r2 = r0.A08     // Catch:{ all -> 0x13ce }
            r1 = 0
            X.1zC r4 = X.AnonymousClass1QS.A04(r2, r1)     // Catch:{ all -> 0x13ce }
            int r3 = r4.A01     // Catch:{ all -> 0x13ce }
            r2 = 2
            if (r3 == r2) goto L_0x11b2
            r1 = 3
            if (r3 != r1) goto L_0x11c3
        L_0x11b2:
            int r3 = r4.A00     // Catch:{ all -> 0x13ce }
            r1 = 4
            if (r3 == r1) goto L_0x120a
            if (r3 == r2) goto L_0x120a
            r1 = 1
            if (r3 == r1) goto L_0x120a
            if (r3 == 0) goto L_0x120a
            r1 = 8
            if (r3 != r1) goto L_0x11c3
            goto L_0x120a
        L_0x11c3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 3yN -> 0x1204 }
            r2.<init>()     // Catch:{ 3yN -> 0x1204 }
            java.io.File r1 = r79.getAbsoluteFile()     // Catch:{ 3yN -> 0x1204 }
            r2.append(r1)     // Catch:{ 3yN -> 0x1204 }
            java.lang.String r1 = ".aac"
            r2.append(r1)     // Catch:{ 3yN -> 0x1204 }
            java.lang.String r1 = r2.toString()     // Catch:{ 3yN -> 0x1204 }
            java.io.File r2 = new java.io.File     // Catch:{ 3yN -> 0x1204 }
            r2.<init>(r1)     // Catch:{ 3yN -> 0x1204 }
            r0.A07 = r2     // Catch:{ 3yN -> 0x1204 }
            java.io.File r1 = r0.A08     // Catch:{ 3yN -> 0x1204 }
            X.4NM r3 = new X.4NM     // Catch:{ 3yN -> 0x1204 }
            r3.<init>(r1, r2)     // Catch:{ 3yN -> 0x1204 }
            r1 = r25
            r3.A01 = r1     // Catch:{ 3yN -> 0x1204 }
            r1 = r21
            r3.A02 = r1     // Catch:{ 3yN -> 0x1204 }
            r1 = 96000(0x17700, float:1.34525E-40)
            r3.A00 = r1     // Catch:{ 3yN -> 0x1204 }
            X.1zn r4 = new X.1zn     // Catch:{ 3yN -> 0x1204 }
            r4.<init>(r3)     // Catch:{ 3yN -> 0x1204 }
            r2 = 3
            com.facebook.redex.IDxListenerShape345S0100000_2_I0 r1 = new com.facebook.redex.IDxListenerShape345S0100000_2_I0     // Catch:{ 3yN -> 0x1204 }
            r1.<init>(r0, r2)     // Catch:{ 3yN -> 0x1204 }
            r4.A01 = r1     // Catch:{ 3yN -> 0x1204 }
            r4.A01()     // Catch:{ 3yN -> 0x1204 }
            goto L_0x120a
        L_0x1204:
            X.1xB r1 = new X.1xB     // Catch:{ all -> 0x13ce }
            r1.<init>()     // Catch:{ all -> 0x13ce }
            throw r1     // Catch:{ all -> 0x13ce }
        L_0x120a:
            boolean r1 = r0.A0K     // Catch:{ all -> 0x13ce }
            if (r1 != 0) goto L_0x1261
            long r3 = r0.A02     // Catch:{ 20O -> 0x125a }
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x121a
            long r1 = r0.A01     // Catch:{ 20O -> 0x125a }
            long r18 = r1 * r39
            long r18 = r18 / r3
        L_0x121a:
            java.io.File r1 = r0.A07     // Catch:{ 20O -> 0x125a }
            if (r1 == 0) goto L_0x1255
            boolean r1 = r1.exists()     // Catch:{ 20O -> 0x125a }
            if (r1 == 0) goto L_0x1253
            java.io.File r5 = r0.A07     // Catch:{ 20O -> 0x125a }
        L_0x1226:
            java.io.File r2 = r0.A08     // Catch:{ 20O -> 0x125a }
            X.1xA r1 = new X.1xA     // Catch:{ 20O -> 0x125a }
            r1.<init>(r2)     // Catch:{ 20O -> 0x125a }
            int r31 = r1.A01()     // Catch:{ 20O -> 0x125a }
            java.io.File r4 = r0.A09     // Catch:{ 20O -> 0x125a }
            java.io.File r3 = r0.A08     // Catch:{ 20O -> 0x125a }
            long r1 = r0.A02     // Catch:{ 20O -> 0x125a }
            long r1 = r1 / r16
            r27 = r79
            r28 = r5
            r29 = r4
            r30 = r3
            r32 = r9
            r34 = r18
            r36 = r1
            r38 = r25
            com.whatsapp.Mp4Ops.A02(r27, r28, r29, r30, r31, r32, r34, r36, r38)     // Catch:{ 20O -> 0x125a }
        L_0x124c:
            r2 = 1
            r1 = r79
            com.whatsapp.Mp4Ops.A03(r1, r2)     // Catch:{ 20O -> 0x125a }
            goto L_0x1261
        L_0x1253:
            r5 = 0
            goto L_0x1226
        L_0x1255:
            java.io.File r5 = r0.A08     // Catch:{ 20O -> 0x125a }
            r9 = r25
            goto L_0x1226
        L_0x125a:
            r2 = move-exception
            r1 = r57
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x13ce }
            throw r2     // Catch:{ all -> 0x13ce }
        L_0x1261:
            java.io.File r1 = r0.A09
            X.AnonymousClass1XI.A0N(r1)
            java.io.File r1 = r0.A07
            if (r1 == 0) goto L_0x126d
            X.AnonymousClass1XI.A0N(r1)
        L_0x126d:
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x1274
            X.AnonymousClass1XI.A0N(r79)
        L_0x1274:
            return
        L_0x1275:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x13ce }
            r7.<init>()     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = "videotranscoder/transcode/input file disappeared, "
            r7.append(r1)     // Catch:{ all -> 0x13ce }
            java.io.File r8 = r0.A08     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = "file_path="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x13ce }
            r6.<init>(r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = r8.getAbsolutePath()     // Catch:{ all -> 0x13ce }
            r6.append(r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r5 = ", "
            r6.append(r5)     // Catch:{ all -> 0x13ce }
            boolean r4 = r8.exists()     // Catch:{ all -> 0x13ce }
            boolean r3 = r8.canRead()     // Catch:{ all -> 0x13ce }
            boolean r2 = r8.canWrite()     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = "exists="
            r6.append(r1)     // Catch:{ all -> 0x13ce }
            r6.append(r4)     // Catch:{ all -> 0x13ce }
            r6.append(r5)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = "canRead="
            r6.append(r1)     // Catch:{ all -> 0x13ce }
            r6.append(r3)     // Catch:{ all -> 0x13ce }
            r6.append(r5)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = "canWrite="
            r6.append(r1)     // Catch:{ all -> 0x13ce }
            r6.append(r2)     // Catch:{ all -> 0x13ce }
            r6.append(r5)     // Catch:{ all -> 0x13ce }
            if (r4 == 0) goto L_0x12d3
            java.lang.String r1 = "length="
            r6.append(r1)     // Catch:{ all -> 0x13ce }
            long r1 = r8.length()     // Catch:{ all -> 0x13ce }
            r6.append(r1)     // Catch:{ all -> 0x13ce }
            r6.append(r5)     // Catch:{ all -> 0x13ce }
        L_0x12d3:
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x13ce }
            r7.append(r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x13ce }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r2 = "input file missing after transcode"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x13ce }
            r1.<init>(r2)     // Catch:{ all -> 0x13ce }
            throw r1     // Catch:{ all -> 0x13ce }
        L_0x12e9:
            X.1xB r1 = new X.1xB     // Catch:{ all -> 0x13ce }
            r1.<init>()     // Catch:{ all -> 0x13ce }
            throw r1     // Catch:{ all -> 0x13ce }
        L_0x12ef:
            r2 = move-exception
            java.lang.String r1 = "videotranscoder/transcode"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x12f7 }
            throw r2     // Catch:{ all -> 0x12f7 }
        L_0x12f7:
            r5 = move-exception
            r13.stop()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r50)     // Catch:{ all -> 0x13a6 }
            r13.release()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r52)     // Catch:{ all -> 0x13a6 }
            r4 = r43
            r3 = r28
            r2 = r46
            r1 = r27
            A05(r4, r2, r3, r1)     // Catch:{ all -> 0x13a6 }
            r46.stop()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r47)     // Catch:{ all -> 0x13a6 }
            r46.release()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r48)     // Catch:{ all -> 0x13a6 }
            r44.release()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.i((java.lang.String) r49)     // Catch:{ all -> 0x13a6 }
            com.whatsapp.VideoFrameConverter.release(r41)     // Catch:{ all -> 0x13a6 }
            throw r5     // Catch:{ all -> 0x13a6 }
        L_0x1325:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a6 }
            r1.<init>()     // Catch:{ all -> 0x13a6 }
            r1.append(r6)     // Catch:{ all -> 0x13a6 }
            r1.append(r11)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a6 }
            r2.<init>()     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = "Can't create decoder for "
            r2.append(r1)     // Catch:{ all -> 0x13a6 }
            r2.append(r11)     // Catch:{ all -> 0x13a6 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x13a6 }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x13a6 }
            r1.<init>(r2)     // Catch:{ all -> 0x13a6 }
            throw r1     // Catch:{ all -> 0x13a6 }
        L_0x134e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a6 }
            r1.<init>()     // Catch:{ all -> 0x13a6 }
            r1.append(r6)     // Catch:{ all -> 0x13a6 }
            r1.append(r11)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            X.1xB r1 = new X.1xB     // Catch:{ all -> 0x13a6 }
            r1.<init>()     // Catch:{ all -> 0x13a6 }
            throw r1     // Catch:{ all -> 0x13a6 }
        L_0x1366:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a6 }
            r1.<init>()     // Catch:{ all -> 0x13a6 }
            r1.append(r6)     // Catch:{ all -> 0x13a6 }
            r1.append(r11)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x13a6 }
            X.1xB r1 = new X.1xB     // Catch:{ all -> 0x13a6 }
            r1.<init>()     // Catch:{ all -> 0x13a6 }
            throw r1     // Catch:{ all -> 0x13a6 }
        L_0x137f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a6 }
            r2.<init>()     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = "videotranscoder/transcode/mime "
            r2.append(r1)     // Catch:{ all -> 0x13a6 }
            r2.append(r11)     // Catch:{ all -> 0x13a6 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x13a6 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            X.1xB r1 = new X.1xB     // Catch:{ all -> 0x13a6 }
            r1.<init>()     // Catch:{ all -> 0x13a6 }
            throw r1     // Catch:{ all -> 0x13a6 }
        L_0x139a:
            java.lang.String r1 = "videotranscoder/transcode/not a video file"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x13a6 }
            X.1xB r1 = new X.1xB     // Catch:{ all -> 0x13a6 }
            r1.<init>()     // Catch:{ all -> 0x13a6 }
            throw r1     // Catch:{ all -> 0x13a6 }
        L_0x13a6:
            r1 = move-exception
            if (r28 == 0) goto L_0x13ac
            r28.close()     // Catch:{ all -> 0x13ac }
        L_0x13ac:
            throw r1     // Catch:{ all -> 0x13ad }
        L_0x13ad:
            r1 = move-exception
            r45.close()     // Catch:{ all -> 0x13b1 }
        L_0x13b1:
            throw r1     // Catch:{ all -> 0x13ce }
        L_0x13b2:
            java.lang.String r1 = "videotranscoder/transcode/no known color formats suported"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r2 = "No known color formats suported"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x13ce }
            r1.<init>(r2)     // Catch:{ all -> 0x13ce }
            throw r1     // Catch:{ all -> 0x13ce }
        L_0x13c0:
            java.lang.String r1 = "videotranscoder/transcode/no codec supporting video/avc"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x13ce }
            java.lang.String r2 = "No codec supporting video/avc"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x13ce }
            r1.<init>(r2)     // Catch:{ all -> 0x13ce }
            throw r1     // Catch:{ all -> 0x13ce }
        L_0x13ce:
            r2 = move-exception
            java.io.File r1 = r0.A09
            X.AnonymousClass1XI.A0N(r1)
            java.io.File r0 = r0.A07
            if (r0 == 0) goto L_0x13db
            X.AnonymousClass1XI.A0N(r0)
        L_0x13db:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43291zl.A0A():void");
    }

    public void A0B() {
        try {
            File file = this.A08;
            File file2 = this.A0J;
            long j2 = this.A0D;
            long j3 = this.A0E;
            StringBuilder sb = new StringBuilder("mp4ops/trim/start from ");
            sb.append(j2);
            sb.append(" to ");
            sb.append(j3);
            sb.append(" size:");
            sb.append(file.length());
            Log.i(sb.toString());
            if ((j2 > 0 || j3 > 0) && j2 != j3) {
                float f2 = ((float) j2) / 1000.0f;
                Mp4Ops.LibMp4OperationResult mp4mux = Mp4Ops.mp4mux(file.getAbsolutePath(), file.getAbsolutePath(), file2.getAbsolutePath(), -1.0f, f2, ((float) (j3 - j2)) / 1000.0f, -1.0f, -1, file.getAbsolutePath(), f2);
                StringBuilder sb2 = new StringBuilder("mp4ops/trim/result: ");
                sb2.append(mp4mux.success);
                Log.i(sb2.toString());
                if (!mp4mux.success) {
                    StringBuilder sb3 = new StringBuilder("mp4ops/trim/error_message/");
                    sb3.append(mp4mux.errorMessage);
                    Log.e(sb3.toString());
                    if (mp4mux.ioException) {
                        throw new IOException("No space");
                    }
                    StringBuilder sb4 = new StringBuilder("invalid result, error_code: ");
                    int i2 = mp4mux.errorCode;
                    sb4.append(i2);
                    throw new AnonymousClass20O(i2, sb4.toString());
                }
                Log.i("mp4ops/trim/finished: size");
                Mp4Ops.A03(file2, true);
                return;
            }
            StringBuilder sb5 = new StringBuilder("timeFrom:");
            sb5.append(j2);
            sb5.append(" timeTo:");
            sb5.append(j3);
            throw new IllegalArgumentException(sb5.toString());
        } catch (Error e2) {
            Log.e("mp4ops/trim/failed: mp4mux error, exiting", e2);
            throw new AnonymousClass20O(0, e2.getMessage());
        } catch (AnonymousClass20O e3) {
            Log.e("videotranscodequeue/libmp4muxexception", e3);
            throw e3;
        }
    }

    public boolean AHe() {
        return this.A09 != null;
    }

    public void cancel() {
        this.A0K = true;
    }
}
