package X;

import android.media.AudioRecord;
import com.obwhatsapp.audioRecording.AudioRecordFactory;
import com.obwhatsapp.audioRecording.OpusRecorderFactory;
import com.whatsapp.util.Log;
import com.whatsapp.util.OpusRecorder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.1cz  reason: invalid class name and case insensitive filesystem */
public class C30811cz {
    public long A00;
    public long A01;
    public FileOutputStream A02;
    public boolean A03;
    public final AudioRecord A04;
    public final C16440t3 A05;
    public final OpusRecorder A06;
    public final AnonymousClass1ZM A07;
    public final File A08;
    public final File A09;
    public final boolean A0A;
    public final short[] A0B;

    public C30811cz(AudioRecordFactory audioRecordFactory, OpusRecorderFactory opusRecorderFactory, C16440t3 r7, C14710pd r8, AnonymousClass1ZM r9, String str) {
        this.A05 = r7;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".opus");
        String obj = sb.toString();
        this.A08 = new File(obj);
        this.A07 = r9;
        this.A06 = opusRecorderFactory.createOpusRecorder(obj);
        this.A0A = r8.A0E(C16620tM.A02, 1139);
        int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
        this.A04 = audioRecordFactory.createAudioRecord(44100, minBufferSize);
        this.A0B = new short[(((minBufferSize == -1 || minBufferSize == -2) ? 88200 : minBufferSize) / 2)];
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("Visualization.data");
        String obj2 = sb2.toString();
        File file = new File(obj2);
        this.A09 = file;
        try {
            if (file.createNewFile()) {
                this.A02 = new FileOutputStream(file);
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("voicerecorder/unable to create visualization file; visualizationPath=");
            sb3.append(obj2);
            Log.w(sb3.toString());
        } catch (IOException e2) {
            Log.e("voicerecorder/error creating visualization file ", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0085 A[Catch:{ IOException -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A00() {
        /*
            r8 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r7 = 0
            r0 = 23
            android.media.AudioRecord r2 = r8.A04
            short[] r6 = r8.A0B
            int r1 = r6.length
            if (r3 < r0) goto L_0x0059
            r0 = 1
            int r5 = r2.read(r6, r7, r1, r0)
        L_0x0011:
            r3 = 0
            if (r5 <= 0) goto L_0x003b
            r8.A00 = r3
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x0030
            r8.A03 = r7
            r0 = 25
        L_0x001f:
            com.facebook.redex.RunnableRunnableShape16S0100000_I0_15 r2 = new com.facebook.redex.RunnableRunnableShape16S0100000_I0_15
            r2.<init>(r8, r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r0.post(r2)
        L_0x0030:
            r1 = 0
        L_0x0031:
            if (r7 >= r5) goto L_0x005e
            short r0 = r6[r7]
            if (r0 <= r1) goto L_0x0038
            r1 = r0
        L_0x0038:
            int r7 = r7 + 1
            goto L_0x0031
        L_0x003b:
            long r1 = r8.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            long r3 = android.os.SystemClock.elapsedRealtime()
            if (r0 != 0) goto L_0x0048
            r8.A00 = r3
            goto L_0x0030
        L_0x0048:
            long r3 = r3 - r1
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0030
            boolean r0 = r8.A03
            if (r0 != 0) goto L_0x0030
            r0 = 1
            r8.A03 = r0
            r0 = 26
            goto L_0x001f
        L_0x0059:
            int r5 = r2.read(r6, r7, r1)
            goto L_0x0011
        L_0x005e:
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x0067
            if (r5 != 0) goto L_0x0067
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0066:
            return r2
        L_0x0067:
            r4 = 0
            double r0 = (double) r1
            double r2 = java.lang.Math.log(r0)
            r0 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r2 = r2 * r0
            r0 = 4609797659283161088(0x3ff94a8c20000000, double:1.5807000398635864)
            double r2 = r2 - r0
            float r1 = (float) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r1, r0)
            float r2 = java.lang.Math.max(r4, r0)
            java.io.FileOutputStream r1 = r8.A02     // Catch:{ IOException -> 0x008d }
            if (r1 == 0) goto L_0x0066
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r2
            int r0 = (int) r0     // Catch:{ IOException -> 0x008d }
            r1.write(r0)     // Catch:{ IOException -> 0x008d }
            return r2
        L_0x008d:
            r1 = move-exception
            java.lang.String r0 = "voicerecorder/getandstorevisualizationvalue/ error writing visualization file data "
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30811cz.A00():float");
    }

    public void A01() {
        this.A04.stop();
        this.A00 = 0;
        this.A03 = false;
        this.A07.A84();
    }
}
