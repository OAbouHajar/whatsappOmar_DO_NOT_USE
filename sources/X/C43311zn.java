package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.support.v4.view.MotionEventCompat;
import com.whatsapp.util.Log;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: X.1zn  reason: invalid class name and case insensitive filesystem */
public class C43311zn implements C43301zm {
    public static final int[] A09 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000};
    public int A00;
    public C108835Pr A01;
    public ByteBuffer[] A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final File A06;
    public final File A07;
    public volatile boolean A08;

    public C43311zn(AnonymousClass4NM r3) {
        this.A06 = r3.A03;
        this.A04 = r3.A01;
        this.A05 = r3.A02;
        this.A07 = r3.A04;
        this.A03 = r3.A00;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0027 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0027=Splitter:B:16:0x0027, B:10:0x001f=Splitter:B:10:0x001f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(java.io.File r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L_0x002e
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x002e
            X.1wq r2 = new X.1wq     // Catch:{ Exception -> 0x0028 }
            r2.<init>()     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ all -> 0x0023 }
            r2.setDataSource(r0)     // Catch:{ all -> 0x0023 }
            r0 = 16
            java.lang.String r1 = r2.extractMetadata(r0)     // Catch:{ all -> 0x0023 }
            r0 = 0
            if (r1 == 0) goto L_0x001f
            r0 = 1
        L_0x001f:
            r2.close()     // Catch:{ Exception -> 0x0028 }
            return r0
        L_0x0023:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r0     // Catch:{ Exception -> 0x0028 }
        L_0x0028:
            r1 = move-exception
            java.lang.String r0 = "audiotranscoder/cantranscode"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43311zn.A00(java.io.File):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03df, code lost:
        if (r3.A01.AVN(r6) != false) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0256, code lost:
        if (r2.getInteger("bit-width") != 24) goto L_0x0258;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x04e1 */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03ea A[Catch:{ all -> 0x0481, all -> 0x04db }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0444 A[Catch:{ all -> 0x0481, all -> 0x04db }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0420 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x022e A[Catch:{ all -> 0x0481, all -> 0x04db }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r50 = this;
            java.lang.String r40 = "pcm-encoding"
            java.lang.String r39 = "channel-count"
            java.lang.String r38 = "sample-rate"
            java.lang.String r37 = "bit-width"
            java.lang.String r4 = "audiotranscoder/can't create decoder for "
            java.lang.String r6 = "durationUs"
            java.lang.String r0 = "audiotranscoder/bitrate:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r3 = r50
            int r0 = r3.A03
            r49 = r0
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.media.MediaExtractor r9 = new android.media.MediaExtractor
            r9.<init>()
            java.io.File r0 = r3.A06
            java.lang.String r0 = r0.getAbsolutePath()
            r9.setDataSource(r0)
            int r10 = r9.getTrackCount()
            java.lang.String r1 = "audiotranscoder/Number of tracks:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = 0
        L_0x0048:
            java.lang.String r5 = "mime"
            if (r7 >= r10) goto L_0x04e7
            android.media.MediaFormat r8 = r9.getTrackFormat(r7)
            java.lang.String r2 = r8.getString(r5)
            java.lang.String r0 = "audiotranscoder/track:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = "mime:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " format:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "audio"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x008b
            if (r7 < 0) goto L_0x04e7
            java.io.File r0 = r3.A07
            r48 = r0
            java.io.FileOutputStream r36 = new java.io.FileOutputStream
            r1 = r36
            r1.<init>(r0)
            goto L_0x008e
        L_0x008b:
            int r7 = r7 + 1
            goto L_0x0048
        L_0x008e:
            java.nio.channels.FileChannel r12 = r36.getChannel()     // Catch:{ all -> 0x04e2 }
            int r13 = android.media.MediaCodecList.getCodecCount()     // Catch:{ all -> 0x04db }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04db }
            r1.<init>()     // Catch:{ all -> 0x04db }
            java.lang.String r0 = "audiotranscoder/number of codecs: "
            r1.append(r0)     // Catch:{ all -> 0x04db }
            r1.append(r13)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04db }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04db }
            r11 = 0
            r35 = 0
        L_0x00ad:
            java.lang.String r34 = "audio/mp4a-latm"
            if (r11 >= r13) goto L_0x00dd
            if (r35 != 0) goto L_0x00e1
            android.media.MediaCodecInfo r14 = android.media.MediaCodecList.getCodecInfoAt(r11)     // Catch:{ all -> 0x04db }
            boolean r0 = r14.isEncoder()     // Catch:{ all -> 0x04db }
            if (r0 == 0) goto L_0x00da
            java.lang.String[] r10 = r14.getSupportedTypes()     // Catch:{ all -> 0x04db }
            r8 = 0
            r2 = 0
        L_0x00c3:
            int r0 = r10.length     // Catch:{ all -> 0x04db }
            if (r8 >= r0) goto L_0x00d6
            if (r2 != 0) goto L_0x00d8
            r1 = r10[r8]     // Catch:{ all -> 0x04db }
            r0 = r34
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04db }
            if (r0 == 0) goto L_0x00d3
            r2 = 1
        L_0x00d3:
            int r8 = r8 + 1
            goto L_0x00c3
        L_0x00d6:
            if (r2 == 0) goto L_0x00da
        L_0x00d8:
            r35 = r14
        L_0x00da:
            int r11 = r11 + 1
            goto L_0x00ad
        L_0x00dd:
            if (r35 != 0) goto L_0x00e1
            goto L_0x04cb
        L_0x00e1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04db }
            r1.<init>()     // Catch:{ all -> 0x04db }
            java.lang.String r0 = "audiotranscoder/found "
            r1.append(r0)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = r35.getName()     // Catch:{ all -> 0x04db }
            r1.append(r0)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = " supporting "
            r1.append(r0)     // Catch:{ all -> 0x04db }
            r0 = r34
            r1.append(r0)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04db }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04db }
            android.media.MediaFormat r2 = r9.getTrackFormat(r7)     // Catch:{ all -> 0x04db }
            java.lang.String r5 = r2.getString(r5)     // Catch:{ all -> 0x04db }
            r9.selectTrack(r7)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x04db }
            if (r0 != 0) goto L_0x011e
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x04db }
            if (r0 == 0) goto L_0x0143
        L_0x011e:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x04db }
            r0 = 28
            if (r1 < r0) goto L_0x013c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x04db }
            r7.<init>()     // Catch:{ all -> 0x04db }
            java.lang.String r0 = "audiotranscoder/first sample size: "
            r7.append(r0)     // Catch:{ all -> 0x04db }
            long r0 = r9.getSampleSize()     // Catch:{ all -> 0x04db }
            r7.append(r0)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x04db }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04db }
        L_0x013c:
            java.lang.String r1 = "max-input-size"
            r0 = 16384(0x4000, float:2.2959E-41)
            r2.setInteger(r1, r0)     // Catch:{ all -> 0x04db }
        L_0x0143:
            boolean r0 = r2.containsKey(r6)     // Catch:{ all -> 0x04db }
            if (r0 == 0) goto L_0x016c
            long r20 = r2.getLong(r6)     // Catch:{ all -> 0x04db }
        L_0x014d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04db }
            r1.<init>()     // Catch:{ all -> 0x04db }
            java.lang.String r0 = "audiotranscoder/decoder format:"
            r1.append(r0)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x04db }
            r1.append(r0)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04db }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04db }
            r0 = 0
            r3.A02 = r0     // Catch:{ all -> 0x04db }
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x04db }
            goto L_0x016f
        L_0x016c:
            r20 = 0
            goto L_0x014d
        L_0x016f:
            android.media.MediaCodec r11 = android.media.MediaCodec.createDecoderByType(r5)     // Catch:{ IllegalArgumentException -> 0x04af }
            java.lang.String r0 = "audiotranscoder/decoder created"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04db }
            if (r11 == 0) goto L_0x0494
            java.lang.String r0 = r35.getName()     // Catch:{ all -> 0x04db }
            android.media.MediaCodec r10 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = "audiotranscoder/encoder created"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04db }
            r1 = 0
            r0 = 0
            r11.configure(r2, r0, r0, r1)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = "audiotranscoder/decoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04db }
            r11.start()     // Catch:{ all -> 0x04db }
            java.lang.String r0 = "audiotranscoder/decoder started"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04db }
            java.nio.ByteBuffer[] r33 = r11.getInputBuffers()     // Catch:{ all -> 0x04db }
            java.nio.ByteBuffer[] r32 = r11.getOutputBuffers()     // Catch:{ all -> 0x04db }
            android.media.MediaCodec$BufferInfo r1 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x04db }
            r1.<init>()     // Catch:{ all -> 0x04db }
            android.media.MediaCodec$BufferInfo r31 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x04db }
            r31.<init>()     // Catch:{ all -> 0x04db }
            long r4 = r3.A04     // Catch:{ all -> 0x04db }
            r16 = r4
            r18 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01dd
            long r4 = r16 * r18
            r0 = 0
            r9.seekTo(r4, r0)     // Catch:{ all -> 0x04db }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04db }
            r0.<init>()     // Catch:{ all -> 0x04db }
            java.lang.String r6 = "audiotranscoder/seek to:"
            r0.append(r6)     // Catch:{ all -> 0x04db }
            r0.append(r4)     // Catch:{ all -> 0x04db }
            java.lang.String r4 = " actual:"
            r0.append(r4)     // Catch:{ all -> 0x04db }
            long r4 = r9.getSampleTime()     // Catch:{ all -> 0x04db }
            r0.append(r4)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04db }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04db }
        L_0x01dd:
            r0 = 7
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x04db }
            r30 = 0
            r29 = 0
            r28 = 0
            r27 = 0
            r13 = 0
        L_0x01e9:
            boolean r4 = r3.A08     // Catch:{ all -> 0x0481 }
            if (r4 != 0) goto L_0x0425
            r4 = 0
            int r42 = r11.dequeueInputBuffer(r4)     // Catch:{ all -> 0x0481 }
            if (r42 < 0) goto L_0x0223
            r5 = r33[r42]     // Catch:{ all -> 0x0481 }
            r4 = 0
            int r44 = r9.readSampleData(r5, r4)     // Catch:{ all -> 0x0481 }
            if (r44 >= 0) goto L_0x0213
            java.lang.String r4 = "audiotranscoder/extractor BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0481 }
            r45 = 0
            r47 = 4
            r43 = 0
            r44 = 0
            r41 = r11
            r41.queueInputBuffer(r42, r43, r44, r45, r47)     // Catch:{ all -> 0x0481 }
            r26 = 1
            goto L_0x0225
        L_0x0213:
            long r45 = r9.getSampleTime()     // Catch:{ all -> 0x0481 }
            r43 = 0
            r47 = 0
            r41 = r11
            r41.queueInputBuffer(r42, r43, r44, r45, r47)     // Catch:{ all -> 0x0481 }
            r9.advance()     // Catch:{ all -> 0x0481 }
        L_0x0223:
            r26 = 0
        L_0x0225:
            r4 = 1000000(0xf4240, double:4.940656E-318)
            int r8 = r11.dequeueOutputBuffer(r1, r4)     // Catch:{ all -> 0x0481 }
            if (r8 < 0) goto L_0x03ea
            long r4 = r1.presentationTimeUs     // Catch:{ all -> 0x0481 }
            long r22 = r16 * r18
            int r6 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r6 < 0) goto L_0x03e7
            if (r29 != 0) goto L_0x032d
            java.lang.String r5 = r35.getName()     // Catch:{ all -> 0x0481 }
            java.lang.String r4 = "OMX.google"
            boolean r4 = r5.startsWith(r4)     // Catch:{ all -> 0x0481 }
            if (r4 == 0) goto L_0x0258
            r4 = r37
            boolean r4 = r2.containsKey(r4)     // Catch:{ all -> 0x0481 }
            if (r4 == 0) goto L_0x0258
            r4 = r37
            int r5 = r2.getInteger(r4)     // Catch:{ all -> 0x0481 }
            r4 = 24
            r28 = 1
            if (r5 == r4) goto L_0x025a
        L_0x0258:
            r28 = 0
        L_0x025a:
            r4 = r38
            int r14 = r2.getInteger(r4)     // Catch:{ all -> 0x0481 }
            r4 = r39
            int r7 = r2.getInteger(r4)     // Catch:{ all -> 0x0481 }
            r4 = r40
            boolean r4 = r2.containsKey(r4)     // Catch:{ all -> 0x0481 }
            if (r4 == 0) goto L_0x029a
            r4 = r40
            int r6 = r2.getInteger(r4)     // Catch:{ all -> 0x0481 }
        L_0x0274:
            r4 = r34
            android.media.MediaFormat r5 = android.media.MediaFormat.createAudioFormat(r4, r14, r7)     // Catch:{ all -> 0x0481 }
            java.lang.String r15 = "bitrate"
            r4 = r49
            r5.setInteger(r15, r4)     // Catch:{ all -> 0x0481 }
            r4 = r38
            r5.setInteger(r4, r14)     // Catch:{ all -> 0x0481 }
            r4 = r39
            r5.setInteger(r4, r7)     // Catch:{ all -> 0x0481 }
            java.lang.String r7 = "aac-profile"
            r4 = 2
            r5.setInteger(r7, r4)     // Catch:{ all -> 0x0481 }
            java.lang.String r7 = "max-input-size"
            r4 = 64000(0xfa00, float:8.9683E-41)
            r5.setInteger(r7, r4)     // Catch:{ all -> 0x0481 }
            goto L_0x029c
        L_0x029a:
            r6 = 0
            goto L_0x0274
        L_0x029c:
            if (r6 == 0) goto L_0x02a3
            r4 = r40
            r5.setInteger(r4, r6)     // Catch:{ all -> 0x0481 }
        L_0x02a3:
            java.lang.String r6 = "audiotranscoder/configuring encoder with output format "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0481 }
            r4.<init>(r6)     // Catch:{ all -> 0x0481 }
            r4.append(r5)     // Catch:{ all -> 0x0481 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0481 }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0481 }
            r14 = 1
            r4 = 0
            r10.configure(r5, r4, r4, r14)     // Catch:{ all -> 0x0481 }
            java.lang.String r4 = "audiotranscoder/encoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0481 }
            r4 = r38
            int r7 = r2.getInteger(r4)     // Catch:{ all -> 0x0481 }
            r4 = r39
            int r6 = r2.getInteger(r4)     // Catch:{ all -> 0x0481 }
            r4 = -1
            r15 = 0
            r0[r15] = r4     // Catch:{ all -> 0x0481 }
            r4 = -15
            r0[r14] = r4     // Catch:{ all -> 0x0481 }
            r14 = 0
        L_0x02d3:
            int[] r5 = A09     // Catch:{ all -> 0x0481 }
            int r4 = r5.length     // Catch:{ all -> 0x0481 }
            if (r14 >= r4) goto L_0x02df
            r4 = r5[r14]     // Catch:{ all -> 0x0481 }
            if (r7 == r4) goto L_0x02f6
            int r14 = r14 + 1
            goto L_0x02d3
        L_0x02df:
            java.lang.String r4 = "audiotranscoder/sampling rate "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0481 }
            r5.<init>(r4)     // Catch:{ all -> 0x0481 }
            r5.append(r7)     // Catch:{ all -> 0x0481 }
            java.lang.String r4 = " bps is not supported"
            r5.append(r4)     // Catch:{ all -> 0x0481 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0481 }
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ all -> 0x0481 }
            r14 = 0
        L_0x02f6:
            byte r4 = (byte) r14     // Catch:{ all -> 0x0481 }
            byte r5 = (byte) r6     // Catch:{ all -> 0x0481 }
            r6 = 64
            r7 = 2
            r0[r7] = r6     // Catch:{ all -> 0x0481 }
            int r4 = r4 << r7
            r4 = r4 | 64
            byte r4 = (byte) r4     // Catch:{ all -> 0x0481 }
            r0[r7] = r4     // Catch:{ all -> 0x0481 }
            int r6 = r5 >> 2
            r4 = r4 | r6
            byte r4 = (byte) r4     // Catch:{ all -> 0x0481 }
            r0[r7] = r4     // Catch:{ all -> 0x0481 }
            r6 = 3
            r4 = r5 & 3
            r5 = 6
            int r4 = r4 << r5
            byte r4 = (byte) r4     // Catch:{ all -> 0x0481 }
            r0[r6] = r4     // Catch:{ all -> 0x0481 }
            r4 = 4
            r0[r4] = r15     // Catch:{ all -> 0x0481 }
            r4 = 5
            r0[r4] = r15     // Catch:{ all -> 0x0481 }
            r4 = -4
            r0[r5] = r4     // Catch:{ all -> 0x0481 }
            r10.start()     // Catch:{ all -> 0x0481 }
            java.nio.ByteBuffer[] r27 = r10.getInputBuffers()     // Catch:{ all -> 0x0481 }
            java.nio.ByteBuffer[] r4 = r10.getOutputBuffers()     // Catch:{ all -> 0x0481 }
            r3.A02 = r4     // Catch:{ all -> 0x0481 }
            r4 = 1000000(0xf4240, double:4.940656E-318)
            r29 = 1
            goto L_0x0330
        L_0x032d:
            r4 = 1000000(0xf4240, double:4.940656E-318)
        L_0x0330:
            int r6 = r10.dequeueInputBuffer(r4)     // Catch:{ all -> 0x0481 }
            r7 = -1
        L_0x0335:
            if (r6 != r7) goto L_0x0341
            r6 = r31
            r3.A02(r6, r10, r12, r0)     // Catch:{ all -> 0x0481 }
            int r6 = r10.dequeueInputBuffer(r4)     // Catch:{ all -> 0x0481 }
            goto L_0x0335
        L_0x0341:
            if (r6 < 0) goto L_0x0411
            r7 = r27[r6]     // Catch:{ all -> 0x0481 }
            r14 = r32[r8]     // Catch:{ all -> 0x0481 }
            int r4 = r1.offset     // Catch:{ all -> 0x0481 }
            r14.position(r4)     // Catch:{ all -> 0x0481 }
            int r5 = r1.offset     // Catch:{ all -> 0x0481 }
            int r4 = r1.size     // Catch:{ all -> 0x0481 }
            int r5 = r5 + r4
            r14.limit(r5)     // Catch:{ all -> 0x0481 }
            r7.clear()     // Catch:{ all -> 0x0481 }
            if (r28 == 0) goto L_0x036e
            r15 = 0
        L_0x035a:
            boolean r4 = r14.hasRemaining()     // Catch:{ all -> 0x0481 }
            if (r4 == 0) goto L_0x0374
            byte r4 = r14.get()     // Catch:{ all -> 0x0481 }
            int r5 = r15 % 3
            if (r5 == 0) goto L_0x036b
            r7.put(r4)     // Catch:{ all -> 0x0481 }
        L_0x036b:
            int r15 = r15 + 1
            goto L_0x035a
        L_0x036e:
            r7.put(r14)     // Catch:{ all -> 0x0481 }
            int r7 = r1.size     // Catch:{ all -> 0x0481 }
            goto L_0x037a
        L_0x0374:
            int r4 = r1.size     // Catch:{ all -> 0x0481 }
            int r4 = r4 << 1
            int r7 = r4 / 3
        L_0x037a:
            r43 = 0
            long r4 = r1.presentationTimeUs     // Catch:{ all -> 0x0481 }
            int r15 = r1.flags     // Catch:{ all -> 0x0481 }
            r41 = r10
            r42 = r6
            r44 = r7
            r45 = r4
            r47 = r15
            r41.queueInputBuffer(r42, r43, r44, r45, r47)     // Catch:{ all -> 0x0481 }
            int r4 = r1.offset     // Catch:{ all -> 0x0481 }
            r14.position(r4)     // Catch:{ all -> 0x0481 }
            int r5 = r1.offset     // Catch:{ all -> 0x0481 }
            int r4 = r1.size     // Catch:{ all -> 0x0481 }
            int r5 = r5 + r4
            r14.limit(r5)     // Catch:{ all -> 0x0481 }
            long r6 = r3.A05     // Catch:{ all -> 0x0481 }
            r14 = 0
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x03ac
            long r4 = r1.presentationTimeUs     // Catch:{ all -> 0x0481 }
            long r24 = r6 * r18
            int r14 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r14 <= 0) goto L_0x03ac
            r26 = 1
        L_0x03ac:
            r14 = 0
            int r4 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0411
            X.5Pr r4 = r3.A01     // Catch:{ all -> 0x0481 }
            if (r4 == 0) goto L_0x0411
            int r4 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x03bc
            r22 = 0
        L_0x03bc:
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x03c3
            r6 = r20
            goto L_0x03c5
        L_0x03c3:
            long r6 = r6 * r18
        L_0x03c5:
            long r4 = r1.presentationTimeUs     // Catch:{ all -> 0x0481 }
            long r4 = r4 - r22
            r14 = 100
            long r4 = r4 * r14
            long r6 = r6 - r22
            long r4 = r4 / r6
            int r6 = (int) r4     // Catch:{ all -> 0x0481 }
            r4 = r30
            if (r6 == r4) goto L_0x0411
            boolean r4 = r3.A08     // Catch:{ all -> 0x0481 }
            if (r4 != 0) goto L_0x03e1
            X.5Pr r4 = r3.A01     // Catch:{ all -> 0x0481 }
            boolean r5 = r4.AVN(r6)     // Catch:{ all -> 0x0481 }
            r4 = 0
            if (r5 == 0) goto L_0x03e2
        L_0x03e1:
            r4 = 1
        L_0x03e2:
            r3.A08 = r4     // Catch:{ all -> 0x0481 }
            r30 = r6
            goto L_0x0411
        L_0x03e7:
            int r13 = r13 + 1
            goto L_0x0416
        L_0x03ea:
            r4 = -3
            if (r8 != r4) goto L_0x03ee
            goto L_0x0407
        L_0x03ee:
            r4 = -2
            if (r8 != r4) goto L_0x041a
            android.media.MediaFormat r2 = r11.getOutputFormat()     // Catch:{ all -> 0x0481 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0481 }
            r5.<init>()     // Catch:{ all -> 0x0481 }
            java.lang.String r4 = "audiotranscoder/decoder output format has changed to "
            r5.append(r4)     // Catch:{ all -> 0x0481 }
            r5.append(r2)     // Catch:{ all -> 0x0481 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0481 }
            goto L_0x040d
        L_0x0407:
            java.nio.ByteBuffer[] r32 = r11.getOutputBuffers()     // Catch:{ all -> 0x0481 }
            java.lang.String r4 = "audiotranscoder/decoder output buffers have changed."
        L_0x040d:
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0481 }
            goto L_0x041a
        L_0x0411:
            r4 = r31
            r3.A02(r4, r10, r12, r0)     // Catch:{ all -> 0x0481 }
        L_0x0416:
            r4 = 0
            r11.releaseOutputBuffer(r8, r4)     // Catch:{ all -> 0x0481 }
        L_0x041a:
            int r4 = r1.flags     // Catch:{ all -> 0x0481 }
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0444
            java.lang.String r0 = "audiotranscoder/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0481 }
        L_0x0425:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0481 }
            r1.<init>()     // Catch:{ all -> 0x0481 }
            java.lang.String r0 = "audiotranscoder/processed frames:"
            r1.append(r0)     // Catch:{ all -> 0x0481 }
            int r0 = r3.A00     // Catch:{ all -> 0x0481 }
            r1.append(r0)     // Catch:{ all -> 0x0481 }
            java.lang.String r0 = " skipped:"
            r1.append(r0)     // Catch:{ all -> 0x0481 }
            r1.append(r13)     // Catch:{ all -> 0x0481 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0481 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0481 }
            goto L_0x0448
        L_0x0444:
            if (r26 != 0) goto L_0x0425
            goto L_0x01e9
        L_0x0448:
            r11.stop()     // Catch:{ all -> 0x04db }
            r11.release()     // Catch:{ all -> 0x04db }
            if (r29 == 0) goto L_0x0453
            r10.stop()     // Catch:{ all -> 0x04db }
        L_0x0453:
            r10.release()     // Catch:{ all -> 0x04db }
            r9.release()     // Catch:{ all -> 0x04db }
            if (r12 == 0) goto L_0x045e
            r12.close()     // Catch:{ all -> 0x04e2 }
        L_0x045e:
            r36.close()
            java.lang.String r0 = "audiotranscoder finished cancelled:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            boolean r0 = r3.A08
            r2.append(r0)
            java.lang.String r0 = " output:"
            r2.append(r0)
            long r0 = r48.length()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0481:
            r1 = move-exception
            r11.stop()     // Catch:{ all -> 0x04db }
            r11.release()     // Catch:{ all -> 0x04db }
            if (r29 == 0) goto L_0x048d
            r10.stop()     // Catch:{ all -> 0x04db }
        L_0x048d:
            r10.release()     // Catch:{ all -> 0x04db }
            r9.release()     // Catch:{ all -> 0x04db }
            goto L_0x04da
        L_0x0494:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04db }
            r0.<init>()     // Catch:{ all -> 0x04db }
            r0.append(r4)     // Catch:{ all -> 0x04db }
            r0.append(r5)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04db }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04db }
            r9.release()     // Catch:{ all -> 0x04db }
            X.3yN r1 = new X.3yN     // Catch:{ all -> 0x04db }
            r1.<init>()     // Catch:{ all -> 0x04db }
            goto L_0x04da
        L_0x04af:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04db }
            r0.<init>()     // Catch:{ all -> 0x04db }
            r0.append(r4)     // Catch:{ all -> 0x04db }
            r0.append(r5)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04db }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04db }
            r9.release()     // Catch:{ all -> 0x04db }
            X.3yN r1 = new X.3yN     // Catch:{ all -> 0x04db }
            r1.<init>()     // Catch:{ all -> 0x04db }
            goto L_0x04da
        L_0x04cb:
            java.lang.String r0 = "audiotranscoder/ no codec supporting audio/mp4a-latm"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04db }
            r9.release()     // Catch:{ all -> 0x04db }
            java.lang.String r0 = "No codec supporting audio/mp4a-latm"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x04db }
            r1.<init>(r0)     // Catch:{ all -> 0x04db }
        L_0x04da:
            throw r1     // Catch:{ all -> 0x04db }
        L_0x04db:
            r0 = move-exception
            if (r12 == 0) goto L_0x04e1
            r12.close()     // Catch:{ all -> 0x04e1 }
        L_0x04e1:
            throw r0     // Catch:{ all -> 0x04e2 }
        L_0x04e2:
            r0 = move-exception
            r36.close()     // Catch:{ all -> 0x04e6 }
        L_0x04e6:
            throw r0
        L_0x04e7:
            java.lang.String r0 = "audiotranscoder/no audio tracks"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r9.release()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43311zn.A01():void");
    }

    public final void A02(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, WritableByteChannel writableByteChannel, byte[] bArr) {
        String obj;
        while (true) {
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -1) {
                return;
            }
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = this.A02[dequeueOutputBuffer];
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                if ((bufferInfo.flags & 2) == 0) {
                    this.A00++;
                    int i2 = (bufferInfo.size - bufferInfo.offset) + 7;
                    int i3 = (i2 >> 3) & MotionEventCompat.ACTION_MASK;
                    bArr[3] = (byte) (((i2 >> 11) & 3) | (bArr[3] & 252));
                    bArr[4] = (byte) i3;
                    bArr[5] = (byte) (((i2 & 7) << 5) | 31);
                    writableByteChannel.write(ByteBuffer.wrap(bArr));
                    writableByteChannel.write(byteBuffer);
                }
                byteBuffer.clear();
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else {
                if (dequeueOutputBuffer == -3) {
                    this.A02 = mediaCodec.getOutputBuffers();
                    obj = "audiotranscoder/encoder output buffers have changed";
                } else if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    StringBuilder sb = new StringBuilder("audiotranscoder/encoder output format has changed to ");
                    sb.append(outputFormat);
                    obj = sb.toString();
                }
                Log.i(obj);
            }
        }
    }

    public boolean AHe() {
        return true;
    }

    public void cancel() {
        this.A08 = true;
    }
}
